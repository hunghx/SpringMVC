package ra.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ra.springmvc.model.Todo;
import ra.springmvc.service.TodoService;

@Controller
@RequestMapping("/todoController")
public class TodoController {
    @Autowired
    private TodoService todoService;
    // list todonjhcdvchd
    @GetMapping("/list")
    public  String todo(Model model){
       model.addAttribute("list",todoService.findAll()) ;
       return "todo/todoList";
    }
    @GetMapping("/add")
    public  String todoAdd( ){
       return "todo/add";
    }
    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long idEdit){
        return new ModelAndView("todo/edit","todo_edit",todoService.findById(idEdit));
    };

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long idDel ){
        todoService.delete(idDel);
        return "redirect:/todoController/list";
    }
    @PostMapping("/update")
    public String update(@RequestParam("id") Long id,@RequestParam("title") String title,@RequestParam("content") String content,@RequestParam("status") Boolean status){
        todoService.save(new Todo(id,title,content,status));
        return "redirect:/todoController/list";
    }
    @PostMapping("/handle-add")
    public String handleAdd(@RequestParam("title") String title,@RequestParam("content") String content){
        todoService.save(new Todo(todoService.getNewId(),title,content,false));
        return "redirect:/todoController/list";
    }
}

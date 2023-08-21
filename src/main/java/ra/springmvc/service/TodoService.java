package ra.springmvc.service;

import org.springframework.stereotype.Service;
import ra.springmvc.model.Todo;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private List<Todo> todoList;

    public TodoService() {
        todoList = new ArrayList<>();
        todoList.add(new Todo(1L,"Đi học","đi học thêm Toán",false));
        todoList.add(new Todo(2L,"Làm bài tập","làm bài tập Vật Lý",false));
        todoList.add(new Todo(3L,"Thể thao","đi đá bóng",true));
    }

    public List<Todo> findAll(){
        return todoList;
    }
    public  Todo findById(Long id){
        for (Todo t:todoList
             ) {
            if(t.getId()==id)
                return t;
        }
        return null;
    }
    public void save(Todo todo){
       if(findById(todo.getId())==null){
           // chức năng thêm mới
           todoList.add(todo);
       }else {// sửa
            todoList.set(todoList.indexOf(findById(todo.getId())),todo);
       }
    }
    public  void delete(Long id){
        todoList.remove(findById(id));
    }
    public Long getNewId(){
        Long idMax =0L;
        for (Todo t:todoList
        ) {
            if(t.getId()>idMax)
                 idMax = t.getId();
        }
       return idMax+1;
    }
}

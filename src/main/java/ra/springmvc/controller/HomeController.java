package ra.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // để đinh nghĩa đây là 1 lớp controller
@RequestMapping("/") // định nghĩa 2 đuờng dẫn ứng với router
public class HomeController {
    @GetMapping(value = "/")
    public String home(Model model){
        model.addAttribute("user","hunghx");
        return "home";
    }
    @GetMapping(value = "/about")
    public ModelAndView about(){
        return new ModelAndView("about","massage","Đây là trang mô tả ");
    }
    @GetMapping(value = "/contact")
    public String contact(){
        return "contact";
    }
    @GetMapping(value = "/list-product")
    public String listProduct(){
        return "product";
    }
    @GetMapping(value = "/cart")
    public String cart(){
        return "cart";
    }
    // điều hướng sang 5 trang khác nhau, home, about, product, cart

}

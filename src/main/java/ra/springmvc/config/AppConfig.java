package ra.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//annotation
@Configuration // định nghĩa lớp cấu hình
@EnableWebMvc // cho phép sử dụng web mvc
@ComponentScan(basePackages = {"ra.springmvc.controller","ra.springmvc.service"})
public class AppConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return  resolver;
    }
}

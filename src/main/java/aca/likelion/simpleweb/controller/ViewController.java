package aca.likelion.simpleweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

    @GetMapping("/hello") // localhost:8080/hello?name=김멋사&age=20
    public String hello(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello"; // 매치되는 view 템플릿의 이름
    }

    @GetMapping("/sumPage")
    public String sumPage() {
        return "sum";
    }

    @GetMapping("/review")
    public String reviewPage() {
        return "review";
    }
}

package aca.likelion.simpleweb.controller;

import aca.likelion.simpleweb.controller.dto.SumRequest;
import aca.likelion.simpleweb.controller.dto.SumResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController // http 메시지 그대로 리턴
public class SumController {

    @GetMapping("/sum") // localhost:8080/sum?num1=10&num2=20
    public SumResponse sum(
            @RequestParam("num1") Long num1,
            @RequestParam("num2") Long num2
    ) {
        return new SumResponse(num1 + num2);
        /*
        {
            "sum": 30
        }
         */
    }

    @PostMapping("/sum")
    public SumResponse sum(
            @RequestBody SumRequest sumRequest
    ) {
        return new SumResponse(sumRequest.getNum1() + sumRequest.getNum2());
    }
}

package aca.likelion.simpleweb.controller.dto;

public class SumRequest {
    private Long num1;
    private Long num2;

    /*
        잭슨 직렬화를 위해 기본 생성자 추가
     */
    private SumRequest() {
    }

    public Long getNum1() {
        return num1;
    }

    public Long getNum2() {
        return num2;
    }
}

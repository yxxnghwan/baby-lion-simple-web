package aca.likelion.simpleweb.controller.dto;

public class SumResponse {

    /*
    Spring에서 채택하는 json 직렬화 라이브러리는 Jackson
    리플렉션: 자바 클래스나 메소드 등의 코드들의 메타정보를 다루는 자바 API
    reflection을 사용하고 기본 생성자를 호출해서 객체를 생성한다.
     */

    private Long sum;

    private SumResponse() {
    }

    public SumResponse(final Long sum) {
        this.sum = sum;
    }

    public Long getSum() {
        return sum;
    }
}

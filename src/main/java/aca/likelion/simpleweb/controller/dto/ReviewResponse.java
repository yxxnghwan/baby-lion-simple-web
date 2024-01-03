package aca.likelion.simpleweb.controller.dto;

public class ReviewResponse {

    private Long id;
    private String name;
    private String content;

    public ReviewResponse() {
    }

    public ReviewResponse(final Long id, final String name, final String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
}

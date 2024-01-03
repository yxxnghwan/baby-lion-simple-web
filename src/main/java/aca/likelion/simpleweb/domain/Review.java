package aca.likelion.simpleweb.domain;

public class Review {

    private Long id;
    private String name;
    private String content;

    public Review(final Long id, final String name, final String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public Review(final String name, final String content) {
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

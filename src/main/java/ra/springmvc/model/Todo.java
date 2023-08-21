package ra.springmvc.model;

public class Todo {
    private Long id;
    private  String title;
    private String content;
    private  boolean status;

    public Todo() {
    }

    public Todo(String title, String content, boolean status) {
        this.title = title;
        this.content = content;
        this.status = status;
    }

    public Todo(Long id, String title, String content, boolean status) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

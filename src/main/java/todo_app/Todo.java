package todo_app;

public class Todo {
    private Long id;
    private String title;
    private boolean completed;

    public Todo() {
    }

    public Todo(Long id, String title, boolean completed) {
    this.completed = completed;
    this.id = id;
    this.title = title;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }

}

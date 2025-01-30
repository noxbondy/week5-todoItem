package org.opp1;
import java.time.LocalDate;
import java.util.Objects;import java.time.LocalDate;
import java.util.Objects;
public class TodoItem {
    private int id;
    private String title;
    private String description;
    private LocalDate deadline;
    private boolean done;

    // Constructor
    public TodoItem(int id, String title, String description, LocalDate deadline, boolean done) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.done = done;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public boolean isDone() {
        return done;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    // Method to check if the task is overdue
    public boolean isOverdue() {
        return !done && deadline.isBefore(LocalDate.now());
    }

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id && done == todoItem.done &&
                Objects.equals(title, todoItem.title) &&
                Objects.equals(description, todoItem.description) &&
                Objects.equals(deadline, todoItem.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, deadline, done);
    }

    // Override toString for better readability
    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", done=" + done +
                '}';
    }
}
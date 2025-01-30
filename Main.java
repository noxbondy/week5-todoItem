package org.opp1;
import java.time.LocalDate;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Person person = new Person(10, "Md gulam ","Noxbondy", "gulamnoxbondy@gmail.com");
        System.out.println(person.getSummary());

        TodoItem item1 = new TodoItem(30 , "Buy Groceries", "Buy milk, eggs, and bread",
                LocalDate.of(2025, 01, 30), false);
        System.out.println("Title: " + item1.getTitle());
        System.out.println("Description: " + item1.getDescription());



        TodoItem todoItem = new TodoItem(20, "Complete grocery purchase",
                "Work on the Java Todo App",
                LocalDate.of(2025, 01, 30), false);

        TodoItemTask todoItemTask = new TodoItemTask(1, todoItem, person);
        System.out.println("Task ID: " + todoItemTask.getId());
        System.out.println("Task Name: " + todoItemTask.getTodoItem().getTitle());
        System.out.println("Assigned to: " + todoItemTask.getAssignee().getName());
        System.out.println("Completed: " + todoItemTask.isCompleted());




    }

    }

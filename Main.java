package org.opp1;
import java.time.LocalDate;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Person person = new Person(10, "Md gulam ","Noxbondy", "gulamnoxbondy@gmail.com");
        System.out.println(person.getSummary());


        TodoItem task = new TodoItem(20, "Complete Java Project",
                "Work on the Java Todo App",
                LocalDate.of(2025, 01, 30), false);
        System.out.println(task);
        System.out.println("Is the task overdue? " + task.isOverdue());
        task.setDone(true);
        System.out.println("Task status updated: " + task.isDone());
        System.out.println(task);



        Person assignee = new Person(5, "John Doe", "john.doe@example.com");
        

    }

    }

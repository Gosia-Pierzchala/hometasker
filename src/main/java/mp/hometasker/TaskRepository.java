package mp.hometasker;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {
    private List<Task> tasks;

    public TaskRepository(){
        tasks = new ArrayList<>();
        tasks.add(new Task("Mycie podłóg", new Person("Janek"), 3, LocalDateTime.of(LocalDate.of(2020, 8, 31), LocalTime.of(18, 00))));
        tasks.add(new Task("Malowanie", new Person("Zosia"), 10, LocalDateTime.of(LocalDate.of(2020, 9, 31), LocalTime.of(18, 00))));
        tasks.add(new Task("Wyniesienie śmieci", new Person("Zosia"), 1, LocalDateTime.of(LocalDate.of(2020, 8, 31), LocalTime.of(9, 00))));
    }

    public List<Task> getAll(){
        return tasks;
    }

}

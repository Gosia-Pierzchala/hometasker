package mp.hometasker;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskAndPeopleRepository {
    private List<Person> people;
    private List<Task> tasks;

    public TaskAndPeopleRepository(){
    people = new ArrayList<>();
    Person osoba1 = new Person("Janek");
    Person osoba2 = new Person("Zosia");
    Person osoba3 = new Person("Karol");
    people.add(osoba1);
    people.add(osoba2);
    people.add(osoba3);

    tasks = new ArrayList<>();
    tasks.add(new Task("Mycie podłóg", osoba1, 3, LocalDateTime.of(LocalDate.of(2020, 8, 31), LocalTime.of(18, 00))));
    tasks.add(new Task("Malowanie", osoba2, 10, LocalDateTime.of(LocalDate.of(2020, 9, 31), LocalTime.of(18, 00))));
    tasks.add(new Task("Wyniesienie śmieci", osoba2, 1, LocalDateTime.of(LocalDate.of(2020, 8, 31), LocalTime.of(9, 00))));
    }

    public List<Task> getAll(){
        return tasks;
    }

    public List<Person> getPeople(){
        return people;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void addPerson(Person person){
        people.add(person);
    }

    public void removeTask(Task task){
        tasks.remove(task);
    }

    public void removePerson(Person person){
        people.remove(person);
    }

    public Task findByDescription(String opis) {
        for (Task task: tasks) {
            if(task.getOpis().equals(opis)) {
                return task;
            }
        }
        return null;
    }
}

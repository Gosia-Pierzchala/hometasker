package mp.hometasker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PersonController {
    private TaskAndPeopleRepository taskAndPeopleRepository;

    public PersonController(TaskAndPeopleRepository taskAndPeopleRepository) {
        this.taskAndPeopleRepository = taskAndPeopleRepository;
    }

    @GetMapping("/dodajosobe")
    public String showAddForm(Model model){
        model.addAttribute("newPerson", new Person());
        return "dodawanie_osob"; // resources/templates/dodawanie.html
    }

    @PostMapping("/dodajosobe")
    public String addPerson(Person person){
        taskAndPeopleRepository.addPerson(person);
        return "redirect:/";
    }
}

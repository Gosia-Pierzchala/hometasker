package mp.hometasker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskController {
    private TaskAndPeopleRepository taskAndPeopleRepository;

    public TaskController(TaskAndPeopleRepository taskAndPeopleRepository) {
        this.taskAndPeopleRepository = taskAndPeopleRepository;
    }

    @GetMapping("/")
    public String taskList(Model model){
        List<Task> tasks = taskAndPeopleRepository.getAll();
        model.addAttribute("allTasks", tasks);
        return "homepage";
    }
}

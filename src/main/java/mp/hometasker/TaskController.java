package mp.hometasker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskController {
    private TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/")
    public String taskList(Model model){
        List<Task> tasks = taskRepository.getAll();
        model.addAttribute("allTasks", tasks);
        return "homepage";
    }
}

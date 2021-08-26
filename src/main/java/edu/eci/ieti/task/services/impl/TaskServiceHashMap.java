package edu.eci.ieti.task.services.impl;

import edu.eci.ieti.task.data.Task;
import edu.eci.ieti.task.services.TaskService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The type Task service hash map.
 */
@Service
public class TaskServiceHashMap implements TaskService {

    private HashMap<String, Task> tasks = new HashMap<>();

    @Override
    public Task create(Task task) {
        if(!tasks.containsKey(task.getId())){
            tasks.put(task.getId(),task);
        }
        return task;
    }

    @Override
    public Task findById(String id) {
        Task task = null;
        if(tasks.containsKey(id)){
            task = tasks.get(id);
        }
        return task;
    }

    @Override
    public List<Task> all() {
        return new ArrayList<>(tasks.values());
    }

    @Override
    public boolean deleteById(String id) {
        if(tasks.containsKey(id)){
            tasks.remove(id);
        }
        return !tasks.containsKey(id);
    }

    @Override
    public Task update(Task task, String userId) {
        tasks.put(userId,task);
        return task;
    }
}

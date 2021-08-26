package edu.eci.ieti.task.controller;

import edu.eci.ieti.task.data.Task;
import edu.eci.ieti.task.dto.TaskDto;
import edu.eci.ieti.task.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Task controller.
 */
@RestController
@RequestMapping( "/v1/task" )
public class TaskController
{
    private final TaskService taskService;

    /**
     * Instantiates a new Task controller.
     *
     * @param taskService the task service
     */
    public TaskController(@Autowired TaskService taskService)
    {
        this.taskService = taskService;
    }

    /**
     * All response entity.
     *
     * @return the response entity
     */
    @GetMapping
    public ResponseEntity<List<Task>> all()
    {
        return new ResponseEntity<>(taskService.all(), HttpStatus.OK);
    }

    /**
     * Find by id response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @GetMapping( "/{id}" )
    public ResponseEntity<Task> findById(@PathVariable String id )
    {
        return new ResponseEntity<>(taskService.findById(id), HttpStatus.OK);
    }


    /**
     * Create response entity.
     *
     * @param taskDto the task dto
     * @return the response entity
     */
    @PostMapping
    public ResponseEntity<Task> create( @RequestBody TaskDto taskDto )
    {

        return new ResponseEntity<>(taskService.create(taskDto.getTask()), HttpStatus.CREATED);
    }

    /**
     * Update response entity.
     *
     * @param taskDto the task dto
     * @param id      the id
     * @return the response entity
     */
    @PutMapping( "/{id}" )
    public ResponseEntity<Task> update(@RequestBody TaskDto taskDto, @PathVariable String id )
    {
        Task aux = taskDto.getTask();
        aux.setId(id);
        return new ResponseEntity<>(taskService.update(aux,id), HttpStatus.OK);
    }

    /**
     * Delete response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        return new ResponseEntity<>(taskService.deleteById(id), HttpStatus.OK);
    }
}

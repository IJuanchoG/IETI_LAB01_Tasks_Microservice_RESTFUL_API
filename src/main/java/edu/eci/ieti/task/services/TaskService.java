package edu.eci.ieti.task.services;

import edu.eci.ieti.task.data.Task;

import java.util.List;

/**
 * The interface Task service.
 */
public interface TaskService
{
    /**
     * Create task.
     *
     * @param task the task
     * @return the task
     */
    Task create(Task task );

    /**
     * Find by id task.
     *
     * @param id the id
     * @return the task
     */
    Task findById( String id );

    /**
     * All list.
     *
     * @return the list
     */
    List<Task> all();

    /**
     * Delete by id boolean.
     *
     * @param id the id
     * @return the boolean
     */
    boolean deleteById( String id );

    /**
     * Update task.
     *
     * @param task the task
     * @param id   the id
     * @return the task
     */
    Task update( Task task, String id );
}
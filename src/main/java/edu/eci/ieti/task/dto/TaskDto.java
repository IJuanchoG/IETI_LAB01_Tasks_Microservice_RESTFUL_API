package edu.eci.ieti.task.dto;

import edu.eci.ieti.task.data.Status;
import edu.eci.ieti.task.data.Task;

import java.util.Date;

/**
 * The type Task dto.
 */
public class TaskDto {

    private String name;
    private String description;
    private Status status;
    private String assignedTo;
    private Date dueDate;
    private Date created;

    /**
     * Instantiates a new Task dto.
     */
    public TaskDto() {
    }

    /**
     * Instantiates a new Task dto.
     *
     * @param name        the name
     * @param description the description
     * @param status      the status
     * @param assignedTo  the assigned to
     * @param dueDate     the due date
     * @param created     the created
     */
    public TaskDto(String name, String description, Status status, String assignedTo, Date dueDate, Date created) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.created = created;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Gets assigned to.
     *
     * @return the assigned to
     */
    public String getAssignedTo() {
        return assignedTo;
    }

    /**
     * Sets assigned to.
     *
     * @param assignedTo the assigned to
     */
    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    /**
     * Gets due date.
     *
     * @return the due date
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Sets due date.
     *
     * @param dueDate the due date
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Gets created.
     *
     * @return the created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Sets created.
     *
     * @param created the created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * Get task task.
     *
     * @return the task
     */
    public Task getTask(){
        return new Task(this);
    }
}

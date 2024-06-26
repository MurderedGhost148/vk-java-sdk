// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.asr;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * Task object
 */
public class Task implements Validable {
    /**
     * Task ID in UUID format.
     */
    @SerializedName("id")
    @Required
    private String id;

    /**
     * Status of the task.
     */
    @SerializedName("status")
    @Required
    private TaskStatus status;

    /**
     * Recognised text, if task is `finished`.
     */
    @SerializedName("text")
    @Required
    private String text;

    public String getId() {
        return id;
    }

    public Task setId(String id) {
        this.id = id;
        return this;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public Task setStatus(TaskStatus status) {
        this.status = status;
        return this;
    }

    public String getText() {
        return text;
    }

    public Task setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) &&
                Objects.equals(text, task.text) &&
                Objects.equals(status, task.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Task{");
        sb.append("id='").append(id).append("'");
        sb.append(", text='").append(text).append("'");
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
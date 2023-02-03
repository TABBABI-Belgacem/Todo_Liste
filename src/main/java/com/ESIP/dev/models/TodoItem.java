package com.ESIP.dev.models;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "todo_item")
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @NotBlank(message = "Description is required")
    private String description;

    @Getter
    @Setter
    private boolean complete;

    @Getter
    @Setter
    private Instant createdDate;

    @Getter
    @Setter
    private Instant modifiedDate;

    public TodoItem() {}

    public TodoItem(String description) {
        this.description = description;
        this.complete = false;
        this.createdDate = Instant.now();
        this.modifiedDate = Instant.now();
    }
   
   

   
   
   
    public Instant getCreatedDate() {
return createdDate;
}

public void setCreatedDate(Instant createdDate) {
this.createdDate = createdDate;
}



public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public boolean isComplete() {
return complete;
}

public void setComplete(boolean complete) {
this.complete = complete;
}

public Instant getModifiedDate() {
return modifiedDate;
}

public void setModifiedDate(Instant modifiedDate) {
this.modifiedDate = modifiedDate;
}

@Override
    public String toString() {
        return String.format("TodoItem{id=%d, description='%s', complete='%s', createdDate='%s', modifiedDate='%s'}",
        id, description, complete, createdDate, modifiedDate);
    }



}

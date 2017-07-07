package org.launchcode.models;

import com.sun.istack.internal.NotNull;
import javax.validation.constraints.Size;

import javax.persistence.*;



/**
 * Created by soccerwilli on 7/7/2017.
 */

@Entity
public class Category {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 15)
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category() {}

    public Category(String name) {
        this.name = name;
    }
}


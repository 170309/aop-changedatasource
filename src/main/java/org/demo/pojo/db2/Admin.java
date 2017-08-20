package org.demo.pojo.db2;

public class Admin {
    private String name;

    private Integer id;

    private String description;

    public Admin(String name, Integer id, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public Admin() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
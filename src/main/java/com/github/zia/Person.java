package com.github.zia;

public abstract class Person {
    private String name;
    private int id;
    public Person(String name, int id){
        this.setName(name);
        this.setId(id);
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    abstract String getRole();

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}

package org.example.domain;

public class Names {
    private String name;

    public Names() {

    }

    public Names(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Names{" +
                "name='" + name + '\'' +
                '}';
    }
}

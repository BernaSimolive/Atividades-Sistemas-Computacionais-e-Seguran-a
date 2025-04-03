package org.example.domain;

import java.util.Objects;

public class Hast implements Comparable<Hast> {
    private int number;
    private int line;
    private int lineProvisorio;
    private Names name;


    public Hast(int number, int line, int lineProvisorio, Names name) {
        this.number = number;
        this.line = line;
        this.lineProvisorio = lineProvisorio;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public Names getName() {
        return name;
    }

    public void setName(Names name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hast hast = (Hast) o;
        return number == hast.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public int compareTo(Hast o) {
        return Integer.compare(this.number,o.number) ;
    }

    public int getLineProvisorio() {
        return lineProvisorio;
    }

    public void setLineProvisorio(int lineProvisorio) {
        this.lineProvisorio = lineProvisorio;
    }

    @Override
    public String
    toString() {
        return "Hast{" +
                "number=" + number +
                ", line=" + line +
                ", name=" + name +
                '}';
    }
}

package dev.breno.labs.week02;

import java.util.Objects;

public class Person {

    private String name;

    private int age;

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int hashCode(){

        return name == null ? 0 : name.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person outraPessoa = (Person) obj;

        return Objects.equals(this.name, outraPessoa.getName());


    }
}

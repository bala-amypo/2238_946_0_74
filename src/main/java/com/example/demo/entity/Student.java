package com.example.demo.entity;
public class Student{
    private long id;
    private String name;
    private String email;
    private float cgpa;

    public long setId(){
        return id;
    }
    public void getId(Long id){
        this.id=id;
    }
    public String setName(){
        return name;
    }
    public void getName(String name){
        this.name=name;
    }
    public String setEmail(){
        return email;
    }
    public void getEmail(String email){
        this.email=email;
    }
    public float setCgpa(){
        return cgpa;
    }
    public void getCgpa(Float cgpa){
        this.cgpa=cgpa;
    }
}
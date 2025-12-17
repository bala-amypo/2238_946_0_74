package com.example.demo.entity;
import jakarta.persistence.*;

@Entity
// @Table(name="studentdetails")
public class Student {

@Id
// @GeneratedValue(strategy = GenerationType. IDENTITY)
private int id;
// @Column(name="name")

public class Student{
    private Long id;
    private String name;
    private String email;
    private float cgpa;

    public Long setId(){
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
    public void getCgpa(float cgpa){
        this.cgpa=cgpa;
    }
}
public Student(Long id,String name,String email,float cgpa){
    this.id=id;
    this.name=name;
    this.email=email;
    this.cgpa=cgpa;
}
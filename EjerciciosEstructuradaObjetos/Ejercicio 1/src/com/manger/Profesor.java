package com.manger;

public class Profesor extends Person{
    private String course;
    private String position;

    public Profesor(){

    }
    public Profesor(String course, String position, String name, int age){
        super(name,age);
        this.course= course;
        this.position = position;

    }
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }
    public void setPosition( String position){
        this.position= position;
    }
    public String getPosition(){
        return position;
    }

}

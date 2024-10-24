package com.manger;

public class Stude  extends Person{
    private String major;
    private int file;

    public Stude(){

    }
    public Stude(String major, int file, String name, int age){
        super(name,age);
        this.major =major;
        this.file= file;
    }
    public void setMajor(String major){
        this.major= major;
    }
    public String getMajor(){
        return major;
    }
    public void setFile(int file){
        this.file = file;
    }
    public int getFile(){
        return file;
    }


}

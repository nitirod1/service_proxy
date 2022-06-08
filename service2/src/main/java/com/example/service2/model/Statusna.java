package com.example.service2.model;


public class Statusna {
    public int id ;
    public String status ;
    public Statusna(int id , String status){
        super();
        this.id = id;
        this.status = status;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public String getStatus(){
        return status;
    }
}

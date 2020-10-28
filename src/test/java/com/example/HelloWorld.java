package com.example;

public class HelloWorld {
    private String message;

    public void setMessage(String str){
        this.message = str;
    }

    public String getMessage(){
        return message;
    }

    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}

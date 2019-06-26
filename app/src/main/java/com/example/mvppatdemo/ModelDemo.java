package com.example.mvppatdemo;

public class ModelDemo {

    String fullName;
    String email;

    public String getFullName()
    {
        return fullName;
    }


    public String getEmail()
    {
        return email;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }


    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "Name: " + fullName + "\nEmail: " + email;
    }
}

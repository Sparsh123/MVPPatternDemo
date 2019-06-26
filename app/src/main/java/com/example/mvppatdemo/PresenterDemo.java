package com.example.mvppatdemo;

public class PresenterDemo {

    ModelDemo model;
    View view;

    PresenterDemo(View view)
    {
        this.view = view;
        model = new ModelDemo();
    }

    public void updateFullName(String fullName)
    {
        model.setFullName(fullName);
        view.updateUserInfo(model.toString());
    }


    public void updateEmail(String email)
    {
        model.setEmail(email);
        view.updateUserInfo(model.toString());
    }
}

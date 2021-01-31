package com.example.check_apartment.presenter;

import com.example.check_apartment.model.ModelApt;

public class PresenterLogin {
    private IViewLogin view;
    private ModelApt model;

    public PresenterLogin(IViewLogin view) {
        this.view = view;
        this.model = new ModelApt();
    }

    public void checkPassword(String pass) {
        if (model.checkAs()) {
            if (model.checkPassword(pass)) view.toSecondActivity();
            else view.showPassMsg();
        } else view.checkButton();

    }
}

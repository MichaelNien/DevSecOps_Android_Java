package com.devsecops.presenter;

import androidx.appcompat.app.AppCompatActivity;

import com.devsecops.model.MainModel;

public class MainPresenter {

    private AppCompatActivity appCompatActivity;

    private MainModel model;

    public MainPresenter(AppCompatActivity appCompatActivity, MainModel model) {
        this.appCompatActivity = appCompatActivity;
        this.model = model;
    }

    public void init() {

    }
}

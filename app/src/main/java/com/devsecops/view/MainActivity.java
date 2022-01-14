package com.devsecops.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.devsecops.model.MainModel;
import com.devsecops.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity {

    private MainModel model;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        model = new MainModel();
        presenter = new MainPresenter(this, model);

        presenter.init();
    }
}

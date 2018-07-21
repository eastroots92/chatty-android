package com.openull.eastroots92.vacation_homework_android.ui.main;

public class MainPresenter {
    private MainActivity view;

    public MainPresenter(MainActivity view) {
        this.view = view;
    }

    public void init() {
        view.initView();
    }
}

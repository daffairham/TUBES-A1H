package com.example.tubes_a1h;

public class MainPresenter {

    protected IMainActivity ui;
    protected MainActivity ma;

    public MainPresenter(MainActivity mainActivity, IMainActivity imain){
        this.ui = imain;
        this.ma = mainActivity;
    }

}

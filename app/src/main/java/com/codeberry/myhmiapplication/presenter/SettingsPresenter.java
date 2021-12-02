package com.codeberry.myhmiapplication.presenter;

import com.codeberry.myhmiapplication.model.SettingsModel;

import java.util.ArrayList;

public class SettingsPresenter implements IMainPresenter.SettingsPresenter {
    private SettingsModel mSettingsModel= new SettingsModel();

    public ArrayList<String> getQuantityData(){

        return mSettingsModel.getQuantityData();
    }

    @Override
    public void Beep() {
        mSettingsModel.Beep();
    }
}

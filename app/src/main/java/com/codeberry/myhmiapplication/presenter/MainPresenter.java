package com.codeberry.myhmiapplication.presenter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

import com.codeberry.myhmiapplication.constants.Constants;
import com.codeberry.myhmiapplication.model.IMainModelNotify;
import com.codeberry.myhmiapplication.model.MainModel;
import com.codeberry.myhmiapplication.view.IMainView;


import java.util.Timer;
import java.util.TimerTask;

public class MainPresenter implements IMainModelNotify,IMainPresenter.MainPresenters {

    private IMainView.MainView mIMainView;
    private MainModel mMainModel;

    public MainPresenter(IMainView mainView) {
        mIMainView = (IMainView.MainView) mainView;
        mMainModel = new MainModel(this);
    }

    @Override
    public void bindService(Context context) {
        mMainModel.bindExternalService(context);
    }

    @Override
    public void notifyServiceConnection() {
        mIMainView.loadSettingsFragment();
    }
}

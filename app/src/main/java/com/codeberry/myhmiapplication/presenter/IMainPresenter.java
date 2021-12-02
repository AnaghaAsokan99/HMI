package com.codeberry.myhmiapplication.presenter;

import android.content.Context;

import java.util.ArrayList;

public interface IMainPresenter {


   interface MainPresenters {
        void bindService (Context context);

       void notifyServiceConnection();
    }

    interface SettingsPresenter{

         ArrayList<String> getQuantityData();

         void Beep();

    }

    interface ControlPresenter{

    }


}

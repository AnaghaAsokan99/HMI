package com.codeberry.myhmiapplication.model;

import java.util.ArrayList;

public interface IMainModelNotify {

    void notifyServiceConnection();


   interface SettingsModel{
       ArrayList<String> getQuantityData();

       void Beep();
   }


}

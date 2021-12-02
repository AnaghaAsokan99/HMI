package com.codeberry.myhmiapplication.view;

import java.util.ArrayList;

public interface IMainView {

    interface MainView {

        void loadSettingsFragment();

        void initObjects();
    }

    interface SettingsView{
        //void setRecyclerView();

        void Beep();

        void onQuantityChange(ArrayList<String> arrayList);

    }

    interface ControlView{


    }

}

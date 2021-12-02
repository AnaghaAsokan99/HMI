package com.codeberry.myhmiapplication.model;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

public class SettingsModel implements IMainModelNotify.SettingsModel {



    public ArrayList<String> getQuantityData(){
        ArrayList<String> arrayList =new ArrayList<>();
        arrayList.add("Touch Screen Beep");
        arrayList.add("Fuel Saver Display");
        arrayList.add("Display Mode Manual");
        arrayList.add("Display Brightness HL ON");
        arrayList.add("Display Brightness HL OFF");
        Log.i("list",arrayList.toString());
        return arrayList;
    }

    @Override
    public void Beep() {

    }
}

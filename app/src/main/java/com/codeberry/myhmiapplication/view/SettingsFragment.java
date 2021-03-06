package com.codeberry.myhmiapplication.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeberry.myhmiapplication.R;
import com.codeberry.myhmiapplication.constants.Constants;
import com.codeberry.myhmiapplication.presenter.IMainPresenter;
import com.codeberry.myhmiapplication.presenter.SettingsPresenter;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingsFragment# new Instance} factory method to
 * create an instance of this fragment.
 */
public class SettingsFragment extends Fragment implements QuantityListener,IMainView.SettingsView {

    SettingsPresenter mSettingsPresenter= new SettingsPresenter();
    RecyclerView recyclerView;
    QuantityAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_settings, container, false);

        recyclerView=view.findViewById(R.id.recyclerView);
        //setRecyclerView();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new QuantityAdapter(this,mSettingsPresenter.getQuantityData(),this);
        recyclerView.setAdapter(adapter);
        return view;
    }


    /*public void setRecyclerView() {

    }*/

    @Override
    public void Beep() {
        mSettingsPresenter.Beep();
    }


    @Override
    public void onQuantityChange(ArrayList<String> arrayList) {


    }

}

    /*// TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SettingsFragment() {
        // Required empty public constructor
    }

    *//**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SettingsFragment.
     *//*
    // TODO: Rename and change types and number of parameters
    public static SettingsFragment newInstance(String param1, String param2) {
        SettingsFragment fragment = new SettingsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
       // initObjects();
        return view;
    }


}*/
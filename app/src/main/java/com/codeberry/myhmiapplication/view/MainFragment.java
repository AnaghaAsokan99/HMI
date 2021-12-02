package com.codeberry.myhmiapplication.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeberry.myhmiapplication.R;
import com.codeberry.myhmiapplication.constants.Constants;
import com.codeberry.myhmiapplication.presenter.IMainPresenter;
import com.codeberry.myhmiapplication.presenter.MainPresenter;
import com.codeberry.myhmiapplication.presenter.SettingsPresenter;

import java.util.Timer;
import java.util.TimerTask;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment implements IMainView.MainView {

    private MainPresenter mMainPresenter;
    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        initObjects();
        bindService();
        return view;
    }

    public void initObjects() {
        mMainPresenter = new MainPresenter((IMainView) this);
    }

    private void bindService() {
        mMainPresenter.bindService(getActivity().getApplicationContext());
    }

    @Override
    public void loadSettingsFragment() {
        FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        supportFragmentManager.beginTransaction()
                .add(R.id.frame_SettingdFragment, new SettingsFragment())
                .commit();
    }
}
package com.example.libreriaonboarding.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.libreriaonboarding.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {
    private TextView textPrev;
    private ViewPager viewPager;
    private View view;
    private Button btLogin, btRegister;
    private EditText etUsername,etPassword;

    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        _initializeInflater(inflater, container);
        _initializeVariables();
        return  view;
    }
    private void  _initializeInflater(LayoutInflater inflater, ViewGroup container){
        view = inflater.inflate(R.layout.fragment_3, container, false);
    }
    private void _initializeVariables(){
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textPrev = view.findViewById(R.id.txvSkip);
        etUsername=view.findViewById(R.id.et1);
        etPassword=view.findViewById(R.id.et2);
    }
}

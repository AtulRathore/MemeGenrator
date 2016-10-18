package com.example.atul.fragment2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Bottom_Fragment extends Fragment {


     TextView mtopText, mbottomText;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_section,container, false);
        mtopText = (TextView) view.findViewById(R.id.textView3);
        mbottomText = (TextView) view.findViewById(R.id.textView4);
        return view;
    }

    public void setMemeText(String top, String bottom){
        mtopText.setText(top);
        mbottomText.setText(bottom);

    }
}

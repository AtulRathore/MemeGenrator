package com.example.atul.fragment2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Top_Section_Fragment extends Fragment {

    private static EditText mtopTextInput;
    private static EditText mbottomTextInput;
    Button mbutton;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            activityCommander = (TopSectionListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_sedtion,container,false);
        mtopTextInput = (EditText) view.findViewById(R.id.et1);
        mbottomTextInput = (EditText) view.findViewById(R.id.et2);
        mbutton = (Button) view.findViewById(R.id.button);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });
        return view;
    }

    // Called when button is clicked
    public void buttonClicked(View view){
        activityCommander.createMeme(mtopTextInput.getText().toString(), mbottomTextInput.getText().toString());
    }


}

package com.stefanee.meowtion;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class Tab1Fragment extends Fragment {

    private static final String TAG = "Tab1Fragment";

    private Button btnTab1;
    private ImageView imageViewJump;
    private AnimationDrawable animationDrawable;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1,container,false);

        btnTab1 = (Button) view.findViewById(R.id.btnTab1);
        imageViewJump = (ImageView) view.findViewById(R.id.imageViewJump);
        imageViewJump.setBackgroundResource(R.drawable.catanim_jump);

        animationDrawable = (AnimationDrawable)imageViewJump.getBackground();
        animationDrawable.start();

        btnTab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "BUTTON 1 CLICKED", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

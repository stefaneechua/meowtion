package com.stefanee.meowtion;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";

    private Button btnTab2;
    private ImageView imageViewHurt;
    private AnimationDrawable animationDrawable;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab2,container,false);

        btnTab2 = (Button) view.findViewById(R.id.btnTab2);
        imageViewHurt = (ImageView) view.findViewById(R.id.imageViewHurt);
        imageViewHurt.setBackgroundResource(R.drawable.catanim_hurt);

        animationDrawable = (AnimationDrawable)imageViewHurt.getBackground();
        animationDrawable.start();

        btnTab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "BUTTON 2 CLICKED", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

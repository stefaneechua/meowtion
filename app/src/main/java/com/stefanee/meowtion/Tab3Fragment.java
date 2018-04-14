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


public class Tab3Fragment extends Fragment {
    private static final String TAG = "Tab3Fragment";

    private Button btnTab3;
    private ImageView imageViewWalk;
    private AnimationDrawable animationDrawable;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab3,container,false);

        btnTab3 = (Button) view.findViewById(R.id.btnTab3);
        imageViewWalk = (ImageView) view.findViewById(R.id.imageViewWalk);
        imageViewWalk.setBackgroundResource(R.drawable.catanim_walk);

        animationDrawable = (AnimationDrawable)imageViewWalk.getBackground();
        animationDrawable.start();

        btnTab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "BUTTON 3 CLICKED", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

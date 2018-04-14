package com.stefanee.meowtion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button = (Button) findViewById(R.id.meowtion);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), TabbedActivity.class));
            }
        });
    }
}

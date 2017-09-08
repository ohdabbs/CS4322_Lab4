package com.example.olyn.cs4322_lab4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Olyn on 9/8/2017.
 */

public class FailedActivity extends AppCompatActivity {

    Button goBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failed);

        goBack = (Button)findViewById(R.id.failedButton);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getBaseContext(), LoginActivity.class);
                startActivity(back);
            }
        });
    }
}

/*
  Class: 	 	          CS 4322/section01
  Term:		              Fall 2017
  Name: 		          Olyn Dabbs
  Instructor:             Dr. Selena He
  Lab 4:                  Login Page
 */

package com.example.olyn.cs4322_lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    String unInput, pwInput, validUser, validPass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        validUser = "cs4322";
        validPass = "123456";

        login = (Button)findViewById(R.id.loginButton);
        username = (EditText)findViewById(R.id.UserNameEditText);
        password = (EditText)findViewById(R.id.PasswordEditText);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unInput = username.getText().toString();
                pwInput = password.getText().toString();
                Intent loginAttempt;
                if(unInput.equals(validUser) && pwInput.equals(validPass)){
                    loginAttempt = new Intent(LoginActivity.this, AuthenticateActivity.class);
                    startActivity(loginAttempt);
                }
                else{
                    loginAttempt = new Intent(LoginActivity.this, FailedActivity.class);
                    startActivity(loginAttempt);
                }
            }
        });
    }
}

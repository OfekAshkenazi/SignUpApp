package com.example.ofek.signupapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Classes.User;

public class MainActivity extends AppCompatActivity {
    public static User user=new User();

    public static User getUser() {
        return user;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn= (Button) findViewById(R.id.regBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),Details1Activity.class);
                startActivity(intent);
            }
        });
    }
}

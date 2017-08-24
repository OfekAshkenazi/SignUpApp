package com.example.ofek.signupapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Classes.User;

public class Details1Activity extends AppCompatActivity {
    EditText ageET,nameET;
    Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details1);
        nameET= (EditText) findViewById(R.id.nameET);
        ageET= (EditText) findViewById(R.id.ageET);
        nextBtn= (Button) findViewById(R.id.next1Btn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ageET.getText().toString().equals("")||nameET.getText().toString().equals("")){
                    Toast.makeText(Details1Activity.this, "please enter all your details", Toast.LENGTH_SHORT).show();
                    return;
                }
                User user=MainActivity.getUser();
                user.setName(nameET.getText().toString());
                user.setAge(Integer.parseInt(ageET.getText().toString()));
                Intent intent=new Intent(view.getContext(),Details2Activity.class);
                startActivity(intent);
            }
        });
    }
}

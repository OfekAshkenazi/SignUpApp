package com.example.ofek.signupapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Details2Activity extends AppCompatActivity {
    ImageView photoIV;
    Button nextBtn,captureBtn;
    Bitmap photo;
    static  final int CAMERA_CALL=1118;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);
        photoIV= (ImageView) findViewById(R.id.photoIV);
        photoIV.setVisibility(View.INVISIBLE);
        nextBtn= (Button) findViewById(R.id.next2Btn);
        nextBtn.setVisibility(View.INVISIBLE);
        captureBtn= (Button) findViewById(R.id.takePhotoBtn);
        captureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,CAMERA_CALL);
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (photo==null){
                    Toast.makeText(Details2Activity.this, "please take a photo", Toast.LENGTH_SHORT).show();
                    return;
                }
                MainActivity.user.setPhoto(photo);
                Intent intent=new Intent(view.getContext(),Details3Activity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode==CAMERA_CALL&&resultCode==RESULT_OK){
            photo= (Bitmap) data.getExtras().get("data");
            photoIV.setImageBitmap(photo);
            nextBtn.setVisibility(View.VISIBLE);
    }
    }
}

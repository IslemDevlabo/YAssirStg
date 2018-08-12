package com.example.home.yassirph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.content.Intent;
import android.graphics.Bitmap;

public class ChauffeurPhoto extends AppCompatActivity {


    ImageView profile;
    ImageView cars ;
    ImageButton profileBtn;
    ImageButton carsBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chauffeur_photo);
        profile = (ImageView) findViewById(R.id.profile_img_id);
        cars = (ImageView) findViewById(R.id.car_img_id);
        profileBtn = (ImageButton) findViewById(R.id.profile_cam_id);
         carsBtn = (ImageButton) findViewById(R.id.car_cam_id);


    }


    public void captureProfile(View view) {
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 0);

    }

    public void captureCar(View view) {
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bit;
        switch (requestCode) {
            case 0:
             bit = (Bitmap) data.getExtras().get("data");
            profile.setImageBitmap(bit);
            break;
            case 1:
                bit = (Bitmap) data.getExtras().get("data");
                cars.setImageBitmap(bit);
                break;

        }
    }
}

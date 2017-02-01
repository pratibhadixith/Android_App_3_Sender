package com.example.prati.mp3appa1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private Button bhotel,brestaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bhotel=(Button)findViewById(R.id.button1);
        bhotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // handling user click
                Intent intent = new Intent();
                intent.setAction("com.app.SendHotel");
                intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                sendOrderedBroadcast(intent, null);



            }
        });

        brestaurant=(Button)findViewById(R.id.button2);
        brestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // handling user click
                Intent intent = new Intent();
                intent.setAction("com.app.SendRestaurant");
                intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                sendOrderedBroadcast(intent, null);



            }
        });

    }
}
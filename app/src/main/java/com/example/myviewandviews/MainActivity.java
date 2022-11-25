//Nama: Muhammad Fathur Rozzaq
//NIM: 24060120120023
//Lab: B2
package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCS = findViewById(R.id.btn_cs);
        btnCS.setOnClickListener(this);

        Button btnBuy = findViewById(R.id.btn_buy);
        btnBuy.setOnClickListener(this);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("ROG Zephrus M16");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_cs:
                String phoneNumber = "085290413373";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
                break;
            case R.id.btn_buy:
                Intent buyIntent = new Intent(MainActivity.this, BuyActivity.class);
                startActivity(buyIntent);
                break;

        }
    }
}
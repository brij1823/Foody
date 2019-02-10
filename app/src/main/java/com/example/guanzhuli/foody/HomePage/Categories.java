package com.example.guanzhuli.foody.HomePage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.example.guanzhuli.foody.R;

public class Categories extends AppCompatActivity {

    Button  b0, b1, b2, b3, b4, b5, b6, b7;
    public static String code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        b0 = (Button) findViewById(R.id.zero);
        b1 = (Button) findViewById(R.id.one);
        b2 = (Button) findViewById(R.id.two);
        b3 = (Button) findViewById(R.id.three);
        b4 = (Button) findViewById(R.id.four);
        b5 = (Button) findViewById(R.id.five);
        b6 = (Button) findViewById(R.id.six);
        b7 = (Button) findViewById(R.id.seven);


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "frankie";
                animation();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "pizza";
                animation();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "sandwich";
                animation();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "starters";
                animation();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "indian food";
                animation();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "chinese food";
                animation();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "punjabi food";
                animation();
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "biryani";
                animation();
            }
        });
    }

    void animation() {
        Intent i = new Intent(Categories.this, HomePageActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.fall_down, R.anim.fade_out);
    }

    @Override
    public void finish() {
        super.finish();
    }

}

package com.example.guanzhuli.foody.HomePage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.guanzhuli.foody.R;

public class Categories extends AppCompatActivity {

    ImageButton b0,b1,b2,b3,b4,b5,b6,b7;
    public static String code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        b0=(ImageButton)findViewById(R.id.zero);
        b1=(ImageButton)findViewById(R.id.one);
        b2=(ImageButton)findViewById(R.id.two);
        b3=(ImageButton)findViewById(R.id.three);
        b4=(ImageButton)findViewById(R.id.four);
        b5=(ImageButton)findViewById(R.id.five);
        b6=(ImageButton)findViewById(R.id.six);
        b7=(ImageButton)findViewById(R.id.seven);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code="frankie";
                Intent i=new Intent(Categories.this,HomePageActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                      code="pizza";
                      Intent i=new Intent(Categories.this,HomePageActivity.class);
                      startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code="sandwich";

                Intent i=new Intent(Categories.this,HomePageActivity.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code="starters";
                Intent i=new Intent(Categories.this,HomePageActivity.class);
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 code="indian food";
                Intent i=new Intent(Categories.this,HomePageActivity.class);
                startActivity(i);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  code="chinese food";
                Intent i=new Intent(Categories.this,HomePageActivity.class);
                startActivity(i);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  code="punjabi food";
                Intent i=new Intent(Categories.this,HomePageActivity.class);
                startActivity(i);
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                     code="biryani";
                Intent i=new Intent(Categories.this,HomePageActivity.class);
                startActivity(i);
            }
        });
    }
}

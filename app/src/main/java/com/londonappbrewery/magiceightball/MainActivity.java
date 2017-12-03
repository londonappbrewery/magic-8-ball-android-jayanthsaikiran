package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] add = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        final Random random = new Random();

        final ImageView imageView = (ImageView) findViewById(R.id.image1);

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                int n = random.nextInt(5);
                imageView.setImageResource(add[n]);
            }
        });

    }
}

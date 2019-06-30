package com.example.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = findViewById(R.id.rollButton);
      final  ImageView leftdice=findViewById(R.id.leftdice) ;
       final ImageView rightdice=findViewById(R.id.rightdice) ;
        final int[] dicearray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","Ze button has been pressed.");
                Random randomNumberGenerator =new Random();
                int number=randomNumberGenerator.nextInt(6);
                Log.d("Dicee","The random number is:"+ number);
                leftdice.setImageResource(dicearray[number]);
                number=  randomNumberGenerator.nextInt(6);
                rightdice.setImageResource(dicearray[number]);
            }
        });

    }
}

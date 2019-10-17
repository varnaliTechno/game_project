package com.example.mygamefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    TextView score;
    private Random rand1;
    private int number;
    private Random rand2;
    private int number2;
    int total = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.btn1);
        b2 = (Button)findViewById(R.id.btn2);
        score = (TextView)findViewById(R.id.result);

        score.setText(String.valueOf(total));
        rand1 = new Random();
        number = rand1.nextInt(999);
        b1.setText(String.valueOf(number));

        rand2 = new Random();
        number2 = rand2.nextInt(999);
        b2.setText(String.valueOf( number2));

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rand1 = new Random();
                number = rand1.nextInt(999);
                b1.setText(String.valueOf(number));

                rand2 = new Random();
                number2 = rand2.nextInt(999);
                b2.setText(String.valueOf( number2));

                if (number > number2 )
                {
                    total = total + 5;
                    score.setText(String.valueOf(total));
                }
                else if(number2 > number)
                {
                    total = total - 5;
                    score.setText(String.valueOf(total));
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rand1 = new Random();
                number = rand1.nextInt(999);
                b1.setText(String.valueOf(number));

                rand2 = new Random();
                number2 = rand2.nextInt(999);
                b2.setText(String.valueOf( number2));

                if (number > number2 )
                {
                    total = total + 5;
                    score.setText(String.valueOf(total));
                }
                else if(number2 > number)
                {
                    total = total - 5;
                    score.setText(String.valueOf(total));
                }
            }
        });


    }


}
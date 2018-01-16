package com.example.comp.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;

    public void makeToast(String string)

    {
        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();
    }
    public void Guess(View view)
    {

        EditText guessEditText=(EditText)findViewById(R.id.guessEditText);
        int guessInt=Integer.parseInt(guessEditText.getText().toString());
        if(n>guessInt)
        {
            makeToast("Higher!");
        }
        else if(n<guessInt)
        {
            makeToast("Lower!");
        }
        else
        {
            makeToast("That's right! Try again!");
            Random rand=new Random();
            n=rand.nextInt(100)+1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand =new Random();
        n =rand.nextInt(100)+1;

    }
}

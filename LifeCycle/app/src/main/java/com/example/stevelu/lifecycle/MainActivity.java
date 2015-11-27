package com.example.stevelu.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView btnNextA, btnNextB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("lifeCycle", "onCreate");

        btnNextA = (TextView) findViewById(R.id.btnNextA);
        btnNextB = (TextView) findViewById(R.id.btnNextB);
        btnNextA.setOnClickListener(this);
        btnNextB.setOnClickListener(this);
    }


    @Override
    protected void onStart() {
        super.onStart();

        Log.i("lifeCycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("lifeCycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("lifeCycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("lifeCycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("lifeCycle", "onDestroy");
    }


    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("lifeCycle", "onRestart");
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnNextA:

                Intent intentA = new Intent();
                intentA.setClass(this, Page2Activity.class);
                startActivity(intentA);

                break;
            case R.id.btnNextB:

                Intent intentB = new Intent();
                intentB.setClass(this, Page2Activity.class);
                startActivity(intentB);
                finish(); // use finish() to destroy this activity

                break;
            default:
                break;
        }


    }
}

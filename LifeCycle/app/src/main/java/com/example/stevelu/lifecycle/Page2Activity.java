package com.example.stevelu.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView btnBack, btnBackPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        btnBack = (TextView) findViewById(R.id.btnBack);
        btnBackPressed = (TextView) findViewById(R.id.btnBackPress);
        btnBack.setOnClickListener(this);
        btnBackPressed.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnBack:

                Intent intent = new Intent();
                intent.setClass(this, MainActivity.class);
                startActivity(intent);
                finish();

                break;
            case R.id.btnBackPress:

                onBackPressed();

                break;
            default:
                break;
        }


    }
}

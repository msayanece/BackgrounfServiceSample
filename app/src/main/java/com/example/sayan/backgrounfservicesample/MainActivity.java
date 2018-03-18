package com.example.sayan.backgrounfservicesample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        switch (view.getId()){
            case R.id.startService:
                Intent intent = new Intent(this, MyService.class);
                startService(intent);
                break;
            case R.id.stopService:
                Intent stopIntent = new Intent(this, MyService.class);
                stopService(stopIntent);
                break;
            default:
                break;
        }
    }
}

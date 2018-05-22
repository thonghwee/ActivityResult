package com.taruc.activityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //declare view
    private Button buttonMain;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMain= findViewById(R.id.buttonMain);
        textView= findViewById(R.id.textView);

        //set listener to button
        buttonMain.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        Intent intent= new Intent(this,SecondActivity.class);
        startActivityForResult(intent,0);

    }

    //callback method

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode ==0)
        {
            if(data != null)
            {
                textView.setText(data.getStringExtra("key"));

            }

        }
    }
}

package com.quspaper.quspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cbsc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbsc);
    }
    public void cbsc_class12th(View view){
        Intent intent=new Intent(this,cbsc_sub.class);
        startActivity(intent);
    }
    public void cbsc_class10th(View view){
        Intent intent=new Intent(this,cbsc_sub2.class);
        startActivity(intent);
    }
}

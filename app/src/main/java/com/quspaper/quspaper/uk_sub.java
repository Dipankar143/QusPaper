package com.quspaper.quspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class uk_sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uk_sub);
    }
    public void uk_class12th_hindi(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_hindi.html");
        startActivity(intent);
    }
    public void uk_class12th_english(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_english.html");
        startActivity(intent);
    }
    public void uk_class12th_math(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_math.html");
        startActivity(intent);
    }
    public void uk_class12th_phy(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_phy.html");
        startActivity(intent);
    }
    public void uk_class12th_che(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_che.html");
        startActivity(intent);
    }
    public void uk_class12th_bio(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_bio.html");
        startActivity(intent);
    }
    //Arts

    public void uk_class12th_his(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_his.html");
        startActivity(intent);
    }
    public void uk_class12th_eco(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_eco.html");
        startActivity(intent);
    }
    public void uk_class12th_sans(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_sans.html");
        startActivity(intent);
    }
    public void uk_class12th_geog(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_geog.html");
        startActivity(intent);
    }
    public void uk_class12th_soci(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_soci.html");
        startActivity(intent);
    }
    public void uk_class12th_geo(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_geo.html");
        startActivity(intent);
    }
    //Accounts

    public void uk_class12th_acc(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_acc.html");
        startActivity(intent);
    }
    public void uk_class12th_busi(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_12th_busi.html");
        startActivity(intent);
    }
}

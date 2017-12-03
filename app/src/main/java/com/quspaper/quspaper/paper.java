package com.quspaper.quspaper;

import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.jar.Manifest;

public class paper extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<data> arrayList;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper);
        arrayList=new ArrayList<>();
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
            } else {
                ActivityCompat.requestPermissions(this,new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
            }
        }
        url=getIntent().getStringExtra("url");

        new task().execute();
    }
    public class task extends AsyncTask<Void,Void,Void>{
        data paper;
        @Override
        protected Void doInBackground(Void... params) {
            try {
                Document document= Jsoup.connect(url).get();
                Elements elements=document.select("a");
                for (int i=0;i<=elements.size()-1;i++){
                paper=new data(elements.get(i).attr("href"),elements.get(i).text());
                arrayList.add(paper);}
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            RecyclerView.Adapter adapter=new adeptor(arrayList,getApplicationContext());
            recyclerView= (RecyclerView) findViewById(R.id.rec);
            recyclerView.setAdapter(adapter);
            RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(layoutManager);
        }
    }
}

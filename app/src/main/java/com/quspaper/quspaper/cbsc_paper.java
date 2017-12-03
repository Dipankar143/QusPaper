package com.quspaper.quspaper;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class cbsc_paper extends AppCompatActivity {
    TextView cbsc;
    RecyclerView recyclerView2;
    ArrayList<data> arrayList;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbsc_paper);
        recyclerView2= (RecyclerView) findViewById(R.id.rec2);
        arrayList=new ArrayList<>();
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
            } else {
                ActivityCompat.requestPermissions(this,new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
            }
        }
        do {
            url = getIntent().getStringExtra("url");
        }while (!url.startsWith("http"));
            new task().execute();
    }
    public class task extends AsyncTask<Void,Void,Void>{
        data cbsc_data;
        @Override
        protected Void doInBackground(Void... params) {
            try {
                Document document= Jsoup.connect(url).get();
                Element element=document.select("div[class=fontx]").first();
                Elements elements=element.select("a");
                if (elements.size()==0){
                    error();

                }else {
                    for (int i = 0; i <= elements.size() - 1; i++) {
                        cbsc_data = new data("http://ncerthelp.com" + elements.get(i).attr("href").substring(2).replace(" ", "%20"), elements.get(i).text());
                        arrayList.add(cbsc_data);

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            RecyclerView.Adapter adapter=new adeptor(arrayList,getApplicationContext());
            recyclerView2.setAdapter(adapter);
            RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
            recyclerView2.setLayoutManager(layoutManager);
        }
    }
    public void error(){
        Intent i=new Intent(this,error.class);
        startActivity(i);
    }
}

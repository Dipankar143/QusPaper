package com.quspaper.quspaper;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {
    private InterstitialAd interstitialAd;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdRequest newad=new AdRequest.Builder().build();
        interstitialAd=new InterstitialAd(getApplicationContext());
        interstitialAd.setAdUnitId("ca-app-pub-3325243029875259/3317314866");
        interstitialAd.loadAd(newad);
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                displayAd();
                i++;
            }
            public void onAdClosed() {
                // Load the next interstitial.
                if (i<3) {
                    interstitialAd.loadAd(new AdRequest.Builder().build());
                }
            }
        });
    }

    private void displayAd() {
        if (interstitialAd.isLoaded()){
            interstitialAd.show();
        }
    }

    public void uk(View view){
        //DownloadManager.Request request=new DownloadManager.Request(Uri.parse("https://media.licdn.com/mpr/mpr/shrinknp_200_200/AAEAAQAAAAAAAAk-AAAAJGUyZTQxOTEzLTU4MDQtNDc3My04NjNlLThiMjRmZDgzN2I3NA.jpg"));
        //request.setTitle("Photo");
        //request.setDescription("Downloading...");

        //request.allowScanningByMediaScanner();
        //request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        //request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"photo.jpg");
        //DownloadManager manager=(DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        //manager.enqueue(request);

        Intent intent=new Intent(MainActivity.this,uk.class);
        startActivity(intent);

    }
    public void cbsc(View view){
        Intent intent=new Intent(MainActivity.this,cbsc.class);
        startActivity(intent);
    }
}

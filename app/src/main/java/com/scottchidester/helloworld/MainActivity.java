package com.scottchidester.helloworld;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        VideoView videoView =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        //Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.one);
        Uri uri=Uri.parse("https://d2x1oedzzjp4du.cloudfront.net:443/uploads/production/videofiles/base/TTV-FatherandSon.mp4");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();

        videoView.start();




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

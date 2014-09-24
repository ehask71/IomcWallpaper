package com.highoctanebrands.iomcwallpaper;

import android.app.Activity;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.IOException;

import static com.highoctanebrands.iomcwallpaper.R.drawable.android_wallpaper;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //android wallpaper manager
        WallpaperManager myWallpaperManager = WallpaperManager
                .getInstance(getApplicationContext());
        try {
            //set wallpaper picture from resource here
            myWallpaperManager.setResource(android_wallpaper);
            Toast.makeText(getApplicationContext(), "Success set as wallpaper", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(),"Error on setting as wallpaper",Toast.LENGTH_SHORT).show();
        }
        finish();
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

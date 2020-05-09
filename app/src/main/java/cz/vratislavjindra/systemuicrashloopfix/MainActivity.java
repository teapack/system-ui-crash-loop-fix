package cz.vratislavjindra.systemuicrashloopfix;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            Bitmap wallpaper = BitmapFactory.decodeResource(getResources(), R.drawable.wallpaper);
            wallpaperManager.setBitmap(wallpaper);
        } catch (IOException ignored) {
        }
        finish();
    }
}
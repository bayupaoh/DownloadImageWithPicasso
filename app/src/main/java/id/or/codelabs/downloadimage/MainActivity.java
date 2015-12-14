package id.or.codelabs.downloadimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = "http://pbs.twimg.com/profile_images/1546448369/unikom-xx_400x400.png";
        ImageView imgView = (ImageView) findViewById(R.id.imgView);

        //download image with picasso
        Picasso.with(getApplicationContext()).load(url).into(imgView);
    }
}

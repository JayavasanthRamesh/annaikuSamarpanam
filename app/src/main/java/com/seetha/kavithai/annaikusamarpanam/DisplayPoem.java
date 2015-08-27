package com.seetha.kavithai.annaikusamarpanam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayPoem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        Bundle cont = this.getIntent().getExtras();

        TextView title = (TextView) this.findViewById(R.id.textView);
        TextView content = (TextView)  this.findViewById(R.id.textView3);
        ImageView img = (ImageView) this.findViewById(R.id.imageView);

        title.setText(cont.getString("title"));
        content.setText(cont.getString("content"));
        if(cont.getInt("img") == 0)
            img.setImageResource(R.drawable.img4);
        else
            img.setImageResource(cont.getInt("img"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);

    }

    public void gotoPayPal(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        intent.setData(Uri.parse("https://www.payumoney.com/paybypayumoney/#/F68F577F6F0E7DB2665D9F66CBE68AFD"));
        startActivity(intent);
    }

    public void gotoFB(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        intent.setData(Uri.parse("https://www.facebook.com/faizaan.ceg"));
        startActivity(intent);
    }
}


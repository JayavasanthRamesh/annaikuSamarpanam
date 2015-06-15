package com.seetha.kavithai.annaikusamarpanam;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class displayActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        Bundle cont=this.getIntent().getExtras();

        TextView title =  (TextView) this.findViewById(R.id.textView);
        TextView content = (TextView)  this.findViewById(R.id.textView3);
        ImageView img=(ImageView) this.findViewById(R.id.imageView);

        title.setText(cont.getString("title"));
        content.setText(cont.getString("content"));
        img.setImageDrawable(getResources().getDrawable(cont.getInt("img")));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


package com.seetha.kavithai.annaikusamarpanam;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class About extends Activity {

    private Intent intent;

    public void makeList(ListView lV) {
        Point p = new Point();
        WindowManager windowManager = this.getWindowManager();
        Display dP = windowManager.getDefaultDisplay();
        dP.getSize(p);
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(Integer.toString(p.x));
        arrayList.add("Section");
        arrayList.add("Item");

        intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        final MyAdapter arrayAdapter = new MyAdapter(getApplicationContext(), arrayList);
        lV.setAdapter(arrayAdapter);
        lV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        intent.setData(Uri.parse("https://github.com/faizaanceg/SYLAB-DOWNLOADER"));
                        break;
                    case 2:
                        intent.setData(Uri.parse("https://www.facebook.com/faizaan.ceg"));
                        break;
                    default:
                        return;
                }
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        ListView listView = (ListView) findViewById(R.id.aboutView);
        makeList(listView);

    }


}

class MyAdapter extends ArrayAdapter<String> {

    private Context context;
    private ArrayList<String> values;
    private Typeface italic;
    private Typeface bold;
    private Typeface normal;

    private String[] headings = {"Source Code", "Developers", "Mohammed Faizaan"};
    private String[] alias = {"v1.0.0", "PAD", "Aulisius F."};
    private int[] images = {R.drawable.fb, R.drawable.github};

    MyAdapter(Context context, ArrayList<String> values) {
        super(context, R.layout.list_about, values);
        this.context = context;
        this.values = values;
        bold = Typeface.createFromAsset(context.getAssets(), "fonts/RobotoCondensed-Bold.ttf");
        italic = Typeface.createFromAsset(context.getAssets(),"fonts/RobotoCondensed-Italic.ttf");
        normal = Typeface.createFromAsset(context.getAssets(), "fonts/RobotoCondensed-Regular.ttf");
    }

    @Override
    public View getView(int position, View v, ViewGroup root) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(position == 1){

            View rowView = inflater.inflate(R.layout.list_about_section, root, false);

            TextView textName = (TextView) rowView.findViewById(R.id.name);
            textName.setText(headings[position]);
            textName.setTypeface(bold);
            textName.setFocusable(false);
            textName.setClickable(false);

            Rect bounds = new Rect();
            textName.getPaint().getTextBounds(textName.getText().toString(), 0, textName.getText().length(), bounds);
            int textWidth = bounds.width();
            int widthScreen = Integer.parseInt(values.get(0));
            int paddingLR = widthScreen - textWidth;

            textName.setPadding(paddingLR/2, 5, 0, 5);

            return rowView;
        }

        View rowView = inflater.inflate(R.layout.list_about, root, false);

        TextView textName = (TextView) rowView.findViewById(R.id.name);
        textName.setText(headings[position]);
        textName.setTypeface(normal);

        TextView textAlias = (TextView) rowView.findViewById(R.id.alias);
        textAlias.setText(alias[position]);
        textAlias.setTypeface(italic);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.photo);
        imageView.setImageResource(position == 0 ? images[1] : images[0]);

        return rowView;

    }
}
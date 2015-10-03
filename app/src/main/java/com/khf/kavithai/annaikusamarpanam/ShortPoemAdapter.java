package com.khf.kavithai.annaikusamarpanam;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

public class ShortPoemAdapter implements ListAdapter {

    private Context context;
    private List<ShortPoem> values;
    private Bitmap b;
    private Resources res;

    ShortPoemAdapter(Context c, Resources r, List<ShortPoem> v){
        context = c;
        values = v;
        res = r;

    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getItemViewType(int position) {
        return position % 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            switch (position % 2) {
                case 1:
                    convertView =  inflater.inflate(R.layout.card, parent, false);
                    break;
                default:
                    convertView =  inflater.inflate(R.layout.card1, parent, false);
            }
        }
        TextView title = (TextView) convertView.findViewById(R.id.textView);
        title.setText(values.get(position).title);
        TextView content = (TextView) convertView.findViewById(R.id.textView2);
        content.setText(values.get(position).content);

        ImageView pic = (ImageView) convertView.findViewById(R.id.imageView);
        b = decodeSampledBitmapFromPath(position, 40, 40);
        pic.setImageBitmap(b);
        return convertView;
    }

    @Override
    public int getCount() {
        return values.size();
    }

    @Override
    public Object getItem(int position) {
        return values.get(position);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public Bitmap decodeSampledBitmapFromPath(int position, int reqWidth,
                                                     int reqHeight) {

        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        //BitmapFactory.decodeFile(path, options);
        BitmapFactory.decodeResource(res, values.get(position).image, options);
        options.inSampleSize = calculateInSampleSize(options, reqWidth,
                reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;

        //Bitmap bmp = BitmapFactory.decodeFile(path, options);
        return BitmapFactory.decodeResource(res, values.get(position).image, options);
    }

    public static int calculateInSampleSize(BitmapFactory.Options options,
                                            int reqWidth, int reqHeight) {

        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {
            if (width > height) {
                inSampleSize = Math.round((float) height / (float) reqHeight);
            } else {
                inSampleSize = Math.round((float) width / (float) reqWidth);
            }
        }
        return inSampleSize;
    }
}


package com.seetha.kavithai.annaikusamarpanam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.widget.Toast;

import java.util.List;

public class kavithaAdapter extends RecyclerView.Adapter<kavithaAdapter.ContactViewHolder> {

    private List<kavithai> list;
    private Context ctx;
    static int stp=0;

    public kavithaAdapter(Context context,List<kavithai> List) {
        this.ctx=context;
        this.list = List;
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onBindViewHolder(ContactViewHolder contactViewHolder, int i) {

        final kavithai ci = list.get(i);
        contactViewHolder.object=ci;
        contactViewHolder.title.setText(ci.title);
        contactViewHolder.short_content.setText(ci.short_content);
        contactViewHolder.img.setImageDrawable(ctx.getResources().getDrawable(ci.image));

        contactViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      Intent intent=new Intent(ctx,displayActivity.class);
                      Bundle data=new Bundle();
                      data.putString("title",ci.title);
                      data.putString("content",ci.long_content);
                      data.putInt("img",ci.image);
                      intent.putExtras(data);
                      ctx.startActivity(intent);
                  }
        }

        );
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView;
        itemView = (stp % 2 == 1) ? LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card1, viewGroup, false);
        stp++;
        return new ContactViewHolder(itemView);

    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder  {

        protected TextView title;
        protected TextView long_content;
        protected TextView short_content;
        protected ImageView img;
        private kavithai object;

        public ContactViewHolder(View v) {
            super(v);
            title =  (TextView) v.findViewById(R.id.textView);
            short_content = (TextView)  v.findViewById(R.id.textView2);
            img=(ImageView) v.findViewById(R.id.imageView);
        }


    }


}

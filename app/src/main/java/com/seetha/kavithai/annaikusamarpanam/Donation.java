package com.seetha.kavithai.annaikusamarpanam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Donation extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View donate = inflater.inflate(R.layout.fragment_donate, null);

        TextView textView = (TextView) donate.findViewById(R.id.textView);
        textView.setText("\nவணக்கம் அன்பர்களே,\n" +
                "\t\tநீங்கள் இங்கே நன்கொடை அளிப்பதன் மூலமாக சேகரிக்கப்படும் முழு தொகையும் ஏழை மாணவர்களின் கல்விக்கட்டணம் செலுத்துவதற்காக பயன்படுத்தப்பட உள்ளது என்பதை உங்களிடம் அறிவிக்க கடமைப்பட்டுள்ளேன். நீங்கள் செலுத்த விரும்பும் தொகையை உள்ளீடு செய்து, உங்களது விவரங்களை பதிவு செய்த பின்னர் நன்கொடை செலுத்தலாம். உங்களது ஆதரவினை அளித்தமைக்கு நன்றி.\n" +
                "\n" +
                "\n" +
                "சமர்ப்பணம்\n" +
                "இப்படிக்கு\n" +
                "சீதாராம்குமார் @ கவிராம்");

        return donate;
    }



}

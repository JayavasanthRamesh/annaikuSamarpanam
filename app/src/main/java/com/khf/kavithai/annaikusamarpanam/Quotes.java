package com.khf.kavithai.annaikusamarpanam;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Quotes extends Fragment {

    public Quotes() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View donate = inflater.inflate(R.layout.fragment_quotes, null);

        TextView textView = (TextView) donate.findViewById(R.id.quotes);
        textView.setText(String.format("பெரியத் தோல்வியைச் சந்திக்க வேண்டுமாயின் ,அதிகமாக ஆசைப்படு.\n\nஅனுபவத்தினைக் கற்றுக்கொள்வதைவிட ,உன்னை சாதிக்க வைக்கும்போதுதான் அனுபவம் முழுமை அடைகிறது.\n\nஇரு கைகளிருந்தும்,நம்பிக்கை இல்லாமல் வாழ்ந்தால் அந்த வாழ்க்கையே ஊனம்தான்.\n\nபிரிவினால் ஒருவரை முழுமையாக நேசிக்க முடியுமேயானால் ,அந்த பிரிவினையும் முழுமனதோடு காதலி..\n\nபாசத்தை அளவிடும் ஒரு கருவி பிரிவு...\n\nசுயநலமும் போற்றுதலுக்குரியது,அடுத்தவரைப் பாதிக்காத வரையில் மட்டும்.\n\nஎந்தப்போட்டியானாலும் சிலரின் தோல்வியே, சிலருக்கு வெற்றி.\n\nநீ யாருக்காகவும் காத்திரு(க்காவிடிலும்) , உனக்காக யாரையும் காத்திருக்க வைக்காதே.\n\nகத்தியின் வலிமை அதன் கூரிய முனையிலன்று.அதைப் பயன்படுத்துவரின் புத்தின் சக்தியில் உண்டு.\n\nநேரம் தவறாமைக்கு சிறந்த முன்மாதிரி கடிகார முட்களே.\n\nதவறு செய்யும்போது வரும் துணிச்சல், அதற்காக மன்னிப்புக் கோரும்போது வருவது கிடையாது.\n\nஒருவரோடு ஒப்பிட்டுப் பேசும்போது , அந்தக்கணம் உயர்ந்தவனும் தாழ்ச்சியடைகிறான்.\n\nகனவுகள்கூட மாறலாம்,ஆனால் கனவுகளை அடைவதற்கான முயற்சி மட்டும் மாறக்கூடாது.\n\n")
        );

        return donate;

    }


}

package com.seetha.kavithai.annaikusamarpanam;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recList = (RecyclerView) findViewById(R.id.cardList);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        kavithaAdapter ca = new kavithaAdapter(this,populateKavithai());
        recList.setAdapter(ca);

    }

    private List<kavithai> populateKavithai() {

        List<kavithai> kavithaiList=new ArrayList<kavithai>();

        /* first kavithai */

        kavithai temp=new kavithai();

        temp.title="பெண்ணின் நிலை";

        temp.short_content="ரத்த கடலுல\n" +
                "கப்பலாட்டம் மிதக்குதடி\n" +
                "ஆளில்லாத\n" +
                "என் கர்ப்பப்பை....\n" +
                "\n" ;

        temp.long_content=
                "நல்லவேளையா\n" +
                "உன்ன கொன்னாங்க...!\n" +
                "இல்லன\n" +
                "நீ சமஞ்சதும் இரண்டுநாள்\n" +
                "ஜமீனுக்கு சொந்தமாகனூம்....\n" +
                "\n" +
                "கணவன்\n" +
                "கட்டைக்கு சென்றதும்\n" +
                "உடன் கட்டை\n" +
                "ஏத்துனாங்க...\n" +
                "\n" +
                "இப்படி இருந்தகாலம்\n" +
                "இப்ப இறந்தகாலமாச்சு... \n" +
                "காலம் மாறையில\n" +
                "கலாச்சாரமும் மாறிடுச்சு....\n";

        temp.image=R.drawable.img1;
        kavithaiList.add(temp);

        /* second kavithai */

        temp=new kavithai();

        temp.title="விற்கப்பட்டவள் மீட்கப்பட்டாள்";

        temp.short_content="\n" +
                "கள்ளிச்செடிக்கு \n" +
                "இறையாகியிருக்கலாம் \n" +
                "காமக்கொடியவர்களின் \n" +
                "பசிக்கு இறையாகிவிட்டாளே\n" ;

        temp.long_content=
                "\n" +
                        "சுட்டெரிக்கும் வெயிலில் \n" +
                        "நடந்த கால்கள் \n" +
                        "சூடுபட்டு கிடக்கிறது \n" +
                        "தப்பிக்க முயன்றதால்...\n" +
                        "\n" +
                        "கள்ளிச்செடிக்கு \n" +
                        "இறையாகியிருக்கலாம் \n" +
                        "காமக்கொடியவர்களின் \n" +
                        "பசிக்கு இறையாகிவிட்டாளே...\n" +
                        "\n" +
                        "என்னவிலை கேட்டாலும் \n" +
                        "கொடுப்பேன் \n" +
                        "எனக்கொரு மணிநேரம் \n" +
                        "அவள் கொடுத்தால்...\n" +
                        "\n" +
                        "கண்டம் முடிந்தது போலும் \n" +
                        "கண்டம்தாண்டி \n" +
                        "விற்கப்பட்டவள் \n" +
                        "மீட்கப்பட்டாள் என் மனைவியாக... \n" +
                        "\n" +
                        "பலரின் இச்சை ஆசைக்கு \n" +
                        "கசைந்து எறியப்பட்ட \n" +
                        "காகிதம்தான் அவள்..\n" +
                        "தன்மீது எழுதப்பட்ட \n" +
                        "கவிதையை சுமப்பதுபோல \n";

        temp.image=R.drawable.img2;
        kavithaiList.add(temp);

        /* third kavithai */

        temp=new kavithai();

        temp.title="அன்பு மகளான அம்மா்";

        temp.short_content="கல்லூரி விடுதியில் \n" +
                "வாரத்தில் ஒருநாள்\n" +
                "அனைவரும் அன்னையின்\n" +
                "அணைப்பில்...\n" +
                "நான்மட்டும் தனிமையில்...\n" ;

        temp.long_content=
                "\n" +
                        "விண்ணின் மழைத்துளியும் \n" +
                        "தோற்றுப்போகும்\n" +
                        "என் இதயத்திலிருந்துவரும்\n" +
                        "இரத்தகசிவிடம்\n" +
                        "அன்னை இல்லாதவேதனையில்....\n" +
                        "\n" +
                        "நான் பிறந்ததும்\n" +
                        "விரைவிலே சென்றது\n" +
                        "எனக்கு மகளாக \n" +
                        "பிறக்கவேண்டுமென்ற வரம்\n" +
                        "வாங்கத்தான்போலும்...\n";



        temp.image=R.drawable.img3;
        kavithaiList.add(temp);

        /* fourth kavithai */
        temp=new kavithai();

        temp.title="அன்பு மகளான அம்மா";

        temp.short_content="கல்லூரி விடுதியில் \n" +
                "வாரத்தில் ஒருநாள்\n" +
                "அனைவரும் அன்னையின்\n" +
                "அணைப்பில்...\n" +
                "நான்மட்டும் தனிமையில்...\n" ;

        temp.long_content=
                "\n" +
                        "விண்ணின் மழைத்துளியும் \n" +
                        "தோற்றுப்போகும்\n" +
                        "என் இதயத்திலிருந்துவரும்\n" +
                        "இரத்தகசிவிடம்\n" +
                        "அன்னை இல்லாதவேதனையில்....\n" +
                        "\n" +
                        "நான் பிறந்ததும்\n" +
                        "விரைவிலே சென்றது\n" +
                        "எனக்கு மகளாக \n" +
                        "பிறக்கவேண்டுமென்ற வரம்\n" +
                        "வாங்கத்தான்போலும்...\n";

        temp.image=R.drawable.img4;
        kavithaiList.add(temp);



        /* fifth kavithai */
        temp=new kavithai();

        temp.title="அன்பு மகளான அம்மா்";

        temp.short_content="கல்லூரி விடுதியில் \n" +
                "வாரத்தில் ஒருநாள்\n" +
                "அனைவரும் அன்னையின்\n" +
                "அணைப்பில்...\n" +
                "நான்மட்டும் தனிமையில்...\n" ;

        temp.long_content=
                "\n" +
                        "விண்ணின் மழைத்துளியும் \n" +
                        "தோற்றுப்போகும்\n" +
                        "என் இதயத்திலிருந்துவரும்\n" +
                        "இரத்தகசிவிடம்\n" +
                        "அன்னை இல்லாதவேதனையில்....\n" +
                        "\n" +
                        "நான் பிறந்ததும்\n" +
                        "விரைவிலே சென்றது\n" +
                        "எனக்கு மகளாக \n" +
                        "பிறக்கவேண்டுமென்ற வரம்\n" +
                        "வாங்கத்தான்போலும்...\n";

        temp.image=R.drawable.img5;
        kavithaiList.add(temp);

        /* sixth kavithai */
        temp=new kavithai();

        temp.title="அன்பு மகளான அம்மா்";

        temp.short_content="கல்லூரி விடுதியில் \n" +
                "வாரத்தில் ஒருநாள்\n" +
                "அனைவரும் அன்னையின்\n" +
                "அணைப்பில்...\n" +
                "நான்மட்டும் தனிமையில்...\n" ;

        temp.long_content=
                "\n" +
                        "விண்ணின் மழைத்துளியும் \n" +
                        "தோற்றுப்போகும்\n" +
                        "என் இதயத்திலிருந்துவரும்\n" +
                        "இரத்தகசிவிடம்\n" +
                        "அன்னை இல்லாதவேதனையில்....\n" +
                        "\n" +
                        "நான் பிறந்ததும்\n" +
                        "விரைவிலே சென்றது\n" +
                        "எனக்கு மகளாக \n" +
                        "பிறக்கவேண்டுமென்ற வரம்\n" +
                        "வாங்கத்தான்போலும்...\n";

        temp.image=R.drawable.img5;
        kavithaiList.add(temp);

        /* seventh kavithai */
        temp=new kavithai();

        temp.title="அன்பு மகளான அம்மா்";

        temp.short_content="கல்லூரி விடுதியில் \n" +
                "வாரத்தில் ஒருநாள்\n" +
                "அனைவரும் அன்னையின்\n" +
                "அணைப்பில்...\n" +
                "நான்மட்டும் தனிமையில்...\n" ;

        temp.long_content=
                "\n" +
                        "விண்ணின் மழைத்துளியும் \n" +
                        "தோற்றுப்போகும்\n" +
                        "என் இதயத்திலிருந்துவரும்\n" +
                        "இரத்தகசிவிடம்\n" +
                        "அன்னை இல்லாதவேதனையில்....\n" +
                        "\n" +
                        "நான் பிறந்ததும்\n" +
                        "விரைவிலே சென்றது\n" +
                        "எனக்கு மகளாக \n" +
                        "பிறக்கவேண்டுமென்ற வரம்\n" +
                        "வாங்கத்தான்போலும்...\n";

        temp.image=R.drawable.img5;
        kavithaiList.add(temp);


        return kavithaiList;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

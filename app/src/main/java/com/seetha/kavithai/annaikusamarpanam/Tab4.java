package com.seetha.kavithai.annaikusamarpanam;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Tab4 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_main, null);

        RecyclerView recList = (RecyclerView) rootView.findViewById(R.id.cardList);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity().getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        kavithaAdapter ca = new kavithaAdapter(getActivity().getApplicationContext(), populateKavithai());
        recList.setAdapter(ca);

        return rootView;
    }

    private List<kavithai> populateKavithai() {

        List<kavithai> kavithaiList = new ArrayList<>();

        kavithai temp;

                  /* 88th kavithai */
        temp=new kavithai();

        temp.title="கௌரவ கொலைகள்";

        temp.short_content="கருவறையில்\n" +
                "சுமந்து,உயிர்மூச்சு\n" +
                "தந்ததாயே\n" +
                "இன்று கல்லறை\n" +
                "என்னை சுமக்கநஞ்சு\n" +
                "தந்து கொன்றாயே... \n" ;

        temp.long_content=
                "\n" +
                        "விடுதலையடைந்த\n" +
                        "பின்னரும் இன்னும் \n" +
                        "சில தலைமுறை\n" +
                        "மாறவில்லை..\n" +
                        "\n" +
                        "சாதி,மதம்,பேதம்\n" +
                        "பார்க்காமல்\n" +
                        "இரண்டு உள்ளம்\n" +
                        "உன்னதமாய் சேர்வதுதான்\n" +
                        "காதல்...\n" +
                        "\n" +
                        "பெற்றோரின் ஆசியுடன்வாழ\n" +
                        "பலமுறை\n" +
                        "மண்டியிட்டு முறையிட்டும்\n" +
                        "மனமிறங்க மறுக்கிறது\n" +
                        "பெற்றமனம்....\n" +
                        "\n" +
                        "பெற்றவர்கள் கூட\n" +
                        "சேர்த்து வைக்கத்தான்\n" +
                        "எண்ணுவர்\n" +
                        "ஆனால்,மற்றவர்கள்\n" +
                        "வார்த்தையாலே பெற்றவரை\n" +
                        "கொன்றுவிடுவரே...\n" +
                        "\n" +
                        "தாழ்த்தப்பட்டவளை\n" +
                        "காதலித்த மகனை\n" +
                        "வீட்டைவிட்டு வெளியே\n" +
                        "அனுப்புவார்கள்....\n" +
                        "\n" +
                        "தாழ்த்தப்பட்டவனை\n" +
                        "காதலித்த மகளை\n" +
                        "உலகைவிட்டே அனுப்பிடுவார்கள்....\n" +
                        "\n" +
                        "கருவறையில்\n" +
                        "சுமந்து,உயிர்மூச்சு\n" +
                        "தந்ததாயே\n" +
                        "இன்று கல்லறை\n" +
                        "என்னை சுமக்கநஞ்சு\n" +
                        "தந்து கொன்றாயே...\n" +
                        "\n" +
                        "தன்மானம் காக்க\n" +
                        "அன்புமனதையும்\n" +
                        "கொல்லமுயல்வதேன்..?\n" +
                        "\n" +
                        "சுமூகமான பேச்சு \n" +
                        "சுகமான வாழ்வைப்\n" +
                        "பெற்றுத்தருமே...\n" +
                        "\n" +
                        "குலத்தினால் தாழ்ந்தவர்\n" +
                        "யாருமில்லை...\n" +
                        "அன்பு கொண்டவர் \n" +
                        "உயர்ந்தவரென்று\n" +
                        "கருதுங்கள்..\n" +
                        "\n" +
                        "அன்பில்லாதவருக்கு\n" +
                        "அன்பைக்கொடுத்து\n" +
                        "உயர்ந்தவராகுவதே\n" +
                        "உன்னதமான செயல், \n" +
                        "இது பேராசை என்றாலும் \n" +
                        "சமத்துவம் பெறஆசைதான்... \n" ;

        temp.image=R.drawable.img88;
        kavithaiList.add(temp);

                /* 89th kavithai */
        temp=new kavithai();

        temp.title="இதுவும் அதிசயமே!";

        temp.short_content="பிரிந்துபோன \n" +
                "காதலனுக்காக\n" +
                "கண்ணீரால் தாஜ்மஹால்\n" +
                "கட்டினாள்... \n" ;


        temp.long_content=
                "\n" +
                        "இறந்துபோன\n" +
                        "காதலிக்காக\n" +
                        "கற்களால் தாஜ்மஹால்\n" +
                        "கட்டினான்....\n" +
                        "\n" +
                        "பிரிந்துபோன \n" +
                        "காதலனுக்காக\n" +
                        "கண்ணீரால் தாஜ்மஹால்\n" +
                        "கட்டினாள்...\n" +
                        "ஆம்...\n" +
                        "கடலென சேர்ந்தகண்ணீர்\n" +
                        "பனிக்கட்டியான பின்னர்...\n" +
                        "\n" +
                        "பெண்ணே!\n" +
                        "உன்னையும் இவ்வுலகம்\n" +
                        "நினைவில்கொள்ளும்\n" +
                        "உன்னைப்போல் எவரேனும் \n" +
                        "காதலிக்கும் வரை... \n" ;

        temp.image=R.drawable.img89;
        kavithaiList.add(temp);

                /* 90th kavithai */
        temp=new kavithai();

        temp.title=" எது எல்லை";

        temp.long_content=
                "\n" +
                        "ஒரே புள்ளியில்\n" +
                        "சுற்றிக்கொண்டிருக்கும்\n" +
                        "பம்பரத்தின் ஆணியும்...\n" +
                        "ஓயாமல் சுற்றிக்கொண்டிருக்கும்\n" +
                        "கடிகாரத்தின் முட்களும்...\n" +
                        "காலங்கள் ஓடினால் \n" +
                        "தேய்ந்துவிடும்...\n" +
                        "\n" +
                        "வயதுமுதிர்ந்த பின்னரும்\n" +
                        "முழுவளர்ச்சியை எட்டாமல்\n" +
                        "வளர்ந்து கொண்டிருக்கிறது\n" +
                        "உன்மீதான எனதுகாதல்...\n" +
                        "\n" +
                        "காற்றைப்பிடிக்க முடியாது\n" +
                        "நீரில் எழுதமுடியாது\n" +
                        "வானத்தை அளக்கமுடியாது\n" +
                        "தீயை தொடமுடியாது\n" +
                        "நிலம்போல் தாங்கமுடியாது...\n" +
                        "\n" +
                        "அதேபோல் உன்மீதான \n" +
                        "என்காதலை முழுமையாக\n" +
                        "என்னால் வர்ணிக்கமுடியாது... \n" ;

        temp.image=R.drawable.img4;
        kavithaiList.add(temp);

                /* 91st kavithai */
        temp=new kavithai();

        temp.title=" நீங்காத நினைவுகள்";

        temp.long_content=
                "\n" +
                        "சூரியன் மறைந்தபின்னர்\n" +
                        "நிலவின் வெளிச்சம்\n" +
                        "பூமிக்கு....\n" +
                        "\n" +
                        "மழைநின்ற பின்னர் \n" +
                        "மரத்தின் தூரல்\n" +
                        "நிலத்திற்கு... \n" +
                        "\n" +
                        "அதுபோல்,\n" +
                        "தொலைவில் நீசென்றபின்னர்\n" +
                        "உன்அழகிய நினைவுகள்\n" +
                        "எனக்கு நீ திரும்ப வரும்வரையில்... \n" ;

        temp.image=R.drawable.img4;
        kavithaiList.add(temp);


                       /* 92nd kavithai */
        temp=new kavithai();

        temp.title="காதலின் மொழி";


        temp.long_content=
                "\n" +
                        "உலகமொழிகள் அனைத்தையும்\n" +
                        "கற்றுக்கொண்டேன்\n" +
                        "என்காதலை அவளிடம் \n" +
                        "கூறுவதற்கு. \n" +
                        " \n" +
                        "உலகிலே இல்லாத \n" +
                        "ஒரு மொழியில்\n" +
                        "காதலைக் கூறினாள் \n" +
                        "அவளது பார்வையில்... \n" ;


        temp.image=R.drawable.img4;
        kavithaiList.add(temp);


                /* 93rd kavithai */
        temp=new kavithai();

        temp.title="சொர்க்கமும் நரகமும்";

        temp.long_content=
                "\n" +
                        "அனைவருக்கும்\n" +
                        "இறந்த பின்னர்தான் \n" +
                        "சொர்க்கமும் நரகமும்...\n" +
                        "எனக்கோ, நீ\n" +
                        "சென்ற பின்னர்தான்\n" +
                        "சொர்க்கமும் நரகமும்...\n" +
                        " ஆம்,\n" +
                        "உன் நினைவுகளைத்\n" +
                        "தரும் இடங்கள் சொர்க்கம் \n" +
                        "தரா இடங்கள் நரகம் \n" ;

        temp.image=R.drawable.img4;
        kavithaiList.add(temp);


                /* 94th kavithai */
        temp=new kavithai();

        temp.title="கடலும்,காதலும்";

        temp.long_content=
                "\n" +
                        "கடலலையாய் அடுத்தடுத்து\n" +
                        "சோதனைகள் சோதித்தாலும்,\n" +
                        "\n" +
                        "சூறாவளியாய் துன்பங்கள்\n" +
                        "சுழற்றி அடித்தாலும்,\n" +
                        "\n" +
                        "சுனாமிபோல் கண்ணீர்\n" +
                        "வெள்ளம் கரைபுரண்டாலும்\n" +
                        "\n" +
                        "திசைதெரியாத நடுக்கடலிலும்\n" +
                        "உனக்கு காதல் திசைகாட்டும்\n" +
                        "\n" +
                        "இருவரின் மனது உருகலாம் \n" +
                        "உடைந்து மட்டும் விடக்கூடாது\n" +
                        "உன் காதல் என்றாவது\t\n" +
                        "வெற்றி எனும் கரைசேரும்\n" ;

        temp.image=R.drawable.img4;
        kavithaiList.add(temp);


        return kavithaiList;
    }
}

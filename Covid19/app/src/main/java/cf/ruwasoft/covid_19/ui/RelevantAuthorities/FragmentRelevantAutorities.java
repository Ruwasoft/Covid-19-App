package cf.ruwasoft.covid_19.ui.RelevantAuthorities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import cf.ruwasoft.covid_19.R;

public class FragmentRelevantAutorities extends Fragment {

    Button Btn550,Btn920,Btn119,Btn117,Btn1990 ;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_relevant_authorities, container, false);

        Btn550=root.findViewById(R.id.button_0114354550);
        Btn920=root.findViewById(R.id.button_0113401920);
        Btn119=root.findViewById(R.id.button_119);
        Btn117=root.findViewById(R.id.button_117);
        Btn1990=root.findViewById(R.id.button_1990);

        Btn550.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone_number="0114354550";
                Intent i = new Intent(Intent.ACTION_DIAL);
                String p = "tel:" +phone_number;
                i.setData(Uri.parse(p));
                startActivity(i);

            }
        }); // end oc 550 call

        Btn920.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone_number="0113401920";
                Intent i = new Intent(Intent.ACTION_DIAL);
                String p = "tel:" +phone_number;
                i.setData(Uri.parse(p));
                startActivity(i);
            }
        });  //end of 920 call

        Btn119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone_number="119";
                Intent i = new Intent(Intent.ACTION_DIAL);
                String p = "tel:" +phone_number;
                i.setData(Uri.parse(p));
                startActivity(i);

            }
        });  //end of call 119

        Btn117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone_number="117";
                Intent i = new Intent(Intent.ACTION_DIAL);
                String p = "tel:" +phone_number;
                i.setData(Uri.parse(p));
                startActivity(i);

            }
        });  //end of 117 call

        Btn1990.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone_number="1990";
                Intent i = new Intent(Intent.ACTION_DIAL);
                String p = "tel:" +phone_number;
                i.setData(Uri.parse(p));
                startActivity(i);

            }
        });  //end of 1990 call

        return root;
    }
}

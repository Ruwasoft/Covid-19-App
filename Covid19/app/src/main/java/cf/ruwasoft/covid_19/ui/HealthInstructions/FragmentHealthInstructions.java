package cf.ruwasoft.covid_19.ui.HealthInstructions;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import cf.ruwasoft.covid_19.R;
import cf.ruwasoft.covid_19.R.*;

public class FragmentHealthInstructions extends Fragment {

    Button Rogalakshana,Pathirenne,AthSodanna,FaceMAsk,Daid;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(layout.fragment_health_instructions, container, false);

        Rogalakshana=root.findViewById(id.button1);
        Pathirenne=root.findViewById(id.button2);
        AthSodanna=root.findViewById(id.button3);
        FaceMAsk=root.findViewById(id.button4);
        Daid=root.findViewById(id.button5);


        Rogalakshana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String video_id="KUA9-scTqBc";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://" + video_id));
                startActivity(intent);
            }
        });

        Pathirenne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String video_id="9QyafMB53LU";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://" + video_id));
                startActivity(intent);
            }
        });

        AthSodanna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String video_id="7cWxYnd5QM8";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://" + video_id));
                startActivity(intent);
            }
        });

        FaceMAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String video_id="ZYIGrf8msQI";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://" + video_id));
                startActivity(intent);
            }
        });

        Daid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String video_id="XEFXGBHTkzw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://" + video_id));
                startActivity(intent);
            }
        });

        return root;
    }
}

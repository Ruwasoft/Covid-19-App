package cf.ruwasoft.covid_19.ui.WorldStates;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import cf.ruwasoft.covid_19.R;

public class FragmentWorldStatus extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_world_status, container, false);

        WebView webView = (WebView)root.findViewById(R.id.webView);
//you can load an html code
        webView.loadData("yourCode Html to load on the webView " , "text/html" , "utf-8");
// you can load an URL
        webView.loadUrl("https://www.worldometers.info/coronavirus/?utm_campaign=homeAdUOA?Si");

        return root;
    }
}

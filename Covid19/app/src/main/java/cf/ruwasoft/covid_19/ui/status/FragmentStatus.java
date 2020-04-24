package cf.ruwasoft.covid_19.ui.status;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import cf.ruwasoft.covid_19.R;



public class FragmentStatus extends Fragment {

    TextView Pations;
    Button View;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_status, container, false);

        WebView webView = (WebView)root.findViewById(R.id.webView);
//you can load an html code
        webView.loadData("yourCode Html to load on the webView " , "text/html" , "utf-8");
// you can load an URL
        webView.loadUrl("https://www.worldometers.info/coronavirus/country/sri-lanka/");




        return root;
    }



}
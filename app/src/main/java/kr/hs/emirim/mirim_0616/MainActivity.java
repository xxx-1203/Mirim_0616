package kr.hs.emirim.mirim_0616;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost host = getTabHost();

        TabHost.TabSpec spec1 = host.newTabSpec("tab1"). setIndicator("eve");
        spec1.setContent(R.id.tab1);
        host.addTab(spec1);

        TabHost.TabSpec spec2 = host.newTabSpec("tab2"). setIndicator("papy");
        spec2.setContent(R.id.tab2);
        host.addTab(spec2);

        TabHost.TabSpec spec3 = host.newTabSpec("tab3"). setIndicator("sans");
        spec3.setContent(R.id.tab3);
        host.addTab(spec3);

        host.setCurrentTab(1);
    }
}
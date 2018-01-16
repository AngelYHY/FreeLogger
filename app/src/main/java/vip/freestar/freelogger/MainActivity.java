package vip.freestar.freelogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vip.freestar.mylogger.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.init();
        Logger.e("",777,888);
    }
}

package loglibs.com.logslibexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import loglibs.com.logslib.LogsLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogsLib.d(new String[]{"anything"});
    }
}

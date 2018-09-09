package nda.siyad.automation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

public class Activity_scrren10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrren10);
        Spinner s1=findViewById(R.id.spinner);
        ArrayList<String> A1=new ArrayList<>();
        A1.add("select");

    }
}

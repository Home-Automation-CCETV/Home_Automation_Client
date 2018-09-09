package nda.siyad.automation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.widget.Spinner;

import java.util.ArrayList;

public class Activity_screen9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen9);
        Spinner s = findViewById(R.id.spinner);
        ArrayList<String> A = new ArrayList<>();
        A.add("select");

    }
}

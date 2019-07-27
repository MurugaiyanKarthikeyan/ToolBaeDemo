package com.ki.toolbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRefreshList(View view) {
        Toast.makeText(getApplicationContext(),"Refresh clicked",Toast.LENGTH_LONG).show();
    }
}

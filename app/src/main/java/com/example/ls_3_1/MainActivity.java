package com.example.ls_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList cauntryList =new ArrayList<>();
    private RecyclerView rvCountry;
    private CarAdapter adapter =new CarAdapter(cauntryList);
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCountry = findViewById(R.id.accct);
        loaData();
        rvCountry.setAdapter(adapter);

    }

    private void loaData() {
        cauntryList.add("Ну как вам");
        cauntryList.add("BMW");
        cauntryList.add("Tesla");
        cauntryList.add("GMC");
        cauntryList.add("Merkuri");
        cauntryList.add("KIA");
        cauntryList.add("Mercedes");
        cauntryList.add("DS");
        cauntryList.add("MINI");
        cauntryList.add("Bentley");
        cauntryList.add("ferrari");
        cauntryList.add("ZAZ");
        cauntryList.add("VOLVO");
    }
}
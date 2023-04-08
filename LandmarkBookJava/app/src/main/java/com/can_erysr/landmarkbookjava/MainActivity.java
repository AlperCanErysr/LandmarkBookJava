package com.can_erysr.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.can_erysr.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        landmarkArrayList = new ArrayList<>();

        //Data
        Landmark pisa = new Landmark("Pisa","Italy",R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel","France",R.drawable.eiffel);
        Landmark collessium = new Landmark("Collessium","Italy",R.drawable.collessium);
        Landmark londonBridge = new Landmark("London Bridge","UK",R.drawable.london);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(collessium);
        landmarkArrayList.add(londonBridge);

        //Adapter
         //ListView

        //Mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);



    }
}
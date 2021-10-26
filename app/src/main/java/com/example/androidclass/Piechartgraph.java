package com.example.androidclass;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Piechartgraph extends AppCompatActivity {

    PieChart pieChart;
    ArrayList<PieEntry> pieEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piechartgraph);

        pieChart = findViewById(R.id.pichat);
        pieEntries = new ArrayList<>();

        pieEntries.add(new PieEntry((float) 1005.55,"2000"));
        pieEntries.add(new PieEntry((float) 2005.12,"2001"));
        pieEntries.add(new PieEntry((float) 3005.36,"2002"));
        pieEntries.add(new PieEntry((float) 4005.45,"2003"));
        pieEntries.add(new PieEntry((float) 5005.57,"2004"));
        pieEntries.add(new PieEntry((float) 6005.755,"2005"));

        PieDataSet pieDataSet = new PieDataSet(pieEntries,"Marketing");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextSize(17f);
        pieDataSet.setValueTextColor(Color.BLACK);


        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.setCenterText("Marketing");
        pieChart.animate();

    }
}
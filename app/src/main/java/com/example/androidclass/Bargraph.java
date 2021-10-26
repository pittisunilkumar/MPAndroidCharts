package com.example.androidclass;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Bargraph extends AppCompatActivity {

    BarChart barChart;
    ArrayList<BarEntry> barEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bargraph);
        barChart = findViewById(R.id.barchat);
        barEntries = new ArrayList<>();

        barEntries.add(new BarEntry(2000,(float)120.5));
        barEntries.add(new BarEntry(2001,(float)220.5));
        barEntries.add(new BarEntry(2002,(float)320.5));
        barEntries.add(new BarEntry(2003,(float)420.5));
        barEntries.add(new BarEntry(2004,(float)520.5));
        barEntries.add(new BarEntry(2005,(float)620.5));

        BarDataSet barDataSet = new BarDataSet(barEntries,"customers");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        barDataSet.setValueTextColor(Color.BLUE);
        barDataSet.setValueTextSize(17f);


        BarData barData = new BarData(barDataSet);
        barChart.setData(barData);

        barChart.animateY(2000);

    }
}
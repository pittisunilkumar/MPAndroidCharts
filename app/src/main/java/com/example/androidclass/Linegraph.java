package com.example.androidclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

public class Linegraph extends AppCompatActivity {

    LineChart lineChart;
    ArrayList<Entry> entries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linegraph);
        lineChart = findViewById(R.id.linechat);
        entries = new ArrayList<>();

        entries.add(new Entry(0,20));
        entries.add(new Entry(1,24));
        entries.add(new Entry(2,10));
        entries.add(new Entry(3,14));
        entries.add(new Entry(4,19));

        LineDataSet lineDataSet = new LineDataSet(entries,"LineGraph");
        LineData lineData = new LineData(lineDataSet);

        lineChart.setData(lineData);


    }
}
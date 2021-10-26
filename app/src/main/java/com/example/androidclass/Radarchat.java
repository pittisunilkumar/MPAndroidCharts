package com.example.androidclass;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;

public class Radarchat extends AppCompatActivity {

    RadarChart radarChart;
    ArrayList<RadarEntry> radarEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radarchat);

        radarEntries = new ArrayList<>();
        radarChart = findViewById(R.id.radetchatid);

        radarEntries.add(new RadarEntry(450));
        radarEntries.add(new RadarEntry(672));
        radarEntries.add(new RadarEntry(532));
        radarEntries.add(new RadarEntry(250));
        radarEntries.add(new RadarEntry(789));
        radarEntries.add(new RadarEntry(310));

        RadarDataSet radarDataSet = new RadarDataSet(radarEntries,"website");
        radarDataSet.setColor(Color.RED);
        radarDataSet.setLineWidth(2f);
        radarDataSet.setValueTextColor(Color.BLUE);
        radarDataSet.setValueTextSize(14f);

        RadarData radarData = new RadarData(radarDataSet);

        String[] labels = {"2014","2015","2016","2017","2018","2019"};
        XAxis axis =radarChart.getXAxis();
        axis.setValueFormatter(new IndexAxisValueFormatter(labels));

        radarChart.setData(radarData);
        radarChart.getDescription().setText("Radar Chart Example");
        radarChart.animate();

    }
}
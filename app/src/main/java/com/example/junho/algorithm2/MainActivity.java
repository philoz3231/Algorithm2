package com.example.junho.algorithm2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button compare_btn = (Button)findViewById(R.id.button);
        Button bubble_btn = (Button)findViewById(R.id.button3);
        Button insert_btn = (Button)findViewById(R.id.button6);
        Button select_btn = (Button)findViewById(R.id.button7);
        Button merge_btn = (Button)findViewById(R.id.button10);
        Button heap_btn = (Button)findViewById(R.id.button9);
        Button quick_btn = (Button)findViewById(R.id.button2);
        final TextView result_textView = (TextView)findViewById(R.id.result_textView);

        compare_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Compare Clicked", Toast.LENGTH_SHORT).show();
                result_textView.setText("Compare Button clicked\nBubble\nInsert\nselect\nEnd");
            }
        });
        bubble_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bubble Clicked", Toast.LENGTH_SHORT).show();
                result_textView.setText("Bubble Button clicked");
            }
        });
        insert_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Insert Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        select_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Select Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        merge_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Merge Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        heap_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Heap Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        quick_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Quick Clicked", Toast.LENGTH_SHORT).show();
            }
        });




    }

    public void CompareSort(int index){

    }
    public void BubbleSort(int index){

    }
    public void InsertSort(int index){

    }
    public void SelectSort(int index){

    }
    public void MergeSort(int index){

    }
    public void HeapSort(int index){

    }
    public void QuickSort(int index){

    }

}

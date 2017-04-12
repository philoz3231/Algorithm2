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
        final TextView result_textView1 = (TextView)findViewById(R.id.result_textView1);
        final TextView result_textView2 = (TextView)findViewById(R.id.result_textView2);
        final TextView input_textView = (TextView)findViewById(R.id.editText3);

        compare_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                    long seed = System.nanoTime();
                    PackofCards cards1 = new PackofCards(Integer.parseInt(input_textView.getText().toString()), seed);
                    long time1a = System.currentTimeMillis();
                    cards1.BubbleSort();
                    long time1b = System.currentTimeMillis();

                    PackofCards cards2 = new PackofCards(Integer.parseInt(input_textView.getText().toString()), seed);
                    long time2a = System.currentTimeMillis();
                    cards2.InsertSort();
                    long time2b = System.currentTimeMillis();

                    PackofCards cards3 = new PackofCards(Integer.parseInt(input_textView.getText().toString()), seed);
                    long time3a = System.currentTimeMillis();
                    cards3.SelectSort();
                    long time3b = System.currentTimeMillis();

                    PackofCards cards4 = new PackofCards(Integer.parseInt(input_textView.getText().toString()), seed);
                    long time4a = System.currentTimeMillis();
                    cards4.MergeSort();
                    long time4b = System.currentTimeMillis();

                    PackofCards cards5 = new PackofCards(Integer.parseInt(input_textView.getText().toString()), seed);
                    long time5a = System.currentTimeMillis();
                    cards5.HeapSort();
                    long time5b = System.currentTimeMillis();

                    PackofCards cards6 = new PackofCards(Integer.parseInt(input_textView.getText().toString()), seed);
                    long time6a = System.currentTimeMillis();
                    cards6.QuickSort();
                    long time6b = System.currentTimeMillis();

                    result_textView1.setText("Your input: " + cards1.length + "\n"
                        + "Seed: " + seed + "\n\n"
                            + "Bubble: " + (time1b - time1a)/1000. + " sec\n"
                            + "Insertion: " + (time2b - time2a)/1000. + " sec\n"
                            + "Selection: " + (time3b - time3a)/1000. + " sec\n"
                            + "Merge: " + (time4b - time4a)/1000. + " sec\n"
                            + "Heap: " + (time5b - time5a)/1000. + " sec\n"
                            + "Quick: " + (time6b - time6a)/1000. + " sec\n"
                    );
                } catch (Exception e){}



                //Toast.makeText(getApplicationContext(), "Compare Clicked", Toast.LENGTH_SHORT).show();
                //result_textView.setText("Compare Button clicked\nBubble\nInsert\nselect\nEnd");
            }
        });
        bubble_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                    PackofCards cards = new PackofCards((Integer.parseInt(input_textView.getText().toString())));
                    result_textView1.setText("Your input: " + cards.length + "\n" + cards.PrintCards());
                    long time1 = System.currentTimeMillis();
                    cards.BubbleSort();
                    long time2 = System.currentTimeMillis();
                    result_textView2.setText("Bubble: " + (time2-time1)/1000. + "sec\n" + cards.PrintCards());
                } catch(Exception e){
                }
            }
        });
        insert_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                    PackofCards cards = new PackofCards((Integer.parseInt(input_textView.getText().toString())));
                    result_textView1.setText("Your input: " + cards.length + "\n" + cards.PrintCards());
                    long time1 = System.currentTimeMillis();
                    cards.InsertSort();
                    long time2 = System.currentTimeMillis();
                    result_textView2.setText("Insertion: " + (time2-time1)/1000. + "sec\n" + cards.PrintCards());
                } catch(Exception e){
                }
            }
        });
        select_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                    PackofCards cards = new PackofCards((Integer.parseInt(input_textView.getText().toString())));
                    result_textView1.setText("Your input: " + cards.length + "\n" + cards.PrintCards());
                    long time1 = System.currentTimeMillis();
                    cards.SelectSort();
                    long time2 = System.currentTimeMillis();
                    result_textView2.setText("Selection: " + (time2-time1)/1000. + "sec\n" + cards.PrintCards());
                } catch(Exception e){
                }
            }
        });
        merge_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                    PackofCards cards = new PackofCards((Integer.parseInt(input_textView.getText().toString())));
                    result_textView1.setText("Your input: " + cards.length + "\n" + cards.PrintCards());
                    long time1 = System.currentTimeMillis();
                    cards.MergeSort();
                    long time2 = System.currentTimeMillis();
                    result_textView2.setText("Merge: " + (time2-time1)/1000. + "sec\n" + cards.PrintCards());
                } catch(Exception e){
                }
            }
        });
        heap_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                    PackofCards cards = new PackofCards((Integer.parseInt(input_textView.getText().toString())));
                    result_textView1.setText("Your input: " + cards.length + "\n" + cards.PrintCards());
                    long time1 = System.currentTimeMillis();
                    cards.HeapSort();
                    long time2 = System.currentTimeMillis();
                    result_textView2.setText("Heap: " + (time2-time1)/1000. + "sec\n" + cards.PrintCards());
                } catch(Exception e){
                }
            }
        });
        quick_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                    PackofCards cards = new PackofCards((Integer.parseInt(input_textView.getText().toString())));
                    result_textView1.setText("Your input: " + cards.length + "\n" + cards.PrintCards());
                    long time1 = System.currentTimeMillis();
                    cards.QuickSort();
                    long time2 = System.currentTimeMillis();
                    result_textView2.setText("Quick: " + (time2-time1)/1000. + "sec\n" + cards.PrintCards());
                } catch(Exception e){
                }
            }
        });

    }

}

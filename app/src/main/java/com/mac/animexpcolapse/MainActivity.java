package com.mac.animexpcolapse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View one;
    private View two;
    private View three;

    boolean isOneVisible = true;
    boolean isTwoVisible = true;
    boolean isThreeVisible = true;
    private View tvone;
    private View tvthree;
    private View tvtwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        tvone = findViewById(R.id.tv1);
        tvtwo = findViewById(R.id.tv2);
        tvthree = findViewById(R.id.tv3);

        tvone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isOneVisible){

                    one.setVisibility(View.GONE);
                }else {

                    one.setVisibility(View.VISIBLE);
                }
                isOneVisible = !isOneVisible;
            }
        });

        tvtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(isTwoVisible){

                    two.setVisibility(View.GONE);
                }else {

                    two.setVisibility(View.VISIBLE);
                }
                isTwoVisible = !isTwoVisible;
            }
        });


        tvthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(isThreeVisible){

                    three.setVisibility(View.GONE);
                }else {

                    three.setVisibility(View.VISIBLE);
                }
                isThreeVisible = !isThreeVisible;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.practiceapp.sample_imagelistener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View view;
    private ImageView img_donut;
    private ImageView img_froyo;
    private ImageView img_icecream;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_donut=findViewById(R.id.img_donut);
        img_froyo=findViewById(R.id.img_froyo);
        img_icecream=findViewById(R.id.img_icecream);
        TextView tv_donut=(TextView) findViewById(R.id.tv_donut);
        TextView tv_froyo=(TextView) findViewById(R.id.tv_froyo);
        TextView tv_icecream=(TextView) findViewById(R.id.tv_icecream);

        tv_donut.setText("Donut");
        tv_froyo.setText("Froyo");
        tv_icecream.setText("Ice cream");

    }

    public void showDonutOrder(View view) {
        displayToast(getString(R.string.donut_order_message));
        String order=getString(R.string.donut_order_message);
        Intent intent=new Intent(MainActivity.this,OrderActivity.class);
        intent.putExtra("message",order);
        startActivity(intent);
    }

    public void showIceCreamOrder(View view) {
        displayToast(getString(R.string.ice_cream_order_message));
        String order= getString(R.string.ice_cream_order_message);
        Intent intent=new Intent(MainActivity.this,OrderActivity.class);
        intent.putExtra("message",order);
        startActivity(intent);
    }

    public void showFroyoOrder(View view) {
        displayToast(getString(R.string.froyo_order_message));
        String order=getString(R.string.froyo_order_message);
        Intent intent=new Intent(MainActivity.this,OrderActivity.class);
        intent.putExtra("message",order);
        startActivity(intent);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();

    }
}
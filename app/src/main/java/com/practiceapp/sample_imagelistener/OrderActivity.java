package com.practiceapp.sample_imagelistener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    private TextView order_textview;
    private TextView name_label;
    private EditText name_text;
    private TextView address_label;
    private EditText address_text;
    private TextView phone_label;
    private EditText phone_text;
    private TextView note_label;
    private EditText note_text;
    RadioButton sameday;
    RadioButton nextday;
    RadioButton pickup;
    Button btn_placeorder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        btn_placeorder=findViewById(R.id.btn_placeorder);
        name_label=findViewById(R.id.name_label);
        name_text=findViewById(R.id.name_text);
        address_label=findViewById(R.id.address_label);
        address_text=findViewById(R.id.address_text);
        phone_label=findViewById(R.id.phone_label);
        phone_text=findViewById(R.id.phone_text);
        note_label=findViewById(R.id.note_label);
        note_text=findViewById(R.id.note_text);
        sameday=findViewById(R.id.sameday);
        nextday=findViewById(R.id.nextday);
        pickup=findViewById(R.id.pickup);
        order_textview=findViewById(R.id.order_textview);

        Intent intent=getIntent();
        String order=intent.getStringExtra("message");
        order_textview.setText(order);

    }

    public void onRadioButtonClicked(View view) {

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.sameday:
                if (checked)
                    displayToast(getString(R.string.same_day_service));
                break;
            case R.id.nextday:
                if (checked)
                    displayToast(getString(R.string.next_day_ground_deliver));
                break;
            case R.id.pickup:
                if (checked)
                    displayToast(getString(R.string.pick_up));
                break;

            default:
                break;
        }
    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }

    public void placeOrder(View view) {
        Toast.makeText(getApplicationContext(),"Order Placed",Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(OrderActivity.this,MainActivity.class);
        startActivity(intent);

    }
}
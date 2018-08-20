package com.example.akshay.loginagain.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.akshay.loginagain.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class grid2 extends AppCompatActivity {
    private RequestQueue mQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid2);

        Button getw = (Button) findViewById(R.id.getw);
        Button bill = (Button) findViewById(R.id.bill);
        final EditText phonetext = (EditText) findViewById(R.id.phonetxt);
        final TextView w1 = (TextView) findViewById(R.id.w1);
        final TextView w2 = (TextView) findViewById(R.id.w2);
        final TextView w3 = (TextView) findViewById(R.id.w3);
        final TextView w4 = (TextView) findViewById(R.id.w4);
        final TextView w5 = (TextView) findViewById(R.id.w5);
        final TextView w6 = (TextView) findViewById(R.id.w6);
        final TextView w7 = (TextView) findViewById(R.id.w7);
        final TextView w8 = (TextView) findViewById(R.id.w8);
        final TextView w9 = (TextView) findViewById(R.id.w9);
        final TextView w10 = (TextView) findViewById(R.id.w10);
        final TextView w11 = (TextView) findViewById(R.id.w11);
        final TextView w12 = (TextView) findViewById(R.id.w12);
        final TextView totaltxt = (TextView) findViewById(R.id.totaltxt);

        final TextView p1 =  (TextView) findViewById(R.id.p1);
        final TextView p2 =  (TextView) findViewById(R.id.p2);
        final TextView p3 =  (TextView) findViewById(R.id.p3);
        final TextView p4 =  (TextView) findViewById(R.id.p4);
        final TextView p5 =  (TextView) findViewById(R.id.p5);
        final TextView p6 =  (TextView) findViewById(R.id.p6);
        final TextView p7 =  (TextView) findViewById(R.id.p7);
        final TextView p8 =  (TextView) findViewById(R.id.p8);
        final TextView p9 =  (TextView) findViewById(R.id.p9);
        final TextView p10 =  (TextView) findViewById(R.id.p10);
        final TextView p11 =  (TextView) findViewById(R.id.p11);
        final TextView p12 =  (TextView) findViewById(R.id.p12);


        final Spinner sp1 = (Spinner) findViewById(R.id.sp1);
        final Spinner sp2 = (Spinner) findViewById(R.id.sp2);
        final Spinner sp3 = (Spinner) findViewById(R.id.sp3);
        final Spinner sp4 = (Spinner) findViewById(R.id.sp4);
        final Spinner sp5 = (Spinner) findViewById(R.id.sp5);
        final Spinner sp6 = (Spinner) findViewById(R.id.sp6);
        final Spinner sp7 = (Spinner) findViewById(R.id.sp7);
        final Spinner sp8 = (Spinner) findViewById(R.id.sp8);
        final Spinner sp9 = (Spinner) findViewById(R.id.sp9);
        final Spinner sp10 = (Spinner) findViewById(R.id.sp10);
        final Spinner sp11 = (Spinner) findViewById(R.id.sp11);
        final Spinner sp12 = (Spinner) findViewById(R.id.sp12);

        ArrayAdapter<String> myadopter1 = new ArrayAdapter<String>(grid2.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Items));
        myadopter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(myadopter1);
        sp2.setAdapter(myadopter1);
        sp3.setAdapter(myadopter1);
        sp4.setAdapter(myadopter1);
        sp5.setAdapter(myadopter1);
        sp6.setAdapter(myadopter1);
        sp7.setAdapter(myadopter1);
        sp8.setAdapter(myadopter1);
        sp9.setAdapter(myadopter1);
        sp10.setAdapter(myadopter1);
        sp11.setAdapter(myadopter1);
        sp12.setAdapter(myadopter1);

        /***********/

        mQueue = Volley.newRequestQueue(this);

        bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sms = null;
                String phone = null;
                if(phonetext.getText().toString().equals("")){Toast.makeText(getApplicationContext(), "Enter phone no", Toast.LENGTH_SHORT).show();}
                phone = "+91"+phonetext.getText().toString();
                sms="Welcome to our store.\nThis is generated e-bill of your shopping:\n";
                if(!p1.getText().toString().equals("")){sms=sms+"Items:"+sp1.getSelectedItem().toString()+"-"+p1.getText().toString()+"\n";}
                if(!p2.getText().toString().equals("")){sms=sms+""+sp2.getSelectedItem().toString()+"-"+p2.getText().toString()+"\n";}
                if(!p3.getText().toString().equals("")){sms=sms+""+sp3.getSelectedItem().toString()+"-"+p3.getText().toString()+"\n";}
                if(!p4.getText().toString().equals("")){sms=sms+""+sp4.getSelectedItem().toString()+"-"+p4.getText().toString()+"\n";}
                if(!p5.getText().toString().equals("")){sms=sms+""+sp5.getSelectedItem().toString()+"-"+p5.getText().toString()+"\n";}
                if(!p6.getText().toString().equals("")){sms=sms+""+sp6.getSelectedItem().toString()+"-"+p6.getText().toString()+"\n";}
                if(!p7.getText().toString().equals("")){sms=sms+""+sp7.getSelectedItem().toString()+"-"+p7.getText().toString()+"\n";}
                if(!p8.getText().toString().equals("")){sms=sms+""+sp8.getSelectedItem().toString()+"-"+p8.getText().toString()+"\n";}
                if(!p9.getText().toString().equals("")){sms=sms+""+sp9.getSelectedItem().toString()+"-"+p9.getText().toString()+"\n";}
                if(!p10.getText().toString().equals("")){sms=sms+""+sp10.getSelectedItem().toString()+"-"+p10.getText().toString()+"\n";}
                if(!p11.getText().toString().equals("")){sms=sms+""+sp11.getSelectedItem().toString()+"-"+p11.getText().toString()+"\n";}
                if(!p12.getText().toString().equals("")){sms=sms+""+sp12.getSelectedItem().toString()+"-"+p12.getText().toString()+"\n";}

                sms=sms+"Total:"+totaltxt.getText().toString()+"\nThank you.Visit again";

               // String message = "Items:"+sp1.getSelectedItem().toString()+sp2.getSelectedItem().toString()+"......Total:"+totaltxt.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + phone));
                intent.putExtra("sms_body", sms);
                startActivity(intent);
            }
        });


        getw.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        jsonParse();
                                    }

            private void jsonParse() {

                String url = getString(R.string.url);

                final JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                try {
                                    JSONArray jsonArray = response.getJSONArray("server_response");

                                    for (int i = 0; i < jsonArray.length(); i++) {
                                        JSONObject responseob = jsonArray.getJSONObject(i);


                                        int id = responseob.getInt("id");
                                        int orderid = responseob.getInt("orderid");
                                        double weight = responseob.getDouble("weight");
                                        String time = responseob.getString("time");


                                        if(!sp1.getSelectedItem().toString().equals("select")&&
                                                w2.getText().toString().equals("")&&
                                                w1.getText().toString().equals("")&&
                                                w3.getText().toString().equals("")&&
                                                w4.getText().toString().equals("")&&
                                                w5.getText().toString().equals("")&&
                                                w6.getText().toString().equals("")&&
                                                w7.getText().toString().equals("")&&
                                                w8.getText().toString().equals("")&&
                                                w9.getText().toString().equals("")&&
                                                w10.getText().toString().equals("")&&
                                                w11.getText().toString().equals("")&&
                                                w12.getText().toString().equals(""))
                                        {
                                            Log.d("I am here in if",sp1.getSelectedItem().toString());
                                            w1.setText(String.valueOf(weight));
                                            if(sp1.getSelectedItem().toString().equals("Eggplant"))
                                            {p1.setText(String.valueOf(30*weight));
                                            }
                                            if(sp1.getSelectedItem().toString().equals("Onion"))
                                            { p1.setText(String.valueOf(60*weight));
                                            }
                                            if(sp1.getSelectedItem().toString().equals("Okra"))
                                            {p1.setText(String.valueOf(35*weight));}
                                            if(sp1.getSelectedItem().toString().equals("Tomato"))
                                            {p1.setText(String.valueOf(50*weight));}
                                            if(sp1.getSelectedItem().toString().equals("Green chilis"))
                                            {p1.setText(String.valueOf(35*weight));}
                                            if(sp1.getSelectedItem().toString().equals("Potato"))
                                            {p1.setText(String.valueOf(50*weight));}
                                            if(sp1.getSelectedItem().toString().equals("Carrot"))
                                            {p1.setText(String.valueOf(15*weight));}
                                            } else{
                                           // Log.d("I am here in else",sp1.getSelectedItem().toString());
                                            //Log.d("It is =>","It is"+w2.getText().toString());
                                           // Toast.makeText(getApplicationContext(), "Select any item! Or Error on Retrieving next Item", Toast.LENGTH_SHORT).show();
                                        }


                                        if(!sp2.getSelectedItem().toString().equals("select")&&
                                                !w1.getText().toString().equals("")&&
                                                w3.getText().toString().equals("")&&
                                                w2.getText().toString().equals("")&&
                                                w4.getText().toString().equals("")&&
                                                w5.getText().toString().equals("")&&
                                                w6.getText().toString().equals("")&&
                                                w7.getText().toString().equals("")&&
                                                w8.getText().toString().equals("")&&
                                                w9.getText().toString().equals("")&&
                                                w10.getText().toString().equals("")&&
                                                w11.getText().toString().equals("")&&
                                                w12.getText().toString().equals("")){
                                            w2.setText(String.valueOf(weight));

                                            if(sp2.getSelectedItem().toString().equals("Eggplant"))
                                            {p2.setText(String.valueOf(30*weight));}
                                            if(sp2.getSelectedItem().toString().equals("Onion"))
                                            { p2.setText(String.valueOf(60*weight));}
                                            if(sp2.getSelectedItem().toString().equals("Okra"))
                                            {p2.setText(String.valueOf(35*weight));}
                                            if(sp2.getSelectedItem().toString().equals("Tomato"))
                                            {p2.setText(String.valueOf(50*weight));}
                                            if(sp2.getSelectedItem().toString().equals("Green chilis"))
                                            {p2.setText(String.valueOf(35*weight));}
                                            if(sp2.getSelectedItem().toString().equals("Potato"))
                                            {p2.setText(String.valueOf(50*weight));}
                                            if(sp2.getSelectedItem().toString().equals("Carrot"))
                                            {p2.setText(String.valueOf(15*weight));}
                                        }else{
                                            // Log.d("I am here in else",sp1.getSelectedItem().toString());
                                            //Log.d("It is =>","It is"+w2.getText().toString());
                                          //  Toast.makeText(getApplicationContext(), "Select any item! Or Error on Retrieving next Item", Toast.LENGTH_SHORT).show();
                                        }



                                        if(!sp3.getSelectedItem().toString().equals("select")&&
                                                w3.getText().toString().equals("")&&
                                                !w1.getText().toString().equals("")&&
                                                !w2.getText().toString().equals("")&&
                                                w4.getText().toString().equals("")&&
                                                w5.getText().toString().equals("")&&
                                                w6.getText().toString().equals("")&&
                                                w7.getText().toString().equals("")&&
                                                w8.getText().toString().equals("")&&
                                                w9.getText().toString().equals("")&&
                                                w10.getText().toString().equals("")&&
                                                w11.getText().toString().equals("")&&
                                                w12.getText().toString().equals("")){
                                            w3.setText(String.valueOf(weight));
                                            if(sp3.getSelectedItem().toString().equals("Eggplant"))
                                            {p3.setText(String.valueOf(30*weight));}
                                            if(sp3.getSelectedItem().toString().equals("Onion"))
                                            { p3.setText(String.valueOf(60*weight));}
                                            if(sp3.getSelectedItem().toString().equals("Okra"))
                                            {p3.setText(String.valueOf(35*weight));}
                                            if(sp3.getSelectedItem().toString().equals("Tomato"))
                                            {p3.setText(String.valueOf(50*weight));}
                                            if(sp3.getSelectedItem().toString().equals("Green chilis"))
                                            {p3.setText(String.valueOf(35*weight));}
                                            if(sp3.getSelectedItem().toString().equals("Potato"))
                                            {p3.setText(String.valueOf(50*weight));}
                                            if(sp3.getSelectedItem().toString().equals("Carrot"))
                                            {p3.setText(String.valueOf(15*weight));}
                                        }else{
                                            // Log.d("I am here in else",sp1.getSelectedItem().toString());
                                            //Log.d("It is =>","It is"+w2.getText().toString());
                                           // Toast.makeText(getApplicationContext(), "Select any item! Or Error on Retrieving next Item", Toast.LENGTH_SHORT).show();
                                        }


                                        if(!sp4.getSelectedItem().toString().equals("select")&&
                                                w4.getText().toString().equals("")&&
                                                !w1.getText().toString().equals("")&&
                                                !w2.getText().toString().equals("")&&
                                                !w3.getText().toString().equals("")&&
                                                w5.getText().toString().equals("")&&
                                                w6.getText().toString().equals("")&&
                                                w7.getText().toString().equals("")&&
                                                w8.getText().toString().equals("")&&
                                                w9.getText().toString().equals("")&&
                                                w10.getText().toString().equals("")&&
                                                w11.getText().toString().equals("")&&
                                                w12.getText().toString().equals("")
                                                ){
                                            w4.setText(String.valueOf(weight));
                                            if(sp4.getSelectedItem().toString().equals("Eggplant"))
                                            {p4.setText(String.valueOf(30*weight));}
                                            if(sp4.getSelectedItem().toString().equals("Onion"))
                                            { p4.setText(String.valueOf(60*weight));}
                                            if(sp4.getSelectedItem().toString().equals("Okra"))
                                            {p4.setText(String.valueOf(35*weight));}
                                            if(sp4.getSelectedItem().toString().equals("Tomato"))
                                            {p4.setText(String.valueOf(50*weight));}
                                            if(sp4.getSelectedItem().toString().equals("Green chilis"))
                                            {p4.setText(String.valueOf(35*weight));}
                                            if(sp4.getSelectedItem().toString().equals("Potato"))
                                            {p4.setText(String.valueOf(50*weight));}
                                            if(sp4.getSelectedItem().toString().equals("Carrot"))
                                            {p4.setText(String.valueOf(15*weight));}
                                        }else{
                                            // Log.d("I am here in else",sp1.getSelectedItem().toString());
                                            //Log.d("It is =>","It is"+w2.getText().toString());
                                           // Toast.makeText(getApplicationContext(), "Select any item! Or Error on Retrieving next Item", Toast.LENGTH_SHORT).show();
                                        }


                                        if(!sp5.getSelectedItem().toString().equals("select")&&
                                                !w1.getText().toString().equals("")&&
                                                w5.getText().toString().equals("")&&
                                                !w2.getText().toString().equals("")&&
                                                !w3.getText().toString().equals("")&&
                                                !w4.getText().toString().equals("")&&
                                                w6.getText().toString().equals("")&&
                                                w7.getText().toString().equals("")&&
                                                w8.getText().toString().equals("")&&
                                                w9.getText().toString().equals("")&&
                                                w10.getText().toString().equals("")&&
                                                w11.getText().toString().equals("")&&
                                                w12.getText().toString().equals("")){
                                            w5.setText(String.valueOf(weight));

                                            if(sp5.getSelectedItem().toString().equals("Eggplant"))
                                            {p5.setText(String.valueOf(30*weight));}
                                            if(sp5.getSelectedItem().toString().equals("Onion"))
                                            {p5.setText(String.valueOf(60*weight));}
                                            if(sp5.getSelectedItem().toString().equals("Okra"))
                                            {p5.setText(String.valueOf(35*weight));}
                                            if(sp5.getSelectedItem().toString().equals("Tomato"))
                                            {p5.setText(String.valueOf(50*weight));}
                                            if(sp5.getSelectedItem().toString().equals("Green chilis"))
                                            {p5.setText(String.valueOf(35*weight));}
                                            if(sp5.getSelectedItem().toString().equals("Potato"))
                                            {p5.setText(String.valueOf(50*weight));}
                                            if(sp5.getSelectedItem().toString().equals("Carrot"))
                                            {p5.setText(String.valueOf(15*weight));}
                                        }else{
                                            // Log.d("I am here in else",sp1.getSelectedItem().toString());
                                            //Log.d("It is =>","It is"+w2.getText().toString());
                                          //  Toast.makeText(getApplicationContext(), "Select any item! Or Error on Retrieving next Item", Toast.LENGTH_SHORT).show();
                                        }


                                        if(!sp6.getSelectedItem().toString().equals("select")&&
                                                w6.getText().toString().equals("")&&
                                                !w1.getText().toString().equals("")&&
                                                !w2.getText().toString().equals("")&&
                                                !w3.getText().toString().equals("")&&
                                                !w4.getText().toString().equals("")&&
                                                !w5.getText().toString().equals("")&&
                                                w7.getText().toString().equals("")&&
                                                w8.getText().toString().equals("")&&
                                                w9.getText().toString().equals("")&&
                                                w10.getText().toString().equals("")&&
                                                w11.getText().toString().equals("")&&
                                                w12.getText().toString().equals("")){
                                            w6.setText(String.valueOf(weight));
                                            if(sp6.getSelectedItem().toString().equals("Eggplant"))
                                            {p6.setText(String.valueOf(30*weight));}
                                            if(sp6.getSelectedItem().toString().equals("Onion"))
                                            {p6.setText(String.valueOf(60*weight));}
                                            if(sp6.getSelectedItem().toString().equals("Okra"))
                                            {p6.setText(String.valueOf(35*weight));}
                                            if(sp6.getSelectedItem().toString().equals("Tomato"))
                                            {p6.setText(String.valueOf(50*weight));}
                                            if(sp6.getSelectedItem().toString().equals("Green chilis"))
                                            {p6.setText(String.valueOf(35*weight));}
                                            if(sp6.getSelectedItem().toString().equals("Potato"))
                                            {p6.setText(String.valueOf(50*weight));}
                                            if(sp6.getSelectedItem().toString().equals("Carrot"))
                                            {p6.setText(String.valueOf(15*weight));}
                                        }else{
                                            // Log.d("I am here in else",sp1.getSelectedItem().toString());
                                            //Log.d("It is =>","It is"+w2.getText().toString());
                                          //  Toast.makeText(getApplicationContext(), "Select any item! Or Error on Retrieving next Item", Toast.LENGTH_SHORT).show();
                                        }


                                        if(!sp7.getSelectedItem().toString().equals("select")&&
                                                w7.getText().toString().equals("")&&
                                                !w1.getText().toString().equals("")&&
                                                !w2.getText().toString().equals("")&&
                                                !w3.getText().toString().equals("")&&
                                                !w4.getText().toString().equals("")&&
                                                !w5.getText().toString().equals("")&&
                                                !w6.getText().toString().equals("")&&
                                                w8.getText().toString().equals("")&&
                                                w9.getText().toString().equals("")&&
                                                w10.getText().toString().equals("")&&
                                                w11.getText().toString().equals("")&&
                                                w12.getText().toString().equals("")){
                                            w7.setText(String.valueOf(weight));
                                            if(sp7.getSelectedItem().toString().equals("Eggplant"))
                                            {p7.setText(String.valueOf(30*weight));}
                                            if(sp7.getSelectedItem().toString().equals("Onion"))
                                            {p7.setText(String.valueOf(60*weight));}
                                            if(sp7.getSelectedItem().toString().equals("Okra"))
                                            {p7.setText(String.valueOf(35*weight));}
                                            if(sp7.getSelectedItem().toString().equals("Tomato"))
                                            {p7.setText(String.valueOf(50*weight));}
                                            if(sp7.getSelectedItem().toString().equals("Green chilis"))
                                            {p7.setText(String.valueOf(35*weight));}
                                            if(sp7.getSelectedItem().toString().equals("Potato"))
                                            {p7.setText(String.valueOf(50*weight));}
                                            if(sp7.getSelectedItem().toString().equals("Carrot"))
                                            {p7.setText(String.valueOf(15*weight));}
                                        }else{
                                            // Log.d("I am here in else",sp1.getSelectedItem().toString());
                                            //Log.d("It is =>","It is"+w2.getText().toString());
                                           // Toast.makeText(getApplicationContext(), "Select any item! Or Error on Retrieving next Item", Toast.LENGTH_SHORT).show();
                                        }


                                        if(!sp8.getSelectedItem().toString().equals("select")&&
                                                w8.getText().toString().equals("")&&
                                                !w1.getText().toString().equals("")&&
                                                !w2.getText().toString().equals("")&&
                                                !w3.getText().toString().equals("")&&
                                                !w4.getText().toString().equals("")&&
                                                !w5.getText().toString().equals("")&&
                                                !w6.getText().toString().equals("")&&
                                                !w7.getText().toString().equals("")&&
                                                w9.getText().toString().equals("")&&
                                                w10.getText().toString().equals("")&&
                                                w11.getText().toString().equals("")&&
                                                w12.getText().toString().equals("")
                                                ){
                                            w8.setText(String.valueOf(weight));
                                            if(sp8.getSelectedItem().toString().equals("Eggplant"))
                                            {p8.setText(String.valueOf(30*weight));}
                                            if(sp8.getSelectedItem().toString().equals("Onion"))
                                            {p8.setText(String.valueOf(60*weight));}
                                            if(sp8.getSelectedItem().toString().equals("Okra"))
                                            {p8.setText(String.valueOf(35*weight));}
                                            if(sp8.getSelectedItem().toString().equals("Tomato"))
                                            {p8.setText(String.valueOf(50*weight));}
                                            if(sp8.getSelectedItem().toString().equals("Green chilis"))
                                            {p8.setText(String.valueOf(35*weight));}
                                            if(sp8.getSelectedItem().toString().equals("Potato"))
                                            {p8.setText(String.valueOf(50*weight));}
                                            if(sp8.getSelectedItem().toString().equals("Carrot"))
                                            {p8.setText(String.valueOf(15*weight));}
                                        }else{
                                            // Log.d("I am here in else",sp1.getSelectedItem().toString());
                                            //Log.d("It is =>","It is"+w2.getText().toString());
                                           // Toast.makeText(getApplicationContext(), "Select any item! Or Error on Retrieving next Item", Toast.LENGTH_SHORT).show();
                                        }

                                        if(!sp9.getSelectedItem().toString().equals("select")&&
                                                w9.getText().toString().equals("")&&
                                                !w1.getText().toString().equals("")&&
                                                !w2.getText().toString().equals("")&&
                                                !w3.getText().toString().equals("")&&
                                                !w4.getText().toString().equals("")&&
                                                !w5.getText().toString().equals("")&&
                                                !w6.getText().toString().equals("")&&
                                                !w7.getText().toString().equals("")&&
                                                !w8.getText().toString().equals("")&&
                                                w10.getText().toString().equals("")&&
                                                w11.getText().toString().equals("")&&
                                                w12.getText().toString().equals("")
                                                ){
                                            w9.setText(String.valueOf(weight));
                                            if(sp9.getSelectedItem().toString().equals("Eggplant"))
                                            {p9.setText(String.valueOf(30*weight));}
                                            if(sp9.getSelectedItem().toString().equals("Onion"))
                                            {p9.setText(String.valueOf(60*weight));}
                                            if(sp9.getSelectedItem().toString().equals("Okra"))
                                            {p9.setText(String.valueOf(35*weight));}
                                            if(sp9.getSelectedItem().toString().equals("Tomato"))
                                            {p9.setText(String.valueOf(50*weight));}
                                            if(sp9.getSelectedItem().toString().equals("Green chilis"))
                                            {p9.setText(String.valueOf(35*weight));}
                                            if(sp9.getSelectedItem().toString().equals("Potato"))
                                            {p9.setText(String.valueOf(50*weight));}
                                            if(sp9.getSelectedItem().toString().equals("Carrot"))
                                            {p9.setText(String.valueOf(15*weight));}
                                        }else{
                                            // Log.d("I am here in else",sp1.getSelectedItem().toString());
                                            //Log.d("It is =>","It is"+w2.getText().toString());
                                           // Toast.makeText(getApplicationContext(), "Select any item! Or Error on Retrieving next Item", Toast.LENGTH_SHORT).show();
                                        }

                                        if(!sp10.getSelectedItem().toString().equals("select")&&
                                                w10.getText().toString().equals("")&&
                                                !w1.getText().toString().equals("")&&
                                                !w2.getText().toString().equals("")&&
                                                !w3.getText().toString().equals("")&&
                                                !w4.getText().toString().equals("")&&
                                                !w5.getText().toString().equals("")&&
                                                !w6.getText().toString().equals("")&&
                                                !w7.getText().toString().equals("")&&
                                                !w8.getText().toString().equals("")&&
                                                !w9.getText().toString().equals("")&&
                                                w11.getText().toString().equals("")&&
                                                w12.getText().toString().equals("")
                                                ){
                                            w10.setText(String.valueOf(weight));
                                            if(sp10.getSelectedItem().toString().equals("Eggplant"))
                                            {p10.setText(String.valueOf(30*weight));}
                                            if(sp10.getSelectedItem().toString().equals("Onion"))
                                            {p10.setText(String.valueOf(60*weight));}
                                            if(sp10.getSelectedItem().toString().equals("Okra"))
                                            {p10.setText(String.valueOf(35*weight));}
                                            if(sp10.getSelectedItem().toString().equals("Tomato"))
                                            {p10.setText(String.valueOf(50*weight));}
                                            if(sp10.getSelectedItem().toString().equals("Green chilis"))
                                            {p10.setText(String.valueOf(35*weight));}
                                            if(sp10.getSelectedItem().toString().equals("Potato"))
                                            {p10.setText(String.valueOf(50*weight));}
                                            if(sp10.getSelectedItem().toString().equals("Carrot"))
                                            {p10.setText(String.valueOf(15*weight));}
                                        }else{
                                            // Log.d("I am here in else",sp1.getSelectedItem().toString());
                                            //Log.d("It is =>","It is"+w2.getText().toString());
                                           // Toast.makeText(getApplicationContext(), "Select any item! Or Error on Retrieving next Item", Toast.LENGTH_SHORT).show();
                                        }


                                        if(!sp11.getSelectedItem().toString().equals("select")&&
                                                w11.getText().toString().equals("")&&
                                                !w1.getText().toString().equals("")&&
                                                !w2.getText().toString().equals("")&&
                                                !w3.getText().toString().equals("")&&
                                                !w4.getText().toString().equals("")&&
                                                !w5.getText().toString().equals("")&&
                                                !w6.getText().toString().equals("")&&
                                                !w7.getText().toString().equals("")&&
                                                !w8.getText().toString().equals("")&&
                                                !w9.getText().toString().equals("")&&
                                                !w10.getText().toString().equals("")&&
                                                w12.getText().toString().equals("")
                                                ){
                                            w11.setText(String.valueOf(weight));
                                            if(sp11.getSelectedItem().toString().equals("Eggplant"))
                                            {p11.setText(String.valueOf(30*weight));}
                                            if(sp11.getSelectedItem().toString().equals("Onion"))
                                            {p11.setText(String.valueOf(60*weight));}
                                            if(sp11.getSelectedItem().toString().equals("Okra"))
                                            {p11.setText(String.valueOf(35*weight));}
                                            if(sp11.getSelectedItem().toString().equals("Tomato"))
                                            {p11.setText(String.valueOf(50*weight));}
                                            if(sp11.getSelectedItem().toString().equals("Green chilis"))
                                            {p11.setText(String.valueOf(35*weight));}
                                            if(sp11.getSelectedItem().toString().equals("Potato"))
                                            {p11.setText(String.valueOf(50*weight));}
                                            if(sp11.getSelectedItem().toString().equals("Carrot"))
                                            {p11.setText(String.valueOf(15*weight));}
                                        }else{
                                            // Log.d("I am here in else",sp1.getSelectedItem().toString());
                                            //Log.d("It is =>","It is"+w2.getText().toString());
                                           // Toast.makeText(getApplicationContext(), "Select any item! Or Error on Retrieving next Item", Toast.LENGTH_SHORT).show();
                                        }

                                        if(!sp12.getSelectedItem().toString().equals("select")&&
                                                w12.getText().toString().equals("")&&
                                                !w1.getText().toString().equals("")&&
                                                !w2.getText().toString().equals("")&&
                                                !w3.getText().toString().equals("")&&
                                                !w4.getText().toString().equals("")&&
                                                !w5.getText().toString().equals("")&&
                                                !w6.getText().toString().equals("")&&
                                                !w7.getText().toString().equals("")&&
                                                !w8.getText().toString().equals("")&&
                                                !w9.getText().toString().equals("")&&
                                                !w10.getText().toString().equals("")&&
                                                !w11.getText().toString().equals("")
                                                ){
                                            w12.setText(String.valueOf(weight));
                                            if(sp12.getSelectedItem().toString().equals("Eggplant"))
                                            {p12.setText(String.valueOf(30*weight));}
                                            if(sp12.getSelectedItem().toString().equals("Onion"))
                                            {p12.setText(String.valueOf(60*weight));}
                                            if(sp12.getSelectedItem().toString().equals("Okra"))
                                            {p12.setText(String.valueOf(35*weight));}
                                            if(sp12.getSelectedItem().toString().equals("Tomato"))
                                            {p12.setText(String.valueOf(50*weight));}
                                            if(sp12.getSelectedItem().toString().equals("Green chilis"))
                                            {p12.setText(String.valueOf(35*weight));}
                                            if(sp12.getSelectedItem().toString().equals("Potato"))
                                            {p12.setText(String.valueOf(50*weight));}
                                            if(sp12.getSelectedItem().toString().equals("Carrot"))
                                            {p12.setText(String.valueOf(15*weight));}
                                        }else{
                                            // Log.d("I am here in else",sp1.getSelectedItem().toString());
                                            //Log.d("It is =>","It is"+w2.getText().toString());
                                            //Toast.makeText(getApplicationContext(), "Select any item! Or Error on Retrieving next Item", Toast.LENGTH_SHORT).show();
                                        }



                                        //  mTextViewResult.append(String.valueOf(id) + ",  " + String.valueOf(orderid) + ", " + String.valueOf(weight) + ",  " + time + "\n\n");
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }

                                double totals=0;
                                if(!p1.getText().toString().equals("")){totals = totals+Double.valueOf(p1.getText().toString());}
                                if(!p2.getText().toString().equals("")){totals = totals+Double.valueOf(p2.getText().toString());}
                                if(!p3.getText().toString().equals("")){totals = totals+Double.valueOf(p3.getText().toString());}
                                if(!p4.getText().toString().equals("")){totals = totals+Double.valueOf(p4.getText().toString());}
                                if(!p5.getText().toString().equals("")){totals = totals+Double.valueOf(p5.getText().toString());}
                                if(!p6.getText().toString().equals("")){totals = totals+Double.valueOf(p6.getText().toString());}
                                if(!p7.getText().toString().equals("")){totals = totals+Double.valueOf(p7.getText().toString());}
                                if(!p8.getText().toString().equals("")){totals = totals+Double.valueOf(p8.getText().toString());}
                                if(!p9.getText().toString().equals("")){totals = totals+Double.valueOf(p9.getText().toString());}
                                if(!p10.getText().toString().equals("")){totals = totals+Double.valueOf(p10.getText().toString());}
                                if(!p11.getText().toString().equals("")){totals = totals+Double.valueOf(p11.getText().toString());}
                                if(!p12.getText().toString().equals("")){totals = totals+Double.valueOf(p12.getText().toString());}


                                totaltxt.setText(String.valueOf(totals));
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                });

                mQueue.add(request);
            }


                                });
        /*************/


    }


}

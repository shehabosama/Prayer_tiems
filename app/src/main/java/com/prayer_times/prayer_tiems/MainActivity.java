package com.prayer_times.prayer_tiems;

import android.icu.text.DateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.prayer_times.prayer_tiems.Dialogs_fragments.coustome_dialog;
import com.prayer_times.prayer_tiems.Modul.Pray_modul;
import com.prayer_times.prayer_tiems.api.API;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn_display_prayer_time);
        final ToggleButton elsp7a = findViewById(R.id.tspe7);
        final Button btn_no = findViewById(R.id.no);
        final Button  taspe7 = findViewById(R.id.tspe72);
        btn_no.setEnabled(false);




        elsp7a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    elsp7a.setTextOn("تصفير");
                    taspe7.setVisibility(View.VISIBLE);


                }else
                {
                    count =0;
                    btn_no.setText(String.valueOf(count));
                    btn_no.setVisibility(View.INVISIBLE);
                    elsp7a.setTextOff("مسبحه");
                    taspe7.setVisibility(View.INVISIBLE);
                    btn_no.setEnabled(false);


                }
            }
        });
        btn_no.setVisibility(View.INVISIBLE);

        taspe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_no.setVisibility(View.VISIBLE);
               count++;
                btn_no.setText(String.valueOf(count));
                btn_no.setEnabled(false);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

                httpClient.addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request().newBuilder().addHeader("X-RapidAPI-Key", "3a2a774adbmshcd3a4063f5cdefbp153725jsn8ce109a2ed5c").build();
                        return chain.proceed(request);
                    }
                });
                Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl("https://aladhan.p.rapidapi.com/").client(httpClient.build()).build();//


                API api = retrofit.create(API.class);



                Call<Pray_modul> get_prayer_time = api.get_prayer_time("giza","Egypt");
                get_prayer_time.enqueue(new Callback<Pray_modul>() {
                    @Override
                    public void onResponse(Call<Pray_modul> call, retrofit2.Response<Pray_modul> response) {

                        if (response.isSuccessful())
                        {

                            Timestamp timestamp = new Timestamp(Long.parseLong(response.body().getDataObject().getDate().getTimestamp()));
                            Date date = new Date();
                            String strDateFormat = "hh:mm:ss a";
                            SimpleDateFormat dateFormat = new SimpleDateFormat(strDateFormat);
                            String formattedDate= dateFormat.format(date);
                            System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
                            String lat = String.valueOf(response.body().getDataObject().getMeta().getLatitude());
                            String lang = String.valueOf(response.body().getDataObject().getMeta().getLongitude());
                            String fagr = response.body().getDataObject().getTimings().getFajr();
                            String sunrise = response.body().getDataObject().getTimings().getSunrise();
                            String douhr = response.body().getDataObject().getTimings().getDhuhr();
                            String asr = response.body().getDataObject().getTimings().getAsr();
                            String sunset = response.body().getDataObject().getTimings().getSunset();
                            String maghrib = response.body().getDataObject().getTimings().getMaghrib();
                            String isha = response.body().getDataObject().getTimings().getIsha();
                            String imsak = response.body().getDataObject().getTimings().getImsak();
                            String midnight = response.body().getDataObject().getTimings().getMidnight();
                            String _date = response.body().getDataObject().getDate().getReadable();

                            coustome_dialog coustome  = new coustome_dialog();
                            coustome.showDialog(MainActivity.this,fagr,sunrise,douhr,asr,sunset,maghrib,isha,imsak,midnight,formattedDate,_date, lat+","+lang);

                        }else
                        {
                            Toast.makeText(MainActivity.this, ""+response.message()+"hello", Toast.LENGTH_SHORT).show();

                        }
                    }

                    @Override
                    public void onFailure(Call<Pray_modul> call, Throwable t) {

                        Toast.makeText(MainActivity.this, ""+t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        Log.e("error",t.getLocalizedMessage());
                    }
                });
            }
        });
    }
}

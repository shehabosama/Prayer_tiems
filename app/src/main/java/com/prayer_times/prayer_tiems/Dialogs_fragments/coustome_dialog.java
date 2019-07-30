package com.prayer_times.prayer_tiems.Dialogs_fragments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.prayer_times.prayer_tiems.R;
public class coustome_dialog {


    public void showDialog(final Activity activity, String fagr, String sunrise, String dhuhr, String asr, String sunset, String maghtrib, String isha, String imsak, String midnight, String time, String date, final String lat_lang){

        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.costome_dialoge);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog);
         TextView text_fager = dialog.findViewById(R.id.fajr);
         TextView text_sunrise = dialog.findViewById(R.id.Sunrise);
         TextView text_dhuhr = dialog.findViewById(R.id.Dhuhr);
         TextView text_asr = dialog.findViewById(R.id.Asr);
         TextView text_sunset = dialog.findViewById(R.id.Sunset);
         TextView text_maghrib = dialog.findViewById(R.id.Maghrib);
         TextView text_isha = dialog.findViewById(R.id.Isha);
         TextView text_imsak = dialog.findViewById(R.id.Imsak);
         TextView text_midnight = dialog.findViewById(R.id.Midnight);
         TextView text_date = dialog.findViewById(R.id.date);
        TextView text_time = dialog.findViewById(R.id.time);
        ImageView  image_location = dialog.findViewById(R.id.location);

         text_date.setText("التاريخ : "+date);
         text_time.setText("الوقت : "+ time);
        text_fager.setText("الفجر : "+fagr);
        text_sunrise.setText("الشروق : "+sunrise);
        text_dhuhr.setText("الظهر : "+dhuhr);
        text_asr.setText("العصر : "+asr);
        text_sunset.setText("الغروب : "+sunset);
        text_maghrib.setText("المغرب : "+maghtrib);
        text_isha.setText("العشاء : "+isha);
        text_imsak.setText("الامساكيه : "+imsak);
        text_midnight.setText("منتصف اليل : "+midnight);
        Button button_close = dialog.findViewById(R.id.close);

        image_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getLocatio_from_map(lat_lang,activity);
            }
        });

        button_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }

    public void getLocatio_from_map(String lat_lang,Activity activity)
    {
        Uri uri = Uri.parse("google.navigation:q="+lat_lang);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        activity.startActivity(intent);
    }
}

package com.prayer_times.prayer_tiems.api;

import com.prayer_times.prayer_tiems.Modul.Pray_modul;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API
{
    @GET("timingsByCity")
    Call<Pray_modul> get_prayer_time(@Query("city") String city, @Query("country") String county);
}

package com.prayer_times.prayer_tiems.Modul;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pray_modul {
    /*
    @SerializedName("code")
    @Expose
    public int code;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("data")
    @Expose
    public List<Data> data= new ArrayList<>();
*/
    @SerializedName("code")
    @Expose
    private float code;

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("data")
    @Expose
    Data DataObject;

    public float getCode() {
        return code;
    }

    public void setCode(float code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getDataObject() {
        return DataObject;
    }

    public void setDataObject(Data dataObject) {
        DataObject = dataObject;
    }

    public class Data {

        @SerializedName("timings")
        @Expose
        private Timings timings;
        @SerializedName("date")
        @Expose
        private Date date;
        @SerializedName("meta")
        @Expose
        private Meta meta;

        public Timings getTimings() {
            return timings;
        }

        public void setTimings(Timings timings) {
            this.timings = timings;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Meta getMeta() {
            return meta;
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }

    }


    public class Date {

        @SerializedName("readable")
        @Expose
        private String readable;
        @SerializedName("timestamp")
        @Expose
        private String timestamp;

        public String getReadable() {
            return readable;
        }

        public void setReadable(String readable) {
            this.readable = readable;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

    }


    public class Example {

        @SerializedName("code")
        @Expose
        private int code;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("data")
        @Expose
        private Data data;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

    }



    public class Meta {

        @SerializedName("latitude")
        @Expose
        private float latitude;
        @SerializedName("longitude")
        @Expose
        private float longitude;
        @SerializedName("timezone")
        @Expose
        private String timezone;
        @SerializedName("method")
        @Expose
        private Method method;
        @SerializedName("latitudeAdjustmentMethod")
        @Expose
        private String latitudeAdjustmentMethod;
        @SerializedName("midnightMode")
        @Expose
        private String midnightMode;
        @SerializedName("school")
        @Expose
        private String school;
        @SerializedName("offset")
        @Expose
        private Offset offset;

        public float getLatitude() {
            return latitude;
        }

        public void setLatitude(float latitude) {
            this.latitude = latitude;
        }

        public float getLongitude() {
            return longitude;
        }

        public void setLongitude(float longitude) {
            this.longitude = longitude;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public Method getMethod() {
            return method;
        }

        public void setMethod(Method method) {
            this.method = method;
        }

        public String getLatitudeAdjustmentMethod() {
            return latitudeAdjustmentMethod;
        }

        public void setLatitudeAdjustmentMethod(String latitudeAdjustmentMethod) {
            this.latitudeAdjustmentMethod = latitudeAdjustmentMethod;
        }

        public String getMidnightMode() {
            return midnightMode;
        }

        public void setMidnightMode(String midnightMode) {
            this.midnightMode = midnightMode;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public Offset getOffset() {
            return offset;
        }

        public void setOffset(Offset offset) {
            this.offset = offset;
        }

    }


    public class Method {

        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("params")
        @Expose
        private Params params;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Params getParams() {
            return params;
        }

        public void setParams(Params params) {
            this.params = params;
        }

    }

    public class Offset {

        @SerializedName("Imsak")
        @Expose
        private int imsak;
        @SerializedName("Fajr")
        @Expose
        private int fajr;
        @SerializedName("Sunrise")
        @Expose
        private int sunrise;
        @SerializedName("Dhuhr")
        @Expose
        private int dhuhr;
        @SerializedName("Asr")
        @Expose
        private int asr;
        @SerializedName("Maghrib")
        @Expose
        private int maghrib;
        @SerializedName("Sunset")
        @Expose
        private int sunset;
        @SerializedName("Isha")
        @Expose
        private int isha;
        @SerializedName("Midnight")
        @Expose
        private int midnight;

        public int getImsak() {
            return imsak;
        }

        public void setImsak(int imsak) {
            this.imsak = imsak;
        }

        public int getFajr() {
            return fajr;
        }

        public void setFajr(int fajr) {
            this.fajr = fajr;
        }

        public int getSunrise() {
            return sunrise;
        }

        public void setSunrise(int sunrise) {
            this.sunrise = sunrise;
        }

        public int getDhuhr() {
            return dhuhr;
        }

        public void setDhuhr(int dhuhr) {
            this.dhuhr = dhuhr;
        }

        public int getAsr() {
            return asr;
        }

        public void setAsr(int asr) {
            this.asr = asr;
        }

        public int getMaghrib() {
            return maghrib;
        }

        public void setMaghrib(int maghrib) {
            this.maghrib = maghrib;
        }

        public int getSunset() {
            return sunset;
        }

        public void setSunset(int sunset) {
            this.sunset = sunset;
        }

        public int getIsha() {
            return isha;
        }

        public void setIsha(int isha) {
            this.isha = isha;
        }

        public int getMidnight() {
            return midnight;
        }

        public void setMidnight(int midnight) {
            this.midnight = midnight;
        }

    }

    public class Params {

        @SerializedName("Fajr")
        @Expose
        private int fajr;
        @SerializedName("Isha")
        @Expose
        private int isha;

        public int getFajr() {
            return fajr;
        }

        public void setFajr(int fajr) {
            this.fajr = fajr;
        }

        public int getIsha() {
            return isha;
        }

        public void setIsha(int isha) {
            this.isha = isha;
        }

    }

    public class Timings {

        @SerializedName("Fajr")
        @Expose
        private String fajr;
        @SerializedName("Sunrise")
        @Expose
        private String sunrise;
        @SerializedName("Dhuhr")
        @Expose
        private String dhuhr;
        @SerializedName("Asr")
        @Expose
        private String asr;
        @SerializedName("Sunset")
        @Expose
        private String sunset;
        @SerializedName("Maghrib")
        @Expose
        private String maghrib;
        @SerializedName("Isha")
        @Expose
        private String isha;
        @SerializedName("Imsak")
        @Expose
        private String imsak;
        @SerializedName("Midnight")
        @Expose
        private String midnight;

        public String getFajr() {
            return fajr;
        }

        public void setFajr(String fajr) {
            this.fajr = fajr;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public String getDhuhr() {
            return dhuhr;
        }

        public void setDhuhr(String dhuhr) {
            this.dhuhr = dhuhr;
        }

        public String getAsr() {
            return asr;
        }

        public void setAsr(String asr) {
            this.asr = asr;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public String getMaghrib() {
            return maghrib;
        }

        public void setMaghrib(String maghrib) {
            this.maghrib = maghrib;
        }

        public String getIsha() {
            return isha;
        }

        public void setIsha(String isha) {
            this.isha = isha;
        }

        public String getImsak() {
            return imsak;
        }

        public void setImsak(String imsak) {
            this.imsak = imsak;
        }

        public String getMidnight() {
            return midnight;
        }

        public void setMidnight(String midnight) {
            this.midnight = midnight;
        }

    }
}
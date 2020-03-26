package com.bw.nierunzhang20200325.base;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class App extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        Network();
    }

    public boolean Network(){
       ConnectivityManager connectivityManager = (ConnectivityManager) this.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
       NetworkInfo Info = connectivityManager.getActiveNetworkInfo();
       if (Info.isAvailable()){
           String typeName = Info.getTypeName();
           Toast.makeText(context, "网络名称为:"+typeName, Toast.LENGTH_SHORT).show();
           return true;
       }else {
           Toast.makeText(context, "请检查网络", Toast.LENGTH_SHORT).show();
           return false;
       }


    }


}

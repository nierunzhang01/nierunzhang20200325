package com.bw.nierunzhang20200325.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.bw.nierunzhang20200325.base.App;


public class NetNuil {

    private static NetNuil instance;
    private final RequestQueue requestQueue;
    private StringRequest stringRequest;

    private NetNuil(){
        requestQueue = Volley.newRequestQueue(App.context);
    }
    public static NetNuil getInstance() {
        if (instance==null){
            synchronized (NetNuil.class){
                if (instance==null){
                    instance = new NetNuil();
                }
            }
        }
        return instance;
    }

    public interface MyCallBack{
        void onSuccess(String json);
        void onError(String mag);
    }


    //Get请求
    public void doGet(String path, final MyCallBack myCallBack){

        stringRequest = new StringRequest(path, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                myCallBack.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                myCallBack.onError(error.getMessage());
            }
        });
        requestQueue.add(stringRequest);
    }

    //图片请求
    public void doImage(String path, ImageView imageView){
        Glide.with(App.context).load(path).into(imageView);
    }




}

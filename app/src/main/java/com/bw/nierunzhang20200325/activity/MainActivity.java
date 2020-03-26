package com.bw.nierunzhang20200325.activity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bw.nierunzhang20200325.R;
import com.bw.nierunzhang20200325.adapter.MyListAdapter;
import com.bw.nierunzhang20200325.base.MyBaseActivity;
import com.bw.nierunzhang20200325.base.MyContract;
import com.bw.nierunzhang20200325.base.MyPresent;
import com.bw.nierunzhang20200325.bean.MyJson;
import com.bw.nierunzhang20200325.bean.MyList;
import com.google.gson.Gson;

import java.util.List;



public class MainActivity extends MyBaseActivity implements MyContract.InView {

    private ListView mainList;
    private MyPresent myPresent;
    private MyListAdapter myListAdapter;
    private List<MyList> commodityList;


    @Override
    public int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        mainList = findViewById(R.id.main_list);
    }

    @Override
    public void initListener() {
        mainList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("id",commodityList.get(i).getCommodityId());
                startActivity(intent);
            }
        });
    }

    @Override
    public void initData() {
        String path = "http://mobile.bwstudent.com/small/commodity/v1/commodityList";
        myPresent = new MyPresent(this);
        myPresent.IpGet(path);
    }

    @Override
    public void onSuccess(String json) {
        Gson gson = new Gson();
        MyJson myJson = gson.fromJson(json, MyJson.class);
        commodityList = myJson.getResult().pzsc.getCommodityList();
        myListAdapter = new MyListAdapter(MainActivity.this, this.commodityList);
        mainList.setAdapter(myListAdapter);
    }

    @Override
    public void onError(String mag) {

    }
}

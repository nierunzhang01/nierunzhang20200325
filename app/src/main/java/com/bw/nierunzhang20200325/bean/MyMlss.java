package com.bw.nierunzhang20200325.bean;

import java.util.List;


public class MyMlss {

    private List<MyList> commodityList;

    public List<MyList> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<MyList> commodityList) {
        this.commodityList = commodityList;
    }

    public MyMlss() {
    }

    public MyMlss(List<MyList> commodityList) {
        this.commodityList = commodityList;
    }
}

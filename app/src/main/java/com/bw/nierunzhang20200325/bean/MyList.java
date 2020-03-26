package com.bw.nierunzhang20200325.bean;

public class MyList {

    private String masterPic;
    private String commodityName;
    private String commodityId;

    public String getMasterPic() {
        return masterPic;
    }

    public void setMasterPic(String masterPic) {
        this.masterPic = masterPic;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public MyList() {
    }

    public MyList(String masterPic, String commodityName, String commodityId) {
        this.masterPic = masterPic;
        this.commodityName = commodityName;
        this.commodityId = commodityId;
    }
}

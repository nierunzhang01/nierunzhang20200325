package com.bw.nierunzhang20200325.bean;

import java.util.List;

public class MyJson {

    private MyResult result;

    public MyResult getResult() {
        return result;
    }

    public void setResult(MyResult result) {
        this.result = result;
    }

    public MyJson() {
    }

    public MyJson(MyResult result) {
        this.result = result;
    }
}
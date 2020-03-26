package com.bw.nierunzhang20200325.base;

import com.bw.nierunzhang20200325.util.NetNuil;



public class MyModel implements MyContract.InModel {
    @Override
    public void ImGet(String path, final IModel iModel) {
        NetNuil.getInstance().doGet(path, new NetNuil.MyCallBack() {
            @Override
            public void onSuccess(String json) {
                iModel.onSuccess(json);
            }

            @Override
            public void onError(String mag) {
                iModel.onError(mag);
            }
        });
    }
}

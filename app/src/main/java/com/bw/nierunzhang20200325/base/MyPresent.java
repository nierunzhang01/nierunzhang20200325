package com.bw.nierunzhang20200325.base;




public class MyPresent implements MyContract.InPresent {

    MyContract.InView inView;
    MyModel myModel;

    public MyPresent(MyContract.InView view) {
        myModel = new MyModel();
        this.inView =view;

    }

    @Override
    public void IpGet(String path) {
        myModel.ImGet(path, new MyContract.InModel.IModel() {
            @Override
            public void onSuccess(String json) {
                inView.onSuccess(json);
            }

            @Override
            public void onError(String mag) {
                inView.onError(mag);
            }
        });
    }
}

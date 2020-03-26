package com.bw.nierunzhang20200325.base;


public interface MyContract {

    interface InView{
        void onSuccess(String json);
        void onError(String mag);
    }

    interface InPresent{
        void IpGet(String path);

    }

    interface InModel{
        void ImGet(String path, IModel iModel);
        interface IModel{
            void onSuccess(String json);
            void onError(String mag);
        }
    }




}

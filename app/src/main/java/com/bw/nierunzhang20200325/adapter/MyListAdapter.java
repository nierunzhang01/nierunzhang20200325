package com.bw.nierunzhang20200325.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import com.bumptech.glide.Glide;
import com.bw.nierunzhang20200325.R;
import com.bw.nierunzhang20200325.bean.MyList;
import com.bw.nierunzhang20200325.util.NetNuil;

import java.util.List;



public class MyListAdapter extends BaseAdapter {

    private Context context;
    private List<MyList> list;

    public MyListAdapter(Context context, List<MyList> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHand hand;
        if (view==null){
            hand = new ViewHand();
            view = View.inflate(context, R.layout.list_layout,null);
            hand.imageView = view.findViewById(R.id.list_image);
            hand.textView1 = view.findViewById(R.id.list_text1);
            view.setTag(hand);
        }else {
            hand = (ViewHand) view.getTag();
        }
        Glide.getPhotoCacheDir(context);

        hand.textView1.setText(list.get(i).getCommodityName());
        NetNuil.getInstance().doImage(list.get(i).getMasterPic(),hand.imageView);
        return view;
    }

    class ViewHand{
        ImageView imageView;
        TextView textView1;
    }
}

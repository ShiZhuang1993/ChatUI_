package com.nameless.demo_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nameless.demo_01.bean.ChatitemlistviewBean;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * ===================================
 * describe:
 * date:2018/7/11
 * author:zhuang
 * ===================================
 */

public class MainAdapter extends BaseAdapter {
    private ArrayList<ChatitemlistviewBean> arrayList;
    private Context context;

    public MainAdapter(Context context, ArrayList<ChatitemlistviewBean> arrayList) {
        this.context = context;
        this.arrayList = arrayList;

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null) {
            if (getItemViewType(i) == 0) {
                viewHolder = new ViewHolder();
                LayoutInflater from = LayoutInflater.from(context);
                view = from.inflate(R.layout.layout_itme_zuo, null);
                viewHolder.textView = view.findViewById(R.id.text_in);
                viewHolder.icon = view.findViewById(R.id.icon_in);
            } else {
                viewHolder = new ViewHolder();
                LayoutInflater from = LayoutInflater.from(context);
                view = from.inflate(R.layout.layout_itme_you, null);
                viewHolder.textView = view.findViewById(R.id.text_out);
                viewHolder.icon = view.findViewById(R.id.icon_out);
            }
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.textView.setText(arrayList.get(i).getText());
        viewHolder.icon.setImageBitmap(arrayList.get(i).getIcon());


        return view;
    }

    @Override
    public int getItemViewType(int position) {
        ChatitemlistviewBean bean = arrayList.get(position);
        return bean.getType();
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    class ViewHolder {
        private TextView textView;
        private ImageView icon;
    }
}

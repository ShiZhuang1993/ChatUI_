package com.nameless.demo_01;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.nameless.demo_01.bean.ChatitemlistviewBean;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private ListView list_item;
    private EditText edit_query;
    private Button bt;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        list_item = (ListView) findViewById(R.id.list_item);
        edit_query = (EditText) findViewById(R.id.edit_query);
        bt = (Button) findViewById(R.id.bt);
        //当listview为空时显示的view
        //list_item.setEmptyView(findViewById(R.id.image));
   /*     ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(i + "哒哒哒。。。");
        }
        MainAdapter adapter = new MainAdapter(this, arrayList);
        list_item.setAdapter(adapter);*/

        ChatitemlistviewBean bean = new ChatitemlistviewBean();
        bean.setType(0);
        bean.setText("你好");
        bean.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));

        ChatitemlistviewBean bean1 = new ChatitemlistviewBean();
        bean1.setType(1);
        bean1.setText("你好啊");
        bean1.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));

        ChatitemlistviewBean bean2 = new ChatitemlistviewBean();
        bean2.setType(0);
        bean2.setText("你是谁");
        bean2.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));

        ChatitemlistviewBean bean3 = new ChatitemlistviewBean();
        bean3.setType(1);
        bean3.setText("张三");
        bean3.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));

        ChatitemlistviewBean bean4 = new ChatitemlistviewBean();
        bean4.setType(0);
        bean4.setText("恩额");
        bean4.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));

        final ArrayList<ChatitemlistviewBean> arrayList = new ArrayList<>();
        arrayList.add(bean);
        arrayList.add(bean1);
        arrayList.add(bean2);
        arrayList.add(bean3);
        arrayList.add(bean4);

        adapter = new MainAdapter(this, arrayList);
        list_item.setAdapter(adapter);
        list_item.setSelection(adapter.getCount() - 1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChatitemlistviewBean bean0 = new ChatitemlistviewBean();
                bean0.setType(1);
                bean0.setText(edit_query.getText().toString().trim());
                bean0.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
                arrayList.add(bean0);
                adapter.notifyDataSetChanged();
                edit_query.setText("");
                list_item.setSelection(adapter.getCount() - 1);

            }
        });

    }

    private void initData() {
  /*      //获得可见的最后一个
        Toast.makeText(this, list_item.getLastVisiblePosition() + "", Toast.LENGTH_SHORT).show();
        //获得可见的第一个 ;
        Toast.makeText(this, list_item.getFirstVisiblePosition() + "", Toast.LENGTH_SHORT).show();


        list_item.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        //触摸操作
                        Toast.makeText(MainActivity.this, "触摸操作", Toast.LENGTH_SHORT).show();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        //移动操作
                        //Toast.makeText(MainActivity.this, "移动操作", Toast.LENGTH_SHORT).show();
                        break;
                    case MotionEvent.ACTION_UP:
                        //抬起操作
                        Toast.makeText(MainActivity.this, "抬起操作", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });

        list_item.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {

            }

            @Override
            public void onScroll(AbsListView absListView, int i, int i1, int i2) {

            }
        });*/


    }


    private void submit() {
        // validate
        String query = edit_query.getText().toString().trim();
        if (TextUtils.isEmpty(query)) {
            Toast.makeText(this, "query不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}

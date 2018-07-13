package com.nameless.demo_01.bean;

import android.graphics.Bitmap;

/**
 * ===================================
 * describe:
 * date:2018/7/13
 * author:zhuang
 * ===================================
 */

public class ChatitemlistviewBean {
    private int type;
    private String text;
    private Bitmap icon;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text == null ? "" : text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Bitmap getIcon() {
        return icon;
    }

    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }
}

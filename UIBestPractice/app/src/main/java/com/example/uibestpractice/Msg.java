package com.example.uibestpractice;

/**
 * Created by king on 2017/1/20 0020.
 */

public class Msg {

    public static final int TYPE_RECEIVED = 0;

    public static final int TYPE_SEND = 1;

    private String content;

    private int type;

    public Msg(String content,int type){
        this.content = content;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public String getContent() {
        return content;
    }
}

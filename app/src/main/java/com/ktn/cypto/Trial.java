package com.ktn.cypto;

public class Trial {

    public static String onRevers(String data){
        return data.length()>0?onRevers(data.substring(0,data.length())):data;
    }

    public static void main(String[] args){
        System.out.print(onRevers("Daniel"));
    }
}

package com.gyz.db.utils;

import java.util.Random;

public class RandomTools {

    //length用户要求产生字符串的长度
    public static String getRandomString(){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 100; i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

}

package cn.edu.zucc.util;

/**
 * Created by zxy on 6/1/2016.
 */
public class Util {
    public static String getPostfix(String path){
        if(path == null || "".equals(path.trim()))
            return "";
        if(path.contains("."))
            return path.substring(path.lastIndexOf(".") + 1);
        return "";
    }
}

package com.example.jp.kaiyan_lzq01.tools.http;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by jp on 2017/3/5.
 */
public class HttpUtils {


    public static boolean isNetWorkConn(Context context)
    {
        boolean flag = false;

        ConnectivityManager manager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        //获取网络连接的状态
        NetworkInfo info = manager.getActiveNetworkInfo();

        if (info!=null)
        {
            if(info.isConnected()) return true;
        }
        return  flag;
    }
    /**
     * 得到String 类型的结果
     * @param path
     * @return
     */
    public static String getStringResult(String path) {
        // TODO Auto-generated method stub

        try {

            URL url = new URL(path);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            conn.connect();

            if(conn.getResponseCode() == 200)
            {
                InputStream is = conn.getInputStream();

                StringBuffer sBuffer = new StringBuffer();

                byte[] buffer = new byte[1024];
                int len = 0;

                while ((len = is.read(buffer))!=-1) {

                    sBuffer.append(new String(buffer, 0, len));
                }

                return sBuffer.toString();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }


        return null;
    }

    /**
     * 向网络加载图片, 并且返回Bitmap
     * @param imagePath
     * @return
     */
    public static Bitmap getBitmap(String imagePath) {

        try {

            URL url = new URL(imagePath);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            conn.connect();

            if(conn.getResponseCode() == 200)
            {
                InputStream is = conn.getInputStream();

                BufferedInputStream bis = new BufferedInputStream(is);

                Bitmap bitmap = BitmapFactory.decodeStream(bis);

                is.close();
                bis.close();

                return bitmap;

            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    /**
     * 向网络获取byte[] 类型的数据
     * @param path 路径
     * @return
     */
    public static byte[] getByteResult(String path)
    {
        HttpURLConnection conn  = null;
        ByteArrayOutputStream baos = null;

        try {

            URL url = new URL(path);

            conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            conn.connect();

            if (conn.getResponseCode() == 200)
            {
                InputStream is = conn.getInputStream();

                baos = new ByteArrayOutputStream();

                byte[] buffer = new byte[1024];
                int len = 0;

                while ((len = is.read(buffer))!=-1)
                {
                    baos.write(buffer,0,len);
                    baos.flush();
                }

                return  baos.toByteArray();
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            if(conn!=null)
            {
                conn.disconnect();
            }
            if (baos!=null)
            {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        return  null;
    }

}


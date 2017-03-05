package com.example.jp.kaiyan_lzq01.tools.http;

import android.os.AsyncTask;

/**
 * Created by jp on 2017/3/5.
 */

public class DownLoadDataTask extends AsyncTask<String, Void,byte[]> {

    private HttpCallBack callBack;
    private int id;

    public DownLoadDataTask(HttpCallBack callBack,int id)
    {
        this.callBack = callBack;
        this.id = id;
    }

    @Override
    protected byte[] doInBackground(String... strings) {

        return HttpUtils.getByteResult(strings[0]);

    }

    @Override
    protected void onPostExecute(byte[] bytes) {

        callBack.sendData(id,bytes);
    }

    public interface  HttpCallBack
    {
        public void sendData(int id,byte[] result);
    }
}

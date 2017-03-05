package com.example.jp.kaiyan_lzq01.faxian;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.jp.kaiyan_lzq01.R;

/**
 * Created by jp on 2017/3/5.
 */

public class FenLeiFragment extends Fragment {
    private ListView listView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fenlei,container,false);
        listView = (ListView) view.findViewById(R.id.lv);
        setList();
        return view;
    }
    public void setList(){
        /*需要下载到bean ,然后 填充Adapter*/
      /*  totaList = new ArrayList<Technology>();
        totaList.addAll(data);
        adapter = new MyAdapter(getActivity(), data);//！！！
        listView.setAdapter(adapter);*/
    }
}

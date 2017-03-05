package com.example.jp.kaiyan_lzq01.wode;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.example.jp.kaiyan_lzq01.R;

/**
 * Created by jp on 2017/3/5.
 */

public class WoDeFragment extends Fragment {
    private Button btn_01, btn_02;
    //控件
    private ListView lv ;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wode, container, false);
       lv= (ListView) view.findViewById(R.id.wo_de_lv);
        /*
ListView的文字怎么居中显示?
        使用SimpleAdaple然后在textView中使用Android:gravity="center_horizontal即可
        设置listView的样式。设置点击事件*/
        return view;
    }
}

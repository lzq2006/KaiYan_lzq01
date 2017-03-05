package com.example.jp.kaiyan_lzq01.jingxuan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jp.kaiyan_lzq01.R;

/**
 * Created by jp on 2017/3/5.
 */

public class JingXuanFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_jingxuan,container,false);


        return view;
    }
}

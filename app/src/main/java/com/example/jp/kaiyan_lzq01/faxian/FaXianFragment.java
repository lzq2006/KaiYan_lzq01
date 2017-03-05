package com.example.jp.kaiyan_lzq01.faxian;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jp.kaiyan_lzq01.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jp on 2017/3/5.
 */
/*

public class FaXianFragment extends Fragment{
    private List<Fragment> fragments;
    private ViewPager viewPager;

    private ToCategories toCategories = new ToCategories() {
        @Override
        public void toCategories() {
            if(viewPager!=null){
                viewPager.setCurrentItem(1);
            }
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_faxian, container, false);

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.fragment_discover_tabLayout);
        viewPager = (ViewPager) view.findViewById(R.id.fragment_discover_viewPager);

        //添加3个小模块的Fragment的集合
        fragments = new ArrayList<>();
        ReMenFragment  reMenFragment=new ReMenFragment();
       */
/* Bundle bundle = new Bundle();
        bundle.putSerializable("toCategories",toCategories);
        reMenFragment.setArguments(bundle);*//*

        fragments.add(reMenFragment);

       FenLeiFragment fenLeiFragment=new FenLeiFragment();
        fragments.add(fenLeiFragment);

        ZuoZheFragment zuoZheFragment=new ZuoZheFragment();
        fragments.add(zuoZheFragment);

        //tabLayout的数据
        List<String> titles = new ArrayList<>();
        titles.add("热门");
        titles.add("分类");
        titles.add("作者");


        //viewpager设置适配器
        CommonFragmentPagerAdapter adapter = new CommonFragmentPagerAdapter(getChildFragmentManager(),fragments,titles);
        viewPager.setAdapter(adapter);

        //tabLayout关联ViewPager
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    public interface ToCategories extends Serializable {
        void toCategories();
    }
}




*/


public class FaXianFragment extends  Fragment{

    private List<Fragment> fragments;
    private ViewPager viewPager;

    private ToCategories toCategories = new ToCategories() {
        @Override
        public void toCategories() {
            if(viewPager!=null){
                viewPager.setCurrentItem(1);
            }
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_faxian, container, false);

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.fragment_discover_tabLayout);
        viewPager = (ViewPager) view.findViewById(R.id.fragment_discover_viewPager);

        //添加3个小模块的Fragment的集合
        fragments = new ArrayList<>();
        ReMenFragment reMenFragment=new ReMenFragment();

/* Bundle bundle = new Bundle();
        bundle.putSerializable("toCategories",toCategories);
        reMenFragment.setArguments(bundle);*/

        fragments.add(reMenFragment);

       FenLeiFragment fenLeiFragment=new FenLeiFragment();
        fragments.add(fenLeiFragment);

        ZuoZheFragment zuoZheFragment=new ZuoZheFragment();
        fragments.add(zuoZheFragment);

        //tabLayout的数据
        List<String> titles = new ArrayList<>();
        titles.add("分类");
        titles.add("热门");
        titles.add("作者");


        //viewpager设置适配器
        CommonFragmentPagerAdapter adapter = new CommonFragmentPagerAdapter(getChildFragmentManager(),fragments,titles);
        viewPager.setAdapter(adapter);

        //tabLayout关联ViewPager
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    public interface ToCategories extends Serializable {
        void toCategories();
    }
}


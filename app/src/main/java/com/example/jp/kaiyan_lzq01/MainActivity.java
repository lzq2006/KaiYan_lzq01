package com.example.jp.kaiyan_lzq01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.jp.kaiyan_lzq01.faxian.FaXianFragment;
import com.example.jp.kaiyan_lzq01.guanzhu.GuanZhuFragment;
import com.example.jp.kaiyan_lzq01.jingxuan.JingXuanFragment;
import com.example.jp.kaiyan_lzq01.wode.WoDeFragment;
/*testvvv ttttesp*/
public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup rgBottom;
    private FragmentManager manager;//v4下的Fragment

    private Fragment[] fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏标题栏  当activity是原型时，继承android.activity
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //如果activity是v4或者v7时使用此方法
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        //获取fragment管理器
        manager = getSupportFragmentManager();
        initFragment();
        initView();
    }

    /**
     * 初始化Fragment，放置到数组中
     */
    private void initFragment() {
        fragments = new Fragment[4];
        //发现
        JingXuanFragment discoverFragment = new JingXuanFragment();
        fragments[0] = discoverFragment;

        FaXianFragment subscribeFragment = new FaXianFragment();
        fragments[1] = subscribeFragment;

        GuanZhuFragment downloadFragment = new GuanZhuFragment();
        fragments[2] = downloadFragment;

        WoDeFragment personalFragment = new WoDeFragment();
        fragments[3] = personalFragment;

    }

    /**
     * 初始化底部导航栏
     */
    private void initView() {
        rgBottom = (RadioGroup) findViewById(R.id.activity_main_radioGroup_bottom);
        rgBottom.setOnCheckedChangeListener(this);
        //设置第一个默认选中
        ((RadioButton) rgBottom.getChildAt(0)).setChecked(true);

        //
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        //导航实现fragment切换
        FragmentTransaction transaction = manager.beginTransaction();
        switch (checkedId) {
            case R.id.activity_main_bottom_discover:
                transaction.replace(R.id.activity_main_container, fragments[0]);
                break;
            case R.id.activity_main_bottom_subscribe:
                transaction.replace(R.id.activity_main_container, fragments[1]);
                break;
            case R.id.activity_main_bottom_download:
                transaction.replace(R.id.activity_main_container, fragments[2]);
                break;
            case R.id.activity_main_bottom_personal:
                transaction.replace(R.id.activity_main_container, fragments[3]);
                break;
        }
        transaction.commit();
    }
}

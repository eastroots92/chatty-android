package com.openull.eastroots92.vacation_homework_android.ui.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import com.openull.eastroots92.vacation_homework_android.R;
import com.openull.eastroots92.vacation_homework_android.apis.HomeworkApis;
import com.openull.eastroots92.vacation_homework_android.presenter.Main.GreenContract;
import com.openull.eastroots92.vacation_homework_android.presenter.Main.MainContract;
import com.openull.eastroots92.vacation_homework_android.ui.Adapter.ViewPagerAdapter;
import com.openull.eastroots92.vacation_homework_android.ui.Fragment.BlueFragment;
import com.openull.eastroots92.vacation_homework_android.ui.Fragment.GreenFragment;
import com.openull.eastroots92.vacation_homework_android.ui.Fragment.RedFragment;

public class MainActivity extends AppCompatActivity implements MainContract.View {

  private RedFragment redFragment;
  private BlueFragment blueFragment;
  private GreenFragment greenFragment;

  private ViewPager viewPager;
  private TabLayout tabLayout;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    initView();

  }

  @Override
  public void initView() {
    redFragment = new RedFragment();
    blueFragment = new BlueFragment();
    greenFragment = new GreenFragment();

    initViewPager();
    initTabLayout();
  }

  private void initTabLayout() {
    tabLayout = findViewById(R.id.tabLayout_tabs);

    tabLayout.setupWithViewPager(viewPager);
  }

  private void initViewPager() {
    viewPager = findViewById(R.id.viewPager_fragmentView);

    Fragment[] arrayFragments = new Fragment[3];
    arrayFragments[0] = redFragment;
    arrayFragments[1] = greenFragment;
    arrayFragments[2] = blueFragment;

    viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), arrayFragments));
  }

}

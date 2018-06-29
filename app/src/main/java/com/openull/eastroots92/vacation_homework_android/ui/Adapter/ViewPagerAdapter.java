package com.openull.eastroots92.vacation_homework_android.ui.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

  private Fragment[] arrayFragments;

  public ViewPagerAdapter(FragmentManager supportFragmentManager, Fragment[] arrayFragments) {
    super(supportFragmentManager);

    this.arrayFragments = arrayFragments;
  }

  @Override
  public Fragment getItem(int position) {
    return arrayFragments[position];
  }

  @Override
  public int getCount() {
    return arrayFragments.length;
  }
}

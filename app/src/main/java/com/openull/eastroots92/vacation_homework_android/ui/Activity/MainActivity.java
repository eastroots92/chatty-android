package com.openull.eastroots92.vacation_homework_android.ui.Activity;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import com.openull.eastroots92.vacation_homework_android.R;
import com.openull.eastroots92.vacation_homework_android.apis.HomeworkApis;
import com.openull.eastroots92.vacation_homework_android.presenter.Main.GreenContract;
import com.openull.eastroots92.vacation_homework_android.presenter.Main.MainContract;
import com.openull.eastroots92.vacation_homework_android.ui.Fragment.BlueFragment;
import com.openull.eastroots92.vacation_homework_android.ui.Fragment.GreenFragment;
import com.openull.eastroots92.vacation_homework_android.ui.Fragment.RedFragment;

public class MainActivity extends AppCompatActivity implements MainContract.View, View.OnClickListener {

  private RedFragment redFragment;
  private BlueFragment blueFragment;
  private GreenFragment greenFragment;

  private MainContract.Presenter presenter;
  private HomeworkApis homeworkApis;

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

    findViewById(R.id.view_red).setOnClickListener(this);
    findViewById(R.id.view_green).setOnClickListener(this);
    findViewById(R.id.view_blue).setOnClickListener(this);

    initFragment();
  }

  private void initFragment() {
    getSupportFragmentManager().beginTransaction()
      .add(R.id.frameLayout_fragmentView, redFragment)
      .commit();
  }

  private void setFragment(Fragment fragment) {
    getSupportFragmentManager().beginTransaction()
      .replace(R.id.frameLayout_fragmentView, fragment)
      .commit();
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()){
      case R.id.view_red:
        setFragment(redFragment);
        break;
      case R.id.view_green:
        setFragment(greenFragment);
        break;
      case R.id.view_blue:
        setFragment(blueFragment);
        break;

    }

  }
}

package com.chatty.android.chattyClient.view.addFriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chatty.android.chattyClient.R;
import com.chatty.android.chattyClient.presenter.addFriend.AddFriendPresenter;

import butterknife.ButterKnife;

public class AddFriendActivity extends AppCompatActivity {
  AddFriendPresenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    construct();
  }

  private void construct() {
    setContentView(R.layout.activity_add_friend);
    ButterKnife.bind(this);
    presenter = new AddFriendPresenter(this);
    presenter.construct();
  }

  public void render() {
  }
}

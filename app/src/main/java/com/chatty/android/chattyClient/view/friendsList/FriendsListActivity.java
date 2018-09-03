package com.chatty.android.chattyClient.view.friendsList;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chatty.android.chattyClient.R;
import com.chatty.android.chattyClient.externalModules.AndroidExtended.ExtendedView;
import com.chatty.android.chattyClient.presenter.friendsList.FriendsListPresenter;

import butterknife.ButterKnife;

public class FriendsListActivity extends AppCompatActivity implements ExtendedView<FriendsListProps>{
  FriendsListPresenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    construct();
  }

  private void construct() {
    setContentView(R.layout.activity_friends_list);
    ButterKnife.bind(this);
    presenter = new FriendsListPresenter(this);
    presenter.construct();
  }

  public void render() {
  }

  @Override
  public void initialRender(FriendsListProps p) {

  }

  @Override
  public void update(FriendsListProps p) {

  }

}

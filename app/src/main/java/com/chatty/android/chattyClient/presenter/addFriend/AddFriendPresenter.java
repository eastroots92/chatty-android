package com.chatty.android.chattyClient.presenter.addFriend;

import com.chatty.android.chattyClient.model.State;
import com.chatty.android.chattyClient.module.StateManagerWrapper;
import com.chatty.android.chattyClient.view.addFriend.AddFriendActivity;

public class AddFriendPresenter {
  AddFriendActivity view;

  public AddFriendPresenter(AddFriendActivity addFriendActivity) {
    view = addFriendActivity;
  }

  public void construct() {
    StateManagerWrapper.subscribe(this::stateListener);
    view.render();
    presenterDidMount();
  }

  private void presenterDidMount() {
  }

  private Object stateListener(State state) {
    return null;
  }
}

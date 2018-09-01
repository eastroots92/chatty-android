package com.chatty.android.chattyClient.view.addFriend;

import android.view.View;

import com.chatty.android.chattyClient.externalModules.AndroidExtended.Props;

import java.util.function.Function;

public class AddFriendActivityProps extends Props {
  public Function<Runnable, View.OnClickListener> handleClickImageButtonBack;
  public Function<Runnable, View.OnClickListener> handleClickImageViewProfile;
  public Function<AddFriendActivity, View.OnClickListener> handleClickButtonAddProfile;
}

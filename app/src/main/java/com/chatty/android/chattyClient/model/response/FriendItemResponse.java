package com.chatty.android.chattyClient.model.response;

import java.util.List;

public class FriendItemResponse {
  public List<FriendItem> friendItems;

  public List<FriendItem> getFriendItems() {
    return friendItems;
  }

  public class FriendItem {
    String profile_image;
    String name;
    String bio;
    String created_at;
  }
}

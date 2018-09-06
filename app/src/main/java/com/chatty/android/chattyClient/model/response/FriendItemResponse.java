package com.chatty.android.chattyClient.model.response;

import java.util.List;

public class FriendItemResponse {
  public List<FriendItem> friendItems;

  public List<FriendItem> getFriendItems() {
    return friendItems;
  }

  public class FriendItem {
    public String profile_image;
    public String name;
    public String bio;
    public String created_at;
  }
}

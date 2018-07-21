package com.openull.eastroots92.vacation_homework_android.util;

import com.openull.eastroots92.vacation_homework_android.api.HomeworkApis;
import com.openull.eastroots92.vacation_homework_android.module.RetrofitClient;

public class ApiUtils {
  public static final String BASE_URL = "http://httpbin.org/";

  public static HomeworkApis getHomeworkApis() {
    return RetrofitClient.getClient(BASE_URL)
      .create(HomeworkApis.class);
  }
}

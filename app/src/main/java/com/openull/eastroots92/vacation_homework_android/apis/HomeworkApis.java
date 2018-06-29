package com.openull.eastroots92.vacation_homework_android.apis;

import com.openull.eastroots92.vacation_homework_android.models.response.TempResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HomeworkApis {

  @GET("/get")
  Call<TempResponse> getTemp();

}

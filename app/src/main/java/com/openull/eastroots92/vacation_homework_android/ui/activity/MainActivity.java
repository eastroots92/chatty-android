package com.openull.eastroots92.vacation_homework_android.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.openull.eastroots92.vacation_homework_android.R;
import com.openull.eastroots92.vacation_homework_android.apis.HomeworkApis;
import com.openull.eastroots92.vacation_homework_android.models.response.TempResponse;
import com.openull.eastroots92.vacation_homework_android.presenter.MainContract;
import com.openull.eastroots92.vacation_homework_android.utils.ApiUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements MainContract.View {

  private MainContract.Presenter presenter;
  private HomeworkApis homeworkApis;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    Log.e("#1", "onCreate");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    tempRequest();
  }

  @Override
  public void initView() {

  }

  public void tempRequest() {
    Log.e("#1", "tempRequest");
    homeworkApis = ApiUtils.getHomeworkApis();

    homeworkApis.getTemp()
      .enqueue(new Callback<TempResponse>() {
      @Override
      public void onResponse(Call<TempResponse> call, Response<TempResponse> response) {
        Log.e("#1", "onResponse");

        if(response.isSuccessful()) {
          Log.e("#1", String.valueOf(response));
          Log.e("#2", String.valueOf(response.body().getUrl()));
        }else{
          Log.e("#2", String.valueOf(response.code()));
        }
      }

      @Override
      public void onFailure(Call<TempResponse> call, Throwable t) {
        Log.e("#1", "error: " + t);
      }
    });
  }
}

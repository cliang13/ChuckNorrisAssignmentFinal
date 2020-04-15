package com.example.chucknorrisassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class jokesActivity extends AppCompatActivity {
Response responseData;
TextView mTextViewcreatedAt,mTextViewValue;
ImageView imageViewIcon;
Button btnJoke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        mTextViewcreatedAt=findViewById(R.id.textCreatedAt);
        mTextViewValue=findViewById(R.id.textValue);
        imageViewIcon=findViewById(R.id.imageIcon);
        btnJoke = (Button)findViewById(R.id.btnJoke);

        btnJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getJokes();
            }}   ) ;
        getJokes();
    }

  public void getJokes(){
      final ProgressDialog progressDialog=new ProgressDialog(jokesActivity.this);


      progressDialog.show();
      final Api service = RetrofitClientInstance.getRetrofitInstance().create(Api.class);
      Call<JokesModel> call = service.getstatus();
      call.enqueue(new Callback<JokesModel>() {
          @Override
          public void onResponse(Call<JokesModel>call, Response<JokesModel> response) {
              progressDialog.dismiss();
              //    generateDataList(response.body());
              responseData=response;
              mTextViewcreatedAt.setText("Created at = "+response.body().getCreatedAt());
              mTextViewValue.setText(response.body().getValue());
        //      Picasso.with(jokesActivity.this).load(response.body().getIcon_url()).into(imageViewIcon);
              Log.e("response",response.toString());
          }

          @Override
          public void onFailure(Call<JokesModel> call, Throwable t) {
                 progressDialog.dismiss();
          }
      });
  }

}

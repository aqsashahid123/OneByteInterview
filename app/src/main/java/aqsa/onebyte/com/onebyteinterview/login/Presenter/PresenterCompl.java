package aqsa.onebyte.com.onebyteinterview.login.Presenter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Handler;

import aqsa.onebyte.com.onebyteinterview.MainActivity;
import aqsa.onebyte.com.onebyteinterview.R;
import aqsa.onebyte.com.onebyteinterview.login.Model.LoginResponse;
import aqsa.onebyte.com.onebyteinterview.login.Model.UserPojo;
import aqsa.onebyte.com.onebyteinterview.login.Service.RemoteInterface;
import aqsa.onebyte.com.onebyteinterview.login.Service.RemoteService;
import aqsa.onebyte.com.onebyteinterview.login.View.IView;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
//import retrofit2.Call;
//
//import retrofit2.Callback;
//import retrofit2.Response;
//
/**
 * Created by AQSA SHaaPARR on 1/10/2018.
 */

public class PresenterCompl implements IPresenter {

    Handler handler;
    IView iLoginView;
    Context context;
///IView iView,
    public PresenterCompl( Context context){

        //this.iLoginView=iView;
        this.context = context;

    }

    public PresenterCompl() {

    }


    @Override
    public void doLogin(final String email, String password) {




       // RemoteInterface mApiService = RemoteService.getClient().create(RemoteInterface.class);
//
//        RemoteInterface mApiService = RemoteService.getApiService();
//      //  Call<LoginResponse> call = mApiService.getUserLogin();
//
//        UserPojo task = new UserPojo(email, password);
//        Call<UserPojo> call = mApiService.createTask(task);
//        call.enqueue(new Callback<UserPojo>() {
//            @Override
//        public void onResponse(Call<UserPojo> call, Response<UserPojo> response) {
//            UserPojo mLoginObject = response.body();
//            // String returnedResponse = mLoginObject.isLogin;
//            Toast.makeText(context.getApplicationContext(), "Returned " + response, Toast.LENGTH_LONG).show();
//            //showProgress(false);
////                if(returnedResponse.trim().equals("1")){
////                    // redirect to Main Activity page
////                    Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
////                    loginIntent.putExtra("EMAIL", email);
////                    startActivity(loginIntent);
////                }
////                if(returnedResponse.trim().equals("0")){
////                    // use the registration button to register
////                    failedLoginMessage.setText(getResources().getString(R.string.registration_message));
////                    mPasswordView.requestFocus();
//        }
//
//
//            @Override
//            public void onFailure(Call<UserPojo> call, Throwable t) {
//                Toast.makeText(context,String.valueOf(call),Toast.LENGTH_SHORT).show();
////            //    call.cancel();
////
//                Toast.makeText(context.getApplicationContext(), "Please check your network connection and internet permission", Toast.LENGTH_LONG).show();
//                Toast.makeText(context.getApplicationContext(),String.valueOf(t),Toast.LENGTH_SHORT).show();
//                t.printStackTrace();
//                Log.e("error",String.valueOf(t));
//            }
//        });
//
//
//       // Call<LoginResponse> mService = mApiService.getUserLogin(email, password);
////        mService.enqueue(new Callback<LoginResponse>() {
////            @Override
////            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
////                LoginResponse mLoginObject = response.body();
////               // String returnedResponse = mLoginObject.isLogin;
////                Toast.makeText(context.getApplicationContext(), "Returned " + response, Toast.LENGTH_LONG).show();
////                //showProgress(false);
//////                if(returnedResponse.trim().equals("1")){
//////                    // redirect to Main Activity page
//////                    Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
//////                    loginIntent.putExtra("EMAIL", email);
//////                    startActivity(loginIntent);
//////                }
//////                if(returnedResponse.trim().equals("0")){
//////                    // use the registration button to register
//////                    failedLoginMessage.setText(getResources().getString(R.string.registration_message));
//////                    mPasswordView.requestFocus();
////                }
////
////
////            @Override
////            public void onFailure(Call<LoginResponse> call, Throwable t) {
////               Toast.makeText(context,String.valueOf(call),Toast.LENGTH_SHORT).show();
//////            //    call.cancel();
//////
////                Toast.makeText(context.getApplicationContext(), "Please check your network connection and internet permission", Toast.LENGTH_LONG).show();
////                Toast.makeText(context.getApplicationContext(),String.valueOf(t),Toast.LENGTH_SHORT).show();
////                t.printStackTrace();
////                Log.e("error",String.valueOf(t));
////            }
////
//
//
//        });


    }



    @Override
    public void doSignUp(final String email, final String password) {

     //   RemoteInterface mApiService = RemoteService.getClient().create(RemoteInterface.class);
        RemoteInterface mApiService = RemoteService.getApiService();
        mApiService.InsertUser(email,password,
        new Callback<Response>(){
            @Override
            public void success(Response response, Response response2) {

                Toast.makeText(context.getApplicationContext(),String.valueOf(response),Toast.LENGTH_SHORT).show();

                BufferedReader reader = null;
                String output = "";
                try{

                    reader = new BufferedReader(new InputStreamReader(response.getBody().in()));
                    output = reader.readLine();



                }
                catch (Exception e){

                    e.printStackTrace();
                    Toast.makeText(context.getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();

                }
                Toast.makeText(context.getApplicationContext(),output,Toast.LENGTH_SHORT).show();

            }

            @Override
            public void failure(RetrofitError error) {
                error.printStackTrace();


                if(error.toString().contains("java.io.EOFException")){
                    doSignUp(email,password);
                }else{

                    Toast.makeText(context,String.valueOf(error.getBody()),Toast.LENGTH_SHORT).show();
                    Toast.makeText(context,String.valueOf(error),Toast.LENGTH_SHORT).show();

                   // handleFailure();
                }



            }
        });


    }
}

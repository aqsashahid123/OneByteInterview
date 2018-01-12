package aqsa.onebyte.com.onebyteinterview.login.Service;

import aqsa.onebyte.com.onebyteinterview.login.Model.LoginResponse;
import aqsa.onebyte.com.onebyteinterview.login.Model.UserPojo;
//import okhttp3.ResponseBody;
import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.http.Body;
//import retrofit2.http.Field;
//import retrofit2.http.FormUrlEncoded;
//import retrofit2.http.GET;
//import retrofit2.http.POST;
//import retrofit2.http.Path;

/**
 * Created by AQSA SHaaPARR on 1/12/2018.
 */

public interface RemoteInterface {



//    @FormUrlEncoded
//    @POST("login.php")
//    Call<LoginResponse> getUserLogin(
//           // @Field("client_id") String id,
//          //  @Field("client_secret") String secret,
//            @Field("email") String uname,
//            @Field("password") String password
//    );

//    @FormUrlEncoded
//    @POST("login.php")
//    Call<LoginResponse> getUserLogin(
//
//            // @Field("client_id") String id,
//            //  @Field("client_secret") String secret,
//            @Field("email") String uname,
//            @Field("password") String password
//    );

//    @POST("login.php")
//    Call<UserPojo> createTask(@Body UserPojo task);
    @FormUrlEncoded
    @POST("/sign_up.php")
    public void InsertUser(
//           // @Field("client_id") String id,
//          //  @Field("client_secret") String secret,
            @Field("email") String uname,
            @Field("password") String password,
            Callback<Response> callBack
    );



}

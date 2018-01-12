package aqsa.onebyte.com.onebyteinterview.login.Service;

import java.util.concurrent.TimeUnit;

//import okhttp3.OkHttpClient;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by AQSA SHaaPARR on 1/12/2018.
 */

public class RemoteService {

    public static final String BASE_URL = "http://192.168.10.13/OneByteTest";
  //  private static Retrofit retrofit = null;



    public static RestAdapter getClient() {
     //   OkHttpClient client = new OkHttpClient.Builder()
////                //.retryOnConnectionFailure(true)
////                .build();

        return   new RestAdapter
                .Builder()

                .setEndpoint(BASE_URL)
                .build();

    }


        public static RemoteInterface getApiService() {
        return getClient().create(RemoteInterface.class);
    }



//    public static Retrofit getClient() {
////        OkHttpClient client = new OkHttpClient.Builder()
////                //.retryOnConnectionFailure(true)
////                .build();
////
////        if (retrofit==null) {
////            retrofit = new Retrofit.Builder()
////                    .baseUrl(BASE_URL)
////                    .client(client)
////                    .addConverterFactory(GsonConverterFactory.create())
////                    .build();
////        }
////        return retrofit;
//
//        OkHttpClient client = new OkHttpClient();
//       // client.setRetryOnConnectionFailure(false);
//        return new Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .client(client)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//    }
//    public static RemoteInterface getApiService() {
//        return getClient().create(RemoteInterface.class);
//    }

}

package aqsa.onebyte.com.onebyteinterview.login.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by AQSA SHaaPARR on 1/12/2018.
 */

public class LoginResponse {


    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("date")
    @Expose
    private String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoginResponse withId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }






}

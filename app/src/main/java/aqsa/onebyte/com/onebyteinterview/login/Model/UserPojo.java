package aqsa.onebyte.com.onebyteinterview.login.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by AQSA SHaaPARR on 1/10/2018.
 */

public class UserPojo implements IUser {



    String email;

    String password;



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String getPassword() {
        return password;
    }

   // @SerializedName("id")
    String id;

  public   UserPojo(String name,String password){

        this.email = name;
        this.password = password;

    }





    @Override
    public int checkUserValidity(String userName, String password) {
        if (email.length()==0|| password.length()==0){


            return -1;
        }
        else {

            return 0;

        }
        }


}

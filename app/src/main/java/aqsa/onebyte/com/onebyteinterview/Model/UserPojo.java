package aqsa.onebyte.com.onebyteinterview.Model;

/**
 * Created by AQSA SHaaPARR on 1/10/2018.
 */

public class UserPojo implements IUser {

    String name,password;


    UserPojo(String name,String password){

        this.name = name;
        this.password = password;

    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public int checkUserValidity(String userName, String password) {
        if (name.length()==0|| password.length()==0){


            return -1;
        }
        else {

            return 0;

        }
        }


}

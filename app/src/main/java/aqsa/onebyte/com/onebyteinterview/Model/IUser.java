package aqsa.onebyte.com.onebyteinterview.Model;

/**
 * Created by AQSA SHaaPARR on 1/10/2018.
 */

public interface IUser {

    String getUserName();
    String getPassword();
    int checkUserValidity(String userName,String password);

}

package aqsa.onebyte.com.onebyteinterview.login.Model;

/**
 * Created by AQSA SHaaPARR on 1/10/2018.
 */

public interface IUser {

    String getEmail();
    String getPassword();
    String getId();
    int checkUserValidity(String userName,String password);

}

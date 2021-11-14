package sender;

import facebook.FacebookUser;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class MyFacebookUser implements AdeptUser{
    private FacebookUser user;
    private String email;
    private String country;
    private String text;

    public MyFacebookUser (FacebookUser newUser) {
        user = newUser;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return user.getUserActiveTime();
    }

    @Override
    public void setText(String text1) {
        text = text1;
    }
}

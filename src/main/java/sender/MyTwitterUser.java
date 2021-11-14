package sender;

import lombok.Getter;
import lombok.Setter;
import twitter.TwitterUser;

import java.util.Date;

@Getter @Setter
public class MyTwitterUser implements AdeptUser{
    private TwitterUser user;
    private String text;
    private String email;
    private String country;

    public MyTwitterUser (TwitterUser newUser) {
        user = newUser;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return user.getLastActiveTime();
    }

    public void setText(String text) {
        this.text = text;
    }
}

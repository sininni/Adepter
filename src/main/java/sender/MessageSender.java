package sender;

import facebook.FacebookUser;
import twitter.TwitterUser;

import java.util.Date;

public class MessageSender {
    public void send(String text, AdeptUser user, String country) {
        Date currentDate = java.util.Calendar.getInstance().getTime();
        if (user.getCountry().equals(country) &&
                ((user.getLastActiveTime().getTime() - currentDate.getTime()) / (60 * 60 * 1000) <= 1)) {
            user.setText(text);
        }
    }
}

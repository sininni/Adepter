package sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {

    private TwitterUser twitterUser;
    private MyTwitterUser myTwitterUser;

    @BeforeEach
    void setUp() {
        Date date = new Date();
        twitterUser = new TwitterUser("t.gmail.com", "Ukraine", date);
        myTwitterUser = new MyTwitterUser(twitterUser);
    }

    @Test
    void getEmail() {
        assertEquals(twitterUser.getUserMail(), myTwitterUser.getEmail());
    }

    @Test
    void getCountry() {
        assertEquals(twitterUser.getCountry(), myTwitterUser.getCountry());
    }

    @Test
    void getLastActiveTime() {
        assertEquals(twitterUser.getLastActiveTime(), myTwitterUser.getLastActiveTime());
    }
}
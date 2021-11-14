package sender;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {

    FacebookUser facebookUser;
    MyFacebookUser myFacebookUser;

    @BeforeEach
    void setUp() {
        Date data = new Date();
        facebookUser = new FacebookUser("g.gmail.com", "Ukraine", data);
        myFacebookUser = new MyFacebookUser(facebookUser);
    }

    @Test
    void getEmail() {
        assertEquals(facebookUser.getEmail(), myFacebookUser.getEmail());
    }

    @Test
    void getCountry() {
        assertEquals(facebookUser.getEmail(), myFacebookUser.getEmail());
    }

    @Test
    void getLastActiveTime() {
        assertEquals(facebookUser.getUserActiveTime(), myFacebookUser.getLastActiveTime());
    }
}
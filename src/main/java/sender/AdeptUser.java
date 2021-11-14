package sender;

import java.util.Date;

interface AdeptUser {
    String getEmail();
    String getCountry();
    Date getLastActiveTime();
    void setText(String text);
}

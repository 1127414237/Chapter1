package entity;

import java.util.Date;

public class User {
    private  int uid;
    private  String uname;
    private Date ubirthday;

    public int getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUbirthday(Date ubirthday) {
        this.ubirthday = ubirthday;
    }

    public Date getUbirthday() {
        return ubirthday;

    }
}

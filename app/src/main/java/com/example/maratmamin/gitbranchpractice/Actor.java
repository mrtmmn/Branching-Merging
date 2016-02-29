package com.example.maratmamin.gitbranchpractice;

/**
 * Created by Christian on 2/29/16.
 */
public class Actor {
        String mName;
        String mDob;
        int mOscars;

    public  Actor(String name, String date, int oscar) {
        name = mName;
        date = mDob;
        oscar = mOscars;

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDob() {
        return mDob;
    }

    public void setmDob(String mDob) {
        this.mDob = mDob;
    }

    public int getmOscars() {
        return mOscars;
    }

    public void setmOscars(int mOscars) {
        this.mOscars = mOscars;
    }
}

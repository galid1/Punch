package com.punch.punch.model;

/**
 * Created by galid on 2018-06-22.
 */

public class Authentication implements OauthAuthentication{

    private String uid;

    @Override
    public boolean signIn(String token) {

        return false;
    }

    @Override
    public boolean signUp(String token) {
        return false;
    }

    @Override
    public boolean signOut() {
        return false;
    }

    @Override
    public String getUid() {
        return this.uid;
    }
}

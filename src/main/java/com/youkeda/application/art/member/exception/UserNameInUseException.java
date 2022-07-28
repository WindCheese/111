package com.youkeda.application.art.member.exception;

import com.youkeda.application.art.member.model.User;

public class UserNameInUseException extends Exception{

    private User user;

    public UserNameInUseException(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}

package com.example.springredditclone.exceptions;

/**
 * This class is a custom exception and is created because we want to present the information to the user
 * in an understandable format and we don't want to expose the technical information to the user.
 * like illegal state exception, null pointer exception or socket exception
 */
public class SpringRedditException extends Throwable {
    public SpringRedditException(String exMessage) {
        super(exMessage);
    }
}

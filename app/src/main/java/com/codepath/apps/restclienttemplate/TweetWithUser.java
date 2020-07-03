package com.codepath.apps.restclienttemplate;

import androidx.room.Embedded;

import com.codepath.apps.restclienttemplate.models.Tweet;
import com.codepath.apps.restclienttemplate.models.User;

public class TweetWithUser {
    @Embedded
    User user;

    @Embedded(prefix="tweet_")
    Tweet tweet;

}

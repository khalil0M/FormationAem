package com.models.user;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.api.SlingHttpServletRequest;
//import org.apache.sling.models.annotations.Model;
//import org.apache.sling.api.SlingHttpServletRequest;
//import javax.inject.Inject;

import javax.inject.Inject;

@Model(adaptables=SlingHttpServletRequest.class)
public class userCatModel {

    @Inject
    private String email;

    @Inject
    public String getEmail() {
        return email;
    }

    @Inject
    public userCatModel(String email) {
        this.email = email;
    }
}

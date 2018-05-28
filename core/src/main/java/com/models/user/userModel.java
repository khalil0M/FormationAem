package com.models.user;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables=SlingHttpServletRequest.class)
public class userModel {

    @Inject
    private String email;
    @Inject
    private String pwd;

    @Inject
    public userModel(String email) {
        this.email = email;
    }

    public String getEmail() { return email; }
    public String getPwd() { return pwd; }

}

package com.models.user;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables=SlingHttpServletRequest.class)
public class userModel {

    private String email;

    private String pwd;

    public String getEmail() { return email; }
    public String getPwd() { return pwd; }

}

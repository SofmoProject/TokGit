package com.sofmo.TokGit.security.oauth.user;

import com.sofmo.TokGit.common.AuthProvider;

import java.util.Map;

public class OAuth2UserInfoFactory {
    public static OAuth2UserInfo getOAuth2UserInfo(Map<String, Object> attributes) {
        return new GithubOAuth2UserInfo(attributes);
    }
}
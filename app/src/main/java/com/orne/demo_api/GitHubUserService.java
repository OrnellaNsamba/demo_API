package com.orne.demo_api;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubUserService {
    //donner le type exempleple www.esisalama.com/user/12(int id)
    @GET("/users/{user_id}")
    GitHupUser getUser(@Path("id") int id);
}

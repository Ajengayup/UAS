package idgit.ajeng.githubuser.api

import idgit.ajeng.githubuser.data.model.DetailUserResponse
import idgit.ajeng.githubuser.data.model.User
import idgit.ajeng.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token e7d05396457825d16270577e687141361405514a")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token e7d05396457825d16270577e687141361405514a")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token e7d05396457825d16270577e687141361405514a")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token e7d05396457825d16270577e687141361405514a")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}
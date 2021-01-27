package com.wyq.logindemo.net

import com.wyq.logindemo.bean.Accounts
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by Roman on 2021/1/24
 */
class APIService {

    /**
     * 注册
     */
    interface Register {
        @FormUrlEncoded
        @POST("register")
        fun toRegister(
            @Field("username") username: String,
            @Field("password") password: String
        ): Call<Accounts>
    }

    /**
     * 登录
     */
    interface Login {
        @FormUrlEncoded
        @POST("login")
        fun toLogin(
            @Field("username") username: String,
            @Field("password") password: String
        ):Call<Accounts>
    }

}

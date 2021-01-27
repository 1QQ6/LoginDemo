package com.wyq.logindemo.utils

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.wyq.logindemo.common.Constant
import com.wyq.logindemo.common.MyApplication

/**
 * Created by Roman on 2021/1/11
 */
object SPUtil {
    /**
     *
     */
    @Synchronized
    private fun getSP(): SharedPreferences {
        return MyApplication.context!!.getSharedPreferences("music", MODE_PRIVATE)
    }

    /**
     * 用户是否登录
     */
    @Synchronized
    fun saveLogin(currentProgress: Boolean) {
        getSP().edit().putBoolean(Constant.IS_LOGIN,currentProgress).apply()
    }

    @Synchronized
    fun isLogin():Boolean{
        return getSP().getBoolean(Constant.IS_LOGIN, false)
    }
}
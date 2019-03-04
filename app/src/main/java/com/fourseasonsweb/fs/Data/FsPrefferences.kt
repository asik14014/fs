package com.fourseasonsweb.fs.Data

import android.content.Context
import android.content.SharedPreferences
import javax.inject.Singleton

class FsPrefferences(val ctx: Context) {
    private val preference = "FSPref"
    var settings: SharedPreferences? = null

    @Singleton
    fun updatePreferences() {
        settings = ctx.getSharedPreferences(preference, 0)
    }

    fun saveValue(KEY: String, VALUE: String){
        val editor = settings!!.edit()
        editor.putString(KEY, VALUE)
        editor.apply()
    }

    fun getValue(KEY: String) : Boolean{
        return settings!!.getBoolean(KEY, false)
    }

    fun clearPreference() {
        val editor = settings!!.edit()
        editor.clear()
        editor.apply()
    }
}
package com.fourseasonsweb.fs.Data.User

class ChangePasswordModel {
    private var oldpassword: String? = null
    private var newpassword: String? = null
    private var confirmpassword: String? = null

    fun getOldpassword(): String? {
        return oldpassword
    }

    fun setOldpassword(value: String?) {
        this.oldpassword = value
    }

    fun getNewpassword(): String? {
        return newpassword
    }

    fun setNewpassword(value: String?) {
        this.newpassword = value
    }

    fun getConfirmpassword(): String? {
        return confirmpassword
    }

    fun setConfirmpassword(value: String?) {
        this.confirmpassword = value
    }
}
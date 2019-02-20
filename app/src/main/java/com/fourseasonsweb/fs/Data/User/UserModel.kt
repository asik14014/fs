package com.fourseasonsweb.fs.Data.User

import dagger.Module

@Module
class UserModel {
    private var Id: Int = 0
    private var UserName: String? = null
    private var FirstName: String? = null
    private var LastName: String? = null
    private var Type: Int = -1
    //private var Registration: Date? = null
    private var PhoneNumber: String? = null
    private var Email: String? = null
    private var Password: String? = null
    private var IsActive: Boolean = false
    private var OrganizationId: Int = -1

    fun getUserId(): Int {
        return Id
    }

    fun setUserId(value: Int) {
        this.Id = value
    }

    fun getUserName(): String? {
        return UserName
    }

    fun setUserName(value: String) {
        this.UserName = value
    }

    fun getPassword(): String? {
        return Password
    }

    fun setPassword(value: String) {
        this.Password = value
    }

    fun getEmail(): String? {
        return Email
    }

    fun setEmail(value: String) {
        this.Email = value
    }

    fun getFirsname(): String? {
        return FirstName
    }

    fun setFirstname(value: String) {
        this.FirstName = value
    }

    fun getLastname(): String? {
        return LastName
    }

    fun setLastname(value: String) {
        this.LastName = value
    }

    fun getUsertype(): Int {
        return Type
    }

    fun setUsertype(value: Int) {
        this.Type = value
    }


    //fun getRegistration(): Date? {
//        return Registration
  //  }

    //fun setRegistration(value: Date) {
      //  this.Registration = value
    //}

    fun getPhone(): String? {
        return PhoneNumber
    }

    fun setPhone(value: String) {
        this.PhoneNumber = value
    }

    fun getIsActive(): Boolean? {
        return IsActive
    }

    fun setIsActive(value: Boolean) {
        this.IsActive = value
    }

    fun getOrganizationId(): Int {
        return OrganizationId
    }

    fun setIsActive(value: Int) {
        this.OrganizationId = value
    }
}
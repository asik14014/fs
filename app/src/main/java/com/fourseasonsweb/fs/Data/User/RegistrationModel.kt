package com.fourseasonsweb.fs.Data.User

class RegistrationModel {
    private var email: String? = null
    private var firstName: String? = null
    private var lastName: String? = null
    private var phone: Long? = null
    private var organization: Int? = null
    private var password: String? = null
    private var confirmPassword: String? = null

    fun getEmail(): String? {
        return email
    }

    fun setEmail(value: String?) {
        this.email = value
    }

    fun getFirstName(): String? {
        return firstName
    }

    fun setFirstName(value: String?) {
        this.firstName = value
    }

    fun getLastName(): String? {
        return lastName
    }

    fun setLastName(value: String?) {
        this.lastName = value
    }

    fun getPhone(): Long? {
        return phone
    }

    fun setPhone(value: Long?) {
        this.phone = value
    }

    fun getOrganization(): Int? {
        return organization
    }

    fun setOrganization(value: Int?) {
        this.organization = value
    }

    fun getPassword(): String? {
        return password
    }

    fun setPassword(value: String?) {
        this.password = value
    }

    fun getConfirmPassword(): String? {
        return confirmPassword
    }

    fun setConfirmPassword(value: String?) {
        this.confirmPassword = value
    }


}
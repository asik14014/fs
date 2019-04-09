package com.fourseasonsweb.fs.Data.Journal

class RecordModel {
    private var id: Int? = null
    private var journalId: Int? = null
    private var userId: Int? = null
    private var registration: Long? = null

    constructor(id:Int, journalId: Int?, userId: Int?, registration: Long?) {
        this.id = id
        this.journalId = journalId
        this.userId = userId
        this.registration = registration
    }

    fun getId(): Int? {
        return id
    }

    fun setId(value: Int?) {
        this.id = value
    }

    fun getJournalId(): Int? {
        return journalId
    }

    fun setJournalId(value: Int?) {
        this.journalId = value
    }

    fun getUserId(): Int? {
        return userId
    }

    fun setUserid(value: Int?) {
        this.userId = value
    }

    fun getRegistration(): Long? {
        return registration
    }

    fun setRegistration(value: Long?) {
        this.registration = value
    }
}
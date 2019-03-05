package com.fourseasonsweb.fs.Data.Journal

import java.util.*

class RecordModel {
    private var id: Int? = null
    private var journalId: Int? = null
    private var userId: Int? = null
    private var registration: Date? = null

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

    fun getRegistration(): Date? {
        return registration
    }

    fun setRegistration(value: Date?) {
        this.registration = value
    }
}
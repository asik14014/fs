package com.fourseasonsweb.fs.Data.Journal

class DataModel {
    private var id: Int? = null
    private var recordId: Int? = null
    private var fieldId: Int? = null
    private var value: String? = null

    fun getId(): Int? {
        return id
    }

    fun setId(value: Int?) {
        this.id = value
    }

    fun getFieldId(): Int? {
        return fieldId
    }

    fun setFieldId(value: Int?) {
        this.fieldId = value
    }

    fun getValue(): String? {
        return value
    }

    fun setValue(value: String?) {
        this.value = value
    }

    fun getRecordId(): Int? {
        return recordId
    }

    fun setRecordId(value: Int?) {
        this.recordId = value
    }
}
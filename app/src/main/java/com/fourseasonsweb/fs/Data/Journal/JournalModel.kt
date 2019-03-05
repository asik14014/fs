package com.fourseasonsweb.fs.Data.Journal

class JournalModel {
    private var id: Int? = null
    private var name: String? = null
    private var fieldList: List<FieldModel>? = null

    fun getId(): Int? {
        return id
    }

    fun setId(value: Int?) {
        this.id = value
    }

    fun getName(): String? {
        return name
    }

    fun setName(value: String?) {
        this.name = value
    }

    fun getFieldList(): List<FieldModel>? {
        return fieldList
    }

    fun setFieldList(value: List<FieldModel>?) {
        this.fieldList = value
    }
}
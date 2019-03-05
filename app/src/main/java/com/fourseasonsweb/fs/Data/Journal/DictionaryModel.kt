package com.fourseasonsweb.fs.Data.Journal

class DictionaryModel {
    private var id: Int? = null
    private var fieldId: Int? = null
    private var value: String? = null
    private var type: Short? = null
    private var order: Short? = null
    private var isActive: Boolean? = null

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

    fun getType(): Short? {
        return type
    }

    fun setType(value: Short?) {
        this.type = value
    }

    fun getOrder(): Short? {
        return order
    }

    fun setOrder(value: Short?) {
        this.order = value
    }

    fun getIsActive(): Boolean? {
        return isActive
    }

    fun setIsActive(value: Boolean?) {
        this.isActive = value
    }
}
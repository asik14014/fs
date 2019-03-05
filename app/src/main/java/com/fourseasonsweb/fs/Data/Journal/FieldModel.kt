package com.fourseasonsweb.fs.Data.Journal

class FieldModel {
    private var id: Int? = null
    private var journalId: Int? = null
    private var name: String? = null
    private var type: Short? = null
    private var order: Short? = null
    private var isActive: Boolean? = null
    private var index: Int? = null
    private var dictionaryList: List<DictionaryModel>? = null

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

    fun getName(): String? {
        return name
    }

    fun setName(value: String?) {
        this.name = value
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

    fun getIndex(): Int? {
        return index
    }

    fun setIndex(value: Int?) {
        this.index = value
    }

    fun getDictionaryList(): List<DictionaryModel>? {
        return dictionaryList
    }

    fun setDictionaryList(value: List<DictionaryModel>?) {
        this.dictionaryList = value
    }
}
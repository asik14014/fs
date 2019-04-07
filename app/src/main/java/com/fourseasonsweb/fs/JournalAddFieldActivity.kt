package com.fourseasonsweb.fs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fourseasonsweb.fs.Data.Journal.DictionaryModel
import com.fourseasonsweb.fs.Data.Journal.FieldModel
import com.fourseasonsweb.fs.Network.AccountingApiService
import com.fourseasonsweb.fs.Network.BaseCallback
import javax.inject.Inject

class JournalAddFieldActivity : AppCompatActivity() {
    @Inject
    lateinit var api: AccountingApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_journal_add_field)
    }

    private fun createFieldModel() : FieldModel {
        val id: Int = 0
        val journalId: Int? = null
        val name: String? = null
        val type: Short? = null
        val order: Short? = null
        val isActive: Boolean? = null
        val index: Int? = null
        val dictionaryList: List<DictionaryModel>? = null
        return FieldModel(id, journalId, name, type, order, isActive, index, dictionaryList)
    }

    private fun addField(fieldModel: FieldModel) {
        val call = api.addField(fieldModel)
        call.enqueue(object: BaseCallback<FieldModel>(this) {
            override fun onSuccess(response: FieldModel?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onFail() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }
}

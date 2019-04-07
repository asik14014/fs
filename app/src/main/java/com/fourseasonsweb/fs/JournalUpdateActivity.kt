package com.fourseasonsweb.fs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fourseasonsweb.fs.Data.Journal.FieldModel
import com.fourseasonsweb.fs.Data.Journal.JournalModel
import com.fourseasonsweb.fs.Network.AccountingApiService
import com.fourseasonsweb.fs.Network.BaseCallback
import com.fourseasonsweb.fs.ui.journalupdate.JournalUpdateFragment
import javax.inject.Inject

class JournalUpdateActivity : AppCompatActivity() {
    @Inject
    lateinit var api: AccountingApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.journal_update_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, JournalUpdateFragment.newInstance())
                .commitNow()
        }
    }

    private fun createJournalModel() : JournalModel {
        val id : Int = 0
        val name : String? = null
        val fieldList : List<FieldModel>? = null
        return JournalModel(id, name, fieldList)
    }

    private fun updateJournal(journalModel: JournalModel) {
        val call = api.updateJournal(journalModel)
        call.enqueue(object: BaseCallback<JournalModel>(this) {
            override fun onSuccess(response: JournalModel?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onFail() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }
}

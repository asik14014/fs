package com.fourseasonsweb.fs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fourseasonsweb.fs.Data.Journal.RecordModel
import com.fourseasonsweb.fs.Network.AccountingApiService
import com.fourseasonsweb.fs.Network.BaseCallback
import com.fourseasonsweb.fs.ui.recordadd.RecordAddFragment
import kotlinx.android.synthetic.main.record_add_activity.*
import org.jetbrains.anko.longToast
import java.util.*
import javax.inject.Inject

class RecordAddActivity : AppCompatActivity() {
    @Inject
    lateinit var api: AccountingApiService

    private fun injectDependency() {
        (application as BaseApplication).getApplicationComponent().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.record_add_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, RecordAddFragment.newInstance())
                .commitNow()
        }

        injectDependency()

        add_record.setOnClickListener {
            addRecord(createRecordModel())
        }
    }

    private fun createRecordModel() : RecordModel {
        val id : Int = 0
        val journalId : Int? = null
        val registration : Date? = null
        val userId : Int? = null
        return RecordModel(id, journalId, userId, registration)
    }

    private fun addRecord(recordModel: RecordModel) {
        val call = api.addRecord(recordModel)
        //call.enqueue(this)
        call.enqueue(object: BaseCallback<RecordModel>(this) {
            override fun onSuccess(response: RecordModel?) {
                longToast("Успешно")
                finish()
            }

            override fun onFail() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }
}

package com.fourseasonsweb.fs

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.fourseasonsweb.fs.Network.AccountingApiService
import kotlinx.android.synthetic.main.activity_journal_list.*
import javax.inject.Inject

class JournalListActivity : AppCompatActivity() {
    @Inject
    lateinit var api: AccountingApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_journal_list)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    private fun getJournalList() {
        /*
        val call = api.
        call.enqueue(object: BaseCallback<JournalModel>(this) {
            override fun onSuccess(response: JournalModel?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onFail() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })*/
    }
}

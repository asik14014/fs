package com.fourseasonsweb.fs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fourseasonsweb.fs.Data.Journal.JournalModel
import com.fourseasonsweb.fs.Network.AccountingApiService
import com.fourseasonsweb.fs.ui.journaladd.JournalAddFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class JournalAddActivity : AppCompatActivity(), Callback<JournalModel> {
    @Inject
    lateinit var api: AccountingApiService
    override fun onFailure(call: Call<JournalModel>, t: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onResponse(call: Call<JournalModel>, response: Response<JournalModel>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.journal_add_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, JournalAddFragment.newInstance())
                .commitNow()
        }
    }

    private fun addJournal(journalModel: JournalModel) {
        val call = api.addJournal(journalModel)
        call.enqueue(this)
    }

}

package com.fourseasonsweb.fs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fourseasonsweb.fs.Data.Journal.RecordModel
import com.fourseasonsweb.fs.Network.AccountingApiService
import com.fourseasonsweb.fs.ui.recordadd.RecordAddFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class RecordAddActivity : AppCompatActivity(), Callback<RecordModel> {
    @Inject
    lateinit var api: AccountingApiService
    override fun onFailure(call: Call<RecordModel>, t: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onResponse(call: Call<RecordModel>, response: Response<RecordModel>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.record_add_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, RecordAddFragment.newInstance())
                .commitNow()
        }
    }

    private fun addRecord(recordModel: RecordModel) {
        val call = api.addRecord(recordModel)
        call.enqueue(this)
    }
}

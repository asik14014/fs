package com.fourseasonsweb.fs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fourseasonsweb.fs.Data.Journal.FieldModel
import com.fourseasonsweb.fs.Network.AccountingApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class JournalAddFieldActivity : AppCompatActivity(), Callback<FieldModel> {
    @Inject
    lateinit var api: AccountingApiService
    override fun onFailure(call: Call<FieldModel>, t: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onResponse(call: Call<FieldModel>, response: Response<FieldModel>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_journal_add_field)
    }
}

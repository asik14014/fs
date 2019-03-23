package com.fourseasonsweb.fs.ui.journaladd

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fourseasonsweb.fs.Data.Journal.FieldModel
import com.fourseasonsweb.fs.Network.AccountingApiService
import com.fourseasonsweb.fs.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class JournalAddFragment : Fragment(), Callback<FieldModel> {
    companion object {
        fun newInstance() = JournalAddFragment()
    }

    @Inject
    lateinit var api: AccountingApiService
    private lateinit var viewModel: JournalAddViewModel

    override fun onResponse(call: Call<FieldModel>, response: Response<FieldModel>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFailure(call: Call<FieldModel>, t: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.journal_add_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(JournalAddViewModel::class.java)
        // TODO: Use the ViewModel
    }


    private fun addField(field : FieldModel)
    {
        val call = api.addField(field)
        call.enqueue(this)
    }
}

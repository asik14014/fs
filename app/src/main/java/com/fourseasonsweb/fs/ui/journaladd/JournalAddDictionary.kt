package com.fourseasonsweb.fs.ui.journaladd

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fourseasonsweb.fs.Data.Journal.DictionaryModel
import com.fourseasonsweb.fs.Network.AccountingApiService
import com.fourseasonsweb.fs.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class JournalAddDictionary : Fragment(), Callback<DictionaryModel> {
    @Inject
    lateinit var api: AccountingApiService
    override fun onFailure(call: Call<DictionaryModel>, t: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onResponse(call: Call<DictionaryModel>, response: Response<DictionaryModel>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        fun newInstance() = JournalAddDictionary()
    }

    private lateinit var viewModel: JournalAddDictionaryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.journal_add_dictionary_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(JournalAddDictionaryViewModel::class.java)
        // TODO: Use the ViewModel
    }

    private fun addDictionary(dictionaryModel: DictionaryModel) {
        val call = api.addDictionary(dictionaryModel)
        call.enqueue(this)
    }
}

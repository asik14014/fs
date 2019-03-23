package com.fourseasonsweb.fs.ui.journalupdate

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fourseasonsweb.fs.R

class JournalUpdateFragment : Fragment() {

    companion object {
        fun newInstance() = JournalUpdateFragment()
    }

    private lateinit var viewModel: JournalUpdateViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.journal_update_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(JournalUpdateViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

package com.fourseasonsweb.fs.ui.recordadd

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fourseasonsweb.fs.R

class RecordAddFragment : Fragment() {

    companion object {
        fun newInstance() = RecordAddFragment()
    }

    private lateinit var viewModel: RecordAddViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.record_add_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RecordAddViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

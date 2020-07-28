package com.erhan.aking.ui.quick

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.erhan.aking.R

class QuickFragment : Fragment() {

    companion object {
        fun newInstance() = QuickFragment()
    }

    private lateinit var viewModel: QuickViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.quick_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(QuickViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
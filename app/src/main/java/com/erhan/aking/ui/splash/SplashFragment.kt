package com.erhan.aking.ui.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.erhan.aking.R
import com.erhan.aking.databinding.SplashFragmentBinding

class SplashFragment : Fragment() {

    private lateinit var viewModel: SplashViewModel
    private lateinit var binding: SplashFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.splash_fragment, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
        observers()
        viewModel.animtionDelay()

    }

    private fun observers() {
        viewModel.isReadyAppLiveData.observe(viewLifecycleOwner, Observer { isAppReady ->
            if (isAppReady) {
                findNavController().navigate(R.id.action_splashFragment_to_onBoardingFragment)
            }
        })
    }
}

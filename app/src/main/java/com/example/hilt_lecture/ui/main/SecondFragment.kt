package com.example.hilt_lecture.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.hilt_lecture.R
import com.example.hilt_lecture.data.MyRepository
import com.example.hilt_lecture.di.qualifier.ActivityHash
import com.example.hilt_lecture.di.qualifier.AppHash
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_second.*
import javax.inject.Inject

@AndroidEntryPoint
class SecondFragment : Fragment(R.layout.fragment_second) {
    @Inject
    lateinit var repo : MyRepository

    @AppHash
    @Inject
    lateinit var apphash : String

    @ActivityHash
    @Inject
    lateinit var activityHash : String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_mainFragment)
        }

    }
}
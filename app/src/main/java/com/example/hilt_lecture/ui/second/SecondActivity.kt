package com.example.hilt_lecture.ui.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hilt_lecture.R
import com.example.hilt_lecture.data.MyRepository
import com.example.hilt_lecture.di.qualifier.ActivityHash
import com.example.hilt_lecture.di.qualifier.AppHash
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var repo : MyRepository

    @AppHash
    @Inject
    lateinit var apphash : String

    @ActivityHash
    @Inject
    lateinit var activityHash : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}
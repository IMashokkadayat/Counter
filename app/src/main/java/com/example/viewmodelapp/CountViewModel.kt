package com.example.viewmodelapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel(){
        private val _repos: CounterRepository = CounterRepository()

        private val _count = mutableStateOf(_repos.getCounter().count)
// check values

        val counttimes: MutableState<Int> = _count


        fun increaseTimes(){
            _repos.increamentCounter()
            _count.value = _repos.getCounter().count
        }

        fun decreaseTimes(){
            _repos.decreamentCounter()
            _count.value = _repos.getCounter().count

        }

}
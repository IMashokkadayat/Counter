package com.example.viewmodelapp

data class CounterModel(var count: Int)

class CounterRepository{
    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun increamentCounter(){
        _counter.count++
    }
    fun decreamentCounter(){
        _counter.count--

    }
}
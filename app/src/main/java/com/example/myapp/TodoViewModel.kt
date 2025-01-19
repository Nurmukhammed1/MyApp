package com.example.myapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import np.com.bimalkafle.todoapp.Todo

class TodoViewModel : ViewModel() {
    private val _todoList = MutableLiveData<List<Todo>>()
    val todoList: LiveData<List<Todo>> = _todoList

    fun getAllTodo() {
        _todoList.value = TodoManager.getAllTodo().reversed()
    }

    fun addTodo(title : String) {
        TodoManager.addTodo(title)
        getAllTodo()
    }

    fun deleteTodo(id : Int) {
        TodoManager.deleteTodo(id)
        getAllTodo()
    }

}
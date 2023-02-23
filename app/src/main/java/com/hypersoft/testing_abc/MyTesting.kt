package com.hypersoft.testing_abc

import android.content.Context
import android.widget.Toast

object MyTesting {
    fun showToast(context: Context,message:String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
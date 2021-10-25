package com.example.toastlib

import android.content.Context
import android.widget.Toast

class PandaToast {
    companion object {
        fun show(context: Context) {
            Toast.makeText(context, " hello ", Toast.LENGTH_LONG).show()
        }
    }
}
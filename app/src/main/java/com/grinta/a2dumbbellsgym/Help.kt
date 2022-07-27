package com.grinta.a2dumbbellsgym

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.DialogFragment

class Help:DialogFragment(R.layout.help) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val Back: Button = view.findViewById(R.id.BackB)

        Back.setOnClickListener {
            dismiss()
        }
    }
}
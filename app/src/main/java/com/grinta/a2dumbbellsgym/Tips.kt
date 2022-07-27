package com.grinta.a2dumbbellsgym

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.DialogFragment

class Tips:DialogFragment(R.layout.tips) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val backButton: Button = view.findViewById(R.id.BackButton)
        backButton.setOnClickListener {
            dismiss()
        }
    }
}
package com.grinta.a2dumbbellsgym

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.DialogFragment

class TermsOfUse:DialogFragment(R.layout.terms_of_use_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val submit: Button = view.findViewById(R.id.submitB)
        val cancel: Button = view.findViewById(R.id.cancelB)
        val choises: RadioGroup = view.findViewById(R.id.RGchoices)

        submit.setOnClickListener {
            val selected_option = choises.checkedRadioButtonId
            val selected_Rbutton: RadioButton = view.findViewById(selected_option)
            if(selected_Rbutton.text == "Yes"){
                Toast.makeText(context, "You can use this app", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(context, "This app may be dangerous to you", Toast.LENGTH_LONG).show()
            }
            dismiss()
        }

        cancel.setOnClickListener {
            dismiss()
        }

    }
}
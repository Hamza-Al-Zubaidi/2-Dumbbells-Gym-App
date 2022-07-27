package com.grinta.a2dumbbellsgym

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment

class LegFrag:Fragment(R.layout.fragment_leg) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val combSpinner2: Spinner = view.findViewById(R.id.combinations2)
        var combination2 = arrayOf("Combination 1", "Combination 2")
        val exercise6: TextView = view.findViewById(R.id.exercise6)
        val exercise7: TextView = view.findViewById(R.id.exercise7)
        val exercise8: TextView = view.findViewById(R.id.exercise8)
        val exercise9: TextView = view.findViewById(R.id.exercise9)
        val exercise10: TextView = view.findViewById(R.id.exercise10)
        var combFlag2: String = "choice"

        combSpinner2.adapter = getActivity()?.let {
            ArrayAdapter<String>(
                it.getBaseContext(), android.R.layout.simple_list_item_1,
                combination2
            )
        }

        combSpinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            @SuppressLint("SetTextI18n")
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                combFlag2 = combination2.get(p2)
                if(combFlag2 == "Combination 1"){
                    exercise6.text = "Bulgarian split squat --> 4 sets of 7-12 reps"
                    exercise7.text = "Goblet squat --> 3 sets of 8-12 reps"
                    exercise8.text = "Romanian deadlift --> 4 sets of 10-12 reps"
                    exercise9.text = "Lateral lunges --> 3 sets of 10-12 reps"
                    exercise10.text = "Calf Raise --> 3 sets of 20-30 reps"
                }

                else{
                    exercise6.text = "Reverse Lunge --> 4 sets of 7-12 reps"
                    exercise7.text = "Dumbbell Thrusters --> 3 sets of 8-12 reps"
                    exercise8.text = "Single-leg deadlift --> 4 sets of 10-12 reps"
                    exercise9.text = "Dumbbell Step-ups --> 3 sets of 10-12 reps"
                    exercise10.text = "Calf Raise --> 3 sets of 20-30 reps"
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}
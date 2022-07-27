package com.grinta.a2dumbbellsgym

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment

class ShouldersFrag:Fragment(R.layout.fragment_shoulders) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val combSpinner4: Spinner = view.findViewById(R.id.combinations4)
        var combination4 = arrayOf("Combination 1", "Combination 2")
        val exercise16: TextView = view.findViewById(R.id.exercise16)
        val exercise17: TextView = view.findViewById(R.id.exercise17)
        val exercise18: TextView = view.findViewById(R.id.exercise18)
        val exercise19: TextView = view.findViewById(R.id.exercise19)
        val exercise20: TextView = view.findViewById(R.id.exercise20)
        var combFlag4: String = "choice"

        combSpinner4.adapter = getActivity()?.let {
            ArrayAdapter<String>(
                it.getBaseContext(), android.R.layout.simple_list_item_1,
                combination4
            )
        }

        combSpinner4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            @SuppressLint("SetTextI18n")
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                combFlag4 = combination4.get(p2)
                if(combFlag4 == "Combination 1"){
                    exercise16.text = "Dumbbell shoulder press --> 4 sets of 9-12 reps"
                    exercise17.text = "Dumbbell side lateral raise --> 4 sets of 10-12 reps"
                    exercise18.text = "Leaning dumbbell lateral raise --> 3 sets of 10-12 reps"
                    exercise19.text = "Dumbbell bent-over raise --> 4 sets of 7-12 reps"
                    exercise20.text = "Dumbbell upright row --> 3 sets of 20-30 reps"
                }

                else{
                    exercise16.text = "Arnold press --> 4 sets of 9-12 reps"
                    exercise17.text = "Dumbbell side lateral raise --> 4 sets of 10-12 reps"
                    exercise18.text = "Leaning dumbbell lateral raise --> 3 sets of 10-12 reps"
                    exercise19.text = "Incline dumbbell reverse fly --> 4 sets of 7-12 reps"
                    exercise20.text = "Dumbbell shoulder shrugs --> 3 sets of 20-30 reps"
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}

package com.grinta.a2dumbbellsgym

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment

class ChestFrag:Fragment(R.layout.fragment_chest) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val combSpinner3: Spinner = view.findViewById(R.id.combinations3)
        var combination3 = arrayOf("Combination 1", "Combination 2")
        val exercise11: TextView = view.findViewById(R.id.exercise11)
        val exercise12: TextView = view.findViewById(R.id.exercise12)
        val exercise13: TextView = view.findViewById(R.id.exercise13)
        val exercise14: TextView = view.findViewById(R.id.exercise14)
        val exercise15: TextView = view.findViewById(R.id.exercise15)
        var combFlag3: String = "choice"

        combSpinner3.adapter = getActivity()?.let {
            ArrayAdapter<String>(
                it.getBaseContext(), android.R.layout.simple_list_item_1,
                combination3
            )
        }


        combSpinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            @SuppressLint("SetTextI18n")
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                combFlag3 = combination3.get(p2)
                if(combFlag3 == "Combination 1"){
                    exercise11.text = "Dumbbell bench press --> 4 sets of 9-12 reps"
                    exercise12.text = "Chest fly --> 3 sets of 7-12 reps"
                    exercise13.text = "Incline dumbbell bench press --> 4 sets of 9-12 reps"
                    exercise14.text = "Incline chest fly --> 3 sets of 7-12 reps"
                    exercise15.text = "Decline dumbbell Bench Press --> 4 sets of 9-12 reps"
                }

                else{
                    exercise11.text = "Dumbbell bench press --> 4 sets of 9-12 reps"
                    exercise12.text = "Pushup --> 4 sets of 15-30 reps"
                    exercise13.text = "Incline dumbbell bench press --> 4 sets of 9-12 reps"
                    exercise14.text = "Batwing Fly --> 3 sets of 10-12 reps"
                    exercise15.text = "Decline dumbbell Bench Press --> 4 sets of 9-12 reps"
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}
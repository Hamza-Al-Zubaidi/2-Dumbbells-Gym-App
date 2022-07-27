package com.grinta.a2dumbbellsgym

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment

class BackFrag:Fragment(R.layout.fragment_back) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val combSpinner: Spinner = view.findViewById(R.id.combinations)
        var combination = arrayOf("Combination 1", "Combination 2")
        val exercise1: TextView = view.findViewById(R.id.exercise1)
        val exercise2: TextView = view.findViewById(R.id.exercise2)
        val exercise3: TextView = view.findViewById(R.id.exercise3)
        val exercise4: TextView = view.findViewById(R.id.exercise4)
        val exercise5: TextView = view.findViewById(R.id.exercise5)
        var combFlag: String = "choice"

        combSpinner.adapter = getActivity()?.let {
            ArrayAdapter<String>(
                it.getBaseContext(), android.R.layout.simple_list_item_1,
                combination)
        }

        combSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            @SuppressLint("SetTextI18n")
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                combFlag = combination.get(p2)
                if(combFlag == "Combination 1"){
                    exercise1.text = "Bent over narrow row --> 4 sets of 7-12 reps"
                    exercise2.text = "Bent over wide row --> 4 sets of 7-12 reps"
                    exercise3.text = "Lat pull-overs --> 3 sets of 10-12 reps"
                    exercise4.text = "Kneeling single arm row --> 3 sets of 10-12 reps"
                    exercise5.text = "Shrugs --> 3 sets of 20-30 reps"
                }

                else{
                    exercise1.text = "Chest Supported Supinated Row --> 4 sets of 7-12 reps"
                    exercise2.text = "Reverse Fly --> 4 sets of 7-12 reps"
                    exercise3.text = "Lat pull-overs --> 3 sets of 10-12 reps"
                    exercise4.text = "Kneeling single arm row --> 3 sets of 10-12 reps"
                    exercise5.text = "Upright Row --> 3 sets of 20-30 reps"
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}
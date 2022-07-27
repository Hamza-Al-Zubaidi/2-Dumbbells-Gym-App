package com.grinta.a2dumbbellsgym

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment

class TricepsFrag:Fragment(R.layout.fragment_triceps) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val combSpinner6: Spinner = view.findViewById(R.id.combinations6)
        var combination6 = arrayOf("Combination 1", "Combination 2")
        val exercise26: TextView = view.findViewById(R.id.exercise26)
        val exercise27: TextView = view.findViewById(R.id.exercise27)
        val exercise28: TextView = view.findViewById(R.id.exercise28)
        val exercise29: TextView = view.findViewById(R.id.exercise29)
        val exercise30: TextView = view.findViewById(R.id.exercise30)
        var combFlag6: String = "choice"

        combSpinner6.adapter = getActivity()?.let {
            ArrayAdapter<String>(
                it.getBaseContext(), android.R.layout.simple_list_item_1,
                combination6
            )
        }

        combSpinner6.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            @SuppressLint("SetTextI18n")
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                combFlag6 = combination6.get(p2)
                if(combFlag6 == "Combination 1"){
                    exercise26.text = "Single arm tricep kickback --> 4 sets of 10-15 reps"
                    exercise27.text = "Seated overhead --> 4 sets of 10-15 reps"
                    exercise28.text = "Skull Crushers --> 3 sets of 10-12 reps"
                    exercise29.text = "Gravity Press --> 3 sets of 10-12 reps"
                    exercise30.text = "Dumbbell tricep dip --> 3 sets of 15-20 reps"
                }

                else{
                    exercise26.text = "Close grip Dumbbell press --> 4 sets of 10-15 reps"
                    exercise27.text = "Seated overhead --> 4 sets of 10-15 reps"
                    exercise28.text = "Tate press --> 3 sets of 10-12 reps"
                    exercise29.text = "Close grip dumbbell push up --> 3 sets of 15-20 reps"
                    exercise30.text = "Dumbbell tricep dip --> 3 sets of 15-20 reps"
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}
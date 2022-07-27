package com.grinta.a2dumbbellsgym

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment

class BicepsFrag:Fragment(R.layout.fragment_biceps) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val combSpinner5: Spinner = view.findViewById(R.id.combinations5)
        var combination5 = arrayOf("Combination 1", "Combination 2")
        val exercise21: TextView = view.findViewById(R.id.exercise21)
        val exercise22: TextView = view.findViewById(R.id.exercise22)
        val exercise23: TextView = view.findViewById(R.id.exercise23)
        val exercise24: TextView = view.findViewById(R.id.exercise24)
        val exercise25: TextView = view.findViewById(R.id.exercise25)
        var combFlag5: String = "choice"

        combSpinner5.adapter = getActivity()?.let {
            ArrayAdapter<String>(
                it.getBaseContext(), android.R.layout.simple_list_item_1,
                combination5
            )
        }

        combSpinner5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            @SuppressLint("SetTextI18n")
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                combFlag5 = combination5.get(p2)
                if(combFlag5 == "Combination 1"){
                    exercise21.text = "Dumbbell Supinated biceps curl --> 4 sets of 10-15 reps"
                    exercise22.text = "Dumbbell hammer curl --> 4 sets of 10-15 reps"
                    exercise23.text = "Concentration biceps curl --> 3 sets of 10-12 reps"
                    exercise24.text = "Dumbbell pinwheel biceps curl --> 3 sets of 10-12 reps"
                    exercise25.text = "Dumbbell reverse biceps curl --> 3 sets of 10-15 reps"
                }

                else{
                    exercise21.text = "Offset biceps curl --> 4 sets of 10-15 reps"
                    exercise22.text = "Zottman biceps curl --> 4 sets of 10-15 reps"
                    exercise23.text = "Dumbbell incline biceps curl --> 3 sets of 10-12 reps"
                    exercise24.text = "Dumbbell pinwheel biceps curl --> 3 sets of 10-12 reps"
                    exercise25.text = "Dumbbell reverse biceps curl --> 3 sets of 10-15 reps"
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}
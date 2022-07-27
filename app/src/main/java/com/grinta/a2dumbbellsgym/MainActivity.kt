package com.grinta.a2dumbbellsgym

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Color.WHITE
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setBackgroundDrawable(
            ColorDrawable(Color.parseColor("#FF8C00"))) //Change the colo of action bar

        val Frag1 = BackFrag()
        val Frag2 = LegFrag()
        val Frag3 = ChestFrag()
        val Frag4 = ShouldersFrag()
        val Frag5 = BicepsFrag()
        val Frag6 = TricepsFrag()
        val choose_muscle: Spinner = findViewById(R.id.Choose_Muscle)
        var muscles = arrayOf("Back", "Legs", "Chest", "Shoulders", "Biceps", "Triceps")
        var flag: String = "Muscle"

        choose_muscle.adapter = ArrayAdapter<String>(
            this, android.R.layout.simple_list_item_1,
            muscles
        )

        choose_muscle.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = muscles.get(p2)

                when (flag){
                    "Back" -> setFragment(Frag1)
                    "Legs" -> setFragment(Frag2)
                    "Chest" -> setFragment(Frag3)
                    "Shoulders" -> setFragment(Frag4)
                    "Biceps" -> setFragment(Frag5)
                    "Triceps" -> setFragment(Frag6)
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val mainscreen: ConstraintLayout = findViewById(R.id.mainscreen)
        val tipsscreen = Tips()
        val helpscreen = Help()
        val Dfrag = TermsOfUse()

        when(item.itemId){
            R.id.item1 -> tipsscreen.show(supportFragmentManager, "Tips Dialog")
            R.id.item2 -> helpscreen.show(supportFragmentManager, "Help Dialog")
            R.id.item3 -> Dfrag.show(supportFragmentManager, "TOUse Dialog")
            R.id.item4 -> {
                mainscreen.setBackgroundColor(WHITE)
                Toast.makeText(this,"White Mode",Toast.LENGTH_SHORT).show()
            }
            R.id.item5 -> {
                mainscreen.setBackgroundColor(Color.DKGRAY)
                Toast.makeText(this,"Dark Mode",Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    public fun setFragment(frag: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.Flayout, frag)
            commit()
        }
    }

}

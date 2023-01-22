package com.example.fragment3_17_01_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fragment3_17_01_23.fragments.DosFragment
import com.example.fragment3_17_01_23.fragments.InterfazMenuClick
import com.example.fragment3_17_01_23.fragments.TresFragment
import com.example.fragment3_17_01_23.fragments.UnoFragment

class MainActivity : AppCompatActivity(), InterfazMenuClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun menuClick(nbtn: Int) {
        val fragment = when (nbtn) {
            0 -> UnoFragment()
            1 -> DosFragment()
            2 -> TresFragment()
            else -> UnoFragment()
        }
        supportFragmentManager.beginTransaction().replace(R.id.fcvFragment, fragment).commit()

    }

    override fun localizacionClick(msg: String) {
        Toast.makeText(this, "Estas en el $msg", Toast.LENGTH_SHORT).show()
    }
}
package com.example.fragment3_17_01_23.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment3_17_01_23.R

class DosFragment : Fragment() {

    var listener: InterfazMenuClick? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.btnF2).setOnClickListener {
            listener?.localizacionClick("Fragmento 2")
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is InterfazMenuClick) listener = context
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

}
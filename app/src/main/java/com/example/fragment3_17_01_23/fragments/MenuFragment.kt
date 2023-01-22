package com.example.fragment3_17_01_23.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment3_17_01_23.R


class MenuFragment : Fragment() {

    var listener: InterfazMenuClick? = null
    private var botones = arrayOf<Int>(R.id.btnMenu1, R.id.btnMenu2, R.id.btnMenu3)

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
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        for (i in botones.indices) {
            view.findViewById<View>(botones[i]).setOnClickListener {
                listener?.menuClick(i)
            }
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
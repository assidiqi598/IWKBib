package com.example.iwkbib.ui.manual

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.iwkbib.R

class ManualFragment : Fragment() {

    private lateinit var manualViewModel: ManualViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        manualViewModel =
                ViewModelProvider(this).get(ManualViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_manual, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        manualViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
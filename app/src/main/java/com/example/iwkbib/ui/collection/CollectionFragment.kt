package com.example.iwkbib.ui.collection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.iwkbib.R

class CollectionFragment : Fragment() {

    private lateinit var collectionViewModel: CollectionViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        collectionViewModel =
                ViewModelProviders.of(this).get(CollectionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_collection, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        collectionViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
package com.example.vladivostok.ui.vl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vladivostok.Adapter.VladivostokAdapter
import com.example.vladivostok.databinding.FragmentVlBinding

class VlFragment : Fragment() {

    private lateinit var VlViewModel_: VlViewModel
    private var _binding: FragmentVlBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        VlViewModel_ =
            ViewModelProvider(this).get(VlViewModel::class.java)

        _binding = FragmentVlBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView : RecyclerView = binding.listVL
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = VladivostokAdapter(VlViewModel_.getList())

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
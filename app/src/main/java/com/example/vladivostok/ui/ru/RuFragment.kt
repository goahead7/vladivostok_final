package com.example.vladivostok.ui.ru

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vladivostok.Adapter.RusskiyAdapter
import com.example.vladivostok.databinding.FragmentRuBinding

class RuFragment : Fragment() {

    private lateinit var RuViewModel_: RuViewModel
    private var _binding: FragmentRuBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        RuViewModel_ =
            ViewModelProvider(this).get(RuViewModel::class.java)

        _binding = FragmentRuBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView : RecyclerView = binding.listRU
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = RusskiyAdapter(RuViewModel_.getList())
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
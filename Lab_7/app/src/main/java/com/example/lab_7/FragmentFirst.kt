package com.example.lab_7

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lab_7.FragmentFirstDirections
import com.example.lab_7.databinding.Fragment1Binding


class FragmentFirst : Fragment() {
    private lateinit var binding: Fragment1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment1Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var resultName: String? = null
        var resultSurname: String? = null

        childFragmentManager.setFragmentResultListener("main_data", viewLifecycleOwner) { _, bundle ->
            resultName = bundle.getString("name")
            resultSurname = bundle.getString("surname")
        }

        binding.buttonToFragment2.setOnClickListener {
            resultName?.let { name ->
                resultSurname?.let { surname ->
                    val action = FragmentFirstDirections.actionFragment1ToFragment2(name, surname)
                    findNavController().navigate(action)
                }
            }
        }
    }
}


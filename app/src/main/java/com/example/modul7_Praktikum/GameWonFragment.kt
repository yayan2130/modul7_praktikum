package com.example.modul7_tugas

import com.example.modul7_tugas.databinding.FragmentGameWonBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class GameWonFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentGameWonBinding = DataBindingUtil.inflate(inflater, R.layout.jawaban_benar, container, false)
        binding.nextMatchButton.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_gameWonFragment_to_titleFragment)
        }
        return binding.root
    }
}
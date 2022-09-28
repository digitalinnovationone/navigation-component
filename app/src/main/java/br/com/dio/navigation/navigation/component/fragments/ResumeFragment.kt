package br.com.dio.navigation.navigation.component.fragments

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import br.com.dio.navigation.navigation.component.databinding.FragmentAddressBinding
import br.com.dio.navigation.navigation.component.databinding.FragmentResumeBinding
import br.com.dio.navigation.navigation.component.extensions.text
import br.com.dio.navigation.navigation.component.model.PersonModel

class ResumeFragment: Fragment() {

    private var _binding: FragmentResumeBinding? = null
    private val binding get() = _binding!!

    private val args by navArgs<ResumeFragmentArgs>()

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, saved: Bundle?): View {
        _binding = FragmentResumeBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(ContentValues.TAG, "onViewCreated: ${args.model}")

        binding.tvPerson.text = args.model.person
        binding.tvAddress.text = args.model.address
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
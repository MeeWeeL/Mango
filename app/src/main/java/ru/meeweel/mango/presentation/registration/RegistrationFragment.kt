package ru.meeweel.mango.presentation.registration

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.meeweel.mango.R
import ru.meeweel.mango.databinding.FragmentRegistrationBinding

class RegistrationFragment : Fragment(R.layout.fragment_registration) {
    private var _binding: FragmentRegistrationBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentRegistrationBinding.bind(view)
        setClickListeners()
    }

    private fun setClickListeners() {
        binding.btnRegistration.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_registration_to_navigation_chat)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
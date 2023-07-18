package ru.meeweel.mango.presentation.authorization

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.meeweel.mango.R
import ru.meeweel.mango.databinding.FragmentAuthorizationBinding

class AuthorizationFragment : Fragment(R.layout.fragment_authorization) {
    private var _binding: FragmentAuthorizationBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAuthorizationBinding.bind(view)
        setClickListeners()
    }

    private fun setClickListeners() {
        binding.btnAuthorization.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_authorization_to_navigation_chat)
        }
        binding.btnRegistration.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_authorization_to_navigation_registration)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
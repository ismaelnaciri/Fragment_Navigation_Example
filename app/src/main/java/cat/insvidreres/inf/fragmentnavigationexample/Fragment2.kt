package cat.insvidreres.inf.fragmentnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import cat.insvidreres.inf.fragmentnavigationexample.databinding.Fragment2Binding


class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = Fragment2Binding.inflate(inflater)

        binding.fragment2Button?.setOnClickListener{
            findNavController().navigate(R.id.action_fragment2_to_fragment3, null)
        }

        binding.fragment2GoalButton?.setOnClickListener{
            findNavController().navigate(R.id.action_fragment2_to_goalFragment, null)
        }

        return binding.root
    }


}
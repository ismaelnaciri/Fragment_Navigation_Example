package cat.insvidreres.inf.fragmentnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import cat.insvidreres.inf.fragmentnavigationexample.databinding.Fragment3Binding


class Fragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = Fragment3Binding.inflate(inflater)

        binding.fragment3GoalButton?.setOnClickListener {
            findNavController().navigate(R.id.goalFragment, null)
        }

        return binding.root
    }

}
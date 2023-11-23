package cat.insvidreres.inf.fragmentnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cat.insvidreres.inf.fragmentnavigationexample.databinding.FragmentGoalBinding


class GoalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentGoalBinding.inflate(inflater)

        return binding.root
    }


}
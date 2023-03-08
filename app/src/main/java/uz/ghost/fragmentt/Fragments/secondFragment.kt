package uz.ghost.fragmentt.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.ghost.fragmentt.R
import uz.ghost.fragmentt.databinding.FragmentFirstBinding
import uz.ghost.fragmentt.databinding.FragmentSecondBinding
import kotlin.properties.Delegates

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
class secondFragment : Fragment() {
    private val binding by lazy{FragmentSecondBinding.inflate(layoutInflater)}
    private var name:String? = null
    private var age :Int? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        name = arguments?.getString("keyName")
        age = arguments?.getInt("keyAge")

        binding.tvAge.text = age.toString()
        binding.tvName.text = name
        return binding.root
    }

}
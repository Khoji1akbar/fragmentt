package uz.ghost.fragmentt.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.ghost.fragmentt.R
import uz.ghost.fragmentt.databinding.FragmentFirstBinding


class firstFragment : Fragment() {
    private val binding by lazy{FragmentFirstBinding.inflate(layoutInflater)}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.btnNext.setOnClickListener {
            val secondfragment = secondFragment()
            val bundle =Bundle()
            bundle.putString("keyName",binding.edtName.text.toString().trim())
            bundle.putInt("keyAge",binding.edtAge.text.toString().toInt())
            secondfragment.arguments = bundle
            parentFragmentManager.beginTransaction()
                .addToBackStack(secondfragment.toString())
                .replace(R.id.my_constair,secondfragment)
                .commit()
        }
       return binding.root
    }
}
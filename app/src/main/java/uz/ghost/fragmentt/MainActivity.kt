package uz.ghost.fragmentt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.ghost.fragmentt.Fragments.firstFragment
import uz.ghost.fragmentt.databinding.FragmentFirstBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.my_constair,firstFragment())
            .commit()
    }
}
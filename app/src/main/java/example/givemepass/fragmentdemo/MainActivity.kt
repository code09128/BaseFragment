package example.givemepass.fragmentdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import example.givemepass.fragmentdemo.BaseGlobalFunction.addFragment
import example.givemepass.fragmentdemo.BaseGlobalFunction.replaceFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val firstFragment = DetailsFragment()
    private val secondFragment = TEstFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        addFragment(firstFragment)
//        addFragment(secondFragment)

        first_fragment.setOnClickListener {
//            replaceFragment(firstFragment)
            addFragment(this,R.id.fragment_container,firstFragment)
        }

        second_fragment.setOnClickListener {
            replaceFragment(this,R.id.fragment_container,secondFragment)
        }
    }

//    private fun addFragment(f: Fragment) {
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.add(R.id.fragment_container, f)
//        transaction.commit()
//    }
//
//    private fun replaceFragment(f : Fragment){
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.fragment_container, f)
//        transaction.commit()
//    }
}

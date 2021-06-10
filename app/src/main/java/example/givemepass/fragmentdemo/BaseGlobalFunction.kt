package example.givemepass.fragmentdemo



import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction

object BaseGlobalFunction {
    fun replaceFragment(activity:FragmentActivity,layout: Int, fragment: Fragment?): Fragment? {
        val transaction: FragmentTransaction = activity.supportFragmentManager.beginTransaction()
        transaction.replace(layout, fragment!!)
        transaction.commit()
        return fragment
    }

    fun addFragment(activity:FragmentActivity,layout: Int,fragment: Fragment): Fragment? {
        val transaction: FragmentTransaction = activity.supportFragmentManager.beginTransaction()
        transaction.add(layout, fragment)
        transaction.commit()
        return fragment
    }

    fun removeFragent(activity:FragmentActivity,layout: Int,fragment: Fragment):Fragment?{
        val transaction: FragmentTransaction = activity.supportFragmentManager.beginTransaction()
        transaction.remove(fragment)
        transaction.commit()
        return fragment
    }
}
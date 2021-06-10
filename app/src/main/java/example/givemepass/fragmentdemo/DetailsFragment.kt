package example.givemepass.fragmentdemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_details.*
import kotlinx.android.synthetic.main.fragment_details.view.*


class DetailsFragment : BaseFragment() {
    override fun getContentViewLayoutID(): Int {
        return R.layout.fragment_details
    }

    override fun init() {
        text_view.text = "Fragment 1"
    }

//    @SuppressLint("SetTextI18n")
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        val view = LayoutInflater.from(context).inflate(R.layout.fragment_details, container, false)
//        view.text_view.text = "Fragment 1"
//        return view
//    }

}

package bwf.idat.topitop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import bwf.idat.topitop.R
import bwf.idat.topitop.databinding.ActivityMenuPrincipalBinding
import bwf.idat.topitop.databinding.FragmentFavoritoBinding


class FavoritoFragment : Fragment() {
    private lateinit var binding: FragmentFavoritoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFavoritoBinding.inflate(inflater,container,false)
        return binding.root
}
}
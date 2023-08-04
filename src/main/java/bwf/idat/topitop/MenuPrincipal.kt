package bwf.idat.topitop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import bwf.idat.topitop.databinding.ActivityMenuPrincipalBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuPrincipal : AppCompatActivity() {
     private lateinit var binding: ActivityMenuPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navView = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_principal)as NavHostFragment
        val navController =navView.navController
        binding.navView.setupWithNavController(navController)





    }
}
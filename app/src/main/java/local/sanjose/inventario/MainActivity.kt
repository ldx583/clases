package local.sanjose.inventario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import local.sanjose.inventario.Activities.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//PASO 1 CREAR BOTONES
        val btnLifeCycle = findViewById<Button>(R.id.button_to_cycle)
        val btnClickEvents = findViewById<Button>(R.id.button_to_click)
        val btnAndroidExt = findViewById<Button>(R.id.button_to_android_extensions)
        val btnPiccaso = findViewById<Button>(R.id.button_to_picasso)
        val btnListView = findViewById<Button>(R.id.button_to_list_view)
        val btnIntents = findViewById<Button>(R.id.button_to_intents)
        val btnPermission = findViewById<Button>(R.id.button_to_permissions)
        val btnSharedPreferences = findViewById<Button>(R.id.button_to_shared_preferance)
        val btnExtentionFunctions = findViewById<Button>(R.id.button_to_extension_functions)

        btnLifeCycle.setOnClickListener{goToLifeCycleActivity()}
        btnClickEvents.setOnClickListener { goToClickEventsActiviy() }
        btnAndroidExt.setOnClickListener { goToKotlinAndroidExtActivity() }
        btnPiccaso.setOnClickListener { goToPicassoActivity() }
        btnListView.setOnClickListener { goToListViewActivity() }
        btnIntents.setOnClickListener { goToIntetsActivity() }
        btnPermission.setOnClickListener { goToPermissionsActivity() }
        btnSharedPreferences.setOnClickListener { goToSharedPreferencesActivity() }
        btnExtentionFunctions.setOnClickListener { goToExtensionFunctionsActivity() }


    }

    fun showToast(){
        Toast.makeText(this,"Hola mundo!", Toast.LENGTH_LONG).show()
    }

    fun showSnackBar(){
        val layout = findViewById<ConstraintLayout>(R.id.constraint)
        Snackbar.make(layout,"Hola desde Snackbar", Snackbar.LENGTH_LONG).show()
        Snackbar.make(layout,"Seleciona algo",Snackbar.LENGTH_LONG).setAction("UNDO"){
        Snackbar.make(layout, "Email has been restored", Snackbar.LENGTH_LONG).show()
        }.show()
    }
//PASO 2 DEFINIR METODOS
    private fun goToLifeCycleActivity(){
        val intent = Intent(this, LifeCycleActivity::class.java)
        startActivity(intent)
    }

    private fun goToClickEventsActiviy() = startActivity(Intent(this,ClickEventsActivity::class.java))
    private fun goToKotlinAndroidExtActivity() = startActivity(Intent(this,KotlinAndroidExtentionsActivity::class.java))
    private fun goToPicassoActivity() = startActivity(Intent(this,PiccasoActivity::class.java))
    private fun goToListViewActivity() = startActivity(Intent(this,ListViewActivity::class.java))
    private fun goToIntetsActivity() = startActivity(Intent(this,IntentsActivity::class.java))
    private fun goToPermissionsActivity() = startActivity(Intent(this,PermissionsActivity::class.java))
    private fun goToSharedPreferencesActivity() = startActivity(Intent(this,SharedPreferencesActivity::class.java))
    private fun goToExtensionFunctionsActivity() = startActivity(Intent(this,ExtentionFunctionsActivity::class.java))

}

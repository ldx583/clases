package local.sanjose.inventario.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_intent_extras.*
import local.sanjose.inventario.R

class intentExtrasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_extras)

        getIntentExtrasFromPreviousActivity()
    }


    private fun getIntentExtrasFromPreviousActivity(){

        val name = intent.getStringExtra("name")
        val lastName = intent.getStringExtra("lastName")
        val age = intent.getIntExtra("age", -1)
        val developer = intent.getBooleanExtra("developer",false)

        if(name != null && lastName != null && age >= 0){
            textViewName.text = name
            textViewLastName.text = lastName
            textViewAge.text = "${age}"
            checkBoxDeveloper.isChecked = developer
        }

    }
}

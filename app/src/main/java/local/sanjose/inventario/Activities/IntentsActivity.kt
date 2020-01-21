package local.sanjose.inventario.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intents.*
import local.sanjose.inventario.R

class IntentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)

        buttonIntentExtras.setOnClickListener { goIntentExtras() }
        buttonIntentFlags.setOnClickListener { goIntentFlags() }
        buttonIntentObject.setOnClickListener { goIntentObject() }

    }

    private fun goIntentExtras(){
        val intent = Intent(this,intentExtrasActivity::class.java)
        intent.putExtra("name", "Diego")
        intent.putExtra("lastName", "Campusmana")
        intent.putExtra("age", 24)
        intent.putExtra("developer", true)
        startActivity(intent)
    }

    private fun goIntentFlags(){
        val intent = Intent(this,intentExtrasActivity::class.java)
        startActivity(intent)
    }

    private fun goIntentObject(){
        val intent = Intent(this,intentExtrasActivity::class.java)
        startActivity(intent)
    }

}

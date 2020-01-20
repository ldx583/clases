package local.sanjose.inventario.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import local.sanjose.inventario.R

class KotlinAndroidExtentionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_android_extentions)

        val btn = findViewById<Button>(R.id.buttonByID)
        btn.setOnClickListener { Toast.makeText(this,"Click by ID", Toast.LENGTH_LONG).show() }
    }
}

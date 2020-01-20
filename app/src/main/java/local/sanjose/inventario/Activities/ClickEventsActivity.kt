package local.sanjose.inventario.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import local.sanjose.inventario.R

class ClickEventsActivity : AppCompatActivity(), View.OnLongClickListener {

    // 1) Click en XML
    // 2) Click en linea
    // 3) Click by IDS en 'when'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_events)

        clickInLine()

        val btn1 = findViewById<Button>(R.id.btnClickMulti1)
        val btn2 = findViewById<Button>(R.id.btnClickMulti2)
        val btn3 = findViewById<Button>(R.id.btnClickMulti3)

        btn1.setOnLongClickListener(this)
        btn2.setOnLongClickListener(this)
        btn3.setOnLongClickListener(this)

    }

    //Regla obligatoria para clicks en XMLS:
    //El metodo tiene que ser publico
    //Los nombres tiene que coincidir y recibe 1 solo parametro (view)
    fun xmlClick(view: View){
        Toast.makeText(this,"Click by XML!", Toast.LENGTH_LONG).show()
    }

    private fun clickInLine(){
        val btn = findViewById<Button>(R.id.btnClickInLine)
        btn.setOnClickListener { Toast.makeText(this, "Click in Line!", Toast.LENGTH_LONG).show() }
    }

    override fun onLongClick(v: View): Boolean {
        when(v.id){
           R.id.btnClickMulti1 -> Toast.makeText(this,"Click Multi 1!", Toast.LENGTH_LONG).show()
           R.id.btnClickMulti2 -> Toast.makeText(this,"Click Multi 2!", Toast.LENGTH_LONG).show()
           R.id.btnClickMulti3 -> Toast.makeText(this,"Click Multi 3!", Toast.LENGTH_LONG).show()
        }

        return true
    }
}

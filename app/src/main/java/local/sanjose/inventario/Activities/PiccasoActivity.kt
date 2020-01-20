package local.sanjose.inventario.Activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import local.sanjose.inventario.R
import kotlinx.android.synthetic.main.activity_piccaso.*

class PiccasoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piccaso)


        buttonLoader.setOnClickListener { loadImages() }

        Picasso.with(this).load("https://images.pexels.com/photos/3467150/pexels-photo-3467150.jpeg").fetch() //Pre Cacheo de las imagenes
    }

        private fun loadImages(){
            /*Picasso
                .with(this)
                .load("https://images.pexels.com/photos/3330175/pexels-photo-3330175.jpeg")
                .fit()
                .transform(CircleTransform())
                .into(imageViewTop)*/

            Picasso
                .with(this)
                .load("https://images.pexels.com/photos/3467150/pexels-photo-3467150.jpeg")
                .resize(300,300)
                //.centerInside()
                .centerCrop()
                .into(imageViewBottom1)
            Picasso
                .with(this)
                .load("https://images.pexels.com/photos/3493772/pexels-photo-3493772.jpeg")
                .fit() //Usar tsodo el espacio
                .into(imageViewBottom2)

            val context: Context = this
            Picasso
                .with(this)
                .load("https://images.pexels.com/photos/3283090/pexels-photo-3283090.jpeg")
                .fetch(object: Callback{
                    override fun onSuccess() {
                        imageViewTop.alpha = 0f
                        Picasso.with(context)
                            .load("https://images.pexels.com/photos/3283090/pexels-photo-3283090.jpeg")
                            .fit()
                            .transform(CircleTransform())
                            .into(imageViewTop)
                        imageViewTop.animate().setDuration(1300).alpha(1f).start()
                    }

                    override fun onError() {
                    }

                })

        }

}

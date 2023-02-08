package edu.iest.botones

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView

class SecondActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")

    private var cambioIcon : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var edad= intent.getIntExtra("edad",0)
        var fraseRecibida= intent.getStringExtra("frase")

        Log.d("Datos","Datos recibidos con exito fueron frase $fraseRecibida y edad $edad")

        var bnAbrirPantalla= findViewById<Button>(R.id.bnPantalla)
        var ivLogo= findViewById<ImageView>(R.id.ivLogo)
        ivLogo.setOnClickListener{
            var arregloImagenes = arrayOf<Int>(R.drawable.anahuac, R.drawable.iestlogo)
            if (cambioIcon){
                ivLogo.setImageResource(arregloImagenes[0])
            }else{
                ivLogo.setImageResource(arregloImagenes[1])
            }
            cambioIcon= !cambioIcon
        }


        bnAbrirPantalla.setOnClickListener{
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
        var bnCerrar= findViewById<Button>(R.id.buttonCerrar)
        /*bnCerrar.setOnClickListener{
            finish()
        }*/
        bnCerrar.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}
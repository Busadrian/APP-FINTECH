package desarollo.app.app_fintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PaginaPrincipal : AppCompatActivity() {

    // Variables de los botones
    private lateinit var buttonConfiguracion : Button
    private lateinit var buttonCuenta : Button
    private lateinit var buttonOperaciones : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_principal)

        // Inicialización de los botones
        buttonConfiguracion = findViewById(R.id.buttonConfiguracion)
        buttonCuenta = findViewById(R.id.buttonCuenta)
        buttonOperaciones = findViewById(R.id.buttonOperaciones)

        // Creacion de los intent para cada boton
        buttonConfiguracion.setOnClickListener {

            var intent = Intent( this, Configuracion::class.java).apply{
                startActivity(intent)
            }

        }

        buttonCuenta.setOnClickListener {

            var intent = Intent( this, Cuenta::class.java).apply{
                startActivity(intent)
            }
        }

        buttonOperaciones.setOnClickListener {

            var intent = Intent( this, Operaciones::class.java).apply{
                startActivity(intent)
            }

        }


    }
}
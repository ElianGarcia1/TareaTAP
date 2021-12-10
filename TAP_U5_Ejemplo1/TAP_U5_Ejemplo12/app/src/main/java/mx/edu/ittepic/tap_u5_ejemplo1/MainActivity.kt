package mx.edu.ittepic.tap_u5_ejemplo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var numero = 9
    var sueldo = 1200.99
    var altura = 1.8f
    var direccionCasa = "Allende 200"
    var resultado = true

    var nombreCompleto : String = ""
    var edad : Int = 0
    var nombreCampoTexo : EditText ? = null
    var boton : Button ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombreCampoTexo = findViewById(R.id.editTextTextPersonName)
        boton = findViewById(R.id.buttonSaludador)

        //Programanado el boton saludador
        buttonSaludador.setOnClickListener {
            var nombre = editTextTextPersonName.text.toString()
            if(nombre.isEmpty() == true){
                AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Debes agregar algo en el campo de texto, por algo esta")
                    .setPositiveButton("OK", {d,i -> d.dismiss()})
                    .show()
            }else {
                var alerta = AlertDialog.Builder(this)
                alerta.setMessage("Hola, ${nombre} como estas?")

                alerta.setPositiveButton("Aceptar", { d, i ->
                    d.dismiss()//positivo
                })
                alerta.setNegativeButton("Cerrar", { d, i ->
                    d.dismiss()//Negativo
                })
                alerta.show()
            }//Else
        }
        radioButton2.setOnClickListener {
            Toast.makeText(this, "Usted es casado", Toast.LENGTH_LONG).show()
        }
        radioButton3.setOnClickListener {
            Toast.makeText(this, "Usted es soltero", Toast.LENGTH_LONG).show()
        }
    }
}
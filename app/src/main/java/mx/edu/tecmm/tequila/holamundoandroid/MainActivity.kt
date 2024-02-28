package mx.edu.tecmm.tequila.holamundoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import mx.edu.tecmm.tequila.holamundoandroid.R.id.txtConteo

class MainActivity : AppCompatActivity() {

    var cont: Int = 0
    var aumentando: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtConteo = findViewById<TextView>(txtConteo)
        val btnContador = findViewById<Button>(R.id.btnCuenta)
        val btnResetar = findViewById<Button>(R.id.btnReseteo)
        cont = 0

        btnContador.setOnClickListener {
            if (aumentando) {
                cont++
                if (cont == 10) {
                    aumentando = false
                    btnContador.text = "Disminuye"
                }
            } else {
                cont--
                if (cont == 0) {
                    aumentando = true
                    btnContador.text = "Aumenta"
                }
            }
            txtConteo.text = "$cont"
        }

        btnResetar.setOnClickListener {
            cont = 0
            txtConteo.text = "$cont"
            aumentando = true
            btnContador.text = "Aumenta"
        }
    }
}

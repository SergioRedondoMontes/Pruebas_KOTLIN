package actividad1kot.actividad1kot

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_book.*

class BookActivity : AppCompatActivity() {

    //var morality = (activity.resources.getStringArray(R.string.morality).toMutableList())
    private var titulos = this.resources.getStringArray(R.array.titulos);
    private var cuerpos = arrayOf(R.array.cuerpos)
    var auxArrLength = titulos.size
    var contador = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        btnSiguiente.setText(R.string.btnSiguiente)
        btnAnterior.setText(R.string.btnAnterior)
        btnPerfil.setText(R.string.btnPerfil)
        etTitulo.setText(titulos[0].toString())
        //etCuerpo.setText(cuerpos[0].toString())

        btnPerfil.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            this.startActivity(intent)
            this.finish()
        }

        btnAnterior.setOnClickListener {
            contador--
            //pasarpagina()
        }

        btnSiguiente.setOnClickListener {
            contador++
            //pasarpagina()
        }


    }

    private fun pasarpagina() {

        if (contador >= 0 && contador < auxArrLength) {
            etCuerpo.setText(cuerpos[contador])
            etTitulo.setText(titulos[contador])
        } else if (contador == -1) {
            contador = auxArrLength - 1
            etCuerpo.setText(cuerpos[contador])
            etTitulo.setText(titulos[contador])
        } else if (contador == auxArrLength) {
            contador = 0
            etCuerpo.setText(cuerpos[contador])
            etTitulo.setText(titulos[contador])

        }

    }
}

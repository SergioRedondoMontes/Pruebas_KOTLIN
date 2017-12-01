package actividad1kot.actividad1kot

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Text Buttons
        btnEditar.setText(R.string.btnEditar)
        btnBook.setText(R.string.btnBook)
        btnGuardar.setText(R.string.btnGuardar)

        //setText
        etNombre.setText(DataHolder.nombre)
        etEmail.setText(DataHolder.email)
        etTelefono.setText(DataHolder.telefono)
        etDireccion.setText(DataHolder.direccion)

        //setDate
        if (!DataHolder.aux) {
            datePicker.updateDate(DataHolder.yy,DataHolder.mm,DataHolder.dd)
        }


        btnEditar.setOnClickListener {
            etNombre.isEnabled = true
            etEmail.isEnabled = true
            etTelefono.isEnabled = true
            etDireccion.isEnabled = true
            btnEditar.visibility = View.GONE
            btnGuardar.visibility = View.VISIBLE
            DataHolder.aux = false
        }


        btnGuardar.setOnClickListener {
            //save data
            DataHolder.nombre = etNombre.text.toString()
            DataHolder.email = etEmail.text.toString()
            DataHolder.telefono = etTelefono.text.toString()
            DataHolder.direccion = etDireccion.text.toString()
            DataHolder.yy = datePicker.year
            DataHolder.mm = datePicker.month
            DataHolder.dd = datePicker.dayOfMonth

            //actions
            etNombre.isEnabled = false
            etEmail.isEnabled = false
            etTelefono.isEnabled = false
            etDireccion.isEnabled = false
            btnGuardar.visibility = View.GONE
            btnEditar.visibility = View.VISIBLE

        }


        btnBook.setOnClickListener {
            val intent = Intent(this, BookActivity::class.java)
            this.startActivity(intent)
            this.finish()
        }
    }
}

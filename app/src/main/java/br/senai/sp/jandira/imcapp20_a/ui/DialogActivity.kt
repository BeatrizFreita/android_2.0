package br.senai.sp.jandira.imcapp20_a.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import br.senai.sp.jandira.imcapp20_a.R

class DialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        val alertDialog = androidx.appcompat.app.AlertDialog.Builder(this@DialogActivity).create()
        alertDialog.setTitle("Alerta")
        alertDialog.setMessage("Você não terminou o seu cadastro, deseja prosseguir? ")
        alertDialog.setButton(androidx.appcompat.app.AlertDialog.BUTTON_POSITIVE, "Sim", { dialogInterface, i ->
            Toast.makeText(applicationContext, "Ok clicado", Toast.LENGTH_SHORT).show()
        })
        alertDialog.setButton(androidx.appcompat.app.AlertDialog.BUTTON_NEGATIVE, "Cancelar", {
                dialogInterface, j ->
            Toast.makeText(applicationContext, "Cancelar clicado", Toast.LENGTH_SHORT).show()
        })
        alertDialog.show()
    }

//https://materialpublic.imd.ufrn.br/curso/disciplina/3/66/5/11
//https://pt.stackoverflow.com/questions/308885/criando-um-positivebutton-em-um-dialog-no-android
// https://qastack.com.br/programming/5810084/android-alertdialog-single-button
}



//class FireMissilesDialogFragment : DialogFragment() {
//
//    override fun onCreateDialog(savedInstanceState: Bundle): Dialog {
//        return activity?.let {
//            // Use the Builder class for convenient dialog construction
//            val builder = AlertDialog.Builder(it)
//            builder.setMessage(R.string.dialog_fire_missiles)
//                .setPositiveButton(R.string.fire,
//                    DialogInterface.OnClickListener { dialog, id ->
//                        // FIRE ZE MISSILES!
//                    })
//                .setNegativeButton(R.string.cancel,
//                    DialogInterface.OnClickListener { dialog, id ->
//                        // User cancelled the dialog
//                    })
//            // Create the AlertDialog object and return it
//            builder.create()
//        } ?: throw IllegalStateException("Activity cannot be null")
//    }
//}
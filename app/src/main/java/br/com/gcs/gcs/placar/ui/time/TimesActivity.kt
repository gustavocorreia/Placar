package br.com.gcs.gcs.placar.ui.time

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import br.com.gcs.gcs.placar.utils.KEY_EXTRA_TIME_A
import android.os.Bundle
import br.com.gcs.gcs.placar.ui.placar.PlacarActivity
import br.com.gcs.gcs.placar.R
import br.com.gcs.gcs.placar.ui.placaraac.PlacarACCActivity
import br.com.gcs.gcs.placar.utils.KEY_EXTRA_TIME_B
import kotlinx.android.synthetic.main.activity_times.*


class TimesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_times)

        btIniciarJogo.setOnClickListener{
            val intent = Intent(this, PlacarACCActivity::class.java)
            intent.putExtra(KEY_EXTRA_TIME_A, inputTimeA.text.toString())
            intent.putExtra(KEY_EXTRA_TIME_B, inputTimeB.text.toString())
            startActivity(intent)
        }

        btNovoJogo.setOnClickListener{

        }
    }
}

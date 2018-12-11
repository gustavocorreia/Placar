package br.com.gcs.gcs.placar.ui.placaraac

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.gcs.gcs.placar.R
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarACCActivity : AppCompatActivity() {

    lateinit var placarAACViewModel: PlacarAACViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar_acc)

        placarAACViewModel = ViewModelProviders.of(this).get(PlacarAACViewModel::class.java)

        registraObservers()

        bt3PontosTimeA.setOnClickListener{
            placarAACViewModel.adicionaPonoTimeA(3)
        }

        bt2PontosTimeA.setOnClickListener{
            placarAACViewModel.adicionaPonoTimeA(2)
        }

        bt1PontoTimeA.setOnClickListener{
            placarAACViewModel.adicionaPonoTimeA(1)
        }

        bt3PontosTimeB.setOnClickListener{
            placarAACViewModel.adicionaPonoTimeB(3)
        }

        bt2PontosTimeB.setOnClickListener{
            placarAACViewModel.adicionaPonoTimeB(2)
        }

        bt1PontoTimeB.setOnClickListener{
            placarAACViewModel.adicionaPonoTimeB(1)
        }

        btReiniciar.setOnClickListener{
            placarAACViewModel.reiniciarJogo()
        }
    }

    private fun registraObservers() {
        placarAACViewModel.placarA.observe(this, Observer{
            tvPlacarTimeA.text = it.toString()
        })

        placarAACViewModel.placarB.observe(this, Observer{
            tvPlacarTimeB.text = it.toString()
        })
    }
}

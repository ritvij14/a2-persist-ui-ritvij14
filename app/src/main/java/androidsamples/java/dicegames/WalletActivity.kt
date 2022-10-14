package androidsamples.java.dicegames


import androidx.appcompat.app.AppCompatActivity
import androidsamples.java.dicegames.WalletViewModel
import android.os.Bundle
import android.view.View
import android.widget.Button

import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import android.widget.Toast

class WalletActivity : AppCompatActivity() {
    var model: WalletViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet)
        val button = findViewById<Button>(R.id.btn)

        val coin = findViewById<TextView>(R.id.bal)

        val previousroll = findViewById<TextView>(R.id.prevroll)

        val single_sixes = findViewById<TextView>(R.id.single_sixes)

        val tdr2 = findViewById<TextView>(R.id.tdr1)

        val ds = findViewById<TextView>(R.id.double_sixes)

        val dothers = findViewById<TextView>(R.id.double_others)
        model = ViewModelProvider(this).get(WalletViewModel::class.java)
        updateUI(
            button,
            coin,
            previousroll,
            single_sixes,
            tdr2,
            ds,
            dothers
        )
        button.setOnClickListener { view: View? ->
            model!!.rollDie()
            if (model!!.dieValue() == 6) Toast.makeText(this, "Congratulations", Toast.LENGTH_SHORT)
                .show()
            updateUI(
                button,
                coin,
                previousroll,
                single_sixes,
                tdr2,
                ds,
                dothers
            )
        }
    }

    private fun updateUI(
        button: Button,
        coin: TextView,
        previousroll: TextView,
        single_sixes: TextView,
        tdr2: TextView,
        ds: TextView,
        dothers: TextView
    ) {
        button.text = model!!.dieValue().toString()
        coin.text = model!!.balance().toString()
        single_sixes.text = model!!.singleSixes().toString()
        dothers.text = model!!.doubleOthers().toString()
        tdr2.text = model!!.totalRolls().toString()
        previousroll.text = model!!.previousRoll().toString()
        ds.text = model!!.doubleSixes().toString()
    }
}
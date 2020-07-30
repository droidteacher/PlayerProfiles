package hu.prooktatas.playerprofiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import hu.prooktatas.playerprofiles.model.Player

class MainActivity : AppCompatActivity() {

    private lateinit var playerImage: ImageView
    private lateinit var nameTextView: TextView
    private lateinit var ageTextView: TextView
    private lateinit var heightTextView: TextView
    private lateinit var citizenshipTextView: TextView
    private lateinit var positionTextView: TextView
    private lateinit var clubTextView: TextView
    private lateinit var marketValueTextView: TextView

    private var selectedPlayer: Player? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playerImage = findViewById(R.id.ivPlayer)
        nameTextView = findViewById(R.id.playerName)
        ageTextView = findViewById(R.id.playerAge)
        heightTextView = findViewById(R.id.heightValue)
        citizenshipTextView = findViewById(R.id.citizenshipValue)
        positionTextView = findViewById(R.id.positionValue)
        clubTextView = findViewById(R.id.clubValue)
        marketValueTextView = findViewById(R.id.marketValueValue)
    }

    override fun onStart() {
        super.onStart()

        selectedPlayer = intent.extras?.get("selectedPlayer") as? Player

        if (selectedPlayer != null) {
            playerImage.setImageDrawable(resources.getDrawable(selectedPlayer!!.imgRes))
            nameTextView.text = selectedPlayer!!.name
            ageTextView.text = selectedPlayer!!.age.toString()
            heightTextView.text = "${selectedPlayer!!.height} cm"
            citizenshipTextView.text = selectedPlayer!!.countryFlag
            positionTextView.text = selectedPlayer!!.position
            clubTextView.text = selectedPlayer!!.club
            marketValueTextView.text = "${selectedPlayer!!.marketValue}m EUR"
        }


    }
}
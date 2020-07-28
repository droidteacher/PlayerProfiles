package hu.prooktatas.playerprofiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var playerImage: ImageView
    private lateinit var nameTextView: TextView
    private lateinit var ageTextView: TextView
    private lateinit var heightTextView: TextView
    private lateinit var citizenshipTextView: TextView
    private lateinit var positionTextView: TextView
    private lateinit var clubTextView: TextView
    private lateinit var marketValueTextView: TextView



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

        playerImage.setImageDrawable(resources.getDrawable(R.drawable.kevin_de_bruyne))
        nameTextView.text = "Kevin DeBruyne"
        ageTextView.text = 29.toString()
        heightTextView.text = "181 cm"
        citizenshipTextView.text = "\uD83C\uDDE7\uD83C\uDDEA"
        positionTextView.text = "Attacking midfield"
        clubTextView.text = "Manchester City"
        marketValueTextView.text = "120.00m EUR"

    }
}
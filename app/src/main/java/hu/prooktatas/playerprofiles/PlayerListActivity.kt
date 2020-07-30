package hu.prooktatas.playerprofiles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import hu.prooktatas.playerprofiles.adapter.PlayerItemClickHandler
import hu.prooktatas.playerprofiles.adapter.PlayerListAdapter
import hu.prooktatas.playerprofiles.model.Player

class PlayerListActivity : AppCompatActivity(), PlayerItemClickHandler {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_list)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PlayerListAdapter(allPlayers, this)
    }

    override fun itemClicked(name: String) {
        Log.d("KZs", "Player name: $name")

        val selectedPlayer = allPlayers.filter {
            it.name == name
        }.first()

        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("selectedPlayer", selectedPlayer)
        startActivity(intent)
    }
}

val allPlayers = listOf(
    Player(
        "Dominik Szoboszlai",
        19,
        186,
        "Hungary",
        "Red Bull Salzburg",
        "Left midfield",
        25.00,
        R.drawable.dominik_szoboszlai
    ),
    Player(
        "Kevin DeBruyne",
        29,
        181,
        "Belgium",
        "Manchester City",
        "Attacking midfield",
        120.00,
        R.drawable.kevin_de_bruyne
    ),
    Player(
        "Lionel Messi",
        33,
        170,
        "Argentina",
        "FC Barcelona",
        "Right winger",
        112.00,
        R.drawable.lionel_messi
    ),
    Player(
        "Cristiano Ronaldo",
        35,
        187,
        "Portugal",
        "FC Juventus",
        "Left winger",
        30.00,
        R.drawable.cristiano_ronaldo
    ),
    Player(
        "Louis Suarez",
        33,
        182,
        "Uruguay",
        "FC Barcelona",
        "Centre forward",
        28.00,
        R.drawable.louis_suarez
    ),
    Player(
        "Davide Lanzafame",
        33,
        180,
        "Italy",
        "Budapest Honved FC",
        "Centre forward",
        0.800,
        R.drawable.davide_lanzafame
    ),
    Player(
        "Isael da Silva Barbosa",
        32,
        171,
        "Brazil",
        "Ferencvarosi TC",
        "Attacking midfield",
        1.50,
        R.drawable.isael_da_silva
    ),
    Player(
        "Leonardo Bonucci",
        33,
        190,
        "Italy",
        "FC Juventus",
        "Centre back",
        20.00,
        R.drawable.leonardo_bonucci
    ),
    Player(
        "Sergio Ramos Garcia",
        34,
        184,
        "Spain",
        "Real Madrid",
        "Centre back",
        14.50,
        R.drawable.sergio_ramos
    ),
    Player(
        "Erling Haaland",
        20,
        194,
        "Norway",
        "Borussia Dortmund",
        "Centre forward",
        72.00,
        R.drawable.erling_haaland
    ),
    Player(
        "Jan Oblak",
        27,
        188,
        "Slovenia",
        "Atletico Madrid",
        "Goalkeeper",
        80.00,
        R.drawable.jan_oblak
    ),
    Player(
        "Diego Godin",
        34,
        187,
        "Uruguay",
        "Inter Milan",
        "Centre back",
        8.00,
        R.drawable.diego_godin
    )

)
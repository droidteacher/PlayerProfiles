package hu.prooktatas.playerprofiles.model

import java.io.Serializable

data class Player(
    val name: String,
    val age: Int,
    val height: Int,
    val citizenship: String,
    val club: String,
    val position: String,
    val marketValue: Double,
    val imgRes: Int): Serializable {

    val countryFlag: String
        get() {
            return when(citizenship) {
                "Argentina" -> "\uD83C\uDDE6\uD83C\uDDF7"
                "Belgium" -> "\uD83C\uDDE7\uD83C\uDDEA"
                "Brazil" -> "\uD83C\uDDE7\uD83C\uDDF7"
                "Hungary" -> "\uD83C\uDDED\uD83C\uDDFA"
                "Italy" -> "\uD83C\uDDEE\uD83C\uDDF9"
                "Norway" -> "\uD83C\uDDF3\uD83C\uDDF4"
                "Portugal" -> "\uD83C\uDDF5\uD83C\uDDF9"
                "Slovenia" -> "\uD83C\uDDF8\uD83C\uDDEE"
                "Spain" -> "\uD83C\uDDEA\uD83C\uDDF8"
                "Uruguay" -> "\uD83C\uDDFA\uD83C\uDDFE"
                else -> citizenship
            }
        }
}


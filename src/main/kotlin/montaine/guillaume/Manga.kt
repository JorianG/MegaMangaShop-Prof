package org.example.montaine.guillaume.montaine.guillaume

import kotlin.math.round

data class Manga(val titre: String, val prix: Double) {
    init {
        if (prix <= 0) {
            throw IllegalArgumentException("Le prix doit être positif")
        }
        if (prix != round(prix * 100) / 100) {
            throw IllegalArgumentException("Le prix ne peux avoir que deux décimales maximum")
        }
    }
}

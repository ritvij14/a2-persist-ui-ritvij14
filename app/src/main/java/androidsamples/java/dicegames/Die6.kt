package androidsamples.java.dicegames

import java.util.*

/**
 * An implementation of a six-faced [Die] using [Random].
 */
class Die6 : Die {
    var face = 0
    override fun roll() {
        val ra = Random()
        val r = ra.nextInt(6)
        face = r + 1
    }

    override fun value(): Int {
        return face
    }
}
package androidsamples.java.dicegames

import androidx.lifecycle.ViewModel

class WalletViewModel
/**
 * The no argument constructor.
 */
    : ViewModel() {
    var face = 0
    var single_sixes = 0
    var double_sixes = 0
    var total_rolls = 0
    var double_others = 0
    var bal = 0
    var previousroll = 0
    var total_sixes = 0
    var die = Die6()

    /**
     * Reports the current balance.
     *
     */
    fun balance(): Int {
        return bal
    }

    /**
     * Rolls the [Die] in the wallet and implements the changes accordingly.
     */
    fun rollDie() {
        previousroll = face
        die.roll()
        face = die.value()
        total_rolls += 1
        if (face == 6 && previousroll != 6) {
            bal += 5
            single_sixes += 1
        }
        if (face == 6 && previousroll == 6) {
            bal += 10
            double_sixes += 1
        }
        if (face != 6 && face == previousroll) {
            bal -= 5
            double_others += 1
        }

    }

    /**
     * Reports the current value of the [Die].
     *
     */
    fun dieValue(): Int {
        return face
    }

    /**
     * Reports the number of single (or first) sixes rolled so far.
     *
     */
    fun singleSixes(): Int {
        return single_sixes
    }

    /**
     * Reports the total number of dice rolls so far.
     *
     */
    fun totalRolls(): Int {
        return total_rolls
    }

    /**
     * Reports the number of times two sixes were rolled in a row.
     *
     */
    fun doubleSixes(): Int {
        return double_sixes
    }

    /**
     * Reports the number of times any other number was rolled twice in a row.
     *
     */
    fun doubleOthers(): Int {
        return double_others
    }

    /**
     * Reports the value of the die on the previous roll.
     *
     */
    fun previousRoll(): Int {
        return previousroll
    }
}
package vitaliyr.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRoll = findViewById<Button>(R.id.roll_button)
        buttonRoll.text = "Let's Roll"
        buttonRoll.setOnClickListener {
            rollDice()
        }

        diceImage = findViewById(R.id.dice_image)

    }

    private fun rollDice() {
        val diceDrawable = when(Random.nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(diceDrawable)

    }
}

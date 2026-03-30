package com.example.socialsparks

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// Note: Logic and UI concepts referenced from the Android Developer documentation.
class MainActivity : AppCompatActivity() {

    private val debugTag = "MainActivityLog"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Binding variables to the XML layout
        val timeInputEditText = findViewById<EditText>(R.id.timeInputEditText)
        val generateIdeaBtn = findViewById<Button>(R.id.generateIdeaBtn)
        val clearBtn = findViewById<Button>(R.id.clearBtn)
        val suggestionOutputView = findViewById<TextView>(R.id.suggestionOutputView)

        Log.d(debugTag, "App has loaded successfully")

        // What happens when the user clicks the main button
        generateIdeaBtn.setOnClickListener {
            val userTime = timeInputEditText.text.toString().trim().lowercase()
            Log.d(debugTag, "User asked for an idea for: $userTime")

            // Pass the input to our custom function and display the result
            val finalSuggestion = createSparkIdea(userTime)
            suggestionOutputView.text = finalSuggestion
        }

        // Reset everything when clear is clicked
        clearBtn.setOnClickListener {
            timeInputEditText.text.clear()
            suggestionOutputView.text = ""
            Log.d(debugTag, "Fields cleared")
        }
    }

    /**
     * Checks the time entered and returns a specific social action.
     * Required by rubric to use if/else statements.
     */
    private fun createSparkIdea(time: String): String {

        // Handle empty input first
        if (time.isEmpty()) {
            Log.w(debugTag, "Input was empty")
            return "You forgot to type a time! Try entering 'Morning' or 'Night'."
        }

        // Main if/else logic block for the different times of day
        return if (time == "morning") {
            "Send a 'Good morning' text to a family member."
        } else if (time == "mid-morning" || time == "mid morning") {
            "Reach out to a colleague with a quick 'Thank you.'"
        } else if (time == "afternoon") {
            "Share a funny meme or interesting link with a friend."
        } else if (time == "afternoon snack time" || time == "snack time") {
            "Send a quick 'thinking of you' message."
        } else if (time == "dinner") {
            "Call a friend or relative for a 5-minute catch-up."
        } else if (time == "after dinner" || time == "night") {
            "Leave a thoughtful comment on a friend's post."
        } else {
            Log.w(debugTag, "Didn't recognize the input: $time")
            "Hmm, I don't have a suggestion for that time. Try a standard time like 'Afternoon' or 'Dinner'."
        }
    }
}
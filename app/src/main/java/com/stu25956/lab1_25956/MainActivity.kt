package com.stu25956.lab1_25956

/*
Mobile App 1 - BSC20923
Filipe Lutz Mariano 25956
Continuous Assessment 1 (10%)
*/

// import libraries
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

// MainActivity class, inheriting from ComponentActivity
class MainActivity : ComponentActivity() {
    // Override onCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set content using Jetpack Compose
        setContent {
            // Call a composable function uncommenting it.
            gLogin()
            //gSignUp()
            //bLogin()
            //bSignUp()
        }
    }
}

// Color constants
val White = Color.White
val ConWhite = Color(0xFFEEEEEE)
val LightGray = Color.LightGray
val Gray = Color.Gray
val DarkGray = Color.DarkGray
val LightBlack = Color(0xFF333333)
val Black = Color.Black
val Transparent = Color.Transparent

// Preview function to display
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    gLogin()
    //gSignUp()
    //bLogin()
    //bSignUp()
}
package com.example.jetpack_activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_activity.ui.theme.JetpackactivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackactivityTheme {

            }
        }
    }
}


@Composable
fun WelcomeText(){
    Text(
        text = "Welcome to Jetpack Compose!"
    )
}

@Composable
fun ModifierText(){
    Text(
        text = "Exploring modifiers",
        modifier = Modifier.background(color = Color.LightGray).padding(24.dp),
        fontSize = 20.sp
    )
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    JetpackactivityTheme {
        Column {
            WelcomeText()
            Spacer(Modifier.size(2.dp))
            ModifierText()

        }
    }
}
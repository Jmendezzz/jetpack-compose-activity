package com.example.jetpack_activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
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
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppContent()
                }
            }
        }
    }
}

@Composable
fun AppContent() {
    Column(modifier = Modifier.padding(16.dp)) {
        WelcomeText()
        Spacer(Modifier.size(8.dp))
        ModifierText()
        LayoutColumn()
        LayoutRow()
        RoundedText()
        ItalicText()
        ProfileImage()
    }
}

@Composable
fun WelcomeText() {
    Text(
        text = "Welcome to Jetpack Compose!"
    )
}

@Composable
fun ModifierText() {
    Text(
        text = "Exploring modifiers",
        modifier = Modifier
            .background(color = Color.LightGray)
            .padding(24.dp),
        fontSize = 20.sp
    )
}

@Composable
fun LayoutColumn() {
    Column {
        Text("Name", modifier = Modifier.padding(8.dp))
        Text("Age", modifier = Modifier.padding(8.dp))
        Text("City", modifier = Modifier.padding(8.dp))
    }
}

@Composable
fun LayoutRow() {
    Row {
        Text("Home")
        Spacer(modifier = Modifier.width(16.dp))
        Text("Profile")
        Spacer(modifier = Modifier.width(16.dp))
        Text("Configuration")
    }
}

@Composable
fun RoundedText() {
    Text(
        text = "Rounded Text",
        modifier = Modifier.border(
            width = 2.dp,
            color = Color.Blue,
            shape = RoundedCornerShape(50.dp)
        ),
    )
}

@Composable
fun ItalicText(){
    Text(
        text = "This is an Italic Style",
        fontStyle = FontStyle.Italic
    )
}

@Composable
fun ProfileImage(){
    Image(
        painter = painterResource(id = R.drawable.avatar),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier =
        Modifier
            .size(150.dp)
            .clip(CircleShape)
            .border(4.dp, Color.White, CircleShape)
    )
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    JetpackactivityTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            AppContent()
        }
    }
}

@Composable
fun Title(text: String){
    Text(
        text = text,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun SubTitle(text: String){
    Text(
        text = text,
        fontSize = 16.sp,
        fontWeight = FontWeight.Light,
        fontFamily = FontFamily.Cursive
    )
}

@Preview(showBackground = true)
@Composable
fun ColumnScreen() {
    JetpackactivityTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                ProfileImage()
                Title("El Mowks")
                SubTitle("Product Manager")
            }
        }
    }
}
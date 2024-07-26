package com.example.algishare

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.example.algishare.ui.theme.AlgiShareTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlgiShareTheme {
                Scaffold(modifier = Modifier.padding(all = Dp(50f))) {
                    HomeScreen(
                        name = ""
                    )
                }
            }
        }
    }


}

@Composable
fun HomeScreen(name: String){
    Scaffold (){}
}

@Composable
fun HomeScreenPr(){
    HomeScreen("dsd")
}
package com.example.creditcard_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.creditcard_app.ui.theme.CreditCard_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreditCard_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    DisplayeCards()
                }
            }
        }
    }
}

@Composable
fun DisplayeCards() {
    val cards = listOf<CardInfo>(
        CardInfo("8909 8787 5656 4343", "JAYAKRISHNAN M", R.drawable.visa, R.drawable.background1),
        CardInfo(
            "2343 5656 7876 5434",
            "JACK REACHER",
            R.drawable.mastercard,
            R.drawable.background2
        ),
        CardInfo("7809 5723 8989 4343", "JOHN WICK", R.drawable.rupay, R.drawable.background3),
        CardInfo(
            "2343 2875 0909 1212",
            "DERICK ABRAHAM",
            R.drawable.mastercard,
            R.drawable.background4
        ),
        CardInfo(
            "1423 2846 7878 4444",
            "ALEXANDER JOSEPH",
            R.drawable.visa,
            R.drawable.background2
        ),
        CardInfo("7878 5643 6565 6666", "DAVID NAINAN", R.drawable.rupay, R.drawable.background1),
    )
    
    LazyColumn(modifier = Modifier
        .fillMaxHeight()
        .padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)){
        items(cards){
            card -> CreditCard(cardInfo = card)
        }
    }
}

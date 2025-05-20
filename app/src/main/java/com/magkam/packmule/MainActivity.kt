package com.magkam.packmule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.magkam.packmule.ui.theme.PackmuleTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PackmuleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FirstComposable()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun FirstComposable() {
    Column {
        val name = remember { mutableStateOf("") }
        Text("Hello, ${name.value}",
            modifier = Modifier
                .background(Color.Gray)
                .padding(16.dp)
        )
        TextField(value = name.value,
            onValueChange = {
                name.value = it
            },
            modifier = Modifier
                .background(Color.Gray)
        )
        Text("more stuff here",
            color = Color.White,
            modifier = Modifier
                .background(Color.Black)
        )
    }
}

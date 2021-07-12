package com.example.meditationlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.meditationlayout.ui.HomeScreen
import com.example.meditationlayout.ui.theme.MeditationLayoutTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationLayoutTheme {
                    HomeScreen()
                }
            }
        }
    }


@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HomeScreen()
}
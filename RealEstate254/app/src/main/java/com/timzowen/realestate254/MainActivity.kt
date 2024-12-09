package com.timzowen.realestate254

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
import com.timzowen.realestate254.screens.PropertyHomeScreen
import com.timzowen.realestate254.ui.theme.RealEstate254Theme
import com.timzowen.realestate254.viewmodel.PropertyViewModel

class MainActivity : ComponentActivity() {
    val viewModel = PropertyViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RealEstate254Theme {
                PropertyHomeScreen(viewModel)
            }
        }
    }
}

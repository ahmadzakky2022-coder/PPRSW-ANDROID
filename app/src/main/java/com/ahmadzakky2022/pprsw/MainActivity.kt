package com.ahmadzakky2022.pprsw

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                PprswHome()
            }
        }
    }
}

@Composable
fun PprswHome() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "PPRSW Security",
                style = MaterialTheme.typography.headlineMedium
            )

            Text(
                text = "Security Dashboard",
                style = MaterialTheme.typography.titleMedium
            )

            Text("• Device Status")
            Text("• Security Scan")
            Text("• Activity Logs")
            Text("• Security Settings")
        }
    }
}

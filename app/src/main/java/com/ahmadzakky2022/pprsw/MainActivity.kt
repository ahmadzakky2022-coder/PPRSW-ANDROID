package com.ahmadzakky2022.pprsw

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

private val CyberBackground = Color(0xFF06110D)
private val CyberSurface = Color(0xFF0D1D17)
private val CyberGreen = Color(0xFF5CFF9D)
private val CyberText = Color(0xFFE4F5EC)
private val CyberMuted = Color(0xFF91A69A)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme(
                colorScheme = darkColorScheme(
                    primary = CyberGreen,
                    background = CyberBackground,
                    surface = CyberSurface,
                    onBackground = CyberText,
                    onSurface = CyberText
                )
            ) {
                PprswDashboard()
            }
        }
    }
}

@Composable
private fun PprswDashboard() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = CyberBackground
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Text(
                text = "PPRSW Security",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = CyberText
            )

            Text(
                text = "Security Dashboard",
                style = MaterialTheme.typography.titleMedium,
                color = CyberMuted
            )

            Surface(
                color = CyberGreen.copy(alpha = 0.12f),
                shape = RoundedCornerShape(12.dp),
                border = BorderStroke(
                    width = 1.dp,
                    color = CyberGreen.copy(alpha = 0.55f)
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp)
                ) {
                    Text(
                        text = "●  SYSTEM SECURE",
                        color = CyberGreen,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            SecurityCard(
                title = "Device Status",
                description = "Device security overview"
            )

            SecurityCard(
                title = "Security Scan",
                description = "Run local security checks"
            )

            SecurityCard(
                title = "Activity Logs",
                description = "Review security activity"
            )

            SecurityCard(
                title = "Security Settings",
                description = "Configure protection options"
            )
        }
    }
}

@Composable
private fun SecurityCard(
    title: String,
    description: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = CyberSurface
        ),
        border = BorderStroke(
            width = 1.dp,
            color = CyberGreen.copy(alpha = 0.22f)
        )
    ) {
        Column(
            modifier = Modifier.padding(18.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
                color = CyberGreen
            )

            Text(
                text = description,
                style = MaterialTheme.typography.bodyMedium,
                color = CyberMuted
            )
        }
    }
}
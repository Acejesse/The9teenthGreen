@file:OptIn(ExperimentalMaterial3Api::class)
package com.example.the9teenthgreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.the9teenthgreen.ui.theme.The9teenthGreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            The9teenthGreenTheme {
                HomeScreen()
            }
        }
    }

    @Composable
    fun HomeScreen() {
        val context = LocalContext.current

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF1B5E20)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "The9teenthGreen",
                    fontSize = 32.sp,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(24.dp))

                // Clubs Card
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .clickable {
                            context.startActivity(Intent(context, ClubsActivity::class.java))
                        },
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF4CAF50))
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Clubs", fontSize = 24.sp, color = Color.White)
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Golf Balls Card
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .clickable {
                            context.startActivity(Intent(context, GolfBallsActivity::class.java))
                        },
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF4CAF50))
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Golf Balls", fontSize = 24.sp, color = Color.White)
                    }
                }
            }
        }
    }
}
@file:OptIn(ExperimentalMaterial3Api::class)
package com.example.the9teenthgreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.the9teenthgreen.ui.theme.The9teenthGreenTheme

class GolfBallsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            The9teenthGreenTheme {
                GolfBallsListScreen()
            }
        }
    }

    @Composable
    fun GolfBallsListScreen() {
        val golfBalls = listOf(
            "Pro V1",
            "Pro V1x",
            "Bridgestone E 12",
            "Titleist Tour Soft",
            "Taylormade TPX5",
            "Callaway 360",
            "Callaway Chrome Soft Tour",
            "Callaway Chrome Soft Tour X",
            "Maxfli Tour",
            "Srixon Z Star"
        )

        Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFF1B5E20)) {
            Column {
                TopAppBar(
                    title = { Text("Golf Balls", color = Color.White) },
                    navigationIcon = {
                        IconButton(onClick = { finish() }) {
                            Text("< Back", color = Color.White, fontSize = 16.sp)
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF4CAF50))
                )

                LazyColumn(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(golfBalls) { ball ->
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(8.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFF81C784))
                        ) {
                            Text(
                                text = ball,
                                fontSize = 18.sp,
                                modifier = Modifier.padding(16.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}
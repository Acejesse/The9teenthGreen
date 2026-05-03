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

class ClubsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            The9teenthGreenTheme {
                ClubsListScreen()
            }
        }
    }

    @Composable
    fun ClubsListScreen() {
        val clubs = listOf(
            "Left handed Titleist D-1 Driver, regular flex shaft",
            "Lefthanded Titleist AP3 3iron (Driving iron) - senior flex",
            "Right handed B-52 Bomber Driver, regular flex",
            "Lefthanded Tour Edge hybrid 4 iron, senior flex",
            "Lefthanded Callaway Big Bertha 4 hybrid, regular flex",
            "Lefthanded Callaway Big Bertha 3 wood, senior flex",
            "(2) Lefthanded Cleveland CG 15 (60°)",
            "Lefthanded Mizuno wedge 53°",
            "(5) Titleist SM7 wedges 56°, 58°, 58°, 56°, 52° and 54° (Right Handed)",
            "Lefthanded Odyssey Havok 33\" Putter",
            "Tour Edge -6 hybrid (30°) senior flex"
        )

        Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFF1B5E20)) {
            Column {
                TopAppBar(
                    title = { Text("Golf Clubs", color = Color.White) },
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
                    items(clubs) { club ->
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(8.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFF81C784))
                        ) {
                            Text(
                                text = club,
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
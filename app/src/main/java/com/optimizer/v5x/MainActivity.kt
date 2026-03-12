package com.optimizer.v5x

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            OptimizerUI()
        }
    }
}

@Composable
fun OptimizerUI() {

    var status by remember { mutableStateOf("Idle") }

    MaterialTheme {

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Text("OptimizerV5X")

                Spacer(modifier = Modifier.height(20.dp))

                Button(onClick = {
                    status = "Running optimizations..."
                }) {
                    Text("OPTIMIZE")
                }

                Spacer(modifier = Modifier.height(20.dp))

                Text("Status: $status")

            }

        }

    }
}

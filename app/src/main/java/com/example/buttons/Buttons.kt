package com.example.buttons

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Buttons(context: Context) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // 1. Normal Button :->
        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = Color.White
            ),
            enabled = true,
            onClick = {
                Toast.makeText(context, "Normal Button", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(
                text = "Normal Button"
            )
        }

        // 2. Elevated/Shadow Button :->
        ElevatedButton(
            onClick = {
                Toast.makeText(context, "Elevated Button", Toast.LENGTH_SHORT).show()
            }
        ) {
            Icon(
                imageVector = Icons.Outlined.Add,
                contentDescription = "Add",
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Add to cart"
            )
        }

        // 3.> FilledTonalButton :->
        FilledTonalButton(onClick = {
            Toast.makeText(context, "Filled Button", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Open in browser")
        }

        // 4. OutlinedButton :->
        OutlinedButton(onClick = {
            Toast.makeText(context, "Outlined Button", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Back")
        }

        // 5. TextButton :->
        TextButton(onClick = {
            Toast.makeText(context, "Text Button", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Learn more")
        }

    }

}
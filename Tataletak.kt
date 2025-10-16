package com.example.basiclayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TataletakColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Row 2")
    }
}

@Composable
fun TataletakCustomRow(modifier: Modifier = Modifier) { // [cite: 3]
    Column {
        //Baris1 [cite: 3]
        Row(
            modifier = modifier.fillMaxWidth(), // [cite: 3]
            horizontalArrangement = Arrangement.SpaceEvenly // [cite: 3]
        ) {
            Text(text = "Komponen1Baris1") // [cite: 3]
            Text(text = "Komponen2Baris1") // [cite: 3]
            Text(text = "Komponen3Baris1") // [cite: 3]
        }
        //Baris2 [cite: 3]
        Row(
            modifier = modifier.fillMaxWidth(), // [cite: 3]
            horizontalArrangement = Arrangement.SpaceEvenly // [cite: 3]
        ) {
            Text(text = "Komponen1Baris2") // [cite: 3]
            Text(text = "Komponen2Baris2") // [cite: 3]
            Text(text = "Komponen3Baris2") // [cite: 3]
        }
    }
}
@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) { // [cite: 3]
    Row(
        modifier = modifier.fillMaxWidth(), // [cite: 3]
        horizontalArrangement = Arrangement.SpaceEvenly // [cite: 3]
    ) {
        Column { // [cite: 3]
            Text(text = "Komponen1Kolom1") // [cite: 3]
            Text(text = "Komponen2Kolom1") // [cite: 3]
            Text(text = "Komponen3Kolom1") // [cite: 3]
        }
        Column { // [cite: 3]
            Text(text = "Komponen1Kolom2") // [cite: 3]
            Text(text = "Komponen2Kolom2") // [cite: 3]
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) { // [cite: 3]
    val gambar = painterResource(id = R.drawable.Kucing) // [cite: 3]
    Column(modifier = modifier) {
        Box(
            modifier = modifier
                .height(110.dp) // [cite: 3]
                .fillMaxWidth()
                .background(color = Color.Yellow), // [cite: 3]
            contentAlignment = Alignment.Center // [cite: 3]
        ) {
            Column {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1 Row1 Komponen1") // [cite: 4]
                    Text(text = "Col1 Row1 Komponen2") // [cite: 3]
                    Text(text = "Col1 Row1 Komponen3") // [cite: 3]
                }
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly // [cite: 4]
                ) {
                    Text(text = "Col1 Row2 Komponen1") // [cite: 4]
                    Text(text = "Col1 Row2 Komponen2") // [cite: 4]
                    Text(text = "Col1 Row2 Komponen3") // [cite: 4]
                }
            }
        }
        Spacer(modifier = Modifier.height(height = 10.dp)) // [cite: 4]
        Box(
            modifier = modifier
                .height(500.dp) // [cite: 4, 25]
                .fillMaxWidth()
                .background(color = Color.Cyan), // [cite: 4, 26]
            contentAlignment = Alignment.Center // [cite: 4, 27]
        ) {
            Image(
                painter = gambar, // [cite: 28]
                contentDescription = null, // [cite: 29]
                contentScale = ContentScale.Fit // [cite: 30, 31]
            )
            Text(
                text = "My Gofun", // [cite: 32]
                fontSize = 50.sp, // [cite: 4, 33]
                color = Color.Red, // [cite: 4, 34]
                fontWeight = FontWeight.Bold, // [cite: 35]
                fontFamily = FontFamily.Cursive // [cite: 36]
            )
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) { // [cite: 3]
    val gambar = painterResource(id = R.drawable.Kucing) // [cite: 3]
    Column(modifier = modifier) {
        Box(
            modifier = modifier
                .height(110.dp) // [cite: 3]
                .fillMaxWidth()
                .background(color = Color.Yellow), // [cite: 3]
            contentAlignment = Alignment.Center // [cite: 3]
        ) {
            Column {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1 Row1 Komponen1") // [cite: 4]
                    Text(text = "Col1 Row1 Komponen2") // [cite: 3]
                    Text(text = "Col1 Row1 Komponen3") // [cite: 3]
                }
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly // [cite: 4]
                ) {
                    Text(text = "Col1 Row2 Komponen1") // [cite: 4]
                    Text(text = "Col1 Row2 Komponen2") // [cite: 4]
                    Text(text = "Col1 Row2 Komponen3") // [cite: 4]
                }
            }
        }
        Spacer(modifier = Modifier.height(height = 10.dp)) // [cite: 4]
        Box(
            modifier = modifier
                .height(500.dp) // [cite: 4, 25]
                .fillMaxWidth()
                .background(color = Color.Cyan), // [cite: 4, 26]
            contentAlignment = Alignment.Center // [cite: 4, 27]
        ) {
            Image(
                painter = gambar, // [cite: 28]
                contentDescription = null, // [cite: 29]
                contentScale = ContentScale.Fit // [cite: 30, 31]
            )
            Text(
                text = "My Gofun", // [cite: 32]
                fontSize = 50.sp, // [cite: 4, 33]
                color = Color.Red, // [cite: 4, 34]
                fontWeight = FontWeight.Bold, // [cite: 35]
                fontFamily = FontFamily.Cursive // [cite: 36]
            )
        }
    }
}

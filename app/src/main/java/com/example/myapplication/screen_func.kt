package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

//screen - other funcs
@Preview(showBackground = true)
@Composable
fun Screen() {
    val myColor: Color = Color(0xFF050B18)
//remove Lazy Column
    Column(
        modifier = Modifier
            .background(myColor)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
    ) {
        DotaHeader()

        dotaInfo()

        dotaDemo()

        dotaButton()
    }

}
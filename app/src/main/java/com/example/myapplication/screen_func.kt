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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.backgroundColor

//screen - main func to call all functions

@Composable
fun Screen(color: Color) {
//    цвет фона приложения в переменной myColor


    Column(
        modifier = Modifier
            .background(color)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
    ) {
        DotaHeader()

        gameGenres()

        dotaInfo()

        dotaDemo()

        dotaComments()

        dotaButton()
    }

}
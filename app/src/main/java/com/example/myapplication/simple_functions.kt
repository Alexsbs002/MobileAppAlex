package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.myapplication.ui.theme.genresColoLight
import com.example.myapplication.ui.theme.genresColorDarker


@Composable
fun oneStar(fotka: Int){
    Image(
        painter = painterResource(id = fotka),
        contentDescription = "dotaScreenshot",
        contentScale = ContentScale.Crop,
        modifier = Modifier.background(Color.Transparent).height(15.dp).width(15.dp)



    )

}
@Composable
fun gameDownloads(rate: Int){
    Text(color = Color.DarkGray, text = stringResource(rate), fontWeight = FontWeight.SemiBold, fontSize=14.sp,)
}

@Composable
fun oneGenre(genre : Int){
    Row(
        modifier = Modifier.alpha(0.8f)
            .height(25.dp)
            .clip(shape = RoundedCornerShape(size = 20.dp))
            .background(
                color = genresColorDarker
            ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,



        ) {

        Spacer(modifier = Modifier.width(10.dp))
        Text(color = genresColoLight, text = stringResource(genre))
        Spacer(modifier = Modifier.width(10.dp))
    }
}

@Composable
fun oneImageDemo(img : Int){
    Image(
        painter = painterResource(id = img),
        contentDescription = "dotaScreenshot",
        contentScale = ContentScale.Crop,
        modifier = Modifier.background(Color.Transparent).height(120.dp).width(260.dp)
            .padding(start = 24.dp, end = 24.dp)
            .clip(shape = RoundedCornerShape(size = 20.dp))

    )

}

package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

//all function of project
@Composable
fun dotaInfo() {
    Column (modifier = Modifier.padding(
        start = 24.dp,
        end = 24.dp,
        top = 14.dp,
        bottom = 14.dp,)){
        Text( color = Color.White,text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own." )
    }

}

@Composable
fun DotaHeader() {
    Box(
    ) {
        Image(
            painter = painterResource(id = R.drawable.jagger),
            contentDescription = "Runduck",
            modifier = Modifier.height(300.dp).fillMaxWidth(),
            contentScale = ContentScale.Crop

        )

        Box(modifier = Modifier.padding(start = 40.dp, top = 250.dp)) {
            Box(
                modifier = Modifier.zIndex(2f)
//                    .offset()
                    .border(
                        BorderStroke(2.dp, Color.DarkGray), RoundedCornerShape(10.dp)
                    )
                    .height(80.dp).width(80.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.dota_icon),
                    contentDescription = "Runduck",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.background(Color.Black).height(80.dp).width(80.dp)
                        .padding(15.dp)
                )
            }
        }

    }


}


@Composable
fun dotaDemo() {
    LazyRow(
        modifier = Modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp)


    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.dotademo),
                contentDescription = "Runduck",
                contentScale = ContentScale.Crop,
                modifier = Modifier.background(Color.Transparent).height(120.dp)
                    .padding(start = 24.dp, end = 24.dp)
                    .clip(shape = RoundedCornerShape(size = 20.dp))

            )
        }
        item {
            Image(
                painter = painterResource(id = R.drawable.dotademo),
                contentDescription = "Runduck",
                contentScale = ContentScale.Crop,
                modifier = Modifier.background(Color.Transparent).height(120.dp)
                    .padding(start = 24.dp, end = 24.dp)
                    .clip(shape = RoundedCornerShape(size = 20.dp))

            )
        }
    }


}

@Composable
fun dotaButton() {
    Row(

        modifier = Modifier
            .padding(horizontal = 24.dp, vertical = 15.dp)
            .height(50.dp)
            .width(380.dp)
            .clip(shape = RoundedCornerShape(size = 20.dp))
            .clickable { }
            .background(color = Color.Yellow),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,


        ) {
        Text(text = stringResource(R.string.text_dota))

    }
}
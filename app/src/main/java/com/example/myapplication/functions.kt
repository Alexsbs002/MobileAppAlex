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
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.myapplication.ui.theme.genresColoLight
import com.example.myapplication.ui.theme.genresColor
import com.example.myapplication.ui.theme.genresColorDarker

//all function of project


@Composable
@Preview(showBackground = true)
fun DotaHeader() {
    Box(
    ) {
        jaggerHeader()
        dotaIcon()
    }
}
@Preview(showBackground = true)
@Composable
fun jaggerHeader(){
    Image(
        painter = painterResource(id = R.drawable.jagger),
        contentDescription = "runduck",
        modifier = Modifier.height(300.dp).fillMaxWidth(),
        contentScale = ContentScale.Crop

    )

}

@Preview(showBackground = true)
@Composable
fun dotaIcon(){
    Box(modifier = Modifier.offset(24.dp,270.dp)) {
        Box(
            modifier = Modifier.zIndex(2f)
//                    .offset()
                .border(
                    BorderStroke(2.dp, Color.DarkGray), RoundedCornerShape(10.dp)
                )
                .height(100.dp).width(100.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.dota_icon),
                contentDescription = "dotaIcon",
                contentScale = ContentScale.Crop,
                modifier = Modifier.background(Color.Black).height(100.dp).width(100.dp)
                    .padding(20.dp)
            )
        }

        Box(
            modifier = Modifier.zIndex(2f)
                    .offset(120.dp,40.dp)

        ) {
            Text(color = Color.White, text = stringResource(R.string.game_name), fontWeight = FontWeight.SemiBold, fontSize=24.sp,)
        }
//STARS
        LazyRow(
            modifier = Modifier.zIndex(2f)
                .offset(120.dp,80.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),

            ) {
            item {
                Image(
                    painter = painterResource(id = R.drawable.yellowratingstar),
                    contentDescription = "dotaScreenshot",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.background(Color.Transparent).height(15.dp).width(15.dp)



                )
            }
            item {
                Image(
                    painter = painterResource(id = R.drawable.yellowratingstar),
                    contentDescription = "dotaScreenshot",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.background(Color.Transparent).height(15.dp).width(15.dp)



                )
            }
            item {
                Image(
                    painter = painterResource(id = R.drawable.yellowratingstar),
                    contentDescription = "dotaScreenshot",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.background(Color.Transparent).height(15.dp).width(15.dp)



                )
            }
            item {
                Image(
                    painter = painterResource(id = R.drawable.yellowratingstar),
                    contentDescription = "dotaScreenshot",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.background(Color.Transparent).height(15.dp).width(15.dp)



                )
            }
            item {
                Image(
                    painter = painterResource(id = R.drawable.yellowratingstar),
                    contentDescription = "dotaScreenshot",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.background(Color.Transparent).height(15.dp).width(15.dp)



                )
            }
        }
//        ЧИСЛО ЗАГРУЗОК game_downloads
        Row(modifier = Modifier.zIndex(2f)
            .offset(220.dp,80.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),){
            Text(color = Color.DarkGray, text = stringResource(R.string.game_downloads), fontWeight = FontWeight.SemiBold, fontSize=14.sp,)
        }



    }


}
@Preview(showBackground = true)
@Composable
fun gameGenres(){
//ЖАНРЫ
    LazyRow(
        modifier = Modifier.padding(top = 100.dp, start = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),



    ) {
        item {
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
                    Text(color = genresColoLight, text = stringResource(R.string.game_genre1))
                    Spacer(modifier = Modifier.width(10.dp))
            }

        }
      item {
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
          Text(color = genresColoLight, text = stringResource(R.string.game_genre2))
          Spacer(modifier = Modifier.width(10.dp))
      }

        }
        item {
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
                Text(color = genresColoLight, text = stringResource(R.string.game_genre3))
                Spacer(modifier = Modifier.width(10.dp))
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun dotaInfo() {
    Column (modifier = Modifier.padding(
        start = 24.dp,
        top = 20.dp,
        end = 24.dp,
        bottom = 20.dp,
        )){
        Text(color = Color.White, text = stringResource(R.string.About_dota), )
    }

}

@Preview(showBackground = true)
@Composable
fun dotaDemo() {
    LazyRow(
        modifier = Modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp)


    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.dotademo),
                contentDescription = "dotaScreenshot",
                contentScale = ContentScale.Crop,
                modifier = Modifier.background(Color.Transparent).height(120.dp).width(260.dp)
                    .padding(start = 24.dp, end = 24.dp)
                    .clip(shape = RoundedCornerShape(size = 20.dp))

            )
        }
        item {
            Image(
                painter = painterResource(id = R.drawable.screendazzle),
                contentDescription = "dotaScreenshot",
                contentScale = ContentScale.Crop,
                modifier = Modifier.background(Color.Transparent).height(120.dp).width(260.dp)
                    .padding(start = 24.dp, end = 24.dp)
                    .clip(shape = RoundedCornerShape(size = 20.dp))

            )
        }
        item {
            Image(
                painter = painterResource(id = R.drawable.screendota32),
                contentDescription = "dotaScreenshot",
                contentScale = ContentScale.Crop,
                modifier = Modifier.background(Color.Transparent).height(120.dp).width(260.dp)
                    .padding(start = 24.dp, end = 24.dp)
                    .clip(shape = RoundedCornerShape(size = 20.dp))

            )
        }
    }


}
@Preview(showBackground = true)
@Composable
fun dotaComments(){
    Column(modifier = Modifier.padding(24.dp)) {
        Text(color = Color.White, text = stringResource(R.string.review), fontWeight = FontWeight.Bold, fontSize=25.sp, )




    }
}
@Preview(showBackground = true)
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
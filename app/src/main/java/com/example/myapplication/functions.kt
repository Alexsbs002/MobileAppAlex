package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.myapplication.ui.theme.backgroundColor
import com.example.myapplication.ui.theme.genresColoLight
import com.example.myapplication.ui.theme.genresColorDarker
import com.example.myapplication.ui.theme.textcolormain


@Composable
@Preview(showBackground = true)
fun gameHeader() {
    Box(
    ) {
        jaggerHeader()
        gameIcon()
    }
}

@Preview(showBackground = true)
@Composable
fun jaggerHeader() {
    Image(
        painter = painterResource(id = R.drawable.jagger),
        contentDescription = "runduck",
        modifier = Modifier.height(300.dp).fillMaxWidth(),
        contentScale = ContentScale.Crop

    )

}

@Preview(showBackground = true)
@Composable
fun gameIcon() {
    Box(modifier = Modifier.offset(24.dp, 270.dp)) {
//        DOTA ICON
        Box(
            modifier = Modifier.zIndex(2f).border(
                BorderStroke(2.dp, Color.DarkGray), RoundedCornerShape(10.dp)
            ).height(100.dp).width(100.dp)

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
            modifier = Modifier.zIndex(2f).offset(120.dp, 40.dp)

        ) {
            Text(
                color = Color.White,
                text = stringResource(R.string.game_name),
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp,
            )
        }
//STARS
        LazyRow(
            modifier = Modifier.zIndex(2f).offset(120.dp, 80.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),

            ) {
            item {
                oneStar(R.drawable.yellowratingstar)
            }
            item {
                oneStar(R.drawable.yellowratingstar)
            }
            item {
                oneStar(R.drawable.yellowratingstar)
            }
            item {
                oneStar(R.drawable.yellowratingstar)
            }
            item {
                oneStar(R.drawable.yellowratingstar)
            }
        }
//        ЧИСЛО ЗАГРУЗОК game_downloads
        Row(
            modifier = Modifier.zIndex(2f).offset(220.dp, 80.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            gameDownloads(R.string.game_downloads)
        }


    }


}


@Preview(showBackground = true)
@Composable
fun gameGenres() {
//ЖАНРЫ
    LazyRow(
        modifier = Modifier.padding(top = 100.dp, start = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),


        ) {
        item {
            oneGenre(R.string.game_genre1)
        }
        item {
            oneGenre(R.string.game_genre2)

        }
        item {
            oneGenre(R.string.game_genre3)
        }
    }

}


@Preview(showBackground = true)
@Composable
fun gameInfo() {
    Column(
        modifier = Modifier.padding(
            start = 24.dp,
            top = 20.dp,
            end = 24.dp,
            bottom = 20.dp,
        )
    ) {
        Text(color = textcolormain, text = stringResource(R.string.About_dota))
    }

}

@Preview(showBackground = true)
@Composable
fun gameDemo() {
    LazyRow(
        modifier = Modifier, horizontalArrangement = Arrangement.spacedBy(4.dp)


    ) {
        item {
            oneImageDemo(R.drawable.dotademo)
        }
        item {
            oneImageDemo(R.drawable.screendazzle)
        }
        item {
            oneImageDemo(R.drawable.screendota32)
        }
    }


}


@Preview(showBackground = true)
@Composable
fun gameComments() {
    Column(modifier = Modifier.padding(24.dp)) {
//        Review & Ratings
        Text(
            color = Color.White,
            text = stringResource(R.string.review),
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
        )
        Row() {
//            RATING
            Box() {
                Text(
                    color = Color.White,
                    text = stringResource(R.string.game_rating),
                    fontWeight = FontWeight.Bold,
                    fontSize = 49.sp,
                )
            }
//            REVIEWS + STARS
            Box() {
                Box(
                    modifier = Modifier.zIndex(2f).offset(25.dp, 35.dp)
                ) {
                    Text(
                        color = textcolormain,
                        text = stringResource(R.string.game_downloads) + " Reviews",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                    )
                }
//                STARS
                Box() {
                    LazyRow(
                        modifier = Modifier.zIndex(2f).offset(25.dp, 15.dp),
                        horizontalArrangement = Arrangement.spacedBy(4.dp),

                        ) {
                        item {
                            oneStar(R.drawable.yellowratingstar)
                        }
                        item {
                            oneStar(R.drawable.yellowratingstar)
                        }
                        item {
                            oneStar(R.drawable.yellowratingstar)
                        }
                        item {
                            oneStar(R.drawable.yellowratingstar)
                        }
                        item {
                            oneStar(R.drawable.yellowratingstar)
                        }
                    }

                }
            }

        }
    }

}

//Comments
@Composable
fun gameReviews(name: String, vrema: String, com: String, fotka: Int) {
    Card(
        modifier = Modifier.background(Color.Transparent).fillMaxWidth().padding(top = 10.dp)


    ) {
        Box(
            modifier = Modifier.background(backgroundColor)
        ) {
            Column(modifier = Modifier.padding(start = 24.dp, end = 24.dp)) {
                Row {
                    Image(
                        painter = painterResource(id = fotka),
                        contentDescription = "null",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(64.dp).clip(CircleShape)
                    )
                    Column(modifier = Modifier.padding(horizontal = 20.dp)) {
                        Box() {
                            Text(
                                text = name,
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                        }
                        Box(modifier = Modifier.padding(top = 10.dp)) {
                            Text(text = vrema, color = textcolormain)
                        }

                    }
                }
                Box(modifier = Modifier.padding(top = 24.dp)) {
                    Text(
                        text = "\"" + com + "\"",
                        color = textcolormain,
                        modifier = Modifier.padding(vertical = 3.dp)
                    )

                }
                Box(
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp).alpha(0.25f)
                ) {
                    Divider(color = textcolormain, thickness = 1.dp)
                }
            }
        }
    }
}


@Composable
fun gameButton(onClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {

        Button(
            onClick = { onClick() },
            modifier = Modifier.padding(vertical = 24.dp).width(240.dp).height(50.dp),
        ) {
            Text("Install")
        }
    }

}
package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.core.view.WindowCompat
import com.example.myapplication.ui.theme.MyApplicationTheme
import org.w3c.dom.Comment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window,false)

        setContent {
            Screen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Screen(){
    val myColor: Color = Color(0xFF050B18)

    Column (modifier = Modifier
        .background(myColor).fillMaxWidth().fillMaxHeight()){

        dotaLogo()
        LazyColumn(

            modifier = Modifier
                .fillMaxSize(),
        ) {
            item {
                dotaHeader()
            }
//            item {
//                dotaLogo()
//            }
            item {
                dotaInfo()
            }
            item {
                dotaDemo()
            }

        }
    }
}
@Composable
fun dotaDemo() {
    LazyRow(
        modifier = Modifier


    ) {
        item {
            Image(

                painter = painterResource(id = R.drawable.dotademo),
                contentDescription = "Runduck",
                contentScale = ContentScale.Crop,
                modifier = Modifier.background(Color.Transparent).height(120.dp).padding(start = 24.dp,end=24.dp),

            )
        }
        item {
            Image(
                painter = painterResource(id = R.drawable.dotademo),
                contentDescription = "Runduck",
                contentScale = ContentScale.Crop,
                modifier = Modifier.background(Color.Transparent).height(120.dp).padding(start = 24.dp,end=24.dp)

            )
        }
    }


}

@Composable
fun dotaHeader() {
    Image(
        painter = painterResource(id = R.drawable.jagger),
        contentDescription = "Runduck",
        modifier = Modifier.height(300.dp).fillMaxWidth(),
        contentScale = ContentScale.Crop

    )
    Box{
        Box(
            modifier = Modifier.zIndex(2f)
                .border(BorderStroke(2.dp, Color.DarkGray)
                    ,RoundedCornerShape(10.dp))
                .height(80.dp).width(80.dp)

        ){
            Image(
                painter = painterResource(id = R.drawable.dota_icon),
                contentDescription = "Runduck",
                contentScale = ContentScale.Crop,
                modifier = Modifier.background(Color.Black).height(80.dp).width(80.dp).padding(15.dp)
            )
        }
    }


}

@Composable
fun dotaLogo() {



}

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











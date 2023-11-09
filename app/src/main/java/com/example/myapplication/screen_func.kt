package com.example.myapplication


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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
        gameHeader()

        gameGenres()

        gameInfo()

        gameDemo()

        gameComments()

        gameReviews(
            name = "Alexander Pako",
            vrema = "July.23.2023",
            com = "Девушка сказала, что если на этом обзоре будет 10 лайков и 5 наград, она купит мне ящик пива, Мужики, выручайте!",
            fotka = R.drawable.awatarfirst
        )
        gameReviews(
            name = "Pablo Escobaro",
            vrema = "July.24.2023",
            com = "Игра замечательная и очень добрая к новичкам... Пока те находятся в меню.\n" +
                    "\n" +
                    "Комьюнити не только положительное, но и обладает навыками телепатии. Они рассказали мне, что на самом деле мой отец - это не мой отец, а мама работает не там где я думал.\n" +
                    "\n" +
                    "Также одним из плюсов является то, что в Dota 2 играет много врачей и они без проблем могут поставить диагноз твоих умственных и физических способностей.",
            fotka = R.drawable.awatartwo
        )
        gameReviews(
            name = "Dota_Enjoyeer322",
            vrema = "July.24.2023",
            com = "Я 54-летний отец, вероятно, один из старейших людей, играющих в эту игру.\n" +
                    "Я отец-одиночка для моего сына, которому сейчас 14 лет. Мой сын недавно начал играть в доту.\n" +
                    "Менее чем за неделю он уже наиграл более 20 часов.\n" +
                    "Это было ужасно для меня, потому что мне уже было достаточно тяжело проводить время с сыном.\n" +
                    "потому что он всегда был со своими друзьями или смотрел видео на YouTube.\n" +
                    "Поэтому я решил создать аккаунт Steam, чтобы играть с сыном. Я начал играть, но это был мой первый раз, когда я играл в видеоигру с 90-х годов, поэтому я был довольно потерян. Я попросил сына о помощи, и мы вместе провели несколько часов, играя в эту игру.\n" +
                    "Мне это понравилось, так как это было лучшее время, которое я провел со своим сыном с тех пор, как умерла моя жена. Игра в видеоигры напомнила мне, что во всем есть удовольствие, и это снова сблизило меня и моего сына, и теперь мы фактически проводим время вместе вне дома.",
            fotka = R.drawable.ea93a7525f30a3369439e0e41e847fb2
        )
//        отступ снизу для читаемости последнего комментария
        footer(80)
    }
//    кнопка фикисруется внизу экрана без скрола, отступ, чтобы кнопку не перекрывали цифровые кнопки некоторых телефонов
    Box(
        modifier = Modifier.fillMaxHeight().padding(bottom = 30.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        gameButton(onClick = {})
    }

}
package com.example.belajarandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.belajarandroid.ui.theme.BelajarAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BelajarAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HeaderPage()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = Color.Magenta) {
        Row {
            Column {
                Text(
                    text = "Hello $name!",
                    modifier = Modifier.padding(8.dp),
                    fontSize = 24.sp
                )
                Text(text = "Apa kabar", modifier = Modifier.padding(8.dp))
            }
            Text(text = "Selamat", modifier = Modifier.padding(8.dp))
            Text(text = "Pagi", modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun HeaderImage() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
    )
}


@Composable
fun HeaderPage() {
    Column {
        HeaderImage()
        Text(
            text = stringResource(R.string.header_title),
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = stringResource(R.string.first_paraghraph),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.second_paraghraph),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthDayCardPreview() {
    BelajarAndroidTheme {
        HeaderImage()
    }
}
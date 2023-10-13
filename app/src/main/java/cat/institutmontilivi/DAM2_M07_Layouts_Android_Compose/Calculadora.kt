package cat.institutmontilivi.DAM2_M07_Layouts_Android_Compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cat.institutmontilivi.DAM2_M07_Layouts_Android_Compose.ui.theme.DAM2_M07_Layouts_Android_ComposeTheme

class Calculadora : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DAM2_M07_Layouts_Android_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CalculadoraComposable()
                }
            }
        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun CalculadoraComposable() {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Resultado()
        ColumnTeclas()

    }

}

@Composable
fun ColumnTeclas() {

    Column (

    )
    {
        Column (
            modifier = Modifier
                .weight(0.75F)
        )
        {
            // 1a linea de teclas
            Row (
                modifier = Modifier
                    .weight(0.25F)
            )
            {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "1")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "2")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "3")
                }
            }

            // 2a linea de teclas
            Row (
                modifier = Modifier
                    .weight(0.25F)
            )
            {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "4")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "5")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "6")
                }
            }

            // 3a linea de teclas
            Row (
                modifier = Modifier
                    .weight(0.25F)
            )
            {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "7")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "8")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "9")
                }
            }

            // 4a linea, el Zero
            Row (
                modifier = Modifier
                    .weight(0.25F)
            )
            {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "0")
                }
            }
        }




    }

}

@Composable
fun Resultado() {

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray)
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End
    )
    {
        Text(text = "1.10",
            textAlign = TextAlign.End,
            color = Color.White
        )
    }
}
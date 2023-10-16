package cat.institutmontilivi.DAM2_M07_Layouts_Android_Compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cat.institutmontilivi.DAM2_M07_Layouts_Android_Compose.ui.theme.DAM2_M07_Layouts_Android_ComposeTheme

class Calculadora : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DAM2_M07_Layouts_Android_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
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

    Column( //primera columna
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize(1f)

    ){
        Row( //row1 dentro de la primera columna
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(15.dp)
                .background(Color.LightGray)
            ,
            horizontalArrangement = Arrangement.End

        ){
            Text(text="1.10",
                color = Color(0xFFC26E09),
                fontSize=30.sp,
                modifier = Modifier
                    .padding(5.dp)
            )
        }
        Row( // row2 dentro de la primera columna
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)

        )  {

            Column( // columna 1 dentro de la row2
                modifier = Modifier
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Row(
                    modifier = Modifier
                        .weight(1f)

                    ,
                    horizontalArrangement = Arrangement.Center,


                    ){
                    Column(
                        modifier = Modifier
                            .weight(1f)
                    ){

                        Button(onClick = {}, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(10.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xFFC26E09)),
                            shape=RectangleShape)
                        {
                            Text(text="1", color = Color.White)
                        }
                        Button(onClick = {}, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(10.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xFFC26E09)),
                            shape=RectangleShape){
                            Text(text="4", color = Color.White)
                        }
                        Button(onClick = {}, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(10.dp), colors = ButtonDefaults.buttonColors(Color(0xFFC26E09)),
                            shape=RectangleShape){
                            Text(text="7", color = Color.White)
                        }
                    }
                    Column(modifier = Modifier
                            .background(Color.DarkGray)
                            .weight(1f)
                    ){

                        Button(onClick = {}, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(10.dp), colors = ButtonDefaults.buttonColors(Color(0xFFC26E09)),
                            shape=RectangleShape){
                            Text(text="2", color = Color.White)
                        }
                        Button(onClick = {}, modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .padding(10.dp), colors = ButtonDefaults.buttonColors(Color(0xFFC26E09)),
                            shape=RectangleShape){
                            Text(text="5", color = Color.White)
                        }
                        Button(onClick = {}, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(10.dp), colors = ButtonDefaults.buttonColors(Color(0xFFC26E09)),
                            shape=RectangleShape){
                            Text(text="8", color = Color.White)
                        }
                    }
                    Column(
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .weight(1f)
                    ){

                        Button(onClick = {}, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(10.dp), colors = ButtonDefaults.buttonColors(Color(0xFFC26E09)),
                            shape=RectangleShape){
                            Text(text="3", color = Color.White)
                        }
                        Button(onClick = {}, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(10.dp), colors = ButtonDefaults.buttonColors(Color(0xFFC26E09)),
                            shape=RectangleShape){
                            Text(text="6", color = Color.White)
                        }
                        Button(onClick = {}, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(10.dp), colors = ButtonDefaults.buttonColors(Color(0xFFC26E09)),
                            shape=RectangleShape){
                            Text(text="9", color = Color.White)
                        }
                    }


                }
                Row( // row del número 0
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(0.25f)
                ){
                    Button(onClick = {}, modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .padding(10.dp), colors = ButtonDefaults.buttonColors(Color(0xFFC26E09)),
                        shape=RectangleShape){
                        Text(text="0", color = Color.White)
                    }
                }

            }

            Column( // columna 2 dentro de la row2, botones de la derecha (verticales)
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(.25f)
                    .background(Color.DarkGray)
            ){
                Button(onClick = {}, modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(10.dp), colors = ButtonDefaults.buttonColors(Color(0xFFC26E09)),
                    shape=RectangleShape){
                    Text(text="C", color = Color.White)
                }
                Button(onClick = {}, modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(10.dp), colors = ButtonDefaults.buttonColors(Color(0xFFC26E09)),
                    shape=RectangleShape){
                    Text(text="+", color = Color.White)
                }
                Button(onClick = {}, modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(10.dp), colors = ButtonDefaults.buttonColors(Color(0xFFC26E09)),
                    shape=RectangleShape){
                    Text(text="=", color = Color.White)
                }
            }
        }
    }
}


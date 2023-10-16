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
import cat.institutmontilivi.DAM2_M07_Layouts_Android_Compose.ui.theme.DAM2_M07_Layouts_Android_ComposeTheme

class LiniaDeBotons : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DAM2_M07_Layouts_Android_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Botons()
                }
            }
        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun Botons() {
    Column(
        modifier = Modifier
            .background(Color.DarkGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Row(
            modifier = Modifier
                .padding(18.dp)
                .background(Color.LightGray)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Boto("Primer\n botó")
            Boto("Segon\n botó")
            Boto("Tercer\n botó")
        }
    }
}


@Composable
fun Boto(nomBoto:String) {
    Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .padding(5.dp),
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(Color(0xFFC26E09))

    ) {
        Text(text = nomBoto,
            modifier = Modifier,
            textAlign = TextAlign.Center,
            color = Color.DarkGray
        )
    }
}


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
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cat.institutmontilivi.DAM2_M07_Layouts_Android_Compose.ui.theme.DAM2_M07_Layouts_Android_ComposeTheme

class Formulari : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DAM2_M07_Layouts_Android_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FormulariColumn()
                }
            }
        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun FormulariColumn() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Text(
            text = "Nom(*)",
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .background(MaterialTheme.colorScheme.onPrimary)
        )
        Text(
            text = "Cognom(*)",
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .background(MaterialTheme.colorScheme.onPrimary)
        )
        Text(
            text = "Correu Electrònic(*)",
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .background(MaterialTheme.colorScheme.onPrimary)
        )
        Text(
            text = "Missatge(*)",
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5F)
                .padding(15.dp)
                .background(MaterialTheme.colorScheme.onPrimary)
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Checkbox(
                checked = false,
                onCheckedChange = null
            )
            Text(text="Subscriu-me per correu",
                modifier = Modifier
                    .weight(0.8F)
                    .padding(15.dp),
            )
        }
        Text(
            text = "URL del servidor(*)",
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .background(MaterialTheme.colorScheme.onPrimary)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = {}, modifier = Modifier,
                shape = RectangleShape,
                colors =
                ButtonDefaults.buttonColors
                    (Color.LightGray)
            ) {
                Text("Confirma", color = Color.Black)
            }
            Button(
                onClick = {}, modifier = Modifier,
                shape = RectangleShape,
                colors =
                ButtonDefaults.buttonColors
                    (Color.LightGray)
            ) {
                Text("Rebutja", color = Color.Black)
            }
        }


    }

}
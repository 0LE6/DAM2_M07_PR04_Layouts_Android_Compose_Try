package cat.institutmontilivi.DAM2_M07_Layouts_Android_Compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import java.util.Random

class BotonsColors : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DAM2_M07_Layouts_Android_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BotonsAmbColors()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BotonsAmbColors() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Row(modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.onPrimaryContainer)
        ) {
            Column(modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .weight(0.7F)
                .background(MaterialTheme.colorScheme.onPrimaryContainer)
            ) {
                Text(text = "Paraula", color = Color.White)
                Text(text = "Paraula (max 20 lletres)",
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth()
                )
                Text(text = "Traducció", color = Color.White)
                Text(text = "Paraula (max 20 lletres)",
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth()
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.secondary),
                modifier = Modifier
                    .weight(0.3F)
                    .fillMaxWidth()
            )
            {
                Text("Esborra")
            }
        }
        Column(modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.onPrimaryContainer),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text("Afegeix · Edita · Esborra",
                textAlign = TextAlign.Center,
                color = Color.White
            )
            LazyColumn {
                items(25) { index ->
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color.Red),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Botón $index", color = Color.White)
                    }
                }
            }
        }

    }
}


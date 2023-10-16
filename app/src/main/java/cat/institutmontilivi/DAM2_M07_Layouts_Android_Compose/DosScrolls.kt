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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
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

class DosScrolls : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DAM2_M07_Layouts_Android_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray
                ) {
                    Column2Scrolls()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Column2Scrolls() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color.DarkGray)
        .padding(10.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Dues columnes", textAlign = TextAlign.Center)

        LazyRow(){
            items(12){
                Button(onClick={},
                    colors = ButtonDefaults.buttonColors(Color(0xFFC26E09))
                ) {
                    Text(text="Un tema")
                }
            }
        }
        // Linea que continene 2 columnas
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray),
            horizontalArrangement = Arrangement.SpaceAround

        ){
            LazyColumn(modifier = Modifier
                .fillMaxWidth(0.5F)
                .padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                items(25){
                    Text(text="Article ${it+1}", textAlign = TextAlign.Center)
                    Text(text="Lorem ipsum dolor sit amet, consectetur adipiscing elit. In in magna finibus, fringilla ligula ultrices, vestibulum arcu. In in porttitor ex, eget euismod augue. Ut ac viverra nibh, eu volutpat erat. Donec sed tincidunt neque. Nulla pharetra quam nulla, ut laoreet arcu posuere et. Maecenas vulputate quis nisl vel pretium. In hac habitasse platea dictumst. Donec iaculis dui ac congue semper. Aliquam ullamcorper felis nec elit lacinia ultricies. Quisque at sem maximus, consectetur eros mattis, tincidunt augue.", textAlign = TextAlign.Justify)
                    Text(text="----------", textAlign = TextAlign.Center)
                }
            }

            LazyColumn(modifier = Modifier
                .weight(0.5F)
                .padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                items(25){
                    Text(text="Article ${it+26}")
                    Text(text="Lorem ipsum dolor sit amet, consectetur adipiscing elit. In in magna finibus, fringilla ligula ultrices, vestibulum arcu. In in porttitor ex, eget euismod augue. Ut ac viverra nibh, eu volutpat erat. Donec sed tincidunt neque. Nulla pharetra quam nulla, ut laoreet arcu posuere et. Maecenas vulputate quis nisl vel pretium. In hac habitasse platea dictumst. Donec iaculis dui ac congue semper. Aliquam ullamcorper felis nec elit lacinia ultricies. Quisque at sem maximus, consectetur eros mattis, tincidunt augue.")
                    Text(text="----------")
                }
            }

        }


    }
}
package cat.institutmontilivi.DAM2_M07_Layouts_Android_Compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cat.institutmontilivi.DAM2_M07_Layouts_Android_Compose.ui.theme.DAM2_M07_Layouts_Android_ComposeTheme

class Dibuix : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DAM2_M07_Layouts_Android_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DibuixColumn()
                }
            }
        }
    }
}

@Preview
@Composable
fun DibuixColumn() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
    ){
        Image(painter = painterResource(id = R.drawable.android), contentDescription=null,
            modifier = Modifier
                .padding(10.dp)
                .weight(0.5f)
                .scale(1F)
                .fillMaxSize()
        )
        LazyColumn(modifier = Modifier
            .weight(0.5F)
            .padding(10.dp)){
            items(1){
                Text(text="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifend pulvinar dui, non vehicula nisl vulputate non. Vestibulum fermentum imperdiet tortor non hendrerit. Praesent non velit sit amet nisi molestie eleifend. Vestibulum magna felis, volutpat at varius aliquam, lacinia ac arcu. Phasellus feugiat ullamcorper neque, nec sagittis quam luctus vel. Fusce dui orci, varius id diam malesuada, volutpat volutpat est. Sed interdum faucibus magna vel ultricies. Cras gravida iaculis lacinia. Praesent mollis pulvinar purus, eget fringilla ex facilisis non. Nunc venenatis tellus a velit pulvinar, ut accumsan lectus posuere. Praesent at neque nec ipsum egestas tincidunt vitae sit amet magna. Nam id imperdiet sapien, a lobortis augue. Pellentesque blandit laoreet luctus. Sed vitae neque urna.\n" +
                        "\n" +
                        "Duis varius leo in enim fringilla, vitae iaculis dui posuere. Cras congue lectus a est dictum ultricies. Praesent eros libero, varius tristique orci et, egestas elementum urna. Duis auctor, quam pulvinar feugiat gravida, velit lectus vehicula elit, in iaculis lectus metus sit amet diam. Aliquam porta purus lobortis, cursus arcu ac, finibus diam. Suspendisse elementum nec lectus non euismod. Phasellus libero erat, luctus et tincidunt mattis, elementum sit amet eros. Donec id lacus metus. Nulla eleifend dapibus ipsum, sed mollis ligula pharetra id. Sed suscipit nunc a porta pellentesque. Integer vel fringilla dui. Ut augue lorem, volutpat in orci ac, dapibus feugiat lorem. Phasellus sed dolor a massa efficitur consectetur vel nec sapien.\n" +
                        "\n" +
                        "Morbi non consequat eros, vel tristique risus. Phasellus hendrerit tempor orci tempor tristique. Integer ornare ullamcorper cursus. Pellentesque tempor iaculis metus, in rhoncus quam dignissim in. In eget magna viverra mauris feugiat sollicitudin pretium vel risus. Morbi ac quam ac turpis accumsan venenatis. Curabitur accumsan nibh lorem, eu facilisis ex consectetur at. Praesent dignissim tortor ac ornare tristique. In hac habitasse platea dictumst. Nunc ut sem nec mi mattis hendrerit. Curabitur tempor magna non aliquam porta. Pellentesque bibendum sollicitudin nunc, eget hendrerit metus pulvinar non. Donec vel risus felis.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifend pulvinar dui, non vehicula nisl vulputate non. Vestibulum fermentum imperdiet tortor non hendrerit. Praesent non velit sit amet nisi molestie eleifend. Vestibulum magna felis, volutpat at varius aliquam, lacinia ac arcu. Phasellus feugiat ullamcorper neque, nec sagittis quam luctus vel. Fusce dui orci, varius id diam malesuada, volutpat volutpat est. Sed interdum faucibus magna vel ultricies. Cras gravida iaculis lacinia. Praesent mollis pulvinar purus, eget fringilla ex facilisis non. Nunc venenatis tellus a velit pulvinar, ut accumsan lectus posuere. Praesent at neque nec ipsum egestas tincidunt vitae sit amet magna. Nam id imperdiet sapien, a lobortis augue. Pellentesque blandit laoreet luctus. Sed vitae neque urna.\n" +
                        "\n" +
                        "Duis varius leo in enim fringilla, vitae iaculis dui posuere. Cras congue lectus a est dictum ultricies. Praesent eros libero, varius tristique orci et, egestas elementum urna. Duis auctor, quam pulvinar feugiat gravida, velit lectus vehicula elit, in iaculis lectus metus sit amet diam. Aliquam porta purus lobortis, cursus arcu ac, finibus diam. Suspendisse elementum nec lectus non euismod. Phasellus libero erat, luctus et tincidunt mattis, elementum sit amet eros. Donec id lacus metus. Nulla eleifend dapibus ipsum, sed mollis ligula pharetra id. Sed suscipit nunc a porta pellentesque. Integer vel fringilla dui. Ut augue lorem, volutpat in orci ac, dapibus feugiat lorem. Phasellus sed dolor a massa efficitur consectetur vel nec sapien.\n" +
                        "\n" +
                        "Morbi non consequat eros, vel tristique risus. Phasellus hendrerit tempor orci tempor tristique. Integer ornare ullamcorper cursus. Pellentesque tempor iaculis metus, in rhoncus quam dignissim in. In eget magna viverra mauris feugiat sollicitudin pretium vel risus. Morbi ac quam ac turpis accumsan venenatis. Curabitur accumsan nibh lorem, eu facilisis ex consectetur at. Praesent dignissim tortor ac ornare tristique. In hac habitasse platea dictumst. Nunc ut sem nec mi mattis hendrerit. Curabitur tempor magna non aliquam porta. Pellentesque bibendum sollicitudin nunc, eget hendrerit metus pulvinar non. Donec vel risus felis."
                    ,

                    color = Color.White
                )

            }
        }
    }
}
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.segundochallenge.R
import com.example.segundochallenge.data.ItemProductHorizontal

@Composable
fun ItemFavorites(navController: NavHostController) {
    var lista = listOf(
        ItemProductHorizontal(
            stringResource(R.string.card_title_text),
            stringResource(R.string.card_price_text),
            R.drawable.botas
        ),
        ItemProductHorizontal("Zapatillas", "$1500", R.drawable.zapatilla_blanca),
        ItemProductHorizontal("Sandalias", "$800", R.drawable.sandalias_marron)
    )
    Scaffold(
        topBar = {
            TopBarComponent(stringResource(R.string.favourites))
        },
        bottomBar = {
            BottomBarComponent {
                // acción del bottom bar
            }
        },
        containerColor = Color(0xFFF4EDEB)

    ) { paddingValues ->
        // paddingValues asegura que el contenido no quede debajo del BottomBar
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            //CardItem(stringResource(R.string.card_title_text),stringResource(R.string.card_price_text) ,stringResource(R.string.card_description_text))
            LazyColumn {
                items(lista) { itemProducts ->
                    CardHorizontal(
                        itemProducts.titulo,
                        itemProducts.precio,
                        itemProducts.imagen
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { /* Acción del botón */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9A4521)),
                    shape = RoundedCornerShape(50)
                ) {
                    Text(
                        text = stringResource(R.string.buy_button_mas_text),
                        color = Color.White
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ItemFavoritesPreview() {
    val navController = rememberNavController()
    ItemFavorites(navController)
}
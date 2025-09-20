import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.segundochallenge.R
import com.example.segundochallenge.data.ItemProducts

@Composable
fun ItemList(navController:NavHostController) {
    var lista = listOf(ItemProducts(stringResource(R.string.card_title_text), stringResource(R.string.card_price_text), stringResource(R.string.card_description_text), R.drawable.botas,navController),
        ItemProducts("Zapatillas", "$1500", "Zapatillas deportivas blancas adidas. Ultraboost 2025", R.drawable.zapatilla_blanca,navController),
        ItemProducts("Sandalias", "$800", "Sandalias de cuero marrones. Ideales para la primavera/verano", R.drawable.sandalias_marron,navController),
        ItemProducts("Mocasines azules", "$1200", "Mocasines de gamuza azul. Solo para exigentes", R.drawable.mocasines_azules,navController),
        ItemProducts("Botines", "$1300", "Botines de cuero. Diseñado para alto rendimiento", R.drawable.botin,navController))
    Scaffold(
        topBar = {
            TopBarComponent(stringResource(R.string.top_bar_shop_list))
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
                items(lista){itemProducts->
                    CardItem(itemProducts.titulo,itemProducts.precio,itemProducts.descripcion, itemProducts.imagen,navController)

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemListPreview() {
    val navController = rememberNavController()
    ItemList(navController)
}
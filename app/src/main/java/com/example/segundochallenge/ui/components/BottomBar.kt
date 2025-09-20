import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.segundochallenge.R

@Composable
fun BottomBarComponent(
    onHomeClick: () -> Unit = {},
    onSearchClick: () -> Unit = {},
    onCartClick: () -> Unit = {},
    onProfileClick: () -> Unit = {}
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = androidx.compose.foundation.layout.Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
    )
    {
        IconButton(onClick = onHomeClick) {
            Image(
                painter = painterResource(id = R.drawable.casa),
                contentDescription = "Home",
                modifier = Modifier.size(24.dp)
            )
        }

        IconButton(onClick = onSearchClick) {
            Image(
                painter = painterResource(id = R.drawable.lupa),
                contentDescription = "Search",
                modifier = Modifier.size(28.dp)
            )
        }

        IconButton(onClick = onCartClick) {
            Image(
                painter = painterResource(id = R.drawable.carro),
                contentDescription = "Cart",
                modifier = Modifier.size(28.dp)
            )
        }

        IconButton(onClick = onProfileClick) {
            Image(
                painter = painterResource(id = R.drawable.perfil),
                contentDescription = "Profile",
                modifier = Modifier.size(28.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    BottomBarComponent()

}

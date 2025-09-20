import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.segundochallenge.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarComponent(
    title: String,
    onMenuClick: () -> Unit = {},
    onProfileClick: () -> Unit = {}
) {
    CenterAlignedTopAppBar(
        modifier = Modifier.fillMaxWidth(),
        title = {
            Text(
                text = title,
                fontSize = 18.sp,
                color = Color.Black
            )
        },
        navigationIcon = {
            Image(
                painter = painterResource(id = R.drawable.icon_menu),
                contentDescription = "Menu",
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .size(24.dp)
                    .clickable { onMenuClick() }
            )
        },
        actions = {
            Image(
                painter = painterResource(id = R.drawable.icon_user),
                contentDescription = "Profile",
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .size(28.dp)
                    .clickable { onProfileClick() }
            )
        },

        )
}


@Preview(showBackground = true)
@Composable
fun TopBarComponentPreview() {
    TopBarComponent(
        title = stringResource(R.string.top_bar_shop_list)
    )
}

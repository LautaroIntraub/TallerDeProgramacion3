import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.segundochallenge.R

@Composable
fun SettingsScreen() {
    Scaffold(
        topBar = {
            TopBarComponent(stringResource(R.string.settings))
        },
        bottomBar = {
            BottomBarComponent {
                // acción del bottom bar
            }
        },
        containerColor = Color(0xFFF4EDEB)
    ) { paddingValues ->
        AccountSettingsScreen()
    }
}

@Preview (showBackground = true)
@Composable
fun SettingsScreenPreview() {
    SettingsScreen()
}
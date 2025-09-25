import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.segundochallenge.R
import com.example.segundochallenge.ui.components.ProfileCard

@Composable
fun Profile() {
    Scaffold(
        topBar = {
            TopBarComponent(stringResource(R.string.profile))
        },
        bottomBar = {
            BottomBarComponent {
                // acción del bottom bar
            }
        },
        containerColor = Color(0xFFF4EDEB)
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfileCard()
            ProfileForm()
        }
    }
}

@Preview
@Composable
fun ProfilePreview() {
    Profile()
}
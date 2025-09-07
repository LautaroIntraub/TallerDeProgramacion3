
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.primerapp.R
import com.example.primerapp.ui.screens.LoginScreen

@Composable
fun SocialMediaComponent(
    ) {
    Row(
        modifier = Modifier.wrapContentHeight().padding(horizontal = 80.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)

    ) {
        Button(
            onClick = { /* acción */ },
            modifier = Modifier.size(50.dp),
            shape = RoundedCornerShape(12.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8352FF))

        ) {
            Image(
                painter = painterResource(R.drawable.google), // tu imagen
                contentDescription = stringResource(R.string.social_media_google),
                modifier = Modifier.fillMaxSize().padding(14.dp)
            )
        }

        Button(
            onClick = { /* acción */ },
            modifier = Modifier
                .size(50.dp),
            shape = RoundedCornerShape(12.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8352FF))
        ) {
            Image(
                painter = painterResource(R.drawable.facebook),
                contentDescription = stringResource(R.string.social_media_facebook),
                modifier = Modifier.fillMaxSize().padding(14.dp)
            )
        }

        Button(
            onClick = { /* acción */ },
            modifier = Modifier
                .size(50.dp),
            shape = RoundedCornerShape(12.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8352FF))
        ) {
            Image(
                painter = painterResource(R.drawable.apple),
                contentDescription = stringResource(R.string.social_media_apple),
                modifier = Modifier.fillMaxSize().padding(14.dp)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun SocialMediaComponentPreview() {
    LoginScreen(Modifier.fillMaxSize())
}

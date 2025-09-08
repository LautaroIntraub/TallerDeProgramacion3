
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primerapp.R


@Composable
fun SignButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
){
    Button(
        onClick = onClick,
        modifier = modifier.height(50.dp).fillMaxSize().padding(horizontal = 80.dp),
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF662AFF),
            contentColor = Color.White
        )
    ) {
        Text(text, fontSize = 18.sp)
    }
}

@Preview
@Composable
fun SignButtonPreview() {
    SignButton(
        modifier = Modifier,
        text = stringResource(R.string.sign_in_btn)
    ) {

    }
}

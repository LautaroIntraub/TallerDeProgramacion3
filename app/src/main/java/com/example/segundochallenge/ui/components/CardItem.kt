import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.segundochallenge.R


@Composable
fun CardItem(titulo: String,precio:String,descripcion:String,imagen:Int,navController:NavHostController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier.padding(25.dp)
        ) {
            Image(
                painter = painterResource(imagen),
                contentDescription = stringResource(R.string.card_image_description),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(200.dp) // altura fija para que quede más parecido
            )
            Spacer(modifier = Modifier.size(14.dp))
            Text(
                text = titulo,
                fontFamily = FontFamily(Font(R.font.roboto)),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = precio,
                fontFamily = FontFamily(Font(R.font.roboto)),
                fontSize = 14.sp,
                color = Color.DarkGray.copy(alpha = 0.7f),
            )
            Spacer(modifier = Modifier.size(25.dp))
            Text(
                text = descripcion,
                fontFamily = FontFamily(Font(R.font.roboto_medium)),
                fontSize = 12.sp,
                color = Color.DarkGray.copy(alpha = 0.6f)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            OutlinedButton(
                onClick = { /* TODO: acción */ },
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color(0xFF9A4521),
                    containerColor = Color.White
                )

            ) {
                Text(stringResource(R.string.add_to_favourite_button_text))
            }
            Spacer( modifier = Modifier.size(8.dp))
            OutlinedButton(
                onClick = { navController.navigate("itemDetail") },
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.White,
                    containerColor = Color(0xFF9A4521)
                )
            ) {
                Text(stringResource(R.string.buy_button_text))
            }
            Spacer( modifier = Modifier.size(13.dp))
        }
        Spacer( modifier = Modifier.size(16.dp) )
    }
}


@Preview(showBackground = true)
@Composable
fun CardPreview() {
    val navController = rememberNavController()
    CardItem(stringResource(R.string.card_title_text),stringResource(R.string.card_price_text) ,stringResource(R.string.card_description_text), R.drawable.botas, navController
    )
}
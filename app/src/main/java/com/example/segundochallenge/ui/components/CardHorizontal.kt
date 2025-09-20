import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.example.segundochallenge.R


@Composable
fun CardHorizontal(
    titulo: String,
    precio: String,
    imagen: Int,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp), // altura del Card
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(), // ocupa todo el Card
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Círculo con número
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .padding(start = 8.dp) // un pequeño margen si querés
                    .background(Color(0xFF9A4521), shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "1",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            // Columna con título y precio
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
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
                    color = Color.DarkGray.copy(alpha = 0.7f)
                )
            }

            // Imagen pegada al borde derecho
            Image(
                painter = painterResource(id = imagen),
                contentDescription = stringResource(R.string.card_image_description),
                modifier = Modifier
                    .height(100.dp) // altura fija
                    .width(100.dp), // ancho fijo
                contentScale = ContentScale.Crop
            )
        }
    }

        Spacer(modifier = Modifier.size(25.dp))
    }




@Preview(showBackground = true)
@Composable
fun CardHorizontalPreview() {
    CardHorizontal(
        stringResource(R.string.card_title_text),
        stringResource(R.string.card_price_text),
        R.drawable.zapatilla_blanca
    )
}
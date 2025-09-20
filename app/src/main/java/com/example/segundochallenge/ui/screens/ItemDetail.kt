import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.segundochallenge.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemDetailScreen(
    modifier: Modifier = Modifier,
    sizes: List<String> = listOf("38", "39", "40", "41", "42"),
    onBack: () -> Unit = {},
    onBuy: (String, String) -> Unit = { _, _ -> }
) {
    var expanded by remember { mutableStateOf(false) }
    var selectedSize by remember { mutableStateOf("Input") }
    var quantity by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopBarComponent(stringResource(R.string.card_title_text))
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
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                // Select size
                Text(
                    stringResource(R.string.select_size),
                    fontFamily = FontFamily(Font(R.font.roboto_regular)),
                    fontSize = 22.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    textAlign = TextAlign.Center
                )
                ExposedDropdownMenuBox(
                    expanded = expanded,
                    onExpandedChange = { expanded = !expanded }
                ) {
                    TextField(
                        value = selectedSize,
                        onValueChange = {},
                        readOnly = true,
                        label = { Text("Label") },
                        trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded) },
                        modifier = Modifier
                            .menuAnchor()
                            .fillMaxWidth()
                    )
                    ExposedDropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false }
                    ) {
                        sizes.forEach { size ->
                            DropdownMenuItem(
                                text = { Text(size) },
                                onClick = {
                                    selectedSize = size
                                    expanded = false
                                }
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))

                // Count of product
                Text(
                    stringResource(R.string.count_of_product),
                    fontFamily = FontFamily(Font(R.font.roboto_regular)),
                    fontSize = 22.sp,
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                TextField(
                    value = quantity,
                    onValueChange = { quantity = it },
                    label = { Text("Label") },
                    modifier = Modifier.fillMaxWidth()
                )
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                OutlinedButton(
                    onClick = onBack,
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = Color(0xFF9A4521)
                    )
                ) {
                    Text("Back")
                }
                Button(
                    onClick = { onBuy(selectedSize, quantity) },
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF9A4521)
                    )
                ) {
                    Text("Buy", color = Color.White)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemDetailPreview() {
    ItemDetailScreen()
}
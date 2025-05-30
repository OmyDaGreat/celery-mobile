package omydagreat.github.io.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.navigation.Navigator
import omydagreat.github.io.util.Body2
import omydagreat.github.io.util.Heading4
import omydagreat.github.io.util.ThemedButton
import omydagreat.github.io.util.gate

/**
 * Composable function for the Home screen.
 *
 * @param navi The Navigator instance for navigation.
 * @param detailsRoute The route to navigate to the Details screen.
 * @param stockRoute The route to navigate to the Stocks screen.
 */
@Composable
fun HomeScreen(navi: Navigator, detailsRoute: String, stockRoute: String) = Box(
  modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
) {
  Column(horizontalAlignment = Alignment.CenterHorizontally) {
    Heading4(text = "This is the Home Screen")
    Spacer(modifier = Modifier.height(16.dp))
    ThemedButton(onClick = { navi gate detailsRoute }) {
      Body2("Go to Details")
    }
    Spacer(modifier = Modifier.height(16.dp))
    ThemedButton(onClick = { navi gate stockRoute }) {
      Body2("Go to Stock")
    }
  }
}

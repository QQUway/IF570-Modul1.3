import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import id.ac.umn.stateinjetpackcompose.StatefulCounter
import id.ac.umn.stateinjetpackcompose.WaterCounter

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    WaterCounter(modifier)
    StatefulCounter(modifier)
}

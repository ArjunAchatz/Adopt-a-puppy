package com.example.adopt_a_pup

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PuppyListItem(
    puppy: Puppy,
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    CoilImage(
        modifier = modifier
            .height(300.dp)
            .clickable { navController.navigate(Navigation.Detail.getRouteForPuppy(puppy.id)) },
        data = puppy.imageUrl,
        contentDescription = "Picture of ${puppy.name}",
        contentScale = ContentScale.Crop,
        fadeIn = true,
    )
}
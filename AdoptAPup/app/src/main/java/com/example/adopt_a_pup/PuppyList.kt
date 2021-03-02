package com.example.adopt_a_pup

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun PuppyList(
    puppies: List<Puppy>,
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    LazyColumn {
        items(puppies) { puppy ->
            PuppyListItem(puppy, navController)
        }
    }
}
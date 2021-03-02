package com.example.adopt_a_pup

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.adopt_a_pup.ui.theme.AdoptAPupTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdoptAPupTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MainComposable()
                }
            }
        }
    }
}

@Composable
fun MainComposable() {
    val puppies = PuppyRepo.puppies

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Navigation.List.route) {
        composable(route = Navigation.List.route) {
            PuppyList(puppies = puppies, navController = navController)
        }
        composable(route = Navigation.Detail.route) { navBackStackEntry ->
            PuppyDetails(
                navBackStackEntry.arguments?.getString(Navigation.Detail.puppyIdArg)
                    ?: error("No argument passed")
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AdoptAPupTheme {
        MainComposable()
    }
}
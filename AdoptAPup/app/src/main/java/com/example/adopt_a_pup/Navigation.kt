package com.example.adopt_a_pup

sealed class Navigation {

    object List : Navigation() {
        const val route = "Puppy"
    }

    object Detail : Navigation() {

        const val puppyIdArg = "puppyId"
        const val route = "Puppy/{$puppyIdArg}"

        fun getRouteForPuppy(id: String) = route.replace("{${Navigation.Detail.puppyIdArg}}", id)
    }
}
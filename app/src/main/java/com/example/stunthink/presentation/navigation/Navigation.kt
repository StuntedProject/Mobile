package com.example.stunthink.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.stunthink.presentation.sign_in.SignInScreen
import com.example.stunthink.presentation.sign_up.SignUpScreen
import com.example.stunthink.presentation.welcome.WelcomeScreen

@Composable
fun ApplicationNavHost(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = ScreenRoute.Welcome.route
    ) {
        composable(
            route = ScreenRoute.Welcome.route
        ) {
            WelcomeScreen(navController = navController)
        }
        composable(
            route = ScreenRoute.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }
        composable(
            route = ScreenRoute.SignIn.route
        ) {
            SignInScreen(navController = navController)
        }
    }
}
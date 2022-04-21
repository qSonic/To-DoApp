package com.example.to_doapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.to_doapp.ui.screens.aboutFlow.AboutScreen
import com.example.to_doapp.ui.screens.myDayFlow.MyDayScreen
import com.example.to_doapp.ui.screens.tasksFlow.TasksScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationItem.MyDay.route) {
        composable(NavigationItem.MyDay.route) {
            MyDayScreen()
        }
        composable(NavigationItem.Tasks.route) {
            TasksScreen()
        }
        composable(NavigationItem.About.route) {
            AboutScreen()
        }
    }
}
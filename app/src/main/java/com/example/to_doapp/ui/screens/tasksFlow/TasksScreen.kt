package com.example.to_doapp.ui.screens.tasksFlow

import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.FabPosition
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun TasksScreen() {
    TaskContent()
}

@Composable
fun TaskContent() {
        Text(text = "Tasks")
}
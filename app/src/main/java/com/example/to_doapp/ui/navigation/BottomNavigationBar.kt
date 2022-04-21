package com.example.to_doapp.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
// ento xaker senya :) anton nemnogo lox
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        NavigationItem.MyDay,
        NavigationItem.Tasks,
        NavigationItem.About
    )
    
    BottomAppBar(
        cutoutShape = CircleShape
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            val title = stringResource(id = item.titleId)
            BottomNavigationItem(
                icon = { Icon(
                    painter = painterResource(id = item.iconId),
                    contentDescription = title
                )},
                label = { Text(text = title) },
                selected = currentRoute == item.route,
                onClick = { navController.navigate(item.route) {
                    navController.graph.startDestinationRoute?.let { route ->
                        popUpTo(route) {
                            saveState = true
                        }
                    }
                    launchSingleTop = true
                    restoreState = true
                } }
            )
        }
        Box(
            Modifier.weight(1f),
        )
    }
}

@Preview
@Composable
fun BottomAppBarPreview() {
}
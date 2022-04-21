package com.example.to_doapp.ui.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.to_doapp.R

sealed class NavigationItem(
    val route: String,
    val titleId: Int,
    @DrawableRes
    val iconId: Int
) {
    object MyDay : NavigationItem(
        route = "my_day",
        titleId = R.string.my_day_title,
        iconId = R.drawable.ic_my_day
    )

    object Tasks : NavigationItem(
        route = "tasks",
        titleId = R.string.tasks_title,
        iconId = R.drawable.ic_task_list
    )

    object About : NavigationItem(
        route = "about",
        titleId = R.string.about_title,
        iconId = R.drawable.ic_about
    )
}

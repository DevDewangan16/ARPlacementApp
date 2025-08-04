package com.example.arplacementapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.arplacementapp.model.DrillData
//import com.example.arplacementapp.ui.screens.ARScreen
import com.example.arplacementapp.ui.screens.DrillDetailScreen
import com.example.arplacementapp.ui.screens.DrillSelectionScreen

@Composable
fun AppNavigation(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = "drill_selection"
    ) {
        composable("drill_selection") {
            DrillSelectionScreen(
                onDrillSelected = { drillId ->
                    navController.navigate("drill_detail/$drillId")
                }
            )
        }

        composable("drill_detail/{drillId}") { backStackEntry ->
            val drillId = backStackEntry.arguments?.getString("drillId")?.toInt() ?: 1
            val drill = DrillData.drills.find { it.id == drillId } ?: DrillData.drills[0]

            DrillDetailScreen(
                drill = drill,
                onStartAR = {
                    navController.navigate("ar_screen/$drillId")
                },
                onBackPressed = {
                    navController.popBackStack()
                }
            )
        }

        composable("ar_screen/{drillId}") { backStackEntry ->
            val drillId = backStackEntry.arguments?.getString("drillId")?.toInt() ?: 1
            val drill = DrillData.drills.find { it.id == drillId } ?: DrillData.drills[0]

//            ARScreen(
//                drill = drill,
//                onBackPressed = {
//                    navController.popBackStack()
//                }
//            )
        }
    }
}
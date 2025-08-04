package com.example.arplacementapp.model

import androidx.annotation.DrawableRes

data class Drill(
    val id: Int,
    val name: String,
    val description: String,
    val tips: String,
    @DrawableRes val imageRes: Int
)

object DrillData {
    val drills = listOf(
        Drill(
            id = 1,
            name = "Basic Hammer Drill",
            description = "A versatile drill perfect for concrete and masonry work. Features powerful percussion mechanism for efficient drilling through tough materials.",
            tips = "• Use proper safety equipment\n• Start with slow speed\n• Apply steady pressure\n• Keep drill perpendicular to surface",
            imageRes = android.R.drawable.ic_menu_camera // Using system drawable as placeholder
        ),
        Drill(
            id = 2,
            name = "Impact Driver",
            description = "High-torque drill ideal for driving screws and bolts. Combines rotational force with concussive blows for maximum efficiency.",
            tips = "• Use impact-rated bits\n• Don't over-tighten screws\n• Hold firmly to prevent slipping\n• Great for deck building",
            imageRes = android.R.drawable.ic_menu_gallery // Using system drawable as placeholder
        ),
        Drill(
            id = 3,
            name = "Cordless Drill",
            description = "Portable battery-powered drill suitable for general purpose drilling and screwing tasks. Lightweight and convenient for everyday use.",
            tips = "• Keep battery charged\n• Adjust torque settings\n• Use correct drill bits\n• Perfect for home projects",
            imageRes = android.R.drawable.ic_menu_manage // Using system drawable as placeholder
        )
    )
}
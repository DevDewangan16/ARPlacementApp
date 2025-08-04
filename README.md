---

# 📱 AR Drill Placement App for Android

A complete ARCore-powered Android application built using **Kotlin** and **Jetpack Compose**. This app enables users to select a drill, view detailed information, and interactively place a 3D marker in an AR environment.

---

## 📦 Project Structure

| File/Module               | Description                                                    |
| ------------------------- | -------------------------------------------------------------- |
| `MainActivity.kt`         | Entry point for the app with Compose setup                     |
| `DrillModel.kt`           | Data model defining drill properties with 3 sample drills      |
| `AppNavigation.kt`        | Handles navigation between screens using Compose Navigation    |
| `DrillSelectionScreen.kt` | UI screen for selecting drills via dropdown and list           |
| `DrillDetailScreen.kt`    | Displays drill details including image, description, and tips  |
| `ARScreen.kt`             | AR view with plane detection and object placement using ARCore |
| `Theme.kt`, `Type.kt`     | Material Design 3 theming and typography styles                |
| `build.gradle.kts`        | Kotlin DSL Gradle script with required dependencies            |
| `AndroidManifest.xml`     | Camera permissions and ARCore setup configuration              |
| `strings.xml`             | Centralized string resources                                   |

---

## 🎯 Key Features

✅ **Drill Selection UI**

* Dropdown and list view for choosing among 3 predefined drills
* Modern, clean layout using Jetpack Compose

✅ **Drill Detail Pages**

* Displays drill image, detailed description, and helpful usage tips

✅ **AR Functionality**

* Detects horizontal planes (e.g., floor) using ARCore
* Allows user to tap on the detected plane to place a 3D drill marker

✅ **Modern UI Design**

* Built with **Jetpack Compose** and **Material Design 3**
* Uses cards, gradients, and smooth transitions for a pleasant experience

✅ **Permission Handling**

* Runtime camera permission request with graceful fallback handling

✅ **Navigation**

* Seamless screen flow using **Navigation Compose**

✅ **ARCore Integration**

* Fully configured AR environment
* Ensures compatibility with supported Android devices

---

## 🚀 Getting Started

To run this project on your local device:

### 1. Prerequisites

* Android Studio (latest stable version recommended)
* Physical Android device with **ARCore support**
* Internet connection (for Gradle sync)

### 2. Steps

1. Clone or download the project
2. Open in Android Studio
3. Sync Gradle and let dependencies resolve
4. Connect your **ARCore-compatible device**
5. Build and run the app

---

## 📱 App Flow Overview

```
Drill Selection → Drill Details → Start AR Drill → AR View → Tap to Place Marker
```

### 1. **Select Drill**

* Choose from a dropdown or list of available drills

### 2. **View Details**

* Review drill information with a display image, usage description, and tips

### 3. **Start AR Drill**

* Navigate to the AR screen to begin the placement experience

### 4. **Place Marker**

* Move your device to scan the ground plane
* Tap on the surface to place a 3D marker (cube or cone)

---

## 🛠 Technologies Used

| Technology           | Purpose                              |
| -------------------- | ------------------------------------ |
| Kotlin               | Primary development language         |
| Jetpack Compose      | Declarative UI framework             |
| ARCore               | Real-world environment understanding |
| Sceneform (optional) | Simplified 3D object rendering       |
| Material Design 3    | UI/UX styling                        |
| Navigation Compose   | Screen transitions and routing       |
| Camera Permission    | For AR functionality                 |

---

## ⚠️ Notes

* Ensure you are running the app on a physical device that supports **ARCore**
* The app does not support emulators
* Camera permission is required for AR functionality

---

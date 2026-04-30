# Android Video Player App

## Overview

This project is a simple Android video player application built using Android Studio. It demonstrates how to play a video stored in the app’s local resources using `VideoView` along with built-in playback controls.

---

## Features

* Play video from raw resource folder
* Built using `VideoView` for easy implementation
* Integrated `MediaController` for:

  * Play / Pause
  * Seek (forward & backward)
  * Playback controls UI
* Edge-to-edge UI support for modern Android layout

---

## Tech Stack

* Language: Java
* IDE: Android Studio
* Components Used:

  * `VideoView`
  * `MediaController`
  * `Uri`

---

## How It Works

1. Video file is placed inside the res/raw folder.
2. App creates a path using:

   ```
   android.resource://<package_name>/raw/sample
   ```
3. Converts path into `Uri`.
4. Loads video into `VideoView`.
5. Attaches `MediaController` for playback controls.
6. Starts video automatically on launch.

---

## Setup Instructions

1. Open project in Android Studio
2. Add your video file inside:

   ```
   app/src/main/res/raw/
   ```
3. Name it `sample.mp4` (or update code accordingly)
4. Run the app on emulator or physical device

---

## Code Highlights

* `VideoView.setVideoURI()` loads the video
* `MediaController` adds playback controls
* `Uri.parse()` converts video path

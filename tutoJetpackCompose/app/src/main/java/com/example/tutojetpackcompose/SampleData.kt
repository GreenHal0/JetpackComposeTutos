package com.example.tutojetpackcompose

class SampleData {
    // making it companion object so it is now reachable
    companion object {
        // Sample conversation data
        val conversationSample = listOf(
            Message(
                "Luther",
                "Test...Test...Test..."
            ),
            Message(
                "Luther",
                "List of Android versions:\n" +
                        "Android KitKat (API 19)\n" +
                        "Android Lollipop (API 21)\n" +
                        "Android Marshmallow (API 23)\n" +
                        "Android Nougat (API 24)\n" +
                        "Android Oreo (API 26)\n" +
                        "Android Pie (API 28)\n" +
                        "Android 10 (API 29)\n" +
                        "Android 11 (API 30)\n" +
                        "Android 12 (API 31)"
            ),
            Message(
                "Luther",
                "I think Kotlin is my favorite programming language.\n" +
                        "It's so much fun!"
            ),
            Message(
                "Luther",
                "Searching for alternatives to XML layouts..."
            ),
            Message(
                "Luther",
                """Hey, take a look at Jetpack Compose, it's great!
                    |It's the Android's modern toolkit for building native UI.
                    |It simplifies and accelerates UI development on Android.
                    |Less code, powerful tools, and intuitive Kotlin APIs :)""".trimMargin()
            ),
            Message(
                "Luther",
                "It's available from API 21+ :)"
            ),
            Message(
                "Luther",
                "Writing Kotlin for UI seems so natural, Compose where have you been all my life?"
            ),
            Message(
                "Luther",
                "Android Studio next version's name is Arctic Fox"
            ),
            Message(
                "Luther",
                "Android Studio Arctic Fox tooling for Compose is top notch ^_^"
            ),
            Message(
                "Luther",
                "I didn't know you can now run the emulator directly from Android Studio"
            ),
            Message(
                "Luther",
                "Compose Previews are great to check quickly how a composable layout looks like"
            ),
            Message(
                "Luther",
                "Previews are also interactive after enabling the experimental setting"
            ),
            Message(
                "Luther",
                "Have you tried writing build.gradle with KTS?"
            ),
        )
    }
}
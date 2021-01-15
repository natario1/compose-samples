/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.compose.jetchat.data

import com.example.compose.jetchat.R
import com.example.compose.jetchat.conversation.ConversationUiState
import com.example.compose.jetchat.conversation.Message

private val initialMessages = listOf(
    Message(
        "me",
        isMe = true,
        "Compose newbie: I’ve scoured the internet for tutorials about async data loading " +
            "but haven’t found any good ones. What’s the recommended way to load async " +
            "data and emit composable widgets?",
        "8:03 PM"
    ),
    Message(
        "Ali Connors",
        isMe = false,
        "Compose newbie as well, have you looked at the JetNews sample? Most blog posts end up " +
            "out of date pretty fast but this sample is always up to date and deals with async " +
            "data loading (it's faked but the same idea applies) \uD83D\uDC49" +
            "https://github.com/android/compose-samples/tree/master/JetNews",
        "8:04 PM"
    ),
    Message(
        "me",
        isMe = true,
        "Take a look at the `Flow.collectAsState()` APIs",
        "8:05 PM"
    ),
    Message(
        "me",
        isMe = true,
        "You can use all the same stuff",
        "8:05 PM"
    ),
    Message(
        "Ali Connors",
        isMe = false,
        "Thank you!",
        "8:06 PM",
        R.drawable.sticker
    ),
    Message(
        "me",
        isMe = true,
        "Check it out!",
        "8:07 PM"
    )
)

val exampleUiState = ConversationUiState(
    contactName = "Ali Conors",
    contactPhoto = R.drawable.ali,
    messages = initialMessages.reversed(),
)

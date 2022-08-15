package com.coopello.semla.network.body

class PostItemBody(
    val body: String = "# test",
    val private: Boolean = true,
    val tags: List<TagBody> = listOf(
        TagBody(
            name = "Ruby",
            versions = listOf("0.0.1")
        )
    ),
    val title: String = "test"
)

class TagBody(
    val name: String,
    val versions: List<String>
)

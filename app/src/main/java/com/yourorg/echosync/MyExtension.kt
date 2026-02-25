package com.yourorg.echosync

class MyExtensionpackage com.yourorg.echosync

import dev.brahmkshatriya.echo.extensions.Extension
import dev.brahmkshatriya.echo.extensions.models.*

class MyExtension : Extension() {

    override val name: String = "Echo Sync"
    override val version: Int = 1

    override suspend fun search(query: String): List<Track> {
        return emptyList()
    }
}

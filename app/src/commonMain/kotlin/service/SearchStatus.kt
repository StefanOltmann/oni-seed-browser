package service

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

object SearchStatus {

    var statusText by mutableStateOf("")
        private set

    fun onDownloadingIndex() {
        statusText = "Downloading search index..."
    }

    fun onInflatingIndex() {
        statusText = "Inflating search index..."
    }

    fun onFinished() {
        statusText = ""
    }
}

package service

import androidx.compose.runtime.mutableStateOf

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

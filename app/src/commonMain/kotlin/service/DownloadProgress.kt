package service

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

object DownloadProgress {

    var isLoading by mutableStateOf(false)
        private set

    var statusText by mutableStateOf("")
        private set

    var bytesDownloaded by mutableStateOf(0L)
        private set

    var totalBytes by mutableStateOf(0L)
        private set

    fun onDownloadStarted() {
        isLoading = true
        statusText = "Downloading search index..."
        bytesDownloaded = 0L
        totalBytes = 0L
    }

    fun onContentLength(length: Long) {
        totalBytes = length
    }

    fun onBytesDownloaded(bytes: Long) {
        bytesDownloaded += bytes
        updateStatusText()
    }

    fun onDownloadComplete() {
        statusText = "Processing search index..."
    }

    fun onFinished() {
        isLoading = false
        statusText = ""
        bytesDownloaded = 0L
        totalBytes = 0L
    }

    private fun updateStatusText() {
        if (totalBytes > 0) {
            val downloadedKB = bytesDownloaded / 1024
            val totalKB = totalBytes / 1024
            statusText = "Downloading search index... ${downloadedKB}/${totalKB} KB"
        } else {
            val downloadedKB = bytesDownloaded / 1024
            statusText = "Downloading search index... ${downloadedKB} KB"
        }
    }
}

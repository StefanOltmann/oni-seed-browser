import java.io.ByteArrayOutputStream
import java.util.zip.Deflater
import java.util.zip.Inflater

fun zlibDecompress(compressed: ByteArray): ByteArray {

    val inflater = Inflater()

    inflater.setInput(compressed)

    val buffer = ByteArray(1024)
    val output = ByteArrayOutputStream()

    while (!inflater.finished()) {
        val count = inflater.inflate(buffer)
        output.write(buffer, 0, count)
    }

    inflater.end()

    return output.toByteArray()
}

fun zlibCompress(input: ByteArray): ByteArray {

    val deflater = Deflater()

    deflater.setInput(input)
    deflater.finish()

    val buffer = ByteArray(1024)
    val output = ByteArrayOutputStream()

    while (!deflater.finished()) {
        val count = deflater.deflate(buffer)
        output.write(buffer, 0, count)
    }

    deflater.end()

    return output.toByteArray()
}

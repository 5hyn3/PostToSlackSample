import kotlin.js.Json
import kotlin.js.Promise

@Suppress("FunctionName")
@JsModule("fs")
external object Fs {
    fun createReadStream(fileName: String): dynamic
}

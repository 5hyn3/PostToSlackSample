import kotlin.js.Json
import kotlin.js.Promise

@Suppress("FunctionName")
@JsModule("@slack/web-api")
external class Slack {
    class WebClient(token: String) {
        val chat: Chat
        val files: Files
    }
    class Chat {
        fun postMessage(params: Json): Promise<dynamic>
    }
    class Files {
        fun upload(params: Json): Promise<dynamic>
    }
}

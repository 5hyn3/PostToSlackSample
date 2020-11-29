import Fs.createReadStream
import kotlin.js.json


fun main() {
    val channel = "hogehoge"
    val token = "fugafuga"

    val slackWebClient = Slack.WebClient(token)

    async {
        slackWebClient.chat.postMessage(
            json(
                "channel" to channel,
                "text" to "hello"
            )
        ).await()

        val fileName = "kotlin-logo.png"
        slackWebClient.files.upload(
            json(
                "channels" to channel,
                "filename" to fileName,
                "file" to createReadStream("../../../../${fileName}")
            )
        ).await()

        slackWebClient.chat.postMessage(
            json(
                "channel" to channel,
                "text" to "world"
            )
        ).await()
    }
}
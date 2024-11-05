import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.request.*
import kotlinx.serialization.Serializable

fun main() {
    embeddedServer(Netty, port = 8080, module = Application::module).start(wait = true)
}

fun Application.module() {
    install(ContentNegotiation) {
        json()
    }

    routing {
        get("/hello") {
            call.respondText("Hello, Kotlin!")
        }

//        get("/greet") {
//            call.respond(Greeting("Hello from REST endpoint"))
//        }
//
//        post("/submit") {
//            val userData = call.receive<UserData>()
//            call.respondText("Received user data: ${userData.name}, age: ${userData.age}")
//        }
    }
}

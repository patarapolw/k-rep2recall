package rep2recall

import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.*
import io.javalin.plugin.openapi.OpenApiOptions
import io.javalin.plugin.openapi.OpenApiPlugin
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.servers.Server
import rep2recall.api.EditController


object Server {
    @SuppressWarnings("WeakerAccess")
    val app = Javalin.create {
        it.registerPlugin(OpenApiPlugin(openApiOptions))
    } ?: throw Error("Javalin failed to create")

    @SuppressWarnings("WeakerAccess")
    val port = System.getenv("PORT")?.toInt() ?: 12345

    fun start () {
        app.routes {
            path("api") {
                path("edit") {
                    get(EditController::getOne)
                    post(EditController::query)
                    put(EditController::create)
                    put("multi", EditController::createMany)
                    patch(EditController::update)
                    delete(EditController::delete)
                    get("deck", EditController::getDecks)
                    path("tag") {
                        get(EditController::getTags)
                        patch("add", EditController::addTags)
                        patch("remove", EditController::removeTags)
                    }
                }


            }
        }

        app.start(port)
    }

    private val openApiOptions: OpenApiOptions
        get() {
            return OpenApiOptions {
                OpenAPI()
                    .info(Info()
                        .version("0.4")
                        .description("Rep2Recall Desktop"))
                    .addServersItem(Server()
                        .url("http://localhost:$port"))
            }.path("/api/doc")
        }
}
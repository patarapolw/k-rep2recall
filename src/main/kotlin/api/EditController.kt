package rep2recall.api

import io.javalin.http.Context
import io.javalin.plugin.openapi.annotations.*

object EditController {
    @OpenApi(
        summary = "Get info of an item",
        tags = ["edit"],
        queryParams = [
            OpenApiParam("key", String::class)
        ],
        responses = [
            OpenApiResponse("200", [
                OpenApiContent(Body.CardData::class)
            ])
        ]
    )
    fun getOne (ctx: Context) {
    }

    @OpenApi(
        summary = "Query for items",
        tags = ["edit"],
        requestBody = OpenApiRequestBody([
            OpenApiContent(Body.DataQuery::class)
        ]),
        responses = [
            OpenApiResponse("200", [
                OpenApiContent(Body.CardDataQueryResult::class)
            ])
        ]
    )
    fun query (ctx: Context) {
    }

    @OpenApi(
        summary = "Create item",
        tags = ["edit"],
        requestBody = OpenApiRequestBody([
            OpenApiContent(Body.CardData::class)
        ]),
        responses = [
            OpenApiResponse("200", [
                OpenApiContent(Body.Key::class)
            ])
        ]
    )
    fun create (ctx: Context) {

    }

    @OpenApi(
        summary = "Create multiple items",
        tags = ["edit"],
        requestBody = OpenApiRequestBody([
            OpenApiContent(Body.CardDataMulti::class)
        ]),
        responses = [
            OpenApiResponse("200", [
                OpenApiContent(Body.KeyMulti::class)
            ])
        ]
    )
    fun createMany (ctx: Context) {

    }

    @OpenApi(
        summary = "Update items",
        tags = ["edit"],
        requestBody = OpenApiRequestBody([
            OpenApiContent(Body.CardUpdate::class)
        ])
    )
    fun update (ctx: Context) {

    }

    @OpenApi(
        summary = "Delete items",
        tags = ["edit"],
        requestBody = OpenApiRequestBody([
            OpenApiContent(Body.KeyMulti::class)
        ])
    )
    fun delete (ctx: Context) {

    }

    @OpenApi(
        summary = "Get decks",
        tags = ["edit"],
        responses = [
            OpenApiResponse("200", [
                OpenApiContent(Body.Multi::class)
            ])
        ]
    )
    fun getDecks (ctx: Context) {

    }

    @OpenApi(
        summary = "Get tags",
        tags = ["edit"],
        responses = [
            OpenApiResponse("200", [
                OpenApiContent(Body.Multi::class)
            ])
        ]
    )
    fun getTags (ctx: Context) {

    }

    @OpenApi(
        summary = "Add tags",
        tags = ["edit"],
        requestBody = OpenApiRequestBody([
            OpenApiContent(Body.UpdateTag::class)
        ])
    )
    fun addTags (ctx: Context) {

    }

    @OpenApi(
        summary = "Remove tags",
        tags = ["edit"],
        requestBody = OpenApiRequestBody([
            OpenApiContent(Body.UpdateTag::class)
        ])
    )
    fun removeTags (ctx: Context) {

    }
}
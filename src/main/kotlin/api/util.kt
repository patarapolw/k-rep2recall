package rep2recall.api

import rep2recall.db.DateString
import rep2recall.db.Lesson
import rep2recall.db.Stat

object Body {
    data class Key (
            val key: String
    )

    data class KeyMulti (
            val keys: List<String>
    )

    data class CardDataPartial (
        val data: Map<String, String>?,
        val ref: List<String>?,
        val markdown: String?,
        val tag: List<String>?,
        val nextReview: DateString?,  // date-time
        val srsLevel: Int?,
        val stat: Stat?,
        val lesson: List<Lesson>?,
        val deck: String?
    )

    data class CardUpdate (
            val keys: List<String>,
            val set: CardDataPartial
    )

    data class UpdateTag (
        val keys: List<String>,
        val tags: List<String>
    )

    data class CardData (
            val key: String,
            val data: Map<String, String>?,
            val ref: List<String>?,
            val markdown: String?,
            val tag: List<String>?,
            val nextReview: DateString?,  // date-time
            val srsLevel: Int?,
            val stat: Stat?,
            val lesson: List<Lesson>?,
            val deck: String?
    )

    data class CardDataMulti (
            val entries: List<CardData>
    )

    data class Multi (
        val entries: List<String>
    )

    data class CardDataQueryResult (
            val data: List<CardData>,
            val count: Int?
    )

    data class DataQuery (
            val q: String,
            val cond: Map<String, Any>?,
            val offset: Int,
            val limit: Int,
            val sort: List<String>,
            val hasCount: Boolean?
    )
}
// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus.history

import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation to return the count of records satisfying the specified query parameters. This
 * operation is useful to determine how many records pass a particular query criteria without
 * retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp)
 * for more details on valid/required query parameter information.
 */
class HistoryCountParams
private constructor(
    private val createdAt: LocalDate?,
    private val firstResult: Long?,
    private val linkStartTime: OffsetDateTime?,
    private val linkStopTime: OffsetDateTime?,
    private val maxResults: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * (One or more of fields 'createdAt, linkStartTime, linkStopTime' are required.) Time the row
     * was created in the database, auto-populated by the system. (YYYY-MM-DDTHH:MM:SS.sssZ)
     */
    fun createdAt(): Optional<LocalDate> = Optional.ofNullable(createdAt)

    fun firstResult(): Optional<Long> = Optional.ofNullable(firstResult)

    /**
     * (One or more of fields 'createdAt, linkStartTime, linkStopTime' are required.) The link
     * establishment time, or the time that the link becomes available for use, in ISO8601 UTC
     * format. (YYYY-MM-DDTHH:MM:SS.ssssssZ)
     */
    fun linkStartTime(): Optional<OffsetDateTime> = Optional.ofNullable(linkStartTime)

    /**
     * (One or more of fields 'createdAt, linkStartTime, linkStopTime' are required.) The link
     * termination time, or the time that the link becomes unavailable for use, in ISO8601 UTC
     * format. (YYYY-MM-DDTHH:MM:SS.ssssssZ)
     */
    fun linkStopTime(): Optional<OffsetDateTime> = Optional.ofNullable(linkStopTime)

    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): HistoryCountParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [HistoryCountParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HistoryCountParams]. */
    class Builder internal constructor() {

        private var createdAt: LocalDate? = null
        private var firstResult: Long? = null
        private var linkStartTime: OffsetDateTime? = null
        private var linkStopTime: OffsetDateTime? = null
        private var maxResults: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(historyCountParams: HistoryCountParams) = apply {
            createdAt = historyCountParams.createdAt
            firstResult = historyCountParams.firstResult
            linkStartTime = historyCountParams.linkStartTime
            linkStopTime = historyCountParams.linkStopTime
            maxResults = historyCountParams.maxResults
            additionalHeaders = historyCountParams.additionalHeaders.toBuilder()
            additionalQueryParams = historyCountParams.additionalQueryParams.toBuilder()
        }

        /**
         * (One or more of fields 'createdAt, linkStartTime, linkStopTime' are required.) Time the
         * row was created in the database, auto-populated by the system. (YYYY-MM-DDTHH:MM:SS.sssZ)
         */
        fun createdAt(createdAt: LocalDate?) = apply { this.createdAt = createdAt }

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<LocalDate>) = createdAt(createdAt.getOrNull())

        fun firstResult(firstResult: Long?) = apply { this.firstResult = firstResult }

        /**
         * Alias for [Builder.firstResult].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun firstResult(firstResult: Long) = firstResult(firstResult as Long?)

        /** Alias for calling [Builder.firstResult] with `firstResult.orElse(null)`. */
        fun firstResult(firstResult: Optional<Long>) = firstResult(firstResult.getOrNull())

        /**
         * (One or more of fields 'createdAt, linkStartTime, linkStopTime' are required.) The link
         * establishment time, or the time that the link becomes available for use, in ISO8601 UTC
         * format. (YYYY-MM-DDTHH:MM:SS.ssssssZ)
         */
        fun linkStartTime(linkStartTime: OffsetDateTime?) = apply {
            this.linkStartTime = linkStartTime
        }

        /** Alias for calling [Builder.linkStartTime] with `linkStartTime.orElse(null)`. */
        fun linkStartTime(linkStartTime: Optional<OffsetDateTime>) =
            linkStartTime(linkStartTime.getOrNull())

        /**
         * (One or more of fields 'createdAt, linkStartTime, linkStopTime' are required.) The link
         * termination time, or the time that the link becomes unavailable for use, in ISO8601 UTC
         * format. (YYYY-MM-DDTHH:MM:SS.ssssssZ)
         */
        fun linkStopTime(linkStopTime: OffsetDateTime?) = apply { this.linkStopTime = linkStopTime }

        /** Alias for calling [Builder.linkStopTime] with `linkStopTime.orElse(null)`. */
        fun linkStopTime(linkStopTime: Optional<OffsetDateTime>) =
            linkStopTime(linkStopTime.getOrNull())

        fun maxResults(maxResults: Long?) = apply { this.maxResults = maxResults }

        /**
         * Alias for [Builder.maxResults].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxResults(maxResults: Long) = maxResults(maxResults as Long?)

        /** Alias for calling [Builder.maxResults] with `maxResults.orElse(null)`. */
        fun maxResults(maxResults: Optional<Long>) = maxResults(maxResults.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [HistoryCountParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): HistoryCountParams =
            HistoryCountParams(
                createdAt,
                firstResult,
                linkStartTime,
                linkStopTime,
                maxResults,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                createdAt?.let { put("createdAt", it.toString()) }
                firstResult?.let { put("firstResult", it.toString()) }
                linkStartTime?.let {
                    put("linkStartTime", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                linkStopTime?.let {
                    put("linkStopTime", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                maxResults?.let { put("maxResults", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HistoryCountParams &&
            createdAt == other.createdAt &&
            firstResult == other.firstResult &&
            linkStartTime == other.linkStartTime &&
            linkStopTime == other.linkStopTime &&
            maxResults == other.maxResults &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            createdAt,
            firstResult,
            linkStartTime,
            linkStopTime,
            maxResults,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "HistoryCountParams{createdAt=$createdAt, firstResult=$firstResult, linkStartTime=$linkStartTime, linkStopTime=$linkStopTime, maxResults=$maxResults, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

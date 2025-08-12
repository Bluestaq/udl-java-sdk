// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.collectrequests.history

import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Service operation to dynamically query historical data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
class HistoryListParams private constructor(
    private val startTime: OffsetDateTime,
    private val columns: String?,
    private val firstResult: Long?,
    private val maxResults: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /** The start time or earliest time of the collect or contact request window, in ISO 8601 UTC format. (YYYY-MM-DDTHH:MM:SS.ssssssZ) */
    fun startTime(): OffsetDateTime = startTime

    /** optional, fields for retrieval. When omitted, ALL fields are assumed. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid query fields that can be selected. */
    fun columns(): Optional<String> = Optional.ofNullable(columns)

    fun firstResult(): Optional<Long> = Optional.ofNullable(firstResult)

    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HistoryListParams].
         *
         * The following fields are required:
         *
         * ```java
         * .startTime()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [HistoryListParams]. */
    class Builder internal constructor() {

        private var startTime: OffsetDateTime? = null
        private var columns: String? = null
        private var firstResult: Long? = null
        private var maxResults: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(historyListParams: HistoryListParams) =
            apply {
                startTime = historyListParams.startTime
                columns = historyListParams.columns
                firstResult = historyListParams.firstResult
                maxResults = historyListParams.maxResults
                additionalHeaders = historyListParams.additionalHeaders.toBuilder()
                additionalQueryParams = historyListParams.additionalQueryParams.toBuilder()
            }

        /** The start time or earliest time of the collect or contact request window, in ISO 8601 UTC format. (YYYY-MM-DDTHH:MM:SS.ssssssZ) */
        fun startTime(startTime: OffsetDateTime) =
            apply {
                this.startTime = startTime
            }

        /** optional, fields for retrieval. When omitted, ALL fields are assumed. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid query fields that can be selected. */
        fun columns(columns: String?) =
            apply {
                this.columns = columns
            }

        /** Alias for calling [Builder.columns] with `columns.orElse(null)`. */
        fun columns(columns: Optional<String>) = columns(columns.getOrNull())

        fun firstResult(firstResult: Long?) =
            apply {
                this.firstResult = firstResult
            }

        /**
         * Alias for [Builder.firstResult].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun firstResult(firstResult: Long) = firstResult(firstResult as Long?)

        /** Alias for calling [Builder.firstResult] with `firstResult.orElse(null)`. */
        fun firstResult(firstResult: Optional<Long>) = firstResult(firstResult.getOrNull())

        fun maxResults(maxResults: Long?) =
            apply {
                this.maxResults = maxResults
            }

        /**
         * Alias for [Builder.maxResults].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxResults(maxResults: Long) = maxResults(maxResults as Long?)

        /** Alias for calling [Builder.maxResults] with `maxResults.orElse(null)`. */
        fun maxResults(maxResults: Optional<Long>) = maxResults(maxResults.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        /**
         * Returns an immutable instance of [HistoryListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HistoryListParams =
            HistoryListParams(
              checkRequired(
                "startTime", startTime
              ),
              columns,
              firstResult,
              maxResults,
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("startTime", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(startTime))
                columns?.let { put("columns", it) }
                firstResult?.let { put("firstResult", it.toString()) }
                maxResults?.let { put("maxResults", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is HistoryListParams && startTime == other.startTime && columns == other.columns && firstResult == other.firstResult && maxResults == other.maxResults && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(startTime, columns, firstResult, maxResults, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "HistoryListParams{startTime=$startTime, columns=$columns, firstResult=$firstResult, maxResults=$maxResults, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

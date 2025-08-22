// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectresponses.history

import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation to dynamically query historical data by a variety of query parameters not
 * specified in this API documentation, then write that data to the Secure Content Store. See the
 * queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query
 * parameter information.
 */
class HistoryAodrParams
private constructor(
    private val createdAt: LocalDate,
    private val columns: String?,
    private val firstResult: Long?,
    private val maxResults: Long?,
    private val notification: String?,
    private val outputDelimiter: String?,
    private val outputFormat: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Time the row was created in the database, auto-populated by the system.
     * (YYYY-MM-DDTHH:MM:SS.sssZ)
     */
    fun createdAt(): LocalDate = createdAt

    /**
     * optional, fields for retrieval. When omitted, ALL fields are assumed. See the queryhelp
     * operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid query fields that can
     * be selected.
     */
    fun columns(): Optional<String> = Optional.ofNullable(columns)

    fun firstResult(): Optional<Long> = Optional.ofNullable(firstResult)

    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /**
     * optional, notification method for the created file link. When omitted, EMAIL is assumed.
     * Current valid values are: EMAIL, SMS.
     */
    fun notification(): Optional<String> = Optional.ofNullable(notification)

    /**
     * optional, field delimiter when the created file is not JSON. Must be a single character
     * chosen from this set: (',', ';', ':', '|'). When omitted, "," is used. It is strongly
     * encouraged that your field delimiter be a character unlikely to occur within the data.
     */
    fun outputDelimiter(): Optional<String> = Optional.ofNullable(outputDelimiter)

    /**
     * optional, output format for the file. When omitted, JSON is assumed. Current valid values
     * are: JSON and CSV.
     */
    fun outputFormat(): Optional<String> = Optional.ofNullable(outputFormat)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HistoryAodrParams].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HistoryAodrParams]. */
    class Builder internal constructor() {

        private var createdAt: LocalDate? = null
        private var columns: String? = null
        private var firstResult: Long? = null
        private var maxResults: Long? = null
        private var notification: String? = null
        private var outputDelimiter: String? = null
        private var outputFormat: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(historyAodrParams: HistoryAodrParams) = apply {
            createdAt = historyAodrParams.createdAt
            columns = historyAodrParams.columns
            firstResult = historyAodrParams.firstResult
            maxResults = historyAodrParams.maxResults
            notification = historyAodrParams.notification
            outputDelimiter = historyAodrParams.outputDelimiter
            outputFormat = historyAodrParams.outputFormat
            additionalHeaders = historyAodrParams.additionalHeaders.toBuilder()
            additionalQueryParams = historyAodrParams.additionalQueryParams.toBuilder()
        }

        /**
         * Time the row was created in the database, auto-populated by the system.
         * (YYYY-MM-DDTHH:MM:SS.sssZ)
         */
        fun createdAt(createdAt: LocalDate) = apply { this.createdAt = createdAt }

        /**
         * optional, fields for retrieval. When omitted, ALL fields are assumed. See the queryhelp
         * operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid query fields that
         * can be selected.
         */
        fun columns(columns: String?) = apply { this.columns = columns }

        /** Alias for calling [Builder.columns] with `columns.orElse(null)`. */
        fun columns(columns: Optional<String>) = columns(columns.getOrNull())

        fun firstResult(firstResult: Long?) = apply { this.firstResult = firstResult }

        /**
         * Alias for [Builder.firstResult].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun firstResult(firstResult: Long) = firstResult(firstResult as Long?)

        /** Alias for calling [Builder.firstResult] with `firstResult.orElse(null)`. */
        fun firstResult(firstResult: Optional<Long>) = firstResult(firstResult.getOrNull())

        fun maxResults(maxResults: Long?) = apply { this.maxResults = maxResults }

        /**
         * Alias for [Builder.maxResults].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxResults(maxResults: Long) = maxResults(maxResults as Long?)

        /** Alias for calling [Builder.maxResults] with `maxResults.orElse(null)`. */
        fun maxResults(maxResults: Optional<Long>) = maxResults(maxResults.getOrNull())

        /**
         * optional, notification method for the created file link. When omitted, EMAIL is assumed.
         * Current valid values are: EMAIL, SMS.
         */
        fun notification(notification: String?) = apply { this.notification = notification }

        /** Alias for calling [Builder.notification] with `notification.orElse(null)`. */
        fun notification(notification: Optional<String>) = notification(notification.getOrNull())

        /**
         * optional, field delimiter when the created file is not JSON. Must be a single character
         * chosen from this set: (',', ';', ':', '|'). When omitted, "," is used. It is strongly
         * encouraged that your field delimiter be a character unlikely to occur within the data.
         */
        fun outputDelimiter(outputDelimiter: String?) = apply {
            this.outputDelimiter = outputDelimiter
        }

        /** Alias for calling [Builder.outputDelimiter] with `outputDelimiter.orElse(null)`. */
        fun outputDelimiter(outputDelimiter: Optional<String>) =
            outputDelimiter(outputDelimiter.getOrNull())

        /**
         * optional, output format for the file. When omitted, JSON is assumed. Current valid values
         * are: JSON and CSV.
         */
        fun outputFormat(outputFormat: String?) = apply { this.outputFormat = outputFormat }

        /** Alias for calling [Builder.outputFormat] with `outputFormat.orElse(null)`. */
        fun outputFormat(outputFormat: Optional<String>) = outputFormat(outputFormat.getOrNull())

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
         * Returns an immutable instance of [HistoryAodrParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HistoryAodrParams =
            HistoryAodrParams(
                checkRequired("createdAt", createdAt),
                columns,
                firstResult,
                maxResults,
                notification,
                outputDelimiter,
                outputFormat,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("createdAt", createdAt.toString())
                columns?.let { put("columns", it) }
                firstResult?.let { put("firstResult", it.toString()) }
                maxResults?.let { put("maxResults", it.toString()) }
                notification?.let { put("notification", it) }
                outputDelimiter?.let { put("outputDelimiter", it) }
                outputFormat?.let { put("outputFormat", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HistoryAodrParams &&
            createdAt == other.createdAt &&
            columns == other.columns &&
            firstResult == other.firstResult &&
            maxResults == other.maxResults &&
            notification == other.notification &&
            outputDelimiter == other.outputDelimiter &&
            outputFormat == other.outputFormat &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            createdAt,
            columns,
            firstResult,
            maxResults,
            notification,
            outputDelimiter,
            outputFormat,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "HistoryAodrParams{createdAt=$createdAt, columns=$columns, firstResult=$firstResult, maxResults=$maxResults, notification=$notification, outputDelimiter=$outputDelimiter, outputFormat=$outputFormat, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

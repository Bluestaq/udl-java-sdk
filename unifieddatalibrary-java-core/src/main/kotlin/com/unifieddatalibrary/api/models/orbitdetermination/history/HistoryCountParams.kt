// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.orbitdetermination.history

import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
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
    private val firstResult: Long?,
    private val idOnOrbit: String?,
    private val maxResults: Long?,
    private val startTime: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun firstResult(): Optional<Long> = Optional.ofNullable(firstResult)

    /**
     * (One or more of fields 'idOnOrbit, startTime' are required.) Unique identifier of the target
     * satellite on-orbit object. This ID can be used to obtain additional information on an OnOrbit
     * object using the 'get by ID' operation (e.g. /udl/onorbit/{id}). For example, the OnOrbit
     * with idOnOrbit = 25544 would be queried as /udl/onorbit/25544.
     */
    fun idOnOrbit(): Optional<String> = Optional.ofNullable(idOnOrbit)

    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /**
     * (One or more of fields 'idOnOrbit, startTime' are required.) Start time for OD solution in
     * ISO 8601 UTC datetime format, with microsecond precision. (YYYY-MM-DDTHH:MM:SS.ssssssZ)
     */
    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

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

        private var firstResult: Long? = null
        private var idOnOrbit: String? = null
        private var maxResults: Long? = null
        private var startTime: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(historyCountParams: HistoryCountParams) = apply {
            firstResult = historyCountParams.firstResult
            idOnOrbit = historyCountParams.idOnOrbit
            maxResults = historyCountParams.maxResults
            startTime = historyCountParams.startTime
            additionalHeaders = historyCountParams.additionalHeaders.toBuilder()
            additionalQueryParams = historyCountParams.additionalQueryParams.toBuilder()
        }

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
         * (One or more of fields 'idOnOrbit, startTime' are required.) Unique identifier of the
         * target satellite on-orbit object. This ID can be used to obtain additional information on
         * an OnOrbit object using the 'get by ID' operation (e.g. /udl/onorbit/{id}). For example,
         * the OnOrbit with idOnOrbit = 25544 would be queried as /udl/onorbit/25544.
         */
        fun idOnOrbit(idOnOrbit: String?) = apply { this.idOnOrbit = idOnOrbit }

        /** Alias for calling [Builder.idOnOrbit] with `idOnOrbit.orElse(null)`. */
        fun idOnOrbit(idOnOrbit: Optional<String>) = idOnOrbit(idOnOrbit.getOrNull())

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
         * (One or more of fields 'idOnOrbit, startTime' are required.) Start time for OD solution
         * in ISO 8601 UTC datetime format, with microsecond precision.
         * (YYYY-MM-DDTHH:MM:SS.ssssssZ)
         */
        fun startTime(startTime: OffsetDateTime?) = apply { this.startTime = startTime }

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

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
                firstResult,
                idOnOrbit,
                maxResults,
                startTime,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                firstResult?.let { put("firstResult", it.toString()) }
                idOnOrbit?.let { put("idOnOrbit", it) }
                maxResults?.let { put("maxResults", it.toString()) }
                startTime?.let {
                    put("startTime", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HistoryCountParams &&
            firstResult == other.firstResult &&
            idOnOrbit == other.idOnOrbit &&
            maxResults == other.maxResults &&
            startTime == other.startTime &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            firstResult,
            idOnOrbit,
            maxResults,
            startTime,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "HistoryCountParams{firstResult=$firstResult, idOnOrbit=$idOnOrbit, maxResults=$maxResults, startTime=$startTime, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

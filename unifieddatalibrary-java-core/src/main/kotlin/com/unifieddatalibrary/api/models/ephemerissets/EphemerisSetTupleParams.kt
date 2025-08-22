// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemerissets

import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation to dynamically query data and only return specified columns/fields. Requested
 * columns are specified by the 'columns' query parameter and should be a comma separated list of
 * valid fields for the specified data type. classificationMarking is always returned. See the
 * queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query
 * parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours
 * would return the satNo and period of elsets with an epoch greater than 5 hours ago.
 */
class EphemerisSetTupleParams
private constructor(
    private val columns: String,
    private val firstResult: Long?,
    private val maxResults: Long?,
    private val pointEndTime: OffsetDateTime?,
    private val pointStartTime: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Comma-separated list of valid field names for this data type to be returned in the response.
     * Only the fields specified will be returned as well as the classification marking of the data,
     * if applicable. See the ‘queryhelp’ operation for a complete list of possible fields.
     */
    fun columns(): String = columns

    fun firstResult(): Optional<Long> = Optional.ofNullable(firstResult)

    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /**
     * (One or more of fields 'pointEndTime, pointStartTime' are required.) End time/last time point
     * of the ephemeris, in ISO 8601 UTC format. (YYYY-MM-DDTHH:MM:SS.ssssssZ)
     */
    fun pointEndTime(): Optional<OffsetDateTime> = Optional.ofNullable(pointEndTime)

    /**
     * (One or more of fields 'pointEndTime, pointStartTime' are required.) Start time/first time
     * point of the ephemeris, in ISO 8601 UTC format. (YYYY-MM-DDTHH:MM:SS.ssssssZ)
     */
    fun pointStartTime(): Optional<OffsetDateTime> = Optional.ofNullable(pointStartTime)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EphemerisSetTupleParams].
         *
         * The following fields are required:
         * ```java
         * .columns()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EphemerisSetTupleParams]. */
    class Builder internal constructor() {

        private var columns: String? = null
        private var firstResult: Long? = null
        private var maxResults: Long? = null
        private var pointEndTime: OffsetDateTime? = null
        private var pointStartTime: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ephemerisSetTupleParams: EphemerisSetTupleParams) = apply {
            columns = ephemerisSetTupleParams.columns
            firstResult = ephemerisSetTupleParams.firstResult
            maxResults = ephemerisSetTupleParams.maxResults
            pointEndTime = ephemerisSetTupleParams.pointEndTime
            pointStartTime = ephemerisSetTupleParams.pointStartTime
            additionalHeaders = ephemerisSetTupleParams.additionalHeaders.toBuilder()
            additionalQueryParams = ephemerisSetTupleParams.additionalQueryParams.toBuilder()
        }

        /**
         * Comma-separated list of valid field names for this data type to be returned in the
         * response. Only the fields specified will be returned as well as the classification
         * marking of the data, if applicable. See the ‘queryhelp’ operation for a complete list of
         * possible fields.
         */
        fun columns(columns: String) = apply { this.columns = columns }

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
         * (One or more of fields 'pointEndTime, pointStartTime' are required.) End time/last time
         * point of the ephemeris, in ISO 8601 UTC format. (YYYY-MM-DDTHH:MM:SS.ssssssZ)
         */
        fun pointEndTime(pointEndTime: OffsetDateTime?) = apply { this.pointEndTime = pointEndTime }

        /** Alias for calling [Builder.pointEndTime] with `pointEndTime.orElse(null)`. */
        fun pointEndTime(pointEndTime: Optional<OffsetDateTime>) =
            pointEndTime(pointEndTime.getOrNull())

        /**
         * (One or more of fields 'pointEndTime, pointStartTime' are required.) Start time/first
         * time point of the ephemeris, in ISO 8601 UTC format. (YYYY-MM-DDTHH:MM:SS.ssssssZ)
         */
        fun pointStartTime(pointStartTime: OffsetDateTime?) = apply {
            this.pointStartTime = pointStartTime
        }

        /** Alias for calling [Builder.pointStartTime] with `pointStartTime.orElse(null)`. */
        fun pointStartTime(pointStartTime: Optional<OffsetDateTime>) =
            pointStartTime(pointStartTime.getOrNull())

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
         * Returns an immutable instance of [EphemerisSetTupleParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .columns()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EphemerisSetTupleParams =
            EphemerisSetTupleParams(
                checkRequired("columns", columns),
                firstResult,
                maxResults,
                pointEndTime,
                pointStartTime,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("columns", columns)
                firstResult?.let { put("firstResult", it.toString()) }
                maxResults?.let { put("maxResults", it.toString()) }
                pointEndTime?.let {
                    put("pointEndTime", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                pointStartTime?.let {
                    put("pointStartTime", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EphemerisSetTupleParams &&
            columns == other.columns &&
            firstResult == other.firstResult &&
            maxResults == other.maxResults &&
            pointEndTime == other.pointEndTime &&
            pointStartTime == other.pointStartTime &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            columns,
            firstResult,
            maxResults,
            pointEndTime,
            pointStartTime,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EphemerisSetTupleParams{columns=$columns, firstResult=$firstResult, maxResults=$maxResults, pointEndTime=$pointEndTime, pointStartTime=$pointStartTime, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

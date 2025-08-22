// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sgi

import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Service to return matching SGI records as of the effective date. */
class SgiGetDataByEffectiveAsOfDateParams
private constructor(
    private val effectiveDate: OffsetDateTime?,
    private val firstResult: Long?,
    private val maxResults: Long?,
    private val sgiDate: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * (One or more of fields 'effectiveDate, sgiDate' are required.) ISO8601 UTC Time the data was
     * received and processed from the source. Typically a source provides solar data for a date
     * window with each transmission including past, present, and future predicted values.
     * (YYYY-MM-DDTHH:MM:SS.sssZ)
     */
    fun effectiveDate(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveDate)

    fun firstResult(): Optional<Long> = Optional.ofNullable(firstResult)

    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /**
     * (One or more of fields 'effectiveDate, sgiDate' are required.) ISO8601 UTC Time of the index
     * value. This could be a past, current, or future predicted value. Note: sgiDate defines the
     * start time of the time window for this data record. (YYYY-MM-DDTHH:MM:SS.sssZ)
     */
    fun sgiDate(): Optional<OffsetDateTime> = Optional.ofNullable(sgiDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SgiGetDataByEffectiveAsOfDateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [SgiGetDataByEffectiveAsOfDateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SgiGetDataByEffectiveAsOfDateParams]. */
    class Builder internal constructor() {

        private var effectiveDate: OffsetDateTime? = null
        private var firstResult: Long? = null
        private var maxResults: Long? = null
        private var sgiDate: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            sgiGetDataByEffectiveAsOfDateParams: SgiGetDataByEffectiveAsOfDateParams
        ) = apply {
            effectiveDate = sgiGetDataByEffectiveAsOfDateParams.effectiveDate
            firstResult = sgiGetDataByEffectiveAsOfDateParams.firstResult
            maxResults = sgiGetDataByEffectiveAsOfDateParams.maxResults
            sgiDate = sgiGetDataByEffectiveAsOfDateParams.sgiDate
            additionalHeaders = sgiGetDataByEffectiveAsOfDateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                sgiGetDataByEffectiveAsOfDateParams.additionalQueryParams.toBuilder()
        }

        /**
         * (One or more of fields 'effectiveDate, sgiDate' are required.) ISO8601 UTC Time the data
         * was received and processed from the source. Typically a source provides solar data for a
         * date window with each transmission including past, present, and future predicted values.
         * (YYYY-MM-DDTHH:MM:SS.sssZ)
         */
        fun effectiveDate(effectiveDate: OffsetDateTime?) = apply {
            this.effectiveDate = effectiveDate
        }

        /** Alias for calling [Builder.effectiveDate] with `effectiveDate.orElse(null)`. */
        fun effectiveDate(effectiveDate: Optional<OffsetDateTime>) =
            effectiveDate(effectiveDate.getOrNull())

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
         * (One or more of fields 'effectiveDate, sgiDate' are required.) ISO8601 UTC Time of the
         * index value. This could be a past, current, or future predicted value. Note: sgiDate
         * defines the start time of the time window for this data record.
         * (YYYY-MM-DDTHH:MM:SS.sssZ)
         */
        fun sgiDate(sgiDate: OffsetDateTime?) = apply { this.sgiDate = sgiDate }

        /** Alias for calling [Builder.sgiDate] with `sgiDate.orElse(null)`. */
        fun sgiDate(sgiDate: Optional<OffsetDateTime>) = sgiDate(sgiDate.getOrNull())

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
         * Returns an immutable instance of [SgiGetDataByEffectiveAsOfDateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SgiGetDataByEffectiveAsOfDateParams =
            SgiGetDataByEffectiveAsOfDateParams(
                effectiveDate,
                firstResult,
                maxResults,
                sgiDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                effectiveDate?.let {
                    put("effectiveDate", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                firstResult?.let { put("firstResult", it.toString()) }
                maxResults?.let { put("maxResults", it.toString()) }
                sgiDate?.let { put("sgiDate", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SgiGetDataByEffectiveAsOfDateParams &&
            effectiveDate == other.effectiveDate &&
            firstResult == other.firstResult &&
            maxResults == other.maxResults &&
            sgiDate == other.sgiDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            effectiveDate,
            firstResult,
            maxResults,
            sgiDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SgiGetDataByEffectiveAsOfDateParams{effectiveDate=$effectiveDate, firstResult=$firstResult, maxResults=$maxResults, sgiDate=$sgiDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

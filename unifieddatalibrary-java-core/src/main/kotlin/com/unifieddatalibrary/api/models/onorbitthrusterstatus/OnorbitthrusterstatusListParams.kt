// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitthrusterstatus

import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation to dynamically query data by a variety of query parameters not specified in
 * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more
 * details on valid/required query parameter information.
 */
class OnorbitthrusterstatusListParams
private constructor(
    private val firstResult: Long?,
    private val idOnorbitThruster: String?,
    private val maxResults: Long?,
    private val statusTime: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun firstResult(): Optional<Long> = Optional.ofNullable(firstResult)

    /**
     * (One or more of fields 'idOnorbitThruster, statusTime' are required.) ID of the associated
     * OnorbitThruster record. This ID can be used to obtain additional information on an onorbit
     * thruster object using the 'get by ID' operation (e.g. /udl/onorbitthruster/{id}). For
     * example, the OnorbitThruster object with idOnorbitThruster = abc would be queried as
     * /udl/onorbitthruster/abc.
     */
    fun idOnorbitThruster(): Optional<String> = Optional.ofNullable(idOnorbitThruster)

    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /**
     * (One or more of fields 'idOnorbitThruster, statusTime' are required.) Datetime of the
     * thruster status observation in ISO 8601 UTC datetime format with millisecond precision.
     * (YYYY-MM-DDTHH:MM:SS.sssZ)
     */
    fun statusTime(): Optional<OffsetDateTime> = Optional.ofNullable(statusTime)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OnorbitthrusterstatusListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [OnorbitthrusterstatusListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnorbitthrusterstatusListParams]. */
    class Builder internal constructor() {

        private var firstResult: Long? = null
        private var idOnorbitThruster: String? = null
        private var maxResults: Long? = null
        private var statusTime: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(onorbitthrusterstatusListParams: OnorbitthrusterstatusListParams) =
            apply {
                firstResult = onorbitthrusterstatusListParams.firstResult
                idOnorbitThruster = onorbitthrusterstatusListParams.idOnorbitThruster
                maxResults = onorbitthrusterstatusListParams.maxResults
                statusTime = onorbitthrusterstatusListParams.statusTime
                additionalHeaders = onorbitthrusterstatusListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    onorbitthrusterstatusListParams.additionalQueryParams.toBuilder()
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
         * (One or more of fields 'idOnorbitThruster, statusTime' are required.) ID of the
         * associated OnorbitThruster record. This ID can be used to obtain additional information
         * on an onorbit thruster object using the 'get by ID' operation (e.g.
         * /udl/onorbitthruster/{id}). For example, the OnorbitThruster object with
         * idOnorbitThruster = abc would be queried as /udl/onorbitthruster/abc.
         */
        fun idOnorbitThruster(idOnorbitThruster: String?) = apply {
            this.idOnorbitThruster = idOnorbitThruster
        }

        /** Alias for calling [Builder.idOnorbitThruster] with `idOnorbitThruster.orElse(null)`. */
        fun idOnorbitThruster(idOnorbitThruster: Optional<String>) =
            idOnorbitThruster(idOnorbitThruster.getOrNull())

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
         * (One or more of fields 'idOnorbitThruster, statusTime' are required.) Datetime of the
         * thruster status observation in ISO 8601 UTC datetime format with millisecond precision.
         * (YYYY-MM-DDTHH:MM:SS.sssZ)
         */
        fun statusTime(statusTime: OffsetDateTime?) = apply { this.statusTime = statusTime }

        /** Alias for calling [Builder.statusTime] with `statusTime.orElse(null)`. */
        fun statusTime(statusTime: Optional<OffsetDateTime>) = statusTime(statusTime.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [OnorbitthrusterstatusListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OnorbitthrusterstatusListParams =
            OnorbitthrusterstatusListParams(
                firstResult,
                idOnorbitThruster,
                maxResults,
                statusTime,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                firstResult?.let { put("firstResult", it.toString()) }
                idOnorbitThruster?.let { put("idOnorbitThruster", it) }
                maxResults?.let { put("maxResults", it.toString()) }
                statusTime?.let {
                    put("statusTime", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnorbitthrusterstatusListParams &&
            firstResult == other.firstResult &&
            idOnorbitThruster == other.idOnorbitThruster &&
            maxResults == other.maxResults &&
            statusTime == other.statusTime &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            firstResult,
            idOnorbitThruster,
            maxResults,
            statusTime,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "OnorbitthrusterstatusListParams{firstResult=$firstResult, idOnorbitThruster=$idOnorbitThruster, maxResults=$maxResults, statusTime=$statusTime, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

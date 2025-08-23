// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.navigationalobstruction

import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation to dynamically query data by a variety of query parameters not specified in
 * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more
 * details on valid/required query parameter information.
 */
class NavigationalObstructionListParams
private constructor(
    private val cycleDate: LocalDate?,
    private val firstResult: Long?,
    private val maxResults: Long?,
    private val obstacleId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * (One or more of fields 'cycleDate, obstacleId' are required.) Start date of this obstruction
     * data set's currency, in ISO 8601 date-only format. (YYYY-MM-DD)
     */
    fun cycleDate(): Optional<LocalDate> = Optional.ofNullable(cycleDate)

    fun firstResult(): Optional<Long> = Optional.ofNullable(firstResult)

    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /** (One or more of fields 'cycleDate, obstacleId' are required.) The ID of this obstacle. */
    fun obstacleId(): Optional<String> = Optional.ofNullable(obstacleId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): NavigationalObstructionListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [NavigationalObstructionListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NavigationalObstructionListParams]. */
    class Builder internal constructor() {

        private var cycleDate: LocalDate? = null
        private var firstResult: Long? = null
        private var maxResults: Long? = null
        private var obstacleId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(navigationalObstructionListParams: NavigationalObstructionListParams) =
            apply {
                cycleDate = navigationalObstructionListParams.cycleDate
                firstResult = navigationalObstructionListParams.firstResult
                maxResults = navigationalObstructionListParams.maxResults
                obstacleId = navigationalObstructionListParams.obstacleId
                additionalHeaders = navigationalObstructionListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    navigationalObstructionListParams.additionalQueryParams.toBuilder()
            }

        /**
         * (One or more of fields 'cycleDate, obstacleId' are required.) Start date of this
         * obstruction data set's currency, in ISO 8601 date-only format. (YYYY-MM-DD)
         */
        fun cycleDate(cycleDate: LocalDate?) = apply { this.cycleDate = cycleDate }

        /** Alias for calling [Builder.cycleDate] with `cycleDate.orElse(null)`. */
        fun cycleDate(cycleDate: Optional<LocalDate>) = cycleDate(cycleDate.getOrNull())

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
         * (One or more of fields 'cycleDate, obstacleId' are required.) The ID of this obstacle.
         */
        fun obstacleId(obstacleId: String?) = apply { this.obstacleId = obstacleId }

        /** Alias for calling [Builder.obstacleId] with `obstacleId.orElse(null)`. */
        fun obstacleId(obstacleId: Optional<String>) = obstacleId(obstacleId.getOrNull())

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
         * Returns an immutable instance of [NavigationalObstructionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NavigationalObstructionListParams =
            NavigationalObstructionListParams(
                cycleDate,
                firstResult,
                maxResults,
                obstacleId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cycleDate?.let { put("cycleDate", it.toString()) }
                firstResult?.let { put("firstResult", it.toString()) }
                maxResults?.let { put("maxResults", it.toString()) }
                obstacleId?.let { put("obstacleId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NavigationalObstructionListParams &&
            cycleDate == other.cycleDate &&
            firstResult == other.firstResult &&
            maxResults == other.maxResults &&
            obstacleId == other.obstacleId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            cycleDate,
            firstResult,
            maxResults,
            obstacleId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "NavigationalObstructionListParams{cycleDate=$cycleDate, firstResult=$firstResult, maxResults=$maxResults, obstacleId=$obstacleId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

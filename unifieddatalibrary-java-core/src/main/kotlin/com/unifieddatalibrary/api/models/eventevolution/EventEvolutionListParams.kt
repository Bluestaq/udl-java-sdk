// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.eventevolution

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
class EventEvolutionListParams
private constructor(
    private val eventId: String?,
    private val firstResult: Long?,
    private val maxResults: Long?,
    private val startTime: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * (One or more of fields 'eventId, startTime' are required.) User-provided unique identifier of
     * this activity or event. This ID should remain the same on subsequent updates in order to
     * associate all records pertaining to the activity or event.
     */
    fun eventId(): Optional<String> = Optional.ofNullable(eventId)

    fun firstResult(): Optional<Long> = Optional.ofNullable(firstResult)

    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /**
     * (One or more of fields 'eventId, startTime' are required.) The actual or estimated start time
     * of the activity or event, in ISO 8601 UTC format. (YYYY-MM-DDTHH:MM:SS.sssZ)
     */
    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EventEvolutionListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EventEvolutionListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventEvolutionListParams]. */
    class Builder internal constructor() {

        private var eventId: String? = null
        private var firstResult: Long? = null
        private var maxResults: Long? = null
        private var startTime: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventEvolutionListParams: EventEvolutionListParams) = apply {
            eventId = eventEvolutionListParams.eventId
            firstResult = eventEvolutionListParams.firstResult
            maxResults = eventEvolutionListParams.maxResults
            startTime = eventEvolutionListParams.startTime
            additionalHeaders = eventEvolutionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventEvolutionListParams.additionalQueryParams.toBuilder()
        }

        /**
         * (One or more of fields 'eventId, startTime' are required.) User-provided unique
         * identifier of this activity or event. This ID should remain the same on subsequent
         * updates in order to associate all records pertaining to the activity or event.
         */
        fun eventId(eventId: String?) = apply { this.eventId = eventId }

        /** Alias for calling [Builder.eventId] with `eventId.orElse(null)`. */
        fun eventId(eventId: Optional<String>) = eventId(eventId.getOrNull())

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
         * (One or more of fields 'eventId, startTime' are required.) The actual or estimated start
         * time of the activity or event, in ISO 8601 UTC format. (YYYY-MM-DDTHH:MM:SS.sssZ)
         */
        fun startTime(startTime: OffsetDateTime?) = apply { this.startTime = startTime }

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

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
         * Returns an immutable instance of [EventEvolutionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventEvolutionListParams =
            EventEvolutionListParams(
                eventId,
                firstResult,
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
                eventId?.let { put("eventId", it) }
                firstResult?.let { put("firstResult", it.toString()) }
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

        return /* spotless:off */ other is EventEvolutionListParams && eventId == other.eventId && firstResult == other.firstResult && maxResults == other.maxResults && startTime == other.startTime && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventId, firstResult, maxResults, startTime, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventEvolutionListParams{eventId=$eventId, firstResult=$firstResult, maxResults=$maxResults, startTime=$startTime, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

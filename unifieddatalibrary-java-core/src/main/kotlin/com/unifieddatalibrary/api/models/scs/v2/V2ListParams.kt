// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns a list of ScsEntity objects, each directly nested under the provided path. */
class V2ListParams
private constructor(
    private val path: String,
    private val firstResult: Long?,
    private val maxResults: Long?,
    private val order: String?,
    private val searchAfter: String?,
    private val size: Int?,
    private val sort: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The base path to list. */
    fun path(): String = path

    fun firstResult(): Optional<Long> = Optional.ofNullable(firstResult)

    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /** The order in which entries should be sorted. */
    fun order(): Optional<String> = Optional.ofNullable(order)

    /**
     * The starting point for pagination results, usually set to the value of the SEARCH_AFTER
     * header returned in the previous request.
     */
    fun searchAfter(): Optional<String> = Optional.ofNullable(searchAfter)

    /** The number of results to retrieve. */
    fun size(): Optional<Int> = Optional.ofNullable(size)

    /** The field on which to sort entries. */
    fun sort(): Optional<String> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V2ListParams].
         *
         * The following fields are required:
         * ```java
         * .path()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2ListParams]. */
    class Builder internal constructor() {

        private var path: String? = null
        private var firstResult: Long? = null
        private var maxResults: Long? = null
        private var order: String? = null
        private var searchAfter: String? = null
        private var size: Int? = null
        private var sort: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v2ListParams: V2ListParams) = apply {
            path = v2ListParams.path
            firstResult = v2ListParams.firstResult
            maxResults = v2ListParams.maxResults
            order = v2ListParams.order
            searchAfter = v2ListParams.searchAfter
            size = v2ListParams.size
            sort = v2ListParams.sort
            additionalHeaders = v2ListParams.additionalHeaders.toBuilder()
            additionalQueryParams = v2ListParams.additionalQueryParams.toBuilder()
        }

        /** The base path to list. */
        fun path(path: String) = apply { this.path = path }

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

        /** The order in which entries should be sorted. */
        fun order(order: String?) = apply { this.order = order }

        /** Alias for calling [Builder.order] with `order.orElse(null)`. */
        fun order(order: Optional<String>) = order(order.getOrNull())

        /**
         * The starting point for pagination results, usually set to the value of the SEARCH_AFTER
         * header returned in the previous request.
         */
        fun searchAfter(searchAfter: String?) = apply { this.searchAfter = searchAfter }

        /** Alias for calling [Builder.searchAfter] with `searchAfter.orElse(null)`. */
        fun searchAfter(searchAfter: Optional<String>) = searchAfter(searchAfter.getOrNull())

        /** The number of results to retrieve. */
        fun size(size: Int?) = apply { this.size = size }

        /**
         * Alias for [Builder.size].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun size(size: Int) = size(size as Int?)

        /** Alias for calling [Builder.size] with `size.orElse(null)`. */
        fun size(size: Optional<Int>) = size(size.getOrNull())

        /** The field on which to sort entries. */
        fun sort(sort: String?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<String>) = sort(sort.getOrNull())

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
         * Returns an immutable instance of [V2ListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .path()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V2ListParams =
            V2ListParams(
                checkRequired("path", path),
                firstResult,
                maxResults,
                order,
                searchAfter,
                size,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("path", path)
                firstResult?.let { put("firstResult", it.toString()) }
                maxResults?.let { put("maxResults", it.toString()) }
                order?.let { put("order", it) }
                searchAfter?.let { put("searchAfter", it) }
                size?.let { put("size", it.toString()) }
                sort?.let { put("sort", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V2ListParams &&
            path == other.path &&
            firstResult == other.firstResult &&
            maxResults == other.maxResults &&
            order == other.order &&
            searchAfter == other.searchAfter &&
            size == other.size &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            path,
            firstResult,
            maxResults,
            order,
            searchAfter,
            size,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "V2ListParams{path=$path, firstResult=$firstResult, maxResults=$maxResults, order=$order, searchAfter=$searchAfter, size=$size, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

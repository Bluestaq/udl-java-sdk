// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.starcatalog

import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation to return the count of records satisfying the specified query parameters. This
 * operation is useful to determine how many records pass a particular query criteria without
 * retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp)
 * for more details on valid/required query parameter information.
 */
class StarCatalogCountParams
private constructor(
    private val dec: Double?,
    private val firstResult: Long?,
    private val maxResults: Long?,
    private val ra: Double?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * (One or more of fields 'dec, ra' are required.) Barycentric declination of the source in
     * International Celestial Reference System (ICRS) at the reference epoch, in degrees.
     */
    fun dec(): Optional<Double> = Optional.ofNullable(dec)

    fun firstResult(): Optional<Long> = Optional.ofNullable(firstResult)

    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /**
     * (One or more of fields 'dec, ra' are required.) Barycentric right ascension of the source in
     * the International Celestial Reference System (ICRS) frame at the reference epoch, in degrees.
     */
    fun ra(): Optional<Double> = Optional.ofNullable(ra)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): StarCatalogCountParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [StarCatalogCountParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StarCatalogCountParams]. */
    class Builder internal constructor() {

        private var dec: Double? = null
        private var firstResult: Long? = null
        private var maxResults: Long? = null
        private var ra: Double? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(starCatalogCountParams: StarCatalogCountParams) = apply {
            dec = starCatalogCountParams.dec
            firstResult = starCatalogCountParams.firstResult
            maxResults = starCatalogCountParams.maxResults
            ra = starCatalogCountParams.ra
            additionalHeaders = starCatalogCountParams.additionalHeaders.toBuilder()
            additionalQueryParams = starCatalogCountParams.additionalQueryParams.toBuilder()
        }

        /**
         * (One or more of fields 'dec, ra' are required.) Barycentric declination of the source in
         * International Celestial Reference System (ICRS) at the reference epoch, in degrees.
         */
        fun dec(dec: Double?) = apply { this.dec = dec }

        /**
         * Alias for [Builder.dec].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun dec(dec: Double) = dec(dec as Double?)

        /** Alias for calling [Builder.dec] with `dec.orElse(null)`. */
        fun dec(dec: Optional<Double>) = dec(dec.getOrNull())

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
         * (One or more of fields 'dec, ra' are required.) Barycentric right ascension of the source
         * in the International Celestial Reference System (ICRS) frame at the reference epoch, in
         * degrees.
         */
        fun ra(ra: Double?) = apply { this.ra = ra }

        /**
         * Alias for [Builder.ra].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun ra(ra: Double) = ra(ra as Double?)

        /** Alias for calling [Builder.ra] with `ra.orElse(null)`. */
        fun ra(ra: Optional<Double>) = ra(ra.getOrNull())

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
         * Returns an immutable instance of [StarCatalogCountParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StarCatalogCountParams =
            StarCatalogCountParams(
                dec,
                firstResult,
                maxResults,
                ra,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                dec?.let { put("dec", it.toString()) }
                firstResult?.let { put("firstResult", it.toString()) }
                maxResults?.let { put("maxResults", it.toString()) }
                ra?.let { put("ra", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StarCatalogCountParams && dec == other.dec && firstResult == other.firstResult && maxResults == other.maxResults && ra == other.ra && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(dec, firstResult, maxResults, ra, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "StarCatalogCountParams{dec=$dec, firstResult=$firstResult, maxResults=$maxResults, ra=$ra, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

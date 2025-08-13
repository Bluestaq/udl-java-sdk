// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.antennas

import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.AntennaIngest
import java.util.Objects

/**
 * Service operation to take a single Antenna as a POST body and ingest into the database. A
 * specific role is required to perform this service operation. Please contact the UDL team for
 * assistance.
 */
class AntennaCreateParams
private constructor(
    private val antennaIngest: AntennaIngest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Model representation of information on on-orbit/spacecraft communication antennas. A
     * spacecraft may have multiple antennas and each antenna can have multiple 'details' records
     * compiled by different sources.
     */
    fun antennaIngest(): AntennaIngest = antennaIngest

    fun _additionalBodyProperties(): Map<String, JsonValue> = antennaIngest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AntennaCreateParams].
         *
         * The following fields are required:
         * ```java
         * .antennaIngest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AntennaCreateParams]. */
    class Builder internal constructor() {

        private var antennaIngest: AntennaIngest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(antennaCreateParams: AntennaCreateParams) = apply {
            antennaIngest = antennaCreateParams.antennaIngest
            additionalHeaders = antennaCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = antennaCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Model representation of information on on-orbit/spacecraft communication antennas. A
         * spacecraft may have multiple antennas and each antenna can have multiple 'details'
         * records compiled by different sources.
         */
        fun antennaIngest(antennaIngest: AntennaIngest) = apply {
            this.antennaIngest = antennaIngest
        }

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
         * Returns an immutable instance of [AntennaCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .antennaIngest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AntennaCreateParams =
            AntennaCreateParams(
                checkRequired("antennaIngest", antennaIngest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): AntennaIngest = antennaIngest

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AntennaCreateParams &&
            antennaIngest == other.antennaIngest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(antennaIngest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AntennaCreateParams{antennaIngest=$antennaIngest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

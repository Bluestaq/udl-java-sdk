// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.statevector

import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import java.util.Objects

/**
 * Service operation to take a single state vector as a POST body and ingest into the database. This
 * operation is not intended to be used for automated feeds into UDL. Data providers should contact
 * the UDL team for specific role assignments and for instructions on setting up a permanent feed
 * through an alternate mechanism.
 */
class StateVectorCreateParams
private constructor(
    private val stateVectorIngest: StateVectorIngest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * This service provides operations for querying and manipulation of state vectors for OnOrbit
     * objects. State vectors are cartesian vectors of position (r) and velocity (v) that, together
     * with their time (epoch) (t), uniquely determine the trajectory of the orbiting body in space.
     * J2000 is the preferred coordinate frame for all state vector positions/velocities in UDL, but
     * in some cases data may be in another frame depending on the provider and/or datatype. Please
     * see the 'Discover' tab in the storefront to confirm coordinate frames by data provider.
     */
    fun stateVectorIngest(): StateVectorIngest = stateVectorIngest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        stateVectorIngest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StateVectorCreateParams].
         *
         * The following fields are required:
         * ```java
         * .stateVectorIngest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StateVectorCreateParams]. */
    class Builder internal constructor() {

        private var stateVectorIngest: StateVectorIngest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(stateVectorCreateParams: StateVectorCreateParams) = apply {
            stateVectorIngest = stateVectorCreateParams.stateVectorIngest
            additionalHeaders = stateVectorCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = stateVectorCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * This service provides operations for querying and manipulation of state vectors for
         * OnOrbit objects. State vectors are cartesian vectors of position (r) and velocity (v)
         * that, together with their time (epoch) (t), uniquely determine the trajectory of the
         * orbiting body in space. J2000 is the preferred coordinate frame for all state vector
         * positions/velocities in UDL, but in some cases data may be in another frame depending on
         * the provider and/or datatype. Please see the 'Discover' tab in the storefront to confirm
         * coordinate frames by data provider.
         */
        fun stateVectorIngest(stateVectorIngest: StateVectorIngest) = apply {
            this.stateVectorIngest = stateVectorIngest
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
         * Returns an immutable instance of [StateVectorCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .stateVectorIngest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StateVectorCreateParams =
            StateVectorCreateParams(
                checkRequired("stateVectorIngest", stateVectorIngest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): StateVectorIngest = stateVectorIngest

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StateVectorCreateParams &&
            stateVectorIngest == other.stateVectorIngest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(stateVectorIngest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "StateVectorCreateParams{stateVectorIngest=$stateVectorIngest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

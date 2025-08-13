// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.engines

import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.EngineIngest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation to update a single Engine. An Engine represents launch engine/booster
 * information to include performance characteristics and limits. A launch vehicle has 1 to many
 * engines per stage. A specific role is required to perform this service operation. Please contact
 * the UDL team for assistance.
 */
class EngineUpdateParams
private constructor(
    private val pathId: String?,
    private val engineIngest: EngineIngest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathId(): Optional<String> = Optional.ofNullable(pathId)

    /**
     * Known launch vehicle engines and their performance characteristics and limits. A launch
     * vehicle has 1 to many engines per stage.
     */
    fun engineIngest(): EngineIngest = engineIngest

    fun _additionalBodyProperties(): Map<String, JsonValue> = engineIngest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EngineUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .engineIngest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EngineUpdateParams]. */
    class Builder internal constructor() {

        private var pathId: String? = null
        private var engineIngest: EngineIngest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(engineUpdateParams: EngineUpdateParams) = apply {
            pathId = engineUpdateParams.pathId
            engineIngest = engineUpdateParams.engineIngest
            additionalHeaders = engineUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = engineUpdateParams.additionalQueryParams.toBuilder()
        }

        fun pathId(pathId: String?) = apply { this.pathId = pathId }

        /** Alias for calling [Builder.pathId] with `pathId.orElse(null)`. */
        fun pathId(pathId: Optional<String>) = pathId(pathId.getOrNull())

        /**
         * Known launch vehicle engines and their performance characteristics and limits. A launch
         * vehicle has 1 to many engines per stage.
         */
        fun engineIngest(engineIngest: EngineIngest) = apply { this.engineIngest = engineIngest }

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
         * Returns an immutable instance of [EngineUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .engineIngest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EngineUpdateParams =
            EngineUpdateParams(
                pathId,
                checkRequired("engineIngest", engineIngest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): EngineIngest = engineIngest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EngineUpdateParams &&
            pathId == other.pathId &&
            engineIngest == other.engineIngest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pathId, engineIngest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EngineUpdateParams{pathId=$pathId, engineIngest=$engineIngest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

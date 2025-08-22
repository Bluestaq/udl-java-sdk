// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.elsets

import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation to take a multiple TLEs as a POST body and ingest into the database. This
 * operation is not intended to be used for automated feeds into UDL. Data providers should contact
 * the UDL team for specific role assignments and for instructions on setting up a permanent feed
 * through an alternate mechanism.
 */
class ElsetCreateBulkFromTleParams
private constructor(
    private val dataMode: String,
    private val makeCurrent: Boolean,
    private val source: String,
    private val autoCreateSats: Boolean?,
    private val control: String?,
    private val origin: String?,
    private val tags: String?,
    private val body: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Data mode of the passed elsets (REAL, TEST, etc). */
    fun dataMode(): String = dataMode

    /**
     * Boolean indicating if these elsets should be set as the 'current' for their corresponding
     * on-orbit/satellite numbers.
     */
    fun makeCurrent(): Boolean = makeCurrent

    /** Source of the elset data. */
    fun source(): String = source

    /**
     * Boolean indicating if a shell Onorbit/satellite should be created if the passed satellite
     * number doesn't exist.
     */
    fun autoCreateSats(): Optional<Boolean> = Optional.ofNullable(autoCreateSats)

    /**
     * Dissemination control of the passed elsets (e.g. to support tagging with proprietary
     * markings).
     */
    fun control(): Optional<String> = Optional.ofNullable(control)

    /** Origin of the elset data. */
    fun origin(): Optional<String> = Optional.ofNullable(origin)

    /**
     * Optional comma-delineated list of provider/source specific tags for this data, where each
     * element is no longer than 32 characters, used for implementing data owner conditional access
     * controls to restrict access to the data. Should be left null by data providers unless
     * conditional access controls are coordinated with the UDL team.
     */
    fun tags(): Optional<String> = Optional.ofNullable(tags)

    fun body(): String = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ElsetCreateBulkFromTleParams].
         *
         * The following fields are required:
         * ```java
         * .dataMode()
         * .makeCurrent()
         * .source()
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ElsetCreateBulkFromTleParams]. */
    class Builder internal constructor() {

        private var dataMode: String? = null
        private var makeCurrent: Boolean? = null
        private var source: String? = null
        private var autoCreateSats: Boolean? = null
        private var control: String? = null
        private var origin: String? = null
        private var tags: String? = null
        private var body: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(elsetCreateBulkFromTleParams: ElsetCreateBulkFromTleParams) = apply {
            dataMode = elsetCreateBulkFromTleParams.dataMode
            makeCurrent = elsetCreateBulkFromTleParams.makeCurrent
            source = elsetCreateBulkFromTleParams.source
            autoCreateSats = elsetCreateBulkFromTleParams.autoCreateSats
            control = elsetCreateBulkFromTleParams.control
            origin = elsetCreateBulkFromTleParams.origin
            tags = elsetCreateBulkFromTleParams.tags
            body = elsetCreateBulkFromTleParams.body
            additionalHeaders = elsetCreateBulkFromTleParams.additionalHeaders.toBuilder()
            additionalQueryParams = elsetCreateBulkFromTleParams.additionalQueryParams.toBuilder()
        }

        /** Data mode of the passed elsets (REAL, TEST, etc). */
        fun dataMode(dataMode: String) = apply { this.dataMode = dataMode }

        /**
         * Boolean indicating if these elsets should be set as the 'current' for their corresponding
         * on-orbit/satellite numbers.
         */
        fun makeCurrent(makeCurrent: Boolean) = apply { this.makeCurrent = makeCurrent }

        /** Source of the elset data. */
        fun source(source: String) = apply { this.source = source }

        /**
         * Boolean indicating if a shell Onorbit/satellite should be created if the passed satellite
         * number doesn't exist.
         */
        fun autoCreateSats(autoCreateSats: Boolean?) = apply {
            this.autoCreateSats = autoCreateSats
        }

        /**
         * Alias for [Builder.autoCreateSats].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun autoCreateSats(autoCreateSats: Boolean) = autoCreateSats(autoCreateSats as Boolean?)

        /** Alias for calling [Builder.autoCreateSats] with `autoCreateSats.orElse(null)`. */
        fun autoCreateSats(autoCreateSats: Optional<Boolean>) =
            autoCreateSats(autoCreateSats.getOrNull())

        /**
         * Dissemination control of the passed elsets (e.g. to support tagging with proprietary
         * markings).
         */
        fun control(control: String?) = apply { this.control = control }

        /** Alias for calling [Builder.control] with `control.orElse(null)`. */
        fun control(control: Optional<String>) = control(control.getOrNull())

        /** Origin of the elset data. */
        fun origin(origin: String?) = apply { this.origin = origin }

        /** Alias for calling [Builder.origin] with `origin.orElse(null)`. */
        fun origin(origin: Optional<String>) = origin(origin.getOrNull())

        /**
         * Optional comma-delineated list of provider/source specific tags for this data, where each
         * element is no longer than 32 characters, used for implementing data owner conditional
         * access controls to restrict access to the data. Should be left null by data providers
         * unless conditional access controls are coordinated with the UDL team.
         */
        fun tags(tags: String?) = apply { this.tags = tags }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<String>) = tags(tags.getOrNull())

        fun body(body: String) = apply { this.body = body }

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
         * Returns an immutable instance of [ElsetCreateBulkFromTleParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dataMode()
         * .makeCurrent()
         * .source()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ElsetCreateBulkFromTleParams =
            ElsetCreateBulkFromTleParams(
                checkRequired("dataMode", dataMode),
                checkRequired("makeCurrent", makeCurrent),
                checkRequired("source", source),
                autoCreateSats,
                control,
                origin,
                tags,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): String = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("dataMode", dataMode)
                put("makeCurrent", makeCurrent.toString())
                put("source", source)
                autoCreateSats?.let { put("autoCreateSats", it.toString()) }
                control?.let { put("control", it) }
                origin?.let { put("origin", it) }
                tags?.let { put("tags", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ElsetCreateBulkFromTleParams &&
            dataMode == other.dataMode &&
            makeCurrent == other.makeCurrent &&
            source == other.source &&
            autoCreateSats == other.autoCreateSats &&
            control == other.control &&
            origin == other.origin &&
            tags == other.tags &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            dataMode,
            makeCurrent,
            source,
            autoCreateSats,
            control,
            origin,
            tags,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ElsetCreateBulkFromTleParams{dataMode=$dataMode, makeCurrent=$makeCurrent, source=$source, autoCreateSats=$autoCreateSats, control=$control, origin=$origin, tags=$tags, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Search for files by metadata and/or text in file content. */
class ScSearchParams
private constructor(
    private val path: String,
    private val count: Int?,
    private val offset: Int?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The path to search from */
    fun path(): String = path

    /** Number of items per page */
    fun count(): Optional<Int> = Optional.ofNullable(count)

    /** First result to return */
    fun offset(): Optional<Int> = Optional.ofNullable(offset)

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun contentCriteria(): Optional<String> = body.contentCriteria()

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun metaDataCriteria(): Optional<MetaDataCriteria> = body.metaDataCriteria()

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nonRangeCriteria(): Optional<NonRangeCriteria> = body.nonRangeCriteria()

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeCriteria(): Optional<RangeCriteria> = body.rangeCriteria()

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun searchAfter(): Optional<String> = body.searchAfter()

    /**
     * Returns the raw JSON value of [contentCriteria].
     *
     * Unlike [contentCriteria], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contentCriteria(): JsonField<String> = body._contentCriteria()

    /**
     * Returns the raw JSON value of [metaDataCriteria].
     *
     * Unlike [metaDataCriteria], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _metaDataCriteria(): JsonField<MetaDataCriteria> = body._metaDataCriteria()

    /**
     * Returns the raw JSON value of [nonRangeCriteria].
     *
     * Unlike [nonRangeCriteria], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _nonRangeCriteria(): JsonField<NonRangeCriteria> = body._nonRangeCriteria()

    /**
     * Returns the raw JSON value of [rangeCriteria].
     *
     * Unlike [rangeCriteria], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rangeCriteria(): JsonField<RangeCriteria> = body._rangeCriteria()

    /**
     * Returns the raw JSON value of [searchAfter].
     *
     * Unlike [searchAfter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _searchAfter(): JsonField<String> = body._searchAfter()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ScSearchParams].
         *
         * The following fields are required:
         * ```java
         * .path()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScSearchParams]. */
    class Builder internal constructor() {

        private var path: String? = null
        private var count: Int? = null
        private var offset: Int? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(scSearchParams: ScSearchParams) = apply {
            path = scSearchParams.path
            count = scSearchParams.count
            offset = scSearchParams.offset
            body = scSearchParams.body.toBuilder()
            additionalHeaders = scSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = scSearchParams.additionalQueryParams.toBuilder()
        }

        /** The path to search from */
        fun path(path: String) = apply { this.path = path }

        /** Number of items per page */
        fun count(count: Int?) = apply { this.count = count }

        /**
         * Alias for [Builder.count].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun count(count: Int) = count(count as Int?)

        /** Alias for calling [Builder.count] with `count.orElse(null)`. */
        fun count(count: Optional<Int>) = count(count.getOrNull())

        /** First result to return */
        fun offset(offset: Int?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Int) = offset(offset as Int?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Int>) = offset(offset.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [contentCriteria]
         * - [metaDataCriteria]
         * - [nonRangeCriteria]
         * - [rangeCriteria]
         * - [searchAfter]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun contentCriteria(contentCriteria: String) = apply {
            body.contentCriteria(contentCriteria)
        }

        /**
         * Sets [Builder.contentCriteria] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentCriteria] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contentCriteria(contentCriteria: JsonField<String>) = apply {
            body.contentCriteria(contentCriteria)
        }

        fun metaDataCriteria(metaDataCriteria: MetaDataCriteria) = apply {
            body.metaDataCriteria(metaDataCriteria)
        }

        /**
         * Sets [Builder.metaDataCriteria] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metaDataCriteria] with a well-typed [MetaDataCriteria]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun metaDataCriteria(metaDataCriteria: JsonField<MetaDataCriteria>) = apply {
            body.metaDataCriteria(metaDataCriteria)
        }

        fun nonRangeCriteria(nonRangeCriteria: NonRangeCriteria) = apply {
            body.nonRangeCriteria(nonRangeCriteria)
        }

        /**
         * Sets [Builder.nonRangeCriteria] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nonRangeCriteria] with a well-typed [NonRangeCriteria]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun nonRangeCriteria(nonRangeCriteria: JsonField<NonRangeCriteria>) = apply {
            body.nonRangeCriteria(nonRangeCriteria)
        }

        fun rangeCriteria(rangeCriteria: RangeCriteria) = apply {
            body.rangeCriteria(rangeCriteria)
        }

        /**
         * Sets [Builder.rangeCriteria] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeCriteria] with a well-typed [RangeCriteria] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rangeCriteria(rangeCriteria: JsonField<RangeCriteria>) = apply {
            body.rangeCriteria(rangeCriteria)
        }

        fun searchAfter(searchAfter: String) = apply { body.searchAfter(searchAfter) }

        /**
         * Sets [Builder.searchAfter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchAfter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun searchAfter(searchAfter: JsonField<String>) = apply { body.searchAfter(searchAfter) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [ScSearchParams].
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
        fun build(): ScSearchParams =
            ScSearchParams(
                checkRequired("path", path),
                count,
                offset,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("path", path)
                count?.let { put("count", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    private constructor(
        private val contentCriteria: JsonField<String>,
        private val metaDataCriteria: JsonField<MetaDataCriteria>,
        private val nonRangeCriteria: JsonField<NonRangeCriteria>,
        private val rangeCriteria: JsonField<RangeCriteria>,
        private val searchAfter: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contentCriteria")
            @ExcludeMissing
            contentCriteria: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metaDataCriteria")
            @ExcludeMissing
            metaDataCriteria: JsonField<MetaDataCriteria> = JsonMissing.of(),
            @JsonProperty("nonRangeCriteria")
            @ExcludeMissing
            nonRangeCriteria: JsonField<NonRangeCriteria> = JsonMissing.of(),
            @JsonProperty("rangeCriteria")
            @ExcludeMissing
            rangeCriteria: JsonField<RangeCriteria> = JsonMissing.of(),
            @JsonProperty("searchAfter")
            @ExcludeMissing
            searchAfter: JsonField<String> = JsonMissing.of(),
        ) : this(
            contentCriteria,
            metaDataCriteria,
            nonRangeCriteria,
            rangeCriteria,
            searchAfter,
            mutableMapOf(),
        )

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun contentCriteria(): Optional<String> = contentCriteria.getOptional("contentCriteria")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun metaDataCriteria(): Optional<MetaDataCriteria> =
            metaDataCriteria.getOptional("metaDataCriteria")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun nonRangeCriteria(): Optional<NonRangeCriteria> =
            nonRangeCriteria.getOptional("nonRangeCriteria")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rangeCriteria(): Optional<RangeCriteria> = rangeCriteria.getOptional("rangeCriteria")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun searchAfter(): Optional<String> = searchAfter.getOptional("searchAfter")

        /**
         * Returns the raw JSON value of [contentCriteria].
         *
         * Unlike [contentCriteria], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contentCriteria")
        @ExcludeMissing
        fun _contentCriteria(): JsonField<String> = contentCriteria

        /**
         * Returns the raw JSON value of [metaDataCriteria].
         *
         * Unlike [metaDataCriteria], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("metaDataCriteria")
        @ExcludeMissing
        fun _metaDataCriteria(): JsonField<MetaDataCriteria> = metaDataCriteria

        /**
         * Returns the raw JSON value of [nonRangeCriteria].
         *
         * Unlike [nonRangeCriteria], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("nonRangeCriteria")
        @ExcludeMissing
        fun _nonRangeCriteria(): JsonField<NonRangeCriteria> = nonRangeCriteria

        /**
         * Returns the raw JSON value of [rangeCriteria].
         *
         * Unlike [rangeCriteria], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rangeCriteria")
        @ExcludeMissing
        fun _rangeCriteria(): JsonField<RangeCriteria> = rangeCriteria

        /**
         * Returns the raw JSON value of [searchAfter].
         *
         * Unlike [searchAfter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("searchAfter")
        @ExcludeMissing
        fun _searchAfter(): JsonField<String> = searchAfter

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var contentCriteria: JsonField<String> = JsonMissing.of()
            private var metaDataCriteria: JsonField<MetaDataCriteria> = JsonMissing.of()
            private var nonRangeCriteria: JsonField<NonRangeCriteria> = JsonMissing.of()
            private var rangeCriteria: JsonField<RangeCriteria> = JsonMissing.of()
            private var searchAfter: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                contentCriteria = body.contentCriteria
                metaDataCriteria = body.metaDataCriteria
                nonRangeCriteria = body.nonRangeCriteria
                rangeCriteria = body.rangeCriteria
                searchAfter = body.searchAfter
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun contentCriteria(contentCriteria: String) =
                contentCriteria(JsonField.of(contentCriteria))

            /**
             * Sets [Builder.contentCriteria] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentCriteria] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentCriteria(contentCriteria: JsonField<String>) = apply {
                this.contentCriteria = contentCriteria
            }

            fun metaDataCriteria(metaDataCriteria: MetaDataCriteria) =
                metaDataCriteria(JsonField.of(metaDataCriteria))

            /**
             * Sets [Builder.metaDataCriteria] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metaDataCriteria] with a well-typed
             * [MetaDataCriteria] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun metaDataCriteria(metaDataCriteria: JsonField<MetaDataCriteria>) = apply {
                this.metaDataCriteria = metaDataCriteria
            }

            fun nonRangeCriteria(nonRangeCriteria: NonRangeCriteria) =
                nonRangeCriteria(JsonField.of(nonRangeCriteria))

            /**
             * Sets [Builder.nonRangeCriteria] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nonRangeCriteria] with a well-typed
             * [NonRangeCriteria] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun nonRangeCriteria(nonRangeCriteria: JsonField<NonRangeCriteria>) = apply {
                this.nonRangeCriteria = nonRangeCriteria
            }

            fun rangeCriteria(rangeCriteria: RangeCriteria) =
                rangeCriteria(JsonField.of(rangeCriteria))

            /**
             * Sets [Builder.rangeCriteria] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rangeCriteria] with a well-typed [RangeCriteria]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun rangeCriteria(rangeCriteria: JsonField<RangeCriteria>) = apply {
                this.rangeCriteria = rangeCriteria
            }

            fun searchAfter(searchAfter: String) = searchAfter(JsonField.of(searchAfter))

            /**
             * Sets [Builder.searchAfter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.searchAfter] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun searchAfter(searchAfter: JsonField<String>) = apply {
                this.searchAfter = searchAfter
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    contentCriteria,
                    metaDataCriteria,
                    nonRangeCriteria,
                    rangeCriteria,
                    searchAfter,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            contentCriteria()
            metaDataCriteria().ifPresent { it.validate() }
            nonRangeCriteria().ifPresent { it.validate() }
            rangeCriteria().ifPresent { it.validate() }
            searchAfter()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: UnifieddatalibraryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (contentCriteria.asKnown().isPresent) 1 else 0) +
                (metaDataCriteria.asKnown().getOrNull()?.validity() ?: 0) +
                (nonRangeCriteria.asKnown().getOrNull()?.validity() ?: 0) +
                (rangeCriteria.asKnown().getOrNull()?.validity() ?: 0) +
                (if (searchAfter.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && contentCriteria == other.contentCriteria && metaDataCriteria == other.metaDataCriteria && nonRangeCriteria == other.nonRangeCriteria && rangeCriteria == other.rangeCriteria && searchAfter == other.searchAfter && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contentCriteria, metaDataCriteria, nonRangeCriteria, rangeCriteria, searchAfter, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{contentCriteria=$contentCriteria, metaDataCriteria=$metaDataCriteria, nonRangeCriteria=$nonRangeCriteria, rangeCriteria=$rangeCriteria, searchAfter=$searchAfter, additionalProperties=$additionalProperties}"
    }

    class MetaDataCriteria
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [MetaDataCriteria]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MetaDataCriteria]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metaDataCriteria: MetaDataCriteria) = apply {
                additionalProperties = metaDataCriteria.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [MetaDataCriteria].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MetaDataCriteria = MetaDataCriteria(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): MetaDataCriteria = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: UnifieddatalibraryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MetaDataCriteria && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "MetaDataCriteria{additionalProperties=$additionalProperties}"
    }

    class NonRangeCriteria
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [NonRangeCriteria]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [NonRangeCriteria]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(nonRangeCriteria: NonRangeCriteria) = apply {
                additionalProperties = nonRangeCriteria.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [NonRangeCriteria].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): NonRangeCriteria = NonRangeCriteria(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): NonRangeCriteria = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: UnifieddatalibraryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NonRangeCriteria && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "NonRangeCriteria{additionalProperties=$additionalProperties}"
    }

    class RangeCriteria
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [RangeCriteria]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RangeCriteria]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rangeCriteria: RangeCriteria) = apply {
                additionalProperties = rangeCriteria.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [RangeCriteria].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RangeCriteria = RangeCriteria(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): RangeCriteria = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: UnifieddatalibraryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RangeCriteria && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "RangeCriteria{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScSearchParams && path == other.path && count == other.count && offset == other.offset && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(path, count, offset, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ScSearchParams{path=$path, count=$count, offset=$offset, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

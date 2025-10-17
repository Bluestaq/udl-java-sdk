// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import com.unifieddatalibrary.api.models.scs.SearchCriterion
import com.unifieddatalibrary.api.models.scs.SearchLogicalCriterion
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Operation to search for files in the Secure Content Store. */
class V2SearchParams
private constructor(
    private val order: String?,
    private val searchAfter: String?,
    private val size: Int?,
    private val sort: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

    /**
     * A search criterion, which can be a simple field comparison or a logical combination of other
     * criteria.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun query(): Optional<SearchCriterion> = body.query()

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _query(): JsonField<SearchCriterion> = body._query()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): V2SearchParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [V2SearchParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2SearchParams]. */
    class Builder internal constructor() {

        private var order: String? = null
        private var searchAfter: String? = null
        private var size: Int? = null
        private var sort: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v2SearchParams: V2SearchParams) = apply {
            order = v2SearchParams.order
            searchAfter = v2SearchParams.searchAfter
            size = v2SearchParams.size
            sort = v2SearchParams.sort
            body = v2SearchParams.body.toBuilder()
            additionalHeaders = v2SearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = v2SearchParams.additionalQueryParams.toBuilder()
        }

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

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [query]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * A search criterion, which can be a simple field comparison or a logical combination of
         * other criteria.
         */
        fun query(query: SearchCriterion) = apply { body.query(query) }

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [SearchCriterion] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun query(query: JsonField<SearchCriterion>) = apply { body.query(query) }

        /** Alias for calling [query] with `SearchCriterion.ofScsSearchField(scsSearchField)`. */
        fun query(scsSearchField: SearchCriterion.ScsSearchFieldCriterion) = apply {
            body.query(scsSearchField)
        }

        /** Alias for calling [query] with `SearchCriterion.ofLogical(logical)`. */
        fun query(logical: SearchLogicalCriterion) = apply { body.query(logical) }

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
         * Returns an immutable instance of [V2SearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V2SearchParams =
            V2SearchParams(
                order,
                searchAfter,
                size,
                sort,
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
                order?.let { put("order", it) }
                searchAfter?.let { put("searchAfter", it) }
                size?.let { put("size", it.toString()) }
                sort?.let { put("sort", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Top-level query object containing search criteria. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val query: JsonField<SearchCriterion>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("query")
            @ExcludeMissing
            query: JsonField<SearchCriterion> = JsonMissing.of()
        ) : this(query, mutableMapOf())

        /**
         * A search criterion, which can be a simple field comparison or a logical combination of
         * other criteria.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun query(): Optional<SearchCriterion> = query.getOptional("query")

        /**
         * Returns the raw JSON value of [query].
         *
         * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<SearchCriterion> = query

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

            private var query: JsonField<SearchCriterion> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                query = body.query
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * A search criterion, which can be a simple field comparison or a logical combination
             * of other criteria.
             */
            fun query(query: SearchCriterion) = query(JsonField.of(query))

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [SearchCriterion] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<SearchCriterion>) = apply { this.query = query }

            /**
             * Alias for calling [query] with `SearchCriterion.ofScsSearchField(scsSearchField)`.
             */
            fun query(scsSearchField: SearchCriterion.ScsSearchFieldCriterion) =
                query(SearchCriterion.ofScsSearchField(scsSearchField))

            /** Alias for calling [query] with `SearchCriterion.ofLogical(logical)`. */
            fun query(logical: SearchLogicalCriterion) = query(SearchCriterion.ofLogical(logical))

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
            fun build(): Body = Body(query, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            query().ifPresent { it.validate() }
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
        @JvmSynthetic internal fun validity(): Int = (query.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                query == other.query &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(query, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{query=$query, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V2SearchParams &&
            order == other.order &&
            searchAfter == other.searchAfter &&
            size == other.size &&
            sort == other.sort &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(order, searchAfter, size, sort, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V2SearchParams{order=$order, searchAfter=$searchAfter, size=$size, sort=$sort, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

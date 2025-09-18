// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Combines multiple search criteria with a logical operator (AND, OR, NOT). */
class SearchLogicalCriterion
private constructor(
    private val criteria: JsonField<List<SearchCriterion>>,
    private val operator: JsonField<Operator>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("criteria")
        @ExcludeMissing
        criteria: JsonField<List<SearchCriterion>> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
    ) : this(criteria, operator, mutableMapOf())

    /**
     * List of search criteria to combine
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun criteria(): Optional<List<SearchCriterion>> = criteria.getOptional("criteria")

    /**
     * Supported search operators
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operator(): Optional<Operator> = operator.getOptional("operator")

    /**
     * Returns the raw JSON value of [criteria].
     *
     * Unlike [criteria], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("criteria")
    @ExcludeMissing
    fun _criteria(): JsonField<List<SearchCriterion>> = criteria

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

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

        /** Returns a mutable builder for constructing an instance of [SearchLogicalCriterion]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SearchLogicalCriterion]. */
    class Builder internal constructor() {

        private var criteria: JsonField<MutableList<SearchCriterion>>? = null
        private var operator: JsonField<Operator> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(searchLogicalCriterion: SearchLogicalCriterion) = apply {
            criteria = searchLogicalCriterion.criteria.map { it.toMutableList() }
            operator = searchLogicalCriterion.operator
            additionalProperties = searchLogicalCriterion.additionalProperties.toMutableMap()
        }

        /** List of search criteria to combine */
        fun criteria(criteria: List<SearchCriterion>) = criteria(JsonField.of(criteria))

        /**
         * Sets [Builder.criteria] to an arbitrary JSON value.
         *
         * You should usually call [Builder.criteria] with a well-typed `List<SearchCriterion>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun criteria(criteria: JsonField<List<SearchCriterion>>) = apply {
            this.criteria = criteria.map { it.toMutableList() }
        }

        /**
         * Adds a single [SearchCriterion] to [criteria].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCriterion(criterion: SearchCriterion) = apply {
            criteria =
                (criteria ?: JsonField.of(mutableListOf())).also {
                    checkKnown("criteria", it).add(criterion)
                }
        }

        /**
         * Alias for calling [addCriterion] with `SearchCriterion.ofScsSearchField(scsSearchField)`.
         */
        fun addCriterion(scsSearchField: SearchCriterion.ScsSearchFieldCriterion) =
            addCriterion(SearchCriterion.ofScsSearchField(scsSearchField))

        /** Alias for calling [addCriterion] with `SearchCriterion.ofLogical(logical)`. */
        fun addCriterion(logical: SearchLogicalCriterion) =
            addCriterion(SearchCriterion.ofLogical(logical))

        /** Supported search operators */
        fun operator(operator: Operator) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [Operator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

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
         * Returns an immutable instance of [SearchLogicalCriterion].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SearchLogicalCriterion =
            SearchLogicalCriterion(
                (criteria ?: JsonMissing.of()).map { it.toImmutable() },
                operator,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SearchLogicalCriterion = apply {
        if (validated) {
            return@apply
        }

        criteria().ifPresent { it.forEach { it.validate() } }
        operator().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (criteria.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0)

    /** Supported search operators */
    class Operator @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AND = of("AND")

            @JvmField val OR = of("OR")

            @JvmField val NOT = of("NOT")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            AND,
            OR,
            NOT,
        }

        /**
         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Operator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AND,
            OR,
            NOT,
            /** An enum member indicating that [Operator] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AND -> Value.AND
                OR -> Value.OR
                NOT -> Value.NOT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                AND -> Known.AND
                OR -> Known.OR
                NOT -> Known.NOT
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Operator: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                UnifieddatalibraryInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Operator = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Operator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SearchLogicalCriterion &&
            criteria == other.criteria &&
            operator == other.operator &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(criteria, operator, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SearchLogicalCriterion{criteria=$criteria, operator=$operator, additionalProperties=$additionalProperties}"
}

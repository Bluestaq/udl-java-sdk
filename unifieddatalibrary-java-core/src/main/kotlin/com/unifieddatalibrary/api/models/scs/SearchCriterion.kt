// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.BaseDeserializer
import com.unifieddatalibrary.api.core.BaseSerializer
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.allMaxBy
import com.unifieddatalibrary.api.core.getOrThrow
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A search criterion, which can be a simple field comparison or a logical combination of other
 * criteria.
 */
@JsonDeserialize(using = SearchCriterion.Deserializer::class)
@JsonSerialize(using = SearchCriterion.Serializer::class)
class SearchCriterion
private constructor(
    private val scsSearchField: ScsSearchFieldCriterion? = null,
    private val logical: SearchLogicalCriterion? = null,
    private val _json: JsonValue? = null,
) {

    /** A search on a specific field with a given value and operator. */
    fun scsSearchField(): Optional<ScsSearchFieldCriterion> = Optional.ofNullable(scsSearchField)

    /** Combines multiple search criteria with a logical operator (AND, OR, NOT). */
    fun logical(): Optional<SearchLogicalCriterion> = Optional.ofNullable(logical)

    fun isScsSearchField(): Boolean = scsSearchField != null

    fun isLogical(): Boolean = logical != null

    /** A search on a specific field with a given value and operator. */
    fun asScsSearchField(): ScsSearchFieldCriterion = scsSearchField.getOrThrow("scsSearchField")

    /** Combines multiple search criteria with a logical operator (AND, OR, NOT). */
    fun asLogical(): SearchLogicalCriterion = logical.getOrThrow("logical")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            scsSearchField != null -> visitor.visitScsSearchField(scsSearchField)
            logical != null -> visitor.visitLogical(logical)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): SearchCriterion = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitScsSearchField(scsSearchField: ScsSearchFieldCriterion) {
                    scsSearchField.validate()
                }

                override fun visitLogical(logical: SearchLogicalCriterion) {
                    logical.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitScsSearchField(scsSearchField: ScsSearchFieldCriterion) =
                    scsSearchField.validity()

                override fun visitLogical(logical: SearchLogicalCriterion) = logical.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SearchCriterion &&
            scsSearchField == other.scsSearchField &&
            logical == other.logical
    }

    override fun hashCode(): Int = Objects.hash(scsSearchField, logical)

    override fun toString(): String =
        when {
            scsSearchField != null -> "SearchCriterion{scsSearchField=$scsSearchField}"
            logical != null -> "SearchCriterion{logical=$logical}"
            _json != null -> "SearchCriterion{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid SearchCriterion")
        }

    companion object {

        /** A search on a specific field with a given value and operator. */
        @JvmStatic
        fun ofScsSearchField(scsSearchField: ScsSearchFieldCriterion) =
            SearchCriterion(scsSearchField = scsSearchField)

        /** Combines multiple search criteria with a logical operator (AND, OR, NOT). */
        @JvmStatic
        fun ofLogical(logical: SearchLogicalCriterion) = SearchCriterion(logical = logical)
    }

    /**
     * An interface that defines how to map each variant of [SearchCriterion] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** A search on a specific field with a given value and operator. */
        fun visitScsSearchField(scsSearchField: ScsSearchFieldCriterion): T

        /** Combines multiple search criteria with a logical operator (AND, OR, NOT). */
        fun visitLogical(logical: SearchLogicalCriterion): T

        /**
         * Maps an unknown variant of [SearchCriterion] to a value of type [T].
         *
         * An instance of [SearchCriterion] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws UnifieddatalibraryInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw UnifieddatalibraryInvalidDataException("Unknown SearchCriterion: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<SearchCriterion>(SearchCriterion::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): SearchCriterion {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ScsSearchFieldCriterion>())?.let {
                            SearchCriterion(scsSearchField = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SearchLogicalCriterion>())?.let {
                            SearchCriterion(logical = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> SearchCriterion(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<SearchCriterion>(SearchCriterion::class) {

        override fun serialize(
            value: SearchCriterion,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.scsSearchField != null -> generator.writeObject(value.scsSearchField)
                value.logical != null -> generator.writeObject(value.logical)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid SearchCriterion")
            }
        }
    }

    /** A search on a specific field with a given value and operator. */
    class ScsSearchFieldCriterion
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val field: JsonField<String>,
        private val operator: JsonField<Operator>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("field") @ExcludeMissing field: JsonField<String> = JsonMissing.of(),
            @JsonProperty("operator")
            @ExcludeMissing
            operator: JsonField<Operator> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(field, operator, value, mutableMapOf())

        /**
         * The field to search on (e.g., attachment.content, createdBy).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun field(): Optional<String> = field.getOptional("field")

        /**
         * Supported search operators
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun operator(): Optional<Operator> = operator.getOptional("operator")

        /**
         * The value to compare against (e.g., The Great Gatsby)
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [field].
         *
         * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

        /**
         * Returns the raw JSON value of [operator].
         *
         * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

            /**
             * Returns a mutable builder for constructing an instance of [ScsSearchFieldCriterion].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ScsSearchFieldCriterion]. */
        class Builder internal constructor() {

            private var field: JsonField<String> = JsonMissing.of()
            private var operator: JsonField<Operator> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scsSearchFieldCriterion: ScsSearchFieldCriterion) = apply {
                field = scsSearchFieldCriterion.field
                operator = scsSearchFieldCriterion.operator
                value = scsSearchFieldCriterion.value
                additionalProperties = scsSearchFieldCriterion.additionalProperties.toMutableMap()
            }

            /** The field to search on (e.g., attachment.content, createdBy). */
            fun field(field: String) = field(JsonField.of(field))

            /**
             * Sets [Builder.field] to an arbitrary JSON value.
             *
             * You should usually call [Builder.field] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun field(field: JsonField<String>) = apply { this.field = field }

            /** Supported search operators */
            fun operator(operator: Operator) = operator(JsonField.of(operator))

            /**
             * Sets [Builder.operator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operator] with a well-typed [Operator] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

            /** The value to compare against (e.g., The Great Gatsby) */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [ScsSearchFieldCriterion].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ScsSearchFieldCriterion =
                ScsSearchFieldCriterion(field, operator, value, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): ScsSearchFieldCriterion = apply {
            if (validated) {
                return@apply
            }

            field()
            operator().ifPresent { it.validate() }
            value()
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
            (if (field.asKnown().isPresent) 1 else 0) +
                (operator.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        /** Supported search operators */
        class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EXACT_MATCH = of("EXACT_MATCH")

                @JvmField val WILDCARD = of("WILDCARD")

                @JvmField val FUZZY = of("FUZZY")

                @JvmField val GTE = of("GTE")

                @JvmField val LTE = of("LTE")

                @JvmField val GT = of("GT")

                @JvmField val LT = of("LT")

                @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
            }

            /** An enum containing [Operator]'s known values. */
            enum class Known {
                EXACT_MATCH,
                WILDCARD,
                FUZZY,
                GTE,
                LTE,
                GT,
                LT,
            }

            /**
             * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Operator] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EXACT_MATCH,
                WILDCARD,
                FUZZY,
                GTE,
                LTE,
                GT,
                LT,
                /**
                 * An enum member indicating that [Operator] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    EXACT_MATCH -> Value.EXACT_MATCH
                    WILDCARD -> Value.WILDCARD
                    FUZZY -> Value.FUZZY
                    GTE -> Value.GTE
                    LTE -> Value.LTE
                    GT -> Value.GT
                    LT -> Value.LT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
             */
            fun known(): Known =
                when (this) {
                    EXACT_MATCH -> Known.EXACT_MATCH
                    WILDCARD -> Known.WILDCARD
                    FUZZY -> Known.FUZZY
                    GTE -> Known.GTE
                    LTE -> Known.LTE
                    GT -> Known.GT
                    LT -> Known.LT
                    else -> throw UnifieddatalibraryInvalidDataException("Unknown Operator: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

            return other is ScsSearchFieldCriterion &&
                field == other.field &&
                operator == other.operator &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(field, operator, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScsSearchFieldCriterion{field=$field, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
    }
}

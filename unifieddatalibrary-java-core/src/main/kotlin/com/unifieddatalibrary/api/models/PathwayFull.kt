// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Collection detailing operational pathways at the Site associated with this SiteOperations record. */
class PathwayFull private constructor(
    private val pwDefinition: JsonField<String>,
    private val pwLastChangedBy: JsonField<String>,
    private val pwLastChangedDate: JsonField<OffsetDateTime>,
    private val pwType: JsonField<String>,
    private val pwUsage: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("pwDefinition") @ExcludeMissing pwDefinition: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pwLastChangedBy") @ExcludeMissing pwLastChangedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pwLastChangedDate") @ExcludeMissing pwLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("pwType") @ExcludeMissing pwType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pwUsage") @ExcludeMissing pwUsage: JsonField<String> = JsonMissing.of()
    ) : this(
      pwDefinition,
      pwLastChangedBy,
      pwLastChangedDate,
      pwType,
      pwUsage,
      mutableMapOf(),
    )

    /**
     * Text defining this pathway from its constituent parts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun pwDefinition(): Optional<String> = pwDefinition.getOptional("pwDefinition")

    /**
     * The name of the person who made the most recent change to this Pathway data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun pwLastChangedBy(): Optional<String> = pwLastChangedBy.getOptional("pwLastChangedBy")

    /**
     * The datetime of the most recent change made to this Pathway data, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun pwLastChangedDate(): Optional<OffsetDateTime> = pwLastChangedDate.getOptional("pwLastChangedDate")

    /**
     * The type of paths that constitute this pathway.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun pwType(): Optional<String> = pwType.getOptional("pwType")

    /**
     * The intended use of this pathway.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun pwUsage(): Optional<String> = pwUsage.getOptional("pwUsage")

    /**
     * Returns the raw JSON value of [pwDefinition].
     *
     * Unlike [pwDefinition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pwDefinition")
    @ExcludeMissing
    fun _pwDefinition(): JsonField<String> = pwDefinition

    /**
     * Returns the raw JSON value of [pwLastChangedBy].
     *
     * Unlike [pwLastChangedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pwLastChangedBy")
    @ExcludeMissing
    fun _pwLastChangedBy(): JsonField<String> = pwLastChangedBy

    /**
     * Returns the raw JSON value of [pwLastChangedDate].
     *
     * Unlike [pwLastChangedDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pwLastChangedDate")
    @ExcludeMissing
    fun _pwLastChangedDate(): JsonField<OffsetDateTime> = pwLastChangedDate

    /**
     * Returns the raw JSON value of [pwType].
     *
     * Unlike [pwType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pwType")
    @ExcludeMissing
    fun _pwType(): JsonField<String> = pwType

    /**
     * Returns the raw JSON value of [pwUsage].
     *
     * Unlike [pwUsage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pwUsage")
    @ExcludeMissing
    fun _pwUsage(): JsonField<String> = pwUsage

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
      additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [PathwayFull]. */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [PathwayFull]. */
    class Builder internal constructor() {

        private var pwDefinition: JsonField<String> = JsonMissing.of()
        private var pwLastChangedBy: JsonField<String> = JsonMissing.of()
        private var pwLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var pwType: JsonField<String> = JsonMissing.of()
        private var pwUsage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pathwayFull: PathwayFull) =
            apply {
                pwDefinition = pathwayFull.pwDefinition
                pwLastChangedBy = pathwayFull.pwLastChangedBy
                pwLastChangedDate = pathwayFull.pwLastChangedDate
                pwType = pathwayFull.pwType
                pwUsage = pathwayFull.pwUsage
                additionalProperties = pathwayFull.additionalProperties.toMutableMap()
            }

        /** Text defining this pathway from its constituent parts. */
        fun pwDefinition(pwDefinition: String) = pwDefinition(JsonField.of(pwDefinition))

        /**
         * Sets [Builder.pwDefinition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pwDefinition] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pwDefinition(pwDefinition: JsonField<String>) =
            apply {
                this.pwDefinition = pwDefinition
            }

        /** The name of the person who made the most recent change to this Pathway data. */
        fun pwLastChangedBy(pwLastChangedBy: String) = pwLastChangedBy(JsonField.of(pwLastChangedBy))

        /**
         * Sets [Builder.pwLastChangedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pwLastChangedBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pwLastChangedBy(pwLastChangedBy: JsonField<String>) =
            apply {
                this.pwLastChangedBy = pwLastChangedBy
            }

        /** The datetime of the most recent change made to this Pathway data, in ISO 8601 UTC format with millisecond precision. */
        fun pwLastChangedDate(pwLastChangedDate: OffsetDateTime) = pwLastChangedDate(JsonField.of(pwLastChangedDate))

        /**
         * Sets [Builder.pwLastChangedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pwLastChangedDate] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pwLastChangedDate(pwLastChangedDate: JsonField<OffsetDateTime>) =
            apply {
                this.pwLastChangedDate = pwLastChangedDate
            }

        /** The type of paths that constitute this pathway. */
        fun pwType(pwType: String) = pwType(JsonField.of(pwType))

        /**
         * Sets [Builder.pwType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pwType] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pwType(pwType: JsonField<String>) =
            apply {
                this.pwType = pwType
            }

        /** The intended use of this pathway. */
        fun pwUsage(pwUsage: String) = pwUsage(JsonField.of(pwUsage))

        /**
         * Sets [Builder.pwUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pwUsage] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pwUsage(pwUsage: JsonField<String>) =
            apply {
                this.pwUsage = pwUsage
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        /**
         * Returns an immutable instance of [PathwayFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PathwayFull =
            PathwayFull(
              pwDefinition,
              pwLastChangedBy,
              pwLastChangedDate,
              pwType,
              pwUsage,
              additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PathwayFull =
        apply {
            if (validated) {
              return@apply
            }

            pwDefinition()
            pwLastChangedBy()
            pwLastChangedDate()
            pwType()
            pwUsage()
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
    internal fun validity(): Int = (if (pwDefinition.asKnown().isPresent) 1 else 0) + (if (pwLastChangedBy.asKnown().isPresent) 1 else 0) + (if (pwLastChangedDate.asKnown().isPresent) 1 else 0) + (if (pwType.asKnown().isPresent) 1 else 0) + (if (pwUsage.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is PathwayFull && pwDefinition == other.pwDefinition && pwLastChangedBy == other.pwLastChangedBy && pwLastChangedDate == other.pwLastChangedDate && pwType == other.pwType && pwUsage == other.pwUsage && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(pwDefinition, pwLastChangedBy, pwLastChangedDate, pwType, pwUsage, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "PathwayFull{pwDefinition=$pwDefinition, pwLastChangedBy=$pwLastChangedBy, pwLastChangedDate=$pwLastChangedDate, pwType=$pwType, pwUsage=$pwUsage, additionalProperties=$additionalProperties}"
}

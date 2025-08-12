// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectresponses

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class EffectResponseMetricsFull private constructor(
    private val domainValue: JsonField<Double>,
    private val metricType: JsonField<String>,
    private val provenance: JsonField<String>,
    private val relativeValue: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("domainValue") @ExcludeMissing domainValue: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("metricType") @ExcludeMissing metricType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provenance") @ExcludeMissing provenance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("relativeValue") @ExcludeMissing relativeValue: JsonField<Double> = JsonMissing.of()
    ) : this(
      domainValue,
      metricType,
      provenance,
      relativeValue,
      mutableMapOf(),
    )

    /**
     * The metric score specific to its domain.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun domainValue(): Optional<Double> = domainValue.getOptional("domainValue")

    /**
     * The type of the metric (e.g. CollateralDamage, GoalAchievement, OpportunityCost, Timeliness, Unavailable, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun metricType(): Optional<String> = metricType.getOptional("metricType")

    /**
     * The metric that was used to score this task.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun provenance(): Optional<String> = provenance.getOptional("provenance")

    /**
     * The metric score adjusted to be relative and comparable to other domains.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun relativeValue(): Optional<Double> = relativeValue.getOptional("relativeValue")

    /**
     * Returns the raw JSON value of [domainValue].
     *
     * Unlike [domainValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domainValue")
    @ExcludeMissing
    fun _domainValue(): JsonField<Double> = domainValue

    /**
     * Returns the raw JSON value of [metricType].
     *
     * Unlike [metricType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metricType")
    @ExcludeMissing
    fun _metricType(): JsonField<String> = metricType

    /**
     * Returns the raw JSON value of [provenance].
     *
     * Unlike [provenance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provenance")
    @ExcludeMissing
    fun _provenance(): JsonField<String> = provenance

    /**
     * Returns the raw JSON value of [relativeValue].
     *
     * Unlike [relativeValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("relativeValue")
    @ExcludeMissing
    fun _relativeValue(): JsonField<Double> = relativeValue

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
      additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [EffectResponseMetricsFull]. */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [EffectResponseMetricsFull]. */
    class Builder internal constructor() {

        private var domainValue: JsonField<Double> = JsonMissing.of()
        private var metricType: JsonField<String> = JsonMissing.of()
        private var provenance: JsonField<String> = JsonMissing.of()
        private var relativeValue: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(effectResponseMetricsFull: EffectResponseMetricsFull) =
            apply {
                domainValue = effectResponseMetricsFull.domainValue
                metricType = effectResponseMetricsFull.metricType
                provenance = effectResponseMetricsFull.provenance
                relativeValue = effectResponseMetricsFull.relativeValue
                additionalProperties = effectResponseMetricsFull.additionalProperties.toMutableMap()
            }

        /** The metric score specific to its domain. */
        fun domainValue(domainValue: Double) = domainValue(JsonField.of(domainValue))

        /**
         * Sets [Builder.domainValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domainValue] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun domainValue(domainValue: JsonField<Double>) =
            apply {
                this.domainValue = domainValue
            }

        /** The type of the metric (e.g. CollateralDamage, GoalAchievement, OpportunityCost, Timeliness, Unavailable, etc.). */
        fun metricType(metricType: String) = metricType(JsonField.of(metricType))

        /**
         * Sets [Builder.metricType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metricType] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metricType(metricType: JsonField<String>) =
            apply {
                this.metricType = metricType
            }

        /** The metric that was used to score this task. */
        fun provenance(provenance: String) = provenance(JsonField.of(provenance))

        /**
         * Sets [Builder.provenance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provenance] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun provenance(provenance: JsonField<String>) =
            apply {
                this.provenance = provenance
            }

        /** The metric score adjusted to be relative and comparable to other domains. */
        fun relativeValue(relativeValue: Double) = relativeValue(JsonField.of(relativeValue))

        /**
         * Sets [Builder.relativeValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relativeValue] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun relativeValue(relativeValue: JsonField<Double>) =
            apply {
                this.relativeValue = relativeValue
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
         * Returns an immutable instance of [EffectResponseMetricsFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EffectResponseMetricsFull =
            EffectResponseMetricsFull(
              domainValue,
              metricType,
              provenance,
              relativeValue,
              additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EffectResponseMetricsFull =
        apply {
            if (validated) {
              return@apply
            }

            domainValue()
            metricType()
            provenance()
            relativeValue()
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
    internal fun validity(): Int = (if (domainValue.asKnown().isPresent) 1 else 0) + (if (metricType.asKnown().isPresent) 1 else 0) + (if (provenance.asKnown().isPresent) 1 else 0) + (if (relativeValue.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is EffectResponseMetricsFull && domainValue == other.domainValue && metricType == other.metricType && provenance == other.provenance && relativeValue == other.relativeValue && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(domainValue, metricType, provenance, relativeValue, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "EffectResponseMetricsFull{domainValue=$domainValue, metricType=$metricType, provenance=$provenance, relativeValue=$relativeValue, additionalProperties=$additionalProperties}"
}

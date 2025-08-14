// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackroute

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

/** Minimum and maximum altitude bounds for the track. */
class AltitudeBlocksIngest
private constructor(
    private val altitudeSequenceId: JsonField<String>,
    private val lowerAltitude: JsonField<Double>,
    private val upperAltitude: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("altitudeSequenceId")
        @ExcludeMissing
        altitudeSequenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lowerAltitude")
        @ExcludeMissing
        lowerAltitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("upperAltitude")
        @ExcludeMissing
        upperAltitude: JsonField<Double> = JsonMissing.of(),
    ) : this(altitudeSequenceId, lowerAltitude, upperAltitude, mutableMapOf())

    /**
     * Sequencing field for the altitude block.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altitudeSequenceId(): Optional<String> =
        altitudeSequenceId.getOptional("altitudeSequenceId")

    /**
     * Lowest altitude of the track route altitude block above mean sea level in feet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lowerAltitude(): Optional<Double> = lowerAltitude.getOptional("lowerAltitude")

    /**
     * Highest altitude of the track route altitude block above mean sea level in feet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun upperAltitude(): Optional<Double> = upperAltitude.getOptional("upperAltitude")

    /**
     * Returns the raw JSON value of [altitudeSequenceId].
     *
     * Unlike [altitudeSequenceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("altitudeSequenceId")
    @ExcludeMissing
    fun _altitudeSequenceId(): JsonField<String> = altitudeSequenceId

    /**
     * Returns the raw JSON value of [lowerAltitude].
     *
     * Unlike [lowerAltitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lowerAltitude")
    @ExcludeMissing
    fun _lowerAltitude(): JsonField<Double> = lowerAltitude

    /**
     * Returns the raw JSON value of [upperAltitude].
     *
     * Unlike [upperAltitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upperAltitude")
    @ExcludeMissing
    fun _upperAltitude(): JsonField<Double> = upperAltitude

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

        /** Returns a mutable builder for constructing an instance of [AltitudeBlocksIngest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AltitudeBlocksIngest]. */
    class Builder internal constructor() {

        private var altitudeSequenceId: JsonField<String> = JsonMissing.of()
        private var lowerAltitude: JsonField<Double> = JsonMissing.of()
        private var upperAltitude: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(altitudeBlocksIngest: AltitudeBlocksIngest) = apply {
            altitudeSequenceId = altitudeBlocksIngest.altitudeSequenceId
            lowerAltitude = altitudeBlocksIngest.lowerAltitude
            upperAltitude = altitudeBlocksIngest.upperAltitude
            additionalProperties = altitudeBlocksIngest.additionalProperties.toMutableMap()
        }

        /** Sequencing field for the altitude block. */
        fun altitudeSequenceId(altitudeSequenceId: String) =
            altitudeSequenceId(JsonField.of(altitudeSequenceId))

        /**
         * Sets [Builder.altitudeSequenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altitudeSequenceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun altitudeSequenceId(altitudeSequenceId: JsonField<String>) = apply {
            this.altitudeSequenceId = altitudeSequenceId
        }

        /** Lowest altitude of the track route altitude block above mean sea level in feet. */
        fun lowerAltitude(lowerAltitude: Double) = lowerAltitude(JsonField.of(lowerAltitude))

        /**
         * Sets [Builder.lowerAltitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowerAltitude] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lowerAltitude(lowerAltitude: JsonField<Double>) = apply {
            this.lowerAltitude = lowerAltitude
        }

        /** Highest altitude of the track route altitude block above mean sea level in feet. */
        fun upperAltitude(upperAltitude: Double) = upperAltitude(JsonField.of(upperAltitude))

        /**
         * Sets [Builder.upperAltitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upperAltitude] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun upperAltitude(upperAltitude: JsonField<Double>) = apply {
            this.upperAltitude = upperAltitude
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
         * Returns an immutable instance of [AltitudeBlocksIngest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AltitudeBlocksIngest =
            AltitudeBlocksIngest(
                altitudeSequenceId,
                lowerAltitude,
                upperAltitude,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AltitudeBlocksIngest = apply {
        if (validated) {
            return@apply
        }

        altitudeSequenceId()
        lowerAltitude()
        upperAltitude()
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
        (if (altitudeSequenceId.asKnown().isPresent) 1 else 0) +
            (if (lowerAltitude.asKnown().isPresent) 1 else 0) +
            (if (upperAltitude.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AltitudeBlocksIngest &&
            altitudeSequenceId == other.altitudeSequenceId &&
            lowerAltitude == other.lowerAltitude &&
            upperAltitude == other.upperAltitude &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(altitudeSequenceId, lowerAltitude, upperAltitude, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AltitudeBlocksIngest{altitudeSequenceId=$altitudeSequenceId, lowerAltitude=$lowerAltitude, upperAltitude=$upperAltitude, additionalProperties=$additionalProperties}"
}

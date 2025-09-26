// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laserdeconflictrequest

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class FixedPointFull
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val latitude: JsonField<Double>,
    private val longitude: JsonField<Double>,
    private val height: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("latitude") @ExcludeMissing latitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("longitude") @ExcludeMissing longitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Double> = JsonMissing.of(),
    ) : this(latitude, longitude, height, mutableMapOf())

    /**
     * WGS84 latitude of a point, in degrees. -90 to 90 degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun latitude(): Double = latitude.getRequired("latitude")

    /**
     * WGS84 longitude of a point, in degrees. -180 to 180 degrees (negative values west of Prime
     * Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun longitude(): Double = longitude.getRequired("longitude")

    /**
     * Point height as measured from sea level, ranging from -300 to 1000 kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun height(): Optional<Double> = height.getOptional("height")

    /**
     * Returns the raw JSON value of [latitude].
     *
     * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latitude") @ExcludeMissing fun _latitude(): JsonField<Double> = latitude

    /**
     * Returns the raw JSON value of [longitude].
     *
     * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("longitude") @ExcludeMissing fun _longitude(): JsonField<Double> = longitude

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Double> = height

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
         * Returns a mutable builder for constructing an instance of [FixedPointFull].
         *
         * The following fields are required:
         * ```java
         * .latitude()
         * .longitude()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FixedPointFull]. */
    class Builder internal constructor() {

        private var latitude: JsonField<Double>? = null
        private var longitude: JsonField<Double>? = null
        private var height: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fixedPointFull: FixedPointFull) = apply {
            latitude = fixedPointFull.latitude
            longitude = fixedPointFull.longitude
            height = fixedPointFull.height
            additionalProperties = fixedPointFull.additionalProperties.toMutableMap()
        }

        /**
         * WGS84 latitude of a point, in degrees. -90 to 90 degrees (negative values south of
         * equator).
         */
        fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

        /**
         * Sets [Builder.latitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latitude] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

        /**
         * WGS84 longitude of a point, in degrees. -180 to 180 degrees (negative values west of
         * Prime Meridian).
         */
        fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

        /**
         * Sets [Builder.longitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longitude] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun longitude(longitude: JsonField<Double>) = apply { this.longitude = longitude }

        /** Point height as measured from sea level, ranging from -300 to 1000 kilometers. */
        fun height(height: Double) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Double>) = apply { this.height = height }

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
         * Returns an immutable instance of [FixedPointFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .latitude()
         * .longitude()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FixedPointFull =
            FixedPointFull(
                checkRequired("latitude", latitude),
                checkRequired("longitude", longitude),
                height,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FixedPointFull = apply {
        if (validated) {
            return@apply
        }

        latitude()
        longitude()
        height()
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
        (if (latitude.asKnown().isPresent) 1 else 0) +
            (if (longitude.asKnown().isPresent) 1 else 0) +
            (if (height.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FixedPointFull &&
            latitude == other.latitude &&
            longitude == other.longitude &&
            height == other.height &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(latitude, longitude, height, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FixedPointFull{latitude=$latitude, longitude=$longitude, height=$height, additionalProperties=$additionalProperties}"
}

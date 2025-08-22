// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.isrcollections

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class IsrCollectionCriticalTimesFull
private constructor(
    private val earliestImagingTime: JsonField<OffsetDateTime>,
    private val latestImagingTime: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("earliestImagingTime")
        @ExcludeMissing
        earliestImagingTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("latestImagingTime")
        @ExcludeMissing
        latestImagingTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(earliestImagingTime, latestImagingTime, mutableMapOf())

    /**
     * Critical start time to collect an image for this requirement.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun earliestImagingTime(): OffsetDateTime =
        earliestImagingTime.getRequired("earliestImagingTime")

    /**
     * Critical stop time to collect an image for this requirement.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun latestImagingTime(): OffsetDateTime = latestImagingTime.getRequired("latestImagingTime")

    /**
     * Returns the raw JSON value of [earliestImagingTime].
     *
     * Unlike [earliestImagingTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("earliestImagingTime")
    @ExcludeMissing
    fun _earliestImagingTime(): JsonField<OffsetDateTime> = earliestImagingTime

    /**
     * Returns the raw JSON value of [latestImagingTime].
     *
     * Unlike [latestImagingTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("latestImagingTime")
    @ExcludeMissing
    fun _latestImagingTime(): JsonField<OffsetDateTime> = latestImagingTime

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
         * Returns a mutable builder for constructing an instance of
         * [IsrCollectionCriticalTimesFull].
         *
         * The following fields are required:
         * ```java
         * .earliestImagingTime()
         * .latestImagingTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IsrCollectionCriticalTimesFull]. */
    class Builder internal constructor() {

        private var earliestImagingTime: JsonField<OffsetDateTime>? = null
        private var latestImagingTime: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(isrCollectionCriticalTimesFull: IsrCollectionCriticalTimesFull) = apply {
            earliestImagingTime = isrCollectionCriticalTimesFull.earliestImagingTime
            latestImagingTime = isrCollectionCriticalTimesFull.latestImagingTime
            additionalProperties =
                isrCollectionCriticalTimesFull.additionalProperties.toMutableMap()
        }

        /** Critical start time to collect an image for this requirement. */
        fun earliestImagingTime(earliestImagingTime: OffsetDateTime) =
            earliestImagingTime(JsonField.of(earliestImagingTime))

        /**
         * Sets [Builder.earliestImagingTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earliestImagingTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun earliestImagingTime(earliestImagingTime: JsonField<OffsetDateTime>) = apply {
            this.earliestImagingTime = earliestImagingTime
        }

        /** Critical stop time to collect an image for this requirement. */
        fun latestImagingTime(latestImagingTime: OffsetDateTime) =
            latestImagingTime(JsonField.of(latestImagingTime))

        /**
         * Sets [Builder.latestImagingTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestImagingTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun latestImagingTime(latestImagingTime: JsonField<OffsetDateTime>) = apply {
            this.latestImagingTime = latestImagingTime
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [IsrCollectionCriticalTimesFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .earliestImagingTime()
         * .latestImagingTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IsrCollectionCriticalTimesFull =
            IsrCollectionCriticalTimesFull(
                checkRequired("earliestImagingTime", earliestImagingTime),
                checkRequired("latestImagingTime", latestImagingTime),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IsrCollectionCriticalTimesFull = apply {
        if (validated) {
            return@apply
        }

        earliestImagingTime()
        latestImagingTime()
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
        (if (earliestImagingTime.asKnown().isPresent) 1 else 0) +
            (if (latestImagingTime.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IsrCollectionCriticalTimesFull &&
            earliestImagingTime == other.earliestImagingTime &&
            latestImagingTime == other.latestImagingTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(earliestImagingTime, latestImagingTime, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IsrCollectionCriticalTimesFull{earliestImagingTime=$earliestImagingTime, latestImagingTime=$latestImagingTime, additionalProperties=$additionalProperties}"
}

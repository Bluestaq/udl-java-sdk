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
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * A collection containing the operational start and stop times scheduled for the day of the week
 * specified.
 */
class OperatingHoursFull
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val opStartTime: JsonField<String>,
    private val opStopTime: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("opStartTime")
        @ExcludeMissing
        opStartTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opStopTime") @ExcludeMissing opStopTime: JsonField<String> = JsonMissing.of(),
    ) : this(opStartTime, opStopTime, mutableMapOf())

    /**
     * The Zulu (UTC) operational start time, expressed in ISO 8601 format as HH:MM.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opStartTime(): Optional<String> = opStartTime.getOptional("opStartTime")

    /**
     * The Zulu (UTC) operational stop time, expressed in ISO 8601 format as HH:MM.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opStopTime(): Optional<String> = opStopTime.getOptional("opStopTime")

    /**
     * Returns the raw JSON value of [opStartTime].
     *
     * Unlike [opStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opStartTime") @ExcludeMissing fun _opStartTime(): JsonField<String> = opStartTime

    /**
     * Returns the raw JSON value of [opStopTime].
     *
     * Unlike [opStopTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opStopTime") @ExcludeMissing fun _opStopTime(): JsonField<String> = opStopTime

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

        /** Returns a mutable builder for constructing an instance of [OperatingHoursFull]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OperatingHoursFull]. */
    class Builder internal constructor() {

        private var opStartTime: JsonField<String> = JsonMissing.of()
        private var opStopTime: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(operatingHoursFull: OperatingHoursFull) = apply {
            opStartTime = operatingHoursFull.opStartTime
            opStopTime = operatingHoursFull.opStopTime
            additionalProperties = operatingHoursFull.additionalProperties.toMutableMap()
        }

        /** The Zulu (UTC) operational start time, expressed in ISO 8601 format as HH:MM. */
        fun opStartTime(opStartTime: String) = opStartTime(JsonField.of(opStartTime))

        /**
         * Sets [Builder.opStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opStartTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun opStartTime(opStartTime: JsonField<String>) = apply { this.opStartTime = opStartTime }

        /** The Zulu (UTC) operational stop time, expressed in ISO 8601 format as HH:MM. */
        fun opStopTime(opStopTime: String) = opStopTime(JsonField.of(opStopTime))

        /**
         * Sets [Builder.opStopTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opStopTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun opStopTime(opStopTime: JsonField<String>) = apply { this.opStopTime = opStopTime }

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
         * Returns an immutable instance of [OperatingHoursFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OperatingHoursFull =
            OperatingHoursFull(opStartTime, opStopTime, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): OperatingHoursFull = apply {
        if (validated) {
            return@apply
        }

        opStartTime()
        opStopTime()
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
        (if (opStartTime.asKnown().isPresent) 1 else 0) +
            (if (opStopTime.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OperatingHoursFull &&
            opStartTime == other.opStartTime &&
            opStopTime == other.opStopTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(opStartTime, opStopTime, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OperatingHoursFull{opStartTime=$opStartTime, opStopTime=$opStopTime, additionalProperties=$additionalProperties}"
}

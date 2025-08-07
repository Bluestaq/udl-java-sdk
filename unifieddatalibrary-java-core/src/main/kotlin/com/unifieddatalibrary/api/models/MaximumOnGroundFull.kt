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

/**
 * Collection providing maximum on ground (MOG) information for specific aircraft at the site
 * associated with this SiteOperations record.
 */
class MaximumOnGroundFull
private constructor(
    private val aircraftMds: JsonField<String>,
    private val contingencyMog: JsonField<Int>,
    private val mogLastChangedBy: JsonField<String>,
    private val mogLastChangedDate: JsonField<OffsetDateTime>,
    private val wideParkingMog: JsonField<Int>,
    private val wideWorkingMog: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("aircraftMDS")
        @ExcludeMissing
        aircraftMds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contingencyMOG")
        @ExcludeMissing
        contingencyMog: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("mogLastChangedBy")
        @ExcludeMissing
        mogLastChangedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mogLastChangedDate")
        @ExcludeMissing
        mogLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("wideParkingMOG")
        @ExcludeMissing
        wideParkingMog: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("wideWorkingMOG")
        @ExcludeMissing
        wideWorkingMog: JsonField<Int> = JsonMissing.of(),
    ) : this(
        aircraftMds,
        contingencyMog,
        mogLastChangedBy,
        mogLastChangedDate,
        wideParkingMog,
        wideWorkingMog,
        mutableMapOf(),
    )

    /**
     * The Model Design Series (MDS) designation of the aircraft to which this maximum on ground
     * (MOG) data pertains.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aircraftMds(): Optional<String> = aircraftMds.getOptional("aircraftMDS")

    /**
     * Maximum on ground (MOG) number of contingent aircraft based on spacing and manpower, for the
     * aircraft type specified.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun contingencyMog(): Optional<Int> = contingencyMog.getOptional("contingencyMOG")

    /**
     * The name of the person who made the most recent change to this maximum on ground data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mogLastChangedBy(): Optional<String> = mogLastChangedBy.getOptional("mogLastChangedBy")

    /**
     * The datetime of the most recent change made to this maximum on ground data, in ISO 8601 UTC
     * format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mogLastChangedDate(): Optional<OffsetDateTime> =
        mogLastChangedDate.getOptional("mogLastChangedDate")

    /**
     * Maximum on ground (MOG) number of parking wide-body aircraft based on spacing and manpower,
     * for the aircraft type specified.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun wideParkingMog(): Optional<Int> = wideParkingMog.getOptional("wideParkingMOG")

    /**
     * Maximum on ground (MOG) number of working wide-body aircraft based on spacing and manpower,
     * for the aircraft type specified.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun wideWorkingMog(): Optional<Int> = wideWorkingMog.getOptional("wideWorkingMOG")

    /**
     * Returns the raw JSON value of [aircraftMds].
     *
     * Unlike [aircraftMds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aircraftMDS") @ExcludeMissing fun _aircraftMds(): JsonField<String> = aircraftMds

    /**
     * Returns the raw JSON value of [contingencyMog].
     *
     * Unlike [contingencyMog], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contingencyMOG")
    @ExcludeMissing
    fun _contingencyMog(): JsonField<Int> = contingencyMog

    /**
     * Returns the raw JSON value of [mogLastChangedBy].
     *
     * Unlike [mogLastChangedBy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("mogLastChangedBy")
    @ExcludeMissing
    fun _mogLastChangedBy(): JsonField<String> = mogLastChangedBy

    /**
     * Returns the raw JSON value of [mogLastChangedDate].
     *
     * Unlike [mogLastChangedDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("mogLastChangedDate")
    @ExcludeMissing
    fun _mogLastChangedDate(): JsonField<OffsetDateTime> = mogLastChangedDate

    /**
     * Returns the raw JSON value of [wideParkingMog].
     *
     * Unlike [wideParkingMog], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wideParkingMOG")
    @ExcludeMissing
    fun _wideParkingMog(): JsonField<Int> = wideParkingMog

    /**
     * Returns the raw JSON value of [wideWorkingMog].
     *
     * Unlike [wideWorkingMog], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wideWorkingMOG")
    @ExcludeMissing
    fun _wideWorkingMog(): JsonField<Int> = wideWorkingMog

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

        /** Returns a mutable builder for constructing an instance of [MaximumOnGroundFull]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MaximumOnGroundFull]. */
    class Builder internal constructor() {

        private var aircraftMds: JsonField<String> = JsonMissing.of()
        private var contingencyMog: JsonField<Int> = JsonMissing.of()
        private var mogLastChangedBy: JsonField<String> = JsonMissing.of()
        private var mogLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var wideParkingMog: JsonField<Int> = JsonMissing.of()
        private var wideWorkingMog: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(maximumOnGroundFull: MaximumOnGroundFull) = apply {
            aircraftMds = maximumOnGroundFull.aircraftMds
            contingencyMog = maximumOnGroundFull.contingencyMog
            mogLastChangedBy = maximumOnGroundFull.mogLastChangedBy
            mogLastChangedDate = maximumOnGroundFull.mogLastChangedDate
            wideParkingMog = maximumOnGroundFull.wideParkingMog
            wideWorkingMog = maximumOnGroundFull.wideWorkingMog
            additionalProperties = maximumOnGroundFull.additionalProperties.toMutableMap()
        }

        /**
         * The Model Design Series (MDS) designation of the aircraft to which this maximum on ground
         * (MOG) data pertains.
         */
        fun aircraftMds(aircraftMds: String) = aircraftMds(JsonField.of(aircraftMds))

        /**
         * Sets [Builder.aircraftMds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aircraftMds] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aircraftMds(aircraftMds: JsonField<String>) = apply { this.aircraftMds = aircraftMds }

        /**
         * Maximum on ground (MOG) number of contingent aircraft based on spacing and manpower, for
         * the aircraft type specified.
         */
        fun contingencyMog(contingencyMog: Int) = contingencyMog(JsonField.of(contingencyMog))

        /**
         * Sets [Builder.contingencyMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contingencyMog] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contingencyMog(contingencyMog: JsonField<Int>) = apply {
            this.contingencyMog = contingencyMog
        }

        /**
         * The name of the person who made the most recent change to this maximum on ground data.
         */
        fun mogLastChangedBy(mogLastChangedBy: String) =
            mogLastChangedBy(JsonField.of(mogLastChangedBy))

        /**
         * Sets [Builder.mogLastChangedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mogLastChangedBy] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mogLastChangedBy(mogLastChangedBy: JsonField<String>) = apply {
            this.mogLastChangedBy = mogLastChangedBy
        }

        /**
         * The datetime of the most recent change made to this maximum on ground data, in ISO 8601
         * UTC format with millisecond precision.
         */
        fun mogLastChangedDate(mogLastChangedDate: OffsetDateTime) =
            mogLastChangedDate(JsonField.of(mogLastChangedDate))

        /**
         * Sets [Builder.mogLastChangedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mogLastChangedDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun mogLastChangedDate(mogLastChangedDate: JsonField<OffsetDateTime>) = apply {
            this.mogLastChangedDate = mogLastChangedDate
        }

        /**
         * Maximum on ground (MOG) number of parking wide-body aircraft based on spacing and
         * manpower, for the aircraft type specified.
         */
        fun wideParkingMog(wideParkingMog: Int) = wideParkingMog(JsonField.of(wideParkingMog))

        /**
         * Sets [Builder.wideParkingMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wideParkingMog] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun wideParkingMog(wideParkingMog: JsonField<Int>) = apply {
            this.wideParkingMog = wideParkingMog
        }

        /**
         * Maximum on ground (MOG) number of working wide-body aircraft based on spacing and
         * manpower, for the aircraft type specified.
         */
        fun wideWorkingMog(wideWorkingMog: Int) = wideWorkingMog(JsonField.of(wideWorkingMog))

        /**
         * Sets [Builder.wideWorkingMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wideWorkingMog] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun wideWorkingMog(wideWorkingMog: JsonField<Int>) = apply {
            this.wideWorkingMog = wideWorkingMog
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
         * Returns an immutable instance of [MaximumOnGroundFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MaximumOnGroundFull =
            MaximumOnGroundFull(
                aircraftMds,
                contingencyMog,
                mogLastChangedBy,
                mogLastChangedDate,
                wideParkingMog,
                wideWorkingMog,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MaximumOnGroundFull = apply {
        if (validated) {
            return@apply
        }

        aircraftMds()
        contingencyMog()
        mogLastChangedBy()
        mogLastChangedDate()
        wideParkingMog()
        wideWorkingMog()
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
        (if (aircraftMds.asKnown().isPresent) 1 else 0) +
            (if (contingencyMog.asKnown().isPresent) 1 else 0) +
            (if (mogLastChangedBy.asKnown().isPresent) 1 else 0) +
            (if (mogLastChangedDate.asKnown().isPresent) 1 else 0) +
            (if (wideParkingMog.asKnown().isPresent) 1 else 0) +
            (if (wideWorkingMog.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MaximumOnGroundFull && aircraftMds == other.aircraftMds && contingencyMog == other.contingencyMog && mogLastChangedBy == other.mogLastChangedBy && mogLastChangedDate == other.mogLastChangedDate && wideParkingMog == other.wideParkingMog && wideWorkingMog == other.wideWorkingMog && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(aircraftMds, contingencyMog, mogLastChangedBy, mogLastChangedDate, wideParkingMog, wideWorkingMog, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MaximumOnGroundFull{aircraftMds=$aircraftMds, contingencyMog=$contingencyMog, mogLastChangedBy=$mogLastChangedBy, mogLastChangedDate=$mogLastChangedDate, wideParkingMog=$wideParkingMog, wideWorkingMog=$wideWorkingMog, additionalProperties=$additionalProperties}"
}

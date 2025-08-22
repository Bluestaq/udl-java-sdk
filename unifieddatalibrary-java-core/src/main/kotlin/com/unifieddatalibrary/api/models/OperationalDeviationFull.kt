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
 * Collection providing relevant information in the event of deviations/exceptions to normal
 * operations.
 */
class OperationalDeviationFull
private constructor(
    private val affectedAircraftMds: JsonField<String>,
    private val affectedMog: JsonField<Int>,
    private val aircraftOnGroundTime: JsonField<String>,
    private val crewRestTime: JsonField<String>,
    private val odLastChangedBy: JsonField<String>,
    private val odLastChangedDate: JsonField<OffsetDateTime>,
    private val odRemark: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("affectedAircraftMDS")
        @ExcludeMissing
        affectedAircraftMds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("affectedMOG") @ExcludeMissing affectedMog: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("aircraftOnGroundTime")
        @ExcludeMissing
        aircraftOnGroundTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("crewRestTime")
        @ExcludeMissing
        crewRestTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("odLastChangedBy")
        @ExcludeMissing
        odLastChangedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("odLastChangedDate")
        @ExcludeMissing
        odLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("odRemark") @ExcludeMissing odRemark: JsonField<String> = JsonMissing.of(),
    ) : this(
        affectedAircraftMds,
        affectedMog,
        aircraftOnGroundTime,
        crewRestTime,
        odLastChangedBy,
        odLastChangedDate,
        odRemark,
        mutableMapOf(),
    )

    /**
     * The Model Design Series (MDS) designation of the aircraft affected by this operational
     * deviation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun affectedAircraftMds(): Optional<String> =
        affectedAircraftMds.getOptional("affectedAircraftMDS")

    /**
     * The maximum on ground (MOG) number for aircraft affected by this operational deviation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun affectedMog(): Optional<Int> = affectedMog.getOptional("affectedMOG")

    /**
     * On ground time for aircraft affected by this operational deviation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aircraftOnGroundTime(): Optional<String> =
        aircraftOnGroundTime.getOptional("aircraftOnGroundTime")

    /**
     * Rest time for crew affected by this operational deviation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun crewRestTime(): Optional<String> = crewRestTime.getOptional("crewRestTime")

    /**
     * The name of the person who made the most recent change to this OperationalDeviation data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun odLastChangedBy(): Optional<String> = odLastChangedBy.getOptional("odLastChangedBy")

    /**
     * The datetime of the most recent change made to this OperationalDeviation data, in ISO 8601
     * UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun odLastChangedDate(): Optional<OffsetDateTime> =
        odLastChangedDate.getOptional("odLastChangedDate")

    /**
     * Text remark regarding this operational deviation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun odRemark(): Optional<String> = odRemark.getOptional("odRemark")

    /**
     * Returns the raw JSON value of [affectedAircraftMds].
     *
     * Unlike [affectedAircraftMds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("affectedAircraftMDS")
    @ExcludeMissing
    fun _affectedAircraftMds(): JsonField<String> = affectedAircraftMds

    /**
     * Returns the raw JSON value of [affectedMog].
     *
     * Unlike [affectedMog], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("affectedMOG") @ExcludeMissing fun _affectedMog(): JsonField<Int> = affectedMog

    /**
     * Returns the raw JSON value of [aircraftOnGroundTime].
     *
     * Unlike [aircraftOnGroundTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("aircraftOnGroundTime")
    @ExcludeMissing
    fun _aircraftOnGroundTime(): JsonField<String> = aircraftOnGroundTime

    /**
     * Returns the raw JSON value of [crewRestTime].
     *
     * Unlike [crewRestTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("crewRestTime")
    @ExcludeMissing
    fun _crewRestTime(): JsonField<String> = crewRestTime

    /**
     * Returns the raw JSON value of [odLastChangedBy].
     *
     * Unlike [odLastChangedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("odLastChangedBy")
    @ExcludeMissing
    fun _odLastChangedBy(): JsonField<String> = odLastChangedBy

    /**
     * Returns the raw JSON value of [odLastChangedDate].
     *
     * Unlike [odLastChangedDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("odLastChangedDate")
    @ExcludeMissing
    fun _odLastChangedDate(): JsonField<OffsetDateTime> = odLastChangedDate

    /**
     * Returns the raw JSON value of [odRemark].
     *
     * Unlike [odRemark], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("odRemark") @ExcludeMissing fun _odRemark(): JsonField<String> = odRemark

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

        /** Returns a mutable builder for constructing an instance of [OperationalDeviationFull]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OperationalDeviationFull]. */
    class Builder internal constructor() {

        private var affectedAircraftMds: JsonField<String> = JsonMissing.of()
        private var affectedMog: JsonField<Int> = JsonMissing.of()
        private var aircraftOnGroundTime: JsonField<String> = JsonMissing.of()
        private var crewRestTime: JsonField<String> = JsonMissing.of()
        private var odLastChangedBy: JsonField<String> = JsonMissing.of()
        private var odLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var odRemark: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(operationalDeviationFull: OperationalDeviationFull) = apply {
            affectedAircraftMds = operationalDeviationFull.affectedAircraftMds
            affectedMog = operationalDeviationFull.affectedMog
            aircraftOnGroundTime = operationalDeviationFull.aircraftOnGroundTime
            crewRestTime = operationalDeviationFull.crewRestTime
            odLastChangedBy = operationalDeviationFull.odLastChangedBy
            odLastChangedDate = operationalDeviationFull.odLastChangedDate
            odRemark = operationalDeviationFull.odRemark
            additionalProperties = operationalDeviationFull.additionalProperties.toMutableMap()
        }

        /**
         * The Model Design Series (MDS) designation of the aircraft affected by this operational
         * deviation.
         */
        fun affectedAircraftMds(affectedAircraftMds: String) =
            affectedAircraftMds(JsonField.of(affectedAircraftMds))

        /**
         * Sets [Builder.affectedAircraftMds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.affectedAircraftMds] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun affectedAircraftMds(affectedAircraftMds: JsonField<String>) = apply {
            this.affectedAircraftMds = affectedAircraftMds
        }

        /**
         * The maximum on ground (MOG) number for aircraft affected by this operational deviation.
         */
        fun affectedMog(affectedMog: Int) = affectedMog(JsonField.of(affectedMog))

        /**
         * Sets [Builder.affectedMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.affectedMog] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun affectedMog(affectedMog: JsonField<Int>) = apply { this.affectedMog = affectedMog }

        /** On ground time for aircraft affected by this operational deviation. */
        fun aircraftOnGroundTime(aircraftOnGroundTime: String) =
            aircraftOnGroundTime(JsonField.of(aircraftOnGroundTime))

        /**
         * Sets [Builder.aircraftOnGroundTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aircraftOnGroundTime] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aircraftOnGroundTime(aircraftOnGroundTime: JsonField<String>) = apply {
            this.aircraftOnGroundTime = aircraftOnGroundTime
        }

        /** Rest time for crew affected by this operational deviation. */
        fun crewRestTime(crewRestTime: String) = crewRestTime(JsonField.of(crewRestTime))

        /**
         * Sets [Builder.crewRestTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.crewRestTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun crewRestTime(crewRestTime: JsonField<String>) = apply {
            this.crewRestTime = crewRestTime
        }

        /**
         * The name of the person who made the most recent change to this OperationalDeviation data.
         */
        fun odLastChangedBy(odLastChangedBy: String) =
            odLastChangedBy(JsonField.of(odLastChangedBy))

        /**
         * Sets [Builder.odLastChangedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.odLastChangedBy] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun odLastChangedBy(odLastChangedBy: JsonField<String>) = apply {
            this.odLastChangedBy = odLastChangedBy
        }

        /**
         * The datetime of the most recent change made to this OperationalDeviation data, in ISO
         * 8601 UTC format with millisecond precision.
         */
        fun odLastChangedDate(odLastChangedDate: OffsetDateTime) =
            odLastChangedDate(JsonField.of(odLastChangedDate))

        /**
         * Sets [Builder.odLastChangedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.odLastChangedDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun odLastChangedDate(odLastChangedDate: JsonField<OffsetDateTime>) = apply {
            this.odLastChangedDate = odLastChangedDate
        }

        /** Text remark regarding this operational deviation. */
        fun odRemark(odRemark: String) = odRemark(JsonField.of(odRemark))

        /**
         * Sets [Builder.odRemark] to an arbitrary JSON value.
         *
         * You should usually call [Builder.odRemark] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun odRemark(odRemark: JsonField<String>) = apply { this.odRemark = odRemark }

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
         * Returns an immutable instance of [OperationalDeviationFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OperationalDeviationFull =
            OperationalDeviationFull(
                affectedAircraftMds,
                affectedMog,
                aircraftOnGroundTime,
                crewRestTime,
                odLastChangedBy,
                odLastChangedDate,
                odRemark,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OperationalDeviationFull = apply {
        if (validated) {
            return@apply
        }

        affectedAircraftMds()
        affectedMog()
        aircraftOnGroundTime()
        crewRestTime()
        odLastChangedBy()
        odLastChangedDate()
        odRemark()
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
        (if (affectedAircraftMds.asKnown().isPresent) 1 else 0) +
            (if (affectedMog.asKnown().isPresent) 1 else 0) +
            (if (aircraftOnGroundTime.asKnown().isPresent) 1 else 0) +
            (if (crewRestTime.asKnown().isPresent) 1 else 0) +
            (if (odLastChangedBy.asKnown().isPresent) 1 else 0) +
            (if (odLastChangedDate.asKnown().isPresent) 1 else 0) +
            (if (odRemark.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OperationalDeviationFull &&
            affectedAircraftMds == other.affectedAircraftMds &&
            affectedMog == other.affectedMog &&
            aircraftOnGroundTime == other.aircraftOnGroundTime &&
            crewRestTime == other.crewRestTime &&
            odLastChangedBy == other.odLastChangedBy &&
            odLastChangedDate == other.odLastChangedDate &&
            odRemark == other.odRemark &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            affectedAircraftMds,
            affectedMog,
            aircraftOnGroundTime,
            crewRestTime,
            odLastChangedBy,
            odLastChangedDate,
            odRemark,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OperationalDeviationFull{affectedAircraftMds=$affectedAircraftMds, affectedMog=$affectedMog, aircraftOnGroundTime=$aircraftOnGroundTime, crewRestTime=$crewRestTime, odLastChangedBy=$odLastChangedBy, odLastChangedDate=$odLastChangedDate, odRemark=$odRemark, additionalProperties=$additionalProperties}"
}

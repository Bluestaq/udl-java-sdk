// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraft

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * General aircraft designation, characteristics, and capabilities. The aircraft schema contains
 * static data of specific aircraft, including tail number, cruise speed, max speed, and minimum
 * required runway length, etc.
 */
class AircraftAbridged
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val aircraftMds: JsonField<String>,
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val category: JsonField<String>,
    private val command: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val cruiseSpeed: JsonField<Double>,
    private val dtd: JsonField<String>,
    private val idEntity: JsonField<String>,
    private val maxSpeed: JsonField<Double>,
    private val minReqRunwayFt: JsonField<Int>,
    private val minReqRunwayM: JsonField<Int>,
    private val nominalTaTime: JsonField<Int>,
    private val notes: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val owner: JsonField<String>,
    private val serialNumber: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val tailNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("aircraftMDS")
        @ExcludeMissing
        aircraftMds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<String> = JsonMissing.of(),
        @JsonProperty("command") @ExcludeMissing command: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cruiseSpeed")
        @ExcludeMissing
        cruiseSpeed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dtd") @ExcludeMissing dtd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idEntity") @ExcludeMissing idEntity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxSpeed") @ExcludeMissing maxSpeed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minReqRunwayFt")
        @ExcludeMissing
        minReqRunwayFt: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("minReqRunwayM")
        @ExcludeMissing
        minReqRunwayM: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("nominalTATime")
        @ExcludeMissing
        nominalTaTime: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
        @JsonProperty("serialNumber")
        @ExcludeMissing
        serialNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tailNumber") @ExcludeMissing tailNumber: JsonField<String> = JsonMissing.of(),
    ) : this(
        aircraftMds,
        classificationMarking,
        dataMode,
        source,
        id,
        category,
        command,
        createdAt,
        createdBy,
        cruiseSpeed,
        dtd,
        idEntity,
        maxSpeed,
        minReqRunwayFt,
        minReqRunwayM,
        nominalTaTime,
        notes,
        origin,
        origNetwork,
        owner,
        serialNumber,
        sourceDl,
        tailNumber,
        mutableMapOf(),
    )

    /**
     * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE, KC-130
     * HERCULES, etc.) of this aircraft. Intended as, but not constrained to, MIL-STD-6016
     * environment dependent specific type designations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun aircraftMds(): String = aircraftMds.getRequired("aircraftMDS")

    /**
     * Classification marking of the data in IC/CAPCO Portion-marked format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

    /**
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The category of aircraft (e.g. M = Military, C = Commercial).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun category(): Optional<String> = category.getOptional("category")

    /**
     * The Air Force major command (MAJCOM) overseeing the aircraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun command(): Optional<String> = command.getOptional("command")

    /**
     * Time the row was created in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Application user who created the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The cruise speed of the aircraft, in kilometers/hour.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cruiseSpeed(): Optional<Double> = cruiseSpeed.getOptional("cruiseSpeed")

    /**
     * Military data network data transfer device ID for this aircraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dtd(): Optional<String> = dtd.getOptional("dtd")

    /**
     * ID of the parent entity for this aircraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idEntity(): Optional<String> = idEntity.getOptional("idEntity")

    /**
     * The maximum air speed of the aircraft, in kilometers/hour.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxSpeed(): Optional<Double> = maxSpeed.getOptional("maxSpeed")

    /**
     * The minimum length of runway required to land this aircraft, in feet. Note: The corresponding
     * equivalent field is not converted by the UDL and may or may not be supplied by the provider.
     * The provider/consumer is responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minReqRunwayFt(): Optional<Int> = minReqRunwayFt.getOptional("minReqRunwayFt")

    /**
     * The minimum length of runway required to land this aircraft, in meters. Note: The
     * corresponding equivalent field is not converted by the UDL and may or may not be supplied by
     * the provider. The provider/consumer is responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minReqRunwayM(): Optional<Int> = minReqRunwayM.getOptional("minReqRunwayM")

    /**
     * The nominal turnaround time for this aircraft, in minutes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nominalTaTime(): Optional<Int> = nominalTaTime.getOptional("nominalTATime")

    /**
     * Optional notes/comments for this aircraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * Originating system or organization which produced the data, if different from the source. The
     * origin may be different than the source if the source was a mediating system which forwarded
     * the data on behalf of the origin system. If null, the source may be assumed to be the origin.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origin(): Optional<String> = origin.getOptional("origin")

    /**
     * The originating source network on which this record was created, auto-populated by the
     * system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

    /**
     * The wing or unit that owns the aircraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun owner(): Optional<String> = owner.getOptional("owner")

    /**
     * Full serial number of the aircraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun serialNumber(): Optional<String> = serialNumber.getOptional("serialNumber")

    /**
     * The source data library from which this record was received. This could be a remote or
     * tactical UDL or another data library. If null, the record should be assumed to have
     * originated from the primary Enterprise UDL.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

    /**
     * The tail number of this aircraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tailNumber(): Optional<String> = tailNumber.getOptional("tailNumber")

    /**
     * Returns the raw JSON value of [aircraftMds].
     *
     * Unlike [aircraftMds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aircraftMDS") @ExcludeMissing fun _aircraftMds(): JsonField<String> = aircraftMds

    /**
     * Returns the raw JSON value of [classificationMarking].
     *
     * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("classificationMarking")
    @ExcludeMissing
    fun _classificationMarking(): JsonField<String> = classificationMarking

    /**
     * Returns the raw JSON value of [dataMode].
     *
     * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataMode") @ExcludeMissing fun _dataMode(): JsonField<DataMode> = dataMode

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

    /**
     * Returns the raw JSON value of [command].
     *
     * Unlike [command], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("command") @ExcludeMissing fun _command(): JsonField<String> = command

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [cruiseSpeed].
     *
     * Unlike [cruiseSpeed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cruiseSpeed") @ExcludeMissing fun _cruiseSpeed(): JsonField<Double> = cruiseSpeed

    /**
     * Returns the raw JSON value of [dtd].
     *
     * Unlike [dtd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtd") @ExcludeMissing fun _dtd(): JsonField<String> = dtd

    /**
     * Returns the raw JSON value of [idEntity].
     *
     * Unlike [idEntity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idEntity") @ExcludeMissing fun _idEntity(): JsonField<String> = idEntity

    /**
     * Returns the raw JSON value of [maxSpeed].
     *
     * Unlike [maxSpeed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxSpeed") @ExcludeMissing fun _maxSpeed(): JsonField<Double> = maxSpeed

    /**
     * Returns the raw JSON value of [minReqRunwayFt].
     *
     * Unlike [minReqRunwayFt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minReqRunwayFt")
    @ExcludeMissing
    fun _minReqRunwayFt(): JsonField<Int> = minReqRunwayFt

    /**
     * Returns the raw JSON value of [minReqRunwayM].
     *
     * Unlike [minReqRunwayM], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minReqRunwayM")
    @ExcludeMissing
    fun _minReqRunwayM(): JsonField<Int> = minReqRunwayM

    /**
     * Returns the raw JSON value of [nominalTaTime].
     *
     * Unlike [nominalTaTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nominalTATime")
    @ExcludeMissing
    fun _nominalTaTime(): JsonField<Int> = nominalTaTime

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<String> = origin

    /**
     * Returns the raw JSON value of [origNetwork].
     *
     * Unlike [origNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origNetwork") @ExcludeMissing fun _origNetwork(): JsonField<String> = origNetwork

    /**
     * Returns the raw JSON value of [owner].
     *
     * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

    /**
     * Returns the raw JSON value of [serialNumber].
     *
     * Unlike [serialNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("serialNumber")
    @ExcludeMissing
    fun _serialNumber(): JsonField<String> = serialNumber

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [tailNumber].
     *
     * Unlike [tailNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tailNumber") @ExcludeMissing fun _tailNumber(): JsonField<String> = tailNumber

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
         * Returns a mutable builder for constructing an instance of [AircraftAbridged].
         *
         * The following fields are required:
         * ```java
         * .aircraftMds()
         * .classificationMarking()
         * .dataMode()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AircraftAbridged]. */
    class Builder internal constructor() {

        private var aircraftMds: JsonField<String>? = null
        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var category: JsonField<String> = JsonMissing.of()
        private var command: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var cruiseSpeed: JsonField<Double> = JsonMissing.of()
        private var dtd: JsonField<String> = JsonMissing.of()
        private var idEntity: JsonField<String> = JsonMissing.of()
        private var maxSpeed: JsonField<Double> = JsonMissing.of()
        private var minReqRunwayFt: JsonField<Int> = JsonMissing.of()
        private var minReqRunwayM: JsonField<Int> = JsonMissing.of()
        private var nominalTaTime: JsonField<Int> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var owner: JsonField<String> = JsonMissing.of()
        private var serialNumber: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var tailNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aircraftAbridged: AircraftAbridged) = apply {
            aircraftMds = aircraftAbridged.aircraftMds
            classificationMarking = aircraftAbridged.classificationMarking
            dataMode = aircraftAbridged.dataMode
            source = aircraftAbridged.source
            id = aircraftAbridged.id
            category = aircraftAbridged.category
            command = aircraftAbridged.command
            createdAt = aircraftAbridged.createdAt
            createdBy = aircraftAbridged.createdBy
            cruiseSpeed = aircraftAbridged.cruiseSpeed
            dtd = aircraftAbridged.dtd
            idEntity = aircraftAbridged.idEntity
            maxSpeed = aircraftAbridged.maxSpeed
            minReqRunwayFt = aircraftAbridged.minReqRunwayFt
            minReqRunwayM = aircraftAbridged.minReqRunwayM
            nominalTaTime = aircraftAbridged.nominalTaTime
            notes = aircraftAbridged.notes
            origin = aircraftAbridged.origin
            origNetwork = aircraftAbridged.origNetwork
            owner = aircraftAbridged.owner
            serialNumber = aircraftAbridged.serialNumber
            sourceDl = aircraftAbridged.sourceDl
            tailNumber = aircraftAbridged.tailNumber
            additionalProperties = aircraftAbridged.additionalProperties.toMutableMap()
        }

        /**
         * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE, KC-130
         * HERCULES, etc.) of this aircraft. Intended as, but not constrained to, MIL-STD-6016
         * environment dependent specific type designations.
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

        /** Classification marking of the data in IC/CAPCO Portion-marked format. */
        fun classificationMarking(classificationMarking: String) =
            classificationMarking(JsonField.of(classificationMarking))

        /**
         * Sets [Builder.classificationMarking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classificationMarking] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun classificationMarking(classificationMarking: JsonField<String>) = apply {
            this.classificationMarking = classificationMarking
        }

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         */
        fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

        /**
         * Sets [Builder.dataMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataMode] with a well-typed [DataMode] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The category of aircraft (e.g. M = Military, C = Commercial). */
        fun category(category: String) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { this.category = category }

        /** The Air Force major command (MAJCOM) overseeing the aircraft. */
        fun command(command: String) = command(JsonField.of(command))

        /**
         * Sets [Builder.command] to an arbitrary JSON value.
         *
         * You should usually call [Builder.command] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun command(command: JsonField<String>) = apply { this.command = command }

        /** Time the row was created in the database, auto-populated by the system. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Application user who created the row in the database, auto-populated by the system. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The cruise speed of the aircraft, in kilometers/hour. */
        fun cruiseSpeed(cruiseSpeed: Double) = cruiseSpeed(JsonField.of(cruiseSpeed))

        /**
         * Sets [Builder.cruiseSpeed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cruiseSpeed] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cruiseSpeed(cruiseSpeed: JsonField<Double>) = apply { this.cruiseSpeed = cruiseSpeed }

        /** Military data network data transfer device ID for this aircraft. */
        fun dtd(dtd: String) = dtd(JsonField.of(dtd))

        /**
         * Sets [Builder.dtd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtd] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dtd(dtd: JsonField<String>) = apply { this.dtd = dtd }

        /** ID of the parent entity for this aircraft. */
        fun idEntity(idEntity: String) = idEntity(JsonField.of(idEntity))

        /**
         * Sets [Builder.idEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idEntity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idEntity(idEntity: JsonField<String>) = apply { this.idEntity = idEntity }

        /** The maximum air speed of the aircraft, in kilometers/hour. */
        fun maxSpeed(maxSpeed: Double) = maxSpeed(JsonField.of(maxSpeed))

        /**
         * Sets [Builder.maxSpeed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSpeed] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxSpeed(maxSpeed: JsonField<Double>) = apply { this.maxSpeed = maxSpeed }

        /**
         * The minimum length of runway required to land this aircraft, in feet. Note: The
         * corresponding equivalent field is not converted by the UDL and may or may not be supplied
         * by the provider. The provider/consumer is responsible for all unit conversions.
         */
        fun minReqRunwayFt(minReqRunwayFt: Int) = minReqRunwayFt(JsonField.of(minReqRunwayFt))

        /**
         * Sets [Builder.minReqRunwayFt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minReqRunwayFt] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minReqRunwayFt(minReqRunwayFt: JsonField<Int>) = apply {
            this.minReqRunwayFt = minReqRunwayFt
        }

        /**
         * The minimum length of runway required to land this aircraft, in meters. Note: The
         * corresponding equivalent field is not converted by the UDL and may or may not be supplied
         * by the provider. The provider/consumer is responsible for all unit conversions.
         */
        fun minReqRunwayM(minReqRunwayM: Int) = minReqRunwayM(JsonField.of(minReqRunwayM))

        /**
         * Sets [Builder.minReqRunwayM] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minReqRunwayM] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minReqRunwayM(minReqRunwayM: JsonField<Int>) = apply {
            this.minReqRunwayM = minReqRunwayM
        }

        /** The nominal turnaround time for this aircraft, in minutes. */
        fun nominalTaTime(nominalTaTime: Int) = nominalTaTime(JsonField.of(nominalTaTime))

        /**
         * Sets [Builder.nominalTaTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nominalTaTime] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nominalTaTime(nominalTaTime: JsonField<Int>) = apply {
            this.nominalTaTime = nominalTaTime
        }

        /** Optional notes/comments for this aircraft. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         */
        fun origin(origin: String) = origin(JsonField.of(origin))

        /**
         * Sets [Builder.origin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origin] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun origin(origin: JsonField<String>) = apply { this.origin = origin }

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         */
        fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

        /**
         * Sets [Builder.origNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origNetwork] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origNetwork(origNetwork: JsonField<String>) = apply { this.origNetwork = origNetwork }

        /** The wing or unit that owns the aircraft. */
        fun owner(owner: String) = owner(JsonField.of(owner))

        /**
         * Sets [Builder.owner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.owner] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun owner(owner: JsonField<String>) = apply { this.owner = owner }

        /** Full serial number of the aircraft. */
        fun serialNumber(serialNumber: String) = serialNumber(JsonField.of(serialNumber))

        /**
         * Sets [Builder.serialNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serialNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serialNumber(serialNumber: JsonField<String>) = apply {
            this.serialNumber = serialNumber
        }

        /**
         * The source data library from which this record was received. This could be a remote or
         * tactical UDL or another data library. If null, the record should be assumed to have
         * originated from the primary Enterprise UDL.
         */
        fun sourceDl(sourceDl: String) = sourceDl(JsonField.of(sourceDl))

        /**
         * Sets [Builder.sourceDl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceDl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceDl(sourceDl: JsonField<String>) = apply { this.sourceDl = sourceDl }

        /** The tail number of this aircraft. */
        fun tailNumber(tailNumber: String) = tailNumber(JsonField.of(tailNumber))

        /**
         * Sets [Builder.tailNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tailNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tailNumber(tailNumber: JsonField<String>) = apply { this.tailNumber = tailNumber }

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
         * Returns an immutable instance of [AircraftAbridged].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .aircraftMds()
         * .classificationMarking()
         * .dataMode()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AircraftAbridged =
            AircraftAbridged(
                checkRequired("aircraftMds", aircraftMds),
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                id,
                category,
                command,
                createdAt,
                createdBy,
                cruiseSpeed,
                dtd,
                idEntity,
                maxSpeed,
                minReqRunwayFt,
                minReqRunwayM,
                nominalTaTime,
                notes,
                origin,
                origNetwork,
                owner,
                serialNumber,
                sourceDl,
                tailNumber,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AircraftAbridged = apply {
        if (validated) {
            return@apply
        }

        aircraftMds()
        classificationMarking()
        dataMode().validate()
        source()
        id()
        category()
        command()
        createdAt()
        createdBy()
        cruiseSpeed()
        dtd()
        idEntity()
        maxSpeed()
        minReqRunwayFt()
        minReqRunwayM()
        nominalTaTime()
        notes()
        origin()
        origNetwork()
        owner()
        serialNumber()
        sourceDl()
        tailNumber()
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
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (category.asKnown().isPresent) 1 else 0) +
            (if (command.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (cruiseSpeed.asKnown().isPresent) 1 else 0) +
            (if (dtd.asKnown().isPresent) 1 else 0) +
            (if (idEntity.asKnown().isPresent) 1 else 0) +
            (if (maxSpeed.asKnown().isPresent) 1 else 0) +
            (if (minReqRunwayFt.asKnown().isPresent) 1 else 0) +
            (if (minReqRunwayM.asKnown().isPresent) 1 else 0) +
            (if (nominalTaTime.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (owner.asKnown().isPresent) 1 else 0) +
            (if (serialNumber.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (tailNumber.asKnown().isPresent) 1 else 0)

    /**
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     */
    class DataMode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val REAL = of("REAL")

            @JvmField val TEST = of("TEST")

            @JvmField val SIMULATED = of("SIMULATED")

            @JvmField val EXERCISE = of("EXERCISE")

            @JvmStatic fun of(value: String) = DataMode(JsonField.of(value))
        }

        /** An enum containing [DataMode]'s known values. */
        enum class Known {
            REAL,
            TEST,
            SIMULATED,
            EXERCISE,
        }

        /**
         * An enum containing [DataMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DataMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REAL,
            TEST,
            SIMULATED,
            EXERCISE,
            /** An enum member indicating that [DataMode] was instantiated with an unknown value. */
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
                REAL -> Value.REAL
                TEST -> Value.TEST
                SIMULATED -> Value.SIMULATED
                EXERCISE -> Value.EXERCISE
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
                REAL -> Known.REAL
                TEST -> Known.TEST
                SIMULATED -> Known.SIMULATED
                EXERCISE -> Known.EXERCISE
                else -> throw UnifieddatalibraryInvalidDataException("Unknown DataMode: $value")
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

        fun validate(): DataMode = apply {
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

            return other is DataMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AircraftAbridged &&
            aircraftMds == other.aircraftMds &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            id == other.id &&
            category == other.category &&
            command == other.command &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            cruiseSpeed == other.cruiseSpeed &&
            dtd == other.dtd &&
            idEntity == other.idEntity &&
            maxSpeed == other.maxSpeed &&
            minReqRunwayFt == other.minReqRunwayFt &&
            minReqRunwayM == other.minReqRunwayM &&
            nominalTaTime == other.nominalTaTime &&
            notes == other.notes &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            owner == other.owner &&
            serialNumber == other.serialNumber &&
            sourceDl == other.sourceDl &&
            tailNumber == other.tailNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            aircraftMds,
            classificationMarking,
            dataMode,
            source,
            id,
            category,
            command,
            createdAt,
            createdBy,
            cruiseSpeed,
            dtd,
            idEntity,
            maxSpeed,
            minReqRunwayFt,
            minReqRunwayM,
            nominalTaTime,
            notes,
            origin,
            origNetwork,
            owner,
            serialNumber,
            sourceDl,
            tailNumber,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AircraftAbridged{aircraftMds=$aircraftMds, classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, id=$id, category=$category, command=$command, createdAt=$createdAt, createdBy=$createdBy, cruiseSpeed=$cruiseSpeed, dtd=$dtd, idEntity=$idEntity, maxSpeed=$maxSpeed, minReqRunwayFt=$minReqRunwayFt, minReqRunwayM=$minReqRunwayM, nominalTaTime=$nominalTaTime, notes=$notes, origin=$origin, origNetwork=$origNetwork, owner=$owner, serialNumber=$serialNumber, sourceDl=$sourceDl, tailNumber=$tailNumber, additionalProperties=$additionalProperties}"
}

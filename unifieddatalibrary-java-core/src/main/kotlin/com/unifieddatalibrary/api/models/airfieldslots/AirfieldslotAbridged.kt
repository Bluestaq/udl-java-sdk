// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldslots

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
 * Airfield capacity data. Contains data associated with the airfieldslots available for parking,
 * working, takeoff, and landing at the airfield, as well as the types of aircraft that can be
 * accommodated.
 */
class AirfieldslotAbridged
private constructor(
    private val airfieldName: JsonField<String>,
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val name: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val acSlotCat: JsonField<AcSlotCat>,
    private val altAirfieldId: JsonField<String>,
    private val capacity: JsonField<Int>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val endTime: JsonField<String>,
    private val icao: JsonField<String>,
    private val idAirfield: JsonField<String>,
    private val minSeparation: JsonField<Int>,
    private val notes: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val startTime: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("airfieldName")
        @ExcludeMissing
        airfieldName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acSlotCat")
        @ExcludeMissing
        acSlotCat: JsonField<AcSlotCat> = JsonMissing.of(),
        @JsonProperty("altAirfieldId")
        @ExcludeMissing
        altAirfieldId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("capacity") @ExcludeMissing capacity: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endTime") @ExcludeMissing endTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("icao") @ExcludeMissing icao: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idAirfield")
        @ExcludeMissing
        idAirfield: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minSeparation")
        @ExcludeMissing
        minSeparation: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime") @ExcludeMissing startTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        airfieldName,
        classificationMarking,
        dataMode,
        name,
        source,
        id,
        acSlotCat,
        altAirfieldId,
        capacity,
        createdAt,
        createdBy,
        endTime,
        icao,
        idAirfield,
        minSeparation,
        notes,
        origin,
        origNetwork,
        sourceDl,
        startTime,
        type,
        mutableMapOf(),
    )

    /**
     * The name of the airfield where this slot is located.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun airfieldName(): String = airfieldName.getRequired("airfieldName")

    /**
     * Classification marking of the data in IC/CAPCO Portion-marked format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

    /**
     * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * Name of this slot.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

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
     * Largest category of aircraft supported in this slot (WIDE, NARROW, HELO, ALL, OTHER).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun acSlotCat(): Optional<AcSlotCat> = acSlotCat.getOptional("acSlotCat")

    /**
     * Alternate airfield identifier provided by the source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altAirfieldId(): Optional<String> = altAirfieldId.getOptional("altAirfieldId")

    /**
     * Number of aircraft that can fit in this slot at the same time.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun capacity(): Optional<Int> = capacity.getOptional("capacity")

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
     * Latest zulu time this slot is available based on daily standard hours. Not applicable to
     * slots with type PARKING. Abnormal hours, such as holidays, should be marked via the
     * AirfieldSlotConsumption schema.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endTime(): Optional<String> = endTime.getOptional("endTime")

    /**
     * The International Civil Aviation Organization (ICAO) code of the airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun icao(): Optional<String> = icao.getOptional("icao")

    /**
     * Unique identifier of the Airfield for which this slot information applies.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idAirfield(): Optional<String> = idAirfield.getOptional("idAirfield")

    /**
     * Minimum time that must elapse between different aircraft leaving and entering this slot, in
     * minutes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minSeparation(): Optional<Int> = minSeparation.getOptional("minSeparation")

    /**
     * Optional notes/comments for this airfield slot.
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
     * The source data library from which this record was received. This could be a remote or
     * tactical UDL or another data library. If null, the record should be assumed to have
     * originated from the primary Enterprise UDL.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

    /**
     * Zulu time this slot is first available based on daily standard hours. Not applicable to slots
     * with type PARKING. Abnormal hours, such as holidays, should be marked via the
     * AirfieldSlotConsumption schema.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startTime(): Optional<String> = startTime.getOptional("startTime")

    /**
     * Designates how this slot can be used (WORKING, PARKING, TAKEOFF, LANDING, OTHER).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [airfieldName].
     *
     * Unlike [airfieldName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("airfieldName")
    @ExcludeMissing
    fun _airfieldName(): JsonField<String> = airfieldName

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [acSlotCat].
     *
     * Unlike [acSlotCat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acSlotCat") @ExcludeMissing fun _acSlotCat(): JsonField<AcSlotCat> = acSlotCat

    /**
     * Returns the raw JSON value of [altAirfieldId].
     *
     * Unlike [altAirfieldId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altAirfieldId")
    @ExcludeMissing
    fun _altAirfieldId(): JsonField<String> = altAirfieldId

    /**
     * Returns the raw JSON value of [capacity].
     *
     * Unlike [capacity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capacity") @ExcludeMissing fun _capacity(): JsonField<Int> = capacity

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
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<String> = endTime

    /**
     * Returns the raw JSON value of [icao].
     *
     * Unlike [icao], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("icao") @ExcludeMissing fun _icao(): JsonField<String> = icao

    /**
     * Returns the raw JSON value of [idAirfield].
     *
     * Unlike [idAirfield], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idAirfield") @ExcludeMissing fun _idAirfield(): JsonField<String> = idAirfield

    /**
     * Returns the raw JSON value of [minSeparation].
     *
     * Unlike [minSeparation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minSeparation")
    @ExcludeMissing
    fun _minSeparation(): JsonField<Int> = minSeparation

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
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startTime") @ExcludeMissing fun _startTime(): JsonField<String> = startTime

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [AirfieldslotAbridged].
         *
         * The following fields are required:
         * ```java
         * .airfieldName()
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AirfieldslotAbridged]. */
    class Builder internal constructor() {

        private var airfieldName: JsonField<String>? = null
        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var name: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var acSlotCat: JsonField<AcSlotCat> = JsonMissing.of()
        private var altAirfieldId: JsonField<String> = JsonMissing.of()
        private var capacity: JsonField<Int> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var endTime: JsonField<String> = JsonMissing.of()
        private var icao: JsonField<String> = JsonMissing.of()
        private var idAirfield: JsonField<String> = JsonMissing.of()
        private var minSeparation: JsonField<Int> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var startTime: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(airfieldslotAbridged: AirfieldslotAbridged) = apply {
            airfieldName = airfieldslotAbridged.airfieldName
            classificationMarking = airfieldslotAbridged.classificationMarking
            dataMode = airfieldslotAbridged.dataMode
            name = airfieldslotAbridged.name
            source = airfieldslotAbridged.source
            id = airfieldslotAbridged.id
            acSlotCat = airfieldslotAbridged.acSlotCat
            altAirfieldId = airfieldslotAbridged.altAirfieldId
            capacity = airfieldslotAbridged.capacity
            createdAt = airfieldslotAbridged.createdAt
            createdBy = airfieldslotAbridged.createdBy
            endTime = airfieldslotAbridged.endTime
            icao = airfieldslotAbridged.icao
            idAirfield = airfieldslotAbridged.idAirfield
            minSeparation = airfieldslotAbridged.minSeparation
            notes = airfieldslotAbridged.notes
            origin = airfieldslotAbridged.origin
            origNetwork = airfieldslotAbridged.origNetwork
            sourceDl = airfieldslotAbridged.sourceDl
            startTime = airfieldslotAbridged.startTime
            type = airfieldslotAbridged.type
            additionalProperties = airfieldslotAbridged.additionalProperties.toMutableMap()
        }

        /** The name of the airfield where this slot is located. */
        fun airfieldName(airfieldName: String) = airfieldName(JsonField.of(airfieldName))

        /**
         * Sets [Builder.airfieldName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.airfieldName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun airfieldName(airfieldName: JsonField<String>) = apply {
            this.airfieldName = airfieldName
        }

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
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
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

        /** Name of this slot. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        /** Largest category of aircraft supported in this slot (WIDE, NARROW, HELO, ALL, OTHER). */
        fun acSlotCat(acSlotCat: AcSlotCat) = acSlotCat(JsonField.of(acSlotCat))

        /**
         * Sets [Builder.acSlotCat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acSlotCat] with a well-typed [AcSlotCat] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun acSlotCat(acSlotCat: JsonField<AcSlotCat>) = apply { this.acSlotCat = acSlotCat }

        /** Alternate airfield identifier provided by the source. */
        fun altAirfieldId(altAirfieldId: String) = altAirfieldId(JsonField.of(altAirfieldId))

        /**
         * Sets [Builder.altAirfieldId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altAirfieldId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun altAirfieldId(altAirfieldId: JsonField<String>) = apply {
            this.altAirfieldId = altAirfieldId
        }

        /** Number of aircraft that can fit in this slot at the same time. */
        fun capacity(capacity: Int) = capacity(JsonField.of(capacity))

        /**
         * Sets [Builder.capacity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capacity] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun capacity(capacity: JsonField<Int>) = apply { this.capacity = capacity }

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

        /**
         * Latest zulu time this slot is available based on daily standard hours. Not applicable to
         * slots with type PARKING. Abnormal hours, such as holidays, should be marked via the
         * AirfieldSlotConsumption schema.
         */
        fun endTime(endTime: String) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endTime(endTime: JsonField<String>) = apply { this.endTime = endTime }

        /** The International Civil Aviation Organization (ICAO) code of the airfield. */
        fun icao(icao: String) = icao(JsonField.of(icao))

        /**
         * Sets [Builder.icao] to an arbitrary JSON value.
         *
         * You should usually call [Builder.icao] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun icao(icao: JsonField<String>) = apply { this.icao = icao }

        /** Unique identifier of the Airfield for which this slot information applies. */
        fun idAirfield(idAirfield: String) = idAirfield(JsonField.of(idAirfield))

        /**
         * Sets [Builder.idAirfield] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idAirfield] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idAirfield(idAirfield: JsonField<String>) = apply { this.idAirfield = idAirfield }

        /**
         * Minimum time that must elapse between different aircraft leaving and entering this slot,
         * in minutes.
         */
        fun minSeparation(minSeparation: Int) = minSeparation(JsonField.of(minSeparation))

        /**
         * Sets [Builder.minSeparation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minSeparation] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minSeparation(minSeparation: JsonField<Int>) = apply {
            this.minSeparation = minSeparation
        }

        /** Optional notes/comments for this airfield slot. */
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

        /**
         * Zulu time this slot is first available based on daily standard hours. Not applicable to
         * slots with type PARKING. Abnormal hours, such as holidays, should be marked via the
         * AirfieldSlotConsumption schema.
         */
        fun startTime(startTime: String) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startTime(startTime: JsonField<String>) = apply { this.startTime = startTime }

        /** Designates how this slot can be used (WORKING, PARKING, TAKEOFF, LANDING, OTHER). */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [AirfieldslotAbridged].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .airfieldName()
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AirfieldslotAbridged =
            AirfieldslotAbridged(
                checkRequired("airfieldName", airfieldName),
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("name", name),
                checkRequired("source", source),
                id,
                acSlotCat,
                altAirfieldId,
                capacity,
                createdAt,
                createdBy,
                endTime,
                icao,
                idAirfield,
                minSeparation,
                notes,
                origin,
                origNetwork,
                sourceDl,
                startTime,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AirfieldslotAbridged = apply {
        if (validated) {
            return@apply
        }

        airfieldName()
        classificationMarking()
        dataMode().validate()
        name()
        source()
        id()
        acSlotCat().ifPresent { it.validate() }
        altAirfieldId()
        capacity()
        createdAt()
        createdBy()
        endTime()
        icao()
        idAirfield()
        minSeparation()
        notes()
        origin()
        origNetwork()
        sourceDl()
        startTime()
        type().ifPresent { it.validate() }
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
        (if (airfieldName.asKnown().isPresent) 1 else 0) +
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (acSlotCat.asKnown().getOrNull()?.validity() ?: 0) +
            (if (altAirfieldId.asKnown().isPresent) 1 else 0) +
            (if (capacity.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (icao.asKnown().isPresent) 1 else 0) +
            (if (idAirfield.asKnown().isPresent) 1 else 0) +
            (if (minSeparation.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
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

            return /* spotless:off */ other is DataMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Largest category of aircraft supported in this slot (WIDE, NARROW, HELO, ALL, OTHER). */
    class AcSlotCat @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val WIDE = of("WIDE")

            @JvmField val NARROW = of("NARROW")

            @JvmField val HELO = of("HELO")

            @JvmField val ALL = of("ALL")

            @JvmField val OTHER = of("OTHER")

            @JvmStatic fun of(value: String) = AcSlotCat(JsonField.of(value))
        }

        /** An enum containing [AcSlotCat]'s known values. */
        enum class Known {
            WIDE,
            NARROW,
            HELO,
            ALL,
            OTHER,
        }

        /**
         * An enum containing [AcSlotCat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AcSlotCat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WIDE,
            NARROW,
            HELO,
            ALL,
            OTHER,
            /**
             * An enum member indicating that [AcSlotCat] was instantiated with an unknown value.
             */
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
                WIDE -> Value.WIDE
                NARROW -> Value.NARROW
                HELO -> Value.HELO
                ALL -> Value.ALL
                OTHER -> Value.OTHER
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
                WIDE -> Known.WIDE
                NARROW -> Known.NARROW
                HELO -> Known.HELO
                ALL -> Known.ALL
                OTHER -> Known.OTHER
                else -> throw UnifieddatalibraryInvalidDataException("Unknown AcSlotCat: $value")
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

        fun validate(): AcSlotCat = apply {
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

            return /* spotless:off */ other is AcSlotCat && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Designates how this slot can be used (WORKING, PARKING, TAKEOFF, LANDING, OTHER). */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val WORKING = of("WORKING")

            @JvmField val PARKING = of("PARKING")

            @JvmField val TAKEOFF = of("TAKEOFF")

            @JvmField val LANDING = of("LANDING")

            @JvmField val OTHER = of("OTHER")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            WORKING,
            PARKING,
            TAKEOFF,
            LANDING,
            OTHER,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WORKING,
            PARKING,
            TAKEOFF,
            LANDING,
            OTHER,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                WORKING -> Value.WORKING
                PARKING -> Value.PARKING
                TAKEOFF -> Value.TAKEOFF
                LANDING -> Value.LANDING
                OTHER -> Value.OTHER
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
                WORKING -> Known.WORKING
                PARKING -> Known.PARKING
                TAKEOFF -> Known.TAKEOFF
                LANDING -> Known.LANDING
                OTHER -> Known.OTHER
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AirfieldslotAbridged && airfieldName == other.airfieldName && classificationMarking == other.classificationMarking && dataMode == other.dataMode && name == other.name && source == other.source && id == other.id && acSlotCat == other.acSlotCat && altAirfieldId == other.altAirfieldId && capacity == other.capacity && createdAt == other.createdAt && createdBy == other.createdBy && endTime == other.endTime && icao == other.icao && idAirfield == other.idAirfield && minSeparation == other.minSeparation && notes == other.notes && origin == other.origin && origNetwork == other.origNetwork && sourceDl == other.sourceDl && startTime == other.startTime && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(airfieldName, classificationMarking, dataMode, name, source, id, acSlotCat, altAirfieldId, capacity, createdAt, createdBy, endTime, icao, idAirfield, minSeparation, notes, origin, origNetwork, sourceDl, startTime, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AirfieldslotAbridged{airfieldName=$airfieldName, classificationMarking=$classificationMarking, dataMode=$dataMode, name=$name, source=$source, id=$id, acSlotCat=$acSlotCat, altAirfieldId=$altAirfieldId, capacity=$capacity, createdAt=$createdAt, createdBy=$createdBy, endTime=$endTime, icao=$icao, idAirfield=$idAirfield, minSeparation=$minSeparation, notes=$notes, origin=$origin, origNetwork=$origNetwork, sourceDl=$sourceDl, startTime=$startTime, type=$type, additionalProperties=$additionalProperties}"
}

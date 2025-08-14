// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airevents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Information related to an air event (e.g. FUEL TRANSFER, AIR DROP) and the associated aircraft.
 */
class AirEventTupleResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val type: JsonField<String>,
    private val id: JsonField<String>,
    private val actualArrTime: JsonField<OffsetDateTime>,
    private val actualDepTime: JsonField<OffsetDateTime>,
    private val arct: JsonField<OffsetDateTime>,
    private val arEventType: JsonField<String>,
    private val arrPurpose: JsonField<String>,
    private val arTrackId: JsonField<String>,
    private val arTrackName: JsonField<String>,
    private val baseAlt: JsonField<Double>,
    private val cancelled: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val depPurpose: JsonField<String>,
    private val estArrTime: JsonField<OffsetDateTime>,
    private val estDepTime: JsonField<OffsetDateTime>,
    private val externalAirEventId: JsonField<String>,
    private val externalArTrackId: JsonField<String>,
    private val idMission: JsonField<String>,
    private val idSortie: JsonField<String>,
    private val legNum: JsonField<Int>,
    private val location: JsonField<String>,
    private val numTankers: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val plannedArrTime: JsonField<OffsetDateTime>,
    private val plannedDepTime: JsonField<OffsetDateTime>,
    private val priority: JsonField<String>,
    private val receivers: JsonField<List<Receiver>>,
    private val remarks: JsonField<List<Remark>>,
    private val revTrack: JsonField<Boolean>,
    private val rzct: JsonField<OffsetDateTime>,
    private val rzPoint: JsonField<String>,
    private val rzType: JsonField<String>,
    private val shortTrack: JsonField<Boolean>,
    private val sourceDl: JsonField<String>,
    private val statusCode: JsonField<String>,
    private val tankers: JsonField<List<Tanker>>,
    private val trackTime: JsonField<Double>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actualArrTime")
        @ExcludeMissing
        actualArrTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("actualDepTime")
        @ExcludeMissing
        actualDepTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("arct") @ExcludeMissing arct: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("arEventType")
        @ExcludeMissing
        arEventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("arrPurpose")
        @ExcludeMissing
        arrPurpose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("arTrackId") @ExcludeMissing arTrackId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("arTrackName")
        @ExcludeMissing
        arTrackName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("baseAlt") @ExcludeMissing baseAlt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("cancelled") @ExcludeMissing cancelled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("depPurpose")
        @ExcludeMissing
        depPurpose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("estArrTime")
        @ExcludeMissing
        estArrTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("estDepTime")
        @ExcludeMissing
        estDepTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("externalAirEventId")
        @ExcludeMissing
        externalAirEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalARTrackId")
        @ExcludeMissing
        externalArTrackId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idMission") @ExcludeMissing idMission: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSortie") @ExcludeMissing idSortie: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legNum") @ExcludeMissing legNum: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numTankers") @ExcludeMissing numTankers: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plannedArrTime")
        @ExcludeMissing
        plannedArrTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("plannedDepTime")
        @ExcludeMissing
        plannedDepTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receivers")
        @ExcludeMissing
        receivers: JsonField<List<Receiver>> = JsonMissing.of(),
        @JsonProperty("remarks")
        @ExcludeMissing
        remarks: JsonField<List<Remark>> = JsonMissing.of(),
        @JsonProperty("revTrack") @ExcludeMissing revTrack: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rzct") @ExcludeMissing rzct: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("rzPoint") @ExcludeMissing rzPoint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rzType") @ExcludeMissing rzType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shortTrack")
        @ExcludeMissing
        shortTrack: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statusCode")
        @ExcludeMissing
        statusCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tankers")
        @ExcludeMissing
        tankers: JsonField<List<Tanker>> = JsonMissing.of(),
        @JsonProperty("trackTime") @ExcludeMissing trackTime: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        type,
        id,
        actualArrTime,
        actualDepTime,
        arct,
        arEventType,
        arrPurpose,
        arTrackId,
        arTrackName,
        baseAlt,
        cancelled,
        createdAt,
        createdBy,
        depPurpose,
        estArrTime,
        estDepTime,
        externalAirEventId,
        externalArTrackId,
        idMission,
        idSortie,
        legNum,
        location,
        numTankers,
        origin,
        origNetwork,
        plannedArrTime,
        plannedDepTime,
        priority,
        receivers,
        remarks,
        revTrack,
        rzct,
        rzPoint,
        rzType,
        shortTrack,
        sourceDl,
        statusCode,
        tankers,
        trackTime,
        updatedAt,
        updatedBy,
        mutableMapOf(),
    )

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
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Type of air event (e.g. FUEL TRANSFER, AIR DROP, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Unique identifier of the record, auto-generated by the system if not provided on create
     * operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The actual arrival time of the aircraft at the air event, in ISO 8601 UTC format with
     * millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actualArrTime(): Optional<OffsetDateTime> = actualArrTime.getOptional("actualArrTime")

    /**
     * The actual departure time of the aircraft from the air event, in ISO 8601 UTC format with
     * millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actualDepTime(): Optional<OffsetDateTime> = actualDepTime.getOptional("actualDepTime")

    /**
     * The Air Refueling Control Time is the planned time the tanker aircraft will transfer fuel to
     * the receiver aircraft, in ISO 8601 UTC format, with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arct(): Optional<OffsetDateTime> = arct.getOptional("arct")

    /**
     * Type of process used by AMC to schedule this air refueling event. Possible values are A
     * (Matched Long Range), F (Matched AMC Short Notice), N (Unmatched Theater Operation Short
     * Notice (Theater Assets)), R, Unmatched Long Range, S (Soft Air Refueling), T (Matched Theater
     * Operation Short Notice (Theater Assets)), V (Unmatched AMC Short Notice), X (Unmatched
     * Theater Operation Short Notice (AMC Assets)), Y (Matched Theater Operation Short Notice (AMC
     * Assets)), Z (Other Air Refueling).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arEventType(): Optional<String> = arEventType.getOptional("arEventType")

    /**
     * The purpose of the air event at the arrival location. Can be either descriptive text such as
     * 'fuel onload' or a purpose code specified by the provider, such as 'A'.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arrPurpose(): Optional<String> = arrPurpose.getOptional("arrPurpose")

    /**
     * Identifier of the air refueling track, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arTrackId(): Optional<String> = arTrackId.getOptional("arTrackId")

    /**
     * Name of the air refueling track, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arTrackName(): Optional<String> = arTrackName.getOptional("arTrackName")

    /**
     * Altitude of this air event, in feet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun baseAlt(): Optional<Double> = baseAlt.getOptional("baseAlt")

    /**
     * Flag indicating that this air refueling event has been cancelled.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cancelled(): Optional<Boolean> = cancelled.getOptional("cancelled")

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
     * The purpose of the air event at the departure location. Can be either descriptive text such
     * as 'fuel onload' or a purpose code specified by the provider, such as 'A'.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun depPurpose(): Optional<String> = depPurpose.getOptional("depPurpose")

    /**
     * The current estimated arrival time of the aircraft at the air event, in ISO 8601 UTC format
     * with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun estArrTime(): Optional<OffsetDateTime> = estArrTime.getOptional("estArrTime")

    /**
     * The current estimated departure time of the aircraft from the air event, in ISO 8601 UTC
     * format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun estDepTime(): Optional<OffsetDateTime> = estDepTime.getOptional("estDepTime")

    /**
     * Optional air event ID from external systems. This field has no meaning within UDL and is
     * provided as a convenience for systems that require tracking of an internal system generated
     * ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun externalAirEventId(): Optional<String> =
        externalAirEventId.getOptional("externalAirEventId")

    /**
     * Optional air refueling track ID from external systems. This field has no meaning within UDL
     * and is provided as a convenience for systems that require tracking of an internal system
     * generated ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun externalArTrackId(): Optional<String> = externalArTrackId.getOptional("externalARTrackId")

    /**
     * The UDL unique identifier of the mission associated with this air event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idMission(): Optional<String> = idMission.getOptional("idMission")

    /**
     * The UDL unique identifier of the sortie associated with this air event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSortie(): Optional<String> = idSortie.getOptional("idSortie")

    /**
     * Identifies the Itinerary point of a sortie where an air event occurs.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun legNum(): Optional<Int> = legNum.getOptional("legNum")

    /**
     * The location representing this air event specified as a feature Id. Locations specified
     * include air refueling track Ids and air drop event locations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun location(): Optional<String> = location.getOptional("location")

    /**
     * The number of tankers requested for an air refueling event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numTankers(): Optional<Int> = numTankers.getOptional("numTankers")

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
     * The scheduled arrival time of the aircraft at the air event, in ISO 8601 UTC format with
     * millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun plannedArrTime(): Optional<OffsetDateTime> = plannedArrTime.getOptional("plannedArrTime")

    /**
     * The scheduled departure time of the aircraft from the air event, in ISO 8601 UTC format with
     * millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun plannedDepTime(): Optional<OffsetDateTime> = plannedDepTime.getOptional("plannedDepTime")

    /**
     * Priority of this air event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun priority(): Optional<String> = priority.getOptional("priority")

    /**
     * Collection of receiver aircraft associated with this Air Event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun receivers(): Optional<List<Receiver>> = receivers.getOptional("receivers")

    /**
     * Collection of remarks associated with this Air Event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun remarks(): Optional<List<Remark>> = remarks.getOptional("remarks")

    /**
     * Flag indicating if the receiver unit has requested flying an air refueling track in both
     * directions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun revTrack(): Optional<Boolean> = revTrack.getOptional("revTrack")

    /**
     * The Rendezvous Control Time is the planned time the tanker and receiver aircraft will
     * rendezvous for an en route type air refueling event, in ISO 8601 UTC format, with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rzct(): Optional<OffsetDateTime> = rzct.getOptional("rzct")

    /**
     * Rendezvous point for the tanker and receiver during this air refueling event. Possible values
     * are AN (Anchor Nav Point), AP (Anchor Pattern), CP (Control Point), ET (Entry Point), EX
     * (Exit Point), IP (Initial Point), NC (Nav Check Point).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rzPoint(): Optional<String> = rzPoint.getOptional("rzPoint")

    /**
     * Type of rendezvous used for this air refueling event. Possible values are BUD (Buddy), EN
     * (Enroute), GCI (Ground Control), PP (Point Parallel).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rzType(): Optional<String> = rzType.getOptional("rzType")

    /**
     * Flag indicating that the receiver unit has requested flying a short portion of an air
     * refueling track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shortTrack(): Optional<Boolean> = shortTrack.getOptional("shortTrack")

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
     * Status of this air refueling event track reservation. Receivers are responsible for
     * scheduling or reserving air refueling tracks. Possible values are A (Altitude Reservation), R
     * (Reserved), or Q (Questionable).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun statusCode(): Optional<String> = statusCode.getOptional("statusCode")

    /**
     * Collection of tanker aircraft associated with this Air Event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tankers(): Optional<List<Tanker>> = tankers.getOptional("tankers")

    /**
     * Length of time the receiver unit has requested for an air event, in hours.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackTime(): Optional<Double> = trackTime.getOptional("trackTime")

    /**
     * Time the row was updated in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Application user who updated the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

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
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [actualArrTime].
     *
     * Unlike [actualArrTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actualArrTime")
    @ExcludeMissing
    fun _actualArrTime(): JsonField<OffsetDateTime> = actualArrTime

    /**
     * Returns the raw JSON value of [actualDepTime].
     *
     * Unlike [actualDepTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actualDepTime")
    @ExcludeMissing
    fun _actualDepTime(): JsonField<OffsetDateTime> = actualDepTime

    /**
     * Returns the raw JSON value of [arct].
     *
     * Unlike [arct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arct") @ExcludeMissing fun _arct(): JsonField<OffsetDateTime> = arct

    /**
     * Returns the raw JSON value of [arEventType].
     *
     * Unlike [arEventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arEventType") @ExcludeMissing fun _arEventType(): JsonField<String> = arEventType

    /**
     * Returns the raw JSON value of [arrPurpose].
     *
     * Unlike [arrPurpose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arrPurpose") @ExcludeMissing fun _arrPurpose(): JsonField<String> = arrPurpose

    /**
     * Returns the raw JSON value of [arTrackId].
     *
     * Unlike [arTrackId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arTrackId") @ExcludeMissing fun _arTrackId(): JsonField<String> = arTrackId

    /**
     * Returns the raw JSON value of [arTrackName].
     *
     * Unlike [arTrackName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arTrackName") @ExcludeMissing fun _arTrackName(): JsonField<String> = arTrackName

    /**
     * Returns the raw JSON value of [baseAlt].
     *
     * Unlike [baseAlt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("baseAlt") @ExcludeMissing fun _baseAlt(): JsonField<Double> = baseAlt

    /**
     * Returns the raw JSON value of [cancelled].
     *
     * Unlike [cancelled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancelled") @ExcludeMissing fun _cancelled(): JsonField<Boolean> = cancelled

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
     * Returns the raw JSON value of [depPurpose].
     *
     * Unlike [depPurpose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depPurpose") @ExcludeMissing fun _depPurpose(): JsonField<String> = depPurpose

    /**
     * Returns the raw JSON value of [estArrTime].
     *
     * Unlike [estArrTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("estArrTime")
    @ExcludeMissing
    fun _estArrTime(): JsonField<OffsetDateTime> = estArrTime

    /**
     * Returns the raw JSON value of [estDepTime].
     *
     * Unlike [estDepTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("estDepTime")
    @ExcludeMissing
    fun _estDepTime(): JsonField<OffsetDateTime> = estDepTime

    /**
     * Returns the raw JSON value of [externalAirEventId].
     *
     * Unlike [externalAirEventId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externalAirEventId")
    @ExcludeMissing
    fun _externalAirEventId(): JsonField<String> = externalAirEventId

    /**
     * Returns the raw JSON value of [externalArTrackId].
     *
     * Unlike [externalArTrackId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externalARTrackId")
    @ExcludeMissing
    fun _externalArTrackId(): JsonField<String> = externalArTrackId

    /**
     * Returns the raw JSON value of [idMission].
     *
     * Unlike [idMission], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idMission") @ExcludeMissing fun _idMission(): JsonField<String> = idMission

    /**
     * Returns the raw JSON value of [idSortie].
     *
     * Unlike [idSortie], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSortie") @ExcludeMissing fun _idSortie(): JsonField<String> = idSortie

    /**
     * Returns the raw JSON value of [legNum].
     *
     * Unlike [legNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legNum") @ExcludeMissing fun _legNum(): JsonField<Int> = legNum

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

    /**
     * Returns the raw JSON value of [numTankers].
     *
     * Unlike [numTankers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numTankers") @ExcludeMissing fun _numTankers(): JsonField<Int> = numTankers

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
     * Returns the raw JSON value of [plannedArrTime].
     *
     * Unlike [plannedArrTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plannedArrTime")
    @ExcludeMissing
    fun _plannedArrTime(): JsonField<OffsetDateTime> = plannedArrTime

    /**
     * Returns the raw JSON value of [plannedDepTime].
     *
     * Unlike [plannedDepTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plannedDepTime")
    @ExcludeMissing
    fun _plannedDepTime(): JsonField<OffsetDateTime> = plannedDepTime

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<String> = priority

    /**
     * Returns the raw JSON value of [receivers].
     *
     * Unlike [receivers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receivers")
    @ExcludeMissing
    fun _receivers(): JsonField<List<Receiver>> = receivers

    /**
     * Returns the raw JSON value of [remarks].
     *
     * Unlike [remarks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remarks") @ExcludeMissing fun _remarks(): JsonField<List<Remark>> = remarks

    /**
     * Returns the raw JSON value of [revTrack].
     *
     * Unlike [revTrack], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revTrack") @ExcludeMissing fun _revTrack(): JsonField<Boolean> = revTrack

    /**
     * Returns the raw JSON value of [rzct].
     *
     * Unlike [rzct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rzct") @ExcludeMissing fun _rzct(): JsonField<OffsetDateTime> = rzct

    /**
     * Returns the raw JSON value of [rzPoint].
     *
     * Unlike [rzPoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rzPoint") @ExcludeMissing fun _rzPoint(): JsonField<String> = rzPoint

    /**
     * Returns the raw JSON value of [rzType].
     *
     * Unlike [rzType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rzType") @ExcludeMissing fun _rzType(): JsonField<String> = rzType

    /**
     * Returns the raw JSON value of [shortTrack].
     *
     * Unlike [shortTrack], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shortTrack") @ExcludeMissing fun _shortTrack(): JsonField<Boolean> = shortTrack

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [statusCode].
     *
     * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusCode") @ExcludeMissing fun _statusCode(): JsonField<String> = statusCode

    /**
     * Returns the raw JSON value of [tankers].
     *
     * Unlike [tankers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tankers") @ExcludeMissing fun _tankers(): JsonField<List<Tanker>> = tankers

    /**
     * Returns the raw JSON value of [trackTime].
     *
     * Unlike [trackTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackTime") @ExcludeMissing fun _trackTime(): JsonField<Double> = trackTime

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [updatedBy].
     *
     * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedBy") @ExcludeMissing fun _updatedBy(): JsonField<String> = updatedBy

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
         * Returns a mutable builder for constructing an instance of [AirEventTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AirEventTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var actualArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var actualDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var arct: JsonField<OffsetDateTime> = JsonMissing.of()
        private var arEventType: JsonField<String> = JsonMissing.of()
        private var arrPurpose: JsonField<String> = JsonMissing.of()
        private var arTrackId: JsonField<String> = JsonMissing.of()
        private var arTrackName: JsonField<String> = JsonMissing.of()
        private var baseAlt: JsonField<Double> = JsonMissing.of()
        private var cancelled: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var depPurpose: JsonField<String> = JsonMissing.of()
        private var estArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var estDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalAirEventId: JsonField<String> = JsonMissing.of()
        private var externalArTrackId: JsonField<String> = JsonMissing.of()
        private var idMission: JsonField<String> = JsonMissing.of()
        private var idSortie: JsonField<String> = JsonMissing.of()
        private var legNum: JsonField<Int> = JsonMissing.of()
        private var location: JsonField<String> = JsonMissing.of()
        private var numTankers: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var plannedArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var plannedDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var priority: JsonField<String> = JsonMissing.of()
        private var receivers: JsonField<MutableList<Receiver>>? = null
        private var remarks: JsonField<MutableList<Remark>>? = null
        private var revTrack: JsonField<Boolean> = JsonMissing.of()
        private var rzct: JsonField<OffsetDateTime> = JsonMissing.of()
        private var rzPoint: JsonField<String> = JsonMissing.of()
        private var rzType: JsonField<String> = JsonMissing.of()
        private var shortTrack: JsonField<Boolean> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var statusCode: JsonField<String> = JsonMissing.of()
        private var tankers: JsonField<MutableList<Tanker>>? = null
        private var trackTime: JsonField<Double> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(airEventTupleResponse: AirEventTupleResponse) = apply {
            classificationMarking = airEventTupleResponse.classificationMarking
            dataMode = airEventTupleResponse.dataMode
            source = airEventTupleResponse.source
            type = airEventTupleResponse.type
            id = airEventTupleResponse.id
            actualArrTime = airEventTupleResponse.actualArrTime
            actualDepTime = airEventTupleResponse.actualDepTime
            arct = airEventTupleResponse.arct
            arEventType = airEventTupleResponse.arEventType
            arrPurpose = airEventTupleResponse.arrPurpose
            arTrackId = airEventTupleResponse.arTrackId
            arTrackName = airEventTupleResponse.arTrackName
            baseAlt = airEventTupleResponse.baseAlt
            cancelled = airEventTupleResponse.cancelled
            createdAt = airEventTupleResponse.createdAt
            createdBy = airEventTupleResponse.createdBy
            depPurpose = airEventTupleResponse.depPurpose
            estArrTime = airEventTupleResponse.estArrTime
            estDepTime = airEventTupleResponse.estDepTime
            externalAirEventId = airEventTupleResponse.externalAirEventId
            externalArTrackId = airEventTupleResponse.externalArTrackId
            idMission = airEventTupleResponse.idMission
            idSortie = airEventTupleResponse.idSortie
            legNum = airEventTupleResponse.legNum
            location = airEventTupleResponse.location
            numTankers = airEventTupleResponse.numTankers
            origin = airEventTupleResponse.origin
            origNetwork = airEventTupleResponse.origNetwork
            plannedArrTime = airEventTupleResponse.plannedArrTime
            plannedDepTime = airEventTupleResponse.plannedDepTime
            priority = airEventTupleResponse.priority
            receivers = airEventTupleResponse.receivers.map { it.toMutableList() }
            remarks = airEventTupleResponse.remarks.map { it.toMutableList() }
            revTrack = airEventTupleResponse.revTrack
            rzct = airEventTupleResponse.rzct
            rzPoint = airEventTupleResponse.rzPoint
            rzType = airEventTupleResponse.rzType
            shortTrack = airEventTupleResponse.shortTrack
            sourceDl = airEventTupleResponse.sourceDl
            statusCode = airEventTupleResponse.statusCode
            tankers = airEventTupleResponse.tankers.map { it.toMutableList() }
            trackTime = airEventTupleResponse.trackTime
            updatedAt = airEventTupleResponse.updatedAt
            updatedBy = airEventTupleResponse.updatedBy
            additionalProperties = airEventTupleResponse.additionalProperties.toMutableMap()
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

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Type of air event (e.g. FUEL TRANSFER, AIR DROP, etc). */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /**
         * Unique identifier of the record, auto-generated by the system if not provided on create
         * operations.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The actual arrival time of the aircraft at the air event, in ISO 8601 UTC format with
         * millisecond precision.
         */
        fun actualArrTime(actualArrTime: OffsetDateTime) =
            actualArrTime(JsonField.of(actualArrTime))

        /**
         * Sets [Builder.actualArrTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actualArrTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actualArrTime(actualArrTime: JsonField<OffsetDateTime>) = apply {
            this.actualArrTime = actualArrTime
        }

        /**
         * The actual departure time of the aircraft from the air event, in ISO 8601 UTC format with
         * millisecond precision.
         */
        fun actualDepTime(actualDepTime: OffsetDateTime) =
            actualDepTime(JsonField.of(actualDepTime))

        /**
         * Sets [Builder.actualDepTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actualDepTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actualDepTime(actualDepTime: JsonField<OffsetDateTime>) = apply {
            this.actualDepTime = actualDepTime
        }

        /**
         * The Air Refueling Control Time is the planned time the tanker aircraft will transfer fuel
         * to the receiver aircraft, in ISO 8601 UTC format, with millisecond precision.
         */
        fun arct(arct: OffsetDateTime) = arct(JsonField.of(arct))

        /**
         * Sets [Builder.arct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arct] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun arct(arct: JsonField<OffsetDateTime>) = apply { this.arct = arct }

        /**
         * Type of process used by AMC to schedule this air refueling event. Possible values are A
         * (Matched Long Range), F (Matched AMC Short Notice), N (Unmatched Theater Operation Short
         * Notice (Theater Assets)), R, Unmatched Long Range, S (Soft Air Refueling), T (Matched
         * Theater Operation Short Notice (Theater Assets)), V (Unmatched AMC Short Notice), X
         * (Unmatched Theater Operation Short Notice (AMC Assets)), Y (Matched Theater Operation
         * Short Notice (AMC Assets)), Z (Other Air Refueling).
         */
        fun arEventType(arEventType: String) = arEventType(JsonField.of(arEventType))

        /**
         * Sets [Builder.arEventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arEventType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun arEventType(arEventType: JsonField<String>) = apply { this.arEventType = arEventType }

        /**
         * The purpose of the air event at the arrival location. Can be either descriptive text such
         * as 'fuel onload' or a purpose code specified by the provider, such as 'A'.
         */
        fun arrPurpose(arrPurpose: String) = arrPurpose(JsonField.of(arrPurpose))

        /**
         * Sets [Builder.arrPurpose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrPurpose] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun arrPurpose(arrPurpose: JsonField<String>) = apply { this.arrPurpose = arrPurpose }

        /** Identifier of the air refueling track, if applicable. */
        fun arTrackId(arTrackId: String) = arTrackId(JsonField.of(arTrackId))

        /**
         * Sets [Builder.arTrackId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arTrackId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun arTrackId(arTrackId: JsonField<String>) = apply { this.arTrackId = arTrackId }

        /** Name of the air refueling track, if applicable. */
        fun arTrackName(arTrackName: String) = arTrackName(JsonField.of(arTrackName))

        /**
         * Sets [Builder.arTrackName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arTrackName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun arTrackName(arTrackName: JsonField<String>) = apply { this.arTrackName = arTrackName }

        /** Altitude of this air event, in feet. */
        fun baseAlt(baseAlt: Double) = baseAlt(JsonField.of(baseAlt))

        /**
         * Sets [Builder.baseAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseAlt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun baseAlt(baseAlt: JsonField<Double>) = apply { this.baseAlt = baseAlt }

        /** Flag indicating that this air refueling event has been cancelled. */
        fun cancelled(cancelled: Boolean) = cancelled(JsonField.of(cancelled))

        /**
         * Sets [Builder.cancelled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cancelled(cancelled: JsonField<Boolean>) = apply { this.cancelled = cancelled }

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
         * The purpose of the air event at the departure location. Can be either descriptive text
         * such as 'fuel onload' or a purpose code specified by the provider, such as 'A'.
         */
        fun depPurpose(depPurpose: String) = depPurpose(JsonField.of(depPurpose))

        /**
         * Sets [Builder.depPurpose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depPurpose] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun depPurpose(depPurpose: JsonField<String>) = apply { this.depPurpose = depPurpose }

        /**
         * The current estimated arrival time of the aircraft at the air event, in ISO 8601 UTC
         * format with millisecond precision.
         */
        fun estArrTime(estArrTime: OffsetDateTime) = estArrTime(JsonField.of(estArrTime))

        /**
         * Sets [Builder.estArrTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estArrTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun estArrTime(estArrTime: JsonField<OffsetDateTime>) = apply {
            this.estArrTime = estArrTime
        }

        /**
         * The current estimated departure time of the aircraft from the air event, in ISO 8601 UTC
         * format with millisecond precision.
         */
        fun estDepTime(estDepTime: OffsetDateTime) = estDepTime(JsonField.of(estDepTime))

        /**
         * Sets [Builder.estDepTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estDepTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun estDepTime(estDepTime: JsonField<OffsetDateTime>) = apply {
            this.estDepTime = estDepTime
        }

        /**
         * Optional air event ID from external systems. This field has no meaning within UDL and is
         * provided as a convenience for systems that require tracking of an internal system
         * generated ID.
         */
        fun externalAirEventId(externalAirEventId: String) =
            externalAirEventId(JsonField.of(externalAirEventId))

        /**
         * Sets [Builder.externalAirEventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalAirEventId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalAirEventId(externalAirEventId: JsonField<String>) = apply {
            this.externalAirEventId = externalAirEventId
        }

        /**
         * Optional air refueling track ID from external systems. This field has no meaning within
         * UDL and is provided as a convenience for systems that require tracking of an internal
         * system generated ID.
         */
        fun externalArTrackId(externalArTrackId: String) =
            externalArTrackId(JsonField.of(externalArTrackId))

        /**
         * Sets [Builder.externalArTrackId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalArTrackId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalArTrackId(externalArTrackId: JsonField<String>) = apply {
            this.externalArTrackId = externalArTrackId
        }

        /** The UDL unique identifier of the mission associated with this air event. */
        fun idMission(idMission: String) = idMission(JsonField.of(idMission))

        /**
         * Sets [Builder.idMission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idMission] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idMission(idMission: JsonField<String>) = apply { this.idMission = idMission }

        /** The UDL unique identifier of the sortie associated with this air event. */
        fun idSortie(idSortie: String) = idSortie(JsonField.of(idSortie))

        /**
         * Sets [Builder.idSortie] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSortie] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSortie(idSortie: JsonField<String>) = apply { this.idSortie = idSortie }

        /** Identifies the Itinerary point of a sortie where an air event occurs. */
        fun legNum(legNum: Int) = legNum(JsonField.of(legNum))

        /**
         * Sets [Builder.legNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legNum] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun legNum(legNum: JsonField<Int>) = apply { this.legNum = legNum }

        /**
         * The location representing this air event specified as a feature Id. Locations specified
         * include air refueling track Ids and air drop event locations.
         */
        fun location(location: String) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun location(location: JsonField<String>) = apply { this.location = location }

        /** The number of tankers requested for an air refueling event. */
        fun numTankers(numTankers: Int) = numTankers(JsonField.of(numTankers))

        /**
         * Sets [Builder.numTankers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numTankers] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numTankers(numTankers: JsonField<Int>) = apply { this.numTankers = numTankers }

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
         * The scheduled arrival time of the aircraft at the air event, in ISO 8601 UTC format with
         * millisecond precision.
         */
        fun plannedArrTime(plannedArrTime: OffsetDateTime) =
            plannedArrTime(JsonField.of(plannedArrTime))

        /**
         * Sets [Builder.plannedArrTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plannedArrTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun plannedArrTime(plannedArrTime: JsonField<OffsetDateTime>) = apply {
            this.plannedArrTime = plannedArrTime
        }

        /**
         * The scheduled departure time of the aircraft from the air event, in ISO 8601 UTC format
         * with millisecond precision.
         */
        fun plannedDepTime(plannedDepTime: OffsetDateTime) =
            plannedDepTime(JsonField.of(plannedDepTime))

        /**
         * Sets [Builder.plannedDepTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plannedDepTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun plannedDepTime(plannedDepTime: JsonField<OffsetDateTime>) = apply {
            this.plannedDepTime = plannedDepTime
        }

        /** Priority of this air event. */
        fun priority(priority: String) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<String>) = apply { this.priority = priority }

        /** Collection of receiver aircraft associated with this Air Event. */
        fun receivers(receivers: List<Receiver>) = receivers(JsonField.of(receivers))

        /**
         * Sets [Builder.receivers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivers] with a well-typed `List<Receiver>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receivers(receivers: JsonField<List<Receiver>>) = apply {
            this.receivers = receivers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Receiver] to [receivers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReceiver(receiver: Receiver) = apply {
            receivers =
                (receivers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("receivers", it).add(receiver)
                }
        }

        /** Collection of remarks associated with this Air Event. */
        fun remarks(remarks: List<Remark>) = remarks(JsonField.of(remarks))

        /**
         * Sets [Builder.remarks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remarks] with a well-typed `List<Remark>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun remarks(remarks: JsonField<List<Remark>>) = apply {
            this.remarks = remarks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Remark] to [remarks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemark(remark: Remark) = apply {
            remarks =
                (remarks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("remarks", it).add(remark)
                }
        }

        /**
         * Flag indicating if the receiver unit has requested flying an air refueling track in both
         * directions.
         */
        fun revTrack(revTrack: Boolean) = revTrack(JsonField.of(revTrack))

        /**
         * Sets [Builder.revTrack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revTrack] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun revTrack(revTrack: JsonField<Boolean>) = apply { this.revTrack = revTrack }

        /**
         * The Rendezvous Control Time is the planned time the tanker and receiver aircraft will
         * rendezvous for an en route type air refueling event, in ISO 8601 UTC format, with
         * millisecond precision.
         */
        fun rzct(rzct: OffsetDateTime) = rzct(JsonField.of(rzct))

        /**
         * Sets [Builder.rzct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rzct] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rzct(rzct: JsonField<OffsetDateTime>) = apply { this.rzct = rzct }

        /**
         * Rendezvous point for the tanker and receiver during this air refueling event. Possible
         * values are AN (Anchor Nav Point), AP (Anchor Pattern), CP (Control Point), ET (Entry
         * Point), EX (Exit Point), IP (Initial Point), NC (Nav Check Point).
         */
        fun rzPoint(rzPoint: String) = rzPoint(JsonField.of(rzPoint))

        /**
         * Sets [Builder.rzPoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rzPoint] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rzPoint(rzPoint: JsonField<String>) = apply { this.rzPoint = rzPoint }

        /**
         * Type of rendezvous used for this air refueling event. Possible values are BUD (Buddy), EN
         * (Enroute), GCI (Ground Control), PP (Point Parallel).
         */
        fun rzType(rzType: String) = rzType(JsonField.of(rzType))

        /**
         * Sets [Builder.rzType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rzType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rzType(rzType: JsonField<String>) = apply { this.rzType = rzType }

        /**
         * Flag indicating that the receiver unit has requested flying a short portion of an air
         * refueling track.
         */
        fun shortTrack(shortTrack: Boolean) = shortTrack(JsonField.of(shortTrack))

        /**
         * Sets [Builder.shortTrack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortTrack] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shortTrack(shortTrack: JsonField<Boolean>) = apply { this.shortTrack = shortTrack }

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
         * Status of this air refueling event track reservation. Receivers are responsible for
         * scheduling or reserving air refueling tracks. Possible values are A (Altitude
         * Reservation), R (Reserved), or Q (Questionable).
         */
        fun statusCode(statusCode: String) = statusCode(JsonField.of(statusCode))

        /**
         * Sets [Builder.statusCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun statusCode(statusCode: JsonField<String>) = apply { this.statusCode = statusCode }

        /** Collection of tanker aircraft associated with this Air Event. */
        fun tankers(tankers: List<Tanker>) = tankers(JsonField.of(tankers))

        /**
         * Sets [Builder.tankers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tankers] with a well-typed `List<Tanker>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tankers(tankers: JsonField<List<Tanker>>) = apply {
            this.tankers = tankers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Tanker] to [tankers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTanker(tanker: Tanker) = apply {
            tankers =
                (tankers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tankers", it).add(tanker)
                }
        }

        /** Length of time the receiver unit has requested for an air event, in hours. */
        fun trackTime(trackTime: Double) = trackTime(JsonField.of(trackTime))

        /**
         * Sets [Builder.trackTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackTime] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trackTime(trackTime: JsonField<Double>) = apply { this.trackTime = trackTime }

        /** Time the row was updated in the database, auto-populated by the system. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Application user who updated the row in the database, auto-populated by the system. */
        fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

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
         * Returns an immutable instance of [AirEventTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AirEventTupleResponse =
            AirEventTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                checkRequired("type", type),
                id,
                actualArrTime,
                actualDepTime,
                arct,
                arEventType,
                arrPurpose,
                arTrackId,
                arTrackName,
                baseAlt,
                cancelled,
                createdAt,
                createdBy,
                depPurpose,
                estArrTime,
                estDepTime,
                externalAirEventId,
                externalArTrackId,
                idMission,
                idSortie,
                legNum,
                location,
                numTankers,
                origin,
                origNetwork,
                plannedArrTime,
                plannedDepTime,
                priority,
                (receivers ?: JsonMissing.of()).map { it.toImmutable() },
                (remarks ?: JsonMissing.of()).map { it.toImmutable() },
                revTrack,
                rzct,
                rzPoint,
                rzType,
                shortTrack,
                sourceDl,
                statusCode,
                (tankers ?: JsonMissing.of()).map { it.toImmutable() },
                trackTime,
                updatedAt,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AirEventTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        type()
        id()
        actualArrTime()
        actualDepTime()
        arct()
        arEventType()
        arrPurpose()
        arTrackId()
        arTrackName()
        baseAlt()
        cancelled()
        createdAt()
        createdBy()
        depPurpose()
        estArrTime()
        estDepTime()
        externalAirEventId()
        externalArTrackId()
        idMission()
        idSortie()
        legNum()
        location()
        numTankers()
        origin()
        origNetwork()
        plannedArrTime()
        plannedDepTime()
        priority()
        receivers().ifPresent { it.forEach { it.validate() } }
        remarks().ifPresent { it.forEach { it.validate() } }
        revTrack()
        rzct()
        rzPoint()
        rzType()
        shortTrack()
        sourceDl()
        statusCode()
        tankers().ifPresent { it.forEach { it.validate() } }
        trackTime()
        updatedAt()
        updatedBy()
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
        (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (actualArrTime.asKnown().isPresent) 1 else 0) +
            (if (actualDepTime.asKnown().isPresent) 1 else 0) +
            (if (arct.asKnown().isPresent) 1 else 0) +
            (if (arEventType.asKnown().isPresent) 1 else 0) +
            (if (arrPurpose.asKnown().isPresent) 1 else 0) +
            (if (arTrackId.asKnown().isPresent) 1 else 0) +
            (if (arTrackName.asKnown().isPresent) 1 else 0) +
            (if (baseAlt.asKnown().isPresent) 1 else 0) +
            (if (cancelled.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (depPurpose.asKnown().isPresent) 1 else 0) +
            (if (estArrTime.asKnown().isPresent) 1 else 0) +
            (if (estDepTime.asKnown().isPresent) 1 else 0) +
            (if (externalAirEventId.asKnown().isPresent) 1 else 0) +
            (if (externalArTrackId.asKnown().isPresent) 1 else 0) +
            (if (idMission.asKnown().isPresent) 1 else 0) +
            (if (idSortie.asKnown().isPresent) 1 else 0) +
            (if (legNum.asKnown().isPresent) 1 else 0) +
            (if (location.asKnown().isPresent) 1 else 0) +
            (if (numTankers.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (plannedArrTime.asKnown().isPresent) 1 else 0) +
            (if (plannedDepTime.asKnown().isPresent) 1 else 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (receivers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (remarks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (revTrack.asKnown().isPresent) 1 else 0) +
            (if (rzct.asKnown().isPresent) 1 else 0) +
            (if (rzPoint.asKnown().isPresent) 1 else 0) +
            (if (rzType.asKnown().isPresent) 1 else 0) +
            (if (shortTrack.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (statusCode.asKnown().isPresent) 1 else 0) +
            (tankers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (trackTime.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0)

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

            return other is DataMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Collection of receiver aircraft associated with this Air Event. */
    class Receiver
    private constructor(
        private val altReceiverMissionId: JsonField<String>,
        private val amcReceiverMissionId: JsonField<String>,
        private val externalReceiverId: JsonField<String>,
        private val fuelOn: JsonField<Double>,
        private val idReceiverAirfield: JsonField<String>,
        private val idReceiverMission: JsonField<String>,
        private val idReceiverSortie: JsonField<String>,
        private val numRecAircraft: JsonField<Int>,
        private val packageId: JsonField<String>,
        private val receiverCallSign: JsonField<String>,
        private val receiverCellPosition: JsonField<Int>,
        private val receiverCoord: JsonField<String>,
        private val receiverDeliveryMethod: JsonField<String>,
        private val receiverDeployedIcao: JsonField<String>,
        private val receiverExercise: JsonField<String>,
        private val receiverFuelType: JsonField<String>,
        private val receiverLegNum: JsonField<Int>,
        private val receiverMds: JsonField<String>,
        private val receiverOwner: JsonField<String>,
        private val receiverPoc: JsonField<String>,
        private val recOrg: JsonField<String>,
        private val sequenceNum: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("altReceiverMissionId")
            @ExcludeMissing
            altReceiverMissionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amcReceiverMissionId")
            @ExcludeMissing
            amcReceiverMissionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("externalReceiverId")
            @ExcludeMissing
            externalReceiverId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fuelOn") @ExcludeMissing fuelOn: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("idReceiverAirfield")
            @ExcludeMissing
            idReceiverAirfield: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idReceiverMission")
            @ExcludeMissing
            idReceiverMission: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idReceiverSortie")
            @ExcludeMissing
            idReceiverSortie: JsonField<String> = JsonMissing.of(),
            @JsonProperty("numRecAircraft")
            @ExcludeMissing
            numRecAircraft: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("packageId")
            @ExcludeMissing
            packageId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiverCallSign")
            @ExcludeMissing
            receiverCallSign: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiverCellPosition")
            @ExcludeMissing
            receiverCellPosition: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("receiverCoord")
            @ExcludeMissing
            receiverCoord: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiverDeliveryMethod")
            @ExcludeMissing
            receiverDeliveryMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiverDeployedICAO")
            @ExcludeMissing
            receiverDeployedIcao: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiverExercise")
            @ExcludeMissing
            receiverExercise: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiverFuelType")
            @ExcludeMissing
            receiverFuelType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiverLegNum")
            @ExcludeMissing
            receiverLegNum: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("receiverMDS")
            @ExcludeMissing
            receiverMds: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiverOwner")
            @ExcludeMissing
            receiverOwner: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiverPOC")
            @ExcludeMissing
            receiverPoc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recOrg") @ExcludeMissing recOrg: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sequenceNum")
            @ExcludeMissing
            sequenceNum: JsonField<String> = JsonMissing.of(),
        ) : this(
            altReceiverMissionId,
            amcReceiverMissionId,
            externalReceiverId,
            fuelOn,
            idReceiverAirfield,
            idReceiverMission,
            idReceiverSortie,
            numRecAircraft,
            packageId,
            receiverCallSign,
            receiverCellPosition,
            receiverCoord,
            receiverDeliveryMethod,
            receiverDeployedIcao,
            receiverExercise,
            receiverFuelType,
            receiverLegNum,
            receiverMds,
            receiverOwner,
            receiverPoc,
            recOrg,
            sequenceNum,
            mutableMapOf(),
        )

        /**
         * Alternate mission identifier of this receiver provided by source.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun altReceiverMissionId(): Optional<String> =
            altReceiverMissionId.getOptional("altReceiverMissionId")

        /**
         * The Air Mobility Command (AMC) mission identifier of this receiver.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun amcReceiverMissionId(): Optional<String> =
            amcReceiverMissionId.getOptional("amcReceiverMissionId")

        /**
         * Optional receiver identifier from external systems. This field has no meaning within UDL
         * and is provided as a convenience for systems that require tracking of an internal system
         * generated ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun externalReceiverId(): Optional<String> =
            externalReceiverId.getOptional("externalReceiverId")

        /**
         * Total weight of the fuel transferred to this receiver during an air refueling event, in
         * pounds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fuelOn(): Optional<Double> = fuelOn.getOptional("fuelOn")

        /**
         * The UDL ID of the airfield this receiver is associated with for this event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idReceiverAirfield(): Optional<String> =
            idReceiverAirfield.getOptional("idReceiverAirfield")

        /**
         * The UDL ID of the mission this receiver is associated with for this event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idReceiverMission(): Optional<String> =
            idReceiverMission.getOptional("idReceiverMission")

        /**
         * The UDL ID of the aircraft sortie this receiver is associated with for this event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idReceiverSortie(): Optional<String> = idReceiverSortie.getOptional("idReceiverSortie")

        /**
         * Number of aircraft contained within one receiver coordination record for an air refueling
         * event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numRecAircraft(): Optional<Int> = numRecAircraft.getOptional("numRecAircraft")

        /**
         * The package identifier for the receiver in an air refueling event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun packageId(): Optional<String> = packageId.getOptional("packageId")

        /**
         * The call sign assigned to this receiver.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun receiverCallSign(): Optional<String> = receiverCallSign.getOptional("receiverCallSign")

        /**
         * Position of this receiver within a group of receivers in an air refueling event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun receiverCellPosition(): Optional<Int> =
            receiverCellPosition.getOptional("receiverCellPosition")

        /**
         * Coordination record identifier of this receiver.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun receiverCoord(): Optional<String> = receiverCoord.getOptional("receiverCoord")

        /**
         * Type of fuel delivery method used by the receiver during an air refueling event (BOOM,
         * DROGUE, BOTH).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun receiverDeliveryMethod(): Optional<String> =
            receiverDeliveryMethod.getOptional("receiverDeliveryMethod")

        /**
         * Location the receiver is deployed to for an air refueling event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun receiverDeployedIcao(): Optional<String> =
            receiverDeployedIcao.getOptional("receiverDeployedICAO")

        /**
         * Name of the receiver exercise associated with an air refueling event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun receiverExercise(): Optional<String> = receiverExercise.getOptional("receiverExercise")

        /**
         * Type of fuel being transferred to the receiver in an air refueling event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun receiverFuelType(): Optional<String> = receiverFuelType.getOptional("receiverFuelType")

        /**
         * Identifies the itinerary point of a mission that this receiver is linked to.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun receiverLegNum(): Optional<Int> = receiverLegNum.getOptional("receiverLegNum")

        /**
         * The Model Design Series designation of this receiver.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun receiverMds(): Optional<String> = receiverMds.getOptional("receiverMDS")

        /**
         * The wing or unit that owns this receiver.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun receiverOwner(): Optional<String> = receiverOwner.getOptional("receiverOwner")

        /**
         * The name and/or number of the point of contact for this receiver.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun receiverPoc(): Optional<String> = receiverPoc.getOptional("receiverPOC")

        /**
         * The major command level (MAJCOM) or foreign military sales (FMS) name of the receiver's
         * organization. The tanker flying hours used for an air refueling event are logged against
         * the receiver MAJCOM or foreign government being supported.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun recOrg(): Optional<String> = recOrg.getOptional("recOrg")

        /**
         * Indicates the unique number by Unit ID, which identifies an air refueling event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sequenceNum(): Optional<String> = sequenceNum.getOptional("sequenceNum")

        /**
         * Returns the raw JSON value of [altReceiverMissionId].
         *
         * Unlike [altReceiverMissionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("altReceiverMissionId")
        @ExcludeMissing
        fun _altReceiverMissionId(): JsonField<String> = altReceiverMissionId

        /**
         * Returns the raw JSON value of [amcReceiverMissionId].
         *
         * Unlike [amcReceiverMissionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("amcReceiverMissionId")
        @ExcludeMissing
        fun _amcReceiverMissionId(): JsonField<String> = amcReceiverMissionId

        /**
         * Returns the raw JSON value of [externalReceiverId].
         *
         * Unlike [externalReceiverId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("externalReceiverId")
        @ExcludeMissing
        fun _externalReceiverId(): JsonField<String> = externalReceiverId

        /**
         * Returns the raw JSON value of [fuelOn].
         *
         * Unlike [fuelOn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fuelOn") @ExcludeMissing fun _fuelOn(): JsonField<Double> = fuelOn

        /**
         * Returns the raw JSON value of [idReceiverAirfield].
         *
         * Unlike [idReceiverAirfield], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("idReceiverAirfield")
        @ExcludeMissing
        fun _idReceiverAirfield(): JsonField<String> = idReceiverAirfield

        /**
         * Returns the raw JSON value of [idReceiverMission].
         *
         * Unlike [idReceiverMission], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idReceiverMission")
        @ExcludeMissing
        fun _idReceiverMission(): JsonField<String> = idReceiverMission

        /**
         * Returns the raw JSON value of [idReceiverSortie].
         *
         * Unlike [idReceiverSortie], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idReceiverSortie")
        @ExcludeMissing
        fun _idReceiverSortie(): JsonField<String> = idReceiverSortie

        /**
         * Returns the raw JSON value of [numRecAircraft].
         *
         * Unlike [numRecAircraft], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("numRecAircraft")
        @ExcludeMissing
        fun _numRecAircraft(): JsonField<Int> = numRecAircraft

        /**
         * Returns the raw JSON value of [packageId].
         *
         * Unlike [packageId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("packageId") @ExcludeMissing fun _packageId(): JsonField<String> = packageId

        /**
         * Returns the raw JSON value of [receiverCallSign].
         *
         * Unlike [receiverCallSign], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiverCallSign")
        @ExcludeMissing
        fun _receiverCallSign(): JsonField<String> = receiverCallSign

        /**
         * Returns the raw JSON value of [receiverCellPosition].
         *
         * Unlike [receiverCellPosition], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("receiverCellPosition")
        @ExcludeMissing
        fun _receiverCellPosition(): JsonField<Int> = receiverCellPosition

        /**
         * Returns the raw JSON value of [receiverCoord].
         *
         * Unlike [receiverCoord], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiverCoord")
        @ExcludeMissing
        fun _receiverCoord(): JsonField<String> = receiverCoord

        /**
         * Returns the raw JSON value of [receiverDeliveryMethod].
         *
         * Unlike [receiverDeliveryMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("receiverDeliveryMethod")
        @ExcludeMissing
        fun _receiverDeliveryMethod(): JsonField<String> = receiverDeliveryMethod

        /**
         * Returns the raw JSON value of [receiverDeployedIcao].
         *
         * Unlike [receiverDeployedIcao], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("receiverDeployedICAO")
        @ExcludeMissing
        fun _receiverDeployedIcao(): JsonField<String> = receiverDeployedIcao

        /**
         * Returns the raw JSON value of [receiverExercise].
         *
         * Unlike [receiverExercise], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiverExercise")
        @ExcludeMissing
        fun _receiverExercise(): JsonField<String> = receiverExercise

        /**
         * Returns the raw JSON value of [receiverFuelType].
         *
         * Unlike [receiverFuelType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiverFuelType")
        @ExcludeMissing
        fun _receiverFuelType(): JsonField<String> = receiverFuelType

        /**
         * Returns the raw JSON value of [receiverLegNum].
         *
         * Unlike [receiverLegNum], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiverLegNum")
        @ExcludeMissing
        fun _receiverLegNum(): JsonField<Int> = receiverLegNum

        /**
         * Returns the raw JSON value of [receiverMds].
         *
         * Unlike [receiverMds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("receiverMDS")
        @ExcludeMissing
        fun _receiverMds(): JsonField<String> = receiverMds

        /**
         * Returns the raw JSON value of [receiverOwner].
         *
         * Unlike [receiverOwner], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiverOwner")
        @ExcludeMissing
        fun _receiverOwner(): JsonField<String> = receiverOwner

        /**
         * Returns the raw JSON value of [receiverPoc].
         *
         * Unlike [receiverPoc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("receiverPOC")
        @ExcludeMissing
        fun _receiverPoc(): JsonField<String> = receiverPoc

        /**
         * Returns the raw JSON value of [recOrg].
         *
         * Unlike [recOrg], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recOrg") @ExcludeMissing fun _recOrg(): JsonField<String> = recOrg

        /**
         * Returns the raw JSON value of [sequenceNum].
         *
         * Unlike [sequenceNum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sequenceNum")
        @ExcludeMissing
        fun _sequenceNum(): JsonField<String> = sequenceNum

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

            /** Returns a mutable builder for constructing an instance of [Receiver]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Receiver]. */
        class Builder internal constructor() {

            private var altReceiverMissionId: JsonField<String> = JsonMissing.of()
            private var amcReceiverMissionId: JsonField<String> = JsonMissing.of()
            private var externalReceiverId: JsonField<String> = JsonMissing.of()
            private var fuelOn: JsonField<Double> = JsonMissing.of()
            private var idReceiverAirfield: JsonField<String> = JsonMissing.of()
            private var idReceiverMission: JsonField<String> = JsonMissing.of()
            private var idReceiverSortie: JsonField<String> = JsonMissing.of()
            private var numRecAircraft: JsonField<Int> = JsonMissing.of()
            private var packageId: JsonField<String> = JsonMissing.of()
            private var receiverCallSign: JsonField<String> = JsonMissing.of()
            private var receiverCellPosition: JsonField<Int> = JsonMissing.of()
            private var receiverCoord: JsonField<String> = JsonMissing.of()
            private var receiverDeliveryMethod: JsonField<String> = JsonMissing.of()
            private var receiverDeployedIcao: JsonField<String> = JsonMissing.of()
            private var receiverExercise: JsonField<String> = JsonMissing.of()
            private var receiverFuelType: JsonField<String> = JsonMissing.of()
            private var receiverLegNum: JsonField<Int> = JsonMissing.of()
            private var receiverMds: JsonField<String> = JsonMissing.of()
            private var receiverOwner: JsonField<String> = JsonMissing.of()
            private var receiverPoc: JsonField<String> = JsonMissing.of()
            private var recOrg: JsonField<String> = JsonMissing.of()
            private var sequenceNum: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(receiver: Receiver) = apply {
                altReceiverMissionId = receiver.altReceiverMissionId
                amcReceiverMissionId = receiver.amcReceiverMissionId
                externalReceiverId = receiver.externalReceiverId
                fuelOn = receiver.fuelOn
                idReceiverAirfield = receiver.idReceiverAirfield
                idReceiverMission = receiver.idReceiverMission
                idReceiverSortie = receiver.idReceiverSortie
                numRecAircraft = receiver.numRecAircraft
                packageId = receiver.packageId
                receiverCallSign = receiver.receiverCallSign
                receiverCellPosition = receiver.receiverCellPosition
                receiverCoord = receiver.receiverCoord
                receiverDeliveryMethod = receiver.receiverDeliveryMethod
                receiverDeployedIcao = receiver.receiverDeployedIcao
                receiverExercise = receiver.receiverExercise
                receiverFuelType = receiver.receiverFuelType
                receiverLegNum = receiver.receiverLegNum
                receiverMds = receiver.receiverMds
                receiverOwner = receiver.receiverOwner
                receiverPoc = receiver.receiverPoc
                recOrg = receiver.recOrg
                sequenceNum = receiver.sequenceNum
                additionalProperties = receiver.additionalProperties.toMutableMap()
            }

            /** Alternate mission identifier of this receiver provided by source. */
            fun altReceiverMissionId(altReceiverMissionId: String) =
                altReceiverMissionId(JsonField.of(altReceiverMissionId))

            /**
             * Sets [Builder.altReceiverMissionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altReceiverMissionId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun altReceiverMissionId(altReceiverMissionId: JsonField<String>) = apply {
                this.altReceiverMissionId = altReceiverMissionId
            }

            /** The Air Mobility Command (AMC) mission identifier of this receiver. */
            fun amcReceiverMissionId(amcReceiverMissionId: String) =
                amcReceiverMissionId(JsonField.of(amcReceiverMissionId))

            /**
             * Sets [Builder.amcReceiverMissionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amcReceiverMissionId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun amcReceiverMissionId(amcReceiverMissionId: JsonField<String>) = apply {
                this.amcReceiverMissionId = amcReceiverMissionId
            }

            /**
             * Optional receiver identifier from external systems. This field has no meaning within
             * UDL and is provided as a convenience for systems that require tracking of an internal
             * system generated ID.
             */
            fun externalReceiverId(externalReceiverId: String) =
                externalReceiverId(JsonField.of(externalReceiverId))

            /**
             * Sets [Builder.externalReceiverId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalReceiverId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalReceiverId(externalReceiverId: JsonField<String>) = apply {
                this.externalReceiverId = externalReceiverId
            }

            /**
             * Total weight of the fuel transferred to this receiver during an air refueling event,
             * in pounds.
             */
            fun fuelOn(fuelOn: Double) = fuelOn(JsonField.of(fuelOn))

            /**
             * Sets [Builder.fuelOn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fuelOn] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fuelOn(fuelOn: JsonField<Double>) = apply { this.fuelOn = fuelOn }

            /** The UDL ID of the airfield this receiver is associated with for this event. */
            fun idReceiverAirfield(idReceiverAirfield: String) =
                idReceiverAirfield(JsonField.of(idReceiverAirfield))

            /**
             * Sets [Builder.idReceiverAirfield] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idReceiverAirfield] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idReceiverAirfield(idReceiverAirfield: JsonField<String>) = apply {
                this.idReceiverAirfield = idReceiverAirfield
            }

            /** The UDL ID of the mission this receiver is associated with for this event. */
            fun idReceiverMission(idReceiverMission: String) =
                idReceiverMission(JsonField.of(idReceiverMission))

            /**
             * Sets [Builder.idReceiverMission] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idReceiverMission] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idReceiverMission(idReceiverMission: JsonField<String>) = apply {
                this.idReceiverMission = idReceiverMission
            }

            /**
             * The UDL ID of the aircraft sortie this receiver is associated with for this event.
             */
            fun idReceiverSortie(idReceiverSortie: String) =
                idReceiverSortie(JsonField.of(idReceiverSortie))

            /**
             * Sets [Builder.idReceiverSortie] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idReceiverSortie] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idReceiverSortie(idReceiverSortie: JsonField<String>) = apply {
                this.idReceiverSortie = idReceiverSortie
            }

            /**
             * Number of aircraft contained within one receiver coordination record for an air
             * refueling event.
             */
            fun numRecAircraft(numRecAircraft: Int) = numRecAircraft(JsonField.of(numRecAircraft))

            /**
             * Sets [Builder.numRecAircraft] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numRecAircraft] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numRecAircraft(numRecAircraft: JsonField<Int>) = apply {
                this.numRecAircraft = numRecAircraft
            }

            /** The package identifier for the receiver in an air refueling event. */
            fun packageId(packageId: String) = packageId(JsonField.of(packageId))

            /**
             * Sets [Builder.packageId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.packageId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun packageId(packageId: JsonField<String>) = apply { this.packageId = packageId }

            /** The call sign assigned to this receiver. */
            fun receiverCallSign(receiverCallSign: String) =
                receiverCallSign(JsonField.of(receiverCallSign))

            /**
             * Sets [Builder.receiverCallSign] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverCallSign] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverCallSign(receiverCallSign: JsonField<String>) = apply {
                this.receiverCallSign = receiverCallSign
            }

            /** Position of this receiver within a group of receivers in an air refueling event. */
            fun receiverCellPosition(receiverCellPosition: Int) =
                receiverCellPosition(JsonField.of(receiverCellPosition))

            /**
             * Sets [Builder.receiverCellPosition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverCellPosition] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverCellPosition(receiverCellPosition: JsonField<Int>) = apply {
                this.receiverCellPosition = receiverCellPosition
            }

            /** Coordination record identifier of this receiver. */
            fun receiverCoord(receiverCoord: String) = receiverCoord(JsonField.of(receiverCoord))

            /**
             * Sets [Builder.receiverCoord] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverCoord] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverCoord(receiverCoord: JsonField<String>) = apply {
                this.receiverCoord = receiverCoord
            }

            /**
             * Type of fuel delivery method used by the receiver during an air refueling event
             * (BOOM, DROGUE, BOTH).
             */
            fun receiverDeliveryMethod(receiverDeliveryMethod: String) =
                receiverDeliveryMethod(JsonField.of(receiverDeliveryMethod))

            /**
             * Sets [Builder.receiverDeliveryMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverDeliveryMethod] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun receiverDeliveryMethod(receiverDeliveryMethod: JsonField<String>) = apply {
                this.receiverDeliveryMethod = receiverDeliveryMethod
            }

            /** Location the receiver is deployed to for an air refueling event. */
            fun receiverDeployedIcao(receiverDeployedIcao: String) =
                receiverDeployedIcao(JsonField.of(receiverDeployedIcao))

            /**
             * Sets [Builder.receiverDeployedIcao] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverDeployedIcao] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun receiverDeployedIcao(receiverDeployedIcao: JsonField<String>) = apply {
                this.receiverDeployedIcao = receiverDeployedIcao
            }

            /** Name of the receiver exercise associated with an air refueling event. */
            fun receiverExercise(receiverExercise: String) =
                receiverExercise(JsonField.of(receiverExercise))

            /**
             * Sets [Builder.receiverExercise] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverExercise] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverExercise(receiverExercise: JsonField<String>) = apply {
                this.receiverExercise = receiverExercise
            }

            /** Type of fuel being transferred to the receiver in an air refueling event. */
            fun receiverFuelType(receiverFuelType: String) =
                receiverFuelType(JsonField.of(receiverFuelType))

            /**
             * Sets [Builder.receiverFuelType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverFuelType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverFuelType(receiverFuelType: JsonField<String>) = apply {
                this.receiverFuelType = receiverFuelType
            }

            /** Identifies the itinerary point of a mission that this receiver is linked to. */
            fun receiverLegNum(receiverLegNum: Int) = receiverLegNum(JsonField.of(receiverLegNum))

            /**
             * Sets [Builder.receiverLegNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverLegNum] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverLegNum(receiverLegNum: JsonField<Int>) = apply {
                this.receiverLegNum = receiverLegNum
            }

            /** The Model Design Series designation of this receiver. */
            fun receiverMds(receiverMds: String) = receiverMds(JsonField.of(receiverMds))

            /**
             * Sets [Builder.receiverMds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverMds] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverMds(receiverMds: JsonField<String>) = apply {
                this.receiverMds = receiverMds
            }

            /** The wing or unit that owns this receiver. */
            fun receiverOwner(receiverOwner: String) = receiverOwner(JsonField.of(receiverOwner))

            /**
             * Sets [Builder.receiverOwner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverOwner] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverOwner(receiverOwner: JsonField<String>) = apply {
                this.receiverOwner = receiverOwner
            }

            /** The name and/or number of the point of contact for this receiver. */
            fun receiverPoc(receiverPoc: String) = receiverPoc(JsonField.of(receiverPoc))

            /**
             * Sets [Builder.receiverPoc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverPoc] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverPoc(receiverPoc: JsonField<String>) = apply {
                this.receiverPoc = receiverPoc
            }

            /**
             * The major command level (MAJCOM) or foreign military sales (FMS) name of the
             * receiver's organization. The tanker flying hours used for an air refueling event are
             * logged against the receiver MAJCOM or foreign government being supported.
             */
            fun recOrg(recOrg: String) = recOrg(JsonField.of(recOrg))

            /**
             * Sets [Builder.recOrg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recOrg] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recOrg(recOrg: JsonField<String>) = apply { this.recOrg = recOrg }

            /** Indicates the unique number by Unit ID, which identifies an air refueling event. */
            fun sequenceNum(sequenceNum: String) = sequenceNum(JsonField.of(sequenceNum))

            /**
             * Sets [Builder.sequenceNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNum] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNum(sequenceNum: JsonField<String>) = apply {
                this.sequenceNum = sequenceNum
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
             * Returns an immutable instance of [Receiver].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Receiver =
                Receiver(
                    altReceiverMissionId,
                    amcReceiverMissionId,
                    externalReceiverId,
                    fuelOn,
                    idReceiverAirfield,
                    idReceiverMission,
                    idReceiverSortie,
                    numRecAircraft,
                    packageId,
                    receiverCallSign,
                    receiverCellPosition,
                    receiverCoord,
                    receiverDeliveryMethod,
                    receiverDeployedIcao,
                    receiverExercise,
                    receiverFuelType,
                    receiverLegNum,
                    receiverMds,
                    receiverOwner,
                    receiverPoc,
                    recOrg,
                    sequenceNum,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Receiver = apply {
            if (validated) {
                return@apply
            }

            altReceiverMissionId()
            amcReceiverMissionId()
            externalReceiverId()
            fuelOn()
            idReceiverAirfield()
            idReceiverMission()
            idReceiverSortie()
            numRecAircraft()
            packageId()
            receiverCallSign()
            receiverCellPosition()
            receiverCoord()
            receiverDeliveryMethod()
            receiverDeployedIcao()
            receiverExercise()
            receiverFuelType()
            receiverLegNum()
            receiverMds()
            receiverOwner()
            receiverPoc()
            recOrg()
            sequenceNum()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (altReceiverMissionId.asKnown().isPresent) 1 else 0) +
                (if (amcReceiverMissionId.asKnown().isPresent) 1 else 0) +
                (if (externalReceiverId.asKnown().isPresent) 1 else 0) +
                (if (fuelOn.asKnown().isPresent) 1 else 0) +
                (if (idReceiverAirfield.asKnown().isPresent) 1 else 0) +
                (if (idReceiverMission.asKnown().isPresent) 1 else 0) +
                (if (idReceiverSortie.asKnown().isPresent) 1 else 0) +
                (if (numRecAircraft.asKnown().isPresent) 1 else 0) +
                (if (packageId.asKnown().isPresent) 1 else 0) +
                (if (receiverCallSign.asKnown().isPresent) 1 else 0) +
                (if (receiverCellPosition.asKnown().isPresent) 1 else 0) +
                (if (receiverCoord.asKnown().isPresent) 1 else 0) +
                (if (receiverDeliveryMethod.asKnown().isPresent) 1 else 0) +
                (if (receiverDeployedIcao.asKnown().isPresent) 1 else 0) +
                (if (receiverExercise.asKnown().isPresent) 1 else 0) +
                (if (receiverFuelType.asKnown().isPresent) 1 else 0) +
                (if (receiverLegNum.asKnown().isPresent) 1 else 0) +
                (if (receiverMds.asKnown().isPresent) 1 else 0) +
                (if (receiverOwner.asKnown().isPresent) 1 else 0) +
                (if (receiverPoc.asKnown().isPresent) 1 else 0) +
                (if (recOrg.asKnown().isPresent) 1 else 0) +
                (if (sequenceNum.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Receiver &&
                altReceiverMissionId == other.altReceiverMissionId &&
                amcReceiverMissionId == other.amcReceiverMissionId &&
                externalReceiverId == other.externalReceiverId &&
                fuelOn == other.fuelOn &&
                idReceiverAirfield == other.idReceiverAirfield &&
                idReceiverMission == other.idReceiverMission &&
                idReceiverSortie == other.idReceiverSortie &&
                numRecAircraft == other.numRecAircraft &&
                packageId == other.packageId &&
                receiverCallSign == other.receiverCallSign &&
                receiverCellPosition == other.receiverCellPosition &&
                receiverCoord == other.receiverCoord &&
                receiverDeliveryMethod == other.receiverDeliveryMethod &&
                receiverDeployedIcao == other.receiverDeployedIcao &&
                receiverExercise == other.receiverExercise &&
                receiverFuelType == other.receiverFuelType &&
                receiverLegNum == other.receiverLegNum &&
                receiverMds == other.receiverMds &&
                receiverOwner == other.receiverOwner &&
                receiverPoc == other.receiverPoc &&
                recOrg == other.recOrg &&
                sequenceNum == other.sequenceNum &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                altReceiverMissionId,
                amcReceiverMissionId,
                externalReceiverId,
                fuelOn,
                idReceiverAirfield,
                idReceiverMission,
                idReceiverSortie,
                numRecAircraft,
                packageId,
                receiverCallSign,
                receiverCellPosition,
                receiverCoord,
                receiverDeliveryMethod,
                receiverDeployedIcao,
                receiverExercise,
                receiverFuelType,
                receiverLegNum,
                receiverMds,
                receiverOwner,
                receiverPoc,
                recOrg,
                sequenceNum,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Receiver{altReceiverMissionId=$altReceiverMissionId, amcReceiverMissionId=$amcReceiverMissionId, externalReceiverId=$externalReceiverId, fuelOn=$fuelOn, idReceiverAirfield=$idReceiverAirfield, idReceiverMission=$idReceiverMission, idReceiverSortie=$idReceiverSortie, numRecAircraft=$numRecAircraft, packageId=$packageId, receiverCallSign=$receiverCallSign, receiverCellPosition=$receiverCellPosition, receiverCoord=$receiverCoord, receiverDeliveryMethod=$receiverDeliveryMethod, receiverDeployedIcao=$receiverDeployedIcao, receiverExercise=$receiverExercise, receiverFuelType=$receiverFuelType, receiverLegNum=$receiverLegNum, receiverMds=$receiverMds, receiverOwner=$receiverOwner, receiverPoc=$receiverPoc, recOrg=$recOrg, sequenceNum=$sequenceNum, additionalProperties=$additionalProperties}"
    }

    /** Collection of remarks associated with this Air Event. */
    class Remark
    private constructor(
        private val date: JsonField<OffsetDateTime>,
        private val externalRemarkId: JsonField<String>,
        private val text: JsonField<String>,
        private val user: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("date")
            @ExcludeMissing
            date: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("externalRemarkId")
            @ExcludeMissing
            externalRemarkId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        ) : this(date, externalRemarkId, text, user, mutableMapOf())

        /**
         * Date the remark was published, in ISO 8601 UTC format, with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun date(): Optional<OffsetDateTime> = date.getOptional("date")

        /**
         * Optional remark ID from external systems. This field has no meaning within UDL and is
         * provided as a convenience for systems that require tracking of an internal system
         * generated ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun externalRemarkId(): Optional<String> = externalRemarkId.getOptional("externalRemarkId")

        /**
         * Text of the remark.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * User who published the remark.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun user(): Optional<String> = user.getOptional("user")

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

        /**
         * Returns the raw JSON value of [externalRemarkId].
         *
         * Unlike [externalRemarkId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("externalRemarkId")
        @ExcludeMissing
        fun _externalRemarkId(): JsonField<String> = externalRemarkId

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [user].
         *
         * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

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

            /** Returns a mutable builder for constructing an instance of [Remark]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Remark]. */
        class Builder internal constructor() {

            private var date: JsonField<OffsetDateTime> = JsonMissing.of()
            private var externalRemarkId: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var user: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(remark: Remark) = apply {
                date = remark.date
                externalRemarkId = remark.externalRemarkId
                text = remark.text
                user = remark.user
                additionalProperties = remark.additionalProperties.toMutableMap()
            }

            /**
             * Date the remark was published, in ISO 8601 UTC format, with millisecond precision.
             */
            fun date(date: OffsetDateTime) = date(JsonField.of(date))

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

            /**
             * Optional remark ID from external systems. This field has no meaning within UDL and is
             * provided as a convenience for systems that require tracking of an internal system
             * generated ID.
             */
            fun externalRemarkId(externalRemarkId: String) =
                externalRemarkId(JsonField.of(externalRemarkId))

            /**
             * Sets [Builder.externalRemarkId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalRemarkId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalRemarkId(externalRemarkId: JsonField<String>) = apply {
                this.externalRemarkId = externalRemarkId
            }

            /** Text of the remark. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** User who published the remark. */
            fun user(user: String) = user(JsonField.of(user))

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun user(user: JsonField<String>) = apply { this.user = user }

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
             * Returns an immutable instance of [Remark].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Remark =
                Remark(date, externalRemarkId, text, user, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Remark = apply {
            if (validated) {
                return@apply
            }

            date()
            externalRemarkId()
            text()
            user()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (date.asKnown().isPresent) 1 else 0) +
                (if (externalRemarkId.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (user.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Remark &&
                date == other.date &&
                externalRemarkId == other.externalRemarkId &&
                text == other.text &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(date, externalRemarkId, text, user, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Remark{date=$date, externalRemarkId=$externalRemarkId, text=$text, user=$user, additionalProperties=$additionalProperties}"
    }

    /** Collection of tanker aircraft associated with this Air Event. */
    class Tanker
    private constructor(
        private val altTankerMissionId: JsonField<String>,
        private val amcTankerMissionId: JsonField<String>,
        private val dualRole: JsonField<Boolean>,
        private val externalTankerId: JsonField<String>,
        private val fuelOff: JsonField<Double>,
        private val idTankerAirfield: JsonField<String>,
        private val idTankerMission: JsonField<String>,
        private val idTankerSortie: JsonField<String>,
        private val tankerCallSign: JsonField<String>,
        private val tankerCellPosition: JsonField<Int>,
        private val tankerCoord: JsonField<String>,
        private val tankerDeliveryMethod: JsonField<String>,
        private val tankerDeployedIcao: JsonField<String>,
        private val tankerFuelType: JsonField<String>,
        private val tankerLegNum: JsonField<Int>,
        private val tankerMds: JsonField<String>,
        private val tankerOwner: JsonField<String>,
        private val tankerPoc: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("altTankerMissionId")
            @ExcludeMissing
            altTankerMissionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amcTankerMissionId")
            @ExcludeMissing
            amcTankerMissionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dualRole")
            @ExcludeMissing
            dualRole: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("externalTankerId")
            @ExcludeMissing
            externalTankerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fuelOff") @ExcludeMissing fuelOff: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("idTankerAirfield")
            @ExcludeMissing
            idTankerAirfield: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idTankerMission")
            @ExcludeMissing
            idTankerMission: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idTankerSortie")
            @ExcludeMissing
            idTankerSortie: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tankerCallSign")
            @ExcludeMissing
            tankerCallSign: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tankerCellPosition")
            @ExcludeMissing
            tankerCellPosition: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("tankerCoord")
            @ExcludeMissing
            tankerCoord: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tankerDeliveryMethod")
            @ExcludeMissing
            tankerDeliveryMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tankerDeployedICAO")
            @ExcludeMissing
            tankerDeployedIcao: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tankerFuelType")
            @ExcludeMissing
            tankerFuelType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tankerLegNum")
            @ExcludeMissing
            tankerLegNum: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("tankerMDS")
            @ExcludeMissing
            tankerMds: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tankerOwner")
            @ExcludeMissing
            tankerOwner: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tankerPOC")
            @ExcludeMissing
            tankerPoc: JsonField<String> = JsonMissing.of(),
        ) : this(
            altTankerMissionId,
            amcTankerMissionId,
            dualRole,
            externalTankerId,
            fuelOff,
            idTankerAirfield,
            idTankerMission,
            idTankerSortie,
            tankerCallSign,
            tankerCellPosition,
            tankerCoord,
            tankerDeliveryMethod,
            tankerDeployedIcao,
            tankerFuelType,
            tankerLegNum,
            tankerMds,
            tankerOwner,
            tankerPoc,
            mutableMapOf(),
        )

        /**
         * Alternate mission identifier of this tanker provided by source.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun altTankerMissionId(): Optional<String> =
            altTankerMissionId.getOptional("altTankerMissionId")

        /**
         * The Air Mobility Command (AMC) mission identifier of this tanker.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun amcTankerMissionId(): Optional<String> =
            amcTankerMissionId.getOptional("amcTankerMissionId")

        /**
         * Flag indicating that this tanker is flying a dual role mission in an air refueling event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dualRole(): Optional<Boolean> = dualRole.getOptional("dualRole")

        /**
         * Optional tanker identifier from external systems. This field has no meaning within UDL
         * and is provided as a convenience for systems that require tracking of an internal system
         * generated ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun externalTankerId(): Optional<String> = externalTankerId.getOptional("externalTankerId")

        /**
         * Total weight of the fuel transferred from this tanker during an air refueling event, in
         * pounds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fuelOff(): Optional<Double> = fuelOff.getOptional("fuelOff")

        /**
         * The UDL ID of the airfield this tanker is associated with for this event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idTankerAirfield(): Optional<String> = idTankerAirfield.getOptional("idTankerAirfield")

        /**
         * The UDL ID of the mission this tanker is associated with for this event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idTankerMission(): Optional<String> = idTankerMission.getOptional("idTankerMission")

        /**
         * The UDL ID of the aircraft sortie this tanker is associated with for this event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idTankerSortie(): Optional<String> = idTankerSortie.getOptional("idTankerSortie")

        /**
         * The call sign assigned to this tanker.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tankerCallSign(): Optional<String> = tankerCallSign.getOptional("tankerCallSign")

        /**
         * Position of this tanker within a group of tankers in an air refueling event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tankerCellPosition(): Optional<Int> =
            tankerCellPosition.getOptional("tankerCellPosition")

        /**
         * Coordination record identifier of this tanker.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tankerCoord(): Optional<String> = tankerCoord.getOptional("tankerCoord")

        /**
         * Type of fuel delivery method used by the tanker during an air refueling event (BOOM,
         * DROGUE, BOTH).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tankerDeliveryMethod(): Optional<String> =
            tankerDeliveryMethod.getOptional("tankerDeliveryMethod")

        /**
         * Location the tanker has been deployed to in preparation for an air refueling event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tankerDeployedIcao(): Optional<String> =
            tankerDeployedIcao.getOptional("tankerDeployedICAO")

        /**
         * Type of fuel being transferred from the tanker in an air refueling event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tankerFuelType(): Optional<String> = tankerFuelType.getOptional("tankerFuelType")

        /**
         * Identifies the itinerary point of a mission that this tanker is linked to.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tankerLegNum(): Optional<Int> = tankerLegNum.getOptional("tankerLegNum")

        /**
         * The Model Design Series designation of this tanker.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tankerMds(): Optional<String> = tankerMds.getOptional("tankerMDS")

        /**
         * The wing or unit that owns this tanker.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tankerOwner(): Optional<String> = tankerOwner.getOptional("tankerOwner")

        /**
         * The name and/or number of the point of contact for this tanker.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tankerPoc(): Optional<String> = tankerPoc.getOptional("tankerPOC")

        /**
         * Returns the raw JSON value of [altTankerMissionId].
         *
         * Unlike [altTankerMissionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("altTankerMissionId")
        @ExcludeMissing
        fun _altTankerMissionId(): JsonField<String> = altTankerMissionId

        /**
         * Returns the raw JSON value of [amcTankerMissionId].
         *
         * Unlike [amcTankerMissionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("amcTankerMissionId")
        @ExcludeMissing
        fun _amcTankerMissionId(): JsonField<String> = amcTankerMissionId

        /**
         * Returns the raw JSON value of [dualRole].
         *
         * Unlike [dualRole], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dualRole") @ExcludeMissing fun _dualRole(): JsonField<Boolean> = dualRole

        /**
         * Returns the raw JSON value of [externalTankerId].
         *
         * Unlike [externalTankerId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("externalTankerId")
        @ExcludeMissing
        fun _externalTankerId(): JsonField<String> = externalTankerId

        /**
         * Returns the raw JSON value of [fuelOff].
         *
         * Unlike [fuelOff], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fuelOff") @ExcludeMissing fun _fuelOff(): JsonField<Double> = fuelOff

        /**
         * Returns the raw JSON value of [idTankerAirfield].
         *
         * Unlike [idTankerAirfield], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idTankerAirfield")
        @ExcludeMissing
        fun _idTankerAirfield(): JsonField<String> = idTankerAirfield

        /**
         * Returns the raw JSON value of [idTankerMission].
         *
         * Unlike [idTankerMission], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idTankerMission")
        @ExcludeMissing
        fun _idTankerMission(): JsonField<String> = idTankerMission

        /**
         * Returns the raw JSON value of [idTankerSortie].
         *
         * Unlike [idTankerSortie], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idTankerSortie")
        @ExcludeMissing
        fun _idTankerSortie(): JsonField<String> = idTankerSortie

        /**
         * Returns the raw JSON value of [tankerCallSign].
         *
         * Unlike [tankerCallSign], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tankerCallSign")
        @ExcludeMissing
        fun _tankerCallSign(): JsonField<String> = tankerCallSign

        /**
         * Returns the raw JSON value of [tankerCellPosition].
         *
         * Unlike [tankerCellPosition], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("tankerCellPosition")
        @ExcludeMissing
        fun _tankerCellPosition(): JsonField<Int> = tankerCellPosition

        /**
         * Returns the raw JSON value of [tankerCoord].
         *
         * Unlike [tankerCoord], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tankerCoord")
        @ExcludeMissing
        fun _tankerCoord(): JsonField<String> = tankerCoord

        /**
         * Returns the raw JSON value of [tankerDeliveryMethod].
         *
         * Unlike [tankerDeliveryMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("tankerDeliveryMethod")
        @ExcludeMissing
        fun _tankerDeliveryMethod(): JsonField<String> = tankerDeliveryMethod

        /**
         * Returns the raw JSON value of [tankerDeployedIcao].
         *
         * Unlike [tankerDeployedIcao], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("tankerDeployedICAO")
        @ExcludeMissing
        fun _tankerDeployedIcao(): JsonField<String> = tankerDeployedIcao

        /**
         * Returns the raw JSON value of [tankerFuelType].
         *
         * Unlike [tankerFuelType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tankerFuelType")
        @ExcludeMissing
        fun _tankerFuelType(): JsonField<String> = tankerFuelType

        /**
         * Returns the raw JSON value of [tankerLegNum].
         *
         * Unlike [tankerLegNum], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tankerLegNum")
        @ExcludeMissing
        fun _tankerLegNum(): JsonField<Int> = tankerLegNum

        /**
         * Returns the raw JSON value of [tankerMds].
         *
         * Unlike [tankerMds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tankerMDS") @ExcludeMissing fun _tankerMds(): JsonField<String> = tankerMds

        /**
         * Returns the raw JSON value of [tankerOwner].
         *
         * Unlike [tankerOwner], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tankerOwner")
        @ExcludeMissing
        fun _tankerOwner(): JsonField<String> = tankerOwner

        /**
         * Returns the raw JSON value of [tankerPoc].
         *
         * Unlike [tankerPoc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tankerPOC") @ExcludeMissing fun _tankerPoc(): JsonField<String> = tankerPoc

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

            /** Returns a mutable builder for constructing an instance of [Tanker]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Tanker]. */
        class Builder internal constructor() {

            private var altTankerMissionId: JsonField<String> = JsonMissing.of()
            private var amcTankerMissionId: JsonField<String> = JsonMissing.of()
            private var dualRole: JsonField<Boolean> = JsonMissing.of()
            private var externalTankerId: JsonField<String> = JsonMissing.of()
            private var fuelOff: JsonField<Double> = JsonMissing.of()
            private var idTankerAirfield: JsonField<String> = JsonMissing.of()
            private var idTankerMission: JsonField<String> = JsonMissing.of()
            private var idTankerSortie: JsonField<String> = JsonMissing.of()
            private var tankerCallSign: JsonField<String> = JsonMissing.of()
            private var tankerCellPosition: JsonField<Int> = JsonMissing.of()
            private var tankerCoord: JsonField<String> = JsonMissing.of()
            private var tankerDeliveryMethod: JsonField<String> = JsonMissing.of()
            private var tankerDeployedIcao: JsonField<String> = JsonMissing.of()
            private var tankerFuelType: JsonField<String> = JsonMissing.of()
            private var tankerLegNum: JsonField<Int> = JsonMissing.of()
            private var tankerMds: JsonField<String> = JsonMissing.of()
            private var tankerOwner: JsonField<String> = JsonMissing.of()
            private var tankerPoc: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tanker: Tanker) = apply {
                altTankerMissionId = tanker.altTankerMissionId
                amcTankerMissionId = tanker.amcTankerMissionId
                dualRole = tanker.dualRole
                externalTankerId = tanker.externalTankerId
                fuelOff = tanker.fuelOff
                idTankerAirfield = tanker.idTankerAirfield
                idTankerMission = tanker.idTankerMission
                idTankerSortie = tanker.idTankerSortie
                tankerCallSign = tanker.tankerCallSign
                tankerCellPosition = tanker.tankerCellPosition
                tankerCoord = tanker.tankerCoord
                tankerDeliveryMethod = tanker.tankerDeliveryMethod
                tankerDeployedIcao = tanker.tankerDeployedIcao
                tankerFuelType = tanker.tankerFuelType
                tankerLegNum = tanker.tankerLegNum
                tankerMds = tanker.tankerMds
                tankerOwner = tanker.tankerOwner
                tankerPoc = tanker.tankerPoc
                additionalProperties = tanker.additionalProperties.toMutableMap()
            }

            /** Alternate mission identifier of this tanker provided by source. */
            fun altTankerMissionId(altTankerMissionId: String) =
                altTankerMissionId(JsonField.of(altTankerMissionId))

            /**
             * Sets [Builder.altTankerMissionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altTankerMissionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altTankerMissionId(altTankerMissionId: JsonField<String>) = apply {
                this.altTankerMissionId = altTankerMissionId
            }

            /** The Air Mobility Command (AMC) mission identifier of this tanker. */
            fun amcTankerMissionId(amcTankerMissionId: String) =
                amcTankerMissionId(JsonField.of(amcTankerMissionId))

            /**
             * Sets [Builder.amcTankerMissionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amcTankerMissionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amcTankerMissionId(amcTankerMissionId: JsonField<String>) = apply {
                this.amcTankerMissionId = amcTankerMissionId
            }

            /**
             * Flag indicating that this tanker is flying a dual role mission in an air refueling
             * event.
             */
            fun dualRole(dualRole: Boolean) = dualRole(JsonField.of(dualRole))

            /**
             * Sets [Builder.dualRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dualRole] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dualRole(dualRole: JsonField<Boolean>) = apply { this.dualRole = dualRole }

            /**
             * Optional tanker identifier from external systems. This field has no meaning within
             * UDL and is provided as a convenience for systems that require tracking of an internal
             * system generated ID.
             */
            fun externalTankerId(externalTankerId: String) =
                externalTankerId(JsonField.of(externalTankerId))

            /**
             * Sets [Builder.externalTankerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalTankerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalTankerId(externalTankerId: JsonField<String>) = apply {
                this.externalTankerId = externalTankerId
            }

            /**
             * Total weight of the fuel transferred from this tanker during an air refueling event,
             * in pounds.
             */
            fun fuelOff(fuelOff: Double) = fuelOff(JsonField.of(fuelOff))

            /**
             * Sets [Builder.fuelOff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fuelOff] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fuelOff(fuelOff: JsonField<Double>) = apply { this.fuelOff = fuelOff }

            /** The UDL ID of the airfield this tanker is associated with for this event. */
            fun idTankerAirfield(idTankerAirfield: String) =
                idTankerAirfield(JsonField.of(idTankerAirfield))

            /**
             * Sets [Builder.idTankerAirfield] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idTankerAirfield] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idTankerAirfield(idTankerAirfield: JsonField<String>) = apply {
                this.idTankerAirfield = idTankerAirfield
            }

            /** The UDL ID of the mission this tanker is associated with for this event. */
            fun idTankerMission(idTankerMission: String) =
                idTankerMission(JsonField.of(idTankerMission))

            /**
             * Sets [Builder.idTankerMission] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idTankerMission] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idTankerMission(idTankerMission: JsonField<String>) = apply {
                this.idTankerMission = idTankerMission
            }

            /** The UDL ID of the aircraft sortie this tanker is associated with for this event. */
            fun idTankerSortie(idTankerSortie: String) =
                idTankerSortie(JsonField.of(idTankerSortie))

            /**
             * Sets [Builder.idTankerSortie] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idTankerSortie] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idTankerSortie(idTankerSortie: JsonField<String>) = apply {
                this.idTankerSortie = idTankerSortie
            }

            /** The call sign assigned to this tanker. */
            fun tankerCallSign(tankerCallSign: String) =
                tankerCallSign(JsonField.of(tankerCallSign))

            /**
             * Sets [Builder.tankerCallSign] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tankerCallSign] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tankerCallSign(tankerCallSign: JsonField<String>) = apply {
                this.tankerCallSign = tankerCallSign
            }

            /** Position of this tanker within a group of tankers in an air refueling event. */
            fun tankerCellPosition(tankerCellPosition: Int) =
                tankerCellPosition(JsonField.of(tankerCellPosition))

            /**
             * Sets [Builder.tankerCellPosition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tankerCellPosition] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tankerCellPosition(tankerCellPosition: JsonField<Int>) = apply {
                this.tankerCellPosition = tankerCellPosition
            }

            /** Coordination record identifier of this tanker. */
            fun tankerCoord(tankerCoord: String) = tankerCoord(JsonField.of(tankerCoord))

            /**
             * Sets [Builder.tankerCoord] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tankerCoord] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tankerCoord(tankerCoord: JsonField<String>) = apply {
                this.tankerCoord = tankerCoord
            }

            /**
             * Type of fuel delivery method used by the tanker during an air refueling event (BOOM,
             * DROGUE, BOTH).
             */
            fun tankerDeliveryMethod(tankerDeliveryMethod: String) =
                tankerDeliveryMethod(JsonField.of(tankerDeliveryMethod))

            /**
             * Sets [Builder.tankerDeliveryMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tankerDeliveryMethod] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun tankerDeliveryMethod(tankerDeliveryMethod: JsonField<String>) = apply {
                this.tankerDeliveryMethod = tankerDeliveryMethod
            }

            /**
             * Location the tanker has been deployed to in preparation for an air refueling event.
             */
            fun tankerDeployedIcao(tankerDeployedIcao: String) =
                tankerDeployedIcao(JsonField.of(tankerDeployedIcao))

            /**
             * Sets [Builder.tankerDeployedIcao] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tankerDeployedIcao] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tankerDeployedIcao(tankerDeployedIcao: JsonField<String>) = apply {
                this.tankerDeployedIcao = tankerDeployedIcao
            }

            /** Type of fuel being transferred from the tanker in an air refueling event. */
            fun tankerFuelType(tankerFuelType: String) =
                tankerFuelType(JsonField.of(tankerFuelType))

            /**
             * Sets [Builder.tankerFuelType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tankerFuelType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tankerFuelType(tankerFuelType: JsonField<String>) = apply {
                this.tankerFuelType = tankerFuelType
            }

            /** Identifies the itinerary point of a mission that this tanker is linked to. */
            fun tankerLegNum(tankerLegNum: Int) = tankerLegNum(JsonField.of(tankerLegNum))

            /**
             * Sets [Builder.tankerLegNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tankerLegNum] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tankerLegNum(tankerLegNum: JsonField<Int>) = apply {
                this.tankerLegNum = tankerLegNum
            }

            /** The Model Design Series designation of this tanker. */
            fun tankerMds(tankerMds: String) = tankerMds(JsonField.of(tankerMds))

            /**
             * Sets [Builder.tankerMds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tankerMds] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tankerMds(tankerMds: JsonField<String>) = apply { this.tankerMds = tankerMds }

            /** The wing or unit that owns this tanker. */
            fun tankerOwner(tankerOwner: String) = tankerOwner(JsonField.of(tankerOwner))

            /**
             * Sets [Builder.tankerOwner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tankerOwner] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tankerOwner(tankerOwner: JsonField<String>) = apply {
                this.tankerOwner = tankerOwner
            }

            /** The name and/or number of the point of contact for this tanker. */
            fun tankerPoc(tankerPoc: String) = tankerPoc(JsonField.of(tankerPoc))

            /**
             * Sets [Builder.tankerPoc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tankerPoc] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tankerPoc(tankerPoc: JsonField<String>) = apply { this.tankerPoc = tankerPoc }

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
             * Returns an immutable instance of [Tanker].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tanker =
                Tanker(
                    altTankerMissionId,
                    amcTankerMissionId,
                    dualRole,
                    externalTankerId,
                    fuelOff,
                    idTankerAirfield,
                    idTankerMission,
                    idTankerSortie,
                    tankerCallSign,
                    tankerCellPosition,
                    tankerCoord,
                    tankerDeliveryMethod,
                    tankerDeployedIcao,
                    tankerFuelType,
                    tankerLegNum,
                    tankerMds,
                    tankerOwner,
                    tankerPoc,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Tanker = apply {
            if (validated) {
                return@apply
            }

            altTankerMissionId()
            amcTankerMissionId()
            dualRole()
            externalTankerId()
            fuelOff()
            idTankerAirfield()
            idTankerMission()
            idTankerSortie()
            tankerCallSign()
            tankerCellPosition()
            tankerCoord()
            tankerDeliveryMethod()
            tankerDeployedIcao()
            tankerFuelType()
            tankerLegNum()
            tankerMds()
            tankerOwner()
            tankerPoc()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (altTankerMissionId.asKnown().isPresent) 1 else 0) +
                (if (amcTankerMissionId.asKnown().isPresent) 1 else 0) +
                (if (dualRole.asKnown().isPresent) 1 else 0) +
                (if (externalTankerId.asKnown().isPresent) 1 else 0) +
                (if (fuelOff.asKnown().isPresent) 1 else 0) +
                (if (idTankerAirfield.asKnown().isPresent) 1 else 0) +
                (if (idTankerMission.asKnown().isPresent) 1 else 0) +
                (if (idTankerSortie.asKnown().isPresent) 1 else 0) +
                (if (tankerCallSign.asKnown().isPresent) 1 else 0) +
                (if (tankerCellPosition.asKnown().isPresent) 1 else 0) +
                (if (tankerCoord.asKnown().isPresent) 1 else 0) +
                (if (tankerDeliveryMethod.asKnown().isPresent) 1 else 0) +
                (if (tankerDeployedIcao.asKnown().isPresent) 1 else 0) +
                (if (tankerFuelType.asKnown().isPresent) 1 else 0) +
                (if (tankerLegNum.asKnown().isPresent) 1 else 0) +
                (if (tankerMds.asKnown().isPresent) 1 else 0) +
                (if (tankerOwner.asKnown().isPresent) 1 else 0) +
                (if (tankerPoc.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tanker &&
                altTankerMissionId == other.altTankerMissionId &&
                amcTankerMissionId == other.amcTankerMissionId &&
                dualRole == other.dualRole &&
                externalTankerId == other.externalTankerId &&
                fuelOff == other.fuelOff &&
                idTankerAirfield == other.idTankerAirfield &&
                idTankerMission == other.idTankerMission &&
                idTankerSortie == other.idTankerSortie &&
                tankerCallSign == other.tankerCallSign &&
                tankerCellPosition == other.tankerCellPosition &&
                tankerCoord == other.tankerCoord &&
                tankerDeliveryMethod == other.tankerDeliveryMethod &&
                tankerDeployedIcao == other.tankerDeployedIcao &&
                tankerFuelType == other.tankerFuelType &&
                tankerLegNum == other.tankerLegNum &&
                tankerMds == other.tankerMds &&
                tankerOwner == other.tankerOwner &&
                tankerPoc == other.tankerPoc &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                altTankerMissionId,
                amcTankerMissionId,
                dualRole,
                externalTankerId,
                fuelOff,
                idTankerAirfield,
                idTankerMission,
                idTankerSortie,
                tankerCallSign,
                tankerCellPosition,
                tankerCoord,
                tankerDeliveryMethod,
                tankerDeployedIcao,
                tankerFuelType,
                tankerLegNum,
                tankerMds,
                tankerOwner,
                tankerPoc,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tanker{altTankerMissionId=$altTankerMissionId, amcTankerMissionId=$amcTankerMissionId, dualRole=$dualRole, externalTankerId=$externalTankerId, fuelOff=$fuelOff, idTankerAirfield=$idTankerAirfield, idTankerMission=$idTankerMission, idTankerSortie=$idTankerSortie, tankerCallSign=$tankerCallSign, tankerCellPosition=$tankerCellPosition, tankerCoord=$tankerCoord, tankerDeliveryMethod=$tankerDeliveryMethod, tankerDeployedIcao=$tankerDeployedIcao, tankerFuelType=$tankerFuelType, tankerLegNum=$tankerLegNum, tankerMds=$tankerMds, tankerOwner=$tankerOwner, tankerPoc=$tankerPoc, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AirEventTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            type == other.type &&
            id == other.id &&
            actualArrTime == other.actualArrTime &&
            actualDepTime == other.actualDepTime &&
            arct == other.arct &&
            arEventType == other.arEventType &&
            arrPurpose == other.arrPurpose &&
            arTrackId == other.arTrackId &&
            arTrackName == other.arTrackName &&
            baseAlt == other.baseAlt &&
            cancelled == other.cancelled &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            depPurpose == other.depPurpose &&
            estArrTime == other.estArrTime &&
            estDepTime == other.estDepTime &&
            externalAirEventId == other.externalAirEventId &&
            externalArTrackId == other.externalArTrackId &&
            idMission == other.idMission &&
            idSortie == other.idSortie &&
            legNum == other.legNum &&
            location == other.location &&
            numTankers == other.numTankers &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            plannedArrTime == other.plannedArrTime &&
            plannedDepTime == other.plannedDepTime &&
            priority == other.priority &&
            receivers == other.receivers &&
            remarks == other.remarks &&
            revTrack == other.revTrack &&
            rzct == other.rzct &&
            rzPoint == other.rzPoint &&
            rzType == other.rzType &&
            shortTrack == other.shortTrack &&
            sourceDl == other.sourceDl &&
            statusCode == other.statusCode &&
            tankers == other.tankers &&
            trackTime == other.trackTime &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            source,
            type,
            id,
            actualArrTime,
            actualDepTime,
            arct,
            arEventType,
            arrPurpose,
            arTrackId,
            arTrackName,
            baseAlt,
            cancelled,
            createdAt,
            createdBy,
            depPurpose,
            estArrTime,
            estDepTime,
            externalAirEventId,
            externalArTrackId,
            idMission,
            idSortie,
            legNum,
            location,
            numTankers,
            origin,
            origNetwork,
            plannedArrTime,
            plannedDepTime,
            priority,
            receivers,
            remarks,
            revTrack,
            rzct,
            rzPoint,
            rzType,
            shortTrack,
            sourceDl,
            statusCode,
            tankers,
            trackTime,
            updatedAt,
            updatedBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AirEventTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, type=$type, id=$id, actualArrTime=$actualArrTime, actualDepTime=$actualDepTime, arct=$arct, arEventType=$arEventType, arrPurpose=$arrPurpose, arTrackId=$arTrackId, arTrackName=$arTrackName, baseAlt=$baseAlt, cancelled=$cancelled, createdAt=$createdAt, createdBy=$createdBy, depPurpose=$depPurpose, estArrTime=$estArrTime, estDepTime=$estDepTime, externalAirEventId=$externalAirEventId, externalArTrackId=$externalArTrackId, idMission=$idMission, idSortie=$idSortie, legNum=$legNum, location=$location, numTankers=$numTankers, origin=$origin, origNetwork=$origNetwork, plannedArrTime=$plannedArrTime, plannedDepTime=$plannedDepTime, priority=$priority, receivers=$receivers, remarks=$remarks, revTrack=$revTrack, rzct=$rzct, rzPoint=$rzPoint, rzType=$rzType, shortTrack=$shortTrack, sourceDl=$sourceDl, statusCode=$statusCode, tankers=$tankers, trackTime=$trackTime, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

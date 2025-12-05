// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldslotconsumptions

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
 * Airfield slot use data. Contains the dynamic data associated with the status and use of specific
 * airfield slots.
 */
class AirfieldslotconsumptionAbridged
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idAirfieldSlot: JsonField<String>,
    private val numAircraft: JsonField<Int>,
    private val source: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val altArrSortieId: JsonField<String>,
    private val altDepSortieId: JsonField<String>,
    private val appComment: JsonField<String>,
    private val appInitials: JsonField<String>,
    private val appOrg: JsonField<String>,
    private val callSigns: JsonField<List<String>>,
    private val consumer: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val endTime: JsonField<OffsetDateTime>,
    private val idArrSortie: JsonField<String>,
    private val idDepSortie: JsonField<String>,
    private val missionId: JsonField<String>,
    private val occAircraftMds: JsonField<String>,
    private val occStartTime: JsonField<OffsetDateTime>,
    private val occTailNumber: JsonField<String>,
    private val occupied: JsonField<Boolean>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val reqComment: JsonField<String>,
    private val reqInitials: JsonField<String>,
    private val reqOrg: JsonField<String>,
    private val resAircraftMds: JsonField<String>,
    private val resMissionId: JsonField<String>,
    private val resReason: JsonField<String>,
    private val resTailNumber: JsonField<String>,
    private val resType: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val status: JsonField<Status>,
    private val targetTime: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idAirfieldSlot")
        @ExcludeMissing
        idAirfieldSlot: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numAircraft") @ExcludeMissing numAircraft: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altArrSortieId")
        @ExcludeMissing
        altArrSortieId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altDepSortieId")
        @ExcludeMissing
        altDepSortieId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("appComment")
        @ExcludeMissing
        appComment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("appInitials")
        @ExcludeMissing
        appInitials: JsonField<String> = JsonMissing.of(),
        @JsonProperty("appOrg") @ExcludeMissing appOrg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("callSigns")
        @ExcludeMissing
        callSigns: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("consumer") @ExcludeMissing consumer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endTime")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("idArrSortie")
        @ExcludeMissing
        idArrSortie: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idDepSortie")
        @ExcludeMissing
        idDepSortie: JsonField<String> = JsonMissing.of(),
        @JsonProperty("missionId") @ExcludeMissing missionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("occAircraftMDS")
        @ExcludeMissing
        occAircraftMds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("occStartTime")
        @ExcludeMissing
        occStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("occTailNumber")
        @ExcludeMissing
        occTailNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("occupied") @ExcludeMissing occupied: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reqComment")
        @ExcludeMissing
        reqComment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reqInitials")
        @ExcludeMissing
        reqInitials: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reqOrg") @ExcludeMissing reqOrg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resAircraftMDS")
        @ExcludeMissing
        resAircraftMds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resMissionId")
        @ExcludeMissing
        resMissionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resReason") @ExcludeMissing resReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resTailNumber")
        @ExcludeMissing
        resTailNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resType") @ExcludeMissing resType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("targetTime")
        @ExcludeMissing
        targetTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idAirfieldSlot,
        numAircraft,
        source,
        startTime,
        id,
        altArrSortieId,
        altDepSortieId,
        appComment,
        appInitials,
        appOrg,
        callSigns,
        consumer,
        createdAt,
        createdBy,
        endTime,
        idArrSortie,
        idDepSortie,
        missionId,
        occAircraftMds,
        occStartTime,
        occTailNumber,
        occupied,
        origin,
        origNetwork,
        reqComment,
        reqInitials,
        reqOrg,
        resAircraftMds,
        resMissionId,
        resReason,
        resTailNumber,
        resType,
        sourceDl,
        status,
        targetTime,
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
     * Unique identifier of the airfield slot for which this slot consumption record is referencing.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idAirfieldSlot(): String = idAirfieldSlot.getRequired("idAirfieldSlot")

    /**
     * Number of aircraft using this slot for this time.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numAircraft(): Int = numAircraft.getRequired("numAircraft")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The start of the slot window, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Alternate identifier of the sortie arriving at the slot start time provided by the source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altArrSortieId(): Optional<String> = altArrSortieId.getOptional("altArrSortieId")

    /**
     * Alternate identifier of the sortie departing at the slot end time provided by the source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altDepSortieId(): Optional<String> = altDepSortieId.getOptional("altDepSortieId")

    /**
     * Comments from the approver.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun appComment(): Optional<String> = appComment.getOptional("appComment")

    /**
     * Initials of the person approving the use of this slot. Use SYSTEM if auto-approved without
     * human involvement.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun appInitials(): Optional<String> = appInitials.getOptional("appInitials")

    /**
     * Short name of the organization approving the use of this slot.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun appOrg(): Optional<String> = appOrg.getOptional("appOrg")

    /**
     * Array of call signs of the aircraft using this slot.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun callSigns(): Optional<List<String>> = callSigns.getOptional("callSigns")

    /**
     * Identifying name of the aircraft using this slot. Names are often Prior Permission Required
     * (PPR) numbers or other similar human-readable identifiers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun consumer(): Optional<String> = consumer.getOptional("consumer")

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
     * The end of the slot window, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("endTime")

    /**
     * Unique identifier of the sortie arriving at the slot start time.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idArrSortie(): Optional<String> = idArrSortie.getOptional("idArrSortie")

    /**
     * Unique identifier of the sortie departing at the slot end time.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idDepSortie(): Optional<String> = idDepSortie.getOptional("idDepSortie")

    /**
     * Mission identifier using this slot according to Mobility Air Forces (MAF) Encode/Decode
     * procedures.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun missionId(): Optional<String> = missionId.getOptional("missionId")

    /**
     * The aircraft Model Design Series designation of the aircraft occupying this slot.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun occAircraftMds(): Optional<String> = occAircraftMds.getOptional("occAircraftMDS")

    /**
     * Time the aircraft began occupying this slot, in ISO 8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun occStartTime(): Optional<OffsetDateTime> = occStartTime.getOptional("occStartTime")

    /**
     * The tail number of the aircraft occupying this slot.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun occTailNumber(): Optional<String> = occTailNumber.getOptional("occTailNumber")

    /**
     * Flag indicating if the slot is occupied.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun occupied(): Optional<Boolean> = occupied.getOptional("occupied")

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
     * Comments from the requester.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reqComment(): Optional<String> = reqComment.getOptional("reqComment")

    /**
     * Initials of the person requesting the use of this slot. Use SYSTEM if this request is
     * auto-generated by an auto-planning system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reqInitials(): Optional<String> = reqInitials.getOptional("reqInitials")

    /**
     * Short name of the organization requesting use of this slot.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reqOrg(): Optional<String> = reqOrg.getOptional("reqOrg")

    /**
     * The aircraft Model Design Series designation of the aircraft this slot is reserved for.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun resAircraftMds(): Optional<String> = resAircraftMds.getOptional("resAircraftMDS")

    /**
     * Mission identifier reserving this slot according to Mobility Air Forces (MAF) Encode/Decode
     * procedures.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun resMissionId(): Optional<String> = resMissionId.getOptional("resMissionId")

    /**
     * The reason the slot reservation was made.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun resReason(): Optional<String> = resReason.getOptional("resReason")

    /**
     * The tail number of the aircraft this slot is reserved for.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun resTailNumber(): Optional<String> = resTailNumber.getOptional("resTailNumber")

    /**
     * Indicates the type of reservation (e.g. M for Mission, A for Aircraft, O for Other).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun resType(): Optional<String> = resType.getOptional("resType")

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
     * Current status of this slot (REQUESTED / APPROVED / DENIED / BLOCKED / OTHER).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * The desired time for aircraft action such as landing, take off, parking, etc., in ISO 8601
     * UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun targetTime(): Optional<OffsetDateTime> = targetTime.getOptional("targetTime")

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
     * Returns the raw JSON value of [idAirfieldSlot].
     *
     * Unlike [idAirfieldSlot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idAirfieldSlot")
    @ExcludeMissing
    fun _idAirfieldSlot(): JsonField<String> = idAirfieldSlot

    /**
     * Returns the raw JSON value of [numAircraft].
     *
     * Unlike [numAircraft], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numAircraft") @ExcludeMissing fun _numAircraft(): JsonField<Int> = numAircraft

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startTime")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [altArrSortieId].
     *
     * Unlike [altArrSortieId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altArrSortieId")
    @ExcludeMissing
    fun _altArrSortieId(): JsonField<String> = altArrSortieId

    /**
     * Returns the raw JSON value of [altDepSortieId].
     *
     * Unlike [altDepSortieId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altDepSortieId")
    @ExcludeMissing
    fun _altDepSortieId(): JsonField<String> = altDepSortieId

    /**
     * Returns the raw JSON value of [appComment].
     *
     * Unlike [appComment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appComment") @ExcludeMissing fun _appComment(): JsonField<String> = appComment

    /**
     * Returns the raw JSON value of [appInitials].
     *
     * Unlike [appInitials], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appInitials") @ExcludeMissing fun _appInitials(): JsonField<String> = appInitials

    /**
     * Returns the raw JSON value of [appOrg].
     *
     * Unlike [appOrg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appOrg") @ExcludeMissing fun _appOrg(): JsonField<String> = appOrg

    /**
     * Returns the raw JSON value of [callSigns].
     *
     * Unlike [callSigns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callSigns") @ExcludeMissing fun _callSigns(): JsonField<List<String>> = callSigns

    /**
     * Returns the raw JSON value of [consumer].
     *
     * Unlike [consumer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("consumer") @ExcludeMissing fun _consumer(): JsonField<String> = consumer

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
    @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [idArrSortie].
     *
     * Unlike [idArrSortie], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idArrSortie") @ExcludeMissing fun _idArrSortie(): JsonField<String> = idArrSortie

    /**
     * Returns the raw JSON value of [idDepSortie].
     *
     * Unlike [idDepSortie], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idDepSortie") @ExcludeMissing fun _idDepSortie(): JsonField<String> = idDepSortie

    /**
     * Returns the raw JSON value of [missionId].
     *
     * Unlike [missionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("missionId") @ExcludeMissing fun _missionId(): JsonField<String> = missionId

    /**
     * Returns the raw JSON value of [occAircraftMds].
     *
     * Unlike [occAircraftMds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("occAircraftMDS")
    @ExcludeMissing
    fun _occAircraftMds(): JsonField<String> = occAircraftMds

    /**
     * Returns the raw JSON value of [occStartTime].
     *
     * Unlike [occStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("occStartTime")
    @ExcludeMissing
    fun _occStartTime(): JsonField<OffsetDateTime> = occStartTime

    /**
     * Returns the raw JSON value of [occTailNumber].
     *
     * Unlike [occTailNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("occTailNumber")
    @ExcludeMissing
    fun _occTailNumber(): JsonField<String> = occTailNumber

    /**
     * Returns the raw JSON value of [occupied].
     *
     * Unlike [occupied], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("occupied") @ExcludeMissing fun _occupied(): JsonField<Boolean> = occupied

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
     * Returns the raw JSON value of [reqComment].
     *
     * Unlike [reqComment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reqComment") @ExcludeMissing fun _reqComment(): JsonField<String> = reqComment

    /**
     * Returns the raw JSON value of [reqInitials].
     *
     * Unlike [reqInitials], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reqInitials") @ExcludeMissing fun _reqInitials(): JsonField<String> = reqInitials

    /**
     * Returns the raw JSON value of [reqOrg].
     *
     * Unlike [reqOrg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reqOrg") @ExcludeMissing fun _reqOrg(): JsonField<String> = reqOrg

    /**
     * Returns the raw JSON value of [resAircraftMds].
     *
     * Unlike [resAircraftMds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resAircraftMDS")
    @ExcludeMissing
    fun _resAircraftMds(): JsonField<String> = resAircraftMds

    /**
     * Returns the raw JSON value of [resMissionId].
     *
     * Unlike [resMissionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resMissionId")
    @ExcludeMissing
    fun _resMissionId(): JsonField<String> = resMissionId

    /**
     * Returns the raw JSON value of [resReason].
     *
     * Unlike [resReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resReason") @ExcludeMissing fun _resReason(): JsonField<String> = resReason

    /**
     * Returns the raw JSON value of [resTailNumber].
     *
     * Unlike [resTailNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resTailNumber")
    @ExcludeMissing
    fun _resTailNumber(): JsonField<String> = resTailNumber

    /**
     * Returns the raw JSON value of [resType].
     *
     * Unlike [resType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resType") @ExcludeMissing fun _resType(): JsonField<String> = resType

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [targetTime].
     *
     * Unlike [targetTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetTime")
    @ExcludeMissing
    fun _targetTime(): JsonField<OffsetDateTime> = targetTime

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
         * [AirfieldslotconsumptionAbridged].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idAirfieldSlot()
         * .numAircraft()
         * .source()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AirfieldslotconsumptionAbridged]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idAirfieldSlot: JsonField<String>? = null
        private var numAircraft: JsonField<Int>? = null
        private var source: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var altArrSortieId: JsonField<String> = JsonMissing.of()
        private var altDepSortieId: JsonField<String> = JsonMissing.of()
        private var appComment: JsonField<String> = JsonMissing.of()
        private var appInitials: JsonField<String> = JsonMissing.of()
        private var appOrg: JsonField<String> = JsonMissing.of()
        private var callSigns: JsonField<MutableList<String>>? = null
        private var consumer: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var idArrSortie: JsonField<String> = JsonMissing.of()
        private var idDepSortie: JsonField<String> = JsonMissing.of()
        private var missionId: JsonField<String> = JsonMissing.of()
        private var occAircraftMds: JsonField<String> = JsonMissing.of()
        private var occStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var occTailNumber: JsonField<String> = JsonMissing.of()
        private var occupied: JsonField<Boolean> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var reqComment: JsonField<String> = JsonMissing.of()
        private var reqInitials: JsonField<String> = JsonMissing.of()
        private var reqOrg: JsonField<String> = JsonMissing.of()
        private var resAircraftMds: JsonField<String> = JsonMissing.of()
        private var resMissionId: JsonField<String> = JsonMissing.of()
        private var resReason: JsonField<String> = JsonMissing.of()
        private var resTailNumber: JsonField<String> = JsonMissing.of()
        private var resType: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var targetTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(airfieldslotconsumptionAbridged: AirfieldslotconsumptionAbridged) =
            apply {
                classificationMarking = airfieldslotconsumptionAbridged.classificationMarking
                dataMode = airfieldslotconsumptionAbridged.dataMode
                idAirfieldSlot = airfieldslotconsumptionAbridged.idAirfieldSlot
                numAircraft = airfieldslotconsumptionAbridged.numAircraft
                source = airfieldslotconsumptionAbridged.source
                startTime = airfieldslotconsumptionAbridged.startTime
                id = airfieldslotconsumptionAbridged.id
                altArrSortieId = airfieldslotconsumptionAbridged.altArrSortieId
                altDepSortieId = airfieldslotconsumptionAbridged.altDepSortieId
                appComment = airfieldslotconsumptionAbridged.appComment
                appInitials = airfieldslotconsumptionAbridged.appInitials
                appOrg = airfieldslotconsumptionAbridged.appOrg
                callSigns = airfieldslotconsumptionAbridged.callSigns.map { it.toMutableList() }
                consumer = airfieldslotconsumptionAbridged.consumer
                createdAt = airfieldslotconsumptionAbridged.createdAt
                createdBy = airfieldslotconsumptionAbridged.createdBy
                endTime = airfieldslotconsumptionAbridged.endTime
                idArrSortie = airfieldslotconsumptionAbridged.idArrSortie
                idDepSortie = airfieldslotconsumptionAbridged.idDepSortie
                missionId = airfieldslotconsumptionAbridged.missionId
                occAircraftMds = airfieldslotconsumptionAbridged.occAircraftMds
                occStartTime = airfieldslotconsumptionAbridged.occStartTime
                occTailNumber = airfieldslotconsumptionAbridged.occTailNumber
                occupied = airfieldslotconsumptionAbridged.occupied
                origin = airfieldslotconsumptionAbridged.origin
                origNetwork = airfieldslotconsumptionAbridged.origNetwork
                reqComment = airfieldslotconsumptionAbridged.reqComment
                reqInitials = airfieldslotconsumptionAbridged.reqInitials
                reqOrg = airfieldslotconsumptionAbridged.reqOrg
                resAircraftMds = airfieldslotconsumptionAbridged.resAircraftMds
                resMissionId = airfieldslotconsumptionAbridged.resMissionId
                resReason = airfieldslotconsumptionAbridged.resReason
                resTailNumber = airfieldslotconsumptionAbridged.resTailNumber
                resType = airfieldslotconsumptionAbridged.resType
                sourceDl = airfieldslotconsumptionAbridged.sourceDl
                status = airfieldslotconsumptionAbridged.status
                targetTime = airfieldslotconsumptionAbridged.targetTime
                additionalProperties =
                    airfieldslotconsumptionAbridged.additionalProperties.toMutableMap()
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

        /**
         * Unique identifier of the airfield slot for which this slot consumption record is
         * referencing.
         */
        fun idAirfieldSlot(idAirfieldSlot: String) = idAirfieldSlot(JsonField.of(idAirfieldSlot))

        /**
         * Sets [Builder.idAirfieldSlot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idAirfieldSlot] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idAirfieldSlot(idAirfieldSlot: JsonField<String>) = apply {
            this.idAirfieldSlot = idAirfieldSlot
        }

        /** Number of aircraft using this slot for this time. */
        fun numAircraft(numAircraft: Int) = numAircraft(JsonField.of(numAircraft))

        /**
         * Sets [Builder.numAircraft] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numAircraft] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numAircraft(numAircraft: JsonField<Int>) = apply { this.numAircraft = numAircraft }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** The start of the slot window, in ISO 8601 UTC format. */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Alternate identifier of the sortie arriving at the slot start time provided by the
         * source.
         */
        fun altArrSortieId(altArrSortieId: String) = altArrSortieId(JsonField.of(altArrSortieId))

        /**
         * Sets [Builder.altArrSortieId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altArrSortieId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun altArrSortieId(altArrSortieId: JsonField<String>) = apply {
            this.altArrSortieId = altArrSortieId
        }

        /**
         * Alternate identifier of the sortie departing at the slot end time provided by the source.
         */
        fun altDepSortieId(altDepSortieId: String) = altDepSortieId(JsonField.of(altDepSortieId))

        /**
         * Sets [Builder.altDepSortieId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altDepSortieId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun altDepSortieId(altDepSortieId: JsonField<String>) = apply {
            this.altDepSortieId = altDepSortieId
        }

        /** Comments from the approver. */
        fun appComment(appComment: String) = appComment(JsonField.of(appComment))

        /**
         * Sets [Builder.appComment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appComment] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun appComment(appComment: JsonField<String>) = apply { this.appComment = appComment }

        /**
         * Initials of the person approving the use of this slot. Use SYSTEM if auto-approved
         * without human involvement.
         */
        fun appInitials(appInitials: String) = appInitials(JsonField.of(appInitials))

        /**
         * Sets [Builder.appInitials] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appInitials] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun appInitials(appInitials: JsonField<String>) = apply { this.appInitials = appInitials }

        /** Short name of the organization approving the use of this slot. */
        fun appOrg(appOrg: String) = appOrg(JsonField.of(appOrg))

        /**
         * Sets [Builder.appOrg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appOrg] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appOrg(appOrg: JsonField<String>) = apply { this.appOrg = appOrg }

        /** Array of call signs of the aircraft using this slot. */
        fun callSigns(callSigns: List<String>) = callSigns(JsonField.of(callSigns))

        /**
         * Sets [Builder.callSigns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSigns] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callSigns(callSigns: JsonField<List<String>>) = apply {
            this.callSigns = callSigns.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [callSigns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCallSign(callSign: String) = apply {
            callSigns =
                (callSigns ?: JsonField.of(mutableListOf())).also {
                    checkKnown("callSigns", it).add(callSign)
                }
        }

        /**
         * Identifying name of the aircraft using this slot. Names are often Prior Permission
         * Required (PPR) numbers or other similar human-readable identifiers.
         */
        fun consumer(consumer: String) = consumer(JsonField.of(consumer))

        /**
         * Sets [Builder.consumer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.consumer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun consumer(consumer: JsonField<String>) = apply { this.consumer = consumer }

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

        /** The end of the slot window, in ISO 8601 UTC format. */
        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        /** Unique identifier of the sortie arriving at the slot start time. */
        fun idArrSortie(idArrSortie: String) = idArrSortie(JsonField.of(idArrSortie))

        /**
         * Sets [Builder.idArrSortie] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idArrSortie] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idArrSortie(idArrSortie: JsonField<String>) = apply { this.idArrSortie = idArrSortie }

        /** Unique identifier of the sortie departing at the slot end time. */
        fun idDepSortie(idDepSortie: String) = idDepSortie(JsonField.of(idDepSortie))

        /**
         * Sets [Builder.idDepSortie] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idDepSortie] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idDepSortie(idDepSortie: JsonField<String>) = apply { this.idDepSortie = idDepSortie }

        /**
         * Mission identifier using this slot according to Mobility Air Forces (MAF) Encode/Decode
         * procedures.
         */
        fun missionId(missionId: String) = missionId(JsonField.of(missionId))

        /**
         * Sets [Builder.missionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun missionId(missionId: JsonField<String>) = apply { this.missionId = missionId }

        /** The aircraft Model Design Series designation of the aircraft occupying this slot. */
        fun occAircraftMds(occAircraftMds: String) = occAircraftMds(JsonField.of(occAircraftMds))

        /**
         * Sets [Builder.occAircraftMds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occAircraftMds] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun occAircraftMds(occAircraftMds: JsonField<String>) = apply {
            this.occAircraftMds = occAircraftMds
        }

        /**
         * Time the aircraft began occupying this slot, in ISO 8601 UTC format with millisecond
         * precision.
         */
        fun occStartTime(occStartTime: OffsetDateTime) = occStartTime(JsonField.of(occStartTime))

        /**
         * Sets [Builder.occStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun occStartTime(occStartTime: JsonField<OffsetDateTime>) = apply {
            this.occStartTime = occStartTime
        }

        /** The tail number of the aircraft occupying this slot. */
        fun occTailNumber(occTailNumber: String) = occTailNumber(JsonField.of(occTailNumber))

        /**
         * Sets [Builder.occTailNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occTailNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun occTailNumber(occTailNumber: JsonField<String>) = apply {
            this.occTailNumber = occTailNumber
        }

        /** Flag indicating if the slot is occupied. */
        fun occupied(occupied: Boolean) = occupied(JsonField.of(occupied))

        /**
         * Sets [Builder.occupied] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occupied] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun occupied(occupied: JsonField<Boolean>) = apply { this.occupied = occupied }

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

        /** Comments from the requester. */
        fun reqComment(reqComment: String) = reqComment(JsonField.of(reqComment))

        /**
         * Sets [Builder.reqComment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reqComment] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reqComment(reqComment: JsonField<String>) = apply { this.reqComment = reqComment }

        /**
         * Initials of the person requesting the use of this slot. Use SYSTEM if this request is
         * auto-generated by an auto-planning system.
         */
        fun reqInitials(reqInitials: String) = reqInitials(JsonField.of(reqInitials))

        /**
         * Sets [Builder.reqInitials] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reqInitials] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reqInitials(reqInitials: JsonField<String>) = apply { this.reqInitials = reqInitials }

        /** Short name of the organization requesting use of this slot. */
        fun reqOrg(reqOrg: String) = reqOrg(JsonField.of(reqOrg))

        /**
         * Sets [Builder.reqOrg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reqOrg] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reqOrg(reqOrg: JsonField<String>) = apply { this.reqOrg = reqOrg }

        /**
         * The aircraft Model Design Series designation of the aircraft this slot is reserved for.
         */
        fun resAircraftMds(resAircraftMds: String) = resAircraftMds(JsonField.of(resAircraftMds))

        /**
         * Sets [Builder.resAircraftMds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resAircraftMds] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resAircraftMds(resAircraftMds: JsonField<String>) = apply {
            this.resAircraftMds = resAircraftMds
        }

        /**
         * Mission identifier reserving this slot according to Mobility Air Forces (MAF)
         * Encode/Decode procedures.
         */
        fun resMissionId(resMissionId: String) = resMissionId(JsonField.of(resMissionId))

        /**
         * Sets [Builder.resMissionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resMissionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resMissionId(resMissionId: JsonField<String>) = apply {
            this.resMissionId = resMissionId
        }

        /** The reason the slot reservation was made. */
        fun resReason(resReason: String) = resReason(JsonField.of(resReason))

        /**
         * Sets [Builder.resReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resReason(resReason: JsonField<String>) = apply { this.resReason = resReason }

        /** The tail number of the aircraft this slot is reserved for. */
        fun resTailNumber(resTailNumber: String) = resTailNumber(JsonField.of(resTailNumber))

        /**
         * Sets [Builder.resTailNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resTailNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resTailNumber(resTailNumber: JsonField<String>) = apply {
            this.resTailNumber = resTailNumber
        }

        /** Indicates the type of reservation (e.g. M for Mission, A for Aircraft, O for Other). */
        fun resType(resType: String) = resType(JsonField.of(resType))

        /**
         * Sets [Builder.resType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun resType(resType: JsonField<String>) = apply { this.resType = resType }

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

        /** Current status of this slot (REQUESTED / APPROVED / DENIED / BLOCKED / OTHER). */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * The desired time for aircraft action such as landing, take off, parking, etc., in ISO
         * 8601 UTC format.
         */
        fun targetTime(targetTime: OffsetDateTime) = targetTime(JsonField.of(targetTime))

        /**
         * Sets [Builder.targetTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetTime(targetTime: JsonField<OffsetDateTime>) = apply {
            this.targetTime = targetTime
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
         * Returns an immutable instance of [AirfieldslotconsumptionAbridged].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idAirfieldSlot()
         * .numAircraft()
         * .source()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AirfieldslotconsumptionAbridged =
            AirfieldslotconsumptionAbridged(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idAirfieldSlot", idAirfieldSlot),
                checkRequired("numAircraft", numAircraft),
                checkRequired("source", source),
                checkRequired("startTime", startTime),
                id,
                altArrSortieId,
                altDepSortieId,
                appComment,
                appInitials,
                appOrg,
                (callSigns ?: JsonMissing.of()).map { it.toImmutable() },
                consumer,
                createdAt,
                createdBy,
                endTime,
                idArrSortie,
                idDepSortie,
                missionId,
                occAircraftMds,
                occStartTime,
                occTailNumber,
                occupied,
                origin,
                origNetwork,
                reqComment,
                reqInitials,
                reqOrg,
                resAircraftMds,
                resMissionId,
                resReason,
                resTailNumber,
                resType,
                sourceDl,
                status,
                targetTime,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AirfieldslotconsumptionAbridged = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idAirfieldSlot()
        numAircraft()
        source()
        startTime()
        id()
        altArrSortieId()
        altDepSortieId()
        appComment()
        appInitials()
        appOrg()
        callSigns()
        consumer()
        createdAt()
        createdBy()
        endTime()
        idArrSortie()
        idDepSortie()
        missionId()
        occAircraftMds()
        occStartTime()
        occTailNumber()
        occupied()
        origin()
        origNetwork()
        reqComment()
        reqInitials()
        reqOrg()
        resAircraftMds()
        resMissionId()
        resReason()
        resTailNumber()
        resType()
        sourceDl()
        status().ifPresent { it.validate() }
        targetTime()
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
            (if (idAirfieldSlot.asKnown().isPresent) 1 else 0) +
            (if (numAircraft.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (altArrSortieId.asKnown().isPresent) 1 else 0) +
            (if (altDepSortieId.asKnown().isPresent) 1 else 0) +
            (if (appComment.asKnown().isPresent) 1 else 0) +
            (if (appInitials.asKnown().isPresent) 1 else 0) +
            (if (appOrg.asKnown().isPresent) 1 else 0) +
            (callSigns.asKnown().getOrNull()?.size ?: 0) +
            (if (consumer.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (idArrSortie.asKnown().isPresent) 1 else 0) +
            (if (idDepSortie.asKnown().isPresent) 1 else 0) +
            (if (missionId.asKnown().isPresent) 1 else 0) +
            (if (occAircraftMds.asKnown().isPresent) 1 else 0) +
            (if (occStartTime.asKnown().isPresent) 1 else 0) +
            (if (occTailNumber.asKnown().isPresent) 1 else 0) +
            (if (occupied.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (reqComment.asKnown().isPresent) 1 else 0) +
            (if (reqInitials.asKnown().isPresent) 1 else 0) +
            (if (reqOrg.asKnown().isPresent) 1 else 0) +
            (if (resAircraftMds.asKnown().isPresent) 1 else 0) +
            (if (resMissionId.asKnown().isPresent) 1 else 0) +
            (if (resReason.asKnown().isPresent) 1 else 0) +
            (if (resTailNumber.asKnown().isPresent) 1 else 0) +
            (if (resType.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (targetTime.asKnown().isPresent) 1 else 0)

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

    /** Current status of this slot (REQUESTED / APPROVED / DENIED / BLOCKED / OTHER). */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val REQUESTED = of("REQUESTED")

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DENIED = of("DENIED")

            @JvmField val BLOCKED = of("BLOCKED")

            @JvmField val OTHER = of("OTHER")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            REQUESTED,
            APPROVED,
            DENIED,
            BLOCKED,
            OTHER,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REQUESTED,
            APPROVED,
            DENIED,
            BLOCKED,
            OTHER,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                REQUESTED -> Value.REQUESTED
                APPROVED -> Value.APPROVED
                DENIED -> Value.DENIED
                BLOCKED -> Value.BLOCKED
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
                REQUESTED -> Known.REQUESTED
                APPROVED -> Known.APPROVED
                DENIED -> Known.DENIED
                BLOCKED -> Known.BLOCKED
                OTHER -> Known.OTHER
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AirfieldslotconsumptionAbridged &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            idAirfieldSlot == other.idAirfieldSlot &&
            numAircraft == other.numAircraft &&
            source == other.source &&
            startTime == other.startTime &&
            id == other.id &&
            altArrSortieId == other.altArrSortieId &&
            altDepSortieId == other.altDepSortieId &&
            appComment == other.appComment &&
            appInitials == other.appInitials &&
            appOrg == other.appOrg &&
            callSigns == other.callSigns &&
            consumer == other.consumer &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            endTime == other.endTime &&
            idArrSortie == other.idArrSortie &&
            idDepSortie == other.idDepSortie &&
            missionId == other.missionId &&
            occAircraftMds == other.occAircraftMds &&
            occStartTime == other.occStartTime &&
            occTailNumber == other.occTailNumber &&
            occupied == other.occupied &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            reqComment == other.reqComment &&
            reqInitials == other.reqInitials &&
            reqOrg == other.reqOrg &&
            resAircraftMds == other.resAircraftMds &&
            resMissionId == other.resMissionId &&
            resReason == other.resReason &&
            resTailNumber == other.resTailNumber &&
            resType == other.resType &&
            sourceDl == other.sourceDl &&
            status == other.status &&
            targetTime == other.targetTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            idAirfieldSlot,
            numAircraft,
            source,
            startTime,
            id,
            altArrSortieId,
            altDepSortieId,
            appComment,
            appInitials,
            appOrg,
            callSigns,
            consumer,
            createdAt,
            createdBy,
            endTime,
            idArrSortie,
            idDepSortie,
            missionId,
            occAircraftMds,
            occStartTime,
            occTailNumber,
            occupied,
            origin,
            origNetwork,
            reqComment,
            reqInitials,
            reqOrg,
            resAircraftMds,
            resMissionId,
            resReason,
            resTailNumber,
            resType,
            sourceDl,
            status,
            targetTime,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AirfieldslotconsumptionAbridged{classificationMarking=$classificationMarking, dataMode=$dataMode, idAirfieldSlot=$idAirfieldSlot, numAircraft=$numAircraft, source=$source, startTime=$startTime, id=$id, altArrSortieId=$altArrSortieId, altDepSortieId=$altDepSortieId, appComment=$appComment, appInitials=$appInitials, appOrg=$appOrg, callSigns=$callSigns, consumer=$consumer, createdAt=$createdAt, createdBy=$createdBy, endTime=$endTime, idArrSortie=$idArrSortie, idDepSortie=$idDepSortie, missionId=$missionId, occAircraftMds=$occAircraftMds, occStartTime=$occStartTime, occTailNumber=$occTailNumber, occupied=$occupied, origin=$origin, origNetwork=$origNetwork, reqComment=$reqComment, reqInitials=$reqInitials, reqOrg=$reqOrg, resAircraftMds=$resAircraftMds, resMissionId=$resMissionId, resReason=$resReason, resTailNumber=$resTailNumber, resType=$resType, sourceDl=$sourceDl, status=$status, targetTime=$targetTime, additionalProperties=$additionalProperties}"
}

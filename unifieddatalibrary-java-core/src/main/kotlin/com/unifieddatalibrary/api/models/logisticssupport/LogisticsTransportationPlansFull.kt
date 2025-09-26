// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Transportation plans associated with this LogisticsSupport record, used to coordinate maintenance
 * efforts.
 */
class LogisticsTransportationPlansFull
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actDepTime: JsonField<OffsetDateTime>,
    private val aircraftStatus: JsonField<String>,
    private val approxArrTime: JsonField<OffsetDateTime>,
    private val cancelledDate: JsonField<OffsetDateTime>,
    private val closedDate: JsonField<OffsetDateTime>,
    private val coordinator: JsonField<String>,
    private val coordinatorUnit: JsonField<String>,
    private val destinationIcao: JsonField<String>,
    private val duration: JsonField<String>,
    private val estArrTime: JsonField<OffsetDateTime>,
    private val estDepTime: JsonField<OffsetDateTime>,
    private val lastChangedDate: JsonField<OffsetDateTime>,
    private val logisticMasterRecordId: JsonField<String>,
    private val logisticsSegments: JsonField<List<LogisticsSegmentsFull>>,
    private val logisticsTransportationPlansRemarks: JsonField<List<LogisticsRemarksFull>>,
    private val majcom: JsonField<String>,
    private val missionChange: JsonField<Boolean>,
    private val numEnrouteStops: JsonField<Int>,
    private val numTransLoads: JsonField<Int>,
    private val originIcao: JsonField<String>,
    private val planDefinition: JsonField<String>,
    private val plansNumber: JsonField<String>,
    private val serialNumber: JsonField<String>,
    private val statusCode: JsonField<String>,
    private val tpAircraftMds: JsonField<String>,
    private val tpTailNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actDepTime")
        @ExcludeMissing
        actDepTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("aircraftStatus")
        @ExcludeMissing
        aircraftStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("approxArrTime")
        @ExcludeMissing
        approxArrTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("cancelledDate")
        @ExcludeMissing
        cancelledDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("closedDate")
        @ExcludeMissing
        closedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("coordinator")
        @ExcludeMissing
        coordinator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("coordinatorUnit")
        @ExcludeMissing
        coordinatorUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destinationICAO")
        @ExcludeMissing
        destinationIcao: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<String> = JsonMissing.of(),
        @JsonProperty("estArrTime")
        @ExcludeMissing
        estArrTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("estDepTime")
        @ExcludeMissing
        estDepTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastChangedDate")
        @ExcludeMissing
        lastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("logisticMasterRecordId")
        @ExcludeMissing
        logisticMasterRecordId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logisticsSegments")
        @ExcludeMissing
        logisticsSegments: JsonField<List<LogisticsSegmentsFull>> = JsonMissing.of(),
        @JsonProperty("logisticsTransportationPlansRemarks")
        @ExcludeMissing
        logisticsTransportationPlansRemarks: JsonField<List<LogisticsRemarksFull>> =
            JsonMissing.of(),
        @JsonProperty("majcom") @ExcludeMissing majcom: JsonField<String> = JsonMissing.of(),
        @JsonProperty("missionChange")
        @ExcludeMissing
        missionChange: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("numEnrouteStops")
        @ExcludeMissing
        numEnrouteStops: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numTransLoads")
        @ExcludeMissing
        numTransLoads: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("originICAO")
        @ExcludeMissing
        originIcao: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planDefinition")
        @ExcludeMissing
        planDefinition: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plansNumber")
        @ExcludeMissing
        plansNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("serialNumber")
        @ExcludeMissing
        serialNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statusCode")
        @ExcludeMissing
        statusCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tpAircraftMDS")
        @ExcludeMissing
        tpAircraftMds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tpTailNumber")
        @ExcludeMissing
        tpTailNumber: JsonField<String> = JsonMissing.of(),
    ) : this(
        actDepTime,
        aircraftStatus,
        approxArrTime,
        cancelledDate,
        closedDate,
        coordinator,
        coordinatorUnit,
        destinationIcao,
        duration,
        estArrTime,
        estDepTime,
        lastChangedDate,
        logisticMasterRecordId,
        logisticsSegments,
        logisticsTransportationPlansRemarks,
        majcom,
        missionChange,
        numEnrouteStops,
        numTransLoads,
        originIcao,
        planDefinition,
        plansNumber,
        serialNumber,
        statusCode,
        tpAircraftMds,
        tpTailNumber,
        mutableMapOf(),
    )

    /**
     * Actual time of departure of first segment, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actDepTime(): Optional<OffsetDateTime> = actDepTime.getOptional("actDepTime")

    /**
     * These are the initial maintenance values entered based on the pilot descriptions or the
     * official maintenance evaluation code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aircraftStatus(): Optional<String> = aircraftStatus.getOptional("aircraftStatus")

    /**
     * Approximate time of arrival of final segement, in ISO 8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun approxArrTime(): Optional<OffsetDateTime> = approxArrTime.getOptional("approxArrTime")

    /**
     * GC. LGTP_CANX_DT. GD2: Date when the transportation plan was cancelled, in ISO 8601 UTC
     * format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cancelledDate(): Optional<OffsetDateTime> = cancelledDate.getOptional("cancelledDate")

    /**
     * GC. LGTP_CLSD_DT. GD2: Date when the transportation plan was closed, in ISO 8601 UTC format
     * with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun closedDate(): Optional<OffsetDateTime> = closedDate.getOptional("closedDate")

    /**
     * The AMS username of the operator who alters the coordination status. Automatically captured
     * by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coordinator(): Optional<String> = coordinator.getOptional("coordinator")

    /**
     * The AMS user unit_id of the operator who alters the coordination status. Automatically
     * captured by the system from table AMS_USER.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coordinatorUnit(): Optional<String> = coordinatorUnit.getOptional("coordinatorUnit")

    /**
     * Destination location ICAO.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun destinationIcao(): Optional<String> = destinationIcao.getOptional("destinationICAO")

    /**
     * Transportation plan duration, expressed in the format MMM:SS.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun duration(): Optional<String> = duration.getOptional("duration")

    /**
     * ETA of the final segment, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun estArrTime(): Optional<OffsetDateTime> = estArrTime.getOptional("estArrTime")

    /**
     * ETD of the first segment, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun estDepTime(): Optional<OffsetDateTime> = estDepTime.getOptional("estDepTime")

    /**
     * Last time transportation plan was updated, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lastChangedDate(): Optional<OffsetDateTime> = lastChangedDate.getOptional("lastChangedDate")

    /**
     * The identifier that represents a Logistics Master Record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun logisticMasterRecordId(): Optional<String> =
        logisticMasterRecordId.getOptional("logisticMasterRecordId")

    /**
     * The transportation segments associated with this transportation plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun logisticsSegments(): Optional<List<LogisticsSegmentsFull>> =
        logisticsSegments.getOptional("logisticsSegments")

    /**
     * Remarks associated with this transportation plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun logisticsTransportationPlansRemarks(): Optional<List<LogisticsRemarksFull>> =
        logisticsTransportationPlansRemarks.getOptional("logisticsTransportationPlansRemarks")

    /**
     * The major command for the current unit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun majcom(): Optional<String> = majcom.getOptional("majcom")

    /**
     * Indicates whether there have been changes to changes to ICAOs, estArrTime, or estDepTime
     * since this Transportation Plan was last edited.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun missionChange(): Optional<Boolean> = missionChange.getOptional("missionChange")

    /**
     * Transportation plan enroute stops.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numEnrouteStops(): Optional<Int> = numEnrouteStops.getOptional("numEnrouteStops")

    /**
     * The number of transloads for this Transportation Plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numTransLoads(): Optional<Int> = numTransLoads.getOptional("numTransLoads")

    /**
     * The origin location.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun originIcao(): Optional<String> = originIcao.getOptional("originICAO")

    /**
     * Defines the transporation plan as either a deployment or redeployment.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun planDefinition(): Optional<String> = planDefinition.getOptional("planDefinition")

    /**
     * System generated reference id for the transportation plan. Format: TXXXXXNNNN T -
     * Transportation, Sequence Number, Node Id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun plansNumber(): Optional<String> = plansNumber.getOptional("plansNumber")

    /**
     * GDSS2 uses an 8 character serial number to uniquely identify the aircraft and MDS
     * combination. This is a portion of the full manufacturer serial number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun serialNumber(): Optional<String> = serialNumber.getOptional("serialNumber")

    /**
     * Transporation Coordination status code. Cancel, Send to APCC, working, agree, disapprove or
     * blank.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun statusCode(): Optional<String> = statusCode.getOptional("statusCode")

    /**
     * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE, KC-130
     * HERCULES, etc.) of this aircraft. Intended as, but not constrained to, MIL-STD-6016
     * environment dependent specific type designations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tpAircraftMds(): Optional<String> = tpAircraftMds.getOptional("tpAircraftMDS")

    /**
     * Contains the tail number displayed by GDSS2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tpTailNumber(): Optional<String> = tpTailNumber.getOptional("tpTailNumber")

    /**
     * Returns the raw JSON value of [actDepTime].
     *
     * Unlike [actDepTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actDepTime")
    @ExcludeMissing
    fun _actDepTime(): JsonField<OffsetDateTime> = actDepTime

    /**
     * Returns the raw JSON value of [aircraftStatus].
     *
     * Unlike [aircraftStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aircraftStatus")
    @ExcludeMissing
    fun _aircraftStatus(): JsonField<String> = aircraftStatus

    /**
     * Returns the raw JSON value of [approxArrTime].
     *
     * Unlike [approxArrTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approxArrTime")
    @ExcludeMissing
    fun _approxArrTime(): JsonField<OffsetDateTime> = approxArrTime

    /**
     * Returns the raw JSON value of [cancelledDate].
     *
     * Unlike [cancelledDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancelledDate")
    @ExcludeMissing
    fun _cancelledDate(): JsonField<OffsetDateTime> = cancelledDate

    /**
     * Returns the raw JSON value of [closedDate].
     *
     * Unlike [closedDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("closedDate")
    @ExcludeMissing
    fun _closedDate(): JsonField<OffsetDateTime> = closedDate

    /**
     * Returns the raw JSON value of [coordinator].
     *
     * Unlike [coordinator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coordinator") @ExcludeMissing fun _coordinator(): JsonField<String> = coordinator

    /**
     * Returns the raw JSON value of [coordinatorUnit].
     *
     * Unlike [coordinatorUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coordinatorUnit")
    @ExcludeMissing
    fun _coordinatorUnit(): JsonField<String> = coordinatorUnit

    /**
     * Returns the raw JSON value of [destinationIcao].
     *
     * Unlike [destinationIcao], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destinationICAO")
    @ExcludeMissing
    fun _destinationIcao(): JsonField<String> = destinationIcao

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<String> = duration

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
     * Returns the raw JSON value of [lastChangedDate].
     *
     * Unlike [lastChangedDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastChangedDate")
    @ExcludeMissing
    fun _lastChangedDate(): JsonField<OffsetDateTime> = lastChangedDate

    /**
     * Returns the raw JSON value of [logisticMasterRecordId].
     *
     * Unlike [logisticMasterRecordId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("logisticMasterRecordId")
    @ExcludeMissing
    fun _logisticMasterRecordId(): JsonField<String> = logisticMasterRecordId

    /**
     * Returns the raw JSON value of [logisticsSegments].
     *
     * Unlike [logisticsSegments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("logisticsSegments")
    @ExcludeMissing
    fun _logisticsSegments(): JsonField<List<LogisticsSegmentsFull>> = logisticsSegments

    /**
     * Returns the raw JSON value of [logisticsTransportationPlansRemarks].
     *
     * Unlike [logisticsTransportationPlansRemarks], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("logisticsTransportationPlansRemarks")
    @ExcludeMissing
    fun _logisticsTransportationPlansRemarks(): JsonField<List<LogisticsRemarksFull>> =
        logisticsTransportationPlansRemarks

    /**
     * Returns the raw JSON value of [majcom].
     *
     * Unlike [majcom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("majcom") @ExcludeMissing fun _majcom(): JsonField<String> = majcom

    /**
     * Returns the raw JSON value of [missionChange].
     *
     * Unlike [missionChange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("missionChange")
    @ExcludeMissing
    fun _missionChange(): JsonField<Boolean> = missionChange

    /**
     * Returns the raw JSON value of [numEnrouteStops].
     *
     * Unlike [numEnrouteStops], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numEnrouteStops")
    @ExcludeMissing
    fun _numEnrouteStops(): JsonField<Int> = numEnrouteStops

    /**
     * Returns the raw JSON value of [numTransLoads].
     *
     * Unlike [numTransLoads], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numTransLoads")
    @ExcludeMissing
    fun _numTransLoads(): JsonField<Int> = numTransLoads

    /**
     * Returns the raw JSON value of [originIcao].
     *
     * Unlike [originIcao], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("originICAO") @ExcludeMissing fun _originIcao(): JsonField<String> = originIcao

    /**
     * Returns the raw JSON value of [planDefinition].
     *
     * Unlike [planDefinition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("planDefinition")
    @ExcludeMissing
    fun _planDefinition(): JsonField<String> = planDefinition

    /**
     * Returns the raw JSON value of [plansNumber].
     *
     * Unlike [plansNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plansNumber") @ExcludeMissing fun _plansNumber(): JsonField<String> = plansNumber

    /**
     * Returns the raw JSON value of [serialNumber].
     *
     * Unlike [serialNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("serialNumber")
    @ExcludeMissing
    fun _serialNumber(): JsonField<String> = serialNumber

    /**
     * Returns the raw JSON value of [statusCode].
     *
     * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusCode") @ExcludeMissing fun _statusCode(): JsonField<String> = statusCode

    /**
     * Returns the raw JSON value of [tpAircraftMds].
     *
     * Unlike [tpAircraftMds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tpAircraftMDS")
    @ExcludeMissing
    fun _tpAircraftMds(): JsonField<String> = tpAircraftMds

    /**
     * Returns the raw JSON value of [tpTailNumber].
     *
     * Unlike [tpTailNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tpTailNumber")
    @ExcludeMissing
    fun _tpTailNumber(): JsonField<String> = tpTailNumber

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
         * [LogisticsTransportationPlansFull].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogisticsTransportationPlansFull]. */
    class Builder internal constructor() {

        private var actDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var aircraftStatus: JsonField<String> = JsonMissing.of()
        private var approxArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var cancelledDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var closedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var coordinator: JsonField<String> = JsonMissing.of()
        private var coordinatorUnit: JsonField<String> = JsonMissing.of()
        private var destinationIcao: JsonField<String> = JsonMissing.of()
        private var duration: JsonField<String> = JsonMissing.of()
        private var estArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var estDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var logisticMasterRecordId: JsonField<String> = JsonMissing.of()
        private var logisticsSegments: JsonField<MutableList<LogisticsSegmentsFull>>? = null
        private var logisticsTransportationPlansRemarks:
            JsonField<MutableList<LogisticsRemarksFull>>? =
            null
        private var majcom: JsonField<String> = JsonMissing.of()
        private var missionChange: JsonField<Boolean> = JsonMissing.of()
        private var numEnrouteStops: JsonField<Int> = JsonMissing.of()
        private var numTransLoads: JsonField<Int> = JsonMissing.of()
        private var originIcao: JsonField<String> = JsonMissing.of()
        private var planDefinition: JsonField<String> = JsonMissing.of()
        private var plansNumber: JsonField<String> = JsonMissing.of()
        private var serialNumber: JsonField<String> = JsonMissing.of()
        private var statusCode: JsonField<String> = JsonMissing.of()
        private var tpAircraftMds: JsonField<String> = JsonMissing.of()
        private var tpTailNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logisticsTransportationPlansFull: LogisticsTransportationPlansFull) =
            apply {
                actDepTime = logisticsTransportationPlansFull.actDepTime
                aircraftStatus = logisticsTransportationPlansFull.aircraftStatus
                approxArrTime = logisticsTransportationPlansFull.approxArrTime
                cancelledDate = logisticsTransportationPlansFull.cancelledDate
                closedDate = logisticsTransportationPlansFull.closedDate
                coordinator = logisticsTransportationPlansFull.coordinator
                coordinatorUnit = logisticsTransportationPlansFull.coordinatorUnit
                destinationIcao = logisticsTransportationPlansFull.destinationIcao
                duration = logisticsTransportationPlansFull.duration
                estArrTime = logisticsTransportationPlansFull.estArrTime
                estDepTime = logisticsTransportationPlansFull.estDepTime
                lastChangedDate = logisticsTransportationPlansFull.lastChangedDate
                logisticMasterRecordId = logisticsTransportationPlansFull.logisticMasterRecordId
                logisticsSegments =
                    logisticsTransportationPlansFull.logisticsSegments.map { it.toMutableList() }
                logisticsTransportationPlansRemarks =
                    logisticsTransportationPlansFull.logisticsTransportationPlansRemarks.map {
                        it.toMutableList()
                    }
                majcom = logisticsTransportationPlansFull.majcom
                missionChange = logisticsTransportationPlansFull.missionChange
                numEnrouteStops = logisticsTransportationPlansFull.numEnrouteStops
                numTransLoads = logisticsTransportationPlansFull.numTransLoads
                originIcao = logisticsTransportationPlansFull.originIcao
                planDefinition = logisticsTransportationPlansFull.planDefinition
                plansNumber = logisticsTransportationPlansFull.plansNumber
                serialNumber = logisticsTransportationPlansFull.serialNumber
                statusCode = logisticsTransportationPlansFull.statusCode
                tpAircraftMds = logisticsTransportationPlansFull.tpAircraftMds
                tpTailNumber = logisticsTransportationPlansFull.tpTailNumber
                additionalProperties =
                    logisticsTransportationPlansFull.additionalProperties.toMutableMap()
            }

        /**
         * Actual time of departure of first segment, in ISO 8601 UTC format with millisecond
         * precision.
         */
        fun actDepTime(actDepTime: OffsetDateTime) = actDepTime(JsonField.of(actDepTime))

        /**
         * Sets [Builder.actDepTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actDepTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actDepTime(actDepTime: JsonField<OffsetDateTime>) = apply {
            this.actDepTime = actDepTime
        }

        /**
         * These are the initial maintenance values entered based on the pilot descriptions or the
         * official maintenance evaluation code.
         */
        fun aircraftStatus(aircraftStatus: String) = aircraftStatus(JsonField.of(aircraftStatus))

        /**
         * Sets [Builder.aircraftStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aircraftStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aircraftStatus(aircraftStatus: JsonField<String>) = apply {
            this.aircraftStatus = aircraftStatus
        }

        /**
         * Approximate time of arrival of final segement, in ISO 8601 UTC format with millisecond
         * precision.
         */
        fun approxArrTime(approxArrTime: OffsetDateTime) =
            approxArrTime(JsonField.of(approxArrTime))

        /**
         * Sets [Builder.approxArrTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approxArrTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approxArrTime(approxArrTime: JsonField<OffsetDateTime>) = apply {
            this.approxArrTime = approxArrTime
        }

        /**
         * GC. LGTP_CANX_DT. GD2: Date when the transportation plan was cancelled, in ISO 8601 UTC
         * format with millisecond precision.
         */
        fun cancelledDate(cancelledDate: OffsetDateTime) =
            cancelledDate(JsonField.of(cancelledDate))

        /**
         * Sets [Builder.cancelledDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelledDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancelledDate(cancelledDate: JsonField<OffsetDateTime>) = apply {
            this.cancelledDate = cancelledDate
        }

        /**
         * GC. LGTP_CLSD_DT. GD2: Date when the transportation plan was closed, in ISO 8601 UTC
         * format with millisecond precision.
         */
        fun closedDate(closedDate: OffsetDateTime) = closedDate(JsonField.of(closedDate))

        /**
         * Sets [Builder.closedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closedDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun closedDate(closedDate: JsonField<OffsetDateTime>) = apply {
            this.closedDate = closedDate
        }

        /**
         * The AMS username of the operator who alters the coordination status. Automatically
         * captured by the system.
         */
        fun coordinator(coordinator: String) = coordinator(JsonField.of(coordinator))

        /**
         * Sets [Builder.coordinator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coordinator] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun coordinator(coordinator: JsonField<String>) = apply { this.coordinator = coordinator }

        /**
         * The AMS user unit_id of the operator who alters the coordination status. Automatically
         * captured by the system from table AMS_USER.
         */
        fun coordinatorUnit(coordinatorUnit: String) =
            coordinatorUnit(JsonField.of(coordinatorUnit))

        /**
         * Sets [Builder.coordinatorUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coordinatorUnit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun coordinatorUnit(coordinatorUnit: JsonField<String>) = apply {
            this.coordinatorUnit = coordinatorUnit
        }

        /** Destination location ICAO. */
        fun destinationIcao(destinationIcao: String) =
            destinationIcao(JsonField.of(destinationIcao))

        /**
         * Sets [Builder.destinationIcao] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationIcao] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun destinationIcao(destinationIcao: JsonField<String>) = apply {
            this.destinationIcao = destinationIcao
        }

        /** Transportation plan duration, expressed in the format MMM:SS. */
        fun duration(duration: String) = duration(JsonField.of(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<String>) = apply { this.duration = duration }

        /** ETA of the final segment, in ISO 8601 UTC format with millisecond precision. */
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

        /** ETD of the first segment, in ISO 8601 UTC format with millisecond precision. */
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
         * Last time transportation plan was updated, in ISO 8601 UTC format with millisecond
         * precision.
         */
        fun lastChangedDate(lastChangedDate: OffsetDateTime) =
            lastChangedDate(JsonField.of(lastChangedDate))

        /**
         * Sets [Builder.lastChangedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastChangedDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastChangedDate(lastChangedDate: JsonField<OffsetDateTime>) = apply {
            this.lastChangedDate = lastChangedDate
        }

        /** The identifier that represents a Logistics Master Record. */
        fun logisticMasterRecordId(logisticMasterRecordId: String) =
            logisticMasterRecordId(JsonField.of(logisticMasterRecordId))

        /**
         * Sets [Builder.logisticMasterRecordId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logisticMasterRecordId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun logisticMasterRecordId(logisticMasterRecordId: JsonField<String>) = apply {
            this.logisticMasterRecordId = logisticMasterRecordId
        }

        /** The transportation segments associated with this transportation plan. */
        fun logisticsSegments(logisticsSegments: List<LogisticsSegmentsFull>) =
            logisticsSegments(JsonField.of(logisticsSegments))

        /**
         * Sets [Builder.logisticsSegments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logisticsSegments] with a well-typed
         * `List<LogisticsSegmentsFull>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun logisticsSegments(logisticsSegments: JsonField<List<LogisticsSegmentsFull>>) = apply {
            this.logisticsSegments = logisticsSegments.map { it.toMutableList() }
        }

        /**
         * Adds a single [LogisticsSegmentsFull] to [logisticsSegments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLogisticsSegment(logisticsSegment: LogisticsSegmentsFull) = apply {
            logisticsSegments =
                (logisticsSegments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("logisticsSegments", it).add(logisticsSegment)
                }
        }

        /** Remarks associated with this transportation plan. */
        fun logisticsTransportationPlansRemarks(
            logisticsTransportationPlansRemarks: List<LogisticsRemarksFull>
        ) = logisticsTransportationPlansRemarks(JsonField.of(logisticsTransportationPlansRemarks))

        /**
         * Sets [Builder.logisticsTransportationPlansRemarks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logisticsTransportationPlansRemarks] with a well-typed
         * `List<LogisticsRemarksFull>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun logisticsTransportationPlansRemarks(
            logisticsTransportationPlansRemarks: JsonField<List<LogisticsRemarksFull>>
        ) = apply {
            this.logisticsTransportationPlansRemarks =
                logisticsTransportationPlansRemarks.map { it.toMutableList() }
        }

        /**
         * Adds a single [LogisticsRemarksFull] to [logisticsTransportationPlansRemarks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLogisticsTransportationPlansRemark(
            logisticsTransportationPlansRemark: LogisticsRemarksFull
        ) = apply {
            logisticsTransportationPlansRemarks =
                (logisticsTransportationPlansRemarks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("logisticsTransportationPlansRemarks", it)
                        .add(logisticsTransportationPlansRemark)
                }
        }

        /** The major command for the current unit. */
        fun majcom(majcom: String) = majcom(JsonField.of(majcom))

        /**
         * Sets [Builder.majcom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.majcom] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun majcom(majcom: JsonField<String>) = apply { this.majcom = majcom }

        /**
         * Indicates whether there have been changes to changes to ICAOs, estArrTime, or estDepTime
         * since this Transportation Plan was last edited.
         */
        fun missionChange(missionChange: Boolean) = missionChange(JsonField.of(missionChange))

        /**
         * Sets [Builder.missionChange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missionChange] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun missionChange(missionChange: JsonField<Boolean>) = apply {
            this.missionChange = missionChange
        }

        /** Transportation plan enroute stops. */
        fun numEnrouteStops(numEnrouteStops: Int) = numEnrouteStops(JsonField.of(numEnrouteStops))

        /**
         * Sets [Builder.numEnrouteStops] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numEnrouteStops] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numEnrouteStops(numEnrouteStops: JsonField<Int>) = apply {
            this.numEnrouteStops = numEnrouteStops
        }

        /** The number of transloads for this Transportation Plan. */
        fun numTransLoads(numTransLoads: Int) = numTransLoads(JsonField.of(numTransLoads))

        /**
         * Sets [Builder.numTransLoads] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numTransLoads] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numTransLoads(numTransLoads: JsonField<Int>) = apply {
            this.numTransLoads = numTransLoads
        }

        /** The origin location. */
        fun originIcao(originIcao: String) = originIcao(JsonField.of(originIcao))

        /**
         * Sets [Builder.originIcao] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originIcao] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun originIcao(originIcao: JsonField<String>) = apply { this.originIcao = originIcao }

        /** Defines the transporation plan as either a deployment or redeployment. */
        fun planDefinition(planDefinition: String) = planDefinition(JsonField.of(planDefinition))

        /**
         * Sets [Builder.planDefinition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planDefinition] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun planDefinition(planDefinition: JsonField<String>) = apply {
            this.planDefinition = planDefinition
        }

        /**
         * System generated reference id for the transportation plan. Format: TXXXXXNNNN T -
         * Transportation, Sequence Number, Node Id.
         */
        fun plansNumber(plansNumber: String) = plansNumber(JsonField.of(plansNumber))

        /**
         * Sets [Builder.plansNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plansNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun plansNumber(plansNumber: JsonField<String>) = apply { this.plansNumber = plansNumber }

        /**
         * GDSS2 uses an 8 character serial number to uniquely identify the aircraft and MDS
         * combination. This is a portion of the full manufacturer serial number.
         */
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
         * Transporation Coordination status code. Cancel, Send to APCC, working, agree, disapprove
         * or blank.
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

        /**
         * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE, KC-130
         * HERCULES, etc.) of this aircraft. Intended as, but not constrained to, MIL-STD-6016
         * environment dependent specific type designations.
         */
        fun tpAircraftMds(tpAircraftMds: String) = tpAircraftMds(JsonField.of(tpAircraftMds))

        /**
         * Sets [Builder.tpAircraftMds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tpAircraftMds] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tpAircraftMds(tpAircraftMds: JsonField<String>) = apply {
            this.tpAircraftMds = tpAircraftMds
        }

        /** Contains the tail number displayed by GDSS2. */
        fun tpTailNumber(tpTailNumber: String) = tpTailNumber(JsonField.of(tpTailNumber))

        /**
         * Sets [Builder.tpTailNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tpTailNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tpTailNumber(tpTailNumber: JsonField<String>) = apply {
            this.tpTailNumber = tpTailNumber
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
         * Returns an immutable instance of [LogisticsTransportationPlansFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogisticsTransportationPlansFull =
            LogisticsTransportationPlansFull(
                actDepTime,
                aircraftStatus,
                approxArrTime,
                cancelledDate,
                closedDate,
                coordinator,
                coordinatorUnit,
                destinationIcao,
                duration,
                estArrTime,
                estDepTime,
                lastChangedDate,
                logisticMasterRecordId,
                (logisticsSegments ?: JsonMissing.of()).map { it.toImmutable() },
                (logisticsTransportationPlansRemarks ?: JsonMissing.of()).map { it.toImmutable() },
                majcom,
                missionChange,
                numEnrouteStops,
                numTransLoads,
                originIcao,
                planDefinition,
                plansNumber,
                serialNumber,
                statusCode,
                tpAircraftMds,
                tpTailNumber,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogisticsTransportationPlansFull = apply {
        if (validated) {
            return@apply
        }

        actDepTime()
        aircraftStatus()
        approxArrTime()
        cancelledDate()
        closedDate()
        coordinator()
        coordinatorUnit()
        destinationIcao()
        duration()
        estArrTime()
        estDepTime()
        lastChangedDate()
        logisticMasterRecordId()
        logisticsSegments().ifPresent { it.forEach { it.validate() } }
        logisticsTransportationPlansRemarks().ifPresent { it.forEach { it.validate() } }
        majcom()
        missionChange()
        numEnrouteStops()
        numTransLoads()
        originIcao()
        planDefinition()
        plansNumber()
        serialNumber()
        statusCode()
        tpAircraftMds()
        tpTailNumber()
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
        (if (actDepTime.asKnown().isPresent) 1 else 0) +
            (if (aircraftStatus.asKnown().isPresent) 1 else 0) +
            (if (approxArrTime.asKnown().isPresent) 1 else 0) +
            (if (cancelledDate.asKnown().isPresent) 1 else 0) +
            (if (closedDate.asKnown().isPresent) 1 else 0) +
            (if (coordinator.asKnown().isPresent) 1 else 0) +
            (if (coordinatorUnit.asKnown().isPresent) 1 else 0) +
            (if (destinationIcao.asKnown().isPresent) 1 else 0) +
            (if (duration.asKnown().isPresent) 1 else 0) +
            (if (estArrTime.asKnown().isPresent) 1 else 0) +
            (if (estDepTime.asKnown().isPresent) 1 else 0) +
            (if (lastChangedDate.asKnown().isPresent) 1 else 0) +
            (if (logisticMasterRecordId.asKnown().isPresent) 1 else 0) +
            (logisticsSegments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (logisticsTransportationPlansRemarks.asKnown().getOrNull()?.sumOf {
                it.validity().toInt()
            } ?: 0) +
            (if (majcom.asKnown().isPresent) 1 else 0) +
            (if (missionChange.asKnown().isPresent) 1 else 0) +
            (if (numEnrouteStops.asKnown().isPresent) 1 else 0) +
            (if (numTransLoads.asKnown().isPresent) 1 else 0) +
            (if (originIcao.asKnown().isPresent) 1 else 0) +
            (if (planDefinition.asKnown().isPresent) 1 else 0) +
            (if (plansNumber.asKnown().isPresent) 1 else 0) +
            (if (serialNumber.asKnown().isPresent) 1 else 0) +
            (if (statusCode.asKnown().isPresent) 1 else 0) +
            (if (tpAircraftMds.asKnown().isPresent) 1 else 0) +
            (if (tpTailNumber.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogisticsTransportationPlansFull &&
            actDepTime == other.actDepTime &&
            aircraftStatus == other.aircraftStatus &&
            approxArrTime == other.approxArrTime &&
            cancelledDate == other.cancelledDate &&
            closedDate == other.closedDate &&
            coordinator == other.coordinator &&
            coordinatorUnit == other.coordinatorUnit &&
            destinationIcao == other.destinationIcao &&
            duration == other.duration &&
            estArrTime == other.estArrTime &&
            estDepTime == other.estDepTime &&
            lastChangedDate == other.lastChangedDate &&
            logisticMasterRecordId == other.logisticMasterRecordId &&
            logisticsSegments == other.logisticsSegments &&
            logisticsTransportationPlansRemarks == other.logisticsTransportationPlansRemarks &&
            majcom == other.majcom &&
            missionChange == other.missionChange &&
            numEnrouteStops == other.numEnrouteStops &&
            numTransLoads == other.numTransLoads &&
            originIcao == other.originIcao &&
            planDefinition == other.planDefinition &&
            plansNumber == other.plansNumber &&
            serialNumber == other.serialNumber &&
            statusCode == other.statusCode &&
            tpAircraftMds == other.tpAircraftMds &&
            tpTailNumber == other.tpTailNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actDepTime,
            aircraftStatus,
            approxArrTime,
            cancelledDate,
            closedDate,
            coordinator,
            coordinatorUnit,
            destinationIcao,
            duration,
            estArrTime,
            estDepTime,
            lastChangedDate,
            logisticMasterRecordId,
            logisticsSegments,
            logisticsTransportationPlansRemarks,
            majcom,
            missionChange,
            numEnrouteStops,
            numTransLoads,
            originIcao,
            planDefinition,
            plansNumber,
            serialNumber,
            statusCode,
            tpAircraftMds,
            tpTailNumber,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LogisticsTransportationPlansFull{actDepTime=$actDepTime, aircraftStatus=$aircraftStatus, approxArrTime=$approxArrTime, cancelledDate=$cancelledDate, closedDate=$closedDate, coordinator=$coordinator, coordinatorUnit=$coordinatorUnit, destinationIcao=$destinationIcao, duration=$duration, estArrTime=$estArrTime, estDepTime=$estDepTime, lastChangedDate=$lastChangedDate, logisticMasterRecordId=$logisticMasterRecordId, logisticsSegments=$logisticsSegments, logisticsTransportationPlansRemarks=$logisticsTransportationPlansRemarks, majcom=$majcom, missionChange=$missionChange, numEnrouteStops=$numEnrouteStops, numTransLoads=$numTransLoads, originIcao=$originIcao, planDefinition=$planDefinition, plansNumber=$plansNumber, serialNumber=$serialNumber, statusCode=$statusCode, tpAircraftMds=$tpAircraftMds, tpTailNumber=$tpTailNumber, additionalProperties=$additionalProperties}"
}

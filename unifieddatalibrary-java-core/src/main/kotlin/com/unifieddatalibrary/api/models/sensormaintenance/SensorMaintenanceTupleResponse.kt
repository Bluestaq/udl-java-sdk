// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensormaintenance

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

/** Maintenance schedule and operational status of Sensor. */
class SensorMaintenanceTupleResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val endTime: JsonField<OffsetDateTime>,
    private val siteCode: JsonField<String>,
    private val source: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val activity: JsonField<String>,
    private val approver: JsonField<String>,
    private val changer: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val duration: JsonField<String>,
    private val eowId: JsonField<String>,
    private val equipStatus: JsonField<String>,
    private val idSensor: JsonField<String>,
    private val impactedFaces: JsonField<String>,
    private val inactiveDate: JsonField<OffsetDateTime>,
    private val lineNumber: JsonField<String>,
    private val mdOpsCap: JsonField<String>,
    private val mwOpsCap: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val priority: JsonField<String>,
    private val recall: JsonField<String>,
    private val rel: JsonField<String>,
    private val remark: JsonField<String>,
    private val requestor: JsonField<String>,
    private val resource: JsonField<String>,
    private val rev: JsonField<String>,
    private val ssOpsCap: JsonField<String>,
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
        @JsonProperty("endTime")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("siteCode") @ExcludeMissing siteCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("activity") @ExcludeMissing activity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("approver") @ExcludeMissing approver: JsonField<String> = JsonMissing.of(),
        @JsonProperty("changer") @ExcludeMissing changer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eowId") @ExcludeMissing eowId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("equipStatus")
        @ExcludeMissing
        equipStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("impactedFaces")
        @ExcludeMissing
        impactedFaces: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inactiveDate")
        @ExcludeMissing
        inactiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lineNumber")
        @ExcludeMissing
        lineNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mdOpsCap") @ExcludeMissing mdOpsCap: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mwOpsCap") @ExcludeMissing mwOpsCap: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recall") @ExcludeMissing recall: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rel") @ExcludeMissing rel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remark") @ExcludeMissing remark: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requestor") @ExcludeMissing requestor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resource") @ExcludeMissing resource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rev") @ExcludeMissing rev: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ssOpsCap") @ExcludeMissing ssOpsCap: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        endTime,
        siteCode,
        source,
        startTime,
        id,
        activity,
        approver,
        changer,
        createdAt,
        createdBy,
        duration,
        eowId,
        equipStatus,
        idSensor,
        impactedFaces,
        inactiveDate,
        lineNumber,
        mdOpsCap,
        mwOpsCap,
        origin,
        origNetwork,
        priority,
        recall,
        rel,
        remark,
        requestor,
        resource,
        rev,
        ssOpsCap,
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
     * The planned outage end time in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endTime(): OffsetDateTime = endTime.getRequired("endTime")

    /**
     * The site to which this item applies. NOTE - this site code is COLT specific and may not
     * identically correspond to other UDL site IDs.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun siteCode(): String = siteCode.getRequired("siteCode")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The planned outage start time in ISO8601 UTC format.
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
     * Description of the activity taking place during this outage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun activity(): Optional<String> = activity.getOptional("activity")

    /**
     * The name of the approver.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun approver(): Optional<String> = approver.getOptional("approver")

    /**
     * The name of the changer, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun changer(): Optional<String> = changer.getOptional("changer")

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
     * The duration of the planned outage, expressed as ddd:hh:mm.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun duration(): Optional<String> = duration.getOptional("duration")

    /**
     * COLT EOWID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eowId(): Optional<String> = eowId.getOptional("eowId")

    /**
     * The mission capability status of the equipment (e.g. FMC, NMC, PMC, UNK, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun equipStatus(): Optional<String> = equipStatus.getOptional("equipStatus")

    /**
     * UUID of the sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

    /**
     * The sensor face(s) to which this COLT maintenance item applies, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun impactedFaces(): Optional<String> = impactedFaces.getOptional("impactedFaces")

    /**
     * The date that this item became inactive in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun inactiveDate(): Optional<OffsetDateTime> = inactiveDate.getOptional("inactiveDate")

    /**
     * The internal COLT line number assigned to this item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lineNumber(): Optional<String> = lineNumber.getOptional("lineNumber")

    /**
     * The Missile Defense operational capability of this maintenance item. Typical values are G, Y,
     * R, and - for non-applicable sites.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mdOpsCap(): Optional<String> = mdOpsCap.getOptional("mdOpsCap")

    /**
     * The Missile Warning operational capability of this maintenance item. Typical values are G, Y,
     * R, and - for non-applicable sites.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mwOpsCap(): Optional<String> = mwOpsCap.getOptional("mwOpsCap")

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
     * The priority of this maintenance item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun priority(): Optional<String> = priority.getOptional("priority")

    /**
     * The minimum time required to recall this activity, expressed as ddd:hh:mm.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun recall(): Optional<String> = recall.getOptional("recall")

    /**
     * Release.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rel(): Optional<String> = rel.getOptional("rel")

    /**
     * Remarks concerning this outage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun remark(): Optional<String> = remark.getOptional("remark")

    /**
     * The name of the requestor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun requestor(): Optional<String> = requestor.getOptional("requestor")

    /**
     * The name of the resource(s) affected by this maintenance item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun resource(): Optional<String> = resource.getOptional("resource")

    /**
     * The revision number for this maintenance item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rev(): Optional<String> = rev.getOptional("rev")

    /**
     * The Space Surveillance operational capability of this maintenance item. Typical values are G,
     * Y, R, and - for non-applicable sites.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ssOpsCap(): Optional<String> = ssOpsCap.getOptional("ssOpsCap")

    /**
     * Time the row was last updated in the database, auto-populated by the system.
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
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [siteCode].
     *
     * Unlike [siteCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("siteCode") @ExcludeMissing fun _siteCode(): JsonField<String> = siteCode

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
     * Returns the raw JSON value of [activity].
     *
     * Unlike [activity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activity") @ExcludeMissing fun _activity(): JsonField<String> = activity

    /**
     * Returns the raw JSON value of [approver].
     *
     * Unlike [approver], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approver") @ExcludeMissing fun _approver(): JsonField<String> = approver

    /**
     * Returns the raw JSON value of [changer].
     *
     * Unlike [changer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("changer") @ExcludeMissing fun _changer(): JsonField<String> = changer

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
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<String> = duration

    /**
     * Returns the raw JSON value of [eowId].
     *
     * Unlike [eowId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eowId") @ExcludeMissing fun _eowId(): JsonField<String> = eowId

    /**
     * Returns the raw JSON value of [equipStatus].
     *
     * Unlike [equipStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("equipStatus") @ExcludeMissing fun _equipStatus(): JsonField<String> = equipStatus

    /**
     * Returns the raw JSON value of [idSensor].
     *
     * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

    /**
     * Returns the raw JSON value of [impactedFaces].
     *
     * Unlike [impactedFaces], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impactedFaces")
    @ExcludeMissing
    fun _impactedFaces(): JsonField<String> = impactedFaces

    /**
     * Returns the raw JSON value of [inactiveDate].
     *
     * Unlike [inactiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inactiveDate")
    @ExcludeMissing
    fun _inactiveDate(): JsonField<OffsetDateTime> = inactiveDate

    /**
     * Returns the raw JSON value of [lineNumber].
     *
     * Unlike [lineNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lineNumber") @ExcludeMissing fun _lineNumber(): JsonField<String> = lineNumber

    /**
     * Returns the raw JSON value of [mdOpsCap].
     *
     * Unlike [mdOpsCap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mdOpsCap") @ExcludeMissing fun _mdOpsCap(): JsonField<String> = mdOpsCap

    /**
     * Returns the raw JSON value of [mwOpsCap].
     *
     * Unlike [mwOpsCap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mwOpsCap") @ExcludeMissing fun _mwOpsCap(): JsonField<String> = mwOpsCap

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
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<String> = priority

    /**
     * Returns the raw JSON value of [recall].
     *
     * Unlike [recall], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recall") @ExcludeMissing fun _recall(): JsonField<String> = recall

    /**
     * Returns the raw JSON value of [rel].
     *
     * Unlike [rel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rel") @ExcludeMissing fun _rel(): JsonField<String> = rel

    /**
     * Returns the raw JSON value of [remark].
     *
     * Unlike [remark], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remark") @ExcludeMissing fun _remark(): JsonField<String> = remark

    /**
     * Returns the raw JSON value of [requestor].
     *
     * Unlike [requestor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestor") @ExcludeMissing fun _requestor(): JsonField<String> = requestor

    /**
     * Returns the raw JSON value of [resource].
     *
     * Unlike [resource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource") @ExcludeMissing fun _resource(): JsonField<String> = resource

    /**
     * Returns the raw JSON value of [rev].
     *
     * Unlike [rev], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rev") @ExcludeMissing fun _rev(): JsonField<String> = rev

    /**
     * Returns the raw JSON value of [ssOpsCap].
     *
     * Unlike [ssOpsCap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ssOpsCap") @ExcludeMissing fun _ssOpsCap(): JsonField<String> = ssOpsCap

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
         * Returns a mutable builder for constructing an instance of
         * [SensorMaintenanceTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .endTime()
         * .siteCode()
         * .source()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SensorMaintenanceTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var endTime: JsonField<OffsetDateTime>? = null
        private var siteCode: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var activity: JsonField<String> = JsonMissing.of()
        private var approver: JsonField<String> = JsonMissing.of()
        private var changer: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var duration: JsonField<String> = JsonMissing.of()
        private var eowId: JsonField<String> = JsonMissing.of()
        private var equipStatus: JsonField<String> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var impactedFaces: JsonField<String> = JsonMissing.of()
        private var inactiveDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lineNumber: JsonField<String> = JsonMissing.of()
        private var mdOpsCap: JsonField<String> = JsonMissing.of()
        private var mwOpsCap: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var priority: JsonField<String> = JsonMissing.of()
        private var recall: JsonField<String> = JsonMissing.of()
        private var rel: JsonField<String> = JsonMissing.of()
        private var remark: JsonField<String> = JsonMissing.of()
        private var requestor: JsonField<String> = JsonMissing.of()
        private var resource: JsonField<String> = JsonMissing.of()
        private var rev: JsonField<String> = JsonMissing.of()
        private var ssOpsCap: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sensorMaintenanceTupleResponse: SensorMaintenanceTupleResponse) = apply {
            classificationMarking = sensorMaintenanceTupleResponse.classificationMarking
            dataMode = sensorMaintenanceTupleResponse.dataMode
            endTime = sensorMaintenanceTupleResponse.endTime
            siteCode = sensorMaintenanceTupleResponse.siteCode
            source = sensorMaintenanceTupleResponse.source
            startTime = sensorMaintenanceTupleResponse.startTime
            id = sensorMaintenanceTupleResponse.id
            activity = sensorMaintenanceTupleResponse.activity
            approver = sensorMaintenanceTupleResponse.approver
            changer = sensorMaintenanceTupleResponse.changer
            createdAt = sensorMaintenanceTupleResponse.createdAt
            createdBy = sensorMaintenanceTupleResponse.createdBy
            duration = sensorMaintenanceTupleResponse.duration
            eowId = sensorMaintenanceTupleResponse.eowId
            equipStatus = sensorMaintenanceTupleResponse.equipStatus
            idSensor = sensorMaintenanceTupleResponse.idSensor
            impactedFaces = sensorMaintenanceTupleResponse.impactedFaces
            inactiveDate = sensorMaintenanceTupleResponse.inactiveDate
            lineNumber = sensorMaintenanceTupleResponse.lineNumber
            mdOpsCap = sensorMaintenanceTupleResponse.mdOpsCap
            mwOpsCap = sensorMaintenanceTupleResponse.mwOpsCap
            origin = sensorMaintenanceTupleResponse.origin
            origNetwork = sensorMaintenanceTupleResponse.origNetwork
            priority = sensorMaintenanceTupleResponse.priority
            recall = sensorMaintenanceTupleResponse.recall
            rel = sensorMaintenanceTupleResponse.rel
            remark = sensorMaintenanceTupleResponse.remark
            requestor = sensorMaintenanceTupleResponse.requestor
            resource = sensorMaintenanceTupleResponse.resource
            rev = sensorMaintenanceTupleResponse.rev
            ssOpsCap = sensorMaintenanceTupleResponse.ssOpsCap
            updatedAt = sensorMaintenanceTupleResponse.updatedAt
            updatedBy = sensorMaintenanceTupleResponse.updatedBy
            additionalProperties =
                sensorMaintenanceTupleResponse.additionalProperties.toMutableMap()
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

        /** The planned outage end time in ISO8601 UTC format. */
        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        /**
         * The site to which this item applies. NOTE - this site code is COLT specific and may not
         * identically correspond to other UDL site IDs.
         */
        fun siteCode(siteCode: String) = siteCode(JsonField.of(siteCode))

        /**
         * Sets [Builder.siteCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.siteCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun siteCode(siteCode: JsonField<String>) = apply { this.siteCode = siteCode }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** The planned outage start time in ISO8601 UTC format. */
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

        /** Description of the activity taking place during this outage. */
        fun activity(activity: String) = activity(JsonField.of(activity))

        /**
         * Sets [Builder.activity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun activity(activity: JsonField<String>) = apply { this.activity = activity }

        /** The name of the approver. */
        fun approver(approver: String) = approver(JsonField.of(approver))

        /**
         * Sets [Builder.approver] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approver] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun approver(approver: JsonField<String>) = apply { this.approver = approver }

        /** The name of the changer, if applicable. */
        fun changer(changer: String) = changer(JsonField.of(changer))

        /**
         * Sets [Builder.changer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun changer(changer: JsonField<String>) = apply { this.changer = changer }

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

        /** The duration of the planned outage, expressed as ddd:hh:mm. */
        fun duration(duration: String) = duration(JsonField.of(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<String>) = apply { this.duration = duration }

        /** COLT EOWID. */
        fun eowId(eowId: String) = eowId(JsonField.of(eowId))

        /**
         * Sets [Builder.eowId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eowId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eowId(eowId: JsonField<String>) = apply { this.eowId = eowId }

        /** The mission capability status of the equipment (e.g. FMC, NMC, PMC, UNK, etc.). */
        fun equipStatus(equipStatus: String) = equipStatus(JsonField.of(equipStatus))

        /**
         * Sets [Builder.equipStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.equipStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun equipStatus(equipStatus: JsonField<String>) = apply { this.equipStatus = equipStatus }

        /** UUID of the sensor. */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

        /** The sensor face(s) to which this COLT maintenance item applies, if applicable. */
        fun impactedFaces(impactedFaces: String) = impactedFaces(JsonField.of(impactedFaces))

        /**
         * Sets [Builder.impactedFaces] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impactedFaces] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun impactedFaces(impactedFaces: JsonField<String>) = apply {
            this.impactedFaces = impactedFaces
        }

        /** The date that this item became inactive in ISO8601 UTC format. */
        fun inactiveDate(inactiveDate: OffsetDateTime) = inactiveDate(JsonField.of(inactiveDate))

        /**
         * Sets [Builder.inactiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inactiveDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inactiveDate(inactiveDate: JsonField<OffsetDateTime>) = apply {
            this.inactiveDate = inactiveDate
        }

        /** The internal COLT line number assigned to this item. */
        fun lineNumber(lineNumber: String) = lineNumber(JsonField.of(lineNumber))

        /**
         * Sets [Builder.lineNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lineNumber(lineNumber: JsonField<String>) = apply { this.lineNumber = lineNumber }

        /**
         * The Missile Defense operational capability of this maintenance item. Typical values are
         * G, Y, R, and - for non-applicable sites.
         */
        fun mdOpsCap(mdOpsCap: String) = mdOpsCap(JsonField.of(mdOpsCap))

        /**
         * Sets [Builder.mdOpsCap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mdOpsCap] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mdOpsCap(mdOpsCap: JsonField<String>) = apply { this.mdOpsCap = mdOpsCap }

        /**
         * The Missile Warning operational capability of this maintenance item. Typical values are
         * G, Y, R, and - for non-applicable sites.
         */
        fun mwOpsCap(mwOpsCap: String) = mwOpsCap(JsonField.of(mwOpsCap))

        /**
         * Sets [Builder.mwOpsCap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mwOpsCap] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mwOpsCap(mwOpsCap: JsonField<String>) = apply { this.mwOpsCap = mwOpsCap }

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

        /** The priority of this maintenance item. */
        fun priority(priority: String) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<String>) = apply { this.priority = priority }

        /** The minimum time required to recall this activity, expressed as ddd:hh:mm. */
        fun recall(recall: String) = recall(JsonField.of(recall))

        /**
         * Sets [Builder.recall] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recall] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun recall(recall: JsonField<String>) = apply { this.recall = recall }

        /** Release. */
        fun rel(rel: String) = rel(JsonField.of(rel))

        /**
         * Sets [Builder.rel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rel] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rel(rel: JsonField<String>) = apply { this.rel = rel }

        /** Remarks concerning this outage. */
        fun remark(remark: String) = remark(JsonField.of(remark))

        /**
         * Sets [Builder.remark] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remark] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun remark(remark: JsonField<String>) = apply { this.remark = remark }

        /** The name of the requestor. */
        fun requestor(requestor: String) = requestor(JsonField.of(requestor))

        /**
         * Sets [Builder.requestor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestor(requestor: JsonField<String>) = apply { this.requestor = requestor }

        /** The name of the resource(s) affected by this maintenance item. */
        fun resource(resource: String) = resource(JsonField.of(resource))

        /**
         * Sets [Builder.resource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resource] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun resource(resource: JsonField<String>) = apply { this.resource = resource }

        /** The revision number for this maintenance item. */
        fun rev(rev: String) = rev(JsonField.of(rev))

        /**
         * Sets [Builder.rev] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rev] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rev(rev: JsonField<String>) = apply { this.rev = rev }

        /**
         * The Space Surveillance operational capability of this maintenance item. Typical values
         * are G, Y, R, and - for non-applicable sites.
         */
        fun ssOpsCap(ssOpsCap: String) = ssOpsCap(JsonField.of(ssOpsCap))

        /**
         * Sets [Builder.ssOpsCap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ssOpsCap] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ssOpsCap(ssOpsCap: JsonField<String>) = apply { this.ssOpsCap = ssOpsCap }

        /** Time the row was last updated in the database, auto-populated by the system. */
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
         * Returns an immutable instance of [SensorMaintenanceTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .endTime()
         * .siteCode()
         * .source()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SensorMaintenanceTupleResponse =
            SensorMaintenanceTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("endTime", endTime),
                checkRequired("siteCode", siteCode),
                checkRequired("source", source),
                checkRequired("startTime", startTime),
                id,
                activity,
                approver,
                changer,
                createdAt,
                createdBy,
                duration,
                eowId,
                equipStatus,
                idSensor,
                impactedFaces,
                inactiveDate,
                lineNumber,
                mdOpsCap,
                mwOpsCap,
                origin,
                origNetwork,
                priority,
                recall,
                rel,
                remark,
                requestor,
                resource,
                rev,
                ssOpsCap,
                updatedAt,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SensorMaintenanceTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        endTime()
        siteCode()
        source()
        startTime()
        id()
        activity()
        approver()
        changer()
        createdAt()
        createdBy()
        duration()
        eowId()
        equipStatus()
        idSensor()
        impactedFaces()
        inactiveDate()
        lineNumber()
        mdOpsCap()
        mwOpsCap()
        origin()
        origNetwork()
        priority()
        recall()
        rel()
        remark()
        requestor()
        resource()
        rev()
        ssOpsCap()
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
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (siteCode.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (activity.asKnown().isPresent) 1 else 0) +
            (if (approver.asKnown().isPresent) 1 else 0) +
            (if (changer.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (duration.asKnown().isPresent) 1 else 0) +
            (if (eowId.asKnown().isPresent) 1 else 0) +
            (if (equipStatus.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (impactedFaces.asKnown().isPresent) 1 else 0) +
            (if (inactiveDate.asKnown().isPresent) 1 else 0) +
            (if (lineNumber.asKnown().isPresent) 1 else 0) +
            (if (mdOpsCap.asKnown().isPresent) 1 else 0) +
            (if (mwOpsCap.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (if (recall.asKnown().isPresent) 1 else 0) +
            (if (rel.asKnown().isPresent) 1 else 0) +
            (if (remark.asKnown().isPresent) 1 else 0) +
            (if (requestor.asKnown().isPresent) 1 else 0) +
            (if (resource.asKnown().isPresent) 1 else 0) +
            (if (rev.asKnown().isPresent) 1 else 0) +
            (if (ssOpsCap.asKnown().isPresent) 1 else 0) +
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SensorMaintenanceTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            endTime == other.endTime &&
            siteCode == other.siteCode &&
            source == other.source &&
            startTime == other.startTime &&
            id == other.id &&
            activity == other.activity &&
            approver == other.approver &&
            changer == other.changer &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            duration == other.duration &&
            eowId == other.eowId &&
            equipStatus == other.equipStatus &&
            idSensor == other.idSensor &&
            impactedFaces == other.impactedFaces &&
            inactiveDate == other.inactiveDate &&
            lineNumber == other.lineNumber &&
            mdOpsCap == other.mdOpsCap &&
            mwOpsCap == other.mwOpsCap &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            priority == other.priority &&
            recall == other.recall &&
            rel == other.rel &&
            remark == other.remark &&
            requestor == other.requestor &&
            resource == other.resource &&
            rev == other.rev &&
            ssOpsCap == other.ssOpsCap &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            endTime,
            siteCode,
            source,
            startTime,
            id,
            activity,
            approver,
            changer,
            createdAt,
            createdBy,
            duration,
            eowId,
            equipStatus,
            idSensor,
            impactedFaces,
            inactiveDate,
            lineNumber,
            mdOpsCap,
            mwOpsCap,
            origin,
            origNetwork,
            priority,
            recall,
            rel,
            remark,
            requestor,
            resource,
            rev,
            ssOpsCap,
            updatedAt,
            updatedBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SensorMaintenanceTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, endTime=$endTime, siteCode=$siteCode, source=$source, startTime=$startTime, id=$id, activity=$activity, approver=$approver, changer=$changer, createdAt=$createdAt, createdBy=$createdBy, duration=$duration, eowId=$eowId, equipStatus=$equipStatus, idSensor=$idSensor, impactedFaces=$impactedFaces, inactiveDate=$inactiveDate, lineNumber=$lineNumber, mdOpsCap=$mdOpsCap, mwOpsCap=$mwOpsCap, origin=$origin, origNetwork=$origNetwork, priority=$priority, recall=$recall, rel=$rel, remark=$remark, requestor=$requestor, resource=$resource, rev=$rev, ssOpsCap=$ssOpsCap, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

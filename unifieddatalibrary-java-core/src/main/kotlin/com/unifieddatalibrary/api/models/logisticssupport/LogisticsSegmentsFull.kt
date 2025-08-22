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
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Remarks associated with this LogisticsSupport record. */
class LogisticsSegmentsFull
private constructor(
    private val arrivalIcao: JsonField<String>,
    private val departureIcao: JsonField<String>,
    private val extMissionId: JsonField<String>,
    private val idMission: JsonField<String>,
    private val itin: JsonField<Int>,
    private val missionNumber: JsonField<String>,
    private val missionType: JsonField<String>,
    private val modeCode: JsonField<String>,
    private val segActArrTime: JsonField<OffsetDateTime>,
    private val segActDepTime: JsonField<OffsetDateTime>,
    private val segAircraftMds: JsonField<String>,
    private val segEstArrTime: JsonField<OffsetDateTime>,
    private val segEstDepTime: JsonField<OffsetDateTime>,
    private val segmentNumber: JsonField<Int>,
    private val segTailNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("arrivalICAO")
        @ExcludeMissing
        arrivalIcao: JsonField<String> = JsonMissing.of(),
        @JsonProperty("departureICAO")
        @ExcludeMissing
        departureIcao: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extMissionId")
        @ExcludeMissing
        extMissionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idMission") @ExcludeMissing idMission: JsonField<String> = JsonMissing.of(),
        @JsonProperty("itin") @ExcludeMissing itin: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("missionNumber")
        @ExcludeMissing
        missionNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("missionType")
        @ExcludeMissing
        missionType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modeCode") @ExcludeMissing modeCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("segActArrTime")
        @ExcludeMissing
        segActArrTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("segActDepTime")
        @ExcludeMissing
        segActDepTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("segAircraftMDS")
        @ExcludeMissing
        segAircraftMds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("segEstArrTime")
        @ExcludeMissing
        segEstArrTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("segEstDepTime")
        @ExcludeMissing
        segEstDepTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("segmentNumber")
        @ExcludeMissing
        segmentNumber: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("segTailNumber")
        @ExcludeMissing
        segTailNumber: JsonField<String> = JsonMissing.of(),
    ) : this(
        arrivalIcao,
        departureIcao,
        extMissionId,
        idMission,
        itin,
        missionNumber,
        missionType,
        modeCode,
        segActArrTime,
        segActDepTime,
        segAircraftMds,
        segEstArrTime,
        segEstDepTime,
        segmentNumber,
        segTailNumber,
        mutableMapOf(),
    )

    /**
     * Airport ICAO arrival code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arrivalIcao(): Optional<String> = arrivalIcao.getOptional("arrivalICAO")

    /**
     * Airport ICAO departure code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun departureIcao(): Optional<String> = departureIcao.getOptional("departureICAO")

    /**
     * The GDSS mission ID for this segment.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun extMissionId(): Optional<String> = extMissionId.getOptional("extMissionId")

    /**
     * The unique identifier of the mission to which this logistics record is assigned.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idMission(): Optional<String> = idMission.getOptional("idMission")

    /**
     * Start air mission itinerary point identifier.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun itin(): Optional<Int> = itin.getOptional("itin")

    /**
     * The user generated identifier for an air mission subgroup.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun missionNumber(): Optional<String> = missionNumber.getOptional("missionNumber")

    /**
     * The type of mission (e.g. SAAM, CHNL, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun missionType(): Optional<String> = missionType.getOptional("missionType")

    /**
     * Transportation mode. AMC airlift, Commercial airlift, Other, or surface transportation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun modeCode(): Optional<String> = modeCode.getOptional("modeCode")

    /**
     * Actual arrival time to segment destination, in ISO 8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun segActArrTime(): Optional<OffsetDateTime> = segActArrTime.getOptional("segActArrTime")

    /**
     * Actual departure time to the segment destination, in ISO 8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun segActDepTime(): Optional<OffsetDateTime> = segActDepTime.getOptional("segActDepTime")

    /**
     * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE, KC-130
     * HERCULES, etc.) of this aircraft. Intended as, but not constrained to, MIL-STD-6016
     * environment dependent specific type designations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun segAircraftMds(): Optional<String> = segAircraftMds.getOptional("segAircraftMDS")

    /**
     * GC. LGTPS_C_DT_EST_ARR. GD2: Estimated arrival time to the segment destination. Only supplied
     * when the segment is not attached to a Mission, otherwise the ETA is derived from the Mission
     * segment destination point. This datetime should be in ISO 8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun segEstArrTime(): Optional<OffsetDateTime> = segEstArrTime.getOptional("segEstArrTime")

    /**
     * GC. LGTPS_C_DT_EST_DEP. GD2: Estimated departure time from the segment origin. Only supplied
     * when the segment is not attached to a Mission, otherwise the ETD is derived from the Mission
     * segment origin point. This datetime should be in ISO 8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun segEstDepTime(): Optional<OffsetDateTime> = segEstDepTime.getOptional("segEstDepTime")

    /**
     * Used to sequence the segments in the transportation plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun segmentNumber(): Optional<Int> = segmentNumber.getOptional("segmentNumber")

    /**
     * The identifier that represents a specific aircraft within an aircraft type.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun segTailNumber(): Optional<String> = segTailNumber.getOptional("segTailNumber")

    /**
     * Returns the raw JSON value of [arrivalIcao].
     *
     * Unlike [arrivalIcao], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arrivalICAO") @ExcludeMissing fun _arrivalIcao(): JsonField<String> = arrivalIcao

    /**
     * Returns the raw JSON value of [departureIcao].
     *
     * Unlike [departureIcao], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("departureICAO")
    @ExcludeMissing
    fun _departureIcao(): JsonField<String> = departureIcao

    /**
     * Returns the raw JSON value of [extMissionId].
     *
     * Unlike [extMissionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extMissionId")
    @ExcludeMissing
    fun _extMissionId(): JsonField<String> = extMissionId

    /**
     * Returns the raw JSON value of [idMission].
     *
     * Unlike [idMission], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idMission") @ExcludeMissing fun _idMission(): JsonField<String> = idMission

    /**
     * Returns the raw JSON value of [itin].
     *
     * Unlike [itin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("itin") @ExcludeMissing fun _itin(): JsonField<Int> = itin

    /**
     * Returns the raw JSON value of [missionNumber].
     *
     * Unlike [missionNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("missionNumber")
    @ExcludeMissing
    fun _missionNumber(): JsonField<String> = missionNumber

    /**
     * Returns the raw JSON value of [missionType].
     *
     * Unlike [missionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("missionType") @ExcludeMissing fun _missionType(): JsonField<String> = missionType

    /**
     * Returns the raw JSON value of [modeCode].
     *
     * Unlike [modeCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modeCode") @ExcludeMissing fun _modeCode(): JsonField<String> = modeCode

    /**
     * Returns the raw JSON value of [segActArrTime].
     *
     * Unlike [segActArrTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segActArrTime")
    @ExcludeMissing
    fun _segActArrTime(): JsonField<OffsetDateTime> = segActArrTime

    /**
     * Returns the raw JSON value of [segActDepTime].
     *
     * Unlike [segActDepTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segActDepTime")
    @ExcludeMissing
    fun _segActDepTime(): JsonField<OffsetDateTime> = segActDepTime

    /**
     * Returns the raw JSON value of [segAircraftMds].
     *
     * Unlike [segAircraftMds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segAircraftMDS")
    @ExcludeMissing
    fun _segAircraftMds(): JsonField<String> = segAircraftMds

    /**
     * Returns the raw JSON value of [segEstArrTime].
     *
     * Unlike [segEstArrTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segEstArrTime")
    @ExcludeMissing
    fun _segEstArrTime(): JsonField<OffsetDateTime> = segEstArrTime

    /**
     * Returns the raw JSON value of [segEstDepTime].
     *
     * Unlike [segEstDepTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segEstDepTime")
    @ExcludeMissing
    fun _segEstDepTime(): JsonField<OffsetDateTime> = segEstDepTime

    /**
     * Returns the raw JSON value of [segmentNumber].
     *
     * Unlike [segmentNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segmentNumber")
    @ExcludeMissing
    fun _segmentNumber(): JsonField<Int> = segmentNumber

    /**
     * Returns the raw JSON value of [segTailNumber].
     *
     * Unlike [segTailNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segTailNumber")
    @ExcludeMissing
    fun _segTailNumber(): JsonField<String> = segTailNumber

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

        /** Returns a mutable builder for constructing an instance of [LogisticsSegmentsFull]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogisticsSegmentsFull]. */
    class Builder internal constructor() {

        private var arrivalIcao: JsonField<String> = JsonMissing.of()
        private var departureIcao: JsonField<String> = JsonMissing.of()
        private var extMissionId: JsonField<String> = JsonMissing.of()
        private var idMission: JsonField<String> = JsonMissing.of()
        private var itin: JsonField<Int> = JsonMissing.of()
        private var missionNumber: JsonField<String> = JsonMissing.of()
        private var missionType: JsonField<String> = JsonMissing.of()
        private var modeCode: JsonField<String> = JsonMissing.of()
        private var segActArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var segActDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var segAircraftMds: JsonField<String> = JsonMissing.of()
        private var segEstArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var segEstDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var segmentNumber: JsonField<Int> = JsonMissing.of()
        private var segTailNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logisticsSegmentsFull: LogisticsSegmentsFull) = apply {
            arrivalIcao = logisticsSegmentsFull.arrivalIcao
            departureIcao = logisticsSegmentsFull.departureIcao
            extMissionId = logisticsSegmentsFull.extMissionId
            idMission = logisticsSegmentsFull.idMission
            itin = logisticsSegmentsFull.itin
            missionNumber = logisticsSegmentsFull.missionNumber
            missionType = logisticsSegmentsFull.missionType
            modeCode = logisticsSegmentsFull.modeCode
            segActArrTime = logisticsSegmentsFull.segActArrTime
            segActDepTime = logisticsSegmentsFull.segActDepTime
            segAircraftMds = logisticsSegmentsFull.segAircraftMds
            segEstArrTime = logisticsSegmentsFull.segEstArrTime
            segEstDepTime = logisticsSegmentsFull.segEstDepTime
            segmentNumber = logisticsSegmentsFull.segmentNumber
            segTailNumber = logisticsSegmentsFull.segTailNumber
            additionalProperties = logisticsSegmentsFull.additionalProperties.toMutableMap()
        }

        /** Airport ICAO arrival code. */
        fun arrivalIcao(arrivalIcao: String) = arrivalIcao(JsonField.of(arrivalIcao))

        /**
         * Sets [Builder.arrivalIcao] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrivalIcao] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun arrivalIcao(arrivalIcao: JsonField<String>) = apply { this.arrivalIcao = arrivalIcao }

        /** Airport ICAO departure code. */
        fun departureIcao(departureIcao: String) = departureIcao(JsonField.of(departureIcao))

        /**
         * Sets [Builder.departureIcao] to an arbitrary JSON value.
         *
         * You should usually call [Builder.departureIcao] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun departureIcao(departureIcao: JsonField<String>) = apply {
            this.departureIcao = departureIcao
        }

        /** The GDSS mission ID for this segment. */
        fun extMissionId(extMissionId: String) = extMissionId(JsonField.of(extMissionId))

        /**
         * Sets [Builder.extMissionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extMissionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extMissionId(extMissionId: JsonField<String>) = apply {
            this.extMissionId = extMissionId
        }

        /** The unique identifier of the mission to which this logistics record is assigned. */
        fun idMission(idMission: String) = idMission(JsonField.of(idMission))

        /**
         * Sets [Builder.idMission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idMission] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idMission(idMission: JsonField<String>) = apply { this.idMission = idMission }

        /** Start air mission itinerary point identifier. */
        fun itin(itin: Int) = itin(JsonField.of(itin))

        /**
         * Sets [Builder.itin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.itin] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun itin(itin: JsonField<Int>) = apply { this.itin = itin }

        /** The user generated identifier for an air mission subgroup. */
        fun missionNumber(missionNumber: String) = missionNumber(JsonField.of(missionNumber))

        /**
         * Sets [Builder.missionNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missionNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun missionNumber(missionNumber: JsonField<String>) = apply {
            this.missionNumber = missionNumber
        }

        /** The type of mission (e.g. SAAM, CHNL, etc.). */
        fun missionType(missionType: String) = missionType(JsonField.of(missionType))

        /**
         * Sets [Builder.missionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missionType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun missionType(missionType: JsonField<String>) = apply { this.missionType = missionType }

        /**
         * Transportation mode. AMC airlift, Commercial airlift, Other, or surface transportation.
         */
        fun modeCode(modeCode: String) = modeCode(JsonField.of(modeCode))

        /**
         * Sets [Builder.modeCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modeCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modeCode(modeCode: JsonField<String>) = apply { this.modeCode = modeCode }

        /**
         * Actual arrival time to segment destination, in ISO 8601 UTC format with millisecond
         * precision.
         */
        fun segActArrTime(segActArrTime: OffsetDateTime) =
            segActArrTime(JsonField.of(segActArrTime))

        /**
         * Sets [Builder.segActArrTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segActArrTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun segActArrTime(segActArrTime: JsonField<OffsetDateTime>) = apply {
            this.segActArrTime = segActArrTime
        }

        /**
         * Actual departure time to the segment destination, in ISO 8601 UTC format with millisecond
         * precision.
         */
        fun segActDepTime(segActDepTime: OffsetDateTime) =
            segActDepTime(JsonField.of(segActDepTime))

        /**
         * Sets [Builder.segActDepTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segActDepTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun segActDepTime(segActDepTime: JsonField<OffsetDateTime>) = apply {
            this.segActDepTime = segActDepTime
        }

        /**
         * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE, KC-130
         * HERCULES, etc.) of this aircraft. Intended as, but not constrained to, MIL-STD-6016
         * environment dependent specific type designations.
         */
        fun segAircraftMds(segAircraftMds: String) = segAircraftMds(JsonField.of(segAircraftMds))

        /**
         * Sets [Builder.segAircraftMds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segAircraftMds] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun segAircraftMds(segAircraftMds: JsonField<String>) = apply {
            this.segAircraftMds = segAircraftMds
        }

        /**
         * GC. LGTPS_C_DT_EST_ARR. GD2: Estimated arrival time to the segment destination. Only
         * supplied when the segment is not attached to a Mission, otherwise the ETA is derived from
         * the Mission segment destination point. This datetime should be in ISO 8601 UTC format
         * with millisecond precision.
         */
        fun segEstArrTime(segEstArrTime: OffsetDateTime) =
            segEstArrTime(JsonField.of(segEstArrTime))

        /**
         * Sets [Builder.segEstArrTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segEstArrTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun segEstArrTime(segEstArrTime: JsonField<OffsetDateTime>) = apply {
            this.segEstArrTime = segEstArrTime
        }

        /**
         * GC. LGTPS_C_DT_EST_DEP. GD2: Estimated departure time from the segment origin. Only
         * supplied when the segment is not attached to a Mission, otherwise the ETD is derived from
         * the Mission segment origin point. This datetime should be in ISO 8601 UTC format with
         * millisecond precision.
         */
        fun segEstDepTime(segEstDepTime: OffsetDateTime) =
            segEstDepTime(JsonField.of(segEstDepTime))

        /**
         * Sets [Builder.segEstDepTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segEstDepTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun segEstDepTime(segEstDepTime: JsonField<OffsetDateTime>) = apply {
            this.segEstDepTime = segEstDepTime
        }

        /** Used to sequence the segments in the transportation plan. */
        fun segmentNumber(segmentNumber: Int) = segmentNumber(JsonField.of(segmentNumber))

        /**
         * Sets [Builder.segmentNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segmentNumber] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun segmentNumber(segmentNumber: JsonField<Int>) = apply {
            this.segmentNumber = segmentNumber
        }

        /** The identifier that represents a specific aircraft within an aircraft type. */
        fun segTailNumber(segTailNumber: String) = segTailNumber(JsonField.of(segTailNumber))

        /**
         * Sets [Builder.segTailNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segTailNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun segTailNumber(segTailNumber: JsonField<String>) = apply {
            this.segTailNumber = segTailNumber
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
         * Returns an immutable instance of [LogisticsSegmentsFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogisticsSegmentsFull =
            LogisticsSegmentsFull(
                arrivalIcao,
                departureIcao,
                extMissionId,
                idMission,
                itin,
                missionNumber,
                missionType,
                modeCode,
                segActArrTime,
                segActDepTime,
                segAircraftMds,
                segEstArrTime,
                segEstDepTime,
                segmentNumber,
                segTailNumber,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogisticsSegmentsFull = apply {
        if (validated) {
            return@apply
        }

        arrivalIcao()
        departureIcao()
        extMissionId()
        idMission()
        itin()
        missionNumber()
        missionType()
        modeCode()
        segActArrTime()
        segActDepTime()
        segAircraftMds()
        segEstArrTime()
        segEstDepTime()
        segmentNumber()
        segTailNumber()
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
        (if (arrivalIcao.asKnown().isPresent) 1 else 0) +
            (if (departureIcao.asKnown().isPresent) 1 else 0) +
            (if (extMissionId.asKnown().isPresent) 1 else 0) +
            (if (idMission.asKnown().isPresent) 1 else 0) +
            (if (itin.asKnown().isPresent) 1 else 0) +
            (if (missionNumber.asKnown().isPresent) 1 else 0) +
            (if (missionType.asKnown().isPresent) 1 else 0) +
            (if (modeCode.asKnown().isPresent) 1 else 0) +
            (if (segActArrTime.asKnown().isPresent) 1 else 0) +
            (if (segActDepTime.asKnown().isPresent) 1 else 0) +
            (if (segAircraftMds.asKnown().isPresent) 1 else 0) +
            (if (segEstArrTime.asKnown().isPresent) 1 else 0) +
            (if (segEstDepTime.asKnown().isPresent) 1 else 0) +
            (if (segmentNumber.asKnown().isPresent) 1 else 0) +
            (if (segTailNumber.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogisticsSegmentsFull &&
            arrivalIcao == other.arrivalIcao &&
            departureIcao == other.departureIcao &&
            extMissionId == other.extMissionId &&
            idMission == other.idMission &&
            itin == other.itin &&
            missionNumber == other.missionNumber &&
            missionType == other.missionType &&
            modeCode == other.modeCode &&
            segActArrTime == other.segActArrTime &&
            segActDepTime == other.segActDepTime &&
            segAircraftMds == other.segAircraftMds &&
            segEstArrTime == other.segEstArrTime &&
            segEstDepTime == other.segEstDepTime &&
            segmentNumber == other.segmentNumber &&
            segTailNumber == other.segTailNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            arrivalIcao,
            departureIcao,
            extMissionId,
            idMission,
            itin,
            missionNumber,
            missionType,
            modeCode,
            segActArrTime,
            segActDepTime,
            segAircraftMds,
            segEstArrTime,
            segEstDepTime,
            segmentNumber,
            segTailNumber,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LogisticsSegmentsFull{arrivalIcao=$arrivalIcao, departureIcao=$departureIcao, extMissionId=$extMissionId, idMission=$idMission, itin=$itin, missionNumber=$missionNumber, missionType=$missionType, modeCode=$modeCode, segActArrTime=$segActArrTime, segActDepTime=$segActDepTime, segAircraftMds=$segAircraftMds, segEstArrTime=$segEstArrTime, segEstDepTime=$segEstDepTime, segmentNumber=$segmentNumber, segTailNumber=$segTailNumber, additionalProperties=$additionalProperties}"
}

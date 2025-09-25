// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus.history

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

/** Captures link status. */
class HistoryListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val endPoint1Lat: JsonField<Double>,
    private val endPoint1Lon: JsonField<Double>,
    private val endPoint1Name: JsonField<String>,
    private val endPoint2Lat: JsonField<Double>,
    private val endPoint2Lon: JsonField<Double>,
    private val endPoint2Name: JsonField<String>,
    private val linkName: JsonField<String>,
    private val linkStartTime: JsonField<OffsetDateTime>,
    private val linkStopTime: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val band: JsonField<String>,
    private val constellation: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val dataRate1To2: JsonField<Double>,
    private val dataRate2To1: JsonField<Double>,
    private val idBeam1: JsonField<String>,
    private val idBeam2: JsonField<String>,
    private val idOnOrbit1: JsonField<String>,
    private val idOnOrbit2: JsonField<String>,
    private val linkState: JsonField<String>,
    private val linkType: JsonField<String>,
    private val opsCap: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val satNo1: JsonField<Int>,
    private val satNo2: JsonField<Int>,
    private val snr: JsonField<Double>,
    private val sysCap: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("endPoint1Lat")
        @ExcludeMissing
        endPoint1Lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("endPoint1Lon")
        @ExcludeMissing
        endPoint1Lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("endPoint1Name")
        @ExcludeMissing
        endPoint1Name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endPoint2Lat")
        @ExcludeMissing
        endPoint2Lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("endPoint2Lon")
        @ExcludeMissing
        endPoint2Lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("endPoint2Name")
        @ExcludeMissing
        endPoint2Name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("linkName") @ExcludeMissing linkName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("linkStartTime")
        @ExcludeMissing
        linkStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("linkStopTime")
        @ExcludeMissing
        linkStopTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("band") @ExcludeMissing band: JsonField<String> = JsonMissing.of(),
        @JsonProperty("constellation")
        @ExcludeMissing
        constellation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataRate1To2")
        @ExcludeMissing
        dataRate1To2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dataRate2To1")
        @ExcludeMissing
        dataRate2To1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idBeam1") @ExcludeMissing idBeam1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idBeam2") @ExcludeMissing idBeam2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOnOrbit1")
        @ExcludeMissing
        idOnOrbit1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOnOrbit2")
        @ExcludeMissing
        idOnOrbit2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("linkState") @ExcludeMissing linkState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("linkType") @ExcludeMissing linkType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opsCap") @ExcludeMissing opsCap: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satNo1") @ExcludeMissing satNo1: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("satNo2") @ExcludeMissing satNo2: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("snr") @ExcludeMissing snr: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sysCap") @ExcludeMissing sysCap: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        endPoint1Lat,
        endPoint1Lon,
        endPoint1Name,
        endPoint2Lat,
        endPoint2Lon,
        endPoint2Name,
        linkName,
        linkStartTime,
        linkStopTime,
        source,
        id,
        band,
        constellation,
        createdAt,
        createdBy,
        dataRate1To2,
        dataRate2To1,
        idBeam1,
        idBeam2,
        idOnOrbit1,
        idOnOrbit2,
        linkState,
        linkType,
        opsCap,
        origin,
        origNetwork,
        satNo1,
        satNo2,
        snr,
        sysCap,
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
     * Latitude of link endpoint-1, WGS-84 in degrees. -90 to 90 degrees (negative values south of
     * equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endPoint1Lat(): Double = endPoint1Lat.getRequired("endPoint1Lat")

    /**
     * Longitude of link endpoint-1, WGS-84 longitude in degrees. -180 to 180 degrees (negative
     * values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endPoint1Lon(): Double = endPoint1Lon.getRequired("endPoint1Lon")

    /**
     * The name or description of link endpoint-1, corresponding to beam-1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endPoint1Name(): String = endPoint1Name.getRequired("endPoint1Name")

    /**
     * Latitude of link endpoint-2, WGS-84 in degrees. -90 to 90 degrees (negative values south of
     * equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endPoint2Lat(): Double = endPoint2Lat.getRequired("endPoint2Lat")

    /**
     * Longitude of link endpoint-2, WGS-84 longitude in degrees. -180 to 180 degrees (negative
     * values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endPoint2Lon(): Double = endPoint2Lon.getRequired("endPoint2Lon")

    /**
     * The name or description of link endpoint-2, corresponding to beam-2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endPoint2Name(): String = endPoint2Name.getRequired("endPoint2Name")

    /**
     * The name or description of the link.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun linkName(): String = linkName.getRequired("linkName")

    /**
     * The link establishment time, or the time that the link becomes available for use, in ISO8601
     * UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun linkStartTime(): OffsetDateTime = linkStartTime.getRequired("linkStartTime")

    /**
     * The link termination time, or the time that the link becomes unavailable for use, in ISO8601
     * UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun linkStopTime(): OffsetDateTime = linkStopTime.getRequired("linkStopTime")

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
     * The RF band employed by the link (e.g. MIL-KA, COM-KA, X-BAND, C-BAND, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun band(): Optional<String> = band.getOptional("band")

    /**
     * The constellation name if the link is established over a LEO/MEO constellation. In this case,
     * idOnOrbit1 and idOnOrbit2 will be null.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun constellation(): Optional<String> = constellation.getOptional("constellation")

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
     * The endpoint-1 to endpoint-2 data rate, in kbps.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dataRate1To2(): Optional<Double> = dataRate1To2.getOptional("dataRate1To2")

    /**
     * The endpoint-2 to endpoint-1 data rate, in kbps.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dataRate2To1(): Optional<Double> = dataRate2To1.getOptional("dataRate2To1")

    /**
     * The ID of beam-1 forming the link. In the case of two sat link, beam-1 corresponds to Sat-1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idBeam1(): Optional<String> = idBeam1.getOptional("idBeam1")

    /**
     * The ID of beam-2 forming the link. In the case of two sat link, beam-2 corresponds to Sat-2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idBeam2(): Optional<String> = idBeam2.getOptional("idBeam2")

    /**
     * Unique ID of the on-orbit satellite (Sat-1) forming the link. A null value for idOnOrbit1
     * indicates that the link is formed over a LEO/MEO constellation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit1(): Optional<String> = idOnOrbit1.getOptional("idOnOrbit1")

    /**
     * Unique ID of the on-orbit satellite (Sat-2) forming the link. A null value for idOnOrbit2
     * indicates either a link employing only Sat-1 or a link formed over a LEO/MEO constellation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit2(): Optional<String> = idOnOrbit2.getOptional("idOnOrbit2")

    /**
     * The state of the link (e.g. OK, DEGRADED-WEATHER, DEGRADED-EMI, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun linkState(): Optional<String> = linkState.getOptional("linkState")

    /**
     * The type of the link.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun linkType(): Optional<String> = linkType.getOptional("linkType")

    /**
     * The OPSCAP mission status of the system(s) forming the link.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opsCap(): Optional<String> = opsCap.getOptional("opsCap")

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
     * Satellite/catalog number of the target on-orbit primary object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo1(): Optional<Int> = satNo1.getOptional("satNo1")

    /**
     * Satellite/catalog number of the target on-orbit secondary object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo2(): Optional<Int> = satNo2.getOptional("satNo2")

    /**
     * Signal to noise ratio, in dB.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun snr(): Optional<Double> = snr.getOptional("snr")

    /**
     * The SYSCAP mission status of the system(s) forming the link.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sysCap(): Optional<String> = sysCap.getOptional("sysCap")

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
     * Returns the raw JSON value of [endPoint1Lat].
     *
     * Unlike [endPoint1Lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endPoint1Lat")
    @ExcludeMissing
    fun _endPoint1Lat(): JsonField<Double> = endPoint1Lat

    /**
     * Returns the raw JSON value of [endPoint1Lon].
     *
     * Unlike [endPoint1Lon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endPoint1Lon")
    @ExcludeMissing
    fun _endPoint1Lon(): JsonField<Double> = endPoint1Lon

    /**
     * Returns the raw JSON value of [endPoint1Name].
     *
     * Unlike [endPoint1Name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endPoint1Name")
    @ExcludeMissing
    fun _endPoint1Name(): JsonField<String> = endPoint1Name

    /**
     * Returns the raw JSON value of [endPoint2Lat].
     *
     * Unlike [endPoint2Lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endPoint2Lat")
    @ExcludeMissing
    fun _endPoint2Lat(): JsonField<Double> = endPoint2Lat

    /**
     * Returns the raw JSON value of [endPoint2Lon].
     *
     * Unlike [endPoint2Lon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endPoint2Lon")
    @ExcludeMissing
    fun _endPoint2Lon(): JsonField<Double> = endPoint2Lon

    /**
     * Returns the raw JSON value of [endPoint2Name].
     *
     * Unlike [endPoint2Name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endPoint2Name")
    @ExcludeMissing
    fun _endPoint2Name(): JsonField<String> = endPoint2Name

    /**
     * Returns the raw JSON value of [linkName].
     *
     * Unlike [linkName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linkName") @ExcludeMissing fun _linkName(): JsonField<String> = linkName

    /**
     * Returns the raw JSON value of [linkStartTime].
     *
     * Unlike [linkStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linkStartTime")
    @ExcludeMissing
    fun _linkStartTime(): JsonField<OffsetDateTime> = linkStartTime

    /**
     * Returns the raw JSON value of [linkStopTime].
     *
     * Unlike [linkStopTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linkStopTime")
    @ExcludeMissing
    fun _linkStopTime(): JsonField<OffsetDateTime> = linkStopTime

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
     * Returns the raw JSON value of [band].
     *
     * Unlike [band], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("band") @ExcludeMissing fun _band(): JsonField<String> = band

    /**
     * Returns the raw JSON value of [constellation].
     *
     * Unlike [constellation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("constellation")
    @ExcludeMissing
    fun _constellation(): JsonField<String> = constellation

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
     * Returns the raw JSON value of [dataRate1To2].
     *
     * Unlike [dataRate1To2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataRate1To2")
    @ExcludeMissing
    fun _dataRate1To2(): JsonField<Double> = dataRate1To2

    /**
     * Returns the raw JSON value of [dataRate2To1].
     *
     * Unlike [dataRate2To1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataRate2To1")
    @ExcludeMissing
    fun _dataRate2To1(): JsonField<Double> = dataRate2To1

    /**
     * Returns the raw JSON value of [idBeam1].
     *
     * Unlike [idBeam1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idBeam1") @ExcludeMissing fun _idBeam1(): JsonField<String> = idBeam1

    /**
     * Returns the raw JSON value of [idBeam2].
     *
     * Unlike [idBeam2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idBeam2") @ExcludeMissing fun _idBeam2(): JsonField<String> = idBeam2

    /**
     * Returns the raw JSON value of [idOnOrbit1].
     *
     * Unlike [idOnOrbit1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit1") @ExcludeMissing fun _idOnOrbit1(): JsonField<String> = idOnOrbit1

    /**
     * Returns the raw JSON value of [idOnOrbit2].
     *
     * Unlike [idOnOrbit2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit2") @ExcludeMissing fun _idOnOrbit2(): JsonField<String> = idOnOrbit2

    /**
     * Returns the raw JSON value of [linkState].
     *
     * Unlike [linkState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linkState") @ExcludeMissing fun _linkState(): JsonField<String> = linkState

    /**
     * Returns the raw JSON value of [linkType].
     *
     * Unlike [linkType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linkType") @ExcludeMissing fun _linkType(): JsonField<String> = linkType

    /**
     * Returns the raw JSON value of [opsCap].
     *
     * Unlike [opsCap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opsCap") @ExcludeMissing fun _opsCap(): JsonField<String> = opsCap

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
     * Returns the raw JSON value of [satNo1].
     *
     * Unlike [satNo1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo1") @ExcludeMissing fun _satNo1(): JsonField<Int> = satNo1

    /**
     * Returns the raw JSON value of [satNo2].
     *
     * Unlike [satNo2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo2") @ExcludeMissing fun _satNo2(): JsonField<Int> = satNo2

    /**
     * Returns the raw JSON value of [snr].
     *
     * Unlike [snr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("snr") @ExcludeMissing fun _snr(): JsonField<Double> = snr

    /**
     * Returns the raw JSON value of [sysCap].
     *
     * Unlike [sysCap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sysCap") @ExcludeMissing fun _sysCap(): JsonField<String> = sysCap

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
         * Returns a mutable builder for constructing an instance of [HistoryListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .endPoint1Lat()
         * .endPoint1Lon()
         * .endPoint1Name()
         * .endPoint2Lat()
         * .endPoint2Lon()
         * .endPoint2Name()
         * .linkName()
         * .linkStartTime()
         * .linkStopTime()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HistoryListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var endPoint1Lat: JsonField<Double>? = null
        private var endPoint1Lon: JsonField<Double>? = null
        private var endPoint1Name: JsonField<String>? = null
        private var endPoint2Lat: JsonField<Double>? = null
        private var endPoint2Lon: JsonField<Double>? = null
        private var endPoint2Name: JsonField<String>? = null
        private var linkName: JsonField<String>? = null
        private var linkStartTime: JsonField<OffsetDateTime>? = null
        private var linkStopTime: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var band: JsonField<String> = JsonMissing.of()
        private var constellation: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dataRate1To2: JsonField<Double> = JsonMissing.of()
        private var dataRate2To1: JsonField<Double> = JsonMissing.of()
        private var idBeam1: JsonField<String> = JsonMissing.of()
        private var idBeam2: JsonField<String> = JsonMissing.of()
        private var idOnOrbit1: JsonField<String> = JsonMissing.of()
        private var idOnOrbit2: JsonField<String> = JsonMissing.of()
        private var linkState: JsonField<String> = JsonMissing.of()
        private var linkType: JsonField<String> = JsonMissing.of()
        private var opsCap: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var satNo1: JsonField<Int> = JsonMissing.of()
        private var satNo2: JsonField<Int> = JsonMissing.of()
        private var snr: JsonField<Double> = JsonMissing.of()
        private var sysCap: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(historyListResponse: HistoryListResponse) = apply {
            classificationMarking = historyListResponse.classificationMarking
            dataMode = historyListResponse.dataMode
            endPoint1Lat = historyListResponse.endPoint1Lat
            endPoint1Lon = historyListResponse.endPoint1Lon
            endPoint1Name = historyListResponse.endPoint1Name
            endPoint2Lat = historyListResponse.endPoint2Lat
            endPoint2Lon = historyListResponse.endPoint2Lon
            endPoint2Name = historyListResponse.endPoint2Name
            linkName = historyListResponse.linkName
            linkStartTime = historyListResponse.linkStartTime
            linkStopTime = historyListResponse.linkStopTime
            source = historyListResponse.source
            id = historyListResponse.id
            band = historyListResponse.band
            constellation = historyListResponse.constellation
            createdAt = historyListResponse.createdAt
            createdBy = historyListResponse.createdBy
            dataRate1To2 = historyListResponse.dataRate1To2
            dataRate2To1 = historyListResponse.dataRate2To1
            idBeam1 = historyListResponse.idBeam1
            idBeam2 = historyListResponse.idBeam2
            idOnOrbit1 = historyListResponse.idOnOrbit1
            idOnOrbit2 = historyListResponse.idOnOrbit2
            linkState = historyListResponse.linkState
            linkType = historyListResponse.linkType
            opsCap = historyListResponse.opsCap
            origin = historyListResponse.origin
            origNetwork = historyListResponse.origNetwork
            satNo1 = historyListResponse.satNo1
            satNo2 = historyListResponse.satNo2
            snr = historyListResponse.snr
            sysCap = historyListResponse.sysCap
            additionalProperties = historyListResponse.additionalProperties.toMutableMap()
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

        /**
         * Latitude of link endpoint-1, WGS-84 in degrees. -90 to 90 degrees (negative values south
         * of equator).
         */
        fun endPoint1Lat(endPoint1Lat: Double) = endPoint1Lat(JsonField.of(endPoint1Lat))

        /**
         * Sets [Builder.endPoint1Lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endPoint1Lat] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endPoint1Lat(endPoint1Lat: JsonField<Double>) = apply {
            this.endPoint1Lat = endPoint1Lat
        }

        /**
         * Longitude of link endpoint-1, WGS-84 longitude in degrees. -180 to 180 degrees (negative
         * values west of Prime Meridian).
         */
        fun endPoint1Lon(endPoint1Lon: Double) = endPoint1Lon(JsonField.of(endPoint1Lon))

        /**
         * Sets [Builder.endPoint1Lon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endPoint1Lon] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endPoint1Lon(endPoint1Lon: JsonField<Double>) = apply {
            this.endPoint1Lon = endPoint1Lon
        }

        /** The name or description of link endpoint-1, corresponding to beam-1. */
        fun endPoint1Name(endPoint1Name: String) = endPoint1Name(JsonField.of(endPoint1Name))

        /**
         * Sets [Builder.endPoint1Name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endPoint1Name] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endPoint1Name(endPoint1Name: JsonField<String>) = apply {
            this.endPoint1Name = endPoint1Name
        }

        /**
         * Latitude of link endpoint-2, WGS-84 in degrees. -90 to 90 degrees (negative values south
         * of equator).
         */
        fun endPoint2Lat(endPoint2Lat: Double) = endPoint2Lat(JsonField.of(endPoint2Lat))

        /**
         * Sets [Builder.endPoint2Lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endPoint2Lat] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endPoint2Lat(endPoint2Lat: JsonField<Double>) = apply {
            this.endPoint2Lat = endPoint2Lat
        }

        /**
         * Longitude of link endpoint-2, WGS-84 longitude in degrees. -180 to 180 degrees (negative
         * values west of Prime Meridian).
         */
        fun endPoint2Lon(endPoint2Lon: Double) = endPoint2Lon(JsonField.of(endPoint2Lon))

        /**
         * Sets [Builder.endPoint2Lon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endPoint2Lon] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endPoint2Lon(endPoint2Lon: JsonField<Double>) = apply {
            this.endPoint2Lon = endPoint2Lon
        }

        /** The name or description of link endpoint-2, corresponding to beam-2. */
        fun endPoint2Name(endPoint2Name: String) = endPoint2Name(JsonField.of(endPoint2Name))

        /**
         * Sets [Builder.endPoint2Name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endPoint2Name] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endPoint2Name(endPoint2Name: JsonField<String>) = apply {
            this.endPoint2Name = endPoint2Name
        }

        /** The name or description of the link. */
        fun linkName(linkName: String) = linkName(JsonField.of(linkName))

        /**
         * Sets [Builder.linkName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun linkName(linkName: JsonField<String>) = apply { this.linkName = linkName }

        /**
         * The link establishment time, or the time that the link becomes available for use, in
         * ISO8601 UTC format.
         */
        fun linkStartTime(linkStartTime: OffsetDateTime) =
            linkStartTime(JsonField.of(linkStartTime))

        /**
         * Sets [Builder.linkStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun linkStartTime(linkStartTime: JsonField<OffsetDateTime>) = apply {
            this.linkStartTime = linkStartTime
        }

        /**
         * The link termination time, or the time that the link becomes unavailable for use, in
         * ISO8601 UTC format.
         */
        fun linkStopTime(linkStopTime: OffsetDateTime) = linkStopTime(JsonField.of(linkStopTime))

        /**
         * Sets [Builder.linkStopTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkStopTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun linkStopTime(linkStopTime: JsonField<OffsetDateTime>) = apply {
            this.linkStopTime = linkStopTime
        }

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

        /** The RF band employed by the link (e.g. MIL-KA, COM-KA, X-BAND, C-BAND, etc.). */
        fun band(band: String) = band(JsonField.of(band))

        /**
         * Sets [Builder.band] to an arbitrary JSON value.
         *
         * You should usually call [Builder.band] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun band(band: JsonField<String>) = apply { this.band = band }

        /**
         * The constellation name if the link is established over a LEO/MEO constellation. In this
         * case, idOnOrbit1 and idOnOrbit2 will be null.
         */
        fun constellation(constellation: String) = constellation(JsonField.of(constellation))

        /**
         * Sets [Builder.constellation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.constellation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun constellation(constellation: JsonField<String>) = apply {
            this.constellation = constellation
        }

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

        /** The endpoint-1 to endpoint-2 data rate, in kbps. */
        fun dataRate1To2(dataRate1To2: Double) = dataRate1To2(JsonField.of(dataRate1To2))

        /**
         * Sets [Builder.dataRate1To2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataRate1To2] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataRate1To2(dataRate1To2: JsonField<Double>) = apply {
            this.dataRate1To2 = dataRate1To2
        }

        /** The endpoint-2 to endpoint-1 data rate, in kbps. */
        fun dataRate2To1(dataRate2To1: Double) = dataRate2To1(JsonField.of(dataRate2To1))

        /**
         * Sets [Builder.dataRate2To1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataRate2To1] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataRate2To1(dataRate2To1: JsonField<Double>) = apply {
            this.dataRate2To1 = dataRate2To1
        }

        /**
         * The ID of beam-1 forming the link. In the case of two sat link, beam-1 corresponds to
         * Sat-1.
         */
        fun idBeam1(idBeam1: String) = idBeam1(JsonField.of(idBeam1))

        /**
         * Sets [Builder.idBeam1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idBeam1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idBeam1(idBeam1: JsonField<String>) = apply { this.idBeam1 = idBeam1 }

        /**
         * The ID of beam-2 forming the link. In the case of two sat link, beam-2 corresponds to
         * Sat-2.
         */
        fun idBeam2(idBeam2: String) = idBeam2(JsonField.of(idBeam2))

        /**
         * Sets [Builder.idBeam2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idBeam2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idBeam2(idBeam2: JsonField<String>) = apply { this.idBeam2 = idBeam2 }

        /**
         * Unique ID of the on-orbit satellite (Sat-1) forming the link. A null value for idOnOrbit1
         * indicates that the link is formed over a LEO/MEO constellation.
         */
        fun idOnOrbit1(idOnOrbit1: String) = idOnOrbit1(JsonField.of(idOnOrbit1))

        /**
         * Sets [Builder.idOnOrbit1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit1] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit1(idOnOrbit1: JsonField<String>) = apply { this.idOnOrbit1 = idOnOrbit1 }

        /**
         * Unique ID of the on-orbit satellite (Sat-2) forming the link. A null value for idOnOrbit2
         * indicates either a link employing only Sat-1 or a link formed over a LEO/MEO
         * constellation.
         */
        fun idOnOrbit2(idOnOrbit2: String) = idOnOrbit2(JsonField.of(idOnOrbit2))

        /**
         * Sets [Builder.idOnOrbit2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit2] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit2(idOnOrbit2: JsonField<String>) = apply { this.idOnOrbit2 = idOnOrbit2 }

        /** The state of the link (e.g. OK, DEGRADED-WEATHER, DEGRADED-EMI, etc.). */
        fun linkState(linkState: String) = linkState(JsonField.of(linkState))

        /**
         * Sets [Builder.linkState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun linkState(linkState: JsonField<String>) = apply { this.linkState = linkState }

        /** The type of the link. */
        fun linkType(linkType: String) = linkType(JsonField.of(linkType))

        /**
         * Sets [Builder.linkType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun linkType(linkType: JsonField<String>) = apply { this.linkType = linkType }

        /** The OPSCAP mission status of the system(s) forming the link. */
        fun opsCap(opsCap: String) = opsCap(JsonField.of(opsCap))

        /**
         * Sets [Builder.opsCap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opsCap] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun opsCap(opsCap: JsonField<String>) = apply { this.opsCap = opsCap }

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

        /** Satellite/catalog number of the target on-orbit primary object. */
        fun satNo1(satNo1: Int) = satNo1(JsonField.of(satNo1))

        /**
         * Sets [Builder.satNo1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo1] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo1(satNo1: JsonField<Int>) = apply { this.satNo1 = satNo1 }

        /** Satellite/catalog number of the target on-orbit secondary object. */
        fun satNo2(satNo2: Int) = satNo2(JsonField.of(satNo2))

        /**
         * Sets [Builder.satNo2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo2] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo2(satNo2: JsonField<Int>) = apply { this.satNo2 = satNo2 }

        /** Signal to noise ratio, in dB. */
        fun snr(snr: Double) = snr(JsonField.of(snr))

        /**
         * Sets [Builder.snr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snr] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun snr(snr: JsonField<Double>) = apply { this.snr = snr }

        /** The SYSCAP mission status of the system(s) forming the link. */
        fun sysCap(sysCap: String) = sysCap(JsonField.of(sysCap))

        /**
         * Sets [Builder.sysCap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sysCap] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sysCap(sysCap: JsonField<String>) = apply { this.sysCap = sysCap }

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
         * Returns an immutable instance of [HistoryListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .endPoint1Lat()
         * .endPoint1Lon()
         * .endPoint1Name()
         * .endPoint2Lat()
         * .endPoint2Lon()
         * .endPoint2Name()
         * .linkName()
         * .linkStartTime()
         * .linkStopTime()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HistoryListResponse =
            HistoryListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("endPoint1Lat", endPoint1Lat),
                checkRequired("endPoint1Lon", endPoint1Lon),
                checkRequired("endPoint1Name", endPoint1Name),
                checkRequired("endPoint2Lat", endPoint2Lat),
                checkRequired("endPoint2Lon", endPoint2Lon),
                checkRequired("endPoint2Name", endPoint2Name),
                checkRequired("linkName", linkName),
                checkRequired("linkStartTime", linkStartTime),
                checkRequired("linkStopTime", linkStopTime),
                checkRequired("source", source),
                id,
                band,
                constellation,
                createdAt,
                createdBy,
                dataRate1To2,
                dataRate2To1,
                idBeam1,
                idBeam2,
                idOnOrbit1,
                idOnOrbit2,
                linkState,
                linkType,
                opsCap,
                origin,
                origNetwork,
                satNo1,
                satNo2,
                snr,
                sysCap,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HistoryListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        endPoint1Lat()
        endPoint1Lon()
        endPoint1Name()
        endPoint2Lat()
        endPoint2Lon()
        endPoint2Name()
        linkName()
        linkStartTime()
        linkStopTime()
        source()
        id()
        band()
        constellation()
        createdAt()
        createdBy()
        dataRate1To2()
        dataRate2To1()
        idBeam1()
        idBeam2()
        idOnOrbit1()
        idOnOrbit2()
        linkState()
        linkType()
        opsCap()
        origin()
        origNetwork()
        satNo1()
        satNo2()
        snr()
        sysCap()
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
            (if (endPoint1Lat.asKnown().isPresent) 1 else 0) +
            (if (endPoint1Lon.asKnown().isPresent) 1 else 0) +
            (if (endPoint1Name.asKnown().isPresent) 1 else 0) +
            (if (endPoint2Lat.asKnown().isPresent) 1 else 0) +
            (if (endPoint2Lon.asKnown().isPresent) 1 else 0) +
            (if (endPoint2Name.asKnown().isPresent) 1 else 0) +
            (if (linkName.asKnown().isPresent) 1 else 0) +
            (if (linkStartTime.asKnown().isPresent) 1 else 0) +
            (if (linkStopTime.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (band.asKnown().isPresent) 1 else 0) +
            (if (constellation.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dataRate1To2.asKnown().isPresent) 1 else 0) +
            (if (dataRate2To1.asKnown().isPresent) 1 else 0) +
            (if (idBeam1.asKnown().isPresent) 1 else 0) +
            (if (idBeam2.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit1.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit2.asKnown().isPresent) 1 else 0) +
            (if (linkState.asKnown().isPresent) 1 else 0) +
            (if (linkType.asKnown().isPresent) 1 else 0) +
            (if (opsCap.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (satNo1.asKnown().isPresent) 1 else 0) +
            (if (satNo2.asKnown().isPresent) 1 else 0) +
            (if (snr.asKnown().isPresent) 1 else 0) +
            (if (sysCap.asKnown().isPresent) 1 else 0)

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

        return other is HistoryListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            endPoint1Lat == other.endPoint1Lat &&
            endPoint1Lon == other.endPoint1Lon &&
            endPoint1Name == other.endPoint1Name &&
            endPoint2Lat == other.endPoint2Lat &&
            endPoint2Lon == other.endPoint2Lon &&
            endPoint2Name == other.endPoint2Name &&
            linkName == other.linkName &&
            linkStartTime == other.linkStartTime &&
            linkStopTime == other.linkStopTime &&
            source == other.source &&
            id == other.id &&
            band == other.band &&
            constellation == other.constellation &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            dataRate1To2 == other.dataRate1To2 &&
            dataRate2To1 == other.dataRate2To1 &&
            idBeam1 == other.idBeam1 &&
            idBeam2 == other.idBeam2 &&
            idOnOrbit1 == other.idOnOrbit1 &&
            idOnOrbit2 == other.idOnOrbit2 &&
            linkState == other.linkState &&
            linkType == other.linkType &&
            opsCap == other.opsCap &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            satNo1 == other.satNo1 &&
            satNo2 == other.satNo2 &&
            snr == other.snr &&
            sysCap == other.sysCap &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            endPoint1Lat,
            endPoint1Lon,
            endPoint1Name,
            endPoint2Lat,
            endPoint2Lon,
            endPoint2Name,
            linkName,
            linkStartTime,
            linkStopTime,
            source,
            id,
            band,
            constellation,
            createdAt,
            createdBy,
            dataRate1To2,
            dataRate2To1,
            idBeam1,
            idBeam2,
            idOnOrbit1,
            idOnOrbit2,
            linkState,
            linkType,
            opsCap,
            origin,
            origNetwork,
            satNo1,
            satNo2,
            snr,
            sysCap,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HistoryListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, endPoint1Lat=$endPoint1Lat, endPoint1Lon=$endPoint1Lon, endPoint1Name=$endPoint1Name, endPoint2Lat=$endPoint2Lat, endPoint2Lon=$endPoint2Lon, endPoint2Name=$endPoint2Name, linkName=$linkName, linkStartTime=$linkStartTime, linkStopTime=$linkStopTime, source=$source, id=$id, band=$band, constellation=$constellation, createdAt=$createdAt, createdBy=$createdBy, dataRate1To2=$dataRate1To2, dataRate2To1=$dataRate2To1, idBeam1=$idBeam1, idBeam2=$idBeam2, idOnOrbit1=$idOnOrbit1, idOnOrbit2=$idOnOrbit2, linkState=$linkState, linkType=$linkType, opsCap=$opsCap, origin=$origin, origNetwork=$origNetwork, satNo1=$satNo1, satNo2=$satNo2, snr=$snr, sysCap=$sysCap, additionalProperties=$additionalProperties}"
}

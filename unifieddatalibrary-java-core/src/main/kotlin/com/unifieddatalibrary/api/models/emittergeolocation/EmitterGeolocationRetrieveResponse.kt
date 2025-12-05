// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.emittergeolocation

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
import com.unifieddatalibrary.api.models.OnorbitFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Model representation of Emitter geolocation data for a signal of interest. */
class EmitterGeolocationRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val signalOfInterestType: JsonField<String>,
    private val source: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val agjson: JsonField<String>,
    private val algVersion: JsonField<String>,
    private val andims: JsonField<Int>,
    private val area: JsonField<String>,
    private val asrid: JsonField<Int>,
    private val atext: JsonField<String>,
    private val atype: JsonField<String>,
    private val avgPrf: JsonField<Double>,
    private val avgPri: JsonField<Double>,
    private val avgPw: JsonField<Double>,
    private val centerFreq: JsonField<Double>,
    private val cluster: JsonField<String>,
    private val confArea: JsonField<Double>,
    private val constellation: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val createdTs: JsonField<OffsetDateTime>,
    private val detectAlt: JsonField<Double>,
    private val detectLat: JsonField<Double>,
    private val detectLon: JsonField<Double>,
    private val endTime: JsonField<OffsetDateTime>,
    private val errEllp: JsonField<List<Double>>,
    private val externalId: JsonField<String>,
    private val idOnOrbit: JsonField<String>,
    private val idRfEmitter: JsonField<String>,
    private val idSensor: JsonField<String>,
    private val maxFreq: JsonField<Double>,
    private val maxPrf: JsonField<Double>,
    private val maxPri: JsonField<Double>,
    private val maxPw: JsonField<Double>,
    private val minFreq: JsonField<Double>,
    private val minPrf: JsonField<Double>,
    private val minPri: JsonField<Double>,
    private val minPw: JsonField<Double>,
    private val numBursts: JsonField<Int>,
    private val onOrbit: JsonField<OnorbitFull>,
    private val orderId: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val origRfEmitterId: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val passGroupId: JsonField<String>,
    private val pulseShape: JsonField<String>,
    private val receivedTs: JsonField<OffsetDateTime>,
    private val satNo: JsonField<Int>,
    private val signalOfInterest: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("signalOfInterestType")
        @ExcludeMissing
        signalOfInterestType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agjson") @ExcludeMissing agjson: JsonField<String> = JsonMissing.of(),
        @JsonProperty("algVersion")
        @ExcludeMissing
        algVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("andims") @ExcludeMissing andims: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("area") @ExcludeMissing area: JsonField<String> = JsonMissing.of(),
        @JsonProperty("asrid") @ExcludeMissing asrid: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("atext") @ExcludeMissing atext: JsonField<String> = JsonMissing.of(),
        @JsonProperty("atype") @ExcludeMissing atype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("avgPRF") @ExcludeMissing avgPrf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("avgPRI") @ExcludeMissing avgPri: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("avgPW") @ExcludeMissing avgPw: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("centerFreq")
        @ExcludeMissing
        centerFreq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("cluster") @ExcludeMissing cluster: JsonField<String> = JsonMissing.of(),
        @JsonProperty("confArea") @ExcludeMissing confArea: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("constellation")
        @ExcludeMissing
        constellation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdTs")
        @ExcludeMissing
        createdTs: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("detectAlt") @ExcludeMissing detectAlt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("detectLat") @ExcludeMissing detectLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("detectLon") @ExcludeMissing detectLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("endTime")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("errEllp")
        @ExcludeMissing
        errEllp: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("externalId")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idRFEmitter")
        @ExcludeMissing
        idRfEmitter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxFreq") @ExcludeMissing maxFreq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxPRF") @ExcludeMissing maxPrf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxPRI") @ExcludeMissing maxPri: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxPW") @ExcludeMissing maxPw: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minFreq") @ExcludeMissing minFreq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minPRF") @ExcludeMissing minPrf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minPRI") @ExcludeMissing minPri: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minPW") @ExcludeMissing minPw: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("numBursts") @ExcludeMissing numBursts: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("onOrbit") @ExcludeMissing onOrbit: JsonField<OnorbitFull> = JsonMissing.of(),
        @JsonProperty("orderId") @ExcludeMissing orderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origRFEmitterId")
        @ExcludeMissing
        origRfEmitterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origSensorId")
        @ExcludeMissing
        origSensorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("passGroupId")
        @ExcludeMissing
        passGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pulseShape")
        @ExcludeMissing
        pulseShape: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receivedTs")
        @ExcludeMissing
        receivedTs: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("signalOfInterest")
        @ExcludeMissing
        signalOfInterest: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        signalOfInterestType,
        source,
        startTime,
        id,
        agjson,
        algVersion,
        andims,
        area,
        asrid,
        atext,
        atype,
        avgPrf,
        avgPri,
        avgPw,
        centerFreq,
        cluster,
        confArea,
        constellation,
        createdAt,
        createdBy,
        createdTs,
        detectAlt,
        detectLat,
        detectLon,
        endTime,
        errEllp,
        externalId,
        idOnOrbit,
        idRfEmitter,
        idSensor,
        maxFreq,
        maxPrf,
        maxPri,
        maxPw,
        minFreq,
        minPrf,
        minPri,
        minPw,
        numBursts,
        onOrbit,
        orderId,
        origin,
        origNetwork,
        origObjectId,
        origRfEmitterId,
        origSensorId,
        passGroupId,
        pulseShape,
        receivedTs,
        satNo,
        signalOfInterest,
        sourceDl,
        tags,
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
     * Type of the signal of interest of this Emitter Geo Location (e.g. RF).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun signalOfInterestType(): String = signalOfInterestType.getRequired("signalOfInterestType")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The start time for this Emitter Geo Location data set in ISO 8601 UTC with microsecond
     * precision.
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
     * Geographical region or polygon (lat/lon pairs), as depicted by the GeoJSON representation of
     * the geometry/geography, of the image as projected on the ground. GeoJSON Reference:
     * https://geojson.org/. Ignored if included with a POST or PUT request that also specifies a
     * valid 'area' or 'atext' field.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun agjson(): Optional<String> = agjson.getOptional("agjson")

    /**
     * The EmitterGeo algorithm type and version used in Emitter geolocation calculations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun algVersion(): Optional<String> = algVersion.getOptional("algVersion")

    /**
     * Number of dimensions of the geometry depicted by region.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun andims(): Optional<Int> = andims.getOptional("andims")

    /**
     * Optional geographical region or polygon (lat/lon pairs) of the area surrounding the Point of
     * Interest as projected on the ground.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun area(): Optional<String> = area.getOptional("area")

    /**
     * Geographical spatial_ref_sys for region.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun asrid(): Optional<Int> = asrid.getOptional("asrid")

    /**
     * Geographical region or polygon (lon/lat pairs), as depicted by the Well-Known Text
     * representation of the geometry/geography, of the image as projected on the ground. WKT
     * reference: https://www.opengeospatial.org/standards/wkt-crs. Ignored if included with a POST
     * or PUT request that also specifies a valid 'area' field.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun atext(): Optional<String> = atext.getOptional("atext")

    /**
     * Type of region as projected on the ground.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun atype(): Optional<String> = atype.getOptional("atype")

    /**
     * Average pulse repetition frequency of the emitter, measured in hertz. PRF is the number of
     * pulses transmitted per second. This is the reciprocal of the avgPRI (Pulse Repetition
     * Interval) value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avgPrf(): Optional<Double> = avgPrf.getOptional("avgPRF")

    /**
     * Average pulse repetition interval of the emitter, measured in microseconds. The interval
     * between the start of one pulse and the start of another.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avgPri(): Optional<Double> = avgPri.getOptional("avgPRI")

    /**
     * Average pulse width of the emitter, measured in nanoseconds. This is the average duration of
     * the pulse.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avgPw(): Optional<Double> = avgPw.getOptional("avgPW")

    /**
     * The detected signal frequency in megahertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun centerFreq(): Optional<Double> = centerFreq.getOptional("centerFreq")

    /**
     * The name(s) of the subset of constellation spacecraft that made this detection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cluster(): Optional<String> = cluster.getOptional("cluster")

    /**
     * The area of the confidence ellipse specified in meters squared to contain the emitter with a
     * 95% probability.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun confArea(): Optional<Double> = confArea.getOptional("confArea")

    /**
     * The name of the satellite constellation.
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
     * Specifies the creation time associated with the order in ISO 8601 UTC with microsecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdTs(): Optional<OffsetDateTime> = createdTs.getOptional("createdTs")

    /**
     * The altitude relative to WGS-84 ellipsoid, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun detectAlt(): Optional<Double> = detectAlt.getOptional("detectAlt")

    /**
     * WGS-84 latitude of the most likely emitter location coordinate point, in degrees. -90 to 90
     * degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun detectLat(): Optional<Double> = detectLat.getOptional("detectLat")

    /**
     * WGS-84 longitude of the most likely emitter location coordinate point, in degrees. -180 to
     * 180 degrees (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun detectLon(): Optional<Double> = detectLon.getOptional("detectLon")

    /**
     * The end time for this Emitter Geo Location data set in ISO 8601 UTC with microsecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("endTime")

    /**
     * Confidence ellipsoid about the detection location
     * [semi-major axis (meters), semi-minor axis (meters), orientation (degrees) measured clockwise (0-360 from true north)].
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun errEllp(): Optional<List<Double>> = errEllp.getOptional("errEllp")

    /**
     * Optional ID from external systems. This field has no meaning within UDL and is provided as a
     * convenience for systems that require tracking of an internal system generated ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("externalId")

    /**
     * Unique identifier of the satellite used to identify and geolocate Emitter signals of
     * interest. This ID can be used to obtain additional information on an OnOrbit object using the
     * 'get by ID' operation (e.g. /udl/onorbit/{id}). For example, the onorbit object with
     * idOnOrbit = abc would be queried as /udl/onorbit/abc. Used when Emitter geolocation is done
     * by a single satellite.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Optional identifier of the geolocated signal of interest RF Emitter for this observation.
     * This ID can be used to obtain additional information on an RF Emitter object using the 'get
     * by ID' operation (e.g. /udl/rfemitter/{id}). For example, the rfemitter object with
     * idRFEmitter = abc would be queried as /udl/rfemitter/abc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idRfEmitter(): Optional<String> = idRfEmitter.getOptional("idRFEmitter")

    /**
     * Unique identifier of the reporting sensor. This ID can be used to obtain additional
     * information on a sensor using the 'get by ID' operation (e.g. /udl/sensor/{id}). For example,
     * the sensor with idSensor = abc would be queried as /udl/sensor/abc. Used when Emitter
     * geolocation is done by a single sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

    /**
     * The maximum detected frequency in megahertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxFreq(): Optional<Double> = maxFreq.getOptional("maxFreq")

    /**
     * Maximum pulse repetition frequency of the emitter, measured in hertz. PRF is the number of
     * pulses transmitted per second. This is the reciprocal of the minPRI (Pulse Repetition
     * Interval) value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxPrf(): Optional<Double> = maxPrf.getOptional("maxPRF")

    /**
     * Maximum pulse repetition interval of the emitter, measured in microseconds. The interval
     * between the start of one pulse and the start of another.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxPri(): Optional<Double> = maxPri.getOptional("maxPRI")

    /**
     * Maximum pulse width of the emitter, measured in nanoseconds. This is the maximum duration of
     * the pulse.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxPw(): Optional<Double> = maxPw.getOptional("maxPW")

    /**
     * The minimum detected frequency in megahertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minFreq(): Optional<Double> = minFreq.getOptional("minFreq")

    /**
     * Minimum pulse repetition frequency of the emitter, measured in hertz. PRF is the number of
     * pulses transmitted per second. This is the reciprocal of the maxPRI (Pulse Repetition
     * Interval) value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minPrf(): Optional<Double> = minPrf.getOptional("minPRF")

    /**
     * Minimum pulse repetition interval of the emitter, measured in microseconds. The interval
     * between the start of one pulse and the start of another.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minPri(): Optional<Double> = minPri.getOptional("minPRI")

    /**
     * Minimum pulse width of the emitter, measured in nanoseconds. This is the minimum duration of
     * the pulse.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minPw(): Optional<Double> = minPw.getOptional("minPW")

    /**
     * The count of single-burst observations used for this geolocation observation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numBursts(): Optional<Int> = numBursts.getOptional("numBursts")

    /**
     * Model object representing on-orbit objects or satellites in the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun onOrbit(): Optional<OnorbitFull> = onOrbit.getOptional("onOrbit")

    /**
     * The order identifier for this Emitter Geo Location data set.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun orderId(): Optional<String> = orderId.getOptional("orderId")

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
     * Optional identifier of the satellite used to identify and geolocate Emitter signals of
     * interest of this observation. This may be an internal identifier and not necessarily a valid
     * satellite number. Used when Emitter geolocation is done by a single satellite.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Optional identifier of the emitter of interest for this observation. This may be an internal
     * identifier and not necessarily a valid emitter Id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origRfEmitterId(): Optional<String> = origRfEmitterId.getOptional("origRFEmitterId")

    /**
     * Optional identifier provided by observation source to indicate the sensor identifier which
     * produced this Emitter Geo Location. This may be an internal identifier and not necessarily a
     * valid sensor ID. Used when Emitter geolocation is done by a single sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

    /**
     * Optional external identifier referencing the entity used in the calculation of the
     * geolocation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun passGroupId(): Optional<String> = passGroupId.getOptional("passGroupId")

    /**
     * Describes the form of the emitted pulse and how its signal varies within the pulse duration
     * (e.g. GAUSSIAN, RECTANGULAR, TRAPEZOIDAL, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pulseShape(): Optional<String> = pulseShape.getOptional("pulseShape")

    /**
     * The time representing the mean of the constituent single-burst observations in ISO 8601 UTC
     * with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun receivedTs(): Optional<OffsetDateTime> = receivedTs.getOptional("receivedTs")

    /**
     * Satellite/catalog number of the on-orbit spacecraft used to identify and geolocate Emitter
     * signals of interest of this detection. Used when Emitter geolocation is done by a single
     * satellite.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * The name of the signal of interest.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun signalOfInterest(): Optional<String> = signalOfInterest.getOptional("signalOfInterest")

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
     * Optional array of provider/source specific tags for this data, where each element is no
     * longer than 32 characters, used for implementing data owner conditional access controls to
     * restrict access to the data. Should be left null by data providers unless conditional access
     * controls are coordinated with the UDL team.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

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
     * Returns the raw JSON value of [signalOfInterestType].
     *
     * Unlike [signalOfInterestType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("signalOfInterestType")
    @ExcludeMissing
    fun _signalOfInterestType(): JsonField<String> = signalOfInterestType

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
     * Returns the raw JSON value of [agjson].
     *
     * Unlike [agjson], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agjson") @ExcludeMissing fun _agjson(): JsonField<String> = agjson

    /**
     * Returns the raw JSON value of [algVersion].
     *
     * Unlike [algVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("algVersion") @ExcludeMissing fun _algVersion(): JsonField<String> = algVersion

    /**
     * Returns the raw JSON value of [andims].
     *
     * Unlike [andims], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("andims") @ExcludeMissing fun _andims(): JsonField<Int> = andims

    /**
     * Returns the raw JSON value of [area].
     *
     * Unlike [area], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("area") @ExcludeMissing fun _area(): JsonField<String> = area

    /**
     * Returns the raw JSON value of [asrid].
     *
     * Unlike [asrid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("asrid") @ExcludeMissing fun _asrid(): JsonField<Int> = asrid

    /**
     * Returns the raw JSON value of [atext].
     *
     * Unlike [atext], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("atext") @ExcludeMissing fun _atext(): JsonField<String> = atext

    /**
     * Returns the raw JSON value of [atype].
     *
     * Unlike [atype], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("atype") @ExcludeMissing fun _atype(): JsonField<String> = atype

    /**
     * Returns the raw JSON value of [avgPrf].
     *
     * Unlike [avgPrf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avgPRF") @ExcludeMissing fun _avgPrf(): JsonField<Double> = avgPrf

    /**
     * Returns the raw JSON value of [avgPri].
     *
     * Unlike [avgPri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avgPRI") @ExcludeMissing fun _avgPri(): JsonField<Double> = avgPri

    /**
     * Returns the raw JSON value of [avgPw].
     *
     * Unlike [avgPw], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avgPW") @ExcludeMissing fun _avgPw(): JsonField<Double> = avgPw

    /**
     * Returns the raw JSON value of [centerFreq].
     *
     * Unlike [centerFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("centerFreq") @ExcludeMissing fun _centerFreq(): JsonField<Double> = centerFreq

    /**
     * Returns the raw JSON value of [cluster].
     *
     * Unlike [cluster], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cluster") @ExcludeMissing fun _cluster(): JsonField<String> = cluster

    /**
     * Returns the raw JSON value of [confArea].
     *
     * Unlike [confArea], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confArea") @ExcludeMissing fun _confArea(): JsonField<Double> = confArea

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
     * Returns the raw JSON value of [createdTs].
     *
     * Unlike [createdTs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdTs")
    @ExcludeMissing
    fun _createdTs(): JsonField<OffsetDateTime> = createdTs

    /**
     * Returns the raw JSON value of [detectAlt].
     *
     * Unlike [detectAlt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detectAlt") @ExcludeMissing fun _detectAlt(): JsonField<Double> = detectAlt

    /**
     * Returns the raw JSON value of [detectLat].
     *
     * Unlike [detectLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detectLat") @ExcludeMissing fun _detectLat(): JsonField<Double> = detectLat

    /**
     * Returns the raw JSON value of [detectLon].
     *
     * Unlike [detectLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detectLon") @ExcludeMissing fun _detectLon(): JsonField<Double> = detectLon

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [errEllp].
     *
     * Unlike [errEllp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errEllp") @ExcludeMissing fun _errEllp(): JsonField<List<Double>> = errEllp

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalId") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [idRfEmitter].
     *
     * Unlike [idRfEmitter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idRFEmitter") @ExcludeMissing fun _idRfEmitter(): JsonField<String> = idRfEmitter

    /**
     * Returns the raw JSON value of [idSensor].
     *
     * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

    /**
     * Returns the raw JSON value of [maxFreq].
     *
     * Unlike [maxFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxFreq") @ExcludeMissing fun _maxFreq(): JsonField<Double> = maxFreq

    /**
     * Returns the raw JSON value of [maxPrf].
     *
     * Unlike [maxPrf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxPRF") @ExcludeMissing fun _maxPrf(): JsonField<Double> = maxPrf

    /**
     * Returns the raw JSON value of [maxPri].
     *
     * Unlike [maxPri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxPRI") @ExcludeMissing fun _maxPri(): JsonField<Double> = maxPri

    /**
     * Returns the raw JSON value of [maxPw].
     *
     * Unlike [maxPw], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxPW") @ExcludeMissing fun _maxPw(): JsonField<Double> = maxPw

    /**
     * Returns the raw JSON value of [minFreq].
     *
     * Unlike [minFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minFreq") @ExcludeMissing fun _minFreq(): JsonField<Double> = minFreq

    /**
     * Returns the raw JSON value of [minPrf].
     *
     * Unlike [minPrf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minPRF") @ExcludeMissing fun _minPrf(): JsonField<Double> = minPrf

    /**
     * Returns the raw JSON value of [minPri].
     *
     * Unlike [minPri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minPRI") @ExcludeMissing fun _minPri(): JsonField<Double> = minPri

    /**
     * Returns the raw JSON value of [minPw].
     *
     * Unlike [minPw], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minPW") @ExcludeMissing fun _minPw(): JsonField<Double> = minPw

    /**
     * Returns the raw JSON value of [numBursts].
     *
     * Unlike [numBursts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numBursts") @ExcludeMissing fun _numBursts(): JsonField<Int> = numBursts

    /**
     * Returns the raw JSON value of [onOrbit].
     *
     * Unlike [onOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("onOrbit") @ExcludeMissing fun _onOrbit(): JsonField<OnorbitFull> = onOrbit

    /**
     * Returns the raw JSON value of [orderId].
     *
     * Unlike [orderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("orderId") @ExcludeMissing fun _orderId(): JsonField<String> = orderId

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
     * Returns the raw JSON value of [origObjectId].
     *
     * Unlike [origObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origObjectId")
    @ExcludeMissing
    fun _origObjectId(): JsonField<String> = origObjectId

    /**
     * Returns the raw JSON value of [origRfEmitterId].
     *
     * Unlike [origRfEmitterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origRFEmitterId")
    @ExcludeMissing
    fun _origRfEmitterId(): JsonField<String> = origRfEmitterId

    /**
     * Returns the raw JSON value of [origSensorId].
     *
     * Unlike [origSensorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origSensorId")
    @ExcludeMissing
    fun _origSensorId(): JsonField<String> = origSensorId

    /**
     * Returns the raw JSON value of [passGroupId].
     *
     * Unlike [passGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("passGroupId") @ExcludeMissing fun _passGroupId(): JsonField<String> = passGroupId

    /**
     * Returns the raw JSON value of [pulseShape].
     *
     * Unlike [pulseShape], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pulseShape") @ExcludeMissing fun _pulseShape(): JsonField<String> = pulseShape

    /**
     * Returns the raw JSON value of [receivedTs].
     *
     * Unlike [receivedTs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receivedTs")
    @ExcludeMissing
    fun _receivedTs(): JsonField<OffsetDateTime> = receivedTs

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [signalOfInterest].
     *
     * Unlike [signalOfInterest], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("signalOfInterest")
    @ExcludeMissing
    fun _signalOfInterest(): JsonField<String> = signalOfInterest

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
         * [EmitterGeolocationRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .signalOfInterestType()
         * .source()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmitterGeolocationRetrieveResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var signalOfInterestType: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var agjson: JsonField<String> = JsonMissing.of()
        private var algVersion: JsonField<String> = JsonMissing.of()
        private var andims: JsonField<Int> = JsonMissing.of()
        private var area: JsonField<String> = JsonMissing.of()
        private var asrid: JsonField<Int> = JsonMissing.of()
        private var atext: JsonField<String> = JsonMissing.of()
        private var atype: JsonField<String> = JsonMissing.of()
        private var avgPrf: JsonField<Double> = JsonMissing.of()
        private var avgPri: JsonField<Double> = JsonMissing.of()
        private var avgPw: JsonField<Double> = JsonMissing.of()
        private var centerFreq: JsonField<Double> = JsonMissing.of()
        private var cluster: JsonField<String> = JsonMissing.of()
        private var confArea: JsonField<Double> = JsonMissing.of()
        private var constellation: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var createdTs: JsonField<OffsetDateTime> = JsonMissing.of()
        private var detectAlt: JsonField<Double> = JsonMissing.of()
        private var detectLat: JsonField<Double> = JsonMissing.of()
        private var detectLon: JsonField<Double> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var errEllp: JsonField<MutableList<Double>>? = null
        private var externalId: JsonField<String> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idRfEmitter: JsonField<String> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var maxFreq: JsonField<Double> = JsonMissing.of()
        private var maxPrf: JsonField<Double> = JsonMissing.of()
        private var maxPri: JsonField<Double> = JsonMissing.of()
        private var maxPw: JsonField<Double> = JsonMissing.of()
        private var minFreq: JsonField<Double> = JsonMissing.of()
        private var minPrf: JsonField<Double> = JsonMissing.of()
        private var minPri: JsonField<Double> = JsonMissing.of()
        private var minPw: JsonField<Double> = JsonMissing.of()
        private var numBursts: JsonField<Int> = JsonMissing.of()
        private var onOrbit: JsonField<OnorbitFull> = JsonMissing.of()
        private var orderId: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var origRfEmitterId: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var passGroupId: JsonField<String> = JsonMissing.of()
        private var pulseShape: JsonField<String> = JsonMissing.of()
        private var receivedTs: JsonField<OffsetDateTime> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var signalOfInterest: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emitterGeolocationRetrieveResponse: EmitterGeolocationRetrieveResponse) =
            apply {
                classificationMarking = emitterGeolocationRetrieveResponse.classificationMarking
                dataMode = emitterGeolocationRetrieveResponse.dataMode
                signalOfInterestType = emitterGeolocationRetrieveResponse.signalOfInterestType
                source = emitterGeolocationRetrieveResponse.source
                startTime = emitterGeolocationRetrieveResponse.startTime
                id = emitterGeolocationRetrieveResponse.id
                agjson = emitterGeolocationRetrieveResponse.agjson
                algVersion = emitterGeolocationRetrieveResponse.algVersion
                andims = emitterGeolocationRetrieveResponse.andims
                area = emitterGeolocationRetrieveResponse.area
                asrid = emitterGeolocationRetrieveResponse.asrid
                atext = emitterGeolocationRetrieveResponse.atext
                atype = emitterGeolocationRetrieveResponse.atype
                avgPrf = emitterGeolocationRetrieveResponse.avgPrf
                avgPri = emitterGeolocationRetrieveResponse.avgPri
                avgPw = emitterGeolocationRetrieveResponse.avgPw
                centerFreq = emitterGeolocationRetrieveResponse.centerFreq
                cluster = emitterGeolocationRetrieveResponse.cluster
                confArea = emitterGeolocationRetrieveResponse.confArea
                constellation = emitterGeolocationRetrieveResponse.constellation
                createdAt = emitterGeolocationRetrieveResponse.createdAt
                createdBy = emitterGeolocationRetrieveResponse.createdBy
                createdTs = emitterGeolocationRetrieveResponse.createdTs
                detectAlt = emitterGeolocationRetrieveResponse.detectAlt
                detectLat = emitterGeolocationRetrieveResponse.detectLat
                detectLon = emitterGeolocationRetrieveResponse.detectLon
                endTime = emitterGeolocationRetrieveResponse.endTime
                errEllp = emitterGeolocationRetrieveResponse.errEllp.map { it.toMutableList() }
                externalId = emitterGeolocationRetrieveResponse.externalId
                idOnOrbit = emitterGeolocationRetrieveResponse.idOnOrbit
                idRfEmitter = emitterGeolocationRetrieveResponse.idRfEmitter
                idSensor = emitterGeolocationRetrieveResponse.idSensor
                maxFreq = emitterGeolocationRetrieveResponse.maxFreq
                maxPrf = emitterGeolocationRetrieveResponse.maxPrf
                maxPri = emitterGeolocationRetrieveResponse.maxPri
                maxPw = emitterGeolocationRetrieveResponse.maxPw
                minFreq = emitterGeolocationRetrieveResponse.minFreq
                minPrf = emitterGeolocationRetrieveResponse.minPrf
                minPri = emitterGeolocationRetrieveResponse.minPri
                minPw = emitterGeolocationRetrieveResponse.minPw
                numBursts = emitterGeolocationRetrieveResponse.numBursts
                onOrbit = emitterGeolocationRetrieveResponse.onOrbit
                orderId = emitterGeolocationRetrieveResponse.orderId
                origin = emitterGeolocationRetrieveResponse.origin
                origNetwork = emitterGeolocationRetrieveResponse.origNetwork
                origObjectId = emitterGeolocationRetrieveResponse.origObjectId
                origRfEmitterId = emitterGeolocationRetrieveResponse.origRfEmitterId
                origSensorId = emitterGeolocationRetrieveResponse.origSensorId
                passGroupId = emitterGeolocationRetrieveResponse.passGroupId
                pulseShape = emitterGeolocationRetrieveResponse.pulseShape
                receivedTs = emitterGeolocationRetrieveResponse.receivedTs
                satNo = emitterGeolocationRetrieveResponse.satNo
                signalOfInterest = emitterGeolocationRetrieveResponse.signalOfInterest
                sourceDl = emitterGeolocationRetrieveResponse.sourceDl
                tags = emitterGeolocationRetrieveResponse.tags.map { it.toMutableList() }
                additionalProperties =
                    emitterGeolocationRetrieveResponse.additionalProperties.toMutableMap()
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

        /** Type of the signal of interest of this Emitter Geo Location (e.g. RF). */
        fun signalOfInterestType(signalOfInterestType: String) =
            signalOfInterestType(JsonField.of(signalOfInterestType))

        /**
         * Sets [Builder.signalOfInterestType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signalOfInterestType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun signalOfInterestType(signalOfInterestType: JsonField<String>) = apply {
            this.signalOfInterestType = signalOfInterestType
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

        /**
         * The start time for this Emitter Geo Location data set in ISO 8601 UTC with microsecond
         * precision.
         */
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
         * Geographical region or polygon (lat/lon pairs), as depicted by the GeoJSON representation
         * of the geometry/geography, of the image as projected on the ground. GeoJSON Reference:
         * https://geojson.org/. Ignored if included with a POST or PUT request that also specifies
         * a valid 'area' or 'atext' field.
         */
        fun agjson(agjson: String) = agjson(JsonField.of(agjson))

        /**
         * Sets [Builder.agjson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agjson] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agjson(agjson: JsonField<String>) = apply { this.agjson = agjson }

        /** The EmitterGeo algorithm type and version used in Emitter geolocation calculations. */
        fun algVersion(algVersion: String) = algVersion(JsonField.of(algVersion))

        /**
         * Sets [Builder.algVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.algVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun algVersion(algVersion: JsonField<String>) = apply { this.algVersion = algVersion }

        /** Number of dimensions of the geometry depicted by region. */
        fun andims(andims: Int) = andims(JsonField.of(andims))

        /**
         * Sets [Builder.andims] to an arbitrary JSON value.
         *
         * You should usually call [Builder.andims] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun andims(andims: JsonField<Int>) = apply { this.andims = andims }

        /**
         * Optional geographical region or polygon (lat/lon pairs) of the area surrounding the Point
         * of Interest as projected on the ground.
         */
        fun area(area: String) = area(JsonField.of(area))

        /**
         * Sets [Builder.area] to an arbitrary JSON value.
         *
         * You should usually call [Builder.area] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun area(area: JsonField<String>) = apply { this.area = area }

        /** Geographical spatial_ref_sys for region. */
        fun asrid(asrid: Int) = asrid(JsonField.of(asrid))

        /**
         * Sets [Builder.asrid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asrid] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun asrid(asrid: JsonField<Int>) = apply { this.asrid = asrid }

        /**
         * Geographical region or polygon (lon/lat pairs), as depicted by the Well-Known Text
         * representation of the geometry/geography, of the image as projected on the ground. WKT
         * reference: https://www.opengeospatial.org/standards/wkt-crs. Ignored if included with a
         * POST or PUT request that also specifies a valid 'area' field.
         */
        fun atext(atext: String) = atext(JsonField.of(atext))

        /**
         * Sets [Builder.atext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.atext] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun atext(atext: JsonField<String>) = apply { this.atext = atext }

        /** Type of region as projected on the ground. */
        fun atype(atype: String) = atype(JsonField.of(atype))

        /**
         * Sets [Builder.atype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.atype] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun atype(atype: JsonField<String>) = apply { this.atype = atype }

        /**
         * Average pulse repetition frequency of the emitter, measured in hertz. PRF is the number
         * of pulses transmitted per second. This is the reciprocal of the avgPRI (Pulse Repetition
         * Interval) value.
         */
        fun avgPrf(avgPrf: Double) = avgPrf(JsonField.of(avgPrf))

        /**
         * Sets [Builder.avgPrf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgPrf] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avgPrf(avgPrf: JsonField<Double>) = apply { this.avgPrf = avgPrf }

        /**
         * Average pulse repetition interval of the emitter, measured in microseconds. The interval
         * between the start of one pulse and the start of another.
         */
        fun avgPri(avgPri: Double) = avgPri(JsonField.of(avgPri))

        /**
         * Sets [Builder.avgPri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgPri] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avgPri(avgPri: JsonField<Double>) = apply { this.avgPri = avgPri }

        /**
         * Average pulse width of the emitter, measured in nanoseconds. This is the average duration
         * of the pulse.
         */
        fun avgPw(avgPw: Double) = avgPw(JsonField.of(avgPw))

        /**
         * Sets [Builder.avgPw] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgPw] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avgPw(avgPw: JsonField<Double>) = apply { this.avgPw = avgPw }

        /** The detected signal frequency in megahertz. */
        fun centerFreq(centerFreq: Double) = centerFreq(JsonField.of(centerFreq))

        /**
         * Sets [Builder.centerFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.centerFreq] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun centerFreq(centerFreq: JsonField<Double>) = apply { this.centerFreq = centerFreq }

        /** The name(s) of the subset of constellation spacecraft that made this detection. */
        fun cluster(cluster: String) = cluster(JsonField.of(cluster))

        /**
         * Sets [Builder.cluster] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cluster] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cluster(cluster: JsonField<String>) = apply { this.cluster = cluster }

        /**
         * The area of the confidence ellipse specified in meters squared to contain the emitter
         * with a 95% probability.
         */
        fun confArea(confArea: Double) = confArea(JsonField.of(confArea))

        /**
         * Sets [Builder.confArea] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confArea] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun confArea(confArea: JsonField<Double>) = apply { this.confArea = confArea }

        /** The name of the satellite constellation. */
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

        /**
         * Specifies the creation time associated with the order in ISO 8601 UTC with microsecond
         * precision.
         */
        fun createdTs(createdTs: OffsetDateTime) = createdTs(JsonField.of(createdTs))

        /**
         * Sets [Builder.createdTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdTs] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdTs(createdTs: JsonField<OffsetDateTime>) = apply { this.createdTs = createdTs }

        /** The altitude relative to WGS-84 ellipsoid, in meters. */
        fun detectAlt(detectAlt: Double) = detectAlt(JsonField.of(detectAlt))

        /**
         * Sets [Builder.detectAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detectAlt] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun detectAlt(detectAlt: JsonField<Double>) = apply { this.detectAlt = detectAlt }

        /**
         * WGS-84 latitude of the most likely emitter location coordinate point, in degrees. -90 to
         * 90 degrees (negative values south of equator).
         */
        fun detectLat(detectLat: Double) = detectLat(JsonField.of(detectLat))

        /**
         * Sets [Builder.detectLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detectLat] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun detectLat(detectLat: JsonField<Double>) = apply { this.detectLat = detectLat }

        /**
         * WGS-84 longitude of the most likely emitter location coordinate point, in degrees. -180
         * to 180 degrees (negative values west of Prime Meridian).
         */
        fun detectLon(detectLon: Double) = detectLon(JsonField.of(detectLon))

        /**
         * Sets [Builder.detectLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detectLon] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun detectLon(detectLon: JsonField<Double>) = apply { this.detectLon = detectLon }

        /**
         * The end time for this Emitter Geo Location data set in ISO 8601 UTC with microsecond
         * precision.
         */
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
         * Confidence ellipsoid about the detection location
         * [semi-major axis (meters), semi-minor axis (meters), orientation (degrees) measured clockwise (0-360 from true north)].
         */
        fun errEllp(errEllp: List<Double>) = errEllp(JsonField.of(errEllp))

        /**
         * Sets [Builder.errEllp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errEllp] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errEllp(errEllp: JsonField<List<Double>>) = apply {
            this.errEllp = errEllp.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.errEllp].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addErrEllp(errEllp: Double) = apply {
            this.errEllp =
                (this.errEllp ?: JsonField.of(mutableListOf())).also {
                    checkKnown("errEllp", it).add(errEllp)
                }
        }

        /**
         * Optional ID from external systems. This field has no meaning within UDL and is provided
         * as a convenience for systems that require tracking of an internal system generated ID.
         */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * Unique identifier of the satellite used to identify and geolocate Emitter signals of
         * interest. This ID can be used to obtain additional information on an OnOrbit object using
         * the 'get by ID' operation (e.g. /udl/onorbit/{id}). For example, the onorbit object with
         * idOnOrbit = abc would be queried as /udl/onorbit/abc. Used when Emitter geolocation is
         * done by a single satellite.
         */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /**
         * Optional identifier of the geolocated signal of interest RF Emitter for this observation.
         * This ID can be used to obtain additional information on an RF Emitter object using the
         * 'get by ID' operation (e.g. /udl/rfemitter/{id}). For example, the rfemitter object with
         * idRFEmitter = abc would be queried as /udl/rfemitter/abc.
         */
        fun idRfEmitter(idRfEmitter: String) = idRfEmitter(JsonField.of(idRfEmitter))

        /**
         * Sets [Builder.idRfEmitter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idRfEmitter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idRfEmitter(idRfEmitter: JsonField<String>) = apply { this.idRfEmitter = idRfEmitter }

        /**
         * Unique identifier of the reporting sensor. This ID can be used to obtain additional
         * information on a sensor using the 'get by ID' operation (e.g. /udl/sensor/{id}). For
         * example, the sensor with idSensor = abc would be queried as /udl/sensor/abc. Used when
         * Emitter geolocation is done by a single sensor.
         */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

        /** The maximum detected frequency in megahertz. */
        fun maxFreq(maxFreq: Double) = maxFreq(JsonField.of(maxFreq))

        /**
         * Sets [Builder.maxFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxFreq] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxFreq(maxFreq: JsonField<Double>) = apply { this.maxFreq = maxFreq }

        /**
         * Maximum pulse repetition frequency of the emitter, measured in hertz. PRF is the number
         * of pulses transmitted per second. This is the reciprocal of the minPRI (Pulse Repetition
         * Interval) value.
         */
        fun maxPrf(maxPrf: Double) = maxPrf(JsonField.of(maxPrf))

        /**
         * Sets [Builder.maxPrf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxPrf] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxPrf(maxPrf: JsonField<Double>) = apply { this.maxPrf = maxPrf }

        /**
         * Maximum pulse repetition interval of the emitter, measured in microseconds. The interval
         * between the start of one pulse and the start of another.
         */
        fun maxPri(maxPri: Double) = maxPri(JsonField.of(maxPri))

        /**
         * Sets [Builder.maxPri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxPri] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxPri(maxPri: JsonField<Double>) = apply { this.maxPri = maxPri }

        /**
         * Maximum pulse width of the emitter, measured in nanoseconds. This is the maximum duration
         * of the pulse.
         */
        fun maxPw(maxPw: Double) = maxPw(JsonField.of(maxPw))

        /**
         * Sets [Builder.maxPw] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxPw] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxPw(maxPw: JsonField<Double>) = apply { this.maxPw = maxPw }

        /** The minimum detected frequency in megahertz. */
        fun minFreq(minFreq: Double) = minFreq(JsonField.of(minFreq))

        /**
         * Sets [Builder.minFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minFreq] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minFreq(minFreq: JsonField<Double>) = apply { this.minFreq = minFreq }

        /**
         * Minimum pulse repetition frequency of the emitter, measured in hertz. PRF is the number
         * of pulses transmitted per second. This is the reciprocal of the maxPRI (Pulse Repetition
         * Interval) value.
         */
        fun minPrf(minPrf: Double) = minPrf(JsonField.of(minPrf))

        /**
         * Sets [Builder.minPrf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minPrf] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minPrf(minPrf: JsonField<Double>) = apply { this.minPrf = minPrf }

        /**
         * Minimum pulse repetition interval of the emitter, measured in microseconds. The interval
         * between the start of one pulse and the start of another.
         */
        fun minPri(minPri: Double) = minPri(JsonField.of(minPri))

        /**
         * Sets [Builder.minPri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minPri] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minPri(minPri: JsonField<Double>) = apply { this.minPri = minPri }

        /**
         * Minimum pulse width of the emitter, measured in nanoseconds. This is the minimum duration
         * of the pulse.
         */
        fun minPw(minPw: Double) = minPw(JsonField.of(minPw))

        /**
         * Sets [Builder.minPw] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minPw] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minPw(minPw: JsonField<Double>) = apply { this.minPw = minPw }

        /** The count of single-burst observations used for this geolocation observation. */
        fun numBursts(numBursts: Int) = numBursts(JsonField.of(numBursts))

        /**
         * Sets [Builder.numBursts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numBursts] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numBursts(numBursts: JsonField<Int>) = apply { this.numBursts = numBursts }

        /** Model object representing on-orbit objects or satellites in the system. */
        fun onOrbit(onOrbit: OnorbitFull) = onOrbit(JsonField.of(onOrbit))

        /**
         * Sets [Builder.onOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onOrbit] with a well-typed [OnorbitFull] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun onOrbit(onOrbit: JsonField<OnorbitFull>) = apply { this.onOrbit = onOrbit }

        /** The order identifier for this Emitter Geo Location data set. */
        fun orderId(orderId: String) = orderId(JsonField.of(orderId))

        /**
         * Sets [Builder.orderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

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
         * Optional identifier of the satellite used to identify and geolocate Emitter signals of
         * interest of this observation. This may be an internal identifier and not necessarily a
         * valid satellite number. Used when Emitter geolocation is done by a single satellite.
         */
        fun origObjectId(origObjectId: String) = origObjectId(JsonField.of(origObjectId))

        /**
         * Sets [Builder.origObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origObjectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origObjectId(origObjectId: JsonField<String>) = apply {
            this.origObjectId = origObjectId
        }

        /**
         * Optional identifier of the emitter of interest for this observation. This may be an
         * internal identifier and not necessarily a valid emitter Id.
         */
        fun origRfEmitterId(origRfEmitterId: String) =
            origRfEmitterId(JsonField.of(origRfEmitterId))

        /**
         * Sets [Builder.origRfEmitterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origRfEmitterId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun origRfEmitterId(origRfEmitterId: JsonField<String>) = apply {
            this.origRfEmitterId = origRfEmitterId
        }

        /**
         * Optional identifier provided by observation source to indicate the sensor identifier
         * which produced this Emitter Geo Location. This may be an internal identifier and not
         * necessarily a valid sensor ID. Used when Emitter geolocation is done by a single sensor.
         */
        fun origSensorId(origSensorId: String) = origSensorId(JsonField.of(origSensorId))

        /**
         * Sets [Builder.origSensorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origSensorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origSensorId(origSensorId: JsonField<String>) = apply {
            this.origSensorId = origSensorId
        }

        /**
         * Optional external identifier referencing the entity used in the calculation of the
         * geolocation.
         */
        fun passGroupId(passGroupId: String) = passGroupId(JsonField.of(passGroupId))

        /**
         * Sets [Builder.passGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.passGroupId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun passGroupId(passGroupId: JsonField<String>) = apply { this.passGroupId = passGroupId }

        /**
         * Describes the form of the emitted pulse and how its signal varies within the pulse
         * duration (e.g. GAUSSIAN, RECTANGULAR, TRAPEZOIDAL, etc.).
         */
        fun pulseShape(pulseShape: String) = pulseShape(JsonField.of(pulseShape))

        /**
         * Sets [Builder.pulseShape] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pulseShape] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pulseShape(pulseShape: JsonField<String>) = apply { this.pulseShape = pulseShape }

        /**
         * The time representing the mean of the constituent single-burst observations in ISO 8601
         * UTC with microsecond precision.
         */
        fun receivedTs(receivedTs: OffsetDateTime) = receivedTs(JsonField.of(receivedTs))

        /**
         * Sets [Builder.receivedTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivedTs] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receivedTs(receivedTs: JsonField<OffsetDateTime>) = apply {
            this.receivedTs = receivedTs
        }

        /**
         * Satellite/catalog number of the on-orbit spacecraft used to identify and geolocate
         * Emitter signals of interest of this detection. Used when Emitter geolocation is done by a
         * single satellite.
         */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /** The name of the signal of interest. */
        fun signalOfInterest(signalOfInterest: String) =
            signalOfInterest(JsonField.of(signalOfInterest))

        /**
         * Sets [Builder.signalOfInterest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signalOfInterest] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun signalOfInterest(signalOfInterest: JsonField<String>) = apply {
            this.signalOfInterest = signalOfInterest
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

        /**
         * Optional array of provider/source specific tags for this data, where each element is no
         * longer than 32 characters, used for implementing data owner conditional access controls
         * to restrict access to the data. Should be left null by data providers unless conditional
         * access controls are coordinated with the UDL team.
         */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
         * Returns an immutable instance of [EmitterGeolocationRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .signalOfInterestType()
         * .source()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmitterGeolocationRetrieveResponse =
            EmitterGeolocationRetrieveResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("signalOfInterestType", signalOfInterestType),
                checkRequired("source", source),
                checkRequired("startTime", startTime),
                id,
                agjson,
                algVersion,
                andims,
                area,
                asrid,
                atext,
                atype,
                avgPrf,
                avgPri,
                avgPw,
                centerFreq,
                cluster,
                confArea,
                constellation,
                createdAt,
                createdBy,
                createdTs,
                detectAlt,
                detectLat,
                detectLon,
                endTime,
                (errEllp ?: JsonMissing.of()).map { it.toImmutable() },
                externalId,
                idOnOrbit,
                idRfEmitter,
                idSensor,
                maxFreq,
                maxPrf,
                maxPri,
                maxPw,
                minFreq,
                minPrf,
                minPri,
                minPw,
                numBursts,
                onOrbit,
                orderId,
                origin,
                origNetwork,
                origObjectId,
                origRfEmitterId,
                origSensorId,
                passGroupId,
                pulseShape,
                receivedTs,
                satNo,
                signalOfInterest,
                sourceDl,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EmitterGeolocationRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        signalOfInterestType()
        source()
        startTime()
        id()
        agjson()
        algVersion()
        andims()
        area()
        asrid()
        atext()
        atype()
        avgPrf()
        avgPri()
        avgPw()
        centerFreq()
        cluster()
        confArea()
        constellation()
        createdAt()
        createdBy()
        createdTs()
        detectAlt()
        detectLat()
        detectLon()
        endTime()
        errEllp()
        externalId()
        idOnOrbit()
        idRfEmitter()
        idSensor()
        maxFreq()
        maxPrf()
        maxPri()
        maxPw()
        minFreq()
        minPrf()
        minPri()
        minPw()
        numBursts()
        onOrbit().ifPresent { it.validate() }
        orderId()
        origin()
        origNetwork()
        origObjectId()
        origRfEmitterId()
        origSensorId()
        passGroupId()
        pulseShape()
        receivedTs()
        satNo()
        signalOfInterest()
        sourceDl()
        tags()
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
            (if (signalOfInterestType.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (agjson.asKnown().isPresent) 1 else 0) +
            (if (algVersion.asKnown().isPresent) 1 else 0) +
            (if (andims.asKnown().isPresent) 1 else 0) +
            (if (area.asKnown().isPresent) 1 else 0) +
            (if (asrid.asKnown().isPresent) 1 else 0) +
            (if (atext.asKnown().isPresent) 1 else 0) +
            (if (atype.asKnown().isPresent) 1 else 0) +
            (if (avgPrf.asKnown().isPresent) 1 else 0) +
            (if (avgPri.asKnown().isPresent) 1 else 0) +
            (if (avgPw.asKnown().isPresent) 1 else 0) +
            (if (centerFreq.asKnown().isPresent) 1 else 0) +
            (if (cluster.asKnown().isPresent) 1 else 0) +
            (if (confArea.asKnown().isPresent) 1 else 0) +
            (if (constellation.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (createdTs.asKnown().isPresent) 1 else 0) +
            (if (detectAlt.asKnown().isPresent) 1 else 0) +
            (if (detectLat.asKnown().isPresent) 1 else 0) +
            (if (detectLon.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (errEllp.asKnown().getOrNull()?.size ?: 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idRfEmitter.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (maxFreq.asKnown().isPresent) 1 else 0) +
            (if (maxPrf.asKnown().isPresent) 1 else 0) +
            (if (maxPri.asKnown().isPresent) 1 else 0) +
            (if (maxPw.asKnown().isPresent) 1 else 0) +
            (if (minFreq.asKnown().isPresent) 1 else 0) +
            (if (minPrf.asKnown().isPresent) 1 else 0) +
            (if (minPri.asKnown().isPresent) 1 else 0) +
            (if (minPw.asKnown().isPresent) 1 else 0) +
            (if (numBursts.asKnown().isPresent) 1 else 0) +
            (onOrbit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (orderId.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (origRfEmitterId.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (if (passGroupId.asKnown().isPresent) 1 else 0) +
            (if (pulseShape.asKnown().isPresent) 1 else 0) +
            (if (receivedTs.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (signalOfInterest.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0)

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

        return other is EmitterGeolocationRetrieveResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            signalOfInterestType == other.signalOfInterestType &&
            source == other.source &&
            startTime == other.startTime &&
            id == other.id &&
            agjson == other.agjson &&
            algVersion == other.algVersion &&
            andims == other.andims &&
            area == other.area &&
            asrid == other.asrid &&
            atext == other.atext &&
            atype == other.atype &&
            avgPrf == other.avgPrf &&
            avgPri == other.avgPri &&
            avgPw == other.avgPw &&
            centerFreq == other.centerFreq &&
            cluster == other.cluster &&
            confArea == other.confArea &&
            constellation == other.constellation &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            createdTs == other.createdTs &&
            detectAlt == other.detectAlt &&
            detectLat == other.detectLat &&
            detectLon == other.detectLon &&
            endTime == other.endTime &&
            errEllp == other.errEllp &&
            externalId == other.externalId &&
            idOnOrbit == other.idOnOrbit &&
            idRfEmitter == other.idRfEmitter &&
            idSensor == other.idSensor &&
            maxFreq == other.maxFreq &&
            maxPrf == other.maxPrf &&
            maxPri == other.maxPri &&
            maxPw == other.maxPw &&
            minFreq == other.minFreq &&
            minPrf == other.minPrf &&
            minPri == other.minPri &&
            minPw == other.minPw &&
            numBursts == other.numBursts &&
            onOrbit == other.onOrbit &&
            orderId == other.orderId &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            origRfEmitterId == other.origRfEmitterId &&
            origSensorId == other.origSensorId &&
            passGroupId == other.passGroupId &&
            pulseShape == other.pulseShape &&
            receivedTs == other.receivedTs &&
            satNo == other.satNo &&
            signalOfInterest == other.signalOfInterest &&
            sourceDl == other.sourceDl &&
            tags == other.tags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            signalOfInterestType,
            source,
            startTime,
            id,
            agjson,
            algVersion,
            andims,
            area,
            asrid,
            atext,
            atype,
            avgPrf,
            avgPri,
            avgPw,
            centerFreq,
            cluster,
            confArea,
            constellation,
            createdAt,
            createdBy,
            createdTs,
            detectAlt,
            detectLat,
            detectLon,
            endTime,
            errEllp,
            externalId,
            idOnOrbit,
            idRfEmitter,
            idSensor,
            maxFreq,
            maxPrf,
            maxPri,
            maxPw,
            minFreq,
            minPrf,
            minPri,
            minPw,
            numBursts,
            onOrbit,
            orderId,
            origin,
            origNetwork,
            origObjectId,
            origRfEmitterId,
            origSensorId,
            passGroupId,
            pulseShape,
            receivedTs,
            satNo,
            signalOfInterest,
            sourceDl,
            tags,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmitterGeolocationRetrieveResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, signalOfInterestType=$signalOfInterestType, source=$source, startTime=$startTime, id=$id, agjson=$agjson, algVersion=$algVersion, andims=$andims, area=$area, asrid=$asrid, atext=$atext, atype=$atype, avgPrf=$avgPrf, avgPri=$avgPri, avgPw=$avgPw, centerFreq=$centerFreq, cluster=$cluster, confArea=$confArea, constellation=$constellation, createdAt=$createdAt, createdBy=$createdBy, createdTs=$createdTs, detectAlt=$detectAlt, detectLat=$detectLat, detectLon=$detectLon, endTime=$endTime, errEllp=$errEllp, externalId=$externalId, idOnOrbit=$idOnOrbit, idRfEmitter=$idRfEmitter, idSensor=$idSensor, maxFreq=$maxFreq, maxPrf=$maxPrf, maxPri=$maxPri, maxPw=$maxPw, minFreq=$minFreq, minPrf=$minPrf, minPri=$minPri, minPw=$minPw, numBursts=$numBursts, onOrbit=$onOrbit, orderId=$orderId, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origRfEmitterId=$origRfEmitterId, origSensorId=$origSensorId, passGroupId=$passGroupId, pulseShape=$pulseShape, receivedTs=$receivedTs, satNo=$satNo, signalOfInterest=$signalOfInterest, sourceDl=$sourceDl, tags=$tags, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sarobservation

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

/**
 * Model representation of observation data for SAR based sensor phenomenologies. J2000 is the
 * preferred coordinate frame for all observations, but in some cases observations may be in another
 * frame depending on the provider. Please see the 'Discover' tab in the storefront to confirm
 * coordinate frames by data provider.
 */
class SarObservationTupleResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val collectionEnd: JsonField<OffsetDateTime>,
    private val collectionStart: JsonField<OffsetDateTime>,
    private val dataMode: JsonField<DataMode>,
    private val sarMode: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val agjson: JsonField<String>,
    private val andims: JsonField<Int>,
    private val area: JsonField<String>,
    private val asrid: JsonField<Int>,
    private val atext: JsonField<String>,
    private val atype: JsonField<String>,
    private val azimuthAngle: JsonField<Double>,
    private val centerTime: JsonField<OffsetDateTime>,
    private val collectionId: JsonField<String>,
    private val continuousSpotAngle: JsonField<Double>,
    private val coordSys: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val detectionEnd: JsonField<OffsetDateTime>,
    private val detectionId: JsonField<String>,
    private val detectionStart: JsonField<OffsetDateTime>,
    private val dwellTime: JsonField<Double>,
    private val externalId: JsonField<String>,
    private val farRange: JsonField<Double>,
    private val grazeAngle: JsonField<Double>,
    private val groundResolutionProjection: JsonField<Double>,
    private val idOnOrbit: JsonField<String>,
    private val idSensor: JsonField<String>,
    private val incidenceAngle: JsonField<Double>,
    private val looksAzimuth: JsonField<Int>,
    private val looksRange: JsonField<Int>,
    private val multilookNumber: JsonField<Double>,
    private val nearRange: JsonField<Double>,
    private val obDirection: JsonField<String>,
    private val onOrbit: JsonField<OnorbitFull>,
    private val operatingBand: JsonField<String>,
    private val operatingFreq: JsonField<Double>,
    private val orbitState: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val pulseBandwidth: JsonField<Double>,
    private val pulseDuration: JsonField<Double>,
    private val resolutionAzimuth: JsonField<Double>,
    private val resolutionRange: JsonField<Double>,
    private val rxPolarization: JsonField<String>,
    private val satNo: JsonField<Int>,
    private val senalt: JsonField<Double>,
    private val senlatEnd: JsonField<Double>,
    private val senlatStart: JsonField<Double>,
    private val senlonEnd: JsonField<Double>,
    private val senlonStart: JsonField<Double>,
    private val senvelx: JsonField<Double>,
    private val senvely: JsonField<Double>,
    private val senvelz: JsonField<Double>,
    private val slantRange: JsonField<Double>,
    private val snr: JsonField<Double>,
    private val sourceDl: JsonField<String>,
    private val spacingAzimuth: JsonField<Double>,
    private val spacingRange: JsonField<Double>,
    private val squintAngle: JsonField<Double>,
    private val srcIds: JsonField<List<String>>,
    private val srcTyps: JsonField<List<String>>,
    private val swathLength: JsonField<Double>,
    private val tags: JsonField<List<String>>,
    private val targetposx: JsonField<Double>,
    private val targetposy: JsonField<Double>,
    private val targetposz: JsonField<Double>,
    private val transactionId: JsonField<String>,
    private val txPolarization: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("collectionEnd")
        @ExcludeMissing
        collectionEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("collectionStart")
        @ExcludeMissing
        collectionStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("sarMode") @ExcludeMissing sarMode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agjson") @ExcludeMissing agjson: JsonField<String> = JsonMissing.of(),
        @JsonProperty("andims") @ExcludeMissing andims: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("area") @ExcludeMissing area: JsonField<String> = JsonMissing.of(),
        @JsonProperty("asrid") @ExcludeMissing asrid: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("atext") @ExcludeMissing atext: JsonField<String> = JsonMissing.of(),
        @JsonProperty("atype") @ExcludeMissing atype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("azimuthAngle")
        @ExcludeMissing
        azimuthAngle: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("centerTime")
        @ExcludeMissing
        centerTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("collectionId")
        @ExcludeMissing
        collectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("continuousSpotAngle")
        @ExcludeMissing
        continuousSpotAngle: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("coordSys") @ExcludeMissing coordSys: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("detectionEnd")
        @ExcludeMissing
        detectionEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("detectionId")
        @ExcludeMissing
        detectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("detectionStart")
        @ExcludeMissing
        detectionStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dwellTime") @ExcludeMissing dwellTime: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("externalId")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("farRange") @ExcludeMissing farRange: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("grazeAngle")
        @ExcludeMissing
        grazeAngle: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("groundResolutionProjection")
        @ExcludeMissing
        groundResolutionProjection: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("incidenceAngle")
        @ExcludeMissing
        incidenceAngle: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("looksAzimuth")
        @ExcludeMissing
        looksAzimuth: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("looksRange") @ExcludeMissing looksRange: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("multilookNumber")
        @ExcludeMissing
        multilookNumber: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("nearRange") @ExcludeMissing nearRange: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("obDirection")
        @ExcludeMissing
        obDirection: JsonField<String> = JsonMissing.of(),
        @JsonProperty("onOrbit") @ExcludeMissing onOrbit: JsonField<OnorbitFull> = JsonMissing.of(),
        @JsonProperty("operatingBand")
        @ExcludeMissing
        operatingBand: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operatingFreq")
        @ExcludeMissing
        operatingFreq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("orbitState")
        @ExcludeMissing
        orbitState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origSensorId")
        @ExcludeMissing
        origSensorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pulseBandwidth")
        @ExcludeMissing
        pulseBandwidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pulseDuration")
        @ExcludeMissing
        pulseDuration: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("resolutionAzimuth")
        @ExcludeMissing
        resolutionAzimuth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("resolutionRange")
        @ExcludeMissing
        resolutionRange: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rxPolarization")
        @ExcludeMissing
        rxPolarization: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("senalt") @ExcludeMissing senalt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlatEnd") @ExcludeMissing senlatEnd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlatStart")
        @ExcludeMissing
        senlatStart: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlonEnd") @ExcludeMissing senlonEnd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlonStart")
        @ExcludeMissing
        senlonStart: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senvelx") @ExcludeMissing senvelx: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senvely") @ExcludeMissing senvely: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senvelz") @ExcludeMissing senvelz: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("slantRange")
        @ExcludeMissing
        slantRange: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("snr") @ExcludeMissing snr: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spacingAzimuth")
        @ExcludeMissing
        spacingAzimuth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("spacingRange")
        @ExcludeMissing
        spacingRange: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("squintAngle")
        @ExcludeMissing
        squintAngle: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("srcIds") @ExcludeMissing srcIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("srcTyps")
        @ExcludeMissing
        srcTyps: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("swathLength")
        @ExcludeMissing
        swathLength: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("targetposx")
        @ExcludeMissing
        targetposx: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("targetposy")
        @ExcludeMissing
        targetposy: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("targetposz")
        @ExcludeMissing
        targetposz: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("txPolarization")
        @ExcludeMissing
        txPolarization: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        collectionEnd,
        collectionStart,
        dataMode,
        sarMode,
        source,
        id,
        agjson,
        andims,
        area,
        asrid,
        atext,
        atype,
        azimuthAngle,
        centerTime,
        collectionId,
        continuousSpotAngle,
        coordSys,
        createdAt,
        createdBy,
        detectionEnd,
        detectionId,
        detectionStart,
        dwellTime,
        externalId,
        farRange,
        grazeAngle,
        groundResolutionProjection,
        idOnOrbit,
        idSensor,
        incidenceAngle,
        looksAzimuth,
        looksRange,
        multilookNumber,
        nearRange,
        obDirection,
        onOrbit,
        operatingBand,
        operatingFreq,
        orbitState,
        origin,
        origNetwork,
        origObjectId,
        origSensorId,
        pulseBandwidth,
        pulseDuration,
        resolutionAzimuth,
        resolutionRange,
        rxPolarization,
        satNo,
        senalt,
        senlatEnd,
        senlatStart,
        senlonEnd,
        senlonStart,
        senvelx,
        senvely,
        senvelz,
        slantRange,
        snr,
        sourceDl,
        spacingAzimuth,
        spacingRange,
        squintAngle,
        srcIds,
        srcTyps,
        swathLength,
        tags,
        targetposx,
        targetposy,
        targetposz,
        transactionId,
        txPolarization,
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
     * Collection end time in ISO 8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun collectionEnd(): OffsetDateTime = collectionEnd.getRequired("collectionEnd")

    /**
     * Collection start time in ISO 8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun collectionStart(): OffsetDateTime = collectionStart.getRequired("collectionStart")

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
     * Collection mode setting for this collection (e.g. AREA, SPOTLIGHT, STRIP, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sarMode(): String = sarMode.getRequired("sarMode")

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
     * Number of dimensions of the geometry depicted by region.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun andims(): Optional<Int> = andims.getOptional("andims")

    /**
     * Optional geographical region or polygon (lat/lon pairs) of the area surrounding the image
     * event as projected on the ground.
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
     * Type of region as projected on the ground (POLYGON, POINT, LINE).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun atype(): Optional<String> = atype.getOptional("atype")

    /**
     * The azimuth angle, in degrees, of the SAR satellite nadir subpoint measured clockwise from
     * true north at the subpoint.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azimuthAngle(): Optional<Double> = azimuthAngle.getOptional("azimuthAngle")

    /**
     * The datetime at the center point of the collection in ISO 8601 UTC format with microsecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun centerTime(): Optional<OffsetDateTime> = centerTime.getOptional("centerTime")

    /**
     * Optional identifier to indicate the specific collection tasking which produced this
     * observation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun collectionId(): Optional<String> = collectionId.getOptional("collectionId")

    /**
     * Required sweep angle for the continuous spot scene in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun continuousSpotAngle(): Optional<Double> =
        continuousSpotAngle.getOptional("continuousSpotAngle")

    /**
     * The coordinate system used for the sensor velocity and target position vectors for the
     * collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coordSys(): Optional<String> = coordSys.getOptional("coordSys")

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
     * The detection end time in ISO 8601 UTC format, with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun detectionEnd(): Optional<OffsetDateTime> = detectionEnd.getOptional("detectionEnd")

    /**
     * Identifier of the specific detection within a collection which produced this observation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun detectionId(): Optional<String> = detectionId.getOptional("detectionId")

    /**
     * The detection start time in ISO 8601 UTC format, with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun detectionStart(): Optional<OffsetDateTime> = detectionStart.getOptional("detectionStart")

    /**
     * The duration, in seconds, of this detection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dwellTime(): Optional<Double> = dwellTime.getOptional("dwellTime")

    /**
     * Optional ID from external systems. This field has no meaning within UDL and is provided as a
     * convenience for systems that require tracking of an internal system generated ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("externalId")

    /**
     * Specifies the farthest range, in kilometers, from the flight path to target during the
     * collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun farRange(): Optional<Double> = farRange.getOptional("farRange")

    /**
     * The graze angle (also referred to as look angle) for the collection in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun grazeAngle(): Optional<Double> = grazeAngle.getOptional("grazeAngle")

    /**
     * Distance between independent measurements, representing the physical dimension that
     * represents a pixel of the image.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun groundResolutionProjection(): Optional<Double> =
        groundResolutionProjection.getOptional("groundResolutionProjection")

    /**
     * Unique identifier of the spacecraft hosting the sensor associated with this collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Unique identifier of the reporting sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

    /**
     * The center incidence angle in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun incidenceAngle(): Optional<Double> = incidenceAngle.getOptional("incidenceAngle")

    /**
     * The number of looks in the azimuth direction.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun looksAzimuth(): Optional<Int> = looksAzimuth.getOptional("looksAzimuth")

    /**
     * The number of looks in the range direction.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun looksRange(): Optional<Int> = looksRange.getOptional("looksRange")

    /**
     * Averages the input synthetic aperture radar (SAR) data by looks in range and azimuth to
     * approximate square pixels, mitigates speckle, and reduces SAR tool processing time.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun multilookNumber(): Optional<Double> = multilookNumber.getOptional("multilookNumber")

    /**
     * Specifies the closest range, in kilometers, from the flight path to target during the
     * collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nearRange(): Optional<Double> = nearRange.getOptional("nearRange")

    /**
     * The antenna pointing direction (LEFT, RIGHT).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun obDirection(): Optional<String> = obDirection.getOptional("obDirection")

    /**
     * Model object representing on-orbit objects or satellites in the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun onOrbit(): Optional<OnorbitFull> = onOrbit.getOptional("onOrbit")

    /**
     * Name of the band containing operating frequency for the collection (e.g. C, E, EHF, HF, K,
     * Ka, Ku, L, Q, S, SHF, UNK, UHF, V, VHF, VLF, W, X). See RFBandType for more details and
     * descriptions of each band name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operatingBand(): Optional<String> = operatingBand.getOptional("operatingBand")

    /**
     * The operating frequency, in Mhz, for the collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operatingFreq(): Optional<Double> = operatingFreq.getOptional("operatingFreq")

    /**
     * The orbital direction (ASCENDING, DESCENDING) of the platform during the collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun orbitState(): Optional<String> = orbitState.getOptional("orbitState")

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
     * Optional identifier provided by the source to indicate the onorbit object hosting the sensor
     * associated with this collection. This may be an internal identifier and not necessarily a
     * valid satellite number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Optional identifier provided by the source to indicate the sensor for this collection. This
     * may be an internal identifier and not necessarily a valid sensor ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

    /**
     * The bandwidth frequency of the pulse in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pulseBandwidth(): Optional<Double> = pulseBandwidth.getOptional("pulseBandwidth")

    /**
     * The duration of a pulse in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pulseDuration(): Optional<Double> = pulseDuration.getOptional("pulseDuration")

    /**
     * The resolution in the azimuth direction measured in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun resolutionAzimuth(): Optional<Double> = resolutionAzimuth.getOptional("resolutionAzimuth")

    /**
     * The resolution in the range direction measured in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun resolutionRange(): Optional<Double> = resolutionRange.getOptional("resolutionRange")

    /**
     * Receive polarization e.g. H - (Horizontally Polarized) Perpendicular to Earth's surface, V -
     * (Vertically Polarized) Parallel to Earth's surface, L - (Left Hand Circularly Polarized)
     * Rotating left relative to the earth's surface, R - (Right Hand Circularly Polarized) Rotating
     * right relative to the earth's surface.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rxPolarization(): Optional<String> = rxPolarization.getOptional("rxPolarization")

    /**
     * Satellite/Catalog number of the spacecraft hosting the sensor associated with this
     * collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Sensor altitude during collection in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senalt(): Optional<Double> = senalt.getOptional("senalt")

    /**
     * WGS-84 sensor latitude sub-point at collect end time (collectionEnd), represented as -90 to
     * 90 degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senlatEnd(): Optional<Double> = senlatEnd.getOptional("senlatEnd")

    /**
     * WGS-84 sensor latitude sub-point at collect start time (collectionStart), represented as -90
     * to 90 degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senlatStart(): Optional<Double> = senlatStart.getOptional("senlatStart")

    /**
     * WGS-84 sensor longitude sub-point at collect end time (collectionEnd), represented as -180 to
     * 180 degrees (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senlonEnd(): Optional<Double> = senlonEnd.getOptional("senlonEnd")

    /**
     * WGS-84 sensor longitude sub-point at collect start time (collectionStart), represented as
     * -180 to 180 degrees (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senlonStart(): Optional<Double> = senlonStart.getOptional("senlonStart")

    /**
     * Sensor platform X-velocity during collection in kilometers/second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senvelx(): Optional<Double> = senvelx.getOptional("senvelx")

    /**
     * Sensor platform Y-velocity during collection in kilometers/second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senvely(): Optional<Double> = senvely.getOptional("senvely")

    /**
     * Sensor platform Z-velocity during collection in kilometers/second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senvelz(): Optional<Double> = senvelz.getOptional("senvelz")

    /**
     * Slant distance from sensor to center point of imaging event in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun slantRange(): Optional<Double> = slantRange.getOptional("slantRange")

    /**
     * Signal to noise ratio, in dB.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun snr(): Optional<Double> = snr.getOptional("snr")

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
     * The pixel spacing in the azimuth direction measured in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spacingAzimuth(): Optional<Double> = spacingAzimuth.getOptional("spacingAzimuth")

    /**
     * The pixel spacing in the range direction measured in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spacingRange(): Optional<Double> = spacingRange.getOptional("spacingRange")

    /**
     * The squint angle for the collection in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun squintAngle(): Optional<Double> = squintAngle.getOptional("squintAngle")

    /**
     * Array of UUIDs of the UDL data records that are related to the SAR Observation. See the
     * associated 'srcTyps' array for the specific types of data, positionally corresponding to the
     * UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in size. See the
     * corresponding srcTyps array element for the data type of the UUID and use the appropriate API
     * operation to retrieve that object (e.g. /udl/sarobservation/{uuid}).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun srcIds(): Optional<List<String>> = srcIds.getOptional("srcIds")

    /**
     * Array of UDL record types (e.g. ANALYTICMAGERY, ESID, GROUNDIMAGE, NOTIFICATION, POI, SV,
     * TRACK) that are related to the SAR Observation. See the associated 'srcIds' array for the
     * record UUIDs, positionally corresponding to the record types in this array. The 'srcTyps' and
     * 'srcIds' arrays must match in size.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun srcTyps(): Optional<List<String>> = srcTyps.getOptional("srcTyps")

    /**
     * The length of the collection as projected on the ground in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun swathLength(): Optional<Double> = swathLength.getOptional("swathLength")

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
     * The collection target X position in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun targetposx(): Optional<Double> = targetposx.getOptional("targetposx")

    /**
     * The collection target Y position in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun targetposy(): Optional<Double> = targetposy.getOptional("targetposy")

    /**
     * The collection target Z position in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun targetposz(): Optional<Double> = targetposz.getOptional("targetposz")

    /**
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

    /**
     * Transmit polarization e.g. H - (Horizontally Polarized) Perpendicular to Earth's surface, V -
     * (Vertically Polarized) Parallel to Earth's surface, L - (Left Hand Circularly Polarized)
     * Rotating left relative to the earth's surface, R - (Right Hand Circularly Polarized) Rotating
     * right relative to the earth's surface.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun txPolarization(): Optional<String> = txPolarization.getOptional("txPolarization")

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
     * Returns the raw JSON value of [collectionEnd].
     *
     * Unlike [collectionEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collectionEnd")
    @ExcludeMissing
    fun _collectionEnd(): JsonField<OffsetDateTime> = collectionEnd

    /**
     * Returns the raw JSON value of [collectionStart].
     *
     * Unlike [collectionStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collectionStart")
    @ExcludeMissing
    fun _collectionStart(): JsonField<OffsetDateTime> = collectionStart

    /**
     * Returns the raw JSON value of [dataMode].
     *
     * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataMode") @ExcludeMissing fun _dataMode(): JsonField<DataMode> = dataMode

    /**
     * Returns the raw JSON value of [sarMode].
     *
     * Unlike [sarMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sarMode") @ExcludeMissing fun _sarMode(): JsonField<String> = sarMode

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
     * Returns the raw JSON value of [agjson].
     *
     * Unlike [agjson], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agjson") @ExcludeMissing fun _agjson(): JsonField<String> = agjson

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
     * Returns the raw JSON value of [azimuthAngle].
     *
     * Unlike [azimuthAngle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azimuthAngle")
    @ExcludeMissing
    fun _azimuthAngle(): JsonField<Double> = azimuthAngle

    /**
     * Returns the raw JSON value of [centerTime].
     *
     * Unlike [centerTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("centerTime")
    @ExcludeMissing
    fun _centerTime(): JsonField<OffsetDateTime> = centerTime

    /**
     * Returns the raw JSON value of [collectionId].
     *
     * Unlike [collectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collectionId")
    @ExcludeMissing
    fun _collectionId(): JsonField<String> = collectionId

    /**
     * Returns the raw JSON value of [continuousSpotAngle].
     *
     * Unlike [continuousSpotAngle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("continuousSpotAngle")
    @ExcludeMissing
    fun _continuousSpotAngle(): JsonField<Double> = continuousSpotAngle

    /**
     * Returns the raw JSON value of [coordSys].
     *
     * Unlike [coordSys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coordSys") @ExcludeMissing fun _coordSys(): JsonField<String> = coordSys

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
     * Returns the raw JSON value of [detectionEnd].
     *
     * Unlike [detectionEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detectionEnd")
    @ExcludeMissing
    fun _detectionEnd(): JsonField<OffsetDateTime> = detectionEnd

    /**
     * Returns the raw JSON value of [detectionId].
     *
     * Unlike [detectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detectionId") @ExcludeMissing fun _detectionId(): JsonField<String> = detectionId

    /**
     * Returns the raw JSON value of [detectionStart].
     *
     * Unlike [detectionStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detectionStart")
    @ExcludeMissing
    fun _detectionStart(): JsonField<OffsetDateTime> = detectionStart

    /**
     * Returns the raw JSON value of [dwellTime].
     *
     * Unlike [dwellTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dwellTime") @ExcludeMissing fun _dwellTime(): JsonField<Double> = dwellTime

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalId") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [farRange].
     *
     * Unlike [farRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("farRange") @ExcludeMissing fun _farRange(): JsonField<Double> = farRange

    /**
     * Returns the raw JSON value of [grazeAngle].
     *
     * Unlike [grazeAngle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grazeAngle") @ExcludeMissing fun _grazeAngle(): JsonField<Double> = grazeAngle

    /**
     * Returns the raw JSON value of [groundResolutionProjection].
     *
     * Unlike [groundResolutionProjection], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("groundResolutionProjection")
    @ExcludeMissing
    fun _groundResolutionProjection(): JsonField<Double> = groundResolutionProjection

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [idSensor].
     *
     * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

    /**
     * Returns the raw JSON value of [incidenceAngle].
     *
     * Unlike [incidenceAngle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("incidenceAngle")
    @ExcludeMissing
    fun _incidenceAngle(): JsonField<Double> = incidenceAngle

    /**
     * Returns the raw JSON value of [looksAzimuth].
     *
     * Unlike [looksAzimuth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("looksAzimuth") @ExcludeMissing fun _looksAzimuth(): JsonField<Int> = looksAzimuth

    /**
     * Returns the raw JSON value of [looksRange].
     *
     * Unlike [looksRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("looksRange") @ExcludeMissing fun _looksRange(): JsonField<Int> = looksRange

    /**
     * Returns the raw JSON value of [multilookNumber].
     *
     * Unlike [multilookNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("multilookNumber")
    @ExcludeMissing
    fun _multilookNumber(): JsonField<Double> = multilookNumber

    /**
     * Returns the raw JSON value of [nearRange].
     *
     * Unlike [nearRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nearRange") @ExcludeMissing fun _nearRange(): JsonField<Double> = nearRange

    /**
     * Returns the raw JSON value of [obDirection].
     *
     * Unlike [obDirection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obDirection") @ExcludeMissing fun _obDirection(): JsonField<String> = obDirection

    /**
     * Returns the raw JSON value of [onOrbit].
     *
     * Unlike [onOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("onOrbit") @ExcludeMissing fun _onOrbit(): JsonField<OnorbitFull> = onOrbit

    /**
     * Returns the raw JSON value of [operatingBand].
     *
     * Unlike [operatingBand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operatingBand")
    @ExcludeMissing
    fun _operatingBand(): JsonField<String> = operatingBand

    /**
     * Returns the raw JSON value of [operatingFreq].
     *
     * Unlike [operatingFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operatingFreq")
    @ExcludeMissing
    fun _operatingFreq(): JsonField<Double> = operatingFreq

    /**
     * Returns the raw JSON value of [orbitState].
     *
     * Unlike [orbitState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("orbitState") @ExcludeMissing fun _orbitState(): JsonField<String> = orbitState

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
     * Returns the raw JSON value of [origSensorId].
     *
     * Unlike [origSensorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origSensorId")
    @ExcludeMissing
    fun _origSensorId(): JsonField<String> = origSensorId

    /**
     * Returns the raw JSON value of [pulseBandwidth].
     *
     * Unlike [pulseBandwidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pulseBandwidth")
    @ExcludeMissing
    fun _pulseBandwidth(): JsonField<Double> = pulseBandwidth

    /**
     * Returns the raw JSON value of [pulseDuration].
     *
     * Unlike [pulseDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pulseDuration")
    @ExcludeMissing
    fun _pulseDuration(): JsonField<Double> = pulseDuration

    /**
     * Returns the raw JSON value of [resolutionAzimuth].
     *
     * Unlike [resolutionAzimuth], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("resolutionAzimuth")
    @ExcludeMissing
    fun _resolutionAzimuth(): JsonField<Double> = resolutionAzimuth

    /**
     * Returns the raw JSON value of [resolutionRange].
     *
     * Unlike [resolutionRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resolutionRange")
    @ExcludeMissing
    fun _resolutionRange(): JsonField<Double> = resolutionRange

    /**
     * Returns the raw JSON value of [rxPolarization].
     *
     * Unlike [rxPolarization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rxPolarization")
    @ExcludeMissing
    fun _rxPolarization(): JsonField<String> = rxPolarization

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [senalt].
     *
     * Unlike [senalt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senalt") @ExcludeMissing fun _senalt(): JsonField<Double> = senalt

    /**
     * Returns the raw JSON value of [senlatEnd].
     *
     * Unlike [senlatEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senlatEnd") @ExcludeMissing fun _senlatEnd(): JsonField<Double> = senlatEnd

    /**
     * Returns the raw JSON value of [senlatStart].
     *
     * Unlike [senlatStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senlatStart") @ExcludeMissing fun _senlatStart(): JsonField<Double> = senlatStart

    /**
     * Returns the raw JSON value of [senlonEnd].
     *
     * Unlike [senlonEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senlonEnd") @ExcludeMissing fun _senlonEnd(): JsonField<Double> = senlonEnd

    /**
     * Returns the raw JSON value of [senlonStart].
     *
     * Unlike [senlonStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senlonStart") @ExcludeMissing fun _senlonStart(): JsonField<Double> = senlonStart

    /**
     * Returns the raw JSON value of [senvelx].
     *
     * Unlike [senvelx], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senvelx") @ExcludeMissing fun _senvelx(): JsonField<Double> = senvelx

    /**
     * Returns the raw JSON value of [senvely].
     *
     * Unlike [senvely], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senvely") @ExcludeMissing fun _senvely(): JsonField<Double> = senvely

    /**
     * Returns the raw JSON value of [senvelz].
     *
     * Unlike [senvelz], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senvelz") @ExcludeMissing fun _senvelz(): JsonField<Double> = senvelz

    /**
     * Returns the raw JSON value of [slantRange].
     *
     * Unlike [slantRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slantRange") @ExcludeMissing fun _slantRange(): JsonField<Double> = slantRange

    /**
     * Returns the raw JSON value of [snr].
     *
     * Unlike [snr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("snr") @ExcludeMissing fun _snr(): JsonField<Double> = snr

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [spacingAzimuth].
     *
     * Unlike [spacingAzimuth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spacingAzimuth")
    @ExcludeMissing
    fun _spacingAzimuth(): JsonField<Double> = spacingAzimuth

    /**
     * Returns the raw JSON value of [spacingRange].
     *
     * Unlike [spacingRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spacingRange")
    @ExcludeMissing
    fun _spacingRange(): JsonField<Double> = spacingRange

    /**
     * Returns the raw JSON value of [squintAngle].
     *
     * Unlike [squintAngle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("squintAngle") @ExcludeMissing fun _squintAngle(): JsonField<Double> = squintAngle

    /**
     * Returns the raw JSON value of [srcIds].
     *
     * Unlike [srcIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("srcIds") @ExcludeMissing fun _srcIds(): JsonField<List<String>> = srcIds

    /**
     * Returns the raw JSON value of [srcTyps].
     *
     * Unlike [srcTyps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("srcTyps") @ExcludeMissing fun _srcTyps(): JsonField<List<String>> = srcTyps

    /**
     * Returns the raw JSON value of [swathLength].
     *
     * Unlike [swathLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("swathLength") @ExcludeMissing fun _swathLength(): JsonField<Double> = swathLength

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [targetposx].
     *
     * Unlike [targetposx], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetposx") @ExcludeMissing fun _targetposx(): JsonField<Double> = targetposx

    /**
     * Returns the raw JSON value of [targetposy].
     *
     * Unlike [targetposy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetposy") @ExcludeMissing fun _targetposy(): JsonField<Double> = targetposy

    /**
     * Returns the raw JSON value of [targetposz].
     *
     * Unlike [targetposz], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetposz") @ExcludeMissing fun _targetposz(): JsonField<Double> = targetposz

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [txPolarization].
     *
     * Unlike [txPolarization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("txPolarization")
    @ExcludeMissing
    fun _txPolarization(): JsonField<String> = txPolarization

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
         * Returns a mutable builder for constructing an instance of [SarObservationTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .collectionEnd()
         * .collectionStart()
         * .dataMode()
         * .sarMode()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SarObservationTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var collectionEnd: JsonField<OffsetDateTime>? = null
        private var collectionStart: JsonField<OffsetDateTime>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var sarMode: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var agjson: JsonField<String> = JsonMissing.of()
        private var andims: JsonField<Int> = JsonMissing.of()
        private var area: JsonField<String> = JsonMissing.of()
        private var asrid: JsonField<Int> = JsonMissing.of()
        private var atext: JsonField<String> = JsonMissing.of()
        private var atype: JsonField<String> = JsonMissing.of()
        private var azimuthAngle: JsonField<Double> = JsonMissing.of()
        private var centerTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var collectionId: JsonField<String> = JsonMissing.of()
        private var continuousSpotAngle: JsonField<Double> = JsonMissing.of()
        private var coordSys: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var detectionEnd: JsonField<OffsetDateTime> = JsonMissing.of()
        private var detectionId: JsonField<String> = JsonMissing.of()
        private var detectionStart: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dwellTime: JsonField<Double> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var farRange: JsonField<Double> = JsonMissing.of()
        private var grazeAngle: JsonField<Double> = JsonMissing.of()
        private var groundResolutionProjection: JsonField<Double> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var incidenceAngle: JsonField<Double> = JsonMissing.of()
        private var looksAzimuth: JsonField<Int> = JsonMissing.of()
        private var looksRange: JsonField<Int> = JsonMissing.of()
        private var multilookNumber: JsonField<Double> = JsonMissing.of()
        private var nearRange: JsonField<Double> = JsonMissing.of()
        private var obDirection: JsonField<String> = JsonMissing.of()
        private var onOrbit: JsonField<OnorbitFull> = JsonMissing.of()
        private var operatingBand: JsonField<String> = JsonMissing.of()
        private var operatingFreq: JsonField<Double> = JsonMissing.of()
        private var orbitState: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var pulseBandwidth: JsonField<Double> = JsonMissing.of()
        private var pulseDuration: JsonField<Double> = JsonMissing.of()
        private var resolutionAzimuth: JsonField<Double> = JsonMissing.of()
        private var resolutionRange: JsonField<Double> = JsonMissing.of()
        private var rxPolarization: JsonField<String> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var senalt: JsonField<Double> = JsonMissing.of()
        private var senlatEnd: JsonField<Double> = JsonMissing.of()
        private var senlatStart: JsonField<Double> = JsonMissing.of()
        private var senlonEnd: JsonField<Double> = JsonMissing.of()
        private var senlonStart: JsonField<Double> = JsonMissing.of()
        private var senvelx: JsonField<Double> = JsonMissing.of()
        private var senvely: JsonField<Double> = JsonMissing.of()
        private var senvelz: JsonField<Double> = JsonMissing.of()
        private var slantRange: JsonField<Double> = JsonMissing.of()
        private var snr: JsonField<Double> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var spacingAzimuth: JsonField<Double> = JsonMissing.of()
        private var spacingRange: JsonField<Double> = JsonMissing.of()
        private var squintAngle: JsonField<Double> = JsonMissing.of()
        private var srcIds: JsonField<MutableList<String>>? = null
        private var srcTyps: JsonField<MutableList<String>>? = null
        private var swathLength: JsonField<Double> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var targetposx: JsonField<Double> = JsonMissing.of()
        private var targetposy: JsonField<Double> = JsonMissing.of()
        private var targetposz: JsonField<Double> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var txPolarization: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sarObservationTupleResponse: SarObservationTupleResponse) = apply {
            classificationMarking = sarObservationTupleResponse.classificationMarking
            collectionEnd = sarObservationTupleResponse.collectionEnd
            collectionStart = sarObservationTupleResponse.collectionStart
            dataMode = sarObservationTupleResponse.dataMode
            sarMode = sarObservationTupleResponse.sarMode
            source = sarObservationTupleResponse.source
            id = sarObservationTupleResponse.id
            agjson = sarObservationTupleResponse.agjson
            andims = sarObservationTupleResponse.andims
            area = sarObservationTupleResponse.area
            asrid = sarObservationTupleResponse.asrid
            atext = sarObservationTupleResponse.atext
            atype = sarObservationTupleResponse.atype
            azimuthAngle = sarObservationTupleResponse.azimuthAngle
            centerTime = sarObservationTupleResponse.centerTime
            collectionId = sarObservationTupleResponse.collectionId
            continuousSpotAngle = sarObservationTupleResponse.continuousSpotAngle
            coordSys = sarObservationTupleResponse.coordSys
            createdAt = sarObservationTupleResponse.createdAt
            createdBy = sarObservationTupleResponse.createdBy
            detectionEnd = sarObservationTupleResponse.detectionEnd
            detectionId = sarObservationTupleResponse.detectionId
            detectionStart = sarObservationTupleResponse.detectionStart
            dwellTime = sarObservationTupleResponse.dwellTime
            externalId = sarObservationTupleResponse.externalId
            farRange = sarObservationTupleResponse.farRange
            grazeAngle = sarObservationTupleResponse.grazeAngle
            groundResolutionProjection = sarObservationTupleResponse.groundResolutionProjection
            idOnOrbit = sarObservationTupleResponse.idOnOrbit
            idSensor = sarObservationTupleResponse.idSensor
            incidenceAngle = sarObservationTupleResponse.incidenceAngle
            looksAzimuth = sarObservationTupleResponse.looksAzimuth
            looksRange = sarObservationTupleResponse.looksRange
            multilookNumber = sarObservationTupleResponse.multilookNumber
            nearRange = sarObservationTupleResponse.nearRange
            obDirection = sarObservationTupleResponse.obDirection
            onOrbit = sarObservationTupleResponse.onOrbit
            operatingBand = sarObservationTupleResponse.operatingBand
            operatingFreq = sarObservationTupleResponse.operatingFreq
            orbitState = sarObservationTupleResponse.orbitState
            origin = sarObservationTupleResponse.origin
            origNetwork = sarObservationTupleResponse.origNetwork
            origObjectId = sarObservationTupleResponse.origObjectId
            origSensorId = sarObservationTupleResponse.origSensorId
            pulseBandwidth = sarObservationTupleResponse.pulseBandwidth
            pulseDuration = sarObservationTupleResponse.pulseDuration
            resolutionAzimuth = sarObservationTupleResponse.resolutionAzimuth
            resolutionRange = sarObservationTupleResponse.resolutionRange
            rxPolarization = sarObservationTupleResponse.rxPolarization
            satNo = sarObservationTupleResponse.satNo
            senalt = sarObservationTupleResponse.senalt
            senlatEnd = sarObservationTupleResponse.senlatEnd
            senlatStart = sarObservationTupleResponse.senlatStart
            senlonEnd = sarObservationTupleResponse.senlonEnd
            senlonStart = sarObservationTupleResponse.senlonStart
            senvelx = sarObservationTupleResponse.senvelx
            senvely = sarObservationTupleResponse.senvely
            senvelz = sarObservationTupleResponse.senvelz
            slantRange = sarObservationTupleResponse.slantRange
            snr = sarObservationTupleResponse.snr
            sourceDl = sarObservationTupleResponse.sourceDl
            spacingAzimuth = sarObservationTupleResponse.spacingAzimuth
            spacingRange = sarObservationTupleResponse.spacingRange
            squintAngle = sarObservationTupleResponse.squintAngle
            srcIds = sarObservationTupleResponse.srcIds.map { it.toMutableList() }
            srcTyps = sarObservationTupleResponse.srcTyps.map { it.toMutableList() }
            swathLength = sarObservationTupleResponse.swathLength
            tags = sarObservationTupleResponse.tags.map { it.toMutableList() }
            targetposx = sarObservationTupleResponse.targetposx
            targetposy = sarObservationTupleResponse.targetposy
            targetposz = sarObservationTupleResponse.targetposz
            transactionId = sarObservationTupleResponse.transactionId
            txPolarization = sarObservationTupleResponse.txPolarization
            additionalProperties = sarObservationTupleResponse.additionalProperties.toMutableMap()
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

        /** Collection end time in ISO 8601 UTC format with microsecond precision. */
        fun collectionEnd(collectionEnd: OffsetDateTime) =
            collectionEnd(JsonField.of(collectionEnd))

        /**
         * Sets [Builder.collectionEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collectionEnd(collectionEnd: JsonField<OffsetDateTime>) = apply {
            this.collectionEnd = collectionEnd
        }

        /** Collection start time in ISO 8601 UTC format with microsecond precision. */
        fun collectionStart(collectionStart: OffsetDateTime) =
            collectionStart(JsonField.of(collectionStart))

        /**
         * Sets [Builder.collectionStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionStart] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun collectionStart(collectionStart: JsonField<OffsetDateTime>) = apply {
            this.collectionStart = collectionStart
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

        /** Collection mode setting for this collection (e.g. AREA, SPOTLIGHT, STRIP, etc.). */
        fun sarMode(sarMode: String) = sarMode(JsonField.of(sarMode))

        /**
         * Sets [Builder.sarMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sarMode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sarMode(sarMode: JsonField<String>) = apply { this.sarMode = sarMode }

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
         * Optional geographical region or polygon (lat/lon pairs) of the area surrounding the image
         * event as projected on the ground.
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

        /** Type of region as projected on the ground (POLYGON, POINT, LINE). */
        fun atype(atype: String) = atype(JsonField.of(atype))

        /**
         * Sets [Builder.atype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.atype] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun atype(atype: JsonField<String>) = apply { this.atype = atype }

        /**
         * The azimuth angle, in degrees, of the SAR satellite nadir subpoint measured clockwise
         * from true north at the subpoint.
         */
        fun azimuthAngle(azimuthAngle: Double) = azimuthAngle(JsonField.of(azimuthAngle))

        /**
         * Sets [Builder.azimuthAngle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azimuthAngle] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun azimuthAngle(azimuthAngle: JsonField<Double>) = apply {
            this.azimuthAngle = azimuthAngle
        }

        /**
         * The datetime at the center point of the collection in ISO 8601 UTC format with
         * microsecond precision.
         */
        fun centerTime(centerTime: OffsetDateTime) = centerTime(JsonField.of(centerTime))

        /**
         * Sets [Builder.centerTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.centerTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun centerTime(centerTime: JsonField<OffsetDateTime>) = apply {
            this.centerTime = centerTime
        }

        /**
         * Optional identifier to indicate the specific collection tasking which produced this
         * observation.
         */
        fun collectionId(collectionId: String) = collectionId(JsonField.of(collectionId))

        /**
         * Sets [Builder.collectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun collectionId(collectionId: JsonField<String>) = apply {
            this.collectionId = collectionId
        }

        /** Required sweep angle for the continuous spot scene in degrees. */
        fun continuousSpotAngle(continuousSpotAngle: Double) =
            continuousSpotAngle(JsonField.of(continuousSpotAngle))

        /**
         * Sets [Builder.continuousSpotAngle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.continuousSpotAngle] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun continuousSpotAngle(continuousSpotAngle: JsonField<Double>) = apply {
            this.continuousSpotAngle = continuousSpotAngle
        }

        /**
         * The coordinate system used for the sensor velocity and target position vectors for the
         * collection.
         */
        fun coordSys(coordSys: String) = coordSys(JsonField.of(coordSys))

        /**
         * Sets [Builder.coordSys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coordSys] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun coordSys(coordSys: JsonField<String>) = apply { this.coordSys = coordSys }

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

        /** The detection end time in ISO 8601 UTC format, with microsecond precision. */
        fun detectionEnd(detectionEnd: OffsetDateTime) = detectionEnd(JsonField.of(detectionEnd))

        /**
         * Sets [Builder.detectionEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detectionEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun detectionEnd(detectionEnd: JsonField<OffsetDateTime>) = apply {
            this.detectionEnd = detectionEnd
        }

        /**
         * Identifier of the specific detection within a collection which produced this observation.
         */
        fun detectionId(detectionId: String) = detectionId(JsonField.of(detectionId))

        /**
         * Sets [Builder.detectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun detectionId(detectionId: JsonField<String>) = apply { this.detectionId = detectionId }

        /** The detection start time in ISO 8601 UTC format, with microsecond precision. */
        fun detectionStart(detectionStart: OffsetDateTime) =
            detectionStart(JsonField.of(detectionStart))

        /**
         * Sets [Builder.detectionStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detectionStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun detectionStart(detectionStart: JsonField<OffsetDateTime>) = apply {
            this.detectionStart = detectionStart
        }

        /** The duration, in seconds, of this detection. */
        fun dwellTime(dwellTime: Double) = dwellTime(JsonField.of(dwellTime))

        /**
         * Sets [Builder.dwellTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dwellTime] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dwellTime(dwellTime: JsonField<Double>) = apply { this.dwellTime = dwellTime }

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
         * Specifies the farthest range, in kilometers, from the flight path to target during the
         * collection.
         */
        fun farRange(farRange: Double) = farRange(JsonField.of(farRange))

        /**
         * Sets [Builder.farRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.farRange] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun farRange(farRange: JsonField<Double>) = apply { this.farRange = farRange }

        /** The graze angle (also referred to as look angle) for the collection in degrees. */
        fun grazeAngle(grazeAngle: Double) = grazeAngle(JsonField.of(grazeAngle))

        /**
         * Sets [Builder.grazeAngle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grazeAngle] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun grazeAngle(grazeAngle: JsonField<Double>) = apply { this.grazeAngle = grazeAngle }

        /**
         * Distance between independent measurements, representing the physical dimension that
         * represents a pixel of the image.
         */
        fun groundResolutionProjection(groundResolutionProjection: Double) =
            groundResolutionProjection(JsonField.of(groundResolutionProjection))

        /**
         * Sets [Builder.groundResolutionProjection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groundResolutionProjection] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun groundResolutionProjection(groundResolutionProjection: JsonField<Double>) = apply {
            this.groundResolutionProjection = groundResolutionProjection
        }

        /**
         * Unique identifier of the spacecraft hosting the sensor associated with this collection.
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

        /** Unique identifier of the reporting sensor. */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

        /** The center incidence angle in degrees. */
        fun incidenceAngle(incidenceAngle: Double) = incidenceAngle(JsonField.of(incidenceAngle))

        /**
         * Sets [Builder.incidenceAngle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.incidenceAngle] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun incidenceAngle(incidenceAngle: JsonField<Double>) = apply {
            this.incidenceAngle = incidenceAngle
        }

        /** The number of looks in the azimuth direction. */
        fun looksAzimuth(looksAzimuth: Int) = looksAzimuth(JsonField.of(looksAzimuth))

        /**
         * Sets [Builder.looksAzimuth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.looksAzimuth] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun looksAzimuth(looksAzimuth: JsonField<Int>) = apply { this.looksAzimuth = looksAzimuth }

        /** The number of looks in the range direction. */
        fun looksRange(looksRange: Int) = looksRange(JsonField.of(looksRange))

        /**
         * Sets [Builder.looksRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.looksRange] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun looksRange(looksRange: JsonField<Int>) = apply { this.looksRange = looksRange }

        /**
         * Averages the input synthetic aperture radar (SAR) data by looks in range and azimuth to
         * approximate square pixels, mitigates speckle, and reduces SAR tool processing time.
         */
        fun multilookNumber(multilookNumber: Double) =
            multilookNumber(JsonField.of(multilookNumber))

        /**
         * Sets [Builder.multilookNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multilookNumber] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun multilookNumber(multilookNumber: JsonField<Double>) = apply {
            this.multilookNumber = multilookNumber
        }

        /**
         * Specifies the closest range, in kilometers, from the flight path to target during the
         * collection.
         */
        fun nearRange(nearRange: Double) = nearRange(JsonField.of(nearRange))

        /**
         * Sets [Builder.nearRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nearRange] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nearRange(nearRange: JsonField<Double>) = apply { this.nearRange = nearRange }

        /** The antenna pointing direction (LEFT, RIGHT). */
        fun obDirection(obDirection: String) = obDirection(JsonField.of(obDirection))

        /**
         * Sets [Builder.obDirection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obDirection] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun obDirection(obDirection: JsonField<String>) = apply { this.obDirection = obDirection }

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

        /**
         * Name of the band containing operating frequency for the collection (e.g. C, E, EHF, HF,
         * K, Ka, Ku, L, Q, S, SHF, UNK, UHF, V, VHF, VLF, W, X). See RFBandType for more details
         * and descriptions of each band name.
         */
        fun operatingBand(operatingBand: String) = operatingBand(JsonField.of(operatingBand))

        /**
         * Sets [Builder.operatingBand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatingBand] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operatingBand(operatingBand: JsonField<String>) = apply {
            this.operatingBand = operatingBand
        }

        /** The operating frequency, in Mhz, for the collection. */
        fun operatingFreq(operatingFreq: Double) = operatingFreq(JsonField.of(operatingFreq))

        /**
         * Sets [Builder.operatingFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatingFreq] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operatingFreq(operatingFreq: JsonField<Double>) = apply {
            this.operatingFreq = operatingFreq
        }

        /** The orbital direction (ASCENDING, DESCENDING) of the platform during the collection. */
        fun orbitState(orbitState: String) = orbitState(JsonField.of(orbitState))

        /**
         * Sets [Builder.orbitState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orbitState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun orbitState(orbitState: JsonField<String>) = apply { this.orbitState = orbitState }

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
         * Optional identifier provided by the source to indicate the onorbit object hosting the
         * sensor associated with this collection. This may be an internal identifier and not
         * necessarily a valid satellite number.
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
         * Optional identifier provided by the source to indicate the sensor for this collection.
         * This may be an internal identifier and not necessarily a valid sensor ID.
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

        /** The bandwidth frequency of the pulse in Mhz. */
        fun pulseBandwidth(pulseBandwidth: Double) = pulseBandwidth(JsonField.of(pulseBandwidth))

        /**
         * Sets [Builder.pulseBandwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pulseBandwidth] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pulseBandwidth(pulseBandwidth: JsonField<Double>) = apply {
            this.pulseBandwidth = pulseBandwidth
        }

        /** The duration of a pulse in seconds. */
        fun pulseDuration(pulseDuration: Double) = pulseDuration(JsonField.of(pulseDuration))

        /**
         * Sets [Builder.pulseDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pulseDuration] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pulseDuration(pulseDuration: JsonField<Double>) = apply {
            this.pulseDuration = pulseDuration
        }

        /** The resolution in the azimuth direction measured in meters. */
        fun resolutionAzimuth(resolutionAzimuth: Double) =
            resolutionAzimuth(JsonField.of(resolutionAzimuth))

        /**
         * Sets [Builder.resolutionAzimuth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolutionAzimuth] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resolutionAzimuth(resolutionAzimuth: JsonField<Double>) = apply {
            this.resolutionAzimuth = resolutionAzimuth
        }

        /** The resolution in the range direction measured in meters. */
        fun resolutionRange(resolutionRange: Double) =
            resolutionRange(JsonField.of(resolutionRange))

        /**
         * Sets [Builder.resolutionRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolutionRange] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resolutionRange(resolutionRange: JsonField<Double>) = apply {
            this.resolutionRange = resolutionRange
        }

        /**
         * Receive polarization e.g. H - (Horizontally Polarized) Perpendicular to Earth's surface,
         * V - (Vertically Polarized) Parallel to Earth's surface, L - (Left Hand Circularly
         * Polarized) Rotating left relative to the earth's surface, R - (Right Hand Circularly
         * Polarized) Rotating right relative to the earth's surface.
         */
        fun rxPolarization(rxPolarization: String) = rxPolarization(JsonField.of(rxPolarization))

        /**
         * Sets [Builder.rxPolarization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rxPolarization] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rxPolarization(rxPolarization: JsonField<String>) = apply {
            this.rxPolarization = rxPolarization
        }

        /**
         * Satellite/Catalog number of the spacecraft hosting the sensor associated with this
         * collection.
         */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /** Sensor altitude during collection in kilometers. */
        fun senalt(senalt: Double) = senalt(JsonField.of(senalt))

        /**
         * Sets [Builder.senalt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senalt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senalt(senalt: JsonField<Double>) = apply { this.senalt = senalt }

        /**
         * WGS-84 sensor latitude sub-point at collect end time (collectionEnd), represented as -90
         * to 90 degrees (negative values south of equator).
         */
        fun senlatEnd(senlatEnd: Double) = senlatEnd(JsonField.of(senlatEnd))

        /**
         * Sets [Builder.senlatEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senlatEnd] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senlatEnd(senlatEnd: JsonField<Double>) = apply { this.senlatEnd = senlatEnd }

        /**
         * WGS-84 sensor latitude sub-point at collect start time (collectionStart), represented as
         * -90 to 90 degrees (negative values south of equator).
         */
        fun senlatStart(senlatStart: Double) = senlatStart(JsonField.of(senlatStart))

        /**
         * Sets [Builder.senlatStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senlatStart] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senlatStart(senlatStart: JsonField<Double>) = apply { this.senlatStart = senlatStart }

        /**
         * WGS-84 sensor longitude sub-point at collect end time (collectionEnd), represented as
         * -180 to 180 degrees (negative values west of Prime Meridian).
         */
        fun senlonEnd(senlonEnd: Double) = senlonEnd(JsonField.of(senlonEnd))

        /**
         * Sets [Builder.senlonEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senlonEnd] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senlonEnd(senlonEnd: JsonField<Double>) = apply { this.senlonEnd = senlonEnd }

        /**
         * WGS-84 sensor longitude sub-point at collect start time (collectionStart), represented as
         * -180 to 180 degrees (negative values west of Prime Meridian).
         */
        fun senlonStart(senlonStart: Double) = senlonStart(JsonField.of(senlonStart))

        /**
         * Sets [Builder.senlonStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senlonStart] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senlonStart(senlonStart: JsonField<Double>) = apply { this.senlonStart = senlonStart }

        /** Sensor platform X-velocity during collection in kilometers/second. */
        fun senvelx(senvelx: Double) = senvelx(JsonField.of(senvelx))

        /**
         * Sets [Builder.senvelx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senvelx] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senvelx(senvelx: JsonField<Double>) = apply { this.senvelx = senvelx }

        /** Sensor platform Y-velocity during collection in kilometers/second. */
        fun senvely(senvely: Double) = senvely(JsonField.of(senvely))

        /**
         * Sets [Builder.senvely] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senvely] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senvely(senvely: JsonField<Double>) = apply { this.senvely = senvely }

        /** Sensor platform Z-velocity during collection in kilometers/second. */
        fun senvelz(senvelz: Double) = senvelz(JsonField.of(senvelz))

        /**
         * Sets [Builder.senvelz] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senvelz] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senvelz(senvelz: JsonField<Double>) = apply { this.senvelz = senvelz }

        /** Slant distance from sensor to center point of imaging event in kilometers. */
        fun slantRange(slantRange: Double) = slantRange(JsonField.of(slantRange))

        /**
         * Sets [Builder.slantRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slantRange] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun slantRange(slantRange: JsonField<Double>) = apply { this.slantRange = slantRange }

        /** Signal to noise ratio, in dB. */
        fun snr(snr: Double) = snr(JsonField.of(snr))

        /**
         * Sets [Builder.snr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snr] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun snr(snr: JsonField<Double>) = apply { this.snr = snr }

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

        /** The pixel spacing in the azimuth direction measured in meters. */
        fun spacingAzimuth(spacingAzimuth: Double) = spacingAzimuth(JsonField.of(spacingAzimuth))

        /**
         * Sets [Builder.spacingAzimuth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spacingAzimuth] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun spacingAzimuth(spacingAzimuth: JsonField<Double>) = apply {
            this.spacingAzimuth = spacingAzimuth
        }

        /** The pixel spacing in the range direction measured in meters. */
        fun spacingRange(spacingRange: Double) = spacingRange(JsonField.of(spacingRange))

        /**
         * Sets [Builder.spacingRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spacingRange] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spacingRange(spacingRange: JsonField<Double>) = apply {
            this.spacingRange = spacingRange
        }

        /** The squint angle for the collection in degrees. */
        fun squintAngle(squintAngle: Double) = squintAngle(JsonField.of(squintAngle))

        /**
         * Sets [Builder.squintAngle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.squintAngle] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun squintAngle(squintAngle: JsonField<Double>) = apply { this.squintAngle = squintAngle }

        /**
         * Array of UUIDs of the UDL data records that are related to the SAR Observation. See the
         * associated 'srcTyps' array for the specific types of data, positionally corresponding to
         * the UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in size. See the
         * corresponding srcTyps array element for the data type of the UUID and use the appropriate
         * API operation to retrieve that object (e.g. /udl/sarobservation/{uuid}).
         */
        fun srcIds(srcIds: List<String>) = srcIds(JsonField.of(srcIds))

        /**
         * Sets [Builder.srcIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.srcIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun srcIds(srcIds: JsonField<List<String>>) = apply {
            this.srcIds = srcIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [srcIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSrcId(srcId: String) = apply {
            srcIds =
                (srcIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("srcIds", it).add(srcId)
                }
        }

        /**
         * Array of UDL record types (e.g. ANALYTICMAGERY, ESID, GROUNDIMAGE, NOTIFICATION, POI, SV,
         * TRACK) that are related to the SAR Observation. See the associated 'srcIds' array for the
         * record UUIDs, positionally corresponding to the record types in this array. The 'srcTyps'
         * and 'srcIds' arrays must match in size.
         */
        fun srcTyps(srcTyps: List<String>) = srcTyps(JsonField.of(srcTyps))

        /**
         * Sets [Builder.srcTyps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.srcTyps] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun srcTyps(srcTyps: JsonField<List<String>>) = apply {
            this.srcTyps = srcTyps.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [srcTyps].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSrcTyp(srcTyp: String) = apply {
            srcTyps =
                (srcTyps ?: JsonField.of(mutableListOf())).also {
                    checkKnown("srcTyps", it).add(srcTyp)
                }
        }

        /** The length of the collection as projected on the ground in kilometers. */
        fun swathLength(swathLength: Double) = swathLength(JsonField.of(swathLength))

        /**
         * Sets [Builder.swathLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.swathLength] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun swathLength(swathLength: JsonField<Double>) = apply { this.swathLength = swathLength }

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

        /** The collection target X position in kilometers. */
        fun targetposx(targetposx: Double) = targetposx(JsonField.of(targetposx))

        /**
         * Sets [Builder.targetposx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetposx] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetposx(targetposx: JsonField<Double>) = apply { this.targetposx = targetposx }

        /** The collection target Y position in kilometers. */
        fun targetposy(targetposy: Double) = targetposy(JsonField.of(targetposy))

        /**
         * Sets [Builder.targetposy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetposy] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetposy(targetposy: JsonField<Double>) = apply { this.targetposy = targetposy }

        /** The collection target Z position in kilometers. */
        fun targetposz(targetposz: Double) = targetposz(JsonField.of(targetposz))

        /**
         * Sets [Builder.targetposz] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetposz] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetposz(targetposz: JsonField<Double>) = apply { this.targetposz = targetposz }

        /**
         * Optional identifier to track a commercial or marketplace transaction executed to produce
         * this data.
         */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * Transmit polarization e.g. H - (Horizontally Polarized) Perpendicular to Earth's surface,
         * V - (Vertically Polarized) Parallel to Earth's surface, L - (Left Hand Circularly
         * Polarized) Rotating left relative to the earth's surface, R - (Right Hand Circularly
         * Polarized) Rotating right relative to the earth's surface.
         */
        fun txPolarization(txPolarization: String) = txPolarization(JsonField.of(txPolarization))

        /**
         * Sets [Builder.txPolarization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.txPolarization] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun txPolarization(txPolarization: JsonField<String>) = apply {
            this.txPolarization = txPolarization
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
         * Returns an immutable instance of [SarObservationTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .collectionEnd()
         * .collectionStart()
         * .dataMode()
         * .sarMode()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SarObservationTupleResponse =
            SarObservationTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("collectionEnd", collectionEnd),
                checkRequired("collectionStart", collectionStart),
                checkRequired("dataMode", dataMode),
                checkRequired("sarMode", sarMode),
                checkRequired("source", source),
                id,
                agjson,
                andims,
                area,
                asrid,
                atext,
                atype,
                azimuthAngle,
                centerTime,
                collectionId,
                continuousSpotAngle,
                coordSys,
                createdAt,
                createdBy,
                detectionEnd,
                detectionId,
                detectionStart,
                dwellTime,
                externalId,
                farRange,
                grazeAngle,
                groundResolutionProjection,
                idOnOrbit,
                idSensor,
                incidenceAngle,
                looksAzimuth,
                looksRange,
                multilookNumber,
                nearRange,
                obDirection,
                onOrbit,
                operatingBand,
                operatingFreq,
                orbitState,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                pulseBandwidth,
                pulseDuration,
                resolutionAzimuth,
                resolutionRange,
                rxPolarization,
                satNo,
                senalt,
                senlatEnd,
                senlatStart,
                senlonEnd,
                senlonStart,
                senvelx,
                senvely,
                senvelz,
                slantRange,
                snr,
                sourceDl,
                spacingAzimuth,
                spacingRange,
                squintAngle,
                (srcIds ?: JsonMissing.of()).map { it.toImmutable() },
                (srcTyps ?: JsonMissing.of()).map { it.toImmutable() },
                swathLength,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                targetposx,
                targetposy,
                targetposz,
                transactionId,
                txPolarization,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SarObservationTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        collectionEnd()
        collectionStart()
        dataMode().validate()
        sarMode()
        source()
        id()
        agjson()
        andims()
        area()
        asrid()
        atext()
        atype()
        azimuthAngle()
        centerTime()
        collectionId()
        continuousSpotAngle()
        coordSys()
        createdAt()
        createdBy()
        detectionEnd()
        detectionId()
        detectionStart()
        dwellTime()
        externalId()
        farRange()
        grazeAngle()
        groundResolutionProjection()
        idOnOrbit()
        idSensor()
        incidenceAngle()
        looksAzimuth()
        looksRange()
        multilookNumber()
        nearRange()
        obDirection()
        onOrbit().ifPresent { it.validate() }
        operatingBand()
        operatingFreq()
        orbitState()
        origin()
        origNetwork()
        origObjectId()
        origSensorId()
        pulseBandwidth()
        pulseDuration()
        resolutionAzimuth()
        resolutionRange()
        rxPolarization()
        satNo()
        senalt()
        senlatEnd()
        senlatStart()
        senlonEnd()
        senlonStart()
        senvelx()
        senvely()
        senvelz()
        slantRange()
        snr()
        sourceDl()
        spacingAzimuth()
        spacingRange()
        squintAngle()
        srcIds()
        srcTyps()
        swathLength()
        tags()
        targetposx()
        targetposy()
        targetposz()
        transactionId()
        txPolarization()
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
            (if (collectionEnd.asKnown().isPresent) 1 else 0) +
            (if (collectionStart.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sarMode.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (agjson.asKnown().isPresent) 1 else 0) +
            (if (andims.asKnown().isPresent) 1 else 0) +
            (if (area.asKnown().isPresent) 1 else 0) +
            (if (asrid.asKnown().isPresent) 1 else 0) +
            (if (atext.asKnown().isPresent) 1 else 0) +
            (if (atype.asKnown().isPresent) 1 else 0) +
            (if (azimuthAngle.asKnown().isPresent) 1 else 0) +
            (if (centerTime.asKnown().isPresent) 1 else 0) +
            (if (collectionId.asKnown().isPresent) 1 else 0) +
            (if (continuousSpotAngle.asKnown().isPresent) 1 else 0) +
            (if (coordSys.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (detectionEnd.asKnown().isPresent) 1 else 0) +
            (if (detectionId.asKnown().isPresent) 1 else 0) +
            (if (detectionStart.asKnown().isPresent) 1 else 0) +
            (if (dwellTime.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (if (farRange.asKnown().isPresent) 1 else 0) +
            (if (grazeAngle.asKnown().isPresent) 1 else 0) +
            (if (groundResolutionProjection.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (incidenceAngle.asKnown().isPresent) 1 else 0) +
            (if (looksAzimuth.asKnown().isPresent) 1 else 0) +
            (if (looksRange.asKnown().isPresent) 1 else 0) +
            (if (multilookNumber.asKnown().isPresent) 1 else 0) +
            (if (nearRange.asKnown().isPresent) 1 else 0) +
            (if (obDirection.asKnown().isPresent) 1 else 0) +
            (onOrbit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operatingBand.asKnown().isPresent) 1 else 0) +
            (if (operatingFreq.asKnown().isPresent) 1 else 0) +
            (if (orbitState.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (if (pulseBandwidth.asKnown().isPresent) 1 else 0) +
            (if (pulseDuration.asKnown().isPresent) 1 else 0) +
            (if (resolutionAzimuth.asKnown().isPresent) 1 else 0) +
            (if (resolutionRange.asKnown().isPresent) 1 else 0) +
            (if (rxPolarization.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (senalt.asKnown().isPresent) 1 else 0) +
            (if (senlatEnd.asKnown().isPresent) 1 else 0) +
            (if (senlatStart.asKnown().isPresent) 1 else 0) +
            (if (senlonEnd.asKnown().isPresent) 1 else 0) +
            (if (senlonStart.asKnown().isPresent) 1 else 0) +
            (if (senvelx.asKnown().isPresent) 1 else 0) +
            (if (senvely.asKnown().isPresent) 1 else 0) +
            (if (senvelz.asKnown().isPresent) 1 else 0) +
            (if (slantRange.asKnown().isPresent) 1 else 0) +
            (if (snr.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (spacingAzimuth.asKnown().isPresent) 1 else 0) +
            (if (spacingRange.asKnown().isPresent) 1 else 0) +
            (if (squintAngle.asKnown().isPresent) 1 else 0) +
            (srcIds.asKnown().getOrNull()?.size ?: 0) +
            (srcTyps.asKnown().getOrNull()?.size ?: 0) +
            (if (swathLength.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (targetposx.asKnown().isPresent) 1 else 0) +
            (if (targetposy.asKnown().isPresent) 1 else 0) +
            (if (targetposz.asKnown().isPresent) 1 else 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (txPolarization.asKnown().isPresent) 1 else 0)

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

        return other is SarObservationTupleResponse &&
            classificationMarking == other.classificationMarking &&
            collectionEnd == other.collectionEnd &&
            collectionStart == other.collectionStart &&
            dataMode == other.dataMode &&
            sarMode == other.sarMode &&
            source == other.source &&
            id == other.id &&
            agjson == other.agjson &&
            andims == other.andims &&
            area == other.area &&
            asrid == other.asrid &&
            atext == other.atext &&
            atype == other.atype &&
            azimuthAngle == other.azimuthAngle &&
            centerTime == other.centerTime &&
            collectionId == other.collectionId &&
            continuousSpotAngle == other.continuousSpotAngle &&
            coordSys == other.coordSys &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            detectionEnd == other.detectionEnd &&
            detectionId == other.detectionId &&
            detectionStart == other.detectionStart &&
            dwellTime == other.dwellTime &&
            externalId == other.externalId &&
            farRange == other.farRange &&
            grazeAngle == other.grazeAngle &&
            groundResolutionProjection == other.groundResolutionProjection &&
            idOnOrbit == other.idOnOrbit &&
            idSensor == other.idSensor &&
            incidenceAngle == other.incidenceAngle &&
            looksAzimuth == other.looksAzimuth &&
            looksRange == other.looksRange &&
            multilookNumber == other.multilookNumber &&
            nearRange == other.nearRange &&
            obDirection == other.obDirection &&
            onOrbit == other.onOrbit &&
            operatingBand == other.operatingBand &&
            operatingFreq == other.operatingFreq &&
            orbitState == other.orbitState &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            origSensorId == other.origSensorId &&
            pulseBandwidth == other.pulseBandwidth &&
            pulseDuration == other.pulseDuration &&
            resolutionAzimuth == other.resolutionAzimuth &&
            resolutionRange == other.resolutionRange &&
            rxPolarization == other.rxPolarization &&
            satNo == other.satNo &&
            senalt == other.senalt &&
            senlatEnd == other.senlatEnd &&
            senlatStart == other.senlatStart &&
            senlonEnd == other.senlonEnd &&
            senlonStart == other.senlonStart &&
            senvelx == other.senvelx &&
            senvely == other.senvely &&
            senvelz == other.senvelz &&
            slantRange == other.slantRange &&
            snr == other.snr &&
            sourceDl == other.sourceDl &&
            spacingAzimuth == other.spacingAzimuth &&
            spacingRange == other.spacingRange &&
            squintAngle == other.squintAngle &&
            srcIds == other.srcIds &&
            srcTyps == other.srcTyps &&
            swathLength == other.swathLength &&
            tags == other.tags &&
            targetposx == other.targetposx &&
            targetposy == other.targetposy &&
            targetposz == other.targetposz &&
            transactionId == other.transactionId &&
            txPolarization == other.txPolarization &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            collectionEnd,
            collectionStart,
            dataMode,
            sarMode,
            source,
            id,
            agjson,
            andims,
            area,
            asrid,
            atext,
            atype,
            azimuthAngle,
            centerTime,
            collectionId,
            continuousSpotAngle,
            coordSys,
            createdAt,
            createdBy,
            detectionEnd,
            detectionId,
            detectionStart,
            dwellTime,
            externalId,
            farRange,
            grazeAngle,
            groundResolutionProjection,
            idOnOrbit,
            idSensor,
            incidenceAngle,
            looksAzimuth,
            looksRange,
            multilookNumber,
            nearRange,
            obDirection,
            onOrbit,
            operatingBand,
            operatingFreq,
            orbitState,
            origin,
            origNetwork,
            origObjectId,
            origSensorId,
            pulseBandwidth,
            pulseDuration,
            resolutionAzimuth,
            resolutionRange,
            rxPolarization,
            satNo,
            senalt,
            senlatEnd,
            senlatStart,
            senlonEnd,
            senlonStart,
            senvelx,
            senvely,
            senvelz,
            slantRange,
            snr,
            sourceDl,
            spacingAzimuth,
            spacingRange,
            squintAngle,
            srcIds,
            srcTyps,
            swathLength,
            tags,
            targetposx,
            targetposy,
            targetposz,
            transactionId,
            txPolarization,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SarObservationTupleResponse{classificationMarking=$classificationMarking, collectionEnd=$collectionEnd, collectionStart=$collectionStart, dataMode=$dataMode, sarMode=$sarMode, source=$source, id=$id, agjson=$agjson, andims=$andims, area=$area, asrid=$asrid, atext=$atext, atype=$atype, azimuthAngle=$azimuthAngle, centerTime=$centerTime, collectionId=$collectionId, continuousSpotAngle=$continuousSpotAngle, coordSys=$coordSys, createdAt=$createdAt, createdBy=$createdBy, detectionEnd=$detectionEnd, detectionId=$detectionId, detectionStart=$detectionStart, dwellTime=$dwellTime, externalId=$externalId, farRange=$farRange, grazeAngle=$grazeAngle, groundResolutionProjection=$groundResolutionProjection, idOnOrbit=$idOnOrbit, idSensor=$idSensor, incidenceAngle=$incidenceAngle, looksAzimuth=$looksAzimuth, looksRange=$looksRange, multilookNumber=$multilookNumber, nearRange=$nearRange, obDirection=$obDirection, onOrbit=$onOrbit, operatingBand=$operatingBand, operatingFreq=$operatingFreq, orbitState=$orbitState, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, pulseBandwidth=$pulseBandwidth, pulseDuration=$pulseDuration, resolutionAzimuth=$resolutionAzimuth, resolutionRange=$resolutionRange, rxPolarization=$rxPolarization, satNo=$satNo, senalt=$senalt, senlatEnd=$senlatEnd, senlatStart=$senlatStart, senlonEnd=$senlonEnd, senlonStart=$senlonStart, senvelx=$senvelx, senvely=$senvely, senvelz=$senvelz, slantRange=$slantRange, snr=$snr, sourceDl=$sourceDl, spacingAzimuth=$spacingAzimuth, spacingRange=$spacingRange, squintAngle=$squintAngle, srcIds=$srcIds, srcTyps=$srcTyps, swathLength=$swathLength, tags=$tags, targetposx=$targetposx, targetposy=$targetposy, targetposz=$targetposz, transactionId=$transactionId, txPolarization=$txPolarization, additionalProperties=$additionalProperties}"
}

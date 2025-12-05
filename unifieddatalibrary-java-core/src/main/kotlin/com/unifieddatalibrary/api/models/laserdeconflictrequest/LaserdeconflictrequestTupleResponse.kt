// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laserdeconflictrequest

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
 * The LaserDeconflictionRequest service is designed to process and manage requests related to the
 * safe operation of high-powered lasers, ensuring that laser systems do not interfere with other
 * critical operations, such as satellite based activities. The service facilitates real-time
 * coordination between different entities to prevent accidental exposure to laser hazards, ensuring
 * compliance with safety protocols and regulations.
 */
class LaserdeconflictrequestTupleResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val endDate: JsonField<OffsetDateTime>,
    private val idLaserEmitters: JsonField<List<String>>,
    private val numTargets: JsonField<Int>,
    private val requestId: JsonField<String>,
    private val requestTs: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val startDate: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val centerlineAzimuth: JsonField<Double>,
    private val centerlineElevation: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val defaultCha: JsonField<Double>,
    private val enableDss: JsonField<Boolean>,
    private val fixedPoints: JsonField<List<FixedPointFull>>,
    private val geopotentialModel: JsonField<String>,
    private val idOnOrbit: JsonField<String>,
    private val laserDeconflictTargets: JsonField<List<LaserDeconflictTarget>>,
    private val laserSystemName: JsonField<String>,
    private val lengthCenterline: JsonField<Double>,
    private val lengthLeftRight: JsonField<Double>,
    private val lengthUpDown: JsonField<Double>,
    private val maximumHeight: JsonField<Double>,
    private val minimumHeight: JsonField<Double>,
    private val missionName: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val platformLocationName: JsonField<String>,
    private val platformLocationType: JsonField<String>,
    private val programId: JsonField<String>,
    private val propagator: JsonField<String>,
    private val protectList: JsonField<List<Int>>,
    private val satNo: JsonField<Int>,
    private val sourceDl: JsonField<String>,
    private val sourceEnabled: JsonField<Boolean>,
    private val status: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val targetEnabled: JsonField<Boolean>,
    private val targetType: JsonField<String>,
    private val transactionId: JsonField<String>,
    private val treatEarthAs: JsonField<String>,
    private val useFieldOfRegard: JsonField<Boolean>,
    private val victimEnabled: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("idLaserEmitters")
        @ExcludeMissing
        idLaserEmitters: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("numTargets") @ExcludeMissing numTargets: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("requestId") @ExcludeMissing requestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requestTs")
        @ExcludeMissing
        requestTs: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("centerlineAzimuth")
        @ExcludeMissing
        centerlineAzimuth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("centerlineElevation")
        @ExcludeMissing
        centerlineElevation: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("defaultCHA")
        @ExcludeMissing
        defaultCha: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("enableDSS") @ExcludeMissing enableDss: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("fixedPoints")
        @ExcludeMissing
        fixedPoints: JsonField<List<FixedPointFull>> = JsonMissing.of(),
        @JsonProperty("geopotentialModel")
        @ExcludeMissing
        geopotentialModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("laserDeconflictTargets")
        @ExcludeMissing
        laserDeconflictTargets: JsonField<List<LaserDeconflictTarget>> = JsonMissing.of(),
        @JsonProperty("laserSystemName")
        @ExcludeMissing
        laserSystemName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lengthCenterline")
        @ExcludeMissing
        lengthCenterline: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lengthLeftRight")
        @ExcludeMissing
        lengthLeftRight: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lengthUpDown")
        @ExcludeMissing
        lengthUpDown: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maximumHeight")
        @ExcludeMissing
        maximumHeight: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minimumHeight")
        @ExcludeMissing
        minimumHeight: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("missionName")
        @ExcludeMissing
        missionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("platformLocationName")
        @ExcludeMissing
        platformLocationName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("platformLocationType")
        @ExcludeMissing
        platformLocationType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("programId") @ExcludeMissing programId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propagator")
        @ExcludeMissing
        propagator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("protectList")
        @ExcludeMissing
        protectList: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceEnabled")
        @ExcludeMissing
        sourceEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("targetEnabled")
        @ExcludeMissing
        targetEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("targetType")
        @ExcludeMissing
        targetType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("treatEarthAs")
        @ExcludeMissing
        treatEarthAs: JsonField<String> = JsonMissing.of(),
        @JsonProperty("useFieldOfRegard")
        @ExcludeMissing
        useFieldOfRegard: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("victimEnabled")
        @ExcludeMissing
        victimEnabled: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        endDate,
        idLaserEmitters,
        numTargets,
        requestId,
        requestTs,
        source,
        startDate,
        id,
        centerlineAzimuth,
        centerlineElevation,
        createdAt,
        createdBy,
        defaultCha,
        enableDss,
        fixedPoints,
        geopotentialModel,
        idOnOrbit,
        laserDeconflictTargets,
        laserSystemName,
        lengthCenterline,
        lengthLeftRight,
        lengthUpDown,
        maximumHeight,
        minimumHeight,
        missionName,
        origin,
        origNetwork,
        origObjectId,
        platformLocationName,
        platformLocationType,
        programId,
        propagator,
        protectList,
        satNo,
        sourceDl,
        sourceEnabled,
        status,
        tags,
        targetEnabled,
        targetType,
        transactionId,
        treatEarthAs,
        useFieldOfRegard,
        victimEnabled,
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
     * End date of the time windows associated with this LaserDeconflictRequest, in ISO 8601 UTC
     * format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime = endDate.getRequired("endDate")

    /**
     * A list containing the id strings of the LaserEmitter records in UDL detailing the physical
     * parameters of each laser/emitter operationally involved with this request. All laser/emitter
     * components must be accurately described using the LaserEmitter schema and ingested into the
     * UDL LaserEmitter service before creating a LaserDeconflictRequest. Users should create new
     * LaserEmitter records for non-existent emitters and update existing records for any
     * modifications.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idLaserEmitters(): List<String> = idLaserEmitters.getRequired("idLaserEmitters")

    /**
     * The number of targets included in this request.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numTargets(): Int = numTargets.getRequired("numTargets")

    /**
     * External identifier for this LaserDeconflictRequest record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestId(): String = requestId.getRequired("requestId")

    /**
     * The datetime that this LaserDeconflictRequest record was created, in ISO 8601 UTC format with
     * millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestTs(): OffsetDateTime = requestTs.getRequired("requestTs")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Start date of the time windows associated with this LaserDeconflictRequest, in ISO 8601 UTC
     * format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

    /**
     * Unique identifier of the record, auto-generated by the system if not provided on create
     * operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The azimuth angle of the centerline of the geospatial box that confines positions of the
     * laser platform, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun centerlineAzimuth(): Optional<Double> = centerlineAzimuth.getOptional("centerlineAzimuth")

    /**
     * The elevation angle of the centerline of the geospatial box that confines the positions of
     * the laser platform, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun centerlineElevation(): Optional<Double> =
        centerlineElevation.getOptional("centerlineElevation")

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
     * The half-angle of the safety cone of the laser beam, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun defaultCha(): Optional<Double> = defaultCha.getOptional("defaultCHA")

    /**
     * Boolean enabling Dynamic Satellite Susceptibility (DSS) algorithms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun enableDss(): Optional<Boolean> = enableDss.getOptional("enableDSS")

    /**
     * A collection of latitude, longitude, and altitude fields which can be used to specify the
     * geometry of the coordinate space in which the laser platform(s) will be operational for this
     * request. For example, a BOX_2_WAYPOINTS would include two data points, while a
     * BOX_4_SURFACE_POINTS would include four data points.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fixedPoints(): Optional<List<FixedPointFull>> = fixedPoints.getOptional("fixedPoints")

    /**
     * Indicates the geopotential model used in the propagation calculation for this request (e.g.
     * EGM-96, WGS-84, WGS-72, WGS66, WGS60, JGM-2, or GEM-T3).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geopotentialModel(): Optional<String> = geopotentialModel.getOptional("geopotentialModel")

    /**
     * Unique identifier of the on-orbit laser platform.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * A list containing all laser illumination target object specifications for which
     * deconflictions must be calculated, as planned for this request.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun laserDeconflictTargets(): Optional<List<LaserDeconflictTarget>> =
        laserDeconflictTargets.getOptional("laserDeconflictTargets")

    /**
     * The name of the laser/beam director system. The Laser Clearinghouse will append identifiers
     * to the name using standard conventions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun laserSystemName(): Optional<String> = laserSystemName.getOptional("laserSystemName")

    /**
     * The length of the centerline that passes through the center point of the geospatial box that
     * confines the positions of the laser platform, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lengthCenterline(): Optional<Double> = lengthCenterline.getOptional("lengthCenterline")

    /**
     * Specifies the length of the horizontal dimension of the geospatial box that confines the
     * positions of the laser platform, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lengthLeftRight(): Optional<Double> = lengthLeftRight.getOptional("lengthLeftRight")

    /**
     * Specifies the length of the vertical dimension of the geospatial box that confines the
     * positions of the laser platform, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lengthUpDown(): Optional<Double> = lengthUpDown.getOptional("lengthUpDown")

    /**
     * The maximum laser operating altitude specified as the height above/below the WGS84 ellipsoid
     * where the laser is omitted from, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maximumHeight(): Optional<Double> = maximumHeight.getOptional("maximumHeight")

    /**
     * The minimum laser operating altitude specified as the height above/below the WGS84 ellipsoid
     * where the laser is omitted from, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minimumHeight(): Optional<Double> = minimumHeight.getOptional("minimumHeight")

    /**
     * The name of the mission with which this LaserDeconflictRequest is associated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun missionName(): Optional<String> = missionName.getOptional("missionName")

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
     * Optional identifier provided by the source provider to indicate the on-orbit laser platform.
     * This may be an internal identifier and not necessarily map to a valid satellite number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * The name of the laser platform.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun platformLocationName(): Optional<String> =
        platformLocationName.getOptional("platformLocationName")

    /**
     * Indicates the type of location(s) the laser platform will be operational for this request
     * (BOX_2_WAYPOINTS, BOX_4_SURFACE_POINTS, BOX_CENTER_POINT_LINE, EXTERNAL_EPHEMERIS,
     * FIXED_POINT, SATELLITE).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun platformLocationType(): Optional<String> =
        platformLocationType.getOptional("platformLocationType")

    /**
     * External identifier for the program that is responsible for this LaserDeconflictRequest.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun programId(): Optional<String> = programId.getOptional("programId")

    /**
     * The type of propagator utilized in the deconfliction/predictive avoidance calculation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun propagator(): Optional<String> = propagator.getOptional("propagator")

    /**
     * A list of satellite/catalog numbers that should be protected from any and all incidence of
     * laser illumination for the duration of this request.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun protectList(): Optional<List<Int>> = protectList.getOptional("protectList")

    /**
     * The satellite/catalog number of the on-orbit laser platform.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

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
     * Boolean indicating whether error growth of the laser beam is enabled for this request.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceEnabled(): Optional<Boolean> = sourceEnabled.getOptional("sourceEnabled")

    /**
     * Status of this request (APPROVED, COMPLETE_WITH_ERRORS, COMPLETE_WITH_WARNINGS, FAILURE,
     * IN_PROGRESS, REQUESTED, SUCCESS).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

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
     * Boolean indicating whether target error growth is enabled for this request.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun targetEnabled(): Optional<Boolean> = targetEnabled.getOptional("targetEnabled")

    /**
     * The target type that concerns this request (BOX_2_WAYPOINTS, BOX_4_SURFACE_POINTS,
     * BOX_CENTER_POINT_LINE, EXTERNAL_EPHEMERIS, FIXED_POINT, SATELLITE).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun targetType(): Optional<String> = targetType.getOptional("targetType")

    /**
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

    /**
     * Indicates the treatment of earth (INVISIBLE, VICTIM, SHIELD) for this LaserDeconflictRequest
     * record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun treatEarthAs(): Optional<String> = treatEarthAs.getOptional("treatEarthAs")

    /**
     * Boolean indicating that, for deconfliction events in which the potential target is an optical
     * imaging satellite, line of sight computation between target and source is ensured when the
     * source emitter is contained within the field of regard (field of view) of the satellite's
     * optical telescope.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun useFieldOfRegard(): Optional<Boolean> = useFieldOfRegard.getOptional("useFieldOfRegard")

    /**
     * Boolean indicating whether victim error growth is enabled as input to the deconfliction
     * calculations for this request.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun victimEnabled(): Optional<Boolean> = victimEnabled.getOptional("victimEnabled")

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
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [idLaserEmitters].
     *
     * Unlike [idLaserEmitters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idLaserEmitters")
    @ExcludeMissing
    fun _idLaserEmitters(): JsonField<List<String>> = idLaserEmitters

    /**
     * Returns the raw JSON value of [numTargets].
     *
     * Unlike [numTargets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numTargets") @ExcludeMissing fun _numTargets(): JsonField<Int> = numTargets

    /**
     * Returns the raw JSON value of [requestId].
     *
     * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestId") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

    /**
     * Returns the raw JSON value of [requestTs].
     *
     * Unlike [requestTs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestTs")
    @ExcludeMissing
    fun _requestTs(): JsonField<OffsetDateTime> = requestTs

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDate")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [centerlineAzimuth].
     *
     * Unlike [centerlineAzimuth], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("centerlineAzimuth")
    @ExcludeMissing
    fun _centerlineAzimuth(): JsonField<Double> = centerlineAzimuth

    /**
     * Returns the raw JSON value of [centerlineElevation].
     *
     * Unlike [centerlineElevation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("centerlineElevation")
    @ExcludeMissing
    fun _centerlineElevation(): JsonField<Double> = centerlineElevation

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
     * Returns the raw JSON value of [defaultCha].
     *
     * Unlike [defaultCha], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defaultCHA") @ExcludeMissing fun _defaultCha(): JsonField<Double> = defaultCha

    /**
     * Returns the raw JSON value of [enableDss].
     *
     * Unlike [enableDss], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enableDSS") @ExcludeMissing fun _enableDss(): JsonField<Boolean> = enableDss

    /**
     * Returns the raw JSON value of [fixedPoints].
     *
     * Unlike [fixedPoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fixedPoints")
    @ExcludeMissing
    fun _fixedPoints(): JsonField<List<FixedPointFull>> = fixedPoints

    /**
     * Returns the raw JSON value of [geopotentialModel].
     *
     * Unlike [geopotentialModel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("geopotentialModel")
    @ExcludeMissing
    fun _geopotentialModel(): JsonField<String> = geopotentialModel

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [laserDeconflictTargets].
     *
     * Unlike [laserDeconflictTargets], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("laserDeconflictTargets")
    @ExcludeMissing
    fun _laserDeconflictTargets(): JsonField<List<LaserDeconflictTarget>> = laserDeconflictTargets

    /**
     * Returns the raw JSON value of [laserSystemName].
     *
     * Unlike [laserSystemName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("laserSystemName")
    @ExcludeMissing
    fun _laserSystemName(): JsonField<String> = laserSystemName

    /**
     * Returns the raw JSON value of [lengthCenterline].
     *
     * Unlike [lengthCenterline], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lengthCenterline")
    @ExcludeMissing
    fun _lengthCenterline(): JsonField<Double> = lengthCenterline

    /**
     * Returns the raw JSON value of [lengthLeftRight].
     *
     * Unlike [lengthLeftRight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lengthLeftRight")
    @ExcludeMissing
    fun _lengthLeftRight(): JsonField<Double> = lengthLeftRight

    /**
     * Returns the raw JSON value of [lengthUpDown].
     *
     * Unlike [lengthUpDown], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lengthUpDown")
    @ExcludeMissing
    fun _lengthUpDown(): JsonField<Double> = lengthUpDown

    /**
     * Returns the raw JSON value of [maximumHeight].
     *
     * Unlike [maximumHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maximumHeight")
    @ExcludeMissing
    fun _maximumHeight(): JsonField<Double> = maximumHeight

    /**
     * Returns the raw JSON value of [minimumHeight].
     *
     * Unlike [minimumHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minimumHeight")
    @ExcludeMissing
    fun _minimumHeight(): JsonField<Double> = minimumHeight

    /**
     * Returns the raw JSON value of [missionName].
     *
     * Unlike [missionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("missionName") @ExcludeMissing fun _missionName(): JsonField<String> = missionName

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
     * Returns the raw JSON value of [platformLocationName].
     *
     * Unlike [platformLocationName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("platformLocationName")
    @ExcludeMissing
    fun _platformLocationName(): JsonField<String> = platformLocationName

    /**
     * Returns the raw JSON value of [platformLocationType].
     *
     * Unlike [platformLocationType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("platformLocationType")
    @ExcludeMissing
    fun _platformLocationType(): JsonField<String> = platformLocationType

    /**
     * Returns the raw JSON value of [programId].
     *
     * Unlike [programId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("programId") @ExcludeMissing fun _programId(): JsonField<String> = programId

    /**
     * Returns the raw JSON value of [propagator].
     *
     * Unlike [propagator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propagator") @ExcludeMissing fun _propagator(): JsonField<String> = propagator

    /**
     * Returns the raw JSON value of [protectList].
     *
     * Unlike [protectList], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("protectList")
    @ExcludeMissing
    fun _protectList(): JsonField<List<Int>> = protectList

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [sourceEnabled].
     *
     * Unlike [sourceEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceEnabled")
    @ExcludeMissing
    fun _sourceEnabled(): JsonField<Boolean> = sourceEnabled

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [targetEnabled].
     *
     * Unlike [targetEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetEnabled")
    @ExcludeMissing
    fun _targetEnabled(): JsonField<Boolean> = targetEnabled

    /**
     * Returns the raw JSON value of [targetType].
     *
     * Unlike [targetType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetType") @ExcludeMissing fun _targetType(): JsonField<String> = targetType

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [treatEarthAs].
     *
     * Unlike [treatEarthAs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("treatEarthAs")
    @ExcludeMissing
    fun _treatEarthAs(): JsonField<String> = treatEarthAs

    /**
     * Returns the raw JSON value of [useFieldOfRegard].
     *
     * Unlike [useFieldOfRegard], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("useFieldOfRegard")
    @ExcludeMissing
    fun _useFieldOfRegard(): JsonField<Boolean> = useFieldOfRegard

    /**
     * Returns the raw JSON value of [victimEnabled].
     *
     * Unlike [victimEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("victimEnabled")
    @ExcludeMissing
    fun _victimEnabled(): JsonField<Boolean> = victimEnabled

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
         * [LaserdeconflictrequestTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .endDate()
         * .idLaserEmitters()
         * .numTargets()
         * .requestId()
         * .requestTs()
         * .source()
         * .startDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LaserdeconflictrequestTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var idLaserEmitters: JsonField<MutableList<String>>? = null
        private var numTargets: JsonField<Int>? = null
        private var requestId: JsonField<String>? = null
        private var requestTs: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var centerlineAzimuth: JsonField<Double> = JsonMissing.of()
        private var centerlineElevation: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var defaultCha: JsonField<Double> = JsonMissing.of()
        private var enableDss: JsonField<Boolean> = JsonMissing.of()
        private var fixedPoints: JsonField<MutableList<FixedPointFull>>? = null
        private var geopotentialModel: JsonField<String> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var laserDeconflictTargets: JsonField<MutableList<LaserDeconflictTarget>>? = null
        private var laserSystemName: JsonField<String> = JsonMissing.of()
        private var lengthCenterline: JsonField<Double> = JsonMissing.of()
        private var lengthLeftRight: JsonField<Double> = JsonMissing.of()
        private var lengthUpDown: JsonField<Double> = JsonMissing.of()
        private var maximumHeight: JsonField<Double> = JsonMissing.of()
        private var minimumHeight: JsonField<Double> = JsonMissing.of()
        private var missionName: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var platformLocationName: JsonField<String> = JsonMissing.of()
        private var platformLocationType: JsonField<String> = JsonMissing.of()
        private var programId: JsonField<String> = JsonMissing.of()
        private var propagator: JsonField<String> = JsonMissing.of()
        private var protectList: JsonField<MutableList<Int>>? = null
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var sourceEnabled: JsonField<Boolean> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var targetEnabled: JsonField<Boolean> = JsonMissing.of()
        private var targetType: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var treatEarthAs: JsonField<String> = JsonMissing.of()
        private var useFieldOfRegard: JsonField<Boolean> = JsonMissing.of()
        private var victimEnabled: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            laserdeconflictrequestTupleResponse: LaserdeconflictrequestTupleResponse
        ) = apply {
            classificationMarking = laserdeconflictrequestTupleResponse.classificationMarking
            dataMode = laserdeconflictrequestTupleResponse.dataMode
            endDate = laserdeconflictrequestTupleResponse.endDate
            idLaserEmitters =
                laserdeconflictrequestTupleResponse.idLaserEmitters.map { it.toMutableList() }
            numTargets = laserdeconflictrequestTupleResponse.numTargets
            requestId = laserdeconflictrequestTupleResponse.requestId
            requestTs = laserdeconflictrequestTupleResponse.requestTs
            source = laserdeconflictrequestTupleResponse.source
            startDate = laserdeconflictrequestTupleResponse.startDate
            id = laserdeconflictrequestTupleResponse.id
            centerlineAzimuth = laserdeconflictrequestTupleResponse.centerlineAzimuth
            centerlineElevation = laserdeconflictrequestTupleResponse.centerlineElevation
            createdAt = laserdeconflictrequestTupleResponse.createdAt
            createdBy = laserdeconflictrequestTupleResponse.createdBy
            defaultCha = laserdeconflictrequestTupleResponse.defaultCha
            enableDss = laserdeconflictrequestTupleResponse.enableDss
            fixedPoints = laserdeconflictrequestTupleResponse.fixedPoints.map { it.toMutableList() }
            geopotentialModel = laserdeconflictrequestTupleResponse.geopotentialModel
            idOnOrbit = laserdeconflictrequestTupleResponse.idOnOrbit
            laserDeconflictTargets =
                laserdeconflictrequestTupleResponse.laserDeconflictTargets.map {
                    it.toMutableList()
                }
            laserSystemName = laserdeconflictrequestTupleResponse.laserSystemName
            lengthCenterline = laserdeconflictrequestTupleResponse.lengthCenterline
            lengthLeftRight = laserdeconflictrequestTupleResponse.lengthLeftRight
            lengthUpDown = laserdeconflictrequestTupleResponse.lengthUpDown
            maximumHeight = laserdeconflictrequestTupleResponse.maximumHeight
            minimumHeight = laserdeconflictrequestTupleResponse.minimumHeight
            missionName = laserdeconflictrequestTupleResponse.missionName
            origin = laserdeconflictrequestTupleResponse.origin
            origNetwork = laserdeconflictrequestTupleResponse.origNetwork
            origObjectId = laserdeconflictrequestTupleResponse.origObjectId
            platformLocationName = laserdeconflictrequestTupleResponse.platformLocationName
            platformLocationType = laserdeconflictrequestTupleResponse.platformLocationType
            programId = laserdeconflictrequestTupleResponse.programId
            propagator = laserdeconflictrequestTupleResponse.propagator
            protectList = laserdeconflictrequestTupleResponse.protectList.map { it.toMutableList() }
            satNo = laserdeconflictrequestTupleResponse.satNo
            sourceDl = laserdeconflictrequestTupleResponse.sourceDl
            sourceEnabled = laserdeconflictrequestTupleResponse.sourceEnabled
            status = laserdeconflictrequestTupleResponse.status
            tags = laserdeconflictrequestTupleResponse.tags.map { it.toMutableList() }
            targetEnabled = laserdeconflictrequestTupleResponse.targetEnabled
            targetType = laserdeconflictrequestTupleResponse.targetType
            transactionId = laserdeconflictrequestTupleResponse.transactionId
            treatEarthAs = laserdeconflictrequestTupleResponse.treatEarthAs
            useFieldOfRegard = laserdeconflictrequestTupleResponse.useFieldOfRegard
            victimEnabled = laserdeconflictrequestTupleResponse.victimEnabled
            additionalProperties =
                laserdeconflictrequestTupleResponse.additionalProperties.toMutableMap()
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
         * End date of the time windows associated with this LaserDeconflictRequest, in ISO 8601 UTC
         * format with millisecond precision.
         */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /**
         * A list containing the id strings of the LaserEmitter records in UDL detailing the
         * physical parameters of each laser/emitter operationally involved with this request. All
         * laser/emitter components must be accurately described using the LaserEmitter schema and
         * ingested into the UDL LaserEmitter service before creating a LaserDeconflictRequest.
         * Users should create new LaserEmitter records for non-existent emitters and update
         * existing records for any modifications.
         */
        fun idLaserEmitters(idLaserEmitters: List<String>) =
            idLaserEmitters(JsonField.of(idLaserEmitters))

        /**
         * Sets [Builder.idLaserEmitters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idLaserEmitters] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idLaserEmitters(idLaserEmitters: JsonField<List<String>>) = apply {
            this.idLaserEmitters = idLaserEmitters.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [idLaserEmitters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIdLaserEmitter(idLaserEmitter: String) = apply {
            idLaserEmitters =
                (idLaserEmitters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("idLaserEmitters", it).add(idLaserEmitter)
                }
        }

        /** The number of targets included in this request. */
        fun numTargets(numTargets: Int) = numTargets(JsonField.of(numTargets))

        /**
         * Sets [Builder.numTargets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numTargets] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numTargets(numTargets: JsonField<Int>) = apply { this.numTargets = numTargets }

        /** External identifier for this LaserDeconflictRequest record. */
        fun requestId(requestId: String) = requestId(JsonField.of(requestId))

        /**
         * Sets [Builder.requestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

        /**
         * The datetime that this LaserDeconflictRequest record was created, in ISO 8601 UTC format
         * with millisecond precision.
         */
        fun requestTs(requestTs: OffsetDateTime) = requestTs(JsonField.of(requestTs))

        /**
         * Sets [Builder.requestTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestTs] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestTs(requestTs: JsonField<OffsetDateTime>) = apply { this.requestTs = requestTs }

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
         * Start date of the time windows associated with this LaserDeconflictRequest, in ISO 8601
         * UTC format with millisecond precision.
         */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

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
         * The azimuth angle of the centerline of the geospatial box that confines positions of the
         * laser platform, in degrees.
         */
        fun centerlineAzimuth(centerlineAzimuth: Double) =
            centerlineAzimuth(JsonField.of(centerlineAzimuth))

        /**
         * Sets [Builder.centerlineAzimuth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.centerlineAzimuth] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun centerlineAzimuth(centerlineAzimuth: JsonField<Double>) = apply {
            this.centerlineAzimuth = centerlineAzimuth
        }

        /**
         * The elevation angle of the centerline of the geospatial box that confines the positions
         * of the laser platform, in degrees.
         */
        fun centerlineElevation(centerlineElevation: Double) =
            centerlineElevation(JsonField.of(centerlineElevation))

        /**
         * Sets [Builder.centerlineElevation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.centerlineElevation] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun centerlineElevation(centerlineElevation: JsonField<Double>) = apply {
            this.centerlineElevation = centerlineElevation
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

        /** The half-angle of the safety cone of the laser beam, in degrees. */
        fun defaultCha(defaultCha: Double) = defaultCha(JsonField.of(defaultCha))

        /**
         * Sets [Builder.defaultCha] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultCha] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultCha(defaultCha: JsonField<Double>) = apply { this.defaultCha = defaultCha }

        /** Boolean enabling Dynamic Satellite Susceptibility (DSS) algorithms. */
        fun enableDss(enableDss: Boolean) = enableDss(JsonField.of(enableDss))

        /**
         * Sets [Builder.enableDss] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableDss] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enableDss(enableDss: JsonField<Boolean>) = apply { this.enableDss = enableDss }

        /**
         * A collection of latitude, longitude, and altitude fields which can be used to specify the
         * geometry of the coordinate space in which the laser platform(s) will be operational for
         * this request. For example, a BOX_2_WAYPOINTS would include two data points, while a
         * BOX_4_SURFACE_POINTS would include four data points.
         */
        fun fixedPoints(fixedPoints: List<FixedPointFull>) = fixedPoints(JsonField.of(fixedPoints))

        /**
         * Sets [Builder.fixedPoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fixedPoints] with a well-typed `List<FixedPointFull>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fixedPoints(fixedPoints: JsonField<List<FixedPointFull>>) = apply {
            this.fixedPoints = fixedPoints.map { it.toMutableList() }
        }

        /**
         * Adds a single [FixedPointFull] to [fixedPoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFixedPoint(fixedPoint: FixedPointFull) = apply {
            fixedPoints =
                (fixedPoints ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fixedPoints", it).add(fixedPoint)
                }
        }

        /**
         * Indicates the geopotential model used in the propagation calculation for this request
         * (e.g. EGM-96, WGS-84, WGS-72, WGS66, WGS60, JGM-2, or GEM-T3).
         */
        fun geopotentialModel(geopotentialModel: String) =
            geopotentialModel(JsonField.of(geopotentialModel))

        /**
         * Sets [Builder.geopotentialModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geopotentialModel] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geopotentialModel(geopotentialModel: JsonField<String>) = apply {
            this.geopotentialModel = geopotentialModel
        }

        /** Unique identifier of the on-orbit laser platform. */
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
         * A list containing all laser illumination target object specifications for which
         * deconflictions must be calculated, as planned for this request.
         */
        fun laserDeconflictTargets(laserDeconflictTargets: List<LaserDeconflictTarget>) =
            laserDeconflictTargets(JsonField.of(laserDeconflictTargets))

        /**
         * Sets [Builder.laserDeconflictTargets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.laserDeconflictTargets] with a well-typed
         * `List<LaserDeconflictTarget>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun laserDeconflictTargets(laserDeconflictTargets: JsonField<List<LaserDeconflictTarget>>) =
            apply {
                this.laserDeconflictTargets = laserDeconflictTargets.map { it.toMutableList() }
            }

        /**
         * Adds a single [LaserDeconflictTarget] to [laserDeconflictTargets].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLaserDeconflictTarget(laserDeconflictTarget: LaserDeconflictTarget) = apply {
            laserDeconflictTargets =
                (laserDeconflictTargets ?: JsonField.of(mutableListOf())).also {
                    checkKnown("laserDeconflictTargets", it).add(laserDeconflictTarget)
                }
        }

        /**
         * The name of the laser/beam director system. The Laser Clearinghouse will append
         * identifiers to the name using standard conventions.
         */
        fun laserSystemName(laserSystemName: String) =
            laserSystemName(JsonField.of(laserSystemName))

        /**
         * Sets [Builder.laserSystemName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.laserSystemName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun laserSystemName(laserSystemName: JsonField<String>) = apply {
            this.laserSystemName = laserSystemName
        }

        /**
         * The length of the centerline that passes through the center point of the geospatial box
         * that confines the positions of the laser platform, in kilometers.
         */
        fun lengthCenterline(lengthCenterline: Double) =
            lengthCenterline(JsonField.of(lengthCenterline))

        /**
         * Sets [Builder.lengthCenterline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lengthCenterline] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lengthCenterline(lengthCenterline: JsonField<Double>) = apply {
            this.lengthCenterline = lengthCenterline
        }

        /**
         * Specifies the length of the horizontal dimension of the geospatial box that confines the
         * positions of the laser platform, in kilometers.
         */
        fun lengthLeftRight(lengthLeftRight: Double) =
            lengthLeftRight(JsonField.of(lengthLeftRight))

        /**
         * Sets [Builder.lengthLeftRight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lengthLeftRight] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lengthLeftRight(lengthLeftRight: JsonField<Double>) = apply {
            this.lengthLeftRight = lengthLeftRight
        }

        /**
         * Specifies the length of the vertical dimension of the geospatial box that confines the
         * positions of the laser platform, in kilometers.
         */
        fun lengthUpDown(lengthUpDown: Double) = lengthUpDown(JsonField.of(lengthUpDown))

        /**
         * Sets [Builder.lengthUpDown] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lengthUpDown] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lengthUpDown(lengthUpDown: JsonField<Double>) = apply {
            this.lengthUpDown = lengthUpDown
        }

        /**
         * The maximum laser operating altitude specified as the height above/below the WGS84
         * ellipsoid where the laser is omitted from, in kilometers.
         */
        fun maximumHeight(maximumHeight: Double) = maximumHeight(JsonField.of(maximumHeight))

        /**
         * Sets [Builder.maximumHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumHeight] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maximumHeight(maximumHeight: JsonField<Double>) = apply {
            this.maximumHeight = maximumHeight
        }

        /**
         * The minimum laser operating altitude specified as the height above/below the WGS84
         * ellipsoid where the laser is omitted from, in kilometers.
         */
        fun minimumHeight(minimumHeight: Double) = minimumHeight(JsonField.of(minimumHeight))

        /**
         * Sets [Builder.minimumHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumHeight] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minimumHeight(minimumHeight: JsonField<Double>) = apply {
            this.minimumHeight = minimumHeight
        }

        /** The name of the mission with which this LaserDeconflictRequest is associated. */
        fun missionName(missionName: String) = missionName(JsonField.of(missionName))

        /**
         * Sets [Builder.missionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missionName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun missionName(missionName: JsonField<String>) = apply { this.missionName = missionName }

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
         * Optional identifier provided by the source provider to indicate the on-orbit laser
         * platform. This may be an internal identifier and not necessarily map to a valid satellite
         * number.
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

        /** The name of the laser platform. */
        fun platformLocationName(platformLocationName: String) =
            platformLocationName(JsonField.of(platformLocationName))

        /**
         * Sets [Builder.platformLocationName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformLocationName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformLocationName(platformLocationName: JsonField<String>) = apply {
            this.platformLocationName = platformLocationName
        }

        /**
         * Indicates the type of location(s) the laser platform will be operational for this request
         * (BOX_2_WAYPOINTS, BOX_4_SURFACE_POINTS, BOX_CENTER_POINT_LINE, EXTERNAL_EPHEMERIS,
         * FIXED_POINT, SATELLITE).
         */
        fun platformLocationType(platformLocationType: String) =
            platformLocationType(JsonField.of(platformLocationType))

        /**
         * Sets [Builder.platformLocationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformLocationType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformLocationType(platformLocationType: JsonField<String>) = apply {
            this.platformLocationType = platformLocationType
        }

        /**
         * External identifier for the program that is responsible for this LaserDeconflictRequest.
         */
        fun programId(programId: String) = programId(JsonField.of(programId))

        /**
         * Sets [Builder.programId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.programId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun programId(programId: JsonField<String>) = apply { this.programId = programId }

        /**
         * The type of propagator utilized in the deconfliction/predictive avoidance calculation.
         */
        fun propagator(propagator: String) = propagator(JsonField.of(propagator))

        /**
         * Sets [Builder.propagator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propagator] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun propagator(propagator: JsonField<String>) = apply { this.propagator = propagator }

        /**
         * A list of satellite/catalog numbers that should be protected from any and all incidence
         * of laser illumination for the duration of this request.
         */
        fun protectList(protectList: List<Int>) = protectList(JsonField.of(protectList))

        /**
         * Sets [Builder.protectList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.protectList] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun protectList(protectList: JsonField<List<Int>>) = apply {
            this.protectList = protectList.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [Builder.protectList].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProtectList(protectList: Int) = apply {
            this.protectList =
                (this.protectList ?: JsonField.of(mutableListOf())).also {
                    checkKnown("protectList", it).add(protectList)
                }
        }

        /** The satellite/catalog number of the on-orbit laser platform. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

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
         * Boolean indicating whether error growth of the laser beam is enabled for this request.
         */
        fun sourceEnabled(sourceEnabled: Boolean) = sourceEnabled(JsonField.of(sourceEnabled))

        /**
         * Sets [Builder.sourceEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceEnabled(sourceEnabled: JsonField<Boolean>) = apply {
            this.sourceEnabled = sourceEnabled
        }

        /**
         * Status of this request (APPROVED, COMPLETE_WITH_ERRORS, COMPLETE_WITH_WARNINGS, FAILURE,
         * IN_PROGRESS, REQUESTED, SUCCESS).
         */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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

        /** Boolean indicating whether target error growth is enabled for this request. */
        fun targetEnabled(targetEnabled: Boolean) = targetEnabled(JsonField.of(targetEnabled))

        /**
         * Sets [Builder.targetEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetEnabled(targetEnabled: JsonField<Boolean>) = apply {
            this.targetEnabled = targetEnabled
        }

        /**
         * The target type that concerns this request (BOX_2_WAYPOINTS, BOX_4_SURFACE_POINTS,
         * BOX_CENTER_POINT_LINE, EXTERNAL_EPHEMERIS, FIXED_POINT, SATELLITE).
         */
        fun targetType(targetType: String) = targetType(JsonField.of(targetType))

        /**
         * Sets [Builder.targetType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetType(targetType: JsonField<String>) = apply { this.targetType = targetType }

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
         * Indicates the treatment of earth (INVISIBLE, VICTIM, SHIELD) for this
         * LaserDeconflictRequest record.
         */
        fun treatEarthAs(treatEarthAs: String) = treatEarthAs(JsonField.of(treatEarthAs))

        /**
         * Sets [Builder.treatEarthAs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.treatEarthAs] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun treatEarthAs(treatEarthAs: JsonField<String>) = apply {
            this.treatEarthAs = treatEarthAs
        }

        /**
         * Boolean indicating that, for deconfliction events in which the potential target is an
         * optical imaging satellite, line of sight computation between target and source is ensured
         * when the source emitter is contained within the field of regard (field of view) of the
         * satellite's optical telescope.
         */
        fun useFieldOfRegard(useFieldOfRegard: Boolean) =
            useFieldOfRegard(JsonField.of(useFieldOfRegard))

        /**
         * Sets [Builder.useFieldOfRegard] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useFieldOfRegard] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useFieldOfRegard(useFieldOfRegard: JsonField<Boolean>) = apply {
            this.useFieldOfRegard = useFieldOfRegard
        }

        /**
         * Boolean indicating whether victim error growth is enabled as input to the deconfliction
         * calculations for this request.
         */
        fun victimEnabled(victimEnabled: Boolean) = victimEnabled(JsonField.of(victimEnabled))

        /**
         * Sets [Builder.victimEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.victimEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun victimEnabled(victimEnabled: JsonField<Boolean>) = apply {
            this.victimEnabled = victimEnabled
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
         * Returns an immutable instance of [LaserdeconflictrequestTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .endDate()
         * .idLaserEmitters()
         * .numTargets()
         * .requestId()
         * .requestTs()
         * .source()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LaserdeconflictrequestTupleResponse =
            LaserdeconflictrequestTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("endDate", endDate),
                checkRequired("idLaserEmitters", idLaserEmitters).map { it.toImmutable() },
                checkRequired("numTargets", numTargets),
                checkRequired("requestId", requestId),
                checkRequired("requestTs", requestTs),
                checkRequired("source", source),
                checkRequired("startDate", startDate),
                id,
                centerlineAzimuth,
                centerlineElevation,
                createdAt,
                createdBy,
                defaultCha,
                enableDss,
                (fixedPoints ?: JsonMissing.of()).map { it.toImmutable() },
                geopotentialModel,
                idOnOrbit,
                (laserDeconflictTargets ?: JsonMissing.of()).map { it.toImmutable() },
                laserSystemName,
                lengthCenterline,
                lengthLeftRight,
                lengthUpDown,
                maximumHeight,
                minimumHeight,
                missionName,
                origin,
                origNetwork,
                origObjectId,
                platformLocationName,
                platformLocationType,
                programId,
                propagator,
                (protectList ?: JsonMissing.of()).map { it.toImmutable() },
                satNo,
                sourceDl,
                sourceEnabled,
                status,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                targetEnabled,
                targetType,
                transactionId,
                treatEarthAs,
                useFieldOfRegard,
                victimEnabled,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LaserdeconflictrequestTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        endDate()
        idLaserEmitters()
        numTargets()
        requestId()
        requestTs()
        source()
        startDate()
        id()
        centerlineAzimuth()
        centerlineElevation()
        createdAt()
        createdBy()
        defaultCha()
        enableDss()
        fixedPoints().ifPresent { it.forEach { it.validate() } }
        geopotentialModel()
        idOnOrbit()
        laserDeconflictTargets().ifPresent { it.forEach { it.validate() } }
        laserSystemName()
        lengthCenterline()
        lengthLeftRight()
        lengthUpDown()
        maximumHeight()
        minimumHeight()
        missionName()
        origin()
        origNetwork()
        origObjectId()
        platformLocationName()
        platformLocationType()
        programId()
        propagator()
        protectList()
        satNo()
        sourceDl()
        sourceEnabled()
        status()
        tags()
        targetEnabled()
        targetType()
        transactionId()
        treatEarthAs()
        useFieldOfRegard()
        victimEnabled()
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
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (idLaserEmitters.asKnown().getOrNull()?.size ?: 0) +
            (if (numTargets.asKnown().isPresent) 1 else 0) +
            (if (requestId.asKnown().isPresent) 1 else 0) +
            (if (requestTs.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startDate.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (centerlineAzimuth.asKnown().isPresent) 1 else 0) +
            (if (centerlineElevation.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (defaultCha.asKnown().isPresent) 1 else 0) +
            (if (enableDss.asKnown().isPresent) 1 else 0) +
            (fixedPoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (geopotentialModel.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (laserDeconflictTargets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (laserSystemName.asKnown().isPresent) 1 else 0) +
            (if (lengthCenterline.asKnown().isPresent) 1 else 0) +
            (if (lengthLeftRight.asKnown().isPresent) 1 else 0) +
            (if (lengthUpDown.asKnown().isPresent) 1 else 0) +
            (if (maximumHeight.asKnown().isPresent) 1 else 0) +
            (if (minimumHeight.asKnown().isPresent) 1 else 0) +
            (if (missionName.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (platformLocationName.asKnown().isPresent) 1 else 0) +
            (if (platformLocationType.asKnown().isPresent) 1 else 0) +
            (if (programId.asKnown().isPresent) 1 else 0) +
            (if (propagator.asKnown().isPresent) 1 else 0) +
            (protectList.asKnown().getOrNull()?.size ?: 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (sourceEnabled.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (targetEnabled.asKnown().isPresent) 1 else 0) +
            (if (targetType.asKnown().isPresent) 1 else 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (treatEarthAs.asKnown().isPresent) 1 else 0) +
            (if (useFieldOfRegard.asKnown().isPresent) 1 else 0) +
            (if (victimEnabled.asKnown().isPresent) 1 else 0)

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

    /**
     * Model representation which can be used for the specification of target object for a laser
     * operation. The specification of various target types common across space-to-space,
     * space-to-ground, and ground-to-space laser operations are supported by this model.
     */
    class LaserDeconflictTarget
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val source: JsonField<String>,
        private val id: JsonField<String>,
        private val azimuth: JsonField<Double>,
        private val azimuthEnd: JsonField<Double>,
        private val azimuthIncrement: JsonField<Double>,
        private val azimuthStart: JsonField<Double>,
        private val centerlineAzimuth: JsonField<Double>,
        private val centerlineElevation: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val declination: JsonField<Double>,
        private val elevation: JsonField<Double>,
        private val elevationEnd: JsonField<Double>,
        private val elevationIncrement: JsonField<Double>,
        private val elevationStart: JsonField<Double>,
        private val fixedPoints: JsonField<List<FixedPointFull>>,
        private val idLaserDeconflictRequest: JsonField<String>,
        private val lengthCenterline: JsonField<Double>,
        private val lengthLeftRight: JsonField<Double>,
        private val lengthUpDown: JsonField<Double>,
        private val maximumHeight: JsonField<Double>,
        private val minimumHeight: JsonField<Double>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val ra: JsonField<Double>,
        private val solarSystemBody: JsonField<String>,
        private val sourceDl: JsonField<String>,
        private val starNumber: JsonField<Int>,
        private val startDate: JsonField<OffsetDateTime>,
        private val targetNumber: JsonField<Int>,
        private val targetObjectId: JsonField<String>,
        private val targetObjectNo: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("azimuth") @ExcludeMissing azimuth: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("azimuthEnd")
            @ExcludeMissing
            azimuthEnd: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("azimuthIncrement")
            @ExcludeMissing
            azimuthIncrement: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("azimuthStart")
            @ExcludeMissing
            azimuthStart: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("centerlineAzimuth")
            @ExcludeMissing
            centerlineAzimuth: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("centerlineElevation")
            @ExcludeMissing
            centerlineElevation: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("declination")
            @ExcludeMissing
            declination: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("elevation")
            @ExcludeMissing
            elevation: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("elevationEnd")
            @ExcludeMissing
            elevationEnd: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("elevationIncrement")
            @ExcludeMissing
            elevationIncrement: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("elevationStart")
            @ExcludeMissing
            elevationStart: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("fixedPoints")
            @ExcludeMissing
            fixedPoints: JsonField<List<FixedPointFull>> = JsonMissing.of(),
            @JsonProperty("idLaserDeconflictRequest")
            @ExcludeMissing
            idLaserDeconflictRequest: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lengthCenterline")
            @ExcludeMissing
            lengthCenterline: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lengthLeftRight")
            @ExcludeMissing
            lengthLeftRight: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lengthUpDown")
            @ExcludeMissing
            lengthUpDown: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("maximumHeight")
            @ExcludeMissing
            maximumHeight: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("minimumHeight")
            @ExcludeMissing
            minimumHeight: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ra") @ExcludeMissing ra: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("solarSystemBody")
            @ExcludeMissing
            solarSystemBody: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sourceDL")
            @ExcludeMissing
            sourceDl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("starNumber")
            @ExcludeMissing
            starNumber: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("startDate")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("targetNumber")
            @ExcludeMissing
            targetNumber: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("targetObjectId")
            @ExcludeMissing
            targetObjectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("targetObjectNo")
            @ExcludeMissing
            targetObjectNo: JsonField<Int> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            source,
            id,
            azimuth,
            azimuthEnd,
            azimuthIncrement,
            azimuthStart,
            centerlineAzimuth,
            centerlineElevation,
            createdAt,
            createdBy,
            declination,
            elevation,
            elevationEnd,
            elevationIncrement,
            elevationStart,
            fixedPoints,
            idLaserDeconflictRequest,
            lengthCenterline,
            lengthLeftRight,
            lengthUpDown,
            maximumHeight,
            minimumHeight,
            origin,
            origNetwork,
            ra,
            solarSystemBody,
            sourceDl,
            starNumber,
            startDate,
            targetNumber,
            targetObjectId,
            targetObjectNo,
            mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

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
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The expected or directed azimuth angle of this target, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun azimuth(): Optional<Double> = azimuth.getOptional("azimuth")

        /**
         * The secondary azimuth angle specifying the end of the azimuthal range that defines this
         * target area, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun azimuthEnd(): Optional<Double> = azimuthEnd.getOptional("azimuthEnd")

        /**
         * The incremental change in angle over the given azimuthal range at which the target area
         * will be engaged, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun azimuthIncrement(): Optional<Double> = azimuthIncrement.getOptional("azimuthIncrement")

        /**
         * The initial azimuth angle specifying the start of the azimuthal range that defines this
         * target area, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun azimuthStart(): Optional<Double> = azimuthStart.getOptional("azimuthStart")

        /**
         * The azimuth angle of the centerline of the geospatial box that confines positions of the
         * target, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun centerlineAzimuth(): Optional<Double> =
            centerlineAzimuth.getOptional("centerlineAzimuth")

        /**
         * The elevation angle of the centerline of the geospatial box that confines the positions
         * of the target, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun centerlineElevation(): Optional<Double> =
            centerlineElevation.getOptional("centerlineElevation")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * The expected or directed declination angle of this target, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun declination(): Optional<Double> = declination.getOptional("declination")

        /**
         * The expected or directed elevation angle of this target, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun elevation(): Optional<Double> = elevation.getOptional("elevation")

        /**
         * The secondary elevation angle specifying the end of the elevation range that defines this
         * target area, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun elevationEnd(): Optional<Double> = elevationEnd.getOptional("elevationEnd")

        /**
         * The incremental change in angle across the given elevation range at which the target area
         * will be engaged, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun elevationIncrement(): Optional<Double> =
            elevationIncrement.getOptional("elevationIncrement")

        /**
         * The initial elevation angle specifying the start of the elevation range that defines this
         * target area, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun elevationStart(): Optional<Double> = elevationStart.getOptional("elevationStart")

        /**
         * A collection of latitude, longitude, and altitude fields which can be used to specify the
         * geometry of the coordinate space of this target. For example, a BOX_2_WAYPOINTS would
         * include two data points, while a BOX_4_SURFACE_POINTS would include four data points.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fixedPoints(): Optional<List<FixedPointFull>> = fixedPoints.getOptional("fixedPoints")

        /**
         * Unique identifier of the parent LaserDeconflictRequest record containing this target.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idLaserDeconflictRequest(): Optional<String> =
            idLaserDeconflictRequest.getOptional("idLaserDeconflictRequest")

        /**
         * The length of the centerline that passes through the center point of the geospatial box
         * that confines the positions of the target, in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lengthCenterline(): Optional<Double> = lengthCenterline.getOptional("lengthCenterline")

        /**
         * Specifies the length of the horizontal dimension of the geospatial box that confines the
         * positions of the target, in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lengthLeftRight(): Optional<Double> = lengthLeftRight.getOptional("lengthLeftRight")

        /**
         * Specifies the length of the vertical dimension of the geospatial box that confines the
         * positions of the target, in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lengthUpDown(): Optional<Double> = lengthUpDown.getOptional("lengthUpDown")

        /**
         * The maximum target altitude specified as the height above/below the WGS84 ellipsoid, in
         * kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maximumHeight(): Optional<Double> = maximumHeight.getOptional("maximumHeight")

        /**
         * The minimum target altitude specified as the height above/below the WGS84 ellipsoid, in
         * kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun minimumHeight(): Optional<Double> = minimumHeight.getOptional("minimumHeight")

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * The expected or directed right ascension angle of this target, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ra(): Optional<Double> = ra.getOptional("ra")

        /**
         * The name of the target celestial body in Earth's solar system (JUPITER, MARS, MERCURY,
         * MOON, NEPTUNE, PLUTO, SATURN, SUN, URANUS, VENUS).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun solarSystemBody(): Optional<String> = solarSystemBody.getOptional("solarSystemBody")

        /**
         * The source data library from which this record was received. This could be a remote or
         * tactical UDL or another data library. If null, the record should be assumed to have
         * originated from the primary Enterprise UDL.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

        /**
         * The reference number of the target star.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun starNumber(): Optional<Int> = starNumber.getOptional("starNumber")

        /**
         * Start date of the time windows associated with this LaserDeconflictRequest, in ISO 8601
         * UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): Optional<OffsetDateTime> = startDate.getOptional("startDate")

        /**
         * The number assigned to this target instance for a request.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun targetNumber(): Optional<Int> = targetNumber.getOptional("targetNumber")

        /**
         * Optional target identifier provided by the source provider. This may be an internal
         * identifier and not necessarily map to UDL entities.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun targetObjectId(): Optional<String> = targetObjectId.getOptional("targetObjectId")

        /**
         * If this is an on-orbit target, this is the satellite/catalog number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun targetObjectNo(): Optional<Int> = targetObjectNo.getOptional("targetObjectNo")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [azimuth].
         *
         * Unlike [azimuth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("azimuth") @ExcludeMissing fun _azimuth(): JsonField<Double> = azimuth

        /**
         * Returns the raw JSON value of [azimuthEnd].
         *
         * Unlike [azimuthEnd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("azimuthEnd")
        @ExcludeMissing
        fun _azimuthEnd(): JsonField<Double> = azimuthEnd

        /**
         * Returns the raw JSON value of [azimuthIncrement].
         *
         * Unlike [azimuthIncrement], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("azimuthIncrement")
        @ExcludeMissing
        fun _azimuthIncrement(): JsonField<Double> = azimuthIncrement

        /**
         * Returns the raw JSON value of [azimuthStart].
         *
         * Unlike [azimuthStart], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("azimuthStart")
        @ExcludeMissing
        fun _azimuthStart(): JsonField<Double> = azimuthStart

        /**
         * Returns the raw JSON value of [centerlineAzimuth].
         *
         * Unlike [centerlineAzimuth], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("centerlineAzimuth")
        @ExcludeMissing
        fun _centerlineAzimuth(): JsonField<Double> = centerlineAzimuth

        /**
         * Returns the raw JSON value of [centerlineElevation].
         *
         * Unlike [centerlineElevation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("centerlineElevation")
        @ExcludeMissing
        fun _centerlineElevation(): JsonField<Double> = centerlineElevation

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
         * Returns the raw JSON value of [declination].
         *
         * Unlike [declination], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("declination")
        @ExcludeMissing
        fun _declination(): JsonField<Double> = declination

        /**
         * Returns the raw JSON value of [elevation].
         *
         * Unlike [elevation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("elevation") @ExcludeMissing fun _elevation(): JsonField<Double> = elevation

        /**
         * Returns the raw JSON value of [elevationEnd].
         *
         * Unlike [elevationEnd], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("elevationEnd")
        @ExcludeMissing
        fun _elevationEnd(): JsonField<Double> = elevationEnd

        /**
         * Returns the raw JSON value of [elevationIncrement].
         *
         * Unlike [elevationIncrement], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("elevationIncrement")
        @ExcludeMissing
        fun _elevationIncrement(): JsonField<Double> = elevationIncrement

        /**
         * Returns the raw JSON value of [elevationStart].
         *
         * Unlike [elevationStart], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("elevationStart")
        @ExcludeMissing
        fun _elevationStart(): JsonField<Double> = elevationStart

        /**
         * Returns the raw JSON value of [fixedPoints].
         *
         * Unlike [fixedPoints], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fixedPoints")
        @ExcludeMissing
        fun _fixedPoints(): JsonField<List<FixedPointFull>> = fixedPoints

        /**
         * Returns the raw JSON value of [idLaserDeconflictRequest].
         *
         * Unlike [idLaserDeconflictRequest], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("idLaserDeconflictRequest")
        @ExcludeMissing
        fun _idLaserDeconflictRequest(): JsonField<String> = idLaserDeconflictRequest

        /**
         * Returns the raw JSON value of [lengthCenterline].
         *
         * Unlike [lengthCenterline], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lengthCenterline")
        @ExcludeMissing
        fun _lengthCenterline(): JsonField<Double> = lengthCenterline

        /**
         * Returns the raw JSON value of [lengthLeftRight].
         *
         * Unlike [lengthLeftRight], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lengthLeftRight")
        @ExcludeMissing
        fun _lengthLeftRight(): JsonField<Double> = lengthLeftRight

        /**
         * Returns the raw JSON value of [lengthUpDown].
         *
         * Unlike [lengthUpDown], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lengthUpDown")
        @ExcludeMissing
        fun _lengthUpDown(): JsonField<Double> = lengthUpDown

        /**
         * Returns the raw JSON value of [maximumHeight].
         *
         * Unlike [maximumHeight], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximumHeight")
        @ExcludeMissing
        fun _maximumHeight(): JsonField<Double> = maximumHeight

        /**
         * Returns the raw JSON value of [minimumHeight].
         *
         * Unlike [minimumHeight], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimumHeight")
        @ExcludeMissing
        fun _minimumHeight(): JsonField<Double> = minimumHeight

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
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [ra].
         *
         * Unlike [ra], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ra") @ExcludeMissing fun _ra(): JsonField<Double> = ra

        /**
         * Returns the raw JSON value of [solarSystemBody].
         *
         * Unlike [solarSystemBody], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("solarSystemBody")
        @ExcludeMissing
        fun _solarSystemBody(): JsonField<String> = solarSystemBody

        /**
         * Returns the raw JSON value of [sourceDl].
         *
         * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

        /**
         * Returns the raw JSON value of [starNumber].
         *
         * Unlike [starNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starNumber") @ExcludeMissing fun _starNumber(): JsonField<Int> = starNumber

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * Returns the raw JSON value of [targetNumber].
         *
         * Unlike [targetNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("targetNumber")
        @ExcludeMissing
        fun _targetNumber(): JsonField<Int> = targetNumber

        /**
         * Returns the raw JSON value of [targetObjectId].
         *
         * Unlike [targetObjectId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("targetObjectId")
        @ExcludeMissing
        fun _targetObjectId(): JsonField<String> = targetObjectId

        /**
         * Returns the raw JSON value of [targetObjectNo].
         *
         * Unlike [targetObjectNo], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("targetObjectNo")
        @ExcludeMissing
        fun _targetObjectNo(): JsonField<Int> = targetObjectNo

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
             * Returns a mutable builder for constructing an instance of [LaserDeconflictTarget].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LaserDeconflictTarget]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var azimuth: JsonField<Double> = JsonMissing.of()
            private var azimuthEnd: JsonField<Double> = JsonMissing.of()
            private var azimuthIncrement: JsonField<Double> = JsonMissing.of()
            private var azimuthStart: JsonField<Double> = JsonMissing.of()
            private var centerlineAzimuth: JsonField<Double> = JsonMissing.of()
            private var centerlineElevation: JsonField<Double> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var declination: JsonField<Double> = JsonMissing.of()
            private var elevation: JsonField<Double> = JsonMissing.of()
            private var elevationEnd: JsonField<Double> = JsonMissing.of()
            private var elevationIncrement: JsonField<Double> = JsonMissing.of()
            private var elevationStart: JsonField<Double> = JsonMissing.of()
            private var fixedPoints: JsonField<MutableList<FixedPointFull>>? = null
            private var idLaserDeconflictRequest: JsonField<String> = JsonMissing.of()
            private var lengthCenterline: JsonField<Double> = JsonMissing.of()
            private var lengthLeftRight: JsonField<Double> = JsonMissing.of()
            private var lengthUpDown: JsonField<Double> = JsonMissing.of()
            private var maximumHeight: JsonField<Double> = JsonMissing.of()
            private var minimumHeight: JsonField<Double> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var ra: JsonField<Double> = JsonMissing.of()
            private var solarSystemBody: JsonField<String> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var starNumber: JsonField<Int> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var targetNumber: JsonField<Int> = JsonMissing.of()
            private var targetObjectId: JsonField<String> = JsonMissing.of()
            private var targetObjectNo: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(laserDeconflictTarget: LaserDeconflictTarget) = apply {
                classificationMarking = laserDeconflictTarget.classificationMarking
                dataMode = laserDeconflictTarget.dataMode
                source = laserDeconflictTarget.source
                id = laserDeconflictTarget.id
                azimuth = laserDeconflictTarget.azimuth
                azimuthEnd = laserDeconflictTarget.azimuthEnd
                azimuthIncrement = laserDeconflictTarget.azimuthIncrement
                azimuthStart = laserDeconflictTarget.azimuthStart
                centerlineAzimuth = laserDeconflictTarget.centerlineAzimuth
                centerlineElevation = laserDeconflictTarget.centerlineElevation
                createdAt = laserDeconflictTarget.createdAt
                createdBy = laserDeconflictTarget.createdBy
                declination = laserDeconflictTarget.declination
                elevation = laserDeconflictTarget.elevation
                elevationEnd = laserDeconflictTarget.elevationEnd
                elevationIncrement = laserDeconflictTarget.elevationIncrement
                elevationStart = laserDeconflictTarget.elevationStart
                fixedPoints = laserDeconflictTarget.fixedPoints.map { it.toMutableList() }
                idLaserDeconflictRequest = laserDeconflictTarget.idLaserDeconflictRequest
                lengthCenterline = laserDeconflictTarget.lengthCenterline
                lengthLeftRight = laserDeconflictTarget.lengthLeftRight
                lengthUpDown = laserDeconflictTarget.lengthUpDown
                maximumHeight = laserDeconflictTarget.maximumHeight
                minimumHeight = laserDeconflictTarget.minimumHeight
                origin = laserDeconflictTarget.origin
                origNetwork = laserDeconflictTarget.origNetwork
                ra = laserDeconflictTarget.ra
                solarSystemBody = laserDeconflictTarget.solarSystemBody
                sourceDl = laserDeconflictTarget.sourceDl
                starNumber = laserDeconflictTarget.starNumber
                startDate = laserDeconflictTarget.startDate
                targetNumber = laserDeconflictTarget.targetNumber
                targetObjectId = laserDeconflictTarget.targetObjectId
                targetObjectNo = laserDeconflictTarget.targetObjectNo
                additionalProperties = laserDeconflictTarget.additionalProperties.toMutableMap()
            }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            /**
             * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The expected or directed azimuth angle of this target, in degrees. */
            fun azimuth(azimuth: Double) = azimuth(JsonField.of(azimuth))

            /**
             * Sets [Builder.azimuth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.azimuth] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun azimuth(azimuth: JsonField<Double>) = apply { this.azimuth = azimuth }

            /**
             * The secondary azimuth angle specifying the end of the azimuthal range that defines
             * this target area, in degrees.
             */
            fun azimuthEnd(azimuthEnd: Double) = azimuthEnd(JsonField.of(azimuthEnd))

            /**
             * Sets [Builder.azimuthEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.azimuthEnd] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun azimuthEnd(azimuthEnd: JsonField<Double>) = apply { this.azimuthEnd = azimuthEnd }

            /**
             * The incremental change in angle over the given azimuthal range at which the target
             * area will be engaged, in degrees.
             */
            fun azimuthIncrement(azimuthIncrement: Double) =
                azimuthIncrement(JsonField.of(azimuthIncrement))

            /**
             * Sets [Builder.azimuthIncrement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.azimuthIncrement] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun azimuthIncrement(azimuthIncrement: JsonField<Double>) = apply {
                this.azimuthIncrement = azimuthIncrement
            }

            /**
             * The initial azimuth angle specifying the start of the azimuthal range that defines
             * this target area, in degrees.
             */
            fun azimuthStart(azimuthStart: Double) = azimuthStart(JsonField.of(azimuthStart))

            /**
             * Sets [Builder.azimuthStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.azimuthStart] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun azimuthStart(azimuthStart: JsonField<Double>) = apply {
                this.azimuthStart = azimuthStart
            }

            /**
             * The azimuth angle of the centerline of the geospatial box that confines positions of
             * the target, in degrees.
             */
            fun centerlineAzimuth(centerlineAzimuth: Double) =
                centerlineAzimuth(JsonField.of(centerlineAzimuth))

            /**
             * Sets [Builder.centerlineAzimuth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.centerlineAzimuth] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun centerlineAzimuth(centerlineAzimuth: JsonField<Double>) = apply {
                this.centerlineAzimuth = centerlineAzimuth
            }

            /**
             * The elevation angle of the centerline of the geospatial box that confines the
             * positions of the target, in degrees.
             */
            fun centerlineElevation(centerlineElevation: Double) =
                centerlineElevation(JsonField.of(centerlineElevation))

            /**
             * Sets [Builder.centerlineElevation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.centerlineElevation] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun centerlineElevation(centerlineElevation: JsonField<Double>) = apply {
                this.centerlineElevation = centerlineElevation
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Application user who created the row in the database, auto-populated by the system.
             */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** The expected or directed declination angle of this target, in degrees. */
            fun declination(declination: Double) = declination(JsonField.of(declination))

            /**
             * Sets [Builder.declination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.declination] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun declination(declination: JsonField<Double>) = apply {
                this.declination = declination
            }

            /** The expected or directed elevation angle of this target, in degrees. */
            fun elevation(elevation: Double) = elevation(JsonField.of(elevation))

            /**
             * Sets [Builder.elevation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elevation] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun elevation(elevation: JsonField<Double>) = apply { this.elevation = elevation }

            /**
             * The secondary elevation angle specifying the end of the elevation range that defines
             * this target area, in degrees.
             */
            fun elevationEnd(elevationEnd: Double) = elevationEnd(JsonField.of(elevationEnd))

            /**
             * Sets [Builder.elevationEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elevationEnd] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun elevationEnd(elevationEnd: JsonField<Double>) = apply {
                this.elevationEnd = elevationEnd
            }

            /**
             * The incremental change in angle across the given elevation range at which the target
             * area will be engaged, in degrees.
             */
            fun elevationIncrement(elevationIncrement: Double) =
                elevationIncrement(JsonField.of(elevationIncrement))

            /**
             * Sets [Builder.elevationIncrement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elevationIncrement] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun elevationIncrement(elevationIncrement: JsonField<Double>) = apply {
                this.elevationIncrement = elevationIncrement
            }

            /**
             * The initial elevation angle specifying the start of the elevation range that defines
             * this target area, in degrees.
             */
            fun elevationStart(elevationStart: Double) =
                elevationStart(JsonField.of(elevationStart))

            /**
             * Sets [Builder.elevationStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elevationStart] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun elevationStart(elevationStart: JsonField<Double>) = apply {
                this.elevationStart = elevationStart
            }

            /**
             * A collection of latitude, longitude, and altitude fields which can be used to specify
             * the geometry of the coordinate space of this target. For example, a BOX_2_WAYPOINTS
             * would include two data points, while a BOX_4_SURFACE_POINTS would include four data
             * points.
             */
            fun fixedPoints(fixedPoints: List<FixedPointFull>) =
                fixedPoints(JsonField.of(fixedPoints))

            /**
             * Sets [Builder.fixedPoints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fixedPoints] with a well-typed
             * `List<FixedPointFull>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun fixedPoints(fixedPoints: JsonField<List<FixedPointFull>>) = apply {
                this.fixedPoints = fixedPoints.map { it.toMutableList() }
            }

            /**
             * Adds a single [FixedPointFull] to [fixedPoints].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFixedPoint(fixedPoint: FixedPointFull) = apply {
                fixedPoints =
                    (fixedPoints ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fixedPoints", it).add(fixedPoint)
                    }
            }

            /**
             * Unique identifier of the parent LaserDeconflictRequest record containing this target.
             */
            fun idLaserDeconflictRequest(idLaserDeconflictRequest: String) =
                idLaserDeconflictRequest(JsonField.of(idLaserDeconflictRequest))

            /**
             * Sets [Builder.idLaserDeconflictRequest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idLaserDeconflictRequest] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun idLaserDeconflictRequest(idLaserDeconflictRequest: JsonField<String>) = apply {
                this.idLaserDeconflictRequest = idLaserDeconflictRequest
            }

            /**
             * The length of the centerline that passes through the center point of the geospatial
             * box that confines the positions of the target, in kilometers.
             */
            fun lengthCenterline(lengthCenterline: Double) =
                lengthCenterline(JsonField.of(lengthCenterline))

            /**
             * Sets [Builder.lengthCenterline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lengthCenterline] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lengthCenterline(lengthCenterline: JsonField<Double>) = apply {
                this.lengthCenterline = lengthCenterline
            }

            /**
             * Specifies the length of the horizontal dimension of the geospatial box that confines
             * the positions of the target, in kilometers.
             */
            fun lengthLeftRight(lengthLeftRight: Double) =
                lengthLeftRight(JsonField.of(lengthLeftRight))

            /**
             * Sets [Builder.lengthLeftRight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lengthLeftRight] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lengthLeftRight(lengthLeftRight: JsonField<Double>) = apply {
                this.lengthLeftRight = lengthLeftRight
            }

            /**
             * Specifies the length of the vertical dimension of the geospatial box that confines
             * the positions of the target, in kilometers.
             */
            fun lengthUpDown(lengthUpDown: Double) = lengthUpDown(JsonField.of(lengthUpDown))

            /**
             * Sets [Builder.lengthUpDown] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lengthUpDown] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lengthUpDown(lengthUpDown: JsonField<Double>) = apply {
                this.lengthUpDown = lengthUpDown
            }

            /**
             * The maximum target altitude specified as the height above/below the WGS84 ellipsoid,
             * in kilometers.
             */
            fun maximumHeight(maximumHeight: Double) = maximumHeight(JsonField.of(maximumHeight))

            /**
             * Sets [Builder.maximumHeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumHeight] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumHeight(maximumHeight: JsonField<Double>) = apply {
                this.maximumHeight = maximumHeight
            }

            /**
             * The minimum target altitude specified as the height above/below the WGS84 ellipsoid,
             * in kilometers.
             */
            fun minimumHeight(minimumHeight: Double) = minimumHeight(JsonField.of(minimumHeight))

            /**
             * Sets [Builder.minimumHeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumHeight] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimumHeight(minimumHeight: JsonField<Double>) = apply {
                this.minimumHeight = minimumHeight
            }

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) = apply {
                this.origNetwork = origNetwork
            }

            /** The expected or directed right ascension angle of this target, in degrees. */
            fun ra(ra: Double) = ra(JsonField.of(ra))

            /**
             * Sets [Builder.ra] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ra] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ra(ra: JsonField<Double>) = apply { this.ra = ra }

            /**
             * The name of the target celestial body in Earth's solar system (JUPITER, MARS,
             * MERCURY, MOON, NEPTUNE, PLUTO, SATURN, SUN, URANUS, VENUS).
             */
            fun solarSystemBody(solarSystemBody: String) =
                solarSystemBody(JsonField.of(solarSystemBody))

            /**
             * Sets [Builder.solarSystemBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.solarSystemBody] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun solarSystemBody(solarSystemBody: JsonField<String>) = apply {
                this.solarSystemBody = solarSystemBody
            }

            /**
             * The source data library from which this record was received. This could be a remote
             * or tactical UDL or another data library. If null, the record should be assumed to
             * have originated from the primary Enterprise UDL.
             */
            fun sourceDl(sourceDl: String) = sourceDl(JsonField.of(sourceDl))

            /**
             * Sets [Builder.sourceDl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceDl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceDl(sourceDl: JsonField<String>) = apply { this.sourceDl = sourceDl }

            /** The reference number of the target star. */
            fun starNumber(starNumber: Int) = starNumber(JsonField.of(starNumber))

            /**
             * Sets [Builder.starNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.starNumber] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun starNumber(starNumber: JsonField<Int>) = apply { this.starNumber = starNumber }

            /**
             * Start date of the time windows associated with this LaserDeconflictRequest, in ISO
             * 8601 UTC format with millisecond precision.
             */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** The number assigned to this target instance for a request. */
            fun targetNumber(targetNumber: Int) = targetNumber(JsonField.of(targetNumber))

            /**
             * Sets [Builder.targetNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetNumber] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetNumber(targetNumber: JsonField<Int>) = apply {
                this.targetNumber = targetNumber
            }

            /**
             * Optional target identifier provided by the source provider. This may be an internal
             * identifier and not necessarily map to UDL entities.
             */
            fun targetObjectId(targetObjectId: String) =
                targetObjectId(JsonField.of(targetObjectId))

            /**
             * Sets [Builder.targetObjectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetObjectId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetObjectId(targetObjectId: JsonField<String>) = apply {
                this.targetObjectId = targetObjectId
            }

            /** If this is an on-orbit target, this is the satellite/catalog number. */
            fun targetObjectNo(targetObjectNo: Int) = targetObjectNo(JsonField.of(targetObjectNo))

            /**
             * Sets [Builder.targetObjectNo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetObjectNo] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetObjectNo(targetObjectNo: JsonField<Int>) = apply {
                this.targetObjectNo = targetObjectNo
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
             * Returns an immutable instance of [LaserDeconflictTarget].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LaserDeconflictTarget =
                LaserDeconflictTarget(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("source", source),
                    id,
                    azimuth,
                    azimuthEnd,
                    azimuthIncrement,
                    azimuthStart,
                    centerlineAzimuth,
                    centerlineElevation,
                    createdAt,
                    createdBy,
                    declination,
                    elevation,
                    elevationEnd,
                    elevationIncrement,
                    elevationStart,
                    (fixedPoints ?: JsonMissing.of()).map { it.toImmutable() },
                    idLaserDeconflictRequest,
                    lengthCenterline,
                    lengthLeftRight,
                    lengthUpDown,
                    maximumHeight,
                    minimumHeight,
                    origin,
                    origNetwork,
                    ra,
                    solarSystemBody,
                    sourceDl,
                    starNumber,
                    startDate,
                    targetNumber,
                    targetObjectId,
                    targetObjectNo,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LaserDeconflictTarget = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            source()
            id()
            azimuth()
            azimuthEnd()
            azimuthIncrement()
            azimuthStart()
            centerlineAzimuth()
            centerlineElevation()
            createdAt()
            createdBy()
            declination()
            elevation()
            elevationEnd()
            elevationIncrement()
            elevationStart()
            fixedPoints().ifPresent { it.forEach { it.validate() } }
            idLaserDeconflictRequest()
            lengthCenterline()
            lengthLeftRight()
            lengthUpDown()
            maximumHeight()
            minimumHeight()
            origin()
            origNetwork()
            ra()
            solarSystemBody()
            sourceDl()
            starNumber()
            startDate()
            targetNumber()
            targetObjectId()
            targetObjectNo()
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
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (azimuth.asKnown().isPresent) 1 else 0) +
                (if (azimuthEnd.asKnown().isPresent) 1 else 0) +
                (if (azimuthIncrement.asKnown().isPresent) 1 else 0) +
                (if (azimuthStart.asKnown().isPresent) 1 else 0) +
                (if (centerlineAzimuth.asKnown().isPresent) 1 else 0) +
                (if (centerlineElevation.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (declination.asKnown().isPresent) 1 else 0) +
                (if (elevation.asKnown().isPresent) 1 else 0) +
                (if (elevationEnd.asKnown().isPresent) 1 else 0) +
                (if (elevationIncrement.asKnown().isPresent) 1 else 0) +
                (if (elevationStart.asKnown().isPresent) 1 else 0) +
                (fixedPoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (idLaserDeconflictRequest.asKnown().isPresent) 1 else 0) +
                (if (lengthCenterline.asKnown().isPresent) 1 else 0) +
                (if (lengthLeftRight.asKnown().isPresent) 1 else 0) +
                (if (lengthUpDown.asKnown().isPresent) 1 else 0) +
                (if (maximumHeight.asKnown().isPresent) 1 else 0) +
                (if (minimumHeight.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (ra.asKnown().isPresent) 1 else 0) +
                (if (solarSystemBody.asKnown().isPresent) 1 else 0) +
                (if (sourceDl.asKnown().isPresent) 1 else 0) +
                (if (starNumber.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0) +
                (if (targetNumber.asKnown().isPresent) 1 else 0) +
                (if (targetObjectId.asKnown().isPresent) 1 else 0) +
                (if (targetObjectNo.asKnown().isPresent) 1 else 0)

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
        class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REAL,
                TEST,
                SIMULATED,
                EXERCISE,
                /**
                 * An enum member indicating that [DataMode] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

            return other is LaserDeconflictTarget &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                source == other.source &&
                id == other.id &&
                azimuth == other.azimuth &&
                azimuthEnd == other.azimuthEnd &&
                azimuthIncrement == other.azimuthIncrement &&
                azimuthStart == other.azimuthStart &&
                centerlineAzimuth == other.centerlineAzimuth &&
                centerlineElevation == other.centerlineElevation &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                declination == other.declination &&
                elevation == other.elevation &&
                elevationEnd == other.elevationEnd &&
                elevationIncrement == other.elevationIncrement &&
                elevationStart == other.elevationStart &&
                fixedPoints == other.fixedPoints &&
                idLaserDeconflictRequest == other.idLaserDeconflictRequest &&
                lengthCenterline == other.lengthCenterline &&
                lengthLeftRight == other.lengthLeftRight &&
                lengthUpDown == other.lengthUpDown &&
                maximumHeight == other.maximumHeight &&
                minimumHeight == other.minimumHeight &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                ra == other.ra &&
                solarSystemBody == other.solarSystemBody &&
                sourceDl == other.sourceDl &&
                starNumber == other.starNumber &&
                startDate == other.startDate &&
                targetNumber == other.targetNumber &&
                targetObjectId == other.targetObjectId &&
                targetObjectNo == other.targetObjectNo &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                source,
                id,
                azimuth,
                azimuthEnd,
                azimuthIncrement,
                azimuthStart,
                centerlineAzimuth,
                centerlineElevation,
                createdAt,
                createdBy,
                declination,
                elevation,
                elevationEnd,
                elevationIncrement,
                elevationStart,
                fixedPoints,
                idLaserDeconflictRequest,
                lengthCenterline,
                lengthLeftRight,
                lengthUpDown,
                maximumHeight,
                minimumHeight,
                origin,
                origNetwork,
                ra,
                solarSystemBody,
                sourceDl,
                starNumber,
                startDate,
                targetNumber,
                targetObjectId,
                targetObjectNo,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LaserDeconflictTarget{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, id=$id, azimuth=$azimuth, azimuthEnd=$azimuthEnd, azimuthIncrement=$azimuthIncrement, azimuthStart=$azimuthStart, centerlineAzimuth=$centerlineAzimuth, centerlineElevation=$centerlineElevation, createdAt=$createdAt, createdBy=$createdBy, declination=$declination, elevation=$elevation, elevationEnd=$elevationEnd, elevationIncrement=$elevationIncrement, elevationStart=$elevationStart, fixedPoints=$fixedPoints, idLaserDeconflictRequest=$idLaserDeconflictRequest, lengthCenterline=$lengthCenterline, lengthLeftRight=$lengthLeftRight, lengthUpDown=$lengthUpDown, maximumHeight=$maximumHeight, minimumHeight=$minimumHeight, origin=$origin, origNetwork=$origNetwork, ra=$ra, solarSystemBody=$solarSystemBody, sourceDl=$sourceDl, starNumber=$starNumber, startDate=$startDate, targetNumber=$targetNumber, targetObjectId=$targetObjectId, targetObjectNo=$targetObjectNo, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LaserdeconflictrequestTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            endDate == other.endDate &&
            idLaserEmitters == other.idLaserEmitters &&
            numTargets == other.numTargets &&
            requestId == other.requestId &&
            requestTs == other.requestTs &&
            source == other.source &&
            startDate == other.startDate &&
            id == other.id &&
            centerlineAzimuth == other.centerlineAzimuth &&
            centerlineElevation == other.centerlineElevation &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            defaultCha == other.defaultCha &&
            enableDss == other.enableDss &&
            fixedPoints == other.fixedPoints &&
            geopotentialModel == other.geopotentialModel &&
            idOnOrbit == other.idOnOrbit &&
            laserDeconflictTargets == other.laserDeconflictTargets &&
            laserSystemName == other.laserSystemName &&
            lengthCenterline == other.lengthCenterline &&
            lengthLeftRight == other.lengthLeftRight &&
            lengthUpDown == other.lengthUpDown &&
            maximumHeight == other.maximumHeight &&
            minimumHeight == other.minimumHeight &&
            missionName == other.missionName &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            platformLocationName == other.platformLocationName &&
            platformLocationType == other.platformLocationType &&
            programId == other.programId &&
            propagator == other.propagator &&
            protectList == other.protectList &&
            satNo == other.satNo &&
            sourceDl == other.sourceDl &&
            sourceEnabled == other.sourceEnabled &&
            status == other.status &&
            tags == other.tags &&
            targetEnabled == other.targetEnabled &&
            targetType == other.targetType &&
            transactionId == other.transactionId &&
            treatEarthAs == other.treatEarthAs &&
            useFieldOfRegard == other.useFieldOfRegard &&
            victimEnabled == other.victimEnabled &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            endDate,
            idLaserEmitters,
            numTargets,
            requestId,
            requestTs,
            source,
            startDate,
            id,
            centerlineAzimuth,
            centerlineElevation,
            createdAt,
            createdBy,
            defaultCha,
            enableDss,
            fixedPoints,
            geopotentialModel,
            idOnOrbit,
            laserDeconflictTargets,
            laserSystemName,
            lengthCenterline,
            lengthLeftRight,
            lengthUpDown,
            maximumHeight,
            minimumHeight,
            missionName,
            origin,
            origNetwork,
            origObjectId,
            platformLocationName,
            platformLocationType,
            programId,
            propagator,
            protectList,
            satNo,
            sourceDl,
            sourceEnabled,
            status,
            tags,
            targetEnabled,
            targetType,
            transactionId,
            treatEarthAs,
            useFieldOfRegard,
            victimEnabled,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LaserdeconflictrequestTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, endDate=$endDate, idLaserEmitters=$idLaserEmitters, numTargets=$numTargets, requestId=$requestId, requestTs=$requestTs, source=$source, startDate=$startDate, id=$id, centerlineAzimuth=$centerlineAzimuth, centerlineElevation=$centerlineElevation, createdAt=$createdAt, createdBy=$createdBy, defaultCha=$defaultCha, enableDss=$enableDss, fixedPoints=$fixedPoints, geopotentialModel=$geopotentialModel, idOnOrbit=$idOnOrbit, laserDeconflictTargets=$laserDeconflictTargets, laserSystemName=$laserSystemName, lengthCenterline=$lengthCenterline, lengthLeftRight=$lengthLeftRight, lengthUpDown=$lengthUpDown, maximumHeight=$maximumHeight, minimumHeight=$minimumHeight, missionName=$missionName, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, platformLocationName=$platformLocationName, platformLocationType=$platformLocationType, programId=$programId, propagator=$propagator, protectList=$protectList, satNo=$satNo, sourceDl=$sourceDl, sourceEnabled=$sourceEnabled, status=$status, tags=$tags, targetEnabled=$targetEnabled, targetType=$targetType, transactionId=$transactionId, treatEarthAs=$treatEarthAs, useFieldOfRegard=$useFieldOfRegard, victimEnabled=$victimEnabled, additionalProperties=$additionalProperties}"
}

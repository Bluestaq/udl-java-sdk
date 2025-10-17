// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemerissets

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
 * EphemerisSet represents a wrapper or collection of Ephemeris 'points' and meta data indicating
 * the specifics of the propagation of an on-orbit object. Ephemeris is typically distributed in a
 * flat file containing details of the ephemeris generation as well as a large collection of
 * individual points at varying time steps. EphemerisSet is analogous to this flat file.
 */
class EphemerisSetAbridged
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val category: JsonField<String>,
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val numPoints: JsonField<Int>,
    private val pointEndTime: JsonField<OffsetDateTime>,
    private val pointStartTime: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val type: JsonField<String>,
    private val id: JsonField<String>,
    private val bDot: JsonField<Double>,
    private val centBody: JsonField<String>,
    private val comments: JsonField<String>,
    private val covReferenceFrame: JsonField<CovReferenceFrame>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val description: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val dragModel: JsonField<String>,
    private val edr: JsonField<Double>,
    private val filename: JsonField<String>,
    private val geopotentialModel: JsonField<String>,
    private val hasAccel: JsonField<Boolean>,
    private val hasCov: JsonField<Boolean>,
    private val hasMnvr: JsonField<Boolean>,
    private val idManeuvers: JsonField<List<String>>,
    private val idOnOrbit: JsonField<String>,
    private val idStateVector: JsonField<String>,
    private val integrator: JsonField<String>,
    private val interpolation: JsonField<String>,
    private val interpolationDegree: JsonField<Int>,
    private val lunarSolar: JsonField<Boolean>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val pedigree: JsonField<String>,
    private val referenceFrame: JsonField<ReferenceFrame>,
    private val satNo: JsonField<Int>,
    private val solidEarthTides: JsonField<Boolean>,
    private val stepSize: JsonField<Long>,
    private val transactionId: JsonField<String>,
    private val usableEndTime: JsonField<OffsetDateTime>,
    private val usableStartTime: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("category") @ExcludeMissing category: JsonField<String> = JsonMissing.of(),
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("numPoints") @ExcludeMissing numPoints: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("pointEndTime")
        @ExcludeMissing
        pointEndTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("pointStartTime")
        @ExcludeMissing
        pointStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bDot") @ExcludeMissing bDot: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("centBody") @ExcludeMissing centBody: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comments") @ExcludeMissing comments: JsonField<String> = JsonMissing.of(),
        @JsonProperty("covReferenceFrame")
        @ExcludeMissing
        covReferenceFrame: JsonField<CovReferenceFrame> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dragModel") @ExcludeMissing dragModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("edr") @ExcludeMissing edr: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("geopotentialModel")
        @ExcludeMissing
        geopotentialModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hasAccel") @ExcludeMissing hasAccel: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hasCov") @ExcludeMissing hasCov: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hasMnvr") @ExcludeMissing hasMnvr: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("idManeuvers")
        @ExcludeMissing
        idManeuvers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idStateVector")
        @ExcludeMissing
        idStateVector: JsonField<String> = JsonMissing.of(),
        @JsonProperty("integrator")
        @ExcludeMissing
        integrator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interpolation")
        @ExcludeMissing
        interpolation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interpolationDegree")
        @ExcludeMissing
        interpolationDegree: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("lunarSolar")
        @ExcludeMissing
        lunarSolar: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pedigree") @ExcludeMissing pedigree: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referenceFrame")
        @ExcludeMissing
        referenceFrame: JsonField<ReferenceFrame> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("solidEarthTides")
        @ExcludeMissing
        solidEarthTides: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("stepSize") @ExcludeMissing stepSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usableEndTime")
        @ExcludeMissing
        usableEndTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("usableStartTime")
        @ExcludeMissing
        usableStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        category,
        classificationMarking,
        dataMode,
        numPoints,
        pointEndTime,
        pointStartTime,
        source,
        type,
        id,
        bDot,
        centBody,
        comments,
        covReferenceFrame,
        createdAt,
        createdBy,
        description,
        descriptor,
        dragModel,
        edr,
        filename,
        geopotentialModel,
        hasAccel,
        hasCov,
        hasMnvr,
        idManeuvers,
        idOnOrbit,
        idStateVector,
        integrator,
        interpolation,
        interpolationDegree,
        lunarSolar,
        origin,
        origNetwork,
        origObjectId,
        pedigree,
        referenceFrame,
        satNo,
        solidEarthTides,
        stepSize,
        transactionId,
        usableEndTime,
        usableStartTime,
        mutableMapOf(),
    )

    /**
     * The source category of the ephemeris (e.g. OWNER_OPERATOR, ANALYST, EXTERNAL).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): String = category.getRequired("category")

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
     * Number of points contained in the ephemeris.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numPoints(): Int = numPoints.getRequired("numPoints")

    /**
     * End time/last time point of the ephemeris, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pointEndTime(): OffsetDateTime = pointEndTime.getRequired("pointEndTime")

    /**
     * Start time/first time point of the ephemeris, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pointStartTime(): OffsetDateTime = pointStartTime.getRequired("pointStartTime")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The type/purpose of the ephemeris (e.g., CALIBRATION, LAUNCH, MNVR_PLAN, ROUTINE, SCREENING).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * First derivative of ballistic coefficient (m^2/kg-s).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bDot(): Optional<Double> = bDot.getOptional("bDot")

    /**
     * The Central Body of the ephemeris. Assumed to be Earth, unless otherwise indicated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun centBody(): Optional<String> = centBody.getOptional("centBody")

    /**
     * Additional source provided comments associated with the ephemeris.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun comments(): Optional<String> = comments.getOptional("comments")

    /**
     * The reference frame of the covariance matrix elements. If the covReferenceFrame is null it is
     * assumed to be J2000.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun covReferenceFrame(): Optional<CovReferenceFrame> =
        covReferenceFrame.getOptional("covReferenceFrame")

    /**
     * Time the row was created in the database, in UTC.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Application user who created the row in the database.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * Notes/description of the provided ephemeris. A value of DSTOP signifies the ephemeris were
     * generated using the last observation available.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Optional source-provided and searchable metadata or descriptor of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun descriptor(): Optional<String> = descriptor.getOptional("descriptor")

    /**
     * Drag model used in ephemeris generation (e.g. JAC70, MSIS90, NONE, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dragModel(): Optional<String> = dragModel.getOptional("dragModel")

    /**
     * Model parameter value for energy dissipation rate (EDR), expressed in w/kg.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun edr(): Optional<Double> = edr.getOptional("edr")

    /**
     * Filename of the raw file used to provide the ephemeris data including filetype extension, if
     * applicable. This file may be retrieved using the 'getFile' operation as specified in the
     * 'EphemerisSet' OpenAPI docs.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun filename(): Optional<String> = filename.getOptional("filename")

    /**
     * Geopotential model used in ephemeris generation (e.g. EGM-96, WGS-84, WGS-72, JGM-2, GEM-T3),
     * including mm degree zonals, nn degree/order tesserals (e.g. EGM-96 24Z,24T).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geopotentialModel(): Optional<String> = geopotentialModel.getOptional("geopotentialModel")

    /**
     * Boolean indicating whether acceleration data is provided with the ephemeris.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hasAccel(): Optional<Boolean> = hasAccel.getOptional("hasAccel")

    /**
     * Boolean indicating whether covariance data is provided with the ephemeris.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hasCov(): Optional<Boolean> = hasCov.getOptional("hasCov")

    /**
     * Boolean indicating whether maneuver(s) are incorporated into the ephemeris.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hasMnvr(): Optional<Boolean> = hasMnvr.getOptional("hasMnvr")

    /**
     * Array of the maneuver IDs of all maneuvers incorporated in the ephemeris.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idManeuvers(): Optional<List<String>> = idManeuvers.getOptional("idManeuvers")

    /**
     * Unique identifier of the primary satellite on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * ID of the State Vector used to generate the ephemeris.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idStateVector(): Optional<String> = idStateVector.getOptional("idStateVector")

    /**
     * Integrator used in ephemeris generation (e.g. RK7(8), RK8(9), COWELL, TWO-BODY).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun integrator(): Optional<String> = integrator.getOptional("integrator")

    /**
     * The recommended interpolation method for the ephemeris data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun interpolation(): Optional<String> = interpolation.getOptional("interpolation")

    /**
     * The recommended interpolation degree for the ephemeris data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun interpolationDegree(): Optional<Int> =
        interpolationDegree.getOptional("interpolationDegree")

    /**
     * Boolean indicating use of lunar/solar data in ephemeris generation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lunarSolar(): Optional<Boolean> = lunarSolar.getOptional("lunarSolar")

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
     * Optional identifier provided by ephemeris source to indicate the target object of this
     * ephemeris. This may be an internal identifier and not necessarily map to a valid satellite
     * number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * The pedigree of the ephemeris or source data used for ephemeris generation (e.g. DOPPLER,
     * GPS, HYBRID, PROPAGATED, RANGING, SLR).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pedigree(): Optional<String> = pedigree.getOptional("pedigree")

    /**
     * The reference frame of the cartesian orbital states. If the referenceFrame is null it is
     * assumed to be J2000.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun referenceFrame(): Optional<ReferenceFrame> = referenceFrame.getOptional("referenceFrame")

    /**
     * Satellite/catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Boolean indicating use of solid earth tide data in ephemeris generation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solidEarthTides(): Optional<Boolean> = solidEarthTides.getOptional("solidEarthTides")

    /**
     * Ephemeris step size, in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stepSize(): Optional<Long> = stepSize.getOptional("stepSize")

    /**
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

    /**
     * Optional end time of the usable time span for the ephemeris data, in ISO 8601 UTC format with
     * microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun usableEndTime(): Optional<OffsetDateTime> = usableEndTime.getOptional("usableEndTime")

    /**
     * Optional start time of the usable time span for the ephemeris data, in ISO 8601 UTC format
     * with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun usableStartTime(): Optional<OffsetDateTime> = usableStartTime.getOptional("usableStartTime")

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

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
     * Returns the raw JSON value of [numPoints].
     *
     * Unlike [numPoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numPoints") @ExcludeMissing fun _numPoints(): JsonField<Int> = numPoints

    /**
     * Returns the raw JSON value of [pointEndTime].
     *
     * Unlike [pointEndTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pointEndTime")
    @ExcludeMissing
    fun _pointEndTime(): JsonField<OffsetDateTime> = pointEndTime

    /**
     * Returns the raw JSON value of [pointStartTime].
     *
     * Unlike [pointStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pointStartTime")
    @ExcludeMissing
    fun _pointStartTime(): JsonField<OffsetDateTime> = pointStartTime

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
     * Returns the raw JSON value of [bDot].
     *
     * Unlike [bDot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bDot") @ExcludeMissing fun _bDot(): JsonField<Double> = bDot

    /**
     * Returns the raw JSON value of [centBody].
     *
     * Unlike [centBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("centBody") @ExcludeMissing fun _centBody(): JsonField<String> = centBody

    /**
     * Returns the raw JSON value of [comments].
     *
     * Unlike [comments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<String> = comments

    /**
     * Returns the raw JSON value of [covReferenceFrame].
     *
     * Unlike [covReferenceFrame], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("covReferenceFrame")
    @ExcludeMissing
    fun _covReferenceFrame(): JsonField<CovReferenceFrame> = covReferenceFrame

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [descriptor].
     *
     * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor(): JsonField<String> = descriptor

    /**
     * Returns the raw JSON value of [dragModel].
     *
     * Unlike [dragModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dragModel") @ExcludeMissing fun _dragModel(): JsonField<String> = dragModel

    /**
     * Returns the raw JSON value of [edr].
     *
     * Unlike [edr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("edr") @ExcludeMissing fun _edr(): JsonField<Double> = edr

    /**
     * Returns the raw JSON value of [filename].
     *
     * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

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
     * Returns the raw JSON value of [hasAccel].
     *
     * Unlike [hasAccel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasAccel") @ExcludeMissing fun _hasAccel(): JsonField<Boolean> = hasAccel

    /**
     * Returns the raw JSON value of [hasCov].
     *
     * Unlike [hasCov], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasCov") @ExcludeMissing fun _hasCov(): JsonField<Boolean> = hasCov

    /**
     * Returns the raw JSON value of [hasMnvr].
     *
     * Unlike [hasMnvr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasMnvr") @ExcludeMissing fun _hasMnvr(): JsonField<Boolean> = hasMnvr

    /**
     * Returns the raw JSON value of [idManeuvers].
     *
     * Unlike [idManeuvers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idManeuvers")
    @ExcludeMissing
    fun _idManeuvers(): JsonField<List<String>> = idManeuvers

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [idStateVector].
     *
     * Unlike [idStateVector], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idStateVector")
    @ExcludeMissing
    fun _idStateVector(): JsonField<String> = idStateVector

    /**
     * Returns the raw JSON value of [integrator].
     *
     * Unlike [integrator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("integrator") @ExcludeMissing fun _integrator(): JsonField<String> = integrator

    /**
     * Returns the raw JSON value of [interpolation].
     *
     * Unlike [interpolation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interpolation")
    @ExcludeMissing
    fun _interpolation(): JsonField<String> = interpolation

    /**
     * Returns the raw JSON value of [interpolationDegree].
     *
     * Unlike [interpolationDegree], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("interpolationDegree")
    @ExcludeMissing
    fun _interpolationDegree(): JsonField<Int> = interpolationDegree

    /**
     * Returns the raw JSON value of [lunarSolar].
     *
     * Unlike [lunarSolar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lunarSolar") @ExcludeMissing fun _lunarSolar(): JsonField<Boolean> = lunarSolar

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
     * Returns the raw JSON value of [pedigree].
     *
     * Unlike [pedigree], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pedigree") @ExcludeMissing fun _pedigree(): JsonField<String> = pedigree

    /**
     * Returns the raw JSON value of [referenceFrame].
     *
     * Unlike [referenceFrame], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referenceFrame")
    @ExcludeMissing
    fun _referenceFrame(): JsonField<ReferenceFrame> = referenceFrame

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [solidEarthTides].
     *
     * Unlike [solidEarthTides], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("solidEarthTides")
    @ExcludeMissing
    fun _solidEarthTides(): JsonField<Boolean> = solidEarthTides

    /**
     * Returns the raw JSON value of [stepSize].
     *
     * Unlike [stepSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stepSize") @ExcludeMissing fun _stepSize(): JsonField<Long> = stepSize

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [usableEndTime].
     *
     * Unlike [usableEndTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usableEndTime")
    @ExcludeMissing
    fun _usableEndTime(): JsonField<OffsetDateTime> = usableEndTime

    /**
     * Returns the raw JSON value of [usableStartTime].
     *
     * Unlike [usableStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usableStartTime")
    @ExcludeMissing
    fun _usableStartTime(): JsonField<OffsetDateTime> = usableStartTime

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
         * Returns a mutable builder for constructing an instance of [EphemerisSetAbridged].
         *
         * The following fields are required:
         * ```java
         * .category()
         * .classificationMarking()
         * .dataMode()
         * .numPoints()
         * .pointEndTime()
         * .pointStartTime()
         * .source()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EphemerisSetAbridged]. */
    class Builder internal constructor() {

        private var category: JsonField<String>? = null
        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var numPoints: JsonField<Int>? = null
        private var pointEndTime: JsonField<OffsetDateTime>? = null
        private var pointStartTime: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var bDot: JsonField<Double> = JsonMissing.of()
        private var centBody: JsonField<String> = JsonMissing.of()
        private var comments: JsonField<String> = JsonMissing.of()
        private var covReferenceFrame: JsonField<CovReferenceFrame> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var dragModel: JsonField<String> = JsonMissing.of()
        private var edr: JsonField<Double> = JsonMissing.of()
        private var filename: JsonField<String> = JsonMissing.of()
        private var geopotentialModel: JsonField<String> = JsonMissing.of()
        private var hasAccel: JsonField<Boolean> = JsonMissing.of()
        private var hasCov: JsonField<Boolean> = JsonMissing.of()
        private var hasMnvr: JsonField<Boolean> = JsonMissing.of()
        private var idManeuvers: JsonField<MutableList<String>>? = null
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idStateVector: JsonField<String> = JsonMissing.of()
        private var integrator: JsonField<String> = JsonMissing.of()
        private var interpolation: JsonField<String> = JsonMissing.of()
        private var interpolationDegree: JsonField<Int> = JsonMissing.of()
        private var lunarSolar: JsonField<Boolean> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var pedigree: JsonField<String> = JsonMissing.of()
        private var referenceFrame: JsonField<ReferenceFrame> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var solidEarthTides: JsonField<Boolean> = JsonMissing.of()
        private var stepSize: JsonField<Long> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var usableEndTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var usableStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ephemerisSetAbridged: EphemerisSetAbridged) = apply {
            category = ephemerisSetAbridged.category
            classificationMarking = ephemerisSetAbridged.classificationMarking
            dataMode = ephemerisSetAbridged.dataMode
            numPoints = ephemerisSetAbridged.numPoints
            pointEndTime = ephemerisSetAbridged.pointEndTime
            pointStartTime = ephemerisSetAbridged.pointStartTime
            source = ephemerisSetAbridged.source
            type = ephemerisSetAbridged.type
            id = ephemerisSetAbridged.id
            bDot = ephemerisSetAbridged.bDot
            centBody = ephemerisSetAbridged.centBody
            comments = ephemerisSetAbridged.comments
            covReferenceFrame = ephemerisSetAbridged.covReferenceFrame
            createdAt = ephemerisSetAbridged.createdAt
            createdBy = ephemerisSetAbridged.createdBy
            description = ephemerisSetAbridged.description
            descriptor = ephemerisSetAbridged.descriptor
            dragModel = ephemerisSetAbridged.dragModel
            edr = ephemerisSetAbridged.edr
            filename = ephemerisSetAbridged.filename
            geopotentialModel = ephemerisSetAbridged.geopotentialModel
            hasAccel = ephemerisSetAbridged.hasAccel
            hasCov = ephemerisSetAbridged.hasCov
            hasMnvr = ephemerisSetAbridged.hasMnvr
            idManeuvers = ephemerisSetAbridged.idManeuvers.map { it.toMutableList() }
            idOnOrbit = ephemerisSetAbridged.idOnOrbit
            idStateVector = ephemerisSetAbridged.idStateVector
            integrator = ephemerisSetAbridged.integrator
            interpolation = ephemerisSetAbridged.interpolation
            interpolationDegree = ephemerisSetAbridged.interpolationDegree
            lunarSolar = ephemerisSetAbridged.lunarSolar
            origin = ephemerisSetAbridged.origin
            origNetwork = ephemerisSetAbridged.origNetwork
            origObjectId = ephemerisSetAbridged.origObjectId
            pedigree = ephemerisSetAbridged.pedigree
            referenceFrame = ephemerisSetAbridged.referenceFrame
            satNo = ephemerisSetAbridged.satNo
            solidEarthTides = ephemerisSetAbridged.solidEarthTides
            stepSize = ephemerisSetAbridged.stepSize
            transactionId = ephemerisSetAbridged.transactionId
            usableEndTime = ephemerisSetAbridged.usableEndTime
            usableStartTime = ephemerisSetAbridged.usableStartTime
            additionalProperties = ephemerisSetAbridged.additionalProperties.toMutableMap()
        }

        /** The source category of the ephemeris (e.g. OWNER_OPERATOR, ANALYST, EXTERNAL). */
        fun category(category: String) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { this.category = category }

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

        /** Number of points contained in the ephemeris. */
        fun numPoints(numPoints: Int) = numPoints(JsonField.of(numPoints))

        /**
         * Sets [Builder.numPoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numPoints] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numPoints(numPoints: JsonField<Int>) = apply { this.numPoints = numPoints }

        /** End time/last time point of the ephemeris, in ISO 8601 UTC format. */
        fun pointEndTime(pointEndTime: OffsetDateTime) = pointEndTime(JsonField.of(pointEndTime))

        /**
         * Sets [Builder.pointEndTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pointEndTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pointEndTime(pointEndTime: JsonField<OffsetDateTime>) = apply {
            this.pointEndTime = pointEndTime
        }

        /** Start time/first time point of the ephemeris, in ISO 8601 UTC format. */
        fun pointStartTime(pointStartTime: OffsetDateTime) =
            pointStartTime(JsonField.of(pointStartTime))

        /**
         * Sets [Builder.pointStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pointStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pointStartTime(pointStartTime: JsonField<OffsetDateTime>) = apply {
            this.pointStartTime = pointStartTime
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
         * The type/purpose of the ephemeris (e.g., CALIBRATION, LAUNCH, MNVR_PLAN, ROUTINE,
         * SCREENING).
         */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** First derivative of ballistic coefficient (m^2/kg-s). */
        fun bDot(bDot: Double) = bDot(JsonField.of(bDot))

        /**
         * Sets [Builder.bDot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bDot] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bDot(bDot: JsonField<Double>) = apply { this.bDot = bDot }

        /** The Central Body of the ephemeris. Assumed to be Earth, unless otherwise indicated. */
        fun centBody(centBody: String) = centBody(JsonField.of(centBody))

        /**
         * Sets [Builder.centBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.centBody] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun centBody(centBody: JsonField<String>) = apply { this.centBody = centBody }

        /** Additional source provided comments associated with the ephemeris. */
        fun comments(comments: String) = comments(JsonField.of(comments))

        /**
         * Sets [Builder.comments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comments] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comments(comments: JsonField<String>) = apply { this.comments = comments }

        /**
         * The reference frame of the covariance matrix elements. If the covReferenceFrame is null
         * it is assumed to be J2000.
         */
        fun covReferenceFrame(covReferenceFrame: CovReferenceFrame) =
            covReferenceFrame(JsonField.of(covReferenceFrame))

        /**
         * Sets [Builder.covReferenceFrame] to an arbitrary JSON value.
         *
         * You should usually call [Builder.covReferenceFrame] with a well-typed [CovReferenceFrame]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun covReferenceFrame(covReferenceFrame: JsonField<CovReferenceFrame>) = apply {
            this.covReferenceFrame = covReferenceFrame
        }

        /** Time the row was created in the database, in UTC. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Application user who created the row in the database. */
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
         * Notes/description of the provided ephemeris. A value of DSTOP signifies the ephemeris
         * were generated using the last observation available.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Optional source-provided and searchable metadata or descriptor of the data. */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * Sets [Builder.descriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.descriptor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /** Drag model used in ephemeris generation (e.g. JAC70, MSIS90, NONE, etc.). */
        fun dragModel(dragModel: String) = dragModel(JsonField.of(dragModel))

        /**
         * Sets [Builder.dragModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dragModel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dragModel(dragModel: JsonField<String>) = apply { this.dragModel = dragModel }

        /** Model parameter value for energy dissipation rate (EDR), expressed in w/kg. */
        fun edr(edr: Double) = edr(JsonField.of(edr))

        /**
         * Sets [Builder.edr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.edr] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun edr(edr: JsonField<Double>) = apply { this.edr = edr }

        /**
         * Filename of the raw file used to provide the ephemeris data including filetype extension,
         * if applicable. This file may be retrieved using the 'getFile' operation as specified in
         * the 'EphemerisSet' OpenAPI docs.
         */
        fun filename(filename: String) = filename(JsonField.of(filename))

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /**
         * Geopotential model used in ephemeris generation (e.g. EGM-96, WGS-84, WGS-72, JGM-2,
         * GEM-T3), including mm degree zonals, nn degree/order tesserals (e.g. EGM-96 24Z,24T).
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

        /** Boolean indicating whether acceleration data is provided with the ephemeris. */
        fun hasAccel(hasAccel: Boolean) = hasAccel(JsonField.of(hasAccel))

        /**
         * Sets [Builder.hasAccel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasAccel] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasAccel(hasAccel: JsonField<Boolean>) = apply { this.hasAccel = hasAccel }

        /** Boolean indicating whether covariance data is provided with the ephemeris. */
        fun hasCov(hasCov: Boolean) = hasCov(JsonField.of(hasCov))

        /**
         * Sets [Builder.hasCov] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasCov] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasCov(hasCov: JsonField<Boolean>) = apply { this.hasCov = hasCov }

        /** Boolean indicating whether maneuver(s) are incorporated into the ephemeris. */
        fun hasMnvr(hasMnvr: Boolean) = hasMnvr(JsonField.of(hasMnvr))

        /**
         * Sets [Builder.hasMnvr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMnvr] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMnvr(hasMnvr: JsonField<Boolean>) = apply { this.hasMnvr = hasMnvr }

        /** Array of the maneuver IDs of all maneuvers incorporated in the ephemeris. */
        fun idManeuvers(idManeuvers: List<String>) = idManeuvers(JsonField.of(idManeuvers))

        /**
         * Sets [Builder.idManeuvers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idManeuvers] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idManeuvers(idManeuvers: JsonField<List<String>>) = apply {
            this.idManeuvers = idManeuvers.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [idManeuvers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIdManeuver(idManeuver: String) = apply {
            idManeuvers =
                (idManeuvers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("idManeuvers", it).add(idManeuver)
                }
        }

        /** Unique identifier of the primary satellite on-orbit object. */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /** ID of the State Vector used to generate the ephemeris. */
        fun idStateVector(idStateVector: String) = idStateVector(JsonField.of(idStateVector))

        /**
         * Sets [Builder.idStateVector] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idStateVector] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idStateVector(idStateVector: JsonField<String>) = apply {
            this.idStateVector = idStateVector
        }

        /** Integrator used in ephemeris generation (e.g. RK7(8), RK8(9), COWELL, TWO-BODY). */
        fun integrator(integrator: String) = integrator(JsonField.of(integrator))

        /**
         * Sets [Builder.integrator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrator] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun integrator(integrator: JsonField<String>) = apply { this.integrator = integrator }

        /** The recommended interpolation method for the ephemeris data. */
        fun interpolation(interpolation: String) = interpolation(JsonField.of(interpolation))

        /**
         * Sets [Builder.interpolation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interpolation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun interpolation(interpolation: JsonField<String>) = apply {
            this.interpolation = interpolation
        }

        /** The recommended interpolation degree for the ephemeris data. */
        fun interpolationDegree(interpolationDegree: Int) =
            interpolationDegree(JsonField.of(interpolationDegree))

        /**
         * Sets [Builder.interpolationDegree] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interpolationDegree] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interpolationDegree(interpolationDegree: JsonField<Int>) = apply {
            this.interpolationDegree = interpolationDegree
        }

        /** Boolean indicating use of lunar/solar data in ephemeris generation. */
        fun lunarSolar(lunarSolar: Boolean) = lunarSolar(JsonField.of(lunarSolar))

        /**
         * Sets [Builder.lunarSolar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lunarSolar] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lunarSolar(lunarSolar: JsonField<Boolean>) = apply { this.lunarSolar = lunarSolar }

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
         * Optional identifier provided by ephemeris source to indicate the target object of this
         * ephemeris. This may be an internal identifier and not necessarily map to a valid
         * satellite number.
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
         * The pedigree of the ephemeris or source data used for ephemeris generation (e.g. DOPPLER,
         * GPS, HYBRID, PROPAGATED, RANGING, SLR).
         */
        fun pedigree(pedigree: String) = pedigree(JsonField.of(pedigree))

        /**
         * Sets [Builder.pedigree] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pedigree] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pedigree(pedigree: JsonField<String>) = apply { this.pedigree = pedigree }

        /**
         * The reference frame of the cartesian orbital states. If the referenceFrame is null it is
         * assumed to be J2000.
         */
        fun referenceFrame(referenceFrame: ReferenceFrame) =
            referenceFrame(JsonField.of(referenceFrame))

        /**
         * Sets [Builder.referenceFrame] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceFrame] with a well-typed [ReferenceFrame] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceFrame(referenceFrame: JsonField<ReferenceFrame>) = apply {
            this.referenceFrame = referenceFrame
        }

        /** Satellite/catalog number of the target on-orbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /** Boolean indicating use of solid earth tide data in ephemeris generation. */
        fun solidEarthTides(solidEarthTides: Boolean) =
            solidEarthTides(JsonField.of(solidEarthTides))

        /**
         * Sets [Builder.solidEarthTides] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solidEarthTides] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun solidEarthTides(solidEarthTides: JsonField<Boolean>) = apply {
            this.solidEarthTides = solidEarthTides
        }

        /** Ephemeris step size, in seconds. */
        fun stepSize(stepSize: Long) = stepSize(JsonField.of(stepSize))

        /**
         * Sets [Builder.stepSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stepSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stepSize(stepSize: JsonField<Long>) = apply { this.stepSize = stepSize }

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
         * Optional end time of the usable time span for the ephemeris data, in ISO 8601 UTC format
         * with microsecond precision.
         */
        fun usableEndTime(usableEndTime: OffsetDateTime) =
            usableEndTime(JsonField.of(usableEndTime))

        /**
         * Sets [Builder.usableEndTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usableEndTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usableEndTime(usableEndTime: JsonField<OffsetDateTime>) = apply {
            this.usableEndTime = usableEndTime
        }

        /**
         * Optional start time of the usable time span for the ephemeris data, in ISO 8601 UTC
         * format with microsecond precision.
         */
        fun usableStartTime(usableStartTime: OffsetDateTime) =
            usableStartTime(JsonField.of(usableStartTime))

        /**
         * Sets [Builder.usableStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usableStartTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun usableStartTime(usableStartTime: JsonField<OffsetDateTime>) = apply {
            this.usableStartTime = usableStartTime
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
         * Returns an immutable instance of [EphemerisSetAbridged].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .category()
         * .classificationMarking()
         * .dataMode()
         * .numPoints()
         * .pointEndTime()
         * .pointStartTime()
         * .source()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EphemerisSetAbridged =
            EphemerisSetAbridged(
                checkRequired("category", category),
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("numPoints", numPoints),
                checkRequired("pointEndTime", pointEndTime),
                checkRequired("pointStartTime", pointStartTime),
                checkRequired("source", source),
                checkRequired("type", type),
                id,
                bDot,
                centBody,
                comments,
                covReferenceFrame,
                createdAt,
                createdBy,
                description,
                descriptor,
                dragModel,
                edr,
                filename,
                geopotentialModel,
                hasAccel,
                hasCov,
                hasMnvr,
                (idManeuvers ?: JsonMissing.of()).map { it.toImmutable() },
                idOnOrbit,
                idStateVector,
                integrator,
                interpolation,
                interpolationDegree,
                lunarSolar,
                origin,
                origNetwork,
                origObjectId,
                pedigree,
                referenceFrame,
                satNo,
                solidEarthTides,
                stepSize,
                transactionId,
                usableEndTime,
                usableStartTime,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EphemerisSetAbridged = apply {
        if (validated) {
            return@apply
        }

        category()
        classificationMarking()
        dataMode().validate()
        numPoints()
        pointEndTime()
        pointStartTime()
        source()
        type()
        id()
        bDot()
        centBody()
        comments()
        covReferenceFrame().ifPresent { it.validate() }
        createdAt()
        createdBy()
        description()
        descriptor()
        dragModel()
        edr()
        filename()
        geopotentialModel()
        hasAccel()
        hasCov()
        hasMnvr()
        idManeuvers()
        idOnOrbit()
        idStateVector()
        integrator()
        interpolation()
        interpolationDegree()
        lunarSolar()
        origin()
        origNetwork()
        origObjectId()
        pedigree()
        referenceFrame().ifPresent { it.validate() }
        satNo()
        solidEarthTides()
        stepSize()
        transactionId()
        usableEndTime()
        usableStartTime()
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
        (if (category.asKnown().isPresent) 1 else 0) +
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (numPoints.asKnown().isPresent) 1 else 0) +
            (if (pointEndTime.asKnown().isPresent) 1 else 0) +
            (if (pointStartTime.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (bDot.asKnown().isPresent) 1 else 0) +
            (if (centBody.asKnown().isPresent) 1 else 0) +
            (if (comments.asKnown().isPresent) 1 else 0) +
            (covReferenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (descriptor.asKnown().isPresent) 1 else 0) +
            (if (dragModel.asKnown().isPresent) 1 else 0) +
            (if (edr.asKnown().isPresent) 1 else 0) +
            (if (filename.asKnown().isPresent) 1 else 0) +
            (if (geopotentialModel.asKnown().isPresent) 1 else 0) +
            (if (hasAccel.asKnown().isPresent) 1 else 0) +
            (if (hasCov.asKnown().isPresent) 1 else 0) +
            (if (hasMnvr.asKnown().isPresent) 1 else 0) +
            (idManeuvers.asKnown().getOrNull()?.size ?: 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idStateVector.asKnown().isPresent) 1 else 0) +
            (if (integrator.asKnown().isPresent) 1 else 0) +
            (if (interpolation.asKnown().isPresent) 1 else 0) +
            (if (interpolationDegree.asKnown().isPresent) 1 else 0) +
            (if (lunarSolar.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (pedigree.asKnown().isPresent) 1 else 0) +
            (referenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (solidEarthTides.asKnown().isPresent) 1 else 0) +
            (if (stepSize.asKnown().isPresent) 1 else 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (usableEndTime.asKnown().isPresent) 1 else 0) +
            (if (usableStartTime.asKnown().isPresent) 1 else 0)

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

    /**
     * The reference frame of the covariance matrix elements. If the covReferenceFrame is null it is
     * assumed to be J2000.
     */
    class CovReferenceFrame @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val J2000 = of("J2000")

            @JvmField val UVW = of("UVW")

            @JvmField val EFG_TDR = of("EFG/TDR")

            @JvmField val ECR_ECEF = of("ECR/ECEF")

            @JvmField val TEME = of("TEME")

            @JvmField val GCRF = of("GCRF")

            @JvmStatic fun of(value: String) = CovReferenceFrame(JsonField.of(value))
        }

        /** An enum containing [CovReferenceFrame]'s known values. */
        enum class Known {
            J2000,
            UVW,
            EFG_TDR,
            ECR_ECEF,
            TEME,
            GCRF,
        }

        /**
         * An enum containing [CovReferenceFrame]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CovReferenceFrame] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            J2000,
            UVW,
            EFG_TDR,
            ECR_ECEF,
            TEME,
            GCRF,
            /**
             * An enum member indicating that [CovReferenceFrame] was instantiated with an unknown
             * value.
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
                J2000 -> Value.J2000
                UVW -> Value.UVW
                EFG_TDR -> Value.EFG_TDR
                ECR_ECEF -> Value.ECR_ECEF
                TEME -> Value.TEME
                GCRF -> Value.GCRF
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
                J2000 -> Known.J2000
                UVW -> Known.UVW
                EFG_TDR -> Known.EFG_TDR
                ECR_ECEF -> Known.ECR_ECEF
                TEME -> Known.TEME
                GCRF -> Known.GCRF
                else ->
                    throw UnifieddatalibraryInvalidDataException(
                        "Unknown CovReferenceFrame: $value"
                    )
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

        fun validate(): CovReferenceFrame = apply {
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

            return other is CovReferenceFrame && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The reference frame of the cartesian orbital states. If the referenceFrame is null it is
     * assumed to be J2000.
     */
    class ReferenceFrame @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val J2000 = of("J2000")

            @JvmField val EFG_TDR = of("EFG/TDR")

            @JvmField val ECR_ECEF = of("ECR/ECEF")

            @JvmField val TEME = of("TEME")

            @JvmField val ITRF = of("ITRF")

            @JvmField val GCRF = of("GCRF")

            @JvmStatic fun of(value: String) = ReferenceFrame(JsonField.of(value))
        }

        /** An enum containing [ReferenceFrame]'s known values. */
        enum class Known {
            J2000,
            EFG_TDR,
            ECR_ECEF,
            TEME,
            ITRF,
            GCRF,
        }

        /**
         * An enum containing [ReferenceFrame]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReferenceFrame] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            J2000,
            EFG_TDR,
            ECR_ECEF,
            TEME,
            ITRF,
            GCRF,
            /**
             * An enum member indicating that [ReferenceFrame] was instantiated with an unknown
             * value.
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
                J2000 -> Value.J2000
                EFG_TDR -> Value.EFG_TDR
                ECR_ECEF -> Value.ECR_ECEF
                TEME -> Value.TEME
                ITRF -> Value.ITRF
                GCRF -> Value.GCRF
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
                J2000 -> Known.J2000
                EFG_TDR -> Known.EFG_TDR
                ECR_ECEF -> Known.ECR_ECEF
                TEME -> Known.TEME
                ITRF -> Known.ITRF
                GCRF -> Known.GCRF
                else ->
                    throw UnifieddatalibraryInvalidDataException("Unknown ReferenceFrame: $value")
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

        fun validate(): ReferenceFrame = apply {
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

            return other is ReferenceFrame && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EphemerisSetAbridged &&
            category == other.category &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            numPoints == other.numPoints &&
            pointEndTime == other.pointEndTime &&
            pointStartTime == other.pointStartTime &&
            source == other.source &&
            type == other.type &&
            id == other.id &&
            bDot == other.bDot &&
            centBody == other.centBody &&
            comments == other.comments &&
            covReferenceFrame == other.covReferenceFrame &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            description == other.description &&
            descriptor == other.descriptor &&
            dragModel == other.dragModel &&
            edr == other.edr &&
            filename == other.filename &&
            geopotentialModel == other.geopotentialModel &&
            hasAccel == other.hasAccel &&
            hasCov == other.hasCov &&
            hasMnvr == other.hasMnvr &&
            idManeuvers == other.idManeuvers &&
            idOnOrbit == other.idOnOrbit &&
            idStateVector == other.idStateVector &&
            integrator == other.integrator &&
            interpolation == other.interpolation &&
            interpolationDegree == other.interpolationDegree &&
            lunarSolar == other.lunarSolar &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            pedigree == other.pedigree &&
            referenceFrame == other.referenceFrame &&
            satNo == other.satNo &&
            solidEarthTides == other.solidEarthTides &&
            stepSize == other.stepSize &&
            transactionId == other.transactionId &&
            usableEndTime == other.usableEndTime &&
            usableStartTime == other.usableStartTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            category,
            classificationMarking,
            dataMode,
            numPoints,
            pointEndTime,
            pointStartTime,
            source,
            type,
            id,
            bDot,
            centBody,
            comments,
            covReferenceFrame,
            createdAt,
            createdBy,
            description,
            descriptor,
            dragModel,
            edr,
            filename,
            geopotentialModel,
            hasAccel,
            hasCov,
            hasMnvr,
            idManeuvers,
            idOnOrbit,
            idStateVector,
            integrator,
            interpolation,
            interpolationDegree,
            lunarSolar,
            origin,
            origNetwork,
            origObjectId,
            pedigree,
            referenceFrame,
            satNo,
            solidEarthTides,
            stepSize,
            transactionId,
            usableEndTime,
            usableStartTime,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EphemerisSetAbridged{category=$category, classificationMarking=$classificationMarking, dataMode=$dataMode, numPoints=$numPoints, pointEndTime=$pointEndTime, pointStartTime=$pointStartTime, source=$source, type=$type, id=$id, bDot=$bDot, centBody=$centBody, comments=$comments, covReferenceFrame=$covReferenceFrame, createdAt=$createdAt, createdBy=$createdBy, description=$description, descriptor=$descriptor, dragModel=$dragModel, edr=$edr, filename=$filename, geopotentialModel=$geopotentialModel, hasAccel=$hasAccel, hasCov=$hasCov, hasMnvr=$hasMnvr, idManeuvers=$idManeuvers, idOnOrbit=$idOnOrbit, idStateVector=$idStateVector, integrator=$integrator, interpolation=$interpolation, interpolationDegree=$interpolationDegree, lunarSolar=$lunarSolar, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, pedigree=$pedigree, referenceFrame=$referenceFrame, satNo=$satNo, solidEarthTides=$solidEarthTides, stepSize=$stepSize, transactionId=$transactionId, usableEndTime=$usableEndTime, usableStartTime=$usableStartTime, additionalProperties=$additionalProperties}"
}

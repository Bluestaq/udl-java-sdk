// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

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
 * This service provides operations for querying and manipulation of state vectors for OnOrbit
 * objects. State vectors are cartesian vectors of position (r) and velocity (v) that, together with
 * their time (epoch) (t), uniquely determine the trajectory of the orbiting body in space. J2000 is
 * the preferred coordinate frame for all state vector positions/velocities in UDL, but in some
 * cases data may be in another frame depending on the provider and/or datatype. Please see the
 * 'Discover' tab in the storefront to confirm coordinate frames by data provider.
 */
class StateVectorFull
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val epoch: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val actualOdSpan: JsonField<Double>,
    private val algorithm: JsonField<String>,
    private val alt1ReferenceFrame: JsonField<String>,
    private val alt2ReferenceFrame: JsonField<String>,
    private val area: JsonField<Double>,
    private val bDot: JsonField<Double>,
    private val cmOffset: JsonField<Double>,
    private val cov: JsonField<List<Double>>,
    private val covMethod: JsonField<String>,
    private val covReferenceFrame: JsonField<CovReferenceFrame>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val dragArea: JsonField<Double>,
    private val dragCoeff: JsonField<Double>,
    private val dragModel: JsonField<String>,
    private val edr: JsonField<Double>,
    private val effectiveFrom: JsonField<OffsetDateTime>,
    private val effectiveUntil: JsonField<OffsetDateTime>,
    private val eqCov: JsonField<List<Double>>,
    private val errorControl: JsonField<Double>,
    private val fixedStep: JsonField<Boolean>,
    private val geopotentialModel: JsonField<String>,
    private val iau1980Terms: JsonField<Int>,
    private val idOnOrbit: JsonField<String>,
    private val idOrbitDetermination: JsonField<String>,
    private val idStateVector: JsonField<String>,
    private val integratorMode: JsonField<String>,
    private val inTrackThrust: JsonField<Boolean>,
    private val lastObEnd: JsonField<OffsetDateTime>,
    private val lastObStart: JsonField<OffsetDateTime>,
    private val leapSecondTime: JsonField<OffsetDateTime>,
    private val lunarSolar: JsonField<Boolean>,
    private val mass: JsonField<Double>,
    private val msgTs: JsonField<OffsetDateTime>,
    private val obsAvailable: JsonField<Int>,
    private val obsUsed: JsonField<Int>,
    private val onOrbit: JsonField<OnorbitFull>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val partials: JsonField<String>,
    private val pedigree: JsonField<String>,
    private val polarMotionX: JsonField<Double>,
    private val polarMotionY: JsonField<Double>,
    private val posUnc: JsonField<Double>,
    private val rawFileUri: JsonField<String>,
    private val recOdSpan: JsonField<Double>,
    private val referenceFrame: JsonField<ReferenceFrame>,
    private val residualsAcc: JsonField<Double>,
    private val revNo: JsonField<Int>,
    private val rms: JsonField<Double>,
    private val satNo: JsonField<Int>,
    private val sigmaPosUvw: JsonField<List<Double>>,
    private val sigmaVelUvw: JsonField<List<Double>>,
    private val solarFluxApAvg: JsonField<Double>,
    private val solarFluxF10: JsonField<Double>,
    private val solarFluxF10Avg: JsonField<Double>,
    private val solarRadPress: JsonField<Boolean>,
    private val solarRadPressCoeff: JsonField<Double>,
    private val solidEarthTides: JsonField<Boolean>,
    private val sourcedData: JsonField<List<String>>,
    private val sourcedDataTypes: JsonField<List<SourcedDataType>>,
    private val sourceDl: JsonField<String>,
    private val srpArea: JsonField<Double>,
    private val stepMode: JsonField<String>,
    private val stepSize: JsonField<Double>,
    private val stepSizeSelection: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val taiUtc: JsonField<Double>,
    private val thrustAccel: JsonField<Double>,
    private val tracksAvail: JsonField<Int>,
    private val tracksUsed: JsonField<Int>,
    private val transactionId: JsonField<String>,
    private val uct: JsonField<Boolean>,
    private val ut1Rate: JsonField<Double>,
    private val ut1Utc: JsonField<Double>,
    private val velUnc: JsonField<Double>,
    private val xaccel: JsonField<Double>,
    private val xpos: JsonField<Double>,
    private val xposAlt1: JsonField<Double>,
    private val xposAlt2: JsonField<Double>,
    private val xvel: JsonField<Double>,
    private val xvelAlt1: JsonField<Double>,
    private val xvelAlt2: JsonField<Double>,
    private val yaccel: JsonField<Double>,
    private val ypos: JsonField<Double>,
    private val yposAlt1: JsonField<Double>,
    private val yposAlt2: JsonField<Double>,
    private val yvel: JsonField<Double>,
    private val yvelAlt1: JsonField<Double>,
    private val yvelAlt2: JsonField<Double>,
    private val zaccel: JsonField<Double>,
    private val zpos: JsonField<Double>,
    private val zposAlt1: JsonField<Double>,
    private val zposAlt2: JsonField<Double>,
    private val zvel: JsonField<Double>,
    private val zvelAlt1: JsonField<Double>,
    private val zvelAlt2: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("epoch") @ExcludeMissing epoch: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actualODSpan")
        @ExcludeMissing
        actualOdSpan: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("algorithm") @ExcludeMissing algorithm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alt1ReferenceFrame")
        @ExcludeMissing
        alt1ReferenceFrame: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alt2ReferenceFrame")
        @ExcludeMissing
        alt2ReferenceFrame: JsonField<String> = JsonMissing.of(),
        @JsonProperty("area") @ExcludeMissing area: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bDot") @ExcludeMissing bDot: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("cmOffset") @ExcludeMissing cmOffset: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("cov") @ExcludeMissing cov: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("covMethod") @ExcludeMissing covMethod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("covReferenceFrame")
        @ExcludeMissing
        covReferenceFrame: JsonField<CovReferenceFrame> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dragArea") @ExcludeMissing dragArea: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dragCoeff") @ExcludeMissing dragCoeff: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dragModel") @ExcludeMissing dragModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("edr") @ExcludeMissing edr: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("effectiveFrom")
        @ExcludeMissing
        effectiveFrom: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("effectiveUntil")
        @ExcludeMissing
        effectiveUntil: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("eqCov") @ExcludeMissing eqCov: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("errorControl")
        @ExcludeMissing
        errorControl: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fixedStep") @ExcludeMissing fixedStep: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("geopotentialModel")
        @ExcludeMissing
        geopotentialModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("iau1980Terms")
        @ExcludeMissing
        iau1980Terms: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOrbitDetermination")
        @ExcludeMissing
        idOrbitDetermination: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idStateVector")
        @ExcludeMissing
        idStateVector: JsonField<String> = JsonMissing.of(),
        @JsonProperty("integratorMode")
        @ExcludeMissing
        integratorMode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inTrackThrust")
        @ExcludeMissing
        inTrackThrust: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lastObEnd")
        @ExcludeMissing
        lastObEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastObStart")
        @ExcludeMissing
        lastObStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("leapSecondTime")
        @ExcludeMissing
        leapSecondTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lunarSolar")
        @ExcludeMissing
        lunarSolar: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("mass") @ExcludeMissing mass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("msgTs") @ExcludeMissing msgTs: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("obsAvailable")
        @ExcludeMissing
        obsAvailable: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("obsUsed") @ExcludeMissing obsUsed: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("onOrbit") @ExcludeMissing onOrbit: JsonField<OnorbitFull> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("partials") @ExcludeMissing partials: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pedigree") @ExcludeMissing pedigree: JsonField<String> = JsonMissing.of(),
        @JsonProperty("polarMotionX")
        @ExcludeMissing
        polarMotionX: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("polarMotionY")
        @ExcludeMissing
        polarMotionY: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("posUnc") @ExcludeMissing posUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rawFileURI")
        @ExcludeMissing
        rawFileUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recODSpan") @ExcludeMissing recOdSpan: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("referenceFrame")
        @ExcludeMissing
        referenceFrame: JsonField<ReferenceFrame> = JsonMissing.of(),
        @JsonProperty("residualsAcc")
        @ExcludeMissing
        residualsAcc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("revNo") @ExcludeMissing revNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("rms") @ExcludeMissing rms: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sigmaPosUVW")
        @ExcludeMissing
        sigmaPosUvw: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("sigmaVelUVW")
        @ExcludeMissing
        sigmaVelUvw: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("solarFluxAPAvg")
        @ExcludeMissing
        solarFluxApAvg: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("solarFluxF10")
        @ExcludeMissing
        solarFluxF10: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("solarFluxF10Avg")
        @ExcludeMissing
        solarFluxF10Avg: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("solarRadPress")
        @ExcludeMissing
        solarRadPress: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("solarRadPressCoeff")
        @ExcludeMissing
        solarRadPressCoeff: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("solidEarthTides")
        @ExcludeMissing
        solidEarthTides: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sourcedData")
        @ExcludeMissing
        sourcedData: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("sourcedDataTypes")
        @ExcludeMissing
        sourcedDataTypes: JsonField<List<SourcedDataType>> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("srpArea") @ExcludeMissing srpArea: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("stepMode") @ExcludeMissing stepMode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stepSize") @ExcludeMissing stepSize: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("stepSizeSelection")
        @ExcludeMissing
        stepSizeSelection: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("taiUtc") @ExcludeMissing taiUtc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("thrustAccel")
        @ExcludeMissing
        thrustAccel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tracksAvail") @ExcludeMissing tracksAvail: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("tracksUsed") @ExcludeMissing tracksUsed: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uct") @ExcludeMissing uct: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ut1Rate") @ExcludeMissing ut1Rate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ut1Utc") @ExcludeMissing ut1Utc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("velUnc") @ExcludeMissing velUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("xaccel") @ExcludeMissing xaccel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("xpos") @ExcludeMissing xpos: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("xposAlt1") @ExcludeMissing xposAlt1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("xposAlt2") @ExcludeMissing xposAlt2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("xvel") @ExcludeMissing xvel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("xvelAlt1") @ExcludeMissing xvelAlt1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("xvelAlt2") @ExcludeMissing xvelAlt2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("yaccel") @ExcludeMissing yaccel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ypos") @ExcludeMissing ypos: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("yposAlt1") @ExcludeMissing yposAlt1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("yposAlt2") @ExcludeMissing yposAlt2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("yvel") @ExcludeMissing yvel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("yvelAlt1") @ExcludeMissing yvelAlt1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("yvelAlt2") @ExcludeMissing yvelAlt2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("zaccel") @ExcludeMissing zaccel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("zpos") @ExcludeMissing zpos: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("zposAlt1") @ExcludeMissing zposAlt1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("zposAlt2") @ExcludeMissing zposAlt2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("zvel") @ExcludeMissing zvel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("zvelAlt1") @ExcludeMissing zvelAlt1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("zvelAlt2") @ExcludeMissing zvelAlt2: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        epoch,
        source,
        actualOdSpan,
        algorithm,
        alt1ReferenceFrame,
        alt2ReferenceFrame,
        area,
        bDot,
        cmOffset,
        cov,
        covMethod,
        covReferenceFrame,
        createdAt,
        createdBy,
        descriptor,
        dragArea,
        dragCoeff,
        dragModel,
        edr,
        effectiveFrom,
        effectiveUntil,
        eqCov,
        errorControl,
        fixedStep,
        geopotentialModel,
        iau1980Terms,
        idOnOrbit,
        idOrbitDetermination,
        idStateVector,
        integratorMode,
        inTrackThrust,
        lastObEnd,
        lastObStart,
        leapSecondTime,
        lunarSolar,
        mass,
        msgTs,
        obsAvailable,
        obsUsed,
        onOrbit,
        origin,
        origNetwork,
        origObjectId,
        partials,
        pedigree,
        polarMotionX,
        polarMotionY,
        posUnc,
        rawFileUri,
        recOdSpan,
        referenceFrame,
        residualsAcc,
        revNo,
        rms,
        satNo,
        sigmaPosUvw,
        sigmaVelUvw,
        solarFluxApAvg,
        solarFluxF10,
        solarFluxF10Avg,
        solarRadPress,
        solarRadPressCoeff,
        solidEarthTides,
        sourcedData,
        sourcedDataTypes,
        sourceDl,
        srpArea,
        stepMode,
        stepSize,
        stepSizeSelection,
        tags,
        taiUtc,
        thrustAccel,
        tracksAvail,
        tracksUsed,
        transactionId,
        uct,
        ut1Rate,
        ut1Utc,
        velUnc,
        xaccel,
        xpos,
        xposAlt1,
        xposAlt2,
        xvel,
        xvelAlt1,
        xvelAlt2,
        yaccel,
        ypos,
        yposAlt1,
        yposAlt2,
        yvel,
        yvelAlt1,
        yvelAlt2,
        zaccel,
        zpos,
        zposAlt1,
        zposAlt2,
        zvel,
        zvelAlt1,
        zvelAlt2,
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
     * Time of validity for state vector in ISO 8601 UTC datetime format, with microsecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun epoch(): OffsetDateTime = epoch.getRequired("epoch")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The actual time span used for the OD of the object, expressed in days.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actualOdSpan(): Optional<Double> = actualOdSpan.getOptional("actualODSpan")

    /**
     * Optional algorithm used to produce this record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun algorithm(): Optional<String> = algorithm.getOptional("algorithm")

    /**
     * The reference frame of the alternate1 (Alt1) cartesian orbital state.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun alt1ReferenceFrame(): Optional<String> =
        alt1ReferenceFrame.getOptional("alt1ReferenceFrame")

    /**
     * The reference frame of the alternate2 (Alt2) cartesian orbital state.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun alt2ReferenceFrame(): Optional<String> =
        alt2ReferenceFrame.getOptional("alt2ReferenceFrame")

    /**
     * The actual area of the object at it's largest cross-section, expressed in meters^2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun area(): Optional<Double> = area.getOptional("area")

    /**
     * First derivative of drag/ballistic coefficient (m2/kg-s).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bDot(): Optional<Double> = bDot.getOptional("bDot")

    /**
     * Model parameter value for center of mass offset (m).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cmOffset(): Optional<Double> = cmOffset.getOptional("cmOffset")

    /**
     * Covariance matrix, in kilometer and second based units, in the specified covReferenceFrame.
     * If the covReferenceFrame is null it is assumed to be J2000. The array values (1-21) represent
     * the lower triangular half of the position-velocity covariance matrix. The size of the
     * covariance matrix is dynamic, depending on whether the covariance for position only or
     * position & velocity. The covariance elements are position dependent within the array with
     * values ordered as follows:
     *
     * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;&nbsp;&nbsp;y&nbsp;&nbsp;&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;&nbsp;&nbsp;y'&nbsp;&nbsp;&nbsp;&nbsp;z'&nbsp;&nbsp;&nbsp;&nbsp;DRG&nbsp;&nbsp;&nbsp;&nbsp;SRP&nbsp;&nbsp;&nbsp;&nbsp;THR&nbsp;&nbsp;
     *
     * x&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1
     *
     * y&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;&nbsp;3
     *
     * z&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4&nbsp;&nbsp;&nbsp;&nbsp;5&nbsp;&nbsp;&nbsp;&nbsp;6
     *
     * x'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;7&nbsp;&nbsp;&nbsp;&nbsp;8&nbsp;&nbsp;&nbsp;&nbsp;9&nbsp;&nbsp;&nbsp;10
     *
     * y'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11&nbsp;&nbsp;12&nbsp;&nbsp;13&nbsp;&nbsp;14&nbsp;&nbsp;15
     *
     * z'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;16&nbsp;&nbsp;17&nbsp;&nbsp;18&nbsp;&nbsp;19&nbsp;&nbsp;20&nbsp;&nbsp;&nbsp;21&nbsp;
     *
     * The cov array should contain only the lower left triangle values from top left down to bottom
     * right, in order.
     *
     * If additional covariance terms are included for DRAG, SRP, and/or THRUST, the matrix can be
     * extended with the following order of elements:
     *
     * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;&nbsp;&nbsp;y&nbsp;&nbsp;&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;&nbsp;&nbsp;y'&nbsp;&nbsp;&nbsp;&nbsp;z'&nbsp;&nbsp;&nbsp;&nbsp;DRG&nbsp;&nbsp;&nbsp;&nbsp;SRP&nbsp;&nbsp;&nbsp;&nbsp;THR
     *
     * DRG&nbsp;&nbsp;&nbsp;22&nbsp;&nbsp;23&nbsp;&nbsp;24&nbsp;&nbsp;25&nbsp;&nbsp;26&nbsp;&nbsp;&nbsp;27&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;28&nbsp;&nbsp;
     *
     * SRP&nbsp;&nbsp;&nbsp;29&nbsp;&nbsp;30&nbsp;&nbsp;31&nbsp;&nbsp;32&nbsp;&nbsp;33&nbsp;&nbsp;&nbsp;34&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;35&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;36&nbsp;&nbsp;
     *
     * THR&nbsp;&nbsp;&nbsp;37&nbsp;&nbsp;38&nbsp;&nbsp;39&nbsp;&nbsp;40&nbsp;&nbsp;41&nbsp;&nbsp;&nbsp;42&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;43&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;44&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;45&nbsp;
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cov(): Optional<List<Double>> = cov.getOptional("cov")

    /**
     * The method used to generate the covariance during the orbit determination (OD) that produced
     * the state vector, or whether an arbitrary, non-calculated default value was used (CALCULATED,
     * DEFAULT).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun covMethod(): Optional<String> = covMethod.getOptional("covMethod")

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
     * Optional source-provided and searchable metadata or descriptor of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun descriptor(): Optional<String> = descriptor.getOptional("descriptor")

    /**
     * The effective area of the object exposed to atmospheric drag, expressed in meters^2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dragArea(): Optional<Double> = dragArea.getOptional("dragArea")

    /**
     * Area-to-mass ratio coefficient for atmospheric ballistic drag (m2/kg).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dragCoeff(): Optional<Double> = dragCoeff.getOptional("dragCoeff")

    /**
     * The Drag Model used for this vector (e.g. HARRIS-PRIESTER, JAC70, JBH09, MSIS90, NONE, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dragModel(): Optional<String> = dragModel.getOptional("dragModel")

    /**
     * Model parameter value for energy dissipation rate (EDR) (w/kg).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun edr(): Optional<Double> = edr.getOptional("edr")

    /**
     * Start time at which this state vector was the 'current' state vector for its satellite.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun effectiveFrom(): Optional<OffsetDateTime> = effectiveFrom.getOptional("effectiveFrom")

    /**
     * End time at which this state vector was no longer the 'current' state vector for its
     * satellite.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun effectiveUntil(): Optional<OffsetDateTime> = effectiveUntil.getOptional("effectiveUntil")

    /**
     * The covariance matrix values represent the lower triangular half of the covariance matrix in
     * terms of equinoctial elements.&nbsp; The size of the covariance matrix is dynamic.&nbsp; The
     * values are outputted in order across each row, i.e.:
     *
     * 1&nbsp;&nbsp; 2&nbsp;&nbsp; 3&nbsp;&nbsp; 4&nbsp;&nbsp; 5
     *
     * 6&nbsp;&nbsp; 7&nbsp;&nbsp; 8&nbsp;&nbsp; 9&nbsp; 10
     *
     * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
     *
     * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
     *
     * 51&nbsp; 52&nbsp; 53&nbsp; 54&nbsp; 55
     *
     * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
     *
     * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
     *
     * The ordering of values is as follows:
     *
     * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Af&nbsp;&nbsp; Ag&nbsp;&nbsp;
     * L&nbsp;&nbsp;&nbsp; N&nbsp;&nbsp; Chi&nbsp; Psi&nbsp;&nbsp; B&nbsp;&nbsp; BDOT AGOM&nbsp;
     * T&nbsp;&nbsp; C1&nbsp;&nbsp; C2&nbsp; ...
     *
     * Af&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1
     *
     * Ag&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2&nbsp;&nbsp;&nbsp; 3
     *
     * L&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 4&nbsp;&nbsp;&nbsp;
     * 5&nbsp;&nbsp;&nbsp; 6
     *
     * N&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 7&nbsp;&nbsp;&nbsp;
     * 8&nbsp;&nbsp;&nbsp; 9&nbsp;&nbsp; 10
     *
     * Chi&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 11&nbsp;&nbsp; 12&nbsp;&nbsp; 13&nbsp;&nbsp;
     * 14&nbsp;&nbsp; 15
     *
     * Psi&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 16&nbsp;&nbsp; 17&nbsp;&nbsp; 18&nbsp;&nbsp;
     * 19&nbsp;&nbsp; 20&nbsp;&nbsp; 21
     *
     * B&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 22&nbsp;&nbsp; 23&nbsp;&nbsp; 24
     * &nbsp;&nbsp;25&nbsp;&nbsp; 26&nbsp;&nbsp; 27&nbsp;&nbsp; 28
     *
     * BDOT&nbsp;&nbsp; 29&nbsp;&nbsp; 30&nbsp;&nbsp; 31&nbsp;&nbsp; 32&nbsp;&nbsp; 33&nbsp;&nbsp;
     * 34&nbsp;&nbsp; 35&nbsp;&nbsp; 36
     *
     * AGOM&nbsp; 37&nbsp;&nbsp; 38&nbsp;&nbsp; 39&nbsp;&nbsp; 40&nbsp;&nbsp; 41&nbsp;&nbsp;
     * 42&nbsp;&nbsp; 43&nbsp;&nbsp; 44&nbsp;&nbsp; 45
     *
     * T&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 46&nbsp;&nbsp; 47&nbsp;&nbsp;
     * 48&nbsp;&nbsp; 49&nbsp;&nbsp; 50&nbsp;&nbsp; 51&nbsp;&nbsp; 52&nbsp;&nbsp; 53&nbsp;&nbsp;
     * 54&nbsp;&nbsp; 55
     *
     * C1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 56&nbsp;&nbsp; 57&nbsp;&nbsp;
     * 58&nbsp;&nbsp; 59&nbsp;&nbsp; 60&nbsp;&nbsp; 61&nbsp;&nbsp; 62&nbsp;&nbsp; 63&nbsp;&nbsp;
     * 64&nbsp;&nbsp; 65&nbsp;&nbsp; 66
     *
     * C2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 67&nbsp;&nbsp; 68&nbsp;&nbsp;
     * 69&nbsp;&nbsp; 70&nbsp;&nbsp; 71&nbsp; &nbsp;72&nbsp;&nbsp; 73&nbsp;&nbsp; 74&nbsp;&nbsp;
     * 75&nbsp;&nbsp; 76&nbsp;&nbsp; 77&nbsp;&nbsp; 78
     *
     * :
     *
     * :
     *
     * where C1, C2, etc, are the "consider parameters" that may be added to the covariance
     * matrix.&nbsp; The covariance matrix will be as large as the last element/model parameter
     * needed.&nbsp; In other words, if the DC solved for all 6 elements plus AGOM, the covariance
     * matrix will be 9x9 (and the rows for B and BDOT will be all zeros).&nbsp; If the covariance
     * matrix is unavailable, the size will be set to 0x0, and no data will follow.&nbsp; The cov
     * field should contain only the lower left triangle values from top left down to bottom right,
     * in order.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eqCov(): Optional<List<Double>> = eqCov.getOptional("eqCov")

    /**
     * Integrator error control.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun errorControl(): Optional<Double> = errorControl.getOptional("errorControl")

    /**
     * Boolean indicating use of fixed step size for this vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fixedStep(): Optional<Boolean> = fixedStep.getOptional("fixedStep")

    /**
     * Geopotential model used for this vector (e.g. EGM-96, WGS-84, WGS-72, JGM-2, or GEM-T3),
     * including mm degree zonals, nn degree/order tesserals. E.g. EGM-96 24Z,24T.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geopotentialModel(): Optional<String> = geopotentialModel.getOptional("geopotentialModel")

    /**
     * Number of terms used in the IAU 1980 nutation model (4, 50, or 106).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun iau1980Terms(): Optional<Int> = iau1980Terms.getOptional("iau1980Terms")

    /**
     * Unique identifier of the satellite on-orbit object, if correlated. For the public catalog,
     * the idOnOrbit is typically the satellite number as a string, but may be a UUID for analyst or
     * other unknown or untracked satellites.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Unique identifier of the OD solution record that produced this state vector. This ID can be
     * used to obtain additional information on an OrbitDetermination object using the 'get by ID'
     * operation (e.g. /udl/orbitdetermination/{id}). For example, the OrbitDetermination with
     * idOrbitDetermination = abc would be queries as /udl/orbitdetermination/abc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOrbitDetermination(): Optional<String> =
        idOrbitDetermination.getOptional("idOrbitDetermination")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idStateVector(): Optional<String> = idStateVector.getOptional("idStateVector")

    /**
     * Integrator Mode.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun integratorMode(): Optional<String> = integratorMode.getOptional("integratorMode")

    /**
     * Boolean indicating use of in-track thrust perturbations for this vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun inTrackThrust(): Optional<Boolean> = inTrackThrust.getOptional("inTrackThrust")

    /**
     * The end of the time interval containing the time of the last accepted observation, in ISO
     * 8601 UTC format with microsecond precision. For an exact observation time, the firstObTime
     * and lastObTime are the same.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lastObEnd(): Optional<OffsetDateTime> = lastObEnd.getOptional("lastObEnd")

    /**
     * The start of the time interval containing the time of the last accepted observation, in ISO
     * 8601 UTC format with microsecond precision. For an exact observation time, the firstObTime
     * and lastObTime are the same.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lastObStart(): Optional<OffsetDateTime> = lastObStart.getOptional("lastObStart")

    /**
     * Time of the next leap second after epoch in ISO 8601 UTC time. If the next leap second is not
     * known, the time of the previous leap second is used.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun leapSecondTime(): Optional<OffsetDateTime> = leapSecondTime.getOptional("leapSecondTime")

    /**
     * Boolean indicating use of lunar/solar perturbations for this vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lunarSolar(): Optional<Boolean> = lunarSolar.getOptional("lunarSolar")

    /**
     * The mass of the object, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mass(): Optional<Double> = mass.getOptional("mass")

    /**
     * Time when message was generated in ISO 8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun msgTs(): Optional<OffsetDateTime> = msgTs.getOptional("msgTs")

    /**
     * The number of observations available for the OD of the object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun obsAvailable(): Optional<Int> = obsAvailable.getOptional("obsAvailable")

    /**
     * The number of observations accepted for the OD of the object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun obsUsed(): Optional<Int> = obsUsed.getOptional("obsUsed")

    /**
     * Model object representing on-orbit objects or satellites in the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun onOrbit(): Optional<OnorbitFull> = onOrbit.getOptional("onOrbit")

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
     * Optional identifier provided by state vector source to indicate the target onorbit object of
     * this state vector. This may be an internal identifier and not necessarily map to a valid
     * satellite number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Type of partial derivatives used (ANALYTIC, FULL NUM, or FAST NUM).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun partials(): Optional<String> = partials.getOptional("partials")

    /**
     * The pedigree of state vector, or methods used for its generation to include state
     * update/orbit determination, propagation from another state, or a state from a calibration
     * satellite (e.g. ORBIT_UPDATE, PROPAGATION, CALIBRATION, CONJUNCTION, FLIGHT_PLAN).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pedigree(): Optional<String> = pedigree.getOptional("pedigree")

    /**
     * Polar Wander Motion X (arc seconds).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarMotionX(): Optional<Double> = polarMotionX.getOptional("polarMotionX")

    /**
     * Polar Wander Motion Y (arc seconds).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarMotionY(): Optional<Double> = polarMotionY.getOptional("polarMotionY")

    /**
     * One sigma position uncertainty, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun posUnc(): Optional<Double> = posUnc.getOptional("posUnc")

    /**
     * Optional URI location in the document repository of the raw file parsed by the system to
     * produce this record. To download the raw file, prepend https://udl-hostname/scs/download?id=
     * to this value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rawFileUri(): Optional<String> = rawFileUri.getOptional("rawFileURI")

    /**
     * The recommended OD time span calculated for the object, expressed in days.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun recOdSpan(): Optional<Double> = recOdSpan.getOptional("recODSpan")

    /**
     * The reference frame of the cartesian orbital states. If the referenceFrame is null it is
     * assumed to be J2000.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun referenceFrame(): Optional<ReferenceFrame> = referenceFrame.getOptional("referenceFrame")

    /**
     * The percentage of residuals accepted in the OD of the object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun residualsAcc(): Optional<Double> = residualsAcc.getOptional("residualsAcc")

    /**
     * Epoch revolution number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun revNo(): Optional<Int> = revNo.getOptional("revNo")

    /**
     * The Weighted Root Mean Squared (RMS) of the differential correction on the target object that
     * produced this vector. WRMS is a quality indicator of the state vector update, with a value of
     * 1.00 being optimal. WRMS applies to Batch Least Squares (BLS) processes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rms(): Optional<Double> = rms.getOptional("rms")

    /**
     * Satellite/Catalog number of the target OnOrbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Array containing the standard deviation of error in target object position, U, V and W
     * direction respectively (km).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sigmaPosUvw(): Optional<List<Double>> = sigmaPosUvw.getOptional("sigmaPosUVW")

    /**
     * Array containing the standard deviation of error in target object velocity, U, V and W
     * direction respectively (km/sec).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sigmaVelUvw(): Optional<List<Double>> = sigmaVelUvw.getOptional("sigmaVelUVW")

    /**
     * Average solar flux geomagnetic index.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solarFluxApAvg(): Optional<Double> = solarFluxApAvg.getOptional("solarFluxAPAvg")

    /**
     * F10 (10.7 cm) solar flux value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solarFluxF10(): Optional<Double> = solarFluxF10.getOptional("solarFluxF10")

    /**
     * F10 (10.7 cm) solar flux 81-day average value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solarFluxF10Avg(): Optional<Double> = solarFluxF10Avg.getOptional("solarFluxF10Avg")

    /**
     * Boolean indicating use of solar radiation pressure perturbations for this vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solarRadPress(): Optional<Boolean> = solarRadPress.getOptional("solarRadPress")

    /**
     * Area-to-mass ratio coefficient for solar radiation pressure.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solarRadPressCoeff(): Optional<Double> =
        solarRadPressCoeff.getOptional("solarRadPressCoeff")

    /**
     * Boolean indicating use of solid earth tide perturbations for this vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solidEarthTides(): Optional<Boolean> = solidEarthTides.getOptional("solidEarthTides")

    /**
     * Optional array of UDL data (observation) UUIDs used to build this state vector. See the
     * associated sourcedDataTypes array for the specific types of observations for the positionally
     * corresponding UUIDs in this array (the two arrays must match in size).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourcedData(): Optional<List<String>> = sourcedData.getOptional("sourcedData")

    /**
     * Optional array of UDL observation data types used to build this state vector (e.g. EO, RADAR,
     * RF, DOA). See the associated sourcedData array for the specific UUIDs of observations for the
     * positionally corresponding data types in this array (the two arrays must match in size).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourcedDataTypes(): Optional<List<SourcedDataType>> =
        sourcedDataTypes.getOptional("sourcedDataTypes")

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
     * The effective area of the object exposed to solar radiation pressure, expressed in meters^2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun srpArea(): Optional<Double> = srpArea.getOptional("srpArea")

    /**
     * Integrator step mode (AUTO, TIME, or S).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stepMode(): Optional<String> = stepMode.getOptional("stepMode")

    /**
     * Initial integration step size (seconds).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stepSize(): Optional<Double> = stepSize.getOptional("stepSize")

    /**
     * Initial step size selection (AUTO or MANUAL).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stepSizeSelection(): Optional<String> = stepSizeSelection.getOptional("stepSizeSelection")

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
     * TAI (Temps Atomique International) minus UTC (Universal Time Coordinates) offset in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun taiUtc(): Optional<Double> = taiUtc.getOptional("taiUtc")

    /**
     * Model parameter value for thrust acceleration (m/s2).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun thrustAccel(): Optional<Double> = thrustAccel.getOptional("thrustAccel")

    /**
     * The number of sensor tracks available for the OD of the object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tracksAvail(): Optional<Int> = tracksAvail.getOptional("tracksAvail")

    /**
     * The number of sensor tracks accepted for the OD of the object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tracksUsed(): Optional<Int> = tracksUsed.getOptional("tracksUsed")

    /**
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

    /**
     * Boolean indicating this state vector was unable to be correlated to a known object. This flag
     * should only be set to true by data providers after an attempt to correlate to an OnOrbit
     * object was made and failed. If unable to correlate, the 'origObjectId' field may be populated
     * with an internal data provider specific identifier.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun uct(): Optional<Boolean> = uct.getOptional("uct")

    /**
     * Rate of change of UT1 (milliseconds/day) - first derivative of ut1Utc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ut1Rate(): Optional<Double> = ut1Rate.getOptional("ut1Rate")

    /**
     * Universal Time-1 (UT1) minus UTC offset, in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ut1Utc(): Optional<Double> = ut1Utc.getOptional("ut1Utc")

    /**
     * One sigma velocity uncertainty, in kilometers/second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun velUnc(): Optional<Double> = velUnc.getOptional("velUnc")

    /**
     * Cartesian X acceleration of target, in kilometers/second^2, in the specified referenceFrame.
     * If referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun xaccel(): Optional<Double> = xaccel.getOptional("xaccel")

    /**
     * Cartesian X position of the target, in kilometers, in the specified referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun xpos(): Optional<Double> = xpos.getOptional("xpos")

    /**
     * Cartesian X position of the target, in kilometers, in the specified alt1ReferenceFrame.
     * Alternate reference frames are optional and are intended to allow a data source to provide an
     * equivalent vector in a different cartesian frame than the primary vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun xposAlt1(): Optional<Double> = xposAlt1.getOptional("xposAlt1")

    /**
     * Cartesian X position of the target, in kilometers, in the specified alt2ReferenceFrame.
     * Alternate reference frames are optional and are intended to allow a data source to provide an
     * equivalent vector in a different cartesian frame than the primary vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun xposAlt2(): Optional<Double> = xposAlt2.getOptional("xposAlt2")

    /**
     * Cartesian X velocity of target, in kilometers/second, in the specified referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun xvel(): Optional<Double> = xvel.getOptional("xvel")

    /**
     * Cartesian X velocity of the target, in kilometers/second, in the specified
     * alt1ReferenceFrame. Alternate reference frames are optional and are intended to allow a data
     * source to provide an equivalent vector in a different cartesian frame than the primary
     * vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun xvelAlt1(): Optional<Double> = xvelAlt1.getOptional("xvelAlt1")

    /**
     * Cartesian X velocity of the target, in kilometers/second, in the specified
     * alt2ReferenceFrame. Alternate reference frames are optional and are intended to allow a data
     * source to provide an equivalent vector in a different cartesian frame than the primary
     * vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun xvelAlt2(): Optional<Double> = xvelAlt2.getOptional("xvelAlt2")

    /**
     * Cartesian Y acceleration of target, in kilometers/second^2, in the specified referenceFrame.
     * If referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yaccel(): Optional<Double> = yaccel.getOptional("yaccel")

    /**
     * Cartesian Y position of the target, in kilometers, in the specified referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ypos(): Optional<Double> = ypos.getOptional("ypos")

    /**
     * Cartesian Y position of the target, in kilometers, in the specified alt1ReferenceFrame.
     * Alternate reference frames are optional and are intended to allow a data source to provide an
     * equivalent vector in a different cartesian frame than the primary vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yposAlt1(): Optional<Double> = yposAlt1.getOptional("yposAlt1")

    /**
     * Cartesian Y position of the target, in kilometers, in the specified alt2ReferenceFrame.
     * Alternate reference frames are optional and are intended to allow a data source to provide an
     * equivalent vector in a different cartesian frame than the primary vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yposAlt2(): Optional<Double> = yposAlt2.getOptional("yposAlt2")

    /**
     * Cartesian Y velocity of target, in kilometers/second, in the specified referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yvel(): Optional<Double> = yvel.getOptional("yvel")

    /**
     * Cartesian Y velocity of the target, in kilometers/second, in the specified
     * alt1ReferenceFrame. Alternate reference frames are optional and are intended to allow a data
     * source to provide an equivalent vector in a different cartesian frame than the primary
     * vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yvelAlt1(): Optional<Double> = yvelAlt1.getOptional("yvelAlt1")

    /**
     * Cartesian Y velocity of the target, in kilometers/second, in the specified
     * alt2ReferenceFrame. Alternate reference frames are optional and are intended to allow a data
     * source to provide an equivalent vector in a different cartesian frame than the primary
     * vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yvelAlt2(): Optional<Double> = yvelAlt2.getOptional("yvelAlt2")

    /**
     * Cartesian Z acceleration of target, in kilometers/second^2, in the specified referenceFrame.
     * If referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zaccel(): Optional<Double> = zaccel.getOptional("zaccel")

    /**
     * Cartesian Z position of the target, in kilometers, in the specified referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zpos(): Optional<Double> = zpos.getOptional("zpos")

    /**
     * Cartesian Z position of the target, in kilometers, in the specified alt1ReferenceFrame.
     * Alternate reference frames are optional and are intended to allow a data source to provide an
     * equivalent vector in a different cartesian frame than the primary vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zposAlt1(): Optional<Double> = zposAlt1.getOptional("zposAlt1")

    /**
     * Cartesian Z position of the target, in kilometers, in the specified alt2ReferenceFrame.
     * Alternate reference frames are optional and are intended to allow a data source to provide an
     * equivalent vector in a different cartesian frame than the primary vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zposAlt2(): Optional<Double> = zposAlt2.getOptional("zposAlt2")

    /**
     * Cartesian Z velocity of target, in kilometers/second, in the specified referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zvel(): Optional<Double> = zvel.getOptional("zvel")

    /**
     * Cartesian Z velocity of the target, in kilometers/second, in the specified
     * alt1ReferenceFrame. Alternate reference frames are optional and are intended to allow a data
     * source to provide an equivalent vector in a different cartesian frame than the primary
     * vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zvelAlt1(): Optional<Double> = zvelAlt1.getOptional("zvelAlt1")

    /**
     * Cartesian Z velocity of the target, in kilometers/second, in the specified
     * alt2ReferenceFrame. Alternate reference frames are optional and are intended to allow a data
     * source to provide an equivalent vector in a different cartesian frame than the primary
     * vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zvelAlt2(): Optional<Double> = zvelAlt2.getOptional("zvelAlt2")

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
     * Returns the raw JSON value of [epoch].
     *
     * Unlike [epoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("epoch") @ExcludeMissing fun _epoch(): JsonField<OffsetDateTime> = epoch

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [actualOdSpan].
     *
     * Unlike [actualOdSpan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actualODSpan")
    @ExcludeMissing
    fun _actualOdSpan(): JsonField<Double> = actualOdSpan

    /**
     * Returns the raw JSON value of [algorithm].
     *
     * Unlike [algorithm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("algorithm") @ExcludeMissing fun _algorithm(): JsonField<String> = algorithm

    /**
     * Returns the raw JSON value of [alt1ReferenceFrame].
     *
     * Unlike [alt1ReferenceFrame], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("alt1ReferenceFrame")
    @ExcludeMissing
    fun _alt1ReferenceFrame(): JsonField<String> = alt1ReferenceFrame

    /**
     * Returns the raw JSON value of [alt2ReferenceFrame].
     *
     * Unlike [alt2ReferenceFrame], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("alt2ReferenceFrame")
    @ExcludeMissing
    fun _alt2ReferenceFrame(): JsonField<String> = alt2ReferenceFrame

    /**
     * Returns the raw JSON value of [area].
     *
     * Unlike [area], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("area") @ExcludeMissing fun _area(): JsonField<Double> = area

    /**
     * Returns the raw JSON value of [bDot].
     *
     * Unlike [bDot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bDot") @ExcludeMissing fun _bDot(): JsonField<Double> = bDot

    /**
     * Returns the raw JSON value of [cmOffset].
     *
     * Unlike [cmOffset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cmOffset") @ExcludeMissing fun _cmOffset(): JsonField<Double> = cmOffset

    /**
     * Returns the raw JSON value of [cov].
     *
     * Unlike [cov], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cov") @ExcludeMissing fun _cov(): JsonField<List<Double>> = cov

    /**
     * Returns the raw JSON value of [covMethod].
     *
     * Unlike [covMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("covMethod") @ExcludeMissing fun _covMethod(): JsonField<String> = covMethod

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
     * Returns the raw JSON value of [descriptor].
     *
     * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor(): JsonField<String> = descriptor

    /**
     * Returns the raw JSON value of [dragArea].
     *
     * Unlike [dragArea], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dragArea") @ExcludeMissing fun _dragArea(): JsonField<Double> = dragArea

    /**
     * Returns the raw JSON value of [dragCoeff].
     *
     * Unlike [dragCoeff], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dragCoeff") @ExcludeMissing fun _dragCoeff(): JsonField<Double> = dragCoeff

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
     * Returns the raw JSON value of [effectiveFrom].
     *
     * Unlike [effectiveFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effectiveFrom")
    @ExcludeMissing
    fun _effectiveFrom(): JsonField<OffsetDateTime> = effectiveFrom

    /**
     * Returns the raw JSON value of [effectiveUntil].
     *
     * Unlike [effectiveUntil], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effectiveUntil")
    @ExcludeMissing
    fun _effectiveUntil(): JsonField<OffsetDateTime> = effectiveUntil

    /**
     * Returns the raw JSON value of [eqCov].
     *
     * Unlike [eqCov], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eqCov") @ExcludeMissing fun _eqCov(): JsonField<List<Double>> = eqCov

    /**
     * Returns the raw JSON value of [errorControl].
     *
     * Unlike [errorControl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errorControl")
    @ExcludeMissing
    fun _errorControl(): JsonField<Double> = errorControl

    /**
     * Returns the raw JSON value of [fixedStep].
     *
     * Unlike [fixedStep], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fixedStep") @ExcludeMissing fun _fixedStep(): JsonField<Boolean> = fixedStep

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
     * Returns the raw JSON value of [iau1980Terms].
     *
     * Unlike [iau1980Terms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iau1980Terms") @ExcludeMissing fun _iau1980Terms(): JsonField<Int> = iau1980Terms

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [idOrbitDetermination].
     *
     * Unlike [idOrbitDetermination], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("idOrbitDetermination")
    @ExcludeMissing
    fun _idOrbitDetermination(): JsonField<String> = idOrbitDetermination

    /**
     * Returns the raw JSON value of [idStateVector].
     *
     * Unlike [idStateVector], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idStateVector")
    @ExcludeMissing
    fun _idStateVector(): JsonField<String> = idStateVector

    /**
     * Returns the raw JSON value of [integratorMode].
     *
     * Unlike [integratorMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("integratorMode")
    @ExcludeMissing
    fun _integratorMode(): JsonField<String> = integratorMode

    /**
     * Returns the raw JSON value of [inTrackThrust].
     *
     * Unlike [inTrackThrust], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inTrackThrust")
    @ExcludeMissing
    fun _inTrackThrust(): JsonField<Boolean> = inTrackThrust

    /**
     * Returns the raw JSON value of [lastObEnd].
     *
     * Unlike [lastObEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastObEnd")
    @ExcludeMissing
    fun _lastObEnd(): JsonField<OffsetDateTime> = lastObEnd

    /**
     * Returns the raw JSON value of [lastObStart].
     *
     * Unlike [lastObStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastObStart")
    @ExcludeMissing
    fun _lastObStart(): JsonField<OffsetDateTime> = lastObStart

    /**
     * Returns the raw JSON value of [leapSecondTime].
     *
     * Unlike [leapSecondTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("leapSecondTime")
    @ExcludeMissing
    fun _leapSecondTime(): JsonField<OffsetDateTime> = leapSecondTime

    /**
     * Returns the raw JSON value of [lunarSolar].
     *
     * Unlike [lunarSolar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lunarSolar") @ExcludeMissing fun _lunarSolar(): JsonField<Boolean> = lunarSolar

    /**
     * Returns the raw JSON value of [mass].
     *
     * Unlike [mass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mass") @ExcludeMissing fun _mass(): JsonField<Double> = mass

    /**
     * Returns the raw JSON value of [msgTs].
     *
     * Unlike [msgTs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msgTs") @ExcludeMissing fun _msgTs(): JsonField<OffsetDateTime> = msgTs

    /**
     * Returns the raw JSON value of [obsAvailable].
     *
     * Unlike [obsAvailable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obsAvailable") @ExcludeMissing fun _obsAvailable(): JsonField<Int> = obsAvailable

    /**
     * Returns the raw JSON value of [obsUsed].
     *
     * Unlike [obsUsed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obsUsed") @ExcludeMissing fun _obsUsed(): JsonField<Int> = obsUsed

    /**
     * Returns the raw JSON value of [onOrbit].
     *
     * Unlike [onOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("onOrbit") @ExcludeMissing fun _onOrbit(): JsonField<OnorbitFull> = onOrbit

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
     * Returns the raw JSON value of [partials].
     *
     * Unlike [partials], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("partials") @ExcludeMissing fun _partials(): JsonField<String> = partials

    /**
     * Returns the raw JSON value of [pedigree].
     *
     * Unlike [pedigree], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pedigree") @ExcludeMissing fun _pedigree(): JsonField<String> = pedigree

    /**
     * Returns the raw JSON value of [polarMotionX].
     *
     * Unlike [polarMotionX], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarMotionX")
    @ExcludeMissing
    fun _polarMotionX(): JsonField<Double> = polarMotionX

    /**
     * Returns the raw JSON value of [polarMotionY].
     *
     * Unlike [polarMotionY], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarMotionY")
    @ExcludeMissing
    fun _polarMotionY(): JsonField<Double> = polarMotionY

    /**
     * Returns the raw JSON value of [posUnc].
     *
     * Unlike [posUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("posUnc") @ExcludeMissing fun _posUnc(): JsonField<Double> = posUnc

    /**
     * Returns the raw JSON value of [rawFileUri].
     *
     * Unlike [rawFileUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rawFileURI") @ExcludeMissing fun _rawFileUri(): JsonField<String> = rawFileUri

    /**
     * Returns the raw JSON value of [recOdSpan].
     *
     * Unlike [recOdSpan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recODSpan") @ExcludeMissing fun _recOdSpan(): JsonField<Double> = recOdSpan

    /**
     * Returns the raw JSON value of [referenceFrame].
     *
     * Unlike [referenceFrame], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referenceFrame")
    @ExcludeMissing
    fun _referenceFrame(): JsonField<ReferenceFrame> = referenceFrame

    /**
     * Returns the raw JSON value of [residualsAcc].
     *
     * Unlike [residualsAcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("residualsAcc")
    @ExcludeMissing
    fun _residualsAcc(): JsonField<Double> = residualsAcc

    /**
     * Returns the raw JSON value of [revNo].
     *
     * Unlike [revNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revNo") @ExcludeMissing fun _revNo(): JsonField<Int> = revNo

    /**
     * Returns the raw JSON value of [rms].
     *
     * Unlike [rms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rms") @ExcludeMissing fun _rms(): JsonField<Double> = rms

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [sigmaPosUvw].
     *
     * Unlike [sigmaPosUvw], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sigmaPosUVW")
    @ExcludeMissing
    fun _sigmaPosUvw(): JsonField<List<Double>> = sigmaPosUvw

    /**
     * Returns the raw JSON value of [sigmaVelUvw].
     *
     * Unlike [sigmaVelUvw], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sigmaVelUVW")
    @ExcludeMissing
    fun _sigmaVelUvw(): JsonField<List<Double>> = sigmaVelUvw

    /**
     * Returns the raw JSON value of [solarFluxApAvg].
     *
     * Unlike [solarFluxApAvg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("solarFluxAPAvg")
    @ExcludeMissing
    fun _solarFluxApAvg(): JsonField<Double> = solarFluxApAvg

    /**
     * Returns the raw JSON value of [solarFluxF10].
     *
     * Unlike [solarFluxF10], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("solarFluxF10")
    @ExcludeMissing
    fun _solarFluxF10(): JsonField<Double> = solarFluxF10

    /**
     * Returns the raw JSON value of [solarFluxF10Avg].
     *
     * Unlike [solarFluxF10Avg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("solarFluxF10Avg")
    @ExcludeMissing
    fun _solarFluxF10Avg(): JsonField<Double> = solarFluxF10Avg

    /**
     * Returns the raw JSON value of [solarRadPress].
     *
     * Unlike [solarRadPress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("solarRadPress")
    @ExcludeMissing
    fun _solarRadPress(): JsonField<Boolean> = solarRadPress

    /**
     * Returns the raw JSON value of [solarRadPressCoeff].
     *
     * Unlike [solarRadPressCoeff], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("solarRadPressCoeff")
    @ExcludeMissing
    fun _solarRadPressCoeff(): JsonField<Double> = solarRadPressCoeff

    /**
     * Returns the raw JSON value of [solidEarthTides].
     *
     * Unlike [solidEarthTides], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("solidEarthTides")
    @ExcludeMissing
    fun _solidEarthTides(): JsonField<Boolean> = solidEarthTides

    /**
     * Returns the raw JSON value of [sourcedData].
     *
     * Unlike [sourcedData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourcedData")
    @ExcludeMissing
    fun _sourcedData(): JsonField<List<String>> = sourcedData

    /**
     * Returns the raw JSON value of [sourcedDataTypes].
     *
     * Unlike [sourcedDataTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sourcedDataTypes")
    @ExcludeMissing
    fun _sourcedDataTypes(): JsonField<List<SourcedDataType>> = sourcedDataTypes

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [srpArea].
     *
     * Unlike [srpArea], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("srpArea") @ExcludeMissing fun _srpArea(): JsonField<Double> = srpArea

    /**
     * Returns the raw JSON value of [stepMode].
     *
     * Unlike [stepMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stepMode") @ExcludeMissing fun _stepMode(): JsonField<String> = stepMode

    /**
     * Returns the raw JSON value of [stepSize].
     *
     * Unlike [stepSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stepSize") @ExcludeMissing fun _stepSize(): JsonField<Double> = stepSize

    /**
     * Returns the raw JSON value of [stepSizeSelection].
     *
     * Unlike [stepSizeSelection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("stepSizeSelection")
    @ExcludeMissing
    fun _stepSizeSelection(): JsonField<String> = stepSizeSelection

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [taiUtc].
     *
     * Unlike [taiUtc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taiUtc") @ExcludeMissing fun _taiUtc(): JsonField<Double> = taiUtc

    /**
     * Returns the raw JSON value of [thrustAccel].
     *
     * Unlike [thrustAccel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thrustAccel") @ExcludeMissing fun _thrustAccel(): JsonField<Double> = thrustAccel

    /**
     * Returns the raw JSON value of [tracksAvail].
     *
     * Unlike [tracksAvail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracksAvail") @ExcludeMissing fun _tracksAvail(): JsonField<Int> = tracksAvail

    /**
     * Returns the raw JSON value of [tracksUsed].
     *
     * Unlike [tracksUsed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracksUsed") @ExcludeMissing fun _tracksUsed(): JsonField<Int> = tracksUsed

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [uct].
     *
     * Unlike [uct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uct") @ExcludeMissing fun _uct(): JsonField<Boolean> = uct

    /**
     * Returns the raw JSON value of [ut1Rate].
     *
     * Unlike [ut1Rate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ut1Rate") @ExcludeMissing fun _ut1Rate(): JsonField<Double> = ut1Rate

    /**
     * Returns the raw JSON value of [ut1Utc].
     *
     * Unlike [ut1Utc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ut1Utc") @ExcludeMissing fun _ut1Utc(): JsonField<Double> = ut1Utc

    /**
     * Returns the raw JSON value of [velUnc].
     *
     * Unlike [velUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("velUnc") @ExcludeMissing fun _velUnc(): JsonField<Double> = velUnc

    /**
     * Returns the raw JSON value of [xaccel].
     *
     * Unlike [xaccel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xaccel") @ExcludeMissing fun _xaccel(): JsonField<Double> = xaccel

    /**
     * Returns the raw JSON value of [xpos].
     *
     * Unlike [xpos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xpos") @ExcludeMissing fun _xpos(): JsonField<Double> = xpos

    /**
     * Returns the raw JSON value of [xposAlt1].
     *
     * Unlike [xposAlt1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xposAlt1") @ExcludeMissing fun _xposAlt1(): JsonField<Double> = xposAlt1

    /**
     * Returns the raw JSON value of [xposAlt2].
     *
     * Unlike [xposAlt2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xposAlt2") @ExcludeMissing fun _xposAlt2(): JsonField<Double> = xposAlt2

    /**
     * Returns the raw JSON value of [xvel].
     *
     * Unlike [xvel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xvel") @ExcludeMissing fun _xvel(): JsonField<Double> = xvel

    /**
     * Returns the raw JSON value of [xvelAlt1].
     *
     * Unlike [xvelAlt1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xvelAlt1") @ExcludeMissing fun _xvelAlt1(): JsonField<Double> = xvelAlt1

    /**
     * Returns the raw JSON value of [xvelAlt2].
     *
     * Unlike [xvelAlt2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xvelAlt2") @ExcludeMissing fun _xvelAlt2(): JsonField<Double> = xvelAlt2

    /**
     * Returns the raw JSON value of [yaccel].
     *
     * Unlike [yaccel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yaccel") @ExcludeMissing fun _yaccel(): JsonField<Double> = yaccel

    /**
     * Returns the raw JSON value of [ypos].
     *
     * Unlike [ypos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ypos") @ExcludeMissing fun _ypos(): JsonField<Double> = ypos

    /**
     * Returns the raw JSON value of [yposAlt1].
     *
     * Unlike [yposAlt1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yposAlt1") @ExcludeMissing fun _yposAlt1(): JsonField<Double> = yposAlt1

    /**
     * Returns the raw JSON value of [yposAlt2].
     *
     * Unlike [yposAlt2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yposAlt2") @ExcludeMissing fun _yposAlt2(): JsonField<Double> = yposAlt2

    /**
     * Returns the raw JSON value of [yvel].
     *
     * Unlike [yvel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yvel") @ExcludeMissing fun _yvel(): JsonField<Double> = yvel

    /**
     * Returns the raw JSON value of [yvelAlt1].
     *
     * Unlike [yvelAlt1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yvelAlt1") @ExcludeMissing fun _yvelAlt1(): JsonField<Double> = yvelAlt1

    /**
     * Returns the raw JSON value of [yvelAlt2].
     *
     * Unlike [yvelAlt2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yvelAlt2") @ExcludeMissing fun _yvelAlt2(): JsonField<Double> = yvelAlt2

    /**
     * Returns the raw JSON value of [zaccel].
     *
     * Unlike [zaccel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zaccel") @ExcludeMissing fun _zaccel(): JsonField<Double> = zaccel

    /**
     * Returns the raw JSON value of [zpos].
     *
     * Unlike [zpos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zpos") @ExcludeMissing fun _zpos(): JsonField<Double> = zpos

    /**
     * Returns the raw JSON value of [zposAlt1].
     *
     * Unlike [zposAlt1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zposAlt1") @ExcludeMissing fun _zposAlt1(): JsonField<Double> = zposAlt1

    /**
     * Returns the raw JSON value of [zposAlt2].
     *
     * Unlike [zposAlt2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zposAlt2") @ExcludeMissing fun _zposAlt2(): JsonField<Double> = zposAlt2

    /**
     * Returns the raw JSON value of [zvel].
     *
     * Unlike [zvel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zvel") @ExcludeMissing fun _zvel(): JsonField<Double> = zvel

    /**
     * Returns the raw JSON value of [zvelAlt1].
     *
     * Unlike [zvelAlt1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zvelAlt1") @ExcludeMissing fun _zvelAlt1(): JsonField<Double> = zvelAlt1

    /**
     * Returns the raw JSON value of [zvelAlt2].
     *
     * Unlike [zvelAlt2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zvelAlt2") @ExcludeMissing fun _zvelAlt2(): JsonField<Double> = zvelAlt2

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
         * Returns a mutable builder for constructing an instance of [StateVectorFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .epoch()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StateVectorFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var epoch: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var actualOdSpan: JsonField<Double> = JsonMissing.of()
        private var algorithm: JsonField<String> = JsonMissing.of()
        private var alt1ReferenceFrame: JsonField<String> = JsonMissing.of()
        private var alt2ReferenceFrame: JsonField<String> = JsonMissing.of()
        private var area: JsonField<Double> = JsonMissing.of()
        private var bDot: JsonField<Double> = JsonMissing.of()
        private var cmOffset: JsonField<Double> = JsonMissing.of()
        private var cov: JsonField<MutableList<Double>>? = null
        private var covMethod: JsonField<String> = JsonMissing.of()
        private var covReferenceFrame: JsonField<CovReferenceFrame> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var dragArea: JsonField<Double> = JsonMissing.of()
        private var dragCoeff: JsonField<Double> = JsonMissing.of()
        private var dragModel: JsonField<String> = JsonMissing.of()
        private var edr: JsonField<Double> = JsonMissing.of()
        private var effectiveFrom: JsonField<OffsetDateTime> = JsonMissing.of()
        private var effectiveUntil: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eqCov: JsonField<MutableList<Double>>? = null
        private var errorControl: JsonField<Double> = JsonMissing.of()
        private var fixedStep: JsonField<Boolean> = JsonMissing.of()
        private var geopotentialModel: JsonField<String> = JsonMissing.of()
        private var iau1980Terms: JsonField<Int> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idOrbitDetermination: JsonField<String> = JsonMissing.of()
        private var idStateVector: JsonField<String> = JsonMissing.of()
        private var integratorMode: JsonField<String> = JsonMissing.of()
        private var inTrackThrust: JsonField<Boolean> = JsonMissing.of()
        private var lastObEnd: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastObStart: JsonField<OffsetDateTime> = JsonMissing.of()
        private var leapSecondTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lunarSolar: JsonField<Boolean> = JsonMissing.of()
        private var mass: JsonField<Double> = JsonMissing.of()
        private var msgTs: JsonField<OffsetDateTime> = JsonMissing.of()
        private var obsAvailable: JsonField<Int> = JsonMissing.of()
        private var obsUsed: JsonField<Int> = JsonMissing.of()
        private var onOrbit: JsonField<OnorbitFull> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var partials: JsonField<String> = JsonMissing.of()
        private var pedigree: JsonField<String> = JsonMissing.of()
        private var polarMotionX: JsonField<Double> = JsonMissing.of()
        private var polarMotionY: JsonField<Double> = JsonMissing.of()
        private var posUnc: JsonField<Double> = JsonMissing.of()
        private var rawFileUri: JsonField<String> = JsonMissing.of()
        private var recOdSpan: JsonField<Double> = JsonMissing.of()
        private var referenceFrame: JsonField<ReferenceFrame> = JsonMissing.of()
        private var residualsAcc: JsonField<Double> = JsonMissing.of()
        private var revNo: JsonField<Int> = JsonMissing.of()
        private var rms: JsonField<Double> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var sigmaPosUvw: JsonField<MutableList<Double>>? = null
        private var sigmaVelUvw: JsonField<MutableList<Double>>? = null
        private var solarFluxApAvg: JsonField<Double> = JsonMissing.of()
        private var solarFluxF10: JsonField<Double> = JsonMissing.of()
        private var solarFluxF10Avg: JsonField<Double> = JsonMissing.of()
        private var solarRadPress: JsonField<Boolean> = JsonMissing.of()
        private var solarRadPressCoeff: JsonField<Double> = JsonMissing.of()
        private var solidEarthTides: JsonField<Boolean> = JsonMissing.of()
        private var sourcedData: JsonField<MutableList<String>>? = null
        private var sourcedDataTypes: JsonField<MutableList<SourcedDataType>>? = null
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var srpArea: JsonField<Double> = JsonMissing.of()
        private var stepMode: JsonField<String> = JsonMissing.of()
        private var stepSize: JsonField<Double> = JsonMissing.of()
        private var stepSizeSelection: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var taiUtc: JsonField<Double> = JsonMissing.of()
        private var thrustAccel: JsonField<Double> = JsonMissing.of()
        private var tracksAvail: JsonField<Int> = JsonMissing.of()
        private var tracksUsed: JsonField<Int> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var uct: JsonField<Boolean> = JsonMissing.of()
        private var ut1Rate: JsonField<Double> = JsonMissing.of()
        private var ut1Utc: JsonField<Double> = JsonMissing.of()
        private var velUnc: JsonField<Double> = JsonMissing.of()
        private var xaccel: JsonField<Double> = JsonMissing.of()
        private var xpos: JsonField<Double> = JsonMissing.of()
        private var xposAlt1: JsonField<Double> = JsonMissing.of()
        private var xposAlt2: JsonField<Double> = JsonMissing.of()
        private var xvel: JsonField<Double> = JsonMissing.of()
        private var xvelAlt1: JsonField<Double> = JsonMissing.of()
        private var xvelAlt2: JsonField<Double> = JsonMissing.of()
        private var yaccel: JsonField<Double> = JsonMissing.of()
        private var ypos: JsonField<Double> = JsonMissing.of()
        private var yposAlt1: JsonField<Double> = JsonMissing.of()
        private var yposAlt2: JsonField<Double> = JsonMissing.of()
        private var yvel: JsonField<Double> = JsonMissing.of()
        private var yvelAlt1: JsonField<Double> = JsonMissing.of()
        private var yvelAlt2: JsonField<Double> = JsonMissing.of()
        private var zaccel: JsonField<Double> = JsonMissing.of()
        private var zpos: JsonField<Double> = JsonMissing.of()
        private var zposAlt1: JsonField<Double> = JsonMissing.of()
        private var zposAlt2: JsonField<Double> = JsonMissing.of()
        private var zvel: JsonField<Double> = JsonMissing.of()
        private var zvelAlt1: JsonField<Double> = JsonMissing.of()
        private var zvelAlt2: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stateVectorFull: StateVectorFull) = apply {
            classificationMarking = stateVectorFull.classificationMarking
            dataMode = stateVectorFull.dataMode
            epoch = stateVectorFull.epoch
            source = stateVectorFull.source
            actualOdSpan = stateVectorFull.actualOdSpan
            algorithm = stateVectorFull.algorithm
            alt1ReferenceFrame = stateVectorFull.alt1ReferenceFrame
            alt2ReferenceFrame = stateVectorFull.alt2ReferenceFrame
            area = stateVectorFull.area
            bDot = stateVectorFull.bDot
            cmOffset = stateVectorFull.cmOffset
            cov = stateVectorFull.cov.map { it.toMutableList() }
            covMethod = stateVectorFull.covMethod
            covReferenceFrame = stateVectorFull.covReferenceFrame
            createdAt = stateVectorFull.createdAt
            createdBy = stateVectorFull.createdBy
            descriptor = stateVectorFull.descriptor
            dragArea = stateVectorFull.dragArea
            dragCoeff = stateVectorFull.dragCoeff
            dragModel = stateVectorFull.dragModel
            edr = stateVectorFull.edr
            effectiveFrom = stateVectorFull.effectiveFrom
            effectiveUntil = stateVectorFull.effectiveUntil
            eqCov = stateVectorFull.eqCov.map { it.toMutableList() }
            errorControl = stateVectorFull.errorControl
            fixedStep = stateVectorFull.fixedStep
            geopotentialModel = stateVectorFull.geopotentialModel
            iau1980Terms = stateVectorFull.iau1980Terms
            idOnOrbit = stateVectorFull.idOnOrbit
            idOrbitDetermination = stateVectorFull.idOrbitDetermination
            idStateVector = stateVectorFull.idStateVector
            integratorMode = stateVectorFull.integratorMode
            inTrackThrust = stateVectorFull.inTrackThrust
            lastObEnd = stateVectorFull.lastObEnd
            lastObStart = stateVectorFull.lastObStart
            leapSecondTime = stateVectorFull.leapSecondTime
            lunarSolar = stateVectorFull.lunarSolar
            mass = stateVectorFull.mass
            msgTs = stateVectorFull.msgTs
            obsAvailable = stateVectorFull.obsAvailable
            obsUsed = stateVectorFull.obsUsed
            onOrbit = stateVectorFull.onOrbit
            origin = stateVectorFull.origin
            origNetwork = stateVectorFull.origNetwork
            origObjectId = stateVectorFull.origObjectId
            partials = stateVectorFull.partials
            pedigree = stateVectorFull.pedigree
            polarMotionX = stateVectorFull.polarMotionX
            polarMotionY = stateVectorFull.polarMotionY
            posUnc = stateVectorFull.posUnc
            rawFileUri = stateVectorFull.rawFileUri
            recOdSpan = stateVectorFull.recOdSpan
            referenceFrame = stateVectorFull.referenceFrame
            residualsAcc = stateVectorFull.residualsAcc
            revNo = stateVectorFull.revNo
            rms = stateVectorFull.rms
            satNo = stateVectorFull.satNo
            sigmaPosUvw = stateVectorFull.sigmaPosUvw.map { it.toMutableList() }
            sigmaVelUvw = stateVectorFull.sigmaVelUvw.map { it.toMutableList() }
            solarFluxApAvg = stateVectorFull.solarFluxApAvg
            solarFluxF10 = stateVectorFull.solarFluxF10
            solarFluxF10Avg = stateVectorFull.solarFluxF10Avg
            solarRadPress = stateVectorFull.solarRadPress
            solarRadPressCoeff = stateVectorFull.solarRadPressCoeff
            solidEarthTides = stateVectorFull.solidEarthTides
            sourcedData = stateVectorFull.sourcedData.map { it.toMutableList() }
            sourcedDataTypes = stateVectorFull.sourcedDataTypes.map { it.toMutableList() }
            sourceDl = stateVectorFull.sourceDl
            srpArea = stateVectorFull.srpArea
            stepMode = stateVectorFull.stepMode
            stepSize = stateVectorFull.stepSize
            stepSizeSelection = stateVectorFull.stepSizeSelection
            tags = stateVectorFull.tags.map { it.toMutableList() }
            taiUtc = stateVectorFull.taiUtc
            thrustAccel = stateVectorFull.thrustAccel
            tracksAvail = stateVectorFull.tracksAvail
            tracksUsed = stateVectorFull.tracksUsed
            transactionId = stateVectorFull.transactionId
            uct = stateVectorFull.uct
            ut1Rate = stateVectorFull.ut1Rate
            ut1Utc = stateVectorFull.ut1Utc
            velUnc = stateVectorFull.velUnc
            xaccel = stateVectorFull.xaccel
            xpos = stateVectorFull.xpos
            xposAlt1 = stateVectorFull.xposAlt1
            xposAlt2 = stateVectorFull.xposAlt2
            xvel = stateVectorFull.xvel
            xvelAlt1 = stateVectorFull.xvelAlt1
            xvelAlt2 = stateVectorFull.xvelAlt2
            yaccel = stateVectorFull.yaccel
            ypos = stateVectorFull.ypos
            yposAlt1 = stateVectorFull.yposAlt1
            yposAlt2 = stateVectorFull.yposAlt2
            yvel = stateVectorFull.yvel
            yvelAlt1 = stateVectorFull.yvelAlt1
            yvelAlt2 = stateVectorFull.yvelAlt2
            zaccel = stateVectorFull.zaccel
            zpos = stateVectorFull.zpos
            zposAlt1 = stateVectorFull.zposAlt1
            zposAlt2 = stateVectorFull.zposAlt2
            zvel = stateVectorFull.zvel
            zvelAlt1 = stateVectorFull.zvelAlt1
            zvelAlt2 = stateVectorFull.zvelAlt2
            additionalProperties = stateVectorFull.additionalProperties.toMutableMap()
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
         * Time of validity for state vector in ISO 8601 UTC datetime format, with microsecond
         * precision.
         */
        fun epoch(epoch: OffsetDateTime) = epoch(JsonField.of(epoch))

        /**
         * Sets [Builder.epoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.epoch] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun epoch(epoch: JsonField<OffsetDateTime>) = apply { this.epoch = epoch }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** The actual time span used for the OD of the object, expressed in days. */
        fun actualOdSpan(actualOdSpan: Double) = actualOdSpan(JsonField.of(actualOdSpan))

        /**
         * Sets [Builder.actualOdSpan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actualOdSpan] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actualOdSpan(actualOdSpan: JsonField<Double>) = apply {
            this.actualOdSpan = actualOdSpan
        }

        /** Optional algorithm used to produce this record. */
        fun algorithm(algorithm: String) = algorithm(JsonField.of(algorithm))

        /**
         * Sets [Builder.algorithm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.algorithm] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun algorithm(algorithm: JsonField<String>) = apply { this.algorithm = algorithm }

        /** The reference frame of the alternate1 (Alt1) cartesian orbital state. */
        fun alt1ReferenceFrame(alt1ReferenceFrame: String) =
            alt1ReferenceFrame(JsonField.of(alt1ReferenceFrame))

        /**
         * Sets [Builder.alt1ReferenceFrame] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alt1ReferenceFrame] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun alt1ReferenceFrame(alt1ReferenceFrame: JsonField<String>) = apply {
            this.alt1ReferenceFrame = alt1ReferenceFrame
        }

        /** The reference frame of the alternate2 (Alt2) cartesian orbital state. */
        fun alt2ReferenceFrame(alt2ReferenceFrame: String) =
            alt2ReferenceFrame(JsonField.of(alt2ReferenceFrame))

        /**
         * Sets [Builder.alt2ReferenceFrame] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alt2ReferenceFrame] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun alt2ReferenceFrame(alt2ReferenceFrame: JsonField<String>) = apply {
            this.alt2ReferenceFrame = alt2ReferenceFrame
        }

        /** The actual area of the object at it's largest cross-section, expressed in meters^2. */
        fun area(area: Double) = area(JsonField.of(area))

        /**
         * Sets [Builder.area] to an arbitrary JSON value.
         *
         * You should usually call [Builder.area] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun area(area: JsonField<Double>) = apply { this.area = area }

        /** First derivative of drag/ballistic coefficient (m2/kg-s). */
        fun bDot(bDot: Double) = bDot(JsonField.of(bDot))

        /**
         * Sets [Builder.bDot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bDot] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bDot(bDot: JsonField<Double>) = apply { this.bDot = bDot }

        /** Model parameter value for center of mass offset (m). */
        fun cmOffset(cmOffset: Double) = cmOffset(JsonField.of(cmOffset))

        /**
         * Sets [Builder.cmOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cmOffset] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cmOffset(cmOffset: JsonField<Double>) = apply { this.cmOffset = cmOffset }

        /**
         * Covariance matrix, in kilometer and second based units, in the specified
         * covReferenceFrame. If the covReferenceFrame is null it is assumed to be J2000. The array
         * values (1-21) represent the lower triangular half of the position-velocity covariance
         * matrix. The size of the covariance matrix is dynamic, depending on whether the covariance
         * for position only or position & velocity. The covariance elements are position dependent
         * within the array with values ordered as follows:
         *
         * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;&nbsp;&nbsp;y&nbsp;&nbsp;&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;&nbsp;&nbsp;y'&nbsp;&nbsp;&nbsp;&nbsp;z'&nbsp;&nbsp;&nbsp;&nbsp;DRG&nbsp;&nbsp;&nbsp;&nbsp;SRP&nbsp;&nbsp;&nbsp;&nbsp;THR&nbsp;&nbsp;
         *
         * x&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1
         *
         * y&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;&nbsp;3
         *
         * z&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4&nbsp;&nbsp;&nbsp;&nbsp;5&nbsp;&nbsp;&nbsp;&nbsp;6
         *
         * x'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;7&nbsp;&nbsp;&nbsp;&nbsp;8&nbsp;&nbsp;&nbsp;&nbsp;9&nbsp;&nbsp;&nbsp;10
         *
         * y'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11&nbsp;&nbsp;12&nbsp;&nbsp;13&nbsp;&nbsp;14&nbsp;&nbsp;15
         *
         * z'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;16&nbsp;&nbsp;17&nbsp;&nbsp;18&nbsp;&nbsp;19&nbsp;&nbsp;20&nbsp;&nbsp;&nbsp;21&nbsp;
         *
         * The cov array should contain only the lower left triangle values from top left down to
         * bottom right, in order.
         *
         * If additional covariance terms are included for DRAG, SRP, and/or THRUST, the matrix can
         * be extended with the following order of elements:
         *
         * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;&nbsp;&nbsp;y&nbsp;&nbsp;&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;&nbsp;&nbsp;y'&nbsp;&nbsp;&nbsp;&nbsp;z'&nbsp;&nbsp;&nbsp;&nbsp;DRG&nbsp;&nbsp;&nbsp;&nbsp;SRP&nbsp;&nbsp;&nbsp;&nbsp;THR
         *
         * DRG&nbsp;&nbsp;&nbsp;22&nbsp;&nbsp;23&nbsp;&nbsp;24&nbsp;&nbsp;25&nbsp;&nbsp;26&nbsp;&nbsp;&nbsp;27&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;28&nbsp;&nbsp;
         *
         * SRP&nbsp;&nbsp;&nbsp;29&nbsp;&nbsp;30&nbsp;&nbsp;31&nbsp;&nbsp;32&nbsp;&nbsp;33&nbsp;&nbsp;&nbsp;34&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;35&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;36&nbsp;&nbsp;
         *
         * THR&nbsp;&nbsp;&nbsp;37&nbsp;&nbsp;38&nbsp;&nbsp;39&nbsp;&nbsp;40&nbsp;&nbsp;41&nbsp;&nbsp;&nbsp;42&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;43&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;44&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;45&nbsp;
         */
        fun cov(cov: List<Double>) = cov(JsonField.of(cov))

        /**
         * Sets [Builder.cov] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cov] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cov(cov: JsonField<List<Double>>) = apply { this.cov = cov.map { it.toMutableList() } }

        /**
         * Adds a single [Double] to [Builder.cov].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCov(cov: Double) = apply {
            this.cov =
                (this.cov ?: JsonField.of(mutableListOf())).also { checkKnown("cov", it).add(cov) }
        }

        /**
         * The method used to generate the covariance during the orbit determination (OD) that
         * produced the state vector, or whether an arbitrary, non-calculated default value was used
         * (CALCULATED, DEFAULT).
         */
        fun covMethod(covMethod: String) = covMethod(JsonField.of(covMethod))

        /**
         * Sets [Builder.covMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.covMethod] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun covMethod(covMethod: JsonField<String>) = apply { this.covMethod = covMethod }

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

        /** The effective area of the object exposed to atmospheric drag, expressed in meters^2. */
        fun dragArea(dragArea: Double) = dragArea(JsonField.of(dragArea))

        /**
         * Sets [Builder.dragArea] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dragArea] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dragArea(dragArea: JsonField<Double>) = apply { this.dragArea = dragArea }

        /** Area-to-mass ratio coefficient for atmospheric ballistic drag (m2/kg). */
        fun dragCoeff(dragCoeff: Double) = dragCoeff(JsonField.of(dragCoeff))

        /**
         * Sets [Builder.dragCoeff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dragCoeff] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dragCoeff(dragCoeff: JsonField<Double>) = apply { this.dragCoeff = dragCoeff }

        /**
         * The Drag Model used for this vector (e.g. HARRIS-PRIESTER, JAC70, JBH09, MSIS90, NONE,
         * etc.).
         */
        fun dragModel(dragModel: String) = dragModel(JsonField.of(dragModel))

        /**
         * Sets [Builder.dragModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dragModel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dragModel(dragModel: JsonField<String>) = apply { this.dragModel = dragModel }

        /** Model parameter value for energy dissipation rate (EDR) (w/kg). */
        fun edr(edr: Double) = edr(JsonField.of(edr))

        /**
         * Sets [Builder.edr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.edr] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun edr(edr: JsonField<Double>) = apply { this.edr = edr }

        /**
         * Start time at which this state vector was the 'current' state vector for its satellite.
         */
        fun effectiveFrom(effectiveFrom: OffsetDateTime) =
            effectiveFrom(JsonField.of(effectiveFrom))

        /**
         * Sets [Builder.effectiveFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveFrom] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveFrom(effectiveFrom: JsonField<OffsetDateTime>) = apply {
            this.effectiveFrom = effectiveFrom
        }

        /**
         * End time at which this state vector was no longer the 'current' state vector for its
         * satellite.
         */
        fun effectiveUntil(effectiveUntil: OffsetDateTime) =
            effectiveUntil(JsonField.of(effectiveUntil))

        /**
         * Sets [Builder.effectiveUntil] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveUntil] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveUntil(effectiveUntil: JsonField<OffsetDateTime>) = apply {
            this.effectiveUntil = effectiveUntil
        }

        /**
         * The covariance matrix values represent the lower triangular half of the covariance matrix
         * in terms of equinoctial elements.&nbsp; The size of the covariance matrix is
         * dynamic.&nbsp; The values are outputted in order across each row, i.e.:
         *
         * 1&nbsp;&nbsp; 2&nbsp;&nbsp; 3&nbsp;&nbsp; 4&nbsp;&nbsp; 5
         *
         * 6&nbsp;&nbsp; 7&nbsp;&nbsp; 8&nbsp;&nbsp; 9&nbsp; 10
         *
         * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
         *
         * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
         *
         * 51&nbsp; 52&nbsp; 53&nbsp; 54&nbsp; 55
         *
         * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
         *
         * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
         *
         * The ordering of values is as follows:
         *
         * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Af&nbsp;&nbsp;
         * Ag&nbsp;&nbsp; L&nbsp;&nbsp;&nbsp; N&nbsp;&nbsp; Chi&nbsp; Psi&nbsp;&nbsp; B&nbsp;&nbsp;
         * BDOT AGOM&nbsp; T&nbsp;&nbsp; C1&nbsp;&nbsp; C2&nbsp; ...
         *
         * Af&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1
         *
         * Ag&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2&nbsp;&nbsp;&nbsp; 3
         *
         * L&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 4&nbsp;&nbsp;&nbsp;
         * 5&nbsp;&nbsp;&nbsp; 6
         *
         * N&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 7&nbsp;&nbsp;&nbsp;
         * 8&nbsp;&nbsp;&nbsp; 9&nbsp;&nbsp; 10
         *
         * Chi&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 11&nbsp;&nbsp; 12&nbsp;&nbsp; 13&nbsp;&nbsp;
         * 14&nbsp;&nbsp; 15
         *
         * Psi&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 16&nbsp;&nbsp; 17&nbsp;&nbsp; 18&nbsp;&nbsp;
         * 19&nbsp;&nbsp; 20&nbsp;&nbsp; 21
         *
         * B&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 22&nbsp;&nbsp; 23&nbsp;&nbsp; 24
         * &nbsp;&nbsp;25&nbsp;&nbsp; 26&nbsp;&nbsp; 27&nbsp;&nbsp; 28
         *
         * BDOT&nbsp;&nbsp; 29&nbsp;&nbsp; 30&nbsp;&nbsp; 31&nbsp;&nbsp; 32&nbsp;&nbsp;
         * 33&nbsp;&nbsp; 34&nbsp;&nbsp; 35&nbsp;&nbsp; 36
         *
         * AGOM&nbsp; 37&nbsp;&nbsp; 38&nbsp;&nbsp; 39&nbsp;&nbsp; 40&nbsp;&nbsp; 41&nbsp;&nbsp;
         * 42&nbsp;&nbsp; 43&nbsp;&nbsp; 44&nbsp;&nbsp; 45
         *
         * T&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 46&nbsp;&nbsp;
         * 47&nbsp;&nbsp; 48&nbsp;&nbsp; 49&nbsp;&nbsp; 50&nbsp;&nbsp; 51&nbsp;&nbsp; 52&nbsp;&nbsp;
         * 53&nbsp;&nbsp; 54&nbsp;&nbsp; 55
         *
         * C1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 56&nbsp;&nbsp; 57&nbsp;&nbsp;
         * 58&nbsp;&nbsp; 59&nbsp;&nbsp; 60&nbsp;&nbsp; 61&nbsp;&nbsp; 62&nbsp;&nbsp; 63&nbsp;&nbsp;
         * 64&nbsp;&nbsp; 65&nbsp;&nbsp; 66
         *
         * C2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 67&nbsp;&nbsp; 68&nbsp;&nbsp;
         * 69&nbsp;&nbsp; 70&nbsp;&nbsp; 71&nbsp; &nbsp;72&nbsp;&nbsp; 73&nbsp;&nbsp; 74&nbsp;&nbsp;
         * 75&nbsp;&nbsp; 76&nbsp;&nbsp; 77&nbsp;&nbsp; 78
         *
         * :
         *
         * :
         *
         * where C1, C2, etc, are the "consider parameters" that may be added to the covariance
         * matrix.&nbsp; The covariance matrix will be as large as the last element/model parameter
         * needed.&nbsp; In other words, if the DC solved for all 6 elements plus AGOM, the
         * covariance matrix will be 9x9 (and the rows for B and BDOT will be all zeros).&nbsp; If
         * the covariance matrix is unavailable, the size will be set to 0x0, and no data will
         * follow.&nbsp; The cov field should contain only the lower left triangle values from top
         * left down to bottom right, in order.
         */
        fun eqCov(eqCov: List<Double>) = eqCov(JsonField.of(eqCov))

        /**
         * Sets [Builder.eqCov] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eqCov] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eqCov(eqCov: JsonField<List<Double>>) = apply {
            this.eqCov = eqCov.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.eqCov].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEqCov(eqCov: Double) = apply {
            this.eqCov =
                (this.eqCov ?: JsonField.of(mutableListOf())).also {
                    checkKnown("eqCov", it).add(eqCov)
                }
        }

        /** Integrator error control. */
        fun errorControl(errorControl: Double) = errorControl(JsonField.of(errorControl))

        /**
         * Sets [Builder.errorControl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorControl] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorControl(errorControl: JsonField<Double>) = apply {
            this.errorControl = errorControl
        }

        /** Boolean indicating use of fixed step size for this vector. */
        fun fixedStep(fixedStep: Boolean) = fixedStep(JsonField.of(fixedStep))

        /**
         * Sets [Builder.fixedStep] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fixedStep] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fixedStep(fixedStep: JsonField<Boolean>) = apply { this.fixedStep = fixedStep }

        /**
         * Geopotential model used for this vector (e.g. EGM-96, WGS-84, WGS-72, JGM-2, or GEM-T3),
         * including mm degree zonals, nn degree/order tesserals. E.g. EGM-96 24Z,24T.
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

        /** Number of terms used in the IAU 1980 nutation model (4, 50, or 106). */
        fun iau1980Terms(iau1980Terms: Int) = iau1980Terms(JsonField.of(iau1980Terms))

        /**
         * Sets [Builder.iau1980Terms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iau1980Terms] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun iau1980Terms(iau1980Terms: JsonField<Int>) = apply { this.iau1980Terms = iau1980Terms }

        /**
         * Unique identifier of the satellite on-orbit object, if correlated. For the public
         * catalog, the idOnOrbit is typically the satellite number as a string, but may be a UUID
         * for analyst or other unknown or untracked satellites.
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
         * Unique identifier of the OD solution record that produced this state vector. This ID can
         * be used to obtain additional information on an OrbitDetermination object using the 'get
         * by ID' operation (e.g. /udl/orbitdetermination/{id}). For example, the OrbitDetermination
         * with idOrbitDetermination = abc would be queries as /udl/orbitdetermination/abc.
         */
        fun idOrbitDetermination(idOrbitDetermination: String) =
            idOrbitDetermination(JsonField.of(idOrbitDetermination))

        /**
         * Sets [Builder.idOrbitDetermination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOrbitDetermination] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idOrbitDetermination(idOrbitDetermination: JsonField<String>) = apply {
            this.idOrbitDetermination = idOrbitDetermination
        }

        /** Unique identifier of the record, auto-generated by the system. */
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

        /** Integrator Mode. */
        fun integratorMode(integratorMode: String) = integratorMode(JsonField.of(integratorMode))

        /**
         * Sets [Builder.integratorMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integratorMode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun integratorMode(integratorMode: JsonField<String>) = apply {
            this.integratorMode = integratorMode
        }

        /** Boolean indicating use of in-track thrust perturbations for this vector. */
        fun inTrackThrust(inTrackThrust: Boolean) = inTrackThrust(JsonField.of(inTrackThrust))

        /**
         * Sets [Builder.inTrackThrust] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inTrackThrust] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inTrackThrust(inTrackThrust: JsonField<Boolean>) = apply {
            this.inTrackThrust = inTrackThrust
        }

        /**
         * The end of the time interval containing the time of the last accepted observation, in ISO
         * 8601 UTC format with microsecond precision. For an exact observation time, the
         * firstObTime and lastObTime are the same.
         */
        fun lastObEnd(lastObEnd: OffsetDateTime) = lastObEnd(JsonField.of(lastObEnd))

        /**
         * Sets [Builder.lastObEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastObEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastObEnd(lastObEnd: JsonField<OffsetDateTime>) = apply { this.lastObEnd = lastObEnd }

        /**
         * The start of the time interval containing the time of the last accepted observation, in
         * ISO 8601 UTC format with microsecond precision. For an exact observation time, the
         * firstObTime and lastObTime are the same.
         */
        fun lastObStart(lastObStart: OffsetDateTime) = lastObStart(JsonField.of(lastObStart))

        /**
         * Sets [Builder.lastObStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastObStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastObStart(lastObStart: JsonField<OffsetDateTime>) = apply {
            this.lastObStart = lastObStart
        }

        /**
         * Time of the next leap second after epoch in ISO 8601 UTC time. If the next leap second is
         * not known, the time of the previous leap second is used.
         */
        fun leapSecondTime(leapSecondTime: OffsetDateTime) =
            leapSecondTime(JsonField.of(leapSecondTime))

        /**
         * Sets [Builder.leapSecondTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.leapSecondTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun leapSecondTime(leapSecondTime: JsonField<OffsetDateTime>) = apply {
            this.leapSecondTime = leapSecondTime
        }

        /** Boolean indicating use of lunar/solar perturbations for this vector. */
        fun lunarSolar(lunarSolar: Boolean) = lunarSolar(JsonField.of(lunarSolar))

        /**
         * Sets [Builder.lunarSolar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lunarSolar] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lunarSolar(lunarSolar: JsonField<Boolean>) = apply { this.lunarSolar = lunarSolar }

        /** The mass of the object, in kilograms. */
        fun mass(mass: Double) = mass(JsonField.of(mass))

        /**
         * Sets [Builder.mass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mass] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mass(mass: JsonField<Double>) = apply { this.mass = mass }

        /** Time when message was generated in ISO 8601 UTC format with microsecond precision. */
        fun msgTs(msgTs: OffsetDateTime) = msgTs(JsonField.of(msgTs))

        /**
         * Sets [Builder.msgTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msgTs] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun msgTs(msgTs: JsonField<OffsetDateTime>) = apply { this.msgTs = msgTs }

        /** The number of observations available for the OD of the object. */
        fun obsAvailable(obsAvailable: Int) = obsAvailable(JsonField.of(obsAvailable))

        /**
         * Sets [Builder.obsAvailable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obsAvailable] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun obsAvailable(obsAvailable: JsonField<Int>) = apply { this.obsAvailable = obsAvailable }

        /** The number of observations accepted for the OD of the object. */
        fun obsUsed(obsUsed: Int) = obsUsed(JsonField.of(obsUsed))

        /**
         * Sets [Builder.obsUsed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obsUsed] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun obsUsed(obsUsed: JsonField<Int>) = apply { this.obsUsed = obsUsed }

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
         * Optional identifier provided by state vector source to indicate the target onorbit object
         * of this state vector. This may be an internal identifier and not necessarily map to a
         * valid satellite number.
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

        /** Type of partial derivatives used (ANALYTIC, FULL NUM, or FAST NUM). */
        fun partials(partials: String) = partials(JsonField.of(partials))

        /**
         * Sets [Builder.partials] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partials] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun partials(partials: JsonField<String>) = apply { this.partials = partials }

        /**
         * The pedigree of state vector, or methods used for its generation to include state
         * update/orbit determination, propagation from another state, or a state from a calibration
         * satellite (e.g. ORBIT_UPDATE, PROPAGATION, CALIBRATION, CONJUNCTION, FLIGHT_PLAN).
         */
        fun pedigree(pedigree: String) = pedigree(JsonField.of(pedigree))

        /**
         * Sets [Builder.pedigree] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pedigree] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pedigree(pedigree: JsonField<String>) = apply { this.pedigree = pedigree }

        /** Polar Wander Motion X (arc seconds). */
        fun polarMotionX(polarMotionX: Double) = polarMotionX(JsonField.of(polarMotionX))

        /**
         * Sets [Builder.polarMotionX] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarMotionX] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun polarMotionX(polarMotionX: JsonField<Double>) = apply {
            this.polarMotionX = polarMotionX
        }

        /** Polar Wander Motion Y (arc seconds). */
        fun polarMotionY(polarMotionY: Double) = polarMotionY(JsonField.of(polarMotionY))

        /**
         * Sets [Builder.polarMotionY] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarMotionY] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun polarMotionY(polarMotionY: JsonField<Double>) = apply {
            this.polarMotionY = polarMotionY
        }

        /** One sigma position uncertainty, in kilometers. */
        fun posUnc(posUnc: Double) = posUnc(JsonField.of(posUnc))

        /**
         * Sets [Builder.posUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.posUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun posUnc(posUnc: JsonField<Double>) = apply { this.posUnc = posUnc }

        /**
         * Optional URI location in the document repository of the raw file parsed by the system to
         * produce this record. To download the raw file, prepend
         * https://udl-hostname/scs/download?id= to this value.
         */
        fun rawFileUri(rawFileUri: String) = rawFileUri(JsonField.of(rawFileUri))

        /**
         * Sets [Builder.rawFileUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawFileUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rawFileUri(rawFileUri: JsonField<String>) = apply { this.rawFileUri = rawFileUri }

        /** The recommended OD time span calculated for the object, expressed in days. */
        fun recOdSpan(recOdSpan: Double) = recOdSpan(JsonField.of(recOdSpan))

        /**
         * Sets [Builder.recOdSpan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recOdSpan] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recOdSpan(recOdSpan: JsonField<Double>) = apply { this.recOdSpan = recOdSpan }

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

        /** The percentage of residuals accepted in the OD of the object. */
        fun residualsAcc(residualsAcc: Double) = residualsAcc(JsonField.of(residualsAcc))

        /**
         * Sets [Builder.residualsAcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.residualsAcc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun residualsAcc(residualsAcc: JsonField<Double>) = apply {
            this.residualsAcc = residualsAcc
        }

        /** Epoch revolution number. */
        fun revNo(revNo: Int) = revNo(JsonField.of(revNo))

        /**
         * Sets [Builder.revNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun revNo(revNo: JsonField<Int>) = apply { this.revNo = revNo }

        /**
         * The Weighted Root Mean Squared (RMS) of the differential correction on the target object
         * that produced this vector. WRMS is a quality indicator of the state vector update, with a
         * value of 1.00 being optimal. WRMS applies to Batch Least Squares (BLS) processes.
         */
        fun rms(rms: Double) = rms(JsonField.of(rms))

        /**
         * Sets [Builder.rms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rms] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rms(rms: JsonField<Double>) = apply { this.rms = rms }

        /** Satellite/Catalog number of the target OnOrbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /**
         * Array containing the standard deviation of error in target object position, U, V and W
         * direction respectively (km).
         */
        fun sigmaPosUvw(sigmaPosUvw: List<Double>) = sigmaPosUvw(JsonField.of(sigmaPosUvw))

        /**
         * Sets [Builder.sigmaPosUvw] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sigmaPosUvw] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sigmaPosUvw(sigmaPosUvw: JsonField<List<Double>>) = apply {
            this.sigmaPosUvw = sigmaPosUvw.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.sigmaPosUvw].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSigmaPosUvw(sigmaPosUvw: Double) = apply {
            this.sigmaPosUvw =
                (this.sigmaPosUvw ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sigmaPosUvw", it).add(sigmaPosUvw)
                }
        }

        /**
         * Array containing the standard deviation of error in target object velocity, U, V and W
         * direction respectively (km/sec).
         */
        fun sigmaVelUvw(sigmaVelUvw: List<Double>) = sigmaVelUvw(JsonField.of(sigmaVelUvw))

        /**
         * Sets [Builder.sigmaVelUvw] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sigmaVelUvw] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sigmaVelUvw(sigmaVelUvw: JsonField<List<Double>>) = apply {
            this.sigmaVelUvw = sigmaVelUvw.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.sigmaVelUvw].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSigmaVelUvw(sigmaVelUvw: Double) = apply {
            this.sigmaVelUvw =
                (this.sigmaVelUvw ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sigmaVelUvw", it).add(sigmaVelUvw)
                }
        }

        /** Average solar flux geomagnetic index. */
        fun solarFluxApAvg(solarFluxApAvg: Double) = solarFluxApAvg(JsonField.of(solarFluxApAvg))

        /**
         * Sets [Builder.solarFluxApAvg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solarFluxApAvg] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun solarFluxApAvg(solarFluxApAvg: JsonField<Double>) = apply {
            this.solarFluxApAvg = solarFluxApAvg
        }

        /** F10 (10.7 cm) solar flux value. */
        fun solarFluxF10(solarFluxF10: Double) = solarFluxF10(JsonField.of(solarFluxF10))

        /**
         * Sets [Builder.solarFluxF10] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solarFluxF10] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun solarFluxF10(solarFluxF10: JsonField<Double>) = apply {
            this.solarFluxF10 = solarFluxF10
        }

        /** F10 (10.7 cm) solar flux 81-day average value. */
        fun solarFluxF10Avg(solarFluxF10Avg: Double) =
            solarFluxF10Avg(JsonField.of(solarFluxF10Avg))

        /**
         * Sets [Builder.solarFluxF10Avg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solarFluxF10Avg] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun solarFluxF10Avg(solarFluxF10Avg: JsonField<Double>) = apply {
            this.solarFluxF10Avg = solarFluxF10Avg
        }

        /** Boolean indicating use of solar radiation pressure perturbations for this vector. */
        fun solarRadPress(solarRadPress: Boolean) = solarRadPress(JsonField.of(solarRadPress))

        /**
         * Sets [Builder.solarRadPress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solarRadPress] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun solarRadPress(solarRadPress: JsonField<Boolean>) = apply {
            this.solarRadPress = solarRadPress
        }

        /** Area-to-mass ratio coefficient for solar radiation pressure. */
        fun solarRadPressCoeff(solarRadPressCoeff: Double) =
            solarRadPressCoeff(JsonField.of(solarRadPressCoeff))

        /**
         * Sets [Builder.solarRadPressCoeff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solarRadPressCoeff] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun solarRadPressCoeff(solarRadPressCoeff: JsonField<Double>) = apply {
            this.solarRadPressCoeff = solarRadPressCoeff
        }

        /** Boolean indicating use of solid earth tide perturbations for this vector. */
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

        /**
         * Optional array of UDL data (observation) UUIDs used to build this state vector. See the
         * associated sourcedDataTypes array for the specific types of observations for the
         * positionally corresponding UUIDs in this array (the two arrays must match in size).
         */
        fun sourcedData(sourcedData: List<String>) = sourcedData(JsonField.of(sourcedData))

        /**
         * Sets [Builder.sourcedData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourcedData] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourcedData(sourcedData: JsonField<List<String>>) = apply {
            this.sourcedData = sourcedData.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.sourcedData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSourcedData(sourcedData: String) = apply {
            this.sourcedData =
                (this.sourcedData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sourcedData", it).add(sourcedData)
                }
        }

        /**
         * Optional array of UDL observation data types used to build this state vector (e.g. EO,
         * RADAR, RF, DOA). See the associated sourcedData array for the specific UUIDs of
         * observations for the positionally corresponding data types in this array (the two arrays
         * must match in size).
         */
        fun sourcedDataTypes(sourcedDataTypes: List<SourcedDataType>) =
            sourcedDataTypes(JsonField.of(sourcedDataTypes))

        /**
         * Sets [Builder.sourcedDataTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourcedDataTypes] with a well-typed
         * `List<SourcedDataType>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun sourcedDataTypes(sourcedDataTypes: JsonField<List<SourcedDataType>>) = apply {
            this.sourcedDataTypes = sourcedDataTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [SourcedDataType] to [sourcedDataTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSourcedDataType(sourcedDataType: SourcedDataType) = apply {
            sourcedDataTypes =
                (sourcedDataTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sourcedDataTypes", it).add(sourcedDataType)
                }
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
         * The effective area of the object exposed to solar radiation pressure, expressed in
         * meters^2.
         */
        fun srpArea(srpArea: Double) = srpArea(JsonField.of(srpArea))

        /**
         * Sets [Builder.srpArea] to an arbitrary JSON value.
         *
         * You should usually call [Builder.srpArea] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun srpArea(srpArea: JsonField<Double>) = apply { this.srpArea = srpArea }

        /** Integrator step mode (AUTO, TIME, or S). */
        fun stepMode(stepMode: String) = stepMode(JsonField.of(stepMode))

        /**
         * Sets [Builder.stepMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stepMode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stepMode(stepMode: JsonField<String>) = apply { this.stepMode = stepMode }

        /** Initial integration step size (seconds). */
        fun stepSize(stepSize: Double) = stepSize(JsonField.of(stepSize))

        /**
         * Sets [Builder.stepSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stepSize] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stepSize(stepSize: JsonField<Double>) = apply { this.stepSize = stepSize }

        /** Initial step size selection (AUTO or MANUAL). */
        fun stepSizeSelection(stepSizeSelection: String) =
            stepSizeSelection(JsonField.of(stepSizeSelection))

        /**
         * Sets [Builder.stepSizeSelection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stepSizeSelection] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stepSizeSelection(stepSizeSelection: JsonField<String>) = apply {
            this.stepSizeSelection = stepSizeSelection
        }

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

        /**
         * TAI (Temps Atomique International) minus UTC (Universal Time Coordinates) offset in
         * seconds.
         */
        fun taiUtc(taiUtc: Double) = taiUtc(JsonField.of(taiUtc))

        /**
         * Sets [Builder.taiUtc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taiUtc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taiUtc(taiUtc: JsonField<Double>) = apply { this.taiUtc = taiUtc }

        /** Model parameter value for thrust acceleration (m/s2). */
        fun thrustAccel(thrustAccel: Double) = thrustAccel(JsonField.of(thrustAccel))

        /**
         * Sets [Builder.thrustAccel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thrustAccel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun thrustAccel(thrustAccel: JsonField<Double>) = apply { this.thrustAccel = thrustAccel }

        /** The number of sensor tracks available for the OD of the object. */
        fun tracksAvail(tracksAvail: Int) = tracksAvail(JsonField.of(tracksAvail))

        /**
         * Sets [Builder.tracksAvail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracksAvail] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tracksAvail(tracksAvail: JsonField<Int>) = apply { this.tracksAvail = tracksAvail }

        /** The number of sensor tracks accepted for the OD of the object. */
        fun tracksUsed(tracksUsed: Int) = tracksUsed(JsonField.of(tracksUsed))

        /**
         * Sets [Builder.tracksUsed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracksUsed] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tracksUsed(tracksUsed: JsonField<Int>) = apply { this.tracksUsed = tracksUsed }

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
         * Boolean indicating this state vector was unable to be correlated to a known object. This
         * flag should only be set to true by data providers after an attempt to correlate to an
         * OnOrbit object was made and failed. If unable to correlate, the 'origObjectId' field may
         * be populated with an internal data provider specific identifier.
         */
        fun uct(uct: Boolean) = uct(JsonField.of(uct))

        /**
         * Sets [Builder.uct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uct] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uct(uct: JsonField<Boolean>) = apply { this.uct = uct }

        /** Rate of change of UT1 (milliseconds/day) - first derivative of ut1Utc. */
        fun ut1Rate(ut1Rate: Double) = ut1Rate(JsonField.of(ut1Rate))

        /**
         * Sets [Builder.ut1Rate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ut1Rate] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ut1Rate(ut1Rate: JsonField<Double>) = apply { this.ut1Rate = ut1Rate }

        /** Universal Time-1 (UT1) minus UTC offset, in seconds. */
        fun ut1Utc(ut1Utc: Double) = ut1Utc(JsonField.of(ut1Utc))

        /**
         * Sets [Builder.ut1Utc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ut1Utc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ut1Utc(ut1Utc: JsonField<Double>) = apply { this.ut1Utc = ut1Utc }

        /** One sigma velocity uncertainty, in kilometers/second. */
        fun velUnc(velUnc: Double) = velUnc(JsonField.of(velUnc))

        /**
         * Sets [Builder.velUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.velUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun velUnc(velUnc: JsonField<Double>) = apply { this.velUnc = velUnc }

        /**
         * Cartesian X acceleration of target, in kilometers/second^2, in the specified
         * referenceFrame. If referenceFrame is null then J2K should be assumed.
         */
        fun xaccel(xaccel: Double) = xaccel(JsonField.of(xaccel))

        /**
         * Sets [Builder.xaccel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xaccel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun xaccel(xaccel: JsonField<Double>) = apply { this.xaccel = xaccel }

        /**
         * Cartesian X position of the target, in kilometers, in the specified referenceFrame. If
         * referenceFrame is null then J2K should be assumed.
         */
        fun xpos(xpos: Double) = xpos(JsonField.of(xpos))

        /**
         * Sets [Builder.xpos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xpos] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun xpos(xpos: JsonField<Double>) = apply { this.xpos = xpos }

        /**
         * Cartesian X position of the target, in kilometers, in the specified alt1ReferenceFrame.
         * Alternate reference frames are optional and are intended to allow a data source to
         * provide an equivalent vector in a different cartesian frame than the primary vector.
         */
        fun xposAlt1(xposAlt1: Double) = xposAlt1(JsonField.of(xposAlt1))

        /**
         * Sets [Builder.xposAlt1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xposAlt1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun xposAlt1(xposAlt1: JsonField<Double>) = apply { this.xposAlt1 = xposAlt1 }

        /**
         * Cartesian X position of the target, in kilometers, in the specified alt2ReferenceFrame.
         * Alternate reference frames are optional and are intended to allow a data source to
         * provide an equivalent vector in a different cartesian frame than the primary vector.
         */
        fun xposAlt2(xposAlt2: Double) = xposAlt2(JsonField.of(xposAlt2))

        /**
         * Sets [Builder.xposAlt2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xposAlt2] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun xposAlt2(xposAlt2: JsonField<Double>) = apply { this.xposAlt2 = xposAlt2 }

        /**
         * Cartesian X velocity of target, in kilometers/second, in the specified referenceFrame. If
         * referenceFrame is null then J2K should be assumed.
         */
        fun xvel(xvel: Double) = xvel(JsonField.of(xvel))

        /**
         * Sets [Builder.xvel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xvel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun xvel(xvel: JsonField<Double>) = apply { this.xvel = xvel }

        /**
         * Cartesian X velocity of the target, in kilometers/second, in the specified
         * alt1ReferenceFrame. Alternate reference frames are optional and are intended to allow a
         * data source to provide an equivalent vector in a different cartesian frame than the
         * primary vector.
         */
        fun xvelAlt1(xvelAlt1: Double) = xvelAlt1(JsonField.of(xvelAlt1))

        /**
         * Sets [Builder.xvelAlt1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xvelAlt1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun xvelAlt1(xvelAlt1: JsonField<Double>) = apply { this.xvelAlt1 = xvelAlt1 }

        /**
         * Cartesian X velocity of the target, in kilometers/second, in the specified
         * alt2ReferenceFrame. Alternate reference frames are optional and are intended to allow a
         * data source to provide an equivalent vector in a different cartesian frame than the
         * primary vector.
         */
        fun xvelAlt2(xvelAlt2: Double) = xvelAlt2(JsonField.of(xvelAlt2))

        /**
         * Sets [Builder.xvelAlt2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xvelAlt2] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun xvelAlt2(xvelAlt2: JsonField<Double>) = apply { this.xvelAlt2 = xvelAlt2 }

        /**
         * Cartesian Y acceleration of target, in kilometers/second^2, in the specified
         * referenceFrame. If referenceFrame is null then J2K should be assumed.
         */
        fun yaccel(yaccel: Double) = yaccel(JsonField.of(yaccel))

        /**
         * Sets [Builder.yaccel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yaccel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yaccel(yaccel: JsonField<Double>) = apply { this.yaccel = yaccel }

        /**
         * Cartesian Y position of the target, in kilometers, in the specified referenceFrame. If
         * referenceFrame is null then J2K should be assumed.
         */
        fun ypos(ypos: Double) = ypos(JsonField.of(ypos))

        /**
         * Sets [Builder.ypos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ypos] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ypos(ypos: JsonField<Double>) = apply { this.ypos = ypos }

        /**
         * Cartesian Y position of the target, in kilometers, in the specified alt1ReferenceFrame.
         * Alternate reference frames are optional and are intended to allow a data source to
         * provide an equivalent vector in a different cartesian frame than the primary vector.
         */
        fun yposAlt1(yposAlt1: Double) = yposAlt1(JsonField.of(yposAlt1))

        /**
         * Sets [Builder.yposAlt1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yposAlt1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yposAlt1(yposAlt1: JsonField<Double>) = apply { this.yposAlt1 = yposAlt1 }

        /**
         * Cartesian Y position of the target, in kilometers, in the specified alt2ReferenceFrame.
         * Alternate reference frames are optional and are intended to allow a data source to
         * provide an equivalent vector in a different cartesian frame than the primary vector.
         */
        fun yposAlt2(yposAlt2: Double) = yposAlt2(JsonField.of(yposAlt2))

        /**
         * Sets [Builder.yposAlt2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yposAlt2] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yposAlt2(yposAlt2: JsonField<Double>) = apply { this.yposAlt2 = yposAlt2 }

        /**
         * Cartesian Y velocity of target, in kilometers/second, in the specified referenceFrame. If
         * referenceFrame is null then J2K should be assumed.
         */
        fun yvel(yvel: Double) = yvel(JsonField.of(yvel))

        /**
         * Sets [Builder.yvel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yvel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yvel(yvel: JsonField<Double>) = apply { this.yvel = yvel }

        /**
         * Cartesian Y velocity of the target, in kilometers/second, in the specified
         * alt1ReferenceFrame. Alternate reference frames are optional and are intended to allow a
         * data source to provide an equivalent vector in a different cartesian frame than the
         * primary vector.
         */
        fun yvelAlt1(yvelAlt1: Double) = yvelAlt1(JsonField.of(yvelAlt1))

        /**
         * Sets [Builder.yvelAlt1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yvelAlt1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yvelAlt1(yvelAlt1: JsonField<Double>) = apply { this.yvelAlt1 = yvelAlt1 }

        /**
         * Cartesian Y velocity of the target, in kilometers/second, in the specified
         * alt2ReferenceFrame. Alternate reference frames are optional and are intended to allow a
         * data source to provide an equivalent vector in a different cartesian frame than the
         * primary vector.
         */
        fun yvelAlt2(yvelAlt2: Double) = yvelAlt2(JsonField.of(yvelAlt2))

        /**
         * Sets [Builder.yvelAlt2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yvelAlt2] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yvelAlt2(yvelAlt2: JsonField<Double>) = apply { this.yvelAlt2 = yvelAlt2 }

        /**
         * Cartesian Z acceleration of target, in kilometers/second^2, in the specified
         * referenceFrame. If referenceFrame is null then J2K should be assumed.
         */
        fun zaccel(zaccel: Double) = zaccel(JsonField.of(zaccel))

        /**
         * Sets [Builder.zaccel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zaccel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zaccel(zaccel: JsonField<Double>) = apply { this.zaccel = zaccel }

        /**
         * Cartesian Z position of the target, in kilometers, in the specified referenceFrame. If
         * referenceFrame is null then J2K should be assumed.
         */
        fun zpos(zpos: Double) = zpos(JsonField.of(zpos))

        /**
         * Sets [Builder.zpos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zpos] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zpos(zpos: JsonField<Double>) = apply { this.zpos = zpos }

        /**
         * Cartesian Z position of the target, in kilometers, in the specified alt1ReferenceFrame.
         * Alternate reference frames are optional and are intended to allow a data source to
         * provide an equivalent vector in a different cartesian frame than the primary vector.
         */
        fun zposAlt1(zposAlt1: Double) = zposAlt1(JsonField.of(zposAlt1))

        /**
         * Sets [Builder.zposAlt1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zposAlt1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zposAlt1(zposAlt1: JsonField<Double>) = apply { this.zposAlt1 = zposAlt1 }

        /**
         * Cartesian Z position of the target, in kilometers, in the specified alt2ReferenceFrame.
         * Alternate reference frames are optional and are intended to allow a data source to
         * provide an equivalent vector in a different cartesian frame than the primary vector.
         */
        fun zposAlt2(zposAlt2: Double) = zposAlt2(JsonField.of(zposAlt2))

        /**
         * Sets [Builder.zposAlt2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zposAlt2] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zposAlt2(zposAlt2: JsonField<Double>) = apply { this.zposAlt2 = zposAlt2 }

        /**
         * Cartesian Z velocity of target, in kilometers/second, in the specified referenceFrame. If
         * referenceFrame is null then J2K should be assumed.
         */
        fun zvel(zvel: Double) = zvel(JsonField.of(zvel))

        /**
         * Sets [Builder.zvel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zvel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zvel(zvel: JsonField<Double>) = apply { this.zvel = zvel }

        /**
         * Cartesian Z velocity of the target, in kilometers/second, in the specified
         * alt1ReferenceFrame. Alternate reference frames are optional and are intended to allow a
         * data source to provide an equivalent vector in a different cartesian frame than the
         * primary vector.
         */
        fun zvelAlt1(zvelAlt1: Double) = zvelAlt1(JsonField.of(zvelAlt1))

        /**
         * Sets [Builder.zvelAlt1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zvelAlt1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zvelAlt1(zvelAlt1: JsonField<Double>) = apply { this.zvelAlt1 = zvelAlt1 }

        /**
         * Cartesian Z velocity of the target, in kilometers/second, in the specified
         * alt2ReferenceFrame. Alternate reference frames are optional and are intended to allow a
         * data source to provide an equivalent vector in a different cartesian frame than the
         * primary vector.
         */
        fun zvelAlt2(zvelAlt2: Double) = zvelAlt2(JsonField.of(zvelAlt2))

        /**
         * Sets [Builder.zvelAlt2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zvelAlt2] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zvelAlt2(zvelAlt2: JsonField<Double>) = apply { this.zvelAlt2 = zvelAlt2 }

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
         * Returns an immutable instance of [StateVectorFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .epoch()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StateVectorFull =
            StateVectorFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("epoch", epoch),
                checkRequired("source", source),
                actualOdSpan,
                algorithm,
                alt1ReferenceFrame,
                alt2ReferenceFrame,
                area,
                bDot,
                cmOffset,
                (cov ?: JsonMissing.of()).map { it.toImmutable() },
                covMethod,
                covReferenceFrame,
                createdAt,
                createdBy,
                descriptor,
                dragArea,
                dragCoeff,
                dragModel,
                edr,
                effectiveFrom,
                effectiveUntil,
                (eqCov ?: JsonMissing.of()).map { it.toImmutable() },
                errorControl,
                fixedStep,
                geopotentialModel,
                iau1980Terms,
                idOnOrbit,
                idOrbitDetermination,
                idStateVector,
                integratorMode,
                inTrackThrust,
                lastObEnd,
                lastObStart,
                leapSecondTime,
                lunarSolar,
                mass,
                msgTs,
                obsAvailable,
                obsUsed,
                onOrbit,
                origin,
                origNetwork,
                origObjectId,
                partials,
                pedigree,
                polarMotionX,
                polarMotionY,
                posUnc,
                rawFileUri,
                recOdSpan,
                referenceFrame,
                residualsAcc,
                revNo,
                rms,
                satNo,
                (sigmaPosUvw ?: JsonMissing.of()).map { it.toImmutable() },
                (sigmaVelUvw ?: JsonMissing.of()).map { it.toImmutable() },
                solarFluxApAvg,
                solarFluxF10,
                solarFluxF10Avg,
                solarRadPress,
                solarRadPressCoeff,
                solidEarthTides,
                (sourcedData ?: JsonMissing.of()).map { it.toImmutable() },
                (sourcedDataTypes ?: JsonMissing.of()).map { it.toImmutable() },
                sourceDl,
                srpArea,
                stepMode,
                stepSize,
                stepSizeSelection,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                taiUtc,
                thrustAccel,
                tracksAvail,
                tracksUsed,
                transactionId,
                uct,
                ut1Rate,
                ut1Utc,
                velUnc,
                xaccel,
                xpos,
                xposAlt1,
                xposAlt2,
                xvel,
                xvelAlt1,
                xvelAlt2,
                yaccel,
                ypos,
                yposAlt1,
                yposAlt2,
                yvel,
                yvelAlt1,
                yvelAlt2,
                zaccel,
                zpos,
                zposAlt1,
                zposAlt2,
                zvel,
                zvelAlt1,
                zvelAlt2,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StateVectorFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        epoch()
        source()
        actualOdSpan()
        algorithm()
        alt1ReferenceFrame()
        alt2ReferenceFrame()
        area()
        bDot()
        cmOffset()
        cov()
        covMethod()
        covReferenceFrame().ifPresent { it.validate() }
        createdAt()
        createdBy()
        descriptor()
        dragArea()
        dragCoeff()
        dragModel()
        edr()
        effectiveFrom()
        effectiveUntil()
        eqCov()
        errorControl()
        fixedStep()
        geopotentialModel()
        iau1980Terms()
        idOnOrbit()
        idOrbitDetermination()
        idStateVector()
        integratorMode()
        inTrackThrust()
        lastObEnd()
        lastObStart()
        leapSecondTime()
        lunarSolar()
        mass()
        msgTs()
        obsAvailable()
        obsUsed()
        onOrbit().ifPresent { it.validate() }
        origin()
        origNetwork()
        origObjectId()
        partials()
        pedigree()
        polarMotionX()
        polarMotionY()
        posUnc()
        rawFileUri()
        recOdSpan()
        referenceFrame().ifPresent { it.validate() }
        residualsAcc()
        revNo()
        rms()
        satNo()
        sigmaPosUvw()
        sigmaVelUvw()
        solarFluxApAvg()
        solarFluxF10()
        solarFluxF10Avg()
        solarRadPress()
        solarRadPressCoeff()
        solidEarthTides()
        sourcedData()
        sourcedDataTypes().ifPresent { it.forEach { it.validate() } }
        sourceDl()
        srpArea()
        stepMode()
        stepSize()
        stepSizeSelection()
        tags()
        taiUtc()
        thrustAccel()
        tracksAvail()
        tracksUsed()
        transactionId()
        uct()
        ut1Rate()
        ut1Utc()
        velUnc()
        xaccel()
        xpos()
        xposAlt1()
        xposAlt2()
        xvel()
        xvelAlt1()
        xvelAlt2()
        yaccel()
        ypos()
        yposAlt1()
        yposAlt2()
        yvel()
        yvelAlt1()
        yvelAlt2()
        zaccel()
        zpos()
        zposAlt1()
        zposAlt2()
        zvel()
        zvelAlt1()
        zvelAlt2()
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
            (if (epoch.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (actualOdSpan.asKnown().isPresent) 1 else 0) +
            (if (algorithm.asKnown().isPresent) 1 else 0) +
            (if (alt1ReferenceFrame.asKnown().isPresent) 1 else 0) +
            (if (alt2ReferenceFrame.asKnown().isPresent) 1 else 0) +
            (if (area.asKnown().isPresent) 1 else 0) +
            (if (bDot.asKnown().isPresent) 1 else 0) +
            (if (cmOffset.asKnown().isPresent) 1 else 0) +
            (cov.asKnown().getOrNull()?.size ?: 0) +
            (if (covMethod.asKnown().isPresent) 1 else 0) +
            (covReferenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (descriptor.asKnown().isPresent) 1 else 0) +
            (if (dragArea.asKnown().isPresent) 1 else 0) +
            (if (dragCoeff.asKnown().isPresent) 1 else 0) +
            (if (dragModel.asKnown().isPresent) 1 else 0) +
            (if (edr.asKnown().isPresent) 1 else 0) +
            (if (effectiveFrom.asKnown().isPresent) 1 else 0) +
            (if (effectiveUntil.asKnown().isPresent) 1 else 0) +
            (eqCov.asKnown().getOrNull()?.size ?: 0) +
            (if (errorControl.asKnown().isPresent) 1 else 0) +
            (if (fixedStep.asKnown().isPresent) 1 else 0) +
            (if (geopotentialModel.asKnown().isPresent) 1 else 0) +
            (if (iau1980Terms.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idOrbitDetermination.asKnown().isPresent) 1 else 0) +
            (if (idStateVector.asKnown().isPresent) 1 else 0) +
            (if (integratorMode.asKnown().isPresent) 1 else 0) +
            (if (inTrackThrust.asKnown().isPresent) 1 else 0) +
            (if (lastObEnd.asKnown().isPresent) 1 else 0) +
            (if (lastObStart.asKnown().isPresent) 1 else 0) +
            (if (leapSecondTime.asKnown().isPresent) 1 else 0) +
            (if (lunarSolar.asKnown().isPresent) 1 else 0) +
            (if (mass.asKnown().isPresent) 1 else 0) +
            (if (msgTs.asKnown().isPresent) 1 else 0) +
            (if (obsAvailable.asKnown().isPresent) 1 else 0) +
            (if (obsUsed.asKnown().isPresent) 1 else 0) +
            (onOrbit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (partials.asKnown().isPresent) 1 else 0) +
            (if (pedigree.asKnown().isPresent) 1 else 0) +
            (if (polarMotionX.asKnown().isPresent) 1 else 0) +
            (if (polarMotionY.asKnown().isPresent) 1 else 0) +
            (if (posUnc.asKnown().isPresent) 1 else 0) +
            (if (rawFileUri.asKnown().isPresent) 1 else 0) +
            (if (recOdSpan.asKnown().isPresent) 1 else 0) +
            (referenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
            (if (residualsAcc.asKnown().isPresent) 1 else 0) +
            (if (revNo.asKnown().isPresent) 1 else 0) +
            (if (rms.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (sigmaPosUvw.asKnown().getOrNull()?.size ?: 0) +
            (sigmaVelUvw.asKnown().getOrNull()?.size ?: 0) +
            (if (solarFluxApAvg.asKnown().isPresent) 1 else 0) +
            (if (solarFluxF10.asKnown().isPresent) 1 else 0) +
            (if (solarFluxF10Avg.asKnown().isPresent) 1 else 0) +
            (if (solarRadPress.asKnown().isPresent) 1 else 0) +
            (if (solarRadPressCoeff.asKnown().isPresent) 1 else 0) +
            (if (solidEarthTides.asKnown().isPresent) 1 else 0) +
            (sourcedData.asKnown().getOrNull()?.size ?: 0) +
            (sourcedDataTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (srpArea.asKnown().isPresent) 1 else 0) +
            (if (stepMode.asKnown().isPresent) 1 else 0) +
            (if (stepSize.asKnown().isPresent) 1 else 0) +
            (if (stepSizeSelection.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (taiUtc.asKnown().isPresent) 1 else 0) +
            (if (thrustAccel.asKnown().isPresent) 1 else 0) +
            (if (tracksAvail.asKnown().isPresent) 1 else 0) +
            (if (tracksUsed.asKnown().isPresent) 1 else 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (uct.asKnown().isPresent) 1 else 0) +
            (if (ut1Rate.asKnown().isPresent) 1 else 0) +
            (if (ut1Utc.asKnown().isPresent) 1 else 0) +
            (if (velUnc.asKnown().isPresent) 1 else 0) +
            (if (xaccel.asKnown().isPresent) 1 else 0) +
            (if (xpos.asKnown().isPresent) 1 else 0) +
            (if (xposAlt1.asKnown().isPresent) 1 else 0) +
            (if (xposAlt2.asKnown().isPresent) 1 else 0) +
            (if (xvel.asKnown().isPresent) 1 else 0) +
            (if (xvelAlt1.asKnown().isPresent) 1 else 0) +
            (if (xvelAlt2.asKnown().isPresent) 1 else 0) +
            (if (yaccel.asKnown().isPresent) 1 else 0) +
            (if (ypos.asKnown().isPresent) 1 else 0) +
            (if (yposAlt1.asKnown().isPresent) 1 else 0) +
            (if (yposAlt2.asKnown().isPresent) 1 else 0) +
            (if (yvel.asKnown().isPresent) 1 else 0) +
            (if (yvelAlt1.asKnown().isPresent) 1 else 0) +
            (if (yvelAlt2.asKnown().isPresent) 1 else 0) +
            (if (zaccel.asKnown().isPresent) 1 else 0) +
            (if (zpos.asKnown().isPresent) 1 else 0) +
            (if (zposAlt1.asKnown().isPresent) 1 else 0) +
            (if (zposAlt2.asKnown().isPresent) 1 else 0) +
            (if (zvel.asKnown().isPresent) 1 else 0) +
            (if (zvelAlt1.asKnown().isPresent) 1 else 0) +
            (if (zvelAlt2.asKnown().isPresent) 1 else 0)

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

    class SourcedDataType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val EO = of("EO")

            @JvmField val RADAR = of("RADAR")

            @JvmField val RF = of("RF")

            @JvmField val DOA = of("DOA")

            @JvmField val ELSET = of("ELSET")

            @JvmField val SV = of("SV")

            @JvmStatic fun of(value: String) = SourcedDataType(JsonField.of(value))
        }

        /** An enum containing [SourcedDataType]'s known values. */
        enum class Known {
            EO,
            RADAR,
            RF,
            DOA,
            ELSET,
            SV,
        }

        /**
         * An enum containing [SourcedDataType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourcedDataType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EO,
            RADAR,
            RF,
            DOA,
            ELSET,
            SV,
            /**
             * An enum member indicating that [SourcedDataType] was instantiated with an unknown
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
                EO -> Value.EO
                RADAR -> Value.RADAR
                RF -> Value.RF
                DOA -> Value.DOA
                ELSET -> Value.ELSET
                SV -> Value.SV
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
                EO -> Known.EO
                RADAR -> Known.RADAR
                RF -> Known.RF
                DOA -> Known.DOA
                ELSET -> Known.ELSET
                SV -> Known.SV
                else ->
                    throw UnifieddatalibraryInvalidDataException("Unknown SourcedDataType: $value")
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

        fun validate(): SourcedDataType = apply {
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

            return other is SourcedDataType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StateVectorFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            epoch == other.epoch &&
            source == other.source &&
            actualOdSpan == other.actualOdSpan &&
            algorithm == other.algorithm &&
            alt1ReferenceFrame == other.alt1ReferenceFrame &&
            alt2ReferenceFrame == other.alt2ReferenceFrame &&
            area == other.area &&
            bDot == other.bDot &&
            cmOffset == other.cmOffset &&
            cov == other.cov &&
            covMethod == other.covMethod &&
            covReferenceFrame == other.covReferenceFrame &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            descriptor == other.descriptor &&
            dragArea == other.dragArea &&
            dragCoeff == other.dragCoeff &&
            dragModel == other.dragModel &&
            edr == other.edr &&
            effectiveFrom == other.effectiveFrom &&
            effectiveUntil == other.effectiveUntil &&
            eqCov == other.eqCov &&
            errorControl == other.errorControl &&
            fixedStep == other.fixedStep &&
            geopotentialModel == other.geopotentialModel &&
            iau1980Terms == other.iau1980Terms &&
            idOnOrbit == other.idOnOrbit &&
            idOrbitDetermination == other.idOrbitDetermination &&
            idStateVector == other.idStateVector &&
            integratorMode == other.integratorMode &&
            inTrackThrust == other.inTrackThrust &&
            lastObEnd == other.lastObEnd &&
            lastObStart == other.lastObStart &&
            leapSecondTime == other.leapSecondTime &&
            lunarSolar == other.lunarSolar &&
            mass == other.mass &&
            msgTs == other.msgTs &&
            obsAvailable == other.obsAvailable &&
            obsUsed == other.obsUsed &&
            onOrbit == other.onOrbit &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            partials == other.partials &&
            pedigree == other.pedigree &&
            polarMotionX == other.polarMotionX &&
            polarMotionY == other.polarMotionY &&
            posUnc == other.posUnc &&
            rawFileUri == other.rawFileUri &&
            recOdSpan == other.recOdSpan &&
            referenceFrame == other.referenceFrame &&
            residualsAcc == other.residualsAcc &&
            revNo == other.revNo &&
            rms == other.rms &&
            satNo == other.satNo &&
            sigmaPosUvw == other.sigmaPosUvw &&
            sigmaVelUvw == other.sigmaVelUvw &&
            solarFluxApAvg == other.solarFluxApAvg &&
            solarFluxF10 == other.solarFluxF10 &&
            solarFluxF10Avg == other.solarFluxF10Avg &&
            solarRadPress == other.solarRadPress &&
            solarRadPressCoeff == other.solarRadPressCoeff &&
            solidEarthTides == other.solidEarthTides &&
            sourcedData == other.sourcedData &&
            sourcedDataTypes == other.sourcedDataTypes &&
            sourceDl == other.sourceDl &&
            srpArea == other.srpArea &&
            stepMode == other.stepMode &&
            stepSize == other.stepSize &&
            stepSizeSelection == other.stepSizeSelection &&
            tags == other.tags &&
            taiUtc == other.taiUtc &&
            thrustAccel == other.thrustAccel &&
            tracksAvail == other.tracksAvail &&
            tracksUsed == other.tracksUsed &&
            transactionId == other.transactionId &&
            uct == other.uct &&
            ut1Rate == other.ut1Rate &&
            ut1Utc == other.ut1Utc &&
            velUnc == other.velUnc &&
            xaccel == other.xaccel &&
            xpos == other.xpos &&
            xposAlt1 == other.xposAlt1 &&
            xposAlt2 == other.xposAlt2 &&
            xvel == other.xvel &&
            xvelAlt1 == other.xvelAlt1 &&
            xvelAlt2 == other.xvelAlt2 &&
            yaccel == other.yaccel &&
            ypos == other.ypos &&
            yposAlt1 == other.yposAlt1 &&
            yposAlt2 == other.yposAlt2 &&
            yvel == other.yvel &&
            yvelAlt1 == other.yvelAlt1 &&
            yvelAlt2 == other.yvelAlt2 &&
            zaccel == other.zaccel &&
            zpos == other.zpos &&
            zposAlt1 == other.zposAlt1 &&
            zposAlt2 == other.zposAlt2 &&
            zvel == other.zvel &&
            zvelAlt1 == other.zvelAlt1 &&
            zvelAlt2 == other.zvelAlt2 &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            epoch,
            source,
            actualOdSpan,
            algorithm,
            alt1ReferenceFrame,
            alt2ReferenceFrame,
            area,
            bDot,
            cmOffset,
            cov,
            covMethod,
            covReferenceFrame,
            createdAt,
            createdBy,
            descriptor,
            dragArea,
            dragCoeff,
            dragModel,
            edr,
            effectiveFrom,
            effectiveUntil,
            eqCov,
            errorControl,
            fixedStep,
            geopotentialModel,
            iau1980Terms,
            idOnOrbit,
            idOrbitDetermination,
            idStateVector,
            integratorMode,
            inTrackThrust,
            lastObEnd,
            lastObStart,
            leapSecondTime,
            lunarSolar,
            mass,
            msgTs,
            obsAvailable,
            obsUsed,
            onOrbit,
            origin,
            origNetwork,
            origObjectId,
            partials,
            pedigree,
            polarMotionX,
            polarMotionY,
            posUnc,
            rawFileUri,
            recOdSpan,
            referenceFrame,
            residualsAcc,
            revNo,
            rms,
            satNo,
            sigmaPosUvw,
            sigmaVelUvw,
            solarFluxApAvg,
            solarFluxF10,
            solarFluxF10Avg,
            solarRadPress,
            solarRadPressCoeff,
            solidEarthTides,
            sourcedData,
            sourcedDataTypes,
            sourceDl,
            srpArea,
            stepMode,
            stepSize,
            stepSizeSelection,
            tags,
            taiUtc,
            thrustAccel,
            tracksAvail,
            tracksUsed,
            transactionId,
            uct,
            ut1Rate,
            ut1Utc,
            velUnc,
            xaccel,
            xpos,
            xposAlt1,
            xposAlt2,
            xvel,
            xvelAlt1,
            xvelAlt2,
            yaccel,
            ypos,
            yposAlt1,
            yposAlt2,
            yvel,
            yvelAlt1,
            yvelAlt2,
            zaccel,
            zpos,
            zposAlt1,
            zposAlt2,
            zvel,
            zvelAlt1,
            zvelAlt2,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StateVectorFull{classificationMarking=$classificationMarking, dataMode=$dataMode, epoch=$epoch, source=$source, actualOdSpan=$actualOdSpan, algorithm=$algorithm, alt1ReferenceFrame=$alt1ReferenceFrame, alt2ReferenceFrame=$alt2ReferenceFrame, area=$area, bDot=$bDot, cmOffset=$cmOffset, cov=$cov, covMethod=$covMethod, covReferenceFrame=$covReferenceFrame, createdAt=$createdAt, createdBy=$createdBy, descriptor=$descriptor, dragArea=$dragArea, dragCoeff=$dragCoeff, dragModel=$dragModel, edr=$edr, effectiveFrom=$effectiveFrom, effectiveUntil=$effectiveUntil, eqCov=$eqCov, errorControl=$errorControl, fixedStep=$fixedStep, geopotentialModel=$geopotentialModel, iau1980Terms=$iau1980Terms, idOnOrbit=$idOnOrbit, idOrbitDetermination=$idOrbitDetermination, idStateVector=$idStateVector, integratorMode=$integratorMode, inTrackThrust=$inTrackThrust, lastObEnd=$lastObEnd, lastObStart=$lastObStart, leapSecondTime=$leapSecondTime, lunarSolar=$lunarSolar, mass=$mass, msgTs=$msgTs, obsAvailable=$obsAvailable, obsUsed=$obsUsed, onOrbit=$onOrbit, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, partials=$partials, pedigree=$pedigree, polarMotionX=$polarMotionX, polarMotionY=$polarMotionY, posUnc=$posUnc, rawFileUri=$rawFileUri, recOdSpan=$recOdSpan, referenceFrame=$referenceFrame, residualsAcc=$residualsAcc, revNo=$revNo, rms=$rms, satNo=$satNo, sigmaPosUvw=$sigmaPosUvw, sigmaVelUvw=$sigmaVelUvw, solarFluxApAvg=$solarFluxApAvg, solarFluxF10=$solarFluxF10, solarFluxF10Avg=$solarFluxF10Avg, solarRadPress=$solarRadPress, solarRadPressCoeff=$solarRadPressCoeff, solidEarthTides=$solidEarthTides, sourcedData=$sourcedData, sourcedDataTypes=$sourcedDataTypes, sourceDl=$sourceDl, srpArea=$srpArea, stepMode=$stepMode, stepSize=$stepSize, stepSizeSelection=$stepSizeSelection, tags=$tags, taiUtc=$taiUtc, thrustAccel=$thrustAccel, tracksAvail=$tracksAvail, tracksUsed=$tracksUsed, transactionId=$transactionId, uct=$uct, ut1Rate=$ut1Rate, ut1Utc=$ut1Utc, velUnc=$velUnc, xaccel=$xaccel, xpos=$xpos, xposAlt1=$xposAlt1, xposAlt2=$xposAlt2, xvel=$xvel, xvelAlt1=$xvelAlt1, xvelAlt2=$xvelAlt2, yaccel=$yaccel, ypos=$ypos, yposAlt1=$yposAlt1, yposAlt2=$yposAlt2, yvel=$yvel, yvelAlt1=$yvelAlt1, yvelAlt2=$yvelAlt2, zaccel=$zaccel, zpos=$zpos, zposAlt1=$zposAlt1, zposAlt2=$zposAlt2, zvel=$zvel, zvelAlt1=$zvelAlt1, zvelAlt2=$zvelAlt2, additionalProperties=$additionalProperties}"
}

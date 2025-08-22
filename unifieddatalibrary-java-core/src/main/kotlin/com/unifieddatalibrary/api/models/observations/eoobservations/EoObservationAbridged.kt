// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.eoobservations

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
 * Model representation of observation data for electro-optical based sensor phenomenologies. ECI
 * J2K is the preferred reference frame for EOObservations, however, several user-specified
 * reference frames are accommodated. Users should check the EOObservation record as well as the
 * 'Discover' tab in the storefront to confirm the coordinate frames used by the data provider.
 */
class EoObservationAbridged
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val obTime: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val azimuth: JsonField<Double>,
    private val azimuthBias: JsonField<Double>,
    private val azimuthMeasured: JsonField<Boolean>,
    private val azimuthRate: JsonField<Double>,
    private val azimuthUnc: JsonField<Double>,
    private val bgIntensity: JsonField<Double>,
    private val collectMethod: JsonField<String>,
    private val corrQuality: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val declination: JsonField<Double>,
    private val declinationBias: JsonField<Double>,
    private val declinationMeasured: JsonField<Boolean>,
    private val declinationRate: JsonField<Double>,
    private val declinationUnc: JsonField<Double>,
    private val descriptor: JsonField<String>,
    private val elevation: JsonField<Double>,
    private val elevationBias: JsonField<Double>,
    private val elevationMeasured: JsonField<Boolean>,
    private val elevationRate: JsonField<Double>,
    private val elevationUnc: JsonField<Double>,
    private val expDuration: JsonField<Double>,
    private val fovCount: JsonField<Int>,
    private val fovCountUct: JsonField<Int>,
    private val geoalt: JsonField<Double>,
    private val geolat: JsonField<Double>,
    private val geolon: JsonField<Double>,
    private val georange: JsonField<Double>,
    private val idOnOrbit: JsonField<String>,
    private val idSensor: JsonField<String>,
    private val idSkyImagery: JsonField<String>,
    private val intensity: JsonField<Double>,
    private val losUnc: JsonField<Double>,
    private val losx: JsonField<Double>,
    private val losxvel: JsonField<Double>,
    private val losy: JsonField<Double>,
    private val losyvel: JsonField<Double>,
    private val losz: JsonField<Double>,
    private val loszvel: JsonField<Double>,
    private val mag: JsonField<Double>,
    private val magNormRange: JsonField<Double>,
    private val magUnc: JsonField<Double>,
    private val netObjSig: JsonField<Double>,
    private val netObjSigUnc: JsonField<Double>,
    private val obPosition: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val penumbra: JsonField<Boolean>,
    private val primaryExtinction: JsonField<Double>,
    private val primaryExtinctionUnc: JsonField<Double>,
    private val ra: JsonField<Double>,
    private val raBias: JsonField<Double>,
    private val raMeasured: JsonField<Boolean>,
    private val range: JsonField<Double>,
    private val rangeBias: JsonField<Double>,
    private val rangeMeasured: JsonField<Boolean>,
    private val rangeRate: JsonField<Double>,
    private val rangeRateMeasured: JsonField<Boolean>,
    private val rangeRateUnc: JsonField<Double>,
    private val rangeUnc: JsonField<Double>,
    private val raRate: JsonField<Double>,
    private val raUnc: JsonField<Double>,
    private val rawFileUri: JsonField<String>,
    private val referenceFrame: JsonField<ReferenceFrame>,
    private val satNo: JsonField<Int>,
    private val senalt: JsonField<Double>,
    private val senlat: JsonField<Double>,
    private val senlon: JsonField<Double>,
    private val senQuat: JsonField<List<Double>>,
    private val senReferenceFrame: JsonField<SenReferenceFrame>,
    private val senvelx: JsonField<Double>,
    private val senvely: JsonField<Double>,
    private val senvelz: JsonField<Double>,
    private val senx: JsonField<Double>,
    private val seny: JsonField<Double>,
    private val senz: JsonField<Double>,
    private val shutterDelay: JsonField<Double>,
    private val skyBkgrnd: JsonField<Double>,
    private val solarDecAngle: JsonField<Double>,
    private val solarEqPhaseAngle: JsonField<Double>,
    private val solarPhaseAngle: JsonField<Double>,
    private val sourceDl: JsonField<String>,
    private val taskId: JsonField<String>,
    private val timingBias: JsonField<Double>,
    private val trackId: JsonField<String>,
    private val transactionId: JsonField<String>,
    private val type: JsonField<String>,
    private val uct: JsonField<Boolean>,
    private val umbra: JsonField<Boolean>,
    private val zeroptd: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("obTime")
        @ExcludeMissing
        obTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("azimuth") @ExcludeMissing azimuth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azimuthBias")
        @ExcludeMissing
        azimuthBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azimuthMeasured")
        @ExcludeMissing
        azimuthMeasured: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("azimuthRate")
        @ExcludeMissing
        azimuthRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azimuthUnc")
        @ExcludeMissing
        azimuthUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bgIntensity")
        @ExcludeMissing
        bgIntensity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("collectMethod")
        @ExcludeMissing
        collectMethod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("corrQuality")
        @ExcludeMissing
        corrQuality: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("declination")
        @ExcludeMissing
        declination: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("declinationBias")
        @ExcludeMissing
        declinationBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("declinationMeasured")
        @ExcludeMissing
        declinationMeasured: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("declinationRate")
        @ExcludeMissing
        declinationRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("declinationUnc")
        @ExcludeMissing
        declinationUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("elevation") @ExcludeMissing elevation: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elevationBias")
        @ExcludeMissing
        elevationBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elevationMeasured")
        @ExcludeMissing
        elevationMeasured: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("elevationRate")
        @ExcludeMissing
        elevationRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elevationUnc")
        @ExcludeMissing
        elevationUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("expDuration")
        @ExcludeMissing
        expDuration: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fovCount") @ExcludeMissing fovCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("fovCountUCT") @ExcludeMissing fovCountUct: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("geoalt") @ExcludeMissing geoalt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("geolat") @ExcludeMissing geolat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("geolon") @ExcludeMissing geolon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("georange") @ExcludeMissing georange: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSkyImagery")
        @ExcludeMissing
        idSkyImagery: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intensity") @ExcludeMissing intensity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("losUnc") @ExcludeMissing losUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("losx") @ExcludeMissing losx: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("losxvel") @ExcludeMissing losxvel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("losy") @ExcludeMissing losy: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("losyvel") @ExcludeMissing losyvel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("losz") @ExcludeMissing losz: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("loszvel") @ExcludeMissing loszvel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("mag") @ExcludeMissing mag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("magNormRange")
        @ExcludeMissing
        magNormRange: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("magUnc") @ExcludeMissing magUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("netObjSig") @ExcludeMissing netObjSig: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("netObjSigUnc")
        @ExcludeMissing
        netObjSigUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("obPosition")
        @ExcludeMissing
        obPosition: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("penumbra") @ExcludeMissing penumbra: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("primaryExtinction")
        @ExcludeMissing
        primaryExtinction: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("primaryExtinctionUnc")
        @ExcludeMissing
        primaryExtinctionUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ra") @ExcludeMissing ra: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("raBias") @ExcludeMissing raBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("raMeasured")
        @ExcludeMissing
        raMeasured: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("range") @ExcludeMissing range: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rangeBias") @ExcludeMissing rangeBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rangeMeasured")
        @ExcludeMissing
        rangeMeasured: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rangeRate") @ExcludeMissing rangeRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rangeRateMeasured")
        @ExcludeMissing
        rangeRateMeasured: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rangeRateUnc")
        @ExcludeMissing
        rangeRateUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rangeUnc") @ExcludeMissing rangeUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("raRate") @ExcludeMissing raRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("raUnc") @ExcludeMissing raUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rawFileURI")
        @ExcludeMissing
        rawFileUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referenceFrame")
        @ExcludeMissing
        referenceFrame: JsonField<ReferenceFrame> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("senalt") @ExcludeMissing senalt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlat") @ExcludeMissing senlat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlon") @ExcludeMissing senlon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senQuat")
        @ExcludeMissing
        senQuat: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("senReferenceFrame")
        @ExcludeMissing
        senReferenceFrame: JsonField<SenReferenceFrame> = JsonMissing.of(),
        @JsonProperty("senvelx") @ExcludeMissing senvelx: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senvely") @ExcludeMissing senvely: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senvelz") @ExcludeMissing senvelz: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senx") @ExcludeMissing senx: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("seny") @ExcludeMissing seny: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senz") @ExcludeMissing senz: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("shutterDelay")
        @ExcludeMissing
        shutterDelay: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("skyBkgrnd") @ExcludeMissing skyBkgrnd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("solarDecAngle")
        @ExcludeMissing
        solarDecAngle: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("solarEqPhaseAngle")
        @ExcludeMissing
        solarEqPhaseAngle: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("solarPhaseAngle")
        @ExcludeMissing
        solarPhaseAngle: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("taskId") @ExcludeMissing taskId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timingBias")
        @ExcludeMissing
        timingBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trackId") @ExcludeMissing trackId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uct") @ExcludeMissing uct: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("umbra") @ExcludeMissing umbra: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("zeroptd") @ExcludeMissing zeroptd: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        obTime,
        source,
        id,
        azimuth,
        azimuthBias,
        azimuthMeasured,
        azimuthRate,
        azimuthUnc,
        bgIntensity,
        collectMethod,
        corrQuality,
        createdAt,
        createdBy,
        declination,
        declinationBias,
        declinationMeasured,
        declinationRate,
        declinationUnc,
        descriptor,
        elevation,
        elevationBias,
        elevationMeasured,
        elevationRate,
        elevationUnc,
        expDuration,
        fovCount,
        fovCountUct,
        geoalt,
        geolat,
        geolon,
        georange,
        idOnOrbit,
        idSensor,
        idSkyImagery,
        intensity,
        losUnc,
        losx,
        losxvel,
        losy,
        losyvel,
        losz,
        loszvel,
        mag,
        magNormRange,
        magUnc,
        netObjSig,
        netObjSigUnc,
        obPosition,
        origin,
        origNetwork,
        origObjectId,
        origSensorId,
        penumbra,
        primaryExtinction,
        primaryExtinctionUnc,
        ra,
        raBias,
        raMeasured,
        range,
        rangeBias,
        rangeMeasured,
        rangeRate,
        rangeRateMeasured,
        rangeRateUnc,
        rangeUnc,
        raRate,
        raUnc,
        rawFileUri,
        referenceFrame,
        satNo,
        senalt,
        senlat,
        senlon,
        senQuat,
        senReferenceFrame,
        senvelx,
        senvely,
        senvelz,
        senx,
        seny,
        senz,
        shutterDelay,
        skyBkgrnd,
        solarDecAngle,
        solarEqPhaseAngle,
        solarPhaseAngle,
        sourceDl,
        taskId,
        timingBias,
        trackId,
        transactionId,
        type,
        uct,
        umbra,
        zeroptd,
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
     * Ob detection time in ISO 8601 UTC, up to microsecond precision. Consumers should contact the
     * provider for details on their obTime specifications.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun obTime(): OffsetDateTime = obTime.getRequired("obTime")

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
     * Line of sight azimuth angle in degrees and topocentric frame. Reported value should include
     * all applicable corrections as specified on the source provider data card. If uncertain,
     * consumers should contact the provider for details on the applied corrections.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azimuth(): Optional<Double> = azimuth.getOptional("azimuth")

    /**
     * Sensor line of sight azimuth angle bias in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azimuthBias(): Optional<Double> = azimuthBias.getOptional("azimuthBias")

    /**
     * Optional flag indicating whether the azimuth value is measured (true) or computed (false). If
     * null, consumers may consult the data provider for information regarding whether the
     * corresponding value is computed or measured.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azimuthMeasured(): Optional<Boolean> = azimuthMeasured.getOptional("azimuthMeasured")

    /**
     * Rate of change of the line of sight azimuth in degrees per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azimuthRate(): Optional<Double> = azimuthRate.getOptional("azimuthRate")

    /**
     * One sigma uncertainty in the line of sight azimuth angle, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azimuthUnc(): Optional<Double> = azimuthUnc.getOptional("azimuthUnc")

    /**
     * Background intensity for IR observations, in kw/sr/um.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bgIntensity(): Optional<Double> = bgIntensity.getOptional("bgIntensity")

    /**
     * Method indicating telescope movement during collection (AUTOTRACK, MANUAL AUTOTRACK, MANUAL
     * RATE TRACK, MANUAL SIDEREAL, SIDEREAL, RATE TRACK).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun collectMethod(): Optional<String> = collectMethod.getOptional("collectMethod")

    /**
     * Object Correlation Quality score of the observation when compared to a known orbit state,
     * (non-standardized). Users should consult data providers regarding the expected range of
     * values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun corrQuality(): Optional<Double> = corrQuality.getOptional("corrQuality")

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
     * Line of sight declination, in degrees, in the specified referenceFrame. If referenceFrame is
     * null then J2K should be assumed. Reported value should include all applicable corrections as
     * specified on the source provider data card. If uncertain, consumers should contact the
     * provider for details on the applied corrections.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun declination(): Optional<Double> = declination.getOptional("declination")

    /**
     * Sensor line of sight declination angle bias in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun declinationBias(): Optional<Double> = declinationBias.getOptional("declinationBias")

    /**
     * Optional flag indicating whether the declination value is measured (true) or computed
     * (false). If null, consumers may consult the data provider for information regarding whether
     * the corresponding value is computed or measured.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun declinationMeasured(): Optional<Boolean> =
        declinationMeasured.getOptional("declinationMeasured")

    /**
     * Line of sight declination rate of change, in degrees/sec, in the specified referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun declinationRate(): Optional<Double> = declinationRate.getOptional("declinationRate")

    /**
     * One sigma uncertainty in the line of sight declination angle, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun declinationUnc(): Optional<Double> = declinationUnc.getOptional("declinationUnc")

    /**
     * Optional source-provided and searchable metadata or descriptor of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun descriptor(): Optional<String> = descriptor.getOptional("descriptor")

    /**
     * Line of sight elevation in degrees and topocentric frame. Reported value should include all
     * applicable corrections as specified on the source provider data card. If uncertain, consumers
     * should contact the provider for details on the applied corrections.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevation(): Optional<Double> = elevation.getOptional("elevation")

    /**
     * Sensor line of sight elevation bias in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevationBias(): Optional<Double> = elevationBias.getOptional("elevationBias")

    /**
     * Optional flag indicating whether the elevation value is measured (true) or computed (false).
     * If null, consumers may consult the data provider for information regarding whether the
     * corresponding value is computed or measured.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevationMeasured(): Optional<Boolean> = elevationMeasured.getOptional("elevationMeasured")

    /**
     * Rate of change of the line of sight elevation in degrees per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevationRate(): Optional<Double> = elevationRate.getOptional("elevationRate")

    /**
     * One sigma uncertainty in the line of sight elevation angle, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevationUnc(): Optional<Double> = elevationUnc.getOptional("elevationUnc")

    /**
     * Image exposure duration in seconds. For observations performed using frame stacking or
     * synthetic tracking methods, the exposure duration should be the total integration time. This
     * field is highly recommended / required if the observations are going to be used for
     * photometric processing.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun expDuration(): Optional<Double> = expDuration.getOptional("expDuration")

    /**
     * The number of RSOs detected in the sensor field of view.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fovCount(): Optional<Int> = fovCount.getOptional("fovCount")

    /**
     * The number of uncorrelated tracks in the field of view.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fovCountUct(): Optional<Int> = fovCountUct.getOptional("fovCountUCT")

    /**
     * For GEO detections, the altitude in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoalt(): Optional<Double> = geoalt.getOptional("geoalt")

    /**
     * For GEO detections, the latitude in degrees north.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geolat(): Optional<Double> = geolat.getOptional("geolat")

    /**
     * For GEO detections, the longitude in degrees east.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geolon(): Optional<Double> = geolon.getOptional("geolon")

    /**
     * For GEO detections, the range in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun georange(): Optional<Double> = georange.getOptional("georange")

    /**
     * Unique identifier of the target on-orbit object, if correlated.
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
     * Unique identifier of the Sky Imagery.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSkyImagery(): Optional<String> = idSkyImagery.getOptional("idSkyImagery")

    /**
     * Intensity of the target for IR observations, in kw/sr/um.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun intensity(): Optional<Double> = intensity.getOptional("intensity")

    /**
     * One sigma uncertainty in the line of sight pointing in micro-radians.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun losUnc(): Optional<Double> = losUnc.getOptional("losUnc")

    /**
     * Line-of-sight cartesian X position of the target, in km, in the specified referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun losx(): Optional<Double> = losx.getOptional("losx")

    /**
     * Line-of-sight cartesian X velocity of target, in km/sec, in the specified referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun losxvel(): Optional<Double> = losxvel.getOptional("losxvel")

    /**
     * Line-of-sight cartesian Y position of the target, in km, in the specified referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun losy(): Optional<Double> = losy.getOptional("losy")

    /**
     * Line-of-sight cartesian Y velocity of target, in km/sec, in the specified referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun losyvel(): Optional<Double> = losyvel.getOptional("losyvel")

    /**
     * Line-of-sight cartesian Z position of the target, in km, in the specified referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun losz(): Optional<Double> = losz.getOptional("losz")

    /**
     * Line-of-sight cartesian Z velocity of target, in km/sec, in the specified referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun loszvel(): Optional<Double> = loszvel.getOptional("loszvel")

    /**
     * Measure of observed brightness calibrated against the Gaia G-band in units of magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mag(): Optional<Double> = mag.getOptional("mag")

    /**
     * Formula: mag - 5.0 \* log_10(geo_range / 1000000.0).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun magNormRange(): Optional<Double> = magNormRange.getOptional("magNormRange")

    /**
     * Uncertainty of the observed brightness in units of magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun magUnc(): Optional<Double> = magUnc.getOptional("magUnc")

    /**
     * Net object signature = counts / expDuration.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun netObjSig(): Optional<Double> = netObjSig.getOptional("netObjSig")

    /**
     * Net object signature uncertainty = counts uncertainty / expDuration.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun netObjSigUnc(): Optional<Double> = netObjSigUnc.getOptional("netObjSigUnc")

    /**
     * The position of this observation within a track (FENCE, FIRST, IN, LAST, SINGLE). This
     * identifier is optional and, if null, no assumption should be made regarding whether other
     * observations may or may not exist to compose a track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun obPosition(): Optional<String> = obPosition.getOptional("obPosition")

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
     * Optional identifier provided by observation source to indicate the target onorbit object of
     * this observation. This may be an internal identifier and not necessarily a valid satellite
     * number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Optional identifier provided by observation source to indicate the sensor identifier which
     * produced this observation. This may be an internal identifier and not necessarily a valid
     * sensor ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

    /**
     * Boolean indicating that the target object was in a penumbral eclipse at the time of this
     * observation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun penumbra(): Optional<Boolean> = penumbra.getOptional("penumbra")

    /**
     * Primary Extinction Coefficient, in Magnitudes. Primary Extinction is the coefficient applied
     * to the airmass to determine how much the observed visual magnitude has been attenuated by the
     * atmosphere. Extinction, in general, describes the absorption and scattering of
     * electromagnetic radiation by dust and gas between an emitting astronomical object and the
     * observer. See the EOObservationDetails API for specification of extinction coefficients for
     * multiple spectral filters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun primaryExtinction(): Optional<Double> = primaryExtinction.getOptional("primaryExtinction")

    /**
     * Primary Extinction Coefficient Uncertainty, in Magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun primaryExtinctionUnc(): Optional<Double> =
        primaryExtinctionUnc.getOptional("primaryExtinctionUnc")

    /**
     * Line of sight right ascension, in degrees, in the specified referenceFrame. If referenceFrame
     * is null then J2K should be assumed. Reported value should include all applicable corrections
     * as specified on the source provider data card. If uncertain, consumers should contact the
     * provider for details on the applied corrections.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ra(): Optional<Double> = ra.getOptional("ra")

    /**
     * Sensor line of sight right ascension bias in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun raBias(): Optional<Double> = raBias.getOptional("raBias")

    /**
     * Optional flag indicating whether the ra value is measured (true) or computed (false). If
     * null, consumers may consult the data provider for information regarding whether the
     * corresponding value is computed or measured.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun raMeasured(): Optional<Boolean> = raMeasured.getOptional("raMeasured")

    /**
     * Line of sight range in km. If referenceFrame is null then J2K should be assumed. Reported
     * value should include all applicable corrections as specified on the source provider data
     * card. If uncertain, consumers should contact the provider for details on the applied
     * corrections.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun range(): Optional<Double> = range.getOptional("range")

    /**
     * Sensor line of sight range bias in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeBias(): Optional<Double> = rangeBias.getOptional("rangeBias")

    /**
     * Optional flag indicating whether the range value is measured (true) or computed (false). If
     * null, consumers may consult the data provider for information regarding whether the
     * corresponding value is computed or measured.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeMeasured(): Optional<Boolean> = rangeMeasured.getOptional("rangeMeasured")

    /**
     * Range rate in km/s. If referenceFrame is null then J2K should be assumed. Reported value
     * should include all applicable corrections as specified on the source provider data card. If
     * uncertain, consumers should contact the provider for details on the applied corrections.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeRate(): Optional<Double> = rangeRate.getOptional("rangeRate")

    /**
     * Optional flag indicating whether the rangeRate value is measured (true) or computed (false).
     * If null, consumers may consult the data provider for information regarding whether the
     * corresponding value is computed or measured.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeRateMeasured(): Optional<Boolean> = rangeRateMeasured.getOptional("rangeRateMeasured")

    /**
     * One sigma uncertainty in the line of sight range rate, in kilometers/second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeRateUnc(): Optional<Double> = rangeRateUnc.getOptional("rangeRateUnc")

    /**
     * One sigma uncertainty in the line of sight range, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeUnc(): Optional<Double> = rangeUnc.getOptional("rangeUnc")

    /**
     * Line of sight right ascension rate of change, in degrees/sec, in the specified
     * referenceFrame. If referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun raRate(): Optional<Double> = raRate.getOptional("raRate")

    /**
     * One sigma uncertainty in the line of sight right ascension angle, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun raUnc(): Optional<Double> = raUnc.getOptional("raUnc")

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
     * The reference frame of the EOObservation measurements. If the referenceFrame is null it is
     * assumed to be J2000.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun referenceFrame(): Optional<ReferenceFrame> = referenceFrame.getOptional("referenceFrame")

    /**
     * Satellite/Catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Sensor altitude at obTime (if mobile/onorbit) in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senalt(): Optional<Double> = senalt.getOptional("senalt")

    /**
     * Sensor WGS84 latitude at obTime (if mobile/onorbit) in degrees. If null, can be obtained from
     * sensor info. -90 to 90 degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senlat(): Optional<Double> = senlat.getOptional("senlat")

    /**
     * Sensor WGS84 longitude at obTime (if mobile/onorbit) in degrees. If null, can be obtained
     * from sensor info. -180 to 180 degrees (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senlon(): Optional<Double> = senlon.getOptional("senlon")

    /**
     * The quaternion describing the rotation of the sensor in relation to the body-fixed frame used
     * for this system into the local geodetic frame, at observation time (obTime). The array
     * element order convention is scalar component first, followed by the three vector components
     * (qc, q1, q2, q3).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senQuat(): Optional<List<Double>> = senQuat.getOptional("senQuat")

    /**
     * The reference frame of the observing sensor state. If the senReferenceFrame is null it is
     * assumed to be J2000.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senReferenceFrame(): Optional<SenReferenceFrame> =
        senReferenceFrame.getOptional("senReferenceFrame")

    /**
     * Cartesian X velocity of the observing mobile/onorbit sensor at obTime, in km/sec, in the
     * specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senvelx(): Optional<Double> = senvelx.getOptional("senvelx")

    /**
     * Cartesian Y velocity of the observing mobile/onorbit sensor at obTime, in km/sec, in the
     * specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senvely(): Optional<Double> = senvely.getOptional("senvely")

    /**
     * Cartesian Z velocity of the observing mobile/onorbit sensor at obTime, in km/sec, in the
     * specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senvelz(): Optional<Double> = senvelz.getOptional("senvelz")

    /**
     * Cartesian X position of the observing mobile/onorbit sensor at obTime, in km, in the
     * specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senx(): Optional<Double> = senx.getOptional("senx")

    /**
     * Cartesian Y position of the observing mobile/onorbit sensor at obTime, in km, in the
     * specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun seny(): Optional<Double> = seny.getOptional("seny")

    /**
     * Cartesian Z position of the observing mobile/onorbit sensor at obTime, in km, in the
     * specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senz(): Optional<Double> = senz.getOptional("senz")

    /**
     * Shutter delay in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shutterDelay(): Optional<Double> = shutterDelay.getOptional("shutterDelay")

    /**
     * Average Sky Background signal, in Magnitudes. Sky Background refers to the incoming light
     * from an apparently empty part of the night sky.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun skyBkgrnd(): Optional<Double> = skyBkgrnd.getOptional("skyBkgrnd")

    /**
     * Angle from the sun to the equatorial plane.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solarDecAngle(): Optional<Double> = solarDecAngle.getOptional("solarDecAngle")

    /**
     * The angle, in degrees, between the projections of the target-to-observer vector and the
     * target-to-sun vector onto the equatorial plane. The angle is represented as negative when
     * closing (i.e. before the opposition) and positive when opening (after the opposition).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solarEqPhaseAngle(): Optional<Double> = solarEqPhaseAngle.getOptional("solarEqPhaseAngle")

    /**
     * The angle, in degrees, between the target-to-observer vector and the target-to-sun vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solarPhaseAngle(): Optional<Double> = solarPhaseAngle.getOptional("solarPhaseAngle")

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
     * Optional identifier to indicate the specific tasking which produced this observation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun taskId(): Optional<String> = taskId.getOptional("taskId")

    /**
     * Sensor timing bias in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun timingBias(): Optional<Double> = timingBias.getOptional("timingBias")

    /**
     * Optional identifier of the track to which this observation belongs.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackId(): Optional<String> = trackId.getOptional("trackId")

    /**
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

    /**
     * Read only field specifying the type of observation (e.g. OPTICAL, OPTICAL_IR, LASER_RANGING,
     * etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Boolean indicating this observation is part of an uncorrelated track or was unable to be
     * correlated to a known object. This flag should only be set to true by data providers after an
     * attempt to correlate to an on-orbit object was made and failed. If unable to correlate, the
     * 'origObjectId' field may be populated with an internal data provider specific identifier.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun uct(): Optional<Boolean> = uct.getOptional("uct")

    /**
     * Boolean indicating that the target object was in umbral eclipse at the time of this
     * observation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun umbra(): Optional<Boolean> = umbra.getOptional("umbra")

    /**
     * Formula: 2.5 \* log_10 (zero_mag_counts / expDuration).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zeroptd(): Optional<Double> = zeroptd.getOptional("zeroptd")

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
     * Returns the raw JSON value of [obTime].
     *
     * Unlike [obTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obTime") @ExcludeMissing fun _obTime(): JsonField<OffsetDateTime> = obTime

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
     * Returns the raw JSON value of [azimuthBias].
     *
     * Unlike [azimuthBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azimuthBias") @ExcludeMissing fun _azimuthBias(): JsonField<Double> = azimuthBias

    /**
     * Returns the raw JSON value of [azimuthMeasured].
     *
     * Unlike [azimuthMeasured], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azimuthMeasured")
    @ExcludeMissing
    fun _azimuthMeasured(): JsonField<Boolean> = azimuthMeasured

    /**
     * Returns the raw JSON value of [azimuthRate].
     *
     * Unlike [azimuthRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azimuthRate") @ExcludeMissing fun _azimuthRate(): JsonField<Double> = azimuthRate

    /**
     * Returns the raw JSON value of [azimuthUnc].
     *
     * Unlike [azimuthUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azimuthUnc") @ExcludeMissing fun _azimuthUnc(): JsonField<Double> = azimuthUnc

    /**
     * Returns the raw JSON value of [bgIntensity].
     *
     * Unlike [bgIntensity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bgIntensity") @ExcludeMissing fun _bgIntensity(): JsonField<Double> = bgIntensity

    /**
     * Returns the raw JSON value of [collectMethod].
     *
     * Unlike [collectMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collectMethod")
    @ExcludeMissing
    fun _collectMethod(): JsonField<String> = collectMethod

    /**
     * Returns the raw JSON value of [corrQuality].
     *
     * Unlike [corrQuality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("corrQuality") @ExcludeMissing fun _corrQuality(): JsonField<Double> = corrQuality

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
    @JsonProperty("declination") @ExcludeMissing fun _declination(): JsonField<Double> = declination

    /**
     * Returns the raw JSON value of [declinationBias].
     *
     * Unlike [declinationBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("declinationBias")
    @ExcludeMissing
    fun _declinationBias(): JsonField<Double> = declinationBias

    /**
     * Returns the raw JSON value of [declinationMeasured].
     *
     * Unlike [declinationMeasured], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("declinationMeasured")
    @ExcludeMissing
    fun _declinationMeasured(): JsonField<Boolean> = declinationMeasured

    /**
     * Returns the raw JSON value of [declinationRate].
     *
     * Unlike [declinationRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("declinationRate")
    @ExcludeMissing
    fun _declinationRate(): JsonField<Double> = declinationRate

    /**
     * Returns the raw JSON value of [declinationUnc].
     *
     * Unlike [declinationUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("declinationUnc")
    @ExcludeMissing
    fun _declinationUnc(): JsonField<Double> = declinationUnc

    /**
     * Returns the raw JSON value of [descriptor].
     *
     * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor(): JsonField<String> = descriptor

    /**
     * Returns the raw JSON value of [elevation].
     *
     * Unlike [elevation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elevation") @ExcludeMissing fun _elevation(): JsonField<Double> = elevation

    /**
     * Returns the raw JSON value of [elevationBias].
     *
     * Unlike [elevationBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elevationBias")
    @ExcludeMissing
    fun _elevationBias(): JsonField<Double> = elevationBias

    /**
     * Returns the raw JSON value of [elevationMeasured].
     *
     * Unlike [elevationMeasured], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("elevationMeasured")
    @ExcludeMissing
    fun _elevationMeasured(): JsonField<Boolean> = elevationMeasured

    /**
     * Returns the raw JSON value of [elevationRate].
     *
     * Unlike [elevationRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elevationRate")
    @ExcludeMissing
    fun _elevationRate(): JsonField<Double> = elevationRate

    /**
     * Returns the raw JSON value of [elevationUnc].
     *
     * Unlike [elevationUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elevationUnc")
    @ExcludeMissing
    fun _elevationUnc(): JsonField<Double> = elevationUnc

    /**
     * Returns the raw JSON value of [expDuration].
     *
     * Unlike [expDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expDuration") @ExcludeMissing fun _expDuration(): JsonField<Double> = expDuration

    /**
     * Returns the raw JSON value of [fovCount].
     *
     * Unlike [fovCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fovCount") @ExcludeMissing fun _fovCount(): JsonField<Int> = fovCount

    /**
     * Returns the raw JSON value of [fovCountUct].
     *
     * Unlike [fovCountUct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fovCountUCT") @ExcludeMissing fun _fovCountUct(): JsonField<Int> = fovCountUct

    /**
     * Returns the raw JSON value of [geoalt].
     *
     * Unlike [geoalt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoalt") @ExcludeMissing fun _geoalt(): JsonField<Double> = geoalt

    /**
     * Returns the raw JSON value of [geolat].
     *
     * Unlike [geolat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geolat") @ExcludeMissing fun _geolat(): JsonField<Double> = geolat

    /**
     * Returns the raw JSON value of [geolon].
     *
     * Unlike [geolon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geolon") @ExcludeMissing fun _geolon(): JsonField<Double> = geolon

    /**
     * Returns the raw JSON value of [georange].
     *
     * Unlike [georange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("georange") @ExcludeMissing fun _georange(): JsonField<Double> = georange

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
     * Returns the raw JSON value of [idSkyImagery].
     *
     * Unlike [idSkyImagery], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSkyImagery")
    @ExcludeMissing
    fun _idSkyImagery(): JsonField<String> = idSkyImagery

    /**
     * Returns the raw JSON value of [intensity].
     *
     * Unlike [intensity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intensity") @ExcludeMissing fun _intensity(): JsonField<Double> = intensity

    /**
     * Returns the raw JSON value of [losUnc].
     *
     * Unlike [losUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("losUnc") @ExcludeMissing fun _losUnc(): JsonField<Double> = losUnc

    /**
     * Returns the raw JSON value of [losx].
     *
     * Unlike [losx], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("losx") @ExcludeMissing fun _losx(): JsonField<Double> = losx

    /**
     * Returns the raw JSON value of [losxvel].
     *
     * Unlike [losxvel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("losxvel") @ExcludeMissing fun _losxvel(): JsonField<Double> = losxvel

    /**
     * Returns the raw JSON value of [losy].
     *
     * Unlike [losy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("losy") @ExcludeMissing fun _losy(): JsonField<Double> = losy

    /**
     * Returns the raw JSON value of [losyvel].
     *
     * Unlike [losyvel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("losyvel") @ExcludeMissing fun _losyvel(): JsonField<Double> = losyvel

    /**
     * Returns the raw JSON value of [losz].
     *
     * Unlike [losz], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("losz") @ExcludeMissing fun _losz(): JsonField<Double> = losz

    /**
     * Returns the raw JSON value of [loszvel].
     *
     * Unlike [loszvel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("loszvel") @ExcludeMissing fun _loszvel(): JsonField<Double> = loszvel

    /**
     * Returns the raw JSON value of [mag].
     *
     * Unlike [mag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mag") @ExcludeMissing fun _mag(): JsonField<Double> = mag

    /**
     * Returns the raw JSON value of [magNormRange].
     *
     * Unlike [magNormRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("magNormRange")
    @ExcludeMissing
    fun _magNormRange(): JsonField<Double> = magNormRange

    /**
     * Returns the raw JSON value of [magUnc].
     *
     * Unlike [magUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("magUnc") @ExcludeMissing fun _magUnc(): JsonField<Double> = magUnc

    /**
     * Returns the raw JSON value of [netObjSig].
     *
     * Unlike [netObjSig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("netObjSig") @ExcludeMissing fun _netObjSig(): JsonField<Double> = netObjSig

    /**
     * Returns the raw JSON value of [netObjSigUnc].
     *
     * Unlike [netObjSigUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("netObjSigUnc")
    @ExcludeMissing
    fun _netObjSigUnc(): JsonField<Double> = netObjSigUnc

    /**
     * Returns the raw JSON value of [obPosition].
     *
     * Unlike [obPosition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obPosition") @ExcludeMissing fun _obPosition(): JsonField<String> = obPosition

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
     * Returns the raw JSON value of [penumbra].
     *
     * Unlike [penumbra], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("penumbra") @ExcludeMissing fun _penumbra(): JsonField<Boolean> = penumbra

    /**
     * Returns the raw JSON value of [primaryExtinction].
     *
     * Unlike [primaryExtinction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primaryExtinction")
    @ExcludeMissing
    fun _primaryExtinction(): JsonField<Double> = primaryExtinction

    /**
     * Returns the raw JSON value of [primaryExtinctionUnc].
     *
     * Unlike [primaryExtinctionUnc], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primaryExtinctionUnc")
    @ExcludeMissing
    fun _primaryExtinctionUnc(): JsonField<Double> = primaryExtinctionUnc

    /**
     * Returns the raw JSON value of [ra].
     *
     * Unlike [ra], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ra") @ExcludeMissing fun _ra(): JsonField<Double> = ra

    /**
     * Returns the raw JSON value of [raBias].
     *
     * Unlike [raBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("raBias") @ExcludeMissing fun _raBias(): JsonField<Double> = raBias

    /**
     * Returns the raw JSON value of [raMeasured].
     *
     * Unlike [raMeasured], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("raMeasured") @ExcludeMissing fun _raMeasured(): JsonField<Boolean> = raMeasured

    /**
     * Returns the raw JSON value of [range].
     *
     * Unlike [range], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("range") @ExcludeMissing fun _range(): JsonField<Double> = range

    /**
     * Returns the raw JSON value of [rangeBias].
     *
     * Unlike [rangeBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeBias") @ExcludeMissing fun _rangeBias(): JsonField<Double> = rangeBias

    /**
     * Returns the raw JSON value of [rangeMeasured].
     *
     * Unlike [rangeMeasured], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeMeasured")
    @ExcludeMissing
    fun _rangeMeasured(): JsonField<Boolean> = rangeMeasured

    /**
     * Returns the raw JSON value of [rangeRate].
     *
     * Unlike [rangeRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeRate") @ExcludeMissing fun _rangeRate(): JsonField<Double> = rangeRate

    /**
     * Returns the raw JSON value of [rangeRateMeasured].
     *
     * Unlike [rangeRateMeasured], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rangeRateMeasured")
    @ExcludeMissing
    fun _rangeRateMeasured(): JsonField<Boolean> = rangeRateMeasured

    /**
     * Returns the raw JSON value of [rangeRateUnc].
     *
     * Unlike [rangeRateUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeRateUnc")
    @ExcludeMissing
    fun _rangeRateUnc(): JsonField<Double> = rangeRateUnc

    /**
     * Returns the raw JSON value of [rangeUnc].
     *
     * Unlike [rangeUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeUnc") @ExcludeMissing fun _rangeUnc(): JsonField<Double> = rangeUnc

    /**
     * Returns the raw JSON value of [raRate].
     *
     * Unlike [raRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("raRate") @ExcludeMissing fun _raRate(): JsonField<Double> = raRate

    /**
     * Returns the raw JSON value of [raUnc].
     *
     * Unlike [raUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("raUnc") @ExcludeMissing fun _raUnc(): JsonField<Double> = raUnc

    /**
     * Returns the raw JSON value of [rawFileUri].
     *
     * Unlike [rawFileUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rawFileURI") @ExcludeMissing fun _rawFileUri(): JsonField<String> = rawFileUri

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
     * Returns the raw JSON value of [senalt].
     *
     * Unlike [senalt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senalt") @ExcludeMissing fun _senalt(): JsonField<Double> = senalt

    /**
     * Returns the raw JSON value of [senlat].
     *
     * Unlike [senlat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senlat") @ExcludeMissing fun _senlat(): JsonField<Double> = senlat

    /**
     * Returns the raw JSON value of [senlon].
     *
     * Unlike [senlon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senlon") @ExcludeMissing fun _senlon(): JsonField<Double> = senlon

    /**
     * Returns the raw JSON value of [senQuat].
     *
     * Unlike [senQuat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senQuat") @ExcludeMissing fun _senQuat(): JsonField<List<Double>> = senQuat

    /**
     * Returns the raw JSON value of [senReferenceFrame].
     *
     * Unlike [senReferenceFrame], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("senReferenceFrame")
    @ExcludeMissing
    fun _senReferenceFrame(): JsonField<SenReferenceFrame> = senReferenceFrame

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
     * Returns the raw JSON value of [senx].
     *
     * Unlike [senx], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senx") @ExcludeMissing fun _senx(): JsonField<Double> = senx

    /**
     * Returns the raw JSON value of [seny].
     *
     * Unlike [seny], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seny") @ExcludeMissing fun _seny(): JsonField<Double> = seny

    /**
     * Returns the raw JSON value of [senz].
     *
     * Unlike [senz], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senz") @ExcludeMissing fun _senz(): JsonField<Double> = senz

    /**
     * Returns the raw JSON value of [shutterDelay].
     *
     * Unlike [shutterDelay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shutterDelay")
    @ExcludeMissing
    fun _shutterDelay(): JsonField<Double> = shutterDelay

    /**
     * Returns the raw JSON value of [skyBkgrnd].
     *
     * Unlike [skyBkgrnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skyBkgrnd") @ExcludeMissing fun _skyBkgrnd(): JsonField<Double> = skyBkgrnd

    /**
     * Returns the raw JSON value of [solarDecAngle].
     *
     * Unlike [solarDecAngle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("solarDecAngle")
    @ExcludeMissing
    fun _solarDecAngle(): JsonField<Double> = solarDecAngle

    /**
     * Returns the raw JSON value of [solarEqPhaseAngle].
     *
     * Unlike [solarEqPhaseAngle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("solarEqPhaseAngle")
    @ExcludeMissing
    fun _solarEqPhaseAngle(): JsonField<Double> = solarEqPhaseAngle

    /**
     * Returns the raw JSON value of [solarPhaseAngle].
     *
     * Unlike [solarPhaseAngle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("solarPhaseAngle")
    @ExcludeMissing
    fun _solarPhaseAngle(): JsonField<Double> = solarPhaseAngle

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [taskId].
     *
     * Unlike [taskId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taskId") @ExcludeMissing fun _taskId(): JsonField<String> = taskId

    /**
     * Returns the raw JSON value of [timingBias].
     *
     * Unlike [timingBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timingBias") @ExcludeMissing fun _timingBias(): JsonField<Double> = timingBias

    /**
     * Returns the raw JSON value of [trackId].
     *
     * Unlike [trackId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackId") @ExcludeMissing fun _trackId(): JsonField<String> = trackId

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [uct].
     *
     * Unlike [uct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uct") @ExcludeMissing fun _uct(): JsonField<Boolean> = uct

    /**
     * Returns the raw JSON value of [umbra].
     *
     * Unlike [umbra], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("umbra") @ExcludeMissing fun _umbra(): JsonField<Boolean> = umbra

    /**
     * Returns the raw JSON value of [zeroptd].
     *
     * Unlike [zeroptd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zeroptd") @ExcludeMissing fun _zeroptd(): JsonField<Double> = zeroptd

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
         * Returns a mutable builder for constructing an instance of [EoObservationAbridged].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .obTime()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EoObservationAbridged]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var obTime: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var azimuth: JsonField<Double> = JsonMissing.of()
        private var azimuthBias: JsonField<Double> = JsonMissing.of()
        private var azimuthMeasured: JsonField<Boolean> = JsonMissing.of()
        private var azimuthRate: JsonField<Double> = JsonMissing.of()
        private var azimuthUnc: JsonField<Double> = JsonMissing.of()
        private var bgIntensity: JsonField<Double> = JsonMissing.of()
        private var collectMethod: JsonField<String> = JsonMissing.of()
        private var corrQuality: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var declination: JsonField<Double> = JsonMissing.of()
        private var declinationBias: JsonField<Double> = JsonMissing.of()
        private var declinationMeasured: JsonField<Boolean> = JsonMissing.of()
        private var declinationRate: JsonField<Double> = JsonMissing.of()
        private var declinationUnc: JsonField<Double> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var elevation: JsonField<Double> = JsonMissing.of()
        private var elevationBias: JsonField<Double> = JsonMissing.of()
        private var elevationMeasured: JsonField<Boolean> = JsonMissing.of()
        private var elevationRate: JsonField<Double> = JsonMissing.of()
        private var elevationUnc: JsonField<Double> = JsonMissing.of()
        private var expDuration: JsonField<Double> = JsonMissing.of()
        private var fovCount: JsonField<Int> = JsonMissing.of()
        private var fovCountUct: JsonField<Int> = JsonMissing.of()
        private var geoalt: JsonField<Double> = JsonMissing.of()
        private var geolat: JsonField<Double> = JsonMissing.of()
        private var geolon: JsonField<Double> = JsonMissing.of()
        private var georange: JsonField<Double> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var idSkyImagery: JsonField<String> = JsonMissing.of()
        private var intensity: JsonField<Double> = JsonMissing.of()
        private var losUnc: JsonField<Double> = JsonMissing.of()
        private var losx: JsonField<Double> = JsonMissing.of()
        private var losxvel: JsonField<Double> = JsonMissing.of()
        private var losy: JsonField<Double> = JsonMissing.of()
        private var losyvel: JsonField<Double> = JsonMissing.of()
        private var losz: JsonField<Double> = JsonMissing.of()
        private var loszvel: JsonField<Double> = JsonMissing.of()
        private var mag: JsonField<Double> = JsonMissing.of()
        private var magNormRange: JsonField<Double> = JsonMissing.of()
        private var magUnc: JsonField<Double> = JsonMissing.of()
        private var netObjSig: JsonField<Double> = JsonMissing.of()
        private var netObjSigUnc: JsonField<Double> = JsonMissing.of()
        private var obPosition: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var penumbra: JsonField<Boolean> = JsonMissing.of()
        private var primaryExtinction: JsonField<Double> = JsonMissing.of()
        private var primaryExtinctionUnc: JsonField<Double> = JsonMissing.of()
        private var ra: JsonField<Double> = JsonMissing.of()
        private var raBias: JsonField<Double> = JsonMissing.of()
        private var raMeasured: JsonField<Boolean> = JsonMissing.of()
        private var range: JsonField<Double> = JsonMissing.of()
        private var rangeBias: JsonField<Double> = JsonMissing.of()
        private var rangeMeasured: JsonField<Boolean> = JsonMissing.of()
        private var rangeRate: JsonField<Double> = JsonMissing.of()
        private var rangeRateMeasured: JsonField<Boolean> = JsonMissing.of()
        private var rangeRateUnc: JsonField<Double> = JsonMissing.of()
        private var rangeUnc: JsonField<Double> = JsonMissing.of()
        private var raRate: JsonField<Double> = JsonMissing.of()
        private var raUnc: JsonField<Double> = JsonMissing.of()
        private var rawFileUri: JsonField<String> = JsonMissing.of()
        private var referenceFrame: JsonField<ReferenceFrame> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var senalt: JsonField<Double> = JsonMissing.of()
        private var senlat: JsonField<Double> = JsonMissing.of()
        private var senlon: JsonField<Double> = JsonMissing.of()
        private var senQuat: JsonField<MutableList<Double>>? = null
        private var senReferenceFrame: JsonField<SenReferenceFrame> = JsonMissing.of()
        private var senvelx: JsonField<Double> = JsonMissing.of()
        private var senvely: JsonField<Double> = JsonMissing.of()
        private var senvelz: JsonField<Double> = JsonMissing.of()
        private var senx: JsonField<Double> = JsonMissing.of()
        private var seny: JsonField<Double> = JsonMissing.of()
        private var senz: JsonField<Double> = JsonMissing.of()
        private var shutterDelay: JsonField<Double> = JsonMissing.of()
        private var skyBkgrnd: JsonField<Double> = JsonMissing.of()
        private var solarDecAngle: JsonField<Double> = JsonMissing.of()
        private var solarEqPhaseAngle: JsonField<Double> = JsonMissing.of()
        private var solarPhaseAngle: JsonField<Double> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var taskId: JsonField<String> = JsonMissing.of()
        private var timingBias: JsonField<Double> = JsonMissing.of()
        private var trackId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var uct: JsonField<Boolean> = JsonMissing.of()
        private var umbra: JsonField<Boolean> = JsonMissing.of()
        private var zeroptd: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eoObservationAbridged: EoObservationAbridged) = apply {
            classificationMarking = eoObservationAbridged.classificationMarking
            dataMode = eoObservationAbridged.dataMode
            obTime = eoObservationAbridged.obTime
            source = eoObservationAbridged.source
            id = eoObservationAbridged.id
            azimuth = eoObservationAbridged.azimuth
            azimuthBias = eoObservationAbridged.azimuthBias
            azimuthMeasured = eoObservationAbridged.azimuthMeasured
            azimuthRate = eoObservationAbridged.azimuthRate
            azimuthUnc = eoObservationAbridged.azimuthUnc
            bgIntensity = eoObservationAbridged.bgIntensity
            collectMethod = eoObservationAbridged.collectMethod
            corrQuality = eoObservationAbridged.corrQuality
            createdAt = eoObservationAbridged.createdAt
            createdBy = eoObservationAbridged.createdBy
            declination = eoObservationAbridged.declination
            declinationBias = eoObservationAbridged.declinationBias
            declinationMeasured = eoObservationAbridged.declinationMeasured
            declinationRate = eoObservationAbridged.declinationRate
            declinationUnc = eoObservationAbridged.declinationUnc
            descriptor = eoObservationAbridged.descriptor
            elevation = eoObservationAbridged.elevation
            elevationBias = eoObservationAbridged.elevationBias
            elevationMeasured = eoObservationAbridged.elevationMeasured
            elevationRate = eoObservationAbridged.elevationRate
            elevationUnc = eoObservationAbridged.elevationUnc
            expDuration = eoObservationAbridged.expDuration
            fovCount = eoObservationAbridged.fovCount
            fovCountUct = eoObservationAbridged.fovCountUct
            geoalt = eoObservationAbridged.geoalt
            geolat = eoObservationAbridged.geolat
            geolon = eoObservationAbridged.geolon
            georange = eoObservationAbridged.georange
            idOnOrbit = eoObservationAbridged.idOnOrbit
            idSensor = eoObservationAbridged.idSensor
            idSkyImagery = eoObservationAbridged.idSkyImagery
            intensity = eoObservationAbridged.intensity
            losUnc = eoObservationAbridged.losUnc
            losx = eoObservationAbridged.losx
            losxvel = eoObservationAbridged.losxvel
            losy = eoObservationAbridged.losy
            losyvel = eoObservationAbridged.losyvel
            losz = eoObservationAbridged.losz
            loszvel = eoObservationAbridged.loszvel
            mag = eoObservationAbridged.mag
            magNormRange = eoObservationAbridged.magNormRange
            magUnc = eoObservationAbridged.magUnc
            netObjSig = eoObservationAbridged.netObjSig
            netObjSigUnc = eoObservationAbridged.netObjSigUnc
            obPosition = eoObservationAbridged.obPosition
            origin = eoObservationAbridged.origin
            origNetwork = eoObservationAbridged.origNetwork
            origObjectId = eoObservationAbridged.origObjectId
            origSensorId = eoObservationAbridged.origSensorId
            penumbra = eoObservationAbridged.penumbra
            primaryExtinction = eoObservationAbridged.primaryExtinction
            primaryExtinctionUnc = eoObservationAbridged.primaryExtinctionUnc
            ra = eoObservationAbridged.ra
            raBias = eoObservationAbridged.raBias
            raMeasured = eoObservationAbridged.raMeasured
            range = eoObservationAbridged.range
            rangeBias = eoObservationAbridged.rangeBias
            rangeMeasured = eoObservationAbridged.rangeMeasured
            rangeRate = eoObservationAbridged.rangeRate
            rangeRateMeasured = eoObservationAbridged.rangeRateMeasured
            rangeRateUnc = eoObservationAbridged.rangeRateUnc
            rangeUnc = eoObservationAbridged.rangeUnc
            raRate = eoObservationAbridged.raRate
            raUnc = eoObservationAbridged.raUnc
            rawFileUri = eoObservationAbridged.rawFileUri
            referenceFrame = eoObservationAbridged.referenceFrame
            satNo = eoObservationAbridged.satNo
            senalt = eoObservationAbridged.senalt
            senlat = eoObservationAbridged.senlat
            senlon = eoObservationAbridged.senlon
            senQuat = eoObservationAbridged.senQuat.map { it.toMutableList() }
            senReferenceFrame = eoObservationAbridged.senReferenceFrame
            senvelx = eoObservationAbridged.senvelx
            senvely = eoObservationAbridged.senvely
            senvelz = eoObservationAbridged.senvelz
            senx = eoObservationAbridged.senx
            seny = eoObservationAbridged.seny
            senz = eoObservationAbridged.senz
            shutterDelay = eoObservationAbridged.shutterDelay
            skyBkgrnd = eoObservationAbridged.skyBkgrnd
            solarDecAngle = eoObservationAbridged.solarDecAngle
            solarEqPhaseAngle = eoObservationAbridged.solarEqPhaseAngle
            solarPhaseAngle = eoObservationAbridged.solarPhaseAngle
            sourceDl = eoObservationAbridged.sourceDl
            taskId = eoObservationAbridged.taskId
            timingBias = eoObservationAbridged.timingBias
            trackId = eoObservationAbridged.trackId
            transactionId = eoObservationAbridged.transactionId
            type = eoObservationAbridged.type
            uct = eoObservationAbridged.uct
            umbra = eoObservationAbridged.umbra
            zeroptd = eoObservationAbridged.zeroptd
            additionalProperties = eoObservationAbridged.additionalProperties.toMutableMap()
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
         * Ob detection time in ISO 8601 UTC, up to microsecond precision. Consumers should contact
         * the provider for details on their obTime specifications.
         */
        fun obTime(obTime: OffsetDateTime) = obTime(JsonField.of(obTime))

        /**
         * Sets [Builder.obTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun obTime(obTime: JsonField<OffsetDateTime>) = apply { this.obTime = obTime }

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
         * Line of sight azimuth angle in degrees and topocentric frame. Reported value should
         * include all applicable corrections as specified on the source provider data card. If
         * uncertain, consumers should contact the provider for details on the applied corrections.
         */
        fun azimuth(azimuth: Double) = azimuth(JsonField.of(azimuth))

        /**
         * Sets [Builder.azimuth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azimuth] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun azimuth(azimuth: JsonField<Double>) = apply { this.azimuth = azimuth }

        /** Sensor line of sight azimuth angle bias in degrees. */
        fun azimuthBias(azimuthBias: Double) = azimuthBias(JsonField.of(azimuthBias))

        /**
         * Sets [Builder.azimuthBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azimuthBias] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun azimuthBias(azimuthBias: JsonField<Double>) = apply { this.azimuthBias = azimuthBias }

        /**
         * Optional flag indicating whether the azimuth value is measured (true) or computed
         * (false). If null, consumers may consult the data provider for information regarding
         * whether the corresponding value is computed or measured.
         */
        fun azimuthMeasured(azimuthMeasured: Boolean) =
            azimuthMeasured(JsonField.of(azimuthMeasured))

        /**
         * Sets [Builder.azimuthMeasured] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azimuthMeasured] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun azimuthMeasured(azimuthMeasured: JsonField<Boolean>) = apply {
            this.azimuthMeasured = azimuthMeasured
        }

        /** Rate of change of the line of sight azimuth in degrees per second. */
        fun azimuthRate(azimuthRate: Double) = azimuthRate(JsonField.of(azimuthRate))

        /**
         * Sets [Builder.azimuthRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azimuthRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun azimuthRate(azimuthRate: JsonField<Double>) = apply { this.azimuthRate = azimuthRate }

        /** One sigma uncertainty in the line of sight azimuth angle, in degrees. */
        fun azimuthUnc(azimuthUnc: Double) = azimuthUnc(JsonField.of(azimuthUnc))

        /**
         * Sets [Builder.azimuthUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azimuthUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun azimuthUnc(azimuthUnc: JsonField<Double>) = apply { this.azimuthUnc = azimuthUnc }

        /** Background intensity for IR observations, in kw/sr/um. */
        fun bgIntensity(bgIntensity: Double) = bgIntensity(JsonField.of(bgIntensity))

        /**
         * Sets [Builder.bgIntensity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bgIntensity] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bgIntensity(bgIntensity: JsonField<Double>) = apply { this.bgIntensity = bgIntensity }

        /**
         * Method indicating telescope movement during collection (AUTOTRACK, MANUAL AUTOTRACK,
         * MANUAL RATE TRACK, MANUAL SIDEREAL, SIDEREAL, RATE TRACK).
         */
        fun collectMethod(collectMethod: String) = collectMethod(JsonField.of(collectMethod))

        /**
         * Sets [Builder.collectMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectMethod] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun collectMethod(collectMethod: JsonField<String>) = apply {
            this.collectMethod = collectMethod
        }

        /**
         * Object Correlation Quality score of the observation when compared to a known orbit state,
         * (non-standardized). Users should consult data providers regarding the expected range of
         * values.
         */
        fun corrQuality(corrQuality: Double) = corrQuality(JsonField.of(corrQuality))

        /**
         * Sets [Builder.corrQuality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.corrQuality] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun corrQuality(corrQuality: JsonField<Double>) = apply { this.corrQuality = corrQuality }

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
         * Line of sight declination, in degrees, in the specified referenceFrame. If referenceFrame
         * is null then J2K should be assumed. Reported value should include all applicable
         * corrections as specified on the source provider data card. If uncertain, consumers should
         * contact the provider for details on the applied corrections.
         */
        fun declination(declination: Double) = declination(JsonField.of(declination))

        /**
         * Sets [Builder.declination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declination] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun declination(declination: JsonField<Double>) = apply { this.declination = declination }

        /** Sensor line of sight declination angle bias in degrees. */
        fun declinationBias(declinationBias: Double) =
            declinationBias(JsonField.of(declinationBias))

        /**
         * Sets [Builder.declinationBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declinationBias] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun declinationBias(declinationBias: JsonField<Double>) = apply {
            this.declinationBias = declinationBias
        }

        /**
         * Optional flag indicating whether the declination value is measured (true) or computed
         * (false). If null, consumers may consult the data provider for information regarding
         * whether the corresponding value is computed or measured.
         */
        fun declinationMeasured(declinationMeasured: Boolean) =
            declinationMeasured(JsonField.of(declinationMeasured))

        /**
         * Sets [Builder.declinationMeasured] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declinationMeasured] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun declinationMeasured(declinationMeasured: JsonField<Boolean>) = apply {
            this.declinationMeasured = declinationMeasured
        }

        /**
         * Line of sight declination rate of change, in degrees/sec, in the specified
         * referenceFrame. If referenceFrame is null then J2K should be assumed.
         */
        fun declinationRate(declinationRate: Double) =
            declinationRate(JsonField.of(declinationRate))

        /**
         * Sets [Builder.declinationRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declinationRate] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun declinationRate(declinationRate: JsonField<Double>) = apply {
            this.declinationRate = declinationRate
        }

        /** One sigma uncertainty in the line of sight declination angle, in degrees. */
        fun declinationUnc(declinationUnc: Double) = declinationUnc(JsonField.of(declinationUnc))

        /**
         * Sets [Builder.declinationUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declinationUnc] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun declinationUnc(declinationUnc: JsonField<Double>) = apply {
            this.declinationUnc = declinationUnc
        }

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

        /**
         * Line of sight elevation in degrees and topocentric frame. Reported value should include
         * all applicable corrections as specified on the source provider data card. If uncertain,
         * consumers should contact the provider for details on the applied corrections.
         */
        fun elevation(elevation: Double) = elevation(JsonField.of(elevation))

        /**
         * Sets [Builder.elevation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevation] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun elevation(elevation: JsonField<Double>) = apply { this.elevation = elevation }

        /** Sensor line of sight elevation bias in degrees. */
        fun elevationBias(elevationBias: Double) = elevationBias(JsonField.of(elevationBias))

        /**
         * Sets [Builder.elevationBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevationBias] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun elevationBias(elevationBias: JsonField<Double>) = apply {
            this.elevationBias = elevationBias
        }

        /**
         * Optional flag indicating whether the elevation value is measured (true) or computed
         * (false). If null, consumers may consult the data provider for information regarding
         * whether the corresponding value is computed or measured.
         */
        fun elevationMeasured(elevationMeasured: Boolean) =
            elevationMeasured(JsonField.of(elevationMeasured))

        /**
         * Sets [Builder.elevationMeasured] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevationMeasured] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elevationMeasured(elevationMeasured: JsonField<Boolean>) = apply {
            this.elevationMeasured = elevationMeasured
        }

        /** Rate of change of the line of sight elevation in degrees per second. */
        fun elevationRate(elevationRate: Double) = elevationRate(JsonField.of(elevationRate))

        /**
         * Sets [Builder.elevationRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevationRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun elevationRate(elevationRate: JsonField<Double>) = apply {
            this.elevationRate = elevationRate
        }

        /** One sigma uncertainty in the line of sight elevation angle, in degrees. */
        fun elevationUnc(elevationUnc: Double) = elevationUnc(JsonField.of(elevationUnc))

        /**
         * Sets [Builder.elevationUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevationUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun elevationUnc(elevationUnc: JsonField<Double>) = apply {
            this.elevationUnc = elevationUnc
        }

        /**
         * Image exposure duration in seconds. For observations performed using frame stacking or
         * synthetic tracking methods, the exposure duration should be the total integration time.
         * This field is highly recommended / required if the observations are going to be used for
         * photometric processing.
         */
        fun expDuration(expDuration: Double) = expDuration(JsonField.of(expDuration))

        /**
         * Sets [Builder.expDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expDuration] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expDuration(expDuration: JsonField<Double>) = apply { this.expDuration = expDuration }

        /** The number of RSOs detected in the sensor field of view. */
        fun fovCount(fovCount: Int) = fovCount(JsonField.of(fovCount))

        /**
         * Sets [Builder.fovCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fovCount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fovCount(fovCount: JsonField<Int>) = apply { this.fovCount = fovCount }

        /** The number of uncorrelated tracks in the field of view. */
        fun fovCountUct(fovCountUct: Int) = fovCountUct(JsonField.of(fovCountUct))

        /**
         * Sets [Builder.fovCountUct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fovCountUct] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fovCountUct(fovCountUct: JsonField<Int>) = apply { this.fovCountUct = fovCountUct }

        /** For GEO detections, the altitude in km. */
        fun geoalt(geoalt: Double) = geoalt(JsonField.of(geoalt))

        /**
         * Sets [Builder.geoalt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoalt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun geoalt(geoalt: JsonField<Double>) = apply { this.geoalt = geoalt }

        /** For GEO detections, the latitude in degrees north. */
        fun geolat(geolat: Double) = geolat(JsonField.of(geolat))

        /**
         * Sets [Builder.geolat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geolat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun geolat(geolat: JsonField<Double>) = apply { this.geolat = geolat }

        /** For GEO detections, the longitude in degrees east. */
        fun geolon(geolon: Double) = geolon(JsonField.of(geolon))

        /**
         * Sets [Builder.geolon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geolon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun geolon(geolon: JsonField<Double>) = apply { this.geolon = geolon }

        /** For GEO detections, the range in km. */
        fun georange(georange: Double) = georange(JsonField.of(georange))

        /**
         * Sets [Builder.georange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.georange] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun georange(georange: JsonField<Double>) = apply { this.georange = georange }

        /** Unique identifier of the target on-orbit object, if correlated. */
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

        /** Unique identifier of the Sky Imagery. */
        fun idSkyImagery(idSkyImagery: String) = idSkyImagery(JsonField.of(idSkyImagery))

        /**
         * Sets [Builder.idSkyImagery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSkyImagery] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idSkyImagery(idSkyImagery: JsonField<String>) = apply {
            this.idSkyImagery = idSkyImagery
        }

        /** Intensity of the target for IR observations, in kw/sr/um. */
        fun intensity(intensity: Double) = intensity(JsonField.of(intensity))

        /**
         * Sets [Builder.intensity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intensity] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun intensity(intensity: JsonField<Double>) = apply { this.intensity = intensity }

        /** One sigma uncertainty in the line of sight pointing in micro-radians. */
        fun losUnc(losUnc: Double) = losUnc(JsonField.of(losUnc))

        /**
         * Sets [Builder.losUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.losUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun losUnc(losUnc: JsonField<Double>) = apply { this.losUnc = losUnc }

        /**
         * Line-of-sight cartesian X position of the target, in km, in the specified referenceFrame.
         * If referenceFrame is null then J2K should be assumed.
         */
        fun losx(losx: Double) = losx(JsonField.of(losx))

        /**
         * Sets [Builder.losx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.losx] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun losx(losx: JsonField<Double>) = apply { this.losx = losx }

        /**
         * Line-of-sight cartesian X velocity of target, in km/sec, in the specified referenceFrame.
         * If referenceFrame is null then J2K should be assumed.
         */
        fun losxvel(losxvel: Double) = losxvel(JsonField.of(losxvel))

        /**
         * Sets [Builder.losxvel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.losxvel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun losxvel(losxvel: JsonField<Double>) = apply { this.losxvel = losxvel }

        /**
         * Line-of-sight cartesian Y position of the target, in km, in the specified referenceFrame.
         * If referenceFrame is null then J2K should be assumed.
         */
        fun losy(losy: Double) = losy(JsonField.of(losy))

        /**
         * Sets [Builder.losy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.losy] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun losy(losy: JsonField<Double>) = apply { this.losy = losy }

        /**
         * Line-of-sight cartesian Y velocity of target, in km/sec, in the specified referenceFrame.
         * If referenceFrame is null then J2K should be assumed.
         */
        fun losyvel(losyvel: Double) = losyvel(JsonField.of(losyvel))

        /**
         * Sets [Builder.losyvel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.losyvel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun losyvel(losyvel: JsonField<Double>) = apply { this.losyvel = losyvel }

        /**
         * Line-of-sight cartesian Z position of the target, in km, in the specified referenceFrame.
         * If referenceFrame is null then J2K should be assumed.
         */
        fun losz(losz: Double) = losz(JsonField.of(losz))

        /**
         * Sets [Builder.losz] to an arbitrary JSON value.
         *
         * You should usually call [Builder.losz] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun losz(losz: JsonField<Double>) = apply { this.losz = losz }

        /**
         * Line-of-sight cartesian Z velocity of target, in km/sec, in the specified referenceFrame.
         * If referenceFrame is null then J2K should be assumed.
         */
        fun loszvel(loszvel: Double) = loszvel(JsonField.of(loszvel))

        /**
         * Sets [Builder.loszvel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loszvel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun loszvel(loszvel: JsonField<Double>) = apply { this.loszvel = loszvel }

        /**
         * Measure of observed brightness calibrated against the Gaia G-band in units of magnitudes.
         */
        fun mag(mag: Double) = mag(JsonField.of(mag))

        /**
         * Sets [Builder.mag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mag(mag: JsonField<Double>) = apply { this.mag = mag }

        /** Formula: mag - 5.0 \* log_10(geo_range / 1000000.0). */
        fun magNormRange(magNormRange: Double) = magNormRange(JsonField.of(magNormRange))

        /**
         * Sets [Builder.magNormRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.magNormRange] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun magNormRange(magNormRange: JsonField<Double>) = apply {
            this.magNormRange = magNormRange
        }

        /** Uncertainty of the observed brightness in units of magnitudes. */
        fun magUnc(magUnc: Double) = magUnc(JsonField.of(magUnc))

        /**
         * Sets [Builder.magUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.magUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun magUnc(magUnc: JsonField<Double>) = apply { this.magUnc = magUnc }

        /** Net object signature = counts / expDuration. */
        fun netObjSig(netObjSig: Double) = netObjSig(JsonField.of(netObjSig))

        /**
         * Sets [Builder.netObjSig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netObjSig] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun netObjSig(netObjSig: JsonField<Double>) = apply { this.netObjSig = netObjSig }

        /** Net object signature uncertainty = counts uncertainty / expDuration. */
        fun netObjSigUnc(netObjSigUnc: Double) = netObjSigUnc(JsonField.of(netObjSigUnc))

        /**
         * Sets [Builder.netObjSigUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netObjSigUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun netObjSigUnc(netObjSigUnc: JsonField<Double>) = apply {
            this.netObjSigUnc = netObjSigUnc
        }

        /**
         * The position of this observation within a track (FENCE, FIRST, IN, LAST, SINGLE). This
         * identifier is optional and, if null, no assumption should be made regarding whether other
         * observations may or may not exist to compose a track.
         */
        fun obPosition(obPosition: String) = obPosition(JsonField.of(obPosition))

        /**
         * Sets [Builder.obPosition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obPosition] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun obPosition(obPosition: JsonField<String>) = apply { this.obPosition = obPosition }

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
         * Optional identifier provided by observation source to indicate the target onorbit object
         * of this observation. This may be an internal identifier and not necessarily a valid
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
         * Optional identifier provided by observation source to indicate the sensor identifier
         * which produced this observation. This may be an internal identifier and not necessarily a
         * valid sensor ID.
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
         * Boolean indicating that the target object was in a penumbral eclipse at the time of this
         * observation.
         */
        fun penumbra(penumbra: Boolean) = penumbra(JsonField.of(penumbra))

        /**
         * Sets [Builder.penumbra] to an arbitrary JSON value.
         *
         * You should usually call [Builder.penumbra] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun penumbra(penumbra: JsonField<Boolean>) = apply { this.penumbra = penumbra }

        /**
         * Primary Extinction Coefficient, in Magnitudes. Primary Extinction is the coefficient
         * applied to the airmass to determine how much the observed visual magnitude has been
         * attenuated by the atmosphere. Extinction, in general, describes the absorption and
         * scattering of electromagnetic radiation by dust and gas between an emitting astronomical
         * object and the observer. See the EOObservationDetails API for specification of extinction
         * coefficients for multiple spectral filters.
         */
        fun primaryExtinction(primaryExtinction: Double) =
            primaryExtinction(JsonField.of(primaryExtinction))

        /**
         * Sets [Builder.primaryExtinction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryExtinction] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryExtinction(primaryExtinction: JsonField<Double>) = apply {
            this.primaryExtinction = primaryExtinction
        }

        /** Primary Extinction Coefficient Uncertainty, in Magnitudes. */
        fun primaryExtinctionUnc(primaryExtinctionUnc: Double) =
            primaryExtinctionUnc(JsonField.of(primaryExtinctionUnc))

        /**
         * Sets [Builder.primaryExtinctionUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryExtinctionUnc] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryExtinctionUnc(primaryExtinctionUnc: JsonField<Double>) = apply {
            this.primaryExtinctionUnc = primaryExtinctionUnc
        }

        /**
         * Line of sight right ascension, in degrees, in the specified referenceFrame. If
         * referenceFrame is null then J2K should be assumed. Reported value should include all
         * applicable corrections as specified on the source provider data card. If uncertain,
         * consumers should contact the provider for details on the applied corrections.
         */
        fun ra(ra: Double) = ra(JsonField.of(ra))

        /**
         * Sets [Builder.ra] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ra] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ra(ra: JsonField<Double>) = apply { this.ra = ra }

        /** Sensor line of sight right ascension bias in degrees. */
        fun raBias(raBias: Double) = raBias(JsonField.of(raBias))

        /**
         * Sets [Builder.raBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.raBias] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun raBias(raBias: JsonField<Double>) = apply { this.raBias = raBias }

        /**
         * Optional flag indicating whether the ra value is measured (true) or computed (false). If
         * null, consumers may consult the data provider for information regarding whether the
         * corresponding value is computed or measured.
         */
        fun raMeasured(raMeasured: Boolean) = raMeasured(JsonField.of(raMeasured))

        /**
         * Sets [Builder.raMeasured] to an arbitrary JSON value.
         *
         * You should usually call [Builder.raMeasured] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun raMeasured(raMeasured: JsonField<Boolean>) = apply { this.raMeasured = raMeasured }

        /**
         * Line of sight range in km. If referenceFrame is null then J2K should be assumed. Reported
         * value should include all applicable corrections as specified on the source provider data
         * card. If uncertain, consumers should contact the provider for details on the applied
         * corrections.
         */
        fun range(range: Double) = range(JsonField.of(range))

        /**
         * Sets [Builder.range] to an arbitrary JSON value.
         *
         * You should usually call [Builder.range] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun range(range: JsonField<Double>) = apply { this.range = range }

        /** Sensor line of sight range bias in km. */
        fun rangeBias(rangeBias: Double) = rangeBias(JsonField.of(rangeBias))

        /**
         * Sets [Builder.rangeBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeBias] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rangeBias(rangeBias: JsonField<Double>) = apply { this.rangeBias = rangeBias }

        /**
         * Optional flag indicating whether the range value is measured (true) or computed (false).
         * If null, consumers may consult the data provider for information regarding whether the
         * corresponding value is computed or measured.
         */
        fun rangeMeasured(rangeMeasured: Boolean) = rangeMeasured(JsonField.of(rangeMeasured))

        /**
         * Sets [Builder.rangeMeasured] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeMeasured] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rangeMeasured(rangeMeasured: JsonField<Boolean>) = apply {
            this.rangeMeasured = rangeMeasured
        }

        /**
         * Range rate in km/s. If referenceFrame is null then J2K should be assumed. Reported value
         * should include all applicable corrections as specified on the source provider data card.
         * If uncertain, consumers should contact the provider for details on the applied
         * corrections.
         */
        fun rangeRate(rangeRate: Double) = rangeRate(JsonField.of(rangeRate))

        /**
         * Sets [Builder.rangeRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rangeRate(rangeRate: JsonField<Double>) = apply { this.rangeRate = rangeRate }

        /**
         * Optional flag indicating whether the rangeRate value is measured (true) or computed
         * (false). If null, consumers may consult the data provider for information regarding
         * whether the corresponding value is computed or measured.
         */
        fun rangeRateMeasured(rangeRateMeasured: Boolean) =
            rangeRateMeasured(JsonField.of(rangeRateMeasured))

        /**
         * Sets [Builder.rangeRateMeasured] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeRateMeasured] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rangeRateMeasured(rangeRateMeasured: JsonField<Boolean>) = apply {
            this.rangeRateMeasured = rangeRateMeasured
        }

        /** One sigma uncertainty in the line of sight range rate, in kilometers/second. */
        fun rangeRateUnc(rangeRateUnc: Double) = rangeRateUnc(JsonField.of(rangeRateUnc))

        /**
         * Sets [Builder.rangeRateUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeRateUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rangeRateUnc(rangeRateUnc: JsonField<Double>) = apply {
            this.rangeRateUnc = rangeRateUnc
        }

        /** One sigma uncertainty in the line of sight range, in kilometers. */
        fun rangeUnc(rangeUnc: Double) = rangeUnc(JsonField.of(rangeUnc))

        /**
         * Sets [Builder.rangeUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rangeUnc(rangeUnc: JsonField<Double>) = apply { this.rangeUnc = rangeUnc }

        /**
         * Line of sight right ascension rate of change, in degrees/sec, in the specified
         * referenceFrame. If referenceFrame is null then J2K should be assumed.
         */
        fun raRate(raRate: Double) = raRate(JsonField.of(raRate))

        /**
         * Sets [Builder.raRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.raRate] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun raRate(raRate: JsonField<Double>) = apply { this.raRate = raRate }

        /** One sigma uncertainty in the line of sight right ascension angle, in degrees. */
        fun raUnc(raUnc: Double) = raUnc(JsonField.of(raUnc))

        /**
         * Sets [Builder.raUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.raUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun raUnc(raUnc: JsonField<Double>) = apply { this.raUnc = raUnc }

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

        /**
         * The reference frame of the EOObservation measurements. If the referenceFrame is null it
         * is assumed to be J2000.
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

        /** Satellite/Catalog number of the target on-orbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /** Sensor altitude at obTime (if mobile/onorbit) in km. */
        fun senalt(senalt: Double) = senalt(JsonField.of(senalt))

        /**
         * Sets [Builder.senalt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senalt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senalt(senalt: JsonField<Double>) = apply { this.senalt = senalt }

        /**
         * Sensor WGS84 latitude at obTime (if mobile/onorbit) in degrees. If null, can be obtained
         * from sensor info. -90 to 90 degrees (negative values south of equator).
         */
        fun senlat(senlat: Double) = senlat(JsonField.of(senlat))

        /**
         * Sets [Builder.senlat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senlat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senlat(senlat: JsonField<Double>) = apply { this.senlat = senlat }

        /**
         * Sensor WGS84 longitude at obTime (if mobile/onorbit) in degrees. If null, can be obtained
         * from sensor info. -180 to 180 degrees (negative values west of Prime Meridian).
         */
        fun senlon(senlon: Double) = senlon(JsonField.of(senlon))

        /**
         * Sets [Builder.senlon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senlon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senlon(senlon: JsonField<Double>) = apply { this.senlon = senlon }

        /**
         * The quaternion describing the rotation of the sensor in relation to the body-fixed frame
         * used for this system into the local geodetic frame, at observation time (obTime). The
         * array element order convention is scalar component first, followed by the three vector
         * components (qc, q1, q2, q3).
         */
        fun senQuat(senQuat: List<Double>) = senQuat(JsonField.of(senQuat))

        /**
         * Sets [Builder.senQuat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senQuat] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senQuat(senQuat: JsonField<List<Double>>) = apply {
            this.senQuat = senQuat.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.senQuat].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSenQuat(senQuat: Double) = apply {
            this.senQuat =
                (this.senQuat ?: JsonField.of(mutableListOf())).also {
                    checkKnown("senQuat", it).add(senQuat)
                }
        }

        /**
         * The reference frame of the observing sensor state. If the senReferenceFrame is null it is
         * assumed to be J2000.
         */
        fun senReferenceFrame(senReferenceFrame: SenReferenceFrame) =
            senReferenceFrame(JsonField.of(senReferenceFrame))

        /**
         * Sets [Builder.senReferenceFrame] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senReferenceFrame] with a well-typed [SenReferenceFrame]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun senReferenceFrame(senReferenceFrame: JsonField<SenReferenceFrame>) = apply {
            this.senReferenceFrame = senReferenceFrame
        }

        /**
         * Cartesian X velocity of the observing mobile/onorbit sensor at obTime, in km/sec, in the
         * specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
         */
        fun senvelx(senvelx: Double) = senvelx(JsonField.of(senvelx))

        /**
         * Sets [Builder.senvelx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senvelx] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senvelx(senvelx: JsonField<Double>) = apply { this.senvelx = senvelx }

        /**
         * Cartesian Y velocity of the observing mobile/onorbit sensor at obTime, in km/sec, in the
         * specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
         */
        fun senvely(senvely: Double) = senvely(JsonField.of(senvely))

        /**
         * Sets [Builder.senvely] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senvely] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senvely(senvely: JsonField<Double>) = apply { this.senvely = senvely }

        /**
         * Cartesian Z velocity of the observing mobile/onorbit sensor at obTime, in km/sec, in the
         * specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
         */
        fun senvelz(senvelz: Double) = senvelz(JsonField.of(senvelz))

        /**
         * Sets [Builder.senvelz] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senvelz] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senvelz(senvelz: JsonField<Double>) = apply { this.senvelz = senvelz }

        /**
         * Cartesian X position of the observing mobile/onorbit sensor at obTime, in km, in the
         * specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
         */
        fun senx(senx: Double) = senx(JsonField.of(senx))

        /**
         * Sets [Builder.senx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senx] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senx(senx: JsonField<Double>) = apply { this.senx = senx }

        /**
         * Cartesian Y position of the observing mobile/onorbit sensor at obTime, in km, in the
         * specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
         */
        fun seny(seny: Double) = seny(JsonField.of(seny))

        /**
         * Sets [Builder.seny] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seny] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun seny(seny: JsonField<Double>) = apply { this.seny = seny }

        /**
         * Cartesian Z position of the observing mobile/onorbit sensor at obTime, in km, in the
         * specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
         */
        fun senz(senz: Double) = senz(JsonField.of(senz))

        /**
         * Sets [Builder.senz] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senz] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senz(senz: JsonField<Double>) = apply { this.senz = senz }

        /** Shutter delay in seconds. */
        fun shutterDelay(shutterDelay: Double) = shutterDelay(JsonField.of(shutterDelay))

        /**
         * Sets [Builder.shutterDelay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shutterDelay] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shutterDelay(shutterDelay: JsonField<Double>) = apply {
            this.shutterDelay = shutterDelay
        }

        /**
         * Average Sky Background signal, in Magnitudes. Sky Background refers to the incoming light
         * from an apparently empty part of the night sky.
         */
        fun skyBkgrnd(skyBkgrnd: Double) = skyBkgrnd(JsonField.of(skyBkgrnd))

        /**
         * Sets [Builder.skyBkgrnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skyBkgrnd] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun skyBkgrnd(skyBkgrnd: JsonField<Double>) = apply { this.skyBkgrnd = skyBkgrnd }

        /** Angle from the sun to the equatorial plane. */
        fun solarDecAngle(solarDecAngle: Double) = solarDecAngle(JsonField.of(solarDecAngle))

        /**
         * Sets [Builder.solarDecAngle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solarDecAngle] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun solarDecAngle(solarDecAngle: JsonField<Double>) = apply {
            this.solarDecAngle = solarDecAngle
        }

        /**
         * The angle, in degrees, between the projections of the target-to-observer vector and the
         * target-to-sun vector onto the equatorial plane. The angle is represented as negative when
         * closing (i.e. before the opposition) and positive when opening (after the opposition).
         */
        fun solarEqPhaseAngle(solarEqPhaseAngle: Double) =
            solarEqPhaseAngle(JsonField.of(solarEqPhaseAngle))

        /**
         * Sets [Builder.solarEqPhaseAngle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solarEqPhaseAngle] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun solarEqPhaseAngle(solarEqPhaseAngle: JsonField<Double>) = apply {
            this.solarEqPhaseAngle = solarEqPhaseAngle
        }

        /**
         * The angle, in degrees, between the target-to-observer vector and the target-to-sun
         * vector.
         */
        fun solarPhaseAngle(solarPhaseAngle: Double) =
            solarPhaseAngle(JsonField.of(solarPhaseAngle))

        /**
         * Sets [Builder.solarPhaseAngle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solarPhaseAngle] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun solarPhaseAngle(solarPhaseAngle: JsonField<Double>) = apply {
            this.solarPhaseAngle = solarPhaseAngle
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

        /** Optional identifier to indicate the specific tasking which produced this observation. */
        fun taskId(taskId: String) = taskId(JsonField.of(taskId))

        /**
         * Sets [Builder.taskId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taskId(taskId: JsonField<String>) = apply { this.taskId = taskId }

        /** Sensor timing bias in seconds. */
        fun timingBias(timingBias: Double) = timingBias(JsonField.of(timingBias))

        /**
         * Sets [Builder.timingBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timingBias] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timingBias(timingBias: JsonField<Double>) = apply { this.timingBias = timingBias }

        /** Optional identifier of the track to which this observation belongs. */
        fun trackId(trackId: String) = trackId(JsonField.of(trackId))

        /**
         * Sets [Builder.trackId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trackId(trackId: JsonField<String>) = apply { this.trackId = trackId }

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
         * Read only field specifying the type of observation (e.g. OPTICAL, OPTICAL_IR,
         * LASER_RANGING, etc).
         */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /**
         * Boolean indicating this observation is part of an uncorrelated track or was unable to be
         * correlated to a known object. This flag should only be set to true by data providers
         * after an attempt to correlate to an on-orbit object was made and failed. If unable to
         * correlate, the 'origObjectId' field may be populated with an internal data provider
         * specific identifier.
         */
        fun uct(uct: Boolean) = uct(JsonField.of(uct))

        /**
         * Sets [Builder.uct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uct] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uct(uct: JsonField<Boolean>) = apply { this.uct = uct }

        /**
         * Boolean indicating that the target object was in umbral eclipse at the time of this
         * observation.
         */
        fun umbra(umbra: Boolean) = umbra(JsonField.of(umbra))

        /**
         * Sets [Builder.umbra] to an arbitrary JSON value.
         *
         * You should usually call [Builder.umbra] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun umbra(umbra: JsonField<Boolean>) = apply { this.umbra = umbra }

        /** Formula: 2.5 \* log_10 (zero_mag_counts / expDuration). */
        fun zeroptd(zeroptd: Double) = zeroptd(JsonField.of(zeroptd))

        /**
         * Sets [Builder.zeroptd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zeroptd] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zeroptd(zeroptd: JsonField<Double>) = apply { this.zeroptd = zeroptd }

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
         * Returns an immutable instance of [EoObservationAbridged].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .obTime()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EoObservationAbridged =
            EoObservationAbridged(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("obTime", obTime),
                checkRequired("source", source),
                id,
                azimuth,
                azimuthBias,
                azimuthMeasured,
                azimuthRate,
                azimuthUnc,
                bgIntensity,
                collectMethod,
                corrQuality,
                createdAt,
                createdBy,
                declination,
                declinationBias,
                declinationMeasured,
                declinationRate,
                declinationUnc,
                descriptor,
                elevation,
                elevationBias,
                elevationMeasured,
                elevationRate,
                elevationUnc,
                expDuration,
                fovCount,
                fovCountUct,
                geoalt,
                geolat,
                geolon,
                georange,
                idOnOrbit,
                idSensor,
                idSkyImagery,
                intensity,
                losUnc,
                losx,
                losxvel,
                losy,
                losyvel,
                losz,
                loszvel,
                mag,
                magNormRange,
                magUnc,
                netObjSig,
                netObjSigUnc,
                obPosition,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                penumbra,
                primaryExtinction,
                primaryExtinctionUnc,
                ra,
                raBias,
                raMeasured,
                range,
                rangeBias,
                rangeMeasured,
                rangeRate,
                rangeRateMeasured,
                rangeRateUnc,
                rangeUnc,
                raRate,
                raUnc,
                rawFileUri,
                referenceFrame,
                satNo,
                senalt,
                senlat,
                senlon,
                (senQuat ?: JsonMissing.of()).map { it.toImmutable() },
                senReferenceFrame,
                senvelx,
                senvely,
                senvelz,
                senx,
                seny,
                senz,
                shutterDelay,
                skyBkgrnd,
                solarDecAngle,
                solarEqPhaseAngle,
                solarPhaseAngle,
                sourceDl,
                taskId,
                timingBias,
                trackId,
                transactionId,
                type,
                uct,
                umbra,
                zeroptd,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EoObservationAbridged = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        obTime()
        source()
        id()
        azimuth()
        azimuthBias()
        azimuthMeasured()
        azimuthRate()
        azimuthUnc()
        bgIntensity()
        collectMethod()
        corrQuality()
        createdAt()
        createdBy()
        declination()
        declinationBias()
        declinationMeasured()
        declinationRate()
        declinationUnc()
        descriptor()
        elevation()
        elevationBias()
        elevationMeasured()
        elevationRate()
        elevationUnc()
        expDuration()
        fovCount()
        fovCountUct()
        geoalt()
        geolat()
        geolon()
        georange()
        idOnOrbit()
        idSensor()
        idSkyImagery()
        intensity()
        losUnc()
        losx()
        losxvel()
        losy()
        losyvel()
        losz()
        loszvel()
        mag()
        magNormRange()
        magUnc()
        netObjSig()
        netObjSigUnc()
        obPosition()
        origin()
        origNetwork()
        origObjectId()
        origSensorId()
        penumbra()
        primaryExtinction()
        primaryExtinctionUnc()
        ra()
        raBias()
        raMeasured()
        range()
        rangeBias()
        rangeMeasured()
        rangeRate()
        rangeRateMeasured()
        rangeRateUnc()
        rangeUnc()
        raRate()
        raUnc()
        rawFileUri()
        referenceFrame().ifPresent { it.validate() }
        satNo()
        senalt()
        senlat()
        senlon()
        senQuat()
        senReferenceFrame().ifPresent { it.validate() }
        senvelx()
        senvely()
        senvelz()
        senx()
        seny()
        senz()
        shutterDelay()
        skyBkgrnd()
        solarDecAngle()
        solarEqPhaseAngle()
        solarPhaseAngle()
        sourceDl()
        taskId()
        timingBias()
        trackId()
        transactionId()
        type()
        uct()
        umbra()
        zeroptd()
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
            (if (obTime.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (azimuth.asKnown().isPresent) 1 else 0) +
            (if (azimuthBias.asKnown().isPresent) 1 else 0) +
            (if (azimuthMeasured.asKnown().isPresent) 1 else 0) +
            (if (azimuthRate.asKnown().isPresent) 1 else 0) +
            (if (azimuthUnc.asKnown().isPresent) 1 else 0) +
            (if (bgIntensity.asKnown().isPresent) 1 else 0) +
            (if (collectMethod.asKnown().isPresent) 1 else 0) +
            (if (corrQuality.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (declination.asKnown().isPresent) 1 else 0) +
            (if (declinationBias.asKnown().isPresent) 1 else 0) +
            (if (declinationMeasured.asKnown().isPresent) 1 else 0) +
            (if (declinationRate.asKnown().isPresent) 1 else 0) +
            (if (declinationUnc.asKnown().isPresent) 1 else 0) +
            (if (descriptor.asKnown().isPresent) 1 else 0) +
            (if (elevation.asKnown().isPresent) 1 else 0) +
            (if (elevationBias.asKnown().isPresent) 1 else 0) +
            (if (elevationMeasured.asKnown().isPresent) 1 else 0) +
            (if (elevationRate.asKnown().isPresent) 1 else 0) +
            (if (elevationUnc.asKnown().isPresent) 1 else 0) +
            (if (expDuration.asKnown().isPresent) 1 else 0) +
            (if (fovCount.asKnown().isPresent) 1 else 0) +
            (if (fovCountUct.asKnown().isPresent) 1 else 0) +
            (if (geoalt.asKnown().isPresent) 1 else 0) +
            (if (geolat.asKnown().isPresent) 1 else 0) +
            (if (geolon.asKnown().isPresent) 1 else 0) +
            (if (georange.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (idSkyImagery.asKnown().isPresent) 1 else 0) +
            (if (intensity.asKnown().isPresent) 1 else 0) +
            (if (losUnc.asKnown().isPresent) 1 else 0) +
            (if (losx.asKnown().isPresent) 1 else 0) +
            (if (losxvel.asKnown().isPresent) 1 else 0) +
            (if (losy.asKnown().isPresent) 1 else 0) +
            (if (losyvel.asKnown().isPresent) 1 else 0) +
            (if (losz.asKnown().isPresent) 1 else 0) +
            (if (loszvel.asKnown().isPresent) 1 else 0) +
            (if (mag.asKnown().isPresent) 1 else 0) +
            (if (magNormRange.asKnown().isPresent) 1 else 0) +
            (if (magUnc.asKnown().isPresent) 1 else 0) +
            (if (netObjSig.asKnown().isPresent) 1 else 0) +
            (if (netObjSigUnc.asKnown().isPresent) 1 else 0) +
            (if (obPosition.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (if (penumbra.asKnown().isPresent) 1 else 0) +
            (if (primaryExtinction.asKnown().isPresent) 1 else 0) +
            (if (primaryExtinctionUnc.asKnown().isPresent) 1 else 0) +
            (if (ra.asKnown().isPresent) 1 else 0) +
            (if (raBias.asKnown().isPresent) 1 else 0) +
            (if (raMeasured.asKnown().isPresent) 1 else 0) +
            (if (range.asKnown().isPresent) 1 else 0) +
            (if (rangeBias.asKnown().isPresent) 1 else 0) +
            (if (rangeMeasured.asKnown().isPresent) 1 else 0) +
            (if (rangeRate.asKnown().isPresent) 1 else 0) +
            (if (rangeRateMeasured.asKnown().isPresent) 1 else 0) +
            (if (rangeRateUnc.asKnown().isPresent) 1 else 0) +
            (if (rangeUnc.asKnown().isPresent) 1 else 0) +
            (if (raRate.asKnown().isPresent) 1 else 0) +
            (if (raUnc.asKnown().isPresent) 1 else 0) +
            (if (rawFileUri.asKnown().isPresent) 1 else 0) +
            (referenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (senalt.asKnown().isPresent) 1 else 0) +
            (if (senlat.asKnown().isPresent) 1 else 0) +
            (if (senlon.asKnown().isPresent) 1 else 0) +
            (senQuat.asKnown().getOrNull()?.size ?: 0) +
            (senReferenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
            (if (senvelx.asKnown().isPresent) 1 else 0) +
            (if (senvely.asKnown().isPresent) 1 else 0) +
            (if (senvelz.asKnown().isPresent) 1 else 0) +
            (if (senx.asKnown().isPresent) 1 else 0) +
            (if (seny.asKnown().isPresent) 1 else 0) +
            (if (senz.asKnown().isPresent) 1 else 0) +
            (if (shutterDelay.asKnown().isPresent) 1 else 0) +
            (if (skyBkgrnd.asKnown().isPresent) 1 else 0) +
            (if (solarDecAngle.asKnown().isPresent) 1 else 0) +
            (if (solarEqPhaseAngle.asKnown().isPresent) 1 else 0) +
            (if (solarPhaseAngle.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (taskId.asKnown().isPresent) 1 else 0) +
            (if (timingBias.asKnown().isPresent) 1 else 0) +
            (if (trackId.asKnown().isPresent) 1 else 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (uct.asKnown().isPresent) 1 else 0) +
            (if (umbra.asKnown().isPresent) 1 else 0) +
            (if (zeroptd.asKnown().isPresent) 1 else 0)

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
     * The reference frame of the EOObservation measurements. If the referenceFrame is null it is
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

            @JvmField val GCRF = of("GCRF")

            @JvmField val ITRF = of("ITRF")

            @JvmField val TEME = of("TEME")

            @JvmStatic fun of(value: String) = ReferenceFrame(JsonField.of(value))
        }

        /** An enum containing [ReferenceFrame]'s known values. */
        enum class Known {
            J2000,
            GCRF,
            ITRF,
            TEME,
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
            GCRF,
            ITRF,
            TEME,
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
                GCRF -> Value.GCRF
                ITRF -> Value.ITRF
                TEME -> Value.TEME
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
                GCRF -> Known.GCRF
                ITRF -> Known.ITRF
                TEME -> Known.TEME
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

    /**
     * The reference frame of the observing sensor state. If the senReferenceFrame is null it is
     * assumed to be J2000.
     */
    class SenReferenceFrame @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmStatic fun of(value: String) = SenReferenceFrame(JsonField.of(value))
        }

        /** An enum containing [SenReferenceFrame]'s known values. */
        enum class Known {
            J2000,
            EFG_TDR,
            ECR_ECEF,
            TEME,
            ITRF,
            GCRF,
        }

        /**
         * An enum containing [SenReferenceFrame]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SenReferenceFrame] can contain an unknown value in a couple of cases:
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
             * An enum member indicating that [SenReferenceFrame] was instantiated with an unknown
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
                    throw UnifieddatalibraryInvalidDataException(
                        "Unknown SenReferenceFrame: $value"
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

        fun validate(): SenReferenceFrame = apply {
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

            return other is SenReferenceFrame && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EoObservationAbridged &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            obTime == other.obTime &&
            source == other.source &&
            id == other.id &&
            azimuth == other.azimuth &&
            azimuthBias == other.azimuthBias &&
            azimuthMeasured == other.azimuthMeasured &&
            azimuthRate == other.azimuthRate &&
            azimuthUnc == other.azimuthUnc &&
            bgIntensity == other.bgIntensity &&
            collectMethod == other.collectMethod &&
            corrQuality == other.corrQuality &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            declination == other.declination &&
            declinationBias == other.declinationBias &&
            declinationMeasured == other.declinationMeasured &&
            declinationRate == other.declinationRate &&
            declinationUnc == other.declinationUnc &&
            descriptor == other.descriptor &&
            elevation == other.elevation &&
            elevationBias == other.elevationBias &&
            elevationMeasured == other.elevationMeasured &&
            elevationRate == other.elevationRate &&
            elevationUnc == other.elevationUnc &&
            expDuration == other.expDuration &&
            fovCount == other.fovCount &&
            fovCountUct == other.fovCountUct &&
            geoalt == other.geoalt &&
            geolat == other.geolat &&
            geolon == other.geolon &&
            georange == other.georange &&
            idOnOrbit == other.idOnOrbit &&
            idSensor == other.idSensor &&
            idSkyImagery == other.idSkyImagery &&
            intensity == other.intensity &&
            losUnc == other.losUnc &&
            losx == other.losx &&
            losxvel == other.losxvel &&
            losy == other.losy &&
            losyvel == other.losyvel &&
            losz == other.losz &&
            loszvel == other.loszvel &&
            mag == other.mag &&
            magNormRange == other.magNormRange &&
            magUnc == other.magUnc &&
            netObjSig == other.netObjSig &&
            netObjSigUnc == other.netObjSigUnc &&
            obPosition == other.obPosition &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            origSensorId == other.origSensorId &&
            penumbra == other.penumbra &&
            primaryExtinction == other.primaryExtinction &&
            primaryExtinctionUnc == other.primaryExtinctionUnc &&
            ra == other.ra &&
            raBias == other.raBias &&
            raMeasured == other.raMeasured &&
            range == other.range &&
            rangeBias == other.rangeBias &&
            rangeMeasured == other.rangeMeasured &&
            rangeRate == other.rangeRate &&
            rangeRateMeasured == other.rangeRateMeasured &&
            rangeRateUnc == other.rangeRateUnc &&
            rangeUnc == other.rangeUnc &&
            raRate == other.raRate &&
            raUnc == other.raUnc &&
            rawFileUri == other.rawFileUri &&
            referenceFrame == other.referenceFrame &&
            satNo == other.satNo &&
            senalt == other.senalt &&
            senlat == other.senlat &&
            senlon == other.senlon &&
            senQuat == other.senQuat &&
            senReferenceFrame == other.senReferenceFrame &&
            senvelx == other.senvelx &&
            senvely == other.senvely &&
            senvelz == other.senvelz &&
            senx == other.senx &&
            seny == other.seny &&
            senz == other.senz &&
            shutterDelay == other.shutterDelay &&
            skyBkgrnd == other.skyBkgrnd &&
            solarDecAngle == other.solarDecAngle &&
            solarEqPhaseAngle == other.solarEqPhaseAngle &&
            solarPhaseAngle == other.solarPhaseAngle &&
            sourceDl == other.sourceDl &&
            taskId == other.taskId &&
            timingBias == other.timingBias &&
            trackId == other.trackId &&
            transactionId == other.transactionId &&
            type == other.type &&
            uct == other.uct &&
            umbra == other.umbra &&
            zeroptd == other.zeroptd &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            obTime,
            source,
            id,
            azimuth,
            azimuthBias,
            azimuthMeasured,
            azimuthRate,
            azimuthUnc,
            bgIntensity,
            collectMethod,
            corrQuality,
            createdAt,
            createdBy,
            declination,
            declinationBias,
            declinationMeasured,
            declinationRate,
            declinationUnc,
            descriptor,
            elevation,
            elevationBias,
            elevationMeasured,
            elevationRate,
            elevationUnc,
            expDuration,
            fovCount,
            fovCountUct,
            geoalt,
            geolat,
            geolon,
            georange,
            idOnOrbit,
            idSensor,
            idSkyImagery,
            intensity,
            losUnc,
            losx,
            losxvel,
            losy,
            losyvel,
            losz,
            loszvel,
            mag,
            magNormRange,
            magUnc,
            netObjSig,
            netObjSigUnc,
            obPosition,
            origin,
            origNetwork,
            origObjectId,
            origSensorId,
            penumbra,
            primaryExtinction,
            primaryExtinctionUnc,
            ra,
            raBias,
            raMeasured,
            range,
            rangeBias,
            rangeMeasured,
            rangeRate,
            rangeRateMeasured,
            rangeRateUnc,
            rangeUnc,
            raRate,
            raUnc,
            rawFileUri,
            referenceFrame,
            satNo,
            senalt,
            senlat,
            senlon,
            senQuat,
            senReferenceFrame,
            senvelx,
            senvely,
            senvelz,
            senx,
            seny,
            senz,
            shutterDelay,
            skyBkgrnd,
            solarDecAngle,
            solarEqPhaseAngle,
            solarPhaseAngle,
            sourceDl,
            taskId,
            timingBias,
            trackId,
            transactionId,
            type,
            uct,
            umbra,
            zeroptd,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EoObservationAbridged{classificationMarking=$classificationMarking, dataMode=$dataMode, obTime=$obTime, source=$source, id=$id, azimuth=$azimuth, azimuthBias=$azimuthBias, azimuthMeasured=$azimuthMeasured, azimuthRate=$azimuthRate, azimuthUnc=$azimuthUnc, bgIntensity=$bgIntensity, collectMethod=$collectMethod, corrQuality=$corrQuality, createdAt=$createdAt, createdBy=$createdBy, declination=$declination, declinationBias=$declinationBias, declinationMeasured=$declinationMeasured, declinationRate=$declinationRate, declinationUnc=$declinationUnc, descriptor=$descriptor, elevation=$elevation, elevationBias=$elevationBias, elevationMeasured=$elevationMeasured, elevationRate=$elevationRate, elevationUnc=$elevationUnc, expDuration=$expDuration, fovCount=$fovCount, fovCountUct=$fovCountUct, geoalt=$geoalt, geolat=$geolat, geolon=$geolon, georange=$georange, idOnOrbit=$idOnOrbit, idSensor=$idSensor, idSkyImagery=$idSkyImagery, intensity=$intensity, losUnc=$losUnc, losx=$losx, losxvel=$losxvel, losy=$losy, losyvel=$losyvel, losz=$losz, loszvel=$loszvel, mag=$mag, magNormRange=$magNormRange, magUnc=$magUnc, netObjSig=$netObjSig, netObjSigUnc=$netObjSigUnc, obPosition=$obPosition, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, penumbra=$penumbra, primaryExtinction=$primaryExtinction, primaryExtinctionUnc=$primaryExtinctionUnc, ra=$ra, raBias=$raBias, raMeasured=$raMeasured, range=$range, rangeBias=$rangeBias, rangeMeasured=$rangeMeasured, rangeRate=$rangeRate, rangeRateMeasured=$rangeRateMeasured, rangeRateUnc=$rangeRateUnc, rangeUnc=$rangeUnc, raRate=$raRate, raUnc=$raUnc, rawFileUri=$rawFileUri, referenceFrame=$referenceFrame, satNo=$satNo, senalt=$senalt, senlat=$senlat, senlon=$senlon, senQuat=$senQuat, senReferenceFrame=$senReferenceFrame, senvelx=$senvelx, senvely=$senvely, senvelz=$senvelz, senx=$senx, seny=$seny, senz=$senz, shutterDelay=$shutterDelay, skyBkgrnd=$skyBkgrnd, solarDecAngle=$solarDecAngle, solarEqPhaseAngle=$solarEqPhaseAngle, solarPhaseAngle=$solarPhaseAngle, sourceDl=$sourceDl, taskId=$taskId, timingBias=$timingBias, trackId=$trackId, transactionId=$transactionId, type=$type, uct=$uct, umbra=$umbra, zeroptd=$zeroptd, additionalProperties=$additionalProperties}"
}

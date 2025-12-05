// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensor.calibration

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
 * The Sensor Calibration service records data about a sensor's overall accuracy and is used to
 * adjust sensor settings to achieve and maintain that accuracy in reported sensor observations.
 * Calibration occurs periodically when needed to maintain sensor accuracy or on-demand to adjust a
 * sensor for a specific reading.
 */
class CalibrationTupleResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idSensor: JsonField<String>,
    private val source: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val azRaAccelBias: JsonField<Double>,
    private val azRaAccelSigma: JsonField<Double>,
    private val azRaBias: JsonField<Double>,
    private val azRaRateBias: JsonField<Double>,
    private val azRaRateSigma: JsonField<Double>,
    private val azRaRms: JsonField<Double>,
    private val azRaSigma: JsonField<Double>,
    private val calAngleRef: JsonField<String>,
    private val calTrackMode: JsonField<String>,
    private val calType: JsonField<String>,
    private val confidenceNoiseBias: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val duration: JsonField<Double>,
    private val ecr: JsonField<List<Double>>,
    private val elDecAccelBias: JsonField<Double>,
    private val elDecAccelSigma: JsonField<Double>,
    private val elDecBias: JsonField<Double>,
    private val elDecRateBias: JsonField<Double>,
    private val elDecRateSigma: JsonField<Double>,
    private val elDecRms: JsonField<Double>,
    private val elDecSigma: JsonField<Double>,
    private val endTime: JsonField<OffsetDateTime>,
    private val numAzRaObs: JsonField<Int>,
    private val numElDecObs: JsonField<Int>,
    private val numObs: JsonField<Int>,
    private val numPhotoObs: JsonField<Int>,
    private val numRangeObs: JsonField<Int>,
    private val numRangeRateObs: JsonField<Int>,
    private val numRcsObs: JsonField<Int>,
    private val numTimeObs: JsonField<Int>,
    private val numTracks: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val photoBias: JsonField<Double>,
    private val photoSigma: JsonField<Double>,
    private val rangeAccelBias: JsonField<Double>,
    private val rangeAccelSigma: JsonField<Double>,
    private val rangeBias: JsonField<Double>,
    private val rangeRateBias: JsonField<Double>,
    private val rangeRateRms: JsonField<Double>,
    private val rangeRateSigma: JsonField<Double>,
    private val rangeRms: JsonField<Double>,
    private val rangeSigma: JsonField<Double>,
    private val rcsBias: JsonField<Double>,
    private val rcsSigma: JsonField<Double>,
    private val refTargets: JsonField<List<String>>,
    private val refType: JsonField<String>,
    private val senType: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val timeBias: JsonField<Double>,
    private val timeBiasSigma: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("azRaAccelBias")
        @ExcludeMissing
        azRaAccelBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azRaAccelSigma")
        @ExcludeMissing
        azRaAccelSigma: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azRaBias") @ExcludeMissing azRaBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azRaRateBias")
        @ExcludeMissing
        azRaRateBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azRaRateSigma")
        @ExcludeMissing
        azRaRateSigma: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azRaRms") @ExcludeMissing azRaRms: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azRaSigma") @ExcludeMissing azRaSigma: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("calAngleRef")
        @ExcludeMissing
        calAngleRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("calTrackMode")
        @ExcludeMissing
        calTrackMode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("calType") @ExcludeMissing calType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("confidenceNoiseBias")
        @ExcludeMissing
        confidenceNoiseBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ecr") @ExcludeMissing ecr: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("elDecAccelBias")
        @ExcludeMissing
        elDecAccelBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elDecAccelSigma")
        @ExcludeMissing
        elDecAccelSigma: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elDecBias") @ExcludeMissing elDecBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elDecRateBias")
        @ExcludeMissing
        elDecRateBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elDecRateSigma")
        @ExcludeMissing
        elDecRateSigma: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elDecRms") @ExcludeMissing elDecRms: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elDecSigma")
        @ExcludeMissing
        elDecSigma: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("endTime")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("numAzRaObs") @ExcludeMissing numAzRaObs: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numElDecObs") @ExcludeMissing numElDecObs: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numObs") @ExcludeMissing numObs: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numPhotoObs") @ExcludeMissing numPhotoObs: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numRangeObs") @ExcludeMissing numRangeObs: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numRangeRateObs")
        @ExcludeMissing
        numRangeRateObs: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numRcsObs") @ExcludeMissing numRcsObs: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numTimeObs") @ExcludeMissing numTimeObs: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numTracks") @ExcludeMissing numTracks: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("photoBias") @ExcludeMissing photoBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("photoSigma")
        @ExcludeMissing
        photoSigma: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rangeAccelBias")
        @ExcludeMissing
        rangeAccelBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rangeAccelSigma")
        @ExcludeMissing
        rangeAccelSigma: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rangeBias") @ExcludeMissing rangeBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rangeRateBias")
        @ExcludeMissing
        rangeRateBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rangeRateRms")
        @ExcludeMissing
        rangeRateRms: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rangeRateSigma")
        @ExcludeMissing
        rangeRateSigma: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rangeRms") @ExcludeMissing rangeRms: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rangeSigma")
        @ExcludeMissing
        rangeSigma: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rcsBias") @ExcludeMissing rcsBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rcsSigma") @ExcludeMissing rcsSigma: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("refTargets")
        @ExcludeMissing
        refTargets: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("refType") @ExcludeMissing refType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("senType") @ExcludeMissing senType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeBias") @ExcludeMissing timeBias: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("timeBiasSigma")
        @ExcludeMissing
        timeBiasSigma: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idSensor,
        source,
        startTime,
        id,
        azRaAccelBias,
        azRaAccelSigma,
        azRaBias,
        azRaRateBias,
        azRaRateSigma,
        azRaRms,
        azRaSigma,
        calAngleRef,
        calTrackMode,
        calType,
        confidenceNoiseBias,
        createdAt,
        createdBy,
        duration,
        ecr,
        elDecAccelBias,
        elDecAccelSigma,
        elDecBias,
        elDecRateBias,
        elDecRateSigma,
        elDecRms,
        elDecSigma,
        endTime,
        numAzRaObs,
        numElDecObs,
        numObs,
        numPhotoObs,
        numRangeObs,
        numRangeRateObs,
        numRcsObs,
        numTimeObs,
        numTracks,
        origin,
        origNetwork,
        photoBias,
        photoSigma,
        rangeAccelBias,
        rangeAccelSigma,
        rangeBias,
        rangeRateBias,
        rangeRateRms,
        rangeRateSigma,
        rangeRms,
        rangeSigma,
        rcsBias,
        rcsSigma,
        refTargets,
        refType,
        senType,
        sourceDl,
        timeBias,
        timeBiasSigma,
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
     * Unique identifier of the sensor to which this calibration data applies. This ID can be used
     * to obtain additional information on a sensor using the 'get by ID' operation (e.g.
     * /udl/sensor/{id}). For example, the sensor with idSensor = abc would be queried as
     * /udl/sensor/abc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idSensor(): String = idSensor.getRequired("idSensor")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Calibration data span start time in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

    /**
     * Unique identifier of the record, auto-generated by the system if not provided on create
     * operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Sensor azimuth/right-ascension acceleration bias, in degrees per second squared.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azRaAccelBias(): Optional<Double> = azRaAccelBias.getOptional("azRaAccelBias")

    /**
     * The standard deviation of the azimuth/right ascension acceleration residuals, in degrees,
     * used to determine the sensor azimuth/right-ascension acceleration bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azRaAccelSigma(): Optional<Double> = azRaAccelSigma.getOptional("azRaAccelSigma")

    /**
     * Sensor azimuth/right-ascension bias, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azRaBias(): Optional<Double> = azRaBias.getOptional("azRaBias")

    /**
     * Sensor azimuth/right-ascension rate bias, in degrees per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azRaRateBias(): Optional<Double> = azRaRateBias.getOptional("azRaRateBias")

    /**
     * The standard deviation of the azimuth/right ascension rate residuals, in degrees, used to
     * determine the sensor azimuth/right-ascension rate bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azRaRateSigma(): Optional<Double> = azRaRateSigma.getOptional("azRaRateSigma")

    /**
     * The root mean square of the azimuth/right-ascension residuals, in degrees, used to determine
     * the sensor azimuth/right-ascension bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azRaRms(): Optional<Double> = azRaRms.getOptional("azRaRms")

    /**
     * The standard deviation of the azimuth/right ascension residuals, in degrees, used to
     * determine the sensor azimuth/right-ascension bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azRaSigma(): Optional<Double> = azRaSigma.getOptional("azRaSigma")

    /**
     * Specifies the calibration reference angle set for this calibration data set. Azimuth and
     * Elevation (AZEL) or Right Ascension and Declination (RADEC).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun calAngleRef(): Optional<String> = calAngleRef.getOptional("calAngleRef")

    /**
     * Specifies that the calibration data are from INTRA_TRACK or INTER_TRACK residuals.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun calTrackMode(): Optional<String> = calTrackMode.getOptional("calTrackMode")

    /**
     * The basis of calibration values contained in this record (COMPUTED, OPERATIONAL).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun calType(): Optional<String> = calType.getOptional("calType")

    /**
     * The confidence noise bias of the duration span.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun confidenceNoiseBias(): Optional<Double> =
        confidenceNoiseBias.getOptional("confidenceNoiseBias")

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
     * Duration of the sensor calibration data which produced these values, measured in days.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun duration(): Optional<Double> = duration.getOptional("duration")

    /**
     * Three element array, expressing the sensor location in Earth Centered Rotating (ECR)
     * coordinates, in kilometers. The array element order is [x, y, z].
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ecr(): Optional<List<Double>> = ecr.getOptional("ecr")

    /**
     * Sensor elevation/declination acceleration bias, in degrees per second squared.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elDecAccelBias(): Optional<Double> = elDecAccelBias.getOptional("elDecAccelBias")

    /**
     * The standard deviation of the elevation/declination acceleration residuals, in degrees, used
     * to determine the sensor elevation/declination acceleration bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elDecAccelSigma(): Optional<Double> = elDecAccelSigma.getOptional("elDecAccelSigma")

    /**
     * Sensor elevation/declination bias, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elDecBias(): Optional<Double> = elDecBias.getOptional("elDecBias")

    /**
     * Sensor elevation/declination rate bias, in degrees per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elDecRateBias(): Optional<Double> = elDecRateBias.getOptional("elDecRateBias")

    /**
     * The standard deviation of the elevation/declination rate residuals, in degrees, used to
     * determine the sensor elevation/declination rate bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elDecRateSigma(): Optional<Double> = elDecRateSigma.getOptional("elDecRateSigma")

    /**
     * The root mean square of the elevation/declination residuals, in degrees, used to determine
     * the sensor elevation/declination bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elDecRms(): Optional<Double> = elDecRms.getOptional("elDecRms")

    /**
     * The standard deviation of the elevation/declination residuals, in degrees, used to determine
     * the sensor elevation/declination bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elDecSigma(): Optional<Double> = elDecSigma.getOptional("elDecSigma")

    /**
     * Calibration data span end time in ISO 8601 UTC format with millisecond precision. If
     * provided, the endTime must be greater than or equal to the startTime in the SensorCalibration
     * record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("endTime")

    /**
     * The number of observables used in determining the azimuth or right-ascension calibration
     * values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numAzRaObs(): Optional<Int> = numAzRaObs.getOptional("numAzRaObs")

    /**
     * The number of observables used in determining the elevation or declination calibration
     * values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numElDecObs(): Optional<Int> = numElDecObs.getOptional("numElDecObs")

    /**
     * The total number of observables available over the calibration span.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numObs(): Optional<Int> = numObs.getOptional("numObs")

    /**
     * The number of observables used in determining the photometric calibration values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numPhotoObs(): Optional<Int> = numPhotoObs.getOptional("numPhotoObs")

    /**
     * The number of observables used in determining the range calibration values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numRangeObs(): Optional<Int> = numRangeObs.getOptional("numRangeObs")

    /**
     * The number of observables used in determining the range rate calibration values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numRangeRateObs(): Optional<Int> = numRangeRateObs.getOptional("numRangeRateObs")

    /**
     * The number of observables used in determining the radar cross section (RCS) calibration
     * values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numRcsObs(): Optional<Int> = numRcsObs.getOptional("numRcsObs")

    /**
     * The number of observables used in determining the time calibration values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numTimeObs(): Optional<Int> = numTimeObs.getOptional("numTimeObs")

    /**
     * The total number of tracks available over the calibration span.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numTracks(): Optional<Int> = numTracks.getOptional("numTracks")

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
     * The sensor photometric observation magnitude bias, in visual magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun photoBias(): Optional<Double> = photoBias.getOptional("photoBias")

    /**
     * The standard deviation of the magnitude residuals, in visual magnitude, used to determine the
     * photometric bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun photoSigma(): Optional<Double> = photoSigma.getOptional("photoSigma")

    /**
     * Sensor range rate acceleration bias, in kilometers per second squared.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeAccelBias(): Optional<Double> = rangeAccelBias.getOptional("rangeAccelBias")

    /**
     * The standard deviation of the range acceleration residuals, in kilometers per second squared,
     * used to determine the sensor range acceleration bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeAccelSigma(): Optional<Double> = rangeAccelSigma.getOptional("rangeAccelSigma")

    /**
     * Sensor range bias, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeBias(): Optional<Double> = rangeBias.getOptional("rangeBias")

    /**
     * Sensor range rate bias, in kilometers per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeRateBias(): Optional<Double> = rangeRateBias.getOptional("rangeRateBias")

    /**
     * The root mean square of the range rate residuals, in kilometers per second, used to determine
     * the sensor range rate bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeRateRms(): Optional<Double> = rangeRateRms.getOptional("rangeRateRms")

    /**
     * The standard deviation of the range rate residuals, in kilometers per second, used to
     * determine the sensor range rate bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeRateSigma(): Optional<Double> = rangeRateSigma.getOptional("rangeRateSigma")

    /**
     * The root mean square of the range residuals, in kilometers, used to determine the sensor
     * range bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeRms(): Optional<Double> = rangeRms.getOptional("rangeRms")

    /**
     * The standard deviation of the range residuals, in kilometers, used to determine the sensor
     * range bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeSigma(): Optional<Double> = rangeSigma.getOptional("rangeSigma")

    /**
     * The sensor radar cross section (RCS) observation bias, in square meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rcsBias(): Optional<Double> = rcsBias.getOptional("rcsBias")

    /**
     * The standard deviation of the radar cross section residuals, in square meters, used to
     * determine the radar cross section bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rcsSigma(): Optional<Double> = rcsSigma.getOptional("rcsSigma")

    /**
     * Array of the catalog IDs of the reference targets used in the calibration.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun refTargets(): Optional<List<String>> = refTargets.getOptional("refTargets")

    /**
     * The reference type used in the calibration.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun refType(): Optional<String> = refType.getOptional("refType")

    /**
     * The sensor type (MECHANICAL, OPTICAL, PHASED ARRAY, RF).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senType(): Optional<String> = senType.getOptional("senType")

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
     * Sensor time bias, in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun timeBias(): Optional<Double> = timeBias.getOptional("timeBias")

    /**
     * The standard deviation of the time residuals, in seconds, used to determine the sensor time
     * bias.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun timeBiasSigma(): Optional<Double> = timeBiasSigma.getOptional("timeBiasSigma")

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
     * Returns the raw JSON value of [idSensor].
     *
     * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

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
     * Returns the raw JSON value of [azRaAccelBias].
     *
     * Unlike [azRaAccelBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azRaAccelBias")
    @ExcludeMissing
    fun _azRaAccelBias(): JsonField<Double> = azRaAccelBias

    /**
     * Returns the raw JSON value of [azRaAccelSigma].
     *
     * Unlike [azRaAccelSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azRaAccelSigma")
    @ExcludeMissing
    fun _azRaAccelSigma(): JsonField<Double> = azRaAccelSigma

    /**
     * Returns the raw JSON value of [azRaBias].
     *
     * Unlike [azRaBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azRaBias") @ExcludeMissing fun _azRaBias(): JsonField<Double> = azRaBias

    /**
     * Returns the raw JSON value of [azRaRateBias].
     *
     * Unlike [azRaRateBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azRaRateBias")
    @ExcludeMissing
    fun _azRaRateBias(): JsonField<Double> = azRaRateBias

    /**
     * Returns the raw JSON value of [azRaRateSigma].
     *
     * Unlike [azRaRateSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azRaRateSigma")
    @ExcludeMissing
    fun _azRaRateSigma(): JsonField<Double> = azRaRateSigma

    /**
     * Returns the raw JSON value of [azRaRms].
     *
     * Unlike [azRaRms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azRaRms") @ExcludeMissing fun _azRaRms(): JsonField<Double> = azRaRms

    /**
     * Returns the raw JSON value of [azRaSigma].
     *
     * Unlike [azRaSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azRaSigma") @ExcludeMissing fun _azRaSigma(): JsonField<Double> = azRaSigma

    /**
     * Returns the raw JSON value of [calAngleRef].
     *
     * Unlike [calAngleRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("calAngleRef") @ExcludeMissing fun _calAngleRef(): JsonField<String> = calAngleRef

    /**
     * Returns the raw JSON value of [calTrackMode].
     *
     * Unlike [calTrackMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("calTrackMode")
    @ExcludeMissing
    fun _calTrackMode(): JsonField<String> = calTrackMode

    /**
     * Returns the raw JSON value of [calType].
     *
     * Unlike [calType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("calType") @ExcludeMissing fun _calType(): JsonField<String> = calType

    /**
     * Returns the raw JSON value of [confidenceNoiseBias].
     *
     * Unlike [confidenceNoiseBias], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("confidenceNoiseBias")
    @ExcludeMissing
    fun _confidenceNoiseBias(): JsonField<Double> = confidenceNoiseBias

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
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

    /**
     * Returns the raw JSON value of [ecr].
     *
     * Unlike [ecr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ecr") @ExcludeMissing fun _ecr(): JsonField<List<Double>> = ecr

    /**
     * Returns the raw JSON value of [elDecAccelBias].
     *
     * Unlike [elDecAccelBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elDecAccelBias")
    @ExcludeMissing
    fun _elDecAccelBias(): JsonField<Double> = elDecAccelBias

    /**
     * Returns the raw JSON value of [elDecAccelSigma].
     *
     * Unlike [elDecAccelSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elDecAccelSigma")
    @ExcludeMissing
    fun _elDecAccelSigma(): JsonField<Double> = elDecAccelSigma

    /**
     * Returns the raw JSON value of [elDecBias].
     *
     * Unlike [elDecBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elDecBias") @ExcludeMissing fun _elDecBias(): JsonField<Double> = elDecBias

    /**
     * Returns the raw JSON value of [elDecRateBias].
     *
     * Unlike [elDecRateBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elDecRateBias")
    @ExcludeMissing
    fun _elDecRateBias(): JsonField<Double> = elDecRateBias

    /**
     * Returns the raw JSON value of [elDecRateSigma].
     *
     * Unlike [elDecRateSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elDecRateSigma")
    @ExcludeMissing
    fun _elDecRateSigma(): JsonField<Double> = elDecRateSigma

    /**
     * Returns the raw JSON value of [elDecRms].
     *
     * Unlike [elDecRms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elDecRms") @ExcludeMissing fun _elDecRms(): JsonField<Double> = elDecRms

    /**
     * Returns the raw JSON value of [elDecSigma].
     *
     * Unlike [elDecSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elDecSigma") @ExcludeMissing fun _elDecSigma(): JsonField<Double> = elDecSigma

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [numAzRaObs].
     *
     * Unlike [numAzRaObs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numAzRaObs") @ExcludeMissing fun _numAzRaObs(): JsonField<Int> = numAzRaObs

    /**
     * Returns the raw JSON value of [numElDecObs].
     *
     * Unlike [numElDecObs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numElDecObs") @ExcludeMissing fun _numElDecObs(): JsonField<Int> = numElDecObs

    /**
     * Returns the raw JSON value of [numObs].
     *
     * Unlike [numObs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numObs") @ExcludeMissing fun _numObs(): JsonField<Int> = numObs

    /**
     * Returns the raw JSON value of [numPhotoObs].
     *
     * Unlike [numPhotoObs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numPhotoObs") @ExcludeMissing fun _numPhotoObs(): JsonField<Int> = numPhotoObs

    /**
     * Returns the raw JSON value of [numRangeObs].
     *
     * Unlike [numRangeObs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numRangeObs") @ExcludeMissing fun _numRangeObs(): JsonField<Int> = numRangeObs

    /**
     * Returns the raw JSON value of [numRangeRateObs].
     *
     * Unlike [numRangeRateObs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numRangeRateObs")
    @ExcludeMissing
    fun _numRangeRateObs(): JsonField<Int> = numRangeRateObs

    /**
     * Returns the raw JSON value of [numRcsObs].
     *
     * Unlike [numRcsObs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numRcsObs") @ExcludeMissing fun _numRcsObs(): JsonField<Int> = numRcsObs

    /**
     * Returns the raw JSON value of [numTimeObs].
     *
     * Unlike [numTimeObs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numTimeObs") @ExcludeMissing fun _numTimeObs(): JsonField<Int> = numTimeObs

    /**
     * Returns the raw JSON value of [numTracks].
     *
     * Unlike [numTracks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numTracks") @ExcludeMissing fun _numTracks(): JsonField<Int> = numTracks

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
     * Returns the raw JSON value of [photoBias].
     *
     * Unlike [photoBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("photoBias") @ExcludeMissing fun _photoBias(): JsonField<Double> = photoBias

    /**
     * Returns the raw JSON value of [photoSigma].
     *
     * Unlike [photoSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("photoSigma") @ExcludeMissing fun _photoSigma(): JsonField<Double> = photoSigma

    /**
     * Returns the raw JSON value of [rangeAccelBias].
     *
     * Unlike [rangeAccelBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeAccelBias")
    @ExcludeMissing
    fun _rangeAccelBias(): JsonField<Double> = rangeAccelBias

    /**
     * Returns the raw JSON value of [rangeAccelSigma].
     *
     * Unlike [rangeAccelSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeAccelSigma")
    @ExcludeMissing
    fun _rangeAccelSigma(): JsonField<Double> = rangeAccelSigma

    /**
     * Returns the raw JSON value of [rangeBias].
     *
     * Unlike [rangeBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeBias") @ExcludeMissing fun _rangeBias(): JsonField<Double> = rangeBias

    /**
     * Returns the raw JSON value of [rangeRateBias].
     *
     * Unlike [rangeRateBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeRateBias")
    @ExcludeMissing
    fun _rangeRateBias(): JsonField<Double> = rangeRateBias

    /**
     * Returns the raw JSON value of [rangeRateRms].
     *
     * Unlike [rangeRateRms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeRateRms")
    @ExcludeMissing
    fun _rangeRateRms(): JsonField<Double> = rangeRateRms

    /**
     * Returns the raw JSON value of [rangeRateSigma].
     *
     * Unlike [rangeRateSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeRateSigma")
    @ExcludeMissing
    fun _rangeRateSigma(): JsonField<Double> = rangeRateSigma

    /**
     * Returns the raw JSON value of [rangeRms].
     *
     * Unlike [rangeRms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeRms") @ExcludeMissing fun _rangeRms(): JsonField<Double> = rangeRms

    /**
     * Returns the raw JSON value of [rangeSigma].
     *
     * Unlike [rangeSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeSigma") @ExcludeMissing fun _rangeSigma(): JsonField<Double> = rangeSigma

    /**
     * Returns the raw JSON value of [rcsBias].
     *
     * Unlike [rcsBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rcsBias") @ExcludeMissing fun _rcsBias(): JsonField<Double> = rcsBias

    /**
     * Returns the raw JSON value of [rcsSigma].
     *
     * Unlike [rcsSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rcsSigma") @ExcludeMissing fun _rcsSigma(): JsonField<Double> = rcsSigma

    /**
     * Returns the raw JSON value of [refTargets].
     *
     * Unlike [refTargets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refTargets")
    @ExcludeMissing
    fun _refTargets(): JsonField<List<String>> = refTargets

    /**
     * Returns the raw JSON value of [refType].
     *
     * Unlike [refType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refType") @ExcludeMissing fun _refType(): JsonField<String> = refType

    /**
     * Returns the raw JSON value of [senType].
     *
     * Unlike [senType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senType") @ExcludeMissing fun _senType(): JsonField<String> = senType

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [timeBias].
     *
     * Unlike [timeBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeBias") @ExcludeMissing fun _timeBias(): JsonField<Double> = timeBias

    /**
     * Returns the raw JSON value of [timeBiasSigma].
     *
     * Unlike [timeBiasSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeBiasSigma")
    @ExcludeMissing
    fun _timeBiasSigma(): JsonField<Double> = timeBiasSigma

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
         * Returns a mutable builder for constructing an instance of [CalibrationTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idSensor()
         * .source()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CalibrationTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idSensor: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var azRaAccelBias: JsonField<Double> = JsonMissing.of()
        private var azRaAccelSigma: JsonField<Double> = JsonMissing.of()
        private var azRaBias: JsonField<Double> = JsonMissing.of()
        private var azRaRateBias: JsonField<Double> = JsonMissing.of()
        private var azRaRateSigma: JsonField<Double> = JsonMissing.of()
        private var azRaRms: JsonField<Double> = JsonMissing.of()
        private var azRaSigma: JsonField<Double> = JsonMissing.of()
        private var calAngleRef: JsonField<String> = JsonMissing.of()
        private var calTrackMode: JsonField<String> = JsonMissing.of()
        private var calType: JsonField<String> = JsonMissing.of()
        private var confidenceNoiseBias: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var duration: JsonField<Double> = JsonMissing.of()
        private var ecr: JsonField<MutableList<Double>>? = null
        private var elDecAccelBias: JsonField<Double> = JsonMissing.of()
        private var elDecAccelSigma: JsonField<Double> = JsonMissing.of()
        private var elDecBias: JsonField<Double> = JsonMissing.of()
        private var elDecRateBias: JsonField<Double> = JsonMissing.of()
        private var elDecRateSigma: JsonField<Double> = JsonMissing.of()
        private var elDecRms: JsonField<Double> = JsonMissing.of()
        private var elDecSigma: JsonField<Double> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var numAzRaObs: JsonField<Int> = JsonMissing.of()
        private var numElDecObs: JsonField<Int> = JsonMissing.of()
        private var numObs: JsonField<Int> = JsonMissing.of()
        private var numPhotoObs: JsonField<Int> = JsonMissing.of()
        private var numRangeObs: JsonField<Int> = JsonMissing.of()
        private var numRangeRateObs: JsonField<Int> = JsonMissing.of()
        private var numRcsObs: JsonField<Int> = JsonMissing.of()
        private var numTimeObs: JsonField<Int> = JsonMissing.of()
        private var numTracks: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var photoBias: JsonField<Double> = JsonMissing.of()
        private var photoSigma: JsonField<Double> = JsonMissing.of()
        private var rangeAccelBias: JsonField<Double> = JsonMissing.of()
        private var rangeAccelSigma: JsonField<Double> = JsonMissing.of()
        private var rangeBias: JsonField<Double> = JsonMissing.of()
        private var rangeRateBias: JsonField<Double> = JsonMissing.of()
        private var rangeRateRms: JsonField<Double> = JsonMissing.of()
        private var rangeRateSigma: JsonField<Double> = JsonMissing.of()
        private var rangeRms: JsonField<Double> = JsonMissing.of()
        private var rangeSigma: JsonField<Double> = JsonMissing.of()
        private var rcsBias: JsonField<Double> = JsonMissing.of()
        private var rcsSigma: JsonField<Double> = JsonMissing.of()
        private var refTargets: JsonField<MutableList<String>>? = null
        private var refType: JsonField<String> = JsonMissing.of()
        private var senType: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var timeBias: JsonField<Double> = JsonMissing.of()
        private var timeBiasSigma: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(calibrationTupleResponse: CalibrationTupleResponse) = apply {
            classificationMarking = calibrationTupleResponse.classificationMarking
            dataMode = calibrationTupleResponse.dataMode
            idSensor = calibrationTupleResponse.idSensor
            source = calibrationTupleResponse.source
            startTime = calibrationTupleResponse.startTime
            id = calibrationTupleResponse.id
            azRaAccelBias = calibrationTupleResponse.azRaAccelBias
            azRaAccelSigma = calibrationTupleResponse.azRaAccelSigma
            azRaBias = calibrationTupleResponse.azRaBias
            azRaRateBias = calibrationTupleResponse.azRaRateBias
            azRaRateSigma = calibrationTupleResponse.azRaRateSigma
            azRaRms = calibrationTupleResponse.azRaRms
            azRaSigma = calibrationTupleResponse.azRaSigma
            calAngleRef = calibrationTupleResponse.calAngleRef
            calTrackMode = calibrationTupleResponse.calTrackMode
            calType = calibrationTupleResponse.calType
            confidenceNoiseBias = calibrationTupleResponse.confidenceNoiseBias
            createdAt = calibrationTupleResponse.createdAt
            createdBy = calibrationTupleResponse.createdBy
            duration = calibrationTupleResponse.duration
            ecr = calibrationTupleResponse.ecr.map { it.toMutableList() }
            elDecAccelBias = calibrationTupleResponse.elDecAccelBias
            elDecAccelSigma = calibrationTupleResponse.elDecAccelSigma
            elDecBias = calibrationTupleResponse.elDecBias
            elDecRateBias = calibrationTupleResponse.elDecRateBias
            elDecRateSigma = calibrationTupleResponse.elDecRateSigma
            elDecRms = calibrationTupleResponse.elDecRms
            elDecSigma = calibrationTupleResponse.elDecSigma
            endTime = calibrationTupleResponse.endTime
            numAzRaObs = calibrationTupleResponse.numAzRaObs
            numElDecObs = calibrationTupleResponse.numElDecObs
            numObs = calibrationTupleResponse.numObs
            numPhotoObs = calibrationTupleResponse.numPhotoObs
            numRangeObs = calibrationTupleResponse.numRangeObs
            numRangeRateObs = calibrationTupleResponse.numRangeRateObs
            numRcsObs = calibrationTupleResponse.numRcsObs
            numTimeObs = calibrationTupleResponse.numTimeObs
            numTracks = calibrationTupleResponse.numTracks
            origin = calibrationTupleResponse.origin
            origNetwork = calibrationTupleResponse.origNetwork
            photoBias = calibrationTupleResponse.photoBias
            photoSigma = calibrationTupleResponse.photoSigma
            rangeAccelBias = calibrationTupleResponse.rangeAccelBias
            rangeAccelSigma = calibrationTupleResponse.rangeAccelSigma
            rangeBias = calibrationTupleResponse.rangeBias
            rangeRateBias = calibrationTupleResponse.rangeRateBias
            rangeRateRms = calibrationTupleResponse.rangeRateRms
            rangeRateSigma = calibrationTupleResponse.rangeRateSigma
            rangeRms = calibrationTupleResponse.rangeRms
            rangeSigma = calibrationTupleResponse.rangeSigma
            rcsBias = calibrationTupleResponse.rcsBias
            rcsSigma = calibrationTupleResponse.rcsSigma
            refTargets = calibrationTupleResponse.refTargets.map { it.toMutableList() }
            refType = calibrationTupleResponse.refType
            senType = calibrationTupleResponse.senType
            sourceDl = calibrationTupleResponse.sourceDl
            timeBias = calibrationTupleResponse.timeBias
            timeBiasSigma = calibrationTupleResponse.timeBiasSigma
            additionalProperties = calibrationTupleResponse.additionalProperties.toMutableMap()
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
         * Unique identifier of the sensor to which this calibration data applies. This ID can be
         * used to obtain additional information on a sensor using the 'get by ID' operation (e.g.
         * /udl/sensor/{id}). For example, the sensor with idSensor = abc would be queried as
         * /udl/sensor/abc.
         */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Calibration data span start time in ISO 8601 UTC format with millisecond precision. */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

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

        /** Sensor azimuth/right-ascension acceleration bias, in degrees per second squared. */
        fun azRaAccelBias(azRaAccelBias: Double) = azRaAccelBias(JsonField.of(azRaAccelBias))

        /**
         * Sets [Builder.azRaAccelBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azRaAccelBias] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun azRaAccelBias(azRaAccelBias: JsonField<Double>) = apply {
            this.azRaAccelBias = azRaAccelBias
        }

        /**
         * The standard deviation of the azimuth/right ascension acceleration residuals, in degrees,
         * used to determine the sensor azimuth/right-ascension acceleration bias.
         */
        fun azRaAccelSigma(azRaAccelSigma: Double) = azRaAccelSigma(JsonField.of(azRaAccelSigma))

        /**
         * Sets [Builder.azRaAccelSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azRaAccelSigma] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun azRaAccelSigma(azRaAccelSigma: JsonField<Double>) = apply {
            this.azRaAccelSigma = azRaAccelSigma
        }

        /** Sensor azimuth/right-ascension bias, in degrees. */
        fun azRaBias(azRaBias: Double) = azRaBias(JsonField.of(azRaBias))

        /**
         * Sets [Builder.azRaBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azRaBias] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun azRaBias(azRaBias: JsonField<Double>) = apply { this.azRaBias = azRaBias }

        /** Sensor azimuth/right-ascension rate bias, in degrees per second. */
        fun azRaRateBias(azRaRateBias: Double) = azRaRateBias(JsonField.of(azRaRateBias))

        /**
         * Sets [Builder.azRaRateBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azRaRateBias] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun azRaRateBias(azRaRateBias: JsonField<Double>) = apply {
            this.azRaRateBias = azRaRateBias
        }

        /**
         * The standard deviation of the azimuth/right ascension rate residuals, in degrees, used to
         * determine the sensor azimuth/right-ascension rate bias.
         */
        fun azRaRateSigma(azRaRateSigma: Double) = azRaRateSigma(JsonField.of(azRaRateSigma))

        /**
         * Sets [Builder.azRaRateSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azRaRateSigma] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun azRaRateSigma(azRaRateSigma: JsonField<Double>) = apply {
            this.azRaRateSigma = azRaRateSigma
        }

        /**
         * The root mean square of the azimuth/right-ascension residuals, in degrees, used to
         * determine the sensor azimuth/right-ascension bias.
         */
        fun azRaRms(azRaRms: Double) = azRaRms(JsonField.of(azRaRms))

        /**
         * Sets [Builder.azRaRms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azRaRms] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun azRaRms(azRaRms: JsonField<Double>) = apply { this.azRaRms = azRaRms }

        /**
         * The standard deviation of the azimuth/right ascension residuals, in degrees, used to
         * determine the sensor azimuth/right-ascension bias.
         */
        fun azRaSigma(azRaSigma: Double) = azRaSigma(JsonField.of(azRaSigma))

        /**
         * Sets [Builder.azRaSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azRaSigma] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun azRaSigma(azRaSigma: JsonField<Double>) = apply { this.azRaSigma = azRaSigma }

        /**
         * Specifies the calibration reference angle set for this calibration data set. Azimuth and
         * Elevation (AZEL) or Right Ascension and Declination (RADEC).
         */
        fun calAngleRef(calAngleRef: String) = calAngleRef(JsonField.of(calAngleRef))

        /**
         * Sets [Builder.calAngleRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calAngleRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun calAngleRef(calAngleRef: JsonField<String>) = apply { this.calAngleRef = calAngleRef }

        /** Specifies that the calibration data are from INTRA_TRACK or INTER_TRACK residuals. */
        fun calTrackMode(calTrackMode: String) = calTrackMode(JsonField.of(calTrackMode))

        /**
         * Sets [Builder.calTrackMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calTrackMode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun calTrackMode(calTrackMode: JsonField<String>) = apply {
            this.calTrackMode = calTrackMode
        }

        /** The basis of calibration values contained in this record (COMPUTED, OPERATIONAL). */
        fun calType(calType: String) = calType(JsonField.of(calType))

        /**
         * Sets [Builder.calType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun calType(calType: JsonField<String>) = apply { this.calType = calType }

        /** The confidence noise bias of the duration span. */
        fun confidenceNoiseBias(confidenceNoiseBias: Double) =
            confidenceNoiseBias(JsonField.of(confidenceNoiseBias))

        /**
         * Sets [Builder.confidenceNoiseBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidenceNoiseBias] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun confidenceNoiseBias(confidenceNoiseBias: JsonField<Double>) = apply {
            this.confidenceNoiseBias = confidenceNoiseBias
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
         * Duration of the sensor calibration data which produced these values, measured in days.
         */
        fun duration(duration: Double) = duration(JsonField.of(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

        /**
         * Three element array, expressing the sensor location in Earth Centered Rotating (ECR)
         * coordinates, in kilometers. The array element order is [x, y, z].
         */
        fun ecr(ecr: List<Double>) = ecr(JsonField.of(ecr))

        /**
         * Sets [Builder.ecr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ecr] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ecr(ecr: JsonField<List<Double>>) = apply { this.ecr = ecr.map { it.toMutableList() } }

        /**
         * Adds a single [Double] to [Builder.ecr].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEcr(ecr: Double) = apply {
            this.ecr =
                (this.ecr ?: JsonField.of(mutableListOf())).also { checkKnown("ecr", it).add(ecr) }
        }

        /** Sensor elevation/declination acceleration bias, in degrees per second squared. */
        fun elDecAccelBias(elDecAccelBias: Double) = elDecAccelBias(JsonField.of(elDecAccelBias))

        /**
         * Sets [Builder.elDecAccelBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elDecAccelBias] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elDecAccelBias(elDecAccelBias: JsonField<Double>) = apply {
            this.elDecAccelBias = elDecAccelBias
        }

        /**
         * The standard deviation of the elevation/declination acceleration residuals, in degrees,
         * used to determine the sensor elevation/declination acceleration bias.
         */
        fun elDecAccelSigma(elDecAccelSigma: Double) =
            elDecAccelSigma(JsonField.of(elDecAccelSigma))

        /**
         * Sets [Builder.elDecAccelSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elDecAccelSigma] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elDecAccelSigma(elDecAccelSigma: JsonField<Double>) = apply {
            this.elDecAccelSigma = elDecAccelSigma
        }

        /** Sensor elevation/declination bias, in degrees. */
        fun elDecBias(elDecBias: Double) = elDecBias(JsonField.of(elDecBias))

        /**
         * Sets [Builder.elDecBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elDecBias] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun elDecBias(elDecBias: JsonField<Double>) = apply { this.elDecBias = elDecBias }

        /** Sensor elevation/declination rate bias, in degrees per second. */
        fun elDecRateBias(elDecRateBias: Double) = elDecRateBias(JsonField.of(elDecRateBias))

        /**
         * Sets [Builder.elDecRateBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elDecRateBias] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun elDecRateBias(elDecRateBias: JsonField<Double>) = apply {
            this.elDecRateBias = elDecRateBias
        }

        /**
         * The standard deviation of the elevation/declination rate residuals, in degrees, used to
         * determine the sensor elevation/declination rate bias.
         */
        fun elDecRateSigma(elDecRateSigma: Double) = elDecRateSigma(JsonField.of(elDecRateSigma))

        /**
         * Sets [Builder.elDecRateSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elDecRateSigma] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elDecRateSigma(elDecRateSigma: JsonField<Double>) = apply {
            this.elDecRateSigma = elDecRateSigma
        }

        /**
         * The root mean square of the elevation/declination residuals, in degrees, used to
         * determine the sensor elevation/declination bias.
         */
        fun elDecRms(elDecRms: Double) = elDecRms(JsonField.of(elDecRms))

        /**
         * Sets [Builder.elDecRms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elDecRms] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun elDecRms(elDecRms: JsonField<Double>) = apply { this.elDecRms = elDecRms }

        /**
         * The standard deviation of the elevation/declination residuals, in degrees, used to
         * determine the sensor elevation/declination bias.
         */
        fun elDecSigma(elDecSigma: Double) = elDecSigma(JsonField.of(elDecSigma))

        /**
         * Sets [Builder.elDecSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elDecSigma] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun elDecSigma(elDecSigma: JsonField<Double>) = apply { this.elDecSigma = elDecSigma }

        /**
         * Calibration data span end time in ISO 8601 UTC format with millisecond precision. If
         * provided, the endTime must be greater than or equal to the startTime in the
         * SensorCalibration record.
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
         * The number of observables used in determining the azimuth or right-ascension calibration
         * values.
         */
        fun numAzRaObs(numAzRaObs: Int) = numAzRaObs(JsonField.of(numAzRaObs))

        /**
         * Sets [Builder.numAzRaObs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numAzRaObs] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numAzRaObs(numAzRaObs: JsonField<Int>) = apply { this.numAzRaObs = numAzRaObs }

        /**
         * The number of observables used in determining the elevation or declination calibration
         * values.
         */
        fun numElDecObs(numElDecObs: Int) = numElDecObs(JsonField.of(numElDecObs))

        /**
         * Sets [Builder.numElDecObs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numElDecObs] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numElDecObs(numElDecObs: JsonField<Int>) = apply { this.numElDecObs = numElDecObs }

        /** The total number of observables available over the calibration span. */
        fun numObs(numObs: Int) = numObs(JsonField.of(numObs))

        /**
         * Sets [Builder.numObs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numObs] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numObs(numObs: JsonField<Int>) = apply { this.numObs = numObs }

        /** The number of observables used in determining the photometric calibration values. */
        fun numPhotoObs(numPhotoObs: Int) = numPhotoObs(JsonField.of(numPhotoObs))

        /**
         * Sets [Builder.numPhotoObs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numPhotoObs] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numPhotoObs(numPhotoObs: JsonField<Int>) = apply { this.numPhotoObs = numPhotoObs }

        /** The number of observables used in determining the range calibration values. */
        fun numRangeObs(numRangeObs: Int) = numRangeObs(JsonField.of(numRangeObs))

        /**
         * Sets [Builder.numRangeObs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numRangeObs] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numRangeObs(numRangeObs: JsonField<Int>) = apply { this.numRangeObs = numRangeObs }

        /** The number of observables used in determining the range rate calibration values. */
        fun numRangeRateObs(numRangeRateObs: Int) = numRangeRateObs(JsonField.of(numRangeRateObs))

        /**
         * Sets [Builder.numRangeRateObs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numRangeRateObs] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numRangeRateObs(numRangeRateObs: JsonField<Int>) = apply {
            this.numRangeRateObs = numRangeRateObs
        }

        /**
         * The number of observables used in determining the radar cross section (RCS) calibration
         * values.
         */
        fun numRcsObs(numRcsObs: Int) = numRcsObs(JsonField.of(numRcsObs))

        /**
         * Sets [Builder.numRcsObs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numRcsObs] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numRcsObs(numRcsObs: JsonField<Int>) = apply { this.numRcsObs = numRcsObs }

        /** The number of observables used in determining the time calibration values. */
        fun numTimeObs(numTimeObs: Int) = numTimeObs(JsonField.of(numTimeObs))

        /**
         * Sets [Builder.numTimeObs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numTimeObs] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numTimeObs(numTimeObs: JsonField<Int>) = apply { this.numTimeObs = numTimeObs }

        /** The total number of tracks available over the calibration span. */
        fun numTracks(numTracks: Int) = numTracks(JsonField.of(numTracks))

        /**
         * Sets [Builder.numTracks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numTracks] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numTracks(numTracks: JsonField<Int>) = apply { this.numTracks = numTracks }

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

        /** The sensor photometric observation magnitude bias, in visual magnitude. */
        fun photoBias(photoBias: Double) = photoBias(JsonField.of(photoBias))

        /**
         * Sets [Builder.photoBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.photoBias] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun photoBias(photoBias: JsonField<Double>) = apply { this.photoBias = photoBias }

        /**
         * The standard deviation of the magnitude residuals, in visual magnitude, used to determine
         * the photometric bias.
         */
        fun photoSigma(photoSigma: Double) = photoSigma(JsonField.of(photoSigma))

        /**
         * Sets [Builder.photoSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.photoSigma] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun photoSigma(photoSigma: JsonField<Double>) = apply { this.photoSigma = photoSigma }

        /** Sensor range rate acceleration bias, in kilometers per second squared. */
        fun rangeAccelBias(rangeAccelBias: Double) = rangeAccelBias(JsonField.of(rangeAccelBias))

        /**
         * Sets [Builder.rangeAccelBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeAccelBias] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rangeAccelBias(rangeAccelBias: JsonField<Double>) = apply {
            this.rangeAccelBias = rangeAccelBias
        }

        /**
         * The standard deviation of the range acceleration residuals, in kilometers per second
         * squared, used to determine the sensor range acceleration bias.
         */
        fun rangeAccelSigma(rangeAccelSigma: Double) =
            rangeAccelSigma(JsonField.of(rangeAccelSigma))

        /**
         * Sets [Builder.rangeAccelSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeAccelSigma] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rangeAccelSigma(rangeAccelSigma: JsonField<Double>) = apply {
            this.rangeAccelSigma = rangeAccelSigma
        }

        /** Sensor range bias, in kilometers. */
        fun rangeBias(rangeBias: Double) = rangeBias(JsonField.of(rangeBias))

        /**
         * Sets [Builder.rangeBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeBias] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rangeBias(rangeBias: JsonField<Double>) = apply { this.rangeBias = rangeBias }

        /** Sensor range rate bias, in kilometers per second. */
        fun rangeRateBias(rangeRateBias: Double) = rangeRateBias(JsonField.of(rangeRateBias))

        /**
         * Sets [Builder.rangeRateBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeRateBias] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rangeRateBias(rangeRateBias: JsonField<Double>) = apply {
            this.rangeRateBias = rangeRateBias
        }

        /**
         * The root mean square of the range rate residuals, in kilometers per second, used to
         * determine the sensor range rate bias.
         */
        fun rangeRateRms(rangeRateRms: Double) = rangeRateRms(JsonField.of(rangeRateRms))

        /**
         * Sets [Builder.rangeRateRms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeRateRms] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rangeRateRms(rangeRateRms: JsonField<Double>) = apply {
            this.rangeRateRms = rangeRateRms
        }

        /**
         * The standard deviation of the range rate residuals, in kilometers per second, used to
         * determine the sensor range rate bias.
         */
        fun rangeRateSigma(rangeRateSigma: Double) = rangeRateSigma(JsonField.of(rangeRateSigma))

        /**
         * Sets [Builder.rangeRateSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeRateSigma] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rangeRateSigma(rangeRateSigma: JsonField<Double>) = apply {
            this.rangeRateSigma = rangeRateSigma
        }

        /**
         * The root mean square of the range residuals, in kilometers, used to determine the sensor
         * range bias.
         */
        fun rangeRms(rangeRms: Double) = rangeRms(JsonField.of(rangeRms))

        /**
         * Sets [Builder.rangeRms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeRms] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rangeRms(rangeRms: JsonField<Double>) = apply { this.rangeRms = rangeRms }

        /**
         * The standard deviation of the range residuals, in kilometers, used to determine the
         * sensor range bias.
         */
        fun rangeSigma(rangeSigma: Double) = rangeSigma(JsonField.of(rangeSigma))

        /**
         * Sets [Builder.rangeSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeSigma] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rangeSigma(rangeSigma: JsonField<Double>) = apply { this.rangeSigma = rangeSigma }

        /** The sensor radar cross section (RCS) observation bias, in square meters. */
        fun rcsBias(rcsBias: Double) = rcsBias(JsonField.of(rcsBias))

        /**
         * Sets [Builder.rcsBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rcsBias] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rcsBias(rcsBias: JsonField<Double>) = apply { this.rcsBias = rcsBias }

        /**
         * The standard deviation of the radar cross section residuals, in square meters, used to
         * determine the radar cross section bias.
         */
        fun rcsSigma(rcsSigma: Double) = rcsSigma(JsonField.of(rcsSigma))

        /**
         * Sets [Builder.rcsSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rcsSigma] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rcsSigma(rcsSigma: JsonField<Double>) = apply { this.rcsSigma = rcsSigma }

        /** Array of the catalog IDs of the reference targets used in the calibration. */
        fun refTargets(refTargets: List<String>) = refTargets(JsonField.of(refTargets))

        /**
         * Sets [Builder.refTargets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refTargets] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun refTargets(refTargets: JsonField<List<String>>) = apply {
            this.refTargets = refTargets.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [refTargets].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRefTarget(refTarget: String) = apply {
            refTargets =
                (refTargets ?: JsonField.of(mutableListOf())).also {
                    checkKnown("refTargets", it).add(refTarget)
                }
        }

        /** The reference type used in the calibration. */
        fun refType(refType: String) = refType(JsonField.of(refType))

        /**
         * Sets [Builder.refType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun refType(refType: JsonField<String>) = apply { this.refType = refType }

        /** The sensor type (MECHANICAL, OPTICAL, PHASED ARRAY, RF). */
        fun senType(senType: String) = senType(JsonField.of(senType))

        /**
         * Sets [Builder.senType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senType(senType: JsonField<String>) = apply { this.senType = senType }

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

        /** Sensor time bias, in seconds. */
        fun timeBias(timeBias: Double) = timeBias(JsonField.of(timeBias))

        /**
         * Sets [Builder.timeBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeBias] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeBias(timeBias: JsonField<Double>) = apply { this.timeBias = timeBias }

        /**
         * The standard deviation of the time residuals, in seconds, used to determine the sensor
         * time bias.
         */
        fun timeBiasSigma(timeBiasSigma: Double) = timeBiasSigma(JsonField.of(timeBiasSigma))

        /**
         * Sets [Builder.timeBiasSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeBiasSigma] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeBiasSigma(timeBiasSigma: JsonField<Double>) = apply {
            this.timeBiasSigma = timeBiasSigma
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
         * Returns an immutable instance of [CalibrationTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idSensor()
         * .source()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CalibrationTupleResponse =
            CalibrationTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idSensor", idSensor),
                checkRequired("source", source),
                checkRequired("startTime", startTime),
                id,
                azRaAccelBias,
                azRaAccelSigma,
                azRaBias,
                azRaRateBias,
                azRaRateSigma,
                azRaRms,
                azRaSigma,
                calAngleRef,
                calTrackMode,
                calType,
                confidenceNoiseBias,
                createdAt,
                createdBy,
                duration,
                (ecr ?: JsonMissing.of()).map { it.toImmutable() },
                elDecAccelBias,
                elDecAccelSigma,
                elDecBias,
                elDecRateBias,
                elDecRateSigma,
                elDecRms,
                elDecSigma,
                endTime,
                numAzRaObs,
                numElDecObs,
                numObs,
                numPhotoObs,
                numRangeObs,
                numRangeRateObs,
                numRcsObs,
                numTimeObs,
                numTracks,
                origin,
                origNetwork,
                photoBias,
                photoSigma,
                rangeAccelBias,
                rangeAccelSigma,
                rangeBias,
                rangeRateBias,
                rangeRateRms,
                rangeRateSigma,
                rangeRms,
                rangeSigma,
                rcsBias,
                rcsSigma,
                (refTargets ?: JsonMissing.of()).map { it.toImmutable() },
                refType,
                senType,
                sourceDl,
                timeBias,
                timeBiasSigma,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CalibrationTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idSensor()
        source()
        startTime()
        id()
        azRaAccelBias()
        azRaAccelSigma()
        azRaBias()
        azRaRateBias()
        azRaRateSigma()
        azRaRms()
        azRaSigma()
        calAngleRef()
        calTrackMode()
        calType()
        confidenceNoiseBias()
        createdAt()
        createdBy()
        duration()
        ecr()
        elDecAccelBias()
        elDecAccelSigma()
        elDecBias()
        elDecRateBias()
        elDecRateSigma()
        elDecRms()
        elDecSigma()
        endTime()
        numAzRaObs()
        numElDecObs()
        numObs()
        numPhotoObs()
        numRangeObs()
        numRangeRateObs()
        numRcsObs()
        numTimeObs()
        numTracks()
        origin()
        origNetwork()
        photoBias()
        photoSigma()
        rangeAccelBias()
        rangeAccelSigma()
        rangeBias()
        rangeRateBias()
        rangeRateRms()
        rangeRateSigma()
        rangeRms()
        rangeSigma()
        rcsBias()
        rcsSigma()
        refTargets()
        refType()
        senType()
        sourceDl()
        timeBias()
        timeBiasSigma()
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
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (azRaAccelBias.asKnown().isPresent) 1 else 0) +
            (if (azRaAccelSigma.asKnown().isPresent) 1 else 0) +
            (if (azRaBias.asKnown().isPresent) 1 else 0) +
            (if (azRaRateBias.asKnown().isPresent) 1 else 0) +
            (if (azRaRateSigma.asKnown().isPresent) 1 else 0) +
            (if (azRaRms.asKnown().isPresent) 1 else 0) +
            (if (azRaSigma.asKnown().isPresent) 1 else 0) +
            (if (calAngleRef.asKnown().isPresent) 1 else 0) +
            (if (calTrackMode.asKnown().isPresent) 1 else 0) +
            (if (calType.asKnown().isPresent) 1 else 0) +
            (if (confidenceNoiseBias.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (duration.asKnown().isPresent) 1 else 0) +
            (ecr.asKnown().getOrNull()?.size ?: 0) +
            (if (elDecAccelBias.asKnown().isPresent) 1 else 0) +
            (if (elDecAccelSigma.asKnown().isPresent) 1 else 0) +
            (if (elDecBias.asKnown().isPresent) 1 else 0) +
            (if (elDecRateBias.asKnown().isPresent) 1 else 0) +
            (if (elDecRateSigma.asKnown().isPresent) 1 else 0) +
            (if (elDecRms.asKnown().isPresent) 1 else 0) +
            (if (elDecSigma.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (numAzRaObs.asKnown().isPresent) 1 else 0) +
            (if (numElDecObs.asKnown().isPresent) 1 else 0) +
            (if (numObs.asKnown().isPresent) 1 else 0) +
            (if (numPhotoObs.asKnown().isPresent) 1 else 0) +
            (if (numRangeObs.asKnown().isPresent) 1 else 0) +
            (if (numRangeRateObs.asKnown().isPresent) 1 else 0) +
            (if (numRcsObs.asKnown().isPresent) 1 else 0) +
            (if (numTimeObs.asKnown().isPresent) 1 else 0) +
            (if (numTracks.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (photoBias.asKnown().isPresent) 1 else 0) +
            (if (photoSigma.asKnown().isPresent) 1 else 0) +
            (if (rangeAccelBias.asKnown().isPresent) 1 else 0) +
            (if (rangeAccelSigma.asKnown().isPresent) 1 else 0) +
            (if (rangeBias.asKnown().isPresent) 1 else 0) +
            (if (rangeRateBias.asKnown().isPresent) 1 else 0) +
            (if (rangeRateRms.asKnown().isPresent) 1 else 0) +
            (if (rangeRateSigma.asKnown().isPresent) 1 else 0) +
            (if (rangeRms.asKnown().isPresent) 1 else 0) +
            (if (rangeSigma.asKnown().isPresent) 1 else 0) +
            (if (rcsBias.asKnown().isPresent) 1 else 0) +
            (if (rcsSigma.asKnown().isPresent) 1 else 0) +
            (refTargets.asKnown().getOrNull()?.size ?: 0) +
            (if (refType.asKnown().isPresent) 1 else 0) +
            (if (senType.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (timeBias.asKnown().isPresent) 1 else 0) +
            (if (timeBiasSigma.asKnown().isPresent) 1 else 0)

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

        return other is CalibrationTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            idSensor == other.idSensor &&
            source == other.source &&
            startTime == other.startTime &&
            id == other.id &&
            azRaAccelBias == other.azRaAccelBias &&
            azRaAccelSigma == other.azRaAccelSigma &&
            azRaBias == other.azRaBias &&
            azRaRateBias == other.azRaRateBias &&
            azRaRateSigma == other.azRaRateSigma &&
            azRaRms == other.azRaRms &&
            azRaSigma == other.azRaSigma &&
            calAngleRef == other.calAngleRef &&
            calTrackMode == other.calTrackMode &&
            calType == other.calType &&
            confidenceNoiseBias == other.confidenceNoiseBias &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            duration == other.duration &&
            ecr == other.ecr &&
            elDecAccelBias == other.elDecAccelBias &&
            elDecAccelSigma == other.elDecAccelSigma &&
            elDecBias == other.elDecBias &&
            elDecRateBias == other.elDecRateBias &&
            elDecRateSigma == other.elDecRateSigma &&
            elDecRms == other.elDecRms &&
            elDecSigma == other.elDecSigma &&
            endTime == other.endTime &&
            numAzRaObs == other.numAzRaObs &&
            numElDecObs == other.numElDecObs &&
            numObs == other.numObs &&
            numPhotoObs == other.numPhotoObs &&
            numRangeObs == other.numRangeObs &&
            numRangeRateObs == other.numRangeRateObs &&
            numRcsObs == other.numRcsObs &&
            numTimeObs == other.numTimeObs &&
            numTracks == other.numTracks &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            photoBias == other.photoBias &&
            photoSigma == other.photoSigma &&
            rangeAccelBias == other.rangeAccelBias &&
            rangeAccelSigma == other.rangeAccelSigma &&
            rangeBias == other.rangeBias &&
            rangeRateBias == other.rangeRateBias &&
            rangeRateRms == other.rangeRateRms &&
            rangeRateSigma == other.rangeRateSigma &&
            rangeRms == other.rangeRms &&
            rangeSigma == other.rangeSigma &&
            rcsBias == other.rcsBias &&
            rcsSigma == other.rcsSigma &&
            refTargets == other.refTargets &&
            refType == other.refType &&
            senType == other.senType &&
            sourceDl == other.sourceDl &&
            timeBias == other.timeBias &&
            timeBiasSigma == other.timeBiasSigma &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            idSensor,
            source,
            startTime,
            id,
            azRaAccelBias,
            azRaAccelSigma,
            azRaBias,
            azRaRateBias,
            azRaRateSigma,
            azRaRms,
            azRaSigma,
            calAngleRef,
            calTrackMode,
            calType,
            confidenceNoiseBias,
            createdAt,
            createdBy,
            duration,
            ecr,
            elDecAccelBias,
            elDecAccelSigma,
            elDecBias,
            elDecRateBias,
            elDecRateSigma,
            elDecRms,
            elDecSigma,
            endTime,
            numAzRaObs,
            numElDecObs,
            numObs,
            numPhotoObs,
            numRangeObs,
            numRangeRateObs,
            numRcsObs,
            numTimeObs,
            numTracks,
            origin,
            origNetwork,
            photoBias,
            photoSigma,
            rangeAccelBias,
            rangeAccelSigma,
            rangeBias,
            rangeRateBias,
            rangeRateRms,
            rangeRateSigma,
            rangeRms,
            rangeSigma,
            rcsBias,
            rcsSigma,
            refTargets,
            refType,
            senType,
            sourceDl,
            timeBias,
            timeBiasSigma,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CalibrationTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, idSensor=$idSensor, source=$source, startTime=$startTime, id=$id, azRaAccelBias=$azRaAccelBias, azRaAccelSigma=$azRaAccelSigma, azRaBias=$azRaBias, azRaRateBias=$azRaRateBias, azRaRateSigma=$azRaRateSigma, azRaRms=$azRaRms, azRaSigma=$azRaSigma, calAngleRef=$calAngleRef, calTrackMode=$calTrackMode, calType=$calType, confidenceNoiseBias=$confidenceNoiseBias, createdAt=$createdAt, createdBy=$createdBy, duration=$duration, ecr=$ecr, elDecAccelBias=$elDecAccelBias, elDecAccelSigma=$elDecAccelSigma, elDecBias=$elDecBias, elDecRateBias=$elDecRateBias, elDecRateSigma=$elDecRateSigma, elDecRms=$elDecRms, elDecSigma=$elDecSigma, endTime=$endTime, numAzRaObs=$numAzRaObs, numElDecObs=$numElDecObs, numObs=$numObs, numPhotoObs=$numPhotoObs, numRangeObs=$numRangeObs, numRangeRateObs=$numRangeRateObs, numRcsObs=$numRcsObs, numTimeObs=$numTimeObs, numTracks=$numTracks, origin=$origin, origNetwork=$origNetwork, photoBias=$photoBias, photoSigma=$photoSigma, rangeAccelBias=$rangeAccelBias, rangeAccelSigma=$rangeAccelSigma, rangeBias=$rangeBias, rangeRateBias=$rangeRateBias, rangeRateRms=$rangeRateRms, rangeRateSigma=$rangeRateSigma, rangeRms=$rangeRms, rangeSigma=$rangeSigma, rcsBias=$rcsBias, rcsSigma=$rcsSigma, refTargets=$refTargets, refType=$refType, senType=$senType, sourceDl=$sourceDl, timeBias=$timeBias, timeBiasSigma=$timeBiasSigma, additionalProperties=$additionalProperties}"
}

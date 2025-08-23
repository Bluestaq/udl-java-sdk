// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.soiobservationset

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

/** These services provide operations for posting space object idenfification observation sets. */
class SoiObservationSetListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val numObs: JsonField<Int>,
    private val source: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val id: JsonField<String>,
    private val binningHoriz: JsonField<Int>,
    private val binningVert: JsonField<Int>,
    private val brightnessVarianceChangeDetected: JsonField<Boolean>,
    private val calibrations: JsonField<List<Calibration>>,
    private val calibrationType: JsonField<String>,
    private val changeConf: JsonField<String>,
    private val changeDetected: JsonField<Boolean>,
    private val collectionDensityConf: JsonField<String>,
    private val collectionId: JsonField<String>,
    private val collectionMode: JsonField<String>,
    private val corrQuality: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val endTime: JsonField<OffsetDateTime>,
    private val gain: JsonField<Double>,
    private val idElset: JsonField<String>,
    private val idOnOrbit: JsonField<String>,
    private val idSensor: JsonField<String>,
    private val losDeclinationEnd: JsonField<Double>,
    private val losDeclinationStart: JsonField<Double>,
    private val msgCreateDate: JsonField<OffsetDateTime>,
    private val numSpectralFilters: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val percentSatThreshold: JsonField<Double>,
    private val periodicityChangeDetected: JsonField<Boolean>,
    private val periodicityDetectionConf: JsonField<String>,
    private val periodicitySamplingConf: JsonField<String>,
    private val pixelArrayHeight: JsonField<Int>,
    private val pixelArrayWidth: JsonField<Int>,
    private val pixelMax: JsonField<Int>,
    private val pixelMin: JsonField<Int>,
    private val pointingAngleAzEnd: JsonField<Double>,
    private val pointingAngleAzStart: JsonField<Double>,
    private val pointingAngleElEnd: JsonField<Double>,
    private val pointingAngleElStart: JsonField<Double>,
    private val polarAngleEnd: JsonField<Double>,
    private val polarAngleStart: JsonField<Double>,
    private val referenceFrame: JsonField<ReferenceFrame>,
    private val satelliteName: JsonField<String>,
    private val satNo: JsonField<Int>,
    private val senalt: JsonField<Double>,
    private val senlat: JsonField<Double>,
    private val senlon: JsonField<Double>,
    private val senReferenceFrame: JsonField<SenReferenceFrame>,
    private val sensorAsId: JsonField<String>,
    private val senvelx: JsonField<Double>,
    private val senvely: JsonField<Double>,
    private val senvelz: JsonField<Double>,
    private val senx: JsonField<Double>,
    private val seny: JsonField<Double>,
    private val senz: JsonField<Double>,
    private val softwareVersion: JsonField<String>,
    private val solarMag: JsonField<Double>,
    private val solarPhaseAngleBrightnessChangeDetected: JsonField<Boolean>,
    private val sourceDl: JsonField<String>,
    private val spectralFilters: JsonField<List<String>>,
    private val starCatName: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val transactionId: JsonField<String>,
    private val uct: JsonField<Boolean>,
    private val validCalibrations: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("numObs") @ExcludeMissing numObs: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("binningHoriz")
        @ExcludeMissing
        binningHoriz: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("binningVert") @ExcludeMissing binningVert: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("brightnessVarianceChangeDetected")
        @ExcludeMissing
        brightnessVarianceChangeDetected: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("calibrations")
        @ExcludeMissing
        calibrations: JsonField<List<Calibration>> = JsonMissing.of(),
        @JsonProperty("calibrationType")
        @ExcludeMissing
        calibrationType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("changeConf")
        @ExcludeMissing
        changeConf: JsonField<String> = JsonMissing.of(),
        @JsonProperty("changeDetected")
        @ExcludeMissing
        changeDetected: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("collectionDensityConf")
        @ExcludeMissing
        collectionDensityConf: JsonField<String> = JsonMissing.of(),
        @JsonProperty("collectionId")
        @ExcludeMissing
        collectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("collectionMode")
        @ExcludeMissing
        collectionMode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("corrQuality")
        @ExcludeMissing
        corrQuality: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endTime")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("gain") @ExcludeMissing gain: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idElset") @ExcludeMissing idElset: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("losDeclinationEnd")
        @ExcludeMissing
        losDeclinationEnd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("losDeclinationStart")
        @ExcludeMissing
        losDeclinationStart: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("msgCreateDate")
        @ExcludeMissing
        msgCreateDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("numSpectralFilters")
        @ExcludeMissing
        numSpectralFilters: JsonField<Int> = JsonMissing.of(),
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
        @JsonProperty("percentSatThreshold")
        @ExcludeMissing
        percentSatThreshold: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("periodicityChangeDetected")
        @ExcludeMissing
        periodicityChangeDetected: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("periodicityDetectionConf")
        @ExcludeMissing
        periodicityDetectionConf: JsonField<String> = JsonMissing.of(),
        @JsonProperty("periodicitySamplingConf")
        @ExcludeMissing
        periodicitySamplingConf: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pixelArrayHeight")
        @ExcludeMissing
        pixelArrayHeight: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("pixelArrayWidth")
        @ExcludeMissing
        pixelArrayWidth: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("pixelMax") @ExcludeMissing pixelMax: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("pixelMin") @ExcludeMissing pixelMin: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("pointingAngleAzEnd")
        @ExcludeMissing
        pointingAngleAzEnd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pointingAngleAzStart")
        @ExcludeMissing
        pointingAngleAzStart: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pointingAngleElEnd")
        @ExcludeMissing
        pointingAngleElEnd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pointingAngleElStart")
        @ExcludeMissing
        pointingAngleElStart: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("polarAngleEnd")
        @ExcludeMissing
        polarAngleEnd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("polarAngleStart")
        @ExcludeMissing
        polarAngleStart: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("referenceFrame")
        @ExcludeMissing
        referenceFrame: JsonField<ReferenceFrame> = JsonMissing.of(),
        @JsonProperty("satelliteName")
        @ExcludeMissing
        satelliteName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("senalt") @ExcludeMissing senalt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlat") @ExcludeMissing senlat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlon") @ExcludeMissing senlon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senReferenceFrame")
        @ExcludeMissing
        senReferenceFrame: JsonField<SenReferenceFrame> = JsonMissing.of(),
        @JsonProperty("sensorAsId")
        @ExcludeMissing
        sensorAsId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("senvelx") @ExcludeMissing senvelx: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senvely") @ExcludeMissing senvely: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senvelz") @ExcludeMissing senvelz: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senx") @ExcludeMissing senx: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("seny") @ExcludeMissing seny: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senz") @ExcludeMissing senz: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("softwareVersion")
        @ExcludeMissing
        softwareVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("solarMag") @ExcludeMissing solarMag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("solarPhaseAngleBrightnessChangeDetected")
        @ExcludeMissing
        solarPhaseAngleBrightnessChangeDetected: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spectralFilters")
        @ExcludeMissing
        spectralFilters: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("starCatName")
        @ExcludeMissing
        starCatName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uct") @ExcludeMissing uct: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("validCalibrations")
        @ExcludeMissing
        validCalibrations: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        numObs,
        source,
        startTime,
        type,
        id,
        binningHoriz,
        binningVert,
        brightnessVarianceChangeDetected,
        calibrations,
        calibrationType,
        changeConf,
        changeDetected,
        collectionDensityConf,
        collectionId,
        collectionMode,
        corrQuality,
        createdAt,
        createdBy,
        endTime,
        gain,
        idElset,
        idOnOrbit,
        idSensor,
        losDeclinationEnd,
        losDeclinationStart,
        msgCreateDate,
        numSpectralFilters,
        origin,
        origNetwork,
        origObjectId,
        origSensorId,
        percentSatThreshold,
        periodicityChangeDetected,
        periodicityDetectionConf,
        periodicitySamplingConf,
        pixelArrayHeight,
        pixelArrayWidth,
        pixelMax,
        pixelMin,
        pointingAngleAzEnd,
        pointingAngleAzStart,
        pointingAngleElEnd,
        pointingAngleElStart,
        polarAngleEnd,
        polarAngleStart,
        referenceFrame,
        satelliteName,
        satNo,
        senalt,
        senlat,
        senlon,
        senReferenceFrame,
        sensorAsId,
        senvelx,
        senvely,
        senvelz,
        senx,
        seny,
        senz,
        softwareVersion,
        solarMag,
        solarPhaseAngleBrightnessChangeDetected,
        sourceDl,
        spectralFilters,
        starCatName,
        tags,
        transactionId,
        uct,
        validCalibrations,
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
     * The number of observation records in the set.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numObs(): Int = numObs.getRequired("numObs")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Observation set detection start time in ISO 8601 UTC with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

    /**
     * Observation type (OPTICAL, RADAR).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The number of pixels binned horizontally.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun binningHoriz(): Optional<Int> = binningHoriz.getOptional("binningHoriz")

    /**
     * The number of pixels binned vertically.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun binningVert(): Optional<Int> = binningVert.getOptional("binningVert")

    /**
     * Boolean indicating if a brightness variance change event was detected, based on historical
     * collection data for the object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun brightnessVarianceChangeDetected(): Optional<Boolean> =
        brightnessVarianceChangeDetected.getOptional("brightnessVarianceChangeDetected")

    /**
     * Array of SOI Calibrations associated with this SOIObservationSet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun calibrations(): Optional<List<Calibration>> = calibrations.getOptional("calibrations")

    /**
     * Type of calibration used by the Sensor (e.g. ALL SKY, DIFFERENTIAL, DEFAULT, NONE).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun calibrationType(): Optional<String> = calibrationType.getOptional("calibrationType")

    /**
     * Overall qualitative confidence assessment of change detection results (e.g. HIGH, MEDIUM,
     * LOW).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun changeConf(): Optional<String> = changeConf.getOptional("changeConf")

    /**
     * Boolean indicating if any change event was detected, based on historical collection data for
     * the object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun changeDetected(): Optional<Boolean> = changeDetected.getOptional("changeDetected")

    /**
     * Qualitative Collection Density assessment, with respect to confidence of detecting a change
     * event (e.g. HIGH, MEDIUM, LOW).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun collectionDensityConf(): Optional<String> =
        collectionDensityConf.getOptional("collectionDensityConf")

    /**
     * Universally Unique collection ID. Mechanism to correlate Single Point Photometry (SPP) JSON
     * files to images.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun collectionId(): Optional<String> = collectionId.getOptional("collectionId")

    /**
     * Mode indicating telescope movement during collection (AUTOTRACK, MANUAL AUTOTRACK, MANUAL
     * RATE TRACK, MANUAL SIDEREAL, SIDEREAL, RATE TRACK).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun collectionMode(): Optional<String> = collectionMode.getOptional("collectionMode")

    /**
     * Object Correlation Quality value. Measures how close the observed object's orbit is to
     * matching an object in the catalog. The scale of this field may vary depending on provider.
     * Users should consult the data provider to verify the meaning of the value (e.g. A value of
     * 0.0 indicates a high/strong correlation, while a value closer to 1.0 indicates low/weak
     * correlation).
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
     * Observation set detection end time in ISO 8601 UTC with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("endTime")

    /**
     * The gain used during the collection, in units of photoelectrons per analog-to-digital unit
     * (e-/ADU). If no gain is used, the value = 1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gain(): Optional<Double> = gain.getOptional("gain")

    /**
     * ID of the UDL Elset of the Space Object under observation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idElset(): Optional<String> = idElset.getOptional("idElset")

    /**
     * Unique identifier of the target on-orbit object, if correlated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * ID of the observing sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

    /**
     * Line of sight declination at observation set detection end time. Specified in degrees, in the
     * specified referenceFrame. If referenceFrame is null then J2K should be assumed (e.g -30 to
     * 130.0).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun losDeclinationEnd(): Optional<Double> = losDeclinationEnd.getOptional("losDeclinationEnd")

    /**
     * Line of sight declination at observation set detection start time. Specified in degrees, in
     * the specified referenceFrame. If referenceFrame is null then J2K should be assumed (e.g -30
     * to 130.0).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun losDeclinationStart(): Optional<Double> =
        losDeclinationStart.getOptional("losDeclinationStart")

    /**
     * SOI msgCreateDate time in ISO 8601 UTC time, with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun msgCreateDate(): Optional<OffsetDateTime> = msgCreateDate.getOptional("msgCreateDate")

    /**
     * The value is the number of spectral filters used.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numSpectralFilters(): Optional<Int> = numSpectralFilters.getOptional("numSpectralFilters")

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
     * Optional identifier provided by the record source to indicate the sensor identifier to which
     * this attitude set applies if this set is reporting a single sensor orientation. This may be
     * an internal identifier and not necessarily a valid sensor ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

    /**
     * A threshold for percent of pixels that make up object signal that are beyond the saturation
     * point for the sensor that are removed in the EOSSA file, in range of 0 to 1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun percentSatThreshold(): Optional<Double> =
        percentSatThreshold.getOptional("percentSatThreshold")

    /**
     * Boolean indicating if a periodicity change event was detected, based on historical collection
     * data for the object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun periodicityChangeDetected(): Optional<Boolean> =
        periodicityChangeDetected.getOptional("periodicityChangeDetected")

    /**
     * Qualitative assessment of the periodicity detection results from the Attitude and Shape
     * Retrieval (ASR) Periodicity Assessment (PA) Tool (e.g. HIGH, MEDIUM, LOW).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun periodicityDetectionConf(): Optional<String> =
        periodicityDetectionConf.getOptional("periodicityDetectionConf")

    /**
     * Qualitative Periodicity Sampling assessment, with respect to confidence of detecting a change
     * event (e.g. HIGH, MEDIUM, LOW).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun periodicitySamplingConf(): Optional<String> =
        periodicitySamplingConf.getOptional("periodicitySamplingConf")

    /**
     * Pixel array size (height) in pixels.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pixelArrayHeight(): Optional<Int> = pixelArrayHeight.getOptional("pixelArrayHeight")

    /**
     * Pixel array size (width) in pixels.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pixelArrayWidth(): Optional<Int> = pixelArrayWidth.getOptional("pixelArrayWidth")

    /**
     * The maximum valid pixel value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pixelMax(): Optional<Int> = pixelMax.getOptional("pixelMax")

    /**
     * The minimum valid pixel value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pixelMin(): Optional<Int> = pixelMin.getOptional("pixelMin")

    /**
     * Pointing angle of the Azimuth gimbal/mount at observation set detection end time. Specified
     * in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pointingAngleAzEnd(): Optional<Double> =
        pointingAngleAzEnd.getOptional("pointingAngleAzEnd")

    /**
     * Pointing angle of the Azimuth gimbal/mount at observation set detection start time. Specified
     * in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pointingAngleAzStart(): Optional<Double> =
        pointingAngleAzStart.getOptional("pointingAngleAzStart")

    /**
     * Pointing angle of the Elevation gimbal/mount at observation set detection end time. Specified
     * in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pointingAngleElEnd(): Optional<Double> =
        pointingAngleElEnd.getOptional("pointingAngleElEnd")

    /**
     * Pointing angle of the Elevation gimbal/mount at observation set detection start time.
     * Specified in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pointingAngleElStart(): Optional<Double> =
        pointingAngleElStart.getOptional("pointingAngleElStart")

    /**
     * Polar angle of the gimbal/mount at observation set detection end time in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarAngleEnd(): Optional<Double> = polarAngleEnd.getOptional("polarAngleEnd")

    /**
     * Polar angle of the gimbal/mount at observation set detection start time in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarAngleStart(): Optional<Double> = polarAngleStart.getOptional("polarAngleStart")

    /**
     * The reference frame of the observation measurements. If the referenceFrame is null it is
     * assumed to be J2000.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun referenceFrame(): Optional<ReferenceFrame> = referenceFrame.getOptional("referenceFrame")

    /**
     * Name of the target satellite.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satelliteName(): Optional<String> = satelliteName.getOptional("satelliteName")

    /**
     * Satellite/catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Sensor altitude at startTime (if mobile/onorbit) in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senalt(): Optional<Double> = senalt.getOptional("senalt")

    /**
     * Sensor WGS84 latitude at startTime (if mobile/onorbit) in degrees. If null, can be obtained
     * from sensor info. -90 to 90 degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senlat(): Optional<Double> = senlat.getOptional("senlat")

    /**
     * Sensor WGS84 longitude at startTime (if mobile/onorbit) in degrees. If null, can be obtained
     * from sensor info. -180 to 180 degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senlon(): Optional<Double> = senlon.getOptional("senlon")

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
     * ID of the AttitudeSet record for the observing sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sensorAsId(): Optional<String> = sensorAsId.getOptional("sensorAsId")

    /**
     * Cartesian X velocity of the observing mobile/onorbit sensor at startTime, in kilometers per
     * second, in the specified senReferenceFrame. If senReferenceFrame is null then J2K should be
     * assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senvelx(): Optional<Double> = senvelx.getOptional("senvelx")

    /**
     * Cartesian Y velocity of the observing mobile/onorbit sensor at startTime, in kilometers per
     * second, in the specified senReferenceFrame. If senReferenceFrame is null then J2K should be
     * assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senvely(): Optional<Double> = senvely.getOptional("senvely")

    /**
     * Cartesian Z velocity of the observing mobile/onorbit sensor at startTime, in kilometers per
     * second, in the specified senReferenceFrame. If senReferenceFrame is null then J2K should be
     * assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senvelz(): Optional<Double> = senvelz.getOptional("senvelz")

    /**
     * Cartesian X position of the observing mobile/onorbit sensor at startTime, in kilometers, in
     * the specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senx(): Optional<Double> = senx.getOptional("senx")

    /**
     * Cartesian Y position of the observing mobile/onorbit sensor at startTime, in kilometers, in
     * the specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun seny(): Optional<Double> = seny.getOptional("seny")

    /**
     * Cartesian Z position of the observing mobile/onorbit sensor at startTime, in kilometers, in
     * the specified senReferenceFrame. If senReferenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senz(): Optional<Double> = senz.getOptional("senz")

    /**
     * Software Version used to Capture, Process, and Deliver the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun softwareVersion(): Optional<String> = softwareVersion.getOptional("softwareVersion")

    /**
     * The in-band solar magnitude at 1 A.U.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solarMag(): Optional<Double> = solarMag.getOptional("solarMag")

    /**
     * Boolean indicating if a solar phase angle brightness change event was detected, based on
     * historical collection data for the object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solarPhaseAngleBrightnessChangeDetected(): Optional<Boolean> =
        solarPhaseAngleBrightnessChangeDetected.getOptional(
            "solarPhaseAngleBrightnessChangeDetected"
        )

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
     * Array of the SpectralFilters keywords, must be present for all values n=1 to
     * numSpectralFilters, in incrementing order of n, and for no other values of n.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spectralFilters(): Optional<List<String>> = spectralFilters.getOptional("spectralFilters")

    /**
     * Name of the Star Catalog used for photometry and astrometry.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun starCatName(): Optional<String> = starCatName.getOptional("starCatName")

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
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

    /**
     * Boolean indicating whether the target object was unable to be correlated to a known object.
     * This flag should only be set to true by data providers after an attempt to correlate to an
     * OnOrbit object was made and failed. If unable to correlate, the 'origObjectId' field may be
     * populated with an internal data provider specific identifier.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun uct(): Optional<Boolean> = uct.getOptional("uct")

    /**
     * Key to indicate which, if any of, the pre/post photometer calibrations are valid for use when
     * generating data for the EOSSA file. If the field is not populated, then the provided
     * calibration data will be used when generating the EOSSA file (e.g. PRE, POST, BOTH, NONE).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun validCalibrations(): Optional<String> = validCalibrations.getOptional("validCalibrations")

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
     * Returns the raw JSON value of [numObs].
     *
     * Unlike [numObs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numObs") @ExcludeMissing fun _numObs(): JsonField<Int> = numObs

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
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [binningHoriz].
     *
     * Unlike [binningHoriz], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("binningHoriz") @ExcludeMissing fun _binningHoriz(): JsonField<Int> = binningHoriz

    /**
     * Returns the raw JSON value of [binningVert].
     *
     * Unlike [binningVert], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("binningVert") @ExcludeMissing fun _binningVert(): JsonField<Int> = binningVert

    /**
     * Returns the raw JSON value of [brightnessVarianceChangeDetected].
     *
     * Unlike [brightnessVarianceChangeDetected], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("brightnessVarianceChangeDetected")
    @ExcludeMissing
    fun _brightnessVarianceChangeDetected(): JsonField<Boolean> = brightnessVarianceChangeDetected

    /**
     * Returns the raw JSON value of [calibrations].
     *
     * Unlike [calibrations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("calibrations")
    @ExcludeMissing
    fun _calibrations(): JsonField<List<Calibration>> = calibrations

    /**
     * Returns the raw JSON value of [calibrationType].
     *
     * Unlike [calibrationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("calibrationType")
    @ExcludeMissing
    fun _calibrationType(): JsonField<String> = calibrationType

    /**
     * Returns the raw JSON value of [changeConf].
     *
     * Unlike [changeConf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("changeConf") @ExcludeMissing fun _changeConf(): JsonField<String> = changeConf

    /**
     * Returns the raw JSON value of [changeDetected].
     *
     * Unlike [changeDetected], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("changeDetected")
    @ExcludeMissing
    fun _changeDetected(): JsonField<Boolean> = changeDetected

    /**
     * Returns the raw JSON value of [collectionDensityConf].
     *
     * Unlike [collectionDensityConf], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("collectionDensityConf")
    @ExcludeMissing
    fun _collectionDensityConf(): JsonField<String> = collectionDensityConf

    /**
     * Returns the raw JSON value of [collectionId].
     *
     * Unlike [collectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collectionId")
    @ExcludeMissing
    fun _collectionId(): JsonField<String> = collectionId

    /**
     * Returns the raw JSON value of [collectionMode].
     *
     * Unlike [collectionMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collectionMode")
    @ExcludeMissing
    fun _collectionMode(): JsonField<String> = collectionMode

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
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [gain].
     *
     * Unlike [gain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gain") @ExcludeMissing fun _gain(): JsonField<Double> = gain

    /**
     * Returns the raw JSON value of [idElset].
     *
     * Unlike [idElset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idElset") @ExcludeMissing fun _idElset(): JsonField<String> = idElset

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
     * Returns the raw JSON value of [losDeclinationEnd].
     *
     * Unlike [losDeclinationEnd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("losDeclinationEnd")
    @ExcludeMissing
    fun _losDeclinationEnd(): JsonField<Double> = losDeclinationEnd

    /**
     * Returns the raw JSON value of [losDeclinationStart].
     *
     * Unlike [losDeclinationStart], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("losDeclinationStart")
    @ExcludeMissing
    fun _losDeclinationStart(): JsonField<Double> = losDeclinationStart

    /**
     * Returns the raw JSON value of [msgCreateDate].
     *
     * Unlike [msgCreateDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msgCreateDate")
    @ExcludeMissing
    fun _msgCreateDate(): JsonField<OffsetDateTime> = msgCreateDate

    /**
     * Returns the raw JSON value of [numSpectralFilters].
     *
     * Unlike [numSpectralFilters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("numSpectralFilters")
    @ExcludeMissing
    fun _numSpectralFilters(): JsonField<Int> = numSpectralFilters

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
     * Returns the raw JSON value of [percentSatThreshold].
     *
     * Unlike [percentSatThreshold], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("percentSatThreshold")
    @ExcludeMissing
    fun _percentSatThreshold(): JsonField<Double> = percentSatThreshold

    /**
     * Returns the raw JSON value of [periodicityChangeDetected].
     *
     * Unlike [periodicityChangeDetected], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("periodicityChangeDetected")
    @ExcludeMissing
    fun _periodicityChangeDetected(): JsonField<Boolean> = periodicityChangeDetected

    /**
     * Returns the raw JSON value of [periodicityDetectionConf].
     *
     * Unlike [periodicityDetectionConf], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("periodicityDetectionConf")
    @ExcludeMissing
    fun _periodicityDetectionConf(): JsonField<String> = periodicityDetectionConf

    /**
     * Returns the raw JSON value of [periodicitySamplingConf].
     *
     * Unlike [periodicitySamplingConf], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("periodicitySamplingConf")
    @ExcludeMissing
    fun _periodicitySamplingConf(): JsonField<String> = periodicitySamplingConf

    /**
     * Returns the raw JSON value of [pixelArrayHeight].
     *
     * Unlike [pixelArrayHeight], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pixelArrayHeight")
    @ExcludeMissing
    fun _pixelArrayHeight(): JsonField<Int> = pixelArrayHeight

    /**
     * Returns the raw JSON value of [pixelArrayWidth].
     *
     * Unlike [pixelArrayWidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pixelArrayWidth")
    @ExcludeMissing
    fun _pixelArrayWidth(): JsonField<Int> = pixelArrayWidth

    /**
     * Returns the raw JSON value of [pixelMax].
     *
     * Unlike [pixelMax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pixelMax") @ExcludeMissing fun _pixelMax(): JsonField<Int> = pixelMax

    /**
     * Returns the raw JSON value of [pixelMin].
     *
     * Unlike [pixelMin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pixelMin") @ExcludeMissing fun _pixelMin(): JsonField<Int> = pixelMin

    /**
     * Returns the raw JSON value of [pointingAngleAzEnd].
     *
     * Unlike [pointingAngleAzEnd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pointingAngleAzEnd")
    @ExcludeMissing
    fun _pointingAngleAzEnd(): JsonField<Double> = pointingAngleAzEnd

    /**
     * Returns the raw JSON value of [pointingAngleAzStart].
     *
     * Unlike [pointingAngleAzStart], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pointingAngleAzStart")
    @ExcludeMissing
    fun _pointingAngleAzStart(): JsonField<Double> = pointingAngleAzStart

    /**
     * Returns the raw JSON value of [pointingAngleElEnd].
     *
     * Unlike [pointingAngleElEnd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pointingAngleElEnd")
    @ExcludeMissing
    fun _pointingAngleElEnd(): JsonField<Double> = pointingAngleElEnd

    /**
     * Returns the raw JSON value of [pointingAngleElStart].
     *
     * Unlike [pointingAngleElStart], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pointingAngleElStart")
    @ExcludeMissing
    fun _pointingAngleElStart(): JsonField<Double> = pointingAngleElStart

    /**
     * Returns the raw JSON value of [polarAngleEnd].
     *
     * Unlike [polarAngleEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarAngleEnd")
    @ExcludeMissing
    fun _polarAngleEnd(): JsonField<Double> = polarAngleEnd

    /**
     * Returns the raw JSON value of [polarAngleStart].
     *
     * Unlike [polarAngleStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarAngleStart")
    @ExcludeMissing
    fun _polarAngleStart(): JsonField<Double> = polarAngleStart

    /**
     * Returns the raw JSON value of [referenceFrame].
     *
     * Unlike [referenceFrame], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referenceFrame")
    @ExcludeMissing
    fun _referenceFrame(): JsonField<ReferenceFrame> = referenceFrame

    /**
     * Returns the raw JSON value of [satelliteName].
     *
     * Unlike [satelliteName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satelliteName")
    @ExcludeMissing
    fun _satelliteName(): JsonField<String> = satelliteName

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
     * Returns the raw JSON value of [senReferenceFrame].
     *
     * Unlike [senReferenceFrame], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("senReferenceFrame")
    @ExcludeMissing
    fun _senReferenceFrame(): JsonField<SenReferenceFrame> = senReferenceFrame

    /**
     * Returns the raw JSON value of [sensorAsId].
     *
     * Unlike [sensorAsId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sensorAsId") @ExcludeMissing fun _sensorAsId(): JsonField<String> = sensorAsId

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
     * Returns the raw JSON value of [softwareVersion].
     *
     * Unlike [softwareVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("softwareVersion")
    @ExcludeMissing
    fun _softwareVersion(): JsonField<String> = softwareVersion

    /**
     * Returns the raw JSON value of [solarMag].
     *
     * Unlike [solarMag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("solarMag") @ExcludeMissing fun _solarMag(): JsonField<Double> = solarMag

    /**
     * Returns the raw JSON value of [solarPhaseAngleBrightnessChangeDetected].
     *
     * Unlike [solarPhaseAngleBrightnessChangeDetected], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("solarPhaseAngleBrightnessChangeDetected")
    @ExcludeMissing
    fun _solarPhaseAngleBrightnessChangeDetected(): JsonField<Boolean> =
        solarPhaseAngleBrightnessChangeDetected

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [spectralFilters].
     *
     * Unlike [spectralFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spectralFilters")
    @ExcludeMissing
    fun _spectralFilters(): JsonField<List<String>> = spectralFilters

    /**
     * Returns the raw JSON value of [starCatName].
     *
     * Unlike [starCatName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starCatName") @ExcludeMissing fun _starCatName(): JsonField<String> = starCatName

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
     * Returns the raw JSON value of [validCalibrations].
     *
     * Unlike [validCalibrations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("validCalibrations")
    @ExcludeMissing
    fun _validCalibrations(): JsonField<String> = validCalibrations

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
         * [SoiObservationSetListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .numObs()
         * .source()
         * .startTime()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SoiObservationSetListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var numObs: JsonField<Int>? = null
        private var source: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var binningHoriz: JsonField<Int> = JsonMissing.of()
        private var binningVert: JsonField<Int> = JsonMissing.of()
        private var brightnessVarianceChangeDetected: JsonField<Boolean> = JsonMissing.of()
        private var calibrations: JsonField<MutableList<Calibration>>? = null
        private var calibrationType: JsonField<String> = JsonMissing.of()
        private var changeConf: JsonField<String> = JsonMissing.of()
        private var changeDetected: JsonField<Boolean> = JsonMissing.of()
        private var collectionDensityConf: JsonField<String> = JsonMissing.of()
        private var collectionId: JsonField<String> = JsonMissing.of()
        private var collectionMode: JsonField<String> = JsonMissing.of()
        private var corrQuality: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var gain: JsonField<Double> = JsonMissing.of()
        private var idElset: JsonField<String> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var losDeclinationEnd: JsonField<Double> = JsonMissing.of()
        private var losDeclinationStart: JsonField<Double> = JsonMissing.of()
        private var msgCreateDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var numSpectralFilters: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var percentSatThreshold: JsonField<Double> = JsonMissing.of()
        private var periodicityChangeDetected: JsonField<Boolean> = JsonMissing.of()
        private var periodicityDetectionConf: JsonField<String> = JsonMissing.of()
        private var periodicitySamplingConf: JsonField<String> = JsonMissing.of()
        private var pixelArrayHeight: JsonField<Int> = JsonMissing.of()
        private var pixelArrayWidth: JsonField<Int> = JsonMissing.of()
        private var pixelMax: JsonField<Int> = JsonMissing.of()
        private var pixelMin: JsonField<Int> = JsonMissing.of()
        private var pointingAngleAzEnd: JsonField<Double> = JsonMissing.of()
        private var pointingAngleAzStart: JsonField<Double> = JsonMissing.of()
        private var pointingAngleElEnd: JsonField<Double> = JsonMissing.of()
        private var pointingAngleElStart: JsonField<Double> = JsonMissing.of()
        private var polarAngleEnd: JsonField<Double> = JsonMissing.of()
        private var polarAngleStart: JsonField<Double> = JsonMissing.of()
        private var referenceFrame: JsonField<ReferenceFrame> = JsonMissing.of()
        private var satelliteName: JsonField<String> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var senalt: JsonField<Double> = JsonMissing.of()
        private var senlat: JsonField<Double> = JsonMissing.of()
        private var senlon: JsonField<Double> = JsonMissing.of()
        private var senReferenceFrame: JsonField<SenReferenceFrame> = JsonMissing.of()
        private var sensorAsId: JsonField<String> = JsonMissing.of()
        private var senvelx: JsonField<Double> = JsonMissing.of()
        private var senvely: JsonField<Double> = JsonMissing.of()
        private var senvelz: JsonField<Double> = JsonMissing.of()
        private var senx: JsonField<Double> = JsonMissing.of()
        private var seny: JsonField<Double> = JsonMissing.of()
        private var senz: JsonField<Double> = JsonMissing.of()
        private var softwareVersion: JsonField<String> = JsonMissing.of()
        private var solarMag: JsonField<Double> = JsonMissing.of()
        private var solarPhaseAngleBrightnessChangeDetected: JsonField<Boolean> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var spectralFilters: JsonField<MutableList<String>>? = null
        private var starCatName: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var uct: JsonField<Boolean> = JsonMissing.of()
        private var validCalibrations: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(soiObservationSetListResponse: SoiObservationSetListResponse) = apply {
            classificationMarking = soiObservationSetListResponse.classificationMarking
            dataMode = soiObservationSetListResponse.dataMode
            numObs = soiObservationSetListResponse.numObs
            source = soiObservationSetListResponse.source
            startTime = soiObservationSetListResponse.startTime
            type = soiObservationSetListResponse.type
            id = soiObservationSetListResponse.id
            binningHoriz = soiObservationSetListResponse.binningHoriz
            binningVert = soiObservationSetListResponse.binningVert
            brightnessVarianceChangeDetected =
                soiObservationSetListResponse.brightnessVarianceChangeDetected
            calibrations = soiObservationSetListResponse.calibrations.map { it.toMutableList() }
            calibrationType = soiObservationSetListResponse.calibrationType
            changeConf = soiObservationSetListResponse.changeConf
            changeDetected = soiObservationSetListResponse.changeDetected
            collectionDensityConf = soiObservationSetListResponse.collectionDensityConf
            collectionId = soiObservationSetListResponse.collectionId
            collectionMode = soiObservationSetListResponse.collectionMode
            corrQuality = soiObservationSetListResponse.corrQuality
            createdAt = soiObservationSetListResponse.createdAt
            createdBy = soiObservationSetListResponse.createdBy
            endTime = soiObservationSetListResponse.endTime
            gain = soiObservationSetListResponse.gain
            idElset = soiObservationSetListResponse.idElset
            idOnOrbit = soiObservationSetListResponse.idOnOrbit
            idSensor = soiObservationSetListResponse.idSensor
            losDeclinationEnd = soiObservationSetListResponse.losDeclinationEnd
            losDeclinationStart = soiObservationSetListResponse.losDeclinationStart
            msgCreateDate = soiObservationSetListResponse.msgCreateDate
            numSpectralFilters = soiObservationSetListResponse.numSpectralFilters
            origin = soiObservationSetListResponse.origin
            origNetwork = soiObservationSetListResponse.origNetwork
            origObjectId = soiObservationSetListResponse.origObjectId
            origSensorId = soiObservationSetListResponse.origSensorId
            percentSatThreshold = soiObservationSetListResponse.percentSatThreshold
            periodicityChangeDetected = soiObservationSetListResponse.periodicityChangeDetected
            periodicityDetectionConf = soiObservationSetListResponse.periodicityDetectionConf
            periodicitySamplingConf = soiObservationSetListResponse.periodicitySamplingConf
            pixelArrayHeight = soiObservationSetListResponse.pixelArrayHeight
            pixelArrayWidth = soiObservationSetListResponse.pixelArrayWidth
            pixelMax = soiObservationSetListResponse.pixelMax
            pixelMin = soiObservationSetListResponse.pixelMin
            pointingAngleAzEnd = soiObservationSetListResponse.pointingAngleAzEnd
            pointingAngleAzStart = soiObservationSetListResponse.pointingAngleAzStart
            pointingAngleElEnd = soiObservationSetListResponse.pointingAngleElEnd
            pointingAngleElStart = soiObservationSetListResponse.pointingAngleElStart
            polarAngleEnd = soiObservationSetListResponse.polarAngleEnd
            polarAngleStart = soiObservationSetListResponse.polarAngleStart
            referenceFrame = soiObservationSetListResponse.referenceFrame
            satelliteName = soiObservationSetListResponse.satelliteName
            satNo = soiObservationSetListResponse.satNo
            senalt = soiObservationSetListResponse.senalt
            senlat = soiObservationSetListResponse.senlat
            senlon = soiObservationSetListResponse.senlon
            senReferenceFrame = soiObservationSetListResponse.senReferenceFrame
            sensorAsId = soiObservationSetListResponse.sensorAsId
            senvelx = soiObservationSetListResponse.senvelx
            senvely = soiObservationSetListResponse.senvely
            senvelz = soiObservationSetListResponse.senvelz
            senx = soiObservationSetListResponse.senx
            seny = soiObservationSetListResponse.seny
            senz = soiObservationSetListResponse.senz
            softwareVersion = soiObservationSetListResponse.softwareVersion
            solarMag = soiObservationSetListResponse.solarMag
            solarPhaseAngleBrightnessChangeDetected =
                soiObservationSetListResponse.solarPhaseAngleBrightnessChangeDetected
            sourceDl = soiObservationSetListResponse.sourceDl
            spectralFilters =
                soiObservationSetListResponse.spectralFilters.map { it.toMutableList() }
            starCatName = soiObservationSetListResponse.starCatName
            tags = soiObservationSetListResponse.tags.map { it.toMutableList() }
            transactionId = soiObservationSetListResponse.transactionId
            uct = soiObservationSetListResponse.uct
            validCalibrations = soiObservationSetListResponse.validCalibrations
            additionalProperties = soiObservationSetListResponse.additionalProperties.toMutableMap()
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

        /** The number of observation records in the set. */
        fun numObs(numObs: Int) = numObs(JsonField.of(numObs))

        /**
         * Sets [Builder.numObs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numObs] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numObs(numObs: JsonField<Int>) = apply { this.numObs = numObs }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Observation set detection start time in ISO 8601 UTC with microsecond precision. */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        /** Observation type (OPTICAL, RADAR). */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The number of pixels binned horizontally. */
        fun binningHoriz(binningHoriz: Int) = binningHoriz(JsonField.of(binningHoriz))

        /**
         * Sets [Builder.binningHoriz] to an arbitrary JSON value.
         *
         * You should usually call [Builder.binningHoriz] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun binningHoriz(binningHoriz: JsonField<Int>) = apply { this.binningHoriz = binningHoriz }

        /** The number of pixels binned vertically. */
        fun binningVert(binningVert: Int) = binningVert(JsonField.of(binningVert))

        /**
         * Sets [Builder.binningVert] to an arbitrary JSON value.
         *
         * You should usually call [Builder.binningVert] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun binningVert(binningVert: JsonField<Int>) = apply { this.binningVert = binningVert }

        /**
         * Boolean indicating if a brightness variance change event was detected, based on
         * historical collection data for the object.
         */
        fun brightnessVarianceChangeDetected(brightnessVarianceChangeDetected: Boolean) =
            brightnessVarianceChangeDetected(JsonField.of(brightnessVarianceChangeDetected))

        /**
         * Sets [Builder.brightnessVarianceChangeDetected] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brightnessVarianceChangeDetected] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun brightnessVarianceChangeDetected(brightnessVarianceChangeDetected: JsonField<Boolean>) =
            apply {
                this.brightnessVarianceChangeDetected = brightnessVarianceChangeDetected
            }

        /** Array of SOI Calibrations associated with this SOIObservationSet. */
        fun calibrations(calibrations: List<Calibration>) = calibrations(JsonField.of(calibrations))

        /**
         * Sets [Builder.calibrations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calibrations] with a well-typed `List<Calibration>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun calibrations(calibrations: JsonField<List<Calibration>>) = apply {
            this.calibrations = calibrations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Calibration] to [calibrations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCalibration(calibration: Calibration) = apply {
            calibrations =
                (calibrations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("calibrations", it).add(calibration)
                }
        }

        /** Type of calibration used by the Sensor (e.g. ALL SKY, DIFFERENTIAL, DEFAULT, NONE). */
        fun calibrationType(calibrationType: String) =
            calibrationType(JsonField.of(calibrationType))

        /**
         * Sets [Builder.calibrationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calibrationType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun calibrationType(calibrationType: JsonField<String>) = apply {
            this.calibrationType = calibrationType
        }

        /**
         * Overall qualitative confidence assessment of change detection results (e.g. HIGH, MEDIUM,
         * LOW).
         */
        fun changeConf(changeConf: String) = changeConf(JsonField.of(changeConf))

        /**
         * Sets [Builder.changeConf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changeConf] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun changeConf(changeConf: JsonField<String>) = apply { this.changeConf = changeConf }

        /**
         * Boolean indicating if any change event was detected, based on historical collection data
         * for the object.
         */
        fun changeDetected(changeDetected: Boolean) = changeDetected(JsonField.of(changeDetected))

        /**
         * Sets [Builder.changeDetected] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changeDetected] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun changeDetected(changeDetected: JsonField<Boolean>) = apply {
            this.changeDetected = changeDetected
        }

        /**
         * Qualitative Collection Density assessment, with respect to confidence of detecting a
         * change event (e.g. HIGH, MEDIUM, LOW).
         */
        fun collectionDensityConf(collectionDensityConf: String) =
            collectionDensityConf(JsonField.of(collectionDensityConf))

        /**
         * Sets [Builder.collectionDensityConf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionDensityConf] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collectionDensityConf(collectionDensityConf: JsonField<String>) = apply {
            this.collectionDensityConf = collectionDensityConf
        }

        /**
         * Universally Unique collection ID. Mechanism to correlate Single Point Photometry (SPP)
         * JSON files to images.
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

        /**
         * Mode indicating telescope movement during collection (AUTOTRACK, MANUAL AUTOTRACK, MANUAL
         * RATE TRACK, MANUAL SIDEREAL, SIDEREAL, RATE TRACK).
         */
        fun collectionMode(collectionMode: String) = collectionMode(JsonField.of(collectionMode))

        /**
         * Sets [Builder.collectionMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionMode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collectionMode(collectionMode: JsonField<String>) = apply {
            this.collectionMode = collectionMode
        }

        /**
         * Object Correlation Quality value. Measures how close the observed object's orbit is to
         * matching an object in the catalog. The scale of this field may vary depending on
         * provider. Users should consult the data provider to verify the meaning of the value (e.g.
         * A value of 0.0 indicates a high/strong correlation, while a value closer to 1.0 indicates
         * low/weak correlation).
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

        /** Observation set detection end time in ISO 8601 UTC with microsecond precision. */
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
         * The gain used during the collection, in units of photoelectrons per analog-to-digital
         * unit (e-/ADU). If no gain is used, the value = 1.
         */
        fun gain(gain: Double) = gain(JsonField.of(gain))

        /**
         * Sets [Builder.gain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gain] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gain(gain: JsonField<Double>) = apply { this.gain = gain }

        /** ID of the UDL Elset of the Space Object under observation. */
        fun idElset(idElset: String) = idElset(JsonField.of(idElset))

        /**
         * Sets [Builder.idElset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idElset] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idElset(idElset: JsonField<String>) = apply { this.idElset = idElset }

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

        /** ID of the observing sensor. */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

        /**
         * Line of sight declination at observation set detection end time. Specified in degrees, in
         * the specified referenceFrame. If referenceFrame is null then J2K should be assumed (e.g
         * -30 to 130.0).
         */
        fun losDeclinationEnd(losDeclinationEnd: Double) =
            losDeclinationEnd(JsonField.of(losDeclinationEnd))

        /**
         * Sets [Builder.losDeclinationEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.losDeclinationEnd] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun losDeclinationEnd(losDeclinationEnd: JsonField<Double>) = apply {
            this.losDeclinationEnd = losDeclinationEnd
        }

        /**
         * Line of sight declination at observation set detection start time. Specified in degrees,
         * in the specified referenceFrame. If referenceFrame is null then J2K should be assumed
         * (e.g -30 to 130.0).
         */
        fun losDeclinationStart(losDeclinationStart: Double) =
            losDeclinationStart(JsonField.of(losDeclinationStart))

        /**
         * Sets [Builder.losDeclinationStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.losDeclinationStart] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun losDeclinationStart(losDeclinationStart: JsonField<Double>) = apply {
            this.losDeclinationStart = losDeclinationStart
        }

        /** SOI msgCreateDate time in ISO 8601 UTC time, with millisecond precision. */
        fun msgCreateDate(msgCreateDate: OffsetDateTime) =
            msgCreateDate(JsonField.of(msgCreateDate))

        /**
         * Sets [Builder.msgCreateDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msgCreateDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun msgCreateDate(msgCreateDate: JsonField<OffsetDateTime>) = apply {
            this.msgCreateDate = msgCreateDate
        }

        /** The value is the number of spectral filters used. */
        fun numSpectralFilters(numSpectralFilters: Int) =
            numSpectralFilters(JsonField.of(numSpectralFilters))

        /**
         * Sets [Builder.numSpectralFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numSpectralFilters] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numSpectralFilters(numSpectralFilters: JsonField<Int>) = apply {
            this.numSpectralFilters = numSpectralFilters
        }

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
         * Optional identifier provided by the record source to indicate the sensor identifier to
         * which this attitude set applies if this set is reporting a single sensor orientation.
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

        /**
         * A threshold for percent of pixels that make up object signal that are beyond the
         * saturation point for the sensor that are removed in the EOSSA file, in range of 0 to 1.
         */
        fun percentSatThreshold(percentSatThreshold: Double) =
            percentSatThreshold(JsonField.of(percentSatThreshold))

        /**
         * Sets [Builder.percentSatThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentSatThreshold] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun percentSatThreshold(percentSatThreshold: JsonField<Double>) = apply {
            this.percentSatThreshold = percentSatThreshold
        }

        /**
         * Boolean indicating if a periodicity change event was detected, based on historical
         * collection data for the object.
         */
        fun periodicityChangeDetected(periodicityChangeDetected: Boolean) =
            periodicityChangeDetected(JsonField.of(periodicityChangeDetected))

        /**
         * Sets [Builder.periodicityChangeDetected] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodicityChangeDetected] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun periodicityChangeDetected(periodicityChangeDetected: JsonField<Boolean>) = apply {
            this.periodicityChangeDetected = periodicityChangeDetected
        }

        /**
         * Qualitative assessment of the periodicity detection results from the Attitude and Shape
         * Retrieval (ASR) Periodicity Assessment (PA) Tool (e.g. HIGH, MEDIUM, LOW).
         */
        fun periodicityDetectionConf(periodicityDetectionConf: String) =
            periodicityDetectionConf(JsonField.of(periodicityDetectionConf))

        /**
         * Sets [Builder.periodicityDetectionConf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodicityDetectionConf] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun periodicityDetectionConf(periodicityDetectionConf: JsonField<String>) = apply {
            this.periodicityDetectionConf = periodicityDetectionConf
        }

        /**
         * Qualitative Periodicity Sampling assessment, with respect to confidence of detecting a
         * change event (e.g. HIGH, MEDIUM, LOW).
         */
        fun periodicitySamplingConf(periodicitySamplingConf: String) =
            periodicitySamplingConf(JsonField.of(periodicitySamplingConf))

        /**
         * Sets [Builder.periodicitySamplingConf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodicitySamplingConf] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun periodicitySamplingConf(periodicitySamplingConf: JsonField<String>) = apply {
            this.periodicitySamplingConf = periodicitySamplingConf
        }

        /** Pixel array size (height) in pixels. */
        fun pixelArrayHeight(pixelArrayHeight: Int) =
            pixelArrayHeight(JsonField.of(pixelArrayHeight))

        /**
         * Sets [Builder.pixelArrayHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pixelArrayHeight] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pixelArrayHeight(pixelArrayHeight: JsonField<Int>) = apply {
            this.pixelArrayHeight = pixelArrayHeight
        }

        /** Pixel array size (width) in pixels. */
        fun pixelArrayWidth(pixelArrayWidth: Int) = pixelArrayWidth(JsonField.of(pixelArrayWidth))

        /**
         * Sets [Builder.pixelArrayWidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pixelArrayWidth] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pixelArrayWidth(pixelArrayWidth: JsonField<Int>) = apply {
            this.pixelArrayWidth = pixelArrayWidth
        }

        /** The maximum valid pixel value. */
        fun pixelMax(pixelMax: Int) = pixelMax(JsonField.of(pixelMax))

        /**
         * Sets [Builder.pixelMax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pixelMax] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pixelMax(pixelMax: JsonField<Int>) = apply { this.pixelMax = pixelMax }

        /** The minimum valid pixel value. */
        fun pixelMin(pixelMin: Int) = pixelMin(JsonField.of(pixelMin))

        /**
         * Sets [Builder.pixelMin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pixelMin] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pixelMin(pixelMin: JsonField<Int>) = apply { this.pixelMin = pixelMin }

        /**
         * Pointing angle of the Azimuth gimbal/mount at observation set detection end time.
         * Specified in degrees.
         */
        fun pointingAngleAzEnd(pointingAngleAzEnd: Double) =
            pointingAngleAzEnd(JsonField.of(pointingAngleAzEnd))

        /**
         * Sets [Builder.pointingAngleAzEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pointingAngleAzEnd] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pointingAngleAzEnd(pointingAngleAzEnd: JsonField<Double>) = apply {
            this.pointingAngleAzEnd = pointingAngleAzEnd
        }

        /**
         * Pointing angle of the Azimuth gimbal/mount at observation set detection start time.
         * Specified in degrees.
         */
        fun pointingAngleAzStart(pointingAngleAzStart: Double) =
            pointingAngleAzStart(JsonField.of(pointingAngleAzStart))

        /**
         * Sets [Builder.pointingAngleAzStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pointingAngleAzStart] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pointingAngleAzStart(pointingAngleAzStart: JsonField<Double>) = apply {
            this.pointingAngleAzStart = pointingAngleAzStart
        }

        /**
         * Pointing angle of the Elevation gimbal/mount at observation set detection end time.
         * Specified in degrees.
         */
        fun pointingAngleElEnd(pointingAngleElEnd: Double) =
            pointingAngleElEnd(JsonField.of(pointingAngleElEnd))

        /**
         * Sets [Builder.pointingAngleElEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pointingAngleElEnd] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pointingAngleElEnd(pointingAngleElEnd: JsonField<Double>) = apply {
            this.pointingAngleElEnd = pointingAngleElEnd
        }

        /**
         * Pointing angle of the Elevation gimbal/mount at observation set detection start time.
         * Specified in degrees.
         */
        fun pointingAngleElStart(pointingAngleElStart: Double) =
            pointingAngleElStart(JsonField.of(pointingAngleElStart))

        /**
         * Sets [Builder.pointingAngleElStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pointingAngleElStart] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pointingAngleElStart(pointingAngleElStart: JsonField<Double>) = apply {
            this.pointingAngleElStart = pointingAngleElStart
        }

        /** Polar angle of the gimbal/mount at observation set detection end time in degrees. */
        fun polarAngleEnd(polarAngleEnd: Double) = polarAngleEnd(JsonField.of(polarAngleEnd))

        /**
         * Sets [Builder.polarAngleEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarAngleEnd] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun polarAngleEnd(polarAngleEnd: JsonField<Double>) = apply {
            this.polarAngleEnd = polarAngleEnd
        }

        /** Polar angle of the gimbal/mount at observation set detection start time in degrees. */
        fun polarAngleStart(polarAngleStart: Double) =
            polarAngleStart(JsonField.of(polarAngleStart))

        /**
         * Sets [Builder.polarAngleStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarAngleStart] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun polarAngleStart(polarAngleStart: JsonField<Double>) = apply {
            this.polarAngleStart = polarAngleStart
        }

        /**
         * The reference frame of the observation measurements. If the referenceFrame is null it is
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

        /** Name of the target satellite. */
        fun satelliteName(satelliteName: String) = satelliteName(JsonField.of(satelliteName))

        /**
         * Sets [Builder.satelliteName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satelliteName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun satelliteName(satelliteName: JsonField<String>) = apply {
            this.satelliteName = satelliteName
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

        /** Sensor altitude at startTime (if mobile/onorbit) in kilometers. */
        fun senalt(senalt: Double) = senalt(JsonField.of(senalt))

        /**
         * Sets [Builder.senalt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senalt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senalt(senalt: JsonField<Double>) = apply { this.senalt = senalt }

        /**
         * Sensor WGS84 latitude at startTime (if mobile/onorbit) in degrees. If null, can be
         * obtained from sensor info. -90 to 90 degrees (negative values south of equator).
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
         * Sensor WGS84 longitude at startTime (if mobile/onorbit) in degrees. If null, can be
         * obtained from sensor info. -180 to 180 degrees (negative values south of equator).
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

        /** ID of the AttitudeSet record for the observing sensor. */
        fun sensorAsId(sensorAsId: String) = sensorAsId(JsonField.of(sensorAsId))

        /**
         * Sets [Builder.sensorAsId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sensorAsId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sensorAsId(sensorAsId: JsonField<String>) = apply { this.sensorAsId = sensorAsId }

        /**
         * Cartesian X velocity of the observing mobile/onorbit sensor at startTime, in kilometers
         * per second, in the specified senReferenceFrame. If senReferenceFrame is null then J2K
         * should be assumed.
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
         * Cartesian Y velocity of the observing mobile/onorbit sensor at startTime, in kilometers
         * per second, in the specified senReferenceFrame. If senReferenceFrame is null then J2K
         * should be assumed.
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
         * Cartesian Z velocity of the observing mobile/onorbit sensor at startTime, in kilometers
         * per second, in the specified senReferenceFrame. If senReferenceFrame is null then J2K
         * should be assumed.
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
         * Cartesian X position of the observing mobile/onorbit sensor at startTime, in kilometers,
         * in the specified senReferenceFrame. If senReferenceFrame is null then J2K should be
         * assumed.
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
         * Cartesian Y position of the observing mobile/onorbit sensor at startTime, in kilometers,
         * in the specified senReferenceFrame. If senReferenceFrame is null then J2K should be
         * assumed.
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
         * Cartesian Z position of the observing mobile/onorbit sensor at startTime, in kilometers,
         * in the specified senReferenceFrame. If senReferenceFrame is null then J2K should be
         * assumed.
         */
        fun senz(senz: Double) = senz(JsonField.of(senz))

        /**
         * Sets [Builder.senz] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senz] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senz(senz: JsonField<Double>) = apply { this.senz = senz }

        /** Software Version used to Capture, Process, and Deliver the data. */
        fun softwareVersion(softwareVersion: String) =
            softwareVersion(JsonField.of(softwareVersion))

        /**
         * Sets [Builder.softwareVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.softwareVersion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun softwareVersion(softwareVersion: JsonField<String>) = apply {
            this.softwareVersion = softwareVersion
        }

        /** The in-band solar magnitude at 1 A.U. */
        fun solarMag(solarMag: Double) = solarMag(JsonField.of(solarMag))

        /**
         * Sets [Builder.solarMag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solarMag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun solarMag(solarMag: JsonField<Double>) = apply { this.solarMag = solarMag }

        /**
         * Boolean indicating if a solar phase angle brightness change event was detected, based on
         * historical collection data for the object.
         */
        fun solarPhaseAngleBrightnessChangeDetected(
            solarPhaseAngleBrightnessChangeDetected: Boolean
        ) =
            solarPhaseAngleBrightnessChangeDetected(
                JsonField.of(solarPhaseAngleBrightnessChangeDetected)
            )

        /**
         * Sets [Builder.solarPhaseAngleBrightnessChangeDetected] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solarPhaseAngleBrightnessChangeDetected] with a
         * well-typed [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun solarPhaseAngleBrightnessChangeDetected(
            solarPhaseAngleBrightnessChangeDetected: JsonField<Boolean>
        ) = apply {
            this.solarPhaseAngleBrightnessChangeDetected = solarPhaseAngleBrightnessChangeDetected
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
         * Array of the SpectralFilters keywords, must be present for all values n=1 to
         * numSpectralFilters, in incrementing order of n, and for no other values of n.
         */
        fun spectralFilters(spectralFilters: List<String>) =
            spectralFilters(JsonField.of(spectralFilters))

        /**
         * Sets [Builder.spectralFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spectralFilters] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun spectralFilters(spectralFilters: JsonField<List<String>>) = apply {
            this.spectralFilters = spectralFilters.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [spectralFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSpectralFilter(spectralFilter: String) = apply {
            spectralFilters =
                (spectralFilters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("spectralFilters", it).add(spectralFilter)
                }
        }

        /** Name of the Star Catalog used for photometry and astrometry. */
        fun starCatName(starCatName: String) = starCatName(JsonField.of(starCatName))

        /**
         * Sets [Builder.starCatName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.starCatName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun starCatName(starCatName: JsonField<String>) = apply { this.starCatName = starCatName }

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
         * Boolean indicating whether the target object was unable to be correlated to a known
         * object. This flag should only be set to true by data providers after an attempt to
         * correlate to an OnOrbit object was made and failed. If unable to correlate, the
         * 'origObjectId' field may be populated with an internal data provider specific identifier.
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
         * Key to indicate which, if any of, the pre/post photometer calibrations are valid for use
         * when generating data for the EOSSA file. If the field is not populated, then the provided
         * calibration data will be used when generating the EOSSA file (e.g. PRE, POST, BOTH,
         * NONE).
         */
        fun validCalibrations(validCalibrations: String) =
            validCalibrations(JsonField.of(validCalibrations))

        /**
         * Sets [Builder.validCalibrations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validCalibrations] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun validCalibrations(validCalibrations: JsonField<String>) = apply {
            this.validCalibrations = validCalibrations
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
         * Returns an immutable instance of [SoiObservationSetListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .numObs()
         * .source()
         * .startTime()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SoiObservationSetListResponse =
            SoiObservationSetListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("numObs", numObs),
                checkRequired("source", source),
                checkRequired("startTime", startTime),
                checkRequired("type", type),
                id,
                binningHoriz,
                binningVert,
                brightnessVarianceChangeDetected,
                (calibrations ?: JsonMissing.of()).map { it.toImmutable() },
                calibrationType,
                changeConf,
                changeDetected,
                collectionDensityConf,
                collectionId,
                collectionMode,
                corrQuality,
                createdAt,
                createdBy,
                endTime,
                gain,
                idElset,
                idOnOrbit,
                idSensor,
                losDeclinationEnd,
                losDeclinationStart,
                msgCreateDate,
                numSpectralFilters,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                percentSatThreshold,
                periodicityChangeDetected,
                periodicityDetectionConf,
                periodicitySamplingConf,
                pixelArrayHeight,
                pixelArrayWidth,
                pixelMax,
                pixelMin,
                pointingAngleAzEnd,
                pointingAngleAzStart,
                pointingAngleElEnd,
                pointingAngleElStart,
                polarAngleEnd,
                polarAngleStart,
                referenceFrame,
                satelliteName,
                satNo,
                senalt,
                senlat,
                senlon,
                senReferenceFrame,
                sensorAsId,
                senvelx,
                senvely,
                senvelz,
                senx,
                seny,
                senz,
                softwareVersion,
                solarMag,
                solarPhaseAngleBrightnessChangeDetected,
                sourceDl,
                (spectralFilters ?: JsonMissing.of()).map { it.toImmutable() },
                starCatName,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                transactionId,
                uct,
                validCalibrations,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SoiObservationSetListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        numObs()
        source()
        startTime()
        type().validate()
        id()
        binningHoriz()
        binningVert()
        brightnessVarianceChangeDetected()
        calibrations().ifPresent { it.forEach { it.validate() } }
        calibrationType()
        changeConf()
        changeDetected()
        collectionDensityConf()
        collectionId()
        collectionMode()
        corrQuality()
        createdAt()
        createdBy()
        endTime()
        gain()
        idElset()
        idOnOrbit()
        idSensor()
        losDeclinationEnd()
        losDeclinationStart()
        msgCreateDate()
        numSpectralFilters()
        origin()
        origNetwork()
        origObjectId()
        origSensorId()
        percentSatThreshold()
        periodicityChangeDetected()
        periodicityDetectionConf()
        periodicitySamplingConf()
        pixelArrayHeight()
        pixelArrayWidth()
        pixelMax()
        pixelMin()
        pointingAngleAzEnd()
        pointingAngleAzStart()
        pointingAngleElEnd()
        pointingAngleElStart()
        polarAngleEnd()
        polarAngleStart()
        referenceFrame().ifPresent { it.validate() }
        satelliteName()
        satNo()
        senalt()
        senlat()
        senlon()
        senReferenceFrame().ifPresent { it.validate() }
        sensorAsId()
        senvelx()
        senvely()
        senvelz()
        senx()
        seny()
        senz()
        softwareVersion()
        solarMag()
        solarPhaseAngleBrightnessChangeDetected()
        sourceDl()
        spectralFilters()
        starCatName()
        tags()
        transactionId()
        uct()
        validCalibrations()
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
            (if (numObs.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (binningHoriz.asKnown().isPresent) 1 else 0) +
            (if (binningVert.asKnown().isPresent) 1 else 0) +
            (if (brightnessVarianceChangeDetected.asKnown().isPresent) 1 else 0) +
            (calibrations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (calibrationType.asKnown().isPresent) 1 else 0) +
            (if (changeConf.asKnown().isPresent) 1 else 0) +
            (if (changeDetected.asKnown().isPresent) 1 else 0) +
            (if (collectionDensityConf.asKnown().isPresent) 1 else 0) +
            (if (collectionId.asKnown().isPresent) 1 else 0) +
            (if (collectionMode.asKnown().isPresent) 1 else 0) +
            (if (corrQuality.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (gain.asKnown().isPresent) 1 else 0) +
            (if (idElset.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (losDeclinationEnd.asKnown().isPresent) 1 else 0) +
            (if (losDeclinationStart.asKnown().isPresent) 1 else 0) +
            (if (msgCreateDate.asKnown().isPresent) 1 else 0) +
            (if (numSpectralFilters.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (if (percentSatThreshold.asKnown().isPresent) 1 else 0) +
            (if (periodicityChangeDetected.asKnown().isPresent) 1 else 0) +
            (if (periodicityDetectionConf.asKnown().isPresent) 1 else 0) +
            (if (periodicitySamplingConf.asKnown().isPresent) 1 else 0) +
            (if (pixelArrayHeight.asKnown().isPresent) 1 else 0) +
            (if (pixelArrayWidth.asKnown().isPresent) 1 else 0) +
            (if (pixelMax.asKnown().isPresent) 1 else 0) +
            (if (pixelMin.asKnown().isPresent) 1 else 0) +
            (if (pointingAngleAzEnd.asKnown().isPresent) 1 else 0) +
            (if (pointingAngleAzStart.asKnown().isPresent) 1 else 0) +
            (if (pointingAngleElEnd.asKnown().isPresent) 1 else 0) +
            (if (pointingAngleElStart.asKnown().isPresent) 1 else 0) +
            (if (polarAngleEnd.asKnown().isPresent) 1 else 0) +
            (if (polarAngleStart.asKnown().isPresent) 1 else 0) +
            (referenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
            (if (satelliteName.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (senalt.asKnown().isPresent) 1 else 0) +
            (if (senlat.asKnown().isPresent) 1 else 0) +
            (if (senlon.asKnown().isPresent) 1 else 0) +
            (senReferenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sensorAsId.asKnown().isPresent) 1 else 0) +
            (if (senvelx.asKnown().isPresent) 1 else 0) +
            (if (senvely.asKnown().isPresent) 1 else 0) +
            (if (senvelz.asKnown().isPresent) 1 else 0) +
            (if (senx.asKnown().isPresent) 1 else 0) +
            (if (seny.asKnown().isPresent) 1 else 0) +
            (if (senz.asKnown().isPresent) 1 else 0) +
            (if (softwareVersion.asKnown().isPresent) 1 else 0) +
            (if (solarMag.asKnown().isPresent) 1 else 0) +
            (if (solarPhaseAngleBrightnessChangeDetected.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (spectralFilters.asKnown().getOrNull()?.size ?: 0) +
            (if (starCatName.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (uct.asKnown().isPresent) 1 else 0) +
            (if (validCalibrations.asKnown().isPresent) 1 else 0)

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

    /** Observation type (OPTICAL, RADAR). */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OPTICAL = of("OPTICAL")

            @JvmField val RADAR = of("RADAR")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            OPTICAL,
            RADAR,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPTICAL,
            RADAR,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                OPTICAL -> Value.OPTICAL
                RADAR -> Value.RADAR
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
                OPTICAL -> Known.OPTICAL
                RADAR -> Known.RADAR
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Schema for SOI Calibration data. */
    class Calibration
    private constructor(
        private val calBgIntensity: JsonField<Double>,
        private val calExtinctionCoeff: JsonField<Double>,
        private val calExtinctionCoeffMaxUnc: JsonField<Double>,
        private val calExtinctionCoeffUnc: JsonField<Double>,
        private val calNumCorrelatedStars: JsonField<Int>,
        private val calNumDetectedStars: JsonField<Int>,
        private val calSkyBg: JsonField<Double>,
        private val calSpectralFilterSolarMag: JsonField<Double>,
        private val calTime: JsonField<OffsetDateTime>,
        private val calType: JsonField<String>,
        private val calZeroPoint: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("calBgIntensity")
            @ExcludeMissing
            calBgIntensity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("calExtinctionCoeff")
            @ExcludeMissing
            calExtinctionCoeff: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("calExtinctionCoeffMaxUnc")
            @ExcludeMissing
            calExtinctionCoeffMaxUnc: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("calExtinctionCoeffUnc")
            @ExcludeMissing
            calExtinctionCoeffUnc: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("calNumCorrelatedStars")
            @ExcludeMissing
            calNumCorrelatedStars: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("calNumDetectedStars")
            @ExcludeMissing
            calNumDetectedStars: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("calSkyBg")
            @ExcludeMissing
            calSkyBg: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("calSpectralFilterSolarMag")
            @ExcludeMissing
            calSpectralFilterSolarMag: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("calTime")
            @ExcludeMissing
            calTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("calType") @ExcludeMissing calType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("calZeroPoint")
            @ExcludeMissing
            calZeroPoint: JsonField<Double> = JsonMissing.of(),
        ) : this(
            calBgIntensity,
            calExtinctionCoeff,
            calExtinctionCoeffMaxUnc,
            calExtinctionCoeffUnc,
            calNumCorrelatedStars,
            calNumDetectedStars,
            calSkyBg,
            calSpectralFilterSolarMag,
            calTime,
            calType,
            calZeroPoint,
            mutableMapOf(),
        )

        /**
         * Background intensity, at calibration, specified in kilowatts per steradian per
         * micrometer.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun calBgIntensity(): Optional<Double> = calBgIntensity.getOptional("calBgIntensity")

        /**
         * Coefficient value for how much signal would be lost to atmospheric attenuation for a star
         * at zenith, in magnitudes per air mass.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun calExtinctionCoeff(): Optional<Double> =
            calExtinctionCoeff.getOptional("calExtinctionCoeff")

        /**
         * Maximum extinction coefficient uncertainty in magnitudes, at calibration (e.g. -5.0 to
         * 30.0).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun calExtinctionCoeffMaxUnc(): Optional<Double> =
            calExtinctionCoeffMaxUnc.getOptional("calExtinctionCoeffMaxUnc")

        /**
         * Extinction coefficient uncertainty in magnitudes, at calibration, which represents the
         * difference between the measured brightness and predicted brightness of the star with the
         * extinction removed, making it exo-atmospheric (e.g. -5.0 to 30.0).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun calExtinctionCoeffUnc(): Optional<Double> =
            calExtinctionCoeffUnc.getOptional("calExtinctionCoeffUnc")

        /**
         * Number of correlated stars in the FOV with the target object, at calibration. Can be 0
         * for narrow FOV sensors.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun calNumCorrelatedStars(): Optional<Int> =
            calNumCorrelatedStars.getOptional("calNumCorrelatedStars")

        /**
         * Number of detected stars in the FOV with the target object, at calibration. Helps
         * identify frames with clouds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun calNumDetectedStars(): Optional<Int> =
            calNumDetectedStars.getOptional("calNumDetectedStars")

        /**
         * Average Sky Background signals in magnitudes, at calibration. Sky Background refers to
         * the incoming light from an apparently empty part of the night sky.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun calSkyBg(): Optional<Double> = calSkyBg.getOptional("calSkyBg")

        /**
         * In-band solar magnitudes at 1 A.U, at calibration (e.g. -5.0 to 30.0).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun calSpectralFilterSolarMag(): Optional<Double> =
            calSpectralFilterSolarMag.getOptional("calSpectralFilterSolarMag")

        /**
         * Start time of calibration in ISO 8601 UTC time, with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun calTime(): Optional<OffsetDateTime> = calTime.getOptional("calTime")

        /**
         * Type of calibration (e.g. PRE, MID, POST).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun calType(): Optional<String> = calType.getOptional("calType")

        /**
         * Value representing the difference between the catalog magnitude and instrumental
         * magnitude for a set of standard stars, at calibration (e.g. -5.0 to 30.0).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun calZeroPoint(): Optional<Double> = calZeroPoint.getOptional("calZeroPoint")

        /**
         * Returns the raw JSON value of [calBgIntensity].
         *
         * Unlike [calBgIntensity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("calBgIntensity")
        @ExcludeMissing
        fun _calBgIntensity(): JsonField<Double> = calBgIntensity

        /**
         * Returns the raw JSON value of [calExtinctionCoeff].
         *
         * Unlike [calExtinctionCoeff], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("calExtinctionCoeff")
        @ExcludeMissing
        fun _calExtinctionCoeff(): JsonField<Double> = calExtinctionCoeff

        /**
         * Returns the raw JSON value of [calExtinctionCoeffMaxUnc].
         *
         * Unlike [calExtinctionCoeffMaxUnc], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("calExtinctionCoeffMaxUnc")
        @ExcludeMissing
        fun _calExtinctionCoeffMaxUnc(): JsonField<Double> = calExtinctionCoeffMaxUnc

        /**
         * Returns the raw JSON value of [calExtinctionCoeffUnc].
         *
         * Unlike [calExtinctionCoeffUnc], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("calExtinctionCoeffUnc")
        @ExcludeMissing
        fun _calExtinctionCoeffUnc(): JsonField<Double> = calExtinctionCoeffUnc

        /**
         * Returns the raw JSON value of [calNumCorrelatedStars].
         *
         * Unlike [calNumCorrelatedStars], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("calNumCorrelatedStars")
        @ExcludeMissing
        fun _calNumCorrelatedStars(): JsonField<Int> = calNumCorrelatedStars

        /**
         * Returns the raw JSON value of [calNumDetectedStars].
         *
         * Unlike [calNumDetectedStars], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("calNumDetectedStars")
        @ExcludeMissing
        fun _calNumDetectedStars(): JsonField<Int> = calNumDetectedStars

        /**
         * Returns the raw JSON value of [calSkyBg].
         *
         * Unlike [calSkyBg], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("calSkyBg") @ExcludeMissing fun _calSkyBg(): JsonField<Double> = calSkyBg

        /**
         * Returns the raw JSON value of [calSpectralFilterSolarMag].
         *
         * Unlike [calSpectralFilterSolarMag], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("calSpectralFilterSolarMag")
        @ExcludeMissing
        fun _calSpectralFilterSolarMag(): JsonField<Double> = calSpectralFilterSolarMag

        /**
         * Returns the raw JSON value of [calTime].
         *
         * Unlike [calTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("calTime") @ExcludeMissing fun _calTime(): JsonField<OffsetDateTime> = calTime

        /**
         * Returns the raw JSON value of [calType].
         *
         * Unlike [calType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("calType") @ExcludeMissing fun _calType(): JsonField<String> = calType

        /**
         * Returns the raw JSON value of [calZeroPoint].
         *
         * Unlike [calZeroPoint], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("calZeroPoint")
        @ExcludeMissing
        fun _calZeroPoint(): JsonField<Double> = calZeroPoint

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

            /** Returns a mutable builder for constructing an instance of [Calibration]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Calibration]. */
        class Builder internal constructor() {

            private var calBgIntensity: JsonField<Double> = JsonMissing.of()
            private var calExtinctionCoeff: JsonField<Double> = JsonMissing.of()
            private var calExtinctionCoeffMaxUnc: JsonField<Double> = JsonMissing.of()
            private var calExtinctionCoeffUnc: JsonField<Double> = JsonMissing.of()
            private var calNumCorrelatedStars: JsonField<Int> = JsonMissing.of()
            private var calNumDetectedStars: JsonField<Int> = JsonMissing.of()
            private var calSkyBg: JsonField<Double> = JsonMissing.of()
            private var calSpectralFilterSolarMag: JsonField<Double> = JsonMissing.of()
            private var calTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var calType: JsonField<String> = JsonMissing.of()
            private var calZeroPoint: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(calibration: Calibration) = apply {
                calBgIntensity = calibration.calBgIntensity
                calExtinctionCoeff = calibration.calExtinctionCoeff
                calExtinctionCoeffMaxUnc = calibration.calExtinctionCoeffMaxUnc
                calExtinctionCoeffUnc = calibration.calExtinctionCoeffUnc
                calNumCorrelatedStars = calibration.calNumCorrelatedStars
                calNumDetectedStars = calibration.calNumDetectedStars
                calSkyBg = calibration.calSkyBg
                calSpectralFilterSolarMag = calibration.calSpectralFilterSolarMag
                calTime = calibration.calTime
                calType = calibration.calType
                calZeroPoint = calibration.calZeroPoint
                additionalProperties = calibration.additionalProperties.toMutableMap()
            }

            /**
             * Background intensity, at calibration, specified in kilowatts per steradian per
             * micrometer.
             */
            fun calBgIntensity(calBgIntensity: Double) =
                calBgIntensity(JsonField.of(calBgIntensity))

            /**
             * Sets [Builder.calBgIntensity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calBgIntensity] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun calBgIntensity(calBgIntensity: JsonField<Double>) = apply {
                this.calBgIntensity = calBgIntensity
            }

            /**
             * Coefficient value for how much signal would be lost to atmospheric attenuation for a
             * star at zenith, in magnitudes per air mass.
             */
            fun calExtinctionCoeff(calExtinctionCoeff: Double) =
                calExtinctionCoeff(JsonField.of(calExtinctionCoeff))

            /**
             * Sets [Builder.calExtinctionCoeff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calExtinctionCoeff] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun calExtinctionCoeff(calExtinctionCoeff: JsonField<Double>) = apply {
                this.calExtinctionCoeff = calExtinctionCoeff
            }

            /**
             * Maximum extinction coefficient uncertainty in magnitudes, at calibration (e.g. -5.0
             * to 30.0).
             */
            fun calExtinctionCoeffMaxUnc(calExtinctionCoeffMaxUnc: Double) =
                calExtinctionCoeffMaxUnc(JsonField.of(calExtinctionCoeffMaxUnc))

            /**
             * Sets [Builder.calExtinctionCoeffMaxUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calExtinctionCoeffMaxUnc] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun calExtinctionCoeffMaxUnc(calExtinctionCoeffMaxUnc: JsonField<Double>) = apply {
                this.calExtinctionCoeffMaxUnc = calExtinctionCoeffMaxUnc
            }

            /**
             * Extinction coefficient uncertainty in magnitudes, at calibration, which represents
             * the difference between the measured brightness and predicted brightness of the star
             * with the extinction removed, making it exo-atmospheric (e.g. -5.0 to 30.0).
             */
            fun calExtinctionCoeffUnc(calExtinctionCoeffUnc: Double) =
                calExtinctionCoeffUnc(JsonField.of(calExtinctionCoeffUnc))

            /**
             * Sets [Builder.calExtinctionCoeffUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calExtinctionCoeffUnc] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun calExtinctionCoeffUnc(calExtinctionCoeffUnc: JsonField<Double>) = apply {
                this.calExtinctionCoeffUnc = calExtinctionCoeffUnc
            }

            /**
             * Number of correlated stars in the FOV with the target object, at calibration. Can be
             * 0 for narrow FOV sensors.
             */
            fun calNumCorrelatedStars(calNumCorrelatedStars: Int) =
                calNumCorrelatedStars(JsonField.of(calNumCorrelatedStars))

            /**
             * Sets [Builder.calNumCorrelatedStars] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calNumCorrelatedStars] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun calNumCorrelatedStars(calNumCorrelatedStars: JsonField<Int>) = apply {
                this.calNumCorrelatedStars = calNumCorrelatedStars
            }

            /**
             * Number of detected stars in the FOV with the target object, at calibration. Helps
             * identify frames with clouds.
             */
            fun calNumDetectedStars(calNumDetectedStars: Int) =
                calNumDetectedStars(JsonField.of(calNumDetectedStars))

            /**
             * Sets [Builder.calNumDetectedStars] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calNumDetectedStars] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun calNumDetectedStars(calNumDetectedStars: JsonField<Int>) = apply {
                this.calNumDetectedStars = calNumDetectedStars
            }

            /**
             * Average Sky Background signals in magnitudes, at calibration. Sky Background refers
             * to the incoming light from an apparently empty part of the night sky.
             */
            fun calSkyBg(calSkyBg: Double) = calSkyBg(JsonField.of(calSkyBg))

            /**
             * Sets [Builder.calSkyBg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calSkyBg] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun calSkyBg(calSkyBg: JsonField<Double>) = apply { this.calSkyBg = calSkyBg }

            /** In-band solar magnitudes at 1 A.U, at calibration (e.g. -5.0 to 30.0). */
            fun calSpectralFilterSolarMag(calSpectralFilterSolarMag: Double) =
                calSpectralFilterSolarMag(JsonField.of(calSpectralFilterSolarMag))

            /**
             * Sets [Builder.calSpectralFilterSolarMag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calSpectralFilterSolarMag] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun calSpectralFilterSolarMag(calSpectralFilterSolarMag: JsonField<Double>) = apply {
                this.calSpectralFilterSolarMag = calSpectralFilterSolarMag
            }

            /** Start time of calibration in ISO 8601 UTC time, with millisecond precision. */
            fun calTime(calTime: OffsetDateTime) = calTime(JsonField.of(calTime))

            /**
             * Sets [Builder.calTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun calTime(calTime: JsonField<OffsetDateTime>) = apply { this.calTime = calTime }

            /** Type of calibration (e.g. PRE, MID, POST). */
            fun calType(calType: String) = calType(JsonField.of(calType))

            /**
             * Sets [Builder.calType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun calType(calType: JsonField<String>) = apply { this.calType = calType }

            /**
             * Value representing the difference between the catalog magnitude and instrumental
             * magnitude for a set of standard stars, at calibration (e.g. -5.0 to 30.0).
             */
            fun calZeroPoint(calZeroPoint: Double) = calZeroPoint(JsonField.of(calZeroPoint))

            /**
             * Sets [Builder.calZeroPoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calZeroPoint] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun calZeroPoint(calZeroPoint: JsonField<Double>) = apply {
                this.calZeroPoint = calZeroPoint
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
             * Returns an immutable instance of [Calibration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Calibration =
                Calibration(
                    calBgIntensity,
                    calExtinctionCoeff,
                    calExtinctionCoeffMaxUnc,
                    calExtinctionCoeffUnc,
                    calNumCorrelatedStars,
                    calNumDetectedStars,
                    calSkyBg,
                    calSpectralFilterSolarMag,
                    calTime,
                    calType,
                    calZeroPoint,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Calibration = apply {
            if (validated) {
                return@apply
            }

            calBgIntensity()
            calExtinctionCoeff()
            calExtinctionCoeffMaxUnc()
            calExtinctionCoeffUnc()
            calNumCorrelatedStars()
            calNumDetectedStars()
            calSkyBg()
            calSpectralFilterSolarMag()
            calTime()
            calType()
            calZeroPoint()
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
            (if (calBgIntensity.asKnown().isPresent) 1 else 0) +
                (if (calExtinctionCoeff.asKnown().isPresent) 1 else 0) +
                (if (calExtinctionCoeffMaxUnc.asKnown().isPresent) 1 else 0) +
                (if (calExtinctionCoeffUnc.asKnown().isPresent) 1 else 0) +
                (if (calNumCorrelatedStars.asKnown().isPresent) 1 else 0) +
                (if (calNumDetectedStars.asKnown().isPresent) 1 else 0) +
                (if (calSkyBg.asKnown().isPresent) 1 else 0) +
                (if (calSpectralFilterSolarMag.asKnown().isPresent) 1 else 0) +
                (if (calTime.asKnown().isPresent) 1 else 0) +
                (if (calType.asKnown().isPresent) 1 else 0) +
                (if (calZeroPoint.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Calibration &&
                calBgIntensity == other.calBgIntensity &&
                calExtinctionCoeff == other.calExtinctionCoeff &&
                calExtinctionCoeffMaxUnc == other.calExtinctionCoeffMaxUnc &&
                calExtinctionCoeffUnc == other.calExtinctionCoeffUnc &&
                calNumCorrelatedStars == other.calNumCorrelatedStars &&
                calNumDetectedStars == other.calNumDetectedStars &&
                calSkyBg == other.calSkyBg &&
                calSpectralFilterSolarMag == other.calSpectralFilterSolarMag &&
                calTime == other.calTime &&
                calType == other.calType &&
                calZeroPoint == other.calZeroPoint &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                calBgIntensity,
                calExtinctionCoeff,
                calExtinctionCoeffMaxUnc,
                calExtinctionCoeffUnc,
                calNumCorrelatedStars,
                calNumDetectedStars,
                calSkyBg,
                calSpectralFilterSolarMag,
                calTime,
                calType,
                calZeroPoint,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Calibration{calBgIntensity=$calBgIntensity, calExtinctionCoeff=$calExtinctionCoeff, calExtinctionCoeffMaxUnc=$calExtinctionCoeffMaxUnc, calExtinctionCoeffUnc=$calExtinctionCoeffUnc, calNumCorrelatedStars=$calNumCorrelatedStars, calNumDetectedStars=$calNumDetectedStars, calSkyBg=$calSkyBg, calSpectralFilterSolarMag=$calSpectralFilterSolarMag, calTime=$calTime, calType=$calType, calZeroPoint=$calZeroPoint, additionalProperties=$additionalProperties}"
    }

    /**
     * The reference frame of the observation measurements. If the referenceFrame is null it is
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

        return other is SoiObservationSetListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            numObs == other.numObs &&
            source == other.source &&
            startTime == other.startTime &&
            type == other.type &&
            id == other.id &&
            binningHoriz == other.binningHoriz &&
            binningVert == other.binningVert &&
            brightnessVarianceChangeDetected == other.brightnessVarianceChangeDetected &&
            calibrations == other.calibrations &&
            calibrationType == other.calibrationType &&
            changeConf == other.changeConf &&
            changeDetected == other.changeDetected &&
            collectionDensityConf == other.collectionDensityConf &&
            collectionId == other.collectionId &&
            collectionMode == other.collectionMode &&
            corrQuality == other.corrQuality &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            endTime == other.endTime &&
            gain == other.gain &&
            idElset == other.idElset &&
            idOnOrbit == other.idOnOrbit &&
            idSensor == other.idSensor &&
            losDeclinationEnd == other.losDeclinationEnd &&
            losDeclinationStart == other.losDeclinationStart &&
            msgCreateDate == other.msgCreateDate &&
            numSpectralFilters == other.numSpectralFilters &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            origSensorId == other.origSensorId &&
            percentSatThreshold == other.percentSatThreshold &&
            periodicityChangeDetected == other.periodicityChangeDetected &&
            periodicityDetectionConf == other.periodicityDetectionConf &&
            periodicitySamplingConf == other.periodicitySamplingConf &&
            pixelArrayHeight == other.pixelArrayHeight &&
            pixelArrayWidth == other.pixelArrayWidth &&
            pixelMax == other.pixelMax &&
            pixelMin == other.pixelMin &&
            pointingAngleAzEnd == other.pointingAngleAzEnd &&
            pointingAngleAzStart == other.pointingAngleAzStart &&
            pointingAngleElEnd == other.pointingAngleElEnd &&
            pointingAngleElStart == other.pointingAngleElStart &&
            polarAngleEnd == other.polarAngleEnd &&
            polarAngleStart == other.polarAngleStart &&
            referenceFrame == other.referenceFrame &&
            satelliteName == other.satelliteName &&
            satNo == other.satNo &&
            senalt == other.senalt &&
            senlat == other.senlat &&
            senlon == other.senlon &&
            senReferenceFrame == other.senReferenceFrame &&
            sensorAsId == other.sensorAsId &&
            senvelx == other.senvelx &&
            senvely == other.senvely &&
            senvelz == other.senvelz &&
            senx == other.senx &&
            seny == other.seny &&
            senz == other.senz &&
            softwareVersion == other.softwareVersion &&
            solarMag == other.solarMag &&
            solarPhaseAngleBrightnessChangeDetected ==
                other.solarPhaseAngleBrightnessChangeDetected &&
            sourceDl == other.sourceDl &&
            spectralFilters == other.spectralFilters &&
            starCatName == other.starCatName &&
            tags == other.tags &&
            transactionId == other.transactionId &&
            uct == other.uct &&
            validCalibrations == other.validCalibrations &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            numObs,
            source,
            startTime,
            type,
            id,
            binningHoriz,
            binningVert,
            brightnessVarianceChangeDetected,
            calibrations,
            calibrationType,
            changeConf,
            changeDetected,
            collectionDensityConf,
            collectionId,
            collectionMode,
            corrQuality,
            createdAt,
            createdBy,
            endTime,
            gain,
            idElset,
            idOnOrbit,
            idSensor,
            losDeclinationEnd,
            losDeclinationStart,
            msgCreateDate,
            numSpectralFilters,
            origin,
            origNetwork,
            origObjectId,
            origSensorId,
            percentSatThreshold,
            periodicityChangeDetected,
            periodicityDetectionConf,
            periodicitySamplingConf,
            pixelArrayHeight,
            pixelArrayWidth,
            pixelMax,
            pixelMin,
            pointingAngleAzEnd,
            pointingAngleAzStart,
            pointingAngleElEnd,
            pointingAngleElStart,
            polarAngleEnd,
            polarAngleStart,
            referenceFrame,
            satelliteName,
            satNo,
            senalt,
            senlat,
            senlon,
            senReferenceFrame,
            sensorAsId,
            senvelx,
            senvely,
            senvelz,
            senx,
            seny,
            senz,
            softwareVersion,
            solarMag,
            solarPhaseAngleBrightnessChangeDetected,
            sourceDl,
            spectralFilters,
            starCatName,
            tags,
            transactionId,
            uct,
            validCalibrations,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SoiObservationSetListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, numObs=$numObs, source=$source, startTime=$startTime, type=$type, id=$id, binningHoriz=$binningHoriz, binningVert=$binningVert, brightnessVarianceChangeDetected=$brightnessVarianceChangeDetected, calibrations=$calibrations, calibrationType=$calibrationType, changeConf=$changeConf, changeDetected=$changeDetected, collectionDensityConf=$collectionDensityConf, collectionId=$collectionId, collectionMode=$collectionMode, corrQuality=$corrQuality, createdAt=$createdAt, createdBy=$createdBy, endTime=$endTime, gain=$gain, idElset=$idElset, idOnOrbit=$idOnOrbit, idSensor=$idSensor, losDeclinationEnd=$losDeclinationEnd, losDeclinationStart=$losDeclinationStart, msgCreateDate=$msgCreateDate, numSpectralFilters=$numSpectralFilters, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, percentSatThreshold=$percentSatThreshold, periodicityChangeDetected=$periodicityChangeDetected, periodicityDetectionConf=$periodicityDetectionConf, periodicitySamplingConf=$periodicitySamplingConf, pixelArrayHeight=$pixelArrayHeight, pixelArrayWidth=$pixelArrayWidth, pixelMax=$pixelMax, pixelMin=$pixelMin, pointingAngleAzEnd=$pointingAngleAzEnd, pointingAngleAzStart=$pointingAngleAzStart, pointingAngleElEnd=$pointingAngleElEnd, pointingAngleElStart=$pointingAngleElStart, polarAngleEnd=$polarAngleEnd, polarAngleStart=$polarAngleStart, referenceFrame=$referenceFrame, satelliteName=$satelliteName, satNo=$satNo, senalt=$senalt, senlat=$senlat, senlon=$senlon, senReferenceFrame=$senReferenceFrame, sensorAsId=$sensorAsId, senvelx=$senvelx, senvely=$senvely, senvelz=$senvelz, senx=$senx, seny=$seny, senz=$senz, softwareVersion=$softwareVersion, solarMag=$solarMag, solarPhaseAngleBrightnessChangeDetected=$solarPhaseAngleBrightnessChangeDetected, sourceDl=$sourceDl, spectralFilters=$spectralFilters, starCatName=$starCatName, tags=$tags, transactionId=$transactionId, uct=$uct, validCalibrations=$validCalibrations, additionalProperties=$additionalProperties}"
}

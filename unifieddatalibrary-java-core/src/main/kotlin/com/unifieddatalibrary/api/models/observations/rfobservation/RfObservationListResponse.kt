// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.rfobservation

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

/**
 * Model representation of observation data for active/passive radio frequency (RF) based sensor
 * phenomenologies. J2000 is the preferred coordinate frame for all observations, but in some cases
 * observations may be in another frame depending on the provider. Please see the 'Discover' tab in
 * the storefront to confirm coordinate frames by data provider. RF observations include several
 * optional ordered arrays which are used to provide detailed information on recorded signals such
 * as power spectral density lists or active signals (code taps/fills, etc). In these cases, the
 * sizes of the arrays must match and can be assumed to have consistent indexing across arrays (e.g.
 * powers[0] is the measured power at frequencies[0]).
 */
class RfObservationListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val obTime: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val type: JsonField<String>,
    private val id: JsonField<String>,
    private val antennaName: JsonField<String>,
    private val azimuth: JsonField<Double>,
    private val azimuthMeasured: JsonField<Boolean>,
    private val azimuthRate: JsonField<Double>,
    private val azimuthUnc: JsonField<Double>,
    private val bandwidth: JsonField<Double>,
    private val baudRate: JsonField<Double>,
    private val bitErrorRate: JsonField<Double>,
    private val carrierStandard: JsonField<String>,
    private val channel: JsonField<Int>,
    private val collectionMode: JsonField<String>,
    private val confidence: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val detectionStatus: JsonField<String>,
    private val eirp: JsonField<Double>,
    private val elevation: JsonField<Double>,
    private val elevationMeasured: JsonField<Boolean>,
    private val elevationRate: JsonField<Double>,
    private val elevationUnc: JsonField<Double>,
    private val elnot: JsonField<String>,
    private val endFrequency: JsonField<Double>,
    private val frequency: JsonField<Double>,
    private val frequencyShift: JsonField<Double>,
    private val idOnOrbit: JsonField<String>,
    private val idSensor: JsonField<String>,
    private val incoming: JsonField<Boolean>,
    private val innerCodingRate: JsonField<Int>,
    private val maxPsd: JsonField<Double>,
    private val minPsd: JsonField<Double>,
    private val modulation: JsonField<String>,
    private val noisePwrDensity: JsonField<Double>,
    private val nominalBandwidth: JsonField<Double>,
    private val nominalEirp: JsonField<Double>,
    private val nominalFrequency: JsonField<Double>,
    private val nominalPowerOverNoise: JsonField<Double>,
    private val nominalSnr: JsonField<Double>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val outerCodingRate: JsonField<Int>,
    private val peak: JsonField<Boolean>,
    private val pgri: JsonField<Double>,
    private val polarity: JsonField<Double>,
    private val polarityType: JsonField<PolarityType>,
    private val powerOverNoise: JsonField<Double>,
    private val range: JsonField<Double>,
    private val rangeMeasured: JsonField<Boolean>,
    private val rangeRate: JsonField<Double>,
    private val rangeRateMeasured: JsonField<Boolean>,
    private val rangeRateUnc: JsonField<Double>,
    private val rangeUnc: JsonField<Double>,
    private val rawFileUri: JsonField<String>,
    private val referenceLevel: JsonField<Double>,
    private val relativeCarrierPower: JsonField<Double>,
    private val relativeNoiseFloor: JsonField<Double>,
    private val resolutionBandwidth: JsonField<Double>,
    private val satNo: JsonField<Int>,
    private val senalt: JsonField<Double>,
    private val senlat: JsonField<Double>,
    private val senlon: JsonField<Double>,
    private val snr: JsonField<Double>,
    private val sourceDl: JsonField<String>,
    private val spectrumAnalyzerPower: JsonField<Double>,
    private val startFrequency: JsonField<Double>,
    private val switchPoint: JsonField<Int>,
    private val symbolToNoiseRatio: JsonField<Double>,
    private val taskId: JsonField<String>,
    private val trackId: JsonField<String>,
    private val trackRange: JsonField<Double>,
    private val transactionId: JsonField<String>,
    private val transmitFilterRollOff: JsonField<Double>,
    private val transmitFilterType: JsonField<String>,
    private val transponder: JsonField<String>,
    private val uct: JsonField<Boolean>,
    private val url: JsonField<String>,
    private val videoBandwidth: JsonField<Double>,
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
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("antennaName")
        @ExcludeMissing
        antennaName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("azimuth") @ExcludeMissing azimuth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azimuthMeasured")
        @ExcludeMissing
        azimuthMeasured: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("azimuthRate")
        @ExcludeMissing
        azimuthRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azimuthUnc")
        @ExcludeMissing
        azimuthUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bandwidth") @ExcludeMissing bandwidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("baudRate") @ExcludeMissing baudRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bitErrorRate")
        @ExcludeMissing
        bitErrorRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("carrierStandard")
        @ExcludeMissing
        carrierStandard: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channel") @ExcludeMissing channel: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("collectionMode")
        @ExcludeMissing
        collectionMode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("confidence")
        @ExcludeMissing
        confidence: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("detectionStatus")
        @ExcludeMissing
        detectionStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eirp") @ExcludeMissing eirp: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elevation") @ExcludeMissing elevation: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elevationMeasured")
        @ExcludeMissing
        elevationMeasured: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("elevationRate")
        @ExcludeMissing
        elevationRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elevationUnc")
        @ExcludeMissing
        elevationUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elnot") @ExcludeMissing elnot: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endFrequency")
        @ExcludeMissing
        endFrequency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("frequency") @ExcludeMissing frequency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("frequencyShift")
        @ExcludeMissing
        frequencyShift: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("incoming") @ExcludeMissing incoming: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("innerCodingRate")
        @ExcludeMissing
        innerCodingRate: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("maxPSD") @ExcludeMissing maxPsd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minPSD") @ExcludeMissing minPsd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("modulation")
        @ExcludeMissing
        modulation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("noisePwrDensity")
        @ExcludeMissing
        noisePwrDensity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("nominalBandwidth")
        @ExcludeMissing
        nominalBandwidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("nominalEirp")
        @ExcludeMissing
        nominalEirp: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("nominalFrequency")
        @ExcludeMissing
        nominalFrequency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("nominalPowerOverNoise")
        @ExcludeMissing
        nominalPowerOverNoise: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("nominalSnr")
        @ExcludeMissing
        nominalSnr: JsonField<Double> = JsonMissing.of(),
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
        @JsonProperty("outerCodingRate")
        @ExcludeMissing
        outerCodingRate: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("peak") @ExcludeMissing peak: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("pgri") @ExcludeMissing pgri: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("polarity") @ExcludeMissing polarity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("polarityType")
        @ExcludeMissing
        polarityType: JsonField<PolarityType> = JsonMissing.of(),
        @JsonProperty("powerOverNoise")
        @ExcludeMissing
        powerOverNoise: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("range") @ExcludeMissing range: JsonField<Double> = JsonMissing.of(),
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
        @JsonProperty("rawFileURI")
        @ExcludeMissing
        rawFileUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referenceLevel")
        @ExcludeMissing
        referenceLevel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("relativeCarrierPower")
        @ExcludeMissing
        relativeCarrierPower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("relativeNoiseFloor")
        @ExcludeMissing
        relativeNoiseFloor: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("resolutionBandwidth")
        @ExcludeMissing
        resolutionBandwidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("senalt") @ExcludeMissing senalt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlat") @ExcludeMissing senlat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlon") @ExcludeMissing senlon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("snr") @ExcludeMissing snr: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spectrumAnalyzerPower")
        @ExcludeMissing
        spectrumAnalyzerPower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("startFrequency")
        @ExcludeMissing
        startFrequency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("switchPoint") @ExcludeMissing switchPoint: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("symbolToNoiseRatio")
        @ExcludeMissing
        symbolToNoiseRatio: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("taskId") @ExcludeMissing taskId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trackId") @ExcludeMissing trackId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trackRange")
        @ExcludeMissing
        trackRange: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transmitFilterRollOff")
        @ExcludeMissing
        transmitFilterRollOff: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("transmitFilterType")
        @ExcludeMissing
        transmitFilterType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transponder")
        @ExcludeMissing
        transponder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uct") @ExcludeMissing uct: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("videoBandwidth")
        @ExcludeMissing
        videoBandwidth: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        obTime,
        source,
        type,
        id,
        antennaName,
        azimuth,
        azimuthMeasured,
        azimuthRate,
        azimuthUnc,
        bandwidth,
        baudRate,
        bitErrorRate,
        carrierStandard,
        channel,
        collectionMode,
        confidence,
        createdAt,
        createdBy,
        descriptor,
        detectionStatus,
        eirp,
        elevation,
        elevationMeasured,
        elevationRate,
        elevationUnc,
        elnot,
        endFrequency,
        frequency,
        frequencyShift,
        idOnOrbit,
        idSensor,
        incoming,
        innerCodingRate,
        maxPsd,
        minPsd,
        modulation,
        noisePwrDensity,
        nominalBandwidth,
        nominalEirp,
        nominalFrequency,
        nominalPowerOverNoise,
        nominalSnr,
        origin,
        origNetwork,
        origObjectId,
        origSensorId,
        outerCodingRate,
        peak,
        pgri,
        polarity,
        polarityType,
        powerOverNoise,
        range,
        rangeMeasured,
        rangeRate,
        rangeRateMeasured,
        rangeRateUnc,
        rangeUnc,
        rawFileUri,
        referenceLevel,
        relativeCarrierPower,
        relativeNoiseFloor,
        resolutionBandwidth,
        satNo,
        senalt,
        senlat,
        senlon,
        snr,
        sourceDl,
        spectrumAnalyzerPower,
        startFrequency,
        switchPoint,
        symbolToNoiseRatio,
        taskId,
        trackId,
        trackRange,
        transactionId,
        transmitFilterRollOff,
        transmitFilterType,
        transponder,
        uct,
        url,
        videoBandwidth,
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
     * Ob detection time in ISO 8601 UTC with microsecond precision.
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
     * Type of RF ob (e.g. RF, RF-SOSI, PSD, RFI, SPOOF, etc).
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
     * Antenna name of the RFObservation record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun antennaName(): Optional<String> = antennaName.getOptional("antennaName")

    /**
     * azimuth angle in degrees and J2000 coordinate frame.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azimuth(): Optional<Double> = azimuth.getOptional("azimuth")

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
     * Rate of change of the azimuth in degrees per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azimuthRate(): Optional<Double> = azimuthRate.getOptional("azimuthRate")

    /**
     * One sigma uncertainty in the azimuth angle measurement, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azimuthUnc(): Optional<Double> = azimuthUnc.getOptional("azimuthUnc")

    /**
     * Measured bandwidth in Hz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bandwidth(): Optional<Double> = bandwidth.getOptional("bandwidth")

    /**
     * Baud rate is the number of symbol changes, waveform changes, or signaling events, across the
     * transmission medium per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun baudRate(): Optional<Double> = baudRate.getOptional("baudRate")

    /**
     * The ratio of bit errors per number of received bits.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bitErrorRate(): Optional<Double> = bitErrorRate.getOptional("bitErrorRate")

    /**
     * Carrier standard (e.g. DVB-S2, 802.11g, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun carrierStandard(): Optional<String> = carrierStandard.getOptional("carrierStandard")

    /**
     * Channel of the RFObservation record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun channel(): Optional<Int> = channel.getOptional("channel")

    /**
     * Collection mode (e.g. SURVEY, SPOT_SEARCH, NEIGHBORHOOD_WATCH, DIRECTED_SEARCH, MANUAL, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun collectionMode(): Optional<String> = collectionMode.getOptional("collectionMode")

    /**
     * Confidence in the signal and its measurements and characterization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun confidence(): Optional<Double> = confidence.getOptional("confidence")

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
     * Detection status (e.g. DETECTED, CARRIER_ACQUIRING, CARRIER_DETECTED, NOT_DETECTED, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun detectionStatus(): Optional<String> = detectionStatus.getOptional("detectionStatus")

    /**
     * Measured Equivalent Isotopically Radiated Power in dBW.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eirp(): Optional<Double> = eirp.getOptional("eirp")

    /**
     * elevation in degrees and J2000 coordinate frame.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevation(): Optional<Double> = elevation.getOptional("elevation")

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
     * Rate of change of the elevation in degrees per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevationRate(): Optional<Double> = elevationRate.getOptional("elevationRate")

    /**
     * One sigma uncertainty in the elevation angle measurement, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevationUnc(): Optional<Double> = elevationUnc.getOptional("elevationUnc")

    /**
     * ELINT notation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elnot(): Optional<String> = elnot.getOptional("elnot")

    /**
     * End carrier frequency in Hz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endFrequency(): Optional<Double> = endFrequency.getOptional("endFrequency")

    /**
     * Center carrier frequency in Hz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun frequency(): Optional<Double> = frequency.getOptional("frequency")

    /**
     * Frequency Shift of the RFObservation record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun frequencyShift(): Optional<Double> = frequencyShift.getOptional("frequencyShift")

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
     * True if the signal is incoming, false if outgoing.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun incoming(): Optional<Boolean> = incoming.getOptional("incoming")

    /**
     * Inner forward error correction rate: 0 = Auto, 1 = 1/2, 2 = 2/3, 3 = 3/4, 4 = 5/6, 5 = 7/8, 6
     * = 8/9, 7 = 3/5, 8 = 4/5, 9 = 9/10, 15 = None.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun innerCodingRate(): Optional<Int> = innerCodingRate.getOptional("innerCodingRate")

    /**
     * Maximum measured PSD value of the trace in dBW.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxPsd(): Optional<Double> = maxPsd.getOptional("maxPSD")

    /**
     * Minimum measured PSD value of the trace in dBW.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minPsd(): Optional<Double> = minPsd.getOptional("minPSD")

    /**
     * Transponder modulation (e.g. Auto, QPSK, 8PSK, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun modulation(): Optional<String> = modulation.getOptional("modulation")

    /**
     * Noise power density, in dBW-Hz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun noisePwrDensity(): Optional<Double> = noisePwrDensity.getOptional("noisePwrDensity")

    /**
     * Expected bandwidth in Hz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nominalBandwidth(): Optional<Double> = nominalBandwidth.getOptional("nominalBandwidth")

    /**
     * Expected Equivalent Isotopically Radiated Power in dBW.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nominalEirp(): Optional<Double> = nominalEirp.getOptional("nominalEirp")

    /**
     * Nominal or expected center carrier frequency in Hz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nominalFrequency(): Optional<Double> = nominalFrequency.getOptional("nominalFrequency")

    /**
     * Expected carrier power over noise (dBW/Hz).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nominalPowerOverNoise(): Optional<Double> =
        nominalPowerOverNoise.getOptional("nominalPowerOverNoise")

    /**
     * Nominal or expected signal to noise ratio, in dB.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nominalSnr(): Optional<Double> = nominalSnr.getOptional("nominalSnr")

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
     * Outer forward error correction rate: 0 = Auto, 1 = 1/2, 2 = 2/3, 3 = 3/4, 4 = 5/6, 5 = 7/8, 6
     * = 8/9, 7 = 3/5, 8 = 4/5, 9 = 9/10, 15 = None.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun outerCodingRate(): Optional<Int> = outerCodingRate.getOptional("outerCodingRate")

    /**
     * Peak of the RFObservation record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun peak(): Optional<Boolean> = peak.getOptional("peak")

    /**
     * A pulse group repetition interval (PGRI) is a pulse train in which there are groups of
     * closely spaced pulses separated by much longer times between these pulse groups.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pgri(): Optional<Double> = pgri.getOptional("pgri")

    /**
     * The antenna pointing dependent polarizer angle, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarity(): Optional<Double> = polarity.getOptional("polarity")

    /**
     * Transponder polarization e.g. H - (Horizontally Polarized) Perpendicular to Earth's surface,
     * V - (Vertically Polarized) Parallel to Earth's surface, L - (Left Hand Circularly Polarized)
     * Rotating left relative to the earth's surface, R - (Right Hand Circularly Polarized) Rotating
     * right relative to the earth's surface.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarityType(): Optional<PolarityType> = polarityType.getOptional("polarityType")

    /**
     * Measured carrier power over noise (dBW/Hz).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun powerOverNoise(): Optional<Double> = powerOverNoise.getOptional("powerOverNoise")

    /**
     * Target range in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun range(): Optional<Double> = range.getOptional("range")

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
     * Rate of change of the range in km/sec.
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
     * One sigma uncertainty in the range rate measurement, in kilometers/second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeRateUnc(): Optional<Double> = rangeRateUnc.getOptional("rangeRateUnc")

    /**
     * One sigma uncertainty in the range measurement, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rangeUnc(): Optional<Double> = rangeUnc.getOptional("rangeUnc")

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
     * Reference signal level, in dBW.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun referenceLevel(): Optional<Double> = referenceLevel.getOptional("referenceLevel")

    /**
     * Measured power of the center carrier frequency in dBW.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun relativeCarrierPower(): Optional<Double> =
        relativeCarrierPower.getOptional("relativeCarrierPower")

    /**
     * The measure of the signal created from the sum of all the noise sources and unwanted signals
     * within the measurement system, in dBW.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun relativeNoiseFloor(): Optional<Double> =
        relativeNoiseFloor.getOptional("relativeNoiseFloor")

    /**
     * Resolution bandwidth in Hz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun resolutionBandwidth(): Optional<Double> =
        resolutionBandwidth.getOptional("resolutionBandwidth")

    /**
     * Satellite/Catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Sensor altitude at obTime (if mobile/onorbit) in km. If null, can be obtained from sensor
     * info.
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
     * Measured spectrum analyzer power of the center carrier frequency in dBW.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spectrumAnalyzerPower(): Optional<Double> =
        spectrumAnalyzerPower.getOptional("spectrumAnalyzerPower")

    /**
     * Start carrier frequency in Hz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startFrequency(): Optional<Double> = startFrequency.getOptional("startFrequency")

    /**
     * Switch Point of the RFObservation record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun switchPoint(): Optional<Int> = switchPoint.getOptional("switchPoint")

    /**
     * Symbol to noise ratio, in dB.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun symbolToNoiseRatio(): Optional<Double> =
        symbolToNoiseRatio.getOptional("symbolToNoiseRatio")

    /**
     * Optional identifier to indicate the specific tasking which produced this observation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun taskId(): Optional<String> = taskId.getOptional("taskId")

    /**
     * Optional identifier of the track to which this observation belongs.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackId(): Optional<String> = trackId.getOptional("trackId")

    /**
     * Target track or apparent range in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackRange(): Optional<Double> = trackRange.getOptional("trackRange")

    /**
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

    /**
     * Transmit pulse shaping filter roll-off value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transmitFilterRollOff(): Optional<Double> =
        transmitFilterRollOff.getOptional("transmitFilterRollOff")

    /**
     * Transmit pulse shaping filter typ (e.g. RRC).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transmitFilterType(): Optional<String> =
        transmitFilterType.getOptional("transmitFilterType")

    /**
     * Optional identifier provided by observation source to indicate the transponder used for this
     * measurement.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transponder(): Optional<String> = transponder.getOptional("transponder")

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
     * Optional URL containing additional information on this observation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Video bandwidth in Hz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun videoBandwidth(): Optional<Double> = videoBandwidth.getOptional("videoBandwidth")

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
     * Returns the raw JSON value of [antennaName].
     *
     * Unlike [antennaName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("antennaName") @ExcludeMissing fun _antennaName(): JsonField<String> = antennaName

    /**
     * Returns the raw JSON value of [azimuth].
     *
     * Unlike [azimuth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azimuth") @ExcludeMissing fun _azimuth(): JsonField<Double> = azimuth

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
     * Returns the raw JSON value of [bandwidth].
     *
     * Unlike [bandwidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bandwidth") @ExcludeMissing fun _bandwidth(): JsonField<Double> = bandwidth

    /**
     * Returns the raw JSON value of [baudRate].
     *
     * Unlike [baudRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("baudRate") @ExcludeMissing fun _baudRate(): JsonField<Double> = baudRate

    /**
     * Returns the raw JSON value of [bitErrorRate].
     *
     * Unlike [bitErrorRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bitErrorRate")
    @ExcludeMissing
    fun _bitErrorRate(): JsonField<Double> = bitErrorRate

    /**
     * Returns the raw JSON value of [carrierStandard].
     *
     * Unlike [carrierStandard], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("carrierStandard")
    @ExcludeMissing
    fun _carrierStandard(): JsonField<String> = carrierStandard

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Int> = channel

    /**
     * Returns the raw JSON value of [collectionMode].
     *
     * Unlike [collectionMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collectionMode")
    @ExcludeMissing
    fun _collectionMode(): JsonField<String> = collectionMode

    /**
     * Returns the raw JSON value of [confidence].
     *
     * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confidence") @ExcludeMissing fun _confidence(): JsonField<Double> = confidence

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
     * Returns the raw JSON value of [detectionStatus].
     *
     * Unlike [detectionStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detectionStatus")
    @ExcludeMissing
    fun _detectionStatus(): JsonField<String> = detectionStatus

    /**
     * Returns the raw JSON value of [eirp].
     *
     * Unlike [eirp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eirp") @ExcludeMissing fun _eirp(): JsonField<Double> = eirp

    /**
     * Returns the raw JSON value of [elevation].
     *
     * Unlike [elevation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elevation") @ExcludeMissing fun _elevation(): JsonField<Double> = elevation

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
     * Returns the raw JSON value of [elnot].
     *
     * Unlike [elnot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elnot") @ExcludeMissing fun _elnot(): JsonField<String> = elnot

    /**
     * Returns the raw JSON value of [endFrequency].
     *
     * Unlike [endFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endFrequency")
    @ExcludeMissing
    fun _endFrequency(): JsonField<Double> = endFrequency

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequency") @ExcludeMissing fun _frequency(): JsonField<Double> = frequency

    /**
     * Returns the raw JSON value of [frequencyShift].
     *
     * Unlike [frequencyShift], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequencyShift")
    @ExcludeMissing
    fun _frequencyShift(): JsonField<Double> = frequencyShift

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
     * Returns the raw JSON value of [incoming].
     *
     * Unlike [incoming], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("incoming") @ExcludeMissing fun _incoming(): JsonField<Boolean> = incoming

    /**
     * Returns the raw JSON value of [innerCodingRate].
     *
     * Unlike [innerCodingRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("innerCodingRate")
    @ExcludeMissing
    fun _innerCodingRate(): JsonField<Int> = innerCodingRate

    /**
     * Returns the raw JSON value of [maxPsd].
     *
     * Unlike [maxPsd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxPSD") @ExcludeMissing fun _maxPsd(): JsonField<Double> = maxPsd

    /**
     * Returns the raw JSON value of [minPsd].
     *
     * Unlike [minPsd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minPSD") @ExcludeMissing fun _minPsd(): JsonField<Double> = minPsd

    /**
     * Returns the raw JSON value of [modulation].
     *
     * Unlike [modulation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modulation") @ExcludeMissing fun _modulation(): JsonField<String> = modulation

    /**
     * Returns the raw JSON value of [noisePwrDensity].
     *
     * Unlike [noisePwrDensity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("noisePwrDensity")
    @ExcludeMissing
    fun _noisePwrDensity(): JsonField<Double> = noisePwrDensity

    /**
     * Returns the raw JSON value of [nominalBandwidth].
     *
     * Unlike [nominalBandwidth], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("nominalBandwidth")
    @ExcludeMissing
    fun _nominalBandwidth(): JsonField<Double> = nominalBandwidth

    /**
     * Returns the raw JSON value of [nominalEirp].
     *
     * Unlike [nominalEirp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nominalEirp") @ExcludeMissing fun _nominalEirp(): JsonField<Double> = nominalEirp

    /**
     * Returns the raw JSON value of [nominalFrequency].
     *
     * Unlike [nominalFrequency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("nominalFrequency")
    @ExcludeMissing
    fun _nominalFrequency(): JsonField<Double> = nominalFrequency

    /**
     * Returns the raw JSON value of [nominalPowerOverNoise].
     *
     * Unlike [nominalPowerOverNoise], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("nominalPowerOverNoise")
    @ExcludeMissing
    fun _nominalPowerOverNoise(): JsonField<Double> = nominalPowerOverNoise

    /**
     * Returns the raw JSON value of [nominalSnr].
     *
     * Unlike [nominalSnr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nominalSnr") @ExcludeMissing fun _nominalSnr(): JsonField<Double> = nominalSnr

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
     * Returns the raw JSON value of [outerCodingRate].
     *
     * Unlike [outerCodingRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outerCodingRate")
    @ExcludeMissing
    fun _outerCodingRate(): JsonField<Int> = outerCodingRate

    /**
     * Returns the raw JSON value of [peak].
     *
     * Unlike [peak], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("peak") @ExcludeMissing fun _peak(): JsonField<Boolean> = peak

    /**
     * Returns the raw JSON value of [pgri].
     *
     * Unlike [pgri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pgri") @ExcludeMissing fun _pgri(): JsonField<Double> = pgri

    /**
     * Returns the raw JSON value of [polarity].
     *
     * Unlike [polarity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarity") @ExcludeMissing fun _polarity(): JsonField<Double> = polarity

    /**
     * Returns the raw JSON value of [polarityType].
     *
     * Unlike [polarityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarityType")
    @ExcludeMissing
    fun _polarityType(): JsonField<PolarityType> = polarityType

    /**
     * Returns the raw JSON value of [powerOverNoise].
     *
     * Unlike [powerOverNoise], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("powerOverNoise")
    @ExcludeMissing
    fun _powerOverNoise(): JsonField<Double> = powerOverNoise

    /**
     * Returns the raw JSON value of [range].
     *
     * Unlike [range], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("range") @ExcludeMissing fun _range(): JsonField<Double> = range

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
     * Returns the raw JSON value of [rawFileUri].
     *
     * Unlike [rawFileUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rawFileURI") @ExcludeMissing fun _rawFileUri(): JsonField<String> = rawFileUri

    /**
     * Returns the raw JSON value of [referenceLevel].
     *
     * Unlike [referenceLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referenceLevel")
    @ExcludeMissing
    fun _referenceLevel(): JsonField<Double> = referenceLevel

    /**
     * Returns the raw JSON value of [relativeCarrierPower].
     *
     * Unlike [relativeCarrierPower], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("relativeCarrierPower")
    @ExcludeMissing
    fun _relativeCarrierPower(): JsonField<Double> = relativeCarrierPower

    /**
     * Returns the raw JSON value of [relativeNoiseFloor].
     *
     * Unlike [relativeNoiseFloor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("relativeNoiseFloor")
    @ExcludeMissing
    fun _relativeNoiseFloor(): JsonField<Double> = relativeNoiseFloor

    /**
     * Returns the raw JSON value of [resolutionBandwidth].
     *
     * Unlike [resolutionBandwidth], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("resolutionBandwidth")
    @ExcludeMissing
    fun _resolutionBandwidth(): JsonField<Double> = resolutionBandwidth

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
     * Returns the raw JSON value of [spectrumAnalyzerPower].
     *
     * Unlike [spectrumAnalyzerPower], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("spectrumAnalyzerPower")
    @ExcludeMissing
    fun _spectrumAnalyzerPower(): JsonField<Double> = spectrumAnalyzerPower

    /**
     * Returns the raw JSON value of [startFrequency].
     *
     * Unlike [startFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startFrequency")
    @ExcludeMissing
    fun _startFrequency(): JsonField<Double> = startFrequency

    /**
     * Returns the raw JSON value of [switchPoint].
     *
     * Unlike [switchPoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("switchPoint") @ExcludeMissing fun _switchPoint(): JsonField<Int> = switchPoint

    /**
     * Returns the raw JSON value of [symbolToNoiseRatio].
     *
     * Unlike [symbolToNoiseRatio], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("symbolToNoiseRatio")
    @ExcludeMissing
    fun _symbolToNoiseRatio(): JsonField<Double> = symbolToNoiseRatio

    /**
     * Returns the raw JSON value of [taskId].
     *
     * Unlike [taskId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taskId") @ExcludeMissing fun _taskId(): JsonField<String> = taskId

    /**
     * Returns the raw JSON value of [trackId].
     *
     * Unlike [trackId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackId") @ExcludeMissing fun _trackId(): JsonField<String> = trackId

    /**
     * Returns the raw JSON value of [trackRange].
     *
     * Unlike [trackRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackRange") @ExcludeMissing fun _trackRange(): JsonField<Double> = trackRange

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [transmitFilterRollOff].
     *
     * Unlike [transmitFilterRollOff], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transmitFilterRollOff")
    @ExcludeMissing
    fun _transmitFilterRollOff(): JsonField<Double> = transmitFilterRollOff

    /**
     * Returns the raw JSON value of [transmitFilterType].
     *
     * Unlike [transmitFilterType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transmitFilterType")
    @ExcludeMissing
    fun _transmitFilterType(): JsonField<String> = transmitFilterType

    /**
     * Returns the raw JSON value of [transponder].
     *
     * Unlike [transponder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transponder") @ExcludeMissing fun _transponder(): JsonField<String> = transponder

    /**
     * Returns the raw JSON value of [uct].
     *
     * Unlike [uct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uct") @ExcludeMissing fun _uct(): JsonField<Boolean> = uct

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [videoBandwidth].
     *
     * Unlike [videoBandwidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("videoBandwidth")
    @ExcludeMissing
    fun _videoBandwidth(): JsonField<Double> = videoBandwidth

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
         * Returns a mutable builder for constructing an instance of [RfObservationListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .obTime()
         * .source()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RfObservationListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var obTime: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var antennaName: JsonField<String> = JsonMissing.of()
        private var azimuth: JsonField<Double> = JsonMissing.of()
        private var azimuthMeasured: JsonField<Boolean> = JsonMissing.of()
        private var azimuthRate: JsonField<Double> = JsonMissing.of()
        private var azimuthUnc: JsonField<Double> = JsonMissing.of()
        private var bandwidth: JsonField<Double> = JsonMissing.of()
        private var baudRate: JsonField<Double> = JsonMissing.of()
        private var bitErrorRate: JsonField<Double> = JsonMissing.of()
        private var carrierStandard: JsonField<String> = JsonMissing.of()
        private var channel: JsonField<Int> = JsonMissing.of()
        private var collectionMode: JsonField<String> = JsonMissing.of()
        private var confidence: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var detectionStatus: JsonField<String> = JsonMissing.of()
        private var eirp: JsonField<Double> = JsonMissing.of()
        private var elevation: JsonField<Double> = JsonMissing.of()
        private var elevationMeasured: JsonField<Boolean> = JsonMissing.of()
        private var elevationRate: JsonField<Double> = JsonMissing.of()
        private var elevationUnc: JsonField<Double> = JsonMissing.of()
        private var elnot: JsonField<String> = JsonMissing.of()
        private var endFrequency: JsonField<Double> = JsonMissing.of()
        private var frequency: JsonField<Double> = JsonMissing.of()
        private var frequencyShift: JsonField<Double> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var incoming: JsonField<Boolean> = JsonMissing.of()
        private var innerCodingRate: JsonField<Int> = JsonMissing.of()
        private var maxPsd: JsonField<Double> = JsonMissing.of()
        private var minPsd: JsonField<Double> = JsonMissing.of()
        private var modulation: JsonField<String> = JsonMissing.of()
        private var noisePwrDensity: JsonField<Double> = JsonMissing.of()
        private var nominalBandwidth: JsonField<Double> = JsonMissing.of()
        private var nominalEirp: JsonField<Double> = JsonMissing.of()
        private var nominalFrequency: JsonField<Double> = JsonMissing.of()
        private var nominalPowerOverNoise: JsonField<Double> = JsonMissing.of()
        private var nominalSnr: JsonField<Double> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var outerCodingRate: JsonField<Int> = JsonMissing.of()
        private var peak: JsonField<Boolean> = JsonMissing.of()
        private var pgri: JsonField<Double> = JsonMissing.of()
        private var polarity: JsonField<Double> = JsonMissing.of()
        private var polarityType: JsonField<PolarityType> = JsonMissing.of()
        private var powerOverNoise: JsonField<Double> = JsonMissing.of()
        private var range: JsonField<Double> = JsonMissing.of()
        private var rangeMeasured: JsonField<Boolean> = JsonMissing.of()
        private var rangeRate: JsonField<Double> = JsonMissing.of()
        private var rangeRateMeasured: JsonField<Boolean> = JsonMissing.of()
        private var rangeRateUnc: JsonField<Double> = JsonMissing.of()
        private var rangeUnc: JsonField<Double> = JsonMissing.of()
        private var rawFileUri: JsonField<String> = JsonMissing.of()
        private var referenceLevel: JsonField<Double> = JsonMissing.of()
        private var relativeCarrierPower: JsonField<Double> = JsonMissing.of()
        private var relativeNoiseFloor: JsonField<Double> = JsonMissing.of()
        private var resolutionBandwidth: JsonField<Double> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var senalt: JsonField<Double> = JsonMissing.of()
        private var senlat: JsonField<Double> = JsonMissing.of()
        private var senlon: JsonField<Double> = JsonMissing.of()
        private var snr: JsonField<Double> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var spectrumAnalyzerPower: JsonField<Double> = JsonMissing.of()
        private var startFrequency: JsonField<Double> = JsonMissing.of()
        private var switchPoint: JsonField<Int> = JsonMissing.of()
        private var symbolToNoiseRatio: JsonField<Double> = JsonMissing.of()
        private var taskId: JsonField<String> = JsonMissing.of()
        private var trackId: JsonField<String> = JsonMissing.of()
        private var trackRange: JsonField<Double> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var transmitFilterRollOff: JsonField<Double> = JsonMissing.of()
        private var transmitFilterType: JsonField<String> = JsonMissing.of()
        private var transponder: JsonField<String> = JsonMissing.of()
        private var uct: JsonField<Boolean> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var videoBandwidth: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rfObservationListResponse: RfObservationListResponse) = apply {
            classificationMarking = rfObservationListResponse.classificationMarking
            dataMode = rfObservationListResponse.dataMode
            obTime = rfObservationListResponse.obTime
            source = rfObservationListResponse.source
            type = rfObservationListResponse.type
            id = rfObservationListResponse.id
            antennaName = rfObservationListResponse.antennaName
            azimuth = rfObservationListResponse.azimuth
            azimuthMeasured = rfObservationListResponse.azimuthMeasured
            azimuthRate = rfObservationListResponse.azimuthRate
            azimuthUnc = rfObservationListResponse.azimuthUnc
            bandwidth = rfObservationListResponse.bandwidth
            baudRate = rfObservationListResponse.baudRate
            bitErrorRate = rfObservationListResponse.bitErrorRate
            carrierStandard = rfObservationListResponse.carrierStandard
            channel = rfObservationListResponse.channel
            collectionMode = rfObservationListResponse.collectionMode
            confidence = rfObservationListResponse.confidence
            createdAt = rfObservationListResponse.createdAt
            createdBy = rfObservationListResponse.createdBy
            descriptor = rfObservationListResponse.descriptor
            detectionStatus = rfObservationListResponse.detectionStatus
            eirp = rfObservationListResponse.eirp
            elevation = rfObservationListResponse.elevation
            elevationMeasured = rfObservationListResponse.elevationMeasured
            elevationRate = rfObservationListResponse.elevationRate
            elevationUnc = rfObservationListResponse.elevationUnc
            elnot = rfObservationListResponse.elnot
            endFrequency = rfObservationListResponse.endFrequency
            frequency = rfObservationListResponse.frequency
            frequencyShift = rfObservationListResponse.frequencyShift
            idOnOrbit = rfObservationListResponse.idOnOrbit
            idSensor = rfObservationListResponse.idSensor
            incoming = rfObservationListResponse.incoming
            innerCodingRate = rfObservationListResponse.innerCodingRate
            maxPsd = rfObservationListResponse.maxPsd
            minPsd = rfObservationListResponse.minPsd
            modulation = rfObservationListResponse.modulation
            noisePwrDensity = rfObservationListResponse.noisePwrDensity
            nominalBandwidth = rfObservationListResponse.nominalBandwidth
            nominalEirp = rfObservationListResponse.nominalEirp
            nominalFrequency = rfObservationListResponse.nominalFrequency
            nominalPowerOverNoise = rfObservationListResponse.nominalPowerOverNoise
            nominalSnr = rfObservationListResponse.nominalSnr
            origin = rfObservationListResponse.origin
            origNetwork = rfObservationListResponse.origNetwork
            origObjectId = rfObservationListResponse.origObjectId
            origSensorId = rfObservationListResponse.origSensorId
            outerCodingRate = rfObservationListResponse.outerCodingRate
            peak = rfObservationListResponse.peak
            pgri = rfObservationListResponse.pgri
            polarity = rfObservationListResponse.polarity
            polarityType = rfObservationListResponse.polarityType
            powerOverNoise = rfObservationListResponse.powerOverNoise
            range = rfObservationListResponse.range
            rangeMeasured = rfObservationListResponse.rangeMeasured
            rangeRate = rfObservationListResponse.rangeRate
            rangeRateMeasured = rfObservationListResponse.rangeRateMeasured
            rangeRateUnc = rfObservationListResponse.rangeRateUnc
            rangeUnc = rfObservationListResponse.rangeUnc
            rawFileUri = rfObservationListResponse.rawFileUri
            referenceLevel = rfObservationListResponse.referenceLevel
            relativeCarrierPower = rfObservationListResponse.relativeCarrierPower
            relativeNoiseFloor = rfObservationListResponse.relativeNoiseFloor
            resolutionBandwidth = rfObservationListResponse.resolutionBandwidth
            satNo = rfObservationListResponse.satNo
            senalt = rfObservationListResponse.senalt
            senlat = rfObservationListResponse.senlat
            senlon = rfObservationListResponse.senlon
            snr = rfObservationListResponse.snr
            sourceDl = rfObservationListResponse.sourceDl
            spectrumAnalyzerPower = rfObservationListResponse.spectrumAnalyzerPower
            startFrequency = rfObservationListResponse.startFrequency
            switchPoint = rfObservationListResponse.switchPoint
            symbolToNoiseRatio = rfObservationListResponse.symbolToNoiseRatio
            taskId = rfObservationListResponse.taskId
            trackId = rfObservationListResponse.trackId
            trackRange = rfObservationListResponse.trackRange
            transactionId = rfObservationListResponse.transactionId
            transmitFilterRollOff = rfObservationListResponse.transmitFilterRollOff
            transmitFilterType = rfObservationListResponse.transmitFilterType
            transponder = rfObservationListResponse.transponder
            uct = rfObservationListResponse.uct
            url = rfObservationListResponse.url
            videoBandwidth = rfObservationListResponse.videoBandwidth
            additionalProperties = rfObservationListResponse.additionalProperties.toMutableMap()
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

        /** Ob detection time in ISO 8601 UTC with microsecond precision. */
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

        /** Type of RF ob (e.g. RF, RF-SOSI, PSD, RFI, SPOOF, etc). */
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

        /** Antenna name of the RFObservation record. */
        fun antennaName(antennaName: String) = antennaName(JsonField.of(antennaName))

        /**
         * Sets [Builder.antennaName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.antennaName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun antennaName(antennaName: JsonField<String>) = apply { this.antennaName = antennaName }

        /** azimuth angle in degrees and J2000 coordinate frame. */
        fun azimuth(azimuth: Double) = azimuth(JsonField.of(azimuth))

        /**
         * Sets [Builder.azimuth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azimuth] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun azimuth(azimuth: JsonField<Double>) = apply { this.azimuth = azimuth }

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

        /** Rate of change of the azimuth in degrees per second. */
        fun azimuthRate(azimuthRate: Double) = azimuthRate(JsonField.of(azimuthRate))

        /**
         * Sets [Builder.azimuthRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azimuthRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun azimuthRate(azimuthRate: JsonField<Double>) = apply { this.azimuthRate = azimuthRate }

        /** One sigma uncertainty in the azimuth angle measurement, in degrees. */
        fun azimuthUnc(azimuthUnc: Double) = azimuthUnc(JsonField.of(azimuthUnc))

        /**
         * Sets [Builder.azimuthUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azimuthUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun azimuthUnc(azimuthUnc: JsonField<Double>) = apply { this.azimuthUnc = azimuthUnc }

        /** Measured bandwidth in Hz. */
        fun bandwidth(bandwidth: Double) = bandwidth(JsonField.of(bandwidth))

        /**
         * Sets [Builder.bandwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bandwidth] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bandwidth(bandwidth: JsonField<Double>) = apply { this.bandwidth = bandwidth }

        /**
         * Baud rate is the number of symbol changes, waveform changes, or signaling events, across
         * the transmission medium per second.
         */
        fun baudRate(baudRate: Double) = baudRate(JsonField.of(baudRate))

        /**
         * Sets [Builder.baudRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baudRate] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun baudRate(baudRate: JsonField<Double>) = apply { this.baudRate = baudRate }

        /** The ratio of bit errors per number of received bits. */
        fun bitErrorRate(bitErrorRate: Double) = bitErrorRate(JsonField.of(bitErrorRate))

        /**
         * Sets [Builder.bitErrorRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bitErrorRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bitErrorRate(bitErrorRate: JsonField<Double>) = apply {
            this.bitErrorRate = bitErrorRate
        }

        /** Carrier standard (e.g. DVB-S2, 802.11g, etc.). */
        fun carrierStandard(carrierStandard: String) =
            carrierStandard(JsonField.of(carrierStandard))

        /**
         * Sets [Builder.carrierStandard] to an arbitrary JSON value.
         *
         * You should usually call [Builder.carrierStandard] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun carrierStandard(carrierStandard: JsonField<String>) = apply {
            this.carrierStandard = carrierStandard
        }

        /** Channel of the RFObservation record. */
        fun channel(channel: Int) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<Int>) = apply { this.channel = channel }

        /**
         * Collection mode (e.g. SURVEY, SPOT_SEARCH, NEIGHBORHOOD_WATCH, DIRECTED_SEARCH, MANUAL,
         * etc).
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

        /** Confidence in the signal and its measurements and characterization. */
        fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

        /**
         * Sets [Builder.confidence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidence] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

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

        /**
         * Detection status (e.g. DETECTED, CARRIER_ACQUIRING, CARRIER_DETECTED, NOT_DETECTED, etc).
         */
        fun detectionStatus(detectionStatus: String) =
            detectionStatus(JsonField.of(detectionStatus))

        /**
         * Sets [Builder.detectionStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detectionStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun detectionStatus(detectionStatus: JsonField<String>) = apply {
            this.detectionStatus = detectionStatus
        }

        /** Measured Equivalent Isotopically Radiated Power in dBW. */
        fun eirp(eirp: Double) = eirp(JsonField.of(eirp))

        /**
         * Sets [Builder.eirp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eirp] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eirp(eirp: JsonField<Double>) = apply { this.eirp = eirp }

        /** elevation in degrees and J2000 coordinate frame. */
        fun elevation(elevation: Double) = elevation(JsonField.of(elevation))

        /**
         * Sets [Builder.elevation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevation] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun elevation(elevation: JsonField<Double>) = apply { this.elevation = elevation }

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

        /** Rate of change of the elevation in degrees per second. */
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

        /** One sigma uncertainty in the elevation angle measurement, in degrees. */
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

        /** ELINT notation. */
        fun elnot(elnot: String) = elnot(JsonField.of(elnot))

        /**
         * Sets [Builder.elnot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elnot] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun elnot(elnot: JsonField<String>) = apply { this.elnot = elnot }

        /** End carrier frequency in Hz. */
        fun endFrequency(endFrequency: Double) = endFrequency(JsonField.of(endFrequency))

        /**
         * Sets [Builder.endFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endFrequency] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endFrequency(endFrequency: JsonField<Double>) = apply {
            this.endFrequency = endFrequency
        }

        /** Center carrier frequency in Hz. */
        fun frequency(frequency: Double) = frequency(JsonField.of(frequency))

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun frequency(frequency: JsonField<Double>) = apply { this.frequency = frequency }

        /** Frequency Shift of the RFObservation record. */
        fun frequencyShift(frequencyShift: Double) = frequencyShift(JsonField.of(frequencyShift))

        /**
         * Sets [Builder.frequencyShift] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencyShift] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequencyShift(frequencyShift: JsonField<Double>) = apply {
            this.frequencyShift = frequencyShift
        }

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

        /** True if the signal is incoming, false if outgoing. */
        fun incoming(incoming: Boolean) = incoming(JsonField.of(incoming))

        /**
         * Sets [Builder.incoming] to an arbitrary JSON value.
         *
         * You should usually call [Builder.incoming] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun incoming(incoming: JsonField<Boolean>) = apply { this.incoming = incoming }

        /**
         * Inner forward error correction rate: 0 = Auto, 1 = 1/2, 2 = 2/3, 3 = 3/4, 4 = 5/6, 5 =
         * 7/8, 6 = 8/9, 7 = 3/5, 8 = 4/5, 9 = 9/10, 15 = None.
         */
        fun innerCodingRate(innerCodingRate: Int) = innerCodingRate(JsonField.of(innerCodingRate))

        /**
         * Sets [Builder.innerCodingRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.innerCodingRate] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun innerCodingRate(innerCodingRate: JsonField<Int>) = apply {
            this.innerCodingRate = innerCodingRate
        }

        /** Maximum measured PSD value of the trace in dBW. */
        fun maxPsd(maxPsd: Double) = maxPsd(JsonField.of(maxPsd))

        /**
         * Sets [Builder.maxPsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxPsd] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxPsd(maxPsd: JsonField<Double>) = apply { this.maxPsd = maxPsd }

        /** Minimum measured PSD value of the trace in dBW. */
        fun minPsd(minPsd: Double) = minPsd(JsonField.of(minPsd))

        /**
         * Sets [Builder.minPsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minPsd] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minPsd(minPsd: JsonField<Double>) = apply { this.minPsd = minPsd }

        /** Transponder modulation (e.g. Auto, QPSK, 8PSK, etc). */
        fun modulation(modulation: String) = modulation(JsonField.of(modulation))

        /**
         * Sets [Builder.modulation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modulation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modulation(modulation: JsonField<String>) = apply { this.modulation = modulation }

        /** Noise power density, in dBW-Hz. */
        fun noisePwrDensity(noisePwrDensity: Double) =
            noisePwrDensity(JsonField.of(noisePwrDensity))

        /**
         * Sets [Builder.noisePwrDensity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noisePwrDensity] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun noisePwrDensity(noisePwrDensity: JsonField<Double>) = apply {
            this.noisePwrDensity = noisePwrDensity
        }

        /** Expected bandwidth in Hz. */
        fun nominalBandwidth(nominalBandwidth: Double) =
            nominalBandwidth(JsonField.of(nominalBandwidth))

        /**
         * Sets [Builder.nominalBandwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nominalBandwidth] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nominalBandwidth(nominalBandwidth: JsonField<Double>) = apply {
            this.nominalBandwidth = nominalBandwidth
        }

        /** Expected Equivalent Isotopically Radiated Power in dBW. */
        fun nominalEirp(nominalEirp: Double) = nominalEirp(JsonField.of(nominalEirp))

        /**
         * Sets [Builder.nominalEirp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nominalEirp] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nominalEirp(nominalEirp: JsonField<Double>) = apply { this.nominalEirp = nominalEirp }

        /** Nominal or expected center carrier frequency in Hz. */
        fun nominalFrequency(nominalFrequency: Double) =
            nominalFrequency(JsonField.of(nominalFrequency))

        /**
         * Sets [Builder.nominalFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nominalFrequency] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nominalFrequency(nominalFrequency: JsonField<Double>) = apply {
            this.nominalFrequency = nominalFrequency
        }

        /** Expected carrier power over noise (dBW/Hz). */
        fun nominalPowerOverNoise(nominalPowerOverNoise: Double) =
            nominalPowerOverNoise(JsonField.of(nominalPowerOverNoise))

        /**
         * Sets [Builder.nominalPowerOverNoise] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nominalPowerOverNoise] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nominalPowerOverNoise(nominalPowerOverNoise: JsonField<Double>) = apply {
            this.nominalPowerOverNoise = nominalPowerOverNoise
        }

        /** Nominal or expected signal to noise ratio, in dB. */
        fun nominalSnr(nominalSnr: Double) = nominalSnr(JsonField.of(nominalSnr))

        /**
         * Sets [Builder.nominalSnr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nominalSnr] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nominalSnr(nominalSnr: JsonField<Double>) = apply { this.nominalSnr = nominalSnr }

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
         * Outer forward error correction rate: 0 = Auto, 1 = 1/2, 2 = 2/3, 3 = 3/4, 4 = 5/6, 5 =
         * 7/8, 6 = 8/9, 7 = 3/5, 8 = 4/5, 9 = 9/10, 15 = None.
         */
        fun outerCodingRate(outerCodingRate: Int) = outerCodingRate(JsonField.of(outerCodingRate))

        /**
         * Sets [Builder.outerCodingRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outerCodingRate] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outerCodingRate(outerCodingRate: JsonField<Int>) = apply {
            this.outerCodingRate = outerCodingRate
        }

        /** Peak of the RFObservation record. */
        fun peak(peak: Boolean) = peak(JsonField.of(peak))

        /**
         * Sets [Builder.peak] to an arbitrary JSON value.
         *
         * You should usually call [Builder.peak] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun peak(peak: JsonField<Boolean>) = apply { this.peak = peak }

        /**
         * A pulse group repetition interval (PGRI) is a pulse train in which there are groups of
         * closely spaced pulses separated by much longer times between these pulse groups.
         */
        fun pgri(pgri: Double) = pgri(JsonField.of(pgri))

        /**
         * Sets [Builder.pgri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pgri] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pgri(pgri: JsonField<Double>) = apply { this.pgri = pgri }

        /** The antenna pointing dependent polarizer angle, in degrees. */
        fun polarity(polarity: Double) = polarity(JsonField.of(polarity))

        /**
         * Sets [Builder.polarity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarity] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun polarity(polarity: JsonField<Double>) = apply { this.polarity = polarity }

        /**
         * Transponder polarization e.g. H - (Horizontally Polarized) Perpendicular to Earth's
         * surface, V - (Vertically Polarized) Parallel to Earth's surface, L - (Left Hand
         * Circularly Polarized) Rotating left relative to the earth's surface, R - (Right Hand
         * Circularly Polarized) Rotating right relative to the earth's surface.
         */
        fun polarityType(polarityType: PolarityType) = polarityType(JsonField.of(polarityType))

        /**
         * Sets [Builder.polarityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarityType] with a well-typed [PolarityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun polarityType(polarityType: JsonField<PolarityType>) = apply {
            this.polarityType = polarityType
        }

        /** Measured carrier power over noise (dBW/Hz). */
        fun powerOverNoise(powerOverNoise: Double) = powerOverNoise(JsonField.of(powerOverNoise))

        /**
         * Sets [Builder.powerOverNoise] to an arbitrary JSON value.
         *
         * You should usually call [Builder.powerOverNoise] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun powerOverNoise(powerOverNoise: JsonField<Double>) = apply {
            this.powerOverNoise = powerOverNoise
        }

        /** Target range in km. */
        fun range(range: Double) = range(JsonField.of(range))

        /**
         * Sets [Builder.range] to an arbitrary JSON value.
         *
         * You should usually call [Builder.range] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun range(range: JsonField<Double>) = apply { this.range = range }

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

        /** Rate of change of the range in km/sec. */
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

        /** One sigma uncertainty in the range rate measurement, in kilometers/second. */
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

        /** One sigma uncertainty in the range measurement, in kilometers. */
        fun rangeUnc(rangeUnc: Double) = rangeUnc(JsonField.of(rangeUnc))

        /**
         * Sets [Builder.rangeUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rangeUnc(rangeUnc: JsonField<Double>) = apply { this.rangeUnc = rangeUnc }

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

        /** Reference signal level, in dBW. */
        fun referenceLevel(referenceLevel: Double) = referenceLevel(JsonField.of(referenceLevel))

        /**
         * Sets [Builder.referenceLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceLevel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceLevel(referenceLevel: JsonField<Double>) = apply {
            this.referenceLevel = referenceLevel
        }

        /** Measured power of the center carrier frequency in dBW. */
        fun relativeCarrierPower(relativeCarrierPower: Double) =
            relativeCarrierPower(JsonField.of(relativeCarrierPower))

        /**
         * Sets [Builder.relativeCarrierPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relativeCarrierPower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun relativeCarrierPower(relativeCarrierPower: JsonField<Double>) = apply {
            this.relativeCarrierPower = relativeCarrierPower
        }

        /**
         * The measure of the signal created from the sum of all the noise sources and unwanted
         * signals within the measurement system, in dBW.
         */
        fun relativeNoiseFloor(relativeNoiseFloor: Double) =
            relativeNoiseFloor(JsonField.of(relativeNoiseFloor))

        /**
         * Sets [Builder.relativeNoiseFloor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relativeNoiseFloor] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun relativeNoiseFloor(relativeNoiseFloor: JsonField<Double>) = apply {
            this.relativeNoiseFloor = relativeNoiseFloor
        }

        /** Resolution bandwidth in Hz. */
        fun resolutionBandwidth(resolutionBandwidth: Double) =
            resolutionBandwidth(JsonField.of(resolutionBandwidth))

        /**
         * Sets [Builder.resolutionBandwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolutionBandwidth] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resolutionBandwidth(resolutionBandwidth: JsonField<Double>) = apply {
            this.resolutionBandwidth = resolutionBandwidth
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

        /**
         * Sensor altitude at obTime (if mobile/onorbit) in km. If null, can be obtained from sensor
         * info.
         */
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

        /** Measured spectrum analyzer power of the center carrier frequency in dBW. */
        fun spectrumAnalyzerPower(spectrumAnalyzerPower: Double) =
            spectrumAnalyzerPower(JsonField.of(spectrumAnalyzerPower))

        /**
         * Sets [Builder.spectrumAnalyzerPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spectrumAnalyzerPower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun spectrumAnalyzerPower(spectrumAnalyzerPower: JsonField<Double>) = apply {
            this.spectrumAnalyzerPower = spectrumAnalyzerPower
        }

        /** Start carrier frequency in Hz. */
        fun startFrequency(startFrequency: Double) = startFrequency(JsonField.of(startFrequency))

        /**
         * Sets [Builder.startFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startFrequency] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startFrequency(startFrequency: JsonField<Double>) = apply {
            this.startFrequency = startFrequency
        }

        /** Switch Point of the RFObservation record. */
        fun switchPoint(switchPoint: Int) = switchPoint(JsonField.of(switchPoint))

        /**
         * Sets [Builder.switchPoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.switchPoint] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun switchPoint(switchPoint: JsonField<Int>) = apply { this.switchPoint = switchPoint }

        /** Symbol to noise ratio, in dB. */
        fun symbolToNoiseRatio(symbolToNoiseRatio: Double) =
            symbolToNoiseRatio(JsonField.of(symbolToNoiseRatio))

        /**
         * Sets [Builder.symbolToNoiseRatio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbolToNoiseRatio] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun symbolToNoiseRatio(symbolToNoiseRatio: JsonField<Double>) = apply {
            this.symbolToNoiseRatio = symbolToNoiseRatio
        }

        /** Optional identifier to indicate the specific tasking which produced this observation. */
        fun taskId(taskId: String) = taskId(JsonField.of(taskId))

        /**
         * Sets [Builder.taskId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taskId(taskId: JsonField<String>) = apply { this.taskId = taskId }

        /** Optional identifier of the track to which this observation belongs. */
        fun trackId(trackId: String) = trackId(JsonField.of(trackId))

        /**
         * Sets [Builder.trackId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trackId(trackId: JsonField<String>) = apply { this.trackId = trackId }

        /** Target track or apparent range in km. */
        fun trackRange(trackRange: Double) = trackRange(JsonField.of(trackRange))

        /**
         * Sets [Builder.trackRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackRange] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trackRange(trackRange: JsonField<Double>) = apply { this.trackRange = trackRange }

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

        /** Transmit pulse shaping filter roll-off value. */
        fun transmitFilterRollOff(transmitFilterRollOff: Double) =
            transmitFilterRollOff(JsonField.of(transmitFilterRollOff))

        /**
         * Sets [Builder.transmitFilterRollOff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transmitFilterRollOff] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transmitFilterRollOff(transmitFilterRollOff: JsonField<Double>) = apply {
            this.transmitFilterRollOff = transmitFilterRollOff
        }

        /** Transmit pulse shaping filter typ (e.g. RRC). */
        fun transmitFilterType(transmitFilterType: String) =
            transmitFilterType(JsonField.of(transmitFilterType))

        /**
         * Sets [Builder.transmitFilterType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transmitFilterType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transmitFilterType(transmitFilterType: JsonField<String>) = apply {
            this.transmitFilterType = transmitFilterType
        }

        /**
         * Optional identifier provided by observation source to indicate the transponder used for
         * this measurement.
         */
        fun transponder(transponder: String) = transponder(JsonField.of(transponder))

        /**
         * Sets [Builder.transponder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transponder] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transponder(transponder: JsonField<String>) = apply { this.transponder = transponder }

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

        /** Optional URL containing additional information on this observation. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Video bandwidth in Hz. */
        fun videoBandwidth(videoBandwidth: Double) = videoBandwidth(JsonField.of(videoBandwidth))

        /**
         * Sets [Builder.videoBandwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.videoBandwidth] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun videoBandwidth(videoBandwidth: JsonField<Double>) = apply {
            this.videoBandwidth = videoBandwidth
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
         * Returns an immutable instance of [RfObservationListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .obTime()
         * .source()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RfObservationListResponse =
            RfObservationListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("obTime", obTime),
                checkRequired("source", source),
                checkRequired("type", type),
                id,
                antennaName,
                azimuth,
                azimuthMeasured,
                azimuthRate,
                azimuthUnc,
                bandwidth,
                baudRate,
                bitErrorRate,
                carrierStandard,
                channel,
                collectionMode,
                confidence,
                createdAt,
                createdBy,
                descriptor,
                detectionStatus,
                eirp,
                elevation,
                elevationMeasured,
                elevationRate,
                elevationUnc,
                elnot,
                endFrequency,
                frequency,
                frequencyShift,
                idOnOrbit,
                idSensor,
                incoming,
                innerCodingRate,
                maxPsd,
                minPsd,
                modulation,
                noisePwrDensity,
                nominalBandwidth,
                nominalEirp,
                nominalFrequency,
                nominalPowerOverNoise,
                nominalSnr,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                outerCodingRate,
                peak,
                pgri,
                polarity,
                polarityType,
                powerOverNoise,
                range,
                rangeMeasured,
                rangeRate,
                rangeRateMeasured,
                rangeRateUnc,
                rangeUnc,
                rawFileUri,
                referenceLevel,
                relativeCarrierPower,
                relativeNoiseFloor,
                resolutionBandwidth,
                satNo,
                senalt,
                senlat,
                senlon,
                snr,
                sourceDl,
                spectrumAnalyzerPower,
                startFrequency,
                switchPoint,
                symbolToNoiseRatio,
                taskId,
                trackId,
                trackRange,
                transactionId,
                transmitFilterRollOff,
                transmitFilterType,
                transponder,
                uct,
                url,
                videoBandwidth,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RfObservationListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        obTime()
        source()
        type()
        id()
        antennaName()
        azimuth()
        azimuthMeasured()
        azimuthRate()
        azimuthUnc()
        bandwidth()
        baudRate()
        bitErrorRate()
        carrierStandard()
        channel()
        collectionMode()
        confidence()
        createdAt()
        createdBy()
        descriptor()
        detectionStatus()
        eirp()
        elevation()
        elevationMeasured()
        elevationRate()
        elevationUnc()
        elnot()
        endFrequency()
        frequency()
        frequencyShift()
        idOnOrbit()
        idSensor()
        incoming()
        innerCodingRate()
        maxPsd()
        minPsd()
        modulation()
        noisePwrDensity()
        nominalBandwidth()
        nominalEirp()
        nominalFrequency()
        nominalPowerOverNoise()
        nominalSnr()
        origin()
        origNetwork()
        origObjectId()
        origSensorId()
        outerCodingRate()
        peak()
        pgri()
        polarity()
        polarityType().ifPresent { it.validate() }
        powerOverNoise()
        range()
        rangeMeasured()
        rangeRate()
        rangeRateMeasured()
        rangeRateUnc()
        rangeUnc()
        rawFileUri()
        referenceLevel()
        relativeCarrierPower()
        relativeNoiseFloor()
        resolutionBandwidth()
        satNo()
        senalt()
        senlat()
        senlon()
        snr()
        sourceDl()
        spectrumAnalyzerPower()
        startFrequency()
        switchPoint()
        symbolToNoiseRatio()
        taskId()
        trackId()
        trackRange()
        transactionId()
        transmitFilterRollOff()
        transmitFilterType()
        transponder()
        uct()
        url()
        videoBandwidth()
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
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (antennaName.asKnown().isPresent) 1 else 0) +
            (if (azimuth.asKnown().isPresent) 1 else 0) +
            (if (azimuthMeasured.asKnown().isPresent) 1 else 0) +
            (if (azimuthRate.asKnown().isPresent) 1 else 0) +
            (if (azimuthUnc.asKnown().isPresent) 1 else 0) +
            (if (bandwidth.asKnown().isPresent) 1 else 0) +
            (if (baudRate.asKnown().isPresent) 1 else 0) +
            (if (bitErrorRate.asKnown().isPresent) 1 else 0) +
            (if (carrierStandard.asKnown().isPresent) 1 else 0) +
            (if (channel.asKnown().isPresent) 1 else 0) +
            (if (collectionMode.asKnown().isPresent) 1 else 0) +
            (if (confidence.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (descriptor.asKnown().isPresent) 1 else 0) +
            (if (detectionStatus.asKnown().isPresent) 1 else 0) +
            (if (eirp.asKnown().isPresent) 1 else 0) +
            (if (elevation.asKnown().isPresent) 1 else 0) +
            (if (elevationMeasured.asKnown().isPresent) 1 else 0) +
            (if (elevationRate.asKnown().isPresent) 1 else 0) +
            (if (elevationUnc.asKnown().isPresent) 1 else 0) +
            (if (elnot.asKnown().isPresent) 1 else 0) +
            (if (endFrequency.asKnown().isPresent) 1 else 0) +
            (if (frequency.asKnown().isPresent) 1 else 0) +
            (if (frequencyShift.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (incoming.asKnown().isPresent) 1 else 0) +
            (if (innerCodingRate.asKnown().isPresent) 1 else 0) +
            (if (maxPsd.asKnown().isPresent) 1 else 0) +
            (if (minPsd.asKnown().isPresent) 1 else 0) +
            (if (modulation.asKnown().isPresent) 1 else 0) +
            (if (noisePwrDensity.asKnown().isPresent) 1 else 0) +
            (if (nominalBandwidth.asKnown().isPresent) 1 else 0) +
            (if (nominalEirp.asKnown().isPresent) 1 else 0) +
            (if (nominalFrequency.asKnown().isPresent) 1 else 0) +
            (if (nominalPowerOverNoise.asKnown().isPresent) 1 else 0) +
            (if (nominalSnr.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (if (outerCodingRate.asKnown().isPresent) 1 else 0) +
            (if (peak.asKnown().isPresent) 1 else 0) +
            (if (pgri.asKnown().isPresent) 1 else 0) +
            (if (polarity.asKnown().isPresent) 1 else 0) +
            (polarityType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (powerOverNoise.asKnown().isPresent) 1 else 0) +
            (if (range.asKnown().isPresent) 1 else 0) +
            (if (rangeMeasured.asKnown().isPresent) 1 else 0) +
            (if (rangeRate.asKnown().isPresent) 1 else 0) +
            (if (rangeRateMeasured.asKnown().isPresent) 1 else 0) +
            (if (rangeRateUnc.asKnown().isPresent) 1 else 0) +
            (if (rangeUnc.asKnown().isPresent) 1 else 0) +
            (if (rawFileUri.asKnown().isPresent) 1 else 0) +
            (if (referenceLevel.asKnown().isPresent) 1 else 0) +
            (if (relativeCarrierPower.asKnown().isPresent) 1 else 0) +
            (if (relativeNoiseFloor.asKnown().isPresent) 1 else 0) +
            (if (resolutionBandwidth.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (senalt.asKnown().isPresent) 1 else 0) +
            (if (senlat.asKnown().isPresent) 1 else 0) +
            (if (senlon.asKnown().isPresent) 1 else 0) +
            (if (snr.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (spectrumAnalyzerPower.asKnown().isPresent) 1 else 0) +
            (if (startFrequency.asKnown().isPresent) 1 else 0) +
            (if (switchPoint.asKnown().isPresent) 1 else 0) +
            (if (symbolToNoiseRatio.asKnown().isPresent) 1 else 0) +
            (if (taskId.asKnown().isPresent) 1 else 0) +
            (if (trackId.asKnown().isPresent) 1 else 0) +
            (if (trackRange.asKnown().isPresent) 1 else 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (transmitFilterRollOff.asKnown().isPresent) 1 else 0) +
            (if (transmitFilterType.asKnown().isPresent) 1 else 0) +
            (if (transponder.asKnown().isPresent) 1 else 0) +
            (if (uct.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (videoBandwidth.asKnown().isPresent) 1 else 0)

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
     * Transponder polarization e.g. H - (Horizontally Polarized) Perpendicular to Earth's surface,
     * V - (Vertically Polarized) Parallel to Earth's surface, L - (Left Hand Circularly Polarized)
     * Rotating left relative to the earth's surface, R - (Right Hand Circularly Polarized) Rotating
     * right relative to the earth's surface.
     */
    class PolarityType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val H = of("H")

            @JvmField val V = of("V")

            @JvmField val R = of("R")

            @JvmField val L = of("L")

            @JvmStatic fun of(value: String) = PolarityType(JsonField.of(value))
        }

        /** An enum containing [PolarityType]'s known values. */
        enum class Known {
            H,
            V,
            R,
            L,
        }

        /**
         * An enum containing [PolarityType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PolarityType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            H,
            V,
            R,
            L,
            /**
             * An enum member indicating that [PolarityType] was instantiated with an unknown value.
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
                H -> Value.H
                V -> Value.V
                R -> Value.R
                L -> Value.L
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
                H -> Known.H
                V -> Known.V
                R -> Known.R
                L -> Known.L
                else -> throw UnifieddatalibraryInvalidDataException("Unknown PolarityType: $value")
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

        fun validate(): PolarityType = apply {
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

            return other is PolarityType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RfObservationListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            obTime == other.obTime &&
            source == other.source &&
            type == other.type &&
            id == other.id &&
            antennaName == other.antennaName &&
            azimuth == other.azimuth &&
            azimuthMeasured == other.azimuthMeasured &&
            azimuthRate == other.azimuthRate &&
            azimuthUnc == other.azimuthUnc &&
            bandwidth == other.bandwidth &&
            baudRate == other.baudRate &&
            bitErrorRate == other.bitErrorRate &&
            carrierStandard == other.carrierStandard &&
            channel == other.channel &&
            collectionMode == other.collectionMode &&
            confidence == other.confidence &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            descriptor == other.descriptor &&
            detectionStatus == other.detectionStatus &&
            eirp == other.eirp &&
            elevation == other.elevation &&
            elevationMeasured == other.elevationMeasured &&
            elevationRate == other.elevationRate &&
            elevationUnc == other.elevationUnc &&
            elnot == other.elnot &&
            endFrequency == other.endFrequency &&
            frequency == other.frequency &&
            frequencyShift == other.frequencyShift &&
            idOnOrbit == other.idOnOrbit &&
            idSensor == other.idSensor &&
            incoming == other.incoming &&
            innerCodingRate == other.innerCodingRate &&
            maxPsd == other.maxPsd &&
            minPsd == other.minPsd &&
            modulation == other.modulation &&
            noisePwrDensity == other.noisePwrDensity &&
            nominalBandwidth == other.nominalBandwidth &&
            nominalEirp == other.nominalEirp &&
            nominalFrequency == other.nominalFrequency &&
            nominalPowerOverNoise == other.nominalPowerOverNoise &&
            nominalSnr == other.nominalSnr &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            origSensorId == other.origSensorId &&
            outerCodingRate == other.outerCodingRate &&
            peak == other.peak &&
            pgri == other.pgri &&
            polarity == other.polarity &&
            polarityType == other.polarityType &&
            powerOverNoise == other.powerOverNoise &&
            range == other.range &&
            rangeMeasured == other.rangeMeasured &&
            rangeRate == other.rangeRate &&
            rangeRateMeasured == other.rangeRateMeasured &&
            rangeRateUnc == other.rangeRateUnc &&
            rangeUnc == other.rangeUnc &&
            rawFileUri == other.rawFileUri &&
            referenceLevel == other.referenceLevel &&
            relativeCarrierPower == other.relativeCarrierPower &&
            relativeNoiseFloor == other.relativeNoiseFloor &&
            resolutionBandwidth == other.resolutionBandwidth &&
            satNo == other.satNo &&
            senalt == other.senalt &&
            senlat == other.senlat &&
            senlon == other.senlon &&
            snr == other.snr &&
            sourceDl == other.sourceDl &&
            spectrumAnalyzerPower == other.spectrumAnalyzerPower &&
            startFrequency == other.startFrequency &&
            switchPoint == other.switchPoint &&
            symbolToNoiseRatio == other.symbolToNoiseRatio &&
            taskId == other.taskId &&
            trackId == other.trackId &&
            trackRange == other.trackRange &&
            transactionId == other.transactionId &&
            transmitFilterRollOff == other.transmitFilterRollOff &&
            transmitFilterType == other.transmitFilterType &&
            transponder == other.transponder &&
            uct == other.uct &&
            url == other.url &&
            videoBandwidth == other.videoBandwidth &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            obTime,
            source,
            type,
            id,
            antennaName,
            azimuth,
            azimuthMeasured,
            azimuthRate,
            azimuthUnc,
            bandwidth,
            baudRate,
            bitErrorRate,
            carrierStandard,
            channel,
            collectionMode,
            confidence,
            createdAt,
            createdBy,
            descriptor,
            detectionStatus,
            eirp,
            elevation,
            elevationMeasured,
            elevationRate,
            elevationUnc,
            elnot,
            endFrequency,
            frequency,
            frequencyShift,
            idOnOrbit,
            idSensor,
            incoming,
            innerCodingRate,
            maxPsd,
            minPsd,
            modulation,
            noisePwrDensity,
            nominalBandwidth,
            nominalEirp,
            nominalFrequency,
            nominalPowerOverNoise,
            nominalSnr,
            origin,
            origNetwork,
            origObjectId,
            origSensorId,
            outerCodingRate,
            peak,
            pgri,
            polarity,
            polarityType,
            powerOverNoise,
            range,
            rangeMeasured,
            rangeRate,
            rangeRateMeasured,
            rangeRateUnc,
            rangeUnc,
            rawFileUri,
            referenceLevel,
            relativeCarrierPower,
            relativeNoiseFloor,
            resolutionBandwidth,
            satNo,
            senalt,
            senlat,
            senlon,
            snr,
            sourceDl,
            spectrumAnalyzerPower,
            startFrequency,
            switchPoint,
            symbolToNoiseRatio,
            taskId,
            trackId,
            trackRange,
            transactionId,
            transmitFilterRollOff,
            transmitFilterType,
            transponder,
            uct,
            url,
            videoBandwidth,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RfObservationListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, obTime=$obTime, source=$source, type=$type, id=$id, antennaName=$antennaName, azimuth=$azimuth, azimuthMeasured=$azimuthMeasured, azimuthRate=$azimuthRate, azimuthUnc=$azimuthUnc, bandwidth=$bandwidth, baudRate=$baudRate, bitErrorRate=$bitErrorRate, carrierStandard=$carrierStandard, channel=$channel, collectionMode=$collectionMode, confidence=$confidence, createdAt=$createdAt, createdBy=$createdBy, descriptor=$descriptor, detectionStatus=$detectionStatus, eirp=$eirp, elevation=$elevation, elevationMeasured=$elevationMeasured, elevationRate=$elevationRate, elevationUnc=$elevationUnc, elnot=$elnot, endFrequency=$endFrequency, frequency=$frequency, frequencyShift=$frequencyShift, idOnOrbit=$idOnOrbit, idSensor=$idSensor, incoming=$incoming, innerCodingRate=$innerCodingRate, maxPsd=$maxPsd, minPsd=$minPsd, modulation=$modulation, noisePwrDensity=$noisePwrDensity, nominalBandwidth=$nominalBandwidth, nominalEirp=$nominalEirp, nominalFrequency=$nominalFrequency, nominalPowerOverNoise=$nominalPowerOverNoise, nominalSnr=$nominalSnr, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, outerCodingRate=$outerCodingRate, peak=$peak, pgri=$pgri, polarity=$polarity, polarityType=$polarityType, powerOverNoise=$powerOverNoise, range=$range, rangeMeasured=$rangeMeasured, rangeRate=$rangeRate, rangeRateMeasured=$rangeRateMeasured, rangeRateUnc=$rangeRateUnc, rangeUnc=$rangeUnc, rawFileUri=$rawFileUri, referenceLevel=$referenceLevel, relativeCarrierPower=$relativeCarrierPower, relativeNoiseFloor=$relativeNoiseFloor, resolutionBandwidth=$resolutionBandwidth, satNo=$satNo, senalt=$senalt, senlat=$senlat, senlon=$senlon, snr=$snr, sourceDl=$sourceDl, spectrumAnalyzerPower=$spectrumAnalyzerPower, startFrequency=$startFrequency, switchPoint=$switchPoint, symbolToNoiseRatio=$symbolToNoiseRatio, taskId=$taskId, trackId=$trackId, trackRange=$trackRange, transactionId=$transactionId, transmitFilterRollOff=$transmitFilterRollOff, transmitFilterType=$transmitFilterType, transponder=$transponder, uct=$uct, url=$url, videoBandwidth=$videoBandwidth, additionalProperties=$additionalProperties}"
}

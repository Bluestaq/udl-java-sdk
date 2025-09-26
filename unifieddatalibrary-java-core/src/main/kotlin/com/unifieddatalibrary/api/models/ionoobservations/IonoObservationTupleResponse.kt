// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ionoobservations

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
 * These services provide operations for posting and querying ionospheric observation data.
 * Characteristics are defined by the CHARS: URSI IIWG format for archiving monthly ionospheric
 * characteristics, INAG Bulletin No. 62 specification. Qualifying and Descriptive letters are
 * defined by the URSI Handbook for Ionogram Interpretation and reduction, Report UAG, No. 23A
 * specification.
 */
class IonoObservationTupleResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val startTimeUtc: JsonField<OffsetDateTime>,
    private val stationId: JsonField<String>,
    private val system: JsonField<String>,
    private val systemInfo: JsonField<String>,
    private val id: JsonField<String>,
    private val amplitude: JsonField<Amplitude>,
    private val antennaElementPosition: JsonField<AntennaElementPosition>,
    private val antennaElementPositionCoordinateSystem:
        JsonField<AntennaElementPositionCoordinateSystem>,
    private val artistFlags: JsonField<List<Int>>,
    private val azimuth: JsonField<Azimuth>,
    private val b0: JsonField<Double>,
    private val b1: JsonField<Double>,
    private val charAtts: JsonField<List<CharAtt>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val d: JsonField<Double>,
    private val d1: JsonField<Double>,
    private val datum: JsonField<Datum>,
    private val deltafoF2: JsonField<Double>,
    private val densityProfile: JsonField<DensityProfile>,
    private val doppler: JsonField<Doppler>,
    private val downE: JsonField<Double>,
    private val downEs: JsonField<Double>,
    private val downF: JsonField<Double>,
    private val electronDensity: JsonField<List<Double>>,
    private val electronDensityUncertainty: JsonField<List<Double>>,
    private val elevation: JsonField<Elevation>,
    private val fbEs: JsonField<Double>,
    private val fe: JsonField<Double>,
    private val ff: JsonField<Double>,
    private val fhprimeF: JsonField<Double>,
    private val fhprimeF2: JsonField<Double>,
    private val fmin: JsonField<Double>,
    private val fminE: JsonField<Double>,
    private val fminEs: JsonField<Double>,
    private val fminF: JsonField<Double>,
    private val fmuf: JsonField<Double>,
    private val foE: JsonField<Double>,
    private val foEa: JsonField<Double>,
    private val foEp: JsonField<Double>,
    private val foEs: JsonField<Double>,
    private val foF1: JsonField<Double>,
    private val foF1p: JsonField<Double>,
    private val foF2: JsonField<Double>,
    private val foF2p: JsonField<Double>,
    private val foP: JsonField<Double>,
    private val frequency: JsonField<Frequency>,
    private val fxE: JsonField<Double>,
    private val fxF1: JsonField<Double>,
    private val fxF2: JsonField<Double>,
    private val fxI: JsonField<Double>,
    private val height: JsonField<List<Double>>,
    private val hmE: JsonField<Double>,
    private val hmF1: JsonField<Double>,
    private val hmF2: JsonField<Double>,
    private val hprimeE: JsonField<Double>,
    private val hprimeEa: JsonField<Double>,
    private val hprimeEs: JsonField<Double>,
    private val hprimeF: JsonField<Double>,
    private val hprimeF1: JsonField<Double>,
    private val hprimeF2: JsonField<Double>,
    private val hprimefMuf: JsonField<Double>,
    private val hprimeP: JsonField<Double>,
    private val idSensor: JsonField<String>,
    private val luf: JsonField<Double>,
    private val md: JsonField<Double>,
    private val mufd: JsonField<Double>,
    private val neProfileName: JsonField<String>,
    private val neProfileVersion: JsonField<Double>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val phase: JsonField<Phase>,
    private val plasmaFrequency: JsonField<List<Double>>,
    private val plasmaFrequencyUncertainty: JsonField<List<Double>>,
    private val platformName: JsonField<String>,
    private val polarization: JsonField<Polarization>,
    private val power: JsonField<Power>,
    private val qe: JsonField<Double>,
    private val qf: JsonField<Double>,
    private val range: JsonField<Range>,
    private val receiveCoordinates: JsonField<List<List<Double>>>,
    private val receiveSensorType: JsonField<ReceiveSensorType>,
    private val restrictedFrequency: JsonField<List<Double>>,
    private val restrictedFrequencyNotes: JsonField<String>,
    private val scaleHeightF2Peak: JsonField<Double>,
    private val scalerInfo: JsonField<ScalerInfo>,
    private val stokes: JsonField<Stokes>,
    private val systemNotes: JsonField<String>,
    private val tec: JsonField<Double>,
    private val tidAzimuth: JsonField<List<Double>>,
    private val tidPeriods: JsonField<List<Double>>,
    private val tidPhaseSpeeds: JsonField<List<Double>>,
    private val time: JsonField<Time>,
    private val traceGeneric: JsonField<TraceGeneric>,
    private val transmitCoordinates: JsonField<List<List<Double>>>,
    private val transmitSensorType: JsonField<TransmitSensorType>,
    private val typeEs: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val yE: JsonField<Double>,
    private val yF1: JsonField<Double>,
    private val yF2: JsonField<Double>,
    private val zhalfNm: JsonField<Double>,
    private val zmE: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTimeUTC")
        @ExcludeMissing
        startTimeUtc: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("stationId") @ExcludeMissing stationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("system") @ExcludeMissing system: JsonField<String> = JsonMissing.of(),
        @JsonProperty("systemInfo")
        @ExcludeMissing
        systemInfo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amplitude")
        @ExcludeMissing
        amplitude: JsonField<Amplitude> = JsonMissing.of(),
        @JsonProperty("antennaElementPosition")
        @ExcludeMissing
        antennaElementPosition: JsonField<AntennaElementPosition> = JsonMissing.of(),
        @JsonProperty("antennaElementPositionCoordinateSystem")
        @ExcludeMissing
        antennaElementPositionCoordinateSystem: JsonField<AntennaElementPositionCoordinateSystem> =
            JsonMissing.of(),
        @JsonProperty("artistFlags")
        @ExcludeMissing
        artistFlags: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("azimuth") @ExcludeMissing azimuth: JsonField<Azimuth> = JsonMissing.of(),
        @JsonProperty("b0") @ExcludeMissing b0: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("b1") @ExcludeMissing b1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("charAtts")
        @ExcludeMissing
        charAtts: JsonField<List<CharAtt>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("d") @ExcludeMissing d: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("d1") @ExcludeMissing d1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("datum") @ExcludeMissing datum: JsonField<Datum> = JsonMissing.of(),
        @JsonProperty("deltafoF2") @ExcludeMissing deltafoF2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("densityProfile")
        @ExcludeMissing
        densityProfile: JsonField<DensityProfile> = JsonMissing.of(),
        @JsonProperty("doppler") @ExcludeMissing doppler: JsonField<Doppler> = JsonMissing.of(),
        @JsonProperty("downE") @ExcludeMissing downE: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("downEs") @ExcludeMissing downEs: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("downF") @ExcludeMissing downF: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("electronDensity")
        @ExcludeMissing
        electronDensity: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("electronDensityUncertainty")
        @ExcludeMissing
        electronDensityUncertainty: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("elevation")
        @ExcludeMissing
        elevation: JsonField<Elevation> = JsonMissing.of(),
        @JsonProperty("fbEs") @ExcludeMissing fbEs: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fe") @ExcludeMissing fe: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ff") @ExcludeMissing ff: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fhprimeF") @ExcludeMissing fhprimeF: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fhprimeF2") @ExcludeMissing fhprimeF2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fmin") @ExcludeMissing fmin: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fminE") @ExcludeMissing fminE: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fminEs") @ExcludeMissing fminEs: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fminF") @ExcludeMissing fminF: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fmuf") @ExcludeMissing fmuf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("foE") @ExcludeMissing foE: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("foEa") @ExcludeMissing foEa: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("foEp") @ExcludeMissing foEp: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("foEs") @ExcludeMissing foEs: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("foF1") @ExcludeMissing foF1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("foF1p") @ExcludeMissing foF1p: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("foF2") @ExcludeMissing foF2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("foF2p") @ExcludeMissing foF2p: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("foP") @ExcludeMissing foP: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("frequency")
        @ExcludeMissing
        frequency: JsonField<Frequency> = JsonMissing.of(),
        @JsonProperty("fxE") @ExcludeMissing fxE: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fxF1") @ExcludeMissing fxF1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fxF2") @ExcludeMissing fxF2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fxI") @ExcludeMissing fxI: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("hmE") @ExcludeMissing hmE: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hmF1") @ExcludeMissing hmF1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hmF2") @ExcludeMissing hmF2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hprimeE") @ExcludeMissing hprimeE: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hprimeEa") @ExcludeMissing hprimeEa: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hprimeEs") @ExcludeMissing hprimeEs: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hprimeF") @ExcludeMissing hprimeF: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hprimeF1") @ExcludeMissing hprimeF1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hprimeF2") @ExcludeMissing hprimeF2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hprimefMUF")
        @ExcludeMissing
        hprimefMuf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hprimeP") @ExcludeMissing hprimeP: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("luf") @ExcludeMissing luf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("md") @ExcludeMissing md: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("mufd") @ExcludeMissing mufd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("neProfileName")
        @ExcludeMissing
        neProfileName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("neProfileVersion")
        @ExcludeMissing
        neProfileVersion: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origSensorId")
        @ExcludeMissing
        origSensorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phase") @ExcludeMissing phase: JsonField<Phase> = JsonMissing.of(),
        @JsonProperty("plasmaFrequency")
        @ExcludeMissing
        plasmaFrequency: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("plasmaFrequencyUncertainty")
        @ExcludeMissing
        plasmaFrequencyUncertainty: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("platformName")
        @ExcludeMissing
        platformName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("polarization")
        @ExcludeMissing
        polarization: JsonField<Polarization> = JsonMissing.of(),
        @JsonProperty("power") @ExcludeMissing power: JsonField<Power> = JsonMissing.of(),
        @JsonProperty("qe") @ExcludeMissing qe: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("qf") @ExcludeMissing qf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("range") @ExcludeMissing range: JsonField<Range> = JsonMissing.of(),
        @JsonProperty("receiveCoordinates")
        @ExcludeMissing
        receiveCoordinates: JsonField<List<List<Double>>> = JsonMissing.of(),
        @JsonProperty("receiveSensorType")
        @ExcludeMissing
        receiveSensorType: JsonField<ReceiveSensorType> = JsonMissing.of(),
        @JsonProperty("restrictedFrequency")
        @ExcludeMissing
        restrictedFrequency: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("restrictedFrequencyNotes")
        @ExcludeMissing
        restrictedFrequencyNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scaleHeightF2Peak")
        @ExcludeMissing
        scaleHeightF2Peak: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("scalerInfo")
        @ExcludeMissing
        scalerInfo: JsonField<ScalerInfo> = JsonMissing.of(),
        @JsonProperty("stokes") @ExcludeMissing stokes: JsonField<Stokes> = JsonMissing.of(),
        @JsonProperty("systemNotes")
        @ExcludeMissing
        systemNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tec") @ExcludeMissing tec: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tidAzimuth")
        @ExcludeMissing
        tidAzimuth: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("tidPeriods")
        @ExcludeMissing
        tidPeriods: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("tidPhaseSpeeds")
        @ExcludeMissing
        tidPhaseSpeeds: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("time") @ExcludeMissing time: JsonField<Time> = JsonMissing.of(),
        @JsonProperty("traceGeneric")
        @ExcludeMissing
        traceGeneric: JsonField<TraceGeneric> = JsonMissing.of(),
        @JsonProperty("transmitCoordinates")
        @ExcludeMissing
        transmitCoordinates: JsonField<List<List<Double>>> = JsonMissing.of(),
        @JsonProperty("transmitSensorType")
        @ExcludeMissing
        transmitSensorType: JsonField<TransmitSensorType> = JsonMissing.of(),
        @JsonProperty("typeEs") @ExcludeMissing typeEs: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("yE") @ExcludeMissing yE: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("yF1") @ExcludeMissing yF1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("yF2") @ExcludeMissing yF2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("zhalfNm") @ExcludeMissing zhalfNm: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("zmE") @ExcludeMissing zmE: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        startTimeUtc,
        stationId,
        system,
        systemInfo,
        id,
        amplitude,
        antennaElementPosition,
        antennaElementPositionCoordinateSystem,
        artistFlags,
        azimuth,
        b0,
        b1,
        charAtts,
        createdAt,
        createdBy,
        d,
        d1,
        datum,
        deltafoF2,
        densityProfile,
        doppler,
        downE,
        downEs,
        downF,
        electronDensity,
        electronDensityUncertainty,
        elevation,
        fbEs,
        fe,
        ff,
        fhprimeF,
        fhprimeF2,
        fmin,
        fminE,
        fminEs,
        fminF,
        fmuf,
        foE,
        foEa,
        foEp,
        foEs,
        foF1,
        foF1p,
        foF2,
        foF2p,
        foP,
        frequency,
        fxE,
        fxF1,
        fxF2,
        fxI,
        height,
        hmE,
        hmF1,
        hmF2,
        hprimeE,
        hprimeEa,
        hprimeEs,
        hprimeF,
        hprimeF1,
        hprimeF2,
        hprimefMuf,
        hprimeP,
        idSensor,
        luf,
        md,
        mufd,
        neProfileName,
        neProfileVersion,
        origin,
        origNetwork,
        origSensorId,
        phase,
        plasmaFrequency,
        plasmaFrequencyUncertainty,
        platformName,
        polarization,
        power,
        qe,
        qf,
        range,
        receiveCoordinates,
        receiveSensorType,
        restrictedFrequency,
        restrictedFrequencyNotes,
        scaleHeightF2Peak,
        scalerInfo,
        stokes,
        systemNotes,
        tec,
        tidAzimuth,
        tidPeriods,
        tidPhaseSpeeds,
        time,
        traceGeneric,
        transmitCoordinates,
        transmitSensorType,
        typeEs,
        updatedAt,
        updatedBy,
        yE,
        yF1,
        yF2,
        zhalfNm,
        zmE,
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
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Sounding Start time in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTimeUtc(): OffsetDateTime = startTimeUtc.getRequired("startTimeUTC")

    /**
     * URSI code for station or stations producing the ionosonde.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stationId(): String = stationId.getRequired("stationId")

    /**
     * Ionosonde hardware type or data collection type together with possible additional
     * descriptors.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun system(): String = system.getRequired("system")

    /**
     * Names of settings.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun systemInfo(): String = systemInfo.getRequired("systemInfo")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun amplitude(): Optional<Amplitude> = amplitude.getOptional("amplitude")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun antennaElementPosition(): Optional<AntennaElementPosition> =
        antennaElementPosition.getOptional("antennaElementPosition")

    /**
     * Enums: J2000, ECR/ECEF, TEME, GCRF, WGS84 (GEODetic lat, long, alt), GEOCentric (lat, long,
     * radii).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun antennaElementPositionCoordinateSystem(): Optional<AntennaElementPositionCoordinateSystem> =
        antennaElementPositionCoordinateSystem.getOptional("antennaElementPositionCoordinateSystem")

    /**
     * Array of Legacy Artist Flags.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun artistFlags(): Optional<List<Int>> = artistFlags.getOptional("artistFlags")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azimuth(): Optional<Azimuth> = azimuth.getOptional("azimuth")

    /**
     * IRI thickness parameter in km. URSI ID: D0.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun b0(): Optional<Double> = b0.getOptional("b0")

    /**
     * IRI profile shape parameter. URSI ID: D1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun b1(): Optional<Double> = b1.getOptional("b1")

    /**
     * List of attributes that are associated with the specified characteristics. Characteristics
     * are defined by the CHARS: URSI IIWG format for archiving monthly ionospheric characteristics,
     * INAG Bulletin No. 62 specification. Qualifying and Descriptive letters are defined by the
     * URSI Handbook for Ionogram Interpretation and reduction, Report UAG, No. 23A specification.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun charAtts(): Optional<List<CharAtt>> = charAtts.getOptional("charAtts")

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
     * Distance for MUF calculation in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun d(): Optional<Double> = d.getOptional("d")

    /**
     * IRI profile shape parameter, F1 layer. URSI ID: D2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun d1(): Optional<Double> = d1.getOptional("d1")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun datum(): Optional<Datum> = datum.getOptional("datum")

    /**
     * Adjustment to the scaled foF2 during profile inversion in MHz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun deltafoF2(): Optional<Double> = deltafoF2.getOptional("deltafoF2")

    /**
     * Profile of electron densities in the ionosphere associated with an IonoObservation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun densityProfile(): Optional<DensityProfile> = densityProfile.getOptional("densityProfile")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun doppler(): Optional<Doppler> = doppler.getOptional("doppler")

    /**
     * Lowering of E trace to the leading edge in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun downE(): Optional<Double> = downE.getOptional("downE")

    /**
     * Lowering of Es trace to the leading edge in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun downEs(): Optional<Double> = downEs.getOptional("downEs")

    /**
     * Lowering of F trace to the leading edge in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun downF(): Optional<Double> = downF.getOptional("downF")

    /**
     * Array of electron densities in cm^-3 (must match the size of the height and plasmaFrequency
     * arrays).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun electronDensity(): Optional<List<Double>> = electronDensity.getOptional("electronDensity")

    /**
     * Uncertainty in specifying the electron density at each height point of the profile (must
     * match the size of the electronDensity array).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun electronDensityUncertainty(): Optional<List<Double>> =
        electronDensityUncertainty.getOptional("electronDensityUncertainty")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevation(): Optional<Elevation> = elevation.getOptional("elevation")

    /**
     * The blanketing frequency of layer used to derive foEs in MHz. URSI ID: 32.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fbEs(): Optional<Double> = fbEs.getOptional("fbEs")

    /**
     * Frequency spread beyond foE in MHz. URSI ID: 87.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fe(): Optional<Double> = fe.getOptional("fe")

    /**
     * Frequency spread between fxF2 and FxI in MHz. URSI ID: 86.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ff(): Optional<Double> = ff.getOptional("ff")

    /**
     * The frequency at which hprimeF is measured in MHz. URSI ID: 61.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fhprimeF(): Optional<Double> = fhprimeF.getOptional("fhprimeF")

    /**
     * The frequency at which hprimeF2 is measured in MHz. URSI ID: 60.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fhprimeF2(): Optional<Double> = fhprimeF2.getOptional("fhprimeF2")

    /**
     * Lowest frequency at which echo traces are observed on the ionogram, in MHz. URSI ID: 42.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fmin(): Optional<Double> = fmin.getOptional("fmin")

    /**
     * Minimum frequency of E layer echoes in MHz. URSI ID: 81.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fminE(): Optional<Double> = fminE.getOptional("fminE")

    /**
     * Minimum frequency of Es layer in MHz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fminEs(): Optional<Double> = fminEs.getOptional("fminEs")

    /**
     * Minimum frequency of F layer echoes in MHz. URSI ID: 80.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fminF(): Optional<Double> = fminF.getOptional("fminF")

    /**
     * MUF/OblFactor in MHz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fmuf(): Optional<Double> = fmuf.getOptional("fmuf")

    /**
     * The ordinary wave critical frequency of the lowest thick layer which causes a discontinuity,
     * in MHz. URSI ID: 20.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun foE(): Optional<Double> = foE.getOptional("foE")

    /**
     * Critical frequency of night time auroral E layer in MHz. URSI ID: 23.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun foEa(): Optional<Double> = foEa.getOptional("foEa")

    /**
     * Predicted value of foE in MHz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun foEp(): Optional<Double> = foEp.getOptional("foEp")

    /**
     * Highest ordinary wave frequency at which a mainly continuous Es trace is observed, in MHz.
     * URSI ID: 30.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun foEs(): Optional<Double> = foEs.getOptional("foEs")

    /**
     * The ordinary wave F1 critical frequency, in MHz. URSI ID: 10.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun foF1(): Optional<Double> = foF1.getOptional("foF1")

    /**
     * Predicted value of foF1 in MHz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun foF1p(): Optional<Double> = foF1p.getOptional("foF1p")

    /**
     * The ordinary wave critical frequency of the highest stratification in the F region, specified
     * in MHz. URSI ID: 00.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun foF2(): Optional<Double> = foF2.getOptional("foF2")

    /**
     * Predicted value of foF2 in MHz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun foF2p(): Optional<Double> = foF2p.getOptional("foF2p")

    /**
     * Highest ordinary wave critical frequency of F region patch trace in MHz. URSI ID: 55.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun foP(): Optional<Double> = foP.getOptional("foP")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun frequency(): Optional<Frequency> = frequency.getOptional("frequency")

    /**
     * The extraordinary wave E critical frequency, in MHz. URSI ID: 21.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fxE(): Optional<Double> = fxE.getOptional("fxE")

    /**
     * The extraordinary wave F1 critical frequency, in MHz. URSI ID: 11.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fxF1(): Optional<Double> = fxF1.getOptional("fxF1")

    /**
     * The extraordinary wave F2 critical frequency, in MHz. URSI ID: 01.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fxF2(): Optional<Double> = fxF2.getOptional("fxF2")

    /**
     * The highest frequency of F-trace in MHz. Note: fxI is with capital i. URSI ID: 51.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fxI(): Optional<Double> = fxI.getOptional("fxI")

    /**
     * Array of altitudes above station level for plasma frequency/density arrays in km (must match
     * the size of the plasmaFrequency and electronDensity Arrays).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun height(): Optional<List<Double>> = height.getOptional("height")

    /**
     * True height of the E peak in km. URSI ID: CE.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hmE(): Optional<Double> = hmE.getOptional("hmE")

    /**
     * True height of the F1 peak in km. URSI ID: BE.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hmF1(): Optional<Double> = hmF1.getOptional("hmF1")

    /**
     * True height of the F2 peak in km. URSI ID: AE.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hmF2(): Optional<Double> = hmF2.getOptional("hmF2")

    /**
     * The minimum virtual height of the normal E layer trace in km. URSI ID: 24.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hprimeE(): Optional<Double> = hprimeE.getOptional("hprimeE")

    /**
     * Minimum virtual height of night time auroral E layer trace in km. URSI ID: 27.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hprimeEa(): Optional<Double> = hprimeEa.getOptional("hprimeEa")

    /**
     * The minimum height of the trace used to give foEs in km. URSI ID: 34.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hprimeEs(): Optional<Double> = hprimeEs.getOptional("hprimeEs")

    /**
     * The minimum virtual height of the ordinary wave trace taken as a whole, in km. URSI ID: 16.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hprimeF(): Optional<Double> = hprimeF.getOptional("hprimeF")

    /**
     * The minimum virtual height of reflection at a point where the trace is horizontal in the F
     * region in km. URSI ID: 14.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hprimeF1(): Optional<Double> = hprimeF1.getOptional("hprimeF1")

    /**
     * The minimum virtual height of ordinary wave trace for the highest stable stratification in
     * the F region in km. URSI ID: 4.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hprimeF2(): Optional<Double> = hprimeF2.getOptional("hprimeF2")

    /**
     * Virtual height at MUF/OblFactor frequency in MHz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hprimefMuf(): Optional<Double> = hprimefMuf.getOptional("hprimefMUF")

    /**
     * Minimum virtual height of the trace used to determine foP in km. URSI ID: 56.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hprimeP(): Optional<Double> = hprimeP.getOptional("hprimeP")

    /**
     * Unique identifier of the reporting sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

    /**
     * Lowest usable frequency.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun luf(): Optional<Double> = luf.getOptional("luf")

    /**
     * MUF(D)/foF2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun md(): Optional<Double> = md.getOptional("md")

    /**
     * Maximum Usable Frequency for ground distance D in MHz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mufd(): Optional<Double> = mufd.getOptional("mufd")

    /**
     * Name of the algorithm used for the electron density profile.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun neProfileName(): Optional<String> = neProfileName.getOptional("neProfileName")

    /**
     * Version of the algorithm used for the electron density profile.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun neProfileVersion(): Optional<Double> = neProfileVersion.getOptional("neProfileVersion")

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
     * Optional identifier provided by observation source to indicate the sensor identifier which
     * produced this observation. This may be an internal identifier and not necessarily a valid
     * sensor ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun phase(): Optional<Phase> = phase.getOptional("phase")

    /**
     * Array of plasma frequencies in MHz (must match the size of the height and electronDensity
     * arrays).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun plasmaFrequency(): Optional<List<Double>> = plasmaFrequency.getOptional("plasmaFrequency")

    /**
     * Uncertainty in specifying the electron plasma frequency at each height point of the profile
     * (must match the size of the plasmaFrequency array).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun plasmaFrequencyUncertainty(): Optional<List<Double>> =
        plasmaFrequencyUncertainty.getOptional("plasmaFrequencyUncertainty")

    /**
     * Equipment location.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun platformName(): Optional<String> = platformName.getOptional("platformName")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarization(): Optional<Polarization> = polarization.getOptional("polarization")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun power(): Optional<Power> = power.getOptional("power")

    /**
     * Average range spread of E layer in km. URSI ID: 85.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun qe(): Optional<Double> = qe.getOptional("qe")

    /**
     * Average range spread of F layer in km. URSI ID: 84.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun qf(): Optional<Double> = qf.getOptional("qf")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun range(): Optional<Range> = range.getOptional("range")

    /**
     * List of Geodetic Latitude, Longitude, and Altitude coordinates in km of the receiver.
     * Coordinates List must always have 3 elements. Valid ranges are -90.0 to 90.0 for Latitude and
     * -180.0 to 180.0 for Longitude. Altitude is in km and its value must be 0 or greater.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun receiveCoordinates(): Optional<List<List<Double>>> =
        receiveCoordinates.getOptional("receiveCoordinates")

    /**
     * Enums: Mobile, Static.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun receiveSensorType(): Optional<ReceiveSensorType> =
        receiveSensorType.getOptional("receiveSensorType")

    /**
     * Array of restricted frequencies.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun restrictedFrequency(): Optional<List<Double>> =
        restrictedFrequency.getOptional("restrictedFrequency")

    /**
     * Notes for the restrictedFrequency data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun restrictedFrequencyNotes(): Optional<String> =
        restrictedFrequencyNotes.getOptional("restrictedFrequencyNotes")

    /**
     * Effective scale height at hmF2 Titheridge method in km. URSI ID: 69.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun scaleHeightF2Peak(): Optional<Double> = scaleHeightF2Peak.getOptional("scaleHeightF2Peak")

    /**
     * The ScalerInfo record describes the person or system who interpreted the ionogram in
     * IonoObservation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun scalerInfo(): Optional<ScalerInfo> = scalerInfo.getOptional("scalerInfo")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stokes(): Optional<Stokes> = stokes.getOptional("stokes")

    /**
     * Details concerning the composition/intention/interpretation/audience/etc. of any data
     * recorded here. This field may contain all of the intended information e.g. info on signal
     * waveforms used, antenna setup, etc. OR may describe the data/settings to be provided in the
     * “data” field.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun systemNotes(): Optional<String> = systemNotes.getOptional("systemNotes")

    /**
     * Total Ionospheric Electron Content *10^16e/m^2. 1 TEC Unit (TECU) = 10^16 electrons/m^2. URSI
     * ID: 72.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tec(): Optional<Double> = tec.getOptional("tec")

    /**
     * Array of degrees clockwise from true North of the TID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tidAzimuth(): Optional<List<Double>> = tidAzimuth.getOptional("tidAzimuth")

    /**
     * Array of 1/frequency of the TID wave.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tidPeriods(): Optional<List<Double>> = tidPeriods.getOptional("tidPeriods")

    /**
     * Array of speed in m/s at which the disturbance travels through the ionosphere.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tidPhaseSpeeds(): Optional<List<Double>> = tidPhaseSpeeds.getOptional("tidPhaseSpeeds")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun time(): Optional<Time> = time.getOptional("time")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun traceGeneric(): Optional<TraceGeneric> = traceGeneric.getOptional("traceGeneric")

    /**
     * List of Geodetic Latitude, Longitude, and Altitude coordinates in km of the receiver.
     * Coordinates List must always have 3 elements. Valid ranges are -90.0 to 90.0 for Latitude and
     * -180.0 to 180.0 for Longitude. Altitude is in km and its value must be 0 or greater.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transmitCoordinates(): Optional<List<List<Double>>> =
        transmitCoordinates.getOptional("transmitCoordinates")

    /**
     * Enums: Mobile, Static.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transmitSensorType(): Optional<TransmitSensorType> =
        transmitSensorType.getOptional("transmitSensorType")

    /**
     * Characterization of the shape of Es trace. URSI ID: 36.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun typeEs(): Optional<String> = typeEs.getOptional("typeEs")

    /**
     * Time the row was updated in the database, auto-populated by the system, example =
     * 2018-01-01T16:00:00.123Z.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Application user who updated the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

    /**
     * Parabolic E layer semi-thickness in km. URSI ID: 83.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yE(): Optional<Double> = yE.getOptional("yE")

    /**
     * Parabolic F1 layer semi-thickness in km. URSI ID: 95.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yF1(): Optional<Double> = yF1.getOptional("yF1")

    /**
     * Parabolic F2 layer semi-thickness in km. URSI ID: 94.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yF2(): Optional<Double> = yF2.getOptional("yF2")

    /**
     * True height at half peak electron density in the F2 layer in km. URSI ID: 93.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zhalfNm(): Optional<Double> = zhalfNm.getOptional("zhalfNm")

    /**
     * Peak height of E-layer in km. URSI ID: 90.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zmE(): Optional<Double> = zmE.getOptional("zmE")

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
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [startTimeUtc].
     *
     * Unlike [startTimeUtc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startTimeUTC")
    @ExcludeMissing
    fun _startTimeUtc(): JsonField<OffsetDateTime> = startTimeUtc

    /**
     * Returns the raw JSON value of [stationId].
     *
     * Unlike [stationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stationId") @ExcludeMissing fun _stationId(): JsonField<String> = stationId

    /**
     * Returns the raw JSON value of [system].
     *
     * Unlike [system], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("system") @ExcludeMissing fun _system(): JsonField<String> = system

    /**
     * Returns the raw JSON value of [systemInfo].
     *
     * Unlike [systemInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("systemInfo") @ExcludeMissing fun _systemInfo(): JsonField<String> = systemInfo

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amplitude].
     *
     * Unlike [amplitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amplitude") @ExcludeMissing fun _amplitude(): JsonField<Amplitude> = amplitude

    /**
     * Returns the raw JSON value of [antennaElementPosition].
     *
     * Unlike [antennaElementPosition], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("antennaElementPosition")
    @ExcludeMissing
    fun _antennaElementPosition(): JsonField<AntennaElementPosition> = antennaElementPosition

    /**
     * Returns the raw JSON value of [antennaElementPositionCoordinateSystem].
     *
     * Unlike [antennaElementPositionCoordinateSystem], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("antennaElementPositionCoordinateSystem")
    @ExcludeMissing
    fun _antennaElementPositionCoordinateSystem():
        JsonField<AntennaElementPositionCoordinateSystem> = antennaElementPositionCoordinateSystem

    /**
     * Returns the raw JSON value of [artistFlags].
     *
     * Unlike [artistFlags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("artistFlags")
    @ExcludeMissing
    fun _artistFlags(): JsonField<List<Int>> = artistFlags

    /**
     * Returns the raw JSON value of [azimuth].
     *
     * Unlike [azimuth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azimuth") @ExcludeMissing fun _azimuth(): JsonField<Azimuth> = azimuth

    /**
     * Returns the raw JSON value of [b0].
     *
     * Unlike [b0], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("b0") @ExcludeMissing fun _b0(): JsonField<Double> = b0

    /**
     * Returns the raw JSON value of [b1].
     *
     * Unlike [b1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("b1") @ExcludeMissing fun _b1(): JsonField<Double> = b1

    /**
     * Returns the raw JSON value of [charAtts].
     *
     * Unlike [charAtts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("charAtts") @ExcludeMissing fun _charAtts(): JsonField<List<CharAtt>> = charAtts

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
     * Returns the raw JSON value of [d].
     *
     * Unlike [d], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("d") @ExcludeMissing fun _d(): JsonField<Double> = d

    /**
     * Returns the raw JSON value of [d1].
     *
     * Unlike [d1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("d1") @ExcludeMissing fun _d1(): JsonField<Double> = d1

    /**
     * Returns the raw JSON value of [datum].
     *
     * Unlike [datum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("datum") @ExcludeMissing fun _datum(): JsonField<Datum> = datum

    /**
     * Returns the raw JSON value of [deltafoF2].
     *
     * Unlike [deltafoF2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deltafoF2") @ExcludeMissing fun _deltafoF2(): JsonField<Double> = deltafoF2

    /**
     * Returns the raw JSON value of [densityProfile].
     *
     * Unlike [densityProfile], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("densityProfile")
    @ExcludeMissing
    fun _densityProfile(): JsonField<DensityProfile> = densityProfile

    /**
     * Returns the raw JSON value of [doppler].
     *
     * Unlike [doppler], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("doppler") @ExcludeMissing fun _doppler(): JsonField<Doppler> = doppler

    /**
     * Returns the raw JSON value of [downE].
     *
     * Unlike [downE], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("downE") @ExcludeMissing fun _downE(): JsonField<Double> = downE

    /**
     * Returns the raw JSON value of [downEs].
     *
     * Unlike [downEs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("downEs") @ExcludeMissing fun _downEs(): JsonField<Double> = downEs

    /**
     * Returns the raw JSON value of [downF].
     *
     * Unlike [downF], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("downF") @ExcludeMissing fun _downF(): JsonField<Double> = downF

    /**
     * Returns the raw JSON value of [electronDensity].
     *
     * Unlike [electronDensity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("electronDensity")
    @ExcludeMissing
    fun _electronDensity(): JsonField<List<Double>> = electronDensity

    /**
     * Returns the raw JSON value of [electronDensityUncertainty].
     *
     * Unlike [electronDensityUncertainty], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("electronDensityUncertainty")
    @ExcludeMissing
    fun _electronDensityUncertainty(): JsonField<List<Double>> = electronDensityUncertainty

    /**
     * Returns the raw JSON value of [elevation].
     *
     * Unlike [elevation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elevation") @ExcludeMissing fun _elevation(): JsonField<Elevation> = elevation

    /**
     * Returns the raw JSON value of [fbEs].
     *
     * Unlike [fbEs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fbEs") @ExcludeMissing fun _fbEs(): JsonField<Double> = fbEs

    /**
     * Returns the raw JSON value of [fe].
     *
     * Unlike [fe], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fe") @ExcludeMissing fun _fe(): JsonField<Double> = fe

    /**
     * Returns the raw JSON value of [ff].
     *
     * Unlike [ff], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ff") @ExcludeMissing fun _ff(): JsonField<Double> = ff

    /**
     * Returns the raw JSON value of [fhprimeF].
     *
     * Unlike [fhprimeF], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fhprimeF") @ExcludeMissing fun _fhprimeF(): JsonField<Double> = fhprimeF

    /**
     * Returns the raw JSON value of [fhprimeF2].
     *
     * Unlike [fhprimeF2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fhprimeF2") @ExcludeMissing fun _fhprimeF2(): JsonField<Double> = fhprimeF2

    /**
     * Returns the raw JSON value of [fmin].
     *
     * Unlike [fmin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fmin") @ExcludeMissing fun _fmin(): JsonField<Double> = fmin

    /**
     * Returns the raw JSON value of [fminE].
     *
     * Unlike [fminE], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fminE") @ExcludeMissing fun _fminE(): JsonField<Double> = fminE

    /**
     * Returns the raw JSON value of [fminEs].
     *
     * Unlike [fminEs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fminEs") @ExcludeMissing fun _fminEs(): JsonField<Double> = fminEs

    /**
     * Returns the raw JSON value of [fminF].
     *
     * Unlike [fminF], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fminF") @ExcludeMissing fun _fminF(): JsonField<Double> = fminF

    /**
     * Returns the raw JSON value of [fmuf].
     *
     * Unlike [fmuf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fmuf") @ExcludeMissing fun _fmuf(): JsonField<Double> = fmuf

    /**
     * Returns the raw JSON value of [foE].
     *
     * Unlike [foE], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foE") @ExcludeMissing fun _foE(): JsonField<Double> = foE

    /**
     * Returns the raw JSON value of [foEa].
     *
     * Unlike [foEa], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foEa") @ExcludeMissing fun _foEa(): JsonField<Double> = foEa

    /**
     * Returns the raw JSON value of [foEp].
     *
     * Unlike [foEp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foEp") @ExcludeMissing fun _foEp(): JsonField<Double> = foEp

    /**
     * Returns the raw JSON value of [foEs].
     *
     * Unlike [foEs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foEs") @ExcludeMissing fun _foEs(): JsonField<Double> = foEs

    /**
     * Returns the raw JSON value of [foF1].
     *
     * Unlike [foF1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foF1") @ExcludeMissing fun _foF1(): JsonField<Double> = foF1

    /**
     * Returns the raw JSON value of [foF1p].
     *
     * Unlike [foF1p], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foF1p") @ExcludeMissing fun _foF1p(): JsonField<Double> = foF1p

    /**
     * Returns the raw JSON value of [foF2].
     *
     * Unlike [foF2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foF2") @ExcludeMissing fun _foF2(): JsonField<Double> = foF2

    /**
     * Returns the raw JSON value of [foF2p].
     *
     * Unlike [foF2p], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foF2p") @ExcludeMissing fun _foF2p(): JsonField<Double> = foF2p

    /**
     * Returns the raw JSON value of [foP].
     *
     * Unlike [foP], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foP") @ExcludeMissing fun _foP(): JsonField<Double> = foP

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequency") @ExcludeMissing fun _frequency(): JsonField<Frequency> = frequency

    /**
     * Returns the raw JSON value of [fxE].
     *
     * Unlike [fxE], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fxE") @ExcludeMissing fun _fxE(): JsonField<Double> = fxE

    /**
     * Returns the raw JSON value of [fxF1].
     *
     * Unlike [fxF1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fxF1") @ExcludeMissing fun _fxF1(): JsonField<Double> = fxF1

    /**
     * Returns the raw JSON value of [fxF2].
     *
     * Unlike [fxF2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fxF2") @ExcludeMissing fun _fxF2(): JsonField<Double> = fxF2

    /**
     * Returns the raw JSON value of [fxI].
     *
     * Unlike [fxI], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fxI") @ExcludeMissing fun _fxI(): JsonField<Double> = fxI

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<List<Double>> = height

    /**
     * Returns the raw JSON value of [hmE].
     *
     * Unlike [hmE], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hmE") @ExcludeMissing fun _hmE(): JsonField<Double> = hmE

    /**
     * Returns the raw JSON value of [hmF1].
     *
     * Unlike [hmF1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hmF1") @ExcludeMissing fun _hmF1(): JsonField<Double> = hmF1

    /**
     * Returns the raw JSON value of [hmF2].
     *
     * Unlike [hmF2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hmF2") @ExcludeMissing fun _hmF2(): JsonField<Double> = hmF2

    /**
     * Returns the raw JSON value of [hprimeE].
     *
     * Unlike [hprimeE], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hprimeE") @ExcludeMissing fun _hprimeE(): JsonField<Double> = hprimeE

    /**
     * Returns the raw JSON value of [hprimeEa].
     *
     * Unlike [hprimeEa], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hprimeEa") @ExcludeMissing fun _hprimeEa(): JsonField<Double> = hprimeEa

    /**
     * Returns the raw JSON value of [hprimeEs].
     *
     * Unlike [hprimeEs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hprimeEs") @ExcludeMissing fun _hprimeEs(): JsonField<Double> = hprimeEs

    /**
     * Returns the raw JSON value of [hprimeF].
     *
     * Unlike [hprimeF], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hprimeF") @ExcludeMissing fun _hprimeF(): JsonField<Double> = hprimeF

    /**
     * Returns the raw JSON value of [hprimeF1].
     *
     * Unlike [hprimeF1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hprimeF1") @ExcludeMissing fun _hprimeF1(): JsonField<Double> = hprimeF1

    /**
     * Returns the raw JSON value of [hprimeF2].
     *
     * Unlike [hprimeF2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hprimeF2") @ExcludeMissing fun _hprimeF2(): JsonField<Double> = hprimeF2

    /**
     * Returns the raw JSON value of [hprimefMuf].
     *
     * Unlike [hprimefMuf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hprimefMUF") @ExcludeMissing fun _hprimefMuf(): JsonField<Double> = hprimefMuf

    /**
     * Returns the raw JSON value of [hprimeP].
     *
     * Unlike [hprimeP], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hprimeP") @ExcludeMissing fun _hprimeP(): JsonField<Double> = hprimeP

    /**
     * Returns the raw JSON value of [idSensor].
     *
     * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

    /**
     * Returns the raw JSON value of [luf].
     *
     * Unlike [luf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("luf") @ExcludeMissing fun _luf(): JsonField<Double> = luf

    /**
     * Returns the raw JSON value of [md].
     *
     * Unlike [md], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("md") @ExcludeMissing fun _md(): JsonField<Double> = md

    /**
     * Returns the raw JSON value of [mufd].
     *
     * Unlike [mufd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mufd") @ExcludeMissing fun _mufd(): JsonField<Double> = mufd

    /**
     * Returns the raw JSON value of [neProfileName].
     *
     * Unlike [neProfileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("neProfileName")
    @ExcludeMissing
    fun _neProfileName(): JsonField<String> = neProfileName

    /**
     * Returns the raw JSON value of [neProfileVersion].
     *
     * Unlike [neProfileVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("neProfileVersion")
    @ExcludeMissing
    fun _neProfileVersion(): JsonField<Double> = neProfileVersion

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
     * Returns the raw JSON value of [origSensorId].
     *
     * Unlike [origSensorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origSensorId")
    @ExcludeMissing
    fun _origSensorId(): JsonField<String> = origSensorId

    /**
     * Returns the raw JSON value of [phase].
     *
     * Unlike [phase], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phase") @ExcludeMissing fun _phase(): JsonField<Phase> = phase

    /**
     * Returns the raw JSON value of [plasmaFrequency].
     *
     * Unlike [plasmaFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plasmaFrequency")
    @ExcludeMissing
    fun _plasmaFrequency(): JsonField<List<Double>> = plasmaFrequency

    /**
     * Returns the raw JSON value of [plasmaFrequencyUncertainty].
     *
     * Unlike [plasmaFrequencyUncertainty], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("plasmaFrequencyUncertainty")
    @ExcludeMissing
    fun _plasmaFrequencyUncertainty(): JsonField<List<Double>> = plasmaFrequencyUncertainty

    /**
     * Returns the raw JSON value of [platformName].
     *
     * Unlike [platformName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platformName")
    @ExcludeMissing
    fun _platformName(): JsonField<String> = platformName

    /**
     * Returns the raw JSON value of [polarization].
     *
     * Unlike [polarization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarization")
    @ExcludeMissing
    fun _polarization(): JsonField<Polarization> = polarization

    /**
     * Returns the raw JSON value of [power].
     *
     * Unlike [power], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("power") @ExcludeMissing fun _power(): JsonField<Power> = power

    /**
     * Returns the raw JSON value of [qe].
     *
     * Unlike [qe], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("qe") @ExcludeMissing fun _qe(): JsonField<Double> = qe

    /**
     * Returns the raw JSON value of [qf].
     *
     * Unlike [qf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("qf") @ExcludeMissing fun _qf(): JsonField<Double> = qf

    /**
     * Returns the raw JSON value of [range].
     *
     * Unlike [range], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("range") @ExcludeMissing fun _range(): JsonField<Range> = range

    /**
     * Returns the raw JSON value of [receiveCoordinates].
     *
     * Unlike [receiveCoordinates], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("receiveCoordinates")
    @ExcludeMissing
    fun _receiveCoordinates(): JsonField<List<List<Double>>> = receiveCoordinates

    /**
     * Returns the raw JSON value of [receiveSensorType].
     *
     * Unlike [receiveSensorType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("receiveSensorType")
    @ExcludeMissing
    fun _receiveSensorType(): JsonField<ReceiveSensorType> = receiveSensorType

    /**
     * Returns the raw JSON value of [restrictedFrequency].
     *
     * Unlike [restrictedFrequency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("restrictedFrequency")
    @ExcludeMissing
    fun _restrictedFrequency(): JsonField<List<Double>> = restrictedFrequency

    /**
     * Returns the raw JSON value of [restrictedFrequencyNotes].
     *
     * Unlike [restrictedFrequencyNotes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("restrictedFrequencyNotes")
    @ExcludeMissing
    fun _restrictedFrequencyNotes(): JsonField<String> = restrictedFrequencyNotes

    /**
     * Returns the raw JSON value of [scaleHeightF2Peak].
     *
     * Unlike [scaleHeightF2Peak], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("scaleHeightF2Peak")
    @ExcludeMissing
    fun _scaleHeightF2Peak(): JsonField<Double> = scaleHeightF2Peak

    /**
     * Returns the raw JSON value of [scalerInfo].
     *
     * Unlike [scalerInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scalerInfo")
    @ExcludeMissing
    fun _scalerInfo(): JsonField<ScalerInfo> = scalerInfo

    /**
     * Returns the raw JSON value of [stokes].
     *
     * Unlike [stokes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stokes") @ExcludeMissing fun _stokes(): JsonField<Stokes> = stokes

    /**
     * Returns the raw JSON value of [systemNotes].
     *
     * Unlike [systemNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("systemNotes") @ExcludeMissing fun _systemNotes(): JsonField<String> = systemNotes

    /**
     * Returns the raw JSON value of [tec].
     *
     * Unlike [tec], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tec") @ExcludeMissing fun _tec(): JsonField<Double> = tec

    /**
     * Returns the raw JSON value of [tidAzimuth].
     *
     * Unlike [tidAzimuth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tidAzimuth")
    @ExcludeMissing
    fun _tidAzimuth(): JsonField<List<Double>> = tidAzimuth

    /**
     * Returns the raw JSON value of [tidPeriods].
     *
     * Unlike [tidPeriods], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tidPeriods")
    @ExcludeMissing
    fun _tidPeriods(): JsonField<List<Double>> = tidPeriods

    /**
     * Returns the raw JSON value of [tidPhaseSpeeds].
     *
     * Unlike [tidPhaseSpeeds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tidPhaseSpeeds")
    @ExcludeMissing
    fun _tidPhaseSpeeds(): JsonField<List<Double>> = tidPhaseSpeeds

    /**
     * Returns the raw JSON value of [time].
     *
     * Unlike [time], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("time") @ExcludeMissing fun _time(): JsonField<Time> = time

    /**
     * Returns the raw JSON value of [traceGeneric].
     *
     * Unlike [traceGeneric], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("traceGeneric")
    @ExcludeMissing
    fun _traceGeneric(): JsonField<TraceGeneric> = traceGeneric

    /**
     * Returns the raw JSON value of [transmitCoordinates].
     *
     * Unlike [transmitCoordinates], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transmitCoordinates")
    @ExcludeMissing
    fun _transmitCoordinates(): JsonField<List<List<Double>>> = transmitCoordinates

    /**
     * Returns the raw JSON value of [transmitSensorType].
     *
     * Unlike [transmitSensorType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transmitSensorType")
    @ExcludeMissing
    fun _transmitSensorType(): JsonField<TransmitSensorType> = transmitSensorType

    /**
     * Returns the raw JSON value of [typeEs].
     *
     * Unlike [typeEs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("typeEs") @ExcludeMissing fun _typeEs(): JsonField<String> = typeEs

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [updatedBy].
     *
     * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedBy") @ExcludeMissing fun _updatedBy(): JsonField<String> = updatedBy

    /**
     * Returns the raw JSON value of [yE].
     *
     * Unlike [yE], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yE") @ExcludeMissing fun _yE(): JsonField<Double> = yE

    /**
     * Returns the raw JSON value of [yF1].
     *
     * Unlike [yF1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yF1") @ExcludeMissing fun _yF1(): JsonField<Double> = yF1

    /**
     * Returns the raw JSON value of [yF2].
     *
     * Unlike [yF2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yF2") @ExcludeMissing fun _yF2(): JsonField<Double> = yF2

    /**
     * Returns the raw JSON value of [zhalfNm].
     *
     * Unlike [zhalfNm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zhalfNm") @ExcludeMissing fun _zhalfNm(): JsonField<Double> = zhalfNm

    /**
     * Returns the raw JSON value of [zmE].
     *
     * Unlike [zmE], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zmE") @ExcludeMissing fun _zmE(): JsonField<Double> = zmE

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
         * Returns a mutable builder for constructing an instance of [IonoObservationTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .startTimeUtc()
         * .stationId()
         * .system()
         * .systemInfo()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IonoObservationTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var startTimeUtc: JsonField<OffsetDateTime>? = null
        private var stationId: JsonField<String>? = null
        private var system: JsonField<String>? = null
        private var systemInfo: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var amplitude: JsonField<Amplitude> = JsonMissing.of()
        private var antennaElementPosition: JsonField<AntennaElementPosition> = JsonMissing.of()
        private var antennaElementPositionCoordinateSystem:
            JsonField<AntennaElementPositionCoordinateSystem> =
            JsonMissing.of()
        private var artistFlags: JsonField<MutableList<Int>>? = null
        private var azimuth: JsonField<Azimuth> = JsonMissing.of()
        private var b0: JsonField<Double> = JsonMissing.of()
        private var b1: JsonField<Double> = JsonMissing.of()
        private var charAtts: JsonField<MutableList<CharAtt>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var d: JsonField<Double> = JsonMissing.of()
        private var d1: JsonField<Double> = JsonMissing.of()
        private var datum: JsonField<Datum> = JsonMissing.of()
        private var deltafoF2: JsonField<Double> = JsonMissing.of()
        private var densityProfile: JsonField<DensityProfile> = JsonMissing.of()
        private var doppler: JsonField<Doppler> = JsonMissing.of()
        private var downE: JsonField<Double> = JsonMissing.of()
        private var downEs: JsonField<Double> = JsonMissing.of()
        private var downF: JsonField<Double> = JsonMissing.of()
        private var electronDensity: JsonField<MutableList<Double>>? = null
        private var electronDensityUncertainty: JsonField<MutableList<Double>>? = null
        private var elevation: JsonField<Elevation> = JsonMissing.of()
        private var fbEs: JsonField<Double> = JsonMissing.of()
        private var fe: JsonField<Double> = JsonMissing.of()
        private var ff: JsonField<Double> = JsonMissing.of()
        private var fhprimeF: JsonField<Double> = JsonMissing.of()
        private var fhprimeF2: JsonField<Double> = JsonMissing.of()
        private var fmin: JsonField<Double> = JsonMissing.of()
        private var fminE: JsonField<Double> = JsonMissing.of()
        private var fminEs: JsonField<Double> = JsonMissing.of()
        private var fminF: JsonField<Double> = JsonMissing.of()
        private var fmuf: JsonField<Double> = JsonMissing.of()
        private var foE: JsonField<Double> = JsonMissing.of()
        private var foEa: JsonField<Double> = JsonMissing.of()
        private var foEp: JsonField<Double> = JsonMissing.of()
        private var foEs: JsonField<Double> = JsonMissing.of()
        private var foF1: JsonField<Double> = JsonMissing.of()
        private var foF1p: JsonField<Double> = JsonMissing.of()
        private var foF2: JsonField<Double> = JsonMissing.of()
        private var foF2p: JsonField<Double> = JsonMissing.of()
        private var foP: JsonField<Double> = JsonMissing.of()
        private var frequency: JsonField<Frequency> = JsonMissing.of()
        private var fxE: JsonField<Double> = JsonMissing.of()
        private var fxF1: JsonField<Double> = JsonMissing.of()
        private var fxF2: JsonField<Double> = JsonMissing.of()
        private var fxI: JsonField<Double> = JsonMissing.of()
        private var height: JsonField<MutableList<Double>>? = null
        private var hmE: JsonField<Double> = JsonMissing.of()
        private var hmF1: JsonField<Double> = JsonMissing.of()
        private var hmF2: JsonField<Double> = JsonMissing.of()
        private var hprimeE: JsonField<Double> = JsonMissing.of()
        private var hprimeEa: JsonField<Double> = JsonMissing.of()
        private var hprimeEs: JsonField<Double> = JsonMissing.of()
        private var hprimeF: JsonField<Double> = JsonMissing.of()
        private var hprimeF1: JsonField<Double> = JsonMissing.of()
        private var hprimeF2: JsonField<Double> = JsonMissing.of()
        private var hprimefMuf: JsonField<Double> = JsonMissing.of()
        private var hprimeP: JsonField<Double> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var luf: JsonField<Double> = JsonMissing.of()
        private var md: JsonField<Double> = JsonMissing.of()
        private var mufd: JsonField<Double> = JsonMissing.of()
        private var neProfileName: JsonField<String> = JsonMissing.of()
        private var neProfileVersion: JsonField<Double> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var phase: JsonField<Phase> = JsonMissing.of()
        private var plasmaFrequency: JsonField<MutableList<Double>>? = null
        private var plasmaFrequencyUncertainty: JsonField<MutableList<Double>>? = null
        private var platformName: JsonField<String> = JsonMissing.of()
        private var polarization: JsonField<Polarization> = JsonMissing.of()
        private var power: JsonField<Power> = JsonMissing.of()
        private var qe: JsonField<Double> = JsonMissing.of()
        private var qf: JsonField<Double> = JsonMissing.of()
        private var range: JsonField<Range> = JsonMissing.of()
        private var receiveCoordinates: JsonField<MutableList<List<Double>>>? = null
        private var receiveSensorType: JsonField<ReceiveSensorType> = JsonMissing.of()
        private var restrictedFrequency: JsonField<MutableList<Double>>? = null
        private var restrictedFrequencyNotes: JsonField<String> = JsonMissing.of()
        private var scaleHeightF2Peak: JsonField<Double> = JsonMissing.of()
        private var scalerInfo: JsonField<ScalerInfo> = JsonMissing.of()
        private var stokes: JsonField<Stokes> = JsonMissing.of()
        private var systemNotes: JsonField<String> = JsonMissing.of()
        private var tec: JsonField<Double> = JsonMissing.of()
        private var tidAzimuth: JsonField<MutableList<Double>>? = null
        private var tidPeriods: JsonField<MutableList<Double>>? = null
        private var tidPhaseSpeeds: JsonField<MutableList<Double>>? = null
        private var time: JsonField<Time> = JsonMissing.of()
        private var traceGeneric: JsonField<TraceGeneric> = JsonMissing.of()
        private var transmitCoordinates: JsonField<MutableList<List<Double>>>? = null
        private var transmitSensorType: JsonField<TransmitSensorType> = JsonMissing.of()
        private var typeEs: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var yE: JsonField<Double> = JsonMissing.of()
        private var yF1: JsonField<Double> = JsonMissing.of()
        private var yF2: JsonField<Double> = JsonMissing.of()
        private var zhalfNm: JsonField<Double> = JsonMissing.of()
        private var zmE: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ionoObservationTupleResponse: IonoObservationTupleResponse) = apply {
            classificationMarking = ionoObservationTupleResponse.classificationMarking
            dataMode = ionoObservationTupleResponse.dataMode
            source = ionoObservationTupleResponse.source
            startTimeUtc = ionoObservationTupleResponse.startTimeUtc
            stationId = ionoObservationTupleResponse.stationId
            system = ionoObservationTupleResponse.system
            systemInfo = ionoObservationTupleResponse.systemInfo
            id = ionoObservationTupleResponse.id
            amplitude = ionoObservationTupleResponse.amplitude
            antennaElementPosition = ionoObservationTupleResponse.antennaElementPosition
            antennaElementPositionCoordinateSystem =
                ionoObservationTupleResponse.antennaElementPositionCoordinateSystem
            artistFlags = ionoObservationTupleResponse.artistFlags.map { it.toMutableList() }
            azimuth = ionoObservationTupleResponse.azimuth
            b0 = ionoObservationTupleResponse.b0
            b1 = ionoObservationTupleResponse.b1
            charAtts = ionoObservationTupleResponse.charAtts.map { it.toMutableList() }
            createdAt = ionoObservationTupleResponse.createdAt
            createdBy = ionoObservationTupleResponse.createdBy
            d = ionoObservationTupleResponse.d
            d1 = ionoObservationTupleResponse.d1
            datum = ionoObservationTupleResponse.datum
            deltafoF2 = ionoObservationTupleResponse.deltafoF2
            densityProfile = ionoObservationTupleResponse.densityProfile
            doppler = ionoObservationTupleResponse.doppler
            downE = ionoObservationTupleResponse.downE
            downEs = ionoObservationTupleResponse.downEs
            downF = ionoObservationTupleResponse.downF
            electronDensity =
                ionoObservationTupleResponse.electronDensity.map { it.toMutableList() }
            electronDensityUncertainty =
                ionoObservationTupleResponse.electronDensityUncertainty.map { it.toMutableList() }
            elevation = ionoObservationTupleResponse.elevation
            fbEs = ionoObservationTupleResponse.fbEs
            fe = ionoObservationTupleResponse.fe
            ff = ionoObservationTupleResponse.ff
            fhprimeF = ionoObservationTupleResponse.fhprimeF
            fhprimeF2 = ionoObservationTupleResponse.fhprimeF2
            fmin = ionoObservationTupleResponse.fmin
            fminE = ionoObservationTupleResponse.fminE
            fminEs = ionoObservationTupleResponse.fminEs
            fminF = ionoObservationTupleResponse.fminF
            fmuf = ionoObservationTupleResponse.fmuf
            foE = ionoObservationTupleResponse.foE
            foEa = ionoObservationTupleResponse.foEa
            foEp = ionoObservationTupleResponse.foEp
            foEs = ionoObservationTupleResponse.foEs
            foF1 = ionoObservationTupleResponse.foF1
            foF1p = ionoObservationTupleResponse.foF1p
            foF2 = ionoObservationTupleResponse.foF2
            foF2p = ionoObservationTupleResponse.foF2p
            foP = ionoObservationTupleResponse.foP
            frequency = ionoObservationTupleResponse.frequency
            fxE = ionoObservationTupleResponse.fxE
            fxF1 = ionoObservationTupleResponse.fxF1
            fxF2 = ionoObservationTupleResponse.fxF2
            fxI = ionoObservationTupleResponse.fxI
            height = ionoObservationTupleResponse.height.map { it.toMutableList() }
            hmE = ionoObservationTupleResponse.hmE
            hmF1 = ionoObservationTupleResponse.hmF1
            hmF2 = ionoObservationTupleResponse.hmF2
            hprimeE = ionoObservationTupleResponse.hprimeE
            hprimeEa = ionoObservationTupleResponse.hprimeEa
            hprimeEs = ionoObservationTupleResponse.hprimeEs
            hprimeF = ionoObservationTupleResponse.hprimeF
            hprimeF1 = ionoObservationTupleResponse.hprimeF1
            hprimeF2 = ionoObservationTupleResponse.hprimeF2
            hprimefMuf = ionoObservationTupleResponse.hprimefMuf
            hprimeP = ionoObservationTupleResponse.hprimeP
            idSensor = ionoObservationTupleResponse.idSensor
            luf = ionoObservationTupleResponse.luf
            md = ionoObservationTupleResponse.md
            mufd = ionoObservationTupleResponse.mufd
            neProfileName = ionoObservationTupleResponse.neProfileName
            neProfileVersion = ionoObservationTupleResponse.neProfileVersion
            origin = ionoObservationTupleResponse.origin
            origNetwork = ionoObservationTupleResponse.origNetwork
            origSensorId = ionoObservationTupleResponse.origSensorId
            phase = ionoObservationTupleResponse.phase
            plasmaFrequency =
                ionoObservationTupleResponse.plasmaFrequency.map { it.toMutableList() }
            plasmaFrequencyUncertainty =
                ionoObservationTupleResponse.plasmaFrequencyUncertainty.map { it.toMutableList() }
            platformName = ionoObservationTupleResponse.platformName
            polarization = ionoObservationTupleResponse.polarization
            power = ionoObservationTupleResponse.power
            qe = ionoObservationTupleResponse.qe
            qf = ionoObservationTupleResponse.qf
            range = ionoObservationTupleResponse.range
            receiveCoordinates =
                ionoObservationTupleResponse.receiveCoordinates.map { it.toMutableList() }
            receiveSensorType = ionoObservationTupleResponse.receiveSensorType
            restrictedFrequency =
                ionoObservationTupleResponse.restrictedFrequency.map { it.toMutableList() }
            restrictedFrequencyNotes = ionoObservationTupleResponse.restrictedFrequencyNotes
            scaleHeightF2Peak = ionoObservationTupleResponse.scaleHeightF2Peak
            scalerInfo = ionoObservationTupleResponse.scalerInfo
            stokes = ionoObservationTupleResponse.stokes
            systemNotes = ionoObservationTupleResponse.systemNotes
            tec = ionoObservationTupleResponse.tec
            tidAzimuth = ionoObservationTupleResponse.tidAzimuth.map { it.toMutableList() }
            tidPeriods = ionoObservationTupleResponse.tidPeriods.map { it.toMutableList() }
            tidPhaseSpeeds = ionoObservationTupleResponse.tidPhaseSpeeds.map { it.toMutableList() }
            time = ionoObservationTupleResponse.time
            traceGeneric = ionoObservationTupleResponse.traceGeneric
            transmitCoordinates =
                ionoObservationTupleResponse.transmitCoordinates.map { it.toMutableList() }
            transmitSensorType = ionoObservationTupleResponse.transmitSensorType
            typeEs = ionoObservationTupleResponse.typeEs
            updatedAt = ionoObservationTupleResponse.updatedAt
            updatedBy = ionoObservationTupleResponse.updatedBy
            yE = ionoObservationTupleResponse.yE
            yF1 = ionoObservationTupleResponse.yF1
            yF2 = ionoObservationTupleResponse.yF2
            zhalfNm = ionoObservationTupleResponse.zhalfNm
            zmE = ionoObservationTupleResponse.zmE
            additionalProperties = ionoObservationTupleResponse.additionalProperties.toMutableMap()
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

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Sounding Start time in ISO8601 UTC format. */
        fun startTimeUtc(startTimeUtc: OffsetDateTime) = startTimeUtc(JsonField.of(startTimeUtc))

        /**
         * Sets [Builder.startTimeUtc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTimeUtc] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTimeUtc(startTimeUtc: JsonField<OffsetDateTime>) = apply {
            this.startTimeUtc = startTimeUtc
        }

        /** URSI code for station or stations producing the ionosonde. */
        fun stationId(stationId: String) = stationId(JsonField.of(stationId))

        /**
         * Sets [Builder.stationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stationId(stationId: JsonField<String>) = apply { this.stationId = stationId }

        /**
         * Ionosonde hardware type or data collection type together with possible additional
         * descriptors.
         */
        fun system(system: String) = system(JsonField.of(system))

        /**
         * Sets [Builder.system] to an arbitrary JSON value.
         *
         * You should usually call [Builder.system] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun system(system: JsonField<String>) = apply { this.system = system }

        /** Names of settings. */
        fun systemInfo(systemInfo: String) = systemInfo(JsonField.of(systemInfo))

        /**
         * Sets [Builder.systemInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemInfo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun systemInfo(systemInfo: JsonField<String>) = apply { this.systemInfo = systemInfo }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun amplitude(amplitude: Amplitude) = amplitude(JsonField.of(amplitude))

        /**
         * Sets [Builder.amplitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amplitude] with a well-typed [Amplitude] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amplitude(amplitude: JsonField<Amplitude>) = apply { this.amplitude = amplitude }

        fun antennaElementPosition(antennaElementPosition: AntennaElementPosition) =
            antennaElementPosition(JsonField.of(antennaElementPosition))

        /**
         * Sets [Builder.antennaElementPosition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.antennaElementPosition] with a well-typed
         * [AntennaElementPosition] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun antennaElementPosition(antennaElementPosition: JsonField<AntennaElementPosition>) =
            apply {
                this.antennaElementPosition = antennaElementPosition
            }

        /**
         * Enums: J2000, ECR/ECEF, TEME, GCRF, WGS84 (GEODetic lat, long, alt), GEOCentric (lat,
         * long, radii).
         */
        fun antennaElementPositionCoordinateSystem(
            antennaElementPositionCoordinateSystem: AntennaElementPositionCoordinateSystem
        ) =
            antennaElementPositionCoordinateSystem(
                JsonField.of(antennaElementPositionCoordinateSystem)
            )

        /**
         * Sets [Builder.antennaElementPositionCoordinateSystem] to an arbitrary JSON value.
         *
         * You should usually call [Builder.antennaElementPositionCoordinateSystem] with a
         * well-typed [AntennaElementPositionCoordinateSystem] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun antennaElementPositionCoordinateSystem(
            antennaElementPositionCoordinateSystem:
                JsonField<AntennaElementPositionCoordinateSystem>
        ) = apply {
            this.antennaElementPositionCoordinateSystem = antennaElementPositionCoordinateSystem
        }

        /** Array of Legacy Artist Flags. */
        fun artistFlags(artistFlags: List<Int>) = artistFlags(JsonField.of(artistFlags))

        /**
         * Sets [Builder.artistFlags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.artistFlags] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun artistFlags(artistFlags: JsonField<List<Int>>) = apply {
            this.artistFlags = artistFlags.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [artistFlags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addArtistFlag(artistFlag: Int) = apply {
            artistFlags =
                (artistFlags ?: JsonField.of(mutableListOf())).also {
                    checkKnown("artistFlags", it).add(artistFlag)
                }
        }

        fun azimuth(azimuth: Azimuth) = azimuth(JsonField.of(azimuth))

        /**
         * Sets [Builder.azimuth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azimuth] with a well-typed [Azimuth] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun azimuth(azimuth: JsonField<Azimuth>) = apply { this.azimuth = azimuth }

        /** IRI thickness parameter in km. URSI ID: D0. */
        fun b0(b0: Double) = b0(JsonField.of(b0))

        /**
         * Sets [Builder.b0] to an arbitrary JSON value.
         *
         * You should usually call [Builder.b0] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun b0(b0: JsonField<Double>) = apply { this.b0 = b0 }

        /** IRI profile shape parameter. URSI ID: D1. */
        fun b1(b1: Double) = b1(JsonField.of(b1))

        /**
         * Sets [Builder.b1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.b1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun b1(b1: JsonField<Double>) = apply { this.b1 = b1 }

        /**
         * List of attributes that are associated with the specified characteristics.
         * Characteristics are defined by the CHARS: URSI IIWG format for archiving monthly
         * ionospheric characteristics, INAG Bulletin No. 62 specification. Qualifying and
         * Descriptive letters are defined by the URSI Handbook for Ionogram Interpretation and
         * reduction, Report UAG, No. 23A specification.
         */
        fun charAtts(charAtts: List<CharAtt>) = charAtts(JsonField.of(charAtts))

        /**
         * Sets [Builder.charAtts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.charAtts] with a well-typed `List<CharAtt>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun charAtts(charAtts: JsonField<List<CharAtt>>) = apply {
            this.charAtts = charAtts.map { it.toMutableList() }
        }

        /**
         * Adds a single [CharAtt] to [charAtts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCharAtt(charAtt: CharAtt) = apply {
            charAtts =
                (charAtts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("charAtts", it).add(charAtt)
                }
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

        /** Distance for MUF calculation in km. */
        fun d(d: Double) = d(JsonField.of(d))

        /**
         * Sets [Builder.d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.d] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun d(d: JsonField<Double>) = apply { this.d = d }

        /** IRI profile shape parameter, F1 layer. URSI ID: D2. */
        fun d1(d1: Double) = d1(JsonField.of(d1))

        /**
         * Sets [Builder.d1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.d1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun d1(d1: JsonField<Double>) = apply { this.d1 = d1 }

        fun datum(datum: Datum) = datum(JsonField.of(datum))

        /**
         * Sets [Builder.datum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datum] with a well-typed [Datum] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun datum(datum: JsonField<Datum>) = apply { this.datum = datum }

        /** Adjustment to the scaled foF2 during profile inversion in MHz. */
        fun deltafoF2(deltafoF2: Double) = deltafoF2(JsonField.of(deltafoF2))

        /**
         * Sets [Builder.deltafoF2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deltafoF2] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deltafoF2(deltafoF2: JsonField<Double>) = apply { this.deltafoF2 = deltafoF2 }

        /** Profile of electron densities in the ionosphere associated with an IonoObservation. */
        fun densityProfile(densityProfile: DensityProfile) =
            densityProfile(JsonField.of(densityProfile))

        /**
         * Sets [Builder.densityProfile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.densityProfile] with a well-typed [DensityProfile] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun densityProfile(densityProfile: JsonField<DensityProfile>) = apply {
            this.densityProfile = densityProfile
        }

        fun doppler(doppler: Doppler) = doppler(JsonField.of(doppler))

        /**
         * Sets [Builder.doppler] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doppler] with a well-typed [Doppler] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun doppler(doppler: JsonField<Doppler>) = apply { this.doppler = doppler }

        /** Lowering of E trace to the leading edge in km. */
        fun downE(downE: Double) = downE(JsonField.of(downE))

        /**
         * Sets [Builder.downE] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downE] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun downE(downE: JsonField<Double>) = apply { this.downE = downE }

        /** Lowering of Es trace to the leading edge in km. */
        fun downEs(downEs: Double) = downEs(JsonField.of(downEs))

        /**
         * Sets [Builder.downEs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downEs] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun downEs(downEs: JsonField<Double>) = apply { this.downEs = downEs }

        /** Lowering of F trace to the leading edge in km. */
        fun downF(downF: Double) = downF(JsonField.of(downF))

        /**
         * Sets [Builder.downF] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downF] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun downF(downF: JsonField<Double>) = apply { this.downF = downF }

        /**
         * Array of electron densities in cm^-3 (must match the size of the height and
         * plasmaFrequency arrays).
         */
        fun electronDensity(electronDensity: List<Double>) =
            electronDensity(JsonField.of(electronDensity))

        /**
         * Sets [Builder.electronDensity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.electronDensity] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun electronDensity(electronDensity: JsonField<List<Double>>) = apply {
            this.electronDensity = electronDensity.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.electronDensity].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addElectronDensity(electronDensity: Double) = apply {
            this.electronDensity =
                (this.electronDensity ?: JsonField.of(mutableListOf())).also {
                    checkKnown("electronDensity", it).add(electronDensity)
                }
        }

        /**
         * Uncertainty in specifying the electron density at each height point of the profile (must
         * match the size of the electronDensity array).
         */
        fun electronDensityUncertainty(electronDensityUncertainty: List<Double>) =
            electronDensityUncertainty(JsonField.of(electronDensityUncertainty))

        /**
         * Sets [Builder.electronDensityUncertainty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.electronDensityUncertainty] with a well-typed
         * `List<Double>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun electronDensityUncertainty(electronDensityUncertainty: JsonField<List<Double>>) =
            apply {
                this.electronDensityUncertainty =
                    electronDensityUncertainty.map { it.toMutableList() }
            }

        /**
         * Adds a single [Double] to [Builder.electronDensityUncertainty].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addElectronDensityUncertainty(electronDensityUncertainty: Double) = apply {
            this.electronDensityUncertainty =
                (this.electronDensityUncertainty ?: JsonField.of(mutableListOf())).also {
                    checkKnown("electronDensityUncertainty", it).add(electronDensityUncertainty)
                }
        }

        fun elevation(elevation: Elevation) = elevation(JsonField.of(elevation))

        /**
         * Sets [Builder.elevation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevation] with a well-typed [Elevation] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun elevation(elevation: JsonField<Elevation>) = apply { this.elevation = elevation }

        /** The blanketing frequency of layer used to derive foEs in MHz. URSI ID: 32. */
        fun fbEs(fbEs: Double) = fbEs(JsonField.of(fbEs))

        /**
         * Sets [Builder.fbEs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fbEs] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fbEs(fbEs: JsonField<Double>) = apply { this.fbEs = fbEs }

        /** Frequency spread beyond foE in MHz. URSI ID: 87. */
        fun fe(fe: Double) = fe(JsonField.of(fe))

        /**
         * Sets [Builder.fe] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fe] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fe(fe: JsonField<Double>) = apply { this.fe = fe }

        /** Frequency spread between fxF2 and FxI in MHz. URSI ID: 86. */
        fun ff(ff: Double) = ff(JsonField.of(ff))

        /**
         * Sets [Builder.ff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ff] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ff(ff: JsonField<Double>) = apply { this.ff = ff }

        /** The frequency at which hprimeF is measured in MHz. URSI ID: 61. */
        fun fhprimeF(fhprimeF: Double) = fhprimeF(JsonField.of(fhprimeF))

        /**
         * Sets [Builder.fhprimeF] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fhprimeF] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fhprimeF(fhprimeF: JsonField<Double>) = apply { this.fhprimeF = fhprimeF }

        /** The frequency at which hprimeF2 is measured in MHz. URSI ID: 60. */
        fun fhprimeF2(fhprimeF2: Double) = fhprimeF2(JsonField.of(fhprimeF2))

        /**
         * Sets [Builder.fhprimeF2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fhprimeF2] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fhprimeF2(fhprimeF2: JsonField<Double>) = apply { this.fhprimeF2 = fhprimeF2 }

        /**
         * Lowest frequency at which echo traces are observed on the ionogram, in MHz. URSI ID: 42.
         */
        fun fmin(fmin: Double) = fmin(JsonField.of(fmin))

        /**
         * Sets [Builder.fmin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fmin] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fmin(fmin: JsonField<Double>) = apply { this.fmin = fmin }

        /** Minimum frequency of E layer echoes in MHz. URSI ID: 81. */
        fun fminE(fminE: Double) = fminE(JsonField.of(fminE))

        /**
         * Sets [Builder.fminE] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fminE] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fminE(fminE: JsonField<Double>) = apply { this.fminE = fminE }

        /** Minimum frequency of Es layer in MHz. */
        fun fminEs(fminEs: Double) = fminEs(JsonField.of(fminEs))

        /**
         * Sets [Builder.fminEs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fminEs] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fminEs(fminEs: JsonField<Double>) = apply { this.fminEs = fminEs }

        /** Minimum frequency of F layer echoes in MHz. URSI ID: 80. */
        fun fminF(fminF: Double) = fminF(JsonField.of(fminF))

        /**
         * Sets [Builder.fminF] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fminF] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fminF(fminF: JsonField<Double>) = apply { this.fminF = fminF }

        /** MUF/OblFactor in MHz. */
        fun fmuf(fmuf: Double) = fmuf(JsonField.of(fmuf))

        /**
         * Sets [Builder.fmuf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fmuf] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fmuf(fmuf: JsonField<Double>) = apply { this.fmuf = fmuf }

        /**
         * The ordinary wave critical frequency of the lowest thick layer which causes a
         * discontinuity, in MHz. URSI ID: 20.
         */
        fun foE(foE: Double) = foE(JsonField.of(foE))

        /**
         * Sets [Builder.foE] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foE] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun foE(foE: JsonField<Double>) = apply { this.foE = foE }

        /** Critical frequency of night time auroral E layer in MHz. URSI ID: 23. */
        fun foEa(foEa: Double) = foEa(JsonField.of(foEa))

        /**
         * Sets [Builder.foEa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foEa] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun foEa(foEa: JsonField<Double>) = apply { this.foEa = foEa }

        /** Predicted value of foE in MHz. */
        fun foEp(foEp: Double) = foEp(JsonField.of(foEp))

        /**
         * Sets [Builder.foEp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foEp] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun foEp(foEp: JsonField<Double>) = apply { this.foEp = foEp }

        /**
         * Highest ordinary wave frequency at which a mainly continuous Es trace is observed, in
         * MHz. URSI ID: 30.
         */
        fun foEs(foEs: Double) = foEs(JsonField.of(foEs))

        /**
         * Sets [Builder.foEs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foEs] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun foEs(foEs: JsonField<Double>) = apply { this.foEs = foEs }

        /** The ordinary wave F1 critical frequency, in MHz. URSI ID: 10. */
        fun foF1(foF1: Double) = foF1(JsonField.of(foF1))

        /**
         * Sets [Builder.foF1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foF1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun foF1(foF1: JsonField<Double>) = apply { this.foF1 = foF1 }

        /** Predicted value of foF1 in MHz. */
        fun foF1p(foF1p: Double) = foF1p(JsonField.of(foF1p))

        /**
         * Sets [Builder.foF1p] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foF1p] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun foF1p(foF1p: JsonField<Double>) = apply { this.foF1p = foF1p }

        /**
         * The ordinary wave critical frequency of the highest stratification in the F region,
         * specified in MHz. URSI ID: 00.
         */
        fun foF2(foF2: Double) = foF2(JsonField.of(foF2))

        /**
         * Sets [Builder.foF2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foF2] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun foF2(foF2: JsonField<Double>) = apply { this.foF2 = foF2 }

        /** Predicted value of foF2 in MHz. */
        fun foF2p(foF2p: Double) = foF2p(JsonField.of(foF2p))

        /**
         * Sets [Builder.foF2p] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foF2p] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun foF2p(foF2p: JsonField<Double>) = apply { this.foF2p = foF2p }

        /** Highest ordinary wave critical frequency of F region patch trace in MHz. URSI ID: 55. */
        fun foP(foP: Double) = foP(JsonField.of(foP))

        /**
         * Sets [Builder.foP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun foP(foP: JsonField<Double>) = apply { this.foP = foP }

        fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [Frequency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun frequency(frequency: JsonField<Frequency>) = apply { this.frequency = frequency }

        /** The extraordinary wave E critical frequency, in MHz. URSI ID: 21. */
        fun fxE(fxE: Double) = fxE(JsonField.of(fxE))

        /**
         * Sets [Builder.fxE] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fxE] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fxE(fxE: JsonField<Double>) = apply { this.fxE = fxE }

        /** The extraordinary wave F1 critical frequency, in MHz. URSI ID: 11. */
        fun fxF1(fxF1: Double) = fxF1(JsonField.of(fxF1))

        /**
         * Sets [Builder.fxF1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fxF1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fxF1(fxF1: JsonField<Double>) = apply { this.fxF1 = fxF1 }

        /** The extraordinary wave F2 critical frequency, in MHz. URSI ID: 01. */
        fun fxF2(fxF2: Double) = fxF2(JsonField.of(fxF2))

        /**
         * Sets [Builder.fxF2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fxF2] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fxF2(fxF2: JsonField<Double>) = apply { this.fxF2 = fxF2 }

        /** The highest frequency of F-trace in MHz. Note: fxI is with capital i. URSI ID: 51. */
        fun fxI(fxI: Double) = fxI(JsonField.of(fxI))

        /**
         * Sets [Builder.fxI] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fxI] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fxI(fxI: JsonField<Double>) = apply { this.fxI = fxI }

        /**
         * Array of altitudes above station level for plasma frequency/density arrays in km (must
         * match the size of the plasmaFrequency and electronDensity Arrays).
         */
        fun height(height: List<Double>) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun height(height: JsonField<List<Double>>) = apply {
            this.height = height.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.height].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHeight(height: Double) = apply {
            this.height =
                (this.height ?: JsonField.of(mutableListOf())).also {
                    checkKnown("height", it).add(height)
                }
        }

        /** True height of the E peak in km. URSI ID: CE. */
        fun hmE(hmE: Double) = hmE(JsonField.of(hmE))

        /**
         * Sets [Builder.hmE] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hmE] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hmE(hmE: JsonField<Double>) = apply { this.hmE = hmE }

        /** True height of the F1 peak in km. URSI ID: BE. */
        fun hmF1(hmF1: Double) = hmF1(JsonField.of(hmF1))

        /**
         * Sets [Builder.hmF1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hmF1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hmF1(hmF1: JsonField<Double>) = apply { this.hmF1 = hmF1 }

        /** True height of the F2 peak in km. URSI ID: AE. */
        fun hmF2(hmF2: Double) = hmF2(JsonField.of(hmF2))

        /**
         * Sets [Builder.hmF2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hmF2] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hmF2(hmF2: JsonField<Double>) = apply { this.hmF2 = hmF2 }

        /** The minimum virtual height of the normal E layer trace in km. URSI ID: 24. */
        fun hprimeE(hprimeE: Double) = hprimeE(JsonField.of(hprimeE))

        /**
         * Sets [Builder.hprimeE] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hprimeE] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hprimeE(hprimeE: JsonField<Double>) = apply { this.hprimeE = hprimeE }

        /** Minimum virtual height of night time auroral E layer trace in km. URSI ID: 27. */
        fun hprimeEa(hprimeEa: Double) = hprimeEa(JsonField.of(hprimeEa))

        /**
         * Sets [Builder.hprimeEa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hprimeEa] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hprimeEa(hprimeEa: JsonField<Double>) = apply { this.hprimeEa = hprimeEa }

        /** The minimum height of the trace used to give foEs in km. URSI ID: 34. */
        fun hprimeEs(hprimeEs: Double) = hprimeEs(JsonField.of(hprimeEs))

        /**
         * Sets [Builder.hprimeEs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hprimeEs] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hprimeEs(hprimeEs: JsonField<Double>) = apply { this.hprimeEs = hprimeEs }

        /**
         * The minimum virtual height of the ordinary wave trace taken as a whole, in km. URSI
         * ID: 16.
         */
        fun hprimeF(hprimeF: Double) = hprimeF(JsonField.of(hprimeF))

        /**
         * Sets [Builder.hprimeF] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hprimeF] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hprimeF(hprimeF: JsonField<Double>) = apply { this.hprimeF = hprimeF }

        /**
         * The minimum virtual height of reflection at a point where the trace is horizontal in the
         * F region in km. URSI ID: 14.
         */
        fun hprimeF1(hprimeF1: Double) = hprimeF1(JsonField.of(hprimeF1))

        /**
         * Sets [Builder.hprimeF1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hprimeF1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hprimeF1(hprimeF1: JsonField<Double>) = apply { this.hprimeF1 = hprimeF1 }

        /**
         * The minimum virtual height of ordinary wave trace for the highest stable stratification
         * in the F region in km. URSI ID: 4.
         */
        fun hprimeF2(hprimeF2: Double) = hprimeF2(JsonField.of(hprimeF2))

        /**
         * Sets [Builder.hprimeF2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hprimeF2] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hprimeF2(hprimeF2: JsonField<Double>) = apply { this.hprimeF2 = hprimeF2 }

        /** Virtual height at MUF/OblFactor frequency in MHz. */
        fun hprimefMuf(hprimefMuf: Double) = hprimefMuf(JsonField.of(hprimefMuf))

        /**
         * Sets [Builder.hprimefMuf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hprimefMuf] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hprimefMuf(hprimefMuf: JsonField<Double>) = apply { this.hprimefMuf = hprimefMuf }

        /** Minimum virtual height of the trace used to determine foP in km. URSI ID: 56. */
        fun hprimeP(hprimeP: Double) = hprimeP(JsonField.of(hprimeP))

        /**
         * Sets [Builder.hprimeP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hprimeP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hprimeP(hprimeP: JsonField<Double>) = apply { this.hprimeP = hprimeP }

        /** Unique identifier of the reporting sensor. */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

        /** Lowest usable frequency. */
        fun luf(luf: Double) = luf(JsonField.of(luf))

        /**
         * Sets [Builder.luf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.luf] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun luf(luf: JsonField<Double>) = apply { this.luf = luf }

        /** MUF(D)/foF2. */
        fun md(md: Double) = md(JsonField.of(md))

        /**
         * Sets [Builder.md] to an arbitrary JSON value.
         *
         * You should usually call [Builder.md] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun md(md: JsonField<Double>) = apply { this.md = md }

        /** Maximum Usable Frequency for ground distance D in MHz. */
        fun mufd(mufd: Double) = mufd(JsonField.of(mufd))

        /**
         * Sets [Builder.mufd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mufd] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mufd(mufd: JsonField<Double>) = apply { this.mufd = mufd }

        /** Name of the algorithm used for the electron density profile. */
        fun neProfileName(neProfileName: String) = neProfileName(JsonField.of(neProfileName))

        /**
         * Sets [Builder.neProfileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.neProfileName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun neProfileName(neProfileName: JsonField<String>) = apply {
            this.neProfileName = neProfileName
        }

        /** Version of the algorithm used for the electron density profile. */
        fun neProfileVersion(neProfileVersion: Double) =
            neProfileVersion(JsonField.of(neProfileVersion))

        /**
         * Sets [Builder.neProfileVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.neProfileVersion] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun neProfileVersion(neProfileVersion: JsonField<Double>) = apply {
            this.neProfileVersion = neProfileVersion
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

        fun phase(phase: Phase) = phase(JsonField.of(phase))

        /**
         * Sets [Builder.phase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phase] with a well-typed [Phase] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phase(phase: JsonField<Phase>) = apply { this.phase = phase }

        /**
         * Array of plasma frequencies in MHz (must match the size of the height and electronDensity
         * arrays).
         */
        fun plasmaFrequency(plasmaFrequency: List<Double>) =
            plasmaFrequency(JsonField.of(plasmaFrequency))

        /**
         * Sets [Builder.plasmaFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plasmaFrequency] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun plasmaFrequency(plasmaFrequency: JsonField<List<Double>>) = apply {
            this.plasmaFrequency = plasmaFrequency.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.plasmaFrequency].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPlasmaFrequency(plasmaFrequency: Double) = apply {
            this.plasmaFrequency =
                (this.plasmaFrequency ?: JsonField.of(mutableListOf())).also {
                    checkKnown("plasmaFrequency", it).add(plasmaFrequency)
                }
        }

        /**
         * Uncertainty in specifying the electron plasma frequency at each height point of the
         * profile (must match the size of the plasmaFrequency array).
         */
        fun plasmaFrequencyUncertainty(plasmaFrequencyUncertainty: List<Double>) =
            plasmaFrequencyUncertainty(JsonField.of(plasmaFrequencyUncertainty))

        /**
         * Sets [Builder.plasmaFrequencyUncertainty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plasmaFrequencyUncertainty] with a well-typed
         * `List<Double>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun plasmaFrequencyUncertainty(plasmaFrequencyUncertainty: JsonField<List<Double>>) =
            apply {
                this.plasmaFrequencyUncertainty =
                    plasmaFrequencyUncertainty.map { it.toMutableList() }
            }

        /**
         * Adds a single [Double] to [Builder.plasmaFrequencyUncertainty].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPlasmaFrequencyUncertainty(plasmaFrequencyUncertainty: Double) = apply {
            this.plasmaFrequencyUncertainty =
                (this.plasmaFrequencyUncertainty ?: JsonField.of(mutableListOf())).also {
                    checkKnown("plasmaFrequencyUncertainty", it).add(plasmaFrequencyUncertainty)
                }
        }

        /** Equipment location. */
        fun platformName(platformName: String) = platformName(JsonField.of(platformName))

        /**
         * Sets [Builder.platformName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun platformName(platformName: JsonField<String>) = apply {
            this.platformName = platformName
        }

        fun polarization(polarization: Polarization) = polarization(JsonField.of(polarization))

        /**
         * Sets [Builder.polarization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarization] with a well-typed [Polarization] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun polarization(polarization: JsonField<Polarization>) = apply {
            this.polarization = polarization
        }

        fun power(power: Power) = power(JsonField.of(power))

        /**
         * Sets [Builder.power] to an arbitrary JSON value.
         *
         * You should usually call [Builder.power] with a well-typed [Power] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun power(power: JsonField<Power>) = apply { this.power = power }

        /** Average range spread of E layer in km. URSI ID: 85. */
        fun qe(qe: Double) = qe(JsonField.of(qe))

        /**
         * Sets [Builder.qe] to an arbitrary JSON value.
         *
         * You should usually call [Builder.qe] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun qe(qe: JsonField<Double>) = apply { this.qe = qe }

        /** Average range spread of F layer in km. URSI ID: 84. */
        fun qf(qf: Double) = qf(JsonField.of(qf))

        /**
         * Sets [Builder.qf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.qf] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun qf(qf: JsonField<Double>) = apply { this.qf = qf }

        fun range(range: Range) = range(JsonField.of(range))

        /**
         * Sets [Builder.range] to an arbitrary JSON value.
         *
         * You should usually call [Builder.range] with a well-typed [Range] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun range(range: JsonField<Range>) = apply { this.range = range }

        /**
         * List of Geodetic Latitude, Longitude, and Altitude coordinates in km of the receiver.
         * Coordinates List must always have 3 elements. Valid ranges are -90.0 to 90.0 for Latitude
         * and -180.0 to 180.0 for Longitude. Altitude is in km and its value must be 0 or greater.
         */
        fun receiveCoordinates(receiveCoordinates: List<List<Double>>) =
            receiveCoordinates(JsonField.of(receiveCoordinates))

        /**
         * Sets [Builder.receiveCoordinates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiveCoordinates] with a well-typed
         * `List<List<Double>>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun receiveCoordinates(receiveCoordinates: JsonField<List<List<Double>>>) = apply {
            this.receiveCoordinates = receiveCoordinates.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<Double>] to [receiveCoordinates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReceiveCoordinate(receiveCoordinate: List<Double>) = apply {
            receiveCoordinates =
                (receiveCoordinates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("receiveCoordinates", it).add(receiveCoordinate)
                }
        }

        /** Enums: Mobile, Static. */
        fun receiveSensorType(receiveSensorType: ReceiveSensorType) =
            receiveSensorType(JsonField.of(receiveSensorType))

        /**
         * Sets [Builder.receiveSensorType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiveSensorType] with a well-typed [ReceiveSensorType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun receiveSensorType(receiveSensorType: JsonField<ReceiveSensorType>) = apply {
            this.receiveSensorType = receiveSensorType
        }

        /** Array of restricted frequencies. */
        fun restrictedFrequency(restrictedFrequency: List<Double>) =
            restrictedFrequency(JsonField.of(restrictedFrequency))

        /**
         * Sets [Builder.restrictedFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restrictedFrequency] with a well-typed `List<Double>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun restrictedFrequency(restrictedFrequency: JsonField<List<Double>>) = apply {
            this.restrictedFrequency = restrictedFrequency.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.restrictedFrequency].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRestrictedFrequency(restrictedFrequency: Double) = apply {
            this.restrictedFrequency =
                (this.restrictedFrequency ?: JsonField.of(mutableListOf())).also {
                    checkKnown("restrictedFrequency", it).add(restrictedFrequency)
                }
        }

        /** Notes for the restrictedFrequency data. */
        fun restrictedFrequencyNotes(restrictedFrequencyNotes: String) =
            restrictedFrequencyNotes(JsonField.of(restrictedFrequencyNotes))

        /**
         * Sets [Builder.restrictedFrequencyNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restrictedFrequencyNotes] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun restrictedFrequencyNotes(restrictedFrequencyNotes: JsonField<String>) = apply {
            this.restrictedFrequencyNotes = restrictedFrequencyNotes
        }

        /** Effective scale height at hmF2 Titheridge method in km. URSI ID: 69. */
        fun scaleHeightF2Peak(scaleHeightF2Peak: Double) =
            scaleHeightF2Peak(JsonField.of(scaleHeightF2Peak))

        /**
         * Sets [Builder.scaleHeightF2Peak] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scaleHeightF2Peak] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scaleHeightF2Peak(scaleHeightF2Peak: JsonField<Double>) = apply {
            this.scaleHeightF2Peak = scaleHeightF2Peak
        }

        /**
         * The ScalerInfo record describes the person or system who interpreted the ionogram in
         * IonoObservation.
         */
        fun scalerInfo(scalerInfo: ScalerInfo) = scalerInfo(JsonField.of(scalerInfo))

        /**
         * Sets [Builder.scalerInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scalerInfo] with a well-typed [ScalerInfo] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scalerInfo(scalerInfo: JsonField<ScalerInfo>) = apply { this.scalerInfo = scalerInfo }

        fun stokes(stokes: Stokes) = stokes(JsonField.of(stokes))

        /**
         * Sets [Builder.stokes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stokes] with a well-typed [Stokes] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stokes(stokes: JsonField<Stokes>) = apply { this.stokes = stokes }

        /**
         * Details concerning the composition/intention/interpretation/audience/etc. of any data
         * recorded here. This field may contain all of the intended information e.g. info on signal
         * waveforms used, antenna setup, etc. OR may describe the data/settings to be provided in
         * the “data” field.
         */
        fun systemNotes(systemNotes: String) = systemNotes(JsonField.of(systemNotes))

        /**
         * Sets [Builder.systemNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun systemNotes(systemNotes: JsonField<String>) = apply { this.systemNotes = systemNotes }

        /**
         * Total Ionospheric Electron Content *10^16e/m^2. 1 TEC Unit (TECU) = 10^16 electrons/m^2.
         * URSI ID: 72.
         */
        fun tec(tec: Double) = tec(JsonField.of(tec))

        /**
         * Sets [Builder.tec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tec] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tec(tec: JsonField<Double>) = apply { this.tec = tec }

        /** Array of degrees clockwise from true North of the TID. */
        fun tidAzimuth(tidAzimuth: List<Double>) = tidAzimuth(JsonField.of(tidAzimuth))

        /**
         * Sets [Builder.tidAzimuth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tidAzimuth] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tidAzimuth(tidAzimuth: JsonField<List<Double>>) = apply {
            this.tidAzimuth = tidAzimuth.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.tidAzimuth].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTidAzimuth(tidAzimuth: Double) = apply {
            this.tidAzimuth =
                (this.tidAzimuth ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tidAzimuth", it).add(tidAzimuth)
                }
        }

        /** Array of 1/frequency of the TID wave. */
        fun tidPeriods(tidPeriods: List<Double>) = tidPeriods(JsonField.of(tidPeriods))

        /**
         * Sets [Builder.tidPeriods] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tidPeriods] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tidPeriods(tidPeriods: JsonField<List<Double>>) = apply {
            this.tidPeriods = tidPeriods.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [tidPeriods].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTidPeriod(tidPeriod: Double) = apply {
            tidPeriods =
                (tidPeriods ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tidPeriods", it).add(tidPeriod)
                }
        }

        /** Array of speed in m/s at which the disturbance travels through the ionosphere. */
        fun tidPhaseSpeeds(tidPhaseSpeeds: List<Double>) =
            tidPhaseSpeeds(JsonField.of(tidPhaseSpeeds))

        /**
         * Sets [Builder.tidPhaseSpeeds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tidPhaseSpeeds] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tidPhaseSpeeds(tidPhaseSpeeds: JsonField<List<Double>>) = apply {
            this.tidPhaseSpeeds = tidPhaseSpeeds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [tidPhaseSpeeds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTidPhaseSpeed(tidPhaseSpeed: Double) = apply {
            tidPhaseSpeeds =
                (tidPhaseSpeeds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tidPhaseSpeeds", it).add(tidPhaseSpeed)
                }
        }

        fun time(time: Time) = time(JsonField.of(time))

        /**
         * Sets [Builder.time] to an arbitrary JSON value.
         *
         * You should usually call [Builder.time] with a well-typed [Time] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun time(time: JsonField<Time>) = apply { this.time = time }

        fun traceGeneric(traceGeneric: TraceGeneric) = traceGeneric(JsonField.of(traceGeneric))

        /**
         * Sets [Builder.traceGeneric] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceGeneric] with a well-typed [TraceGeneric] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun traceGeneric(traceGeneric: JsonField<TraceGeneric>) = apply {
            this.traceGeneric = traceGeneric
        }

        /**
         * List of Geodetic Latitude, Longitude, and Altitude coordinates in km of the receiver.
         * Coordinates List must always have 3 elements. Valid ranges are -90.0 to 90.0 for Latitude
         * and -180.0 to 180.0 for Longitude. Altitude is in km and its value must be 0 or greater.
         */
        fun transmitCoordinates(transmitCoordinates: List<List<Double>>) =
            transmitCoordinates(JsonField.of(transmitCoordinates))

        /**
         * Sets [Builder.transmitCoordinates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transmitCoordinates] with a well-typed
         * `List<List<Double>>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun transmitCoordinates(transmitCoordinates: JsonField<List<List<Double>>>) = apply {
            this.transmitCoordinates = transmitCoordinates.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<Double>] to [transmitCoordinates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTransmitCoordinate(transmitCoordinate: List<Double>) = apply {
            transmitCoordinates =
                (transmitCoordinates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("transmitCoordinates", it).add(transmitCoordinate)
                }
        }

        /** Enums: Mobile, Static. */
        fun transmitSensorType(transmitSensorType: TransmitSensorType) =
            transmitSensorType(JsonField.of(transmitSensorType))

        /**
         * Sets [Builder.transmitSensorType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transmitSensorType] with a well-typed
         * [TransmitSensorType] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun transmitSensorType(transmitSensorType: JsonField<TransmitSensorType>) = apply {
            this.transmitSensorType = transmitSensorType
        }

        /** Characterization of the shape of Es trace. URSI ID: 36. */
        fun typeEs(typeEs: String) = typeEs(JsonField.of(typeEs))

        /**
         * Sets [Builder.typeEs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.typeEs] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun typeEs(typeEs: JsonField<String>) = apply { this.typeEs = typeEs }

        /**
         * Time the row was updated in the database, auto-populated by the system, example =
         * 2018-01-01T16:00:00.123Z.
         */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Application user who updated the row in the database, auto-populated by the system. */
        fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

        /** Parabolic E layer semi-thickness in km. URSI ID: 83. */
        fun yE(yE: Double) = yE(JsonField.of(yE))

        /**
         * Sets [Builder.yE] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yE] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yE(yE: JsonField<Double>) = apply { this.yE = yE }

        /** Parabolic F1 layer semi-thickness in km. URSI ID: 95. */
        fun yF1(yF1: Double) = yF1(JsonField.of(yF1))

        /**
         * Sets [Builder.yF1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yF1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yF1(yF1: JsonField<Double>) = apply { this.yF1 = yF1 }

        /** Parabolic F2 layer semi-thickness in km. URSI ID: 94. */
        fun yF2(yF2: Double) = yF2(JsonField.of(yF2))

        /**
         * Sets [Builder.yF2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yF2] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yF2(yF2: JsonField<Double>) = apply { this.yF2 = yF2 }

        /** True height at half peak electron density in the F2 layer in km. URSI ID: 93. */
        fun zhalfNm(zhalfNm: Double) = zhalfNm(JsonField.of(zhalfNm))

        /**
         * Sets [Builder.zhalfNm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zhalfNm] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zhalfNm(zhalfNm: JsonField<Double>) = apply { this.zhalfNm = zhalfNm }

        /** Peak height of E-layer in km. URSI ID: 90. */
        fun zmE(zmE: Double) = zmE(JsonField.of(zmE))

        /**
         * Sets [Builder.zmE] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zmE] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zmE(zmE: JsonField<Double>) = apply { this.zmE = zmE }

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
         * Returns an immutable instance of [IonoObservationTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .startTimeUtc()
         * .stationId()
         * .system()
         * .systemInfo()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IonoObservationTupleResponse =
            IonoObservationTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                checkRequired("startTimeUtc", startTimeUtc),
                checkRequired("stationId", stationId),
                checkRequired("system", system),
                checkRequired("systemInfo", systemInfo),
                id,
                amplitude,
                antennaElementPosition,
                antennaElementPositionCoordinateSystem,
                (artistFlags ?: JsonMissing.of()).map { it.toImmutable() },
                azimuth,
                b0,
                b1,
                (charAtts ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                createdBy,
                d,
                d1,
                datum,
                deltafoF2,
                densityProfile,
                doppler,
                downE,
                downEs,
                downF,
                (electronDensity ?: JsonMissing.of()).map { it.toImmutable() },
                (electronDensityUncertainty ?: JsonMissing.of()).map { it.toImmutable() },
                elevation,
                fbEs,
                fe,
                ff,
                fhprimeF,
                fhprimeF2,
                fmin,
                fminE,
                fminEs,
                fminF,
                fmuf,
                foE,
                foEa,
                foEp,
                foEs,
                foF1,
                foF1p,
                foF2,
                foF2p,
                foP,
                frequency,
                fxE,
                fxF1,
                fxF2,
                fxI,
                (height ?: JsonMissing.of()).map { it.toImmutable() },
                hmE,
                hmF1,
                hmF2,
                hprimeE,
                hprimeEa,
                hprimeEs,
                hprimeF,
                hprimeF1,
                hprimeF2,
                hprimefMuf,
                hprimeP,
                idSensor,
                luf,
                md,
                mufd,
                neProfileName,
                neProfileVersion,
                origin,
                origNetwork,
                origSensorId,
                phase,
                (plasmaFrequency ?: JsonMissing.of()).map { it.toImmutable() },
                (plasmaFrequencyUncertainty ?: JsonMissing.of()).map { it.toImmutable() },
                platformName,
                polarization,
                power,
                qe,
                qf,
                range,
                (receiveCoordinates ?: JsonMissing.of()).map { it.toImmutable() },
                receiveSensorType,
                (restrictedFrequency ?: JsonMissing.of()).map { it.toImmutable() },
                restrictedFrequencyNotes,
                scaleHeightF2Peak,
                scalerInfo,
                stokes,
                systemNotes,
                tec,
                (tidAzimuth ?: JsonMissing.of()).map { it.toImmutable() },
                (tidPeriods ?: JsonMissing.of()).map { it.toImmutable() },
                (tidPhaseSpeeds ?: JsonMissing.of()).map { it.toImmutable() },
                time,
                traceGeneric,
                (transmitCoordinates ?: JsonMissing.of()).map { it.toImmutable() },
                transmitSensorType,
                typeEs,
                updatedAt,
                updatedBy,
                yE,
                yF1,
                yF2,
                zhalfNm,
                zmE,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IonoObservationTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        startTimeUtc()
        stationId()
        system()
        systemInfo()
        id()
        amplitude().ifPresent { it.validate() }
        antennaElementPosition().ifPresent { it.validate() }
        antennaElementPositionCoordinateSystem().ifPresent { it.validate() }
        artistFlags()
        azimuth().ifPresent { it.validate() }
        b0()
        b1()
        charAtts().ifPresent { it.forEach { it.validate() } }
        createdAt()
        createdBy()
        d()
        d1()
        datum().ifPresent { it.validate() }
        deltafoF2()
        densityProfile().ifPresent { it.validate() }
        doppler().ifPresent { it.validate() }
        downE()
        downEs()
        downF()
        electronDensity()
        electronDensityUncertainty()
        elevation().ifPresent { it.validate() }
        fbEs()
        fe()
        ff()
        fhprimeF()
        fhprimeF2()
        fmin()
        fminE()
        fminEs()
        fminF()
        fmuf()
        foE()
        foEa()
        foEp()
        foEs()
        foF1()
        foF1p()
        foF2()
        foF2p()
        foP()
        frequency().ifPresent { it.validate() }
        fxE()
        fxF1()
        fxF2()
        fxI()
        height()
        hmE()
        hmF1()
        hmF2()
        hprimeE()
        hprimeEa()
        hprimeEs()
        hprimeF()
        hprimeF1()
        hprimeF2()
        hprimefMuf()
        hprimeP()
        idSensor()
        luf()
        md()
        mufd()
        neProfileName()
        neProfileVersion()
        origin()
        origNetwork()
        origSensorId()
        phase().ifPresent { it.validate() }
        plasmaFrequency()
        plasmaFrequencyUncertainty()
        platformName()
        polarization().ifPresent { it.validate() }
        power().ifPresent { it.validate() }
        qe()
        qf()
        range().ifPresent { it.validate() }
        receiveCoordinates()
        receiveSensorType().ifPresent { it.validate() }
        restrictedFrequency()
        restrictedFrequencyNotes()
        scaleHeightF2Peak()
        scalerInfo().ifPresent { it.validate() }
        stokes().ifPresent { it.validate() }
        systemNotes()
        tec()
        tidAzimuth()
        tidPeriods()
        tidPhaseSpeeds()
        time().ifPresent { it.validate() }
        traceGeneric().ifPresent { it.validate() }
        transmitCoordinates()
        transmitSensorType().ifPresent { it.validate() }
        typeEs()
        updatedAt()
        updatedBy()
        yE()
        yF1()
        yF2()
        zhalfNm()
        zmE()
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
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startTimeUtc.asKnown().isPresent) 1 else 0) +
            (if (stationId.asKnown().isPresent) 1 else 0) +
            (if (system.asKnown().isPresent) 1 else 0) +
            (if (systemInfo.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (amplitude.asKnown().getOrNull()?.validity() ?: 0) +
            (antennaElementPosition.asKnown().getOrNull()?.validity() ?: 0) +
            (antennaElementPositionCoordinateSystem.asKnown().getOrNull()?.validity() ?: 0) +
            (artistFlags.asKnown().getOrNull()?.size ?: 0) +
            (azimuth.asKnown().getOrNull()?.validity() ?: 0) +
            (if (b0.asKnown().isPresent) 1 else 0) +
            (if (b1.asKnown().isPresent) 1 else 0) +
            (charAtts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (d.asKnown().isPresent) 1 else 0) +
            (if (d1.asKnown().isPresent) 1 else 0) +
            (datum.asKnown().getOrNull()?.validity() ?: 0) +
            (if (deltafoF2.asKnown().isPresent) 1 else 0) +
            (densityProfile.asKnown().getOrNull()?.validity() ?: 0) +
            (doppler.asKnown().getOrNull()?.validity() ?: 0) +
            (if (downE.asKnown().isPresent) 1 else 0) +
            (if (downEs.asKnown().isPresent) 1 else 0) +
            (if (downF.asKnown().isPresent) 1 else 0) +
            (electronDensity.asKnown().getOrNull()?.size ?: 0) +
            (electronDensityUncertainty.asKnown().getOrNull()?.size ?: 0) +
            (elevation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fbEs.asKnown().isPresent) 1 else 0) +
            (if (fe.asKnown().isPresent) 1 else 0) +
            (if (ff.asKnown().isPresent) 1 else 0) +
            (if (fhprimeF.asKnown().isPresent) 1 else 0) +
            (if (fhprimeF2.asKnown().isPresent) 1 else 0) +
            (if (fmin.asKnown().isPresent) 1 else 0) +
            (if (fminE.asKnown().isPresent) 1 else 0) +
            (if (fminEs.asKnown().isPresent) 1 else 0) +
            (if (fminF.asKnown().isPresent) 1 else 0) +
            (if (fmuf.asKnown().isPresent) 1 else 0) +
            (if (foE.asKnown().isPresent) 1 else 0) +
            (if (foEa.asKnown().isPresent) 1 else 0) +
            (if (foEp.asKnown().isPresent) 1 else 0) +
            (if (foEs.asKnown().isPresent) 1 else 0) +
            (if (foF1.asKnown().isPresent) 1 else 0) +
            (if (foF1p.asKnown().isPresent) 1 else 0) +
            (if (foF2.asKnown().isPresent) 1 else 0) +
            (if (foF2p.asKnown().isPresent) 1 else 0) +
            (if (foP.asKnown().isPresent) 1 else 0) +
            (frequency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fxE.asKnown().isPresent) 1 else 0) +
            (if (fxF1.asKnown().isPresent) 1 else 0) +
            (if (fxF2.asKnown().isPresent) 1 else 0) +
            (if (fxI.asKnown().isPresent) 1 else 0) +
            (height.asKnown().getOrNull()?.size ?: 0) +
            (if (hmE.asKnown().isPresent) 1 else 0) +
            (if (hmF1.asKnown().isPresent) 1 else 0) +
            (if (hmF2.asKnown().isPresent) 1 else 0) +
            (if (hprimeE.asKnown().isPresent) 1 else 0) +
            (if (hprimeEa.asKnown().isPresent) 1 else 0) +
            (if (hprimeEs.asKnown().isPresent) 1 else 0) +
            (if (hprimeF.asKnown().isPresent) 1 else 0) +
            (if (hprimeF1.asKnown().isPresent) 1 else 0) +
            (if (hprimeF2.asKnown().isPresent) 1 else 0) +
            (if (hprimefMuf.asKnown().isPresent) 1 else 0) +
            (if (hprimeP.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (luf.asKnown().isPresent) 1 else 0) +
            (if (md.asKnown().isPresent) 1 else 0) +
            (if (mufd.asKnown().isPresent) 1 else 0) +
            (if (neProfileName.asKnown().isPresent) 1 else 0) +
            (if (neProfileVersion.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (phase.asKnown().getOrNull()?.validity() ?: 0) +
            (plasmaFrequency.asKnown().getOrNull()?.size ?: 0) +
            (plasmaFrequencyUncertainty.asKnown().getOrNull()?.size ?: 0) +
            (if (platformName.asKnown().isPresent) 1 else 0) +
            (polarization.asKnown().getOrNull()?.validity() ?: 0) +
            (power.asKnown().getOrNull()?.validity() ?: 0) +
            (if (qe.asKnown().isPresent) 1 else 0) +
            (if (qf.asKnown().isPresent) 1 else 0) +
            (range.asKnown().getOrNull()?.validity() ?: 0) +
            (receiveCoordinates.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
            (receiveSensorType.asKnown().getOrNull()?.validity() ?: 0) +
            (restrictedFrequency.asKnown().getOrNull()?.size ?: 0) +
            (if (restrictedFrequencyNotes.asKnown().isPresent) 1 else 0) +
            (if (scaleHeightF2Peak.asKnown().isPresent) 1 else 0) +
            (scalerInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (stokes.asKnown().getOrNull()?.validity() ?: 0) +
            (if (systemNotes.asKnown().isPresent) 1 else 0) +
            (if (tec.asKnown().isPresent) 1 else 0) +
            (tidAzimuth.asKnown().getOrNull()?.size ?: 0) +
            (tidPeriods.asKnown().getOrNull()?.size ?: 0) +
            (tidPhaseSpeeds.asKnown().getOrNull()?.size ?: 0) +
            (time.asKnown().getOrNull()?.validity() ?: 0) +
            (traceGeneric.asKnown().getOrNull()?.validity() ?: 0) +
            (transmitCoordinates.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
            (transmitSensorType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (typeEs.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (yE.asKnown().isPresent) 1 else 0) +
            (if (yF1.asKnown().isPresent) 1 else 0) +
            (if (yF2.asKnown().isPresent) 1 else 0) +
            (if (zhalfNm.asKnown().isPresent) 1 else 0) +
            (if (zmE.asKnown().isPresent) 1 else 0)

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

    class Amplitude
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>,
        private val dimensionName: JsonField<List<String>>,
        private val dimensions: JsonField<List<Int>>,
        private val notes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = JsonMissing.of(),
            @JsonProperty("dimensionName")
            @ExcludeMissing
            dimensionName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        ) : this(data, dimensionName, dimensions, notes, mutableMapOf())

        /**
         * Array of amplitude data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data(): Optional<List<List<List<List<List<List<List<Double>>>>>>>> =
            data.getOptional("data")

        /**
         * Array of names for dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensionName(): Optional<List<String>> = dimensionName.getOptional("dimensionName")

        /**
         * Array of integers for amplitude dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensions(): Optional<List<Int>> = dimensions.getOptional("dimensions")

        /**
         * Notes for the amplitude data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun _data(): JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = data

        /**
         * Returns the raw JSON value of [dimensionName].
         *
         * Unlike [dimensionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionName")
        @ExcludeMissing
        fun _dimensionName(): JsonField<List<String>> = dimensionName

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<List<Int>> = dimensions

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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

            /** Returns a mutable builder for constructing an instance of [Amplitude]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Amplitude]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<List<List<List<List<List<List<Double>>>>>>>>? =
                null
            private var dimensionName: JsonField<MutableList<String>>? = null
            private var dimensions: JsonField<MutableList<Int>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(amplitude: Amplitude) = apply {
                data = amplitude.data.map { it.toMutableList() }
                dimensionName = amplitude.dimensionName.map { it.toMutableList() }
                dimensions = amplitude.dimensions.map { it.toMutableList() }
                notes = amplitude.notes
                additionalProperties = amplitude.additionalProperties.toMutableMap()
            }

            /** Array of amplitude data. */
            fun data(data: List<List<List<List<List<List<List<Double>>>>>>>) =
                data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed
             * `List<List<List<List<List<List<List<Double>>>>>>>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun data(data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<List<List<List<List<List<Double>>>>>>] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: List<List<List<List<List<List<Double>>>>>>) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Array of names for dimensions. */
            fun dimensionName(dimensionName: List<String>) =
                dimensionName(JsonField.of(dimensionName))

            /**
             * Sets [Builder.dimensionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionName] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionName(dimensionName: JsonField<List<String>>) = apply {
                this.dimensionName = dimensionName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.dimensionName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionName(dimensionName: String) = apply {
                this.dimensionName =
                    (this.dimensionName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionName", it).add(dimensionName)
                    }
            }

            /** Array of integers for amplitude dimensions. */
            fun dimensions(dimensions: List<Int>) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<List<Int>>) = apply {
                this.dimensions = dimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [dimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimension(dimension: Int) = apply {
                dimensions =
                    (dimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensions", it).add(dimension)
                    }
            }

            /** Notes for the amplitude data. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * Returns an immutable instance of [Amplitude].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Amplitude =
                Amplitude(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionName ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Amplitude = apply {
            if (validated) {
                return@apply
            }

            data()
            dimensionName()
            dimensions()
            notes()
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
            (data.asKnown().getOrNull()?.sumOf {
                it.sumOf {
                        it.sumOf {
                                it.sumOf {
                                        it.sumOf { it.sumOf { it.size.toInt() }.toInt() }.toInt()
                                    }
                                    .toInt()
                            }
                            .toInt()
                    }
                    .toInt()
            } ?: 0) +
                (dimensionName.asKnown().getOrNull()?.size ?: 0) +
                (dimensions.asKnown().getOrNull()?.size ?: 0) +
                (if (notes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Amplitude &&
                data == other.data &&
                dimensionName == other.dimensionName &&
                dimensions == other.dimensions &&
                notes == other.notes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, dimensionName, dimensions, notes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Amplitude{data=$data, dimensionName=$dimensionName, dimensions=$dimensions, notes=$notes, additionalProperties=$additionalProperties}"
    }

    class AntennaElementPosition
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<List<Double>>>,
        private val dimensionName: JsonField<List<String>>,
        private val dimensions: JsonField<List<Int>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<List<Double>>> = JsonMissing.of(),
            @JsonProperty("dimensionName")
            @ExcludeMissing
            dimensionName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<List<Int>> = JsonMissing.of(),
        ) : this(data, dimensionName, dimensions, mutableMapOf())

        /**
         * Array of 3-element tuples (x,y,z) in km.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data(): Optional<List<List<Double>>> = data.getOptional("data")

        /**
         * Array of names for dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensionName(): Optional<List<String>> = dimensionName.getOptional("dimensionName")

        /**
         * Array of integers of the antenna_element dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensions(): Optional<List<Int>> = dimensions.getOptional("dimensions")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<List<Double>>> = data

        /**
         * Returns the raw JSON value of [dimensionName].
         *
         * Unlike [dimensionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionName")
        @ExcludeMissing
        fun _dimensionName(): JsonField<List<String>> = dimensionName

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<List<Int>> = dimensions

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
             * Returns a mutable builder for constructing an instance of [AntennaElementPosition].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AntennaElementPosition]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<List<Double>>>? = null
            private var dimensionName: JsonField<MutableList<String>>? = null
            private var dimensions: JsonField<MutableList<Int>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(antennaElementPosition: AntennaElementPosition) = apply {
                data = antennaElementPosition.data.map { it.toMutableList() }
                dimensionName = antennaElementPosition.dimensionName.map { it.toMutableList() }
                dimensions = antennaElementPosition.dimensions.map { it.toMutableList() }
                additionalProperties = antennaElementPosition.additionalProperties.toMutableMap()
            }

            /** Array of 3-element tuples (x,y,z) in km. */
            fun data(data: List<List<Double>>) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed `List<List<Double>>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun data(data: JsonField<List<List<Double>>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<Double>] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: List<Double>) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Array of names for dimensions. */
            fun dimensionName(dimensionName: List<String>) =
                dimensionName(JsonField.of(dimensionName))

            /**
             * Sets [Builder.dimensionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionName] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionName(dimensionName: JsonField<List<String>>) = apply {
                this.dimensionName = dimensionName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.dimensionName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionName(dimensionName: String) = apply {
                this.dimensionName =
                    (this.dimensionName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionName", it).add(dimensionName)
                    }
            }

            /** Array of integers of the antenna_element dimensions. */
            fun dimensions(dimensions: List<Int>) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<List<Int>>) = apply {
                this.dimensions = dimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [dimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimension(dimension: Int) = apply {
                dimensions =
                    (dimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensions", it).add(dimension)
                    }
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
             * Returns an immutable instance of [AntennaElementPosition].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AntennaElementPosition =
                AntennaElementPosition(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionName ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AntennaElementPosition = apply {
            if (validated) {
                return@apply
            }

            data()
            dimensionName()
            dimensions()
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
            (data.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                (dimensionName.asKnown().getOrNull()?.size ?: 0) +
                (dimensions.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AntennaElementPosition &&
                data == other.data &&
                dimensionName == other.dimensionName &&
                dimensions == other.dimensions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, dimensionName, dimensions, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AntennaElementPosition{data=$data, dimensionName=$dimensionName, dimensions=$dimensions, additionalProperties=$additionalProperties}"
    }

    /**
     * Enums: J2000, ECR/ECEF, TEME, GCRF, WGS84 (GEODetic lat, long, alt), GEOCentric (lat, long,
     * radii).
     */
    class AntennaElementPositionCoordinateSystem
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ECR_ECEF = of("ECR/ECEF")

            @JvmField val TEME = of("TEME")

            @JvmField val GCRF = of("GCRF")

            @JvmField val WGS84_GEO_DETIC_LAT_LONG_ALT = of("WGS84 (GEODetic lat, long, alt)")

            @JvmField val GEO_CENTRIC_LAT_LONG_RADII = of("GEOCentric (lat, long, radii)")

            @JvmStatic
            fun of(value: String) = AntennaElementPositionCoordinateSystem(JsonField.of(value))
        }

        /** An enum containing [AntennaElementPositionCoordinateSystem]'s known values. */
        enum class Known {
            J2000,
            ECR_ECEF,
            TEME,
            GCRF,
            WGS84_GEO_DETIC_LAT_LONG_ALT,
            GEO_CENTRIC_LAT_LONG_RADII,
        }

        /**
         * An enum containing [AntennaElementPositionCoordinateSystem]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [AntennaElementPositionCoordinateSystem] can contain an unknown value in a
         * couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            J2000,
            ECR_ECEF,
            TEME,
            GCRF,
            WGS84_GEO_DETIC_LAT_LONG_ALT,
            GEO_CENTRIC_LAT_LONG_RADII,
            /**
             * An enum member indicating that [AntennaElementPositionCoordinateSystem] was
             * instantiated with an unknown value.
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
                ECR_ECEF -> Value.ECR_ECEF
                TEME -> Value.TEME
                GCRF -> Value.GCRF
                WGS84_GEO_DETIC_LAT_LONG_ALT -> Value.WGS84_GEO_DETIC_LAT_LONG_ALT
                GEO_CENTRIC_LAT_LONG_RADII -> Value.GEO_CENTRIC_LAT_LONG_RADII
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
                ECR_ECEF -> Known.ECR_ECEF
                TEME -> Known.TEME
                GCRF -> Known.GCRF
                WGS84_GEO_DETIC_LAT_LONG_ALT -> Known.WGS84_GEO_DETIC_LAT_LONG_ALT
                GEO_CENTRIC_LAT_LONG_RADII -> Known.GEO_CENTRIC_LAT_LONG_RADII
                else ->
                    throw UnifieddatalibraryInvalidDataException(
                        "Unknown AntennaElementPositionCoordinateSystem: $value"
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

        fun validate(): AntennaElementPositionCoordinateSystem = apply {
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

            return other is AntennaElementPositionCoordinateSystem && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Azimuth
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>,
        private val dimensionName: JsonField<List<String>>,
        private val dimensions: JsonField<List<Int>>,
        private val notes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = JsonMissing.of(),
            @JsonProperty("dimensionName")
            @ExcludeMissing
            dimensionName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        ) : this(data, dimensionName, dimensions, notes, mutableMapOf())

        /**
         * Array of incoming azimuth at the receiver.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data(): Optional<List<List<List<List<List<List<List<Double>>>>>>>> =
            data.getOptional("data")

        /**
         * Array of names for dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensionName(): Optional<List<String>> = dimensionName.getOptional("dimensionName")

        /**
         * Array of integers of the azimuth array dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensions(): Optional<List<Int>> = dimensions.getOptional("dimensions")

        /**
         * Notes for the azimuth data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun _data(): JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = data

        /**
         * Returns the raw JSON value of [dimensionName].
         *
         * Unlike [dimensionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionName")
        @ExcludeMissing
        fun _dimensionName(): JsonField<List<String>> = dimensionName

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<List<Int>> = dimensions

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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

            /** Returns a mutable builder for constructing an instance of [Azimuth]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Azimuth]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<List<List<List<List<List<List<Double>>>>>>>>? =
                null
            private var dimensionName: JsonField<MutableList<String>>? = null
            private var dimensions: JsonField<MutableList<Int>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(azimuth: Azimuth) = apply {
                data = azimuth.data.map { it.toMutableList() }
                dimensionName = azimuth.dimensionName.map { it.toMutableList() }
                dimensions = azimuth.dimensions.map { it.toMutableList() }
                notes = azimuth.notes
                additionalProperties = azimuth.additionalProperties.toMutableMap()
            }

            /** Array of incoming azimuth at the receiver. */
            fun data(data: List<List<List<List<List<List<List<Double>>>>>>>) =
                data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed
             * `List<List<List<List<List<List<List<Double>>>>>>>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun data(data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<List<List<List<List<List<Double>>>>>>] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: List<List<List<List<List<List<Double>>>>>>) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Array of names for dimensions. */
            fun dimensionName(dimensionName: List<String>) =
                dimensionName(JsonField.of(dimensionName))

            /**
             * Sets [Builder.dimensionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionName] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionName(dimensionName: JsonField<List<String>>) = apply {
                this.dimensionName = dimensionName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.dimensionName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionName(dimensionName: String) = apply {
                this.dimensionName =
                    (this.dimensionName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionName", it).add(dimensionName)
                    }
            }

            /** Array of integers of the azimuth array dimensions. */
            fun dimensions(dimensions: List<Int>) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<List<Int>>) = apply {
                this.dimensions = dimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [dimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimension(dimension: Int) = apply {
                dimensions =
                    (dimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensions", it).add(dimension)
                    }
            }

            /** Notes for the azimuth data. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * Returns an immutable instance of [Azimuth].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Azimuth =
                Azimuth(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionName ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Azimuth = apply {
            if (validated) {
                return@apply
            }

            data()
            dimensionName()
            dimensions()
            notes()
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
            (data.asKnown().getOrNull()?.sumOf {
                it.sumOf {
                        it.sumOf {
                                it.sumOf {
                                        it.sumOf { it.sumOf { it.size.toInt() }.toInt() }.toInt()
                                    }
                                    .toInt()
                            }
                            .toInt()
                    }
                    .toInt()
            } ?: 0) +
                (dimensionName.asKnown().getOrNull()?.size ?: 0) +
                (dimensions.asKnown().getOrNull()?.size ?: 0) +
                (if (notes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Azimuth &&
                data == other.data &&
                dimensionName == other.dimensionName &&
                dimensions == other.dimensions &&
                notes == other.notes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, dimensionName, dimensions, notes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Azimuth{data=$data, dimensionName=$dimensionName, dimensions=$dimensions, notes=$notes, additionalProperties=$additionalProperties}"
    }

    /** Characteristic attributes of a IonoObservation. */
    class CharAtt
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val charName: JsonField<String>,
        private val climateModelInputParams: JsonField<List<String>>,
        private val climateModelName: JsonField<String>,
        private val climateModelOptions: JsonField<List<String>>,
        private val d: JsonField<String>,
        private val lowerBound: JsonField<Double>,
        private val q: JsonField<String>,
        private val uncertaintyBoundType: JsonField<String>,
        private val upperBound: JsonField<Double>,
        private val ursiId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("charName")
            @ExcludeMissing
            charName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("climateModelInputParams")
            @ExcludeMissing
            climateModelInputParams: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("climateModelName")
            @ExcludeMissing
            climateModelName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("climateModelOptions")
            @ExcludeMissing
            climateModelOptions: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("d") @ExcludeMissing d: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lowerBound")
            @ExcludeMissing
            lowerBound: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("q") @ExcludeMissing q: JsonField<String> = JsonMissing.of(),
            @JsonProperty("uncertaintyBoundType")
            @ExcludeMissing
            uncertaintyBoundType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("upperBound")
            @ExcludeMissing
            upperBound: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("ursiID") @ExcludeMissing ursiId: JsonField<String> = JsonMissing.of(),
        ) : this(
            charName,
            climateModelInputParams,
            climateModelName,
            climateModelOptions,
            d,
            lowerBound,
            q,
            uncertaintyBoundType,
            upperBound,
            ursiId,
            mutableMapOf(),
        )

        /**
         * Characteristic name. This value should reflect the UDL field name for the corresponding
         * characteristic.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun charName(): Optional<String> = charName.getOptional("charName")

        /**
         * Input parameters for the climate model.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun climateModelInputParams(): Optional<List<String>> =
            climateModelInputParams.getOptional("climateModelInputParams")

        /**
         * Name of the climate model.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun climateModelName(): Optional<String> = climateModelName.getOptional("climateModelName")

        /**
         * List of options for the climate model.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun climateModelOptions(): Optional<List<String>> =
            climateModelOptions.getOptional("climateModelOptions")

        /**
         * Descriptive letter (D) for the characteristic specified by URSI ID. Describes specific
         * ionospheric conditions, beyond numerical values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun d(): Optional<String> = d.getOptional("d")

        /**
         * Specified characteristic's lower bound. Should be less than or equal to the
         * characteristic's current value as set in this record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lowerBound(): Optional<Double> = lowerBound.getOptional("lowerBound")

        /**
         * Qualifying letter (Q) for the characteristic specified by URSI ID. Describes specific
         * ionospheric conditions, beyond numerical values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun q(): Optional<String> = q.getOptional("q")

        /**
         * Uncertainty Bounds (lower and upper) define an interval around reported value that
         * contains true value at the specified probability level. Probability levels are specified
         * in terms of percentile (from 1 to 100) or the standard deviation, sigma (e.g. 1sigma,
         * 2sigma, 3sigma, 5percentile, 10percentile, 25percentile).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun uncertaintyBoundType(): Optional<String> =
            uncertaintyBoundType.getOptional("uncertaintyBoundType")

        /**
         * Specified characteristic's upper bound. Should be greater than or equal to the
         * characteristic's current value as set in this record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun upperBound(): Optional<Double> = upperBound.getOptional("upperBound")

        /**
         * Characteristic's URSI ID. See the characteristic's description for its corresponding URSI
         * ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ursiId(): Optional<String> = ursiId.getOptional("ursiID")

        /**
         * Returns the raw JSON value of [charName].
         *
         * Unlike [charName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("charName") @ExcludeMissing fun _charName(): JsonField<String> = charName

        /**
         * Returns the raw JSON value of [climateModelInputParams].
         *
         * Unlike [climateModelInputParams], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("climateModelInputParams")
        @ExcludeMissing
        fun _climateModelInputParams(): JsonField<List<String>> = climateModelInputParams

        /**
         * Returns the raw JSON value of [climateModelName].
         *
         * Unlike [climateModelName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("climateModelName")
        @ExcludeMissing
        fun _climateModelName(): JsonField<String> = climateModelName

        /**
         * Returns the raw JSON value of [climateModelOptions].
         *
         * Unlike [climateModelOptions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("climateModelOptions")
        @ExcludeMissing
        fun _climateModelOptions(): JsonField<List<String>> = climateModelOptions

        /**
         * Returns the raw JSON value of [d].
         *
         * Unlike [d], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("d") @ExcludeMissing fun _d(): JsonField<String> = d

        /**
         * Returns the raw JSON value of [lowerBound].
         *
         * Unlike [lowerBound], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lowerBound")
        @ExcludeMissing
        fun _lowerBound(): JsonField<Double> = lowerBound

        /**
         * Returns the raw JSON value of [q].
         *
         * Unlike [q], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("q") @ExcludeMissing fun _q(): JsonField<String> = q

        /**
         * Returns the raw JSON value of [uncertaintyBoundType].
         *
         * Unlike [uncertaintyBoundType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("uncertaintyBoundType")
        @ExcludeMissing
        fun _uncertaintyBoundType(): JsonField<String> = uncertaintyBoundType

        /**
         * Returns the raw JSON value of [upperBound].
         *
         * Unlike [upperBound], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("upperBound")
        @ExcludeMissing
        fun _upperBound(): JsonField<Double> = upperBound

        /**
         * Returns the raw JSON value of [ursiId].
         *
         * Unlike [ursiId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ursiID") @ExcludeMissing fun _ursiId(): JsonField<String> = ursiId

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

            /** Returns a mutable builder for constructing an instance of [CharAtt]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CharAtt]. */
        class Builder internal constructor() {

            private var charName: JsonField<String> = JsonMissing.of()
            private var climateModelInputParams: JsonField<MutableList<String>>? = null
            private var climateModelName: JsonField<String> = JsonMissing.of()
            private var climateModelOptions: JsonField<MutableList<String>>? = null
            private var d: JsonField<String> = JsonMissing.of()
            private var lowerBound: JsonField<Double> = JsonMissing.of()
            private var q: JsonField<String> = JsonMissing.of()
            private var uncertaintyBoundType: JsonField<String> = JsonMissing.of()
            private var upperBound: JsonField<Double> = JsonMissing.of()
            private var ursiId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(charAtt: CharAtt) = apply {
                charName = charAtt.charName
                climateModelInputParams = charAtt.climateModelInputParams.map { it.toMutableList() }
                climateModelName = charAtt.climateModelName
                climateModelOptions = charAtt.climateModelOptions.map { it.toMutableList() }
                d = charAtt.d
                lowerBound = charAtt.lowerBound
                q = charAtt.q
                uncertaintyBoundType = charAtt.uncertaintyBoundType
                upperBound = charAtt.upperBound
                ursiId = charAtt.ursiId
                additionalProperties = charAtt.additionalProperties.toMutableMap()
            }

            /**
             * Characteristic name. This value should reflect the UDL field name for the
             * corresponding characteristic.
             */
            fun charName(charName: String) = charName(JsonField.of(charName))

            /**
             * Sets [Builder.charName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.charName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun charName(charName: JsonField<String>) = apply { this.charName = charName }

            /** Input parameters for the climate model. */
            fun climateModelInputParams(climateModelInputParams: List<String>) =
                climateModelInputParams(JsonField.of(climateModelInputParams))

            /**
             * Sets [Builder.climateModelInputParams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.climateModelInputParams] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun climateModelInputParams(climateModelInputParams: JsonField<List<String>>) = apply {
                this.climateModelInputParams = climateModelInputParams.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [climateModelInputParams].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addClimateModelInputParam(climateModelInputParam: String) = apply {
                climateModelInputParams =
                    (climateModelInputParams ?: JsonField.of(mutableListOf())).also {
                        checkKnown("climateModelInputParams", it).add(climateModelInputParam)
                    }
            }

            /** Name of the climate model. */
            fun climateModelName(climateModelName: String) =
                climateModelName(JsonField.of(climateModelName))

            /**
             * Sets [Builder.climateModelName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.climateModelName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun climateModelName(climateModelName: JsonField<String>) = apply {
                this.climateModelName = climateModelName
            }

            /** List of options for the climate model. */
            fun climateModelOptions(climateModelOptions: List<String>) =
                climateModelOptions(JsonField.of(climateModelOptions))

            /**
             * Sets [Builder.climateModelOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.climateModelOptions] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun climateModelOptions(climateModelOptions: JsonField<List<String>>) = apply {
                this.climateModelOptions = climateModelOptions.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [climateModelOptions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addClimateModelOption(climateModelOption: String) = apply {
                climateModelOptions =
                    (climateModelOptions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("climateModelOptions", it).add(climateModelOption)
                    }
            }

            /**
             * Descriptive letter (D) for the characteristic specified by URSI ID. Describes
             * specific ionospheric conditions, beyond numerical values.
             */
            fun d(d: String) = d(JsonField.of(d))

            /**
             * Sets [Builder.d] to an arbitrary JSON value.
             *
             * You should usually call [Builder.d] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun d(d: JsonField<String>) = apply { this.d = d }

            /**
             * Specified characteristic's lower bound. Should be less than or equal to the
             * characteristic's current value as set in this record.
             */
            fun lowerBound(lowerBound: Double) = lowerBound(JsonField.of(lowerBound))

            /**
             * Sets [Builder.lowerBound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lowerBound] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lowerBound(lowerBound: JsonField<Double>) = apply { this.lowerBound = lowerBound }

            /**
             * Qualifying letter (Q) for the characteristic specified by URSI ID. Describes specific
             * ionospheric conditions, beyond numerical values.
             */
            fun q(q: String) = q(JsonField.of(q))

            /**
             * Sets [Builder.q] to an arbitrary JSON value.
             *
             * You should usually call [Builder.q] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun q(q: JsonField<String>) = apply { this.q = q }

            /**
             * Uncertainty Bounds (lower and upper) define an interval around reported value that
             * contains true value at the specified probability level. Probability levels are
             * specified in terms of percentile (from 1 to 100) or the standard deviation, sigma
             * (e.g. 1sigma, 2sigma, 3sigma, 5percentile, 10percentile, 25percentile).
             */
            fun uncertaintyBoundType(uncertaintyBoundType: String) =
                uncertaintyBoundType(JsonField.of(uncertaintyBoundType))

            /**
             * Sets [Builder.uncertaintyBoundType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uncertaintyBoundType] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun uncertaintyBoundType(uncertaintyBoundType: JsonField<String>) = apply {
                this.uncertaintyBoundType = uncertaintyBoundType
            }

            /**
             * Specified characteristic's upper bound. Should be greater than or equal to the
             * characteristic's current value as set in this record.
             */
            fun upperBound(upperBound: Double) = upperBound(JsonField.of(upperBound))

            /**
             * Sets [Builder.upperBound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.upperBound] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun upperBound(upperBound: JsonField<Double>) = apply { this.upperBound = upperBound }

            /**
             * Characteristic's URSI ID. See the characteristic's description for its corresponding
             * URSI ID.
             */
            fun ursiId(ursiId: String) = ursiId(JsonField.of(ursiId))

            /**
             * Sets [Builder.ursiId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ursiId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ursiId(ursiId: JsonField<String>) = apply { this.ursiId = ursiId }

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
             * Returns an immutable instance of [CharAtt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CharAtt =
                CharAtt(
                    charName,
                    (climateModelInputParams ?: JsonMissing.of()).map { it.toImmutable() },
                    climateModelName,
                    (climateModelOptions ?: JsonMissing.of()).map { it.toImmutable() },
                    d,
                    lowerBound,
                    q,
                    uncertaintyBoundType,
                    upperBound,
                    ursiId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CharAtt = apply {
            if (validated) {
                return@apply
            }

            charName()
            climateModelInputParams()
            climateModelName()
            climateModelOptions()
            d()
            lowerBound()
            q()
            uncertaintyBoundType()
            upperBound()
            ursiId()
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
            (if (charName.asKnown().isPresent) 1 else 0) +
                (climateModelInputParams.asKnown().getOrNull()?.size ?: 0) +
                (if (climateModelName.asKnown().isPresent) 1 else 0) +
                (climateModelOptions.asKnown().getOrNull()?.size ?: 0) +
                (if (d.asKnown().isPresent) 1 else 0) +
                (if (lowerBound.asKnown().isPresent) 1 else 0) +
                (if (q.asKnown().isPresent) 1 else 0) +
                (if (uncertaintyBoundType.asKnown().isPresent) 1 else 0) +
                (if (upperBound.asKnown().isPresent) 1 else 0) +
                (if (ursiId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CharAtt &&
                charName == other.charName &&
                climateModelInputParams == other.climateModelInputParams &&
                climateModelName == other.climateModelName &&
                climateModelOptions == other.climateModelOptions &&
                d == other.d &&
                lowerBound == other.lowerBound &&
                q == other.q &&
                uncertaintyBoundType == other.uncertaintyBoundType &&
                upperBound == other.upperBound &&
                ursiId == other.ursiId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                charName,
                climateModelInputParams,
                climateModelName,
                climateModelOptions,
                d,
                lowerBound,
                q,
                uncertaintyBoundType,
                upperBound,
                ursiId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CharAtt{charName=$charName, climateModelInputParams=$climateModelInputParams, climateModelName=$climateModelName, climateModelOptions=$climateModelOptions, d=$d, lowerBound=$lowerBound, q=$q, uncertaintyBoundType=$uncertaintyBoundType, upperBound=$upperBound, ursiId=$ursiId, additionalProperties=$additionalProperties}"
    }

    class Datum
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<Double>>,
        private val notes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") @ExcludeMissing data: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        ) : this(data, notes, mutableMapOf())

        /**
         * Array to support sparse data collections.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data(): Optional<List<Double>> = data.getOptional("data")

        /**
         * Notes for the datum with details of what the data is, units, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Double>> = data

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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

            /** Returns a mutable builder for constructing an instance of [Datum]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Datum]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<Double>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(datum: Datum) = apply {
                data = datum.data.map { it.toMutableList() }
                notes = datum.notes
                additionalProperties = datum.additionalProperties.toMutableMap()
            }

            /** Array to support sparse data collections. */
            fun data(data: List<Double>) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun data(data: JsonField<List<Double>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: Double) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Notes for the datum with details of what the data is, units, etc. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * Returns an immutable instance of [Datum].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Datum =
                Datum(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Datum = apply {
            if (validated) {
                return@apply
            }

            data()
            notes()
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
            (data.asKnown().getOrNull()?.size ?: 0) + (if (notes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Datum &&
                data == other.data &&
                notes == other.notes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(data, notes, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Datum{data=$data, notes=$notes, additionalProperties=$additionalProperties}"
    }

    /** Profile of electron densities in the ionosphere associated with an IonoObservation. */
    class DensityProfile
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val iri: JsonField<Iri>,
        private val parabolic: JsonField<Parabolic>,
        private val quasiParabolic: JsonField<QuasiParabolic>,
        private val shiftedChebyshev: JsonField<ShiftedChebyshev>,
        private val topsideExtensionChapmanConst: JsonField<TopsideExtensionChapmanConst>,
        private val topsideExtensionVaryChap: JsonField<TopsideExtensionVaryChap>,
        private val valleyModelCoeffs: JsonField<List<Double>>,
        private val valleyModelDescription: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("iri") @ExcludeMissing iri: JsonField<Iri> = JsonMissing.of(),
            @JsonProperty("parabolic")
            @ExcludeMissing
            parabolic: JsonField<Parabolic> = JsonMissing.of(),
            @JsonProperty("quasiParabolic")
            @ExcludeMissing
            quasiParabolic: JsonField<QuasiParabolic> = JsonMissing.of(),
            @JsonProperty("shiftedChebyshev")
            @ExcludeMissing
            shiftedChebyshev: JsonField<ShiftedChebyshev> = JsonMissing.of(),
            @JsonProperty("topsideExtensionChapmanConst")
            @ExcludeMissing
            topsideExtensionChapmanConst: JsonField<TopsideExtensionChapmanConst> =
                JsonMissing.of(),
            @JsonProperty("topsideExtensionVaryChap")
            @ExcludeMissing
            topsideExtensionVaryChap: JsonField<TopsideExtensionVaryChap> = JsonMissing.of(),
            @JsonProperty("valleyModelCoeffs")
            @ExcludeMissing
            valleyModelCoeffs: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("valleyModelDescription")
            @ExcludeMissing
            valleyModelDescription: JsonField<String> = JsonMissing.of(),
        ) : this(
            iri,
            parabolic,
            quasiParabolic,
            shiftedChebyshev,
            topsideExtensionChapmanConst,
            topsideExtensionVaryChap,
            valleyModelCoeffs,
            valleyModelDescription,
            mutableMapOf(),
        )

        /**
         * Full set of the IRI formalism coefficients.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun iri(): Optional<Iri> = iri.getOptional("iri")

        /**
         * Coefficients to describe the E, F1, and F2 layers as parabolic-shape segments.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun parabolic(): Optional<Parabolic> = parabolic.getOptional("parabolic")

        /**
         * Coefficients to describe profile shape as quasi-parabolic segments.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun quasiParabolic(): Optional<QuasiParabolic> =
            quasiParabolic.getOptional("quasiParabolic")

        /**
         * Coefficients to describe either the E, F1, and bottomside F2 profile shapes or the height
         * uncertainty boundaries.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun shiftedChebyshev(): Optional<ShiftedChebyshev> =
            shiftedChebyshev.getOptional("shiftedChebyshev")

        /**
         * Parameters of the constant-scale-height Chapman layer.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun topsideExtensionChapmanConst(): Optional<TopsideExtensionChapmanConst> =
            topsideExtensionChapmanConst.getOptional("topsideExtensionChapmanConst")

        /**
         * Varying scale height Chapman topside layer.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun topsideExtensionVaryChap(): Optional<TopsideExtensionVaryChap> =
            topsideExtensionVaryChap.getOptional("topsideExtensionVaryChap")

        /**
         * Array of valley model coefficients.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun valleyModelCoeffs(): Optional<List<Double>> =
            valleyModelCoeffs.getOptional("valleyModelCoeffs")

        /**
         * Description of the valley model and parameters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun valleyModelDescription(): Optional<String> =
            valleyModelDescription.getOptional("valleyModelDescription")

        /**
         * Returns the raw JSON value of [iri].
         *
         * Unlike [iri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("iri") @ExcludeMissing fun _iri(): JsonField<Iri> = iri

        /**
         * Returns the raw JSON value of [parabolic].
         *
         * Unlike [parabolic], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parabolic")
        @ExcludeMissing
        fun _parabolic(): JsonField<Parabolic> = parabolic

        /**
         * Returns the raw JSON value of [quasiParabolic].
         *
         * Unlike [quasiParabolic], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("quasiParabolic")
        @ExcludeMissing
        fun _quasiParabolic(): JsonField<QuasiParabolic> = quasiParabolic

        /**
         * Returns the raw JSON value of [shiftedChebyshev].
         *
         * Unlike [shiftedChebyshev], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shiftedChebyshev")
        @ExcludeMissing
        fun _shiftedChebyshev(): JsonField<ShiftedChebyshev> = shiftedChebyshev

        /**
         * Returns the raw JSON value of [topsideExtensionChapmanConst].
         *
         * Unlike [topsideExtensionChapmanConst], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("topsideExtensionChapmanConst")
        @ExcludeMissing
        fun _topsideExtensionChapmanConst(): JsonField<TopsideExtensionChapmanConst> =
            topsideExtensionChapmanConst

        /**
         * Returns the raw JSON value of [topsideExtensionVaryChap].
         *
         * Unlike [topsideExtensionVaryChap], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("topsideExtensionVaryChap")
        @ExcludeMissing
        fun _topsideExtensionVaryChap(): JsonField<TopsideExtensionVaryChap> =
            topsideExtensionVaryChap

        /**
         * Returns the raw JSON value of [valleyModelCoeffs].
         *
         * Unlike [valleyModelCoeffs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("valleyModelCoeffs")
        @ExcludeMissing
        fun _valleyModelCoeffs(): JsonField<List<Double>> = valleyModelCoeffs

        /**
         * Returns the raw JSON value of [valleyModelDescription].
         *
         * Unlike [valleyModelDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("valleyModelDescription")
        @ExcludeMissing
        fun _valleyModelDescription(): JsonField<String> = valleyModelDescription

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

            /** Returns a mutable builder for constructing an instance of [DensityProfile]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DensityProfile]. */
        class Builder internal constructor() {

            private var iri: JsonField<Iri> = JsonMissing.of()
            private var parabolic: JsonField<Parabolic> = JsonMissing.of()
            private var quasiParabolic: JsonField<QuasiParabolic> = JsonMissing.of()
            private var shiftedChebyshev: JsonField<ShiftedChebyshev> = JsonMissing.of()
            private var topsideExtensionChapmanConst: JsonField<TopsideExtensionChapmanConst> =
                JsonMissing.of()
            private var topsideExtensionVaryChap: JsonField<TopsideExtensionVaryChap> =
                JsonMissing.of()
            private var valleyModelCoeffs: JsonField<MutableList<Double>>? = null
            private var valleyModelDescription: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(densityProfile: DensityProfile) = apply {
                iri = densityProfile.iri
                parabolic = densityProfile.parabolic
                quasiParabolic = densityProfile.quasiParabolic
                shiftedChebyshev = densityProfile.shiftedChebyshev
                topsideExtensionChapmanConst = densityProfile.topsideExtensionChapmanConst
                topsideExtensionVaryChap = densityProfile.topsideExtensionVaryChap
                valleyModelCoeffs = densityProfile.valleyModelCoeffs.map { it.toMutableList() }
                valleyModelDescription = densityProfile.valleyModelDescription
                additionalProperties = densityProfile.additionalProperties.toMutableMap()
            }

            /** Full set of the IRI formalism coefficients. */
            fun iri(iri: Iri) = iri(JsonField.of(iri))

            /**
             * Sets [Builder.iri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.iri] with a well-typed [Iri] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun iri(iri: JsonField<Iri>) = apply { this.iri = iri }

            /** Coefficients to describe the E, F1, and F2 layers as parabolic-shape segments. */
            fun parabolic(parabolic: Parabolic) = parabolic(JsonField.of(parabolic))

            /**
             * Sets [Builder.parabolic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parabolic] with a well-typed [Parabolic] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parabolic(parabolic: JsonField<Parabolic>) = apply { this.parabolic = parabolic }

            /** Coefficients to describe profile shape as quasi-parabolic segments. */
            fun quasiParabolic(quasiParabolic: QuasiParabolic) =
                quasiParabolic(JsonField.of(quasiParabolic))

            /**
             * Sets [Builder.quasiParabolic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quasiParabolic] with a well-typed [QuasiParabolic]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun quasiParabolic(quasiParabolic: JsonField<QuasiParabolic>) = apply {
                this.quasiParabolic = quasiParabolic
            }

            /**
             * Coefficients to describe either the E, F1, and bottomside F2 profile shapes or the
             * height uncertainty boundaries.
             */
            fun shiftedChebyshev(shiftedChebyshev: ShiftedChebyshev) =
                shiftedChebyshev(JsonField.of(shiftedChebyshev))

            /**
             * Sets [Builder.shiftedChebyshev] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shiftedChebyshev] with a well-typed
             * [ShiftedChebyshev] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun shiftedChebyshev(shiftedChebyshev: JsonField<ShiftedChebyshev>) = apply {
                this.shiftedChebyshev = shiftedChebyshev
            }

            /** Parameters of the constant-scale-height Chapman layer. */
            fun topsideExtensionChapmanConst(
                topsideExtensionChapmanConst: TopsideExtensionChapmanConst
            ) = topsideExtensionChapmanConst(JsonField.of(topsideExtensionChapmanConst))

            /**
             * Sets [Builder.topsideExtensionChapmanConst] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topsideExtensionChapmanConst] with a well-typed
             * [TopsideExtensionChapmanConst] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun topsideExtensionChapmanConst(
                topsideExtensionChapmanConst: JsonField<TopsideExtensionChapmanConst>
            ) = apply { this.topsideExtensionChapmanConst = topsideExtensionChapmanConst }

            /** Varying scale height Chapman topside layer. */
            fun topsideExtensionVaryChap(topsideExtensionVaryChap: TopsideExtensionVaryChap) =
                topsideExtensionVaryChap(JsonField.of(topsideExtensionVaryChap))

            /**
             * Sets [Builder.topsideExtensionVaryChap] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topsideExtensionVaryChap] with a well-typed
             * [TopsideExtensionVaryChap] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun topsideExtensionVaryChap(
                topsideExtensionVaryChap: JsonField<TopsideExtensionVaryChap>
            ) = apply { this.topsideExtensionVaryChap = topsideExtensionVaryChap }

            /** Array of valley model coefficients. */
            fun valleyModelCoeffs(valleyModelCoeffs: List<Double>) =
                valleyModelCoeffs(JsonField.of(valleyModelCoeffs))

            /**
             * Sets [Builder.valleyModelCoeffs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.valleyModelCoeffs] with a well-typed `List<Double>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun valleyModelCoeffs(valleyModelCoeffs: JsonField<List<Double>>) = apply {
                this.valleyModelCoeffs = valleyModelCoeffs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [valleyModelCoeffs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addValleyModelCoeff(valleyModelCoeff: Double) = apply {
                valleyModelCoeffs =
                    (valleyModelCoeffs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("valleyModelCoeffs", it).add(valleyModelCoeff)
                    }
            }

            /** Description of the valley model and parameters. */
            fun valleyModelDescription(valleyModelDescription: String) =
                valleyModelDescription(JsonField.of(valleyModelDescription))

            /**
             * Sets [Builder.valleyModelDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.valleyModelDescription] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun valleyModelDescription(valleyModelDescription: JsonField<String>) = apply {
                this.valleyModelDescription = valleyModelDescription
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
             * Returns an immutable instance of [DensityProfile].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DensityProfile =
                DensityProfile(
                    iri,
                    parabolic,
                    quasiParabolic,
                    shiftedChebyshev,
                    topsideExtensionChapmanConst,
                    topsideExtensionVaryChap,
                    (valleyModelCoeffs ?: JsonMissing.of()).map { it.toImmutable() },
                    valleyModelDescription,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DensityProfile = apply {
            if (validated) {
                return@apply
            }

            iri().ifPresent { it.validate() }
            parabolic().ifPresent { it.validate() }
            quasiParabolic().ifPresent { it.validate() }
            shiftedChebyshev().ifPresent { it.validate() }
            topsideExtensionChapmanConst().ifPresent { it.validate() }
            topsideExtensionVaryChap().ifPresent { it.validate() }
            valleyModelCoeffs()
            valleyModelDescription()
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
            (iri.asKnown().getOrNull()?.validity() ?: 0) +
                (parabolic.asKnown().getOrNull()?.validity() ?: 0) +
                (quasiParabolic.asKnown().getOrNull()?.validity() ?: 0) +
                (shiftedChebyshev.asKnown().getOrNull()?.validity() ?: 0) +
                (topsideExtensionChapmanConst.asKnown().getOrNull()?.validity() ?: 0) +
                (topsideExtensionVaryChap.asKnown().getOrNull()?.validity() ?: 0) +
                (valleyModelCoeffs.asKnown().getOrNull()?.size ?: 0) +
                (if (valleyModelDescription.asKnown().isPresent) 1 else 0)

        /** Full set of the IRI formalism coefficients. */
        class Iri
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val b0: JsonField<Double>,
            private val b1: JsonField<Double>,
            private val chi: JsonField<Double>,
            private val d1: JsonField<Double>,
            private val description: JsonField<String>,
            private val fp1: JsonField<Double>,
            private val fp2: JsonField<Double>,
            private val fp30: JsonField<Double>,
            private val fp3U: JsonField<Double>,
            private val ha: JsonField<Double>,
            private val hdx: JsonField<Double>,
            private val hmD: JsonField<Double>,
            private val hmE: JsonField<Double>,
            private val hmF1: JsonField<Double>,
            private val hmF2: JsonField<Double>,
            private val hValTop: JsonField<Double>,
            private val hz: JsonField<Double>,
            private val nmD: JsonField<Double>,
            private val nmE: JsonField<Double>,
            private val nmF1: JsonField<Double>,
            private val nmF2: JsonField<Double>,
            private val nValB: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("b0") @ExcludeMissing b0: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("b1") @ExcludeMissing b1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("chi") @ExcludeMissing chi: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d1") @ExcludeMissing d1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fp1") @ExcludeMissing fp1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("fp2") @ExcludeMissing fp2: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("fp30") @ExcludeMissing fp30: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("fp3U") @ExcludeMissing fp3U: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("ha") @ExcludeMissing ha: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("hdx") @ExcludeMissing hdx: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("hmD") @ExcludeMissing hmD: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("hmE") @ExcludeMissing hmE: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("hmF1") @ExcludeMissing hmF1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("hmF2") @ExcludeMissing hmF2: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("hValTop")
                @ExcludeMissing
                hValTop: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("hz") @ExcludeMissing hz: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("nmD") @ExcludeMissing nmD: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("nmE") @ExcludeMissing nmE: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("nmF1") @ExcludeMissing nmF1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("nmF2") @ExcludeMissing nmF2: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("nValB") @ExcludeMissing nValB: JsonField<Double> = JsonMissing.of(),
            ) : this(
                b0,
                b1,
                chi,
                d1,
                description,
                fp1,
                fp2,
                fp30,
                fp3U,
                ha,
                hdx,
                hmD,
                hmE,
                hmF1,
                hmF2,
                hValTop,
                hz,
                nmD,
                nmE,
                nmF1,
                nmF2,
                nValB,
                mutableMapOf(),
            )

            /**
             * B0 parameter of the F2 layer shape.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun b0(): Optional<Double> = b0.getOptional("b0")

            /**
             * B1 parameter of the F2 layer shape.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun b1(): Optional<Double> = b1.getOptional("b1")

            /**
             * Peak Density Thickness (PDT) for description of the flat-nose shape, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun chi(): Optional<Double> = chi.getOptional("chi")

            /**
             * D1 parameter of the F1 layer shape.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d1(): Optional<Double> = d1.getOptional("d1")

            /**
             * Description of IRI implementation.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * TBD.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fp1(): Optional<Double> = fp1.getOptional("fp1")

            /**
             * TBD.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fp2(): Optional<Double> = fp2.getOptional("fp2")

            /**
             * TBD.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fp30(): Optional<Double> = fp30.getOptional("fp30")

            /**
             * TBD.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fp3U(): Optional<Double> = fp3U.getOptional("fp3U")

            /**
             * Starting height of the D layer, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ha(): Optional<Double> = ha.getOptional("ha")

            /**
             * Height of the intermediate region at the top of D region, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun hdx(): Optional<Double> = hdx.getOptional("hdx")

            /**
             * Peak height of the D layer, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun hmD(): Optional<Double> = hmD.getOptional("hmD")

            /**
             * Peak height of the F2 layer, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun hmE(): Optional<Double> = hmE.getOptional("hmE")

            /**
             * Peak height of the F1 layer, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun hmF1(): Optional<Double> = hmF1.getOptional("hmF1")

            /**
             * Peak height of F2 layer, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun hmF2(): Optional<Double> = hmF2.getOptional("hmF2")

            /**
             * The valley height, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun hValTop(): Optional<Double> = hValTop.getOptional("hValTop")

            /**
             * Height HZ of the interim layer, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun hz(): Optional<Double> = hz.getOptional("hz")

            /**
             * Peak density of the D layer, in per cubic centimeter.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun nmD(): Optional<Double> = nmD.getOptional("nmD")

            /**
             * Peak density of the E layer, in per cubic centimeter.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun nmE(): Optional<Double> = nmE.getOptional("nmE")

            /**
             * Peak density of the F1 layer, in grams per cubic centimeter.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun nmF1(): Optional<Double> = nmF1.getOptional("nmF1")

            /**
             * Peak density of F2 layer, in grams per cubic centimeter.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun nmF2(): Optional<Double> = nmF2.getOptional("nmF2")

            /**
             * The valley depth, in grams per cubic centimeter.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun nValB(): Optional<Double> = nValB.getOptional("nValB")

            /**
             * Returns the raw JSON value of [b0].
             *
             * Unlike [b0], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("b0") @ExcludeMissing fun _b0(): JsonField<Double> = b0

            /**
             * Returns the raw JSON value of [b1].
             *
             * Unlike [b1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("b1") @ExcludeMissing fun _b1(): JsonField<Double> = b1

            /**
             * Returns the raw JSON value of [chi].
             *
             * Unlike [chi], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("chi") @ExcludeMissing fun _chi(): JsonField<Double> = chi

            /**
             * Returns the raw JSON value of [d1].
             *
             * Unlike [d1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d1") @ExcludeMissing fun _d1(): JsonField<Double> = d1

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [fp1].
             *
             * Unlike [fp1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("fp1") @ExcludeMissing fun _fp1(): JsonField<Double> = fp1

            /**
             * Returns the raw JSON value of [fp2].
             *
             * Unlike [fp2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("fp2") @ExcludeMissing fun _fp2(): JsonField<Double> = fp2

            /**
             * Returns the raw JSON value of [fp30].
             *
             * Unlike [fp30], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("fp30") @ExcludeMissing fun _fp30(): JsonField<Double> = fp30

            /**
             * Returns the raw JSON value of [fp3U].
             *
             * Unlike [fp3U], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("fp3U") @ExcludeMissing fun _fp3U(): JsonField<Double> = fp3U

            /**
             * Returns the raw JSON value of [ha].
             *
             * Unlike [ha], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ha") @ExcludeMissing fun _ha(): JsonField<Double> = ha

            /**
             * Returns the raw JSON value of [hdx].
             *
             * Unlike [hdx], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hdx") @ExcludeMissing fun _hdx(): JsonField<Double> = hdx

            /**
             * Returns the raw JSON value of [hmD].
             *
             * Unlike [hmD], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hmD") @ExcludeMissing fun _hmD(): JsonField<Double> = hmD

            /**
             * Returns the raw JSON value of [hmE].
             *
             * Unlike [hmE], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hmE") @ExcludeMissing fun _hmE(): JsonField<Double> = hmE

            /**
             * Returns the raw JSON value of [hmF1].
             *
             * Unlike [hmF1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hmF1") @ExcludeMissing fun _hmF1(): JsonField<Double> = hmF1

            /**
             * Returns the raw JSON value of [hmF2].
             *
             * Unlike [hmF2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hmF2") @ExcludeMissing fun _hmF2(): JsonField<Double> = hmF2

            /**
             * Returns the raw JSON value of [hValTop].
             *
             * Unlike [hValTop], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hValTop") @ExcludeMissing fun _hValTop(): JsonField<Double> = hValTop

            /**
             * Returns the raw JSON value of [hz].
             *
             * Unlike [hz], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hz") @ExcludeMissing fun _hz(): JsonField<Double> = hz

            /**
             * Returns the raw JSON value of [nmD].
             *
             * Unlike [nmD], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("nmD") @ExcludeMissing fun _nmD(): JsonField<Double> = nmD

            /**
             * Returns the raw JSON value of [nmE].
             *
             * Unlike [nmE], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("nmE") @ExcludeMissing fun _nmE(): JsonField<Double> = nmE

            /**
             * Returns the raw JSON value of [nmF1].
             *
             * Unlike [nmF1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("nmF1") @ExcludeMissing fun _nmF1(): JsonField<Double> = nmF1

            /**
             * Returns the raw JSON value of [nmF2].
             *
             * Unlike [nmF2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("nmF2") @ExcludeMissing fun _nmF2(): JsonField<Double> = nmF2

            /**
             * Returns the raw JSON value of [nValB].
             *
             * Unlike [nValB], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("nValB") @ExcludeMissing fun _nValB(): JsonField<Double> = nValB

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

                /** Returns a mutable builder for constructing an instance of [Iri]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Iri]. */
            class Builder internal constructor() {

                private var b0: JsonField<Double> = JsonMissing.of()
                private var b1: JsonField<Double> = JsonMissing.of()
                private var chi: JsonField<Double> = JsonMissing.of()
                private var d1: JsonField<Double> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var fp1: JsonField<Double> = JsonMissing.of()
                private var fp2: JsonField<Double> = JsonMissing.of()
                private var fp30: JsonField<Double> = JsonMissing.of()
                private var fp3U: JsonField<Double> = JsonMissing.of()
                private var ha: JsonField<Double> = JsonMissing.of()
                private var hdx: JsonField<Double> = JsonMissing.of()
                private var hmD: JsonField<Double> = JsonMissing.of()
                private var hmE: JsonField<Double> = JsonMissing.of()
                private var hmF1: JsonField<Double> = JsonMissing.of()
                private var hmF2: JsonField<Double> = JsonMissing.of()
                private var hValTop: JsonField<Double> = JsonMissing.of()
                private var hz: JsonField<Double> = JsonMissing.of()
                private var nmD: JsonField<Double> = JsonMissing.of()
                private var nmE: JsonField<Double> = JsonMissing.of()
                private var nmF1: JsonField<Double> = JsonMissing.of()
                private var nmF2: JsonField<Double> = JsonMissing.of()
                private var nValB: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(iri: Iri) = apply {
                    b0 = iri.b0
                    b1 = iri.b1
                    chi = iri.chi
                    d1 = iri.d1
                    description = iri.description
                    fp1 = iri.fp1
                    fp2 = iri.fp2
                    fp30 = iri.fp30
                    fp3U = iri.fp3U
                    ha = iri.ha
                    hdx = iri.hdx
                    hmD = iri.hmD
                    hmE = iri.hmE
                    hmF1 = iri.hmF1
                    hmF2 = iri.hmF2
                    hValTop = iri.hValTop
                    hz = iri.hz
                    nmD = iri.nmD
                    nmE = iri.nmE
                    nmF1 = iri.nmF1
                    nmF2 = iri.nmF2
                    nValB = iri.nValB
                    additionalProperties = iri.additionalProperties.toMutableMap()
                }

                /** B0 parameter of the F2 layer shape. */
                fun b0(b0: Double) = b0(JsonField.of(b0))

                /**
                 * Sets [Builder.b0] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.b0] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun b0(b0: JsonField<Double>) = apply { this.b0 = b0 }

                /** B1 parameter of the F2 layer shape. */
                fun b1(b1: Double) = b1(JsonField.of(b1))

                /**
                 * Sets [Builder.b1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.b1] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun b1(b1: JsonField<Double>) = apply { this.b1 = b1 }

                /**
                 * Peak Density Thickness (PDT) for description of the flat-nose shape, in
                 * kilometers.
                 */
                fun chi(chi: Double) = chi(JsonField.of(chi))

                /**
                 * Sets [Builder.chi] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chi] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun chi(chi: JsonField<Double>) = apply { this.chi = chi }

                /** D1 parameter of the F1 layer shape. */
                fun d1(d1: Double) = d1(JsonField.of(d1))

                /**
                 * Sets [Builder.d1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d1] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d1(d1: JsonField<Double>) = apply { this.d1 = d1 }

                /** Description of IRI implementation. */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** TBD. */
                fun fp1(fp1: Double) = fp1(JsonField.of(fp1))

                /**
                 * Sets [Builder.fp1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fp1] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun fp1(fp1: JsonField<Double>) = apply { this.fp1 = fp1 }

                /** TBD. */
                fun fp2(fp2: Double) = fp2(JsonField.of(fp2))

                /**
                 * Sets [Builder.fp2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fp2] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun fp2(fp2: JsonField<Double>) = apply { this.fp2 = fp2 }

                /** TBD. */
                fun fp30(fp30: Double) = fp30(JsonField.of(fp30))

                /**
                 * Sets [Builder.fp30] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fp30] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun fp30(fp30: JsonField<Double>) = apply { this.fp30 = fp30 }

                /** TBD. */
                fun fp3U(fp3U: Double) = fp3U(JsonField.of(fp3U))

                /**
                 * Sets [Builder.fp3U] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fp3U] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun fp3U(fp3U: JsonField<Double>) = apply { this.fp3U = fp3U }

                /** Starting height of the D layer, in kilometers. */
                fun ha(ha: Double) = ha(JsonField.of(ha))

                /**
                 * Sets [Builder.ha] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ha] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun ha(ha: JsonField<Double>) = apply { this.ha = ha }

                /** Height of the intermediate region at the top of D region, in kilometers. */
                fun hdx(hdx: Double) = hdx(JsonField.of(hdx))

                /**
                 * Sets [Builder.hdx] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hdx] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun hdx(hdx: JsonField<Double>) = apply { this.hdx = hdx }

                /** Peak height of the D layer, in kilometers. */
                fun hmD(hmD: Double) = hmD(JsonField.of(hmD))

                /**
                 * Sets [Builder.hmD] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hmD] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun hmD(hmD: JsonField<Double>) = apply { this.hmD = hmD }

                /** Peak height of the F2 layer, in kilometers. */
                fun hmE(hmE: Double) = hmE(JsonField.of(hmE))

                /**
                 * Sets [Builder.hmE] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hmE] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun hmE(hmE: JsonField<Double>) = apply { this.hmE = hmE }

                /** Peak height of the F1 layer, in kilometers. */
                fun hmF1(hmF1: Double) = hmF1(JsonField.of(hmF1))

                /**
                 * Sets [Builder.hmF1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hmF1] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun hmF1(hmF1: JsonField<Double>) = apply { this.hmF1 = hmF1 }

                /** Peak height of F2 layer, in kilometers. */
                fun hmF2(hmF2: Double) = hmF2(JsonField.of(hmF2))

                /**
                 * Sets [Builder.hmF2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hmF2] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun hmF2(hmF2: JsonField<Double>) = apply { this.hmF2 = hmF2 }

                /** The valley height, in kilometers. */
                fun hValTop(hValTop: Double) = hValTop(JsonField.of(hValTop))

                /**
                 * Sets [Builder.hValTop] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hValTop] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hValTop(hValTop: JsonField<Double>) = apply { this.hValTop = hValTop }

                /** Height HZ of the interim layer, in kilometers. */
                fun hz(hz: Double) = hz(JsonField.of(hz))

                /**
                 * Sets [Builder.hz] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hz] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun hz(hz: JsonField<Double>) = apply { this.hz = hz }

                /** Peak density of the D layer, in per cubic centimeter. */
                fun nmD(nmD: Double) = nmD(JsonField.of(nmD))

                /**
                 * Sets [Builder.nmD] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nmD] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun nmD(nmD: JsonField<Double>) = apply { this.nmD = nmD }

                /** Peak density of the E layer, in per cubic centimeter. */
                fun nmE(nmE: Double) = nmE(JsonField.of(nmE))

                /**
                 * Sets [Builder.nmE] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nmE] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun nmE(nmE: JsonField<Double>) = apply { this.nmE = nmE }

                /** Peak density of the F1 layer, in grams per cubic centimeter. */
                fun nmF1(nmF1: Double) = nmF1(JsonField.of(nmF1))

                /**
                 * Sets [Builder.nmF1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nmF1] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun nmF1(nmF1: JsonField<Double>) = apply { this.nmF1 = nmF1 }

                /** Peak density of F2 layer, in grams per cubic centimeter. */
                fun nmF2(nmF2: Double) = nmF2(JsonField.of(nmF2))

                /**
                 * Sets [Builder.nmF2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nmF2] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun nmF2(nmF2: JsonField<Double>) = apply { this.nmF2 = nmF2 }

                /** The valley depth, in grams per cubic centimeter. */
                fun nValB(nValB: Double) = nValB(JsonField.of(nValB))

                /**
                 * Sets [Builder.nValB] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nValB] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun nValB(nValB: JsonField<Double>) = apply { this.nValB = nValB }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Iri].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Iri =
                    Iri(
                        b0,
                        b1,
                        chi,
                        d1,
                        description,
                        fp1,
                        fp2,
                        fp30,
                        fp3U,
                        ha,
                        hdx,
                        hmD,
                        hmE,
                        hmF1,
                        hmF2,
                        hValTop,
                        hz,
                        nmD,
                        nmE,
                        nmF1,
                        nmF2,
                        nValB,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Iri = apply {
                if (validated) {
                    return@apply
                }

                b0()
                b1()
                chi()
                d1()
                description()
                fp1()
                fp2()
                fp30()
                fp3U()
                ha()
                hdx()
                hmD()
                hmE()
                hmF1()
                hmF2()
                hValTop()
                hz()
                nmD()
                nmE()
                nmF1()
                nmF2()
                nValB()
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
                (if (b0.asKnown().isPresent) 1 else 0) +
                    (if (b1.asKnown().isPresent) 1 else 0) +
                    (if (chi.asKnown().isPresent) 1 else 0) +
                    (if (d1.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (fp1.asKnown().isPresent) 1 else 0) +
                    (if (fp2.asKnown().isPresent) 1 else 0) +
                    (if (fp30.asKnown().isPresent) 1 else 0) +
                    (if (fp3U.asKnown().isPresent) 1 else 0) +
                    (if (ha.asKnown().isPresent) 1 else 0) +
                    (if (hdx.asKnown().isPresent) 1 else 0) +
                    (if (hmD.asKnown().isPresent) 1 else 0) +
                    (if (hmE.asKnown().isPresent) 1 else 0) +
                    (if (hmF1.asKnown().isPresent) 1 else 0) +
                    (if (hmF2.asKnown().isPresent) 1 else 0) +
                    (if (hValTop.asKnown().isPresent) 1 else 0) +
                    (if (hz.asKnown().isPresent) 1 else 0) +
                    (if (nmD.asKnown().isPresent) 1 else 0) +
                    (if (nmE.asKnown().isPresent) 1 else 0) +
                    (if (nmF1.asKnown().isPresent) 1 else 0) +
                    (if (nmF2.asKnown().isPresent) 1 else 0) +
                    (if (nValB.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Iri &&
                    b0 == other.b0 &&
                    b1 == other.b1 &&
                    chi == other.chi &&
                    d1 == other.d1 &&
                    description == other.description &&
                    fp1 == other.fp1 &&
                    fp2 == other.fp2 &&
                    fp30 == other.fp30 &&
                    fp3U == other.fp3U &&
                    ha == other.ha &&
                    hdx == other.hdx &&
                    hmD == other.hmD &&
                    hmE == other.hmE &&
                    hmF1 == other.hmF1 &&
                    hmF2 == other.hmF2 &&
                    hValTop == other.hValTop &&
                    hz == other.hz &&
                    nmD == other.nmD &&
                    nmE == other.nmE &&
                    nmF1 == other.nmF1 &&
                    nmF2 == other.nmF2 &&
                    nValB == other.nValB &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    b0,
                    b1,
                    chi,
                    d1,
                    description,
                    fp1,
                    fp2,
                    fp30,
                    fp3U,
                    ha,
                    hdx,
                    hmD,
                    hmE,
                    hmF1,
                    hmF2,
                    hValTop,
                    hz,
                    nmD,
                    nmE,
                    nmF1,
                    nmF2,
                    nValB,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Iri{b0=$b0, b1=$b1, chi=$chi, d1=$d1, description=$description, fp1=$fp1, fp2=$fp2, fp30=$fp30, fp3U=$fp3U, ha=$ha, hdx=$hdx, hmD=$hmD, hmE=$hmE, hmF1=$hmF1, hmF2=$hmF2, hValTop=$hValTop, hz=$hz, nmD=$nmD, nmE=$nmE, nmF1=$nmF1, nmF2=$nmF2, nValB=$nValB, additionalProperties=$additionalProperties}"
        }

        /** Coefficients to describe the E, F1, and F2 layers as parabolic-shape segments. */
        class Parabolic
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val description: JsonField<String>,
            private val parabolicItems: JsonField<List<ParabolicItem>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parabolicItems")
                @ExcludeMissing
                parabolicItems: JsonField<List<ParabolicItem>> = JsonMissing.of(),
            ) : this(description, parabolicItems, mutableMapOf())

            /**
             * General description of the QP computation algorithm.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Describes the E, F1, and F2 layers as parabolic-shape segments.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun parabolicItems(): Optional<List<ParabolicItem>> =
                parabolicItems.getOptional("parabolicItems")

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [parabolicItems].
             *
             * Unlike [parabolicItems], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("parabolicItems")
            @ExcludeMissing
            fun _parabolicItems(): JsonField<List<ParabolicItem>> = parabolicItems

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

                /** Returns a mutable builder for constructing an instance of [Parabolic]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Parabolic]. */
            class Builder internal constructor() {

                private var description: JsonField<String> = JsonMissing.of()
                private var parabolicItems: JsonField<MutableList<ParabolicItem>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(parabolic: Parabolic) = apply {
                    description = parabolic.description
                    parabolicItems = parabolic.parabolicItems.map { it.toMutableList() }
                    additionalProperties = parabolic.additionalProperties.toMutableMap()
                }

                /** General description of the QP computation algorithm. */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Describes the E, F1, and F2 layers as parabolic-shape segments. */
                fun parabolicItems(parabolicItems: List<ParabolicItem>) =
                    parabolicItems(JsonField.of(parabolicItems))

                /**
                 * Sets [Builder.parabolicItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parabolicItems] with a well-typed
                 * `List<ParabolicItem>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun parabolicItems(parabolicItems: JsonField<List<ParabolicItem>>) = apply {
                    this.parabolicItems = parabolicItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ParabolicItem] to [parabolicItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addParabolicItem(parabolicItem: ParabolicItem) = apply {
                    parabolicItems =
                        (parabolicItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("parabolicItems", it).add(parabolicItem)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Parabolic].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Parabolic =
                    Parabolic(
                        description,
                        (parabolicItems ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Parabolic = apply {
                if (validated) {
                    return@apply
                }

                description()
                parabolicItems().ifPresent { it.forEach { it.validate() } }
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
                (if (description.asKnown().isPresent) 1 else 0) +
                    (parabolicItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** Describes the E, F1, and F2 layers as parabolic-shape segments. */
            class ParabolicItem
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val f: JsonField<Double>,
                private val layer: JsonField<String>,
                private val y: JsonField<Double>,
                private val z: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("f") @ExcludeMissing f: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("layer")
                    @ExcludeMissing
                    layer: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("y") @ExcludeMissing y: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("z") @ExcludeMissing z: JsonField<Double> = JsonMissing.of(),
                ) : this(f, layer, y, z, mutableMapOf())

                /**
                 * Plasma frequency at the layer peak, in MHz.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun f(): Optional<Double> = f.getOptional("f")

                /**
                 * Ionospheric plasma layer (E, F1, or F2).
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun layer(): Optional<String> = layer.getOptional("layer")

                /**
                 * Half-thickness of the layer, in kilometers.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun y(): Optional<Double> = y.getOptional("y")

                /**
                 * Height of the layer peak, in kilometers.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun z(): Optional<Double> = z.getOptional("z")

                /**
                 * Returns the raw JSON value of [f].
                 *
                 * Unlike [f], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("f") @ExcludeMissing fun _f(): JsonField<Double> = f

                /**
                 * Returns the raw JSON value of [layer].
                 *
                 * Unlike [layer], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("layer") @ExcludeMissing fun _layer(): JsonField<String> = layer

                /**
                 * Returns the raw JSON value of [y].
                 *
                 * Unlike [y], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("y") @ExcludeMissing fun _y(): JsonField<Double> = y

                /**
                 * Returns the raw JSON value of [z].
                 *
                 * Unlike [z], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("z") @ExcludeMissing fun _z(): JsonField<Double> = z

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
                     * Returns a mutable builder for constructing an instance of [ParabolicItem].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ParabolicItem]. */
                class Builder internal constructor() {

                    private var f: JsonField<Double> = JsonMissing.of()
                    private var layer: JsonField<String> = JsonMissing.of()
                    private var y: JsonField<Double> = JsonMissing.of()
                    private var z: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(parabolicItem: ParabolicItem) = apply {
                        f = parabolicItem.f
                        layer = parabolicItem.layer
                        y = parabolicItem.y
                        z = parabolicItem.z
                        additionalProperties = parabolicItem.additionalProperties.toMutableMap()
                    }

                    /** Plasma frequency at the layer peak, in MHz. */
                    fun f(f: Double) = f(JsonField.of(f))

                    /**
                     * Sets [Builder.f] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.f] with a well-typed [Double] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun f(f: JsonField<Double>) = apply { this.f = f }

                    /** Ionospheric plasma layer (E, F1, or F2). */
                    fun layer(layer: String) = layer(JsonField.of(layer))

                    /**
                     * Sets [Builder.layer] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.layer] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun layer(layer: JsonField<String>) = apply { this.layer = layer }

                    /** Half-thickness of the layer, in kilometers. */
                    fun y(y: Double) = y(JsonField.of(y))

                    /**
                     * Sets [Builder.y] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.y] with a well-typed [Double] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun y(y: JsonField<Double>) = apply { this.y = y }

                    /** Height of the layer peak, in kilometers. */
                    fun z(z: Double) = z(JsonField.of(z))

                    /**
                     * Sets [Builder.z] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.z] with a well-typed [Double] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun z(z: JsonField<Double>) = apply { this.z = z }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ParabolicItem].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ParabolicItem =
                        ParabolicItem(f, layer, y, z, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): ParabolicItem = apply {
                    if (validated) {
                        return@apply
                    }

                    f()
                    layer()
                    y()
                    z()
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
                    (if (f.asKnown().isPresent) 1 else 0) +
                        (if (layer.asKnown().isPresent) 1 else 0) +
                        (if (y.asKnown().isPresent) 1 else 0) +
                        (if (z.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ParabolicItem &&
                        f == other.f &&
                        layer == other.layer &&
                        y == other.y &&
                        z == other.z &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(f, layer, y, z, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ParabolicItem{f=$f, layer=$layer, y=$y, z=$z, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Parabolic &&
                    description == other.description &&
                    parabolicItems == other.parabolicItems &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(description, parabolicItems, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Parabolic{description=$description, parabolicItems=$parabolicItems, additionalProperties=$additionalProperties}"
        }

        /** Coefficients to describe profile shape as quasi-parabolic segments. */
        class QuasiParabolic
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val description: JsonField<String>,
            private val earthRadius: JsonField<Double>,
            private val quasiParabolicSegments: JsonField<List<QuasiParabolicSegment>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("earthRadius")
                @ExcludeMissing
                earthRadius: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quasiParabolicSegments")
                @ExcludeMissing
                quasiParabolicSegments: JsonField<List<QuasiParabolicSegment>> = JsonMissing.of(),
            ) : this(description, earthRadius, quasiParabolicSegments, mutableMapOf())

            /**
             * General description of the quasi-parabolic computation algorithm.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Value of the Earth's radius, in kilometers, used for computations.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun earthRadius(): Optional<Double> = earthRadius.getOptional("earthRadius")

            /**
             * Array of quasi-parabolic segments. Each segment is the best-fit 3-parameter
             * quasi-parabolas defined via A, B, C coefficients, f^2=A/r^2+B/r+C”. Usually 3 groups
             * for E, F1, and F2 layers, but additional segments may be used to improve accuracy.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun quasiParabolicSegments(): Optional<List<QuasiParabolicSegment>> =
                quasiParabolicSegments.getOptional("quasiParabolicSegments")

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [earthRadius].
             *
             * Unlike [earthRadius], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("earthRadius")
            @ExcludeMissing
            fun _earthRadius(): JsonField<Double> = earthRadius

            /**
             * Returns the raw JSON value of [quasiParabolicSegments].
             *
             * Unlike [quasiParabolicSegments], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("quasiParabolicSegments")
            @ExcludeMissing
            fun _quasiParabolicSegments(): JsonField<List<QuasiParabolicSegment>> =
                quasiParabolicSegments

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

                /** Returns a mutable builder for constructing an instance of [QuasiParabolic]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [QuasiParabolic]. */
            class Builder internal constructor() {

                private var description: JsonField<String> = JsonMissing.of()
                private var earthRadius: JsonField<Double> = JsonMissing.of()
                private var quasiParabolicSegments: JsonField<MutableList<QuasiParabolicSegment>>? =
                    null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(quasiParabolic: QuasiParabolic) = apply {
                    description = quasiParabolic.description
                    earthRadius = quasiParabolic.earthRadius
                    quasiParabolicSegments =
                        quasiParabolic.quasiParabolicSegments.map { it.toMutableList() }
                    additionalProperties = quasiParabolic.additionalProperties.toMutableMap()
                }

                /** General description of the quasi-parabolic computation algorithm. */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Value of the Earth's radius, in kilometers, used for computations. */
                fun earthRadius(earthRadius: Double) = earthRadius(JsonField.of(earthRadius))

                /**
                 * Sets [Builder.earthRadius] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.earthRadius] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun earthRadius(earthRadius: JsonField<Double>) = apply {
                    this.earthRadius = earthRadius
                }

                /**
                 * Array of quasi-parabolic segments. Each segment is the best-fit 3-parameter
                 * quasi-parabolas defined via A, B, C coefficients, f^2=A/r^2+B/r+C”. Usually 3
                 * groups for E, F1, and F2 layers, but additional segments may be used to improve
                 * accuracy.
                 */
                fun quasiParabolicSegments(quasiParabolicSegments: List<QuasiParabolicSegment>) =
                    quasiParabolicSegments(JsonField.of(quasiParabolicSegments))

                /**
                 * Sets [Builder.quasiParabolicSegments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quasiParabolicSegments] with a well-typed
                 * `List<QuasiParabolicSegment>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun quasiParabolicSegments(
                    quasiParabolicSegments: JsonField<List<QuasiParabolicSegment>>
                ) = apply {
                    this.quasiParabolicSegments = quasiParabolicSegments.map { it.toMutableList() }
                }

                /**
                 * Adds a single [QuasiParabolicSegment] to [quasiParabolicSegments].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addQuasiParabolicSegment(quasiParabolicSegment: QuasiParabolicSegment) = apply {
                    quasiParabolicSegments =
                        (quasiParabolicSegments ?: JsonField.of(mutableListOf())).also {
                            checkKnown("quasiParabolicSegments", it).add(quasiParabolicSegment)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [QuasiParabolic].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): QuasiParabolic =
                    QuasiParabolic(
                        description,
                        earthRadius,
                        (quasiParabolicSegments ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): QuasiParabolic = apply {
                if (validated) {
                    return@apply
                }

                description()
                earthRadius()
                quasiParabolicSegments().ifPresent { it.forEach { it.validate() } }
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
                (if (description.asKnown().isPresent) 1 else 0) +
                    (if (earthRadius.asKnown().isPresent) 1 else 0) +
                    (quasiParabolicSegments.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0)

            /**
             * A quasi-parabolic segment is the best-fit 3-parameter quasi-parabolas defined via A,
             * B, C coefficients, f^2=A/r^2+B/r+C”. Usually 3 groups for E, F1, and F2 layers, but
             * additional segments may be used to improve accuracy.
             */
            class QuasiParabolicSegment
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val a: JsonField<Double>,
                private val b: JsonField<Double>,
                private val c: JsonField<Double>,
                private val error: JsonField<Double>,
                private val index: JsonField<Int>,
                private val rb: JsonField<Double>,
                private val re: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("a") @ExcludeMissing a: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("b") @ExcludeMissing b: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("c") @ExcludeMissing c: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("error")
                    @ExcludeMissing
                    error: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("index") @ExcludeMissing index: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("rb") @ExcludeMissing rb: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("re") @ExcludeMissing re: JsonField<Double> = JsonMissing.of(),
                ) : this(a, b, c, error, index, rb, re, mutableMapOf())

                /**
                 * Coefficient A.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun a(): Optional<Double> = a.getOptional("a")

                /**
                 * Coefficient B.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun b(): Optional<Double> = b.getOptional("b")

                /**
                 * Coefficient C.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun c(): Optional<Double> = c.getOptional("c")

                /**
                 * Best-fit error.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun error(): Optional<Double> = error.getOptional("error")

                /**
                 * The index of this segment in the list, from 1 to NumSegments.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun index(): Optional<Int> = index.getOptional("index")

                /**
                 * Starting range of the segment, in kilometers from the Earth's center.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun rb(): Optional<Double> = rb.getOptional("rb")

                /**
                 * Ending range of the segment, in kilometers from the Earth's center.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun re(): Optional<Double> = re.getOptional("re")

                /**
                 * Returns the raw JSON value of [a].
                 *
                 * Unlike [a], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("a") @ExcludeMissing fun _a(): JsonField<Double> = a

                /**
                 * Returns the raw JSON value of [b].
                 *
                 * Unlike [b], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("b") @ExcludeMissing fun _b(): JsonField<Double> = b

                /**
                 * Returns the raw JSON value of [c].
                 *
                 * Unlike [c], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("c") @ExcludeMissing fun _c(): JsonField<Double> = c

                /**
                 * Returns the raw JSON value of [error].
                 *
                 * Unlike [error], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Double> = error

                /**
                 * Returns the raw JSON value of [index].
                 *
                 * Unlike [index], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Int> = index

                /**
                 * Returns the raw JSON value of [rb].
                 *
                 * Unlike [rb], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("rb") @ExcludeMissing fun _rb(): JsonField<Double> = rb

                /**
                 * Returns the raw JSON value of [re].
                 *
                 * Unlike [re], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("re") @ExcludeMissing fun _re(): JsonField<Double> = re

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
                     * [QuasiParabolicSegment].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [QuasiParabolicSegment]. */
                class Builder internal constructor() {

                    private var a: JsonField<Double> = JsonMissing.of()
                    private var b: JsonField<Double> = JsonMissing.of()
                    private var c: JsonField<Double> = JsonMissing.of()
                    private var error: JsonField<Double> = JsonMissing.of()
                    private var index: JsonField<Int> = JsonMissing.of()
                    private var rb: JsonField<Double> = JsonMissing.of()
                    private var re: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(quasiParabolicSegment: QuasiParabolicSegment) = apply {
                        a = quasiParabolicSegment.a
                        b = quasiParabolicSegment.b
                        c = quasiParabolicSegment.c
                        error = quasiParabolicSegment.error
                        index = quasiParabolicSegment.index
                        rb = quasiParabolicSegment.rb
                        re = quasiParabolicSegment.re
                        additionalProperties =
                            quasiParabolicSegment.additionalProperties.toMutableMap()
                    }

                    /** Coefficient A. */
                    fun a(a: Double) = a(JsonField.of(a))

                    /**
                     * Sets [Builder.a] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.a] with a well-typed [Double] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun a(a: JsonField<Double>) = apply { this.a = a }

                    /** Coefficient B. */
                    fun b(b: Double) = b(JsonField.of(b))

                    /**
                     * Sets [Builder.b] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.b] with a well-typed [Double] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun b(b: JsonField<Double>) = apply { this.b = b }

                    /** Coefficient C. */
                    fun c(c: Double) = c(JsonField.of(c))

                    /**
                     * Sets [Builder.c] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.c] with a well-typed [Double] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun c(c: JsonField<Double>) = apply { this.c = c }

                    /** Best-fit error. */
                    fun error(error: Double) = error(JsonField.of(error))

                    /**
                     * Sets [Builder.error] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.error] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun error(error: JsonField<Double>) = apply { this.error = error }

                    /** The index of this segment in the list, from 1 to NumSegments. */
                    fun index(index: Int) = index(JsonField.of(index))

                    /**
                     * Sets [Builder.index] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.index] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun index(index: JsonField<Int>) = apply { this.index = index }

                    /** Starting range of the segment, in kilometers from the Earth's center. */
                    fun rb(rb: Double) = rb(JsonField.of(rb))

                    /**
                     * Sets [Builder.rb] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rb] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun rb(rb: JsonField<Double>) = apply { this.rb = rb }

                    /** Ending range of the segment, in kilometers from the Earth's center. */
                    fun re(re: Double) = re(JsonField.of(re))

                    /**
                     * Sets [Builder.re] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.re] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun re(re: JsonField<Double>) = apply { this.re = re }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [QuasiParabolicSegment].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): QuasiParabolicSegment =
                        QuasiParabolicSegment(
                            a,
                            b,
                            c,
                            error,
                            index,
                            rb,
                            re,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): QuasiParabolicSegment = apply {
                    if (validated) {
                        return@apply
                    }

                    a()
                    b()
                    c()
                    error()
                    index()
                    rb()
                    re()
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
                    (if (a.asKnown().isPresent) 1 else 0) +
                        (if (b.asKnown().isPresent) 1 else 0) +
                        (if (c.asKnown().isPresent) 1 else 0) +
                        (if (error.asKnown().isPresent) 1 else 0) +
                        (if (index.asKnown().isPresent) 1 else 0) +
                        (if (rb.asKnown().isPresent) 1 else 0) +
                        (if (re.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is QuasiParabolicSegment &&
                        a == other.a &&
                        b == other.b &&
                        c == other.c &&
                        error == other.error &&
                        index == other.index &&
                        rb == other.rb &&
                        re == other.re &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(a, b, c, error, index, rb, re, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "QuasiParabolicSegment{a=$a, b=$b, c=$c, error=$error, index=$index, rb=$rb, re=$re, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is QuasiParabolic &&
                    description == other.description &&
                    earthRadius == other.earthRadius &&
                    quasiParabolicSegments == other.quasiParabolicSegments &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(description, earthRadius, quasiParabolicSegments, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "QuasiParabolic{description=$description, earthRadius=$earthRadius, quasiParabolicSegments=$quasiParabolicSegments, additionalProperties=$additionalProperties}"
        }

        /**
         * Coefficients to describe either the E, F1, and bottomside F2 profile shapes or the height
         * uncertainty boundaries.
         */
        class ShiftedChebyshev
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val description: JsonField<String>,
            private val shiftedChebyshevs: JsonField<List<InnerShiftedChebyshev>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("shiftedChebyshevs")
                @ExcludeMissing
                shiftedChebyshevs: JsonField<List<InnerShiftedChebyshev>> = JsonMissing.of(),
            ) : this(description, shiftedChebyshevs, mutableMapOf())

            /**
             * Description of the computation technique.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Up to 3 groups of coefficients, using “shiftedChebyshev” sub-field, to describe E,
             * F1, and bottomside F2 profile shapes, or up to 6 groups of coefficients to describe
             * height uncertainty boundaries (upper and lower).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun shiftedChebyshevs(): Optional<List<InnerShiftedChebyshev>> =
                shiftedChebyshevs.getOptional("shiftedChebyshevs")

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [shiftedChebyshevs].
             *
             * Unlike [shiftedChebyshevs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("shiftedChebyshevs")
            @ExcludeMissing
            fun _shiftedChebyshevs(): JsonField<List<InnerShiftedChebyshev>> = shiftedChebyshevs

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

                /** Returns a mutable builder for constructing an instance of [ShiftedChebyshev]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ShiftedChebyshev]. */
            class Builder internal constructor() {

                private var description: JsonField<String> = JsonMissing.of()
                private var shiftedChebyshevs: JsonField<MutableList<InnerShiftedChebyshev>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(shiftedChebyshev: ShiftedChebyshev) = apply {
                    description = shiftedChebyshev.description
                    shiftedChebyshevs =
                        shiftedChebyshev.shiftedChebyshevs.map { it.toMutableList() }
                    additionalProperties = shiftedChebyshev.additionalProperties.toMutableMap()
                }

                /** Description of the computation technique. */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * Up to 3 groups of coefficients, using “shiftedChebyshev” sub-field, to describe
                 * E, F1, and bottomside F2 profile shapes, or up to 6 groups of coefficients to
                 * describe height uncertainty boundaries (upper and lower).
                 */
                fun shiftedChebyshevs(shiftedChebyshevs: List<InnerShiftedChebyshev>) =
                    shiftedChebyshevs(JsonField.of(shiftedChebyshevs))

                /**
                 * Sets [Builder.shiftedChebyshevs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shiftedChebyshevs] with a well-typed
                 * `List<InnerShiftedChebyshev>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun shiftedChebyshevs(shiftedChebyshevs: JsonField<List<InnerShiftedChebyshev>>) =
                    apply {
                        this.shiftedChebyshevs = shiftedChebyshevs.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [InnerShiftedChebyshev] to [shiftedChebyshevs].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addShiftedChebyshev(shiftedChebyshev: InnerShiftedChebyshev) = apply {
                    shiftedChebyshevs =
                        (shiftedChebyshevs ?: JsonField.of(mutableListOf())).also {
                            checkKnown("shiftedChebyshevs", it).add(shiftedChebyshev)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ShiftedChebyshev].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ShiftedChebyshev =
                    ShiftedChebyshev(
                        description,
                        (shiftedChebyshevs ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ShiftedChebyshev = apply {
                if (validated) {
                    return@apply
                }

                description()
                shiftedChebyshevs().ifPresent { it.forEach { it.validate() } }
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
                (if (description.asKnown().isPresent) 1 else 0) +
                    (shiftedChebyshevs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /**
             * Coefficients, using ‘shiftedChebyshev’ sub-field, to describe E, F1, and bottomside
             * F2 profile shapes, or height uncertainty boundaries (upper and lower).
             */
            class InnerShiftedChebyshev
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val coeffs: JsonField<List<Double>>,
                private val error: JsonField<Double>,
                private val fstart: JsonField<Double>,
                private val fstop: JsonField<Double>,
                private val layer: JsonField<String>,
                private val n: JsonField<Int>,
                private val peakheight: JsonField<Double>,
                private val zhalfNm: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("coeffs")
                    @ExcludeMissing
                    coeffs: JsonField<List<Double>> = JsonMissing.of(),
                    @JsonProperty("error")
                    @ExcludeMissing
                    error: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("fstart")
                    @ExcludeMissing
                    fstart: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("fstop")
                    @ExcludeMissing
                    fstop: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("layer")
                    @ExcludeMissing
                    layer: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("n") @ExcludeMissing n: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("peakheight")
                    @ExcludeMissing
                    peakheight: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("zhalfNm")
                    @ExcludeMissing
                    zhalfNm: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    coeffs,
                    error,
                    fstart,
                    fstop,
                    layer,
                    n,
                    peakheight,
                    zhalfNm,
                    mutableMapOf(),
                )

                /**
                 * Array of coefficients.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun coeffs(): Optional<List<Double>> = coeffs.getOptional("coeffs")

                /**
                 * Best fit error.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun error(): Optional<Double> = error.getOptional("error")

                /**
                 * Start frequency of the layer, in MHz.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun fstart(): Optional<Double> = fstart.getOptional("fstart")

                /**
                 * Stop frequency of the layer, in MHz.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun fstop(): Optional<Double> = fstop.getOptional("fstop")

                /**
                 * The ionospheric plasma layer.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun layer(): Optional<String> = layer.getOptional("layer")

                /**
                 * Number of coefficients in the expansion.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun n(): Optional<Int> = n.getOptional("n")

                /**
                 * Peak height of the layer, in kilometers.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun peakheight(): Optional<Double> = peakheight.getOptional("peakheight")

                /**
                 * Height at which density is half of the peak Nm, in kilometers.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun zhalfNm(): Optional<Double> = zhalfNm.getOptional("zhalfNm")

                /**
                 * Returns the raw JSON value of [coeffs].
                 *
                 * Unlike [coeffs], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("coeffs")
                @ExcludeMissing
                fun _coeffs(): JsonField<List<Double>> = coeffs

                /**
                 * Returns the raw JSON value of [error].
                 *
                 * Unlike [error], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Double> = error

                /**
                 * Returns the raw JSON value of [fstart].
                 *
                 * Unlike [fstart], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fstart") @ExcludeMissing fun _fstart(): JsonField<Double> = fstart

                /**
                 * Returns the raw JSON value of [fstop].
                 *
                 * Unlike [fstop], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fstop") @ExcludeMissing fun _fstop(): JsonField<Double> = fstop

                /**
                 * Returns the raw JSON value of [layer].
                 *
                 * Unlike [layer], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("layer") @ExcludeMissing fun _layer(): JsonField<String> = layer

                /**
                 * Returns the raw JSON value of [n].
                 *
                 * Unlike [n], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("n") @ExcludeMissing fun _n(): JsonField<Int> = n

                /**
                 * Returns the raw JSON value of [peakheight].
                 *
                 * Unlike [peakheight], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("peakheight")
                @ExcludeMissing
                fun _peakheight(): JsonField<Double> = peakheight

                /**
                 * Returns the raw JSON value of [zhalfNm].
                 *
                 * Unlike [zhalfNm], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("zhalfNm") @ExcludeMissing fun _zhalfNm(): JsonField<Double> = zhalfNm

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
                     * [InnerShiftedChebyshev].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [InnerShiftedChebyshev]. */
                class Builder internal constructor() {

                    private var coeffs: JsonField<MutableList<Double>>? = null
                    private var error: JsonField<Double> = JsonMissing.of()
                    private var fstart: JsonField<Double> = JsonMissing.of()
                    private var fstop: JsonField<Double> = JsonMissing.of()
                    private var layer: JsonField<String> = JsonMissing.of()
                    private var n: JsonField<Int> = JsonMissing.of()
                    private var peakheight: JsonField<Double> = JsonMissing.of()
                    private var zhalfNm: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(innerShiftedChebyshev: InnerShiftedChebyshev) = apply {
                        coeffs = innerShiftedChebyshev.coeffs.map { it.toMutableList() }
                        error = innerShiftedChebyshev.error
                        fstart = innerShiftedChebyshev.fstart
                        fstop = innerShiftedChebyshev.fstop
                        layer = innerShiftedChebyshev.layer
                        n = innerShiftedChebyshev.n
                        peakheight = innerShiftedChebyshev.peakheight
                        zhalfNm = innerShiftedChebyshev.zhalfNm
                        additionalProperties =
                            innerShiftedChebyshev.additionalProperties.toMutableMap()
                    }

                    /** Array of coefficients. */
                    fun coeffs(coeffs: List<Double>) = coeffs(JsonField.of(coeffs))

                    /**
                     * Sets [Builder.coeffs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.coeffs] with a well-typed `List<Double>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun coeffs(coeffs: JsonField<List<Double>>) = apply {
                        this.coeffs = coeffs.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Double] to [coeffs].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addCoeff(coeff: Double) = apply {
                        coeffs =
                            (coeffs ?: JsonField.of(mutableListOf())).also {
                                checkKnown("coeffs", it).add(coeff)
                            }
                    }

                    /** Best fit error. */
                    fun error(error: Double) = error(JsonField.of(error))

                    /**
                     * Sets [Builder.error] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.error] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun error(error: JsonField<Double>) = apply { this.error = error }

                    /** Start frequency of the layer, in MHz. */
                    fun fstart(fstart: Double) = fstart(JsonField.of(fstart))

                    /**
                     * Sets [Builder.fstart] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fstart] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fstart(fstart: JsonField<Double>) = apply { this.fstart = fstart }

                    /** Stop frequency of the layer, in MHz. */
                    fun fstop(fstop: Double) = fstop(JsonField.of(fstop))

                    /**
                     * Sets [Builder.fstop] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fstop] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fstop(fstop: JsonField<Double>) = apply { this.fstop = fstop }

                    /** The ionospheric plasma layer. */
                    fun layer(layer: String) = layer(JsonField.of(layer))

                    /**
                     * Sets [Builder.layer] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.layer] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun layer(layer: JsonField<String>) = apply { this.layer = layer }

                    /** Number of coefficients in the expansion. */
                    fun n(n: Int) = n(JsonField.of(n))

                    /**
                     * Sets [Builder.n] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.n] with a well-typed [Int] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun n(n: JsonField<Int>) = apply { this.n = n }

                    /** Peak height of the layer, in kilometers. */
                    fun peakheight(peakheight: Double) = peakheight(JsonField.of(peakheight))

                    /**
                     * Sets [Builder.peakheight] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.peakheight] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun peakheight(peakheight: JsonField<Double>) = apply {
                        this.peakheight = peakheight
                    }

                    /** Height at which density is half of the peak Nm, in kilometers. */
                    fun zhalfNm(zhalfNm: Double) = zhalfNm(JsonField.of(zhalfNm))

                    /**
                     * Sets [Builder.zhalfNm] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.zhalfNm] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun zhalfNm(zhalfNm: JsonField<Double>) = apply { this.zhalfNm = zhalfNm }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [InnerShiftedChebyshev].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): InnerShiftedChebyshev =
                        InnerShiftedChebyshev(
                            (coeffs ?: JsonMissing.of()).map { it.toImmutable() },
                            error,
                            fstart,
                            fstop,
                            layer,
                            n,
                            peakheight,
                            zhalfNm,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): InnerShiftedChebyshev = apply {
                    if (validated) {
                        return@apply
                    }

                    coeffs()
                    error()
                    fstart()
                    fstop()
                    layer()
                    n()
                    peakheight()
                    zhalfNm()
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
                    (coeffs.asKnown().getOrNull()?.size ?: 0) +
                        (if (error.asKnown().isPresent) 1 else 0) +
                        (if (fstart.asKnown().isPresent) 1 else 0) +
                        (if (fstop.asKnown().isPresent) 1 else 0) +
                        (if (layer.asKnown().isPresent) 1 else 0) +
                        (if (n.asKnown().isPresent) 1 else 0) +
                        (if (peakheight.asKnown().isPresent) 1 else 0) +
                        (if (zhalfNm.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InnerShiftedChebyshev &&
                        coeffs == other.coeffs &&
                        error == other.error &&
                        fstart == other.fstart &&
                        fstop == other.fstop &&
                        layer == other.layer &&
                        n == other.n &&
                        peakheight == other.peakheight &&
                        zhalfNm == other.zhalfNm &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        coeffs,
                        error,
                        fstart,
                        fstop,
                        layer,
                        n,
                        peakheight,
                        zhalfNm,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InnerShiftedChebyshev{coeffs=$coeffs, error=$error, fstart=$fstart, fstop=$fstop, layer=$layer, n=$n, peakheight=$peakheight, zhalfNm=$zhalfNm, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ShiftedChebyshev &&
                    description == other.description &&
                    shiftedChebyshevs == other.shiftedChebyshevs &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(description, shiftedChebyshevs, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ShiftedChebyshev{description=$description, shiftedChebyshevs=$shiftedChebyshevs, additionalProperties=$additionalProperties}"
        }

        /** Parameters of the constant-scale-height Chapman layer. */
        class TopsideExtensionChapmanConst
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val chi: JsonField<Double>,
            private val description: JsonField<String>,
            private val hmF2: JsonField<Double>,
            private val nmF2: JsonField<Double>,
            private val scaleF2: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("chi") @ExcludeMissing chi: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("hmF2") @ExcludeMissing hmF2: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("nmF2") @ExcludeMissing nmF2: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("scaleF2")
                @ExcludeMissing
                scaleF2: JsonField<Double> = JsonMissing.of(),
            ) : this(chi, description, hmF2, nmF2, scaleF2, mutableMapOf())

            /**
             * Peak Density Thickness (PDT) for description of the flat-nose shape, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun chi(): Optional<Double> = chi.getOptional("chi")

            /**
             * Description of the Chapman computation technique.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Peak height of F2 layer, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun hmF2(): Optional<Double> = hmF2.getOptional("hmF2")

            /**
             * Peak density of F2 layer, in grams per cubic centimeter.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun nmF2(): Optional<Double> = nmF2.getOptional("nmF2")

            /**
             * Scale height if F2 layer at the peak, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun scaleF2(): Optional<Double> = scaleF2.getOptional("scaleF2")

            /**
             * Returns the raw JSON value of [chi].
             *
             * Unlike [chi], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("chi") @ExcludeMissing fun _chi(): JsonField<Double> = chi

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [hmF2].
             *
             * Unlike [hmF2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hmF2") @ExcludeMissing fun _hmF2(): JsonField<Double> = hmF2

            /**
             * Returns the raw JSON value of [nmF2].
             *
             * Unlike [nmF2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("nmF2") @ExcludeMissing fun _nmF2(): JsonField<Double> = nmF2

            /**
             * Returns the raw JSON value of [scaleF2].
             *
             * Unlike [scaleF2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("scaleF2") @ExcludeMissing fun _scaleF2(): JsonField<Double> = scaleF2

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
                 * [TopsideExtensionChapmanConst].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TopsideExtensionChapmanConst]. */
            class Builder internal constructor() {

                private var chi: JsonField<Double> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var hmF2: JsonField<Double> = JsonMissing.of()
                private var nmF2: JsonField<Double> = JsonMissing.of()
                private var scaleF2: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(topsideExtensionChapmanConst: TopsideExtensionChapmanConst) =
                    apply {
                        chi = topsideExtensionChapmanConst.chi
                        description = topsideExtensionChapmanConst.description
                        hmF2 = topsideExtensionChapmanConst.hmF2
                        nmF2 = topsideExtensionChapmanConst.nmF2
                        scaleF2 = topsideExtensionChapmanConst.scaleF2
                        additionalProperties =
                            topsideExtensionChapmanConst.additionalProperties.toMutableMap()
                    }

                /**
                 * Peak Density Thickness (PDT) for description of the flat-nose shape, in
                 * kilometers.
                 */
                fun chi(chi: Double) = chi(JsonField.of(chi))

                /**
                 * Sets [Builder.chi] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chi] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun chi(chi: JsonField<Double>) = apply { this.chi = chi }

                /** Description of the Chapman computation technique. */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Peak height of F2 layer, in kilometers. */
                fun hmF2(hmF2: Double) = hmF2(JsonField.of(hmF2))

                /**
                 * Sets [Builder.hmF2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hmF2] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun hmF2(hmF2: JsonField<Double>) = apply { this.hmF2 = hmF2 }

                /** Peak density of F2 layer, in grams per cubic centimeter. */
                fun nmF2(nmF2: Double) = nmF2(JsonField.of(nmF2))

                /**
                 * Sets [Builder.nmF2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nmF2] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun nmF2(nmF2: JsonField<Double>) = apply { this.nmF2 = nmF2 }

                /** Scale height if F2 layer at the peak, in kilometers. */
                fun scaleF2(scaleF2: Double) = scaleF2(JsonField.of(scaleF2))

                /**
                 * Sets [Builder.scaleF2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scaleF2] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun scaleF2(scaleF2: JsonField<Double>) = apply { this.scaleF2 = scaleF2 }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [TopsideExtensionChapmanConst].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TopsideExtensionChapmanConst =
                    TopsideExtensionChapmanConst(
                        chi,
                        description,
                        hmF2,
                        nmF2,
                        scaleF2,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TopsideExtensionChapmanConst = apply {
                if (validated) {
                    return@apply
                }

                chi()
                description()
                hmF2()
                nmF2()
                scaleF2()
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
                (if (chi.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (hmF2.asKnown().isPresent) 1 else 0) +
                    (if (nmF2.asKnown().isPresent) 1 else 0) +
                    (if (scaleF2.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TopsideExtensionChapmanConst &&
                    chi == other.chi &&
                    description == other.description &&
                    hmF2 == other.hmF2 &&
                    nmF2 == other.nmF2 &&
                    scaleF2 == other.scaleF2 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(chi, description, hmF2, nmF2, scaleF2, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TopsideExtensionChapmanConst{chi=$chi, description=$description, hmF2=$hmF2, nmF2=$nmF2, scaleF2=$scaleF2, additionalProperties=$additionalProperties}"
        }

        /** Varying scale height Chapman topside layer. */
        class TopsideExtensionVaryChap
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val alpha: JsonField<Double>,
            private val beta: JsonField<Double>,
            private val chi: JsonField<Double>,
            private val description: JsonField<String>,
            private val hmF2: JsonField<Double>,
            private val ht: JsonField<Double>,
            private val nmF2: JsonField<Double>,
            private val scaleF2: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("alpha") @ExcludeMissing alpha: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("beta") @ExcludeMissing beta: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("chi") @ExcludeMissing chi: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("hmF2") @ExcludeMissing hmF2: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("ht") @ExcludeMissing ht: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("nmF2") @ExcludeMissing nmF2: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("scaleF2")
                @ExcludeMissing
                scaleF2: JsonField<Double> = JsonMissing.of(),
            ) : this(alpha, beta, chi, description, hmF2, ht, nmF2, scaleF2, mutableMapOf())

            /**
             * Alpha parameter of the profile shape.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun alpha(): Optional<Double> = alpha.getOptional("alpha")

            /**
             * Beta parameter of the profile shape.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun beta(): Optional<Double> = beta.getOptional("beta")

            /**
             * Peak Density Thickness (PDT) for description of the flat-nose shape, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun chi(): Optional<Double> = chi.getOptional("chi")

            /**
             * Description of the Chapman computation technique.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Peak height of F2 layer, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun hmF2(): Optional<Double> = hmF2.getOptional("hmF2")

            /**
             * Transition height, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ht(): Optional<Double> = ht.getOptional("ht")

            /**
             * Peak density of F2 layer, in grams per cubic centimeter.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun nmF2(): Optional<Double> = nmF2.getOptional("nmF2")

            /**
             * Scale height if F2 layer at the peak, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun scaleF2(): Optional<Double> = scaleF2.getOptional("scaleF2")

            /**
             * Returns the raw JSON value of [alpha].
             *
             * Unlike [alpha], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("alpha") @ExcludeMissing fun _alpha(): JsonField<Double> = alpha

            /**
             * Returns the raw JSON value of [beta].
             *
             * Unlike [beta], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("beta") @ExcludeMissing fun _beta(): JsonField<Double> = beta

            /**
             * Returns the raw JSON value of [chi].
             *
             * Unlike [chi], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("chi") @ExcludeMissing fun _chi(): JsonField<Double> = chi

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [hmF2].
             *
             * Unlike [hmF2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hmF2") @ExcludeMissing fun _hmF2(): JsonField<Double> = hmF2

            /**
             * Returns the raw JSON value of [ht].
             *
             * Unlike [ht], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ht") @ExcludeMissing fun _ht(): JsonField<Double> = ht

            /**
             * Returns the raw JSON value of [nmF2].
             *
             * Unlike [nmF2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("nmF2") @ExcludeMissing fun _nmF2(): JsonField<Double> = nmF2

            /**
             * Returns the raw JSON value of [scaleF2].
             *
             * Unlike [scaleF2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("scaleF2") @ExcludeMissing fun _scaleF2(): JsonField<Double> = scaleF2

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
                 * [TopsideExtensionVaryChap].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TopsideExtensionVaryChap]. */
            class Builder internal constructor() {

                private var alpha: JsonField<Double> = JsonMissing.of()
                private var beta: JsonField<Double> = JsonMissing.of()
                private var chi: JsonField<Double> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var hmF2: JsonField<Double> = JsonMissing.of()
                private var ht: JsonField<Double> = JsonMissing.of()
                private var nmF2: JsonField<Double> = JsonMissing.of()
                private var scaleF2: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(topsideExtensionVaryChap: TopsideExtensionVaryChap) = apply {
                    alpha = topsideExtensionVaryChap.alpha
                    beta = topsideExtensionVaryChap.beta
                    chi = topsideExtensionVaryChap.chi
                    description = topsideExtensionVaryChap.description
                    hmF2 = topsideExtensionVaryChap.hmF2
                    ht = topsideExtensionVaryChap.ht
                    nmF2 = topsideExtensionVaryChap.nmF2
                    scaleF2 = topsideExtensionVaryChap.scaleF2
                    additionalProperties =
                        topsideExtensionVaryChap.additionalProperties.toMutableMap()
                }

                /** Alpha parameter of the profile shape. */
                fun alpha(alpha: Double) = alpha(JsonField.of(alpha))

                /**
                 * Sets [Builder.alpha] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.alpha] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun alpha(alpha: JsonField<Double>) = apply { this.alpha = alpha }

                /** Beta parameter of the profile shape. */
                fun beta(beta: Double) = beta(JsonField.of(beta))

                /**
                 * Sets [Builder.beta] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.beta] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun beta(beta: JsonField<Double>) = apply { this.beta = beta }

                /**
                 * Peak Density Thickness (PDT) for description of the flat-nose shape, in
                 * kilometers.
                 */
                fun chi(chi: Double) = chi(JsonField.of(chi))

                /**
                 * Sets [Builder.chi] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chi] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun chi(chi: JsonField<Double>) = apply { this.chi = chi }

                /** Description of the Chapman computation technique. */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Peak height of F2 layer, in kilometers. */
                fun hmF2(hmF2: Double) = hmF2(JsonField.of(hmF2))

                /**
                 * Sets [Builder.hmF2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hmF2] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun hmF2(hmF2: JsonField<Double>) = apply { this.hmF2 = hmF2 }

                /** Transition height, in kilometers. */
                fun ht(ht: Double) = ht(JsonField.of(ht))

                /**
                 * Sets [Builder.ht] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ht] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun ht(ht: JsonField<Double>) = apply { this.ht = ht }

                /** Peak density of F2 layer, in grams per cubic centimeter. */
                fun nmF2(nmF2: Double) = nmF2(JsonField.of(nmF2))

                /**
                 * Sets [Builder.nmF2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nmF2] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun nmF2(nmF2: JsonField<Double>) = apply { this.nmF2 = nmF2 }

                /** Scale height if F2 layer at the peak, in kilometers. */
                fun scaleF2(scaleF2: Double) = scaleF2(JsonField.of(scaleF2))

                /**
                 * Sets [Builder.scaleF2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scaleF2] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun scaleF2(scaleF2: JsonField<Double>) = apply { this.scaleF2 = scaleF2 }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [TopsideExtensionVaryChap].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TopsideExtensionVaryChap =
                    TopsideExtensionVaryChap(
                        alpha,
                        beta,
                        chi,
                        description,
                        hmF2,
                        ht,
                        nmF2,
                        scaleF2,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TopsideExtensionVaryChap = apply {
                if (validated) {
                    return@apply
                }

                alpha()
                beta()
                chi()
                description()
                hmF2()
                ht()
                nmF2()
                scaleF2()
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
                (if (alpha.asKnown().isPresent) 1 else 0) +
                    (if (beta.asKnown().isPresent) 1 else 0) +
                    (if (chi.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (hmF2.asKnown().isPresent) 1 else 0) +
                    (if (ht.asKnown().isPresent) 1 else 0) +
                    (if (nmF2.asKnown().isPresent) 1 else 0) +
                    (if (scaleF2.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TopsideExtensionVaryChap &&
                    alpha == other.alpha &&
                    beta == other.beta &&
                    chi == other.chi &&
                    description == other.description &&
                    hmF2 == other.hmF2 &&
                    ht == other.ht &&
                    nmF2 == other.nmF2 &&
                    scaleF2 == other.scaleF2 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    alpha,
                    beta,
                    chi,
                    description,
                    hmF2,
                    ht,
                    nmF2,
                    scaleF2,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TopsideExtensionVaryChap{alpha=$alpha, beta=$beta, chi=$chi, description=$description, hmF2=$hmF2, ht=$ht, nmF2=$nmF2, scaleF2=$scaleF2, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DensityProfile &&
                iri == other.iri &&
                parabolic == other.parabolic &&
                quasiParabolic == other.quasiParabolic &&
                shiftedChebyshev == other.shiftedChebyshev &&
                topsideExtensionChapmanConst == other.topsideExtensionChapmanConst &&
                topsideExtensionVaryChap == other.topsideExtensionVaryChap &&
                valleyModelCoeffs == other.valleyModelCoeffs &&
                valleyModelDescription == other.valleyModelDescription &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                iri,
                parabolic,
                quasiParabolic,
                shiftedChebyshev,
                topsideExtensionChapmanConst,
                topsideExtensionVaryChap,
                valleyModelCoeffs,
                valleyModelDescription,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DensityProfile{iri=$iri, parabolic=$parabolic, quasiParabolic=$quasiParabolic, shiftedChebyshev=$shiftedChebyshev, topsideExtensionChapmanConst=$topsideExtensionChapmanConst, topsideExtensionVaryChap=$topsideExtensionVaryChap, valleyModelCoeffs=$valleyModelCoeffs, valleyModelDescription=$valleyModelDescription, additionalProperties=$additionalProperties}"
    }

    class Doppler
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>,
        private val dimensionName: JsonField<List<String>>,
        private val dimensions: JsonField<List<Int>>,
        private val notes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = JsonMissing.of(),
            @JsonProperty("dimensionName")
            @ExcludeMissing
            dimensionName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        ) : this(data, dimensionName, dimensions, notes, mutableMapOf())

        /**
         * Array of received doppler shifts in Hz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data(): Optional<List<List<List<List<List<List<List<Double>>>>>>>> =
            data.getOptional("data")

        /**
         * Array of names for dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensionName(): Optional<List<String>> = dimensionName.getOptional("dimensionName")

        /**
         * Array of integers of the doppler array dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensions(): Optional<List<Int>> = dimensions.getOptional("dimensions")

        /**
         * Notes for the doppler data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun _data(): JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = data

        /**
         * Returns the raw JSON value of [dimensionName].
         *
         * Unlike [dimensionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionName")
        @ExcludeMissing
        fun _dimensionName(): JsonField<List<String>> = dimensionName

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<List<Int>> = dimensions

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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

            /** Returns a mutable builder for constructing an instance of [Doppler]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Doppler]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<List<List<List<List<List<List<Double>>>>>>>>? =
                null
            private var dimensionName: JsonField<MutableList<String>>? = null
            private var dimensions: JsonField<MutableList<Int>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(doppler: Doppler) = apply {
                data = doppler.data.map { it.toMutableList() }
                dimensionName = doppler.dimensionName.map { it.toMutableList() }
                dimensions = doppler.dimensions.map { it.toMutableList() }
                notes = doppler.notes
                additionalProperties = doppler.additionalProperties.toMutableMap()
            }

            /** Array of received doppler shifts in Hz. */
            fun data(data: List<List<List<List<List<List<List<Double>>>>>>>) =
                data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed
             * `List<List<List<List<List<List<List<Double>>>>>>>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun data(data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<List<List<List<List<List<Double>>>>>>] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: List<List<List<List<List<List<Double>>>>>>) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Array of names for dimensions. */
            fun dimensionName(dimensionName: List<String>) =
                dimensionName(JsonField.of(dimensionName))

            /**
             * Sets [Builder.dimensionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionName] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionName(dimensionName: JsonField<List<String>>) = apply {
                this.dimensionName = dimensionName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.dimensionName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionName(dimensionName: String) = apply {
                this.dimensionName =
                    (this.dimensionName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionName", it).add(dimensionName)
                    }
            }

            /** Array of integers of the doppler array dimensions. */
            fun dimensions(dimensions: List<Int>) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<List<Int>>) = apply {
                this.dimensions = dimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [dimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimension(dimension: Int) = apply {
                dimensions =
                    (dimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensions", it).add(dimension)
                    }
            }

            /** Notes for the doppler data. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * Returns an immutable instance of [Doppler].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Doppler =
                Doppler(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionName ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Doppler = apply {
            if (validated) {
                return@apply
            }

            data()
            dimensionName()
            dimensions()
            notes()
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
            (data.asKnown().getOrNull()?.sumOf {
                it.sumOf {
                        it.sumOf {
                                it.sumOf {
                                        it.sumOf { it.sumOf { it.size.toInt() }.toInt() }.toInt()
                                    }
                                    .toInt()
                            }
                            .toInt()
                    }
                    .toInt()
            } ?: 0) +
                (dimensionName.asKnown().getOrNull()?.size ?: 0) +
                (dimensions.asKnown().getOrNull()?.size ?: 0) +
                (if (notes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Doppler &&
                data == other.data &&
                dimensionName == other.dimensionName &&
                dimensions == other.dimensions &&
                notes == other.notes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, dimensionName, dimensions, notes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Doppler{data=$data, dimensionName=$dimensionName, dimensions=$dimensions, notes=$notes, additionalProperties=$additionalProperties}"
    }

    class Elevation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>,
        private val dimensionName: JsonField<List<String>>,
        private val dimensions: JsonField<List<Int>>,
        private val notes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = JsonMissing.of(),
            @JsonProperty("dimensionName")
            @ExcludeMissing
            dimensionName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        ) : this(data, dimensionName, dimensions, notes, mutableMapOf())

        /**
         * Array of incoming elevation at the receiver.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data(): Optional<List<List<List<List<List<List<List<Double>>>>>>>> =
            data.getOptional("data")

        /**
         * Array of names for dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensionName(): Optional<List<String>> = dimensionName.getOptional("dimensionName")

        /**
         * Array of integers of the elevation array dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensions(): Optional<List<Int>> = dimensions.getOptional("dimensions")

        /**
         * Notes for the elevation data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun _data(): JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = data

        /**
         * Returns the raw JSON value of [dimensionName].
         *
         * Unlike [dimensionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionName")
        @ExcludeMissing
        fun _dimensionName(): JsonField<List<String>> = dimensionName

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<List<Int>> = dimensions

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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

            /** Returns a mutable builder for constructing an instance of [Elevation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Elevation]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<List<List<List<List<List<List<Double>>>>>>>>? =
                null
            private var dimensionName: JsonField<MutableList<String>>? = null
            private var dimensions: JsonField<MutableList<Int>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(elevation: Elevation) = apply {
                data = elevation.data.map { it.toMutableList() }
                dimensionName = elevation.dimensionName.map { it.toMutableList() }
                dimensions = elevation.dimensions.map { it.toMutableList() }
                notes = elevation.notes
                additionalProperties = elevation.additionalProperties.toMutableMap()
            }

            /** Array of incoming elevation at the receiver. */
            fun data(data: List<List<List<List<List<List<List<Double>>>>>>>) =
                data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed
             * `List<List<List<List<List<List<List<Double>>>>>>>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun data(data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<List<List<List<List<List<Double>>>>>>] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: List<List<List<List<List<List<Double>>>>>>) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Array of names for dimensions. */
            fun dimensionName(dimensionName: List<String>) =
                dimensionName(JsonField.of(dimensionName))

            /**
             * Sets [Builder.dimensionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionName] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionName(dimensionName: JsonField<List<String>>) = apply {
                this.dimensionName = dimensionName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.dimensionName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionName(dimensionName: String) = apply {
                this.dimensionName =
                    (this.dimensionName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionName", it).add(dimensionName)
                    }
            }

            /** Array of integers of the elevation array dimensions. */
            fun dimensions(dimensions: List<Int>) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<List<Int>>) = apply {
                this.dimensions = dimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [dimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimension(dimension: Int) = apply {
                dimensions =
                    (dimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensions", it).add(dimension)
                    }
            }

            /** Notes for the elevation data. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * Returns an immutable instance of [Elevation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Elevation =
                Elevation(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionName ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Elevation = apply {
            if (validated) {
                return@apply
            }

            data()
            dimensionName()
            dimensions()
            notes()
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
            (data.asKnown().getOrNull()?.sumOf {
                it.sumOf {
                        it.sumOf {
                                it.sumOf {
                                        it.sumOf { it.sumOf { it.size.toInt() }.toInt() }.toInt()
                                    }
                                    .toInt()
                            }
                            .toInt()
                    }
                    .toInt()
            } ?: 0) +
                (dimensionName.asKnown().getOrNull()?.size ?: 0) +
                (dimensions.asKnown().getOrNull()?.size ?: 0) +
                (if (notes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Elevation &&
                data == other.data &&
                dimensionName == other.dimensionName &&
                dimensions == other.dimensions &&
                notes == other.notes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, dimensionName, dimensions, notes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Elevation{data=$data, dimensionName=$dimensionName, dimensions=$dimensions, notes=$notes, additionalProperties=$additionalProperties}"
    }

    class Frequency
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>,
        private val dimensionName: JsonField<List<String>>,
        private val dimensions: JsonField<List<Int>>,
        private val notes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = JsonMissing.of(),
            @JsonProperty("dimensionName")
            @ExcludeMissing
            dimensionName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        ) : this(data, dimensionName, dimensions, notes, mutableMapOf())

        /**
         * Array of frequency data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data(): Optional<List<List<List<List<List<List<List<Double>>>>>>>> =
            data.getOptional("data")

        /**
         * Array of names for frequency dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensionName(): Optional<List<String>> = dimensionName.getOptional("dimensionName")

        /**
         * Array of integers of the frequency array dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensions(): Optional<List<Int>> = dimensions.getOptional("dimensions")

        /**
         * Notes for the frequency data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun _data(): JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = data

        /**
         * Returns the raw JSON value of [dimensionName].
         *
         * Unlike [dimensionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionName")
        @ExcludeMissing
        fun _dimensionName(): JsonField<List<String>> = dimensionName

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<List<Int>> = dimensions

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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

            /** Returns a mutable builder for constructing an instance of [Frequency]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Frequency]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<List<List<List<List<List<List<Double>>>>>>>>? =
                null
            private var dimensionName: JsonField<MutableList<String>>? = null
            private var dimensions: JsonField<MutableList<Int>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(frequency: Frequency) = apply {
                data = frequency.data.map { it.toMutableList() }
                dimensionName = frequency.dimensionName.map { it.toMutableList() }
                dimensions = frequency.dimensions.map { it.toMutableList() }
                notes = frequency.notes
                additionalProperties = frequency.additionalProperties.toMutableMap()
            }

            /** Array of frequency data. */
            fun data(data: List<List<List<List<List<List<List<Double>>>>>>>) =
                data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed
             * `List<List<List<List<List<List<List<Double>>>>>>>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun data(data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<List<List<List<List<List<Double>>>>>>] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: List<List<List<List<List<List<Double>>>>>>) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Array of names for frequency dimensions. */
            fun dimensionName(dimensionName: List<String>) =
                dimensionName(JsonField.of(dimensionName))

            /**
             * Sets [Builder.dimensionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionName] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionName(dimensionName: JsonField<List<String>>) = apply {
                this.dimensionName = dimensionName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.dimensionName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionName(dimensionName: String) = apply {
                this.dimensionName =
                    (this.dimensionName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionName", it).add(dimensionName)
                    }
            }

            /** Array of integers of the frequency array dimensions. */
            fun dimensions(dimensions: List<Int>) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<List<Int>>) = apply {
                this.dimensions = dimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [dimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimension(dimension: Int) = apply {
                dimensions =
                    (dimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensions", it).add(dimension)
                    }
            }

            /** Notes for the frequency data. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * Returns an immutable instance of [Frequency].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Frequency =
                Frequency(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionName ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Frequency = apply {
            if (validated) {
                return@apply
            }

            data()
            dimensionName()
            dimensions()
            notes()
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
            (data.asKnown().getOrNull()?.sumOf {
                it.sumOf {
                        it.sumOf {
                                it.sumOf {
                                        it.sumOf { it.sumOf { it.size.toInt() }.toInt() }.toInt()
                                    }
                                    .toInt()
                            }
                            .toInt()
                    }
                    .toInt()
            } ?: 0) +
                (dimensionName.asKnown().getOrNull()?.size ?: 0) +
                (dimensions.asKnown().getOrNull()?.size ?: 0) +
                (if (notes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Frequency &&
                data == other.data &&
                dimensionName == other.dimensionName &&
                dimensions == other.dimensions &&
                notes == other.notes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, dimensionName, dimensions, notes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Frequency{data=$data, dimensionName=$dimensionName, dimensions=$dimensions, notes=$notes, additionalProperties=$additionalProperties}"
    }

    class Phase
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>,
        private val dimensionName: JsonField<List<String>>,
        private val dimensions: JsonField<List<Int>>,
        private val notes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = JsonMissing.of(),
            @JsonProperty("dimensionName")
            @ExcludeMissing
            dimensionName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        ) : this(data, dimensionName, dimensions, notes, mutableMapOf())

        /**
         * Array of phase data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data(): Optional<List<List<List<List<List<List<List<Double>>>>>>>> =
            data.getOptional("data")

        /**
         * Array of names for phase dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensionName(): Optional<List<String>> = dimensionName.getOptional("dimensionName")

        /**
         * Array of integers of the phase array dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensions(): Optional<List<Int>> = dimensions.getOptional("dimensions")

        /**
         * Notes for the phase data. Orientation and position for each antenna element across the
         * antenna_element dimension.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun _data(): JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = data

        /**
         * Returns the raw JSON value of [dimensionName].
         *
         * Unlike [dimensionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionName")
        @ExcludeMissing
        fun _dimensionName(): JsonField<List<String>> = dimensionName

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<List<Int>> = dimensions

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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

            /** Returns a mutable builder for constructing an instance of [Phase]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Phase]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<List<List<List<List<List<List<Double>>>>>>>>? =
                null
            private var dimensionName: JsonField<MutableList<String>>? = null
            private var dimensions: JsonField<MutableList<Int>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(phase: Phase) = apply {
                data = phase.data.map { it.toMutableList() }
                dimensionName = phase.dimensionName.map { it.toMutableList() }
                dimensions = phase.dimensions.map { it.toMutableList() }
                notes = phase.notes
                additionalProperties = phase.additionalProperties.toMutableMap()
            }

            /** Array of phase data. */
            fun data(data: List<List<List<List<List<List<List<Double>>>>>>>) =
                data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed
             * `List<List<List<List<List<List<List<Double>>>>>>>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun data(data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<List<List<List<List<List<Double>>>>>>] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: List<List<List<List<List<List<Double>>>>>>) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Array of names for phase dimensions. */
            fun dimensionName(dimensionName: List<String>) =
                dimensionName(JsonField.of(dimensionName))

            /**
             * Sets [Builder.dimensionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionName] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionName(dimensionName: JsonField<List<String>>) = apply {
                this.dimensionName = dimensionName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.dimensionName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionName(dimensionName: String) = apply {
                this.dimensionName =
                    (this.dimensionName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionName", it).add(dimensionName)
                    }
            }

            /** Array of integers of the phase array dimensions. */
            fun dimensions(dimensions: List<Int>) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<List<Int>>) = apply {
                this.dimensions = dimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [dimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimension(dimension: Int) = apply {
                dimensions =
                    (dimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensions", it).add(dimension)
                    }
            }

            /**
             * Notes for the phase data. Orientation and position for each antenna element across
             * the antenna_element dimension.
             */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * Returns an immutable instance of [Phase].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Phase =
                Phase(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionName ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Phase = apply {
            if (validated) {
                return@apply
            }

            data()
            dimensionName()
            dimensions()
            notes()
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
            (data.asKnown().getOrNull()?.sumOf {
                it.sumOf {
                        it.sumOf {
                                it.sumOf {
                                        it.sumOf { it.sumOf { it.size.toInt() }.toInt() }.toInt()
                                    }
                                    .toInt()
                            }
                            .toInt()
                    }
                    .toInt()
            } ?: 0) +
                (dimensionName.asKnown().getOrNull()?.size ?: 0) +
                (dimensions.asKnown().getOrNull()?.size ?: 0) +
                (if (notes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Phase &&
                data == other.data &&
                dimensionName == other.dimensionName &&
                dimensions == other.dimensions &&
                notes == other.notes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, dimensionName, dimensions, notes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Phase{data=$data, dimensionName=$dimensionName, dimensions=$dimensions, notes=$notes, additionalProperties=$additionalProperties}"
    }

    class Polarization
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data:
            JsonField<List<List<List<List<List<List<List<UnnamedSchemaWithArrayParent1>>>>>>>>,
        private val dimensionName: JsonField<List<String>>,
        private val dimensions: JsonField<List<Int>>,
        private val notes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data:
                JsonField<List<List<List<List<List<List<List<UnnamedSchemaWithArrayParent1>>>>>>>> =
                JsonMissing.of(),
            @JsonProperty("dimensionName")
            @ExcludeMissing
            dimensionName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        ) : this(data, dimensionName, dimensions, notes, mutableMapOf())

        /**
         * Array of polarization data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data():
            Optional<List<List<List<List<List<List<List<UnnamedSchemaWithArrayParent1>>>>>>>> =
            data.getOptional("data")

        /**
         * Array of names for dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensionName(): Optional<List<String>> = dimensionName.getOptional("dimensionName")

        /**
         * Array of integers for polarization dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensions(): Optional<List<Int>> = dimensions.getOptional("dimensions")

        /**
         * Notes for the polarization data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun _data():
            JsonField<List<List<List<List<List<List<List<UnnamedSchemaWithArrayParent1>>>>>>>> =
            data

        /**
         * Returns the raw JSON value of [dimensionName].
         *
         * Unlike [dimensionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionName")
        @ExcludeMissing
        fun _dimensionName(): JsonField<List<String>> = dimensionName

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<List<Int>> = dimensions

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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

            /** Returns a mutable builder for constructing an instance of [Polarization]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Polarization]. */
        class Builder internal constructor() {

            private var data:
                JsonField<
                    MutableList<List<List<List<List<List<List<UnnamedSchemaWithArrayParent1>>>>>>>
                >? =
                null
            private var dimensionName: JsonField<MutableList<String>>? = null
            private var dimensions: JsonField<MutableList<Int>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(polarization: Polarization) = apply {
                data = polarization.data.map { it.toMutableList() }
                dimensionName = polarization.dimensionName.map { it.toMutableList() }
                dimensions = polarization.dimensions.map { it.toMutableList() }
                notes = polarization.notes
                additionalProperties = polarization.additionalProperties.toMutableMap()
            }

            /** Array of polarization data. */
            fun data(
                data: List<List<List<List<List<List<List<UnnamedSchemaWithArrayParent1>>>>>>>
            ) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed
             * `List<List<List<List<List<List<List<UnnamedSchemaWithArrayParent1>>>>>>>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun data(
                data:
                    JsonField<
                        List<List<List<List<List<List<List<UnnamedSchemaWithArrayParent1>>>>>>>
                    >
            ) = apply { this.data = data.map { it.toMutableList() } }

            /**
             * Adds a single [List<List<List<List<List<List<UnnamedSchemaWithArrayParent1>>>>>>] to
             * [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: List<List<List<List<List<List<UnnamedSchemaWithArrayParent1>>>>>>) =
                apply {
                    this.data =
                        (this.data ?: JsonField.of(mutableListOf())).also {
                            checkKnown("data", it).add(data)
                        }
                }

            /** Array of names for dimensions. */
            fun dimensionName(dimensionName: List<String>) =
                dimensionName(JsonField.of(dimensionName))

            /**
             * Sets [Builder.dimensionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionName] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionName(dimensionName: JsonField<List<String>>) = apply {
                this.dimensionName = dimensionName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.dimensionName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionName(dimensionName: String) = apply {
                this.dimensionName =
                    (this.dimensionName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionName", it).add(dimensionName)
                    }
            }

            /** Array of integers for polarization dimensions. */
            fun dimensions(dimensions: List<Int>) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<List<Int>>) = apply {
                this.dimensions = dimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [dimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimension(dimension: Int) = apply {
                dimensions =
                    (dimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensions", it).add(dimension)
                    }
            }

            /** Notes for the polarization data. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * Returns an immutable instance of [Polarization].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Polarization =
                Polarization(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionName ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Polarization = apply {
            if (validated) {
                return@apply
            }

            data().ifPresent {
                it.forEach {
                    it.forEach {
                        it.forEach {
                            it.forEach {
                                it.forEach { it.forEach { it.forEach { it.validate() } } }
                            }
                        }
                    }
                }
            }
            dimensionName()
            dimensions()
            notes()
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
            (data.asKnown().getOrNull()?.sumOf {
                it.sumOf {
                        it.sumOf {
                                it.sumOf {
                                        it.sumOf {
                                                it.sumOf {
                                                        it.sumOf { it.validity().toInt() }.toInt()
                                                    }
                                                    .toInt()
                                            }
                                            .toInt()
                                    }
                                    .toInt()
                            }
                            .toInt()
                    }
                    .toInt()
            } ?: 0) +
                (dimensionName.asKnown().getOrNull()?.size ?: 0) +
                (dimensions.asKnown().getOrNull()?.size ?: 0) +
                (if (notes.asKnown().isPresent) 1 else 0)

        class UnnamedSchemaWithArrayParent1
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val X = of("X")

                @JvmField val O = of("O")

                @JvmStatic
                fun of(value: String) = UnnamedSchemaWithArrayParent1(JsonField.of(value))
            }

            /** An enum containing [UnnamedSchemaWithArrayParent1]'s known values. */
            enum class Known {
                X,
                O,
            }

            /**
             * An enum containing [UnnamedSchemaWithArrayParent1]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [UnnamedSchemaWithArrayParent1] can contain an unknown value in a
             * couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                X,
                O,
                /**
                 * An enum member indicating that [UnnamedSchemaWithArrayParent1] was instantiated
                 * with an unknown value.
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
                    X -> Value.X
                    O -> Value.O
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
                    X -> Known.X
                    O -> Known.O
                    else ->
                        throw UnifieddatalibraryInvalidDataException(
                            "Unknown UnnamedSchemaWithArrayParent1: $value"
                        )
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

            fun validate(): UnnamedSchemaWithArrayParent1 = apply {
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

                return other is UnnamedSchemaWithArrayParent1 && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Polarization &&
                data == other.data &&
                dimensionName == other.dimensionName &&
                dimensions == other.dimensions &&
                notes == other.notes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, dimensionName, dimensions, notes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Polarization{data=$data, dimensionName=$dimensionName, dimensions=$dimensions, notes=$notes, additionalProperties=$additionalProperties}"
    }

    class Power
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>,
        private val dimensionName: JsonField<List<String>>,
        private val dimensions: JsonField<List<Int>>,
        private val notes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = JsonMissing.of(),
            @JsonProperty("dimensionName")
            @ExcludeMissing
            dimensionName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        ) : this(data, dimensionName, dimensions, notes, mutableMapOf())

        /**
         * Array of received power in db.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data(): Optional<List<List<List<List<List<List<List<Double>>>>>>>> =
            data.getOptional("data")

        /**
         * Array of names for dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensionName(): Optional<List<String>> = dimensionName.getOptional("dimensionName")

        /**
         * Array of integers of the power array dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensions(): Optional<List<Int>> = dimensions.getOptional("dimensions")

        /**
         * Notes for the power data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun _data(): JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = data

        /**
         * Returns the raw JSON value of [dimensionName].
         *
         * Unlike [dimensionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionName")
        @ExcludeMissing
        fun _dimensionName(): JsonField<List<String>> = dimensionName

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<List<Int>> = dimensions

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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

            /** Returns a mutable builder for constructing an instance of [Power]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Power]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<List<List<List<List<List<List<Double>>>>>>>>? =
                null
            private var dimensionName: JsonField<MutableList<String>>? = null
            private var dimensions: JsonField<MutableList<Int>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(power: Power) = apply {
                data = power.data.map { it.toMutableList() }
                dimensionName = power.dimensionName.map { it.toMutableList() }
                dimensions = power.dimensions.map { it.toMutableList() }
                notes = power.notes
                additionalProperties = power.additionalProperties.toMutableMap()
            }

            /** Array of received power in db. */
            fun data(data: List<List<List<List<List<List<List<Double>>>>>>>) =
                data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed
             * `List<List<List<List<List<List<List<Double>>>>>>>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun data(data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<List<List<List<List<List<Double>>>>>>] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: List<List<List<List<List<List<Double>>>>>>) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Array of names for dimensions. */
            fun dimensionName(dimensionName: List<String>) =
                dimensionName(JsonField.of(dimensionName))

            /**
             * Sets [Builder.dimensionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionName] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionName(dimensionName: JsonField<List<String>>) = apply {
                this.dimensionName = dimensionName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.dimensionName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionName(dimensionName: String) = apply {
                this.dimensionName =
                    (this.dimensionName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionName", it).add(dimensionName)
                    }
            }

            /** Array of integers of the power array dimensions. */
            fun dimensions(dimensions: List<Int>) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<List<Int>>) = apply {
                this.dimensions = dimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [dimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimension(dimension: Int) = apply {
                dimensions =
                    (dimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensions", it).add(dimension)
                    }
            }

            /** Notes for the power data. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * Returns an immutable instance of [Power].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Power =
                Power(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionName ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Power = apply {
            if (validated) {
                return@apply
            }

            data()
            dimensionName()
            dimensions()
            notes()
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
            (data.asKnown().getOrNull()?.sumOf {
                it.sumOf {
                        it.sumOf {
                                it.sumOf {
                                        it.sumOf { it.sumOf { it.size.toInt() }.toInt() }.toInt()
                                    }
                                    .toInt()
                            }
                            .toInt()
                    }
                    .toInt()
            } ?: 0) +
                (dimensionName.asKnown().getOrNull()?.size ?: 0) +
                (dimensions.asKnown().getOrNull()?.size ?: 0) +
                (if (notes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Power &&
                data == other.data &&
                dimensionName == other.dimensionName &&
                dimensions == other.dimensions &&
                notes == other.notes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, dimensionName, dimensions, notes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Power{data=$data, dimensionName=$dimensionName, dimensions=$dimensions, notes=$notes, additionalProperties=$additionalProperties}"
    }

    class Range
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>,
        private val dimensionName: JsonField<List<String>>,
        private val dimensions: JsonField<List<Int>>,
        private val notes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = JsonMissing.of(),
            @JsonProperty("dimensionName")
            @ExcludeMissing
            dimensionName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        ) : this(data, dimensionName, dimensions, notes, mutableMapOf())

        /**
         * Array of range data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data(): Optional<List<List<List<List<List<List<List<Double>>>>>>>> =
            data.getOptional("data")

        /**
         * Array of names for range dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensionName(): Optional<List<String>> = dimensionName.getOptional("dimensionName")

        /**
         * Array of integers of the range array dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensions(): Optional<List<Int>> = dimensions.getOptional("dimensions")

        /**
         * Notes for the range data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun _data(): JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = data

        /**
         * Returns the raw JSON value of [dimensionName].
         *
         * Unlike [dimensionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionName")
        @ExcludeMissing
        fun _dimensionName(): JsonField<List<String>> = dimensionName

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<List<Int>> = dimensions

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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

            /** Returns a mutable builder for constructing an instance of [Range]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Range]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<List<List<List<List<List<List<Double>>>>>>>>? =
                null
            private var dimensionName: JsonField<MutableList<String>>? = null
            private var dimensions: JsonField<MutableList<Int>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(range: Range) = apply {
                data = range.data.map { it.toMutableList() }
                dimensionName = range.dimensionName.map { it.toMutableList() }
                dimensions = range.dimensions.map { it.toMutableList() }
                notes = range.notes
                additionalProperties = range.additionalProperties.toMutableMap()
            }

            /** Array of range data. */
            fun data(data: List<List<List<List<List<List<List<Double>>>>>>>) =
                data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed
             * `List<List<List<List<List<List<List<Double>>>>>>>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun data(data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<List<List<List<List<List<Double>>>>>>] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: List<List<List<List<List<List<Double>>>>>>) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Array of names for range dimensions. */
            fun dimensionName(dimensionName: List<String>) =
                dimensionName(JsonField.of(dimensionName))

            /**
             * Sets [Builder.dimensionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionName] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionName(dimensionName: JsonField<List<String>>) = apply {
                this.dimensionName = dimensionName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.dimensionName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionName(dimensionName: String) = apply {
                this.dimensionName =
                    (this.dimensionName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionName", it).add(dimensionName)
                    }
            }

            /** Array of integers of the range array dimensions. */
            fun dimensions(dimensions: List<Int>) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<List<Int>>) = apply {
                this.dimensions = dimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [dimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimension(dimension: Int) = apply {
                dimensions =
                    (dimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensions", it).add(dimension)
                    }
            }

            /** Notes for the range data. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * Returns an immutable instance of [Range].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Range =
                Range(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionName ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Range = apply {
            if (validated) {
                return@apply
            }

            data()
            dimensionName()
            dimensions()
            notes()
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
            (data.asKnown().getOrNull()?.sumOf {
                it.sumOf {
                        it.sumOf {
                                it.sumOf {
                                        it.sumOf { it.sumOf { it.size.toInt() }.toInt() }.toInt()
                                    }
                                    .toInt()
                            }
                            .toInt()
                    }
                    .toInt()
            } ?: 0) +
                (dimensionName.asKnown().getOrNull()?.size ?: 0) +
                (dimensions.asKnown().getOrNull()?.size ?: 0) +
                (if (notes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Range &&
                data == other.data &&
                dimensionName == other.dimensionName &&
                dimensions == other.dimensions &&
                notes == other.notes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, dimensionName, dimensions, notes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Range{data=$data, dimensionName=$dimensionName, dimensions=$dimensions, notes=$notes, additionalProperties=$additionalProperties}"
    }

    /** Enums: Mobile, Static. */
    class ReceiveSensorType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val MOBILE = of("Mobile")

            @JvmField val STATIC = of("Static")

            @JvmStatic fun of(value: String) = ReceiveSensorType(JsonField.of(value))
        }

        /** An enum containing [ReceiveSensorType]'s known values. */
        enum class Known {
            MOBILE,
            STATIC,
        }

        /**
         * An enum containing [ReceiveSensorType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReceiveSensorType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MOBILE,
            STATIC,
            /**
             * An enum member indicating that [ReceiveSensorType] was instantiated with an unknown
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
                MOBILE -> Value.MOBILE
                STATIC -> Value.STATIC
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
                MOBILE -> Known.MOBILE
                STATIC -> Known.STATIC
                else ->
                    throw UnifieddatalibraryInvalidDataException(
                        "Unknown ReceiveSensorType: $value"
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

        fun validate(): ReceiveSensorType = apply {
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

            return other is ReceiveSensorType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The ScalerInfo record describes the person or system who interpreted the ionogram in
     * IonoObservation.
     */
    class ScalerInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val confidenceLevel: JsonField<Int>,
        private val confidenceScore: JsonField<Int>,
        private val name: JsonField<String>,
        private val organization: JsonField<String>,
        private val type: JsonField<String>,
        private val version: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("confidenceLevel")
            @ExcludeMissing
            confidenceLevel: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("confidenceScore")
            @ExcludeMissing
            confidenceScore: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("organization")
            @ExcludeMissing
            organization: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Double> = JsonMissing.of(),
        ) : this(
            confidenceLevel,
            confidenceScore,
            name,
            organization,
            type,
            version,
            mutableMapOf(),
        )

        /**
         * Scaler confidence level.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun confidenceLevel(): Optional<Int> = confidenceLevel.getOptional("confidenceLevel")

        /**
         * Scaler confidence score.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun confidenceScore(): Optional<Int> = confidenceScore.getOptional("confidenceScore")

        /**
         * Scaler name.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Scaler organization.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun organization(): Optional<String> = organization.getOptional("organization")

        /**
         * Scaler type (MANUAL, AUTOMATIC or UNKNOWN).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Scaler version.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun version(): Optional<Double> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [confidenceLevel].
         *
         * Unlike [confidenceLevel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("confidenceLevel")
        @ExcludeMissing
        fun _confidenceLevel(): JsonField<Int> = confidenceLevel

        /**
         * Returns the raw JSON value of [confidenceScore].
         *
         * Unlike [confidenceScore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("confidenceScore")
        @ExcludeMissing
        fun _confidenceScore(): JsonField<Int> = confidenceScore

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [organization].
         *
         * Unlike [organization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization")
        @ExcludeMissing
        fun _organization(): JsonField<String> = organization

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Double> = version

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

            /** Returns a mutable builder for constructing an instance of [ScalerInfo]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ScalerInfo]. */
        class Builder internal constructor() {

            private var confidenceLevel: JsonField<Int> = JsonMissing.of()
            private var confidenceScore: JsonField<Int> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var organization: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scalerInfo: ScalerInfo) = apply {
                confidenceLevel = scalerInfo.confidenceLevel
                confidenceScore = scalerInfo.confidenceScore
                name = scalerInfo.name
                organization = scalerInfo.organization
                type = scalerInfo.type
                version = scalerInfo.version
                additionalProperties = scalerInfo.additionalProperties.toMutableMap()
            }

            /** Scaler confidence level. */
            fun confidenceLevel(confidenceLevel: Int) =
                confidenceLevel(JsonField.of(confidenceLevel))

            /**
             * Sets [Builder.confidenceLevel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidenceLevel] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidenceLevel(confidenceLevel: JsonField<Int>) = apply {
                this.confidenceLevel = confidenceLevel
            }

            /** Scaler confidence score. */
            fun confidenceScore(confidenceScore: Int) =
                confidenceScore(JsonField.of(confidenceScore))

            /**
             * Sets [Builder.confidenceScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidenceScore] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidenceScore(confidenceScore: JsonField<Int>) = apply {
                this.confidenceScore = confidenceScore
            }

            /** Scaler name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Scaler organization. */
            fun organization(organization: String) = organization(JsonField.of(organization))

            /**
             * Sets [Builder.organization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organization] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organization(organization: JsonField<String>) = apply {
                this.organization = organization
            }

            /** Scaler type (MANUAL, AUTOMATIC or UNKNOWN). */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** Scaler version. */
            fun version(version: Double) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<Double>) = apply { this.version = version }

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
             * Returns an immutable instance of [ScalerInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ScalerInfo =
                ScalerInfo(
                    confidenceLevel,
                    confidenceScore,
                    name,
                    organization,
                    type,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ScalerInfo = apply {
            if (validated) {
                return@apply
            }

            confidenceLevel()
            confidenceScore()
            name()
            organization()
            type()
            version()
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
            (if (confidenceLevel.asKnown().isPresent) 1 else 0) +
                (if (confidenceScore.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (organization.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ScalerInfo &&
                confidenceLevel == other.confidenceLevel &&
                confidenceScore == other.confidenceScore &&
                name == other.name &&
                organization == other.organization &&
                type == other.type &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                confidenceLevel,
                confidenceScore,
                name,
                organization,
                type,
                version,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScalerInfo{confidenceLevel=$confidenceLevel, confidenceScore=$confidenceScore, name=$name, organization=$organization, type=$type, version=$version, additionalProperties=$additionalProperties}"
    }

    class Stokes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>,
        private val dimensionName: JsonField<List<String>>,
        private val dimensions: JsonField<List<Int>>,
        private val notes: JsonField<String>,
        private val s: JsonField<List<Double>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = JsonMissing.of(),
            @JsonProperty("dimensionName")
            @ExcludeMissing
            dimensionName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("s") @ExcludeMissing s: JsonField<List<Double>> = JsonMissing.of(),
        ) : this(data, dimensionName, dimensions, notes, s, mutableMapOf())

        /**
         * Array of received stokes data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data(): Optional<List<List<List<List<List<List<List<Double>>>>>>>> =
            data.getOptional("data")

        /**
         * Array of names for dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensionName(): Optional<List<String>> = dimensionName.getOptional("dimensionName")

        /**
         * Array of integers of the stoke array dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensions(): Optional<List<Int>> = dimensions.getOptional("dimensions")

        /**
         * Notes for the stokes data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * S1, S2, and S3 (the normalized Stokes parameters 1, 2, and 3).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun s(): Optional<List<Double>> = s.getOptional("s")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun _data(): JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = data

        /**
         * Returns the raw JSON value of [dimensionName].
         *
         * Unlike [dimensionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionName")
        @ExcludeMissing
        fun _dimensionName(): JsonField<List<String>> = dimensionName

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<List<Int>> = dimensions

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

        /**
         * Returns the raw JSON value of [s].
         *
         * Unlike [s], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("s") @ExcludeMissing fun _s(): JsonField<List<Double>> = s

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

            /** Returns a mutable builder for constructing an instance of [Stokes]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Stokes]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<List<List<List<List<List<List<Double>>>>>>>>? =
                null
            private var dimensionName: JsonField<MutableList<String>>? = null
            private var dimensions: JsonField<MutableList<Int>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var s: JsonField<MutableList<Double>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stokes: Stokes) = apply {
                data = stokes.data.map { it.toMutableList() }
                dimensionName = stokes.dimensionName.map { it.toMutableList() }
                dimensions = stokes.dimensions.map { it.toMutableList() }
                notes = stokes.notes
                s = stokes.s.map { it.toMutableList() }
                additionalProperties = stokes.additionalProperties.toMutableMap()
            }

            /** Array of received stokes data. */
            fun data(data: List<List<List<List<List<List<List<Double>>>>>>>) =
                data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed
             * `List<List<List<List<List<List<List<Double>>>>>>>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun data(data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<List<List<List<List<List<Double>>>>>>] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: List<List<List<List<List<List<Double>>>>>>) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Array of names for dimensions. */
            fun dimensionName(dimensionName: List<String>) =
                dimensionName(JsonField.of(dimensionName))

            /**
             * Sets [Builder.dimensionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionName] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionName(dimensionName: JsonField<List<String>>) = apply {
                this.dimensionName = dimensionName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.dimensionName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionName(dimensionName: String) = apply {
                this.dimensionName =
                    (this.dimensionName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionName", it).add(dimensionName)
                    }
            }

            /** Array of integers of the stoke array dimensions. */
            fun dimensions(dimensions: List<Int>) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<List<Int>>) = apply {
                this.dimensions = dimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [dimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimension(dimension: Int) = apply {
                dimensions =
                    (dimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensions", it).add(dimension)
                    }
            }

            /** Notes for the stokes data. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            /** S1, S2, and S3 (the normalized Stokes parameters 1, 2, and 3). */
            fun s(s: List<Double>) = s(JsonField.of(s))

            /**
             * Sets [Builder.s] to an arbitrary JSON value.
             *
             * You should usually call [Builder.s] with a well-typed `List<Double>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun s(s: JsonField<List<Double>>) = apply { this.s = s.map { it.toMutableList() } }

            /**
             * Adds a single [Double] to [Builder.s].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addS(s: Double) = apply {
                this.s =
                    (this.s ?: JsonField.of(mutableListOf())).also { checkKnown("s", it).add(s) }
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
             * Returns an immutable instance of [Stokes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Stokes =
                Stokes(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionName ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    (s ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Stokes = apply {
            if (validated) {
                return@apply
            }

            data()
            dimensionName()
            dimensions()
            notes()
            s()
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
            (data.asKnown().getOrNull()?.sumOf {
                it.sumOf {
                        it.sumOf {
                                it.sumOf {
                                        it.sumOf { it.sumOf { it.size.toInt() }.toInt() }.toInt()
                                    }
                                    .toInt()
                            }
                            .toInt()
                    }
                    .toInt()
            } ?: 0) +
                (dimensionName.asKnown().getOrNull()?.size ?: 0) +
                (dimensions.asKnown().getOrNull()?.size ?: 0) +
                (if (notes.asKnown().isPresent) 1 else 0) +
                (s.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Stokes &&
                data == other.data &&
                dimensionName == other.dimensionName &&
                dimensions == other.dimensions &&
                notes == other.notes &&
                s == other.s &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, dimensionName, dimensions, notes, s, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Stokes{data=$data, dimensionName=$dimensionName, dimensions=$dimensions, notes=$notes, s=$s, additionalProperties=$additionalProperties}"
    }

    class Time
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>,
        private val dimensionName: JsonField<List<String>>,
        private val dimensions: JsonField<List<Int>>,
        private val notes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = JsonMissing.of(),
            @JsonProperty("dimensionName")
            @ExcludeMissing
            dimensionName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        ) : this(data, dimensionName, dimensions, notes, mutableMapOf())

        /**
         * Array of times in number of seconds passed since January 1st, 1970 with the same
         * dimensions as power.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data(): Optional<List<List<List<List<List<List<List<Double>>>>>>>> =
            data.getOptional("data")

        /**
         * Array of names for dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensionName(): Optional<List<String>> = dimensionName.getOptional("dimensionName")

        /**
         * Array of integers of the time array dimensions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensions(): Optional<List<Int>> = dimensions.getOptional("dimensions")

        /**
         * The notes indicate the scheme and accuracy.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun _data(): JsonField<List<List<List<List<List<List<List<Double>>>>>>>> = data

        /**
         * Returns the raw JSON value of [dimensionName].
         *
         * Unlike [dimensionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionName")
        @ExcludeMissing
        fun _dimensionName(): JsonField<List<String>> = dimensionName

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<List<Int>> = dimensions

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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

            /** Returns a mutable builder for constructing an instance of [Time]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Time]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<List<List<List<List<List<List<Double>>>>>>>>? =
                null
            private var dimensionName: JsonField<MutableList<String>>? = null
            private var dimensions: JsonField<MutableList<Int>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(time: Time) = apply {
                data = time.data.map { it.toMutableList() }
                dimensionName = time.dimensionName.map { it.toMutableList() }
                dimensions = time.dimensions.map { it.toMutableList() }
                notes = time.notes
                additionalProperties = time.additionalProperties.toMutableMap()
            }

            /**
             * Array of times in number of seconds passed since January 1st, 1970 with the same
             * dimensions as power.
             */
            fun data(data: List<List<List<List<List<List<List<Double>>>>>>>) =
                data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed
             * `List<List<List<List<List<List<List<Double>>>>>>>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun data(data: JsonField<List<List<List<List<List<List<List<Double>>>>>>>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<List<List<List<List<List<Double>>>>>>] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: List<List<List<List<List<List<Double>>>>>>) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Array of names for dimensions. */
            fun dimensionName(dimensionName: List<String>) =
                dimensionName(JsonField.of(dimensionName))

            /**
             * Sets [Builder.dimensionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionName] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionName(dimensionName: JsonField<List<String>>) = apply {
                this.dimensionName = dimensionName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.dimensionName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionName(dimensionName: String) = apply {
                this.dimensionName =
                    (this.dimensionName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionName", it).add(dimensionName)
                    }
            }

            /** Array of integers of the time array dimensions. */
            fun dimensions(dimensions: List<Int>) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<List<Int>>) = apply {
                this.dimensions = dimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [dimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimension(dimension: Int) = apply {
                dimensions =
                    (dimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensions", it).add(dimension)
                    }
            }

            /** The notes indicate the scheme and accuracy. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * Returns an immutable instance of [Time].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Time =
                Time(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionName ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Time = apply {
            if (validated) {
                return@apply
            }

            data()
            dimensionName()
            dimensions()
            notes()
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
            (data.asKnown().getOrNull()?.sumOf {
                it.sumOf {
                        it.sumOf {
                                it.sumOf {
                                        it.sumOf { it.sumOf { it.size.toInt() }.toInt() }.toInt()
                                    }
                                    .toInt()
                            }
                            .toInt()
                    }
                    .toInt()
            } ?: 0) +
                (dimensionName.asKnown().getOrNull()?.size ?: 0) +
                (dimensions.asKnown().getOrNull()?.size ?: 0) +
                (if (notes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Time &&
                data == other.data &&
                dimensionName == other.dimensionName &&
                dimensions == other.dimensions &&
                notes == other.notes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, dimensionName, dimensions, notes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Time{data=$data, dimensionName=$dimensionName, dimensions=$dimensions, notes=$notes, additionalProperties=$additionalProperties}"
    }

    class TraceGeneric
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<List<List<Double>>>>,
        private val dimensionName: JsonField<List<String>>,
        private val notes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<List<List<Double>>>> = JsonMissing.of(),
            @JsonProperty("dimensionName")
            @ExcludeMissing
            dimensionName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        ) : this(data, dimensionName, notes, mutableMapOf())

        /**
         * Multi-dimensional Array. The 1st dimension spans points along the trace while the 2nd
         * dimension spans frequency-range pairs.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun data(): Optional<List<List<List<Double>>>> = data.getOptional("data")

        /**
         * Array of dimension names for trace generic data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dimensionName(): Optional<List<String>> = dimensionName.getOptional("dimensionName")

        /**
         * Notes for the trace generic data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun _data(): JsonField<List<List<List<Double>>>> = data

        /**
         * Returns the raw JSON value of [dimensionName].
         *
         * Unlike [dimensionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionName")
        @ExcludeMissing
        fun _dimensionName(): JsonField<List<String>> = dimensionName

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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

            /** Returns a mutable builder for constructing an instance of [TraceGeneric]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TraceGeneric]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<List<List<Double>>>>? = null
            private var dimensionName: JsonField<MutableList<String>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(traceGeneric: TraceGeneric) = apply {
                data = traceGeneric.data.map { it.toMutableList() }
                dimensionName = traceGeneric.dimensionName.map { it.toMutableList() }
                notes = traceGeneric.notes
                additionalProperties = traceGeneric.additionalProperties.toMutableMap()
            }

            /**
             * Multi-dimensional Array. The 1st dimension spans points along the trace while the 2nd
             * dimension spans frequency-range pairs.
             */
            fun data(data: List<List<List<Double>>>) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed `List<List<List<Double>>>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun data(data: JsonField<List<List<List<Double>>>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<List<Double>>] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: List<List<Double>>) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Array of dimension names for trace generic data. */
            fun dimensionName(dimensionName: List<String>) =
                dimensionName(JsonField.of(dimensionName))

            /**
             * Sets [Builder.dimensionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionName] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionName(dimensionName: JsonField<List<String>>) = apply {
                this.dimensionName = dimensionName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.dimensionName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionName(dimensionName: String) = apply {
                this.dimensionName =
                    (this.dimensionName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionName", it).add(dimensionName)
                    }
            }

            /** Notes for the trace generic data. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * Returns an immutable instance of [TraceGeneric].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TraceGeneric =
                TraceGeneric(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionName ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TraceGeneric = apply {
            if (validated) {
                return@apply
            }

            data()
            dimensionName()
            notes()
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
            (data.asKnown().getOrNull()?.sumOf { it.sumOf { it.size.toInt() }.toInt() } ?: 0) +
                (dimensionName.asKnown().getOrNull()?.size ?: 0) +
                (if (notes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TraceGeneric &&
                data == other.data &&
                dimensionName == other.dimensionName &&
                notes == other.notes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, dimensionName, notes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TraceGeneric{data=$data, dimensionName=$dimensionName, notes=$notes, additionalProperties=$additionalProperties}"
    }

    /** Enums: Mobile, Static. */
    class TransmitSensorType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MOBILE = of("Mobile")

            @JvmField val STATIC = of("Static")

            @JvmStatic fun of(value: String) = TransmitSensorType(JsonField.of(value))
        }

        /** An enum containing [TransmitSensorType]'s known values. */
        enum class Known {
            MOBILE,
            STATIC,
        }

        /**
         * An enum containing [TransmitSensorType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransmitSensorType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MOBILE,
            STATIC,
            /**
             * An enum member indicating that [TransmitSensorType] was instantiated with an unknown
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
                MOBILE -> Value.MOBILE
                STATIC -> Value.STATIC
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
                MOBILE -> Known.MOBILE
                STATIC -> Known.STATIC
                else ->
                    throw UnifieddatalibraryInvalidDataException(
                        "Unknown TransmitSensorType: $value"
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

        fun validate(): TransmitSensorType = apply {
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

            return other is TransmitSensorType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IonoObservationTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            startTimeUtc == other.startTimeUtc &&
            stationId == other.stationId &&
            system == other.system &&
            systemInfo == other.systemInfo &&
            id == other.id &&
            amplitude == other.amplitude &&
            antennaElementPosition == other.antennaElementPosition &&
            antennaElementPositionCoordinateSystem ==
                other.antennaElementPositionCoordinateSystem &&
            artistFlags == other.artistFlags &&
            azimuth == other.azimuth &&
            b0 == other.b0 &&
            b1 == other.b1 &&
            charAtts == other.charAtts &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            d == other.d &&
            d1 == other.d1 &&
            datum == other.datum &&
            deltafoF2 == other.deltafoF2 &&
            densityProfile == other.densityProfile &&
            doppler == other.doppler &&
            downE == other.downE &&
            downEs == other.downEs &&
            downF == other.downF &&
            electronDensity == other.electronDensity &&
            electronDensityUncertainty == other.electronDensityUncertainty &&
            elevation == other.elevation &&
            fbEs == other.fbEs &&
            fe == other.fe &&
            ff == other.ff &&
            fhprimeF == other.fhprimeF &&
            fhprimeF2 == other.fhprimeF2 &&
            fmin == other.fmin &&
            fminE == other.fminE &&
            fminEs == other.fminEs &&
            fminF == other.fminF &&
            fmuf == other.fmuf &&
            foE == other.foE &&
            foEa == other.foEa &&
            foEp == other.foEp &&
            foEs == other.foEs &&
            foF1 == other.foF1 &&
            foF1p == other.foF1p &&
            foF2 == other.foF2 &&
            foF2p == other.foF2p &&
            foP == other.foP &&
            frequency == other.frequency &&
            fxE == other.fxE &&
            fxF1 == other.fxF1 &&
            fxF2 == other.fxF2 &&
            fxI == other.fxI &&
            height == other.height &&
            hmE == other.hmE &&
            hmF1 == other.hmF1 &&
            hmF2 == other.hmF2 &&
            hprimeE == other.hprimeE &&
            hprimeEa == other.hprimeEa &&
            hprimeEs == other.hprimeEs &&
            hprimeF == other.hprimeF &&
            hprimeF1 == other.hprimeF1 &&
            hprimeF2 == other.hprimeF2 &&
            hprimefMuf == other.hprimefMuf &&
            hprimeP == other.hprimeP &&
            idSensor == other.idSensor &&
            luf == other.luf &&
            md == other.md &&
            mufd == other.mufd &&
            neProfileName == other.neProfileName &&
            neProfileVersion == other.neProfileVersion &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origSensorId == other.origSensorId &&
            phase == other.phase &&
            plasmaFrequency == other.plasmaFrequency &&
            plasmaFrequencyUncertainty == other.plasmaFrequencyUncertainty &&
            platformName == other.platformName &&
            polarization == other.polarization &&
            power == other.power &&
            qe == other.qe &&
            qf == other.qf &&
            range == other.range &&
            receiveCoordinates == other.receiveCoordinates &&
            receiveSensorType == other.receiveSensorType &&
            restrictedFrequency == other.restrictedFrequency &&
            restrictedFrequencyNotes == other.restrictedFrequencyNotes &&
            scaleHeightF2Peak == other.scaleHeightF2Peak &&
            scalerInfo == other.scalerInfo &&
            stokes == other.stokes &&
            systemNotes == other.systemNotes &&
            tec == other.tec &&
            tidAzimuth == other.tidAzimuth &&
            tidPeriods == other.tidPeriods &&
            tidPhaseSpeeds == other.tidPhaseSpeeds &&
            time == other.time &&
            traceGeneric == other.traceGeneric &&
            transmitCoordinates == other.transmitCoordinates &&
            transmitSensorType == other.transmitSensorType &&
            typeEs == other.typeEs &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            yE == other.yE &&
            yF1 == other.yF1 &&
            yF2 == other.yF2 &&
            zhalfNm == other.zhalfNm &&
            zmE == other.zmE &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            source,
            startTimeUtc,
            stationId,
            system,
            systemInfo,
            id,
            amplitude,
            antennaElementPosition,
            antennaElementPositionCoordinateSystem,
            artistFlags,
            azimuth,
            b0,
            b1,
            charAtts,
            createdAt,
            createdBy,
            d,
            d1,
            datum,
            deltafoF2,
            densityProfile,
            doppler,
            downE,
            downEs,
            downF,
            electronDensity,
            electronDensityUncertainty,
            elevation,
            fbEs,
            fe,
            ff,
            fhprimeF,
            fhprimeF2,
            fmin,
            fminE,
            fminEs,
            fminF,
            fmuf,
            foE,
            foEa,
            foEp,
            foEs,
            foF1,
            foF1p,
            foF2,
            foF2p,
            foP,
            frequency,
            fxE,
            fxF1,
            fxF2,
            fxI,
            height,
            hmE,
            hmF1,
            hmF2,
            hprimeE,
            hprimeEa,
            hprimeEs,
            hprimeF,
            hprimeF1,
            hprimeF2,
            hprimefMuf,
            hprimeP,
            idSensor,
            luf,
            md,
            mufd,
            neProfileName,
            neProfileVersion,
            origin,
            origNetwork,
            origSensorId,
            phase,
            plasmaFrequency,
            plasmaFrequencyUncertainty,
            platformName,
            polarization,
            power,
            qe,
            qf,
            range,
            receiveCoordinates,
            receiveSensorType,
            restrictedFrequency,
            restrictedFrequencyNotes,
            scaleHeightF2Peak,
            scalerInfo,
            stokes,
            systemNotes,
            tec,
            tidAzimuth,
            tidPeriods,
            tidPhaseSpeeds,
            time,
            traceGeneric,
            transmitCoordinates,
            transmitSensorType,
            typeEs,
            updatedAt,
            updatedBy,
            yE,
            yF1,
            yF2,
            zhalfNm,
            zmE,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IonoObservationTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, startTimeUtc=$startTimeUtc, stationId=$stationId, system=$system, systemInfo=$systemInfo, id=$id, amplitude=$amplitude, antennaElementPosition=$antennaElementPosition, antennaElementPositionCoordinateSystem=$antennaElementPositionCoordinateSystem, artistFlags=$artistFlags, azimuth=$azimuth, b0=$b0, b1=$b1, charAtts=$charAtts, createdAt=$createdAt, createdBy=$createdBy, d=$d, d1=$d1, datum=$datum, deltafoF2=$deltafoF2, densityProfile=$densityProfile, doppler=$doppler, downE=$downE, downEs=$downEs, downF=$downF, electronDensity=$electronDensity, electronDensityUncertainty=$electronDensityUncertainty, elevation=$elevation, fbEs=$fbEs, fe=$fe, ff=$ff, fhprimeF=$fhprimeF, fhprimeF2=$fhprimeF2, fmin=$fmin, fminE=$fminE, fminEs=$fminEs, fminF=$fminF, fmuf=$fmuf, foE=$foE, foEa=$foEa, foEp=$foEp, foEs=$foEs, foF1=$foF1, foF1p=$foF1p, foF2=$foF2, foF2p=$foF2p, foP=$foP, frequency=$frequency, fxE=$fxE, fxF1=$fxF1, fxF2=$fxF2, fxI=$fxI, height=$height, hmE=$hmE, hmF1=$hmF1, hmF2=$hmF2, hprimeE=$hprimeE, hprimeEa=$hprimeEa, hprimeEs=$hprimeEs, hprimeF=$hprimeF, hprimeF1=$hprimeF1, hprimeF2=$hprimeF2, hprimefMuf=$hprimefMuf, hprimeP=$hprimeP, idSensor=$idSensor, luf=$luf, md=$md, mufd=$mufd, neProfileName=$neProfileName, neProfileVersion=$neProfileVersion, origin=$origin, origNetwork=$origNetwork, origSensorId=$origSensorId, phase=$phase, plasmaFrequency=$plasmaFrequency, plasmaFrequencyUncertainty=$plasmaFrequencyUncertainty, platformName=$platformName, polarization=$polarization, power=$power, qe=$qe, qf=$qf, range=$range, receiveCoordinates=$receiveCoordinates, receiveSensorType=$receiveSensorType, restrictedFrequency=$restrictedFrequency, restrictedFrequencyNotes=$restrictedFrequencyNotes, scaleHeightF2Peak=$scaleHeightF2Peak, scalerInfo=$scalerInfo, stokes=$stokes, systemNotes=$systemNotes, tec=$tec, tidAzimuth=$tidAzimuth, tidPeriods=$tidPeriods, tidPhaseSpeeds=$tidPhaseSpeeds, time=$time, traceGeneric=$traceGeneric, transmitCoordinates=$transmitCoordinates, transmitSensorType=$transmitSensorType, typeEs=$typeEs, updatedAt=$updatedAt, updatedBy=$updatedBy, yE=$yE, yF1=$yF1, yF2=$yF2, zhalfNm=$zhalfNm, zmE=$zmE, additionalProperties=$additionalProperties}"
}

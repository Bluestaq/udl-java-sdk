// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sgi

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

/** Model representation of space weather/solar, geomagnetic, and radiation belt indices. */
class SgiGetDataByEffectiveAsOfDateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val effectiveDate: JsonField<OffsetDateTime>,
    private val sgiDate: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val analyzerAttenuation: JsonField<Double>,
    private val ap: JsonField<Double>,
    private val apDuration: JsonField<Int>,
    private val coeffDegree: JsonField<List<Int>>,
    private val coeffOrder: JsonField<List<Int>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val ctce: JsonField<List<Double>>,
    private val ctci: JsonField<List<Double>>,
    private val dst: JsonField<Double>,
    private val dtc: JsonField<Double>,
    private val e10: JsonField<Double>,
    private val e54: JsonField<Double>,
    private val f10: JsonField<Double>,
    private val f10High: JsonField<Double>,
    private val f10Low: JsonField<Double>,
    private val f54: JsonField<Double>,
    private val f81: JsonField<Double>,
    private val frequencies: JsonField<List<Double>>,
    private val gamma: JsonField<Int>,
    private val idSensor: JsonField<String>,
    private val kIndex: JsonField<Int>,
    private val kp: JsonField<Double>,
    private val kpDuration: JsonField<Int>,
    private val m10: JsonField<Double>,
    private val m54: JsonField<Double>,
    private val mode: JsonField<Int>,
    private val normFactor: JsonField<Double>,
    private val observedBaseline: JsonField<List<Int>>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val powers: JsonField<List<Double>>,
    private val precedence: JsonField<Precedence>,
    private val rawFileUri: JsonField<String>,
    private val rbDuration: JsonField<Int>,
    private val rbIndex: JsonField<Double>,
    private val rbRegionCode: JsonField<Int>,
    private val s10: JsonField<Double>,
    private val s54: JsonField<Double>,
    private val state: JsonField<State>,
    private val stationName: JsonField<String>,
    private val stce: JsonField<List<Double>>,
    private val stci: JsonField<List<Double>>,
    private val sunspotNum: JsonField<Double>,
    private val sunspotNumHigh: JsonField<Double>,
    private val sunspotNumLow: JsonField<Double>,
    private val tags: JsonField<List<String>>,
    private val transactionId: JsonField<String>,
    private val type: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val y10: JsonField<Double>,
    private val y54: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("effectiveDate")
        @ExcludeMissing
        effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sgiDate")
        @ExcludeMissing
        sgiDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("analyzerAttenuation")
        @ExcludeMissing
        analyzerAttenuation: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ap") @ExcludeMissing ap: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("apDuration") @ExcludeMissing apDuration: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("coeffDegree")
        @ExcludeMissing
        coeffDegree: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("coeffOrder")
        @ExcludeMissing
        coeffOrder: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ctce") @ExcludeMissing ctce: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("ctci") @ExcludeMissing ctci: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("dst") @ExcludeMissing dst: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dtc") @ExcludeMissing dtc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("e10") @ExcludeMissing e10: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("e54") @ExcludeMissing e54: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("f10") @ExcludeMissing f10: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("f10High") @ExcludeMissing f10High: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("f10Low") @ExcludeMissing f10Low: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("f54") @ExcludeMissing f54: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("f81") @ExcludeMissing f81: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("frequencies")
        @ExcludeMissing
        frequencies: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("gamma") @ExcludeMissing gamma: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("kIndex") @ExcludeMissing kIndex: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("kp") @ExcludeMissing kp: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("kpDuration") @ExcludeMissing kpDuration: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("m10") @ExcludeMissing m10: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("m54") @ExcludeMissing m54: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("normFactor")
        @ExcludeMissing
        normFactor: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("observedBaseline")
        @ExcludeMissing
        observedBaseline: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origSensorId")
        @ExcludeMissing
        origSensorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("powers") @ExcludeMissing powers: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("precedence")
        @ExcludeMissing
        precedence: JsonField<Precedence> = JsonMissing.of(),
        @JsonProperty("rawFileURI")
        @ExcludeMissing
        rawFileUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rbDuration") @ExcludeMissing rbDuration: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("rbIndex") @ExcludeMissing rbIndex: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rbRegionCode")
        @ExcludeMissing
        rbRegionCode: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("s10") @ExcludeMissing s10: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("s54") @ExcludeMissing s54: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
        @JsonProperty("stationName")
        @ExcludeMissing
        stationName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stce") @ExcludeMissing stce: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("stci") @ExcludeMissing stci: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("sunspotNum")
        @ExcludeMissing
        sunspotNum: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sunspotNumHigh")
        @ExcludeMissing
        sunspotNumHigh: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sunspotNumLow")
        @ExcludeMissing
        sunspotNumLow: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("y10") @ExcludeMissing y10: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("y54") @ExcludeMissing y54: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        effectiveDate,
        sgiDate,
        source,
        id,
        analyzerAttenuation,
        ap,
        apDuration,
        coeffDegree,
        coeffOrder,
        createdAt,
        createdBy,
        ctce,
        ctci,
        dst,
        dtc,
        e10,
        e54,
        f10,
        f10High,
        f10Low,
        f54,
        f81,
        frequencies,
        gamma,
        idSensor,
        kIndex,
        kp,
        kpDuration,
        m10,
        m54,
        mode,
        normFactor,
        observedBaseline,
        origin,
        origNetwork,
        origSensorId,
        powers,
        precedence,
        rawFileUri,
        rbDuration,
        rbIndex,
        rbRegionCode,
        s10,
        s54,
        state,
        stationName,
        stce,
        stci,
        sunspotNum,
        sunspotNumHigh,
        sunspotNumLow,
        tags,
        transactionId,
        type,
        updatedAt,
        updatedBy,
        y10,
        y54,
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
     * ISO8601 UTC Time the data was received and processed from the source. Typically a source
     * provides data for a date window with each transmission including past, present, and future
     * predicted values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveDate(): OffsetDateTime = effectiveDate.getRequired("effectiveDate")

    /**
     * ISO8601 UTC Time of the index value. This could be a past, current, or future predicted
     * value. Note: sgiDate defines the start time of the time window for this data record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sgiDate(): OffsetDateTime = sgiDate.getRequired("sgiDate")

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
     * Signal analyzer's input attenuation level, in decibels. Attenuation is a setting on the
     * hardware that measures the power of a signal.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun analyzerAttenuation(): Optional<Double> =
        analyzerAttenuation.getOptional("analyzerAttenuation")

    /**
     * Ap is the planetary geomagnetic 2 nT index (00-21 UT) for the timespan specified in
     * apDuration. If apDuration is null, a 3 hour duration should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ap(): Optional<Double> = ap.getOptional("ap")

    /**
     * The time, in hours, for which the Ap index value is valid. If null, a span of 3 hours is
     * assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun apDuration(): Optional<Int> = apDuration.getOptional("apDuration")

    /**
     * Array containing the degree of the temperature coefficients. The coeffDegree and coeffOrder
     * arrays must be the same length.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coeffDegree(): Optional<List<Int>> = coeffDegree.getOptional("coeffDegree")

    /**
     * Array containing the order of the temperature coefficients. The coeffDegree and coeffOrder
     * arrays must be the same length.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coeffOrder(): Optional<List<Int>> = coeffOrder.getOptional("coeffOrder")

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
     * Array containing the cosine spherical-harmonic coefficients for Exospheric temperature (DTC)
     * difference. Each array element corresponds to the positional index of the coeffDegree and
     * coeffOrder arrays.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ctce(): Optional<List<Double>> = ctce.getOptional("ctce")

    /**
     * Array containing the cosine spherical-harmonic coefficients for Inflection temperature (DTX)
     * difference. Each array element corresponds to the positional index of the coeffDegree and
     * coeffOrder arrays.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ctci(): Optional<List<Double>> = ctci.getOptional("ctci")

    /**
     * Disturbance Storm Time geomagnetic index in nT.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dst(): Optional<Double> = dst.getOptional("dst")

    /**
     * delta exospheric temperature correction in units of K.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dtc(): Optional<Double> = dtc.getOptional("dtc")

    /**
     * Extreme Ultraviolet (EUV) proxy, E10.7, in x10-22 Watts per meter squared per Hertz, is the
     * integrated solar EUV energy flux at the top of atmosphere and normalized to solar flux units.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun e10(): Optional<Double> = e10.getOptional("e10")

    /**
     * E54 (E10-Bar), in x10-22 Watts per meter squared per Hertz, uses the past 54-days E10 values
     * to determine the E10 average.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun e54(): Optional<Double> = e54.getOptional("e54")

    /**
     * Daily solar 10.7 cm radio flux in x10-22 Watts per meter squared per Hertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun f10(): Optional<Double> = f10.getOptional("f10")

    /**
     * Daily F10.7 index - high range, in x10-22 Watts per meter squared per Hertz. This field
     * usually applies to forecast values, based on the consensus of the Solar Cycle 24 Prediction
     * Panel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun f10High(): Optional<Double> = f10High.getOptional("f10High")

    /**
     * Daily F10.7 index - low range, in x10-22 Watts per meter squared per Hertz. This field
     * usually applies to forecast values, based on the consensus of the Solar Cycle 24 Prediction
     * Panel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun f10Low(): Optional<Double> = f10Low.getOptional("f10Low")

    /**
     * 54 day solar 10.7 cm radio flux in x10-22 Watts per meter squared per Hertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun f54(): Optional<Double> = f54.getOptional("f54")

    /**
     * 81 day solar 10.7 cm radio flux in x10-22 Watts per meter squared per Hertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun f81(): Optional<Double> = f81.getOptional("f81")

    /**
     * Array of individual power spectral density (PSD) frequencies of the signal, in megahertz.
     * This array should correspond with the same-sized array of powers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun frequencies(): Optional<List<Double>> = frequencies.getOptional("frequencies")

    /**
     * The maximum measured gamma deflection during the kpDuration timespan. If kpDuration is null,
     * a 3 hour duration should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gamma(): Optional<Int> = gamma.getOptional("gamma")

    /**
     * Unique identifier of the reporting sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

    /**
     * The maximum measured K-Index at the associated station during the kpDuration timespan. The
     * K-Index is a unitless measure (0 - 9) of the deviation in the Earth's magnetic field from
     * normal at the station geographic location, with 0 indicating the absence of geomagnetic
     * disturbance, and 9 indicating the most significant disturbance. If kpDuration is null, a 3
     * hour duration should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun kIndex(): Optional<Int> = kIndex.getOptional("kIndex")

    /**
     * The Planetary K-index (Kp) over the kpDuration timespan. The Kp-Index is the average K-Index
     * for the entire Earth, utilizing a unitless scale (0-9, in incremenets of 1/3), with 0
     * indicating the absence of geomagnetic disturbance, and 9 indicating the most significant
     * disturbance. If kpDuration is null, a 3 hour duration should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun kp(): Optional<Double> = kp.getOptional("kp")

    /**
     * The time, in hours, over which the K, Kp, and/or gamma index values are measured. If null, a
     * span of 3 hours is assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun kpDuration(): Optional<Int> = kpDuration.getOptional("kpDuration")

    /**
     * Daily M10.7 index for 100-110 km heating of O2 by solar photosphere. 160 nm SRC emissions in
     * x10-22 Watts per meter squared per Hertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m10(): Optional<Double> = m10.getOptional("m10")

    /**
     * 54 day M10.7 index for 100-110 km heating of O2 by solar photosphere. 160 nm SRC emissions in
     * x10-22 Watts per meter squared per Hertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m54(): Optional<Double> = m54.getOptional("m54")

    /**
     * The transmitted DCA mode of the record (1-3).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mode(): Optional<Int> = mode.getOptional("mode")

    /**
     * The normalization factor that has already been applied to the index value prior to record
     * ingest. Typically used to normalize the index value to a particular interval. Units of the
     * normalization factor may vary depending on the provider of this data (REACH, POES, CEASE3,
     * etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun normFactor(): Optional<Double> = normFactor.getOptional("normFactor")

    /**
     * Observed baseline values of the frequencies specified in the frequencies field, in solar flux
     * units. The baseline values will be used to help detect abnormal readings from the sun that
     * might indicate a flare or other solar activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun observedBaseline(): Optional<List<Int>> = observedBaseline.getOptional("observedBaseline")

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
     * Optional identifier provided by the reporting source to indicate the sensor identifier which
     * produced this data. This may be an internal identifier and not necessarily a valid sensor ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

    /**
     * Array of individual power spectral density (PSD) powers of the signal, in watts. This array
     * should correspond with the same-sized array of frequencies.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun powers(): Optional<List<Double>> = powers.getOptional("powers")

    /**
     * The precedence of data in this record (O = Immediate, P = Priority, R = Routine, Y =
     * Emergency, Z = Flash).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun precedence(): Optional<Precedence> = precedence.getOptional("precedence")

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
     * The timespan over which the associated radiation belt index is factored. If rbDuration is
     * null, a 24 hour duration should be assumed. Note: rbDuration defines the length of the time
     * window for this data record. The time window start time is defined by sgiDate, and the time
     * window end time is defined by sgiDate plus rbDuration.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rbDuration(): Optional<Int> = rbDuration.getOptional("rbDuration")

    /**
     * The value of the radiation belt index. This is the ratio of current intensity of a radiation
     * belt to long-term average value. It's long-term average should be close to 1. Depending on
     * the type of belt sensor, this ratio may measure Flux (number of particles / (cm^2 sec energy
     * solid-angle)), dose rate (rad per second), or relative counts of particles per time (counts
     * per second). The index value may also be normalized, the normalization value typically
     * represents an average of the sensor measurements taken within a region over a given time
     * interval. See the normFactor field for the specific normalization factor, if provided.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rbIndex(): Optional<Double> = rbIndex.getOptional("rbIndex")

    /**
     * Region code for the associated radiation belt index. This is the code associated with the
     * corresponding radiation belt location. See the provider card for reference to specific region
     * code definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rbRegionCode(): Optional<Int> = rbRegionCode.getOptional("rbRegionCode")

    /**
     * Daily S10.7 index for >200 km heating of O by solar chromosphere. 28.4-30.4 nm emissions in
     * x10-22 Watts per meter squared per Hertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun s10(): Optional<Double> = s10.getOptional("s10")

    /**
     * 54 day S10.7 index for >200 km heating of O by solar chromosphere. 28.4-30.4 nm emissions in
     * x10-22 Watts per meter squared per Hertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun s54(): Optional<Double> = s54.getOptional("s54")

    /**
     * State indicating Issued (I), Nowcast (N), or Predicted (P) values for this record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun state(): Optional<State> = state.getOptional("state")

    /**
     * The name/location of the station that collected the geomagnetic data for this record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stationName(): Optional<String> = stationName.getOptional("stationName")

    /**
     * Array containing the sine spherical-harmonic coefficients for Exospheric temperature (DTC)
     * difference. Each array element corresponds to the positional index of the coeffDegree and
     * coeffOrder arrays.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stce(): Optional<List<Double>> = stce.getOptional("stce")

    /**
     * Array containing the sine spherical harmonic coefficients for Inflection temperature (DTX)
     * difference. Each array element corresponds to the positional index of the coeffDegree and
     * coeffOrder arrays.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stci(): Optional<List<Double>> = stci.getOptional("stci")

    /**
     * Daily sunspot number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sunspotNum(): Optional<Double> = sunspotNum.getOptional("sunspotNum")

    /**
     * Daily sunspot number - high range. This field usually applies to forecast values, based on
     * the consensus of the Solar Cycle 24 Prediction Panel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sunspotNumHigh(): Optional<Double> = sunspotNumHigh.getOptional("sunspotNumHigh")

    /**
     * Daily sunspot number - low range. This field usually applies to forecast values, based on the
     * consensus of the Solar Cycle 24 Prediction Panel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sunspotNumLow(): Optional<Double> = sunspotNumLow.getOptional("sunspotNumLow")

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
     * The type of data contained in this record (e.g. HASDM, JBH09, K-Index, PSD-dB, RBI, RFI-SFU,
     * etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Time the row was last updated in the database, auto-populated by the system.
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
     * Daily Y10.7 index for 85-90 km heating of N2, O2, H2O, NO by solar coronal. 0.1-0.8 nm and
     * Lya 121 nm emissions in x10-22 Watts per meter squared per Hertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun y10(): Optional<Double> = y10.getOptional("y10")

    /**
     * 54 day Y10.7 index for 85-90 km heating of N2, O2, H2O, NO by solar coronal. 0.1-0.8 nm and
     * Lya 121 nm emissions in x10-22 Watts per meter squared per Hertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun y54(): Optional<Double> = y54.getOptional("y54")

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
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effectiveDate")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

    /**
     * Returns the raw JSON value of [sgiDate].
     *
     * Unlike [sgiDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sgiDate") @ExcludeMissing fun _sgiDate(): JsonField<OffsetDateTime> = sgiDate

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
     * Returns the raw JSON value of [analyzerAttenuation].
     *
     * Unlike [analyzerAttenuation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("analyzerAttenuation")
    @ExcludeMissing
    fun _analyzerAttenuation(): JsonField<Double> = analyzerAttenuation

    /**
     * Returns the raw JSON value of [ap].
     *
     * Unlike [ap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ap") @ExcludeMissing fun _ap(): JsonField<Double> = ap

    /**
     * Returns the raw JSON value of [apDuration].
     *
     * Unlike [apDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apDuration") @ExcludeMissing fun _apDuration(): JsonField<Int> = apDuration

    /**
     * Returns the raw JSON value of [coeffDegree].
     *
     * Unlike [coeffDegree], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coeffDegree")
    @ExcludeMissing
    fun _coeffDegree(): JsonField<List<Int>> = coeffDegree

    /**
     * Returns the raw JSON value of [coeffOrder].
     *
     * Unlike [coeffOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coeffOrder") @ExcludeMissing fun _coeffOrder(): JsonField<List<Int>> = coeffOrder

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
     * Returns the raw JSON value of [ctce].
     *
     * Unlike [ctce], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ctce") @ExcludeMissing fun _ctce(): JsonField<List<Double>> = ctce

    /**
     * Returns the raw JSON value of [ctci].
     *
     * Unlike [ctci], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ctci") @ExcludeMissing fun _ctci(): JsonField<List<Double>> = ctci

    /**
     * Returns the raw JSON value of [dst].
     *
     * Unlike [dst], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dst") @ExcludeMissing fun _dst(): JsonField<Double> = dst

    /**
     * Returns the raw JSON value of [dtc].
     *
     * Unlike [dtc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtc") @ExcludeMissing fun _dtc(): JsonField<Double> = dtc

    /**
     * Returns the raw JSON value of [e10].
     *
     * Unlike [e10], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("e10") @ExcludeMissing fun _e10(): JsonField<Double> = e10

    /**
     * Returns the raw JSON value of [e54].
     *
     * Unlike [e54], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("e54") @ExcludeMissing fun _e54(): JsonField<Double> = e54

    /**
     * Returns the raw JSON value of [f10].
     *
     * Unlike [f10], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("f10") @ExcludeMissing fun _f10(): JsonField<Double> = f10

    /**
     * Returns the raw JSON value of [f10High].
     *
     * Unlike [f10High], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("f10High") @ExcludeMissing fun _f10High(): JsonField<Double> = f10High

    /**
     * Returns the raw JSON value of [f10Low].
     *
     * Unlike [f10Low], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("f10Low") @ExcludeMissing fun _f10Low(): JsonField<Double> = f10Low

    /**
     * Returns the raw JSON value of [f54].
     *
     * Unlike [f54], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("f54") @ExcludeMissing fun _f54(): JsonField<Double> = f54

    /**
     * Returns the raw JSON value of [f81].
     *
     * Unlike [f81], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("f81") @ExcludeMissing fun _f81(): JsonField<Double> = f81

    /**
     * Returns the raw JSON value of [frequencies].
     *
     * Unlike [frequencies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequencies")
    @ExcludeMissing
    fun _frequencies(): JsonField<List<Double>> = frequencies

    /**
     * Returns the raw JSON value of [gamma].
     *
     * Unlike [gamma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gamma") @ExcludeMissing fun _gamma(): JsonField<Int> = gamma

    /**
     * Returns the raw JSON value of [idSensor].
     *
     * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

    /**
     * Returns the raw JSON value of [kIndex].
     *
     * Unlike [kIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kIndex") @ExcludeMissing fun _kIndex(): JsonField<Int> = kIndex

    /**
     * Returns the raw JSON value of [kp].
     *
     * Unlike [kp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kp") @ExcludeMissing fun _kp(): JsonField<Double> = kp

    /**
     * Returns the raw JSON value of [kpDuration].
     *
     * Unlike [kpDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kpDuration") @ExcludeMissing fun _kpDuration(): JsonField<Int> = kpDuration

    /**
     * Returns the raw JSON value of [m10].
     *
     * Unlike [m10], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m10") @ExcludeMissing fun _m10(): JsonField<Double> = m10

    /**
     * Returns the raw JSON value of [m54].
     *
     * Unlike [m54], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m54") @ExcludeMissing fun _m54(): JsonField<Double> = m54

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Int> = mode

    /**
     * Returns the raw JSON value of [normFactor].
     *
     * Unlike [normFactor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("normFactor") @ExcludeMissing fun _normFactor(): JsonField<Double> = normFactor

    /**
     * Returns the raw JSON value of [observedBaseline].
     *
     * Unlike [observedBaseline], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("observedBaseline")
    @ExcludeMissing
    fun _observedBaseline(): JsonField<List<Int>> = observedBaseline

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
     * Returns the raw JSON value of [powers].
     *
     * Unlike [powers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("powers") @ExcludeMissing fun _powers(): JsonField<List<Double>> = powers

    /**
     * Returns the raw JSON value of [precedence].
     *
     * Unlike [precedence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("precedence")
    @ExcludeMissing
    fun _precedence(): JsonField<Precedence> = precedence

    /**
     * Returns the raw JSON value of [rawFileUri].
     *
     * Unlike [rawFileUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rawFileURI") @ExcludeMissing fun _rawFileUri(): JsonField<String> = rawFileUri

    /**
     * Returns the raw JSON value of [rbDuration].
     *
     * Unlike [rbDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rbDuration") @ExcludeMissing fun _rbDuration(): JsonField<Int> = rbDuration

    /**
     * Returns the raw JSON value of [rbIndex].
     *
     * Unlike [rbIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rbIndex") @ExcludeMissing fun _rbIndex(): JsonField<Double> = rbIndex

    /**
     * Returns the raw JSON value of [rbRegionCode].
     *
     * Unlike [rbRegionCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rbRegionCode") @ExcludeMissing fun _rbRegionCode(): JsonField<Int> = rbRegionCode

    /**
     * Returns the raw JSON value of [s10].
     *
     * Unlike [s10], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("s10") @ExcludeMissing fun _s10(): JsonField<Double> = s10

    /**
     * Returns the raw JSON value of [s54].
     *
     * Unlike [s54], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("s54") @ExcludeMissing fun _s54(): JsonField<Double> = s54

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /**
     * Returns the raw JSON value of [stationName].
     *
     * Unlike [stationName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stationName") @ExcludeMissing fun _stationName(): JsonField<String> = stationName

    /**
     * Returns the raw JSON value of [stce].
     *
     * Unlike [stce], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stce") @ExcludeMissing fun _stce(): JsonField<List<Double>> = stce

    /**
     * Returns the raw JSON value of [stci].
     *
     * Unlike [stci], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stci") @ExcludeMissing fun _stci(): JsonField<List<Double>> = stci

    /**
     * Returns the raw JSON value of [sunspotNum].
     *
     * Unlike [sunspotNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sunspotNum") @ExcludeMissing fun _sunspotNum(): JsonField<Double> = sunspotNum

    /**
     * Returns the raw JSON value of [sunspotNumHigh].
     *
     * Unlike [sunspotNumHigh], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sunspotNumHigh")
    @ExcludeMissing
    fun _sunspotNumHigh(): JsonField<Double> = sunspotNumHigh

    /**
     * Returns the raw JSON value of [sunspotNumLow].
     *
     * Unlike [sunspotNumLow], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sunspotNumLow")
    @ExcludeMissing
    fun _sunspotNumLow(): JsonField<Double> = sunspotNumLow

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
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
     * Returns the raw JSON value of [y10].
     *
     * Unlike [y10], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("y10") @ExcludeMissing fun _y10(): JsonField<Double> = y10

    /**
     * Returns the raw JSON value of [y54].
     *
     * Unlike [y54], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("y54") @ExcludeMissing fun _y54(): JsonField<Double> = y54

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
         * [SgiGetDataByEffectiveAsOfDateResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .effectiveDate()
         * .sgiDate()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SgiGetDataByEffectiveAsOfDateResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var effectiveDate: JsonField<OffsetDateTime>? = null
        private var sgiDate: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var analyzerAttenuation: JsonField<Double> = JsonMissing.of()
        private var ap: JsonField<Double> = JsonMissing.of()
        private var apDuration: JsonField<Int> = JsonMissing.of()
        private var coeffDegree: JsonField<MutableList<Int>>? = null
        private var coeffOrder: JsonField<MutableList<Int>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var ctce: JsonField<MutableList<Double>>? = null
        private var ctci: JsonField<MutableList<Double>>? = null
        private var dst: JsonField<Double> = JsonMissing.of()
        private var dtc: JsonField<Double> = JsonMissing.of()
        private var e10: JsonField<Double> = JsonMissing.of()
        private var e54: JsonField<Double> = JsonMissing.of()
        private var f10: JsonField<Double> = JsonMissing.of()
        private var f10High: JsonField<Double> = JsonMissing.of()
        private var f10Low: JsonField<Double> = JsonMissing.of()
        private var f54: JsonField<Double> = JsonMissing.of()
        private var f81: JsonField<Double> = JsonMissing.of()
        private var frequencies: JsonField<MutableList<Double>>? = null
        private var gamma: JsonField<Int> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var kIndex: JsonField<Int> = JsonMissing.of()
        private var kp: JsonField<Double> = JsonMissing.of()
        private var kpDuration: JsonField<Int> = JsonMissing.of()
        private var m10: JsonField<Double> = JsonMissing.of()
        private var m54: JsonField<Double> = JsonMissing.of()
        private var mode: JsonField<Int> = JsonMissing.of()
        private var normFactor: JsonField<Double> = JsonMissing.of()
        private var observedBaseline: JsonField<MutableList<Int>>? = null
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var powers: JsonField<MutableList<Double>>? = null
        private var precedence: JsonField<Precedence> = JsonMissing.of()
        private var rawFileUri: JsonField<String> = JsonMissing.of()
        private var rbDuration: JsonField<Int> = JsonMissing.of()
        private var rbIndex: JsonField<Double> = JsonMissing.of()
        private var rbRegionCode: JsonField<Int> = JsonMissing.of()
        private var s10: JsonField<Double> = JsonMissing.of()
        private var s54: JsonField<Double> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var stationName: JsonField<String> = JsonMissing.of()
        private var stce: JsonField<MutableList<Double>>? = null
        private var stci: JsonField<MutableList<Double>>? = null
        private var sunspotNum: JsonField<Double> = JsonMissing.of()
        private var sunspotNumHigh: JsonField<Double> = JsonMissing.of()
        private var sunspotNumLow: JsonField<Double> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var y10: JsonField<Double> = JsonMissing.of()
        private var y54: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            sgiGetDataByEffectiveAsOfDateResponse: SgiGetDataByEffectiveAsOfDateResponse
        ) = apply {
            classificationMarking = sgiGetDataByEffectiveAsOfDateResponse.classificationMarking
            dataMode = sgiGetDataByEffectiveAsOfDateResponse.dataMode
            effectiveDate = sgiGetDataByEffectiveAsOfDateResponse.effectiveDate
            sgiDate = sgiGetDataByEffectiveAsOfDateResponse.sgiDate
            source = sgiGetDataByEffectiveAsOfDateResponse.source
            id = sgiGetDataByEffectiveAsOfDateResponse.id
            analyzerAttenuation = sgiGetDataByEffectiveAsOfDateResponse.analyzerAttenuation
            ap = sgiGetDataByEffectiveAsOfDateResponse.ap
            apDuration = sgiGetDataByEffectiveAsOfDateResponse.apDuration
            coeffDegree =
                sgiGetDataByEffectiveAsOfDateResponse.coeffDegree.map { it.toMutableList() }
            coeffOrder = sgiGetDataByEffectiveAsOfDateResponse.coeffOrder.map { it.toMutableList() }
            createdAt = sgiGetDataByEffectiveAsOfDateResponse.createdAt
            createdBy = sgiGetDataByEffectiveAsOfDateResponse.createdBy
            ctce = sgiGetDataByEffectiveAsOfDateResponse.ctce.map { it.toMutableList() }
            ctci = sgiGetDataByEffectiveAsOfDateResponse.ctci.map { it.toMutableList() }
            dst = sgiGetDataByEffectiveAsOfDateResponse.dst
            dtc = sgiGetDataByEffectiveAsOfDateResponse.dtc
            e10 = sgiGetDataByEffectiveAsOfDateResponse.e10
            e54 = sgiGetDataByEffectiveAsOfDateResponse.e54
            f10 = sgiGetDataByEffectiveAsOfDateResponse.f10
            f10High = sgiGetDataByEffectiveAsOfDateResponse.f10High
            f10Low = sgiGetDataByEffectiveAsOfDateResponse.f10Low
            f54 = sgiGetDataByEffectiveAsOfDateResponse.f54
            f81 = sgiGetDataByEffectiveAsOfDateResponse.f81
            frequencies =
                sgiGetDataByEffectiveAsOfDateResponse.frequencies.map { it.toMutableList() }
            gamma = sgiGetDataByEffectiveAsOfDateResponse.gamma
            idSensor = sgiGetDataByEffectiveAsOfDateResponse.idSensor
            kIndex = sgiGetDataByEffectiveAsOfDateResponse.kIndex
            kp = sgiGetDataByEffectiveAsOfDateResponse.kp
            kpDuration = sgiGetDataByEffectiveAsOfDateResponse.kpDuration
            m10 = sgiGetDataByEffectiveAsOfDateResponse.m10
            m54 = sgiGetDataByEffectiveAsOfDateResponse.m54
            mode = sgiGetDataByEffectiveAsOfDateResponse.mode
            normFactor = sgiGetDataByEffectiveAsOfDateResponse.normFactor
            observedBaseline =
                sgiGetDataByEffectiveAsOfDateResponse.observedBaseline.map { it.toMutableList() }
            origin = sgiGetDataByEffectiveAsOfDateResponse.origin
            origNetwork = sgiGetDataByEffectiveAsOfDateResponse.origNetwork
            origSensorId = sgiGetDataByEffectiveAsOfDateResponse.origSensorId
            powers = sgiGetDataByEffectiveAsOfDateResponse.powers.map { it.toMutableList() }
            precedence = sgiGetDataByEffectiveAsOfDateResponse.precedence
            rawFileUri = sgiGetDataByEffectiveAsOfDateResponse.rawFileUri
            rbDuration = sgiGetDataByEffectiveAsOfDateResponse.rbDuration
            rbIndex = sgiGetDataByEffectiveAsOfDateResponse.rbIndex
            rbRegionCode = sgiGetDataByEffectiveAsOfDateResponse.rbRegionCode
            s10 = sgiGetDataByEffectiveAsOfDateResponse.s10
            s54 = sgiGetDataByEffectiveAsOfDateResponse.s54
            state = sgiGetDataByEffectiveAsOfDateResponse.state
            stationName = sgiGetDataByEffectiveAsOfDateResponse.stationName
            stce = sgiGetDataByEffectiveAsOfDateResponse.stce.map { it.toMutableList() }
            stci = sgiGetDataByEffectiveAsOfDateResponse.stci.map { it.toMutableList() }
            sunspotNum = sgiGetDataByEffectiveAsOfDateResponse.sunspotNum
            sunspotNumHigh = sgiGetDataByEffectiveAsOfDateResponse.sunspotNumHigh
            sunspotNumLow = sgiGetDataByEffectiveAsOfDateResponse.sunspotNumLow
            tags = sgiGetDataByEffectiveAsOfDateResponse.tags.map { it.toMutableList() }
            transactionId = sgiGetDataByEffectiveAsOfDateResponse.transactionId
            type = sgiGetDataByEffectiveAsOfDateResponse.type
            updatedAt = sgiGetDataByEffectiveAsOfDateResponse.updatedAt
            updatedBy = sgiGetDataByEffectiveAsOfDateResponse.updatedBy
            y10 = sgiGetDataByEffectiveAsOfDateResponse.y10
            y54 = sgiGetDataByEffectiveAsOfDateResponse.y54
            additionalProperties =
                sgiGetDataByEffectiveAsOfDateResponse.additionalProperties.toMutableMap()
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
         * ISO8601 UTC Time the data was received and processed from the source. Typically a source
         * provides data for a date window with each transmission including past, present, and
         * future predicted values.
         */
        fun effectiveDate(effectiveDate: OffsetDateTime) =
            effectiveDate(JsonField.of(effectiveDate))

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
            this.effectiveDate = effectiveDate
        }

        /**
         * ISO8601 UTC Time of the index value. This could be a past, current, or future predicted
         * value. Note: sgiDate defines the start time of the time window for this data record.
         */
        fun sgiDate(sgiDate: OffsetDateTime) = sgiDate(JsonField.of(sgiDate))

        /**
         * Sets [Builder.sgiDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sgiDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sgiDate(sgiDate: JsonField<OffsetDateTime>) = apply { this.sgiDate = sgiDate }

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
         * Signal analyzer's input attenuation level, in decibels. Attenuation is a setting on the
         * hardware that measures the power of a signal.
         */
        fun analyzerAttenuation(analyzerAttenuation: Double) =
            analyzerAttenuation(JsonField.of(analyzerAttenuation))

        /**
         * Sets [Builder.analyzerAttenuation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.analyzerAttenuation] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun analyzerAttenuation(analyzerAttenuation: JsonField<Double>) = apply {
            this.analyzerAttenuation = analyzerAttenuation
        }

        /**
         * Ap is the planetary geomagnetic 2 nT index (00-21 UT) for the timespan specified in
         * apDuration. If apDuration is null, a 3 hour duration should be assumed.
         */
        fun ap(ap: Double) = ap(JsonField.of(ap))

        /**
         * Sets [Builder.ap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ap] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ap(ap: JsonField<Double>) = apply { this.ap = ap }

        /**
         * The time, in hours, for which the Ap index value is valid. If null, a span of 3 hours is
         * assumed.
         */
        fun apDuration(apDuration: Int) = apDuration(JsonField.of(apDuration))

        /**
         * Sets [Builder.apDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apDuration] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apDuration(apDuration: JsonField<Int>) = apply { this.apDuration = apDuration }

        /**
         * Array containing the degree of the temperature coefficients. The coeffDegree and
         * coeffOrder arrays must be the same length.
         */
        fun coeffDegree(coeffDegree: List<Int>) = coeffDegree(JsonField.of(coeffDegree))

        /**
         * Sets [Builder.coeffDegree] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coeffDegree] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun coeffDegree(coeffDegree: JsonField<List<Int>>) = apply {
            this.coeffDegree = coeffDegree.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [Builder.coeffDegree].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCoeffDegree(coeffDegree: Int) = apply {
            this.coeffDegree =
                (this.coeffDegree ?: JsonField.of(mutableListOf())).also {
                    checkKnown("coeffDegree", it).add(coeffDegree)
                }
        }

        /**
         * Array containing the order of the temperature coefficients. The coeffDegree and
         * coeffOrder arrays must be the same length.
         */
        fun coeffOrder(coeffOrder: List<Int>) = coeffOrder(JsonField.of(coeffOrder))

        /**
         * Sets [Builder.coeffOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coeffOrder] with a well-typed `List<Int>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun coeffOrder(coeffOrder: JsonField<List<Int>>) = apply {
            this.coeffOrder = coeffOrder.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [Builder.coeffOrder].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCoeffOrder(coeffOrder: Int) = apply {
            this.coeffOrder =
                (this.coeffOrder ?: JsonField.of(mutableListOf())).also {
                    checkKnown("coeffOrder", it).add(coeffOrder)
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

        /**
         * Array containing the cosine spherical-harmonic coefficients for Exospheric temperature
         * (DTC) difference. Each array element corresponds to the positional index of the
         * coeffDegree and coeffOrder arrays.
         */
        fun ctce(ctce: List<Double>) = ctce(JsonField.of(ctce))

        /**
         * Sets [Builder.ctce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ctce] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ctce(ctce: JsonField<List<Double>>) = apply {
            this.ctce = ctce.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.ctce].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCtce(ctce: Double) = apply {
            this.ctce =
                (this.ctce ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ctce", it).add(ctce)
                }
        }

        /**
         * Array containing the cosine spherical-harmonic coefficients for Inflection temperature
         * (DTX) difference. Each array element corresponds to the positional index of the
         * coeffDegree and coeffOrder arrays.
         */
        fun ctci(ctci: List<Double>) = ctci(JsonField.of(ctci))

        /**
         * Sets [Builder.ctci] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ctci] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ctci(ctci: JsonField<List<Double>>) = apply {
            this.ctci = ctci.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.ctci].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCtci(ctci: Double) = apply {
            this.ctci =
                (this.ctci ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ctci", it).add(ctci)
                }
        }

        /** Disturbance Storm Time geomagnetic index in nT. */
        fun dst(dst: Double) = dst(JsonField.of(dst))

        /**
         * Sets [Builder.dst] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dst] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dst(dst: JsonField<Double>) = apply { this.dst = dst }

        /** delta exospheric temperature correction in units of K. */
        fun dtc(dtc: Double) = dtc(JsonField.of(dtc))

        /**
         * Sets [Builder.dtc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dtc(dtc: JsonField<Double>) = apply { this.dtc = dtc }

        /**
         * Extreme Ultraviolet (EUV) proxy, E10.7, in x10-22 Watts per meter squared per Hertz, is
         * the integrated solar EUV energy flux at the top of atmosphere and normalized to solar
         * flux units.
         */
        fun e10(e10: Double) = e10(JsonField.of(e10))

        /**
         * Sets [Builder.e10] to an arbitrary JSON value.
         *
         * You should usually call [Builder.e10] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun e10(e10: JsonField<Double>) = apply { this.e10 = e10 }

        /**
         * E54 (E10-Bar), in x10-22 Watts per meter squared per Hertz, uses the past 54-days E10
         * values to determine the E10 average.
         */
        fun e54(e54: Double) = e54(JsonField.of(e54))

        /**
         * Sets [Builder.e54] to an arbitrary JSON value.
         *
         * You should usually call [Builder.e54] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun e54(e54: JsonField<Double>) = apply { this.e54 = e54 }

        /** Daily solar 10.7 cm radio flux in x10-22 Watts per meter squared per Hertz. */
        fun f10(f10: Double) = f10(JsonField.of(f10))

        /**
         * Sets [Builder.f10] to an arbitrary JSON value.
         *
         * You should usually call [Builder.f10] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun f10(f10: JsonField<Double>) = apply { this.f10 = f10 }

        /**
         * Daily F10.7 index - high range, in x10-22 Watts per meter squared per Hertz. This field
         * usually applies to forecast values, based on the consensus of the Solar Cycle 24
         * Prediction Panel.
         */
        fun f10High(f10High: Double) = f10High(JsonField.of(f10High))

        /**
         * Sets [Builder.f10High] to an arbitrary JSON value.
         *
         * You should usually call [Builder.f10High] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun f10High(f10High: JsonField<Double>) = apply { this.f10High = f10High }

        /**
         * Daily F10.7 index - low range, in x10-22 Watts per meter squared per Hertz. This field
         * usually applies to forecast values, based on the consensus of the Solar Cycle 24
         * Prediction Panel.
         */
        fun f10Low(f10Low: Double) = f10Low(JsonField.of(f10Low))

        /**
         * Sets [Builder.f10Low] to an arbitrary JSON value.
         *
         * You should usually call [Builder.f10Low] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun f10Low(f10Low: JsonField<Double>) = apply { this.f10Low = f10Low }

        /** 54 day solar 10.7 cm radio flux in x10-22 Watts per meter squared per Hertz. */
        fun f54(f54: Double) = f54(JsonField.of(f54))

        /**
         * Sets [Builder.f54] to an arbitrary JSON value.
         *
         * You should usually call [Builder.f54] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun f54(f54: JsonField<Double>) = apply { this.f54 = f54 }

        /** 81 day solar 10.7 cm radio flux in x10-22 Watts per meter squared per Hertz. */
        fun f81(f81: Double) = f81(JsonField.of(f81))

        /**
         * Sets [Builder.f81] to an arbitrary JSON value.
         *
         * You should usually call [Builder.f81] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun f81(f81: JsonField<Double>) = apply { this.f81 = f81 }

        /**
         * Array of individual power spectral density (PSD) frequencies of the signal, in megahertz.
         * This array should correspond with the same-sized array of powers.
         */
        fun frequencies(frequencies: List<Double>) = frequencies(JsonField.of(frequencies))

        /**
         * Sets [Builder.frequencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencies] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequencies(frequencies: JsonField<List<Double>>) = apply {
            this.frequencies = frequencies.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [frequencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFrequency(frequency: Double) = apply {
            frequencies =
                (frequencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("frequencies", it).add(frequency)
                }
        }

        /**
         * The maximum measured gamma deflection during the kpDuration timespan. If kpDuration is
         * null, a 3 hour duration should be assumed.
         */
        fun gamma(gamma: Int) = gamma(JsonField.of(gamma))

        /**
         * Sets [Builder.gamma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gamma] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gamma(gamma: JsonField<Int>) = apply { this.gamma = gamma }

        /** Unique identifier of the reporting sensor. */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

        /**
         * The maximum measured K-Index at the associated station during the kpDuration timespan.
         * The K-Index is a unitless measure (0 - 9) of the deviation in the Earth's magnetic field
         * from normal at the station geographic location, with 0 indicating the absence of
         * geomagnetic disturbance, and 9 indicating the most significant disturbance. If kpDuration
         * is null, a 3 hour duration should be assumed.
         */
        fun kIndex(kIndex: Int) = kIndex(JsonField.of(kIndex))

        /**
         * Sets [Builder.kIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kIndex] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kIndex(kIndex: JsonField<Int>) = apply { this.kIndex = kIndex }

        /**
         * The Planetary K-index (Kp) over the kpDuration timespan. The Kp-Index is the average
         * K-Index for the entire Earth, utilizing a unitless scale (0-9, in incremenets of 1/3),
         * with 0 indicating the absence of geomagnetic disturbance, and 9 indicating the most
         * significant disturbance. If kpDuration is null, a 3 hour duration should be assumed.
         */
        fun kp(kp: Double) = kp(JsonField.of(kp))

        /**
         * Sets [Builder.kp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kp] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kp(kp: JsonField<Double>) = apply { this.kp = kp }

        /**
         * The time, in hours, over which the K, Kp, and/or gamma index values are measured. If
         * null, a span of 3 hours is assumed.
         */
        fun kpDuration(kpDuration: Int) = kpDuration(JsonField.of(kpDuration))

        /**
         * Sets [Builder.kpDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kpDuration] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kpDuration(kpDuration: JsonField<Int>) = apply { this.kpDuration = kpDuration }

        /**
         * Daily M10.7 index for 100-110 km heating of O2 by solar photosphere. 160 nm SRC emissions
         * in x10-22 Watts per meter squared per Hertz.
         */
        fun m10(m10: Double) = m10(JsonField.of(m10))

        /**
         * Sets [Builder.m10] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m10] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m10(m10: JsonField<Double>) = apply { this.m10 = m10 }

        /**
         * 54 day M10.7 index for 100-110 km heating of O2 by solar photosphere. 160 nm SRC
         * emissions in x10-22 Watts per meter squared per Hertz.
         */
        fun m54(m54: Double) = m54(JsonField.of(m54))

        /**
         * Sets [Builder.m54] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m54] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m54(m54: JsonField<Double>) = apply { this.m54 = m54 }

        /** The transmitted DCA mode of the record (1-3). */
        fun mode(mode: Int) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Int>) = apply { this.mode = mode }

        /**
         * The normalization factor that has already been applied to the index value prior to record
         * ingest. Typically used to normalize the index value to a particular interval. Units of
         * the normalization factor may vary depending on the provider of this data (REACH, POES,
         * CEASE3, etc.).
         */
        fun normFactor(normFactor: Double) = normFactor(JsonField.of(normFactor))

        /**
         * Sets [Builder.normFactor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.normFactor] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun normFactor(normFactor: JsonField<Double>) = apply { this.normFactor = normFactor }

        /**
         * Observed baseline values of the frequencies specified in the frequencies field, in solar
         * flux units. The baseline values will be used to help detect abnormal readings from the
         * sun that might indicate a flare or other solar activity.
         */
        fun observedBaseline(observedBaseline: List<Int>) =
            observedBaseline(JsonField.of(observedBaseline))

        /**
         * Sets [Builder.observedBaseline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observedBaseline] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun observedBaseline(observedBaseline: JsonField<List<Int>>) = apply {
            this.observedBaseline = observedBaseline.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [Builder.observedBaseline].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObservedBaseline(observedBaseline: Int) = apply {
            this.observedBaseline =
                (this.observedBaseline ?: JsonField.of(mutableListOf())).also {
                    checkKnown("observedBaseline", it).add(observedBaseline)
                }
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
         * Optional identifier provided by the reporting source to indicate the sensor identifier
         * which produced this data. This may be an internal identifier and not necessarily a valid
         * sensor ID.
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
         * Array of individual power spectral density (PSD) powers of the signal, in watts. This
         * array should correspond with the same-sized array of frequencies.
         */
        fun powers(powers: List<Double>) = powers(JsonField.of(powers))

        /**
         * Sets [Builder.powers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.powers] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun powers(powers: JsonField<List<Double>>) = apply {
            this.powers = powers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [powers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPower(power: Double) = apply {
            powers =
                (powers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("powers", it).add(power)
                }
        }

        /**
         * The precedence of data in this record (O = Immediate, P = Priority, R = Routine, Y =
         * Emergency, Z = Flash).
         */
        fun precedence(precedence: Precedence) = precedence(JsonField.of(precedence))

        /**
         * Sets [Builder.precedence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.precedence] with a well-typed [Precedence] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun precedence(precedence: JsonField<Precedence>) = apply { this.precedence = precedence }

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
         * The timespan over which the associated radiation belt index is factored. If rbDuration is
         * null, a 24 hour duration should be assumed. Note: rbDuration defines the length of the
         * time window for this data record. The time window start time is defined by sgiDate, and
         * the time window end time is defined by sgiDate plus rbDuration.
         */
        fun rbDuration(rbDuration: Int) = rbDuration(JsonField.of(rbDuration))

        /**
         * Sets [Builder.rbDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rbDuration] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rbDuration(rbDuration: JsonField<Int>) = apply { this.rbDuration = rbDuration }

        /**
         * The value of the radiation belt index. This is the ratio of current intensity of a
         * radiation belt to long-term average value. It's long-term average should be close to 1.
         * Depending on the type of belt sensor, this ratio may measure Flux (number of particles /
         * (cm^2 sec energy solid-angle)), dose rate (rad per second), or relative counts of
         * particles per time (counts per second). The index value may also be normalized, the
         * normalization value typically represents an average of the sensor measurements taken
         * within a region over a given time interval. See the normFactor field for the specific
         * normalization factor, if provided.
         */
        fun rbIndex(rbIndex: Double) = rbIndex(JsonField.of(rbIndex))

        /**
         * Sets [Builder.rbIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rbIndex] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rbIndex(rbIndex: JsonField<Double>) = apply { this.rbIndex = rbIndex }

        /**
         * Region code for the associated radiation belt index. This is the code associated with the
         * corresponding radiation belt location. See the provider card for reference to specific
         * region code definitions.
         */
        fun rbRegionCode(rbRegionCode: Int) = rbRegionCode(JsonField.of(rbRegionCode))

        /**
         * Sets [Builder.rbRegionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rbRegionCode] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rbRegionCode(rbRegionCode: JsonField<Int>) = apply { this.rbRegionCode = rbRegionCode }

        /**
         * Daily S10.7 index for >200 km heating of O by solar chromosphere. 28.4-30.4 nm emissions
         * in x10-22 Watts per meter squared per Hertz.
         */
        fun s10(s10: Double) = s10(JsonField.of(s10))

        /**
         * Sets [Builder.s10] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s10] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun s10(s10: JsonField<Double>) = apply { this.s10 = s10 }

        /**
         * 54 day S10.7 index for >200 km heating of O by solar chromosphere. 28.4-30.4 nm emissions
         * in x10-22 Watts per meter squared per Hertz.
         */
        fun s54(s54: Double) = s54(JsonField.of(s54))

        /**
         * Sets [Builder.s54] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s54] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun s54(s54: JsonField<Double>) = apply { this.s54 = s54 }

        /** State indicating Issued (I), Nowcast (N), or Predicted (P) values for this record. */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

        /** The name/location of the station that collected the geomagnetic data for this record. */
        fun stationName(stationName: String) = stationName(JsonField.of(stationName))

        /**
         * Sets [Builder.stationName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stationName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stationName(stationName: JsonField<String>) = apply { this.stationName = stationName }

        /**
         * Array containing the sine spherical-harmonic coefficients for Exospheric temperature
         * (DTC) difference. Each array element corresponds to the positional index of the
         * coeffDegree and coeffOrder arrays.
         */
        fun stce(stce: List<Double>) = stce(JsonField.of(stce))

        /**
         * Sets [Builder.stce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stce] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stce(stce: JsonField<List<Double>>) = apply {
            this.stce = stce.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.stce].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStce(stce: Double) = apply {
            this.stce =
                (this.stce ?: JsonField.of(mutableListOf())).also {
                    checkKnown("stce", it).add(stce)
                }
        }

        /**
         * Array containing the sine spherical harmonic coefficients for Inflection temperature
         * (DTX) difference. Each array element corresponds to the positional index of the
         * coeffDegree and coeffOrder arrays.
         */
        fun stci(stci: List<Double>) = stci(JsonField.of(stci))

        /**
         * Sets [Builder.stci] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stci] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stci(stci: JsonField<List<Double>>) = apply {
            this.stci = stci.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.stci].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStci(stci: Double) = apply {
            this.stci =
                (this.stci ?: JsonField.of(mutableListOf())).also {
                    checkKnown("stci", it).add(stci)
                }
        }

        /** Daily sunspot number. */
        fun sunspotNum(sunspotNum: Double) = sunspotNum(JsonField.of(sunspotNum))

        /**
         * Sets [Builder.sunspotNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sunspotNum] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sunspotNum(sunspotNum: JsonField<Double>) = apply { this.sunspotNum = sunspotNum }

        /**
         * Daily sunspot number - high range. This field usually applies to forecast values, based
         * on the consensus of the Solar Cycle 24 Prediction Panel.
         */
        fun sunspotNumHigh(sunspotNumHigh: Double) = sunspotNumHigh(JsonField.of(sunspotNumHigh))

        /**
         * Sets [Builder.sunspotNumHigh] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sunspotNumHigh] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sunspotNumHigh(sunspotNumHigh: JsonField<Double>) = apply {
            this.sunspotNumHigh = sunspotNumHigh
        }

        /**
         * Daily sunspot number - low range. This field usually applies to forecast values, based on
         * the consensus of the Solar Cycle 24 Prediction Panel.
         */
        fun sunspotNumLow(sunspotNumLow: Double) = sunspotNumLow(JsonField.of(sunspotNumLow))

        /**
         * Sets [Builder.sunspotNumLow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sunspotNumLow] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sunspotNumLow(sunspotNumLow: JsonField<Double>) = apply {
            this.sunspotNumLow = sunspotNumLow
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
         * The type of data contained in this record (e.g. HASDM, JBH09, K-Index, PSD-dB, RBI,
         * RFI-SFU, etc).
         */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** Time the row was last updated in the database, auto-populated by the system. */
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

        /**
         * Daily Y10.7 index for 85-90 km heating of N2, O2, H2O, NO by solar coronal. 0.1-0.8 nm
         * and Lya 121 nm emissions in x10-22 Watts per meter squared per Hertz.
         */
        fun y10(y10: Double) = y10(JsonField.of(y10))

        /**
         * Sets [Builder.y10] to an arbitrary JSON value.
         *
         * You should usually call [Builder.y10] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun y10(y10: JsonField<Double>) = apply { this.y10 = y10 }

        /**
         * 54 day Y10.7 index for 85-90 km heating of N2, O2, H2O, NO by solar coronal. 0.1-0.8 nm
         * and Lya 121 nm emissions in x10-22 Watts per meter squared per Hertz.
         */
        fun y54(y54: Double) = y54(JsonField.of(y54))

        /**
         * Sets [Builder.y54] to an arbitrary JSON value.
         *
         * You should usually call [Builder.y54] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun y54(y54: JsonField<Double>) = apply { this.y54 = y54 }

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
         * Returns an immutable instance of [SgiGetDataByEffectiveAsOfDateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .effectiveDate()
         * .sgiDate()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SgiGetDataByEffectiveAsOfDateResponse =
            SgiGetDataByEffectiveAsOfDateResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("effectiveDate", effectiveDate),
                checkRequired("sgiDate", sgiDate),
                checkRequired("source", source),
                id,
                analyzerAttenuation,
                ap,
                apDuration,
                (coeffDegree ?: JsonMissing.of()).map { it.toImmutable() },
                (coeffOrder ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                createdBy,
                (ctce ?: JsonMissing.of()).map { it.toImmutable() },
                (ctci ?: JsonMissing.of()).map { it.toImmutable() },
                dst,
                dtc,
                e10,
                e54,
                f10,
                f10High,
                f10Low,
                f54,
                f81,
                (frequencies ?: JsonMissing.of()).map { it.toImmutable() },
                gamma,
                idSensor,
                kIndex,
                kp,
                kpDuration,
                m10,
                m54,
                mode,
                normFactor,
                (observedBaseline ?: JsonMissing.of()).map { it.toImmutable() },
                origin,
                origNetwork,
                origSensorId,
                (powers ?: JsonMissing.of()).map { it.toImmutable() },
                precedence,
                rawFileUri,
                rbDuration,
                rbIndex,
                rbRegionCode,
                s10,
                s54,
                state,
                stationName,
                (stce ?: JsonMissing.of()).map { it.toImmutable() },
                (stci ?: JsonMissing.of()).map { it.toImmutable() },
                sunspotNum,
                sunspotNumHigh,
                sunspotNumLow,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                transactionId,
                type,
                updatedAt,
                updatedBy,
                y10,
                y54,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SgiGetDataByEffectiveAsOfDateResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        effectiveDate()
        sgiDate()
        source()
        id()
        analyzerAttenuation()
        ap()
        apDuration()
        coeffDegree()
        coeffOrder()
        createdAt()
        createdBy()
        ctce()
        ctci()
        dst()
        dtc()
        e10()
        e54()
        f10()
        f10High()
        f10Low()
        f54()
        f81()
        frequencies()
        gamma()
        idSensor()
        kIndex()
        kp()
        kpDuration()
        m10()
        m54()
        mode()
        normFactor()
        observedBaseline()
        origin()
        origNetwork()
        origSensorId()
        powers()
        precedence().ifPresent { it.validate() }
        rawFileUri()
        rbDuration()
        rbIndex()
        rbRegionCode()
        s10()
        s54()
        state().ifPresent { it.validate() }
        stationName()
        stce()
        stci()
        sunspotNum()
        sunspotNumHigh()
        sunspotNumLow()
        tags()
        transactionId()
        type()
        updatedAt()
        updatedBy()
        y10()
        y54()
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
            (if (effectiveDate.asKnown().isPresent) 1 else 0) +
            (if (sgiDate.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (analyzerAttenuation.asKnown().isPresent) 1 else 0) +
            (if (ap.asKnown().isPresent) 1 else 0) +
            (if (apDuration.asKnown().isPresent) 1 else 0) +
            (coeffDegree.asKnown().getOrNull()?.size ?: 0) +
            (coeffOrder.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (ctce.asKnown().getOrNull()?.size ?: 0) +
            (ctci.asKnown().getOrNull()?.size ?: 0) +
            (if (dst.asKnown().isPresent) 1 else 0) +
            (if (dtc.asKnown().isPresent) 1 else 0) +
            (if (e10.asKnown().isPresent) 1 else 0) +
            (if (e54.asKnown().isPresent) 1 else 0) +
            (if (f10.asKnown().isPresent) 1 else 0) +
            (if (f10High.asKnown().isPresent) 1 else 0) +
            (if (f10Low.asKnown().isPresent) 1 else 0) +
            (if (f54.asKnown().isPresent) 1 else 0) +
            (if (f81.asKnown().isPresent) 1 else 0) +
            (frequencies.asKnown().getOrNull()?.size ?: 0) +
            (if (gamma.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (kIndex.asKnown().isPresent) 1 else 0) +
            (if (kp.asKnown().isPresent) 1 else 0) +
            (if (kpDuration.asKnown().isPresent) 1 else 0) +
            (if (m10.asKnown().isPresent) 1 else 0) +
            (if (m54.asKnown().isPresent) 1 else 0) +
            (if (mode.asKnown().isPresent) 1 else 0) +
            (if (normFactor.asKnown().isPresent) 1 else 0) +
            (observedBaseline.asKnown().getOrNull()?.size ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (powers.asKnown().getOrNull()?.size ?: 0) +
            (precedence.asKnown().getOrNull()?.validity() ?: 0) +
            (if (rawFileUri.asKnown().isPresent) 1 else 0) +
            (if (rbDuration.asKnown().isPresent) 1 else 0) +
            (if (rbIndex.asKnown().isPresent) 1 else 0) +
            (if (rbRegionCode.asKnown().isPresent) 1 else 0) +
            (if (s10.asKnown().isPresent) 1 else 0) +
            (if (s54.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (if (stationName.asKnown().isPresent) 1 else 0) +
            (stce.asKnown().getOrNull()?.size ?: 0) +
            (stci.asKnown().getOrNull()?.size ?: 0) +
            (if (sunspotNum.asKnown().isPresent) 1 else 0) +
            (if (sunspotNumHigh.asKnown().isPresent) 1 else 0) +
            (if (sunspotNumLow.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (y10.asKnown().isPresent) 1 else 0) +
            (if (y54.asKnown().isPresent) 1 else 0)

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
     * The precedence of data in this record (O = Immediate, P = Priority, R = Routine, Y =
     * Emergency, Z = Flash).
     */
    class Precedence @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val O = of("O")

            @JvmField val P = of("P")

            @JvmField val R = of("R")

            @JvmField val Y = of("Y")

            @JvmField val Z = of("Z")

            @JvmStatic fun of(value: String) = Precedence(JsonField.of(value))
        }

        /** An enum containing [Precedence]'s known values. */
        enum class Known {
            O,
            P,
            R,
            Y,
            Z,
        }

        /**
         * An enum containing [Precedence]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Precedence] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            O,
            P,
            R,
            Y,
            Z,
            /**
             * An enum member indicating that [Precedence] was instantiated with an unknown value.
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
                O -> Value.O
                P -> Value.P
                R -> Value.R
                Y -> Value.Y
                Z -> Value.Z
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
                O -> Known.O
                P -> Known.P
                R -> Known.R
                Y -> Known.Y
                Z -> Known.Z
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Precedence: $value")
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

        fun validate(): Precedence = apply {
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

            return other is Precedence && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** State indicating Issued (I), Nowcast (N), or Predicted (P) values for this record. */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val I = of("I")

            @JvmField val N = of("N")

            @JvmField val P = of("P")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            I,
            N,
            P,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            I,
            N,
            P,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
                I -> Value.I
                N -> Value.N
                P -> Value.P
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
                I -> Known.I
                N -> Known.N
                P -> Known.P
                else -> throw UnifieddatalibraryInvalidDataException("Unknown State: $value")
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

        fun validate(): State = apply {
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

            return other is State && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SgiGetDataByEffectiveAsOfDateResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            effectiveDate == other.effectiveDate &&
            sgiDate == other.sgiDate &&
            source == other.source &&
            id == other.id &&
            analyzerAttenuation == other.analyzerAttenuation &&
            ap == other.ap &&
            apDuration == other.apDuration &&
            coeffDegree == other.coeffDegree &&
            coeffOrder == other.coeffOrder &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            ctce == other.ctce &&
            ctci == other.ctci &&
            dst == other.dst &&
            dtc == other.dtc &&
            e10 == other.e10 &&
            e54 == other.e54 &&
            f10 == other.f10 &&
            f10High == other.f10High &&
            f10Low == other.f10Low &&
            f54 == other.f54 &&
            f81 == other.f81 &&
            frequencies == other.frequencies &&
            gamma == other.gamma &&
            idSensor == other.idSensor &&
            kIndex == other.kIndex &&
            kp == other.kp &&
            kpDuration == other.kpDuration &&
            m10 == other.m10 &&
            m54 == other.m54 &&
            mode == other.mode &&
            normFactor == other.normFactor &&
            observedBaseline == other.observedBaseline &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origSensorId == other.origSensorId &&
            powers == other.powers &&
            precedence == other.precedence &&
            rawFileUri == other.rawFileUri &&
            rbDuration == other.rbDuration &&
            rbIndex == other.rbIndex &&
            rbRegionCode == other.rbRegionCode &&
            s10 == other.s10 &&
            s54 == other.s54 &&
            state == other.state &&
            stationName == other.stationName &&
            stce == other.stce &&
            stci == other.stci &&
            sunspotNum == other.sunspotNum &&
            sunspotNumHigh == other.sunspotNumHigh &&
            sunspotNumLow == other.sunspotNumLow &&
            tags == other.tags &&
            transactionId == other.transactionId &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            y10 == other.y10 &&
            y54 == other.y54 &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            effectiveDate,
            sgiDate,
            source,
            id,
            analyzerAttenuation,
            ap,
            apDuration,
            coeffDegree,
            coeffOrder,
            createdAt,
            createdBy,
            ctce,
            ctci,
            dst,
            dtc,
            e10,
            e54,
            f10,
            f10High,
            f10Low,
            f54,
            f81,
            frequencies,
            gamma,
            idSensor,
            kIndex,
            kp,
            kpDuration,
            m10,
            m54,
            mode,
            normFactor,
            observedBaseline,
            origin,
            origNetwork,
            origSensorId,
            powers,
            precedence,
            rawFileUri,
            rbDuration,
            rbIndex,
            rbRegionCode,
            s10,
            s54,
            state,
            stationName,
            stce,
            stci,
            sunspotNum,
            sunspotNumHigh,
            sunspotNumLow,
            tags,
            transactionId,
            type,
            updatedAt,
            updatedBy,
            y10,
            y54,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SgiGetDataByEffectiveAsOfDateResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, effectiveDate=$effectiveDate, sgiDate=$sgiDate, source=$source, id=$id, analyzerAttenuation=$analyzerAttenuation, ap=$ap, apDuration=$apDuration, coeffDegree=$coeffDegree, coeffOrder=$coeffOrder, createdAt=$createdAt, createdBy=$createdBy, ctce=$ctce, ctci=$ctci, dst=$dst, dtc=$dtc, e10=$e10, e54=$e54, f10=$f10, f10High=$f10High, f10Low=$f10Low, f54=$f54, f81=$f81, frequencies=$frequencies, gamma=$gamma, idSensor=$idSensor, kIndex=$kIndex, kp=$kp, kpDuration=$kpDuration, m10=$m10, m54=$m54, mode=$mode, normFactor=$normFactor, observedBaseline=$observedBaseline, origin=$origin, origNetwork=$origNetwork, origSensorId=$origSensorId, powers=$powers, precedence=$precedence, rawFileUri=$rawFileUri, rbDuration=$rbDuration, rbIndex=$rbIndex, rbRegionCode=$rbRegionCode, s10=$s10, s54=$s54, state=$state, stationName=$stationName, stce=$stce, stci=$stci, sunspotNum=$sunspotNum, sunspotNumHigh=$sunspotNumHigh, sunspotNumLow=$sunspotNumLow, tags=$tags, transactionId=$transactionId, type=$type, updatedAt=$updatedAt, updatedBy=$updatedBy, y10=$y10, y54=$y54, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.emireport.history

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
 * The EMI Report service supports the reporting, response, and resolution/mitigation for spectrum
 * interference, and provides details regarding electromagnetic interference (EMI) detection,
 * characterization, reporting, identification, geo-location, and resolution data for space-based
 * and terrestrial systems.
 */
class HistoryListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val isr: JsonField<Boolean>,
    private val reportId: JsonField<String>,
    private val reportTime: JsonField<OffsetDateTime>,
    private val reportType: JsonField<String>,
    private val requestAssist: JsonField<Boolean>,
    private val source: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val actionsTaken: JsonField<String>,
    private val affActivity: JsonField<String>,
    private val alt: JsonField<Double>,
    private val aor: JsonField<String>,
    private val band: JsonField<String>,
    private val beamPattern: JsonField<String>,
    private val channel: JsonField<String>,
    private val chanPirate: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val description: JsonField<String>,
    private val dneImpact: JsonField<String>,
    private val emiType: JsonField<String>,
    private val endTime: JsonField<OffsetDateTime>,
    private val frequency: JsonField<Double>,
    private val geoLocErrEllp: JsonField<List<Double>>,
    private val gpsEncrypted: JsonField<Boolean>,
    private val gpsFreq: JsonField<String>,
    private val highAffectedFrequency: JsonField<Double>,
    private val idOnOrbit: JsonField<String>,
    private val intercept: JsonField<Boolean>,
    private val interceptLang: JsonField<String>,
    private val interceptType: JsonField<String>,
    private val intSrcAmplitude: JsonField<Double>,
    private val intSrcBandwidth: JsonField<Double>,
    private val intSrcCentFreq: JsonField<Double>,
    private val intSrcEncrypted: JsonField<Boolean>,
    private val intSrcModulation: JsonField<String>,
    private val isrCollectionImpact: JsonField<Boolean>,
    private val killBox: JsonField<String>,
    private val lat: JsonField<Double>,
    private val link: JsonField<String>,
    private val lon: JsonField<Double>,
    private val milGrid: JsonField<String>,
    private val onOrbit: JsonField<OnorbitFull>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val persistence: JsonField<String>,
    private val platform: JsonField<String>,
    private val rcvrDemod: JsonField<String>,
    private val rcvrGain: JsonField<Double>,
    private val rcvrLocation: JsonField<String>,
    private val rcvrType: JsonField<String>,
    private val respService: JsonField<String>,
    private val satcomPriority: JsonField<String>,
    private val satDownlinkFrequency: JsonField<Double>,
    private val satDownlinkPolarization: JsonField<String>,
    private val satName: JsonField<String>,
    private val satNo: JsonField<Int>,
    private val satTransponderId: JsonField<String>,
    private val satUplinkFrequency: JsonField<Double>,
    private val satUplinkPolarization: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val status: JsonField<String>,
    private val supportedIsrRole: JsonField<String>,
    private val system: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val transactionId: JsonField<String>,
    private val victimAltCountry: JsonField<String>,
    private val victimCountryCode: JsonField<String>,
    private val victimFuncImpacts: JsonField<String>,
    private val victimPocMail: JsonField<String>,
    private val victimPocName: JsonField<String>,
    private val victimPocPhone: JsonField<String>,
    private val victimPocUnit: JsonField<String>,
    private val victimReaction: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("isr") @ExcludeMissing isr: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reportId") @ExcludeMissing reportId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reportTime")
        @ExcludeMissing
        reportTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("reportType")
        @ExcludeMissing
        reportType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requestAssist")
        @ExcludeMissing
        requestAssist: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actionsTaken")
        @ExcludeMissing
        actionsTaken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("affActivity")
        @ExcludeMissing
        affActivity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alt") @ExcludeMissing alt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("aor") @ExcludeMissing aor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("band") @ExcludeMissing band: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beamPattern")
        @ExcludeMissing
        beamPattern: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channel") @ExcludeMissing channel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chanPirate")
        @ExcludeMissing
        chanPirate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dneImpact") @ExcludeMissing dneImpact: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emiType") @ExcludeMissing emiType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endTime")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("frequency") @ExcludeMissing frequency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("geoLocErrEllp")
        @ExcludeMissing
        geoLocErrEllp: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("gpsEncrypted")
        @ExcludeMissing
        gpsEncrypted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("gpsFreq") @ExcludeMissing gpsFreq: JsonField<String> = JsonMissing.of(),
        @JsonProperty("highAffectedFrequency")
        @ExcludeMissing
        highAffectedFrequency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intercept") @ExcludeMissing intercept: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("interceptLang")
        @ExcludeMissing
        interceptLang: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interceptType")
        @ExcludeMissing
        interceptType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intSrcAmplitude")
        @ExcludeMissing
        intSrcAmplitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("intSrcBandwidth")
        @ExcludeMissing
        intSrcBandwidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("intSrcCentFreq")
        @ExcludeMissing
        intSrcCentFreq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("intSrcEncrypted")
        @ExcludeMissing
        intSrcEncrypted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("intSrcModulation")
        @ExcludeMissing
        intSrcModulation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isrCollectionImpact")
        @ExcludeMissing
        isrCollectionImpact: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("killBox") @ExcludeMissing killBox: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("link") @ExcludeMissing link: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("milGrid") @ExcludeMissing milGrid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("onOrbit") @ExcludeMissing onOrbit: JsonField<OnorbitFull> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("persistence")
        @ExcludeMissing
        persistence: JsonField<String> = JsonMissing.of(),
        @JsonProperty("platform") @ExcludeMissing platform: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rcvrDemod") @ExcludeMissing rcvrDemod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rcvrGain") @ExcludeMissing rcvrGain: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rcvrLocation")
        @ExcludeMissing
        rcvrLocation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rcvrType") @ExcludeMissing rcvrType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("respService")
        @ExcludeMissing
        respService: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satcomPriority")
        @ExcludeMissing
        satcomPriority: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satDownlinkFrequency")
        @ExcludeMissing
        satDownlinkFrequency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("satDownlinkPolarization")
        @ExcludeMissing
        satDownlinkPolarization: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satName") @ExcludeMissing satName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("satTransponderId")
        @ExcludeMissing
        satTransponderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satUplinkFrequency")
        @ExcludeMissing
        satUplinkFrequency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("satUplinkPolarization")
        @ExcludeMissing
        satUplinkPolarization: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supportedISRRole")
        @ExcludeMissing
        supportedIsrRole: JsonField<String> = JsonMissing.of(),
        @JsonProperty("system") @ExcludeMissing system: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("victimAltCountry")
        @ExcludeMissing
        victimAltCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("victimCountryCode")
        @ExcludeMissing
        victimCountryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("victimFuncImpacts")
        @ExcludeMissing
        victimFuncImpacts: JsonField<String> = JsonMissing.of(),
        @JsonProperty("victimPOCMail")
        @ExcludeMissing
        victimPocMail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("victimPOCName")
        @ExcludeMissing
        victimPocName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("victimPOCPhone")
        @ExcludeMissing
        victimPocPhone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("victimPOCUnit")
        @ExcludeMissing
        victimPocUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("victimReaction")
        @ExcludeMissing
        victimReaction: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        isr,
        reportId,
        reportTime,
        reportType,
        requestAssist,
        source,
        startTime,
        id,
        actionsTaken,
        affActivity,
        alt,
        aor,
        band,
        beamPattern,
        channel,
        chanPirate,
        createdAt,
        createdBy,
        description,
        dneImpact,
        emiType,
        endTime,
        frequency,
        geoLocErrEllp,
        gpsEncrypted,
        gpsFreq,
        highAffectedFrequency,
        idOnOrbit,
        intercept,
        interceptLang,
        interceptType,
        intSrcAmplitude,
        intSrcBandwidth,
        intSrcCentFreq,
        intSrcEncrypted,
        intSrcModulation,
        isrCollectionImpact,
        killBox,
        lat,
        link,
        lon,
        milGrid,
        onOrbit,
        origin,
        origNetwork,
        origObjectId,
        persistence,
        platform,
        rcvrDemod,
        rcvrGain,
        rcvrLocation,
        rcvrType,
        respService,
        satcomPriority,
        satDownlinkFrequency,
        satDownlinkPolarization,
        satName,
        satNo,
        satTransponderId,
        satUplinkFrequency,
        satUplinkPolarization,
        sourceDl,
        status,
        supportedIsrRole,
        system,
        tags,
        transactionId,
        victimAltCountry,
        victimCountryCode,
        victimFuncImpacts,
        victimPocMail,
        victimPocName,
        victimPocPhone,
        victimPocUnit,
        victimReaction,
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
     * Flag indicating whether the affected mission is an ISR mission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isr(): Boolean = isr.getRequired("isr")

    /**
     * User generated report identifier. This ID should remain the same on subsequent updates to
     * this report.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportId(): String = reportId.getRequired("reportId")

    /**
     * The reporting time of this EMI Report record, in ISO 8601 UTC format, with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportTime(): OffsetDateTime = reportTime.getRequired("reportTime")

    /**
     * The type of Electromagnetic Interference (EMI) being reported (GPS, SATCOM, TERRESTRIAL).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportType(): String = reportType.getRequired("reportType")

    /**
     * Flag indicating whether assistance is being requested to address this EMI.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestAssist(): Boolean = requestAssist.getRequired("requestAssist")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The EMI start time in ISO 8601 UTC format, with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Actions(s) taken to troubleshoot, mitigate, work-around, and/or resolve the EMI impacts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actionsTaken(): Optional<String> = actionsTaken.getOptional("actionsTaken")

    /**
     * The specific type of activity affected by the reported EMI (e.g. UPLINK, DOWNLINK, HF COMM,
     * etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun affActivity(): Optional<String> = affActivity.getOptional("affActivity")

    /**
     * Altitude of the affected receiver, expressed in meters above WGS-84 ellipsoid.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun alt(): Optional<Double> = alt.getOptional("alt")

    /**
     * The Area Of Responsibility (AOR), Organization, or Combatant Command under which the reported
     * EMI pertains (AFRICOM, CENTCOM, EUCOM, INDOPACOM, NORTHCOM, SOCOM, SOUTHCOM, SPACECOM,
     * STRATCOM, TRANSCOM, UNKNOWN).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aor(): Optional<String> = aor.getOptional("aor")

    /**
     * The band (EHF, SHF, UHF, etc.) affected by the EMI.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun band(): Optional<String> = band.getOptional("band")

    /**
     * The beam pattern in use.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun beamPattern(): Optional<String> = beamPattern.getOptional("beamPattern")

    /**
     * The channel affected by the EMI.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun channel(): Optional<String> = channel.getOptional("channel")

    /**
     * Flag indicating whether this interference appears to be illegally passing traffic over a
     * known channel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun chanPirate(): Optional<Boolean> = chanPirate.getOptional("chanPirate")

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
     * Text description of the EMI particulars and other supporting information which may be
     * relevant to the cause and/or possible resolution of the issue.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Duration, Nature, Extent of impact.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dneImpact(): Optional<String> = dneImpact.getOptional("dneImpact")

    /**
     * The type of EMI (i.e. BARRAGE, CARRIER WAVE, etc.), if known.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun emiType(): Optional<String> = emiType.getOptional("emiType")

    /**
     * The EMI end time in ISO 8601 UTC format, with millisecond precision. The endTime may be
     * excluded if EMI is ongoing.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("endTime")

    /**
     * The affected frequency, in MHz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun frequency(): Optional<Double> = frequency.getOptional("frequency")

    /**
     * Confidence ellipse centered about the detection location
     * [semi-major axis (m), semi-minor axis (m), orientation (deg) measured clockwise (0 - 360) from true North].
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoLocErrEllp(): Optional<List<Double>> = geoLocErrEllp.getOptional("geoLocErrEllp")

    /**
     * Flag indicating whether encryption is in use on the affected GPS frequency.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gpsEncrypted(): Optional<Boolean> = gpsEncrypted.getOptional("gpsEncrypted")

    /**
     * The affected GPS Frequency (L1, L2, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gpsFreq(): Optional<String> = gpsFreq.getOptional("gpsFreq")

    /**
     * The highest affected frequency, in MHz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun highAffectedFrequency(): Optional<Double> =
        highAffectedFrequency.getOptional("highAffectedFrequency")

    /**
     * Unique identifier of the affected on-orbit object. For the public catalog, the idOnOrbit is
     * typically the satellite number as a string, but may be a UUID for analyst or other unknown or
     * untracked satellites.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Flag indicating whether the EMI is a decipherable intercept over the affected receiver.
     * Additional information may be included in the description field content of this record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun intercept(): Optional<Boolean> = intercept.getOptional("intercept")

    /**
     * The language heard over the intercepted source. Applicable when interceptType = VOICE.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun interceptLang(): Optional<String> = interceptLang.getOptional("interceptLang")

    /**
     * The type of transmission being intercepted (e.g. VOICE, etc.). Applicable when intercept =
     * TRUE.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun interceptType(): Optional<String> = interceptType.getOptional("interceptType")

    /**
     * The relative amplitude, in decibels (dB), of the interfering source, if known.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun intSrcAmplitude(): Optional<Double> = intSrcAmplitude.getOptional("intSrcAmplitude")

    /**
     * The bandwidth, in MHz, of the interfering source, if known.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun intSrcBandwidth(): Optional<Double> = intSrcBandwidth.getOptional("intSrcBandwidth")

    /**
     * The center frequency, in MHz, of the interfering source, if known.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun intSrcCentFreq(): Optional<Double> = intSrcCentFreq.getOptional("intSrcCentFreq")

    /**
     * Flag indicating whether the interfering source is encrypted.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun intSrcEncrypted(): Optional<Boolean> = intSrcEncrypted.getOptional("intSrcEncrypted")

    /**
     * The modulation method (e.g. AM, FM, FSK, PSK, etc.) of the interfering source, if known.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun intSrcModulation(): Optional<String> = intSrcModulation.getOptional("intSrcModulation")

    /**
     * Flag indicating whether this EMI is impacting ISR collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun isrCollectionImpact(): Optional<Boolean> =
        isrCollectionImpact.getOptional("isrCollectionImpact")

    /**
     * The location of the affected receiver, reported as a kill box.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun killBox(): Optional<String> = killBox.getOptional("killBox")

    /**
     * WGS-84 latitude of the affected receiver, represented as -90 to 90 degrees (negative values
     * south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lat(): Optional<Double> = lat.getOptional("lat")

    /**
     * The name or identifier of the affected link.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun link(): Optional<String> = link.getOptional("link")

    /**
     * WGS-84 longitude of the affected receiver, represented as -180 to 180 degrees (negative
     * values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lon(): Optional<Double> = lon.getOptional("lon")

    /**
     * The Military Grid Reference System (MGRS) location of the affected receiver. The Military
     * Grid Reference System is the geocoordinate standard used by NATO militaries for locating
     * points on Earth. The MGRS is derived from the Universal Transverse Mercator (UTM) grid system
     * and the Universal Polar Stereographic (UPS) grid system, but uses a different labeling
     * convention. The MGRS is used as geocode for the entire Earth. Example of a milgrid
     * coordinate, or grid reference, would be 4QFJ12345678, which consists of three parts:
     *
     * 4Q (grid zone designator, GZD) FJ (the 100,000-meter square identifier) 12345678 (numerical
     * location; easting is 1234 and northing is 5678, in this case specifying a location with 10 m
     * resolution).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun milGrid(): Optional<String> = milGrid.getOptional("milGrid")

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
     * Optional identifier provided by the reporting source to indicate the affected object of this
     * report. This may be an internal identifier and not necessarily map to a valid satellite
     * number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * The persistence status (e.g. CONTINUOUS, INTERMITTENT, RANDOM, etc.) of the EMI.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun persistence(): Optional<String> = persistence.getOptional("persistence")

    /**
     * The name or identifier of the affected platform.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun platform(): Optional<String> = platform.getOptional("platform")

    /**
     * The demodulation method (e.g. AM, FM, FSK, PSK, etc.) setting of the affected receiver.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rcvrDemod(): Optional<String> = rcvrDemod.getOptional("rcvrDemod")

    /**
     * The gain setting of the affected receiver, in decibels (dB).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rcvrGain(): Optional<Double> = rcvrGain.getOptional("rcvrGain")

    /**
     * Description of the affected receiver location.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rcvrLocation(): Optional<String> = rcvrLocation.getOptional("rcvrLocation")

    /**
     * The affected antenna type (e.g. DISH, OMNI, PHASED ARRAY, etc.) experiencing the EMI.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rcvrType(): Optional<String> = rcvrType.getOptional("rcvrType")

    /**
     * The responsible service branch under which this EMI falls (AIR FORCE, ARMY, COAST GUARD,
     * MARINES, NAVY).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun respService(): Optional<String> = respService.getOptional("respService")

    /**
     * The priority (LOW, MEDIUM, HIGH) of the affected SATCOM.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satcomPriority(): Optional<String> = satcomPriority.getOptional("satcomPriority")

    /**
     * The downlink frequency, in MHz, of the impacted link.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satDownlinkFrequency(): Optional<Double> =
        satDownlinkFrequency.getOptional("satDownlinkFrequency")

    /**
     * The downlink polarization e.g. H - (Horizontally Polarized), V - (Vertically Polarized), L -
     * (Left Hand Circularly Polarized), R - (Right Hand Circularly Polarized).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satDownlinkPolarization(): Optional<String> =
        satDownlinkPolarization.getOptional("satDownlinkPolarization")

    /**
     * The name of the spacecraft whose link is being affected by the EMI.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satName(): Optional<String> = satName.getOptional("satName")

    /**
     * Satellite/Catalog number of the affected OnOrbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * The name or identifier of the affected sat transponder.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satTransponderId(): Optional<String> = satTransponderId.getOptional("satTransponderId")

    /**
     * The uplink frequency, in MHz, of the impacted link.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satUplinkFrequency(): Optional<Double> =
        satUplinkFrequency.getOptional("satUplinkFrequency")

    /**
     * The uplink polarization e.g. H - (Horizontally Polarized), V - (Vertically Polarized), L -
     * (Left Hand Circularly Polarized), R - (Right Hand Circularly Polarized).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satUplinkPolarization(): Optional<String> =
        satUplinkPolarization.getOptional("satUplinkPolarization")

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
     * The reporting status (INITIAL, UPDATE, RESOLVED) of this EMI issue.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * The ISR role of the impacted asset.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun supportedIsrRole(): Optional<String> = supportedIsrRole.getOptional("supportedISRRole")

    /**
     * The name or identifier of the affected system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun system(): Optional<String> = system.getOptional("system")

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
     * The alternate country identifier in which the EMI occurred or is occurring. Specifies an
     * alternate country code if the data provider code is not part of an official Country Code
     * standard such as ISO-3166 or FIPS.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun victimAltCountry(): Optional<String> = victimAltCountry.getOptional("victimAltCountry")

    /**
     * The country code in which the EMI occurred or is occurring. This value is typically the ISO
     * 3166 Alpha-2 two-character country code, however it can also represent various consortiums
     * that do not appear in the ISO document. The code must correspond to an existing country in
     * the UDL’s country API. Call udl/country/{code} to get any associated FIPS code, ISO Alpha-3
     * code, or alternate code values that exist for the specified country code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun victimCountryCode(): Optional<String> = victimCountryCode.getOptional("victimCountryCode")

    /**
     * The victim functional impacts (e.g. C2, COMM DATA LINK, ISR SENSOR, PNT, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun victimFuncImpacts(): Optional<String> = victimFuncImpacts.getOptional("victimFuncImpacts")

    /**
     * The e-mail contact of the reporting POC.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun victimPocMail(): Optional<String> = victimPocMail.getOptional("victimPOCMail")

    /**
     * The Point of Contact (POC) for this EMI Report.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun victimPocName(): Optional<String> = victimPocName.getOptional("victimPOCName")

    /**
     * The phone number of the reporting POC, represented as digits only, no spaces or special
     * characters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun victimPocPhone(): Optional<String> = victimPocPhone.getOptional("victimPOCPhone")

    /**
     * The Unit or Organization of the reporting POC.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun victimPocUnit(): Optional<String> = victimPocUnit.getOptional("victimPOCUnit")

    /**
     * The victim reaction (e.g. LOITER ORBIT, RETASK ASSET, RETURN TO BASE, TROUBLESHOOT, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun victimReaction(): Optional<String> = victimReaction.getOptional("victimReaction")

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
     * Returns the raw JSON value of [isr].
     *
     * Unlike [isr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isr") @ExcludeMissing fun _isr(): JsonField<Boolean> = isr

    /**
     * Returns the raw JSON value of [reportId].
     *
     * Unlike [reportId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reportId") @ExcludeMissing fun _reportId(): JsonField<String> = reportId

    /**
     * Returns the raw JSON value of [reportTime].
     *
     * Unlike [reportTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reportTime")
    @ExcludeMissing
    fun _reportTime(): JsonField<OffsetDateTime> = reportTime

    /**
     * Returns the raw JSON value of [reportType].
     *
     * Unlike [reportType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reportType") @ExcludeMissing fun _reportType(): JsonField<String> = reportType

    /**
     * Returns the raw JSON value of [requestAssist].
     *
     * Unlike [requestAssist], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestAssist")
    @ExcludeMissing
    fun _requestAssist(): JsonField<Boolean> = requestAssist

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
     * Returns the raw JSON value of [actionsTaken].
     *
     * Unlike [actionsTaken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionsTaken")
    @ExcludeMissing
    fun _actionsTaken(): JsonField<String> = actionsTaken

    /**
     * Returns the raw JSON value of [affActivity].
     *
     * Unlike [affActivity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("affActivity") @ExcludeMissing fun _affActivity(): JsonField<String> = affActivity

    /**
     * Returns the raw JSON value of [alt].
     *
     * Unlike [alt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alt") @ExcludeMissing fun _alt(): JsonField<Double> = alt

    /**
     * Returns the raw JSON value of [aor].
     *
     * Unlike [aor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aor") @ExcludeMissing fun _aor(): JsonField<String> = aor

    /**
     * Returns the raw JSON value of [band].
     *
     * Unlike [band], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("band") @ExcludeMissing fun _band(): JsonField<String> = band

    /**
     * Returns the raw JSON value of [beamPattern].
     *
     * Unlike [beamPattern], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beamPattern") @ExcludeMissing fun _beamPattern(): JsonField<String> = beamPattern

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<String> = channel

    /**
     * Returns the raw JSON value of [chanPirate].
     *
     * Unlike [chanPirate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chanPirate") @ExcludeMissing fun _chanPirate(): JsonField<Boolean> = chanPirate

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
     * Returns the raw JSON value of [dneImpact].
     *
     * Unlike [dneImpact], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dneImpact") @ExcludeMissing fun _dneImpact(): JsonField<String> = dneImpact

    /**
     * Returns the raw JSON value of [emiType].
     *
     * Unlike [emiType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emiType") @ExcludeMissing fun _emiType(): JsonField<String> = emiType

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequency") @ExcludeMissing fun _frequency(): JsonField<Double> = frequency

    /**
     * Returns the raw JSON value of [geoLocErrEllp].
     *
     * Unlike [geoLocErrEllp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoLocErrEllp")
    @ExcludeMissing
    fun _geoLocErrEllp(): JsonField<List<Double>> = geoLocErrEllp

    /**
     * Returns the raw JSON value of [gpsEncrypted].
     *
     * Unlike [gpsEncrypted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gpsEncrypted")
    @ExcludeMissing
    fun _gpsEncrypted(): JsonField<Boolean> = gpsEncrypted

    /**
     * Returns the raw JSON value of [gpsFreq].
     *
     * Unlike [gpsFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gpsFreq") @ExcludeMissing fun _gpsFreq(): JsonField<String> = gpsFreq

    /**
     * Returns the raw JSON value of [highAffectedFrequency].
     *
     * Unlike [highAffectedFrequency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("highAffectedFrequency")
    @ExcludeMissing
    fun _highAffectedFrequency(): JsonField<Double> = highAffectedFrequency

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [intercept].
     *
     * Unlike [intercept], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intercept") @ExcludeMissing fun _intercept(): JsonField<Boolean> = intercept

    /**
     * Returns the raw JSON value of [interceptLang].
     *
     * Unlike [interceptLang], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interceptLang")
    @ExcludeMissing
    fun _interceptLang(): JsonField<String> = interceptLang

    /**
     * Returns the raw JSON value of [interceptType].
     *
     * Unlike [interceptType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interceptType")
    @ExcludeMissing
    fun _interceptType(): JsonField<String> = interceptType

    /**
     * Returns the raw JSON value of [intSrcAmplitude].
     *
     * Unlike [intSrcAmplitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intSrcAmplitude")
    @ExcludeMissing
    fun _intSrcAmplitude(): JsonField<Double> = intSrcAmplitude

    /**
     * Returns the raw JSON value of [intSrcBandwidth].
     *
     * Unlike [intSrcBandwidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intSrcBandwidth")
    @ExcludeMissing
    fun _intSrcBandwidth(): JsonField<Double> = intSrcBandwidth

    /**
     * Returns the raw JSON value of [intSrcCentFreq].
     *
     * Unlike [intSrcCentFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intSrcCentFreq")
    @ExcludeMissing
    fun _intSrcCentFreq(): JsonField<Double> = intSrcCentFreq

    /**
     * Returns the raw JSON value of [intSrcEncrypted].
     *
     * Unlike [intSrcEncrypted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intSrcEncrypted")
    @ExcludeMissing
    fun _intSrcEncrypted(): JsonField<Boolean> = intSrcEncrypted

    /**
     * Returns the raw JSON value of [intSrcModulation].
     *
     * Unlike [intSrcModulation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("intSrcModulation")
    @ExcludeMissing
    fun _intSrcModulation(): JsonField<String> = intSrcModulation

    /**
     * Returns the raw JSON value of [isrCollectionImpact].
     *
     * Unlike [isrCollectionImpact], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isrCollectionImpact")
    @ExcludeMissing
    fun _isrCollectionImpact(): JsonField<Boolean> = isrCollectionImpact

    /**
     * Returns the raw JSON value of [killBox].
     *
     * Unlike [killBox], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("killBox") @ExcludeMissing fun _killBox(): JsonField<String> = killBox

    /**
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

    /**
     * Returns the raw JSON value of [link].
     *
     * Unlike [link], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("link") @ExcludeMissing fun _link(): JsonField<String> = link

    /**
     * Returns the raw JSON value of [lon].
     *
     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

    /**
     * Returns the raw JSON value of [milGrid].
     *
     * Unlike [milGrid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("milGrid") @ExcludeMissing fun _milGrid(): JsonField<String> = milGrid

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
     * Returns the raw JSON value of [persistence].
     *
     * Unlike [persistence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("persistence") @ExcludeMissing fun _persistence(): JsonField<String> = persistence

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<String> = platform

    /**
     * Returns the raw JSON value of [rcvrDemod].
     *
     * Unlike [rcvrDemod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rcvrDemod") @ExcludeMissing fun _rcvrDemod(): JsonField<String> = rcvrDemod

    /**
     * Returns the raw JSON value of [rcvrGain].
     *
     * Unlike [rcvrGain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rcvrGain") @ExcludeMissing fun _rcvrGain(): JsonField<Double> = rcvrGain

    /**
     * Returns the raw JSON value of [rcvrLocation].
     *
     * Unlike [rcvrLocation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rcvrLocation")
    @ExcludeMissing
    fun _rcvrLocation(): JsonField<String> = rcvrLocation

    /**
     * Returns the raw JSON value of [rcvrType].
     *
     * Unlike [rcvrType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rcvrType") @ExcludeMissing fun _rcvrType(): JsonField<String> = rcvrType

    /**
     * Returns the raw JSON value of [respService].
     *
     * Unlike [respService], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("respService") @ExcludeMissing fun _respService(): JsonField<String> = respService

    /**
     * Returns the raw JSON value of [satcomPriority].
     *
     * Unlike [satcomPriority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satcomPriority")
    @ExcludeMissing
    fun _satcomPriority(): JsonField<String> = satcomPriority

    /**
     * Returns the raw JSON value of [satDownlinkFrequency].
     *
     * Unlike [satDownlinkFrequency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("satDownlinkFrequency")
    @ExcludeMissing
    fun _satDownlinkFrequency(): JsonField<Double> = satDownlinkFrequency

    /**
     * Returns the raw JSON value of [satDownlinkPolarization].
     *
     * Unlike [satDownlinkPolarization], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("satDownlinkPolarization")
    @ExcludeMissing
    fun _satDownlinkPolarization(): JsonField<String> = satDownlinkPolarization

    /**
     * Returns the raw JSON value of [satName].
     *
     * Unlike [satName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satName") @ExcludeMissing fun _satName(): JsonField<String> = satName

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [satTransponderId].
     *
     * Unlike [satTransponderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("satTransponderId")
    @ExcludeMissing
    fun _satTransponderId(): JsonField<String> = satTransponderId

    /**
     * Returns the raw JSON value of [satUplinkFrequency].
     *
     * Unlike [satUplinkFrequency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("satUplinkFrequency")
    @ExcludeMissing
    fun _satUplinkFrequency(): JsonField<Double> = satUplinkFrequency

    /**
     * Returns the raw JSON value of [satUplinkPolarization].
     *
     * Unlike [satUplinkPolarization], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("satUplinkPolarization")
    @ExcludeMissing
    fun _satUplinkPolarization(): JsonField<String> = satUplinkPolarization

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [supportedIsrRole].
     *
     * Unlike [supportedIsrRole], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supportedISRRole")
    @ExcludeMissing
    fun _supportedIsrRole(): JsonField<String> = supportedIsrRole

    /**
     * Returns the raw JSON value of [system].
     *
     * Unlike [system], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("system") @ExcludeMissing fun _system(): JsonField<String> = system

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
     * Returns the raw JSON value of [victimAltCountry].
     *
     * Unlike [victimAltCountry], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("victimAltCountry")
    @ExcludeMissing
    fun _victimAltCountry(): JsonField<String> = victimAltCountry

    /**
     * Returns the raw JSON value of [victimCountryCode].
     *
     * Unlike [victimCountryCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("victimCountryCode")
    @ExcludeMissing
    fun _victimCountryCode(): JsonField<String> = victimCountryCode

    /**
     * Returns the raw JSON value of [victimFuncImpacts].
     *
     * Unlike [victimFuncImpacts], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("victimFuncImpacts")
    @ExcludeMissing
    fun _victimFuncImpacts(): JsonField<String> = victimFuncImpacts

    /**
     * Returns the raw JSON value of [victimPocMail].
     *
     * Unlike [victimPocMail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("victimPOCMail")
    @ExcludeMissing
    fun _victimPocMail(): JsonField<String> = victimPocMail

    /**
     * Returns the raw JSON value of [victimPocName].
     *
     * Unlike [victimPocName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("victimPOCName")
    @ExcludeMissing
    fun _victimPocName(): JsonField<String> = victimPocName

    /**
     * Returns the raw JSON value of [victimPocPhone].
     *
     * Unlike [victimPocPhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("victimPOCPhone")
    @ExcludeMissing
    fun _victimPocPhone(): JsonField<String> = victimPocPhone

    /**
     * Returns the raw JSON value of [victimPocUnit].
     *
     * Unlike [victimPocUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("victimPOCUnit")
    @ExcludeMissing
    fun _victimPocUnit(): JsonField<String> = victimPocUnit

    /**
     * Returns the raw JSON value of [victimReaction].
     *
     * Unlike [victimReaction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("victimReaction")
    @ExcludeMissing
    fun _victimReaction(): JsonField<String> = victimReaction

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
         * Returns a mutable builder for constructing an instance of [HistoryListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .isr()
         * .reportId()
         * .reportTime()
         * .reportType()
         * .requestAssist()
         * .source()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HistoryListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var isr: JsonField<Boolean>? = null
        private var reportId: JsonField<String>? = null
        private var reportTime: JsonField<OffsetDateTime>? = null
        private var reportType: JsonField<String>? = null
        private var requestAssist: JsonField<Boolean>? = null
        private var source: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var actionsTaken: JsonField<String> = JsonMissing.of()
        private var affActivity: JsonField<String> = JsonMissing.of()
        private var alt: JsonField<Double> = JsonMissing.of()
        private var aor: JsonField<String> = JsonMissing.of()
        private var band: JsonField<String> = JsonMissing.of()
        private var beamPattern: JsonField<String> = JsonMissing.of()
        private var channel: JsonField<String> = JsonMissing.of()
        private var chanPirate: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dneImpact: JsonField<String> = JsonMissing.of()
        private var emiType: JsonField<String> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var frequency: JsonField<Double> = JsonMissing.of()
        private var geoLocErrEllp: JsonField<MutableList<Double>>? = null
        private var gpsEncrypted: JsonField<Boolean> = JsonMissing.of()
        private var gpsFreq: JsonField<String> = JsonMissing.of()
        private var highAffectedFrequency: JsonField<Double> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var intercept: JsonField<Boolean> = JsonMissing.of()
        private var interceptLang: JsonField<String> = JsonMissing.of()
        private var interceptType: JsonField<String> = JsonMissing.of()
        private var intSrcAmplitude: JsonField<Double> = JsonMissing.of()
        private var intSrcBandwidth: JsonField<Double> = JsonMissing.of()
        private var intSrcCentFreq: JsonField<Double> = JsonMissing.of()
        private var intSrcEncrypted: JsonField<Boolean> = JsonMissing.of()
        private var intSrcModulation: JsonField<String> = JsonMissing.of()
        private var isrCollectionImpact: JsonField<Boolean> = JsonMissing.of()
        private var killBox: JsonField<String> = JsonMissing.of()
        private var lat: JsonField<Double> = JsonMissing.of()
        private var link: JsonField<String> = JsonMissing.of()
        private var lon: JsonField<Double> = JsonMissing.of()
        private var milGrid: JsonField<String> = JsonMissing.of()
        private var onOrbit: JsonField<OnorbitFull> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var persistence: JsonField<String> = JsonMissing.of()
        private var platform: JsonField<String> = JsonMissing.of()
        private var rcvrDemod: JsonField<String> = JsonMissing.of()
        private var rcvrGain: JsonField<Double> = JsonMissing.of()
        private var rcvrLocation: JsonField<String> = JsonMissing.of()
        private var rcvrType: JsonField<String> = JsonMissing.of()
        private var respService: JsonField<String> = JsonMissing.of()
        private var satcomPriority: JsonField<String> = JsonMissing.of()
        private var satDownlinkFrequency: JsonField<Double> = JsonMissing.of()
        private var satDownlinkPolarization: JsonField<String> = JsonMissing.of()
        private var satName: JsonField<String> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var satTransponderId: JsonField<String> = JsonMissing.of()
        private var satUplinkFrequency: JsonField<Double> = JsonMissing.of()
        private var satUplinkPolarization: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var supportedIsrRole: JsonField<String> = JsonMissing.of()
        private var system: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var victimAltCountry: JsonField<String> = JsonMissing.of()
        private var victimCountryCode: JsonField<String> = JsonMissing.of()
        private var victimFuncImpacts: JsonField<String> = JsonMissing.of()
        private var victimPocMail: JsonField<String> = JsonMissing.of()
        private var victimPocName: JsonField<String> = JsonMissing.of()
        private var victimPocPhone: JsonField<String> = JsonMissing.of()
        private var victimPocUnit: JsonField<String> = JsonMissing.of()
        private var victimReaction: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(historyListResponse: HistoryListResponse) = apply {
            classificationMarking = historyListResponse.classificationMarking
            dataMode = historyListResponse.dataMode
            isr = historyListResponse.isr
            reportId = historyListResponse.reportId
            reportTime = historyListResponse.reportTime
            reportType = historyListResponse.reportType
            requestAssist = historyListResponse.requestAssist
            source = historyListResponse.source
            startTime = historyListResponse.startTime
            id = historyListResponse.id
            actionsTaken = historyListResponse.actionsTaken
            affActivity = historyListResponse.affActivity
            alt = historyListResponse.alt
            aor = historyListResponse.aor
            band = historyListResponse.band
            beamPattern = historyListResponse.beamPattern
            channel = historyListResponse.channel
            chanPirate = historyListResponse.chanPirate
            createdAt = historyListResponse.createdAt
            createdBy = historyListResponse.createdBy
            description = historyListResponse.description
            dneImpact = historyListResponse.dneImpact
            emiType = historyListResponse.emiType
            endTime = historyListResponse.endTime
            frequency = historyListResponse.frequency
            geoLocErrEllp = historyListResponse.geoLocErrEllp.map { it.toMutableList() }
            gpsEncrypted = historyListResponse.gpsEncrypted
            gpsFreq = historyListResponse.gpsFreq
            highAffectedFrequency = historyListResponse.highAffectedFrequency
            idOnOrbit = historyListResponse.idOnOrbit
            intercept = historyListResponse.intercept
            interceptLang = historyListResponse.interceptLang
            interceptType = historyListResponse.interceptType
            intSrcAmplitude = historyListResponse.intSrcAmplitude
            intSrcBandwidth = historyListResponse.intSrcBandwidth
            intSrcCentFreq = historyListResponse.intSrcCentFreq
            intSrcEncrypted = historyListResponse.intSrcEncrypted
            intSrcModulation = historyListResponse.intSrcModulation
            isrCollectionImpact = historyListResponse.isrCollectionImpact
            killBox = historyListResponse.killBox
            lat = historyListResponse.lat
            link = historyListResponse.link
            lon = historyListResponse.lon
            milGrid = historyListResponse.milGrid
            onOrbit = historyListResponse.onOrbit
            origin = historyListResponse.origin
            origNetwork = historyListResponse.origNetwork
            origObjectId = historyListResponse.origObjectId
            persistence = historyListResponse.persistence
            platform = historyListResponse.platform
            rcvrDemod = historyListResponse.rcvrDemod
            rcvrGain = historyListResponse.rcvrGain
            rcvrLocation = historyListResponse.rcvrLocation
            rcvrType = historyListResponse.rcvrType
            respService = historyListResponse.respService
            satcomPriority = historyListResponse.satcomPriority
            satDownlinkFrequency = historyListResponse.satDownlinkFrequency
            satDownlinkPolarization = historyListResponse.satDownlinkPolarization
            satName = historyListResponse.satName
            satNo = historyListResponse.satNo
            satTransponderId = historyListResponse.satTransponderId
            satUplinkFrequency = historyListResponse.satUplinkFrequency
            satUplinkPolarization = historyListResponse.satUplinkPolarization
            sourceDl = historyListResponse.sourceDl
            status = historyListResponse.status
            supportedIsrRole = historyListResponse.supportedIsrRole
            system = historyListResponse.system
            tags = historyListResponse.tags.map { it.toMutableList() }
            transactionId = historyListResponse.transactionId
            victimAltCountry = historyListResponse.victimAltCountry
            victimCountryCode = historyListResponse.victimCountryCode
            victimFuncImpacts = historyListResponse.victimFuncImpacts
            victimPocMail = historyListResponse.victimPocMail
            victimPocName = historyListResponse.victimPocName
            victimPocPhone = historyListResponse.victimPocPhone
            victimPocUnit = historyListResponse.victimPocUnit
            victimReaction = historyListResponse.victimReaction
            additionalProperties = historyListResponse.additionalProperties.toMutableMap()
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

        /** Flag indicating whether the affected mission is an ISR mission. */
        fun isr(isr: Boolean) = isr(JsonField.of(isr))

        /**
         * Sets [Builder.isr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isr] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isr(isr: JsonField<Boolean>) = apply { this.isr = isr }

        /**
         * User generated report identifier. This ID should remain the same on subsequent updates to
         * this report.
         */
        fun reportId(reportId: String) = reportId(JsonField.of(reportId))

        /**
         * Sets [Builder.reportId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reportId(reportId: JsonField<String>) = apply { this.reportId = reportId }

        /**
         * The reporting time of this EMI Report record, in ISO 8601 UTC format, with millisecond
         * precision.
         */
        fun reportTime(reportTime: OffsetDateTime) = reportTime(JsonField.of(reportTime))

        /**
         * Sets [Builder.reportTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reportTime(reportTime: JsonField<OffsetDateTime>) = apply {
            this.reportTime = reportTime
        }

        /**
         * The type of Electromagnetic Interference (EMI) being reported (GPS, SATCOM, TERRESTRIAL).
         */
        fun reportType(reportType: String) = reportType(JsonField.of(reportType))

        /**
         * Sets [Builder.reportType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportType(reportType: JsonField<String>) = apply { this.reportType = reportType }

        /** Flag indicating whether assistance is being requested to address this EMI. */
        fun requestAssist(requestAssist: Boolean) = requestAssist(JsonField.of(requestAssist))

        /**
         * Sets [Builder.requestAssist] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestAssist] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestAssist(requestAssist: JsonField<Boolean>) = apply {
            this.requestAssist = requestAssist
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

        /** The EMI start time in ISO 8601 UTC format, with millisecond precision. */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

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
         * Actions(s) taken to troubleshoot, mitigate, work-around, and/or resolve the EMI impacts.
         */
        fun actionsTaken(actionsTaken: String) = actionsTaken(JsonField.of(actionsTaken))

        /**
         * Sets [Builder.actionsTaken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionsTaken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actionsTaken(actionsTaken: JsonField<String>) = apply {
            this.actionsTaken = actionsTaken
        }

        /**
         * The specific type of activity affected by the reported EMI (e.g. UPLINK, DOWNLINK, HF
         * COMM, etc.).
         */
        fun affActivity(affActivity: String) = affActivity(JsonField.of(affActivity))

        /**
         * Sets [Builder.affActivity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.affActivity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun affActivity(affActivity: JsonField<String>) = apply { this.affActivity = affActivity }

        /** Altitude of the affected receiver, expressed in meters above WGS-84 ellipsoid. */
        fun alt(alt: Double) = alt(JsonField.of(alt))

        /**
         * Sets [Builder.alt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alt(alt: JsonField<Double>) = apply { this.alt = alt }

        /**
         * The Area Of Responsibility (AOR), Organization, or Combatant Command under which the
         * reported EMI pertains (AFRICOM, CENTCOM, EUCOM, INDOPACOM, NORTHCOM, SOCOM, SOUTHCOM,
         * SPACECOM, STRATCOM, TRANSCOM, UNKNOWN).
         */
        fun aor(aor: String) = aor(JsonField.of(aor))

        /**
         * Sets [Builder.aor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun aor(aor: JsonField<String>) = apply { this.aor = aor }

        /** The band (EHF, SHF, UHF, etc.) affected by the EMI. */
        fun band(band: String) = band(JsonField.of(band))

        /**
         * Sets [Builder.band] to an arbitrary JSON value.
         *
         * You should usually call [Builder.band] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun band(band: JsonField<String>) = apply { this.band = band }

        /** The beam pattern in use. */
        fun beamPattern(beamPattern: String) = beamPattern(JsonField.of(beamPattern))

        /**
         * Sets [Builder.beamPattern] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beamPattern] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun beamPattern(beamPattern: JsonField<String>) = apply { this.beamPattern = beamPattern }

        /** The channel affected by the EMI. */
        fun channel(channel: String) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<String>) = apply { this.channel = channel }

        /**
         * Flag indicating whether this interference appears to be illegally passing traffic over a
         * known channel.
         */
        fun chanPirate(chanPirate: Boolean) = chanPirate(JsonField.of(chanPirate))

        /**
         * Sets [Builder.chanPirate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chanPirate] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chanPirate(chanPirate: JsonField<Boolean>) = apply { this.chanPirate = chanPirate }

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
         * Text description of the EMI particulars and other supporting information which may be
         * relevant to the cause and/or possible resolution of the issue.
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

        /** Duration, Nature, Extent of impact. */
        fun dneImpact(dneImpact: String) = dneImpact(JsonField.of(dneImpact))

        /**
         * Sets [Builder.dneImpact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dneImpact] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dneImpact(dneImpact: JsonField<String>) = apply { this.dneImpact = dneImpact }

        /** The type of EMI (i.e. BARRAGE, CARRIER WAVE, etc.), if known. */
        fun emiType(emiType: String) = emiType(JsonField.of(emiType))

        /**
         * Sets [Builder.emiType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emiType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun emiType(emiType: JsonField<String>) = apply { this.emiType = emiType }

        /**
         * The EMI end time in ISO 8601 UTC format, with millisecond precision. The endTime may be
         * excluded if EMI is ongoing.
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

        /** The affected frequency, in MHz. */
        fun frequency(frequency: Double) = frequency(JsonField.of(frequency))

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun frequency(frequency: JsonField<Double>) = apply { this.frequency = frequency }

        /**
         * Confidence ellipse centered about the detection location
         * [semi-major axis (m), semi-minor axis (m), orientation (deg) measured clockwise (0 - 360) from true North].
         */
        fun geoLocErrEllp(geoLocErrEllp: List<Double>) = geoLocErrEllp(JsonField.of(geoLocErrEllp))

        /**
         * Sets [Builder.geoLocErrEllp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoLocErrEllp] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geoLocErrEllp(geoLocErrEllp: JsonField<List<Double>>) = apply {
            this.geoLocErrEllp = geoLocErrEllp.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.geoLocErrEllp].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGeoLocErrEllp(geoLocErrEllp: Double) = apply {
            this.geoLocErrEllp =
                (this.geoLocErrEllp ?: JsonField.of(mutableListOf())).also {
                    checkKnown("geoLocErrEllp", it).add(geoLocErrEllp)
                }
        }

        /** Flag indicating whether encryption is in use on the affected GPS frequency. */
        fun gpsEncrypted(gpsEncrypted: Boolean) = gpsEncrypted(JsonField.of(gpsEncrypted))

        /**
         * Sets [Builder.gpsEncrypted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gpsEncrypted] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun gpsEncrypted(gpsEncrypted: JsonField<Boolean>) = apply {
            this.gpsEncrypted = gpsEncrypted
        }

        /** The affected GPS Frequency (L1, L2, etc.). */
        fun gpsFreq(gpsFreq: String) = gpsFreq(JsonField.of(gpsFreq))

        /**
         * Sets [Builder.gpsFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gpsFreq] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gpsFreq(gpsFreq: JsonField<String>) = apply { this.gpsFreq = gpsFreq }

        /** The highest affected frequency, in MHz. */
        fun highAffectedFrequency(highAffectedFrequency: Double) =
            highAffectedFrequency(JsonField.of(highAffectedFrequency))

        /**
         * Sets [Builder.highAffectedFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highAffectedFrequency] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun highAffectedFrequency(highAffectedFrequency: JsonField<Double>) = apply {
            this.highAffectedFrequency = highAffectedFrequency
        }

        /**
         * Unique identifier of the affected on-orbit object. For the public catalog, the idOnOrbit
         * is typically the satellite number as a string, but may be a UUID for analyst or other
         * unknown or untracked satellites.
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
         * Flag indicating whether the EMI is a decipherable intercept over the affected receiver.
         * Additional information may be included in the description field content of this record.
         */
        fun intercept(intercept: Boolean) = intercept(JsonField.of(intercept))

        /**
         * Sets [Builder.intercept] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intercept] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun intercept(intercept: JsonField<Boolean>) = apply { this.intercept = intercept }

        /**
         * The language heard over the intercepted source. Applicable when interceptType = VOICE.
         */
        fun interceptLang(interceptLang: String) = interceptLang(JsonField.of(interceptLang))

        /**
         * Sets [Builder.interceptLang] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interceptLang] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun interceptLang(interceptLang: JsonField<String>) = apply {
            this.interceptLang = interceptLang
        }

        /**
         * The type of transmission being intercepted (e.g. VOICE, etc.). Applicable when intercept
         * = TRUE.
         */
        fun interceptType(interceptType: String) = interceptType(JsonField.of(interceptType))

        /**
         * Sets [Builder.interceptType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interceptType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun interceptType(interceptType: JsonField<String>) = apply {
            this.interceptType = interceptType
        }

        /** The relative amplitude, in decibels (dB), of the interfering source, if known. */
        fun intSrcAmplitude(intSrcAmplitude: Double) =
            intSrcAmplitude(JsonField.of(intSrcAmplitude))

        /**
         * Sets [Builder.intSrcAmplitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intSrcAmplitude] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intSrcAmplitude(intSrcAmplitude: JsonField<Double>) = apply {
            this.intSrcAmplitude = intSrcAmplitude
        }

        /** The bandwidth, in MHz, of the interfering source, if known. */
        fun intSrcBandwidth(intSrcBandwidth: Double) =
            intSrcBandwidth(JsonField.of(intSrcBandwidth))

        /**
         * Sets [Builder.intSrcBandwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intSrcBandwidth] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intSrcBandwidth(intSrcBandwidth: JsonField<Double>) = apply {
            this.intSrcBandwidth = intSrcBandwidth
        }

        /** The center frequency, in MHz, of the interfering source, if known. */
        fun intSrcCentFreq(intSrcCentFreq: Double) = intSrcCentFreq(JsonField.of(intSrcCentFreq))

        /**
         * Sets [Builder.intSrcCentFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intSrcCentFreq] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intSrcCentFreq(intSrcCentFreq: JsonField<Double>) = apply {
            this.intSrcCentFreq = intSrcCentFreq
        }

        /** Flag indicating whether the interfering source is encrypted. */
        fun intSrcEncrypted(intSrcEncrypted: Boolean) =
            intSrcEncrypted(JsonField.of(intSrcEncrypted))

        /**
         * Sets [Builder.intSrcEncrypted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intSrcEncrypted] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intSrcEncrypted(intSrcEncrypted: JsonField<Boolean>) = apply {
            this.intSrcEncrypted = intSrcEncrypted
        }

        /**
         * The modulation method (e.g. AM, FM, FSK, PSK, etc.) of the interfering source, if known.
         */
        fun intSrcModulation(intSrcModulation: String) =
            intSrcModulation(JsonField.of(intSrcModulation))

        /**
         * Sets [Builder.intSrcModulation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intSrcModulation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intSrcModulation(intSrcModulation: JsonField<String>) = apply {
            this.intSrcModulation = intSrcModulation
        }

        /** Flag indicating whether this EMI is impacting ISR collection. */
        fun isrCollectionImpact(isrCollectionImpact: Boolean) =
            isrCollectionImpact(JsonField.of(isrCollectionImpact))

        /**
         * Sets [Builder.isrCollectionImpact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isrCollectionImpact] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isrCollectionImpact(isrCollectionImpact: JsonField<Boolean>) = apply {
            this.isrCollectionImpact = isrCollectionImpact
        }

        /** The location of the affected receiver, reported as a kill box. */
        fun killBox(killBox: String) = killBox(JsonField.of(killBox))

        /**
         * Sets [Builder.killBox] to an arbitrary JSON value.
         *
         * You should usually call [Builder.killBox] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun killBox(killBox: JsonField<String>) = apply { this.killBox = killBox }

        /**
         * WGS-84 latitude of the affected receiver, represented as -90 to 90 degrees (negative
         * values south of equator).
         */
        fun lat(lat: Double) = lat(JsonField.of(lat))

        /**
         * Sets [Builder.lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

        /** The name or identifier of the affected link. */
        fun link(link: String) = link(JsonField.of(link))

        /**
         * Sets [Builder.link] to an arbitrary JSON value.
         *
         * You should usually call [Builder.link] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun link(link: JsonField<String>) = apply { this.link = link }

        /**
         * WGS-84 longitude of the affected receiver, represented as -180 to 180 degrees (negative
         * values west of Prime Meridian).
         */
        fun lon(lon: Double) = lon(JsonField.of(lon))

        /**
         * Sets [Builder.lon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

        /**
         * The Military Grid Reference System (MGRS) location of the affected receiver. The Military
         * Grid Reference System is the geocoordinate standard used by NATO militaries for locating
         * points on Earth. The MGRS is derived from the Universal Transverse Mercator (UTM) grid
         * system and the Universal Polar Stereographic (UPS) grid system, but uses a different
         * labeling convention. The MGRS is used as geocode for the entire Earth. Example of a
         * milgrid coordinate, or grid reference, would be 4QFJ12345678, which consists of three
         * parts:
         *
         * 4Q (grid zone designator, GZD) FJ (the 100,000-meter square identifier) 12345678
         * (numerical location; easting is 1234 and northing is 5678, in this case specifying a
         * location with 10 m resolution).
         */
        fun milGrid(milGrid: String) = milGrid(JsonField.of(milGrid))

        /**
         * Sets [Builder.milGrid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.milGrid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun milGrid(milGrid: JsonField<String>) = apply { this.milGrid = milGrid }

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
         * Optional identifier provided by the reporting source to indicate the affected object of
         * this report. This may be an internal identifier and not necessarily map to a valid
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

        /** The persistence status (e.g. CONTINUOUS, INTERMITTENT, RANDOM, etc.) of the EMI. */
        fun persistence(persistence: String) = persistence(JsonField.of(persistence))

        /**
         * Sets [Builder.persistence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.persistence] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun persistence(persistence: JsonField<String>) = apply { this.persistence = persistence }

        /** The name or identifier of the affected platform. */
        fun platform(platform: String) = platform(JsonField.of(platform))

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun platform(platform: JsonField<String>) = apply { this.platform = platform }

        /**
         * The demodulation method (e.g. AM, FM, FSK, PSK, etc.) setting of the affected receiver.
         */
        fun rcvrDemod(rcvrDemod: String) = rcvrDemod(JsonField.of(rcvrDemod))

        /**
         * Sets [Builder.rcvrDemod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rcvrDemod] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rcvrDemod(rcvrDemod: JsonField<String>) = apply { this.rcvrDemod = rcvrDemod }

        /** The gain setting of the affected receiver, in decibels (dB). */
        fun rcvrGain(rcvrGain: Double) = rcvrGain(JsonField.of(rcvrGain))

        /**
         * Sets [Builder.rcvrGain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rcvrGain] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rcvrGain(rcvrGain: JsonField<Double>) = apply { this.rcvrGain = rcvrGain }

        /** Description of the affected receiver location. */
        fun rcvrLocation(rcvrLocation: String) = rcvrLocation(JsonField.of(rcvrLocation))

        /**
         * Sets [Builder.rcvrLocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rcvrLocation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rcvrLocation(rcvrLocation: JsonField<String>) = apply {
            this.rcvrLocation = rcvrLocation
        }

        /** The affected antenna type (e.g. DISH, OMNI, PHASED ARRAY, etc.) experiencing the EMI. */
        fun rcvrType(rcvrType: String) = rcvrType(JsonField.of(rcvrType))

        /**
         * Sets [Builder.rcvrType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rcvrType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rcvrType(rcvrType: JsonField<String>) = apply { this.rcvrType = rcvrType }

        /**
         * The responsible service branch under which this EMI falls (AIR FORCE, ARMY, COAST GUARD,
         * MARINES, NAVY).
         */
        fun respService(respService: String) = respService(JsonField.of(respService))

        /**
         * Sets [Builder.respService] to an arbitrary JSON value.
         *
         * You should usually call [Builder.respService] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun respService(respService: JsonField<String>) = apply { this.respService = respService }

        /** The priority (LOW, MEDIUM, HIGH) of the affected SATCOM. */
        fun satcomPriority(satcomPriority: String) = satcomPriority(JsonField.of(satcomPriority))

        /**
         * Sets [Builder.satcomPriority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satcomPriority] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun satcomPriority(satcomPriority: JsonField<String>) = apply {
            this.satcomPriority = satcomPriority
        }

        /** The downlink frequency, in MHz, of the impacted link. */
        fun satDownlinkFrequency(satDownlinkFrequency: Double) =
            satDownlinkFrequency(JsonField.of(satDownlinkFrequency))

        /**
         * Sets [Builder.satDownlinkFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satDownlinkFrequency] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun satDownlinkFrequency(satDownlinkFrequency: JsonField<Double>) = apply {
            this.satDownlinkFrequency = satDownlinkFrequency
        }

        /**
         * The downlink polarization e.g. H - (Horizontally Polarized), V - (Vertically Polarized),
         * L - (Left Hand Circularly Polarized), R - (Right Hand Circularly Polarized).
         */
        fun satDownlinkPolarization(satDownlinkPolarization: String) =
            satDownlinkPolarization(JsonField.of(satDownlinkPolarization))

        /**
         * Sets [Builder.satDownlinkPolarization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satDownlinkPolarization] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun satDownlinkPolarization(satDownlinkPolarization: JsonField<String>) = apply {
            this.satDownlinkPolarization = satDownlinkPolarization
        }

        /** The name of the spacecraft whose link is being affected by the EMI. */
        fun satName(satName: String) = satName(JsonField.of(satName))

        /**
         * Sets [Builder.satName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satName(satName: JsonField<String>) = apply { this.satName = satName }

        /** Satellite/Catalog number of the affected OnOrbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /** The name or identifier of the affected sat transponder. */
        fun satTransponderId(satTransponderId: String) =
            satTransponderId(JsonField.of(satTransponderId))

        /**
         * Sets [Builder.satTransponderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satTransponderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun satTransponderId(satTransponderId: JsonField<String>) = apply {
            this.satTransponderId = satTransponderId
        }

        /** The uplink frequency, in MHz, of the impacted link. */
        fun satUplinkFrequency(satUplinkFrequency: Double) =
            satUplinkFrequency(JsonField.of(satUplinkFrequency))

        /**
         * Sets [Builder.satUplinkFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satUplinkFrequency] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun satUplinkFrequency(satUplinkFrequency: JsonField<Double>) = apply {
            this.satUplinkFrequency = satUplinkFrequency
        }

        /**
         * The uplink polarization e.g. H - (Horizontally Polarized), V - (Vertically Polarized),
         * L - (Left Hand Circularly Polarized), R - (Right Hand Circularly Polarized).
         */
        fun satUplinkPolarization(satUplinkPolarization: String) =
            satUplinkPolarization(JsonField.of(satUplinkPolarization))

        /**
         * Sets [Builder.satUplinkPolarization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satUplinkPolarization] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun satUplinkPolarization(satUplinkPolarization: JsonField<String>) = apply {
            this.satUplinkPolarization = satUplinkPolarization
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

        /** The reporting status (INITIAL, UPDATE, RESOLVED) of this EMI issue. */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** The ISR role of the impacted asset. */
        fun supportedIsrRole(supportedIsrRole: String) =
            supportedIsrRole(JsonField.of(supportedIsrRole))

        /**
         * Sets [Builder.supportedIsrRole] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedIsrRole] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun supportedIsrRole(supportedIsrRole: JsonField<String>) = apply {
            this.supportedIsrRole = supportedIsrRole
        }

        /** The name or identifier of the affected system. */
        fun system(system: String) = system(JsonField.of(system))

        /**
         * Sets [Builder.system] to an arbitrary JSON value.
         *
         * You should usually call [Builder.system] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun system(system: JsonField<String>) = apply { this.system = system }

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
         * The alternate country identifier in which the EMI occurred or is occurring. Specifies an
         * alternate country code if the data provider code is not part of an official Country Code
         * standard such as ISO-3166 or FIPS.
         */
        fun victimAltCountry(victimAltCountry: String) =
            victimAltCountry(JsonField.of(victimAltCountry))

        /**
         * Sets [Builder.victimAltCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.victimAltCountry] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun victimAltCountry(victimAltCountry: JsonField<String>) = apply {
            this.victimAltCountry = victimAltCountry
        }

        /**
         * The country code in which the EMI occurred or is occurring. This value is typically the
         * ISO 3166 Alpha-2 two-character country code, however it can also represent various
         * consortiums that do not appear in the ISO document. The code must correspond to an
         * existing country in the UDL’s country API. Call udl/country/{code} to get any associated
         * FIPS code, ISO Alpha-3 code, or alternate code values that exist for the specified
         * country code.
         */
        fun victimCountryCode(victimCountryCode: String) =
            victimCountryCode(JsonField.of(victimCountryCode))

        /**
         * Sets [Builder.victimCountryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.victimCountryCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun victimCountryCode(victimCountryCode: JsonField<String>) = apply {
            this.victimCountryCode = victimCountryCode
        }

        /** The victim functional impacts (e.g. C2, COMM DATA LINK, ISR SENSOR, PNT, etc.). */
        fun victimFuncImpacts(victimFuncImpacts: String) =
            victimFuncImpacts(JsonField.of(victimFuncImpacts))

        /**
         * Sets [Builder.victimFuncImpacts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.victimFuncImpacts] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun victimFuncImpacts(victimFuncImpacts: JsonField<String>) = apply {
            this.victimFuncImpacts = victimFuncImpacts
        }

        /** The e-mail contact of the reporting POC. */
        fun victimPocMail(victimPocMail: String) = victimPocMail(JsonField.of(victimPocMail))

        /**
         * Sets [Builder.victimPocMail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.victimPocMail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun victimPocMail(victimPocMail: JsonField<String>) = apply {
            this.victimPocMail = victimPocMail
        }

        /** The Point of Contact (POC) for this EMI Report. */
        fun victimPocName(victimPocName: String) = victimPocName(JsonField.of(victimPocName))

        /**
         * Sets [Builder.victimPocName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.victimPocName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun victimPocName(victimPocName: JsonField<String>) = apply {
            this.victimPocName = victimPocName
        }

        /**
         * The phone number of the reporting POC, represented as digits only, no spaces or special
         * characters.
         */
        fun victimPocPhone(victimPocPhone: String) = victimPocPhone(JsonField.of(victimPocPhone))

        /**
         * Sets [Builder.victimPocPhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.victimPocPhone] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun victimPocPhone(victimPocPhone: JsonField<String>) = apply {
            this.victimPocPhone = victimPocPhone
        }

        /** The Unit or Organization of the reporting POC. */
        fun victimPocUnit(victimPocUnit: String) = victimPocUnit(JsonField.of(victimPocUnit))

        /**
         * Sets [Builder.victimPocUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.victimPocUnit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun victimPocUnit(victimPocUnit: JsonField<String>) = apply {
            this.victimPocUnit = victimPocUnit
        }

        /**
         * The victim reaction (e.g. LOITER ORBIT, RETASK ASSET, RETURN TO BASE, TROUBLESHOOT,
         * etc.).
         */
        fun victimReaction(victimReaction: String) = victimReaction(JsonField.of(victimReaction))

        /**
         * Sets [Builder.victimReaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.victimReaction] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun victimReaction(victimReaction: JsonField<String>) = apply {
            this.victimReaction = victimReaction
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
         * Returns an immutable instance of [HistoryListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .isr()
         * .reportId()
         * .reportTime()
         * .reportType()
         * .requestAssist()
         * .source()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HistoryListResponse =
            HistoryListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("isr", isr),
                checkRequired("reportId", reportId),
                checkRequired("reportTime", reportTime),
                checkRequired("reportType", reportType),
                checkRequired("requestAssist", requestAssist),
                checkRequired("source", source),
                checkRequired("startTime", startTime),
                id,
                actionsTaken,
                affActivity,
                alt,
                aor,
                band,
                beamPattern,
                channel,
                chanPirate,
                createdAt,
                createdBy,
                description,
                dneImpact,
                emiType,
                endTime,
                frequency,
                (geoLocErrEllp ?: JsonMissing.of()).map { it.toImmutable() },
                gpsEncrypted,
                gpsFreq,
                highAffectedFrequency,
                idOnOrbit,
                intercept,
                interceptLang,
                interceptType,
                intSrcAmplitude,
                intSrcBandwidth,
                intSrcCentFreq,
                intSrcEncrypted,
                intSrcModulation,
                isrCollectionImpact,
                killBox,
                lat,
                link,
                lon,
                milGrid,
                onOrbit,
                origin,
                origNetwork,
                origObjectId,
                persistence,
                platform,
                rcvrDemod,
                rcvrGain,
                rcvrLocation,
                rcvrType,
                respService,
                satcomPriority,
                satDownlinkFrequency,
                satDownlinkPolarization,
                satName,
                satNo,
                satTransponderId,
                satUplinkFrequency,
                satUplinkPolarization,
                sourceDl,
                status,
                supportedIsrRole,
                system,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                transactionId,
                victimAltCountry,
                victimCountryCode,
                victimFuncImpacts,
                victimPocMail,
                victimPocName,
                victimPocPhone,
                victimPocUnit,
                victimReaction,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HistoryListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        isr()
        reportId()
        reportTime()
        reportType()
        requestAssist()
        source()
        startTime()
        id()
        actionsTaken()
        affActivity()
        alt()
        aor()
        band()
        beamPattern()
        channel()
        chanPirate()
        createdAt()
        createdBy()
        description()
        dneImpact()
        emiType()
        endTime()
        frequency()
        geoLocErrEllp()
        gpsEncrypted()
        gpsFreq()
        highAffectedFrequency()
        idOnOrbit()
        intercept()
        interceptLang()
        interceptType()
        intSrcAmplitude()
        intSrcBandwidth()
        intSrcCentFreq()
        intSrcEncrypted()
        intSrcModulation()
        isrCollectionImpact()
        killBox()
        lat()
        link()
        lon()
        milGrid()
        onOrbit().ifPresent { it.validate() }
        origin()
        origNetwork()
        origObjectId()
        persistence()
        platform()
        rcvrDemod()
        rcvrGain()
        rcvrLocation()
        rcvrType()
        respService()
        satcomPriority()
        satDownlinkFrequency()
        satDownlinkPolarization()
        satName()
        satNo()
        satTransponderId()
        satUplinkFrequency()
        satUplinkPolarization()
        sourceDl()
        status()
        supportedIsrRole()
        system()
        tags()
        transactionId()
        victimAltCountry()
        victimCountryCode()
        victimFuncImpacts()
        victimPocMail()
        victimPocName()
        victimPocPhone()
        victimPocUnit()
        victimReaction()
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
            (if (isr.asKnown().isPresent) 1 else 0) +
            (if (reportId.asKnown().isPresent) 1 else 0) +
            (if (reportTime.asKnown().isPresent) 1 else 0) +
            (if (reportType.asKnown().isPresent) 1 else 0) +
            (if (requestAssist.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (actionsTaken.asKnown().isPresent) 1 else 0) +
            (if (affActivity.asKnown().isPresent) 1 else 0) +
            (if (alt.asKnown().isPresent) 1 else 0) +
            (if (aor.asKnown().isPresent) 1 else 0) +
            (if (band.asKnown().isPresent) 1 else 0) +
            (if (beamPattern.asKnown().isPresent) 1 else 0) +
            (if (channel.asKnown().isPresent) 1 else 0) +
            (if (chanPirate.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (dneImpact.asKnown().isPresent) 1 else 0) +
            (if (emiType.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (frequency.asKnown().isPresent) 1 else 0) +
            (geoLocErrEllp.asKnown().getOrNull()?.size ?: 0) +
            (if (gpsEncrypted.asKnown().isPresent) 1 else 0) +
            (if (gpsFreq.asKnown().isPresent) 1 else 0) +
            (if (highAffectedFrequency.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (intercept.asKnown().isPresent) 1 else 0) +
            (if (interceptLang.asKnown().isPresent) 1 else 0) +
            (if (interceptType.asKnown().isPresent) 1 else 0) +
            (if (intSrcAmplitude.asKnown().isPresent) 1 else 0) +
            (if (intSrcBandwidth.asKnown().isPresent) 1 else 0) +
            (if (intSrcCentFreq.asKnown().isPresent) 1 else 0) +
            (if (intSrcEncrypted.asKnown().isPresent) 1 else 0) +
            (if (intSrcModulation.asKnown().isPresent) 1 else 0) +
            (if (isrCollectionImpact.asKnown().isPresent) 1 else 0) +
            (if (killBox.asKnown().isPresent) 1 else 0) +
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (link.asKnown().isPresent) 1 else 0) +
            (if (lon.asKnown().isPresent) 1 else 0) +
            (if (milGrid.asKnown().isPresent) 1 else 0) +
            (onOrbit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (persistence.asKnown().isPresent) 1 else 0) +
            (if (platform.asKnown().isPresent) 1 else 0) +
            (if (rcvrDemod.asKnown().isPresent) 1 else 0) +
            (if (rcvrGain.asKnown().isPresent) 1 else 0) +
            (if (rcvrLocation.asKnown().isPresent) 1 else 0) +
            (if (rcvrType.asKnown().isPresent) 1 else 0) +
            (if (respService.asKnown().isPresent) 1 else 0) +
            (if (satcomPriority.asKnown().isPresent) 1 else 0) +
            (if (satDownlinkFrequency.asKnown().isPresent) 1 else 0) +
            (if (satDownlinkPolarization.asKnown().isPresent) 1 else 0) +
            (if (satName.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (satTransponderId.asKnown().isPresent) 1 else 0) +
            (if (satUplinkFrequency.asKnown().isPresent) 1 else 0) +
            (if (satUplinkPolarization.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (supportedIsrRole.asKnown().isPresent) 1 else 0) +
            (if (system.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (victimAltCountry.asKnown().isPresent) 1 else 0) +
            (if (victimCountryCode.asKnown().isPresent) 1 else 0) +
            (if (victimFuncImpacts.asKnown().isPresent) 1 else 0) +
            (if (victimPocMail.asKnown().isPresent) 1 else 0) +
            (if (victimPocName.asKnown().isPresent) 1 else 0) +
            (if (victimPocPhone.asKnown().isPresent) 1 else 0) +
            (if (victimPocUnit.asKnown().isPresent) 1 else 0) +
            (if (victimReaction.asKnown().isPresent) 1 else 0)

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

        return other is HistoryListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            isr == other.isr &&
            reportId == other.reportId &&
            reportTime == other.reportTime &&
            reportType == other.reportType &&
            requestAssist == other.requestAssist &&
            source == other.source &&
            startTime == other.startTime &&
            id == other.id &&
            actionsTaken == other.actionsTaken &&
            affActivity == other.affActivity &&
            alt == other.alt &&
            aor == other.aor &&
            band == other.band &&
            beamPattern == other.beamPattern &&
            channel == other.channel &&
            chanPirate == other.chanPirate &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            description == other.description &&
            dneImpact == other.dneImpact &&
            emiType == other.emiType &&
            endTime == other.endTime &&
            frequency == other.frequency &&
            geoLocErrEllp == other.geoLocErrEllp &&
            gpsEncrypted == other.gpsEncrypted &&
            gpsFreq == other.gpsFreq &&
            highAffectedFrequency == other.highAffectedFrequency &&
            idOnOrbit == other.idOnOrbit &&
            intercept == other.intercept &&
            interceptLang == other.interceptLang &&
            interceptType == other.interceptType &&
            intSrcAmplitude == other.intSrcAmplitude &&
            intSrcBandwidth == other.intSrcBandwidth &&
            intSrcCentFreq == other.intSrcCentFreq &&
            intSrcEncrypted == other.intSrcEncrypted &&
            intSrcModulation == other.intSrcModulation &&
            isrCollectionImpact == other.isrCollectionImpact &&
            killBox == other.killBox &&
            lat == other.lat &&
            link == other.link &&
            lon == other.lon &&
            milGrid == other.milGrid &&
            onOrbit == other.onOrbit &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            persistence == other.persistence &&
            platform == other.platform &&
            rcvrDemod == other.rcvrDemod &&
            rcvrGain == other.rcvrGain &&
            rcvrLocation == other.rcvrLocation &&
            rcvrType == other.rcvrType &&
            respService == other.respService &&
            satcomPriority == other.satcomPriority &&
            satDownlinkFrequency == other.satDownlinkFrequency &&
            satDownlinkPolarization == other.satDownlinkPolarization &&
            satName == other.satName &&
            satNo == other.satNo &&
            satTransponderId == other.satTransponderId &&
            satUplinkFrequency == other.satUplinkFrequency &&
            satUplinkPolarization == other.satUplinkPolarization &&
            sourceDl == other.sourceDl &&
            status == other.status &&
            supportedIsrRole == other.supportedIsrRole &&
            system == other.system &&
            tags == other.tags &&
            transactionId == other.transactionId &&
            victimAltCountry == other.victimAltCountry &&
            victimCountryCode == other.victimCountryCode &&
            victimFuncImpacts == other.victimFuncImpacts &&
            victimPocMail == other.victimPocMail &&
            victimPocName == other.victimPocName &&
            victimPocPhone == other.victimPocPhone &&
            victimPocUnit == other.victimPocUnit &&
            victimReaction == other.victimReaction &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            isr,
            reportId,
            reportTime,
            reportType,
            requestAssist,
            source,
            startTime,
            id,
            actionsTaken,
            affActivity,
            alt,
            aor,
            band,
            beamPattern,
            channel,
            chanPirate,
            createdAt,
            createdBy,
            description,
            dneImpact,
            emiType,
            endTime,
            frequency,
            geoLocErrEllp,
            gpsEncrypted,
            gpsFreq,
            highAffectedFrequency,
            idOnOrbit,
            intercept,
            interceptLang,
            interceptType,
            intSrcAmplitude,
            intSrcBandwidth,
            intSrcCentFreq,
            intSrcEncrypted,
            intSrcModulation,
            isrCollectionImpact,
            killBox,
            lat,
            link,
            lon,
            milGrid,
            onOrbit,
            origin,
            origNetwork,
            origObjectId,
            persistence,
            platform,
            rcvrDemod,
            rcvrGain,
            rcvrLocation,
            rcvrType,
            respService,
            satcomPriority,
            satDownlinkFrequency,
            satDownlinkPolarization,
            satName,
            satNo,
            satTransponderId,
            satUplinkFrequency,
            satUplinkPolarization,
            sourceDl,
            status,
            supportedIsrRole,
            system,
            tags,
            transactionId,
            victimAltCountry,
            victimCountryCode,
            victimFuncImpacts,
            victimPocMail,
            victimPocName,
            victimPocPhone,
            victimPocUnit,
            victimReaction,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HistoryListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, isr=$isr, reportId=$reportId, reportTime=$reportTime, reportType=$reportType, requestAssist=$requestAssist, source=$source, startTime=$startTime, id=$id, actionsTaken=$actionsTaken, affActivity=$affActivity, alt=$alt, aor=$aor, band=$band, beamPattern=$beamPattern, channel=$channel, chanPirate=$chanPirate, createdAt=$createdAt, createdBy=$createdBy, description=$description, dneImpact=$dneImpact, emiType=$emiType, endTime=$endTime, frequency=$frequency, geoLocErrEllp=$geoLocErrEllp, gpsEncrypted=$gpsEncrypted, gpsFreq=$gpsFreq, highAffectedFrequency=$highAffectedFrequency, idOnOrbit=$idOnOrbit, intercept=$intercept, interceptLang=$interceptLang, interceptType=$interceptType, intSrcAmplitude=$intSrcAmplitude, intSrcBandwidth=$intSrcBandwidth, intSrcCentFreq=$intSrcCentFreq, intSrcEncrypted=$intSrcEncrypted, intSrcModulation=$intSrcModulation, isrCollectionImpact=$isrCollectionImpact, killBox=$killBox, lat=$lat, link=$link, lon=$lon, milGrid=$milGrid, onOrbit=$onOrbit, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, persistence=$persistence, platform=$platform, rcvrDemod=$rcvrDemod, rcvrGain=$rcvrGain, rcvrLocation=$rcvrLocation, rcvrType=$rcvrType, respService=$respService, satcomPriority=$satcomPriority, satDownlinkFrequency=$satDownlinkFrequency, satDownlinkPolarization=$satDownlinkPolarization, satName=$satName, satNo=$satNo, satTransponderId=$satTransponderId, satUplinkFrequency=$satUplinkFrequency, satUplinkPolarization=$satUplinkPolarization, sourceDl=$sourceDl, status=$status, supportedIsrRole=$supportedIsrRole, system=$system, tags=$tags, transactionId=$transactionId, victimAltCountry=$victimAltCountry, victimCountryCode=$victimCountryCode, victimFuncImpacts=$victimFuncImpacts, victimPocMail=$victimPocMail, victimPocName=$victimPocName, victimPocPhone=$victimPocPhone, victimPocUnit=$victimPocUnit, victimReaction=$victimReaction, additionalProperties=$additionalProperties}"
}

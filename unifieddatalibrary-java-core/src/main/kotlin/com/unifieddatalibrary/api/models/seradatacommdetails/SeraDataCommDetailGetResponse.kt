// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatacommdetails

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

/** Seradata-compiled information on communications payloads. */
class SeraDataCommDetailGetResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val band: JsonField<String>,
    private val bandwidth: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val eirp: JsonField<Double>,
    private val estHtsTotalCapacity: JsonField<Double>,
    private val estHtsTotalUserDownlinkBandwidthPerBeam: JsonField<Double>,
    private val estHtsTotalUserUplinkBandwidthPerBeam: JsonField<Double>,
    private val gatewayDownlinkFrom: JsonField<Double>,
    private val gatewayDownlinkTo: JsonField<Double>,
    private val gatewayUplinkFrom: JsonField<Double>,
    private val gatewayUplinkTo: JsonField<Double>,
    private val hostedForCompanyOrgId: JsonField<String>,
    private val htsNumUserSpotBeams: JsonField<Int>,
    private val htsUserDownlinkBandwidthPerBeam: JsonField<Double>,
    private val htsUserUplinkBandwidthPerBeam: JsonField<Double>,
    private val idComm: JsonField<String>,
    private val manufacturerOrgId: JsonField<String>,
    private val num36MhzEquivalentTransponders: JsonField<Int>,
    private val numOperationalTransponders: JsonField<Int>,
    private val numSpareTransponders: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val payloadNotes: JsonField<String>,
    private val polarization: JsonField<String>,
    private val solidStatePowerAmp: JsonField<Double>,
    private val spacecraftId: JsonField<String>,
    private val tradeLeaseOrgId: JsonField<String>,
    private val travelingWaveTubeAmplifier: JsonField<Double>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val userDownlinkFrom: JsonField<Double>,
    private val userDownlinkTo: JsonField<Double>,
    private val userUplinkFrom: JsonField<Double>,
    private val userUplinkTo: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("band") @ExcludeMissing band: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bandwidth") @ExcludeMissing bandwidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eirp") @ExcludeMissing eirp: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("estHtsTotalCapacity")
        @ExcludeMissing
        estHtsTotalCapacity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("estHtsTotalUserDownlinkBandwidthPerBeam")
        @ExcludeMissing
        estHtsTotalUserDownlinkBandwidthPerBeam: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("estHtsTotalUserUplinkBandwidthPerBeam")
        @ExcludeMissing
        estHtsTotalUserUplinkBandwidthPerBeam: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gatewayDownlinkFrom")
        @ExcludeMissing
        gatewayDownlinkFrom: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gatewayDownlinkTo")
        @ExcludeMissing
        gatewayDownlinkTo: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gatewayUplinkFrom")
        @ExcludeMissing
        gatewayUplinkFrom: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gatewayUplinkTo")
        @ExcludeMissing
        gatewayUplinkTo: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hostedForCompanyOrgId")
        @ExcludeMissing
        hostedForCompanyOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("htsNumUserSpotBeams")
        @ExcludeMissing
        htsNumUserSpotBeams: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("htsUserDownlinkBandwidthPerBeam")
        @ExcludeMissing
        htsUserDownlinkBandwidthPerBeam: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("htsUserUplinkBandwidthPerBeam")
        @ExcludeMissing
        htsUserUplinkBandwidthPerBeam: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idComm") @ExcludeMissing idComm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manufacturerOrgId")
        @ExcludeMissing
        manufacturerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("num36MhzEquivalentTransponders")
        @ExcludeMissing
        num36MhzEquivalentTransponders: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numOperationalTransponders")
        @ExcludeMissing
        numOperationalTransponders: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numSpareTransponders")
        @ExcludeMissing
        numSpareTransponders: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payloadNotes")
        @ExcludeMissing
        payloadNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("polarization")
        @ExcludeMissing
        polarization: JsonField<String> = JsonMissing.of(),
        @JsonProperty("solidStatePowerAmp")
        @ExcludeMissing
        solidStatePowerAmp: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("spacecraftId")
        @ExcludeMissing
        spacecraftId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tradeLeaseOrgId")
        @ExcludeMissing
        tradeLeaseOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("travelingWaveTubeAmplifier")
        @ExcludeMissing
        travelingWaveTubeAmplifier: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userDownlinkFrom")
        @ExcludeMissing
        userDownlinkFrom: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("userDownlinkTo")
        @ExcludeMissing
        userDownlinkTo: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("userUplinkFrom")
        @ExcludeMissing
        userUplinkFrom: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("userUplinkTo")
        @ExcludeMissing
        userUplinkTo: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        id,
        band,
        bandwidth,
        createdAt,
        createdBy,
        eirp,
        estHtsTotalCapacity,
        estHtsTotalUserDownlinkBandwidthPerBeam,
        estHtsTotalUserUplinkBandwidthPerBeam,
        gatewayDownlinkFrom,
        gatewayDownlinkTo,
        gatewayUplinkFrom,
        gatewayUplinkTo,
        hostedForCompanyOrgId,
        htsNumUserSpotBeams,
        htsUserDownlinkBandwidthPerBeam,
        htsUserUplinkBandwidthPerBeam,
        idComm,
        manufacturerOrgId,
        num36MhzEquivalentTransponders,
        numOperationalTransponders,
        numSpareTransponders,
        origin,
        origNetwork,
        payloadNotes,
        polarization,
        solidStatePowerAmp,
        spacecraftId,
        tradeLeaseOrgId,
        travelingWaveTubeAmplifier,
        updatedAt,
        updatedBy,
        userDownlinkFrom,
        userDownlinkTo,
        userUplinkFrom,
        userUplinkTo,
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
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Name of the band of this RF range (e.g. X,K,Ku,Ka,L,S,C,UHF,VHF,EHF,SHF,UNK,VLF,HF,E,Q,V,W).
     * See RFBandType for more details and descriptions of each band name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun band(): Optional<String> = band.getOptional("band")

    /**
     * Comm bandwidth in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bandwidth(): Optional<Double> = bandwidth.getOptional("bandwidth")

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
     * Effective isotropic radiated power in dB.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eirp(): Optional<Double> = eirp.getOptional("eirp")

    /**
     * Comm estimated HtsTotalCapacity in Gbps.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun estHtsTotalCapacity(): Optional<Double> =
        estHtsTotalCapacity.getOptional("estHtsTotalCapacity")

    /**
     * Comm estimated HtsTotalUserDownlinkBandwidthPerBeam in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun estHtsTotalUserDownlinkBandwidthPerBeam(): Optional<Double> =
        estHtsTotalUserDownlinkBandwidthPerBeam.getOptional(
            "estHtsTotalUserDownlinkBandwidthPerBeam"
        )

    /**
     * Comm estimated HtsTotalUserUplinkBandwidthPerBeam in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun estHtsTotalUserUplinkBandwidthPerBeam(): Optional<Double> =
        estHtsTotalUserUplinkBandwidthPerBeam.getOptional("estHtsTotalUserUplinkBandwidthPerBeam")

    /**
     * Comm gatewayDownlinkFrom in Ghz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gatewayDownlinkFrom(): Optional<Double> =
        gatewayDownlinkFrom.getOptional("gatewayDownlinkFrom")

    /**
     * Comm gatewayDownlinkTo in Ghz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gatewayDownlinkTo(): Optional<Double> = gatewayDownlinkTo.getOptional("gatewayDownlinkTo")

    /**
     * Comm gatewayUplinkFrom in Ghz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gatewayUplinkFrom(): Optional<Double> = gatewayUplinkFrom.getOptional("gatewayUplinkFrom")

    /**
     * Comm gatewayUplinkTo in Ghz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gatewayUplinkTo(): Optional<Double> = gatewayUplinkTo.getOptional("gatewayUplinkTo")

    /**
     * Comm hostedForCompanyOrgId.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hostedForCompanyOrgId(): Optional<String> =
        hostedForCompanyOrgId.getOptional("hostedForCompanyOrgId")

    /**
     * Comm htsNumUserSpotBeams.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun htsNumUserSpotBeams(): Optional<Int> =
        htsNumUserSpotBeams.getOptional("htsNumUserSpotBeams")

    /**
     * Comm htsUserDownlinkBandwidthPerBeam in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun htsUserDownlinkBandwidthPerBeam(): Optional<Double> =
        htsUserDownlinkBandwidthPerBeam.getOptional("htsUserDownlinkBandwidthPerBeam")

    /**
     * Comm htsUserUplinkBandwidthPerBeam in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun htsUserUplinkBandwidthPerBeam(): Optional<Double> =
        htsUserUplinkBandwidthPerBeam.getOptional("htsUserUplinkBandwidthPerBeam")

    /**
     * UUID of the parent Comm record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idComm(): Optional<String> = idComm.getOptional("idComm")

    /**
     * Comm manufacturerOrgId.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun manufacturerOrgId(): Optional<String> = manufacturerOrgId.getOptional("manufacturerOrgId")

    /**
     * Comm num36MhzEquivalentTransponders.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun num36MhzEquivalentTransponders(): Optional<Int> =
        num36MhzEquivalentTransponders.getOptional("num36MhzEquivalentTransponders")

    /**
     * Comm numOperationalTransponders.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numOperationalTransponders(): Optional<Int> =
        numOperationalTransponders.getOptional("numOperationalTransponders")

    /**
     * Comm numSpareTransponders.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numSpareTransponders(): Optional<Int> =
        numSpareTransponders.getOptional("numSpareTransponders")

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
     * Payload notes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun payloadNotes(): Optional<String> = payloadNotes.getOptional("payloadNotes")

    /**
     * Comm polarization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarization(): Optional<String> = polarization.getOptional("polarization")

    /**
     * Solid state power amplifier, in Watts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solidStatePowerAmp(): Optional<Double> =
        solidStatePowerAmp.getOptional("solidStatePowerAmp")

    /**
     * Seradata ID of the spacecraft (SeradataSpacecraftDetails ID).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spacecraftId(): Optional<String> = spacecraftId.getOptional("spacecraftId")

    /**
     * Comm tradeLeaseOrgId.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tradeLeaseOrgId(): Optional<String> = tradeLeaseOrgId.getOptional("tradeLeaseOrgId")

    /**
     * Comm travelingWaveTubeAmplifier in Watts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun travelingWaveTubeAmplifier(): Optional<Double> =
        travelingWaveTubeAmplifier.getOptional("travelingWaveTubeAmplifier")

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
     * Comm userDownlinkFrom in Ghz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun userDownlinkFrom(): Optional<Double> = userDownlinkFrom.getOptional("userDownlinkFrom")

    /**
     * Comm userDownlinkTo in Ghz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun userDownlinkTo(): Optional<Double> = userDownlinkTo.getOptional("userDownlinkTo")

    /**
     * Comm userUplinkFrom in Ghz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun userUplinkFrom(): Optional<Double> = userUplinkFrom.getOptional("userUplinkFrom")

    /**
     * Comm userUplinkTo in Ghz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun userUplinkTo(): Optional<Double> = userUplinkTo.getOptional("userUplinkTo")

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [band].
     *
     * Unlike [band], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("band") @ExcludeMissing fun _band(): JsonField<String> = band

    /**
     * Returns the raw JSON value of [bandwidth].
     *
     * Unlike [bandwidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bandwidth") @ExcludeMissing fun _bandwidth(): JsonField<Double> = bandwidth

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
     * Returns the raw JSON value of [eirp].
     *
     * Unlike [eirp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eirp") @ExcludeMissing fun _eirp(): JsonField<Double> = eirp

    /**
     * Returns the raw JSON value of [estHtsTotalCapacity].
     *
     * Unlike [estHtsTotalCapacity], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("estHtsTotalCapacity")
    @ExcludeMissing
    fun _estHtsTotalCapacity(): JsonField<Double> = estHtsTotalCapacity

    /**
     * Returns the raw JSON value of [estHtsTotalUserDownlinkBandwidthPerBeam].
     *
     * Unlike [estHtsTotalUserDownlinkBandwidthPerBeam], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("estHtsTotalUserDownlinkBandwidthPerBeam")
    @ExcludeMissing
    fun _estHtsTotalUserDownlinkBandwidthPerBeam(): JsonField<Double> =
        estHtsTotalUserDownlinkBandwidthPerBeam

    /**
     * Returns the raw JSON value of [estHtsTotalUserUplinkBandwidthPerBeam].
     *
     * Unlike [estHtsTotalUserUplinkBandwidthPerBeam], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("estHtsTotalUserUplinkBandwidthPerBeam")
    @ExcludeMissing
    fun _estHtsTotalUserUplinkBandwidthPerBeam(): JsonField<Double> =
        estHtsTotalUserUplinkBandwidthPerBeam

    /**
     * Returns the raw JSON value of [gatewayDownlinkFrom].
     *
     * Unlike [gatewayDownlinkFrom], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("gatewayDownlinkFrom")
    @ExcludeMissing
    fun _gatewayDownlinkFrom(): JsonField<Double> = gatewayDownlinkFrom

    /**
     * Returns the raw JSON value of [gatewayDownlinkTo].
     *
     * Unlike [gatewayDownlinkTo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("gatewayDownlinkTo")
    @ExcludeMissing
    fun _gatewayDownlinkTo(): JsonField<Double> = gatewayDownlinkTo

    /**
     * Returns the raw JSON value of [gatewayUplinkFrom].
     *
     * Unlike [gatewayUplinkFrom], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("gatewayUplinkFrom")
    @ExcludeMissing
    fun _gatewayUplinkFrom(): JsonField<Double> = gatewayUplinkFrom

    /**
     * Returns the raw JSON value of [gatewayUplinkTo].
     *
     * Unlike [gatewayUplinkTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gatewayUplinkTo")
    @ExcludeMissing
    fun _gatewayUplinkTo(): JsonField<Double> = gatewayUplinkTo

    /**
     * Returns the raw JSON value of [hostedForCompanyOrgId].
     *
     * Unlike [hostedForCompanyOrgId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hostedForCompanyOrgId")
    @ExcludeMissing
    fun _hostedForCompanyOrgId(): JsonField<String> = hostedForCompanyOrgId

    /**
     * Returns the raw JSON value of [htsNumUserSpotBeams].
     *
     * Unlike [htsNumUserSpotBeams], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("htsNumUserSpotBeams")
    @ExcludeMissing
    fun _htsNumUserSpotBeams(): JsonField<Int> = htsNumUserSpotBeams

    /**
     * Returns the raw JSON value of [htsUserDownlinkBandwidthPerBeam].
     *
     * Unlike [htsUserDownlinkBandwidthPerBeam], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("htsUserDownlinkBandwidthPerBeam")
    @ExcludeMissing
    fun _htsUserDownlinkBandwidthPerBeam(): JsonField<Double> = htsUserDownlinkBandwidthPerBeam

    /**
     * Returns the raw JSON value of [htsUserUplinkBandwidthPerBeam].
     *
     * Unlike [htsUserUplinkBandwidthPerBeam], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("htsUserUplinkBandwidthPerBeam")
    @ExcludeMissing
    fun _htsUserUplinkBandwidthPerBeam(): JsonField<Double> = htsUserUplinkBandwidthPerBeam

    /**
     * Returns the raw JSON value of [idComm].
     *
     * Unlike [idComm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idComm") @ExcludeMissing fun _idComm(): JsonField<String> = idComm

    /**
     * Returns the raw JSON value of [manufacturerOrgId].
     *
     * Unlike [manufacturerOrgId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("manufacturerOrgId")
    @ExcludeMissing
    fun _manufacturerOrgId(): JsonField<String> = manufacturerOrgId

    /**
     * Returns the raw JSON value of [num36MhzEquivalentTransponders].
     *
     * Unlike [num36MhzEquivalentTransponders], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("num36MhzEquivalentTransponders")
    @ExcludeMissing
    fun _num36MhzEquivalentTransponders(): JsonField<Int> = num36MhzEquivalentTransponders

    /**
     * Returns the raw JSON value of [numOperationalTransponders].
     *
     * Unlike [numOperationalTransponders], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("numOperationalTransponders")
    @ExcludeMissing
    fun _numOperationalTransponders(): JsonField<Int> = numOperationalTransponders

    /**
     * Returns the raw JSON value of [numSpareTransponders].
     *
     * Unlike [numSpareTransponders], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("numSpareTransponders")
    @ExcludeMissing
    fun _numSpareTransponders(): JsonField<Int> = numSpareTransponders

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
     * Returns the raw JSON value of [payloadNotes].
     *
     * Unlike [payloadNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payloadNotes")
    @ExcludeMissing
    fun _payloadNotes(): JsonField<String> = payloadNotes

    /**
     * Returns the raw JSON value of [polarization].
     *
     * Unlike [polarization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarization")
    @ExcludeMissing
    fun _polarization(): JsonField<String> = polarization

    /**
     * Returns the raw JSON value of [solidStatePowerAmp].
     *
     * Unlike [solidStatePowerAmp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("solidStatePowerAmp")
    @ExcludeMissing
    fun _solidStatePowerAmp(): JsonField<Double> = solidStatePowerAmp

    /**
     * Returns the raw JSON value of [spacecraftId].
     *
     * Unlike [spacecraftId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spacecraftId")
    @ExcludeMissing
    fun _spacecraftId(): JsonField<String> = spacecraftId

    /**
     * Returns the raw JSON value of [tradeLeaseOrgId].
     *
     * Unlike [tradeLeaseOrgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tradeLeaseOrgId")
    @ExcludeMissing
    fun _tradeLeaseOrgId(): JsonField<String> = tradeLeaseOrgId

    /**
     * Returns the raw JSON value of [travelingWaveTubeAmplifier].
     *
     * Unlike [travelingWaveTubeAmplifier], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("travelingWaveTubeAmplifier")
    @ExcludeMissing
    fun _travelingWaveTubeAmplifier(): JsonField<Double> = travelingWaveTubeAmplifier

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
     * Returns the raw JSON value of [userDownlinkFrom].
     *
     * Unlike [userDownlinkFrom], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("userDownlinkFrom")
    @ExcludeMissing
    fun _userDownlinkFrom(): JsonField<Double> = userDownlinkFrom

    /**
     * Returns the raw JSON value of [userDownlinkTo].
     *
     * Unlike [userDownlinkTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userDownlinkTo")
    @ExcludeMissing
    fun _userDownlinkTo(): JsonField<Double> = userDownlinkTo

    /**
     * Returns the raw JSON value of [userUplinkFrom].
     *
     * Unlike [userUplinkFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userUplinkFrom")
    @ExcludeMissing
    fun _userUplinkFrom(): JsonField<Double> = userUplinkFrom

    /**
     * Returns the raw JSON value of [userUplinkTo].
     *
     * Unlike [userUplinkTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userUplinkTo")
    @ExcludeMissing
    fun _userUplinkTo(): JsonField<Double> = userUplinkTo

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
         * [SeraDataCommDetailGetResponse].
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

    /** A builder for [SeraDataCommDetailGetResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var band: JsonField<String> = JsonMissing.of()
        private var bandwidth: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var eirp: JsonField<Double> = JsonMissing.of()
        private var estHtsTotalCapacity: JsonField<Double> = JsonMissing.of()
        private var estHtsTotalUserDownlinkBandwidthPerBeam: JsonField<Double> = JsonMissing.of()
        private var estHtsTotalUserUplinkBandwidthPerBeam: JsonField<Double> = JsonMissing.of()
        private var gatewayDownlinkFrom: JsonField<Double> = JsonMissing.of()
        private var gatewayDownlinkTo: JsonField<Double> = JsonMissing.of()
        private var gatewayUplinkFrom: JsonField<Double> = JsonMissing.of()
        private var gatewayUplinkTo: JsonField<Double> = JsonMissing.of()
        private var hostedForCompanyOrgId: JsonField<String> = JsonMissing.of()
        private var htsNumUserSpotBeams: JsonField<Int> = JsonMissing.of()
        private var htsUserDownlinkBandwidthPerBeam: JsonField<Double> = JsonMissing.of()
        private var htsUserUplinkBandwidthPerBeam: JsonField<Double> = JsonMissing.of()
        private var idComm: JsonField<String> = JsonMissing.of()
        private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
        private var num36MhzEquivalentTransponders: JsonField<Int> = JsonMissing.of()
        private var numOperationalTransponders: JsonField<Int> = JsonMissing.of()
        private var numSpareTransponders: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var payloadNotes: JsonField<String> = JsonMissing.of()
        private var polarization: JsonField<String> = JsonMissing.of()
        private var solidStatePowerAmp: JsonField<Double> = JsonMissing.of()
        private var spacecraftId: JsonField<String> = JsonMissing.of()
        private var tradeLeaseOrgId: JsonField<String> = JsonMissing.of()
        private var travelingWaveTubeAmplifier: JsonField<Double> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var userDownlinkFrom: JsonField<Double> = JsonMissing.of()
        private var userDownlinkTo: JsonField<Double> = JsonMissing.of()
        private var userUplinkFrom: JsonField<Double> = JsonMissing.of()
        private var userUplinkTo: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(seraDataCommDetailGetResponse: SeraDataCommDetailGetResponse) = apply {
            classificationMarking = seraDataCommDetailGetResponse.classificationMarking
            dataMode = seraDataCommDetailGetResponse.dataMode
            source = seraDataCommDetailGetResponse.source
            id = seraDataCommDetailGetResponse.id
            band = seraDataCommDetailGetResponse.band
            bandwidth = seraDataCommDetailGetResponse.bandwidth
            createdAt = seraDataCommDetailGetResponse.createdAt
            createdBy = seraDataCommDetailGetResponse.createdBy
            eirp = seraDataCommDetailGetResponse.eirp
            estHtsTotalCapacity = seraDataCommDetailGetResponse.estHtsTotalCapacity
            estHtsTotalUserDownlinkBandwidthPerBeam =
                seraDataCommDetailGetResponse.estHtsTotalUserDownlinkBandwidthPerBeam
            estHtsTotalUserUplinkBandwidthPerBeam =
                seraDataCommDetailGetResponse.estHtsTotalUserUplinkBandwidthPerBeam
            gatewayDownlinkFrom = seraDataCommDetailGetResponse.gatewayDownlinkFrom
            gatewayDownlinkTo = seraDataCommDetailGetResponse.gatewayDownlinkTo
            gatewayUplinkFrom = seraDataCommDetailGetResponse.gatewayUplinkFrom
            gatewayUplinkTo = seraDataCommDetailGetResponse.gatewayUplinkTo
            hostedForCompanyOrgId = seraDataCommDetailGetResponse.hostedForCompanyOrgId
            htsNumUserSpotBeams = seraDataCommDetailGetResponse.htsNumUserSpotBeams
            htsUserDownlinkBandwidthPerBeam =
                seraDataCommDetailGetResponse.htsUserDownlinkBandwidthPerBeam
            htsUserUplinkBandwidthPerBeam =
                seraDataCommDetailGetResponse.htsUserUplinkBandwidthPerBeam
            idComm = seraDataCommDetailGetResponse.idComm
            manufacturerOrgId = seraDataCommDetailGetResponse.manufacturerOrgId
            num36MhzEquivalentTransponders =
                seraDataCommDetailGetResponse.num36MhzEquivalentTransponders
            numOperationalTransponders = seraDataCommDetailGetResponse.numOperationalTransponders
            numSpareTransponders = seraDataCommDetailGetResponse.numSpareTransponders
            origin = seraDataCommDetailGetResponse.origin
            origNetwork = seraDataCommDetailGetResponse.origNetwork
            payloadNotes = seraDataCommDetailGetResponse.payloadNotes
            polarization = seraDataCommDetailGetResponse.polarization
            solidStatePowerAmp = seraDataCommDetailGetResponse.solidStatePowerAmp
            spacecraftId = seraDataCommDetailGetResponse.spacecraftId
            tradeLeaseOrgId = seraDataCommDetailGetResponse.tradeLeaseOrgId
            travelingWaveTubeAmplifier = seraDataCommDetailGetResponse.travelingWaveTubeAmplifier
            updatedAt = seraDataCommDetailGetResponse.updatedAt
            updatedBy = seraDataCommDetailGetResponse.updatedBy
            userDownlinkFrom = seraDataCommDetailGetResponse.userDownlinkFrom
            userDownlinkTo = seraDataCommDetailGetResponse.userDownlinkTo
            userUplinkFrom = seraDataCommDetailGetResponse.userUplinkFrom
            userUplinkTo = seraDataCommDetailGetResponse.userUplinkTo
            additionalProperties = seraDataCommDetailGetResponse.additionalProperties.toMutableMap()
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
         * Name of the band of this RF range (e.g.
         * X,K,Ku,Ka,L,S,C,UHF,VHF,EHF,SHF,UNK,VLF,HF,E,Q,V,W). See RFBandType for more details and
         * descriptions of each band name.
         */
        fun band(band: String) = band(JsonField.of(band))

        /**
         * Sets [Builder.band] to an arbitrary JSON value.
         *
         * You should usually call [Builder.band] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun band(band: JsonField<String>) = apply { this.band = band }

        /** Comm bandwidth in Mhz. */
        fun bandwidth(bandwidth: Double) = bandwidth(JsonField.of(bandwidth))

        /**
         * Sets [Builder.bandwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bandwidth] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bandwidth(bandwidth: JsonField<Double>) = apply { this.bandwidth = bandwidth }

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

        /** Effective isotropic radiated power in dB. */
        fun eirp(eirp: Double) = eirp(JsonField.of(eirp))

        /**
         * Sets [Builder.eirp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eirp] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eirp(eirp: JsonField<Double>) = apply { this.eirp = eirp }

        /** Comm estimated HtsTotalCapacity in Gbps. */
        fun estHtsTotalCapacity(estHtsTotalCapacity: Double) =
            estHtsTotalCapacity(JsonField.of(estHtsTotalCapacity))

        /**
         * Sets [Builder.estHtsTotalCapacity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estHtsTotalCapacity] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun estHtsTotalCapacity(estHtsTotalCapacity: JsonField<Double>) = apply {
            this.estHtsTotalCapacity = estHtsTotalCapacity
        }

        /** Comm estimated HtsTotalUserDownlinkBandwidthPerBeam in Mhz. */
        fun estHtsTotalUserDownlinkBandwidthPerBeam(
            estHtsTotalUserDownlinkBandwidthPerBeam: Double
        ) =
            estHtsTotalUserDownlinkBandwidthPerBeam(
                JsonField.of(estHtsTotalUserDownlinkBandwidthPerBeam)
            )

        /**
         * Sets [Builder.estHtsTotalUserDownlinkBandwidthPerBeam] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estHtsTotalUserDownlinkBandwidthPerBeam] with a
         * well-typed [Double] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun estHtsTotalUserDownlinkBandwidthPerBeam(
            estHtsTotalUserDownlinkBandwidthPerBeam: JsonField<Double>
        ) = apply {
            this.estHtsTotalUserDownlinkBandwidthPerBeam = estHtsTotalUserDownlinkBandwidthPerBeam
        }

        /** Comm estimated HtsTotalUserUplinkBandwidthPerBeam in Mhz. */
        fun estHtsTotalUserUplinkBandwidthPerBeam(estHtsTotalUserUplinkBandwidthPerBeam: Double) =
            estHtsTotalUserUplinkBandwidthPerBeam(
                JsonField.of(estHtsTotalUserUplinkBandwidthPerBeam)
            )

        /**
         * Sets [Builder.estHtsTotalUserUplinkBandwidthPerBeam] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estHtsTotalUserUplinkBandwidthPerBeam] with a well-typed
         * [Double] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun estHtsTotalUserUplinkBandwidthPerBeam(
            estHtsTotalUserUplinkBandwidthPerBeam: JsonField<Double>
        ) = apply {
            this.estHtsTotalUserUplinkBandwidthPerBeam = estHtsTotalUserUplinkBandwidthPerBeam
        }

        /** Comm gatewayDownlinkFrom in Ghz. */
        fun gatewayDownlinkFrom(gatewayDownlinkFrom: Double) =
            gatewayDownlinkFrom(JsonField.of(gatewayDownlinkFrom))

        /**
         * Sets [Builder.gatewayDownlinkFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gatewayDownlinkFrom] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gatewayDownlinkFrom(gatewayDownlinkFrom: JsonField<Double>) = apply {
            this.gatewayDownlinkFrom = gatewayDownlinkFrom
        }

        /** Comm gatewayDownlinkTo in Ghz. */
        fun gatewayDownlinkTo(gatewayDownlinkTo: Double) =
            gatewayDownlinkTo(JsonField.of(gatewayDownlinkTo))

        /**
         * Sets [Builder.gatewayDownlinkTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gatewayDownlinkTo] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gatewayDownlinkTo(gatewayDownlinkTo: JsonField<Double>) = apply {
            this.gatewayDownlinkTo = gatewayDownlinkTo
        }

        /** Comm gatewayUplinkFrom in Ghz. */
        fun gatewayUplinkFrom(gatewayUplinkFrom: Double) =
            gatewayUplinkFrom(JsonField.of(gatewayUplinkFrom))

        /**
         * Sets [Builder.gatewayUplinkFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gatewayUplinkFrom] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gatewayUplinkFrom(gatewayUplinkFrom: JsonField<Double>) = apply {
            this.gatewayUplinkFrom = gatewayUplinkFrom
        }

        /** Comm gatewayUplinkTo in Ghz. */
        fun gatewayUplinkTo(gatewayUplinkTo: Double) =
            gatewayUplinkTo(JsonField.of(gatewayUplinkTo))

        /**
         * Sets [Builder.gatewayUplinkTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gatewayUplinkTo] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gatewayUplinkTo(gatewayUplinkTo: JsonField<Double>) = apply {
            this.gatewayUplinkTo = gatewayUplinkTo
        }

        /** Comm hostedForCompanyOrgId. */
        fun hostedForCompanyOrgId(hostedForCompanyOrgId: String) =
            hostedForCompanyOrgId(JsonField.of(hostedForCompanyOrgId))

        /**
         * Sets [Builder.hostedForCompanyOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostedForCompanyOrgId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hostedForCompanyOrgId(hostedForCompanyOrgId: JsonField<String>) = apply {
            this.hostedForCompanyOrgId = hostedForCompanyOrgId
        }

        /** Comm htsNumUserSpotBeams. */
        fun htsNumUserSpotBeams(htsNumUserSpotBeams: Int) =
            htsNumUserSpotBeams(JsonField.of(htsNumUserSpotBeams))

        /**
         * Sets [Builder.htsNumUserSpotBeams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htsNumUserSpotBeams] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun htsNumUserSpotBeams(htsNumUserSpotBeams: JsonField<Int>) = apply {
            this.htsNumUserSpotBeams = htsNumUserSpotBeams
        }

        /** Comm htsUserDownlinkBandwidthPerBeam in Mhz. */
        fun htsUserDownlinkBandwidthPerBeam(htsUserDownlinkBandwidthPerBeam: Double) =
            htsUserDownlinkBandwidthPerBeam(JsonField.of(htsUserDownlinkBandwidthPerBeam))

        /**
         * Sets [Builder.htsUserDownlinkBandwidthPerBeam] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htsUserDownlinkBandwidthPerBeam] with a well-typed
         * [Double] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun htsUserDownlinkBandwidthPerBeam(htsUserDownlinkBandwidthPerBeam: JsonField<Double>) =
            apply {
                this.htsUserDownlinkBandwidthPerBeam = htsUserDownlinkBandwidthPerBeam
            }

        /** Comm htsUserUplinkBandwidthPerBeam in Mhz. */
        fun htsUserUplinkBandwidthPerBeam(htsUserUplinkBandwidthPerBeam: Double) =
            htsUserUplinkBandwidthPerBeam(JsonField.of(htsUserUplinkBandwidthPerBeam))

        /**
         * Sets [Builder.htsUserUplinkBandwidthPerBeam] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htsUserUplinkBandwidthPerBeam] with a well-typed
         * [Double] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun htsUserUplinkBandwidthPerBeam(htsUserUplinkBandwidthPerBeam: JsonField<Double>) =
            apply {
                this.htsUserUplinkBandwidthPerBeam = htsUserUplinkBandwidthPerBeam
            }

        /** UUID of the parent Comm record. */
        fun idComm(idComm: String) = idComm(JsonField.of(idComm))

        /**
         * Sets [Builder.idComm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idComm] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idComm(idComm: JsonField<String>) = apply { this.idComm = idComm }

        /** Comm manufacturerOrgId. */
        fun manufacturerOrgId(manufacturerOrgId: String) =
            manufacturerOrgId(JsonField.of(manufacturerOrgId))

        /**
         * Sets [Builder.manufacturerOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manufacturerOrgId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun manufacturerOrgId(manufacturerOrgId: JsonField<String>) = apply {
            this.manufacturerOrgId = manufacturerOrgId
        }

        /** Comm num36MhzEquivalentTransponders. */
        fun num36MhzEquivalentTransponders(num36MhzEquivalentTransponders: Int) =
            num36MhzEquivalentTransponders(JsonField.of(num36MhzEquivalentTransponders))

        /**
         * Sets [Builder.num36MhzEquivalentTransponders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.num36MhzEquivalentTransponders] with a well-typed [Int]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun num36MhzEquivalentTransponders(num36MhzEquivalentTransponders: JsonField<Int>) = apply {
            this.num36MhzEquivalentTransponders = num36MhzEquivalentTransponders
        }

        /** Comm numOperationalTransponders. */
        fun numOperationalTransponders(numOperationalTransponders: Int) =
            numOperationalTransponders(JsonField.of(numOperationalTransponders))

        /**
         * Sets [Builder.numOperationalTransponders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numOperationalTransponders] with a well-typed [Int]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun numOperationalTransponders(numOperationalTransponders: JsonField<Int>) = apply {
            this.numOperationalTransponders = numOperationalTransponders
        }

        /** Comm numSpareTransponders. */
        fun numSpareTransponders(numSpareTransponders: Int) =
            numSpareTransponders(JsonField.of(numSpareTransponders))

        /**
         * Sets [Builder.numSpareTransponders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numSpareTransponders] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numSpareTransponders(numSpareTransponders: JsonField<Int>) = apply {
            this.numSpareTransponders = numSpareTransponders
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

        /** Payload notes. */
        fun payloadNotes(payloadNotes: String) = payloadNotes(JsonField.of(payloadNotes))

        /**
         * Sets [Builder.payloadNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payloadNotes(payloadNotes: JsonField<String>) = apply {
            this.payloadNotes = payloadNotes
        }

        /** Comm polarization. */
        fun polarization(polarization: String) = polarization(JsonField.of(polarization))

        /**
         * Sets [Builder.polarization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarization] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun polarization(polarization: JsonField<String>) = apply {
            this.polarization = polarization
        }

        /** Solid state power amplifier, in Watts. */
        fun solidStatePowerAmp(solidStatePowerAmp: Double) =
            solidStatePowerAmp(JsonField.of(solidStatePowerAmp))

        /**
         * Sets [Builder.solidStatePowerAmp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solidStatePowerAmp] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun solidStatePowerAmp(solidStatePowerAmp: JsonField<Double>) = apply {
            this.solidStatePowerAmp = solidStatePowerAmp
        }

        /** Seradata ID of the spacecraft (SeradataSpacecraftDetails ID). */
        fun spacecraftId(spacecraftId: String) = spacecraftId(JsonField.of(spacecraftId))

        /**
         * Sets [Builder.spacecraftId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spacecraftId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spacecraftId(spacecraftId: JsonField<String>) = apply {
            this.spacecraftId = spacecraftId
        }

        /** Comm tradeLeaseOrgId. */
        fun tradeLeaseOrgId(tradeLeaseOrgId: String) =
            tradeLeaseOrgId(JsonField.of(tradeLeaseOrgId))

        /**
         * Sets [Builder.tradeLeaseOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tradeLeaseOrgId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tradeLeaseOrgId(tradeLeaseOrgId: JsonField<String>) = apply {
            this.tradeLeaseOrgId = tradeLeaseOrgId
        }

        /** Comm travelingWaveTubeAmplifier in Watts. */
        fun travelingWaveTubeAmplifier(travelingWaveTubeAmplifier: Double) =
            travelingWaveTubeAmplifier(JsonField.of(travelingWaveTubeAmplifier))

        /**
         * Sets [Builder.travelingWaveTubeAmplifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.travelingWaveTubeAmplifier] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun travelingWaveTubeAmplifier(travelingWaveTubeAmplifier: JsonField<Double>) = apply {
            this.travelingWaveTubeAmplifier = travelingWaveTubeAmplifier
        }

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

        /** Comm userDownlinkFrom in Ghz. */
        fun userDownlinkFrom(userDownlinkFrom: Double) =
            userDownlinkFrom(JsonField.of(userDownlinkFrom))

        /**
         * Sets [Builder.userDownlinkFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userDownlinkFrom] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userDownlinkFrom(userDownlinkFrom: JsonField<Double>) = apply {
            this.userDownlinkFrom = userDownlinkFrom
        }

        /** Comm userDownlinkTo in Ghz. */
        fun userDownlinkTo(userDownlinkTo: Double) = userDownlinkTo(JsonField.of(userDownlinkTo))

        /**
         * Sets [Builder.userDownlinkTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userDownlinkTo] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userDownlinkTo(userDownlinkTo: JsonField<Double>) = apply {
            this.userDownlinkTo = userDownlinkTo
        }

        /** Comm userUplinkFrom in Ghz. */
        fun userUplinkFrom(userUplinkFrom: Double) = userUplinkFrom(JsonField.of(userUplinkFrom))

        /**
         * Sets [Builder.userUplinkFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userUplinkFrom] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userUplinkFrom(userUplinkFrom: JsonField<Double>) = apply {
            this.userUplinkFrom = userUplinkFrom
        }

        /** Comm userUplinkTo in Ghz. */
        fun userUplinkTo(userUplinkTo: Double) = userUplinkTo(JsonField.of(userUplinkTo))

        /**
         * Sets [Builder.userUplinkTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userUplinkTo] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userUplinkTo(userUplinkTo: JsonField<Double>) = apply {
            this.userUplinkTo = userUplinkTo
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
         * Returns an immutable instance of [SeraDataCommDetailGetResponse].
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
        fun build(): SeraDataCommDetailGetResponse =
            SeraDataCommDetailGetResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                id,
                band,
                bandwidth,
                createdAt,
                createdBy,
                eirp,
                estHtsTotalCapacity,
                estHtsTotalUserDownlinkBandwidthPerBeam,
                estHtsTotalUserUplinkBandwidthPerBeam,
                gatewayDownlinkFrom,
                gatewayDownlinkTo,
                gatewayUplinkFrom,
                gatewayUplinkTo,
                hostedForCompanyOrgId,
                htsNumUserSpotBeams,
                htsUserDownlinkBandwidthPerBeam,
                htsUserUplinkBandwidthPerBeam,
                idComm,
                manufacturerOrgId,
                num36MhzEquivalentTransponders,
                numOperationalTransponders,
                numSpareTransponders,
                origin,
                origNetwork,
                payloadNotes,
                polarization,
                solidStatePowerAmp,
                spacecraftId,
                tradeLeaseOrgId,
                travelingWaveTubeAmplifier,
                updatedAt,
                updatedBy,
                userDownlinkFrom,
                userDownlinkTo,
                userUplinkFrom,
                userUplinkTo,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SeraDataCommDetailGetResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        id()
        band()
        bandwidth()
        createdAt()
        createdBy()
        eirp()
        estHtsTotalCapacity()
        estHtsTotalUserDownlinkBandwidthPerBeam()
        estHtsTotalUserUplinkBandwidthPerBeam()
        gatewayDownlinkFrom()
        gatewayDownlinkTo()
        gatewayUplinkFrom()
        gatewayUplinkTo()
        hostedForCompanyOrgId()
        htsNumUserSpotBeams()
        htsUserDownlinkBandwidthPerBeam()
        htsUserUplinkBandwidthPerBeam()
        idComm()
        manufacturerOrgId()
        num36MhzEquivalentTransponders()
        numOperationalTransponders()
        numSpareTransponders()
        origin()
        origNetwork()
        payloadNotes()
        polarization()
        solidStatePowerAmp()
        spacecraftId()
        tradeLeaseOrgId()
        travelingWaveTubeAmplifier()
        updatedAt()
        updatedBy()
        userDownlinkFrom()
        userDownlinkTo()
        userUplinkFrom()
        userUplinkTo()
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
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (band.asKnown().isPresent) 1 else 0) +
            (if (bandwidth.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (eirp.asKnown().isPresent) 1 else 0) +
            (if (estHtsTotalCapacity.asKnown().isPresent) 1 else 0) +
            (if (estHtsTotalUserDownlinkBandwidthPerBeam.asKnown().isPresent) 1 else 0) +
            (if (estHtsTotalUserUplinkBandwidthPerBeam.asKnown().isPresent) 1 else 0) +
            (if (gatewayDownlinkFrom.asKnown().isPresent) 1 else 0) +
            (if (gatewayDownlinkTo.asKnown().isPresent) 1 else 0) +
            (if (gatewayUplinkFrom.asKnown().isPresent) 1 else 0) +
            (if (gatewayUplinkTo.asKnown().isPresent) 1 else 0) +
            (if (hostedForCompanyOrgId.asKnown().isPresent) 1 else 0) +
            (if (htsNumUserSpotBeams.asKnown().isPresent) 1 else 0) +
            (if (htsUserDownlinkBandwidthPerBeam.asKnown().isPresent) 1 else 0) +
            (if (htsUserUplinkBandwidthPerBeam.asKnown().isPresent) 1 else 0) +
            (if (idComm.asKnown().isPresent) 1 else 0) +
            (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) +
            (if (num36MhzEquivalentTransponders.asKnown().isPresent) 1 else 0) +
            (if (numOperationalTransponders.asKnown().isPresent) 1 else 0) +
            (if (numSpareTransponders.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (payloadNotes.asKnown().isPresent) 1 else 0) +
            (if (polarization.asKnown().isPresent) 1 else 0) +
            (if (solidStatePowerAmp.asKnown().isPresent) 1 else 0) +
            (if (spacecraftId.asKnown().isPresent) 1 else 0) +
            (if (tradeLeaseOrgId.asKnown().isPresent) 1 else 0) +
            (if (travelingWaveTubeAmplifier.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (userDownlinkFrom.asKnown().isPresent) 1 else 0) +
            (if (userDownlinkTo.asKnown().isPresent) 1 else 0) +
            (if (userUplinkFrom.asKnown().isPresent) 1 else 0) +
            (if (userUplinkTo.asKnown().isPresent) 1 else 0)

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

        return other is SeraDataCommDetailGetResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            id == other.id &&
            band == other.band &&
            bandwidth == other.bandwidth &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            eirp == other.eirp &&
            estHtsTotalCapacity == other.estHtsTotalCapacity &&
            estHtsTotalUserDownlinkBandwidthPerBeam ==
                other.estHtsTotalUserDownlinkBandwidthPerBeam &&
            estHtsTotalUserUplinkBandwidthPerBeam == other.estHtsTotalUserUplinkBandwidthPerBeam &&
            gatewayDownlinkFrom == other.gatewayDownlinkFrom &&
            gatewayDownlinkTo == other.gatewayDownlinkTo &&
            gatewayUplinkFrom == other.gatewayUplinkFrom &&
            gatewayUplinkTo == other.gatewayUplinkTo &&
            hostedForCompanyOrgId == other.hostedForCompanyOrgId &&
            htsNumUserSpotBeams == other.htsNumUserSpotBeams &&
            htsUserDownlinkBandwidthPerBeam == other.htsUserDownlinkBandwidthPerBeam &&
            htsUserUplinkBandwidthPerBeam == other.htsUserUplinkBandwidthPerBeam &&
            idComm == other.idComm &&
            manufacturerOrgId == other.manufacturerOrgId &&
            num36MhzEquivalentTransponders == other.num36MhzEquivalentTransponders &&
            numOperationalTransponders == other.numOperationalTransponders &&
            numSpareTransponders == other.numSpareTransponders &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            payloadNotes == other.payloadNotes &&
            polarization == other.polarization &&
            solidStatePowerAmp == other.solidStatePowerAmp &&
            spacecraftId == other.spacecraftId &&
            tradeLeaseOrgId == other.tradeLeaseOrgId &&
            travelingWaveTubeAmplifier == other.travelingWaveTubeAmplifier &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            userDownlinkFrom == other.userDownlinkFrom &&
            userDownlinkTo == other.userDownlinkTo &&
            userUplinkFrom == other.userUplinkFrom &&
            userUplinkTo == other.userUplinkTo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            source,
            id,
            band,
            bandwidth,
            createdAt,
            createdBy,
            eirp,
            estHtsTotalCapacity,
            estHtsTotalUserDownlinkBandwidthPerBeam,
            estHtsTotalUserUplinkBandwidthPerBeam,
            gatewayDownlinkFrom,
            gatewayDownlinkTo,
            gatewayUplinkFrom,
            gatewayUplinkTo,
            hostedForCompanyOrgId,
            htsNumUserSpotBeams,
            htsUserDownlinkBandwidthPerBeam,
            htsUserUplinkBandwidthPerBeam,
            idComm,
            manufacturerOrgId,
            num36MhzEquivalentTransponders,
            numOperationalTransponders,
            numSpareTransponders,
            origin,
            origNetwork,
            payloadNotes,
            polarization,
            solidStatePowerAmp,
            spacecraftId,
            tradeLeaseOrgId,
            travelingWaveTubeAmplifier,
            updatedAt,
            updatedBy,
            userDownlinkFrom,
            userDownlinkTo,
            userUplinkFrom,
            userUplinkTo,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SeraDataCommDetailGetResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, id=$id, band=$band, bandwidth=$bandwidth, createdAt=$createdAt, createdBy=$createdBy, eirp=$eirp, estHtsTotalCapacity=$estHtsTotalCapacity, estHtsTotalUserDownlinkBandwidthPerBeam=$estHtsTotalUserDownlinkBandwidthPerBeam, estHtsTotalUserUplinkBandwidthPerBeam=$estHtsTotalUserUplinkBandwidthPerBeam, gatewayDownlinkFrom=$gatewayDownlinkFrom, gatewayDownlinkTo=$gatewayDownlinkTo, gatewayUplinkFrom=$gatewayUplinkFrom, gatewayUplinkTo=$gatewayUplinkTo, hostedForCompanyOrgId=$hostedForCompanyOrgId, htsNumUserSpotBeams=$htsNumUserSpotBeams, htsUserDownlinkBandwidthPerBeam=$htsUserDownlinkBandwidthPerBeam, htsUserUplinkBandwidthPerBeam=$htsUserUplinkBandwidthPerBeam, idComm=$idComm, manufacturerOrgId=$manufacturerOrgId, num36MhzEquivalentTransponders=$num36MhzEquivalentTransponders, numOperationalTransponders=$numOperationalTransponders, numSpareTransponders=$numSpareTransponders, origin=$origin, origNetwork=$origNetwork, payloadNotes=$payloadNotes, polarization=$polarization, solidStatePowerAmp=$solidStatePowerAmp, spacecraftId=$spacecraftId, tradeLeaseOrgId=$tradeLeaseOrgId, travelingWaveTubeAmplifier=$travelingWaveTubeAmplifier, updatedAt=$updatedAt, updatedBy=$updatedBy, userDownlinkFrom=$userDownlinkFrom, userDownlinkTo=$userDownlinkTo, userUplinkFrom=$userUplinkFrom, userUplinkTo=$userUplinkTo, additionalProperties=$additionalProperties}"
}

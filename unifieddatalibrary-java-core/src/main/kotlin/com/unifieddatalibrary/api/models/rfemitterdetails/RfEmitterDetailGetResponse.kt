// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitterdetails

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
import com.unifieddatalibrary.api.models.LocationFull
import com.unifieddatalibrary.api.models.OrganizationFull
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailGetResponse
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Details for a particular RF Emitter, collected by a particular source. An RF Emitter may have multiple details records from various sources. */
class RfEmitterDetailGetResponse private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idRfEmitter: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val alternateFacilityName: JsonField<String>,
    private val altName: JsonField<String>,
    private val antennaDiameter: JsonField<Double>,
    private val antennaSize: JsonField<List<Double>>,
    private val barrageNoiseBandwidth: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val description: JsonField<String>,
    private val designator: JsonField<String>,
    private val dopplerNoise: JsonField<Double>,
    private val drfmInstantaneousBandwidth: JsonField<Double>,
    private val family: JsonField<String>,
    private val manufacturerOrg: JsonField<OrganizationFull>,
    private val manufacturerOrgId: JsonField<String>,
    private val notes: JsonField<String>,
    private val numBits: JsonField<Int>,
    private val numChannels: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val productionFacilityLocation: JsonField<LocationFull>,
    private val productionFacilityLocationId: JsonField<String>,
    private val productionFacilityName: JsonField<String>,
    private val receiverBandwidth: JsonField<Double>,
    private val receiverSensitivity: JsonField<Double>,
    private val receiverType: JsonField<String>,
    private val secondaryNotes: JsonField<String>,
    private val systemSensitivityEnd: JsonField<Double>,
    private val systemSensitivityStart: JsonField<Double>,
    private val transmitPower: JsonField<Double>,
    private val transmitterBandwidth: JsonField<Double>,
    private val transmitterFrequency: JsonField<Double>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val urls: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking") @ExcludeMissing classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idRFEmitter") @ExcludeMissing idRfEmitter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alternateFacilityName") @ExcludeMissing alternateFacilityName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altName") @ExcludeMissing altName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("antennaDiameter") @ExcludeMissing antennaDiameter: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("antennaSize") @ExcludeMissing antennaSize: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("barrageNoiseBandwidth") @ExcludeMissing barrageNoiseBandwidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description") @ExcludeMissing description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("designator") @ExcludeMissing designator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dopplerNoise") @ExcludeMissing dopplerNoise: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("drfmInstantaneousBandwidth") @ExcludeMissing drfmInstantaneousBandwidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("family") @ExcludeMissing family: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manufacturerOrg") @ExcludeMissing manufacturerOrg: JsonField<OrganizationFull> = JsonMissing.of(),
        @JsonProperty("manufacturerOrgId") @ExcludeMissing manufacturerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numBits") @ExcludeMissing numBits: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numChannels") @ExcludeMissing numChannels: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork") @ExcludeMissing origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productionFacilityLocation") @ExcludeMissing productionFacilityLocation: JsonField<LocationFull> = JsonMissing.of(),
        @JsonProperty("productionFacilityLocationId") @ExcludeMissing productionFacilityLocationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productionFacilityName") @ExcludeMissing productionFacilityName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiverBandwidth") @ExcludeMissing receiverBandwidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("receiverSensitivity") @ExcludeMissing receiverSensitivity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("receiverType") @ExcludeMissing receiverType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secondaryNotes") @ExcludeMissing secondaryNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("systemSensitivityEnd") @ExcludeMissing systemSensitivityEnd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("systemSensitivityStart") @ExcludeMissing systemSensitivityStart: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("transmitPower") @ExcludeMissing transmitPower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("transmitterBandwidth") @ExcludeMissing transmitterBandwidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("transmitterFrequency") @ExcludeMissing transmitterFrequency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("urls") @ExcludeMissing urls: JsonField<List<String>> = JsonMissing.of()
    ) : this(
      classificationMarking,
      dataMode,
      idRfEmitter,
      source,
      id,
      alternateFacilityName,
      altName,
      antennaDiameter,
      antennaSize,
      barrageNoiseBandwidth,
      createdAt,
      createdBy,
      description,
      designator,
      dopplerNoise,
      drfmInstantaneousBandwidth,
      family,
      manufacturerOrg,
      manufacturerOrgId,
      notes,
      numBits,
      numChannels,
      origin,
      origNetwork,
      productionFacilityLocation,
      productionFacilityLocationId,
      productionFacilityName,
      receiverBandwidth,
      receiverSensitivity,
      receiverType,
      secondaryNotes,
      systemSensitivityEnd,
      systemSensitivityStart,
      transmitPower,
      transmitterBandwidth,
      transmitterFrequency,
      updatedAt,
      updatedBy,
      urls,
      mutableMapOf(),
    )

    /**
     * Classification marking of the data in IC/CAPCO Portion-marked format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

    /**
     * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * Unique identifier of the parent RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idRfEmitter(): String = idRfEmitter.getRequired("idRFEmitter")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Alternate facility name for this RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun alternateFacilityName(): Optional<String> = alternateFacilityName.getOptional("alternateFacilityName")

    /**
     * Optional alternate name or alias for this RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun altName(): Optional<String> = altName.getOptional("altName")

    /**
     * For parabolic/dish antennas, the diameter of the antenna in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun antennaDiameter(): Optional<Double> = antennaDiameter.getOptional("antennaDiameter")

    /**
     * Array with 1-2 values specifying the length and width (for rectangular) and just length for dipole antennas in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun antennaSize(): Optional<List<Double>> = antennaSize.getOptional("antennaSize")

    /**
     * Barrage noise bandwidth in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun barrageNoiseBandwidth(): Optional<Double> = barrageNoiseBandwidth.getOptional("barrageNoiseBandwidth")

    /**
     * Time the row was created in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Application user who created the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * Detailed description of the RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Designator of this RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun designator(): Optional<String> = designator.getOptional("designator")

    /**
     * Doppler noise value in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun dopplerNoise(): Optional<Double> = dopplerNoise.getOptional("dopplerNoise")

    /**
     * Digital Form Radio Memory instantaneous bandwidth in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun drfmInstantaneousBandwidth(): Optional<Double> = drfmInstantaneousBandwidth.getOptional("drfmInstantaneousBandwidth")

    /**
     * Family of this RF Emitter type.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun family(): Optional<String> = family.getOptional("family")

    /**
     * An organization such as a corporation, manufacturer, consortium, government, etc. An organization may have parent and child organizations as well as link to a former organization if this org previously existed as another organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun manufacturerOrg(): Optional<OrganizationFull> = manufacturerOrg.getOptional("manufacturerOrg")

    /**
     * Unique identifier of the organization which manufactures this RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun manufacturerOrgId(): Optional<String> = manufacturerOrgId.getOptional("manufacturerOrgId")

    /**
     * Notes on the RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * Number of bits.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun numBits(): Optional<Int> = numBits.getOptional("numBits")

    /**
     * Number of channels.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun numChannels(): Optional<Int> = numChannels.getOptional("numChannels")

    /**
     * Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun origin(): Optional<String> = origin.getOptional("origin")

    /**
     * The originating source network on which this record was created, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

    /**
     * Model representation of a location, which is a specific fixed point on the earth and is used to denote the locations of fixed sensors, operating units, etc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun productionFacilityLocation(): Optional<LocationFull> = productionFacilityLocation.getOptional("productionFacilityLocation")

    /**
     * Unique identifier of the location of the production facility for this RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun productionFacilityLocationId(): Optional<String> = productionFacilityLocationId.getOptional("productionFacilityLocationId")

    /**
     * Name of the production facility for this RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun productionFacilityName(): Optional<String> = productionFacilityName.getOptional("productionFacilityName")

    /**
     * Receiver bandwidth in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun receiverBandwidth(): Optional<Double> = receiverBandwidth.getOptional("receiverBandwidth")

    /**
     * Receiver sensitivity in dBm.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun receiverSensitivity(): Optional<Double> = receiverSensitivity.getOptional("receiverSensitivity")

    /**
     * Type or name of receiver.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun receiverType(): Optional<String> = receiverType.getOptional("receiverType")

    /**
     * Secondary notes on the RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun secondaryNotes(): Optional<String> = secondaryNotes.getOptional("secondaryNotes")

    /**
     * Receiver sensitivity is the lowest power level at which the receiver can detect an RF signal and demodulate data. Sensitivity is purely a receiver specification and is independent of the transmitter. End sensitivity range, in dBm.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun systemSensitivityEnd(): Optional<Double> = systemSensitivityEnd.getOptional("systemSensitivityEnd")

    /**
     * Receiver sensitivity is the lowest power level at which the receiver can detect an RF signal and demodulate data. Sensitivity is purely a receiver specification and is independent of the transmitter. Start sensitivity range, in dBm.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun systemSensitivityStart(): Optional<Double> = systemSensitivityStart.getOptional("systemSensitivityStart")

    /**
     * Transmit power in Watts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun transmitPower(): Optional<Double> = transmitPower.getOptional("transmitPower")

    /**
     * Transmitter bandwidth in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun transmitterBandwidth(): Optional<Double> = transmitterBandwidth.getOptional("transmitterBandwidth")

    /**
     * Transmitter frequency in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun transmitterFrequency(): Optional<Double> = transmitterFrequency.getOptional("transmitterFrequency")

    /**
     * Time the row was last updated in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Application user who updated the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

    /**
     * Array of URLs containing additional information on this RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun urls(): Optional<List<String>> = urls.getOptional("urls")

    /**
     * Returns the raw JSON value of [classificationMarking].
     *
     * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("classificationMarking")
    @ExcludeMissing
    fun _classificationMarking(): JsonField<String> = classificationMarking

    /**
     * Returns the raw JSON value of [dataMode].
     *
     * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataMode")
    @ExcludeMissing
    fun _dataMode(): JsonField<DataMode> = dataMode

    /**
     * Returns the raw JSON value of [idRfEmitter].
     *
     * Unlike [idRfEmitter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idRFEmitter")
    @ExcludeMissing
    fun _idRfEmitter(): JsonField<String> = idRfEmitter

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source")
    @ExcludeMissing
    fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [alternateFacilityName].
     *
     * Unlike [alternateFacilityName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alternateFacilityName")
    @ExcludeMissing
    fun _alternateFacilityName(): JsonField<String> = alternateFacilityName

    /**
     * Returns the raw JSON value of [altName].
     *
     * Unlike [altName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altName")
    @ExcludeMissing
    fun _altName(): JsonField<String> = altName

    /**
     * Returns the raw JSON value of [antennaDiameter].
     *
     * Unlike [antennaDiameter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("antennaDiameter")
    @ExcludeMissing
    fun _antennaDiameter(): JsonField<Double> = antennaDiameter

    /**
     * Returns the raw JSON value of [antennaSize].
     *
     * Unlike [antennaSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("antennaSize")
    @ExcludeMissing
    fun _antennaSize(): JsonField<List<Double>> = antennaSize

    /**
     * Returns the raw JSON value of [barrageNoiseBandwidth].
     *
     * Unlike [barrageNoiseBandwidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("barrageNoiseBandwidth")
    @ExcludeMissing
    fun _barrageNoiseBandwidth(): JsonField<Double> = barrageNoiseBandwidth

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
    @JsonProperty("createdBy")
    @ExcludeMissing
    fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description")
    @ExcludeMissing
    fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [designator].
     *
     * Unlike [designator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("designator")
    @ExcludeMissing
    fun _designator(): JsonField<String> = designator

    /**
     * Returns the raw JSON value of [dopplerNoise].
     *
     * Unlike [dopplerNoise], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dopplerNoise")
    @ExcludeMissing
    fun _dopplerNoise(): JsonField<Double> = dopplerNoise

    /**
     * Returns the raw JSON value of [drfmInstantaneousBandwidth].
     *
     * Unlike [drfmInstantaneousBandwidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("drfmInstantaneousBandwidth")
    @ExcludeMissing
    fun _drfmInstantaneousBandwidth(): JsonField<Double> = drfmInstantaneousBandwidth

    /**
     * Returns the raw JSON value of [family].
     *
     * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("family")
    @ExcludeMissing
    fun _family(): JsonField<String> = family

    /**
     * Returns the raw JSON value of [manufacturerOrg].
     *
     * Unlike [manufacturerOrg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manufacturerOrg")
    @ExcludeMissing
    fun _manufacturerOrg(): JsonField<OrganizationFull> = manufacturerOrg

    /**
     * Returns the raw JSON value of [manufacturerOrgId].
     *
     * Unlike [manufacturerOrgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manufacturerOrgId")
    @ExcludeMissing
    fun _manufacturerOrgId(): JsonField<String> = manufacturerOrgId

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes")
    @ExcludeMissing
    fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [numBits].
     *
     * Unlike [numBits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numBits")
    @ExcludeMissing
    fun _numBits(): JsonField<Int> = numBits

    /**
     * Returns the raw JSON value of [numChannels].
     *
     * Unlike [numChannels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numChannels")
    @ExcludeMissing
    fun _numChannels(): JsonField<Int> = numChannels

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin")
    @ExcludeMissing
    fun _origin(): JsonField<String> = origin

    /**
     * Returns the raw JSON value of [origNetwork].
     *
     * Unlike [origNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origNetwork")
    @ExcludeMissing
    fun _origNetwork(): JsonField<String> = origNetwork

    /**
     * Returns the raw JSON value of [productionFacilityLocation].
     *
     * Unlike [productionFacilityLocation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("productionFacilityLocation")
    @ExcludeMissing
    fun _productionFacilityLocation(): JsonField<LocationFull> = productionFacilityLocation

    /**
     * Returns the raw JSON value of [productionFacilityLocationId].
     *
     * Unlike [productionFacilityLocationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("productionFacilityLocationId")
    @ExcludeMissing
    fun _productionFacilityLocationId(): JsonField<String> = productionFacilityLocationId

    /**
     * Returns the raw JSON value of [productionFacilityName].
     *
     * Unlike [productionFacilityName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("productionFacilityName")
    @ExcludeMissing
    fun _productionFacilityName(): JsonField<String> = productionFacilityName

    /**
     * Returns the raw JSON value of [receiverBandwidth].
     *
     * Unlike [receiverBandwidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receiverBandwidth")
    @ExcludeMissing
    fun _receiverBandwidth(): JsonField<Double> = receiverBandwidth

    /**
     * Returns the raw JSON value of [receiverSensitivity].
     *
     * Unlike [receiverSensitivity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receiverSensitivity")
    @ExcludeMissing
    fun _receiverSensitivity(): JsonField<Double> = receiverSensitivity

    /**
     * Returns the raw JSON value of [receiverType].
     *
     * Unlike [receiverType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receiverType")
    @ExcludeMissing
    fun _receiverType(): JsonField<String> = receiverType

    /**
     * Returns the raw JSON value of [secondaryNotes].
     *
     * Unlike [secondaryNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secondaryNotes")
    @ExcludeMissing
    fun _secondaryNotes(): JsonField<String> = secondaryNotes

    /**
     * Returns the raw JSON value of [systemSensitivityEnd].
     *
     * Unlike [systemSensitivityEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("systemSensitivityEnd")
    @ExcludeMissing
    fun _systemSensitivityEnd(): JsonField<Double> = systemSensitivityEnd

    /**
     * Returns the raw JSON value of [systemSensitivityStart].
     *
     * Unlike [systemSensitivityStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("systemSensitivityStart")
    @ExcludeMissing
    fun _systemSensitivityStart(): JsonField<Double> = systemSensitivityStart

    /**
     * Returns the raw JSON value of [transmitPower].
     *
     * Unlike [transmitPower], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transmitPower")
    @ExcludeMissing
    fun _transmitPower(): JsonField<Double> = transmitPower

    /**
     * Returns the raw JSON value of [transmitterBandwidth].
     *
     * Unlike [transmitterBandwidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transmitterBandwidth")
    @ExcludeMissing
    fun _transmitterBandwidth(): JsonField<Double> = transmitterBandwidth

    /**
     * Returns the raw JSON value of [transmitterFrequency].
     *
     * Unlike [transmitterFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transmitterFrequency")
    @ExcludeMissing
    fun _transmitterFrequency(): JsonField<Double> = transmitterFrequency

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
    @JsonProperty("updatedBy")
    @ExcludeMissing
    fun _updatedBy(): JsonField<String> = updatedBy

    /**
     * Returns the raw JSON value of [urls].
     *
     * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("urls")
    @ExcludeMissing
    fun _urls(): JsonField<List<String>> = urls

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
      additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RfEmitterDetailGetResponse].
         *
         * The following fields are required:
         *
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idRfEmitter()
         * .source()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [RfEmitterDetailGetResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idRfEmitter: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var alternateFacilityName: JsonField<String> = JsonMissing.of()
        private var altName: JsonField<String> = JsonMissing.of()
        private var antennaDiameter: JsonField<Double> = JsonMissing.of()
        private var antennaSize: JsonField<MutableList<Double>>? = null
        private var barrageNoiseBandwidth: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var designator: JsonField<String> = JsonMissing.of()
        private var dopplerNoise: JsonField<Double> = JsonMissing.of()
        private var drfmInstantaneousBandwidth: JsonField<Double> = JsonMissing.of()
        private var family: JsonField<String> = JsonMissing.of()
        private var manufacturerOrg: JsonField<OrganizationFull> = JsonMissing.of()
        private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var numBits: JsonField<Int> = JsonMissing.of()
        private var numChannels: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var productionFacilityLocation: JsonField<LocationFull> = JsonMissing.of()
        private var productionFacilityLocationId: JsonField<String> = JsonMissing.of()
        private var productionFacilityName: JsonField<String> = JsonMissing.of()
        private var receiverBandwidth: JsonField<Double> = JsonMissing.of()
        private var receiverSensitivity: JsonField<Double> = JsonMissing.of()
        private var receiverType: JsonField<String> = JsonMissing.of()
        private var secondaryNotes: JsonField<String> = JsonMissing.of()
        private var systemSensitivityEnd: JsonField<Double> = JsonMissing.of()
        private var systemSensitivityStart: JsonField<Double> = JsonMissing.of()
        private var transmitPower: JsonField<Double> = JsonMissing.of()
        private var transmitterBandwidth: JsonField<Double> = JsonMissing.of()
        private var transmitterFrequency: JsonField<Double> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var urls: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rfEmitterDetailGetResponse: RfEmitterDetailGetResponse) =
            apply {
                classificationMarking = rfEmitterDetailGetResponse.classificationMarking
                dataMode = rfEmitterDetailGetResponse.dataMode
                idRfEmitter = rfEmitterDetailGetResponse.idRfEmitter
                source = rfEmitterDetailGetResponse.source
                id = rfEmitterDetailGetResponse.id
                alternateFacilityName = rfEmitterDetailGetResponse.alternateFacilityName
                altName = rfEmitterDetailGetResponse.altName
                antennaDiameter = rfEmitterDetailGetResponse.antennaDiameter
                antennaSize = rfEmitterDetailGetResponse.antennaSize.map { it.toMutableList() }
                barrageNoiseBandwidth = rfEmitterDetailGetResponse.barrageNoiseBandwidth
                createdAt = rfEmitterDetailGetResponse.createdAt
                createdBy = rfEmitterDetailGetResponse.createdBy
                description = rfEmitterDetailGetResponse.description
                designator = rfEmitterDetailGetResponse.designator
                dopplerNoise = rfEmitterDetailGetResponse.dopplerNoise
                drfmInstantaneousBandwidth = rfEmitterDetailGetResponse.drfmInstantaneousBandwidth
                family = rfEmitterDetailGetResponse.family
                manufacturerOrg = rfEmitterDetailGetResponse.manufacturerOrg
                manufacturerOrgId = rfEmitterDetailGetResponse.manufacturerOrgId
                notes = rfEmitterDetailGetResponse.notes
                numBits = rfEmitterDetailGetResponse.numBits
                numChannels = rfEmitterDetailGetResponse.numChannels
                origin = rfEmitterDetailGetResponse.origin
                origNetwork = rfEmitterDetailGetResponse.origNetwork
                productionFacilityLocation = rfEmitterDetailGetResponse.productionFacilityLocation
                productionFacilityLocationId = rfEmitterDetailGetResponse.productionFacilityLocationId
                productionFacilityName = rfEmitterDetailGetResponse.productionFacilityName
                receiverBandwidth = rfEmitterDetailGetResponse.receiverBandwidth
                receiverSensitivity = rfEmitterDetailGetResponse.receiverSensitivity
                receiverType = rfEmitterDetailGetResponse.receiverType
                secondaryNotes = rfEmitterDetailGetResponse.secondaryNotes
                systemSensitivityEnd = rfEmitterDetailGetResponse.systemSensitivityEnd
                systemSensitivityStart = rfEmitterDetailGetResponse.systemSensitivityStart
                transmitPower = rfEmitterDetailGetResponse.transmitPower
                transmitterBandwidth = rfEmitterDetailGetResponse.transmitterBandwidth
                transmitterFrequency = rfEmitterDetailGetResponse.transmitterFrequency
                updatedAt = rfEmitterDetailGetResponse.updatedAt
                updatedBy = rfEmitterDetailGetResponse.updatedBy
                urls = rfEmitterDetailGetResponse.urls.map { it.toMutableList() }
                additionalProperties = rfEmitterDetailGetResponse.additionalProperties.toMutableMap()
            }

        /** Classification marking of the data in IC/CAPCO Portion-marked format. */
        fun classificationMarking(classificationMarking: String) = classificationMarking(JsonField.of(classificationMarking))

        /**
         * Sets [Builder.classificationMarking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classificationMarking] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun classificationMarking(classificationMarking: JsonField<String>) =
            apply {
                this.classificationMarking = classificationMarking
            }

        /**
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
         */
        fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

        /**
         * Sets [Builder.dataMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataMode] with a well-typed [DataMode] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataMode(dataMode: JsonField<DataMode>) =
            apply {
                this.dataMode = dataMode
            }

        /** Unique identifier of the parent RF Emitter. */
        fun idRfEmitter(idRfEmitter: String) = idRfEmitter(JsonField.of(idRfEmitter))

        /**
         * Sets [Builder.idRfEmitter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idRfEmitter] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idRfEmitter(idRfEmitter: JsonField<String>) =
            apply {
                this.idRfEmitter = idRfEmitter
            }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun source(source: JsonField<String>) =
            apply {
                this.source = source
            }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        /** Alternate facility name for this RF Emitter. */
        fun alternateFacilityName(alternateFacilityName: String) = alternateFacilityName(JsonField.of(alternateFacilityName))

        /**
         * Sets [Builder.alternateFacilityName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alternateFacilityName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun alternateFacilityName(alternateFacilityName: JsonField<String>) =
            apply {
                this.alternateFacilityName = alternateFacilityName
            }

        /** Optional alternate name or alias for this RF Emitter. */
        fun altName(altName: String) = altName(JsonField.of(altName))

        /**
         * Sets [Builder.altName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun altName(altName: JsonField<String>) =
            apply {
                this.altName = altName
            }

        /** For parabolic/dish antennas, the diameter of the antenna in meters. */
        fun antennaDiameter(antennaDiameter: Double) = antennaDiameter(JsonField.of(antennaDiameter))

        /**
         * Sets [Builder.antennaDiameter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.antennaDiameter] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun antennaDiameter(antennaDiameter: JsonField<Double>) =
            apply {
                this.antennaDiameter = antennaDiameter
            }

        /** Array with 1-2 values specifying the length and width (for rectangular) and just length for dipole antennas in meters. */
        fun antennaSize(antennaSize: List<Double>) = antennaSize(JsonField.of(antennaSize))

        /**
         * Sets [Builder.antennaSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.antennaSize] with a well-typed `List<Double>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun antennaSize(antennaSize: JsonField<List<Double>>) =
            apply {
                this.antennaSize = antennaSize.map { it.toMutableList() }
            }

        /**
         * Adds a single [Double] to [Builder.antennaSize].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAntennaSize(antennaSize: Double) =
            apply {
                this.antennaSize = (this.antennaSize ?: JsonField.of(mutableListOf())).also {
                    checkKnown("antennaSize", it).add(antennaSize)
                }
            }

        /** Barrage noise bandwidth in Mhz. */
        fun barrageNoiseBandwidth(barrageNoiseBandwidth: Double) = barrageNoiseBandwidth(JsonField.of(barrageNoiseBandwidth))

        /**
         * Sets [Builder.barrageNoiseBandwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.barrageNoiseBandwidth] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun barrageNoiseBandwidth(barrageNoiseBandwidth: JsonField<Double>) =
            apply {
                this.barrageNoiseBandwidth = barrageNoiseBandwidth
            }

        /** Time the row was created in the database, auto-populated by the system. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply {
                this.createdAt = createdAt
            }

        /** Application user who created the row in the database, auto-populated by the system. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdBy(createdBy: JsonField<String>) =
            apply {
                this.createdBy = createdBy
            }

        /** Detailed description of the RF Emitter. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun description(description: JsonField<String>) =
            apply {
                this.description = description
            }

        /** Designator of this RF Emitter. */
        fun designator(designator: String) = designator(JsonField.of(designator))

        /**
         * Sets [Builder.designator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.designator] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun designator(designator: JsonField<String>) =
            apply {
                this.designator = designator
            }

        /** Doppler noise value in Mhz. */
        fun dopplerNoise(dopplerNoise: Double) = dopplerNoise(JsonField.of(dopplerNoise))

        /**
         * Sets [Builder.dopplerNoise] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dopplerNoise] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dopplerNoise(dopplerNoise: JsonField<Double>) =
            apply {
                this.dopplerNoise = dopplerNoise
            }

        /** Digital Form Radio Memory instantaneous bandwidth in Mhz. */
        fun drfmInstantaneousBandwidth(drfmInstantaneousBandwidth: Double) = drfmInstantaneousBandwidth(JsonField.of(drfmInstantaneousBandwidth))

        /**
         * Sets [Builder.drfmInstantaneousBandwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.drfmInstantaneousBandwidth] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun drfmInstantaneousBandwidth(drfmInstantaneousBandwidth: JsonField<Double>) =
            apply {
                this.drfmInstantaneousBandwidth = drfmInstantaneousBandwidth
            }

        /** Family of this RF Emitter type. */
        fun family(family: String) = family(JsonField.of(family))

        /**
         * Sets [Builder.family] to an arbitrary JSON value.
         *
         * You should usually call [Builder.family] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun family(family: JsonField<String>) =
            apply {
                this.family = family
            }

        /** An organization such as a corporation, manufacturer, consortium, government, etc. An organization may have parent and child organizations as well as link to a former organization if this org previously existed as another organization. */
        fun manufacturerOrg(manufacturerOrg: OrganizationFull) = manufacturerOrg(JsonField.of(manufacturerOrg))

        /**
         * Sets [Builder.manufacturerOrg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manufacturerOrg] with a well-typed [OrganizationFull] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun manufacturerOrg(manufacturerOrg: JsonField<OrganizationFull>) =
            apply {
                this.manufacturerOrg = manufacturerOrg
            }

        /** Unique identifier of the organization which manufactures this RF Emitter. */
        fun manufacturerOrgId(manufacturerOrgId: String) = manufacturerOrgId(JsonField.of(manufacturerOrgId))

        /**
         * Sets [Builder.manufacturerOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manufacturerOrgId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun manufacturerOrgId(manufacturerOrgId: JsonField<String>) =
            apply {
                this.manufacturerOrgId = manufacturerOrgId
            }

        /** Notes on the RF Emitter. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notes(notes: JsonField<String>) =
            apply {
                this.notes = notes
            }

        /** Number of bits. */
        fun numBits(numBits: Int) = numBits(JsonField.of(numBits))

        /**
         * Sets [Builder.numBits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numBits] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numBits(numBits: JsonField<Int>) =
            apply {
                this.numBits = numBits
            }

        /** Number of channels. */
        fun numChannels(numChannels: Int) = numChannels(JsonField.of(numChannels))

        /**
         * Sets [Builder.numChannels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numChannels] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numChannels(numChannels: JsonField<Int>) =
            apply {
                this.numChannels = numChannels
            }

        /** Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin. */
        fun origin(origin: String) = origin(JsonField.of(origin))

        /**
         * Sets [Builder.origin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origin] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun origin(origin: JsonField<String>) =
            apply {
                this.origin = origin
            }

        /** The originating source network on which this record was created, auto-populated by the system. */
        fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

        /**
         * Sets [Builder.origNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origNetwork] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun origNetwork(origNetwork: JsonField<String>) =
            apply {
                this.origNetwork = origNetwork
            }

        /** Model representation of a location, which is a specific fixed point on the earth and is used to denote the locations of fixed sensors, operating units, etc. */
        fun productionFacilityLocation(productionFacilityLocation: LocationFull) = productionFacilityLocation(JsonField.of(productionFacilityLocation))

        /**
         * Sets [Builder.productionFacilityLocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productionFacilityLocation] with a well-typed [LocationFull] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productionFacilityLocation(productionFacilityLocation: JsonField<LocationFull>) =
            apply {
                this.productionFacilityLocation = productionFacilityLocation
            }

        /** Unique identifier of the location of the production facility for this RF Emitter. */
        fun productionFacilityLocationId(productionFacilityLocationId: String) = productionFacilityLocationId(JsonField.of(productionFacilityLocationId))

        /**
         * Sets [Builder.productionFacilityLocationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productionFacilityLocationId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productionFacilityLocationId(productionFacilityLocationId: JsonField<String>) =
            apply {
                this.productionFacilityLocationId = productionFacilityLocationId
            }

        /** Name of the production facility for this RF Emitter. */
        fun productionFacilityName(productionFacilityName: String) = productionFacilityName(JsonField.of(productionFacilityName))

        /**
         * Sets [Builder.productionFacilityName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productionFacilityName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productionFacilityName(productionFacilityName: JsonField<String>) =
            apply {
                this.productionFacilityName = productionFacilityName
            }

        /** Receiver bandwidth in Mhz. */
        fun receiverBandwidth(receiverBandwidth: Double) = receiverBandwidth(JsonField.of(receiverBandwidth))

        /**
         * Sets [Builder.receiverBandwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiverBandwidth] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receiverBandwidth(receiverBandwidth: JsonField<Double>) =
            apply {
                this.receiverBandwidth = receiverBandwidth
            }

        /** Receiver sensitivity in dBm. */
        fun receiverSensitivity(receiverSensitivity: Double) = receiverSensitivity(JsonField.of(receiverSensitivity))

        /**
         * Sets [Builder.receiverSensitivity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiverSensitivity] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receiverSensitivity(receiverSensitivity: JsonField<Double>) =
            apply {
                this.receiverSensitivity = receiverSensitivity
            }

        /** Type or name of receiver. */
        fun receiverType(receiverType: String) = receiverType(JsonField.of(receiverType))

        /**
         * Sets [Builder.receiverType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiverType] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receiverType(receiverType: JsonField<String>) =
            apply {
                this.receiverType = receiverType
            }

        /** Secondary notes on the RF Emitter. */
        fun secondaryNotes(secondaryNotes: String) = secondaryNotes(JsonField.of(secondaryNotes))

        /**
         * Sets [Builder.secondaryNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryNotes] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryNotes(secondaryNotes: JsonField<String>) =
            apply {
                this.secondaryNotes = secondaryNotes
            }

        /** Receiver sensitivity is the lowest power level at which the receiver can detect an RF signal and demodulate data. Sensitivity is purely a receiver specification and is independent of the transmitter. End sensitivity range, in dBm. */
        fun systemSensitivityEnd(systemSensitivityEnd: Double) = systemSensitivityEnd(JsonField.of(systemSensitivityEnd))

        /**
         * Sets [Builder.systemSensitivityEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemSensitivityEnd] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun systemSensitivityEnd(systemSensitivityEnd: JsonField<Double>) =
            apply {
                this.systemSensitivityEnd = systemSensitivityEnd
            }

        /** Receiver sensitivity is the lowest power level at which the receiver can detect an RF signal and demodulate data. Sensitivity is purely a receiver specification and is independent of the transmitter. Start sensitivity range, in dBm. */
        fun systemSensitivityStart(systemSensitivityStart: Double) = systemSensitivityStart(JsonField.of(systemSensitivityStart))

        /**
         * Sets [Builder.systemSensitivityStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemSensitivityStart] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun systemSensitivityStart(systemSensitivityStart: JsonField<Double>) =
            apply {
                this.systemSensitivityStart = systemSensitivityStart
            }

        /** Transmit power in Watts. */
        fun transmitPower(transmitPower: Double) = transmitPower(JsonField.of(transmitPower))

        /**
         * Sets [Builder.transmitPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transmitPower] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transmitPower(transmitPower: JsonField<Double>) =
            apply {
                this.transmitPower = transmitPower
            }

        /** Transmitter bandwidth in Mhz. */
        fun transmitterBandwidth(transmitterBandwidth: Double) = transmitterBandwidth(JsonField.of(transmitterBandwidth))

        /**
         * Sets [Builder.transmitterBandwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transmitterBandwidth] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transmitterBandwidth(transmitterBandwidth: JsonField<Double>) =
            apply {
                this.transmitterBandwidth = transmitterBandwidth
            }

        /** Transmitter frequency in Mhz. */
        fun transmitterFrequency(transmitterFrequency: Double) = transmitterFrequency(JsonField.of(transmitterFrequency))

        /**
         * Sets [Builder.transmitterFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transmitterFrequency] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transmitterFrequency(transmitterFrequency: JsonField<Double>) =
            apply {
                this.transmitterFrequency = transmitterFrequency
            }

        /** Time the row was last updated in the database, auto-populated by the system. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) =
            apply {
                this.updatedAt = updatedAt
            }

        /** Application user who updated the row in the database, auto-populated by the system. */
        fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedBy(updatedBy: JsonField<String>) =
            apply {
                this.updatedBy = updatedBy
            }

        /** Array of URLs containing additional information on this RF Emitter. */
        fun urls(urls: List<String>) = urls(JsonField.of(urls))

        /**
         * Sets [Builder.urls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urls] with a well-typed `List<String>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun urls(urls: JsonField<List<String>>) =
            apply {
                this.urls = urls.map { it.toMutableList() }
            }

        /**
         * Adds a single [String] to [urls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUrl(url: String) =
            apply {
                urls = (urls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("urls", it).add(url)
                }
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        /**
         * Returns an immutable instance of [RfEmitterDetailGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idRfEmitter()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RfEmitterDetailGetResponse =
            RfEmitterDetailGetResponse(
              checkRequired(
                "classificationMarking", classificationMarking
              ),
              checkRequired(
                "dataMode", dataMode
              ),
              checkRequired(
                "idRfEmitter", idRfEmitter
              ),
              checkRequired(
                "source", source
              ),
              id,
              alternateFacilityName,
              altName,
              antennaDiameter,
              (antennaSize ?: JsonMissing.of()).map { it.toImmutable() },
              barrageNoiseBandwidth,
              createdAt,
              createdBy,
              description,
              designator,
              dopplerNoise,
              drfmInstantaneousBandwidth,
              family,
              manufacturerOrg,
              manufacturerOrgId,
              notes,
              numBits,
              numChannels,
              origin,
              origNetwork,
              productionFacilityLocation,
              productionFacilityLocationId,
              productionFacilityName,
              receiverBandwidth,
              receiverSensitivity,
              receiverType,
              secondaryNotes,
              systemSensitivityEnd,
              systemSensitivityStart,
              transmitPower,
              transmitterBandwidth,
              transmitterFrequency,
              updatedAt,
              updatedBy,
              (urls ?: JsonMissing.of()).map { it.toImmutable() },
              additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RfEmitterDetailGetResponse =
        apply {
            if (validated) {
              return@apply
            }

            classificationMarking()
            dataMode().validate()
            idRfEmitter()
            source()
            id()
            alternateFacilityName()
            altName()
            antennaDiameter()
            antennaSize()
            barrageNoiseBandwidth()
            createdAt()
            createdBy()
            description()
            designator()
            dopplerNoise()
            drfmInstantaneousBandwidth()
            family()
            manufacturerOrg().ifPresent { it.validate() }
            manufacturerOrgId()
            notes()
            numBits()
            numChannels()
            origin()
            origNetwork()
            productionFacilityLocation().ifPresent { it.validate() }
            productionFacilityLocationId()
            productionFacilityName()
            receiverBandwidth()
            receiverSensitivity()
            receiverType()
            secondaryNotes()
            systemSensitivityEnd()
            systemSensitivityStart()
            transmitPower()
            transmitterBandwidth()
            transmitterFrequency()
            updatedAt()
            updatedBy()
            urls()
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
    internal fun validity(): Int = (if (classificationMarking.asKnown().isPresent) 1 else 0) + (dataMode.asKnown().getOrNull()?.validity() ?: 0) + (if (idRfEmitter.asKnown().isPresent) 1 else 0) + (if (source.asKnown().isPresent) 1 else 0) + (if (id.asKnown().isPresent) 1 else 0) + (if (alternateFacilityName.asKnown().isPresent) 1 else 0) + (if (altName.asKnown().isPresent) 1 else 0) + (if (antennaDiameter.asKnown().isPresent) 1 else 0) + (antennaSize.asKnown().getOrNull()?.size ?: 0) + (if (barrageNoiseBandwidth.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (createdBy.asKnown().isPresent) 1 else 0) + (if (description.asKnown().isPresent) 1 else 0) + (if (designator.asKnown().isPresent) 1 else 0) + (if (dopplerNoise.asKnown().isPresent) 1 else 0) + (if (drfmInstantaneousBandwidth.asKnown().isPresent) 1 else 0) + (if (family.asKnown().isPresent) 1 else 0) + (manufacturerOrg.asKnown().getOrNull()?.validity() ?: 0) + (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) + (if (notes.asKnown().isPresent) 1 else 0) + (if (numBits.asKnown().isPresent) 1 else 0) + (if (numChannels.asKnown().isPresent) 1 else 0) + (if (origin.asKnown().isPresent) 1 else 0) + (if (origNetwork.asKnown().isPresent) 1 else 0) + (productionFacilityLocation.asKnown().getOrNull()?.validity() ?: 0) + (if (productionFacilityLocationId.asKnown().isPresent) 1 else 0) + (if (productionFacilityName.asKnown().isPresent) 1 else 0) + (if (receiverBandwidth.asKnown().isPresent) 1 else 0) + (if (receiverSensitivity.asKnown().isPresent) 1 else 0) + (if (receiverType.asKnown().isPresent) 1 else 0) + (if (secondaryNotes.asKnown().isPresent) 1 else 0) + (if (systemSensitivityEnd.asKnown().isPresent) 1 else 0) + (if (systemSensitivityStart.asKnown().isPresent) 1 else 0) + (if (transmitPower.asKnown().isPresent) 1 else 0) + (if (transmitterBandwidth.asKnown().isPresent) 1 else 0) + (if (transmitterFrequency.asKnown().isPresent) 1 else 0) + (if (updatedAt.asKnown().isPresent) 1 else 0) + (if (updatedBy.asKnown().isPresent) 1 else 0) + (urls.asKnown().getOrNull()?.size ?: 0)

    /**
     * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
     */
    class DataMode @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't match any known
         * member, and you want to know that value. For example, if the SDK is on an older version than the
         * API, then the API may respond with new members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

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
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
         *   an older version than the API, then the API may respond with new members that the SDK is unaware
         *   of.
         *
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
         * class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want to throw
         * for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
         * for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging and generally
         * doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not have the expected
         * primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { UnifieddatalibraryInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): DataMode =
            apply {
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
         * Returns a score indicating how many valid values are contained in this object recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is DataMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is RfEmitterDetailGetResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && idRfEmitter == other.idRfEmitter && source == other.source && id == other.id && alternateFacilityName == other.alternateFacilityName && altName == other.altName && antennaDiameter == other.antennaDiameter && antennaSize == other.antennaSize && barrageNoiseBandwidth == other.barrageNoiseBandwidth && createdAt == other.createdAt && createdBy == other.createdBy && description == other.description && designator == other.designator && dopplerNoise == other.dopplerNoise && drfmInstantaneousBandwidth == other.drfmInstantaneousBandwidth && family == other.family && manufacturerOrg == other.manufacturerOrg && manufacturerOrgId == other.manufacturerOrgId && notes == other.notes && numBits == other.numBits && numChannels == other.numChannels && origin == other.origin && origNetwork == other.origNetwork && productionFacilityLocation == other.productionFacilityLocation && productionFacilityLocationId == other.productionFacilityLocationId && productionFacilityName == other.productionFacilityName && receiverBandwidth == other.receiverBandwidth && receiverSensitivity == other.receiverSensitivity && receiverType == other.receiverType && secondaryNotes == other.secondaryNotes && systemSensitivityEnd == other.systemSensitivityEnd && systemSensitivityStart == other.systemSensitivityStart && transmitPower == other.transmitPower && transmitterBandwidth == other.transmitterBandwidth && transmitterFrequency == other.transmitterFrequency && updatedAt == other.updatedAt && updatedBy == other.updatedBy && urls == other.urls && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, idRfEmitter, source, id, alternateFacilityName, altName, antennaDiameter, antennaSize, barrageNoiseBandwidth, createdAt, createdBy, description, designator, dopplerNoise, drfmInstantaneousBandwidth, family, manufacturerOrg, manufacturerOrgId, notes, numBits, numChannels, origin, origNetwork, productionFacilityLocation, productionFacilityLocationId, productionFacilityName, receiverBandwidth, receiverSensitivity, receiverType, secondaryNotes, systemSensitivityEnd, systemSensitivityStart, transmitPower, transmitterBandwidth, transmitterFrequency, updatedAt, updatedBy, urls, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "RfEmitterDetailGetResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, idRfEmitter=$idRfEmitter, source=$source, id=$id, alternateFacilityName=$alternateFacilityName, altName=$altName, antennaDiameter=$antennaDiameter, antennaSize=$antennaSize, barrageNoiseBandwidth=$barrageNoiseBandwidth, createdAt=$createdAt, createdBy=$createdBy, description=$description, designator=$designator, dopplerNoise=$dopplerNoise, drfmInstantaneousBandwidth=$drfmInstantaneousBandwidth, family=$family, manufacturerOrg=$manufacturerOrg, manufacturerOrgId=$manufacturerOrgId, notes=$notes, numBits=$numBits, numChannels=$numChannels, origin=$origin, origNetwork=$origNetwork, productionFacilityLocation=$productionFacilityLocation, productionFacilityLocationId=$productionFacilityLocationId, productionFacilityName=$productionFacilityName, receiverBandwidth=$receiverBandwidth, receiverSensitivity=$receiverSensitivity, receiverType=$receiverType, secondaryNotes=$secondaryNotes, systemSensitivityEnd=$systemSensitivityEnd, systemSensitivityStart=$systemSensitivityStart, transmitPower=$transmitPower, transmitterBandwidth=$transmitterBandwidth, transmitterFrequency=$transmitterFrequency, updatedAt=$updatedAt, updatedBy=$updatedBy, urls=$urls, additionalProperties=$additionalProperties}"
}

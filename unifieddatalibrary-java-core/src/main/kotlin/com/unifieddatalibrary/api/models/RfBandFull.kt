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
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Details on a particular Radio Frequency (RF) band, also known as a carrier, which may be in use
 * by any type of Entity for communications or operations.
 */
class RfBandFull
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idEntity: JsonField<String>,
    private val name: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val band: JsonField<String>,
    private val bandwidth: JsonField<Double>,
    private val beamwidth: JsonField<Double>,
    private val centerFreq: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val edgeGain: JsonField<Double>,
    private val eirp: JsonField<Double>,
    private val erp: JsonField<Double>,
    private val freqMax: JsonField<Double>,
    private val freqMin: JsonField<Double>,
    private val mode: JsonField<Mode>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val peakGain: JsonField<Double>,
    private val polarization: JsonField<Polarization>,
    private val purpose: JsonField<Purpose>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idEntity") @ExcludeMissing idEntity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("band") @ExcludeMissing band: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bandwidth") @ExcludeMissing bandwidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("beamwidth") @ExcludeMissing beamwidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("centerFreq")
        @ExcludeMissing
        centerFreq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("edgeGain") @ExcludeMissing edgeGain: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("eirp") @ExcludeMissing eirp: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("erp") @ExcludeMissing erp: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("freqMax") @ExcludeMissing freqMax: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("freqMin") @ExcludeMissing freqMin: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("peakGain") @ExcludeMissing peakGain: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("polarization")
        @ExcludeMissing
        polarization: JsonField<Polarization> = JsonMissing.of(),
        @JsonProperty("purpose") @ExcludeMissing purpose: JsonField<Purpose> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idEntity,
        name,
        source,
        id,
        band,
        bandwidth,
        beamwidth,
        centerFreq,
        createdAt,
        createdBy,
        edgeGain,
        eirp,
        erp,
        freqMax,
        freqMin,
        mode,
        origin,
        origNetwork,
        peakGain,
        polarization,
        purpose,
        updatedAt,
        updatedBy,
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
     * Unique identifier of the parent Entity which uses this band.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idEntity(): String = idEntity.getRequired("idEntity")

    /**
     * RF Band name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

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
     * RF Band frequency range bandwidth in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bandwidth(): Optional<Double> = bandwidth.getOptional("bandwidth")

    /**
     * Angle between the half-power (-3 dB) points of the main lobe of the antenna, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun beamwidth(): Optional<Double> = beamwidth.getOptional("beamwidth")

    /**
     * Center frequency of RF frequency range, if applicable, in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun centerFreq(): Optional<Double> = centerFreq.getOptional("centerFreq")

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
     * RF Range edge gain, in dBi.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun edgeGain(): Optional<Double> = edgeGain.getOptional("edgeGain")

    /**
     * EIRP is defined as the RMS power input in decibel watts required to a lossless half-wave
     * dipole antenna to give the same maximum power density far from the antenna as the actual
     * transmitter. It is equal to the power input to the transmitter's antenna multiplied by the
     * antenna gain relative to a half-wave dipole. Effective radiated power and effective isotropic
     * radiated power both measure the amount of power a radio transmitter and antenna (or other
     * source of electromagnetic waves) radiates in a specific direction: in the direction of
     * maximum signal strength (the "main lobe") of its radiation pattern.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eirp(): Optional<Double> = eirp.getOptional("eirp")

    /**
     * Effective Radiated Power (ERP) is the total power in decibel watts radiated by an actual
     * antenna relative to a half-wave dipole rather than a theoretical isotropic antenna. A
     * half-wave dipole has a gain of 2.15 dB compared to an isotropic antenna. EIRP(dB) = ERP
     * (dB)+2.15 dB or EIRP (W) = 1.64\*ERP(W). Effective radiated power and effective isotropic
     * radiated power both measure the amount of power a radio transmitter and antenna (or other
     * source of electromagnetic waves) radiates in a specific direction: in the direction of
     * maximum signal strength (the "main lobe") of its radiation pattern.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun erp(): Optional<Double> = erp.getOptional("erp")

    /**
     * End/maximum of transmit RF frequency range, if applicable, in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun freqMax(): Optional<Double> = freqMax.getOptional("freqMax")

    /**
     * Start/minimum of transmit RF frequency range, if applicable, in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun freqMin(): Optional<Double> = freqMin.getOptional("freqMin")

    /**
     * RF Band mode (e.g. TX, RX).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = mode.getOptional("mode")

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
     * RF Range maximum gain, in dBi.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun peakGain(): Optional<Double> = peakGain.getOptional("peakGain")

    /**
     * Transponder polarization e.g. H - (Horizontally Polarized) Perpendicular to Earth's surface,
     * V - (Vertically Polarized) Parallel to Earth's surface, L - (Left Hand Circularly Polarized)
     * Rotating left relative to the Earth's surface, R - (Right Hand Circularly Polarized) Rotating
     * right relative to the Earth's surface.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarization(): Optional<Polarization> = polarization.getOptional("polarization")

    /**
     * Purpose or use of the RF Band -- COMM = communications, TTC = Telemetry/Tracking/Control, OPS
     * = Operations, OTHER = Other).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun purpose(): Optional<Purpose> = purpose.getOptional("purpose")

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
     * Returns the raw JSON value of [idEntity].
     *
     * Unlike [idEntity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idEntity") @ExcludeMissing fun _idEntity(): JsonField<String> = idEntity

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [beamwidth].
     *
     * Unlike [beamwidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beamwidth") @ExcludeMissing fun _beamwidth(): JsonField<Double> = beamwidth

    /**
     * Returns the raw JSON value of [centerFreq].
     *
     * Unlike [centerFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("centerFreq") @ExcludeMissing fun _centerFreq(): JsonField<Double> = centerFreq

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
     * Returns the raw JSON value of [edgeGain].
     *
     * Unlike [edgeGain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("edgeGain") @ExcludeMissing fun _edgeGain(): JsonField<Double> = edgeGain

    /**
     * Returns the raw JSON value of [eirp].
     *
     * Unlike [eirp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eirp") @ExcludeMissing fun _eirp(): JsonField<Double> = eirp

    /**
     * Returns the raw JSON value of [erp].
     *
     * Unlike [erp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("erp") @ExcludeMissing fun _erp(): JsonField<Double> = erp

    /**
     * Returns the raw JSON value of [freqMax].
     *
     * Unlike [freqMax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("freqMax") @ExcludeMissing fun _freqMax(): JsonField<Double> = freqMax

    /**
     * Returns the raw JSON value of [freqMin].
     *
     * Unlike [freqMin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("freqMin") @ExcludeMissing fun _freqMin(): JsonField<Double> = freqMin

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

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
     * Returns the raw JSON value of [peakGain].
     *
     * Unlike [peakGain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("peakGain") @ExcludeMissing fun _peakGain(): JsonField<Double> = peakGain

    /**
     * Returns the raw JSON value of [polarization].
     *
     * Unlike [polarization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarization")
    @ExcludeMissing
    fun _polarization(): JsonField<Polarization> = polarization

    /**
     * Returns the raw JSON value of [purpose].
     *
     * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<Purpose> = purpose

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
         * Returns a mutable builder for constructing an instance of [RfBandFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idEntity()
         * .name()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RfBandFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idEntity: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var band: JsonField<String> = JsonMissing.of()
        private var bandwidth: JsonField<Double> = JsonMissing.of()
        private var beamwidth: JsonField<Double> = JsonMissing.of()
        private var centerFreq: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var edgeGain: JsonField<Double> = JsonMissing.of()
        private var eirp: JsonField<Double> = JsonMissing.of()
        private var erp: JsonField<Double> = JsonMissing.of()
        private var freqMax: JsonField<Double> = JsonMissing.of()
        private var freqMin: JsonField<Double> = JsonMissing.of()
        private var mode: JsonField<Mode> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var peakGain: JsonField<Double> = JsonMissing.of()
        private var polarization: JsonField<Polarization> = JsonMissing.of()
        private var purpose: JsonField<Purpose> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rfBandFull: RfBandFull) = apply {
            classificationMarking = rfBandFull.classificationMarking
            dataMode = rfBandFull.dataMode
            idEntity = rfBandFull.idEntity
            name = rfBandFull.name
            source = rfBandFull.source
            id = rfBandFull.id
            band = rfBandFull.band
            bandwidth = rfBandFull.bandwidth
            beamwidth = rfBandFull.beamwidth
            centerFreq = rfBandFull.centerFreq
            createdAt = rfBandFull.createdAt
            createdBy = rfBandFull.createdBy
            edgeGain = rfBandFull.edgeGain
            eirp = rfBandFull.eirp
            erp = rfBandFull.erp
            freqMax = rfBandFull.freqMax
            freqMin = rfBandFull.freqMin
            mode = rfBandFull.mode
            origin = rfBandFull.origin
            origNetwork = rfBandFull.origNetwork
            peakGain = rfBandFull.peakGain
            polarization = rfBandFull.polarization
            purpose = rfBandFull.purpose
            updatedAt = rfBandFull.updatedAt
            updatedBy = rfBandFull.updatedBy
            additionalProperties = rfBandFull.additionalProperties.toMutableMap()
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

        /** Unique identifier of the parent Entity which uses this band. */
        fun idEntity(idEntity: String) = idEntity(JsonField.of(idEntity))

        /**
         * Sets [Builder.idEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idEntity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idEntity(idEntity: JsonField<String>) = apply { this.idEntity = idEntity }

        /** RF Band name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        /** RF Band frequency range bandwidth in Mhz. */
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
         * Angle between the half-power (-3 dB) points of the main lobe of the antenna, in degrees.
         */
        fun beamwidth(beamwidth: Double) = beamwidth(JsonField.of(beamwidth))

        /**
         * Sets [Builder.beamwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beamwidth] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun beamwidth(beamwidth: JsonField<Double>) = apply { this.beamwidth = beamwidth }

        /** Center frequency of RF frequency range, if applicable, in Mhz. */
        fun centerFreq(centerFreq: Double) = centerFreq(JsonField.of(centerFreq))

        /**
         * Sets [Builder.centerFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.centerFreq] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun centerFreq(centerFreq: JsonField<Double>) = apply { this.centerFreq = centerFreq }

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

        /** RF Range edge gain, in dBi. */
        fun edgeGain(edgeGain: Double) = edgeGain(JsonField.of(edgeGain))

        /**
         * Sets [Builder.edgeGain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.edgeGain] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun edgeGain(edgeGain: JsonField<Double>) = apply { this.edgeGain = edgeGain }

        /**
         * EIRP is defined as the RMS power input in decibel watts required to a lossless half-wave
         * dipole antenna to give the same maximum power density far from the antenna as the actual
         * transmitter. It is equal to the power input to the transmitter's antenna multiplied by
         * the antenna gain relative to a half-wave dipole. Effective radiated power and effective
         * isotropic radiated power both measure the amount of power a radio transmitter and antenna
         * (or other source of electromagnetic waves) radiates in a specific direction: in the
         * direction of maximum signal strength (the "main lobe") of its radiation pattern.
         */
        fun eirp(eirp: Double) = eirp(JsonField.of(eirp))

        /**
         * Sets [Builder.eirp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eirp] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eirp(eirp: JsonField<Double>) = apply { this.eirp = eirp }

        /**
         * Effective Radiated Power (ERP) is the total power in decibel watts radiated by an actual
         * antenna relative to a half-wave dipole rather than a theoretical isotropic antenna. A
         * half-wave dipole has a gain of 2.15 dB compared to an isotropic antenna. EIRP(dB) = ERP
         * (dB)+2.15 dB or EIRP (W) = 1.64\*ERP(W). Effective radiated power and effective isotropic
         * radiated power both measure the amount of power a radio transmitter and antenna (or other
         * source of electromagnetic waves) radiates in a specific direction: in the direction of
         * maximum signal strength (the "main lobe") of its radiation pattern.
         */
        fun erp(erp: Double) = erp(JsonField.of(erp))

        /**
         * Sets [Builder.erp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.erp] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun erp(erp: JsonField<Double>) = apply { this.erp = erp }

        /** End/maximum of transmit RF frequency range, if applicable, in Mhz. */
        fun freqMax(freqMax: Double) = freqMax(JsonField.of(freqMax))

        /**
         * Sets [Builder.freqMax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.freqMax] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun freqMax(freqMax: JsonField<Double>) = apply { this.freqMax = freqMax }

        /** Start/minimum of transmit RF frequency range, if applicable, in Mhz. */
        fun freqMin(freqMin: Double) = freqMin(JsonField.of(freqMin))

        /**
         * Sets [Builder.freqMin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.freqMin] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun freqMin(freqMin: JsonField<Double>) = apply { this.freqMin = freqMin }

        /** RF Band mode (e.g. TX, RX). */
        fun mode(mode: Mode) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

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

        /** RF Range maximum gain, in dBi. */
        fun peakGain(peakGain: Double) = peakGain(JsonField.of(peakGain))

        /**
         * Sets [Builder.peakGain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.peakGain] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun peakGain(peakGain: JsonField<Double>) = apply { this.peakGain = peakGain }

        /**
         * Transponder polarization e.g. H - (Horizontally Polarized) Perpendicular to Earth's
         * surface, V - (Vertically Polarized) Parallel to Earth's surface, L - (Left Hand
         * Circularly Polarized) Rotating left relative to the Earth's surface, R - (Right Hand
         * Circularly Polarized) Rotating right relative to the Earth's surface.
         */
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

        /**
         * Purpose or use of the RF Band -- COMM = communications, TTC = Telemetry/Tracking/Control,
         * OPS = Operations, OTHER = Other).
         */
        fun purpose(purpose: Purpose) = purpose(JsonField.of(purpose))

        /**
         * Sets [Builder.purpose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purpose] with a well-typed [Purpose] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun purpose(purpose: JsonField<Purpose>) = apply { this.purpose = purpose }

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
         * Returns an immutable instance of [RfBandFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idEntity()
         * .name()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RfBandFull =
            RfBandFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idEntity", idEntity),
                checkRequired("name", name),
                checkRequired("source", source),
                id,
                band,
                bandwidth,
                beamwidth,
                centerFreq,
                createdAt,
                createdBy,
                edgeGain,
                eirp,
                erp,
                freqMax,
                freqMin,
                mode,
                origin,
                origNetwork,
                peakGain,
                polarization,
                purpose,
                updatedAt,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RfBandFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idEntity()
        name()
        source()
        id()
        band()
        bandwidth()
        beamwidth()
        centerFreq()
        createdAt()
        createdBy()
        edgeGain()
        eirp()
        erp()
        freqMax()
        freqMin()
        mode().ifPresent { it.validate() }
        origin()
        origNetwork()
        peakGain()
        polarization().ifPresent { it.validate() }
        purpose().ifPresent { it.validate() }
        updatedAt()
        updatedBy()
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
            (if (idEntity.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (band.asKnown().isPresent) 1 else 0) +
            (if (bandwidth.asKnown().isPresent) 1 else 0) +
            (if (beamwidth.asKnown().isPresent) 1 else 0) +
            (if (centerFreq.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (edgeGain.asKnown().isPresent) 1 else 0) +
            (if (eirp.asKnown().isPresent) 1 else 0) +
            (if (erp.asKnown().isPresent) 1 else 0) +
            (if (freqMax.asKnown().isPresent) 1 else 0) +
            (if (freqMin.asKnown().isPresent) 1 else 0) +
            (mode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (peakGain.asKnown().isPresent) 1 else 0) +
            (polarization.asKnown().getOrNull()?.validity() ?: 0) +
            (purpose.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0)

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

    /** RF Band mode (e.g. TX, RX). */
    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TX = of("TX")

            @JvmField val RX = of("RX")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            TX,
            RX,
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TX,
            RX,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                TX -> Value.TX
                RX -> Value.RX
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
                TX -> Known.TX
                RX -> Known.RX
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Mode: $value")
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

        fun validate(): Mode = apply {
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

            return other is Mode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Transponder polarization e.g. H - (Horizontally Polarized) Perpendicular to Earth's surface,
     * V - (Vertically Polarized) Parallel to Earth's surface, L - (Left Hand Circularly Polarized)
     * Rotating left relative to the Earth's surface, R - (Right Hand Circularly Polarized) Rotating
     * right relative to the Earth's surface.
     */
    class Polarization @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmStatic fun of(value: String) = Polarization(JsonField.of(value))
        }

        /** An enum containing [Polarization]'s known values. */
        enum class Known {
            H,
            V,
            R,
            L,
        }

        /**
         * An enum containing [Polarization]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Polarization] can contain an unknown value in a couple of cases:
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
             * An enum member indicating that [Polarization] was instantiated with an unknown value.
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
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Polarization: $value")
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

        fun validate(): Polarization = apply {
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

            return other is Polarization && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Purpose or use of the RF Band -- COMM = communications, TTC = Telemetry/Tracking/Control, OPS
     * = Operations, OTHER = Other).
     */
    class Purpose @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val COMM = of("COMM")

            @JvmField val TTC = of("TTC")

            @JvmField val OPS = of("OPS")

            @JvmField val OTHER = of("OTHER")

            @JvmStatic fun of(value: String) = Purpose(JsonField.of(value))
        }

        /** An enum containing [Purpose]'s known values. */
        enum class Known {
            COMM,
            TTC,
            OPS,
            OTHER,
        }

        /**
         * An enum containing [Purpose]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Purpose] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMM,
            TTC,
            OPS,
            OTHER,
            /** An enum member indicating that [Purpose] was instantiated with an unknown value. */
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
                COMM -> Value.COMM
                TTC -> Value.TTC
                OPS -> Value.OPS
                OTHER -> Value.OTHER
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
                COMM -> Known.COMM
                TTC -> Known.TTC
                OPS -> Known.OPS
                OTHER -> Known.OTHER
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Purpose: $value")
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

        fun validate(): Purpose = apply {
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

            return other is Purpose && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RfBandFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            idEntity == other.idEntity &&
            name == other.name &&
            source == other.source &&
            id == other.id &&
            band == other.band &&
            bandwidth == other.bandwidth &&
            beamwidth == other.beamwidth &&
            centerFreq == other.centerFreq &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            edgeGain == other.edgeGain &&
            eirp == other.eirp &&
            erp == other.erp &&
            freqMax == other.freqMax &&
            freqMin == other.freqMin &&
            mode == other.mode &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            peakGain == other.peakGain &&
            polarization == other.polarization &&
            purpose == other.purpose &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            idEntity,
            name,
            source,
            id,
            band,
            bandwidth,
            beamwidth,
            centerFreq,
            createdAt,
            createdBy,
            edgeGain,
            eirp,
            erp,
            freqMax,
            freqMin,
            mode,
            origin,
            origNetwork,
            peakGain,
            polarization,
            purpose,
            updatedAt,
            updatedBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RfBandFull{classificationMarking=$classificationMarking, dataMode=$dataMode, idEntity=$idEntity, name=$name, source=$source, id=$id, band=$band, bandwidth=$bandwidth, beamwidth=$beamwidth, centerFreq=$centerFreq, createdAt=$createdAt, createdBy=$createdBy, edgeGain=$edgeGain, eirp=$eirp, erp=$erp, freqMax=$freqMax, freqMin=$freqMin, mode=$mode, origin=$origin, origNetwork=$origNetwork, peakGain=$peakGain, polarization=$polarization, purpose=$purpose, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

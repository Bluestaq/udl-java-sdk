// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laseremitter

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
import com.unifieddatalibrary.api.models.EntityFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Model representation of a laser beam emitter/director which represents a source of directed
 * energy.
 */
class LaseremitterTupleResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val laserName: JsonField<String>,
    private val laserType: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val atmosphericTransmission: JsonField<Double>,
    private val beamOutputPower: JsonField<Double>,
    private val beamWaist: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val divergence: JsonField<Double>,
    private val entity: JsonField<EntityFull>,
    private val idEntity: JsonField<String>,
    private val isOperational: JsonField<Boolean>,
    private val maxDuration: JsonField<Double>,
    private val maxFocusRange: JsonField<Double>,
    private val minFocusRange: JsonField<Double>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val pulseFluence: JsonField<Double>,
    private val pulsePeakPower: JsonField<Double>,
    private val pulseRepFreq: JsonField<Double>,
    private val pulseShape: JsonField<String>,
    private val pulseWidth: JsonField<Double>,
    private val sourceDl: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val wavelength: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("laserName") @ExcludeMissing laserName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("laserType") @ExcludeMissing laserType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("atmosphericTransmission")
        @ExcludeMissing
        atmosphericTransmission: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("beamOutputPower")
        @ExcludeMissing
        beamOutputPower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("beamWaist") @ExcludeMissing beamWaist: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("divergence")
        @ExcludeMissing
        divergence: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("entity") @ExcludeMissing entity: JsonField<EntityFull> = JsonMissing.of(),
        @JsonProperty("idEntity") @ExcludeMissing idEntity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isOperational")
        @ExcludeMissing
        isOperational: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("maxDuration")
        @ExcludeMissing
        maxDuration: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxFocusRange")
        @ExcludeMissing
        maxFocusRange: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minFocusRange")
        @ExcludeMissing
        minFocusRange: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pulseFluence")
        @ExcludeMissing
        pulseFluence: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pulsePeakPower")
        @ExcludeMissing
        pulsePeakPower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pulseRepFreq")
        @ExcludeMissing
        pulseRepFreq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pulseShape")
        @ExcludeMissing
        pulseShape: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pulseWidth")
        @ExcludeMissing
        pulseWidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wavelength") @ExcludeMissing wavelength: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        laserName,
        laserType,
        source,
        id,
        atmosphericTransmission,
        beamOutputPower,
        beamWaist,
        createdAt,
        createdBy,
        divergence,
        entity,
        idEntity,
        isOperational,
        maxDuration,
        maxFocusRange,
        minFocusRange,
        origin,
        origNetwork,
        pulseFluence,
        pulsePeakPower,
        pulseRepFreq,
        pulseShape,
        pulseWidth,
        sourceDl,
        updatedAt,
        updatedBy,
        wavelength,
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
     * The name of this laser within the laser system or facility.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun laserName(): String = laserName.getRequired("laserName")

    /**
     * The type of laser (e.g. CONTINUOUS WAVE, PULSED, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun laserType(): String = laserType.getRequired("laserType")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Unique identifier of the record, auto-generated by the system if not provided on create
     * operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Maximum possible laser-to-space atmospheric transmission (a value between zero and one,
     * usually assumed to be unity for all lasers except for lasers with wavelengths heavily
     * absorbed by the atmosphere).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun atmosphericTransmission(): Optional<Double> =
        atmosphericTransmission.getOptional("atmosphericTransmission")

    /**
     * The beam director aperture average (equivalent CW) output power is the total laser average
     * power that is transmitted away from the final exit aperture of the optical system. For a CW
     * laser, this is equivalent to the laser device CW power multiplied by the throughput of the
     * optical system, including the beam director telescope. For a pulsed laser, this is equivalent
     * to the laser device energy per pulse multiplied by the pulse repetition frequency (PRF)
     * multiplied by the throughput of the optical system including the beam director telescope.
     * Measured in Watts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun beamOutputPower(): Optional<Double> = beamOutputPower.getOptional("beamOutputPower")

    /**
     * The beam waist (radius) of this laser at the exit aperture, in centimeters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun beamWaist(): Optional<Double> = beamWaist.getOptional("beamWaist")

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
     * Minimum possible divergence half-angle of this laser, referenced from the optical axis to the
     * 1/e point of the beam's far field irradiance profile, measured in microradians.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun divergence(): Optional<Double> = divergence.getOptional("divergence")

    /**
     * An entity is a generic representation of any object within a space/SSA system such as
     * sensors, on-orbit objects, RF Emitters, space craft buses, etc. An entity can have an
     * operating unit, a location (if terrestrial), and statuses.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun entity(): Optional<EntityFull> = entity.getOptional("entity")

    /**
     * Unique identifier of the parent entity. idEntity is required for PUT.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idEntity(): Optional<String> = idEntity.getOptional("idEntity")

    /**
     * A Boolean indicating whether or not this laser emitter is operational. False indicates that
     * the laser specified in this record is no longer available and can be considered defunct. This
     * field is true by default.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun isOperational(): Optional<Boolean> = isOperational.getOptional("isOperational")

    /**
     * The maximum time that the laser would be "on" for a given test(s) for laser activity, in
     * seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxDuration(): Optional<Double> = maxDuration.getOptional("maxDuration")

    /**
     * The maximum possible focus range of this laser, measured in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxFocusRange(): Optional<Double> = maxFocusRange.getOptional("maxFocusRange")

    /**
     * The minimum possible focus range of this laser, measured in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minFocusRange(): Optional<Double> = minFocusRange.getOptional("minFocusRange")

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
     * The amount of energy in each laser pulse exiting from the beam director/telescope, measured
     * in Joules.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pulseFluence(): Optional<Double> = pulseFluence.getOptional("pulseFluence")

    /**
     * The instantaneous single pulse peak power exiting from the laser device, measured in Watts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pulsePeakPower(): Optional<Double> = pulsePeakPower.getOptional("pulsePeakPower")

    /**
     * The pulse repetition frequency of this laser, measured in kilohertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pulseRepFreq(): Optional<Double> = pulseRepFreq.getOptional("pulseRepFreq")

    /**
     * The pulse shape (waveform) of this laser, e.g. "RECTANGULAR," "SAWTOOTH," "GAUSSIAN," etc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pulseShape(): Optional<String> = pulseShape.getOptional("pulseShape")

    /**
     * The laser device pulse duration, measured in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pulseWidth(): Optional<Double> = pulseWidth.getOptional("pulseWidth")

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
     * The center wavelength of this laser, in micrometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun wavelength(): Optional<Double> = wavelength.getOptional("wavelength")

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
     * Returns the raw JSON value of [laserName].
     *
     * Unlike [laserName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("laserName") @ExcludeMissing fun _laserName(): JsonField<String> = laserName

    /**
     * Returns the raw JSON value of [laserType].
     *
     * Unlike [laserType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("laserType") @ExcludeMissing fun _laserType(): JsonField<String> = laserType

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
     * Returns the raw JSON value of [atmosphericTransmission].
     *
     * Unlike [atmosphericTransmission], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("atmosphericTransmission")
    @ExcludeMissing
    fun _atmosphericTransmission(): JsonField<Double> = atmosphericTransmission

    /**
     * Returns the raw JSON value of [beamOutputPower].
     *
     * Unlike [beamOutputPower], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beamOutputPower")
    @ExcludeMissing
    fun _beamOutputPower(): JsonField<Double> = beamOutputPower

    /**
     * Returns the raw JSON value of [beamWaist].
     *
     * Unlike [beamWaist], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beamWaist") @ExcludeMissing fun _beamWaist(): JsonField<Double> = beamWaist

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
     * Returns the raw JSON value of [divergence].
     *
     * Unlike [divergence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("divergence") @ExcludeMissing fun _divergence(): JsonField<Double> = divergence

    /**
     * Returns the raw JSON value of [entity].
     *
     * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<EntityFull> = entity

    /**
     * Returns the raw JSON value of [idEntity].
     *
     * Unlike [idEntity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idEntity") @ExcludeMissing fun _idEntity(): JsonField<String> = idEntity

    /**
     * Returns the raw JSON value of [isOperational].
     *
     * Unlike [isOperational], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isOperational")
    @ExcludeMissing
    fun _isOperational(): JsonField<Boolean> = isOperational

    /**
     * Returns the raw JSON value of [maxDuration].
     *
     * Unlike [maxDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxDuration") @ExcludeMissing fun _maxDuration(): JsonField<Double> = maxDuration

    /**
     * Returns the raw JSON value of [maxFocusRange].
     *
     * Unlike [maxFocusRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxFocusRange")
    @ExcludeMissing
    fun _maxFocusRange(): JsonField<Double> = maxFocusRange

    /**
     * Returns the raw JSON value of [minFocusRange].
     *
     * Unlike [minFocusRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minFocusRange")
    @ExcludeMissing
    fun _minFocusRange(): JsonField<Double> = minFocusRange

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
     * Returns the raw JSON value of [pulseFluence].
     *
     * Unlike [pulseFluence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pulseFluence")
    @ExcludeMissing
    fun _pulseFluence(): JsonField<Double> = pulseFluence

    /**
     * Returns the raw JSON value of [pulsePeakPower].
     *
     * Unlike [pulsePeakPower], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pulsePeakPower")
    @ExcludeMissing
    fun _pulsePeakPower(): JsonField<Double> = pulsePeakPower

    /**
     * Returns the raw JSON value of [pulseRepFreq].
     *
     * Unlike [pulseRepFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pulseRepFreq")
    @ExcludeMissing
    fun _pulseRepFreq(): JsonField<Double> = pulseRepFreq

    /**
     * Returns the raw JSON value of [pulseShape].
     *
     * Unlike [pulseShape], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pulseShape") @ExcludeMissing fun _pulseShape(): JsonField<String> = pulseShape

    /**
     * Returns the raw JSON value of [pulseWidth].
     *
     * Unlike [pulseWidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pulseWidth") @ExcludeMissing fun _pulseWidth(): JsonField<Double> = pulseWidth

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

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
     * Returns the raw JSON value of [wavelength].
     *
     * Unlike [wavelength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wavelength") @ExcludeMissing fun _wavelength(): JsonField<Double> = wavelength

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
         * Returns a mutable builder for constructing an instance of [LaseremitterTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .laserName()
         * .laserType()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LaseremitterTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var laserName: JsonField<String>? = null
        private var laserType: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var atmosphericTransmission: JsonField<Double> = JsonMissing.of()
        private var beamOutputPower: JsonField<Double> = JsonMissing.of()
        private var beamWaist: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var divergence: JsonField<Double> = JsonMissing.of()
        private var entity: JsonField<EntityFull> = JsonMissing.of()
        private var idEntity: JsonField<String> = JsonMissing.of()
        private var isOperational: JsonField<Boolean> = JsonMissing.of()
        private var maxDuration: JsonField<Double> = JsonMissing.of()
        private var maxFocusRange: JsonField<Double> = JsonMissing.of()
        private var minFocusRange: JsonField<Double> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var pulseFluence: JsonField<Double> = JsonMissing.of()
        private var pulsePeakPower: JsonField<Double> = JsonMissing.of()
        private var pulseRepFreq: JsonField<Double> = JsonMissing.of()
        private var pulseShape: JsonField<String> = JsonMissing.of()
        private var pulseWidth: JsonField<Double> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var wavelength: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(laseremitterTupleResponse: LaseremitterTupleResponse) = apply {
            classificationMarking = laseremitterTupleResponse.classificationMarking
            dataMode = laseremitterTupleResponse.dataMode
            laserName = laseremitterTupleResponse.laserName
            laserType = laseremitterTupleResponse.laserType
            source = laseremitterTupleResponse.source
            id = laseremitterTupleResponse.id
            atmosphericTransmission = laseremitterTupleResponse.atmosphericTransmission
            beamOutputPower = laseremitterTupleResponse.beamOutputPower
            beamWaist = laseremitterTupleResponse.beamWaist
            createdAt = laseremitterTupleResponse.createdAt
            createdBy = laseremitterTupleResponse.createdBy
            divergence = laseremitterTupleResponse.divergence
            entity = laseremitterTupleResponse.entity
            idEntity = laseremitterTupleResponse.idEntity
            isOperational = laseremitterTupleResponse.isOperational
            maxDuration = laseremitterTupleResponse.maxDuration
            maxFocusRange = laseremitterTupleResponse.maxFocusRange
            minFocusRange = laseremitterTupleResponse.minFocusRange
            origin = laseremitterTupleResponse.origin
            origNetwork = laseremitterTupleResponse.origNetwork
            pulseFluence = laseremitterTupleResponse.pulseFluence
            pulsePeakPower = laseremitterTupleResponse.pulsePeakPower
            pulseRepFreq = laseremitterTupleResponse.pulseRepFreq
            pulseShape = laseremitterTupleResponse.pulseShape
            pulseWidth = laseremitterTupleResponse.pulseWidth
            sourceDl = laseremitterTupleResponse.sourceDl
            updatedAt = laseremitterTupleResponse.updatedAt
            updatedBy = laseremitterTupleResponse.updatedBy
            wavelength = laseremitterTupleResponse.wavelength
            additionalProperties = laseremitterTupleResponse.additionalProperties.toMutableMap()
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

        /** The name of this laser within the laser system or facility. */
        fun laserName(laserName: String) = laserName(JsonField.of(laserName))

        /**
         * Sets [Builder.laserName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.laserName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun laserName(laserName: JsonField<String>) = apply { this.laserName = laserName }

        /** The type of laser (e.g. CONTINUOUS WAVE, PULSED, etc.). */
        fun laserType(laserType: String) = laserType(JsonField.of(laserType))

        /**
         * Sets [Builder.laserType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.laserType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun laserType(laserType: JsonField<String>) = apply { this.laserType = laserType }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

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

        /**
         * Maximum possible laser-to-space atmospheric transmission (a value between zero and one,
         * usually assumed to be unity for all lasers except for lasers with wavelengths heavily
         * absorbed by the atmosphere).
         */
        fun atmosphericTransmission(atmosphericTransmission: Double) =
            atmosphericTransmission(JsonField.of(atmosphericTransmission))

        /**
         * Sets [Builder.atmosphericTransmission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.atmosphericTransmission] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun atmosphericTransmission(atmosphericTransmission: JsonField<Double>) = apply {
            this.atmosphericTransmission = atmosphericTransmission
        }

        /**
         * The beam director aperture average (equivalent CW) output power is the total laser
         * average power that is transmitted away from the final exit aperture of the optical
         * system. For a CW laser, this is equivalent to the laser device CW power multiplied by the
         * throughput of the optical system, including the beam director telescope. For a pulsed
         * laser, this is equivalent to the laser device energy per pulse multiplied by the pulse
         * repetition frequency (PRF) multiplied by the throughput of the optical system including
         * the beam director telescope. Measured in Watts.
         */
        fun beamOutputPower(beamOutputPower: Double) =
            beamOutputPower(JsonField.of(beamOutputPower))

        /**
         * Sets [Builder.beamOutputPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beamOutputPower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun beamOutputPower(beamOutputPower: JsonField<Double>) = apply {
            this.beamOutputPower = beamOutputPower
        }

        /** The beam waist (radius) of this laser at the exit aperture, in centimeters. */
        fun beamWaist(beamWaist: Double) = beamWaist(JsonField.of(beamWaist))

        /**
         * Sets [Builder.beamWaist] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beamWaist] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun beamWaist(beamWaist: JsonField<Double>) = apply { this.beamWaist = beamWaist }

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
         * Minimum possible divergence half-angle of this laser, referenced from the optical axis to
         * the 1/e point of the beam's far field irradiance profile, measured in microradians.
         */
        fun divergence(divergence: Double) = divergence(JsonField.of(divergence))

        /**
         * Sets [Builder.divergence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.divergence] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun divergence(divergence: JsonField<Double>) = apply { this.divergence = divergence }

        /**
         * An entity is a generic representation of any object within a space/SSA system such as
         * sensors, on-orbit objects, RF Emitters, space craft buses, etc. An entity can have an
         * operating unit, a location (if terrestrial), and statuses.
         */
        fun entity(entity: EntityFull) = entity(JsonField.of(entity))

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [EntityFull] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entity(entity: JsonField<EntityFull>) = apply { this.entity = entity }

        /** Unique identifier of the parent entity. idEntity is required for PUT. */
        fun idEntity(idEntity: String) = idEntity(JsonField.of(idEntity))

        /**
         * Sets [Builder.idEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idEntity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idEntity(idEntity: JsonField<String>) = apply { this.idEntity = idEntity }

        /**
         * A Boolean indicating whether or not this laser emitter is operational. False indicates
         * that the laser specified in this record is no longer available and can be considered
         * defunct. This field is true by default.
         */
        fun isOperational(isOperational: Boolean) = isOperational(JsonField.of(isOperational))

        /**
         * Sets [Builder.isOperational] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isOperational] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isOperational(isOperational: JsonField<Boolean>) = apply {
            this.isOperational = isOperational
        }

        /**
         * The maximum time that the laser would be "on" for a given test(s) for laser activity, in
         * seconds.
         */
        fun maxDuration(maxDuration: Double) = maxDuration(JsonField.of(maxDuration))

        /**
         * Sets [Builder.maxDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDuration] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxDuration(maxDuration: JsonField<Double>) = apply { this.maxDuration = maxDuration }

        /** The maximum possible focus range of this laser, measured in kilometers. */
        fun maxFocusRange(maxFocusRange: Double) = maxFocusRange(JsonField.of(maxFocusRange))

        /**
         * Sets [Builder.maxFocusRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxFocusRange] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxFocusRange(maxFocusRange: JsonField<Double>) = apply {
            this.maxFocusRange = maxFocusRange
        }

        /** The minimum possible focus range of this laser, measured in kilometers. */
        fun minFocusRange(minFocusRange: Double) = minFocusRange(JsonField.of(minFocusRange))

        /**
         * Sets [Builder.minFocusRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minFocusRange] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minFocusRange(minFocusRange: JsonField<Double>) = apply {
            this.minFocusRange = minFocusRange
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
         * The amount of energy in each laser pulse exiting from the beam director/telescope,
         * measured in Joules.
         */
        fun pulseFluence(pulseFluence: Double) = pulseFluence(JsonField.of(pulseFluence))

        /**
         * Sets [Builder.pulseFluence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pulseFluence] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pulseFluence(pulseFluence: JsonField<Double>) = apply {
            this.pulseFluence = pulseFluence
        }

        /**
         * The instantaneous single pulse peak power exiting from the laser device, measured in
         * Watts.
         */
        fun pulsePeakPower(pulsePeakPower: Double) = pulsePeakPower(JsonField.of(pulsePeakPower))

        /**
         * Sets [Builder.pulsePeakPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pulsePeakPower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pulsePeakPower(pulsePeakPower: JsonField<Double>) = apply {
            this.pulsePeakPower = pulsePeakPower
        }

        /** The pulse repetition frequency of this laser, measured in kilohertz. */
        fun pulseRepFreq(pulseRepFreq: Double) = pulseRepFreq(JsonField.of(pulseRepFreq))

        /**
         * Sets [Builder.pulseRepFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pulseRepFreq] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pulseRepFreq(pulseRepFreq: JsonField<Double>) = apply {
            this.pulseRepFreq = pulseRepFreq
        }

        /**
         * The pulse shape (waveform) of this laser, e.g. "RECTANGULAR," "SAWTOOTH," "GAUSSIAN,"
         * etc.
         */
        fun pulseShape(pulseShape: String) = pulseShape(JsonField.of(pulseShape))

        /**
         * Sets [Builder.pulseShape] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pulseShape] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pulseShape(pulseShape: JsonField<String>) = apply { this.pulseShape = pulseShape }

        /** The laser device pulse duration, measured in seconds. */
        fun pulseWidth(pulseWidth: Double) = pulseWidth(JsonField.of(pulseWidth))

        /**
         * Sets [Builder.pulseWidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pulseWidth] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pulseWidth(pulseWidth: JsonField<Double>) = apply { this.pulseWidth = pulseWidth }

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

        /** The center wavelength of this laser, in micrometers. */
        fun wavelength(wavelength: Double) = wavelength(JsonField.of(wavelength))

        /**
         * Sets [Builder.wavelength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wavelength] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun wavelength(wavelength: JsonField<Double>) = apply { this.wavelength = wavelength }

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
         * Returns an immutable instance of [LaseremitterTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .laserName()
         * .laserType()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LaseremitterTupleResponse =
            LaseremitterTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("laserName", laserName),
                checkRequired("laserType", laserType),
                checkRequired("source", source),
                id,
                atmosphericTransmission,
                beamOutputPower,
                beamWaist,
                createdAt,
                createdBy,
                divergence,
                entity,
                idEntity,
                isOperational,
                maxDuration,
                maxFocusRange,
                minFocusRange,
                origin,
                origNetwork,
                pulseFluence,
                pulsePeakPower,
                pulseRepFreq,
                pulseShape,
                pulseWidth,
                sourceDl,
                updatedAt,
                updatedBy,
                wavelength,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LaseremitterTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        laserName()
        laserType()
        source()
        id()
        atmosphericTransmission()
        beamOutputPower()
        beamWaist()
        createdAt()
        createdBy()
        divergence()
        entity().ifPresent { it.validate() }
        idEntity()
        isOperational()
        maxDuration()
        maxFocusRange()
        minFocusRange()
        origin()
        origNetwork()
        pulseFluence()
        pulsePeakPower()
        pulseRepFreq()
        pulseShape()
        pulseWidth()
        sourceDl()
        updatedAt()
        updatedBy()
        wavelength()
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
            (if (laserName.asKnown().isPresent) 1 else 0) +
            (if (laserType.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (atmosphericTransmission.asKnown().isPresent) 1 else 0) +
            (if (beamOutputPower.asKnown().isPresent) 1 else 0) +
            (if (beamWaist.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (divergence.asKnown().isPresent) 1 else 0) +
            (entity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (idEntity.asKnown().isPresent) 1 else 0) +
            (if (isOperational.asKnown().isPresent) 1 else 0) +
            (if (maxDuration.asKnown().isPresent) 1 else 0) +
            (if (maxFocusRange.asKnown().isPresent) 1 else 0) +
            (if (minFocusRange.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (pulseFluence.asKnown().isPresent) 1 else 0) +
            (if (pulsePeakPower.asKnown().isPresent) 1 else 0) +
            (if (pulseRepFreq.asKnown().isPresent) 1 else 0) +
            (if (pulseShape.asKnown().isPresent) 1 else 0) +
            (if (pulseWidth.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (wavelength.asKnown().isPresent) 1 else 0)

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

        return other is LaseremitterTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            laserName == other.laserName &&
            laserType == other.laserType &&
            source == other.source &&
            id == other.id &&
            atmosphericTransmission == other.atmosphericTransmission &&
            beamOutputPower == other.beamOutputPower &&
            beamWaist == other.beamWaist &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            divergence == other.divergence &&
            entity == other.entity &&
            idEntity == other.idEntity &&
            isOperational == other.isOperational &&
            maxDuration == other.maxDuration &&
            maxFocusRange == other.maxFocusRange &&
            minFocusRange == other.minFocusRange &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            pulseFluence == other.pulseFluence &&
            pulsePeakPower == other.pulsePeakPower &&
            pulseRepFreq == other.pulseRepFreq &&
            pulseShape == other.pulseShape &&
            pulseWidth == other.pulseWidth &&
            sourceDl == other.sourceDl &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            wavelength == other.wavelength &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            laserName,
            laserType,
            source,
            id,
            atmosphericTransmission,
            beamOutputPower,
            beamWaist,
            createdAt,
            createdBy,
            divergence,
            entity,
            idEntity,
            isOperational,
            maxDuration,
            maxFocusRange,
            minFocusRange,
            origin,
            origNetwork,
            pulseFluence,
            pulsePeakPower,
            pulseRepFreq,
            pulseShape,
            pulseWidth,
            sourceDl,
            updatedAt,
            updatedBy,
            wavelength,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LaseremitterTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, laserName=$laserName, laserType=$laserType, source=$source, id=$id, atmosphericTransmission=$atmosphericTransmission, beamOutputPower=$beamOutputPower, beamWaist=$beamWaist, createdAt=$createdAt, createdBy=$createdBy, divergence=$divergence, entity=$entity, idEntity=$idEntity, isOperational=$isOperational, maxDuration=$maxDuration, maxFocusRange=$maxFocusRange, minFocusRange=$minFocusRange, origin=$origin, origNetwork=$origNetwork, pulseFluence=$pulseFluence, pulsePeakPower=$pulsePeakPower, pulseRepFreq=$pulseRepFreq, pulseShape=$pulseShape, pulseWidth=$pulseWidth, sourceDl=$sourceDl, updatedAt=$updatedAt, updatedBy=$updatedBy, wavelength=$wavelength, additionalProperties=$additionalProperties}"
}

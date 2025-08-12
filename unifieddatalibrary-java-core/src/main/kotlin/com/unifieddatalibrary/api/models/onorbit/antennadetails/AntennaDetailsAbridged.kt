// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit.antennadetails

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
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailsAbridged
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Detailed information for a spacecraft communication antenna. One antenna may have multiple AntennaDetails records, compiled by various sources. */
class AntennaDetailsAbridged private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idAntenna: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val beamForming: JsonField<Boolean>,
    private val beamwidth: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val description: JsonField<String>,
    private val diameter: JsonField<Double>,
    private val endFrequency: JsonField<Double>,
    private val gain: JsonField<Double>,
    private val gainTolerance: JsonField<Double>,
    private val manufacturerOrgId: JsonField<String>,
    private val mode: JsonField<Mode>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val polarization: JsonField<Double>,
    private val position: JsonField<String>,
    private val size: JsonField<List<Double>>,
    private val startFrequency: JsonField<Double>,
    private val steerable: JsonField<Boolean>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking") @ExcludeMissing classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idAntenna") @ExcludeMissing idAntenna: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beamForming") @ExcludeMissing beamForming: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("beamwidth") @ExcludeMissing beamwidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description") @ExcludeMissing description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("diameter") @ExcludeMissing diameter: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("endFrequency") @ExcludeMissing endFrequency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gain") @ExcludeMissing gain: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gainTolerance") @ExcludeMissing gainTolerance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("manufacturerOrgId") @ExcludeMissing manufacturerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork") @ExcludeMissing origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("polarization") @ExcludeMissing polarization: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("position") @ExcludeMissing position: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("startFrequency") @ExcludeMissing startFrequency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("steerable") @ExcludeMissing steerable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of()
    ) : this(
      classificationMarking,
      dataMode,
      idAntenna,
      source,
      id,
      beamForming,
      beamwidth,
      createdAt,
      createdBy,
      description,
      diameter,
      endFrequency,
      gain,
      gainTolerance,
      manufacturerOrgId,
      mode,
      origin,
      origNetwork,
      polarization,
      position,
      size,
      startFrequency,
      steerable,
      type,
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
     * Unique identifier of the parent Antenna.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idAntenna(): String = idAntenna.getRequired("idAntenna")

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
     * Boolean indicating if this is a beam forming antenna.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun beamForming(): Optional<Boolean> = beamForming.getOptional("beamForming")

    /**
     * Array of angles between the half-power (-3 dB) points of the main lobe of the antenna, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun beamwidth(): Optional<Double> = beamwidth.getOptional("beamwidth")

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
     * Antenna description.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Antenna diameter in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun diameter(): Optional<Double> = diameter.getOptional("diameter")

    /**
     * Antenna end of frequency range in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun endFrequency(): Optional<Double> = endFrequency.getOptional("endFrequency")

    /**
     * Antenna maximum gain in dBi.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun gain(): Optional<Double> = gain.getOptional("gain")

    /**
     * Antenna gain tolerance in dB.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun gainTolerance(): Optional<Double> = gainTolerance.getOptional("gainTolerance")

    /**
     * ID of the organization that manufactures the antenna.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun manufacturerOrgId(): Optional<String> = manufacturerOrgId.getOptional("manufacturerOrgId")

    /**
     * Antenna mode (e.g. TX,RX).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = mode.getOptional("mode")

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
     * Antenna polarization in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun polarization(): Optional<Double> = polarization.getOptional("polarization")

    /**
     * Antenna position (e.g. Top, Nadir, Side).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun position(): Optional<String> = position.getOptional("position")

    /**
     * Array with 1-2 values specifying the length and width (for rectangular) and just length for dipole antennas in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun size(): Optional<List<Double>> = size.getOptional("size")

    /**
     * Antenna start of frequency range in Mhz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun startFrequency(): Optional<Double> = startFrequency.getOptional("startFrequency")

    /**
     * Boolean indicating if this antenna is steerable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun steerable(): Optional<Boolean> = steerable.getOptional("steerable")

    /**
     * Type of antenna (e.g. Reflector, Double Reflector, Shaped Reflector, Horn, Parabolic, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

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
     * Returns the raw JSON value of [idAntenna].
     *
     * Unlike [idAntenna], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idAntenna")
    @ExcludeMissing
    fun _idAntenna(): JsonField<String> = idAntenna

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
     * Returns the raw JSON value of [beamForming].
     *
     * Unlike [beamForming], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beamForming")
    @ExcludeMissing
    fun _beamForming(): JsonField<Boolean> = beamForming

    /**
     * Returns the raw JSON value of [beamwidth].
     *
     * Unlike [beamwidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beamwidth")
    @ExcludeMissing
    fun _beamwidth(): JsonField<Double> = beamwidth

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
     * Returns the raw JSON value of [diameter].
     *
     * Unlike [diameter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("diameter")
    @ExcludeMissing
    fun _diameter(): JsonField<Double> = diameter

    /**
     * Returns the raw JSON value of [endFrequency].
     *
     * Unlike [endFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endFrequency")
    @ExcludeMissing
    fun _endFrequency(): JsonField<Double> = endFrequency

    /**
     * Returns the raw JSON value of [gain].
     *
     * Unlike [gain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gain")
    @ExcludeMissing
    fun _gain(): JsonField<Double> = gain

    /**
     * Returns the raw JSON value of [gainTolerance].
     *
     * Unlike [gainTolerance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gainTolerance")
    @ExcludeMissing
    fun _gainTolerance(): JsonField<Double> = gainTolerance

    /**
     * Returns the raw JSON value of [manufacturerOrgId].
     *
     * Unlike [manufacturerOrgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manufacturerOrgId")
    @ExcludeMissing
    fun _manufacturerOrgId(): JsonField<String> = manufacturerOrgId

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode")
    @ExcludeMissing
    fun _mode(): JsonField<Mode> = mode

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
     * Returns the raw JSON value of [polarization].
     *
     * Unlike [polarization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarization")
    @ExcludeMissing
    fun _polarization(): JsonField<Double> = polarization

    /**
     * Returns the raw JSON value of [position].
     *
     * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("position")
    @ExcludeMissing
    fun _position(): JsonField<String> = position

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size")
    @ExcludeMissing
    fun _size(): JsonField<List<Double>> = size

    /**
     * Returns the raw JSON value of [startFrequency].
     *
     * Unlike [startFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startFrequency")
    @ExcludeMissing
    fun _startFrequency(): JsonField<Double> = startFrequency

    /**
     * Returns the raw JSON value of [steerable].
     *
     * Unlike [steerable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("steerable")
    @ExcludeMissing
    fun _steerable(): JsonField<Boolean> = steerable

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type(): JsonField<String> = type

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
         * Returns a mutable builder for constructing an instance of [AntennaDetailsAbridged].
         *
         * The following fields are required:
         *
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idAntenna()
         * .source()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [AntennaDetailsAbridged]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idAntenna: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var beamForming: JsonField<Boolean> = JsonMissing.of()
        private var beamwidth: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var diameter: JsonField<Double> = JsonMissing.of()
        private var endFrequency: JsonField<Double> = JsonMissing.of()
        private var gain: JsonField<Double> = JsonMissing.of()
        private var gainTolerance: JsonField<Double> = JsonMissing.of()
        private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
        private var mode: JsonField<Mode> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var polarization: JsonField<Double> = JsonMissing.of()
        private var position: JsonField<String> = JsonMissing.of()
        private var size: JsonField<MutableList<Double>>? = null
        private var startFrequency: JsonField<Double> = JsonMissing.of()
        private var steerable: JsonField<Boolean> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(antennaDetailsAbridged: AntennaDetailsAbridged) =
            apply {
                classificationMarking = antennaDetailsAbridged.classificationMarking
                dataMode = antennaDetailsAbridged.dataMode
                idAntenna = antennaDetailsAbridged.idAntenna
                source = antennaDetailsAbridged.source
                id = antennaDetailsAbridged.id
                beamForming = antennaDetailsAbridged.beamForming
                beamwidth = antennaDetailsAbridged.beamwidth
                createdAt = antennaDetailsAbridged.createdAt
                createdBy = antennaDetailsAbridged.createdBy
                description = antennaDetailsAbridged.description
                diameter = antennaDetailsAbridged.diameter
                endFrequency = antennaDetailsAbridged.endFrequency
                gain = antennaDetailsAbridged.gain
                gainTolerance = antennaDetailsAbridged.gainTolerance
                manufacturerOrgId = antennaDetailsAbridged.manufacturerOrgId
                mode = antennaDetailsAbridged.mode
                origin = antennaDetailsAbridged.origin
                origNetwork = antennaDetailsAbridged.origNetwork
                polarization = antennaDetailsAbridged.polarization
                position = antennaDetailsAbridged.position
                size = antennaDetailsAbridged.size.map { it.toMutableList() }
                startFrequency = antennaDetailsAbridged.startFrequency
                steerable = antennaDetailsAbridged.steerable
                type = antennaDetailsAbridged.type
                additionalProperties = antennaDetailsAbridged.additionalProperties.toMutableMap()
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

        /** Unique identifier of the parent Antenna. */
        fun idAntenna(idAntenna: String) = idAntenna(JsonField.of(idAntenna))

        /**
         * Sets [Builder.idAntenna] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idAntenna] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idAntenna(idAntenna: JsonField<String>) =
            apply {
                this.idAntenna = idAntenna
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

        /** Boolean indicating if this is a beam forming antenna. */
        fun beamForming(beamForming: Boolean) = beamForming(JsonField.of(beamForming))

        /**
         * Sets [Builder.beamForming] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beamForming] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun beamForming(beamForming: JsonField<Boolean>) =
            apply {
                this.beamForming = beamForming
            }

        /** Array of angles between the half-power (-3 dB) points of the main lobe of the antenna, in degrees. */
        fun beamwidth(beamwidth: Double) = beamwidth(JsonField.of(beamwidth))

        /**
         * Sets [Builder.beamwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beamwidth] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun beamwidth(beamwidth: JsonField<Double>) =
            apply {
                this.beamwidth = beamwidth
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

        /** Antenna description. */
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

        /** Antenna diameter in meters. */
        fun diameter(diameter: Double) = diameter(JsonField.of(diameter))

        /**
         * Sets [Builder.diameter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.diameter] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun diameter(diameter: JsonField<Double>) =
            apply {
                this.diameter = diameter
            }

        /** Antenna end of frequency range in Mhz. */
        fun endFrequency(endFrequency: Double) = endFrequency(JsonField.of(endFrequency))

        /**
         * Sets [Builder.endFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endFrequency] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endFrequency(endFrequency: JsonField<Double>) =
            apply {
                this.endFrequency = endFrequency
            }

        /** Antenna maximum gain in dBi. */
        fun gain(gain: Double) = gain(JsonField.of(gain))

        /**
         * Sets [Builder.gain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gain] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gain(gain: JsonField<Double>) =
            apply {
                this.gain = gain
            }

        /** Antenna gain tolerance in dB. */
        fun gainTolerance(gainTolerance: Double) = gainTolerance(JsonField.of(gainTolerance))

        /**
         * Sets [Builder.gainTolerance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gainTolerance] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gainTolerance(gainTolerance: JsonField<Double>) =
            apply {
                this.gainTolerance = gainTolerance
            }

        /** ID of the organization that manufactures the antenna. */
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

        /** Antenna mode (e.g. TX,RX). */
        fun mode(mode: Mode) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mode(mode: JsonField<Mode>) =
            apply {
                this.mode = mode
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

        /** Antenna polarization in degrees. */
        fun polarization(polarization: Double) = polarization(JsonField.of(polarization))

        /**
         * Sets [Builder.polarization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarization] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun polarization(polarization: JsonField<Double>) =
            apply {
                this.polarization = polarization
            }

        /** Antenna position (e.g. Top, Nadir, Side). */
        fun position(position: String) = position(JsonField.of(position))

        /**
         * Sets [Builder.position] to an arbitrary JSON value.
         *
         * You should usually call [Builder.position] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun position(position: JsonField<String>) =
            apply {
                this.position = position
            }

        /** Array with 1-2 values specifying the length and width (for rectangular) and just length for dipole antennas in meters. */
        fun size(size: List<Double>) = size(JsonField.of(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed `List<Double>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun size(size: JsonField<List<Double>>) =
            apply {
                this.size = size.map { it.toMutableList() }
            }

        /**
         * Adds a single [Double] to [Builder.size].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSize(size: Double) =
            apply {
                this.size = (this.size ?: JsonField.of(mutableListOf())).also {
                    checkKnown("size", it).add(size)
                }
            }

        /** Antenna start of frequency range in Mhz. */
        fun startFrequency(startFrequency: Double) = startFrequency(JsonField.of(startFrequency))

        /**
         * Sets [Builder.startFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startFrequency] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startFrequency(startFrequency: JsonField<Double>) =
            apply {
                this.startFrequency = startFrequency
            }

        /** Boolean indicating if this antenna is steerable. */
        fun steerable(steerable: Boolean) = steerable(JsonField.of(steerable))

        /**
         * Sets [Builder.steerable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.steerable] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun steerable(steerable: JsonField<Boolean>) =
            apply {
                this.steerable = steerable
            }

        /** Type of antenna (e.g. Reflector, Double Reflector, Shaped Reflector, Horn, Parabolic, etc.). */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<String>) =
            apply {
                this.type = type
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
         * Returns an immutable instance of [AntennaDetailsAbridged].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idAntenna()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AntennaDetailsAbridged =
            AntennaDetailsAbridged(
              checkRequired(
                "classificationMarking", classificationMarking
              ),
              checkRequired(
                "dataMode", dataMode
              ),
              checkRequired(
                "idAntenna", idAntenna
              ),
              checkRequired(
                "source", source
              ),
              id,
              beamForming,
              beamwidth,
              createdAt,
              createdBy,
              description,
              diameter,
              endFrequency,
              gain,
              gainTolerance,
              manufacturerOrgId,
              mode,
              origin,
              origNetwork,
              polarization,
              position,
              (size ?: JsonMissing.of()).map { it.toImmutable() },
              startFrequency,
              steerable,
              type,
              additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AntennaDetailsAbridged =
        apply {
            if (validated) {
              return@apply
            }

            classificationMarking()
            dataMode().validate()
            idAntenna()
            source()
            id()
            beamForming()
            beamwidth()
            createdAt()
            createdBy()
            description()
            diameter()
            endFrequency()
            gain()
            gainTolerance()
            manufacturerOrgId()
            mode().ifPresent { it.validate() }
            origin()
            origNetwork()
            polarization()
            position()
            size()
            startFrequency()
            steerable()
            type()
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
    internal fun validity(): Int = (if (classificationMarking.asKnown().isPresent) 1 else 0) + (dataMode.asKnown().getOrNull()?.validity() ?: 0) + (if (idAntenna.asKnown().isPresent) 1 else 0) + (if (source.asKnown().isPresent) 1 else 0) + (if (id.asKnown().isPresent) 1 else 0) + (if (beamForming.asKnown().isPresent) 1 else 0) + (if (beamwidth.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (createdBy.asKnown().isPresent) 1 else 0) + (if (description.asKnown().isPresent) 1 else 0) + (if (diameter.asKnown().isPresent) 1 else 0) + (if (endFrequency.asKnown().isPresent) 1 else 0) + (if (gain.asKnown().isPresent) 1 else 0) + (if (gainTolerance.asKnown().isPresent) 1 else 0) + (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) + (mode.asKnown().getOrNull()?.validity() ?: 0) + (if (origin.asKnown().isPresent) 1 else 0) + (if (origNetwork.asKnown().isPresent) 1 else 0) + (if (polarization.asKnown().isPresent) 1 else 0) + (if (position.asKnown().isPresent) 1 else 0) + (size.asKnown().getOrNull()?.size ?: 0) + (if (startFrequency.asKnown().isPresent) 1 else 0) + (if (steerable.asKnown().isPresent) 1 else 0) + (if (type.asKnown().isPresent) 1 else 0)

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

    /** Antenna mode (e.g. TX,RX). */
    class Mode @JsonCreator private constructor(
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
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
         *   an older version than the API, then the API may respond with new members that the SDK is unaware
         *   of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TX,
            RX,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                TX -> Value.TX
                RX -> Value.RX
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
                TX -> Known.TX
                RX -> Known.RX
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Mode: $value")
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

        fun validate(): Mode =
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

          return /* spotless:off */ other is Mode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is AntennaDetailsAbridged && classificationMarking == other.classificationMarking && dataMode == other.dataMode && idAntenna == other.idAntenna && source == other.source && id == other.id && beamForming == other.beamForming && beamwidth == other.beamwidth && createdAt == other.createdAt && createdBy == other.createdBy && description == other.description && diameter == other.diameter && endFrequency == other.endFrequency && gain == other.gain && gainTolerance == other.gainTolerance && manufacturerOrgId == other.manufacturerOrgId && mode == other.mode && origin == other.origin && origNetwork == other.origNetwork && polarization == other.polarization && position == other.position && size == other.size && startFrequency == other.startFrequency && steerable == other.steerable && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, idAntenna, source, id, beamForming, beamwidth, createdAt, createdBy, description, diameter, endFrequency, gain, gainTolerance, manufacturerOrgId, mode, origin, origNetwork, polarization, position, size, startFrequency, steerable, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "AntennaDetailsAbridged{classificationMarking=$classificationMarking, dataMode=$dataMode, idAntenna=$idAntenna, source=$source, id=$id, beamForming=$beamForming, beamwidth=$beamwidth, createdAt=$createdAt, createdBy=$createdBy, description=$description, diameter=$diameter, endFrequency=$endFrequency, gain=$gain, gainTolerance=$gainTolerance, manufacturerOrgId=$manufacturerOrgId, mode=$mode, origin=$origin, origNetwork=$origNetwork, polarization=$polarization, position=$position, size=$size, startFrequency=$startFrequency, steerable=$steerable, type=$type, additionalProperties=$additionalProperties}"
}

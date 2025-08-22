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
 * Known launch vehicle engine details and performance characteristics and limits compiled by a
 * particular source. A launch vehicle engine may have several details records from multiple
 * sources.
 */
class EngineDetailsFull
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idEngine: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val burnTime: JsonField<Double>,
    private val chamberPressure: JsonField<Double>,
    private val characteristicType: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val cycleType: JsonField<String>,
    private val family: JsonField<String>,
    private val manufacturerOrgId: JsonField<String>,
    private val maxFirings: JsonField<Int>,
    private val notes: JsonField<String>,
    private val nozzleExpansionRatio: JsonField<Double>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val oxidizer: JsonField<String>,
    private val propellant: JsonField<String>,
    private val seaLevelThrust: JsonField<Double>,
    private val specificImpulse: JsonField<Double>,
    private val tags: JsonField<List<String>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val vacuumThrust: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idEngine") @ExcludeMissing idEngine: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("burnTime") @ExcludeMissing burnTime: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("chamberPressure")
        @ExcludeMissing
        chamberPressure: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("characteristicType")
        @ExcludeMissing
        characteristicType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cycleType") @ExcludeMissing cycleType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("family") @ExcludeMissing family: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manufacturerOrgId")
        @ExcludeMissing
        manufacturerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxFirings") @ExcludeMissing maxFirings: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nozzleExpansionRatio")
        @ExcludeMissing
        nozzleExpansionRatio: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("oxidizer") @ExcludeMissing oxidizer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propellant")
        @ExcludeMissing
        propellant: JsonField<String> = JsonMissing.of(),
        @JsonProperty("seaLevelThrust")
        @ExcludeMissing
        seaLevelThrust: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("specificImpulse")
        @ExcludeMissing
        specificImpulse: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vacuumThrust")
        @ExcludeMissing
        vacuumThrust: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idEngine,
        source,
        id,
        burnTime,
        chamberPressure,
        characteristicType,
        createdAt,
        createdBy,
        cycleType,
        family,
        manufacturerOrgId,
        maxFirings,
        notes,
        nozzleExpansionRatio,
        origin,
        origNetwork,
        oxidizer,
        propellant,
        seaLevelThrust,
        specificImpulse,
        tags,
        updatedAt,
        updatedBy,
        vacuumThrust,
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
     * Identifier of the parent engine record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idEngine(): String = idEngine.getRequired("idEngine")

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
     * Launch engine maximum burn time in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun burnTime(): Optional<Double> = burnTime.getOptional("burnTime")

    /**
     * Engine chamber pressure in bars.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun chamberPressure(): Optional<Double> = chamberPressure.getOptional("chamberPressure")

    /**
     * Engine characteristic type (e.g. Electric, Mono-propellant, Bi-propellant, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun characteristicType(): Optional<String> =
        characteristicType.getOptional("characteristicType")

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
     * Engine cycle type (e.g. Electrostatic Ion, Pressure Fed, Hall, Catalytic Decomposition,
     * etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cycleType(): Optional<String> = cycleType.getOptional("cycleType")

    /**
     * Engine type or family.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun family(): Optional<String> = family.getOptional("family")

    /**
     * Organization ID of the engine manufacturer.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun manufacturerOrgId(): Optional<String> = manufacturerOrgId.getOptional("manufacturerOrgId")

    /**
     * Engine maximum number of firings.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxFirings(): Optional<Int> = maxFirings.getOptional("maxFirings")

    /**
     * Notes/Description of the engine.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * Engine nozzle expansion ratio.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nozzleExpansionRatio(): Optional<Double> =
        nozzleExpansionRatio.getOptional("nozzleExpansionRatio")

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
     * Oxidizer type (e.g. Nitrogen Tetroxide, Liquid Oxygen, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun oxidizer(): Optional<String> = oxidizer.getOptional("oxidizer")

    /**
     * Propellant/fuel type of the engine (e.g. Liquid Hydrogen, Kerosene, Aerozine, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun propellant(): Optional<String> = propellant.getOptional("propellant")

    /**
     * Engine maximum thrust at sea level in Kilo-Newtons.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun seaLevelThrust(): Optional<Double> = seaLevelThrust.getOptional("seaLevelThrust")

    /**
     * Launch engine specific impulse in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun specificImpulse(): Optional<Double> = specificImpulse.getOptional("specificImpulse")

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
     * Engine maximum thrust in a vacuum in Kilo-Newtons.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vacuumThrust(): Optional<Double> = vacuumThrust.getOptional("vacuumThrust")

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
     * Returns the raw JSON value of [idEngine].
     *
     * Unlike [idEngine], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idEngine") @ExcludeMissing fun _idEngine(): JsonField<String> = idEngine

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
     * Returns the raw JSON value of [burnTime].
     *
     * Unlike [burnTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("burnTime") @ExcludeMissing fun _burnTime(): JsonField<Double> = burnTime

    /**
     * Returns the raw JSON value of [chamberPressure].
     *
     * Unlike [chamberPressure], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chamberPressure")
    @ExcludeMissing
    fun _chamberPressure(): JsonField<Double> = chamberPressure

    /**
     * Returns the raw JSON value of [characteristicType].
     *
     * Unlike [characteristicType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("characteristicType")
    @ExcludeMissing
    fun _characteristicType(): JsonField<String> = characteristicType

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
     * Returns the raw JSON value of [cycleType].
     *
     * Unlike [cycleType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cycleType") @ExcludeMissing fun _cycleType(): JsonField<String> = cycleType

    /**
     * Returns the raw JSON value of [family].
     *
     * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("family") @ExcludeMissing fun _family(): JsonField<String> = family

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
     * Returns the raw JSON value of [maxFirings].
     *
     * Unlike [maxFirings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxFirings") @ExcludeMissing fun _maxFirings(): JsonField<Int> = maxFirings

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [nozzleExpansionRatio].
     *
     * Unlike [nozzleExpansionRatio], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("nozzleExpansionRatio")
    @ExcludeMissing
    fun _nozzleExpansionRatio(): JsonField<Double> = nozzleExpansionRatio

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
     * Returns the raw JSON value of [oxidizer].
     *
     * Unlike [oxidizer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("oxidizer") @ExcludeMissing fun _oxidizer(): JsonField<String> = oxidizer

    /**
     * Returns the raw JSON value of [propellant].
     *
     * Unlike [propellant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propellant") @ExcludeMissing fun _propellant(): JsonField<String> = propellant

    /**
     * Returns the raw JSON value of [seaLevelThrust].
     *
     * Unlike [seaLevelThrust], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seaLevelThrust")
    @ExcludeMissing
    fun _seaLevelThrust(): JsonField<Double> = seaLevelThrust

    /**
     * Returns the raw JSON value of [specificImpulse].
     *
     * Unlike [specificImpulse], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("specificImpulse")
    @ExcludeMissing
    fun _specificImpulse(): JsonField<Double> = specificImpulse

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
     * Returns the raw JSON value of [vacuumThrust].
     *
     * Unlike [vacuumThrust], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vacuumThrust")
    @ExcludeMissing
    fun _vacuumThrust(): JsonField<Double> = vacuumThrust

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
         * Returns a mutable builder for constructing an instance of [EngineDetailsFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idEngine()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EngineDetailsFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idEngine: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var burnTime: JsonField<Double> = JsonMissing.of()
        private var chamberPressure: JsonField<Double> = JsonMissing.of()
        private var characteristicType: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var cycleType: JsonField<String> = JsonMissing.of()
        private var family: JsonField<String> = JsonMissing.of()
        private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
        private var maxFirings: JsonField<Int> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var nozzleExpansionRatio: JsonField<Double> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var oxidizer: JsonField<String> = JsonMissing.of()
        private var propellant: JsonField<String> = JsonMissing.of()
        private var seaLevelThrust: JsonField<Double> = JsonMissing.of()
        private var specificImpulse: JsonField<Double> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var vacuumThrust: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(engineDetailsFull: EngineDetailsFull) = apply {
            classificationMarking = engineDetailsFull.classificationMarking
            dataMode = engineDetailsFull.dataMode
            idEngine = engineDetailsFull.idEngine
            source = engineDetailsFull.source
            id = engineDetailsFull.id
            burnTime = engineDetailsFull.burnTime
            chamberPressure = engineDetailsFull.chamberPressure
            characteristicType = engineDetailsFull.characteristicType
            createdAt = engineDetailsFull.createdAt
            createdBy = engineDetailsFull.createdBy
            cycleType = engineDetailsFull.cycleType
            family = engineDetailsFull.family
            manufacturerOrgId = engineDetailsFull.manufacturerOrgId
            maxFirings = engineDetailsFull.maxFirings
            notes = engineDetailsFull.notes
            nozzleExpansionRatio = engineDetailsFull.nozzleExpansionRatio
            origin = engineDetailsFull.origin
            origNetwork = engineDetailsFull.origNetwork
            oxidizer = engineDetailsFull.oxidizer
            propellant = engineDetailsFull.propellant
            seaLevelThrust = engineDetailsFull.seaLevelThrust
            specificImpulse = engineDetailsFull.specificImpulse
            tags = engineDetailsFull.tags.map { it.toMutableList() }
            updatedAt = engineDetailsFull.updatedAt
            updatedBy = engineDetailsFull.updatedBy
            vacuumThrust = engineDetailsFull.vacuumThrust
            additionalProperties = engineDetailsFull.additionalProperties.toMutableMap()
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

        /** Identifier of the parent engine record. */
        fun idEngine(idEngine: String) = idEngine(JsonField.of(idEngine))

        /**
         * Sets [Builder.idEngine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idEngine] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idEngine(idEngine: JsonField<String>) = apply { this.idEngine = idEngine }

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

        /** Launch engine maximum burn time in seconds. */
        fun burnTime(burnTime: Double) = burnTime(JsonField.of(burnTime))

        /**
         * Sets [Builder.burnTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.burnTime] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun burnTime(burnTime: JsonField<Double>) = apply { this.burnTime = burnTime }

        /** Engine chamber pressure in bars. */
        fun chamberPressure(chamberPressure: Double) =
            chamberPressure(JsonField.of(chamberPressure))

        /**
         * Sets [Builder.chamberPressure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chamberPressure] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun chamberPressure(chamberPressure: JsonField<Double>) = apply {
            this.chamberPressure = chamberPressure
        }

        /** Engine characteristic type (e.g. Electric, Mono-propellant, Bi-propellant, etc.). */
        fun characteristicType(characteristicType: String) =
            characteristicType(JsonField.of(characteristicType))

        /**
         * Sets [Builder.characteristicType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.characteristicType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun characteristicType(characteristicType: JsonField<String>) = apply {
            this.characteristicType = characteristicType
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
         * Engine cycle type (e.g. Electrostatic Ion, Pressure Fed, Hall, Catalytic Decomposition,
         * etc.).
         */
        fun cycleType(cycleType: String) = cycleType(JsonField.of(cycleType))

        /**
         * Sets [Builder.cycleType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cycleType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cycleType(cycleType: JsonField<String>) = apply { this.cycleType = cycleType }

        /** Engine type or family. */
        fun family(family: String) = family(JsonField.of(family))

        /**
         * Sets [Builder.family] to an arbitrary JSON value.
         *
         * You should usually call [Builder.family] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun family(family: JsonField<String>) = apply { this.family = family }

        /** Organization ID of the engine manufacturer. */
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

        /** Engine maximum number of firings. */
        fun maxFirings(maxFirings: Int) = maxFirings(JsonField.of(maxFirings))

        /**
         * Sets [Builder.maxFirings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxFirings] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxFirings(maxFirings: JsonField<Int>) = apply { this.maxFirings = maxFirings }

        /** Notes/Description of the engine. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

        /** Engine nozzle expansion ratio. */
        fun nozzleExpansionRatio(nozzleExpansionRatio: Double) =
            nozzleExpansionRatio(JsonField.of(nozzleExpansionRatio))

        /**
         * Sets [Builder.nozzleExpansionRatio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nozzleExpansionRatio] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nozzleExpansionRatio(nozzleExpansionRatio: JsonField<Double>) = apply {
            this.nozzleExpansionRatio = nozzleExpansionRatio
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

        /** Oxidizer type (e.g. Nitrogen Tetroxide, Liquid Oxygen, etc). */
        fun oxidizer(oxidizer: String) = oxidizer(JsonField.of(oxidizer))

        /**
         * Sets [Builder.oxidizer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oxidizer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun oxidizer(oxidizer: JsonField<String>) = apply { this.oxidizer = oxidizer }

        /** Propellant/fuel type of the engine (e.g. Liquid Hydrogen, Kerosene, Aerozine, etc). */
        fun propellant(propellant: String) = propellant(JsonField.of(propellant))

        /**
         * Sets [Builder.propellant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propellant] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun propellant(propellant: JsonField<String>) = apply { this.propellant = propellant }

        /** Engine maximum thrust at sea level in Kilo-Newtons. */
        fun seaLevelThrust(seaLevelThrust: Double) = seaLevelThrust(JsonField.of(seaLevelThrust))

        /**
         * Sets [Builder.seaLevelThrust] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seaLevelThrust] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun seaLevelThrust(seaLevelThrust: JsonField<Double>) = apply {
            this.seaLevelThrust = seaLevelThrust
        }

        /** Launch engine specific impulse in seconds. */
        fun specificImpulse(specificImpulse: Double) =
            specificImpulse(JsonField.of(specificImpulse))

        /**
         * Sets [Builder.specificImpulse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specificImpulse] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun specificImpulse(specificImpulse: JsonField<Double>) = apply {
            this.specificImpulse = specificImpulse
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

        /** Engine maximum thrust in a vacuum in Kilo-Newtons. */
        fun vacuumThrust(vacuumThrust: Double) = vacuumThrust(JsonField.of(vacuumThrust))

        /**
         * Sets [Builder.vacuumThrust] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vacuumThrust] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vacuumThrust(vacuumThrust: JsonField<Double>) = apply {
            this.vacuumThrust = vacuumThrust
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
         * Returns an immutable instance of [EngineDetailsFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idEngine()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EngineDetailsFull =
            EngineDetailsFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idEngine", idEngine),
                checkRequired("source", source),
                id,
                burnTime,
                chamberPressure,
                characteristicType,
                createdAt,
                createdBy,
                cycleType,
                family,
                manufacturerOrgId,
                maxFirings,
                notes,
                nozzleExpansionRatio,
                origin,
                origNetwork,
                oxidizer,
                propellant,
                seaLevelThrust,
                specificImpulse,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                updatedBy,
                vacuumThrust,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EngineDetailsFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idEngine()
        source()
        id()
        burnTime()
        chamberPressure()
        characteristicType()
        createdAt()
        createdBy()
        cycleType()
        family()
        manufacturerOrgId()
        maxFirings()
        notes()
        nozzleExpansionRatio()
        origin()
        origNetwork()
        oxidizer()
        propellant()
        seaLevelThrust()
        specificImpulse()
        tags()
        updatedAt()
        updatedBy()
        vacuumThrust()
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
            (if (idEngine.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (burnTime.asKnown().isPresent) 1 else 0) +
            (if (chamberPressure.asKnown().isPresent) 1 else 0) +
            (if (characteristicType.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (cycleType.asKnown().isPresent) 1 else 0) +
            (if (family.asKnown().isPresent) 1 else 0) +
            (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) +
            (if (maxFirings.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (nozzleExpansionRatio.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (oxidizer.asKnown().isPresent) 1 else 0) +
            (if (propellant.asKnown().isPresent) 1 else 0) +
            (if (seaLevelThrust.asKnown().isPresent) 1 else 0) +
            (if (specificImpulse.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (vacuumThrust.asKnown().isPresent) 1 else 0)

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

        return other is EngineDetailsFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            idEngine == other.idEngine &&
            source == other.source &&
            id == other.id &&
            burnTime == other.burnTime &&
            chamberPressure == other.chamberPressure &&
            characteristicType == other.characteristicType &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            cycleType == other.cycleType &&
            family == other.family &&
            manufacturerOrgId == other.manufacturerOrgId &&
            maxFirings == other.maxFirings &&
            notes == other.notes &&
            nozzleExpansionRatio == other.nozzleExpansionRatio &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            oxidizer == other.oxidizer &&
            propellant == other.propellant &&
            seaLevelThrust == other.seaLevelThrust &&
            specificImpulse == other.specificImpulse &&
            tags == other.tags &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            vacuumThrust == other.vacuumThrust &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            idEngine,
            source,
            id,
            burnTime,
            chamberPressure,
            characteristicType,
            createdAt,
            createdBy,
            cycleType,
            family,
            manufacturerOrgId,
            maxFirings,
            notes,
            nozzleExpansionRatio,
            origin,
            origNetwork,
            oxidizer,
            propellant,
            seaLevelThrust,
            specificImpulse,
            tags,
            updatedAt,
            updatedBy,
            vacuumThrust,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EngineDetailsFull{classificationMarking=$classificationMarking, dataMode=$dataMode, idEngine=$idEngine, source=$source, id=$id, burnTime=$burnTime, chamberPressure=$chamberPressure, characteristicType=$characteristicType, createdAt=$createdAt, createdBy=$createdBy, cycleType=$cycleType, family=$family, manufacturerOrgId=$manufacturerOrgId, maxFirings=$maxFirings, notes=$notes, nozzleExpansionRatio=$nozzleExpansionRatio, origin=$origin, origNetwork=$origNetwork, oxidizer=$oxidizer, propellant=$propellant, seaLevelThrust=$seaLevelThrust, specificImpulse=$specificImpulse, tags=$tags, updatedAt=$updatedAt, updatedBy=$updatedBy, vacuumThrust=$vacuumThrust, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.stage

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
import com.unifieddatalibrary.api.models.Engine
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Launch stage information for a particular launch vehicle. A launch vehicle can have several
 * stages, each with 1 to many engines.
 */
class StageGetResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idEngine: JsonField<String>,
    private val idLaunchVehicle: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val avionicsNotes: JsonField<String>,
    private val burnTime: JsonField<Double>,
    private val controlThruster1: JsonField<String>,
    private val controlThruster2: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val diameter: JsonField<Double>,
    private val engine: JsonField<Engine>,
    private val length: JsonField<Double>,
    private val mainEngineThrustSeaLevel: JsonField<Double>,
    private val mainEngineThrustVacuum: JsonField<Double>,
    private val manufacturerOrgId: JsonField<String>,
    private val mass: JsonField<Double>,
    private val notes: JsonField<String>,
    private val numBurns: JsonField<Int>,
    private val numControlThruster1: JsonField<Int>,
    private val numControlThruster2: JsonField<Int>,
    private val numEngines: JsonField<Int>,
    private val numStageElements: JsonField<Int>,
    private val numVernier: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val photoUrls: JsonField<List<String>>,
    private val restartable: JsonField<Boolean>,
    private val reusable: JsonField<Boolean>,
    private val stageNumber: JsonField<Int>,
    private val tags: JsonField<List<String>>,
    private val thrustSeaLevel: JsonField<Double>,
    private val thrustVacuum: JsonField<Double>,
    private val type: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val vernier: JsonField<String>,
    private val vernierBurnTime: JsonField<Double>,
    private val vernierNumBurns: JsonField<Int>,
    private val vernierThrustSeaLevel: JsonField<Double>,
    private val vernierThrustVacuum: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idEngine") @ExcludeMissing idEngine: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idLaunchVehicle")
        @ExcludeMissing
        idLaunchVehicle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("avionicsNotes")
        @ExcludeMissing
        avionicsNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("burnTime") @ExcludeMissing burnTime: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("controlThruster1")
        @ExcludeMissing
        controlThruster1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("controlThruster2")
        @ExcludeMissing
        controlThruster2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("diameter") @ExcludeMissing diameter: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("engine") @ExcludeMissing engine: JsonField<Engine> = JsonMissing.of(),
        @JsonProperty("length") @ExcludeMissing length: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("mainEngineThrustSeaLevel")
        @ExcludeMissing
        mainEngineThrustSeaLevel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("mainEngineThrustVacuum")
        @ExcludeMissing
        mainEngineThrustVacuum: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("manufacturerOrgId")
        @ExcludeMissing
        manufacturerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mass") @ExcludeMissing mass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numBurns") @ExcludeMissing numBurns: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numControlThruster1")
        @ExcludeMissing
        numControlThruster1: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numControlThruster2")
        @ExcludeMissing
        numControlThruster2: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numEngines") @ExcludeMissing numEngines: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numStageElements")
        @ExcludeMissing
        numStageElements: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numVernier") @ExcludeMissing numVernier: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("photoURLs")
        @ExcludeMissing
        photoUrls: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("restartable")
        @ExcludeMissing
        restartable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reusable") @ExcludeMissing reusable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("stageNumber") @ExcludeMissing stageNumber: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("thrustSeaLevel")
        @ExcludeMissing
        thrustSeaLevel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("thrustVacuum")
        @ExcludeMissing
        thrustVacuum: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vernier") @ExcludeMissing vernier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vernierBurnTime")
        @ExcludeMissing
        vernierBurnTime: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("vernierNumBurns")
        @ExcludeMissing
        vernierNumBurns: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("vernierThrustSeaLevel")
        @ExcludeMissing
        vernierThrustSeaLevel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("vernierThrustVacuum")
        @ExcludeMissing
        vernierThrustVacuum: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idEngine,
        idLaunchVehicle,
        source,
        id,
        avionicsNotes,
        burnTime,
        controlThruster1,
        controlThruster2,
        createdAt,
        createdBy,
        diameter,
        engine,
        length,
        mainEngineThrustSeaLevel,
        mainEngineThrustVacuum,
        manufacturerOrgId,
        mass,
        notes,
        numBurns,
        numControlThruster1,
        numControlThruster2,
        numEngines,
        numStageElements,
        numVernier,
        origin,
        origNetwork,
        photoUrls,
        restartable,
        reusable,
        stageNumber,
        tags,
        thrustSeaLevel,
        thrustVacuum,
        type,
        updatedAt,
        updatedBy,
        vernier,
        vernierBurnTime,
        vernierNumBurns,
        vernierThrustSeaLevel,
        vernierThrustVacuum,
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
     * Identifier of the Engine record for this stage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idEngine(): String = idEngine.getRequired("idEngine")

    /**
     * Identifier of the launch vehicle record for this stage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idLaunchVehicle(): String = idLaunchVehicle.getRequired("idLaunchVehicle")

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
     * Description/notes of the stage avionics.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avionicsNotes(): Optional<String> = avionicsNotes.getOptional("avionicsNotes")

    /**
     * Total burn time of the stage engines in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun burnTime(): Optional<Double> = burnTime.getOptional("burnTime")

    /**
     * Control thruster 1 type.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun controlThruster1(): Optional<String> = controlThruster1.getOptional("controlThruster1")

    /**
     * Control thruster 2 type.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun controlThruster2(): Optional<String> = controlThruster2.getOptional("controlThruster2")

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
     * Stage maximum external diameter in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun diameter(): Optional<Double> = diameter.getOptional("diameter")

    /**
     * Known launch vehicle engines and their performance characteristics and limits. A launch
     * vehicle has 1 to many engines per stage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun engine(): Optional<Engine> = engine.getOptional("engine")

    /**
     * Stage length in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun length(): Optional<Double> = length.getOptional("length")

    /**
     * Thrust of the stage main engine at sea level in kN.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mainEngineThrustSeaLevel(): Optional<Double> =
        mainEngineThrustSeaLevel.getOptional("mainEngineThrustSeaLevel")

    /**
     * Thrust of the stage main engine in a vacuum in kN.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mainEngineThrustVacuum(): Optional<Double> =
        mainEngineThrustVacuum.getOptional("mainEngineThrustVacuum")

    /**
     * ID of the organization that manufactures this launch stage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun manufacturerOrgId(): Optional<String> = manufacturerOrgId.getOptional("manufacturerOrgId")

    /**
     * Stage gross mass in kg.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mass(): Optional<Double> = mass.getOptional("mass")

    /**
     * Description/notes of the stage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * Number of burns for the stage engines.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numBurns(): Optional<Int> = numBurns.getOptional("numBurns")

    /**
     * Number of type control thruster 1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numControlThruster1(): Optional<Int> =
        numControlThruster1.getOptional("numControlThruster1")

    /**
     * Number of type control thruster 2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numControlThruster2(): Optional<Int> =
        numControlThruster2.getOptional("numControlThruster2")

    /**
     * The number of the specified engines on this launch stage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numEngines(): Optional<Int> = numEngines.getOptional("numEngines")

    /**
     * Number of launch stage elements used in this stage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numStageElements(): Optional<Int> = numStageElements.getOptional("numStageElements")

    /**
     * Number of vernier or additional engines.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numVernier(): Optional<Int> = numVernier.getOptional("numVernier")

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
     * Array of URLs of photos of the stage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun photoUrls(): Optional<List<String>> = photoUrls.getOptional("photoURLs")

    /**
     * Boolean indicating if this launch stage can be restarted.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun restartable(): Optional<Boolean> = restartable.getOptional("restartable")

    /**
     * Boolean indicating if this launch stage is reusable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reusable(): Optional<Boolean> = reusable.getOptional("reusable")

    /**
     * The stage number of this launch stage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stageNumber(): Optional<Int> = stageNumber.getOptional("stageNumber")

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
     * Total thrust of the stage at sea level in kN.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun thrustSeaLevel(): Optional<Double> = thrustSeaLevel.getOptional("thrustSeaLevel")

    /**
     * Total thrust of the stage in a vacuum in kN.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun thrustVacuum(): Optional<Double> = thrustVacuum.getOptional("thrustVacuum")

    /**
     * Engine cycle type (e.g. Electrostatic Ion, Pressure Fed, Hall, Catalytic Decomposition,
     * etc.).
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
     * Engine vernier or additional engine type.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vernier(): Optional<String> = vernier.getOptional("vernier")

    /**
     * Total burn time of the vernier or additional stage engines in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vernierBurnTime(): Optional<Double> = vernierBurnTime.getOptional("vernierBurnTime")

    /**
     * Total number of burns of the vernier or additional stage engines.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vernierNumBurns(): Optional<Int> = vernierNumBurns.getOptional("vernierNumBurns")

    /**
     * Total thrust of one of the vernier or additional engines at sea level in kN.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vernierThrustSeaLevel(): Optional<Double> =
        vernierThrustSeaLevel.getOptional("vernierThrustSeaLevel")

    /**
     * Total thrust of one of the vernier or additional engines in a vacuum in kN.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vernierThrustVacuum(): Optional<Double> =
        vernierThrustVacuum.getOptional("vernierThrustVacuum")

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
     * Returns the raw JSON value of [idLaunchVehicle].
     *
     * Unlike [idLaunchVehicle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idLaunchVehicle")
    @ExcludeMissing
    fun _idLaunchVehicle(): JsonField<String> = idLaunchVehicle

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
     * Returns the raw JSON value of [avionicsNotes].
     *
     * Unlike [avionicsNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avionicsNotes")
    @ExcludeMissing
    fun _avionicsNotes(): JsonField<String> = avionicsNotes

    /**
     * Returns the raw JSON value of [burnTime].
     *
     * Unlike [burnTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("burnTime") @ExcludeMissing fun _burnTime(): JsonField<Double> = burnTime

    /**
     * Returns the raw JSON value of [controlThruster1].
     *
     * Unlike [controlThruster1], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("controlThruster1")
    @ExcludeMissing
    fun _controlThruster1(): JsonField<String> = controlThruster1

    /**
     * Returns the raw JSON value of [controlThruster2].
     *
     * Unlike [controlThruster2], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("controlThruster2")
    @ExcludeMissing
    fun _controlThruster2(): JsonField<String> = controlThruster2

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
     * Returns the raw JSON value of [diameter].
     *
     * Unlike [diameter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("diameter") @ExcludeMissing fun _diameter(): JsonField<Double> = diameter

    /**
     * Returns the raw JSON value of [engine].
     *
     * Unlike [engine], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("engine") @ExcludeMissing fun _engine(): JsonField<Engine> = engine

    /**
     * Returns the raw JSON value of [length].
     *
     * Unlike [length], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Double> = length

    /**
     * Returns the raw JSON value of [mainEngineThrustSeaLevel].
     *
     * Unlike [mainEngineThrustSeaLevel], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("mainEngineThrustSeaLevel")
    @ExcludeMissing
    fun _mainEngineThrustSeaLevel(): JsonField<Double> = mainEngineThrustSeaLevel

    /**
     * Returns the raw JSON value of [mainEngineThrustVacuum].
     *
     * Unlike [mainEngineThrustVacuum], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("mainEngineThrustVacuum")
    @ExcludeMissing
    fun _mainEngineThrustVacuum(): JsonField<Double> = mainEngineThrustVacuum

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
     * Returns the raw JSON value of [mass].
     *
     * Unlike [mass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mass") @ExcludeMissing fun _mass(): JsonField<Double> = mass

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [numBurns].
     *
     * Unlike [numBurns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numBurns") @ExcludeMissing fun _numBurns(): JsonField<Int> = numBurns

    /**
     * Returns the raw JSON value of [numControlThruster1].
     *
     * Unlike [numControlThruster1], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("numControlThruster1")
    @ExcludeMissing
    fun _numControlThruster1(): JsonField<Int> = numControlThruster1

    /**
     * Returns the raw JSON value of [numControlThruster2].
     *
     * Unlike [numControlThruster2], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("numControlThruster2")
    @ExcludeMissing
    fun _numControlThruster2(): JsonField<Int> = numControlThruster2

    /**
     * Returns the raw JSON value of [numEngines].
     *
     * Unlike [numEngines], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numEngines") @ExcludeMissing fun _numEngines(): JsonField<Int> = numEngines

    /**
     * Returns the raw JSON value of [numStageElements].
     *
     * Unlike [numStageElements], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("numStageElements")
    @ExcludeMissing
    fun _numStageElements(): JsonField<Int> = numStageElements

    /**
     * Returns the raw JSON value of [numVernier].
     *
     * Unlike [numVernier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numVernier") @ExcludeMissing fun _numVernier(): JsonField<Int> = numVernier

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
     * Returns the raw JSON value of [photoUrls].
     *
     * Unlike [photoUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("photoURLs") @ExcludeMissing fun _photoUrls(): JsonField<List<String>> = photoUrls

    /**
     * Returns the raw JSON value of [restartable].
     *
     * Unlike [restartable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("restartable")
    @ExcludeMissing
    fun _restartable(): JsonField<Boolean> = restartable

    /**
     * Returns the raw JSON value of [reusable].
     *
     * Unlike [reusable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reusable") @ExcludeMissing fun _reusable(): JsonField<Boolean> = reusable

    /**
     * Returns the raw JSON value of [stageNumber].
     *
     * Unlike [stageNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stageNumber") @ExcludeMissing fun _stageNumber(): JsonField<Int> = stageNumber

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [thrustSeaLevel].
     *
     * Unlike [thrustSeaLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thrustSeaLevel")
    @ExcludeMissing
    fun _thrustSeaLevel(): JsonField<Double> = thrustSeaLevel

    /**
     * Returns the raw JSON value of [thrustVacuum].
     *
     * Unlike [thrustVacuum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thrustVacuum")
    @ExcludeMissing
    fun _thrustVacuum(): JsonField<Double> = thrustVacuum

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
     * Returns the raw JSON value of [vernier].
     *
     * Unlike [vernier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vernier") @ExcludeMissing fun _vernier(): JsonField<String> = vernier

    /**
     * Returns the raw JSON value of [vernierBurnTime].
     *
     * Unlike [vernierBurnTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vernierBurnTime")
    @ExcludeMissing
    fun _vernierBurnTime(): JsonField<Double> = vernierBurnTime

    /**
     * Returns the raw JSON value of [vernierNumBurns].
     *
     * Unlike [vernierNumBurns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vernierNumBurns")
    @ExcludeMissing
    fun _vernierNumBurns(): JsonField<Int> = vernierNumBurns

    /**
     * Returns the raw JSON value of [vernierThrustSeaLevel].
     *
     * Unlike [vernierThrustSeaLevel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("vernierThrustSeaLevel")
    @ExcludeMissing
    fun _vernierThrustSeaLevel(): JsonField<Double> = vernierThrustSeaLevel

    /**
     * Returns the raw JSON value of [vernierThrustVacuum].
     *
     * Unlike [vernierThrustVacuum], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("vernierThrustVacuum")
    @ExcludeMissing
    fun _vernierThrustVacuum(): JsonField<Double> = vernierThrustVacuum

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
         * Returns a mutable builder for constructing an instance of [StageGetResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idEngine()
         * .idLaunchVehicle()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StageGetResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idEngine: JsonField<String>? = null
        private var idLaunchVehicle: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var avionicsNotes: JsonField<String> = JsonMissing.of()
        private var burnTime: JsonField<Double> = JsonMissing.of()
        private var controlThruster1: JsonField<String> = JsonMissing.of()
        private var controlThruster2: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var diameter: JsonField<Double> = JsonMissing.of()
        private var engine: JsonField<Engine> = JsonMissing.of()
        private var length: JsonField<Double> = JsonMissing.of()
        private var mainEngineThrustSeaLevel: JsonField<Double> = JsonMissing.of()
        private var mainEngineThrustVacuum: JsonField<Double> = JsonMissing.of()
        private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
        private var mass: JsonField<Double> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var numBurns: JsonField<Int> = JsonMissing.of()
        private var numControlThruster1: JsonField<Int> = JsonMissing.of()
        private var numControlThruster2: JsonField<Int> = JsonMissing.of()
        private var numEngines: JsonField<Int> = JsonMissing.of()
        private var numStageElements: JsonField<Int> = JsonMissing.of()
        private var numVernier: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var photoUrls: JsonField<MutableList<String>>? = null
        private var restartable: JsonField<Boolean> = JsonMissing.of()
        private var reusable: JsonField<Boolean> = JsonMissing.of()
        private var stageNumber: JsonField<Int> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var thrustSeaLevel: JsonField<Double> = JsonMissing.of()
        private var thrustVacuum: JsonField<Double> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var vernier: JsonField<String> = JsonMissing.of()
        private var vernierBurnTime: JsonField<Double> = JsonMissing.of()
        private var vernierNumBurns: JsonField<Int> = JsonMissing.of()
        private var vernierThrustSeaLevel: JsonField<Double> = JsonMissing.of()
        private var vernierThrustVacuum: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stageGetResponse: StageGetResponse) = apply {
            classificationMarking = stageGetResponse.classificationMarking
            dataMode = stageGetResponse.dataMode
            idEngine = stageGetResponse.idEngine
            idLaunchVehicle = stageGetResponse.idLaunchVehicle
            source = stageGetResponse.source
            id = stageGetResponse.id
            avionicsNotes = stageGetResponse.avionicsNotes
            burnTime = stageGetResponse.burnTime
            controlThruster1 = stageGetResponse.controlThruster1
            controlThruster2 = stageGetResponse.controlThruster2
            createdAt = stageGetResponse.createdAt
            createdBy = stageGetResponse.createdBy
            diameter = stageGetResponse.diameter
            engine = stageGetResponse.engine
            length = stageGetResponse.length
            mainEngineThrustSeaLevel = stageGetResponse.mainEngineThrustSeaLevel
            mainEngineThrustVacuum = stageGetResponse.mainEngineThrustVacuum
            manufacturerOrgId = stageGetResponse.manufacturerOrgId
            mass = stageGetResponse.mass
            notes = stageGetResponse.notes
            numBurns = stageGetResponse.numBurns
            numControlThruster1 = stageGetResponse.numControlThruster1
            numControlThruster2 = stageGetResponse.numControlThruster2
            numEngines = stageGetResponse.numEngines
            numStageElements = stageGetResponse.numStageElements
            numVernier = stageGetResponse.numVernier
            origin = stageGetResponse.origin
            origNetwork = stageGetResponse.origNetwork
            photoUrls = stageGetResponse.photoUrls.map { it.toMutableList() }
            restartable = stageGetResponse.restartable
            reusable = stageGetResponse.reusable
            stageNumber = stageGetResponse.stageNumber
            tags = stageGetResponse.tags.map { it.toMutableList() }
            thrustSeaLevel = stageGetResponse.thrustSeaLevel
            thrustVacuum = stageGetResponse.thrustVacuum
            type = stageGetResponse.type
            updatedAt = stageGetResponse.updatedAt
            updatedBy = stageGetResponse.updatedBy
            vernier = stageGetResponse.vernier
            vernierBurnTime = stageGetResponse.vernierBurnTime
            vernierNumBurns = stageGetResponse.vernierNumBurns
            vernierThrustSeaLevel = stageGetResponse.vernierThrustSeaLevel
            vernierThrustVacuum = stageGetResponse.vernierThrustVacuum
            additionalProperties = stageGetResponse.additionalProperties.toMutableMap()
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

        /** Identifier of the Engine record for this stage. */
        fun idEngine(idEngine: String) = idEngine(JsonField.of(idEngine))

        /**
         * Sets [Builder.idEngine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idEngine] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idEngine(idEngine: JsonField<String>) = apply { this.idEngine = idEngine }

        /** Identifier of the launch vehicle record for this stage. */
        fun idLaunchVehicle(idLaunchVehicle: String) =
            idLaunchVehicle(JsonField.of(idLaunchVehicle))

        /**
         * Sets [Builder.idLaunchVehicle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idLaunchVehicle] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idLaunchVehicle(idLaunchVehicle: JsonField<String>) = apply {
            this.idLaunchVehicle = idLaunchVehicle
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

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Description/notes of the stage avionics. */
        fun avionicsNotes(avionicsNotes: String) = avionicsNotes(JsonField.of(avionicsNotes))

        /**
         * Sets [Builder.avionicsNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avionicsNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun avionicsNotes(avionicsNotes: JsonField<String>) = apply {
            this.avionicsNotes = avionicsNotes
        }

        /** Total burn time of the stage engines in seconds. */
        fun burnTime(burnTime: Double) = burnTime(JsonField.of(burnTime))

        /**
         * Sets [Builder.burnTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.burnTime] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun burnTime(burnTime: JsonField<Double>) = apply { this.burnTime = burnTime }

        /** Control thruster 1 type. */
        fun controlThruster1(controlThruster1: String) =
            controlThruster1(JsonField.of(controlThruster1))

        /**
         * Sets [Builder.controlThruster1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.controlThruster1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun controlThruster1(controlThruster1: JsonField<String>) = apply {
            this.controlThruster1 = controlThruster1
        }

        /** Control thruster 2 type. */
        fun controlThruster2(controlThruster2: String) =
            controlThruster2(JsonField.of(controlThruster2))

        /**
         * Sets [Builder.controlThruster2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.controlThruster2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun controlThruster2(controlThruster2: JsonField<String>) = apply {
            this.controlThruster2 = controlThruster2
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

        /** Stage maximum external diameter in meters. */
        fun diameter(diameter: Double) = diameter(JsonField.of(diameter))

        /**
         * Sets [Builder.diameter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.diameter] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun diameter(diameter: JsonField<Double>) = apply { this.diameter = diameter }

        /**
         * Known launch vehicle engines and their performance characteristics and limits. A launch
         * vehicle has 1 to many engines per stage.
         */
        fun engine(engine: Engine) = engine(JsonField.of(engine))

        /**
         * Sets [Builder.engine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.engine] with a well-typed [Engine] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun engine(engine: JsonField<Engine>) = apply { this.engine = engine }

        /** Stage length in meters. */
        fun length(length: Double) = length(JsonField.of(length))

        /**
         * Sets [Builder.length] to an arbitrary JSON value.
         *
         * You should usually call [Builder.length] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun length(length: JsonField<Double>) = apply { this.length = length }

        /** Thrust of the stage main engine at sea level in kN. */
        fun mainEngineThrustSeaLevel(mainEngineThrustSeaLevel: Double) =
            mainEngineThrustSeaLevel(JsonField.of(mainEngineThrustSeaLevel))

        /**
         * Sets [Builder.mainEngineThrustSeaLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mainEngineThrustSeaLevel] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun mainEngineThrustSeaLevel(mainEngineThrustSeaLevel: JsonField<Double>) = apply {
            this.mainEngineThrustSeaLevel = mainEngineThrustSeaLevel
        }

        /** Thrust of the stage main engine in a vacuum in kN. */
        fun mainEngineThrustVacuum(mainEngineThrustVacuum: Double) =
            mainEngineThrustVacuum(JsonField.of(mainEngineThrustVacuum))

        /**
         * Sets [Builder.mainEngineThrustVacuum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mainEngineThrustVacuum] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mainEngineThrustVacuum(mainEngineThrustVacuum: JsonField<Double>) = apply {
            this.mainEngineThrustVacuum = mainEngineThrustVacuum
        }

        /** ID of the organization that manufactures this launch stage. */
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

        /** Stage gross mass in kg. */
        fun mass(mass: Double) = mass(JsonField.of(mass))

        /**
         * Sets [Builder.mass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mass] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mass(mass: JsonField<Double>) = apply { this.mass = mass }

        /** Description/notes of the stage. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

        /** Number of burns for the stage engines. */
        fun numBurns(numBurns: Int) = numBurns(JsonField.of(numBurns))

        /**
         * Sets [Builder.numBurns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numBurns] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numBurns(numBurns: JsonField<Int>) = apply { this.numBurns = numBurns }

        /** Number of type control thruster 1. */
        fun numControlThruster1(numControlThruster1: Int) =
            numControlThruster1(JsonField.of(numControlThruster1))

        /**
         * Sets [Builder.numControlThruster1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numControlThruster1] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numControlThruster1(numControlThruster1: JsonField<Int>) = apply {
            this.numControlThruster1 = numControlThruster1
        }

        /** Number of type control thruster 2. */
        fun numControlThruster2(numControlThruster2: Int) =
            numControlThruster2(JsonField.of(numControlThruster2))

        /**
         * Sets [Builder.numControlThruster2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numControlThruster2] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numControlThruster2(numControlThruster2: JsonField<Int>) = apply {
            this.numControlThruster2 = numControlThruster2
        }

        /** The number of the specified engines on this launch stage. */
        fun numEngines(numEngines: Int) = numEngines(JsonField.of(numEngines))

        /**
         * Sets [Builder.numEngines] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numEngines] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numEngines(numEngines: JsonField<Int>) = apply { this.numEngines = numEngines }

        /** Number of launch stage elements used in this stage. */
        fun numStageElements(numStageElements: Int) =
            numStageElements(JsonField.of(numStageElements))

        /**
         * Sets [Builder.numStageElements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numStageElements] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numStageElements(numStageElements: JsonField<Int>) = apply {
            this.numStageElements = numStageElements
        }

        /** Number of vernier or additional engines. */
        fun numVernier(numVernier: Int) = numVernier(JsonField.of(numVernier))

        /**
         * Sets [Builder.numVernier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numVernier] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numVernier(numVernier: JsonField<Int>) = apply { this.numVernier = numVernier }

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

        /** Array of URLs of photos of the stage. */
        fun photoUrls(photoUrls: List<String>) = photoUrls(JsonField.of(photoUrls))

        /**
         * Sets [Builder.photoUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.photoUrls] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun photoUrls(photoUrls: JsonField<List<String>>) = apply {
            this.photoUrls = photoUrls.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [photoUrls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhotoUrl(photoUrl: String) = apply {
            photoUrls =
                (photoUrls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("photoUrls", it).add(photoUrl)
                }
        }

        /** Boolean indicating if this launch stage can be restarted. */
        fun restartable(restartable: Boolean) = restartable(JsonField.of(restartable))

        /**
         * Sets [Builder.restartable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restartable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun restartable(restartable: JsonField<Boolean>) = apply { this.restartable = restartable }

        /** Boolean indicating if this launch stage is reusable. */
        fun reusable(reusable: Boolean) = reusable(JsonField.of(reusable))

        /**
         * Sets [Builder.reusable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reusable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reusable(reusable: JsonField<Boolean>) = apply { this.reusable = reusable }

        /** The stage number of this launch stage. */
        fun stageNumber(stageNumber: Int) = stageNumber(JsonField.of(stageNumber))

        /**
         * Sets [Builder.stageNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stageNumber] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stageNumber(stageNumber: JsonField<Int>) = apply { this.stageNumber = stageNumber }

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

        /** Total thrust of the stage at sea level in kN. */
        fun thrustSeaLevel(thrustSeaLevel: Double) = thrustSeaLevel(JsonField.of(thrustSeaLevel))

        /**
         * Sets [Builder.thrustSeaLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thrustSeaLevel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thrustSeaLevel(thrustSeaLevel: JsonField<Double>) = apply {
            this.thrustSeaLevel = thrustSeaLevel
        }

        /** Total thrust of the stage in a vacuum in kN. */
        fun thrustVacuum(thrustVacuum: Double) = thrustVacuum(JsonField.of(thrustVacuum))

        /**
         * Sets [Builder.thrustVacuum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thrustVacuum] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun thrustVacuum(thrustVacuum: JsonField<Double>) = apply {
            this.thrustVacuum = thrustVacuum
        }

        /**
         * Engine cycle type (e.g. Electrostatic Ion, Pressure Fed, Hall, Catalytic Decomposition,
         * etc.).
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

        /** Engine vernier or additional engine type. */
        fun vernier(vernier: String) = vernier(JsonField.of(vernier))

        /**
         * Sets [Builder.vernier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vernier] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vernier(vernier: JsonField<String>) = apply { this.vernier = vernier }

        /** Total burn time of the vernier or additional stage engines in seconds. */
        fun vernierBurnTime(vernierBurnTime: Double) =
            vernierBurnTime(JsonField.of(vernierBurnTime))

        /**
         * Sets [Builder.vernierBurnTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vernierBurnTime] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vernierBurnTime(vernierBurnTime: JsonField<Double>) = apply {
            this.vernierBurnTime = vernierBurnTime
        }

        /** Total number of burns of the vernier or additional stage engines. */
        fun vernierNumBurns(vernierNumBurns: Int) = vernierNumBurns(JsonField.of(vernierNumBurns))

        /**
         * Sets [Builder.vernierNumBurns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vernierNumBurns] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vernierNumBurns(vernierNumBurns: JsonField<Int>) = apply {
            this.vernierNumBurns = vernierNumBurns
        }

        /** Total thrust of one of the vernier or additional engines at sea level in kN. */
        fun vernierThrustSeaLevel(vernierThrustSeaLevel: Double) =
            vernierThrustSeaLevel(JsonField.of(vernierThrustSeaLevel))

        /**
         * Sets [Builder.vernierThrustSeaLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vernierThrustSeaLevel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vernierThrustSeaLevel(vernierThrustSeaLevel: JsonField<Double>) = apply {
            this.vernierThrustSeaLevel = vernierThrustSeaLevel
        }

        /** Total thrust of one of the vernier or additional engines in a vacuum in kN. */
        fun vernierThrustVacuum(vernierThrustVacuum: Double) =
            vernierThrustVacuum(JsonField.of(vernierThrustVacuum))

        /**
         * Sets [Builder.vernierThrustVacuum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vernierThrustVacuum] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vernierThrustVacuum(vernierThrustVacuum: JsonField<Double>) = apply {
            this.vernierThrustVacuum = vernierThrustVacuum
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
         * Returns an immutable instance of [StageGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idEngine()
         * .idLaunchVehicle()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StageGetResponse =
            StageGetResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idEngine", idEngine),
                checkRequired("idLaunchVehicle", idLaunchVehicle),
                checkRequired("source", source),
                id,
                avionicsNotes,
                burnTime,
                controlThruster1,
                controlThruster2,
                createdAt,
                createdBy,
                diameter,
                engine,
                length,
                mainEngineThrustSeaLevel,
                mainEngineThrustVacuum,
                manufacturerOrgId,
                mass,
                notes,
                numBurns,
                numControlThruster1,
                numControlThruster2,
                numEngines,
                numStageElements,
                numVernier,
                origin,
                origNetwork,
                (photoUrls ?: JsonMissing.of()).map { it.toImmutable() },
                restartable,
                reusable,
                stageNumber,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                thrustSeaLevel,
                thrustVacuum,
                type,
                updatedAt,
                updatedBy,
                vernier,
                vernierBurnTime,
                vernierNumBurns,
                vernierThrustSeaLevel,
                vernierThrustVacuum,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StageGetResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idEngine()
        idLaunchVehicle()
        source()
        id()
        avionicsNotes()
        burnTime()
        controlThruster1()
        controlThruster2()
        createdAt()
        createdBy()
        diameter()
        engine().ifPresent { it.validate() }
        length()
        mainEngineThrustSeaLevel()
        mainEngineThrustVacuum()
        manufacturerOrgId()
        mass()
        notes()
        numBurns()
        numControlThruster1()
        numControlThruster2()
        numEngines()
        numStageElements()
        numVernier()
        origin()
        origNetwork()
        photoUrls()
        restartable()
        reusable()
        stageNumber()
        tags()
        thrustSeaLevel()
        thrustVacuum()
        type()
        updatedAt()
        updatedBy()
        vernier()
        vernierBurnTime()
        vernierNumBurns()
        vernierThrustSeaLevel()
        vernierThrustVacuum()
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
            (if (idLaunchVehicle.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (avionicsNotes.asKnown().isPresent) 1 else 0) +
            (if (burnTime.asKnown().isPresent) 1 else 0) +
            (if (controlThruster1.asKnown().isPresent) 1 else 0) +
            (if (controlThruster2.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (diameter.asKnown().isPresent) 1 else 0) +
            (engine.asKnown().getOrNull()?.validity() ?: 0) +
            (if (length.asKnown().isPresent) 1 else 0) +
            (if (mainEngineThrustSeaLevel.asKnown().isPresent) 1 else 0) +
            (if (mainEngineThrustVacuum.asKnown().isPresent) 1 else 0) +
            (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) +
            (if (mass.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (numBurns.asKnown().isPresent) 1 else 0) +
            (if (numControlThruster1.asKnown().isPresent) 1 else 0) +
            (if (numControlThruster2.asKnown().isPresent) 1 else 0) +
            (if (numEngines.asKnown().isPresent) 1 else 0) +
            (if (numStageElements.asKnown().isPresent) 1 else 0) +
            (if (numVernier.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (photoUrls.asKnown().getOrNull()?.size ?: 0) +
            (if (restartable.asKnown().isPresent) 1 else 0) +
            (if (reusable.asKnown().isPresent) 1 else 0) +
            (if (stageNumber.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (thrustSeaLevel.asKnown().isPresent) 1 else 0) +
            (if (thrustVacuum.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (vernier.asKnown().isPresent) 1 else 0) +
            (if (vernierBurnTime.asKnown().isPresent) 1 else 0) +
            (if (vernierNumBurns.asKnown().isPresent) 1 else 0) +
            (if (vernierThrustSeaLevel.asKnown().isPresent) 1 else 0) +
            (if (vernierThrustVacuum.asKnown().isPresent) 1 else 0)

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

            return /* spotless:off */ other is DataMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StageGetResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && idEngine == other.idEngine && idLaunchVehicle == other.idLaunchVehicle && source == other.source && id == other.id && avionicsNotes == other.avionicsNotes && burnTime == other.burnTime && controlThruster1 == other.controlThruster1 && controlThruster2 == other.controlThruster2 && createdAt == other.createdAt && createdBy == other.createdBy && diameter == other.diameter && engine == other.engine && length == other.length && mainEngineThrustSeaLevel == other.mainEngineThrustSeaLevel && mainEngineThrustVacuum == other.mainEngineThrustVacuum && manufacturerOrgId == other.manufacturerOrgId && mass == other.mass && notes == other.notes && numBurns == other.numBurns && numControlThruster1 == other.numControlThruster1 && numControlThruster2 == other.numControlThruster2 && numEngines == other.numEngines && numStageElements == other.numStageElements && numVernier == other.numVernier && origin == other.origin && origNetwork == other.origNetwork && photoUrls == other.photoUrls && restartable == other.restartable && reusable == other.reusable && stageNumber == other.stageNumber && tags == other.tags && thrustSeaLevel == other.thrustSeaLevel && thrustVacuum == other.thrustVacuum && type == other.type && updatedAt == other.updatedAt && updatedBy == other.updatedBy && vernier == other.vernier && vernierBurnTime == other.vernierBurnTime && vernierNumBurns == other.vernierNumBurns && vernierThrustSeaLevel == other.vernierThrustSeaLevel && vernierThrustVacuum == other.vernierThrustVacuum && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, idEngine, idLaunchVehicle, source, id, avionicsNotes, burnTime, controlThruster1, controlThruster2, createdAt, createdBy, diameter, engine, length, mainEngineThrustSeaLevel, mainEngineThrustVacuum, manufacturerOrgId, mass, notes, numBurns, numControlThruster1, numControlThruster2, numEngines, numStageElements, numVernier, origin, origNetwork, photoUrls, restartable, reusable, stageNumber, tags, thrustSeaLevel, thrustVacuum, type, updatedAt, updatedBy, vernier, vernierBurnTime, vernierNumBurns, vernierThrustSeaLevel, vernierThrustVacuum, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StageGetResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, idEngine=$idEngine, idLaunchVehicle=$idLaunchVehicle, source=$source, id=$id, avionicsNotes=$avionicsNotes, burnTime=$burnTime, controlThruster1=$controlThruster1, controlThruster2=$controlThruster2, createdAt=$createdAt, createdBy=$createdBy, diameter=$diameter, engine=$engine, length=$length, mainEngineThrustSeaLevel=$mainEngineThrustSeaLevel, mainEngineThrustVacuum=$mainEngineThrustVacuum, manufacturerOrgId=$manufacturerOrgId, mass=$mass, notes=$notes, numBurns=$numBurns, numControlThruster1=$numControlThruster1, numControlThruster2=$numControlThruster2, numEngines=$numEngines, numStageElements=$numStageElements, numVernier=$numVernier, origin=$origin, origNetwork=$origNetwork, photoUrls=$photoUrls, restartable=$restartable, reusable=$reusable, stageNumber=$stageNumber, tags=$tags, thrustSeaLevel=$thrustSeaLevel, thrustVacuum=$thrustVacuum, type=$type, updatedAt=$updatedAt, updatedBy=$updatedBy, vernier=$vernier, vernierBurnTime=$vernierBurnTime, vernierNumBurns=$vernierNumBurns, vernierThrustSeaLevel=$vernierThrustSeaLevel, vernierThrustVacuum=$vernierThrustVacuum, additionalProperties=$additionalProperties}"
}

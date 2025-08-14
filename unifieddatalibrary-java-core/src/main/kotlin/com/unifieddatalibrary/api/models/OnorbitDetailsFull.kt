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

/** Contains details of the OnOrbit object. */
class OnorbitDetailsFull
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idOnOrbit: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val additionalMass: JsonField<Double>,
    private val adeptRadius: JsonField<Double>,
    private val bolDeltaV: JsonField<Double>,
    private val bolFuelMass: JsonField<Double>,
    private val busCrossSection: JsonField<Double>,
    private val busType: JsonField<String>,
    private val colaRadius: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val crossSection: JsonField<Double>,
    private val currentMass: JsonField<Double>,
    private val deltaVUnc: JsonField<Double>,
    private val depEstMasses: JsonField<List<Double>>,
    private val depMassUncs: JsonField<List<Double>>,
    private val depNames: JsonField<List<String>>,
    private val driftRate: JsonField<Double>,
    private val dryMass: JsonField<Double>,
    private val estDeltaVDuration: JsonField<Double>,
    private val fuelRemaining: JsonField<Double>,
    private val geoSlot: JsonField<Double>,
    private val lastObSource: JsonField<String>,
    private val lastObTime: JsonField<OffsetDateTime>,
    private val launchMass: JsonField<Double>,
    private val launchMassMax: JsonField<Double>,
    private val launchMassMin: JsonField<Double>,
    private val maneuverable: JsonField<Boolean>,
    private val maxDeltaV: JsonField<Double>,
    private val maxRadius: JsonField<Double>,
    private val missionTypes: JsonField<List<String>>,
    private val numDeployable: JsonField<Int>,
    private val numMission: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val rcs: JsonField<Double>,
    private val rcsMax: JsonField<Double>,
    private val rcsMean: JsonField<Double>,
    private val rcsMin: JsonField<Double>,
    private val refSource: JsonField<String>,
    private val solarArrayArea: JsonField<Double>,
    private val totalMassUnc: JsonField<Double>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val vismag: JsonField<Double>,
    private val vismagMax: JsonField<Double>,
    private val vismagMean: JsonField<Double>,
    private val vismagMin: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("additionalMass")
        @ExcludeMissing
        additionalMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("adeptRadius")
        @ExcludeMissing
        adeptRadius: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bolDeltaV") @ExcludeMissing bolDeltaV: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bolFuelMass")
        @ExcludeMissing
        bolFuelMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("busCrossSection")
        @ExcludeMissing
        busCrossSection: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("busType") @ExcludeMissing busType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("colaRadius")
        @ExcludeMissing
        colaRadius: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("crossSection")
        @ExcludeMissing
        crossSection: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currentMass")
        @ExcludeMissing
        currentMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("deltaVUnc") @ExcludeMissing deltaVUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("depEstMasses")
        @ExcludeMissing
        depEstMasses: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("depMassUncs")
        @ExcludeMissing
        depMassUncs: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("depNames")
        @ExcludeMissing
        depNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("driftRate") @ExcludeMissing driftRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dryMass") @ExcludeMissing dryMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("estDeltaVDuration")
        @ExcludeMissing
        estDeltaVDuration: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fuelRemaining")
        @ExcludeMissing
        fuelRemaining: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("geoSlot") @ExcludeMissing geoSlot: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lastObSource")
        @ExcludeMissing
        lastObSource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastObTime")
        @ExcludeMissing
        lastObTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("launchMass")
        @ExcludeMissing
        launchMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchMassMax")
        @ExcludeMissing
        launchMassMax: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchMassMin")
        @ExcludeMissing
        launchMassMin: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maneuverable")
        @ExcludeMissing
        maneuverable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("maxDeltaV") @ExcludeMissing maxDeltaV: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxRadius") @ExcludeMissing maxRadius: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("missionTypes")
        @ExcludeMissing
        missionTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("numDeployable")
        @ExcludeMissing
        numDeployable: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numMission") @ExcludeMissing numMission: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rcs") @ExcludeMissing rcs: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rcsMax") @ExcludeMissing rcsMax: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rcsMean") @ExcludeMissing rcsMean: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rcsMin") @ExcludeMissing rcsMin: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("refSource") @ExcludeMissing refSource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("solarArrayArea")
        @ExcludeMissing
        solarArrayArea: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("totalMassUnc")
        @ExcludeMissing
        totalMassUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vismag") @ExcludeMissing vismag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("vismagMax") @ExcludeMissing vismagMax: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("vismagMean")
        @ExcludeMissing
        vismagMean: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("vismagMin") @ExcludeMissing vismagMin: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idOnOrbit,
        source,
        id,
        additionalMass,
        adeptRadius,
        bolDeltaV,
        bolFuelMass,
        busCrossSection,
        busType,
        colaRadius,
        createdAt,
        createdBy,
        crossSection,
        currentMass,
        deltaVUnc,
        depEstMasses,
        depMassUncs,
        depNames,
        driftRate,
        dryMass,
        estDeltaVDuration,
        fuelRemaining,
        geoSlot,
        lastObSource,
        lastObTime,
        launchMass,
        launchMassMax,
        launchMassMin,
        maneuverable,
        maxDeltaV,
        maxRadius,
        missionTypes,
        numDeployable,
        numMission,
        origin,
        origNetwork,
        rcs,
        rcsMax,
        rcsMean,
        rcsMin,
        refSource,
        solarArrayArea,
        totalMassUnc,
        updatedAt,
        updatedBy,
        vismag,
        vismagMax,
        vismagMean,
        vismagMin,
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
     * UUID of the parent Onorbit record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idOnOrbit(): String = idOnOrbit.getRequired("idOnOrbit")

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
     * Mass of fuel and disposables at launch time in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun additionalMass(): Optional<Double> = additionalMass.getOptional("additionalMass")

    /**
     * The radius used for long-term debris environment projection analyses that is not as
     * conservative as COLA Radius, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun adeptRadius(): Optional<Double> = adeptRadius.getOptional("adeptRadius")

    /**
     * The total beginning of life delta V of the spacecraft, in meters per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bolDeltaV(): Optional<Double> = bolDeltaV.getOptional("bolDeltaV")

    /**
     * Spacecraft beginning of life fuel mass, in orbit, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bolFuelMass(): Optional<Double> = bolFuelMass.getOptional("bolFuelMass")

    /**
     * Average cross sectional area of the bus in meters squared.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun busCrossSection(): Optional<Double> = busCrossSection.getOptional("busCrossSection")

    /**
     * Type of the bus on the spacecraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun busType(): Optional<String> = busType.getOptional("busType")

    /**
     * Maximum dimension of the box circumscribing the spacecraft (d = sqrt(a*a + b*b + c\*c) where
     * a is the tip-to-tip dimension, b and c are perpendicular to that.) in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun colaRadius(): Optional<Double> = colaRadius.getOptional("colaRadius")

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
     * Average cross sectional area in meters squared.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun crossSection(): Optional<Double> = crossSection.getOptional("crossSection")

    /**
     * The estimated total current mass of the spacecraft, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun currentMass(): Optional<Double> = currentMass.getOptional("currentMass")

    /**
     * The 1-sigma uncertainty of the total spacecraft delta V, in meters per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun deltaVUnc(): Optional<Double> = deltaVUnc.getOptional("deltaVUnc")

    /**
     * Array of the estimated mass of each deployable object, in kilograms. Must contain the same
     * number of elements as the value of numDeployable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun depEstMasses(): Optional<List<Double>> = depEstMasses.getOptional("depEstMasses")

    /**
     * Array of the 1-sigma uncertainty of the mass for each deployable object, in kilograms. Must
     * contain the same number of elements as the value of numDeployable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun depMassUncs(): Optional<List<Double>> = depMassUncs.getOptional("depMassUncs")

    /**
     * Array of satellite deployable objects. Must contain the same number of elements as the value
     * of numDeployable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun depNames(): Optional<List<String>> = depNames.getOptional("depNames")

    /**
     * GEO drift rate, if applicable in degrees per day.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun driftRate(): Optional<Double> = driftRate.getOptional("driftRate")

    /**
     * Spacecraft dry mass (without fuel or disposables) in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dryMass(): Optional<Double> = dryMass.getOptional("dryMass")

    /**
     * Estimated maximum burn duration for the object, in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun estDeltaVDuration(): Optional<Double> = estDeltaVDuration.getOptional("estDeltaVDuration")

    /**
     * Estimated remaining fuel for the object in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fuelRemaining(): Optional<Double> = fuelRemaining.getOptional("fuelRemaining")

    /**
     * GEO slot if applicable, in degrees. -180 (West of Prime Meridian) to 180 degrees (East of
     * Prime Meridian). Prime Meridian is 0.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoSlot(): Optional<Double> = geoSlot.getOptional("geoSlot")

    /**
     * The name of the source who last provided an observation for this idOnOrbit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lastObSource(): Optional<String> = lastObSource.getOptional("lastObSource")

    /**
     * Time of last reported observation for this object in ISO 8601 UTC with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lastObTime(): Optional<OffsetDateTime> = lastObTime.getOptional("lastObTime")

    /**
     * Nominal mass of spacecraft and fuel at launch time, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchMass(): Optional<Double> = launchMass.getOptional("launchMass")

    /**
     * Maximum (estimated) mass of spacecraft and fuel at launch time, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchMassMax(): Optional<Double> = launchMassMax.getOptional("launchMassMax")

    /**
     * Minimum (estimated) mass of spacecraft and fuel at launch time, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchMassMin(): Optional<Double> = launchMassMin.getOptional("launchMassMin")

    /**
     * Boolean indicating whether a spacecraft is maneuverable. Note that a spacecraft may have
     * propulsion capability but may not be maneuverable due to lack of fuel, anomalous condition,
     * or other operational constraints.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maneuverable(): Optional<Boolean> = maneuverable.getOptional("maneuverable")

    /**
     * Maximum delta V available for this on-orbit spacecraft, in meters per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxDeltaV(): Optional<Double> = maxDeltaV.getOptional("maxDeltaV")

    /**
     * Maximum dimension across the spacecraft (e.g., tip-to-tip across the solar panel arrays) in
     * meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxRadius(): Optional<Double> = maxRadius.getOptional("maxRadius")

    /**
     * Array of the type of missions the spacecraft performs. Must contain the same number of
     * elements as the value of numMission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun missionTypes(): Optional<List<String>> = missionTypes.getOptional("missionTypes")

    /**
     * The number of sub-satellites or deployable objects on the spacecraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numDeployable(): Optional<Int> = numDeployable.getOptional("numDeployable")

    /**
     * The number of distinct missions the spacecraft performs.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numMission(): Optional<Int> = numMission.getOptional("numMission")

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
     * Current/latest radar cross section in meters squared.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rcs(): Optional<Double> = rcs.getOptional("rcs")

    /**
     * Maximum radar cross section in meters squared.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rcsMax(): Optional<Double> = rcsMax.getOptional("rcsMax")

    /**
     * Mean radar cross section in meters squared.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rcsMean(): Optional<Double> = rcsMean.getOptional("rcsMean")

    /**
     * Minimum radar cross section in meters squared.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rcsMin(): Optional<Double> = rcsMin.getOptional("rcsMin")

    /**
     * The reference source, sources, or URL from which the data in this record was obtained.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun refSource(): Optional<String> = refSource.getOptional("refSource")

    /**
     * Spacecraft deployed area of solar array in meters squared.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun solarArrayArea(): Optional<Double> = solarArrayArea.getOptional("solarArrayArea")

    /**
     * The 1-sigma uncertainty of the total spacecraft mass, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun totalMassUnc(): Optional<Double> = totalMassUnc.getOptional("totalMassUnc")

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
     * Current/latest visual magnitude in M.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vismag(): Optional<Double> = vismag.getOptional("vismag")

    /**
     * Maximum visual magnitude in M.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vismagMax(): Optional<Double> = vismagMax.getOptional("vismagMax")

    /**
     * Mean visual magnitude in M.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vismagMean(): Optional<Double> = vismagMean.getOptional("vismagMean")

    /**
     * Minimum visual magnitude in M.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vismagMin(): Optional<Double> = vismagMin.getOptional("vismagMin")

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
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

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
     * Returns the raw JSON value of [additionalMass].
     *
     * Unlike [additionalMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("additionalMass")
    @ExcludeMissing
    fun _additionalMass(): JsonField<Double> = additionalMass

    /**
     * Returns the raw JSON value of [adeptRadius].
     *
     * Unlike [adeptRadius], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("adeptRadius") @ExcludeMissing fun _adeptRadius(): JsonField<Double> = adeptRadius

    /**
     * Returns the raw JSON value of [bolDeltaV].
     *
     * Unlike [bolDeltaV], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bolDeltaV") @ExcludeMissing fun _bolDeltaV(): JsonField<Double> = bolDeltaV

    /**
     * Returns the raw JSON value of [bolFuelMass].
     *
     * Unlike [bolFuelMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bolFuelMass") @ExcludeMissing fun _bolFuelMass(): JsonField<Double> = bolFuelMass

    /**
     * Returns the raw JSON value of [busCrossSection].
     *
     * Unlike [busCrossSection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("busCrossSection")
    @ExcludeMissing
    fun _busCrossSection(): JsonField<Double> = busCrossSection

    /**
     * Returns the raw JSON value of [busType].
     *
     * Unlike [busType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("busType") @ExcludeMissing fun _busType(): JsonField<String> = busType

    /**
     * Returns the raw JSON value of [colaRadius].
     *
     * Unlike [colaRadius], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("colaRadius") @ExcludeMissing fun _colaRadius(): JsonField<Double> = colaRadius

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
     * Returns the raw JSON value of [crossSection].
     *
     * Unlike [crossSection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("crossSection")
    @ExcludeMissing
    fun _crossSection(): JsonField<Double> = crossSection

    /**
     * Returns the raw JSON value of [currentMass].
     *
     * Unlike [currentMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currentMass") @ExcludeMissing fun _currentMass(): JsonField<Double> = currentMass

    /**
     * Returns the raw JSON value of [deltaVUnc].
     *
     * Unlike [deltaVUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deltaVUnc") @ExcludeMissing fun _deltaVUnc(): JsonField<Double> = deltaVUnc

    /**
     * Returns the raw JSON value of [depEstMasses].
     *
     * Unlike [depEstMasses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depEstMasses")
    @ExcludeMissing
    fun _depEstMasses(): JsonField<List<Double>> = depEstMasses

    /**
     * Returns the raw JSON value of [depMassUncs].
     *
     * Unlike [depMassUncs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depMassUncs")
    @ExcludeMissing
    fun _depMassUncs(): JsonField<List<Double>> = depMassUncs

    /**
     * Returns the raw JSON value of [depNames].
     *
     * Unlike [depNames], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depNames") @ExcludeMissing fun _depNames(): JsonField<List<String>> = depNames

    /**
     * Returns the raw JSON value of [driftRate].
     *
     * Unlike [driftRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("driftRate") @ExcludeMissing fun _driftRate(): JsonField<Double> = driftRate

    /**
     * Returns the raw JSON value of [dryMass].
     *
     * Unlike [dryMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dryMass") @ExcludeMissing fun _dryMass(): JsonField<Double> = dryMass

    /**
     * Returns the raw JSON value of [estDeltaVDuration].
     *
     * Unlike [estDeltaVDuration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("estDeltaVDuration")
    @ExcludeMissing
    fun _estDeltaVDuration(): JsonField<Double> = estDeltaVDuration

    /**
     * Returns the raw JSON value of [fuelRemaining].
     *
     * Unlike [fuelRemaining], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fuelRemaining")
    @ExcludeMissing
    fun _fuelRemaining(): JsonField<Double> = fuelRemaining

    /**
     * Returns the raw JSON value of [geoSlot].
     *
     * Unlike [geoSlot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoSlot") @ExcludeMissing fun _geoSlot(): JsonField<Double> = geoSlot

    /**
     * Returns the raw JSON value of [lastObSource].
     *
     * Unlike [lastObSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastObSource")
    @ExcludeMissing
    fun _lastObSource(): JsonField<String> = lastObSource

    /**
     * Returns the raw JSON value of [lastObTime].
     *
     * Unlike [lastObTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastObTime")
    @ExcludeMissing
    fun _lastObTime(): JsonField<OffsetDateTime> = lastObTime

    /**
     * Returns the raw JSON value of [launchMass].
     *
     * Unlike [launchMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchMass") @ExcludeMissing fun _launchMass(): JsonField<Double> = launchMass

    /**
     * Returns the raw JSON value of [launchMassMax].
     *
     * Unlike [launchMassMax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchMassMax")
    @ExcludeMissing
    fun _launchMassMax(): JsonField<Double> = launchMassMax

    /**
     * Returns the raw JSON value of [launchMassMin].
     *
     * Unlike [launchMassMin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchMassMin")
    @ExcludeMissing
    fun _launchMassMin(): JsonField<Double> = launchMassMin

    /**
     * Returns the raw JSON value of [maneuverable].
     *
     * Unlike [maneuverable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maneuverable")
    @ExcludeMissing
    fun _maneuverable(): JsonField<Boolean> = maneuverable

    /**
     * Returns the raw JSON value of [maxDeltaV].
     *
     * Unlike [maxDeltaV], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxDeltaV") @ExcludeMissing fun _maxDeltaV(): JsonField<Double> = maxDeltaV

    /**
     * Returns the raw JSON value of [maxRadius].
     *
     * Unlike [maxRadius], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxRadius") @ExcludeMissing fun _maxRadius(): JsonField<Double> = maxRadius

    /**
     * Returns the raw JSON value of [missionTypes].
     *
     * Unlike [missionTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("missionTypes")
    @ExcludeMissing
    fun _missionTypes(): JsonField<List<String>> = missionTypes

    /**
     * Returns the raw JSON value of [numDeployable].
     *
     * Unlike [numDeployable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numDeployable")
    @ExcludeMissing
    fun _numDeployable(): JsonField<Int> = numDeployable

    /**
     * Returns the raw JSON value of [numMission].
     *
     * Unlike [numMission], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numMission") @ExcludeMissing fun _numMission(): JsonField<Int> = numMission

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
     * Returns the raw JSON value of [rcs].
     *
     * Unlike [rcs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rcs") @ExcludeMissing fun _rcs(): JsonField<Double> = rcs

    /**
     * Returns the raw JSON value of [rcsMax].
     *
     * Unlike [rcsMax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rcsMax") @ExcludeMissing fun _rcsMax(): JsonField<Double> = rcsMax

    /**
     * Returns the raw JSON value of [rcsMean].
     *
     * Unlike [rcsMean], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rcsMean") @ExcludeMissing fun _rcsMean(): JsonField<Double> = rcsMean

    /**
     * Returns the raw JSON value of [rcsMin].
     *
     * Unlike [rcsMin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rcsMin") @ExcludeMissing fun _rcsMin(): JsonField<Double> = rcsMin

    /**
     * Returns the raw JSON value of [refSource].
     *
     * Unlike [refSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refSource") @ExcludeMissing fun _refSource(): JsonField<String> = refSource

    /**
     * Returns the raw JSON value of [solarArrayArea].
     *
     * Unlike [solarArrayArea], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("solarArrayArea")
    @ExcludeMissing
    fun _solarArrayArea(): JsonField<Double> = solarArrayArea

    /**
     * Returns the raw JSON value of [totalMassUnc].
     *
     * Unlike [totalMassUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalMassUnc")
    @ExcludeMissing
    fun _totalMassUnc(): JsonField<Double> = totalMassUnc

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
     * Returns the raw JSON value of [vismag].
     *
     * Unlike [vismag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vismag") @ExcludeMissing fun _vismag(): JsonField<Double> = vismag

    /**
     * Returns the raw JSON value of [vismagMax].
     *
     * Unlike [vismagMax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vismagMax") @ExcludeMissing fun _vismagMax(): JsonField<Double> = vismagMax

    /**
     * Returns the raw JSON value of [vismagMean].
     *
     * Unlike [vismagMean], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vismagMean") @ExcludeMissing fun _vismagMean(): JsonField<Double> = vismagMean

    /**
     * Returns the raw JSON value of [vismagMin].
     *
     * Unlike [vismagMin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vismagMin") @ExcludeMissing fun _vismagMin(): JsonField<Double> = vismagMin

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
         * Returns a mutable builder for constructing an instance of [OnorbitDetailsFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idOnOrbit()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnorbitDetailsFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idOnOrbit: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var additionalMass: JsonField<Double> = JsonMissing.of()
        private var adeptRadius: JsonField<Double> = JsonMissing.of()
        private var bolDeltaV: JsonField<Double> = JsonMissing.of()
        private var bolFuelMass: JsonField<Double> = JsonMissing.of()
        private var busCrossSection: JsonField<Double> = JsonMissing.of()
        private var busType: JsonField<String> = JsonMissing.of()
        private var colaRadius: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var crossSection: JsonField<Double> = JsonMissing.of()
        private var currentMass: JsonField<Double> = JsonMissing.of()
        private var deltaVUnc: JsonField<Double> = JsonMissing.of()
        private var depEstMasses: JsonField<MutableList<Double>>? = null
        private var depMassUncs: JsonField<MutableList<Double>>? = null
        private var depNames: JsonField<MutableList<String>>? = null
        private var driftRate: JsonField<Double> = JsonMissing.of()
        private var dryMass: JsonField<Double> = JsonMissing.of()
        private var estDeltaVDuration: JsonField<Double> = JsonMissing.of()
        private var fuelRemaining: JsonField<Double> = JsonMissing.of()
        private var geoSlot: JsonField<Double> = JsonMissing.of()
        private var lastObSource: JsonField<String> = JsonMissing.of()
        private var lastObTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var launchMass: JsonField<Double> = JsonMissing.of()
        private var launchMassMax: JsonField<Double> = JsonMissing.of()
        private var launchMassMin: JsonField<Double> = JsonMissing.of()
        private var maneuverable: JsonField<Boolean> = JsonMissing.of()
        private var maxDeltaV: JsonField<Double> = JsonMissing.of()
        private var maxRadius: JsonField<Double> = JsonMissing.of()
        private var missionTypes: JsonField<MutableList<String>>? = null
        private var numDeployable: JsonField<Int> = JsonMissing.of()
        private var numMission: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var rcs: JsonField<Double> = JsonMissing.of()
        private var rcsMax: JsonField<Double> = JsonMissing.of()
        private var rcsMean: JsonField<Double> = JsonMissing.of()
        private var rcsMin: JsonField<Double> = JsonMissing.of()
        private var refSource: JsonField<String> = JsonMissing.of()
        private var solarArrayArea: JsonField<Double> = JsonMissing.of()
        private var totalMassUnc: JsonField<Double> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var vismag: JsonField<Double> = JsonMissing.of()
        private var vismagMax: JsonField<Double> = JsonMissing.of()
        private var vismagMean: JsonField<Double> = JsonMissing.of()
        private var vismagMin: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onorbitDetailsFull: OnorbitDetailsFull) = apply {
            classificationMarking = onorbitDetailsFull.classificationMarking
            dataMode = onorbitDetailsFull.dataMode
            idOnOrbit = onorbitDetailsFull.idOnOrbit
            source = onorbitDetailsFull.source
            id = onorbitDetailsFull.id
            additionalMass = onorbitDetailsFull.additionalMass
            adeptRadius = onorbitDetailsFull.adeptRadius
            bolDeltaV = onorbitDetailsFull.bolDeltaV
            bolFuelMass = onorbitDetailsFull.bolFuelMass
            busCrossSection = onorbitDetailsFull.busCrossSection
            busType = onorbitDetailsFull.busType
            colaRadius = onorbitDetailsFull.colaRadius
            createdAt = onorbitDetailsFull.createdAt
            createdBy = onorbitDetailsFull.createdBy
            crossSection = onorbitDetailsFull.crossSection
            currentMass = onorbitDetailsFull.currentMass
            deltaVUnc = onorbitDetailsFull.deltaVUnc
            depEstMasses = onorbitDetailsFull.depEstMasses.map { it.toMutableList() }
            depMassUncs = onorbitDetailsFull.depMassUncs.map { it.toMutableList() }
            depNames = onorbitDetailsFull.depNames.map { it.toMutableList() }
            driftRate = onorbitDetailsFull.driftRate
            dryMass = onorbitDetailsFull.dryMass
            estDeltaVDuration = onorbitDetailsFull.estDeltaVDuration
            fuelRemaining = onorbitDetailsFull.fuelRemaining
            geoSlot = onorbitDetailsFull.geoSlot
            lastObSource = onorbitDetailsFull.lastObSource
            lastObTime = onorbitDetailsFull.lastObTime
            launchMass = onorbitDetailsFull.launchMass
            launchMassMax = onorbitDetailsFull.launchMassMax
            launchMassMin = onorbitDetailsFull.launchMassMin
            maneuverable = onorbitDetailsFull.maneuverable
            maxDeltaV = onorbitDetailsFull.maxDeltaV
            maxRadius = onorbitDetailsFull.maxRadius
            missionTypes = onorbitDetailsFull.missionTypes.map { it.toMutableList() }
            numDeployable = onorbitDetailsFull.numDeployable
            numMission = onorbitDetailsFull.numMission
            origin = onorbitDetailsFull.origin
            origNetwork = onorbitDetailsFull.origNetwork
            rcs = onorbitDetailsFull.rcs
            rcsMax = onorbitDetailsFull.rcsMax
            rcsMean = onorbitDetailsFull.rcsMean
            rcsMin = onorbitDetailsFull.rcsMin
            refSource = onorbitDetailsFull.refSource
            solarArrayArea = onorbitDetailsFull.solarArrayArea
            totalMassUnc = onorbitDetailsFull.totalMassUnc
            updatedAt = onorbitDetailsFull.updatedAt
            updatedBy = onorbitDetailsFull.updatedBy
            vismag = onorbitDetailsFull.vismag
            vismagMax = onorbitDetailsFull.vismagMax
            vismagMean = onorbitDetailsFull.vismagMean
            vismagMin = onorbitDetailsFull.vismagMin
            additionalProperties = onorbitDetailsFull.additionalProperties.toMutableMap()
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

        /** UUID of the parent Onorbit record. */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

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

        /** Mass of fuel and disposables at launch time in kilograms. */
        fun additionalMass(additionalMass: Double) = additionalMass(JsonField.of(additionalMass))

        /**
         * Sets [Builder.additionalMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalMass] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun additionalMass(additionalMass: JsonField<Double>) = apply {
            this.additionalMass = additionalMass
        }

        /**
         * The radius used for long-term debris environment projection analyses that is not as
         * conservative as COLA Radius, in meters.
         */
        fun adeptRadius(adeptRadius: Double) = adeptRadius(JsonField.of(adeptRadius))

        /**
         * Sets [Builder.adeptRadius] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adeptRadius] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun adeptRadius(adeptRadius: JsonField<Double>) = apply { this.adeptRadius = adeptRadius }

        /** The total beginning of life delta V of the spacecraft, in meters per second. */
        fun bolDeltaV(bolDeltaV: Double) = bolDeltaV(JsonField.of(bolDeltaV))

        /**
         * Sets [Builder.bolDeltaV] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bolDeltaV] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bolDeltaV(bolDeltaV: JsonField<Double>) = apply { this.bolDeltaV = bolDeltaV }

        /** Spacecraft beginning of life fuel mass, in orbit, in kilograms. */
        fun bolFuelMass(bolFuelMass: Double) = bolFuelMass(JsonField.of(bolFuelMass))

        /**
         * Sets [Builder.bolFuelMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bolFuelMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bolFuelMass(bolFuelMass: JsonField<Double>) = apply { this.bolFuelMass = bolFuelMass }

        /** Average cross sectional area of the bus in meters squared. */
        fun busCrossSection(busCrossSection: Double) =
            busCrossSection(JsonField.of(busCrossSection))

        /**
         * Sets [Builder.busCrossSection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.busCrossSection] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun busCrossSection(busCrossSection: JsonField<Double>) = apply {
            this.busCrossSection = busCrossSection
        }

        /** Type of the bus on the spacecraft. */
        fun busType(busType: String) = busType(JsonField.of(busType))

        /**
         * Sets [Builder.busType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.busType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun busType(busType: JsonField<String>) = apply { this.busType = busType }

        /**
         * Maximum dimension of the box circumscribing the spacecraft (d = sqrt(a*a + b*b + c\*c)
         * where a is the tip-to-tip dimension, b and c are perpendicular to that.) in meters.
         */
        fun colaRadius(colaRadius: Double) = colaRadius(JsonField.of(colaRadius))

        /**
         * Sets [Builder.colaRadius] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colaRadius] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun colaRadius(colaRadius: JsonField<Double>) = apply { this.colaRadius = colaRadius }

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

        /** Average cross sectional area in meters squared. */
        fun crossSection(crossSection: Double) = crossSection(JsonField.of(crossSection))

        /**
         * Sets [Builder.crossSection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.crossSection] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun crossSection(crossSection: JsonField<Double>) = apply {
            this.crossSection = crossSection
        }

        /** The estimated total current mass of the spacecraft, in kilograms. */
        fun currentMass(currentMass: Double) = currentMass(JsonField.of(currentMass))

        /**
         * Sets [Builder.currentMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentMass(currentMass: JsonField<Double>) = apply { this.currentMass = currentMass }

        /** The 1-sigma uncertainty of the total spacecraft delta V, in meters per second. */
        fun deltaVUnc(deltaVUnc: Double) = deltaVUnc(JsonField.of(deltaVUnc))

        /**
         * Sets [Builder.deltaVUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deltaVUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deltaVUnc(deltaVUnc: JsonField<Double>) = apply { this.deltaVUnc = deltaVUnc }

        /**
         * Array of the estimated mass of each deployable object, in kilograms. Must contain the
         * same number of elements as the value of numDeployable.
         */
        fun depEstMasses(depEstMasses: List<Double>) = depEstMasses(JsonField.of(depEstMasses))

        /**
         * Sets [Builder.depEstMasses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depEstMasses] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun depEstMasses(depEstMasses: JsonField<List<Double>>) = apply {
            this.depEstMasses = depEstMasses.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [depEstMasses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDepEstMass(depEstMass: Double) = apply {
            depEstMasses =
                (depEstMasses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("depEstMasses", it).add(depEstMass)
                }
        }

        /**
         * Array of the 1-sigma uncertainty of the mass for each deployable object, in kilograms.
         * Must contain the same number of elements as the value of numDeployable.
         */
        fun depMassUncs(depMassUncs: List<Double>) = depMassUncs(JsonField.of(depMassUncs))

        /**
         * Sets [Builder.depMassUncs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depMassUncs] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun depMassUncs(depMassUncs: JsonField<List<Double>>) = apply {
            this.depMassUncs = depMassUncs.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [depMassUncs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDepMassUnc(depMassUnc: Double) = apply {
            depMassUncs =
                (depMassUncs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("depMassUncs", it).add(depMassUnc)
                }
        }

        /**
         * Array of satellite deployable objects. Must contain the same number of elements as the
         * value of numDeployable.
         */
        fun depNames(depNames: List<String>) = depNames(JsonField.of(depNames))

        /**
         * Sets [Builder.depNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depNames] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun depNames(depNames: JsonField<List<String>>) = apply {
            this.depNames = depNames.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [depNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDepName(depName: String) = apply {
            depNames =
                (depNames ?: JsonField.of(mutableListOf())).also {
                    checkKnown("depNames", it).add(depName)
                }
        }

        /** GEO drift rate, if applicable in degrees per day. */
        fun driftRate(driftRate: Double) = driftRate(JsonField.of(driftRate))

        /**
         * Sets [Builder.driftRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.driftRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun driftRate(driftRate: JsonField<Double>) = apply { this.driftRate = driftRate }

        /** Spacecraft dry mass (without fuel or disposables) in kilograms. */
        fun dryMass(dryMass: Double) = dryMass(JsonField.of(dryMass))

        /**
         * Sets [Builder.dryMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dryMass] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dryMass(dryMass: JsonField<Double>) = apply { this.dryMass = dryMass }

        /** Estimated maximum burn duration for the object, in seconds. */
        fun estDeltaVDuration(estDeltaVDuration: Double) =
            estDeltaVDuration(JsonField.of(estDeltaVDuration))

        /**
         * Sets [Builder.estDeltaVDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estDeltaVDuration] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun estDeltaVDuration(estDeltaVDuration: JsonField<Double>) = apply {
            this.estDeltaVDuration = estDeltaVDuration
        }

        /** Estimated remaining fuel for the object in kilograms. */
        fun fuelRemaining(fuelRemaining: Double) = fuelRemaining(JsonField.of(fuelRemaining))

        /**
         * Sets [Builder.fuelRemaining] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fuelRemaining] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fuelRemaining(fuelRemaining: JsonField<Double>) = apply {
            this.fuelRemaining = fuelRemaining
        }

        /**
         * GEO slot if applicable, in degrees. -180 (West of Prime Meridian) to 180 degrees (East of
         * Prime Meridian). Prime Meridian is 0.
         */
        fun geoSlot(geoSlot: Double) = geoSlot(JsonField.of(geoSlot))

        /**
         * Sets [Builder.geoSlot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoSlot] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun geoSlot(geoSlot: JsonField<Double>) = apply { this.geoSlot = geoSlot }

        /** The name of the source who last provided an observation for this idOnOrbit. */
        fun lastObSource(lastObSource: String) = lastObSource(JsonField.of(lastObSource))

        /**
         * Sets [Builder.lastObSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastObSource] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastObSource(lastObSource: JsonField<String>) = apply {
            this.lastObSource = lastObSource
        }

        /**
         * Time of last reported observation for this object in ISO 8601 UTC with microsecond
         * precision.
         */
        fun lastObTime(lastObTime: OffsetDateTime) = lastObTime(JsonField.of(lastObTime))

        /**
         * Sets [Builder.lastObTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastObTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastObTime(lastObTime: JsonField<OffsetDateTime>) = apply {
            this.lastObTime = lastObTime
        }

        /** Nominal mass of spacecraft and fuel at launch time, in kilograms. */
        fun launchMass(launchMass: Double) = launchMass(JsonField.of(launchMass))

        /**
         * Sets [Builder.launchMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchMass(launchMass: JsonField<Double>) = apply { this.launchMass = launchMass }

        /** Maximum (estimated) mass of spacecraft and fuel at launch time, in kilograms. */
        fun launchMassMax(launchMassMax: Double) = launchMassMax(JsonField.of(launchMassMax))

        /**
         * Sets [Builder.launchMassMax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchMassMax] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchMassMax(launchMassMax: JsonField<Double>) = apply {
            this.launchMassMax = launchMassMax
        }

        /** Minimum (estimated) mass of spacecraft and fuel at launch time, in kilograms. */
        fun launchMassMin(launchMassMin: Double) = launchMassMin(JsonField.of(launchMassMin))

        /**
         * Sets [Builder.launchMassMin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchMassMin] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchMassMin(launchMassMin: JsonField<Double>) = apply {
            this.launchMassMin = launchMassMin
        }

        /**
         * Boolean indicating whether a spacecraft is maneuverable. Note that a spacecraft may have
         * propulsion capability but may not be maneuverable due to lack of fuel, anomalous
         * condition, or other operational constraints.
         */
        fun maneuverable(maneuverable: Boolean) = maneuverable(JsonField.of(maneuverable))

        /**
         * Sets [Builder.maneuverable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maneuverable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maneuverable(maneuverable: JsonField<Boolean>) = apply {
            this.maneuverable = maneuverable
        }

        /** Maximum delta V available for this on-orbit spacecraft, in meters per second. */
        fun maxDeltaV(maxDeltaV: Double) = maxDeltaV(JsonField.of(maxDeltaV))

        /**
         * Sets [Builder.maxDeltaV] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDeltaV] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxDeltaV(maxDeltaV: JsonField<Double>) = apply { this.maxDeltaV = maxDeltaV }

        /**
         * Maximum dimension across the spacecraft (e.g., tip-to-tip across the solar panel arrays)
         * in meters.
         */
        fun maxRadius(maxRadius: Double) = maxRadius(JsonField.of(maxRadius))

        /**
         * Sets [Builder.maxRadius] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRadius] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxRadius(maxRadius: JsonField<Double>) = apply { this.maxRadius = maxRadius }

        /**
         * Array of the type of missions the spacecraft performs. Must contain the same number of
         * elements as the value of numMission.
         */
        fun missionTypes(missionTypes: List<String>) = missionTypes(JsonField.of(missionTypes))

        /**
         * Sets [Builder.missionTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missionTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun missionTypes(missionTypes: JsonField<List<String>>) = apply {
            this.missionTypes = missionTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [missionTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMissionType(missionType: String) = apply {
            missionTypes =
                (missionTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("missionTypes", it).add(missionType)
                }
        }

        /** The number of sub-satellites or deployable objects on the spacecraft. */
        fun numDeployable(numDeployable: Int) = numDeployable(JsonField.of(numDeployable))

        /**
         * Sets [Builder.numDeployable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numDeployable] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numDeployable(numDeployable: JsonField<Int>) = apply {
            this.numDeployable = numDeployable
        }

        /** The number of distinct missions the spacecraft performs. */
        fun numMission(numMission: Int) = numMission(JsonField.of(numMission))

        /**
         * Sets [Builder.numMission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numMission] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numMission(numMission: JsonField<Int>) = apply { this.numMission = numMission }

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

        /** Current/latest radar cross section in meters squared. */
        fun rcs(rcs: Double) = rcs(JsonField.of(rcs))

        /**
         * Sets [Builder.rcs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rcs] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rcs(rcs: JsonField<Double>) = apply { this.rcs = rcs }

        /** Maximum radar cross section in meters squared. */
        fun rcsMax(rcsMax: Double) = rcsMax(JsonField.of(rcsMax))

        /**
         * Sets [Builder.rcsMax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rcsMax] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rcsMax(rcsMax: JsonField<Double>) = apply { this.rcsMax = rcsMax }

        /** Mean radar cross section in meters squared. */
        fun rcsMean(rcsMean: Double) = rcsMean(JsonField.of(rcsMean))

        /**
         * Sets [Builder.rcsMean] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rcsMean] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rcsMean(rcsMean: JsonField<Double>) = apply { this.rcsMean = rcsMean }

        /** Minimum radar cross section in meters squared. */
        fun rcsMin(rcsMin: Double) = rcsMin(JsonField.of(rcsMin))

        /**
         * Sets [Builder.rcsMin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rcsMin] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rcsMin(rcsMin: JsonField<Double>) = apply { this.rcsMin = rcsMin }

        /**
         * The reference source, sources, or URL from which the data in this record was obtained.
         */
        fun refSource(refSource: String) = refSource(JsonField.of(refSource))

        /**
         * Sets [Builder.refSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refSource] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun refSource(refSource: JsonField<String>) = apply { this.refSource = refSource }

        /** Spacecraft deployed area of solar array in meters squared. */
        fun solarArrayArea(solarArrayArea: Double) = solarArrayArea(JsonField.of(solarArrayArea))

        /**
         * Sets [Builder.solarArrayArea] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solarArrayArea] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun solarArrayArea(solarArrayArea: JsonField<Double>) = apply {
            this.solarArrayArea = solarArrayArea
        }

        /** The 1-sigma uncertainty of the total spacecraft mass, in kilograms. */
        fun totalMassUnc(totalMassUnc: Double) = totalMassUnc(JsonField.of(totalMassUnc))

        /**
         * Sets [Builder.totalMassUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalMassUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalMassUnc(totalMassUnc: JsonField<Double>) = apply {
            this.totalMassUnc = totalMassUnc
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

        /** Current/latest visual magnitude in M. */
        fun vismag(vismag: Double) = vismag(JsonField.of(vismag))

        /**
         * Sets [Builder.vismag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vismag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vismag(vismag: JsonField<Double>) = apply { this.vismag = vismag }

        /** Maximum visual magnitude in M. */
        fun vismagMax(vismagMax: Double) = vismagMax(JsonField.of(vismagMax))

        /**
         * Sets [Builder.vismagMax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vismagMax] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vismagMax(vismagMax: JsonField<Double>) = apply { this.vismagMax = vismagMax }

        /** Mean visual magnitude in M. */
        fun vismagMean(vismagMean: Double) = vismagMean(JsonField.of(vismagMean))

        /**
         * Sets [Builder.vismagMean] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vismagMean] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vismagMean(vismagMean: JsonField<Double>) = apply { this.vismagMean = vismagMean }

        /** Minimum visual magnitude in M. */
        fun vismagMin(vismagMin: Double) = vismagMin(JsonField.of(vismagMin))

        /**
         * Sets [Builder.vismagMin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vismagMin] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vismagMin(vismagMin: JsonField<Double>) = apply { this.vismagMin = vismagMin }

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
         * Returns an immutable instance of [OnorbitDetailsFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idOnOrbit()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OnorbitDetailsFull =
            OnorbitDetailsFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idOnOrbit", idOnOrbit),
                checkRequired("source", source),
                id,
                additionalMass,
                adeptRadius,
                bolDeltaV,
                bolFuelMass,
                busCrossSection,
                busType,
                colaRadius,
                createdAt,
                createdBy,
                crossSection,
                currentMass,
                deltaVUnc,
                (depEstMasses ?: JsonMissing.of()).map { it.toImmutable() },
                (depMassUncs ?: JsonMissing.of()).map { it.toImmutable() },
                (depNames ?: JsonMissing.of()).map { it.toImmutable() },
                driftRate,
                dryMass,
                estDeltaVDuration,
                fuelRemaining,
                geoSlot,
                lastObSource,
                lastObTime,
                launchMass,
                launchMassMax,
                launchMassMin,
                maneuverable,
                maxDeltaV,
                maxRadius,
                (missionTypes ?: JsonMissing.of()).map { it.toImmutable() },
                numDeployable,
                numMission,
                origin,
                origNetwork,
                rcs,
                rcsMax,
                rcsMean,
                rcsMin,
                refSource,
                solarArrayArea,
                totalMassUnc,
                updatedAt,
                updatedBy,
                vismag,
                vismagMax,
                vismagMean,
                vismagMin,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OnorbitDetailsFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idOnOrbit()
        source()
        id()
        additionalMass()
        adeptRadius()
        bolDeltaV()
        bolFuelMass()
        busCrossSection()
        busType()
        colaRadius()
        createdAt()
        createdBy()
        crossSection()
        currentMass()
        deltaVUnc()
        depEstMasses()
        depMassUncs()
        depNames()
        driftRate()
        dryMass()
        estDeltaVDuration()
        fuelRemaining()
        geoSlot()
        lastObSource()
        lastObTime()
        launchMass()
        launchMassMax()
        launchMassMin()
        maneuverable()
        maxDeltaV()
        maxRadius()
        missionTypes()
        numDeployable()
        numMission()
        origin()
        origNetwork()
        rcs()
        rcsMax()
        rcsMean()
        rcsMin()
        refSource()
        solarArrayArea()
        totalMassUnc()
        updatedAt()
        updatedBy()
        vismag()
        vismagMax()
        vismagMean()
        vismagMin()
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
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (additionalMass.asKnown().isPresent) 1 else 0) +
            (if (adeptRadius.asKnown().isPresent) 1 else 0) +
            (if (bolDeltaV.asKnown().isPresent) 1 else 0) +
            (if (bolFuelMass.asKnown().isPresent) 1 else 0) +
            (if (busCrossSection.asKnown().isPresent) 1 else 0) +
            (if (busType.asKnown().isPresent) 1 else 0) +
            (if (colaRadius.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (crossSection.asKnown().isPresent) 1 else 0) +
            (if (currentMass.asKnown().isPresent) 1 else 0) +
            (if (deltaVUnc.asKnown().isPresent) 1 else 0) +
            (depEstMasses.asKnown().getOrNull()?.size ?: 0) +
            (depMassUncs.asKnown().getOrNull()?.size ?: 0) +
            (depNames.asKnown().getOrNull()?.size ?: 0) +
            (if (driftRate.asKnown().isPresent) 1 else 0) +
            (if (dryMass.asKnown().isPresent) 1 else 0) +
            (if (estDeltaVDuration.asKnown().isPresent) 1 else 0) +
            (if (fuelRemaining.asKnown().isPresent) 1 else 0) +
            (if (geoSlot.asKnown().isPresent) 1 else 0) +
            (if (lastObSource.asKnown().isPresent) 1 else 0) +
            (if (lastObTime.asKnown().isPresent) 1 else 0) +
            (if (launchMass.asKnown().isPresent) 1 else 0) +
            (if (launchMassMax.asKnown().isPresent) 1 else 0) +
            (if (launchMassMin.asKnown().isPresent) 1 else 0) +
            (if (maneuverable.asKnown().isPresent) 1 else 0) +
            (if (maxDeltaV.asKnown().isPresent) 1 else 0) +
            (if (maxRadius.asKnown().isPresent) 1 else 0) +
            (missionTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (numDeployable.asKnown().isPresent) 1 else 0) +
            (if (numMission.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (rcs.asKnown().isPresent) 1 else 0) +
            (if (rcsMax.asKnown().isPresent) 1 else 0) +
            (if (rcsMean.asKnown().isPresent) 1 else 0) +
            (if (rcsMin.asKnown().isPresent) 1 else 0) +
            (if (refSource.asKnown().isPresent) 1 else 0) +
            (if (solarArrayArea.asKnown().isPresent) 1 else 0) +
            (if (totalMassUnc.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (vismag.asKnown().isPresent) 1 else 0) +
            (if (vismagMax.asKnown().isPresent) 1 else 0) +
            (if (vismagMean.asKnown().isPresent) 1 else 0) +
            (if (vismagMin.asKnown().isPresent) 1 else 0)

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

        return other is OnorbitDetailsFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            idOnOrbit == other.idOnOrbit &&
            source == other.source &&
            id == other.id &&
            additionalMass == other.additionalMass &&
            adeptRadius == other.adeptRadius &&
            bolDeltaV == other.bolDeltaV &&
            bolFuelMass == other.bolFuelMass &&
            busCrossSection == other.busCrossSection &&
            busType == other.busType &&
            colaRadius == other.colaRadius &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            crossSection == other.crossSection &&
            currentMass == other.currentMass &&
            deltaVUnc == other.deltaVUnc &&
            depEstMasses == other.depEstMasses &&
            depMassUncs == other.depMassUncs &&
            depNames == other.depNames &&
            driftRate == other.driftRate &&
            dryMass == other.dryMass &&
            estDeltaVDuration == other.estDeltaVDuration &&
            fuelRemaining == other.fuelRemaining &&
            geoSlot == other.geoSlot &&
            lastObSource == other.lastObSource &&
            lastObTime == other.lastObTime &&
            launchMass == other.launchMass &&
            launchMassMax == other.launchMassMax &&
            launchMassMin == other.launchMassMin &&
            maneuverable == other.maneuverable &&
            maxDeltaV == other.maxDeltaV &&
            maxRadius == other.maxRadius &&
            missionTypes == other.missionTypes &&
            numDeployable == other.numDeployable &&
            numMission == other.numMission &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            rcs == other.rcs &&
            rcsMax == other.rcsMax &&
            rcsMean == other.rcsMean &&
            rcsMin == other.rcsMin &&
            refSource == other.refSource &&
            solarArrayArea == other.solarArrayArea &&
            totalMassUnc == other.totalMassUnc &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            vismag == other.vismag &&
            vismagMax == other.vismagMax &&
            vismagMean == other.vismagMean &&
            vismagMin == other.vismagMin &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            idOnOrbit,
            source,
            id,
            additionalMass,
            adeptRadius,
            bolDeltaV,
            bolFuelMass,
            busCrossSection,
            busType,
            colaRadius,
            createdAt,
            createdBy,
            crossSection,
            currentMass,
            deltaVUnc,
            depEstMasses,
            depMassUncs,
            depNames,
            driftRate,
            dryMass,
            estDeltaVDuration,
            fuelRemaining,
            geoSlot,
            lastObSource,
            lastObTime,
            launchMass,
            launchMassMax,
            launchMassMin,
            maneuverable,
            maxDeltaV,
            maxRadius,
            missionTypes,
            numDeployable,
            numMission,
            origin,
            origNetwork,
            rcs,
            rcsMax,
            rcsMean,
            rcsMin,
            refSource,
            solarArrayArea,
            totalMassUnc,
            updatedAt,
            updatedBy,
            vismag,
            vismagMax,
            vismagMean,
            vismagMin,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnorbitDetailsFull{classificationMarking=$classificationMarking, dataMode=$dataMode, idOnOrbit=$idOnOrbit, source=$source, id=$id, additionalMass=$additionalMass, adeptRadius=$adeptRadius, bolDeltaV=$bolDeltaV, bolFuelMass=$bolFuelMass, busCrossSection=$busCrossSection, busType=$busType, colaRadius=$colaRadius, createdAt=$createdAt, createdBy=$createdBy, crossSection=$crossSection, currentMass=$currentMass, deltaVUnc=$deltaVUnc, depEstMasses=$depEstMasses, depMassUncs=$depMassUncs, depNames=$depNames, driftRate=$driftRate, dryMass=$dryMass, estDeltaVDuration=$estDeltaVDuration, fuelRemaining=$fuelRemaining, geoSlot=$geoSlot, lastObSource=$lastObSource, lastObTime=$lastObTime, launchMass=$launchMass, launchMassMax=$launchMassMax, launchMassMin=$launchMassMin, maneuverable=$maneuverable, maxDeltaV=$maxDeltaV, maxRadius=$maxRadius, missionTypes=$missionTypes, numDeployable=$numDeployable, numMission=$numMission, origin=$origin, origNetwork=$origNetwork, rcs=$rcs, rcsMax=$rcsMax, rcsMean=$rcsMean, rcsMin=$rcsMin, refSource=$refSource, solarArrayArea=$solarArrayArea, totalMassUnc=$totalMassUnc, updatedAt=$updatedAt, updatedBy=$updatedBy, vismag=$vismag, vismagMax=$vismagMax, vismagMean=$vismagMean, vismagMin=$vismagMin, additionalProperties=$additionalProperties}"
}

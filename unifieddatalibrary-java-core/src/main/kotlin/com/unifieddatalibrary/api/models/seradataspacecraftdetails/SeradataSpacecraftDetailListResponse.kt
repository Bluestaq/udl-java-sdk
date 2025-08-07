// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataspacecraftdetails

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

/** On-orbit spacecraft details compiled by Seradata for a particular satellite. */
class SeradataSpacecraftDetailListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val name: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val additionalMissionsGroups: JsonField<String>,
    private val altitude: JsonField<Double>,
    private val annualInsuredDepreciationFactor: JsonField<Double>,
    private val annualInsuredDepreciationFactorEstimated: JsonField<Boolean>,
    private val apogee: JsonField<Double>,
    private val busId: JsonField<String>,
    private val capabilityLost: JsonField<Double>,
    private val capacityLost: JsonField<Double>,
    private val catalogNumber: JsonField<Int>,
    private val collisionRiskCm: JsonField<Double>,
    private val collisionRiskMm: JsonField<Double>,
    private val combinedCostEstimated: JsonField<Boolean>,
    private val combinedNewCost: JsonField<Double>,
    private val commercialLaunch: JsonField<Boolean>,
    private val constellation: JsonField<String>,
    private val costEstimated: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val cubesatDispenserType: JsonField<String>,
    private val currentAge: JsonField<Double>,
    private val dateOfObservation: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val designLife: JsonField<Int>,
    private val dryMass: JsonField<Double>,
    private val expectedLife: JsonField<Int>,
    private val geoPosition: JsonField<Double>,
    private val idOnOrbit: JsonField<String>,
    private val inclination: JsonField<Double>,
    private val insuranceLossesTotal: JsonField<Double>,
    private val insuranceNotes: JsonField<String>,
    private val insurancePremiumAtLaunch: JsonField<Double>,
    private val insurancePremiumAtLaunchEstimated: JsonField<Boolean>,
    private val insuredAtLaunch: JsonField<Boolean>,
    private val insuredValueAtLaunch: JsonField<Double>,
    private val insuredValueLaunchEstimated: JsonField<Boolean>,
    private val intlNumber: JsonField<String>,
    private val lat: JsonField<Double>,
    private val launchArranger: JsonField<String>,
    private val launchArrangerCountry: JsonField<String>,
    private val launchCharacteristic: JsonField<String>,
    private val launchCost: JsonField<Double>,
    private val launchCostEstimated: JsonField<Boolean>,
    private val launchCountry: JsonField<String>,
    private val launchDate: JsonField<OffsetDateTime>,
    private val launchDateRemarks: JsonField<String>,
    private val launchId: JsonField<String>,
    private val launchMass: JsonField<Double>,
    private val launchNotes: JsonField<String>,
    private val launchNumber: JsonField<String>,
    private val launchProvider: JsonField<String>,
    private val launchProviderCountry: JsonField<String>,
    private val launchProviderFlightNumber: JsonField<String>,
    private val launchSiteId: JsonField<String>,
    private val launchSiteName: JsonField<String>,
    private val launchType: JsonField<String>,
    private val launchVehicleId: JsonField<String>,
    private val leased: JsonField<Boolean>,
    private val lifeLost: JsonField<Double>,
    private val lon: JsonField<Double>,
    private val massCategory: JsonField<String>,
    private val nameAtLaunch: JsonField<String>,
    private val newCost: JsonField<Double>,
    private val notes: JsonField<String>,
    private val numHumans: JsonField<Int>,
    private val operator: JsonField<String>,
    private val operatorCountry: JsonField<String>,
    private val orbitCategory: JsonField<String>,
    private val orbitSubCategory: JsonField<String>,
    private val orderDate: JsonField<OffsetDateTime>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val owner: JsonField<String>,
    private val ownerCountry: JsonField<String>,
    private val perigee: JsonField<Double>,
    private val period: JsonField<Double>,
    private val primaryMissionGroup: JsonField<String>,
    private val primeManufacturerOrgId: JsonField<String>,
    private val programName: JsonField<String>,
    private val quantity: JsonField<Int>,
    private val reusableFlights: JsonField<String>,
    private val reusedHullName: JsonField<String>,
    private val sector: JsonField<String>,
    private val serialNumber: JsonField<String>,
    private val stabilizer: JsonField<String>,
    private val status: JsonField<String>,
    private val totalClaims: JsonField<Int>,
    private val totalFatalities: JsonField<Int>,
    private val totalInjuries: JsonField<Int>,
    private val totalPayloadPower: JsonField<Double>,
    private val youtubeLaunchLink: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("additionalMissionsGroups")
        @ExcludeMissing
        additionalMissionsGroups: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altitude") @ExcludeMissing altitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("annualInsuredDepreciationFactor")
        @ExcludeMissing
        annualInsuredDepreciationFactor: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("annualInsuredDepreciationFactorEstimated")
        @ExcludeMissing
        annualInsuredDepreciationFactorEstimated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("apogee") @ExcludeMissing apogee: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("busId") @ExcludeMissing busId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("capabilityLost")
        @ExcludeMissing
        capabilityLost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("capacityLost")
        @ExcludeMissing
        capacityLost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("catalogNumber")
        @ExcludeMissing
        catalogNumber: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("collisionRiskCM")
        @ExcludeMissing
        collisionRiskCm: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("collisionRiskMM")
        @ExcludeMissing
        collisionRiskMm: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("combinedCostEstimated")
        @ExcludeMissing
        combinedCostEstimated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("combinedNewCost")
        @ExcludeMissing
        combinedNewCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("commercialLaunch")
        @ExcludeMissing
        commercialLaunch: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("constellation")
        @ExcludeMissing
        constellation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("costEstimated")
        @ExcludeMissing
        costEstimated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cubesatDispenserType")
        @ExcludeMissing
        cubesatDispenserType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currentAge")
        @ExcludeMissing
        currentAge: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dateOfObservation")
        @ExcludeMissing
        dateOfObservation: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("designLife") @ExcludeMissing designLife: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("dryMass") @ExcludeMissing dryMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("expectedLife")
        @ExcludeMissing
        expectedLife: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("geoPosition")
        @ExcludeMissing
        geoPosition: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inclination")
        @ExcludeMissing
        inclination: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("insuranceLossesTotal")
        @ExcludeMissing
        insuranceLossesTotal: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("insuranceNotes")
        @ExcludeMissing
        insuranceNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("insurancePremiumAtLaunch")
        @ExcludeMissing
        insurancePremiumAtLaunch: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("insurancePremiumAtLaunchEstimated")
        @ExcludeMissing
        insurancePremiumAtLaunchEstimated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("insuredAtLaunch")
        @ExcludeMissing
        insuredAtLaunch: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("insuredValueAtLaunch")
        @ExcludeMissing
        insuredValueAtLaunch: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("insuredValueLaunchEstimated")
        @ExcludeMissing
        insuredValueLaunchEstimated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("intlNumber")
        @ExcludeMissing
        intlNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchArranger")
        @ExcludeMissing
        launchArranger: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchArrangerCountry")
        @ExcludeMissing
        launchArrangerCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchCharacteristic")
        @ExcludeMissing
        launchCharacteristic: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchCost")
        @ExcludeMissing
        launchCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchCostEstimated")
        @ExcludeMissing
        launchCostEstimated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("launchCountry")
        @ExcludeMissing
        launchCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchDate")
        @ExcludeMissing
        launchDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("launchDateRemarks")
        @ExcludeMissing
        launchDateRemarks: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchId") @ExcludeMissing launchId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchMass")
        @ExcludeMissing
        launchMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchNotes")
        @ExcludeMissing
        launchNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchNumber")
        @ExcludeMissing
        launchNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchProvider")
        @ExcludeMissing
        launchProvider: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchProviderCountry")
        @ExcludeMissing
        launchProviderCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchProviderFlightNumber")
        @ExcludeMissing
        launchProviderFlightNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchSiteId")
        @ExcludeMissing
        launchSiteId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchSiteName")
        @ExcludeMissing
        launchSiteName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchType")
        @ExcludeMissing
        launchType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchVehicleId")
        @ExcludeMissing
        launchVehicleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("leased") @ExcludeMissing leased: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lifeLost") @ExcludeMissing lifeLost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("massCategory")
        @ExcludeMissing
        massCategory: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nameAtLaunch")
        @ExcludeMissing
        nameAtLaunch: JsonField<String> = JsonMissing.of(),
        @JsonProperty("newCost") @ExcludeMissing newCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numHumans") @ExcludeMissing numHumans: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operatorCountry")
        @ExcludeMissing
        operatorCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("orbitCategory")
        @ExcludeMissing
        orbitCategory: JsonField<String> = JsonMissing.of(),
        @JsonProperty("orbitSubCategory")
        @ExcludeMissing
        orbitSubCategory: JsonField<String> = JsonMissing.of(),
        @JsonProperty("orderDate")
        @ExcludeMissing
        orderDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ownerCountry")
        @ExcludeMissing
        ownerCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("perigee") @ExcludeMissing perigee: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("period") @ExcludeMissing period: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("primaryMissionGroup")
        @ExcludeMissing
        primaryMissionGroup: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primeManufacturerOrgId")
        @ExcludeMissing
        primeManufacturerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("programName")
        @ExcludeMissing
        programName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("reusableFlights")
        @ExcludeMissing
        reusableFlights: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reusedHullName")
        @ExcludeMissing
        reusedHullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sector") @ExcludeMissing sector: JsonField<String> = JsonMissing.of(),
        @JsonProperty("serialNumber")
        @ExcludeMissing
        serialNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stabilizer")
        @ExcludeMissing
        stabilizer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("totalClaims") @ExcludeMissing totalClaims: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("totalFatalities")
        @ExcludeMissing
        totalFatalities: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("totalInjuries")
        @ExcludeMissing
        totalInjuries: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("totalPayloadPower")
        @ExcludeMissing
        totalPayloadPower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("youtubeLaunchLink")
        @ExcludeMissing
        youtubeLaunchLink: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        name,
        source,
        id,
        additionalMissionsGroups,
        altitude,
        annualInsuredDepreciationFactor,
        annualInsuredDepreciationFactorEstimated,
        apogee,
        busId,
        capabilityLost,
        capacityLost,
        catalogNumber,
        collisionRiskCm,
        collisionRiskMm,
        combinedCostEstimated,
        combinedNewCost,
        commercialLaunch,
        constellation,
        costEstimated,
        createdAt,
        createdBy,
        cubesatDispenserType,
        currentAge,
        dateOfObservation,
        description,
        designLife,
        dryMass,
        expectedLife,
        geoPosition,
        idOnOrbit,
        inclination,
        insuranceLossesTotal,
        insuranceNotes,
        insurancePremiumAtLaunch,
        insurancePremiumAtLaunchEstimated,
        insuredAtLaunch,
        insuredValueAtLaunch,
        insuredValueLaunchEstimated,
        intlNumber,
        lat,
        launchArranger,
        launchArrangerCountry,
        launchCharacteristic,
        launchCost,
        launchCostEstimated,
        launchCountry,
        launchDate,
        launchDateRemarks,
        launchId,
        launchMass,
        launchNotes,
        launchNumber,
        launchProvider,
        launchProviderCountry,
        launchProviderFlightNumber,
        launchSiteId,
        launchSiteName,
        launchType,
        launchVehicleId,
        leased,
        lifeLost,
        lon,
        massCategory,
        nameAtLaunch,
        newCost,
        notes,
        numHumans,
        operator,
        operatorCountry,
        orbitCategory,
        orbitSubCategory,
        orderDate,
        origin,
        origNetwork,
        owner,
        ownerCountry,
        perigee,
        period,
        primaryMissionGroup,
        primeManufacturerOrgId,
        programName,
        quantity,
        reusableFlights,
        reusedHullName,
        sector,
        serialNumber,
        stabilizer,
        status,
        totalClaims,
        totalFatalities,
        totalInjuries,
        totalPayloadPower,
        youtubeLaunchLink,
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
     * Spacecraft name.
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
     * Spacecraft additional missions and groups.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun additionalMissionsGroups(): Optional<String> =
        additionalMissionsGroups.getOptional("additionalMissionsGroups")

    /**
     * Spacecraft latest altitude in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altitude(): Optional<Double> = altitude.getOptional("altitude")

    /**
     * Annual insured depreciaion factor as a percent fraction.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun annualInsuredDepreciationFactor(): Optional<Double> =
        annualInsuredDepreciationFactor.getOptional("annualInsuredDepreciationFactor")

    /**
     * Boolean indicating if the spacecraft annualInsuredDepreciationFactor is estimated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun annualInsuredDepreciationFactorEstimated(): Optional<Boolean> =
        annualInsuredDepreciationFactorEstimated.getOptional(
            "annualInsuredDepreciationFactorEstimated"
        )

    /**
     * Apogee in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun apogee(): Optional<Double> = apogee.getOptional("apogee")

    /**
     * Spacecraft Bus ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun busId(): Optional<String> = busId.getOptional("busId")

    /**
     * Total capability lost as a percent fraction.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun capabilityLost(): Optional<Double> = capabilityLost.getOptional("capabilityLost")

    /**
     * Total capacity lost as a percent fraction.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun capacityLost(): Optional<Double> = capacityLost.getOptional("capacityLost")

    /**
     * NORAD satellite number if available.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun catalogNumber(): Optional<Int> = catalogNumber.getOptional("catalogNumber")

    /**
     * Spacecraft collision risk 1cm sqm latest.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun collisionRiskCm(): Optional<Double> = collisionRiskCm.getOptional("collisionRiskCM")

    /**
     * Spacecraft collision risk 1mm sqm latest.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun collisionRiskMm(): Optional<Double> = collisionRiskMm.getOptional("collisionRiskMM")

    /**
     * Boolean indicating if the spacecraft combined new cost is estimated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun combinedCostEstimated(): Optional<Boolean> =
        combinedCostEstimated.getOptional("combinedCostEstimated")

    /**
     * Combined cost of spacecraft at new in M USD.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun combinedNewCost(): Optional<Double> = combinedNewCost.getOptional("combinedNewCost")

    /**
     * Boolean indicating if the launch was commercial.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun commercialLaunch(): Optional<Boolean> = commercialLaunch.getOptional("commercialLaunch")

    /**
     * Spacecraft constellation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun constellation(): Optional<String> = constellation.getOptional("constellation")

    /**
     * Boolean indicating if the spacecraft cost is estimated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun costEstimated(): Optional<Boolean> = costEstimated.getOptional("costEstimated")

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
     * Cubesat dispenser type.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cubesatDispenserType(): Optional<String> =
        cubesatDispenserType.getOptional("cubesatDispenserType")

    /**
     * Current age in years.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun currentAge(): Optional<Double> = currentAge.getOptional("currentAge")

    /**
     * Spacecraft date of observation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dateOfObservation(): Optional<OffsetDateTime> =
        dateOfObservation.getOptional("dateOfObservation")

    /**
     * Description associated with the spacecraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Spacecraft design life in days.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun designLife(): Optional<Int> = designLife.getOptional("designLife")

    /**
     * Mass dry in kg.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dryMass(): Optional<Double> = dryMass.getOptional("dryMass")

    /**
     * Spacecraft expected life in days.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun expectedLife(): Optional<Int> = expectedLife.getOptional("expectedLife")

    /**
     * WGS84 longitude of the spacecraft’s latest GEO position, in degrees. -180 to 180 degrees
     * (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoPosition(): Optional<Double> = geoPosition.getOptional("geoPosition")

    /**
     * UUID of the parent Onorbit record, if available.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Seradata provided inclination in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun inclination(): Optional<Double> = inclination.getOptional("inclination")

    /**
     * Spacecraft total insurance losses as a fraction.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun insuranceLossesTotal(): Optional<Double> =
        insuranceLossesTotal.getOptional("insuranceLossesTotal")

    /**
     * Insurance notes for the spacecraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun insuranceNotes(): Optional<String> = insuranceNotes.getOptional("insuranceNotes")

    /**
     * Insurance premium at launch in M USD.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun insurancePremiumAtLaunch(): Optional<Double> =
        insurancePremiumAtLaunch.getOptional("insurancePremiumAtLaunch")

    /**
     * Boolean indicating if the spacecraft insurancePremiumAtLaunch is estimated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun insurancePremiumAtLaunchEstimated(): Optional<Boolean> =
        insurancePremiumAtLaunchEstimated.getOptional("insurancePremiumAtLaunchEstimated")

    /**
     * Boolean indicating if the spacecraft was insured at launch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun insuredAtLaunch(): Optional<Boolean> = insuredAtLaunch.getOptional("insuredAtLaunch")

    /**
     * Insured value of spacecraft at launch in M USD.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun insuredValueAtLaunch(): Optional<Double> =
        insuredValueAtLaunch.getOptional("insuredValueAtLaunch")

    /**
     * Boolean indicating if the spacecraft insured value at launch is estimated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun insuredValueLaunchEstimated(): Optional<Boolean> =
        insuredValueLaunchEstimated.getOptional("insuredValueLaunchEstimated")

    /**
     * Seradata international number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun intlNumber(): Optional<String> = intlNumber.getOptional("intlNumber")

    /**
     * Spacecraft latest latitude in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lat(): Optional<Double> = lat.getOptional("lat")

    /**
     * Spacecraft launch arranger.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchArranger(): Optional<String> = launchArranger.getOptional("launchArranger")

    /**
     * Spacecraft launch arranger country.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchArrangerCountry(): Optional<String> =
        launchArrangerCountry.getOptional("launchArrangerCountry")

    /**
     * Seradata launch characteristic (e.g. Expendable, Reusable (New), etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchCharacteristic(): Optional<String> =
        launchCharacteristic.getOptional("launchCharacteristic")

    /**
     * Cost of launch in M USD.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchCost(): Optional<Double> = launchCost.getOptional("launchCost")

    /**
     * Boolean indicating if the spacecraft launch cost is estimated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchCostEstimated(): Optional<Boolean> =
        launchCostEstimated.getOptional("launchCostEstimated")

    /**
     * Seradata launch country.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchCountry(): Optional<String> = launchCountry.getOptional("launchCountry")

    /**
     * Launch date.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchDate(): Optional<OffsetDateTime> = launchDate.getOptional("launchDate")

    /**
     * Seradata remarks on launch date.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchDateRemarks(): Optional<String> = launchDateRemarks.getOptional("launchDateRemarks")

    /**
     * Seradata launch ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchId(): Optional<String> = launchId.getOptional("launchId")

    /**
     * Mass at launch in kg.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchMass(): Optional<Double> = launchMass.getOptional("launchMass")

    /**
     * Insurance notes for the spacecraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchNotes(): Optional<String> = launchNotes.getOptional("launchNotes")

    /**
     * Seradata launch number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchNumber(): Optional<String> = launchNumber.getOptional("launchNumber")

    /**
     * Seradata launch provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchProvider(): Optional<String> = launchProvider.getOptional("launchProvider")

    /**
     * Seradata launch provider country.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchProviderCountry(): Optional<String> =
        launchProviderCountry.getOptional("launchProviderCountry")

    /**
     * Seradata launch vehicle family.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchProviderFlightNumber(): Optional<String> =
        launchProviderFlightNumber.getOptional("launchProviderFlightNumber")

    /**
     * Seradata Launch Site ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchSiteId(): Optional<String> = launchSiteId.getOptional("launchSiteId")

    /**
     * Launch Site Name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchSiteName(): Optional<String> = launchSiteName.getOptional("launchSiteName")

    /**
     * Seradata launch type (e.g. Launched, Future, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchType(): Optional<String> = launchType.getOptional("launchType")

    /**
     * Seradata launch ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchVehicleId(): Optional<String> = launchVehicleId.getOptional("launchVehicleId")

    /**
     * Boolean indicating if the spacecraft was leased.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun leased(): Optional<Boolean> = leased.getOptional("leased")

    /**
     * Spacecraft life lost as a percent fraction.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lifeLost(): Optional<Double> = lifeLost.getOptional("lifeLost")

    /**
     * Spacecraft latest longitude in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lon(): Optional<Double> = lon.getOptional("lon")

    /**
     * Mass category (e.g. 2500 - 3500kg - Large Satellite, 10 - 100 kg - Microsatellite, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun massCategory(): Optional<String> = massCategory.getOptional("massCategory")

    /**
     * Spacecraft name at launch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nameAtLaunch(): Optional<String> = nameAtLaunch.getOptional("nameAtLaunch")

    /**
     * Cost of spacecraft at new in M USD.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun newCost(): Optional<Double> = newCost.getOptional("newCost")

    /**
     * Notes on the spacecraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * Number of humans carried on spacecraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numHumans(): Optional<Int> = numHumans.getOptional("numHumans")

    /**
     * Spacecraft operator name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operator(): Optional<String> = operator.getOptional("operator")

    /**
     * Spacecraft operator country.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operatorCountry(): Optional<String> = operatorCountry.getOptional("operatorCountry")

    /**
     * Spacecraft orbit category (e.g GEO, LEO, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun orbitCategory(): Optional<String> = orbitCategory.getOptional("orbitCategory")

    /**
     * Spacecraft sub orbit category (e.g LEO - Sun-synchronous, Geostationary, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun orbitSubCategory(): Optional<String> = orbitSubCategory.getOptional("orbitSubCategory")

    /**
     * Spacecraft order date.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun orderDate(): Optional<OffsetDateTime> = orderDate.getOptional("orderDate")

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
     * Spacecraft owner name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun owner(): Optional<String> = owner.getOptional("owner")

    /**
     * Spacecraft owner country.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ownerCountry(): Optional<String> = ownerCountry.getOptional("ownerCountry")

    /**
     * Perigee in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun perigee(): Optional<Double> = perigee.getOptional("perigee")

    /**
     * Spacecraft period in minutes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun period(): Optional<Double> = period.getOptional("period")

    /**
     * Spacecraft primary mission and group.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun primaryMissionGroup(): Optional<String> =
        primaryMissionGroup.getOptional("primaryMissionGroup")

    /**
     * UUID of the prime manufacturer organization, if available.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun primeManufacturerOrgId(): Optional<String> =
        primeManufacturerOrgId.getOptional("primeManufacturerOrgId")

    /**
     * Spacecraft program name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun programName(): Optional<String> = programName.getOptional("programName")

    /**
     * Spacecraft quantity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun quantity(): Optional<Int> = quantity.getOptional("quantity")

    /**
     * Spacecraft reusable flights.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reusableFlights(): Optional<String> = reusableFlights.getOptional("reusableFlights")

    /**
     * Spacecraft reused hull name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reusedHullName(): Optional<String> = reusedHullName.getOptional("reusedHullName")

    /**
     * Seradata sector (e.g. Commercial, Military, Civil/Other).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sector(): Optional<String> = sector.getOptional("sector")

    /**
     * Spacecraft serial number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun serialNumber(): Optional<String> = serialNumber.getOptional("serialNumber")

    /**
     * Spacecraft stabilizer (e.g. 3-Axis, Gravity Gradiant, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stabilizer(): Optional<String> = stabilizer.getOptional("stabilizer")

    /**
     * Spacecraft status (e.g. Inactive - Retired, Inactive - Re-entered, Active, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Number of insurance claims for this spacecraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun totalClaims(): Optional<Int> = totalClaims.getOptional("totalClaims")

    /**
     * Number of fatalities related to this spacecraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun totalFatalities(): Optional<Int> = totalFatalities.getOptional("totalFatalities")

    /**
     * Number of injuries related to this spacecraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun totalInjuries(): Optional<Int> = totalInjuries.getOptional("totalInjuries")

    /**
     * Mass dry in kg.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun totalPayloadPower(): Optional<Double> = totalPayloadPower.getOptional("totalPayloadPower")

    /**
     * Youtube link of launch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun youtubeLaunchLink(): Optional<String> = youtubeLaunchLink.getOptional("youtubeLaunchLink")

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
     * Returns the raw JSON value of [additionalMissionsGroups].
     *
     * Unlike [additionalMissionsGroups], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("additionalMissionsGroups")
    @ExcludeMissing
    fun _additionalMissionsGroups(): JsonField<String> = additionalMissionsGroups

    /**
     * Returns the raw JSON value of [altitude].
     *
     * Unlike [altitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altitude") @ExcludeMissing fun _altitude(): JsonField<Double> = altitude

    /**
     * Returns the raw JSON value of [annualInsuredDepreciationFactor].
     *
     * Unlike [annualInsuredDepreciationFactor], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("annualInsuredDepreciationFactor")
    @ExcludeMissing
    fun _annualInsuredDepreciationFactor(): JsonField<Double> = annualInsuredDepreciationFactor

    /**
     * Returns the raw JSON value of [annualInsuredDepreciationFactorEstimated].
     *
     * Unlike [annualInsuredDepreciationFactorEstimated], this method doesn't throw if the JSON
     * field has an unexpected type.
     */
    @JsonProperty("annualInsuredDepreciationFactorEstimated")
    @ExcludeMissing
    fun _annualInsuredDepreciationFactorEstimated(): JsonField<Boolean> =
        annualInsuredDepreciationFactorEstimated

    /**
     * Returns the raw JSON value of [apogee].
     *
     * Unlike [apogee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apogee") @ExcludeMissing fun _apogee(): JsonField<Double> = apogee

    /**
     * Returns the raw JSON value of [busId].
     *
     * Unlike [busId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("busId") @ExcludeMissing fun _busId(): JsonField<String> = busId

    /**
     * Returns the raw JSON value of [capabilityLost].
     *
     * Unlike [capabilityLost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capabilityLost")
    @ExcludeMissing
    fun _capabilityLost(): JsonField<Double> = capabilityLost

    /**
     * Returns the raw JSON value of [capacityLost].
     *
     * Unlike [capacityLost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capacityLost")
    @ExcludeMissing
    fun _capacityLost(): JsonField<Double> = capacityLost

    /**
     * Returns the raw JSON value of [catalogNumber].
     *
     * Unlike [catalogNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("catalogNumber")
    @ExcludeMissing
    fun _catalogNumber(): JsonField<Int> = catalogNumber

    /**
     * Returns the raw JSON value of [collisionRiskCm].
     *
     * Unlike [collisionRiskCm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collisionRiskCM")
    @ExcludeMissing
    fun _collisionRiskCm(): JsonField<Double> = collisionRiskCm

    /**
     * Returns the raw JSON value of [collisionRiskMm].
     *
     * Unlike [collisionRiskMm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collisionRiskMM")
    @ExcludeMissing
    fun _collisionRiskMm(): JsonField<Double> = collisionRiskMm

    /**
     * Returns the raw JSON value of [combinedCostEstimated].
     *
     * Unlike [combinedCostEstimated], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("combinedCostEstimated")
    @ExcludeMissing
    fun _combinedCostEstimated(): JsonField<Boolean> = combinedCostEstimated

    /**
     * Returns the raw JSON value of [combinedNewCost].
     *
     * Unlike [combinedNewCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("combinedNewCost")
    @ExcludeMissing
    fun _combinedNewCost(): JsonField<Double> = combinedNewCost

    /**
     * Returns the raw JSON value of [commercialLaunch].
     *
     * Unlike [commercialLaunch], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("commercialLaunch")
    @ExcludeMissing
    fun _commercialLaunch(): JsonField<Boolean> = commercialLaunch

    /**
     * Returns the raw JSON value of [constellation].
     *
     * Unlike [constellation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("constellation")
    @ExcludeMissing
    fun _constellation(): JsonField<String> = constellation

    /**
     * Returns the raw JSON value of [costEstimated].
     *
     * Unlike [costEstimated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("costEstimated")
    @ExcludeMissing
    fun _costEstimated(): JsonField<Boolean> = costEstimated

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
     * Returns the raw JSON value of [cubesatDispenserType].
     *
     * Unlike [cubesatDispenserType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cubesatDispenserType")
    @ExcludeMissing
    fun _cubesatDispenserType(): JsonField<String> = cubesatDispenserType

    /**
     * Returns the raw JSON value of [currentAge].
     *
     * Unlike [currentAge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currentAge") @ExcludeMissing fun _currentAge(): JsonField<Double> = currentAge

    /**
     * Returns the raw JSON value of [dateOfObservation].
     *
     * Unlike [dateOfObservation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dateOfObservation")
    @ExcludeMissing
    fun _dateOfObservation(): JsonField<OffsetDateTime> = dateOfObservation

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [designLife].
     *
     * Unlike [designLife], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("designLife") @ExcludeMissing fun _designLife(): JsonField<Int> = designLife

    /**
     * Returns the raw JSON value of [dryMass].
     *
     * Unlike [dryMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dryMass") @ExcludeMissing fun _dryMass(): JsonField<Double> = dryMass

    /**
     * Returns the raw JSON value of [expectedLife].
     *
     * Unlike [expectedLife], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expectedLife") @ExcludeMissing fun _expectedLife(): JsonField<Int> = expectedLife

    /**
     * Returns the raw JSON value of [geoPosition].
     *
     * Unlike [geoPosition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoPosition") @ExcludeMissing fun _geoPosition(): JsonField<Double> = geoPosition

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [inclination].
     *
     * Unlike [inclination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inclination") @ExcludeMissing fun _inclination(): JsonField<Double> = inclination

    /**
     * Returns the raw JSON value of [insuranceLossesTotal].
     *
     * Unlike [insuranceLossesTotal], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("insuranceLossesTotal")
    @ExcludeMissing
    fun _insuranceLossesTotal(): JsonField<Double> = insuranceLossesTotal

    /**
     * Returns the raw JSON value of [insuranceNotes].
     *
     * Unlike [insuranceNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("insuranceNotes")
    @ExcludeMissing
    fun _insuranceNotes(): JsonField<String> = insuranceNotes

    /**
     * Returns the raw JSON value of [insurancePremiumAtLaunch].
     *
     * Unlike [insurancePremiumAtLaunch], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("insurancePremiumAtLaunch")
    @ExcludeMissing
    fun _insurancePremiumAtLaunch(): JsonField<Double> = insurancePremiumAtLaunch

    /**
     * Returns the raw JSON value of [insurancePremiumAtLaunchEstimated].
     *
     * Unlike [insurancePremiumAtLaunchEstimated], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("insurancePremiumAtLaunchEstimated")
    @ExcludeMissing
    fun _insurancePremiumAtLaunchEstimated(): JsonField<Boolean> = insurancePremiumAtLaunchEstimated

    /**
     * Returns the raw JSON value of [insuredAtLaunch].
     *
     * Unlike [insuredAtLaunch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("insuredAtLaunch")
    @ExcludeMissing
    fun _insuredAtLaunch(): JsonField<Boolean> = insuredAtLaunch

    /**
     * Returns the raw JSON value of [insuredValueAtLaunch].
     *
     * Unlike [insuredValueAtLaunch], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("insuredValueAtLaunch")
    @ExcludeMissing
    fun _insuredValueAtLaunch(): JsonField<Double> = insuredValueAtLaunch

    /**
     * Returns the raw JSON value of [insuredValueLaunchEstimated].
     *
     * Unlike [insuredValueLaunchEstimated], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("insuredValueLaunchEstimated")
    @ExcludeMissing
    fun _insuredValueLaunchEstimated(): JsonField<Boolean> = insuredValueLaunchEstimated

    /**
     * Returns the raw JSON value of [intlNumber].
     *
     * Unlike [intlNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intlNumber") @ExcludeMissing fun _intlNumber(): JsonField<String> = intlNumber

    /**
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

    /**
     * Returns the raw JSON value of [launchArranger].
     *
     * Unlike [launchArranger], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchArranger")
    @ExcludeMissing
    fun _launchArranger(): JsonField<String> = launchArranger

    /**
     * Returns the raw JSON value of [launchArrangerCountry].
     *
     * Unlike [launchArrangerCountry], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("launchArrangerCountry")
    @ExcludeMissing
    fun _launchArrangerCountry(): JsonField<String> = launchArrangerCountry

    /**
     * Returns the raw JSON value of [launchCharacteristic].
     *
     * Unlike [launchCharacteristic], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("launchCharacteristic")
    @ExcludeMissing
    fun _launchCharacteristic(): JsonField<String> = launchCharacteristic

    /**
     * Returns the raw JSON value of [launchCost].
     *
     * Unlike [launchCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchCost") @ExcludeMissing fun _launchCost(): JsonField<Double> = launchCost

    /**
     * Returns the raw JSON value of [launchCostEstimated].
     *
     * Unlike [launchCostEstimated], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("launchCostEstimated")
    @ExcludeMissing
    fun _launchCostEstimated(): JsonField<Boolean> = launchCostEstimated

    /**
     * Returns the raw JSON value of [launchCountry].
     *
     * Unlike [launchCountry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchCountry")
    @ExcludeMissing
    fun _launchCountry(): JsonField<String> = launchCountry

    /**
     * Returns the raw JSON value of [launchDate].
     *
     * Unlike [launchDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchDate")
    @ExcludeMissing
    fun _launchDate(): JsonField<OffsetDateTime> = launchDate

    /**
     * Returns the raw JSON value of [launchDateRemarks].
     *
     * Unlike [launchDateRemarks], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("launchDateRemarks")
    @ExcludeMissing
    fun _launchDateRemarks(): JsonField<String> = launchDateRemarks

    /**
     * Returns the raw JSON value of [launchId].
     *
     * Unlike [launchId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchId") @ExcludeMissing fun _launchId(): JsonField<String> = launchId

    /**
     * Returns the raw JSON value of [launchMass].
     *
     * Unlike [launchMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchMass") @ExcludeMissing fun _launchMass(): JsonField<Double> = launchMass

    /**
     * Returns the raw JSON value of [launchNotes].
     *
     * Unlike [launchNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchNotes") @ExcludeMissing fun _launchNotes(): JsonField<String> = launchNotes

    /**
     * Returns the raw JSON value of [launchNumber].
     *
     * Unlike [launchNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchNumber")
    @ExcludeMissing
    fun _launchNumber(): JsonField<String> = launchNumber

    /**
     * Returns the raw JSON value of [launchProvider].
     *
     * Unlike [launchProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchProvider")
    @ExcludeMissing
    fun _launchProvider(): JsonField<String> = launchProvider

    /**
     * Returns the raw JSON value of [launchProviderCountry].
     *
     * Unlike [launchProviderCountry], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("launchProviderCountry")
    @ExcludeMissing
    fun _launchProviderCountry(): JsonField<String> = launchProviderCountry

    /**
     * Returns the raw JSON value of [launchProviderFlightNumber].
     *
     * Unlike [launchProviderFlightNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("launchProviderFlightNumber")
    @ExcludeMissing
    fun _launchProviderFlightNumber(): JsonField<String> = launchProviderFlightNumber

    /**
     * Returns the raw JSON value of [launchSiteId].
     *
     * Unlike [launchSiteId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchSiteId")
    @ExcludeMissing
    fun _launchSiteId(): JsonField<String> = launchSiteId

    /**
     * Returns the raw JSON value of [launchSiteName].
     *
     * Unlike [launchSiteName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchSiteName")
    @ExcludeMissing
    fun _launchSiteName(): JsonField<String> = launchSiteName

    /**
     * Returns the raw JSON value of [launchType].
     *
     * Unlike [launchType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchType") @ExcludeMissing fun _launchType(): JsonField<String> = launchType

    /**
     * Returns the raw JSON value of [launchVehicleId].
     *
     * Unlike [launchVehicleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchVehicleId")
    @ExcludeMissing
    fun _launchVehicleId(): JsonField<String> = launchVehicleId

    /**
     * Returns the raw JSON value of [leased].
     *
     * Unlike [leased], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("leased") @ExcludeMissing fun _leased(): JsonField<Boolean> = leased

    /**
     * Returns the raw JSON value of [lifeLost].
     *
     * Unlike [lifeLost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lifeLost") @ExcludeMissing fun _lifeLost(): JsonField<Double> = lifeLost

    /**
     * Returns the raw JSON value of [lon].
     *
     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

    /**
     * Returns the raw JSON value of [massCategory].
     *
     * Unlike [massCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("massCategory")
    @ExcludeMissing
    fun _massCategory(): JsonField<String> = massCategory

    /**
     * Returns the raw JSON value of [nameAtLaunch].
     *
     * Unlike [nameAtLaunch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nameAtLaunch")
    @ExcludeMissing
    fun _nameAtLaunch(): JsonField<String> = nameAtLaunch

    /**
     * Returns the raw JSON value of [newCost].
     *
     * Unlike [newCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("newCost") @ExcludeMissing fun _newCost(): JsonField<Double> = newCost

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [numHumans].
     *
     * Unlike [numHumans], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numHumans") @ExcludeMissing fun _numHumans(): JsonField<Int> = numHumans

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

    /**
     * Returns the raw JSON value of [operatorCountry].
     *
     * Unlike [operatorCountry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operatorCountry")
    @ExcludeMissing
    fun _operatorCountry(): JsonField<String> = operatorCountry

    /**
     * Returns the raw JSON value of [orbitCategory].
     *
     * Unlike [orbitCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("orbitCategory")
    @ExcludeMissing
    fun _orbitCategory(): JsonField<String> = orbitCategory

    /**
     * Returns the raw JSON value of [orbitSubCategory].
     *
     * Unlike [orbitSubCategory], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("orbitSubCategory")
    @ExcludeMissing
    fun _orbitSubCategory(): JsonField<String> = orbitSubCategory

    /**
     * Returns the raw JSON value of [orderDate].
     *
     * Unlike [orderDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("orderDate")
    @ExcludeMissing
    fun _orderDate(): JsonField<OffsetDateTime> = orderDate

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
     * Returns the raw JSON value of [owner].
     *
     * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

    /**
     * Returns the raw JSON value of [ownerCountry].
     *
     * Unlike [ownerCountry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ownerCountry")
    @ExcludeMissing
    fun _ownerCountry(): JsonField<String> = ownerCountry

    /**
     * Returns the raw JSON value of [perigee].
     *
     * Unlike [perigee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("perigee") @ExcludeMissing fun _perigee(): JsonField<Double> = perigee

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<Double> = period

    /**
     * Returns the raw JSON value of [primaryMissionGroup].
     *
     * Unlike [primaryMissionGroup], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primaryMissionGroup")
    @ExcludeMissing
    fun _primaryMissionGroup(): JsonField<String> = primaryMissionGroup

    /**
     * Returns the raw JSON value of [primeManufacturerOrgId].
     *
     * Unlike [primeManufacturerOrgId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("primeManufacturerOrgId")
    @ExcludeMissing
    fun _primeManufacturerOrgId(): JsonField<String> = primeManufacturerOrgId

    /**
     * Returns the raw JSON value of [programName].
     *
     * Unlike [programName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("programName") @ExcludeMissing fun _programName(): JsonField<String> = programName

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

    /**
     * Returns the raw JSON value of [reusableFlights].
     *
     * Unlike [reusableFlights], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reusableFlights")
    @ExcludeMissing
    fun _reusableFlights(): JsonField<String> = reusableFlights

    /**
     * Returns the raw JSON value of [reusedHullName].
     *
     * Unlike [reusedHullName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reusedHullName")
    @ExcludeMissing
    fun _reusedHullName(): JsonField<String> = reusedHullName

    /**
     * Returns the raw JSON value of [sector].
     *
     * Unlike [sector], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sector") @ExcludeMissing fun _sector(): JsonField<String> = sector

    /**
     * Returns the raw JSON value of [serialNumber].
     *
     * Unlike [serialNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("serialNumber")
    @ExcludeMissing
    fun _serialNumber(): JsonField<String> = serialNumber

    /**
     * Returns the raw JSON value of [stabilizer].
     *
     * Unlike [stabilizer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stabilizer") @ExcludeMissing fun _stabilizer(): JsonField<String> = stabilizer

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [totalClaims].
     *
     * Unlike [totalClaims], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalClaims") @ExcludeMissing fun _totalClaims(): JsonField<Int> = totalClaims

    /**
     * Returns the raw JSON value of [totalFatalities].
     *
     * Unlike [totalFatalities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalFatalities")
    @ExcludeMissing
    fun _totalFatalities(): JsonField<Int> = totalFatalities

    /**
     * Returns the raw JSON value of [totalInjuries].
     *
     * Unlike [totalInjuries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalInjuries")
    @ExcludeMissing
    fun _totalInjuries(): JsonField<Int> = totalInjuries

    /**
     * Returns the raw JSON value of [totalPayloadPower].
     *
     * Unlike [totalPayloadPower], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalPayloadPower")
    @ExcludeMissing
    fun _totalPayloadPower(): JsonField<Double> = totalPayloadPower

    /**
     * Returns the raw JSON value of [youtubeLaunchLink].
     *
     * Unlike [youtubeLaunchLink], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("youtubeLaunchLink")
    @ExcludeMissing
    fun _youtubeLaunchLink(): JsonField<String> = youtubeLaunchLink

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
         * [SeradataSpacecraftDetailListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SeradataSpacecraftDetailListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var name: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var additionalMissionsGroups: JsonField<String> = JsonMissing.of()
        private var altitude: JsonField<Double> = JsonMissing.of()
        private var annualInsuredDepreciationFactor: JsonField<Double> = JsonMissing.of()
        private var annualInsuredDepreciationFactorEstimated: JsonField<Boolean> = JsonMissing.of()
        private var apogee: JsonField<Double> = JsonMissing.of()
        private var busId: JsonField<String> = JsonMissing.of()
        private var capabilityLost: JsonField<Double> = JsonMissing.of()
        private var capacityLost: JsonField<Double> = JsonMissing.of()
        private var catalogNumber: JsonField<Int> = JsonMissing.of()
        private var collisionRiskCm: JsonField<Double> = JsonMissing.of()
        private var collisionRiskMm: JsonField<Double> = JsonMissing.of()
        private var combinedCostEstimated: JsonField<Boolean> = JsonMissing.of()
        private var combinedNewCost: JsonField<Double> = JsonMissing.of()
        private var commercialLaunch: JsonField<Boolean> = JsonMissing.of()
        private var constellation: JsonField<String> = JsonMissing.of()
        private var costEstimated: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var cubesatDispenserType: JsonField<String> = JsonMissing.of()
        private var currentAge: JsonField<Double> = JsonMissing.of()
        private var dateOfObservation: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var designLife: JsonField<Int> = JsonMissing.of()
        private var dryMass: JsonField<Double> = JsonMissing.of()
        private var expectedLife: JsonField<Int> = JsonMissing.of()
        private var geoPosition: JsonField<Double> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var inclination: JsonField<Double> = JsonMissing.of()
        private var insuranceLossesTotal: JsonField<Double> = JsonMissing.of()
        private var insuranceNotes: JsonField<String> = JsonMissing.of()
        private var insurancePremiumAtLaunch: JsonField<Double> = JsonMissing.of()
        private var insurancePremiumAtLaunchEstimated: JsonField<Boolean> = JsonMissing.of()
        private var insuredAtLaunch: JsonField<Boolean> = JsonMissing.of()
        private var insuredValueAtLaunch: JsonField<Double> = JsonMissing.of()
        private var insuredValueLaunchEstimated: JsonField<Boolean> = JsonMissing.of()
        private var intlNumber: JsonField<String> = JsonMissing.of()
        private var lat: JsonField<Double> = JsonMissing.of()
        private var launchArranger: JsonField<String> = JsonMissing.of()
        private var launchArrangerCountry: JsonField<String> = JsonMissing.of()
        private var launchCharacteristic: JsonField<String> = JsonMissing.of()
        private var launchCost: JsonField<Double> = JsonMissing.of()
        private var launchCostEstimated: JsonField<Boolean> = JsonMissing.of()
        private var launchCountry: JsonField<String> = JsonMissing.of()
        private var launchDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var launchDateRemarks: JsonField<String> = JsonMissing.of()
        private var launchId: JsonField<String> = JsonMissing.of()
        private var launchMass: JsonField<Double> = JsonMissing.of()
        private var launchNotes: JsonField<String> = JsonMissing.of()
        private var launchNumber: JsonField<String> = JsonMissing.of()
        private var launchProvider: JsonField<String> = JsonMissing.of()
        private var launchProviderCountry: JsonField<String> = JsonMissing.of()
        private var launchProviderFlightNumber: JsonField<String> = JsonMissing.of()
        private var launchSiteId: JsonField<String> = JsonMissing.of()
        private var launchSiteName: JsonField<String> = JsonMissing.of()
        private var launchType: JsonField<String> = JsonMissing.of()
        private var launchVehicleId: JsonField<String> = JsonMissing.of()
        private var leased: JsonField<Boolean> = JsonMissing.of()
        private var lifeLost: JsonField<Double> = JsonMissing.of()
        private var lon: JsonField<Double> = JsonMissing.of()
        private var massCategory: JsonField<String> = JsonMissing.of()
        private var nameAtLaunch: JsonField<String> = JsonMissing.of()
        private var newCost: JsonField<Double> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var numHumans: JsonField<Int> = JsonMissing.of()
        private var operator: JsonField<String> = JsonMissing.of()
        private var operatorCountry: JsonField<String> = JsonMissing.of()
        private var orbitCategory: JsonField<String> = JsonMissing.of()
        private var orbitSubCategory: JsonField<String> = JsonMissing.of()
        private var orderDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var owner: JsonField<String> = JsonMissing.of()
        private var ownerCountry: JsonField<String> = JsonMissing.of()
        private var perigee: JsonField<Double> = JsonMissing.of()
        private var period: JsonField<Double> = JsonMissing.of()
        private var primaryMissionGroup: JsonField<String> = JsonMissing.of()
        private var primeManufacturerOrgId: JsonField<String> = JsonMissing.of()
        private var programName: JsonField<String> = JsonMissing.of()
        private var quantity: JsonField<Int> = JsonMissing.of()
        private var reusableFlights: JsonField<String> = JsonMissing.of()
        private var reusedHullName: JsonField<String> = JsonMissing.of()
        private var sector: JsonField<String> = JsonMissing.of()
        private var serialNumber: JsonField<String> = JsonMissing.of()
        private var stabilizer: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var totalClaims: JsonField<Int> = JsonMissing.of()
        private var totalFatalities: JsonField<Int> = JsonMissing.of()
        private var totalInjuries: JsonField<Int> = JsonMissing.of()
        private var totalPayloadPower: JsonField<Double> = JsonMissing.of()
        private var youtubeLaunchLink: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            seradataSpacecraftDetailListResponse: SeradataSpacecraftDetailListResponse
        ) = apply {
            classificationMarking = seradataSpacecraftDetailListResponse.classificationMarking
            dataMode = seradataSpacecraftDetailListResponse.dataMode
            name = seradataSpacecraftDetailListResponse.name
            source = seradataSpacecraftDetailListResponse.source
            id = seradataSpacecraftDetailListResponse.id
            additionalMissionsGroups = seradataSpacecraftDetailListResponse.additionalMissionsGroups
            altitude = seradataSpacecraftDetailListResponse.altitude
            annualInsuredDepreciationFactor =
                seradataSpacecraftDetailListResponse.annualInsuredDepreciationFactor
            annualInsuredDepreciationFactorEstimated =
                seradataSpacecraftDetailListResponse.annualInsuredDepreciationFactorEstimated
            apogee = seradataSpacecraftDetailListResponse.apogee
            busId = seradataSpacecraftDetailListResponse.busId
            capabilityLost = seradataSpacecraftDetailListResponse.capabilityLost
            capacityLost = seradataSpacecraftDetailListResponse.capacityLost
            catalogNumber = seradataSpacecraftDetailListResponse.catalogNumber
            collisionRiskCm = seradataSpacecraftDetailListResponse.collisionRiskCm
            collisionRiskMm = seradataSpacecraftDetailListResponse.collisionRiskMm
            combinedCostEstimated = seradataSpacecraftDetailListResponse.combinedCostEstimated
            combinedNewCost = seradataSpacecraftDetailListResponse.combinedNewCost
            commercialLaunch = seradataSpacecraftDetailListResponse.commercialLaunch
            constellation = seradataSpacecraftDetailListResponse.constellation
            costEstimated = seradataSpacecraftDetailListResponse.costEstimated
            createdAt = seradataSpacecraftDetailListResponse.createdAt
            createdBy = seradataSpacecraftDetailListResponse.createdBy
            cubesatDispenserType = seradataSpacecraftDetailListResponse.cubesatDispenserType
            currentAge = seradataSpacecraftDetailListResponse.currentAge
            dateOfObservation = seradataSpacecraftDetailListResponse.dateOfObservation
            description = seradataSpacecraftDetailListResponse.description
            designLife = seradataSpacecraftDetailListResponse.designLife
            dryMass = seradataSpacecraftDetailListResponse.dryMass
            expectedLife = seradataSpacecraftDetailListResponse.expectedLife
            geoPosition = seradataSpacecraftDetailListResponse.geoPosition
            idOnOrbit = seradataSpacecraftDetailListResponse.idOnOrbit
            inclination = seradataSpacecraftDetailListResponse.inclination
            insuranceLossesTotal = seradataSpacecraftDetailListResponse.insuranceLossesTotal
            insuranceNotes = seradataSpacecraftDetailListResponse.insuranceNotes
            insurancePremiumAtLaunch = seradataSpacecraftDetailListResponse.insurancePremiumAtLaunch
            insurancePremiumAtLaunchEstimated =
                seradataSpacecraftDetailListResponse.insurancePremiumAtLaunchEstimated
            insuredAtLaunch = seradataSpacecraftDetailListResponse.insuredAtLaunch
            insuredValueAtLaunch = seradataSpacecraftDetailListResponse.insuredValueAtLaunch
            insuredValueLaunchEstimated =
                seradataSpacecraftDetailListResponse.insuredValueLaunchEstimated
            intlNumber = seradataSpacecraftDetailListResponse.intlNumber
            lat = seradataSpacecraftDetailListResponse.lat
            launchArranger = seradataSpacecraftDetailListResponse.launchArranger
            launchArrangerCountry = seradataSpacecraftDetailListResponse.launchArrangerCountry
            launchCharacteristic = seradataSpacecraftDetailListResponse.launchCharacteristic
            launchCost = seradataSpacecraftDetailListResponse.launchCost
            launchCostEstimated = seradataSpacecraftDetailListResponse.launchCostEstimated
            launchCountry = seradataSpacecraftDetailListResponse.launchCountry
            launchDate = seradataSpacecraftDetailListResponse.launchDate
            launchDateRemarks = seradataSpacecraftDetailListResponse.launchDateRemarks
            launchId = seradataSpacecraftDetailListResponse.launchId
            launchMass = seradataSpacecraftDetailListResponse.launchMass
            launchNotes = seradataSpacecraftDetailListResponse.launchNotes
            launchNumber = seradataSpacecraftDetailListResponse.launchNumber
            launchProvider = seradataSpacecraftDetailListResponse.launchProvider
            launchProviderCountry = seradataSpacecraftDetailListResponse.launchProviderCountry
            launchProviderFlightNumber =
                seradataSpacecraftDetailListResponse.launchProviderFlightNumber
            launchSiteId = seradataSpacecraftDetailListResponse.launchSiteId
            launchSiteName = seradataSpacecraftDetailListResponse.launchSiteName
            launchType = seradataSpacecraftDetailListResponse.launchType
            launchVehicleId = seradataSpacecraftDetailListResponse.launchVehicleId
            leased = seradataSpacecraftDetailListResponse.leased
            lifeLost = seradataSpacecraftDetailListResponse.lifeLost
            lon = seradataSpacecraftDetailListResponse.lon
            massCategory = seradataSpacecraftDetailListResponse.massCategory
            nameAtLaunch = seradataSpacecraftDetailListResponse.nameAtLaunch
            newCost = seradataSpacecraftDetailListResponse.newCost
            notes = seradataSpacecraftDetailListResponse.notes
            numHumans = seradataSpacecraftDetailListResponse.numHumans
            operator = seradataSpacecraftDetailListResponse.operator
            operatorCountry = seradataSpacecraftDetailListResponse.operatorCountry
            orbitCategory = seradataSpacecraftDetailListResponse.orbitCategory
            orbitSubCategory = seradataSpacecraftDetailListResponse.orbitSubCategory
            orderDate = seradataSpacecraftDetailListResponse.orderDate
            origin = seradataSpacecraftDetailListResponse.origin
            origNetwork = seradataSpacecraftDetailListResponse.origNetwork
            owner = seradataSpacecraftDetailListResponse.owner
            ownerCountry = seradataSpacecraftDetailListResponse.ownerCountry
            perigee = seradataSpacecraftDetailListResponse.perigee
            period = seradataSpacecraftDetailListResponse.period
            primaryMissionGroup = seradataSpacecraftDetailListResponse.primaryMissionGroup
            primeManufacturerOrgId = seradataSpacecraftDetailListResponse.primeManufacturerOrgId
            programName = seradataSpacecraftDetailListResponse.programName
            quantity = seradataSpacecraftDetailListResponse.quantity
            reusableFlights = seradataSpacecraftDetailListResponse.reusableFlights
            reusedHullName = seradataSpacecraftDetailListResponse.reusedHullName
            sector = seradataSpacecraftDetailListResponse.sector
            serialNumber = seradataSpacecraftDetailListResponse.serialNumber
            stabilizer = seradataSpacecraftDetailListResponse.stabilizer
            status = seradataSpacecraftDetailListResponse.status
            totalClaims = seradataSpacecraftDetailListResponse.totalClaims
            totalFatalities = seradataSpacecraftDetailListResponse.totalFatalities
            totalInjuries = seradataSpacecraftDetailListResponse.totalInjuries
            totalPayloadPower = seradataSpacecraftDetailListResponse.totalPayloadPower
            youtubeLaunchLink = seradataSpacecraftDetailListResponse.youtubeLaunchLink
            additionalProperties =
                seradataSpacecraftDetailListResponse.additionalProperties.toMutableMap()
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

        /** Spacecraft name. */
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

        /** Spacecraft additional missions and groups. */
        fun additionalMissionsGroups(additionalMissionsGroups: String) =
            additionalMissionsGroups(JsonField.of(additionalMissionsGroups))

        /**
         * Sets [Builder.additionalMissionsGroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalMissionsGroups] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun additionalMissionsGroups(additionalMissionsGroups: JsonField<String>) = apply {
            this.additionalMissionsGroups = additionalMissionsGroups
        }

        /** Spacecraft latest altitude in km. */
        fun altitude(altitude: Double) = altitude(JsonField.of(altitude))

        /**
         * Sets [Builder.altitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altitude] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun altitude(altitude: JsonField<Double>) = apply { this.altitude = altitude }

        /** Annual insured depreciaion factor as a percent fraction. */
        fun annualInsuredDepreciationFactor(annualInsuredDepreciationFactor: Double) =
            annualInsuredDepreciationFactor(JsonField.of(annualInsuredDepreciationFactor))

        /**
         * Sets [Builder.annualInsuredDepreciationFactor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annualInsuredDepreciationFactor] with a well-typed
         * [Double] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun annualInsuredDepreciationFactor(annualInsuredDepreciationFactor: JsonField<Double>) =
            apply {
                this.annualInsuredDepreciationFactor = annualInsuredDepreciationFactor
            }

        /** Boolean indicating if the spacecraft annualInsuredDepreciationFactor is estimated. */
        fun annualInsuredDepreciationFactorEstimated(
            annualInsuredDepreciationFactorEstimated: Boolean
        ) =
            annualInsuredDepreciationFactorEstimated(
                JsonField.of(annualInsuredDepreciationFactorEstimated)
            )

        /**
         * Sets [Builder.annualInsuredDepreciationFactorEstimated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annualInsuredDepreciationFactorEstimated] with a
         * well-typed [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun annualInsuredDepreciationFactorEstimated(
            annualInsuredDepreciationFactorEstimated: JsonField<Boolean>
        ) = apply {
            this.annualInsuredDepreciationFactorEstimated = annualInsuredDepreciationFactorEstimated
        }

        /** Apogee in km. */
        fun apogee(apogee: Double) = apogee(JsonField.of(apogee))

        /**
         * Sets [Builder.apogee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apogee] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apogee(apogee: JsonField<Double>) = apply { this.apogee = apogee }

        /** Spacecraft Bus ID. */
        fun busId(busId: String) = busId(JsonField.of(busId))

        /**
         * Sets [Builder.busId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.busId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun busId(busId: JsonField<String>) = apply { this.busId = busId }

        /** Total capability lost as a percent fraction. */
        fun capabilityLost(capabilityLost: Double) = capabilityLost(JsonField.of(capabilityLost))

        /**
         * Sets [Builder.capabilityLost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilityLost] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun capabilityLost(capabilityLost: JsonField<Double>) = apply {
            this.capabilityLost = capabilityLost
        }

        /** Total capacity lost as a percent fraction. */
        fun capacityLost(capacityLost: Double) = capacityLost(JsonField.of(capacityLost))

        /**
         * Sets [Builder.capacityLost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capacityLost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun capacityLost(capacityLost: JsonField<Double>) = apply {
            this.capacityLost = capacityLost
        }

        /** NORAD satellite number if available. */
        fun catalogNumber(catalogNumber: Int) = catalogNumber(JsonField.of(catalogNumber))

        /**
         * Sets [Builder.catalogNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.catalogNumber] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun catalogNumber(catalogNumber: JsonField<Int>) = apply {
            this.catalogNumber = catalogNumber
        }

        /** Spacecraft collision risk 1cm sqm latest. */
        fun collisionRiskCm(collisionRiskCm: Double) =
            collisionRiskCm(JsonField.of(collisionRiskCm))

        /**
         * Sets [Builder.collisionRiskCm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collisionRiskCm] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collisionRiskCm(collisionRiskCm: JsonField<Double>) = apply {
            this.collisionRiskCm = collisionRiskCm
        }

        /** Spacecraft collision risk 1mm sqm latest. */
        fun collisionRiskMm(collisionRiskMm: Double) =
            collisionRiskMm(JsonField.of(collisionRiskMm))

        /**
         * Sets [Builder.collisionRiskMm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collisionRiskMm] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collisionRiskMm(collisionRiskMm: JsonField<Double>) = apply {
            this.collisionRiskMm = collisionRiskMm
        }

        /** Boolean indicating if the spacecraft combined new cost is estimated. */
        fun combinedCostEstimated(combinedCostEstimated: Boolean) =
            combinedCostEstimated(JsonField.of(combinedCostEstimated))

        /**
         * Sets [Builder.combinedCostEstimated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.combinedCostEstimated] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun combinedCostEstimated(combinedCostEstimated: JsonField<Boolean>) = apply {
            this.combinedCostEstimated = combinedCostEstimated
        }

        /** Combined cost of spacecraft at new in M USD. */
        fun combinedNewCost(combinedNewCost: Double) =
            combinedNewCost(JsonField.of(combinedNewCost))

        /**
         * Sets [Builder.combinedNewCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.combinedNewCost] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun combinedNewCost(combinedNewCost: JsonField<Double>) = apply {
            this.combinedNewCost = combinedNewCost
        }

        /** Boolean indicating if the launch was commercial. */
        fun commercialLaunch(commercialLaunch: Boolean) =
            commercialLaunch(JsonField.of(commercialLaunch))

        /**
         * Sets [Builder.commercialLaunch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commercialLaunch] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commercialLaunch(commercialLaunch: JsonField<Boolean>) = apply {
            this.commercialLaunch = commercialLaunch
        }

        /** Spacecraft constellation. */
        fun constellation(constellation: String) = constellation(JsonField.of(constellation))

        /**
         * Sets [Builder.constellation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.constellation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun constellation(constellation: JsonField<String>) = apply {
            this.constellation = constellation
        }

        /** Boolean indicating if the spacecraft cost is estimated. */
        fun costEstimated(costEstimated: Boolean) = costEstimated(JsonField.of(costEstimated))

        /**
         * Sets [Builder.costEstimated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costEstimated] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun costEstimated(costEstimated: JsonField<Boolean>) = apply {
            this.costEstimated = costEstimated
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

        /** Cubesat dispenser type. */
        fun cubesatDispenserType(cubesatDispenserType: String) =
            cubesatDispenserType(JsonField.of(cubesatDispenserType))

        /**
         * Sets [Builder.cubesatDispenserType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cubesatDispenserType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cubesatDispenserType(cubesatDispenserType: JsonField<String>) = apply {
            this.cubesatDispenserType = cubesatDispenserType
        }

        /** Current age in years. */
        fun currentAge(currentAge: Double) = currentAge(JsonField.of(currentAge))

        /**
         * Sets [Builder.currentAge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentAge] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentAge(currentAge: JsonField<Double>) = apply { this.currentAge = currentAge }

        /** Spacecraft date of observation. */
        fun dateOfObservation(dateOfObservation: OffsetDateTime) =
            dateOfObservation(JsonField.of(dateOfObservation))

        /**
         * Sets [Builder.dateOfObservation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfObservation] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dateOfObservation(dateOfObservation: JsonField<OffsetDateTime>) = apply {
            this.dateOfObservation = dateOfObservation
        }

        /** Description associated with the spacecraft. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Spacecraft design life in days. */
        fun designLife(designLife: Int) = designLife(JsonField.of(designLife))

        /**
         * Sets [Builder.designLife] to an arbitrary JSON value.
         *
         * You should usually call [Builder.designLife] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun designLife(designLife: JsonField<Int>) = apply { this.designLife = designLife }

        /** Mass dry in kg. */
        fun dryMass(dryMass: Double) = dryMass(JsonField.of(dryMass))

        /**
         * Sets [Builder.dryMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dryMass] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dryMass(dryMass: JsonField<Double>) = apply { this.dryMass = dryMass }

        /** Spacecraft expected life in days. */
        fun expectedLife(expectedLife: Int) = expectedLife(JsonField.of(expectedLife))

        /**
         * Sets [Builder.expectedLife] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedLife] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expectedLife(expectedLife: JsonField<Int>) = apply { this.expectedLife = expectedLife }

        /**
         * WGS84 longitude of the spacecraft’s latest GEO position, in degrees. -180 to 180 degrees
         * (negative values west of Prime Meridian).
         */
        fun geoPosition(geoPosition: Double) = geoPosition(JsonField.of(geoPosition))

        /**
         * Sets [Builder.geoPosition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoPosition] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun geoPosition(geoPosition: JsonField<Double>) = apply { this.geoPosition = geoPosition }

        /** UUID of the parent Onorbit record, if available. */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /** Seradata provided inclination in degrees. */
        fun inclination(inclination: Double) = inclination(JsonField.of(inclination))

        /**
         * Sets [Builder.inclination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inclination] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inclination(inclination: JsonField<Double>) = apply { this.inclination = inclination }

        /** Spacecraft total insurance losses as a fraction. */
        fun insuranceLossesTotal(insuranceLossesTotal: Double) =
            insuranceLossesTotal(JsonField.of(insuranceLossesTotal))

        /**
         * Sets [Builder.insuranceLossesTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insuranceLossesTotal] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun insuranceLossesTotal(insuranceLossesTotal: JsonField<Double>) = apply {
            this.insuranceLossesTotal = insuranceLossesTotal
        }

        /** Insurance notes for the spacecraft. */
        fun insuranceNotes(insuranceNotes: String) = insuranceNotes(JsonField.of(insuranceNotes))

        /**
         * Sets [Builder.insuranceNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insuranceNotes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun insuranceNotes(insuranceNotes: JsonField<String>) = apply {
            this.insuranceNotes = insuranceNotes
        }

        /** Insurance premium at launch in M USD. */
        fun insurancePremiumAtLaunch(insurancePremiumAtLaunch: Double) =
            insurancePremiumAtLaunch(JsonField.of(insurancePremiumAtLaunch))

        /**
         * Sets [Builder.insurancePremiumAtLaunch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insurancePremiumAtLaunch] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun insurancePremiumAtLaunch(insurancePremiumAtLaunch: JsonField<Double>) = apply {
            this.insurancePremiumAtLaunch = insurancePremiumAtLaunch
        }

        /** Boolean indicating if the spacecraft insurancePremiumAtLaunch is estimated. */
        fun insurancePremiumAtLaunchEstimated(insurancePremiumAtLaunchEstimated: Boolean) =
            insurancePremiumAtLaunchEstimated(JsonField.of(insurancePremiumAtLaunchEstimated))

        /**
         * Sets [Builder.insurancePremiumAtLaunchEstimated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insurancePremiumAtLaunchEstimated] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun insurancePremiumAtLaunchEstimated(
            insurancePremiumAtLaunchEstimated: JsonField<Boolean>
        ) = apply { this.insurancePremiumAtLaunchEstimated = insurancePremiumAtLaunchEstimated }

        /** Boolean indicating if the spacecraft was insured at launch. */
        fun insuredAtLaunch(insuredAtLaunch: Boolean) =
            insuredAtLaunch(JsonField.of(insuredAtLaunch))

        /**
         * Sets [Builder.insuredAtLaunch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insuredAtLaunch] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun insuredAtLaunch(insuredAtLaunch: JsonField<Boolean>) = apply {
            this.insuredAtLaunch = insuredAtLaunch
        }

        /** Insured value of spacecraft at launch in M USD. */
        fun insuredValueAtLaunch(insuredValueAtLaunch: Double) =
            insuredValueAtLaunch(JsonField.of(insuredValueAtLaunch))

        /**
         * Sets [Builder.insuredValueAtLaunch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insuredValueAtLaunch] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun insuredValueAtLaunch(insuredValueAtLaunch: JsonField<Double>) = apply {
            this.insuredValueAtLaunch = insuredValueAtLaunch
        }

        /** Boolean indicating if the spacecraft insured value at launch is estimated. */
        fun insuredValueLaunchEstimated(insuredValueLaunchEstimated: Boolean) =
            insuredValueLaunchEstimated(JsonField.of(insuredValueLaunchEstimated))

        /**
         * Sets [Builder.insuredValueLaunchEstimated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insuredValueLaunchEstimated] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun insuredValueLaunchEstimated(insuredValueLaunchEstimated: JsonField<Boolean>) = apply {
            this.insuredValueLaunchEstimated = insuredValueLaunchEstimated
        }

        /** Seradata international number. */
        fun intlNumber(intlNumber: String) = intlNumber(JsonField.of(intlNumber))

        /**
         * Sets [Builder.intlNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intlNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun intlNumber(intlNumber: JsonField<String>) = apply { this.intlNumber = intlNumber }

        /** Spacecraft latest latitude in degrees. */
        fun lat(lat: Double) = lat(JsonField.of(lat))

        /**
         * Sets [Builder.lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

        /** Spacecraft launch arranger. */
        fun launchArranger(launchArranger: String) = launchArranger(JsonField.of(launchArranger))

        /**
         * Sets [Builder.launchArranger] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchArranger] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchArranger(launchArranger: JsonField<String>) = apply {
            this.launchArranger = launchArranger
        }

        /** Spacecraft launch arranger country. */
        fun launchArrangerCountry(launchArrangerCountry: String) =
            launchArrangerCountry(JsonField.of(launchArrangerCountry))

        /**
         * Sets [Builder.launchArrangerCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchArrangerCountry] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchArrangerCountry(launchArrangerCountry: JsonField<String>) = apply {
            this.launchArrangerCountry = launchArrangerCountry
        }

        /** Seradata launch characteristic (e.g. Expendable, Reusable (New), etc). */
        fun launchCharacteristic(launchCharacteristic: String) =
            launchCharacteristic(JsonField.of(launchCharacteristic))

        /**
         * Sets [Builder.launchCharacteristic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchCharacteristic] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchCharacteristic(launchCharacteristic: JsonField<String>) = apply {
            this.launchCharacteristic = launchCharacteristic
        }

        /** Cost of launch in M USD. */
        fun launchCost(launchCost: Double) = launchCost(JsonField.of(launchCost))

        /**
         * Sets [Builder.launchCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchCost(launchCost: JsonField<Double>) = apply { this.launchCost = launchCost }

        /** Boolean indicating if the spacecraft launch cost is estimated. */
        fun launchCostEstimated(launchCostEstimated: Boolean) =
            launchCostEstimated(JsonField.of(launchCostEstimated))

        /**
         * Sets [Builder.launchCostEstimated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchCostEstimated] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchCostEstimated(launchCostEstimated: JsonField<Boolean>) = apply {
            this.launchCostEstimated = launchCostEstimated
        }

        /** Seradata launch country. */
        fun launchCountry(launchCountry: String) = launchCountry(JsonField.of(launchCountry))

        /**
         * Sets [Builder.launchCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchCountry] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchCountry(launchCountry: JsonField<String>) = apply {
            this.launchCountry = launchCountry
        }

        /** Launch date. */
        fun launchDate(launchDate: OffsetDateTime) = launchDate(JsonField.of(launchDate))

        /**
         * Sets [Builder.launchDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchDate(launchDate: JsonField<OffsetDateTime>) = apply {
            this.launchDate = launchDate
        }

        /** Seradata remarks on launch date. */
        fun launchDateRemarks(launchDateRemarks: String) =
            launchDateRemarks(JsonField.of(launchDateRemarks))

        /**
         * Sets [Builder.launchDateRemarks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchDateRemarks] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchDateRemarks(launchDateRemarks: JsonField<String>) = apply {
            this.launchDateRemarks = launchDateRemarks
        }

        /** Seradata launch ID. */
        fun launchId(launchId: String) = launchId(JsonField.of(launchId))

        /**
         * Sets [Builder.launchId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun launchId(launchId: JsonField<String>) = apply { this.launchId = launchId }

        /** Mass at launch in kg. */
        fun launchMass(launchMass: Double) = launchMass(JsonField.of(launchMass))

        /**
         * Sets [Builder.launchMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchMass(launchMass: JsonField<Double>) = apply { this.launchMass = launchMass }

        /** Insurance notes for the spacecraft. */
        fun launchNotes(launchNotes: String) = launchNotes(JsonField.of(launchNotes))

        /**
         * Sets [Builder.launchNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchNotes(launchNotes: JsonField<String>) = apply { this.launchNotes = launchNotes }

        /** Seradata launch number. */
        fun launchNumber(launchNumber: String) = launchNumber(JsonField.of(launchNumber))

        /**
         * Sets [Builder.launchNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchNumber(launchNumber: JsonField<String>) = apply {
            this.launchNumber = launchNumber
        }

        /** Seradata launch provider. */
        fun launchProvider(launchProvider: String) = launchProvider(JsonField.of(launchProvider))

        /**
         * Sets [Builder.launchProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchProvider] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchProvider(launchProvider: JsonField<String>) = apply {
            this.launchProvider = launchProvider
        }

        /** Seradata launch provider country. */
        fun launchProviderCountry(launchProviderCountry: String) =
            launchProviderCountry(JsonField.of(launchProviderCountry))

        /**
         * Sets [Builder.launchProviderCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchProviderCountry] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchProviderCountry(launchProviderCountry: JsonField<String>) = apply {
            this.launchProviderCountry = launchProviderCountry
        }

        /** Seradata launch vehicle family. */
        fun launchProviderFlightNumber(launchProviderFlightNumber: String) =
            launchProviderFlightNumber(JsonField.of(launchProviderFlightNumber))

        /**
         * Sets [Builder.launchProviderFlightNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchProviderFlightNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun launchProviderFlightNumber(launchProviderFlightNumber: JsonField<String>) = apply {
            this.launchProviderFlightNumber = launchProviderFlightNumber
        }

        /** Seradata Launch Site ID. */
        fun launchSiteId(launchSiteId: String) = launchSiteId(JsonField.of(launchSiteId))

        /**
         * Sets [Builder.launchSiteId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchSiteId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchSiteId(launchSiteId: JsonField<String>) = apply {
            this.launchSiteId = launchSiteId
        }

        /** Launch Site Name. */
        fun launchSiteName(launchSiteName: String) = launchSiteName(JsonField.of(launchSiteName))

        /**
         * Sets [Builder.launchSiteName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchSiteName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchSiteName(launchSiteName: JsonField<String>) = apply {
            this.launchSiteName = launchSiteName
        }

        /** Seradata launch type (e.g. Launched, Future, etc). */
        fun launchType(launchType: String) = launchType(JsonField.of(launchType))

        /**
         * Sets [Builder.launchType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchType(launchType: JsonField<String>) = apply { this.launchType = launchType }

        /** Seradata launch ID. */
        fun launchVehicleId(launchVehicleId: String) =
            launchVehicleId(JsonField.of(launchVehicleId))

        /**
         * Sets [Builder.launchVehicleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchVehicleId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchVehicleId(launchVehicleId: JsonField<String>) = apply {
            this.launchVehicleId = launchVehicleId
        }

        /** Boolean indicating if the spacecraft was leased. */
        fun leased(leased: Boolean) = leased(JsonField.of(leased))

        /**
         * Sets [Builder.leased] to an arbitrary JSON value.
         *
         * You should usually call [Builder.leased] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun leased(leased: JsonField<Boolean>) = apply { this.leased = leased }

        /** Spacecraft life lost as a percent fraction. */
        fun lifeLost(lifeLost: Double) = lifeLost(JsonField.of(lifeLost))

        /**
         * Sets [Builder.lifeLost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lifeLost] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lifeLost(lifeLost: JsonField<Double>) = apply { this.lifeLost = lifeLost }

        /** Spacecraft latest longitude in degrees. */
        fun lon(lon: Double) = lon(JsonField.of(lon))

        /**
         * Sets [Builder.lon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

        /**
         * Mass category (e.g. 2500 - 3500kg - Large Satellite, 10 - 100 kg - Microsatellite, etc).
         */
        fun massCategory(massCategory: String) = massCategory(JsonField.of(massCategory))

        /**
         * Sets [Builder.massCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.massCategory] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun massCategory(massCategory: JsonField<String>) = apply {
            this.massCategory = massCategory
        }

        /** Spacecraft name at launch. */
        fun nameAtLaunch(nameAtLaunch: String) = nameAtLaunch(JsonField.of(nameAtLaunch))

        /**
         * Sets [Builder.nameAtLaunch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nameAtLaunch] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nameAtLaunch(nameAtLaunch: JsonField<String>) = apply {
            this.nameAtLaunch = nameAtLaunch
        }

        /** Cost of spacecraft at new in M USD. */
        fun newCost(newCost: Double) = newCost(JsonField.of(newCost))

        /**
         * Sets [Builder.newCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newCost] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun newCost(newCost: JsonField<Double>) = apply { this.newCost = newCost }

        /** Notes on the spacecraft. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

        /** Number of humans carried on spacecraft. */
        fun numHumans(numHumans: Int) = numHumans(JsonField.of(numHumans))

        /**
         * Sets [Builder.numHumans] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numHumans] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numHumans(numHumans: JsonField<Int>) = apply { this.numHumans = numHumans }

        /** Spacecraft operator name. */
        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

        /** Spacecraft operator country. */
        fun operatorCountry(operatorCountry: String) =
            operatorCountry(JsonField.of(operatorCountry))

        /**
         * Sets [Builder.operatorCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatorCountry] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operatorCountry(operatorCountry: JsonField<String>) = apply {
            this.operatorCountry = operatorCountry
        }

        /** Spacecraft orbit category (e.g GEO, LEO, etc). */
        fun orbitCategory(orbitCategory: String) = orbitCategory(JsonField.of(orbitCategory))

        /**
         * Sets [Builder.orbitCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orbitCategory] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun orbitCategory(orbitCategory: JsonField<String>) = apply {
            this.orbitCategory = orbitCategory
        }

        /** Spacecraft sub orbit category (e.g LEO - Sun-synchronous, Geostationary, etc). */
        fun orbitSubCategory(orbitSubCategory: String) =
            orbitSubCategory(JsonField.of(orbitSubCategory))

        /**
         * Sets [Builder.orbitSubCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orbitSubCategory] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun orbitSubCategory(orbitSubCategory: JsonField<String>) = apply {
            this.orbitSubCategory = orbitSubCategory
        }

        /** Spacecraft order date. */
        fun orderDate(orderDate: OffsetDateTime) = orderDate(JsonField.of(orderDate))

        /**
         * Sets [Builder.orderDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun orderDate(orderDate: JsonField<OffsetDateTime>) = apply { this.orderDate = orderDate }

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

        /** Spacecraft owner name. */
        fun owner(owner: String) = owner(JsonField.of(owner))

        /**
         * Sets [Builder.owner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.owner] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun owner(owner: JsonField<String>) = apply { this.owner = owner }

        /** Spacecraft owner country. */
        fun ownerCountry(ownerCountry: String) = ownerCountry(JsonField.of(ownerCountry))

        /**
         * Sets [Builder.ownerCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownerCountry] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ownerCountry(ownerCountry: JsonField<String>) = apply {
            this.ownerCountry = ownerCountry
        }

        /** Perigee in km. */
        fun perigee(perigee: Double) = perigee(JsonField.of(perigee))

        /**
         * Sets [Builder.perigee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perigee] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun perigee(perigee: JsonField<Double>) = apply { this.perigee = perigee }

        /** Spacecraft period in minutes. */
        fun period(period: Double) = period(JsonField.of(period))

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun period(period: JsonField<Double>) = apply { this.period = period }

        /** Spacecraft primary mission and group. */
        fun primaryMissionGroup(primaryMissionGroup: String) =
            primaryMissionGroup(JsonField.of(primaryMissionGroup))

        /**
         * Sets [Builder.primaryMissionGroup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryMissionGroup] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryMissionGroup(primaryMissionGroup: JsonField<String>) = apply {
            this.primaryMissionGroup = primaryMissionGroup
        }

        /** UUID of the prime manufacturer organization, if available. */
        fun primeManufacturerOrgId(primeManufacturerOrgId: String) =
            primeManufacturerOrgId(JsonField.of(primeManufacturerOrgId))

        /**
         * Sets [Builder.primeManufacturerOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primeManufacturerOrgId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primeManufacturerOrgId(primeManufacturerOrgId: JsonField<String>) = apply {
            this.primeManufacturerOrgId = primeManufacturerOrgId
        }

        /** Spacecraft program name. */
        fun programName(programName: String) = programName(JsonField.of(programName))

        /**
         * Sets [Builder.programName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.programName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun programName(programName: JsonField<String>) = apply { this.programName = programName }

        /** Spacecraft quantity. */
        fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

        /** Spacecraft reusable flights. */
        fun reusableFlights(reusableFlights: String) =
            reusableFlights(JsonField.of(reusableFlights))

        /**
         * Sets [Builder.reusableFlights] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reusableFlights] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reusableFlights(reusableFlights: JsonField<String>) = apply {
            this.reusableFlights = reusableFlights
        }

        /** Spacecraft reused hull name. */
        fun reusedHullName(reusedHullName: String) = reusedHullName(JsonField.of(reusedHullName))

        /**
         * Sets [Builder.reusedHullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reusedHullName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reusedHullName(reusedHullName: JsonField<String>) = apply {
            this.reusedHullName = reusedHullName
        }

        /** Seradata sector (e.g. Commercial, Military, Civil/Other). */
        fun sector(sector: String) = sector(JsonField.of(sector))

        /**
         * Sets [Builder.sector] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sector] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sector(sector: JsonField<String>) = apply { this.sector = sector }

        /** Spacecraft serial number. */
        fun serialNumber(serialNumber: String) = serialNumber(JsonField.of(serialNumber))

        /**
         * Sets [Builder.serialNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serialNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serialNumber(serialNumber: JsonField<String>) = apply {
            this.serialNumber = serialNumber
        }

        /** Spacecraft stabilizer (e.g. 3-Axis, Gravity Gradiant, etc). */
        fun stabilizer(stabilizer: String) = stabilizer(JsonField.of(stabilizer))

        /**
         * Sets [Builder.stabilizer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stabilizer] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stabilizer(stabilizer: JsonField<String>) = apply { this.stabilizer = stabilizer }

        /** Spacecraft status (e.g. Inactive - Retired, Inactive - Re-entered, Active, etc). */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** Number of insurance claims for this spacecraft. */
        fun totalClaims(totalClaims: Int) = totalClaims(JsonField.of(totalClaims))

        /**
         * Sets [Builder.totalClaims] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalClaims] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalClaims(totalClaims: JsonField<Int>) = apply { this.totalClaims = totalClaims }

        /** Number of fatalities related to this spacecraft. */
        fun totalFatalities(totalFatalities: Int) = totalFatalities(JsonField.of(totalFatalities))

        /**
         * Sets [Builder.totalFatalities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalFatalities] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalFatalities(totalFatalities: JsonField<Int>) = apply {
            this.totalFatalities = totalFatalities
        }

        /** Number of injuries related to this spacecraft. */
        fun totalInjuries(totalInjuries: Int) = totalInjuries(JsonField.of(totalInjuries))

        /**
         * Sets [Builder.totalInjuries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalInjuries] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalInjuries(totalInjuries: JsonField<Int>) = apply {
            this.totalInjuries = totalInjuries
        }

        /** Mass dry in kg. */
        fun totalPayloadPower(totalPayloadPower: Double) =
            totalPayloadPower(JsonField.of(totalPayloadPower))

        /**
         * Sets [Builder.totalPayloadPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPayloadPower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalPayloadPower(totalPayloadPower: JsonField<Double>) = apply {
            this.totalPayloadPower = totalPayloadPower
        }

        /** Youtube link of launch. */
        fun youtubeLaunchLink(youtubeLaunchLink: String) =
            youtubeLaunchLink(JsonField.of(youtubeLaunchLink))

        /**
         * Sets [Builder.youtubeLaunchLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.youtubeLaunchLink] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun youtubeLaunchLink(youtubeLaunchLink: JsonField<String>) = apply {
            this.youtubeLaunchLink = youtubeLaunchLink
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
         * Returns an immutable instance of [SeradataSpacecraftDetailListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SeradataSpacecraftDetailListResponse =
            SeradataSpacecraftDetailListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("name", name),
                checkRequired("source", source),
                id,
                additionalMissionsGroups,
                altitude,
                annualInsuredDepreciationFactor,
                annualInsuredDepreciationFactorEstimated,
                apogee,
                busId,
                capabilityLost,
                capacityLost,
                catalogNumber,
                collisionRiskCm,
                collisionRiskMm,
                combinedCostEstimated,
                combinedNewCost,
                commercialLaunch,
                constellation,
                costEstimated,
                createdAt,
                createdBy,
                cubesatDispenserType,
                currentAge,
                dateOfObservation,
                description,
                designLife,
                dryMass,
                expectedLife,
                geoPosition,
                idOnOrbit,
                inclination,
                insuranceLossesTotal,
                insuranceNotes,
                insurancePremiumAtLaunch,
                insurancePremiumAtLaunchEstimated,
                insuredAtLaunch,
                insuredValueAtLaunch,
                insuredValueLaunchEstimated,
                intlNumber,
                lat,
                launchArranger,
                launchArrangerCountry,
                launchCharacteristic,
                launchCost,
                launchCostEstimated,
                launchCountry,
                launchDate,
                launchDateRemarks,
                launchId,
                launchMass,
                launchNotes,
                launchNumber,
                launchProvider,
                launchProviderCountry,
                launchProviderFlightNumber,
                launchSiteId,
                launchSiteName,
                launchType,
                launchVehicleId,
                leased,
                lifeLost,
                lon,
                massCategory,
                nameAtLaunch,
                newCost,
                notes,
                numHumans,
                operator,
                operatorCountry,
                orbitCategory,
                orbitSubCategory,
                orderDate,
                origin,
                origNetwork,
                owner,
                ownerCountry,
                perigee,
                period,
                primaryMissionGroup,
                primeManufacturerOrgId,
                programName,
                quantity,
                reusableFlights,
                reusedHullName,
                sector,
                serialNumber,
                stabilizer,
                status,
                totalClaims,
                totalFatalities,
                totalInjuries,
                totalPayloadPower,
                youtubeLaunchLink,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SeradataSpacecraftDetailListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        name()
        source()
        id()
        additionalMissionsGroups()
        altitude()
        annualInsuredDepreciationFactor()
        annualInsuredDepreciationFactorEstimated()
        apogee()
        busId()
        capabilityLost()
        capacityLost()
        catalogNumber()
        collisionRiskCm()
        collisionRiskMm()
        combinedCostEstimated()
        combinedNewCost()
        commercialLaunch()
        constellation()
        costEstimated()
        createdAt()
        createdBy()
        cubesatDispenserType()
        currentAge()
        dateOfObservation()
        description()
        designLife()
        dryMass()
        expectedLife()
        geoPosition()
        idOnOrbit()
        inclination()
        insuranceLossesTotal()
        insuranceNotes()
        insurancePremiumAtLaunch()
        insurancePremiumAtLaunchEstimated()
        insuredAtLaunch()
        insuredValueAtLaunch()
        insuredValueLaunchEstimated()
        intlNumber()
        lat()
        launchArranger()
        launchArrangerCountry()
        launchCharacteristic()
        launchCost()
        launchCostEstimated()
        launchCountry()
        launchDate()
        launchDateRemarks()
        launchId()
        launchMass()
        launchNotes()
        launchNumber()
        launchProvider()
        launchProviderCountry()
        launchProviderFlightNumber()
        launchSiteId()
        launchSiteName()
        launchType()
        launchVehicleId()
        leased()
        lifeLost()
        lon()
        massCategory()
        nameAtLaunch()
        newCost()
        notes()
        numHumans()
        operator()
        operatorCountry()
        orbitCategory()
        orbitSubCategory()
        orderDate()
        origin()
        origNetwork()
        owner()
        ownerCountry()
        perigee()
        period()
        primaryMissionGroup()
        primeManufacturerOrgId()
        programName()
        quantity()
        reusableFlights()
        reusedHullName()
        sector()
        serialNumber()
        stabilizer()
        status()
        totalClaims()
        totalFatalities()
        totalInjuries()
        totalPayloadPower()
        youtubeLaunchLink()
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (additionalMissionsGroups.asKnown().isPresent) 1 else 0) +
            (if (altitude.asKnown().isPresent) 1 else 0) +
            (if (annualInsuredDepreciationFactor.asKnown().isPresent) 1 else 0) +
            (if (annualInsuredDepreciationFactorEstimated.asKnown().isPresent) 1 else 0) +
            (if (apogee.asKnown().isPresent) 1 else 0) +
            (if (busId.asKnown().isPresent) 1 else 0) +
            (if (capabilityLost.asKnown().isPresent) 1 else 0) +
            (if (capacityLost.asKnown().isPresent) 1 else 0) +
            (if (catalogNumber.asKnown().isPresent) 1 else 0) +
            (if (collisionRiskCm.asKnown().isPresent) 1 else 0) +
            (if (collisionRiskMm.asKnown().isPresent) 1 else 0) +
            (if (combinedCostEstimated.asKnown().isPresent) 1 else 0) +
            (if (combinedNewCost.asKnown().isPresent) 1 else 0) +
            (if (commercialLaunch.asKnown().isPresent) 1 else 0) +
            (if (constellation.asKnown().isPresent) 1 else 0) +
            (if (costEstimated.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (cubesatDispenserType.asKnown().isPresent) 1 else 0) +
            (if (currentAge.asKnown().isPresent) 1 else 0) +
            (if (dateOfObservation.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (designLife.asKnown().isPresent) 1 else 0) +
            (if (dryMass.asKnown().isPresent) 1 else 0) +
            (if (expectedLife.asKnown().isPresent) 1 else 0) +
            (if (geoPosition.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (inclination.asKnown().isPresent) 1 else 0) +
            (if (insuranceLossesTotal.asKnown().isPresent) 1 else 0) +
            (if (insuranceNotes.asKnown().isPresent) 1 else 0) +
            (if (insurancePremiumAtLaunch.asKnown().isPresent) 1 else 0) +
            (if (insurancePremiumAtLaunchEstimated.asKnown().isPresent) 1 else 0) +
            (if (insuredAtLaunch.asKnown().isPresent) 1 else 0) +
            (if (insuredValueAtLaunch.asKnown().isPresent) 1 else 0) +
            (if (insuredValueLaunchEstimated.asKnown().isPresent) 1 else 0) +
            (if (intlNumber.asKnown().isPresent) 1 else 0) +
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (launchArranger.asKnown().isPresent) 1 else 0) +
            (if (launchArrangerCountry.asKnown().isPresent) 1 else 0) +
            (if (launchCharacteristic.asKnown().isPresent) 1 else 0) +
            (if (launchCost.asKnown().isPresent) 1 else 0) +
            (if (launchCostEstimated.asKnown().isPresent) 1 else 0) +
            (if (launchCountry.asKnown().isPresent) 1 else 0) +
            (if (launchDate.asKnown().isPresent) 1 else 0) +
            (if (launchDateRemarks.asKnown().isPresent) 1 else 0) +
            (if (launchId.asKnown().isPresent) 1 else 0) +
            (if (launchMass.asKnown().isPresent) 1 else 0) +
            (if (launchNotes.asKnown().isPresent) 1 else 0) +
            (if (launchNumber.asKnown().isPresent) 1 else 0) +
            (if (launchProvider.asKnown().isPresent) 1 else 0) +
            (if (launchProviderCountry.asKnown().isPresent) 1 else 0) +
            (if (launchProviderFlightNumber.asKnown().isPresent) 1 else 0) +
            (if (launchSiteId.asKnown().isPresent) 1 else 0) +
            (if (launchSiteName.asKnown().isPresent) 1 else 0) +
            (if (launchType.asKnown().isPresent) 1 else 0) +
            (if (launchVehicleId.asKnown().isPresent) 1 else 0) +
            (if (leased.asKnown().isPresent) 1 else 0) +
            (if (lifeLost.asKnown().isPresent) 1 else 0) +
            (if (lon.asKnown().isPresent) 1 else 0) +
            (if (massCategory.asKnown().isPresent) 1 else 0) +
            (if (nameAtLaunch.asKnown().isPresent) 1 else 0) +
            (if (newCost.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (numHumans.asKnown().isPresent) 1 else 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (if (operatorCountry.asKnown().isPresent) 1 else 0) +
            (if (orbitCategory.asKnown().isPresent) 1 else 0) +
            (if (orbitSubCategory.asKnown().isPresent) 1 else 0) +
            (if (orderDate.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (owner.asKnown().isPresent) 1 else 0) +
            (if (ownerCountry.asKnown().isPresent) 1 else 0) +
            (if (perigee.asKnown().isPresent) 1 else 0) +
            (if (period.asKnown().isPresent) 1 else 0) +
            (if (primaryMissionGroup.asKnown().isPresent) 1 else 0) +
            (if (primeManufacturerOrgId.asKnown().isPresent) 1 else 0) +
            (if (programName.asKnown().isPresent) 1 else 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (if (reusableFlights.asKnown().isPresent) 1 else 0) +
            (if (reusedHullName.asKnown().isPresent) 1 else 0) +
            (if (sector.asKnown().isPresent) 1 else 0) +
            (if (serialNumber.asKnown().isPresent) 1 else 0) +
            (if (stabilizer.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (totalClaims.asKnown().isPresent) 1 else 0) +
            (if (totalFatalities.asKnown().isPresent) 1 else 0) +
            (if (totalInjuries.asKnown().isPresent) 1 else 0) +
            (if (totalPayloadPower.asKnown().isPresent) 1 else 0) +
            (if (youtubeLaunchLink.asKnown().isPresent) 1 else 0)

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

        return /* spotless:off */ other is SeradataSpacecraftDetailListResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && name == other.name && source == other.source && id == other.id && additionalMissionsGroups == other.additionalMissionsGroups && altitude == other.altitude && annualInsuredDepreciationFactor == other.annualInsuredDepreciationFactor && annualInsuredDepreciationFactorEstimated == other.annualInsuredDepreciationFactorEstimated && apogee == other.apogee && busId == other.busId && capabilityLost == other.capabilityLost && capacityLost == other.capacityLost && catalogNumber == other.catalogNumber && collisionRiskCm == other.collisionRiskCm && collisionRiskMm == other.collisionRiskMm && combinedCostEstimated == other.combinedCostEstimated && combinedNewCost == other.combinedNewCost && commercialLaunch == other.commercialLaunch && constellation == other.constellation && costEstimated == other.costEstimated && createdAt == other.createdAt && createdBy == other.createdBy && cubesatDispenserType == other.cubesatDispenserType && currentAge == other.currentAge && dateOfObservation == other.dateOfObservation && description == other.description && designLife == other.designLife && dryMass == other.dryMass && expectedLife == other.expectedLife && geoPosition == other.geoPosition && idOnOrbit == other.idOnOrbit && inclination == other.inclination && insuranceLossesTotal == other.insuranceLossesTotal && insuranceNotes == other.insuranceNotes && insurancePremiumAtLaunch == other.insurancePremiumAtLaunch && insurancePremiumAtLaunchEstimated == other.insurancePremiumAtLaunchEstimated && insuredAtLaunch == other.insuredAtLaunch && insuredValueAtLaunch == other.insuredValueAtLaunch && insuredValueLaunchEstimated == other.insuredValueLaunchEstimated && intlNumber == other.intlNumber && lat == other.lat && launchArranger == other.launchArranger && launchArrangerCountry == other.launchArrangerCountry && launchCharacteristic == other.launchCharacteristic && launchCost == other.launchCost && launchCostEstimated == other.launchCostEstimated && launchCountry == other.launchCountry && launchDate == other.launchDate && launchDateRemarks == other.launchDateRemarks && launchId == other.launchId && launchMass == other.launchMass && launchNotes == other.launchNotes && launchNumber == other.launchNumber && launchProvider == other.launchProvider && launchProviderCountry == other.launchProviderCountry && launchProviderFlightNumber == other.launchProviderFlightNumber && launchSiteId == other.launchSiteId && launchSiteName == other.launchSiteName && launchType == other.launchType && launchVehicleId == other.launchVehicleId && leased == other.leased && lifeLost == other.lifeLost && lon == other.lon && massCategory == other.massCategory && nameAtLaunch == other.nameAtLaunch && newCost == other.newCost && notes == other.notes && numHumans == other.numHumans && operator == other.operator && operatorCountry == other.operatorCountry && orbitCategory == other.orbitCategory && orbitSubCategory == other.orbitSubCategory && orderDate == other.orderDate && origin == other.origin && origNetwork == other.origNetwork && owner == other.owner && ownerCountry == other.ownerCountry && perigee == other.perigee && period == other.period && primaryMissionGroup == other.primaryMissionGroup && primeManufacturerOrgId == other.primeManufacturerOrgId && programName == other.programName && quantity == other.quantity && reusableFlights == other.reusableFlights && reusedHullName == other.reusedHullName && sector == other.sector && serialNumber == other.serialNumber && stabilizer == other.stabilizer && status == other.status && totalClaims == other.totalClaims && totalFatalities == other.totalFatalities && totalInjuries == other.totalInjuries && totalPayloadPower == other.totalPayloadPower && youtubeLaunchLink == other.youtubeLaunchLink && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, name, source, id, additionalMissionsGroups, altitude, annualInsuredDepreciationFactor, annualInsuredDepreciationFactorEstimated, apogee, busId, capabilityLost, capacityLost, catalogNumber, collisionRiskCm, collisionRiskMm, combinedCostEstimated, combinedNewCost, commercialLaunch, constellation, costEstimated, createdAt, createdBy, cubesatDispenserType, currentAge, dateOfObservation, description, designLife, dryMass, expectedLife, geoPosition, idOnOrbit, inclination, insuranceLossesTotal, insuranceNotes, insurancePremiumAtLaunch, insurancePremiumAtLaunchEstimated, insuredAtLaunch, insuredValueAtLaunch, insuredValueLaunchEstimated, intlNumber, lat, launchArranger, launchArrangerCountry, launchCharacteristic, launchCost, launchCostEstimated, launchCountry, launchDate, launchDateRemarks, launchId, launchMass, launchNotes, launchNumber, launchProvider, launchProviderCountry, launchProviderFlightNumber, launchSiteId, launchSiteName, launchType, launchVehicleId, leased, lifeLost, lon, massCategory, nameAtLaunch, newCost, notes, numHumans, operator, operatorCountry, orbitCategory, orbitSubCategory, orderDate, origin, origNetwork, owner, ownerCountry, perigee, period, primaryMissionGroup, primeManufacturerOrgId, programName, quantity, reusableFlights, reusedHullName, sector, serialNumber, stabilizer, status, totalClaims, totalFatalities, totalInjuries, totalPayloadPower, youtubeLaunchLink, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SeradataSpacecraftDetailListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, name=$name, source=$source, id=$id, additionalMissionsGroups=$additionalMissionsGroups, altitude=$altitude, annualInsuredDepreciationFactor=$annualInsuredDepreciationFactor, annualInsuredDepreciationFactorEstimated=$annualInsuredDepreciationFactorEstimated, apogee=$apogee, busId=$busId, capabilityLost=$capabilityLost, capacityLost=$capacityLost, catalogNumber=$catalogNumber, collisionRiskCm=$collisionRiskCm, collisionRiskMm=$collisionRiskMm, combinedCostEstimated=$combinedCostEstimated, combinedNewCost=$combinedNewCost, commercialLaunch=$commercialLaunch, constellation=$constellation, costEstimated=$costEstimated, createdAt=$createdAt, createdBy=$createdBy, cubesatDispenserType=$cubesatDispenserType, currentAge=$currentAge, dateOfObservation=$dateOfObservation, description=$description, designLife=$designLife, dryMass=$dryMass, expectedLife=$expectedLife, geoPosition=$geoPosition, idOnOrbit=$idOnOrbit, inclination=$inclination, insuranceLossesTotal=$insuranceLossesTotal, insuranceNotes=$insuranceNotes, insurancePremiumAtLaunch=$insurancePremiumAtLaunch, insurancePremiumAtLaunchEstimated=$insurancePremiumAtLaunchEstimated, insuredAtLaunch=$insuredAtLaunch, insuredValueAtLaunch=$insuredValueAtLaunch, insuredValueLaunchEstimated=$insuredValueLaunchEstimated, intlNumber=$intlNumber, lat=$lat, launchArranger=$launchArranger, launchArrangerCountry=$launchArrangerCountry, launchCharacteristic=$launchCharacteristic, launchCost=$launchCost, launchCostEstimated=$launchCostEstimated, launchCountry=$launchCountry, launchDate=$launchDate, launchDateRemarks=$launchDateRemarks, launchId=$launchId, launchMass=$launchMass, launchNotes=$launchNotes, launchNumber=$launchNumber, launchProvider=$launchProvider, launchProviderCountry=$launchProviderCountry, launchProviderFlightNumber=$launchProviderFlightNumber, launchSiteId=$launchSiteId, launchSiteName=$launchSiteName, launchType=$launchType, launchVehicleId=$launchVehicleId, leased=$leased, lifeLost=$lifeLost, lon=$lon, massCategory=$massCategory, nameAtLaunch=$nameAtLaunch, newCost=$newCost, notes=$notes, numHumans=$numHumans, operator=$operator, operatorCountry=$operatorCountry, orbitCategory=$orbitCategory, orbitSubCategory=$orbitSubCategory, orderDate=$orderDate, origin=$origin, origNetwork=$origNetwork, owner=$owner, ownerCountry=$ownerCountry, perigee=$perigee, period=$period, primaryMissionGroup=$primaryMissionGroup, primeManufacturerOrgId=$primeManufacturerOrgId, programName=$programName, quantity=$quantity, reusableFlights=$reusableFlights, reusedHullName=$reusedHullName, sector=$sector, serialNumber=$serialNumber, stabilizer=$stabilizer, status=$status, totalClaims=$totalClaims, totalFatalities=$totalFatalities, totalInjuries=$totalInjuries, totalPayloadPower=$totalPayloadPower, youtubeLaunchLink=$youtubeLaunchLink, additionalProperties=$additionalProperties}"
}

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
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import com.unifieddatalibrary.api.models.EntityFull
import com.unifieddatalibrary.api.models.OnorbitAntennaFull
import com.unifieddatalibrary.api.models.OnorbitBatteryFull
import com.unifieddatalibrary.api.models.OnorbitDetailsFull
import com.unifieddatalibrary.api.models.OnorbitSolarArrayFull
import com.unifieddatalibrary.api.models.OnorbitThrusterFull
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** On-orbit spacecraft details compiled by Seradata for a particular satellite. */
class SeradataSpacecraftDetailTupleResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
    private val onOrbit: JsonField<OnOrbit>,
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
    private val scientific: JsonField<List<Scientific>>,
    private val sector: JsonField<String>,
    private val seradataCommDetails: JsonField<List<SeradataCommDetail>>,
    private val seradataEarlyWarning: JsonField<List<SeradataEarlyWarning>>,
    private val seradataNavigation: JsonField<List<SeradataNavigation>>,
    private val seradataOpticalPayload: JsonField<List<SeradataOpticalPayload>>,
    private val seradataRadarPayload: JsonField<List<SeradataRadarPayload>>,
    private val seradataSigIntPayload: JsonField<List<SeradataSigIntPayload>>,
    private val serialNumber: JsonField<String>,
    private val stabilizer: JsonField<String>,
    private val status: JsonField<String>,
    private val totalClaims: JsonField<Int>,
    private val totalFatalities: JsonField<Int>,
    private val totalInjuries: JsonField<Int>,
    private val totalPayloadPower: JsonField<Double>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
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
        @JsonProperty("onOrbit") @ExcludeMissing onOrbit: JsonField<OnOrbit> = JsonMissing.of(),
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
        @JsonProperty("scientific")
        @ExcludeMissing
        scientific: JsonField<List<Scientific>> = JsonMissing.of(),
        @JsonProperty("sector") @ExcludeMissing sector: JsonField<String> = JsonMissing.of(),
        @JsonProperty("seradataCommDetails")
        @ExcludeMissing
        seradataCommDetails: JsonField<List<SeradataCommDetail>> = JsonMissing.of(),
        @JsonProperty("seradataEarlyWarning")
        @ExcludeMissing
        seradataEarlyWarning: JsonField<List<SeradataEarlyWarning>> = JsonMissing.of(),
        @JsonProperty("seradataNavigation")
        @ExcludeMissing
        seradataNavigation: JsonField<List<SeradataNavigation>> = JsonMissing.of(),
        @JsonProperty("seradataOpticalPayload")
        @ExcludeMissing
        seradataOpticalPayload: JsonField<List<SeradataOpticalPayload>> = JsonMissing.of(),
        @JsonProperty("seradataRadarPayload")
        @ExcludeMissing
        seradataRadarPayload: JsonField<List<SeradataRadarPayload>> = JsonMissing.of(),
        @JsonProperty("seradataSigIntPayload")
        @ExcludeMissing
        seradataSigIntPayload: JsonField<List<SeradataSigIntPayload>> = JsonMissing.of(),
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
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
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
        onOrbit,
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
        scientific,
        sector,
        seradataCommDetails,
        seradataEarlyWarning,
        seradataNavigation,
        seradataOpticalPayload,
        seradataRadarPayload,
        seradataSigIntPayload,
        serialNumber,
        stabilizer,
        status,
        totalClaims,
        totalFatalities,
        totalInjuries,
        totalPayloadPower,
        updatedAt,
        updatedBy,
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
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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
     * Model object representing on-orbit objects or satellites in the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun onOrbit(): Optional<OnOrbit> = onOrbit.getOptional("onOrbit")

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
     * Read-only details of the Scientific object, only used during detail queries (not to be
     * provided on create/update operations).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun scientific(): Optional<List<Scientific>> = scientific.getOptional("scientific")

    /**
     * Seradata sector (e.g. Commercial, Military, Civil/Other).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sector(): Optional<String> = sector.getOptional("sector")

    /**
     * Read-only details of the SeradataCommDetails object, only used during detail queries (not to
     * be provided on create/update operations).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun seradataCommDetails(): Optional<List<SeradataCommDetail>> =
        seradataCommDetails.getOptional("seradataCommDetails")

    /**
     * Read-only details of the SeradataEarlyWarning object, only used during detail queries (not to
     * be provided on create/update operations).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun seradataEarlyWarning(): Optional<List<SeradataEarlyWarning>> =
        seradataEarlyWarning.getOptional("seradataEarlyWarning")

    /**
     * Read-only details of the SeradataNavigation object, only used during detail queries (not to
     * be provided on create/update operations).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun seradataNavigation(): Optional<List<SeradataNavigation>> =
        seradataNavigation.getOptional("seradataNavigation")

    /**
     * Read-only details of the SeradataOpticalPayload object, only used during detail queries (not
     * to be provided on create/update operations).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun seradataOpticalPayload(): Optional<List<SeradataOpticalPayload>> =
        seradataOpticalPayload.getOptional("seradataOpticalPayload")

    /**
     * Read-only details of the SeradataRadarPayload object, only used during detail queries (not to
     * be provided on create/update operations).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun seradataRadarPayload(): Optional<List<SeradataRadarPayload>> =
        seradataRadarPayload.getOptional("seradataRadarPayload")

    /**
     * Read-only details of the SeradataSigIntPayload object, only used during detail queries (not
     * to be provided on create/update operations).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun seradataSigIntPayload(): Optional<List<SeradataSigIntPayload>> =
        seradataSigIntPayload.getOptional("seradataSigIntPayload")

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
     * Returns the raw JSON value of [onOrbit].
     *
     * Unlike [onOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("onOrbit") @ExcludeMissing fun _onOrbit(): JsonField<OnOrbit> = onOrbit

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
     * Returns the raw JSON value of [scientific].
     *
     * Unlike [scientific], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scientific")
    @ExcludeMissing
    fun _scientific(): JsonField<List<Scientific>> = scientific

    /**
     * Returns the raw JSON value of [sector].
     *
     * Unlike [sector], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sector") @ExcludeMissing fun _sector(): JsonField<String> = sector

    /**
     * Returns the raw JSON value of [seradataCommDetails].
     *
     * Unlike [seradataCommDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("seradataCommDetails")
    @ExcludeMissing
    fun _seradataCommDetails(): JsonField<List<SeradataCommDetail>> = seradataCommDetails

    /**
     * Returns the raw JSON value of [seradataEarlyWarning].
     *
     * Unlike [seradataEarlyWarning], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("seradataEarlyWarning")
    @ExcludeMissing
    fun _seradataEarlyWarning(): JsonField<List<SeradataEarlyWarning>> = seradataEarlyWarning

    /**
     * Returns the raw JSON value of [seradataNavigation].
     *
     * Unlike [seradataNavigation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("seradataNavigation")
    @ExcludeMissing
    fun _seradataNavigation(): JsonField<List<SeradataNavigation>> = seradataNavigation

    /**
     * Returns the raw JSON value of [seradataOpticalPayload].
     *
     * Unlike [seradataOpticalPayload], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("seradataOpticalPayload")
    @ExcludeMissing
    fun _seradataOpticalPayload(): JsonField<List<SeradataOpticalPayload>> = seradataOpticalPayload

    /**
     * Returns the raw JSON value of [seradataRadarPayload].
     *
     * Unlike [seradataRadarPayload], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("seradataRadarPayload")
    @ExcludeMissing
    fun _seradataRadarPayload(): JsonField<List<SeradataRadarPayload>> = seradataRadarPayload

    /**
     * Returns the raw JSON value of [seradataSigIntPayload].
     *
     * Unlike [seradataSigIntPayload], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("seradataSigIntPayload")
    @ExcludeMissing
    fun _seradataSigIntPayload(): JsonField<List<SeradataSigIntPayload>> = seradataSigIntPayload

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
         * [SeradataSpacecraftDetailTupleResponse].
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

    /** A builder for [SeradataSpacecraftDetailTupleResponse]. */
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
        private var onOrbit: JsonField<OnOrbit> = JsonMissing.of()
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
        private var scientific: JsonField<MutableList<Scientific>>? = null
        private var sector: JsonField<String> = JsonMissing.of()
        private var seradataCommDetails: JsonField<MutableList<SeradataCommDetail>>? = null
        private var seradataEarlyWarning: JsonField<MutableList<SeradataEarlyWarning>>? = null
        private var seradataNavigation: JsonField<MutableList<SeradataNavigation>>? = null
        private var seradataOpticalPayload: JsonField<MutableList<SeradataOpticalPayload>>? = null
        private var seradataRadarPayload: JsonField<MutableList<SeradataRadarPayload>>? = null
        private var seradataSigIntPayload: JsonField<MutableList<SeradataSigIntPayload>>? = null
        private var serialNumber: JsonField<String> = JsonMissing.of()
        private var stabilizer: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var totalClaims: JsonField<Int> = JsonMissing.of()
        private var totalFatalities: JsonField<Int> = JsonMissing.of()
        private var totalInjuries: JsonField<Int> = JsonMissing.of()
        private var totalPayloadPower: JsonField<Double> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var youtubeLaunchLink: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            seradataSpacecraftDetailTupleResponse: SeradataSpacecraftDetailTupleResponse
        ) = apply {
            classificationMarking = seradataSpacecraftDetailTupleResponse.classificationMarking
            dataMode = seradataSpacecraftDetailTupleResponse.dataMode
            name = seradataSpacecraftDetailTupleResponse.name
            source = seradataSpacecraftDetailTupleResponse.source
            id = seradataSpacecraftDetailTupleResponse.id
            additionalMissionsGroups =
                seradataSpacecraftDetailTupleResponse.additionalMissionsGroups
            altitude = seradataSpacecraftDetailTupleResponse.altitude
            annualInsuredDepreciationFactor =
                seradataSpacecraftDetailTupleResponse.annualInsuredDepreciationFactor
            annualInsuredDepreciationFactorEstimated =
                seradataSpacecraftDetailTupleResponse.annualInsuredDepreciationFactorEstimated
            apogee = seradataSpacecraftDetailTupleResponse.apogee
            busId = seradataSpacecraftDetailTupleResponse.busId
            capabilityLost = seradataSpacecraftDetailTupleResponse.capabilityLost
            capacityLost = seradataSpacecraftDetailTupleResponse.capacityLost
            catalogNumber = seradataSpacecraftDetailTupleResponse.catalogNumber
            collisionRiskCm = seradataSpacecraftDetailTupleResponse.collisionRiskCm
            collisionRiskMm = seradataSpacecraftDetailTupleResponse.collisionRiskMm
            combinedCostEstimated = seradataSpacecraftDetailTupleResponse.combinedCostEstimated
            combinedNewCost = seradataSpacecraftDetailTupleResponse.combinedNewCost
            commercialLaunch = seradataSpacecraftDetailTupleResponse.commercialLaunch
            constellation = seradataSpacecraftDetailTupleResponse.constellation
            costEstimated = seradataSpacecraftDetailTupleResponse.costEstimated
            createdAt = seradataSpacecraftDetailTupleResponse.createdAt
            createdBy = seradataSpacecraftDetailTupleResponse.createdBy
            cubesatDispenserType = seradataSpacecraftDetailTupleResponse.cubesatDispenserType
            currentAge = seradataSpacecraftDetailTupleResponse.currentAge
            dateOfObservation = seradataSpacecraftDetailTupleResponse.dateOfObservation
            description = seradataSpacecraftDetailTupleResponse.description
            designLife = seradataSpacecraftDetailTupleResponse.designLife
            dryMass = seradataSpacecraftDetailTupleResponse.dryMass
            expectedLife = seradataSpacecraftDetailTupleResponse.expectedLife
            geoPosition = seradataSpacecraftDetailTupleResponse.geoPosition
            idOnOrbit = seradataSpacecraftDetailTupleResponse.idOnOrbit
            inclination = seradataSpacecraftDetailTupleResponse.inclination
            insuranceLossesTotal = seradataSpacecraftDetailTupleResponse.insuranceLossesTotal
            insuranceNotes = seradataSpacecraftDetailTupleResponse.insuranceNotes
            insurancePremiumAtLaunch =
                seradataSpacecraftDetailTupleResponse.insurancePremiumAtLaunch
            insurancePremiumAtLaunchEstimated =
                seradataSpacecraftDetailTupleResponse.insurancePremiumAtLaunchEstimated
            insuredAtLaunch = seradataSpacecraftDetailTupleResponse.insuredAtLaunch
            insuredValueAtLaunch = seradataSpacecraftDetailTupleResponse.insuredValueAtLaunch
            insuredValueLaunchEstimated =
                seradataSpacecraftDetailTupleResponse.insuredValueLaunchEstimated
            intlNumber = seradataSpacecraftDetailTupleResponse.intlNumber
            lat = seradataSpacecraftDetailTupleResponse.lat
            launchArranger = seradataSpacecraftDetailTupleResponse.launchArranger
            launchArrangerCountry = seradataSpacecraftDetailTupleResponse.launchArrangerCountry
            launchCharacteristic = seradataSpacecraftDetailTupleResponse.launchCharacteristic
            launchCost = seradataSpacecraftDetailTupleResponse.launchCost
            launchCostEstimated = seradataSpacecraftDetailTupleResponse.launchCostEstimated
            launchCountry = seradataSpacecraftDetailTupleResponse.launchCountry
            launchDate = seradataSpacecraftDetailTupleResponse.launchDate
            launchDateRemarks = seradataSpacecraftDetailTupleResponse.launchDateRemarks
            launchId = seradataSpacecraftDetailTupleResponse.launchId
            launchMass = seradataSpacecraftDetailTupleResponse.launchMass
            launchNotes = seradataSpacecraftDetailTupleResponse.launchNotes
            launchNumber = seradataSpacecraftDetailTupleResponse.launchNumber
            launchProvider = seradataSpacecraftDetailTupleResponse.launchProvider
            launchProviderCountry = seradataSpacecraftDetailTupleResponse.launchProviderCountry
            launchProviderFlightNumber =
                seradataSpacecraftDetailTupleResponse.launchProviderFlightNumber
            launchSiteId = seradataSpacecraftDetailTupleResponse.launchSiteId
            launchSiteName = seradataSpacecraftDetailTupleResponse.launchSiteName
            launchType = seradataSpacecraftDetailTupleResponse.launchType
            launchVehicleId = seradataSpacecraftDetailTupleResponse.launchVehicleId
            leased = seradataSpacecraftDetailTupleResponse.leased
            lifeLost = seradataSpacecraftDetailTupleResponse.lifeLost
            lon = seradataSpacecraftDetailTupleResponse.lon
            massCategory = seradataSpacecraftDetailTupleResponse.massCategory
            nameAtLaunch = seradataSpacecraftDetailTupleResponse.nameAtLaunch
            newCost = seradataSpacecraftDetailTupleResponse.newCost
            notes = seradataSpacecraftDetailTupleResponse.notes
            numHumans = seradataSpacecraftDetailTupleResponse.numHumans
            onOrbit = seradataSpacecraftDetailTupleResponse.onOrbit
            operator = seradataSpacecraftDetailTupleResponse.operator
            operatorCountry = seradataSpacecraftDetailTupleResponse.operatorCountry
            orbitCategory = seradataSpacecraftDetailTupleResponse.orbitCategory
            orbitSubCategory = seradataSpacecraftDetailTupleResponse.orbitSubCategory
            orderDate = seradataSpacecraftDetailTupleResponse.orderDate
            origin = seradataSpacecraftDetailTupleResponse.origin
            origNetwork = seradataSpacecraftDetailTupleResponse.origNetwork
            owner = seradataSpacecraftDetailTupleResponse.owner
            ownerCountry = seradataSpacecraftDetailTupleResponse.ownerCountry
            perigee = seradataSpacecraftDetailTupleResponse.perigee
            period = seradataSpacecraftDetailTupleResponse.period
            primaryMissionGroup = seradataSpacecraftDetailTupleResponse.primaryMissionGroup
            primeManufacturerOrgId = seradataSpacecraftDetailTupleResponse.primeManufacturerOrgId
            programName = seradataSpacecraftDetailTupleResponse.programName
            quantity = seradataSpacecraftDetailTupleResponse.quantity
            reusableFlights = seradataSpacecraftDetailTupleResponse.reusableFlights
            reusedHullName = seradataSpacecraftDetailTupleResponse.reusedHullName
            scientific = seradataSpacecraftDetailTupleResponse.scientific.map { it.toMutableList() }
            sector = seradataSpacecraftDetailTupleResponse.sector
            seradataCommDetails =
                seradataSpacecraftDetailTupleResponse.seradataCommDetails.map { it.toMutableList() }
            seradataEarlyWarning =
                seradataSpacecraftDetailTupleResponse.seradataEarlyWarning.map {
                    it.toMutableList()
                }
            seradataNavigation =
                seradataSpacecraftDetailTupleResponse.seradataNavigation.map { it.toMutableList() }
            seradataOpticalPayload =
                seradataSpacecraftDetailTupleResponse.seradataOpticalPayload.map {
                    it.toMutableList()
                }
            seradataRadarPayload =
                seradataSpacecraftDetailTupleResponse.seradataRadarPayload.map {
                    it.toMutableList()
                }
            seradataSigIntPayload =
                seradataSpacecraftDetailTupleResponse.seradataSigIntPayload.map {
                    it.toMutableList()
                }
            serialNumber = seradataSpacecraftDetailTupleResponse.serialNumber
            stabilizer = seradataSpacecraftDetailTupleResponse.stabilizer
            status = seradataSpacecraftDetailTupleResponse.status
            totalClaims = seradataSpacecraftDetailTupleResponse.totalClaims
            totalFatalities = seradataSpacecraftDetailTupleResponse.totalFatalities
            totalInjuries = seradataSpacecraftDetailTupleResponse.totalInjuries
            totalPayloadPower = seradataSpacecraftDetailTupleResponse.totalPayloadPower
            updatedAt = seradataSpacecraftDetailTupleResponse.updatedAt
            updatedBy = seradataSpacecraftDetailTupleResponse.updatedBy
            youtubeLaunchLink = seradataSpacecraftDetailTupleResponse.youtubeLaunchLink
            additionalProperties =
                seradataSpacecraftDetailTupleResponse.additionalProperties.toMutableMap()
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
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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

        /** Model object representing on-orbit objects or satellites in the system. */
        fun onOrbit(onOrbit: OnOrbit) = onOrbit(JsonField.of(onOrbit))

        /**
         * Sets [Builder.onOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onOrbit] with a well-typed [OnOrbit] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun onOrbit(onOrbit: JsonField<OnOrbit>) = apply { this.onOrbit = onOrbit }

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

        /**
         * Read-only details of the Scientific object, only used during detail queries (not to be
         * provided on create/update operations).
         */
        fun scientific(scientific: List<Scientific>) = scientific(JsonField.of(scientific))

        /**
         * Sets [Builder.scientific] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scientific] with a well-typed `List<Scientific>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scientific(scientific: JsonField<List<Scientific>>) = apply {
            this.scientific = scientific.map { it.toMutableList() }
        }

        /**
         * Adds a single [Scientific] to [Builder.scientific].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScientific(scientific: Scientific) = apply {
            this.scientific =
                (this.scientific ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scientific", it).add(scientific)
                }
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

        /**
         * Read-only details of the SeradataCommDetails object, only used during detail queries (not
         * to be provided on create/update operations).
         */
        fun seradataCommDetails(seradataCommDetails: List<SeradataCommDetail>) =
            seradataCommDetails(JsonField.of(seradataCommDetails))

        /**
         * Sets [Builder.seradataCommDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seradataCommDetails] with a well-typed
         * `List<SeradataCommDetail>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun seradataCommDetails(seradataCommDetails: JsonField<List<SeradataCommDetail>>) = apply {
            this.seradataCommDetails = seradataCommDetails.map { it.toMutableList() }
        }

        /**
         * Adds a single [SeradataCommDetail] to [seradataCommDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeradataCommDetail(seradataCommDetail: SeradataCommDetail) = apply {
            seradataCommDetails =
                (seradataCommDetails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("seradataCommDetails", it).add(seradataCommDetail)
                }
        }

        /**
         * Read-only details of the SeradataEarlyWarning object, only used during detail queries
         * (not to be provided on create/update operations).
         */
        fun seradataEarlyWarning(seradataEarlyWarning: List<SeradataEarlyWarning>) =
            seradataEarlyWarning(JsonField.of(seradataEarlyWarning))

        /**
         * Sets [Builder.seradataEarlyWarning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seradataEarlyWarning] with a well-typed
         * `List<SeradataEarlyWarning>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun seradataEarlyWarning(seradataEarlyWarning: JsonField<List<SeradataEarlyWarning>>) =
            apply {
                this.seradataEarlyWarning = seradataEarlyWarning.map { it.toMutableList() }
            }

        /**
         * Adds a single [SeradataEarlyWarning] to [Builder.seradataEarlyWarning].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeradataEarlyWarning(seradataEarlyWarning: SeradataEarlyWarning) = apply {
            this.seradataEarlyWarning =
                (this.seradataEarlyWarning ?: JsonField.of(mutableListOf())).also {
                    checkKnown("seradataEarlyWarning", it).add(seradataEarlyWarning)
                }
        }

        /**
         * Read-only details of the SeradataNavigation object, only used during detail queries (not
         * to be provided on create/update operations).
         */
        fun seradataNavigation(seradataNavigation: List<SeradataNavigation>) =
            seradataNavigation(JsonField.of(seradataNavigation))

        /**
         * Sets [Builder.seradataNavigation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seradataNavigation] with a well-typed
         * `List<SeradataNavigation>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun seradataNavigation(seradataNavigation: JsonField<List<SeradataNavigation>>) = apply {
            this.seradataNavigation = seradataNavigation.map { it.toMutableList() }
        }

        /**
         * Adds a single [SeradataNavigation] to [Builder.seradataNavigation].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeradataNavigation(seradataNavigation: SeradataNavigation) = apply {
            this.seradataNavigation =
                (this.seradataNavigation ?: JsonField.of(mutableListOf())).also {
                    checkKnown("seradataNavigation", it).add(seradataNavigation)
                }
        }

        /**
         * Read-only details of the SeradataOpticalPayload object, only used during detail queries
         * (not to be provided on create/update operations).
         */
        fun seradataOpticalPayload(seradataOpticalPayload: List<SeradataOpticalPayload>) =
            seradataOpticalPayload(JsonField.of(seradataOpticalPayload))

        /**
         * Sets [Builder.seradataOpticalPayload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seradataOpticalPayload] with a well-typed
         * `List<SeradataOpticalPayload>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun seradataOpticalPayload(
            seradataOpticalPayload: JsonField<List<SeradataOpticalPayload>>
        ) = apply {
            this.seradataOpticalPayload = seradataOpticalPayload.map { it.toMutableList() }
        }

        /**
         * Adds a single [SeradataOpticalPayload] to [Builder.seradataOpticalPayload].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeradataOpticalPayload(seradataOpticalPayload: SeradataOpticalPayload) = apply {
            this.seradataOpticalPayload =
                (this.seradataOpticalPayload ?: JsonField.of(mutableListOf())).also {
                    checkKnown("seradataOpticalPayload", it).add(seradataOpticalPayload)
                }
        }

        /**
         * Read-only details of the SeradataRadarPayload object, only used during detail queries
         * (not to be provided on create/update operations).
         */
        fun seradataRadarPayload(seradataRadarPayload: List<SeradataRadarPayload>) =
            seradataRadarPayload(JsonField.of(seradataRadarPayload))

        /**
         * Sets [Builder.seradataRadarPayload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seradataRadarPayload] with a well-typed
         * `List<SeradataRadarPayload>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun seradataRadarPayload(seradataRadarPayload: JsonField<List<SeradataRadarPayload>>) =
            apply {
                this.seradataRadarPayload = seradataRadarPayload.map { it.toMutableList() }
            }

        /**
         * Adds a single [SeradataRadarPayload] to [Builder.seradataRadarPayload].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeradataRadarPayload(seradataRadarPayload: SeradataRadarPayload) = apply {
            this.seradataRadarPayload =
                (this.seradataRadarPayload ?: JsonField.of(mutableListOf())).also {
                    checkKnown("seradataRadarPayload", it).add(seradataRadarPayload)
                }
        }

        /**
         * Read-only details of the SeradataSigIntPayload object, only used during detail queries
         * (not to be provided on create/update operations).
         */
        fun seradataSigIntPayload(seradataSigIntPayload: List<SeradataSigIntPayload>) =
            seradataSigIntPayload(JsonField.of(seradataSigIntPayload))

        /**
         * Sets [Builder.seradataSigIntPayload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seradataSigIntPayload] with a well-typed
         * `List<SeradataSigIntPayload>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun seradataSigIntPayload(seradataSigIntPayload: JsonField<List<SeradataSigIntPayload>>) =
            apply {
                this.seradataSigIntPayload = seradataSigIntPayload.map { it.toMutableList() }
            }

        /**
         * Adds a single [SeradataSigIntPayload] to [Builder.seradataSigIntPayload].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeradataSigIntPayload(seradataSigIntPayload: SeradataSigIntPayload) = apply {
            this.seradataSigIntPayload =
                (this.seradataSigIntPayload ?: JsonField.of(mutableListOf())).also {
                    checkKnown("seradataSigIntPayload", it).add(seradataSigIntPayload)
                }
        }

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
         * Returns an immutable instance of [SeradataSpacecraftDetailTupleResponse].
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
        fun build(): SeradataSpacecraftDetailTupleResponse =
            SeradataSpacecraftDetailTupleResponse(
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
                onOrbit,
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
                (scientific ?: JsonMissing.of()).map { it.toImmutable() },
                sector,
                (seradataCommDetails ?: JsonMissing.of()).map { it.toImmutable() },
                (seradataEarlyWarning ?: JsonMissing.of()).map { it.toImmutable() },
                (seradataNavigation ?: JsonMissing.of()).map { it.toImmutable() },
                (seradataOpticalPayload ?: JsonMissing.of()).map { it.toImmutable() },
                (seradataRadarPayload ?: JsonMissing.of()).map { it.toImmutable() },
                (seradataSigIntPayload ?: JsonMissing.of()).map { it.toImmutable() },
                serialNumber,
                stabilizer,
                status,
                totalClaims,
                totalFatalities,
                totalInjuries,
                totalPayloadPower,
                updatedAt,
                updatedBy,
                youtubeLaunchLink,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SeradataSpacecraftDetailTupleResponse = apply {
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
        onOrbit().ifPresent { it.validate() }
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
        scientific().ifPresent { it.forEach { it.validate() } }
        sector()
        seradataCommDetails().ifPresent { it.forEach { it.validate() } }
        seradataEarlyWarning().ifPresent { it.forEach { it.validate() } }
        seradataNavigation().ifPresent { it.forEach { it.validate() } }
        seradataOpticalPayload().ifPresent { it.forEach { it.validate() } }
        seradataRadarPayload().ifPresent { it.forEach { it.validate() } }
        seradataSigIntPayload().ifPresent { it.forEach { it.validate() } }
        serialNumber()
        stabilizer()
        status()
        totalClaims()
        totalFatalities()
        totalInjuries()
        totalPayloadPower()
        updatedAt()
        updatedBy()
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
            (onOrbit.asKnown().getOrNull()?.validity() ?: 0) +
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
            (scientific.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (sector.asKnown().isPresent) 1 else 0) +
            (seradataCommDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (seradataEarlyWarning.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (seradataNavigation.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (seradataOpticalPayload.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (seradataRadarPayload.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (seradataSigIntPayload.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (serialNumber.asKnown().isPresent) 1 else 0) +
            (if (stabilizer.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (totalClaims.asKnown().isPresent) 1 else 0) +
            (if (totalFatalities.asKnown().isPresent) 1 else 0) +
            (if (totalInjuries.asKnown().isPresent) 1 else 0) +
            (if (totalPayloadPower.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (youtubeLaunchLink.asKnown().isPresent) 1 else 0)

    /**
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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

    /** Model object representing on-orbit objects or satellites in the system. */
    class OnOrbit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val satNo: JsonField<Int>,
        private val source: JsonField<String>,
        private val altName: JsonField<String>,
        private val antennas: JsonField<List<OnorbitAntennaFull>>,
        private val batteries: JsonField<List<OnorbitBatteryFull>>,
        private val category: JsonField<Category>,
        private val commonName: JsonField<String>,
        private val constellation: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val decayDate: JsonField<OffsetDateTime>,
        private val idOnOrbit: JsonField<String>,
        private val intlDes: JsonField<String>,
        private val launchDate: JsonField<LocalDate>,
        private val launchSiteId: JsonField<String>,
        private val lifetimeYears: JsonField<Int>,
        private val missionNumber: JsonField<String>,
        private val objectType: JsonField<ObjectType>,
        private val onorbitDetails: JsonField<List<OnorbitDetailsFull>>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val solarArrays: JsonField<List<OnorbitSolarArrayFull>>,
        private val thrusters: JsonField<List<OnorbitThrusterFull>>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val updatedBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("altName") @ExcludeMissing altName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("antennas")
            @ExcludeMissing
            antennas: JsonField<List<OnorbitAntennaFull>> = JsonMissing.of(),
            @JsonProperty("batteries")
            @ExcludeMissing
            batteries: JsonField<List<OnorbitBatteryFull>> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("commonName")
            @ExcludeMissing
            commonName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("constellation")
            @ExcludeMissing
            constellation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("countryCode")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("decayDate")
            @ExcludeMissing
            decayDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("idOnOrbit")
            @ExcludeMissing
            idOnOrbit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("intlDes") @ExcludeMissing intlDes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("launchDate")
            @ExcludeMissing
            launchDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("launchSiteId")
            @ExcludeMissing
            launchSiteId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lifetimeYears")
            @ExcludeMissing
            lifetimeYears: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("missionNumber")
            @ExcludeMissing
            missionNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("objectType")
            @ExcludeMissing
            objectType: JsonField<ObjectType> = JsonMissing.of(),
            @JsonProperty("onorbitDetails")
            @ExcludeMissing
            onorbitDetails: JsonField<List<OnorbitDetailsFull>> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("solarArrays")
            @ExcludeMissing
            solarArrays: JsonField<List<OnorbitSolarArrayFull>> = JsonMissing.of(),
            @JsonProperty("thrusters")
            @ExcludeMissing
            thrusters: JsonField<List<OnorbitThrusterFull>> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedBy")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            satNo,
            source,
            altName,
            antennas,
            batteries,
            category,
            commonName,
            constellation,
            countryCode,
            createdAt,
            createdBy,
            decayDate,
            idOnOrbit,
            intlDes,
            launchDate,
            launchSiteId,
            lifetimeYears,
            missionNumber,
            objectType,
            onorbitDetails,
            origin,
            origNetwork,
            solarArrays,
            thrusters,
            updatedAt,
            updatedBy,
            mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Satellite/Catalog number of the target on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun satNo(): Int = satNo.getRequired("satNo")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Alternate name of the on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun altName(): Optional<String> = altName.getOptional("altName")

        /**
         * Read-only collection of antennas on this on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun antennas(): Optional<List<OnorbitAntennaFull>> = antennas.getOptional("antennas")

        /**
         * Read-only collection of batteries on this on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun batteries(): Optional<List<OnorbitBatteryFull>> = batteries.getOptional("batteries")

        /**
         * Category of the on-orbit object. (Unknown, On-Orbit, Decayed, Cataloged Without State,
         * Launch Nominal, Analyst Satellite, Cislunar, Lunar, Hyperbolic, Heliocentric,
         * Interplanetary, Lagrangian, Docked).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun category(): Optional<Category> = category.getOptional("category")

        /**
         * Common name of the on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun commonName(): Optional<String> = commonName.getOptional("commonName")

        /**
         * Constellation to which this satellite belongs.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun constellation(): Optional<String> = constellation.getOptional("constellation")

        /**
         * The country code. This value is typically the ISO 3166 Alpha-2 two-character country
         * code, however it can also represent various consortiums that do not appear in the ISO
         * document. The code must correspond to an existing country in the UDL’s country API. Call
         * udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or alternate code
         * values that exist for the specified country code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Date of decay.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun decayDate(): Optional<OffsetDateTime> = decayDate.getOptional("decayDate")

        /**
         * For the public catalog, the idOnOrbit is typically the satellite number as a string, but
         * may be a UUID for analyst or other unknown or untracked satellites, auto-generated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

        /**
         * International Designator, typically of the format YYYYLLLAAA, where YYYY is the launch
         * year, LLL is the sequential launch number of that year, and AAA is an optional launch
         * piece designator for the launch.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun intlDes(): Optional<String> = intlDes.getOptional("intlDes")

        /**
         * Date of launch.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun launchDate(): Optional<LocalDate> = launchDate.getOptional("launchDate")

        /**
         * Id of the associated launchSite entity.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun launchSiteId(): Optional<String> = launchSiteId.getOptional("launchSiteId")

        /**
         * Estimated lifetime of the on-orbit payload, if known.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lifetimeYears(): Optional<Int> = lifetimeYears.getOptional("lifetimeYears")

        /**
         * Mission number of the on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionNumber(): Optional<String> = missionNumber.getOptional("missionNumber")

        /**
         * Type of on-orbit object: ROCKET BODY, DEBRIS, PAYLOAD, PLATFORM, MANNED, UNKNOWN.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objectType(): Optional<ObjectType> = objectType.getOptional("objectType")

        /**
         * Read-only collection of details for this on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun onorbitDetails(): Optional<List<OnorbitDetailsFull>> =
            onorbitDetails.getOptional("onorbitDetails")

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Read-only collection of solar arrays on this on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun solarArrays(): Optional<List<OnorbitSolarArrayFull>> =
            solarArrays.getOptional("solarArrays")

        /**
         * Read-only collection of thrusters (engines) on this on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun thrusters(): Optional<List<OnorbitThrusterFull>> = thrusters.getOptional("thrusters")

        /**
         * Time the row was last updated in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [satNo].
         *
         * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [altName].
         *
         * Unlike [altName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("altName") @ExcludeMissing fun _altName(): JsonField<String> = altName

        /**
         * Returns the raw JSON value of [antennas].
         *
         * Unlike [antennas], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("antennas")
        @ExcludeMissing
        fun _antennas(): JsonField<List<OnorbitAntennaFull>> = antennas

        /**
         * Returns the raw JSON value of [batteries].
         *
         * Unlike [batteries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("batteries")
        @ExcludeMissing
        fun _batteries(): JsonField<List<OnorbitBatteryFull>> = batteries

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [commonName].
         *
         * Unlike [commonName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commonName")
        @ExcludeMissing
        fun _commonName(): JsonField<String> = commonName

        /**
         * Returns the raw JSON value of [constellation].
         *
         * Unlike [constellation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("constellation")
        @ExcludeMissing
        fun _constellation(): JsonField<String> = constellation

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryCode")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

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
         * Returns the raw JSON value of [decayDate].
         *
         * Unlike [decayDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("decayDate")
        @ExcludeMissing
        fun _decayDate(): JsonField<OffsetDateTime> = decayDate

        /**
         * Returns the raw JSON value of [idOnOrbit].
         *
         * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

        /**
         * Returns the raw JSON value of [intlDes].
         *
         * Unlike [intlDes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("intlDes") @ExcludeMissing fun _intlDes(): JsonField<String> = intlDes

        /**
         * Returns the raw JSON value of [launchDate].
         *
         * Unlike [launchDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("launchDate")
        @ExcludeMissing
        fun _launchDate(): JsonField<LocalDate> = launchDate

        /**
         * Returns the raw JSON value of [launchSiteId].
         *
         * Unlike [launchSiteId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("launchSiteId")
        @ExcludeMissing
        fun _launchSiteId(): JsonField<String> = launchSiteId

        /**
         * Returns the raw JSON value of [lifetimeYears].
         *
         * Unlike [lifetimeYears], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lifetimeYears")
        @ExcludeMissing
        fun _lifetimeYears(): JsonField<Int> = lifetimeYears

        /**
         * Returns the raw JSON value of [missionNumber].
         *
         * Unlike [missionNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("missionNumber")
        @ExcludeMissing
        fun _missionNumber(): JsonField<String> = missionNumber

        /**
         * Returns the raw JSON value of [objectType].
         *
         * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("objectType")
        @ExcludeMissing
        fun _objectType(): JsonField<ObjectType> = objectType

        /**
         * Returns the raw JSON value of [onorbitDetails].
         *
         * Unlike [onorbitDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("onorbitDetails")
        @ExcludeMissing
        fun _onorbitDetails(): JsonField<List<OnorbitDetailsFull>> = onorbitDetails

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
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [solarArrays].
         *
         * Unlike [solarArrays], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("solarArrays")
        @ExcludeMissing
        fun _solarArrays(): JsonField<List<OnorbitSolarArrayFull>> = solarArrays

        /**
         * Returns the raw JSON value of [thrusters].
         *
         * Unlike [thrusters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("thrusters")
        @ExcludeMissing
        fun _thrusters(): JsonField<List<OnorbitThrusterFull>> = thrusters

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
             * Returns a mutable builder for constructing an instance of [OnOrbit].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .satNo()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OnOrbit]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var satNo: JsonField<Int>? = null
            private var source: JsonField<String>? = null
            private var altName: JsonField<String> = JsonMissing.of()
            private var antennas: JsonField<MutableList<OnorbitAntennaFull>>? = null
            private var batteries: JsonField<MutableList<OnorbitBatteryFull>>? = null
            private var category: JsonField<Category> = JsonMissing.of()
            private var commonName: JsonField<String> = JsonMissing.of()
            private var constellation: JsonField<String> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var decayDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var idOnOrbit: JsonField<String> = JsonMissing.of()
            private var intlDes: JsonField<String> = JsonMissing.of()
            private var launchDate: JsonField<LocalDate> = JsonMissing.of()
            private var launchSiteId: JsonField<String> = JsonMissing.of()
            private var lifetimeYears: JsonField<Int> = JsonMissing.of()
            private var missionNumber: JsonField<String> = JsonMissing.of()
            private var objectType: JsonField<ObjectType> = JsonMissing.of()
            private var onorbitDetails: JsonField<MutableList<OnorbitDetailsFull>>? = null
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var solarArrays: JsonField<MutableList<OnorbitSolarArrayFull>>? = null
            private var thrusters: JsonField<MutableList<OnorbitThrusterFull>>? = null
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(onOrbit: OnOrbit) = apply {
                classificationMarking = onOrbit.classificationMarking
                dataMode = onOrbit.dataMode
                satNo = onOrbit.satNo
                source = onOrbit.source
                altName = onOrbit.altName
                antennas = onOrbit.antennas.map { it.toMutableList() }
                batteries = onOrbit.batteries.map { it.toMutableList() }
                category = onOrbit.category
                commonName = onOrbit.commonName
                constellation = onOrbit.constellation
                countryCode = onOrbit.countryCode
                createdAt = onOrbit.createdAt
                createdBy = onOrbit.createdBy
                decayDate = onOrbit.decayDate
                idOnOrbit = onOrbit.idOnOrbit
                intlDes = onOrbit.intlDes
                launchDate = onOrbit.launchDate
                launchSiteId = onOrbit.launchSiteId
                lifetimeYears = onOrbit.lifetimeYears
                missionNumber = onOrbit.missionNumber
                objectType = onOrbit.objectType
                onorbitDetails = onOrbit.onorbitDetails.map { it.toMutableList() }
                origin = onOrbit.origin
                origNetwork = onOrbit.origNetwork
                solarArrays = onOrbit.solarArrays.map { it.toMutableList() }
                thrusters = onOrbit.thrusters.map { it.toMutableList() }
                updatedAt = onOrbit.updatedAt
                updatedBy = onOrbit.updatedBy
                additionalProperties = onOrbit.additionalProperties.toMutableMap()
            }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            /**
             * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

            /** Satellite/Catalog number of the target on-orbit object. */
            fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

            /**
             * Sets [Builder.satNo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Alternate name of the on-orbit object. */
            fun altName(altName: String) = altName(JsonField.of(altName))

            /**
             * Sets [Builder.altName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altName(altName: JsonField<String>) = apply { this.altName = altName }

            /** Read-only collection of antennas on this on-orbit object. */
            fun antennas(antennas: List<OnorbitAntennaFull>) = antennas(JsonField.of(antennas))

            /**
             * Sets [Builder.antennas] to an arbitrary JSON value.
             *
             * You should usually call [Builder.antennas] with a well-typed
             * `List<OnorbitAntennaFull>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun antennas(antennas: JsonField<List<OnorbitAntennaFull>>) = apply {
                this.antennas = antennas.map { it.toMutableList() }
            }

            /**
             * Adds a single [OnorbitAntennaFull] to [antennas].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAntenna(antenna: OnorbitAntennaFull) = apply {
                antennas =
                    (antennas ?: JsonField.of(mutableListOf())).also {
                        checkKnown("antennas", it).add(antenna)
                    }
            }

            /** Read-only collection of batteries on this on-orbit object. */
            fun batteries(batteries: List<OnorbitBatteryFull>) = batteries(JsonField.of(batteries))

            /**
             * Sets [Builder.batteries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.batteries] with a well-typed
             * `List<OnorbitBatteryFull>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun batteries(batteries: JsonField<List<OnorbitBatteryFull>>) = apply {
                this.batteries = batteries.map { it.toMutableList() }
            }

            /**
             * Adds a single [OnorbitBatteryFull] to [batteries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBattery(battery: OnorbitBatteryFull) = apply {
                batteries =
                    (batteries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("batteries", it).add(battery)
                    }
            }

            /**
             * Category of the on-orbit object. (Unknown, On-Orbit, Decayed, Cataloged Without
             * State, Launch Nominal, Analyst Satellite, Cislunar, Lunar, Hyperbolic, Heliocentric,
             * Interplanetary, Lagrangian, Docked).
             */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** Common name of the on-orbit object. */
            fun commonName(commonName: String) = commonName(JsonField.of(commonName))

            /**
             * Sets [Builder.commonName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commonName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commonName(commonName: JsonField<String>) = apply { this.commonName = commonName }

            /** Constellation to which this satellite belongs. */
            fun constellation(constellation: String) = constellation(JsonField.of(constellation))

            /**
             * Sets [Builder.constellation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.constellation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun constellation(constellation: JsonField<String>) = apply {
                this.constellation = constellation
            }

            /**
             * The country code. This value is typically the ISO 3166 Alpha-2 two-character country
             * code, however it can also represent various consortiums that do not appear in the ISO
             * document. The code must correspond to an existing country in the UDL’s country API.
             * Call udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or
             * alternate code values that exist for the specified country code.
             */
            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Application user who created the row in the database, auto-populated by the system.
             */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** Date of decay. */
            fun decayDate(decayDate: OffsetDateTime) = decayDate(JsonField.of(decayDate))

            /**
             * Sets [Builder.decayDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.decayDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun decayDate(decayDate: JsonField<OffsetDateTime>) = apply {
                this.decayDate = decayDate
            }

            /**
             * For the public catalog, the idOnOrbit is typically the satellite number as a string,
             * but may be a UUID for analyst or other unknown or untracked satellites,
             * auto-generated by the system.
             */
            fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

            /**
             * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

            /**
             * International Designator, typically of the format YYYYLLLAAA, where YYYY is the
             * launch year, LLL is the sequential launch number of that year, and AAA is an optional
             * launch piece designator for the launch.
             */
            fun intlDes(intlDes: String) = intlDes(JsonField.of(intlDes))

            /**
             * Sets [Builder.intlDes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.intlDes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun intlDes(intlDes: JsonField<String>) = apply { this.intlDes = intlDes }

            /** Date of launch. */
            fun launchDate(launchDate: LocalDate) = launchDate(JsonField.of(launchDate))

            /**
             * Sets [Builder.launchDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.launchDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun launchDate(launchDate: JsonField<LocalDate>) = apply {
                this.launchDate = launchDate
            }

            /** Id of the associated launchSite entity. */
            fun launchSiteId(launchSiteId: String) = launchSiteId(JsonField.of(launchSiteId))

            /**
             * Sets [Builder.launchSiteId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.launchSiteId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun launchSiteId(launchSiteId: JsonField<String>) = apply {
                this.launchSiteId = launchSiteId
            }

            /** Estimated lifetime of the on-orbit payload, if known. */
            fun lifetimeYears(lifetimeYears: Int) = lifetimeYears(JsonField.of(lifetimeYears))

            /**
             * Sets [Builder.lifetimeYears] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lifetimeYears] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lifetimeYears(lifetimeYears: JsonField<Int>) = apply {
                this.lifetimeYears = lifetimeYears
            }

            /** Mission number of the on-orbit object. */
            fun missionNumber(missionNumber: String) = missionNumber(JsonField.of(missionNumber))

            /**
             * Sets [Builder.missionNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionNumber(missionNumber: JsonField<String>) = apply {
                this.missionNumber = missionNumber
            }

            /** Type of on-orbit object: ROCKET BODY, DEBRIS, PAYLOAD, PLATFORM, MANNED, UNKNOWN. */
            fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

            /**
             * Sets [Builder.objectType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectType] with a well-typed [ObjectType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectType(objectType: JsonField<ObjectType>) = apply {
                this.objectType = objectType
            }

            /** Read-only collection of details for this on-orbit object. */
            fun onorbitDetails(onorbitDetails: List<OnorbitDetailsFull>) =
                onorbitDetails(JsonField.of(onorbitDetails))

            /**
             * Sets [Builder.onorbitDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onorbitDetails] with a well-typed
             * `List<OnorbitDetailsFull>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun onorbitDetails(onorbitDetails: JsonField<List<OnorbitDetailsFull>>) = apply {
                this.onorbitDetails = onorbitDetails.map { it.toMutableList() }
            }

            /**
             * Adds a single [OnorbitDetailsFull] to [onorbitDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOnorbitDetail(onorbitDetail: OnorbitDetailsFull) = apply {
                onorbitDetails =
                    (onorbitDetails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("onorbitDetails", it).add(onorbitDetail)
                    }
            }

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) = apply {
                this.origNetwork = origNetwork
            }

            /** Read-only collection of solar arrays on this on-orbit object. */
            fun solarArrays(solarArrays: List<OnorbitSolarArrayFull>) =
                solarArrays(JsonField.of(solarArrays))

            /**
             * Sets [Builder.solarArrays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.solarArrays] with a well-typed
             * `List<OnorbitSolarArrayFull>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun solarArrays(solarArrays: JsonField<List<OnorbitSolarArrayFull>>) = apply {
                this.solarArrays = solarArrays.map { it.toMutableList() }
            }

            /**
             * Adds a single [OnorbitSolarArrayFull] to [solarArrays].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSolarArray(solarArray: OnorbitSolarArrayFull) = apply {
                solarArrays =
                    (solarArrays ?: JsonField.of(mutableListOf())).also {
                        checkKnown("solarArrays", it).add(solarArray)
                    }
            }

            /** Read-only collection of thrusters (engines) on this on-orbit object. */
            fun thrusters(thrusters: List<OnorbitThrusterFull>) = thrusters(JsonField.of(thrusters))

            /**
             * Sets [Builder.thrusters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thrusters] with a well-typed
             * `List<OnorbitThrusterFull>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun thrusters(thrusters: JsonField<List<OnorbitThrusterFull>>) = apply {
                this.thrusters = thrusters.map { it.toMutableList() }
            }

            /**
             * Adds a single [OnorbitThrusterFull] to [thrusters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addThruster(thruster: OnorbitThrusterFull) = apply {
                thrusters =
                    (thrusters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("thrusters", it).add(thruster)
                    }
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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Application user who updated the row in the database, auto-populated by the system.
             */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [OnOrbit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .satNo()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OnOrbit =
                OnOrbit(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("satNo", satNo),
                    checkRequired("source", source),
                    altName,
                    (antennas ?: JsonMissing.of()).map { it.toImmutable() },
                    (batteries ?: JsonMissing.of()).map { it.toImmutable() },
                    category,
                    commonName,
                    constellation,
                    countryCode,
                    createdAt,
                    createdBy,
                    decayDate,
                    idOnOrbit,
                    intlDes,
                    launchDate,
                    launchSiteId,
                    lifetimeYears,
                    missionNumber,
                    objectType,
                    (onorbitDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    origin,
                    origNetwork,
                    (solarArrays ?: JsonMissing.of()).map { it.toImmutable() },
                    (thrusters ?: JsonMissing.of()).map { it.toImmutable() },
                    updatedAt,
                    updatedBy,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): OnOrbit = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            satNo()
            source()
            altName()
            antennas().ifPresent { it.forEach { it.validate() } }
            batteries().ifPresent { it.forEach { it.validate() } }
            category().ifPresent { it.validate() }
            commonName()
            constellation()
            countryCode()
            createdAt()
            createdBy()
            decayDate()
            idOnOrbit()
            intlDes()
            launchDate()
            launchSiteId()
            lifetimeYears()
            missionNumber()
            objectType().ifPresent { it.validate() }
            onorbitDetails().ifPresent { it.forEach { it.validate() } }
            origin()
            origNetwork()
            solarArrays().ifPresent { it.forEach { it.validate() } }
            thrusters().ifPresent { it.forEach { it.validate() } }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (satNo.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (altName.asKnown().isPresent) 1 else 0) +
                (antennas.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (batteries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (commonName.asKnown().isPresent) 1 else 0) +
                (if (constellation.asKnown().isPresent) 1 else 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (decayDate.asKnown().isPresent) 1 else 0) +
                (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
                (if (intlDes.asKnown().isPresent) 1 else 0) +
                (if (launchDate.asKnown().isPresent) 1 else 0) +
                (if (launchSiteId.asKnown().isPresent) 1 else 0) +
                (if (lifetimeYears.asKnown().isPresent) 1 else 0) +
                (if (missionNumber.asKnown().isPresent) 1 else 0) +
                (objectType.asKnown().getOrNull()?.validity() ?: 0) +
                (onorbitDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (solarArrays.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (thrusters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0)

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         */
        class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REAL,
                TEST,
                SIMULATED,
                EXERCISE,
                /**
                 * An enum member indicating that [DataMode] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

        /**
         * Category of the on-orbit object. (Unknown, On-Orbit, Decayed, Cataloged Without State,
         * Launch Nominal, Analyst Satellite, Cislunar, Lunar, Hyperbolic, Heliocentric,
         * Interplanetary, Lagrangian, Docked).
         */
        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val UNKNOWN = of("Unknown")

                @JvmField val ON_ORBIT = of("On-Orbit")

                @JvmField val DECAYED = of("Decayed")

                @JvmField val CATALOGED_WITHOUT_STATE = of("Cataloged Without State")

                @JvmField val LAUNCH_NOMINAL = of("Launch Nominal")

                @JvmField val ANALYST_SATELLITE = of("Analyst Satellite")

                @JvmField val CISLUNAR = of("Cislunar")

                @JvmField val LUNAR = of("Lunar")

                @JvmField val HYPERBOLIC = of("Hyperbolic")

                @JvmField val HELIOCENTRIC = of("Heliocentric")

                @JvmField val INTERPLANETARY = of("Interplanetary")

                @JvmField val LAGRANGIAN = of("Lagrangian")

                @JvmField val DOCKED = of("Docked")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                UNKNOWN,
                ON_ORBIT,
                DECAYED,
                CATALOGED_WITHOUT_STATE,
                LAUNCH_NOMINAL,
                ANALYST_SATELLITE,
                CISLUNAR,
                LUNAR,
                HYPERBOLIC,
                HELIOCENTRIC,
                INTERPLANETARY,
                LAGRANGIAN,
                DOCKED,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UNKNOWN,
                ON_ORBIT,
                DECAYED,
                CATALOGED_WITHOUT_STATE,
                LAUNCH_NOMINAL,
                ANALYST_SATELLITE,
                CISLUNAR,
                LUNAR,
                HYPERBOLIC,
                HELIOCENTRIC,
                INTERPLANETARY,
                LAGRANGIAN,
                DOCKED,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    UNKNOWN -> Value.UNKNOWN
                    ON_ORBIT -> Value.ON_ORBIT
                    DECAYED -> Value.DECAYED
                    CATALOGED_WITHOUT_STATE -> Value.CATALOGED_WITHOUT_STATE
                    LAUNCH_NOMINAL -> Value.LAUNCH_NOMINAL
                    ANALYST_SATELLITE -> Value.ANALYST_SATELLITE
                    CISLUNAR -> Value.CISLUNAR
                    LUNAR -> Value.LUNAR
                    HYPERBOLIC -> Value.HYPERBOLIC
                    HELIOCENTRIC -> Value.HELIOCENTRIC
                    INTERPLANETARY -> Value.INTERPLANETARY
                    LAGRANGIAN -> Value.LAGRANGIAN
                    DOCKED -> Value.DOCKED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
             */
            fun known(): Known =
                when (this) {
                    UNKNOWN -> Known.UNKNOWN
                    ON_ORBIT -> Known.ON_ORBIT
                    DECAYED -> Known.DECAYED
                    CATALOGED_WITHOUT_STATE -> Known.CATALOGED_WITHOUT_STATE
                    LAUNCH_NOMINAL -> Known.LAUNCH_NOMINAL
                    ANALYST_SATELLITE -> Known.ANALYST_SATELLITE
                    CISLUNAR -> Known.CISLUNAR
                    LUNAR -> Known.LUNAR
                    HYPERBOLIC -> Known.HYPERBOLIC
                    HELIOCENTRIC -> Known.HELIOCENTRIC
                    INTERPLANETARY -> Known.INTERPLANETARY
                    LAGRANGIAN -> Known.LAGRANGIAN
                    DOCKED -> Known.DOCKED
                    else -> throw UnifieddatalibraryInvalidDataException("Unknown Category: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    UnifieddatalibraryInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Category = apply {
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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Type of on-orbit object: ROCKET BODY, DEBRIS, PAYLOAD, PLATFORM, MANNED, UNKNOWN. */
        class ObjectType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ROCKET_BODY = of("ROCKET BODY")

                @JvmField val DEBRIS = of("DEBRIS")

                @JvmField val PAYLOAD = of("PAYLOAD")

                @JvmField val PLATFORM = of("PLATFORM")

                @JvmField val MANNED = of("MANNED")

                @JvmField val UNKNOWN = of("UNKNOWN")

                @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
            }

            /** An enum containing [ObjectType]'s known values. */
            enum class Known {
                ROCKET_BODY,
                DEBRIS,
                PAYLOAD,
                PLATFORM,
                MANNED,
                UNKNOWN,
            }

            /**
             * An enum containing [ObjectType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ObjectType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ROCKET_BODY,
                DEBRIS,
                PAYLOAD,
                PLATFORM,
                MANNED,
                UNKNOWN,
                /**
                 * An enum member indicating that [ObjectType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ROCKET_BODY -> Value.ROCKET_BODY
                    DEBRIS -> Value.DEBRIS
                    PAYLOAD -> Value.PAYLOAD
                    PLATFORM -> Value.PLATFORM
                    MANNED -> Value.MANNED
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
             */
            fun known(): Known =
                when (this) {
                    ROCKET_BODY -> Known.ROCKET_BODY
                    DEBRIS -> Known.DEBRIS
                    PAYLOAD -> Known.PAYLOAD
                    PLATFORM -> Known.PLATFORM
                    MANNED -> Known.MANNED
                    UNKNOWN -> Known.UNKNOWN
                    else ->
                        throw UnifieddatalibraryInvalidDataException("Unknown ObjectType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    UnifieddatalibraryInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): ObjectType = apply {
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

                return other is ObjectType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OnOrbit &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                satNo == other.satNo &&
                source == other.source &&
                altName == other.altName &&
                antennas == other.antennas &&
                batteries == other.batteries &&
                category == other.category &&
                commonName == other.commonName &&
                constellation == other.constellation &&
                countryCode == other.countryCode &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                decayDate == other.decayDate &&
                idOnOrbit == other.idOnOrbit &&
                intlDes == other.intlDes &&
                launchDate == other.launchDate &&
                launchSiteId == other.launchSiteId &&
                lifetimeYears == other.lifetimeYears &&
                missionNumber == other.missionNumber &&
                objectType == other.objectType &&
                onorbitDetails == other.onorbitDetails &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                solarArrays == other.solarArrays &&
                thrusters == other.thrusters &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                satNo,
                source,
                altName,
                antennas,
                batteries,
                category,
                commonName,
                constellation,
                countryCode,
                createdAt,
                createdBy,
                decayDate,
                idOnOrbit,
                intlDes,
                launchDate,
                launchSiteId,
                lifetimeYears,
                missionNumber,
                objectType,
                onorbitDetails,
                origin,
                origNetwork,
                solarArrays,
                thrusters,
                updatedAt,
                updatedBy,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OnOrbit{classificationMarking=$classificationMarking, dataMode=$dataMode, satNo=$satNo, source=$source, altName=$altName, antennas=$antennas, batteries=$batteries, category=$category, commonName=$commonName, constellation=$constellation, countryCode=$countryCode, createdAt=$createdAt, createdBy=$createdBy, decayDate=$decayDate, idOnOrbit=$idOnOrbit, intlDes=$intlDes, launchDate=$launchDate, launchSiteId=$launchSiteId, lifetimeYears=$lifetimeYears, missionNumber=$missionNumber, objectType=$objectType, onorbitDetails=$onorbitDetails, origin=$origin, origNetwork=$origNetwork, solarArrays=$solarArrays, thrusters=$thrusters, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
    }

    /** Scientific or other data from Seradata. */
    class Scientific
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val name: JsonField<String>,
        private val source: JsonField<String>,
        private val spacecraftId: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val entity: JsonField<EntityFull>,
        private val frequencyBand: JsonField<String>,
        private val hostedForCompanyOrgId: JsonField<String>,
        private val idEntity: JsonField<String>,
        private val manufacturerOrgId: JsonField<String>,
        private val notes: JsonField<String>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val payloadCategory: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val updatedBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spacecraftId")
            @ExcludeMissing
            spacecraftId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entity")
            @ExcludeMissing
            entity: JsonField<EntityFull> = JsonMissing.of(),
            @JsonProperty("frequencyBand")
            @ExcludeMissing
            frequencyBand: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hostedForCompanyOrgId")
            @ExcludeMissing
            hostedForCompanyOrgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idEntity")
            @ExcludeMissing
            idEntity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("manufacturerOrgId")
            @ExcludeMissing
            manufacturerOrgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payloadCategory")
            @ExcludeMissing
            payloadCategory: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedBy")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            name,
            source,
            spacecraftId,
            id,
            createdAt,
            createdBy,
            entity,
            frequencyBand,
            hostedForCompanyOrgId,
            idEntity,
            manufacturerOrgId,
            notes,
            origin,
            origNetwork,
            payloadCategory,
            updatedAt,
            updatedBy,
            mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Sensor name from sera data, e.g. SEM/MAG (SEM / Magnetometer).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Seradata ID of the spacecraft (SeradataSpacecraftDetails ID).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun spacecraftId(): String = spacecraftId.getRequired("spacecraftId")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * An entity is a generic representation of any object within a space/SSA system such as
         * sensors, on-orbit objects, RF Emitters, space craft buses, etc. An entity can have an
         * operating unit, a location (if terrestrial), and statuses.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun entity(): Optional<EntityFull> = entity.getOptional("entity")

        /**
         * Frequency band, e.g. Gamma.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun frequencyBand(): Optional<String> = frequencyBand.getOptional("frequencyBand")

        /**
         * Hosted for company/Organization Id.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hostedForCompanyOrgId(): Optional<String> =
            hostedForCompanyOrgId.getOptional("hostedForCompanyOrgId")

        /**
         * ID of the parent entity for this Scientific.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idEntity(): Optional<String> = idEntity.getOptional("idEntity")

        /**
         * Unique identifier of the organization which manufactures this bus.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun manufacturerOrgId(): Optional<String> =
            manufacturerOrgId.getOptional("manufacturerOrgId")

        /**
         * Notes associated with the payload.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Payload category, e.g. Magnetometer, Radiometer, Sensor, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun payloadCategory(): Optional<String> = payloadCategory.getOptional("payloadCategory")

        /**
         * Time the row was last updated in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [spacecraftId].
         *
         * Unlike [spacecraftId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spacecraftId")
        @ExcludeMissing
        fun _spacecraftId(): JsonField<String> = spacecraftId

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * Returns the raw JSON value of [entity].
         *
         * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<EntityFull> = entity

        /**
         * Returns the raw JSON value of [frequencyBand].
         *
         * Unlike [frequencyBand], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("frequencyBand")
        @ExcludeMissing
        fun _frequencyBand(): JsonField<String> = frequencyBand

        /**
         * Returns the raw JSON value of [hostedForCompanyOrgId].
         *
         * Unlike [hostedForCompanyOrgId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hostedForCompanyOrgId")
        @ExcludeMissing
        fun _hostedForCompanyOrgId(): JsonField<String> = hostedForCompanyOrgId

        /**
         * Returns the raw JSON value of [idEntity].
         *
         * Unlike [idEntity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idEntity") @ExcludeMissing fun _idEntity(): JsonField<String> = idEntity

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
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [payloadCategory].
         *
         * Unlike [payloadCategory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payloadCategory")
        @ExcludeMissing
        fun _payloadCategory(): JsonField<String> = payloadCategory

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
             * Returns a mutable builder for constructing an instance of [Scientific].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .name()
             * .source()
             * .spacecraftId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Scientific]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var name: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var spacecraftId: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var entity: JsonField<EntityFull> = JsonMissing.of()
            private var frequencyBand: JsonField<String> = JsonMissing.of()
            private var hostedForCompanyOrgId: JsonField<String> = JsonMissing.of()
            private var idEntity: JsonField<String> = JsonMissing.of()
            private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var payloadCategory: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scientific: Scientific) = apply {
                classificationMarking = scientific.classificationMarking
                dataMode = scientific.dataMode
                name = scientific.name
                source = scientific.source
                spacecraftId = scientific.spacecraftId
                id = scientific.id
                createdAt = scientific.createdAt
                createdBy = scientific.createdBy
                entity = scientific.entity
                frequencyBand = scientific.frequencyBand
                hostedForCompanyOrgId = scientific.hostedForCompanyOrgId
                idEntity = scientific.idEntity
                manufacturerOrgId = scientific.manufacturerOrgId
                notes = scientific.notes
                origin = scientific.origin
                origNetwork = scientific.origNetwork
                payloadCategory = scientific.payloadCategory
                updatedAt = scientific.updatedAt
                updatedBy = scientific.updatedBy
                additionalProperties = scientific.additionalProperties.toMutableMap()
            }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            /**
             * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

            /** Sensor name from sera data, e.g. SEM/MAG (SEM / Magnetometer). */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Seradata ID of the spacecraft (SeradataSpacecraftDetails ID). */
            fun spacecraftId(spacecraftId: String) = spacecraftId(JsonField.of(spacecraftId))

            /**
             * Sets [Builder.spacecraftId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spacecraftId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spacecraftId(spacecraftId: JsonField<String>) = apply {
                this.spacecraftId = spacecraftId
            }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Time the row was created in the database, auto-populated by the system. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Application user who created the row in the database, auto-populated by the system.
             */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /**
             * An entity is a generic representation of any object within a space/SSA system such as
             * sensors, on-orbit objects, RF Emitters, space craft buses, etc. An entity can have an
             * operating unit, a location (if terrestrial), and statuses.
             */
            fun entity(entity: EntityFull) = entity(JsonField.of(entity))

            /**
             * Sets [Builder.entity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entity] with a well-typed [EntityFull] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entity(entity: JsonField<EntityFull>) = apply { this.entity = entity }

            /** Frequency band, e.g. Gamma. */
            fun frequencyBand(frequencyBand: String) = frequencyBand(JsonField.of(frequencyBand))

            /**
             * Sets [Builder.frequencyBand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequencyBand] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frequencyBand(frequencyBand: JsonField<String>) = apply {
                this.frequencyBand = frequencyBand
            }

            /** Hosted for company/Organization Id. */
            fun hostedForCompanyOrgId(hostedForCompanyOrgId: String) =
                hostedForCompanyOrgId(JsonField.of(hostedForCompanyOrgId))

            /**
             * Sets [Builder.hostedForCompanyOrgId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hostedForCompanyOrgId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun hostedForCompanyOrgId(hostedForCompanyOrgId: JsonField<String>) = apply {
                this.hostedForCompanyOrgId = hostedForCompanyOrgId
            }

            /** ID of the parent entity for this Scientific. */
            fun idEntity(idEntity: String) = idEntity(JsonField.of(idEntity))

            /**
             * Sets [Builder.idEntity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idEntity] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idEntity(idEntity: JsonField<String>) = apply { this.idEntity = idEntity }

            /** Unique identifier of the organization which manufactures this bus. */
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

            /** Notes associated with the payload. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) = apply {
                this.origNetwork = origNetwork
            }

            /** Payload category, e.g. Magnetometer, Radiometer, Sensor, etc. */
            fun payloadCategory(payloadCategory: String) =
                payloadCategory(JsonField.of(payloadCategory))

            /**
             * Sets [Builder.payloadCategory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payloadCategory] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payloadCategory(payloadCategory: JsonField<String>) = apply {
                this.payloadCategory = payloadCategory
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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Application user who updated the row in the database, auto-populated by the system.
             */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Scientific].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .name()
             * .source()
             * .spacecraftId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Scientific =
                Scientific(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("name", name),
                    checkRequired("source", source),
                    checkRequired("spacecraftId", spacecraftId),
                    id,
                    createdAt,
                    createdBy,
                    entity,
                    frequencyBand,
                    hostedForCompanyOrgId,
                    idEntity,
                    manufacturerOrgId,
                    notes,
                    origin,
                    origNetwork,
                    payloadCategory,
                    updatedAt,
                    updatedBy,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Scientific = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            name()
            source()
            spacecraftId()
            id()
            createdAt()
            createdBy()
            entity().ifPresent { it.validate() }
            frequencyBand()
            hostedForCompanyOrgId()
            idEntity()
            manufacturerOrgId()
            notes()
            origin()
            origNetwork()
            payloadCategory()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (spacecraftId.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (entity.asKnown().getOrNull()?.validity() ?: 0) +
                (if (frequencyBand.asKnown().isPresent) 1 else 0) +
                (if (hostedForCompanyOrgId.asKnown().isPresent) 1 else 0) +
                (if (idEntity.asKnown().isPresent) 1 else 0) +
                (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) +
                (if (notes.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (payloadCategory.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0)

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         */
        class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REAL,
                TEST,
                SIMULATED,
                EXERCISE,
                /**
                 * An enum member indicating that [DataMode] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

            return other is Scientific &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                name == other.name &&
                source == other.source &&
                spacecraftId == other.spacecraftId &&
                id == other.id &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                entity == other.entity &&
                frequencyBand == other.frequencyBand &&
                hostedForCompanyOrgId == other.hostedForCompanyOrgId &&
                idEntity == other.idEntity &&
                manufacturerOrgId == other.manufacturerOrgId &&
                notes == other.notes &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                payloadCategory == other.payloadCategory &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                name,
                source,
                spacecraftId,
                id,
                createdAt,
                createdBy,
                entity,
                frequencyBand,
                hostedForCompanyOrgId,
                idEntity,
                manufacturerOrgId,
                notes,
                origin,
                origNetwork,
                payloadCategory,
                updatedAt,
                updatedBy,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Scientific{classificationMarking=$classificationMarking, dataMode=$dataMode, name=$name, source=$source, spacecraftId=$spacecraftId, id=$id, createdAt=$createdAt, createdBy=$createdBy, entity=$entity, frequencyBand=$frequencyBand, hostedForCompanyOrgId=$hostedForCompanyOrgId, idEntity=$idEntity, manufacturerOrgId=$manufacturerOrgId, notes=$notes, origin=$origin, origNetwork=$origNetwork, payloadCategory=$payloadCategory, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
    }

    /** Seradata-compiled information on communications payloads. */
    class SeradataCommDetail
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("band") @ExcludeMissing band: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bandwidth")
            @ExcludeMissing
            bandwidth: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("updatedBy")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
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
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Name of the band of this RF range (e.g.
         * X,K,Ku,Ka,L,S,C,UHF,VHF,EHF,SHF,UNK,VLF,HF,E,Q,V,W). See RFBandType for more details and
         * descriptions of each band name.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun band(): Optional<String> = band.getOptional("band")

        /**
         * Comm bandwidth in Mhz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bandwidth(): Optional<Double> = bandwidth.getOptional("bandwidth")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Effective isotropic radiated power in dB.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun eirp(): Optional<Double> = eirp.getOptional("eirp")

        /**
         * Comm estimated HtsTotalCapacity in Gbps.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun estHtsTotalCapacity(): Optional<Double> =
            estHtsTotalCapacity.getOptional("estHtsTotalCapacity")

        /**
         * Comm estimated HtsTotalUserDownlinkBandwidthPerBeam in Mhz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun estHtsTotalUserDownlinkBandwidthPerBeam(): Optional<Double> =
            estHtsTotalUserDownlinkBandwidthPerBeam.getOptional(
                "estHtsTotalUserDownlinkBandwidthPerBeam"
            )

        /**
         * Comm estimated HtsTotalUserUplinkBandwidthPerBeam in Mhz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun estHtsTotalUserUplinkBandwidthPerBeam(): Optional<Double> =
            estHtsTotalUserUplinkBandwidthPerBeam.getOptional(
                "estHtsTotalUserUplinkBandwidthPerBeam"
            )

        /**
         * Comm gatewayDownlinkFrom in Ghz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun gatewayDownlinkFrom(): Optional<Double> =
            gatewayDownlinkFrom.getOptional("gatewayDownlinkFrom")

        /**
         * Comm gatewayDownlinkTo in Ghz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun gatewayDownlinkTo(): Optional<Double> =
            gatewayDownlinkTo.getOptional("gatewayDownlinkTo")

        /**
         * Comm gatewayUplinkFrom in Ghz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun gatewayUplinkFrom(): Optional<Double> =
            gatewayUplinkFrom.getOptional("gatewayUplinkFrom")

        /**
         * Comm gatewayUplinkTo in Ghz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun gatewayUplinkTo(): Optional<Double> = gatewayUplinkTo.getOptional("gatewayUplinkTo")

        /**
         * Comm hostedForCompanyOrgId.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hostedForCompanyOrgId(): Optional<String> =
            hostedForCompanyOrgId.getOptional("hostedForCompanyOrgId")

        /**
         * Comm htsNumUserSpotBeams.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun htsNumUserSpotBeams(): Optional<Int> =
            htsNumUserSpotBeams.getOptional("htsNumUserSpotBeams")

        /**
         * Comm htsUserDownlinkBandwidthPerBeam in Mhz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun htsUserDownlinkBandwidthPerBeam(): Optional<Double> =
            htsUserDownlinkBandwidthPerBeam.getOptional("htsUserDownlinkBandwidthPerBeam")

        /**
         * Comm htsUserUplinkBandwidthPerBeam in Mhz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun htsUserUplinkBandwidthPerBeam(): Optional<Double> =
            htsUserUplinkBandwidthPerBeam.getOptional("htsUserUplinkBandwidthPerBeam")

        /**
         * UUID of the parent Comm record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idComm(): Optional<String> = idComm.getOptional("idComm")

        /**
         * Comm manufacturerOrgId.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun manufacturerOrgId(): Optional<String> =
            manufacturerOrgId.getOptional("manufacturerOrgId")

        /**
         * Comm num36MhzEquivalentTransponders.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun num36MhzEquivalentTransponders(): Optional<Int> =
            num36MhzEquivalentTransponders.getOptional("num36MhzEquivalentTransponders")

        /**
         * Comm numOperationalTransponders.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numOperationalTransponders(): Optional<Int> =
            numOperationalTransponders.getOptional("numOperationalTransponders")

        /**
         * Comm numSpareTransponders.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numSpareTransponders(): Optional<Int> =
            numSpareTransponders.getOptional("numSpareTransponders")

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Payload notes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun payloadNotes(): Optional<String> = payloadNotes.getOptional("payloadNotes")

        /**
         * Comm polarization.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun polarization(): Optional<String> = polarization.getOptional("polarization")

        /**
         * Solid state power amplifier, in Watts.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun solidStatePowerAmp(): Optional<Double> =
            solidStatePowerAmp.getOptional("solidStatePowerAmp")

        /**
         * Seradata ID of the spacecraft (SeradataSpacecraftDetails ID).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun spacecraftId(): Optional<String> = spacecraftId.getOptional("spacecraftId")

        /**
         * Comm tradeLeaseOrgId.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tradeLeaseOrgId(): Optional<String> = tradeLeaseOrgId.getOptional("tradeLeaseOrgId")

        /**
         * Comm travelingWaveTubeAmplifier in Watts.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun travelingWaveTubeAmplifier(): Optional<Double> =
            travelingWaveTubeAmplifier.getOptional("travelingWaveTubeAmplifier")

        /**
         * Time the row was last updated in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Comm userDownlinkFrom in Ghz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun userDownlinkFrom(): Optional<Double> = userDownlinkFrom.getOptional("userDownlinkFrom")

        /**
         * Comm userDownlinkTo in Ghz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun userDownlinkTo(): Optional<Double> = userDownlinkTo.getOptional("userDownlinkTo")

        /**
         * Comm userUplinkFrom in Ghz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun userUplinkFrom(): Optional<Double> = userUplinkFrom.getOptional("userUplinkFrom")

        /**
         * Comm userUplinkTo in Ghz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun userUplinkTo(): Optional<Double> = userUplinkTo.getOptional("userUplinkTo")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Unlike [estHtsTotalCapacity], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("estHtsTotalCapacity")
        @ExcludeMissing
        fun _estHtsTotalCapacity(): JsonField<Double> = estHtsTotalCapacity

        /**
         * Returns the raw JSON value of [estHtsTotalUserDownlinkBandwidthPerBeam].
         *
         * Unlike [estHtsTotalUserDownlinkBandwidthPerBeam], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("estHtsTotalUserDownlinkBandwidthPerBeam")
        @ExcludeMissing
        fun _estHtsTotalUserDownlinkBandwidthPerBeam(): JsonField<Double> =
            estHtsTotalUserDownlinkBandwidthPerBeam

        /**
         * Returns the raw JSON value of [estHtsTotalUserUplinkBandwidthPerBeam].
         *
         * Unlike [estHtsTotalUserUplinkBandwidthPerBeam], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("estHtsTotalUserUplinkBandwidthPerBeam")
        @ExcludeMissing
        fun _estHtsTotalUserUplinkBandwidthPerBeam(): JsonField<Double> =
            estHtsTotalUserUplinkBandwidthPerBeam

        /**
         * Returns the raw JSON value of [gatewayDownlinkFrom].
         *
         * Unlike [gatewayDownlinkFrom], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Unlike [gatewayUplinkTo], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("gatewayUplinkTo")
        @ExcludeMissing
        fun _gatewayUplinkTo(): JsonField<Double> = gatewayUplinkTo

        /**
         * Returns the raw JSON value of [hostedForCompanyOrgId].
         *
         * Unlike [hostedForCompanyOrgId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hostedForCompanyOrgId")
        @ExcludeMissing
        fun _hostedForCompanyOrgId(): JsonField<String> = hostedForCompanyOrgId

        /**
         * Returns the raw JSON value of [htsNumUserSpotBeams].
         *
         * Unlike [htsNumUserSpotBeams], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("htsNumUserSpotBeams")
        @ExcludeMissing
        fun _htsNumUserSpotBeams(): JsonField<Int> = htsNumUserSpotBeams

        /**
         * Returns the raw JSON value of [htsUserDownlinkBandwidthPerBeam].
         *
         * Unlike [htsUserDownlinkBandwidthPerBeam], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("htsUserDownlinkBandwidthPerBeam")
        @ExcludeMissing
        fun _htsUserDownlinkBandwidthPerBeam(): JsonField<Double> = htsUserDownlinkBandwidthPerBeam

        /**
         * Returns the raw JSON value of [htsUserUplinkBandwidthPerBeam].
         *
         * Unlike [htsUserUplinkBandwidthPerBeam], this method doesn't throw if the JSON field has
         * an unexpected type.
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
         * Unlike [num36MhzEquivalentTransponders], this method doesn't throw if the JSON field has
         * an unexpected type.
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
         * Unlike [numSpareTransponders], this method doesn't throw if the JSON field has an
         * unexpected type.
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
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [payloadNotes].
         *
         * Unlike [payloadNotes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payloadNotes")
        @ExcludeMissing
        fun _payloadNotes(): JsonField<String> = payloadNotes

        /**
         * Returns the raw JSON value of [polarization].
         *
         * Unlike [polarization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("polarization")
        @ExcludeMissing
        fun _polarization(): JsonField<String> = polarization

        /**
         * Returns the raw JSON value of [solidStatePowerAmp].
         *
         * Unlike [solidStatePowerAmp], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("solidStatePowerAmp")
        @ExcludeMissing
        fun _solidStatePowerAmp(): JsonField<Double> = solidStatePowerAmp

        /**
         * Returns the raw JSON value of [spacecraftId].
         *
         * Unlike [spacecraftId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spacecraftId")
        @ExcludeMissing
        fun _spacecraftId(): JsonField<String> = spacecraftId

        /**
         * Returns the raw JSON value of [tradeLeaseOrgId].
         *
         * Unlike [tradeLeaseOrgId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [userDownlinkTo], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("userDownlinkTo")
        @ExcludeMissing
        fun _userDownlinkTo(): JsonField<Double> = userDownlinkTo

        /**
         * Returns the raw JSON value of [userUplinkFrom].
         *
         * Unlike [userUplinkFrom], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("userUplinkFrom")
        @ExcludeMissing
        fun _userUplinkFrom(): JsonField<Double> = userUplinkFrom

        /**
         * Returns the raw JSON value of [userUplinkTo].
         *
         * Unlike [userUplinkTo], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [SeradataCommDetail].
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

        /** A builder for [SeradataCommDetail]. */
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
            private var estHtsTotalUserDownlinkBandwidthPerBeam: JsonField<Double> =
                JsonMissing.of()
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
            internal fun from(seradataCommDetail: SeradataCommDetail) = apply {
                classificationMarking = seradataCommDetail.classificationMarking
                dataMode = seradataCommDetail.dataMode
                source = seradataCommDetail.source
                id = seradataCommDetail.id
                band = seradataCommDetail.band
                bandwidth = seradataCommDetail.bandwidth
                createdAt = seradataCommDetail.createdAt
                createdBy = seradataCommDetail.createdBy
                eirp = seradataCommDetail.eirp
                estHtsTotalCapacity = seradataCommDetail.estHtsTotalCapacity
                estHtsTotalUserDownlinkBandwidthPerBeam =
                    seradataCommDetail.estHtsTotalUserDownlinkBandwidthPerBeam
                estHtsTotalUserUplinkBandwidthPerBeam =
                    seradataCommDetail.estHtsTotalUserUplinkBandwidthPerBeam
                gatewayDownlinkFrom = seradataCommDetail.gatewayDownlinkFrom
                gatewayDownlinkTo = seradataCommDetail.gatewayDownlinkTo
                gatewayUplinkFrom = seradataCommDetail.gatewayUplinkFrom
                gatewayUplinkTo = seradataCommDetail.gatewayUplinkTo
                hostedForCompanyOrgId = seradataCommDetail.hostedForCompanyOrgId
                htsNumUserSpotBeams = seradataCommDetail.htsNumUserSpotBeams
                htsUserDownlinkBandwidthPerBeam = seradataCommDetail.htsUserDownlinkBandwidthPerBeam
                htsUserUplinkBandwidthPerBeam = seradataCommDetail.htsUserUplinkBandwidthPerBeam
                idComm = seradataCommDetail.idComm
                manufacturerOrgId = seradataCommDetail.manufacturerOrgId
                num36MhzEquivalentTransponders = seradataCommDetail.num36MhzEquivalentTransponders
                numOperationalTransponders = seradataCommDetail.numOperationalTransponders
                numSpareTransponders = seradataCommDetail.numSpareTransponders
                origin = seradataCommDetail.origin
                origNetwork = seradataCommDetail.origNetwork
                payloadNotes = seradataCommDetail.payloadNotes
                polarization = seradataCommDetail.polarization
                solidStatePowerAmp = seradataCommDetail.solidStatePowerAmp
                spacecraftId = seradataCommDetail.spacecraftId
                tradeLeaseOrgId = seradataCommDetail.tradeLeaseOrgId
                travelingWaveTubeAmplifier = seradataCommDetail.travelingWaveTubeAmplifier
                updatedAt = seradataCommDetail.updatedAt
                updatedBy = seradataCommDetail.updatedBy
                userDownlinkFrom = seradataCommDetail.userDownlinkFrom
                userDownlinkTo = seradataCommDetail.userDownlinkTo
                userUplinkFrom = seradataCommDetail.userUplinkFrom
                userUplinkTo = seradataCommDetail.userUplinkTo
                additionalProperties = seradataCommDetail.additionalProperties.toMutableMap()
            }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            /**
             * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Name of the band of this RF range (e.g.
             * X,K,Ku,Ka,L,S,C,UHF,VHF,EHF,SHF,UNK,VLF,HF,E,Q,V,W). See RFBandType for more details
             * and descriptions of each band name.
             */
            fun band(band: String) = band(JsonField.of(band))

            /**
             * Sets [Builder.band] to an arbitrary JSON value.
             *
             * You should usually call [Builder.band] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun band(band: JsonField<String>) = apply { this.band = band }

            /** Comm bandwidth in Mhz. */
            fun bandwidth(bandwidth: Double) = bandwidth(JsonField.of(bandwidth))

            /**
             * Sets [Builder.bandwidth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bandwidth] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Application user who created the row in the database, auto-populated by the system.
             */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** Effective isotropic radiated power in dB. */
            fun eirp(eirp: Double) = eirp(JsonField.of(eirp))

            /**
             * Sets [Builder.eirp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eirp] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun eirp(eirp: JsonField<Double>) = apply { this.eirp = eirp }

            /** Comm estimated HtsTotalCapacity in Gbps. */
            fun estHtsTotalCapacity(estHtsTotalCapacity: Double) =
                estHtsTotalCapacity(JsonField.of(estHtsTotalCapacity))

            /**
             * Sets [Builder.estHtsTotalCapacity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.estHtsTotalCapacity] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * well-typed [Double] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun estHtsTotalUserDownlinkBandwidthPerBeam(
                estHtsTotalUserDownlinkBandwidthPerBeam: JsonField<Double>
            ) = apply {
                this.estHtsTotalUserDownlinkBandwidthPerBeam =
                    estHtsTotalUserDownlinkBandwidthPerBeam
            }

            /** Comm estimated HtsTotalUserUplinkBandwidthPerBeam in Mhz. */
            fun estHtsTotalUserUplinkBandwidthPerBeam(
                estHtsTotalUserUplinkBandwidthPerBeam: Double
            ) =
                estHtsTotalUserUplinkBandwidthPerBeam(
                    JsonField.of(estHtsTotalUserUplinkBandwidthPerBeam)
                )

            /**
             * Sets [Builder.estHtsTotalUserUplinkBandwidthPerBeam] to an arbitrary JSON value.
             *
             * You should usually call [Builder.estHtsTotalUserUplinkBandwidthPerBeam] with a
             * well-typed [Double] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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
             * You should usually call [Builder.gatewayDownlinkFrom] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.hostedForCompanyOrgId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun htsUserDownlinkBandwidthPerBeam(
                htsUserDownlinkBandwidthPerBeam: JsonField<Double>
            ) = apply { this.htsUserDownlinkBandwidthPerBeam = htsUserDownlinkBandwidthPerBeam }

            /** Comm htsUserUplinkBandwidthPerBeam in Mhz. */
            fun htsUserUplinkBandwidthPerBeam(htsUserUplinkBandwidthPerBeam: Double) =
                htsUserUplinkBandwidthPerBeam(JsonField.of(htsUserUplinkBandwidthPerBeam))

            /**
             * Sets [Builder.htsUserUplinkBandwidthPerBeam] to an arbitrary JSON value.
             *
             * You should usually call [Builder.htsUserUplinkBandwidthPerBeam] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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
             * You should usually call [Builder.idComm] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.num36MhzEquivalentTransponders] with a well-typed
             * [Int] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun num36MhzEquivalentTransponders(num36MhzEquivalentTransponders: JsonField<Int>) =
                apply {
                    this.num36MhzEquivalentTransponders = num36MhzEquivalentTransponders
                }

            /** Comm numOperationalTransponders. */
            fun numOperationalTransponders(numOperationalTransponders: Int) =
                numOperationalTransponders(JsonField.of(numOperationalTransponders))

            /**
             * Sets [Builder.numOperationalTransponders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numOperationalTransponders] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) = apply {
                this.origNetwork = origNetwork
            }

            /** Payload notes. */
            fun payloadNotes(payloadNotes: String) = payloadNotes(JsonField.of(payloadNotes))

            /**
             * Sets [Builder.payloadNotes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payloadNotes] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payloadNotes(payloadNotes: JsonField<String>) = apply {
                this.payloadNotes = payloadNotes
            }

            /** Comm polarization. */
            fun polarization(polarization: String) = polarization(JsonField.of(polarization))

            /**
             * Sets [Builder.polarization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.polarization] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.spacecraftId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.travelingWaveTubeAmplifier] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Application user who updated the row in the database, auto-populated by the system.
             */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun userDownlinkTo(userDownlinkTo: Double) =
                userDownlinkTo(JsonField.of(userDownlinkTo))

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
            fun userUplinkFrom(userUplinkFrom: Double) =
                userUplinkFrom(JsonField.of(userUplinkFrom))

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
             * You should usually call [Builder.userUplinkTo] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [SeradataCommDetail].
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
            fun build(): SeradataCommDetail =
                SeradataCommDetail(
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

        fun validate(): SeradataCommDetail = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         */
        class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REAL,
                TEST,
                SIMULATED,
                EXERCISE,
                /**
                 * An enum member indicating that [DataMode] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

            return other is SeradataCommDetail &&
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
                estHtsTotalUserUplinkBandwidthPerBeam ==
                    other.estHtsTotalUserUplinkBandwidthPerBeam &&
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
            "SeradataCommDetail{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, id=$id, band=$band, bandwidth=$bandwidth, createdAt=$createdAt, createdBy=$createdBy, eirp=$eirp, estHtsTotalCapacity=$estHtsTotalCapacity, estHtsTotalUserDownlinkBandwidthPerBeam=$estHtsTotalUserDownlinkBandwidthPerBeam, estHtsTotalUserUplinkBandwidthPerBeam=$estHtsTotalUserUplinkBandwidthPerBeam, gatewayDownlinkFrom=$gatewayDownlinkFrom, gatewayDownlinkTo=$gatewayDownlinkTo, gatewayUplinkFrom=$gatewayUplinkFrom, gatewayUplinkTo=$gatewayUplinkTo, hostedForCompanyOrgId=$hostedForCompanyOrgId, htsNumUserSpotBeams=$htsNumUserSpotBeams, htsUserDownlinkBandwidthPerBeam=$htsUserDownlinkBandwidthPerBeam, htsUserUplinkBandwidthPerBeam=$htsUserUplinkBandwidthPerBeam, idComm=$idComm, manufacturerOrgId=$manufacturerOrgId, num36MhzEquivalentTransponders=$num36MhzEquivalentTransponders, numOperationalTransponders=$numOperationalTransponders, numSpareTransponders=$numSpareTransponders, origin=$origin, origNetwork=$origNetwork, payloadNotes=$payloadNotes, polarization=$polarization, solidStatePowerAmp=$solidStatePowerAmp, spacecraftId=$spacecraftId, tradeLeaseOrgId=$tradeLeaseOrgId, travelingWaveTubeAmplifier=$travelingWaveTubeAmplifier, updatedAt=$updatedAt, updatedBy=$updatedBy, userDownlinkFrom=$userDownlinkFrom, userDownlinkTo=$userDownlinkTo, userUplinkFrom=$userUplinkFrom, userUplinkTo=$userUplinkTo, additionalProperties=$additionalProperties}"
    }

    /** Details for an early warning payload from Seradata. */
    class SeradataEarlyWarning
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val source: JsonField<String>,
        private val spacecraftId: JsonField<String>,
        private val id: JsonField<String>,
        private val bestResolution: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val earthPointing: JsonField<Boolean>,
        private val frequencyLimits: JsonField<String>,
        private val groundStationLocations: JsonField<String>,
        private val groundStations: JsonField<String>,
        private val hostedForCompanyOrgId: JsonField<String>,
        private val idIr: JsonField<String>,
        private val manufacturerOrgId: JsonField<String>,
        private val missileLaunchPhaseDetectionAbility: JsonField<String>,
        private val name: JsonField<String>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val partnerSpacecraftId: JsonField<String>,
        private val payloadNotes: JsonField<String>,
        private val spectralBands: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val updatedBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spacecraftId")
            @ExcludeMissing
            spacecraftId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bestResolution")
            @ExcludeMissing
            bestResolution: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("earthPointing")
            @ExcludeMissing
            earthPointing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("frequencyLimits")
            @ExcludeMissing
            frequencyLimits: JsonField<String> = JsonMissing.of(),
            @JsonProperty("groundStationLocations")
            @ExcludeMissing
            groundStationLocations: JsonField<String> = JsonMissing.of(),
            @JsonProperty("groundStations")
            @ExcludeMissing
            groundStations: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hostedForCompanyOrgId")
            @ExcludeMissing
            hostedForCompanyOrgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idIR") @ExcludeMissing idIr: JsonField<String> = JsonMissing.of(),
            @JsonProperty("manufacturerOrgId")
            @ExcludeMissing
            manufacturerOrgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("missileLaunchPhaseDetectionAbility")
            @ExcludeMissing
            missileLaunchPhaseDetectionAbility: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("partnerSpacecraftId")
            @ExcludeMissing
            partnerSpacecraftId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payloadNotes")
            @ExcludeMissing
            payloadNotes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spectralBands")
            @ExcludeMissing
            spectralBands: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedBy")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            source,
            spacecraftId,
            id,
            bestResolution,
            createdAt,
            createdBy,
            earthPointing,
            frequencyLimits,
            groundStationLocations,
            groundStations,
            hostedForCompanyOrgId,
            idIr,
            manufacturerOrgId,
            missileLaunchPhaseDetectionAbility,
            name,
            origin,
            origNetwork,
            partnerSpacecraftId,
            payloadNotes,
            spectralBands,
            updatedAt,
            updatedBy,
            mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Seradata ID of the spacecraft (SeradataSpacecraftDetails ID).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun spacecraftId(): String = spacecraftId.getRequired("spacecraftId")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Best resolution for this IR in meters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bestResolution(): Optional<Double> = bestResolution.getOptional("bestResolution")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Is the sensor Earth Pointing.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun earthPointing(): Optional<Boolean> = earthPointing.getOptional("earthPointing")

        /**
         * Frequency Limits for this IR.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun frequencyLimits(): Optional<String> = frequencyLimits.getOptional("frequencyLimits")

        /**
         * Ground Station Locations for this IR.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun groundStationLocations(): Optional<String> =
            groundStationLocations.getOptional("groundStationLocations")

        /**
         * Ground Station info for this IR.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun groundStations(): Optional<String> = groundStations.getOptional("groundStations")

        /**
         * Hosted for company/Organization Id.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hostedForCompanyOrgId(): Optional<String> =
            hostedForCompanyOrgId.getOptional("hostedForCompanyOrgId")

        /**
         * UUID of the parent IR record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idIr(): Optional<String> = idIr.getOptional("idIR")

        /**
         * Manufacturer Organization Id.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun manufacturerOrgId(): Optional<String> =
            manufacturerOrgId.getOptional("manufacturerOrgId")

        /**
         * Missile Launch Phase Detection Ability.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missileLaunchPhaseDetectionAbility(): Optional<String> =
            missileLaunchPhaseDetectionAbility.getOptional("missileLaunchPhaseDetectionAbility")

        /**
         * Sensor name from Seradata, e.g. Infra red telescope, Schmidt Telescope, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Seradata ID of the spacecraft (SeradataSpacecraftDetails ID).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun partnerSpacecraftId(): Optional<String> =
            partnerSpacecraftId.getOptional("partnerSpacecraftId")

        /**
         * Payload notes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun payloadNotes(): Optional<String> = payloadNotes.getOptional("payloadNotes")

        /**
         * Spectral Bands, e.g. Infra-Red.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun spectralBands(): Optional<String> = spectralBands.getOptional("spectralBands")

        /**
         * Time the row was last updated in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [spacecraftId].
         *
         * Unlike [spacecraftId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spacecraftId")
        @ExcludeMissing
        fun _spacecraftId(): JsonField<String> = spacecraftId

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [bestResolution].
         *
         * Unlike [bestResolution], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bestResolution")
        @ExcludeMissing
        fun _bestResolution(): JsonField<Double> = bestResolution

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
         * Returns the raw JSON value of [earthPointing].
         *
         * Unlike [earthPointing], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("earthPointing")
        @ExcludeMissing
        fun _earthPointing(): JsonField<Boolean> = earthPointing

        /**
         * Returns the raw JSON value of [frequencyLimits].
         *
         * Unlike [frequencyLimits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("frequencyLimits")
        @ExcludeMissing
        fun _frequencyLimits(): JsonField<String> = frequencyLimits

        /**
         * Returns the raw JSON value of [groundStationLocations].
         *
         * Unlike [groundStationLocations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("groundStationLocations")
        @ExcludeMissing
        fun _groundStationLocations(): JsonField<String> = groundStationLocations

        /**
         * Returns the raw JSON value of [groundStations].
         *
         * Unlike [groundStations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("groundStations")
        @ExcludeMissing
        fun _groundStations(): JsonField<String> = groundStations

        /**
         * Returns the raw JSON value of [hostedForCompanyOrgId].
         *
         * Unlike [hostedForCompanyOrgId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hostedForCompanyOrgId")
        @ExcludeMissing
        fun _hostedForCompanyOrgId(): JsonField<String> = hostedForCompanyOrgId

        /**
         * Returns the raw JSON value of [idIr].
         *
         * Unlike [idIr], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idIR") @ExcludeMissing fun _idIr(): JsonField<String> = idIr

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
         * Returns the raw JSON value of [missileLaunchPhaseDetectionAbility].
         *
         * Unlike [missileLaunchPhaseDetectionAbility], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("missileLaunchPhaseDetectionAbility")
        @ExcludeMissing
        fun _missileLaunchPhaseDetectionAbility(): JsonField<String> =
            missileLaunchPhaseDetectionAbility

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [partnerSpacecraftId].
         *
         * Unlike [partnerSpacecraftId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("partnerSpacecraftId")
        @ExcludeMissing
        fun _partnerSpacecraftId(): JsonField<String> = partnerSpacecraftId

        /**
         * Returns the raw JSON value of [payloadNotes].
         *
         * Unlike [payloadNotes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payloadNotes")
        @ExcludeMissing
        fun _payloadNotes(): JsonField<String> = payloadNotes

        /**
         * Returns the raw JSON value of [spectralBands].
         *
         * Unlike [spectralBands], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spectralBands")
        @ExcludeMissing
        fun _spectralBands(): JsonField<String> = spectralBands

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
             * Returns a mutable builder for constructing an instance of [SeradataEarlyWarning].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * .spacecraftId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SeradataEarlyWarning]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var source: JsonField<String>? = null
            private var spacecraftId: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var bestResolution: JsonField<Double> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var earthPointing: JsonField<Boolean> = JsonMissing.of()
            private var frequencyLimits: JsonField<String> = JsonMissing.of()
            private var groundStationLocations: JsonField<String> = JsonMissing.of()
            private var groundStations: JsonField<String> = JsonMissing.of()
            private var hostedForCompanyOrgId: JsonField<String> = JsonMissing.of()
            private var idIr: JsonField<String> = JsonMissing.of()
            private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
            private var missileLaunchPhaseDetectionAbility: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var partnerSpacecraftId: JsonField<String> = JsonMissing.of()
            private var payloadNotes: JsonField<String> = JsonMissing.of()
            private var spectralBands: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(seradataEarlyWarning: SeradataEarlyWarning) = apply {
                classificationMarking = seradataEarlyWarning.classificationMarking
                dataMode = seradataEarlyWarning.dataMode
                source = seradataEarlyWarning.source
                spacecraftId = seradataEarlyWarning.spacecraftId
                id = seradataEarlyWarning.id
                bestResolution = seradataEarlyWarning.bestResolution
                createdAt = seradataEarlyWarning.createdAt
                createdBy = seradataEarlyWarning.createdBy
                earthPointing = seradataEarlyWarning.earthPointing
                frequencyLimits = seradataEarlyWarning.frequencyLimits
                groundStationLocations = seradataEarlyWarning.groundStationLocations
                groundStations = seradataEarlyWarning.groundStations
                hostedForCompanyOrgId = seradataEarlyWarning.hostedForCompanyOrgId
                idIr = seradataEarlyWarning.idIr
                manufacturerOrgId = seradataEarlyWarning.manufacturerOrgId
                missileLaunchPhaseDetectionAbility =
                    seradataEarlyWarning.missileLaunchPhaseDetectionAbility
                name = seradataEarlyWarning.name
                origin = seradataEarlyWarning.origin
                origNetwork = seradataEarlyWarning.origNetwork
                partnerSpacecraftId = seradataEarlyWarning.partnerSpacecraftId
                payloadNotes = seradataEarlyWarning.payloadNotes
                spectralBands = seradataEarlyWarning.spectralBands
                updatedAt = seradataEarlyWarning.updatedAt
                updatedBy = seradataEarlyWarning.updatedBy
                additionalProperties = seradataEarlyWarning.additionalProperties.toMutableMap()
            }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            /**
             * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Seradata ID of the spacecraft (SeradataSpacecraftDetails ID). */
            fun spacecraftId(spacecraftId: String) = spacecraftId(JsonField.of(spacecraftId))

            /**
             * Sets [Builder.spacecraftId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spacecraftId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spacecraftId(spacecraftId: JsonField<String>) = apply {
                this.spacecraftId = spacecraftId
            }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Best resolution for this IR in meters. */
            fun bestResolution(bestResolution: Double) =
                bestResolution(JsonField.of(bestResolution))

            /**
             * Sets [Builder.bestResolution] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bestResolution] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bestResolution(bestResolution: JsonField<Double>) = apply {
                this.bestResolution = bestResolution
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Application user who created the row in the database, auto-populated by the system.
             */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** Is the sensor Earth Pointing. */
            fun earthPointing(earthPointing: Boolean) = earthPointing(JsonField.of(earthPointing))

            /**
             * Sets [Builder.earthPointing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.earthPointing] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun earthPointing(earthPointing: JsonField<Boolean>) = apply {
                this.earthPointing = earthPointing
            }

            /** Frequency Limits for this IR. */
            fun frequencyLimits(frequencyLimits: String) =
                frequencyLimits(JsonField.of(frequencyLimits))

            /**
             * Sets [Builder.frequencyLimits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequencyLimits] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frequencyLimits(frequencyLimits: JsonField<String>) = apply {
                this.frequencyLimits = frequencyLimits
            }

            /** Ground Station Locations for this IR. */
            fun groundStationLocations(groundStationLocations: String) =
                groundStationLocations(JsonField.of(groundStationLocations))

            /**
             * Sets [Builder.groundStationLocations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groundStationLocations] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun groundStationLocations(groundStationLocations: JsonField<String>) = apply {
                this.groundStationLocations = groundStationLocations
            }

            /** Ground Station info for this IR. */
            fun groundStations(groundStations: String) =
                groundStations(JsonField.of(groundStations))

            /**
             * Sets [Builder.groundStations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groundStations] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groundStations(groundStations: JsonField<String>) = apply {
                this.groundStations = groundStations
            }

            /** Hosted for company/Organization Id. */
            fun hostedForCompanyOrgId(hostedForCompanyOrgId: String) =
                hostedForCompanyOrgId(JsonField.of(hostedForCompanyOrgId))

            /**
             * Sets [Builder.hostedForCompanyOrgId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hostedForCompanyOrgId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun hostedForCompanyOrgId(hostedForCompanyOrgId: JsonField<String>) = apply {
                this.hostedForCompanyOrgId = hostedForCompanyOrgId
            }

            /** UUID of the parent IR record. */
            fun idIr(idIr: String) = idIr(JsonField.of(idIr))

            /**
             * Sets [Builder.idIr] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idIr] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun idIr(idIr: JsonField<String>) = apply { this.idIr = idIr }

            /** Manufacturer Organization Id. */
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

            /** Missile Launch Phase Detection Ability. */
            fun missileLaunchPhaseDetectionAbility(missileLaunchPhaseDetectionAbility: String) =
                missileLaunchPhaseDetectionAbility(JsonField.of(missileLaunchPhaseDetectionAbility))

            /**
             * Sets [Builder.missileLaunchPhaseDetectionAbility] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missileLaunchPhaseDetectionAbility] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun missileLaunchPhaseDetectionAbility(
                missileLaunchPhaseDetectionAbility: JsonField<String>
            ) = apply {
                this.missileLaunchPhaseDetectionAbility = missileLaunchPhaseDetectionAbility
            }

            /** Sensor name from Seradata, e.g. Infra red telescope, Schmidt Telescope, etc. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) = apply {
                this.origNetwork = origNetwork
            }

            /** Seradata ID of the spacecraft (SeradataSpacecraftDetails ID). */
            fun partnerSpacecraftId(partnerSpacecraftId: String) =
                partnerSpacecraftId(JsonField.of(partnerSpacecraftId))

            /**
             * Sets [Builder.partnerSpacecraftId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partnerSpacecraftId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun partnerSpacecraftId(partnerSpacecraftId: JsonField<String>) = apply {
                this.partnerSpacecraftId = partnerSpacecraftId
            }

            /** Payload notes. */
            fun payloadNotes(payloadNotes: String) = payloadNotes(JsonField.of(payloadNotes))

            /**
             * Sets [Builder.payloadNotes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payloadNotes] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payloadNotes(payloadNotes: JsonField<String>) = apply {
                this.payloadNotes = payloadNotes
            }

            /** Spectral Bands, e.g. Infra-Red. */
            fun spectralBands(spectralBands: String) = spectralBands(JsonField.of(spectralBands))

            /**
             * Sets [Builder.spectralBands] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spectralBands] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spectralBands(spectralBands: JsonField<String>) = apply {
                this.spectralBands = spectralBands
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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Application user who updated the row in the database, auto-populated by the system.
             */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [SeradataEarlyWarning].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * .spacecraftId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SeradataEarlyWarning =
                SeradataEarlyWarning(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("source", source),
                    checkRequired("spacecraftId", spacecraftId),
                    id,
                    bestResolution,
                    createdAt,
                    createdBy,
                    earthPointing,
                    frequencyLimits,
                    groundStationLocations,
                    groundStations,
                    hostedForCompanyOrgId,
                    idIr,
                    manufacturerOrgId,
                    missileLaunchPhaseDetectionAbility,
                    name,
                    origin,
                    origNetwork,
                    partnerSpacecraftId,
                    payloadNotes,
                    spectralBands,
                    updatedAt,
                    updatedBy,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SeradataEarlyWarning = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            source()
            spacecraftId()
            id()
            bestResolution()
            createdAt()
            createdBy()
            earthPointing()
            frequencyLimits()
            groundStationLocations()
            groundStations()
            hostedForCompanyOrgId()
            idIr()
            manufacturerOrgId()
            missileLaunchPhaseDetectionAbility()
            name()
            origin()
            origNetwork()
            partnerSpacecraftId()
            payloadNotes()
            spectralBands()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (spacecraftId.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (bestResolution.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (earthPointing.asKnown().isPresent) 1 else 0) +
                (if (frequencyLimits.asKnown().isPresent) 1 else 0) +
                (if (groundStationLocations.asKnown().isPresent) 1 else 0) +
                (if (groundStations.asKnown().isPresent) 1 else 0) +
                (if (hostedForCompanyOrgId.asKnown().isPresent) 1 else 0) +
                (if (idIr.asKnown().isPresent) 1 else 0) +
                (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) +
                (if (missileLaunchPhaseDetectionAbility.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (partnerSpacecraftId.asKnown().isPresent) 1 else 0) +
                (if (payloadNotes.asKnown().isPresent) 1 else 0) +
                (if (spectralBands.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0)

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         */
        class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REAL,
                TEST,
                SIMULATED,
                EXERCISE,
                /**
                 * An enum member indicating that [DataMode] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

            return other is SeradataEarlyWarning &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                source == other.source &&
                spacecraftId == other.spacecraftId &&
                id == other.id &&
                bestResolution == other.bestResolution &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                earthPointing == other.earthPointing &&
                frequencyLimits == other.frequencyLimits &&
                groundStationLocations == other.groundStationLocations &&
                groundStations == other.groundStations &&
                hostedForCompanyOrgId == other.hostedForCompanyOrgId &&
                idIr == other.idIr &&
                manufacturerOrgId == other.manufacturerOrgId &&
                missileLaunchPhaseDetectionAbility == other.missileLaunchPhaseDetectionAbility &&
                name == other.name &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                partnerSpacecraftId == other.partnerSpacecraftId &&
                payloadNotes == other.payloadNotes &&
                spectralBands == other.spectralBands &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                source,
                spacecraftId,
                id,
                bestResolution,
                createdAt,
                createdBy,
                earthPointing,
                frequencyLimits,
                groundStationLocations,
                groundStations,
                hostedForCompanyOrgId,
                idIr,
                manufacturerOrgId,
                missileLaunchPhaseDetectionAbility,
                name,
                origin,
                origNetwork,
                partnerSpacecraftId,
                payloadNotes,
                spectralBands,
                updatedAt,
                updatedBy,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SeradataEarlyWarning{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, spacecraftId=$spacecraftId, id=$id, bestResolution=$bestResolution, createdAt=$createdAt, createdBy=$createdBy, earthPointing=$earthPointing, frequencyLimits=$frequencyLimits, groundStationLocations=$groundStationLocations, groundStations=$groundStations, hostedForCompanyOrgId=$hostedForCompanyOrgId, idIr=$idIr, manufacturerOrgId=$manufacturerOrgId, missileLaunchPhaseDetectionAbility=$missileLaunchPhaseDetectionAbility, name=$name, origin=$origin, origNetwork=$origNetwork, partnerSpacecraftId=$partnerSpacecraftId, payloadNotes=$payloadNotes, spectralBands=$spectralBands, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
    }

    /** Details for a navigation payload from Seradata. */
    class SeradataNavigation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val source: JsonField<String>,
        private val spacecraftId: JsonField<String>,
        private val id: JsonField<String>,
        private val areaCoverage: JsonField<String>,
        private val clockType: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val hostedForCompanyOrgId: JsonField<String>,
        private val idNavigation: JsonField<String>,
        private val locationAccuracy: JsonField<Double>,
        private val manufacturerOrgId: JsonField<String>,
        private val modeFrequency: JsonField<String>,
        private val modes: JsonField<String>,
        private val name: JsonField<String>,
        private val notes: JsonField<String>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val partnerSpacecraftId: JsonField<String>,
        private val payloadType: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val updatedBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spacecraftId")
            @ExcludeMissing
            spacecraftId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("areaCoverage")
            @ExcludeMissing
            areaCoverage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("clockType")
            @ExcludeMissing
            clockType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hostedForCompanyOrgId")
            @ExcludeMissing
            hostedForCompanyOrgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idNavigation")
            @ExcludeMissing
            idNavigation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locationAccuracy")
            @ExcludeMissing
            locationAccuracy: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("manufacturerOrgId")
            @ExcludeMissing
            manufacturerOrgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("modeFrequency")
            @ExcludeMissing
            modeFrequency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("modes") @ExcludeMissing modes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("partnerSpacecraftId")
            @ExcludeMissing
            partnerSpacecraftId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payloadType")
            @ExcludeMissing
            payloadType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedBy")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            source,
            spacecraftId,
            id,
            areaCoverage,
            clockType,
            createdAt,
            createdBy,
            hostedForCompanyOrgId,
            idNavigation,
            locationAccuracy,
            manufacturerOrgId,
            modeFrequency,
            modes,
            name,
            notes,
            origin,
            origNetwork,
            partnerSpacecraftId,
            payloadType,
            updatedAt,
            updatedBy,
            mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Seradata ID of the spacecraft (SeradataSpacecraftDetails ID).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun spacecraftId(): String = spacecraftId.getRequired("spacecraftId")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Area of coverage, e.g. Worldwide, India, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun areaCoverage(): Optional<String> = areaCoverage.getOptional("areaCoverage")

        /**
         * Type of clock, e.g. Rubidium, Hydrogen Maser, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun clockType(): Optional<String> = clockType.getOptional("clockType")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Hosted for company/Organization Id.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hostedForCompanyOrgId(): Optional<String> =
            hostedForCompanyOrgId.getOptional("hostedForCompanyOrgId")

        /**
         * UUID of the parent Navigation record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idNavigation(): Optional<String> = idNavigation.getOptional("idNavigation")

        /**
         * Location accuracy in meters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun locationAccuracy(): Optional<Double> = locationAccuracy.getOptional("locationAccuracy")

        /**
         * Manufacturer Organization Id.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun manufacturerOrgId(): Optional<String> =
            manufacturerOrgId.getOptional("manufacturerOrgId")

        /**
         * Frequency for this payload.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun modeFrequency(): Optional<String> = modeFrequency.getOptional("modeFrequency")

        /**
         * Modes of operation.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun modes(): Optional<String> = modes.getOptional("modes")

        /**
         * Sensor name from Seradata, e.g. WAAS GEO-5, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Payload notes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Seradata ID of the spacecraft (SeradataSpacecraftDetails ID).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun partnerSpacecraftId(): Optional<String> =
            partnerSpacecraftId.getOptional("partnerSpacecraftId")

        /**
         * Navigation payload type, e.g. WAAS, GAGAN, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun payloadType(): Optional<String> = payloadType.getOptional("payloadType")

        /**
         * Time the row was last updated in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [spacecraftId].
         *
         * Unlike [spacecraftId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spacecraftId")
        @ExcludeMissing
        fun _spacecraftId(): JsonField<String> = spacecraftId

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [areaCoverage].
         *
         * Unlike [areaCoverage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("areaCoverage")
        @ExcludeMissing
        fun _areaCoverage(): JsonField<String> = areaCoverage

        /**
         * Returns the raw JSON value of [clockType].
         *
         * Unlike [clockType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("clockType") @ExcludeMissing fun _clockType(): JsonField<String> = clockType

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
         * Returns the raw JSON value of [hostedForCompanyOrgId].
         *
         * Unlike [hostedForCompanyOrgId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hostedForCompanyOrgId")
        @ExcludeMissing
        fun _hostedForCompanyOrgId(): JsonField<String> = hostedForCompanyOrgId

        /**
         * Returns the raw JSON value of [idNavigation].
         *
         * Unlike [idNavigation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idNavigation")
        @ExcludeMissing
        fun _idNavigation(): JsonField<String> = idNavigation

        /**
         * Returns the raw JSON value of [locationAccuracy].
         *
         * Unlike [locationAccuracy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("locationAccuracy")
        @ExcludeMissing
        fun _locationAccuracy(): JsonField<Double> = locationAccuracy

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
         * Returns the raw JSON value of [modeFrequency].
         *
         * Unlike [modeFrequency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("modeFrequency")
        @ExcludeMissing
        fun _modeFrequency(): JsonField<String> = modeFrequency

        /**
         * Returns the raw JSON value of [modes].
         *
         * Unlike [modes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modes") @ExcludeMissing fun _modes(): JsonField<String> = modes

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [partnerSpacecraftId].
         *
         * Unlike [partnerSpacecraftId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("partnerSpacecraftId")
        @ExcludeMissing
        fun _partnerSpacecraftId(): JsonField<String> = partnerSpacecraftId

        /**
         * Returns the raw JSON value of [payloadType].
         *
         * Unlike [payloadType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payloadType")
        @ExcludeMissing
        fun _payloadType(): JsonField<String> = payloadType

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
             * Returns a mutable builder for constructing an instance of [SeradataNavigation].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * .spacecraftId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SeradataNavigation]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var source: JsonField<String>? = null
            private var spacecraftId: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var areaCoverage: JsonField<String> = JsonMissing.of()
            private var clockType: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var hostedForCompanyOrgId: JsonField<String> = JsonMissing.of()
            private var idNavigation: JsonField<String> = JsonMissing.of()
            private var locationAccuracy: JsonField<Double> = JsonMissing.of()
            private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
            private var modeFrequency: JsonField<String> = JsonMissing.of()
            private var modes: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var partnerSpacecraftId: JsonField<String> = JsonMissing.of()
            private var payloadType: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(seradataNavigation: SeradataNavigation) = apply {
                classificationMarking = seradataNavigation.classificationMarking
                dataMode = seradataNavigation.dataMode
                source = seradataNavigation.source
                spacecraftId = seradataNavigation.spacecraftId
                id = seradataNavigation.id
                areaCoverage = seradataNavigation.areaCoverage
                clockType = seradataNavigation.clockType
                createdAt = seradataNavigation.createdAt
                createdBy = seradataNavigation.createdBy
                hostedForCompanyOrgId = seradataNavigation.hostedForCompanyOrgId
                idNavigation = seradataNavigation.idNavigation
                locationAccuracy = seradataNavigation.locationAccuracy
                manufacturerOrgId = seradataNavigation.manufacturerOrgId
                modeFrequency = seradataNavigation.modeFrequency
                modes = seradataNavigation.modes
                name = seradataNavigation.name
                notes = seradataNavigation.notes
                origin = seradataNavigation.origin
                origNetwork = seradataNavigation.origNetwork
                partnerSpacecraftId = seradataNavigation.partnerSpacecraftId
                payloadType = seradataNavigation.payloadType
                updatedAt = seradataNavigation.updatedAt
                updatedBy = seradataNavigation.updatedBy
                additionalProperties = seradataNavigation.additionalProperties.toMutableMap()
            }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            /**
             * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Seradata ID of the spacecraft (SeradataSpacecraftDetails ID). */
            fun spacecraftId(spacecraftId: String) = spacecraftId(JsonField.of(spacecraftId))

            /**
             * Sets [Builder.spacecraftId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spacecraftId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spacecraftId(spacecraftId: JsonField<String>) = apply {
                this.spacecraftId = spacecraftId
            }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Area of coverage, e.g. Worldwide, India, etc. */
            fun areaCoverage(areaCoverage: String) = areaCoverage(JsonField.of(areaCoverage))

            /**
             * Sets [Builder.areaCoverage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.areaCoverage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun areaCoverage(areaCoverage: JsonField<String>) = apply {
                this.areaCoverage = areaCoverage
            }

            /** Type of clock, e.g. Rubidium, Hydrogen Maser, etc. */
            fun clockType(clockType: String) = clockType(JsonField.of(clockType))

            /**
             * Sets [Builder.clockType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clockType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clockType(clockType: JsonField<String>) = apply { this.clockType = clockType }

            /** Time the row was created in the database, auto-populated by the system. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Application user who created the row in the database, auto-populated by the system.
             */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** Hosted for company/Organization Id. */
            fun hostedForCompanyOrgId(hostedForCompanyOrgId: String) =
                hostedForCompanyOrgId(JsonField.of(hostedForCompanyOrgId))

            /**
             * Sets [Builder.hostedForCompanyOrgId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hostedForCompanyOrgId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun hostedForCompanyOrgId(hostedForCompanyOrgId: JsonField<String>) = apply {
                this.hostedForCompanyOrgId = hostedForCompanyOrgId
            }

            /** UUID of the parent Navigation record. */
            fun idNavigation(idNavigation: String) = idNavigation(JsonField.of(idNavigation))

            /**
             * Sets [Builder.idNavigation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idNavigation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idNavigation(idNavigation: JsonField<String>) = apply {
                this.idNavigation = idNavigation
            }

            /** Location accuracy in meters. */
            fun locationAccuracy(locationAccuracy: Double) =
                locationAccuracy(JsonField.of(locationAccuracy))

            /**
             * Sets [Builder.locationAccuracy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locationAccuracy] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locationAccuracy(locationAccuracy: JsonField<Double>) = apply {
                this.locationAccuracy = locationAccuracy
            }

            /** Manufacturer Organization Id. */
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

            /** Frequency for this payload. */
            fun modeFrequency(modeFrequency: String) = modeFrequency(JsonField.of(modeFrequency))

            /**
             * Sets [Builder.modeFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modeFrequency] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modeFrequency(modeFrequency: JsonField<String>) = apply {
                this.modeFrequency = modeFrequency
            }

            /** Modes of operation. */
            fun modes(modes: String) = modes(JsonField.of(modes))

            /**
             * Sets [Builder.modes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modes(modes: JsonField<String>) = apply { this.modes = modes }

            /** Sensor name from Seradata, e.g. WAAS GEO-5, etc. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Payload notes. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) = apply {
                this.origNetwork = origNetwork
            }

            /** Seradata ID of the spacecraft (SeradataSpacecraftDetails ID). */
            fun partnerSpacecraftId(partnerSpacecraftId: String) =
                partnerSpacecraftId(JsonField.of(partnerSpacecraftId))

            /**
             * Sets [Builder.partnerSpacecraftId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partnerSpacecraftId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun partnerSpacecraftId(partnerSpacecraftId: JsonField<String>) = apply {
                this.partnerSpacecraftId = partnerSpacecraftId
            }

            /** Navigation payload type, e.g. WAAS, GAGAN, etc. */
            fun payloadType(payloadType: String) = payloadType(JsonField.of(payloadType))

            /**
             * Sets [Builder.payloadType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payloadType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payloadType(payloadType: JsonField<String>) = apply {
                this.payloadType = payloadType
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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Application user who updated the row in the database, auto-populated by the system.
             */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [SeradataNavigation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * .spacecraftId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SeradataNavigation =
                SeradataNavigation(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("source", source),
                    checkRequired("spacecraftId", spacecraftId),
                    id,
                    areaCoverage,
                    clockType,
                    createdAt,
                    createdBy,
                    hostedForCompanyOrgId,
                    idNavigation,
                    locationAccuracy,
                    manufacturerOrgId,
                    modeFrequency,
                    modes,
                    name,
                    notes,
                    origin,
                    origNetwork,
                    partnerSpacecraftId,
                    payloadType,
                    updatedAt,
                    updatedBy,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SeradataNavigation = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            source()
            spacecraftId()
            id()
            areaCoverage()
            clockType()
            createdAt()
            createdBy()
            hostedForCompanyOrgId()
            idNavigation()
            locationAccuracy()
            manufacturerOrgId()
            modeFrequency()
            modes()
            name()
            notes()
            origin()
            origNetwork()
            partnerSpacecraftId()
            payloadType()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (spacecraftId.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (areaCoverage.asKnown().isPresent) 1 else 0) +
                (if (clockType.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (hostedForCompanyOrgId.asKnown().isPresent) 1 else 0) +
                (if (idNavigation.asKnown().isPresent) 1 else 0) +
                (if (locationAccuracy.asKnown().isPresent) 1 else 0) +
                (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) +
                (if (modeFrequency.asKnown().isPresent) 1 else 0) +
                (if (modes.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (notes.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (partnerSpacecraftId.asKnown().isPresent) 1 else 0) +
                (if (payloadType.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0)

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         */
        class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REAL,
                TEST,
                SIMULATED,
                EXERCISE,
                /**
                 * An enum member indicating that [DataMode] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

            return other is SeradataNavigation &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                source == other.source &&
                spacecraftId == other.spacecraftId &&
                id == other.id &&
                areaCoverage == other.areaCoverage &&
                clockType == other.clockType &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                hostedForCompanyOrgId == other.hostedForCompanyOrgId &&
                idNavigation == other.idNavigation &&
                locationAccuracy == other.locationAccuracy &&
                manufacturerOrgId == other.manufacturerOrgId &&
                modeFrequency == other.modeFrequency &&
                modes == other.modes &&
                name == other.name &&
                notes == other.notes &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                partnerSpacecraftId == other.partnerSpacecraftId &&
                payloadType == other.payloadType &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                source,
                spacecraftId,
                id,
                areaCoverage,
                clockType,
                createdAt,
                createdBy,
                hostedForCompanyOrgId,
                idNavigation,
                locationAccuracy,
                manufacturerOrgId,
                modeFrequency,
                modes,
                name,
                notes,
                origin,
                origNetwork,
                partnerSpacecraftId,
                payloadType,
                updatedAt,
                updatedBy,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SeradataNavigation{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, spacecraftId=$spacecraftId, id=$id, areaCoverage=$areaCoverage, clockType=$clockType, createdAt=$createdAt, createdBy=$createdBy, hostedForCompanyOrgId=$hostedForCompanyOrgId, idNavigation=$idNavigation, locationAccuracy=$locationAccuracy, manufacturerOrgId=$manufacturerOrgId, modeFrequency=$modeFrequency, modes=$modes, name=$name, notes=$notes, origin=$origin, origNetwork=$origNetwork, partnerSpacecraftId=$partnerSpacecraftId, payloadType=$payloadType, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
    }

    /** Details for an optical payload from Seradata. */
    class SeradataOpticalPayload
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val source: JsonField<String>,
        private val spacecraftId: JsonField<String>,
        private val id: JsonField<String>,
        private val bestResolution: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val fieldOfRegard: JsonField<Double>,
        private val fieldOfView: JsonField<Double>,
        private val groundStationLocations: JsonField<String>,
        private val groundStations: JsonField<String>,
        private val hostedForCompanyOrgId: JsonField<String>,
        private val idSensor: JsonField<String>,
        private val imagingPayloadCategory: JsonField<String>,
        private val manufacturerOrgId: JsonField<String>,
        private val name: JsonField<String>,
        private val notes: JsonField<String>,
        private val numberOfFilmReturnCanisters: JsonField<Long>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val pointingMethod: JsonField<String>,
        private val recorderSize: JsonField<String>,
        private val spectralBand: JsonField<String>,
        private val spectralFrequencyLimits: JsonField<String>,
        private val swathWidth: JsonField<Double>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val updatedBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spacecraftId")
            @ExcludeMissing
            spacecraftId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bestResolution")
            @ExcludeMissing
            bestResolution: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fieldOfRegard")
            @ExcludeMissing
            fieldOfRegard: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("fieldOfView")
            @ExcludeMissing
            fieldOfView: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("groundStationLocations")
            @ExcludeMissing
            groundStationLocations: JsonField<String> = JsonMissing.of(),
            @JsonProperty("groundStations")
            @ExcludeMissing
            groundStations: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hostedForCompanyOrgId")
            @ExcludeMissing
            hostedForCompanyOrgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idSensor")
            @ExcludeMissing
            idSensor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("imagingPayloadCategory")
            @ExcludeMissing
            imagingPayloadCategory: JsonField<String> = JsonMissing.of(),
            @JsonProperty("manufacturerOrgId")
            @ExcludeMissing
            manufacturerOrgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("numberOfFilmReturnCanisters")
            @ExcludeMissing
            numberOfFilmReturnCanisters: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pointingMethod")
            @ExcludeMissing
            pointingMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recorderSize")
            @ExcludeMissing
            recorderSize: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spectralBand")
            @ExcludeMissing
            spectralBand: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spectralFrequencyLimits")
            @ExcludeMissing
            spectralFrequencyLimits: JsonField<String> = JsonMissing.of(),
            @JsonProperty("swathWidth")
            @ExcludeMissing
            swathWidth: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedBy")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            source,
            spacecraftId,
            id,
            bestResolution,
            createdAt,
            createdBy,
            fieldOfRegard,
            fieldOfView,
            groundStationLocations,
            groundStations,
            hostedForCompanyOrgId,
            idSensor,
            imagingPayloadCategory,
            manufacturerOrgId,
            name,
            notes,
            numberOfFilmReturnCanisters,
            origin,
            origNetwork,
            pointingMethod,
            recorderSize,
            spectralBand,
            spectralFrequencyLimits,
            swathWidth,
            updatedAt,
            updatedBy,
            mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Seradata ID of the spacecraft (SeradataSpacecraftDetails ID).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun spacecraftId(): String = spacecraftId.getRequired("spacecraftId")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Best resolution.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bestResolution(): Optional<Double> = bestResolution.getOptional("bestResolution")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Field of regard of this radar in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fieldOfRegard(): Optional<Double> = fieldOfRegard.getOptional("fieldOfRegard")

        /**
         * Field of view of this radar in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fieldOfView(): Optional<Double> = fieldOfView.getOptional("fieldOfView")

        /**
         * Ground Station Locations for this payload.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun groundStationLocations(): Optional<String> =
            groundStationLocations.getOptional("groundStationLocations")

        /**
         * Ground Station info for this payload.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun groundStations(): Optional<String> = groundStations.getOptional("groundStations")

        /**
         * Hosted for company/Organization Id.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hostedForCompanyOrgId(): Optional<String> =
            hostedForCompanyOrgId.getOptional("hostedForCompanyOrgId")

        /**
         * UUID of the Sensor record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

        /**
         * Imaging category for this payload, e.g. Multispectral, Infrared, Panchromatic.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun imagingPayloadCategory(): Optional<String> =
            imagingPayloadCategory.getOptional("imagingPayloadCategory")

        /**
         * Manufacturer Organization Id.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun manufacturerOrgId(): Optional<String> =
            manufacturerOrgId.getOptional("manufacturerOrgId")

        /**
         * Sensor name from Seradata, e.g. TOURNESOL, MESSR (Multispectral Self-Scanning
         * Radiometer), AWFI, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Payload notes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Number of film return canisters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numberOfFilmReturnCanisters(): Optional<Long> =
            numberOfFilmReturnCanisters.getOptional("numberOfFilmReturnCanisters")

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Point method for this radar, e.g. Spacecraft.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pointingMethod(): Optional<String> = pointingMethod.getOptional("pointingMethod")

        /**
         * Recorder size.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun recorderSize(): Optional<String> = recorderSize.getOptional("recorderSize")

        /**
         * Spectral Band supported by this payload, e.g. Green, Red, Mid-wave infrared, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun spectralBand(): Optional<String> = spectralBand.getOptional("spectralBand")

        /**
         * Frequency limit for this payload, e.g. 0.51 - 0.59.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun spectralFrequencyLimits(): Optional<String> =
            spectralFrequencyLimits.getOptional("spectralFrequencyLimits")

        /**
         * Swath width in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun swathWidth(): Optional<Double> = swathWidth.getOptional("swathWidth")

        /**
         * Time the row was last updated in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [spacecraftId].
         *
         * Unlike [spacecraftId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spacecraftId")
        @ExcludeMissing
        fun _spacecraftId(): JsonField<String> = spacecraftId

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [bestResolution].
         *
         * Unlike [bestResolution], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bestResolution")
        @ExcludeMissing
        fun _bestResolution(): JsonField<Double> = bestResolution

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
         * Returns the raw JSON value of [fieldOfRegard].
         *
         * Unlike [fieldOfRegard], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fieldOfRegard")
        @ExcludeMissing
        fun _fieldOfRegard(): JsonField<Double> = fieldOfRegard

        /**
         * Returns the raw JSON value of [fieldOfView].
         *
         * Unlike [fieldOfView], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fieldOfView")
        @ExcludeMissing
        fun _fieldOfView(): JsonField<Double> = fieldOfView

        /**
         * Returns the raw JSON value of [groundStationLocations].
         *
         * Unlike [groundStationLocations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("groundStationLocations")
        @ExcludeMissing
        fun _groundStationLocations(): JsonField<String> = groundStationLocations

        /**
         * Returns the raw JSON value of [groundStations].
         *
         * Unlike [groundStations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("groundStations")
        @ExcludeMissing
        fun _groundStations(): JsonField<String> = groundStations

        /**
         * Returns the raw JSON value of [hostedForCompanyOrgId].
         *
         * Unlike [hostedForCompanyOrgId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hostedForCompanyOrgId")
        @ExcludeMissing
        fun _hostedForCompanyOrgId(): JsonField<String> = hostedForCompanyOrgId

        /**
         * Returns the raw JSON value of [idSensor].
         *
         * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

        /**
         * Returns the raw JSON value of [imagingPayloadCategory].
         *
         * Unlike [imagingPayloadCategory], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("imagingPayloadCategory")
        @ExcludeMissing
        fun _imagingPayloadCategory(): JsonField<String> = imagingPayloadCategory

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

        /**
         * Returns the raw JSON value of [numberOfFilmReturnCanisters].
         *
         * Unlike [numberOfFilmReturnCanisters], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("numberOfFilmReturnCanisters")
        @ExcludeMissing
        fun _numberOfFilmReturnCanisters(): JsonField<Long> = numberOfFilmReturnCanisters

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
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [pointingMethod].
         *
         * Unlike [pointingMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pointingMethod")
        @ExcludeMissing
        fun _pointingMethod(): JsonField<String> = pointingMethod

        /**
         * Returns the raw JSON value of [recorderSize].
         *
         * Unlike [recorderSize], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recorderSize")
        @ExcludeMissing
        fun _recorderSize(): JsonField<String> = recorderSize

        /**
         * Returns the raw JSON value of [spectralBand].
         *
         * Unlike [spectralBand], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spectralBand")
        @ExcludeMissing
        fun _spectralBand(): JsonField<String> = spectralBand

        /**
         * Returns the raw JSON value of [spectralFrequencyLimits].
         *
         * Unlike [spectralFrequencyLimits], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("spectralFrequencyLimits")
        @ExcludeMissing
        fun _spectralFrequencyLimits(): JsonField<String> = spectralFrequencyLimits

        /**
         * Returns the raw JSON value of [swathWidth].
         *
         * Unlike [swathWidth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("swathWidth")
        @ExcludeMissing
        fun _swathWidth(): JsonField<Double> = swathWidth

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
             * Returns a mutable builder for constructing an instance of [SeradataOpticalPayload].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * .spacecraftId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SeradataOpticalPayload]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var source: JsonField<String>? = null
            private var spacecraftId: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var bestResolution: JsonField<Double> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var fieldOfRegard: JsonField<Double> = JsonMissing.of()
            private var fieldOfView: JsonField<Double> = JsonMissing.of()
            private var groundStationLocations: JsonField<String> = JsonMissing.of()
            private var groundStations: JsonField<String> = JsonMissing.of()
            private var hostedForCompanyOrgId: JsonField<String> = JsonMissing.of()
            private var idSensor: JsonField<String> = JsonMissing.of()
            private var imagingPayloadCategory: JsonField<String> = JsonMissing.of()
            private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var numberOfFilmReturnCanisters: JsonField<Long> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var pointingMethod: JsonField<String> = JsonMissing.of()
            private var recorderSize: JsonField<String> = JsonMissing.of()
            private var spectralBand: JsonField<String> = JsonMissing.of()
            private var spectralFrequencyLimits: JsonField<String> = JsonMissing.of()
            private var swathWidth: JsonField<Double> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(seradataOpticalPayload: SeradataOpticalPayload) = apply {
                classificationMarking = seradataOpticalPayload.classificationMarking
                dataMode = seradataOpticalPayload.dataMode
                source = seradataOpticalPayload.source
                spacecraftId = seradataOpticalPayload.spacecraftId
                id = seradataOpticalPayload.id
                bestResolution = seradataOpticalPayload.bestResolution
                createdAt = seradataOpticalPayload.createdAt
                createdBy = seradataOpticalPayload.createdBy
                fieldOfRegard = seradataOpticalPayload.fieldOfRegard
                fieldOfView = seradataOpticalPayload.fieldOfView
                groundStationLocations = seradataOpticalPayload.groundStationLocations
                groundStations = seradataOpticalPayload.groundStations
                hostedForCompanyOrgId = seradataOpticalPayload.hostedForCompanyOrgId
                idSensor = seradataOpticalPayload.idSensor
                imagingPayloadCategory = seradataOpticalPayload.imagingPayloadCategory
                manufacturerOrgId = seradataOpticalPayload.manufacturerOrgId
                name = seradataOpticalPayload.name
                notes = seradataOpticalPayload.notes
                numberOfFilmReturnCanisters = seradataOpticalPayload.numberOfFilmReturnCanisters
                origin = seradataOpticalPayload.origin
                origNetwork = seradataOpticalPayload.origNetwork
                pointingMethod = seradataOpticalPayload.pointingMethod
                recorderSize = seradataOpticalPayload.recorderSize
                spectralBand = seradataOpticalPayload.spectralBand
                spectralFrequencyLimits = seradataOpticalPayload.spectralFrequencyLimits
                swathWidth = seradataOpticalPayload.swathWidth
                updatedAt = seradataOpticalPayload.updatedAt
                updatedBy = seradataOpticalPayload.updatedBy
                additionalProperties = seradataOpticalPayload.additionalProperties.toMutableMap()
            }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            /**
             * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Seradata ID of the spacecraft (SeradataSpacecraftDetails ID). */
            fun spacecraftId(spacecraftId: String) = spacecraftId(JsonField.of(spacecraftId))

            /**
             * Sets [Builder.spacecraftId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spacecraftId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spacecraftId(spacecraftId: JsonField<String>) = apply {
                this.spacecraftId = spacecraftId
            }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Best resolution. */
            fun bestResolution(bestResolution: Double) =
                bestResolution(JsonField.of(bestResolution))

            /**
             * Sets [Builder.bestResolution] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bestResolution] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bestResolution(bestResolution: JsonField<Double>) = apply {
                this.bestResolution = bestResolution
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Application user who created the row in the database, auto-populated by the system.
             */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** Field of regard of this radar in degrees. */
            fun fieldOfRegard(fieldOfRegard: Double) = fieldOfRegard(JsonField.of(fieldOfRegard))

            /**
             * Sets [Builder.fieldOfRegard] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldOfRegard] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldOfRegard(fieldOfRegard: JsonField<Double>) = apply {
                this.fieldOfRegard = fieldOfRegard
            }

            /** Field of view of this radar in kilometers. */
            fun fieldOfView(fieldOfView: Double) = fieldOfView(JsonField.of(fieldOfView))

            /**
             * Sets [Builder.fieldOfView] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldOfView] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldOfView(fieldOfView: JsonField<Double>) = apply {
                this.fieldOfView = fieldOfView
            }

            /** Ground Station Locations for this payload. */
            fun groundStationLocations(groundStationLocations: String) =
                groundStationLocations(JsonField.of(groundStationLocations))

            /**
             * Sets [Builder.groundStationLocations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groundStationLocations] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun groundStationLocations(groundStationLocations: JsonField<String>) = apply {
                this.groundStationLocations = groundStationLocations
            }

            /** Ground Station info for this payload. */
            fun groundStations(groundStations: String) =
                groundStations(JsonField.of(groundStations))

            /**
             * Sets [Builder.groundStations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groundStations] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groundStations(groundStations: JsonField<String>) = apply {
                this.groundStations = groundStations
            }

            /** Hosted for company/Organization Id. */
            fun hostedForCompanyOrgId(hostedForCompanyOrgId: String) =
                hostedForCompanyOrgId(JsonField.of(hostedForCompanyOrgId))

            /**
             * Sets [Builder.hostedForCompanyOrgId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hostedForCompanyOrgId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun hostedForCompanyOrgId(hostedForCompanyOrgId: JsonField<String>) = apply {
                this.hostedForCompanyOrgId = hostedForCompanyOrgId
            }

            /** UUID of the Sensor record. */
            fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

            /**
             * Sets [Builder.idSensor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSensor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

            /** Imaging category for this payload, e.g. Multispectral, Infrared, Panchromatic. */
            fun imagingPayloadCategory(imagingPayloadCategory: String) =
                imagingPayloadCategory(JsonField.of(imagingPayloadCategory))

            /**
             * Sets [Builder.imagingPayloadCategory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imagingPayloadCategory] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun imagingPayloadCategory(imagingPayloadCategory: JsonField<String>) = apply {
                this.imagingPayloadCategory = imagingPayloadCategory
            }

            /** Manufacturer Organization Id. */
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

            /**
             * Sensor name from Seradata, e.g. TOURNESOL, MESSR (Multispectral Self-Scanning
             * Radiometer), AWFI, etc.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Payload notes. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            /** Number of film return canisters. */
            fun numberOfFilmReturnCanisters(numberOfFilmReturnCanisters: Long) =
                numberOfFilmReturnCanisters(JsonField.of(numberOfFilmReturnCanisters))

            /**
             * Sets [Builder.numberOfFilmReturnCanisters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numberOfFilmReturnCanisters] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun numberOfFilmReturnCanisters(numberOfFilmReturnCanisters: JsonField<Long>) = apply {
                this.numberOfFilmReturnCanisters = numberOfFilmReturnCanisters
            }

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) = apply {
                this.origNetwork = origNetwork
            }

            /** Point method for this radar, e.g. Spacecraft. */
            fun pointingMethod(pointingMethod: String) =
                pointingMethod(JsonField.of(pointingMethod))

            /**
             * Sets [Builder.pointingMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointingMethod] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pointingMethod(pointingMethod: JsonField<String>) = apply {
                this.pointingMethod = pointingMethod
            }

            /** Recorder size. */
            fun recorderSize(recorderSize: String) = recorderSize(JsonField.of(recorderSize))

            /**
             * Sets [Builder.recorderSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recorderSize] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recorderSize(recorderSize: JsonField<String>) = apply {
                this.recorderSize = recorderSize
            }

            /** Spectral Band supported by this payload, e.g. Green, Red, Mid-wave infrared, etc. */
            fun spectralBand(spectralBand: String) = spectralBand(JsonField.of(spectralBand))

            /**
             * Sets [Builder.spectralBand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spectralBand] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spectralBand(spectralBand: JsonField<String>) = apply {
                this.spectralBand = spectralBand
            }

            /** Frequency limit for this payload, e.g. 0.51 - 0.59. */
            fun spectralFrequencyLimits(spectralFrequencyLimits: String) =
                spectralFrequencyLimits(JsonField.of(spectralFrequencyLimits))

            /**
             * Sets [Builder.spectralFrequencyLimits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spectralFrequencyLimits] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun spectralFrequencyLimits(spectralFrequencyLimits: JsonField<String>) = apply {
                this.spectralFrequencyLimits = spectralFrequencyLimits
            }

            /** Swath width in kilometers. */
            fun swathWidth(swathWidth: Double) = swathWidth(JsonField.of(swathWidth))

            /**
             * Sets [Builder.swathWidth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.swathWidth] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun swathWidth(swathWidth: JsonField<Double>) = apply { this.swathWidth = swathWidth }

            /** Time the row was last updated in the database, auto-populated by the system. */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Application user who updated the row in the database, auto-populated by the system.
             */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [SeradataOpticalPayload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * .spacecraftId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SeradataOpticalPayload =
                SeradataOpticalPayload(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("source", source),
                    checkRequired("spacecraftId", spacecraftId),
                    id,
                    bestResolution,
                    createdAt,
                    createdBy,
                    fieldOfRegard,
                    fieldOfView,
                    groundStationLocations,
                    groundStations,
                    hostedForCompanyOrgId,
                    idSensor,
                    imagingPayloadCategory,
                    manufacturerOrgId,
                    name,
                    notes,
                    numberOfFilmReturnCanisters,
                    origin,
                    origNetwork,
                    pointingMethod,
                    recorderSize,
                    spectralBand,
                    spectralFrequencyLimits,
                    swathWidth,
                    updatedAt,
                    updatedBy,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SeradataOpticalPayload = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            source()
            spacecraftId()
            id()
            bestResolution()
            createdAt()
            createdBy()
            fieldOfRegard()
            fieldOfView()
            groundStationLocations()
            groundStations()
            hostedForCompanyOrgId()
            idSensor()
            imagingPayloadCategory()
            manufacturerOrgId()
            name()
            notes()
            numberOfFilmReturnCanisters()
            origin()
            origNetwork()
            pointingMethod()
            recorderSize()
            spectralBand()
            spectralFrequencyLimits()
            swathWidth()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (spacecraftId.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (bestResolution.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (fieldOfRegard.asKnown().isPresent) 1 else 0) +
                (if (fieldOfView.asKnown().isPresent) 1 else 0) +
                (if (groundStationLocations.asKnown().isPresent) 1 else 0) +
                (if (groundStations.asKnown().isPresent) 1 else 0) +
                (if (hostedForCompanyOrgId.asKnown().isPresent) 1 else 0) +
                (if (idSensor.asKnown().isPresent) 1 else 0) +
                (if (imagingPayloadCategory.asKnown().isPresent) 1 else 0) +
                (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (notes.asKnown().isPresent) 1 else 0) +
                (if (numberOfFilmReturnCanisters.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (pointingMethod.asKnown().isPresent) 1 else 0) +
                (if (recorderSize.asKnown().isPresent) 1 else 0) +
                (if (spectralBand.asKnown().isPresent) 1 else 0) +
                (if (spectralFrequencyLimits.asKnown().isPresent) 1 else 0) +
                (if (swathWidth.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0)

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         */
        class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REAL,
                TEST,
                SIMULATED,
                EXERCISE,
                /**
                 * An enum member indicating that [DataMode] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

            return other is SeradataOpticalPayload &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                source == other.source &&
                spacecraftId == other.spacecraftId &&
                id == other.id &&
                bestResolution == other.bestResolution &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                fieldOfRegard == other.fieldOfRegard &&
                fieldOfView == other.fieldOfView &&
                groundStationLocations == other.groundStationLocations &&
                groundStations == other.groundStations &&
                hostedForCompanyOrgId == other.hostedForCompanyOrgId &&
                idSensor == other.idSensor &&
                imagingPayloadCategory == other.imagingPayloadCategory &&
                manufacturerOrgId == other.manufacturerOrgId &&
                name == other.name &&
                notes == other.notes &&
                numberOfFilmReturnCanisters == other.numberOfFilmReturnCanisters &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                pointingMethod == other.pointingMethod &&
                recorderSize == other.recorderSize &&
                spectralBand == other.spectralBand &&
                spectralFrequencyLimits == other.spectralFrequencyLimits &&
                swathWidth == other.swathWidth &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                source,
                spacecraftId,
                id,
                bestResolution,
                createdAt,
                createdBy,
                fieldOfRegard,
                fieldOfView,
                groundStationLocations,
                groundStations,
                hostedForCompanyOrgId,
                idSensor,
                imagingPayloadCategory,
                manufacturerOrgId,
                name,
                notes,
                numberOfFilmReturnCanisters,
                origin,
                origNetwork,
                pointingMethod,
                recorderSize,
                spectralBand,
                spectralFrequencyLimits,
                swathWidth,
                updatedAt,
                updatedBy,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SeradataOpticalPayload{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, spacecraftId=$spacecraftId, id=$id, bestResolution=$bestResolution, createdAt=$createdAt, createdBy=$createdBy, fieldOfRegard=$fieldOfRegard, fieldOfView=$fieldOfView, groundStationLocations=$groundStationLocations, groundStations=$groundStations, hostedForCompanyOrgId=$hostedForCompanyOrgId, idSensor=$idSensor, imagingPayloadCategory=$imagingPayloadCategory, manufacturerOrgId=$manufacturerOrgId, name=$name, notes=$notes, numberOfFilmReturnCanisters=$numberOfFilmReturnCanisters, origin=$origin, origNetwork=$origNetwork, pointingMethod=$pointingMethod, recorderSize=$recorderSize, spectralBand=$spectralBand, spectralFrequencyLimits=$spectralFrequencyLimits, swathWidth=$swathWidth, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
    }

    /** Details for an radar payload from Seradata. */
    class SeradataRadarPayload
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val source: JsonField<String>,
        private val spacecraftId: JsonField<String>,
        private val id: JsonField<String>,
        private val bandwidth: JsonField<Double>,
        private val bestResolution: JsonField<Double>,
        private val category: JsonField<String>,
        private val constellationInterferometricCapability: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val dutyCycle: JsonField<String>,
        private val fieldOfRegard: JsonField<Double>,
        private val fieldOfView: JsonField<Double>,
        private val frequency: JsonField<Double>,
        private val frequencyBand: JsonField<String>,
        private val groundStationLocations: JsonField<String>,
        private val groundStations: JsonField<String>,
        private val hostedForCompanyOrgId: JsonField<String>,
        private val idSensor: JsonField<String>,
        private val manufacturerOrgId: JsonField<String>,
        private val name: JsonField<String>,
        private val notes: JsonField<String>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val partnerSpacecraft: JsonField<String>,
        private val pointingMethod: JsonField<String>,
        private val receivePolarization: JsonField<String>,
        private val recorderSize: JsonField<String>,
        private val swathWidth: JsonField<Double>,
        private val transmitPolarization: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val updatedBy: JsonField<String>,
        private val waveLength: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spacecraftId")
            @ExcludeMissing
            spacecraftId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bandwidth")
            @ExcludeMissing
            bandwidth: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("bestResolution")
            @ExcludeMissing
            bestResolution: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<String> = JsonMissing.of(),
            @JsonProperty("constellationInterferometricCapability")
            @ExcludeMissing
            constellationInterferometricCapability: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dutyCycle")
            @ExcludeMissing
            dutyCycle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fieldOfRegard")
            @ExcludeMissing
            fieldOfRegard: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("fieldOfView")
            @ExcludeMissing
            fieldOfView: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("frequency")
            @ExcludeMissing
            frequency: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("frequencyBand")
            @ExcludeMissing
            frequencyBand: JsonField<String> = JsonMissing.of(),
            @JsonProperty("groundStationLocations")
            @ExcludeMissing
            groundStationLocations: JsonField<String> = JsonMissing.of(),
            @JsonProperty("groundStations")
            @ExcludeMissing
            groundStations: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hostedForCompanyOrgId")
            @ExcludeMissing
            hostedForCompanyOrgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idSensor")
            @ExcludeMissing
            idSensor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("manufacturerOrgId")
            @ExcludeMissing
            manufacturerOrgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("partnerSpacecraft")
            @ExcludeMissing
            partnerSpacecraft: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pointingMethod")
            @ExcludeMissing
            pointingMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receivePolarization")
            @ExcludeMissing
            receivePolarization: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recorderSize")
            @ExcludeMissing
            recorderSize: JsonField<String> = JsonMissing.of(),
            @JsonProperty("swathWidth")
            @ExcludeMissing
            swathWidth: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("transmitPolarization")
            @ExcludeMissing
            transmitPolarization: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedBy")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("waveLength")
            @ExcludeMissing
            waveLength: JsonField<Double> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            source,
            spacecraftId,
            id,
            bandwidth,
            bestResolution,
            category,
            constellationInterferometricCapability,
            createdAt,
            createdBy,
            dutyCycle,
            fieldOfRegard,
            fieldOfView,
            frequency,
            frequencyBand,
            groundStationLocations,
            groundStations,
            hostedForCompanyOrgId,
            idSensor,
            manufacturerOrgId,
            name,
            notes,
            origin,
            origNetwork,
            partnerSpacecraft,
            pointingMethod,
            receivePolarization,
            recorderSize,
            swathWidth,
            transmitPolarization,
            updatedAt,
            updatedBy,
            waveLength,
            mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Seradata ID of the spacecraft (SeradataSpacecraftDetails ID).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun spacecraftId(): String = spacecraftId.getRequired("spacecraftId")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Radar bandwidth in mega hertz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bandwidth(): Optional<Double> = bandwidth.getOptional("bandwidth")

        /**
         * Best resolution in meters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bestResolution(): Optional<Double> = bestResolution.getOptional("bestResolution")

        /**
         * Radar category, e.g. SAR, Surface Search, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun category(): Optional<String> = category.getOptional("category")

        /**
         * Constellation interferometric capability.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun constellationInterferometricCapability(): Optional<String> =
            constellationInterferometricCapability.getOptional(
                "constellationInterferometricCapability"
            )

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Duty cycle.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dutyCycle(): Optional<String> = dutyCycle.getOptional("dutyCycle")

        /**
         * Field of regard of this radar in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fieldOfRegard(): Optional<Double> = fieldOfRegard.getOptional("fieldOfRegard")

        /**
         * Field of view of this radar in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fieldOfView(): Optional<Double> = fieldOfView.getOptional("fieldOfView")

        /**
         * Frequency in giga hertz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun frequency(): Optional<Double> = frequency.getOptional("frequency")

        /**
         * Name of the band of this RF range (e.g.
         * X,K,Ku,Ka,L,S,C,UHF,VHF,EHF,SHF,UNK,VLF,HF,E,Q,V,W). See RFBandType for more details and
         * descriptions of each band name.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun frequencyBand(): Optional<String> = frequencyBand.getOptional("frequencyBand")

        /**
         * Ground Station Locations for this payload.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun groundStationLocations(): Optional<String> =
            groundStationLocations.getOptional("groundStationLocations")

        /**
         * Ground Station info for this payload.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun groundStations(): Optional<String> = groundStations.getOptional("groundStations")

        /**
         * Hosted for company/Organization Id.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hostedForCompanyOrgId(): Optional<String> =
            hostedForCompanyOrgId.getOptional("hostedForCompanyOrgId")

        /**
         * UUID of the Sensor record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

        /**
         * Manufacturer Organization Id.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun manufacturerOrgId(): Optional<String> =
            manufacturerOrgId.getOptional("manufacturerOrgId")

        /**
         * Sensor name from Seradata, e.g. ALT (Radar Altimeter), COSI (Corea SAR Instrument), etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Payload notes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Partner seradata-spacecraft.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun partnerSpacecraft(): Optional<String> =
            partnerSpacecraft.getOptional("partnerSpacecraft")

        /**
         * Point method for this radar, e.g. Spacecraft.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pointingMethod(): Optional<String> = pointingMethod.getOptional("pointingMethod")

        /**
         * Receive polarization, e.g. Lin Dual, Lin vert, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun receivePolarization(): Optional<String> =
            receivePolarization.getOptional("receivePolarization")

        /**
         * Recorder size, e.g. 256.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun recorderSize(): Optional<String> = recorderSize.getOptional("recorderSize")

        /**
         * Swath width in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun swathWidth(): Optional<Double> = swathWidth.getOptional("swathWidth")

        /**
         * Transmit polarization, e.g. Lin Dual, Lin vert, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun transmitPolarization(): Optional<String> =
            transmitPolarization.getOptional("transmitPolarization")

        /**
         * Time the row was last updated in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Wave length in meters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun waveLength(): Optional<Double> = waveLength.getOptional("waveLength")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [spacecraftId].
         *
         * Unlike [spacecraftId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spacecraftId")
        @ExcludeMissing
        fun _spacecraftId(): JsonField<String> = spacecraftId

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [bandwidth].
         *
         * Unlike [bandwidth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bandwidth") @ExcludeMissing fun _bandwidth(): JsonField<Double> = bandwidth

        /**
         * Returns the raw JSON value of [bestResolution].
         *
         * Unlike [bestResolution], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bestResolution")
        @ExcludeMissing
        fun _bestResolution(): JsonField<Double> = bestResolution

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

        /**
         * Returns the raw JSON value of [constellationInterferometricCapability].
         *
         * Unlike [constellationInterferometricCapability], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("constellationInterferometricCapability")
        @ExcludeMissing
        fun _constellationInterferometricCapability(): JsonField<String> =
            constellationInterferometricCapability

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
         * Returns the raw JSON value of [dutyCycle].
         *
         * Unlike [dutyCycle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dutyCycle") @ExcludeMissing fun _dutyCycle(): JsonField<String> = dutyCycle

        /**
         * Returns the raw JSON value of [fieldOfRegard].
         *
         * Unlike [fieldOfRegard], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fieldOfRegard")
        @ExcludeMissing
        fun _fieldOfRegard(): JsonField<Double> = fieldOfRegard

        /**
         * Returns the raw JSON value of [fieldOfView].
         *
         * Unlike [fieldOfView], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fieldOfView")
        @ExcludeMissing
        fun _fieldOfView(): JsonField<Double> = fieldOfView

        /**
         * Returns the raw JSON value of [frequency].
         *
         * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("frequency") @ExcludeMissing fun _frequency(): JsonField<Double> = frequency

        /**
         * Returns the raw JSON value of [frequencyBand].
         *
         * Unlike [frequencyBand], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("frequencyBand")
        @ExcludeMissing
        fun _frequencyBand(): JsonField<String> = frequencyBand

        /**
         * Returns the raw JSON value of [groundStationLocations].
         *
         * Unlike [groundStationLocations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("groundStationLocations")
        @ExcludeMissing
        fun _groundStationLocations(): JsonField<String> = groundStationLocations

        /**
         * Returns the raw JSON value of [groundStations].
         *
         * Unlike [groundStations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("groundStations")
        @ExcludeMissing
        fun _groundStations(): JsonField<String> = groundStations

        /**
         * Returns the raw JSON value of [hostedForCompanyOrgId].
         *
         * Unlike [hostedForCompanyOrgId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hostedForCompanyOrgId")
        @ExcludeMissing
        fun _hostedForCompanyOrgId(): JsonField<String> = hostedForCompanyOrgId

        /**
         * Returns the raw JSON value of [idSensor].
         *
         * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [partnerSpacecraft].
         *
         * Unlike [partnerSpacecraft], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("partnerSpacecraft")
        @ExcludeMissing
        fun _partnerSpacecraft(): JsonField<String> = partnerSpacecraft

        /**
         * Returns the raw JSON value of [pointingMethod].
         *
         * Unlike [pointingMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pointingMethod")
        @ExcludeMissing
        fun _pointingMethod(): JsonField<String> = pointingMethod

        /**
         * Returns the raw JSON value of [receivePolarization].
         *
         * Unlike [receivePolarization], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("receivePolarization")
        @ExcludeMissing
        fun _receivePolarization(): JsonField<String> = receivePolarization

        /**
         * Returns the raw JSON value of [recorderSize].
         *
         * Unlike [recorderSize], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recorderSize")
        @ExcludeMissing
        fun _recorderSize(): JsonField<String> = recorderSize

        /**
         * Returns the raw JSON value of [swathWidth].
         *
         * Unlike [swathWidth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("swathWidth")
        @ExcludeMissing
        fun _swathWidth(): JsonField<Double> = swathWidth

        /**
         * Returns the raw JSON value of [transmitPolarization].
         *
         * Unlike [transmitPolarization], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transmitPolarization")
        @ExcludeMissing
        fun _transmitPolarization(): JsonField<String> = transmitPolarization

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
         * Returns the raw JSON value of [waveLength].
         *
         * Unlike [waveLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("waveLength")
        @ExcludeMissing
        fun _waveLength(): JsonField<Double> = waveLength

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
             * Returns a mutable builder for constructing an instance of [SeradataRadarPayload].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * .spacecraftId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SeradataRadarPayload]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var source: JsonField<String>? = null
            private var spacecraftId: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var bandwidth: JsonField<Double> = JsonMissing.of()
            private var bestResolution: JsonField<Double> = JsonMissing.of()
            private var category: JsonField<String> = JsonMissing.of()
            private var constellationInterferometricCapability: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var dutyCycle: JsonField<String> = JsonMissing.of()
            private var fieldOfRegard: JsonField<Double> = JsonMissing.of()
            private var fieldOfView: JsonField<Double> = JsonMissing.of()
            private var frequency: JsonField<Double> = JsonMissing.of()
            private var frequencyBand: JsonField<String> = JsonMissing.of()
            private var groundStationLocations: JsonField<String> = JsonMissing.of()
            private var groundStations: JsonField<String> = JsonMissing.of()
            private var hostedForCompanyOrgId: JsonField<String> = JsonMissing.of()
            private var idSensor: JsonField<String> = JsonMissing.of()
            private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var partnerSpacecraft: JsonField<String> = JsonMissing.of()
            private var pointingMethod: JsonField<String> = JsonMissing.of()
            private var receivePolarization: JsonField<String> = JsonMissing.of()
            private var recorderSize: JsonField<String> = JsonMissing.of()
            private var swathWidth: JsonField<Double> = JsonMissing.of()
            private var transmitPolarization: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var waveLength: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(seradataRadarPayload: SeradataRadarPayload) = apply {
                classificationMarking = seradataRadarPayload.classificationMarking
                dataMode = seradataRadarPayload.dataMode
                source = seradataRadarPayload.source
                spacecraftId = seradataRadarPayload.spacecraftId
                id = seradataRadarPayload.id
                bandwidth = seradataRadarPayload.bandwidth
                bestResolution = seradataRadarPayload.bestResolution
                category = seradataRadarPayload.category
                constellationInterferometricCapability =
                    seradataRadarPayload.constellationInterferometricCapability
                createdAt = seradataRadarPayload.createdAt
                createdBy = seradataRadarPayload.createdBy
                dutyCycle = seradataRadarPayload.dutyCycle
                fieldOfRegard = seradataRadarPayload.fieldOfRegard
                fieldOfView = seradataRadarPayload.fieldOfView
                frequency = seradataRadarPayload.frequency
                frequencyBand = seradataRadarPayload.frequencyBand
                groundStationLocations = seradataRadarPayload.groundStationLocations
                groundStations = seradataRadarPayload.groundStations
                hostedForCompanyOrgId = seradataRadarPayload.hostedForCompanyOrgId
                idSensor = seradataRadarPayload.idSensor
                manufacturerOrgId = seradataRadarPayload.manufacturerOrgId
                name = seradataRadarPayload.name
                notes = seradataRadarPayload.notes
                origin = seradataRadarPayload.origin
                origNetwork = seradataRadarPayload.origNetwork
                partnerSpacecraft = seradataRadarPayload.partnerSpacecraft
                pointingMethod = seradataRadarPayload.pointingMethod
                receivePolarization = seradataRadarPayload.receivePolarization
                recorderSize = seradataRadarPayload.recorderSize
                swathWidth = seradataRadarPayload.swathWidth
                transmitPolarization = seradataRadarPayload.transmitPolarization
                updatedAt = seradataRadarPayload.updatedAt
                updatedBy = seradataRadarPayload.updatedBy
                waveLength = seradataRadarPayload.waveLength
                additionalProperties = seradataRadarPayload.additionalProperties.toMutableMap()
            }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            /**
             * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Seradata ID of the spacecraft (SeradataSpacecraftDetails ID). */
            fun spacecraftId(spacecraftId: String) = spacecraftId(JsonField.of(spacecraftId))

            /**
             * Sets [Builder.spacecraftId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spacecraftId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spacecraftId(spacecraftId: JsonField<String>) = apply {
                this.spacecraftId = spacecraftId
            }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Radar bandwidth in mega hertz. */
            fun bandwidth(bandwidth: Double) = bandwidth(JsonField.of(bandwidth))

            /**
             * Sets [Builder.bandwidth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bandwidth] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bandwidth(bandwidth: JsonField<Double>) = apply { this.bandwidth = bandwidth }

            /** Best resolution in meters. */
            fun bestResolution(bestResolution: Double) =
                bestResolution(JsonField.of(bestResolution))

            /**
             * Sets [Builder.bestResolution] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bestResolution] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bestResolution(bestResolution: JsonField<Double>) = apply {
                this.bestResolution = bestResolution
            }

            /** Radar category, e.g. SAR, Surface Search, etc. */
            fun category(category: String) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<String>) = apply { this.category = category }

            /** Constellation interferometric capability. */
            fun constellationInterferometricCapability(
                constellationInterferometricCapability: String
            ) =
                constellationInterferometricCapability(
                    JsonField.of(constellationInterferometricCapability)
                )

            /**
             * Sets [Builder.constellationInterferometricCapability] to an arbitrary JSON value.
             *
             * You should usually call [Builder.constellationInterferometricCapability] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun constellationInterferometricCapability(
                constellationInterferometricCapability: JsonField<String>
            ) = apply {
                this.constellationInterferometricCapability = constellationInterferometricCapability
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Application user who created the row in the database, auto-populated by the system.
             */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** Duty cycle. */
            fun dutyCycle(dutyCycle: String) = dutyCycle(JsonField.of(dutyCycle))

            /**
             * Sets [Builder.dutyCycle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dutyCycle] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dutyCycle(dutyCycle: JsonField<String>) = apply { this.dutyCycle = dutyCycle }

            /** Field of regard of this radar in degrees. */
            fun fieldOfRegard(fieldOfRegard: Double) = fieldOfRegard(JsonField.of(fieldOfRegard))

            /**
             * Sets [Builder.fieldOfRegard] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldOfRegard] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldOfRegard(fieldOfRegard: JsonField<Double>) = apply {
                this.fieldOfRegard = fieldOfRegard
            }

            /** Field of view of this radar in kilometers. */
            fun fieldOfView(fieldOfView: Double) = fieldOfView(JsonField.of(fieldOfView))

            /**
             * Sets [Builder.fieldOfView] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldOfView] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldOfView(fieldOfView: JsonField<Double>) = apply {
                this.fieldOfView = fieldOfView
            }

            /** Frequency in giga hertz. */
            fun frequency(frequency: Double) = frequency(JsonField.of(frequency))

            /**
             * Sets [Builder.frequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequency] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frequency(frequency: JsonField<Double>) = apply { this.frequency = frequency }

            /**
             * Name of the band of this RF range (e.g.
             * X,K,Ku,Ka,L,S,C,UHF,VHF,EHF,SHF,UNK,VLF,HF,E,Q,V,W). See RFBandType for more details
             * and descriptions of each band name.
             */
            fun frequencyBand(frequencyBand: String) = frequencyBand(JsonField.of(frequencyBand))

            /**
             * Sets [Builder.frequencyBand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequencyBand] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frequencyBand(frequencyBand: JsonField<String>) = apply {
                this.frequencyBand = frequencyBand
            }

            /** Ground Station Locations for this payload. */
            fun groundStationLocations(groundStationLocations: String) =
                groundStationLocations(JsonField.of(groundStationLocations))

            /**
             * Sets [Builder.groundStationLocations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groundStationLocations] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun groundStationLocations(groundStationLocations: JsonField<String>) = apply {
                this.groundStationLocations = groundStationLocations
            }

            /** Ground Station info for this payload. */
            fun groundStations(groundStations: String) =
                groundStations(JsonField.of(groundStations))

            /**
             * Sets [Builder.groundStations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groundStations] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groundStations(groundStations: JsonField<String>) = apply {
                this.groundStations = groundStations
            }

            /** Hosted for company/Organization Id. */
            fun hostedForCompanyOrgId(hostedForCompanyOrgId: String) =
                hostedForCompanyOrgId(JsonField.of(hostedForCompanyOrgId))

            /**
             * Sets [Builder.hostedForCompanyOrgId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hostedForCompanyOrgId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun hostedForCompanyOrgId(hostedForCompanyOrgId: JsonField<String>) = apply {
                this.hostedForCompanyOrgId = hostedForCompanyOrgId
            }

            /** UUID of the Sensor record. */
            fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

            /**
             * Sets [Builder.idSensor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSensor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

            /** Manufacturer Organization Id. */
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

            /**
             * Sensor name from Seradata, e.g. ALT (Radar Altimeter), COSI (Corea SAR Instrument),
             * etc.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Payload notes. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) = apply {
                this.origNetwork = origNetwork
            }

            /** Partner seradata-spacecraft. */
            fun partnerSpacecraft(partnerSpacecraft: String) =
                partnerSpacecraft(JsonField.of(partnerSpacecraft))

            /**
             * Sets [Builder.partnerSpacecraft] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partnerSpacecraft] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partnerSpacecraft(partnerSpacecraft: JsonField<String>) = apply {
                this.partnerSpacecraft = partnerSpacecraft
            }

            /** Point method for this radar, e.g. Spacecraft. */
            fun pointingMethod(pointingMethod: String) =
                pointingMethod(JsonField.of(pointingMethod))

            /**
             * Sets [Builder.pointingMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointingMethod] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pointingMethod(pointingMethod: JsonField<String>) = apply {
                this.pointingMethod = pointingMethod
            }

            /** Receive polarization, e.g. Lin Dual, Lin vert, etc. */
            fun receivePolarization(receivePolarization: String) =
                receivePolarization(JsonField.of(receivePolarization))

            /**
             * Sets [Builder.receivePolarization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receivePolarization] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun receivePolarization(receivePolarization: JsonField<String>) = apply {
                this.receivePolarization = receivePolarization
            }

            /** Recorder size, e.g. 256. */
            fun recorderSize(recorderSize: String) = recorderSize(JsonField.of(recorderSize))

            /**
             * Sets [Builder.recorderSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recorderSize] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recorderSize(recorderSize: JsonField<String>) = apply {
                this.recorderSize = recorderSize
            }

            /** Swath width in kilometers. */
            fun swathWidth(swathWidth: Double) = swathWidth(JsonField.of(swathWidth))

            /**
             * Sets [Builder.swathWidth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.swathWidth] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun swathWidth(swathWidth: JsonField<Double>) = apply { this.swathWidth = swathWidth }

            /** Transmit polarization, e.g. Lin Dual, Lin vert, etc. */
            fun transmitPolarization(transmitPolarization: String) =
                transmitPolarization(JsonField.of(transmitPolarization))

            /**
             * Sets [Builder.transmitPolarization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transmitPolarization] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transmitPolarization(transmitPolarization: JsonField<String>) = apply {
                this.transmitPolarization = transmitPolarization
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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Application user who updated the row in the database, auto-populated by the system.
             */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

            /** Wave length in meters. */
            fun waveLength(waveLength: Double) = waveLength(JsonField.of(waveLength))

            /**
             * Sets [Builder.waveLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waveLength] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waveLength(waveLength: JsonField<Double>) = apply { this.waveLength = waveLength }

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
             * Returns an immutable instance of [SeradataRadarPayload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * .spacecraftId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SeradataRadarPayload =
                SeradataRadarPayload(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("source", source),
                    checkRequired("spacecraftId", spacecraftId),
                    id,
                    bandwidth,
                    bestResolution,
                    category,
                    constellationInterferometricCapability,
                    createdAt,
                    createdBy,
                    dutyCycle,
                    fieldOfRegard,
                    fieldOfView,
                    frequency,
                    frequencyBand,
                    groundStationLocations,
                    groundStations,
                    hostedForCompanyOrgId,
                    idSensor,
                    manufacturerOrgId,
                    name,
                    notes,
                    origin,
                    origNetwork,
                    partnerSpacecraft,
                    pointingMethod,
                    receivePolarization,
                    recorderSize,
                    swathWidth,
                    transmitPolarization,
                    updatedAt,
                    updatedBy,
                    waveLength,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SeradataRadarPayload = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            source()
            spacecraftId()
            id()
            bandwidth()
            bestResolution()
            category()
            constellationInterferometricCapability()
            createdAt()
            createdBy()
            dutyCycle()
            fieldOfRegard()
            fieldOfView()
            frequency()
            frequencyBand()
            groundStationLocations()
            groundStations()
            hostedForCompanyOrgId()
            idSensor()
            manufacturerOrgId()
            name()
            notes()
            origin()
            origNetwork()
            partnerSpacecraft()
            pointingMethod()
            receivePolarization()
            recorderSize()
            swathWidth()
            transmitPolarization()
            updatedAt()
            updatedBy()
            waveLength()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (spacecraftId.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (bandwidth.asKnown().isPresent) 1 else 0) +
                (if (bestResolution.asKnown().isPresent) 1 else 0) +
                (if (category.asKnown().isPresent) 1 else 0) +
                (if (constellationInterferometricCapability.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (dutyCycle.asKnown().isPresent) 1 else 0) +
                (if (fieldOfRegard.asKnown().isPresent) 1 else 0) +
                (if (fieldOfView.asKnown().isPresent) 1 else 0) +
                (if (frequency.asKnown().isPresent) 1 else 0) +
                (if (frequencyBand.asKnown().isPresent) 1 else 0) +
                (if (groundStationLocations.asKnown().isPresent) 1 else 0) +
                (if (groundStations.asKnown().isPresent) 1 else 0) +
                (if (hostedForCompanyOrgId.asKnown().isPresent) 1 else 0) +
                (if (idSensor.asKnown().isPresent) 1 else 0) +
                (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (notes.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (partnerSpacecraft.asKnown().isPresent) 1 else 0) +
                (if (pointingMethod.asKnown().isPresent) 1 else 0) +
                (if (receivePolarization.asKnown().isPresent) 1 else 0) +
                (if (recorderSize.asKnown().isPresent) 1 else 0) +
                (if (swathWidth.asKnown().isPresent) 1 else 0) +
                (if (transmitPolarization.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0) +
                (if (waveLength.asKnown().isPresent) 1 else 0)

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         */
        class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REAL,
                TEST,
                SIMULATED,
                EXERCISE,
                /**
                 * An enum member indicating that [DataMode] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

            return other is SeradataRadarPayload &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                source == other.source &&
                spacecraftId == other.spacecraftId &&
                id == other.id &&
                bandwidth == other.bandwidth &&
                bestResolution == other.bestResolution &&
                category == other.category &&
                constellationInterferometricCapability ==
                    other.constellationInterferometricCapability &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                dutyCycle == other.dutyCycle &&
                fieldOfRegard == other.fieldOfRegard &&
                fieldOfView == other.fieldOfView &&
                frequency == other.frequency &&
                frequencyBand == other.frequencyBand &&
                groundStationLocations == other.groundStationLocations &&
                groundStations == other.groundStations &&
                hostedForCompanyOrgId == other.hostedForCompanyOrgId &&
                idSensor == other.idSensor &&
                manufacturerOrgId == other.manufacturerOrgId &&
                name == other.name &&
                notes == other.notes &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                partnerSpacecraft == other.partnerSpacecraft &&
                pointingMethod == other.pointingMethod &&
                receivePolarization == other.receivePolarization &&
                recorderSize == other.recorderSize &&
                swathWidth == other.swathWidth &&
                transmitPolarization == other.transmitPolarization &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy &&
                waveLength == other.waveLength &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                source,
                spacecraftId,
                id,
                bandwidth,
                bestResolution,
                category,
                constellationInterferometricCapability,
                createdAt,
                createdBy,
                dutyCycle,
                fieldOfRegard,
                fieldOfView,
                frequency,
                frequencyBand,
                groundStationLocations,
                groundStations,
                hostedForCompanyOrgId,
                idSensor,
                manufacturerOrgId,
                name,
                notes,
                origin,
                origNetwork,
                partnerSpacecraft,
                pointingMethod,
                receivePolarization,
                recorderSize,
                swathWidth,
                transmitPolarization,
                updatedAt,
                updatedBy,
                waveLength,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SeradataRadarPayload{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, spacecraftId=$spacecraftId, id=$id, bandwidth=$bandwidth, bestResolution=$bestResolution, category=$category, constellationInterferometricCapability=$constellationInterferometricCapability, createdAt=$createdAt, createdBy=$createdBy, dutyCycle=$dutyCycle, fieldOfRegard=$fieldOfRegard, fieldOfView=$fieldOfView, frequency=$frequency, frequencyBand=$frequencyBand, groundStationLocations=$groundStationLocations, groundStations=$groundStations, hostedForCompanyOrgId=$hostedForCompanyOrgId, idSensor=$idSensor, manufacturerOrgId=$manufacturerOrgId, name=$name, notes=$notes, origin=$origin, origNetwork=$origNetwork, partnerSpacecraft=$partnerSpacecraft, pointingMethod=$pointingMethod, receivePolarization=$receivePolarization, recorderSize=$recorderSize, swathWidth=$swathWidth, transmitPolarization=$transmitPolarization, updatedAt=$updatedAt, updatedBy=$updatedBy, waveLength=$waveLength, additionalProperties=$additionalProperties}"
    }

    /** Details for an sigint payload from Seradata. */
    class SeradataSigIntPayload
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val source: JsonField<String>,
        private val spacecraftId: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val frequencyCoverage: JsonField<String>,
        private val groundStationLocations: JsonField<String>,
        private val groundStations: JsonField<String>,
        private val hostedForCompanyOrgId: JsonField<String>,
        private val idSensor: JsonField<String>,
        private val interceptParameters: JsonField<String>,
        private val manufacturerOrgId: JsonField<String>,
        private val name: JsonField<String>,
        private val notes: JsonField<String>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val positionalAccuracy: JsonField<String>,
        private val swathWidth: JsonField<Double>,
        private val type: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val updatedBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spacecraftId")
            @ExcludeMissing
            spacecraftId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("frequencyCoverage")
            @ExcludeMissing
            frequencyCoverage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("groundStationLocations")
            @ExcludeMissing
            groundStationLocations: JsonField<String> = JsonMissing.of(),
            @JsonProperty("groundStations")
            @ExcludeMissing
            groundStations: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hostedForCompanyOrgId")
            @ExcludeMissing
            hostedForCompanyOrgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idSensor")
            @ExcludeMissing
            idSensor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("interceptParameters")
            @ExcludeMissing
            interceptParameters: JsonField<String> = JsonMissing.of(),
            @JsonProperty("manufacturerOrgId")
            @ExcludeMissing
            manufacturerOrgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("positionalAccuracy")
            @ExcludeMissing
            positionalAccuracy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("swathWidth")
            @ExcludeMissing
            swathWidth: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedBy")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            source,
            spacecraftId,
            id,
            createdAt,
            createdBy,
            frequencyCoverage,
            groundStationLocations,
            groundStations,
            hostedForCompanyOrgId,
            idSensor,
            interceptParameters,
            manufacturerOrgId,
            name,
            notes,
            origin,
            origNetwork,
            positionalAccuracy,
            swathWidth,
            type,
            updatedAt,
            updatedBy,
            mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Seradata ID of the spacecraft (SeradataSpacecraftDetails ID).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun spacecraftId(): String = spacecraftId.getRequired("spacecraftId")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Frequency coverage for this payload.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun frequencyCoverage(): Optional<String> =
            frequencyCoverage.getOptional("frequencyCoverage")

        /**
         * Ground Station Locations for this payload.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun groundStationLocations(): Optional<String> =
            groundStationLocations.getOptional("groundStationLocations")

        /**
         * Ground Station info for this payload.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun groundStations(): Optional<String> = groundStations.getOptional("groundStations")

        /**
         * Hosted for company/Organization Id.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hostedForCompanyOrgId(): Optional<String> =
            hostedForCompanyOrgId.getOptional("hostedForCompanyOrgId")

        /**
         * UUID of the Sensor record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

        /**
         * Intercept parameters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun interceptParameters(): Optional<String> =
            interceptParameters.getOptional("interceptParameters")

        /**
         * Manufacturer Organization Id.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun manufacturerOrgId(): Optional<String> =
            manufacturerOrgId.getOptional("manufacturerOrgId")

        /**
         * Sensor name from Seradata.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Payload notes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Positional Accuracy for this payload.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun positionalAccuracy(): Optional<String> =
            positionalAccuracy.getOptional("positionalAccuracy")

        /**
         * Swath Width in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun swathWidth(): Optional<Double> = swathWidth.getOptional("swathWidth")

        /**
         * SIGINT Payload type, e.g. Comint, Elint, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Time the row was last updated in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [spacecraftId].
         *
         * Unlike [spacecraftId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spacecraftId")
        @ExcludeMissing
        fun _spacecraftId(): JsonField<String> = spacecraftId

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * Returns the raw JSON value of [frequencyCoverage].
         *
         * Unlike [frequencyCoverage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("frequencyCoverage")
        @ExcludeMissing
        fun _frequencyCoverage(): JsonField<String> = frequencyCoverage

        /**
         * Returns the raw JSON value of [groundStationLocations].
         *
         * Unlike [groundStationLocations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("groundStationLocations")
        @ExcludeMissing
        fun _groundStationLocations(): JsonField<String> = groundStationLocations

        /**
         * Returns the raw JSON value of [groundStations].
         *
         * Unlike [groundStations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("groundStations")
        @ExcludeMissing
        fun _groundStations(): JsonField<String> = groundStations

        /**
         * Returns the raw JSON value of [hostedForCompanyOrgId].
         *
         * Unlike [hostedForCompanyOrgId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hostedForCompanyOrgId")
        @ExcludeMissing
        fun _hostedForCompanyOrgId(): JsonField<String> = hostedForCompanyOrgId

        /**
         * Returns the raw JSON value of [idSensor].
         *
         * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

        /**
         * Returns the raw JSON value of [interceptParameters].
         *
         * Unlike [interceptParameters], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("interceptParameters")
        @ExcludeMissing
        fun _interceptParameters(): JsonField<String> = interceptParameters

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [positionalAccuracy].
         *
         * Unlike [positionalAccuracy], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("positionalAccuracy")
        @ExcludeMissing
        fun _positionalAccuracy(): JsonField<String> = positionalAccuracy

        /**
         * Returns the raw JSON value of [swathWidth].
         *
         * Unlike [swathWidth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("swathWidth")
        @ExcludeMissing
        fun _swathWidth(): JsonField<Double> = swathWidth

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
             * Returns a mutable builder for constructing an instance of [SeradataSigIntPayload].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * .spacecraftId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SeradataSigIntPayload]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var source: JsonField<String>? = null
            private var spacecraftId: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var frequencyCoverage: JsonField<String> = JsonMissing.of()
            private var groundStationLocations: JsonField<String> = JsonMissing.of()
            private var groundStations: JsonField<String> = JsonMissing.of()
            private var hostedForCompanyOrgId: JsonField<String> = JsonMissing.of()
            private var idSensor: JsonField<String> = JsonMissing.of()
            private var interceptParameters: JsonField<String> = JsonMissing.of()
            private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var positionalAccuracy: JsonField<String> = JsonMissing.of()
            private var swathWidth: JsonField<Double> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(seradataSigIntPayload: SeradataSigIntPayload) = apply {
                classificationMarking = seradataSigIntPayload.classificationMarking
                dataMode = seradataSigIntPayload.dataMode
                source = seradataSigIntPayload.source
                spacecraftId = seradataSigIntPayload.spacecraftId
                id = seradataSigIntPayload.id
                createdAt = seradataSigIntPayload.createdAt
                createdBy = seradataSigIntPayload.createdBy
                frequencyCoverage = seradataSigIntPayload.frequencyCoverage
                groundStationLocations = seradataSigIntPayload.groundStationLocations
                groundStations = seradataSigIntPayload.groundStations
                hostedForCompanyOrgId = seradataSigIntPayload.hostedForCompanyOrgId
                idSensor = seradataSigIntPayload.idSensor
                interceptParameters = seradataSigIntPayload.interceptParameters
                manufacturerOrgId = seradataSigIntPayload.manufacturerOrgId
                name = seradataSigIntPayload.name
                notes = seradataSigIntPayload.notes
                origin = seradataSigIntPayload.origin
                origNetwork = seradataSigIntPayload.origNetwork
                positionalAccuracy = seradataSigIntPayload.positionalAccuracy
                swathWidth = seradataSigIntPayload.swathWidth
                type = seradataSigIntPayload.type
                updatedAt = seradataSigIntPayload.updatedAt
                updatedBy = seradataSigIntPayload.updatedBy
                additionalProperties = seradataSigIntPayload.additionalProperties.toMutableMap()
            }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            /**
             * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Seradata ID of the spacecraft (SeradataSpacecraftDetails ID). */
            fun spacecraftId(spacecraftId: String) = spacecraftId(JsonField.of(spacecraftId))

            /**
             * Sets [Builder.spacecraftId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spacecraftId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spacecraftId(spacecraftId: JsonField<String>) = apply {
                this.spacecraftId = spacecraftId
            }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Time the row was created in the database, auto-populated by the system. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Application user who created the row in the database, auto-populated by the system.
             */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** Frequency coverage for this payload. */
            fun frequencyCoverage(frequencyCoverage: String) =
                frequencyCoverage(JsonField.of(frequencyCoverage))

            /**
             * Sets [Builder.frequencyCoverage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequencyCoverage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frequencyCoverage(frequencyCoverage: JsonField<String>) = apply {
                this.frequencyCoverage = frequencyCoverage
            }

            /** Ground Station Locations for this payload. */
            fun groundStationLocations(groundStationLocations: String) =
                groundStationLocations(JsonField.of(groundStationLocations))

            /**
             * Sets [Builder.groundStationLocations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groundStationLocations] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun groundStationLocations(groundStationLocations: JsonField<String>) = apply {
                this.groundStationLocations = groundStationLocations
            }

            /** Ground Station info for this payload. */
            fun groundStations(groundStations: String) =
                groundStations(JsonField.of(groundStations))

            /**
             * Sets [Builder.groundStations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groundStations] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groundStations(groundStations: JsonField<String>) = apply {
                this.groundStations = groundStations
            }

            /** Hosted for company/Organization Id. */
            fun hostedForCompanyOrgId(hostedForCompanyOrgId: String) =
                hostedForCompanyOrgId(JsonField.of(hostedForCompanyOrgId))

            /**
             * Sets [Builder.hostedForCompanyOrgId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hostedForCompanyOrgId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun hostedForCompanyOrgId(hostedForCompanyOrgId: JsonField<String>) = apply {
                this.hostedForCompanyOrgId = hostedForCompanyOrgId
            }

            /** UUID of the Sensor record. */
            fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

            /**
             * Sets [Builder.idSensor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSensor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

            /** Intercept parameters. */
            fun interceptParameters(interceptParameters: String) =
                interceptParameters(JsonField.of(interceptParameters))

            /**
             * Sets [Builder.interceptParameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interceptParameters] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun interceptParameters(interceptParameters: JsonField<String>) = apply {
                this.interceptParameters = interceptParameters
            }

            /** Manufacturer Organization Id. */
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

            /** Sensor name from Seradata. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Payload notes. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) = apply {
                this.origNetwork = origNetwork
            }

            /** Positional Accuracy for this payload. */
            fun positionalAccuracy(positionalAccuracy: String) =
                positionalAccuracy(JsonField.of(positionalAccuracy))

            /**
             * Sets [Builder.positionalAccuracy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.positionalAccuracy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun positionalAccuracy(positionalAccuracy: JsonField<String>) = apply {
                this.positionalAccuracy = positionalAccuracy
            }

            /** Swath Width in kilometers. */
            fun swathWidth(swathWidth: Double) = swathWidth(JsonField.of(swathWidth))

            /**
             * Sets [Builder.swathWidth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.swathWidth] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun swathWidth(swathWidth: JsonField<Double>) = apply { this.swathWidth = swathWidth }

            /** SIGINT Payload type, e.g. Comint, Elint, etc. */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Application user who updated the row in the database, auto-populated by the system.
             */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [SeradataSigIntPayload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * .spacecraftId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SeradataSigIntPayload =
                SeradataSigIntPayload(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("source", source),
                    checkRequired("spacecraftId", spacecraftId),
                    id,
                    createdAt,
                    createdBy,
                    frequencyCoverage,
                    groundStationLocations,
                    groundStations,
                    hostedForCompanyOrgId,
                    idSensor,
                    interceptParameters,
                    manufacturerOrgId,
                    name,
                    notes,
                    origin,
                    origNetwork,
                    positionalAccuracy,
                    swathWidth,
                    type,
                    updatedAt,
                    updatedBy,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SeradataSigIntPayload = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            source()
            spacecraftId()
            id()
            createdAt()
            createdBy()
            frequencyCoverage()
            groundStationLocations()
            groundStations()
            hostedForCompanyOrgId()
            idSensor()
            interceptParameters()
            manufacturerOrgId()
            name()
            notes()
            origin()
            origNetwork()
            positionalAccuracy()
            swathWidth()
            type()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (spacecraftId.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (frequencyCoverage.asKnown().isPresent) 1 else 0) +
                (if (groundStationLocations.asKnown().isPresent) 1 else 0) +
                (if (groundStations.asKnown().isPresent) 1 else 0) +
                (if (hostedForCompanyOrgId.asKnown().isPresent) 1 else 0) +
                (if (idSensor.asKnown().isPresent) 1 else 0) +
                (if (interceptParameters.asKnown().isPresent) 1 else 0) +
                (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (notes.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (positionalAccuracy.asKnown().isPresent) 1 else 0) +
                (if (swathWidth.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0)

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         */
        class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REAL,
                TEST,
                SIMULATED,
                EXERCISE,
                /**
                 * An enum member indicating that [DataMode] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

            return other is SeradataSigIntPayload &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                source == other.source &&
                spacecraftId == other.spacecraftId &&
                id == other.id &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                frequencyCoverage == other.frequencyCoverage &&
                groundStationLocations == other.groundStationLocations &&
                groundStations == other.groundStations &&
                hostedForCompanyOrgId == other.hostedForCompanyOrgId &&
                idSensor == other.idSensor &&
                interceptParameters == other.interceptParameters &&
                manufacturerOrgId == other.manufacturerOrgId &&
                name == other.name &&
                notes == other.notes &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                positionalAccuracy == other.positionalAccuracy &&
                swathWidth == other.swathWidth &&
                type == other.type &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                source,
                spacecraftId,
                id,
                createdAt,
                createdBy,
                frequencyCoverage,
                groundStationLocations,
                groundStations,
                hostedForCompanyOrgId,
                idSensor,
                interceptParameters,
                manufacturerOrgId,
                name,
                notes,
                origin,
                origNetwork,
                positionalAccuracy,
                swathWidth,
                type,
                updatedAt,
                updatedBy,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SeradataSigIntPayload{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, spacecraftId=$spacecraftId, id=$id, createdAt=$createdAt, createdBy=$createdBy, frequencyCoverage=$frequencyCoverage, groundStationLocations=$groundStationLocations, groundStations=$groundStations, hostedForCompanyOrgId=$hostedForCompanyOrgId, idSensor=$idSensor, interceptParameters=$interceptParameters, manufacturerOrgId=$manufacturerOrgId, name=$name, notes=$notes, origin=$origin, origNetwork=$origNetwork, positionalAccuracy=$positionalAccuracy, swathWidth=$swathWidth, type=$type, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SeradataSpacecraftDetailTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            name == other.name &&
            source == other.source &&
            id == other.id &&
            additionalMissionsGroups == other.additionalMissionsGroups &&
            altitude == other.altitude &&
            annualInsuredDepreciationFactor == other.annualInsuredDepreciationFactor &&
            annualInsuredDepreciationFactorEstimated ==
                other.annualInsuredDepreciationFactorEstimated &&
            apogee == other.apogee &&
            busId == other.busId &&
            capabilityLost == other.capabilityLost &&
            capacityLost == other.capacityLost &&
            catalogNumber == other.catalogNumber &&
            collisionRiskCm == other.collisionRiskCm &&
            collisionRiskMm == other.collisionRiskMm &&
            combinedCostEstimated == other.combinedCostEstimated &&
            combinedNewCost == other.combinedNewCost &&
            commercialLaunch == other.commercialLaunch &&
            constellation == other.constellation &&
            costEstimated == other.costEstimated &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            cubesatDispenserType == other.cubesatDispenserType &&
            currentAge == other.currentAge &&
            dateOfObservation == other.dateOfObservation &&
            description == other.description &&
            designLife == other.designLife &&
            dryMass == other.dryMass &&
            expectedLife == other.expectedLife &&
            geoPosition == other.geoPosition &&
            idOnOrbit == other.idOnOrbit &&
            inclination == other.inclination &&
            insuranceLossesTotal == other.insuranceLossesTotal &&
            insuranceNotes == other.insuranceNotes &&
            insurancePremiumAtLaunch == other.insurancePremiumAtLaunch &&
            insurancePremiumAtLaunchEstimated == other.insurancePremiumAtLaunchEstimated &&
            insuredAtLaunch == other.insuredAtLaunch &&
            insuredValueAtLaunch == other.insuredValueAtLaunch &&
            insuredValueLaunchEstimated == other.insuredValueLaunchEstimated &&
            intlNumber == other.intlNumber &&
            lat == other.lat &&
            launchArranger == other.launchArranger &&
            launchArrangerCountry == other.launchArrangerCountry &&
            launchCharacteristic == other.launchCharacteristic &&
            launchCost == other.launchCost &&
            launchCostEstimated == other.launchCostEstimated &&
            launchCountry == other.launchCountry &&
            launchDate == other.launchDate &&
            launchDateRemarks == other.launchDateRemarks &&
            launchId == other.launchId &&
            launchMass == other.launchMass &&
            launchNotes == other.launchNotes &&
            launchNumber == other.launchNumber &&
            launchProvider == other.launchProvider &&
            launchProviderCountry == other.launchProviderCountry &&
            launchProviderFlightNumber == other.launchProviderFlightNumber &&
            launchSiteId == other.launchSiteId &&
            launchSiteName == other.launchSiteName &&
            launchType == other.launchType &&
            launchVehicleId == other.launchVehicleId &&
            leased == other.leased &&
            lifeLost == other.lifeLost &&
            lon == other.lon &&
            massCategory == other.massCategory &&
            nameAtLaunch == other.nameAtLaunch &&
            newCost == other.newCost &&
            notes == other.notes &&
            numHumans == other.numHumans &&
            onOrbit == other.onOrbit &&
            operator == other.operator &&
            operatorCountry == other.operatorCountry &&
            orbitCategory == other.orbitCategory &&
            orbitSubCategory == other.orbitSubCategory &&
            orderDate == other.orderDate &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            owner == other.owner &&
            ownerCountry == other.ownerCountry &&
            perigee == other.perigee &&
            period == other.period &&
            primaryMissionGroup == other.primaryMissionGroup &&
            primeManufacturerOrgId == other.primeManufacturerOrgId &&
            programName == other.programName &&
            quantity == other.quantity &&
            reusableFlights == other.reusableFlights &&
            reusedHullName == other.reusedHullName &&
            scientific == other.scientific &&
            sector == other.sector &&
            seradataCommDetails == other.seradataCommDetails &&
            seradataEarlyWarning == other.seradataEarlyWarning &&
            seradataNavigation == other.seradataNavigation &&
            seradataOpticalPayload == other.seradataOpticalPayload &&
            seradataRadarPayload == other.seradataRadarPayload &&
            seradataSigIntPayload == other.seradataSigIntPayload &&
            serialNumber == other.serialNumber &&
            stabilizer == other.stabilizer &&
            status == other.status &&
            totalClaims == other.totalClaims &&
            totalFatalities == other.totalFatalities &&
            totalInjuries == other.totalInjuries &&
            totalPayloadPower == other.totalPayloadPower &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            youtubeLaunchLink == other.youtubeLaunchLink &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
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
            onOrbit,
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
            scientific,
            sector,
            seradataCommDetails,
            seradataEarlyWarning,
            seradataNavigation,
            seradataOpticalPayload,
            seradataRadarPayload,
            seradataSigIntPayload,
            serialNumber,
            stabilizer,
            status,
            totalClaims,
            totalFatalities,
            totalInjuries,
            totalPayloadPower,
            updatedAt,
            updatedBy,
            youtubeLaunchLink,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SeradataSpacecraftDetailTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, name=$name, source=$source, id=$id, additionalMissionsGroups=$additionalMissionsGroups, altitude=$altitude, annualInsuredDepreciationFactor=$annualInsuredDepreciationFactor, annualInsuredDepreciationFactorEstimated=$annualInsuredDepreciationFactorEstimated, apogee=$apogee, busId=$busId, capabilityLost=$capabilityLost, capacityLost=$capacityLost, catalogNumber=$catalogNumber, collisionRiskCm=$collisionRiskCm, collisionRiskMm=$collisionRiskMm, combinedCostEstimated=$combinedCostEstimated, combinedNewCost=$combinedNewCost, commercialLaunch=$commercialLaunch, constellation=$constellation, costEstimated=$costEstimated, createdAt=$createdAt, createdBy=$createdBy, cubesatDispenserType=$cubesatDispenserType, currentAge=$currentAge, dateOfObservation=$dateOfObservation, description=$description, designLife=$designLife, dryMass=$dryMass, expectedLife=$expectedLife, geoPosition=$geoPosition, idOnOrbit=$idOnOrbit, inclination=$inclination, insuranceLossesTotal=$insuranceLossesTotal, insuranceNotes=$insuranceNotes, insurancePremiumAtLaunch=$insurancePremiumAtLaunch, insurancePremiumAtLaunchEstimated=$insurancePremiumAtLaunchEstimated, insuredAtLaunch=$insuredAtLaunch, insuredValueAtLaunch=$insuredValueAtLaunch, insuredValueLaunchEstimated=$insuredValueLaunchEstimated, intlNumber=$intlNumber, lat=$lat, launchArranger=$launchArranger, launchArrangerCountry=$launchArrangerCountry, launchCharacteristic=$launchCharacteristic, launchCost=$launchCost, launchCostEstimated=$launchCostEstimated, launchCountry=$launchCountry, launchDate=$launchDate, launchDateRemarks=$launchDateRemarks, launchId=$launchId, launchMass=$launchMass, launchNotes=$launchNotes, launchNumber=$launchNumber, launchProvider=$launchProvider, launchProviderCountry=$launchProviderCountry, launchProviderFlightNumber=$launchProviderFlightNumber, launchSiteId=$launchSiteId, launchSiteName=$launchSiteName, launchType=$launchType, launchVehicleId=$launchVehicleId, leased=$leased, lifeLost=$lifeLost, lon=$lon, massCategory=$massCategory, nameAtLaunch=$nameAtLaunch, newCost=$newCost, notes=$notes, numHumans=$numHumans, onOrbit=$onOrbit, operator=$operator, operatorCountry=$operatorCountry, orbitCategory=$orbitCategory, orbitSubCategory=$orbitSubCategory, orderDate=$orderDate, origin=$origin, origNetwork=$origNetwork, owner=$owner, ownerCountry=$ownerCountry, perigee=$perigee, period=$period, primaryMissionGroup=$primaryMissionGroup, primeManufacturerOrgId=$primeManufacturerOrgId, programName=$programName, quantity=$quantity, reusableFlights=$reusableFlights, reusedHullName=$reusedHullName, scientific=$scientific, sector=$sector, seradataCommDetails=$seradataCommDetails, seradataEarlyWarning=$seradataEarlyWarning, seradataNavigation=$seradataNavigation, seradataOpticalPayload=$seradataOpticalPayload, seradataRadarPayload=$seradataRadarPayload, seradataSigIntPayload=$seradataSigIntPayload, serialNumber=$serialNumber, stabilizer=$stabilizer, status=$status, totalClaims=$totalClaims, totalFatalities=$totalFatalities, totalInjuries=$totalInjuries, totalPayloadPower=$totalPayloadPower, updatedAt=$updatedAt, updatedBy=$updatedBy, youtubeLaunchLink=$youtubeLaunchLink, additionalProperties=$additionalProperties}"
}

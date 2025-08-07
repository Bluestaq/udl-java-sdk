// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.buses

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
 * A bus is the physical and software infrastructure backbone to which on-orbit satellite payloads
 * are attached for power, control, and other support functions.
 */
class BusAbridged
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val name: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val aocsNotes: JsonField<String>,
    private val avgDryMass: JsonField<Double>,
    private val avgPayloadMass: JsonField<Double>,
    private val avgPayloadPower: JsonField<Double>,
    private val avgSpacecraftPower: JsonField<Double>,
    private val avgWetMass: JsonField<Double>,
    private val bodyDimensionX: JsonField<Double>,
    private val bodyDimensionY: JsonField<Double>,
    private val bodyDimensionZ: JsonField<Double>,
    private val busKitDesignerOrgId: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val description: JsonField<String>,
    private val generic: JsonField<Boolean>,
    private val idEntity: JsonField<String>,
    private val launchEnvelopeDimensionX: JsonField<Double>,
    private val launchEnvelopeDimensionY: JsonField<Double>,
    private val launchEnvelopeDimensionZ: JsonField<Double>,
    private val mainComputerManufacturerOrgId: JsonField<String>,
    private val manufacturerOrgId: JsonField<String>,
    private val massCategory: JsonField<String>,
    private val maxBolPowerLower: JsonField<Double>,
    private val maxBolPowerUpper: JsonField<Double>,
    private val maxBolStationMass: JsonField<Double>,
    private val maxDryMass: JsonField<Double>,
    private val maxEolPowerLower: JsonField<Double>,
    private val maxEolPowerUpper: JsonField<Double>,
    private val maxLaunchMassLower: JsonField<Double>,
    private val maxLaunchMassUpper: JsonField<Double>,
    private val maxPayloadMass: JsonField<Double>,
    private val maxPayloadPower: JsonField<Double>,
    private val maxSpacecraftPower: JsonField<Double>,
    private val maxWetMass: JsonField<Double>,
    private val medianDryMass: JsonField<Double>,
    private val medianWetMass: JsonField<Double>,
    private val minDryMass: JsonField<Double>,
    private val minWetMass: JsonField<Double>,
    private val numOrbitType: JsonField<Int>,
    private val oapPayloadPower: JsonField<Double>,
    private val oapSpacecraftPower: JsonField<Double>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val payloadDimensionX: JsonField<Double>,
    private val payloadDimensionY: JsonField<Double>,
    private val payloadDimensionZ: JsonField<Double>,
    private val payloadVolume: JsonField<Double>,
    private val powerCategory: JsonField<String>,
    private val telemetryTrackingManufacturerOrgId: JsonField<String>,
    private val type: JsonField<String>,
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
        @JsonProperty("aocsNotes") @ExcludeMissing aocsNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("avgDryMass")
        @ExcludeMissing
        avgDryMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("avgPayloadMass")
        @ExcludeMissing
        avgPayloadMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("avgPayloadPower")
        @ExcludeMissing
        avgPayloadPower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("avgSpacecraftPower")
        @ExcludeMissing
        avgSpacecraftPower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("avgWetMass")
        @ExcludeMissing
        avgWetMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bodyDimensionX")
        @ExcludeMissing
        bodyDimensionX: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bodyDimensionY")
        @ExcludeMissing
        bodyDimensionY: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bodyDimensionZ")
        @ExcludeMissing
        bodyDimensionZ: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("busKitDesignerOrgId")
        @ExcludeMissing
        busKitDesignerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("generic") @ExcludeMissing generic: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("idEntity") @ExcludeMissing idEntity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchEnvelopeDimensionX")
        @ExcludeMissing
        launchEnvelopeDimensionX: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchEnvelopeDimensionY")
        @ExcludeMissing
        launchEnvelopeDimensionY: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchEnvelopeDimensionZ")
        @ExcludeMissing
        launchEnvelopeDimensionZ: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("mainComputerManufacturerOrgId")
        @ExcludeMissing
        mainComputerManufacturerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manufacturerOrgId")
        @ExcludeMissing
        manufacturerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("massCategory")
        @ExcludeMissing
        massCategory: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxBOLPowerLower")
        @ExcludeMissing
        maxBolPowerLower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxBOLPowerUpper")
        @ExcludeMissing
        maxBolPowerUpper: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxBOLStationMass")
        @ExcludeMissing
        maxBolStationMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxDryMass")
        @ExcludeMissing
        maxDryMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxEOLPowerLower")
        @ExcludeMissing
        maxEolPowerLower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxEOLPowerUpper")
        @ExcludeMissing
        maxEolPowerUpper: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxLaunchMassLower")
        @ExcludeMissing
        maxLaunchMassLower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxLaunchMassUpper")
        @ExcludeMissing
        maxLaunchMassUpper: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxPayloadMass")
        @ExcludeMissing
        maxPayloadMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxPayloadPower")
        @ExcludeMissing
        maxPayloadPower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxSpacecraftPower")
        @ExcludeMissing
        maxSpacecraftPower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxWetMass")
        @ExcludeMissing
        maxWetMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("medianDryMass")
        @ExcludeMissing
        medianDryMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("medianWetMass")
        @ExcludeMissing
        medianWetMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minDryMass")
        @ExcludeMissing
        minDryMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minWetMass")
        @ExcludeMissing
        minWetMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("numOrbitType")
        @ExcludeMissing
        numOrbitType: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("oapPayloadPower")
        @ExcludeMissing
        oapPayloadPower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("oapSpacecraftPower")
        @ExcludeMissing
        oapSpacecraftPower: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payloadDimensionX")
        @ExcludeMissing
        payloadDimensionX: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("payloadDimensionY")
        @ExcludeMissing
        payloadDimensionY: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("payloadDimensionZ")
        @ExcludeMissing
        payloadDimensionZ: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("payloadVolume")
        @ExcludeMissing
        payloadVolume: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("powerCategory")
        @ExcludeMissing
        powerCategory: JsonField<String> = JsonMissing.of(),
        @JsonProperty("telemetryTrackingManufacturerOrgId")
        @ExcludeMissing
        telemetryTrackingManufacturerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        name,
        source,
        id,
        aocsNotes,
        avgDryMass,
        avgPayloadMass,
        avgPayloadPower,
        avgSpacecraftPower,
        avgWetMass,
        bodyDimensionX,
        bodyDimensionY,
        bodyDimensionZ,
        busKitDesignerOrgId,
        countryCode,
        createdAt,
        createdBy,
        description,
        generic,
        idEntity,
        launchEnvelopeDimensionX,
        launchEnvelopeDimensionY,
        launchEnvelopeDimensionZ,
        mainComputerManufacturerOrgId,
        manufacturerOrgId,
        massCategory,
        maxBolPowerLower,
        maxBolPowerUpper,
        maxBolStationMass,
        maxDryMass,
        maxEolPowerLower,
        maxEolPowerUpper,
        maxLaunchMassLower,
        maxLaunchMassUpper,
        maxPayloadMass,
        maxPayloadPower,
        maxSpacecraftPower,
        maxWetMass,
        medianDryMass,
        medianWetMass,
        minDryMass,
        minWetMass,
        numOrbitType,
        oapPayloadPower,
        oapSpacecraftPower,
        origin,
        origNetwork,
        payloadDimensionX,
        payloadDimensionY,
        payloadDimensionZ,
        payloadVolume,
        powerCategory,
        telemetryTrackingManufacturerOrgId,
        type,
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
     * Name of this bus.
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
     * Attitude and Orbital Control Notes/description for the bus.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aocsNotes(): Optional<String> = aocsNotes.getOptional("aocsNotes")

    /**
     * Average mass of this bus without payloads or fuel, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avgDryMass(): Optional<Double> = avgDryMass.getOptional("avgDryMass")

    /**
     * Average mass available on this bus for payloads, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avgPayloadMass(): Optional<Double> = avgPayloadMass.getOptional("avgPayloadMass")

    /**
     * Average power available on this bus for payloads, in kilowatts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avgPayloadPower(): Optional<Double> = avgPayloadPower.getOptional("avgPayloadPower")

    /**
     * Average power available on this bus, in kilowatts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avgSpacecraftPower(): Optional<Double> =
        avgSpacecraftPower.getOptional("avgSpacecraftPower")

    /**
     * Average mass of this bus with fuel, but without payloads, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avgWetMass(): Optional<Double> = avgWetMass.getOptional("avgWetMass")

    /**
     * Body dimension in X direction pertaining to length, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bodyDimensionX(): Optional<Double> = bodyDimensionX.getOptional("bodyDimensionX")

    /**
     * Body dimension in Y direction pertaining to height, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bodyDimensionY(): Optional<Double> = bodyDimensionY.getOptional("bodyDimensionY")

    /**
     * Body dimension in Z direction pertaining to width, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bodyDimensionZ(): Optional<Double> = bodyDimensionZ.getOptional("bodyDimensionZ")

    /**
     * Unique identifier of the organization which designs the bus kit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun busKitDesignerOrgId(): Optional<String> =
        busKitDesignerOrgId.getOptional("busKitDesignerOrgId")

    /**
     * Country where this bus was manufactured. This value is typically the ISO 3166 Alpha-2
     * two-character country code, however it can also represent various consortiums that do not
     * appear in the ISO document. The code must correspond to an existing country in the UDL’s
     * country API. Call udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or
     * alternate code values that exist for the specified country code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

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
     * Notes/description of the bus.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Boolean indicating if this bus is generic.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun generic(): Optional<Boolean> = generic.getOptional("generic")

    /**
     * ID of the parent entity for this bus.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idEntity(): Optional<String> = idEntity.getOptional("idEntity")

    /**
     * Launch envelope dimension in X direction, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchEnvelopeDimensionX(): Optional<Double> =
        launchEnvelopeDimensionX.getOptional("launchEnvelopeDimensionX")

    /**
     * Launch envelope dimension in Y direction, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchEnvelopeDimensionY(): Optional<Double> =
        launchEnvelopeDimensionY.getOptional("launchEnvelopeDimensionY")

    /**
     * Launch envelope dimension in Z direction, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchEnvelopeDimensionZ(): Optional<Double> =
        launchEnvelopeDimensionZ.getOptional("launchEnvelopeDimensionZ")

    /**
     * Unique identifier of the organization which manufactures the main onboard computer for this
     * bus.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mainComputerManufacturerOrgId(): Optional<String> =
        mainComputerManufacturerOrgId.getOptional("mainComputerManufacturerOrgId")

    /**
     * Unique identifier of the organization which manufactures this bus.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun manufacturerOrgId(): Optional<String> = manufacturerOrgId.getOptional("manufacturerOrgId")

    /**
     * Mass category of this bus (e.g. 1 - 10 kg: Nanosatellite, 10 - 100 kg: Microsatellite, 100 -
     * 500 kg: Minisatellite, 1000 - 2500kg: Medium satellite, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun massCategory(): Optional<String> = massCategory.getOptional("massCategory")

    /**
     * Maximum power at beginning of life, lower bounds, in kilowatts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxBolPowerLower(): Optional<Double> = maxBolPowerLower.getOptional("maxBOLPowerLower")

    /**
     * Maximum power at beginning of life, upper bounds, in kilowatts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxBolPowerUpper(): Optional<Double> = maxBolPowerUpper.getOptional("maxBOLPowerUpper")

    /**
     * Maximum mass on station at beginning of life, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxBolStationMass(): Optional<Double> = maxBolStationMass.getOptional("maxBOLStationMass")

    /**
     * Maximum mass of this bus without payloads or fuel, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxDryMass(): Optional<Double> = maxDryMass.getOptional("maxDryMass")

    /**
     * Maximum power at end of life, lower bounds, in kilowatts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxEolPowerLower(): Optional<Double> = maxEolPowerLower.getOptional("maxEOLPowerLower")

    /**
     * Maximum power at end of life, upper bounds, in kilowatts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxEolPowerUpper(): Optional<Double> = maxEolPowerUpper.getOptional("maxEOLPowerUpper")

    /**
     * Maximum mass at launch, lower bounds, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxLaunchMassLower(): Optional<Double> =
        maxLaunchMassLower.getOptional("maxLaunchMassLower")

    /**
     * Maximum mass at launch, upper bounds, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxLaunchMassUpper(): Optional<Double> =
        maxLaunchMassUpper.getOptional("maxLaunchMassUpper")

    /**
     * Maximum payload mass available, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxPayloadMass(): Optional<Double> = maxPayloadMass.getOptional("maxPayloadMass")

    /**
     * Maximum payload power available, in kilowatts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxPayloadPower(): Optional<Double> = maxPayloadPower.getOptional("maxPayloadPower")

    /**
     * Maximum power available on this bus, in kilowatts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxSpacecraftPower(): Optional<Double> =
        maxSpacecraftPower.getOptional("maxSpacecraftPower")

    /**
     * Maximum mass of this bus with fuel, but without payloads, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxWetMass(): Optional<Double> = maxWetMass.getOptional("maxWetMass")

    /**
     * Median mass of this bus without payloads or fuel, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun medianDryMass(): Optional<Double> = medianDryMass.getOptional("medianDryMass")

    /**
     * Median mass of this bus with fuel, but without payloads, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun medianWetMass(): Optional<Double> = medianWetMass.getOptional("medianWetMass")

    /**
     * Minimum mass of this bus without payloads or fuel, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minDryMass(): Optional<Double> = minDryMass.getOptional("minDryMass")

    /**
     * Minimum mass of this bus with fuel, but without payloads, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minWetMass(): Optional<Double> = minWetMass.getOptional("minWetMass")

    /**
     * The number of orbit types this bus can support.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numOrbitType(): Optional<Int> = numOrbitType.getOptional("numOrbitType")

    /**
     * Orbit averaged power (the power averaged over one orbit) available on this bus for payloads,
     * in kilowatts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun oapPayloadPower(): Optional<Double> = oapPayloadPower.getOptional("oapPayloadPower")

    /**
     * Orbit averaged power (the power averaged over one orbit) available on this bus, in kilowatts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun oapSpacecraftPower(): Optional<Double> =
        oapSpacecraftPower.getOptional("oapSpacecraftPower")

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
     * The radial dimension available on this bus for payloads, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun payloadDimensionX(): Optional<Double> = payloadDimensionX.getOptional("payloadDimensionX")

    /**
     * The in-track dimension available on this bus for payloads, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun payloadDimensionY(): Optional<Double> = payloadDimensionY.getOptional("payloadDimensionY")

    /**
     * The cross-track dimension available on this bus for payloads, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun payloadDimensionZ(): Optional<Double> = payloadDimensionZ.getOptional("payloadDimensionZ")

    /**
     * The volume available on this bus for payloads, in cubic meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun payloadVolume(): Optional<Double> = payloadVolume.getOptional("payloadVolume")

    /**
     * Power category of this bus (e.g. 0-1kW low power, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun powerCategory(): Optional<String> = powerCategory.getOptional("powerCategory")

    /**
     * Unique identifier of the organization which manufactures the telemetry tracking and command
     * subsystem for this bus.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun telemetryTrackingManufacturerOrgId(): Optional<String> =
        telemetryTrackingManufacturerOrgId.getOptional("telemetryTrackingManufacturerOrgId")

    /**
     * Type of this bus.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

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
     * Returns the raw JSON value of [aocsNotes].
     *
     * Unlike [aocsNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aocsNotes") @ExcludeMissing fun _aocsNotes(): JsonField<String> = aocsNotes

    /**
     * Returns the raw JSON value of [avgDryMass].
     *
     * Unlike [avgDryMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avgDryMass") @ExcludeMissing fun _avgDryMass(): JsonField<Double> = avgDryMass

    /**
     * Returns the raw JSON value of [avgPayloadMass].
     *
     * Unlike [avgPayloadMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avgPayloadMass")
    @ExcludeMissing
    fun _avgPayloadMass(): JsonField<Double> = avgPayloadMass

    /**
     * Returns the raw JSON value of [avgPayloadPower].
     *
     * Unlike [avgPayloadPower], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avgPayloadPower")
    @ExcludeMissing
    fun _avgPayloadPower(): JsonField<Double> = avgPayloadPower

    /**
     * Returns the raw JSON value of [avgSpacecraftPower].
     *
     * Unlike [avgSpacecraftPower], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("avgSpacecraftPower")
    @ExcludeMissing
    fun _avgSpacecraftPower(): JsonField<Double> = avgSpacecraftPower

    /**
     * Returns the raw JSON value of [avgWetMass].
     *
     * Unlike [avgWetMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avgWetMass") @ExcludeMissing fun _avgWetMass(): JsonField<Double> = avgWetMass

    /**
     * Returns the raw JSON value of [bodyDimensionX].
     *
     * Unlike [bodyDimensionX], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bodyDimensionX")
    @ExcludeMissing
    fun _bodyDimensionX(): JsonField<Double> = bodyDimensionX

    /**
     * Returns the raw JSON value of [bodyDimensionY].
     *
     * Unlike [bodyDimensionY], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bodyDimensionY")
    @ExcludeMissing
    fun _bodyDimensionY(): JsonField<Double> = bodyDimensionY

    /**
     * Returns the raw JSON value of [bodyDimensionZ].
     *
     * Unlike [bodyDimensionZ], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bodyDimensionZ")
    @ExcludeMissing
    fun _bodyDimensionZ(): JsonField<Double> = bodyDimensionZ

    /**
     * Returns the raw JSON value of [busKitDesignerOrgId].
     *
     * Unlike [busKitDesignerOrgId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("busKitDesignerOrgId")
    @ExcludeMissing
    fun _busKitDesignerOrgId(): JsonField<String> = busKitDesignerOrgId

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [generic].
     *
     * Unlike [generic], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("generic") @ExcludeMissing fun _generic(): JsonField<Boolean> = generic

    /**
     * Returns the raw JSON value of [idEntity].
     *
     * Unlike [idEntity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idEntity") @ExcludeMissing fun _idEntity(): JsonField<String> = idEntity

    /**
     * Returns the raw JSON value of [launchEnvelopeDimensionX].
     *
     * Unlike [launchEnvelopeDimensionX], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("launchEnvelopeDimensionX")
    @ExcludeMissing
    fun _launchEnvelopeDimensionX(): JsonField<Double> = launchEnvelopeDimensionX

    /**
     * Returns the raw JSON value of [launchEnvelopeDimensionY].
     *
     * Unlike [launchEnvelopeDimensionY], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("launchEnvelopeDimensionY")
    @ExcludeMissing
    fun _launchEnvelopeDimensionY(): JsonField<Double> = launchEnvelopeDimensionY

    /**
     * Returns the raw JSON value of [launchEnvelopeDimensionZ].
     *
     * Unlike [launchEnvelopeDimensionZ], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("launchEnvelopeDimensionZ")
    @ExcludeMissing
    fun _launchEnvelopeDimensionZ(): JsonField<Double> = launchEnvelopeDimensionZ

    /**
     * Returns the raw JSON value of [mainComputerManufacturerOrgId].
     *
     * Unlike [mainComputerManufacturerOrgId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("mainComputerManufacturerOrgId")
    @ExcludeMissing
    fun _mainComputerManufacturerOrgId(): JsonField<String> = mainComputerManufacturerOrgId

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
     * Returns the raw JSON value of [massCategory].
     *
     * Unlike [massCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("massCategory")
    @ExcludeMissing
    fun _massCategory(): JsonField<String> = massCategory

    /**
     * Returns the raw JSON value of [maxBolPowerLower].
     *
     * Unlike [maxBolPowerLower], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxBOLPowerLower")
    @ExcludeMissing
    fun _maxBolPowerLower(): JsonField<Double> = maxBolPowerLower

    /**
     * Returns the raw JSON value of [maxBolPowerUpper].
     *
     * Unlike [maxBolPowerUpper], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxBOLPowerUpper")
    @ExcludeMissing
    fun _maxBolPowerUpper(): JsonField<Double> = maxBolPowerUpper

    /**
     * Returns the raw JSON value of [maxBolStationMass].
     *
     * Unlike [maxBolStationMass], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxBOLStationMass")
    @ExcludeMissing
    fun _maxBolStationMass(): JsonField<Double> = maxBolStationMass

    /**
     * Returns the raw JSON value of [maxDryMass].
     *
     * Unlike [maxDryMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxDryMass") @ExcludeMissing fun _maxDryMass(): JsonField<Double> = maxDryMass

    /**
     * Returns the raw JSON value of [maxEolPowerLower].
     *
     * Unlike [maxEolPowerLower], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxEOLPowerLower")
    @ExcludeMissing
    fun _maxEolPowerLower(): JsonField<Double> = maxEolPowerLower

    /**
     * Returns the raw JSON value of [maxEolPowerUpper].
     *
     * Unlike [maxEolPowerUpper], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxEOLPowerUpper")
    @ExcludeMissing
    fun _maxEolPowerUpper(): JsonField<Double> = maxEolPowerUpper

    /**
     * Returns the raw JSON value of [maxLaunchMassLower].
     *
     * Unlike [maxLaunchMassLower], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxLaunchMassLower")
    @ExcludeMissing
    fun _maxLaunchMassLower(): JsonField<Double> = maxLaunchMassLower

    /**
     * Returns the raw JSON value of [maxLaunchMassUpper].
     *
     * Unlike [maxLaunchMassUpper], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxLaunchMassUpper")
    @ExcludeMissing
    fun _maxLaunchMassUpper(): JsonField<Double> = maxLaunchMassUpper

    /**
     * Returns the raw JSON value of [maxPayloadMass].
     *
     * Unlike [maxPayloadMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxPayloadMass")
    @ExcludeMissing
    fun _maxPayloadMass(): JsonField<Double> = maxPayloadMass

    /**
     * Returns the raw JSON value of [maxPayloadPower].
     *
     * Unlike [maxPayloadPower], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxPayloadPower")
    @ExcludeMissing
    fun _maxPayloadPower(): JsonField<Double> = maxPayloadPower

    /**
     * Returns the raw JSON value of [maxSpacecraftPower].
     *
     * Unlike [maxSpacecraftPower], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxSpacecraftPower")
    @ExcludeMissing
    fun _maxSpacecraftPower(): JsonField<Double> = maxSpacecraftPower

    /**
     * Returns the raw JSON value of [maxWetMass].
     *
     * Unlike [maxWetMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxWetMass") @ExcludeMissing fun _maxWetMass(): JsonField<Double> = maxWetMass

    /**
     * Returns the raw JSON value of [medianDryMass].
     *
     * Unlike [medianDryMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medianDryMass")
    @ExcludeMissing
    fun _medianDryMass(): JsonField<Double> = medianDryMass

    /**
     * Returns the raw JSON value of [medianWetMass].
     *
     * Unlike [medianWetMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medianWetMass")
    @ExcludeMissing
    fun _medianWetMass(): JsonField<Double> = medianWetMass

    /**
     * Returns the raw JSON value of [minDryMass].
     *
     * Unlike [minDryMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minDryMass") @ExcludeMissing fun _minDryMass(): JsonField<Double> = minDryMass

    /**
     * Returns the raw JSON value of [minWetMass].
     *
     * Unlike [minWetMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minWetMass") @ExcludeMissing fun _minWetMass(): JsonField<Double> = minWetMass

    /**
     * Returns the raw JSON value of [numOrbitType].
     *
     * Unlike [numOrbitType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numOrbitType") @ExcludeMissing fun _numOrbitType(): JsonField<Int> = numOrbitType

    /**
     * Returns the raw JSON value of [oapPayloadPower].
     *
     * Unlike [oapPayloadPower], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("oapPayloadPower")
    @ExcludeMissing
    fun _oapPayloadPower(): JsonField<Double> = oapPayloadPower

    /**
     * Returns the raw JSON value of [oapSpacecraftPower].
     *
     * Unlike [oapSpacecraftPower], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("oapSpacecraftPower")
    @ExcludeMissing
    fun _oapSpacecraftPower(): JsonField<Double> = oapSpacecraftPower

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
     * Returns the raw JSON value of [payloadDimensionX].
     *
     * Unlike [payloadDimensionX], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payloadDimensionX")
    @ExcludeMissing
    fun _payloadDimensionX(): JsonField<Double> = payloadDimensionX

    /**
     * Returns the raw JSON value of [payloadDimensionY].
     *
     * Unlike [payloadDimensionY], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payloadDimensionY")
    @ExcludeMissing
    fun _payloadDimensionY(): JsonField<Double> = payloadDimensionY

    /**
     * Returns the raw JSON value of [payloadDimensionZ].
     *
     * Unlike [payloadDimensionZ], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payloadDimensionZ")
    @ExcludeMissing
    fun _payloadDimensionZ(): JsonField<Double> = payloadDimensionZ

    /**
     * Returns the raw JSON value of [payloadVolume].
     *
     * Unlike [payloadVolume], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payloadVolume")
    @ExcludeMissing
    fun _payloadVolume(): JsonField<Double> = payloadVolume

    /**
     * Returns the raw JSON value of [powerCategory].
     *
     * Unlike [powerCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("powerCategory")
    @ExcludeMissing
    fun _powerCategory(): JsonField<String> = powerCategory

    /**
     * Returns the raw JSON value of [telemetryTrackingManufacturerOrgId].
     *
     * Unlike [telemetryTrackingManufacturerOrgId], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("telemetryTrackingManufacturerOrgId")
    @ExcludeMissing
    fun _telemetryTrackingManufacturerOrgId(): JsonField<String> =
        telemetryTrackingManufacturerOrgId

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
         * Returns a mutable builder for constructing an instance of [BusAbridged].
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

    /** A builder for [BusAbridged]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var name: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var aocsNotes: JsonField<String> = JsonMissing.of()
        private var avgDryMass: JsonField<Double> = JsonMissing.of()
        private var avgPayloadMass: JsonField<Double> = JsonMissing.of()
        private var avgPayloadPower: JsonField<Double> = JsonMissing.of()
        private var avgSpacecraftPower: JsonField<Double> = JsonMissing.of()
        private var avgWetMass: JsonField<Double> = JsonMissing.of()
        private var bodyDimensionX: JsonField<Double> = JsonMissing.of()
        private var bodyDimensionY: JsonField<Double> = JsonMissing.of()
        private var bodyDimensionZ: JsonField<Double> = JsonMissing.of()
        private var busKitDesignerOrgId: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var generic: JsonField<Boolean> = JsonMissing.of()
        private var idEntity: JsonField<String> = JsonMissing.of()
        private var launchEnvelopeDimensionX: JsonField<Double> = JsonMissing.of()
        private var launchEnvelopeDimensionY: JsonField<Double> = JsonMissing.of()
        private var launchEnvelopeDimensionZ: JsonField<Double> = JsonMissing.of()
        private var mainComputerManufacturerOrgId: JsonField<String> = JsonMissing.of()
        private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
        private var massCategory: JsonField<String> = JsonMissing.of()
        private var maxBolPowerLower: JsonField<Double> = JsonMissing.of()
        private var maxBolPowerUpper: JsonField<Double> = JsonMissing.of()
        private var maxBolStationMass: JsonField<Double> = JsonMissing.of()
        private var maxDryMass: JsonField<Double> = JsonMissing.of()
        private var maxEolPowerLower: JsonField<Double> = JsonMissing.of()
        private var maxEolPowerUpper: JsonField<Double> = JsonMissing.of()
        private var maxLaunchMassLower: JsonField<Double> = JsonMissing.of()
        private var maxLaunchMassUpper: JsonField<Double> = JsonMissing.of()
        private var maxPayloadMass: JsonField<Double> = JsonMissing.of()
        private var maxPayloadPower: JsonField<Double> = JsonMissing.of()
        private var maxSpacecraftPower: JsonField<Double> = JsonMissing.of()
        private var maxWetMass: JsonField<Double> = JsonMissing.of()
        private var medianDryMass: JsonField<Double> = JsonMissing.of()
        private var medianWetMass: JsonField<Double> = JsonMissing.of()
        private var minDryMass: JsonField<Double> = JsonMissing.of()
        private var minWetMass: JsonField<Double> = JsonMissing.of()
        private var numOrbitType: JsonField<Int> = JsonMissing.of()
        private var oapPayloadPower: JsonField<Double> = JsonMissing.of()
        private var oapSpacecraftPower: JsonField<Double> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var payloadDimensionX: JsonField<Double> = JsonMissing.of()
        private var payloadDimensionY: JsonField<Double> = JsonMissing.of()
        private var payloadDimensionZ: JsonField<Double> = JsonMissing.of()
        private var payloadVolume: JsonField<Double> = JsonMissing.of()
        private var powerCategory: JsonField<String> = JsonMissing.of()
        private var telemetryTrackingManufacturerOrgId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(busAbridged: BusAbridged) = apply {
            classificationMarking = busAbridged.classificationMarking
            dataMode = busAbridged.dataMode
            name = busAbridged.name
            source = busAbridged.source
            id = busAbridged.id
            aocsNotes = busAbridged.aocsNotes
            avgDryMass = busAbridged.avgDryMass
            avgPayloadMass = busAbridged.avgPayloadMass
            avgPayloadPower = busAbridged.avgPayloadPower
            avgSpacecraftPower = busAbridged.avgSpacecraftPower
            avgWetMass = busAbridged.avgWetMass
            bodyDimensionX = busAbridged.bodyDimensionX
            bodyDimensionY = busAbridged.bodyDimensionY
            bodyDimensionZ = busAbridged.bodyDimensionZ
            busKitDesignerOrgId = busAbridged.busKitDesignerOrgId
            countryCode = busAbridged.countryCode
            createdAt = busAbridged.createdAt
            createdBy = busAbridged.createdBy
            description = busAbridged.description
            generic = busAbridged.generic
            idEntity = busAbridged.idEntity
            launchEnvelopeDimensionX = busAbridged.launchEnvelopeDimensionX
            launchEnvelopeDimensionY = busAbridged.launchEnvelopeDimensionY
            launchEnvelopeDimensionZ = busAbridged.launchEnvelopeDimensionZ
            mainComputerManufacturerOrgId = busAbridged.mainComputerManufacturerOrgId
            manufacturerOrgId = busAbridged.manufacturerOrgId
            massCategory = busAbridged.massCategory
            maxBolPowerLower = busAbridged.maxBolPowerLower
            maxBolPowerUpper = busAbridged.maxBolPowerUpper
            maxBolStationMass = busAbridged.maxBolStationMass
            maxDryMass = busAbridged.maxDryMass
            maxEolPowerLower = busAbridged.maxEolPowerLower
            maxEolPowerUpper = busAbridged.maxEolPowerUpper
            maxLaunchMassLower = busAbridged.maxLaunchMassLower
            maxLaunchMassUpper = busAbridged.maxLaunchMassUpper
            maxPayloadMass = busAbridged.maxPayloadMass
            maxPayloadPower = busAbridged.maxPayloadPower
            maxSpacecraftPower = busAbridged.maxSpacecraftPower
            maxWetMass = busAbridged.maxWetMass
            medianDryMass = busAbridged.medianDryMass
            medianWetMass = busAbridged.medianWetMass
            minDryMass = busAbridged.minDryMass
            minWetMass = busAbridged.minWetMass
            numOrbitType = busAbridged.numOrbitType
            oapPayloadPower = busAbridged.oapPayloadPower
            oapSpacecraftPower = busAbridged.oapSpacecraftPower
            origin = busAbridged.origin
            origNetwork = busAbridged.origNetwork
            payloadDimensionX = busAbridged.payloadDimensionX
            payloadDimensionY = busAbridged.payloadDimensionY
            payloadDimensionZ = busAbridged.payloadDimensionZ
            payloadVolume = busAbridged.payloadVolume
            powerCategory = busAbridged.powerCategory
            telemetryTrackingManufacturerOrgId = busAbridged.telemetryTrackingManufacturerOrgId
            type = busAbridged.type
            additionalProperties = busAbridged.additionalProperties.toMutableMap()
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

        /** Name of this bus. */
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

        /** Attitude and Orbital Control Notes/description for the bus. */
        fun aocsNotes(aocsNotes: String) = aocsNotes(JsonField.of(aocsNotes))

        /**
         * Sets [Builder.aocsNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aocsNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aocsNotes(aocsNotes: JsonField<String>) = apply { this.aocsNotes = aocsNotes }

        /** Average mass of this bus without payloads or fuel, in kilograms. */
        fun avgDryMass(avgDryMass: Double) = avgDryMass(JsonField.of(avgDryMass))

        /**
         * Sets [Builder.avgDryMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgDryMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun avgDryMass(avgDryMass: JsonField<Double>) = apply { this.avgDryMass = avgDryMass }

        /** Average mass available on this bus for payloads, in kilograms. */
        fun avgPayloadMass(avgPayloadMass: Double) = avgPayloadMass(JsonField.of(avgPayloadMass))

        /**
         * Sets [Builder.avgPayloadMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgPayloadMass] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun avgPayloadMass(avgPayloadMass: JsonField<Double>) = apply {
            this.avgPayloadMass = avgPayloadMass
        }

        /** Average power available on this bus for payloads, in kilowatts. */
        fun avgPayloadPower(avgPayloadPower: Double) =
            avgPayloadPower(JsonField.of(avgPayloadPower))

        /**
         * Sets [Builder.avgPayloadPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgPayloadPower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun avgPayloadPower(avgPayloadPower: JsonField<Double>) = apply {
            this.avgPayloadPower = avgPayloadPower
        }

        /** Average power available on this bus, in kilowatts. */
        fun avgSpacecraftPower(avgSpacecraftPower: Double) =
            avgSpacecraftPower(JsonField.of(avgSpacecraftPower))

        /**
         * Sets [Builder.avgSpacecraftPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgSpacecraftPower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun avgSpacecraftPower(avgSpacecraftPower: JsonField<Double>) = apply {
            this.avgSpacecraftPower = avgSpacecraftPower
        }

        /** Average mass of this bus with fuel, but without payloads, in kilograms. */
        fun avgWetMass(avgWetMass: Double) = avgWetMass(JsonField.of(avgWetMass))

        /**
         * Sets [Builder.avgWetMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgWetMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun avgWetMass(avgWetMass: JsonField<Double>) = apply { this.avgWetMass = avgWetMass }

        /** Body dimension in X direction pertaining to length, in meters. */
        fun bodyDimensionX(bodyDimensionX: Double) = bodyDimensionX(JsonField.of(bodyDimensionX))

        /**
         * Sets [Builder.bodyDimensionX] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyDimensionX] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bodyDimensionX(bodyDimensionX: JsonField<Double>) = apply {
            this.bodyDimensionX = bodyDimensionX
        }

        /** Body dimension in Y direction pertaining to height, in meters. */
        fun bodyDimensionY(bodyDimensionY: Double) = bodyDimensionY(JsonField.of(bodyDimensionY))

        /**
         * Sets [Builder.bodyDimensionY] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyDimensionY] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bodyDimensionY(bodyDimensionY: JsonField<Double>) = apply {
            this.bodyDimensionY = bodyDimensionY
        }

        /** Body dimension in Z direction pertaining to width, in meters. */
        fun bodyDimensionZ(bodyDimensionZ: Double) = bodyDimensionZ(JsonField.of(bodyDimensionZ))

        /**
         * Sets [Builder.bodyDimensionZ] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyDimensionZ] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bodyDimensionZ(bodyDimensionZ: JsonField<Double>) = apply {
            this.bodyDimensionZ = bodyDimensionZ
        }

        /** Unique identifier of the organization which designs the bus kit. */
        fun busKitDesignerOrgId(busKitDesignerOrgId: String) =
            busKitDesignerOrgId(JsonField.of(busKitDesignerOrgId))

        /**
         * Sets [Builder.busKitDesignerOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.busKitDesignerOrgId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun busKitDesignerOrgId(busKitDesignerOrgId: JsonField<String>) = apply {
            this.busKitDesignerOrgId = busKitDesignerOrgId
        }

        /**
         * Country where this bus was manufactured. This value is typically the ISO 3166 Alpha-2
         * two-character country code, however it can also represent various consortiums that do not
         * appear in the ISO document. The code must correspond to an existing country in the UDL’s
         * country API. Call udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code,
         * or alternate code values that exist for the specified country code.
         */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

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

        /** Notes/description of the bus. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Boolean indicating if this bus is generic. */
        fun generic(generic: Boolean) = generic(JsonField.of(generic))

        /**
         * Sets [Builder.generic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.generic] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun generic(generic: JsonField<Boolean>) = apply { this.generic = generic }

        /** ID of the parent entity for this bus. */
        fun idEntity(idEntity: String) = idEntity(JsonField.of(idEntity))

        /**
         * Sets [Builder.idEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idEntity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idEntity(idEntity: JsonField<String>) = apply { this.idEntity = idEntity }

        /** Launch envelope dimension in X direction, in meters. */
        fun launchEnvelopeDimensionX(launchEnvelopeDimensionX: Double) =
            launchEnvelopeDimensionX(JsonField.of(launchEnvelopeDimensionX))

        /**
         * Sets [Builder.launchEnvelopeDimensionX] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchEnvelopeDimensionX] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun launchEnvelopeDimensionX(launchEnvelopeDimensionX: JsonField<Double>) = apply {
            this.launchEnvelopeDimensionX = launchEnvelopeDimensionX
        }

        /** Launch envelope dimension in Y direction, in meters. */
        fun launchEnvelopeDimensionY(launchEnvelopeDimensionY: Double) =
            launchEnvelopeDimensionY(JsonField.of(launchEnvelopeDimensionY))

        /**
         * Sets [Builder.launchEnvelopeDimensionY] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchEnvelopeDimensionY] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun launchEnvelopeDimensionY(launchEnvelopeDimensionY: JsonField<Double>) = apply {
            this.launchEnvelopeDimensionY = launchEnvelopeDimensionY
        }

        /** Launch envelope dimension in Z direction, in meters. */
        fun launchEnvelopeDimensionZ(launchEnvelopeDimensionZ: Double) =
            launchEnvelopeDimensionZ(JsonField.of(launchEnvelopeDimensionZ))

        /**
         * Sets [Builder.launchEnvelopeDimensionZ] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchEnvelopeDimensionZ] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun launchEnvelopeDimensionZ(launchEnvelopeDimensionZ: JsonField<Double>) = apply {
            this.launchEnvelopeDimensionZ = launchEnvelopeDimensionZ
        }

        /**
         * Unique identifier of the organization which manufactures the main onboard computer for
         * this bus.
         */
        fun mainComputerManufacturerOrgId(mainComputerManufacturerOrgId: String) =
            mainComputerManufacturerOrgId(JsonField.of(mainComputerManufacturerOrgId))

        /**
         * Sets [Builder.mainComputerManufacturerOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mainComputerManufacturerOrgId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun mainComputerManufacturerOrgId(mainComputerManufacturerOrgId: JsonField<String>) =
            apply {
                this.mainComputerManufacturerOrgId = mainComputerManufacturerOrgId
            }

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

        /**
         * Mass category of this bus (e.g. 1 - 10 kg: Nanosatellite, 10 - 100 kg: Microsatellite,
         * 100 - 500 kg: Minisatellite, 1000 - 2500kg: Medium satellite, etc.).
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

        /** Maximum power at beginning of life, lower bounds, in kilowatts. */
        fun maxBolPowerLower(maxBolPowerLower: Double) =
            maxBolPowerLower(JsonField.of(maxBolPowerLower))

        /**
         * Sets [Builder.maxBolPowerLower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxBolPowerLower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxBolPowerLower(maxBolPowerLower: JsonField<Double>) = apply {
            this.maxBolPowerLower = maxBolPowerLower
        }

        /** Maximum power at beginning of life, upper bounds, in kilowatts. */
        fun maxBolPowerUpper(maxBolPowerUpper: Double) =
            maxBolPowerUpper(JsonField.of(maxBolPowerUpper))

        /**
         * Sets [Builder.maxBolPowerUpper] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxBolPowerUpper] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxBolPowerUpper(maxBolPowerUpper: JsonField<Double>) = apply {
            this.maxBolPowerUpper = maxBolPowerUpper
        }

        /** Maximum mass on station at beginning of life, in kilograms. */
        fun maxBolStationMass(maxBolStationMass: Double) =
            maxBolStationMass(JsonField.of(maxBolStationMass))

        /**
         * Sets [Builder.maxBolStationMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxBolStationMass] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxBolStationMass(maxBolStationMass: JsonField<Double>) = apply {
            this.maxBolStationMass = maxBolStationMass
        }

        /** Maximum mass of this bus without payloads or fuel, in kilograms. */
        fun maxDryMass(maxDryMass: Double) = maxDryMass(JsonField.of(maxDryMass))

        /**
         * Sets [Builder.maxDryMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDryMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxDryMass(maxDryMass: JsonField<Double>) = apply { this.maxDryMass = maxDryMass }

        /** Maximum power at end of life, lower bounds, in kilowatts. */
        fun maxEolPowerLower(maxEolPowerLower: Double) =
            maxEolPowerLower(JsonField.of(maxEolPowerLower))

        /**
         * Sets [Builder.maxEolPowerLower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxEolPowerLower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxEolPowerLower(maxEolPowerLower: JsonField<Double>) = apply {
            this.maxEolPowerLower = maxEolPowerLower
        }

        /** Maximum power at end of life, upper bounds, in kilowatts. */
        fun maxEolPowerUpper(maxEolPowerUpper: Double) =
            maxEolPowerUpper(JsonField.of(maxEolPowerUpper))

        /**
         * Sets [Builder.maxEolPowerUpper] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxEolPowerUpper] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxEolPowerUpper(maxEolPowerUpper: JsonField<Double>) = apply {
            this.maxEolPowerUpper = maxEolPowerUpper
        }

        /** Maximum mass at launch, lower bounds, in kilograms. */
        fun maxLaunchMassLower(maxLaunchMassLower: Double) =
            maxLaunchMassLower(JsonField.of(maxLaunchMassLower))

        /**
         * Sets [Builder.maxLaunchMassLower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxLaunchMassLower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxLaunchMassLower(maxLaunchMassLower: JsonField<Double>) = apply {
            this.maxLaunchMassLower = maxLaunchMassLower
        }

        /** Maximum mass at launch, upper bounds, in kilograms. */
        fun maxLaunchMassUpper(maxLaunchMassUpper: Double) =
            maxLaunchMassUpper(JsonField.of(maxLaunchMassUpper))

        /**
         * Sets [Builder.maxLaunchMassUpper] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxLaunchMassUpper] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxLaunchMassUpper(maxLaunchMassUpper: JsonField<Double>) = apply {
            this.maxLaunchMassUpper = maxLaunchMassUpper
        }

        /** Maximum payload mass available, in kilograms. */
        fun maxPayloadMass(maxPayloadMass: Double) = maxPayloadMass(JsonField.of(maxPayloadMass))

        /**
         * Sets [Builder.maxPayloadMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxPayloadMass] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxPayloadMass(maxPayloadMass: JsonField<Double>) = apply {
            this.maxPayloadMass = maxPayloadMass
        }

        /** Maximum payload power available, in kilowatts. */
        fun maxPayloadPower(maxPayloadPower: Double) =
            maxPayloadPower(JsonField.of(maxPayloadPower))

        /**
         * Sets [Builder.maxPayloadPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxPayloadPower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxPayloadPower(maxPayloadPower: JsonField<Double>) = apply {
            this.maxPayloadPower = maxPayloadPower
        }

        /** Maximum power available on this bus, in kilowatts. */
        fun maxSpacecraftPower(maxSpacecraftPower: Double) =
            maxSpacecraftPower(JsonField.of(maxSpacecraftPower))

        /**
         * Sets [Builder.maxSpacecraftPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSpacecraftPower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxSpacecraftPower(maxSpacecraftPower: JsonField<Double>) = apply {
            this.maxSpacecraftPower = maxSpacecraftPower
        }

        /** Maximum mass of this bus with fuel, but without payloads, in kilograms. */
        fun maxWetMass(maxWetMass: Double) = maxWetMass(JsonField.of(maxWetMass))

        /**
         * Sets [Builder.maxWetMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxWetMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxWetMass(maxWetMass: JsonField<Double>) = apply { this.maxWetMass = maxWetMass }

        /** Median mass of this bus without payloads or fuel, in kilograms. */
        fun medianDryMass(medianDryMass: Double) = medianDryMass(JsonField.of(medianDryMass))

        /**
         * Sets [Builder.medianDryMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medianDryMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun medianDryMass(medianDryMass: JsonField<Double>) = apply {
            this.medianDryMass = medianDryMass
        }

        /** Median mass of this bus with fuel, but without payloads, in kilograms. */
        fun medianWetMass(medianWetMass: Double) = medianWetMass(JsonField.of(medianWetMass))

        /**
         * Sets [Builder.medianWetMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medianWetMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun medianWetMass(medianWetMass: JsonField<Double>) = apply {
            this.medianWetMass = medianWetMass
        }

        /** Minimum mass of this bus without payloads or fuel, in kilograms. */
        fun minDryMass(minDryMass: Double) = minDryMass(JsonField.of(minDryMass))

        /**
         * Sets [Builder.minDryMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minDryMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minDryMass(minDryMass: JsonField<Double>) = apply { this.minDryMass = minDryMass }

        /** Minimum mass of this bus with fuel, but without payloads, in kilograms. */
        fun minWetMass(minWetMass: Double) = minWetMass(JsonField.of(minWetMass))

        /**
         * Sets [Builder.minWetMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minWetMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minWetMass(minWetMass: JsonField<Double>) = apply { this.minWetMass = minWetMass }

        /** The number of orbit types this bus can support. */
        fun numOrbitType(numOrbitType: Int) = numOrbitType(JsonField.of(numOrbitType))

        /**
         * Sets [Builder.numOrbitType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numOrbitType] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numOrbitType(numOrbitType: JsonField<Int>) = apply { this.numOrbitType = numOrbitType }

        /**
         * Orbit averaged power (the power averaged over one orbit) available on this bus for
         * payloads, in kilowatts.
         */
        fun oapPayloadPower(oapPayloadPower: Double) =
            oapPayloadPower(JsonField.of(oapPayloadPower))

        /**
         * Sets [Builder.oapPayloadPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oapPayloadPower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oapPayloadPower(oapPayloadPower: JsonField<Double>) = apply {
            this.oapPayloadPower = oapPayloadPower
        }

        /**
         * Orbit averaged power (the power averaged over one orbit) available on this bus, in
         * kilowatts.
         */
        fun oapSpacecraftPower(oapSpacecraftPower: Double) =
            oapSpacecraftPower(JsonField.of(oapSpacecraftPower))

        /**
         * Sets [Builder.oapSpacecraftPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oapSpacecraftPower] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oapSpacecraftPower(oapSpacecraftPower: JsonField<Double>) = apply {
            this.oapSpacecraftPower = oapSpacecraftPower
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

        /** The radial dimension available on this bus for payloads, in meters. */
        fun payloadDimensionX(payloadDimensionX: Double) =
            payloadDimensionX(JsonField.of(payloadDimensionX))

        /**
         * Sets [Builder.payloadDimensionX] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadDimensionX] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payloadDimensionX(payloadDimensionX: JsonField<Double>) = apply {
            this.payloadDimensionX = payloadDimensionX
        }

        /** The in-track dimension available on this bus for payloads, in meters. */
        fun payloadDimensionY(payloadDimensionY: Double) =
            payloadDimensionY(JsonField.of(payloadDimensionY))

        /**
         * Sets [Builder.payloadDimensionY] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadDimensionY] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payloadDimensionY(payloadDimensionY: JsonField<Double>) = apply {
            this.payloadDimensionY = payloadDimensionY
        }

        /** The cross-track dimension available on this bus for payloads, in meters. */
        fun payloadDimensionZ(payloadDimensionZ: Double) =
            payloadDimensionZ(JsonField.of(payloadDimensionZ))

        /**
         * Sets [Builder.payloadDimensionZ] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadDimensionZ] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payloadDimensionZ(payloadDimensionZ: JsonField<Double>) = apply {
            this.payloadDimensionZ = payloadDimensionZ
        }

        /** The volume available on this bus for payloads, in cubic meters. */
        fun payloadVolume(payloadVolume: Double) = payloadVolume(JsonField.of(payloadVolume))

        /**
         * Sets [Builder.payloadVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadVolume] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payloadVolume(payloadVolume: JsonField<Double>) = apply {
            this.payloadVolume = payloadVolume
        }

        /** Power category of this bus (e.g. 0-1kW low power, etc). */
        fun powerCategory(powerCategory: String) = powerCategory(JsonField.of(powerCategory))

        /**
         * Sets [Builder.powerCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.powerCategory] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun powerCategory(powerCategory: JsonField<String>) = apply {
            this.powerCategory = powerCategory
        }

        /**
         * Unique identifier of the organization which manufactures the telemetry tracking and
         * command subsystem for this bus.
         */
        fun telemetryTrackingManufacturerOrgId(telemetryTrackingManufacturerOrgId: String) =
            telemetryTrackingManufacturerOrgId(JsonField.of(telemetryTrackingManufacturerOrgId))

        /**
         * Sets [Builder.telemetryTrackingManufacturerOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telemetryTrackingManufacturerOrgId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun telemetryTrackingManufacturerOrgId(
            telemetryTrackingManufacturerOrgId: JsonField<String>
        ) = apply { this.telemetryTrackingManufacturerOrgId = telemetryTrackingManufacturerOrgId }

        /** Type of this bus. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Returns an immutable instance of [BusAbridged].
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
        fun build(): BusAbridged =
            BusAbridged(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("name", name),
                checkRequired("source", source),
                id,
                aocsNotes,
                avgDryMass,
                avgPayloadMass,
                avgPayloadPower,
                avgSpacecraftPower,
                avgWetMass,
                bodyDimensionX,
                bodyDimensionY,
                bodyDimensionZ,
                busKitDesignerOrgId,
                countryCode,
                createdAt,
                createdBy,
                description,
                generic,
                idEntity,
                launchEnvelopeDimensionX,
                launchEnvelopeDimensionY,
                launchEnvelopeDimensionZ,
                mainComputerManufacturerOrgId,
                manufacturerOrgId,
                massCategory,
                maxBolPowerLower,
                maxBolPowerUpper,
                maxBolStationMass,
                maxDryMass,
                maxEolPowerLower,
                maxEolPowerUpper,
                maxLaunchMassLower,
                maxLaunchMassUpper,
                maxPayloadMass,
                maxPayloadPower,
                maxSpacecraftPower,
                maxWetMass,
                medianDryMass,
                medianWetMass,
                minDryMass,
                minWetMass,
                numOrbitType,
                oapPayloadPower,
                oapSpacecraftPower,
                origin,
                origNetwork,
                payloadDimensionX,
                payloadDimensionY,
                payloadDimensionZ,
                payloadVolume,
                powerCategory,
                telemetryTrackingManufacturerOrgId,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BusAbridged = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        name()
        source()
        id()
        aocsNotes()
        avgDryMass()
        avgPayloadMass()
        avgPayloadPower()
        avgSpacecraftPower()
        avgWetMass()
        bodyDimensionX()
        bodyDimensionY()
        bodyDimensionZ()
        busKitDesignerOrgId()
        countryCode()
        createdAt()
        createdBy()
        description()
        generic()
        idEntity()
        launchEnvelopeDimensionX()
        launchEnvelopeDimensionY()
        launchEnvelopeDimensionZ()
        mainComputerManufacturerOrgId()
        manufacturerOrgId()
        massCategory()
        maxBolPowerLower()
        maxBolPowerUpper()
        maxBolStationMass()
        maxDryMass()
        maxEolPowerLower()
        maxEolPowerUpper()
        maxLaunchMassLower()
        maxLaunchMassUpper()
        maxPayloadMass()
        maxPayloadPower()
        maxSpacecraftPower()
        maxWetMass()
        medianDryMass()
        medianWetMass()
        minDryMass()
        minWetMass()
        numOrbitType()
        oapPayloadPower()
        oapSpacecraftPower()
        origin()
        origNetwork()
        payloadDimensionX()
        payloadDimensionY()
        payloadDimensionZ()
        payloadVolume()
        powerCategory()
        telemetryTrackingManufacturerOrgId()
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
    internal fun validity(): Int =
        (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (aocsNotes.asKnown().isPresent) 1 else 0) +
            (if (avgDryMass.asKnown().isPresent) 1 else 0) +
            (if (avgPayloadMass.asKnown().isPresent) 1 else 0) +
            (if (avgPayloadPower.asKnown().isPresent) 1 else 0) +
            (if (avgSpacecraftPower.asKnown().isPresent) 1 else 0) +
            (if (avgWetMass.asKnown().isPresent) 1 else 0) +
            (if (bodyDimensionX.asKnown().isPresent) 1 else 0) +
            (if (bodyDimensionY.asKnown().isPresent) 1 else 0) +
            (if (bodyDimensionZ.asKnown().isPresent) 1 else 0) +
            (if (busKitDesignerOrgId.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (generic.asKnown().isPresent) 1 else 0) +
            (if (idEntity.asKnown().isPresent) 1 else 0) +
            (if (launchEnvelopeDimensionX.asKnown().isPresent) 1 else 0) +
            (if (launchEnvelopeDimensionY.asKnown().isPresent) 1 else 0) +
            (if (launchEnvelopeDimensionZ.asKnown().isPresent) 1 else 0) +
            (if (mainComputerManufacturerOrgId.asKnown().isPresent) 1 else 0) +
            (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) +
            (if (massCategory.asKnown().isPresent) 1 else 0) +
            (if (maxBolPowerLower.asKnown().isPresent) 1 else 0) +
            (if (maxBolPowerUpper.asKnown().isPresent) 1 else 0) +
            (if (maxBolStationMass.asKnown().isPresent) 1 else 0) +
            (if (maxDryMass.asKnown().isPresent) 1 else 0) +
            (if (maxEolPowerLower.asKnown().isPresent) 1 else 0) +
            (if (maxEolPowerUpper.asKnown().isPresent) 1 else 0) +
            (if (maxLaunchMassLower.asKnown().isPresent) 1 else 0) +
            (if (maxLaunchMassUpper.asKnown().isPresent) 1 else 0) +
            (if (maxPayloadMass.asKnown().isPresent) 1 else 0) +
            (if (maxPayloadPower.asKnown().isPresent) 1 else 0) +
            (if (maxSpacecraftPower.asKnown().isPresent) 1 else 0) +
            (if (maxWetMass.asKnown().isPresent) 1 else 0) +
            (if (medianDryMass.asKnown().isPresent) 1 else 0) +
            (if (medianWetMass.asKnown().isPresent) 1 else 0) +
            (if (minDryMass.asKnown().isPresent) 1 else 0) +
            (if (minWetMass.asKnown().isPresent) 1 else 0) +
            (if (numOrbitType.asKnown().isPresent) 1 else 0) +
            (if (oapPayloadPower.asKnown().isPresent) 1 else 0) +
            (if (oapSpacecraftPower.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (payloadDimensionX.asKnown().isPresent) 1 else 0) +
            (if (payloadDimensionY.asKnown().isPresent) 1 else 0) +
            (if (payloadDimensionZ.asKnown().isPresent) 1 else 0) +
            (if (payloadVolume.asKnown().isPresent) 1 else 0) +
            (if (powerCategory.asKnown().isPresent) 1 else 0) +
            (if (telemetryTrackingManufacturerOrgId.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0)

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

        return /* spotless:off */ other is BusAbridged && classificationMarking == other.classificationMarking && dataMode == other.dataMode && name == other.name && source == other.source && id == other.id && aocsNotes == other.aocsNotes && avgDryMass == other.avgDryMass && avgPayloadMass == other.avgPayloadMass && avgPayloadPower == other.avgPayloadPower && avgSpacecraftPower == other.avgSpacecraftPower && avgWetMass == other.avgWetMass && bodyDimensionX == other.bodyDimensionX && bodyDimensionY == other.bodyDimensionY && bodyDimensionZ == other.bodyDimensionZ && busKitDesignerOrgId == other.busKitDesignerOrgId && countryCode == other.countryCode && createdAt == other.createdAt && createdBy == other.createdBy && description == other.description && generic == other.generic && idEntity == other.idEntity && launchEnvelopeDimensionX == other.launchEnvelopeDimensionX && launchEnvelopeDimensionY == other.launchEnvelopeDimensionY && launchEnvelopeDimensionZ == other.launchEnvelopeDimensionZ && mainComputerManufacturerOrgId == other.mainComputerManufacturerOrgId && manufacturerOrgId == other.manufacturerOrgId && massCategory == other.massCategory && maxBolPowerLower == other.maxBolPowerLower && maxBolPowerUpper == other.maxBolPowerUpper && maxBolStationMass == other.maxBolStationMass && maxDryMass == other.maxDryMass && maxEolPowerLower == other.maxEolPowerLower && maxEolPowerUpper == other.maxEolPowerUpper && maxLaunchMassLower == other.maxLaunchMassLower && maxLaunchMassUpper == other.maxLaunchMassUpper && maxPayloadMass == other.maxPayloadMass && maxPayloadPower == other.maxPayloadPower && maxSpacecraftPower == other.maxSpacecraftPower && maxWetMass == other.maxWetMass && medianDryMass == other.medianDryMass && medianWetMass == other.medianWetMass && minDryMass == other.minDryMass && minWetMass == other.minWetMass && numOrbitType == other.numOrbitType && oapPayloadPower == other.oapPayloadPower && oapSpacecraftPower == other.oapSpacecraftPower && origin == other.origin && origNetwork == other.origNetwork && payloadDimensionX == other.payloadDimensionX && payloadDimensionY == other.payloadDimensionY && payloadDimensionZ == other.payloadDimensionZ && payloadVolume == other.payloadVolume && powerCategory == other.powerCategory && telemetryTrackingManufacturerOrgId == other.telemetryTrackingManufacturerOrgId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, name, source, id, aocsNotes, avgDryMass, avgPayloadMass, avgPayloadPower, avgSpacecraftPower, avgWetMass, bodyDimensionX, bodyDimensionY, bodyDimensionZ, busKitDesignerOrgId, countryCode, createdAt, createdBy, description, generic, idEntity, launchEnvelopeDimensionX, launchEnvelopeDimensionY, launchEnvelopeDimensionZ, mainComputerManufacturerOrgId, manufacturerOrgId, massCategory, maxBolPowerLower, maxBolPowerUpper, maxBolStationMass, maxDryMass, maxEolPowerLower, maxEolPowerUpper, maxLaunchMassLower, maxLaunchMassUpper, maxPayloadMass, maxPayloadPower, maxSpacecraftPower, maxWetMass, medianDryMass, medianWetMass, minDryMass, minWetMass, numOrbitType, oapPayloadPower, oapSpacecraftPower, origin, origNetwork, payloadDimensionX, payloadDimensionY, payloadDimensionZ, payloadVolume, powerCategory, telemetryTrackingManufacturerOrgId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BusAbridged{classificationMarking=$classificationMarking, dataMode=$dataMode, name=$name, source=$source, id=$id, aocsNotes=$aocsNotes, avgDryMass=$avgDryMass, avgPayloadMass=$avgPayloadMass, avgPayloadPower=$avgPayloadPower, avgSpacecraftPower=$avgSpacecraftPower, avgWetMass=$avgWetMass, bodyDimensionX=$bodyDimensionX, bodyDimensionY=$bodyDimensionY, bodyDimensionZ=$bodyDimensionZ, busKitDesignerOrgId=$busKitDesignerOrgId, countryCode=$countryCode, createdAt=$createdAt, createdBy=$createdBy, description=$description, generic=$generic, idEntity=$idEntity, launchEnvelopeDimensionX=$launchEnvelopeDimensionX, launchEnvelopeDimensionY=$launchEnvelopeDimensionY, launchEnvelopeDimensionZ=$launchEnvelopeDimensionZ, mainComputerManufacturerOrgId=$mainComputerManufacturerOrgId, manufacturerOrgId=$manufacturerOrgId, massCategory=$massCategory, maxBolPowerLower=$maxBolPowerLower, maxBolPowerUpper=$maxBolPowerUpper, maxBolStationMass=$maxBolStationMass, maxDryMass=$maxDryMass, maxEolPowerLower=$maxEolPowerLower, maxEolPowerUpper=$maxEolPowerUpper, maxLaunchMassLower=$maxLaunchMassLower, maxLaunchMassUpper=$maxLaunchMassUpper, maxPayloadMass=$maxPayloadMass, maxPayloadPower=$maxPayloadPower, maxSpacecraftPower=$maxSpacecraftPower, maxWetMass=$maxWetMass, medianDryMass=$medianDryMass, medianWetMass=$medianWetMass, minDryMass=$minDryMass, minWetMass=$minWetMass, numOrbitType=$numOrbitType, oapPayloadPower=$oapPayloadPower, oapSpacecraftPower=$oapSpacecraftPower, origin=$origin, origNetwork=$origNetwork, payloadDimensionX=$payloadDimensionX, payloadDimensionY=$payloadDimensionY, payloadDimensionZ=$payloadDimensionZ, payloadVolume=$payloadVolume, powerCategory=$powerCategory, telemetryTrackingManufacturerOrgId=$telemetryTrackingManufacturerOrgId, type=$type, additionalProperties=$additionalProperties}"
}

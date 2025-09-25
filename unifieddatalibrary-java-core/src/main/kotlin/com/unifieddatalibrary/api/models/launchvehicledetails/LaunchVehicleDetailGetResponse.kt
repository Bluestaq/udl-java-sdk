// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchvehicledetails

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
import com.unifieddatalibrary.api.models.OrganizationFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Model representation of launch vehicle details and characteristics, compiled by a particular
 * source. A vehicle may have multiple details records from various sources.
 */
class LaunchVehicleDetailGetResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idLaunchVehicle: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val attitudeAccuracy: JsonField<Double>,
    private val category: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val deploymentRotationRate: JsonField<Double>,
    private val diameter: JsonField<Double>,
    private val estLaunchPrice: JsonField<Double>,
    private val estLaunchPriceTypical: JsonField<Double>,
    private val fairingExternalDiameter: JsonField<Double>,
    private val fairingInternalDiameter: JsonField<Double>,
    private val fairingLength: JsonField<Double>,
    private val fairingMass: JsonField<Double>,
    private val fairingMaterial: JsonField<String>,
    private val fairingName: JsonField<String>,
    private val fairingNotes: JsonField<String>,
    private val family: JsonField<String>,
    private val geoPayloadMass: JsonField<Double>,
    private val gtoInj3SigAccuracyApogeeMargin: JsonField<Double>,
    private val gtoInj3SigAccuracyApogeeTarget: JsonField<Double>,
    private val gtoInj3SigAccuracyInclinationMargin: JsonField<Double>,
    private val gtoInj3SigAccuracyInclinationTarget: JsonField<Double>,
    private val gtoInj3SigAccuracyPerigeeMargin: JsonField<Double>,
    private val gtoInj3SigAccuracyPerigeeTarget: JsonField<Double>,
    private val gtoPayloadMass: JsonField<Double>,
    private val launchMass: JsonField<Double>,
    private val launchPrefix: JsonField<String>,
    private val length: JsonField<Double>,
    private val leoPayloadMass: JsonField<Double>,
    private val manufacturerOrg: JsonField<OrganizationFull>,
    private val manufacturerOrgId: JsonField<String>,
    private val maxAccelLoad: JsonField<Double>,
    private val maxAcousticLevel: JsonField<Double>,
    private val maxAcousticLevelRange: JsonField<Double>,
    private val maxFairingPressureChange: JsonField<Double>,
    private val maxFlightShockForce: JsonField<Double>,
    private val maxFlightShockFreq: JsonField<Double>,
    private val maxPayloadFreqLat: JsonField<Double>,
    private val maxPayloadFreqLon: JsonField<Double>,
    private val minorVariant: JsonField<String>,
    private val notes: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val oxidizer: JsonField<String>,
    private val payloadNotes: JsonField<String>,
    private val payloadSeparationRate: JsonField<Double>,
    private val propellant: JsonField<String>,
    private val soundPressureLevel: JsonField<Double>,
    private val sourceUrl: JsonField<String>,
    private val ssoPayloadMass: JsonField<Double>,
    private val tags: JsonField<List<String>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val variant: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idLaunchVehicle")
        @ExcludeMissing
        idLaunchVehicle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attitudeAccuracy")
        @ExcludeMissing
        attitudeAccuracy: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deploymentRotationRate")
        @ExcludeMissing
        deploymentRotationRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("diameter") @ExcludeMissing diameter: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("estLaunchPrice")
        @ExcludeMissing
        estLaunchPrice: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("estLaunchPriceTypical")
        @ExcludeMissing
        estLaunchPriceTypical: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fairingExternalDiameter")
        @ExcludeMissing
        fairingExternalDiameter: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fairingInternalDiameter")
        @ExcludeMissing
        fairingInternalDiameter: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fairingLength")
        @ExcludeMissing
        fairingLength: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fairingMass")
        @ExcludeMissing
        fairingMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fairingMaterial")
        @ExcludeMissing
        fairingMaterial: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fairingName")
        @ExcludeMissing
        fairingName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fairingNotes")
        @ExcludeMissing
        fairingNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("family") @ExcludeMissing family: JsonField<String> = JsonMissing.of(),
        @JsonProperty("geoPayloadMass")
        @ExcludeMissing
        geoPayloadMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gtoInj3SigAccuracyApogeeMargin")
        @ExcludeMissing
        gtoInj3SigAccuracyApogeeMargin: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gtoInj3SigAccuracyApogeeTarget")
        @ExcludeMissing
        gtoInj3SigAccuracyApogeeTarget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gtoInj3SigAccuracyInclinationMargin")
        @ExcludeMissing
        gtoInj3SigAccuracyInclinationMargin: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gtoInj3SigAccuracyInclinationTarget")
        @ExcludeMissing
        gtoInj3SigAccuracyInclinationTarget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gtoInj3SigAccuracyPerigeeMargin")
        @ExcludeMissing
        gtoInj3SigAccuracyPerigeeMargin: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gtoInj3SigAccuracyPerigeeTarget")
        @ExcludeMissing
        gtoInj3SigAccuracyPerigeeTarget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gtoPayloadMass")
        @ExcludeMissing
        gtoPayloadMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchMass")
        @ExcludeMissing
        launchMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchPrefix")
        @ExcludeMissing
        launchPrefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("length") @ExcludeMissing length: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("leoPayloadMass")
        @ExcludeMissing
        leoPayloadMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("manufacturerOrg")
        @ExcludeMissing
        manufacturerOrg: JsonField<OrganizationFull> = JsonMissing.of(),
        @JsonProperty("manufacturerOrgId")
        @ExcludeMissing
        manufacturerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxAccelLoad")
        @ExcludeMissing
        maxAccelLoad: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxAcousticLevel")
        @ExcludeMissing
        maxAcousticLevel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxAcousticLevelRange")
        @ExcludeMissing
        maxAcousticLevelRange: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxFairingPressureChange")
        @ExcludeMissing
        maxFairingPressureChange: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxFlightShockForce")
        @ExcludeMissing
        maxFlightShockForce: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxFlightShockFreq")
        @ExcludeMissing
        maxFlightShockFreq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxPayloadFreqLat")
        @ExcludeMissing
        maxPayloadFreqLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxPayloadFreqLon")
        @ExcludeMissing
        maxPayloadFreqLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minorVariant")
        @ExcludeMissing
        minorVariant: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("oxidizer") @ExcludeMissing oxidizer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payloadNotes")
        @ExcludeMissing
        payloadNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payloadSeparationRate")
        @ExcludeMissing
        payloadSeparationRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("propellant")
        @ExcludeMissing
        propellant: JsonField<String> = JsonMissing.of(),
        @JsonProperty("soundPressureLevel")
        @ExcludeMissing
        soundPressureLevel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sourceURL") @ExcludeMissing sourceUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ssoPayloadMass")
        @ExcludeMissing
        ssoPayloadMass: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("variant") @ExcludeMissing variant: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idLaunchVehicle,
        source,
        id,
        attitudeAccuracy,
        category,
        createdAt,
        createdBy,
        deploymentRotationRate,
        diameter,
        estLaunchPrice,
        estLaunchPriceTypical,
        fairingExternalDiameter,
        fairingInternalDiameter,
        fairingLength,
        fairingMass,
        fairingMaterial,
        fairingName,
        fairingNotes,
        family,
        geoPayloadMass,
        gtoInj3SigAccuracyApogeeMargin,
        gtoInj3SigAccuracyApogeeTarget,
        gtoInj3SigAccuracyInclinationMargin,
        gtoInj3SigAccuracyInclinationTarget,
        gtoInj3SigAccuracyPerigeeMargin,
        gtoInj3SigAccuracyPerigeeTarget,
        gtoPayloadMass,
        launchMass,
        launchPrefix,
        length,
        leoPayloadMass,
        manufacturerOrg,
        manufacturerOrgId,
        maxAccelLoad,
        maxAcousticLevel,
        maxAcousticLevelRange,
        maxFairingPressureChange,
        maxFlightShockForce,
        maxFlightShockFreq,
        maxPayloadFreqLat,
        maxPayloadFreqLon,
        minorVariant,
        notes,
        origin,
        origNetwork,
        oxidizer,
        payloadNotes,
        payloadSeparationRate,
        propellant,
        soundPressureLevel,
        sourceUrl,
        ssoPayloadMass,
        tags,
        updatedAt,
        updatedBy,
        variant,
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
     * Identifier of the parent launch vehicle record.
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
     * Launch vehicle attitude accuracy (degrees).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun attitudeAccuracy(): Optional<Double> = attitudeAccuracy.getOptional("attitudeAccuracy")

    /**
     * Vehicle category.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun category(): Optional<String> = category.getOptional("category")

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
     * Launch vehicle deployment rotation rate in RPM.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun deploymentRotationRate(): Optional<Double> =
        deploymentRotationRate.getOptional("deploymentRotationRate")

    /**
     * Vehicle diameter in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun diameter(): Optional<Double> = diameter.getOptional("diameter")

    /**
     * Launch vehicle estimated launch price in US dollars.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun estLaunchPrice(): Optional<Double> = estLaunchPrice.getOptional("estLaunchPrice")

    /**
     * Launch vehicle typical estimated launch price in US dollars.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun estLaunchPriceTypical(): Optional<Double> =
        estLaunchPriceTypical.getOptional("estLaunchPriceTypical")

    /**
     * Vehicle fairing maximum external diameter in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fairingExternalDiameter(): Optional<Double> =
        fairingExternalDiameter.getOptional("fairingExternalDiameter")

    /**
     * Vehicle fairing maximum internal diameter in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fairingInternalDiameter(): Optional<Double> =
        fairingInternalDiameter.getOptional("fairingInternalDiameter")

    /**
     * Vehicle fairing length in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fairingLength(): Optional<Double> = fairingLength.getOptional("fairingLength")

    /**
     * Vehicle fairing mass in kg.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fairingMass(): Optional<Double> = fairingMass.getOptional("fairingMass")

    /**
     * Fairing material.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fairingMaterial(): Optional<String> = fairingMaterial.getOptional("fairingMaterial")

    /**
     * Name of the fairing.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fairingName(): Optional<String> = fairingName.getOptional("fairingName")

    /**
     * Notes/Description of the launch vehicle fairing.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fairingNotes(): Optional<String> = fairingNotes.getOptional("fairingNotes")

    /**
     * Vehicle family.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun family(): Optional<String> = family.getOptional("family")

    /**
     * Maximum vehicle payload mass to GEO orbit in kg.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoPayloadMass(): Optional<Double> = geoPayloadMass.getOptional("geoPayloadMass")

    /**
     * Launch vehicle GTO Injection 3 Sigma Accuracy Apogee Margin (degrees).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gtoInj3SigAccuracyApogeeMargin(): Optional<Double> =
        gtoInj3SigAccuracyApogeeMargin.getOptional("gtoInj3SigAccuracyApogeeMargin")

    /**
     * Launch vehicle GTO Injection 3 Sigma Accuracy Apogee Target (degrees).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gtoInj3SigAccuracyApogeeTarget(): Optional<Double> =
        gtoInj3SigAccuracyApogeeTarget.getOptional("gtoInj3SigAccuracyApogeeTarget")

    /**
     * Launch vehicle GTO Injection 3 Sigma Accuracy Inclination Margin (degrees).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gtoInj3SigAccuracyInclinationMargin(): Optional<Double> =
        gtoInj3SigAccuracyInclinationMargin.getOptional("gtoInj3SigAccuracyInclinationMargin")

    /**
     * Launch vehicle GTO Injection 3 Sigma Accuracy Inclination Target (degrees).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gtoInj3SigAccuracyInclinationTarget(): Optional<Double> =
        gtoInj3SigAccuracyInclinationTarget.getOptional("gtoInj3SigAccuracyInclinationTarget")

    /**
     * Launch vehicle GTO Injection 3 Sigma Accuracy Perigee Margin (degrees).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gtoInj3SigAccuracyPerigeeMargin(): Optional<Double> =
        gtoInj3SigAccuracyPerigeeMargin.getOptional("gtoInj3SigAccuracyPerigeeMargin")

    /**
     * Launch vehicle GTO Injection 3 Sigma Accuracy Perigee Target (degrees).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gtoInj3SigAccuracyPerigeeTarget(): Optional<Double> =
        gtoInj3SigAccuracyPerigeeTarget.getOptional("gtoInj3SigAccuracyPerigeeTarget")

    /**
     * Max vehicle payload mass to Geo-Transfer Orbit in kg.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gtoPayloadMass(): Optional<Double> = gtoPayloadMass.getOptional("gtoPayloadMass")

    /**
     * Vehicle total mass at launch time in kg (including all boosters).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchMass(): Optional<Double> = launchMass.getOptional("launchMass")

    /**
     * Vehicle launch prefix.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchPrefix(): Optional<String> = launchPrefix.getOptional("launchPrefix")

    /**
     * Vehicle length in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun length(): Optional<Double> = length.getOptional("length")

    /**
     * Max vehicle payload mass to LEO orbit in kg.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun leoPayloadMass(): Optional<Double> = leoPayloadMass.getOptional("leoPayloadMass")

    /**
     * An organization such as a corporation, manufacturer, consortium, government, etc. An
     * organization may have parent and child organizations as well as link to a former organization
     * if this org previously existed as another organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun manufacturerOrg(): Optional<OrganizationFull> =
        manufacturerOrg.getOptional("manufacturerOrg")

    /**
     * ID of the organization that manufactures the launch vehicle.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun manufacturerOrgId(): Optional<String> = manufacturerOrgId.getOptional("manufacturerOrgId")

    /**
     * Vehicle maximum acceleration load in g.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxAccelLoad(): Optional<Double> = maxAccelLoad.getOptional("maxAccelLoad")

    /**
     * Vehicle maximum acoustic level in dB.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxAcousticLevel(): Optional<Double> = maxAcousticLevel.getOptional("maxAcousticLevel")

    /**
     * Vehicle maximum acoustic level range in Hz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxAcousticLevelRange(): Optional<Double> =
        maxAcousticLevelRange.getOptional("maxAcousticLevelRange")

    /**
     * Vehicle fairing maximum pressure change in kPa/sec.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxFairingPressureChange(): Optional<Double> =
        maxFairingPressureChange.getOptional("maxFairingPressureChange")

    /**
     * Vehicle maximum flight shock force in g.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxFlightShockForce(): Optional<Double> =
        maxFlightShockForce.getOptional("maxFlightShockForce")

    /**
     * Vehicle maximum flight shock frequency in Hz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxFlightShockFreq(): Optional<Double> =
        maxFlightShockFreq.getOptional("maxFlightShockFreq")

    /**
     * Vehicle maximum payload lateral frequency in Hz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxPayloadFreqLat(): Optional<Double> = maxPayloadFreqLat.getOptional("maxPayloadFreqLat")

    /**
     * Vehicle maximum payload longitudinal frequency in Hz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxPayloadFreqLon(): Optional<Double> = maxPayloadFreqLon.getOptional("maxPayloadFreqLon")

    /**
     * Vehicle minor variant.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minorVariant(): Optional<String> = minorVariant.getOptional("minorVariant")

    /**
     * Notes/Description of the launch vehicle.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

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
     * Oxidizer type.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun oxidizer(): Optional<String> = oxidizer.getOptional("oxidizer")

    /**
     * Notes/Description of the launch vehicle payload.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun payloadNotes(): Optional<String> = payloadNotes.getOptional("payloadNotes")

    /**
     * Launch vehicle payload separation rate in m/s.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun payloadSeparationRate(): Optional<Double> =
        payloadSeparationRate.getOptional("payloadSeparationRate")

    /**
     * Propellant type.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun propellant(): Optional<String> = propellant.getOptional("propellant")

    /**
     * Vehicle overall sound pressure level in dB.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun soundPressureLevel(): Optional<Double> =
        soundPressureLevel.getOptional("soundPressureLevel")

    /**
     * Optional URL for additional information on the vehicle.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceUrl(): Optional<String> = sourceUrl.getOptional("sourceURL")

    /**
     * Max vehicle payload mass to Sun-Synchronous Orbit in kg.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ssoPayloadMass(): Optional<Double> = ssoPayloadMass.getOptional("ssoPayloadMass")

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
     * Vehicle variant.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun variant(): Optional<String> = variant.getOptional("variant")

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
     * Returns the raw JSON value of [attitudeAccuracy].
     *
     * Unlike [attitudeAccuracy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("attitudeAccuracy")
    @ExcludeMissing
    fun _attitudeAccuracy(): JsonField<Double> = attitudeAccuracy

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

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
     * Returns the raw JSON value of [deploymentRotationRate].
     *
     * Unlike [deploymentRotationRate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("deploymentRotationRate")
    @ExcludeMissing
    fun _deploymentRotationRate(): JsonField<Double> = deploymentRotationRate

    /**
     * Returns the raw JSON value of [diameter].
     *
     * Unlike [diameter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("diameter") @ExcludeMissing fun _diameter(): JsonField<Double> = diameter

    /**
     * Returns the raw JSON value of [estLaunchPrice].
     *
     * Unlike [estLaunchPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("estLaunchPrice")
    @ExcludeMissing
    fun _estLaunchPrice(): JsonField<Double> = estLaunchPrice

    /**
     * Returns the raw JSON value of [estLaunchPriceTypical].
     *
     * Unlike [estLaunchPriceTypical], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("estLaunchPriceTypical")
    @ExcludeMissing
    fun _estLaunchPriceTypical(): JsonField<Double> = estLaunchPriceTypical

    /**
     * Returns the raw JSON value of [fairingExternalDiameter].
     *
     * Unlike [fairingExternalDiameter], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("fairingExternalDiameter")
    @ExcludeMissing
    fun _fairingExternalDiameter(): JsonField<Double> = fairingExternalDiameter

    /**
     * Returns the raw JSON value of [fairingInternalDiameter].
     *
     * Unlike [fairingInternalDiameter], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("fairingInternalDiameter")
    @ExcludeMissing
    fun _fairingInternalDiameter(): JsonField<Double> = fairingInternalDiameter

    /**
     * Returns the raw JSON value of [fairingLength].
     *
     * Unlike [fairingLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fairingLength")
    @ExcludeMissing
    fun _fairingLength(): JsonField<Double> = fairingLength

    /**
     * Returns the raw JSON value of [fairingMass].
     *
     * Unlike [fairingMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fairingMass") @ExcludeMissing fun _fairingMass(): JsonField<Double> = fairingMass

    /**
     * Returns the raw JSON value of [fairingMaterial].
     *
     * Unlike [fairingMaterial], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fairingMaterial")
    @ExcludeMissing
    fun _fairingMaterial(): JsonField<String> = fairingMaterial

    /**
     * Returns the raw JSON value of [fairingName].
     *
     * Unlike [fairingName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fairingName") @ExcludeMissing fun _fairingName(): JsonField<String> = fairingName

    /**
     * Returns the raw JSON value of [fairingNotes].
     *
     * Unlike [fairingNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fairingNotes")
    @ExcludeMissing
    fun _fairingNotes(): JsonField<String> = fairingNotes

    /**
     * Returns the raw JSON value of [family].
     *
     * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("family") @ExcludeMissing fun _family(): JsonField<String> = family

    /**
     * Returns the raw JSON value of [geoPayloadMass].
     *
     * Unlike [geoPayloadMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoPayloadMass")
    @ExcludeMissing
    fun _geoPayloadMass(): JsonField<Double> = geoPayloadMass

    /**
     * Returns the raw JSON value of [gtoInj3SigAccuracyApogeeMargin].
     *
     * Unlike [gtoInj3SigAccuracyApogeeMargin], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("gtoInj3SigAccuracyApogeeMargin")
    @ExcludeMissing
    fun _gtoInj3SigAccuracyApogeeMargin(): JsonField<Double> = gtoInj3SigAccuracyApogeeMargin

    /**
     * Returns the raw JSON value of [gtoInj3SigAccuracyApogeeTarget].
     *
     * Unlike [gtoInj3SigAccuracyApogeeTarget], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("gtoInj3SigAccuracyApogeeTarget")
    @ExcludeMissing
    fun _gtoInj3SigAccuracyApogeeTarget(): JsonField<Double> = gtoInj3SigAccuracyApogeeTarget

    /**
     * Returns the raw JSON value of [gtoInj3SigAccuracyInclinationMargin].
     *
     * Unlike [gtoInj3SigAccuracyInclinationMargin], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("gtoInj3SigAccuracyInclinationMargin")
    @ExcludeMissing
    fun _gtoInj3SigAccuracyInclinationMargin(): JsonField<Double> =
        gtoInj3SigAccuracyInclinationMargin

    /**
     * Returns the raw JSON value of [gtoInj3SigAccuracyInclinationTarget].
     *
     * Unlike [gtoInj3SigAccuracyInclinationTarget], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("gtoInj3SigAccuracyInclinationTarget")
    @ExcludeMissing
    fun _gtoInj3SigAccuracyInclinationTarget(): JsonField<Double> =
        gtoInj3SigAccuracyInclinationTarget

    /**
     * Returns the raw JSON value of [gtoInj3SigAccuracyPerigeeMargin].
     *
     * Unlike [gtoInj3SigAccuracyPerigeeMargin], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("gtoInj3SigAccuracyPerigeeMargin")
    @ExcludeMissing
    fun _gtoInj3SigAccuracyPerigeeMargin(): JsonField<Double> = gtoInj3SigAccuracyPerigeeMargin

    /**
     * Returns the raw JSON value of [gtoInj3SigAccuracyPerigeeTarget].
     *
     * Unlike [gtoInj3SigAccuracyPerigeeTarget], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("gtoInj3SigAccuracyPerigeeTarget")
    @ExcludeMissing
    fun _gtoInj3SigAccuracyPerigeeTarget(): JsonField<Double> = gtoInj3SigAccuracyPerigeeTarget

    /**
     * Returns the raw JSON value of [gtoPayloadMass].
     *
     * Unlike [gtoPayloadMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gtoPayloadMass")
    @ExcludeMissing
    fun _gtoPayloadMass(): JsonField<Double> = gtoPayloadMass

    /**
     * Returns the raw JSON value of [launchMass].
     *
     * Unlike [launchMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchMass") @ExcludeMissing fun _launchMass(): JsonField<Double> = launchMass

    /**
     * Returns the raw JSON value of [launchPrefix].
     *
     * Unlike [launchPrefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchPrefix")
    @ExcludeMissing
    fun _launchPrefix(): JsonField<String> = launchPrefix

    /**
     * Returns the raw JSON value of [length].
     *
     * Unlike [length], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Double> = length

    /**
     * Returns the raw JSON value of [leoPayloadMass].
     *
     * Unlike [leoPayloadMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("leoPayloadMass")
    @ExcludeMissing
    fun _leoPayloadMass(): JsonField<Double> = leoPayloadMass

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
     * Unlike [manufacturerOrgId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("manufacturerOrgId")
    @ExcludeMissing
    fun _manufacturerOrgId(): JsonField<String> = manufacturerOrgId

    /**
     * Returns the raw JSON value of [maxAccelLoad].
     *
     * Unlike [maxAccelLoad], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxAccelLoad")
    @ExcludeMissing
    fun _maxAccelLoad(): JsonField<Double> = maxAccelLoad

    /**
     * Returns the raw JSON value of [maxAcousticLevel].
     *
     * Unlike [maxAcousticLevel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxAcousticLevel")
    @ExcludeMissing
    fun _maxAcousticLevel(): JsonField<Double> = maxAcousticLevel

    /**
     * Returns the raw JSON value of [maxAcousticLevelRange].
     *
     * Unlike [maxAcousticLevelRange], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxAcousticLevelRange")
    @ExcludeMissing
    fun _maxAcousticLevelRange(): JsonField<Double> = maxAcousticLevelRange

    /**
     * Returns the raw JSON value of [maxFairingPressureChange].
     *
     * Unlike [maxFairingPressureChange], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("maxFairingPressureChange")
    @ExcludeMissing
    fun _maxFairingPressureChange(): JsonField<Double> = maxFairingPressureChange

    /**
     * Returns the raw JSON value of [maxFlightShockForce].
     *
     * Unlike [maxFlightShockForce], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxFlightShockForce")
    @ExcludeMissing
    fun _maxFlightShockForce(): JsonField<Double> = maxFlightShockForce

    /**
     * Returns the raw JSON value of [maxFlightShockFreq].
     *
     * Unlike [maxFlightShockFreq], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxFlightShockFreq")
    @ExcludeMissing
    fun _maxFlightShockFreq(): JsonField<Double> = maxFlightShockFreq

    /**
     * Returns the raw JSON value of [maxPayloadFreqLat].
     *
     * Unlike [maxPayloadFreqLat], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxPayloadFreqLat")
    @ExcludeMissing
    fun _maxPayloadFreqLat(): JsonField<Double> = maxPayloadFreqLat

    /**
     * Returns the raw JSON value of [maxPayloadFreqLon].
     *
     * Unlike [maxPayloadFreqLon], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxPayloadFreqLon")
    @ExcludeMissing
    fun _maxPayloadFreqLon(): JsonField<Double> = maxPayloadFreqLon

    /**
     * Returns the raw JSON value of [minorVariant].
     *
     * Unlike [minorVariant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minorVariant")
    @ExcludeMissing
    fun _minorVariant(): JsonField<String> = minorVariant

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
    @JsonProperty("origNetwork") @ExcludeMissing fun _origNetwork(): JsonField<String> = origNetwork

    /**
     * Returns the raw JSON value of [oxidizer].
     *
     * Unlike [oxidizer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("oxidizer") @ExcludeMissing fun _oxidizer(): JsonField<String> = oxidizer

    /**
     * Returns the raw JSON value of [payloadNotes].
     *
     * Unlike [payloadNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payloadNotes")
    @ExcludeMissing
    fun _payloadNotes(): JsonField<String> = payloadNotes

    /**
     * Returns the raw JSON value of [payloadSeparationRate].
     *
     * Unlike [payloadSeparationRate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payloadSeparationRate")
    @ExcludeMissing
    fun _payloadSeparationRate(): JsonField<Double> = payloadSeparationRate

    /**
     * Returns the raw JSON value of [propellant].
     *
     * Unlike [propellant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propellant") @ExcludeMissing fun _propellant(): JsonField<String> = propellant

    /**
     * Returns the raw JSON value of [soundPressureLevel].
     *
     * Unlike [soundPressureLevel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("soundPressureLevel")
    @ExcludeMissing
    fun _soundPressureLevel(): JsonField<Double> = soundPressureLevel

    /**
     * Returns the raw JSON value of [sourceUrl].
     *
     * Unlike [sourceUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceURL") @ExcludeMissing fun _sourceUrl(): JsonField<String> = sourceUrl

    /**
     * Returns the raw JSON value of [ssoPayloadMass].
     *
     * Unlike [ssoPayloadMass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ssoPayloadMass")
    @ExcludeMissing
    fun _ssoPayloadMass(): JsonField<Double> = ssoPayloadMass

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
     * Returns the raw JSON value of [variant].
     *
     * Unlike [variant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("variant") @ExcludeMissing fun _variant(): JsonField<String> = variant

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
         * [LaunchVehicleDetailGetResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idLaunchVehicle()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LaunchVehicleDetailGetResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idLaunchVehicle: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var attitudeAccuracy: JsonField<Double> = JsonMissing.of()
        private var category: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var deploymentRotationRate: JsonField<Double> = JsonMissing.of()
        private var diameter: JsonField<Double> = JsonMissing.of()
        private var estLaunchPrice: JsonField<Double> = JsonMissing.of()
        private var estLaunchPriceTypical: JsonField<Double> = JsonMissing.of()
        private var fairingExternalDiameter: JsonField<Double> = JsonMissing.of()
        private var fairingInternalDiameter: JsonField<Double> = JsonMissing.of()
        private var fairingLength: JsonField<Double> = JsonMissing.of()
        private var fairingMass: JsonField<Double> = JsonMissing.of()
        private var fairingMaterial: JsonField<String> = JsonMissing.of()
        private var fairingName: JsonField<String> = JsonMissing.of()
        private var fairingNotes: JsonField<String> = JsonMissing.of()
        private var family: JsonField<String> = JsonMissing.of()
        private var geoPayloadMass: JsonField<Double> = JsonMissing.of()
        private var gtoInj3SigAccuracyApogeeMargin: JsonField<Double> = JsonMissing.of()
        private var gtoInj3SigAccuracyApogeeTarget: JsonField<Double> = JsonMissing.of()
        private var gtoInj3SigAccuracyInclinationMargin: JsonField<Double> = JsonMissing.of()
        private var gtoInj3SigAccuracyInclinationTarget: JsonField<Double> = JsonMissing.of()
        private var gtoInj3SigAccuracyPerigeeMargin: JsonField<Double> = JsonMissing.of()
        private var gtoInj3SigAccuracyPerigeeTarget: JsonField<Double> = JsonMissing.of()
        private var gtoPayloadMass: JsonField<Double> = JsonMissing.of()
        private var launchMass: JsonField<Double> = JsonMissing.of()
        private var launchPrefix: JsonField<String> = JsonMissing.of()
        private var length: JsonField<Double> = JsonMissing.of()
        private var leoPayloadMass: JsonField<Double> = JsonMissing.of()
        private var manufacturerOrg: JsonField<OrganizationFull> = JsonMissing.of()
        private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
        private var maxAccelLoad: JsonField<Double> = JsonMissing.of()
        private var maxAcousticLevel: JsonField<Double> = JsonMissing.of()
        private var maxAcousticLevelRange: JsonField<Double> = JsonMissing.of()
        private var maxFairingPressureChange: JsonField<Double> = JsonMissing.of()
        private var maxFlightShockForce: JsonField<Double> = JsonMissing.of()
        private var maxFlightShockFreq: JsonField<Double> = JsonMissing.of()
        private var maxPayloadFreqLat: JsonField<Double> = JsonMissing.of()
        private var maxPayloadFreqLon: JsonField<Double> = JsonMissing.of()
        private var minorVariant: JsonField<String> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var oxidizer: JsonField<String> = JsonMissing.of()
        private var payloadNotes: JsonField<String> = JsonMissing.of()
        private var payloadSeparationRate: JsonField<Double> = JsonMissing.of()
        private var propellant: JsonField<String> = JsonMissing.of()
        private var soundPressureLevel: JsonField<Double> = JsonMissing.of()
        private var sourceUrl: JsonField<String> = JsonMissing.of()
        private var ssoPayloadMass: JsonField<Double> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var variant: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(launchVehicleDetailGetResponse: LaunchVehicleDetailGetResponse) = apply {
            classificationMarking = launchVehicleDetailGetResponse.classificationMarking
            dataMode = launchVehicleDetailGetResponse.dataMode
            idLaunchVehicle = launchVehicleDetailGetResponse.idLaunchVehicle
            source = launchVehicleDetailGetResponse.source
            id = launchVehicleDetailGetResponse.id
            attitudeAccuracy = launchVehicleDetailGetResponse.attitudeAccuracy
            category = launchVehicleDetailGetResponse.category
            createdAt = launchVehicleDetailGetResponse.createdAt
            createdBy = launchVehicleDetailGetResponse.createdBy
            deploymentRotationRate = launchVehicleDetailGetResponse.deploymentRotationRate
            diameter = launchVehicleDetailGetResponse.diameter
            estLaunchPrice = launchVehicleDetailGetResponse.estLaunchPrice
            estLaunchPriceTypical = launchVehicleDetailGetResponse.estLaunchPriceTypical
            fairingExternalDiameter = launchVehicleDetailGetResponse.fairingExternalDiameter
            fairingInternalDiameter = launchVehicleDetailGetResponse.fairingInternalDiameter
            fairingLength = launchVehicleDetailGetResponse.fairingLength
            fairingMass = launchVehicleDetailGetResponse.fairingMass
            fairingMaterial = launchVehicleDetailGetResponse.fairingMaterial
            fairingName = launchVehicleDetailGetResponse.fairingName
            fairingNotes = launchVehicleDetailGetResponse.fairingNotes
            family = launchVehicleDetailGetResponse.family
            geoPayloadMass = launchVehicleDetailGetResponse.geoPayloadMass
            gtoInj3SigAccuracyApogeeMargin =
                launchVehicleDetailGetResponse.gtoInj3SigAccuracyApogeeMargin
            gtoInj3SigAccuracyApogeeTarget =
                launchVehicleDetailGetResponse.gtoInj3SigAccuracyApogeeTarget
            gtoInj3SigAccuracyInclinationMargin =
                launchVehicleDetailGetResponse.gtoInj3SigAccuracyInclinationMargin
            gtoInj3SigAccuracyInclinationTarget =
                launchVehicleDetailGetResponse.gtoInj3SigAccuracyInclinationTarget
            gtoInj3SigAccuracyPerigeeMargin =
                launchVehicleDetailGetResponse.gtoInj3SigAccuracyPerigeeMargin
            gtoInj3SigAccuracyPerigeeTarget =
                launchVehicleDetailGetResponse.gtoInj3SigAccuracyPerigeeTarget
            gtoPayloadMass = launchVehicleDetailGetResponse.gtoPayloadMass
            launchMass = launchVehicleDetailGetResponse.launchMass
            launchPrefix = launchVehicleDetailGetResponse.launchPrefix
            length = launchVehicleDetailGetResponse.length
            leoPayloadMass = launchVehicleDetailGetResponse.leoPayloadMass
            manufacturerOrg = launchVehicleDetailGetResponse.manufacturerOrg
            manufacturerOrgId = launchVehicleDetailGetResponse.manufacturerOrgId
            maxAccelLoad = launchVehicleDetailGetResponse.maxAccelLoad
            maxAcousticLevel = launchVehicleDetailGetResponse.maxAcousticLevel
            maxAcousticLevelRange = launchVehicleDetailGetResponse.maxAcousticLevelRange
            maxFairingPressureChange = launchVehicleDetailGetResponse.maxFairingPressureChange
            maxFlightShockForce = launchVehicleDetailGetResponse.maxFlightShockForce
            maxFlightShockFreq = launchVehicleDetailGetResponse.maxFlightShockFreq
            maxPayloadFreqLat = launchVehicleDetailGetResponse.maxPayloadFreqLat
            maxPayloadFreqLon = launchVehicleDetailGetResponse.maxPayloadFreqLon
            minorVariant = launchVehicleDetailGetResponse.minorVariant
            notes = launchVehicleDetailGetResponse.notes
            origin = launchVehicleDetailGetResponse.origin
            origNetwork = launchVehicleDetailGetResponse.origNetwork
            oxidizer = launchVehicleDetailGetResponse.oxidizer
            payloadNotes = launchVehicleDetailGetResponse.payloadNotes
            payloadSeparationRate = launchVehicleDetailGetResponse.payloadSeparationRate
            propellant = launchVehicleDetailGetResponse.propellant
            soundPressureLevel = launchVehicleDetailGetResponse.soundPressureLevel
            sourceUrl = launchVehicleDetailGetResponse.sourceUrl
            ssoPayloadMass = launchVehicleDetailGetResponse.ssoPayloadMass
            tags = launchVehicleDetailGetResponse.tags.map { it.toMutableList() }
            updatedAt = launchVehicleDetailGetResponse.updatedAt
            updatedBy = launchVehicleDetailGetResponse.updatedBy
            variant = launchVehicleDetailGetResponse.variant
            additionalProperties =
                launchVehicleDetailGetResponse.additionalProperties.toMutableMap()
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

        /** Identifier of the parent launch vehicle record. */
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

        /** Launch vehicle attitude accuracy (degrees). */
        fun attitudeAccuracy(attitudeAccuracy: Double) =
            attitudeAccuracy(JsonField.of(attitudeAccuracy))

        /**
         * Sets [Builder.attitudeAccuracy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attitudeAccuracy] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attitudeAccuracy(attitudeAccuracy: JsonField<Double>) = apply {
            this.attitudeAccuracy = attitudeAccuracy
        }

        /** Vehicle category. */
        fun category(category: String) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { this.category = category }

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

        /** Launch vehicle deployment rotation rate in RPM. */
        fun deploymentRotationRate(deploymentRotationRate: Double) =
            deploymentRotationRate(JsonField.of(deploymentRotationRate))

        /**
         * Sets [Builder.deploymentRotationRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deploymentRotationRate] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deploymentRotationRate(deploymentRotationRate: JsonField<Double>) = apply {
            this.deploymentRotationRate = deploymentRotationRate
        }

        /** Vehicle diameter in meters. */
        fun diameter(diameter: Double) = diameter(JsonField.of(diameter))

        /**
         * Sets [Builder.diameter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.diameter] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun diameter(diameter: JsonField<Double>) = apply { this.diameter = diameter }

        /** Launch vehicle estimated launch price in US dollars. */
        fun estLaunchPrice(estLaunchPrice: Double) = estLaunchPrice(JsonField.of(estLaunchPrice))

        /**
         * Sets [Builder.estLaunchPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estLaunchPrice] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun estLaunchPrice(estLaunchPrice: JsonField<Double>) = apply {
            this.estLaunchPrice = estLaunchPrice
        }

        /** Launch vehicle typical estimated launch price in US dollars. */
        fun estLaunchPriceTypical(estLaunchPriceTypical: Double) =
            estLaunchPriceTypical(JsonField.of(estLaunchPriceTypical))

        /**
         * Sets [Builder.estLaunchPriceTypical] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estLaunchPriceTypical] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun estLaunchPriceTypical(estLaunchPriceTypical: JsonField<Double>) = apply {
            this.estLaunchPriceTypical = estLaunchPriceTypical
        }

        /** Vehicle fairing maximum external diameter in meters. */
        fun fairingExternalDiameter(fairingExternalDiameter: Double) =
            fairingExternalDiameter(JsonField.of(fairingExternalDiameter))

        /**
         * Sets [Builder.fairingExternalDiameter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fairingExternalDiameter] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fairingExternalDiameter(fairingExternalDiameter: JsonField<Double>) = apply {
            this.fairingExternalDiameter = fairingExternalDiameter
        }

        /** Vehicle fairing maximum internal diameter in meters. */
        fun fairingInternalDiameter(fairingInternalDiameter: Double) =
            fairingInternalDiameter(JsonField.of(fairingInternalDiameter))

        /**
         * Sets [Builder.fairingInternalDiameter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fairingInternalDiameter] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fairingInternalDiameter(fairingInternalDiameter: JsonField<Double>) = apply {
            this.fairingInternalDiameter = fairingInternalDiameter
        }

        /** Vehicle fairing length in meters. */
        fun fairingLength(fairingLength: Double) = fairingLength(JsonField.of(fairingLength))

        /**
         * Sets [Builder.fairingLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fairingLength] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fairingLength(fairingLength: JsonField<Double>) = apply {
            this.fairingLength = fairingLength
        }

        /** Vehicle fairing mass in kg. */
        fun fairingMass(fairingMass: Double) = fairingMass(JsonField.of(fairingMass))

        /**
         * Sets [Builder.fairingMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fairingMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fairingMass(fairingMass: JsonField<Double>) = apply { this.fairingMass = fairingMass }

        /** Fairing material. */
        fun fairingMaterial(fairingMaterial: String) =
            fairingMaterial(JsonField.of(fairingMaterial))

        /**
         * Sets [Builder.fairingMaterial] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fairingMaterial] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fairingMaterial(fairingMaterial: JsonField<String>) = apply {
            this.fairingMaterial = fairingMaterial
        }

        /** Name of the fairing. */
        fun fairingName(fairingName: String) = fairingName(JsonField.of(fairingName))

        /**
         * Sets [Builder.fairingName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fairingName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fairingName(fairingName: JsonField<String>) = apply { this.fairingName = fairingName }

        /** Notes/Description of the launch vehicle fairing. */
        fun fairingNotes(fairingNotes: String) = fairingNotes(JsonField.of(fairingNotes))

        /**
         * Sets [Builder.fairingNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fairingNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fairingNotes(fairingNotes: JsonField<String>) = apply {
            this.fairingNotes = fairingNotes
        }

        /** Vehicle family. */
        fun family(family: String) = family(JsonField.of(family))

        /**
         * Sets [Builder.family] to an arbitrary JSON value.
         *
         * You should usually call [Builder.family] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun family(family: JsonField<String>) = apply { this.family = family }

        /** Maximum vehicle payload mass to GEO orbit in kg. */
        fun geoPayloadMass(geoPayloadMass: Double) = geoPayloadMass(JsonField.of(geoPayloadMass))

        /**
         * Sets [Builder.geoPayloadMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoPayloadMass] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geoPayloadMass(geoPayloadMass: JsonField<Double>) = apply {
            this.geoPayloadMass = geoPayloadMass
        }

        /** Launch vehicle GTO Injection 3 Sigma Accuracy Apogee Margin (degrees). */
        fun gtoInj3SigAccuracyApogeeMargin(gtoInj3SigAccuracyApogeeMargin: Double) =
            gtoInj3SigAccuracyApogeeMargin(JsonField.of(gtoInj3SigAccuracyApogeeMargin))

        /**
         * Sets [Builder.gtoInj3SigAccuracyApogeeMargin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gtoInj3SigAccuracyApogeeMargin] with a well-typed
         * [Double] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun gtoInj3SigAccuracyApogeeMargin(gtoInj3SigAccuracyApogeeMargin: JsonField<Double>) =
            apply {
                this.gtoInj3SigAccuracyApogeeMargin = gtoInj3SigAccuracyApogeeMargin
            }

        /** Launch vehicle GTO Injection 3 Sigma Accuracy Apogee Target (degrees). */
        fun gtoInj3SigAccuracyApogeeTarget(gtoInj3SigAccuracyApogeeTarget: Double) =
            gtoInj3SigAccuracyApogeeTarget(JsonField.of(gtoInj3SigAccuracyApogeeTarget))

        /**
         * Sets [Builder.gtoInj3SigAccuracyApogeeTarget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gtoInj3SigAccuracyApogeeTarget] with a well-typed
         * [Double] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun gtoInj3SigAccuracyApogeeTarget(gtoInj3SigAccuracyApogeeTarget: JsonField<Double>) =
            apply {
                this.gtoInj3SigAccuracyApogeeTarget = gtoInj3SigAccuracyApogeeTarget
            }

        /** Launch vehicle GTO Injection 3 Sigma Accuracy Inclination Margin (degrees). */
        fun gtoInj3SigAccuracyInclinationMargin(gtoInj3SigAccuracyInclinationMargin: Double) =
            gtoInj3SigAccuracyInclinationMargin(JsonField.of(gtoInj3SigAccuracyInclinationMargin))

        /**
         * Sets [Builder.gtoInj3SigAccuracyInclinationMargin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gtoInj3SigAccuracyInclinationMargin] with a well-typed
         * [Double] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun gtoInj3SigAccuracyInclinationMargin(
            gtoInj3SigAccuracyInclinationMargin: JsonField<Double>
        ) = apply { this.gtoInj3SigAccuracyInclinationMargin = gtoInj3SigAccuracyInclinationMargin }

        /** Launch vehicle GTO Injection 3 Sigma Accuracy Inclination Target (degrees). */
        fun gtoInj3SigAccuracyInclinationTarget(gtoInj3SigAccuracyInclinationTarget: Double) =
            gtoInj3SigAccuracyInclinationTarget(JsonField.of(gtoInj3SigAccuracyInclinationTarget))

        /**
         * Sets [Builder.gtoInj3SigAccuracyInclinationTarget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gtoInj3SigAccuracyInclinationTarget] with a well-typed
         * [Double] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun gtoInj3SigAccuracyInclinationTarget(
            gtoInj3SigAccuracyInclinationTarget: JsonField<Double>
        ) = apply { this.gtoInj3SigAccuracyInclinationTarget = gtoInj3SigAccuracyInclinationTarget }

        /** Launch vehicle GTO Injection 3 Sigma Accuracy Perigee Margin (degrees). */
        fun gtoInj3SigAccuracyPerigeeMargin(gtoInj3SigAccuracyPerigeeMargin: Double) =
            gtoInj3SigAccuracyPerigeeMargin(JsonField.of(gtoInj3SigAccuracyPerigeeMargin))

        /**
         * Sets [Builder.gtoInj3SigAccuracyPerigeeMargin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gtoInj3SigAccuracyPerigeeMargin] with a well-typed
         * [Double] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun gtoInj3SigAccuracyPerigeeMargin(gtoInj3SigAccuracyPerigeeMargin: JsonField<Double>) =
            apply {
                this.gtoInj3SigAccuracyPerigeeMargin = gtoInj3SigAccuracyPerigeeMargin
            }

        /** Launch vehicle GTO Injection 3 Sigma Accuracy Perigee Target (degrees). */
        fun gtoInj3SigAccuracyPerigeeTarget(gtoInj3SigAccuracyPerigeeTarget: Double) =
            gtoInj3SigAccuracyPerigeeTarget(JsonField.of(gtoInj3SigAccuracyPerigeeTarget))

        /**
         * Sets [Builder.gtoInj3SigAccuracyPerigeeTarget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gtoInj3SigAccuracyPerigeeTarget] with a well-typed
         * [Double] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun gtoInj3SigAccuracyPerigeeTarget(gtoInj3SigAccuracyPerigeeTarget: JsonField<Double>) =
            apply {
                this.gtoInj3SigAccuracyPerigeeTarget = gtoInj3SigAccuracyPerigeeTarget
            }

        /** Max vehicle payload mass to Geo-Transfer Orbit in kg. */
        fun gtoPayloadMass(gtoPayloadMass: Double) = gtoPayloadMass(JsonField.of(gtoPayloadMass))

        /**
         * Sets [Builder.gtoPayloadMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gtoPayloadMass] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gtoPayloadMass(gtoPayloadMass: JsonField<Double>) = apply {
            this.gtoPayloadMass = gtoPayloadMass
        }

        /** Vehicle total mass at launch time in kg (including all boosters). */
        fun launchMass(launchMass: Double) = launchMass(JsonField.of(launchMass))

        /**
         * Sets [Builder.launchMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchMass] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchMass(launchMass: JsonField<Double>) = apply { this.launchMass = launchMass }

        /** Vehicle launch prefix. */
        fun launchPrefix(launchPrefix: String) = launchPrefix(JsonField.of(launchPrefix))

        /**
         * Sets [Builder.launchPrefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchPrefix] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchPrefix(launchPrefix: JsonField<String>) = apply {
            this.launchPrefix = launchPrefix
        }

        /** Vehicle length in meters. */
        fun length(length: Double) = length(JsonField.of(length))

        /**
         * Sets [Builder.length] to an arbitrary JSON value.
         *
         * You should usually call [Builder.length] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun length(length: JsonField<Double>) = apply { this.length = length }

        /** Max vehicle payload mass to LEO orbit in kg. */
        fun leoPayloadMass(leoPayloadMass: Double) = leoPayloadMass(JsonField.of(leoPayloadMass))

        /**
         * Sets [Builder.leoPayloadMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.leoPayloadMass] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun leoPayloadMass(leoPayloadMass: JsonField<Double>) = apply {
            this.leoPayloadMass = leoPayloadMass
        }

        /**
         * An organization such as a corporation, manufacturer, consortium, government, etc. An
         * organization may have parent and child organizations as well as link to a former
         * organization if this org previously existed as another organization.
         */
        fun manufacturerOrg(manufacturerOrg: OrganizationFull) =
            manufacturerOrg(JsonField.of(manufacturerOrg))

        /**
         * Sets [Builder.manufacturerOrg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manufacturerOrg] with a well-typed [OrganizationFull]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun manufacturerOrg(manufacturerOrg: JsonField<OrganizationFull>) = apply {
            this.manufacturerOrg = manufacturerOrg
        }

        /** ID of the organization that manufactures the launch vehicle. */
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

        /** Vehicle maximum acceleration load in g. */
        fun maxAccelLoad(maxAccelLoad: Double) = maxAccelLoad(JsonField.of(maxAccelLoad))

        /**
         * Sets [Builder.maxAccelLoad] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxAccelLoad] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxAccelLoad(maxAccelLoad: JsonField<Double>) = apply {
            this.maxAccelLoad = maxAccelLoad
        }

        /** Vehicle maximum acoustic level in dB. */
        fun maxAcousticLevel(maxAcousticLevel: Double) =
            maxAcousticLevel(JsonField.of(maxAcousticLevel))

        /**
         * Sets [Builder.maxAcousticLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxAcousticLevel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxAcousticLevel(maxAcousticLevel: JsonField<Double>) = apply {
            this.maxAcousticLevel = maxAcousticLevel
        }

        /** Vehicle maximum acoustic level range in Hz. */
        fun maxAcousticLevelRange(maxAcousticLevelRange: Double) =
            maxAcousticLevelRange(JsonField.of(maxAcousticLevelRange))

        /**
         * Sets [Builder.maxAcousticLevelRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxAcousticLevelRange] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxAcousticLevelRange(maxAcousticLevelRange: JsonField<Double>) = apply {
            this.maxAcousticLevelRange = maxAcousticLevelRange
        }

        /** Vehicle fairing maximum pressure change in kPa/sec. */
        fun maxFairingPressureChange(maxFairingPressureChange: Double) =
            maxFairingPressureChange(JsonField.of(maxFairingPressureChange))

        /**
         * Sets [Builder.maxFairingPressureChange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxFairingPressureChange] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun maxFairingPressureChange(maxFairingPressureChange: JsonField<Double>) = apply {
            this.maxFairingPressureChange = maxFairingPressureChange
        }

        /** Vehicle maximum flight shock force in g. */
        fun maxFlightShockForce(maxFlightShockForce: Double) =
            maxFlightShockForce(JsonField.of(maxFlightShockForce))

        /**
         * Sets [Builder.maxFlightShockForce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxFlightShockForce] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxFlightShockForce(maxFlightShockForce: JsonField<Double>) = apply {
            this.maxFlightShockForce = maxFlightShockForce
        }

        /** Vehicle maximum flight shock frequency in Hz. */
        fun maxFlightShockFreq(maxFlightShockFreq: Double) =
            maxFlightShockFreq(JsonField.of(maxFlightShockFreq))

        /**
         * Sets [Builder.maxFlightShockFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxFlightShockFreq] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxFlightShockFreq(maxFlightShockFreq: JsonField<Double>) = apply {
            this.maxFlightShockFreq = maxFlightShockFreq
        }

        /** Vehicle maximum payload lateral frequency in Hz. */
        fun maxPayloadFreqLat(maxPayloadFreqLat: Double) =
            maxPayloadFreqLat(JsonField.of(maxPayloadFreqLat))

        /**
         * Sets [Builder.maxPayloadFreqLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxPayloadFreqLat] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxPayloadFreqLat(maxPayloadFreqLat: JsonField<Double>) = apply {
            this.maxPayloadFreqLat = maxPayloadFreqLat
        }

        /** Vehicle maximum payload longitudinal frequency in Hz. */
        fun maxPayloadFreqLon(maxPayloadFreqLon: Double) =
            maxPayloadFreqLon(JsonField.of(maxPayloadFreqLon))

        /**
         * Sets [Builder.maxPayloadFreqLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxPayloadFreqLon] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxPayloadFreqLon(maxPayloadFreqLon: JsonField<Double>) = apply {
            this.maxPayloadFreqLon = maxPayloadFreqLon
        }

        /** Vehicle minor variant. */
        fun minorVariant(minorVariant: String) = minorVariant(JsonField.of(minorVariant))

        /**
         * Sets [Builder.minorVariant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minorVariant] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minorVariant(minorVariant: JsonField<String>) = apply {
            this.minorVariant = minorVariant
        }

        /** Notes/Description of the launch vehicle. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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

        /** Oxidizer type. */
        fun oxidizer(oxidizer: String) = oxidizer(JsonField.of(oxidizer))

        /**
         * Sets [Builder.oxidizer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oxidizer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun oxidizer(oxidizer: JsonField<String>) = apply { this.oxidizer = oxidizer }

        /** Notes/Description of the launch vehicle payload. */
        fun payloadNotes(payloadNotes: String) = payloadNotes(JsonField.of(payloadNotes))

        /**
         * Sets [Builder.payloadNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payloadNotes(payloadNotes: JsonField<String>) = apply {
            this.payloadNotes = payloadNotes
        }

        /** Launch vehicle payload separation rate in m/s. */
        fun payloadSeparationRate(payloadSeparationRate: Double) =
            payloadSeparationRate(JsonField.of(payloadSeparationRate))

        /**
         * Sets [Builder.payloadSeparationRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadSeparationRate] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payloadSeparationRate(payloadSeparationRate: JsonField<Double>) = apply {
            this.payloadSeparationRate = payloadSeparationRate
        }

        /** Propellant type. */
        fun propellant(propellant: String) = propellant(JsonField.of(propellant))

        /**
         * Sets [Builder.propellant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propellant] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun propellant(propellant: JsonField<String>) = apply { this.propellant = propellant }

        /** Vehicle overall sound pressure level in dB. */
        fun soundPressureLevel(soundPressureLevel: Double) =
            soundPressureLevel(JsonField.of(soundPressureLevel))

        /**
         * Sets [Builder.soundPressureLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.soundPressureLevel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun soundPressureLevel(soundPressureLevel: JsonField<Double>) = apply {
            this.soundPressureLevel = soundPressureLevel
        }

        /** Optional URL for additional information on the vehicle. */
        fun sourceUrl(sourceUrl: String) = sourceUrl(JsonField.of(sourceUrl))

        /**
         * Sets [Builder.sourceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceUrl(sourceUrl: JsonField<String>) = apply { this.sourceUrl = sourceUrl }

        /** Max vehicle payload mass to Sun-Synchronous Orbit in kg. */
        fun ssoPayloadMass(ssoPayloadMass: Double) = ssoPayloadMass(JsonField.of(ssoPayloadMass))

        /**
         * Sets [Builder.ssoPayloadMass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ssoPayloadMass] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ssoPayloadMass(ssoPayloadMass: JsonField<Double>) = apply {
            this.ssoPayloadMass = ssoPayloadMass
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

        /** Vehicle variant. */
        fun variant(variant: String) = variant(JsonField.of(variant))

        /**
         * Sets [Builder.variant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variant] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun variant(variant: JsonField<String>) = apply { this.variant = variant }

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
         * Returns an immutable instance of [LaunchVehicleDetailGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idLaunchVehicle()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LaunchVehicleDetailGetResponse =
            LaunchVehicleDetailGetResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idLaunchVehicle", idLaunchVehicle),
                checkRequired("source", source),
                id,
                attitudeAccuracy,
                category,
                createdAt,
                createdBy,
                deploymentRotationRate,
                diameter,
                estLaunchPrice,
                estLaunchPriceTypical,
                fairingExternalDiameter,
                fairingInternalDiameter,
                fairingLength,
                fairingMass,
                fairingMaterial,
                fairingName,
                fairingNotes,
                family,
                geoPayloadMass,
                gtoInj3SigAccuracyApogeeMargin,
                gtoInj3SigAccuracyApogeeTarget,
                gtoInj3SigAccuracyInclinationMargin,
                gtoInj3SigAccuracyInclinationTarget,
                gtoInj3SigAccuracyPerigeeMargin,
                gtoInj3SigAccuracyPerigeeTarget,
                gtoPayloadMass,
                launchMass,
                launchPrefix,
                length,
                leoPayloadMass,
                manufacturerOrg,
                manufacturerOrgId,
                maxAccelLoad,
                maxAcousticLevel,
                maxAcousticLevelRange,
                maxFairingPressureChange,
                maxFlightShockForce,
                maxFlightShockFreq,
                maxPayloadFreqLat,
                maxPayloadFreqLon,
                minorVariant,
                notes,
                origin,
                origNetwork,
                oxidizer,
                payloadNotes,
                payloadSeparationRate,
                propellant,
                soundPressureLevel,
                sourceUrl,
                ssoPayloadMass,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                updatedBy,
                variant,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LaunchVehicleDetailGetResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idLaunchVehicle()
        source()
        id()
        attitudeAccuracy()
        category()
        createdAt()
        createdBy()
        deploymentRotationRate()
        diameter()
        estLaunchPrice()
        estLaunchPriceTypical()
        fairingExternalDiameter()
        fairingInternalDiameter()
        fairingLength()
        fairingMass()
        fairingMaterial()
        fairingName()
        fairingNotes()
        family()
        geoPayloadMass()
        gtoInj3SigAccuracyApogeeMargin()
        gtoInj3SigAccuracyApogeeTarget()
        gtoInj3SigAccuracyInclinationMargin()
        gtoInj3SigAccuracyInclinationTarget()
        gtoInj3SigAccuracyPerigeeMargin()
        gtoInj3SigAccuracyPerigeeTarget()
        gtoPayloadMass()
        launchMass()
        launchPrefix()
        length()
        leoPayloadMass()
        manufacturerOrg().ifPresent { it.validate() }
        manufacturerOrgId()
        maxAccelLoad()
        maxAcousticLevel()
        maxAcousticLevelRange()
        maxFairingPressureChange()
        maxFlightShockForce()
        maxFlightShockFreq()
        maxPayloadFreqLat()
        maxPayloadFreqLon()
        minorVariant()
        notes()
        origin()
        origNetwork()
        oxidizer()
        payloadNotes()
        payloadSeparationRate()
        propellant()
        soundPressureLevel()
        sourceUrl()
        ssoPayloadMass()
        tags()
        updatedAt()
        updatedBy()
        variant()
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
            (if (idLaunchVehicle.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (attitudeAccuracy.asKnown().isPresent) 1 else 0) +
            (if (category.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (deploymentRotationRate.asKnown().isPresent) 1 else 0) +
            (if (diameter.asKnown().isPresent) 1 else 0) +
            (if (estLaunchPrice.asKnown().isPresent) 1 else 0) +
            (if (estLaunchPriceTypical.asKnown().isPresent) 1 else 0) +
            (if (fairingExternalDiameter.asKnown().isPresent) 1 else 0) +
            (if (fairingInternalDiameter.asKnown().isPresent) 1 else 0) +
            (if (fairingLength.asKnown().isPresent) 1 else 0) +
            (if (fairingMass.asKnown().isPresent) 1 else 0) +
            (if (fairingMaterial.asKnown().isPresent) 1 else 0) +
            (if (fairingName.asKnown().isPresent) 1 else 0) +
            (if (fairingNotes.asKnown().isPresent) 1 else 0) +
            (if (family.asKnown().isPresent) 1 else 0) +
            (if (geoPayloadMass.asKnown().isPresent) 1 else 0) +
            (if (gtoInj3SigAccuracyApogeeMargin.asKnown().isPresent) 1 else 0) +
            (if (gtoInj3SigAccuracyApogeeTarget.asKnown().isPresent) 1 else 0) +
            (if (gtoInj3SigAccuracyInclinationMargin.asKnown().isPresent) 1 else 0) +
            (if (gtoInj3SigAccuracyInclinationTarget.asKnown().isPresent) 1 else 0) +
            (if (gtoInj3SigAccuracyPerigeeMargin.asKnown().isPresent) 1 else 0) +
            (if (gtoInj3SigAccuracyPerigeeTarget.asKnown().isPresent) 1 else 0) +
            (if (gtoPayloadMass.asKnown().isPresent) 1 else 0) +
            (if (launchMass.asKnown().isPresent) 1 else 0) +
            (if (launchPrefix.asKnown().isPresent) 1 else 0) +
            (if (length.asKnown().isPresent) 1 else 0) +
            (if (leoPayloadMass.asKnown().isPresent) 1 else 0) +
            (manufacturerOrg.asKnown().getOrNull()?.validity() ?: 0) +
            (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) +
            (if (maxAccelLoad.asKnown().isPresent) 1 else 0) +
            (if (maxAcousticLevel.asKnown().isPresent) 1 else 0) +
            (if (maxAcousticLevelRange.asKnown().isPresent) 1 else 0) +
            (if (maxFairingPressureChange.asKnown().isPresent) 1 else 0) +
            (if (maxFlightShockForce.asKnown().isPresent) 1 else 0) +
            (if (maxFlightShockFreq.asKnown().isPresent) 1 else 0) +
            (if (maxPayloadFreqLat.asKnown().isPresent) 1 else 0) +
            (if (maxPayloadFreqLon.asKnown().isPresent) 1 else 0) +
            (if (minorVariant.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (oxidizer.asKnown().isPresent) 1 else 0) +
            (if (payloadNotes.asKnown().isPresent) 1 else 0) +
            (if (payloadSeparationRate.asKnown().isPresent) 1 else 0) +
            (if (propellant.asKnown().isPresent) 1 else 0) +
            (if (soundPressureLevel.asKnown().isPresent) 1 else 0) +
            (if (sourceUrl.asKnown().isPresent) 1 else 0) +
            (if (ssoPayloadMass.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (variant.asKnown().isPresent) 1 else 0)

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

        return other is LaunchVehicleDetailGetResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            idLaunchVehicle == other.idLaunchVehicle &&
            source == other.source &&
            id == other.id &&
            attitudeAccuracy == other.attitudeAccuracy &&
            category == other.category &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            deploymentRotationRate == other.deploymentRotationRate &&
            diameter == other.diameter &&
            estLaunchPrice == other.estLaunchPrice &&
            estLaunchPriceTypical == other.estLaunchPriceTypical &&
            fairingExternalDiameter == other.fairingExternalDiameter &&
            fairingInternalDiameter == other.fairingInternalDiameter &&
            fairingLength == other.fairingLength &&
            fairingMass == other.fairingMass &&
            fairingMaterial == other.fairingMaterial &&
            fairingName == other.fairingName &&
            fairingNotes == other.fairingNotes &&
            family == other.family &&
            geoPayloadMass == other.geoPayloadMass &&
            gtoInj3SigAccuracyApogeeMargin == other.gtoInj3SigAccuracyApogeeMargin &&
            gtoInj3SigAccuracyApogeeTarget == other.gtoInj3SigAccuracyApogeeTarget &&
            gtoInj3SigAccuracyInclinationMargin == other.gtoInj3SigAccuracyInclinationMargin &&
            gtoInj3SigAccuracyInclinationTarget == other.gtoInj3SigAccuracyInclinationTarget &&
            gtoInj3SigAccuracyPerigeeMargin == other.gtoInj3SigAccuracyPerigeeMargin &&
            gtoInj3SigAccuracyPerigeeTarget == other.gtoInj3SigAccuracyPerigeeTarget &&
            gtoPayloadMass == other.gtoPayloadMass &&
            launchMass == other.launchMass &&
            launchPrefix == other.launchPrefix &&
            length == other.length &&
            leoPayloadMass == other.leoPayloadMass &&
            manufacturerOrg == other.manufacturerOrg &&
            manufacturerOrgId == other.manufacturerOrgId &&
            maxAccelLoad == other.maxAccelLoad &&
            maxAcousticLevel == other.maxAcousticLevel &&
            maxAcousticLevelRange == other.maxAcousticLevelRange &&
            maxFairingPressureChange == other.maxFairingPressureChange &&
            maxFlightShockForce == other.maxFlightShockForce &&
            maxFlightShockFreq == other.maxFlightShockFreq &&
            maxPayloadFreqLat == other.maxPayloadFreqLat &&
            maxPayloadFreqLon == other.maxPayloadFreqLon &&
            minorVariant == other.minorVariant &&
            notes == other.notes &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            oxidizer == other.oxidizer &&
            payloadNotes == other.payloadNotes &&
            payloadSeparationRate == other.payloadSeparationRate &&
            propellant == other.propellant &&
            soundPressureLevel == other.soundPressureLevel &&
            sourceUrl == other.sourceUrl &&
            ssoPayloadMass == other.ssoPayloadMass &&
            tags == other.tags &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            variant == other.variant &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            idLaunchVehicle,
            source,
            id,
            attitudeAccuracy,
            category,
            createdAt,
            createdBy,
            deploymentRotationRate,
            diameter,
            estLaunchPrice,
            estLaunchPriceTypical,
            fairingExternalDiameter,
            fairingInternalDiameter,
            fairingLength,
            fairingMass,
            fairingMaterial,
            fairingName,
            fairingNotes,
            family,
            geoPayloadMass,
            gtoInj3SigAccuracyApogeeMargin,
            gtoInj3SigAccuracyApogeeTarget,
            gtoInj3SigAccuracyInclinationMargin,
            gtoInj3SigAccuracyInclinationTarget,
            gtoInj3SigAccuracyPerigeeMargin,
            gtoInj3SigAccuracyPerigeeTarget,
            gtoPayloadMass,
            launchMass,
            launchPrefix,
            length,
            leoPayloadMass,
            manufacturerOrg,
            manufacturerOrgId,
            maxAccelLoad,
            maxAcousticLevel,
            maxAcousticLevelRange,
            maxFairingPressureChange,
            maxFlightShockForce,
            maxFlightShockFreq,
            maxPayloadFreqLat,
            maxPayloadFreqLon,
            minorVariant,
            notes,
            origin,
            origNetwork,
            oxidizer,
            payloadNotes,
            payloadSeparationRate,
            propellant,
            soundPressureLevel,
            sourceUrl,
            ssoPayloadMass,
            tags,
            updatedAt,
            updatedBy,
            variant,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LaunchVehicleDetailGetResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, idLaunchVehicle=$idLaunchVehicle, source=$source, id=$id, attitudeAccuracy=$attitudeAccuracy, category=$category, createdAt=$createdAt, createdBy=$createdBy, deploymentRotationRate=$deploymentRotationRate, diameter=$diameter, estLaunchPrice=$estLaunchPrice, estLaunchPriceTypical=$estLaunchPriceTypical, fairingExternalDiameter=$fairingExternalDiameter, fairingInternalDiameter=$fairingInternalDiameter, fairingLength=$fairingLength, fairingMass=$fairingMass, fairingMaterial=$fairingMaterial, fairingName=$fairingName, fairingNotes=$fairingNotes, family=$family, geoPayloadMass=$geoPayloadMass, gtoInj3SigAccuracyApogeeMargin=$gtoInj3SigAccuracyApogeeMargin, gtoInj3SigAccuracyApogeeTarget=$gtoInj3SigAccuracyApogeeTarget, gtoInj3SigAccuracyInclinationMargin=$gtoInj3SigAccuracyInclinationMargin, gtoInj3SigAccuracyInclinationTarget=$gtoInj3SigAccuracyInclinationTarget, gtoInj3SigAccuracyPerigeeMargin=$gtoInj3SigAccuracyPerigeeMargin, gtoInj3SigAccuracyPerigeeTarget=$gtoInj3SigAccuracyPerigeeTarget, gtoPayloadMass=$gtoPayloadMass, launchMass=$launchMass, launchPrefix=$launchPrefix, length=$length, leoPayloadMass=$leoPayloadMass, manufacturerOrg=$manufacturerOrg, manufacturerOrgId=$manufacturerOrgId, maxAccelLoad=$maxAccelLoad, maxAcousticLevel=$maxAcousticLevel, maxAcousticLevelRange=$maxAcousticLevelRange, maxFairingPressureChange=$maxFairingPressureChange, maxFlightShockForce=$maxFlightShockForce, maxFlightShockFreq=$maxFlightShockFreq, maxPayloadFreqLat=$maxPayloadFreqLat, maxPayloadFreqLon=$maxPayloadFreqLon, minorVariant=$minorVariant, notes=$notes, origin=$origin, origNetwork=$origNetwork, oxidizer=$oxidizer, payloadNotes=$payloadNotes, payloadSeparationRate=$payloadSeparationRate, propellant=$propellant, soundPressureLevel=$soundPressureLevel, sourceUrl=$sourceUrl, ssoPayloadMass=$ssoPayloadMass, tags=$tags, updatedAt=$updatedAt, updatedBy=$updatedBy, variant=$variant, additionalProperties=$additionalProperties}"
}

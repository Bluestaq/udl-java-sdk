// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitevent

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
import com.unifieddatalibrary.api.models.OnorbitFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OnorbiteventTupleResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val eventTime: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val achievedFlightPhase: JsonField<String>,
    private val ageAtEvent: JsonField<Double>,
    private val capabilityLoss: JsonField<Double>,
    private val capabilityLossNotes: JsonField<String>,
    private val capacityLoss: JsonField<Double>,
    private val consequentialEquipmentFailure: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val declassificationDate: JsonField<OffsetDateTime>,
    private val declassificationString: JsonField<String>,
    private val derivedFrom: JsonField<String>,
    private val description: JsonField<String>,
    private val equipmentAtFault: JsonField<String>,
    private val equipmentCausingLossNotes: JsonField<String>,
    private val equipmentPartAtFault: JsonField<String>,
    private val equipmentTypeAtFault: JsonField<String>,
    private val eventResult: JsonField<String>,
    private val eventTimeNotes: JsonField<String>,
    private val eventType: JsonField<String>,
    private val geoPosition: JsonField<Double>,
    private val idOnOrbit: JsonField<String>,
    private val inclined: JsonField<Boolean>,
    private val injured: JsonField<Int>,
    private val insuranceCarriedNotes: JsonField<String>,
    private val insuranceLoss: JsonField<Double>,
    private val insuranceLossNotes: JsonField<String>,
    private val killed: JsonField<Int>,
    private val lesseeOrgId: JsonField<String>,
    private val lifeLost: JsonField<Double>,
    private val netAmount: JsonField<Double>,
    private val objectStatus: JsonField<String>,
    private val occurrenceFlightPhase: JsonField<String>,
    private val officialLossDate: JsonField<OffsetDateTime>,
    private val onOrbit: JsonField<OnorbitFull>,
    private val operatedOnBehalfOfOrgId: JsonField<String>,
    private val operatorOrgId: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val ownerOrgId: JsonField<String>,
    private val planeNumber: JsonField<String>,
    private val planeSlot: JsonField<String>,
    private val positionStatus: JsonField<String>,
    private val remarks: JsonField<String>,
    private val satellitePosition: JsonField<String>,
    private val satNo: JsonField<Int>,
    private val stageAtFault: JsonField<String>,
    private val thirdPartyInsuranceLoss: JsonField<Double>,
    private val underlyingCause: JsonField<String>,
    private val untilTime: JsonField<OffsetDateTime>,
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
        @JsonProperty("eventTime")
        @ExcludeMissing
        eventTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("achievedFlightPhase")
        @ExcludeMissing
        achievedFlightPhase: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ageAtEvent")
        @ExcludeMissing
        ageAtEvent: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("capabilityLoss")
        @ExcludeMissing
        capabilityLoss: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("capabilityLossNotes")
        @ExcludeMissing
        capabilityLossNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("capacityLoss")
        @ExcludeMissing
        capacityLoss: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("consequentialEquipmentFailure")
        @ExcludeMissing
        consequentialEquipmentFailure: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("declassificationDate")
        @ExcludeMissing
        declassificationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("declassificationString")
        @ExcludeMissing
        declassificationString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("derivedFrom")
        @ExcludeMissing
        derivedFrom: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("equipmentAtFault")
        @ExcludeMissing
        equipmentAtFault: JsonField<String> = JsonMissing.of(),
        @JsonProperty("equipmentCausingLossNotes")
        @ExcludeMissing
        equipmentCausingLossNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("equipmentPartAtFault")
        @ExcludeMissing
        equipmentPartAtFault: JsonField<String> = JsonMissing.of(),
        @JsonProperty("equipmentTypeAtFault")
        @ExcludeMissing
        equipmentTypeAtFault: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventResult")
        @ExcludeMissing
        eventResult: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventTimeNotes")
        @ExcludeMissing
        eventTimeNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventType") @ExcludeMissing eventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("geoPosition")
        @ExcludeMissing
        geoPosition: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inclined") @ExcludeMissing inclined: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("injured") @ExcludeMissing injured: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("insuranceCarriedNotes")
        @ExcludeMissing
        insuranceCarriedNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("insuranceLoss")
        @ExcludeMissing
        insuranceLoss: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("insuranceLossNotes")
        @ExcludeMissing
        insuranceLossNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("killed") @ExcludeMissing killed: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("lesseeOrgId")
        @ExcludeMissing
        lesseeOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lifeLost") @ExcludeMissing lifeLost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("netAmount") @ExcludeMissing netAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("objectStatus")
        @ExcludeMissing
        objectStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("occurrenceFlightPhase")
        @ExcludeMissing
        occurrenceFlightPhase: JsonField<String> = JsonMissing.of(),
        @JsonProperty("officialLossDate")
        @ExcludeMissing
        officialLossDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("onOrbit") @ExcludeMissing onOrbit: JsonField<OnorbitFull> = JsonMissing.of(),
        @JsonProperty("operatedOnBehalfOfOrgId")
        @ExcludeMissing
        operatedOnBehalfOfOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operatorOrgId")
        @ExcludeMissing
        operatorOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ownerOrgId")
        @ExcludeMissing
        ownerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planeNumber")
        @ExcludeMissing
        planeNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planeSlot") @ExcludeMissing planeSlot: JsonField<String> = JsonMissing.of(),
        @JsonProperty("positionStatus")
        @ExcludeMissing
        positionStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remarks") @ExcludeMissing remarks: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satellitePosition")
        @ExcludeMissing
        satellitePosition: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("stageAtFault")
        @ExcludeMissing
        stageAtFault: JsonField<String> = JsonMissing.of(),
        @JsonProperty("thirdPartyInsuranceLoss")
        @ExcludeMissing
        thirdPartyInsuranceLoss: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("underlyingCause")
        @ExcludeMissing
        underlyingCause: JsonField<String> = JsonMissing.of(),
        @JsonProperty("untilTime")
        @ExcludeMissing
        untilTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        eventTime,
        source,
        id,
        achievedFlightPhase,
        ageAtEvent,
        capabilityLoss,
        capabilityLossNotes,
        capacityLoss,
        consequentialEquipmentFailure,
        createdAt,
        createdBy,
        declassificationDate,
        declassificationString,
        derivedFrom,
        description,
        equipmentAtFault,
        equipmentCausingLossNotes,
        equipmentPartAtFault,
        equipmentTypeAtFault,
        eventResult,
        eventTimeNotes,
        eventType,
        geoPosition,
        idOnOrbit,
        inclined,
        injured,
        insuranceCarriedNotes,
        insuranceLoss,
        insuranceLossNotes,
        killed,
        lesseeOrgId,
        lifeLost,
        netAmount,
        objectStatus,
        occurrenceFlightPhase,
        officialLossDate,
        onOrbit,
        operatedOnBehalfOfOrgId,
        operatorOrgId,
        origin,
        origNetwork,
        origObjectId,
        ownerOrgId,
        planeNumber,
        planeSlot,
        positionStatus,
        remarks,
        satellitePosition,
        satNo,
        stageAtFault,
        thirdPartyInsuranceLoss,
        underlyingCause,
        untilTime,
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
     * Date/Time of the event. See eventTimeNotes for remarks on the accuracy of the date time.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTime(): OffsetDateTime = eventTime.getRequired("eventTime")

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
     * Achieved phase of flight prior to the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun achievedFlightPhase(): Optional<String> =
        achievedFlightPhase.getOptional("achievedFlightPhase")

    /**
     * Spacecraft age at the event in years.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ageAtEvent(): Optional<Double> = ageAtEvent.getOptional("ageAtEvent")

    /**
     * Spacecraft capability loss incurred, as a fraction of 1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun capabilityLoss(): Optional<Double> = capabilityLoss.getOptional("capabilityLoss")

    /**
     * Notes on capability loss at the time of event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun capabilityLossNotes(): Optional<String> =
        capabilityLossNotes.getOptional("capabilityLossNotes")

    /**
     * Spacecraft capacity loss incurred, as a fraction of 1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun capacityLoss(): Optional<Double> = capacityLoss.getOptional("capacityLoss")

    /**
     * Additional equipment which failed as a result of faulty equipment on the spacecraft during
     * the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun consequentialEquipmentFailure(): Optional<String> =
        consequentialEquipmentFailure.getOptional("consequentialEquipmentFailure")

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
     * The declassification date of this data, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun declassificationDate(): Optional<OffsetDateTime> =
        declassificationDate.getOptional("declassificationDate")

    /**
     * Declassification string of this data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun declassificationString(): Optional<String> =
        declassificationString.getOptional("declassificationString")

    /**
     * The sources or SCG references from which the classification of this data is derived.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun derivedFrom(): Optional<String> = derivedFrom.getOptional("derivedFrom")

    /**
     * Notes/description of the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Equipment on the spacecraft which caused the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun equipmentAtFault(): Optional<String> = equipmentAtFault.getOptional("equipmentAtFault")

    /**
     * Additional notes on the equipment causing the event/loss.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun equipmentCausingLossNotes(): Optional<String> =
        equipmentCausingLossNotes.getOptional("equipmentCausingLossNotes")

    /**
     * Specific part of the equipment on the spacecraft which caused the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun equipmentPartAtFault(): Optional<String> =
        equipmentPartAtFault.getOptional("equipmentPartAtFault")

    /**
     * Type of the equipment on the spacecraft which caused the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun equipmentTypeAtFault(): Optional<String> =
        equipmentTypeAtFault.getOptional("equipmentTypeAtFault")

    /**
     * The result of the reported event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eventResult(): Optional<String> = eventResult.getOptional("eventResult")

    /**
     * Notes/remarks on the validity/accuracy of the eventTime.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eventTimeNotes(): Optional<String> = eventTimeNotes.getOptional("eventTimeNotes")

    /**
     * The type of on-orbit event being reported.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eventType(): Optional<String> = eventType.getOptional("eventType")

    /**
     * GEO position longitude at event time if applicable. Negative values are west.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoPosition(): Optional<Double> = geoPosition.getOptional("geoPosition")

    /**
     * Unique identifier of the on-orbit object for this event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Boolean indicating if the spacecraft is inclined.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun inclined(): Optional<Boolean> = inclined.getOptional("inclined")

    /**
     * Number of humans injured in the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun injured(): Optional<Int> = injured.getOptional("injured")

    /**
     * Additional insurance notes on coverages at the time of event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun insuranceCarriedNotes(): Optional<String> =
        insuranceCarriedNotes.getOptional("insuranceCarriedNotes")

    /**
     * Insurance loss incurred, as a fraction of 1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun insuranceLoss(): Optional<Double> = insuranceLoss.getOptional("insuranceLoss")

    /**
     * Additional insurance notes if the event is an official loss.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun insuranceLossNotes(): Optional<String> =
        insuranceLossNotes.getOptional("insuranceLossNotes")

    /**
     * Number of humans killed in the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun killed(): Optional<Int> = killed.getOptional("killed")

    /**
     * Unique identifier of the organization which leases this on-orbit spacecraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lesseeOrgId(): Optional<String> = lesseeOrgId.getOptional("lesseeOrgId")

    /**
     * Spacecraft life lost due to the event as a percent/fraction of 1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lifeLost(): Optional<Double> = lifeLost.getOptional("lifeLost")

    /**
     * Net amount of the insurance claim for the event, in USD.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun netAmount(): Optional<Double> = netAmount.getOptional("netAmount")

    /**
     * The status of the on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objectStatus(): Optional<String> = objectStatus.getOptional("objectStatus")

    /**
     * Phase of flight during which the event occurred.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun occurrenceFlightPhase(): Optional<String> =
        occurrenceFlightPhase.getOptional("occurrenceFlightPhase")

    /**
     * Date time of official loss of the spacecraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun officialLossDate(): Optional<OffsetDateTime> =
        officialLossDate.getOptional("officialLossDate")

    /**
     * Model object representing on-orbit objects or satellites in the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun onOrbit(): Optional<OnorbitFull> = onOrbit.getOptional("onOrbit")

    /**
     * Unique identifier of the organization on whose behalf the on-orbit spacecraft is operated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operatedOnBehalfOfOrgId(): Optional<String> =
        operatedOnBehalfOfOrgId.getOptional("operatedOnBehalfOfOrgId")

    /**
     * Organization ID of the operator of the on-orbit spacecraft at the time of the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operatorOrgId(): Optional<String> = operatorOrgId.getOptional("operatorOrgId")

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
     * Original object ID or Catalog Number provided by source (may not map to an existing idOnOrbit
     * in UDL).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Organization ID of the owner of the on-orbit spacecraft at the time of the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ownerOrgId(): Optional<String> = ownerOrgId.getOptional("ownerOrgId")

    /**
     * GEO slot plane number/designator of the spacecraft at event time.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun planeNumber(): Optional<String> = planeNumber.getOptional("planeNumber")

    /**
     * GEO plane slot of the spacecraft at event time.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun planeSlot(): Optional<String> = planeSlot.getOptional("planeSlot")

    /**
     * Position status of the spacecraft at event time (e.g. Stable, Drifting/Tumbling, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun positionStatus(): Optional<String> = positionStatus.getOptional("positionStatus")

    /**
     * Additional remarks on the event description.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun remarks(): Optional<String> = remarks.getOptional("remarks")

    /**
     * Description of the satellite orbital position or regime.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satellitePosition(): Optional<String> = satellitePosition.getOptional("satellitePosition")

    /**
     * Satellite/Catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Faulty stage of flight for the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stageAtFault(): Optional<String> = stageAtFault.getOptional("stageAtFault")

    /**
     * Insurance loss incurred by 3rd party insurance, in USD.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun thirdPartyInsuranceLoss(): Optional<Double> =
        thirdPartyInsuranceLoss.getOptional("thirdPartyInsuranceLoss")

    /**
     * Underlying cause of the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun underlyingCause(): Optional<String> = underlyingCause.getOptional("underlyingCause")

    /**
     * Maximum validity time of the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun untilTime(): Optional<OffsetDateTime> = untilTime.getOptional("untilTime")

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
     * Returns the raw JSON value of [eventTime].
     *
     * Unlike [eventTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventTime")
    @ExcludeMissing
    fun _eventTime(): JsonField<OffsetDateTime> = eventTime

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
     * Returns the raw JSON value of [achievedFlightPhase].
     *
     * Unlike [achievedFlightPhase], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("achievedFlightPhase")
    @ExcludeMissing
    fun _achievedFlightPhase(): JsonField<String> = achievedFlightPhase

    /**
     * Returns the raw JSON value of [ageAtEvent].
     *
     * Unlike [ageAtEvent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ageAtEvent") @ExcludeMissing fun _ageAtEvent(): JsonField<Double> = ageAtEvent

    /**
     * Returns the raw JSON value of [capabilityLoss].
     *
     * Unlike [capabilityLoss], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capabilityLoss")
    @ExcludeMissing
    fun _capabilityLoss(): JsonField<Double> = capabilityLoss

    /**
     * Returns the raw JSON value of [capabilityLossNotes].
     *
     * Unlike [capabilityLossNotes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("capabilityLossNotes")
    @ExcludeMissing
    fun _capabilityLossNotes(): JsonField<String> = capabilityLossNotes

    /**
     * Returns the raw JSON value of [capacityLoss].
     *
     * Unlike [capacityLoss], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capacityLoss")
    @ExcludeMissing
    fun _capacityLoss(): JsonField<Double> = capacityLoss

    /**
     * Returns the raw JSON value of [consequentialEquipmentFailure].
     *
     * Unlike [consequentialEquipmentFailure], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("consequentialEquipmentFailure")
    @ExcludeMissing
    fun _consequentialEquipmentFailure(): JsonField<String> = consequentialEquipmentFailure

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
     * Returns the raw JSON value of [declassificationDate].
     *
     * Unlike [declassificationDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("declassificationDate")
    @ExcludeMissing
    fun _declassificationDate(): JsonField<OffsetDateTime> = declassificationDate

    /**
     * Returns the raw JSON value of [declassificationString].
     *
     * Unlike [declassificationString], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("declassificationString")
    @ExcludeMissing
    fun _declassificationString(): JsonField<String> = declassificationString

    /**
     * Returns the raw JSON value of [derivedFrom].
     *
     * Unlike [derivedFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("derivedFrom") @ExcludeMissing fun _derivedFrom(): JsonField<String> = derivedFrom

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [equipmentAtFault].
     *
     * Unlike [equipmentAtFault], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("equipmentAtFault")
    @ExcludeMissing
    fun _equipmentAtFault(): JsonField<String> = equipmentAtFault

    /**
     * Returns the raw JSON value of [equipmentCausingLossNotes].
     *
     * Unlike [equipmentCausingLossNotes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("equipmentCausingLossNotes")
    @ExcludeMissing
    fun _equipmentCausingLossNotes(): JsonField<String> = equipmentCausingLossNotes

    /**
     * Returns the raw JSON value of [equipmentPartAtFault].
     *
     * Unlike [equipmentPartAtFault], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("equipmentPartAtFault")
    @ExcludeMissing
    fun _equipmentPartAtFault(): JsonField<String> = equipmentPartAtFault

    /**
     * Returns the raw JSON value of [equipmentTypeAtFault].
     *
     * Unlike [equipmentTypeAtFault], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("equipmentTypeAtFault")
    @ExcludeMissing
    fun _equipmentTypeAtFault(): JsonField<String> = equipmentTypeAtFault

    /**
     * Returns the raw JSON value of [eventResult].
     *
     * Unlike [eventResult], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventResult") @ExcludeMissing fun _eventResult(): JsonField<String> = eventResult

    /**
     * Returns the raw JSON value of [eventTimeNotes].
     *
     * Unlike [eventTimeNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventTimeNotes")
    @ExcludeMissing
    fun _eventTimeNotes(): JsonField<String> = eventTimeNotes

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventType") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

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
     * Returns the raw JSON value of [inclined].
     *
     * Unlike [inclined], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inclined") @ExcludeMissing fun _inclined(): JsonField<Boolean> = inclined

    /**
     * Returns the raw JSON value of [injured].
     *
     * Unlike [injured], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("injured") @ExcludeMissing fun _injured(): JsonField<Int> = injured

    /**
     * Returns the raw JSON value of [insuranceCarriedNotes].
     *
     * Unlike [insuranceCarriedNotes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("insuranceCarriedNotes")
    @ExcludeMissing
    fun _insuranceCarriedNotes(): JsonField<String> = insuranceCarriedNotes

    /**
     * Returns the raw JSON value of [insuranceLoss].
     *
     * Unlike [insuranceLoss], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("insuranceLoss")
    @ExcludeMissing
    fun _insuranceLoss(): JsonField<Double> = insuranceLoss

    /**
     * Returns the raw JSON value of [insuranceLossNotes].
     *
     * Unlike [insuranceLossNotes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("insuranceLossNotes")
    @ExcludeMissing
    fun _insuranceLossNotes(): JsonField<String> = insuranceLossNotes

    /**
     * Returns the raw JSON value of [killed].
     *
     * Unlike [killed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("killed") @ExcludeMissing fun _killed(): JsonField<Int> = killed

    /**
     * Returns the raw JSON value of [lesseeOrgId].
     *
     * Unlike [lesseeOrgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lesseeOrgId") @ExcludeMissing fun _lesseeOrgId(): JsonField<String> = lesseeOrgId

    /**
     * Returns the raw JSON value of [lifeLost].
     *
     * Unlike [lifeLost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lifeLost") @ExcludeMissing fun _lifeLost(): JsonField<Double> = lifeLost

    /**
     * Returns the raw JSON value of [netAmount].
     *
     * Unlike [netAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("netAmount") @ExcludeMissing fun _netAmount(): JsonField<Double> = netAmount

    /**
     * Returns the raw JSON value of [objectStatus].
     *
     * Unlike [objectStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectStatus")
    @ExcludeMissing
    fun _objectStatus(): JsonField<String> = objectStatus

    /**
     * Returns the raw JSON value of [occurrenceFlightPhase].
     *
     * Unlike [occurrenceFlightPhase], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("occurrenceFlightPhase")
    @ExcludeMissing
    fun _occurrenceFlightPhase(): JsonField<String> = occurrenceFlightPhase

    /**
     * Returns the raw JSON value of [officialLossDate].
     *
     * Unlike [officialLossDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("officialLossDate")
    @ExcludeMissing
    fun _officialLossDate(): JsonField<OffsetDateTime> = officialLossDate

    /**
     * Returns the raw JSON value of [onOrbit].
     *
     * Unlike [onOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("onOrbit") @ExcludeMissing fun _onOrbit(): JsonField<OnorbitFull> = onOrbit

    /**
     * Returns the raw JSON value of [operatedOnBehalfOfOrgId].
     *
     * Unlike [operatedOnBehalfOfOrgId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("operatedOnBehalfOfOrgId")
    @ExcludeMissing
    fun _operatedOnBehalfOfOrgId(): JsonField<String> = operatedOnBehalfOfOrgId

    /**
     * Returns the raw JSON value of [operatorOrgId].
     *
     * Unlike [operatorOrgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operatorOrgId")
    @ExcludeMissing
    fun _operatorOrgId(): JsonField<String> = operatorOrgId

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
     * Returns the raw JSON value of [origObjectId].
     *
     * Unlike [origObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origObjectId")
    @ExcludeMissing
    fun _origObjectId(): JsonField<String> = origObjectId

    /**
     * Returns the raw JSON value of [ownerOrgId].
     *
     * Unlike [ownerOrgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ownerOrgId") @ExcludeMissing fun _ownerOrgId(): JsonField<String> = ownerOrgId

    /**
     * Returns the raw JSON value of [planeNumber].
     *
     * Unlike [planeNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("planeNumber") @ExcludeMissing fun _planeNumber(): JsonField<String> = planeNumber

    /**
     * Returns the raw JSON value of [planeSlot].
     *
     * Unlike [planeSlot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("planeSlot") @ExcludeMissing fun _planeSlot(): JsonField<String> = planeSlot

    /**
     * Returns the raw JSON value of [positionStatus].
     *
     * Unlike [positionStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("positionStatus")
    @ExcludeMissing
    fun _positionStatus(): JsonField<String> = positionStatus

    /**
     * Returns the raw JSON value of [remarks].
     *
     * Unlike [remarks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remarks") @ExcludeMissing fun _remarks(): JsonField<String> = remarks

    /**
     * Returns the raw JSON value of [satellitePosition].
     *
     * Unlike [satellitePosition], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("satellitePosition")
    @ExcludeMissing
    fun _satellitePosition(): JsonField<String> = satellitePosition

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [stageAtFault].
     *
     * Unlike [stageAtFault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stageAtFault")
    @ExcludeMissing
    fun _stageAtFault(): JsonField<String> = stageAtFault

    /**
     * Returns the raw JSON value of [thirdPartyInsuranceLoss].
     *
     * Unlike [thirdPartyInsuranceLoss], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("thirdPartyInsuranceLoss")
    @ExcludeMissing
    fun _thirdPartyInsuranceLoss(): JsonField<Double> = thirdPartyInsuranceLoss

    /**
     * Returns the raw JSON value of [underlyingCause].
     *
     * Unlike [underlyingCause], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("underlyingCause")
    @ExcludeMissing
    fun _underlyingCause(): JsonField<String> = underlyingCause

    /**
     * Returns the raw JSON value of [untilTime].
     *
     * Unlike [untilTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("untilTime")
    @ExcludeMissing
    fun _untilTime(): JsonField<OffsetDateTime> = untilTime

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
         * Returns a mutable builder for constructing an instance of [OnorbiteventTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .eventTime()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnorbiteventTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var eventTime: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var achievedFlightPhase: JsonField<String> = JsonMissing.of()
        private var ageAtEvent: JsonField<Double> = JsonMissing.of()
        private var capabilityLoss: JsonField<Double> = JsonMissing.of()
        private var capabilityLossNotes: JsonField<String> = JsonMissing.of()
        private var capacityLoss: JsonField<Double> = JsonMissing.of()
        private var consequentialEquipmentFailure: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var declassificationDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var declassificationString: JsonField<String> = JsonMissing.of()
        private var derivedFrom: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var equipmentAtFault: JsonField<String> = JsonMissing.of()
        private var equipmentCausingLossNotes: JsonField<String> = JsonMissing.of()
        private var equipmentPartAtFault: JsonField<String> = JsonMissing.of()
        private var equipmentTypeAtFault: JsonField<String> = JsonMissing.of()
        private var eventResult: JsonField<String> = JsonMissing.of()
        private var eventTimeNotes: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<String> = JsonMissing.of()
        private var geoPosition: JsonField<Double> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var inclined: JsonField<Boolean> = JsonMissing.of()
        private var injured: JsonField<Int> = JsonMissing.of()
        private var insuranceCarriedNotes: JsonField<String> = JsonMissing.of()
        private var insuranceLoss: JsonField<Double> = JsonMissing.of()
        private var insuranceLossNotes: JsonField<String> = JsonMissing.of()
        private var killed: JsonField<Int> = JsonMissing.of()
        private var lesseeOrgId: JsonField<String> = JsonMissing.of()
        private var lifeLost: JsonField<Double> = JsonMissing.of()
        private var netAmount: JsonField<Double> = JsonMissing.of()
        private var objectStatus: JsonField<String> = JsonMissing.of()
        private var occurrenceFlightPhase: JsonField<String> = JsonMissing.of()
        private var officialLossDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var onOrbit: JsonField<OnorbitFull> = JsonMissing.of()
        private var operatedOnBehalfOfOrgId: JsonField<String> = JsonMissing.of()
        private var operatorOrgId: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var ownerOrgId: JsonField<String> = JsonMissing.of()
        private var planeNumber: JsonField<String> = JsonMissing.of()
        private var planeSlot: JsonField<String> = JsonMissing.of()
        private var positionStatus: JsonField<String> = JsonMissing.of()
        private var remarks: JsonField<String> = JsonMissing.of()
        private var satellitePosition: JsonField<String> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var stageAtFault: JsonField<String> = JsonMissing.of()
        private var thirdPartyInsuranceLoss: JsonField<Double> = JsonMissing.of()
        private var underlyingCause: JsonField<String> = JsonMissing.of()
        private var untilTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onorbiteventTupleResponse: OnorbiteventTupleResponse) = apply {
            classificationMarking = onorbiteventTupleResponse.classificationMarking
            dataMode = onorbiteventTupleResponse.dataMode
            eventTime = onorbiteventTupleResponse.eventTime
            source = onorbiteventTupleResponse.source
            id = onorbiteventTupleResponse.id
            achievedFlightPhase = onorbiteventTupleResponse.achievedFlightPhase
            ageAtEvent = onorbiteventTupleResponse.ageAtEvent
            capabilityLoss = onorbiteventTupleResponse.capabilityLoss
            capabilityLossNotes = onorbiteventTupleResponse.capabilityLossNotes
            capacityLoss = onorbiteventTupleResponse.capacityLoss
            consequentialEquipmentFailure = onorbiteventTupleResponse.consequentialEquipmentFailure
            createdAt = onorbiteventTupleResponse.createdAt
            createdBy = onorbiteventTupleResponse.createdBy
            declassificationDate = onorbiteventTupleResponse.declassificationDate
            declassificationString = onorbiteventTupleResponse.declassificationString
            derivedFrom = onorbiteventTupleResponse.derivedFrom
            description = onorbiteventTupleResponse.description
            equipmentAtFault = onorbiteventTupleResponse.equipmentAtFault
            equipmentCausingLossNotes = onorbiteventTupleResponse.equipmentCausingLossNotes
            equipmentPartAtFault = onorbiteventTupleResponse.equipmentPartAtFault
            equipmentTypeAtFault = onorbiteventTupleResponse.equipmentTypeAtFault
            eventResult = onorbiteventTupleResponse.eventResult
            eventTimeNotes = onorbiteventTupleResponse.eventTimeNotes
            eventType = onorbiteventTupleResponse.eventType
            geoPosition = onorbiteventTupleResponse.geoPosition
            idOnOrbit = onorbiteventTupleResponse.idOnOrbit
            inclined = onorbiteventTupleResponse.inclined
            injured = onorbiteventTupleResponse.injured
            insuranceCarriedNotes = onorbiteventTupleResponse.insuranceCarriedNotes
            insuranceLoss = onorbiteventTupleResponse.insuranceLoss
            insuranceLossNotes = onorbiteventTupleResponse.insuranceLossNotes
            killed = onorbiteventTupleResponse.killed
            lesseeOrgId = onorbiteventTupleResponse.lesseeOrgId
            lifeLost = onorbiteventTupleResponse.lifeLost
            netAmount = onorbiteventTupleResponse.netAmount
            objectStatus = onorbiteventTupleResponse.objectStatus
            occurrenceFlightPhase = onorbiteventTupleResponse.occurrenceFlightPhase
            officialLossDate = onorbiteventTupleResponse.officialLossDate
            onOrbit = onorbiteventTupleResponse.onOrbit
            operatedOnBehalfOfOrgId = onorbiteventTupleResponse.operatedOnBehalfOfOrgId
            operatorOrgId = onorbiteventTupleResponse.operatorOrgId
            origin = onorbiteventTupleResponse.origin
            origNetwork = onorbiteventTupleResponse.origNetwork
            origObjectId = onorbiteventTupleResponse.origObjectId
            ownerOrgId = onorbiteventTupleResponse.ownerOrgId
            planeNumber = onorbiteventTupleResponse.planeNumber
            planeSlot = onorbiteventTupleResponse.planeSlot
            positionStatus = onorbiteventTupleResponse.positionStatus
            remarks = onorbiteventTupleResponse.remarks
            satellitePosition = onorbiteventTupleResponse.satellitePosition
            satNo = onorbiteventTupleResponse.satNo
            stageAtFault = onorbiteventTupleResponse.stageAtFault
            thirdPartyInsuranceLoss = onorbiteventTupleResponse.thirdPartyInsuranceLoss
            underlyingCause = onorbiteventTupleResponse.underlyingCause
            untilTime = onorbiteventTupleResponse.untilTime
            updatedAt = onorbiteventTupleResponse.updatedAt
            updatedBy = onorbiteventTupleResponse.updatedBy
            additionalProperties = onorbiteventTupleResponse.additionalProperties.toMutableMap()
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

        /**
         * Date/Time of the event. See eventTimeNotes for remarks on the accuracy of the date time.
         */
        fun eventTime(eventTime: OffsetDateTime) = eventTime(JsonField.of(eventTime))

        /**
         * Sets [Builder.eventTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventTime(eventTime: JsonField<OffsetDateTime>) = apply { this.eventTime = eventTime }

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

        /** Achieved phase of flight prior to the event. */
        fun achievedFlightPhase(achievedFlightPhase: String) =
            achievedFlightPhase(JsonField.of(achievedFlightPhase))

        /**
         * Sets [Builder.achievedFlightPhase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.achievedFlightPhase] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun achievedFlightPhase(achievedFlightPhase: JsonField<String>) = apply {
            this.achievedFlightPhase = achievedFlightPhase
        }

        /** Spacecraft age at the event in years. */
        fun ageAtEvent(ageAtEvent: Double) = ageAtEvent(JsonField.of(ageAtEvent))

        /**
         * Sets [Builder.ageAtEvent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ageAtEvent] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ageAtEvent(ageAtEvent: JsonField<Double>) = apply { this.ageAtEvent = ageAtEvent }

        /** Spacecraft capability loss incurred, as a fraction of 1. */
        fun capabilityLoss(capabilityLoss: Double) = capabilityLoss(JsonField.of(capabilityLoss))

        /**
         * Sets [Builder.capabilityLoss] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilityLoss] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun capabilityLoss(capabilityLoss: JsonField<Double>) = apply {
            this.capabilityLoss = capabilityLoss
        }

        /** Notes on capability loss at the time of event. */
        fun capabilityLossNotes(capabilityLossNotes: String) =
            capabilityLossNotes(JsonField.of(capabilityLossNotes))

        /**
         * Sets [Builder.capabilityLossNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilityLossNotes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun capabilityLossNotes(capabilityLossNotes: JsonField<String>) = apply {
            this.capabilityLossNotes = capabilityLossNotes
        }

        /** Spacecraft capacity loss incurred, as a fraction of 1. */
        fun capacityLoss(capacityLoss: Double) = capacityLoss(JsonField.of(capacityLoss))

        /**
         * Sets [Builder.capacityLoss] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capacityLoss] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun capacityLoss(capacityLoss: JsonField<Double>) = apply {
            this.capacityLoss = capacityLoss
        }

        /**
         * Additional equipment which failed as a result of faulty equipment on the spacecraft
         * during the event.
         */
        fun consequentialEquipmentFailure(consequentialEquipmentFailure: String) =
            consequentialEquipmentFailure(JsonField.of(consequentialEquipmentFailure))

        /**
         * Sets [Builder.consequentialEquipmentFailure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.consequentialEquipmentFailure] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun consequentialEquipmentFailure(consequentialEquipmentFailure: JsonField<String>) =
            apply {
                this.consequentialEquipmentFailure = consequentialEquipmentFailure
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

        /** The declassification date of this data, in ISO 8601 UTC format. */
        fun declassificationDate(declassificationDate: OffsetDateTime) =
            declassificationDate(JsonField.of(declassificationDate))

        /**
         * Sets [Builder.declassificationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declassificationDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun declassificationDate(declassificationDate: JsonField<OffsetDateTime>) = apply {
            this.declassificationDate = declassificationDate
        }

        /** Declassification string of this data. */
        fun declassificationString(declassificationString: String) =
            declassificationString(JsonField.of(declassificationString))

        /**
         * Sets [Builder.declassificationString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declassificationString] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun declassificationString(declassificationString: JsonField<String>) = apply {
            this.declassificationString = declassificationString
        }

        /** The sources or SCG references from which the classification of this data is derived. */
        fun derivedFrom(derivedFrom: String) = derivedFrom(JsonField.of(derivedFrom))

        /**
         * Sets [Builder.derivedFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.derivedFrom] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun derivedFrom(derivedFrom: JsonField<String>) = apply { this.derivedFrom = derivedFrom }

        /** Notes/description of the event. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Equipment on the spacecraft which caused the event. */
        fun equipmentAtFault(equipmentAtFault: String) =
            equipmentAtFault(JsonField.of(equipmentAtFault))

        /**
         * Sets [Builder.equipmentAtFault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.equipmentAtFault] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun equipmentAtFault(equipmentAtFault: JsonField<String>) = apply {
            this.equipmentAtFault = equipmentAtFault
        }

        /** Additional notes on the equipment causing the event/loss. */
        fun equipmentCausingLossNotes(equipmentCausingLossNotes: String) =
            equipmentCausingLossNotes(JsonField.of(equipmentCausingLossNotes))

        /**
         * Sets [Builder.equipmentCausingLossNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.equipmentCausingLossNotes] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun equipmentCausingLossNotes(equipmentCausingLossNotes: JsonField<String>) = apply {
            this.equipmentCausingLossNotes = equipmentCausingLossNotes
        }

        /** Specific part of the equipment on the spacecraft which caused the event. */
        fun equipmentPartAtFault(equipmentPartAtFault: String) =
            equipmentPartAtFault(JsonField.of(equipmentPartAtFault))

        /**
         * Sets [Builder.equipmentPartAtFault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.equipmentPartAtFault] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun equipmentPartAtFault(equipmentPartAtFault: JsonField<String>) = apply {
            this.equipmentPartAtFault = equipmentPartAtFault
        }

        /** Type of the equipment on the spacecraft which caused the event. */
        fun equipmentTypeAtFault(equipmentTypeAtFault: String) =
            equipmentTypeAtFault(JsonField.of(equipmentTypeAtFault))

        /**
         * Sets [Builder.equipmentTypeAtFault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.equipmentTypeAtFault] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun equipmentTypeAtFault(equipmentTypeAtFault: JsonField<String>) = apply {
            this.equipmentTypeAtFault = equipmentTypeAtFault
        }

        /** The result of the reported event. */
        fun eventResult(eventResult: String) = eventResult(JsonField.of(eventResult))

        /**
         * Sets [Builder.eventResult] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventResult] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventResult(eventResult: JsonField<String>) = apply { this.eventResult = eventResult }

        /** Notes/remarks on the validity/accuracy of the eventTime. */
        fun eventTimeNotes(eventTimeNotes: String) = eventTimeNotes(JsonField.of(eventTimeNotes))

        /**
         * Sets [Builder.eventTimeNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTimeNotes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventTimeNotes(eventTimeNotes: JsonField<String>) = apply {
            this.eventTimeNotes = eventTimeNotes
        }

        /** The type of on-orbit event being reported. */
        fun eventType(eventType: String) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

        /** GEO position longitude at event time if applicable. Negative values are west. */
        fun geoPosition(geoPosition: Double) = geoPosition(JsonField.of(geoPosition))

        /**
         * Sets [Builder.geoPosition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoPosition] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun geoPosition(geoPosition: JsonField<Double>) = apply { this.geoPosition = geoPosition }

        /** Unique identifier of the on-orbit object for this event. */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /** Boolean indicating if the spacecraft is inclined. */
        fun inclined(inclined: Boolean) = inclined(JsonField.of(inclined))

        /**
         * Sets [Builder.inclined] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inclined] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inclined(inclined: JsonField<Boolean>) = apply { this.inclined = inclined }

        /** Number of humans injured in the event. */
        fun injured(injured: Int) = injured(JsonField.of(injured))

        /**
         * Sets [Builder.injured] to an arbitrary JSON value.
         *
         * You should usually call [Builder.injured] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun injured(injured: JsonField<Int>) = apply { this.injured = injured }

        /** Additional insurance notes on coverages at the time of event. */
        fun insuranceCarriedNotes(insuranceCarriedNotes: String) =
            insuranceCarriedNotes(JsonField.of(insuranceCarriedNotes))

        /**
         * Sets [Builder.insuranceCarriedNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insuranceCarriedNotes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun insuranceCarriedNotes(insuranceCarriedNotes: JsonField<String>) = apply {
            this.insuranceCarriedNotes = insuranceCarriedNotes
        }

        /** Insurance loss incurred, as a fraction of 1. */
        fun insuranceLoss(insuranceLoss: Double) = insuranceLoss(JsonField.of(insuranceLoss))

        /**
         * Sets [Builder.insuranceLoss] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insuranceLoss] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun insuranceLoss(insuranceLoss: JsonField<Double>) = apply {
            this.insuranceLoss = insuranceLoss
        }

        /** Additional insurance notes if the event is an official loss. */
        fun insuranceLossNotes(insuranceLossNotes: String) =
            insuranceLossNotes(JsonField.of(insuranceLossNotes))

        /**
         * Sets [Builder.insuranceLossNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insuranceLossNotes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun insuranceLossNotes(insuranceLossNotes: JsonField<String>) = apply {
            this.insuranceLossNotes = insuranceLossNotes
        }

        /** Number of humans killed in the event. */
        fun killed(killed: Int) = killed(JsonField.of(killed))

        /**
         * Sets [Builder.killed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.killed] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun killed(killed: JsonField<Int>) = apply { this.killed = killed }

        /** Unique identifier of the organization which leases this on-orbit spacecraft. */
        fun lesseeOrgId(lesseeOrgId: String) = lesseeOrgId(JsonField.of(lesseeOrgId))

        /**
         * Sets [Builder.lesseeOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lesseeOrgId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lesseeOrgId(lesseeOrgId: JsonField<String>) = apply { this.lesseeOrgId = lesseeOrgId }

        /** Spacecraft life lost due to the event as a percent/fraction of 1. */
        fun lifeLost(lifeLost: Double) = lifeLost(JsonField.of(lifeLost))

        /**
         * Sets [Builder.lifeLost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lifeLost] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lifeLost(lifeLost: JsonField<Double>) = apply { this.lifeLost = lifeLost }

        /** Net amount of the insurance claim for the event, in USD. */
        fun netAmount(netAmount: Double) = netAmount(JsonField.of(netAmount))

        /**
         * Sets [Builder.netAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netAmount] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun netAmount(netAmount: JsonField<Double>) = apply { this.netAmount = netAmount }

        /** The status of the on-orbit object. */
        fun objectStatus(objectStatus: String) = objectStatus(JsonField.of(objectStatus))

        /**
         * Sets [Builder.objectStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectStatus(objectStatus: JsonField<String>) = apply {
            this.objectStatus = objectStatus
        }

        /** Phase of flight during which the event occurred. */
        fun occurrenceFlightPhase(occurrenceFlightPhase: String) =
            occurrenceFlightPhase(JsonField.of(occurrenceFlightPhase))

        /**
         * Sets [Builder.occurrenceFlightPhase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occurrenceFlightPhase] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun occurrenceFlightPhase(occurrenceFlightPhase: JsonField<String>) = apply {
            this.occurrenceFlightPhase = occurrenceFlightPhase
        }

        /** Date time of official loss of the spacecraft. */
        fun officialLossDate(officialLossDate: OffsetDateTime) =
            officialLossDate(JsonField.of(officialLossDate))

        /**
         * Sets [Builder.officialLossDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.officialLossDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun officialLossDate(officialLossDate: JsonField<OffsetDateTime>) = apply {
            this.officialLossDate = officialLossDate
        }

        /** Model object representing on-orbit objects or satellites in the system. */
        fun onOrbit(onOrbit: OnorbitFull) = onOrbit(JsonField.of(onOrbit))

        /**
         * Sets [Builder.onOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onOrbit] with a well-typed [OnorbitFull] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun onOrbit(onOrbit: JsonField<OnorbitFull>) = apply { this.onOrbit = onOrbit }

        /**
         * Unique identifier of the organization on whose behalf the on-orbit spacecraft is
         * operated.
         */
        fun operatedOnBehalfOfOrgId(operatedOnBehalfOfOrgId: String) =
            operatedOnBehalfOfOrgId(JsonField.of(operatedOnBehalfOfOrgId))

        /**
         * Sets [Builder.operatedOnBehalfOfOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatedOnBehalfOfOrgId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun operatedOnBehalfOfOrgId(operatedOnBehalfOfOrgId: JsonField<String>) = apply {
            this.operatedOnBehalfOfOrgId = operatedOnBehalfOfOrgId
        }

        /** Organization ID of the operator of the on-orbit spacecraft at the time of the event. */
        fun operatorOrgId(operatorOrgId: String) = operatorOrgId(JsonField.of(operatorOrgId))

        /**
         * Sets [Builder.operatorOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatorOrgId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operatorOrgId(operatorOrgId: JsonField<String>) = apply {
            this.operatorOrgId = operatorOrgId
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
         * Original object ID or Catalog Number provided by source (may not map to an existing
         * idOnOrbit in UDL).
         */
        fun origObjectId(origObjectId: String) = origObjectId(JsonField.of(origObjectId))

        /**
         * Sets [Builder.origObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origObjectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origObjectId(origObjectId: JsonField<String>) = apply {
            this.origObjectId = origObjectId
        }

        /** Organization ID of the owner of the on-orbit spacecraft at the time of the event. */
        fun ownerOrgId(ownerOrgId: String) = ownerOrgId(JsonField.of(ownerOrgId))

        /**
         * Sets [Builder.ownerOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownerOrgId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ownerOrgId(ownerOrgId: JsonField<String>) = apply { this.ownerOrgId = ownerOrgId }

        /** GEO slot plane number/designator of the spacecraft at event time. */
        fun planeNumber(planeNumber: String) = planeNumber(JsonField.of(planeNumber))

        /**
         * Sets [Builder.planeNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planeNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun planeNumber(planeNumber: JsonField<String>) = apply { this.planeNumber = planeNumber }

        /** GEO plane slot of the spacecraft at event time. */
        fun planeSlot(planeSlot: String) = planeSlot(JsonField.of(planeSlot))

        /**
         * Sets [Builder.planeSlot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planeSlot] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun planeSlot(planeSlot: JsonField<String>) = apply { this.planeSlot = planeSlot }

        /**
         * Position status of the spacecraft at event time (e.g. Stable, Drifting/Tumbling, etc).
         */
        fun positionStatus(positionStatus: String) = positionStatus(JsonField.of(positionStatus))

        /**
         * Sets [Builder.positionStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.positionStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun positionStatus(positionStatus: JsonField<String>) = apply {
            this.positionStatus = positionStatus
        }

        /** Additional remarks on the event description. */
        fun remarks(remarks: String) = remarks(JsonField.of(remarks))

        /**
         * Sets [Builder.remarks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remarks] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun remarks(remarks: JsonField<String>) = apply { this.remarks = remarks }

        /** Description of the satellite orbital position or regime. */
        fun satellitePosition(satellitePosition: String) =
            satellitePosition(JsonField.of(satellitePosition))

        /**
         * Sets [Builder.satellitePosition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satellitePosition] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun satellitePosition(satellitePosition: JsonField<String>) = apply {
            this.satellitePosition = satellitePosition
        }

        /** Satellite/Catalog number of the target on-orbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /** Faulty stage of flight for the event. */
        fun stageAtFault(stageAtFault: String) = stageAtFault(JsonField.of(stageAtFault))

        /**
         * Sets [Builder.stageAtFault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stageAtFault] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stageAtFault(stageAtFault: JsonField<String>) = apply {
            this.stageAtFault = stageAtFault
        }

        /** Insurance loss incurred by 3rd party insurance, in USD. */
        fun thirdPartyInsuranceLoss(thirdPartyInsuranceLoss: Double) =
            thirdPartyInsuranceLoss(JsonField.of(thirdPartyInsuranceLoss))

        /**
         * Sets [Builder.thirdPartyInsuranceLoss] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thirdPartyInsuranceLoss] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun thirdPartyInsuranceLoss(thirdPartyInsuranceLoss: JsonField<Double>) = apply {
            this.thirdPartyInsuranceLoss = thirdPartyInsuranceLoss
        }

        /** Underlying cause of the event. */
        fun underlyingCause(underlyingCause: String) =
            underlyingCause(JsonField.of(underlyingCause))

        /**
         * Sets [Builder.underlyingCause] to an arbitrary JSON value.
         *
         * You should usually call [Builder.underlyingCause] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun underlyingCause(underlyingCause: JsonField<String>) = apply {
            this.underlyingCause = underlyingCause
        }

        /** Maximum validity time of the event. */
        fun untilTime(untilTime: OffsetDateTime) = untilTime(JsonField.of(untilTime))

        /**
         * Sets [Builder.untilTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.untilTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun untilTime(untilTime: JsonField<OffsetDateTime>) = apply { this.untilTime = untilTime }

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
         * Returns an immutable instance of [OnorbiteventTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .eventTime()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OnorbiteventTupleResponse =
            OnorbiteventTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("eventTime", eventTime),
                checkRequired("source", source),
                id,
                achievedFlightPhase,
                ageAtEvent,
                capabilityLoss,
                capabilityLossNotes,
                capacityLoss,
                consequentialEquipmentFailure,
                createdAt,
                createdBy,
                declassificationDate,
                declassificationString,
                derivedFrom,
                description,
                equipmentAtFault,
                equipmentCausingLossNotes,
                equipmentPartAtFault,
                equipmentTypeAtFault,
                eventResult,
                eventTimeNotes,
                eventType,
                geoPosition,
                idOnOrbit,
                inclined,
                injured,
                insuranceCarriedNotes,
                insuranceLoss,
                insuranceLossNotes,
                killed,
                lesseeOrgId,
                lifeLost,
                netAmount,
                objectStatus,
                occurrenceFlightPhase,
                officialLossDate,
                onOrbit,
                operatedOnBehalfOfOrgId,
                operatorOrgId,
                origin,
                origNetwork,
                origObjectId,
                ownerOrgId,
                planeNumber,
                planeSlot,
                positionStatus,
                remarks,
                satellitePosition,
                satNo,
                stageAtFault,
                thirdPartyInsuranceLoss,
                underlyingCause,
                untilTime,
                updatedAt,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OnorbiteventTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        eventTime()
        source()
        id()
        achievedFlightPhase()
        ageAtEvent()
        capabilityLoss()
        capabilityLossNotes()
        capacityLoss()
        consequentialEquipmentFailure()
        createdAt()
        createdBy()
        declassificationDate()
        declassificationString()
        derivedFrom()
        description()
        equipmentAtFault()
        equipmentCausingLossNotes()
        equipmentPartAtFault()
        equipmentTypeAtFault()
        eventResult()
        eventTimeNotes()
        eventType()
        geoPosition()
        idOnOrbit()
        inclined()
        injured()
        insuranceCarriedNotes()
        insuranceLoss()
        insuranceLossNotes()
        killed()
        lesseeOrgId()
        lifeLost()
        netAmount()
        objectStatus()
        occurrenceFlightPhase()
        officialLossDate()
        onOrbit().ifPresent { it.validate() }
        operatedOnBehalfOfOrgId()
        operatorOrgId()
        origin()
        origNetwork()
        origObjectId()
        ownerOrgId()
        planeNumber()
        planeSlot()
        positionStatus()
        remarks()
        satellitePosition()
        satNo()
        stageAtFault()
        thirdPartyInsuranceLoss()
        underlyingCause()
        untilTime()
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
            (if (eventTime.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (achievedFlightPhase.asKnown().isPresent) 1 else 0) +
            (if (ageAtEvent.asKnown().isPresent) 1 else 0) +
            (if (capabilityLoss.asKnown().isPresent) 1 else 0) +
            (if (capabilityLossNotes.asKnown().isPresent) 1 else 0) +
            (if (capacityLoss.asKnown().isPresent) 1 else 0) +
            (if (consequentialEquipmentFailure.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (declassificationDate.asKnown().isPresent) 1 else 0) +
            (if (declassificationString.asKnown().isPresent) 1 else 0) +
            (if (derivedFrom.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (equipmentAtFault.asKnown().isPresent) 1 else 0) +
            (if (equipmentCausingLossNotes.asKnown().isPresent) 1 else 0) +
            (if (equipmentPartAtFault.asKnown().isPresent) 1 else 0) +
            (if (equipmentTypeAtFault.asKnown().isPresent) 1 else 0) +
            (if (eventResult.asKnown().isPresent) 1 else 0) +
            (if (eventTimeNotes.asKnown().isPresent) 1 else 0) +
            (if (eventType.asKnown().isPresent) 1 else 0) +
            (if (geoPosition.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (inclined.asKnown().isPresent) 1 else 0) +
            (if (injured.asKnown().isPresent) 1 else 0) +
            (if (insuranceCarriedNotes.asKnown().isPresent) 1 else 0) +
            (if (insuranceLoss.asKnown().isPresent) 1 else 0) +
            (if (insuranceLossNotes.asKnown().isPresent) 1 else 0) +
            (if (killed.asKnown().isPresent) 1 else 0) +
            (if (lesseeOrgId.asKnown().isPresent) 1 else 0) +
            (if (lifeLost.asKnown().isPresent) 1 else 0) +
            (if (netAmount.asKnown().isPresent) 1 else 0) +
            (if (objectStatus.asKnown().isPresent) 1 else 0) +
            (if (occurrenceFlightPhase.asKnown().isPresent) 1 else 0) +
            (if (officialLossDate.asKnown().isPresent) 1 else 0) +
            (onOrbit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operatedOnBehalfOfOrgId.asKnown().isPresent) 1 else 0) +
            (if (operatorOrgId.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (ownerOrgId.asKnown().isPresent) 1 else 0) +
            (if (planeNumber.asKnown().isPresent) 1 else 0) +
            (if (planeSlot.asKnown().isPresent) 1 else 0) +
            (if (positionStatus.asKnown().isPresent) 1 else 0) +
            (if (remarks.asKnown().isPresent) 1 else 0) +
            (if (satellitePosition.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (stageAtFault.asKnown().isPresent) 1 else 0) +
            (if (thirdPartyInsuranceLoss.asKnown().isPresent) 1 else 0) +
            (if (underlyingCause.asKnown().isPresent) 1 else 0) +
            (if (untilTime.asKnown().isPresent) 1 else 0) +
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

        return other is OnorbiteventTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            eventTime == other.eventTime &&
            source == other.source &&
            id == other.id &&
            achievedFlightPhase == other.achievedFlightPhase &&
            ageAtEvent == other.ageAtEvent &&
            capabilityLoss == other.capabilityLoss &&
            capabilityLossNotes == other.capabilityLossNotes &&
            capacityLoss == other.capacityLoss &&
            consequentialEquipmentFailure == other.consequentialEquipmentFailure &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            declassificationDate == other.declassificationDate &&
            declassificationString == other.declassificationString &&
            derivedFrom == other.derivedFrom &&
            description == other.description &&
            equipmentAtFault == other.equipmentAtFault &&
            equipmentCausingLossNotes == other.equipmentCausingLossNotes &&
            equipmentPartAtFault == other.equipmentPartAtFault &&
            equipmentTypeAtFault == other.equipmentTypeAtFault &&
            eventResult == other.eventResult &&
            eventTimeNotes == other.eventTimeNotes &&
            eventType == other.eventType &&
            geoPosition == other.geoPosition &&
            idOnOrbit == other.idOnOrbit &&
            inclined == other.inclined &&
            injured == other.injured &&
            insuranceCarriedNotes == other.insuranceCarriedNotes &&
            insuranceLoss == other.insuranceLoss &&
            insuranceLossNotes == other.insuranceLossNotes &&
            killed == other.killed &&
            lesseeOrgId == other.lesseeOrgId &&
            lifeLost == other.lifeLost &&
            netAmount == other.netAmount &&
            objectStatus == other.objectStatus &&
            occurrenceFlightPhase == other.occurrenceFlightPhase &&
            officialLossDate == other.officialLossDate &&
            onOrbit == other.onOrbit &&
            operatedOnBehalfOfOrgId == other.operatedOnBehalfOfOrgId &&
            operatorOrgId == other.operatorOrgId &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            ownerOrgId == other.ownerOrgId &&
            planeNumber == other.planeNumber &&
            planeSlot == other.planeSlot &&
            positionStatus == other.positionStatus &&
            remarks == other.remarks &&
            satellitePosition == other.satellitePosition &&
            satNo == other.satNo &&
            stageAtFault == other.stageAtFault &&
            thirdPartyInsuranceLoss == other.thirdPartyInsuranceLoss &&
            underlyingCause == other.underlyingCause &&
            untilTime == other.untilTime &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            eventTime,
            source,
            id,
            achievedFlightPhase,
            ageAtEvent,
            capabilityLoss,
            capabilityLossNotes,
            capacityLoss,
            consequentialEquipmentFailure,
            createdAt,
            createdBy,
            declassificationDate,
            declassificationString,
            derivedFrom,
            description,
            equipmentAtFault,
            equipmentCausingLossNotes,
            equipmentPartAtFault,
            equipmentTypeAtFault,
            eventResult,
            eventTimeNotes,
            eventType,
            geoPosition,
            idOnOrbit,
            inclined,
            injured,
            insuranceCarriedNotes,
            insuranceLoss,
            insuranceLossNotes,
            killed,
            lesseeOrgId,
            lifeLost,
            netAmount,
            objectStatus,
            occurrenceFlightPhase,
            officialLossDate,
            onOrbit,
            operatedOnBehalfOfOrgId,
            operatorOrgId,
            origin,
            origNetwork,
            origObjectId,
            ownerOrgId,
            planeNumber,
            planeSlot,
            positionStatus,
            remarks,
            satellitePosition,
            satNo,
            stageAtFault,
            thirdPartyInsuranceLoss,
            underlyingCause,
            untilTime,
            updatedAt,
            updatedBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnorbiteventTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, eventTime=$eventTime, source=$source, id=$id, achievedFlightPhase=$achievedFlightPhase, ageAtEvent=$ageAtEvent, capabilityLoss=$capabilityLoss, capabilityLossNotes=$capabilityLossNotes, capacityLoss=$capacityLoss, consequentialEquipmentFailure=$consequentialEquipmentFailure, createdAt=$createdAt, createdBy=$createdBy, declassificationDate=$declassificationDate, declassificationString=$declassificationString, derivedFrom=$derivedFrom, description=$description, equipmentAtFault=$equipmentAtFault, equipmentCausingLossNotes=$equipmentCausingLossNotes, equipmentPartAtFault=$equipmentPartAtFault, equipmentTypeAtFault=$equipmentTypeAtFault, eventResult=$eventResult, eventTimeNotes=$eventTimeNotes, eventType=$eventType, geoPosition=$geoPosition, idOnOrbit=$idOnOrbit, inclined=$inclined, injured=$injured, insuranceCarriedNotes=$insuranceCarriedNotes, insuranceLoss=$insuranceLoss, insuranceLossNotes=$insuranceLossNotes, killed=$killed, lesseeOrgId=$lesseeOrgId, lifeLost=$lifeLost, netAmount=$netAmount, objectStatus=$objectStatus, occurrenceFlightPhase=$occurrenceFlightPhase, officialLossDate=$officialLossDate, onOrbit=$onOrbit, operatedOnBehalfOfOrgId=$operatedOnBehalfOfOrgId, operatorOrgId=$operatorOrgId, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, ownerOrgId=$ownerOrgId, planeNumber=$planeNumber, planeSlot=$planeSlot, positionStatus=$positionStatus, remarks=$remarks, satellitePosition=$satellitePosition, satNo=$satNo, stageAtFault=$stageAtFault, thirdPartyInsuranceLoss=$thirdPartyInsuranceLoss, underlyingCause=$underlyingCause, untilTime=$untilTime, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

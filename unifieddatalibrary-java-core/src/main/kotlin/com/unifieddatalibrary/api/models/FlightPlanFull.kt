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
 * Flight Plan contains data specifying the details of an intended flight including schedule and
 * expected route.
 */
class FlightPlanFull
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val arrAirfield: JsonField<String>,
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val depAirfield: JsonField<String>,
    private val genTs: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val aircraftMds: JsonField<String>,
    private val airRefuelEvents: JsonField<List<AirRefuelEvent>>,
    private val amcMissionId: JsonField<String>,
    private val appLandingFuel: JsonField<Double>,
    private val arrAlternate1: JsonField<String>,
    private val arrAlternate1Fuel: JsonField<Double>,
    private val arrAlternate2: JsonField<String>,
    private val arrAlternate2Fuel: JsonField<Double>,
    private val arrIceFuel: JsonField<Double>,
    private val arrRunway: JsonField<String>,
    private val atcAddresses: JsonField<List<String>>,
    private val avgTempDev: JsonField<Double>,
    private val burnedFuel: JsonField<Double>,
    private val callSign: JsonField<String>,
    private val cargoRemark: JsonField<String>,
    private val climbFuel: JsonField<Double>,
    private val climbTime: JsonField<String>,
    private val contingencyFuel: JsonField<Double>,
    private val countryCodes: JsonField<List<String>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val depAlternate: JsonField<String>,
    private val depressFuel: JsonField<Double>,
    private val depRunway: JsonField<String>,
    private val dragIndex: JsonField<Double>,
    private val earlyDescentFuel: JsonField<Double>,
    private val enduranceTime: JsonField<String>,
    private val enrouteFuel: JsonField<Double>,
    private val enrouteTime: JsonField<String>,
    private val equipment: JsonField<String>,
    private val estDepTime: JsonField<OffsetDateTime>,
    private val etopsAirfields: JsonField<List<String>>,
    private val etopsAltAirfields: JsonField<List<String>>,
    private val etopsRating: JsonField<String>,
    private val etopsValWindow: JsonField<String>,
    private val externalId: JsonField<String>,
    private val flightPlanMessages: JsonField<List<FlightPlanMessage>>,
    private val flightPlanPointGroups: JsonField<List<FlightPlanPointGroup>>,
    private val flightPlanWaypoints: JsonField<List<FlightPlanWaypoint>>,
    private val flightRules: JsonField<String>,
    private val flightType: JsonField<String>,
    private val fuelDegrade: JsonField<Double>,
    private val gpsRaim: JsonField<String>,
    private val holdDownFuel: JsonField<Double>,
    private val holdFuel: JsonField<Double>,
    private val holdTime: JsonField<String>,
    private val idAircraft: JsonField<String>,
    private val idArrAirfield: JsonField<String>,
    private val idDepAirfield: JsonField<String>,
    private val identExtraFuel: JsonField<Double>,
    private val idSortie: JsonField<String>,
    private val initialCruiseSpeed: JsonField<String>,
    private val initialFlightLevel: JsonField<String>,
    private val landingFuel: JsonField<Double>,
    private val legNum: JsonField<Int>,
    private val minDivertFuel: JsonField<Double>,
    private val msnIndex: JsonField<Double>,
    private val notes: JsonField<String>,
    private val numAircraft: JsonField<Int>,
    private val opConditionFuel: JsonField<Double>,
    private val opWeight: JsonField<Double>,
    private val origin: JsonField<String>,
    private val originator: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val plannerRemark: JsonField<String>,
    private val rampFuel: JsonField<Double>,
    private val remAlternate1Fuel: JsonField<Double>,
    private val remAlternate2Fuel: JsonField<Double>,
    private val reserveFuel: JsonField<Double>,
    private val routeString: JsonField<String>,
    private val sid: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val star: JsonField<String>,
    private val status: JsonField<String>,
    private val tailNumber: JsonField<String>,
    private val takeoffFuel: JsonField<Double>,
    private val taxiFuel: JsonField<Double>,
    private val thunderAvoidFuel: JsonField<Double>,
    private val tocFuel: JsonField<Double>,
    private val tocIceFuel: JsonField<Double>,
    private val todFuel: JsonField<Double>,
    private val todIceFuel: JsonField<Double>,
    private val unidentExtraFuel: JsonField<Double>,
    private val unusableFuel: JsonField<Double>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val wakeTurbCat: JsonField<String>,
    private val windFac1: JsonField<Double>,
    private val windFac2: JsonField<Double>,
    private val windFacAvg: JsonField<Double>,
    private val wxValidEnd: JsonField<OffsetDateTime>,
    private val wxValidStart: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("arrAirfield")
        @ExcludeMissing
        arrAirfield: JsonField<String> = JsonMissing.of(),
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("depAirfield")
        @ExcludeMissing
        depAirfield: JsonField<String> = JsonMissing.of(),
        @JsonProperty("genTS") @ExcludeMissing genTs: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aircraftMDS")
        @ExcludeMissing
        aircraftMds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("airRefuelEvents")
        @ExcludeMissing
        airRefuelEvents: JsonField<List<AirRefuelEvent>> = JsonMissing.of(),
        @JsonProperty("amcMissionId")
        @ExcludeMissing
        amcMissionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("appLandingFuel")
        @ExcludeMissing
        appLandingFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("arrAlternate1")
        @ExcludeMissing
        arrAlternate1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("arrAlternate1Fuel")
        @ExcludeMissing
        arrAlternate1Fuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("arrAlternate2")
        @ExcludeMissing
        arrAlternate2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("arrAlternate2Fuel")
        @ExcludeMissing
        arrAlternate2Fuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("arrIceFuel")
        @ExcludeMissing
        arrIceFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("arrRunway") @ExcludeMissing arrRunway: JsonField<String> = JsonMissing.of(),
        @JsonProperty("atcAddresses")
        @ExcludeMissing
        atcAddresses: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("avgTempDev")
        @ExcludeMissing
        avgTempDev: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("burnedFuel")
        @ExcludeMissing
        burnedFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("callSign") @ExcludeMissing callSign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cargoRemark")
        @ExcludeMissing
        cargoRemark: JsonField<String> = JsonMissing.of(),
        @JsonProperty("climbFuel") @ExcludeMissing climbFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("climbTime") @ExcludeMissing climbTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contingencyFuel")
        @ExcludeMissing
        contingencyFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("countryCodes")
        @ExcludeMissing
        countryCodes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("depAlternate")
        @ExcludeMissing
        depAlternate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("depressFuel")
        @ExcludeMissing
        depressFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("depRunway") @ExcludeMissing depRunway: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dragIndex") @ExcludeMissing dragIndex: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("earlyDescentFuel")
        @ExcludeMissing
        earlyDescentFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("enduranceTime")
        @ExcludeMissing
        enduranceTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enrouteFuel")
        @ExcludeMissing
        enrouteFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("enrouteTime")
        @ExcludeMissing
        enrouteTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("equipment") @ExcludeMissing equipment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("estDepTime")
        @ExcludeMissing
        estDepTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("etopsAirfields")
        @ExcludeMissing
        etopsAirfields: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("etopsAltAirfields")
        @ExcludeMissing
        etopsAltAirfields: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("etopsRating")
        @ExcludeMissing
        etopsRating: JsonField<String> = JsonMissing.of(),
        @JsonProperty("etopsValWindow")
        @ExcludeMissing
        etopsValWindow: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalId")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("flightPlanMessages")
        @ExcludeMissing
        flightPlanMessages: JsonField<List<FlightPlanMessage>> = JsonMissing.of(),
        @JsonProperty("flightPlanPointGroups")
        @ExcludeMissing
        flightPlanPointGroups: JsonField<List<FlightPlanPointGroup>> = JsonMissing.of(),
        @JsonProperty("flightPlanWaypoints")
        @ExcludeMissing
        flightPlanWaypoints: JsonField<List<FlightPlanWaypoint>> = JsonMissing.of(),
        @JsonProperty("flightRules")
        @ExcludeMissing
        flightRules: JsonField<String> = JsonMissing.of(),
        @JsonProperty("flightType")
        @ExcludeMissing
        flightType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fuelDegrade")
        @ExcludeMissing
        fuelDegrade: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gpsRAIM") @ExcludeMissing gpsRaim: JsonField<String> = JsonMissing.of(),
        @JsonProperty("holdDownFuel")
        @ExcludeMissing
        holdDownFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("holdFuel") @ExcludeMissing holdFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("holdTime") @ExcludeMissing holdTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idAircraft")
        @ExcludeMissing
        idAircraft: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idArrAirfield")
        @ExcludeMissing
        idArrAirfield: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idDepAirfield")
        @ExcludeMissing
        idDepAirfield: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identExtraFuel")
        @ExcludeMissing
        identExtraFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idSortie") @ExcludeMissing idSortie: JsonField<String> = JsonMissing.of(),
        @JsonProperty("initialCruiseSpeed")
        @ExcludeMissing
        initialCruiseSpeed: JsonField<String> = JsonMissing.of(),
        @JsonProperty("initialFlightLevel")
        @ExcludeMissing
        initialFlightLevel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("landingFuel")
        @ExcludeMissing
        landingFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("legNum") @ExcludeMissing legNum: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("minDivertFuel")
        @ExcludeMissing
        minDivertFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("msnIndex") @ExcludeMissing msnIndex: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numAircraft") @ExcludeMissing numAircraft: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("opConditionFuel")
        @ExcludeMissing
        opConditionFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("opWeight") @ExcludeMissing opWeight: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator")
        @ExcludeMissing
        originator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plannerRemark")
        @ExcludeMissing
        plannerRemark: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rampFuel") @ExcludeMissing rampFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("remAlternate1Fuel")
        @ExcludeMissing
        remAlternate1Fuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("remAlternate2Fuel")
        @ExcludeMissing
        remAlternate2Fuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("reserveFuel")
        @ExcludeMissing
        reserveFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("routeString")
        @ExcludeMissing
        routeString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sid") @ExcludeMissing sid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("star") @ExcludeMissing star: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tailNumber")
        @ExcludeMissing
        tailNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("takeoffFuel")
        @ExcludeMissing
        takeoffFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("taxiFuel") @ExcludeMissing taxiFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("thunderAvoidFuel")
        @ExcludeMissing
        thunderAvoidFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tocFuel") @ExcludeMissing tocFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tocIceFuel")
        @ExcludeMissing
        tocIceFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("todFuel") @ExcludeMissing todFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("todIceFuel")
        @ExcludeMissing
        todIceFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("unidentExtraFuel")
        @ExcludeMissing
        unidentExtraFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("unusableFuel")
        @ExcludeMissing
        unusableFuel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wakeTurbCat")
        @ExcludeMissing
        wakeTurbCat: JsonField<String> = JsonMissing.of(),
        @JsonProperty("windFac1") @ExcludeMissing windFac1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("windFac2") @ExcludeMissing windFac2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("windFacAvg")
        @ExcludeMissing
        windFacAvg: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("wxValidEnd")
        @ExcludeMissing
        wxValidEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("wxValidStart")
        @ExcludeMissing
        wxValidStart: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        arrAirfield,
        classificationMarking,
        dataMode,
        depAirfield,
        genTs,
        source,
        id,
        aircraftMds,
        airRefuelEvents,
        amcMissionId,
        appLandingFuel,
        arrAlternate1,
        arrAlternate1Fuel,
        arrAlternate2,
        arrAlternate2Fuel,
        arrIceFuel,
        arrRunway,
        atcAddresses,
        avgTempDev,
        burnedFuel,
        callSign,
        cargoRemark,
        climbFuel,
        climbTime,
        contingencyFuel,
        countryCodes,
        createdAt,
        createdBy,
        depAlternate,
        depressFuel,
        depRunway,
        dragIndex,
        earlyDescentFuel,
        enduranceTime,
        enrouteFuel,
        enrouteTime,
        equipment,
        estDepTime,
        etopsAirfields,
        etopsAltAirfields,
        etopsRating,
        etopsValWindow,
        externalId,
        flightPlanMessages,
        flightPlanPointGroups,
        flightPlanWaypoints,
        flightRules,
        flightType,
        fuelDegrade,
        gpsRaim,
        holdDownFuel,
        holdFuel,
        holdTime,
        idAircraft,
        idArrAirfield,
        idDepAirfield,
        identExtraFuel,
        idSortie,
        initialCruiseSpeed,
        initialFlightLevel,
        landingFuel,
        legNum,
        minDivertFuel,
        msnIndex,
        notes,
        numAircraft,
        opConditionFuel,
        opWeight,
        origin,
        originator,
        origNetwork,
        plannerRemark,
        rampFuel,
        remAlternate1Fuel,
        remAlternate2Fuel,
        reserveFuel,
        routeString,
        sid,
        sourceDl,
        star,
        status,
        tailNumber,
        takeoffFuel,
        taxiFuel,
        thunderAvoidFuel,
        tocFuel,
        tocIceFuel,
        todFuel,
        todIceFuel,
        unidentExtraFuel,
        unusableFuel,
        updatedAt,
        updatedBy,
        wakeTurbCat,
        windFac1,
        windFac2,
        windFacAvg,
        wxValidEnd,
        wxValidStart,
        mutableMapOf(),
    )

    /**
     * The airfield identifier of the arrival location, International Civil Aviation Organization
     * (ICAO) code preferred.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun arrAirfield(): String = arrAirfield.getRequired("arrAirfield")

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
     * The airfield identifier of the departure location, International Civil Aviation Organization
     * (ICAO) code preferred.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun depAirfield(): String = depAirfield.getRequired("depAirfield")

    /**
     * The generation time of this flight plan in ISO 8601 UTC format, with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun genTs(): OffsetDateTime = genTs.getRequired("genTS")

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
     * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE, KC-130
     * HERCULES, etc.) of the aircraft associated with this flight plan. Intended as, but not
     * constrained to, MIL-STD-6016 environment dependent specific type designations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aircraftMds(): Optional<String> = aircraftMds.getOptional("aircraftMDS")

    /**
     * Collection of air refueling events occurring on this flight.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun airRefuelEvents(): Optional<List<AirRefuelEvent>> =
        airRefuelEvents.getOptional("airRefuelEvents")

    /**
     * Air Mobility Command (AMC) mission identifier according to Mobility Air Forces (MAF)
     * encode/decode procedures.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun amcMissionId(): Optional<String> = amcMissionId.getOptional("amcMissionId")

    /**
     * Fuel burned from the initial approach point to landing in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun appLandingFuel(): Optional<Double> = appLandingFuel.getOptional("appLandingFuel")

    /**
     * The first designated alternate arrival airfield, International Civil Aviation Organization
     * (ICAO) code preferred.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arrAlternate1(): Optional<String> = arrAlternate1.getOptional("arrAlternate1")

    /**
     * Fuel required to fly to alternate landing site 1 and land in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arrAlternate1Fuel(): Optional<Double> = arrAlternate1Fuel.getOptional("arrAlternate1Fuel")

    /**
     * The second designated alternate arrival airfield, International Civil Aviation Organization
     * (ICAO) code preferred.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arrAlternate2(): Optional<String> = arrAlternate2.getOptional("arrAlternate2")

    /**
     * Fuel required to fly to alternate landing site 2 and land in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arrAlternate2Fuel(): Optional<Double> = arrAlternate2Fuel.getOptional("arrAlternate2Fuel")

    /**
     * Additional fuel burned at landing/missed approach for icing during arrival in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arrIceFuel(): Optional<Double> = arrIceFuel.getOptional("arrIceFuel")

    /**
     * The arrival runway for this flight.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arrRunway(): Optional<String> = arrRunway.getOptional("arrRunway")

    /**
     * Array of Air Traffic Control (ATC) addresses.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun atcAddresses(): Optional<List<String>> = atcAddresses.getOptional("atcAddresses")

    /**
     * Average temperature deviation of the primary, divert, and alternate path for the route
     * between first Top of Climb and last Top of Descent in degrees Celsius.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avgTempDev(): Optional<Double> = avgTempDev.getOptional("avgTempDev")

    /**
     * Fuel planned to be burned during the flight in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun burnedFuel(): Optional<Double> = burnedFuel.getOptional("burnedFuel")

    /**
     * The call sign assigned to the aircraft for this flight plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun callSign(): Optional<String> = callSign.getOptional("callSign")

    /**
     * Remarks about the planned cargo associated with this flight plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cargoRemark(): Optional<String> = cargoRemark.getOptional("cargoRemark")

    /**
     * Fuel required from brake release to Top of Climb in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun climbFuel(): Optional<Double> = climbFuel.getOptional("climbFuel")

    /**
     * Time required from brake release to Top of Climb expressed as HH:MM.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun climbTime(): Optional<String> = climbTime.getOptional("climbTime")

    /**
     * The amount of contingency fuel in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun contingencyFuel(): Optional<Double> = contingencyFuel.getOptional("contingencyFuel")

    /**
     * Array of country codes for the countries overflown during this flight in ISO 3166-1 Alpha-2
     * format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun countryCodes(): Optional<List<String>> = countryCodes.getOptional("countryCodes")

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
     * The designated alternate departure airfield, International Civil Aviation Organization (ICAO)
     * code preferred.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun depAlternate(): Optional<String> = depAlternate.getOptional("depAlternate")

    /**
     * The depressurization fuel required to fly from the Equal Time Point to the Last
     * Suitable/First Suitable airfield at depressurization altitude in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun depressFuel(): Optional<Double> = depressFuel.getOptional("depressFuel")

    /**
     * The departure runway for this flight.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun depRunway(): Optional<String> = depRunway.getOptional("depRunway")

    /**
     * The percent degrade due to drag for this aircraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dragIndex(): Optional<Double> = dragIndex.getOptional("dragIndex")

    /**
     * Additional fuel burned at landing/missed approach for an early descent in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun earlyDescentFuel(): Optional<Double> = earlyDescentFuel.getOptional("earlyDescentFuel")

    /**
     * Total endurance time based on the fuel on board expressed as HH:MM.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun enduranceTime(): Optional<String> = enduranceTime.getOptional("enduranceTime")

    /**
     * Fuel required to fly from Top of Climb to Top of Descent in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun enrouteFuel(): Optional<Double> = enrouteFuel.getOptional("enrouteFuel")

    /**
     * Time required to fly from Top of Climb to Top of Descent expressed as HH:MM.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun enrouteTime(): Optional<String> = enrouteTime.getOptional("enrouteTime")

    /**
     * The list of equipment on the aircraft as defined in the Flight Information Publications
     * (FLIP) General Planning (GP) manual.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun equipment(): Optional<String> = equipment.getOptional("equipment")

    /**
     * The estimated time of departure for the aircraft, in ISO 8601 UTC format, with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun estDepTime(): Optional<OffsetDateTime> = estDepTime.getOptional("estDepTime")

    /**
     * Array of Extended Operations (ETOPS) adequate landing airfields that are within the mission
     * region.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun etopsAirfields(): Optional<List<String>> = etopsAirfields.getOptional("etopsAirfields")

    /**
     * Array of Extended Operations (ETOPS) alternate suitable landing airfields that are within the
     * mission region.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun etopsAltAirfields(): Optional<List<String>> =
        etopsAltAirfields.getOptional("etopsAltAirfields")

    /**
     * The Extended Operations (ETOPS) rating used to calculate this flight plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun etopsRating(): Optional<String> = etopsRating.getOptional("etopsRating")

    /**
     * The Extended Operations (ETOPS) validity window for the alternate airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun etopsValWindow(): Optional<String> = etopsValWindow.getOptional("etopsValWindow")

    /**
     * The source ID of the flight plan from the generating system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("externalId")

    /**
     * Collection of messages associated with this flight plan indicating the severity, the point
     * where the message was generated, the path (Primary, Alternate, etc.), and the text of the
     * message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun flightPlanMessages(): Optional<List<FlightPlanMessage>> =
        flightPlanMessages.getOptional("flightPlanMessages")

    /**
     * Collection of point groups generated for this flight plan. Groups include point sets for
     * Extended Operations (ETOPS), Critical Fuel Point, and Equal Time Point (ETP).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun flightPlanPointGroups(): Optional<List<FlightPlanPointGroup>> =
        flightPlanPointGroups.getOptional("flightPlanPointGroups")

    /**
     * Collection of waypoints associated with this flight plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun flightPlanWaypoints(): Optional<List<FlightPlanWaypoint>> =
        flightPlanWaypoints.getOptional("flightPlanWaypoints")

    /**
     * The flight rules this flight plan is being filed under.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun flightRules(): Optional<String> = flightRules.getOptional("flightRules")

    /**
     * The type of flight (MILITARY, CIVILIAN, etc).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun flightType(): Optional<String> = flightType.getOptional("flightType")

    /**
     * The fuel degrade percentage used for this mission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fuelDegrade(): Optional<Double> = fuelDegrade.getOptional("fuelDegrade")

    /**
     * The GPS Receiver Autonomous Integrity Monitoring (RAIM) message. A RAIM system assesses the
     * integrity of the GPS signals. This system predicts outages for a specified geographical area.
     * These predictions are based on the location, path, and scheduled GPS satellite outages.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gpsRaim(): Optional<String> = gpsRaim.getOptional("gpsRAIM")

    /**
     * Additional fuel burned at Top of Climb in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun holdDownFuel(): Optional<Double> = holdDownFuel.getOptional("holdDownFuel")

    /**
     * Additional fuel burned at the destination for holding in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun holdFuel(): Optional<Double> = holdFuel.getOptional("holdFuel")

    /**
     * Additional time for holding at the destination expressed as HH:MM.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun holdTime(): Optional<String> = holdTime.getOptional("holdTime")

    /**
     * The UDL unique identifier of the aircraft associated with this flight plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idAircraft(): Optional<String> = idAircraft.getOptional("idAircraft")

    /**
     * The UDL unique identifier of the arrival airfield associated with this flight plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idArrAirfield(): Optional<String> = idArrAirfield.getOptional("idArrAirfield")

    /**
     * The UDL unique identifier of the departure airfield associated with this flight plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idDepAirfield(): Optional<String> = idDepAirfield.getOptional("idDepAirfield")

    /**
     * The amount of identified extra fuel carried and not available in the burn plan in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun identExtraFuel(): Optional<Double> = identExtraFuel.getOptional("identExtraFuel")

    /**
     * The UDL unique identifier of the aircraft sortie associated with this flight plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSortie(): Optional<String> = idSortie.getOptional("idSortie")

    /**
     * A character string representation of the initial filed cruise speed for this flight
     * (prepended values of K, N, and M represent kilometers per hour, knots, and Mach,
     * respectively).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun initialCruiseSpeed(): Optional<String> =
        initialCruiseSpeed.getOptional("initialCruiseSpeed")

    /**
     * A character string representation of the initial filed altitude level for this flight
     * (prepended values of F, S, A, and M represent flight level in hundreds of feet, standard
     * metric level in tens of meters, altitude in hundreds of feet, and altitude in tens of meters,
     * respectively).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun initialFlightLevel(): Optional<String> =
        initialFlightLevel.getOptional("initialFlightLevel")

    /**
     * Fuel planned to be remaining on the airplane at landing in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun landingFuel(): Optional<Double> = landingFuel.getOptional("landingFuel")

    /**
     * The leg number of this flight plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun legNum(): Optional<Int> = legNum.getOptional("legNum")

    /**
     * The minimum fuel on board required to divert in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minDivertFuel(): Optional<Double> = minDivertFuel.getOptional("minDivertFuel")

    /**
     * The mission index value for this mission. The mission index is the ratio of time-related cost
     * of aircraft operation to the cost of fuel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun msnIndex(): Optional<Double> = msnIndex.getOptional("msnIndex")

    /**
     * Additional remarks for air traffic control for this flight.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * The number of aircraft flying this flight plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numAircraft(): Optional<Int> = numAircraft.getOptional("numAircraft")

    /**
     * Additional fuel burned at Top of Descent for the operational condition in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opConditionFuel(): Optional<Double> = opConditionFuel.getOptional("opConditionFuel")

    /**
     * Operating weight of the aircraft in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opWeight(): Optional<Double> = opWeight.getOptional("opWeight")

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
     * Air Traffic Control address filing the flight plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun originator(): Optional<String> = originator.getOptional("originator")

    /**
     * The originating source network on which this record was created, auto-populated by the
     * system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

    /**
     * Remarks from the planners concerning this flight plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun plannerRemark(): Optional<String> = plannerRemark.getOptional("plannerRemark")

    /**
     * Total of all fuel required to complete the flight in pounds, including fuel to be dispensed
     * on a refueling mission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rampFuel(): Optional<Double> = rampFuel.getOptional("rampFuel")

    /**
     * Total fuel remaining at alternate landing site 1 in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun remAlternate1Fuel(): Optional<Double> = remAlternate1Fuel.getOptional("remAlternate1Fuel")

    /**
     * Total fuel remaining at alternate landing site 2 in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun remAlternate2Fuel(): Optional<Double> = remAlternate2Fuel.getOptional("remAlternate2Fuel")

    /**
     * The amount of reserve fuel in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reserveFuel(): Optional<Double> = reserveFuel.getOptional("reserveFuel")

    /**
     * The 1801 fileable route of flight string for this flight. The route of flight string contains
     * route designators, significant points, change of speed/altitude, change of flight rules, and
     * cruise climbs.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun routeString(): Optional<String> = routeString.getOptional("routeString")

    /**
     * Name of the planned Standard Instrument Departure (SID) procedure.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sid(): Optional<String> = sid.getOptional("sid")

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
     * Name of the planned Standard Terminal Arrival (STAR) procedure.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun star(): Optional<String> = star.getOptional("star")

    /**
     * Status of this flight plan (e.g., ACTIVE, APPROVED, PLANNED, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * The tail number of the aircraft associated with this flight plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tailNumber(): Optional<String> = tailNumber.getOptional("tailNumber")

    /**
     * Fuel at takeoff, which is calculated as the ramp fuel minus the taxi fuel in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun takeoffFuel(): Optional<Double> = takeoffFuel.getOptional("takeoffFuel")

    /**
     * Fuel required to start engines and taxi to the end of the runway in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun taxiFuel(): Optional<Double> = taxiFuel.getOptional("taxiFuel")

    /**
     * Additional fuel burned at Top of Descent for thunderstorm avoidance in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun thunderAvoidFuel(): Optional<Double> = thunderAvoidFuel.getOptional("thunderAvoidFuel")

    /**
     * Fuel remaining at Top of Climb in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tocFuel(): Optional<Double> = tocFuel.getOptional("tocFuel")

    /**
     * Additional fuel burned at Top of Climb for icing in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tocIceFuel(): Optional<Double> = tocIceFuel.getOptional("tocIceFuel")

    /**
     * Fuel remaining at Top of Descent in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun todFuel(): Optional<Double> = todFuel.getOptional("todFuel")

    /**
     * Additional fuel burned at Top of Descent for icing in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun todIceFuel(): Optional<Double> = todIceFuel.getOptional("todIceFuel")

    /**
     * The amount of unidentified extra fuel required to get to min landing in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun unidentExtraFuel(): Optional<Double> = unidentExtraFuel.getOptional("unidentExtraFuel")

    /**
     * The amount of unusable fuel in pounds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun unusableFuel(): Optional<Double> = unusableFuel.getOptional("unusableFuel")

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
     * The wake turbulence category for this flight. The categories are assigned by the
     * International Civil Aviation Organization (ICAO) and are based on maximum certified takeoff
     * mass for the purpose of separating aircraft in flight due to wake turbulence. Valid values
     * include LIGHT, MEDIUM, LARGE, HEAVY, and SUPER.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun wakeTurbCat(): Optional<String> = wakeTurbCat.getOptional("wakeTurbCat")

    /**
     * Wind factor for the first half of the route. This is the average wind factor from first Top
     * of Climb to the mid-time of the entire route in knots. A positive value indicates a headwind,
     * while a negative value indicates a tailwind.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun windFac1(): Optional<Double> = windFac1.getOptional("windFac1")

    /**
     * Wind factor for the second half of the route. This is the average wind factor from the
     * mid-time of the entire route to last Top of Descent in knots. A positive value indicates a
     * headwind, while a negative value indicates a tailwind.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun windFac2(): Optional<Double> = windFac2.getOptional("windFac2")

    /**
     * Average wind factor from Top of Climb to Top of Descent in knots. A positive value indicates
     * a headwind, while a negative value indicates a tailwind.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun windFacAvg(): Optional<Double> = windFacAvg.getOptional("windFacAvg")

    /**
     * The date and time the weather valid period ends in ISO 8601 UTC format, with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun wxValidEnd(): Optional<OffsetDateTime> = wxValidEnd.getOptional("wxValidEnd")

    /**
     * The date and time the weather valid period begins in ISO 8601 UTC format, with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun wxValidStart(): Optional<OffsetDateTime> = wxValidStart.getOptional("wxValidStart")

    /**
     * Returns the raw JSON value of [arrAirfield].
     *
     * Unlike [arrAirfield], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arrAirfield") @ExcludeMissing fun _arrAirfield(): JsonField<String> = arrAirfield

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
     * Returns the raw JSON value of [depAirfield].
     *
     * Unlike [depAirfield], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depAirfield") @ExcludeMissing fun _depAirfield(): JsonField<String> = depAirfield

    /**
     * Returns the raw JSON value of [genTs].
     *
     * Unlike [genTs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("genTS") @ExcludeMissing fun _genTs(): JsonField<OffsetDateTime> = genTs

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
     * Returns the raw JSON value of [aircraftMds].
     *
     * Unlike [aircraftMds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aircraftMDS") @ExcludeMissing fun _aircraftMds(): JsonField<String> = aircraftMds

    /**
     * Returns the raw JSON value of [airRefuelEvents].
     *
     * Unlike [airRefuelEvents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("airRefuelEvents")
    @ExcludeMissing
    fun _airRefuelEvents(): JsonField<List<AirRefuelEvent>> = airRefuelEvents

    /**
     * Returns the raw JSON value of [amcMissionId].
     *
     * Unlike [amcMissionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amcMissionId")
    @ExcludeMissing
    fun _amcMissionId(): JsonField<String> = amcMissionId

    /**
     * Returns the raw JSON value of [appLandingFuel].
     *
     * Unlike [appLandingFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appLandingFuel")
    @ExcludeMissing
    fun _appLandingFuel(): JsonField<Double> = appLandingFuel

    /**
     * Returns the raw JSON value of [arrAlternate1].
     *
     * Unlike [arrAlternate1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arrAlternate1")
    @ExcludeMissing
    fun _arrAlternate1(): JsonField<String> = arrAlternate1

    /**
     * Returns the raw JSON value of [arrAlternate1Fuel].
     *
     * Unlike [arrAlternate1Fuel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("arrAlternate1Fuel")
    @ExcludeMissing
    fun _arrAlternate1Fuel(): JsonField<Double> = arrAlternate1Fuel

    /**
     * Returns the raw JSON value of [arrAlternate2].
     *
     * Unlike [arrAlternate2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arrAlternate2")
    @ExcludeMissing
    fun _arrAlternate2(): JsonField<String> = arrAlternate2

    /**
     * Returns the raw JSON value of [arrAlternate2Fuel].
     *
     * Unlike [arrAlternate2Fuel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("arrAlternate2Fuel")
    @ExcludeMissing
    fun _arrAlternate2Fuel(): JsonField<Double> = arrAlternate2Fuel

    /**
     * Returns the raw JSON value of [arrIceFuel].
     *
     * Unlike [arrIceFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arrIceFuel") @ExcludeMissing fun _arrIceFuel(): JsonField<Double> = arrIceFuel

    /**
     * Returns the raw JSON value of [arrRunway].
     *
     * Unlike [arrRunway], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arrRunway") @ExcludeMissing fun _arrRunway(): JsonField<String> = arrRunway

    /**
     * Returns the raw JSON value of [atcAddresses].
     *
     * Unlike [atcAddresses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("atcAddresses")
    @ExcludeMissing
    fun _atcAddresses(): JsonField<List<String>> = atcAddresses

    /**
     * Returns the raw JSON value of [avgTempDev].
     *
     * Unlike [avgTempDev], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avgTempDev") @ExcludeMissing fun _avgTempDev(): JsonField<Double> = avgTempDev

    /**
     * Returns the raw JSON value of [burnedFuel].
     *
     * Unlike [burnedFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("burnedFuel") @ExcludeMissing fun _burnedFuel(): JsonField<Double> = burnedFuel

    /**
     * Returns the raw JSON value of [callSign].
     *
     * Unlike [callSign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callSign") @ExcludeMissing fun _callSign(): JsonField<String> = callSign

    /**
     * Returns the raw JSON value of [cargoRemark].
     *
     * Unlike [cargoRemark], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cargoRemark") @ExcludeMissing fun _cargoRemark(): JsonField<String> = cargoRemark

    /**
     * Returns the raw JSON value of [climbFuel].
     *
     * Unlike [climbFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("climbFuel") @ExcludeMissing fun _climbFuel(): JsonField<Double> = climbFuel

    /**
     * Returns the raw JSON value of [climbTime].
     *
     * Unlike [climbTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("climbTime") @ExcludeMissing fun _climbTime(): JsonField<String> = climbTime

    /**
     * Returns the raw JSON value of [contingencyFuel].
     *
     * Unlike [contingencyFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contingencyFuel")
    @ExcludeMissing
    fun _contingencyFuel(): JsonField<Double> = contingencyFuel

    /**
     * Returns the raw JSON value of [countryCodes].
     *
     * Unlike [countryCodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCodes")
    @ExcludeMissing
    fun _countryCodes(): JsonField<List<String>> = countryCodes

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
     * Returns the raw JSON value of [depAlternate].
     *
     * Unlike [depAlternate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depAlternate")
    @ExcludeMissing
    fun _depAlternate(): JsonField<String> = depAlternate

    /**
     * Returns the raw JSON value of [depressFuel].
     *
     * Unlike [depressFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depressFuel") @ExcludeMissing fun _depressFuel(): JsonField<Double> = depressFuel

    /**
     * Returns the raw JSON value of [depRunway].
     *
     * Unlike [depRunway], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depRunway") @ExcludeMissing fun _depRunway(): JsonField<String> = depRunway

    /**
     * Returns the raw JSON value of [dragIndex].
     *
     * Unlike [dragIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dragIndex") @ExcludeMissing fun _dragIndex(): JsonField<Double> = dragIndex

    /**
     * Returns the raw JSON value of [earlyDescentFuel].
     *
     * Unlike [earlyDescentFuel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("earlyDescentFuel")
    @ExcludeMissing
    fun _earlyDescentFuel(): JsonField<Double> = earlyDescentFuel

    /**
     * Returns the raw JSON value of [enduranceTime].
     *
     * Unlike [enduranceTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enduranceTime")
    @ExcludeMissing
    fun _enduranceTime(): JsonField<String> = enduranceTime

    /**
     * Returns the raw JSON value of [enrouteFuel].
     *
     * Unlike [enrouteFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enrouteFuel") @ExcludeMissing fun _enrouteFuel(): JsonField<Double> = enrouteFuel

    /**
     * Returns the raw JSON value of [enrouteTime].
     *
     * Unlike [enrouteTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enrouteTime") @ExcludeMissing fun _enrouteTime(): JsonField<String> = enrouteTime

    /**
     * Returns the raw JSON value of [equipment].
     *
     * Unlike [equipment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("equipment") @ExcludeMissing fun _equipment(): JsonField<String> = equipment

    /**
     * Returns the raw JSON value of [estDepTime].
     *
     * Unlike [estDepTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("estDepTime")
    @ExcludeMissing
    fun _estDepTime(): JsonField<OffsetDateTime> = estDepTime

    /**
     * Returns the raw JSON value of [etopsAirfields].
     *
     * Unlike [etopsAirfields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("etopsAirfields")
    @ExcludeMissing
    fun _etopsAirfields(): JsonField<List<String>> = etopsAirfields

    /**
     * Returns the raw JSON value of [etopsAltAirfields].
     *
     * Unlike [etopsAltAirfields], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("etopsAltAirfields")
    @ExcludeMissing
    fun _etopsAltAirfields(): JsonField<List<String>> = etopsAltAirfields

    /**
     * Returns the raw JSON value of [etopsRating].
     *
     * Unlike [etopsRating], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("etopsRating") @ExcludeMissing fun _etopsRating(): JsonField<String> = etopsRating

    /**
     * Returns the raw JSON value of [etopsValWindow].
     *
     * Unlike [etopsValWindow], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("etopsValWindow")
    @ExcludeMissing
    fun _etopsValWindow(): JsonField<String> = etopsValWindow

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalId") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [flightPlanMessages].
     *
     * Unlike [flightPlanMessages], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("flightPlanMessages")
    @ExcludeMissing
    fun _flightPlanMessages(): JsonField<List<FlightPlanMessage>> = flightPlanMessages

    /**
     * Returns the raw JSON value of [flightPlanPointGroups].
     *
     * Unlike [flightPlanPointGroups], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("flightPlanPointGroups")
    @ExcludeMissing
    fun _flightPlanPointGroups(): JsonField<List<FlightPlanPointGroup>> = flightPlanPointGroups

    /**
     * Returns the raw JSON value of [flightPlanWaypoints].
     *
     * Unlike [flightPlanWaypoints], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("flightPlanWaypoints")
    @ExcludeMissing
    fun _flightPlanWaypoints(): JsonField<List<FlightPlanWaypoint>> = flightPlanWaypoints

    /**
     * Returns the raw JSON value of [flightRules].
     *
     * Unlike [flightRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flightRules") @ExcludeMissing fun _flightRules(): JsonField<String> = flightRules

    /**
     * Returns the raw JSON value of [flightType].
     *
     * Unlike [flightType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flightType") @ExcludeMissing fun _flightType(): JsonField<String> = flightType

    /**
     * Returns the raw JSON value of [fuelDegrade].
     *
     * Unlike [fuelDegrade], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fuelDegrade") @ExcludeMissing fun _fuelDegrade(): JsonField<Double> = fuelDegrade

    /**
     * Returns the raw JSON value of [gpsRaim].
     *
     * Unlike [gpsRaim], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gpsRAIM") @ExcludeMissing fun _gpsRaim(): JsonField<String> = gpsRaim

    /**
     * Returns the raw JSON value of [holdDownFuel].
     *
     * Unlike [holdDownFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("holdDownFuel")
    @ExcludeMissing
    fun _holdDownFuel(): JsonField<Double> = holdDownFuel

    /**
     * Returns the raw JSON value of [holdFuel].
     *
     * Unlike [holdFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("holdFuel") @ExcludeMissing fun _holdFuel(): JsonField<Double> = holdFuel

    /**
     * Returns the raw JSON value of [holdTime].
     *
     * Unlike [holdTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("holdTime") @ExcludeMissing fun _holdTime(): JsonField<String> = holdTime

    /**
     * Returns the raw JSON value of [idAircraft].
     *
     * Unlike [idAircraft], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idAircraft") @ExcludeMissing fun _idAircraft(): JsonField<String> = idAircraft

    /**
     * Returns the raw JSON value of [idArrAirfield].
     *
     * Unlike [idArrAirfield], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idArrAirfield")
    @ExcludeMissing
    fun _idArrAirfield(): JsonField<String> = idArrAirfield

    /**
     * Returns the raw JSON value of [idDepAirfield].
     *
     * Unlike [idDepAirfield], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idDepAirfield")
    @ExcludeMissing
    fun _idDepAirfield(): JsonField<String> = idDepAirfield

    /**
     * Returns the raw JSON value of [identExtraFuel].
     *
     * Unlike [identExtraFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identExtraFuel")
    @ExcludeMissing
    fun _identExtraFuel(): JsonField<Double> = identExtraFuel

    /**
     * Returns the raw JSON value of [idSortie].
     *
     * Unlike [idSortie], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSortie") @ExcludeMissing fun _idSortie(): JsonField<String> = idSortie

    /**
     * Returns the raw JSON value of [initialCruiseSpeed].
     *
     * Unlike [initialCruiseSpeed], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("initialCruiseSpeed")
    @ExcludeMissing
    fun _initialCruiseSpeed(): JsonField<String> = initialCruiseSpeed

    /**
     * Returns the raw JSON value of [initialFlightLevel].
     *
     * Unlike [initialFlightLevel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("initialFlightLevel")
    @ExcludeMissing
    fun _initialFlightLevel(): JsonField<String> = initialFlightLevel

    /**
     * Returns the raw JSON value of [landingFuel].
     *
     * Unlike [landingFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("landingFuel") @ExcludeMissing fun _landingFuel(): JsonField<Double> = landingFuel

    /**
     * Returns the raw JSON value of [legNum].
     *
     * Unlike [legNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legNum") @ExcludeMissing fun _legNum(): JsonField<Int> = legNum

    /**
     * Returns the raw JSON value of [minDivertFuel].
     *
     * Unlike [minDivertFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minDivertFuel")
    @ExcludeMissing
    fun _minDivertFuel(): JsonField<Double> = minDivertFuel

    /**
     * Returns the raw JSON value of [msnIndex].
     *
     * Unlike [msnIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msnIndex") @ExcludeMissing fun _msnIndex(): JsonField<Double> = msnIndex

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [numAircraft].
     *
     * Unlike [numAircraft], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numAircraft") @ExcludeMissing fun _numAircraft(): JsonField<Int> = numAircraft

    /**
     * Returns the raw JSON value of [opConditionFuel].
     *
     * Unlike [opConditionFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opConditionFuel")
    @ExcludeMissing
    fun _opConditionFuel(): JsonField<Double> = opConditionFuel

    /**
     * Returns the raw JSON value of [opWeight].
     *
     * Unlike [opWeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opWeight") @ExcludeMissing fun _opWeight(): JsonField<Double> = opWeight

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<String> = origin

    /**
     * Returns the raw JSON value of [originator].
     *
     * Unlike [originator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("originator") @ExcludeMissing fun _originator(): JsonField<String> = originator

    /**
     * Returns the raw JSON value of [origNetwork].
     *
     * Unlike [origNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origNetwork") @ExcludeMissing fun _origNetwork(): JsonField<String> = origNetwork

    /**
     * Returns the raw JSON value of [plannerRemark].
     *
     * Unlike [plannerRemark], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plannerRemark")
    @ExcludeMissing
    fun _plannerRemark(): JsonField<String> = plannerRemark

    /**
     * Returns the raw JSON value of [rampFuel].
     *
     * Unlike [rampFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rampFuel") @ExcludeMissing fun _rampFuel(): JsonField<Double> = rampFuel

    /**
     * Returns the raw JSON value of [remAlternate1Fuel].
     *
     * Unlike [remAlternate1Fuel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("remAlternate1Fuel")
    @ExcludeMissing
    fun _remAlternate1Fuel(): JsonField<Double> = remAlternate1Fuel

    /**
     * Returns the raw JSON value of [remAlternate2Fuel].
     *
     * Unlike [remAlternate2Fuel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("remAlternate2Fuel")
    @ExcludeMissing
    fun _remAlternate2Fuel(): JsonField<Double> = remAlternate2Fuel

    /**
     * Returns the raw JSON value of [reserveFuel].
     *
     * Unlike [reserveFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reserveFuel") @ExcludeMissing fun _reserveFuel(): JsonField<Double> = reserveFuel

    /**
     * Returns the raw JSON value of [routeString].
     *
     * Unlike [routeString], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routeString") @ExcludeMissing fun _routeString(): JsonField<String> = routeString

    /**
     * Returns the raw JSON value of [sid].
     *
     * Unlike [sid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [star].
     *
     * Unlike [star], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("star") @ExcludeMissing fun _star(): JsonField<String> = star

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [tailNumber].
     *
     * Unlike [tailNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tailNumber") @ExcludeMissing fun _tailNumber(): JsonField<String> = tailNumber

    /**
     * Returns the raw JSON value of [takeoffFuel].
     *
     * Unlike [takeoffFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("takeoffFuel") @ExcludeMissing fun _takeoffFuel(): JsonField<Double> = takeoffFuel

    /**
     * Returns the raw JSON value of [taxiFuel].
     *
     * Unlike [taxiFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taxiFuel") @ExcludeMissing fun _taxiFuel(): JsonField<Double> = taxiFuel

    /**
     * Returns the raw JSON value of [thunderAvoidFuel].
     *
     * Unlike [thunderAvoidFuel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("thunderAvoidFuel")
    @ExcludeMissing
    fun _thunderAvoidFuel(): JsonField<Double> = thunderAvoidFuel

    /**
     * Returns the raw JSON value of [tocFuel].
     *
     * Unlike [tocFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tocFuel") @ExcludeMissing fun _tocFuel(): JsonField<Double> = tocFuel

    /**
     * Returns the raw JSON value of [tocIceFuel].
     *
     * Unlike [tocIceFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tocIceFuel") @ExcludeMissing fun _tocIceFuel(): JsonField<Double> = tocIceFuel

    /**
     * Returns the raw JSON value of [todFuel].
     *
     * Unlike [todFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("todFuel") @ExcludeMissing fun _todFuel(): JsonField<Double> = todFuel

    /**
     * Returns the raw JSON value of [todIceFuel].
     *
     * Unlike [todIceFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("todIceFuel") @ExcludeMissing fun _todIceFuel(): JsonField<Double> = todIceFuel

    /**
     * Returns the raw JSON value of [unidentExtraFuel].
     *
     * Unlike [unidentExtraFuel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("unidentExtraFuel")
    @ExcludeMissing
    fun _unidentExtraFuel(): JsonField<Double> = unidentExtraFuel

    /**
     * Returns the raw JSON value of [unusableFuel].
     *
     * Unlike [unusableFuel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unusableFuel")
    @ExcludeMissing
    fun _unusableFuel(): JsonField<Double> = unusableFuel

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
     * Returns the raw JSON value of [wakeTurbCat].
     *
     * Unlike [wakeTurbCat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wakeTurbCat") @ExcludeMissing fun _wakeTurbCat(): JsonField<String> = wakeTurbCat

    /**
     * Returns the raw JSON value of [windFac1].
     *
     * Unlike [windFac1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("windFac1") @ExcludeMissing fun _windFac1(): JsonField<Double> = windFac1

    /**
     * Returns the raw JSON value of [windFac2].
     *
     * Unlike [windFac2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("windFac2") @ExcludeMissing fun _windFac2(): JsonField<Double> = windFac2

    /**
     * Returns the raw JSON value of [windFacAvg].
     *
     * Unlike [windFacAvg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("windFacAvg") @ExcludeMissing fun _windFacAvg(): JsonField<Double> = windFacAvg

    /**
     * Returns the raw JSON value of [wxValidEnd].
     *
     * Unlike [wxValidEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wxValidEnd")
    @ExcludeMissing
    fun _wxValidEnd(): JsonField<OffsetDateTime> = wxValidEnd

    /**
     * Returns the raw JSON value of [wxValidStart].
     *
     * Unlike [wxValidStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wxValidStart")
    @ExcludeMissing
    fun _wxValidStart(): JsonField<OffsetDateTime> = wxValidStart

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
         * Returns a mutable builder for constructing an instance of [FlightPlanFull].
         *
         * The following fields are required:
         * ```java
         * .arrAirfield()
         * .classificationMarking()
         * .dataMode()
         * .depAirfield()
         * .genTs()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FlightPlanFull]. */
    class Builder internal constructor() {

        private var arrAirfield: JsonField<String>? = null
        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var depAirfield: JsonField<String>? = null
        private var genTs: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var aircraftMds: JsonField<String> = JsonMissing.of()
        private var airRefuelEvents: JsonField<MutableList<AirRefuelEvent>>? = null
        private var amcMissionId: JsonField<String> = JsonMissing.of()
        private var appLandingFuel: JsonField<Double> = JsonMissing.of()
        private var arrAlternate1: JsonField<String> = JsonMissing.of()
        private var arrAlternate1Fuel: JsonField<Double> = JsonMissing.of()
        private var arrAlternate2: JsonField<String> = JsonMissing.of()
        private var arrAlternate2Fuel: JsonField<Double> = JsonMissing.of()
        private var arrIceFuel: JsonField<Double> = JsonMissing.of()
        private var arrRunway: JsonField<String> = JsonMissing.of()
        private var atcAddresses: JsonField<MutableList<String>>? = null
        private var avgTempDev: JsonField<Double> = JsonMissing.of()
        private var burnedFuel: JsonField<Double> = JsonMissing.of()
        private var callSign: JsonField<String> = JsonMissing.of()
        private var cargoRemark: JsonField<String> = JsonMissing.of()
        private var climbFuel: JsonField<Double> = JsonMissing.of()
        private var climbTime: JsonField<String> = JsonMissing.of()
        private var contingencyFuel: JsonField<Double> = JsonMissing.of()
        private var countryCodes: JsonField<MutableList<String>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var depAlternate: JsonField<String> = JsonMissing.of()
        private var depressFuel: JsonField<Double> = JsonMissing.of()
        private var depRunway: JsonField<String> = JsonMissing.of()
        private var dragIndex: JsonField<Double> = JsonMissing.of()
        private var earlyDescentFuel: JsonField<Double> = JsonMissing.of()
        private var enduranceTime: JsonField<String> = JsonMissing.of()
        private var enrouteFuel: JsonField<Double> = JsonMissing.of()
        private var enrouteTime: JsonField<String> = JsonMissing.of()
        private var equipment: JsonField<String> = JsonMissing.of()
        private var estDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var etopsAirfields: JsonField<MutableList<String>>? = null
        private var etopsAltAirfields: JsonField<MutableList<String>>? = null
        private var etopsRating: JsonField<String> = JsonMissing.of()
        private var etopsValWindow: JsonField<String> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var flightPlanMessages: JsonField<MutableList<FlightPlanMessage>>? = null
        private var flightPlanPointGroups: JsonField<MutableList<FlightPlanPointGroup>>? = null
        private var flightPlanWaypoints: JsonField<MutableList<FlightPlanWaypoint>>? = null
        private var flightRules: JsonField<String> = JsonMissing.of()
        private var flightType: JsonField<String> = JsonMissing.of()
        private var fuelDegrade: JsonField<Double> = JsonMissing.of()
        private var gpsRaim: JsonField<String> = JsonMissing.of()
        private var holdDownFuel: JsonField<Double> = JsonMissing.of()
        private var holdFuel: JsonField<Double> = JsonMissing.of()
        private var holdTime: JsonField<String> = JsonMissing.of()
        private var idAircraft: JsonField<String> = JsonMissing.of()
        private var idArrAirfield: JsonField<String> = JsonMissing.of()
        private var idDepAirfield: JsonField<String> = JsonMissing.of()
        private var identExtraFuel: JsonField<Double> = JsonMissing.of()
        private var idSortie: JsonField<String> = JsonMissing.of()
        private var initialCruiseSpeed: JsonField<String> = JsonMissing.of()
        private var initialFlightLevel: JsonField<String> = JsonMissing.of()
        private var landingFuel: JsonField<Double> = JsonMissing.of()
        private var legNum: JsonField<Int> = JsonMissing.of()
        private var minDivertFuel: JsonField<Double> = JsonMissing.of()
        private var msnIndex: JsonField<Double> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var numAircraft: JsonField<Int> = JsonMissing.of()
        private var opConditionFuel: JsonField<Double> = JsonMissing.of()
        private var opWeight: JsonField<Double> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var originator: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var plannerRemark: JsonField<String> = JsonMissing.of()
        private var rampFuel: JsonField<Double> = JsonMissing.of()
        private var remAlternate1Fuel: JsonField<Double> = JsonMissing.of()
        private var remAlternate2Fuel: JsonField<Double> = JsonMissing.of()
        private var reserveFuel: JsonField<Double> = JsonMissing.of()
        private var routeString: JsonField<String> = JsonMissing.of()
        private var sid: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var star: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var tailNumber: JsonField<String> = JsonMissing.of()
        private var takeoffFuel: JsonField<Double> = JsonMissing.of()
        private var taxiFuel: JsonField<Double> = JsonMissing.of()
        private var thunderAvoidFuel: JsonField<Double> = JsonMissing.of()
        private var tocFuel: JsonField<Double> = JsonMissing.of()
        private var tocIceFuel: JsonField<Double> = JsonMissing.of()
        private var todFuel: JsonField<Double> = JsonMissing.of()
        private var todIceFuel: JsonField<Double> = JsonMissing.of()
        private var unidentExtraFuel: JsonField<Double> = JsonMissing.of()
        private var unusableFuel: JsonField<Double> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var wakeTurbCat: JsonField<String> = JsonMissing.of()
        private var windFac1: JsonField<Double> = JsonMissing.of()
        private var windFac2: JsonField<Double> = JsonMissing.of()
        private var windFacAvg: JsonField<Double> = JsonMissing.of()
        private var wxValidEnd: JsonField<OffsetDateTime> = JsonMissing.of()
        private var wxValidStart: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(flightPlanFull: FlightPlanFull) = apply {
            arrAirfield = flightPlanFull.arrAirfield
            classificationMarking = flightPlanFull.classificationMarking
            dataMode = flightPlanFull.dataMode
            depAirfield = flightPlanFull.depAirfield
            genTs = flightPlanFull.genTs
            source = flightPlanFull.source
            id = flightPlanFull.id
            aircraftMds = flightPlanFull.aircraftMds
            airRefuelEvents = flightPlanFull.airRefuelEvents.map { it.toMutableList() }
            amcMissionId = flightPlanFull.amcMissionId
            appLandingFuel = flightPlanFull.appLandingFuel
            arrAlternate1 = flightPlanFull.arrAlternate1
            arrAlternate1Fuel = flightPlanFull.arrAlternate1Fuel
            arrAlternate2 = flightPlanFull.arrAlternate2
            arrAlternate2Fuel = flightPlanFull.arrAlternate2Fuel
            arrIceFuel = flightPlanFull.arrIceFuel
            arrRunway = flightPlanFull.arrRunway
            atcAddresses = flightPlanFull.atcAddresses.map { it.toMutableList() }
            avgTempDev = flightPlanFull.avgTempDev
            burnedFuel = flightPlanFull.burnedFuel
            callSign = flightPlanFull.callSign
            cargoRemark = flightPlanFull.cargoRemark
            climbFuel = flightPlanFull.climbFuel
            climbTime = flightPlanFull.climbTime
            contingencyFuel = flightPlanFull.contingencyFuel
            countryCodes = flightPlanFull.countryCodes.map { it.toMutableList() }
            createdAt = flightPlanFull.createdAt
            createdBy = flightPlanFull.createdBy
            depAlternate = flightPlanFull.depAlternate
            depressFuel = flightPlanFull.depressFuel
            depRunway = flightPlanFull.depRunway
            dragIndex = flightPlanFull.dragIndex
            earlyDescentFuel = flightPlanFull.earlyDescentFuel
            enduranceTime = flightPlanFull.enduranceTime
            enrouteFuel = flightPlanFull.enrouteFuel
            enrouteTime = flightPlanFull.enrouteTime
            equipment = flightPlanFull.equipment
            estDepTime = flightPlanFull.estDepTime
            etopsAirfields = flightPlanFull.etopsAirfields.map { it.toMutableList() }
            etopsAltAirfields = flightPlanFull.etopsAltAirfields.map { it.toMutableList() }
            etopsRating = flightPlanFull.etopsRating
            etopsValWindow = flightPlanFull.etopsValWindow
            externalId = flightPlanFull.externalId
            flightPlanMessages = flightPlanFull.flightPlanMessages.map { it.toMutableList() }
            flightPlanPointGroups = flightPlanFull.flightPlanPointGroups.map { it.toMutableList() }
            flightPlanWaypoints = flightPlanFull.flightPlanWaypoints.map { it.toMutableList() }
            flightRules = flightPlanFull.flightRules
            flightType = flightPlanFull.flightType
            fuelDegrade = flightPlanFull.fuelDegrade
            gpsRaim = flightPlanFull.gpsRaim
            holdDownFuel = flightPlanFull.holdDownFuel
            holdFuel = flightPlanFull.holdFuel
            holdTime = flightPlanFull.holdTime
            idAircraft = flightPlanFull.idAircraft
            idArrAirfield = flightPlanFull.idArrAirfield
            idDepAirfield = flightPlanFull.idDepAirfield
            identExtraFuel = flightPlanFull.identExtraFuel
            idSortie = flightPlanFull.idSortie
            initialCruiseSpeed = flightPlanFull.initialCruiseSpeed
            initialFlightLevel = flightPlanFull.initialFlightLevel
            landingFuel = flightPlanFull.landingFuel
            legNum = flightPlanFull.legNum
            minDivertFuel = flightPlanFull.minDivertFuel
            msnIndex = flightPlanFull.msnIndex
            notes = flightPlanFull.notes
            numAircraft = flightPlanFull.numAircraft
            opConditionFuel = flightPlanFull.opConditionFuel
            opWeight = flightPlanFull.opWeight
            origin = flightPlanFull.origin
            originator = flightPlanFull.originator
            origNetwork = flightPlanFull.origNetwork
            plannerRemark = flightPlanFull.plannerRemark
            rampFuel = flightPlanFull.rampFuel
            remAlternate1Fuel = flightPlanFull.remAlternate1Fuel
            remAlternate2Fuel = flightPlanFull.remAlternate2Fuel
            reserveFuel = flightPlanFull.reserveFuel
            routeString = flightPlanFull.routeString
            sid = flightPlanFull.sid
            sourceDl = flightPlanFull.sourceDl
            star = flightPlanFull.star
            status = flightPlanFull.status
            tailNumber = flightPlanFull.tailNumber
            takeoffFuel = flightPlanFull.takeoffFuel
            taxiFuel = flightPlanFull.taxiFuel
            thunderAvoidFuel = flightPlanFull.thunderAvoidFuel
            tocFuel = flightPlanFull.tocFuel
            tocIceFuel = flightPlanFull.tocIceFuel
            todFuel = flightPlanFull.todFuel
            todIceFuel = flightPlanFull.todIceFuel
            unidentExtraFuel = flightPlanFull.unidentExtraFuel
            unusableFuel = flightPlanFull.unusableFuel
            updatedAt = flightPlanFull.updatedAt
            updatedBy = flightPlanFull.updatedBy
            wakeTurbCat = flightPlanFull.wakeTurbCat
            windFac1 = flightPlanFull.windFac1
            windFac2 = flightPlanFull.windFac2
            windFacAvg = flightPlanFull.windFacAvg
            wxValidEnd = flightPlanFull.wxValidEnd
            wxValidStart = flightPlanFull.wxValidStart
            additionalProperties = flightPlanFull.additionalProperties.toMutableMap()
        }

        /**
         * The airfield identifier of the arrival location, International Civil Aviation
         * Organization (ICAO) code preferred.
         */
        fun arrAirfield(arrAirfield: String) = arrAirfield(JsonField.of(arrAirfield))

        /**
         * Sets [Builder.arrAirfield] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrAirfield] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun arrAirfield(arrAirfield: JsonField<String>) = apply { this.arrAirfield = arrAirfield }

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

        /**
         * The airfield identifier of the departure location, International Civil Aviation
         * Organization (ICAO) code preferred.
         */
        fun depAirfield(depAirfield: String) = depAirfield(JsonField.of(depAirfield))

        /**
         * Sets [Builder.depAirfield] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depAirfield] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun depAirfield(depAirfield: JsonField<String>) = apply { this.depAirfield = depAirfield }

        /**
         * The generation time of this flight plan in ISO 8601 UTC format, with millisecond
         * precision.
         */
        fun genTs(genTs: OffsetDateTime) = genTs(JsonField.of(genTs))

        /**
         * Sets [Builder.genTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.genTs] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun genTs(genTs: JsonField<OffsetDateTime>) = apply { this.genTs = genTs }

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
         * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE, KC-130
         * HERCULES, etc.) of the aircraft associated with this flight plan. Intended as, but not
         * constrained to, MIL-STD-6016 environment dependent specific type designations.
         */
        fun aircraftMds(aircraftMds: String) = aircraftMds(JsonField.of(aircraftMds))

        /**
         * Sets [Builder.aircraftMds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aircraftMds] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aircraftMds(aircraftMds: JsonField<String>) = apply { this.aircraftMds = aircraftMds }

        /** Collection of air refueling events occurring on this flight. */
        fun airRefuelEvents(airRefuelEvents: List<AirRefuelEvent>) =
            airRefuelEvents(JsonField.of(airRefuelEvents))

        /**
         * Sets [Builder.airRefuelEvents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.airRefuelEvents] with a well-typed
         * `List<AirRefuelEvent>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun airRefuelEvents(airRefuelEvents: JsonField<List<AirRefuelEvent>>) = apply {
            this.airRefuelEvents = airRefuelEvents.map { it.toMutableList() }
        }

        /**
         * Adds a single [AirRefuelEvent] to [airRefuelEvents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAirRefuelEvent(airRefuelEvent: AirRefuelEvent) = apply {
            airRefuelEvents =
                (airRefuelEvents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("airRefuelEvents", it).add(airRefuelEvent)
                }
        }

        /**
         * Air Mobility Command (AMC) mission identifier according to Mobility Air Forces (MAF)
         * encode/decode procedures.
         */
        fun amcMissionId(amcMissionId: String) = amcMissionId(JsonField.of(amcMissionId))

        /**
         * Sets [Builder.amcMissionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amcMissionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amcMissionId(amcMissionId: JsonField<String>) = apply {
            this.amcMissionId = amcMissionId
        }

        /** Fuel burned from the initial approach point to landing in pounds. */
        fun appLandingFuel(appLandingFuel: Double) = appLandingFuel(JsonField.of(appLandingFuel))

        /**
         * Sets [Builder.appLandingFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appLandingFuel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun appLandingFuel(appLandingFuel: JsonField<Double>) = apply {
            this.appLandingFuel = appLandingFuel
        }

        /**
         * The first designated alternate arrival airfield, International Civil Aviation
         * Organization (ICAO) code preferred.
         */
        fun arrAlternate1(arrAlternate1: String) = arrAlternate1(JsonField.of(arrAlternate1))

        /**
         * Sets [Builder.arrAlternate1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrAlternate1] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun arrAlternate1(arrAlternate1: JsonField<String>) = apply {
            this.arrAlternate1 = arrAlternate1
        }

        /** Fuel required to fly to alternate landing site 1 and land in pounds. */
        fun arrAlternate1Fuel(arrAlternate1Fuel: Double) =
            arrAlternate1Fuel(JsonField.of(arrAlternate1Fuel))

        /**
         * Sets [Builder.arrAlternate1Fuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrAlternate1Fuel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun arrAlternate1Fuel(arrAlternate1Fuel: JsonField<Double>) = apply {
            this.arrAlternate1Fuel = arrAlternate1Fuel
        }

        /**
         * The second designated alternate arrival airfield, International Civil Aviation
         * Organization (ICAO) code preferred.
         */
        fun arrAlternate2(arrAlternate2: String) = arrAlternate2(JsonField.of(arrAlternate2))

        /**
         * Sets [Builder.arrAlternate2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrAlternate2] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun arrAlternate2(arrAlternate2: JsonField<String>) = apply {
            this.arrAlternate2 = arrAlternate2
        }

        /** Fuel required to fly to alternate landing site 2 and land in pounds. */
        fun arrAlternate2Fuel(arrAlternate2Fuel: Double) =
            arrAlternate2Fuel(JsonField.of(arrAlternate2Fuel))

        /**
         * Sets [Builder.arrAlternate2Fuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrAlternate2Fuel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun arrAlternate2Fuel(arrAlternate2Fuel: JsonField<Double>) = apply {
            this.arrAlternate2Fuel = arrAlternate2Fuel
        }

        /** Additional fuel burned at landing/missed approach for icing during arrival in pounds. */
        fun arrIceFuel(arrIceFuel: Double) = arrIceFuel(JsonField.of(arrIceFuel))

        /**
         * Sets [Builder.arrIceFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrIceFuel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun arrIceFuel(arrIceFuel: JsonField<Double>) = apply { this.arrIceFuel = arrIceFuel }

        /** The arrival runway for this flight. */
        fun arrRunway(arrRunway: String) = arrRunway(JsonField.of(arrRunway))

        /**
         * Sets [Builder.arrRunway] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrRunway] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun arrRunway(arrRunway: JsonField<String>) = apply { this.arrRunway = arrRunway }

        /** Array of Air Traffic Control (ATC) addresses. */
        fun atcAddresses(atcAddresses: List<String>) = atcAddresses(JsonField.of(atcAddresses))

        /**
         * Sets [Builder.atcAddresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.atcAddresses] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun atcAddresses(atcAddresses: JsonField<List<String>>) = apply {
            this.atcAddresses = atcAddresses.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [atcAddresses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAtcAddress(atcAddress: String) = apply {
            atcAddresses =
                (atcAddresses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("atcAddresses", it).add(atcAddress)
                }
        }

        /**
         * Average temperature deviation of the primary, divert, and alternate path for the route
         * between first Top of Climb and last Top of Descent in degrees Celsius.
         */
        fun avgTempDev(avgTempDev: Double) = avgTempDev(JsonField.of(avgTempDev))

        /**
         * Sets [Builder.avgTempDev] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgTempDev] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun avgTempDev(avgTempDev: JsonField<Double>) = apply { this.avgTempDev = avgTempDev }

        /** Fuel planned to be burned during the flight in pounds. */
        fun burnedFuel(burnedFuel: Double) = burnedFuel(JsonField.of(burnedFuel))

        /**
         * Sets [Builder.burnedFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.burnedFuel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun burnedFuel(burnedFuel: JsonField<Double>) = apply { this.burnedFuel = burnedFuel }

        /** The call sign assigned to the aircraft for this flight plan. */
        fun callSign(callSign: String) = callSign(JsonField.of(callSign))

        /**
         * Sets [Builder.callSign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSign] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callSign(callSign: JsonField<String>) = apply { this.callSign = callSign }

        /** Remarks about the planned cargo associated with this flight plan. */
        fun cargoRemark(cargoRemark: String) = cargoRemark(JsonField.of(cargoRemark))

        /**
         * Sets [Builder.cargoRemark] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cargoRemark] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cargoRemark(cargoRemark: JsonField<String>) = apply { this.cargoRemark = cargoRemark }

        /** Fuel required from brake release to Top of Climb in pounds. */
        fun climbFuel(climbFuel: Double) = climbFuel(JsonField.of(climbFuel))

        /**
         * Sets [Builder.climbFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.climbFuel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun climbFuel(climbFuel: JsonField<Double>) = apply { this.climbFuel = climbFuel }

        /** Time required from brake release to Top of Climb expressed as HH:MM. */
        fun climbTime(climbTime: String) = climbTime(JsonField.of(climbTime))

        /**
         * Sets [Builder.climbTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.climbTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun climbTime(climbTime: JsonField<String>) = apply { this.climbTime = climbTime }

        /** The amount of contingency fuel in pounds. */
        fun contingencyFuel(contingencyFuel: Double) =
            contingencyFuel(JsonField.of(contingencyFuel))

        /**
         * Sets [Builder.contingencyFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contingencyFuel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contingencyFuel(contingencyFuel: JsonField<Double>) = apply {
            this.contingencyFuel = contingencyFuel
        }

        /**
         * Array of country codes for the countries overflown during this flight in ISO 3166-1
         * Alpha-2 format.
         */
        fun countryCodes(countryCodes: List<String>) = countryCodes(JsonField.of(countryCodes))

        /**
         * Sets [Builder.countryCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCodes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun countryCodes(countryCodes: JsonField<List<String>>) = apply {
            this.countryCodes = countryCodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [countryCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCountryCode(countryCode: String) = apply {
            countryCodes =
                (countryCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("countryCodes", it).add(countryCode)
                }
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
         * The designated alternate departure airfield, International Civil Aviation Organization
         * (ICAO) code preferred.
         */
        fun depAlternate(depAlternate: String) = depAlternate(JsonField.of(depAlternate))

        /**
         * Sets [Builder.depAlternate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depAlternate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun depAlternate(depAlternate: JsonField<String>) = apply {
            this.depAlternate = depAlternate
        }

        /**
         * The depressurization fuel required to fly from the Equal Time Point to the Last
         * Suitable/First Suitable airfield at depressurization altitude in pounds.
         */
        fun depressFuel(depressFuel: Double) = depressFuel(JsonField.of(depressFuel))

        /**
         * Sets [Builder.depressFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depressFuel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun depressFuel(depressFuel: JsonField<Double>) = apply { this.depressFuel = depressFuel }

        /** The departure runway for this flight. */
        fun depRunway(depRunway: String) = depRunway(JsonField.of(depRunway))

        /**
         * Sets [Builder.depRunway] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depRunway] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun depRunway(depRunway: JsonField<String>) = apply { this.depRunway = depRunway }

        /** The percent degrade due to drag for this aircraft. */
        fun dragIndex(dragIndex: Double) = dragIndex(JsonField.of(dragIndex))

        /**
         * Sets [Builder.dragIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dragIndex] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dragIndex(dragIndex: JsonField<Double>) = apply { this.dragIndex = dragIndex }

        /** Additional fuel burned at landing/missed approach for an early descent in pounds. */
        fun earlyDescentFuel(earlyDescentFuel: Double) =
            earlyDescentFuel(JsonField.of(earlyDescentFuel))

        /**
         * Sets [Builder.earlyDescentFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earlyDescentFuel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun earlyDescentFuel(earlyDescentFuel: JsonField<Double>) = apply {
            this.earlyDescentFuel = earlyDescentFuel
        }

        /** Total endurance time based on the fuel on board expressed as HH:MM. */
        fun enduranceTime(enduranceTime: String) = enduranceTime(JsonField.of(enduranceTime))

        /**
         * Sets [Builder.enduranceTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enduranceTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enduranceTime(enduranceTime: JsonField<String>) = apply {
            this.enduranceTime = enduranceTime
        }

        /** Fuel required to fly from Top of Climb to Top of Descent in pounds. */
        fun enrouteFuel(enrouteFuel: Double) = enrouteFuel(JsonField.of(enrouteFuel))

        /**
         * Sets [Builder.enrouteFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enrouteFuel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enrouteFuel(enrouteFuel: JsonField<Double>) = apply { this.enrouteFuel = enrouteFuel }

        /** Time required to fly from Top of Climb to Top of Descent expressed as HH:MM. */
        fun enrouteTime(enrouteTime: String) = enrouteTime(JsonField.of(enrouteTime))

        /**
         * Sets [Builder.enrouteTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enrouteTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enrouteTime(enrouteTime: JsonField<String>) = apply { this.enrouteTime = enrouteTime }

        /**
         * The list of equipment on the aircraft as defined in the Flight Information Publications
         * (FLIP) General Planning (GP) manual.
         */
        fun equipment(equipment: String) = equipment(JsonField.of(equipment))

        /**
         * Sets [Builder.equipment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.equipment] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun equipment(equipment: JsonField<String>) = apply { this.equipment = equipment }

        /**
         * The estimated time of departure for the aircraft, in ISO 8601 UTC format, with
         * millisecond precision.
         */
        fun estDepTime(estDepTime: OffsetDateTime) = estDepTime(JsonField.of(estDepTime))

        /**
         * Sets [Builder.estDepTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estDepTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun estDepTime(estDepTime: JsonField<OffsetDateTime>) = apply {
            this.estDepTime = estDepTime
        }

        /**
         * Array of Extended Operations (ETOPS) adequate landing airfields that are within the
         * mission region.
         */
        fun etopsAirfields(etopsAirfields: List<String>) =
            etopsAirfields(JsonField.of(etopsAirfields))

        /**
         * Sets [Builder.etopsAirfields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.etopsAirfields] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun etopsAirfields(etopsAirfields: JsonField<List<String>>) = apply {
            this.etopsAirfields = etopsAirfields.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [etopsAirfields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEtopsAirfield(etopsAirfield: String) = apply {
            etopsAirfields =
                (etopsAirfields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("etopsAirfields", it).add(etopsAirfield)
                }
        }

        /**
         * Array of Extended Operations (ETOPS) alternate suitable landing airfields that are within
         * the mission region.
         */
        fun etopsAltAirfields(etopsAltAirfields: List<String>) =
            etopsAltAirfields(JsonField.of(etopsAltAirfields))

        /**
         * Sets [Builder.etopsAltAirfields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.etopsAltAirfields] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun etopsAltAirfields(etopsAltAirfields: JsonField<List<String>>) = apply {
            this.etopsAltAirfields = etopsAltAirfields.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [etopsAltAirfields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEtopsAltAirfield(etopsAltAirfield: String) = apply {
            etopsAltAirfields =
                (etopsAltAirfields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("etopsAltAirfields", it).add(etopsAltAirfield)
                }
        }

        /** The Extended Operations (ETOPS) rating used to calculate this flight plan. */
        fun etopsRating(etopsRating: String) = etopsRating(JsonField.of(etopsRating))

        /**
         * Sets [Builder.etopsRating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.etopsRating] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun etopsRating(etopsRating: JsonField<String>) = apply { this.etopsRating = etopsRating }

        /** The Extended Operations (ETOPS) validity window for the alternate airfield. */
        fun etopsValWindow(etopsValWindow: String) = etopsValWindow(JsonField.of(etopsValWindow))

        /**
         * Sets [Builder.etopsValWindow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.etopsValWindow] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun etopsValWindow(etopsValWindow: JsonField<String>) = apply {
            this.etopsValWindow = etopsValWindow
        }

        /** The source ID of the flight plan from the generating system. */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * Collection of messages associated with this flight plan indicating the severity, the
         * point where the message was generated, the path (Primary, Alternate, etc.), and the text
         * of the message.
         */
        fun flightPlanMessages(flightPlanMessages: List<FlightPlanMessage>) =
            flightPlanMessages(JsonField.of(flightPlanMessages))

        /**
         * Sets [Builder.flightPlanMessages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flightPlanMessages] with a well-typed
         * `List<FlightPlanMessage>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun flightPlanMessages(flightPlanMessages: JsonField<List<FlightPlanMessage>>) = apply {
            this.flightPlanMessages = flightPlanMessages.map { it.toMutableList() }
        }

        /**
         * Adds a single [FlightPlanMessage] to [flightPlanMessages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFlightPlanMessage(flightPlanMessage: FlightPlanMessage) = apply {
            flightPlanMessages =
                (flightPlanMessages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("flightPlanMessages", it).add(flightPlanMessage)
                }
        }

        /**
         * Collection of point groups generated for this flight plan. Groups include point sets for
         * Extended Operations (ETOPS), Critical Fuel Point, and Equal Time Point (ETP).
         */
        fun flightPlanPointGroups(flightPlanPointGroups: List<FlightPlanPointGroup>) =
            flightPlanPointGroups(JsonField.of(flightPlanPointGroups))

        /**
         * Sets [Builder.flightPlanPointGroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flightPlanPointGroups] with a well-typed
         * `List<FlightPlanPointGroup>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun flightPlanPointGroups(flightPlanPointGroups: JsonField<List<FlightPlanPointGroup>>) =
            apply {
                this.flightPlanPointGroups = flightPlanPointGroups.map { it.toMutableList() }
            }

        /**
         * Adds a single [FlightPlanPointGroup] to [flightPlanPointGroups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFlightPlanPointGroup(flightPlanPointGroup: FlightPlanPointGroup) = apply {
            flightPlanPointGroups =
                (flightPlanPointGroups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("flightPlanPointGroups", it).add(flightPlanPointGroup)
                }
        }

        /** Collection of waypoints associated with this flight plan. */
        fun flightPlanWaypoints(flightPlanWaypoints: List<FlightPlanWaypoint>) =
            flightPlanWaypoints(JsonField.of(flightPlanWaypoints))

        /**
         * Sets [Builder.flightPlanWaypoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flightPlanWaypoints] with a well-typed
         * `List<FlightPlanWaypoint>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun flightPlanWaypoints(flightPlanWaypoints: JsonField<List<FlightPlanWaypoint>>) = apply {
            this.flightPlanWaypoints = flightPlanWaypoints.map { it.toMutableList() }
        }

        /**
         * Adds a single [FlightPlanWaypoint] to [flightPlanWaypoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFlightPlanWaypoint(flightPlanWaypoint: FlightPlanWaypoint) = apply {
            flightPlanWaypoints =
                (flightPlanWaypoints ?: JsonField.of(mutableListOf())).also {
                    checkKnown("flightPlanWaypoints", it).add(flightPlanWaypoint)
                }
        }

        /** The flight rules this flight plan is being filed under. */
        fun flightRules(flightRules: String) = flightRules(JsonField.of(flightRules))

        /**
         * Sets [Builder.flightRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flightRules] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun flightRules(flightRules: JsonField<String>) = apply { this.flightRules = flightRules }

        /** The type of flight (MILITARY, CIVILIAN, etc). */
        fun flightType(flightType: String) = flightType(JsonField.of(flightType))

        /**
         * Sets [Builder.flightType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flightType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun flightType(flightType: JsonField<String>) = apply { this.flightType = flightType }

        /** The fuel degrade percentage used for this mission. */
        fun fuelDegrade(fuelDegrade: Double) = fuelDegrade(JsonField.of(fuelDegrade))

        /**
         * Sets [Builder.fuelDegrade] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fuelDegrade] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fuelDegrade(fuelDegrade: JsonField<Double>) = apply { this.fuelDegrade = fuelDegrade }

        /**
         * The GPS Receiver Autonomous Integrity Monitoring (RAIM) message. A RAIM system assesses
         * the integrity of the GPS signals. This system predicts outages for a specified
         * geographical area. These predictions are based on the location, path, and scheduled GPS
         * satellite outages.
         */
        fun gpsRaim(gpsRaim: String) = gpsRaim(JsonField.of(gpsRaim))

        /**
         * Sets [Builder.gpsRaim] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gpsRaim] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gpsRaim(gpsRaim: JsonField<String>) = apply { this.gpsRaim = gpsRaim }

        /** Additional fuel burned at Top of Climb in pounds. */
        fun holdDownFuel(holdDownFuel: Double) = holdDownFuel(JsonField.of(holdDownFuel))

        /**
         * Sets [Builder.holdDownFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.holdDownFuel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun holdDownFuel(holdDownFuel: JsonField<Double>) = apply {
            this.holdDownFuel = holdDownFuel
        }

        /** Additional fuel burned at the destination for holding in pounds. */
        fun holdFuel(holdFuel: Double) = holdFuel(JsonField.of(holdFuel))

        /**
         * Sets [Builder.holdFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.holdFuel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun holdFuel(holdFuel: JsonField<Double>) = apply { this.holdFuel = holdFuel }

        /** Additional time for holding at the destination expressed as HH:MM. */
        fun holdTime(holdTime: String) = holdTime(JsonField.of(holdTime))

        /**
         * Sets [Builder.holdTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.holdTime] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun holdTime(holdTime: JsonField<String>) = apply { this.holdTime = holdTime }

        /** The UDL unique identifier of the aircraft associated with this flight plan. */
        fun idAircraft(idAircraft: String) = idAircraft(JsonField.of(idAircraft))

        /**
         * Sets [Builder.idAircraft] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idAircraft] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idAircraft(idAircraft: JsonField<String>) = apply { this.idAircraft = idAircraft }

        /** The UDL unique identifier of the arrival airfield associated with this flight plan. */
        fun idArrAirfield(idArrAirfield: String) = idArrAirfield(JsonField.of(idArrAirfield))

        /**
         * Sets [Builder.idArrAirfield] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idArrAirfield] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idArrAirfield(idArrAirfield: JsonField<String>) = apply {
            this.idArrAirfield = idArrAirfield
        }

        /** The UDL unique identifier of the departure airfield associated with this flight plan. */
        fun idDepAirfield(idDepAirfield: String) = idDepAirfield(JsonField.of(idDepAirfield))

        /**
         * Sets [Builder.idDepAirfield] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idDepAirfield] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idDepAirfield(idDepAirfield: JsonField<String>) = apply {
            this.idDepAirfield = idDepAirfield
        }

        /**
         * The amount of identified extra fuel carried and not available in the burn plan in pounds.
         */
        fun identExtraFuel(identExtraFuel: Double) = identExtraFuel(JsonField.of(identExtraFuel))

        /**
         * Sets [Builder.identExtraFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identExtraFuel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun identExtraFuel(identExtraFuel: JsonField<Double>) = apply {
            this.identExtraFuel = identExtraFuel
        }

        /** The UDL unique identifier of the aircraft sortie associated with this flight plan. */
        fun idSortie(idSortie: String) = idSortie(JsonField.of(idSortie))

        /**
         * Sets [Builder.idSortie] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSortie] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSortie(idSortie: JsonField<String>) = apply { this.idSortie = idSortie }

        /**
         * A character string representation of the initial filed cruise speed for this flight
         * (prepended values of K, N, and M represent kilometers per hour, knots, and Mach,
         * respectively).
         */
        fun initialCruiseSpeed(initialCruiseSpeed: String) =
            initialCruiseSpeed(JsonField.of(initialCruiseSpeed))

        /**
         * Sets [Builder.initialCruiseSpeed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialCruiseSpeed] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun initialCruiseSpeed(initialCruiseSpeed: JsonField<String>) = apply {
            this.initialCruiseSpeed = initialCruiseSpeed
        }

        /**
         * A character string representation of the initial filed altitude level for this flight
         * (prepended values of F, S, A, and M represent flight level in hundreds of feet, standard
         * metric level in tens of meters, altitude in hundreds of feet, and altitude in tens of
         * meters, respectively).
         */
        fun initialFlightLevel(initialFlightLevel: String) =
            initialFlightLevel(JsonField.of(initialFlightLevel))

        /**
         * Sets [Builder.initialFlightLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialFlightLevel] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun initialFlightLevel(initialFlightLevel: JsonField<String>) = apply {
            this.initialFlightLevel = initialFlightLevel
        }

        /** Fuel planned to be remaining on the airplane at landing in pounds. */
        fun landingFuel(landingFuel: Double) = landingFuel(JsonField.of(landingFuel))

        /**
         * Sets [Builder.landingFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.landingFuel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun landingFuel(landingFuel: JsonField<Double>) = apply { this.landingFuel = landingFuel }

        /** The leg number of this flight plan. */
        fun legNum(legNum: Int) = legNum(JsonField.of(legNum))

        /**
         * Sets [Builder.legNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legNum] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun legNum(legNum: JsonField<Int>) = apply { this.legNum = legNum }

        /** The minimum fuel on board required to divert in pounds. */
        fun minDivertFuel(minDivertFuel: Double) = minDivertFuel(JsonField.of(minDivertFuel))

        /**
         * Sets [Builder.minDivertFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minDivertFuel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minDivertFuel(minDivertFuel: JsonField<Double>) = apply {
            this.minDivertFuel = minDivertFuel
        }

        /**
         * The mission index value for this mission. The mission index is the ratio of time-related
         * cost of aircraft operation to the cost of fuel.
         */
        fun msnIndex(msnIndex: Double) = msnIndex(JsonField.of(msnIndex))

        /**
         * Sets [Builder.msnIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msnIndex] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun msnIndex(msnIndex: JsonField<Double>) = apply { this.msnIndex = msnIndex }

        /** Additional remarks for air traffic control for this flight. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

        /** The number of aircraft flying this flight plan. */
        fun numAircraft(numAircraft: Int) = numAircraft(JsonField.of(numAircraft))

        /**
         * Sets [Builder.numAircraft] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numAircraft] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numAircraft(numAircraft: JsonField<Int>) = apply { this.numAircraft = numAircraft }

        /** Additional fuel burned at Top of Descent for the operational condition in pounds. */
        fun opConditionFuel(opConditionFuel: Double) =
            opConditionFuel(JsonField.of(opConditionFuel))

        /**
         * Sets [Builder.opConditionFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opConditionFuel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun opConditionFuel(opConditionFuel: JsonField<Double>) = apply {
            this.opConditionFuel = opConditionFuel
        }

        /** Operating weight of the aircraft in pounds. */
        fun opWeight(opWeight: Double) = opWeight(JsonField.of(opWeight))

        /**
         * Sets [Builder.opWeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opWeight] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun opWeight(opWeight: JsonField<Double>) = apply { this.opWeight = opWeight }

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

        /** Air Traffic Control address filing the flight plan. */
        fun originator(originator: String) = originator(JsonField.of(originator))

        /**
         * Sets [Builder.originator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originator] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun originator(originator: JsonField<String>) = apply { this.originator = originator }

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

        /** Remarks from the planners concerning this flight plan. */
        fun plannerRemark(plannerRemark: String) = plannerRemark(JsonField.of(plannerRemark))

        /**
         * Sets [Builder.plannerRemark] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plannerRemark] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun plannerRemark(plannerRemark: JsonField<String>) = apply {
            this.plannerRemark = plannerRemark
        }

        /**
         * Total of all fuel required to complete the flight in pounds, including fuel to be
         * dispensed on a refueling mission.
         */
        fun rampFuel(rampFuel: Double) = rampFuel(JsonField.of(rampFuel))

        /**
         * Sets [Builder.rampFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rampFuel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rampFuel(rampFuel: JsonField<Double>) = apply { this.rampFuel = rampFuel }

        /** Total fuel remaining at alternate landing site 1 in pounds. */
        fun remAlternate1Fuel(remAlternate1Fuel: Double) =
            remAlternate1Fuel(JsonField.of(remAlternate1Fuel))

        /**
         * Sets [Builder.remAlternate1Fuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remAlternate1Fuel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remAlternate1Fuel(remAlternate1Fuel: JsonField<Double>) = apply {
            this.remAlternate1Fuel = remAlternate1Fuel
        }

        /** Total fuel remaining at alternate landing site 2 in pounds. */
        fun remAlternate2Fuel(remAlternate2Fuel: Double) =
            remAlternate2Fuel(JsonField.of(remAlternate2Fuel))

        /**
         * Sets [Builder.remAlternate2Fuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remAlternate2Fuel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remAlternate2Fuel(remAlternate2Fuel: JsonField<Double>) = apply {
            this.remAlternate2Fuel = remAlternate2Fuel
        }

        /** The amount of reserve fuel in pounds. */
        fun reserveFuel(reserveFuel: Double) = reserveFuel(JsonField.of(reserveFuel))

        /**
         * Sets [Builder.reserveFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reserveFuel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reserveFuel(reserveFuel: JsonField<Double>) = apply { this.reserveFuel = reserveFuel }

        /**
         * The 1801 fileable route of flight string for this flight. The route of flight string
         * contains route designators, significant points, change of speed/altitude, change of
         * flight rules, and cruise climbs.
         */
        fun routeString(routeString: String) = routeString(JsonField.of(routeString))

        /**
         * Sets [Builder.routeString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routeString] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routeString(routeString: JsonField<String>) = apply { this.routeString = routeString }

        /** Name of the planned Standard Instrument Departure (SID) procedure. */
        fun sid(sid: String) = sid(JsonField.of(sid))

        /**
         * Sets [Builder.sid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sid(sid: JsonField<String>) = apply { this.sid = sid }

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

        /** Name of the planned Standard Terminal Arrival (STAR) procedure. */
        fun star(star: String) = star(JsonField.of(star))

        /**
         * Sets [Builder.star] to an arbitrary JSON value.
         *
         * You should usually call [Builder.star] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun star(star: JsonField<String>) = apply { this.star = star }

        /** Status of this flight plan (e.g., ACTIVE, APPROVED, PLANNED, etc.). */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** The tail number of the aircraft associated with this flight plan. */
        fun tailNumber(tailNumber: String) = tailNumber(JsonField.of(tailNumber))

        /**
         * Sets [Builder.tailNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tailNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tailNumber(tailNumber: JsonField<String>) = apply { this.tailNumber = tailNumber }

        /** Fuel at takeoff, which is calculated as the ramp fuel minus the taxi fuel in pounds. */
        fun takeoffFuel(takeoffFuel: Double) = takeoffFuel(JsonField.of(takeoffFuel))

        /**
         * Sets [Builder.takeoffFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.takeoffFuel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun takeoffFuel(takeoffFuel: JsonField<Double>) = apply { this.takeoffFuel = takeoffFuel }

        /** Fuel required to start engines and taxi to the end of the runway in pounds. */
        fun taxiFuel(taxiFuel: Double) = taxiFuel(JsonField.of(taxiFuel))

        /**
         * Sets [Builder.taxiFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxiFuel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxiFuel(taxiFuel: JsonField<Double>) = apply { this.taxiFuel = taxiFuel }

        /** Additional fuel burned at Top of Descent for thunderstorm avoidance in pounds. */
        fun thunderAvoidFuel(thunderAvoidFuel: Double) =
            thunderAvoidFuel(JsonField.of(thunderAvoidFuel))

        /**
         * Sets [Builder.thunderAvoidFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thunderAvoidFuel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thunderAvoidFuel(thunderAvoidFuel: JsonField<Double>) = apply {
            this.thunderAvoidFuel = thunderAvoidFuel
        }

        /** Fuel remaining at Top of Climb in pounds. */
        fun tocFuel(tocFuel: Double) = tocFuel(JsonField.of(tocFuel))

        /**
         * Sets [Builder.tocFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tocFuel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tocFuel(tocFuel: JsonField<Double>) = apply { this.tocFuel = tocFuel }

        /** Additional fuel burned at Top of Climb for icing in pounds. */
        fun tocIceFuel(tocIceFuel: Double) = tocIceFuel(JsonField.of(tocIceFuel))

        /**
         * Sets [Builder.tocIceFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tocIceFuel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tocIceFuel(tocIceFuel: JsonField<Double>) = apply { this.tocIceFuel = tocIceFuel }

        /** Fuel remaining at Top of Descent in pounds. */
        fun todFuel(todFuel: Double) = todFuel(JsonField.of(todFuel))

        /**
         * Sets [Builder.todFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.todFuel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun todFuel(todFuel: JsonField<Double>) = apply { this.todFuel = todFuel }

        /** Additional fuel burned at Top of Descent for icing in pounds. */
        fun todIceFuel(todIceFuel: Double) = todIceFuel(JsonField.of(todIceFuel))

        /**
         * Sets [Builder.todIceFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.todIceFuel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun todIceFuel(todIceFuel: JsonField<Double>) = apply { this.todIceFuel = todIceFuel }

        /** The amount of unidentified extra fuel required to get to min landing in pounds. */
        fun unidentExtraFuel(unidentExtraFuel: Double) =
            unidentExtraFuel(JsonField.of(unidentExtraFuel))

        /**
         * Sets [Builder.unidentExtraFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unidentExtraFuel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unidentExtraFuel(unidentExtraFuel: JsonField<Double>) = apply {
            this.unidentExtraFuel = unidentExtraFuel
        }

        /** The amount of unusable fuel in pounds. */
        fun unusableFuel(unusableFuel: Double) = unusableFuel(JsonField.of(unusableFuel))

        /**
         * Sets [Builder.unusableFuel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unusableFuel] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unusableFuel(unusableFuel: JsonField<Double>) = apply {
            this.unusableFuel = unusableFuel
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

        /**
         * The wake turbulence category for this flight. The categories are assigned by the
         * International Civil Aviation Organization (ICAO) and are based on maximum certified
         * takeoff mass for the purpose of separating aircraft in flight due to wake turbulence.
         * Valid values include LIGHT, MEDIUM, LARGE, HEAVY, and SUPER.
         */
        fun wakeTurbCat(wakeTurbCat: String) = wakeTurbCat(JsonField.of(wakeTurbCat))

        /**
         * Sets [Builder.wakeTurbCat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wakeTurbCat] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun wakeTurbCat(wakeTurbCat: JsonField<String>) = apply { this.wakeTurbCat = wakeTurbCat }

        /**
         * Wind factor for the first half of the route. This is the average wind factor from first
         * Top of Climb to the mid-time of the entire route in knots. A positive value indicates a
         * headwind, while a negative value indicates a tailwind.
         */
        fun windFac1(windFac1: Double) = windFac1(JsonField.of(windFac1))

        /**
         * Sets [Builder.windFac1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.windFac1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun windFac1(windFac1: JsonField<Double>) = apply { this.windFac1 = windFac1 }

        /**
         * Wind factor for the second half of the route. This is the average wind factor from the
         * mid-time of the entire route to last Top of Descent in knots. A positive value indicates
         * a headwind, while a negative value indicates a tailwind.
         */
        fun windFac2(windFac2: Double) = windFac2(JsonField.of(windFac2))

        /**
         * Sets [Builder.windFac2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.windFac2] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun windFac2(windFac2: JsonField<Double>) = apply { this.windFac2 = windFac2 }

        /**
         * Average wind factor from Top of Climb to Top of Descent in knots. A positive value
         * indicates a headwind, while a negative value indicates a tailwind.
         */
        fun windFacAvg(windFacAvg: Double) = windFacAvg(JsonField.of(windFacAvg))

        /**
         * Sets [Builder.windFacAvg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.windFacAvg] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun windFacAvg(windFacAvg: JsonField<Double>) = apply { this.windFacAvg = windFacAvg }

        /**
         * The date and time the weather valid period ends in ISO 8601 UTC format, with millisecond
         * precision.
         */
        fun wxValidEnd(wxValidEnd: OffsetDateTime) = wxValidEnd(JsonField.of(wxValidEnd))

        /**
         * Sets [Builder.wxValidEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wxValidEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wxValidEnd(wxValidEnd: JsonField<OffsetDateTime>) = apply {
            this.wxValidEnd = wxValidEnd
        }

        /**
         * The date and time the weather valid period begins in ISO 8601 UTC format, with
         * millisecond precision.
         */
        fun wxValidStart(wxValidStart: OffsetDateTime) = wxValidStart(JsonField.of(wxValidStart))

        /**
         * Sets [Builder.wxValidStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wxValidStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wxValidStart(wxValidStart: JsonField<OffsetDateTime>) = apply {
            this.wxValidStart = wxValidStart
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
         * Returns an immutable instance of [FlightPlanFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .arrAirfield()
         * .classificationMarking()
         * .dataMode()
         * .depAirfield()
         * .genTs()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FlightPlanFull =
            FlightPlanFull(
                checkRequired("arrAirfield", arrAirfield),
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("depAirfield", depAirfield),
                checkRequired("genTs", genTs),
                checkRequired("source", source),
                id,
                aircraftMds,
                (airRefuelEvents ?: JsonMissing.of()).map { it.toImmutable() },
                amcMissionId,
                appLandingFuel,
                arrAlternate1,
                arrAlternate1Fuel,
                arrAlternate2,
                arrAlternate2Fuel,
                arrIceFuel,
                arrRunway,
                (atcAddresses ?: JsonMissing.of()).map { it.toImmutable() },
                avgTempDev,
                burnedFuel,
                callSign,
                cargoRemark,
                climbFuel,
                climbTime,
                contingencyFuel,
                (countryCodes ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                createdBy,
                depAlternate,
                depressFuel,
                depRunway,
                dragIndex,
                earlyDescentFuel,
                enduranceTime,
                enrouteFuel,
                enrouteTime,
                equipment,
                estDepTime,
                (etopsAirfields ?: JsonMissing.of()).map { it.toImmutable() },
                (etopsAltAirfields ?: JsonMissing.of()).map { it.toImmutable() },
                etopsRating,
                etopsValWindow,
                externalId,
                (flightPlanMessages ?: JsonMissing.of()).map { it.toImmutable() },
                (flightPlanPointGroups ?: JsonMissing.of()).map { it.toImmutable() },
                (flightPlanWaypoints ?: JsonMissing.of()).map { it.toImmutable() },
                flightRules,
                flightType,
                fuelDegrade,
                gpsRaim,
                holdDownFuel,
                holdFuel,
                holdTime,
                idAircraft,
                idArrAirfield,
                idDepAirfield,
                identExtraFuel,
                idSortie,
                initialCruiseSpeed,
                initialFlightLevel,
                landingFuel,
                legNum,
                minDivertFuel,
                msnIndex,
                notes,
                numAircraft,
                opConditionFuel,
                opWeight,
                origin,
                originator,
                origNetwork,
                plannerRemark,
                rampFuel,
                remAlternate1Fuel,
                remAlternate2Fuel,
                reserveFuel,
                routeString,
                sid,
                sourceDl,
                star,
                status,
                tailNumber,
                takeoffFuel,
                taxiFuel,
                thunderAvoidFuel,
                tocFuel,
                tocIceFuel,
                todFuel,
                todIceFuel,
                unidentExtraFuel,
                unusableFuel,
                updatedAt,
                updatedBy,
                wakeTurbCat,
                windFac1,
                windFac2,
                windFacAvg,
                wxValidEnd,
                wxValidStart,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FlightPlanFull = apply {
        if (validated) {
            return@apply
        }

        arrAirfield()
        classificationMarking()
        dataMode().validate()
        depAirfield()
        genTs()
        source()
        id()
        aircraftMds()
        airRefuelEvents().ifPresent { it.forEach { it.validate() } }
        amcMissionId()
        appLandingFuel()
        arrAlternate1()
        arrAlternate1Fuel()
        arrAlternate2()
        arrAlternate2Fuel()
        arrIceFuel()
        arrRunway()
        atcAddresses()
        avgTempDev()
        burnedFuel()
        callSign()
        cargoRemark()
        climbFuel()
        climbTime()
        contingencyFuel()
        countryCodes()
        createdAt()
        createdBy()
        depAlternate()
        depressFuel()
        depRunway()
        dragIndex()
        earlyDescentFuel()
        enduranceTime()
        enrouteFuel()
        enrouteTime()
        equipment()
        estDepTime()
        etopsAirfields()
        etopsAltAirfields()
        etopsRating()
        etopsValWindow()
        externalId()
        flightPlanMessages().ifPresent { it.forEach { it.validate() } }
        flightPlanPointGroups().ifPresent { it.forEach { it.validate() } }
        flightPlanWaypoints().ifPresent { it.forEach { it.validate() } }
        flightRules()
        flightType()
        fuelDegrade()
        gpsRaim()
        holdDownFuel()
        holdFuel()
        holdTime()
        idAircraft()
        idArrAirfield()
        idDepAirfield()
        identExtraFuel()
        idSortie()
        initialCruiseSpeed()
        initialFlightLevel()
        landingFuel()
        legNum()
        minDivertFuel()
        msnIndex()
        notes()
        numAircraft()
        opConditionFuel()
        opWeight()
        origin()
        originator()
        origNetwork()
        plannerRemark()
        rampFuel()
        remAlternate1Fuel()
        remAlternate2Fuel()
        reserveFuel()
        routeString()
        sid()
        sourceDl()
        star()
        status()
        tailNumber()
        takeoffFuel()
        taxiFuel()
        thunderAvoidFuel()
        tocFuel()
        tocIceFuel()
        todFuel()
        todIceFuel()
        unidentExtraFuel()
        unusableFuel()
        updatedAt()
        updatedBy()
        wakeTurbCat()
        windFac1()
        windFac2()
        windFacAvg()
        wxValidEnd()
        wxValidStart()
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
        (if (arrAirfield.asKnown().isPresent) 1 else 0) +
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (depAirfield.asKnown().isPresent) 1 else 0) +
            (if (genTs.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (aircraftMds.asKnown().isPresent) 1 else 0) +
            (airRefuelEvents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (amcMissionId.asKnown().isPresent) 1 else 0) +
            (if (appLandingFuel.asKnown().isPresent) 1 else 0) +
            (if (arrAlternate1.asKnown().isPresent) 1 else 0) +
            (if (arrAlternate1Fuel.asKnown().isPresent) 1 else 0) +
            (if (arrAlternate2.asKnown().isPresent) 1 else 0) +
            (if (arrAlternate2Fuel.asKnown().isPresent) 1 else 0) +
            (if (arrIceFuel.asKnown().isPresent) 1 else 0) +
            (if (arrRunway.asKnown().isPresent) 1 else 0) +
            (atcAddresses.asKnown().getOrNull()?.size ?: 0) +
            (if (avgTempDev.asKnown().isPresent) 1 else 0) +
            (if (burnedFuel.asKnown().isPresent) 1 else 0) +
            (if (callSign.asKnown().isPresent) 1 else 0) +
            (if (cargoRemark.asKnown().isPresent) 1 else 0) +
            (if (climbFuel.asKnown().isPresent) 1 else 0) +
            (if (climbTime.asKnown().isPresent) 1 else 0) +
            (if (contingencyFuel.asKnown().isPresent) 1 else 0) +
            (countryCodes.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (depAlternate.asKnown().isPresent) 1 else 0) +
            (if (depressFuel.asKnown().isPresent) 1 else 0) +
            (if (depRunway.asKnown().isPresent) 1 else 0) +
            (if (dragIndex.asKnown().isPresent) 1 else 0) +
            (if (earlyDescentFuel.asKnown().isPresent) 1 else 0) +
            (if (enduranceTime.asKnown().isPresent) 1 else 0) +
            (if (enrouteFuel.asKnown().isPresent) 1 else 0) +
            (if (enrouteTime.asKnown().isPresent) 1 else 0) +
            (if (equipment.asKnown().isPresent) 1 else 0) +
            (if (estDepTime.asKnown().isPresent) 1 else 0) +
            (etopsAirfields.asKnown().getOrNull()?.size ?: 0) +
            (etopsAltAirfields.asKnown().getOrNull()?.size ?: 0) +
            (if (etopsRating.asKnown().isPresent) 1 else 0) +
            (if (etopsValWindow.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (flightPlanMessages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (flightPlanPointGroups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (flightPlanWaypoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (flightRules.asKnown().isPresent) 1 else 0) +
            (if (flightType.asKnown().isPresent) 1 else 0) +
            (if (fuelDegrade.asKnown().isPresent) 1 else 0) +
            (if (gpsRaim.asKnown().isPresent) 1 else 0) +
            (if (holdDownFuel.asKnown().isPresent) 1 else 0) +
            (if (holdFuel.asKnown().isPresent) 1 else 0) +
            (if (holdTime.asKnown().isPresent) 1 else 0) +
            (if (idAircraft.asKnown().isPresent) 1 else 0) +
            (if (idArrAirfield.asKnown().isPresent) 1 else 0) +
            (if (idDepAirfield.asKnown().isPresent) 1 else 0) +
            (if (identExtraFuel.asKnown().isPresent) 1 else 0) +
            (if (idSortie.asKnown().isPresent) 1 else 0) +
            (if (initialCruiseSpeed.asKnown().isPresent) 1 else 0) +
            (if (initialFlightLevel.asKnown().isPresent) 1 else 0) +
            (if (landingFuel.asKnown().isPresent) 1 else 0) +
            (if (legNum.asKnown().isPresent) 1 else 0) +
            (if (minDivertFuel.asKnown().isPresent) 1 else 0) +
            (if (msnIndex.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (numAircraft.asKnown().isPresent) 1 else 0) +
            (if (opConditionFuel.asKnown().isPresent) 1 else 0) +
            (if (opWeight.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (originator.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (plannerRemark.asKnown().isPresent) 1 else 0) +
            (if (rampFuel.asKnown().isPresent) 1 else 0) +
            (if (remAlternate1Fuel.asKnown().isPresent) 1 else 0) +
            (if (remAlternate2Fuel.asKnown().isPresent) 1 else 0) +
            (if (reserveFuel.asKnown().isPresent) 1 else 0) +
            (if (routeString.asKnown().isPresent) 1 else 0) +
            (if (sid.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (star.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (tailNumber.asKnown().isPresent) 1 else 0) +
            (if (takeoffFuel.asKnown().isPresent) 1 else 0) +
            (if (taxiFuel.asKnown().isPresent) 1 else 0) +
            (if (thunderAvoidFuel.asKnown().isPresent) 1 else 0) +
            (if (tocFuel.asKnown().isPresent) 1 else 0) +
            (if (tocIceFuel.asKnown().isPresent) 1 else 0) +
            (if (todFuel.asKnown().isPresent) 1 else 0) +
            (if (todIceFuel.asKnown().isPresent) 1 else 0) +
            (if (unidentExtraFuel.asKnown().isPresent) 1 else 0) +
            (if (unusableFuel.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (wakeTurbCat.asKnown().isPresent) 1 else 0) +
            (if (windFac1.asKnown().isPresent) 1 else 0) +
            (if (windFac2.asKnown().isPresent) 1 else 0) +
            (if (windFacAvg.asKnown().isPresent) 1 else 0) +
            (if (wxValidEnd.asKnown().isPresent) 1 else 0) +
            (if (wxValidStart.asKnown().isPresent) 1 else 0)

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

    /** Collection of air refueling events occurring on this flight. */
    class AirRefuelEvent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val arDegrade: JsonField<Double>,
        private val arExchangedFuel: JsonField<Double>,
        private val arNum: JsonField<Int>,
        private val divertFuel: JsonField<Double>,
        private val exitFuel: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("arDegrade")
            @ExcludeMissing
            arDegrade: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("arExchangedFuel")
            @ExcludeMissing
            arExchangedFuel: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("arNum") @ExcludeMissing arNum: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("divertFuel")
            @ExcludeMissing
            divertFuel: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("exitFuel") @ExcludeMissing exitFuel: JsonField<Double> = JsonMissing.of(),
        ) : this(arDegrade, arExchangedFuel, arNum, divertFuel, exitFuel, mutableMapOf())

        /**
         * Additional degrade for air refueling, cumulative with fuelDegrade field percent.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun arDegrade(): Optional<Double> = arDegrade.getOptional("arDegrade")

        /**
         * Fuel onloaded (use positive numbers) or fuel offloaded (use negative numbers) in pounds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun arExchangedFuel(): Optional<Double> = arExchangedFuel.getOptional("arExchangedFuel")

        /**
         * The number of this air refueling event within the flight plan.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun arNum(): Optional<Int> = arNum.getOptional("arNum")

        /**
         * Fuel required to fly from air refueling exit point to air refueling divert alternate
         * airfield in pounds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun divertFuel(): Optional<Double> = divertFuel.getOptional("divertFuel")

        /**
         * Fuel remaining at the air refueling exit in pounds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun exitFuel(): Optional<Double> = exitFuel.getOptional("exitFuel")

        /**
         * Returns the raw JSON value of [arDegrade].
         *
         * Unlike [arDegrade], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arDegrade") @ExcludeMissing fun _arDegrade(): JsonField<Double> = arDegrade

        /**
         * Returns the raw JSON value of [arExchangedFuel].
         *
         * Unlike [arExchangedFuel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("arExchangedFuel")
        @ExcludeMissing
        fun _arExchangedFuel(): JsonField<Double> = arExchangedFuel

        /**
         * Returns the raw JSON value of [arNum].
         *
         * Unlike [arNum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arNum") @ExcludeMissing fun _arNum(): JsonField<Int> = arNum

        /**
         * Returns the raw JSON value of [divertFuel].
         *
         * Unlike [divertFuel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("divertFuel")
        @ExcludeMissing
        fun _divertFuel(): JsonField<Double> = divertFuel

        /**
         * Returns the raw JSON value of [exitFuel].
         *
         * Unlike [exitFuel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("exitFuel") @ExcludeMissing fun _exitFuel(): JsonField<Double> = exitFuel

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

            /** Returns a mutable builder for constructing an instance of [AirRefuelEvent]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AirRefuelEvent]. */
        class Builder internal constructor() {

            private var arDegrade: JsonField<Double> = JsonMissing.of()
            private var arExchangedFuel: JsonField<Double> = JsonMissing.of()
            private var arNum: JsonField<Int> = JsonMissing.of()
            private var divertFuel: JsonField<Double> = JsonMissing.of()
            private var exitFuel: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(airRefuelEvent: AirRefuelEvent) = apply {
                arDegrade = airRefuelEvent.arDegrade
                arExchangedFuel = airRefuelEvent.arExchangedFuel
                arNum = airRefuelEvent.arNum
                divertFuel = airRefuelEvent.divertFuel
                exitFuel = airRefuelEvent.exitFuel
                additionalProperties = airRefuelEvent.additionalProperties.toMutableMap()
            }

            /** Additional degrade for air refueling, cumulative with fuelDegrade field percent. */
            fun arDegrade(arDegrade: Double) = arDegrade(JsonField.of(arDegrade))

            /**
             * Sets [Builder.arDegrade] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arDegrade] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arDegrade(arDegrade: JsonField<Double>) = apply { this.arDegrade = arDegrade }

            /**
             * Fuel onloaded (use positive numbers) or fuel offloaded (use negative numbers) in
             * pounds.
             */
            fun arExchangedFuel(arExchangedFuel: Double) =
                arExchangedFuel(JsonField.of(arExchangedFuel))

            /**
             * Sets [Builder.arExchangedFuel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arExchangedFuel] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arExchangedFuel(arExchangedFuel: JsonField<Double>) = apply {
                this.arExchangedFuel = arExchangedFuel
            }

            /** The number of this air refueling event within the flight plan. */
            fun arNum(arNum: Int) = arNum(JsonField.of(arNum))

            /**
             * Sets [Builder.arNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arNum] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun arNum(arNum: JsonField<Int>) = apply { this.arNum = arNum }

            /**
             * Fuel required to fly from air refueling exit point to air refueling divert alternate
             * airfield in pounds.
             */
            fun divertFuel(divertFuel: Double) = divertFuel(JsonField.of(divertFuel))

            /**
             * Sets [Builder.divertFuel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.divertFuel] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun divertFuel(divertFuel: JsonField<Double>) = apply { this.divertFuel = divertFuel }

            /** Fuel remaining at the air refueling exit in pounds. */
            fun exitFuel(exitFuel: Double) = exitFuel(JsonField.of(exitFuel))

            /**
             * Sets [Builder.exitFuel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exitFuel] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exitFuel(exitFuel: JsonField<Double>) = apply { this.exitFuel = exitFuel }

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
             * Returns an immutable instance of [AirRefuelEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AirRefuelEvent =
                AirRefuelEvent(
                    arDegrade,
                    arExchangedFuel,
                    arNum,
                    divertFuel,
                    exitFuel,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AirRefuelEvent = apply {
            if (validated) {
                return@apply
            }

            arDegrade()
            arExchangedFuel()
            arNum()
            divertFuel()
            exitFuel()
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
            (if (arDegrade.asKnown().isPresent) 1 else 0) +
                (if (arExchangedFuel.asKnown().isPresent) 1 else 0) +
                (if (arNum.asKnown().isPresent) 1 else 0) +
                (if (divertFuel.asKnown().isPresent) 1 else 0) +
                (if (exitFuel.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AirRefuelEvent &&
                arDegrade == other.arDegrade &&
                arExchangedFuel == other.arExchangedFuel &&
                arNum == other.arNum &&
                divertFuel == other.divertFuel &&
                exitFuel == other.exitFuel &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                arDegrade,
                arExchangedFuel,
                arNum,
                divertFuel,
                exitFuel,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AirRefuelEvent{arDegrade=$arDegrade, arExchangedFuel=$arExchangedFuel, arNum=$arNum, divertFuel=$divertFuel, exitFuel=$exitFuel, additionalProperties=$additionalProperties}"
    }

    /**
     * Collection of messages associated with this flight plan indicating the severity, the point
     * where the message was generated, the path (Primary, Alternate, etc.), and the text of the
     * message.
     */
    class FlightPlanMessage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val msgText: JsonField<String>,
        private val routePath: JsonField<String>,
        private val severity: JsonField<String>,
        private val wpNum: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("msgText") @ExcludeMissing msgText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routePath")
            @ExcludeMissing
            routePath: JsonField<String> = JsonMissing.of(),
            @JsonProperty("severity")
            @ExcludeMissing
            severity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wpNum") @ExcludeMissing wpNum: JsonField<String> = JsonMissing.of(),
        ) : this(msgText, routePath, severity, wpNum, mutableMapOf())

        /**
         * The text of the message.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun msgText(): Optional<String> = msgText.getOptional("msgText")

        /**
         * The flight path that generated the message (PRIMARY, ALTERNATE, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun routePath(): Optional<String> = routePath.getOptional("routePath")

        /**
         * The severity of the message.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun severity(): Optional<String> = severity.getOptional("severity")

        /**
         * The waypoint number for which the message was generated, or enter "PLAN" for a message
         * impacting the entire route.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun wpNum(): Optional<String> = wpNum.getOptional("wpNum")

        /**
         * Returns the raw JSON value of [msgText].
         *
         * Unlike [msgText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("msgText") @ExcludeMissing fun _msgText(): JsonField<String> = msgText

        /**
         * Returns the raw JSON value of [routePath].
         *
         * Unlike [routePath], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("routePath") @ExcludeMissing fun _routePath(): JsonField<String> = routePath

        /**
         * Returns the raw JSON value of [severity].
         *
         * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<String> = severity

        /**
         * Returns the raw JSON value of [wpNum].
         *
         * Unlike [wpNum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wpNum") @ExcludeMissing fun _wpNum(): JsonField<String> = wpNum

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

            /** Returns a mutable builder for constructing an instance of [FlightPlanMessage]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FlightPlanMessage]. */
        class Builder internal constructor() {

            private var msgText: JsonField<String> = JsonMissing.of()
            private var routePath: JsonField<String> = JsonMissing.of()
            private var severity: JsonField<String> = JsonMissing.of()
            private var wpNum: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(flightPlanMessage: FlightPlanMessage) = apply {
                msgText = flightPlanMessage.msgText
                routePath = flightPlanMessage.routePath
                severity = flightPlanMessage.severity
                wpNum = flightPlanMessage.wpNum
                additionalProperties = flightPlanMessage.additionalProperties.toMutableMap()
            }

            /** The text of the message. */
            fun msgText(msgText: String) = msgText(JsonField.of(msgText))

            /**
             * Sets [Builder.msgText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.msgText] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun msgText(msgText: JsonField<String>) = apply { this.msgText = msgText }

            /** The flight path that generated the message (PRIMARY, ALTERNATE, etc.). */
            fun routePath(routePath: String) = routePath(JsonField.of(routePath))

            /**
             * Sets [Builder.routePath] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routePath] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routePath(routePath: JsonField<String>) = apply { this.routePath = routePath }

            /** The severity of the message. */
            fun severity(severity: String) = severity(JsonField.of(severity))

            /**
             * Sets [Builder.severity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.severity] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun severity(severity: JsonField<String>) = apply { this.severity = severity }

            /**
             * The waypoint number for which the message was generated, or enter "PLAN" for a
             * message impacting the entire route.
             */
            fun wpNum(wpNum: String) = wpNum(JsonField.of(wpNum))

            /**
             * Sets [Builder.wpNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wpNum] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wpNum(wpNum: JsonField<String>) = apply { this.wpNum = wpNum }

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
             * Returns an immutable instance of [FlightPlanMessage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FlightPlanMessage =
                FlightPlanMessage(
                    msgText,
                    routePath,
                    severity,
                    wpNum,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FlightPlanMessage = apply {
            if (validated) {
                return@apply
            }

            msgText()
            routePath()
            severity()
            wpNum()
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
            (if (msgText.asKnown().isPresent) 1 else 0) +
                (if (routePath.asKnown().isPresent) 1 else 0) +
                (if (severity.asKnown().isPresent) 1 else 0) +
                (if (wpNum.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FlightPlanMessage &&
                msgText == other.msgText &&
                routePath == other.routePath &&
                severity == other.severity &&
                wpNum == other.wpNum &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(msgText, routePath, severity, wpNum, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FlightPlanMessage{msgText=$msgText, routePath=$routePath, severity=$severity, wpNum=$wpNum, additionalProperties=$additionalProperties}"
    }

    /**
     * Collection of point groups generated for this flight plan. Groups include point sets for
     * Extended Operations (ETOPS), Critical Fuel Point, and Equal Time Point (ETP).
     */
    class FlightPlanPointGroup
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val avgFuelFlow: JsonField<Double>,
        private val etopsAvgWindFactor: JsonField<Double>,
        private val etopsDistance: JsonField<Double>,
        private val etopsReqFuel: JsonField<Double>,
        private val etopsTempDev: JsonField<Double>,
        private val etopsTime: JsonField<String>,
        private val flightPlanPoints: JsonField<List<FlightPlanPoint>>,
        private val fromTakeoffTime: JsonField<String>,
        private val fsafAvgWindFactor: JsonField<Double>,
        private val fsafDistance: JsonField<Double>,
        private val fsafReqFuel: JsonField<Double>,
        private val fsafTempDev: JsonField<Double>,
        private val fsafTime: JsonField<String>,
        private val fuelCalcAlt: JsonField<Double>,
        private val fuelCalcSpd: JsonField<Double>,
        private val lsafAvgWindFactor: JsonField<Double>,
        private val lsafDistance: JsonField<Double>,
        private val lsafName: JsonField<String>,
        private val lsafReqFuel: JsonField<Double>,
        private val lsafTempDev: JsonField<Double>,
        private val lsafTime: JsonField<String>,
        private val plannedFuel: JsonField<Double>,
        private val pointGroupName: JsonField<String>,
        private val worstFuelCase: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("avgFuelFlow")
            @ExcludeMissing
            avgFuelFlow: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("etopsAvgWindFactor")
            @ExcludeMissing
            etopsAvgWindFactor: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("etopsDistance")
            @ExcludeMissing
            etopsDistance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("etopsReqFuel")
            @ExcludeMissing
            etopsReqFuel: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("etopsTempDev")
            @ExcludeMissing
            etopsTempDev: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("etopsTime")
            @ExcludeMissing
            etopsTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("flightPlanPoints")
            @ExcludeMissing
            flightPlanPoints: JsonField<List<FlightPlanPoint>> = JsonMissing.of(),
            @JsonProperty("fromTakeoffTime")
            @ExcludeMissing
            fromTakeoffTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fsafAvgWindFactor")
            @ExcludeMissing
            fsafAvgWindFactor: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("fsafDistance")
            @ExcludeMissing
            fsafDistance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("fsafReqFuel")
            @ExcludeMissing
            fsafReqFuel: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("fsafTempDev")
            @ExcludeMissing
            fsafTempDev: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("fsafTime")
            @ExcludeMissing
            fsafTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fuelCalcAlt")
            @ExcludeMissing
            fuelCalcAlt: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("fuelCalcSpd")
            @ExcludeMissing
            fuelCalcSpd: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lsafAvgWindFactor")
            @ExcludeMissing
            lsafAvgWindFactor: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lsafDistance")
            @ExcludeMissing
            lsafDistance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lsafName")
            @ExcludeMissing
            lsafName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lsafReqFuel")
            @ExcludeMissing
            lsafReqFuel: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lsafTempDev")
            @ExcludeMissing
            lsafTempDev: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lsafTime")
            @ExcludeMissing
            lsafTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plannedFuel")
            @ExcludeMissing
            plannedFuel: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("pointGroupName")
            @ExcludeMissing
            pointGroupName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("worstFuelCase")
            @ExcludeMissing
            worstFuelCase: JsonField<String> = JsonMissing.of(),
        ) : this(
            avgFuelFlow,
            etopsAvgWindFactor,
            etopsDistance,
            etopsReqFuel,
            etopsTempDev,
            etopsTime,
            flightPlanPoints,
            fromTakeoffTime,
            fsafAvgWindFactor,
            fsafDistance,
            fsafReqFuel,
            fsafTempDev,
            fsafTime,
            fuelCalcAlt,
            fuelCalcSpd,
            lsafAvgWindFactor,
            lsafDistance,
            lsafName,
            lsafReqFuel,
            lsafTempDev,
            lsafTime,
            plannedFuel,
            pointGroupName,
            worstFuelCase,
            mutableMapOf(),
        )

        /**
         * Average fuel flow at which the fuel was calculated in pounds per hour.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun avgFuelFlow(): Optional<Double> = avgFuelFlow.getOptional("avgFuelFlow")

        /**
         * Average wind factor from the Extended Operations (ETOPS) point to the recovery airfield
         * in knots.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun etopsAvgWindFactor(): Optional<Double> =
            etopsAvgWindFactor.getOptional("etopsAvgWindFactor")

        /**
         * Distance from the Extended Operations (ETOPS) point to the recovery airfield in nautical
         * miles.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun etopsDistance(): Optional<Double> = etopsDistance.getOptional("etopsDistance")

        /**
         * Fuel required to fly from the Extended Operations (ETOPS) point to the recovery airfield
         * in pounds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun etopsReqFuel(): Optional<Double> = etopsReqFuel.getOptional("etopsReqFuel")

        /**
         * Temperature deviation from the Extended Operations (ETOPS) point to the recovery airfield
         * in degrees Celsius.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun etopsTempDev(): Optional<Double> = etopsTempDev.getOptional("etopsTempDev")

        /**
         * Time to fly from the Extended Operations (ETOPS) point to the recovery airfield expressed
         * in HH:MM format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun etopsTime(): Optional<String> = etopsTime.getOptional("etopsTime")

        /**
         * Array of point data for this Point Group.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun flightPlanPoints(): Optional<List<FlightPlanPoint>> =
            flightPlanPoints.getOptional("flightPlanPoints")

        /**
         * Total time from takeoff when the point is reached expressed in HH:MM format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fromTakeoffTime(): Optional<String> = fromTakeoffTime.getOptional("fromTakeoffTime")

        /**
         * Average wind factor from the Equal Time Point (ETP) to the first suitable airfield in
         * knots.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fsafAvgWindFactor(): Optional<Double> =
            fsafAvgWindFactor.getOptional("fsafAvgWindFactor")

        /**
         * Distance from the Equal Time Point (ETP) to the first suitable airfield in nautical
         * miles.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fsafDistance(): Optional<Double> = fsafDistance.getOptional("fsafDistance")

        /**
         * Fuel required to fly from the Equal Time Point (ETP) to the first suitable airfield in
         * pounds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fsafReqFuel(): Optional<Double> = fsafReqFuel.getOptional("fsafReqFuel")

        /**
         * Temperature deviation from the Equal Time Point (ETP) to the first suitable airfield in
         * degrees Celsius.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fsafTempDev(): Optional<Double> = fsafTempDev.getOptional("fsafTempDev")

        /**
         * Time to fly from the Equal Time Point (ETP) to the first suitable airfield expressed in
         * HH:MM format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fsafTime(): Optional<String> = fsafTime.getOptional("fsafTime")

        /**
         * Flight level of the point at which the fuel was calculated in feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fuelCalcAlt(): Optional<Double> = fuelCalcAlt.getOptional("fuelCalcAlt")

        /**
         * True airspeed at which the fuel was calculated in knots.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fuelCalcSpd(): Optional<Double> = fuelCalcSpd.getOptional("fuelCalcSpd")

        /**
         * Average wind factor from the Equal Time Point (ETP) to the last suitable airfield in
         * knots.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lsafAvgWindFactor(): Optional<Double> =
            lsafAvgWindFactor.getOptional("lsafAvgWindFactor")

        /**
         * Distance from the Equal Time Point (ETP) to the last suitable airfield in nautical miles.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lsafDistance(): Optional<Double> = lsafDistance.getOptional("lsafDistance")

        /**
         * Name of the last suitable airfield, International Civil Aviation Organization (ICAO) code
         * preferred.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lsafName(): Optional<String> = lsafName.getOptional("lsafName")

        /**
         * Fuel required to fly from the Equal Time Point (ETP) to the last suitable airfield in
         * pounds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lsafReqFuel(): Optional<Double> = lsafReqFuel.getOptional("lsafReqFuel")

        /**
         * Temperature deviation from the Equal Time Point (ETP) to the last suitable airfield in
         * degrees Celsius.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lsafTempDev(): Optional<Double> = lsafTempDev.getOptional("lsafTempDev")

        /**
         * Time to fly from the Equal Time Point (ETP) to the last suitable airfield expressed in
         * HH:MM format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lsafTime(): Optional<String> = lsafTime.getOptional("lsafTime")

        /**
         * Amount of planned fuel on board when the point is reached in pounds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun plannedFuel(): Optional<Double> = plannedFuel.getOptional("plannedFuel")

        /**
         * Name of the point group, usually Extended Operations (ETOPS), Critical Fuel Point, and
         * Equal Time Point (ETP) sections.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pointGroupName(): Optional<String> = pointGroupName.getOptional("pointGroupName")

        /**
         * Specifies which Point Group case requires the most fuel.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun worstFuelCase(): Optional<String> = worstFuelCase.getOptional("worstFuelCase")

        /**
         * Returns the raw JSON value of [avgFuelFlow].
         *
         * Unlike [avgFuelFlow], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("avgFuelFlow")
        @ExcludeMissing
        fun _avgFuelFlow(): JsonField<Double> = avgFuelFlow

        /**
         * Returns the raw JSON value of [etopsAvgWindFactor].
         *
         * Unlike [etopsAvgWindFactor], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("etopsAvgWindFactor")
        @ExcludeMissing
        fun _etopsAvgWindFactor(): JsonField<Double> = etopsAvgWindFactor

        /**
         * Returns the raw JSON value of [etopsDistance].
         *
         * Unlike [etopsDistance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("etopsDistance")
        @ExcludeMissing
        fun _etopsDistance(): JsonField<Double> = etopsDistance

        /**
         * Returns the raw JSON value of [etopsReqFuel].
         *
         * Unlike [etopsReqFuel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("etopsReqFuel")
        @ExcludeMissing
        fun _etopsReqFuel(): JsonField<Double> = etopsReqFuel

        /**
         * Returns the raw JSON value of [etopsTempDev].
         *
         * Unlike [etopsTempDev], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("etopsTempDev")
        @ExcludeMissing
        fun _etopsTempDev(): JsonField<Double> = etopsTempDev

        /**
         * Returns the raw JSON value of [etopsTime].
         *
         * Unlike [etopsTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("etopsTime") @ExcludeMissing fun _etopsTime(): JsonField<String> = etopsTime

        /**
         * Returns the raw JSON value of [flightPlanPoints].
         *
         * Unlike [flightPlanPoints], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("flightPlanPoints")
        @ExcludeMissing
        fun _flightPlanPoints(): JsonField<List<FlightPlanPoint>> = flightPlanPoints

        /**
         * Returns the raw JSON value of [fromTakeoffTime].
         *
         * Unlike [fromTakeoffTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fromTakeoffTime")
        @ExcludeMissing
        fun _fromTakeoffTime(): JsonField<String> = fromTakeoffTime

        /**
         * Returns the raw JSON value of [fsafAvgWindFactor].
         *
         * Unlike [fsafAvgWindFactor], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fsafAvgWindFactor")
        @ExcludeMissing
        fun _fsafAvgWindFactor(): JsonField<Double> = fsafAvgWindFactor

        /**
         * Returns the raw JSON value of [fsafDistance].
         *
         * Unlike [fsafDistance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fsafDistance")
        @ExcludeMissing
        fun _fsafDistance(): JsonField<Double> = fsafDistance

        /**
         * Returns the raw JSON value of [fsafReqFuel].
         *
         * Unlike [fsafReqFuel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fsafReqFuel")
        @ExcludeMissing
        fun _fsafReqFuel(): JsonField<Double> = fsafReqFuel

        /**
         * Returns the raw JSON value of [fsafTempDev].
         *
         * Unlike [fsafTempDev], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fsafTempDev")
        @ExcludeMissing
        fun _fsafTempDev(): JsonField<Double> = fsafTempDev

        /**
         * Returns the raw JSON value of [fsafTime].
         *
         * Unlike [fsafTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fsafTime") @ExcludeMissing fun _fsafTime(): JsonField<String> = fsafTime

        /**
         * Returns the raw JSON value of [fuelCalcAlt].
         *
         * Unlike [fuelCalcAlt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fuelCalcAlt")
        @ExcludeMissing
        fun _fuelCalcAlt(): JsonField<Double> = fuelCalcAlt

        /**
         * Returns the raw JSON value of [fuelCalcSpd].
         *
         * Unlike [fuelCalcSpd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fuelCalcSpd")
        @ExcludeMissing
        fun _fuelCalcSpd(): JsonField<Double> = fuelCalcSpd

        /**
         * Returns the raw JSON value of [lsafAvgWindFactor].
         *
         * Unlike [lsafAvgWindFactor], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lsafAvgWindFactor")
        @ExcludeMissing
        fun _lsafAvgWindFactor(): JsonField<Double> = lsafAvgWindFactor

        /**
         * Returns the raw JSON value of [lsafDistance].
         *
         * Unlike [lsafDistance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lsafDistance")
        @ExcludeMissing
        fun _lsafDistance(): JsonField<Double> = lsafDistance

        /**
         * Returns the raw JSON value of [lsafName].
         *
         * Unlike [lsafName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lsafName") @ExcludeMissing fun _lsafName(): JsonField<String> = lsafName

        /**
         * Returns the raw JSON value of [lsafReqFuel].
         *
         * Unlike [lsafReqFuel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lsafReqFuel")
        @ExcludeMissing
        fun _lsafReqFuel(): JsonField<Double> = lsafReqFuel

        /**
         * Returns the raw JSON value of [lsafTempDev].
         *
         * Unlike [lsafTempDev], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lsafTempDev")
        @ExcludeMissing
        fun _lsafTempDev(): JsonField<Double> = lsafTempDev

        /**
         * Returns the raw JSON value of [lsafTime].
         *
         * Unlike [lsafTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lsafTime") @ExcludeMissing fun _lsafTime(): JsonField<String> = lsafTime

        /**
         * Returns the raw JSON value of [plannedFuel].
         *
         * Unlike [plannedFuel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("plannedFuel")
        @ExcludeMissing
        fun _plannedFuel(): JsonField<Double> = plannedFuel

        /**
         * Returns the raw JSON value of [pointGroupName].
         *
         * Unlike [pointGroupName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pointGroupName")
        @ExcludeMissing
        fun _pointGroupName(): JsonField<String> = pointGroupName

        /**
         * Returns the raw JSON value of [worstFuelCase].
         *
         * Unlike [worstFuelCase], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("worstFuelCase")
        @ExcludeMissing
        fun _worstFuelCase(): JsonField<String> = worstFuelCase

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

            /** Returns a mutable builder for constructing an instance of [FlightPlanPointGroup]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FlightPlanPointGroup]. */
        class Builder internal constructor() {

            private var avgFuelFlow: JsonField<Double> = JsonMissing.of()
            private var etopsAvgWindFactor: JsonField<Double> = JsonMissing.of()
            private var etopsDistance: JsonField<Double> = JsonMissing.of()
            private var etopsReqFuel: JsonField<Double> = JsonMissing.of()
            private var etopsTempDev: JsonField<Double> = JsonMissing.of()
            private var etopsTime: JsonField<String> = JsonMissing.of()
            private var flightPlanPoints: JsonField<MutableList<FlightPlanPoint>>? = null
            private var fromTakeoffTime: JsonField<String> = JsonMissing.of()
            private var fsafAvgWindFactor: JsonField<Double> = JsonMissing.of()
            private var fsafDistance: JsonField<Double> = JsonMissing.of()
            private var fsafReqFuel: JsonField<Double> = JsonMissing.of()
            private var fsafTempDev: JsonField<Double> = JsonMissing.of()
            private var fsafTime: JsonField<String> = JsonMissing.of()
            private var fuelCalcAlt: JsonField<Double> = JsonMissing.of()
            private var fuelCalcSpd: JsonField<Double> = JsonMissing.of()
            private var lsafAvgWindFactor: JsonField<Double> = JsonMissing.of()
            private var lsafDistance: JsonField<Double> = JsonMissing.of()
            private var lsafName: JsonField<String> = JsonMissing.of()
            private var lsafReqFuel: JsonField<Double> = JsonMissing.of()
            private var lsafTempDev: JsonField<Double> = JsonMissing.of()
            private var lsafTime: JsonField<String> = JsonMissing.of()
            private var plannedFuel: JsonField<Double> = JsonMissing.of()
            private var pointGroupName: JsonField<String> = JsonMissing.of()
            private var worstFuelCase: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(flightPlanPointGroup: FlightPlanPointGroup) = apply {
                avgFuelFlow = flightPlanPointGroup.avgFuelFlow
                etopsAvgWindFactor = flightPlanPointGroup.etopsAvgWindFactor
                etopsDistance = flightPlanPointGroup.etopsDistance
                etopsReqFuel = flightPlanPointGroup.etopsReqFuel
                etopsTempDev = flightPlanPointGroup.etopsTempDev
                etopsTime = flightPlanPointGroup.etopsTime
                flightPlanPoints = flightPlanPointGroup.flightPlanPoints.map { it.toMutableList() }
                fromTakeoffTime = flightPlanPointGroup.fromTakeoffTime
                fsafAvgWindFactor = flightPlanPointGroup.fsafAvgWindFactor
                fsafDistance = flightPlanPointGroup.fsafDistance
                fsafReqFuel = flightPlanPointGroup.fsafReqFuel
                fsafTempDev = flightPlanPointGroup.fsafTempDev
                fsafTime = flightPlanPointGroup.fsafTime
                fuelCalcAlt = flightPlanPointGroup.fuelCalcAlt
                fuelCalcSpd = flightPlanPointGroup.fuelCalcSpd
                lsafAvgWindFactor = flightPlanPointGroup.lsafAvgWindFactor
                lsafDistance = flightPlanPointGroup.lsafDistance
                lsafName = flightPlanPointGroup.lsafName
                lsafReqFuel = flightPlanPointGroup.lsafReqFuel
                lsafTempDev = flightPlanPointGroup.lsafTempDev
                lsafTime = flightPlanPointGroup.lsafTime
                plannedFuel = flightPlanPointGroup.plannedFuel
                pointGroupName = flightPlanPointGroup.pointGroupName
                worstFuelCase = flightPlanPointGroup.worstFuelCase
                additionalProperties = flightPlanPointGroup.additionalProperties.toMutableMap()
            }

            /** Average fuel flow at which the fuel was calculated in pounds per hour. */
            fun avgFuelFlow(avgFuelFlow: Double) = avgFuelFlow(JsonField.of(avgFuelFlow))

            /**
             * Sets [Builder.avgFuelFlow] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avgFuelFlow] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avgFuelFlow(avgFuelFlow: JsonField<Double>) = apply {
                this.avgFuelFlow = avgFuelFlow
            }

            /**
             * Average wind factor from the Extended Operations (ETOPS) point to the recovery
             * airfield in knots.
             */
            fun etopsAvgWindFactor(etopsAvgWindFactor: Double) =
                etopsAvgWindFactor(JsonField.of(etopsAvgWindFactor))

            /**
             * Sets [Builder.etopsAvgWindFactor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.etopsAvgWindFactor] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun etopsAvgWindFactor(etopsAvgWindFactor: JsonField<Double>) = apply {
                this.etopsAvgWindFactor = etopsAvgWindFactor
            }

            /**
             * Distance from the Extended Operations (ETOPS) point to the recovery airfield in
             * nautical miles.
             */
            fun etopsDistance(etopsDistance: Double) = etopsDistance(JsonField.of(etopsDistance))

            /**
             * Sets [Builder.etopsDistance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.etopsDistance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun etopsDistance(etopsDistance: JsonField<Double>) = apply {
                this.etopsDistance = etopsDistance
            }

            /**
             * Fuel required to fly from the Extended Operations (ETOPS) point to the recovery
             * airfield in pounds.
             */
            fun etopsReqFuel(etopsReqFuel: Double) = etopsReqFuel(JsonField.of(etopsReqFuel))

            /**
             * Sets [Builder.etopsReqFuel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.etopsReqFuel] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun etopsReqFuel(etopsReqFuel: JsonField<Double>) = apply {
                this.etopsReqFuel = etopsReqFuel
            }

            /**
             * Temperature deviation from the Extended Operations (ETOPS) point to the recovery
             * airfield in degrees Celsius.
             */
            fun etopsTempDev(etopsTempDev: Double) = etopsTempDev(JsonField.of(etopsTempDev))

            /**
             * Sets [Builder.etopsTempDev] to an arbitrary JSON value.
             *
             * You should usually call [Builder.etopsTempDev] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun etopsTempDev(etopsTempDev: JsonField<Double>) = apply {
                this.etopsTempDev = etopsTempDev
            }

            /**
             * Time to fly from the Extended Operations (ETOPS) point to the recovery airfield
             * expressed in HH:MM format.
             */
            fun etopsTime(etopsTime: String) = etopsTime(JsonField.of(etopsTime))

            /**
             * Sets [Builder.etopsTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.etopsTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun etopsTime(etopsTime: JsonField<String>) = apply { this.etopsTime = etopsTime }

            /** Array of point data for this Point Group. */
            fun flightPlanPoints(flightPlanPoints: List<FlightPlanPoint>) =
                flightPlanPoints(JsonField.of(flightPlanPoints))

            /**
             * Sets [Builder.flightPlanPoints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.flightPlanPoints] with a well-typed
             * `List<FlightPlanPoint>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun flightPlanPoints(flightPlanPoints: JsonField<List<FlightPlanPoint>>) = apply {
                this.flightPlanPoints = flightPlanPoints.map { it.toMutableList() }
            }

            /**
             * Adds a single [FlightPlanPoint] to [flightPlanPoints].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFlightPlanPoint(flightPlanPoint: FlightPlanPoint) = apply {
                flightPlanPoints =
                    (flightPlanPoints ?: JsonField.of(mutableListOf())).also {
                        checkKnown("flightPlanPoints", it).add(flightPlanPoint)
                    }
            }

            /** Total time from takeoff when the point is reached expressed in HH:MM format. */
            fun fromTakeoffTime(fromTakeoffTime: String) =
                fromTakeoffTime(JsonField.of(fromTakeoffTime))

            /**
             * Sets [Builder.fromTakeoffTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromTakeoffTime] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromTakeoffTime(fromTakeoffTime: JsonField<String>) = apply {
                this.fromTakeoffTime = fromTakeoffTime
            }

            /**
             * Average wind factor from the Equal Time Point (ETP) to the first suitable airfield in
             * knots.
             */
            fun fsafAvgWindFactor(fsafAvgWindFactor: Double) =
                fsafAvgWindFactor(JsonField.of(fsafAvgWindFactor))

            /**
             * Sets [Builder.fsafAvgWindFactor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fsafAvgWindFactor] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fsafAvgWindFactor(fsafAvgWindFactor: JsonField<Double>) = apply {
                this.fsafAvgWindFactor = fsafAvgWindFactor
            }

            /**
             * Distance from the Equal Time Point (ETP) to the first suitable airfield in nautical
             * miles.
             */
            fun fsafDistance(fsafDistance: Double) = fsafDistance(JsonField.of(fsafDistance))

            /**
             * Sets [Builder.fsafDistance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fsafDistance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fsafDistance(fsafDistance: JsonField<Double>) = apply {
                this.fsafDistance = fsafDistance
            }

            /**
             * Fuel required to fly from the Equal Time Point (ETP) to the first suitable airfield
             * in pounds.
             */
            fun fsafReqFuel(fsafReqFuel: Double) = fsafReqFuel(JsonField.of(fsafReqFuel))

            /**
             * Sets [Builder.fsafReqFuel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fsafReqFuel] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fsafReqFuel(fsafReqFuel: JsonField<Double>) = apply {
                this.fsafReqFuel = fsafReqFuel
            }

            /**
             * Temperature deviation from the Equal Time Point (ETP) to the first suitable airfield
             * in degrees Celsius.
             */
            fun fsafTempDev(fsafTempDev: Double) = fsafTempDev(JsonField.of(fsafTempDev))

            /**
             * Sets [Builder.fsafTempDev] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fsafTempDev] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fsafTempDev(fsafTempDev: JsonField<Double>) = apply {
                this.fsafTempDev = fsafTempDev
            }

            /**
             * Time to fly from the Equal Time Point (ETP) to the first suitable airfield expressed
             * in HH:MM format.
             */
            fun fsafTime(fsafTime: String) = fsafTime(JsonField.of(fsafTime))

            /**
             * Sets [Builder.fsafTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fsafTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fsafTime(fsafTime: JsonField<String>) = apply { this.fsafTime = fsafTime }

            /** Flight level of the point at which the fuel was calculated in feet. */
            fun fuelCalcAlt(fuelCalcAlt: Double) = fuelCalcAlt(JsonField.of(fuelCalcAlt))

            /**
             * Sets [Builder.fuelCalcAlt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fuelCalcAlt] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fuelCalcAlt(fuelCalcAlt: JsonField<Double>) = apply {
                this.fuelCalcAlt = fuelCalcAlt
            }

            /** True airspeed at which the fuel was calculated in knots. */
            fun fuelCalcSpd(fuelCalcSpd: Double) = fuelCalcSpd(JsonField.of(fuelCalcSpd))

            /**
             * Sets [Builder.fuelCalcSpd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fuelCalcSpd] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fuelCalcSpd(fuelCalcSpd: JsonField<Double>) = apply {
                this.fuelCalcSpd = fuelCalcSpd
            }

            /**
             * Average wind factor from the Equal Time Point (ETP) to the last suitable airfield in
             * knots.
             */
            fun lsafAvgWindFactor(lsafAvgWindFactor: Double) =
                lsafAvgWindFactor(JsonField.of(lsafAvgWindFactor))

            /**
             * Sets [Builder.lsafAvgWindFactor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lsafAvgWindFactor] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lsafAvgWindFactor(lsafAvgWindFactor: JsonField<Double>) = apply {
                this.lsafAvgWindFactor = lsafAvgWindFactor
            }

            /**
             * Distance from the Equal Time Point (ETP) to the last suitable airfield in nautical
             * miles.
             */
            fun lsafDistance(lsafDistance: Double) = lsafDistance(JsonField.of(lsafDistance))

            /**
             * Sets [Builder.lsafDistance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lsafDistance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lsafDistance(lsafDistance: JsonField<Double>) = apply {
                this.lsafDistance = lsafDistance
            }

            /**
             * Name of the last suitable airfield, International Civil Aviation Organization (ICAO)
             * code preferred.
             */
            fun lsafName(lsafName: String) = lsafName(JsonField.of(lsafName))

            /**
             * Sets [Builder.lsafName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lsafName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lsafName(lsafName: JsonField<String>) = apply { this.lsafName = lsafName }

            /**
             * Fuel required to fly from the Equal Time Point (ETP) to the last suitable airfield in
             * pounds.
             */
            fun lsafReqFuel(lsafReqFuel: Double) = lsafReqFuel(JsonField.of(lsafReqFuel))

            /**
             * Sets [Builder.lsafReqFuel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lsafReqFuel] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lsafReqFuel(lsafReqFuel: JsonField<Double>) = apply {
                this.lsafReqFuel = lsafReqFuel
            }

            /**
             * Temperature deviation from the Equal Time Point (ETP) to the last suitable airfield
             * in degrees Celsius.
             */
            fun lsafTempDev(lsafTempDev: Double) = lsafTempDev(JsonField.of(lsafTempDev))

            /**
             * Sets [Builder.lsafTempDev] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lsafTempDev] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lsafTempDev(lsafTempDev: JsonField<Double>) = apply {
                this.lsafTempDev = lsafTempDev
            }

            /**
             * Time to fly from the Equal Time Point (ETP) to the last suitable airfield expressed
             * in HH:MM format.
             */
            fun lsafTime(lsafTime: String) = lsafTime(JsonField.of(lsafTime))

            /**
             * Sets [Builder.lsafTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lsafTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lsafTime(lsafTime: JsonField<String>) = apply { this.lsafTime = lsafTime }

            /** Amount of planned fuel on board when the point is reached in pounds. */
            fun plannedFuel(plannedFuel: Double) = plannedFuel(JsonField.of(plannedFuel))

            /**
             * Sets [Builder.plannedFuel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.plannedFuel] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun plannedFuel(plannedFuel: JsonField<Double>) = apply {
                this.plannedFuel = plannedFuel
            }

            /**
             * Name of the point group, usually Extended Operations (ETOPS), Critical Fuel Point,
             * and Equal Time Point (ETP) sections.
             */
            fun pointGroupName(pointGroupName: String) =
                pointGroupName(JsonField.of(pointGroupName))

            /**
             * Sets [Builder.pointGroupName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointGroupName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pointGroupName(pointGroupName: JsonField<String>) = apply {
                this.pointGroupName = pointGroupName
            }

            /** Specifies which Point Group case requires the most fuel. */
            fun worstFuelCase(worstFuelCase: String) = worstFuelCase(JsonField.of(worstFuelCase))

            /**
             * Sets [Builder.worstFuelCase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.worstFuelCase] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun worstFuelCase(worstFuelCase: JsonField<String>) = apply {
                this.worstFuelCase = worstFuelCase
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
             * Returns an immutable instance of [FlightPlanPointGroup].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FlightPlanPointGroup =
                FlightPlanPointGroup(
                    avgFuelFlow,
                    etopsAvgWindFactor,
                    etopsDistance,
                    etopsReqFuel,
                    etopsTempDev,
                    etopsTime,
                    (flightPlanPoints ?: JsonMissing.of()).map { it.toImmutable() },
                    fromTakeoffTime,
                    fsafAvgWindFactor,
                    fsafDistance,
                    fsafReqFuel,
                    fsafTempDev,
                    fsafTime,
                    fuelCalcAlt,
                    fuelCalcSpd,
                    lsafAvgWindFactor,
                    lsafDistance,
                    lsafName,
                    lsafReqFuel,
                    lsafTempDev,
                    lsafTime,
                    plannedFuel,
                    pointGroupName,
                    worstFuelCase,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FlightPlanPointGroup = apply {
            if (validated) {
                return@apply
            }

            avgFuelFlow()
            etopsAvgWindFactor()
            etopsDistance()
            etopsReqFuel()
            etopsTempDev()
            etopsTime()
            flightPlanPoints().ifPresent { it.forEach { it.validate() } }
            fromTakeoffTime()
            fsafAvgWindFactor()
            fsafDistance()
            fsafReqFuel()
            fsafTempDev()
            fsafTime()
            fuelCalcAlt()
            fuelCalcSpd()
            lsafAvgWindFactor()
            lsafDistance()
            lsafName()
            lsafReqFuel()
            lsafTempDev()
            lsafTime()
            plannedFuel()
            pointGroupName()
            worstFuelCase()
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
            (if (avgFuelFlow.asKnown().isPresent) 1 else 0) +
                (if (etopsAvgWindFactor.asKnown().isPresent) 1 else 0) +
                (if (etopsDistance.asKnown().isPresent) 1 else 0) +
                (if (etopsReqFuel.asKnown().isPresent) 1 else 0) +
                (if (etopsTempDev.asKnown().isPresent) 1 else 0) +
                (if (etopsTime.asKnown().isPresent) 1 else 0) +
                (flightPlanPoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (fromTakeoffTime.asKnown().isPresent) 1 else 0) +
                (if (fsafAvgWindFactor.asKnown().isPresent) 1 else 0) +
                (if (fsafDistance.asKnown().isPresent) 1 else 0) +
                (if (fsafReqFuel.asKnown().isPresent) 1 else 0) +
                (if (fsafTempDev.asKnown().isPresent) 1 else 0) +
                (if (fsafTime.asKnown().isPresent) 1 else 0) +
                (if (fuelCalcAlt.asKnown().isPresent) 1 else 0) +
                (if (fuelCalcSpd.asKnown().isPresent) 1 else 0) +
                (if (lsafAvgWindFactor.asKnown().isPresent) 1 else 0) +
                (if (lsafDistance.asKnown().isPresent) 1 else 0) +
                (if (lsafName.asKnown().isPresent) 1 else 0) +
                (if (lsafReqFuel.asKnown().isPresent) 1 else 0) +
                (if (lsafTempDev.asKnown().isPresent) 1 else 0) +
                (if (lsafTime.asKnown().isPresent) 1 else 0) +
                (if (plannedFuel.asKnown().isPresent) 1 else 0) +
                (if (pointGroupName.asKnown().isPresent) 1 else 0) +
                (if (worstFuelCase.asKnown().isPresent) 1 else 0)

        /** Array of point data for this Point Group. */
        class FlightPlanPoint
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val fppEta: JsonField<OffsetDateTime>,
            private val fppLat: JsonField<Double>,
            private val fppLon: JsonField<Double>,
            private val fppReqFuel: JsonField<Double>,
            private val pointName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("fppEta")
                @ExcludeMissing
                fppEta: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("fppLat")
                @ExcludeMissing
                fppLat: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("fppLon")
                @ExcludeMissing
                fppLon: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("fppReqFuel")
                @ExcludeMissing
                fppReqFuel: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("pointName")
                @ExcludeMissing
                pointName: JsonField<String> = JsonMissing.of(),
            ) : this(fppEta, fppLat, fppLon, fppReqFuel, pointName, mutableMapOf())

            /**
             * Estimated Time of Arrival (ETA) at this point in ISO 8601 UTC format, with
             * millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fppEta(): Optional<OffsetDateTime> = fppEta.getOptional("fppEta")

            /**
             * WGS84 latitude of the point location, in degrees. -90 to 90 degrees (negative values
             * south of equator).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fppLat(): Optional<Double> = fppLat.getOptional("fppLat")

            /**
             * WGS84 longitude of the point location, in degrees. -180 to 180 degrees (negative
             * values west of Prime Meridian).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fppLon(): Optional<Double> = fppLon.getOptional("fppLon")

            /**
             * Fuel required at this point to execute an Equal Time Point (ETP) or Extended
             * Operations (ETOPS) plan in pounds.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fppReqFuel(): Optional<Double> = fppReqFuel.getOptional("fppReqFuel")

            /**
             * Name of this point.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pointName(): Optional<String> = pointName.getOptional("pointName")

            /**
             * Returns the raw JSON value of [fppEta].
             *
             * Unlike [fppEta], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("fppEta")
            @ExcludeMissing
            fun _fppEta(): JsonField<OffsetDateTime> = fppEta

            /**
             * Returns the raw JSON value of [fppLat].
             *
             * Unlike [fppLat], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("fppLat") @ExcludeMissing fun _fppLat(): JsonField<Double> = fppLat

            /**
             * Returns the raw JSON value of [fppLon].
             *
             * Unlike [fppLon], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("fppLon") @ExcludeMissing fun _fppLon(): JsonField<Double> = fppLon

            /**
             * Returns the raw JSON value of [fppReqFuel].
             *
             * Unlike [fppReqFuel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fppReqFuel")
            @ExcludeMissing
            fun _fppReqFuel(): JsonField<Double> = fppReqFuel

            /**
             * Returns the raw JSON value of [pointName].
             *
             * Unlike [pointName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pointName")
            @ExcludeMissing
            fun _pointName(): JsonField<String> = pointName

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

                /** Returns a mutable builder for constructing an instance of [FlightPlanPoint]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FlightPlanPoint]. */
            class Builder internal constructor() {

                private var fppEta: JsonField<OffsetDateTime> = JsonMissing.of()
                private var fppLat: JsonField<Double> = JsonMissing.of()
                private var fppLon: JsonField<Double> = JsonMissing.of()
                private var fppReqFuel: JsonField<Double> = JsonMissing.of()
                private var pointName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(flightPlanPoint: FlightPlanPoint) = apply {
                    fppEta = flightPlanPoint.fppEta
                    fppLat = flightPlanPoint.fppLat
                    fppLon = flightPlanPoint.fppLon
                    fppReqFuel = flightPlanPoint.fppReqFuel
                    pointName = flightPlanPoint.pointName
                    additionalProperties = flightPlanPoint.additionalProperties.toMutableMap()
                }

                /**
                 * Estimated Time of Arrival (ETA) at this point in ISO 8601 UTC format, with
                 * millisecond precision.
                 */
                fun fppEta(fppEta: OffsetDateTime) = fppEta(JsonField.of(fppEta))

                /**
                 * Sets [Builder.fppEta] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fppEta] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fppEta(fppEta: JsonField<OffsetDateTime>) = apply { this.fppEta = fppEta }

                /**
                 * WGS84 latitude of the point location, in degrees. -90 to 90 degrees (negative
                 * values south of equator).
                 */
                fun fppLat(fppLat: Double) = fppLat(JsonField.of(fppLat))

                /**
                 * Sets [Builder.fppLat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fppLat] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fppLat(fppLat: JsonField<Double>) = apply { this.fppLat = fppLat }

                /**
                 * WGS84 longitude of the point location, in degrees. -180 to 180 degrees (negative
                 * values west of Prime Meridian).
                 */
                fun fppLon(fppLon: Double) = fppLon(JsonField.of(fppLon))

                /**
                 * Sets [Builder.fppLon] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fppLon] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fppLon(fppLon: JsonField<Double>) = apply { this.fppLon = fppLon }

                /**
                 * Fuel required at this point to execute an Equal Time Point (ETP) or Extended
                 * Operations (ETOPS) plan in pounds.
                 */
                fun fppReqFuel(fppReqFuel: Double) = fppReqFuel(JsonField.of(fppReqFuel))

                /**
                 * Sets [Builder.fppReqFuel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fppReqFuel] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fppReqFuel(fppReqFuel: JsonField<Double>) = apply {
                    this.fppReqFuel = fppReqFuel
                }

                /** Name of this point. */
                fun pointName(pointName: String) = pointName(JsonField.of(pointName))

                /**
                 * Sets [Builder.pointName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pointName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pointName(pointName: JsonField<String>) = apply { this.pointName = pointName }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [FlightPlanPoint].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FlightPlanPoint =
                    FlightPlanPoint(
                        fppEta,
                        fppLat,
                        fppLon,
                        fppReqFuel,
                        pointName,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FlightPlanPoint = apply {
                if (validated) {
                    return@apply
                }

                fppEta()
                fppLat()
                fppLon()
                fppReqFuel()
                pointName()
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
                (if (fppEta.asKnown().isPresent) 1 else 0) +
                    (if (fppLat.asKnown().isPresent) 1 else 0) +
                    (if (fppLon.asKnown().isPresent) 1 else 0) +
                    (if (fppReqFuel.asKnown().isPresent) 1 else 0) +
                    (if (pointName.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FlightPlanPoint &&
                    fppEta == other.fppEta &&
                    fppLat == other.fppLat &&
                    fppLon == other.fppLon &&
                    fppReqFuel == other.fppReqFuel &&
                    pointName == other.pointName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(fppEta, fppLat, fppLon, fppReqFuel, pointName, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FlightPlanPoint{fppEta=$fppEta, fppLat=$fppLat, fppLon=$fppLon, fppReqFuel=$fppReqFuel, pointName=$pointName, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FlightPlanPointGroup &&
                avgFuelFlow == other.avgFuelFlow &&
                etopsAvgWindFactor == other.etopsAvgWindFactor &&
                etopsDistance == other.etopsDistance &&
                etopsReqFuel == other.etopsReqFuel &&
                etopsTempDev == other.etopsTempDev &&
                etopsTime == other.etopsTime &&
                flightPlanPoints == other.flightPlanPoints &&
                fromTakeoffTime == other.fromTakeoffTime &&
                fsafAvgWindFactor == other.fsafAvgWindFactor &&
                fsafDistance == other.fsafDistance &&
                fsafReqFuel == other.fsafReqFuel &&
                fsafTempDev == other.fsafTempDev &&
                fsafTime == other.fsafTime &&
                fuelCalcAlt == other.fuelCalcAlt &&
                fuelCalcSpd == other.fuelCalcSpd &&
                lsafAvgWindFactor == other.lsafAvgWindFactor &&
                lsafDistance == other.lsafDistance &&
                lsafName == other.lsafName &&
                lsafReqFuel == other.lsafReqFuel &&
                lsafTempDev == other.lsafTempDev &&
                lsafTime == other.lsafTime &&
                plannedFuel == other.plannedFuel &&
                pointGroupName == other.pointGroupName &&
                worstFuelCase == other.worstFuelCase &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                avgFuelFlow,
                etopsAvgWindFactor,
                etopsDistance,
                etopsReqFuel,
                etopsTempDev,
                etopsTime,
                flightPlanPoints,
                fromTakeoffTime,
                fsafAvgWindFactor,
                fsafDistance,
                fsafReqFuel,
                fsafTempDev,
                fsafTime,
                fuelCalcAlt,
                fuelCalcSpd,
                lsafAvgWindFactor,
                lsafDistance,
                lsafName,
                lsafReqFuel,
                lsafTempDev,
                lsafTime,
                plannedFuel,
                pointGroupName,
                worstFuelCase,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FlightPlanPointGroup{avgFuelFlow=$avgFuelFlow, etopsAvgWindFactor=$etopsAvgWindFactor, etopsDistance=$etopsDistance, etopsReqFuel=$etopsReqFuel, etopsTempDev=$etopsTempDev, etopsTime=$etopsTime, flightPlanPoints=$flightPlanPoints, fromTakeoffTime=$fromTakeoffTime, fsafAvgWindFactor=$fsafAvgWindFactor, fsafDistance=$fsafDistance, fsafReqFuel=$fsafReqFuel, fsafTempDev=$fsafTempDev, fsafTime=$fsafTime, fuelCalcAlt=$fuelCalcAlt, fuelCalcSpd=$fuelCalcSpd, lsafAvgWindFactor=$lsafAvgWindFactor, lsafDistance=$lsafDistance, lsafName=$lsafName, lsafReqFuel=$lsafReqFuel, lsafTempDev=$lsafTempDev, lsafTime=$lsafTime, plannedFuel=$plannedFuel, pointGroupName=$pointGroupName, worstFuelCase=$worstFuelCase, additionalProperties=$additionalProperties}"
    }

    /** Collection of waypoints associated with this flight plan. */
    class FlightPlanWaypoint
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<String>,
        private val waypointName: JsonField<String>,
        private val aaTacanChannel: JsonField<String>,
        private val airDistance: JsonField<Double>,
        private val airway: JsonField<String>,
        private val alt: JsonField<Double>,
        private val arId: JsonField<String>,
        private val arpt: JsonField<String>,
        private val ata: JsonField<OffsetDateTime>,
        private val avgCalAirspeed: JsonField<Double>,
        private val avgDriftAng: JsonField<Double>,
        private val avgGroundSpeed: JsonField<Double>,
        private val avgTrueAirspeed: JsonField<Double>,
        private val avgWindDir: JsonField<Double>,
        private val avgWindSpeed: JsonField<Double>,
        private val dayLowAlt: JsonField<Double>,
        private val eta: JsonField<OffsetDateTime>,
        private val exchangedFuel: JsonField<Double>,
        private val fuelFlow: JsonField<Double>,
        private val iceCat: JsonField<String>,
        private val lat: JsonField<Double>,
        private val legAlternate: JsonField<String>,
        private val legDragIndex: JsonField<Double>,
        private val legFuelDegrade: JsonField<Double>,
        private val legMach: JsonField<Double>,
        private val legMsnIndex: JsonField<Double>,
        private val legWindFac: JsonField<Double>,
        private val lon: JsonField<Double>,
        private val magCourse: JsonField<Double>,
        private val magHeading: JsonField<Double>,
        private val magVar: JsonField<Double>,
        private val navaid: JsonField<String>,
        private val nightLowAlt: JsonField<Double>,
        private val nvgLowAlt: JsonField<Double>,
        private val pointWindDir: JsonField<Double>,
        private val pointWindSpeed: JsonField<Double>,
        private val priFreq: JsonField<Double>,
        private val secFreq: JsonField<Double>,
        private val tacanChannel: JsonField<String>,
        private val tempDev: JsonField<Double>,
        private val thunderCat: JsonField<String>,
        private val totalAirDistance: JsonField<Double>,
        private val totalFlownDistance: JsonField<Double>,
        private val totalRemDistance: JsonField<Double>,
        private val totalRemFuel: JsonField<Double>,
        private val totalTime: JsonField<String>,
        private val totalTimeRem: JsonField<String>,
        private val totalUsedFuel: JsonField<Double>,
        private val totalWeight: JsonField<Double>,
        private val trueCourse: JsonField<Double>,
        private val turbCat: JsonField<String>,
        private val vorFreq: JsonField<Double>,
        private val waypointNum: JsonField<Int>,
        private val zoneDistance: JsonField<Double>,
        private val zoneFuel: JsonField<Double>,
        private val zoneTime: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("waypointName")
            @ExcludeMissing
            waypointName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aaTacanChannel")
            @ExcludeMissing
            aaTacanChannel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("airDistance")
            @ExcludeMissing
            airDistance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("airway") @ExcludeMissing airway: JsonField<String> = JsonMissing.of(),
            @JsonProperty("alt") @ExcludeMissing alt: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("arId") @ExcludeMissing arId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("arpt") @ExcludeMissing arpt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ata") @ExcludeMissing ata: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("avgCalAirspeed")
            @ExcludeMissing
            avgCalAirspeed: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("avgDriftAng")
            @ExcludeMissing
            avgDriftAng: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("avgGroundSpeed")
            @ExcludeMissing
            avgGroundSpeed: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("avgTrueAirspeed")
            @ExcludeMissing
            avgTrueAirspeed: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("avgWindDir")
            @ExcludeMissing
            avgWindDir: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("avgWindSpeed")
            @ExcludeMissing
            avgWindSpeed: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("dayLowAlt")
            @ExcludeMissing
            dayLowAlt: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("eta") @ExcludeMissing eta: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("exchangedFuel")
            @ExcludeMissing
            exchangedFuel: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("fuelFlow")
            @ExcludeMissing
            fuelFlow: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("iceCat") @ExcludeMissing iceCat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("legAlternate")
            @ExcludeMissing
            legAlternate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("legDragIndex")
            @ExcludeMissing
            legDragIndex: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("legFuelDegrade")
            @ExcludeMissing
            legFuelDegrade: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("legMach") @ExcludeMissing legMach: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("legMsnIndex")
            @ExcludeMissing
            legMsnIndex: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("legWindFac")
            @ExcludeMissing
            legWindFac: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("magCourse")
            @ExcludeMissing
            magCourse: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("magHeading")
            @ExcludeMissing
            magHeading: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("magVar") @ExcludeMissing magVar: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("navaid") @ExcludeMissing navaid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nightLowAlt")
            @ExcludeMissing
            nightLowAlt: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("nvgLowAlt")
            @ExcludeMissing
            nvgLowAlt: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("pointWindDir")
            @ExcludeMissing
            pointWindDir: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("pointWindSpeed")
            @ExcludeMissing
            pointWindSpeed: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("priFreq") @ExcludeMissing priFreq: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("secFreq") @ExcludeMissing secFreq: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tacanChannel")
            @ExcludeMissing
            tacanChannel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tempDev") @ExcludeMissing tempDev: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("thunderCat")
            @ExcludeMissing
            thunderCat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("totalAirDistance")
            @ExcludeMissing
            totalAirDistance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("totalFlownDistance")
            @ExcludeMissing
            totalFlownDistance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("totalRemDistance")
            @ExcludeMissing
            totalRemDistance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("totalRemFuel")
            @ExcludeMissing
            totalRemFuel: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("totalTime")
            @ExcludeMissing
            totalTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("totalTimeRem")
            @ExcludeMissing
            totalTimeRem: JsonField<String> = JsonMissing.of(),
            @JsonProperty("totalUsedFuel")
            @ExcludeMissing
            totalUsedFuel: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("totalWeight")
            @ExcludeMissing
            totalWeight: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("trueCourse")
            @ExcludeMissing
            trueCourse: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("turbCat") @ExcludeMissing turbCat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vorFreq") @ExcludeMissing vorFreq: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("waypointNum")
            @ExcludeMissing
            waypointNum: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("zoneDistance")
            @ExcludeMissing
            zoneDistance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("zoneFuel")
            @ExcludeMissing
            zoneFuel: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("zoneTime") @ExcludeMissing zoneTime: JsonField<Double> = JsonMissing.of(),
        ) : this(
            type,
            waypointName,
            aaTacanChannel,
            airDistance,
            airway,
            alt,
            arId,
            arpt,
            ata,
            avgCalAirspeed,
            avgDriftAng,
            avgGroundSpeed,
            avgTrueAirspeed,
            avgWindDir,
            avgWindSpeed,
            dayLowAlt,
            eta,
            exchangedFuel,
            fuelFlow,
            iceCat,
            lat,
            legAlternate,
            legDragIndex,
            legFuelDegrade,
            legMach,
            legMsnIndex,
            legWindFac,
            lon,
            magCourse,
            magHeading,
            magVar,
            navaid,
            nightLowAlt,
            nvgLowAlt,
            pointWindDir,
            pointWindSpeed,
            priFreq,
            secFreq,
            tacanChannel,
            tempDev,
            thunderCat,
            totalAirDistance,
            totalFlownDistance,
            totalRemDistance,
            totalRemFuel,
            totalTime,
            totalTimeRem,
            totalUsedFuel,
            totalWeight,
            trueCourse,
            turbCat,
            vorFreq,
            waypointNum,
            zoneDistance,
            zoneFuel,
            zoneTime,
            mutableMapOf(),
        )

        /**
         * Points are designated by type as either a comment point or a waypoint. A comment point
         * conveys important information about the point for pilots but is not entered into a flight
         * management system. A waypoint is a point that is entered into a flight management system
         * and/or filed with Air Traffic Control.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * Name of the point. The name of a comment point identifies important information about
         * that point, e.g. Top of Climb. The name of a waypoint identifies the location of that
         * point.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun waypointName(): String = waypointName.getRequired("waypointName")

        /**
         * The air-to-air Tactical Air Navigation (TACAN) channels used by the receiver/tanker
         * during air refueling.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun aaTacanChannel(): Optional<String> = aaTacanChannel.getOptional("aaTacanChannel")

        /**
         * The air distance of this leg in nautical miles.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun airDistance(): Optional<Double> = airDistance.getOptional("airDistance")

        /**
         * The flight path flown for this leg.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun airway(): Optional<String> = airway.getOptional("airway")

        /**
         * Altitude of a level, point, or object measured in feet above mean sea level.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun alt(): Optional<Double> = alt.getOptional("alt")

        /**
         * The ID of the air refueling track/anchor or fixed track.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun arId(): Optional<String> = arId.getOptional("arId")

        /**
         * Point identifying an air refueling track/anchor or fixed track.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun arpt(): Optional<String> = arpt.getOptional("arpt")

        /**
         * Actual Time of Arrival (ATA) at this waypoint in ISO 8601 UTC format, with millisecond
         * precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ata(): Optional<OffsetDateTime> = ata.getOptional("ata")

        /**
         * The average calibrated airspeed (CAS) for this leg in knots.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun avgCalAirspeed(): Optional<Double> = avgCalAirspeed.getOptional("avgCalAirspeed")

        /**
         * The average drift angle for this leg in degrees from true north.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun avgDriftAng(): Optional<Double> = avgDriftAng.getOptional("avgDriftAng")

        /**
         * The average ground speed for this leg in knots.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun avgGroundSpeed(): Optional<Double> = avgGroundSpeed.getOptional("avgGroundSpeed")

        /**
         * The average true airspeed (TAS) for this leg in knots.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun avgTrueAirspeed(): Optional<Double> = avgTrueAirspeed.getOptional("avgTrueAirspeed")

        /**
         * The average wind direction for this leg in degrees from true north.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun avgWindDir(): Optional<Double> = avgWindDir.getOptional("avgWindDir")

        /**
         * The average wind speed for this leg in knots.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun avgWindSpeed(): Optional<Double> = avgWindSpeed.getOptional("avgWindSpeed")

        /**
         * The day low level altitude in feet above sea level for the leg ending at this waypoint.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dayLowAlt(): Optional<Double> = dayLowAlt.getOptional("dayLowAlt")

        /**
         * Estimated Time of Arrival (ETA) at this waypoint in ISO 8601 UTC format, with millisecond
         * precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun eta(): Optional<OffsetDateTime> = eta.getOptional("eta")

        /**
         * The amount of fuel onloaded or offloaded at this waypoint in pounds (negative value for
         * offload).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun exchangedFuel(): Optional<Double> = exchangedFuel.getOptional("exchangedFuel")

        /**
         * The leg fuel flow in pounds per hour.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fuelFlow(): Optional<Double> = fuelFlow.getOptional("fuelFlow")

        /**
         * The icing intensity classification for this flight (LIGHT, MODERATE, etc).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun iceCat(): Optional<String> = iceCat.getOptional("iceCat")

        /**
         * WGS84 latitude of the point location, in degrees. -90 to 90 degrees (negative values
         * south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lat(): Optional<Double> = lat.getOptional("lat")

        /**
         * The planned alternate leg based on user-defined constraints, International Civil Aviation
         * Organization (ICAO) code preferred.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun legAlternate(): Optional<String> = legAlternate.getOptional("legAlternate")

        /**
         * The percent degrade due to drag for this aircraft for this leg.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun legDragIndex(): Optional<Double> = legDragIndex.getOptional("legDragIndex")

        /**
         * The fuel degrade percentage used for this leg.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun legFuelDegrade(): Optional<Double> = legFuelDegrade.getOptional("legFuelDegrade")

        /**
         * The average Mach speed for this leg.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun legMach(): Optional<Double> = legMach.getOptional("legMach")

        /**
         * The mission index value for this leg. The mission index is the ratio of time-related cost
         * of aircraft operation to the cost of fuel.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun legMsnIndex(): Optional<Double> = legMsnIndex.getOptional("legMsnIndex")

        /**
         * The wind factor for this leg in knots. A positive value indicates a headwind, while a
         * negative value indicates a tailwind.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun legWindFac(): Optional<Double> = legWindFac.getOptional("legWindFac")

        /**
         * WGS84 longitude of the point location, in degrees. -180 to 180 degrees (negative values
         * west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lon(): Optional<Double> = lon.getOptional("lon")

        /**
         * The magnetic course at leg midpoint in degrees from true north.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun magCourse(): Optional<Double> = magCourse.getOptional("magCourse")

        /**
         * The magnetic heading at leg midpoint in degrees from true north.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun magHeading(): Optional<Double> = magHeading.getOptional("magHeading")

        /**
         * The magnetic variation for this leg in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun magVar(): Optional<Double> = magVar.getOptional("magVar")

        /**
         * Navigational Aid (NAVAID) identification code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun navaid(): Optional<String> = navaid.getOptional("navaid")

        /**
         * The night low level altitude in feet above sea level for the leg ending at this waypoint.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun nightLowAlt(): Optional<Double> = nightLowAlt.getOptional("nightLowAlt")

        /**
         * The night vision goggle low level altitude in feet above sea level for the leg ending at
         * this waypoint.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun nvgLowAlt(): Optional<Double> = nvgLowAlt.getOptional("nvgLowAlt")

        /**
         * The wind direction at this specific point in degrees from true north.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pointWindDir(): Optional<Double> = pointWindDir.getOptional("pointWindDir")

        /**
         * The wind velocity at this specific point in knots.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pointWindSpeed(): Optional<Double> = pointWindSpeed.getOptional("pointWindSpeed")

        /**
         * The primary UHF radio frequency used for the air refueling track or anchor in megahertz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun priFreq(): Optional<Double> = priFreq.getOptional("priFreq")

        /**
         * The secondary UHF radio frequency used for the air refueling track or anchor in
         * megahertz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun secFreq(): Optional<Double> = secFreq.getOptional("secFreq")

        /**
         * Tactical Air Navigation (TACAN) channel for the Navigational Aid (NAVAID).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tacanChannel(): Optional<String> = tacanChannel.getOptional("tacanChannel")

        /**
         * Average temperature deviation from standard day profile for this leg in degrees Celsius.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tempDev(): Optional<Double> = tempDev.getOptional("tempDev")

        /**
         * The thunderstorm intensity classification for this flight (LIGHT, MODERATE, etc).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun thunderCat(): Optional<String> = thunderCat.getOptional("thunderCat")

        /**
         * The total air distance to this waypoint in nautical miles.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalAirDistance(): Optional<Double> = totalAirDistance.getOptional("totalAirDistance")

        /**
         * The total distance flown to this waypoint calculated from point of departure in nautical
         * miles.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalFlownDistance(): Optional<Double> =
            totalFlownDistance.getOptional("totalFlownDistance")

        /**
         * The total distance remaining from this waypoint to the point of arrival in nautical
         * miles.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalRemDistance(): Optional<Double> = totalRemDistance.getOptional("totalRemDistance")

        /**
         * The total fuel remaining at this waypoint in pounds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalRemFuel(): Optional<Double> = totalRemFuel.getOptional("totalRemFuel")

        /**
         * The total time accumulated from takeoff to this waypoint expressed as HH:MM.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalTime(): Optional<String> = totalTime.getOptional("totalTime")

        /**
         * The total time remaining from this waypoint to the point of arrival expressed as HH:MM.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalTimeRem(): Optional<String> = totalTimeRem.getOptional("totalTimeRem")

        /**
         * The total fuel used to this waypoint from point of departure in pounds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalUsedFuel(): Optional<Double> = totalUsedFuel.getOptional("totalUsedFuel")

        /**
         * The total weight of the aircraft at this waypoint in pounds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalWeight(): Optional<Double> = totalWeight.getOptional("totalWeight")

        /**
         * The true course at leg midpoint in degrees from true north.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun trueCourse(): Optional<Double> = trueCourse.getOptional("trueCourse")

        /**
         * The turbulence intensity classification for this flight (LIGHT, MODERATE, etc).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun turbCat(): Optional<String> = turbCat.getOptional("turbCat")

        /**
         * VHF Omni-directional Range (VOR) frequency for the Navigational Aid (NAVAID) in
         * megahertz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun vorFreq(): Optional<Double> = vorFreq.getOptional("vorFreq")

        /**
         * The waypoint number on the route. Comment points do not get a waypoint number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun waypointNum(): Optional<Int> = waypointNum.getOptional("waypointNum")

        /**
         * The zone/leg distance flown in nautical miles.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun zoneDistance(): Optional<Double> = zoneDistance.getOptional("zoneDistance")

        /**
         * The amount of fuel used on this zone/leg in pounds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun zoneFuel(): Optional<Double> = zoneFuel.getOptional("zoneFuel")

        /**
         * The time to fly this zone/leg in minutes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun zoneTime(): Optional<Double> = zoneTime.getOptional("zoneTime")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [waypointName].
         *
         * Unlike [waypointName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("waypointName")
        @ExcludeMissing
        fun _waypointName(): JsonField<String> = waypointName

        /**
         * Returns the raw JSON value of [aaTacanChannel].
         *
         * Unlike [aaTacanChannel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aaTacanChannel")
        @ExcludeMissing
        fun _aaTacanChannel(): JsonField<String> = aaTacanChannel

        /**
         * Returns the raw JSON value of [airDistance].
         *
         * Unlike [airDistance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("airDistance")
        @ExcludeMissing
        fun _airDistance(): JsonField<Double> = airDistance

        /**
         * Returns the raw JSON value of [airway].
         *
         * Unlike [airway], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("airway") @ExcludeMissing fun _airway(): JsonField<String> = airway

        /**
         * Returns the raw JSON value of [alt].
         *
         * Unlike [alt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alt") @ExcludeMissing fun _alt(): JsonField<Double> = alt

        /**
         * Returns the raw JSON value of [arId].
         *
         * Unlike [arId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arId") @ExcludeMissing fun _arId(): JsonField<String> = arId

        /**
         * Returns the raw JSON value of [arpt].
         *
         * Unlike [arpt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arpt") @ExcludeMissing fun _arpt(): JsonField<String> = arpt

        /**
         * Returns the raw JSON value of [ata].
         *
         * Unlike [ata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ata") @ExcludeMissing fun _ata(): JsonField<OffsetDateTime> = ata

        /**
         * Returns the raw JSON value of [avgCalAirspeed].
         *
         * Unlike [avgCalAirspeed], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("avgCalAirspeed")
        @ExcludeMissing
        fun _avgCalAirspeed(): JsonField<Double> = avgCalAirspeed

        /**
         * Returns the raw JSON value of [avgDriftAng].
         *
         * Unlike [avgDriftAng], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("avgDriftAng")
        @ExcludeMissing
        fun _avgDriftAng(): JsonField<Double> = avgDriftAng

        /**
         * Returns the raw JSON value of [avgGroundSpeed].
         *
         * Unlike [avgGroundSpeed], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("avgGroundSpeed")
        @ExcludeMissing
        fun _avgGroundSpeed(): JsonField<Double> = avgGroundSpeed

        /**
         * Returns the raw JSON value of [avgTrueAirspeed].
         *
         * Unlike [avgTrueAirspeed], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("avgTrueAirspeed")
        @ExcludeMissing
        fun _avgTrueAirspeed(): JsonField<Double> = avgTrueAirspeed

        /**
         * Returns the raw JSON value of [avgWindDir].
         *
         * Unlike [avgWindDir], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("avgWindDir")
        @ExcludeMissing
        fun _avgWindDir(): JsonField<Double> = avgWindDir

        /**
         * Returns the raw JSON value of [avgWindSpeed].
         *
         * Unlike [avgWindSpeed], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("avgWindSpeed")
        @ExcludeMissing
        fun _avgWindSpeed(): JsonField<Double> = avgWindSpeed

        /**
         * Returns the raw JSON value of [dayLowAlt].
         *
         * Unlike [dayLowAlt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dayLowAlt") @ExcludeMissing fun _dayLowAlt(): JsonField<Double> = dayLowAlt

        /**
         * Returns the raw JSON value of [eta].
         *
         * Unlike [eta], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eta") @ExcludeMissing fun _eta(): JsonField<OffsetDateTime> = eta

        /**
         * Returns the raw JSON value of [exchangedFuel].
         *
         * Unlike [exchangedFuel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exchangedFuel")
        @ExcludeMissing
        fun _exchangedFuel(): JsonField<Double> = exchangedFuel

        /**
         * Returns the raw JSON value of [fuelFlow].
         *
         * Unlike [fuelFlow], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fuelFlow") @ExcludeMissing fun _fuelFlow(): JsonField<Double> = fuelFlow

        /**
         * Returns the raw JSON value of [iceCat].
         *
         * Unlike [iceCat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("iceCat") @ExcludeMissing fun _iceCat(): JsonField<String> = iceCat

        /**
         * Returns the raw JSON value of [lat].
         *
         * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

        /**
         * Returns the raw JSON value of [legAlternate].
         *
         * Unlike [legAlternate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legAlternate")
        @ExcludeMissing
        fun _legAlternate(): JsonField<String> = legAlternate

        /**
         * Returns the raw JSON value of [legDragIndex].
         *
         * Unlike [legDragIndex], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legDragIndex")
        @ExcludeMissing
        fun _legDragIndex(): JsonField<Double> = legDragIndex

        /**
         * Returns the raw JSON value of [legFuelDegrade].
         *
         * Unlike [legFuelDegrade], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legFuelDegrade")
        @ExcludeMissing
        fun _legFuelDegrade(): JsonField<Double> = legFuelDegrade

        /**
         * Returns the raw JSON value of [legMach].
         *
         * Unlike [legMach], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("legMach") @ExcludeMissing fun _legMach(): JsonField<Double> = legMach

        /**
         * Returns the raw JSON value of [legMsnIndex].
         *
         * Unlike [legMsnIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("legMsnIndex")
        @ExcludeMissing
        fun _legMsnIndex(): JsonField<Double> = legMsnIndex

        /**
         * Returns the raw JSON value of [legWindFac].
         *
         * Unlike [legWindFac], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("legWindFac")
        @ExcludeMissing
        fun _legWindFac(): JsonField<Double> = legWindFac

        /**
         * Returns the raw JSON value of [lon].
         *
         * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

        /**
         * Returns the raw JSON value of [magCourse].
         *
         * Unlike [magCourse], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("magCourse") @ExcludeMissing fun _magCourse(): JsonField<Double> = magCourse

        /**
         * Returns the raw JSON value of [magHeading].
         *
         * Unlike [magHeading], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("magHeading")
        @ExcludeMissing
        fun _magHeading(): JsonField<Double> = magHeading

        /**
         * Returns the raw JSON value of [magVar].
         *
         * Unlike [magVar], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("magVar") @ExcludeMissing fun _magVar(): JsonField<Double> = magVar

        /**
         * Returns the raw JSON value of [navaid].
         *
         * Unlike [navaid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("navaid") @ExcludeMissing fun _navaid(): JsonField<String> = navaid

        /**
         * Returns the raw JSON value of [nightLowAlt].
         *
         * Unlike [nightLowAlt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nightLowAlt")
        @ExcludeMissing
        fun _nightLowAlt(): JsonField<Double> = nightLowAlt

        /**
         * Returns the raw JSON value of [nvgLowAlt].
         *
         * Unlike [nvgLowAlt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nvgLowAlt") @ExcludeMissing fun _nvgLowAlt(): JsonField<Double> = nvgLowAlt

        /**
         * Returns the raw JSON value of [pointWindDir].
         *
         * Unlike [pointWindDir], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pointWindDir")
        @ExcludeMissing
        fun _pointWindDir(): JsonField<Double> = pointWindDir

        /**
         * Returns the raw JSON value of [pointWindSpeed].
         *
         * Unlike [pointWindSpeed], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pointWindSpeed")
        @ExcludeMissing
        fun _pointWindSpeed(): JsonField<Double> = pointWindSpeed

        /**
         * Returns the raw JSON value of [priFreq].
         *
         * Unlike [priFreq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priFreq") @ExcludeMissing fun _priFreq(): JsonField<Double> = priFreq

        /**
         * Returns the raw JSON value of [secFreq].
         *
         * Unlike [secFreq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secFreq") @ExcludeMissing fun _secFreq(): JsonField<Double> = secFreq

        /**
         * Returns the raw JSON value of [tacanChannel].
         *
         * Unlike [tacanChannel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tacanChannel")
        @ExcludeMissing
        fun _tacanChannel(): JsonField<String> = tacanChannel

        /**
         * Returns the raw JSON value of [tempDev].
         *
         * Unlike [tempDev], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tempDev") @ExcludeMissing fun _tempDev(): JsonField<Double> = tempDev

        /**
         * Returns the raw JSON value of [thunderCat].
         *
         * Unlike [thunderCat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("thunderCat")
        @ExcludeMissing
        fun _thunderCat(): JsonField<String> = thunderCat

        /**
         * Returns the raw JSON value of [totalAirDistance].
         *
         * Unlike [totalAirDistance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalAirDistance")
        @ExcludeMissing
        fun _totalAirDistance(): JsonField<Double> = totalAirDistance

        /**
         * Returns the raw JSON value of [totalFlownDistance].
         *
         * Unlike [totalFlownDistance], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("totalFlownDistance")
        @ExcludeMissing
        fun _totalFlownDistance(): JsonField<Double> = totalFlownDistance

        /**
         * Returns the raw JSON value of [totalRemDistance].
         *
         * Unlike [totalRemDistance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalRemDistance")
        @ExcludeMissing
        fun _totalRemDistance(): JsonField<Double> = totalRemDistance

        /**
         * Returns the raw JSON value of [totalRemFuel].
         *
         * Unlike [totalRemFuel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalRemFuel")
        @ExcludeMissing
        fun _totalRemFuel(): JsonField<Double> = totalRemFuel

        /**
         * Returns the raw JSON value of [totalTime].
         *
         * Unlike [totalTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totalTime") @ExcludeMissing fun _totalTime(): JsonField<String> = totalTime

        /**
         * Returns the raw JSON value of [totalTimeRem].
         *
         * Unlike [totalTimeRem], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalTimeRem")
        @ExcludeMissing
        fun _totalTimeRem(): JsonField<String> = totalTimeRem

        /**
         * Returns the raw JSON value of [totalUsedFuel].
         *
         * Unlike [totalUsedFuel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalUsedFuel")
        @ExcludeMissing
        fun _totalUsedFuel(): JsonField<Double> = totalUsedFuel

        /**
         * Returns the raw JSON value of [totalWeight].
         *
         * Unlike [totalWeight], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totalWeight")
        @ExcludeMissing
        fun _totalWeight(): JsonField<Double> = totalWeight

        /**
         * Returns the raw JSON value of [trueCourse].
         *
         * Unlike [trueCourse], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trueCourse")
        @ExcludeMissing
        fun _trueCourse(): JsonField<Double> = trueCourse

        /**
         * Returns the raw JSON value of [turbCat].
         *
         * Unlike [turbCat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("turbCat") @ExcludeMissing fun _turbCat(): JsonField<String> = turbCat

        /**
         * Returns the raw JSON value of [vorFreq].
         *
         * Unlike [vorFreq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vorFreq") @ExcludeMissing fun _vorFreq(): JsonField<Double> = vorFreq

        /**
         * Returns the raw JSON value of [waypointNum].
         *
         * Unlike [waypointNum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("waypointNum")
        @ExcludeMissing
        fun _waypointNum(): JsonField<Int> = waypointNum

        /**
         * Returns the raw JSON value of [zoneDistance].
         *
         * Unlike [zoneDistance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("zoneDistance")
        @ExcludeMissing
        fun _zoneDistance(): JsonField<Double> = zoneDistance

        /**
         * Returns the raw JSON value of [zoneFuel].
         *
         * Unlike [zoneFuel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zoneFuel") @ExcludeMissing fun _zoneFuel(): JsonField<Double> = zoneFuel

        /**
         * Returns the raw JSON value of [zoneTime].
         *
         * Unlike [zoneTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zoneTime") @ExcludeMissing fun _zoneTime(): JsonField<Double> = zoneTime

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
             * Returns a mutable builder for constructing an instance of [FlightPlanWaypoint].
             *
             * The following fields are required:
             * ```java
             * .type()
             * .waypointName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FlightPlanWaypoint]. */
        class Builder internal constructor() {

            private var type: JsonField<String>? = null
            private var waypointName: JsonField<String>? = null
            private var aaTacanChannel: JsonField<String> = JsonMissing.of()
            private var airDistance: JsonField<Double> = JsonMissing.of()
            private var airway: JsonField<String> = JsonMissing.of()
            private var alt: JsonField<Double> = JsonMissing.of()
            private var arId: JsonField<String> = JsonMissing.of()
            private var arpt: JsonField<String> = JsonMissing.of()
            private var ata: JsonField<OffsetDateTime> = JsonMissing.of()
            private var avgCalAirspeed: JsonField<Double> = JsonMissing.of()
            private var avgDriftAng: JsonField<Double> = JsonMissing.of()
            private var avgGroundSpeed: JsonField<Double> = JsonMissing.of()
            private var avgTrueAirspeed: JsonField<Double> = JsonMissing.of()
            private var avgWindDir: JsonField<Double> = JsonMissing.of()
            private var avgWindSpeed: JsonField<Double> = JsonMissing.of()
            private var dayLowAlt: JsonField<Double> = JsonMissing.of()
            private var eta: JsonField<OffsetDateTime> = JsonMissing.of()
            private var exchangedFuel: JsonField<Double> = JsonMissing.of()
            private var fuelFlow: JsonField<Double> = JsonMissing.of()
            private var iceCat: JsonField<String> = JsonMissing.of()
            private var lat: JsonField<Double> = JsonMissing.of()
            private var legAlternate: JsonField<String> = JsonMissing.of()
            private var legDragIndex: JsonField<Double> = JsonMissing.of()
            private var legFuelDegrade: JsonField<Double> = JsonMissing.of()
            private var legMach: JsonField<Double> = JsonMissing.of()
            private var legMsnIndex: JsonField<Double> = JsonMissing.of()
            private var legWindFac: JsonField<Double> = JsonMissing.of()
            private var lon: JsonField<Double> = JsonMissing.of()
            private var magCourse: JsonField<Double> = JsonMissing.of()
            private var magHeading: JsonField<Double> = JsonMissing.of()
            private var magVar: JsonField<Double> = JsonMissing.of()
            private var navaid: JsonField<String> = JsonMissing.of()
            private var nightLowAlt: JsonField<Double> = JsonMissing.of()
            private var nvgLowAlt: JsonField<Double> = JsonMissing.of()
            private var pointWindDir: JsonField<Double> = JsonMissing.of()
            private var pointWindSpeed: JsonField<Double> = JsonMissing.of()
            private var priFreq: JsonField<Double> = JsonMissing.of()
            private var secFreq: JsonField<Double> = JsonMissing.of()
            private var tacanChannel: JsonField<String> = JsonMissing.of()
            private var tempDev: JsonField<Double> = JsonMissing.of()
            private var thunderCat: JsonField<String> = JsonMissing.of()
            private var totalAirDistance: JsonField<Double> = JsonMissing.of()
            private var totalFlownDistance: JsonField<Double> = JsonMissing.of()
            private var totalRemDistance: JsonField<Double> = JsonMissing.of()
            private var totalRemFuel: JsonField<Double> = JsonMissing.of()
            private var totalTime: JsonField<String> = JsonMissing.of()
            private var totalTimeRem: JsonField<String> = JsonMissing.of()
            private var totalUsedFuel: JsonField<Double> = JsonMissing.of()
            private var totalWeight: JsonField<Double> = JsonMissing.of()
            private var trueCourse: JsonField<Double> = JsonMissing.of()
            private var turbCat: JsonField<String> = JsonMissing.of()
            private var vorFreq: JsonField<Double> = JsonMissing.of()
            private var waypointNum: JsonField<Int> = JsonMissing.of()
            private var zoneDistance: JsonField<Double> = JsonMissing.of()
            private var zoneFuel: JsonField<Double> = JsonMissing.of()
            private var zoneTime: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(flightPlanWaypoint: FlightPlanWaypoint) = apply {
                type = flightPlanWaypoint.type
                waypointName = flightPlanWaypoint.waypointName
                aaTacanChannel = flightPlanWaypoint.aaTacanChannel
                airDistance = flightPlanWaypoint.airDistance
                airway = flightPlanWaypoint.airway
                alt = flightPlanWaypoint.alt
                arId = flightPlanWaypoint.arId
                arpt = flightPlanWaypoint.arpt
                ata = flightPlanWaypoint.ata
                avgCalAirspeed = flightPlanWaypoint.avgCalAirspeed
                avgDriftAng = flightPlanWaypoint.avgDriftAng
                avgGroundSpeed = flightPlanWaypoint.avgGroundSpeed
                avgTrueAirspeed = flightPlanWaypoint.avgTrueAirspeed
                avgWindDir = flightPlanWaypoint.avgWindDir
                avgWindSpeed = flightPlanWaypoint.avgWindSpeed
                dayLowAlt = flightPlanWaypoint.dayLowAlt
                eta = flightPlanWaypoint.eta
                exchangedFuel = flightPlanWaypoint.exchangedFuel
                fuelFlow = flightPlanWaypoint.fuelFlow
                iceCat = flightPlanWaypoint.iceCat
                lat = flightPlanWaypoint.lat
                legAlternate = flightPlanWaypoint.legAlternate
                legDragIndex = flightPlanWaypoint.legDragIndex
                legFuelDegrade = flightPlanWaypoint.legFuelDegrade
                legMach = flightPlanWaypoint.legMach
                legMsnIndex = flightPlanWaypoint.legMsnIndex
                legWindFac = flightPlanWaypoint.legWindFac
                lon = flightPlanWaypoint.lon
                magCourse = flightPlanWaypoint.magCourse
                magHeading = flightPlanWaypoint.magHeading
                magVar = flightPlanWaypoint.magVar
                navaid = flightPlanWaypoint.navaid
                nightLowAlt = flightPlanWaypoint.nightLowAlt
                nvgLowAlt = flightPlanWaypoint.nvgLowAlt
                pointWindDir = flightPlanWaypoint.pointWindDir
                pointWindSpeed = flightPlanWaypoint.pointWindSpeed
                priFreq = flightPlanWaypoint.priFreq
                secFreq = flightPlanWaypoint.secFreq
                tacanChannel = flightPlanWaypoint.tacanChannel
                tempDev = flightPlanWaypoint.tempDev
                thunderCat = flightPlanWaypoint.thunderCat
                totalAirDistance = flightPlanWaypoint.totalAirDistance
                totalFlownDistance = flightPlanWaypoint.totalFlownDistance
                totalRemDistance = flightPlanWaypoint.totalRemDistance
                totalRemFuel = flightPlanWaypoint.totalRemFuel
                totalTime = flightPlanWaypoint.totalTime
                totalTimeRem = flightPlanWaypoint.totalTimeRem
                totalUsedFuel = flightPlanWaypoint.totalUsedFuel
                totalWeight = flightPlanWaypoint.totalWeight
                trueCourse = flightPlanWaypoint.trueCourse
                turbCat = flightPlanWaypoint.turbCat
                vorFreq = flightPlanWaypoint.vorFreq
                waypointNum = flightPlanWaypoint.waypointNum
                zoneDistance = flightPlanWaypoint.zoneDistance
                zoneFuel = flightPlanWaypoint.zoneFuel
                zoneTime = flightPlanWaypoint.zoneTime
                additionalProperties = flightPlanWaypoint.additionalProperties.toMutableMap()
            }

            /**
             * Points are designated by type as either a comment point or a waypoint. A comment
             * point conveys important information about the point for pilots but is not entered
             * into a flight management system. A waypoint is a point that is entered into a flight
             * management system and/or filed with Air Traffic Control.
             */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /**
             * Name of the point. The name of a comment point identifies important information about
             * that point, e.g. Top of Climb. The name of a waypoint identifies the location of that
             * point.
             */
            fun waypointName(waypointName: String) = waypointName(JsonField.of(waypointName))

            /**
             * Sets [Builder.waypointName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waypointName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waypointName(waypointName: JsonField<String>) = apply {
                this.waypointName = waypointName
            }

            /**
             * The air-to-air Tactical Air Navigation (TACAN) channels used by the receiver/tanker
             * during air refueling.
             */
            fun aaTacanChannel(aaTacanChannel: String) =
                aaTacanChannel(JsonField.of(aaTacanChannel))

            /**
             * Sets [Builder.aaTacanChannel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aaTacanChannel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aaTacanChannel(aaTacanChannel: JsonField<String>) = apply {
                this.aaTacanChannel = aaTacanChannel
            }

            /** The air distance of this leg in nautical miles. */
            fun airDistance(airDistance: Double) = airDistance(JsonField.of(airDistance))

            /**
             * Sets [Builder.airDistance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.airDistance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun airDistance(airDistance: JsonField<Double>) = apply {
                this.airDistance = airDistance
            }

            /** The flight path flown for this leg. */
            fun airway(airway: String) = airway(JsonField.of(airway))

            /**
             * Sets [Builder.airway] to an arbitrary JSON value.
             *
             * You should usually call [Builder.airway] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun airway(airway: JsonField<String>) = apply { this.airway = airway }

            /** Altitude of a level, point, or object measured in feet above mean sea level. */
            fun alt(alt: Double) = alt(JsonField.of(alt))

            /**
             * Sets [Builder.alt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alt] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun alt(alt: JsonField<Double>) = apply { this.alt = alt }

            /** The ID of the air refueling track/anchor or fixed track. */
            fun arId(arId: String) = arId(JsonField.of(arId))

            /**
             * Sets [Builder.arId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arId] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun arId(arId: JsonField<String>) = apply { this.arId = arId }

            /** Point identifying an air refueling track/anchor or fixed track. */
            fun arpt(arpt: String) = arpt(JsonField.of(arpt))

            /**
             * Sets [Builder.arpt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arpt] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun arpt(arpt: JsonField<String>) = apply { this.arpt = arpt }

            /**
             * Actual Time of Arrival (ATA) at this waypoint in ISO 8601 UTC format, with
             * millisecond precision.
             */
            fun ata(ata: OffsetDateTime) = ata(JsonField.of(ata))

            /**
             * Sets [Builder.ata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ata] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ata(ata: JsonField<OffsetDateTime>) = apply { this.ata = ata }

            /** The average calibrated airspeed (CAS) for this leg in knots. */
            fun avgCalAirspeed(avgCalAirspeed: Double) =
                avgCalAirspeed(JsonField.of(avgCalAirspeed))

            /**
             * Sets [Builder.avgCalAirspeed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avgCalAirspeed] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avgCalAirspeed(avgCalAirspeed: JsonField<Double>) = apply {
                this.avgCalAirspeed = avgCalAirspeed
            }

            /** The average drift angle for this leg in degrees from true north. */
            fun avgDriftAng(avgDriftAng: Double) = avgDriftAng(JsonField.of(avgDriftAng))

            /**
             * Sets [Builder.avgDriftAng] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avgDriftAng] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avgDriftAng(avgDriftAng: JsonField<Double>) = apply {
                this.avgDriftAng = avgDriftAng
            }

            /** The average ground speed for this leg in knots. */
            fun avgGroundSpeed(avgGroundSpeed: Double) =
                avgGroundSpeed(JsonField.of(avgGroundSpeed))

            /**
             * Sets [Builder.avgGroundSpeed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avgGroundSpeed] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avgGroundSpeed(avgGroundSpeed: JsonField<Double>) = apply {
                this.avgGroundSpeed = avgGroundSpeed
            }

            /** The average true airspeed (TAS) for this leg in knots. */
            fun avgTrueAirspeed(avgTrueAirspeed: Double) =
                avgTrueAirspeed(JsonField.of(avgTrueAirspeed))

            /**
             * Sets [Builder.avgTrueAirspeed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avgTrueAirspeed] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avgTrueAirspeed(avgTrueAirspeed: JsonField<Double>) = apply {
                this.avgTrueAirspeed = avgTrueAirspeed
            }

            /** The average wind direction for this leg in degrees from true north. */
            fun avgWindDir(avgWindDir: Double) = avgWindDir(JsonField.of(avgWindDir))

            /**
             * Sets [Builder.avgWindDir] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avgWindDir] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avgWindDir(avgWindDir: JsonField<Double>) = apply { this.avgWindDir = avgWindDir }

            /** The average wind speed for this leg in knots. */
            fun avgWindSpeed(avgWindSpeed: Double) = avgWindSpeed(JsonField.of(avgWindSpeed))

            /**
             * Sets [Builder.avgWindSpeed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avgWindSpeed] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avgWindSpeed(avgWindSpeed: JsonField<Double>) = apply {
                this.avgWindSpeed = avgWindSpeed
            }

            /**
             * The day low level altitude in feet above sea level for the leg ending at this
             * waypoint.
             */
            fun dayLowAlt(dayLowAlt: Double) = dayLowAlt(JsonField.of(dayLowAlt))

            /**
             * Sets [Builder.dayLowAlt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dayLowAlt] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dayLowAlt(dayLowAlt: JsonField<Double>) = apply { this.dayLowAlt = dayLowAlt }

            /**
             * Estimated Time of Arrival (ETA) at this waypoint in ISO 8601 UTC format, with
             * millisecond precision.
             */
            fun eta(eta: OffsetDateTime) = eta(JsonField.of(eta))

            /**
             * Sets [Builder.eta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eta] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eta(eta: JsonField<OffsetDateTime>) = apply { this.eta = eta }

            /**
             * The amount of fuel onloaded or offloaded at this waypoint in pounds (negative value
             * for offload).
             */
            fun exchangedFuel(exchangedFuel: Double) = exchangedFuel(JsonField.of(exchangedFuel))

            /**
             * Sets [Builder.exchangedFuel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exchangedFuel] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exchangedFuel(exchangedFuel: JsonField<Double>) = apply {
                this.exchangedFuel = exchangedFuel
            }

            /** The leg fuel flow in pounds per hour. */
            fun fuelFlow(fuelFlow: Double) = fuelFlow(JsonField.of(fuelFlow))

            /**
             * Sets [Builder.fuelFlow] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fuelFlow] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fuelFlow(fuelFlow: JsonField<Double>) = apply { this.fuelFlow = fuelFlow }

            /** The icing intensity classification for this flight (LIGHT, MODERATE, etc). */
            fun iceCat(iceCat: String) = iceCat(JsonField.of(iceCat))

            /**
             * Sets [Builder.iceCat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.iceCat] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun iceCat(iceCat: JsonField<String>) = apply { this.iceCat = iceCat }

            /**
             * WGS84 latitude of the point location, in degrees. -90 to 90 degrees (negative values
             * south of equator).
             */
            fun lat(lat: Double) = lat(JsonField.of(lat))

            /**
             * Sets [Builder.lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

            /**
             * The planned alternate leg based on user-defined constraints, International Civil
             * Aviation Organization (ICAO) code preferred.
             */
            fun legAlternate(legAlternate: String) = legAlternate(JsonField.of(legAlternate))

            /**
             * Sets [Builder.legAlternate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legAlternate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legAlternate(legAlternate: JsonField<String>) = apply {
                this.legAlternate = legAlternate
            }

            /** The percent degrade due to drag for this aircraft for this leg. */
            fun legDragIndex(legDragIndex: Double) = legDragIndex(JsonField.of(legDragIndex))

            /**
             * Sets [Builder.legDragIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legDragIndex] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legDragIndex(legDragIndex: JsonField<Double>) = apply {
                this.legDragIndex = legDragIndex
            }

            /** The fuel degrade percentage used for this leg. */
            fun legFuelDegrade(legFuelDegrade: Double) =
                legFuelDegrade(JsonField.of(legFuelDegrade))

            /**
             * Sets [Builder.legFuelDegrade] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legFuelDegrade] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legFuelDegrade(legFuelDegrade: JsonField<Double>) = apply {
                this.legFuelDegrade = legFuelDegrade
            }

            /** The average Mach speed for this leg. */
            fun legMach(legMach: Double) = legMach(JsonField.of(legMach))

            /**
             * Sets [Builder.legMach] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legMach] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legMach(legMach: JsonField<Double>) = apply { this.legMach = legMach }

            /**
             * The mission index value for this leg. The mission index is the ratio of time-related
             * cost of aircraft operation to the cost of fuel.
             */
            fun legMsnIndex(legMsnIndex: Double) = legMsnIndex(JsonField.of(legMsnIndex))

            /**
             * Sets [Builder.legMsnIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legMsnIndex] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legMsnIndex(legMsnIndex: JsonField<Double>) = apply {
                this.legMsnIndex = legMsnIndex
            }

            /**
             * The wind factor for this leg in knots. A positive value indicates a headwind, while a
             * negative value indicates a tailwind.
             */
            fun legWindFac(legWindFac: Double) = legWindFac(JsonField.of(legWindFac))

            /**
             * Sets [Builder.legWindFac] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legWindFac] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legWindFac(legWindFac: JsonField<Double>) = apply { this.legWindFac = legWindFac }

            /**
             * WGS84 longitude of the point location, in degrees. -180 to 180 degrees (negative
             * values west of Prime Meridian).
             */
            fun lon(lon: Double) = lon(JsonField.of(lon))

            /**
             * Sets [Builder.lon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

            /** The magnetic course at leg midpoint in degrees from true north. */
            fun magCourse(magCourse: Double) = magCourse(JsonField.of(magCourse))

            /**
             * Sets [Builder.magCourse] to an arbitrary JSON value.
             *
             * You should usually call [Builder.magCourse] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun magCourse(magCourse: JsonField<Double>) = apply { this.magCourse = magCourse }

            /** The magnetic heading at leg midpoint in degrees from true north. */
            fun magHeading(magHeading: Double) = magHeading(JsonField.of(magHeading))

            /**
             * Sets [Builder.magHeading] to an arbitrary JSON value.
             *
             * You should usually call [Builder.magHeading] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun magHeading(magHeading: JsonField<Double>) = apply { this.magHeading = magHeading }

            /** The magnetic variation for this leg in degrees. */
            fun magVar(magVar: Double) = magVar(JsonField.of(magVar))

            /**
             * Sets [Builder.magVar] to an arbitrary JSON value.
             *
             * You should usually call [Builder.magVar] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun magVar(magVar: JsonField<Double>) = apply { this.magVar = magVar }

            /** Navigational Aid (NAVAID) identification code. */
            fun navaid(navaid: String) = navaid(JsonField.of(navaid))

            /**
             * Sets [Builder.navaid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.navaid] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun navaid(navaid: JsonField<String>) = apply { this.navaid = navaid }

            /**
             * The night low level altitude in feet above sea level for the leg ending at this
             * waypoint.
             */
            fun nightLowAlt(nightLowAlt: Double) = nightLowAlt(JsonField.of(nightLowAlt))

            /**
             * Sets [Builder.nightLowAlt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nightLowAlt] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nightLowAlt(nightLowAlt: JsonField<Double>) = apply {
                this.nightLowAlt = nightLowAlt
            }

            /**
             * The night vision goggle low level altitude in feet above sea level for the leg ending
             * at this waypoint.
             */
            fun nvgLowAlt(nvgLowAlt: Double) = nvgLowAlt(JsonField.of(nvgLowAlt))

            /**
             * Sets [Builder.nvgLowAlt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nvgLowAlt] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nvgLowAlt(nvgLowAlt: JsonField<Double>) = apply { this.nvgLowAlt = nvgLowAlt }

            /** The wind direction at this specific point in degrees from true north. */
            fun pointWindDir(pointWindDir: Double) = pointWindDir(JsonField.of(pointWindDir))

            /**
             * Sets [Builder.pointWindDir] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointWindDir] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pointWindDir(pointWindDir: JsonField<Double>) = apply {
                this.pointWindDir = pointWindDir
            }

            /** The wind velocity at this specific point in knots. */
            fun pointWindSpeed(pointWindSpeed: Double) =
                pointWindSpeed(JsonField.of(pointWindSpeed))

            /**
             * Sets [Builder.pointWindSpeed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointWindSpeed] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pointWindSpeed(pointWindSpeed: JsonField<Double>) = apply {
                this.pointWindSpeed = pointWindSpeed
            }

            /**
             * The primary UHF radio frequency used for the air refueling track or anchor in
             * megahertz.
             */
            fun priFreq(priFreq: Double) = priFreq(JsonField.of(priFreq))

            /**
             * Sets [Builder.priFreq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priFreq] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priFreq(priFreq: JsonField<Double>) = apply { this.priFreq = priFreq }

            /**
             * The secondary UHF radio frequency used for the air refueling track or anchor in
             * megahertz.
             */
            fun secFreq(secFreq: Double) = secFreq(JsonField.of(secFreq))

            /**
             * Sets [Builder.secFreq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secFreq] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secFreq(secFreq: JsonField<Double>) = apply { this.secFreq = secFreq }

            /** Tactical Air Navigation (TACAN) channel for the Navigational Aid (NAVAID). */
            fun tacanChannel(tacanChannel: String) = tacanChannel(JsonField.of(tacanChannel))

            /**
             * Sets [Builder.tacanChannel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tacanChannel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tacanChannel(tacanChannel: JsonField<String>) = apply {
                this.tacanChannel = tacanChannel
            }

            /**
             * Average temperature deviation from standard day profile for this leg in degrees
             * Celsius.
             */
            fun tempDev(tempDev: Double) = tempDev(JsonField.of(tempDev))

            /**
             * Sets [Builder.tempDev] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tempDev] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tempDev(tempDev: JsonField<Double>) = apply { this.tempDev = tempDev }

            /** The thunderstorm intensity classification for this flight (LIGHT, MODERATE, etc). */
            fun thunderCat(thunderCat: String) = thunderCat(JsonField.of(thunderCat))

            /**
             * Sets [Builder.thunderCat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thunderCat] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun thunderCat(thunderCat: JsonField<String>) = apply { this.thunderCat = thunderCat }

            /** The total air distance to this waypoint in nautical miles. */
            fun totalAirDistance(totalAirDistance: Double) =
                totalAirDistance(JsonField.of(totalAirDistance))

            /**
             * Sets [Builder.totalAirDistance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalAirDistance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalAirDistance(totalAirDistance: JsonField<Double>) = apply {
                this.totalAirDistance = totalAirDistance
            }

            /**
             * The total distance flown to this waypoint calculated from point of departure in
             * nautical miles.
             */
            fun totalFlownDistance(totalFlownDistance: Double) =
                totalFlownDistance(JsonField.of(totalFlownDistance))

            /**
             * Sets [Builder.totalFlownDistance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalFlownDistance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalFlownDistance(totalFlownDistance: JsonField<Double>) = apply {
                this.totalFlownDistance = totalFlownDistance
            }

            /**
             * The total distance remaining from this waypoint to the point of arrival in nautical
             * miles.
             */
            fun totalRemDistance(totalRemDistance: Double) =
                totalRemDistance(JsonField.of(totalRemDistance))

            /**
             * Sets [Builder.totalRemDistance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalRemDistance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalRemDistance(totalRemDistance: JsonField<Double>) = apply {
                this.totalRemDistance = totalRemDistance
            }

            /** The total fuel remaining at this waypoint in pounds. */
            fun totalRemFuel(totalRemFuel: Double) = totalRemFuel(JsonField.of(totalRemFuel))

            /**
             * Sets [Builder.totalRemFuel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalRemFuel] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalRemFuel(totalRemFuel: JsonField<Double>) = apply {
                this.totalRemFuel = totalRemFuel
            }

            /** The total time accumulated from takeoff to this waypoint expressed as HH:MM. */
            fun totalTime(totalTime: String) = totalTime(JsonField.of(totalTime))

            /**
             * Sets [Builder.totalTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalTime(totalTime: JsonField<String>) = apply { this.totalTime = totalTime }

            /**
             * The total time remaining from this waypoint to the point of arrival expressed as
             * HH:MM.
             */
            fun totalTimeRem(totalTimeRem: String) = totalTimeRem(JsonField.of(totalTimeRem))

            /**
             * Sets [Builder.totalTimeRem] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalTimeRem] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalTimeRem(totalTimeRem: JsonField<String>) = apply {
                this.totalTimeRem = totalTimeRem
            }

            /** The total fuel used to this waypoint from point of departure in pounds. */
            fun totalUsedFuel(totalUsedFuel: Double) = totalUsedFuel(JsonField.of(totalUsedFuel))

            /**
             * Sets [Builder.totalUsedFuel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalUsedFuel] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalUsedFuel(totalUsedFuel: JsonField<Double>) = apply {
                this.totalUsedFuel = totalUsedFuel
            }

            /** The total weight of the aircraft at this waypoint in pounds. */
            fun totalWeight(totalWeight: Double) = totalWeight(JsonField.of(totalWeight))

            /**
             * Sets [Builder.totalWeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalWeight] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalWeight(totalWeight: JsonField<Double>) = apply {
                this.totalWeight = totalWeight
            }

            /** The true course at leg midpoint in degrees from true north. */
            fun trueCourse(trueCourse: Double) = trueCourse(JsonField.of(trueCourse))

            /**
             * Sets [Builder.trueCourse] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trueCourse] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trueCourse(trueCourse: JsonField<Double>) = apply { this.trueCourse = trueCourse }

            /** The turbulence intensity classification for this flight (LIGHT, MODERATE, etc). */
            fun turbCat(turbCat: String) = turbCat(JsonField.of(turbCat))

            /**
             * Sets [Builder.turbCat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.turbCat] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun turbCat(turbCat: JsonField<String>) = apply { this.turbCat = turbCat }

            /**
             * VHF Omni-directional Range (VOR) frequency for the Navigational Aid (NAVAID) in
             * megahertz.
             */
            fun vorFreq(vorFreq: Double) = vorFreq(JsonField.of(vorFreq))

            /**
             * Sets [Builder.vorFreq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vorFreq] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vorFreq(vorFreq: JsonField<Double>) = apply { this.vorFreq = vorFreq }

            /** The waypoint number on the route. Comment points do not get a waypoint number. */
            fun waypointNum(waypointNum: Int) = waypointNum(JsonField.of(waypointNum))

            /**
             * Sets [Builder.waypointNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waypointNum] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waypointNum(waypointNum: JsonField<Int>) = apply { this.waypointNum = waypointNum }

            /** The zone/leg distance flown in nautical miles. */
            fun zoneDistance(zoneDistance: Double) = zoneDistance(JsonField.of(zoneDistance))

            /**
             * Sets [Builder.zoneDistance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zoneDistance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zoneDistance(zoneDistance: JsonField<Double>) = apply {
                this.zoneDistance = zoneDistance
            }

            /** The amount of fuel used on this zone/leg in pounds. */
            fun zoneFuel(zoneFuel: Double) = zoneFuel(JsonField.of(zoneFuel))

            /**
             * Sets [Builder.zoneFuel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zoneFuel] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zoneFuel(zoneFuel: JsonField<Double>) = apply { this.zoneFuel = zoneFuel }

            /** The time to fly this zone/leg in minutes. */
            fun zoneTime(zoneTime: Double) = zoneTime(JsonField.of(zoneTime))

            /**
             * Sets [Builder.zoneTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zoneTime] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zoneTime(zoneTime: JsonField<Double>) = apply { this.zoneTime = zoneTime }

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
             * Returns an immutable instance of [FlightPlanWaypoint].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * .waypointName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FlightPlanWaypoint =
                FlightPlanWaypoint(
                    checkRequired("type", type),
                    checkRequired("waypointName", waypointName),
                    aaTacanChannel,
                    airDistance,
                    airway,
                    alt,
                    arId,
                    arpt,
                    ata,
                    avgCalAirspeed,
                    avgDriftAng,
                    avgGroundSpeed,
                    avgTrueAirspeed,
                    avgWindDir,
                    avgWindSpeed,
                    dayLowAlt,
                    eta,
                    exchangedFuel,
                    fuelFlow,
                    iceCat,
                    lat,
                    legAlternate,
                    legDragIndex,
                    legFuelDegrade,
                    legMach,
                    legMsnIndex,
                    legWindFac,
                    lon,
                    magCourse,
                    magHeading,
                    magVar,
                    navaid,
                    nightLowAlt,
                    nvgLowAlt,
                    pointWindDir,
                    pointWindSpeed,
                    priFreq,
                    secFreq,
                    tacanChannel,
                    tempDev,
                    thunderCat,
                    totalAirDistance,
                    totalFlownDistance,
                    totalRemDistance,
                    totalRemFuel,
                    totalTime,
                    totalTimeRem,
                    totalUsedFuel,
                    totalWeight,
                    trueCourse,
                    turbCat,
                    vorFreq,
                    waypointNum,
                    zoneDistance,
                    zoneFuel,
                    zoneTime,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FlightPlanWaypoint = apply {
            if (validated) {
                return@apply
            }

            type()
            waypointName()
            aaTacanChannel()
            airDistance()
            airway()
            alt()
            arId()
            arpt()
            ata()
            avgCalAirspeed()
            avgDriftAng()
            avgGroundSpeed()
            avgTrueAirspeed()
            avgWindDir()
            avgWindSpeed()
            dayLowAlt()
            eta()
            exchangedFuel()
            fuelFlow()
            iceCat()
            lat()
            legAlternate()
            legDragIndex()
            legFuelDegrade()
            legMach()
            legMsnIndex()
            legWindFac()
            lon()
            magCourse()
            magHeading()
            magVar()
            navaid()
            nightLowAlt()
            nvgLowAlt()
            pointWindDir()
            pointWindSpeed()
            priFreq()
            secFreq()
            tacanChannel()
            tempDev()
            thunderCat()
            totalAirDistance()
            totalFlownDistance()
            totalRemDistance()
            totalRemFuel()
            totalTime()
            totalTimeRem()
            totalUsedFuel()
            totalWeight()
            trueCourse()
            turbCat()
            vorFreq()
            waypointNum()
            zoneDistance()
            zoneFuel()
            zoneTime()
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
            (if (type.asKnown().isPresent) 1 else 0) +
                (if (waypointName.asKnown().isPresent) 1 else 0) +
                (if (aaTacanChannel.asKnown().isPresent) 1 else 0) +
                (if (airDistance.asKnown().isPresent) 1 else 0) +
                (if (airway.asKnown().isPresent) 1 else 0) +
                (if (alt.asKnown().isPresent) 1 else 0) +
                (if (arId.asKnown().isPresent) 1 else 0) +
                (if (arpt.asKnown().isPresent) 1 else 0) +
                (if (ata.asKnown().isPresent) 1 else 0) +
                (if (avgCalAirspeed.asKnown().isPresent) 1 else 0) +
                (if (avgDriftAng.asKnown().isPresent) 1 else 0) +
                (if (avgGroundSpeed.asKnown().isPresent) 1 else 0) +
                (if (avgTrueAirspeed.asKnown().isPresent) 1 else 0) +
                (if (avgWindDir.asKnown().isPresent) 1 else 0) +
                (if (avgWindSpeed.asKnown().isPresent) 1 else 0) +
                (if (dayLowAlt.asKnown().isPresent) 1 else 0) +
                (if (eta.asKnown().isPresent) 1 else 0) +
                (if (exchangedFuel.asKnown().isPresent) 1 else 0) +
                (if (fuelFlow.asKnown().isPresent) 1 else 0) +
                (if (iceCat.asKnown().isPresent) 1 else 0) +
                (if (lat.asKnown().isPresent) 1 else 0) +
                (if (legAlternate.asKnown().isPresent) 1 else 0) +
                (if (legDragIndex.asKnown().isPresent) 1 else 0) +
                (if (legFuelDegrade.asKnown().isPresent) 1 else 0) +
                (if (legMach.asKnown().isPresent) 1 else 0) +
                (if (legMsnIndex.asKnown().isPresent) 1 else 0) +
                (if (legWindFac.asKnown().isPresent) 1 else 0) +
                (if (lon.asKnown().isPresent) 1 else 0) +
                (if (magCourse.asKnown().isPresent) 1 else 0) +
                (if (magHeading.asKnown().isPresent) 1 else 0) +
                (if (magVar.asKnown().isPresent) 1 else 0) +
                (if (navaid.asKnown().isPresent) 1 else 0) +
                (if (nightLowAlt.asKnown().isPresent) 1 else 0) +
                (if (nvgLowAlt.asKnown().isPresent) 1 else 0) +
                (if (pointWindDir.asKnown().isPresent) 1 else 0) +
                (if (pointWindSpeed.asKnown().isPresent) 1 else 0) +
                (if (priFreq.asKnown().isPresent) 1 else 0) +
                (if (secFreq.asKnown().isPresent) 1 else 0) +
                (if (tacanChannel.asKnown().isPresent) 1 else 0) +
                (if (tempDev.asKnown().isPresent) 1 else 0) +
                (if (thunderCat.asKnown().isPresent) 1 else 0) +
                (if (totalAirDistance.asKnown().isPresent) 1 else 0) +
                (if (totalFlownDistance.asKnown().isPresent) 1 else 0) +
                (if (totalRemDistance.asKnown().isPresent) 1 else 0) +
                (if (totalRemFuel.asKnown().isPresent) 1 else 0) +
                (if (totalTime.asKnown().isPresent) 1 else 0) +
                (if (totalTimeRem.asKnown().isPresent) 1 else 0) +
                (if (totalUsedFuel.asKnown().isPresent) 1 else 0) +
                (if (totalWeight.asKnown().isPresent) 1 else 0) +
                (if (trueCourse.asKnown().isPresent) 1 else 0) +
                (if (turbCat.asKnown().isPresent) 1 else 0) +
                (if (vorFreq.asKnown().isPresent) 1 else 0) +
                (if (waypointNum.asKnown().isPresent) 1 else 0) +
                (if (zoneDistance.asKnown().isPresent) 1 else 0) +
                (if (zoneFuel.asKnown().isPresent) 1 else 0) +
                (if (zoneTime.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FlightPlanWaypoint &&
                type == other.type &&
                waypointName == other.waypointName &&
                aaTacanChannel == other.aaTacanChannel &&
                airDistance == other.airDistance &&
                airway == other.airway &&
                alt == other.alt &&
                arId == other.arId &&
                arpt == other.arpt &&
                ata == other.ata &&
                avgCalAirspeed == other.avgCalAirspeed &&
                avgDriftAng == other.avgDriftAng &&
                avgGroundSpeed == other.avgGroundSpeed &&
                avgTrueAirspeed == other.avgTrueAirspeed &&
                avgWindDir == other.avgWindDir &&
                avgWindSpeed == other.avgWindSpeed &&
                dayLowAlt == other.dayLowAlt &&
                eta == other.eta &&
                exchangedFuel == other.exchangedFuel &&
                fuelFlow == other.fuelFlow &&
                iceCat == other.iceCat &&
                lat == other.lat &&
                legAlternate == other.legAlternate &&
                legDragIndex == other.legDragIndex &&
                legFuelDegrade == other.legFuelDegrade &&
                legMach == other.legMach &&
                legMsnIndex == other.legMsnIndex &&
                legWindFac == other.legWindFac &&
                lon == other.lon &&
                magCourse == other.magCourse &&
                magHeading == other.magHeading &&
                magVar == other.magVar &&
                navaid == other.navaid &&
                nightLowAlt == other.nightLowAlt &&
                nvgLowAlt == other.nvgLowAlt &&
                pointWindDir == other.pointWindDir &&
                pointWindSpeed == other.pointWindSpeed &&
                priFreq == other.priFreq &&
                secFreq == other.secFreq &&
                tacanChannel == other.tacanChannel &&
                tempDev == other.tempDev &&
                thunderCat == other.thunderCat &&
                totalAirDistance == other.totalAirDistance &&
                totalFlownDistance == other.totalFlownDistance &&
                totalRemDistance == other.totalRemDistance &&
                totalRemFuel == other.totalRemFuel &&
                totalTime == other.totalTime &&
                totalTimeRem == other.totalTimeRem &&
                totalUsedFuel == other.totalUsedFuel &&
                totalWeight == other.totalWeight &&
                trueCourse == other.trueCourse &&
                turbCat == other.turbCat &&
                vorFreq == other.vorFreq &&
                waypointNum == other.waypointNum &&
                zoneDistance == other.zoneDistance &&
                zoneFuel == other.zoneFuel &&
                zoneTime == other.zoneTime &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                type,
                waypointName,
                aaTacanChannel,
                airDistance,
                airway,
                alt,
                arId,
                arpt,
                ata,
                avgCalAirspeed,
                avgDriftAng,
                avgGroundSpeed,
                avgTrueAirspeed,
                avgWindDir,
                avgWindSpeed,
                dayLowAlt,
                eta,
                exchangedFuel,
                fuelFlow,
                iceCat,
                lat,
                legAlternate,
                legDragIndex,
                legFuelDegrade,
                legMach,
                legMsnIndex,
                legWindFac,
                lon,
                magCourse,
                magHeading,
                magVar,
                navaid,
                nightLowAlt,
                nvgLowAlt,
                pointWindDir,
                pointWindSpeed,
                priFreq,
                secFreq,
                tacanChannel,
                tempDev,
                thunderCat,
                totalAirDistance,
                totalFlownDistance,
                totalRemDistance,
                totalRemFuel,
                totalTime,
                totalTimeRem,
                totalUsedFuel,
                totalWeight,
                trueCourse,
                turbCat,
                vorFreq,
                waypointNum,
                zoneDistance,
                zoneFuel,
                zoneTime,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FlightPlanWaypoint{type=$type, waypointName=$waypointName, aaTacanChannel=$aaTacanChannel, airDistance=$airDistance, airway=$airway, alt=$alt, arId=$arId, arpt=$arpt, ata=$ata, avgCalAirspeed=$avgCalAirspeed, avgDriftAng=$avgDriftAng, avgGroundSpeed=$avgGroundSpeed, avgTrueAirspeed=$avgTrueAirspeed, avgWindDir=$avgWindDir, avgWindSpeed=$avgWindSpeed, dayLowAlt=$dayLowAlt, eta=$eta, exchangedFuel=$exchangedFuel, fuelFlow=$fuelFlow, iceCat=$iceCat, lat=$lat, legAlternate=$legAlternate, legDragIndex=$legDragIndex, legFuelDegrade=$legFuelDegrade, legMach=$legMach, legMsnIndex=$legMsnIndex, legWindFac=$legWindFac, lon=$lon, magCourse=$magCourse, magHeading=$magHeading, magVar=$magVar, navaid=$navaid, nightLowAlt=$nightLowAlt, nvgLowAlt=$nvgLowAlt, pointWindDir=$pointWindDir, pointWindSpeed=$pointWindSpeed, priFreq=$priFreq, secFreq=$secFreq, tacanChannel=$tacanChannel, tempDev=$tempDev, thunderCat=$thunderCat, totalAirDistance=$totalAirDistance, totalFlownDistance=$totalFlownDistance, totalRemDistance=$totalRemDistance, totalRemFuel=$totalRemFuel, totalTime=$totalTime, totalTimeRem=$totalTimeRem, totalUsedFuel=$totalUsedFuel, totalWeight=$totalWeight, trueCourse=$trueCourse, turbCat=$turbCat, vorFreq=$vorFreq, waypointNum=$waypointNum, zoneDistance=$zoneDistance, zoneFuel=$zoneFuel, zoneTime=$zoneTime, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FlightPlanFull &&
            arrAirfield == other.arrAirfield &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            depAirfield == other.depAirfield &&
            genTs == other.genTs &&
            source == other.source &&
            id == other.id &&
            aircraftMds == other.aircraftMds &&
            airRefuelEvents == other.airRefuelEvents &&
            amcMissionId == other.amcMissionId &&
            appLandingFuel == other.appLandingFuel &&
            arrAlternate1 == other.arrAlternate1 &&
            arrAlternate1Fuel == other.arrAlternate1Fuel &&
            arrAlternate2 == other.arrAlternate2 &&
            arrAlternate2Fuel == other.arrAlternate2Fuel &&
            arrIceFuel == other.arrIceFuel &&
            arrRunway == other.arrRunway &&
            atcAddresses == other.atcAddresses &&
            avgTempDev == other.avgTempDev &&
            burnedFuel == other.burnedFuel &&
            callSign == other.callSign &&
            cargoRemark == other.cargoRemark &&
            climbFuel == other.climbFuel &&
            climbTime == other.climbTime &&
            contingencyFuel == other.contingencyFuel &&
            countryCodes == other.countryCodes &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            depAlternate == other.depAlternate &&
            depressFuel == other.depressFuel &&
            depRunway == other.depRunway &&
            dragIndex == other.dragIndex &&
            earlyDescentFuel == other.earlyDescentFuel &&
            enduranceTime == other.enduranceTime &&
            enrouteFuel == other.enrouteFuel &&
            enrouteTime == other.enrouteTime &&
            equipment == other.equipment &&
            estDepTime == other.estDepTime &&
            etopsAirfields == other.etopsAirfields &&
            etopsAltAirfields == other.etopsAltAirfields &&
            etopsRating == other.etopsRating &&
            etopsValWindow == other.etopsValWindow &&
            externalId == other.externalId &&
            flightPlanMessages == other.flightPlanMessages &&
            flightPlanPointGroups == other.flightPlanPointGroups &&
            flightPlanWaypoints == other.flightPlanWaypoints &&
            flightRules == other.flightRules &&
            flightType == other.flightType &&
            fuelDegrade == other.fuelDegrade &&
            gpsRaim == other.gpsRaim &&
            holdDownFuel == other.holdDownFuel &&
            holdFuel == other.holdFuel &&
            holdTime == other.holdTime &&
            idAircraft == other.idAircraft &&
            idArrAirfield == other.idArrAirfield &&
            idDepAirfield == other.idDepAirfield &&
            identExtraFuel == other.identExtraFuel &&
            idSortie == other.idSortie &&
            initialCruiseSpeed == other.initialCruiseSpeed &&
            initialFlightLevel == other.initialFlightLevel &&
            landingFuel == other.landingFuel &&
            legNum == other.legNum &&
            minDivertFuel == other.minDivertFuel &&
            msnIndex == other.msnIndex &&
            notes == other.notes &&
            numAircraft == other.numAircraft &&
            opConditionFuel == other.opConditionFuel &&
            opWeight == other.opWeight &&
            origin == other.origin &&
            originator == other.originator &&
            origNetwork == other.origNetwork &&
            plannerRemark == other.plannerRemark &&
            rampFuel == other.rampFuel &&
            remAlternate1Fuel == other.remAlternate1Fuel &&
            remAlternate2Fuel == other.remAlternate2Fuel &&
            reserveFuel == other.reserveFuel &&
            routeString == other.routeString &&
            sid == other.sid &&
            sourceDl == other.sourceDl &&
            star == other.star &&
            status == other.status &&
            tailNumber == other.tailNumber &&
            takeoffFuel == other.takeoffFuel &&
            taxiFuel == other.taxiFuel &&
            thunderAvoidFuel == other.thunderAvoidFuel &&
            tocFuel == other.tocFuel &&
            tocIceFuel == other.tocIceFuel &&
            todFuel == other.todFuel &&
            todIceFuel == other.todIceFuel &&
            unidentExtraFuel == other.unidentExtraFuel &&
            unusableFuel == other.unusableFuel &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            wakeTurbCat == other.wakeTurbCat &&
            windFac1 == other.windFac1 &&
            windFac2 == other.windFac2 &&
            windFacAvg == other.windFacAvg &&
            wxValidEnd == other.wxValidEnd &&
            wxValidStart == other.wxValidStart &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            arrAirfield,
            classificationMarking,
            dataMode,
            depAirfield,
            genTs,
            source,
            id,
            aircraftMds,
            airRefuelEvents,
            amcMissionId,
            appLandingFuel,
            arrAlternate1,
            arrAlternate1Fuel,
            arrAlternate2,
            arrAlternate2Fuel,
            arrIceFuel,
            arrRunway,
            atcAddresses,
            avgTempDev,
            burnedFuel,
            callSign,
            cargoRemark,
            climbFuel,
            climbTime,
            contingencyFuel,
            countryCodes,
            createdAt,
            createdBy,
            depAlternate,
            depressFuel,
            depRunway,
            dragIndex,
            earlyDescentFuel,
            enduranceTime,
            enrouteFuel,
            enrouteTime,
            equipment,
            estDepTime,
            etopsAirfields,
            etopsAltAirfields,
            etopsRating,
            etopsValWindow,
            externalId,
            flightPlanMessages,
            flightPlanPointGroups,
            flightPlanWaypoints,
            flightRules,
            flightType,
            fuelDegrade,
            gpsRaim,
            holdDownFuel,
            holdFuel,
            holdTime,
            idAircraft,
            idArrAirfield,
            idDepAirfield,
            identExtraFuel,
            idSortie,
            initialCruiseSpeed,
            initialFlightLevel,
            landingFuel,
            legNum,
            minDivertFuel,
            msnIndex,
            notes,
            numAircraft,
            opConditionFuel,
            opWeight,
            origin,
            originator,
            origNetwork,
            plannerRemark,
            rampFuel,
            remAlternate1Fuel,
            remAlternate2Fuel,
            reserveFuel,
            routeString,
            sid,
            sourceDl,
            star,
            status,
            tailNumber,
            takeoffFuel,
            taxiFuel,
            thunderAvoidFuel,
            tocFuel,
            tocIceFuel,
            todFuel,
            todIceFuel,
            unidentExtraFuel,
            unusableFuel,
            updatedAt,
            updatedBy,
            wakeTurbCat,
            windFac1,
            windFac2,
            windFacAvg,
            wxValidEnd,
            wxValidStart,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FlightPlanFull{arrAirfield=$arrAirfield, classificationMarking=$classificationMarking, dataMode=$dataMode, depAirfield=$depAirfield, genTs=$genTs, source=$source, id=$id, aircraftMds=$aircraftMds, airRefuelEvents=$airRefuelEvents, amcMissionId=$amcMissionId, appLandingFuel=$appLandingFuel, arrAlternate1=$arrAlternate1, arrAlternate1Fuel=$arrAlternate1Fuel, arrAlternate2=$arrAlternate2, arrAlternate2Fuel=$arrAlternate2Fuel, arrIceFuel=$arrIceFuel, arrRunway=$arrRunway, atcAddresses=$atcAddresses, avgTempDev=$avgTempDev, burnedFuel=$burnedFuel, callSign=$callSign, cargoRemark=$cargoRemark, climbFuel=$climbFuel, climbTime=$climbTime, contingencyFuel=$contingencyFuel, countryCodes=$countryCodes, createdAt=$createdAt, createdBy=$createdBy, depAlternate=$depAlternate, depressFuel=$depressFuel, depRunway=$depRunway, dragIndex=$dragIndex, earlyDescentFuel=$earlyDescentFuel, enduranceTime=$enduranceTime, enrouteFuel=$enrouteFuel, enrouteTime=$enrouteTime, equipment=$equipment, estDepTime=$estDepTime, etopsAirfields=$etopsAirfields, etopsAltAirfields=$etopsAltAirfields, etopsRating=$etopsRating, etopsValWindow=$etopsValWindow, externalId=$externalId, flightPlanMessages=$flightPlanMessages, flightPlanPointGroups=$flightPlanPointGroups, flightPlanWaypoints=$flightPlanWaypoints, flightRules=$flightRules, flightType=$flightType, fuelDegrade=$fuelDegrade, gpsRaim=$gpsRaim, holdDownFuel=$holdDownFuel, holdFuel=$holdFuel, holdTime=$holdTime, idAircraft=$idAircraft, idArrAirfield=$idArrAirfield, idDepAirfield=$idDepAirfield, identExtraFuel=$identExtraFuel, idSortie=$idSortie, initialCruiseSpeed=$initialCruiseSpeed, initialFlightLevel=$initialFlightLevel, landingFuel=$landingFuel, legNum=$legNum, minDivertFuel=$minDivertFuel, msnIndex=$msnIndex, notes=$notes, numAircraft=$numAircraft, opConditionFuel=$opConditionFuel, opWeight=$opWeight, origin=$origin, originator=$originator, origNetwork=$origNetwork, plannerRemark=$plannerRemark, rampFuel=$rampFuel, remAlternate1Fuel=$remAlternate1Fuel, remAlternate2Fuel=$remAlternate2Fuel, reserveFuel=$reserveFuel, routeString=$routeString, sid=$sid, sourceDl=$sourceDl, star=$star, status=$status, tailNumber=$tailNumber, takeoffFuel=$takeoffFuel, taxiFuel=$taxiFuel, thunderAvoidFuel=$thunderAvoidFuel, tocFuel=$tocFuel, tocIceFuel=$tocIceFuel, todFuel=$todFuel, todIceFuel=$todIceFuel, unidentExtraFuel=$unidentExtraFuel, unusableFuel=$unusableFuel, updatedAt=$updatedAt, updatedBy=$updatedBy, wakeTurbCat=$wakeTurbCat, windFac1=$windFac1, windFac2=$windFac2, windFacAvg=$windFacAvg, wxValidEnd=$wxValidEnd, wxValidStart=$wxValidStart, additionalProperties=$additionalProperties}"
}

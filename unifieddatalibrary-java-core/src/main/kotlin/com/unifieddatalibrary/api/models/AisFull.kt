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
 * Self-reported information obtained from Automatic Identification System (AIS) equipment. This
 * contains information such as unique identification, status, position, course, and speed. The AIS
 * is an automatic tracking system that uses transceivers on ships and is used by vessel traffic
 * services. Although technically and operationally distinct, the AIS system is analogous to ADS-B
 * that performs a similar function for aircraft. AIS is intended to assist a vessel's watchstanding
 * officers and allow maritime authorities to track and monitor vessel movements. AIS integrates a
 * standardized VHF transceiver with a positioning system such as Global Positioning System
 * receiver, with other electronic navigation sensors, such as gyrocompass or rate of turn
 * indicator. Vessels fitted with AIS transceivers can be tracked by AIS base stations located along
 * coast lines or, when out of range of terrestrial networks, through a growing number of satellites
 * that are fitted with special AIS receivers which are capable of deconflicting a large number of
 * signatures.
 */
class AisFull
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val ts: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val antennaRefDimensions: JsonField<List<Double>>,
    private val avgSpeed: JsonField<Double>,
    private val callSign: JsonField<String>,
    private val cargoType: JsonField<String>,
    private val course: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val currentPortGuid: JsonField<String>,
    private val currentPortLocode: JsonField<String>,
    private val destination: JsonField<String>,
    private val destinationEta: JsonField<OffsetDateTime>,
    private val distanceToGo: JsonField<Double>,
    private val distanceTravelled: JsonField<Double>,
    private val draught: JsonField<Double>,
    private val engagedIn: JsonField<String>,
    private val etaCalculated: JsonField<OffsetDateTime>,
    private val etaUpdated: JsonField<OffsetDateTime>,
    private val idTrack: JsonField<String>,
    private val idVessel: JsonField<String>,
    private val imon: JsonField<Long>,
    private val lastPortGuid: JsonField<String>,
    private val lastPortLocode: JsonField<String>,
    private val lat: JsonField<Double>,
    private val length: JsonField<Double>,
    private val lon: JsonField<Double>,
    private val maxSpeed: JsonField<Double>,
    private val mmsi: JsonField<Long>,
    private val navStatus: JsonField<String>,
    private val nextPortGuid: JsonField<String>,
    private val nextPortLocode: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val posDeviceType: JsonField<String>,
    private val posHiAccuracy: JsonField<Boolean>,
    private val posHiLatency: JsonField<Boolean>,
    private val rateOfTurn: JsonField<Double>,
    private val shipDescription: JsonField<String>,
    private val shipName: JsonField<String>,
    private val shipType: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val specialCraft: JsonField<String>,
    private val specialManeuver: JsonField<Boolean>,
    private val speed: JsonField<Double>,
    private val trueHeading: JsonField<Double>,
    private val vesselFlag: JsonField<String>,
    private val width: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ts") @ExcludeMissing ts: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("antennaRefDimensions")
        @ExcludeMissing
        antennaRefDimensions: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("avgSpeed") @ExcludeMissing avgSpeed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("callSign") @ExcludeMissing callSign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cargoType") @ExcludeMissing cargoType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("course") @ExcludeMissing course: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currentPortGUID")
        @ExcludeMissing
        currentPortGuid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currentPortLOCODE")
        @ExcludeMissing
        currentPortLocode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destinationETA")
        @ExcludeMissing
        destinationEta: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("distanceToGo")
        @ExcludeMissing
        distanceToGo: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("distanceTravelled")
        @ExcludeMissing
        distanceTravelled: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("draught") @ExcludeMissing draught: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("engagedIn") @ExcludeMissing engagedIn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("etaCalculated")
        @ExcludeMissing
        etaCalculated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("etaUpdated")
        @ExcludeMissing
        etaUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("idTrack") @ExcludeMissing idTrack: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idVessel") @ExcludeMissing idVessel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("imon") @ExcludeMissing imon: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("lastPortGUID")
        @ExcludeMissing
        lastPortGuid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastPortLOCODE")
        @ExcludeMissing
        lastPortLocode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("length") @ExcludeMissing length: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxSpeed") @ExcludeMissing maxSpeed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("mmsi") @ExcludeMissing mmsi: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("navStatus") @ExcludeMissing navStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nextPortGUID")
        @ExcludeMissing
        nextPortGuid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nextPortLOCODE")
        @ExcludeMissing
        nextPortLocode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("posDeviceType")
        @ExcludeMissing
        posDeviceType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("posHiAccuracy")
        @ExcludeMissing
        posHiAccuracy: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("posHiLatency")
        @ExcludeMissing
        posHiLatency: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rateOfTurn")
        @ExcludeMissing
        rateOfTurn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("shipDescription")
        @ExcludeMissing
        shipDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipName") @ExcludeMissing shipName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipType") @ExcludeMissing shipType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("specialCraft")
        @ExcludeMissing
        specialCraft: JsonField<String> = JsonMissing.of(),
        @JsonProperty("specialManeuver")
        @ExcludeMissing
        specialManeuver: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("speed") @ExcludeMissing speed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trueHeading")
        @ExcludeMissing
        trueHeading: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("vesselFlag")
        @ExcludeMissing
        vesselFlag: JsonField<String> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        ts,
        id,
        antennaRefDimensions,
        avgSpeed,
        callSign,
        cargoType,
        course,
        createdAt,
        createdBy,
        currentPortGuid,
        currentPortLocode,
        destination,
        destinationEta,
        distanceToGo,
        distanceTravelled,
        draught,
        engagedIn,
        etaCalculated,
        etaUpdated,
        idTrack,
        idVessel,
        imon,
        lastPortGuid,
        lastPortLocode,
        lat,
        length,
        lon,
        maxSpeed,
        mmsi,
        navStatus,
        nextPortGuid,
        nextPortLocode,
        origin,
        origNetwork,
        posDeviceType,
        posHiAccuracy,
        posHiLatency,
        rateOfTurn,
        shipDescription,
        shipName,
        shipType,
        sourceDl,
        specialCraft,
        specialManeuver,
        speed,
        trueHeading,
        vesselFlag,
        width,
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
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The timestamp that the vessel position was recorded, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ts(): OffsetDateTime = ts.getRequired("ts")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The reference dimensions of the vessel, reported as [A, B, C, D], in meters. Where the array
     * values represent the distance fore (A), aft (B), to port (C), and to starboard (D) of the
     * navigation antenna. Array with values A = C = 0 and B, D > 0 indicate the length (B) and
     * width (D) of the vessel without antenna position reference.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun antennaRefDimensions(): Optional<List<Double>> =
        antennaRefDimensions.getOptional("antennaRefDimensions")

    /**
     * The average speed, in kilometers/hour, calculated for the subject vessel during the latest
     * voyage (port to port).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avgSpeed(): Optional<Double> = avgSpeed.getOptional("avgSpeed")

    /**
     * A uniquely designated identifier for the vessel's transmitter station.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun callSign(): Optional<String> = callSign.getOptional("callSign")

    /**
     * The reported cargo type. Intended as, but not constrained to, the USCG NAVCEN AIS cargo
     * definitions. Users should refer to USCG Navigation Center documentation for specific
     * definitions associated with ship and cargo types. USCG NAVCEN documentation may be found at
     * https://www.navcen.uscg.gov.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cargoType(): Optional<String> = cargoType.getOptional("cargoType")

    /**
     * The course-over-ground reported by the vessel, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun course(): Optional<Double> = course.getOptional("course")

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
     * The US Geographic Unique Identifier of the current port hosting the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun currentPortGuid(): Optional<String> = currentPortGuid.getOptional("currentPortGUID")

    /**
     * The UN Location Code of the current port hosting the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun currentPortLocode(): Optional<String> = currentPortLocode.getOptional("currentPortLOCODE")

    /**
     * The destination of the vessel according to the AIS transmission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun destination(): Optional<String> = destination.getOptional("destination")

    /**
     * The Estimated Time of Arrival of the vessel at the destination, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun destinationEta(): Optional<OffsetDateTime> = destinationEta.getOptional("destinationETA")

    /**
     * The remaining distance, in kilometers, for the vessel to reach the reported destination.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun distanceToGo(): Optional<Double> = distanceToGo.getOptional("distanceToGo")

    /**
     * The distance, in kilometers, that the vessel has travelled since departing the last port.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun distanceTravelled(): Optional<Double> = distanceTravelled.getOptional("distanceTravelled")

    /**
     * The maximum static draught, in meters, of the vessel according to the AIS transmission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun draught(): Optional<Double> = draught.getOptional("draught")

    /**
     * The activity that the vessel is engaged in. This entry applies only when the shipType =
     * Other.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun engagedIn(): Optional<String> = engagedIn.getOptional("engagedIn")

    /**
     * The Estimated Time of Arrival of the vessel at the destination port, according to
     * MarineTraffic calculations, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun etaCalculated(): Optional<OffsetDateTime> = etaCalculated.getOptional("etaCalculated")

    /**
     * The date and time that the ETA was calculated by MarineTraffic, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun etaUpdated(): Optional<OffsetDateTime> = etaUpdated.getOptional("etaUpdated")

    /**
     * Unique identifier of the Track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idTrack(): Optional<String> = idTrack.getOptional("idTrack")

    /**
     * Unique identifier of the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idVessel(): Optional<String> = idVessel.getOptional("idVessel")

    /**
     * The International Maritime Organization Number of the vessel. IMON is a seven-digit number
     * that uniquely identifies the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun imon(): Optional<Long> = imon.getOptional("imon")

    /**
     * The US Geographic Unique Identifier of the last port visited by the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lastPortGuid(): Optional<String> = lastPortGuid.getOptional("lastPortGUID")

    /**
     * The UN Location Code of the last port visited by the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lastPortLocode(): Optional<String> = lastPortLocode.getOptional("lastPortLOCODE")

    /**
     * WGS-84 latitude of the vessel position, in degrees. -90 to 90 degrees (negative values south
     * of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lat(): Optional<Double> = lat.getOptional("lat")

    /**
     * The overall length of the vessel, in meters. A value of 511 indicates a vessel length of 511
     * meters or greater.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun length(): Optional<Double> = length.getOptional("length")

    /**
     * WGS-84 longitude of the vessel position, in degrees. -180 to 180 degrees (negative values
     * west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lon(): Optional<Double> = lon.getOptional("lon")

    /**
     * The maximum speed, in kilometers/hour, reported by the subject vessel during the latest
     * voyage (port to port).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxSpeed(): Optional<Double> = maxSpeed.getOptional("maxSpeed")

    /**
     * The Maritime Mobile Service Identity of the vessel. MMSI is a nine-digit number that
     * identifies the transmitter station of the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mmsi(): Optional<Long> = mmsi.getOptional("mmsi")

    /**
     * The AIS Navigational Status of the vessel (e.g. Underway Using Engine, Moored, Aground,
     * etc.). Intended as, but not constrained to, the USCG NAVCEN navigation status definitions.
     * Users should refer to USCG Navigation Center documentation for specific definitions
     * associated with navigation status. USCG NAVCEN documentation may be found at
     * https://www.navcen.uscg.gov.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun navStatus(): Optional<String> = navStatus.getOptional("navStatus")

    /**
     * The US Geographic Unique Identifier of the next destination port of the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nextPortGuid(): Optional<String> = nextPortGuid.getOptional("nextPortGUID")

    /**
     * The UN Location Code of the next destination port of the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nextPortLocode(): Optional<String> = nextPortLocode.getOptional("nextPortLOCODE")

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
     * The type of electronic position fixing device (e.g. GPS, GLONASS, etc.). Intended as, but not
     * constrained to, the USCG NAVCEN electronic position fixing device definitions. Users should
     * refer to USCG Navigation Center documentation for specific device type information. USCG
     * NAVCEN documentation may be found at https://www.navcen.uscg.gov.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun posDeviceType(): Optional<String> = posDeviceType.getOptional("posDeviceType")

    /**
     * Flag indicating high reported position accuracy (less than or equal to 10 meters). A value of
     * 0/false indicates low accuracy (greater than 10 meters).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun posHiAccuracy(): Optional<Boolean> = posHiAccuracy.getOptional("posHiAccuracy")

    /**
     * Flag indicating high reported position latency (greater than 5 seconds). A value of 0/false
     * indicates low latency (less than 5 seconds).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun posHiLatency(): Optional<Boolean> = posHiLatency.getOptional("posHiLatency")

    /**
     * The Rate-of-Turn for the vessel, in degrees/minute. Positive value indicates that the vessel
     * is turning right.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rateOfTurn(): Optional<Double> = rateOfTurn.getOptional("rateOfTurn")

    /**
     * Further description or explanation of the vessel or type.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shipDescription(): Optional<String> = shipDescription.getOptional("shipDescription")

    /**
     * The name of the vessel. Vessel names that exceed the AIS 20 character are shortened (not
     * truncated) to 15 character-spaces, followed by an underscore and the last 4 characters-spaces
     * of the vessel full name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shipName(): Optional<String> = shipName.getOptional("shipName")

    /**
     * The reported ship type (e.g. Passenger, Tanker, Cargo, Other, etc.). See the engagedIn and
     * specialCraft entries for additional information on certain types of vessels.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shipType(): Optional<String> = shipType.getOptional("shipType")

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
     * The type of special craft designation of the vessel. This entry applies only when the
     * shipType = Special Craft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun specialCraft(): Optional<String> = specialCraft.getOptional("specialCraft")

    /**
     * Flag indicating that the vessel is engaged in a special maneuver (e.g. Waterway Navigation).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun specialManeuver(): Optional<Boolean> = specialManeuver.getOptional("specialManeuver")

    /**
     * The speed-over-ground reported by the vessel, in kilometers/hour.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun speed(): Optional<Double> = speed.getOptional("speed")

    /**
     * The true heading reported by the vessel, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trueHeading(): Optional<Double> = trueHeading.getOptional("trueHeading")

    /**
     * The flag of the subject vessel according to AIS transmission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vesselFlag(): Optional<String> = vesselFlag.getOptional("vesselFlag")

    /**
     * The breadth of the vessel, in meters. A value of 63 indicates a vessel breadth of 63 meters
     * or greater.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun width(): Optional<Double> = width.getOptional("width")

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
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [ts].
     *
     * Unlike [ts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ts") @ExcludeMissing fun _ts(): JsonField<OffsetDateTime> = ts

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [antennaRefDimensions].
     *
     * Unlike [antennaRefDimensions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("antennaRefDimensions")
    @ExcludeMissing
    fun _antennaRefDimensions(): JsonField<List<Double>> = antennaRefDimensions

    /**
     * Returns the raw JSON value of [avgSpeed].
     *
     * Unlike [avgSpeed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avgSpeed") @ExcludeMissing fun _avgSpeed(): JsonField<Double> = avgSpeed

    /**
     * Returns the raw JSON value of [callSign].
     *
     * Unlike [callSign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callSign") @ExcludeMissing fun _callSign(): JsonField<String> = callSign

    /**
     * Returns the raw JSON value of [cargoType].
     *
     * Unlike [cargoType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cargoType") @ExcludeMissing fun _cargoType(): JsonField<String> = cargoType

    /**
     * Returns the raw JSON value of [course].
     *
     * Unlike [course], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("course") @ExcludeMissing fun _course(): JsonField<Double> = course

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
     * Returns the raw JSON value of [currentPortGuid].
     *
     * Unlike [currentPortGuid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currentPortGUID")
    @ExcludeMissing
    fun _currentPortGuid(): JsonField<String> = currentPortGuid

    /**
     * Returns the raw JSON value of [currentPortLocode].
     *
     * Unlike [currentPortLocode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("currentPortLOCODE")
    @ExcludeMissing
    fun _currentPortLocode(): JsonField<String> = currentPortLocode

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonField<String> = destination

    /**
     * Returns the raw JSON value of [destinationEta].
     *
     * Unlike [destinationEta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destinationETA")
    @ExcludeMissing
    fun _destinationEta(): JsonField<OffsetDateTime> = destinationEta

    /**
     * Returns the raw JSON value of [distanceToGo].
     *
     * Unlike [distanceToGo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("distanceToGo")
    @ExcludeMissing
    fun _distanceToGo(): JsonField<Double> = distanceToGo

    /**
     * Returns the raw JSON value of [distanceTravelled].
     *
     * Unlike [distanceTravelled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("distanceTravelled")
    @ExcludeMissing
    fun _distanceTravelled(): JsonField<Double> = distanceTravelled

    /**
     * Returns the raw JSON value of [draught].
     *
     * Unlike [draught], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("draught") @ExcludeMissing fun _draught(): JsonField<Double> = draught

    /**
     * Returns the raw JSON value of [engagedIn].
     *
     * Unlike [engagedIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("engagedIn") @ExcludeMissing fun _engagedIn(): JsonField<String> = engagedIn

    /**
     * Returns the raw JSON value of [etaCalculated].
     *
     * Unlike [etaCalculated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("etaCalculated")
    @ExcludeMissing
    fun _etaCalculated(): JsonField<OffsetDateTime> = etaCalculated

    /**
     * Returns the raw JSON value of [etaUpdated].
     *
     * Unlike [etaUpdated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("etaUpdated")
    @ExcludeMissing
    fun _etaUpdated(): JsonField<OffsetDateTime> = etaUpdated

    /**
     * Returns the raw JSON value of [idTrack].
     *
     * Unlike [idTrack], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idTrack") @ExcludeMissing fun _idTrack(): JsonField<String> = idTrack

    /**
     * Returns the raw JSON value of [idVessel].
     *
     * Unlike [idVessel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idVessel") @ExcludeMissing fun _idVessel(): JsonField<String> = idVessel

    /**
     * Returns the raw JSON value of [imon].
     *
     * Unlike [imon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imon") @ExcludeMissing fun _imon(): JsonField<Long> = imon

    /**
     * Returns the raw JSON value of [lastPortGuid].
     *
     * Unlike [lastPortGuid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastPortGUID")
    @ExcludeMissing
    fun _lastPortGuid(): JsonField<String> = lastPortGuid

    /**
     * Returns the raw JSON value of [lastPortLocode].
     *
     * Unlike [lastPortLocode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastPortLOCODE")
    @ExcludeMissing
    fun _lastPortLocode(): JsonField<String> = lastPortLocode

    /**
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

    /**
     * Returns the raw JSON value of [length].
     *
     * Unlike [length], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Double> = length

    /**
     * Returns the raw JSON value of [lon].
     *
     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

    /**
     * Returns the raw JSON value of [maxSpeed].
     *
     * Unlike [maxSpeed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxSpeed") @ExcludeMissing fun _maxSpeed(): JsonField<Double> = maxSpeed

    /**
     * Returns the raw JSON value of [mmsi].
     *
     * Unlike [mmsi], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mmsi") @ExcludeMissing fun _mmsi(): JsonField<Long> = mmsi

    /**
     * Returns the raw JSON value of [navStatus].
     *
     * Unlike [navStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("navStatus") @ExcludeMissing fun _navStatus(): JsonField<String> = navStatus

    /**
     * Returns the raw JSON value of [nextPortGuid].
     *
     * Unlike [nextPortGuid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nextPortGUID")
    @ExcludeMissing
    fun _nextPortGuid(): JsonField<String> = nextPortGuid

    /**
     * Returns the raw JSON value of [nextPortLocode].
     *
     * Unlike [nextPortLocode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nextPortLOCODE")
    @ExcludeMissing
    fun _nextPortLocode(): JsonField<String> = nextPortLocode

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
     * Returns the raw JSON value of [posDeviceType].
     *
     * Unlike [posDeviceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("posDeviceType")
    @ExcludeMissing
    fun _posDeviceType(): JsonField<String> = posDeviceType

    /**
     * Returns the raw JSON value of [posHiAccuracy].
     *
     * Unlike [posHiAccuracy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("posHiAccuracy")
    @ExcludeMissing
    fun _posHiAccuracy(): JsonField<Boolean> = posHiAccuracy

    /**
     * Returns the raw JSON value of [posHiLatency].
     *
     * Unlike [posHiLatency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("posHiLatency")
    @ExcludeMissing
    fun _posHiLatency(): JsonField<Boolean> = posHiLatency

    /**
     * Returns the raw JSON value of [rateOfTurn].
     *
     * Unlike [rateOfTurn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rateOfTurn") @ExcludeMissing fun _rateOfTurn(): JsonField<Double> = rateOfTurn

    /**
     * Returns the raw JSON value of [shipDescription].
     *
     * Unlike [shipDescription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipDescription")
    @ExcludeMissing
    fun _shipDescription(): JsonField<String> = shipDescription

    /**
     * Returns the raw JSON value of [shipName].
     *
     * Unlike [shipName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipName") @ExcludeMissing fun _shipName(): JsonField<String> = shipName

    /**
     * Returns the raw JSON value of [shipType].
     *
     * Unlike [shipType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipType") @ExcludeMissing fun _shipType(): JsonField<String> = shipType

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [specialCraft].
     *
     * Unlike [specialCraft], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("specialCraft")
    @ExcludeMissing
    fun _specialCraft(): JsonField<String> = specialCraft

    /**
     * Returns the raw JSON value of [specialManeuver].
     *
     * Unlike [specialManeuver], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("specialManeuver")
    @ExcludeMissing
    fun _specialManeuver(): JsonField<Boolean> = specialManeuver

    /**
     * Returns the raw JSON value of [speed].
     *
     * Unlike [speed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speed") @ExcludeMissing fun _speed(): JsonField<Double> = speed

    /**
     * Returns the raw JSON value of [trueHeading].
     *
     * Unlike [trueHeading], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trueHeading") @ExcludeMissing fun _trueHeading(): JsonField<Double> = trueHeading

    /**
     * Returns the raw JSON value of [vesselFlag].
     *
     * Unlike [vesselFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vesselFlag") @ExcludeMissing fun _vesselFlag(): JsonField<String> = vesselFlag

    /**
     * Returns the raw JSON value of [width].
     *
     * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Double> = width

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
         * Returns a mutable builder for constructing an instance of [AisFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .ts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AisFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var ts: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var antennaRefDimensions: JsonField<MutableList<Double>>? = null
        private var avgSpeed: JsonField<Double> = JsonMissing.of()
        private var callSign: JsonField<String> = JsonMissing.of()
        private var cargoType: JsonField<String> = JsonMissing.of()
        private var course: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var currentPortGuid: JsonField<String> = JsonMissing.of()
        private var currentPortLocode: JsonField<String> = JsonMissing.of()
        private var destination: JsonField<String> = JsonMissing.of()
        private var destinationEta: JsonField<OffsetDateTime> = JsonMissing.of()
        private var distanceToGo: JsonField<Double> = JsonMissing.of()
        private var distanceTravelled: JsonField<Double> = JsonMissing.of()
        private var draught: JsonField<Double> = JsonMissing.of()
        private var engagedIn: JsonField<String> = JsonMissing.of()
        private var etaCalculated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var etaUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var idTrack: JsonField<String> = JsonMissing.of()
        private var idVessel: JsonField<String> = JsonMissing.of()
        private var imon: JsonField<Long> = JsonMissing.of()
        private var lastPortGuid: JsonField<String> = JsonMissing.of()
        private var lastPortLocode: JsonField<String> = JsonMissing.of()
        private var lat: JsonField<Double> = JsonMissing.of()
        private var length: JsonField<Double> = JsonMissing.of()
        private var lon: JsonField<Double> = JsonMissing.of()
        private var maxSpeed: JsonField<Double> = JsonMissing.of()
        private var mmsi: JsonField<Long> = JsonMissing.of()
        private var navStatus: JsonField<String> = JsonMissing.of()
        private var nextPortGuid: JsonField<String> = JsonMissing.of()
        private var nextPortLocode: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var posDeviceType: JsonField<String> = JsonMissing.of()
        private var posHiAccuracy: JsonField<Boolean> = JsonMissing.of()
        private var posHiLatency: JsonField<Boolean> = JsonMissing.of()
        private var rateOfTurn: JsonField<Double> = JsonMissing.of()
        private var shipDescription: JsonField<String> = JsonMissing.of()
        private var shipName: JsonField<String> = JsonMissing.of()
        private var shipType: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var specialCraft: JsonField<String> = JsonMissing.of()
        private var specialManeuver: JsonField<Boolean> = JsonMissing.of()
        private var speed: JsonField<Double> = JsonMissing.of()
        private var trueHeading: JsonField<Double> = JsonMissing.of()
        private var vesselFlag: JsonField<String> = JsonMissing.of()
        private var width: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aisFull: AisFull) = apply {
            classificationMarking = aisFull.classificationMarking
            dataMode = aisFull.dataMode
            source = aisFull.source
            ts = aisFull.ts
            id = aisFull.id
            antennaRefDimensions = aisFull.antennaRefDimensions.map { it.toMutableList() }
            avgSpeed = aisFull.avgSpeed
            callSign = aisFull.callSign
            cargoType = aisFull.cargoType
            course = aisFull.course
            createdAt = aisFull.createdAt
            createdBy = aisFull.createdBy
            currentPortGuid = aisFull.currentPortGuid
            currentPortLocode = aisFull.currentPortLocode
            destination = aisFull.destination
            destinationEta = aisFull.destinationEta
            distanceToGo = aisFull.distanceToGo
            distanceTravelled = aisFull.distanceTravelled
            draught = aisFull.draught
            engagedIn = aisFull.engagedIn
            etaCalculated = aisFull.etaCalculated
            etaUpdated = aisFull.etaUpdated
            idTrack = aisFull.idTrack
            idVessel = aisFull.idVessel
            imon = aisFull.imon
            lastPortGuid = aisFull.lastPortGuid
            lastPortLocode = aisFull.lastPortLocode
            lat = aisFull.lat
            length = aisFull.length
            lon = aisFull.lon
            maxSpeed = aisFull.maxSpeed
            mmsi = aisFull.mmsi
            navStatus = aisFull.navStatus
            nextPortGuid = aisFull.nextPortGuid
            nextPortLocode = aisFull.nextPortLocode
            origin = aisFull.origin
            origNetwork = aisFull.origNetwork
            posDeviceType = aisFull.posDeviceType
            posHiAccuracy = aisFull.posHiAccuracy
            posHiLatency = aisFull.posHiLatency
            rateOfTurn = aisFull.rateOfTurn
            shipDescription = aisFull.shipDescription
            shipName = aisFull.shipName
            shipType = aisFull.shipType
            sourceDl = aisFull.sourceDl
            specialCraft = aisFull.specialCraft
            specialManeuver = aisFull.specialManeuver
            speed = aisFull.speed
            trueHeading = aisFull.trueHeading
            vesselFlag = aisFull.vesselFlag
            width = aisFull.width
            additionalProperties = aisFull.additionalProperties.toMutableMap()
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

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** The timestamp that the vessel position was recorded, in ISO 8601 UTC format. */
        fun ts(ts: OffsetDateTime) = ts(JsonField.of(ts))

        /**
         * Sets [Builder.ts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ts] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ts(ts: JsonField<OffsetDateTime>) = apply { this.ts = ts }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The reference dimensions of the vessel, reported as [A, B, C, D], in meters. Where the
         * array values represent the distance fore (A), aft (B), to port (C), and to starboard (D)
         * of the navigation antenna. Array with values A = C = 0 and B, D > 0 indicate the length
         * (B) and width (D) of the vessel without antenna position reference.
         */
        fun antennaRefDimensions(antennaRefDimensions: List<Double>) =
            antennaRefDimensions(JsonField.of(antennaRefDimensions))

        /**
         * Sets [Builder.antennaRefDimensions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.antennaRefDimensions] with a well-typed `List<Double>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun antennaRefDimensions(antennaRefDimensions: JsonField<List<Double>>) = apply {
            this.antennaRefDimensions = antennaRefDimensions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [antennaRefDimensions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAntennaRefDimension(antennaRefDimension: Double) = apply {
            antennaRefDimensions =
                (antennaRefDimensions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("antennaRefDimensions", it).add(antennaRefDimension)
                }
        }

        /**
         * The average speed, in kilometers/hour, calculated for the subject vessel during the
         * latest voyage (port to port).
         */
        fun avgSpeed(avgSpeed: Double) = avgSpeed(JsonField.of(avgSpeed))

        /**
         * Sets [Builder.avgSpeed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgSpeed] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avgSpeed(avgSpeed: JsonField<Double>) = apply { this.avgSpeed = avgSpeed }

        /** A uniquely designated identifier for the vessel's transmitter station. */
        fun callSign(callSign: String) = callSign(JsonField.of(callSign))

        /**
         * Sets [Builder.callSign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSign] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callSign(callSign: JsonField<String>) = apply { this.callSign = callSign }

        /**
         * The reported cargo type. Intended as, but not constrained to, the USCG NAVCEN AIS cargo
         * definitions. Users should refer to USCG Navigation Center documentation for specific
         * definitions associated with ship and cargo types. USCG NAVCEN documentation may be found
         * at https://www.navcen.uscg.gov.
         */
        fun cargoType(cargoType: String) = cargoType(JsonField.of(cargoType))

        /**
         * Sets [Builder.cargoType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cargoType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cargoType(cargoType: JsonField<String>) = apply { this.cargoType = cargoType }

        /** The course-over-ground reported by the vessel, in degrees. */
        fun course(course: Double) = course(JsonField.of(course))

        /**
         * Sets [Builder.course] to an arbitrary JSON value.
         *
         * You should usually call [Builder.course] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun course(course: JsonField<Double>) = apply { this.course = course }

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

        /** The US Geographic Unique Identifier of the current port hosting the vessel. */
        fun currentPortGuid(currentPortGuid: String) =
            currentPortGuid(JsonField.of(currentPortGuid))

        /**
         * Sets [Builder.currentPortGuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentPortGuid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currentPortGuid(currentPortGuid: JsonField<String>) = apply {
            this.currentPortGuid = currentPortGuid
        }

        /** The UN Location Code of the current port hosting the vessel. */
        fun currentPortLocode(currentPortLocode: String) =
            currentPortLocode(JsonField.of(currentPortLocode))

        /**
         * Sets [Builder.currentPortLocode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentPortLocode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currentPortLocode(currentPortLocode: JsonField<String>) = apply {
            this.currentPortLocode = currentPortLocode
        }

        /** The destination of the vessel according to the AIS transmission. */
        fun destination(destination: String) = destination(JsonField.of(destination))

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destination(destination: JsonField<String>) = apply { this.destination = destination }

        /**
         * The Estimated Time of Arrival of the vessel at the destination, in ISO 8601 UTC format.
         */
        fun destinationEta(destinationEta: OffsetDateTime) =
            destinationEta(JsonField.of(destinationEta))

        /**
         * Sets [Builder.destinationEta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationEta] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun destinationEta(destinationEta: JsonField<OffsetDateTime>) = apply {
            this.destinationEta = destinationEta
        }

        /**
         * The remaining distance, in kilometers, for the vessel to reach the reported destination.
         */
        fun distanceToGo(distanceToGo: Double) = distanceToGo(JsonField.of(distanceToGo))

        /**
         * Sets [Builder.distanceToGo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distanceToGo] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun distanceToGo(distanceToGo: JsonField<Double>) = apply {
            this.distanceToGo = distanceToGo
        }

        /**
         * The distance, in kilometers, that the vessel has travelled since departing the last port.
         */
        fun distanceTravelled(distanceTravelled: Double) =
            distanceTravelled(JsonField.of(distanceTravelled))

        /**
         * Sets [Builder.distanceTravelled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distanceTravelled] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun distanceTravelled(distanceTravelled: JsonField<Double>) = apply {
            this.distanceTravelled = distanceTravelled
        }

        /**
         * The maximum static draught, in meters, of the vessel according to the AIS transmission.
         */
        fun draught(draught: Double) = draught(JsonField.of(draught))

        /**
         * Sets [Builder.draught] to an arbitrary JSON value.
         *
         * You should usually call [Builder.draught] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun draught(draught: JsonField<Double>) = apply { this.draught = draught }

        /**
         * The activity that the vessel is engaged in. This entry applies only when the shipType =
         * Other.
         */
        fun engagedIn(engagedIn: String) = engagedIn(JsonField.of(engagedIn))

        /**
         * Sets [Builder.engagedIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.engagedIn] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun engagedIn(engagedIn: JsonField<String>) = apply { this.engagedIn = engagedIn }

        /**
         * The Estimated Time of Arrival of the vessel at the destination port, according to
         * MarineTraffic calculations, in ISO 8601 UTC format.
         */
        fun etaCalculated(etaCalculated: OffsetDateTime) =
            etaCalculated(JsonField.of(etaCalculated))

        /**
         * Sets [Builder.etaCalculated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.etaCalculated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun etaCalculated(etaCalculated: JsonField<OffsetDateTime>) = apply {
            this.etaCalculated = etaCalculated
        }

        /**
         * The date and time that the ETA was calculated by MarineTraffic, in ISO 8601 UTC format.
         */
        fun etaUpdated(etaUpdated: OffsetDateTime) = etaUpdated(JsonField.of(etaUpdated))

        /**
         * Sets [Builder.etaUpdated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.etaUpdated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun etaUpdated(etaUpdated: JsonField<OffsetDateTime>) = apply {
            this.etaUpdated = etaUpdated
        }

        /** Unique identifier of the Track. */
        fun idTrack(idTrack: String) = idTrack(JsonField.of(idTrack))

        /**
         * Sets [Builder.idTrack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idTrack] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idTrack(idTrack: JsonField<String>) = apply { this.idTrack = idTrack }

        /** Unique identifier of the vessel. */
        fun idVessel(idVessel: String) = idVessel(JsonField.of(idVessel))

        /**
         * Sets [Builder.idVessel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idVessel] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idVessel(idVessel: JsonField<String>) = apply { this.idVessel = idVessel }

        /**
         * The International Maritime Organization Number of the vessel. IMON is a seven-digit
         * number that uniquely identifies the vessel.
         */
        fun imon(imon: Long) = imon(JsonField.of(imon))

        /**
         * Sets [Builder.imon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imon] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imon(imon: JsonField<Long>) = apply { this.imon = imon }

        /** The US Geographic Unique Identifier of the last port visited by the vessel. */
        fun lastPortGuid(lastPortGuid: String) = lastPortGuid(JsonField.of(lastPortGuid))

        /**
         * Sets [Builder.lastPortGuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastPortGuid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastPortGuid(lastPortGuid: JsonField<String>) = apply {
            this.lastPortGuid = lastPortGuid
        }

        /** The UN Location Code of the last port visited by the vessel. */
        fun lastPortLocode(lastPortLocode: String) = lastPortLocode(JsonField.of(lastPortLocode))

        /**
         * Sets [Builder.lastPortLocode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastPortLocode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastPortLocode(lastPortLocode: JsonField<String>) = apply {
            this.lastPortLocode = lastPortLocode
        }

        /**
         * WGS-84 latitude of the vessel position, in degrees. -90 to 90 degrees (negative values
         * south of equator).
         */
        fun lat(lat: Double) = lat(JsonField.of(lat))

        /**
         * Sets [Builder.lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

        /**
         * The overall length of the vessel, in meters. A value of 511 indicates a vessel length of
         * 511 meters or greater.
         */
        fun length(length: Double) = length(JsonField.of(length))

        /**
         * Sets [Builder.length] to an arbitrary JSON value.
         *
         * You should usually call [Builder.length] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun length(length: JsonField<Double>) = apply { this.length = length }

        /**
         * WGS-84 longitude of the vessel position, in degrees. -180 to 180 degrees (negative values
         * west of Prime Meridian).
         */
        fun lon(lon: Double) = lon(JsonField.of(lon))

        /**
         * Sets [Builder.lon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

        /**
         * The maximum speed, in kilometers/hour, reported by the subject vessel during the latest
         * voyage (port to port).
         */
        fun maxSpeed(maxSpeed: Double) = maxSpeed(JsonField.of(maxSpeed))

        /**
         * Sets [Builder.maxSpeed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSpeed] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxSpeed(maxSpeed: JsonField<Double>) = apply { this.maxSpeed = maxSpeed }

        /**
         * The Maritime Mobile Service Identity of the vessel. MMSI is a nine-digit number that
         * identifies the transmitter station of the vessel.
         */
        fun mmsi(mmsi: Long) = mmsi(JsonField.of(mmsi))

        /**
         * Sets [Builder.mmsi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mmsi] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mmsi(mmsi: JsonField<Long>) = apply { this.mmsi = mmsi }

        /**
         * The AIS Navigational Status of the vessel (e.g. Underway Using Engine, Moored, Aground,
         * etc.). Intended as, but not constrained to, the USCG NAVCEN navigation status
         * definitions. Users should refer to USCG Navigation Center documentation for specific
         * definitions associated with navigation status. USCG NAVCEN documentation may be found at
         * https://www.navcen.uscg.gov.
         */
        fun navStatus(navStatus: String) = navStatus(JsonField.of(navStatus))

        /**
         * Sets [Builder.navStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.navStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun navStatus(navStatus: JsonField<String>) = apply { this.navStatus = navStatus }

        /** The US Geographic Unique Identifier of the next destination port of the vessel. */
        fun nextPortGuid(nextPortGuid: String) = nextPortGuid(JsonField.of(nextPortGuid))

        /**
         * Sets [Builder.nextPortGuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPortGuid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextPortGuid(nextPortGuid: JsonField<String>) = apply {
            this.nextPortGuid = nextPortGuid
        }

        /** The UN Location Code of the next destination port of the vessel. */
        fun nextPortLocode(nextPortLocode: String) = nextPortLocode(JsonField.of(nextPortLocode))

        /**
         * Sets [Builder.nextPortLocode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPortLocode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nextPortLocode(nextPortLocode: JsonField<String>) = apply {
            this.nextPortLocode = nextPortLocode
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
         * The type of electronic position fixing device (e.g. GPS, GLONASS, etc.). Intended as, but
         * not constrained to, the USCG NAVCEN electronic position fixing device definitions. Users
         * should refer to USCG Navigation Center documentation for specific device type
         * information. USCG NAVCEN documentation may be found at https://www.navcen.uscg.gov.
         */
        fun posDeviceType(posDeviceType: String) = posDeviceType(JsonField.of(posDeviceType))

        /**
         * Sets [Builder.posDeviceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.posDeviceType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun posDeviceType(posDeviceType: JsonField<String>) = apply {
            this.posDeviceType = posDeviceType
        }

        /**
         * Flag indicating high reported position accuracy (less than or equal to 10 meters). A
         * value of 0/false indicates low accuracy (greater than 10 meters).
         */
        fun posHiAccuracy(posHiAccuracy: Boolean) = posHiAccuracy(JsonField.of(posHiAccuracy))

        /**
         * Sets [Builder.posHiAccuracy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.posHiAccuracy] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun posHiAccuracy(posHiAccuracy: JsonField<Boolean>) = apply {
            this.posHiAccuracy = posHiAccuracy
        }

        /**
         * Flag indicating high reported position latency (greater than 5 seconds). A value of
         * 0/false indicates low latency (less than 5 seconds).
         */
        fun posHiLatency(posHiLatency: Boolean) = posHiLatency(JsonField.of(posHiLatency))

        /**
         * Sets [Builder.posHiLatency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.posHiLatency] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun posHiLatency(posHiLatency: JsonField<Boolean>) = apply {
            this.posHiLatency = posHiLatency
        }

        /**
         * The Rate-of-Turn for the vessel, in degrees/minute. Positive value indicates that the
         * vessel is turning right.
         */
        fun rateOfTurn(rateOfTurn: Double) = rateOfTurn(JsonField.of(rateOfTurn))

        /**
         * Sets [Builder.rateOfTurn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateOfTurn] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rateOfTurn(rateOfTurn: JsonField<Double>) = apply { this.rateOfTurn = rateOfTurn }

        /** Further description or explanation of the vessel or type. */
        fun shipDescription(shipDescription: String) =
            shipDescription(JsonField.of(shipDescription))

        /**
         * Sets [Builder.shipDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shipDescription(shipDescription: JsonField<String>) = apply {
            this.shipDescription = shipDescription
        }

        /**
         * The name of the vessel. Vessel names that exceed the AIS 20 character are shortened (not
         * truncated) to 15 character-spaces, followed by an underscore and the last 4
         * characters-spaces of the vessel full name.
         */
        fun shipName(shipName: String) = shipName(JsonField.of(shipName))

        /**
         * Sets [Builder.shipName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shipName(shipName: JsonField<String>) = apply { this.shipName = shipName }

        /**
         * The reported ship type (e.g. Passenger, Tanker, Cargo, Other, etc.). See the engagedIn
         * and specialCraft entries for additional information on certain types of vessels.
         */
        fun shipType(shipType: String) = shipType(JsonField.of(shipType))

        /**
         * Sets [Builder.shipType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shipType(shipType: JsonField<String>) = apply { this.shipType = shipType }

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

        /**
         * The type of special craft designation of the vessel. This entry applies only when the
         * shipType = Special Craft.
         */
        fun specialCraft(specialCraft: String) = specialCraft(JsonField.of(specialCraft))

        /**
         * Sets [Builder.specialCraft] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specialCraft] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun specialCraft(specialCraft: JsonField<String>) = apply {
            this.specialCraft = specialCraft
        }

        /**
         * Flag indicating that the vessel is engaged in a special maneuver (e.g. Waterway
         * Navigation).
         */
        fun specialManeuver(specialManeuver: Boolean) =
            specialManeuver(JsonField.of(specialManeuver))

        /**
         * Sets [Builder.specialManeuver] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specialManeuver] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun specialManeuver(specialManeuver: JsonField<Boolean>) = apply {
            this.specialManeuver = specialManeuver
        }

        /** The speed-over-ground reported by the vessel, in kilometers/hour. */
        fun speed(speed: Double) = speed(JsonField.of(speed))

        /**
         * Sets [Builder.speed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speed] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun speed(speed: JsonField<Double>) = apply { this.speed = speed }

        /** The true heading reported by the vessel, in degrees. */
        fun trueHeading(trueHeading: Double) = trueHeading(JsonField.of(trueHeading))

        /**
         * Sets [Builder.trueHeading] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trueHeading] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trueHeading(trueHeading: JsonField<Double>) = apply { this.trueHeading = trueHeading }

        /** The flag of the subject vessel according to AIS transmission. */
        fun vesselFlag(vesselFlag: String) = vesselFlag(JsonField.of(vesselFlag))

        /**
         * Sets [Builder.vesselFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vesselFlag] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vesselFlag(vesselFlag: JsonField<String>) = apply { this.vesselFlag = vesselFlag }

        /**
         * The breadth of the vessel, in meters. A value of 63 indicates a vessel breadth of 63
         * meters or greater.
         */
        fun width(width: Double) = width(JsonField.of(width))

        /**
         * Sets [Builder.width] to an arbitrary JSON value.
         *
         * You should usually call [Builder.width] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun width(width: JsonField<Double>) = apply { this.width = width }

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
         * Returns an immutable instance of [AisFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .ts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AisFull =
            AisFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                checkRequired("ts", ts),
                id,
                (antennaRefDimensions ?: JsonMissing.of()).map { it.toImmutable() },
                avgSpeed,
                callSign,
                cargoType,
                course,
                createdAt,
                createdBy,
                currentPortGuid,
                currentPortLocode,
                destination,
                destinationEta,
                distanceToGo,
                distanceTravelled,
                draught,
                engagedIn,
                etaCalculated,
                etaUpdated,
                idTrack,
                idVessel,
                imon,
                lastPortGuid,
                lastPortLocode,
                lat,
                length,
                lon,
                maxSpeed,
                mmsi,
                navStatus,
                nextPortGuid,
                nextPortLocode,
                origin,
                origNetwork,
                posDeviceType,
                posHiAccuracy,
                posHiLatency,
                rateOfTurn,
                shipDescription,
                shipName,
                shipType,
                sourceDl,
                specialCraft,
                specialManeuver,
                speed,
                trueHeading,
                vesselFlag,
                width,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AisFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        ts()
        id()
        antennaRefDimensions()
        avgSpeed()
        callSign()
        cargoType()
        course()
        createdAt()
        createdBy()
        currentPortGuid()
        currentPortLocode()
        destination()
        destinationEta()
        distanceToGo()
        distanceTravelled()
        draught()
        engagedIn()
        etaCalculated()
        etaUpdated()
        idTrack()
        idVessel()
        imon()
        lastPortGuid()
        lastPortLocode()
        lat()
        length()
        lon()
        maxSpeed()
        mmsi()
        navStatus()
        nextPortGuid()
        nextPortLocode()
        origin()
        origNetwork()
        posDeviceType()
        posHiAccuracy()
        posHiLatency()
        rateOfTurn()
        shipDescription()
        shipName()
        shipType()
        sourceDl()
        specialCraft()
        specialManeuver()
        speed()
        trueHeading()
        vesselFlag()
        width()
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
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (ts.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (antennaRefDimensions.asKnown().getOrNull()?.size ?: 0) +
            (if (avgSpeed.asKnown().isPresent) 1 else 0) +
            (if (callSign.asKnown().isPresent) 1 else 0) +
            (if (cargoType.asKnown().isPresent) 1 else 0) +
            (if (course.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (currentPortGuid.asKnown().isPresent) 1 else 0) +
            (if (currentPortLocode.asKnown().isPresent) 1 else 0) +
            (if (destination.asKnown().isPresent) 1 else 0) +
            (if (destinationEta.asKnown().isPresent) 1 else 0) +
            (if (distanceToGo.asKnown().isPresent) 1 else 0) +
            (if (distanceTravelled.asKnown().isPresent) 1 else 0) +
            (if (draught.asKnown().isPresent) 1 else 0) +
            (if (engagedIn.asKnown().isPresent) 1 else 0) +
            (if (etaCalculated.asKnown().isPresent) 1 else 0) +
            (if (etaUpdated.asKnown().isPresent) 1 else 0) +
            (if (idTrack.asKnown().isPresent) 1 else 0) +
            (if (idVessel.asKnown().isPresent) 1 else 0) +
            (if (imon.asKnown().isPresent) 1 else 0) +
            (if (lastPortGuid.asKnown().isPresent) 1 else 0) +
            (if (lastPortLocode.asKnown().isPresent) 1 else 0) +
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (length.asKnown().isPresent) 1 else 0) +
            (if (lon.asKnown().isPresent) 1 else 0) +
            (if (maxSpeed.asKnown().isPresent) 1 else 0) +
            (if (mmsi.asKnown().isPresent) 1 else 0) +
            (if (navStatus.asKnown().isPresent) 1 else 0) +
            (if (nextPortGuid.asKnown().isPresent) 1 else 0) +
            (if (nextPortLocode.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (posDeviceType.asKnown().isPresent) 1 else 0) +
            (if (posHiAccuracy.asKnown().isPresent) 1 else 0) +
            (if (posHiLatency.asKnown().isPresent) 1 else 0) +
            (if (rateOfTurn.asKnown().isPresent) 1 else 0) +
            (if (shipDescription.asKnown().isPresent) 1 else 0) +
            (if (shipName.asKnown().isPresent) 1 else 0) +
            (if (shipType.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (specialCraft.asKnown().isPresent) 1 else 0) +
            (if (specialManeuver.asKnown().isPresent) 1 else 0) +
            (if (speed.asKnown().isPresent) 1 else 0) +
            (if (trueHeading.asKnown().isPresent) 1 else 0) +
            (if (vesselFlag.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0)

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

        return /* spotless:off */ other is AisFull && classificationMarking == other.classificationMarking && dataMode == other.dataMode && source == other.source && ts == other.ts && id == other.id && antennaRefDimensions == other.antennaRefDimensions && avgSpeed == other.avgSpeed && callSign == other.callSign && cargoType == other.cargoType && course == other.course && createdAt == other.createdAt && createdBy == other.createdBy && currentPortGuid == other.currentPortGuid && currentPortLocode == other.currentPortLocode && destination == other.destination && destinationEta == other.destinationEta && distanceToGo == other.distanceToGo && distanceTravelled == other.distanceTravelled && draught == other.draught && engagedIn == other.engagedIn && etaCalculated == other.etaCalculated && etaUpdated == other.etaUpdated && idTrack == other.idTrack && idVessel == other.idVessel && imon == other.imon && lastPortGuid == other.lastPortGuid && lastPortLocode == other.lastPortLocode && lat == other.lat && length == other.length && lon == other.lon && maxSpeed == other.maxSpeed && mmsi == other.mmsi && navStatus == other.navStatus && nextPortGuid == other.nextPortGuid && nextPortLocode == other.nextPortLocode && origin == other.origin && origNetwork == other.origNetwork && posDeviceType == other.posDeviceType && posHiAccuracy == other.posHiAccuracy && posHiLatency == other.posHiLatency && rateOfTurn == other.rateOfTurn && shipDescription == other.shipDescription && shipName == other.shipName && shipType == other.shipType && sourceDl == other.sourceDl && specialCraft == other.specialCraft && specialManeuver == other.specialManeuver && speed == other.speed && trueHeading == other.trueHeading && vesselFlag == other.vesselFlag && width == other.width && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, source, ts, id, antennaRefDimensions, avgSpeed, callSign, cargoType, course, createdAt, createdBy, currentPortGuid, currentPortLocode, destination, destinationEta, distanceToGo, distanceTravelled, draught, engagedIn, etaCalculated, etaUpdated, idTrack, idVessel, imon, lastPortGuid, lastPortLocode, lat, length, lon, maxSpeed, mmsi, navStatus, nextPortGuid, nextPortLocode, origin, origNetwork, posDeviceType, posHiAccuracy, posHiLatency, rateOfTurn, shipDescription, shipName, shipType, sourceDl, specialCraft, specialManeuver, speed, trueHeading, vesselFlag, width, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AisFull{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, ts=$ts, id=$id, antennaRefDimensions=$antennaRefDimensions, avgSpeed=$avgSpeed, callSign=$callSign, cargoType=$cargoType, course=$course, createdAt=$createdAt, createdBy=$createdBy, currentPortGuid=$currentPortGuid, currentPortLocode=$currentPortLocode, destination=$destination, destinationEta=$destinationEta, distanceToGo=$distanceToGo, distanceTravelled=$distanceTravelled, draught=$draught, engagedIn=$engagedIn, etaCalculated=$etaCalculated, etaUpdated=$etaUpdated, idTrack=$idTrack, idVessel=$idVessel, imon=$imon, lastPortGuid=$lastPortGuid, lastPortLocode=$lastPortLocode, lat=$lat, length=$length, lon=$lon, maxSpeed=$maxSpeed, mmsi=$mmsi, navStatus=$navStatus, nextPortGuid=$nextPortGuid, nextPortLocode=$nextPortLocode, origin=$origin, origNetwork=$origNetwork, posDeviceType=$posDeviceType, posHiAccuracy=$posHiAccuracy, posHiLatency=$posHiLatency, rateOfTurn=$rateOfTurn, shipDescription=$shipDescription, shipName=$shipName, shipType=$shipType, sourceDl=$sourceDl, specialCraft=$specialCraft, specialManeuver=$specialManeuver, speed=$speed, trueHeading=$trueHeading, vesselFlag=$vesselFlag, width=$width, additionalProperties=$additionalProperties}"
}

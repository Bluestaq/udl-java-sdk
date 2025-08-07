// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.orbittrack.history

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
import com.unifieddatalibrary.api.models.OnorbitFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Keplerian orbital elements describing an orbit for a particular on-orbit satellite and applicable
 * sensor data aiding in the orbit prediction.
 */
class HistoryListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val lat: JsonField<Double>,
    private val lon: JsonField<Double>,
    private val source: JsonField<String>,
    private val ts: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val alt: JsonField<Double>,
    private val amplification: JsonField<String>,
    private val angElev: JsonField<Double>,
    private val aouData: JsonField<List<Double>>,
    private val aouType: JsonField<String>,
    private val callSign: JsonField<String>,
    private val charlieLine: JsonField<String>,
    private val chXRef: JsonField<String>,
    private val cntnmnt: JsonField<Double>,
    private val countryCode: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val decay: JsonField<Double>,
    private val dummy: JsonField<Boolean>,
    private val feint: JsonField<Boolean>,
    private val hq: JsonField<Boolean>,
    private val idElset: JsonField<String>,
    private val identAmp: JsonField<String>,
    private val idOnOrbit: JsonField<String>,
    private val iff: JsonField<String>,
    private val installation: JsonField<Boolean>,
    private val objectType: JsonField<ObjectType>,
    private val objIdent: JsonField<ObjIdent>,
    private val onOrbit: JsonField<OnorbitFull>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val rdfRf: JsonField<Double>,
    private val reduced: JsonField<Boolean>,
    private val reinforced: JsonField<Boolean>,
    private val rptNum: JsonField<String>,
    private val satNo: JsonField<Int>,
    private val satStatus: JsonField<String>,
    private val spd: JsonField<Double>,
    private val taskForce: JsonField<Boolean>,
    private val trackSensors: JsonField<List<TrackSensor>>,
    private val trkId: JsonField<String>,
    private val vehType: JsonField<String>,
    private val xref: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ts") @ExcludeMissing ts: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alt") @ExcludeMissing alt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amplification")
        @ExcludeMissing
        amplification: JsonField<String> = JsonMissing.of(),
        @JsonProperty("angElev") @ExcludeMissing angElev: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("aouData")
        @ExcludeMissing
        aouData: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("aouType") @ExcludeMissing aouType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("callSign") @ExcludeMissing callSign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("charlieLine")
        @ExcludeMissing
        charlieLine: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chXRef") @ExcludeMissing chXRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cntnmnt") @ExcludeMissing cntnmnt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("decay") @ExcludeMissing decay: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dummy") @ExcludeMissing dummy: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("feint") @ExcludeMissing feint: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hq") @ExcludeMissing hq: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("idElset") @ExcludeMissing idElset: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identAmp") @ExcludeMissing identAmp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("iff") @ExcludeMissing iff: JsonField<String> = JsonMissing.of(),
        @JsonProperty("installation")
        @ExcludeMissing
        installation: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("objectType")
        @ExcludeMissing
        objectType: JsonField<ObjectType> = JsonMissing.of(),
        @JsonProperty("objIdent") @ExcludeMissing objIdent: JsonField<ObjIdent> = JsonMissing.of(),
        @JsonProperty("onOrbit") @ExcludeMissing onOrbit: JsonField<OnorbitFull> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rdfRF") @ExcludeMissing rdfRf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("reduced") @ExcludeMissing reduced: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reinforced")
        @ExcludeMissing
        reinforced: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rptNum") @ExcludeMissing rptNum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("satStatus") @ExcludeMissing satStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spd") @ExcludeMissing spd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("taskForce") @ExcludeMissing taskForce: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("trackSensors")
        @ExcludeMissing
        trackSensors: JsonField<List<TrackSensor>> = JsonMissing.of(),
        @JsonProperty("trkId") @ExcludeMissing trkId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vehType") @ExcludeMissing vehType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("xref") @ExcludeMissing xref: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        lat,
        lon,
        source,
        ts,
        id,
        alt,
        amplification,
        angElev,
        aouData,
        aouType,
        callSign,
        charlieLine,
        chXRef,
        cntnmnt,
        countryCode,
        createdAt,
        createdBy,
        decay,
        dummy,
        feint,
        hq,
        idElset,
        identAmp,
        idOnOrbit,
        iff,
        installation,
        objectType,
        objIdent,
        onOrbit,
        origin,
        origNetwork,
        origObjectId,
        rdfRf,
        reduced,
        reinforced,
        rptNum,
        satNo,
        satStatus,
        spd,
        taskForce,
        trackSensors,
        trkId,
        vehType,
        xref,
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
     * WGS-84 latitude of the track object subpoint, in degrees. -90 to 90 degrees (negative values
     * south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lat(): Double = lat.getRequired("lat")

    /**
     * WGS-84 longitude of the track object subpoint, in degrees. -180 to 180 degrees (negative
     * values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lon(): Double = lon.getRequired("lon")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Track timestamp in ISO8601 UTC format, with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ts(): OffsetDateTime = ts.getRequired("ts")

    /**
     * Unique identifier of the record, auto-generated by the system if not provided on create
     * operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Track point altitude relative to WGS-84 ellipsoid, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun alt(): Optional<Double> = alt.getOptional("alt")

    /**
     * Free-form remarks entered for the satellite.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun amplification(): Optional<String> = amplification.getOptional("amplification")

    /**
     * The angle formed between the line of sight of the observer and the horizon at track
     * timestamp, in degrees. The angular range is -90 to 90, with negative values representing
     * angle of depression.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun angElev(): Optional<Double> = angElev.getOptional("angElev")

    /**
     * Three element array representing an Area of Uncertainty (AoU). The array element definitions
     * and units are type specific depending on the aouType specified in this record:
     *
     * ELLIPSE:
     *
     * brg - orientation in degrees of the ellipse
     *
     * a1 - semi-major axis in meters
     *
     * a2 - semi-minor axis in meters
     *
     * BEARING (BEARING BOX or MTST BEARING BOX):
     *
     * brg - orientation in degrees of the bearing box
     *
     * a1 - length of bearing box in meters
     *
     * a2 - half-width of bearing box in meters
     *
     * OTHER (All other type values):
     *
     * brg - line of bearing in degrees true
     *
     * a1 - bearing error in degrees
     *
     * a2 - estimated range in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aouData(): Optional<List<Double>> = aouData.getOptional("aouData")

    /**
     * The Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition. This type defines
     * the elements of the aouData array and is required if aouData is not null. See the aouData
     * field definition for specific information.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aouType(): Optional<String> = aouType.getOptional("aouType")

    /**
     * International radio call sign assigned to the track. This is an 8-character alphanumeric
     * code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun callSign(): Optional<String> = callSign.getOptional("callSign")

    /**
     * One-line Charlie elements set.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun charlieLine(): Optional<String> = charlieLine.getOptional("charlieLine")

    /**
     * The cross-reference code of the channel on which this track report was received, if the
     * report came over a comms channel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun chXRef(): Optional<String> = chXRef.getOptional("chXRef")

    /**
     * The Area Of Uncertainty (AOU) percentage (0 - 100) containment value. The percentage of time
     * (90%) that the estimated area of uncertainty will cover the true position of the track
     * object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cntnmnt(): Optional<Double> = cntnmnt.getOptional("cntnmnt")

    /**
     * The country code. This value is typically the ISO 3166 Alpha-2 two-character country code,
     * however it can also represent various consortiums that do not appear in the ISO document. The
     * code must correspond to an existing country in the UDL’s country API. Call udl/country/{code}
     * to get any associated FIPS code, ISO Alpha-3 code, or alternate code values that exist for
     * the specified country code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

    /**
     * Time the row was created in the database.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Application user who created the row in the database.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * Predicted change in Mean Motion (velocity) in radians/herg^2. herg is a unit of time measure
     * equal to 806.8120769 seconds, and is the orbital period of an imaginary satellite rotating
     * about the Earth at zero altitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun decay(): Optional<Double> = decay.getOptional("decay")

    /**
     * Flag indicating that this track represents a dummy object or group. Identifies offensive or
     * defensive units, equipment and/or installations intended to draw the enemy's attention away
     * from the area of the main attack. Based on MIL-STD-2525 symbology definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dummy(): Optional<Boolean> = dummy.getOptional("dummy")

    /**
     * Flag indicating that this track represents a feint object or group. Identifies offensive or
     * defensive units, equipment and/or installations intended to draw the enemy's attention away
     * from the area of the main attack. Based on MIL-STD-2525 symbology definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun feint(): Optional<Boolean> = feint.getOptional("feint")

    /**
     * Flag indicating that this track represents a headquarters object. Based on MIL-STD-2525
     * symbology definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hq(): Optional<Boolean> = hq.getOptional("hq")

    /**
     * Unique identifier of the Elset associated with this object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idElset(): Optional<String> = idElset.getOptional("idElset")

    /**
     * Additional track object identity/status information, typically used for EXERCISE identity
     * amplification (FAKER, JOKER, KILO, TRAVELLER, ZOMBIE):
     *
     * FAKER: Friendly track, object, or entity acting as an exercise hostile.
     *
     * JOKER: Friendly track, object, or entity acting as an exercise suspect.
     *
     * KILO: Friendly high-value object.
     *
     * TRAVELLER: Suspect land or surface track following a recognized traffic route.
     *
     * ZOMBIE: Suspect track, object, or entity of special interest.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun identAmp(): Optional<String> = identAmp.getOptional("identAmp")

    /**
     * Unique identifier of the target on-orbit object, if correlated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * A text amplifier displaying IFF/SIF/AIS Identification modes and codes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun iff(): Optional<String> = iff.getOptional("iff")

    /**
     * Flag indicating that this track represents an installation. Based on MIL-STD-2525 symbology
     * definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun installation(): Optional<Boolean> = installation.getOptional("installation")

    /**
     * The on-orbit category assigned to this track object (DEBRIS, MANNED, PAYLOAD, PLATFORM,
     * ROCKET BODY, UNKNOWN).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objectType(): Optional<ObjectType> = objectType.getOptional("objectType")

    /**
     * The estimated identity of the track object (ASSUMED FRIEND, FRIEND, HOSTILE, NEUTRAL,
     * PENDING, SUSPECT, UNKNOWN):
     *
     * ASSUMED FRIEND: Track assumed to be a friend due to the object characteristics, behavior,
     * and/or origin.
     *
     * FRIEND: Track object supporting friendly forces and belonging to a declared friendly nation
     * or entity.
     *
     * HOSTILE: Track object belonging to an opposing nation, party, group, or entity deemed to
     * contribute to a threat to friendly forces or their mission due to its behavior,
     * characteristics, nationality, or origin.
     *
     * NEUTRAL: Track object whose characteristics, behavior, nationality, and/or origin indicate
     * that it is neither supporting nor opposing friendly forces or their mission.
     *
     * PENDING: Track object which has not been evaluated.
     *
     * SUSPECT: Track object deemed potentially hostile due to the object characteristics, behavior,
     * nationality, and/or origin.
     *
     * UNKNOWN: Track object which has been evaluated and does not meet criteria for any standard
     * identity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objIdent(): Optional<ObjIdent> = objIdent.getOptional("objIdent")

    /**
     * Model object representing on-orbit objects or satellites in the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun onOrbit(): Optional<OnorbitFull> = onOrbit.getOptional("onOrbit")

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
     * Optional identifier provided by observation source to indicate the target on-orbit object of
     * this track. This may be an internal identifier and not necessarily a valid satellite number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Radio frequency of the track, measured in megahertz (MHz).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rdfRf(): Optional<Double> = rdfRf.getOptional("rdfRF")

    /**
     * Flag indicating that this track represents a reduced object or group. Based on MIL-STD-2525
     * symbology definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reduced(): Optional<Boolean> = reduced.getOptional("reduced")

    /**
     * Flag indicating that this track represents a reinforced object or group. Based on
     * MIL-STD-2525 symbology definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reinforced(): Optional<Boolean> = reinforced.getOptional("reinforced")

    /**
     * Report number received from the reporting source for this track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rptNum(): Optional<String> = rptNum.getOptional("rptNum")

    /**
     * Satellite/catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Status of the satellite.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satStatus(): Optional<String> = satStatus.getOptional("satStatus")

    /**
     * Track object speed, in km/sec.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spd(): Optional<Double> = spd.getOptional("spd")

    /**
     * Flag indicating that this track represents a task force. Based on MIL-STD-2525 symbology
     * definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun taskForce(): Optional<Boolean> = taskForce.getOptional("taskForce")

    /**
     * TrackSensor Collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackSensors(): Optional<List<TrackSensor>> = trackSensors.getOptional("trackSensors")

    /**
     * UUID identifying the track, which should remain the same on subsequent tracks of the same
     * object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trkId(): Optional<String> = trkId.getOptional("trkId")

    /**
     * The type of vehicle with which the device is associated. Based on MIL-STD-2525 symbology
     * definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vehType(): Optional<String> = vehType.getOptional("vehType")

    /**
     * Source cross-reference code for the command that originated the track report.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun xref(): Optional<String> = xref.getOptional("xref")

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
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

    /**
     * Returns the raw JSON value of [lon].
     *
     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

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
     * Returns the raw JSON value of [alt].
     *
     * Unlike [alt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alt") @ExcludeMissing fun _alt(): JsonField<Double> = alt

    /**
     * Returns the raw JSON value of [amplification].
     *
     * Unlike [amplification], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amplification")
    @ExcludeMissing
    fun _amplification(): JsonField<String> = amplification

    /**
     * Returns the raw JSON value of [angElev].
     *
     * Unlike [angElev], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("angElev") @ExcludeMissing fun _angElev(): JsonField<Double> = angElev

    /**
     * Returns the raw JSON value of [aouData].
     *
     * Unlike [aouData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aouData") @ExcludeMissing fun _aouData(): JsonField<List<Double>> = aouData

    /**
     * Returns the raw JSON value of [aouType].
     *
     * Unlike [aouType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aouType") @ExcludeMissing fun _aouType(): JsonField<String> = aouType

    /**
     * Returns the raw JSON value of [callSign].
     *
     * Unlike [callSign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callSign") @ExcludeMissing fun _callSign(): JsonField<String> = callSign

    /**
     * Returns the raw JSON value of [charlieLine].
     *
     * Unlike [charlieLine], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("charlieLine") @ExcludeMissing fun _charlieLine(): JsonField<String> = charlieLine

    /**
     * Returns the raw JSON value of [chXRef].
     *
     * Unlike [chXRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chXRef") @ExcludeMissing fun _chXRef(): JsonField<String> = chXRef

    /**
     * Returns the raw JSON value of [cntnmnt].
     *
     * Unlike [cntnmnt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cntnmnt") @ExcludeMissing fun _cntnmnt(): JsonField<Double> = cntnmnt

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
     * Returns the raw JSON value of [decay].
     *
     * Unlike [decay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decay") @ExcludeMissing fun _decay(): JsonField<Double> = decay

    /**
     * Returns the raw JSON value of [dummy].
     *
     * Unlike [dummy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dummy") @ExcludeMissing fun _dummy(): JsonField<Boolean> = dummy

    /**
     * Returns the raw JSON value of [feint].
     *
     * Unlike [feint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feint") @ExcludeMissing fun _feint(): JsonField<Boolean> = feint

    /**
     * Returns the raw JSON value of [hq].
     *
     * Unlike [hq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hq") @ExcludeMissing fun _hq(): JsonField<Boolean> = hq

    /**
     * Returns the raw JSON value of [idElset].
     *
     * Unlike [idElset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idElset") @ExcludeMissing fun _idElset(): JsonField<String> = idElset

    /**
     * Returns the raw JSON value of [identAmp].
     *
     * Unlike [identAmp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identAmp") @ExcludeMissing fun _identAmp(): JsonField<String> = identAmp

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [iff].
     *
     * Unlike [iff], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iff") @ExcludeMissing fun _iff(): JsonField<String> = iff

    /**
     * Returns the raw JSON value of [installation].
     *
     * Unlike [installation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("installation")
    @ExcludeMissing
    fun _installation(): JsonField<Boolean> = installation

    /**
     * Returns the raw JSON value of [objectType].
     *
     * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectType")
    @ExcludeMissing
    fun _objectType(): JsonField<ObjectType> = objectType

    /**
     * Returns the raw JSON value of [objIdent].
     *
     * Unlike [objIdent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objIdent") @ExcludeMissing fun _objIdent(): JsonField<ObjIdent> = objIdent

    /**
     * Returns the raw JSON value of [onOrbit].
     *
     * Unlike [onOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("onOrbit") @ExcludeMissing fun _onOrbit(): JsonField<OnorbitFull> = onOrbit

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
     * Returns the raw JSON value of [rdfRf].
     *
     * Unlike [rdfRf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rdfRF") @ExcludeMissing fun _rdfRf(): JsonField<Double> = rdfRf

    /**
     * Returns the raw JSON value of [reduced].
     *
     * Unlike [reduced], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reduced") @ExcludeMissing fun _reduced(): JsonField<Boolean> = reduced

    /**
     * Returns the raw JSON value of [reinforced].
     *
     * Unlike [reinforced], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reinforced") @ExcludeMissing fun _reinforced(): JsonField<Boolean> = reinforced

    /**
     * Returns the raw JSON value of [rptNum].
     *
     * Unlike [rptNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rptNum") @ExcludeMissing fun _rptNum(): JsonField<String> = rptNum

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [satStatus].
     *
     * Unlike [satStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satStatus") @ExcludeMissing fun _satStatus(): JsonField<String> = satStatus

    /**
     * Returns the raw JSON value of [spd].
     *
     * Unlike [spd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spd") @ExcludeMissing fun _spd(): JsonField<Double> = spd

    /**
     * Returns the raw JSON value of [taskForce].
     *
     * Unlike [taskForce], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taskForce") @ExcludeMissing fun _taskForce(): JsonField<Boolean> = taskForce

    /**
     * Returns the raw JSON value of [trackSensors].
     *
     * Unlike [trackSensors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackSensors")
    @ExcludeMissing
    fun _trackSensors(): JsonField<List<TrackSensor>> = trackSensors

    /**
     * Returns the raw JSON value of [trkId].
     *
     * Unlike [trkId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trkId") @ExcludeMissing fun _trkId(): JsonField<String> = trkId

    /**
     * Returns the raw JSON value of [vehType].
     *
     * Unlike [vehType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vehType") @ExcludeMissing fun _vehType(): JsonField<String> = vehType

    /**
     * Returns the raw JSON value of [xref].
     *
     * Unlike [xref], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xref") @ExcludeMissing fun _xref(): JsonField<String> = xref

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
         * Returns a mutable builder for constructing an instance of [HistoryListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .lat()
         * .lon()
         * .source()
         * .ts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HistoryListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var lat: JsonField<Double>? = null
        private var lon: JsonField<Double>? = null
        private var source: JsonField<String>? = null
        private var ts: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var alt: JsonField<Double> = JsonMissing.of()
        private var amplification: JsonField<String> = JsonMissing.of()
        private var angElev: JsonField<Double> = JsonMissing.of()
        private var aouData: JsonField<MutableList<Double>>? = null
        private var aouType: JsonField<String> = JsonMissing.of()
        private var callSign: JsonField<String> = JsonMissing.of()
        private var charlieLine: JsonField<String> = JsonMissing.of()
        private var chXRef: JsonField<String> = JsonMissing.of()
        private var cntnmnt: JsonField<Double> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var decay: JsonField<Double> = JsonMissing.of()
        private var dummy: JsonField<Boolean> = JsonMissing.of()
        private var feint: JsonField<Boolean> = JsonMissing.of()
        private var hq: JsonField<Boolean> = JsonMissing.of()
        private var idElset: JsonField<String> = JsonMissing.of()
        private var identAmp: JsonField<String> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var iff: JsonField<String> = JsonMissing.of()
        private var installation: JsonField<Boolean> = JsonMissing.of()
        private var objectType: JsonField<ObjectType> = JsonMissing.of()
        private var objIdent: JsonField<ObjIdent> = JsonMissing.of()
        private var onOrbit: JsonField<OnorbitFull> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var rdfRf: JsonField<Double> = JsonMissing.of()
        private var reduced: JsonField<Boolean> = JsonMissing.of()
        private var reinforced: JsonField<Boolean> = JsonMissing.of()
        private var rptNum: JsonField<String> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var satStatus: JsonField<String> = JsonMissing.of()
        private var spd: JsonField<Double> = JsonMissing.of()
        private var taskForce: JsonField<Boolean> = JsonMissing.of()
        private var trackSensors: JsonField<MutableList<TrackSensor>>? = null
        private var trkId: JsonField<String> = JsonMissing.of()
        private var vehType: JsonField<String> = JsonMissing.of()
        private var xref: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(historyListResponse: HistoryListResponse) = apply {
            classificationMarking = historyListResponse.classificationMarking
            dataMode = historyListResponse.dataMode
            lat = historyListResponse.lat
            lon = historyListResponse.lon
            source = historyListResponse.source
            ts = historyListResponse.ts
            id = historyListResponse.id
            alt = historyListResponse.alt
            amplification = historyListResponse.amplification
            angElev = historyListResponse.angElev
            aouData = historyListResponse.aouData.map { it.toMutableList() }
            aouType = historyListResponse.aouType
            callSign = historyListResponse.callSign
            charlieLine = historyListResponse.charlieLine
            chXRef = historyListResponse.chXRef
            cntnmnt = historyListResponse.cntnmnt
            countryCode = historyListResponse.countryCode
            createdAt = historyListResponse.createdAt
            createdBy = historyListResponse.createdBy
            decay = historyListResponse.decay
            dummy = historyListResponse.dummy
            feint = historyListResponse.feint
            hq = historyListResponse.hq
            idElset = historyListResponse.idElset
            identAmp = historyListResponse.identAmp
            idOnOrbit = historyListResponse.idOnOrbit
            iff = historyListResponse.iff
            installation = historyListResponse.installation
            objectType = historyListResponse.objectType
            objIdent = historyListResponse.objIdent
            onOrbit = historyListResponse.onOrbit
            origin = historyListResponse.origin
            origNetwork = historyListResponse.origNetwork
            origObjectId = historyListResponse.origObjectId
            rdfRf = historyListResponse.rdfRf
            reduced = historyListResponse.reduced
            reinforced = historyListResponse.reinforced
            rptNum = historyListResponse.rptNum
            satNo = historyListResponse.satNo
            satStatus = historyListResponse.satStatus
            spd = historyListResponse.spd
            taskForce = historyListResponse.taskForce
            trackSensors = historyListResponse.trackSensors.map { it.toMutableList() }
            trkId = historyListResponse.trkId
            vehType = historyListResponse.vehType
            xref = historyListResponse.xref
            additionalProperties = historyListResponse.additionalProperties.toMutableMap()
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

        /**
         * WGS-84 latitude of the track object subpoint, in degrees. -90 to 90 degrees (negative
         * values south of equator).
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
         * WGS-84 longitude of the track object subpoint, in degrees. -180 to 180 degrees (negative
         * values west of Prime Meridian).
         */
        fun lon(lon: Double) = lon(JsonField.of(lon))

        /**
         * Sets [Builder.lon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Track timestamp in ISO8601 UTC format, with microsecond precision. */
        fun ts(ts: OffsetDateTime) = ts(JsonField.of(ts))

        /**
         * Sets [Builder.ts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ts] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ts(ts: JsonField<OffsetDateTime>) = apply { this.ts = ts }

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

        /** Track point altitude relative to WGS-84 ellipsoid, in meters. */
        fun alt(alt: Double) = alt(JsonField.of(alt))

        /**
         * Sets [Builder.alt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alt(alt: JsonField<Double>) = apply { this.alt = alt }

        /** Free-form remarks entered for the satellite. */
        fun amplification(amplification: String) = amplification(JsonField.of(amplification))

        /**
         * Sets [Builder.amplification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amplification] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amplification(amplification: JsonField<String>) = apply {
            this.amplification = amplification
        }

        /**
         * The angle formed between the line of sight of the observer and the horizon at track
         * timestamp, in degrees. The angular range is -90 to 90, with negative values representing
         * angle of depression.
         */
        fun angElev(angElev: Double) = angElev(JsonField.of(angElev))

        /**
         * Sets [Builder.angElev] to an arbitrary JSON value.
         *
         * You should usually call [Builder.angElev] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun angElev(angElev: JsonField<Double>) = apply { this.angElev = angElev }

        /**
         * Three element array representing an Area of Uncertainty (AoU). The array element
         * definitions and units are type specific depending on the aouType specified in this
         * record:
         *
         * ELLIPSE:
         *
         * brg - orientation in degrees of the ellipse
         *
         * a1 - semi-major axis in meters
         *
         * a2 - semi-minor axis in meters
         *
         * BEARING (BEARING BOX or MTST BEARING BOX):
         *
         * brg - orientation in degrees of the bearing box
         *
         * a1 - length of bearing box in meters
         *
         * a2 - half-width of bearing box in meters
         *
         * OTHER (All other type values):
         *
         * brg - line of bearing in degrees true
         *
         * a1 - bearing error in degrees
         *
         * a2 - estimated range in meters.
         */
        fun aouData(aouData: List<Double>) = aouData(JsonField.of(aouData))

        /**
         * Sets [Builder.aouData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aouData] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aouData(aouData: JsonField<List<Double>>) = apply {
            this.aouData = aouData.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.aouData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAouData(aouData: Double) = apply {
            this.aouData =
                (this.aouData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("aouData", it).add(aouData)
                }
        }

        /**
         * The Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition. This type
         * defines the elements of the aouData array and is required if aouData is not null. See the
         * aouData field definition for specific information.
         */
        fun aouType(aouType: String) = aouType(JsonField.of(aouType))

        /**
         * Sets [Builder.aouType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aouType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun aouType(aouType: JsonField<String>) = apply { this.aouType = aouType }

        /**
         * International radio call sign assigned to the track. This is an 8-character alphanumeric
         * code.
         */
        fun callSign(callSign: String) = callSign(JsonField.of(callSign))

        /**
         * Sets [Builder.callSign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSign] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callSign(callSign: JsonField<String>) = apply { this.callSign = callSign }

        /** One-line Charlie elements set. */
        fun charlieLine(charlieLine: String) = charlieLine(JsonField.of(charlieLine))

        /**
         * Sets [Builder.charlieLine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.charlieLine] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun charlieLine(charlieLine: JsonField<String>) = apply { this.charlieLine = charlieLine }

        /**
         * The cross-reference code of the channel on which this track report was received, if the
         * report came over a comms channel.
         */
        fun chXRef(chXRef: String) = chXRef(JsonField.of(chXRef))

        /**
         * Sets [Builder.chXRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chXRef] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chXRef(chXRef: JsonField<String>) = apply { this.chXRef = chXRef }

        /**
         * The Area Of Uncertainty (AOU) percentage (0 - 100) containment value. The percentage of
         * time (90%) that the estimated area of uncertainty will cover the true position of the
         * track object.
         */
        fun cntnmnt(cntnmnt: Double) = cntnmnt(JsonField.of(cntnmnt))

        /**
         * Sets [Builder.cntnmnt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cntnmnt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cntnmnt(cntnmnt: JsonField<Double>) = apply { this.cntnmnt = cntnmnt }

        /**
         * The country code. This value is typically the ISO 3166 Alpha-2 two-character country
         * code, however it can also represent various consortiums that do not appear in the ISO
         * document. The code must correspond to an existing country in the UDL’s country API. Call
         * udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or alternate code
         * values that exist for the specified country code.
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

        /** Time the row was created in the database. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Application user who created the row in the database. */
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
         * Predicted change in Mean Motion (velocity) in radians/herg^2. herg is a unit of time
         * measure equal to 806.8120769 seconds, and is the orbital period of an imaginary satellite
         * rotating about the Earth at zero altitude.
         */
        fun decay(decay: Double) = decay(JsonField.of(decay))

        /**
         * Sets [Builder.decay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decay] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun decay(decay: JsonField<Double>) = apply { this.decay = decay }

        /**
         * Flag indicating that this track represents a dummy object or group. Identifies offensive
         * or defensive units, equipment and/or installations intended to draw the enemy's attention
         * away from the area of the main attack. Based on MIL-STD-2525 symbology definitions.
         */
        fun dummy(dummy: Boolean) = dummy(JsonField.of(dummy))

        /**
         * Sets [Builder.dummy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dummy] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dummy(dummy: JsonField<Boolean>) = apply { this.dummy = dummy }

        /**
         * Flag indicating that this track represents a feint object or group. Identifies offensive
         * or defensive units, equipment and/or installations intended to draw the enemy's attention
         * away from the area of the main attack. Based on MIL-STD-2525 symbology definitions.
         */
        fun feint(feint: Boolean) = feint(JsonField.of(feint))

        /**
         * Sets [Builder.feint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feint] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun feint(feint: JsonField<Boolean>) = apply { this.feint = feint }

        /**
         * Flag indicating that this track represents a headquarters object. Based on MIL-STD-2525
         * symbology definitions.
         */
        fun hq(hq: Boolean) = hq(JsonField.of(hq))

        /**
         * Sets [Builder.hq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hq] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hq(hq: JsonField<Boolean>) = apply { this.hq = hq }

        /** Unique identifier of the Elset associated with this object. */
        fun idElset(idElset: String) = idElset(JsonField.of(idElset))

        /**
         * Sets [Builder.idElset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idElset] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idElset(idElset: JsonField<String>) = apply { this.idElset = idElset }

        /**
         * Additional track object identity/status information, typically used for EXERCISE identity
         * amplification (FAKER, JOKER, KILO, TRAVELLER, ZOMBIE):
         *
         * FAKER: Friendly track, object, or entity acting as an exercise hostile.
         *
         * JOKER: Friendly track, object, or entity acting as an exercise suspect.
         *
         * KILO: Friendly high-value object.
         *
         * TRAVELLER: Suspect land or surface track following a recognized traffic route.
         *
         * ZOMBIE: Suspect track, object, or entity of special interest.
         */
        fun identAmp(identAmp: String) = identAmp(JsonField.of(identAmp))

        /**
         * Sets [Builder.identAmp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identAmp] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun identAmp(identAmp: JsonField<String>) = apply { this.identAmp = identAmp }

        /** Unique identifier of the target on-orbit object, if correlated. */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /** A text amplifier displaying IFF/SIF/AIS Identification modes and codes. */
        fun iff(iff: String) = iff(JsonField.of(iff))

        /**
         * Sets [Builder.iff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iff] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iff(iff: JsonField<String>) = apply { this.iff = iff }

        /**
         * Flag indicating that this track represents an installation. Based on MIL-STD-2525
         * symbology definitions.
         */
        fun installation(installation: Boolean) = installation(JsonField.of(installation))

        /**
         * Sets [Builder.installation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.installation] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun installation(installation: JsonField<Boolean>) = apply {
            this.installation = installation
        }

        /**
         * The on-orbit category assigned to this track object (DEBRIS, MANNED, PAYLOAD, PLATFORM,
         * ROCKET BODY, UNKNOWN).
         */
        fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [ObjectType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectType(objectType: JsonField<ObjectType>) = apply { this.objectType = objectType }

        /**
         * The estimated identity of the track object (ASSUMED FRIEND, FRIEND, HOSTILE, NEUTRAL,
         * PENDING, SUSPECT, UNKNOWN):
         *
         * ASSUMED FRIEND: Track assumed to be a friend due to the object characteristics, behavior,
         * and/or origin.
         *
         * FRIEND: Track object supporting friendly forces and belonging to a declared friendly
         * nation or entity.
         *
         * HOSTILE: Track object belonging to an opposing nation, party, group, or entity deemed to
         * contribute to a threat to friendly forces or their mission due to its behavior,
         * characteristics, nationality, or origin.
         *
         * NEUTRAL: Track object whose characteristics, behavior, nationality, and/or origin
         * indicate that it is neither supporting nor opposing friendly forces or their mission.
         *
         * PENDING: Track object which has not been evaluated.
         *
         * SUSPECT: Track object deemed potentially hostile due to the object characteristics,
         * behavior, nationality, and/or origin.
         *
         * UNKNOWN: Track object which has been evaluated and does not meet criteria for any
         * standard identity.
         */
        fun objIdent(objIdent: ObjIdent) = objIdent(JsonField.of(objIdent))

        /**
         * Sets [Builder.objIdent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objIdent] with a well-typed [ObjIdent] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objIdent(objIdent: JsonField<ObjIdent>) = apply { this.objIdent = objIdent }

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
         * Optional identifier provided by observation source to indicate the target on-orbit object
         * of this track. This may be an internal identifier and not necessarily a valid satellite
         * number.
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

        /** Radio frequency of the track, measured in megahertz (MHz). */
        fun rdfRf(rdfRf: Double) = rdfRf(JsonField.of(rdfRf))

        /**
         * Sets [Builder.rdfRf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rdfRf] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rdfRf(rdfRf: JsonField<Double>) = apply { this.rdfRf = rdfRf }

        /**
         * Flag indicating that this track represents a reduced object or group. Based on
         * MIL-STD-2525 symbology definitions.
         */
        fun reduced(reduced: Boolean) = reduced(JsonField.of(reduced))

        /**
         * Sets [Builder.reduced] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reduced] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reduced(reduced: JsonField<Boolean>) = apply { this.reduced = reduced }

        /**
         * Flag indicating that this track represents a reinforced object or group. Based on
         * MIL-STD-2525 symbology definitions.
         */
        fun reinforced(reinforced: Boolean) = reinforced(JsonField.of(reinforced))

        /**
         * Sets [Builder.reinforced] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reinforced] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reinforced(reinforced: JsonField<Boolean>) = apply { this.reinforced = reinforced }

        /** Report number received from the reporting source for this track. */
        fun rptNum(rptNum: String) = rptNum(JsonField.of(rptNum))

        /**
         * Sets [Builder.rptNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rptNum] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rptNum(rptNum: JsonField<String>) = apply { this.rptNum = rptNum }

        /** Satellite/catalog number of the target on-orbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /** Status of the satellite. */
        fun satStatus(satStatus: String) = satStatus(JsonField.of(satStatus))

        /**
         * Sets [Builder.satStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun satStatus(satStatus: JsonField<String>) = apply { this.satStatus = satStatus }

        /** Track object speed, in km/sec. */
        fun spd(spd: Double) = spd(JsonField.of(spd))

        /**
         * Sets [Builder.spd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spd] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spd(spd: JsonField<Double>) = apply { this.spd = spd }

        /**
         * Flag indicating that this track represents a task force. Based on MIL-STD-2525 symbology
         * definitions.
         */
        fun taskForce(taskForce: Boolean) = taskForce(JsonField.of(taskForce))

        /**
         * Sets [Builder.taskForce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskForce] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taskForce(taskForce: JsonField<Boolean>) = apply { this.taskForce = taskForce }

        /** TrackSensor Collection. */
        fun trackSensors(trackSensors: List<TrackSensor>) = trackSensors(JsonField.of(trackSensors))

        /**
         * Sets [Builder.trackSensors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackSensors] with a well-typed `List<TrackSensor>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun trackSensors(trackSensors: JsonField<List<TrackSensor>>) = apply {
            this.trackSensors = trackSensors.map { it.toMutableList() }
        }

        /**
         * Adds a single [TrackSensor] to [trackSensors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrackSensor(trackSensor: TrackSensor) = apply {
            trackSensors =
                (trackSensors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("trackSensors", it).add(trackSensor)
                }
        }

        /**
         * UUID identifying the track, which should remain the same on subsequent tracks of the same
         * object.
         */
        fun trkId(trkId: String) = trkId(JsonField.of(trkId))

        /**
         * Sets [Builder.trkId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trkId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trkId(trkId: JsonField<String>) = apply { this.trkId = trkId }

        /**
         * The type of vehicle with which the device is associated. Based on MIL-STD-2525 symbology
         * definitions.
         */
        fun vehType(vehType: String) = vehType(JsonField.of(vehType))

        /**
         * Sets [Builder.vehType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vehType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vehType(vehType: JsonField<String>) = apply { this.vehType = vehType }

        /** Source cross-reference code for the command that originated the track report. */
        fun xref(xref: String) = xref(JsonField.of(xref))

        /**
         * Sets [Builder.xref] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xref] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun xref(xref: JsonField<String>) = apply { this.xref = xref }

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
         * Returns an immutable instance of [HistoryListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .lat()
         * .lon()
         * .source()
         * .ts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HistoryListResponse =
            HistoryListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("lat", lat),
                checkRequired("lon", lon),
                checkRequired("source", source),
                checkRequired("ts", ts),
                id,
                alt,
                amplification,
                angElev,
                (aouData ?: JsonMissing.of()).map { it.toImmutable() },
                aouType,
                callSign,
                charlieLine,
                chXRef,
                cntnmnt,
                countryCode,
                createdAt,
                createdBy,
                decay,
                dummy,
                feint,
                hq,
                idElset,
                identAmp,
                idOnOrbit,
                iff,
                installation,
                objectType,
                objIdent,
                onOrbit,
                origin,
                origNetwork,
                origObjectId,
                rdfRf,
                reduced,
                reinforced,
                rptNum,
                satNo,
                satStatus,
                spd,
                taskForce,
                (trackSensors ?: JsonMissing.of()).map { it.toImmutable() },
                trkId,
                vehType,
                xref,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HistoryListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        lat()
        lon()
        source()
        ts()
        id()
        alt()
        amplification()
        angElev()
        aouData()
        aouType()
        callSign()
        charlieLine()
        chXRef()
        cntnmnt()
        countryCode()
        createdAt()
        createdBy()
        decay()
        dummy()
        feint()
        hq()
        idElset()
        identAmp()
        idOnOrbit()
        iff()
        installation()
        objectType().ifPresent { it.validate() }
        objIdent().ifPresent { it.validate() }
        onOrbit().ifPresent { it.validate() }
        origin()
        origNetwork()
        origObjectId()
        rdfRf()
        reduced()
        reinforced()
        rptNum()
        satNo()
        satStatus()
        spd()
        taskForce()
        trackSensors().ifPresent { it.forEach { it.validate() } }
        trkId()
        vehType()
        xref()
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
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (lon.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (ts.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (alt.asKnown().isPresent) 1 else 0) +
            (if (amplification.asKnown().isPresent) 1 else 0) +
            (if (angElev.asKnown().isPresent) 1 else 0) +
            (aouData.asKnown().getOrNull()?.size ?: 0) +
            (if (aouType.asKnown().isPresent) 1 else 0) +
            (if (callSign.asKnown().isPresent) 1 else 0) +
            (if (charlieLine.asKnown().isPresent) 1 else 0) +
            (if (chXRef.asKnown().isPresent) 1 else 0) +
            (if (cntnmnt.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (decay.asKnown().isPresent) 1 else 0) +
            (if (dummy.asKnown().isPresent) 1 else 0) +
            (if (feint.asKnown().isPresent) 1 else 0) +
            (if (hq.asKnown().isPresent) 1 else 0) +
            (if (idElset.asKnown().isPresent) 1 else 0) +
            (if (identAmp.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (iff.asKnown().isPresent) 1 else 0) +
            (if (installation.asKnown().isPresent) 1 else 0) +
            (objectType.asKnown().getOrNull()?.validity() ?: 0) +
            (objIdent.asKnown().getOrNull()?.validity() ?: 0) +
            (onOrbit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (rdfRf.asKnown().isPresent) 1 else 0) +
            (if (reduced.asKnown().isPresent) 1 else 0) +
            (if (reinforced.asKnown().isPresent) 1 else 0) +
            (if (rptNum.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (satStatus.asKnown().isPresent) 1 else 0) +
            (if (spd.asKnown().isPresent) 1 else 0) +
            (if (taskForce.asKnown().isPresent) 1 else 0) +
            (trackSensors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (trkId.asKnown().isPresent) 1 else 0) +
            (if (vehType.asKnown().isPresent) 1 else 0) +
            (if (xref.asKnown().isPresent) 1 else 0)

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

    /**
     * The on-orbit category assigned to this track object (DEBRIS, MANNED, PAYLOAD, PLATFORM,
     * ROCKET BODY, UNKNOWN).
     */
    class ObjectType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DEBRIS = of("DEBRIS")

            @JvmField val MANNED = of("MANNED")

            @JvmField val PAYLOAD = of("PAYLOAD")

            @JvmField val PLATFORM = of("PLATFORM")

            @JvmField val ROCKET_BODY = of("ROCKET BODY")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

        /** An enum containing [ObjectType]'s known values. */
        enum class Known {
            DEBRIS,
            MANNED,
            PAYLOAD,
            PLATFORM,
            ROCKET_BODY,
            UNKNOWN,
        }

        /**
         * An enum containing [ObjectType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ObjectType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEBRIS,
            MANNED,
            PAYLOAD,
            PLATFORM,
            ROCKET_BODY,
            UNKNOWN,
            /**
             * An enum member indicating that [ObjectType] was instantiated with an unknown value.
             */
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
                DEBRIS -> Value.DEBRIS
                MANNED -> Value.MANNED
                PAYLOAD -> Value.PAYLOAD
                PLATFORM -> Value.PLATFORM
                ROCKET_BODY -> Value.ROCKET_BODY
                UNKNOWN -> Value.UNKNOWN
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
                DEBRIS -> Known.DEBRIS
                MANNED -> Known.MANNED
                PAYLOAD -> Known.PAYLOAD
                PLATFORM -> Known.PLATFORM
                ROCKET_BODY -> Known.ROCKET_BODY
                UNKNOWN -> Known.UNKNOWN
                else -> throw UnifieddatalibraryInvalidDataException("Unknown ObjectType: $value")
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

            return /* spotless:off */ other is ObjectType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The estimated identity of the track object (ASSUMED FRIEND, FRIEND, HOSTILE, NEUTRAL,
     * PENDING, SUSPECT, UNKNOWN):
     *
     * ASSUMED FRIEND: Track assumed to be a friend due to the object characteristics, behavior,
     * and/or origin.
     *
     * FRIEND: Track object supporting friendly forces and belonging to a declared friendly nation
     * or entity.
     *
     * HOSTILE: Track object belonging to an opposing nation, party, group, or entity deemed to
     * contribute to a threat to friendly forces or their mission due to its behavior,
     * characteristics, nationality, or origin.
     *
     * NEUTRAL: Track object whose characteristics, behavior, nationality, and/or origin indicate
     * that it is neither supporting nor opposing friendly forces or their mission.
     *
     * PENDING: Track object which has not been evaluated.
     *
     * SUSPECT: Track object deemed potentially hostile due to the object characteristics, behavior,
     * nationality, and/or origin.
     *
     * UNKNOWN: Track object which has been evaluated and does not meet criteria for any standard
     * identity.
     */
    class ObjIdent @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ASSUMED_FRIEND = of("ASSUMED FRIEND")

            @JvmField val FRIEND = of("FRIEND")

            @JvmField val HOSTILE = of("HOSTILE")

            @JvmField val NEUTRAL = of("NEUTRAL")

            @JvmField val PENDING = of("PENDING")

            @JvmField val SUSPECT = of("SUSPECT")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = ObjIdent(JsonField.of(value))
        }

        /** An enum containing [ObjIdent]'s known values. */
        enum class Known {
            ASSUMED_FRIEND,
            FRIEND,
            HOSTILE,
            NEUTRAL,
            PENDING,
            SUSPECT,
            UNKNOWN,
        }

        /**
         * An enum containing [ObjIdent]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ObjIdent] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASSUMED_FRIEND,
            FRIEND,
            HOSTILE,
            NEUTRAL,
            PENDING,
            SUSPECT,
            UNKNOWN,
            /** An enum member indicating that [ObjIdent] was instantiated with an unknown value. */
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
                ASSUMED_FRIEND -> Value.ASSUMED_FRIEND
                FRIEND -> Value.FRIEND
                HOSTILE -> Value.HOSTILE
                NEUTRAL -> Value.NEUTRAL
                PENDING -> Value.PENDING
                SUSPECT -> Value.SUSPECT
                UNKNOWN -> Value.UNKNOWN
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
                ASSUMED_FRIEND -> Known.ASSUMED_FRIEND
                FRIEND -> Known.FRIEND
                HOSTILE -> Known.HOSTILE
                NEUTRAL -> Known.NEUTRAL
                PENDING -> Known.PENDING
                SUSPECT -> Known.SUSPECT
                UNKNOWN -> Known.UNKNOWN
                else -> throw UnifieddatalibraryInvalidDataException("Unknown ObjIdent: $value")
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

        fun validate(): ObjIdent = apply {
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

            return /* spotless:off */ other is ObjIdent && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Schema for Track Sensor data. */
    class TrackSensor
    private constructor(
        private val az: JsonField<Double>,
        private val range: JsonField<Double>,
        private val minRangeLimit: JsonField<Double>,
        private val missionNumber: JsonField<String>,
        private val sensorFovType: JsonField<SensorFovType>,
        private val sensorName: JsonField<String>,
        private val sensorNumber: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("az") @ExcludeMissing az: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("range") @ExcludeMissing range: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("minRangeLimit")
            @ExcludeMissing
            minRangeLimit: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("missionNumber")
            @ExcludeMissing
            missionNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sensorFOVType")
            @ExcludeMissing
            sensorFovType: JsonField<SensorFovType> = JsonMissing.of(),
            @JsonProperty("sensorName")
            @ExcludeMissing
            sensorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sensorNumber")
            @ExcludeMissing
            sensorNumber: JsonField<Int> = JsonMissing.of(),
        ) : this(
            az,
            range,
            minRangeLimit,
            missionNumber,
            sensorFovType,
            sensorName,
            sensorNumber,
            mutableMapOf(),
        )

        /**
         * The observing sensor azimuth angle, in degrees and topocentric frame.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun az(): Double = az.getRequired("az")

        /**
         * The track object range from the observing sensor, in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun range(): Double = range.getRequired("range")

        /**
         * Minimum range measurement capability of the sensor, in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun minRangeLimit(): Optional<Double> = minRangeLimit.getOptional("minRangeLimit")

        /**
         * The mission number which produced this track observation.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionNumber(): Optional<String> = missionNumber.getOptional("missionNumber")

        /**
         * The field of view (FOV) type (Butterfly, Cone Angular, Cone Distance, Horizon to Horizon,
         * Unknown) employed by the sensor observing this object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sensorFovType(): Optional<SensorFovType> = sensorFovType.getOptional("sensorFOVType")

        /**
         * Unique name of this sensor.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sensorName(): Optional<String> = sensorName.getOptional("sensorName")

        /**
         * Number assigned to this sensor. Since there is no authoritative numbering scheme, these
         * numbers sometimes collide across sensors (especially commercial sensors). It is therefore
         * not a unique identifier.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sensorNumber(): Optional<Int> = sensorNumber.getOptional("sensorNumber")

        /**
         * Returns the raw JSON value of [az].
         *
         * Unlike [az], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("az") @ExcludeMissing fun _az(): JsonField<Double> = az

        /**
         * Returns the raw JSON value of [range].
         *
         * Unlike [range], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("range") @ExcludeMissing fun _range(): JsonField<Double> = range

        /**
         * Returns the raw JSON value of [minRangeLimit].
         *
         * Unlike [minRangeLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minRangeLimit")
        @ExcludeMissing
        fun _minRangeLimit(): JsonField<Double> = minRangeLimit

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
         * Returns the raw JSON value of [sensorFovType].
         *
         * Unlike [sensorFovType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sensorFOVType")
        @ExcludeMissing
        fun _sensorFovType(): JsonField<SensorFovType> = sensorFovType

        /**
         * Returns the raw JSON value of [sensorName].
         *
         * Unlike [sensorName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sensorName")
        @ExcludeMissing
        fun _sensorName(): JsonField<String> = sensorName

        /**
         * Returns the raw JSON value of [sensorNumber].
         *
         * Unlike [sensorNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sensorNumber")
        @ExcludeMissing
        fun _sensorNumber(): JsonField<Int> = sensorNumber

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
             * Returns a mutable builder for constructing an instance of [TrackSensor].
             *
             * The following fields are required:
             * ```java
             * .az()
             * .range()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TrackSensor]. */
        class Builder internal constructor() {

            private var az: JsonField<Double>? = null
            private var range: JsonField<Double>? = null
            private var minRangeLimit: JsonField<Double> = JsonMissing.of()
            private var missionNumber: JsonField<String> = JsonMissing.of()
            private var sensorFovType: JsonField<SensorFovType> = JsonMissing.of()
            private var sensorName: JsonField<String> = JsonMissing.of()
            private var sensorNumber: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trackSensor: TrackSensor) = apply {
                az = trackSensor.az
                range = trackSensor.range
                minRangeLimit = trackSensor.minRangeLimit
                missionNumber = trackSensor.missionNumber
                sensorFovType = trackSensor.sensorFovType
                sensorName = trackSensor.sensorName
                sensorNumber = trackSensor.sensorNumber
                additionalProperties = trackSensor.additionalProperties.toMutableMap()
            }

            /** The observing sensor azimuth angle, in degrees and topocentric frame. */
            fun az(az: Double) = az(JsonField.of(az))

            /**
             * Sets [Builder.az] to an arbitrary JSON value.
             *
             * You should usually call [Builder.az] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun az(az: JsonField<Double>) = apply { this.az = az }

            /** The track object range from the observing sensor, in kilometers. */
            fun range(range: Double) = range(JsonField.of(range))

            /**
             * Sets [Builder.range] to an arbitrary JSON value.
             *
             * You should usually call [Builder.range] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun range(range: JsonField<Double>) = apply { this.range = range }

            /** Minimum range measurement capability of the sensor, in kilometers. */
            fun minRangeLimit(minRangeLimit: Double) = minRangeLimit(JsonField.of(minRangeLimit))

            /**
             * Sets [Builder.minRangeLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minRangeLimit] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minRangeLimit(minRangeLimit: JsonField<Double>) = apply {
                this.minRangeLimit = minRangeLimit
            }

            /** The mission number which produced this track observation. */
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

            /**
             * The field of view (FOV) type (Butterfly, Cone Angular, Cone Distance, Horizon to
             * Horizon, Unknown) employed by the sensor observing this object.
             */
            fun sensorFovType(sensorFovType: SensorFovType) =
                sensorFovType(JsonField.of(sensorFovType))

            /**
             * Sets [Builder.sensorFovType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sensorFovType] with a well-typed [SensorFovType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sensorFovType(sensorFovType: JsonField<SensorFovType>) = apply {
                this.sensorFovType = sensorFovType
            }

            /** Unique name of this sensor. */
            fun sensorName(sensorName: String) = sensorName(JsonField.of(sensorName))

            /**
             * Sets [Builder.sensorName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sensorName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sensorName(sensorName: JsonField<String>) = apply { this.sensorName = sensorName }

            /**
             * Number assigned to this sensor. Since there is no authoritative numbering scheme,
             * these numbers sometimes collide across sensors (especially commercial sensors). It is
             * therefore not a unique identifier.
             */
            fun sensorNumber(sensorNumber: Int) = sensorNumber(JsonField.of(sensorNumber))

            /**
             * Sets [Builder.sensorNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sensorNumber] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sensorNumber(sensorNumber: JsonField<Int>) = apply {
                this.sensorNumber = sensorNumber
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
             * Returns an immutable instance of [TrackSensor].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .az()
             * .range()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TrackSensor =
                TrackSensor(
                    checkRequired("az", az),
                    checkRequired("range", range),
                    minRangeLimit,
                    missionNumber,
                    sensorFovType,
                    sensorName,
                    sensorNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TrackSensor = apply {
            if (validated) {
                return@apply
            }

            az()
            range()
            minRangeLimit()
            missionNumber()
            sensorFovType().ifPresent { it.validate() }
            sensorName()
            sensorNumber()
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
            (if (az.asKnown().isPresent) 1 else 0) +
                (if (range.asKnown().isPresent) 1 else 0) +
                (if (minRangeLimit.asKnown().isPresent) 1 else 0) +
                (if (missionNumber.asKnown().isPresent) 1 else 0) +
                (sensorFovType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sensorName.asKnown().isPresent) 1 else 0) +
                (if (sensorNumber.asKnown().isPresent) 1 else 0)

        /**
         * The field of view (FOV) type (Butterfly, Cone Angular, Cone Distance, Horizon to Horizon,
         * Unknown) employed by the sensor observing this object.
         */
        class SensorFovType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val BUTTERFLY = of("BUTTERFLY")

                @JvmField val CONE_ANGULAR = of("CONE ANGULAR")

                @JvmField val CONE_DISTANCE = of("CONE DISTANCE")

                @JvmField val HORIZON_TO_HORIZON = of("HORIZON TO HORIZON")

                @JvmField val UNKNOWN = of("UNKNOWN")

                @JvmStatic fun of(value: String) = SensorFovType(JsonField.of(value))
            }

            /** An enum containing [SensorFovType]'s known values. */
            enum class Known {
                BUTTERFLY,
                CONE_ANGULAR,
                CONE_DISTANCE,
                HORIZON_TO_HORIZON,
                UNKNOWN,
            }

            /**
             * An enum containing [SensorFovType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SensorFovType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BUTTERFLY,
                CONE_ANGULAR,
                CONE_DISTANCE,
                HORIZON_TO_HORIZON,
                UNKNOWN,
                /**
                 * An enum member indicating that [SensorFovType] was instantiated with an unknown
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
                    BUTTERFLY -> Value.BUTTERFLY
                    CONE_ANGULAR -> Value.CONE_ANGULAR
                    CONE_DISTANCE -> Value.CONE_DISTANCE
                    HORIZON_TO_HORIZON -> Value.HORIZON_TO_HORIZON
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
                    BUTTERFLY -> Known.BUTTERFLY
                    CONE_ANGULAR -> Known.CONE_ANGULAR
                    CONE_DISTANCE -> Known.CONE_DISTANCE
                    HORIZON_TO_HORIZON -> Known.HORIZON_TO_HORIZON
                    UNKNOWN -> Known.UNKNOWN
                    else ->
                        throw UnifieddatalibraryInvalidDataException(
                            "Unknown SensorFovType: $value"
                        )
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

            fun validate(): SensorFovType = apply {
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

                return /* spotless:off */ other is SensorFovType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrackSensor && az == other.az && range == other.range && minRangeLimit == other.minRangeLimit && missionNumber == other.missionNumber && sensorFovType == other.sensorFovType && sensorName == other.sensorName && sensorNumber == other.sensorNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(az, range, minRangeLimit, missionNumber, sensorFovType, sensorName, sensorNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrackSensor{az=$az, range=$range, minRangeLimit=$minRangeLimit, missionNumber=$missionNumber, sensorFovType=$sensorFovType, sensorName=$sensorName, sensorNumber=$sensorNumber, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HistoryListResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && lat == other.lat && lon == other.lon && source == other.source && ts == other.ts && id == other.id && alt == other.alt && amplification == other.amplification && angElev == other.angElev && aouData == other.aouData && aouType == other.aouType && callSign == other.callSign && charlieLine == other.charlieLine && chXRef == other.chXRef && cntnmnt == other.cntnmnt && countryCode == other.countryCode && createdAt == other.createdAt && createdBy == other.createdBy && decay == other.decay && dummy == other.dummy && feint == other.feint && hq == other.hq && idElset == other.idElset && identAmp == other.identAmp && idOnOrbit == other.idOnOrbit && iff == other.iff && installation == other.installation && objectType == other.objectType && objIdent == other.objIdent && onOrbit == other.onOrbit && origin == other.origin && origNetwork == other.origNetwork && origObjectId == other.origObjectId && rdfRf == other.rdfRf && reduced == other.reduced && reinforced == other.reinforced && rptNum == other.rptNum && satNo == other.satNo && satStatus == other.satStatus && spd == other.spd && taskForce == other.taskForce && trackSensors == other.trackSensors && trkId == other.trkId && vehType == other.vehType && xref == other.xref && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, lat, lon, source, ts, id, alt, amplification, angElev, aouData, aouType, callSign, charlieLine, chXRef, cntnmnt, countryCode, createdAt, createdBy, decay, dummy, feint, hq, idElset, identAmp, idOnOrbit, iff, installation, objectType, objIdent, onOrbit, origin, origNetwork, origObjectId, rdfRf, reduced, reinforced, rptNum, satNo, satStatus, spd, taskForce, trackSensors, trkId, vehType, xref, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HistoryListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, lat=$lat, lon=$lon, source=$source, ts=$ts, id=$id, alt=$alt, amplification=$amplification, angElev=$angElev, aouData=$aouData, aouType=$aouType, callSign=$callSign, charlieLine=$charlieLine, chXRef=$chXRef, cntnmnt=$cntnmnt, countryCode=$countryCode, createdAt=$createdAt, createdBy=$createdBy, decay=$decay, dummy=$dummy, feint=$feint, hq=$hq, idElset=$idElset, identAmp=$identAmp, idOnOrbit=$idOnOrbit, iff=$iff, installation=$installation, objectType=$objectType, objIdent=$objIdent, onOrbit=$onOrbit, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, rdfRf=$rdfRf, reduced=$reduced, reinforced=$reinforced, rptNum=$rptNum, satNo=$satNo, satStatus=$satStatus, spd=$spd, taskForce=$taskForce, trackSensors=$trackSensors, trkId=$trkId, vehType=$vehType, xref=$xref, additionalProperties=$additionalProperties}"
}

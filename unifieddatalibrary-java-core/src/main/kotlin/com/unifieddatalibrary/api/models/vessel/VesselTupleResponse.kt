// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.vessel

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
import com.unifieddatalibrary.api.models.EntityFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * This service provides operations for manipulation and querying of maritime Vessel data. Vessel
 * contains the static data of the specific vessel: mmsi, cruise speed, max speed, etc.
 */
class VesselTupleResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val altVesselId: JsonField<String>,
    private val callsign: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val entity: JsonField<EntityFull>,
    private val firstSeen: JsonField<OffsetDateTime>,
    private val hullNum: JsonField<String>,
    private val idEntity: JsonField<String>,
    private val idOrganization: JsonField<String>,
    private val imon: JsonField<Int>,
    private val length: JsonField<Double>,
    private val maxDraught: JsonField<Double>,
    private val maxSpeed: JsonField<Double>,
    private val mmsi: JsonField<String>,
    private val numBlades: JsonField<Int>,
    private val numShafts: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val propType: JsonField<String>,
    private val sconum: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val status: JsonField<String>,
    private val sternType: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val vesselBuilder: JsonField<String>,
    private val vesselClass: JsonField<String>,
    private val vesselDescription: JsonField<String>,
    private val vesselFlag: JsonField<String>,
    private val vesselName: JsonField<String>,
    private val vesselType: JsonField<String>,
    private val vslWt: JsonField<Double>,
    private val width: JsonField<Double>,
    private val yearBuilt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altVesselId")
        @ExcludeMissing
        altVesselId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("callsign") @ExcludeMissing callsign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entity") @ExcludeMissing entity: JsonField<EntityFull> = JsonMissing.of(),
        @JsonProperty("firstSeen")
        @ExcludeMissing
        firstSeen: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hullNum") @ExcludeMissing hullNum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idEntity") @ExcludeMissing idEntity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOrganization")
        @ExcludeMissing
        idOrganization: JsonField<String> = JsonMissing.of(),
        @JsonProperty("imon") @ExcludeMissing imon: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("length") @ExcludeMissing length: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxDraught")
        @ExcludeMissing
        maxDraught: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxSpeed") @ExcludeMissing maxSpeed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("mmsi") @ExcludeMissing mmsi: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numBlades") @ExcludeMissing numBlades: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numShafts") @ExcludeMissing numShafts: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propType") @ExcludeMissing propType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sconum") @ExcludeMissing sconum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sternType") @ExcludeMissing sternType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vesselBuilder")
        @ExcludeMissing
        vesselBuilder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vesselClass")
        @ExcludeMissing
        vesselClass: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vesselDescription")
        @ExcludeMissing
        vesselDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vesselFlag")
        @ExcludeMissing
        vesselFlag: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vesselName")
        @ExcludeMissing
        vesselName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vesselType")
        @ExcludeMissing
        vesselType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vslWt") @ExcludeMissing vslWt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("yearBuilt") @ExcludeMissing yearBuilt: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        id,
        altVesselId,
        callsign,
        createdAt,
        createdBy,
        entity,
        firstSeen,
        hullNum,
        idEntity,
        idOrganization,
        imon,
        length,
        maxDraught,
        maxSpeed,
        mmsi,
        numBlades,
        numShafts,
        origin,
        origNetwork,
        propType,
        sconum,
        sourceDl,
        status,
        sternType,
        updatedAt,
        updatedBy,
        vesselBuilder,
        vesselClass,
        vesselDescription,
        vesselFlag,
        vesselName,
        vesselType,
        vslWt,
        width,
        yearBuilt,
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
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The original source Id for this vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altVesselId(): Optional<String> = altVesselId.getOptional("altVesselId")

    /**
     * A uniquely designated identifier for the vessel's transmitter station. All radio
     * transmissions must be individually identified by the call sign. Merchant and naval vessels
     * are assigned call signs by their national licensing authorities.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun callsign(): Optional<String> = callsign.getOptional("callsign")

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
     * An entity is a generic representation of any object within a space/SSA system such as
     * sensors, on-orbit objects, RF Emitters, space craft buses, etc. An entity can have an
     * operating unit, a location (if terrestrial), and statuses.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun entity(): Optional<EntityFull> = entity.getOptional("entity")

    /**
     * The date this vessel was first seen.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun firstSeen(): Optional<OffsetDateTime> = firstSeen.getOptional("firstSeen")

    /**
     * The vessel hull number designation of this maritime vessel. The hull number is a 1-6
     * character alphanumeric entry assigned to a ship and painted on the hull.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hullNum(): Optional<String> = hullNum.getOptional("hullNum")

    /**
     * Unique identifier of the parent entity. idEntity is required for Put.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idEntity(): Optional<String> = idEntity.getOptional("idEntity")

    /**
     * The UDL ID of the organization that owns the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOrganization(): Optional<String> = idOrganization.getOptional("idOrganization")

    /**
     * The International Maritime Organization Number of the vessel. IMON is a seven-digit number
     * that uniquely identifies the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun imon(): Optional<Int> = imon.getOptional("imon")

    /**
     * The overall length of the vessel, in meters. A value of 511 indicates a vessel length of 511
     * meters or greater.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun length(): Optional<Double> = length.getOptional("length")

    /**
     * The maximum static draught, in meters, of the vessel defined as the distance between the
     * ship’s keel and the waterline of the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxDraught(): Optional<Double> = maxDraught.getOptional("maxDraught")

    /**
     * The maximum possible speed of this vessel in meters per second.
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
    fun mmsi(): Optional<String> = mmsi.getOptional("mmsi")

    /**
     * The number of blades per shaft for this vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numBlades(): Optional<Int> = numBlades.getOptional("numBlades")

    /**
     * The number of shafts on this vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numShafts(): Optional<Int> = numShafts.getOptional("numShafts")

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
     * The type of propulsion employed by this vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun propType(): Optional<String> = propType.getOptional("propType")

    /**
     * The Ship Control Number (SCONUM) is a naval vessel identification number (alphanumeric code)
     * assigned by the Office of Naval Intelligence. SCONUM is sometimes referred to as NOIC ID.
     * SCONUMs are typically of the form A#####, where A is an alpha character and # is numerical.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sconum(): Optional<String> = sconum.getOptional("sconum")

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
     * The status of this vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * The stern type code (Counter, Cruiser) associated with this vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sternType(): Optional<String> = sternType.getOptional("sternType")

    /**
     * Time the row was updated in the database, auto-populated by the system.
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
     * The shipbuilder who built this vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vesselBuilder(): Optional<String> = vesselBuilder.getOptional("vesselBuilder")

    /**
     * The common name for a group of ships with similar design, usually named for the first vessel
     * of the class.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vesselClass(): Optional<String> = vesselClass.getOptional("vesselClass")

    /**
     * Further description or explanation of the vessel or type.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vesselDescription(): Optional<String> = vesselDescription.getOptional("vesselDescription")

    /**
     * The flag of the subject vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vesselFlag(): Optional<String> = vesselFlag.getOptional("vesselFlag")

    /**
     * The name of this vessel. Vessel names that exceed the AIS 20 character are shortened (not
     * truncated) to 15 character-spaces, followed by an underscore and the last 4 characters-spaces
     * of the vessel full name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vesselName(): Optional<String> = vesselName.getOptional("vesselName")

    /**
     * The reported ship type (e.g. Passenger, Tanker, Cargo, Other, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vesselType(): Optional<String> = vesselType.getOptional("vesselType")

    /**
     * The weight in tons, of this vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vslWt(): Optional<Double> = vslWt.getOptional("vslWt")

    /**
     * The breadth of the vessel, in meters. A value of 63 indicates a vessel breadth of 63 meters
     * or greater.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun width(): Optional<Double> = width.getOptional("width")

    /**
     * Year the vessel went into service.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yearBuilt(): Optional<String> = yearBuilt.getOptional("yearBuilt")

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [altVesselId].
     *
     * Unlike [altVesselId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altVesselId") @ExcludeMissing fun _altVesselId(): JsonField<String> = altVesselId

    /**
     * Returns the raw JSON value of [callsign].
     *
     * Unlike [callsign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callsign") @ExcludeMissing fun _callsign(): JsonField<String> = callsign

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
     * Returns the raw JSON value of [firstSeen].
     *
     * Unlike [firstSeen], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstSeen")
    @ExcludeMissing
    fun _firstSeen(): JsonField<OffsetDateTime> = firstSeen

    /**
     * Returns the raw JSON value of [hullNum].
     *
     * Unlike [hullNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hullNum") @ExcludeMissing fun _hullNum(): JsonField<String> = hullNum

    /**
     * Returns the raw JSON value of [idEntity].
     *
     * Unlike [idEntity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idEntity") @ExcludeMissing fun _idEntity(): JsonField<String> = idEntity

    /**
     * Returns the raw JSON value of [idOrganization].
     *
     * Unlike [idOrganization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOrganization")
    @ExcludeMissing
    fun _idOrganization(): JsonField<String> = idOrganization

    /**
     * Returns the raw JSON value of [imon].
     *
     * Unlike [imon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imon") @ExcludeMissing fun _imon(): JsonField<Int> = imon

    /**
     * Returns the raw JSON value of [length].
     *
     * Unlike [length], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Double> = length

    /**
     * Returns the raw JSON value of [maxDraught].
     *
     * Unlike [maxDraught], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxDraught") @ExcludeMissing fun _maxDraught(): JsonField<Double> = maxDraught

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
    @JsonProperty("mmsi") @ExcludeMissing fun _mmsi(): JsonField<String> = mmsi

    /**
     * Returns the raw JSON value of [numBlades].
     *
     * Unlike [numBlades], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numBlades") @ExcludeMissing fun _numBlades(): JsonField<Int> = numBlades

    /**
     * Returns the raw JSON value of [numShafts].
     *
     * Unlike [numShafts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numShafts") @ExcludeMissing fun _numShafts(): JsonField<Int> = numShafts

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
     * Returns the raw JSON value of [propType].
     *
     * Unlike [propType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propType") @ExcludeMissing fun _propType(): JsonField<String> = propType

    /**
     * Returns the raw JSON value of [sconum].
     *
     * Unlike [sconum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sconum") @ExcludeMissing fun _sconum(): JsonField<String> = sconum

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [sternType].
     *
     * Unlike [sternType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sternType") @ExcludeMissing fun _sternType(): JsonField<String> = sternType

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
     * Returns the raw JSON value of [vesselBuilder].
     *
     * Unlike [vesselBuilder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vesselBuilder")
    @ExcludeMissing
    fun _vesselBuilder(): JsonField<String> = vesselBuilder

    /**
     * Returns the raw JSON value of [vesselClass].
     *
     * Unlike [vesselClass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vesselClass") @ExcludeMissing fun _vesselClass(): JsonField<String> = vesselClass

    /**
     * Returns the raw JSON value of [vesselDescription].
     *
     * Unlike [vesselDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("vesselDescription")
    @ExcludeMissing
    fun _vesselDescription(): JsonField<String> = vesselDescription

    /**
     * Returns the raw JSON value of [vesselFlag].
     *
     * Unlike [vesselFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vesselFlag") @ExcludeMissing fun _vesselFlag(): JsonField<String> = vesselFlag

    /**
     * Returns the raw JSON value of [vesselName].
     *
     * Unlike [vesselName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vesselName") @ExcludeMissing fun _vesselName(): JsonField<String> = vesselName

    /**
     * Returns the raw JSON value of [vesselType].
     *
     * Unlike [vesselType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vesselType") @ExcludeMissing fun _vesselType(): JsonField<String> = vesselType

    /**
     * Returns the raw JSON value of [vslWt].
     *
     * Unlike [vslWt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vslWt") @ExcludeMissing fun _vslWt(): JsonField<Double> = vslWt

    /**
     * Returns the raw JSON value of [width].
     *
     * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Double> = width

    /**
     * Returns the raw JSON value of [yearBuilt].
     *
     * Unlike [yearBuilt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yearBuilt") @ExcludeMissing fun _yearBuilt(): JsonField<String> = yearBuilt

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
         * Returns a mutable builder for constructing an instance of [VesselTupleResponse].
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

    /** A builder for [VesselTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var altVesselId: JsonField<String> = JsonMissing.of()
        private var callsign: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var entity: JsonField<EntityFull> = JsonMissing.of()
        private var firstSeen: JsonField<OffsetDateTime> = JsonMissing.of()
        private var hullNum: JsonField<String> = JsonMissing.of()
        private var idEntity: JsonField<String> = JsonMissing.of()
        private var idOrganization: JsonField<String> = JsonMissing.of()
        private var imon: JsonField<Int> = JsonMissing.of()
        private var length: JsonField<Double> = JsonMissing.of()
        private var maxDraught: JsonField<Double> = JsonMissing.of()
        private var maxSpeed: JsonField<Double> = JsonMissing.of()
        private var mmsi: JsonField<String> = JsonMissing.of()
        private var numBlades: JsonField<Int> = JsonMissing.of()
        private var numShafts: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var propType: JsonField<String> = JsonMissing.of()
        private var sconum: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var sternType: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var vesselBuilder: JsonField<String> = JsonMissing.of()
        private var vesselClass: JsonField<String> = JsonMissing.of()
        private var vesselDescription: JsonField<String> = JsonMissing.of()
        private var vesselFlag: JsonField<String> = JsonMissing.of()
        private var vesselName: JsonField<String> = JsonMissing.of()
        private var vesselType: JsonField<String> = JsonMissing.of()
        private var vslWt: JsonField<Double> = JsonMissing.of()
        private var width: JsonField<Double> = JsonMissing.of()
        private var yearBuilt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(vesselTupleResponse: VesselTupleResponse) = apply {
            classificationMarking = vesselTupleResponse.classificationMarking
            dataMode = vesselTupleResponse.dataMode
            source = vesselTupleResponse.source
            id = vesselTupleResponse.id
            altVesselId = vesselTupleResponse.altVesselId
            callsign = vesselTupleResponse.callsign
            createdAt = vesselTupleResponse.createdAt
            createdBy = vesselTupleResponse.createdBy
            entity = vesselTupleResponse.entity
            firstSeen = vesselTupleResponse.firstSeen
            hullNum = vesselTupleResponse.hullNum
            idEntity = vesselTupleResponse.idEntity
            idOrganization = vesselTupleResponse.idOrganization
            imon = vesselTupleResponse.imon
            length = vesselTupleResponse.length
            maxDraught = vesselTupleResponse.maxDraught
            maxSpeed = vesselTupleResponse.maxSpeed
            mmsi = vesselTupleResponse.mmsi
            numBlades = vesselTupleResponse.numBlades
            numShafts = vesselTupleResponse.numShafts
            origin = vesselTupleResponse.origin
            origNetwork = vesselTupleResponse.origNetwork
            propType = vesselTupleResponse.propType
            sconum = vesselTupleResponse.sconum
            sourceDl = vesselTupleResponse.sourceDl
            status = vesselTupleResponse.status
            sternType = vesselTupleResponse.sternType
            updatedAt = vesselTupleResponse.updatedAt
            updatedBy = vesselTupleResponse.updatedBy
            vesselBuilder = vesselTupleResponse.vesselBuilder
            vesselClass = vesselTupleResponse.vesselClass
            vesselDescription = vesselTupleResponse.vesselDescription
            vesselFlag = vesselTupleResponse.vesselFlag
            vesselName = vesselTupleResponse.vesselName
            vesselType = vesselTupleResponse.vesselType
            vslWt = vesselTupleResponse.vslWt
            width = vesselTupleResponse.width
            yearBuilt = vesselTupleResponse.yearBuilt
            additionalProperties = vesselTupleResponse.additionalProperties.toMutableMap()
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

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The original source Id for this vessel. */
        fun altVesselId(altVesselId: String) = altVesselId(JsonField.of(altVesselId))

        /**
         * Sets [Builder.altVesselId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altVesselId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun altVesselId(altVesselId: JsonField<String>) = apply { this.altVesselId = altVesselId }

        /**
         * A uniquely designated identifier for the vessel's transmitter station. All radio
         * transmissions must be individually identified by the call sign. Merchant and naval
         * vessels are assigned call signs by their national licensing authorities.
         */
        fun callsign(callsign: String) = callsign(JsonField.of(callsign))

        /**
         * Sets [Builder.callsign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callsign] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callsign(callsign: JsonField<String>) = apply { this.callsign = callsign }

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
         * An entity is a generic representation of any object within a space/SSA system such as
         * sensors, on-orbit objects, RF Emitters, space craft buses, etc. An entity can have an
         * operating unit, a location (if terrestrial), and statuses.
         */
        fun entity(entity: EntityFull) = entity(JsonField.of(entity))

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [EntityFull] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entity(entity: JsonField<EntityFull>) = apply { this.entity = entity }

        /** The date this vessel was first seen. */
        fun firstSeen(firstSeen: OffsetDateTime) = firstSeen(JsonField.of(firstSeen))

        /**
         * Sets [Builder.firstSeen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstSeen] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun firstSeen(firstSeen: JsonField<OffsetDateTime>) = apply { this.firstSeen = firstSeen }

        /**
         * The vessel hull number designation of this maritime vessel. The hull number is a 1-6
         * character alphanumeric entry assigned to a ship and painted on the hull.
         */
        fun hullNum(hullNum: String) = hullNum(JsonField.of(hullNum))

        /**
         * Sets [Builder.hullNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hullNum] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hullNum(hullNum: JsonField<String>) = apply { this.hullNum = hullNum }

        /** Unique identifier of the parent entity. idEntity is required for Put. */
        fun idEntity(idEntity: String) = idEntity(JsonField.of(idEntity))

        /**
         * Sets [Builder.idEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idEntity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idEntity(idEntity: JsonField<String>) = apply { this.idEntity = idEntity }

        /** The UDL ID of the organization that owns the vessel. */
        fun idOrganization(idOrganization: String) = idOrganization(JsonField.of(idOrganization))

        /**
         * Sets [Builder.idOrganization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOrganization] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idOrganization(idOrganization: JsonField<String>) = apply {
            this.idOrganization = idOrganization
        }

        /**
         * The International Maritime Organization Number of the vessel. IMON is a seven-digit
         * number that uniquely identifies the vessel.
         */
        fun imon(imon: Int) = imon(JsonField.of(imon))

        /**
         * Sets [Builder.imon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imon] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imon(imon: JsonField<Int>) = apply { this.imon = imon }

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
         * The maximum static draught, in meters, of the vessel defined as the distance between the
         * ship’s keel and the waterline of the vessel.
         */
        fun maxDraught(maxDraught: Double) = maxDraught(JsonField.of(maxDraught))

        /**
         * Sets [Builder.maxDraught] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDraught] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxDraught(maxDraught: JsonField<Double>) = apply { this.maxDraught = maxDraught }

        /** The maximum possible speed of this vessel in meters per second. */
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
        fun mmsi(mmsi: String) = mmsi(JsonField.of(mmsi))

        /**
         * Sets [Builder.mmsi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mmsi] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mmsi(mmsi: JsonField<String>) = apply { this.mmsi = mmsi }

        /** The number of blades per shaft for this vessel. */
        fun numBlades(numBlades: Int) = numBlades(JsonField.of(numBlades))

        /**
         * Sets [Builder.numBlades] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numBlades] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numBlades(numBlades: JsonField<Int>) = apply { this.numBlades = numBlades }

        /** The number of shafts on this vessel. */
        fun numShafts(numShafts: Int) = numShafts(JsonField.of(numShafts))

        /**
         * Sets [Builder.numShafts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numShafts] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numShafts(numShafts: JsonField<Int>) = apply { this.numShafts = numShafts }

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

        /** The type of propulsion employed by this vessel. */
        fun propType(propType: String) = propType(JsonField.of(propType))

        /**
         * Sets [Builder.propType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun propType(propType: JsonField<String>) = apply { this.propType = propType }

        /**
         * The Ship Control Number (SCONUM) is a naval vessel identification number (alphanumeric
         * code) assigned by the Office of Naval Intelligence. SCONUM is sometimes referred to as
         * NOIC ID. SCONUMs are typically of the form A#####, where A is an alpha character and # is
         * numerical.
         */
        fun sconum(sconum: String) = sconum(JsonField.of(sconum))

        /**
         * Sets [Builder.sconum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sconum] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sconum(sconum: JsonField<String>) = apply { this.sconum = sconum }

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

        /** The status of this vessel. */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** The stern type code (Counter, Cruiser) associated with this vessel. */
        fun sternType(sternType: String) = sternType(JsonField.of(sternType))

        /**
         * Sets [Builder.sternType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sternType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sternType(sternType: JsonField<String>) = apply { this.sternType = sternType }

        /** Time the row was updated in the database, auto-populated by the system. */
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

        /** The shipbuilder who built this vessel. */
        fun vesselBuilder(vesselBuilder: String) = vesselBuilder(JsonField.of(vesselBuilder))

        /**
         * Sets [Builder.vesselBuilder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vesselBuilder] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vesselBuilder(vesselBuilder: JsonField<String>) = apply {
            this.vesselBuilder = vesselBuilder
        }

        /**
         * The common name for a group of ships with similar design, usually named for the first
         * vessel of the class.
         */
        fun vesselClass(vesselClass: String) = vesselClass(JsonField.of(vesselClass))

        /**
         * Sets [Builder.vesselClass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vesselClass] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vesselClass(vesselClass: JsonField<String>) = apply { this.vesselClass = vesselClass }

        /** Further description or explanation of the vessel or type. */
        fun vesselDescription(vesselDescription: String) =
            vesselDescription(JsonField.of(vesselDescription))

        /**
         * Sets [Builder.vesselDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vesselDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vesselDescription(vesselDescription: JsonField<String>) = apply {
            this.vesselDescription = vesselDescription
        }

        /** The flag of the subject vessel. */
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
         * The name of this vessel. Vessel names that exceed the AIS 20 character are shortened (not
         * truncated) to 15 character-spaces, followed by an underscore and the last 4
         * characters-spaces of the vessel full name.
         */
        fun vesselName(vesselName: String) = vesselName(JsonField.of(vesselName))

        /**
         * Sets [Builder.vesselName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vesselName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vesselName(vesselName: JsonField<String>) = apply { this.vesselName = vesselName }

        /** The reported ship type (e.g. Passenger, Tanker, Cargo, Other, etc.). */
        fun vesselType(vesselType: String) = vesselType(JsonField.of(vesselType))

        /**
         * Sets [Builder.vesselType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vesselType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vesselType(vesselType: JsonField<String>) = apply { this.vesselType = vesselType }

        /** The weight in tons, of this vessel. */
        fun vslWt(vslWt: Double) = vslWt(JsonField.of(vslWt))

        /**
         * Sets [Builder.vslWt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vslWt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vslWt(vslWt: JsonField<Double>) = apply { this.vslWt = vslWt }

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

        /** Year the vessel went into service. */
        fun yearBuilt(yearBuilt: String) = yearBuilt(JsonField.of(yearBuilt))

        /**
         * Sets [Builder.yearBuilt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yearBuilt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun yearBuilt(yearBuilt: JsonField<String>) = apply { this.yearBuilt = yearBuilt }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [VesselTupleResponse].
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
        fun build(): VesselTupleResponse =
            VesselTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                id,
                altVesselId,
                callsign,
                createdAt,
                createdBy,
                entity,
                firstSeen,
                hullNum,
                idEntity,
                idOrganization,
                imon,
                length,
                maxDraught,
                maxSpeed,
                mmsi,
                numBlades,
                numShafts,
                origin,
                origNetwork,
                propType,
                sconum,
                sourceDl,
                status,
                sternType,
                updatedAt,
                updatedBy,
                vesselBuilder,
                vesselClass,
                vesselDescription,
                vesselFlag,
                vesselName,
                vesselType,
                vslWt,
                width,
                yearBuilt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VesselTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        id()
        altVesselId()
        callsign()
        createdAt()
        createdBy()
        entity().ifPresent { it.validate() }
        firstSeen()
        hullNum()
        idEntity()
        idOrganization()
        imon()
        length()
        maxDraught()
        maxSpeed()
        mmsi()
        numBlades()
        numShafts()
        origin()
        origNetwork()
        propType()
        sconum()
        sourceDl()
        status()
        sternType()
        updatedAt()
        updatedBy()
        vesselBuilder()
        vesselClass()
        vesselDescription()
        vesselFlag()
        vesselName()
        vesselType()
        vslWt()
        width()
        yearBuilt()
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
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (altVesselId.asKnown().isPresent) 1 else 0) +
            (if (callsign.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (entity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (firstSeen.asKnown().isPresent) 1 else 0) +
            (if (hullNum.asKnown().isPresent) 1 else 0) +
            (if (idEntity.asKnown().isPresent) 1 else 0) +
            (if (idOrganization.asKnown().isPresent) 1 else 0) +
            (if (imon.asKnown().isPresent) 1 else 0) +
            (if (length.asKnown().isPresent) 1 else 0) +
            (if (maxDraught.asKnown().isPresent) 1 else 0) +
            (if (maxSpeed.asKnown().isPresent) 1 else 0) +
            (if (mmsi.asKnown().isPresent) 1 else 0) +
            (if (numBlades.asKnown().isPresent) 1 else 0) +
            (if (numShafts.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (propType.asKnown().isPresent) 1 else 0) +
            (if (sconum.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (sternType.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (vesselBuilder.asKnown().isPresent) 1 else 0) +
            (if (vesselClass.asKnown().isPresent) 1 else 0) +
            (if (vesselDescription.asKnown().isPresent) 1 else 0) +
            (if (vesselFlag.asKnown().isPresent) 1 else 0) +
            (if (vesselName.asKnown().isPresent) 1 else 0) +
            (if (vesselType.asKnown().isPresent) 1 else 0) +
            (if (vslWt.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0) +
            (if (yearBuilt.asKnown().isPresent) 1 else 0)

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

        return other is VesselTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            id == other.id &&
            altVesselId == other.altVesselId &&
            callsign == other.callsign &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            entity == other.entity &&
            firstSeen == other.firstSeen &&
            hullNum == other.hullNum &&
            idEntity == other.idEntity &&
            idOrganization == other.idOrganization &&
            imon == other.imon &&
            length == other.length &&
            maxDraught == other.maxDraught &&
            maxSpeed == other.maxSpeed &&
            mmsi == other.mmsi &&
            numBlades == other.numBlades &&
            numShafts == other.numShafts &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            propType == other.propType &&
            sconum == other.sconum &&
            sourceDl == other.sourceDl &&
            status == other.status &&
            sternType == other.sternType &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            vesselBuilder == other.vesselBuilder &&
            vesselClass == other.vesselClass &&
            vesselDescription == other.vesselDescription &&
            vesselFlag == other.vesselFlag &&
            vesselName == other.vesselName &&
            vesselType == other.vesselType &&
            vslWt == other.vslWt &&
            width == other.width &&
            yearBuilt == other.yearBuilt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            source,
            id,
            altVesselId,
            callsign,
            createdAt,
            createdBy,
            entity,
            firstSeen,
            hullNum,
            idEntity,
            idOrganization,
            imon,
            length,
            maxDraught,
            maxSpeed,
            mmsi,
            numBlades,
            numShafts,
            origin,
            origNetwork,
            propType,
            sconum,
            sourceDl,
            status,
            sternType,
            updatedAt,
            updatedBy,
            vesselBuilder,
            vesselClass,
            vesselDescription,
            vesselFlag,
            vesselName,
            vesselType,
            vslWt,
            width,
            yearBuilt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VesselTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, id=$id, altVesselId=$altVesselId, callsign=$callsign, createdAt=$createdAt, createdBy=$createdBy, entity=$entity, firstSeen=$firstSeen, hullNum=$hullNum, idEntity=$idEntity, idOrganization=$idOrganization, imon=$imon, length=$length, maxDraught=$maxDraught, maxSpeed=$maxSpeed, mmsi=$mmsi, numBlades=$numBlades, numShafts=$numShafts, origin=$origin, origNetwork=$origNetwork, propType=$propType, sconum=$sconum, sourceDl=$sourceDl, status=$status, sternType=$sternType, updatedAt=$updatedAt, updatedBy=$updatedBy, vesselBuilder=$vesselBuilder, vesselClass=$vesselClass, vesselDescription=$vesselDescription, vesselFlag=$vesselFlag, vesselName=$vesselName, vesselType=$vesselType, vslWt=$vslWt, width=$width, yearBuilt=$yearBuilt, additionalProperties=$additionalProperties}"
}

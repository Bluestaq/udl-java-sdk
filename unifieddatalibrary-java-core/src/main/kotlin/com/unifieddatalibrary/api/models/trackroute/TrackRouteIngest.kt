// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackroute

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
 * A track route is a prescribed route for performing training events or operations such as air
 * refueling.
 */
class TrackRouteIngest
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val lastUpdateDate: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val type: JsonField<String>,
    private val id: JsonField<String>,
    private val altitudeBlocks: JsonField<List<AltitudeBlocksIngest>>,
    private val apnSetting: JsonField<String>,
    private val apxBeaconCode: JsonField<String>,
    private val artccMessage: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val creatingOrg: JsonField<String>,
    private val direction: JsonField<String>,
    private val effectiveDate: JsonField<OffsetDateTime>,
    private val externalId: JsonField<String>,
    private val lastUsedDate: JsonField<OffsetDateTime>,
    private val locationTrackId: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val poc: JsonField<List<PointOfContactIngest>>,
    private val priFreq: JsonField<Double>,
    private val receiverTankerChCode: JsonField<String>,
    private val regionCode: JsonField<String>,
    private val regionName: JsonField<String>,
    private val reviewDate: JsonField<OffsetDateTime>,
    private val routePoints: JsonField<List<RoutePointsIngest>>,
    private val schedulerOrgName: JsonField<String>,
    private val schedulerOrgUnit: JsonField<String>,
    private val secFreq: JsonField<Double>,
    private val shortName: JsonField<String>,
    private val sic: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val trackId: JsonField<String>,
    private val trackName: JsonField<String>,
    private val typeCode: JsonField<String>,
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
        @JsonProperty("lastUpdateDate")
        @ExcludeMissing
        lastUpdateDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altitudeBlocks")
        @ExcludeMissing
        altitudeBlocks: JsonField<List<AltitudeBlocksIngest>> = JsonMissing.of(),
        @JsonProperty("apnSetting")
        @ExcludeMissing
        apnSetting: JsonField<String> = JsonMissing.of(),
        @JsonProperty("apxBeaconCode")
        @ExcludeMissing
        apxBeaconCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("artccMessage")
        @ExcludeMissing
        artccMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creatingOrg")
        @ExcludeMissing
        creatingOrg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction") @ExcludeMissing direction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effectiveDate")
        @ExcludeMissing
        effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("externalId")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastUsedDate")
        @ExcludeMissing
        lastUsedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("locationTrackId")
        @ExcludeMissing
        locationTrackId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("poc")
        @ExcludeMissing
        poc: JsonField<List<PointOfContactIngest>> = JsonMissing.of(),
        @JsonProperty("priFreq") @ExcludeMissing priFreq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("receiverTankerCHCode")
        @ExcludeMissing
        receiverTankerChCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("regionCode")
        @ExcludeMissing
        regionCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("regionName")
        @ExcludeMissing
        regionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reviewDate")
        @ExcludeMissing
        reviewDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("routePoints")
        @ExcludeMissing
        routePoints: JsonField<List<RoutePointsIngest>> = JsonMissing.of(),
        @JsonProperty("schedulerOrgName")
        @ExcludeMissing
        schedulerOrgName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("schedulerOrgUnit")
        @ExcludeMissing
        schedulerOrgUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secFreq") @ExcludeMissing secFreq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("shortName") @ExcludeMissing shortName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sic") @ExcludeMissing sic: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trackId") @ExcludeMissing trackId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trackName") @ExcludeMissing trackName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("typeCode") @ExcludeMissing typeCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        lastUpdateDate,
        source,
        type,
        id,
        altitudeBlocks,
        apnSetting,
        apxBeaconCode,
        artccMessage,
        createdAt,
        createdBy,
        creatingOrg,
        direction,
        effectiveDate,
        externalId,
        lastUsedDate,
        locationTrackId,
        origin,
        origNetwork,
        poc,
        priFreq,
        receiverTankerChCode,
        regionCode,
        regionName,
        reviewDate,
        routePoints,
        schedulerOrgName,
        schedulerOrgUnit,
        secFreq,
        shortName,
        sic,
        sourceDl,
        trackId,
        trackName,
        typeCode,
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
     * The last updated date of the track route in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastUpdateDate(): OffsetDateTime = lastUpdateDate.getRequired("lastUpdateDate")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The track route type represented by this record (ex. AIR REFUELING).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Minimum and maximum altitude bounds for the track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altitudeBlocks(): Optional<List<AltitudeBlocksIngest>> =
        altitudeBlocks.getOptional("altitudeBlocks")

    /**
     * The APN radar code sent and received by the aircraft for identification.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun apnSetting(): Optional<String> = apnSetting.getOptional("apnSetting")

    /**
     * The APX radar code sent and received by the aircraft for identification.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun apxBeaconCode(): Optional<String> = apxBeaconCode.getOptional("apxBeaconCode")

    /**
     * Air Refueling Track Control Center message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun artccMessage(): Optional<String> = artccMessage.getOptional("artccMessage")

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
     * The name of the creating organization of the track route.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun creatingOrg(): Optional<String> = creatingOrg.getOptional("creatingOrg")

    /**
     * The principal compass direction (cardinal or ordinal) of the track route.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun direction(): Optional<String> = direction.getOptional("direction")

    /**
     * The date which the DAFIF track was last updated/validated in ISO 8601 UTC format with
     * millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun effectiveDate(): Optional<OffsetDateTime> = effectiveDate.getOptional("effectiveDate")

    /**
     * Optional air refueling track ID from external systems. This field has no meaning within UDL
     * and is provided as a convenience for systems that require tracking of an internal system
     * generated ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("externalId")

    /**
     * Used to show last time the track route was added to an itinerary in ISO 8601 UTC format with
     * millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lastUsedDate(): Optional<OffsetDateTime> = lastUsedDate.getOptional("lastUsedDate")

    /**
     * Track location ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun locationTrackId(): Optional<String> = locationTrackId.getOptional("locationTrackId")

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
     * Point of contacts for scheduling or modifying the route.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun poc(): Optional<List<PointOfContactIngest>> = poc.getOptional("poc")

    /**
     * The primary UHF radio frequency used for the track route in megahertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun priFreq(): Optional<Double> = priFreq.getOptional("priFreq")

    /**
     * The receiver tanker channel identifer for air refueling tracks.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun receiverTankerChCode(): Optional<String> =
        receiverTankerChCode.getOptional("receiverTankerCHCode")

    /**
     * Region code indicating where the track resides as determined by the data source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun regionCode(): Optional<String> = regionCode.getOptional("regionCode")

    /**
     * Region where the track resides.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun regionName(): Optional<String> = regionName.getOptional("regionName")

    /**
     * Date the track needs to be reviewed for accuracy or deletion in ISO 8601 UTC format with
     * millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reviewDate(): Optional<OffsetDateTime> = reviewDate.getOptional("reviewDate")

    /**
     * Points identified within the route.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun routePoints(): Optional<List<RoutePointsIngest>> = routePoints.getOptional("routePoints")

    /**
     * Point of contact for the air refueling track route scheduler.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun schedulerOrgName(): Optional<String> = schedulerOrgName.getOptional("schedulerOrgName")

    /**
     * The unit responsible for scheduling the track route.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun schedulerOrgUnit(): Optional<String> = schedulerOrgUnit.getOptional("schedulerOrgUnit")

    /**
     * The secondary UHF radio frequency used for the track route in megahertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun secFreq(): Optional<Double> = secFreq.getOptional("secFreq")

    /**
     * Abbreviated name of the track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shortName(): Optional<String> = shortName.getOptional("shortName")

    /**
     * Standard Indicator Code of the air refueling track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sic(): Optional<String> = sic.getOptional("sic")

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
     * Identifier of the track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackId(): Optional<String> = trackId.getOptional("trackId")

    /**
     * Name of the track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackName(): Optional<String> = trackName.getOptional("trackName")

    /**
     * Type of process used by AMC to schedule an air refueling event. Possible values are A
     * (Matched Long Range), F (Matched AMC Short Notice), N (Unmatched Theater Operation Short
     * Notice (Theater Assets)), R, Unmatched Long Range, S (Soft Air Refueling), T (Matched Theater
     * Operation Short Notice (Theater Assets)), V (Unmatched AMC Short Notice), X (Unmatched
     * Theater Operation Short Notice (AMC Assets)), Y (Matched Theater Operation Short Notice (AMC
     * Assets)), Z (Other Air Refueling).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun typeCode(): Optional<String> = typeCode.getOptional("typeCode")

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
     * Returns the raw JSON value of [lastUpdateDate].
     *
     * Unlike [lastUpdateDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastUpdateDate")
    @ExcludeMissing
    fun _lastUpdateDate(): JsonField<OffsetDateTime> = lastUpdateDate

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [altitudeBlocks].
     *
     * Unlike [altitudeBlocks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altitudeBlocks")
    @ExcludeMissing
    fun _altitudeBlocks(): JsonField<List<AltitudeBlocksIngest>> = altitudeBlocks

    /**
     * Returns the raw JSON value of [apnSetting].
     *
     * Unlike [apnSetting], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apnSetting") @ExcludeMissing fun _apnSetting(): JsonField<String> = apnSetting

    /**
     * Returns the raw JSON value of [apxBeaconCode].
     *
     * Unlike [apxBeaconCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apxBeaconCode")
    @ExcludeMissing
    fun _apxBeaconCode(): JsonField<String> = apxBeaconCode

    /**
     * Returns the raw JSON value of [artccMessage].
     *
     * Unlike [artccMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("artccMessage")
    @ExcludeMissing
    fun _artccMessage(): JsonField<String> = artccMessage

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
     * Returns the raw JSON value of [creatingOrg].
     *
     * Unlike [creatingOrg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creatingOrg") @ExcludeMissing fun _creatingOrg(): JsonField<String> = creatingOrg

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effectiveDate")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalId") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [lastUsedDate].
     *
     * Unlike [lastUsedDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastUsedDate")
    @ExcludeMissing
    fun _lastUsedDate(): JsonField<OffsetDateTime> = lastUsedDate

    /**
     * Returns the raw JSON value of [locationTrackId].
     *
     * Unlike [locationTrackId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locationTrackId")
    @ExcludeMissing
    fun _locationTrackId(): JsonField<String> = locationTrackId

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
     * Returns the raw JSON value of [poc].
     *
     * Unlike [poc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("poc") @ExcludeMissing fun _poc(): JsonField<List<PointOfContactIngest>> = poc

    /**
     * Returns the raw JSON value of [priFreq].
     *
     * Unlike [priFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priFreq") @ExcludeMissing fun _priFreq(): JsonField<Double> = priFreq

    /**
     * Returns the raw JSON value of [receiverTankerChCode].
     *
     * Unlike [receiverTankerChCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("receiverTankerCHCode")
    @ExcludeMissing
    fun _receiverTankerChCode(): JsonField<String> = receiverTankerChCode

    /**
     * Returns the raw JSON value of [regionCode].
     *
     * Unlike [regionCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regionCode") @ExcludeMissing fun _regionCode(): JsonField<String> = regionCode

    /**
     * Returns the raw JSON value of [regionName].
     *
     * Unlike [regionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regionName") @ExcludeMissing fun _regionName(): JsonField<String> = regionName

    /**
     * Returns the raw JSON value of [reviewDate].
     *
     * Unlike [reviewDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reviewDate")
    @ExcludeMissing
    fun _reviewDate(): JsonField<OffsetDateTime> = reviewDate

    /**
     * Returns the raw JSON value of [routePoints].
     *
     * Unlike [routePoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routePoints")
    @ExcludeMissing
    fun _routePoints(): JsonField<List<RoutePointsIngest>> = routePoints

    /**
     * Returns the raw JSON value of [schedulerOrgName].
     *
     * Unlike [schedulerOrgName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("schedulerOrgName")
    @ExcludeMissing
    fun _schedulerOrgName(): JsonField<String> = schedulerOrgName

    /**
     * Returns the raw JSON value of [schedulerOrgUnit].
     *
     * Unlike [schedulerOrgUnit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("schedulerOrgUnit")
    @ExcludeMissing
    fun _schedulerOrgUnit(): JsonField<String> = schedulerOrgUnit

    /**
     * Returns the raw JSON value of [secFreq].
     *
     * Unlike [secFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secFreq") @ExcludeMissing fun _secFreq(): JsonField<Double> = secFreq

    /**
     * Returns the raw JSON value of [shortName].
     *
     * Unlike [shortName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shortName") @ExcludeMissing fun _shortName(): JsonField<String> = shortName

    /**
     * Returns the raw JSON value of [sic].
     *
     * Unlike [sic], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sic") @ExcludeMissing fun _sic(): JsonField<String> = sic

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [trackId].
     *
     * Unlike [trackId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackId") @ExcludeMissing fun _trackId(): JsonField<String> = trackId

    /**
     * Returns the raw JSON value of [trackName].
     *
     * Unlike [trackName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackName") @ExcludeMissing fun _trackName(): JsonField<String> = trackName

    /**
     * Returns the raw JSON value of [typeCode].
     *
     * Unlike [typeCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("typeCode") @ExcludeMissing fun _typeCode(): JsonField<String> = typeCode

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
         * Returns a mutable builder for constructing an instance of [TrackRouteIngest].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .lastUpdateDate()
         * .source()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TrackRouteIngest]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var lastUpdateDate: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var altitudeBlocks: JsonField<MutableList<AltitudeBlocksIngest>>? = null
        private var apnSetting: JsonField<String> = JsonMissing.of()
        private var apxBeaconCode: JsonField<String> = JsonMissing.of()
        private var artccMessage: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var creatingOrg: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<String> = JsonMissing.of()
        private var effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var lastUsedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var locationTrackId: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var poc: JsonField<MutableList<PointOfContactIngest>>? = null
        private var priFreq: JsonField<Double> = JsonMissing.of()
        private var receiverTankerChCode: JsonField<String> = JsonMissing.of()
        private var regionCode: JsonField<String> = JsonMissing.of()
        private var regionName: JsonField<String> = JsonMissing.of()
        private var reviewDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var routePoints: JsonField<MutableList<RoutePointsIngest>>? = null
        private var schedulerOrgName: JsonField<String> = JsonMissing.of()
        private var schedulerOrgUnit: JsonField<String> = JsonMissing.of()
        private var secFreq: JsonField<Double> = JsonMissing.of()
        private var shortName: JsonField<String> = JsonMissing.of()
        private var sic: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var trackId: JsonField<String> = JsonMissing.of()
        private var trackName: JsonField<String> = JsonMissing.of()
        private var typeCode: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(trackRouteIngest: TrackRouteIngest) = apply {
            classificationMarking = trackRouteIngest.classificationMarking
            dataMode = trackRouteIngest.dataMode
            lastUpdateDate = trackRouteIngest.lastUpdateDate
            source = trackRouteIngest.source
            type = trackRouteIngest.type
            id = trackRouteIngest.id
            altitudeBlocks = trackRouteIngest.altitudeBlocks.map { it.toMutableList() }
            apnSetting = trackRouteIngest.apnSetting
            apxBeaconCode = trackRouteIngest.apxBeaconCode
            artccMessage = trackRouteIngest.artccMessage
            createdAt = trackRouteIngest.createdAt
            createdBy = trackRouteIngest.createdBy
            creatingOrg = trackRouteIngest.creatingOrg
            direction = trackRouteIngest.direction
            effectiveDate = trackRouteIngest.effectiveDate
            externalId = trackRouteIngest.externalId
            lastUsedDate = trackRouteIngest.lastUsedDate
            locationTrackId = trackRouteIngest.locationTrackId
            origin = trackRouteIngest.origin
            origNetwork = trackRouteIngest.origNetwork
            poc = trackRouteIngest.poc.map { it.toMutableList() }
            priFreq = trackRouteIngest.priFreq
            receiverTankerChCode = trackRouteIngest.receiverTankerChCode
            regionCode = trackRouteIngest.regionCode
            regionName = trackRouteIngest.regionName
            reviewDate = trackRouteIngest.reviewDate
            routePoints = trackRouteIngest.routePoints.map { it.toMutableList() }
            schedulerOrgName = trackRouteIngest.schedulerOrgName
            schedulerOrgUnit = trackRouteIngest.schedulerOrgUnit
            secFreq = trackRouteIngest.secFreq
            shortName = trackRouteIngest.shortName
            sic = trackRouteIngest.sic
            sourceDl = trackRouteIngest.sourceDl
            trackId = trackRouteIngest.trackId
            trackName = trackRouteIngest.trackName
            typeCode = trackRouteIngest.typeCode
            updatedAt = trackRouteIngest.updatedAt
            updatedBy = trackRouteIngest.updatedBy
            additionalProperties = trackRouteIngest.additionalProperties.toMutableMap()
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
         * The last updated date of the track route in ISO 8601 UTC format with millisecond
         * precision.
         */
        fun lastUpdateDate(lastUpdateDate: OffsetDateTime) =
            lastUpdateDate(JsonField.of(lastUpdateDate))

        /**
         * Sets [Builder.lastUpdateDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastUpdateDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastUpdateDate(lastUpdateDate: JsonField<OffsetDateTime>) = apply {
            this.lastUpdateDate = lastUpdateDate
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

        /** The track route type represented by this record (ex. AIR REFUELING). */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Minimum and maximum altitude bounds for the track. */
        fun altitudeBlocks(altitudeBlocks: List<AltitudeBlocksIngest>) =
            altitudeBlocks(JsonField.of(altitudeBlocks))

        /**
         * Sets [Builder.altitudeBlocks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altitudeBlocks] with a well-typed
         * `List<AltitudeBlocksIngest>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun altitudeBlocks(altitudeBlocks: JsonField<List<AltitudeBlocksIngest>>) = apply {
            this.altitudeBlocks = altitudeBlocks.map { it.toMutableList() }
        }

        /**
         * Adds a single [AltitudeBlocksIngest] to [altitudeBlocks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAltitudeBlock(altitudeBlock: AltitudeBlocksIngest) = apply {
            altitudeBlocks =
                (altitudeBlocks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("altitudeBlocks", it).add(altitudeBlock)
                }
        }

        /** The APN radar code sent and received by the aircraft for identification. */
        fun apnSetting(apnSetting: String) = apnSetting(JsonField.of(apnSetting))

        /**
         * Sets [Builder.apnSetting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apnSetting] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apnSetting(apnSetting: JsonField<String>) = apply { this.apnSetting = apnSetting }

        /** The APX radar code sent and received by the aircraft for identification. */
        fun apxBeaconCode(apxBeaconCode: String) = apxBeaconCode(JsonField.of(apxBeaconCode))

        /**
         * Sets [Builder.apxBeaconCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apxBeaconCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apxBeaconCode(apxBeaconCode: JsonField<String>) = apply {
            this.apxBeaconCode = apxBeaconCode
        }

        /** Air Refueling Track Control Center message. */
        fun artccMessage(artccMessage: String) = artccMessage(JsonField.of(artccMessage))

        /**
         * Sets [Builder.artccMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.artccMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun artccMessage(artccMessage: JsonField<String>) = apply {
            this.artccMessage = artccMessage
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

        /** The name of the creating organization of the track route. */
        fun creatingOrg(creatingOrg: String) = creatingOrg(JsonField.of(creatingOrg))

        /**
         * Sets [Builder.creatingOrg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creatingOrg] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creatingOrg(creatingOrg: JsonField<String>) = apply { this.creatingOrg = creatingOrg }

        /** The principal compass direction (cardinal or ordinal) of the track route. */
        fun direction(direction: String) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<String>) = apply { this.direction = direction }

        /**
         * The date which the DAFIF track was last updated/validated in ISO 8601 UTC format with
         * millisecond precision.
         */
        fun effectiveDate(effectiveDate: OffsetDateTime) =
            effectiveDate(JsonField.of(effectiveDate))

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
            this.effectiveDate = effectiveDate
        }

        /**
         * Optional air refueling track ID from external systems. This field has no meaning within
         * UDL and is provided as a convenience for systems that require tracking of an internal
         * system generated ID.
         */
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
         * Used to show last time the track route was added to an itinerary in ISO 8601 UTC format
         * with millisecond precision.
         */
        fun lastUsedDate(lastUsedDate: OffsetDateTime) = lastUsedDate(JsonField.of(lastUsedDate))

        /**
         * Sets [Builder.lastUsedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastUsedDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastUsedDate(lastUsedDate: JsonField<OffsetDateTime>) = apply {
            this.lastUsedDate = lastUsedDate
        }

        /** Track location ID. */
        fun locationTrackId(locationTrackId: String) =
            locationTrackId(JsonField.of(locationTrackId))

        /**
         * Sets [Builder.locationTrackId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locationTrackId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun locationTrackId(locationTrackId: JsonField<String>) = apply {
            this.locationTrackId = locationTrackId
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

        /** Point of contacts for scheduling or modifying the route. */
        fun poc(poc: List<PointOfContactIngest>) = poc(JsonField.of(poc))

        /**
         * Sets [Builder.poc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.poc] with a well-typed `List<PointOfContactIngest>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun poc(poc: JsonField<List<PointOfContactIngest>>) = apply {
            this.poc = poc.map { it.toMutableList() }
        }

        /**
         * Adds a single [PointOfContactIngest] to [Builder.poc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPoc(poc: PointOfContactIngest) = apply {
            this.poc =
                (this.poc ?: JsonField.of(mutableListOf())).also { checkKnown("poc", it).add(poc) }
        }

        /** The primary UHF radio frequency used for the track route in megahertz. */
        fun priFreq(priFreq: Double) = priFreq(JsonField.of(priFreq))

        /**
         * Sets [Builder.priFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priFreq] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priFreq(priFreq: JsonField<Double>) = apply { this.priFreq = priFreq }

        /** The receiver tanker channel identifer for air refueling tracks. */
        fun receiverTankerChCode(receiverTankerChCode: String) =
            receiverTankerChCode(JsonField.of(receiverTankerChCode))

        /**
         * Sets [Builder.receiverTankerChCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiverTankerChCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receiverTankerChCode(receiverTankerChCode: JsonField<String>) = apply {
            this.receiverTankerChCode = receiverTankerChCode
        }

        /** Region code indicating where the track resides as determined by the data source. */
        fun regionCode(regionCode: String) = regionCode(JsonField.of(regionCode))

        /**
         * Sets [Builder.regionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regionCode(regionCode: JsonField<String>) = apply { this.regionCode = regionCode }

        /** Region where the track resides. */
        fun regionName(regionName: String) = regionName(JsonField.of(regionName))

        /**
         * Sets [Builder.regionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regionName(regionName: JsonField<String>) = apply { this.regionName = regionName }

        /**
         * Date the track needs to be reviewed for accuracy or deletion in ISO 8601 UTC format with
         * millisecond precision.
         */
        fun reviewDate(reviewDate: OffsetDateTime) = reviewDate(JsonField.of(reviewDate))

        /**
         * Sets [Builder.reviewDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reviewDate(reviewDate: JsonField<OffsetDateTime>) = apply {
            this.reviewDate = reviewDate
        }

        /** Points identified within the route. */
        fun routePoints(routePoints: List<RoutePointsIngest>) =
            routePoints(JsonField.of(routePoints))

        /**
         * Sets [Builder.routePoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routePoints] with a well-typed `List<RoutePointsIngest>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun routePoints(routePoints: JsonField<List<RoutePointsIngest>>) = apply {
            this.routePoints = routePoints.map { it.toMutableList() }
        }

        /**
         * Adds a single [RoutePointsIngest] to [routePoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoutePoint(routePoint: RoutePointsIngest) = apply {
            routePoints =
                (routePoints ?: JsonField.of(mutableListOf())).also {
                    checkKnown("routePoints", it).add(routePoint)
                }
        }

        /** Point of contact for the air refueling track route scheduler. */
        fun schedulerOrgName(schedulerOrgName: String) =
            schedulerOrgName(JsonField.of(schedulerOrgName))

        /**
         * Sets [Builder.schedulerOrgName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schedulerOrgName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun schedulerOrgName(schedulerOrgName: JsonField<String>) = apply {
            this.schedulerOrgName = schedulerOrgName
        }

        /** The unit responsible for scheduling the track route. */
        fun schedulerOrgUnit(schedulerOrgUnit: String) =
            schedulerOrgUnit(JsonField.of(schedulerOrgUnit))

        /**
         * Sets [Builder.schedulerOrgUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schedulerOrgUnit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun schedulerOrgUnit(schedulerOrgUnit: JsonField<String>) = apply {
            this.schedulerOrgUnit = schedulerOrgUnit
        }

        /** The secondary UHF radio frequency used for the track route in megahertz. */
        fun secFreq(secFreq: Double) = secFreq(JsonField.of(secFreq))

        /**
         * Sets [Builder.secFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secFreq] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun secFreq(secFreq: JsonField<Double>) = apply { this.secFreq = secFreq }

        /** Abbreviated name of the track. */
        fun shortName(shortName: String) = shortName(JsonField.of(shortName))

        /**
         * Sets [Builder.shortName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

        /** Standard Indicator Code of the air refueling track. */
        fun sic(sic: String) = sic(JsonField.of(sic))

        /**
         * Sets [Builder.sic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sic] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sic(sic: JsonField<String>) = apply { this.sic = sic }

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

        /** Identifier of the track. */
        fun trackId(trackId: String) = trackId(JsonField.of(trackId))

        /**
         * Sets [Builder.trackId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trackId(trackId: JsonField<String>) = apply { this.trackId = trackId }

        /** Name of the track. */
        fun trackName(trackName: String) = trackName(JsonField.of(trackName))

        /**
         * Sets [Builder.trackName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trackName(trackName: JsonField<String>) = apply { this.trackName = trackName }

        /**
         * Type of process used by AMC to schedule an air refueling event. Possible values are A
         * (Matched Long Range), F (Matched AMC Short Notice), N (Unmatched Theater Operation Short
         * Notice (Theater Assets)), R, Unmatched Long Range, S (Soft Air Refueling), T (Matched
         * Theater Operation Short Notice (Theater Assets)), V (Unmatched AMC Short Notice), X
         * (Unmatched Theater Operation Short Notice (AMC Assets)), Y (Matched Theater Operation
         * Short Notice (AMC Assets)), Z (Other Air Refueling).
         */
        fun typeCode(typeCode: String) = typeCode(JsonField.of(typeCode))

        /**
         * Sets [Builder.typeCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.typeCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun typeCode(typeCode: JsonField<String>) = apply { this.typeCode = typeCode }

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
         * Returns an immutable instance of [TrackRouteIngest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .lastUpdateDate()
         * .source()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TrackRouteIngest =
            TrackRouteIngest(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("lastUpdateDate", lastUpdateDate),
                checkRequired("source", source),
                checkRequired("type", type),
                id,
                (altitudeBlocks ?: JsonMissing.of()).map { it.toImmutable() },
                apnSetting,
                apxBeaconCode,
                artccMessage,
                createdAt,
                createdBy,
                creatingOrg,
                direction,
                effectiveDate,
                externalId,
                lastUsedDate,
                locationTrackId,
                origin,
                origNetwork,
                (poc ?: JsonMissing.of()).map { it.toImmutable() },
                priFreq,
                receiverTankerChCode,
                regionCode,
                regionName,
                reviewDate,
                (routePoints ?: JsonMissing.of()).map { it.toImmutable() },
                schedulerOrgName,
                schedulerOrgUnit,
                secFreq,
                shortName,
                sic,
                sourceDl,
                trackId,
                trackName,
                typeCode,
                updatedAt,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TrackRouteIngest = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        lastUpdateDate()
        source()
        type()
        id()
        altitudeBlocks().ifPresent { it.forEach { it.validate() } }
        apnSetting()
        apxBeaconCode()
        artccMessage()
        createdAt()
        createdBy()
        creatingOrg()
        direction()
        effectiveDate()
        externalId()
        lastUsedDate()
        locationTrackId()
        origin()
        origNetwork()
        poc().ifPresent { it.forEach { it.validate() } }
        priFreq()
        receiverTankerChCode()
        regionCode()
        regionName()
        reviewDate()
        routePoints().ifPresent { it.forEach { it.validate() } }
        schedulerOrgName()
        schedulerOrgUnit()
        secFreq()
        shortName()
        sic()
        sourceDl()
        trackId()
        trackName()
        typeCode()
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
            (if (lastUpdateDate.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (altitudeBlocks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (apnSetting.asKnown().isPresent) 1 else 0) +
            (if (apxBeaconCode.asKnown().isPresent) 1 else 0) +
            (if (artccMessage.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (creatingOrg.asKnown().isPresent) 1 else 0) +
            (if (direction.asKnown().isPresent) 1 else 0) +
            (if (effectiveDate.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (if (lastUsedDate.asKnown().isPresent) 1 else 0) +
            (if (locationTrackId.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (poc.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (priFreq.asKnown().isPresent) 1 else 0) +
            (if (receiverTankerChCode.asKnown().isPresent) 1 else 0) +
            (if (regionCode.asKnown().isPresent) 1 else 0) +
            (if (regionName.asKnown().isPresent) 1 else 0) +
            (if (reviewDate.asKnown().isPresent) 1 else 0) +
            (routePoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (schedulerOrgName.asKnown().isPresent) 1 else 0) +
            (if (schedulerOrgUnit.asKnown().isPresent) 1 else 0) +
            (if (secFreq.asKnown().isPresent) 1 else 0) +
            (if (shortName.asKnown().isPresent) 1 else 0) +
            (if (sic.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (trackId.asKnown().isPresent) 1 else 0) +
            (if (trackName.asKnown().isPresent) 1 else 0) +
            (if (typeCode.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0)

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

        return other is TrackRouteIngest &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            lastUpdateDate == other.lastUpdateDate &&
            source == other.source &&
            type == other.type &&
            id == other.id &&
            altitudeBlocks == other.altitudeBlocks &&
            apnSetting == other.apnSetting &&
            apxBeaconCode == other.apxBeaconCode &&
            artccMessage == other.artccMessage &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            creatingOrg == other.creatingOrg &&
            direction == other.direction &&
            effectiveDate == other.effectiveDate &&
            externalId == other.externalId &&
            lastUsedDate == other.lastUsedDate &&
            locationTrackId == other.locationTrackId &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            poc == other.poc &&
            priFreq == other.priFreq &&
            receiverTankerChCode == other.receiverTankerChCode &&
            regionCode == other.regionCode &&
            regionName == other.regionName &&
            reviewDate == other.reviewDate &&
            routePoints == other.routePoints &&
            schedulerOrgName == other.schedulerOrgName &&
            schedulerOrgUnit == other.schedulerOrgUnit &&
            secFreq == other.secFreq &&
            shortName == other.shortName &&
            sic == other.sic &&
            sourceDl == other.sourceDl &&
            trackId == other.trackId &&
            trackName == other.trackName &&
            typeCode == other.typeCode &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            lastUpdateDate,
            source,
            type,
            id,
            altitudeBlocks,
            apnSetting,
            apxBeaconCode,
            artccMessage,
            createdAt,
            createdBy,
            creatingOrg,
            direction,
            effectiveDate,
            externalId,
            lastUsedDate,
            locationTrackId,
            origin,
            origNetwork,
            poc,
            priFreq,
            receiverTankerChCode,
            regionCode,
            regionName,
            reviewDate,
            routePoints,
            schedulerOrgName,
            schedulerOrgUnit,
            secFreq,
            shortName,
            sic,
            sourceDl,
            trackId,
            trackName,
            typeCode,
            updatedAt,
            updatedBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TrackRouteIngest{classificationMarking=$classificationMarking, dataMode=$dataMode, lastUpdateDate=$lastUpdateDate, source=$source, type=$type, id=$id, altitudeBlocks=$altitudeBlocks, apnSetting=$apnSetting, apxBeaconCode=$apxBeaconCode, artccMessage=$artccMessage, createdAt=$createdAt, createdBy=$createdBy, creatingOrg=$creatingOrg, direction=$direction, effectiveDate=$effectiveDate, externalId=$externalId, lastUsedDate=$lastUsedDate, locationTrackId=$locationTrackId, origin=$origin, origNetwork=$origNetwork, poc=$poc, priFreq=$priFreq, receiverTankerChCode=$receiverTankerChCode, regionCode=$regionCode, regionName=$regionName, reviewDate=$reviewDate, routePoints=$routePoints, schedulerOrgName=$schedulerOrgName, schedulerOrgUnit=$schedulerOrgUnit, secFreq=$secFreq, shortName=$shortName, sic=$sic, sourceDl=$sourceDl, trackId=$trackId, trackName=$trackName, typeCode=$typeCode, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

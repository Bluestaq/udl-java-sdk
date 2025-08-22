// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackroute.history

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
class TrackRouteFull
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val lastUpdateDate: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val type: JsonField<String>,
    private val id: JsonField<String>,
    private val altitudeBlocks: JsonField<List<AltitudeBlock>>,
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
    private val poc: JsonField<List<Poc>>,
    private val priFreq: JsonField<Double>,
    private val receiverTankerChCode: JsonField<String>,
    private val regionCode: JsonField<String>,
    private val regionName: JsonField<String>,
    private val reviewDate: JsonField<OffsetDateTime>,
    private val routePoints: JsonField<List<RoutePoint>>,
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
        altitudeBlocks: JsonField<List<AltitudeBlock>> = JsonMissing.of(),
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
        @JsonProperty("poc") @ExcludeMissing poc: JsonField<List<Poc>> = JsonMissing.of(),
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
        routePoints: JsonField<List<RoutePoint>> = JsonMissing.of(),
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
    fun altitudeBlocks(): Optional<List<AltitudeBlock>> =
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
    fun poc(): Optional<List<Poc>> = poc.getOptional("poc")

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
    fun routePoints(): Optional<List<RoutePoint>> = routePoints.getOptional("routePoints")

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
    fun _altitudeBlocks(): JsonField<List<AltitudeBlock>> = altitudeBlocks

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
    @JsonProperty("poc") @ExcludeMissing fun _poc(): JsonField<List<Poc>> = poc

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
    fun _routePoints(): JsonField<List<RoutePoint>> = routePoints

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
         * Returns a mutable builder for constructing an instance of [TrackRouteFull].
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

    /** A builder for [TrackRouteFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var lastUpdateDate: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var altitudeBlocks: JsonField<MutableList<AltitudeBlock>>? = null
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
        private var poc: JsonField<MutableList<Poc>>? = null
        private var priFreq: JsonField<Double> = JsonMissing.of()
        private var receiverTankerChCode: JsonField<String> = JsonMissing.of()
        private var regionCode: JsonField<String> = JsonMissing.of()
        private var regionName: JsonField<String> = JsonMissing.of()
        private var reviewDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var routePoints: JsonField<MutableList<RoutePoint>>? = null
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
        internal fun from(trackRouteFull: TrackRouteFull) = apply {
            classificationMarking = trackRouteFull.classificationMarking
            dataMode = trackRouteFull.dataMode
            lastUpdateDate = trackRouteFull.lastUpdateDate
            source = trackRouteFull.source
            type = trackRouteFull.type
            id = trackRouteFull.id
            altitudeBlocks = trackRouteFull.altitudeBlocks.map { it.toMutableList() }
            apnSetting = trackRouteFull.apnSetting
            apxBeaconCode = trackRouteFull.apxBeaconCode
            artccMessage = trackRouteFull.artccMessage
            createdAt = trackRouteFull.createdAt
            createdBy = trackRouteFull.createdBy
            creatingOrg = trackRouteFull.creatingOrg
            direction = trackRouteFull.direction
            effectiveDate = trackRouteFull.effectiveDate
            externalId = trackRouteFull.externalId
            lastUsedDate = trackRouteFull.lastUsedDate
            locationTrackId = trackRouteFull.locationTrackId
            origin = trackRouteFull.origin
            origNetwork = trackRouteFull.origNetwork
            poc = trackRouteFull.poc.map { it.toMutableList() }
            priFreq = trackRouteFull.priFreq
            receiverTankerChCode = trackRouteFull.receiverTankerChCode
            regionCode = trackRouteFull.regionCode
            regionName = trackRouteFull.regionName
            reviewDate = trackRouteFull.reviewDate
            routePoints = trackRouteFull.routePoints.map { it.toMutableList() }
            schedulerOrgName = trackRouteFull.schedulerOrgName
            schedulerOrgUnit = trackRouteFull.schedulerOrgUnit
            secFreq = trackRouteFull.secFreq
            shortName = trackRouteFull.shortName
            sic = trackRouteFull.sic
            sourceDl = trackRouteFull.sourceDl
            trackId = trackRouteFull.trackId
            trackName = trackRouteFull.trackName
            typeCode = trackRouteFull.typeCode
            updatedAt = trackRouteFull.updatedAt
            updatedBy = trackRouteFull.updatedBy
            additionalProperties = trackRouteFull.additionalProperties.toMutableMap()
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
        fun altitudeBlocks(altitudeBlocks: List<AltitudeBlock>) =
            altitudeBlocks(JsonField.of(altitudeBlocks))

        /**
         * Sets [Builder.altitudeBlocks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altitudeBlocks] with a well-typed `List<AltitudeBlock>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun altitudeBlocks(altitudeBlocks: JsonField<List<AltitudeBlock>>) = apply {
            this.altitudeBlocks = altitudeBlocks.map { it.toMutableList() }
        }

        /**
         * Adds a single [AltitudeBlock] to [altitudeBlocks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAltitudeBlock(altitudeBlock: AltitudeBlock) = apply {
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
        fun poc(poc: List<Poc>) = poc(JsonField.of(poc))

        /**
         * Sets [Builder.poc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.poc] with a well-typed `List<Poc>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun poc(poc: JsonField<List<Poc>>) = apply { this.poc = poc.map { it.toMutableList() } }

        /**
         * Adds a single [Poc] to [Builder.poc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPoc(poc: Poc) = apply {
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
        fun routePoints(routePoints: List<RoutePoint>) = routePoints(JsonField.of(routePoints))

        /**
         * Sets [Builder.routePoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routePoints] with a well-typed `List<RoutePoint>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun routePoints(routePoints: JsonField<List<RoutePoint>>) = apply {
            this.routePoints = routePoints.map { it.toMutableList() }
        }

        /**
         * Adds a single [RoutePoint] to [routePoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoutePoint(routePoint: RoutePoint) = apply {
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
         * Returns an immutable instance of [TrackRouteFull].
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
        fun build(): TrackRouteFull =
            TrackRouteFull(
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

    fun validate(): TrackRouteFull = apply {
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

    /** Minimum and maximum altitude bounds for the track. */
    class AltitudeBlock
    private constructor(
        private val altitudeSequenceId: JsonField<String>,
        private val lowerAltitude: JsonField<Double>,
        private val upperAltitude: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("altitudeSequenceId")
            @ExcludeMissing
            altitudeSequenceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lowerAltitude")
            @ExcludeMissing
            lowerAltitude: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("upperAltitude")
            @ExcludeMissing
            upperAltitude: JsonField<Double> = JsonMissing.of(),
        ) : this(altitudeSequenceId, lowerAltitude, upperAltitude, mutableMapOf())

        /**
         * Sequencing field for the altitude block.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun altitudeSequenceId(): Optional<String> =
            altitudeSequenceId.getOptional("altitudeSequenceId")

        /**
         * Lowest altitude of the track route altitude block above mean sea level in feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lowerAltitude(): Optional<Double> = lowerAltitude.getOptional("lowerAltitude")

        /**
         * Highest altitude of the track route altitude block above mean sea level in feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun upperAltitude(): Optional<Double> = upperAltitude.getOptional("upperAltitude")

        /**
         * Returns the raw JSON value of [altitudeSequenceId].
         *
         * Unlike [altitudeSequenceId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("altitudeSequenceId")
        @ExcludeMissing
        fun _altitudeSequenceId(): JsonField<String> = altitudeSequenceId

        /**
         * Returns the raw JSON value of [lowerAltitude].
         *
         * Unlike [lowerAltitude], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lowerAltitude")
        @ExcludeMissing
        fun _lowerAltitude(): JsonField<Double> = lowerAltitude

        /**
         * Returns the raw JSON value of [upperAltitude].
         *
         * Unlike [upperAltitude], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("upperAltitude")
        @ExcludeMissing
        fun _upperAltitude(): JsonField<Double> = upperAltitude

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

            /** Returns a mutable builder for constructing an instance of [AltitudeBlock]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AltitudeBlock]. */
        class Builder internal constructor() {

            private var altitudeSequenceId: JsonField<String> = JsonMissing.of()
            private var lowerAltitude: JsonField<Double> = JsonMissing.of()
            private var upperAltitude: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(altitudeBlock: AltitudeBlock) = apply {
                altitudeSequenceId = altitudeBlock.altitudeSequenceId
                lowerAltitude = altitudeBlock.lowerAltitude
                upperAltitude = altitudeBlock.upperAltitude
                additionalProperties = altitudeBlock.additionalProperties.toMutableMap()
            }

            /** Sequencing field for the altitude block. */
            fun altitudeSequenceId(altitudeSequenceId: String) =
                altitudeSequenceId(JsonField.of(altitudeSequenceId))

            /**
             * Sets [Builder.altitudeSequenceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altitudeSequenceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altitudeSequenceId(altitudeSequenceId: JsonField<String>) = apply {
                this.altitudeSequenceId = altitudeSequenceId
            }

            /** Lowest altitude of the track route altitude block above mean sea level in feet. */
            fun lowerAltitude(lowerAltitude: Double) = lowerAltitude(JsonField.of(lowerAltitude))

            /**
             * Sets [Builder.lowerAltitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lowerAltitude] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lowerAltitude(lowerAltitude: JsonField<Double>) = apply {
                this.lowerAltitude = lowerAltitude
            }

            /** Highest altitude of the track route altitude block above mean sea level in feet. */
            fun upperAltitude(upperAltitude: Double) = upperAltitude(JsonField.of(upperAltitude))

            /**
             * Sets [Builder.upperAltitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.upperAltitude] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun upperAltitude(upperAltitude: JsonField<Double>) = apply {
                this.upperAltitude = upperAltitude
            }

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
             * Returns an immutable instance of [AltitudeBlock].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AltitudeBlock =
                AltitudeBlock(
                    altitudeSequenceId,
                    lowerAltitude,
                    upperAltitude,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AltitudeBlock = apply {
            if (validated) {
                return@apply
            }

            altitudeSequenceId()
            lowerAltitude()
            upperAltitude()
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
            (if (altitudeSequenceId.asKnown().isPresent) 1 else 0) +
                (if (lowerAltitude.asKnown().isPresent) 1 else 0) +
                (if (upperAltitude.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AltitudeBlock &&
                altitudeSequenceId == other.altitudeSequenceId &&
                lowerAltitude == other.lowerAltitude &&
                upperAltitude == other.upperAltitude &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(altitudeSequenceId, lowerAltitude, upperAltitude, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AltitudeBlock{altitudeSequenceId=$altitudeSequenceId, lowerAltitude=$lowerAltitude, upperAltitude=$upperAltitude, additionalProperties=$additionalProperties}"
    }

    /** Point of contacts for scheduling or modifying the route. */
    class Poc
    private constructor(
        private val office: JsonField<String>,
        private val phone: JsonField<String>,
        private val pocName: JsonField<String>,
        private val pocOrg: JsonField<String>,
        private val pocSequenceId: JsonField<Int>,
        private val pocTypeName: JsonField<String>,
        private val rank: JsonField<String>,
        private val remark: JsonField<String>,
        private val username: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("office") @ExcludeMissing office: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pocName") @ExcludeMissing pocName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pocOrg") @ExcludeMissing pocOrg: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pocSequenceId")
            @ExcludeMissing
            pocSequenceId: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("pocTypeName")
            @ExcludeMissing
            pocTypeName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rank") @ExcludeMissing rank: JsonField<String> = JsonMissing.of(),
            @JsonProperty("remark") @ExcludeMissing remark: JsonField<String> = JsonMissing.of(),
            @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
        ) : this(
            office,
            phone,
            pocName,
            pocOrg,
            pocSequenceId,
            pocTypeName,
            rank,
            remark,
            username,
            mutableMapOf(),
        )

        /**
         * Office name for which the contact belongs.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun office(): Optional<String> = office.getOptional("office")

        /**
         * Phone number of the contact.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun phone(): Optional<String> = phone.getOptional("phone")

        /**
         * The name of the contact.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pocName(): Optional<String> = pocName.getOptional("pocName")

        /**
         * Organization name for which the contact belongs.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pocOrg(): Optional<String> = pocOrg.getOptional("pocOrg")

        /**
         * Sequencing field for point of contact.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pocSequenceId(): Optional<Int> = pocSequenceId.getOptional("pocSequenceId")

        /**
         * A code or name that represents the contact's role in association to the track route (ex.
         * Originator, Scheduler, Maintainer, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pocTypeName(): Optional<String> = pocTypeName.getOptional("pocTypeName")

        /**
         * The rank of contact.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rank(): Optional<String> = rank.getOptional("rank")

        /**
         * Text of the remark.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun remark(): Optional<String> = remark.getOptional("remark")

        /**
         * The username of the contact.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun username(): Optional<String> = username.getOptional("username")

        /**
         * Returns the raw JSON value of [office].
         *
         * Unlike [office], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("office") @ExcludeMissing fun _office(): JsonField<String> = office

        /**
         * Returns the raw JSON value of [phone].
         *
         * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

        /**
         * Returns the raw JSON value of [pocName].
         *
         * Unlike [pocName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pocName") @ExcludeMissing fun _pocName(): JsonField<String> = pocName

        /**
         * Returns the raw JSON value of [pocOrg].
         *
         * Unlike [pocOrg], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pocOrg") @ExcludeMissing fun _pocOrg(): JsonField<String> = pocOrg

        /**
         * Returns the raw JSON value of [pocSequenceId].
         *
         * Unlike [pocSequenceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pocSequenceId")
        @ExcludeMissing
        fun _pocSequenceId(): JsonField<Int> = pocSequenceId

        /**
         * Returns the raw JSON value of [pocTypeName].
         *
         * Unlike [pocTypeName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pocTypeName")
        @ExcludeMissing
        fun _pocTypeName(): JsonField<String> = pocTypeName

        /**
         * Returns the raw JSON value of [rank].
         *
         * Unlike [rank], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rank") @ExcludeMissing fun _rank(): JsonField<String> = rank

        /**
         * Returns the raw JSON value of [remark].
         *
         * Unlike [remark], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("remark") @ExcludeMissing fun _remark(): JsonField<String> = remark

        /**
         * Returns the raw JSON value of [username].
         *
         * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

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

            /** Returns a mutable builder for constructing an instance of [Poc]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Poc]. */
        class Builder internal constructor() {

            private var office: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var pocName: JsonField<String> = JsonMissing.of()
            private var pocOrg: JsonField<String> = JsonMissing.of()
            private var pocSequenceId: JsonField<Int> = JsonMissing.of()
            private var pocTypeName: JsonField<String> = JsonMissing.of()
            private var rank: JsonField<String> = JsonMissing.of()
            private var remark: JsonField<String> = JsonMissing.of()
            private var username: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(poc: Poc) = apply {
                office = poc.office
                phone = poc.phone
                pocName = poc.pocName
                pocOrg = poc.pocOrg
                pocSequenceId = poc.pocSequenceId
                pocTypeName = poc.pocTypeName
                rank = poc.rank
                remark = poc.remark
                username = poc.username
                additionalProperties = poc.additionalProperties.toMutableMap()
            }

            /** Office name for which the contact belongs. */
            fun office(office: String) = office(JsonField.of(office))

            /**
             * Sets [Builder.office] to an arbitrary JSON value.
             *
             * You should usually call [Builder.office] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun office(office: JsonField<String>) = apply { this.office = office }

            /** Phone number of the contact. */
            fun phone(phone: String) = phone(JsonField.of(phone))

            /**
             * Sets [Builder.phone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            /** The name of the contact. */
            fun pocName(pocName: String) = pocName(JsonField.of(pocName))

            /**
             * Sets [Builder.pocName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pocName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pocName(pocName: JsonField<String>) = apply { this.pocName = pocName }

            /** Organization name for which the contact belongs. */
            fun pocOrg(pocOrg: String) = pocOrg(JsonField.of(pocOrg))

            /**
             * Sets [Builder.pocOrg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pocOrg] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pocOrg(pocOrg: JsonField<String>) = apply { this.pocOrg = pocOrg }

            /** Sequencing field for point of contact. */
            fun pocSequenceId(pocSequenceId: Int) = pocSequenceId(JsonField.of(pocSequenceId))

            /**
             * Sets [Builder.pocSequenceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pocSequenceId] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pocSequenceId(pocSequenceId: JsonField<Int>) = apply {
                this.pocSequenceId = pocSequenceId
            }

            /**
             * A code or name that represents the contact's role in association to the track route
             * (ex. Originator, Scheduler, Maintainer, etc.).
             */
            fun pocTypeName(pocTypeName: String) = pocTypeName(JsonField.of(pocTypeName))

            /**
             * Sets [Builder.pocTypeName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pocTypeName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pocTypeName(pocTypeName: JsonField<String>) = apply {
                this.pocTypeName = pocTypeName
            }

            /** The rank of contact. */
            fun rank(rank: String) = rank(JsonField.of(rank))

            /**
             * Sets [Builder.rank] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rank] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rank(rank: JsonField<String>) = apply { this.rank = rank }

            /** Text of the remark. */
            fun remark(remark: String) = remark(JsonField.of(remark))

            /**
             * Sets [Builder.remark] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remark] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remark(remark: JsonField<String>) = apply { this.remark = remark }

            /** The username of the contact. */
            fun username(username: String) = username(JsonField.of(username))

            /**
             * Sets [Builder.username] to an arbitrary JSON value.
             *
             * You should usually call [Builder.username] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun username(username: JsonField<String>) = apply { this.username = username }

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
             * Returns an immutable instance of [Poc].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Poc =
                Poc(
                    office,
                    phone,
                    pocName,
                    pocOrg,
                    pocSequenceId,
                    pocTypeName,
                    rank,
                    remark,
                    username,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Poc = apply {
            if (validated) {
                return@apply
            }

            office()
            phone()
            pocName()
            pocOrg()
            pocSequenceId()
            pocTypeName()
            rank()
            remark()
            username()
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
            (if (office.asKnown().isPresent) 1 else 0) +
                (if (phone.asKnown().isPresent) 1 else 0) +
                (if (pocName.asKnown().isPresent) 1 else 0) +
                (if (pocOrg.asKnown().isPresent) 1 else 0) +
                (if (pocSequenceId.asKnown().isPresent) 1 else 0) +
                (if (pocTypeName.asKnown().isPresent) 1 else 0) +
                (if (rank.asKnown().isPresent) 1 else 0) +
                (if (remark.asKnown().isPresent) 1 else 0) +
                (if (username.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Poc &&
                office == other.office &&
                phone == other.phone &&
                pocName == other.pocName &&
                pocOrg == other.pocOrg &&
                pocSequenceId == other.pocSequenceId &&
                pocTypeName == other.pocTypeName &&
                rank == other.rank &&
                remark == other.remark &&
                username == other.username &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                office,
                phone,
                pocName,
                pocOrg,
                pocSequenceId,
                pocTypeName,
                rank,
                remark,
                username,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Poc{office=$office, phone=$phone, pocName=$pocName, pocOrg=$pocOrg, pocSequenceId=$pocSequenceId, pocTypeName=$pocTypeName, rank=$rank, remark=$remark, username=$username, additionalProperties=$additionalProperties}"
    }

    /** Points identified within the route. */
    class RoutePoint
    private constructor(
        private val altCountryCode: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val dafifPt: JsonField<Boolean>,
        private val magDec: JsonField<Double>,
        private val navaid: JsonField<String>,
        private val navaidLength: JsonField<Double>,
        private val navaidType: JsonField<String>,
        private val ptLat: JsonField<Double>,
        private val ptLon: JsonField<Double>,
        private val ptSequenceId: JsonField<Int>,
        private val ptTypeCode: JsonField<String>,
        private val ptTypeName: JsonField<String>,
        private val waypointName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("altCountryCode")
            @ExcludeMissing
            altCountryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("countryCode")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dafifPt") @ExcludeMissing dafifPt: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("magDec") @ExcludeMissing magDec: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("navaid") @ExcludeMissing navaid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("navaidLength")
            @ExcludeMissing
            navaidLength: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("navaidType")
            @ExcludeMissing
            navaidType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ptLat") @ExcludeMissing ptLat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("ptLon") @ExcludeMissing ptLon: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("ptSequenceId")
            @ExcludeMissing
            ptSequenceId: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("ptTypeCode")
            @ExcludeMissing
            ptTypeCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ptTypeName")
            @ExcludeMissing
            ptTypeName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("waypointName")
            @ExcludeMissing
            waypointName: JsonField<String> = JsonMissing.of(),
        ) : this(
            altCountryCode,
            countryCode,
            dafifPt,
            magDec,
            navaid,
            navaidLength,
            navaidType,
            ptLat,
            ptLon,
            ptSequenceId,
            ptTypeCode,
            ptTypeName,
            waypointName,
            mutableMapOf(),
        )

        /**
         * Specifies an alternate country code if the data provider code is not part of an official
         * NAVAID Country Code standard such as ISO-3166 or FIPS. This field will be set to the
         * value provided by the source and should be used for all Queries specifying a Country
         * Code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun altCountryCode(): Optional<String> = altCountryCode.getOptional("altCountryCode")

        /**
         * The DoD Standard Country Code designator for the country where the route point resides.
         * This field should be set to "OTHR" if the source value does not match a UDL country code
         * value (ISO-3166-ALPHA-2).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

        /**
         * Flag indicating this is a Digital Aeronautical Flight Information File (DAFIF) point.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dafifPt(): Optional<Boolean> = dafifPt.getOptional("dafifPt")

        /**
         * The magnetic declination/variation of the route point location from true north, in
         * degrees. Positive values east of true north and negative values west of true north.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun magDec(): Optional<Double> = magDec.getOptional("magDec")

        /**
         * Navigational Aid (NAVAID) identification code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun navaid(): Optional<String> = navaid.getOptional("navaid")

        /**
         * The length of the course from the Navigational Aid (NAVAID) in nautical miles.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun navaidLength(): Optional<Double> = navaidLength.getOptional("navaidLength")

        /**
         * The NAVAID type of this route point (ex. VOR, VORTAC, TACAN, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun navaidType(): Optional<String> = navaidType.getOptional("navaidType")

        /**
         * WGS84 latitude of the point location, in degrees. -90 to 90 degrees (negative values
         * south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ptLat(): Optional<Double> = ptLat.getOptional("ptLat")

        /**
         * WGS84 longitude of the point location, in degrees. -180 to 180 degrees (negative values
         * west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ptLon(): Optional<Double> = ptLon.getOptional("ptLon")

        /**
         * Sequencing field for the track route. This is the identifier representing the sequence of
         * waypoints associated to the track route.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ptSequenceId(): Optional<Int> = ptSequenceId.getOptional("ptSequenceId")

        /**
         * Code representation of the point within the track route (ex. EP, EX, CP, IP, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ptTypeCode(): Optional<String> = ptTypeCode.getOptional("ptTypeCode")

        /**
         * The name that represents the point within the track route (ex. ENTRY POINT, EXIT POINT,
         * CONTROL POINT, INITIAL POINT, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ptTypeName(): Optional<String> = ptTypeName.getOptional("ptTypeName")

        /**
         * Name of a waypoint which identifies the location of the point.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun waypointName(): Optional<String> = waypointName.getOptional("waypointName")

        /**
         * Returns the raw JSON value of [altCountryCode].
         *
         * Unlike [altCountryCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("altCountryCode")
        @ExcludeMissing
        fun _altCountryCode(): JsonField<String> = altCountryCode

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryCode")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [dafifPt].
         *
         * Unlike [dafifPt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dafifPt") @ExcludeMissing fun _dafifPt(): JsonField<Boolean> = dafifPt

        /**
         * Returns the raw JSON value of [magDec].
         *
         * Unlike [magDec], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("magDec") @ExcludeMissing fun _magDec(): JsonField<Double> = magDec

        /**
         * Returns the raw JSON value of [navaid].
         *
         * Unlike [navaid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("navaid") @ExcludeMissing fun _navaid(): JsonField<String> = navaid

        /**
         * Returns the raw JSON value of [navaidLength].
         *
         * Unlike [navaidLength], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("navaidLength")
        @ExcludeMissing
        fun _navaidLength(): JsonField<Double> = navaidLength

        /**
         * Returns the raw JSON value of [navaidType].
         *
         * Unlike [navaidType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("navaidType")
        @ExcludeMissing
        fun _navaidType(): JsonField<String> = navaidType

        /**
         * Returns the raw JSON value of [ptLat].
         *
         * Unlike [ptLat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ptLat") @ExcludeMissing fun _ptLat(): JsonField<Double> = ptLat

        /**
         * Returns the raw JSON value of [ptLon].
         *
         * Unlike [ptLon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ptLon") @ExcludeMissing fun _ptLon(): JsonField<Double> = ptLon

        /**
         * Returns the raw JSON value of [ptSequenceId].
         *
         * Unlike [ptSequenceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ptSequenceId")
        @ExcludeMissing
        fun _ptSequenceId(): JsonField<Int> = ptSequenceId

        /**
         * Returns the raw JSON value of [ptTypeCode].
         *
         * Unlike [ptTypeCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ptTypeCode")
        @ExcludeMissing
        fun _ptTypeCode(): JsonField<String> = ptTypeCode

        /**
         * Returns the raw JSON value of [ptTypeName].
         *
         * Unlike [ptTypeName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ptTypeName")
        @ExcludeMissing
        fun _ptTypeName(): JsonField<String> = ptTypeName

        /**
         * Returns the raw JSON value of [waypointName].
         *
         * Unlike [waypointName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("waypointName")
        @ExcludeMissing
        fun _waypointName(): JsonField<String> = waypointName

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

            /** Returns a mutable builder for constructing an instance of [RoutePoint]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RoutePoint]. */
        class Builder internal constructor() {

            private var altCountryCode: JsonField<String> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var dafifPt: JsonField<Boolean> = JsonMissing.of()
            private var magDec: JsonField<Double> = JsonMissing.of()
            private var navaid: JsonField<String> = JsonMissing.of()
            private var navaidLength: JsonField<Double> = JsonMissing.of()
            private var navaidType: JsonField<String> = JsonMissing.of()
            private var ptLat: JsonField<Double> = JsonMissing.of()
            private var ptLon: JsonField<Double> = JsonMissing.of()
            private var ptSequenceId: JsonField<Int> = JsonMissing.of()
            private var ptTypeCode: JsonField<String> = JsonMissing.of()
            private var ptTypeName: JsonField<String> = JsonMissing.of()
            private var waypointName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(routePoint: RoutePoint) = apply {
                altCountryCode = routePoint.altCountryCode
                countryCode = routePoint.countryCode
                dafifPt = routePoint.dafifPt
                magDec = routePoint.magDec
                navaid = routePoint.navaid
                navaidLength = routePoint.navaidLength
                navaidType = routePoint.navaidType
                ptLat = routePoint.ptLat
                ptLon = routePoint.ptLon
                ptSequenceId = routePoint.ptSequenceId
                ptTypeCode = routePoint.ptTypeCode
                ptTypeName = routePoint.ptTypeName
                waypointName = routePoint.waypointName
                additionalProperties = routePoint.additionalProperties.toMutableMap()
            }

            /**
             * Specifies an alternate country code if the data provider code is not part of an
             * official NAVAID Country Code standard such as ISO-3166 or FIPS. This field will be
             * set to the value provided by the source and should be used for all Queries specifying
             * a Country Code.
             */
            fun altCountryCode(altCountryCode: String) =
                altCountryCode(JsonField.of(altCountryCode))

            /**
             * Sets [Builder.altCountryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altCountryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altCountryCode(altCountryCode: JsonField<String>) = apply {
                this.altCountryCode = altCountryCode
            }

            /**
             * The DoD Standard Country Code designator for the country where the route point
             * resides. This field should be set to "OTHR" if the source value does not match a UDL
             * country code value (ISO-3166-ALPHA-2).
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

            /**
             * Flag indicating this is a Digital Aeronautical Flight Information File (DAFIF) point.
             */
            fun dafifPt(dafifPt: Boolean) = dafifPt(JsonField.of(dafifPt))

            /**
             * Sets [Builder.dafifPt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dafifPt] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dafifPt(dafifPt: JsonField<Boolean>) = apply { this.dafifPt = dafifPt }

            /**
             * The magnetic declination/variation of the route point location from true north, in
             * degrees. Positive values east of true north and negative values west of true north.
             */
            fun magDec(magDec: Double) = magDec(JsonField.of(magDec))

            /**
             * Sets [Builder.magDec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.magDec] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun magDec(magDec: JsonField<Double>) = apply { this.magDec = magDec }

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

            /** The length of the course from the Navigational Aid (NAVAID) in nautical miles. */
            fun navaidLength(navaidLength: Double) = navaidLength(JsonField.of(navaidLength))

            /**
             * Sets [Builder.navaidLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.navaidLength] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun navaidLength(navaidLength: JsonField<Double>) = apply {
                this.navaidLength = navaidLength
            }

            /** The NAVAID type of this route point (ex. VOR, VORTAC, TACAN, etc.). */
            fun navaidType(navaidType: String) = navaidType(JsonField.of(navaidType))

            /**
             * Sets [Builder.navaidType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.navaidType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun navaidType(navaidType: JsonField<String>) = apply { this.navaidType = navaidType }

            /**
             * WGS84 latitude of the point location, in degrees. -90 to 90 degrees (negative values
             * south of equator).
             */
            fun ptLat(ptLat: Double) = ptLat(JsonField.of(ptLat))

            /**
             * Sets [Builder.ptLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ptLat] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ptLat(ptLat: JsonField<Double>) = apply { this.ptLat = ptLat }

            /**
             * WGS84 longitude of the point location, in degrees. -180 to 180 degrees (negative
             * values west of Prime Meridian).
             */
            fun ptLon(ptLon: Double) = ptLon(JsonField.of(ptLon))

            /**
             * Sets [Builder.ptLon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ptLon] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ptLon(ptLon: JsonField<Double>) = apply { this.ptLon = ptLon }

            /**
             * Sequencing field for the track route. This is the identifier representing the
             * sequence of waypoints associated to the track route.
             */
            fun ptSequenceId(ptSequenceId: Int) = ptSequenceId(JsonField.of(ptSequenceId))

            /**
             * Sets [Builder.ptSequenceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ptSequenceId] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ptSequenceId(ptSequenceId: JsonField<Int>) = apply {
                this.ptSequenceId = ptSequenceId
            }

            /**
             * Code representation of the point within the track route (ex. EP, EX, CP, IP, etc.).
             */
            fun ptTypeCode(ptTypeCode: String) = ptTypeCode(JsonField.of(ptTypeCode))

            /**
             * Sets [Builder.ptTypeCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ptTypeCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ptTypeCode(ptTypeCode: JsonField<String>) = apply { this.ptTypeCode = ptTypeCode }

            /**
             * The name that represents the point within the track route (ex. ENTRY POINT, EXIT
             * POINT, CONTROL POINT, INITIAL POINT, etc.).
             */
            fun ptTypeName(ptTypeName: String) = ptTypeName(JsonField.of(ptTypeName))

            /**
             * Sets [Builder.ptTypeName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ptTypeName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ptTypeName(ptTypeName: JsonField<String>) = apply { this.ptTypeName = ptTypeName }

            /** Name of a waypoint which identifies the location of the point. */
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
             * Returns an immutable instance of [RoutePoint].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RoutePoint =
                RoutePoint(
                    altCountryCode,
                    countryCode,
                    dafifPt,
                    magDec,
                    navaid,
                    navaidLength,
                    navaidType,
                    ptLat,
                    ptLon,
                    ptSequenceId,
                    ptTypeCode,
                    ptTypeName,
                    waypointName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RoutePoint = apply {
            if (validated) {
                return@apply
            }

            altCountryCode()
            countryCode()
            dafifPt()
            magDec()
            navaid()
            navaidLength()
            navaidType()
            ptLat()
            ptLon()
            ptSequenceId()
            ptTypeCode()
            ptTypeName()
            waypointName()
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
            (if (altCountryCode.asKnown().isPresent) 1 else 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (dafifPt.asKnown().isPresent) 1 else 0) +
                (if (magDec.asKnown().isPresent) 1 else 0) +
                (if (navaid.asKnown().isPresent) 1 else 0) +
                (if (navaidLength.asKnown().isPresent) 1 else 0) +
                (if (navaidType.asKnown().isPresent) 1 else 0) +
                (if (ptLat.asKnown().isPresent) 1 else 0) +
                (if (ptLon.asKnown().isPresent) 1 else 0) +
                (if (ptSequenceId.asKnown().isPresent) 1 else 0) +
                (if (ptTypeCode.asKnown().isPresent) 1 else 0) +
                (if (ptTypeName.asKnown().isPresent) 1 else 0) +
                (if (waypointName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RoutePoint &&
                altCountryCode == other.altCountryCode &&
                countryCode == other.countryCode &&
                dafifPt == other.dafifPt &&
                magDec == other.magDec &&
                navaid == other.navaid &&
                navaidLength == other.navaidLength &&
                navaidType == other.navaidType &&
                ptLat == other.ptLat &&
                ptLon == other.ptLon &&
                ptSequenceId == other.ptSequenceId &&
                ptTypeCode == other.ptTypeCode &&
                ptTypeName == other.ptTypeName &&
                waypointName == other.waypointName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                altCountryCode,
                countryCode,
                dafifPt,
                magDec,
                navaid,
                navaidLength,
                navaidType,
                ptLat,
                ptLon,
                ptSequenceId,
                ptTypeCode,
                ptTypeName,
                waypointName,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RoutePoint{altCountryCode=$altCountryCode, countryCode=$countryCode, dafifPt=$dafifPt, magDec=$magDec, navaid=$navaid, navaidLength=$navaidLength, navaidType=$navaidType, ptLat=$ptLat, ptLon=$ptLon, ptSequenceId=$ptSequenceId, ptTypeCode=$ptTypeCode, ptTypeName=$ptTypeName, waypointName=$waypointName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackRouteFull &&
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
        "TrackRouteFull{classificationMarking=$classificationMarking, dataMode=$dataMode, lastUpdateDate=$lastUpdateDate, source=$source, type=$type, id=$id, altitudeBlocks=$altitudeBlocks, apnSetting=$apnSetting, apxBeaconCode=$apxBeaconCode, artccMessage=$artccMessage, createdAt=$createdAt, createdBy=$createdBy, creatingOrg=$creatingOrg, direction=$direction, effectiveDate=$effectiveDate, externalId=$externalId, lastUsedDate=$lastUsedDate, locationTrackId=$locationTrackId, origin=$origin, origNetwork=$origNetwork, poc=$poc, priFreq=$priFreq, receiverTankerChCode=$receiverTankerChCode, regionCode=$regionCode, regionName=$regionName, reviewDate=$reviewDate, routePoints=$routePoints, schedulerOrgName=$schedulerOrgName, schedulerOrgUnit=$schedulerOrgUnit, secFreq=$secFreq, shortName=$shortName, sic=$sic, sourceDl=$sourceDl, trackId=$trackId, trackName=$trackName, typeCode=$typeCode, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

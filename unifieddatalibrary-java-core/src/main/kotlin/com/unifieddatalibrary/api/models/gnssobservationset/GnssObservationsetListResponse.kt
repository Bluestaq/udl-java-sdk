// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.gnssobservationset

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

/** Set of GNSSObservation data. */
class GnssObservationsetListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val ts: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val agcState: JsonField<Int>,
    private val alt: JsonField<Double>,
    private val boresight: JsonField<List<Double>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val esId: JsonField<String>,
    private val eventId: JsonField<String>,
    private val gDop: JsonField<Double>,
    private val gnssObservationList: JsonField<List<GnssObservationList>>,
    private val hDop: JsonField<Double>,
    private val idOnOrbit: JsonField<String>,
    private val lat: JsonField<Double>,
    private val lon: JsonField<Double>,
    private val markerType: JsonField<String>,
    private val navigationStatus: JsonField<String>,
    private val obsCodes: JsonField<List<String>>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val outage: JsonField<Int>,
    private val pDop: JsonField<Double>,
    private val quat: JsonField<List<Double>>,
    private val receiver: JsonField<String>,
    private val satNo: JsonField<Int>,
    private val satPosition: JsonField<List<Double>>,
    private val satVelocity: JsonField<List<Double>>,
    private val srcIds: JsonField<List<String>>,
    private val srcTyps: JsonField<List<String>>,
    private val tags: JsonField<List<String>>,
    private val tDop: JsonField<Double>,
    private val trackingStatus: JsonField<Int>,
    private val transactionId: JsonField<String>,
    private val vDop: JsonField<Double>,
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
        @JsonProperty("agcState") @ExcludeMissing agcState: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("alt") @ExcludeMissing alt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("boresight")
        @ExcludeMissing
        boresight: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("esId") @ExcludeMissing esId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventId") @ExcludeMissing eventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("gDop") @ExcludeMissing gDop: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gnssObservationList")
        @ExcludeMissing
        gnssObservationList: JsonField<List<GnssObservationList>> = JsonMissing.of(),
        @JsonProperty("hDop") @ExcludeMissing hDop: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("markerType")
        @ExcludeMissing
        markerType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("navigationStatus")
        @ExcludeMissing
        navigationStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("obsCodes")
        @ExcludeMissing
        obsCodes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("outage") @ExcludeMissing outage: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("pDop") @ExcludeMissing pDop: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("quat") @ExcludeMissing quat: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("receiver") @ExcludeMissing receiver: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("satPosition")
        @ExcludeMissing
        satPosition: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("satVelocity")
        @ExcludeMissing
        satVelocity: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("srcIds") @ExcludeMissing srcIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("srcTyps")
        @ExcludeMissing
        srcTyps: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tDop") @ExcludeMissing tDop: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trackingStatus")
        @ExcludeMissing
        trackingStatus: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vDop") @ExcludeMissing vDop: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        ts,
        id,
        agcState,
        alt,
        boresight,
        createdAt,
        createdBy,
        esId,
        eventId,
        gDop,
        gnssObservationList,
        hDop,
        idOnOrbit,
        lat,
        lon,
        markerType,
        navigationStatus,
        obsCodes,
        origin,
        origNetwork,
        origObjectId,
        outage,
        pDop,
        quat,
        receiver,
        satNo,
        satPosition,
        satVelocity,
        srcIds,
        srcTyps,
        tags,
        tDop,
        trackingStatus,
        transactionId,
        vDop,
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
     * Observation Time, in ISO8601 UTC format with microsecond precision. This timestamp applies to
     * all observations within the set.
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
     * GNSS Automatic Gain Control State.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun agcState(): Optional<Int> = agcState.getOptional("agcState")

    /**
     * Spacecraft altitude at observation time (ts), expressed in kilometers above WGS-84 ellipsoid.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun alt(): Optional<Double> = alt.getOptional("alt")

    /**
     * unit vector of the outward facing direction of the receiver boresight in a body-fixed
     * coordinate system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun boresight(): Optional<List<Double>> = boresight.getOptional("boresight")

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
     * Unique identifier of the parent Ephemeris Set, if this data is correlated with an Ephemeris.
     * If reporting for a spacecraft with multiple onboard GNSS receivers, this ID may be associated
     * with multiple GNSS Observation records if each receiver is synced to the ephemeris points.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun esId(): Optional<String> = esId.getOptional("esId")

    /**
     * Optional source-provided identifier for this collection event. This field can be used to
     * associate records related to the same event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eventId(): Optional<String> = eventId.getOptional("eventId")

    /**
     * Geometric Dilution of Precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gDop(): Optional<Double> = gDop.getOptional("gDop")

    /**
     * GNSSObservations associated with this GNSSObservationSet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gnssObservationList(): Optional<List<GnssObservationList>> =
        gnssObservationList.getOptional("gnssObservationList")

    /**
     * Horizontal Dilution of Precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hDop(): Optional<Double> = hDop.getOptional("hDop")

    /**
     * Unique identifier of the primary satellite on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * WGS-84 spacecraft latitude sub-point at observation time (ts), represented as -90 to 90
     * degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lat(): Optional<Double> = lat.getOptional("lat")

    /**
     * WGS-84 spacecraft longitude sub-point at observation time (ts), represented as -180 to 180
     * degrees (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lon(): Optional<Double> = lon.getOptional("lon")

    /**
     * The marker type of the observing receiver (AIRBORNE, ANIMAL, BALLISTIC, FIXED BUOY, FLOATING
     * BUOY, FLOATING ICE, GEODETIC, GLACIER, GROUNDCRAFT, HUMAN, NON GEODETIC, NON PHYSICAL,
     * SPACEBORNE, WATERCRAFT). Reference RINEX 3+ for further information concerning marker types.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun markerType(): Optional<String> = markerType.getOptional("markerType")

    /**
     * The current navigation status as defined by the data source. In general the navigation status
     * specifies whether the signal is normal, degraded, or unavailable. For status value
     * definitions please reach out to data source provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun navigationStatus(): Optional<String> = navigationStatus.getOptional("navigationStatus")

    /**
     * Array of the strings containing the individual observation code sets that are contained
     * within this GNSS Observation set. Each string is a three-character representation of the
     * measurement type, the channel, and the coding, in compliance with the RINEX 3+ standard
     * (Pseudorange (C), Carrier Phase (L), Doppler (D), Signal Strength C/No (S), or Channel Number
     * (X)). See the GNSS Observation ob field for the units of measure associated with each
     * observation type.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun obsCodes(): Optional<List<String>> = obsCodes.getOptional("obsCodes")

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
     * Optional identifier provided by ephemeris source to indicate the target object of this
     * ephemeris. This may be an internal identifier and not necessarily map to a valid satellite
     * number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Time, in seconds, that the receiver has been unable to compute a GNSS fix.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun outage(): Optional<Int> = outage.getOptional("outage")

    /**
     * Position Dilution of Precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pDop(): Optional<Double> = pDop.getOptional("pDop")

    /**
     * The quaternion describing the rotation of the body-fixed frame used for this system into the
     * local geodetic frame, at observation time (ts). The array element order convention is scalar
     * component first, followed by the three vector components. For a vector u in the body-fixed
     * frame, the corresponding vector u' in the geodetic frame should satisfy u' = quq\*, where q
     * is this quaternion.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun quat(): Optional<List<Double>> = quat.getOptional("quat")

    /**
     * The number or ID of the GNSS receiver associated with this data. Each GNSS Observation Set is
     * associated with only one receiver. If reporting for multiple receivers a separate set should
     * be generated for each. A null value is assumed to indicate that only one receiver is present,
     * or reported.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun receiver(): Optional<String> = receiver.getOptional("receiver")

    /**
     * Satellite/catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Three element array, expressing the ECI J2K spacecraft position components, in kilometers, at
     * observation time (ts). The array element order is [x, y, z].
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satPosition(): Optional<List<Double>> = satPosition.getOptional("satPosition")

    /**
     * Three element array, expressing the ECI J2K spacecraft velocity components, in km/second, at
     * observation time (ts). The array element order is [xvel, yvel, zvel].
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satVelocity(): Optional<List<Double>> = satVelocity.getOptional("satVelocity")

    /**
     * Array of UUIDs of the UDL data records that are related to this GNSS Observation Set. See the
     * associated 'srcTyps' array for the specific types of data, positionally corresponding to the
     * UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in size. See the
     * corresponding srcTyps array element for the data type of the UUID and use the appropriate API
     * operation to retrieve that object (e.g. /udl/statevector/{uuid}).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun srcIds(): Optional<List<String>> = srcIds.getOptional("srcIds")

    /**
     * Array of UDL record types (AIS, CONJUNCTION, DOA, ELSET, EO, ESID, GROUNDIMAGE, POI,
     * MANEUVER, MTI, NOTIFICATION, RADAR, RF, SIGACT, SKYIMAGE, SV, TRACK) that are related to this
     * GNSS Observation Set. See the associated 'srcIds' array for the record UUIDs, positionally
     * corresponding to the record types in this array. The 'srcTyps' and 'srcIds' arrays must match
     * in size.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun srcTyps(): Optional<List<String>> = srcTyps.getOptional("srcTyps")

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
     * Time Dilution of Precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tDop(): Optional<Double> = tDop.getOptional("tDop")

    /**
     * Status of the GNSS receiver signal. Status options are 0, 1 or 2 (0 being the best).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackingStatus(): Optional<Int> = trackingStatus.getOptional("trackingStatus")

    /**
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

    /**
     * Vertical Dilution of Precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vDop(): Optional<Double> = vDop.getOptional("vDop")

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
     * Returns the raw JSON value of [agcState].
     *
     * Unlike [agcState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agcState") @ExcludeMissing fun _agcState(): JsonField<Int> = agcState

    /**
     * Returns the raw JSON value of [alt].
     *
     * Unlike [alt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alt") @ExcludeMissing fun _alt(): JsonField<Double> = alt

    /**
     * Returns the raw JSON value of [boresight].
     *
     * Unlike [boresight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("boresight") @ExcludeMissing fun _boresight(): JsonField<List<Double>> = boresight

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
     * Returns the raw JSON value of [esId].
     *
     * Unlike [esId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("esId") @ExcludeMissing fun _esId(): JsonField<String> = esId

    /**
     * Returns the raw JSON value of [eventId].
     *
     * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventId") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

    /**
     * Returns the raw JSON value of [gDop].
     *
     * Unlike [gDop], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gDop") @ExcludeMissing fun _gDop(): JsonField<Double> = gDop

    /**
     * Returns the raw JSON value of [gnssObservationList].
     *
     * Unlike [gnssObservationList], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("gnssObservationList")
    @ExcludeMissing
    fun _gnssObservationList(): JsonField<List<GnssObservationList>> = gnssObservationList

    /**
     * Returns the raw JSON value of [hDop].
     *
     * Unlike [hDop], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hDop") @ExcludeMissing fun _hDop(): JsonField<Double> = hDop

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

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
     * Returns the raw JSON value of [markerType].
     *
     * Unlike [markerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("markerType") @ExcludeMissing fun _markerType(): JsonField<String> = markerType

    /**
     * Returns the raw JSON value of [navigationStatus].
     *
     * Unlike [navigationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("navigationStatus")
    @ExcludeMissing
    fun _navigationStatus(): JsonField<String> = navigationStatus

    /**
     * Returns the raw JSON value of [obsCodes].
     *
     * Unlike [obsCodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obsCodes") @ExcludeMissing fun _obsCodes(): JsonField<List<String>> = obsCodes

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
     * Returns the raw JSON value of [outage].
     *
     * Unlike [outage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outage") @ExcludeMissing fun _outage(): JsonField<Int> = outage

    /**
     * Returns the raw JSON value of [pDop].
     *
     * Unlike [pDop], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pDop") @ExcludeMissing fun _pDop(): JsonField<Double> = pDop

    /**
     * Returns the raw JSON value of [quat].
     *
     * Unlike [quat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quat") @ExcludeMissing fun _quat(): JsonField<List<Double>> = quat

    /**
     * Returns the raw JSON value of [receiver].
     *
     * Unlike [receiver], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receiver") @ExcludeMissing fun _receiver(): JsonField<String> = receiver

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [satPosition].
     *
     * Unlike [satPosition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satPosition")
    @ExcludeMissing
    fun _satPosition(): JsonField<List<Double>> = satPosition

    /**
     * Returns the raw JSON value of [satVelocity].
     *
     * Unlike [satVelocity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satVelocity")
    @ExcludeMissing
    fun _satVelocity(): JsonField<List<Double>> = satVelocity

    /**
     * Returns the raw JSON value of [srcIds].
     *
     * Unlike [srcIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("srcIds") @ExcludeMissing fun _srcIds(): JsonField<List<String>> = srcIds

    /**
     * Returns the raw JSON value of [srcTyps].
     *
     * Unlike [srcTyps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("srcTyps") @ExcludeMissing fun _srcTyps(): JsonField<List<String>> = srcTyps

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [tDop].
     *
     * Unlike [tDop], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tDop") @ExcludeMissing fun _tDop(): JsonField<Double> = tDop

    /**
     * Returns the raw JSON value of [trackingStatus].
     *
     * Unlike [trackingStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackingStatus")
    @ExcludeMissing
    fun _trackingStatus(): JsonField<Int> = trackingStatus

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [vDop].
     *
     * Unlike [vDop], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vDop") @ExcludeMissing fun _vDop(): JsonField<Double> = vDop

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
         * [GnssObservationsetListResponse].
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

    /** A builder for [GnssObservationsetListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var ts: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var agcState: JsonField<Int> = JsonMissing.of()
        private var alt: JsonField<Double> = JsonMissing.of()
        private var boresight: JsonField<MutableList<Double>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var esId: JsonField<String> = JsonMissing.of()
        private var eventId: JsonField<String> = JsonMissing.of()
        private var gDop: JsonField<Double> = JsonMissing.of()
        private var gnssObservationList: JsonField<MutableList<GnssObservationList>>? = null
        private var hDop: JsonField<Double> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var lat: JsonField<Double> = JsonMissing.of()
        private var lon: JsonField<Double> = JsonMissing.of()
        private var markerType: JsonField<String> = JsonMissing.of()
        private var navigationStatus: JsonField<String> = JsonMissing.of()
        private var obsCodes: JsonField<MutableList<String>>? = null
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var outage: JsonField<Int> = JsonMissing.of()
        private var pDop: JsonField<Double> = JsonMissing.of()
        private var quat: JsonField<MutableList<Double>>? = null
        private var receiver: JsonField<String> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var satPosition: JsonField<MutableList<Double>>? = null
        private var satVelocity: JsonField<MutableList<Double>>? = null
        private var srcIds: JsonField<MutableList<String>>? = null
        private var srcTyps: JsonField<MutableList<String>>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var tDop: JsonField<Double> = JsonMissing.of()
        private var trackingStatus: JsonField<Int> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var vDop: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(gnssObservationsetListResponse: GnssObservationsetListResponse) = apply {
            classificationMarking = gnssObservationsetListResponse.classificationMarking
            dataMode = gnssObservationsetListResponse.dataMode
            source = gnssObservationsetListResponse.source
            ts = gnssObservationsetListResponse.ts
            id = gnssObservationsetListResponse.id
            agcState = gnssObservationsetListResponse.agcState
            alt = gnssObservationsetListResponse.alt
            boresight = gnssObservationsetListResponse.boresight.map { it.toMutableList() }
            createdAt = gnssObservationsetListResponse.createdAt
            createdBy = gnssObservationsetListResponse.createdBy
            esId = gnssObservationsetListResponse.esId
            eventId = gnssObservationsetListResponse.eventId
            gDop = gnssObservationsetListResponse.gDop
            gnssObservationList =
                gnssObservationsetListResponse.gnssObservationList.map { it.toMutableList() }
            hDop = gnssObservationsetListResponse.hDop
            idOnOrbit = gnssObservationsetListResponse.idOnOrbit
            lat = gnssObservationsetListResponse.lat
            lon = gnssObservationsetListResponse.lon
            markerType = gnssObservationsetListResponse.markerType
            navigationStatus = gnssObservationsetListResponse.navigationStatus
            obsCodes = gnssObservationsetListResponse.obsCodes.map { it.toMutableList() }
            origin = gnssObservationsetListResponse.origin
            origNetwork = gnssObservationsetListResponse.origNetwork
            origObjectId = gnssObservationsetListResponse.origObjectId
            outage = gnssObservationsetListResponse.outage
            pDop = gnssObservationsetListResponse.pDop
            quat = gnssObservationsetListResponse.quat.map { it.toMutableList() }
            receiver = gnssObservationsetListResponse.receiver
            satNo = gnssObservationsetListResponse.satNo
            satPosition = gnssObservationsetListResponse.satPosition.map { it.toMutableList() }
            satVelocity = gnssObservationsetListResponse.satVelocity.map { it.toMutableList() }
            srcIds = gnssObservationsetListResponse.srcIds.map { it.toMutableList() }
            srcTyps = gnssObservationsetListResponse.srcTyps.map { it.toMutableList() }
            tags = gnssObservationsetListResponse.tags.map { it.toMutableList() }
            tDop = gnssObservationsetListResponse.tDop
            trackingStatus = gnssObservationsetListResponse.trackingStatus
            transactionId = gnssObservationsetListResponse.transactionId
            vDop = gnssObservationsetListResponse.vDop
            additionalProperties =
                gnssObservationsetListResponse.additionalProperties.toMutableMap()
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

        /**
         * Observation Time, in ISO8601 UTC format with microsecond precision. This timestamp
         * applies to all observations within the set.
         */
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

        /** GNSS Automatic Gain Control State. */
        fun agcState(agcState: Int) = agcState(JsonField.of(agcState))

        /**
         * Sets [Builder.agcState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agcState] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agcState(agcState: JsonField<Int>) = apply { this.agcState = agcState }

        /**
         * Spacecraft altitude at observation time (ts), expressed in kilometers above WGS-84
         * ellipsoid.
         */
        fun alt(alt: Double) = alt(JsonField.of(alt))

        /**
         * Sets [Builder.alt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alt(alt: JsonField<Double>) = apply { this.alt = alt }

        /**
         * unit vector of the outward facing direction of the receiver boresight in a body-fixed
         * coordinate system.
         */
        fun boresight(boresight: List<Double>) = boresight(JsonField.of(boresight))

        /**
         * Sets [Builder.boresight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.boresight] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun boresight(boresight: JsonField<List<Double>>) = apply {
            this.boresight = boresight.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.boresight].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBoresight(boresight: Double) = apply {
            this.boresight =
                (this.boresight ?: JsonField.of(mutableListOf())).also {
                    checkKnown("boresight", it).add(boresight)
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
         * Unique identifier of the parent Ephemeris Set, if this data is correlated with an
         * Ephemeris. If reporting for a spacecraft with multiple onboard GNSS receivers, this ID
         * may be associated with multiple GNSS Observation records if each receiver is synced to
         * the ephemeris points.
         */
        fun esId(esId: String) = esId(JsonField.of(esId))

        /**
         * Sets [Builder.esId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.esId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun esId(esId: JsonField<String>) = apply { this.esId = esId }

        /**
         * Optional source-provided identifier for this collection event. This field can be used to
         * associate records related to the same event.
         */
        fun eventId(eventId: String) = eventId(JsonField.of(eventId))

        /**
         * Sets [Builder.eventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

        /** Geometric Dilution of Precision. */
        fun gDop(gDop: Double) = gDop(JsonField.of(gDop))

        /**
         * Sets [Builder.gDop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gDop] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gDop(gDop: JsonField<Double>) = apply { this.gDop = gDop }

        /** GNSSObservations associated with this GNSSObservationSet. */
        fun gnssObservationList(gnssObservationList: List<GnssObservationList>) =
            gnssObservationList(JsonField.of(gnssObservationList))

        /**
         * Sets [Builder.gnssObservationList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gnssObservationList] with a well-typed
         * `List<GnssObservationList>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun gnssObservationList(gnssObservationList: JsonField<List<GnssObservationList>>) = apply {
            this.gnssObservationList = gnssObservationList.map { it.toMutableList() }
        }

        /**
         * Adds a single [GnssObservationList] to [Builder.gnssObservationList].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGnssObservationList(gnssObservationList: GnssObservationList) = apply {
            this.gnssObservationList =
                (this.gnssObservationList ?: JsonField.of(mutableListOf())).also {
                    checkKnown("gnssObservationList", it).add(gnssObservationList)
                }
        }

        /** Horizontal Dilution of Precision. */
        fun hDop(hDop: Double) = hDop(JsonField.of(hDop))

        /**
         * Sets [Builder.hDop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hDop] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hDop(hDop: JsonField<Double>) = apply { this.hDop = hDop }

        /** Unique identifier of the primary satellite on-orbit object. */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /**
         * WGS-84 spacecraft latitude sub-point at observation time (ts), represented as -90 to 90
         * degrees (negative values south of equator).
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
         * WGS-84 spacecraft longitude sub-point at observation time (ts), represented as -180 to
         * 180 degrees (negative values west of Prime Meridian).
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
         * The marker type of the observing receiver (AIRBORNE, ANIMAL, BALLISTIC, FIXED BUOY,
         * FLOATING BUOY, FLOATING ICE, GEODETIC, GLACIER, GROUNDCRAFT, HUMAN, NON GEODETIC, NON
         * PHYSICAL, SPACEBORNE, WATERCRAFT). Reference RINEX 3+ for further information concerning
         * marker types.
         */
        fun markerType(markerType: String) = markerType(JsonField.of(markerType))

        /**
         * Sets [Builder.markerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.markerType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun markerType(markerType: JsonField<String>) = apply { this.markerType = markerType }

        /**
         * The current navigation status as defined by the data source. In general the navigation
         * status specifies whether the signal is normal, degraded, or unavailable. For status value
         * definitions please reach out to data source provider.
         */
        fun navigationStatus(navigationStatus: String) =
            navigationStatus(JsonField.of(navigationStatus))

        /**
         * Sets [Builder.navigationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.navigationStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun navigationStatus(navigationStatus: JsonField<String>) = apply {
            this.navigationStatus = navigationStatus
        }

        /**
         * Array of the strings containing the individual observation code sets that are contained
         * within this GNSS Observation set. Each string is a three-character representation of the
         * measurement type, the channel, and the coding, in compliance with the RINEX 3+ standard
         * (Pseudorange (C), Carrier Phase (L), Doppler (D), Signal Strength C/No (S), or Channel
         * Number (X)). See the GNSS Observation ob field for the units of measure associated with
         * each observation type.
         */
        fun obsCodes(obsCodes: List<String>) = obsCodes(JsonField.of(obsCodes))

        /**
         * Sets [Builder.obsCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obsCodes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun obsCodes(obsCodes: JsonField<List<String>>) = apply {
            this.obsCodes = obsCodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [obsCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObsCode(obsCode: String) = apply {
            obsCodes =
                (obsCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("obsCodes", it).add(obsCode)
                }
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
         * Optional identifier provided by ephemeris source to indicate the target object of this
         * ephemeris. This may be an internal identifier and not necessarily map to a valid
         * satellite number.
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

        /** Time, in seconds, that the receiver has been unable to compute a GNSS fix. */
        fun outage(outage: Int) = outage(JsonField.of(outage))

        /**
         * Sets [Builder.outage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outage] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun outage(outage: JsonField<Int>) = apply { this.outage = outage }

        /** Position Dilution of Precision. */
        fun pDop(pDop: Double) = pDop(JsonField.of(pDop))

        /**
         * Sets [Builder.pDop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pDop] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pDop(pDop: JsonField<Double>) = apply { this.pDop = pDop }

        /**
         * The quaternion describing the rotation of the body-fixed frame used for this system into
         * the local geodetic frame, at observation time (ts). The array element order convention is
         * scalar component first, followed by the three vector components. For a vector u in the
         * body-fixed frame, the corresponding vector u' in the geodetic frame should satisfy u' =
         * quq\*, where q is this quaternion.
         */
        fun quat(quat: List<Double>) = quat(JsonField.of(quat))

        /**
         * Sets [Builder.quat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quat] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun quat(quat: JsonField<List<Double>>) = apply {
            this.quat = quat.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.quat].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addQuat(quat: Double) = apply {
            this.quat =
                (this.quat ?: JsonField.of(mutableListOf())).also {
                    checkKnown("quat", it).add(quat)
                }
        }

        /**
         * The number or ID of the GNSS receiver associated with this data. Each GNSS Observation
         * Set is associated with only one receiver. If reporting for multiple receivers a separate
         * set should be generated for each. A null value is assumed to indicate that only one
         * receiver is present, or reported.
         */
        fun receiver(receiver: String) = receiver(JsonField.of(receiver))

        /**
         * Sets [Builder.receiver] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiver] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun receiver(receiver: JsonField<String>) = apply { this.receiver = receiver }

        /** Satellite/catalog number of the target on-orbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /**
         * Three element array, expressing the ECI J2K spacecraft position components, in
         * kilometers, at observation time (ts). The array element order is [x, y, z].
         */
        fun satPosition(satPosition: List<Double>) = satPosition(JsonField.of(satPosition))

        /**
         * Sets [Builder.satPosition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satPosition] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun satPosition(satPosition: JsonField<List<Double>>) = apply {
            this.satPosition = satPosition.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.satPosition].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSatPosition(satPosition: Double) = apply {
            this.satPosition =
                (this.satPosition ?: JsonField.of(mutableListOf())).also {
                    checkKnown("satPosition", it).add(satPosition)
                }
        }

        /**
         * Three element array, expressing the ECI J2K spacecraft velocity components, in km/second,
         * at observation time (ts). The array element order is [xvel, yvel, zvel].
         */
        fun satVelocity(satVelocity: List<Double>) = satVelocity(JsonField.of(satVelocity))

        /**
         * Sets [Builder.satVelocity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satVelocity] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun satVelocity(satVelocity: JsonField<List<Double>>) = apply {
            this.satVelocity = satVelocity.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.satVelocity].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSatVelocity(satVelocity: Double) = apply {
            this.satVelocity =
                (this.satVelocity ?: JsonField.of(mutableListOf())).also {
                    checkKnown("satVelocity", it).add(satVelocity)
                }
        }

        /**
         * Array of UUIDs of the UDL data records that are related to this GNSS Observation Set. See
         * the associated 'srcTyps' array for the specific types of data, positionally corresponding
         * to the UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in size. See the
         * corresponding srcTyps array element for the data type of the UUID and use the appropriate
         * API operation to retrieve that object (e.g. /udl/statevector/{uuid}).
         */
        fun srcIds(srcIds: List<String>) = srcIds(JsonField.of(srcIds))

        /**
         * Sets [Builder.srcIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.srcIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun srcIds(srcIds: JsonField<List<String>>) = apply {
            this.srcIds = srcIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [srcIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSrcId(srcId: String) = apply {
            srcIds =
                (srcIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("srcIds", it).add(srcId)
                }
        }

        /**
         * Array of UDL record types (AIS, CONJUNCTION, DOA, ELSET, EO, ESID, GROUNDIMAGE, POI,
         * MANEUVER, MTI, NOTIFICATION, RADAR, RF, SIGACT, SKYIMAGE, SV, TRACK) that are related to
         * this GNSS Observation Set. See the associated 'srcIds' array for the record UUIDs,
         * positionally corresponding to the record types in this array. The 'srcTyps' and 'srcIds'
         * arrays must match in size.
         */
        fun srcTyps(srcTyps: List<String>) = srcTyps(JsonField.of(srcTyps))

        /**
         * Sets [Builder.srcTyps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.srcTyps] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun srcTyps(srcTyps: JsonField<List<String>>) = apply {
            this.srcTyps = srcTyps.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [srcTyps].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSrcTyp(srcTyp: String) = apply {
            srcTyps =
                (srcTyps ?: JsonField.of(mutableListOf())).also {
                    checkKnown("srcTyps", it).add(srcTyp)
                }
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

        /** Time Dilution of Precision. */
        fun tDop(tDop: Double) = tDop(JsonField.of(tDop))

        /**
         * Sets [Builder.tDop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tDop] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tDop(tDop: JsonField<Double>) = apply { this.tDop = tDop }

        /** Status of the GNSS receiver signal. Status options are 0, 1 or 2 (0 being the best). */
        fun trackingStatus(trackingStatus: Int) = trackingStatus(JsonField.of(trackingStatus))

        /**
         * Sets [Builder.trackingStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackingStatus] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trackingStatus(trackingStatus: JsonField<Int>) = apply {
            this.trackingStatus = trackingStatus
        }

        /**
         * Optional identifier to track a commercial or marketplace transaction executed to produce
         * this data.
         */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** Vertical Dilution of Precision. */
        fun vDop(vDop: Double) = vDop(JsonField.of(vDop))

        /**
         * Sets [Builder.vDop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vDop] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vDop(vDop: JsonField<Double>) = apply { this.vDop = vDop }

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
         * Returns an immutable instance of [GnssObservationsetListResponse].
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
        fun build(): GnssObservationsetListResponse =
            GnssObservationsetListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                checkRequired("ts", ts),
                id,
                agcState,
                alt,
                (boresight ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                createdBy,
                esId,
                eventId,
                gDop,
                (gnssObservationList ?: JsonMissing.of()).map { it.toImmutable() },
                hDop,
                idOnOrbit,
                lat,
                lon,
                markerType,
                navigationStatus,
                (obsCodes ?: JsonMissing.of()).map { it.toImmutable() },
                origin,
                origNetwork,
                origObjectId,
                outage,
                pDop,
                (quat ?: JsonMissing.of()).map { it.toImmutable() },
                receiver,
                satNo,
                (satPosition ?: JsonMissing.of()).map { it.toImmutable() },
                (satVelocity ?: JsonMissing.of()).map { it.toImmutable() },
                (srcIds ?: JsonMissing.of()).map { it.toImmutable() },
                (srcTyps ?: JsonMissing.of()).map { it.toImmutable() },
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                tDop,
                trackingStatus,
                transactionId,
                vDop,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GnssObservationsetListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        ts()
        id()
        agcState()
        alt()
        boresight()
        createdAt()
        createdBy()
        esId()
        eventId()
        gDop()
        gnssObservationList().ifPresent { it.forEach { it.validate() } }
        hDop()
        idOnOrbit()
        lat()
        lon()
        markerType()
        navigationStatus()
        obsCodes()
        origin()
        origNetwork()
        origObjectId()
        outage()
        pDop()
        quat()
        receiver()
        satNo()
        satPosition()
        satVelocity()
        srcIds()
        srcTyps()
        tags()
        tDop()
        trackingStatus()
        transactionId()
        vDop()
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
            (if (agcState.asKnown().isPresent) 1 else 0) +
            (if (alt.asKnown().isPresent) 1 else 0) +
            (boresight.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (esId.asKnown().isPresent) 1 else 0) +
            (if (eventId.asKnown().isPresent) 1 else 0) +
            (if (gDop.asKnown().isPresent) 1 else 0) +
            (gnssObservationList.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (hDop.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (lon.asKnown().isPresent) 1 else 0) +
            (if (markerType.asKnown().isPresent) 1 else 0) +
            (if (navigationStatus.asKnown().isPresent) 1 else 0) +
            (obsCodes.asKnown().getOrNull()?.size ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (outage.asKnown().isPresent) 1 else 0) +
            (if (pDop.asKnown().isPresent) 1 else 0) +
            (quat.asKnown().getOrNull()?.size ?: 0) +
            (if (receiver.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (satPosition.asKnown().getOrNull()?.size ?: 0) +
            (satVelocity.asKnown().getOrNull()?.size ?: 0) +
            (srcIds.asKnown().getOrNull()?.size ?: 0) +
            (srcTyps.asKnown().getOrNull()?.size ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (tDop.asKnown().isPresent) 1 else 0) +
            (if (trackingStatus.asKnown().isPresent) 1 else 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (vDop.asKnown().isPresent) 1 else 0)

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

    /**
     * Information for Global Navigation Satellite Systems (GNSS) Observations collected from GNSS
     * receivers, including the specific GNSS sat from which each signal was received, and the
     * observation codes of each observation in the record. Each GNSS Observation is associated with
     * a GNSS Observation Set record containing data which applies to all observations in the set,
     * including observation time, receiver location, and Dilution of Precision (DOP) values. Users
     * can Reference RINEX 3+ documentation for further information concerning many of the standards
     * and conventions for GNSS observations.
     */
    class GnssObservationList
    private constructor(
        private val agcState: JsonField<Int>,
        private val gnssSatId: JsonField<String>,
        private val ob: JsonField<List<Double>>,
        private val obsCodeSet: JsonField<List<String>>,
        private val trackingStatus: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agcState") @ExcludeMissing agcState: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("gnssSatId")
            @ExcludeMissing
            gnssSatId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ob") @ExcludeMissing ob: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("obsCodeSet")
            @ExcludeMissing
            obsCodeSet: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("trackingStatus")
            @ExcludeMissing
            trackingStatus: JsonField<Int> = JsonMissing.of(),
        ) : this(agcState, gnssSatId, ob, obsCodeSet, trackingStatus, mutableMapOf())

        /**
         * GNSS Automatic Gain Control State.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun agcState(): Optional<Int> = agcState.getOptional("agcState")

        /**
         * RINEX 3+ compliant GNSS System and Satellite Identifier (represented as SNN, where S is
         * the system code, and NN is the satellite identifier) associated with this observation:
         *
         * G - GPS (NN = PRN)
         *
         * R - GLONASS (NN = Slot Number)
         *
         * S - SBAS Payload (NN = PRN-100)
         *
         * E - Galileo (NN = PRN)
         *
         * C - BeiDou (NN = PRN)
         *
         * J - QZSS (NN = PRN - 1923)
         *
         * I - IRNSS (NN = PRN)
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun gnssSatId(): Optional<String> = gnssSatId.getOptional("gnssSatId")

        /**
         * Array of observation(s). The ob array must be the same length as the obsCodeSet.
         * Pseudorange (C) is expressed meters, carrier phase (L) in cycles, doppler (D) in Hz
         * where + values indicate approaching sats, and signal strength C/No (S) in dB-Hz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ob(): Optional<List<Double>> = ob.getOptional("ob")

        /**
         * The observation code set that applies to this observation record. Reference RINEX 3+ for
         * further information concerning observation code set conventions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obsCodeSet(): Optional<List<String>> = obsCodeSet.getOptional("obsCodeSet")

        /**
         * Status of the GNSS receiver signal. Status options are 0, 1 or 2 (0 being the best).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun trackingStatus(): Optional<Int> = trackingStatus.getOptional("trackingStatus")

        /**
         * Returns the raw JSON value of [agcState].
         *
         * Unlike [agcState], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agcState") @ExcludeMissing fun _agcState(): JsonField<Int> = agcState

        /**
         * Returns the raw JSON value of [gnssSatId].
         *
         * Unlike [gnssSatId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gnssSatId") @ExcludeMissing fun _gnssSatId(): JsonField<String> = gnssSatId

        /**
         * Returns the raw JSON value of [ob].
         *
         * Unlike [ob], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ob") @ExcludeMissing fun _ob(): JsonField<List<Double>> = ob

        /**
         * Returns the raw JSON value of [obsCodeSet].
         *
         * Unlike [obsCodeSet], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obsCodeSet")
        @ExcludeMissing
        fun _obsCodeSet(): JsonField<List<String>> = obsCodeSet

        /**
         * Returns the raw JSON value of [trackingStatus].
         *
         * Unlike [trackingStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trackingStatus")
        @ExcludeMissing
        fun _trackingStatus(): JsonField<Int> = trackingStatus

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

            /** Returns a mutable builder for constructing an instance of [GnssObservationList]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GnssObservationList]. */
        class Builder internal constructor() {

            private var agcState: JsonField<Int> = JsonMissing.of()
            private var gnssSatId: JsonField<String> = JsonMissing.of()
            private var ob: JsonField<MutableList<Double>>? = null
            private var obsCodeSet: JsonField<MutableList<String>>? = null
            private var trackingStatus: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(gnssObservationList: GnssObservationList) = apply {
                agcState = gnssObservationList.agcState
                gnssSatId = gnssObservationList.gnssSatId
                ob = gnssObservationList.ob.map { it.toMutableList() }
                obsCodeSet = gnssObservationList.obsCodeSet.map { it.toMutableList() }
                trackingStatus = gnssObservationList.trackingStatus
                additionalProperties = gnssObservationList.additionalProperties.toMutableMap()
            }

            /** GNSS Automatic Gain Control State. */
            fun agcState(agcState: Int) = agcState(JsonField.of(agcState))

            /**
             * Sets [Builder.agcState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agcState] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agcState(agcState: JsonField<Int>) = apply { this.agcState = agcState }

            /**
             * RINEX 3+ compliant GNSS System and Satellite Identifier (represented as SNN, where S
             * is the system code, and NN is the satellite identifier) associated with this
             * observation:
             *
             * G - GPS (NN = PRN)
             *
             * R - GLONASS (NN = Slot Number)
             *
             * S - SBAS Payload (NN = PRN-100)
             *
             * E - Galileo (NN = PRN)
             *
             * C - BeiDou (NN = PRN)
             *
             * J - QZSS (NN = PRN - 1923)
             *
             * I - IRNSS (NN = PRN)
             */
            fun gnssSatId(gnssSatId: String) = gnssSatId(JsonField.of(gnssSatId))

            /**
             * Sets [Builder.gnssSatId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gnssSatId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gnssSatId(gnssSatId: JsonField<String>) = apply { this.gnssSatId = gnssSatId }

            /**
             * Array of observation(s). The ob array must be the same length as the obsCodeSet.
             * Pseudorange (C) is expressed meters, carrier phase (L) in cycles, doppler (D) in Hz
             * where + values indicate approaching sats, and signal strength C/No (S) in dB-Hz.
             */
            fun ob(ob: List<Double>) = ob(JsonField.of(ob))

            /**
             * Sets [Builder.ob] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ob] with a well-typed `List<Double>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ob(ob: JsonField<List<Double>>) = apply { this.ob = ob.map { it.toMutableList() } }

            /**
             * Adds a single [Double] to [Builder.ob].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOb(ob: Double) = apply {
                this.ob =
                    (this.ob ?: JsonField.of(mutableListOf())).also { checkKnown("ob", it).add(ob) }
            }

            /**
             * The observation code set that applies to this observation record. Reference RINEX 3+
             * for further information concerning observation code set conventions.
             */
            fun obsCodeSet(obsCodeSet: List<String>) = obsCodeSet(JsonField.of(obsCodeSet))

            /**
             * Sets [Builder.obsCodeSet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obsCodeSet] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obsCodeSet(obsCodeSet: JsonField<List<String>>) = apply {
                this.obsCodeSet = obsCodeSet.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.obsCodeSet].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addObsCodeSet(obsCodeSet: String) = apply {
                this.obsCodeSet =
                    (this.obsCodeSet ?: JsonField.of(mutableListOf())).also {
                        checkKnown("obsCodeSet", it).add(obsCodeSet)
                    }
            }

            /**
             * Status of the GNSS receiver signal. Status options are 0, 1 or 2 (0 being the best).
             */
            fun trackingStatus(trackingStatus: Int) = trackingStatus(JsonField.of(trackingStatus))

            /**
             * Sets [Builder.trackingStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trackingStatus] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trackingStatus(trackingStatus: JsonField<Int>) = apply {
                this.trackingStatus = trackingStatus
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
             * Returns an immutable instance of [GnssObservationList].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): GnssObservationList =
                GnssObservationList(
                    agcState,
                    gnssSatId,
                    (ob ?: JsonMissing.of()).map { it.toImmutable() },
                    (obsCodeSet ?: JsonMissing.of()).map { it.toImmutable() },
                    trackingStatus,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): GnssObservationList = apply {
            if (validated) {
                return@apply
            }

            agcState()
            gnssSatId()
            ob()
            obsCodeSet()
            trackingStatus()
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
            (if (agcState.asKnown().isPresent) 1 else 0) +
                (if (gnssSatId.asKnown().isPresent) 1 else 0) +
                (ob.asKnown().getOrNull()?.size ?: 0) +
                (obsCodeSet.asKnown().getOrNull()?.size ?: 0) +
                (if (trackingStatus.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GnssObservationList &&
                agcState == other.agcState &&
                gnssSatId == other.gnssSatId &&
                ob == other.ob &&
                obsCodeSet == other.obsCodeSet &&
                trackingStatus == other.trackingStatus &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(agcState, gnssSatId, ob, obsCodeSet, trackingStatus, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GnssObservationList{agcState=$agcState, gnssSatId=$gnssSatId, ob=$ob, obsCodeSet=$obsCodeSet, trackingStatus=$trackingStatus, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GnssObservationsetListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            ts == other.ts &&
            id == other.id &&
            agcState == other.agcState &&
            alt == other.alt &&
            boresight == other.boresight &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            esId == other.esId &&
            eventId == other.eventId &&
            gDop == other.gDop &&
            gnssObservationList == other.gnssObservationList &&
            hDop == other.hDop &&
            idOnOrbit == other.idOnOrbit &&
            lat == other.lat &&
            lon == other.lon &&
            markerType == other.markerType &&
            navigationStatus == other.navigationStatus &&
            obsCodes == other.obsCodes &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            outage == other.outage &&
            pDop == other.pDop &&
            quat == other.quat &&
            receiver == other.receiver &&
            satNo == other.satNo &&
            satPosition == other.satPosition &&
            satVelocity == other.satVelocity &&
            srcIds == other.srcIds &&
            srcTyps == other.srcTyps &&
            tags == other.tags &&
            tDop == other.tDop &&
            trackingStatus == other.trackingStatus &&
            transactionId == other.transactionId &&
            vDop == other.vDop &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            source,
            ts,
            id,
            agcState,
            alt,
            boresight,
            createdAt,
            createdBy,
            esId,
            eventId,
            gDop,
            gnssObservationList,
            hDop,
            idOnOrbit,
            lat,
            lon,
            markerType,
            navigationStatus,
            obsCodes,
            origin,
            origNetwork,
            origObjectId,
            outage,
            pDop,
            quat,
            receiver,
            satNo,
            satPosition,
            satVelocity,
            srcIds,
            srcTyps,
            tags,
            tDop,
            trackingStatus,
            transactionId,
            vDop,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GnssObservationsetListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, ts=$ts, id=$id, agcState=$agcState, alt=$alt, boresight=$boresight, createdAt=$createdAt, createdBy=$createdBy, esId=$esId, eventId=$eventId, gDop=$gDop, gnssObservationList=$gnssObservationList, hDop=$hDop, idOnOrbit=$idOnOrbit, lat=$lat, lon=$lon, markerType=$markerType, navigationStatus=$navigationStatus, obsCodes=$obsCodes, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, outage=$outage, pDop=$pDop, quat=$quat, receiver=$receiver, satNo=$satNo, satPosition=$satPosition, satVelocity=$satVelocity, srcIds=$srcIds, srcTyps=$srcTyps, tags=$tags, tDop=$tDop, trackingStatus=$trackingStatus, transactionId=$transactionId, vDop=$vDop, additionalProperties=$additionalProperties}"
}

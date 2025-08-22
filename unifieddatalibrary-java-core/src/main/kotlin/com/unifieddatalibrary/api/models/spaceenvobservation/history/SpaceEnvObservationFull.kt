// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.spaceenvobservation.history

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

/** SpaceEnvObservation data. */
class SpaceEnvObservationFull
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val obTime: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val alt: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val dataType: JsonField<String>,
    private val derived: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val externalId: JsonField<String>,
    private val forecast: JsonField<Boolean>,
    private val genSystem: JsonField<String>,
    private val genTime: JsonField<OffsetDateTime>,
    private val idOnOrbit: JsonField<String>,
    private val idSensor: JsonField<String>,
    private val instrumentType: JsonField<String>,
    private val lat: JsonField<Double>,
    private val lon: JsonField<Double>,
    private val measType: JsonField<String>,
    private val msgType: JsonField<String>,
    private val observatoryName: JsonField<String>,
    private val observatoryNotes: JsonField<String>,
    private val observatoryType: JsonField<String>,
    private val obSetId: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val particleType: JsonField<String>,
    private val quality: JsonField<String>,
    private val satNo: JsonField<Int>,
    private val senEnergyLevel: JsonField<String>,
    private val senPos: JsonField<List<Double>>,
    private val senReferenceFrame: JsonField<SenReferenceFrame>,
    private val senVel: JsonField<List<Double>>,
    private val seoList: JsonField<List<SeoList>>,
    private val srcIds: JsonField<List<String>>,
    private val srcTyps: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("obTime")
        @ExcludeMissing
        obTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alt") @ExcludeMissing alt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataType") @ExcludeMissing dataType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("derived") @ExcludeMissing derived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalId")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("forecast") @ExcludeMissing forecast: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("genSystem") @ExcludeMissing genSystem: JsonField<String> = JsonMissing.of(),
        @JsonProperty("genTime")
        @ExcludeMissing
        genTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instrumentType")
        @ExcludeMissing
        instrumentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("measType") @ExcludeMissing measType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("msgType") @ExcludeMissing msgType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("observatoryName")
        @ExcludeMissing
        observatoryName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("observatoryNotes")
        @ExcludeMissing
        observatoryNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("observatoryType")
        @ExcludeMissing
        observatoryType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("obSetId") @ExcludeMissing obSetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origSensorId")
        @ExcludeMissing
        origSensorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("particleType")
        @ExcludeMissing
        particleType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quality") @ExcludeMissing quality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("senEnergyLevel")
        @ExcludeMissing
        senEnergyLevel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("senPos") @ExcludeMissing senPos: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("senReferenceFrame")
        @ExcludeMissing
        senReferenceFrame: JsonField<SenReferenceFrame> = JsonMissing.of(),
        @JsonProperty("senVel") @ExcludeMissing senVel: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("seoList")
        @ExcludeMissing
        seoList: JsonField<List<SeoList>> = JsonMissing.of(),
        @JsonProperty("srcIds") @ExcludeMissing srcIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("srcTyps") @ExcludeMissing srcTyps: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        obTime,
        source,
        id,
        alt,
        createdAt,
        createdBy,
        dataType,
        derived,
        description,
        descriptor,
        externalId,
        forecast,
        genSystem,
        genTime,
        idOnOrbit,
        idSensor,
        instrumentType,
        lat,
        lon,
        measType,
        msgType,
        observatoryName,
        observatoryNotes,
        observatoryType,
        obSetId,
        origin,
        origNetwork,
        origObjectId,
        origSensorId,
        particleType,
        quality,
        satNo,
        senEnergyLevel,
        senPos,
        senReferenceFrame,
        senVel,
        seoList,
        srcIds,
        srcTyps,
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
     * Time of the observation, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun obTime(): OffsetDateTime = obTime.getRequired("obTime")

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
     * Spacecraft/sensor altitude at observation time, expressed in kilometers above WGS-84
     * ellipsoid.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun alt(): Optional<Double> = alt.getOptional("alt")

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
     * The data type (e.g. AP, AURORAL FLUX, ECP, KINDEX, PROPAGATED SOLAR WIND, XRAY FLUX, etc.) of
     * observations in this record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dataType(): Optional<String> = dataType.getOptional("dataType")

    /**
     * Flag indicating that this record contains derived data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun derived(): Optional<Boolean> = derived.getOptional("derived")

    /**
     * Descriptive or additional information associated with this observation record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Optional source-provided and searchable metadata or descriptor of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun descriptor(): Optional<String> = descriptor.getOptional("descriptor")

    /**
     * Optional ID from external systems. This field has no meaning within UDL and is provided as a
     * convenience for systems that require tracking of an internal system generated ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("externalId")

    /**
     * Flag indicating that this record contains forecast data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun forecast(): Optional<Boolean> = forecast.getOptional("forecast")

    /**
     * The external system which generated the message, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun genSystem(): Optional<String> = genSystem.getOptional("genSystem")

    /**
     * The time at which the associated data message was generated, in ISO 8601 UTC format with
     * millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun genTime(): Optional<OffsetDateTime> = genTime.getOptional("genTime")

    /**
     * Unique identifier of the on-orbit satellite hosting the sensor which produced this data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Unique identifier of the reporting sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

    /**
     * The type of instrument from which this data was collected (e.g. ANTENNA, CHANNELTRON,
     * INTERFEROMETER, MAGNETOMETER, RADIOMETER, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun instrumentType(): Optional<String> = instrumentType.getOptional("instrumentType")

    /**
     * WGS-84 spacecraft/sensor latitude sub-point at observation time, represented as -90 to 90
     * degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lat(): Optional<Double> = lat.getOptional("lat")

    /**
     * WGS-84 spacecraft/sensor longitude sub-point at observation time, represented as -180 to 180
     * degrees (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lon(): Optional<Double> = lon.getOptional("lon")

    /**
     * The sensor measurement type of the observation data contained in this record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun measType(): Optional<String> = measType.getOptional("measType")

    /**
     * The type of message associated with this record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun msgType(): Optional<String> = msgType.getOptional("msgType")

    /**
     * The name of the observatory from which this data was collected.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun observatoryName(): Optional<String> = observatoryName.getOptional("observatoryName")

    /**
     * Additional notes concerning the observatory.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun observatoryNotes(): Optional<String> = observatoryNotes.getOptional("observatoryNotes")

    /**
     * The type of observatory from which this data was collected (e.g. FACILITY, ONORBIT, NETWORK,
     * etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun observatoryType(): Optional<String> = observatoryType.getOptional("observatoryType")

    /**
     * A user-defined name or ID of a set of observations, if applicable. Used for identifying
     * multiple observation records as part of one observation set.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun obSetId(): Optional<String> = obSetId.getOptional("obSetId")

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
     * Optional identifier provided by the record source to indicate the satellite hosting the
     * sensor which produced this data. This may be an internal identifier and not necessarily map
     * to a valid satellite number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Optional identifier provided by the observation source to indicate the sensor which produced
     * this observation. This may be an internal identifier and not necessarily a valid sensor ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

    /**
     * The particle type (AEROSOL, ALPHA PARTICLE, ATOM, DUST, ELECTRON, ION, MOLECULE, NEUTRON,
     * POSITRON, PROTON) associated with this measurement.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun particleType(): Optional<String> = particleType.getOptional("particleType")

    /**
     * The quality of the overall data contained in this record. The quality indicator value may
     * vary among providers and may be a generalized statement (BAD, GOOD, UNCERTAIN, UNKNOWN) or a
     * numeric value. Users should consult the data provider to verify the usage of the quality
     * indicator.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun quality(): Optional<String> = quality.getOptional("quality")

    /**
     * Satellite/catalog number of the on-orbit satellite hosting the sensor which produced this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * The energy level bin of the sensor associated with this measurement.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senEnergyLevel(): Optional<String> = senEnergyLevel.getOptional("senEnergyLevel")

    /**
     * Three element array, expressing the observing spacecraft/sensor position vector components at
     * observation time, in kilometers, in the specified senReferenceFrame. If senReferenceFrame is
     * null then J2000 should be assumed. The array element order is [xpos, ypos, zpos].
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senPos(): Optional<List<Double>> = senPos.getOptional("senPos")

    /**
     * The reference frame of the observing spacecraft/sensor state. If the senReferenceFrame is
     * null it is assumed to be J2000.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senReferenceFrame(): Optional<SenReferenceFrame> =
        senReferenceFrame.getOptional("senReferenceFrame")

    /**
     * Three element array, expressing the observing spacecraft/sensor velocity vector components at
     * observation time, in kilometers/second, in the specified senReferenceFrame. If
     * senReferenceFrame is null then J2000 should be assumed. The array element order is
     * [xvel, yvel, zvel].
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senVel(): Optional<List<Double>> = senVel.getOptional("senVel")

    /**
     * A collection of individual space environment observations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun seoList(): Optional<List<SeoList>> = seoList.getOptional("seoList")

    /**
     * Array of UUIDs of the UDL data records that are related to this observation record. See the
     * associated 'srcTyps' array for specific types of data, positionally corresponding to the
     * UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in size. See the
     * corresponding srcTyps array element of the data type of the UUID and use the appropriate API
     * operation to retrieve that object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun srcIds(): Optional<List<String>> = srcIds.getOptional("srcIds")

    /**
     * Array of UDL record types (AIS, CONJUNCTION, DOA, ELSET, EO, ESID, GROUNDIMAGE, POI,
     * MANEUVER, MTI, NOTIFICATION, RADAR, RF, SGI, SIGACT, SKYIMAGE, SPACEENVOB, SV, TRACK) that
     * are related to this observation record. See the associated 'srcIds' array for the record
     * UUIDs, positionally corresponding to the record types in this array. The 'srcTyps' and
     * 'srcIds' arrays must match in size.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun srcTyps(): Optional<List<String>> = srcTyps.getOptional("srcTyps")

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
     * Returns the raw JSON value of [obTime].
     *
     * Unlike [obTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obTime") @ExcludeMissing fun _obTime(): JsonField<OffsetDateTime> = obTime

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
     * Returns the raw JSON value of [alt].
     *
     * Unlike [alt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alt") @ExcludeMissing fun _alt(): JsonField<Double> = alt

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
     * Returns the raw JSON value of [dataType].
     *
     * Unlike [dataType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataType") @ExcludeMissing fun _dataType(): JsonField<String> = dataType

    /**
     * Returns the raw JSON value of [derived].
     *
     * Unlike [derived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("derived") @ExcludeMissing fun _derived(): JsonField<Boolean> = derived

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [descriptor].
     *
     * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor(): JsonField<String> = descriptor

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalId") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [forecast].
     *
     * Unlike [forecast], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("forecast") @ExcludeMissing fun _forecast(): JsonField<Boolean> = forecast

    /**
     * Returns the raw JSON value of [genSystem].
     *
     * Unlike [genSystem], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("genSystem") @ExcludeMissing fun _genSystem(): JsonField<String> = genSystem

    /**
     * Returns the raw JSON value of [genTime].
     *
     * Unlike [genTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("genTime") @ExcludeMissing fun _genTime(): JsonField<OffsetDateTime> = genTime

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [idSensor].
     *
     * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

    /**
     * Returns the raw JSON value of [instrumentType].
     *
     * Unlike [instrumentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrumentType")
    @ExcludeMissing
    fun _instrumentType(): JsonField<String> = instrumentType

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
     * Returns the raw JSON value of [measType].
     *
     * Unlike [measType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("measType") @ExcludeMissing fun _measType(): JsonField<String> = measType

    /**
     * Returns the raw JSON value of [msgType].
     *
     * Unlike [msgType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msgType") @ExcludeMissing fun _msgType(): JsonField<String> = msgType

    /**
     * Returns the raw JSON value of [observatoryName].
     *
     * Unlike [observatoryName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("observatoryName")
    @ExcludeMissing
    fun _observatoryName(): JsonField<String> = observatoryName

    /**
     * Returns the raw JSON value of [observatoryNotes].
     *
     * Unlike [observatoryNotes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("observatoryNotes")
    @ExcludeMissing
    fun _observatoryNotes(): JsonField<String> = observatoryNotes

    /**
     * Returns the raw JSON value of [observatoryType].
     *
     * Unlike [observatoryType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("observatoryType")
    @ExcludeMissing
    fun _observatoryType(): JsonField<String> = observatoryType

    /**
     * Returns the raw JSON value of [obSetId].
     *
     * Unlike [obSetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obSetId") @ExcludeMissing fun _obSetId(): JsonField<String> = obSetId

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
     * Returns the raw JSON value of [origSensorId].
     *
     * Unlike [origSensorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origSensorId")
    @ExcludeMissing
    fun _origSensorId(): JsonField<String> = origSensorId

    /**
     * Returns the raw JSON value of [particleType].
     *
     * Unlike [particleType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("particleType")
    @ExcludeMissing
    fun _particleType(): JsonField<String> = particleType

    /**
     * Returns the raw JSON value of [quality].
     *
     * Unlike [quality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quality") @ExcludeMissing fun _quality(): JsonField<String> = quality

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [senEnergyLevel].
     *
     * Unlike [senEnergyLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senEnergyLevel")
    @ExcludeMissing
    fun _senEnergyLevel(): JsonField<String> = senEnergyLevel

    /**
     * Returns the raw JSON value of [senPos].
     *
     * Unlike [senPos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senPos") @ExcludeMissing fun _senPos(): JsonField<List<Double>> = senPos

    /**
     * Returns the raw JSON value of [senReferenceFrame].
     *
     * Unlike [senReferenceFrame], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("senReferenceFrame")
    @ExcludeMissing
    fun _senReferenceFrame(): JsonField<SenReferenceFrame> = senReferenceFrame

    /**
     * Returns the raw JSON value of [senVel].
     *
     * Unlike [senVel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senVel") @ExcludeMissing fun _senVel(): JsonField<List<Double>> = senVel

    /**
     * Returns the raw JSON value of [seoList].
     *
     * Unlike [seoList], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seoList") @ExcludeMissing fun _seoList(): JsonField<List<SeoList>> = seoList

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
         * Returns a mutable builder for constructing an instance of [SpaceEnvObservationFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .obTime()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpaceEnvObservationFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var obTime: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var alt: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dataType: JsonField<String> = JsonMissing.of()
        private var derived: JsonField<Boolean> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var forecast: JsonField<Boolean> = JsonMissing.of()
        private var genSystem: JsonField<String> = JsonMissing.of()
        private var genTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var instrumentType: JsonField<String> = JsonMissing.of()
        private var lat: JsonField<Double> = JsonMissing.of()
        private var lon: JsonField<Double> = JsonMissing.of()
        private var measType: JsonField<String> = JsonMissing.of()
        private var msgType: JsonField<String> = JsonMissing.of()
        private var observatoryName: JsonField<String> = JsonMissing.of()
        private var observatoryNotes: JsonField<String> = JsonMissing.of()
        private var observatoryType: JsonField<String> = JsonMissing.of()
        private var obSetId: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var particleType: JsonField<String> = JsonMissing.of()
        private var quality: JsonField<String> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var senEnergyLevel: JsonField<String> = JsonMissing.of()
        private var senPos: JsonField<MutableList<Double>>? = null
        private var senReferenceFrame: JsonField<SenReferenceFrame> = JsonMissing.of()
        private var senVel: JsonField<MutableList<Double>>? = null
        private var seoList: JsonField<MutableList<SeoList>>? = null
        private var srcIds: JsonField<MutableList<String>>? = null
        private var srcTyps: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spaceEnvObservationFull: SpaceEnvObservationFull) = apply {
            classificationMarking = spaceEnvObservationFull.classificationMarking
            dataMode = spaceEnvObservationFull.dataMode
            obTime = spaceEnvObservationFull.obTime
            source = spaceEnvObservationFull.source
            id = spaceEnvObservationFull.id
            alt = spaceEnvObservationFull.alt
            createdAt = spaceEnvObservationFull.createdAt
            createdBy = spaceEnvObservationFull.createdBy
            dataType = spaceEnvObservationFull.dataType
            derived = spaceEnvObservationFull.derived
            description = spaceEnvObservationFull.description
            descriptor = spaceEnvObservationFull.descriptor
            externalId = spaceEnvObservationFull.externalId
            forecast = spaceEnvObservationFull.forecast
            genSystem = spaceEnvObservationFull.genSystem
            genTime = spaceEnvObservationFull.genTime
            idOnOrbit = spaceEnvObservationFull.idOnOrbit
            idSensor = spaceEnvObservationFull.idSensor
            instrumentType = spaceEnvObservationFull.instrumentType
            lat = spaceEnvObservationFull.lat
            lon = spaceEnvObservationFull.lon
            measType = spaceEnvObservationFull.measType
            msgType = spaceEnvObservationFull.msgType
            observatoryName = spaceEnvObservationFull.observatoryName
            observatoryNotes = spaceEnvObservationFull.observatoryNotes
            observatoryType = spaceEnvObservationFull.observatoryType
            obSetId = spaceEnvObservationFull.obSetId
            origin = spaceEnvObservationFull.origin
            origNetwork = spaceEnvObservationFull.origNetwork
            origObjectId = spaceEnvObservationFull.origObjectId
            origSensorId = spaceEnvObservationFull.origSensorId
            particleType = spaceEnvObservationFull.particleType
            quality = spaceEnvObservationFull.quality
            satNo = spaceEnvObservationFull.satNo
            senEnergyLevel = spaceEnvObservationFull.senEnergyLevel
            senPos = spaceEnvObservationFull.senPos.map { it.toMutableList() }
            senReferenceFrame = spaceEnvObservationFull.senReferenceFrame
            senVel = spaceEnvObservationFull.senVel.map { it.toMutableList() }
            seoList = spaceEnvObservationFull.seoList.map { it.toMutableList() }
            srcIds = spaceEnvObservationFull.srcIds.map { it.toMutableList() }
            srcTyps = spaceEnvObservationFull.srcTyps.map { it.toMutableList() }
            additionalProperties = spaceEnvObservationFull.additionalProperties.toMutableMap()
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

        /** Time of the observation, in ISO 8601 UTC format with millisecond precision. */
        fun obTime(obTime: OffsetDateTime) = obTime(JsonField.of(obTime))

        /**
         * Sets [Builder.obTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun obTime(obTime: JsonField<OffsetDateTime>) = apply { this.obTime = obTime }

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

        /**
         * Spacecraft/sensor altitude at observation time, expressed in kilometers above WGS-84
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
         * The data type (e.g. AP, AURORAL FLUX, ECP, KINDEX, PROPAGATED SOLAR WIND, XRAY FLUX,
         * etc.) of observations in this record.
         */
        fun dataType(dataType: String) = dataType(JsonField.of(dataType))

        /**
         * Sets [Builder.dataType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dataType(dataType: JsonField<String>) = apply { this.dataType = dataType }

        /** Flag indicating that this record contains derived data. */
        fun derived(derived: Boolean) = derived(JsonField.of(derived))

        /**
         * Sets [Builder.derived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.derived] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun derived(derived: JsonField<Boolean>) = apply { this.derived = derived }

        /** Descriptive or additional information associated with this observation record. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Optional source-provided and searchable metadata or descriptor of the data. */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * Sets [Builder.descriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.descriptor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /**
         * Optional ID from external systems. This field has no meaning within UDL and is provided
         * as a convenience for systems that require tracking of an internal system generated ID.
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

        /** Flag indicating that this record contains forecast data. */
        fun forecast(forecast: Boolean) = forecast(JsonField.of(forecast))

        /**
         * Sets [Builder.forecast] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forecast] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun forecast(forecast: JsonField<Boolean>) = apply { this.forecast = forecast }

        /** The external system which generated the message, if applicable. */
        fun genSystem(genSystem: String) = genSystem(JsonField.of(genSystem))

        /**
         * Sets [Builder.genSystem] to an arbitrary JSON value.
         *
         * You should usually call [Builder.genSystem] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun genSystem(genSystem: JsonField<String>) = apply { this.genSystem = genSystem }

        /**
         * The time at which the associated data message was generated, in ISO 8601 UTC format with
         * millisecond precision.
         */
        fun genTime(genTime: OffsetDateTime) = genTime(JsonField.of(genTime))

        /**
         * Sets [Builder.genTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.genTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun genTime(genTime: JsonField<OffsetDateTime>) = apply { this.genTime = genTime }

        /**
         * Unique identifier of the on-orbit satellite hosting the sensor which produced this data.
         */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /** Unique identifier of the reporting sensor. */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

        /**
         * The type of instrument from which this data was collected (e.g. ANTENNA, CHANNELTRON,
         * INTERFEROMETER, MAGNETOMETER, RADIOMETER, etc.).
         */
        fun instrumentType(instrumentType: String) = instrumentType(JsonField.of(instrumentType))

        /**
         * Sets [Builder.instrumentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrumentType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instrumentType(instrumentType: JsonField<String>) = apply {
            this.instrumentType = instrumentType
        }

        /**
         * WGS-84 spacecraft/sensor latitude sub-point at observation time, represented as -90 to 90
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
         * WGS-84 spacecraft/sensor longitude sub-point at observation time, represented as -180 to
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

        /** The sensor measurement type of the observation data contained in this record. */
        fun measType(measType: String) = measType(JsonField.of(measType))

        /**
         * Sets [Builder.measType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.measType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun measType(measType: JsonField<String>) = apply { this.measType = measType }

        /** The type of message associated with this record. */
        fun msgType(msgType: String) = msgType(JsonField.of(msgType))

        /**
         * Sets [Builder.msgType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msgType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun msgType(msgType: JsonField<String>) = apply { this.msgType = msgType }

        /** The name of the observatory from which this data was collected. */
        fun observatoryName(observatoryName: String) =
            observatoryName(JsonField.of(observatoryName))

        /**
         * Sets [Builder.observatoryName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observatoryName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun observatoryName(observatoryName: JsonField<String>) = apply {
            this.observatoryName = observatoryName
        }

        /** Additional notes concerning the observatory. */
        fun observatoryNotes(observatoryNotes: String) =
            observatoryNotes(JsonField.of(observatoryNotes))

        /**
         * Sets [Builder.observatoryNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observatoryNotes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun observatoryNotes(observatoryNotes: JsonField<String>) = apply {
            this.observatoryNotes = observatoryNotes
        }

        /**
         * The type of observatory from which this data was collected (e.g. FACILITY, ONORBIT,
         * NETWORK, etc.).
         */
        fun observatoryType(observatoryType: String) =
            observatoryType(JsonField.of(observatoryType))

        /**
         * Sets [Builder.observatoryType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observatoryType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun observatoryType(observatoryType: JsonField<String>) = apply {
            this.observatoryType = observatoryType
        }

        /**
         * A user-defined name or ID of a set of observations, if applicable. Used for identifying
         * multiple observation records as part of one observation set.
         */
        fun obSetId(obSetId: String) = obSetId(JsonField.of(obSetId))

        /**
         * Sets [Builder.obSetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obSetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun obSetId(obSetId: JsonField<String>) = apply { this.obSetId = obSetId }

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
         * Optional identifier provided by the record source to indicate the satellite hosting the
         * sensor which produced this data. This may be an internal identifier and not necessarily
         * map to a valid satellite number.
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

        /**
         * Optional identifier provided by the observation source to indicate the sensor which
         * produced this observation. This may be an internal identifier and not necessarily a valid
         * sensor ID.
         */
        fun origSensorId(origSensorId: String) = origSensorId(JsonField.of(origSensorId))

        /**
         * Sets [Builder.origSensorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origSensorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origSensorId(origSensorId: JsonField<String>) = apply {
            this.origSensorId = origSensorId
        }

        /**
         * The particle type (AEROSOL, ALPHA PARTICLE, ATOM, DUST, ELECTRON, ION, MOLECULE, NEUTRON,
         * POSITRON, PROTON) associated with this measurement.
         */
        fun particleType(particleType: String) = particleType(JsonField.of(particleType))

        /**
         * Sets [Builder.particleType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.particleType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun particleType(particleType: JsonField<String>) = apply {
            this.particleType = particleType
        }

        /**
         * The quality of the overall data contained in this record. The quality indicator value may
         * vary among providers and may be a generalized statement (BAD, GOOD, UNCERTAIN, UNKNOWN)
         * or a numeric value. Users should consult the data provider to verify the usage of the
         * quality indicator.
         */
        fun quality(quality: String) = quality(JsonField.of(quality))

        /**
         * Sets [Builder.quality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quality(quality: JsonField<String>) = apply { this.quality = quality }

        /**
         * Satellite/catalog number of the on-orbit satellite hosting the sensor which produced this
         * data.
         */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /** The energy level bin of the sensor associated with this measurement. */
        fun senEnergyLevel(senEnergyLevel: String) = senEnergyLevel(JsonField.of(senEnergyLevel))

        /**
         * Sets [Builder.senEnergyLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senEnergyLevel] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senEnergyLevel(senEnergyLevel: JsonField<String>) = apply {
            this.senEnergyLevel = senEnergyLevel
        }

        /**
         * Three element array, expressing the observing spacecraft/sensor position vector
         * components at observation time, in kilometers, in the specified senReferenceFrame. If
         * senReferenceFrame is null then J2000 should be assumed. The array element order is
         * [xpos, ypos, zpos].
         */
        fun senPos(senPos: List<Double>) = senPos(JsonField.of(senPos))

        /**
         * Sets [Builder.senPos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senPos] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senPos(senPos: JsonField<List<Double>>) = apply {
            this.senPos = senPos.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [senPos].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSenPo(senPo: Double) = apply {
            senPos =
                (senPos ?: JsonField.of(mutableListOf())).also {
                    checkKnown("senPos", it).add(senPo)
                }
        }

        /**
         * The reference frame of the observing spacecraft/sensor state. If the senReferenceFrame is
         * null it is assumed to be J2000.
         */
        fun senReferenceFrame(senReferenceFrame: SenReferenceFrame) =
            senReferenceFrame(JsonField.of(senReferenceFrame))

        /**
         * Sets [Builder.senReferenceFrame] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senReferenceFrame] with a well-typed [SenReferenceFrame]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun senReferenceFrame(senReferenceFrame: JsonField<SenReferenceFrame>) = apply {
            this.senReferenceFrame = senReferenceFrame
        }

        /**
         * Three element array, expressing the observing spacecraft/sensor velocity vector
         * components at observation time, in kilometers/second, in the specified senReferenceFrame.
         * If senReferenceFrame is null then J2000 should be assumed. The array element order is
         * [xvel, yvel, zvel].
         */
        fun senVel(senVel: List<Double>) = senVel(JsonField.of(senVel))

        /**
         * Sets [Builder.senVel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senVel] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senVel(senVel: JsonField<List<Double>>) = apply {
            this.senVel = senVel.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.senVel].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSenVel(senVel: Double) = apply {
            this.senVel =
                (this.senVel ?: JsonField.of(mutableListOf())).also {
                    checkKnown("senVel", it).add(senVel)
                }
        }

        /** A collection of individual space environment observations. */
        fun seoList(seoList: List<SeoList>) = seoList(JsonField.of(seoList))

        /**
         * Sets [Builder.seoList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seoList] with a well-typed `List<SeoList>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun seoList(seoList: JsonField<List<SeoList>>) = apply {
            this.seoList = seoList.map { it.toMutableList() }
        }

        /**
         * Adds a single [SeoList] to [Builder.seoList].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeoList(seoList: SeoList) = apply {
            this.seoList =
                (this.seoList ?: JsonField.of(mutableListOf())).also {
                    checkKnown("seoList", it).add(seoList)
                }
        }

        /**
         * Array of UUIDs of the UDL data records that are related to this observation record. See
         * the associated 'srcTyps' array for specific types of data, positionally corresponding to
         * the UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in size. See the
         * corresponding srcTyps array element of the data type of the UUID and use the appropriate
         * API operation to retrieve that object.
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
         * MANEUVER, MTI, NOTIFICATION, RADAR, RF, SGI, SIGACT, SKYIMAGE, SPACEENVOB, SV, TRACK)
         * that are related to this observation record. See the associated 'srcIds' array for the
         * record UUIDs, positionally corresponding to the record types in this array. The 'srcTyps'
         * and 'srcIds' arrays must match in size.
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
         * Returns an immutable instance of [SpaceEnvObservationFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .obTime()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpaceEnvObservationFull =
            SpaceEnvObservationFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("obTime", obTime),
                checkRequired("source", source),
                id,
                alt,
                createdAt,
                createdBy,
                dataType,
                derived,
                description,
                descriptor,
                externalId,
                forecast,
                genSystem,
                genTime,
                idOnOrbit,
                idSensor,
                instrumentType,
                lat,
                lon,
                measType,
                msgType,
                observatoryName,
                observatoryNotes,
                observatoryType,
                obSetId,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                particleType,
                quality,
                satNo,
                senEnergyLevel,
                (senPos ?: JsonMissing.of()).map { it.toImmutable() },
                senReferenceFrame,
                (senVel ?: JsonMissing.of()).map { it.toImmutable() },
                (seoList ?: JsonMissing.of()).map { it.toImmutable() },
                (srcIds ?: JsonMissing.of()).map { it.toImmutable() },
                (srcTyps ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SpaceEnvObservationFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        obTime()
        source()
        id()
        alt()
        createdAt()
        createdBy()
        dataType()
        derived()
        description()
        descriptor()
        externalId()
        forecast()
        genSystem()
        genTime()
        idOnOrbit()
        idSensor()
        instrumentType()
        lat()
        lon()
        measType()
        msgType()
        observatoryName()
        observatoryNotes()
        observatoryType()
        obSetId()
        origin()
        origNetwork()
        origObjectId()
        origSensorId()
        particleType()
        quality()
        satNo()
        senEnergyLevel()
        senPos()
        senReferenceFrame().ifPresent { it.validate() }
        senVel()
        seoList().ifPresent { it.forEach { it.validate() } }
        srcIds()
        srcTyps()
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
            (if (obTime.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (alt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dataType.asKnown().isPresent) 1 else 0) +
            (if (derived.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (descriptor.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (if (forecast.asKnown().isPresent) 1 else 0) +
            (if (genSystem.asKnown().isPresent) 1 else 0) +
            (if (genTime.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (instrumentType.asKnown().isPresent) 1 else 0) +
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (lon.asKnown().isPresent) 1 else 0) +
            (if (measType.asKnown().isPresent) 1 else 0) +
            (if (msgType.asKnown().isPresent) 1 else 0) +
            (if (observatoryName.asKnown().isPresent) 1 else 0) +
            (if (observatoryNotes.asKnown().isPresent) 1 else 0) +
            (if (observatoryType.asKnown().isPresent) 1 else 0) +
            (if (obSetId.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (if (particleType.asKnown().isPresent) 1 else 0) +
            (if (quality.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (senEnergyLevel.asKnown().isPresent) 1 else 0) +
            (senPos.asKnown().getOrNull()?.size ?: 0) +
            (senReferenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
            (senVel.asKnown().getOrNull()?.size ?: 0) +
            (seoList.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (srcIds.asKnown().getOrNull()?.size ?: 0) +
            (srcTyps.asKnown().getOrNull()?.size ?: 0)

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
     * The reference frame of the observing spacecraft/sensor state. If the senReferenceFrame is
     * null it is assumed to be J2000.
     */
    class SenReferenceFrame @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val J2000 = of("J2000")

            @JvmField val EFG_TDR = of("EFG/TDR")

            @JvmField val ECR_ECEF = of("ECR/ECEF")

            @JvmField val TEME = of("TEME")

            @JvmField val ITRF = of("ITRF")

            @JvmField val GCRF = of("GCRF")

            @JvmStatic fun of(value: String) = SenReferenceFrame(JsonField.of(value))
        }

        /** An enum containing [SenReferenceFrame]'s known values. */
        enum class Known {
            J2000,
            EFG_TDR,
            ECR_ECEF,
            TEME,
            ITRF,
            GCRF,
        }

        /**
         * An enum containing [SenReferenceFrame]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SenReferenceFrame] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            J2000,
            EFG_TDR,
            ECR_ECEF,
            TEME,
            ITRF,
            GCRF,
            /**
             * An enum member indicating that [SenReferenceFrame] was instantiated with an unknown
             * value.
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
                J2000 -> Value.J2000
                EFG_TDR -> Value.EFG_TDR
                ECR_ECEF -> Value.ECR_ECEF
                TEME -> Value.TEME
                ITRF -> Value.ITRF
                GCRF -> Value.GCRF
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
                J2000 -> Known.J2000
                EFG_TDR -> Known.EFG_TDR
                ECR_ECEF -> Known.ECR_ECEF
                TEME -> Known.TEME
                ITRF -> Known.ITRF
                GCRF -> Known.GCRF
                else ->
                    throw UnifieddatalibraryInvalidDataException(
                        "Unknown SenReferenceFrame: $value"
                    )
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

        fun validate(): SenReferenceFrame = apply {
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

            return other is SenReferenceFrame && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A single space environment observation. */
    class SeoList
    private constructor(
        private val obType: JsonField<String>,
        private val obUoM: JsonField<String>,
        private val obArray: JsonField<List<Double>>,
        private val obBool: JsonField<Boolean>,
        private val obDescription: JsonField<String>,
        private val obQuality: JsonField<String>,
        private val obString: JsonField<String>,
        private val obValue: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("obType") @ExcludeMissing obType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("obUoM") @ExcludeMissing obUoM: JsonField<String> = JsonMissing.of(),
            @JsonProperty("obArray")
            @ExcludeMissing
            obArray: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("obBool") @ExcludeMissing obBool: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("obDescription")
            @ExcludeMissing
            obDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("obQuality")
            @ExcludeMissing
            obQuality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("obString")
            @ExcludeMissing
            obString: JsonField<String> = JsonMissing.of(),
            @JsonProperty("obValue") @ExcludeMissing obValue: JsonField<Double> = JsonMissing.of(),
        ) : this(
            obType,
            obUoM,
            obArray,
            obBool,
            obDescription,
            obQuality,
            obString,
            obValue,
            mutableMapOf(),
        )

        /**
         * The type of observation associated with this record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun obType(): String = obType.getRequired("obType")

        /**
         * The Unit of Measure associated with this observation. If there are no physical units
         * associated with the measurement, a value of NONE should be specified.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun obUoM(): String = obUoM.getRequired("obUoM")

        /**
         * An array of observation values expressed in the specified unit of measure (obUoM).
         * Because of the variability of the Space Environment data types, each record may employ a
         * numeric observation value (obValue), a string observation value (obString), a Boolean
         * observation value (obBool), an array of numeric observation values (obArray), or any
         * combination of these.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obArray(): Optional<List<Double>> = obArray.getOptional("obArray")

        /**
         * A Boolean observation. Because of the variability of the Space Environment data types,
         * each record may employ a numeric observation value (obValue), a string observation value
         * (obString), a Boolean observation value (obBool), an array of numeric observation values
         * (obArray), or any combination of these.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obBool(): Optional<Boolean> = obBool.getOptional("obBool")

        /**
         * Descriptive or additional information associated with this individual observation.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obDescription(): Optional<String> = obDescription.getOptional("obDescription")

        /**
         * The quality of this individual observation. The observation quality indicator value may
         * vary among providers and may be a generalized statement (BAD, GOOD, UNCERTAIN, UNKNOWN)
         * or a numeric value. Users should consult the data provider to verify the usage of the
         * observation.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obQuality(): Optional<String> = obQuality.getOptional("obQuality")

        /**
         * A single observation string expressed in the specified unit of measure (obUoM). Because
         * of the variability of the Space Environment data types, each record may employ a numeric
         * observation value (obValue), a string observation value (obString), a Boolean observation
         * value (obBool), an array of numeric observation values (obArray), or any combination of
         * these.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obString(): Optional<String> = obString.getOptional("obString")

        /**
         * A single observation value expressed in the specified unit of measure (obUoM). Because of
         * the variability of the Space Environment data types, each record may employ a numeric
         * observation value (obValue), a string observation value (obString), a Boolean observation
         * value (obBool), an array of numeric observation values (obArray), or any combination of
         * these.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obValue(): Optional<Double> = obValue.getOptional("obValue")

        /**
         * Returns the raw JSON value of [obType].
         *
         * Unlike [obType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obType") @ExcludeMissing fun _obType(): JsonField<String> = obType

        /**
         * Returns the raw JSON value of [obUoM].
         *
         * Unlike [obUoM], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obUoM") @ExcludeMissing fun _obUoM(): JsonField<String> = obUoM

        /**
         * Returns the raw JSON value of [obArray].
         *
         * Unlike [obArray], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obArray") @ExcludeMissing fun _obArray(): JsonField<List<Double>> = obArray

        /**
         * Returns the raw JSON value of [obBool].
         *
         * Unlike [obBool], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obBool") @ExcludeMissing fun _obBool(): JsonField<Boolean> = obBool

        /**
         * Returns the raw JSON value of [obDescription].
         *
         * Unlike [obDescription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("obDescription")
        @ExcludeMissing
        fun _obDescription(): JsonField<String> = obDescription

        /**
         * Returns the raw JSON value of [obQuality].
         *
         * Unlike [obQuality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obQuality") @ExcludeMissing fun _obQuality(): JsonField<String> = obQuality

        /**
         * Returns the raw JSON value of [obString].
         *
         * Unlike [obString], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obString") @ExcludeMissing fun _obString(): JsonField<String> = obString

        /**
         * Returns the raw JSON value of [obValue].
         *
         * Unlike [obValue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obValue") @ExcludeMissing fun _obValue(): JsonField<Double> = obValue

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
             * Returns a mutable builder for constructing an instance of [SeoList].
             *
             * The following fields are required:
             * ```java
             * .obType()
             * .obUoM()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SeoList]. */
        class Builder internal constructor() {

            private var obType: JsonField<String>? = null
            private var obUoM: JsonField<String>? = null
            private var obArray: JsonField<MutableList<Double>>? = null
            private var obBool: JsonField<Boolean> = JsonMissing.of()
            private var obDescription: JsonField<String> = JsonMissing.of()
            private var obQuality: JsonField<String> = JsonMissing.of()
            private var obString: JsonField<String> = JsonMissing.of()
            private var obValue: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(seoList: SeoList) = apply {
                obType = seoList.obType
                obUoM = seoList.obUoM
                obArray = seoList.obArray.map { it.toMutableList() }
                obBool = seoList.obBool
                obDescription = seoList.obDescription
                obQuality = seoList.obQuality
                obString = seoList.obString
                obValue = seoList.obValue
                additionalProperties = seoList.additionalProperties.toMutableMap()
            }

            /** The type of observation associated with this record. */
            fun obType(obType: String) = obType(JsonField.of(obType))

            /**
             * Sets [Builder.obType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obType(obType: JsonField<String>) = apply { this.obType = obType }

            /**
             * The Unit of Measure associated with this observation. If there are no physical units
             * associated with the measurement, a value of NONE should be specified.
             */
            fun obUoM(obUoM: String) = obUoM(JsonField.of(obUoM))

            /**
             * Sets [Builder.obUoM] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obUoM] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obUoM(obUoM: JsonField<String>) = apply { this.obUoM = obUoM }

            /**
             * An array of observation values expressed in the specified unit of measure (obUoM).
             * Because of the variability of the Space Environment data types, each record may
             * employ a numeric observation value (obValue), a string observation value (obString),
             * a Boolean observation value (obBool), an array of numeric observation values
             * (obArray), or any combination of these.
             */
            fun obArray(obArray: List<Double>) = obArray(JsonField.of(obArray))

            /**
             * Sets [Builder.obArray] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obArray] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obArray(obArray: JsonField<List<Double>>) = apply {
                this.obArray = obArray.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.obArray].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addObArray(obArray: Double) = apply {
                this.obArray =
                    (this.obArray ?: JsonField.of(mutableListOf())).also {
                        checkKnown("obArray", it).add(obArray)
                    }
            }

            /**
             * A Boolean observation. Because of the variability of the Space Environment data
             * types, each record may employ a numeric observation value (obValue), a string
             * observation value (obString), a Boolean observation value (obBool), an array of
             * numeric observation values (obArray), or any combination of these.
             */
            fun obBool(obBool: Boolean) = obBool(JsonField.of(obBool))

            /**
             * Sets [Builder.obBool] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obBool] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obBool(obBool: JsonField<Boolean>) = apply { this.obBool = obBool }

            /**
             * Descriptive or additional information associated with this individual observation.
             */
            fun obDescription(obDescription: String) = obDescription(JsonField.of(obDescription))

            /**
             * Sets [Builder.obDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obDescription] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obDescription(obDescription: JsonField<String>) = apply {
                this.obDescription = obDescription
            }

            /**
             * The quality of this individual observation. The observation quality indicator value
             * may vary among providers and may be a generalized statement (BAD, GOOD, UNCERTAIN,
             * UNKNOWN) or a numeric value. Users should consult the data provider to verify the
             * usage of the observation.
             */
            fun obQuality(obQuality: String) = obQuality(JsonField.of(obQuality))

            /**
             * Sets [Builder.obQuality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obQuality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obQuality(obQuality: JsonField<String>) = apply { this.obQuality = obQuality }

            /**
             * A single observation string expressed in the specified unit of measure (obUoM).
             * Because of the variability of the Space Environment data types, each record may
             * employ a numeric observation value (obValue), a string observation value (obString),
             * a Boolean observation value (obBool), an array of numeric observation values
             * (obArray), or any combination of these.
             */
            fun obString(obString: String) = obString(JsonField.of(obString))

            /**
             * Sets [Builder.obString] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obString] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obString(obString: JsonField<String>) = apply { this.obString = obString }

            /**
             * A single observation value expressed in the specified unit of measure (obUoM).
             * Because of the variability of the Space Environment data types, each record may
             * employ a numeric observation value (obValue), a string observation value (obString),
             * a Boolean observation value (obBool), an array of numeric observation values
             * (obArray), or any combination of these.
             */
            fun obValue(obValue: Double) = obValue(JsonField.of(obValue))

            /**
             * Sets [Builder.obValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obValue] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obValue(obValue: JsonField<Double>) = apply { this.obValue = obValue }

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
             * Returns an immutable instance of [SeoList].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .obType()
             * .obUoM()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SeoList =
                SeoList(
                    checkRequired("obType", obType),
                    checkRequired("obUoM", obUoM),
                    (obArray ?: JsonMissing.of()).map { it.toImmutable() },
                    obBool,
                    obDescription,
                    obQuality,
                    obString,
                    obValue,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SeoList = apply {
            if (validated) {
                return@apply
            }

            obType()
            obUoM()
            obArray()
            obBool()
            obDescription()
            obQuality()
            obString()
            obValue()
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
            (if (obType.asKnown().isPresent) 1 else 0) +
                (if (obUoM.asKnown().isPresent) 1 else 0) +
                (obArray.asKnown().getOrNull()?.size ?: 0) +
                (if (obBool.asKnown().isPresent) 1 else 0) +
                (if (obDescription.asKnown().isPresent) 1 else 0) +
                (if (obQuality.asKnown().isPresent) 1 else 0) +
                (if (obString.asKnown().isPresent) 1 else 0) +
                (if (obValue.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SeoList &&
                obType == other.obType &&
                obUoM == other.obUoM &&
                obArray == other.obArray &&
                obBool == other.obBool &&
                obDescription == other.obDescription &&
                obQuality == other.obQuality &&
                obString == other.obString &&
                obValue == other.obValue &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                obType,
                obUoM,
                obArray,
                obBool,
                obDescription,
                obQuality,
                obString,
                obValue,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SeoList{obType=$obType, obUoM=$obUoM, obArray=$obArray, obBool=$obBool, obDescription=$obDescription, obQuality=$obQuality, obString=$obString, obValue=$obValue, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpaceEnvObservationFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            obTime == other.obTime &&
            source == other.source &&
            id == other.id &&
            alt == other.alt &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            dataType == other.dataType &&
            derived == other.derived &&
            description == other.description &&
            descriptor == other.descriptor &&
            externalId == other.externalId &&
            forecast == other.forecast &&
            genSystem == other.genSystem &&
            genTime == other.genTime &&
            idOnOrbit == other.idOnOrbit &&
            idSensor == other.idSensor &&
            instrumentType == other.instrumentType &&
            lat == other.lat &&
            lon == other.lon &&
            measType == other.measType &&
            msgType == other.msgType &&
            observatoryName == other.observatoryName &&
            observatoryNotes == other.observatoryNotes &&
            observatoryType == other.observatoryType &&
            obSetId == other.obSetId &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            origSensorId == other.origSensorId &&
            particleType == other.particleType &&
            quality == other.quality &&
            satNo == other.satNo &&
            senEnergyLevel == other.senEnergyLevel &&
            senPos == other.senPos &&
            senReferenceFrame == other.senReferenceFrame &&
            senVel == other.senVel &&
            seoList == other.seoList &&
            srcIds == other.srcIds &&
            srcTyps == other.srcTyps &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            obTime,
            source,
            id,
            alt,
            createdAt,
            createdBy,
            dataType,
            derived,
            description,
            descriptor,
            externalId,
            forecast,
            genSystem,
            genTime,
            idOnOrbit,
            idSensor,
            instrumentType,
            lat,
            lon,
            measType,
            msgType,
            observatoryName,
            observatoryNotes,
            observatoryType,
            obSetId,
            origin,
            origNetwork,
            origObjectId,
            origSensorId,
            particleType,
            quality,
            satNo,
            senEnergyLevel,
            senPos,
            senReferenceFrame,
            senVel,
            seoList,
            srcIds,
            srcTyps,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpaceEnvObservationFull{classificationMarking=$classificationMarking, dataMode=$dataMode, obTime=$obTime, source=$source, id=$id, alt=$alt, createdAt=$createdAt, createdBy=$createdBy, dataType=$dataType, derived=$derived, description=$description, descriptor=$descriptor, externalId=$externalId, forecast=$forecast, genSystem=$genSystem, genTime=$genTime, idOnOrbit=$idOnOrbit, idSensor=$idSensor, instrumentType=$instrumentType, lat=$lat, lon=$lon, measType=$measType, msgType=$msgType, observatoryName=$observatoryName, observatoryNotes=$observatoryNotes, observatoryType=$observatoryType, obSetId=$obSetId, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, particleType=$particleType, quality=$quality, satNo=$satNo, senEnergyLevel=$senEnergyLevel, senPos=$senPos, senReferenceFrame=$senReferenceFrame, senVel=$senVel, seoList=$seoList, srcIds=$srcIds, srcTyps=$srcTyps, additionalProperties=$additionalProperties}"
}

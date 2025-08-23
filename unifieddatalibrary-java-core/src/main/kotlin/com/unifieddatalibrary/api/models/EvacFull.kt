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
 * Casualty report and evacuation request. Used to report and request support to evacuate friendly
 * and enemy casualties.
 */
class EvacFull
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val pickupLat: JsonField<Double>,
    private val pickupLon: JsonField<Double>,
    private val reqTime: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val type: JsonField<Type>,
    private val id: JsonField<String>,
    private val casualtyInfo: JsonField<List<CasualtyInfo>>,
    private val ce: JsonField<Double>,
    private val cntctFreq: JsonField<Double>,
    private val comments: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val enemyData: JsonField<List<EnemyData>>,
    private val idWeatherReport: JsonField<String>,
    private val le: JsonField<Double>,
    private val medevacId: JsonField<String>,
    private val medicReq: JsonField<Boolean>,
    private val missionType: JsonField<String>,
    private val numAmbulatory: JsonField<Int>,
    private val numCasualties: JsonField<Int>,
    private val numKia: JsonField<Int>,
    private val numLitter: JsonField<Int>,
    private val numWia: JsonField<Int>,
    private val obstaclesRemarks: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val pickupAlt: JsonField<Double>,
    private val pickupTime: JsonField<OffsetDateTime>,
    private val relatedDocs: JsonField<List<RelatedDocumentFull>>,
    private val reqCallSign: JsonField<String>,
    private val reqNum: JsonField<String>,
    private val terrain: JsonField<String>,
    private val terrainRemarks: JsonField<String>,
    private val zoneContrCallSign: JsonField<String>,
    private val zoneHot: JsonField<Boolean>,
    private val zoneMarking: JsonField<String>,
    private val zoneMarkingColor: JsonField<String>,
    private val zoneName: JsonField<String>,
    private val zoneSecurity: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("pickupLat") @ExcludeMissing pickupLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pickupLon") @ExcludeMissing pickupLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("reqTime")
        @ExcludeMissing
        reqTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("casualtyInfo")
        @ExcludeMissing
        casualtyInfo: JsonField<List<CasualtyInfo>> = JsonMissing.of(),
        @JsonProperty("ce") @ExcludeMissing ce: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("cntctFreq") @ExcludeMissing cntctFreq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("comments") @ExcludeMissing comments: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enemyData")
        @ExcludeMissing
        enemyData: JsonField<List<EnemyData>> = JsonMissing.of(),
        @JsonProperty("idWeatherReport")
        @ExcludeMissing
        idWeatherReport: JsonField<String> = JsonMissing.of(),
        @JsonProperty("le") @ExcludeMissing le: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("medevacId") @ExcludeMissing medevacId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("medicReq") @ExcludeMissing medicReq: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("missionType")
        @ExcludeMissing
        missionType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numAmbulatory")
        @ExcludeMissing
        numAmbulatory: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numCasualties")
        @ExcludeMissing
        numCasualties: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numKIA") @ExcludeMissing numKia: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numLitter") @ExcludeMissing numLitter: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numWIA") @ExcludeMissing numWia: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("obstaclesRemarks")
        @ExcludeMissing
        obstaclesRemarks: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pickupAlt") @ExcludeMissing pickupAlt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pickupTime")
        @ExcludeMissing
        pickupTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("relatedDocs")
        @ExcludeMissing
        relatedDocs: JsonField<List<RelatedDocumentFull>> = JsonMissing.of(),
        @JsonProperty("reqCallSign")
        @ExcludeMissing
        reqCallSign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reqNum") @ExcludeMissing reqNum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("terrain") @ExcludeMissing terrain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("terrainRemarks")
        @ExcludeMissing
        terrainRemarks: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zoneContrCallSign")
        @ExcludeMissing
        zoneContrCallSign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zoneHot") @ExcludeMissing zoneHot: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("zoneMarking")
        @ExcludeMissing
        zoneMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zoneMarkingColor")
        @ExcludeMissing
        zoneMarkingColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zoneName") @ExcludeMissing zoneName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zoneSecurity")
        @ExcludeMissing
        zoneSecurity: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        pickupLat,
        pickupLon,
        reqTime,
        source,
        type,
        id,
        casualtyInfo,
        ce,
        cntctFreq,
        comments,
        createdAt,
        createdBy,
        enemyData,
        idWeatherReport,
        le,
        medevacId,
        medicReq,
        missionType,
        numAmbulatory,
        numCasualties,
        numKia,
        numLitter,
        numWia,
        obstaclesRemarks,
        origin,
        origNetwork,
        pickupAlt,
        pickupTime,
        relatedDocs,
        reqCallSign,
        reqNum,
        terrain,
        terrainRemarks,
        zoneContrCallSign,
        zoneHot,
        zoneMarking,
        zoneMarkingColor,
        zoneName,
        zoneSecurity,
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
     * WGS-84 latitude of the pickup location, in degrees. -90 to 90 degrees (negative values south
     * of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pickupLat(): Double = pickupLat.getRequired("pickupLat")

    /**
     * WGS-84 longitude of the pickup location, in degrees. -180 to 180 degrees (negative values
     * west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pickupLon(): Double = pickupLon.getRequired("pickupLon")

    /**
     * The request time, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reqTime(): OffsetDateTime = reqTime.getRequired("reqTime")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The type of this medevac record (REQUEST, RESPONSE).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Identity and medical information on the patient to be evacuated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun casualtyInfo(): Optional<List<CasualtyInfo>> = casualtyInfo.getOptional("casualtyInfo")

    /**
     * Radius of circular area about lat/lon point, in meters (1-sigma, if representing error).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ce(): Optional<Double> = ce.getOptional("ce")

    /**
     * The contact frequency, in Hz, of the agency or zone controller.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cntctFreq(): Optional<Double> = cntctFreq.getOptional("cntctFreq")

    /**
     * Additional comments for the medevac mission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun comments(): Optional<String> = comments.getOptional("comments")

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
     * Data defining any enemy intelligence reported by the requestor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun enemyData(): Optional<List<EnemyData>> = enemyData.getOptional("enemyData")

    /**
     * Unique identifier of a weather report associated with this evacuation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idWeatherReport(): Optional<String> = idWeatherReport.getOptional("idWeatherReport")

    /**
     * Height above lat/lon point, in meters (1-sigma, if representing linear error).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun le(): Optional<Double> = le.getOptional("le")

    /**
     * UUID identifying the medevac mission, which should remain the same on subsequent posts
     * related to the same medevac mission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun medevacId(): Optional<String> = medevacId.getOptional("medevacId")

    /**
     * Flag indicating whether the mission requires medical personnel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun medicReq(): Optional<Boolean> = medicReq.getOptional("medicReq")

    /**
     * The operation type of the evacuation. (NOT SPECIFIED, AIR, GROUND, SURFACE).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun missionType(): Optional<String> = missionType.getOptional("missionType")

    /**
     * Number of ambulatory personnel requiring evacuation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numAmbulatory(): Optional<Int> = numAmbulatory.getOptional("numAmbulatory")

    /**
     * The count of people requiring medevac.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numCasualties(): Optional<Int> = numCasualties.getOptional("numCasualties")

    /**
     * Number of people Killed In Action.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numKia(): Optional<Int> = numKia.getOptional("numKIA")

    /**
     * Number of littered personnel requiring evacuation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numLitter(): Optional<Int> = numLitter.getOptional("numLitter")

    /**
     * Number of people Wounded In Action.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numWia(): Optional<Int> = numWia.getOptional("numWIA")

    /**
     * Amplifying data for the terrain describing important obstacles in or around the zone.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun obstaclesRemarks(): Optional<String> = obstaclesRemarks.getOptional("obstaclesRemarks")

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
     * Altitude relative to WGS-84 ellipsoid, in meters. Positive values indicate a point height
     * above ellipsoid, and negative values indicate a point height below ellipsoid.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pickupAlt(): Optional<Double> = pickupAlt.getOptional("pickupAlt")

    /**
     * The expected pickup time, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pickupTime(): Optional<OffsetDateTime> = pickupTime.getOptional("pickupTime")

    /**
     * Related document ids.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun relatedDocs(): Optional<List<RelatedDocumentFull>> = relatedDocs.getOptional("relatedDocs")

    /**
     * The call sign of this medevac requestor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reqCallSign(): Optional<String> = reqCallSign.getOptional("reqCallSign")

    /**
     * Externally provided Medevac request number (e.g. MED.1.223908).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reqNum(): Optional<String> = reqNum.getOptional("reqNum")

    /**
     * Short description of the terrain features of the pickup location (WOODS, TREES, PLOWED
     * FIELDS, FLAT, STANDING WATER, MARSH, URBAN BUILT-UP AREA, MOUNTAIN, HILL, SAND TD, ROCKY,
     * VALLEY, METAMORPHIC ICE, UNKNOWN TD, SEA, NO STATEMENT).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun terrain(): Optional<String> = terrain.getOptional("terrain")

    /**
     * Amplifying data for the terrain describing any notable additional terrain features.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun terrainRemarks(): Optional<String> = terrainRemarks.getOptional("terrainRemarks")

    /**
     * The call sign of the zone controller.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zoneContrCallSign(): Optional<String> = zoneContrCallSign.getOptional("zoneContrCallSign")

    /**
     * Flag indicating that the pickup site is hot and hostiles are in the area.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zoneHot(): Optional<Boolean> = zoneHot.getOptional("zoneHot")

    /**
     * The expected marker identifying the pickup site (SMOKE ZONE MARKING, FLARES, MIRROR, GLIDE
     * ANGLE INDICATOR LIGHT, LIGHT ZONE MARKING, PANELS, FIRE, LASER DESIGNATOR, STROBE LIGHTS,
     * VEHICLE LIGHTS, COLORED SMOKE, WHITE PHOSPHERUS, INFRARED, ILLUMINATION, FRATRICIDE FENCE).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zoneMarking(): Optional<String> = zoneMarking.getOptional("zoneMarking")

    /**
     * Color used for the pickup site marking (RED, WHITE, BLUE, YELLOW, GREEN, ORANGE, BLACK,
     * PURPLE, BROWN, TAN, GRAY, SILVER, CAMOUFLAGE, OTHER COLOR).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zoneMarkingColor(): Optional<String> = zoneMarkingColor.getOptional("zoneMarkingColor")

    /**
     * The name of the zone.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zoneName(): Optional<String> = zoneName.getOptional("zoneName")

    /**
     * The pickup site security (UNKNOWN ZONESECURITY, NO ENEMY, POSSIBLE ENEMY, ENEMY IN AREA USE
     * CAUTION, ENEMY IN AREA ARMED ESCORT REQUIRED).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zoneSecurity(): Optional<String> = zoneSecurity.getOptional("zoneSecurity")

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
     * Returns the raw JSON value of [pickupLat].
     *
     * Unlike [pickupLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pickupLat") @ExcludeMissing fun _pickupLat(): JsonField<Double> = pickupLat

    /**
     * Returns the raw JSON value of [pickupLon].
     *
     * Unlike [pickupLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pickupLon") @ExcludeMissing fun _pickupLon(): JsonField<Double> = pickupLon

    /**
     * Returns the raw JSON value of [reqTime].
     *
     * Unlike [reqTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reqTime") @ExcludeMissing fun _reqTime(): JsonField<OffsetDateTime> = reqTime

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
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [casualtyInfo].
     *
     * Unlike [casualtyInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("casualtyInfo")
    @ExcludeMissing
    fun _casualtyInfo(): JsonField<List<CasualtyInfo>> = casualtyInfo

    /**
     * Returns the raw JSON value of [ce].
     *
     * Unlike [ce], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ce") @ExcludeMissing fun _ce(): JsonField<Double> = ce

    /**
     * Returns the raw JSON value of [cntctFreq].
     *
     * Unlike [cntctFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cntctFreq") @ExcludeMissing fun _cntctFreq(): JsonField<Double> = cntctFreq

    /**
     * Returns the raw JSON value of [comments].
     *
     * Unlike [comments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<String> = comments

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
     * Returns the raw JSON value of [enemyData].
     *
     * Unlike [enemyData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enemyData")
    @ExcludeMissing
    fun _enemyData(): JsonField<List<EnemyData>> = enemyData

    /**
     * Returns the raw JSON value of [idWeatherReport].
     *
     * Unlike [idWeatherReport], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idWeatherReport")
    @ExcludeMissing
    fun _idWeatherReport(): JsonField<String> = idWeatherReport

    /**
     * Returns the raw JSON value of [le].
     *
     * Unlike [le], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("le") @ExcludeMissing fun _le(): JsonField<Double> = le

    /**
     * Returns the raw JSON value of [medevacId].
     *
     * Unlike [medevacId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medevacId") @ExcludeMissing fun _medevacId(): JsonField<String> = medevacId

    /**
     * Returns the raw JSON value of [medicReq].
     *
     * Unlike [medicReq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medicReq") @ExcludeMissing fun _medicReq(): JsonField<Boolean> = medicReq

    /**
     * Returns the raw JSON value of [missionType].
     *
     * Unlike [missionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("missionType") @ExcludeMissing fun _missionType(): JsonField<String> = missionType

    /**
     * Returns the raw JSON value of [numAmbulatory].
     *
     * Unlike [numAmbulatory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numAmbulatory")
    @ExcludeMissing
    fun _numAmbulatory(): JsonField<Int> = numAmbulatory

    /**
     * Returns the raw JSON value of [numCasualties].
     *
     * Unlike [numCasualties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numCasualties")
    @ExcludeMissing
    fun _numCasualties(): JsonField<Int> = numCasualties

    /**
     * Returns the raw JSON value of [numKia].
     *
     * Unlike [numKia], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numKIA") @ExcludeMissing fun _numKia(): JsonField<Int> = numKia

    /**
     * Returns the raw JSON value of [numLitter].
     *
     * Unlike [numLitter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numLitter") @ExcludeMissing fun _numLitter(): JsonField<Int> = numLitter

    /**
     * Returns the raw JSON value of [numWia].
     *
     * Unlike [numWia], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numWIA") @ExcludeMissing fun _numWia(): JsonField<Int> = numWia

    /**
     * Returns the raw JSON value of [obstaclesRemarks].
     *
     * Unlike [obstaclesRemarks], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("obstaclesRemarks")
    @ExcludeMissing
    fun _obstaclesRemarks(): JsonField<String> = obstaclesRemarks

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
     * Returns the raw JSON value of [pickupAlt].
     *
     * Unlike [pickupAlt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pickupAlt") @ExcludeMissing fun _pickupAlt(): JsonField<Double> = pickupAlt

    /**
     * Returns the raw JSON value of [pickupTime].
     *
     * Unlike [pickupTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pickupTime")
    @ExcludeMissing
    fun _pickupTime(): JsonField<OffsetDateTime> = pickupTime

    /**
     * Returns the raw JSON value of [relatedDocs].
     *
     * Unlike [relatedDocs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("relatedDocs")
    @ExcludeMissing
    fun _relatedDocs(): JsonField<List<RelatedDocumentFull>> = relatedDocs

    /**
     * Returns the raw JSON value of [reqCallSign].
     *
     * Unlike [reqCallSign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reqCallSign") @ExcludeMissing fun _reqCallSign(): JsonField<String> = reqCallSign

    /**
     * Returns the raw JSON value of [reqNum].
     *
     * Unlike [reqNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reqNum") @ExcludeMissing fun _reqNum(): JsonField<String> = reqNum

    /**
     * Returns the raw JSON value of [terrain].
     *
     * Unlike [terrain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("terrain") @ExcludeMissing fun _terrain(): JsonField<String> = terrain

    /**
     * Returns the raw JSON value of [terrainRemarks].
     *
     * Unlike [terrainRemarks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("terrainRemarks")
    @ExcludeMissing
    fun _terrainRemarks(): JsonField<String> = terrainRemarks

    /**
     * Returns the raw JSON value of [zoneContrCallSign].
     *
     * Unlike [zoneContrCallSign], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("zoneContrCallSign")
    @ExcludeMissing
    fun _zoneContrCallSign(): JsonField<String> = zoneContrCallSign

    /**
     * Returns the raw JSON value of [zoneHot].
     *
     * Unlike [zoneHot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zoneHot") @ExcludeMissing fun _zoneHot(): JsonField<Boolean> = zoneHot

    /**
     * Returns the raw JSON value of [zoneMarking].
     *
     * Unlike [zoneMarking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zoneMarking") @ExcludeMissing fun _zoneMarking(): JsonField<String> = zoneMarking

    /**
     * Returns the raw JSON value of [zoneMarkingColor].
     *
     * Unlike [zoneMarkingColor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("zoneMarkingColor")
    @ExcludeMissing
    fun _zoneMarkingColor(): JsonField<String> = zoneMarkingColor

    /**
     * Returns the raw JSON value of [zoneName].
     *
     * Unlike [zoneName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zoneName") @ExcludeMissing fun _zoneName(): JsonField<String> = zoneName

    /**
     * Returns the raw JSON value of [zoneSecurity].
     *
     * Unlike [zoneSecurity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zoneSecurity")
    @ExcludeMissing
    fun _zoneSecurity(): JsonField<String> = zoneSecurity

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
         * Returns a mutable builder for constructing an instance of [EvacFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .pickupLat()
         * .pickupLon()
         * .reqTime()
         * .source()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EvacFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var pickupLat: JsonField<Double>? = null
        private var pickupLon: JsonField<Double>? = null
        private var reqTime: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var casualtyInfo: JsonField<MutableList<CasualtyInfo>>? = null
        private var ce: JsonField<Double> = JsonMissing.of()
        private var cntctFreq: JsonField<Double> = JsonMissing.of()
        private var comments: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var enemyData: JsonField<MutableList<EnemyData>>? = null
        private var idWeatherReport: JsonField<String> = JsonMissing.of()
        private var le: JsonField<Double> = JsonMissing.of()
        private var medevacId: JsonField<String> = JsonMissing.of()
        private var medicReq: JsonField<Boolean> = JsonMissing.of()
        private var missionType: JsonField<String> = JsonMissing.of()
        private var numAmbulatory: JsonField<Int> = JsonMissing.of()
        private var numCasualties: JsonField<Int> = JsonMissing.of()
        private var numKia: JsonField<Int> = JsonMissing.of()
        private var numLitter: JsonField<Int> = JsonMissing.of()
        private var numWia: JsonField<Int> = JsonMissing.of()
        private var obstaclesRemarks: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var pickupAlt: JsonField<Double> = JsonMissing.of()
        private var pickupTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var relatedDocs: JsonField<MutableList<RelatedDocumentFull>>? = null
        private var reqCallSign: JsonField<String> = JsonMissing.of()
        private var reqNum: JsonField<String> = JsonMissing.of()
        private var terrain: JsonField<String> = JsonMissing.of()
        private var terrainRemarks: JsonField<String> = JsonMissing.of()
        private var zoneContrCallSign: JsonField<String> = JsonMissing.of()
        private var zoneHot: JsonField<Boolean> = JsonMissing.of()
        private var zoneMarking: JsonField<String> = JsonMissing.of()
        private var zoneMarkingColor: JsonField<String> = JsonMissing.of()
        private var zoneName: JsonField<String> = JsonMissing.of()
        private var zoneSecurity: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(evacFull: EvacFull) = apply {
            classificationMarking = evacFull.classificationMarking
            dataMode = evacFull.dataMode
            pickupLat = evacFull.pickupLat
            pickupLon = evacFull.pickupLon
            reqTime = evacFull.reqTime
            source = evacFull.source
            type = evacFull.type
            id = evacFull.id
            casualtyInfo = evacFull.casualtyInfo.map { it.toMutableList() }
            ce = evacFull.ce
            cntctFreq = evacFull.cntctFreq
            comments = evacFull.comments
            createdAt = evacFull.createdAt
            createdBy = evacFull.createdBy
            enemyData = evacFull.enemyData.map { it.toMutableList() }
            idWeatherReport = evacFull.idWeatherReport
            le = evacFull.le
            medevacId = evacFull.medevacId
            medicReq = evacFull.medicReq
            missionType = evacFull.missionType
            numAmbulatory = evacFull.numAmbulatory
            numCasualties = evacFull.numCasualties
            numKia = evacFull.numKia
            numLitter = evacFull.numLitter
            numWia = evacFull.numWia
            obstaclesRemarks = evacFull.obstaclesRemarks
            origin = evacFull.origin
            origNetwork = evacFull.origNetwork
            pickupAlt = evacFull.pickupAlt
            pickupTime = evacFull.pickupTime
            relatedDocs = evacFull.relatedDocs.map { it.toMutableList() }
            reqCallSign = evacFull.reqCallSign
            reqNum = evacFull.reqNum
            terrain = evacFull.terrain
            terrainRemarks = evacFull.terrainRemarks
            zoneContrCallSign = evacFull.zoneContrCallSign
            zoneHot = evacFull.zoneHot
            zoneMarking = evacFull.zoneMarking
            zoneMarkingColor = evacFull.zoneMarkingColor
            zoneName = evacFull.zoneName
            zoneSecurity = evacFull.zoneSecurity
            additionalProperties = evacFull.additionalProperties.toMutableMap()
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
         * WGS-84 latitude of the pickup location, in degrees. -90 to 90 degrees (negative values
         * south of equator).
         */
        fun pickupLat(pickupLat: Double) = pickupLat(JsonField.of(pickupLat))

        /**
         * Sets [Builder.pickupLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pickupLat] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pickupLat(pickupLat: JsonField<Double>) = apply { this.pickupLat = pickupLat }

        /**
         * WGS-84 longitude of the pickup location, in degrees. -180 to 180 degrees (negative values
         * west of Prime Meridian).
         */
        fun pickupLon(pickupLon: Double) = pickupLon(JsonField.of(pickupLon))

        /**
         * Sets [Builder.pickupLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pickupLon] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pickupLon(pickupLon: JsonField<Double>) = apply { this.pickupLon = pickupLon }

        /** The request time, in ISO 8601 UTC format. */
        fun reqTime(reqTime: OffsetDateTime) = reqTime(JsonField.of(reqTime))

        /**
         * Sets [Builder.reqTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reqTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reqTime(reqTime: JsonField<OffsetDateTime>) = apply { this.reqTime = reqTime }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** The type of this medevac record (REQUEST, RESPONSE). */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Identity and medical information on the patient to be evacuated. */
        fun casualtyInfo(casualtyInfo: List<CasualtyInfo>) =
            casualtyInfo(JsonField.of(casualtyInfo))

        /**
         * Sets [Builder.casualtyInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.casualtyInfo] with a well-typed `List<CasualtyInfo>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun casualtyInfo(casualtyInfo: JsonField<List<CasualtyInfo>>) = apply {
            this.casualtyInfo = casualtyInfo.map { it.toMutableList() }
        }

        /**
         * Adds a single [CasualtyInfo] to [Builder.casualtyInfo].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCasualtyInfo(casualtyInfo: CasualtyInfo) = apply {
            this.casualtyInfo =
                (this.casualtyInfo ?: JsonField.of(mutableListOf())).also {
                    checkKnown("casualtyInfo", it).add(casualtyInfo)
                }
        }

        /**
         * Radius of circular area about lat/lon point, in meters (1-sigma, if representing error).
         */
        fun ce(ce: Double) = ce(JsonField.of(ce))

        /**
         * Sets [Builder.ce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ce] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ce(ce: JsonField<Double>) = apply { this.ce = ce }

        /** The contact frequency, in Hz, of the agency or zone controller. */
        fun cntctFreq(cntctFreq: Double) = cntctFreq(JsonField.of(cntctFreq))

        /**
         * Sets [Builder.cntctFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cntctFreq] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cntctFreq(cntctFreq: JsonField<Double>) = apply { this.cntctFreq = cntctFreq }

        /** Additional comments for the medevac mission. */
        fun comments(comments: String) = comments(JsonField.of(comments))

        /**
         * Sets [Builder.comments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comments] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comments(comments: JsonField<String>) = apply { this.comments = comments }

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

        /** Data defining any enemy intelligence reported by the requestor. */
        fun enemyData(enemyData: List<EnemyData>) = enemyData(JsonField.of(enemyData))

        /**
         * Sets [Builder.enemyData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enemyData] with a well-typed `List<EnemyData>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enemyData(enemyData: JsonField<List<EnemyData>>) = apply {
            this.enemyData = enemyData.map { it.toMutableList() }
        }

        /**
         * Adds a single [EnemyData] to [Builder.enemyData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnemyData(enemyData: EnemyData) = apply {
            this.enemyData =
                (this.enemyData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("enemyData", it).add(enemyData)
                }
        }

        /** Unique identifier of a weather report associated with this evacuation. */
        fun idWeatherReport(idWeatherReport: String) =
            idWeatherReport(JsonField.of(idWeatherReport))

        /**
         * Sets [Builder.idWeatherReport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idWeatherReport] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idWeatherReport(idWeatherReport: JsonField<String>) = apply {
            this.idWeatherReport = idWeatherReport
        }

        /** Height above lat/lon point, in meters (1-sigma, if representing linear error). */
        fun le(le: Double) = le(JsonField.of(le))

        /**
         * Sets [Builder.le] to an arbitrary JSON value.
         *
         * You should usually call [Builder.le] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun le(le: JsonField<Double>) = apply { this.le = le }

        /**
         * UUID identifying the medevac mission, which should remain the same on subsequent posts
         * related to the same medevac mission.
         */
        fun medevacId(medevacId: String) = medevacId(JsonField.of(medevacId))

        /**
         * Sets [Builder.medevacId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medevacId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun medevacId(medevacId: JsonField<String>) = apply { this.medevacId = medevacId }

        /** Flag indicating whether the mission requires medical personnel. */
        fun medicReq(medicReq: Boolean) = medicReq(JsonField.of(medicReq))

        /**
         * Sets [Builder.medicReq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medicReq] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun medicReq(medicReq: JsonField<Boolean>) = apply { this.medicReq = medicReq }

        /** The operation type of the evacuation. (NOT SPECIFIED, AIR, GROUND, SURFACE). */
        fun missionType(missionType: String) = missionType(JsonField.of(missionType))

        /**
         * Sets [Builder.missionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missionType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun missionType(missionType: JsonField<String>) = apply { this.missionType = missionType }

        /** Number of ambulatory personnel requiring evacuation. */
        fun numAmbulatory(numAmbulatory: Int) = numAmbulatory(JsonField.of(numAmbulatory))

        /**
         * Sets [Builder.numAmbulatory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numAmbulatory] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numAmbulatory(numAmbulatory: JsonField<Int>) = apply {
            this.numAmbulatory = numAmbulatory
        }

        /** The count of people requiring medevac. */
        fun numCasualties(numCasualties: Int) = numCasualties(JsonField.of(numCasualties))

        /**
         * Sets [Builder.numCasualties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numCasualties] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numCasualties(numCasualties: JsonField<Int>) = apply {
            this.numCasualties = numCasualties
        }

        /** Number of people Killed In Action. */
        fun numKia(numKia: Int) = numKia(JsonField.of(numKia))

        /**
         * Sets [Builder.numKia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numKia] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numKia(numKia: JsonField<Int>) = apply { this.numKia = numKia }

        /** Number of littered personnel requiring evacuation. */
        fun numLitter(numLitter: Int) = numLitter(JsonField.of(numLitter))

        /**
         * Sets [Builder.numLitter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numLitter] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numLitter(numLitter: JsonField<Int>) = apply { this.numLitter = numLitter }

        /** Number of people Wounded In Action. */
        fun numWia(numWia: Int) = numWia(JsonField.of(numWia))

        /**
         * Sets [Builder.numWia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numWia] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numWia(numWia: JsonField<Int>) = apply { this.numWia = numWia }

        /** Amplifying data for the terrain describing important obstacles in or around the zone. */
        fun obstaclesRemarks(obstaclesRemarks: String) =
            obstaclesRemarks(JsonField.of(obstaclesRemarks))

        /**
         * Sets [Builder.obstaclesRemarks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obstaclesRemarks] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun obstaclesRemarks(obstaclesRemarks: JsonField<String>) = apply {
            this.obstaclesRemarks = obstaclesRemarks
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
         * Altitude relative to WGS-84 ellipsoid, in meters. Positive values indicate a point height
         * above ellipsoid, and negative values indicate a point height below ellipsoid.
         */
        fun pickupAlt(pickupAlt: Double) = pickupAlt(JsonField.of(pickupAlt))

        /**
         * Sets [Builder.pickupAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pickupAlt] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pickupAlt(pickupAlt: JsonField<Double>) = apply { this.pickupAlt = pickupAlt }

        /** The expected pickup time, in ISO 8601 UTC format. */
        fun pickupTime(pickupTime: OffsetDateTime) = pickupTime(JsonField.of(pickupTime))

        /**
         * Sets [Builder.pickupTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pickupTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pickupTime(pickupTime: JsonField<OffsetDateTime>) = apply {
            this.pickupTime = pickupTime
        }

        /** Related document ids. */
        fun relatedDocs(relatedDocs: List<RelatedDocumentFull>) =
            relatedDocs(JsonField.of(relatedDocs))

        /**
         * Sets [Builder.relatedDocs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relatedDocs] with a well-typed
         * `List<RelatedDocumentFull>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun relatedDocs(relatedDocs: JsonField<List<RelatedDocumentFull>>) = apply {
            this.relatedDocs = relatedDocs.map { it.toMutableList() }
        }

        /**
         * Adds a single [RelatedDocumentFull] to [relatedDocs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRelatedDoc(relatedDoc: RelatedDocumentFull) = apply {
            relatedDocs =
                (relatedDocs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("relatedDocs", it).add(relatedDoc)
                }
        }

        /** The call sign of this medevac requestor. */
        fun reqCallSign(reqCallSign: String) = reqCallSign(JsonField.of(reqCallSign))

        /**
         * Sets [Builder.reqCallSign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reqCallSign] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reqCallSign(reqCallSign: JsonField<String>) = apply { this.reqCallSign = reqCallSign }

        /** Externally provided Medevac request number (e.g. MED.1.223908). */
        fun reqNum(reqNum: String) = reqNum(JsonField.of(reqNum))

        /**
         * Sets [Builder.reqNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reqNum] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reqNum(reqNum: JsonField<String>) = apply { this.reqNum = reqNum }

        /**
         * Short description of the terrain features of the pickup location (WOODS, TREES, PLOWED
         * FIELDS, FLAT, STANDING WATER, MARSH, URBAN BUILT-UP AREA, MOUNTAIN, HILL, SAND TD, ROCKY,
         * VALLEY, METAMORPHIC ICE, UNKNOWN TD, SEA, NO STATEMENT).
         */
        fun terrain(terrain: String) = terrain(JsonField.of(terrain))

        /**
         * Sets [Builder.terrain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.terrain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun terrain(terrain: JsonField<String>) = apply { this.terrain = terrain }

        /** Amplifying data for the terrain describing any notable additional terrain features. */
        fun terrainRemarks(terrainRemarks: String) = terrainRemarks(JsonField.of(terrainRemarks))

        /**
         * Sets [Builder.terrainRemarks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.terrainRemarks] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun terrainRemarks(terrainRemarks: JsonField<String>) = apply {
            this.terrainRemarks = terrainRemarks
        }

        /** The call sign of the zone controller. */
        fun zoneContrCallSign(zoneContrCallSign: String) =
            zoneContrCallSign(JsonField.of(zoneContrCallSign))

        /**
         * Sets [Builder.zoneContrCallSign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zoneContrCallSign] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun zoneContrCallSign(zoneContrCallSign: JsonField<String>) = apply {
            this.zoneContrCallSign = zoneContrCallSign
        }

        /** Flag indicating that the pickup site is hot and hostiles are in the area. */
        fun zoneHot(zoneHot: Boolean) = zoneHot(JsonField.of(zoneHot))

        /**
         * Sets [Builder.zoneHot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zoneHot] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zoneHot(zoneHot: JsonField<Boolean>) = apply { this.zoneHot = zoneHot }

        /**
         * The expected marker identifying the pickup site (SMOKE ZONE MARKING, FLARES, MIRROR,
         * GLIDE ANGLE INDICATOR LIGHT, LIGHT ZONE MARKING, PANELS, FIRE, LASER DESIGNATOR, STROBE
         * LIGHTS, VEHICLE LIGHTS, COLORED SMOKE, WHITE PHOSPHERUS, INFRARED, ILLUMINATION,
         * FRATRICIDE FENCE).
         */
        fun zoneMarking(zoneMarking: String) = zoneMarking(JsonField.of(zoneMarking))

        /**
         * Sets [Builder.zoneMarking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zoneMarking] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun zoneMarking(zoneMarking: JsonField<String>) = apply { this.zoneMarking = zoneMarking }

        /**
         * Color used for the pickup site marking (RED, WHITE, BLUE, YELLOW, GREEN, ORANGE, BLACK,
         * PURPLE, BROWN, TAN, GRAY, SILVER, CAMOUFLAGE, OTHER COLOR).
         */
        fun zoneMarkingColor(zoneMarkingColor: String) =
            zoneMarkingColor(JsonField.of(zoneMarkingColor))

        /**
         * Sets [Builder.zoneMarkingColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zoneMarkingColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun zoneMarkingColor(zoneMarkingColor: JsonField<String>) = apply {
            this.zoneMarkingColor = zoneMarkingColor
        }

        /** The name of the zone. */
        fun zoneName(zoneName: String) = zoneName(JsonField.of(zoneName))

        /**
         * Sets [Builder.zoneName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zoneName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zoneName(zoneName: JsonField<String>) = apply { this.zoneName = zoneName }

        /**
         * The pickup site security (UNKNOWN ZONESECURITY, NO ENEMY, POSSIBLE ENEMY, ENEMY IN AREA
         * USE CAUTION, ENEMY IN AREA ARMED ESCORT REQUIRED).
         */
        fun zoneSecurity(zoneSecurity: String) = zoneSecurity(JsonField.of(zoneSecurity))

        /**
         * Sets [Builder.zoneSecurity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zoneSecurity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun zoneSecurity(zoneSecurity: JsonField<String>) = apply {
            this.zoneSecurity = zoneSecurity
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
         * Returns an immutable instance of [EvacFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .pickupLat()
         * .pickupLon()
         * .reqTime()
         * .source()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EvacFull =
            EvacFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("pickupLat", pickupLat),
                checkRequired("pickupLon", pickupLon),
                checkRequired("reqTime", reqTime),
                checkRequired("source", source),
                checkRequired("type", type),
                id,
                (casualtyInfo ?: JsonMissing.of()).map { it.toImmutable() },
                ce,
                cntctFreq,
                comments,
                createdAt,
                createdBy,
                (enemyData ?: JsonMissing.of()).map { it.toImmutable() },
                idWeatherReport,
                le,
                medevacId,
                medicReq,
                missionType,
                numAmbulatory,
                numCasualties,
                numKia,
                numLitter,
                numWia,
                obstaclesRemarks,
                origin,
                origNetwork,
                pickupAlt,
                pickupTime,
                (relatedDocs ?: JsonMissing.of()).map { it.toImmutable() },
                reqCallSign,
                reqNum,
                terrain,
                terrainRemarks,
                zoneContrCallSign,
                zoneHot,
                zoneMarking,
                zoneMarkingColor,
                zoneName,
                zoneSecurity,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EvacFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        pickupLat()
        pickupLon()
        reqTime()
        source()
        type().validate()
        id()
        casualtyInfo().ifPresent { it.forEach { it.validate() } }
        ce()
        cntctFreq()
        comments()
        createdAt()
        createdBy()
        enemyData().ifPresent { it.forEach { it.validate() } }
        idWeatherReport()
        le()
        medevacId()
        medicReq()
        missionType()
        numAmbulatory()
        numCasualties()
        numKia()
        numLitter()
        numWia()
        obstaclesRemarks()
        origin()
        origNetwork()
        pickupAlt()
        pickupTime()
        relatedDocs().ifPresent { it.forEach { it.validate() } }
        reqCallSign()
        reqNum()
        terrain()
        terrainRemarks()
        zoneContrCallSign()
        zoneHot()
        zoneMarking()
        zoneMarkingColor()
        zoneName()
        zoneSecurity()
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
            (if (pickupLat.asKnown().isPresent) 1 else 0) +
            (if (pickupLon.asKnown().isPresent) 1 else 0) +
            (if (reqTime.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (casualtyInfo.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (ce.asKnown().isPresent) 1 else 0) +
            (if (cntctFreq.asKnown().isPresent) 1 else 0) +
            (if (comments.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (enemyData.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (idWeatherReport.asKnown().isPresent) 1 else 0) +
            (if (le.asKnown().isPresent) 1 else 0) +
            (if (medevacId.asKnown().isPresent) 1 else 0) +
            (if (medicReq.asKnown().isPresent) 1 else 0) +
            (if (missionType.asKnown().isPresent) 1 else 0) +
            (if (numAmbulatory.asKnown().isPresent) 1 else 0) +
            (if (numCasualties.asKnown().isPresent) 1 else 0) +
            (if (numKia.asKnown().isPresent) 1 else 0) +
            (if (numLitter.asKnown().isPresent) 1 else 0) +
            (if (numWia.asKnown().isPresent) 1 else 0) +
            (if (obstaclesRemarks.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (pickupAlt.asKnown().isPresent) 1 else 0) +
            (if (pickupTime.asKnown().isPresent) 1 else 0) +
            (relatedDocs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (reqCallSign.asKnown().isPresent) 1 else 0) +
            (if (reqNum.asKnown().isPresent) 1 else 0) +
            (if (terrain.asKnown().isPresent) 1 else 0) +
            (if (terrainRemarks.asKnown().isPresent) 1 else 0) +
            (if (zoneContrCallSign.asKnown().isPresent) 1 else 0) +
            (if (zoneHot.asKnown().isPresent) 1 else 0) +
            (if (zoneMarking.asKnown().isPresent) 1 else 0) +
            (if (zoneMarkingColor.asKnown().isPresent) 1 else 0) +
            (if (zoneName.asKnown().isPresent) 1 else 0) +
            (if (zoneSecurity.asKnown().isPresent) 1 else 0)

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

    /** The type of this medevac record (REQUEST, RESPONSE). */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val REQUEST = of("REQUEST")

            @JvmField val RESPONSE = of("RESPONSE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            REQUEST,
            RESPONSE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REQUEST,
            RESPONSE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                REQUEST -> Value.REQUEST
                RESPONSE -> Value.RESPONSE
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
                REQUEST -> Known.REQUEST
                RESPONSE -> Known.RESPONSE
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class CasualtyInfo
    private constructor(
        private val age: JsonField<Int>,
        private val allergy: JsonField<List<Allergy>>,
        private val bloodType: JsonField<String>,
        private val bodyPart: JsonField<String>,
        private val burialLocation: JsonField<List<Double>>,
        private val callSign: JsonField<String>,
        private val careProviderUrn: JsonField<String>,
        private val casualtyKey: JsonField<String>,
        private val casualtyType: JsonField<String>,
        private val collectionPoint: JsonField<List<Double>>,
        private val comments: JsonField<String>,
        private val condition: JsonField<List<Condition>>,
        private val contamType: JsonField<String>,
        private val disposition: JsonField<String>,
        private val dispositionType: JsonField<String>,
        private val etiology: JsonField<List<Etiology>>,
        private val evacType: JsonField<String>,
        private val gender: JsonField<String>,
        private val healthState: JsonField<List<HealthState>>,
        private val injury: JsonField<List<Injury>>,
        private val last4Ssn: JsonField<String>,
        private val medication: JsonField<List<Medication>>,
        private val name: JsonField<String>,
        private val nationality: JsonField<String>,
        private val occSpeciality: JsonField<String>,
        private val patientIdentity: JsonField<String>,
        private val patientStatus: JsonField<String>,
        private val payGrade: JsonField<String>,
        private val priority: JsonField<String>,
        private val reportGen: JsonField<String>,
        private val reportTime: JsonField<OffsetDateTime>,
        private val service: JsonField<String>,
        private val specMedEquip: JsonField<List<String>>,
        private val treatment: JsonField<List<Treatment>>,
        private val vitalSignData: JsonField<List<VitalSignData>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("age") @ExcludeMissing age: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("allergy")
            @ExcludeMissing
            allergy: JsonField<List<Allergy>> = JsonMissing.of(),
            @JsonProperty("bloodType")
            @ExcludeMissing
            bloodType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bodyPart")
            @ExcludeMissing
            bodyPart: JsonField<String> = JsonMissing.of(),
            @JsonProperty("burialLocation")
            @ExcludeMissing
            burialLocation: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("callSign")
            @ExcludeMissing
            callSign: JsonField<String> = JsonMissing.of(),
            @JsonProperty("careProviderUrn")
            @ExcludeMissing
            careProviderUrn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("casualtyKey")
            @ExcludeMissing
            casualtyKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("casualtyType")
            @ExcludeMissing
            casualtyType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("collectionPoint")
            @ExcludeMissing
            collectionPoint: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("comments")
            @ExcludeMissing
            comments: JsonField<String> = JsonMissing.of(),
            @JsonProperty("condition")
            @ExcludeMissing
            condition: JsonField<List<Condition>> = JsonMissing.of(),
            @JsonProperty("contamType")
            @ExcludeMissing
            contamType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("disposition")
            @ExcludeMissing
            disposition: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dispositionType")
            @ExcludeMissing
            dispositionType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("etiology")
            @ExcludeMissing
            etiology: JsonField<List<Etiology>> = JsonMissing.of(),
            @JsonProperty("evacType")
            @ExcludeMissing
            evacType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gender") @ExcludeMissing gender: JsonField<String> = JsonMissing.of(),
            @JsonProperty("healthState")
            @ExcludeMissing
            healthState: JsonField<List<HealthState>> = JsonMissing.of(),
            @JsonProperty("injury")
            @ExcludeMissing
            injury: JsonField<List<Injury>> = JsonMissing.of(),
            @JsonProperty("last4SSN")
            @ExcludeMissing
            last4Ssn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("medication")
            @ExcludeMissing
            medication: JsonField<List<Medication>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nationality")
            @ExcludeMissing
            nationality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("occSpeciality")
            @ExcludeMissing
            occSpeciality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("patientIdentity")
            @ExcludeMissing
            patientIdentity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("patientStatus")
            @ExcludeMissing
            patientStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payGrade")
            @ExcludeMissing
            payGrade: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reportGen")
            @ExcludeMissing
            reportGen: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reportTime")
            @ExcludeMissing
            reportTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("service") @ExcludeMissing service: JsonField<String> = JsonMissing.of(),
            @JsonProperty("specMedEquip")
            @ExcludeMissing
            specMedEquip: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("treatment")
            @ExcludeMissing
            treatment: JsonField<List<Treatment>> = JsonMissing.of(),
            @JsonProperty("vitalSignData")
            @ExcludeMissing
            vitalSignData: JsonField<List<VitalSignData>> = JsonMissing.of(),
        ) : this(
            age,
            allergy,
            bloodType,
            bodyPart,
            burialLocation,
            callSign,
            careProviderUrn,
            casualtyKey,
            casualtyType,
            collectionPoint,
            comments,
            condition,
            contamType,
            disposition,
            dispositionType,
            etiology,
            evacType,
            gender,
            healthState,
            injury,
            last4Ssn,
            medication,
            name,
            nationality,
            occSpeciality,
            patientIdentity,
            patientStatus,
            payGrade,
            priority,
            reportGen,
            reportTime,
            service,
            specMedEquip,
            treatment,
            vitalSignData,
            mutableMapOf(),
        )

        /**
         * The patient age, in years.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun age(): Optional<Int> = age.getOptional("age")

        /**
         * Allergy information.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun allergy(): Optional<List<Allergy>> = allergy.getOptional("allergy")

        /**
         * The patient blood type (A POS, B POS, AB POS, O POS, A NEG, B NEG, AB NEG, O NEG).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bloodType(): Optional<String> = bloodType.getOptional("bloodType")

        /**
         * The body part involved for the patient (HEAD, NECK, ABDOMEN, UPPER EXTREMITIES, BACK,
         * FACE, LOWER EXTREMITIES, FRONT, OBSTETRICAL GYNECOLOGICAL, OTHER BODY PART).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bodyPart(): Optional<String> = bodyPart.getOptional("bodyPart")

        /**
         * Array of the WGS-84 latitude (-90 to 90, negative values south of the equator) in
         * degrees, longitude (-180 to 180, negative values west of Prime Meridian) in degrees, and
         * altitude, in meters, of the burial location. This array must contain a minimum of 2
         * elements (latitude and longitude), and may contain an optional 3rd element (altitude).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun burialLocation(): Optional<List<Double>> = burialLocation.getOptional("burialLocation")

        /**
         * The call sign of this patient.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun callSign(): Optional<String> = callSign.getOptional("callSign")

        /**
         * Unique identifier for the patient care provider.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun careProviderUrn(): Optional<String> = careProviderUrn.getOptional("careProviderUrn")

        /**
         * Optional casualty key.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun casualtyKey(): Optional<String> = casualtyKey.getOptional("casualtyKey")

        /**
         * The type of medical issue resulting in the need to evacuate the patient (NON BATTLE, CUT,
         * BURN, SICK, FRACTURE, AMPUTATION, PERFORATION, NUCLEAR, EXHAUSTION, BIOLOGICAL, CHEMICAL,
         * SHOCK, PUNCTURE WOUND, OTHER CUT, WOUNDED IN ACTION, DENIAL, COMBAT STRESS).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun casualtyType(): Optional<String> = casualtyType.getOptional("casualtyType")

        /**
         * Array of the WGS-84 latitude (-90 to 90, negative values south of the equator) in
         * degrees, longitude (-180 to 180, negative values west of Prime Meridian) in degrees, and
         * altitude, in meters, of the collection point. This array must contain a minimum of 2
         * elements (latitude and longitude), and may contain an optional 3rd element (altitude).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun collectionPoint(): Optional<List<Double>> =
            collectionPoint.getOptional("collectionPoint")

        /**
         * Additional comments on the patient's casualty information.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun comments(): Optional<String> = comments.getOptional("comments")

        /**
         * Health condition information.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun condition(): Optional<List<Condition>> = condition.getOptional("condition")

        /**
         * The contamination specified for the patient (NONE, RADIATION, BIOLOGICAL, CHEMICAL).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun contamType(): Optional<String> = contamType.getOptional("contamType")

        /**
         * The patient's general medical state (SICK IN QUARTERS, RETURN TO DUTY, EVACUATE WOUNDED,
         * EVACUATE DECEASED, INTERRED).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun disposition(): Optional<String> = disposition.getOptional("disposition")

        /**
         * The expected disposition of this patient (R T D, EVACUATE, EVACUATE TO FORWARD SURGICAL
         * TEAM, EVACUATE TO COMBAT SUPPORT HOSPITAL, EVACUATE TO AERO MEDICAL STAGING FACILITY,
         * EVACUATE TO SUSTAINING BASE MEDICAL TREATMENT FACILITY).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dispositionType(): Optional<String> = dispositionType.getOptional("dispositionType")

        /**
         * Medical condition causation information.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun etiology(): Optional<List<Etiology>> = etiology.getOptional("etiology")

        /**
         * The required evacuation method for this patient (AIR, GROUND, NOT EVACUATED).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun evacType(): Optional<String> = evacType.getOptional("evacType")

        /**
         * The patient sex (MALE, FEMALE).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun gender(): Optional<String> = gender.getOptional("gender")

        /**
         * Health state information.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun healthState(): Optional<List<HealthState>> = healthState.getOptional("healthState")

        /**
         * Injury specifics.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun injury(): Optional<List<Injury>> = injury.getOptional("injury")

        /**
         * Last 4 characters of the patient social security code, or equivalent.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun last4Ssn(): Optional<String> = last4Ssn.getOptional("last4SSN")

        /**
         * Medication specifics.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun medication(): Optional<List<Medication>> = medication.getOptional("medication")

        /**
         * The patient common or legal name.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The country code indicating the citizenship of the patient.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun nationality(): Optional<String> = nationality.getOptional("nationality")

        /**
         * The career field of this patient.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun occSpeciality(): Optional<String> = occSpeciality.getOptional("occSpeciality")

        /**
         * The patient service identity (UNKNOWN MILITARY, UNKNOWN CIVILIAN, FRIEND MILITARY, FRIEND
         * CIVILIAN, NEUTRAL MILITARY, NEUTRAL CIVILIAN, HOSTILE MILITARY, HOSTILE CIVILIAN).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun patientIdentity(): Optional<String> = patientIdentity.getOptional("patientIdentity")

        /**
         * The patient service status (US MILITARY, US CIVILIAN, NON US MILITARY, NON US CIVILIAN,
         * ENEMY POW).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun patientStatus(): Optional<String> = patientStatus.getOptional("patientStatus")

        /**
         * The patient pay grade or rank designation (O-10, O-9, O-8, O-7, O-6, O-5, O-4, O-3, O-2,
         * O-1, CWO-5, CWO-4, CWO-2, CWO-1, E -9, E-8, E-7, E-6, E-5, E-4, E-3, E-2, E-1, NONE,
         * CIVILIAN).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun payGrade(): Optional<String> = payGrade.getOptional("payGrade")

        /**
         * The priority of the medevac mission for this patient (URGENT, PRIORITY, ROUTINE, URGENT
         * SURGERY, CONVENIENCE).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun priority(): Optional<String> = priority.getOptional("priority")

        /**
         * The method used to generate this medevac report (DEVICE, GROUND COMBAT PERSONNEL,
         * EVACUATION PERSONNEL, ECHELON1 PERSONNEL, ECHELON2 PERSONNEL).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun reportGen(): Optional<String> = reportGen.getOptional("reportGen")

        /**
         * Datetime of the compiling of the patients casualty report, in ISO 8601 UTC format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun reportTime(): Optional<OffsetDateTime> = reportTime.getOptional("reportTime")

        /**
         * The patient branch of service (AIR FORCE, ARMY, NAVY, MARINES, CIV, CONTR, UNKNOWN
         * SERVICE).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun service(): Optional<String> = service.getOptional("service")

        /**
         * Array specifying if any special equipment is need for each of the evacuation of this
         * patient (EXTRACTION EQUIPMENT, SEMI RIGID LITTER, BACKBOARD, CERVICAL COLLAR ,JUNGLE
         * PENETRATOR, OXYGEN, WHOLE BLOOD, VENTILATOR, HOIST, NONE).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun specMedEquip(): Optional<List<String>> = specMedEquip.getOptional("specMedEquip")

        /**
         * Treatment information.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun treatment(): Optional<List<Treatment>> = treatment.getOptional("treatment")

        /**
         * Information obtained for vital signs.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun vitalSignData(): Optional<List<VitalSignData>> =
            vitalSignData.getOptional("vitalSignData")

        /**
         * Returns the raw JSON value of [age].
         *
         * Unlike [age], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("age") @ExcludeMissing fun _age(): JsonField<Int> = age

        /**
         * Returns the raw JSON value of [allergy].
         *
         * Unlike [allergy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("allergy") @ExcludeMissing fun _allergy(): JsonField<List<Allergy>> = allergy

        /**
         * Returns the raw JSON value of [bloodType].
         *
         * Unlike [bloodType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bloodType") @ExcludeMissing fun _bloodType(): JsonField<String> = bloodType

        /**
         * Returns the raw JSON value of [bodyPart].
         *
         * Unlike [bodyPart], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bodyPart") @ExcludeMissing fun _bodyPart(): JsonField<String> = bodyPart

        /**
         * Returns the raw JSON value of [burialLocation].
         *
         * Unlike [burialLocation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("burialLocation")
        @ExcludeMissing
        fun _burialLocation(): JsonField<List<Double>> = burialLocation

        /**
         * Returns the raw JSON value of [callSign].
         *
         * Unlike [callSign], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callSign") @ExcludeMissing fun _callSign(): JsonField<String> = callSign

        /**
         * Returns the raw JSON value of [careProviderUrn].
         *
         * Unlike [careProviderUrn], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("careProviderUrn")
        @ExcludeMissing
        fun _careProviderUrn(): JsonField<String> = careProviderUrn

        /**
         * Returns the raw JSON value of [casualtyKey].
         *
         * Unlike [casualtyKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("casualtyKey")
        @ExcludeMissing
        fun _casualtyKey(): JsonField<String> = casualtyKey

        /**
         * Returns the raw JSON value of [casualtyType].
         *
         * Unlike [casualtyType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("casualtyType")
        @ExcludeMissing
        fun _casualtyType(): JsonField<String> = casualtyType

        /**
         * Returns the raw JSON value of [collectionPoint].
         *
         * Unlike [collectionPoint], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("collectionPoint")
        @ExcludeMissing
        fun _collectionPoint(): JsonField<List<Double>> = collectionPoint

        /**
         * Returns the raw JSON value of [comments].
         *
         * Unlike [comments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<String> = comments

        /**
         * Returns the raw JSON value of [condition].
         *
         * Unlike [condition], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("condition")
        @ExcludeMissing
        fun _condition(): JsonField<List<Condition>> = condition

        /**
         * Returns the raw JSON value of [contamType].
         *
         * Unlike [contamType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contamType")
        @ExcludeMissing
        fun _contamType(): JsonField<String> = contamType

        /**
         * Returns the raw JSON value of [disposition].
         *
         * Unlike [disposition], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("disposition")
        @ExcludeMissing
        fun _disposition(): JsonField<String> = disposition

        /**
         * Returns the raw JSON value of [dispositionType].
         *
         * Unlike [dispositionType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dispositionType")
        @ExcludeMissing
        fun _dispositionType(): JsonField<String> = dispositionType

        /**
         * Returns the raw JSON value of [etiology].
         *
         * Unlike [etiology], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("etiology")
        @ExcludeMissing
        fun _etiology(): JsonField<List<Etiology>> = etiology

        /**
         * Returns the raw JSON value of [evacType].
         *
         * Unlike [evacType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("evacType") @ExcludeMissing fun _evacType(): JsonField<String> = evacType

        /**
         * Returns the raw JSON value of [gender].
         *
         * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<String> = gender

        /**
         * Returns the raw JSON value of [healthState].
         *
         * Unlike [healthState], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("healthState")
        @ExcludeMissing
        fun _healthState(): JsonField<List<HealthState>> = healthState

        /**
         * Returns the raw JSON value of [injury].
         *
         * Unlike [injury], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("injury") @ExcludeMissing fun _injury(): JsonField<List<Injury>> = injury

        /**
         * Returns the raw JSON value of [last4Ssn].
         *
         * Unlike [last4Ssn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last4SSN") @ExcludeMissing fun _last4Ssn(): JsonField<String> = last4Ssn

        /**
         * Returns the raw JSON value of [medication].
         *
         * Unlike [medication], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("medication")
        @ExcludeMissing
        fun _medication(): JsonField<List<Medication>> = medication

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [nationality].
         *
         * Unlike [nationality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nationality")
        @ExcludeMissing
        fun _nationality(): JsonField<String> = nationality

        /**
         * Returns the raw JSON value of [occSpeciality].
         *
         * Unlike [occSpeciality], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("occSpeciality")
        @ExcludeMissing
        fun _occSpeciality(): JsonField<String> = occSpeciality

        /**
         * Returns the raw JSON value of [patientIdentity].
         *
         * Unlike [patientIdentity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("patientIdentity")
        @ExcludeMissing
        fun _patientIdentity(): JsonField<String> = patientIdentity

        /**
         * Returns the raw JSON value of [patientStatus].
         *
         * Unlike [patientStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("patientStatus")
        @ExcludeMissing
        fun _patientStatus(): JsonField<String> = patientStatus

        /**
         * Returns the raw JSON value of [payGrade].
         *
         * Unlike [payGrade], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payGrade") @ExcludeMissing fun _payGrade(): JsonField<String> = payGrade

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<String> = priority

        /**
         * Returns the raw JSON value of [reportGen].
         *
         * Unlike [reportGen], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reportGen") @ExcludeMissing fun _reportGen(): JsonField<String> = reportGen

        /**
         * Returns the raw JSON value of [reportTime].
         *
         * Unlike [reportTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reportTime")
        @ExcludeMissing
        fun _reportTime(): JsonField<OffsetDateTime> = reportTime

        /**
         * Returns the raw JSON value of [service].
         *
         * Unlike [service], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<String> = service

        /**
         * Returns the raw JSON value of [specMedEquip].
         *
         * Unlike [specMedEquip], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("specMedEquip")
        @ExcludeMissing
        fun _specMedEquip(): JsonField<List<String>> = specMedEquip

        /**
         * Returns the raw JSON value of [treatment].
         *
         * Unlike [treatment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("treatment")
        @ExcludeMissing
        fun _treatment(): JsonField<List<Treatment>> = treatment

        /**
         * Returns the raw JSON value of [vitalSignData].
         *
         * Unlike [vitalSignData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vitalSignData")
        @ExcludeMissing
        fun _vitalSignData(): JsonField<List<VitalSignData>> = vitalSignData

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

            /** Returns a mutable builder for constructing an instance of [CasualtyInfo]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CasualtyInfo]. */
        class Builder internal constructor() {

            private var age: JsonField<Int> = JsonMissing.of()
            private var allergy: JsonField<MutableList<Allergy>>? = null
            private var bloodType: JsonField<String> = JsonMissing.of()
            private var bodyPart: JsonField<String> = JsonMissing.of()
            private var burialLocation: JsonField<MutableList<Double>>? = null
            private var callSign: JsonField<String> = JsonMissing.of()
            private var careProviderUrn: JsonField<String> = JsonMissing.of()
            private var casualtyKey: JsonField<String> = JsonMissing.of()
            private var casualtyType: JsonField<String> = JsonMissing.of()
            private var collectionPoint: JsonField<MutableList<Double>>? = null
            private var comments: JsonField<String> = JsonMissing.of()
            private var condition: JsonField<MutableList<Condition>>? = null
            private var contamType: JsonField<String> = JsonMissing.of()
            private var disposition: JsonField<String> = JsonMissing.of()
            private var dispositionType: JsonField<String> = JsonMissing.of()
            private var etiology: JsonField<MutableList<Etiology>>? = null
            private var evacType: JsonField<String> = JsonMissing.of()
            private var gender: JsonField<String> = JsonMissing.of()
            private var healthState: JsonField<MutableList<HealthState>>? = null
            private var injury: JsonField<MutableList<Injury>>? = null
            private var last4Ssn: JsonField<String> = JsonMissing.of()
            private var medication: JsonField<MutableList<Medication>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var nationality: JsonField<String> = JsonMissing.of()
            private var occSpeciality: JsonField<String> = JsonMissing.of()
            private var patientIdentity: JsonField<String> = JsonMissing.of()
            private var patientStatus: JsonField<String> = JsonMissing.of()
            private var payGrade: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<String> = JsonMissing.of()
            private var reportGen: JsonField<String> = JsonMissing.of()
            private var reportTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var service: JsonField<String> = JsonMissing.of()
            private var specMedEquip: JsonField<MutableList<String>>? = null
            private var treatment: JsonField<MutableList<Treatment>>? = null
            private var vitalSignData: JsonField<MutableList<VitalSignData>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(casualtyInfo: CasualtyInfo) = apply {
                age = casualtyInfo.age
                allergy = casualtyInfo.allergy.map { it.toMutableList() }
                bloodType = casualtyInfo.bloodType
                bodyPart = casualtyInfo.bodyPart
                burialLocation = casualtyInfo.burialLocation.map { it.toMutableList() }
                callSign = casualtyInfo.callSign
                careProviderUrn = casualtyInfo.careProviderUrn
                casualtyKey = casualtyInfo.casualtyKey
                casualtyType = casualtyInfo.casualtyType
                collectionPoint = casualtyInfo.collectionPoint.map { it.toMutableList() }
                comments = casualtyInfo.comments
                condition = casualtyInfo.condition.map { it.toMutableList() }
                contamType = casualtyInfo.contamType
                disposition = casualtyInfo.disposition
                dispositionType = casualtyInfo.dispositionType
                etiology = casualtyInfo.etiology.map { it.toMutableList() }
                evacType = casualtyInfo.evacType
                gender = casualtyInfo.gender
                healthState = casualtyInfo.healthState.map { it.toMutableList() }
                injury = casualtyInfo.injury.map { it.toMutableList() }
                last4Ssn = casualtyInfo.last4Ssn
                medication = casualtyInfo.medication.map { it.toMutableList() }
                name = casualtyInfo.name
                nationality = casualtyInfo.nationality
                occSpeciality = casualtyInfo.occSpeciality
                patientIdentity = casualtyInfo.patientIdentity
                patientStatus = casualtyInfo.patientStatus
                payGrade = casualtyInfo.payGrade
                priority = casualtyInfo.priority
                reportGen = casualtyInfo.reportGen
                reportTime = casualtyInfo.reportTime
                service = casualtyInfo.service
                specMedEquip = casualtyInfo.specMedEquip.map { it.toMutableList() }
                treatment = casualtyInfo.treatment.map { it.toMutableList() }
                vitalSignData = casualtyInfo.vitalSignData.map { it.toMutableList() }
                additionalProperties = casualtyInfo.additionalProperties.toMutableMap()
            }

            /** The patient age, in years. */
            fun age(age: Int) = age(JsonField.of(age))

            /**
             * Sets [Builder.age] to an arbitrary JSON value.
             *
             * You should usually call [Builder.age] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun age(age: JsonField<Int>) = apply { this.age = age }

            /** Allergy information. */
            fun allergy(allergy: List<Allergy>) = allergy(JsonField.of(allergy))

            /**
             * Sets [Builder.allergy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allergy] with a well-typed `List<Allergy>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allergy(allergy: JsonField<List<Allergy>>) = apply {
                this.allergy = allergy.map { it.toMutableList() }
            }

            /**
             * Adds a single [Allergy] to [Builder.allergy].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllergy(allergy: Allergy) = apply {
                this.allergy =
                    (this.allergy ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allergy", it).add(allergy)
                    }
            }

            /**
             * The patient blood type (A POS, B POS, AB POS, O POS, A NEG, B NEG, AB NEG, O NEG).
             */
            fun bloodType(bloodType: String) = bloodType(JsonField.of(bloodType))

            /**
             * Sets [Builder.bloodType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bloodType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bloodType(bloodType: JsonField<String>) = apply { this.bloodType = bloodType }

            /**
             * The body part involved for the patient (HEAD, NECK, ABDOMEN, UPPER EXTREMITIES, BACK,
             * FACE, LOWER EXTREMITIES, FRONT, OBSTETRICAL GYNECOLOGICAL, OTHER BODY PART).
             */
            fun bodyPart(bodyPart: String) = bodyPart(JsonField.of(bodyPart))

            /**
             * Sets [Builder.bodyPart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyPart] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyPart(bodyPart: JsonField<String>) = apply { this.bodyPart = bodyPart }

            /**
             * Array of the WGS-84 latitude (-90 to 90, negative values south of the equator) in
             * degrees, longitude (-180 to 180, negative values west of Prime Meridian) in degrees,
             * and altitude, in meters, of the burial location. This array must contain a minimum of
             * 2 elements (latitude and longitude), and may contain an optional 3rd element
             * (altitude).
             */
            fun burialLocation(burialLocation: List<Double>) =
                burialLocation(JsonField.of(burialLocation))

            /**
             * Sets [Builder.burialLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.burialLocation] with a well-typed `List<Double>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun burialLocation(burialLocation: JsonField<List<Double>>) = apply {
                this.burialLocation = burialLocation.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.burialLocation].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBurialLocation(burialLocation: Double) = apply {
                this.burialLocation =
                    (this.burialLocation ?: JsonField.of(mutableListOf())).also {
                        checkKnown("burialLocation", it).add(burialLocation)
                    }
            }

            /** The call sign of this patient. */
            fun callSign(callSign: String) = callSign(JsonField.of(callSign))

            /**
             * Sets [Builder.callSign] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSign] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSign(callSign: JsonField<String>) = apply { this.callSign = callSign }

            /** Unique identifier for the patient care provider. */
            fun careProviderUrn(careProviderUrn: String) =
                careProviderUrn(JsonField.of(careProviderUrn))

            /**
             * Sets [Builder.careProviderUrn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.careProviderUrn] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun careProviderUrn(careProviderUrn: JsonField<String>) = apply {
                this.careProviderUrn = careProviderUrn
            }

            /** Optional casualty key. */
            fun casualtyKey(casualtyKey: String) = casualtyKey(JsonField.of(casualtyKey))

            /**
             * Sets [Builder.casualtyKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.casualtyKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun casualtyKey(casualtyKey: JsonField<String>) = apply {
                this.casualtyKey = casualtyKey
            }

            /**
             * The type of medical issue resulting in the need to evacuate the patient (NON BATTLE,
             * CUT, BURN, SICK, FRACTURE, AMPUTATION, PERFORATION, NUCLEAR, EXHAUSTION, BIOLOGICAL,
             * CHEMICAL, SHOCK, PUNCTURE WOUND, OTHER CUT, WOUNDED IN ACTION, DENIAL, COMBAT
             * STRESS).
             */
            fun casualtyType(casualtyType: String) = casualtyType(JsonField.of(casualtyType))

            /**
             * Sets [Builder.casualtyType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.casualtyType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun casualtyType(casualtyType: JsonField<String>) = apply {
                this.casualtyType = casualtyType
            }

            /**
             * Array of the WGS-84 latitude (-90 to 90, negative values south of the equator) in
             * degrees, longitude (-180 to 180, negative values west of Prime Meridian) in degrees,
             * and altitude, in meters, of the collection point. This array must contain a minimum
             * of 2 elements (latitude and longitude), and may contain an optional 3rd element
             * (altitude).
             */
            fun collectionPoint(collectionPoint: List<Double>) =
                collectionPoint(JsonField.of(collectionPoint))

            /**
             * Sets [Builder.collectionPoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectionPoint] with a well-typed `List<Double>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun collectionPoint(collectionPoint: JsonField<List<Double>>) = apply {
                this.collectionPoint = collectionPoint.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.collectionPoint].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCollectionPoint(collectionPoint: Double) = apply {
                this.collectionPoint =
                    (this.collectionPoint ?: JsonField.of(mutableListOf())).also {
                        checkKnown("collectionPoint", it).add(collectionPoint)
                    }
            }

            /** Additional comments on the patient's casualty information. */
            fun comments(comments: String) = comments(JsonField.of(comments))

            /**
             * Sets [Builder.comments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.comments] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun comments(comments: JsonField<String>) = apply { this.comments = comments }

            /** Health condition information. */
            fun condition(condition: List<Condition>) = condition(JsonField.of(condition))

            /**
             * Sets [Builder.condition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.condition] with a well-typed `List<Condition>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun condition(condition: JsonField<List<Condition>>) = apply {
                this.condition = condition.map { it.toMutableList() }
            }

            /**
             * Adds a single [Condition] to [Builder.condition].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCondition(condition: Condition) = apply {
                this.condition =
                    (this.condition ?: JsonField.of(mutableListOf())).also {
                        checkKnown("condition", it).add(condition)
                    }
            }

            /**
             * The contamination specified for the patient (NONE, RADIATION, BIOLOGICAL, CHEMICAL).
             */
            fun contamType(contamType: String) = contamType(JsonField.of(contamType))

            /**
             * Sets [Builder.contamType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contamType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contamType(contamType: JsonField<String>) = apply { this.contamType = contamType }

            /**
             * The patient's general medical state (SICK IN QUARTERS, RETURN TO DUTY, EVACUATE
             * WOUNDED, EVACUATE DECEASED, INTERRED).
             */
            fun disposition(disposition: String) = disposition(JsonField.of(disposition))

            /**
             * Sets [Builder.disposition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disposition] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun disposition(disposition: JsonField<String>) = apply {
                this.disposition = disposition
            }

            /**
             * The expected disposition of this patient (R T D, EVACUATE, EVACUATE TO FORWARD
             * SURGICAL TEAM, EVACUATE TO COMBAT SUPPORT HOSPITAL, EVACUATE TO AERO MEDICAL STAGING
             * FACILITY, EVACUATE TO SUSTAINING BASE MEDICAL TREATMENT FACILITY).
             */
            fun dispositionType(dispositionType: String) =
                dispositionType(JsonField.of(dispositionType))

            /**
             * Sets [Builder.dispositionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dispositionType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dispositionType(dispositionType: JsonField<String>) = apply {
                this.dispositionType = dispositionType
            }

            /** Medical condition causation information. */
            fun etiology(etiology: List<Etiology>) = etiology(JsonField.of(etiology))

            /**
             * Sets [Builder.etiology] to an arbitrary JSON value.
             *
             * You should usually call [Builder.etiology] with a well-typed `List<Etiology>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun etiology(etiology: JsonField<List<Etiology>>) = apply {
                this.etiology = etiology.map { it.toMutableList() }
            }

            /**
             * Adds a single [Etiology] to [Builder.etiology].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEtiology(etiology: Etiology) = apply {
                this.etiology =
                    (this.etiology ?: JsonField.of(mutableListOf())).also {
                        checkKnown("etiology", it).add(etiology)
                    }
            }

            /** The required evacuation method for this patient (AIR, GROUND, NOT EVACUATED). */
            fun evacType(evacType: String) = evacType(JsonField.of(evacType))

            /**
             * Sets [Builder.evacType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evacType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun evacType(evacType: JsonField<String>) = apply { this.evacType = evacType }

            /** The patient sex (MALE, FEMALE). */
            fun gender(gender: String) = gender(JsonField.of(gender))

            /**
             * Sets [Builder.gender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gender] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: JsonField<String>) = apply { this.gender = gender }

            /** Health state information. */
            fun healthState(healthState: List<HealthState>) = healthState(JsonField.of(healthState))

            /**
             * Sets [Builder.healthState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.healthState] with a well-typed `List<HealthState>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun healthState(healthState: JsonField<List<HealthState>>) = apply {
                this.healthState = healthState.map { it.toMutableList() }
            }

            /**
             * Adds a single [HealthState] to [Builder.healthState].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addHealthState(healthState: HealthState) = apply {
                this.healthState =
                    (this.healthState ?: JsonField.of(mutableListOf())).also {
                        checkKnown("healthState", it).add(healthState)
                    }
            }

            /** Injury specifics. */
            fun injury(injury: List<Injury>) = injury(JsonField.of(injury))

            /**
             * Sets [Builder.injury] to an arbitrary JSON value.
             *
             * You should usually call [Builder.injury] with a well-typed `List<Injury>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun injury(injury: JsonField<List<Injury>>) = apply {
                this.injury = injury.map { it.toMutableList() }
            }

            /**
             * Adds a single [Injury] to [Builder.injury].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInjury(injury: Injury) = apply {
                this.injury =
                    (this.injury ?: JsonField.of(mutableListOf())).also {
                        checkKnown("injury", it).add(injury)
                    }
            }

            /** Last 4 characters of the patient social security code, or equivalent. */
            fun last4Ssn(last4Ssn: String) = last4Ssn(JsonField.of(last4Ssn))

            /**
             * Sets [Builder.last4Ssn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.last4Ssn] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun last4Ssn(last4Ssn: JsonField<String>) = apply { this.last4Ssn = last4Ssn }

            /** Medication specifics. */
            fun medication(medication: List<Medication>) = medication(JsonField.of(medication))

            /**
             * Sets [Builder.medication] to an arbitrary JSON value.
             *
             * You should usually call [Builder.medication] with a well-typed `List<Medication>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun medication(medication: JsonField<List<Medication>>) = apply {
                this.medication = medication.map { it.toMutableList() }
            }

            /**
             * Adds a single [Medication] to [Builder.medication].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMedication(medication: Medication) = apply {
                this.medication =
                    (this.medication ?: JsonField.of(mutableListOf())).also {
                        checkKnown("medication", it).add(medication)
                    }
            }

            /** The patient common or legal name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The country code indicating the citizenship of the patient. */
            fun nationality(nationality: String) = nationality(JsonField.of(nationality))

            /**
             * Sets [Builder.nationality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nationality] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nationality(nationality: JsonField<String>) = apply {
                this.nationality = nationality
            }

            /** The career field of this patient. */
            fun occSpeciality(occSpeciality: String) = occSpeciality(JsonField.of(occSpeciality))

            /**
             * Sets [Builder.occSpeciality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.occSpeciality] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun occSpeciality(occSpeciality: JsonField<String>) = apply {
                this.occSpeciality = occSpeciality
            }

            /**
             * The patient service identity (UNKNOWN MILITARY, UNKNOWN CIVILIAN, FRIEND MILITARY,
             * FRIEND CIVILIAN, NEUTRAL MILITARY, NEUTRAL CIVILIAN, HOSTILE MILITARY, HOSTILE
             * CIVILIAN).
             */
            fun patientIdentity(patientIdentity: String) =
                patientIdentity(JsonField.of(patientIdentity))

            /**
             * Sets [Builder.patientIdentity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.patientIdentity] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun patientIdentity(patientIdentity: JsonField<String>) = apply {
                this.patientIdentity = patientIdentity
            }

            /**
             * The patient service status (US MILITARY, US CIVILIAN, NON US MILITARY, NON US
             * CIVILIAN, ENEMY POW).
             */
            fun patientStatus(patientStatus: String) = patientStatus(JsonField.of(patientStatus))

            /**
             * Sets [Builder.patientStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.patientStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun patientStatus(patientStatus: JsonField<String>) = apply {
                this.patientStatus = patientStatus
            }

            /**
             * The patient pay grade or rank designation (O-10, O-9, O-8, O-7, O-6, O-5, O-4, O-3,
             * O-2, O-1, CWO-5, CWO-4, CWO-2, CWO-1, E -9, E-8, E-7, E-6, E-5, E-4, E-3, E-2, E-1,
             * NONE, CIVILIAN).
             */
            fun payGrade(payGrade: String) = payGrade(JsonField.of(payGrade))

            /**
             * Sets [Builder.payGrade] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payGrade] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payGrade(payGrade: JsonField<String>) = apply { this.payGrade = payGrade }

            /**
             * The priority of the medevac mission for this patient (URGENT, PRIORITY, ROUTINE,
             * URGENT SURGERY, CONVENIENCE).
             */
            fun priority(priority: String) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<String>) = apply { this.priority = priority }

            /**
             * The method used to generate this medevac report (DEVICE, GROUND COMBAT PERSONNEL,
             * EVACUATION PERSONNEL, ECHELON1 PERSONNEL, ECHELON2 PERSONNEL).
             */
            fun reportGen(reportGen: String) = reportGen(JsonField.of(reportGen))

            /**
             * Sets [Builder.reportGen] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportGen] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportGen(reportGen: JsonField<String>) = apply { this.reportGen = reportGen }

            /**
             * Datetime of the compiling of the patients casualty report, in ISO 8601 UTC format.
             */
            fun reportTime(reportTime: OffsetDateTime) = reportTime(JsonField.of(reportTime))

            /**
             * Sets [Builder.reportTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportTime(reportTime: JsonField<OffsetDateTime>) = apply {
                this.reportTime = reportTime
            }

            /**
             * The patient branch of service (AIR FORCE, ARMY, NAVY, MARINES, CIV, CONTR, UNKNOWN
             * SERVICE).
             */
            fun service(service: String) = service(JsonField.of(service))

            /**
             * Sets [Builder.service] to an arbitrary JSON value.
             *
             * You should usually call [Builder.service] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun service(service: JsonField<String>) = apply { this.service = service }

            /**
             * Array specifying if any special equipment is need for each of the evacuation of this
             * patient (EXTRACTION EQUIPMENT, SEMI RIGID LITTER, BACKBOARD, CERVICAL COLLAR ,JUNGLE
             * PENETRATOR, OXYGEN, WHOLE BLOOD, VENTILATOR, HOIST, NONE).
             */
            fun specMedEquip(specMedEquip: List<String>) = specMedEquip(JsonField.of(specMedEquip))

            /**
             * Sets [Builder.specMedEquip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specMedEquip] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun specMedEquip(specMedEquip: JsonField<List<String>>) = apply {
                this.specMedEquip = specMedEquip.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.specMedEquip].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpecMedEquip(specMedEquip: String) = apply {
                this.specMedEquip =
                    (this.specMedEquip ?: JsonField.of(mutableListOf())).also {
                        checkKnown("specMedEquip", it).add(specMedEquip)
                    }
            }

            /** Treatment information. */
            fun treatment(treatment: List<Treatment>) = treatment(JsonField.of(treatment))

            /**
             * Sets [Builder.treatment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.treatment] with a well-typed `List<Treatment>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun treatment(treatment: JsonField<List<Treatment>>) = apply {
                this.treatment = treatment.map { it.toMutableList() }
            }

            /**
             * Adds a single [Treatment] to [Builder.treatment].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTreatment(treatment: Treatment) = apply {
                this.treatment =
                    (this.treatment ?: JsonField.of(mutableListOf())).also {
                        checkKnown("treatment", it).add(treatment)
                    }
            }

            /** Information obtained for vital signs. */
            fun vitalSignData(vitalSignData: List<VitalSignData>) =
                vitalSignData(JsonField.of(vitalSignData))

            /**
             * Sets [Builder.vitalSignData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vitalSignData] with a well-typed
             * `List<VitalSignData>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun vitalSignData(vitalSignData: JsonField<List<VitalSignData>>) = apply {
                this.vitalSignData = vitalSignData.map { it.toMutableList() }
            }

            /**
             * Adds a single [VitalSignData] to [Builder.vitalSignData].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVitalSignData(vitalSignData: VitalSignData) = apply {
                this.vitalSignData =
                    (this.vitalSignData ?: JsonField.of(mutableListOf())).also {
                        checkKnown("vitalSignData", it).add(vitalSignData)
                    }
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
             * Returns an immutable instance of [CasualtyInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CasualtyInfo =
                CasualtyInfo(
                    age,
                    (allergy ?: JsonMissing.of()).map { it.toImmutable() },
                    bloodType,
                    bodyPart,
                    (burialLocation ?: JsonMissing.of()).map { it.toImmutable() },
                    callSign,
                    careProviderUrn,
                    casualtyKey,
                    casualtyType,
                    (collectionPoint ?: JsonMissing.of()).map { it.toImmutable() },
                    comments,
                    (condition ?: JsonMissing.of()).map { it.toImmutable() },
                    contamType,
                    disposition,
                    dispositionType,
                    (etiology ?: JsonMissing.of()).map { it.toImmutable() },
                    evacType,
                    gender,
                    (healthState ?: JsonMissing.of()).map { it.toImmutable() },
                    (injury ?: JsonMissing.of()).map { it.toImmutable() },
                    last4Ssn,
                    (medication ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    nationality,
                    occSpeciality,
                    patientIdentity,
                    patientStatus,
                    payGrade,
                    priority,
                    reportGen,
                    reportTime,
                    service,
                    (specMedEquip ?: JsonMissing.of()).map { it.toImmutable() },
                    (treatment ?: JsonMissing.of()).map { it.toImmutable() },
                    (vitalSignData ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CasualtyInfo = apply {
            if (validated) {
                return@apply
            }

            age()
            allergy().ifPresent { it.forEach { it.validate() } }
            bloodType()
            bodyPart()
            burialLocation()
            callSign()
            careProviderUrn()
            casualtyKey()
            casualtyType()
            collectionPoint()
            comments()
            condition().ifPresent { it.forEach { it.validate() } }
            contamType()
            disposition()
            dispositionType()
            etiology().ifPresent { it.forEach { it.validate() } }
            evacType()
            gender()
            healthState().ifPresent { it.forEach { it.validate() } }
            injury().ifPresent { it.forEach { it.validate() } }
            last4Ssn()
            medication().ifPresent { it.forEach { it.validate() } }
            name()
            nationality()
            occSpeciality()
            patientIdentity()
            patientStatus()
            payGrade()
            priority()
            reportGen()
            reportTime()
            service()
            specMedEquip()
            treatment().ifPresent { it.forEach { it.validate() } }
            vitalSignData().ifPresent { it.forEach { it.validate() } }
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
            (if (age.asKnown().isPresent) 1 else 0) +
                (allergy.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (bloodType.asKnown().isPresent) 1 else 0) +
                (if (bodyPart.asKnown().isPresent) 1 else 0) +
                (burialLocation.asKnown().getOrNull()?.size ?: 0) +
                (if (callSign.asKnown().isPresent) 1 else 0) +
                (if (careProviderUrn.asKnown().isPresent) 1 else 0) +
                (if (casualtyKey.asKnown().isPresent) 1 else 0) +
                (if (casualtyType.asKnown().isPresent) 1 else 0) +
                (collectionPoint.asKnown().getOrNull()?.size ?: 0) +
                (if (comments.asKnown().isPresent) 1 else 0) +
                (condition.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (contamType.asKnown().isPresent) 1 else 0) +
                (if (disposition.asKnown().isPresent) 1 else 0) +
                (if (dispositionType.asKnown().isPresent) 1 else 0) +
                (etiology.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (evacType.asKnown().isPresent) 1 else 0) +
                (if (gender.asKnown().isPresent) 1 else 0) +
                (healthState.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (injury.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (last4Ssn.asKnown().isPresent) 1 else 0) +
                (medication.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (nationality.asKnown().isPresent) 1 else 0) +
                (if (occSpeciality.asKnown().isPresent) 1 else 0) +
                (if (patientIdentity.asKnown().isPresent) 1 else 0) +
                (if (patientStatus.asKnown().isPresent) 1 else 0) +
                (if (payGrade.asKnown().isPresent) 1 else 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (if (reportGen.asKnown().isPresent) 1 else 0) +
                (if (reportTime.asKnown().isPresent) 1 else 0) +
                (if (service.asKnown().isPresent) 1 else 0) +
                (specMedEquip.asKnown().getOrNull()?.size ?: 0) +
                (treatment.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (vitalSignData.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Allergy
        private constructor(
            private val comments: JsonField<String>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("comments")
                @ExcludeMissing
                comments: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(comments, type, mutableMapOf())

            /**
             * Additional comments on the patient's allergy information.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun comments(): Optional<String> = comments.getOptional("comments")

            /**
             * Type of patient allergy (e.g. PENICILLIN, SULFA, OTHER).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [comments].
             *
             * Unlike [comments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<String> = comments

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [Allergy]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Allergy]. */
            class Builder internal constructor() {

                private var comments: JsonField<String> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(allergy: Allergy) = apply {
                    comments = allergy.comments
                    type = allergy.type
                    additionalProperties = allergy.additionalProperties.toMutableMap()
                }

                /** Additional comments on the patient's allergy information. */
                fun comments(comments: String) = comments(JsonField.of(comments))

                /**
                 * Sets [Builder.comments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.comments] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun comments(comments: JsonField<String>) = apply { this.comments = comments }

                /** Type of patient allergy (e.g. PENICILLIN, SULFA, OTHER). */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Allergy].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Allergy = Allergy(comments, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Allergy = apply {
                if (validated) {
                    return@apply
                }

                comments()
                type()
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
                (if (comments.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Allergy &&
                    comments == other.comments &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(comments, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Allergy{comments=$comments, type=$type, additionalProperties=$additionalProperties}"
        }

        class Condition
        private constructor(
            private val bodyPart: JsonField<String>,
            private val comments: JsonField<String>,
            private val time: JsonField<OffsetDateTime>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bodyPart")
                @ExcludeMissing
                bodyPart: JsonField<String> = JsonMissing.of(),
                @JsonProperty("comments")
                @ExcludeMissing
                comments: JsonField<String> = JsonMissing.of(),
                @JsonProperty("time")
                @ExcludeMissing
                time: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(bodyPart, comments, time, type, mutableMapOf())

            /**
             * Body part location or body part referenced in condition. Intended as, but not
             * constrained to, K07.1 Body Location Enumeration (e.g. ANKLE LEFT BACK, ANKLE LEFT
             * FRONT, ANKLE RIGHT BACK, ANKLE RIGHT FRONT, ARM LEFT BACK, ARM LEFT ELBOW BACK, ARM
             * LEFT ELBOW FRONT, ARM LEFT FRONT, ARM LEFT LOWER BACK, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun bodyPart(): Optional<String> = bodyPart.getOptional("bodyPart")

            /**
             * Additional comments on the patient's condition.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun comments(): Optional<String> = comments.getOptional("comments")

            /**
             * Datetime of the condition diagnosis in ISO 8601 UTC datetime format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun time(): Optional<OffsetDateTime> = time.getOptional("time")

            /**
             * Health condition assessment. Intended as, but not constrained to, K07.1 Condition
             * Type Enumeration (e.g. ACTIVITY HIGH, ACTIVITY LOW, ACTIVITY MEDIUM, ACTIVITY NONE,
             * AVPU ALERT, AVPU ALTERED MENTAL STATE, AVPU PAIN, AVPU UNRESPONSIVE, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [bodyPart].
             *
             * Unlike [bodyPart], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bodyPart") @ExcludeMissing fun _bodyPart(): JsonField<String> = bodyPart

            /**
             * Returns the raw JSON value of [comments].
             *
             * Unlike [comments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<String> = comments

            /**
             * Returns the raw JSON value of [time].
             *
             * Unlike [time], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("time") @ExcludeMissing fun _time(): JsonField<OffsetDateTime> = time

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [Condition]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Condition]. */
            class Builder internal constructor() {

                private var bodyPart: JsonField<String> = JsonMissing.of()
                private var comments: JsonField<String> = JsonMissing.of()
                private var time: JsonField<OffsetDateTime> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(condition: Condition) = apply {
                    bodyPart = condition.bodyPart
                    comments = condition.comments
                    time = condition.time
                    type = condition.type
                    additionalProperties = condition.additionalProperties.toMutableMap()
                }

                /**
                 * Body part location or body part referenced in condition. Intended as, but not
                 * constrained to, K07.1 Body Location Enumeration (e.g. ANKLE LEFT BACK, ANKLE LEFT
                 * FRONT, ANKLE RIGHT BACK, ANKLE RIGHT FRONT, ARM LEFT BACK, ARM LEFT ELBOW BACK,
                 * ARM LEFT ELBOW FRONT, ARM LEFT FRONT, ARM LEFT LOWER BACK, etc.).
                 */
                fun bodyPart(bodyPart: String) = bodyPart(JsonField.of(bodyPart))

                /**
                 * Sets [Builder.bodyPart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bodyPart] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bodyPart(bodyPart: JsonField<String>) = apply { this.bodyPart = bodyPart }

                /** Additional comments on the patient's condition. */
                fun comments(comments: String) = comments(JsonField.of(comments))

                /**
                 * Sets [Builder.comments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.comments] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun comments(comments: JsonField<String>) = apply { this.comments = comments }

                /** Datetime of the condition diagnosis in ISO 8601 UTC datetime format. */
                fun time(time: OffsetDateTime) = time(JsonField.of(time))

                /**
                 * Sets [Builder.time] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.time] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun time(time: JsonField<OffsetDateTime>) = apply { this.time = time }

                /**
                 * Health condition assessment. Intended as, but not constrained to, K07.1 Condition
                 * Type Enumeration (e.g. ACTIVITY HIGH, ACTIVITY LOW, ACTIVITY MEDIUM, ACTIVITY
                 * NONE, AVPU ALERT, AVPU ALTERED MENTAL STATE, AVPU PAIN, AVPU UNRESPONSIVE, etc.).
                 */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Condition].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Condition =
                    Condition(bodyPart, comments, time, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Condition = apply {
                if (validated) {
                    return@apply
                }

                bodyPart()
                comments()
                time()
                type()
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
                (if (bodyPart.asKnown().isPresent) 1 else 0) +
                    (if (comments.asKnown().isPresent) 1 else 0) +
                    (if (time.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Condition &&
                    bodyPart == other.bodyPart &&
                    comments == other.comments &&
                    time == other.time &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(bodyPart, comments, time, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Condition{bodyPart=$bodyPart, comments=$comments, time=$time, type=$type, additionalProperties=$additionalProperties}"
        }

        class Etiology
        private constructor(
            private val bodyPart: JsonField<String>,
            private val comments: JsonField<String>,
            private val time: JsonField<OffsetDateTime>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bodyPart")
                @ExcludeMissing
                bodyPart: JsonField<String> = JsonMissing.of(),
                @JsonProperty("comments")
                @ExcludeMissing
                comments: JsonField<String> = JsonMissing.of(),
                @JsonProperty("time")
                @ExcludeMissing
                time: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(bodyPart, comments, time, type, mutableMapOf())

            /**
             * The body part or location affected from the etiology. Intended as, but not
             * constrained to, K07.1 Body Location Enumeration (e.g. ANKLE LEFT BACK, ANKLE LEFT
             * FRONT, ANKLE RIGHT BACK, ANKLE RIGHT FRONT, ARM LEFT BACK, ARM LEFT ELBOW BACK, ARM
             * LEFT ELBOW FRONT, ARM LEFT FRONT, ARM LEFT LOWER BACK, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun bodyPart(): Optional<String> = bodyPart.getOptional("bodyPart")

            /**
             * Additional comments on the patient's etiology information.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun comments(): Optional<String> = comments.getOptional("comments")

            /**
             * Datetime of the discovery of the etiology state in ISO 8601 UTC format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun time(): Optional<OffsetDateTime> = time.getOptional("time")

            /**
             * The cause or manner of causation of the medical condition. Intended as, but not
             * constrained to, K07.1 EtiologyType Enumeration (e.g. ASSAULT, BUILDING COLLAPSE, BURN
             * CHEMICAL, BURN ELECTRICAL, BURN, BURN HOT LIQUID, BURN RADIATION, BURN THERMAL,
             * etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [bodyPart].
             *
             * Unlike [bodyPart], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bodyPart") @ExcludeMissing fun _bodyPart(): JsonField<String> = bodyPart

            /**
             * Returns the raw JSON value of [comments].
             *
             * Unlike [comments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<String> = comments

            /**
             * Returns the raw JSON value of [time].
             *
             * Unlike [time], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("time") @ExcludeMissing fun _time(): JsonField<OffsetDateTime> = time

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [Etiology]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Etiology]. */
            class Builder internal constructor() {

                private var bodyPart: JsonField<String> = JsonMissing.of()
                private var comments: JsonField<String> = JsonMissing.of()
                private var time: JsonField<OffsetDateTime> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(etiology: Etiology) = apply {
                    bodyPart = etiology.bodyPart
                    comments = etiology.comments
                    time = etiology.time
                    type = etiology.type
                    additionalProperties = etiology.additionalProperties.toMutableMap()
                }

                /**
                 * The body part or location affected from the etiology. Intended as, but not
                 * constrained to, K07.1 Body Location Enumeration (e.g. ANKLE LEFT BACK, ANKLE LEFT
                 * FRONT, ANKLE RIGHT BACK, ANKLE RIGHT FRONT, ARM LEFT BACK, ARM LEFT ELBOW BACK,
                 * ARM LEFT ELBOW FRONT, ARM LEFT FRONT, ARM LEFT LOWER BACK, etc.).
                 */
                fun bodyPart(bodyPart: String) = bodyPart(JsonField.of(bodyPart))

                /**
                 * Sets [Builder.bodyPart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bodyPart] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bodyPart(bodyPart: JsonField<String>) = apply { this.bodyPart = bodyPart }

                /** Additional comments on the patient's etiology information. */
                fun comments(comments: String) = comments(JsonField.of(comments))

                /**
                 * Sets [Builder.comments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.comments] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun comments(comments: JsonField<String>) = apply { this.comments = comments }

                /** Datetime of the discovery of the etiology state in ISO 8601 UTC format. */
                fun time(time: OffsetDateTime) = time(JsonField.of(time))

                /**
                 * Sets [Builder.time] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.time] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun time(time: JsonField<OffsetDateTime>) = apply { this.time = time }

                /**
                 * The cause or manner of causation of the medical condition. Intended as, but not
                 * constrained to, K07.1 EtiologyType Enumeration (e.g. ASSAULT, BUILDING COLLAPSE,
                 * BURN CHEMICAL, BURN ELECTRICAL, BURN, BURN HOT LIQUID, BURN RADIATION, BURN
                 * THERMAL, etc.).
                 */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Etiology].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Etiology =
                    Etiology(bodyPart, comments, time, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Etiology = apply {
                if (validated) {
                    return@apply
                }

                bodyPart()
                comments()
                time()
                type()
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
                (if (bodyPart.asKnown().isPresent) 1 else 0) +
                    (if (comments.asKnown().isPresent) 1 else 0) +
                    (if (time.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Etiology &&
                    bodyPart == other.bodyPart &&
                    comments == other.comments &&
                    time == other.time &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(bodyPart, comments, time, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Etiology{bodyPart=$bodyPart, comments=$comments, time=$time, type=$type, additionalProperties=$additionalProperties}"
        }

        class HealthState
        private constructor(
            private val healthStateCode: JsonField<String>,
            private val medConfFactor: JsonField<Int>,
            private val time: JsonField<OffsetDateTime>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("healthStateCode")
                @ExcludeMissing
                healthStateCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("medConfFactor")
                @ExcludeMissing
                medConfFactor: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("time")
                @ExcludeMissing
                time: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(healthStateCode, medConfFactor, time, type, mutableMapOf())

            /**
             * Medical color code used to quickly identify various medical state (e.g. AMBER, BLACK,
             * BLUE, GRAY, NORMAL, RED).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun healthStateCode(): Optional<String> = healthStateCode.getOptional("healthStateCode")

            /**
             * Medical confidence factor.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun medConfFactor(): Optional<Int> = medConfFactor.getOptional("medConfFactor")

            /**
             * Datetime of the health state diagnosis in ISO 8601 UTC datetime format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun time(): Optional<OffsetDateTime> = time.getOptional("time")

            /**
             * Generalized state of health type (BIOLOGICAL, CHEMICAL, COGNITIVE, HYDRATION, LIFE
             * SIGN, RADIATION, SHOCK, THERMAL).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [healthStateCode].
             *
             * Unlike [healthStateCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("healthStateCode")
            @ExcludeMissing
            fun _healthStateCode(): JsonField<String> = healthStateCode

            /**
             * Returns the raw JSON value of [medConfFactor].
             *
             * Unlike [medConfFactor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("medConfFactor")
            @ExcludeMissing
            fun _medConfFactor(): JsonField<Int> = medConfFactor

            /**
             * Returns the raw JSON value of [time].
             *
             * Unlike [time], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("time") @ExcludeMissing fun _time(): JsonField<OffsetDateTime> = time

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [HealthState]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [HealthState]. */
            class Builder internal constructor() {

                private var healthStateCode: JsonField<String> = JsonMissing.of()
                private var medConfFactor: JsonField<Int> = JsonMissing.of()
                private var time: JsonField<OffsetDateTime> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(healthState: HealthState) = apply {
                    healthStateCode = healthState.healthStateCode
                    medConfFactor = healthState.medConfFactor
                    time = healthState.time
                    type = healthState.type
                    additionalProperties = healthState.additionalProperties.toMutableMap()
                }

                /**
                 * Medical color code used to quickly identify various medical state (e.g. AMBER,
                 * BLACK, BLUE, GRAY, NORMAL, RED).
                 */
                fun healthStateCode(healthStateCode: String) =
                    healthStateCode(JsonField.of(healthStateCode))

                /**
                 * Sets [Builder.healthStateCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.healthStateCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun healthStateCode(healthStateCode: JsonField<String>) = apply {
                    this.healthStateCode = healthStateCode
                }

                /** Medical confidence factor. */
                fun medConfFactor(medConfFactor: Int) = medConfFactor(JsonField.of(medConfFactor))

                /**
                 * Sets [Builder.medConfFactor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.medConfFactor] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun medConfFactor(medConfFactor: JsonField<Int>) = apply {
                    this.medConfFactor = medConfFactor
                }

                /** Datetime of the health state diagnosis in ISO 8601 UTC datetime format. */
                fun time(time: OffsetDateTime) = time(JsonField.of(time))

                /**
                 * Sets [Builder.time] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.time] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun time(time: JsonField<OffsetDateTime>) = apply { this.time = time }

                /**
                 * Generalized state of health type (BIOLOGICAL, CHEMICAL, COGNITIVE, HYDRATION,
                 * LIFE SIGN, RADIATION, SHOCK, THERMAL).
                 */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [HealthState].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): HealthState =
                    HealthState(
                        healthStateCode,
                        medConfFactor,
                        time,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): HealthState = apply {
                if (validated) {
                    return@apply
                }

                healthStateCode()
                medConfFactor()
                time()
                type()
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
                (if (healthStateCode.asKnown().isPresent) 1 else 0) +
                    (if (medConfFactor.asKnown().isPresent) 1 else 0) +
                    (if (time.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is HealthState &&
                    healthStateCode == other.healthStateCode &&
                    medConfFactor == other.medConfFactor &&
                    time == other.time &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(healthStateCode, medConfFactor, time, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "HealthState{healthStateCode=$healthStateCode, medConfFactor=$medConfFactor, time=$time, type=$type, additionalProperties=$additionalProperties}"
        }

        class Injury
        private constructor(
            private val bodyPart: JsonField<String>,
            private val comments: JsonField<String>,
            private val time: JsonField<OffsetDateTime>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bodyPart")
                @ExcludeMissing
                bodyPart: JsonField<String> = JsonMissing.of(),
                @JsonProperty("comments")
                @ExcludeMissing
                comments: JsonField<String> = JsonMissing.of(),
                @JsonProperty("time")
                @ExcludeMissing
                time: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(bodyPart, comments, time, type, mutableMapOf())

            /**
             * Body part location of the injury. Intended as, but not constrained to, K07.1 Body
             * Location Enumeration (e.g. ANKLE LEFT BACK, ANKLE LEFT FRONT, ANKLE RIGHT BACK, ANKLE
             * RIGHT FRONT, ARM LEFT BACK, ARM LEFT ELBOW BACK, ARM LEFT ELBOW FRONT, ARM LEFT
             * FRONT, ARM LEFT LOWER BACK, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun bodyPart(): Optional<String> = bodyPart.getOptional("bodyPart")

            /**
             * Additional comments on the patient's injury information.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun comments(): Optional<String> = comments.getOptional("comments")

            /**
             * The time of the injury, in ISO 8601 UTC format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun time(): Optional<OffsetDateTime> = time.getOptional("time")

            /**
             * Classification of the injury type (ABRASION, AMPUTATION IT, AVULATION, BALLISTIC,
             * BLAST WAVE, BURN 1ST DEGREE, BURN 2ND DEGREE, BURN 3RD DEGREE, BURN INHALATION, BURN
             * LOWER AIRWAY, CHEST FLAIL, CHEST OPEN, DEGLOVING, ECCHYMOSIS, FRACTURE CLOSED,
             * FRACTURE CREPITUS, FRACTURE IT, FRACTURE OPEN, HEMATOMA, IRREGULAR CONSISTENCY,
             * IRREGULAR CONSISTENCY RIDGED, IRREGULAR CONSISTENCY SWOLLEN, IRREGULAR CONSISTENCY
             * SWOLLEN DISTENDED, IRREGULAR CONSISTENCY TENDER, IRREGULAR POSITION, IRREGULAR SHAPE,
             * IRREGULAR SHAPE MISSHAPED, IRREGULAR SHAPE NON SYMMETRICAL, LACERATION, NEUROVASCULAR
             * COMPROMISE, NEUROVASCULAR INTACT, PUNCTURE, SEAT BELT SIGN, STAB, TIC TIM).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [bodyPart].
             *
             * Unlike [bodyPart], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bodyPart") @ExcludeMissing fun _bodyPart(): JsonField<String> = bodyPart

            /**
             * Returns the raw JSON value of [comments].
             *
             * Unlike [comments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<String> = comments

            /**
             * Returns the raw JSON value of [time].
             *
             * Unlike [time], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("time") @ExcludeMissing fun _time(): JsonField<OffsetDateTime> = time

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [Injury]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Injury]. */
            class Builder internal constructor() {

                private var bodyPart: JsonField<String> = JsonMissing.of()
                private var comments: JsonField<String> = JsonMissing.of()
                private var time: JsonField<OffsetDateTime> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(injury: Injury) = apply {
                    bodyPart = injury.bodyPart
                    comments = injury.comments
                    time = injury.time
                    type = injury.type
                    additionalProperties = injury.additionalProperties.toMutableMap()
                }

                /**
                 * Body part location of the injury. Intended as, but not constrained to, K07.1 Body
                 * Location Enumeration (e.g. ANKLE LEFT BACK, ANKLE LEFT FRONT, ANKLE RIGHT BACK,
                 * ANKLE RIGHT FRONT, ARM LEFT BACK, ARM LEFT ELBOW BACK, ARM LEFT ELBOW FRONT, ARM
                 * LEFT FRONT, ARM LEFT LOWER BACK, etc.).
                 */
                fun bodyPart(bodyPart: String) = bodyPart(JsonField.of(bodyPart))

                /**
                 * Sets [Builder.bodyPart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bodyPart] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bodyPart(bodyPart: JsonField<String>) = apply { this.bodyPart = bodyPart }

                /** Additional comments on the patient's injury information. */
                fun comments(comments: String) = comments(JsonField.of(comments))

                /**
                 * Sets [Builder.comments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.comments] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun comments(comments: JsonField<String>) = apply { this.comments = comments }

                /** The time of the injury, in ISO 8601 UTC format. */
                fun time(time: OffsetDateTime) = time(JsonField.of(time))

                /**
                 * Sets [Builder.time] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.time] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun time(time: JsonField<OffsetDateTime>) = apply { this.time = time }

                /**
                 * Classification of the injury type (ABRASION, AMPUTATION IT, AVULATION, BALLISTIC,
                 * BLAST WAVE, BURN 1ST DEGREE, BURN 2ND DEGREE, BURN 3RD DEGREE, BURN INHALATION,
                 * BURN LOWER AIRWAY, CHEST FLAIL, CHEST OPEN, DEGLOVING, ECCHYMOSIS, FRACTURE
                 * CLOSED, FRACTURE CREPITUS, FRACTURE IT, FRACTURE OPEN, HEMATOMA, IRREGULAR
                 * CONSISTENCY, IRREGULAR CONSISTENCY RIDGED, IRREGULAR CONSISTENCY SWOLLEN,
                 * IRREGULAR CONSISTENCY SWOLLEN DISTENDED, IRREGULAR CONSISTENCY TENDER, IRREGULAR
                 * POSITION, IRREGULAR SHAPE, IRREGULAR SHAPE MISSHAPED, IRREGULAR SHAPE NON
                 * SYMMETRICAL, LACERATION, NEUROVASCULAR COMPROMISE, NEUROVASCULAR INTACT,
                 * PUNCTURE, SEAT BELT SIGN, STAB, TIC TIM).
                 */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Injury].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Injury =
                    Injury(bodyPart, comments, time, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Injury = apply {
                if (validated) {
                    return@apply
                }

                bodyPart()
                comments()
                time()
                type()
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
                (if (bodyPart.asKnown().isPresent) 1 else 0) +
                    (if (comments.asKnown().isPresent) 1 else 0) +
                    (if (time.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Injury &&
                    bodyPart == other.bodyPart &&
                    comments == other.comments &&
                    time == other.time &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(bodyPart, comments, time, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Injury{bodyPart=$bodyPart, comments=$comments, time=$time, type=$type, additionalProperties=$additionalProperties}"
        }

        class Medication
        private constructor(
            private val adminRoute: JsonField<String>,
            private val bodyPart: JsonField<String>,
            private val comments: JsonField<String>,
            private val dose: JsonField<String>,
            private val time: JsonField<OffsetDateTime>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("adminRoute")
                @ExcludeMissing
                adminRoute: JsonField<String> = JsonMissing.of(),
                @JsonProperty("bodyPart")
                @ExcludeMissing
                bodyPart: JsonField<String> = JsonMissing.of(),
                @JsonProperty("comments")
                @ExcludeMissing
                comments: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dose") @ExcludeMissing dose: JsonField<String> = JsonMissing.of(),
                @JsonProperty("time")
                @ExcludeMissing
                time: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(adminRoute, bodyPart, comments, dose, time, type, mutableMapOf())

            /**
             * Route of medication delivery (e.g. INJECTION, ORAL, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun adminRoute(): Optional<String> = adminRoute.getOptional("adminRoute")

            /**
             * Body part location or body part referenced for medication. Intended as, but not
             * constrained to, K07.1 Body Location Enumeration (e.g. ANKLE LEFT BACK, ANKLE LEFT
             * FRONT, ANKLE RIGHT BACK, ANKLE RIGHT FRONT, ARM LEFT BACK, ARM LEFT ELBOW BACK, ARM
             * LEFT ELBOW FRONT, ARM LEFT FRONT, ARM LEFT LOWER BACK, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun bodyPart(): Optional<String> = bodyPart.getOptional("bodyPart")

            /**
             * Additional comments on the patient's medication information.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun comments(): Optional<String> = comments.getOptional("comments")

            /**
             * Quantity of medicine or drug administered or recommended to be taken at a particular
             * time.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun dose(): Optional<String> = dose.getOptional("dose")

            /**
             * The time that the medication was administered in ISO 8601 UTC format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun time(): Optional<OffsetDateTime> = time.getOptional("time")

            /**
             * The type of medication administered. Intended as, but not constrained to, K07.1
             * Medication Enumeration (CEFOTETAN, ABRASION, ABX, AMOXILOXACIN, ANALGESIC, COLLOID,
             * CRYOPECIPITATES, CRYSTALLOID, EPINEPHRINE, ERTAPENEM, FENTANYL, HEXTEND, LACTATED
             * RINGERS, MOBIC, MORPHINE, NARCOTIC, NS, PENICILLIN, PLASMA, PLATELETS, PRBC, TYLENOL,
             * WHOLE BLOOD MT).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [adminRoute].
             *
             * Unlike [adminRoute], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("adminRoute")
            @ExcludeMissing
            fun _adminRoute(): JsonField<String> = adminRoute

            /**
             * Returns the raw JSON value of [bodyPart].
             *
             * Unlike [bodyPart], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bodyPart") @ExcludeMissing fun _bodyPart(): JsonField<String> = bodyPart

            /**
             * Returns the raw JSON value of [comments].
             *
             * Unlike [comments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<String> = comments

            /**
             * Returns the raw JSON value of [dose].
             *
             * Unlike [dose], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("dose") @ExcludeMissing fun _dose(): JsonField<String> = dose

            /**
             * Returns the raw JSON value of [time].
             *
             * Unlike [time], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("time") @ExcludeMissing fun _time(): JsonField<OffsetDateTime> = time

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [Medication]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Medication]. */
            class Builder internal constructor() {

                private var adminRoute: JsonField<String> = JsonMissing.of()
                private var bodyPart: JsonField<String> = JsonMissing.of()
                private var comments: JsonField<String> = JsonMissing.of()
                private var dose: JsonField<String> = JsonMissing.of()
                private var time: JsonField<OffsetDateTime> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(medication: Medication) = apply {
                    adminRoute = medication.adminRoute
                    bodyPart = medication.bodyPart
                    comments = medication.comments
                    dose = medication.dose
                    time = medication.time
                    type = medication.type
                    additionalProperties = medication.additionalProperties.toMutableMap()
                }

                /** Route of medication delivery (e.g. INJECTION, ORAL, etc.). */
                fun adminRoute(adminRoute: String) = adminRoute(JsonField.of(adminRoute))

                /**
                 * Sets [Builder.adminRoute] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.adminRoute] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun adminRoute(adminRoute: JsonField<String>) = apply {
                    this.adminRoute = adminRoute
                }

                /**
                 * Body part location or body part referenced for medication. Intended as, but not
                 * constrained to, K07.1 Body Location Enumeration (e.g. ANKLE LEFT BACK, ANKLE LEFT
                 * FRONT, ANKLE RIGHT BACK, ANKLE RIGHT FRONT, ARM LEFT BACK, ARM LEFT ELBOW BACK,
                 * ARM LEFT ELBOW FRONT, ARM LEFT FRONT, ARM LEFT LOWER BACK, etc.).
                 */
                fun bodyPart(bodyPart: String) = bodyPart(JsonField.of(bodyPart))

                /**
                 * Sets [Builder.bodyPart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bodyPart] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bodyPart(bodyPart: JsonField<String>) = apply { this.bodyPart = bodyPart }

                /** Additional comments on the patient's medication information. */
                fun comments(comments: String) = comments(JsonField.of(comments))

                /**
                 * Sets [Builder.comments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.comments] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun comments(comments: JsonField<String>) = apply { this.comments = comments }

                /**
                 * Quantity of medicine or drug administered or recommended to be taken at a
                 * particular time.
                 */
                fun dose(dose: String) = dose(JsonField.of(dose))

                /**
                 * Sets [Builder.dose] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dose] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun dose(dose: JsonField<String>) = apply { this.dose = dose }

                /** The time that the medication was administered in ISO 8601 UTC format. */
                fun time(time: OffsetDateTime) = time(JsonField.of(time))

                /**
                 * Sets [Builder.time] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.time] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun time(time: JsonField<OffsetDateTime>) = apply { this.time = time }

                /**
                 * The type of medication administered. Intended as, but not constrained to, K07.1
                 * Medication Enumeration (CEFOTETAN, ABRASION, ABX, AMOXILOXACIN, ANALGESIC,
                 * COLLOID, CRYOPECIPITATES, CRYSTALLOID, EPINEPHRINE, ERTAPENEM, FENTANYL, HEXTEND,
                 * LACTATED RINGERS, MOBIC, MORPHINE, NARCOTIC, NS, PENICILLIN, PLASMA, PLATELETS,
                 * PRBC, TYLENOL, WHOLE BLOOD MT).
                 */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Medication].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Medication =
                    Medication(
                        adminRoute,
                        bodyPart,
                        comments,
                        dose,
                        time,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Medication = apply {
                if (validated) {
                    return@apply
                }

                adminRoute()
                bodyPart()
                comments()
                dose()
                time()
                type()
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
                (if (adminRoute.asKnown().isPresent) 1 else 0) +
                    (if (bodyPart.asKnown().isPresent) 1 else 0) +
                    (if (comments.asKnown().isPresent) 1 else 0) +
                    (if (dose.asKnown().isPresent) 1 else 0) +
                    (if (time.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Medication &&
                    adminRoute == other.adminRoute &&
                    bodyPart == other.bodyPart &&
                    comments == other.comments &&
                    dose == other.dose &&
                    time == other.time &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(adminRoute, bodyPart, comments, dose, time, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Medication{adminRoute=$adminRoute, bodyPart=$bodyPart, comments=$comments, dose=$dose, time=$time, type=$type, additionalProperties=$additionalProperties}"
        }

        class Treatment
        private constructor(
            private val bodyPart: JsonField<String>,
            private val comments: JsonField<String>,
            private val time: JsonField<OffsetDateTime>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bodyPart")
                @ExcludeMissing
                bodyPart: JsonField<String> = JsonMissing.of(),
                @JsonProperty("comments")
                @ExcludeMissing
                comments: JsonField<String> = JsonMissing.of(),
                @JsonProperty("time")
                @ExcludeMissing
                time: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(bodyPart, comments, time, type, mutableMapOf())

            /**
             * Body part location or body part treated or to be treated. Intended as, but not
             * constrained to, K07.1 Body Location Enumeration (e.g. ANKLE LEFT BACK, ANKLE LEFT
             * FRONT, ANKLE RIGHT BACK, ANKLE RIGHT FRONT, ARM LEFT BACK, ARM LEFT ELBOW BACK, ARM
             * LEFT ELBOW FRONT, ARM LEFT FRONT, ARM LEFT LOWER BACK, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun bodyPart(): Optional<String> = bodyPart.getOptional("bodyPart")

            /**
             * Additional comments on the patient's treatment information.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun comments(): Optional<String> = comments.getOptional("comments")

            /**
             * Datetime of the treatment in ISO 8601 UTC format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun time(): Optional<OffsetDateTime> = time.getOptional("time")

            /**
             * Type of treatment administered or to be administered. Intended as, but not
             * constrained to, K07.1 Treatment Type Enumeration (e.g. AIRWAY ADJUNCT, AIRWAY
             * ASSISTED VENTILATION, AIRWAY COMBI TUBE USED, AIRWAY ET NT, AIRWAY INTUBATED, AIRWAY
             * NPA OPA APPLIED, AIRWAY PATIENT, AIRWAY POSITIONAL, AIRWAY SURGICAL CRIC, BREATHING
             * CHEST SEAL, BREATHING CHEST TUBE, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [bodyPart].
             *
             * Unlike [bodyPart], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bodyPart") @ExcludeMissing fun _bodyPart(): JsonField<String> = bodyPart

            /**
             * Returns the raw JSON value of [comments].
             *
             * Unlike [comments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<String> = comments

            /**
             * Returns the raw JSON value of [time].
             *
             * Unlike [time], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("time") @ExcludeMissing fun _time(): JsonField<OffsetDateTime> = time

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [Treatment]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Treatment]. */
            class Builder internal constructor() {

                private var bodyPart: JsonField<String> = JsonMissing.of()
                private var comments: JsonField<String> = JsonMissing.of()
                private var time: JsonField<OffsetDateTime> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(treatment: Treatment) = apply {
                    bodyPart = treatment.bodyPart
                    comments = treatment.comments
                    time = treatment.time
                    type = treatment.type
                    additionalProperties = treatment.additionalProperties.toMutableMap()
                }

                /**
                 * Body part location or body part treated or to be treated. Intended as, but not
                 * constrained to, K07.1 Body Location Enumeration (e.g. ANKLE LEFT BACK, ANKLE LEFT
                 * FRONT, ANKLE RIGHT BACK, ANKLE RIGHT FRONT, ARM LEFT BACK, ARM LEFT ELBOW BACK,
                 * ARM LEFT ELBOW FRONT, ARM LEFT FRONT, ARM LEFT LOWER BACK, etc.).
                 */
                fun bodyPart(bodyPart: String) = bodyPart(JsonField.of(bodyPart))

                /**
                 * Sets [Builder.bodyPart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bodyPart] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bodyPart(bodyPart: JsonField<String>) = apply { this.bodyPart = bodyPart }

                /** Additional comments on the patient's treatment information. */
                fun comments(comments: String) = comments(JsonField.of(comments))

                /**
                 * Sets [Builder.comments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.comments] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun comments(comments: JsonField<String>) = apply { this.comments = comments }

                /** Datetime of the treatment in ISO 8601 UTC format. */
                fun time(time: OffsetDateTime) = time(JsonField.of(time))

                /**
                 * Sets [Builder.time] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.time] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun time(time: JsonField<OffsetDateTime>) = apply { this.time = time }

                /**
                 * Type of treatment administered or to be administered. Intended as, but not
                 * constrained to, K07.1 Treatment Type Enumeration (e.g. AIRWAY ADJUNCT, AIRWAY
                 * ASSISTED VENTILATION, AIRWAY COMBI TUBE USED, AIRWAY ET NT, AIRWAY INTUBATED,
                 * AIRWAY NPA OPA APPLIED, AIRWAY PATIENT, AIRWAY POSITIONAL, AIRWAY SURGICAL CRIC,
                 * BREATHING CHEST SEAL, BREATHING CHEST TUBE, etc.).
                 */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Treatment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Treatment =
                    Treatment(bodyPart, comments, time, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Treatment = apply {
                if (validated) {
                    return@apply
                }

                bodyPart()
                comments()
                time()
                type()
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
                (if (bodyPart.asKnown().isPresent) 1 else 0) +
                    (if (comments.asKnown().isPresent) 1 else 0) +
                    (if (time.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Treatment &&
                    bodyPart == other.bodyPart &&
                    comments == other.comments &&
                    time == other.time &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(bodyPart, comments, time, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Treatment{bodyPart=$bodyPart, comments=$comments, time=$time, type=$type, additionalProperties=$additionalProperties}"
        }

        class VitalSignData
        private constructor(
            private val medConfFactor: JsonField<Int>,
            private val time: JsonField<OffsetDateTime>,
            private val vitalSign: JsonField<String>,
            private val vitalSign1: JsonField<Double>,
            private val vitalSign2: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("medConfFactor")
                @ExcludeMissing
                medConfFactor: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("time")
                @ExcludeMissing
                time: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("vitalSign")
                @ExcludeMissing
                vitalSign: JsonField<String> = JsonMissing.of(),
                @JsonProperty("vitalSign1")
                @ExcludeMissing
                vitalSign1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("vitalSign2")
                @ExcludeMissing
                vitalSign2: JsonField<Double> = JsonMissing.of(),
            ) : this(medConfFactor, time, vitalSign, vitalSign1, vitalSign2, mutableMapOf())

            /**
             * Medical confidence factor.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun medConfFactor(): Optional<Int> = medConfFactor.getOptional("medConfFactor")

            /**
             * Datetime of the vital sign measurement in ISO 8601 UTC datetime format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun time(): Optional<OffsetDateTime> = time.getOptional("time")

            /**
             * Patient vital sign measured (e.g. HEART RATE, PULSE RATE, RESPIRATION RATE,
             * TEMPERATURE CORE, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun vitalSign(): Optional<String> = vitalSign.getOptional("vitalSign")

            /**
             * Vital sign value 1. The content of this field is dependent on the type of vital sign
             * being measured (see the vitalSign field).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun vitalSign1(): Optional<Double> = vitalSign1.getOptional("vitalSign1")

            /**
             * Vital sign value 2. The content of this field is dependent on the type of vital sign
             * being measured (see the vitalSign field).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun vitalSign2(): Optional<Double> = vitalSign2.getOptional("vitalSign2")

            /**
             * Returns the raw JSON value of [medConfFactor].
             *
             * Unlike [medConfFactor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("medConfFactor")
            @ExcludeMissing
            fun _medConfFactor(): JsonField<Int> = medConfFactor

            /**
             * Returns the raw JSON value of [time].
             *
             * Unlike [time], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("time") @ExcludeMissing fun _time(): JsonField<OffsetDateTime> = time

            /**
             * Returns the raw JSON value of [vitalSign].
             *
             * Unlike [vitalSign], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("vitalSign")
            @ExcludeMissing
            fun _vitalSign(): JsonField<String> = vitalSign

            /**
             * Returns the raw JSON value of [vitalSign1].
             *
             * Unlike [vitalSign1], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("vitalSign1")
            @ExcludeMissing
            fun _vitalSign1(): JsonField<Double> = vitalSign1

            /**
             * Returns the raw JSON value of [vitalSign2].
             *
             * Unlike [vitalSign2], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("vitalSign2")
            @ExcludeMissing
            fun _vitalSign2(): JsonField<Double> = vitalSign2

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

                /** Returns a mutable builder for constructing an instance of [VitalSignData]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VitalSignData]. */
            class Builder internal constructor() {

                private var medConfFactor: JsonField<Int> = JsonMissing.of()
                private var time: JsonField<OffsetDateTime> = JsonMissing.of()
                private var vitalSign: JsonField<String> = JsonMissing.of()
                private var vitalSign1: JsonField<Double> = JsonMissing.of()
                private var vitalSign2: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(vitalSignData: VitalSignData) = apply {
                    medConfFactor = vitalSignData.medConfFactor
                    time = vitalSignData.time
                    vitalSign = vitalSignData.vitalSign
                    vitalSign1 = vitalSignData.vitalSign1
                    vitalSign2 = vitalSignData.vitalSign2
                    additionalProperties = vitalSignData.additionalProperties.toMutableMap()
                }

                /** Medical confidence factor. */
                fun medConfFactor(medConfFactor: Int) = medConfFactor(JsonField.of(medConfFactor))

                /**
                 * Sets [Builder.medConfFactor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.medConfFactor] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun medConfFactor(medConfFactor: JsonField<Int>) = apply {
                    this.medConfFactor = medConfFactor
                }

                /** Datetime of the vital sign measurement in ISO 8601 UTC datetime format. */
                fun time(time: OffsetDateTime) = time(JsonField.of(time))

                /**
                 * Sets [Builder.time] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.time] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun time(time: JsonField<OffsetDateTime>) = apply { this.time = time }

                /**
                 * Patient vital sign measured (e.g. HEART RATE, PULSE RATE, RESPIRATION RATE,
                 * TEMPERATURE CORE, etc.).
                 */
                fun vitalSign(vitalSign: String) = vitalSign(JsonField.of(vitalSign))

                /**
                 * Sets [Builder.vitalSign] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vitalSign] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun vitalSign(vitalSign: JsonField<String>) = apply { this.vitalSign = vitalSign }

                /**
                 * Vital sign value 1. The content of this field is dependent on the type of vital
                 * sign being measured (see the vitalSign field).
                 */
                fun vitalSign1(vitalSign1: Double) = vitalSign1(JsonField.of(vitalSign1))

                /**
                 * Sets [Builder.vitalSign1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vitalSign1] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun vitalSign1(vitalSign1: JsonField<Double>) = apply {
                    this.vitalSign1 = vitalSign1
                }

                /**
                 * Vital sign value 2. The content of this field is dependent on the type of vital
                 * sign being measured (see the vitalSign field).
                 */
                fun vitalSign2(vitalSign2: Double) = vitalSign2(JsonField.of(vitalSign2))

                /**
                 * Sets [Builder.vitalSign2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vitalSign2] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun vitalSign2(vitalSign2: JsonField<Double>) = apply {
                    this.vitalSign2 = vitalSign2
                }

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
                 * Returns an immutable instance of [VitalSignData].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): VitalSignData =
                    VitalSignData(
                        medConfFactor,
                        time,
                        vitalSign,
                        vitalSign1,
                        vitalSign2,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): VitalSignData = apply {
                if (validated) {
                    return@apply
                }

                medConfFactor()
                time()
                vitalSign()
                vitalSign1()
                vitalSign2()
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
                (if (medConfFactor.asKnown().isPresent) 1 else 0) +
                    (if (time.asKnown().isPresent) 1 else 0) +
                    (if (vitalSign.asKnown().isPresent) 1 else 0) +
                    (if (vitalSign1.asKnown().isPresent) 1 else 0) +
                    (if (vitalSign2.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VitalSignData &&
                    medConfFactor == other.medConfFactor &&
                    time == other.time &&
                    vitalSign == other.vitalSign &&
                    vitalSign1 == other.vitalSign1 &&
                    vitalSign2 == other.vitalSign2 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    medConfFactor,
                    time,
                    vitalSign,
                    vitalSign1,
                    vitalSign2,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VitalSignData{medConfFactor=$medConfFactor, time=$time, vitalSign=$vitalSign, vitalSign1=$vitalSign1, vitalSign2=$vitalSign2, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CasualtyInfo &&
                age == other.age &&
                allergy == other.allergy &&
                bloodType == other.bloodType &&
                bodyPart == other.bodyPart &&
                burialLocation == other.burialLocation &&
                callSign == other.callSign &&
                careProviderUrn == other.careProviderUrn &&
                casualtyKey == other.casualtyKey &&
                casualtyType == other.casualtyType &&
                collectionPoint == other.collectionPoint &&
                comments == other.comments &&
                condition == other.condition &&
                contamType == other.contamType &&
                disposition == other.disposition &&
                dispositionType == other.dispositionType &&
                etiology == other.etiology &&
                evacType == other.evacType &&
                gender == other.gender &&
                healthState == other.healthState &&
                injury == other.injury &&
                last4Ssn == other.last4Ssn &&
                medication == other.medication &&
                name == other.name &&
                nationality == other.nationality &&
                occSpeciality == other.occSpeciality &&
                patientIdentity == other.patientIdentity &&
                patientStatus == other.patientStatus &&
                payGrade == other.payGrade &&
                priority == other.priority &&
                reportGen == other.reportGen &&
                reportTime == other.reportTime &&
                service == other.service &&
                specMedEquip == other.specMedEquip &&
                treatment == other.treatment &&
                vitalSignData == other.vitalSignData &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                age,
                allergy,
                bloodType,
                bodyPart,
                burialLocation,
                callSign,
                careProviderUrn,
                casualtyKey,
                casualtyType,
                collectionPoint,
                comments,
                condition,
                contamType,
                disposition,
                dispositionType,
                etiology,
                evacType,
                gender,
                healthState,
                injury,
                last4Ssn,
                medication,
                name,
                nationality,
                occSpeciality,
                patientIdentity,
                patientStatus,
                payGrade,
                priority,
                reportGen,
                reportTime,
                service,
                specMedEquip,
                treatment,
                vitalSignData,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CasualtyInfo{age=$age, allergy=$allergy, bloodType=$bloodType, bodyPart=$bodyPart, burialLocation=$burialLocation, callSign=$callSign, careProviderUrn=$careProviderUrn, casualtyKey=$casualtyKey, casualtyType=$casualtyType, collectionPoint=$collectionPoint, comments=$comments, condition=$condition, contamType=$contamType, disposition=$disposition, dispositionType=$dispositionType, etiology=$etiology, evacType=$evacType, gender=$gender, healthState=$healthState, injury=$injury, last4Ssn=$last4Ssn, medication=$medication, name=$name, nationality=$nationality, occSpeciality=$occSpeciality, patientIdentity=$patientIdentity, patientStatus=$patientStatus, payGrade=$payGrade, priority=$priority, reportGen=$reportGen, reportTime=$reportTime, service=$service, specMedEquip=$specMedEquip, treatment=$treatment, vitalSignData=$vitalSignData, additionalProperties=$additionalProperties}"
    }

    class EnemyData
    private constructor(
        private val dirToEnemy: JsonField<String>,
        private val friendliesRemarks: JsonField<String>,
        private val hlzRemarks: JsonField<String>,
        private val hostileFireType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dirToEnemy")
            @ExcludeMissing
            dirToEnemy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("friendliesRemarks")
            @ExcludeMissing
            friendliesRemarks: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hlzRemarks")
            @ExcludeMissing
            hlzRemarks: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hostileFireType")
            @ExcludeMissing
            hostileFireType: JsonField<String> = JsonMissing.of(),
        ) : this(dirToEnemy, friendliesRemarks, hlzRemarks, hostileFireType, mutableMapOf())

        /**
         * Directions to known enemies in the operation area (NORTH, NORTHEAST, EAST, SOUTHEAST,
         * SOUTH, SOUTHWEST, WEST, NORTHWEST, SURROUNDED).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dirToEnemy(): Optional<String> = dirToEnemy.getOptional("dirToEnemy")

        /**
         * Comments provided by friendlies about the evac zone.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun friendliesRemarks(): Optional<String> =
            friendliesRemarks.getOptional("friendliesRemarks")

        /**
         * Hot Landing Zone remarks.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hlzRemarks(): Optional<String> = hlzRemarks.getOptional("hlzRemarks")

        /**
         * The type of hostile fire received (SMALL ARMS, MORTAR, ARTILLERY, ROCKETS).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hostileFireType(): Optional<String> = hostileFireType.getOptional("hostileFireType")

        /**
         * Returns the raw JSON value of [dirToEnemy].
         *
         * Unlike [dirToEnemy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dirToEnemy")
        @ExcludeMissing
        fun _dirToEnemy(): JsonField<String> = dirToEnemy

        /**
         * Returns the raw JSON value of [friendliesRemarks].
         *
         * Unlike [friendliesRemarks], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("friendliesRemarks")
        @ExcludeMissing
        fun _friendliesRemarks(): JsonField<String> = friendliesRemarks

        /**
         * Returns the raw JSON value of [hlzRemarks].
         *
         * Unlike [hlzRemarks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hlzRemarks")
        @ExcludeMissing
        fun _hlzRemarks(): JsonField<String> = hlzRemarks

        /**
         * Returns the raw JSON value of [hostileFireType].
         *
         * Unlike [hostileFireType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hostileFireType")
        @ExcludeMissing
        fun _hostileFireType(): JsonField<String> = hostileFireType

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

            /** Returns a mutable builder for constructing an instance of [EnemyData]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EnemyData]. */
        class Builder internal constructor() {

            private var dirToEnemy: JsonField<String> = JsonMissing.of()
            private var friendliesRemarks: JsonField<String> = JsonMissing.of()
            private var hlzRemarks: JsonField<String> = JsonMissing.of()
            private var hostileFireType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(enemyData: EnemyData) = apply {
                dirToEnemy = enemyData.dirToEnemy
                friendliesRemarks = enemyData.friendliesRemarks
                hlzRemarks = enemyData.hlzRemarks
                hostileFireType = enemyData.hostileFireType
                additionalProperties = enemyData.additionalProperties.toMutableMap()
            }

            /**
             * Directions to known enemies in the operation area (NORTH, NORTHEAST, EAST, SOUTHEAST,
             * SOUTH, SOUTHWEST, WEST, NORTHWEST, SURROUNDED).
             */
            fun dirToEnemy(dirToEnemy: String) = dirToEnemy(JsonField.of(dirToEnemy))

            /**
             * Sets [Builder.dirToEnemy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dirToEnemy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dirToEnemy(dirToEnemy: JsonField<String>) = apply { this.dirToEnemy = dirToEnemy }

            /** Comments provided by friendlies about the evac zone. */
            fun friendliesRemarks(friendliesRemarks: String) =
                friendliesRemarks(JsonField.of(friendliesRemarks))

            /**
             * Sets [Builder.friendliesRemarks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.friendliesRemarks] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun friendliesRemarks(friendliesRemarks: JsonField<String>) = apply {
                this.friendliesRemarks = friendliesRemarks
            }

            /** Hot Landing Zone remarks. */
            fun hlzRemarks(hlzRemarks: String) = hlzRemarks(JsonField.of(hlzRemarks))

            /**
             * Sets [Builder.hlzRemarks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hlzRemarks] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hlzRemarks(hlzRemarks: JsonField<String>) = apply { this.hlzRemarks = hlzRemarks }

            /** The type of hostile fire received (SMALL ARMS, MORTAR, ARTILLERY, ROCKETS). */
            fun hostileFireType(hostileFireType: String) =
                hostileFireType(JsonField.of(hostileFireType))

            /**
             * Sets [Builder.hostileFireType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hostileFireType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hostileFireType(hostileFireType: JsonField<String>) = apply {
                this.hostileFireType = hostileFireType
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
             * Returns an immutable instance of [EnemyData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EnemyData =
                EnemyData(
                    dirToEnemy,
                    friendliesRemarks,
                    hlzRemarks,
                    hostileFireType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): EnemyData = apply {
            if (validated) {
                return@apply
            }

            dirToEnemy()
            friendliesRemarks()
            hlzRemarks()
            hostileFireType()
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
            (if (dirToEnemy.asKnown().isPresent) 1 else 0) +
                (if (friendliesRemarks.asKnown().isPresent) 1 else 0) +
                (if (hlzRemarks.asKnown().isPresent) 1 else 0) +
                (if (hostileFireType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EnemyData &&
                dirToEnemy == other.dirToEnemy &&
                friendliesRemarks == other.friendliesRemarks &&
                hlzRemarks == other.hlzRemarks &&
                hostileFireType == other.hostileFireType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                dirToEnemy,
                friendliesRemarks,
                hlzRemarks,
                hostileFireType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EnemyData{dirToEnemy=$dirToEnemy, friendliesRemarks=$friendliesRemarks, hlzRemarks=$hlzRemarks, hostileFireType=$hostileFireType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EvacFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            pickupLat == other.pickupLat &&
            pickupLon == other.pickupLon &&
            reqTime == other.reqTime &&
            source == other.source &&
            type == other.type &&
            id == other.id &&
            casualtyInfo == other.casualtyInfo &&
            ce == other.ce &&
            cntctFreq == other.cntctFreq &&
            comments == other.comments &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            enemyData == other.enemyData &&
            idWeatherReport == other.idWeatherReport &&
            le == other.le &&
            medevacId == other.medevacId &&
            medicReq == other.medicReq &&
            missionType == other.missionType &&
            numAmbulatory == other.numAmbulatory &&
            numCasualties == other.numCasualties &&
            numKia == other.numKia &&
            numLitter == other.numLitter &&
            numWia == other.numWia &&
            obstaclesRemarks == other.obstaclesRemarks &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            pickupAlt == other.pickupAlt &&
            pickupTime == other.pickupTime &&
            relatedDocs == other.relatedDocs &&
            reqCallSign == other.reqCallSign &&
            reqNum == other.reqNum &&
            terrain == other.terrain &&
            terrainRemarks == other.terrainRemarks &&
            zoneContrCallSign == other.zoneContrCallSign &&
            zoneHot == other.zoneHot &&
            zoneMarking == other.zoneMarking &&
            zoneMarkingColor == other.zoneMarkingColor &&
            zoneName == other.zoneName &&
            zoneSecurity == other.zoneSecurity &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            pickupLat,
            pickupLon,
            reqTime,
            source,
            type,
            id,
            casualtyInfo,
            ce,
            cntctFreq,
            comments,
            createdAt,
            createdBy,
            enemyData,
            idWeatherReport,
            le,
            medevacId,
            medicReq,
            missionType,
            numAmbulatory,
            numCasualties,
            numKia,
            numLitter,
            numWia,
            obstaclesRemarks,
            origin,
            origNetwork,
            pickupAlt,
            pickupTime,
            relatedDocs,
            reqCallSign,
            reqNum,
            terrain,
            terrainRemarks,
            zoneContrCallSign,
            zoneHot,
            zoneMarking,
            zoneMarkingColor,
            zoneName,
            zoneSecurity,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EvacFull{classificationMarking=$classificationMarking, dataMode=$dataMode, pickupLat=$pickupLat, pickupLon=$pickupLon, reqTime=$reqTime, source=$source, type=$type, id=$id, casualtyInfo=$casualtyInfo, ce=$ce, cntctFreq=$cntctFreq, comments=$comments, createdAt=$createdAt, createdBy=$createdBy, enemyData=$enemyData, idWeatherReport=$idWeatherReport, le=$le, medevacId=$medevacId, medicReq=$medicReq, missionType=$missionType, numAmbulatory=$numAmbulatory, numCasualties=$numCasualties, numKia=$numKia, numLitter=$numLitter, numWia=$numWia, obstaclesRemarks=$obstaclesRemarks, origin=$origin, origNetwork=$origNetwork, pickupAlt=$pickupAlt, pickupTime=$pickupTime, relatedDocs=$relatedDocs, reqCallSign=$reqCallSign, reqNum=$reqNum, terrain=$terrain, terrainRemarks=$terrainRemarks, zoneContrCallSign=$zoneContrCallSign, zoneHot=$zoneHot, zoneMarking=$zoneMarking, zoneMarkingColor=$zoneMarkingColor, zoneName=$zoneName, zoneSecurity=$zoneSecurity, additionalProperties=$additionalProperties}"
}

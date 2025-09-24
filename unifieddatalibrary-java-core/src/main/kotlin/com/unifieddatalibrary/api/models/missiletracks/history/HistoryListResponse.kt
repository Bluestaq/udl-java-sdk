// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.missiletracks.history

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
 * These services provide operations for querying of all available missile track details and
 * amplifying missile data. A missile track is a position and optionally a heading/velocity of an
 * object across all environments at a particular timestamp. It also includes optional information
 * regarding the identity/type of missile, impact location, launch location and other amplifying
 * object data, if known.
 */
class HistoryListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val ts: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val acftSubType: JsonField<String>,
    private val alert: JsonField<String>,
    private val angElev: JsonField<Double>,
    private val aouRptData: JsonField<List<Double>>,
    private val aouRptType: JsonField<String>,
    private val azCorr: JsonField<Double>,
    private val boosting: JsonField<Boolean>,
    private val burnoutAlt: JsonField<Double>,
    private val callSign: JsonField<String>,
    private val containment: JsonField<Double>,
    private val contextKeys: JsonField<List<String>>,
    private val contextValues: JsonField<List<String>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val dropPtInd: JsonField<Boolean>,
    private val emgInd: JsonField<Boolean>,
    private val env: JsonField<Env>,
    private val impactAlt: JsonField<Double>,
    private val impactAouData: JsonField<List<Double>>,
    private val impactAouType: JsonField<String>,
    private val impactConf: JsonField<Double>,
    private val impactLat: JsonField<Double>,
    private val impactLon: JsonField<Double>,
    private val impactTime: JsonField<OffsetDateTime>,
    private val infoSource: JsonField<String>,
    private val launchAlt: JsonField<Double>,
    private val launchAouData: JsonField<List<Double>>,
    private val launchAouType: JsonField<String>,
    private val launchAz: JsonField<Double>,
    private val launchAzUnc: JsonField<Double>,
    private val launchConf: JsonField<Double>,
    private val launchLat: JsonField<Double>,
    private val launchLon: JsonField<Double>,
    private val launchTime: JsonField<OffsetDateTime>,
    private val lostTrkInd: JsonField<Boolean>,
    private val maneuverEnd: JsonField<OffsetDateTime>,
    private val maneuverStart: JsonField<OffsetDateTime>,
    private val msgCreateDate: JsonField<OffsetDateTime>,
    private val msgSubType: JsonField<String>,
    private val msgType: JsonField<String>,
    private val mslStatus: JsonField<String>,
    private val muidSrc: JsonField<String>,
    private val muidSrcTrk: JsonField<String>,
    private val name: JsonField<String>,
    private val objAct: JsonField<String>,
    private val objIdent: JsonField<ObjIdent>,
    private val objPlat: JsonField<String>,
    private val objType: JsonField<String>,
    private val objTypeConf: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val parentTrackId: JsonField<String>,
    private val polarSingLocLat: JsonField<Double>,
    private val polarSingLocLon: JsonField<Double>,
    private val senMode: JsonField<String>,
    private val spaceAmp: JsonField<String>,
    private val spaceAmpConf: JsonField<Int>,
    private val spaceSpecType: JsonField<String>,
    private val trackId: JsonField<String>,
    private val trkConf: JsonField<Double>,
    private val trkQual: JsonField<Int>,
    private val vectors: JsonField<List<Vector>>,
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
        @JsonProperty("acftSubType")
        @ExcludeMissing
        acftSubType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alert") @ExcludeMissing alert: JsonField<String> = JsonMissing.of(),
        @JsonProperty("angElev") @ExcludeMissing angElev: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("aouRptData")
        @ExcludeMissing
        aouRptData: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("aouRptType")
        @ExcludeMissing
        aouRptType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("azCorr") @ExcludeMissing azCorr: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("boosting") @ExcludeMissing boosting: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("burnoutAlt")
        @ExcludeMissing
        burnoutAlt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("callSign") @ExcludeMissing callSign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("containment")
        @ExcludeMissing
        containment: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("contextKeys")
        @ExcludeMissing
        contextKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("contextValues")
        @ExcludeMissing
        contextValues: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dropPtInd") @ExcludeMissing dropPtInd: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("emgInd") @ExcludeMissing emgInd: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("env") @ExcludeMissing env: JsonField<Env> = JsonMissing.of(),
        @JsonProperty("impactAlt") @ExcludeMissing impactAlt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("impactAouData")
        @ExcludeMissing
        impactAouData: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("impactAouType")
        @ExcludeMissing
        impactAouType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("impactConf")
        @ExcludeMissing
        impactConf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("impactLat") @ExcludeMissing impactLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("impactLon") @ExcludeMissing impactLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("impactTime")
        @ExcludeMissing
        impactTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("infoSource")
        @ExcludeMissing
        infoSource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchAlt") @ExcludeMissing launchAlt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchAouData")
        @ExcludeMissing
        launchAouData: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("launchAouType")
        @ExcludeMissing
        launchAouType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchAz") @ExcludeMissing launchAz: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchAzUnc")
        @ExcludeMissing
        launchAzUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchConf")
        @ExcludeMissing
        launchConf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchLat") @ExcludeMissing launchLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchLon") @ExcludeMissing launchLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchTime")
        @ExcludeMissing
        launchTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lostTrkInd")
        @ExcludeMissing
        lostTrkInd: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("maneuverEnd")
        @ExcludeMissing
        maneuverEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("maneuverStart")
        @ExcludeMissing
        maneuverStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("msgCreateDate")
        @ExcludeMissing
        msgCreateDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("msgSubType")
        @ExcludeMissing
        msgSubType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("msgType") @ExcludeMissing msgType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mslStatus") @ExcludeMissing mslStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("muidSrc") @ExcludeMissing muidSrc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("muidSrcTrk")
        @ExcludeMissing
        muidSrcTrk: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objAct") @ExcludeMissing objAct: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objIdent") @ExcludeMissing objIdent: JsonField<ObjIdent> = JsonMissing.of(),
        @JsonProperty("objPlat") @ExcludeMissing objPlat: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objType") @ExcludeMissing objType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objTypeConf") @ExcludeMissing objTypeConf: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parentTrackId")
        @ExcludeMissing
        parentTrackId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("polarSingLocLat")
        @ExcludeMissing
        polarSingLocLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("polarSingLocLon")
        @ExcludeMissing
        polarSingLocLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senMode") @ExcludeMissing senMode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spaceAmp") @ExcludeMissing spaceAmp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spaceAmpConf")
        @ExcludeMissing
        spaceAmpConf: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("spaceSpecType")
        @ExcludeMissing
        spaceSpecType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trackId") @ExcludeMissing trackId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trkConf") @ExcludeMissing trkConf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trkQual") @ExcludeMissing trkQual: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("vectors") @ExcludeMissing vectors: JsonField<List<Vector>> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        ts,
        id,
        acftSubType,
        alert,
        angElev,
        aouRptData,
        aouRptType,
        azCorr,
        boosting,
        burnoutAlt,
        callSign,
        containment,
        contextKeys,
        contextValues,
        createdAt,
        createdBy,
        dropPtInd,
        emgInd,
        env,
        impactAlt,
        impactAouData,
        impactAouType,
        impactConf,
        impactLat,
        impactLon,
        impactTime,
        infoSource,
        launchAlt,
        launchAouData,
        launchAouType,
        launchAz,
        launchAzUnc,
        launchConf,
        launchLat,
        launchLon,
        launchTime,
        lostTrkInd,
        maneuverEnd,
        maneuverStart,
        msgCreateDate,
        msgSubType,
        msgType,
        mslStatus,
        muidSrc,
        muidSrcTrk,
        name,
        objAct,
        objIdent,
        objPlat,
        objType,
        objTypeConf,
        origin,
        origNetwork,
        parentTrackId,
        polarSingLocLat,
        polarSingLocLon,
        senMode,
        spaceAmp,
        spaceAmpConf,
        spaceSpecType,
        trackId,
        trkConf,
        trkQual,
        vectors,
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
     * The receipt time of the data by the processing system, in ISO8601 UTC format with microsecond
     * precision.
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
     * Subtype is a finer grain categorization of missile types. Examples include but are not
     * limited to SRBM, MRBM, IRBM, LRBM, ICBM, SLBM.
     *
     * &nbsp;SRBM - Short-Range Ballistic Missile
     *
     * &nbsp;MRBM - Medium-Range Ballistic Missile
     *
     * &nbsp;IRBM - Intermediate-Range Ballistic Missile
     *
     * &nbsp;LRBM - Long-Range Ballistic Missile
     *
     * &nbsp;ICBM - Intercontinental Ballistic Missile
     *
     * &nbsp;SLBM - Submarine-Launched Ballistic Missile.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun acftSubType(): Optional<String> = acftSubType.getOptional("acftSubType")

    /**
     * A track may be designated as a non-alert track or an alert track.
     *
     * Examples include but are not limited to:
     *
     * &nbsp;Non-alert tracks – choose None (Blank).
     *
     * &nbsp;Alert tracks – enter the proper alert classification:
     *
     * &nbsp;HIT - High Interest Track
     *
     * &nbsp;TGT - Target
     *
     * &nbsp;SUS - Suspect Carrier
     *
     * &nbsp;NSP - Cleared Suspect.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun alert(): Optional<String> = alert.getOptional("alert")

    /**
     * Angle of elevation/depression between observer and missile in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun angElev(): Optional<Double> = angElev.getOptional("angElev")

    /**
     * Three element array representing an Area of Uncertainty (AoU). The array element definitions
     * and units are type specific depending on the aouType specified in this record:
     *
     * &nbsp;ELLIPSE:
     *
     * &nbsp;&nbsp;brg - orientation in degrees of the ellipse
     *
     * &nbsp;&nbsp;a1 - semi-major axis in kilometers
     *
     * &nbsp;&nbsp;a2 - semi-minor axis in kilometers
     *
     * &nbsp;BEARING (BEARING BOX or MTST BEARING BOX):
     *
     * &nbsp;&nbsp;brg - orientation in degrees of the bearing box
     *
     * &nbsp;&nbsp;a1 - length of bearing box in kilometers
     *
     * &nbsp;&nbsp;a2 - half-width of bearing box in kilometers
     *
     * &nbsp;OTHER (All other type values):
     *
     * &nbsp;&nbsp;brg - line of bearing in degrees true
     *
     * &nbsp;&nbsp;a1 - bearing error in degrees
     *
     * &nbsp;&nbsp;a2 - estimated range in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aouRptData(): Optional<List<Double>> = aouRptData.getOptional("aouRptData")

    /**
     * The Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition. This type defines
     * the elements of the aouEllp array and is required if aouEllp is not null. See the aouEllp
     * field definition for specific information.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aouRptType(): Optional<String> = aouRptType.getOptional("aouRptType")

    /**
     * Missile azimuth corridor data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azCorr(): Optional<Double> = azCorr.getOptional("azCorr")

    /**
     * Indicates whether or not the missile is currently in a state of boosting.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun boosting(): Optional<Boolean> = boosting.getOptional("boosting")

    /**
     * Track point burnout altitude relative to WGS-84 ellipsoid, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun burnoutAlt(): Optional<Double> = burnoutAlt.getOptional("burnoutAlt")

    /**
     * The call sign currently assigned to the track object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun callSign(): Optional<String> = callSign.getOptional("callSign")

    /**
     * The percentage of time that the estimated AoU will "cover" the true position of the track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun containment(): Optional<Double> = containment.getOptional("containment")

    /**
     * An optional string array containing additional data (keys) representing relevant items for
     * context of fields not specifically defined in this schema. This array is paired with the
     * contextValues string array and must contain the same number of items. Please note these
     * fields are intended for contextual use only and do not pertain to core schema information. To
     * ensure proper integration and avoid misuse, coordination of how these fields are populated
     * and consumed is required during onboarding.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun contextKeys(): Optional<List<String>> = contextKeys.getOptional("contextKeys")

    /**
     * An optional string array containing the values associated with the contextKeys array. This
     * array is paired with the contextKeys string array and must contain the same number of items.
     * Please note these fields are intended for contextual use only and do not pertain to core
     * schema information. To ensure proper integration and avoid misuse, coordination of how these
     * fields are populated and consumed is required during onboarding.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun contextValues(): Optional<List<String>> = contextValues.getOptional("contextValues")

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
     * The drop-point indicator setting.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dropPtInd(): Optional<Boolean> = dropPtInd.getOptional("dropPtInd")

    /**
     * Indicates whether or not a track has an emergency.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun emgInd(): Optional<Boolean> = emgInd.getOptional("emgInd")

    /**
     * The track environment type (AIR, LAND, SPACE, SUBSURFACE, SURFACE, UNKNOWN):
     *
     * AIR: Between sea level and the Kármán line, which has an altitude of 100 kilometers (62
     * miles).
     *
     * LAND: On the surface of dry land.
     *
     * SPACE: Above the Kármán line, which has an altitude of 100 kilometers (62 miles).
     *
     * SURFACE: On the surface of a body of water.
     *
     * SUBSURFACE: Below the surface of a body of water.
     *
     * UNKNOWN: Environment is not known.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun env(): Optional<Env> = env.getOptional("env")

    /**
     * Estimated impact point altitude relative to WGS-84 ellipsoid, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun impactAlt(): Optional<Double> = impactAlt.getOptional("impactAlt")

    /**
     * Three element array representing an Area of Uncertainty (AoU). The array element definitions
     * and units are type specific depending on the aouType specified in this record:
     *
     * &nbsp;ELLIPSE:
     *
     * &nbsp;&nbsp;brg - orientation in degrees of the ellipse
     *
     * &nbsp;&nbsp;a1 - semi-major axis in kilometers
     *
     * &nbsp;&nbsp;a2 - semi-minor axis in kilometers
     *
     * &nbsp;BEARING (BEARING BOX or MTST BEARING BOX):
     *
     * &nbsp;&nbsp;brg - orientation in degrees of the bearing box
     *
     * &nbsp;&nbsp;a1 - length of bearing box in kilometers
     *
     * &nbsp;&nbsp;a2 - half-width of bearing box in kilometers
     *
     * &nbsp;OTHER (All other type values):
     *
     * &nbsp;&nbsp;brg - line of bearing in degrees true
     *
     * &nbsp;&nbsp;a1 - bearing error in degrees
     *
     * &nbsp;&nbsp;a2 - estimated range in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun impactAouData(): Optional<List<Double>> = impactAouData.getOptional("impactAouData")

    /**
     * The Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition. This type defines
     * the elements of the aouEllp array and is required if aouEllp is not null. See the aouEllp
     * field definition for specific information.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun impactAouType(): Optional<String> = impactAouType.getOptional("impactAouType")

    /**
     * Confidence level of the impact point estimate. 0 - 100 percent.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun impactConf(): Optional<Double> = impactConf.getOptional("impactConf")

    /**
     * WGS-84 latitude of the missile object impact point, in degrees. -90 to 90 degrees (negative
     * values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun impactLat(): Optional<Double> = impactLat.getOptional("impactLat")

    /**
     * WGS-84 longitude of the missile object impact point, in degrees. -180 to 180 degrees
     * (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun impactLon(): Optional<Double> = impactLon.getOptional("impactLon")

    /**
     * Estimated time of impact timestamp in ISO8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun impactTime(): Optional<OffsetDateTime> = impactTime.getOptional("impactTime")

    /**
     * Source code for source of information used to detect track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun infoSource(): Optional<String> = infoSource.getOptional("infoSource")

    /**
     * Estimated launch point altitude relative to WGS-84 ellipsoid, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchAlt(): Optional<Double> = launchAlt.getOptional("launchAlt")

    /**
     * Three element array representing an Area of Uncertainty (AoU). The array element definitions
     * and units are type specific depending on the aouType specified in this record:
     *
     * &nbsp;ELLIPSE:
     *
     * &nbsp;&nbsp;brg - orientation in degrees of the ellipse
     *
     * &nbsp;&nbsp;a1 - semi-major axis in kilometers
     *
     * &nbsp;&nbsp;a2 - semi-minor axis in kilometers
     *
     * &nbsp;BEARING (BEARING BOX or MTST BEARING BOX):
     *
     * &nbsp;&nbsp;brg - orientation in degrees of the bearing box
     *
     * &nbsp;&nbsp;a1 - length of bearing box in kilometers
     *
     * &nbsp;&nbsp;a2 - half-width of bearing box in kilometers
     *
     * &nbsp;OTHER (All other type values):
     *
     * &nbsp;&nbsp;brg - line of bearing in degrees true
     *
     * &nbsp;&nbsp;a1 - bearing error in degrees
     *
     * &nbsp;&nbsp;a2 - estimated range in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchAouData(): Optional<List<Double>> = launchAouData.getOptional("launchAouData")

    /**
     * The Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition. This type defines
     * the elements of the aouEllp array and is required if aouEllp is not null. See the aouEllp
     * field definition for specific information.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchAouType(): Optional<String> = launchAouType.getOptional("launchAouType")

    /**
     * Angle between true north and the object's current position, with respect to the launch point,
     * in degrees. 0 to 360 degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchAz(): Optional<Double> = launchAz.getOptional("launchAz")

    /**
     * Uncertainty of the launch azimuth, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchAzUnc(): Optional<Double> = launchAzUnc.getOptional("launchAzUnc")

    /**
     * Confidence level in the accuracy of the launch point estimate. 0 - 100 percent.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchConf(): Optional<Double> = launchConf.getOptional("launchConf")

    /**
     * WGS-84 latitude of the missile launch point, in degrees. -90 to 90 degrees (negative values
     * south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchLat(): Optional<Double> = launchLat.getOptional("launchLat")

    /**
     * WGS-84 longitude of the missile launch point, in degrees. -180 to 180 degrees (negative
     * values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchLon(): Optional<Double> = launchLon.getOptional("launchLon")

    /**
     * Missile launch timestamp in ISO8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchTime(): Optional<OffsetDateTime> = launchTime.getOptional("launchTime")

    /**
     * Indicates whether or not the missile is considered lost.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lostTrkInd(): Optional<Boolean> = lostTrkInd.getOptional("lostTrkInd")

    /**
     * Maneuver end time, in ISO 8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maneuverEnd(): Optional<OffsetDateTime> = maneuverEnd.getOptional("maneuverEnd")

    /**
     * Maneuver start time, in ISO 8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maneuverStart(): Optional<OffsetDateTime> = maneuverStart.getOptional("maneuverStart")

    /**
     * The timestamp of the external message from which this request originated, if applicable, in
     * ISO8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun msgCreateDate(): Optional<OffsetDateTime> = msgCreateDate.getOptional("msgCreateDate")

    /**
     * The message subtype is a finer grain categorization of message types as many messages can
     * contain a variety of data content within the same structure. Examples include but are not
     * limited to Initial, Final, Launch, Update, etc. Users should consult the appropriate
     * documentation, based on the message type, for the definitions of the subtypes that apply to
     * that message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun msgSubType(): Optional<String> = msgSubType.getOptional("msgSubType")

    /**
     * The type of external message from which this request originated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun msgType(): Optional<String> = msgType.getOptional("msgType")

    /**
     * Missile status enumeration examples include but are not limited to:
     *
     * &nbsp;AT LAUNCH
     *
     * &nbsp;AT OBSERVATION
     *
     * &nbsp;FLYING
     *
     * &nbsp;IMPACTED
     *
     * &nbsp;LOST
     *
     * &nbsp;STALE
     *
     * &nbsp;DEBRIS.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mslStatus(): Optional<String> = mslStatus.getOptional("mslStatus")

    /**
     * Source of the missile-unique identifier (MUID).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun muidSrc(): Optional<String> = muidSrc.getOptional("muidSrc")

    /**
     * Track ID for the source of the missile-unique identifier.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun muidSrcTrk(): Optional<String> = muidSrcTrk.getOptional("muidSrcTrk")

    /**
     * Track name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Space activity (examples: RECONNAISSANCE, ANTISPACE WARFARE, TELEVISION). The activity in
     * which the track object is engaged. Intended as, but not constrained to, MIL-STD-6016
     * environment dependent activity designations. The activity can be reported as either a
     * combination of the code and environment (e.g. 65/AIR) or as the descriptive enumeration (e.g.
     * DIVERTING), which are equivalent.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objAct(): Optional<String> = objAct.getOptional("objAct")

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
     * Space Platform field along with the Space Activity field further defines the identity of a
     * Space track (examples: SATELLITE, WEAPON, PATROL). The object platform type. Intended as, but
     * not constrained to, MIL-STD-6016 environment dependent platform type designations. The
     * platform type can be reported as either a combination of the code and environment (e.g.
     * 14/LAND) or as the descriptive representations (e.g. COMBAT VEHICLE), which are equivalent.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objPlat(): Optional<String> = objPlat.getOptional("objPlat")

    /**
     * The type of object to which this record refers. The object type may be updated in later
     * records based on assessment of additional data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objType(): Optional<String> = objType.getOptional("objType")

    /**
     * Confidence of the object type, 0-100.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objTypeConf(): Optional<Int> = objTypeConf.getOptional("objTypeConf")

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
     * Track ID of the parent track, within the originating system, from which the track was
     * developed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun parentTrackId(): Optional<String> = parentTrackId.getOptional("parentTrackId")

    /**
     * Azimuth corridor reference point latitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarSingLocLat(): Optional<Double> = polarSingLocLat.getOptional("polarSingLocLat")

    /**
     * Azimuth corridor reference point longitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarSingLocLon(): Optional<Double> = polarSingLocLon.getOptional("polarSingLocLon")

    /**
     * Last report type received from the sensor (for example, OBSBO = observation burnout).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senMode(): Optional<String> = senMode.getOptional("senMode")

    /**
     * Space amplification indicates additional information on the space environment being reported
     * (examples: NUCLEAR WARHEAD, FUEL-AIR EXPLOSIVE WARHEAD, DEBRIS).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spaceAmp(): Optional<String> = spaceAmp.getOptional("spaceAmp")

    /**
     * Confidence level of the amplifying characteristics. Values range from 0 to 6.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spaceAmpConf(): Optional<Int> = spaceAmpConf.getOptional("spaceAmpConf")

    /**
     * Specific type of point or track with an environment of space.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spaceSpecType(): Optional<String> = spaceSpecType.getOptional("spaceSpecType")

    /**
     * Track ID within the originating system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackId(): Optional<String> = trackId.getOptional("trackId")

    /**
     * Overall track confidence estimate (not standardized, but typically a value between 0 and 1,
     * with 0 indicating lowest confidence).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trkConf(): Optional<Double> = trkConf.getOptional("trkConf")

    /**
     * Track Quality is reported as an integer from 0-15. Track Quality specifies the reliability of
     * the positional information of a reported track, with higher values indicating higher track
     * quality; i.e., lower errors in reported position.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trkQual(): Optional<Int> = trkQual.getOptional("trkQual")

    /**
     * Array of MissileTrackVector objects. Missile track vectors are cartesian vectors of position,
     * velocity, and acceleration that, together with their time, 'epoch', uniquely determine the
     * trajectory of the missile. ECEF is the preferred coordinate frame but in some cases data may
     * be in another frame as specified by 'referenceFrame', depending on the provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vectors(): Optional<List<Vector>> = vectors.getOptional("vectors")

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
     * Returns the raw JSON value of [acftSubType].
     *
     * Unlike [acftSubType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acftSubType") @ExcludeMissing fun _acftSubType(): JsonField<String> = acftSubType

    /**
     * Returns the raw JSON value of [alert].
     *
     * Unlike [alert], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alert") @ExcludeMissing fun _alert(): JsonField<String> = alert

    /**
     * Returns the raw JSON value of [angElev].
     *
     * Unlike [angElev], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("angElev") @ExcludeMissing fun _angElev(): JsonField<Double> = angElev

    /**
     * Returns the raw JSON value of [aouRptData].
     *
     * Unlike [aouRptData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aouRptData")
    @ExcludeMissing
    fun _aouRptData(): JsonField<List<Double>> = aouRptData

    /**
     * Returns the raw JSON value of [aouRptType].
     *
     * Unlike [aouRptType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aouRptType") @ExcludeMissing fun _aouRptType(): JsonField<String> = aouRptType

    /**
     * Returns the raw JSON value of [azCorr].
     *
     * Unlike [azCorr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azCorr") @ExcludeMissing fun _azCorr(): JsonField<Double> = azCorr

    /**
     * Returns the raw JSON value of [boosting].
     *
     * Unlike [boosting], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("boosting") @ExcludeMissing fun _boosting(): JsonField<Boolean> = boosting

    /**
     * Returns the raw JSON value of [burnoutAlt].
     *
     * Unlike [burnoutAlt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("burnoutAlt") @ExcludeMissing fun _burnoutAlt(): JsonField<Double> = burnoutAlt

    /**
     * Returns the raw JSON value of [callSign].
     *
     * Unlike [callSign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callSign") @ExcludeMissing fun _callSign(): JsonField<String> = callSign

    /**
     * Returns the raw JSON value of [containment].
     *
     * Unlike [containment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("containment") @ExcludeMissing fun _containment(): JsonField<Double> = containment

    /**
     * Returns the raw JSON value of [contextKeys].
     *
     * Unlike [contextKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contextKeys")
    @ExcludeMissing
    fun _contextKeys(): JsonField<List<String>> = contextKeys

    /**
     * Returns the raw JSON value of [contextValues].
     *
     * Unlike [contextValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contextValues")
    @ExcludeMissing
    fun _contextValues(): JsonField<List<String>> = contextValues

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
     * Returns the raw JSON value of [dropPtInd].
     *
     * Unlike [dropPtInd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dropPtInd") @ExcludeMissing fun _dropPtInd(): JsonField<Boolean> = dropPtInd

    /**
     * Returns the raw JSON value of [emgInd].
     *
     * Unlike [emgInd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emgInd") @ExcludeMissing fun _emgInd(): JsonField<Boolean> = emgInd

    /**
     * Returns the raw JSON value of [env].
     *
     * Unlike [env], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("env") @ExcludeMissing fun _env(): JsonField<Env> = env

    /**
     * Returns the raw JSON value of [impactAlt].
     *
     * Unlike [impactAlt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impactAlt") @ExcludeMissing fun _impactAlt(): JsonField<Double> = impactAlt

    /**
     * Returns the raw JSON value of [impactAouData].
     *
     * Unlike [impactAouData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impactAouData")
    @ExcludeMissing
    fun _impactAouData(): JsonField<List<Double>> = impactAouData

    /**
     * Returns the raw JSON value of [impactAouType].
     *
     * Unlike [impactAouType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impactAouType")
    @ExcludeMissing
    fun _impactAouType(): JsonField<String> = impactAouType

    /**
     * Returns the raw JSON value of [impactConf].
     *
     * Unlike [impactConf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impactConf") @ExcludeMissing fun _impactConf(): JsonField<Double> = impactConf

    /**
     * Returns the raw JSON value of [impactLat].
     *
     * Unlike [impactLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impactLat") @ExcludeMissing fun _impactLat(): JsonField<Double> = impactLat

    /**
     * Returns the raw JSON value of [impactLon].
     *
     * Unlike [impactLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impactLon") @ExcludeMissing fun _impactLon(): JsonField<Double> = impactLon

    /**
     * Returns the raw JSON value of [impactTime].
     *
     * Unlike [impactTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impactTime")
    @ExcludeMissing
    fun _impactTime(): JsonField<OffsetDateTime> = impactTime

    /**
     * Returns the raw JSON value of [infoSource].
     *
     * Unlike [infoSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("infoSource") @ExcludeMissing fun _infoSource(): JsonField<String> = infoSource

    /**
     * Returns the raw JSON value of [launchAlt].
     *
     * Unlike [launchAlt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchAlt") @ExcludeMissing fun _launchAlt(): JsonField<Double> = launchAlt

    /**
     * Returns the raw JSON value of [launchAouData].
     *
     * Unlike [launchAouData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchAouData")
    @ExcludeMissing
    fun _launchAouData(): JsonField<List<Double>> = launchAouData

    /**
     * Returns the raw JSON value of [launchAouType].
     *
     * Unlike [launchAouType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchAouType")
    @ExcludeMissing
    fun _launchAouType(): JsonField<String> = launchAouType

    /**
     * Returns the raw JSON value of [launchAz].
     *
     * Unlike [launchAz], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchAz") @ExcludeMissing fun _launchAz(): JsonField<Double> = launchAz

    /**
     * Returns the raw JSON value of [launchAzUnc].
     *
     * Unlike [launchAzUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchAzUnc") @ExcludeMissing fun _launchAzUnc(): JsonField<Double> = launchAzUnc

    /**
     * Returns the raw JSON value of [launchConf].
     *
     * Unlike [launchConf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchConf") @ExcludeMissing fun _launchConf(): JsonField<Double> = launchConf

    /**
     * Returns the raw JSON value of [launchLat].
     *
     * Unlike [launchLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchLat") @ExcludeMissing fun _launchLat(): JsonField<Double> = launchLat

    /**
     * Returns the raw JSON value of [launchLon].
     *
     * Unlike [launchLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchLon") @ExcludeMissing fun _launchLon(): JsonField<Double> = launchLon

    /**
     * Returns the raw JSON value of [launchTime].
     *
     * Unlike [launchTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchTime")
    @ExcludeMissing
    fun _launchTime(): JsonField<OffsetDateTime> = launchTime

    /**
     * Returns the raw JSON value of [lostTrkInd].
     *
     * Unlike [lostTrkInd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lostTrkInd") @ExcludeMissing fun _lostTrkInd(): JsonField<Boolean> = lostTrkInd

    /**
     * Returns the raw JSON value of [maneuverEnd].
     *
     * Unlike [maneuverEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maneuverEnd")
    @ExcludeMissing
    fun _maneuverEnd(): JsonField<OffsetDateTime> = maneuverEnd

    /**
     * Returns the raw JSON value of [maneuverStart].
     *
     * Unlike [maneuverStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maneuverStart")
    @ExcludeMissing
    fun _maneuverStart(): JsonField<OffsetDateTime> = maneuverStart

    /**
     * Returns the raw JSON value of [msgCreateDate].
     *
     * Unlike [msgCreateDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msgCreateDate")
    @ExcludeMissing
    fun _msgCreateDate(): JsonField<OffsetDateTime> = msgCreateDate

    /**
     * Returns the raw JSON value of [msgSubType].
     *
     * Unlike [msgSubType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msgSubType") @ExcludeMissing fun _msgSubType(): JsonField<String> = msgSubType

    /**
     * Returns the raw JSON value of [msgType].
     *
     * Unlike [msgType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msgType") @ExcludeMissing fun _msgType(): JsonField<String> = msgType

    /**
     * Returns the raw JSON value of [mslStatus].
     *
     * Unlike [mslStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mslStatus") @ExcludeMissing fun _mslStatus(): JsonField<String> = mslStatus

    /**
     * Returns the raw JSON value of [muidSrc].
     *
     * Unlike [muidSrc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("muidSrc") @ExcludeMissing fun _muidSrc(): JsonField<String> = muidSrc

    /**
     * Returns the raw JSON value of [muidSrcTrk].
     *
     * Unlike [muidSrcTrk], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("muidSrcTrk") @ExcludeMissing fun _muidSrcTrk(): JsonField<String> = muidSrcTrk

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [objAct].
     *
     * Unlike [objAct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objAct") @ExcludeMissing fun _objAct(): JsonField<String> = objAct

    /**
     * Returns the raw JSON value of [objIdent].
     *
     * Unlike [objIdent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objIdent") @ExcludeMissing fun _objIdent(): JsonField<ObjIdent> = objIdent

    /**
     * Returns the raw JSON value of [objPlat].
     *
     * Unlike [objPlat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objPlat") @ExcludeMissing fun _objPlat(): JsonField<String> = objPlat

    /**
     * Returns the raw JSON value of [objType].
     *
     * Unlike [objType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objType") @ExcludeMissing fun _objType(): JsonField<String> = objType

    /**
     * Returns the raw JSON value of [objTypeConf].
     *
     * Unlike [objTypeConf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objTypeConf") @ExcludeMissing fun _objTypeConf(): JsonField<Int> = objTypeConf

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
     * Returns the raw JSON value of [parentTrackId].
     *
     * Unlike [parentTrackId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parentTrackId")
    @ExcludeMissing
    fun _parentTrackId(): JsonField<String> = parentTrackId

    /**
     * Returns the raw JSON value of [polarSingLocLat].
     *
     * Unlike [polarSingLocLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarSingLocLat")
    @ExcludeMissing
    fun _polarSingLocLat(): JsonField<Double> = polarSingLocLat

    /**
     * Returns the raw JSON value of [polarSingLocLon].
     *
     * Unlike [polarSingLocLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarSingLocLon")
    @ExcludeMissing
    fun _polarSingLocLon(): JsonField<Double> = polarSingLocLon

    /**
     * Returns the raw JSON value of [senMode].
     *
     * Unlike [senMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senMode") @ExcludeMissing fun _senMode(): JsonField<String> = senMode

    /**
     * Returns the raw JSON value of [spaceAmp].
     *
     * Unlike [spaceAmp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spaceAmp") @ExcludeMissing fun _spaceAmp(): JsonField<String> = spaceAmp

    /**
     * Returns the raw JSON value of [spaceAmpConf].
     *
     * Unlike [spaceAmpConf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spaceAmpConf") @ExcludeMissing fun _spaceAmpConf(): JsonField<Int> = spaceAmpConf

    /**
     * Returns the raw JSON value of [spaceSpecType].
     *
     * Unlike [spaceSpecType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spaceSpecType")
    @ExcludeMissing
    fun _spaceSpecType(): JsonField<String> = spaceSpecType

    /**
     * Returns the raw JSON value of [trackId].
     *
     * Unlike [trackId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackId") @ExcludeMissing fun _trackId(): JsonField<String> = trackId

    /**
     * Returns the raw JSON value of [trkConf].
     *
     * Unlike [trkConf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trkConf") @ExcludeMissing fun _trkConf(): JsonField<Double> = trkConf

    /**
     * Returns the raw JSON value of [trkQual].
     *
     * Unlike [trkQual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trkQual") @ExcludeMissing fun _trkQual(): JsonField<Int> = trkQual

    /**
     * Returns the raw JSON value of [vectors].
     *
     * Unlike [vectors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vectors") @ExcludeMissing fun _vectors(): JsonField<List<Vector>> = vectors

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
        private var source: JsonField<String>? = null
        private var ts: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var acftSubType: JsonField<String> = JsonMissing.of()
        private var alert: JsonField<String> = JsonMissing.of()
        private var angElev: JsonField<Double> = JsonMissing.of()
        private var aouRptData: JsonField<MutableList<Double>>? = null
        private var aouRptType: JsonField<String> = JsonMissing.of()
        private var azCorr: JsonField<Double> = JsonMissing.of()
        private var boosting: JsonField<Boolean> = JsonMissing.of()
        private var burnoutAlt: JsonField<Double> = JsonMissing.of()
        private var callSign: JsonField<String> = JsonMissing.of()
        private var containment: JsonField<Double> = JsonMissing.of()
        private var contextKeys: JsonField<MutableList<String>>? = null
        private var contextValues: JsonField<MutableList<String>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dropPtInd: JsonField<Boolean> = JsonMissing.of()
        private var emgInd: JsonField<Boolean> = JsonMissing.of()
        private var env: JsonField<Env> = JsonMissing.of()
        private var impactAlt: JsonField<Double> = JsonMissing.of()
        private var impactAouData: JsonField<MutableList<Double>>? = null
        private var impactAouType: JsonField<String> = JsonMissing.of()
        private var impactConf: JsonField<Double> = JsonMissing.of()
        private var impactLat: JsonField<Double> = JsonMissing.of()
        private var impactLon: JsonField<Double> = JsonMissing.of()
        private var impactTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var infoSource: JsonField<String> = JsonMissing.of()
        private var launchAlt: JsonField<Double> = JsonMissing.of()
        private var launchAouData: JsonField<MutableList<Double>>? = null
        private var launchAouType: JsonField<String> = JsonMissing.of()
        private var launchAz: JsonField<Double> = JsonMissing.of()
        private var launchAzUnc: JsonField<Double> = JsonMissing.of()
        private var launchConf: JsonField<Double> = JsonMissing.of()
        private var launchLat: JsonField<Double> = JsonMissing.of()
        private var launchLon: JsonField<Double> = JsonMissing.of()
        private var launchTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lostTrkInd: JsonField<Boolean> = JsonMissing.of()
        private var maneuverEnd: JsonField<OffsetDateTime> = JsonMissing.of()
        private var maneuverStart: JsonField<OffsetDateTime> = JsonMissing.of()
        private var msgCreateDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var msgSubType: JsonField<String> = JsonMissing.of()
        private var msgType: JsonField<String> = JsonMissing.of()
        private var mslStatus: JsonField<String> = JsonMissing.of()
        private var muidSrc: JsonField<String> = JsonMissing.of()
        private var muidSrcTrk: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var objAct: JsonField<String> = JsonMissing.of()
        private var objIdent: JsonField<ObjIdent> = JsonMissing.of()
        private var objPlat: JsonField<String> = JsonMissing.of()
        private var objType: JsonField<String> = JsonMissing.of()
        private var objTypeConf: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var parentTrackId: JsonField<String> = JsonMissing.of()
        private var polarSingLocLat: JsonField<Double> = JsonMissing.of()
        private var polarSingLocLon: JsonField<Double> = JsonMissing.of()
        private var senMode: JsonField<String> = JsonMissing.of()
        private var spaceAmp: JsonField<String> = JsonMissing.of()
        private var spaceAmpConf: JsonField<Int> = JsonMissing.of()
        private var spaceSpecType: JsonField<String> = JsonMissing.of()
        private var trackId: JsonField<String> = JsonMissing.of()
        private var trkConf: JsonField<Double> = JsonMissing.of()
        private var trkQual: JsonField<Int> = JsonMissing.of()
        private var vectors: JsonField<MutableList<Vector>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(historyListResponse: HistoryListResponse) = apply {
            classificationMarking = historyListResponse.classificationMarking
            dataMode = historyListResponse.dataMode
            source = historyListResponse.source
            ts = historyListResponse.ts
            id = historyListResponse.id
            acftSubType = historyListResponse.acftSubType
            alert = historyListResponse.alert
            angElev = historyListResponse.angElev
            aouRptData = historyListResponse.aouRptData.map { it.toMutableList() }
            aouRptType = historyListResponse.aouRptType
            azCorr = historyListResponse.azCorr
            boosting = historyListResponse.boosting
            burnoutAlt = historyListResponse.burnoutAlt
            callSign = historyListResponse.callSign
            containment = historyListResponse.containment
            contextKeys = historyListResponse.contextKeys.map { it.toMutableList() }
            contextValues = historyListResponse.contextValues.map { it.toMutableList() }
            createdAt = historyListResponse.createdAt
            createdBy = historyListResponse.createdBy
            dropPtInd = historyListResponse.dropPtInd
            emgInd = historyListResponse.emgInd
            env = historyListResponse.env
            impactAlt = historyListResponse.impactAlt
            impactAouData = historyListResponse.impactAouData.map { it.toMutableList() }
            impactAouType = historyListResponse.impactAouType
            impactConf = historyListResponse.impactConf
            impactLat = historyListResponse.impactLat
            impactLon = historyListResponse.impactLon
            impactTime = historyListResponse.impactTime
            infoSource = historyListResponse.infoSource
            launchAlt = historyListResponse.launchAlt
            launchAouData = historyListResponse.launchAouData.map { it.toMutableList() }
            launchAouType = historyListResponse.launchAouType
            launchAz = historyListResponse.launchAz
            launchAzUnc = historyListResponse.launchAzUnc
            launchConf = historyListResponse.launchConf
            launchLat = historyListResponse.launchLat
            launchLon = historyListResponse.launchLon
            launchTime = historyListResponse.launchTime
            lostTrkInd = historyListResponse.lostTrkInd
            maneuverEnd = historyListResponse.maneuverEnd
            maneuverStart = historyListResponse.maneuverStart
            msgCreateDate = historyListResponse.msgCreateDate
            msgSubType = historyListResponse.msgSubType
            msgType = historyListResponse.msgType
            mslStatus = historyListResponse.mslStatus
            muidSrc = historyListResponse.muidSrc
            muidSrcTrk = historyListResponse.muidSrcTrk
            name = historyListResponse.name
            objAct = historyListResponse.objAct
            objIdent = historyListResponse.objIdent
            objPlat = historyListResponse.objPlat
            objType = historyListResponse.objType
            objTypeConf = historyListResponse.objTypeConf
            origin = historyListResponse.origin
            origNetwork = historyListResponse.origNetwork
            parentTrackId = historyListResponse.parentTrackId
            polarSingLocLat = historyListResponse.polarSingLocLat
            polarSingLocLon = historyListResponse.polarSingLocLon
            senMode = historyListResponse.senMode
            spaceAmp = historyListResponse.spaceAmp
            spaceAmpConf = historyListResponse.spaceAmpConf
            spaceSpecType = historyListResponse.spaceSpecType
            trackId = historyListResponse.trackId
            trkConf = historyListResponse.trkConf
            trkQual = historyListResponse.trkQual
            vectors = historyListResponse.vectors.map { it.toMutableList() }
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
         * The receipt time of the data by the processing system, in ISO8601 UTC format with
         * microsecond precision.
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
         * Subtype is a finer grain categorization of missile types. Examples include but are not
         * limited to SRBM, MRBM, IRBM, LRBM, ICBM, SLBM.
         *
         * &nbsp;SRBM - Short-Range Ballistic Missile
         *
         * &nbsp;MRBM - Medium-Range Ballistic Missile
         *
         * &nbsp;IRBM - Intermediate-Range Ballistic Missile
         *
         * &nbsp;LRBM - Long-Range Ballistic Missile
         *
         * &nbsp;ICBM - Intercontinental Ballistic Missile
         *
         * &nbsp;SLBM - Submarine-Launched Ballistic Missile.
         */
        fun acftSubType(acftSubType: String) = acftSubType(JsonField.of(acftSubType))

        /**
         * Sets [Builder.acftSubType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acftSubType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun acftSubType(acftSubType: JsonField<String>) = apply { this.acftSubType = acftSubType }

        /**
         * A track may be designated as a non-alert track or an alert track.
         *
         * Examples include but are not limited to:
         *
         * &nbsp;Non-alert tracks – choose None (Blank).
         *
         * &nbsp;Alert tracks – enter the proper alert classification:
         *
         * &nbsp;HIT - High Interest Track
         *
         * &nbsp;TGT - Target
         *
         * &nbsp;SUS - Suspect Carrier
         *
         * &nbsp;NSP - Cleared Suspect.
         */
        fun alert(alert: String) = alert(JsonField.of(alert))

        /**
         * Sets [Builder.alert] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alert] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alert(alert: JsonField<String>) = apply { this.alert = alert }

        /** Angle of elevation/depression between observer and missile in degrees. */
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
         * &nbsp;ELLIPSE:
         *
         * &nbsp;&nbsp;brg - orientation in degrees of the ellipse
         *
         * &nbsp;&nbsp;a1 - semi-major axis in kilometers
         *
         * &nbsp;&nbsp;a2 - semi-minor axis in kilometers
         *
         * &nbsp;BEARING (BEARING BOX or MTST BEARING BOX):
         *
         * &nbsp;&nbsp;brg - orientation in degrees of the bearing box
         *
         * &nbsp;&nbsp;a1 - length of bearing box in kilometers
         *
         * &nbsp;&nbsp;a2 - half-width of bearing box in kilometers
         *
         * &nbsp;OTHER (All other type values):
         *
         * &nbsp;&nbsp;brg - line of bearing in degrees true
         *
         * &nbsp;&nbsp;a1 - bearing error in degrees
         *
         * &nbsp;&nbsp;a2 - estimated range in kilometers.
         */
        fun aouRptData(aouRptData: List<Double>) = aouRptData(JsonField.of(aouRptData))

        /**
         * Sets [Builder.aouRptData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aouRptData] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aouRptData(aouRptData: JsonField<List<Double>>) = apply {
            this.aouRptData = aouRptData.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.aouRptData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAouRptData(aouRptData: Double) = apply {
            this.aouRptData =
                (this.aouRptData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("aouRptData", it).add(aouRptData)
                }
        }

        /**
         * The Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition. This type
         * defines the elements of the aouEllp array and is required if aouEllp is not null. See the
         * aouEllp field definition for specific information.
         */
        fun aouRptType(aouRptType: String) = aouRptType(JsonField.of(aouRptType))

        /**
         * Sets [Builder.aouRptType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aouRptType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aouRptType(aouRptType: JsonField<String>) = apply { this.aouRptType = aouRptType }

        /** Missile azimuth corridor data. */
        fun azCorr(azCorr: Double) = azCorr(JsonField.of(azCorr))

        /**
         * Sets [Builder.azCorr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azCorr] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun azCorr(azCorr: JsonField<Double>) = apply { this.azCorr = azCorr }

        /** Indicates whether or not the missile is currently in a state of boosting. */
        fun boosting(boosting: Boolean) = boosting(JsonField.of(boosting))

        /**
         * Sets [Builder.boosting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.boosting] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun boosting(boosting: JsonField<Boolean>) = apply { this.boosting = boosting }

        /** Track point burnout altitude relative to WGS-84 ellipsoid, in kilometers. */
        fun burnoutAlt(burnoutAlt: Double) = burnoutAlt(JsonField.of(burnoutAlt))

        /**
         * Sets [Builder.burnoutAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.burnoutAlt] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun burnoutAlt(burnoutAlt: JsonField<Double>) = apply { this.burnoutAlt = burnoutAlt }

        /** The call sign currently assigned to the track object. */
        fun callSign(callSign: String) = callSign(JsonField.of(callSign))

        /**
         * Sets [Builder.callSign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSign] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callSign(callSign: JsonField<String>) = apply { this.callSign = callSign }

        /**
         * The percentage of time that the estimated AoU will "cover" the true position of the
         * track.
         */
        fun containment(containment: Double) = containment(JsonField.of(containment))

        /**
         * Sets [Builder.containment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.containment] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun containment(containment: JsonField<Double>) = apply { this.containment = containment }

        /**
         * An optional string array containing additional data (keys) representing relevant items
         * for context of fields not specifically defined in this schema. This array is paired with
         * the contextValues string array and must contain the same number of items. Please note
         * these fields are intended for contextual use only and do not pertain to core schema
         * information. To ensure proper integration and avoid misuse, coordination of how these
         * fields are populated and consumed is required during onboarding.
         */
        fun contextKeys(contextKeys: List<String>) = contextKeys(JsonField.of(contextKeys))

        /**
         * Sets [Builder.contextKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contextKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contextKeys(contextKeys: JsonField<List<String>>) = apply {
            this.contextKeys = contextKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [contextKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContextKey(contextKey: String) = apply {
            contextKeys =
                (contextKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("contextKeys", it).add(contextKey)
                }
        }

        /**
         * An optional string array containing the values associated with the contextKeys array.
         * This array is paired with the contextKeys string array and must contain the same number
         * of items. Please note these fields are intended for contextual use only and do not
         * pertain to core schema information. To ensure proper integration and avoid misuse,
         * coordination of how these fields are populated and consumed is required during
         * onboarding.
         */
        fun contextValues(contextValues: List<String>) = contextValues(JsonField.of(contextValues))

        /**
         * Sets [Builder.contextValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contextValues] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contextValues(contextValues: JsonField<List<String>>) = apply {
            this.contextValues = contextValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [contextValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContextValue(contextValue: String) = apply {
            contextValues =
                (contextValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("contextValues", it).add(contextValue)
                }
        }

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

        /** The drop-point indicator setting. */
        fun dropPtInd(dropPtInd: Boolean) = dropPtInd(JsonField.of(dropPtInd))

        /**
         * Sets [Builder.dropPtInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dropPtInd] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dropPtInd(dropPtInd: JsonField<Boolean>) = apply { this.dropPtInd = dropPtInd }

        /** Indicates whether or not a track has an emergency. */
        fun emgInd(emgInd: Boolean) = emgInd(JsonField.of(emgInd))

        /**
         * Sets [Builder.emgInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emgInd] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun emgInd(emgInd: JsonField<Boolean>) = apply { this.emgInd = emgInd }

        /**
         * The track environment type (AIR, LAND, SPACE, SUBSURFACE, SURFACE, UNKNOWN):
         *
         * AIR: Between sea level and the Kármán line, which has an altitude of 100 kilometers (62
         * miles).
         *
         * LAND: On the surface of dry land.
         *
         * SPACE: Above the Kármán line, which has an altitude of 100 kilometers (62 miles).
         *
         * SURFACE: On the surface of a body of water.
         *
         * SUBSURFACE: Below the surface of a body of water.
         *
         * UNKNOWN: Environment is not known.
         */
        fun env(env: Env) = env(JsonField.of(env))

        /**
         * Sets [Builder.env] to an arbitrary JSON value.
         *
         * You should usually call [Builder.env] with a well-typed [Env] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun env(env: JsonField<Env>) = apply { this.env = env }

        /** Estimated impact point altitude relative to WGS-84 ellipsoid, in kilometers. */
        fun impactAlt(impactAlt: Double) = impactAlt(JsonField.of(impactAlt))

        /**
         * Sets [Builder.impactAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impactAlt] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun impactAlt(impactAlt: JsonField<Double>) = apply { this.impactAlt = impactAlt }

        /**
         * Three element array representing an Area of Uncertainty (AoU). The array element
         * definitions and units are type specific depending on the aouType specified in this
         * record:
         *
         * &nbsp;ELLIPSE:
         *
         * &nbsp;&nbsp;brg - orientation in degrees of the ellipse
         *
         * &nbsp;&nbsp;a1 - semi-major axis in kilometers
         *
         * &nbsp;&nbsp;a2 - semi-minor axis in kilometers
         *
         * &nbsp;BEARING (BEARING BOX or MTST BEARING BOX):
         *
         * &nbsp;&nbsp;brg - orientation in degrees of the bearing box
         *
         * &nbsp;&nbsp;a1 - length of bearing box in kilometers
         *
         * &nbsp;&nbsp;a2 - half-width of bearing box in kilometers
         *
         * &nbsp;OTHER (All other type values):
         *
         * &nbsp;&nbsp;brg - line of bearing in degrees true
         *
         * &nbsp;&nbsp;a1 - bearing error in degrees
         *
         * &nbsp;&nbsp;a2 - estimated range in kilometers.
         */
        fun impactAouData(impactAouData: List<Double>) = impactAouData(JsonField.of(impactAouData))

        /**
         * Sets [Builder.impactAouData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impactAouData] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun impactAouData(impactAouData: JsonField<List<Double>>) = apply {
            this.impactAouData = impactAouData.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.impactAouData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addImpactAouData(impactAouData: Double) = apply {
            this.impactAouData =
                (this.impactAouData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("impactAouData", it).add(impactAouData)
                }
        }

        /**
         * The Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition. This type
         * defines the elements of the aouEllp array and is required if aouEllp is not null. See the
         * aouEllp field definition for specific information.
         */
        fun impactAouType(impactAouType: String) = impactAouType(JsonField.of(impactAouType))

        /**
         * Sets [Builder.impactAouType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impactAouType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun impactAouType(impactAouType: JsonField<String>) = apply {
            this.impactAouType = impactAouType
        }

        /** Confidence level of the impact point estimate. 0 - 100 percent. */
        fun impactConf(impactConf: Double) = impactConf(JsonField.of(impactConf))

        /**
         * Sets [Builder.impactConf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impactConf] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun impactConf(impactConf: JsonField<Double>) = apply { this.impactConf = impactConf }

        /**
         * WGS-84 latitude of the missile object impact point, in degrees. -90 to 90 degrees
         * (negative values south of equator).
         */
        fun impactLat(impactLat: Double) = impactLat(JsonField.of(impactLat))

        /**
         * Sets [Builder.impactLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impactLat] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun impactLat(impactLat: JsonField<Double>) = apply { this.impactLat = impactLat }

        /**
         * WGS-84 longitude of the missile object impact point, in degrees. -180 to 180 degrees
         * (negative values west of Prime Meridian).
         */
        fun impactLon(impactLon: Double) = impactLon(JsonField.of(impactLon))

        /**
         * Sets [Builder.impactLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impactLon] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun impactLon(impactLon: JsonField<Double>) = apply { this.impactLon = impactLon }

        /** Estimated time of impact timestamp in ISO8601 UTC format with microsecond precision. */
        fun impactTime(impactTime: OffsetDateTime) = impactTime(JsonField.of(impactTime))

        /**
         * Sets [Builder.impactTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impactTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun impactTime(impactTime: JsonField<OffsetDateTime>) = apply {
            this.impactTime = impactTime
        }

        /** Source code for source of information used to detect track. */
        fun infoSource(infoSource: String) = infoSource(JsonField.of(infoSource))

        /**
         * Sets [Builder.infoSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.infoSource] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun infoSource(infoSource: JsonField<String>) = apply { this.infoSource = infoSource }

        /** Estimated launch point altitude relative to WGS-84 ellipsoid, in kilometers. */
        fun launchAlt(launchAlt: Double) = launchAlt(JsonField.of(launchAlt))

        /**
         * Sets [Builder.launchAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchAlt] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchAlt(launchAlt: JsonField<Double>) = apply { this.launchAlt = launchAlt }

        /**
         * Three element array representing an Area of Uncertainty (AoU). The array element
         * definitions and units are type specific depending on the aouType specified in this
         * record:
         *
         * &nbsp;ELLIPSE:
         *
         * &nbsp;&nbsp;brg - orientation in degrees of the ellipse
         *
         * &nbsp;&nbsp;a1 - semi-major axis in kilometers
         *
         * &nbsp;&nbsp;a2 - semi-minor axis in kilometers
         *
         * &nbsp;BEARING (BEARING BOX or MTST BEARING BOX):
         *
         * &nbsp;&nbsp;brg - orientation in degrees of the bearing box
         *
         * &nbsp;&nbsp;a1 - length of bearing box in kilometers
         *
         * &nbsp;&nbsp;a2 - half-width of bearing box in kilometers
         *
         * &nbsp;OTHER (All other type values):
         *
         * &nbsp;&nbsp;brg - line of bearing in degrees true
         *
         * &nbsp;&nbsp;a1 - bearing error in degrees
         *
         * &nbsp;&nbsp;a2 - estimated range in kilometers.
         */
        fun launchAouData(launchAouData: List<Double>) = launchAouData(JsonField.of(launchAouData))

        /**
         * Sets [Builder.launchAouData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchAouData] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchAouData(launchAouData: JsonField<List<Double>>) = apply {
            this.launchAouData = launchAouData.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.launchAouData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLaunchAouData(launchAouData: Double) = apply {
            this.launchAouData =
                (this.launchAouData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("launchAouData", it).add(launchAouData)
                }
        }

        /**
         * The Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition. This type
         * defines the elements of the aouEllp array and is required if aouEllp is not null. See the
         * aouEllp field definition for specific information.
         */
        fun launchAouType(launchAouType: String) = launchAouType(JsonField.of(launchAouType))

        /**
         * Sets [Builder.launchAouType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchAouType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchAouType(launchAouType: JsonField<String>) = apply {
            this.launchAouType = launchAouType
        }

        /**
         * Angle between true north and the object's current position, with respect to the launch
         * point, in degrees. 0 to 360 degrees.
         */
        fun launchAz(launchAz: Double) = launchAz(JsonField.of(launchAz))

        /**
         * Sets [Builder.launchAz] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchAz] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun launchAz(launchAz: JsonField<Double>) = apply { this.launchAz = launchAz }

        /** Uncertainty of the launch azimuth, in degrees. */
        fun launchAzUnc(launchAzUnc: Double) = launchAzUnc(JsonField.of(launchAzUnc))

        /**
         * Sets [Builder.launchAzUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchAzUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchAzUnc(launchAzUnc: JsonField<Double>) = apply { this.launchAzUnc = launchAzUnc }

        /** Confidence level in the accuracy of the launch point estimate. 0 - 100 percent. */
        fun launchConf(launchConf: Double) = launchConf(JsonField.of(launchConf))

        /**
         * Sets [Builder.launchConf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchConf] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchConf(launchConf: JsonField<Double>) = apply { this.launchConf = launchConf }

        /**
         * WGS-84 latitude of the missile launch point, in degrees. -90 to 90 degrees (negative
         * values south of equator).
         */
        fun launchLat(launchLat: Double) = launchLat(JsonField.of(launchLat))

        /**
         * Sets [Builder.launchLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchLat] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchLat(launchLat: JsonField<Double>) = apply { this.launchLat = launchLat }

        /**
         * WGS-84 longitude of the missile launch point, in degrees. -180 to 180 degrees (negative
         * values west of Prime Meridian).
         */
        fun launchLon(launchLon: Double) = launchLon(JsonField.of(launchLon))

        /**
         * Sets [Builder.launchLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchLon] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchLon(launchLon: JsonField<Double>) = apply { this.launchLon = launchLon }

        /** Missile launch timestamp in ISO8601 UTC format with microsecond precision. */
        fun launchTime(launchTime: OffsetDateTime) = launchTime(JsonField.of(launchTime))

        /**
         * Sets [Builder.launchTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchTime(launchTime: JsonField<OffsetDateTime>) = apply {
            this.launchTime = launchTime
        }

        /** Indicates whether or not the missile is considered lost. */
        fun lostTrkInd(lostTrkInd: Boolean) = lostTrkInd(JsonField.of(lostTrkInd))

        /**
         * Sets [Builder.lostTrkInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lostTrkInd] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lostTrkInd(lostTrkInd: JsonField<Boolean>) = apply { this.lostTrkInd = lostTrkInd }

        /** Maneuver end time, in ISO 8601 UTC format with microsecond precision. */
        fun maneuverEnd(maneuverEnd: OffsetDateTime) = maneuverEnd(JsonField.of(maneuverEnd))

        /**
         * Sets [Builder.maneuverEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maneuverEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maneuverEnd(maneuverEnd: JsonField<OffsetDateTime>) = apply {
            this.maneuverEnd = maneuverEnd
        }

        /** Maneuver start time, in ISO 8601 UTC format with microsecond precision. */
        fun maneuverStart(maneuverStart: OffsetDateTime) =
            maneuverStart(JsonField.of(maneuverStart))

        /**
         * Sets [Builder.maneuverStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maneuverStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maneuverStart(maneuverStart: JsonField<OffsetDateTime>) = apply {
            this.maneuverStart = maneuverStart
        }

        /**
         * The timestamp of the external message from which this request originated, if applicable,
         * in ISO8601 UTC format with millisecond precision.
         */
        fun msgCreateDate(msgCreateDate: OffsetDateTime) =
            msgCreateDate(JsonField.of(msgCreateDate))

        /**
         * Sets [Builder.msgCreateDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msgCreateDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun msgCreateDate(msgCreateDate: JsonField<OffsetDateTime>) = apply {
            this.msgCreateDate = msgCreateDate
        }

        /**
         * The message subtype is a finer grain categorization of message types as many messages can
         * contain a variety of data content within the same structure. Examples include but are not
         * limited to Initial, Final, Launch, Update, etc. Users should consult the appropriate
         * documentation, based on the message type, for the definitions of the subtypes that apply
         * to that message.
         */
        fun msgSubType(msgSubType: String) = msgSubType(JsonField.of(msgSubType))

        /**
         * Sets [Builder.msgSubType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msgSubType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun msgSubType(msgSubType: JsonField<String>) = apply { this.msgSubType = msgSubType }

        /** The type of external message from which this request originated. */
        fun msgType(msgType: String) = msgType(JsonField.of(msgType))

        /**
         * Sets [Builder.msgType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msgType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun msgType(msgType: JsonField<String>) = apply { this.msgType = msgType }

        /**
         * Missile status enumeration examples include but are not limited to:
         *
         * &nbsp;AT LAUNCH
         *
         * &nbsp;AT OBSERVATION
         *
         * &nbsp;FLYING
         *
         * &nbsp;IMPACTED
         *
         * &nbsp;LOST
         *
         * &nbsp;STALE
         *
         * &nbsp;DEBRIS.
         */
        fun mslStatus(mslStatus: String) = mslStatus(JsonField.of(mslStatus))

        /**
         * Sets [Builder.mslStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mslStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mslStatus(mslStatus: JsonField<String>) = apply { this.mslStatus = mslStatus }

        /** Source of the missile-unique identifier (MUID). */
        fun muidSrc(muidSrc: String) = muidSrc(JsonField.of(muidSrc))

        /**
         * Sets [Builder.muidSrc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.muidSrc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun muidSrc(muidSrc: JsonField<String>) = apply { this.muidSrc = muidSrc }

        /** Track ID for the source of the missile-unique identifier. */
        fun muidSrcTrk(muidSrcTrk: String) = muidSrcTrk(JsonField.of(muidSrcTrk))

        /**
         * Sets [Builder.muidSrcTrk] to an arbitrary JSON value.
         *
         * You should usually call [Builder.muidSrcTrk] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun muidSrcTrk(muidSrcTrk: JsonField<String>) = apply { this.muidSrcTrk = muidSrcTrk }

        /** Track name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Space activity (examples: RECONNAISSANCE, ANTISPACE WARFARE, TELEVISION). The activity in
         * which the track object is engaged. Intended as, but not constrained to, MIL-STD-6016
         * environment dependent activity designations. The activity can be reported as either a
         * combination of the code and environment (e.g. 65/AIR) or as the descriptive enumeration
         * (e.g. DIVERTING), which are equivalent.
         */
        fun objAct(objAct: String) = objAct(JsonField.of(objAct))

        /**
         * Sets [Builder.objAct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objAct] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objAct(objAct: JsonField<String>) = apply { this.objAct = objAct }

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

        /**
         * Space Platform field along with the Space Activity field further defines the identity of
         * a Space track (examples: SATELLITE, WEAPON, PATROL). The object platform type. Intended
         * as, but not constrained to, MIL-STD-6016 environment dependent platform type
         * designations. The platform type can be reported as either a combination of the code and
         * environment (e.g. 14/LAND) or as the descriptive representations (e.g. COMBAT VEHICLE),
         * which are equivalent.
         */
        fun objPlat(objPlat: String) = objPlat(JsonField.of(objPlat))

        /**
         * Sets [Builder.objPlat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objPlat] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objPlat(objPlat: JsonField<String>) = apply { this.objPlat = objPlat }

        /**
         * The type of object to which this record refers. The object type may be updated in later
         * records based on assessment of additional data.
         */
        fun objType(objType: String) = objType(JsonField.of(objType))

        /**
         * Sets [Builder.objType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objType(objType: JsonField<String>) = apply { this.objType = objType }

        /** Confidence of the object type, 0-100. */
        fun objTypeConf(objTypeConf: Int) = objTypeConf(JsonField.of(objTypeConf))

        /**
         * Sets [Builder.objTypeConf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objTypeConf] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objTypeConf(objTypeConf: JsonField<Int>) = apply { this.objTypeConf = objTypeConf }

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
         * Track ID of the parent track, within the originating system, from which the track was
         * developed.
         */
        fun parentTrackId(parentTrackId: String) = parentTrackId(JsonField.of(parentTrackId))

        /**
         * Sets [Builder.parentTrackId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentTrackId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentTrackId(parentTrackId: JsonField<String>) = apply {
            this.parentTrackId = parentTrackId
        }

        /** Azimuth corridor reference point latitude. */
        fun polarSingLocLat(polarSingLocLat: Double) =
            polarSingLocLat(JsonField.of(polarSingLocLat))

        /**
         * Sets [Builder.polarSingLocLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarSingLocLat] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun polarSingLocLat(polarSingLocLat: JsonField<Double>) = apply {
            this.polarSingLocLat = polarSingLocLat
        }

        /** Azimuth corridor reference point longitude. */
        fun polarSingLocLon(polarSingLocLon: Double) =
            polarSingLocLon(JsonField.of(polarSingLocLon))

        /**
         * Sets [Builder.polarSingLocLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarSingLocLon] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun polarSingLocLon(polarSingLocLon: JsonField<Double>) = apply {
            this.polarSingLocLon = polarSingLocLon
        }

        /** Last report type received from the sensor (for example, OBSBO = observation burnout). */
        fun senMode(senMode: String) = senMode(JsonField.of(senMode))

        /**
         * Sets [Builder.senMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senMode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senMode(senMode: JsonField<String>) = apply { this.senMode = senMode }

        /**
         * Space amplification indicates additional information on the space environment being
         * reported (examples: NUCLEAR WARHEAD, FUEL-AIR EXPLOSIVE WARHEAD, DEBRIS).
         */
        fun spaceAmp(spaceAmp: String) = spaceAmp(JsonField.of(spaceAmp))

        /**
         * Sets [Builder.spaceAmp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spaceAmp] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spaceAmp(spaceAmp: JsonField<String>) = apply { this.spaceAmp = spaceAmp }

        /** Confidence level of the amplifying characteristics. Values range from 0 to 6. */
        fun spaceAmpConf(spaceAmpConf: Int) = spaceAmpConf(JsonField.of(spaceAmpConf))

        /**
         * Sets [Builder.spaceAmpConf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spaceAmpConf] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spaceAmpConf(spaceAmpConf: JsonField<Int>) = apply { this.spaceAmpConf = spaceAmpConf }

        /** Specific type of point or track with an environment of space. */
        fun spaceSpecType(spaceSpecType: String) = spaceSpecType(JsonField.of(spaceSpecType))

        /**
         * Sets [Builder.spaceSpecType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spaceSpecType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spaceSpecType(spaceSpecType: JsonField<String>) = apply {
            this.spaceSpecType = spaceSpecType
        }

        /** Track ID within the originating system. */
        fun trackId(trackId: String) = trackId(JsonField.of(trackId))

        /**
         * Sets [Builder.trackId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trackId(trackId: JsonField<String>) = apply { this.trackId = trackId }

        /**
         * Overall track confidence estimate (not standardized, but typically a value between 0 and
         * 1, with 0 indicating lowest confidence).
         */
        fun trkConf(trkConf: Double) = trkConf(JsonField.of(trkConf))

        /**
         * Sets [Builder.trkConf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trkConf] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trkConf(trkConf: JsonField<Double>) = apply { this.trkConf = trkConf }

        /**
         * Track Quality is reported as an integer from 0-15. Track Quality specifies the
         * reliability of the positional information of a reported track, with higher values
         * indicating higher track quality; i.e., lower errors in reported position.
         */
        fun trkQual(trkQual: Int) = trkQual(JsonField.of(trkQual))

        /**
         * Sets [Builder.trkQual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trkQual] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trkQual(trkQual: JsonField<Int>) = apply { this.trkQual = trkQual }

        /**
         * Array of MissileTrackVector objects. Missile track vectors are cartesian vectors of
         * position, velocity, and acceleration that, together with their time, 'epoch', uniquely
         * determine the trajectory of the missile. ECEF is the preferred coordinate frame but in
         * some cases data may be in another frame as specified by 'referenceFrame', depending on
         * the provider.
         */
        fun vectors(vectors: List<Vector>) = vectors(JsonField.of(vectors))

        /**
         * Sets [Builder.vectors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vectors] with a well-typed `List<Vector>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vectors(vectors: JsonField<List<Vector>>) = apply {
            this.vectors = vectors.map { it.toMutableList() }
        }

        /**
         * Adds a single [Vector] to [vectors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVector(vector: Vector) = apply {
            vectors =
                (vectors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("vectors", it).add(vector)
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
         * Returns an immutable instance of [HistoryListResponse].
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
        fun build(): HistoryListResponse =
            HistoryListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                checkRequired("ts", ts),
                id,
                acftSubType,
                alert,
                angElev,
                (aouRptData ?: JsonMissing.of()).map { it.toImmutable() },
                aouRptType,
                azCorr,
                boosting,
                burnoutAlt,
                callSign,
                containment,
                (contextKeys ?: JsonMissing.of()).map { it.toImmutable() },
                (contextValues ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                createdBy,
                dropPtInd,
                emgInd,
                env,
                impactAlt,
                (impactAouData ?: JsonMissing.of()).map { it.toImmutable() },
                impactAouType,
                impactConf,
                impactLat,
                impactLon,
                impactTime,
                infoSource,
                launchAlt,
                (launchAouData ?: JsonMissing.of()).map { it.toImmutable() },
                launchAouType,
                launchAz,
                launchAzUnc,
                launchConf,
                launchLat,
                launchLon,
                launchTime,
                lostTrkInd,
                maneuverEnd,
                maneuverStart,
                msgCreateDate,
                msgSubType,
                msgType,
                mslStatus,
                muidSrc,
                muidSrcTrk,
                name,
                objAct,
                objIdent,
                objPlat,
                objType,
                objTypeConf,
                origin,
                origNetwork,
                parentTrackId,
                polarSingLocLat,
                polarSingLocLon,
                senMode,
                spaceAmp,
                spaceAmpConf,
                spaceSpecType,
                trackId,
                trkConf,
                trkQual,
                (vectors ?: JsonMissing.of()).map { it.toImmutable() },
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
        source()
        ts()
        id()
        acftSubType()
        alert()
        angElev()
        aouRptData()
        aouRptType()
        azCorr()
        boosting()
        burnoutAlt()
        callSign()
        containment()
        contextKeys()
        contextValues()
        createdAt()
        createdBy()
        dropPtInd()
        emgInd()
        env().ifPresent { it.validate() }
        impactAlt()
        impactAouData()
        impactAouType()
        impactConf()
        impactLat()
        impactLon()
        impactTime()
        infoSource()
        launchAlt()
        launchAouData()
        launchAouType()
        launchAz()
        launchAzUnc()
        launchConf()
        launchLat()
        launchLon()
        launchTime()
        lostTrkInd()
        maneuverEnd()
        maneuverStart()
        msgCreateDate()
        msgSubType()
        msgType()
        mslStatus()
        muidSrc()
        muidSrcTrk()
        name()
        objAct()
        objIdent().ifPresent { it.validate() }
        objPlat()
        objType()
        objTypeConf()
        origin()
        origNetwork()
        parentTrackId()
        polarSingLocLat()
        polarSingLocLon()
        senMode()
        spaceAmp()
        spaceAmpConf()
        spaceSpecType()
        trackId()
        trkConf()
        trkQual()
        vectors().ifPresent { it.forEach { it.validate() } }
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
            (if (acftSubType.asKnown().isPresent) 1 else 0) +
            (if (alert.asKnown().isPresent) 1 else 0) +
            (if (angElev.asKnown().isPresent) 1 else 0) +
            (aouRptData.asKnown().getOrNull()?.size ?: 0) +
            (if (aouRptType.asKnown().isPresent) 1 else 0) +
            (if (azCorr.asKnown().isPresent) 1 else 0) +
            (if (boosting.asKnown().isPresent) 1 else 0) +
            (if (burnoutAlt.asKnown().isPresent) 1 else 0) +
            (if (callSign.asKnown().isPresent) 1 else 0) +
            (if (containment.asKnown().isPresent) 1 else 0) +
            (contextKeys.asKnown().getOrNull()?.size ?: 0) +
            (contextValues.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dropPtInd.asKnown().isPresent) 1 else 0) +
            (if (emgInd.asKnown().isPresent) 1 else 0) +
            (env.asKnown().getOrNull()?.validity() ?: 0) +
            (if (impactAlt.asKnown().isPresent) 1 else 0) +
            (impactAouData.asKnown().getOrNull()?.size ?: 0) +
            (if (impactAouType.asKnown().isPresent) 1 else 0) +
            (if (impactConf.asKnown().isPresent) 1 else 0) +
            (if (impactLat.asKnown().isPresent) 1 else 0) +
            (if (impactLon.asKnown().isPresent) 1 else 0) +
            (if (impactTime.asKnown().isPresent) 1 else 0) +
            (if (infoSource.asKnown().isPresent) 1 else 0) +
            (if (launchAlt.asKnown().isPresent) 1 else 0) +
            (launchAouData.asKnown().getOrNull()?.size ?: 0) +
            (if (launchAouType.asKnown().isPresent) 1 else 0) +
            (if (launchAz.asKnown().isPresent) 1 else 0) +
            (if (launchAzUnc.asKnown().isPresent) 1 else 0) +
            (if (launchConf.asKnown().isPresent) 1 else 0) +
            (if (launchLat.asKnown().isPresent) 1 else 0) +
            (if (launchLon.asKnown().isPresent) 1 else 0) +
            (if (launchTime.asKnown().isPresent) 1 else 0) +
            (if (lostTrkInd.asKnown().isPresent) 1 else 0) +
            (if (maneuverEnd.asKnown().isPresent) 1 else 0) +
            (if (maneuverStart.asKnown().isPresent) 1 else 0) +
            (if (msgCreateDate.asKnown().isPresent) 1 else 0) +
            (if (msgSubType.asKnown().isPresent) 1 else 0) +
            (if (msgType.asKnown().isPresent) 1 else 0) +
            (if (mslStatus.asKnown().isPresent) 1 else 0) +
            (if (muidSrc.asKnown().isPresent) 1 else 0) +
            (if (muidSrcTrk.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (objAct.asKnown().isPresent) 1 else 0) +
            (objIdent.asKnown().getOrNull()?.validity() ?: 0) +
            (if (objPlat.asKnown().isPresent) 1 else 0) +
            (if (objType.asKnown().isPresent) 1 else 0) +
            (if (objTypeConf.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (parentTrackId.asKnown().isPresent) 1 else 0) +
            (if (polarSingLocLat.asKnown().isPresent) 1 else 0) +
            (if (polarSingLocLon.asKnown().isPresent) 1 else 0) +
            (if (senMode.asKnown().isPresent) 1 else 0) +
            (if (spaceAmp.asKnown().isPresent) 1 else 0) +
            (if (spaceAmpConf.asKnown().isPresent) 1 else 0) +
            (if (spaceSpecType.asKnown().isPresent) 1 else 0) +
            (if (trackId.asKnown().isPresent) 1 else 0) +
            (if (trkConf.asKnown().isPresent) 1 else 0) +
            (if (trkQual.asKnown().isPresent) 1 else 0) +
            (vectors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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
     * The track environment type (AIR, LAND, SPACE, SUBSURFACE, SURFACE, UNKNOWN):
     *
     * AIR: Between sea level and the Kármán line, which has an altitude of 100 kilometers (62
     * miles).
     *
     * LAND: On the surface of dry land.
     *
     * SPACE: Above the Kármán line, which has an altitude of 100 kilometers (62 miles).
     *
     * SURFACE: On the surface of a body of water.
     *
     * SUBSURFACE: Below the surface of a body of water.
     *
     * UNKNOWN: Environment is not known.
     */
    class Env @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AIR = of("AIR")

            @JvmField val LAND = of("LAND")

            @JvmField val SPACE = of("SPACE")

            @JvmField val SURFACE = of("SURFACE")

            @JvmField val SUBSURFACE = of("SUBSURFACE")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = Env(JsonField.of(value))
        }

        /** An enum containing [Env]'s known values. */
        enum class Known {
            AIR,
            LAND,
            SPACE,
            SURFACE,
            SUBSURFACE,
            UNKNOWN,
        }

        /**
         * An enum containing [Env]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Env] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AIR,
            LAND,
            SPACE,
            SURFACE,
            SUBSURFACE,
            UNKNOWN,
            /** An enum member indicating that [Env] was instantiated with an unknown value. */
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
                AIR -> Value.AIR
                LAND -> Value.LAND
                SPACE -> Value.SPACE
                SURFACE -> Value.SURFACE
                SUBSURFACE -> Value.SUBSURFACE
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
                AIR -> Known.AIR
                LAND -> Known.LAND
                SPACE -> Known.SPACE
                SURFACE -> Known.SURFACE
                SUBSURFACE -> Known.SUBSURFACE
                UNKNOWN -> Known.UNKNOWN
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Env: $value")
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

        fun validate(): Env = apply {
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

            return other is Env && value == other.value
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

            return other is ObjIdent && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Schema for Missile Track Vector data. */
    class Vector
    private constructor(
        private val epoch: JsonField<OffsetDateTime>,
        private val accel: JsonField<List<Double>>,
        private val confidence: JsonField<Int>,
        private val contextKeys: JsonField<List<String>>,
        private val contextValues: JsonField<List<String>>,
        private val course: JsonField<Double>,
        private val cov: JsonField<List<Double>>,
        private val covReferenceFrame: JsonField<CovReferenceFrame>,
        private val flightAz: JsonField<Double>,
        private val idSensor: JsonField<String>,
        private val object_: JsonField<String>,
        private val origSensorId: JsonField<String>,
        private val pos: JsonField<List<Double>>,
        private val propagated: JsonField<Boolean>,
        private val quat: JsonField<List<Double>>,
        private val range: JsonField<Double>,
        private val referenceFrame: JsonField<String>,
        private val spd: JsonField<Double>,
        private val status: JsonField<String>,
        private val timeSource: JsonField<String>,
        private val type: JsonField<String>,
        private val vectorAlt: JsonField<Double>,
        private val vectorLat: JsonField<Double>,
        private val vectorLon: JsonField<Double>,
        private val vectorTrackId: JsonField<String>,
        private val vel: JsonField<List<Double>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("epoch")
            @ExcludeMissing
            epoch: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("accel")
            @ExcludeMissing
            accel: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("confidence")
            @ExcludeMissing
            confidence: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("contextKeys")
            @ExcludeMissing
            contextKeys: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("contextValues")
            @ExcludeMissing
            contextValues: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("course") @ExcludeMissing course: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cov") @ExcludeMissing cov: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("covReferenceFrame")
            @ExcludeMissing
            covReferenceFrame: JsonField<CovReferenceFrame> = JsonMissing.of(),
            @JsonProperty("flightAz")
            @ExcludeMissing
            flightAz: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("idSensor")
            @ExcludeMissing
            idSensor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origSensorId")
            @ExcludeMissing
            origSensorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pos") @ExcludeMissing pos: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("propagated")
            @ExcludeMissing
            propagated: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("quat") @ExcludeMissing quat: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("range") @ExcludeMissing range: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("referenceFrame")
            @ExcludeMissing
            referenceFrame: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spd") @ExcludeMissing spd: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeSource")
            @ExcludeMissing
            timeSource: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vectorAlt")
            @ExcludeMissing
            vectorAlt: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("vectorLat")
            @ExcludeMissing
            vectorLat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("vectorLon")
            @ExcludeMissing
            vectorLon: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("vectorTrackId")
            @ExcludeMissing
            vectorTrackId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vel") @ExcludeMissing vel: JsonField<List<Double>> = JsonMissing.of(),
        ) : this(
            epoch,
            accel,
            confidence,
            contextKeys,
            contextValues,
            course,
            cov,
            covReferenceFrame,
            flightAz,
            idSensor,
            object_,
            origSensorId,
            pos,
            propagated,
            quat,
            range,
            referenceFrame,
            spd,
            status,
            timeSource,
            type,
            vectorAlt,
            vectorLat,
            vectorLon,
            vectorTrackId,
            vel,
            mutableMapOf(),
        )

        /**
         * Vector timestamp in ISO8601 UTC format, with microsecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun epoch(): OffsetDateTime = epoch.getRequired("epoch")

        /**
         * Three element array, expressing the cartesian acceleration vector of the target object,
         * in kilometers/second^2, in the specified referenceFrame. If referenceFrame is null then
         * ECEF should be assumed. The array element order is [x'', y'', z''].
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun accel(): Optional<List<Double>> = accel.getOptional("accel")

        /**
         * Confidence of the vector, 0-100.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun confidence(): Optional<Int> = confidence.getOptional("confidence")

        /**
         * An optional string array containing additional data (keys) representing relevant items
         * for context of fields not specifically defined in this schema. This array is paired with
         * the contextValues string array and must contain the same number of items. Please note
         * these fields are intended for contextual use only and do not pertain to core schema
         * information. To ensure proper integration and avoid misuse, coordination of how these
         * fields are populated and consumed is required during onboarding.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun contextKeys(): Optional<List<String>> = contextKeys.getOptional("contextKeys")

        /**
         * An optional string array containing the values associated with the contextKeys array.
         * This array is paired with the contextKeys string array and must contain the same number
         * of items. Please note these fields are intended for contextual use only and do not
         * pertain to core schema information. To ensure proper integration and avoid misuse,
         * coordination of how these fields are populated and consumed is required during
         * onboarding.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun contextValues(): Optional<List<String>> = contextValues.getOptional("contextValues")

        /**
         * Track object course, in degrees clockwise from true north.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun course(): Optional<Double> = course.getOptional("course")

        /**
         * Covariance matrix, in kilometer and second based units, in the specified
         * covReferenceFrame.
         *
         * If the covReferenceFrame is null it is assumed to be UVW. The array values (1-45)
         * represent the upper triangular half of the position-velocity-acceleration covariance
         * matrix.
         *
         * The covariance elements are position dependent within the array with values ordered as
         * follows:
         *
         * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;&nbsp;&nbsp;y&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;y'&nbsp;&nbsp;&nbsp;&nbsp;z'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x"&nbsp;&nbsp;&nbsp;&nbsp;y"&nbsp;&nbsp;&nbsp;&nbsp;z"
         *
         * x&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1&nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;6&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;7&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;8&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;9
         *
         * y&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10&nbsp;&nbsp;&nbsp;11&nbsp;&nbsp;&nbsp;12&nbsp;&nbsp;&nbsp;13&nbsp;&nbsp;&nbsp;14&nbsp;&nbsp;&nbsp;15&nbsp;&nbsp;&nbsp;16&nbsp;&nbsp;&nbsp;17
         *
         * z&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;18&nbsp;&nbsp;&nbsp;19&nbsp;&nbsp;&nbsp;20&nbsp;&nbsp;&nbsp;21&nbsp;&nbsp;&nbsp;22&nbsp;&nbsp;&nbsp;23&nbsp;&nbsp;&nbsp;24
         *
         * x'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;25&nbsp;&nbsp;&nbsp;26&nbsp;&nbsp;&nbsp;27&nbsp;&nbsp;&nbsp;28&nbsp;&nbsp;&nbsp;29&nbsp;&nbsp;&nbsp;30
         *
         * y'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;31&nbsp;&nbsp;&nbsp;32&nbsp;&nbsp;&nbsp;33&nbsp;&nbsp;&nbsp;34&nbsp;&nbsp;&nbsp;35
         *
         * z'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;36&nbsp;&nbsp;&nbsp;37&nbsp;&nbsp;&nbsp;38&nbsp;&nbsp;&nbsp;39
         *
         * x"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;40&nbsp;&nbsp;&nbsp;41&nbsp;&nbsp;&nbsp;42
         *
         * y"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;43&nbsp;&nbsp;&nbsp;44
         *
         * z"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;45
         *
         * The cov array should contain only the upper right triangle values from top left down to
         * bottom right, in order.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun cov(): Optional<List<Double>> = cov.getOptional("cov")

        /**
         * The reference frame of the covariance elements (ECEF, J2000, UVW, EFG/TDR, TEME, GCRF).
         * If the referenceFrame is null it is assumed to be UVW.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun covReferenceFrame(): Optional<CovReferenceFrame> =
            covReferenceFrame.getOptional("covReferenceFrame")

        /**
         * The flight azimuth associated with the current state vector (0-360 degrees).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun flightAz(): Optional<Double> = flightAz.getOptional("flightAz")

        /**
         * Unique identifier of the reporting sensor of the object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

        /**
         * Object to which this vector applies.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun object_(): Optional<String> = object_.getOptional("object")

        /**
         * Optional identifier provided by the source to indicate the reporting sensor of the
         * object. This may be an internal identifier and not necessarily a valid sensor ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

        /**
         * Three element array, expressing the cartesian position vector of the target object, in
         * kilometers, in the specified referenceFrame. If referenceFrame is null then ECEF should
         * be assumed. The array element order is [x, y, z].
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pos(): Optional<List<Double>> = pos.getOptional("pos")

        /**
         * Flag indicating whether the vector data was propagated.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun propagated(): Optional<Boolean> = propagated.getOptional("propagated")

        /**
         * The quaternion describing the attitude of the spacecraft with respect to the reference
         * frame listed in the 'referenceFrame' field. The array element order convention is the
         * three vector components, followed by the scalar component.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun quat(): Optional<List<Double>> = quat.getOptional("quat")

        /**
         * Range from the originating system or sensor to the object, in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun range(): Optional<Double> = range.getOptional("range")

        /**
         * The reference frame of the cartesian vector (ECEF, J2000). If the referenceFrame is null
         * it is assumed to be ECEF.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun referenceFrame(): Optional<String> = referenceFrame.getOptional("referenceFrame")

        /**
         * Track object speed, in kilometers/sec.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun spd(): Optional<Double> = spd.getOptional("spd")

        /**
         * Status of the vector (e.g. INITIAL, UPDATE).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * Source of the epoch time.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun timeSource(): Optional<String> = timeSource.getOptional("timeSource")

        /**
         * Type of vector represented (e.g. LOS, PREDICTED, STATE).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Object altitude at epoch, expressed in kilometers above WGS-84 ellipsoid.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun vectorAlt(): Optional<Double> = vectorAlt.getOptional("vectorAlt")

        /**
         * WGS-84 object latitude subpoint at epoch, represented as -90 to 90 degrees (negative
         * values south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun vectorLat(): Optional<Double> = vectorLat.getOptional("vectorLat")

        /**
         * WGS-84 object longitude subpoint at epoch, represented as -180 to 180 degrees (negative
         * values west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun vectorLon(): Optional<Double> = vectorLon.getOptional("vectorLon")

        /**
         * Vector track ID within the originating system or sensor.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun vectorTrackId(): Optional<String> = vectorTrackId.getOptional("vectorTrackId")

        /**
         * Three element array, expressing the cartesian velocity vector of the target object, in
         * kilometers/second, in the specified referenceFrame. If referenceFrame is null then ECEF
         * should be assumed. The array element order is [x', y', z'].
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun vel(): Optional<List<Double>> = vel.getOptional("vel")

        /**
         * Returns the raw JSON value of [epoch].
         *
         * Unlike [epoch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("epoch") @ExcludeMissing fun _epoch(): JsonField<OffsetDateTime> = epoch

        /**
         * Returns the raw JSON value of [accel].
         *
         * Unlike [accel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accel") @ExcludeMissing fun _accel(): JsonField<List<Double>> = accel

        /**
         * Returns the raw JSON value of [confidence].
         *
         * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confidence") @ExcludeMissing fun _confidence(): JsonField<Int> = confidence

        /**
         * Returns the raw JSON value of [contextKeys].
         *
         * Unlike [contextKeys], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contextKeys")
        @ExcludeMissing
        fun _contextKeys(): JsonField<List<String>> = contextKeys

        /**
         * Returns the raw JSON value of [contextValues].
         *
         * Unlike [contextValues], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contextValues")
        @ExcludeMissing
        fun _contextValues(): JsonField<List<String>> = contextValues

        /**
         * Returns the raw JSON value of [course].
         *
         * Unlike [course], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("course") @ExcludeMissing fun _course(): JsonField<Double> = course

        /**
         * Returns the raw JSON value of [cov].
         *
         * Unlike [cov], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cov") @ExcludeMissing fun _cov(): JsonField<List<Double>> = cov

        /**
         * Returns the raw JSON value of [covReferenceFrame].
         *
         * Unlike [covReferenceFrame], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("covReferenceFrame")
        @ExcludeMissing
        fun _covReferenceFrame(): JsonField<CovReferenceFrame> = covReferenceFrame

        /**
         * Returns the raw JSON value of [flightAz].
         *
         * Unlike [flightAz], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("flightAz") @ExcludeMissing fun _flightAz(): JsonField<Double> = flightAz

        /**
         * Returns the raw JSON value of [idSensor].
         *
         * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

        /**
         * Returns the raw JSON value of [object_].
         *
         * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        /**
         * Returns the raw JSON value of [origSensorId].
         *
         * Unlike [origSensorId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("origSensorId")
        @ExcludeMissing
        fun _origSensorId(): JsonField<String> = origSensorId

        /**
         * Returns the raw JSON value of [pos].
         *
         * Unlike [pos], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pos") @ExcludeMissing fun _pos(): JsonField<List<Double>> = pos

        /**
         * Returns the raw JSON value of [propagated].
         *
         * Unlike [propagated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("propagated")
        @ExcludeMissing
        fun _propagated(): JsonField<Boolean> = propagated

        /**
         * Returns the raw JSON value of [quat].
         *
         * Unlike [quat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quat") @ExcludeMissing fun _quat(): JsonField<List<Double>> = quat

        /**
         * Returns the raw JSON value of [range].
         *
         * Unlike [range], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("range") @ExcludeMissing fun _range(): JsonField<Double> = range

        /**
         * Returns the raw JSON value of [referenceFrame].
         *
         * Unlike [referenceFrame], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("referenceFrame")
        @ExcludeMissing
        fun _referenceFrame(): JsonField<String> = referenceFrame

        /**
         * Returns the raw JSON value of [spd].
         *
         * Unlike [spd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spd") @ExcludeMissing fun _spd(): JsonField<Double> = spd

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [timeSource].
         *
         * Unlike [timeSource], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeSource")
        @ExcludeMissing
        fun _timeSource(): JsonField<String> = timeSource

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [vectorAlt].
         *
         * Unlike [vectorAlt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vectorAlt") @ExcludeMissing fun _vectorAlt(): JsonField<Double> = vectorAlt

        /**
         * Returns the raw JSON value of [vectorLat].
         *
         * Unlike [vectorLat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vectorLat") @ExcludeMissing fun _vectorLat(): JsonField<Double> = vectorLat

        /**
         * Returns the raw JSON value of [vectorLon].
         *
         * Unlike [vectorLon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vectorLon") @ExcludeMissing fun _vectorLon(): JsonField<Double> = vectorLon

        /**
         * Returns the raw JSON value of [vectorTrackId].
         *
         * Unlike [vectorTrackId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vectorTrackId")
        @ExcludeMissing
        fun _vectorTrackId(): JsonField<String> = vectorTrackId

        /**
         * Returns the raw JSON value of [vel].
         *
         * Unlike [vel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vel") @ExcludeMissing fun _vel(): JsonField<List<Double>> = vel

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
             * Returns a mutable builder for constructing an instance of [Vector].
             *
             * The following fields are required:
             * ```java
             * .epoch()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Vector]. */
        class Builder internal constructor() {

            private var epoch: JsonField<OffsetDateTime>? = null
            private var accel: JsonField<MutableList<Double>>? = null
            private var confidence: JsonField<Int> = JsonMissing.of()
            private var contextKeys: JsonField<MutableList<String>>? = null
            private var contextValues: JsonField<MutableList<String>>? = null
            private var course: JsonField<Double> = JsonMissing.of()
            private var cov: JsonField<MutableList<Double>>? = null
            private var covReferenceFrame: JsonField<CovReferenceFrame> = JsonMissing.of()
            private var flightAz: JsonField<Double> = JsonMissing.of()
            private var idSensor: JsonField<String> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var origSensorId: JsonField<String> = JsonMissing.of()
            private var pos: JsonField<MutableList<Double>>? = null
            private var propagated: JsonField<Boolean> = JsonMissing.of()
            private var quat: JsonField<MutableList<Double>>? = null
            private var range: JsonField<Double> = JsonMissing.of()
            private var referenceFrame: JsonField<String> = JsonMissing.of()
            private var spd: JsonField<Double> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var timeSource: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var vectorAlt: JsonField<Double> = JsonMissing.of()
            private var vectorLat: JsonField<Double> = JsonMissing.of()
            private var vectorLon: JsonField<Double> = JsonMissing.of()
            private var vectorTrackId: JsonField<String> = JsonMissing.of()
            private var vel: JsonField<MutableList<Double>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(vector: Vector) = apply {
                epoch = vector.epoch
                accel = vector.accel.map { it.toMutableList() }
                confidence = vector.confidence
                contextKeys = vector.contextKeys.map { it.toMutableList() }
                contextValues = vector.contextValues.map { it.toMutableList() }
                course = vector.course
                cov = vector.cov.map { it.toMutableList() }
                covReferenceFrame = vector.covReferenceFrame
                flightAz = vector.flightAz
                idSensor = vector.idSensor
                object_ = vector.object_
                origSensorId = vector.origSensorId
                pos = vector.pos.map { it.toMutableList() }
                propagated = vector.propagated
                quat = vector.quat.map { it.toMutableList() }
                range = vector.range
                referenceFrame = vector.referenceFrame
                spd = vector.spd
                status = vector.status
                timeSource = vector.timeSource
                type = vector.type
                vectorAlt = vector.vectorAlt
                vectorLat = vector.vectorLat
                vectorLon = vector.vectorLon
                vectorTrackId = vector.vectorTrackId
                vel = vector.vel.map { it.toMutableList() }
                additionalProperties = vector.additionalProperties.toMutableMap()
            }

            /** Vector timestamp in ISO8601 UTC format, with microsecond precision. */
            fun epoch(epoch: OffsetDateTime) = epoch(JsonField.of(epoch))

            /**
             * Sets [Builder.epoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.epoch] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun epoch(epoch: JsonField<OffsetDateTime>) = apply { this.epoch = epoch }

            /**
             * Three element array, expressing the cartesian acceleration vector of the target
             * object, in kilometers/second^2, in the specified referenceFrame. If referenceFrame is
             * null then ECEF should be assumed. The array element order is [x'', y'', z''].
             */
            fun accel(accel: List<Double>) = accel(JsonField.of(accel))

            /**
             * Sets [Builder.accel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accel] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accel(accel: JsonField<List<Double>>) = apply {
                this.accel = accel.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.accel].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAccel(accel: Double) = apply {
                this.accel =
                    (this.accel ?: JsonField.of(mutableListOf())).also {
                        checkKnown("accel", it).add(accel)
                    }
            }

            /** Confidence of the vector, 0-100. */
            fun confidence(confidence: Int) = confidence(JsonField.of(confidence))

            /**
             * Sets [Builder.confidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidence] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidence(confidence: JsonField<Int>) = apply { this.confidence = confidence }

            /**
             * An optional string array containing additional data (keys) representing relevant
             * items for context of fields not specifically defined in this schema. This array is
             * paired with the contextValues string array and must contain the same number of items.
             * Please note these fields are intended for contextual use only and do not pertain to
             * core schema information. To ensure proper integration and avoid misuse, coordination
             * of how these fields are populated and consumed is required during onboarding.
             */
            fun contextKeys(contextKeys: List<String>) = contextKeys(JsonField.of(contextKeys))

            /**
             * Sets [Builder.contextKeys] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contextKeys] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contextKeys(contextKeys: JsonField<List<String>>) = apply {
                this.contextKeys = contextKeys.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [contextKeys].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContextKey(contextKey: String) = apply {
                contextKeys =
                    (contextKeys ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contextKeys", it).add(contextKey)
                    }
            }

            /**
             * An optional string array containing the values associated with the contextKeys array.
             * This array is paired with the contextKeys string array and must contain the same
             * number of items. Please note these fields are intended for contextual use only and do
             * not pertain to core schema information. To ensure proper integration and avoid
             * misuse, coordination of how these fields are populated and consumed is required
             * during onboarding.
             */
            fun contextValues(contextValues: List<String>) =
                contextValues(JsonField.of(contextValues))

            /**
             * Sets [Builder.contextValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contextValues] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun contextValues(contextValues: JsonField<List<String>>) = apply {
                this.contextValues = contextValues.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [contextValues].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContextValue(contextValue: String) = apply {
                contextValues =
                    (contextValues ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contextValues", it).add(contextValue)
                    }
            }

            /** Track object course, in degrees clockwise from true north. */
            fun course(course: Double) = course(JsonField.of(course))

            /**
             * Sets [Builder.course] to an arbitrary JSON value.
             *
             * You should usually call [Builder.course] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun course(course: JsonField<Double>) = apply { this.course = course }

            /**
             * Covariance matrix, in kilometer and second based units, in the specified
             * covReferenceFrame.
             *
             * If the covReferenceFrame is null it is assumed to be UVW. The array values (1-45)
             * represent the upper triangular half of the position-velocity-acceleration covariance
             * matrix.
             *
             * The covariance elements are position dependent within the array with values ordered
             * as follows:
             *
             * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;&nbsp;&nbsp;y&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;y'&nbsp;&nbsp;&nbsp;&nbsp;z'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x"&nbsp;&nbsp;&nbsp;&nbsp;y"&nbsp;&nbsp;&nbsp;&nbsp;z"
             *
             * x&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1&nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;6&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;7&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;8&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;9
             *
             * y&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10&nbsp;&nbsp;&nbsp;11&nbsp;&nbsp;&nbsp;12&nbsp;&nbsp;&nbsp;13&nbsp;&nbsp;&nbsp;14&nbsp;&nbsp;&nbsp;15&nbsp;&nbsp;&nbsp;16&nbsp;&nbsp;&nbsp;17
             *
             * z&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;18&nbsp;&nbsp;&nbsp;19&nbsp;&nbsp;&nbsp;20&nbsp;&nbsp;&nbsp;21&nbsp;&nbsp;&nbsp;22&nbsp;&nbsp;&nbsp;23&nbsp;&nbsp;&nbsp;24
             *
             * x'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;25&nbsp;&nbsp;&nbsp;26&nbsp;&nbsp;&nbsp;27&nbsp;&nbsp;&nbsp;28&nbsp;&nbsp;&nbsp;29&nbsp;&nbsp;&nbsp;30
             *
             * y'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;31&nbsp;&nbsp;&nbsp;32&nbsp;&nbsp;&nbsp;33&nbsp;&nbsp;&nbsp;34&nbsp;&nbsp;&nbsp;35
             *
             * z'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;36&nbsp;&nbsp;&nbsp;37&nbsp;&nbsp;&nbsp;38&nbsp;&nbsp;&nbsp;39
             *
             * x"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;40&nbsp;&nbsp;&nbsp;41&nbsp;&nbsp;&nbsp;42
             *
             * y"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;43&nbsp;&nbsp;&nbsp;44
             *
             * z"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;45
             *
             * The cov array should contain only the upper right triangle values from top left down
             * to bottom right, in order.
             */
            fun cov(cov: List<Double>) = cov(JsonField.of(cov))

            /**
             * Sets [Builder.cov] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cov] with a well-typed `List<Double>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cov(cov: JsonField<List<Double>>) = apply {
                this.cov = cov.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.cov].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCov(cov: Double) = apply {
                this.cov =
                    (this.cov ?: JsonField.of(mutableListOf())).also {
                        checkKnown("cov", it).add(cov)
                    }
            }

            /**
             * The reference frame of the covariance elements (ECEF, J2000, UVW, EFG/TDR, TEME,
             * GCRF). If the referenceFrame is null it is assumed to be UVW.
             */
            fun covReferenceFrame(covReferenceFrame: CovReferenceFrame) =
                covReferenceFrame(JsonField.of(covReferenceFrame))

            /**
             * Sets [Builder.covReferenceFrame] to an arbitrary JSON value.
             *
             * You should usually call [Builder.covReferenceFrame] with a well-typed
             * [CovReferenceFrame] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun covReferenceFrame(covReferenceFrame: JsonField<CovReferenceFrame>) = apply {
                this.covReferenceFrame = covReferenceFrame
            }

            /** The flight azimuth associated with the current state vector (0-360 degrees). */
            fun flightAz(flightAz: Double) = flightAz(JsonField.of(flightAz))

            /**
             * Sets [Builder.flightAz] to an arbitrary JSON value.
             *
             * You should usually call [Builder.flightAz] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun flightAz(flightAz: JsonField<Double>) = apply { this.flightAz = flightAz }

            /** Unique identifier of the reporting sensor of the object. */
            fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

            /**
             * Sets [Builder.idSensor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSensor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

            /** Object to which this vector applies. */
            fun object_(object_: String) = object_(JsonField.of(object_))

            /**
             * Sets [Builder.object_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.object_] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /**
             * Optional identifier provided by the source to indicate the reporting sensor of the
             * object. This may be an internal identifier and not necessarily a valid sensor ID.
             */
            fun origSensorId(origSensorId: String) = origSensorId(JsonField.of(origSensorId))

            /**
             * Sets [Builder.origSensorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origSensorId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origSensorId(origSensorId: JsonField<String>) = apply {
                this.origSensorId = origSensorId
            }

            /**
             * Three element array, expressing the cartesian position vector of the target object,
             * in kilometers, in the specified referenceFrame. If referenceFrame is null then ECEF
             * should be assumed. The array element order is [x, y, z].
             */
            fun pos(pos: List<Double>) = pos(JsonField.of(pos))

            /**
             * Sets [Builder.pos] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pos] with a well-typed `List<Double>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pos(pos: JsonField<List<Double>>) = apply {
                this.pos = pos.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [pos].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPo(po: Double) = apply {
                pos = (pos ?: JsonField.of(mutableListOf())).also { checkKnown("pos", it).add(po) }
            }

            /** Flag indicating whether the vector data was propagated. */
            fun propagated(propagated: Boolean) = propagated(JsonField.of(propagated))

            /**
             * Sets [Builder.propagated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.propagated] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun propagated(propagated: JsonField<Boolean>) = apply { this.propagated = propagated }

            /**
             * The quaternion describing the attitude of the spacecraft with respect to the
             * reference frame listed in the 'referenceFrame' field. The array element order
             * convention is the three vector components, followed by the scalar component.
             */
            fun quat(quat: List<Double>) = quat(JsonField.of(quat))

            /**
             * Sets [Builder.quat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quat] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /** Range from the originating system or sensor to the object, in kilometers. */
            fun range(range: Double) = range(JsonField.of(range))

            /**
             * Sets [Builder.range] to an arbitrary JSON value.
             *
             * You should usually call [Builder.range] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun range(range: JsonField<Double>) = apply { this.range = range }

            /**
             * The reference frame of the cartesian vector (ECEF, J2000). If the referenceFrame is
             * null it is assumed to be ECEF.
             */
            fun referenceFrame(referenceFrame: String) =
                referenceFrame(JsonField.of(referenceFrame))

            /**
             * Sets [Builder.referenceFrame] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceFrame] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referenceFrame(referenceFrame: JsonField<String>) = apply {
                this.referenceFrame = referenceFrame
            }

            /** Track object speed, in kilometers/sec. */
            fun spd(spd: Double) = spd(JsonField.of(spd))

            /**
             * Sets [Builder.spd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spd] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun spd(spd: JsonField<Double>) = apply { this.spd = spd }

            /** Status of the vector (e.g. INITIAL, UPDATE). */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Source of the epoch time. */
            fun timeSource(timeSource: String) = timeSource(JsonField.of(timeSource))

            /**
             * Sets [Builder.timeSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeSource] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeSource(timeSource: JsonField<String>) = apply { this.timeSource = timeSource }

            /** Type of vector represented (e.g. LOS, PREDICTED, STATE). */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** Object altitude at epoch, expressed in kilometers above WGS-84 ellipsoid. */
            fun vectorAlt(vectorAlt: Double) = vectorAlt(JsonField.of(vectorAlt))

            /**
             * Sets [Builder.vectorAlt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorAlt] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorAlt(vectorAlt: JsonField<Double>) = apply { this.vectorAlt = vectorAlt }

            /**
             * WGS-84 object latitude subpoint at epoch, represented as -90 to 90 degrees (negative
             * values south of equator).
             */
            fun vectorLat(vectorLat: Double) = vectorLat(JsonField.of(vectorLat))

            /**
             * Sets [Builder.vectorLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorLat] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorLat(vectorLat: JsonField<Double>) = apply { this.vectorLat = vectorLat }

            /**
             * WGS-84 object longitude subpoint at epoch, represented as -180 to 180 degrees
             * (negative values west of Prime Meridian).
             */
            fun vectorLon(vectorLon: Double) = vectorLon(JsonField.of(vectorLon))

            /**
             * Sets [Builder.vectorLon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorLon] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorLon(vectorLon: JsonField<Double>) = apply { this.vectorLon = vectorLon }

            /** Vector track ID within the originating system or sensor. */
            fun vectorTrackId(vectorTrackId: String) = vectorTrackId(JsonField.of(vectorTrackId))

            /**
             * Sets [Builder.vectorTrackId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorTrackId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorTrackId(vectorTrackId: JsonField<String>) = apply {
                this.vectorTrackId = vectorTrackId
            }

            /**
             * Three element array, expressing the cartesian velocity vector of the target object,
             * in kilometers/second, in the specified referenceFrame. If referenceFrame is null then
             * ECEF should be assumed. The array element order is [x', y', z'].
             */
            fun vel(vel: List<Double>) = vel(JsonField.of(vel))

            /**
             * Sets [Builder.vel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vel] with a well-typed `List<Double>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vel(vel: JsonField<List<Double>>) = apply {
                this.vel = vel.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.vel].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVel(vel: Double) = apply {
                this.vel =
                    (this.vel ?: JsonField.of(mutableListOf())).also {
                        checkKnown("vel", it).add(vel)
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
             * Returns an immutable instance of [Vector].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .epoch()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Vector =
                Vector(
                    checkRequired("epoch", epoch),
                    (accel ?: JsonMissing.of()).map { it.toImmutable() },
                    confidence,
                    (contextKeys ?: JsonMissing.of()).map { it.toImmutable() },
                    (contextValues ?: JsonMissing.of()).map { it.toImmutable() },
                    course,
                    (cov ?: JsonMissing.of()).map { it.toImmutable() },
                    covReferenceFrame,
                    flightAz,
                    idSensor,
                    object_,
                    origSensorId,
                    (pos ?: JsonMissing.of()).map { it.toImmutable() },
                    propagated,
                    (quat ?: JsonMissing.of()).map { it.toImmutable() },
                    range,
                    referenceFrame,
                    spd,
                    status,
                    timeSource,
                    type,
                    vectorAlt,
                    vectorLat,
                    vectorLon,
                    vectorTrackId,
                    (vel ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Vector = apply {
            if (validated) {
                return@apply
            }

            epoch()
            accel()
            confidence()
            contextKeys()
            contextValues()
            course()
            cov()
            covReferenceFrame().ifPresent { it.validate() }
            flightAz()
            idSensor()
            object_()
            origSensorId()
            pos()
            propagated()
            quat()
            range()
            referenceFrame()
            spd()
            status()
            timeSource()
            type()
            vectorAlt()
            vectorLat()
            vectorLon()
            vectorTrackId()
            vel()
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
            (if (epoch.asKnown().isPresent) 1 else 0) +
                (accel.asKnown().getOrNull()?.size ?: 0) +
                (if (confidence.asKnown().isPresent) 1 else 0) +
                (contextKeys.asKnown().getOrNull()?.size ?: 0) +
                (contextValues.asKnown().getOrNull()?.size ?: 0) +
                (if (course.asKnown().isPresent) 1 else 0) +
                (cov.asKnown().getOrNull()?.size ?: 0) +
                (covReferenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
                (if (flightAz.asKnown().isPresent) 1 else 0) +
                (if (idSensor.asKnown().isPresent) 1 else 0) +
                (if (object_.asKnown().isPresent) 1 else 0) +
                (if (origSensorId.asKnown().isPresent) 1 else 0) +
                (pos.asKnown().getOrNull()?.size ?: 0) +
                (if (propagated.asKnown().isPresent) 1 else 0) +
                (quat.asKnown().getOrNull()?.size ?: 0) +
                (if (range.asKnown().isPresent) 1 else 0) +
                (if (referenceFrame.asKnown().isPresent) 1 else 0) +
                (if (spd.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (timeSource.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (vectorAlt.asKnown().isPresent) 1 else 0) +
                (if (vectorLat.asKnown().isPresent) 1 else 0) +
                (if (vectorLon.asKnown().isPresent) 1 else 0) +
                (if (vectorTrackId.asKnown().isPresent) 1 else 0) +
                (vel.asKnown().getOrNull()?.size ?: 0)

        /**
         * The reference frame of the covariance elements (ECEF, J2000, UVW, EFG/TDR, TEME, GCRF).
         * If the referenceFrame is null it is assumed to be UVW.
         */
        class CovReferenceFrame
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ECEF = of("ECEF")

                @JvmField val J2000 = of("J2000")

                @JvmField val UVW = of("UVW")

                @JvmField val EFG_TDR = of("EFG/TDR")

                @JvmField val TEME = of("TEME")

                @JvmField val GCRF = of("GCRF")

                @JvmStatic fun of(value: String) = CovReferenceFrame(JsonField.of(value))
            }

            /** An enum containing [CovReferenceFrame]'s known values. */
            enum class Known {
                ECEF,
                J2000,
                UVW,
                EFG_TDR,
                TEME,
                GCRF,
            }

            /**
             * An enum containing [CovReferenceFrame]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [CovReferenceFrame] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ECEF,
                J2000,
                UVW,
                EFG_TDR,
                TEME,
                GCRF,
                /**
                 * An enum member indicating that [CovReferenceFrame] was instantiated with an
                 * unknown value.
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
                    ECEF -> Value.ECEF
                    J2000 -> Value.J2000
                    UVW -> Value.UVW
                    EFG_TDR -> Value.EFG_TDR
                    TEME -> Value.TEME
                    GCRF -> Value.GCRF
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
                    ECEF -> Known.ECEF
                    J2000 -> Known.J2000
                    UVW -> Known.UVW
                    EFG_TDR -> Known.EFG_TDR
                    TEME -> Known.TEME
                    GCRF -> Known.GCRF
                    else ->
                        throw UnifieddatalibraryInvalidDataException(
                            "Unknown CovReferenceFrame: $value"
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

            fun validate(): CovReferenceFrame = apply {
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

                return other is CovReferenceFrame && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Vector &&
                epoch == other.epoch &&
                accel == other.accel &&
                confidence == other.confidence &&
                contextKeys == other.contextKeys &&
                contextValues == other.contextValues &&
                course == other.course &&
                cov == other.cov &&
                covReferenceFrame == other.covReferenceFrame &&
                flightAz == other.flightAz &&
                idSensor == other.idSensor &&
                object_ == other.object_ &&
                origSensorId == other.origSensorId &&
                pos == other.pos &&
                propagated == other.propagated &&
                quat == other.quat &&
                range == other.range &&
                referenceFrame == other.referenceFrame &&
                spd == other.spd &&
                status == other.status &&
                timeSource == other.timeSource &&
                type == other.type &&
                vectorAlt == other.vectorAlt &&
                vectorLat == other.vectorLat &&
                vectorLon == other.vectorLon &&
                vectorTrackId == other.vectorTrackId &&
                vel == other.vel &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                epoch,
                accel,
                confidence,
                contextKeys,
                contextValues,
                course,
                cov,
                covReferenceFrame,
                flightAz,
                idSensor,
                object_,
                origSensorId,
                pos,
                propagated,
                quat,
                range,
                referenceFrame,
                spd,
                status,
                timeSource,
                type,
                vectorAlt,
                vectorLat,
                vectorLon,
                vectorTrackId,
                vel,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Vector{epoch=$epoch, accel=$accel, confidence=$confidence, contextKeys=$contextKeys, contextValues=$contextValues, course=$course, cov=$cov, covReferenceFrame=$covReferenceFrame, flightAz=$flightAz, idSensor=$idSensor, object_=$object_, origSensorId=$origSensorId, pos=$pos, propagated=$propagated, quat=$quat, range=$range, referenceFrame=$referenceFrame, spd=$spd, status=$status, timeSource=$timeSource, type=$type, vectorAlt=$vectorAlt, vectorLat=$vectorLat, vectorLon=$vectorLon, vectorTrackId=$vectorTrackId, vel=$vel, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HistoryListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            ts == other.ts &&
            id == other.id &&
            acftSubType == other.acftSubType &&
            alert == other.alert &&
            angElev == other.angElev &&
            aouRptData == other.aouRptData &&
            aouRptType == other.aouRptType &&
            azCorr == other.azCorr &&
            boosting == other.boosting &&
            burnoutAlt == other.burnoutAlt &&
            callSign == other.callSign &&
            containment == other.containment &&
            contextKeys == other.contextKeys &&
            contextValues == other.contextValues &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            dropPtInd == other.dropPtInd &&
            emgInd == other.emgInd &&
            env == other.env &&
            impactAlt == other.impactAlt &&
            impactAouData == other.impactAouData &&
            impactAouType == other.impactAouType &&
            impactConf == other.impactConf &&
            impactLat == other.impactLat &&
            impactLon == other.impactLon &&
            impactTime == other.impactTime &&
            infoSource == other.infoSource &&
            launchAlt == other.launchAlt &&
            launchAouData == other.launchAouData &&
            launchAouType == other.launchAouType &&
            launchAz == other.launchAz &&
            launchAzUnc == other.launchAzUnc &&
            launchConf == other.launchConf &&
            launchLat == other.launchLat &&
            launchLon == other.launchLon &&
            launchTime == other.launchTime &&
            lostTrkInd == other.lostTrkInd &&
            maneuverEnd == other.maneuverEnd &&
            maneuverStart == other.maneuverStart &&
            msgCreateDate == other.msgCreateDate &&
            msgSubType == other.msgSubType &&
            msgType == other.msgType &&
            mslStatus == other.mslStatus &&
            muidSrc == other.muidSrc &&
            muidSrcTrk == other.muidSrcTrk &&
            name == other.name &&
            objAct == other.objAct &&
            objIdent == other.objIdent &&
            objPlat == other.objPlat &&
            objType == other.objType &&
            objTypeConf == other.objTypeConf &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            parentTrackId == other.parentTrackId &&
            polarSingLocLat == other.polarSingLocLat &&
            polarSingLocLon == other.polarSingLocLon &&
            senMode == other.senMode &&
            spaceAmp == other.spaceAmp &&
            spaceAmpConf == other.spaceAmpConf &&
            spaceSpecType == other.spaceSpecType &&
            trackId == other.trackId &&
            trkConf == other.trkConf &&
            trkQual == other.trkQual &&
            vectors == other.vectors &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            source,
            ts,
            id,
            acftSubType,
            alert,
            angElev,
            aouRptData,
            aouRptType,
            azCorr,
            boosting,
            burnoutAlt,
            callSign,
            containment,
            contextKeys,
            contextValues,
            createdAt,
            createdBy,
            dropPtInd,
            emgInd,
            env,
            impactAlt,
            impactAouData,
            impactAouType,
            impactConf,
            impactLat,
            impactLon,
            impactTime,
            infoSource,
            launchAlt,
            launchAouData,
            launchAouType,
            launchAz,
            launchAzUnc,
            launchConf,
            launchLat,
            launchLon,
            launchTime,
            lostTrkInd,
            maneuverEnd,
            maneuverStart,
            msgCreateDate,
            msgSubType,
            msgType,
            mslStatus,
            muidSrc,
            muidSrcTrk,
            name,
            objAct,
            objIdent,
            objPlat,
            objType,
            objTypeConf,
            origin,
            origNetwork,
            parentTrackId,
            polarSingLocLat,
            polarSingLocLon,
            senMode,
            spaceAmp,
            spaceAmpConf,
            spaceSpecType,
            trackId,
            trkConf,
            trkQual,
            vectors,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HistoryListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, ts=$ts, id=$id, acftSubType=$acftSubType, alert=$alert, angElev=$angElev, aouRptData=$aouRptData, aouRptType=$aouRptType, azCorr=$azCorr, boosting=$boosting, burnoutAlt=$burnoutAlt, callSign=$callSign, containment=$containment, contextKeys=$contextKeys, contextValues=$contextValues, createdAt=$createdAt, createdBy=$createdBy, dropPtInd=$dropPtInd, emgInd=$emgInd, env=$env, impactAlt=$impactAlt, impactAouData=$impactAouData, impactAouType=$impactAouType, impactConf=$impactConf, impactLat=$impactLat, impactLon=$impactLon, impactTime=$impactTime, infoSource=$infoSource, launchAlt=$launchAlt, launchAouData=$launchAouData, launchAouType=$launchAouType, launchAz=$launchAz, launchAzUnc=$launchAzUnc, launchConf=$launchConf, launchLat=$launchLat, launchLon=$launchLon, launchTime=$launchTime, lostTrkInd=$lostTrkInd, maneuverEnd=$maneuverEnd, maneuverStart=$maneuverStart, msgCreateDate=$msgCreateDate, msgSubType=$msgSubType, msgType=$msgType, mslStatus=$mslStatus, muidSrc=$muidSrc, muidSrcTrk=$muidSrcTrk, name=$name, objAct=$objAct, objIdent=$objIdent, objPlat=$objPlat, objType=$objType, objTypeConf=$objTypeConf, origin=$origin, origNetwork=$origNetwork, parentTrackId=$parentTrackId, polarSingLocLat=$polarSingLocLat, polarSingLocLon=$polarSingLocLon, senMode=$senMode, spaceAmp=$spaceAmp, spaceAmpConf=$spaceAmpConf, spaceSpecType=$spaceSpecType, trackId=$trackId, trkConf=$trkConf, trkQual=$trkQual, vectors=$vectors, additionalProperties=$additionalProperties}"
}

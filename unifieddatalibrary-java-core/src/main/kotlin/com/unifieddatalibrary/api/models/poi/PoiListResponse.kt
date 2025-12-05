// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.poi

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
 * A Point of Interest is loosely based on the MITRE CoT (Cursor on Target) schema
 * (https://www.mitre.org/publications/technical-papers/cursorontarget-message-router-users-guide)
 * and provides a simple way to specify a point on the earth for a variety of purposes (tasking,
 * targeting, etc).
 */
class PoiListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val name: JsonField<String>,
    private val poiid: JsonField<String>,
    private val source: JsonField<String>,
    private val ts: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val activity: JsonField<String>,
    private val agjson: JsonField<String>,
    private val alt: JsonField<Double>,
    private val andims: JsonField<Int>,
    private val asrid: JsonField<Int>,
    private val asset: JsonField<String>,
    private val atext: JsonField<String>,
    private val atype: JsonField<String>,
    private val az: JsonField<Double>,
    private val beNumber: JsonField<String>,
    private val ce: JsonField<Double>,
    private val cntct: JsonField<String>,
    private val conf: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val desc: JsonField<String>,
    private val el: JsonField<Double>,
    private val elle: JsonField<List<Double>>,
    private val env: JsonField<String>,
    private val groups: JsonField<List<String>>,
    private val how: JsonField<String>,
    private val ident: JsonField<String>,
    private val idWeatherReport: JsonField<List<String>>,
    private val lat: JsonField<Double>,
    private val le: JsonField<Double>,
    private val lon: JsonField<Double>,
    private val msnid: JsonField<String>,
    private val orientation: JsonField<Double>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val plat: JsonField<String>,
    private val pps: JsonField<String>,
    private val pri: JsonField<Int>,
    private val sourceDl: JsonField<String>,
    private val spec: JsonField<String>,
    private val stale: JsonField<OffsetDateTime>,
    private val start: JsonField<OffsetDateTime>,
    private val transactionId: JsonField<String>,
    private val trkid: JsonField<String>,
    private val type: JsonField<String>,
    private val urls: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("poiid") @ExcludeMissing poiid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ts") @ExcludeMissing ts: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("activity") @ExcludeMissing activity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agjson") @ExcludeMissing agjson: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alt") @ExcludeMissing alt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("andims") @ExcludeMissing andims: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("asrid") @ExcludeMissing asrid: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("asset") @ExcludeMissing asset: JsonField<String> = JsonMissing.of(),
        @JsonProperty("atext") @ExcludeMissing atext: JsonField<String> = JsonMissing.of(),
        @JsonProperty("atype") @ExcludeMissing atype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("az") @ExcludeMissing az: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("beNumber") @ExcludeMissing beNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ce") @ExcludeMissing ce: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("cntct") @ExcludeMissing cntct: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conf") @ExcludeMissing conf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("desc") @ExcludeMissing desc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("el") @ExcludeMissing el: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elle") @ExcludeMissing elle: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("env") @ExcludeMissing env: JsonField<String> = JsonMissing.of(),
        @JsonProperty("groups") @ExcludeMissing groups: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("how") @ExcludeMissing how: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ident") @ExcludeMissing ident: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idWeatherReport")
        @ExcludeMissing
        idWeatherReport: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("le") @ExcludeMissing le: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("msnid") @ExcludeMissing msnid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("orientation")
        @ExcludeMissing
        orientation: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plat") @ExcludeMissing plat: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pps") @ExcludeMissing pps: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pri") @ExcludeMissing pri: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spec") @ExcludeMissing spec: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stale") @ExcludeMissing stale: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start") @ExcludeMissing start: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trkid") @ExcludeMissing trkid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("urls") @ExcludeMissing urls: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        name,
        poiid,
        source,
        ts,
        id,
        activity,
        agjson,
        alt,
        andims,
        asrid,
        asset,
        atext,
        atype,
        az,
        beNumber,
        ce,
        cntct,
        conf,
        createdAt,
        createdBy,
        desc,
        el,
        elle,
        env,
        groups,
        how,
        ident,
        idWeatherReport,
        lat,
        le,
        lon,
        msnid,
        orientation,
        origin,
        origNetwork,
        plat,
        pps,
        pri,
        sourceDl,
        spec,
        stale,
        start,
        transactionId,
        trkid,
        type,
        urls,
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
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * Name of the POI target object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Identifier of the actual Point of Interest or target object, which should remain the same on
     * subsequent POI records of the same Point of Interest.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun poiid(): String = poiid.getRequired("poiid")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Activity/POI timestamp in ISO8601 UTC format.
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
     * The activity in which the POI subject is engaged. Intended as, but not constrained to,
     * MIL-STD-6016 environment dependent activity designations. The activity can be reported as
     * either a combination of the code and environment (e.g. 30/LAND) or as the descriptive
     * enumeration (e.g. TRAINING), which are equivalent.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun activity(): Optional<String> = activity.getOptional("activity")

    /**
     * Geographical region or polygon (lat/lon pairs), as depicted by the GeoJSON representation of
     * the geometry/geography, of the image as projected on the ground. GeoJSON Reference:
     * https://geojson.org/. Ignored if included with a POST or PUT request that also specifies a
     * valid 'area' or 'atext' field.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun agjson(): Optional<String> = agjson.getOptional("agjson")

    /**
     * Point height above ellipsoid (WGS-84), in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun alt(): Optional<Double> = alt.getOptional("alt")

    /**
     * Number of dimensions of the geometry depicted by region.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun andims(): Optional<Int> = andims.getOptional("andims")

    /**
     * Geographical spatial_ref_sys for region.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun asrid(): Optional<Int> = asrid.getOptional("asrid")

    /**
     * ID/name of the platform or entity providing the POI data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun asset(): Optional<String> = asset.getOptional("asset")

    /**
     * Geographical region or polygon (lon/lat pairs), as depicted by the Well-Known Text
     * representation of the geometry/geography, of the image as projected on the ground. WKT
     * reference: https://www.opengeospatial.org/standards/wkt-crs. Ignored if included with a POST
     * or PUT request that also specifies a valid 'area' field.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun atext(): Optional<String> = atext.getOptional("atext")

    /**
     * Type of region as projected on the ground.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun atype(): Optional<String> = atype.getOptional("atype")

    /**
     * Target object pointing azimuth angle, in degrees (for target with sensing or emitting
     * capability).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun az(): Optional<Double> = az.getOptional("az")

    /**
     * The Basic Encyclopedia Number associated with the POI, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun beNumber(): Optional<String> = beNumber.getOptional("beNumber")

    /**
     * Radius of circular area about lat/lon point, in meters (1-sigma, if representing error).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ce(): Optional<Double> = ce.getOptional("ce")

    /**
     * Contact information for assets reporting PPLI (Precise Participant Location and
     * Identification). PPLI is a Link 16 message that is used by units to transmit complete
     * location, identification, and limited status information.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cntct(): Optional<String> = cntct.getOptional("cntct")

    /**
     * POI confidence estimate (not standardized, but typically a value between 0 and 1, with 0
     * indicating lowest confidence.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun conf(): Optional<Double> = conf.getOptional("conf")

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
     * Description of the POI target object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun desc(): Optional<String> = desc.getOptional("desc")

    /**
     * Target object pointing elevation angle, in degrees (for target with sensing or emitting
     * capability).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun el(): Optional<Double> = el.getOptional("el")

    /**
     * Elliptical area about the lat/lon point, specified as
     * [semi-major axis (m), semi-minor axis (m), orientation (deg) off true North at POI].
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elle(): Optional<List<Double>> = elle.getOptional("elle")

    /**
     * POI environment type (e.g., LAND, SURFACE, SUBSURFACE, UNKNOWN, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun env(): Optional<String> = env.getOptional("env")

    /**
     * Optional array of groups used when a POI msg originates from a TAK server. Each group must be
     * no longer than 256 characters. Groups identify a set of users targeted by the cot/poi msg.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun groups(): Optional<List<String>> = groups.getOptional("groups")

    /**
     * How the event point was generated, in CoT object heirarchy notation (optional, CoT).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun how(): Optional<String> = how.getOptional("how")

    /**
     * Estimated identity of the point/object (e.g., FRIEND, HOSTILE, SUSPECT, ASSUMED_FRIEND,
     * UNKNOWN, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ident(): Optional<String> = ident.getOptional("ident")

    /**
     * Array of one or more unique identifiers of weather records associated with this POI. Each
     * element in array must be 36 characters or less in length.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idWeatherReport(): Optional<List<String>> = idWeatherReport.getOptional("idWeatherReport")

    /**
     * WGS-84 latitude of the POI, in degrees (+N, -S), -90 to 90.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lat(): Optional<Double> = lat.getOptional("lat")

    /**
     * Height above lat/lon point, in meters (1-sigma, if representing linear error).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun le(): Optional<Double> = le.getOptional("le")

    /**
     * WGS-84 longitude of the POI, in degrees (+E, -W), -180 to 180.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lon(): Optional<Double> = lon.getOptional("lon")

    /**
     * Optional mission ID related to the POI.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun msnid(): Optional<String> = msnid.getOptional("msnid")

    /**
     * The orientation of a vehicle, platform or other entity described by the POI. The orientation
     * is defined as the pointing direction of the front/nose of the object in degrees clockwise
     * from true North at the object point.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun orientation(): Optional<Double> = orientation.getOptional("orientation")

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
     * POI/object platform type (e.g., 14/GROUND, COMBAT_VEHICLE, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun plat(): Optional<String> = plat.getOptional("plat")

    /**
     * The purpose of this Point of Interest record (e.g., BDA, EQPT, EVENT, GEOL, HZRD, PPLI,
     * SHOTBOX, SURVL, TGT, TSK, WTHR).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pps(): Optional<String> = pps.getOptional("pps")

    /**
     * Priority of the POI target object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pri(): Optional<Int> = pri.getOptional("pri")

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
     * Specific point/object type (e.g., 82/GROUND, LIGHT_TANK, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spec(): Optional<String> = spec.getOptional("spec")

    /**
     * Stale timestamp (optional), in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stale(): Optional<OffsetDateTime> = stale.getOptional("stale")

    /**
     * Start time of event validity (optional), in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun start(): Optional<OffsetDateTime> = start.getOptional("start")

    /**
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

    /**
     * Optional ID of an associated track related to the POI object, if applicable. This track ID
     * should correlate the Point of Interest to a track from the Track service.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trkid(): Optional<String> = trkid.getOptional("trkid")

    /**
     * Event type, in CoT object heirarchy notation (optional, CoT).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * List of URLs to before/after images of this Point of Interest entity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun urls(): Optional<List<String>> = urls.getOptional("urls")

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [poiid].
     *
     * Unlike [poiid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("poiid") @ExcludeMissing fun _poiid(): JsonField<String> = poiid

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
     * Returns the raw JSON value of [activity].
     *
     * Unlike [activity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activity") @ExcludeMissing fun _activity(): JsonField<String> = activity

    /**
     * Returns the raw JSON value of [agjson].
     *
     * Unlike [agjson], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agjson") @ExcludeMissing fun _agjson(): JsonField<String> = agjson

    /**
     * Returns the raw JSON value of [alt].
     *
     * Unlike [alt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alt") @ExcludeMissing fun _alt(): JsonField<Double> = alt

    /**
     * Returns the raw JSON value of [andims].
     *
     * Unlike [andims], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("andims") @ExcludeMissing fun _andims(): JsonField<Int> = andims

    /**
     * Returns the raw JSON value of [asrid].
     *
     * Unlike [asrid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("asrid") @ExcludeMissing fun _asrid(): JsonField<Int> = asrid

    /**
     * Returns the raw JSON value of [asset].
     *
     * Unlike [asset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("asset") @ExcludeMissing fun _asset(): JsonField<String> = asset

    /**
     * Returns the raw JSON value of [atext].
     *
     * Unlike [atext], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("atext") @ExcludeMissing fun _atext(): JsonField<String> = atext

    /**
     * Returns the raw JSON value of [atype].
     *
     * Unlike [atype], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("atype") @ExcludeMissing fun _atype(): JsonField<String> = atype

    /**
     * Returns the raw JSON value of [az].
     *
     * Unlike [az], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("az") @ExcludeMissing fun _az(): JsonField<Double> = az

    /**
     * Returns the raw JSON value of [beNumber].
     *
     * Unlike [beNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beNumber") @ExcludeMissing fun _beNumber(): JsonField<String> = beNumber

    /**
     * Returns the raw JSON value of [ce].
     *
     * Unlike [ce], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ce") @ExcludeMissing fun _ce(): JsonField<Double> = ce

    /**
     * Returns the raw JSON value of [cntct].
     *
     * Unlike [cntct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cntct") @ExcludeMissing fun _cntct(): JsonField<String> = cntct

    /**
     * Returns the raw JSON value of [conf].
     *
     * Unlike [conf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conf") @ExcludeMissing fun _conf(): JsonField<Double> = conf

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
     * Returns the raw JSON value of [desc].
     *
     * Unlike [desc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("desc") @ExcludeMissing fun _desc(): JsonField<String> = desc

    /**
     * Returns the raw JSON value of [el].
     *
     * Unlike [el], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("el") @ExcludeMissing fun _el(): JsonField<Double> = el

    /**
     * Returns the raw JSON value of [elle].
     *
     * Unlike [elle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elle") @ExcludeMissing fun _elle(): JsonField<List<Double>> = elle

    /**
     * Returns the raw JSON value of [env].
     *
     * Unlike [env], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("env") @ExcludeMissing fun _env(): JsonField<String> = env

    /**
     * Returns the raw JSON value of [groups].
     *
     * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groups") @ExcludeMissing fun _groups(): JsonField<List<String>> = groups

    /**
     * Returns the raw JSON value of [how].
     *
     * Unlike [how], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("how") @ExcludeMissing fun _how(): JsonField<String> = how

    /**
     * Returns the raw JSON value of [ident].
     *
     * Unlike [ident], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ident") @ExcludeMissing fun _ident(): JsonField<String> = ident

    /**
     * Returns the raw JSON value of [idWeatherReport].
     *
     * Unlike [idWeatherReport], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idWeatherReport")
    @ExcludeMissing
    fun _idWeatherReport(): JsonField<List<String>> = idWeatherReport

    /**
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

    /**
     * Returns the raw JSON value of [le].
     *
     * Unlike [le], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("le") @ExcludeMissing fun _le(): JsonField<Double> = le

    /**
     * Returns the raw JSON value of [lon].
     *
     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

    /**
     * Returns the raw JSON value of [msnid].
     *
     * Unlike [msnid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msnid") @ExcludeMissing fun _msnid(): JsonField<String> = msnid

    /**
     * Returns the raw JSON value of [orientation].
     *
     * Unlike [orientation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("orientation") @ExcludeMissing fun _orientation(): JsonField<Double> = orientation

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
     * Returns the raw JSON value of [plat].
     *
     * Unlike [plat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plat") @ExcludeMissing fun _plat(): JsonField<String> = plat

    /**
     * Returns the raw JSON value of [pps].
     *
     * Unlike [pps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pps") @ExcludeMissing fun _pps(): JsonField<String> = pps

    /**
     * Returns the raw JSON value of [pri].
     *
     * Unlike [pri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pri") @ExcludeMissing fun _pri(): JsonField<Int> = pri

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [spec].
     *
     * Unlike [spec], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spec") @ExcludeMissing fun _spec(): JsonField<String> = spec

    /**
     * Returns the raw JSON value of [stale].
     *
     * Unlike [stale], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stale") @ExcludeMissing fun _stale(): JsonField<OffsetDateTime> = stale

    /**
     * Returns the raw JSON value of [start].
     *
     * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<OffsetDateTime> = start

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [trkid].
     *
     * Unlike [trkid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trkid") @ExcludeMissing fun _trkid(): JsonField<String> = trkid

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [urls].
     *
     * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("urls") @ExcludeMissing fun _urls(): JsonField<List<String>> = urls

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
         * Returns a mutable builder for constructing an instance of [PoiListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .poiid()
         * .source()
         * .ts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PoiListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var name: JsonField<String>? = null
        private var poiid: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var ts: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var activity: JsonField<String> = JsonMissing.of()
        private var agjson: JsonField<String> = JsonMissing.of()
        private var alt: JsonField<Double> = JsonMissing.of()
        private var andims: JsonField<Int> = JsonMissing.of()
        private var asrid: JsonField<Int> = JsonMissing.of()
        private var asset: JsonField<String> = JsonMissing.of()
        private var atext: JsonField<String> = JsonMissing.of()
        private var atype: JsonField<String> = JsonMissing.of()
        private var az: JsonField<Double> = JsonMissing.of()
        private var beNumber: JsonField<String> = JsonMissing.of()
        private var ce: JsonField<Double> = JsonMissing.of()
        private var cntct: JsonField<String> = JsonMissing.of()
        private var conf: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var desc: JsonField<String> = JsonMissing.of()
        private var el: JsonField<Double> = JsonMissing.of()
        private var elle: JsonField<MutableList<Double>>? = null
        private var env: JsonField<String> = JsonMissing.of()
        private var groups: JsonField<MutableList<String>>? = null
        private var how: JsonField<String> = JsonMissing.of()
        private var ident: JsonField<String> = JsonMissing.of()
        private var idWeatherReport: JsonField<MutableList<String>>? = null
        private var lat: JsonField<Double> = JsonMissing.of()
        private var le: JsonField<Double> = JsonMissing.of()
        private var lon: JsonField<Double> = JsonMissing.of()
        private var msnid: JsonField<String> = JsonMissing.of()
        private var orientation: JsonField<Double> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var plat: JsonField<String> = JsonMissing.of()
        private var pps: JsonField<String> = JsonMissing.of()
        private var pri: JsonField<Int> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var spec: JsonField<String> = JsonMissing.of()
        private var stale: JsonField<OffsetDateTime> = JsonMissing.of()
        private var start: JsonField<OffsetDateTime> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var trkid: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var urls: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(poiListResponse: PoiListResponse) = apply {
            classificationMarking = poiListResponse.classificationMarking
            dataMode = poiListResponse.dataMode
            name = poiListResponse.name
            poiid = poiListResponse.poiid
            source = poiListResponse.source
            ts = poiListResponse.ts
            id = poiListResponse.id
            activity = poiListResponse.activity
            agjson = poiListResponse.agjson
            alt = poiListResponse.alt
            andims = poiListResponse.andims
            asrid = poiListResponse.asrid
            asset = poiListResponse.asset
            atext = poiListResponse.atext
            atype = poiListResponse.atype
            az = poiListResponse.az
            beNumber = poiListResponse.beNumber
            ce = poiListResponse.ce
            cntct = poiListResponse.cntct
            conf = poiListResponse.conf
            createdAt = poiListResponse.createdAt
            createdBy = poiListResponse.createdBy
            desc = poiListResponse.desc
            el = poiListResponse.el
            elle = poiListResponse.elle.map { it.toMutableList() }
            env = poiListResponse.env
            groups = poiListResponse.groups.map { it.toMutableList() }
            how = poiListResponse.how
            ident = poiListResponse.ident
            idWeatherReport = poiListResponse.idWeatherReport.map { it.toMutableList() }
            lat = poiListResponse.lat
            le = poiListResponse.le
            lon = poiListResponse.lon
            msnid = poiListResponse.msnid
            orientation = poiListResponse.orientation
            origin = poiListResponse.origin
            origNetwork = poiListResponse.origNetwork
            plat = poiListResponse.plat
            pps = poiListResponse.pps
            pri = poiListResponse.pri
            sourceDl = poiListResponse.sourceDl
            spec = poiListResponse.spec
            stale = poiListResponse.stale
            start = poiListResponse.start
            transactionId = poiListResponse.transactionId
            trkid = poiListResponse.trkid
            type = poiListResponse.type
            urls = poiListResponse.urls.map { it.toMutableList() }
            additionalProperties = poiListResponse.additionalProperties.toMutableMap()
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
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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

        /** Name of the POI target object. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Identifier of the actual Point of Interest or target object, which should remain the same
         * on subsequent POI records of the same Point of Interest.
         */
        fun poiid(poiid: String) = poiid(JsonField.of(poiid))

        /**
         * Sets [Builder.poiid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.poiid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun poiid(poiid: JsonField<String>) = apply { this.poiid = poiid }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Activity/POI timestamp in ISO8601 UTC format. */
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
         * The activity in which the POI subject is engaged. Intended as, but not constrained to,
         * MIL-STD-6016 environment dependent activity designations. The activity can be reported as
         * either a combination of the code and environment (e.g. 30/LAND) or as the descriptive
         * enumeration (e.g. TRAINING), which are equivalent.
         */
        fun activity(activity: String) = activity(JsonField.of(activity))

        /**
         * Sets [Builder.activity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun activity(activity: JsonField<String>) = apply { this.activity = activity }

        /**
         * Geographical region or polygon (lat/lon pairs), as depicted by the GeoJSON representation
         * of the geometry/geography, of the image as projected on the ground. GeoJSON Reference:
         * https://geojson.org/. Ignored if included with a POST or PUT request that also specifies
         * a valid 'area' or 'atext' field.
         */
        fun agjson(agjson: String) = agjson(JsonField.of(agjson))

        /**
         * Sets [Builder.agjson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agjson] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agjson(agjson: JsonField<String>) = apply { this.agjson = agjson }

        /** Point height above ellipsoid (WGS-84), in meters. */
        fun alt(alt: Double) = alt(JsonField.of(alt))

        /**
         * Sets [Builder.alt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alt(alt: JsonField<Double>) = apply { this.alt = alt }

        /** Number of dimensions of the geometry depicted by region. */
        fun andims(andims: Int) = andims(JsonField.of(andims))

        /**
         * Sets [Builder.andims] to an arbitrary JSON value.
         *
         * You should usually call [Builder.andims] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun andims(andims: JsonField<Int>) = apply { this.andims = andims }

        /** Geographical spatial_ref_sys for region. */
        fun asrid(asrid: Int) = asrid(JsonField.of(asrid))

        /**
         * Sets [Builder.asrid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asrid] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun asrid(asrid: JsonField<Int>) = apply { this.asrid = asrid }

        /** ID/name of the platform or entity providing the POI data. */
        fun asset(asset: String) = asset(JsonField.of(asset))

        /**
         * Sets [Builder.asset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asset] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun asset(asset: JsonField<String>) = apply { this.asset = asset }

        /**
         * Geographical region or polygon (lon/lat pairs), as depicted by the Well-Known Text
         * representation of the geometry/geography, of the image as projected on the ground. WKT
         * reference: https://www.opengeospatial.org/standards/wkt-crs. Ignored if included with a
         * POST or PUT request that also specifies a valid 'area' field.
         */
        fun atext(atext: String) = atext(JsonField.of(atext))

        /**
         * Sets [Builder.atext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.atext] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun atext(atext: JsonField<String>) = apply { this.atext = atext }

        /** Type of region as projected on the ground. */
        fun atype(atype: String) = atype(JsonField.of(atype))

        /**
         * Sets [Builder.atype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.atype] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun atype(atype: JsonField<String>) = apply { this.atype = atype }

        /**
         * Target object pointing azimuth angle, in degrees (for target with sensing or emitting
         * capability).
         */
        fun az(az: Double) = az(JsonField.of(az))

        /**
         * Sets [Builder.az] to an arbitrary JSON value.
         *
         * You should usually call [Builder.az] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun az(az: JsonField<Double>) = apply { this.az = az }

        /** The Basic Encyclopedia Number associated with the POI, if applicable. */
        fun beNumber(beNumber: String) = beNumber(JsonField.of(beNumber))

        /**
         * Sets [Builder.beNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beNumber] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun beNumber(beNumber: JsonField<String>) = apply { this.beNumber = beNumber }

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

        /**
         * Contact information for assets reporting PPLI (Precise Participant Location and
         * Identification). PPLI is a Link 16 message that is used by units to transmit complete
         * location, identification, and limited status information.
         */
        fun cntct(cntct: String) = cntct(JsonField.of(cntct))

        /**
         * Sets [Builder.cntct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cntct] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cntct(cntct: JsonField<String>) = apply { this.cntct = cntct }

        /**
         * POI confidence estimate (not standardized, but typically a value between 0 and 1, with 0
         * indicating lowest confidence.
         */
        fun conf(conf: Double) = conf(JsonField.of(conf))

        /**
         * Sets [Builder.conf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conf] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun conf(conf: JsonField<Double>) = apply { this.conf = conf }

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

        /** Description of the POI target object. */
        fun desc(desc: String) = desc(JsonField.of(desc))

        /**
         * Sets [Builder.desc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.desc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun desc(desc: JsonField<String>) = apply { this.desc = desc }

        /**
         * Target object pointing elevation angle, in degrees (for target with sensing or emitting
         * capability).
         */
        fun el(el: Double) = el(JsonField.of(el))

        /**
         * Sets [Builder.el] to an arbitrary JSON value.
         *
         * You should usually call [Builder.el] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun el(el: JsonField<Double>) = apply { this.el = el }

        /**
         * Elliptical area about the lat/lon point, specified as
         * [semi-major axis (m), semi-minor axis (m), orientation (deg) off true North at POI].
         */
        fun elle(elle: List<Double>) = elle(JsonField.of(elle))

        /**
         * Sets [Builder.elle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elle] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun elle(elle: JsonField<List<Double>>) = apply {
            this.elle = elle.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.elle].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addElle(elle: Double) = apply {
            this.elle =
                (this.elle ?: JsonField.of(mutableListOf())).also {
                    checkKnown("elle", it).add(elle)
                }
        }

        /** POI environment type (e.g., LAND, SURFACE, SUBSURFACE, UNKNOWN, etc.). */
        fun env(env: String) = env(JsonField.of(env))

        /**
         * Sets [Builder.env] to an arbitrary JSON value.
         *
         * You should usually call [Builder.env] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun env(env: JsonField<String>) = apply { this.env = env }

        /**
         * Optional array of groups used when a POI msg originates from a TAK server. Each group
         * must be no longer than 256 characters. Groups identify a set of users targeted by the
         * cot/poi msg.
         */
        fun groups(groups: List<String>) = groups(JsonField.of(groups))

        /**
         * Sets [Builder.groups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groups] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groups(groups: JsonField<List<String>>) = apply {
            this.groups = groups.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [groups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroup(group: String) = apply {
            groups =
                (groups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groups", it).add(group)
                }
        }

        /** How the event point was generated, in CoT object heirarchy notation (optional, CoT). */
        fun how(how: String) = how(JsonField.of(how))

        /**
         * Sets [Builder.how] to an arbitrary JSON value.
         *
         * You should usually call [Builder.how] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun how(how: JsonField<String>) = apply { this.how = how }

        /**
         * Estimated identity of the point/object (e.g., FRIEND, HOSTILE, SUSPECT, ASSUMED_FRIEND,
         * UNKNOWN, etc.).
         */
        fun ident(ident: String) = ident(JsonField.of(ident))

        /**
         * Sets [Builder.ident] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ident] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ident(ident: JsonField<String>) = apply { this.ident = ident }

        /**
         * Array of one or more unique identifiers of weather records associated with this POI. Each
         * element in array must be 36 characters or less in length.
         */
        fun idWeatherReport(idWeatherReport: List<String>) =
            idWeatherReport(JsonField.of(idWeatherReport))

        /**
         * Sets [Builder.idWeatherReport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idWeatherReport] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idWeatherReport(idWeatherReport: JsonField<List<String>>) = apply {
            this.idWeatherReport = idWeatherReport.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.idWeatherReport].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIdWeatherReport(idWeatherReport: String) = apply {
            this.idWeatherReport =
                (this.idWeatherReport ?: JsonField.of(mutableListOf())).also {
                    checkKnown("idWeatherReport", it).add(idWeatherReport)
                }
        }

        /** WGS-84 latitude of the POI, in degrees (+N, -S), -90 to 90. */
        fun lat(lat: Double) = lat(JsonField.of(lat))

        /**
         * Sets [Builder.lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

        /** Height above lat/lon point, in meters (1-sigma, if representing linear error). */
        fun le(le: Double) = le(JsonField.of(le))

        /**
         * Sets [Builder.le] to an arbitrary JSON value.
         *
         * You should usually call [Builder.le] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun le(le: JsonField<Double>) = apply { this.le = le }

        /** WGS-84 longitude of the POI, in degrees (+E, -W), -180 to 180. */
        fun lon(lon: Double) = lon(JsonField.of(lon))

        /**
         * Sets [Builder.lon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

        /** Optional mission ID related to the POI. */
        fun msnid(msnid: String) = msnid(JsonField.of(msnid))

        /**
         * Sets [Builder.msnid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msnid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun msnid(msnid: JsonField<String>) = apply { this.msnid = msnid }

        /**
         * The orientation of a vehicle, platform or other entity described by the POI. The
         * orientation is defined as the pointing direction of the front/nose of the object in
         * degrees clockwise from true North at the object point.
         */
        fun orientation(orientation: Double) = orientation(JsonField.of(orientation))

        /**
         * Sets [Builder.orientation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orientation] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun orientation(orientation: JsonField<Double>) = apply { this.orientation = orientation }

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

        /** POI/object platform type (e.g., 14/GROUND, COMBAT_VEHICLE, etc.). */
        fun plat(plat: String) = plat(JsonField.of(plat))

        /**
         * Sets [Builder.plat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plat] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun plat(plat: JsonField<String>) = apply { this.plat = plat }

        /**
         * The purpose of this Point of Interest record (e.g., BDA, EQPT, EVENT, GEOL, HZRD, PPLI,
         * SHOTBOX, SURVL, TGT, TSK, WTHR).
         */
        fun pps(pps: String) = pps(JsonField.of(pps))

        /**
         * Sets [Builder.pps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pps] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pps(pps: JsonField<String>) = apply { this.pps = pps }

        /** Priority of the POI target object. */
        fun pri(pri: Int) = pri(JsonField.of(pri))

        /**
         * Sets [Builder.pri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pri] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pri(pri: JsonField<Int>) = apply { this.pri = pri }

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

        /** Specific point/object type (e.g., 82/GROUND, LIGHT_TANK, etc.). */
        fun spec(spec: String) = spec(JsonField.of(spec))

        /**
         * Sets [Builder.spec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spec] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spec(spec: JsonField<String>) = apply { this.spec = spec }

        /** Stale timestamp (optional), in ISO8601 UTC format. */
        fun stale(stale: OffsetDateTime) = stale(JsonField.of(stale))

        /**
         * Sets [Builder.stale] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stale] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stale(stale: JsonField<OffsetDateTime>) = apply { this.stale = stale }

        /** Start time of event validity (optional), in ISO8601 UTC format. */
        fun start(start: OffsetDateTime) = start(JsonField.of(start))

        /**
         * Sets [Builder.start] to an arbitrary JSON value.
         *
         * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

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

        /**
         * Optional ID of an associated track related to the POI object, if applicable. This track
         * ID should correlate the Point of Interest to a track from the Track service.
         */
        fun trkid(trkid: String) = trkid(JsonField.of(trkid))

        /**
         * Sets [Builder.trkid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trkid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trkid(trkid: JsonField<String>) = apply { this.trkid = trkid }

        /** Event type, in CoT object heirarchy notation (optional, CoT). */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** List of URLs to before/after images of this Point of Interest entity. */
        fun urls(urls: List<String>) = urls(JsonField.of(urls))

        /**
         * Sets [Builder.urls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urls] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun urls(urls: JsonField<List<String>>) = apply {
            this.urls = urls.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [urls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUrl(url: String) = apply {
            urls = (urls ?: JsonField.of(mutableListOf())).also { checkKnown("urls", it).add(url) }
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
         * Returns an immutable instance of [PoiListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .poiid()
         * .source()
         * .ts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PoiListResponse =
            PoiListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("name", name),
                checkRequired("poiid", poiid),
                checkRequired("source", source),
                checkRequired("ts", ts),
                id,
                activity,
                agjson,
                alt,
                andims,
                asrid,
                asset,
                atext,
                atype,
                az,
                beNumber,
                ce,
                cntct,
                conf,
                createdAt,
                createdBy,
                desc,
                el,
                (elle ?: JsonMissing.of()).map { it.toImmutable() },
                env,
                (groups ?: JsonMissing.of()).map { it.toImmutable() },
                how,
                ident,
                (idWeatherReport ?: JsonMissing.of()).map { it.toImmutable() },
                lat,
                le,
                lon,
                msnid,
                orientation,
                origin,
                origNetwork,
                plat,
                pps,
                pri,
                sourceDl,
                spec,
                stale,
                start,
                transactionId,
                trkid,
                type,
                (urls ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PoiListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        name()
        poiid()
        source()
        ts()
        id()
        activity()
        agjson()
        alt()
        andims()
        asrid()
        asset()
        atext()
        atype()
        az()
        beNumber()
        ce()
        cntct()
        conf()
        createdAt()
        createdBy()
        desc()
        el()
        elle()
        env()
        groups()
        how()
        ident()
        idWeatherReport()
        lat()
        le()
        lon()
        msnid()
        orientation()
        origin()
        origNetwork()
        plat()
        pps()
        pri()
        sourceDl()
        spec()
        stale()
        start()
        transactionId()
        trkid()
        type()
        urls()
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (poiid.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (ts.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (activity.asKnown().isPresent) 1 else 0) +
            (if (agjson.asKnown().isPresent) 1 else 0) +
            (if (alt.asKnown().isPresent) 1 else 0) +
            (if (andims.asKnown().isPresent) 1 else 0) +
            (if (asrid.asKnown().isPresent) 1 else 0) +
            (if (asset.asKnown().isPresent) 1 else 0) +
            (if (atext.asKnown().isPresent) 1 else 0) +
            (if (atype.asKnown().isPresent) 1 else 0) +
            (if (az.asKnown().isPresent) 1 else 0) +
            (if (beNumber.asKnown().isPresent) 1 else 0) +
            (if (ce.asKnown().isPresent) 1 else 0) +
            (if (cntct.asKnown().isPresent) 1 else 0) +
            (if (conf.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (desc.asKnown().isPresent) 1 else 0) +
            (if (el.asKnown().isPresent) 1 else 0) +
            (elle.asKnown().getOrNull()?.size ?: 0) +
            (if (env.asKnown().isPresent) 1 else 0) +
            (groups.asKnown().getOrNull()?.size ?: 0) +
            (if (how.asKnown().isPresent) 1 else 0) +
            (if (ident.asKnown().isPresent) 1 else 0) +
            (idWeatherReport.asKnown().getOrNull()?.size ?: 0) +
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (le.asKnown().isPresent) 1 else 0) +
            (if (lon.asKnown().isPresent) 1 else 0) +
            (if (msnid.asKnown().isPresent) 1 else 0) +
            (if (orientation.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (plat.asKnown().isPresent) 1 else 0) +
            (if (pps.asKnown().isPresent) 1 else 0) +
            (if (pri.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (spec.asKnown().isPresent) 1 else 0) +
            (if (stale.asKnown().isPresent) 1 else 0) +
            (if (start.asKnown().isPresent) 1 else 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (trkid.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (urls.asKnown().getOrNull()?.size ?: 0)

    /**
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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

        return other is PoiListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            name == other.name &&
            poiid == other.poiid &&
            source == other.source &&
            ts == other.ts &&
            id == other.id &&
            activity == other.activity &&
            agjson == other.agjson &&
            alt == other.alt &&
            andims == other.andims &&
            asrid == other.asrid &&
            asset == other.asset &&
            atext == other.atext &&
            atype == other.atype &&
            az == other.az &&
            beNumber == other.beNumber &&
            ce == other.ce &&
            cntct == other.cntct &&
            conf == other.conf &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            desc == other.desc &&
            el == other.el &&
            elle == other.elle &&
            env == other.env &&
            groups == other.groups &&
            how == other.how &&
            ident == other.ident &&
            idWeatherReport == other.idWeatherReport &&
            lat == other.lat &&
            le == other.le &&
            lon == other.lon &&
            msnid == other.msnid &&
            orientation == other.orientation &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            plat == other.plat &&
            pps == other.pps &&
            pri == other.pri &&
            sourceDl == other.sourceDl &&
            spec == other.spec &&
            stale == other.stale &&
            start == other.start &&
            transactionId == other.transactionId &&
            trkid == other.trkid &&
            type == other.type &&
            urls == other.urls &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            name,
            poiid,
            source,
            ts,
            id,
            activity,
            agjson,
            alt,
            andims,
            asrid,
            asset,
            atext,
            atype,
            az,
            beNumber,
            ce,
            cntct,
            conf,
            createdAt,
            createdBy,
            desc,
            el,
            elle,
            env,
            groups,
            how,
            ident,
            idWeatherReport,
            lat,
            le,
            lon,
            msnid,
            orientation,
            origin,
            origNetwork,
            plat,
            pps,
            pri,
            sourceDl,
            spec,
            stale,
            start,
            transactionId,
            trkid,
            type,
            urls,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PoiListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, name=$name, poiid=$poiid, source=$source, ts=$ts, id=$id, activity=$activity, agjson=$agjson, alt=$alt, andims=$andims, asrid=$asrid, asset=$asset, atext=$atext, atype=$atype, az=$az, beNumber=$beNumber, ce=$ce, cntct=$cntct, conf=$conf, createdAt=$createdAt, createdBy=$createdBy, desc=$desc, el=$el, elle=$elle, env=$env, groups=$groups, how=$how, ident=$ident, idWeatherReport=$idWeatherReport, lat=$lat, le=$le, lon=$lon, msnid=$msnid, orientation=$orientation, origin=$origin, origNetwork=$origNetwork, plat=$plat, pps=$pps, pri=$pri, sourceDl=$sourceDl, spec=$spec, stale=$stale, start=$start, transactionId=$transactionId, trkid=$trkid, type=$type, urls=$urls, additionalProperties=$additionalProperties}"
}

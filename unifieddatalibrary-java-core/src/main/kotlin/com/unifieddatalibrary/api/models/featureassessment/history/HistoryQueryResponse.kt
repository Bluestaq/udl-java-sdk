// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.featureassessment.history

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
 * Feature assessments obtained from imagery analysis or other data analytics. Feature assessments
 * are georeferenced terrestrial features such as marine vessels, vehicles, buildings, etc., or
 * contain other types of non terrestrial assessments such as spacecraft structures. Geospatial
 * queries are supported through either the regionText (WKT) or regionGeoJSON fields.
 */
class HistoryQueryResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val featureTs: JsonField<OffsetDateTime>,
    private val featureUoM: JsonField<String>,
    private val idAnalyticImagery: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val agjson: JsonField<String>,
    private val andims: JsonField<Int>,
    private val annLims: JsonField<List<List<Int>>>,
    private val annText: JsonField<List<String>>,
    private val area: JsonField<String>,
    private val asrid: JsonField<Int>,
    private val assessment: JsonField<String>,
    private val atext: JsonField<String>,
    private val atype: JsonField<String>,
    private val confidence: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val externalId: JsonField<String>,
    private val featureArray: JsonField<List<Double>>,
    private val featureBool: JsonField<Boolean>,
    private val featureString: JsonField<String>,
    private val featureStringArray: JsonField<List<String>>,
    private val featureValue: JsonField<Double>,
    private val heading: JsonField<Double>,
    private val height: JsonField<Double>,
    private val length: JsonField<Double>,
    private val name: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val speed: JsonField<Double>,
    private val srcIds: JsonField<List<String>>,
    private val srcTs: JsonField<List<OffsetDateTime>>,
    private val srcTyps: JsonField<List<String>>,
    private val tags: JsonField<List<String>>,
    private val transactionId: JsonField<String>,
    private val type: JsonField<String>,
    private val width: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("featureTs")
        @ExcludeMissing
        featureTs: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("featureUoM")
        @ExcludeMissing
        featureUoM: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idAnalyticImagery")
        @ExcludeMissing
        idAnalyticImagery: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agjson") @ExcludeMissing agjson: JsonField<String> = JsonMissing.of(),
        @JsonProperty("andims") @ExcludeMissing andims: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("annLims")
        @ExcludeMissing
        annLims: JsonField<List<List<Int>>> = JsonMissing.of(),
        @JsonProperty("annText")
        @ExcludeMissing
        annText: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("area") @ExcludeMissing area: JsonField<String> = JsonMissing.of(),
        @JsonProperty("asrid") @ExcludeMissing asrid: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("assessment")
        @ExcludeMissing
        assessment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("atext") @ExcludeMissing atext: JsonField<String> = JsonMissing.of(),
        @JsonProperty("atype") @ExcludeMissing atype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("confidence")
        @ExcludeMissing
        confidence: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalId")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("featureArray")
        @ExcludeMissing
        featureArray: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("featureBool")
        @ExcludeMissing
        featureBool: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("featureString")
        @ExcludeMissing
        featureString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("featureStringArray")
        @ExcludeMissing
        featureStringArray: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("featureValue")
        @ExcludeMissing
        featureValue: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("heading") @ExcludeMissing heading: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("length") @ExcludeMissing length: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("speed") @ExcludeMissing speed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("srcIds") @ExcludeMissing srcIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("srcTs")
        @ExcludeMissing
        srcTs: JsonField<List<OffsetDateTime>> = JsonMissing.of(),
        @JsonProperty("srcTyps")
        @ExcludeMissing
        srcTyps: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        featureTs,
        featureUoM,
        idAnalyticImagery,
        source,
        id,
        agjson,
        andims,
        annLims,
        annText,
        area,
        asrid,
        assessment,
        atext,
        atype,
        confidence,
        createdAt,
        createdBy,
        externalId,
        featureArray,
        featureBool,
        featureString,
        featureStringArray,
        featureValue,
        heading,
        height,
        length,
        name,
        origin,
        origNetwork,
        sourceDl,
        speed,
        srcIds,
        srcTs,
        srcTyps,
        tags,
        transactionId,
        type,
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
     * Datetime type value associated with this record, in ISO 8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun featureTs(): OffsetDateTime = featureTs.getRequired("featureTs")

    /**
     * The Unit of Measure associated with this feature. If there are no physical units associated
     * with the feature a value of NONE should be specified.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun featureUoM(): String = featureUoM.getRequired("featureUoM")

    /**
     * Unique identifier of the Analytic Imagery associated with this Feature Assessment record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idAnalyticImagery(): String = idAnalyticImagery.getRequired("idAnalyticImagery")

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
     * Geographical region or polygon (lat/lon pairs), as depicted by the GeoJSON representation of
     * the geometry/geography, of the feature assessment as projected on the ground. GeoJSON
     * Reference: https://geojson.org/. Ignored if included with a POST or PUT request that also
     * specifies a valid 'area' or 'atext' field.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun agjson(): Optional<String> = agjson.getOptional("agjson")

    /**
     * Number of dimensions of the geometry depicted by region.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun andims(): Optional<Int> = andims.getOptional("andims")

    /**
     * Polygonal annotation limits, specified in pixels, as an array of arrays N x M. Allows the
     * image provider to highlight one or more polygonal area(s) of interest. The array must contain
     * NxM two-element arrays, where N is the number of polygons of interest. The associated
     * annotation(s) should be included in the annText array.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun annLims(): Optional<List<List<Int>>> = annLims.getOptional("annLims")

    /**
     * Annotation text, a string array of annotation(s) corresponding to the rectangular areas
     * specified in annLims. This array contains the annotation text associated with the areas of
     * interest indicated in annLims, in order. This array should contain one annotation per four
     * values of the area (annLims) array.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun annText(): Optional<List<String>> = annText.getOptional("annText")

    /**
     * Optional geographical region or polygon (lat/lon pairs) of the area surrounding the feature
     * assessment as projected on the ground.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun area(): Optional<String> = area.getOptional("area")

    /**
     * Geographical spatial_ref_sys for region.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun asrid(): Optional<Int> = asrid.getOptional("asrid")

    /**
     * Descriptive or additional information associated with this feature/assessment.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun assessment(): Optional<String> = assessment.getOptional("assessment")

    /**
     * Geographical region or polygon (lon/lat pairs), as depicted by the Well-Known Text
     * representation of the geometry/geography, of the feature assessment as projected on the
     * ground. WKT reference: https://www.opengeospatial.org/standards/wkt-crs. Ignored if included
     * with a POST or PUT request that also specifies a valid 'area' field.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun atext(): Optional<String> = atext.getOptional("atext")

    /**
     * Type of region as projected on the ground (POLYGON, POINT, LINE).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun atype(): Optional<String> = atype.getOptional("atype")

    /**
     * Analytic confidence of feature accuracy (0 to 1).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun confidence(): Optional<Double> = confidence.getOptional("confidence")

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
     * Feature Assessment ID from external systems. This field has no meaning within UDL and is
     * provided as a convenience for systems that require tracking of an internal system generated
     * ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("externalId")

    /**
     * An array of numeric feature/assessment values expressed in the specified unit of measure
     * (obUoM). Because of the variability of the Feature Assessment data types, each record may
     * employ a numeric observation value (featureValue), a string observation value
     * (featureString), a Boolean observation value (featureBool), an array of numeric observation
     * values (featureArray), or any combination of these.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun featureArray(): Optional<List<Double>> = featureArray.getOptional("featureArray")

    /**
     * A boolean feature/assessment. Because of the variability of the Feature Assessment data
     * types, each record may employ a numeric observation value (featureValue), a string
     * observation value (featureString), a Boolean observation value (featureBool), an array of
     * numeric observation values (featureArray), or any combination of these.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun featureBool(): Optional<Boolean> = featureBool.getOptional("featureBool")

    /**
     * A single feature/assessment string expressed in the specified unit of measure (obUoM).
     * Because of the variability of the Feature Assessment data types, each record may employ a
     * numeric observation value (featureValue), a string observation value (featureString), a
     * Boolean observation value (featureBool), an array of numeric observation values
     * (featureArray), or any combination of these.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun featureString(): Optional<String> = featureString.getOptional("featureString")

    /**
     * An array of string feature/assessment expressions. Because of the variability of the Feature
     * Assessment data types, each record may employ a numeric observation value (featureValue), a
     * string observation value (featureString), a Boolean observation value (featureBool), an array
     * of numeric observation values (featureArray), or any combination of these.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun featureStringArray(): Optional<List<String>> =
        featureStringArray.getOptional("featureStringArray")

    /**
     * A single feature/assessment value expressed in the specified unit of measure (obUoM). Because
     * of the variability of the Feature Assessment data types, each record may employ a numeric
     * observation value (featureValue), a string observation value (featureString), a Boolean
     * observation value (featureBool), an array of numeric observation values (featureArray), or
     * any combination of these.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun featureValue(): Optional<Double> = featureValue.getOptional("featureValue")

    /**
     * The feature object heading, in degrees clockwise from true North at the object location.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun heading(): Optional<Double> = heading.getOptional("heading")

    /**
     * Estimated physical height of the feature, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun height(): Optional<Double> = height.getOptional("height")

    /**
     * Estimated physical length of the feature, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun length(): Optional<Double> = length.getOptional("length")

    /**
     * Source defined name of the feature associated with this record. If an annotation for this
     * feature element exists on the parent image it can be referenced here.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

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
     * The source data library from which this record was received. This could be a remote or
     * tactical UDL or another data library. If null, the record should be assumed to have
     * originated from the primary Enterprise UDL.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

    /**
     * Feature's speed of travel, in meters per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun speed(): Optional<Double> = speed.getOptional("speed")

    /**
     * Array of UUIDs of the UDL data records that are related to the determination of this activity
     * or event. See the associated 'srcTyps' array for the specific types of data, positionally
     * corresponding to the UUIDs in this array. The 'srcTyps', 'srcIds', and 'srcTs' arrays must
     * contain the same number of elements. See the corresponding srcTyps array element for the data
     * type of the UUID and use the appropriate API operation to retrieve that object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun srcIds(): Optional<List<String>> = srcIds.getOptional("srcIds")

    /**
     * Array of the primary timestamps, in ISO 8601 UTC format, with appropriate precision for the
     * datatype of each correspondng srcTyp/srcId record. See the associated 'srcTyps' and 'srcIds'
     * arrays for the record type and UUID, respectively, positionally corresponding to the record
     * types in this array. The 'srcTyps', 'srcIds', and 'srcTs' arrays must contain the same number
     * of elements. These timestamps are included to support services which do not include a GET by
     * {id} operation. If referencing a datatype which does not include a primary timestamp, the
     * corresponding srcTs array element should be included as null.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun srcTs(): Optional<List<OffsetDateTime>> = srcTs.getOptional("srcTs")

    /**
     * Array of UDL record types (AIS, GROUNDIMAGE, MTI, ONORBIT, POI, SAR, SKYIMAGE, SOI, TRACK)
     * related to this feature assessment. See the associated 'srcIds' and 'srcTs' arrays for the
     * record UUIDs and timetsmps. respectively, positionally corresponding to the record types in
     * this array. The 'srcTyps', 'srcIds', and 'srcTs' arrays must contain the same number of
     * elements.
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
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

    /**
     * The type of feature (e.g. AIRCRAFT, ANTENNA, SOLAR ARRAY, SITE, STRUCTURE, VESSEL, VEHICLE,
     * UNKNOWN, etc.) detailed in this feature assessment record. This type may be a primary feature
     * within an image, for example a VESSEL, or may be a component or characteristic of a primary
     * feature, for example an ANTENNA mounted on a vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Estimated physical width of the feature, in meters.
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
     * Returns the raw JSON value of [featureTs].
     *
     * Unlike [featureTs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("featureTs")
    @ExcludeMissing
    fun _featureTs(): JsonField<OffsetDateTime> = featureTs

    /**
     * Returns the raw JSON value of [featureUoM].
     *
     * Unlike [featureUoM], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("featureUoM") @ExcludeMissing fun _featureUoM(): JsonField<String> = featureUoM

    /**
     * Returns the raw JSON value of [idAnalyticImagery].
     *
     * Unlike [idAnalyticImagery], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("idAnalyticImagery")
    @ExcludeMissing
    fun _idAnalyticImagery(): JsonField<String> = idAnalyticImagery

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
     * Returns the raw JSON value of [agjson].
     *
     * Unlike [agjson], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agjson") @ExcludeMissing fun _agjson(): JsonField<String> = agjson

    /**
     * Returns the raw JSON value of [andims].
     *
     * Unlike [andims], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("andims") @ExcludeMissing fun _andims(): JsonField<Int> = andims

    /**
     * Returns the raw JSON value of [annLims].
     *
     * Unlike [annLims], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("annLims") @ExcludeMissing fun _annLims(): JsonField<List<List<Int>>> = annLims

    /**
     * Returns the raw JSON value of [annText].
     *
     * Unlike [annText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("annText") @ExcludeMissing fun _annText(): JsonField<List<String>> = annText

    /**
     * Returns the raw JSON value of [area].
     *
     * Unlike [area], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("area") @ExcludeMissing fun _area(): JsonField<String> = area

    /**
     * Returns the raw JSON value of [asrid].
     *
     * Unlike [asrid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("asrid") @ExcludeMissing fun _asrid(): JsonField<Int> = asrid

    /**
     * Returns the raw JSON value of [assessment].
     *
     * Unlike [assessment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assessment") @ExcludeMissing fun _assessment(): JsonField<String> = assessment

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
     * Returns the raw JSON value of [confidence].
     *
     * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confidence") @ExcludeMissing fun _confidence(): JsonField<Double> = confidence

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
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalId") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [featureArray].
     *
     * Unlike [featureArray], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("featureArray")
    @ExcludeMissing
    fun _featureArray(): JsonField<List<Double>> = featureArray

    /**
     * Returns the raw JSON value of [featureBool].
     *
     * Unlike [featureBool], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("featureBool")
    @ExcludeMissing
    fun _featureBool(): JsonField<Boolean> = featureBool

    /**
     * Returns the raw JSON value of [featureString].
     *
     * Unlike [featureString], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("featureString")
    @ExcludeMissing
    fun _featureString(): JsonField<String> = featureString

    /**
     * Returns the raw JSON value of [featureStringArray].
     *
     * Unlike [featureStringArray], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("featureStringArray")
    @ExcludeMissing
    fun _featureStringArray(): JsonField<List<String>> = featureStringArray

    /**
     * Returns the raw JSON value of [featureValue].
     *
     * Unlike [featureValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("featureValue")
    @ExcludeMissing
    fun _featureValue(): JsonField<Double> = featureValue

    /**
     * Returns the raw JSON value of [heading].
     *
     * Unlike [heading], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("heading") @ExcludeMissing fun _heading(): JsonField<Double> = heading

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Double> = height

    /**
     * Returns the raw JSON value of [length].
     *
     * Unlike [length], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Double> = length

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [speed].
     *
     * Unlike [speed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speed") @ExcludeMissing fun _speed(): JsonField<Double> = speed

    /**
     * Returns the raw JSON value of [srcIds].
     *
     * Unlike [srcIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("srcIds") @ExcludeMissing fun _srcIds(): JsonField<List<String>> = srcIds

    /**
     * Returns the raw JSON value of [srcTs].
     *
     * Unlike [srcTs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("srcTs") @ExcludeMissing fun _srcTs(): JsonField<List<OffsetDateTime>> = srcTs

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
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
         * Returns a mutable builder for constructing an instance of [HistoryQueryResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .featureTs()
         * .featureUoM()
         * .idAnalyticImagery()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HistoryQueryResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var featureTs: JsonField<OffsetDateTime>? = null
        private var featureUoM: JsonField<String>? = null
        private var idAnalyticImagery: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var agjson: JsonField<String> = JsonMissing.of()
        private var andims: JsonField<Int> = JsonMissing.of()
        private var annLims: JsonField<MutableList<List<Int>>>? = null
        private var annText: JsonField<MutableList<String>>? = null
        private var area: JsonField<String> = JsonMissing.of()
        private var asrid: JsonField<Int> = JsonMissing.of()
        private var assessment: JsonField<String> = JsonMissing.of()
        private var atext: JsonField<String> = JsonMissing.of()
        private var atype: JsonField<String> = JsonMissing.of()
        private var confidence: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var featureArray: JsonField<MutableList<Double>>? = null
        private var featureBool: JsonField<Boolean> = JsonMissing.of()
        private var featureString: JsonField<String> = JsonMissing.of()
        private var featureStringArray: JsonField<MutableList<String>>? = null
        private var featureValue: JsonField<Double> = JsonMissing.of()
        private var heading: JsonField<Double> = JsonMissing.of()
        private var height: JsonField<Double> = JsonMissing.of()
        private var length: JsonField<Double> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var speed: JsonField<Double> = JsonMissing.of()
        private var srcIds: JsonField<MutableList<String>>? = null
        private var srcTs: JsonField<MutableList<OffsetDateTime>>? = null
        private var srcTyps: JsonField<MutableList<String>>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var width: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(historyQueryResponse: HistoryQueryResponse) = apply {
            classificationMarking = historyQueryResponse.classificationMarking
            dataMode = historyQueryResponse.dataMode
            featureTs = historyQueryResponse.featureTs
            featureUoM = historyQueryResponse.featureUoM
            idAnalyticImagery = historyQueryResponse.idAnalyticImagery
            source = historyQueryResponse.source
            id = historyQueryResponse.id
            agjson = historyQueryResponse.agjson
            andims = historyQueryResponse.andims
            annLims = historyQueryResponse.annLims.map { it.toMutableList() }
            annText = historyQueryResponse.annText.map { it.toMutableList() }
            area = historyQueryResponse.area
            asrid = historyQueryResponse.asrid
            assessment = historyQueryResponse.assessment
            atext = historyQueryResponse.atext
            atype = historyQueryResponse.atype
            confidence = historyQueryResponse.confidence
            createdAt = historyQueryResponse.createdAt
            createdBy = historyQueryResponse.createdBy
            externalId = historyQueryResponse.externalId
            featureArray = historyQueryResponse.featureArray.map { it.toMutableList() }
            featureBool = historyQueryResponse.featureBool
            featureString = historyQueryResponse.featureString
            featureStringArray = historyQueryResponse.featureStringArray.map { it.toMutableList() }
            featureValue = historyQueryResponse.featureValue
            heading = historyQueryResponse.heading
            height = historyQueryResponse.height
            length = historyQueryResponse.length
            name = historyQueryResponse.name
            origin = historyQueryResponse.origin
            origNetwork = historyQueryResponse.origNetwork
            sourceDl = historyQueryResponse.sourceDl
            speed = historyQueryResponse.speed
            srcIds = historyQueryResponse.srcIds.map { it.toMutableList() }
            srcTs = historyQueryResponse.srcTs.map { it.toMutableList() }
            srcTyps = historyQueryResponse.srcTyps.map { it.toMutableList() }
            tags = historyQueryResponse.tags.map { it.toMutableList() }
            transactionId = historyQueryResponse.transactionId
            type = historyQueryResponse.type
            width = historyQueryResponse.width
            additionalProperties = historyQueryResponse.additionalProperties.toMutableMap()
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
         * Datetime type value associated with this record, in ISO 8601 UTC format with millisecond
         * precision.
         */
        fun featureTs(featureTs: OffsetDateTime) = featureTs(JsonField.of(featureTs))

        /**
         * Sets [Builder.featureTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureTs] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun featureTs(featureTs: JsonField<OffsetDateTime>) = apply { this.featureTs = featureTs }

        /**
         * The Unit of Measure associated with this feature. If there are no physical units
         * associated with the feature a value of NONE should be specified.
         */
        fun featureUoM(featureUoM: String) = featureUoM(JsonField.of(featureUoM))

        /**
         * Sets [Builder.featureUoM] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureUoM] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun featureUoM(featureUoM: JsonField<String>) = apply { this.featureUoM = featureUoM }

        /**
         * Unique identifier of the Analytic Imagery associated with this Feature Assessment record.
         */
        fun idAnalyticImagery(idAnalyticImagery: String) =
            idAnalyticImagery(JsonField.of(idAnalyticImagery))

        /**
         * Sets [Builder.idAnalyticImagery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idAnalyticImagery] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idAnalyticImagery(idAnalyticImagery: JsonField<String>) = apply {
            this.idAnalyticImagery = idAnalyticImagery
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
         * Geographical region or polygon (lat/lon pairs), as depicted by the GeoJSON representation
         * of the geometry/geography, of the feature assessment as projected on the ground. GeoJSON
         * Reference: https://geojson.org/. Ignored if included with a POST or PUT request that also
         * specifies a valid 'area' or 'atext' field.
         */
        fun agjson(agjson: String) = agjson(JsonField.of(agjson))

        /**
         * Sets [Builder.agjson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agjson] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agjson(agjson: JsonField<String>) = apply { this.agjson = agjson }

        /** Number of dimensions of the geometry depicted by region. */
        fun andims(andims: Int) = andims(JsonField.of(andims))

        /**
         * Sets [Builder.andims] to an arbitrary JSON value.
         *
         * You should usually call [Builder.andims] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun andims(andims: JsonField<Int>) = apply { this.andims = andims }

        /**
         * Polygonal annotation limits, specified in pixels, as an array of arrays N x M. Allows the
         * image provider to highlight one or more polygonal area(s) of interest. The array must
         * contain NxM two-element arrays, where N is the number of polygons of interest. The
         * associated annotation(s) should be included in the annText array.
         */
        fun annLims(annLims: List<List<Int>>) = annLims(JsonField.of(annLims))

        /**
         * Sets [Builder.annLims] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annLims] with a well-typed `List<List<Int>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun annLims(annLims: JsonField<List<List<Int>>>) = apply {
            this.annLims = annLims.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<Int>] to [annLims].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAnnLim(annLim: List<Int>) = apply {
            annLims =
                (annLims ?: JsonField.of(mutableListOf())).also {
                    checkKnown("annLims", it).add(annLim)
                }
        }

        /**
         * Annotation text, a string array of annotation(s) corresponding to the rectangular areas
         * specified in annLims. This array contains the annotation text associated with the areas
         * of interest indicated in annLims, in order. This array should contain one annotation per
         * four values of the area (annLims) array.
         */
        fun annText(annText: List<String>) = annText(JsonField.of(annText))

        /**
         * Sets [Builder.annText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annText] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun annText(annText: JsonField<List<String>>) = apply {
            this.annText = annText.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.annText].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAnnText(annText: String) = apply {
            this.annText =
                (this.annText ?: JsonField.of(mutableListOf())).also {
                    checkKnown("annText", it).add(annText)
                }
        }

        /**
         * Optional geographical region or polygon (lat/lon pairs) of the area surrounding the
         * feature assessment as projected on the ground.
         */
        fun area(area: String) = area(JsonField.of(area))

        /**
         * Sets [Builder.area] to an arbitrary JSON value.
         *
         * You should usually call [Builder.area] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun area(area: JsonField<String>) = apply { this.area = area }

        /** Geographical spatial_ref_sys for region. */
        fun asrid(asrid: Int) = asrid(JsonField.of(asrid))

        /**
         * Sets [Builder.asrid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asrid] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun asrid(asrid: JsonField<Int>) = apply { this.asrid = asrid }

        /** Descriptive or additional information associated with this feature/assessment. */
        fun assessment(assessment: String) = assessment(JsonField.of(assessment))

        /**
         * Sets [Builder.assessment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assessment] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assessment(assessment: JsonField<String>) = apply { this.assessment = assessment }

        /**
         * Geographical region or polygon (lon/lat pairs), as depicted by the Well-Known Text
         * representation of the geometry/geography, of the feature assessment as projected on the
         * ground. WKT reference: https://www.opengeospatial.org/standards/wkt-crs. Ignored if
         * included with a POST or PUT request that also specifies a valid 'area' field.
         */
        fun atext(atext: String) = atext(JsonField.of(atext))

        /**
         * Sets [Builder.atext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.atext] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun atext(atext: JsonField<String>) = apply { this.atext = atext }

        /** Type of region as projected on the ground (POLYGON, POINT, LINE). */
        fun atype(atype: String) = atype(JsonField.of(atype))

        /**
         * Sets [Builder.atype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.atype] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun atype(atype: JsonField<String>) = apply { this.atype = atype }

        /** Analytic confidence of feature accuracy (0 to 1). */
        fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

        /**
         * Sets [Builder.confidence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidence] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

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
         * Feature Assessment ID from external systems. This field has no meaning within UDL and is
         * provided as a convenience for systems that require tracking of an internal system
         * generated ID.
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
         * An array of numeric feature/assessment values expressed in the specified unit of measure
         * (obUoM). Because of the variability of the Feature Assessment data types, each record may
         * employ a numeric observation value (featureValue), a string observation value
         * (featureString), a Boolean observation value (featureBool), an array of numeric
         * observation values (featureArray), or any combination of these.
         */
        fun featureArray(featureArray: List<Double>) = featureArray(JsonField.of(featureArray))

        /**
         * Sets [Builder.featureArray] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureArray] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun featureArray(featureArray: JsonField<List<Double>>) = apply {
            this.featureArray = featureArray.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.featureArray].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFeatureArray(featureArray: Double) = apply {
            this.featureArray =
                (this.featureArray ?: JsonField.of(mutableListOf())).also {
                    checkKnown("featureArray", it).add(featureArray)
                }
        }

        /**
         * A boolean feature/assessment. Because of the variability of the Feature Assessment data
         * types, each record may employ a numeric observation value (featureValue), a string
         * observation value (featureString), a Boolean observation value (featureBool), an array of
         * numeric observation values (featureArray), or any combination of these.
         */
        fun featureBool(featureBool: Boolean) = featureBool(JsonField.of(featureBool))

        /**
         * Sets [Builder.featureBool] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureBool] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun featureBool(featureBool: JsonField<Boolean>) = apply { this.featureBool = featureBool }

        /**
         * A single feature/assessment string expressed in the specified unit of measure (obUoM).
         * Because of the variability of the Feature Assessment data types, each record may employ a
         * numeric observation value (featureValue), a string observation value (featureString), a
         * Boolean observation value (featureBool), an array of numeric observation values
         * (featureArray), or any combination of these.
         */
        fun featureString(featureString: String) = featureString(JsonField.of(featureString))

        /**
         * Sets [Builder.featureString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureString] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun featureString(featureString: JsonField<String>) = apply {
            this.featureString = featureString
        }

        /**
         * An array of string feature/assessment expressions. Because of the variability of the
         * Feature Assessment data types, each record may employ a numeric observation value
         * (featureValue), a string observation value (featureString), a Boolean observation value
         * (featureBool), an array of numeric observation values (featureArray), or any combination
         * of these.
         */
        fun featureStringArray(featureStringArray: List<String>) =
            featureStringArray(JsonField.of(featureStringArray))

        /**
         * Sets [Builder.featureStringArray] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureStringArray] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun featureStringArray(featureStringArray: JsonField<List<String>>) = apply {
            this.featureStringArray = featureStringArray.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.featureStringArray].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFeatureStringArray(featureStringArray: String) = apply {
            this.featureStringArray =
                (this.featureStringArray ?: JsonField.of(mutableListOf())).also {
                    checkKnown("featureStringArray", it).add(featureStringArray)
                }
        }

        /**
         * A single feature/assessment value expressed in the specified unit of measure (obUoM).
         * Because of the variability of the Feature Assessment data types, each record may employ a
         * numeric observation value (featureValue), a string observation value (featureString), a
         * Boolean observation value (featureBool), an array of numeric observation values
         * (featureArray), or any combination of these.
         */
        fun featureValue(featureValue: Double) = featureValue(JsonField.of(featureValue))

        /**
         * Sets [Builder.featureValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureValue] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun featureValue(featureValue: JsonField<Double>) = apply {
            this.featureValue = featureValue
        }

        /**
         * The feature object heading, in degrees clockwise from true North at the object location.
         */
        fun heading(heading: Double) = heading(JsonField.of(heading))

        /**
         * Sets [Builder.heading] to an arbitrary JSON value.
         *
         * You should usually call [Builder.heading] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun heading(heading: JsonField<Double>) = apply { this.heading = heading }

        /** Estimated physical height of the feature, in meters. */
        fun height(height: Double) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Double>) = apply { this.height = height }

        /** Estimated physical length of the feature, in meters. */
        fun length(length: Double) = length(JsonField.of(length))

        /**
         * Sets [Builder.length] to an arbitrary JSON value.
         *
         * You should usually call [Builder.length] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun length(length: JsonField<Double>) = apply { this.length = length }

        /**
         * Source defined name of the feature associated with this record. If an annotation for this
         * feature element exists on the parent image it can be referenced here.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        /** Feature's speed of travel, in meters per second. */
        fun speed(speed: Double) = speed(JsonField.of(speed))

        /**
         * Sets [Builder.speed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speed] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun speed(speed: JsonField<Double>) = apply { this.speed = speed }

        /**
         * Array of UUIDs of the UDL data records that are related to the determination of this
         * activity or event. See the associated 'srcTyps' array for the specific types of data,
         * positionally corresponding to the UUIDs in this array. The 'srcTyps', 'srcIds', and
         * 'srcTs' arrays must contain the same number of elements. See the corresponding srcTyps
         * array element for the data type of the UUID and use the appropriate API operation to
         * retrieve that object.
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
         * Array of the primary timestamps, in ISO 8601 UTC format, with appropriate precision for
         * the datatype of each correspondng srcTyp/srcId record. See the associated 'srcTyps' and
         * 'srcIds' arrays for the record type and UUID, respectively, positionally corresponding to
         * the record types in this array. The 'srcTyps', 'srcIds', and 'srcTs' arrays must contain
         * the same number of elements. These timestamps are included to support services which do
         * not include a GET by {id} operation. If referencing a datatype which does not include a
         * primary timestamp, the corresponding srcTs array element should be included as null.
         */
        fun srcTs(srcTs: List<OffsetDateTime>) = srcTs(JsonField.of(srcTs))

        /**
         * Sets [Builder.srcTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.srcTs] with a well-typed `List<OffsetDateTime>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun srcTs(srcTs: JsonField<List<OffsetDateTime>>) = apply {
            this.srcTs = srcTs.map { it.toMutableList() }
        }

        /**
         * Adds a single [OffsetDateTime] to [srcTs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSrcT(srcT: OffsetDateTime) = apply {
            srcTs =
                (srcTs ?: JsonField.of(mutableListOf())).also { checkKnown("srcTs", it).add(srcT) }
        }

        /**
         * Array of UDL record types (AIS, GROUNDIMAGE, MTI, ONORBIT, POI, SAR, SKYIMAGE, SOI,
         * TRACK) related to this feature assessment. See the associated 'srcIds' and 'srcTs' arrays
         * for the record UUIDs and timetsmps. respectively, positionally corresponding to the
         * record types in this array. The 'srcTyps', 'srcIds', and 'srcTs' arrays must contain the
         * same number of elements.
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
         * The type of feature (e.g. AIRCRAFT, ANTENNA, SOLAR ARRAY, SITE, STRUCTURE, VESSEL,
         * VEHICLE, UNKNOWN, etc.) detailed in this feature assessment record. This type may be a
         * primary feature within an image, for example a VESSEL, or may be a component or
         * characteristic of a primary feature, for example an ANTENNA mounted on a vessel.
         */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** Estimated physical width of the feature, in meters. */
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
         * Returns an immutable instance of [HistoryQueryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .featureTs()
         * .featureUoM()
         * .idAnalyticImagery()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HistoryQueryResponse =
            HistoryQueryResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("featureTs", featureTs),
                checkRequired("featureUoM", featureUoM),
                checkRequired("idAnalyticImagery", idAnalyticImagery),
                checkRequired("source", source),
                id,
                agjson,
                andims,
                (annLims ?: JsonMissing.of()).map { it.toImmutable() },
                (annText ?: JsonMissing.of()).map { it.toImmutable() },
                area,
                asrid,
                assessment,
                atext,
                atype,
                confidence,
                createdAt,
                createdBy,
                externalId,
                (featureArray ?: JsonMissing.of()).map { it.toImmutable() },
                featureBool,
                featureString,
                (featureStringArray ?: JsonMissing.of()).map { it.toImmutable() },
                featureValue,
                heading,
                height,
                length,
                name,
                origin,
                origNetwork,
                sourceDl,
                speed,
                (srcIds ?: JsonMissing.of()).map { it.toImmutable() },
                (srcTs ?: JsonMissing.of()).map { it.toImmutable() },
                (srcTyps ?: JsonMissing.of()).map { it.toImmutable() },
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                transactionId,
                type,
                width,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HistoryQueryResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        featureTs()
        featureUoM()
        idAnalyticImagery()
        source()
        id()
        agjson()
        andims()
        annLims()
        annText()
        area()
        asrid()
        assessment()
        atext()
        atype()
        confidence()
        createdAt()
        createdBy()
        externalId()
        featureArray()
        featureBool()
        featureString()
        featureStringArray()
        featureValue()
        heading()
        height()
        length()
        name()
        origin()
        origNetwork()
        sourceDl()
        speed()
        srcIds()
        srcTs()
        srcTyps()
        tags()
        transactionId()
        type()
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
            (if (featureTs.asKnown().isPresent) 1 else 0) +
            (if (featureUoM.asKnown().isPresent) 1 else 0) +
            (if (idAnalyticImagery.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (agjson.asKnown().isPresent) 1 else 0) +
            (if (andims.asKnown().isPresent) 1 else 0) +
            (annLims.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
            (annText.asKnown().getOrNull()?.size ?: 0) +
            (if (area.asKnown().isPresent) 1 else 0) +
            (if (asrid.asKnown().isPresent) 1 else 0) +
            (if (assessment.asKnown().isPresent) 1 else 0) +
            (if (atext.asKnown().isPresent) 1 else 0) +
            (if (atype.asKnown().isPresent) 1 else 0) +
            (if (confidence.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (featureArray.asKnown().getOrNull()?.size ?: 0) +
            (if (featureBool.asKnown().isPresent) 1 else 0) +
            (if (featureString.asKnown().isPresent) 1 else 0) +
            (featureStringArray.asKnown().getOrNull()?.size ?: 0) +
            (if (featureValue.asKnown().isPresent) 1 else 0) +
            (if (heading.asKnown().isPresent) 1 else 0) +
            (if (height.asKnown().isPresent) 1 else 0) +
            (if (length.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (speed.asKnown().isPresent) 1 else 0) +
            (srcIds.asKnown().getOrNull()?.size ?: 0) +
            (srcTs.asKnown().getOrNull()?.size ?: 0) +
            (srcTyps.asKnown().getOrNull()?.size ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
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

        return /* spotless:off */ other is HistoryQueryResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && featureTs == other.featureTs && featureUoM == other.featureUoM && idAnalyticImagery == other.idAnalyticImagery && source == other.source && id == other.id && agjson == other.agjson && andims == other.andims && annLims == other.annLims && annText == other.annText && area == other.area && asrid == other.asrid && assessment == other.assessment && atext == other.atext && atype == other.atype && confidence == other.confidence && createdAt == other.createdAt && createdBy == other.createdBy && externalId == other.externalId && featureArray == other.featureArray && featureBool == other.featureBool && featureString == other.featureString && featureStringArray == other.featureStringArray && featureValue == other.featureValue && heading == other.heading && height == other.height && length == other.length && name == other.name && origin == other.origin && origNetwork == other.origNetwork && sourceDl == other.sourceDl && speed == other.speed && srcIds == other.srcIds && srcTs == other.srcTs && srcTyps == other.srcTyps && tags == other.tags && transactionId == other.transactionId && type == other.type && width == other.width && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, featureTs, featureUoM, idAnalyticImagery, source, id, agjson, andims, annLims, annText, area, asrid, assessment, atext, atype, confidence, createdAt, createdBy, externalId, featureArray, featureBool, featureString, featureStringArray, featureValue, heading, height, length, name, origin, origNetwork, sourceDl, speed, srcIds, srcTs, srcTyps, tags, transactionId, type, width, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HistoryQueryResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, featureTs=$featureTs, featureUoM=$featureUoM, idAnalyticImagery=$idAnalyticImagery, source=$source, id=$id, agjson=$agjson, andims=$andims, annLims=$annLims, annText=$annText, area=$area, asrid=$asrid, assessment=$assessment, atext=$atext, atype=$atype, confidence=$confidence, createdAt=$createdAt, createdBy=$createdBy, externalId=$externalId, featureArray=$featureArray, featureBool=$featureBool, featureString=$featureString, featureStringArray=$featureStringArray, featureValue=$featureValue, heading=$heading, height=$height, length=$length, name=$name, origin=$origin, origNetwork=$origNetwork, sourceDl=$sourceDl, speed=$speed, srcIds=$srcIds, srcTs=$srcTs, srcTyps=$srcTyps, tags=$tags, transactionId=$transactionId, type=$type, width=$width, additionalProperties=$additionalProperties}"
}

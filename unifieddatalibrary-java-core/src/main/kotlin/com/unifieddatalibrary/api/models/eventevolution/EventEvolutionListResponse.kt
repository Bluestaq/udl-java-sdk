// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.eventevolution

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
 * Event Evolution is a unique service supporting the association of UDL records of various data
 * types to a common event or activity. The associations may be a one time summary, aggregating
 * sources of a past event, or of an ongoing activity that evolves over a period of time.
 */
class EventEvolutionListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val eventId: JsonField<String>,
    private val source: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val summary: JsonField<String>,
    private val id: JsonField<String>,
    private val agjson: JsonField<String>,
    private val andims: JsonField<Int>,
    private val asrid: JsonField<Int>,
    private val atext: JsonField<String>,
    private val atype: JsonField<String>,
    private val category: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val dataDescription: JsonField<String>,
    private val endTime: JsonField<OffsetDateTime>,
    private val geoAdminLevel1: JsonField<String>,
    private val geoAdminLevel2: JsonField<String>,
    private val geoAdminLevel3: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val redact: JsonField<Boolean>,
    private val srcIds: JsonField<List<String>>,
    private val srcTyps: JsonField<List<String>>,
    private val status: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val url: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("eventId") @ExcludeMissing eventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agjson") @ExcludeMissing agjson: JsonField<String> = JsonMissing.of(),
        @JsonProperty("andims") @ExcludeMissing andims: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("asrid") @ExcludeMissing asrid: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("atext") @ExcludeMissing atext: JsonField<String> = JsonMissing.of(),
        @JsonProperty("atype") @ExcludeMissing atype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<String> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataDescription")
        @ExcludeMissing
        dataDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endTime")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("geoAdminLevel1")
        @ExcludeMissing
        geoAdminLevel1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("geoAdminLevel2")
        @ExcludeMissing
        geoAdminLevel2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("geoAdminLevel3")
        @ExcludeMissing
        geoAdminLevel3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("redact") @ExcludeMissing redact: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("srcIds") @ExcludeMissing srcIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("srcTyps")
        @ExcludeMissing
        srcTyps: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        eventId,
        source,
        startTime,
        summary,
        id,
        agjson,
        andims,
        asrid,
        atext,
        atype,
        category,
        countryCode,
        createdAt,
        createdBy,
        dataDescription,
        endTime,
        geoAdminLevel1,
        geoAdminLevel2,
        geoAdminLevel3,
        origin,
        origNetwork,
        redact,
        srcIds,
        srcTyps,
        status,
        tags,
        url,
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
     * User-provided unique identifier of this activity or event. This ID should remain the same on
     * subsequent updates in order to associate all records pertaining to the activity or event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventId(): String = eventId.getRequired("eventId")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The actual or estimated start time of the activity or event, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

    /**
     * Summary or description of the activity or event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun summary(): String = summary.getRequired("summary")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

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
     * The activity or event type associated with this record (e.g. BREAKUP, DIRECT FIRE, IED,
     * LAUNCH, PROTEST, etc.). For Significant Activities, recommended but not constrained to,
     * CAMEO.Manual.1.1b3 Chapter 6. Note that the evolution of an event may incorporate records of
     * various types, for example, a LAUNCH event may evolve into a BREAKUP event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun category(): Optional<String> = category.getOptional("category")

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
     * Optional description of the relationship between the records provided in the srcTyps/srcIds
     * and the activity or event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dataDescription(): Optional<String> = dataDescription.getOptional("dataDescription")

    /**
     * The actual or estimated start time of the activity or event, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("endTime")

    /**
     * Administrative boundaries of the first sub-national level. Level 1 is simply the largest
     * demarcation under whatever demarcation criteria has been determined by the governing body.
     * For example this may be the state/province in which a terrestrial event takes place, or with
     * which the event is attributed for non-localized or non-terrestrial activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoAdminLevel1(): Optional<String> = geoAdminLevel1.getOptional("geoAdminLevel1")

    /**
     * Administrative boundaries of the second sub-national level. Level 2 is simply the second
     * largest demarcation under whatever demarcation criteria has been determined by the governing
     * body. For example this may be the city/district in which a terrestrial event takes place, or
     * with which the event is attributed for non-localized or non-terrestrial activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoAdminLevel2(): Optional<String> = geoAdminLevel2.getOptional("geoAdminLevel2")

    /**
     * Administrative boundaries of the third sub-national level. Level 3 is simply the third
     * largest demarcation under whatever demarcation criteria has been determined by the governing
     * body.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoAdminLevel3(): Optional<String> = geoAdminLevel3.getOptional("geoAdminLevel3")

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
     * Flag indicating that this record is for the purpose of redacting one or more previously
     * specified records from association with this activity or event. If this flag is set then all
     * records indicated in srcTyps/srcIds should be removed from event association.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun redact(): Optional<Boolean> = redact.getOptional("redact")

    /**
     * Array of UUIDs of the UDL data records that are related to the determination of this activity
     * or event. See the associated 'srcTyps' array for the specific types of data, positionally
     * corresponding to the UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in
     * size. See the corresponding srcTyps array element for the data type of the UUID and use the
     * appropriate API operation to retrieve that object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun srcIds(): Optional<List<String>> = srcIds.getOptional("srcIds")

    /**
     * Array of UDL record types (AIS, CONJUNCTION, DOA, ELSET, EO, ESID, GROUNDIMAGE, POI,
     * MANEUVER, MTI, NOTIFICATION, RADAR, RF, SIGACT, SKYIMAGE, SV, TRACK) that are related to this
     * activity or event. See the associated 'srcIds' array for the record UUIDs, positionally
     * corresponding to the record types in this array. The 'srcTyps' and 'srcIds' arrays must match
     * in size.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun srcTyps(): Optional<List<String>> = srcTyps.getOptional("srcTyps")

    /**
     * The status of this activity or event. (ACTIVE, CONCLUDED, UNKNOWN).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

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
     * List of URLs to before/after images of this point of interest entity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun url(): Optional<List<String>> = url.getOptional("url")

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
     * Returns the raw JSON value of [eventId].
     *
     * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventId") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startTime")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

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
     * Returns the raw JSON value of [asrid].
     *
     * Unlike [asrid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("asrid") @ExcludeMissing fun _asrid(): JsonField<Int> = asrid

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
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

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
     * Returns the raw JSON value of [dataDescription].
     *
     * Unlike [dataDescription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataDescription")
    @ExcludeMissing
    fun _dataDescription(): JsonField<String> = dataDescription

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [geoAdminLevel1].
     *
     * Unlike [geoAdminLevel1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoAdminLevel1")
    @ExcludeMissing
    fun _geoAdminLevel1(): JsonField<String> = geoAdminLevel1

    /**
     * Returns the raw JSON value of [geoAdminLevel2].
     *
     * Unlike [geoAdminLevel2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoAdminLevel2")
    @ExcludeMissing
    fun _geoAdminLevel2(): JsonField<String> = geoAdminLevel2

    /**
     * Returns the raw JSON value of [geoAdminLevel3].
     *
     * Unlike [geoAdminLevel3], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoAdminLevel3")
    @ExcludeMissing
    fun _geoAdminLevel3(): JsonField<String> = geoAdminLevel3

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
     * Returns the raw JSON value of [redact].
     *
     * Unlike [redact], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redact") @ExcludeMissing fun _redact(): JsonField<Boolean> = redact

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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<List<String>> = url

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
         * Returns a mutable builder for constructing an instance of [EventEvolutionListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .eventId()
         * .source()
         * .startTime()
         * .summary()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventEvolutionListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var eventId: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var summary: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var agjson: JsonField<String> = JsonMissing.of()
        private var andims: JsonField<Int> = JsonMissing.of()
        private var asrid: JsonField<Int> = JsonMissing.of()
        private var atext: JsonField<String> = JsonMissing.of()
        private var atype: JsonField<String> = JsonMissing.of()
        private var category: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dataDescription: JsonField<String> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var geoAdminLevel1: JsonField<String> = JsonMissing.of()
        private var geoAdminLevel2: JsonField<String> = JsonMissing.of()
        private var geoAdminLevel3: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var redact: JsonField<Boolean> = JsonMissing.of()
        private var srcIds: JsonField<MutableList<String>>? = null
        private var srcTyps: JsonField<MutableList<String>>? = null
        private var status: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var url: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventEvolutionListResponse: EventEvolutionListResponse) = apply {
            classificationMarking = eventEvolutionListResponse.classificationMarking
            dataMode = eventEvolutionListResponse.dataMode
            eventId = eventEvolutionListResponse.eventId
            source = eventEvolutionListResponse.source
            startTime = eventEvolutionListResponse.startTime
            summary = eventEvolutionListResponse.summary
            id = eventEvolutionListResponse.id
            agjson = eventEvolutionListResponse.agjson
            andims = eventEvolutionListResponse.andims
            asrid = eventEvolutionListResponse.asrid
            atext = eventEvolutionListResponse.atext
            atype = eventEvolutionListResponse.atype
            category = eventEvolutionListResponse.category
            countryCode = eventEvolutionListResponse.countryCode
            createdAt = eventEvolutionListResponse.createdAt
            createdBy = eventEvolutionListResponse.createdBy
            dataDescription = eventEvolutionListResponse.dataDescription
            endTime = eventEvolutionListResponse.endTime
            geoAdminLevel1 = eventEvolutionListResponse.geoAdminLevel1
            geoAdminLevel2 = eventEvolutionListResponse.geoAdminLevel2
            geoAdminLevel3 = eventEvolutionListResponse.geoAdminLevel3
            origin = eventEvolutionListResponse.origin
            origNetwork = eventEvolutionListResponse.origNetwork
            redact = eventEvolutionListResponse.redact
            srcIds = eventEvolutionListResponse.srcIds.map { it.toMutableList() }
            srcTyps = eventEvolutionListResponse.srcTyps.map { it.toMutableList() }
            status = eventEvolutionListResponse.status
            tags = eventEvolutionListResponse.tags.map { it.toMutableList() }
            url = eventEvolutionListResponse.url.map { it.toMutableList() }
            additionalProperties = eventEvolutionListResponse.additionalProperties.toMutableMap()
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
         * User-provided unique identifier of this activity or event. This ID should remain the same
         * on subsequent updates in order to associate all records pertaining to the activity or
         * event.
         */
        fun eventId(eventId: String) = eventId(JsonField.of(eventId))

        /**
         * Sets [Builder.eventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** The actual or estimated start time of the activity or event, in ISO 8601 UTC format. */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        /** Summary or description of the activity or event. */
        fun summary(summary: String) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<String>) = apply { this.summary = summary }

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
         * The activity or event type associated with this record (e.g. BREAKUP, DIRECT FIRE, IED,
         * LAUNCH, PROTEST, etc.). For Significant Activities, recommended but not constrained to,
         * CAMEO.Manual.1.1b3 Chapter 6. Note that the evolution of an event may incorporate records
         * of various types, for example, a LAUNCH event may evolve into a BREAKUP event.
         */
        fun category(category: String) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { this.category = category }

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
         * Optional description of the relationship between the records provided in the
         * srcTyps/srcIds and the activity or event.
         */
        fun dataDescription(dataDescription: String) =
            dataDescription(JsonField.of(dataDescription))

        /**
         * Sets [Builder.dataDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataDescription(dataDescription: JsonField<String>) = apply {
            this.dataDescription = dataDescription
        }

        /** The actual or estimated start time of the activity or event, in ISO 8601 UTC format. */
        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        /**
         * Administrative boundaries of the first sub-national level. Level 1 is simply the largest
         * demarcation under whatever demarcation criteria has been determined by the governing
         * body. For example this may be the state/province in which a terrestrial event takes
         * place, or with which the event is attributed for non-localized or non-terrestrial
         * activity.
         */
        fun geoAdminLevel1(geoAdminLevel1: String) = geoAdminLevel1(JsonField.of(geoAdminLevel1))

        /**
         * Sets [Builder.geoAdminLevel1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoAdminLevel1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geoAdminLevel1(geoAdminLevel1: JsonField<String>) = apply {
            this.geoAdminLevel1 = geoAdminLevel1
        }

        /**
         * Administrative boundaries of the second sub-national level. Level 2 is simply the second
         * largest demarcation under whatever demarcation criteria has been determined by the
         * governing body. For example this may be the city/district in which a terrestrial event
         * takes place, or with which the event is attributed for non-localized or non-terrestrial
         * activity.
         */
        fun geoAdminLevel2(geoAdminLevel2: String) = geoAdminLevel2(JsonField.of(geoAdminLevel2))

        /**
         * Sets [Builder.geoAdminLevel2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoAdminLevel2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geoAdminLevel2(geoAdminLevel2: JsonField<String>) = apply {
            this.geoAdminLevel2 = geoAdminLevel2
        }

        /**
         * Administrative boundaries of the third sub-national level. Level 3 is simply the third
         * largest demarcation under whatever demarcation criteria has been determined by the
         * governing body.
         */
        fun geoAdminLevel3(geoAdminLevel3: String) = geoAdminLevel3(JsonField.of(geoAdminLevel3))

        /**
         * Sets [Builder.geoAdminLevel3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoAdminLevel3] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geoAdminLevel3(geoAdminLevel3: JsonField<String>) = apply {
            this.geoAdminLevel3 = geoAdminLevel3
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
         * Flag indicating that this record is for the purpose of redacting one or more previously
         * specified records from association with this activity or event. If this flag is set then
         * all records indicated in srcTyps/srcIds should be removed from event association.
         */
        fun redact(redact: Boolean) = redact(JsonField.of(redact))

        /**
         * Sets [Builder.redact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redact] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun redact(redact: JsonField<Boolean>) = apply { this.redact = redact }

        /**
         * Array of UUIDs of the UDL data records that are related to the determination of this
         * activity or event. See the associated 'srcTyps' array for the specific types of data,
         * positionally corresponding to the UUIDs in this array. The 'srcTyps' and 'srcIds' arrays
         * must match in size. See the corresponding srcTyps array element for the data type of the
         * UUID and use the appropriate API operation to retrieve that object.
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
         * this activity or event. See the associated 'srcIds' array for the record UUIDs,
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

        /** The status of this activity or event. (ACTIVE, CONCLUDED, UNKNOWN). */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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

        /** List of URLs to before/after images of this point of interest entity. */
        fun url(url: List<String>) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun url(url: JsonField<List<String>>) = apply { this.url = url.map { it.toMutableList() } }

        /**
         * Adds a single [String] to [Builder.url].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUrl(url: String) = apply {
            this.url =
                (this.url ?: JsonField.of(mutableListOf())).also { checkKnown("url", it).add(url) }
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
         * Returns an immutable instance of [EventEvolutionListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .eventId()
         * .source()
         * .startTime()
         * .summary()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventEvolutionListResponse =
            EventEvolutionListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("eventId", eventId),
                checkRequired("source", source),
                checkRequired("startTime", startTime),
                checkRequired("summary", summary),
                id,
                agjson,
                andims,
                asrid,
                atext,
                atype,
                category,
                countryCode,
                createdAt,
                createdBy,
                dataDescription,
                endTime,
                geoAdminLevel1,
                geoAdminLevel2,
                geoAdminLevel3,
                origin,
                origNetwork,
                redact,
                (srcIds ?: JsonMissing.of()).map { it.toImmutable() },
                (srcTyps ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                (url ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EventEvolutionListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        eventId()
        source()
        startTime()
        summary()
        id()
        agjson()
        andims()
        asrid()
        atext()
        atype()
        category()
        countryCode()
        createdAt()
        createdBy()
        dataDescription()
        endTime()
        geoAdminLevel1()
        geoAdminLevel2()
        geoAdminLevel3()
        origin()
        origNetwork()
        redact()
        srcIds()
        srcTyps()
        status()
        tags()
        url()
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
            (if (eventId.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (summary.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (agjson.asKnown().isPresent) 1 else 0) +
            (if (andims.asKnown().isPresent) 1 else 0) +
            (if (asrid.asKnown().isPresent) 1 else 0) +
            (if (atext.asKnown().isPresent) 1 else 0) +
            (if (atype.asKnown().isPresent) 1 else 0) +
            (if (category.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dataDescription.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (geoAdminLevel1.asKnown().isPresent) 1 else 0) +
            (if (geoAdminLevel2.asKnown().isPresent) 1 else 0) +
            (if (geoAdminLevel3.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (redact.asKnown().isPresent) 1 else 0) +
            (srcIds.asKnown().getOrNull()?.size ?: 0) +
            (srcTyps.asKnown().getOrNull()?.size ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (url.asKnown().getOrNull()?.size ?: 0)

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

        return /* spotless:off */ other is EventEvolutionListResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && eventId == other.eventId && source == other.source && startTime == other.startTime && summary == other.summary && id == other.id && agjson == other.agjson && andims == other.andims && asrid == other.asrid && atext == other.atext && atype == other.atype && category == other.category && countryCode == other.countryCode && createdAt == other.createdAt && createdBy == other.createdBy && dataDescription == other.dataDescription && endTime == other.endTime && geoAdminLevel1 == other.geoAdminLevel1 && geoAdminLevel2 == other.geoAdminLevel2 && geoAdminLevel3 == other.geoAdminLevel3 && origin == other.origin && origNetwork == other.origNetwork && redact == other.redact && srcIds == other.srcIds && srcTyps == other.srcTyps && status == other.status && tags == other.tags && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, eventId, source, startTime, summary, id, agjson, andims, asrid, atext, atype, category, countryCode, createdAt, createdBy, dataDescription, endTime, geoAdminLevel1, geoAdminLevel2, geoAdminLevel3, origin, origNetwork, redact, srcIds, srcTyps, status, tags, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventEvolutionListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, eventId=$eventId, source=$source, startTime=$startTime, summary=$summary, id=$id, agjson=$agjson, andims=$andims, asrid=$asrid, atext=$atext, atype=$atype, category=$category, countryCode=$countryCode, createdAt=$createdAt, createdBy=$createdBy, dataDescription=$dataDescription, endTime=$endTime, geoAdminLevel1=$geoAdminLevel1, geoAdminLevel2=$geoAdminLevel2, geoAdminLevel3=$geoAdminLevel3, origin=$origin, origNetwork=$origNetwork, redact=$redact, srcIds=$srcIds, srcTyps=$srcTyps, status=$status, tags=$tags, url=$url, additionalProperties=$additionalProperties}"
}

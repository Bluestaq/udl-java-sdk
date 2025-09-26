// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sigact.history

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
import com.unifieddatalibrary.api.models.RelatedDocumentFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Provides information on the dates, actors, locations, fatalities, and types of all reported
 * political violence and protest events across the world.
 */
class HistoryListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val reportDate: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val accuracy: JsonField<Int>,
    private val actors: JsonField<List<String>>,
    private val agjson: JsonField<String>,
    private val andims: JsonField<Long>,
    private val area: JsonField<String>,
    private val asrid: JsonField<Int>,
    private val atext: JsonField<String>,
    private val atype: JsonField<String>,
    private val avgTone: JsonField<Double>,
    private val cameoBaseCode: JsonField<String>,
    private val cameoCode: JsonField<String>,
    private val cameoRootCode: JsonField<String>,
    private val checksumValue: JsonField<String>,
    private val city: JsonField<String>,
    private val civAbd: JsonField<Int>,
    private val civDet: JsonField<Int>,
    private val civKia: JsonField<Int>,
    private val civWound: JsonField<Int>,
    private val clarity: JsonField<Int>,
    private val coalAbd: JsonField<Int>,
    private val coalDet: JsonField<Int>,
    private val coalKia: JsonField<Int>,
    private val coalWound: JsonField<Int>,
    private val complexAttack: JsonField<Boolean>,
    private val confidence: JsonField<Int>,
    private val countryCode: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val district: JsonField<String>,
    private val documentFilename: JsonField<String>,
    private val documentSource: JsonField<String>,
    private val enemyAbd: JsonField<Int>,
    private val enemyDet: JsonField<Int>,
    private val enemyKia: JsonField<Int>,
    private val eventDescription: JsonField<String>,
    private val eventEnd: JsonField<OffsetDateTime>,
    private val eventStart: JsonField<OffsetDateTime>,
    private val eventType: JsonField<String>,
    private val filesize: JsonField<Long>,
    private val friendlyAbd: JsonField<Int>,
    private val friendlyDet: JsonField<Int>,
    private val friendlyKia: JsonField<Int>,
    private val friendlyWound: JsonField<Int>,
    private val goldstein: JsonField<Double>,
    private val hasAttachment: JsonField<Boolean>,
    private val hostNatAbd: JsonField<Int>,
    private val hostNatDet: JsonField<Int>,
    private val hostNatKia: JsonField<Int>,
    private val hostNatWound: JsonField<Int>,
    private val idNumber: JsonField<String>,
    private val lat: JsonField<Double>,
    private val lon: JsonField<Double>,
    private val milgrid: JsonField<String>,
    private val notes: JsonField<String>,
    private val numArticles: JsonField<Int>,
    private val numMentions: JsonField<Int>,
    private val numSources: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val province: JsonField<String>,
    private val relatedDocs: JsonField<List<RelatedDocumentFull>>,
    private val repUnit: JsonField<String>,
    private val repUnitActivity: JsonField<String>,
    private val repUnitType: JsonField<String>,
    private val sideAAbd: JsonField<Int>,
    private val sideADet: JsonField<Int>,
    private val sideAkia: JsonField<Int>,
    private val sideAWound: JsonField<Int>,
    private val sideBAbd: JsonField<Int>,
    private val sideBDet: JsonField<Int>,
    private val sideBkia: JsonField<Int>,
    private val sideBWound: JsonField<Int>,
    private val sourceLanguage: JsonField<String>,
    private val sourceUrl: JsonField<String>,
    private val summary: JsonField<String>,
    private val target: JsonField<String>,
    private val theater: JsonField<String>,
    private val typeOfAttack: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("reportDate")
        @ExcludeMissing
        reportDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accuracy") @ExcludeMissing accuracy: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("actors") @ExcludeMissing actors: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("agjson") @ExcludeMissing agjson: JsonField<String> = JsonMissing.of(),
        @JsonProperty("andims") @ExcludeMissing andims: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("area") @ExcludeMissing area: JsonField<String> = JsonMissing.of(),
        @JsonProperty("asrid") @ExcludeMissing asrid: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("atext") @ExcludeMissing atext: JsonField<String> = JsonMissing.of(),
        @JsonProperty("atype") @ExcludeMissing atype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("avgTone") @ExcludeMissing avgTone: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("cameoBaseCode")
        @ExcludeMissing
        cameoBaseCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cameoCode") @ExcludeMissing cameoCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cameoRootCode")
        @ExcludeMissing
        cameoRootCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("checksumValue")
        @ExcludeMissing
        checksumValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("civAbd") @ExcludeMissing civAbd: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("civDet") @ExcludeMissing civDet: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("civKIA") @ExcludeMissing civKia: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("civWound") @ExcludeMissing civWound: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("clarity") @ExcludeMissing clarity: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("coalAbd") @ExcludeMissing coalAbd: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("coalDet") @ExcludeMissing coalDet: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("coalKIA") @ExcludeMissing coalKia: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("coalWound") @ExcludeMissing coalWound: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("complexAttack")
        @ExcludeMissing
        complexAttack: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("confidence") @ExcludeMissing confidence: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("district") @ExcludeMissing district: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documentFilename")
        @ExcludeMissing
        documentFilename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documentSource")
        @ExcludeMissing
        documentSource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enemyAbd") @ExcludeMissing enemyAbd: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("enemyDet") @ExcludeMissing enemyDet: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("enemyKIA") @ExcludeMissing enemyKia: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("eventDescription")
        @ExcludeMissing
        eventDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventEnd")
        @ExcludeMissing
        eventEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("eventStart")
        @ExcludeMissing
        eventStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("eventType") @ExcludeMissing eventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filesize") @ExcludeMissing filesize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("friendlyAbd") @ExcludeMissing friendlyAbd: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("friendlyDet") @ExcludeMissing friendlyDet: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("friendlyKIA") @ExcludeMissing friendlyKia: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("friendlyWound")
        @ExcludeMissing
        friendlyWound: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("goldstein") @ExcludeMissing goldstein: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hasAttachment")
        @ExcludeMissing
        hasAttachment: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hostNatAbd") @ExcludeMissing hostNatAbd: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hostNatDet") @ExcludeMissing hostNatDet: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hostNatKIA") @ExcludeMissing hostNatKia: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hostNatWound")
        @ExcludeMissing
        hostNatWound: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("idNumber") @ExcludeMissing idNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("milgrid") @ExcludeMissing milgrid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numArticles") @ExcludeMissing numArticles: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numMentions") @ExcludeMissing numMentions: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numSources") @ExcludeMissing numSources: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("province") @ExcludeMissing province: JsonField<String> = JsonMissing.of(),
        @JsonProperty("relatedDocs")
        @ExcludeMissing
        relatedDocs: JsonField<List<RelatedDocumentFull>> = JsonMissing.of(),
        @JsonProperty("repUnit") @ExcludeMissing repUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("repUnitActivity")
        @ExcludeMissing
        repUnitActivity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("repUnitType")
        @ExcludeMissing
        repUnitType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sideAAbd") @ExcludeMissing sideAAbd: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sideADet") @ExcludeMissing sideADet: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sideAKIA") @ExcludeMissing sideAkia: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sideAWound") @ExcludeMissing sideAWound: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sideBAbd") @ExcludeMissing sideBAbd: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sideBDet") @ExcludeMissing sideBDet: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sideBKIA") @ExcludeMissing sideBkia: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sideBWound") @ExcludeMissing sideBWound: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sourceLanguage")
        @ExcludeMissing
        sourceLanguage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceUrl") @ExcludeMissing sourceUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target") @ExcludeMissing target: JsonField<String> = JsonMissing.of(),
        @JsonProperty("theater") @ExcludeMissing theater: JsonField<String> = JsonMissing.of(),
        @JsonProperty("typeOfAttack")
        @ExcludeMissing
        typeOfAttack: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        reportDate,
        source,
        id,
        accuracy,
        actors,
        agjson,
        andims,
        area,
        asrid,
        atext,
        atype,
        avgTone,
        cameoBaseCode,
        cameoCode,
        cameoRootCode,
        checksumValue,
        city,
        civAbd,
        civDet,
        civKia,
        civWound,
        clarity,
        coalAbd,
        coalDet,
        coalKia,
        coalWound,
        complexAttack,
        confidence,
        countryCode,
        createdAt,
        createdBy,
        district,
        documentFilename,
        documentSource,
        enemyAbd,
        enemyDet,
        enemyKia,
        eventDescription,
        eventEnd,
        eventStart,
        eventType,
        filesize,
        friendlyAbd,
        friendlyDet,
        friendlyKia,
        friendlyWound,
        goldstein,
        hasAttachment,
        hostNatAbd,
        hostNatDet,
        hostNatKia,
        hostNatWound,
        idNumber,
        lat,
        lon,
        milgrid,
        notes,
        numArticles,
        numMentions,
        numSources,
        origin,
        origNetwork,
        province,
        relatedDocs,
        repUnit,
        repUnitActivity,
        repUnitType,
        sideAAbd,
        sideADet,
        sideAkia,
        sideAWound,
        sideBAbd,
        sideBDet,
        sideBkia,
        sideBWound,
        sourceLanguage,
        sourceUrl,
        summary,
        target,
        theater,
        typeOfAttack,
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
     * Date of the report or filing.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportDate(): OffsetDateTime = reportDate.getRequired("reportDate")

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
     * Estimate of the accuracy that this event occurred as described/reported.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun accuracy(): Optional<Int> = accuracy.getOptional("accuracy")

    /**
     * A list of one or more actors involved in the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actors(): Optional<List<String>> = actors.getOptional("actors")

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
    fun andims(): Optional<Long> = andims.getOptional("andims")

    /**
     * Optional geographical region or polygon (lat/lon pairs) of the area surrounding the point of
     * interest as projected on the ground.
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
     * This is the average tone of all documents containing one or more mentions of this event
     * during the 15 minute update in which it was first seen. The score ranges from -100 (extremely
     * negative) to +100 (extremely positive). Common values range between -10 and +10, with 0
     * indicating neutral.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avgTone(): Optional<Double> = avgTone.getOptional("avgTone")

    /**
     * CAMEO event codes are defined in a three-level taxonomy. For events at level three in the
     * taxonomy, this yields its level two leaf root node. For example, code 0251 (Appeal for easing
     * of administrative sanctions) would yield an EventBaseCode of 025 (Appeal to yield). This
     * makes it possible to aggregate events at various resolutions of specificity. For events at
     * levels two or one, this field will be set to EventCode.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cameoBaseCode(): Optional<String> = cameoBaseCode.getOptional("cameoBaseCode")

    /**
     * This is the raw CAMEO action code describing the action that Actor1 performed upon Actor2.
     * Additional information about Cameo Codes can be obtained from the GDELT project documentation
     * here: https://www.gdeltproject.org/data.html#documentation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cameoCode(): Optional<String> = cameoCode.getOptional("cameoCode")

    /**
     * Similar to EventBaseCode, this defines the root-level category the event code falls under.
     * For example, code 0251 (Appeal for easing of administrative sanctions) has a root code of 02
     * (Appeal). This makes it possible to aggregate events at various resolutions of specificity.
     * For events at levels two or one, this field will be set to EventCode.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cameoRootCode(): Optional<String> = cameoRootCode.getOptional("cameoRootCode")

    /**
     * MD5 value of the file. The ingest/create operation will automatically generate the value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun checksumValue(): Optional<String> = checksumValue.getOptional("checksumValue")

    /**
     * The city in or near which this event occurred.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun city(): Optional<String> = city.getOptional("city")

    /**
     * Number of civilians abducted in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun civAbd(): Optional<Int> = civAbd.getOptional("civAbd")

    /**
     * Number of civilians detained in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun civDet(): Optional<Int> = civDet.getOptional("civDet")

    /**
     * Number of civilians killed in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun civKia(): Optional<Int> = civKia.getOptional("civKIA")

    /**
     * Number of civilians wounded in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun civWound(): Optional<Int> = civWound.getOptional("civWound")

    /**
     * 1 (high) for events where the reporting allows the coder to identify the event in full. That
     * is, events where the individual happening is described by the original source in a
     * sufficiently detailed way as to identify individual incidents, i.e. separate activities of
     * fighting in a single location:
     *
     * 2 (lower) for events where an aggregation of information was already made by the source
     * material that is impossible to undo in the coding process. Such events are described by the
     * original source only as aggregates (totals) of multiple separate activities of fighting
     * spanning over a longer period than a single, clearly defined day.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun clarity(): Optional<Int> = clarity.getOptional("clarity")

    /**
     * Number of coalition members abducted in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coalAbd(): Optional<Int> = coalAbd.getOptional("coalAbd")

    /**
     * Number of coalition members detained in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coalDet(): Optional<Int> = coalDet.getOptional("coalDet")

    /**
     * Number of coalition members killed in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coalKia(): Optional<Int> = coalKia.getOptional("coalKIA")

    /**
     * Number of coalition members wounded in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coalWound(): Optional<Int> = coalWound.getOptional("coalWound")

    /**
     * Flag indicating that this attack was of a complex or coordinated nature.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun complexAttack(): Optional<Boolean> = complexAttack.getOptional("complexAttack")

    /**
     * Estimate of the confidence that this event occurred.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun confidence(): Optional<Int> = confidence.getOptional("confidence")

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
     * Time the row was created in the database, auto-populated by the system, example =
     * 2018-01-01T16:00:00.123Z.
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
     * The district in which this event occurred.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun district(): Optional<String> = district.getOptional("district")

    /**
     * The filename of the document or report.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun documentFilename(): Optional<String> = documentFilename.getOptional("documentFilename")

    /**
     * The source of the document or report.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun documentSource(): Optional<String> = documentSource.getOptional("documentSource")

    /**
     * Number of enemy combatants abducted in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun enemyAbd(): Optional<Int> = enemyAbd.getOptional("enemyAbd")

    /**
     * Number of enemy combatants detained in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun enemyDet(): Optional<Int> = enemyDet.getOptional("enemyDet")

    /**
     * Number of enemy combatants killed in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun enemyKia(): Optional<Int> = enemyKia.getOptional("enemyKIA")

    /**
     * A description of the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eventDescription(): Optional<String> = eventDescription.getOptional("eventDescription")

    /**
     * The approximate end time of the event, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eventEnd(): Optional<OffsetDateTime> = eventEnd.getOptional("eventEnd")

    /**
     * The approximate start time of the event, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eventStart(): Optional<OffsetDateTime> = eventStart.getOptional("eventStart")

    /**
     * The type of event (e.g. Military, Natural, Political, Social, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eventType(): Optional<String> = eventType.getOptional("eventType")

    /**
     * Size of the associated text file. Units in bytes. If filesize is provided without an
     * associated file, it defaults to 0.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun filesize(): Optional<Long> = filesize.getOptional("filesize")

    /**
     * Number of friendlies abducted in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun friendlyAbd(): Optional<Int> = friendlyAbd.getOptional("friendlyAbd")

    /**
     * Number of friendlies in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun friendlyDet(): Optional<Int> = friendlyDet.getOptional("friendlyDet")

    /**
     * Number of friendlies killed in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun friendlyKia(): Optional<Int> = friendlyKia.getOptional("friendlyKIA")

    /**
     * Number of friendlies wounded in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun friendlyWound(): Optional<Int> = friendlyWound.getOptional("friendlyWound")

    /**
     * Each CAMEO event code is assigned a numeric score from -10 to +10, capturing the theoretical
     * potential impact that type of event will have on the stability of a country. This is known as
     * the Goldstein Scale. NOTE: this score is based on the type of event, not the specifics of the
     * actual event record being recorded thus two riots, one with 10 people and one with 10,000,
     * will both receive the same Goldstein score. This can be aggregated to various levels of time
     * resolution to yield an approximation of the stability of a location over time.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun goldstein(): Optional<Double> = goldstein.getOptional("goldstein")

    /**
     * Flag indicating this SigAct record has an associated txt file stored in the UDL. Retrieve the
     * txt file by using the GET/udl/sigact/getFile/{id} where id is the same as the SigAct record
     * id. The maximum file size for this service is 10,000,000 bytes (10MB). Files exceeding the
     * maximum size will be rejected.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hasAttachment(): Optional<Boolean> = hasAttachment.getOptional("hasAttachment")

    /**
     * Number of Host Nation members abducted in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hostNatAbd(): Optional<Int> = hostNatAbd.getOptional("hostNatAbd")

    /**
     * Number of Host Nation members detained in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hostNatDet(): Optional<Int> = hostNatDet.getOptional("hostNatDet")

    /**
     * Number of Host Nation members killed in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hostNatKia(): Optional<Int> = hostNatKia.getOptional("hostNatKIA")

    /**
     * Number of Host Nation members wounded in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hostNatWound(): Optional<Int> = hostNatWound.getOptional("hostNatWound")

    /**
     * Unique identifier assigned to each event record that uniquely identifies it in the master
     * dataset. This ID is provided for convenience of mapping to external systems.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idNumber(): Optional<String> = idNumber.getOptional("idNumber")

    /**
     * WGS-84 centroid latitude of the event location, in degrees. -90 to 90 degrees (negative
     * values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lat(): Optional<Double> = lat.getOptional("lat")

    /**
     * WGS-84 centroid longitude of the event location, in degrees. -180 to 180 degrees (negative
     * values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lon(): Optional<Double> = lon.getOptional("lon")

    /**
     * The Military Grid Reference System is the geocoordinate standard used by NATO militaries for
     * locating points on Earth. The MGRS is derived from the Universal Transverse Mercator (UTM)
     * grid system and the Universal Polar Stereographic (UPS) grid system, but uses a different
     * labeling convention. The MGRS is used as geocode for the entire Earth. Example of an milgrid
     * coordinate, or grid reference, would be 4QFJ12345678, which consists of three parts:
     *
     * &nbsp;&nbsp;4Q (grid zone designator, GZD)
     *
     * &nbsp;&nbsp;FJ (the 100,000-meter square identifier)
     *
     * &nbsp;&nbsp;12345678 (numerical location; easting is 1234 and northing is 5678, in this case
     * specifying a location with 10 m resolution).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun milgrid(): Optional<String> = milgrid.getOptional("milgrid")

    /**
     * Notes related to the documents or event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * This is the total number of source documents containing one or more mentions of this event
     * during the 15 minute update in which it was first seen. This can be used as a method of
     * assessing the importance of an event: the more discussion of that event, the more likely it
     * is to be significant.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numArticles(): Optional<Int> = numArticles.getOptional("numArticles")

    /**
     * This is the total number of mentions of this event across all source documents during the 15
     * minute update in which it was first seen. Multiple references to an event within a single
     * document also contribute to this count. This can be used as a method of assessing the
     * importance of an event: the more discussion of that event, the more likely it is to be
     * significant.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numMentions(): Optional<Int> = numMentions.getOptional("numMentions")

    /**
     * This is the total number of information sources containing one or more mentions of this event
     * during the 15 minute update in which it was first seen. This can be used as a method of
     * assessing the importance of an event: the more discussion of that event, the more likely it
     * is to be significant.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numSources(): Optional<Int> = numSources.getOptional("numSources")

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
     * The province in which this event occurred.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun province(): Optional<String> = province.getOptional("province")

    /**
     * Related document ids.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun relatedDocs(): Optional<List<RelatedDocumentFull>> = relatedDocs.getOptional("relatedDocs")

    /**
     * The reporting unit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun repUnit(): Optional<String> = repUnit.getOptional("repUnit")

    /**
     * The activity the unit was engaged in.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun repUnitActivity(): Optional<String> = repUnitActivity.getOptional("repUnitActivity")

    /**
     * The reporting unit type.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun repUnitType(): Optional<String> = repUnitType.getOptional("repUnitType")

    /**
     * Number of side A members abducted in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sideAAbd(): Optional<Int> = sideAAbd.getOptional("sideAAbd")

    /**
     * Number of side A members detained in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sideADet(): Optional<Int> = sideADet.getOptional("sideADet")

    /**
     * Number of side A members killed in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sideAkia(): Optional<Int> = sideAkia.getOptional("sideAKIA")

    /**
     * Number of side A members wounded in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sideAWound(): Optional<Int> = sideAWound.getOptional("sideAWound")

    /**
     * Number of side B members abducted in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sideBAbd(): Optional<Int> = sideBAbd.getOptional("sideBAbd")

    /**
     * Number of side B members detained in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sideBDet(): Optional<Int> = sideBDet.getOptional("sideBDet")

    /**
     * Number of side B members killed in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sideBkia(): Optional<Int> = sideBkia.getOptional("sideBKIA")

    /**
     * Number of side B members wounded in the activity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sideBWound(): Optional<Int> = sideBWound.getOptional("sideBWound")

    /**
     * The source language of the significant event using the ISO 639-3, 3 character code
     * definition.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceLanguage(): Optional<String> = sourceLanguage.getOptional("sourceLanguage")

    /**
     * This field records the URL or citation of the first news report it found this event in. In
     * most cases this is the first report it saw the article in, but due to the timing and flow of
     * news reports through the processing pipeline, this may not always be the very first report,
     * but is at least in the first few reports.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceUrl(): Optional<String> = sourceUrl.getOptional("sourceUrl")

    /**
     * A summary of the event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun summary(): Optional<String> = summary.getOptional("summary")

    /**
     * The name of the target. The target may be an individual, an entity, or a country/region.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun target(): Optional<String> = target.getOptional("target")

    /**
     * Area in which important military events occur or are progressing. A theater can include the
     * entirety of the airspace, land and sea area that is or that may potentially become involved
     * in war operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun theater(): Optional<String> = theater.getOptional("theater")

    /**
     * The mode of this attack or event (e.g. Direct Fire, IED Explosion, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun typeOfAttack(): Optional<String> = typeOfAttack.getOptional("typeOfAttack")

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
     * Returns the raw JSON value of [reportDate].
     *
     * Unlike [reportDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reportDate")
    @ExcludeMissing
    fun _reportDate(): JsonField<OffsetDateTime> = reportDate

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
     * Returns the raw JSON value of [accuracy].
     *
     * Unlike [accuracy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accuracy") @ExcludeMissing fun _accuracy(): JsonField<Int> = accuracy

    /**
     * Returns the raw JSON value of [actors].
     *
     * Unlike [actors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actors") @ExcludeMissing fun _actors(): JsonField<List<String>> = actors

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
    @JsonProperty("andims") @ExcludeMissing fun _andims(): JsonField<Long> = andims

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
     * Returns the raw JSON value of [avgTone].
     *
     * Unlike [avgTone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avgTone") @ExcludeMissing fun _avgTone(): JsonField<Double> = avgTone

    /**
     * Returns the raw JSON value of [cameoBaseCode].
     *
     * Unlike [cameoBaseCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cameoBaseCode")
    @ExcludeMissing
    fun _cameoBaseCode(): JsonField<String> = cameoBaseCode

    /**
     * Returns the raw JSON value of [cameoCode].
     *
     * Unlike [cameoCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cameoCode") @ExcludeMissing fun _cameoCode(): JsonField<String> = cameoCode

    /**
     * Returns the raw JSON value of [cameoRootCode].
     *
     * Unlike [cameoRootCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cameoRootCode")
    @ExcludeMissing
    fun _cameoRootCode(): JsonField<String> = cameoRootCode

    /**
     * Returns the raw JSON value of [checksumValue].
     *
     * Unlike [checksumValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checksumValue")
    @ExcludeMissing
    fun _checksumValue(): JsonField<String> = checksumValue

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [civAbd].
     *
     * Unlike [civAbd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("civAbd") @ExcludeMissing fun _civAbd(): JsonField<Int> = civAbd

    /**
     * Returns the raw JSON value of [civDet].
     *
     * Unlike [civDet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("civDet") @ExcludeMissing fun _civDet(): JsonField<Int> = civDet

    /**
     * Returns the raw JSON value of [civKia].
     *
     * Unlike [civKia], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("civKIA") @ExcludeMissing fun _civKia(): JsonField<Int> = civKia

    /**
     * Returns the raw JSON value of [civWound].
     *
     * Unlike [civWound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("civWound") @ExcludeMissing fun _civWound(): JsonField<Int> = civWound

    /**
     * Returns the raw JSON value of [clarity].
     *
     * Unlike [clarity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clarity") @ExcludeMissing fun _clarity(): JsonField<Int> = clarity

    /**
     * Returns the raw JSON value of [coalAbd].
     *
     * Unlike [coalAbd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coalAbd") @ExcludeMissing fun _coalAbd(): JsonField<Int> = coalAbd

    /**
     * Returns the raw JSON value of [coalDet].
     *
     * Unlike [coalDet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coalDet") @ExcludeMissing fun _coalDet(): JsonField<Int> = coalDet

    /**
     * Returns the raw JSON value of [coalKia].
     *
     * Unlike [coalKia], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coalKIA") @ExcludeMissing fun _coalKia(): JsonField<Int> = coalKia

    /**
     * Returns the raw JSON value of [coalWound].
     *
     * Unlike [coalWound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coalWound") @ExcludeMissing fun _coalWound(): JsonField<Int> = coalWound

    /**
     * Returns the raw JSON value of [complexAttack].
     *
     * Unlike [complexAttack], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("complexAttack")
    @ExcludeMissing
    fun _complexAttack(): JsonField<Boolean> = complexAttack

    /**
     * Returns the raw JSON value of [confidence].
     *
     * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confidence") @ExcludeMissing fun _confidence(): JsonField<Int> = confidence

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
     * Returns the raw JSON value of [district].
     *
     * Unlike [district], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("district") @ExcludeMissing fun _district(): JsonField<String> = district

    /**
     * Returns the raw JSON value of [documentFilename].
     *
     * Unlike [documentFilename], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("documentFilename")
    @ExcludeMissing
    fun _documentFilename(): JsonField<String> = documentFilename

    /**
     * Returns the raw JSON value of [documentSource].
     *
     * Unlike [documentSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documentSource")
    @ExcludeMissing
    fun _documentSource(): JsonField<String> = documentSource

    /**
     * Returns the raw JSON value of [enemyAbd].
     *
     * Unlike [enemyAbd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enemyAbd") @ExcludeMissing fun _enemyAbd(): JsonField<Int> = enemyAbd

    /**
     * Returns the raw JSON value of [enemyDet].
     *
     * Unlike [enemyDet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enemyDet") @ExcludeMissing fun _enemyDet(): JsonField<Int> = enemyDet

    /**
     * Returns the raw JSON value of [enemyKia].
     *
     * Unlike [enemyKia], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enemyKIA") @ExcludeMissing fun _enemyKia(): JsonField<Int> = enemyKia

    /**
     * Returns the raw JSON value of [eventDescription].
     *
     * Unlike [eventDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("eventDescription")
    @ExcludeMissing
    fun _eventDescription(): JsonField<String> = eventDescription

    /**
     * Returns the raw JSON value of [eventEnd].
     *
     * Unlike [eventEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventEnd") @ExcludeMissing fun _eventEnd(): JsonField<OffsetDateTime> = eventEnd

    /**
     * Returns the raw JSON value of [eventStart].
     *
     * Unlike [eventStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventStart")
    @ExcludeMissing
    fun _eventStart(): JsonField<OffsetDateTime> = eventStart

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventType") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

    /**
     * Returns the raw JSON value of [filesize].
     *
     * Unlike [filesize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filesize") @ExcludeMissing fun _filesize(): JsonField<Long> = filesize

    /**
     * Returns the raw JSON value of [friendlyAbd].
     *
     * Unlike [friendlyAbd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("friendlyAbd") @ExcludeMissing fun _friendlyAbd(): JsonField<Int> = friendlyAbd

    /**
     * Returns the raw JSON value of [friendlyDet].
     *
     * Unlike [friendlyDet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("friendlyDet") @ExcludeMissing fun _friendlyDet(): JsonField<Int> = friendlyDet

    /**
     * Returns the raw JSON value of [friendlyKia].
     *
     * Unlike [friendlyKia], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("friendlyKIA") @ExcludeMissing fun _friendlyKia(): JsonField<Int> = friendlyKia

    /**
     * Returns the raw JSON value of [friendlyWound].
     *
     * Unlike [friendlyWound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("friendlyWound")
    @ExcludeMissing
    fun _friendlyWound(): JsonField<Int> = friendlyWound

    /**
     * Returns the raw JSON value of [goldstein].
     *
     * Unlike [goldstein], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("goldstein") @ExcludeMissing fun _goldstein(): JsonField<Double> = goldstein

    /**
     * Returns the raw JSON value of [hasAttachment].
     *
     * Unlike [hasAttachment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasAttachment")
    @ExcludeMissing
    fun _hasAttachment(): JsonField<Boolean> = hasAttachment

    /**
     * Returns the raw JSON value of [hostNatAbd].
     *
     * Unlike [hostNatAbd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hostNatAbd") @ExcludeMissing fun _hostNatAbd(): JsonField<Int> = hostNatAbd

    /**
     * Returns the raw JSON value of [hostNatDet].
     *
     * Unlike [hostNatDet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hostNatDet") @ExcludeMissing fun _hostNatDet(): JsonField<Int> = hostNatDet

    /**
     * Returns the raw JSON value of [hostNatKia].
     *
     * Unlike [hostNatKia], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hostNatKIA") @ExcludeMissing fun _hostNatKia(): JsonField<Int> = hostNatKia

    /**
     * Returns the raw JSON value of [hostNatWound].
     *
     * Unlike [hostNatWound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hostNatWound") @ExcludeMissing fun _hostNatWound(): JsonField<Int> = hostNatWound

    /**
     * Returns the raw JSON value of [idNumber].
     *
     * Unlike [idNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idNumber") @ExcludeMissing fun _idNumber(): JsonField<String> = idNumber

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
     * Returns the raw JSON value of [milgrid].
     *
     * Unlike [milgrid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("milgrid") @ExcludeMissing fun _milgrid(): JsonField<String> = milgrid

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [numArticles].
     *
     * Unlike [numArticles], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numArticles") @ExcludeMissing fun _numArticles(): JsonField<Int> = numArticles

    /**
     * Returns the raw JSON value of [numMentions].
     *
     * Unlike [numMentions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numMentions") @ExcludeMissing fun _numMentions(): JsonField<Int> = numMentions

    /**
     * Returns the raw JSON value of [numSources].
     *
     * Unlike [numSources], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numSources") @ExcludeMissing fun _numSources(): JsonField<Int> = numSources

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
     * Returns the raw JSON value of [province].
     *
     * Unlike [province], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("province") @ExcludeMissing fun _province(): JsonField<String> = province

    /**
     * Returns the raw JSON value of [relatedDocs].
     *
     * Unlike [relatedDocs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("relatedDocs")
    @ExcludeMissing
    fun _relatedDocs(): JsonField<List<RelatedDocumentFull>> = relatedDocs

    /**
     * Returns the raw JSON value of [repUnit].
     *
     * Unlike [repUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("repUnit") @ExcludeMissing fun _repUnit(): JsonField<String> = repUnit

    /**
     * Returns the raw JSON value of [repUnitActivity].
     *
     * Unlike [repUnitActivity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("repUnitActivity")
    @ExcludeMissing
    fun _repUnitActivity(): JsonField<String> = repUnitActivity

    /**
     * Returns the raw JSON value of [repUnitType].
     *
     * Unlike [repUnitType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("repUnitType") @ExcludeMissing fun _repUnitType(): JsonField<String> = repUnitType

    /**
     * Returns the raw JSON value of [sideAAbd].
     *
     * Unlike [sideAAbd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sideAAbd") @ExcludeMissing fun _sideAAbd(): JsonField<Int> = sideAAbd

    /**
     * Returns the raw JSON value of [sideADet].
     *
     * Unlike [sideADet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sideADet") @ExcludeMissing fun _sideADet(): JsonField<Int> = sideADet

    /**
     * Returns the raw JSON value of [sideAkia].
     *
     * Unlike [sideAkia], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sideAKIA") @ExcludeMissing fun _sideAkia(): JsonField<Int> = sideAkia

    /**
     * Returns the raw JSON value of [sideAWound].
     *
     * Unlike [sideAWound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sideAWound") @ExcludeMissing fun _sideAWound(): JsonField<Int> = sideAWound

    /**
     * Returns the raw JSON value of [sideBAbd].
     *
     * Unlike [sideBAbd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sideBAbd") @ExcludeMissing fun _sideBAbd(): JsonField<Int> = sideBAbd

    /**
     * Returns the raw JSON value of [sideBDet].
     *
     * Unlike [sideBDet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sideBDet") @ExcludeMissing fun _sideBDet(): JsonField<Int> = sideBDet

    /**
     * Returns the raw JSON value of [sideBkia].
     *
     * Unlike [sideBkia], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sideBKIA") @ExcludeMissing fun _sideBkia(): JsonField<Int> = sideBkia

    /**
     * Returns the raw JSON value of [sideBWound].
     *
     * Unlike [sideBWound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sideBWound") @ExcludeMissing fun _sideBWound(): JsonField<Int> = sideBWound

    /**
     * Returns the raw JSON value of [sourceLanguage].
     *
     * Unlike [sourceLanguage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceLanguage")
    @ExcludeMissing
    fun _sourceLanguage(): JsonField<String> = sourceLanguage

    /**
     * Returns the raw JSON value of [sourceUrl].
     *
     * Unlike [sourceUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceUrl") @ExcludeMissing fun _sourceUrl(): JsonField<String> = sourceUrl

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

    /**
     * Returns the raw JSON value of [target].
     *
     * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<String> = target

    /**
     * Returns the raw JSON value of [theater].
     *
     * Unlike [theater], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("theater") @ExcludeMissing fun _theater(): JsonField<String> = theater

    /**
     * Returns the raw JSON value of [typeOfAttack].
     *
     * Unlike [typeOfAttack], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("typeOfAttack")
    @ExcludeMissing
    fun _typeOfAttack(): JsonField<String> = typeOfAttack

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
         * .reportDate()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HistoryListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var reportDate: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var accuracy: JsonField<Int> = JsonMissing.of()
        private var actors: JsonField<MutableList<String>>? = null
        private var agjson: JsonField<String> = JsonMissing.of()
        private var andims: JsonField<Long> = JsonMissing.of()
        private var area: JsonField<String> = JsonMissing.of()
        private var asrid: JsonField<Int> = JsonMissing.of()
        private var atext: JsonField<String> = JsonMissing.of()
        private var atype: JsonField<String> = JsonMissing.of()
        private var avgTone: JsonField<Double> = JsonMissing.of()
        private var cameoBaseCode: JsonField<String> = JsonMissing.of()
        private var cameoCode: JsonField<String> = JsonMissing.of()
        private var cameoRootCode: JsonField<String> = JsonMissing.of()
        private var checksumValue: JsonField<String> = JsonMissing.of()
        private var city: JsonField<String> = JsonMissing.of()
        private var civAbd: JsonField<Int> = JsonMissing.of()
        private var civDet: JsonField<Int> = JsonMissing.of()
        private var civKia: JsonField<Int> = JsonMissing.of()
        private var civWound: JsonField<Int> = JsonMissing.of()
        private var clarity: JsonField<Int> = JsonMissing.of()
        private var coalAbd: JsonField<Int> = JsonMissing.of()
        private var coalDet: JsonField<Int> = JsonMissing.of()
        private var coalKia: JsonField<Int> = JsonMissing.of()
        private var coalWound: JsonField<Int> = JsonMissing.of()
        private var complexAttack: JsonField<Boolean> = JsonMissing.of()
        private var confidence: JsonField<Int> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var district: JsonField<String> = JsonMissing.of()
        private var documentFilename: JsonField<String> = JsonMissing.of()
        private var documentSource: JsonField<String> = JsonMissing.of()
        private var enemyAbd: JsonField<Int> = JsonMissing.of()
        private var enemyDet: JsonField<Int> = JsonMissing.of()
        private var enemyKia: JsonField<Int> = JsonMissing.of()
        private var eventDescription: JsonField<String> = JsonMissing.of()
        private var eventEnd: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventStart: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventType: JsonField<String> = JsonMissing.of()
        private var filesize: JsonField<Long> = JsonMissing.of()
        private var friendlyAbd: JsonField<Int> = JsonMissing.of()
        private var friendlyDet: JsonField<Int> = JsonMissing.of()
        private var friendlyKia: JsonField<Int> = JsonMissing.of()
        private var friendlyWound: JsonField<Int> = JsonMissing.of()
        private var goldstein: JsonField<Double> = JsonMissing.of()
        private var hasAttachment: JsonField<Boolean> = JsonMissing.of()
        private var hostNatAbd: JsonField<Int> = JsonMissing.of()
        private var hostNatDet: JsonField<Int> = JsonMissing.of()
        private var hostNatKia: JsonField<Int> = JsonMissing.of()
        private var hostNatWound: JsonField<Int> = JsonMissing.of()
        private var idNumber: JsonField<String> = JsonMissing.of()
        private var lat: JsonField<Double> = JsonMissing.of()
        private var lon: JsonField<Double> = JsonMissing.of()
        private var milgrid: JsonField<String> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var numArticles: JsonField<Int> = JsonMissing.of()
        private var numMentions: JsonField<Int> = JsonMissing.of()
        private var numSources: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var province: JsonField<String> = JsonMissing.of()
        private var relatedDocs: JsonField<MutableList<RelatedDocumentFull>>? = null
        private var repUnit: JsonField<String> = JsonMissing.of()
        private var repUnitActivity: JsonField<String> = JsonMissing.of()
        private var repUnitType: JsonField<String> = JsonMissing.of()
        private var sideAAbd: JsonField<Int> = JsonMissing.of()
        private var sideADet: JsonField<Int> = JsonMissing.of()
        private var sideAkia: JsonField<Int> = JsonMissing.of()
        private var sideAWound: JsonField<Int> = JsonMissing.of()
        private var sideBAbd: JsonField<Int> = JsonMissing.of()
        private var sideBDet: JsonField<Int> = JsonMissing.of()
        private var sideBkia: JsonField<Int> = JsonMissing.of()
        private var sideBWound: JsonField<Int> = JsonMissing.of()
        private var sourceLanguage: JsonField<String> = JsonMissing.of()
        private var sourceUrl: JsonField<String> = JsonMissing.of()
        private var summary: JsonField<String> = JsonMissing.of()
        private var target: JsonField<String> = JsonMissing.of()
        private var theater: JsonField<String> = JsonMissing.of()
        private var typeOfAttack: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(historyListResponse: HistoryListResponse) = apply {
            classificationMarking = historyListResponse.classificationMarking
            dataMode = historyListResponse.dataMode
            reportDate = historyListResponse.reportDate
            source = historyListResponse.source
            id = historyListResponse.id
            accuracy = historyListResponse.accuracy
            actors = historyListResponse.actors.map { it.toMutableList() }
            agjson = historyListResponse.agjson
            andims = historyListResponse.andims
            area = historyListResponse.area
            asrid = historyListResponse.asrid
            atext = historyListResponse.atext
            atype = historyListResponse.atype
            avgTone = historyListResponse.avgTone
            cameoBaseCode = historyListResponse.cameoBaseCode
            cameoCode = historyListResponse.cameoCode
            cameoRootCode = historyListResponse.cameoRootCode
            checksumValue = historyListResponse.checksumValue
            city = historyListResponse.city
            civAbd = historyListResponse.civAbd
            civDet = historyListResponse.civDet
            civKia = historyListResponse.civKia
            civWound = historyListResponse.civWound
            clarity = historyListResponse.clarity
            coalAbd = historyListResponse.coalAbd
            coalDet = historyListResponse.coalDet
            coalKia = historyListResponse.coalKia
            coalWound = historyListResponse.coalWound
            complexAttack = historyListResponse.complexAttack
            confidence = historyListResponse.confidence
            countryCode = historyListResponse.countryCode
            createdAt = historyListResponse.createdAt
            createdBy = historyListResponse.createdBy
            district = historyListResponse.district
            documentFilename = historyListResponse.documentFilename
            documentSource = historyListResponse.documentSource
            enemyAbd = historyListResponse.enemyAbd
            enemyDet = historyListResponse.enemyDet
            enemyKia = historyListResponse.enemyKia
            eventDescription = historyListResponse.eventDescription
            eventEnd = historyListResponse.eventEnd
            eventStart = historyListResponse.eventStart
            eventType = historyListResponse.eventType
            filesize = historyListResponse.filesize
            friendlyAbd = historyListResponse.friendlyAbd
            friendlyDet = historyListResponse.friendlyDet
            friendlyKia = historyListResponse.friendlyKia
            friendlyWound = historyListResponse.friendlyWound
            goldstein = historyListResponse.goldstein
            hasAttachment = historyListResponse.hasAttachment
            hostNatAbd = historyListResponse.hostNatAbd
            hostNatDet = historyListResponse.hostNatDet
            hostNatKia = historyListResponse.hostNatKia
            hostNatWound = historyListResponse.hostNatWound
            idNumber = historyListResponse.idNumber
            lat = historyListResponse.lat
            lon = historyListResponse.lon
            milgrid = historyListResponse.milgrid
            notes = historyListResponse.notes
            numArticles = historyListResponse.numArticles
            numMentions = historyListResponse.numMentions
            numSources = historyListResponse.numSources
            origin = historyListResponse.origin
            origNetwork = historyListResponse.origNetwork
            province = historyListResponse.province
            relatedDocs = historyListResponse.relatedDocs.map { it.toMutableList() }
            repUnit = historyListResponse.repUnit
            repUnitActivity = historyListResponse.repUnitActivity
            repUnitType = historyListResponse.repUnitType
            sideAAbd = historyListResponse.sideAAbd
            sideADet = historyListResponse.sideADet
            sideAkia = historyListResponse.sideAkia
            sideAWound = historyListResponse.sideAWound
            sideBAbd = historyListResponse.sideBAbd
            sideBDet = historyListResponse.sideBDet
            sideBkia = historyListResponse.sideBkia
            sideBWound = historyListResponse.sideBWound
            sourceLanguage = historyListResponse.sourceLanguage
            sourceUrl = historyListResponse.sourceUrl
            summary = historyListResponse.summary
            target = historyListResponse.target
            theater = historyListResponse.theater
            typeOfAttack = historyListResponse.typeOfAttack
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

        /** Date of the report or filing. */
        fun reportDate(reportDate: OffsetDateTime) = reportDate(JsonField.of(reportDate))

        /**
         * Sets [Builder.reportDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reportDate(reportDate: JsonField<OffsetDateTime>) = apply {
            this.reportDate = reportDate
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

        /** Estimate of the accuracy that this event occurred as described/reported. */
        fun accuracy(accuracy: Int) = accuracy(JsonField.of(accuracy))

        /**
         * Sets [Builder.accuracy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accuracy] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun accuracy(accuracy: JsonField<Int>) = apply { this.accuracy = accuracy }

        /** A list of one or more actors involved in the event. */
        fun actors(actors: List<String>) = actors(JsonField.of(actors))

        /**
         * Sets [Builder.actors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actors] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actors(actors: JsonField<List<String>>) = apply {
            this.actors = actors.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [actors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addActor(actor: String) = apply {
            actors =
                (actors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("actors", it).add(actor)
                }
        }

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
        fun andims(andims: Long) = andims(JsonField.of(andims))

        /**
         * Sets [Builder.andims] to an arbitrary JSON value.
         *
         * You should usually call [Builder.andims] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun andims(andims: JsonField<Long>) = apply { this.andims = andims }

        /**
         * Optional geographical region or polygon (lat/lon pairs) of the area surrounding the point
         * of interest as projected on the ground.
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
         * This is the average tone of all documents containing one or more mentions of this event
         * during the 15 minute update in which it was first seen. The score ranges from -100
         * (extremely negative) to +100 (extremely positive). Common values range between -10 and
         * +10, with 0 indicating neutral.
         */
        fun avgTone(avgTone: Double) = avgTone(JsonField.of(avgTone))

        /**
         * Sets [Builder.avgTone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgTone] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avgTone(avgTone: JsonField<Double>) = apply { this.avgTone = avgTone }

        /**
         * CAMEO event codes are defined in a three-level taxonomy. For events at level three in the
         * taxonomy, this yields its level two leaf root node. For example, code 0251 (Appeal for
         * easing of administrative sanctions) would yield an EventBaseCode of 025 (Appeal to
         * yield). This makes it possible to aggregate events at various resolutions of specificity.
         * For events at levels two or one, this field will be set to EventCode.
         */
        fun cameoBaseCode(cameoBaseCode: String) = cameoBaseCode(JsonField.of(cameoBaseCode))

        /**
         * Sets [Builder.cameoBaseCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cameoBaseCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cameoBaseCode(cameoBaseCode: JsonField<String>) = apply {
            this.cameoBaseCode = cameoBaseCode
        }

        /**
         * This is the raw CAMEO action code describing the action that Actor1 performed upon
         * Actor2. Additional information about Cameo Codes can be obtained from the GDELT project
         * documentation here: https://www.gdeltproject.org/data.html#documentation.
         */
        fun cameoCode(cameoCode: String) = cameoCode(JsonField.of(cameoCode))

        /**
         * Sets [Builder.cameoCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cameoCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cameoCode(cameoCode: JsonField<String>) = apply { this.cameoCode = cameoCode }

        /**
         * Similar to EventBaseCode, this defines the root-level category the event code falls
         * under. For example, code 0251 (Appeal for easing of administrative sanctions) has a root
         * code of 02 (Appeal). This makes it possible to aggregate events at various resolutions of
         * specificity. For events at levels two or one, this field will be set to EventCode.
         */
        fun cameoRootCode(cameoRootCode: String) = cameoRootCode(JsonField.of(cameoRootCode))

        /**
         * Sets [Builder.cameoRootCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cameoRootCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cameoRootCode(cameoRootCode: JsonField<String>) = apply {
            this.cameoRootCode = cameoRootCode
        }

        /**
         * MD5 value of the file. The ingest/create operation will automatically generate the value.
         */
        fun checksumValue(checksumValue: String) = checksumValue(JsonField.of(checksumValue))

        /**
         * Sets [Builder.checksumValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checksumValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checksumValue(checksumValue: JsonField<String>) = apply {
            this.checksumValue = checksumValue
        }

        /** The city in or near which this event occurred. */
        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** Number of civilians abducted in the activity. */
        fun civAbd(civAbd: Int) = civAbd(JsonField.of(civAbd))

        /**
         * Sets [Builder.civAbd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.civAbd] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun civAbd(civAbd: JsonField<Int>) = apply { this.civAbd = civAbd }

        /** Number of civilians detained in the activity. */
        fun civDet(civDet: Int) = civDet(JsonField.of(civDet))

        /**
         * Sets [Builder.civDet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.civDet] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun civDet(civDet: JsonField<Int>) = apply { this.civDet = civDet }

        /** Number of civilians killed in the activity. */
        fun civKia(civKia: Int) = civKia(JsonField.of(civKia))

        /**
         * Sets [Builder.civKia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.civKia] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun civKia(civKia: JsonField<Int>) = apply { this.civKia = civKia }

        /** Number of civilians wounded in the activity. */
        fun civWound(civWound: Int) = civWound(JsonField.of(civWound))

        /**
         * Sets [Builder.civWound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.civWound] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun civWound(civWound: JsonField<Int>) = apply { this.civWound = civWound }

        /**
         * 1 (high) for events where the reporting allows the coder to identify the event in full.
         * That is, events where the individual happening is described by the original source in a
         * sufficiently detailed way as to identify individual incidents, i.e. separate activities
         * of fighting in a single location:
         *
         * 2 (lower) for events where an aggregation of information was already made by the source
         * material that is impossible to undo in the coding process. Such events are described by
         * the original source only as aggregates (totals) of multiple separate activities of
         * fighting spanning over a longer period than a single, clearly defined day.
         */
        fun clarity(clarity: Int) = clarity(JsonField.of(clarity))

        /**
         * Sets [Builder.clarity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clarity] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clarity(clarity: JsonField<Int>) = apply { this.clarity = clarity }

        /** Number of coalition members abducted in the activity. */
        fun coalAbd(coalAbd: Int) = coalAbd(JsonField.of(coalAbd))

        /**
         * Sets [Builder.coalAbd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coalAbd] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun coalAbd(coalAbd: JsonField<Int>) = apply { this.coalAbd = coalAbd }

        /** Number of coalition members detained in the activity. */
        fun coalDet(coalDet: Int) = coalDet(JsonField.of(coalDet))

        /**
         * Sets [Builder.coalDet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coalDet] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun coalDet(coalDet: JsonField<Int>) = apply { this.coalDet = coalDet }

        /** Number of coalition members killed in the activity. */
        fun coalKia(coalKia: Int) = coalKia(JsonField.of(coalKia))

        /**
         * Sets [Builder.coalKia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coalKia] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun coalKia(coalKia: JsonField<Int>) = apply { this.coalKia = coalKia }

        /** Number of coalition members wounded in the activity. */
        fun coalWound(coalWound: Int) = coalWound(JsonField.of(coalWound))

        /**
         * Sets [Builder.coalWound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coalWound] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun coalWound(coalWound: JsonField<Int>) = apply { this.coalWound = coalWound }

        /** Flag indicating that this attack was of a complex or coordinated nature. */
        fun complexAttack(complexAttack: Boolean) = complexAttack(JsonField.of(complexAttack))

        /**
         * Sets [Builder.complexAttack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.complexAttack] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun complexAttack(complexAttack: JsonField<Boolean>) = apply {
            this.complexAttack = complexAttack
        }

        /** Estimate of the confidence that this event occurred. */
        fun confidence(confidence: Int) = confidence(JsonField.of(confidence))

        /**
         * Sets [Builder.confidence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidence] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun confidence(confidence: JsonField<Int>) = apply { this.confidence = confidence }

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

        /**
         * Time the row was created in the database, auto-populated by the system, example =
         * 2018-01-01T16:00:00.123Z.
         */
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

        /** The district in which this event occurred. */
        fun district(district: String) = district(JsonField.of(district))

        /**
         * Sets [Builder.district] to an arbitrary JSON value.
         *
         * You should usually call [Builder.district] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun district(district: JsonField<String>) = apply { this.district = district }

        /** The filename of the document or report. */
        fun documentFilename(documentFilename: String) =
            documentFilename(JsonField.of(documentFilename))

        /**
         * Sets [Builder.documentFilename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentFilename] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentFilename(documentFilename: JsonField<String>) = apply {
            this.documentFilename = documentFilename
        }

        /** The source of the document or report. */
        fun documentSource(documentSource: String) = documentSource(JsonField.of(documentSource))

        /**
         * Sets [Builder.documentSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentSource] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentSource(documentSource: JsonField<String>) = apply {
            this.documentSource = documentSource
        }

        /** Number of enemy combatants abducted in the activity. */
        fun enemyAbd(enemyAbd: Int) = enemyAbd(JsonField.of(enemyAbd))

        /**
         * Sets [Builder.enemyAbd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enemyAbd] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enemyAbd(enemyAbd: JsonField<Int>) = apply { this.enemyAbd = enemyAbd }

        /** Number of enemy combatants detained in the activity. */
        fun enemyDet(enemyDet: Int) = enemyDet(JsonField.of(enemyDet))

        /**
         * Sets [Builder.enemyDet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enemyDet] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enemyDet(enemyDet: JsonField<Int>) = apply { this.enemyDet = enemyDet }

        /** Number of enemy combatants killed in the activity. */
        fun enemyKia(enemyKia: Int) = enemyKia(JsonField.of(enemyKia))

        /**
         * Sets [Builder.enemyKia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enemyKia] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enemyKia(enemyKia: JsonField<Int>) = apply { this.enemyKia = enemyKia }

        /** A description of the event. */
        fun eventDescription(eventDescription: String) =
            eventDescription(JsonField.of(eventDescription))

        /**
         * Sets [Builder.eventDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventDescription(eventDescription: JsonField<String>) = apply {
            this.eventDescription = eventDescription
        }

        /** The approximate end time of the event, in ISO 8601 UTC format. */
        fun eventEnd(eventEnd: OffsetDateTime) = eventEnd(JsonField.of(eventEnd))

        /**
         * Sets [Builder.eventEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventEnd(eventEnd: JsonField<OffsetDateTime>) = apply { this.eventEnd = eventEnd }

        /** The approximate start time of the event, in ISO 8601 UTC format. */
        fun eventStart(eventStart: OffsetDateTime) = eventStart(JsonField.of(eventStart))

        /**
         * Sets [Builder.eventStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventStart(eventStart: JsonField<OffsetDateTime>) = apply {
            this.eventStart = eventStart
        }

        /** The type of event (e.g. Military, Natural, Political, Social, etc.). */
        fun eventType(eventType: String) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

        /**
         * Size of the associated text file. Units in bytes. If filesize is provided without an
         * associated file, it defaults to 0.
         */
        fun filesize(filesize: Long) = filesize(JsonField.of(filesize))

        /**
         * Sets [Builder.filesize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filesize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filesize(filesize: JsonField<Long>) = apply { this.filesize = filesize }

        /** Number of friendlies abducted in the activity. */
        fun friendlyAbd(friendlyAbd: Int) = friendlyAbd(JsonField.of(friendlyAbd))

        /**
         * Sets [Builder.friendlyAbd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.friendlyAbd] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun friendlyAbd(friendlyAbd: JsonField<Int>) = apply { this.friendlyAbd = friendlyAbd }

        /** Number of friendlies in the activity. */
        fun friendlyDet(friendlyDet: Int) = friendlyDet(JsonField.of(friendlyDet))

        /**
         * Sets [Builder.friendlyDet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.friendlyDet] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun friendlyDet(friendlyDet: JsonField<Int>) = apply { this.friendlyDet = friendlyDet }

        /** Number of friendlies killed in the activity. */
        fun friendlyKia(friendlyKia: Int) = friendlyKia(JsonField.of(friendlyKia))

        /**
         * Sets [Builder.friendlyKia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.friendlyKia] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun friendlyKia(friendlyKia: JsonField<Int>) = apply { this.friendlyKia = friendlyKia }

        /** Number of friendlies wounded in the activity. */
        fun friendlyWound(friendlyWound: Int) = friendlyWound(JsonField.of(friendlyWound))

        /**
         * Sets [Builder.friendlyWound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.friendlyWound] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun friendlyWound(friendlyWound: JsonField<Int>) = apply {
            this.friendlyWound = friendlyWound
        }

        /**
         * Each CAMEO event code is assigned a numeric score from -10 to +10, capturing the
         * theoretical potential impact that type of event will have on the stability of a country.
         * This is known as the Goldstein Scale. NOTE: this score is based on the type of event, not
         * the specifics of the actual event record being recorded thus two riots, one with 10
         * people and one with 10,000, will both receive the same Goldstein score. This can be
         * aggregated to various levels of time resolution to yield an approximation of the
         * stability of a location over time.
         */
        fun goldstein(goldstein: Double) = goldstein(JsonField.of(goldstein))

        /**
         * Sets [Builder.goldstein] to an arbitrary JSON value.
         *
         * You should usually call [Builder.goldstein] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun goldstein(goldstein: JsonField<Double>) = apply { this.goldstein = goldstein }

        /**
         * Flag indicating this SigAct record has an associated txt file stored in the UDL. Retrieve
         * the txt file by using the GET/udl/sigact/getFile/{id} where id is the same as the SigAct
         * record id. The maximum file size for this service is 10,000,000 bytes (10MB). Files
         * exceeding the maximum size will be rejected.
         */
        fun hasAttachment(hasAttachment: Boolean) = hasAttachment(JsonField.of(hasAttachment))

        /**
         * Sets [Builder.hasAttachment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasAttachment] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasAttachment(hasAttachment: JsonField<Boolean>) = apply {
            this.hasAttachment = hasAttachment
        }

        /** Number of Host Nation members abducted in the activity. */
        fun hostNatAbd(hostNatAbd: Int) = hostNatAbd(JsonField.of(hostNatAbd))

        /**
         * Sets [Builder.hostNatAbd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostNatAbd] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hostNatAbd(hostNatAbd: JsonField<Int>) = apply { this.hostNatAbd = hostNatAbd }

        /** Number of Host Nation members detained in the activity. */
        fun hostNatDet(hostNatDet: Int) = hostNatDet(JsonField.of(hostNatDet))

        /**
         * Sets [Builder.hostNatDet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostNatDet] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hostNatDet(hostNatDet: JsonField<Int>) = apply { this.hostNatDet = hostNatDet }

        /** Number of Host Nation members killed in the activity. */
        fun hostNatKia(hostNatKia: Int) = hostNatKia(JsonField.of(hostNatKia))

        /**
         * Sets [Builder.hostNatKia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostNatKia] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hostNatKia(hostNatKia: JsonField<Int>) = apply { this.hostNatKia = hostNatKia }

        /** Number of Host Nation members wounded in the activity. */
        fun hostNatWound(hostNatWound: Int) = hostNatWound(JsonField.of(hostNatWound))

        /**
         * Sets [Builder.hostNatWound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostNatWound] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hostNatWound(hostNatWound: JsonField<Int>) = apply { this.hostNatWound = hostNatWound }

        /**
         * Unique identifier assigned to each event record that uniquely identifies it in the master
         * dataset. This ID is provided for convenience of mapping to external systems.
         */
        fun idNumber(idNumber: String) = idNumber(JsonField.of(idNumber))

        /**
         * Sets [Builder.idNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idNumber] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idNumber(idNumber: JsonField<String>) = apply { this.idNumber = idNumber }

        /**
         * WGS-84 centroid latitude of the event location, in degrees. -90 to 90 degrees (negative
         * values south of equator).
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
         * WGS-84 centroid longitude of the event location, in degrees. -180 to 180 degrees
         * (negative values west of Prime Meridian).
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
         * The Military Grid Reference System is the geocoordinate standard used by NATO militaries
         * for locating points on Earth. The MGRS is derived from the Universal Transverse Mercator
         * (UTM) grid system and the Universal Polar Stereographic (UPS) grid system, but uses a
         * different labeling convention. The MGRS is used as geocode for the entire Earth. Example
         * of an milgrid coordinate, or grid reference, would be 4QFJ12345678, which consists of
         * three parts:
         *
         * &nbsp;&nbsp;4Q (grid zone designator, GZD)
         *
         * &nbsp;&nbsp;FJ (the 100,000-meter square identifier)
         *
         * &nbsp;&nbsp;12345678 (numerical location; easting is 1234 and northing is 5678, in this
         * case specifying a location with 10 m resolution).
         */
        fun milgrid(milgrid: String) = milgrid(JsonField.of(milgrid))

        /**
         * Sets [Builder.milgrid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.milgrid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun milgrid(milgrid: JsonField<String>) = apply { this.milgrid = milgrid }

        /** Notes related to the documents or event. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

        /**
         * This is the total number of source documents containing one or more mentions of this
         * event during the 15 minute update in which it was first seen. This can be used as a
         * method of assessing the importance of an event: the more discussion of that event, the
         * more likely it is to be significant.
         */
        fun numArticles(numArticles: Int) = numArticles(JsonField.of(numArticles))

        /**
         * Sets [Builder.numArticles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numArticles] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numArticles(numArticles: JsonField<Int>) = apply { this.numArticles = numArticles }

        /**
         * This is the total number of mentions of this event across all source documents during the
         * 15 minute update in which it was first seen. Multiple references to an event within a
         * single document also contribute to this count. This can be used as a method of assessing
         * the importance of an event: the more discussion of that event, the more likely it is to
         * be significant.
         */
        fun numMentions(numMentions: Int) = numMentions(JsonField.of(numMentions))

        /**
         * Sets [Builder.numMentions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numMentions] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numMentions(numMentions: JsonField<Int>) = apply { this.numMentions = numMentions }

        /**
         * This is the total number of information sources containing one or more mentions of this
         * event during the 15 minute update in which it was first seen. This can be used as a
         * method of assessing the importance of an event: the more discussion of that event, the
         * more likely it is to be significant.
         */
        fun numSources(numSources: Int) = numSources(JsonField.of(numSources))

        /**
         * Sets [Builder.numSources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numSources] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numSources(numSources: JsonField<Int>) = apply { this.numSources = numSources }

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

        /** The province in which this event occurred. */
        fun province(province: String) = province(JsonField.of(province))

        /**
         * Sets [Builder.province] to an arbitrary JSON value.
         *
         * You should usually call [Builder.province] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun province(province: JsonField<String>) = apply { this.province = province }

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

        /** The reporting unit. */
        fun repUnit(repUnit: String) = repUnit(JsonField.of(repUnit))

        /**
         * Sets [Builder.repUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repUnit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun repUnit(repUnit: JsonField<String>) = apply { this.repUnit = repUnit }

        /** The activity the unit was engaged in. */
        fun repUnitActivity(repUnitActivity: String) =
            repUnitActivity(JsonField.of(repUnitActivity))

        /**
         * Sets [Builder.repUnitActivity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repUnitActivity] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun repUnitActivity(repUnitActivity: JsonField<String>) = apply {
            this.repUnitActivity = repUnitActivity
        }

        /** The reporting unit type. */
        fun repUnitType(repUnitType: String) = repUnitType(JsonField.of(repUnitType))

        /**
         * Sets [Builder.repUnitType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repUnitType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun repUnitType(repUnitType: JsonField<String>) = apply { this.repUnitType = repUnitType }

        /** Number of side A members abducted in the activity. */
        fun sideAAbd(sideAAbd: Int) = sideAAbd(JsonField.of(sideAAbd))

        /**
         * Sets [Builder.sideAAbd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sideAAbd] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sideAAbd(sideAAbd: JsonField<Int>) = apply { this.sideAAbd = sideAAbd }

        /** Number of side A members detained in the activity. */
        fun sideADet(sideADet: Int) = sideADet(JsonField.of(sideADet))

        /**
         * Sets [Builder.sideADet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sideADet] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sideADet(sideADet: JsonField<Int>) = apply { this.sideADet = sideADet }

        /** Number of side A members killed in the activity. */
        fun sideAkia(sideAkia: Int) = sideAkia(JsonField.of(sideAkia))

        /**
         * Sets [Builder.sideAkia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sideAkia] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sideAkia(sideAkia: JsonField<Int>) = apply { this.sideAkia = sideAkia }

        /** Number of side A members wounded in the activity. */
        fun sideAWound(sideAWound: Int) = sideAWound(JsonField.of(sideAWound))

        /**
         * Sets [Builder.sideAWound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sideAWound] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sideAWound(sideAWound: JsonField<Int>) = apply { this.sideAWound = sideAWound }

        /** Number of side B members abducted in the activity. */
        fun sideBAbd(sideBAbd: Int) = sideBAbd(JsonField.of(sideBAbd))

        /**
         * Sets [Builder.sideBAbd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sideBAbd] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sideBAbd(sideBAbd: JsonField<Int>) = apply { this.sideBAbd = sideBAbd }

        /** Number of side B members detained in the activity. */
        fun sideBDet(sideBDet: Int) = sideBDet(JsonField.of(sideBDet))

        /**
         * Sets [Builder.sideBDet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sideBDet] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sideBDet(sideBDet: JsonField<Int>) = apply { this.sideBDet = sideBDet }

        /** Number of side B members killed in the activity. */
        fun sideBkia(sideBkia: Int) = sideBkia(JsonField.of(sideBkia))

        /**
         * Sets [Builder.sideBkia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sideBkia] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sideBkia(sideBkia: JsonField<Int>) = apply { this.sideBkia = sideBkia }

        /** Number of side B members wounded in the activity. */
        fun sideBWound(sideBWound: Int) = sideBWound(JsonField.of(sideBWound))

        /**
         * Sets [Builder.sideBWound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sideBWound] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sideBWound(sideBWound: JsonField<Int>) = apply { this.sideBWound = sideBWound }

        /**
         * The source language of the significant event using the ISO 639-3, 3 character code
         * definition.
         */
        fun sourceLanguage(sourceLanguage: String) = sourceLanguage(JsonField.of(sourceLanguage))

        /**
         * Sets [Builder.sourceLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceLanguage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceLanguage(sourceLanguage: JsonField<String>) = apply {
            this.sourceLanguage = sourceLanguage
        }

        /**
         * This field records the URL or citation of the first news report it found this event in.
         * In most cases this is the first report it saw the article in, but due to the timing and
         * flow of news reports through the processing pipeline, this may not always be the very
         * first report, but is at least in the first few reports.
         */
        fun sourceUrl(sourceUrl: String) = sourceUrl(JsonField.of(sourceUrl))

        /**
         * Sets [Builder.sourceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceUrl(sourceUrl: JsonField<String>) = apply { this.sourceUrl = sourceUrl }

        /** A summary of the event. */
        fun summary(summary: String) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<String>) = apply { this.summary = summary }

        /**
         * The name of the target. The target may be an individual, an entity, or a country/region.
         */
        fun target(target: String) = target(JsonField.of(target))

        /**
         * Sets [Builder.target] to an arbitrary JSON value.
         *
         * You should usually call [Builder.target] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun target(target: JsonField<String>) = apply { this.target = target }

        /**
         * Area in which important military events occur or are progressing. A theater can include
         * the entirety of the airspace, land and sea area that is or that may potentially become
         * involved in war operations.
         */
        fun theater(theater: String) = theater(JsonField.of(theater))

        /**
         * Sets [Builder.theater] to an arbitrary JSON value.
         *
         * You should usually call [Builder.theater] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun theater(theater: JsonField<String>) = apply { this.theater = theater }

        /** The mode of this attack or event (e.g. Direct Fire, IED Explosion, etc.). */
        fun typeOfAttack(typeOfAttack: String) = typeOfAttack(JsonField.of(typeOfAttack))

        /**
         * Sets [Builder.typeOfAttack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.typeOfAttack] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun typeOfAttack(typeOfAttack: JsonField<String>) = apply {
            this.typeOfAttack = typeOfAttack
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
         * .reportDate()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HistoryListResponse =
            HistoryListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("reportDate", reportDate),
                checkRequired("source", source),
                id,
                accuracy,
                (actors ?: JsonMissing.of()).map { it.toImmutable() },
                agjson,
                andims,
                area,
                asrid,
                atext,
                atype,
                avgTone,
                cameoBaseCode,
                cameoCode,
                cameoRootCode,
                checksumValue,
                city,
                civAbd,
                civDet,
                civKia,
                civWound,
                clarity,
                coalAbd,
                coalDet,
                coalKia,
                coalWound,
                complexAttack,
                confidence,
                countryCode,
                createdAt,
                createdBy,
                district,
                documentFilename,
                documentSource,
                enemyAbd,
                enemyDet,
                enemyKia,
                eventDescription,
                eventEnd,
                eventStart,
                eventType,
                filesize,
                friendlyAbd,
                friendlyDet,
                friendlyKia,
                friendlyWound,
                goldstein,
                hasAttachment,
                hostNatAbd,
                hostNatDet,
                hostNatKia,
                hostNatWound,
                idNumber,
                lat,
                lon,
                milgrid,
                notes,
                numArticles,
                numMentions,
                numSources,
                origin,
                origNetwork,
                province,
                (relatedDocs ?: JsonMissing.of()).map { it.toImmutable() },
                repUnit,
                repUnitActivity,
                repUnitType,
                sideAAbd,
                sideADet,
                sideAkia,
                sideAWound,
                sideBAbd,
                sideBDet,
                sideBkia,
                sideBWound,
                sourceLanguage,
                sourceUrl,
                summary,
                target,
                theater,
                typeOfAttack,
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
        reportDate()
        source()
        id()
        accuracy()
        actors()
        agjson()
        andims()
        area()
        asrid()
        atext()
        atype()
        avgTone()
        cameoBaseCode()
        cameoCode()
        cameoRootCode()
        checksumValue()
        city()
        civAbd()
        civDet()
        civKia()
        civWound()
        clarity()
        coalAbd()
        coalDet()
        coalKia()
        coalWound()
        complexAttack()
        confidence()
        countryCode()
        createdAt()
        createdBy()
        district()
        documentFilename()
        documentSource()
        enemyAbd()
        enemyDet()
        enemyKia()
        eventDescription()
        eventEnd()
        eventStart()
        eventType()
        filesize()
        friendlyAbd()
        friendlyDet()
        friendlyKia()
        friendlyWound()
        goldstein()
        hasAttachment()
        hostNatAbd()
        hostNatDet()
        hostNatKia()
        hostNatWound()
        idNumber()
        lat()
        lon()
        milgrid()
        notes()
        numArticles()
        numMentions()
        numSources()
        origin()
        origNetwork()
        province()
        relatedDocs().ifPresent { it.forEach { it.validate() } }
        repUnit()
        repUnitActivity()
        repUnitType()
        sideAAbd()
        sideADet()
        sideAkia()
        sideAWound()
        sideBAbd()
        sideBDet()
        sideBkia()
        sideBWound()
        sourceLanguage()
        sourceUrl()
        summary()
        target()
        theater()
        typeOfAttack()
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
            (if (reportDate.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (accuracy.asKnown().isPresent) 1 else 0) +
            (actors.asKnown().getOrNull()?.size ?: 0) +
            (if (agjson.asKnown().isPresent) 1 else 0) +
            (if (andims.asKnown().isPresent) 1 else 0) +
            (if (area.asKnown().isPresent) 1 else 0) +
            (if (asrid.asKnown().isPresent) 1 else 0) +
            (if (atext.asKnown().isPresent) 1 else 0) +
            (if (atype.asKnown().isPresent) 1 else 0) +
            (if (avgTone.asKnown().isPresent) 1 else 0) +
            (if (cameoBaseCode.asKnown().isPresent) 1 else 0) +
            (if (cameoCode.asKnown().isPresent) 1 else 0) +
            (if (cameoRootCode.asKnown().isPresent) 1 else 0) +
            (if (checksumValue.asKnown().isPresent) 1 else 0) +
            (if (city.asKnown().isPresent) 1 else 0) +
            (if (civAbd.asKnown().isPresent) 1 else 0) +
            (if (civDet.asKnown().isPresent) 1 else 0) +
            (if (civKia.asKnown().isPresent) 1 else 0) +
            (if (civWound.asKnown().isPresent) 1 else 0) +
            (if (clarity.asKnown().isPresent) 1 else 0) +
            (if (coalAbd.asKnown().isPresent) 1 else 0) +
            (if (coalDet.asKnown().isPresent) 1 else 0) +
            (if (coalKia.asKnown().isPresent) 1 else 0) +
            (if (coalWound.asKnown().isPresent) 1 else 0) +
            (if (complexAttack.asKnown().isPresent) 1 else 0) +
            (if (confidence.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (district.asKnown().isPresent) 1 else 0) +
            (if (documentFilename.asKnown().isPresent) 1 else 0) +
            (if (documentSource.asKnown().isPresent) 1 else 0) +
            (if (enemyAbd.asKnown().isPresent) 1 else 0) +
            (if (enemyDet.asKnown().isPresent) 1 else 0) +
            (if (enemyKia.asKnown().isPresent) 1 else 0) +
            (if (eventDescription.asKnown().isPresent) 1 else 0) +
            (if (eventEnd.asKnown().isPresent) 1 else 0) +
            (if (eventStart.asKnown().isPresent) 1 else 0) +
            (if (eventType.asKnown().isPresent) 1 else 0) +
            (if (filesize.asKnown().isPresent) 1 else 0) +
            (if (friendlyAbd.asKnown().isPresent) 1 else 0) +
            (if (friendlyDet.asKnown().isPresent) 1 else 0) +
            (if (friendlyKia.asKnown().isPresent) 1 else 0) +
            (if (friendlyWound.asKnown().isPresent) 1 else 0) +
            (if (goldstein.asKnown().isPresent) 1 else 0) +
            (if (hasAttachment.asKnown().isPresent) 1 else 0) +
            (if (hostNatAbd.asKnown().isPresent) 1 else 0) +
            (if (hostNatDet.asKnown().isPresent) 1 else 0) +
            (if (hostNatKia.asKnown().isPresent) 1 else 0) +
            (if (hostNatWound.asKnown().isPresent) 1 else 0) +
            (if (idNumber.asKnown().isPresent) 1 else 0) +
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (lon.asKnown().isPresent) 1 else 0) +
            (if (milgrid.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (numArticles.asKnown().isPresent) 1 else 0) +
            (if (numMentions.asKnown().isPresent) 1 else 0) +
            (if (numSources.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (province.asKnown().isPresent) 1 else 0) +
            (relatedDocs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (repUnit.asKnown().isPresent) 1 else 0) +
            (if (repUnitActivity.asKnown().isPresent) 1 else 0) +
            (if (repUnitType.asKnown().isPresent) 1 else 0) +
            (if (sideAAbd.asKnown().isPresent) 1 else 0) +
            (if (sideADet.asKnown().isPresent) 1 else 0) +
            (if (sideAkia.asKnown().isPresent) 1 else 0) +
            (if (sideAWound.asKnown().isPresent) 1 else 0) +
            (if (sideBAbd.asKnown().isPresent) 1 else 0) +
            (if (sideBDet.asKnown().isPresent) 1 else 0) +
            (if (sideBkia.asKnown().isPresent) 1 else 0) +
            (if (sideBWound.asKnown().isPresent) 1 else 0) +
            (if (sourceLanguage.asKnown().isPresent) 1 else 0) +
            (if (sourceUrl.asKnown().isPresent) 1 else 0) +
            (if (summary.asKnown().isPresent) 1 else 0) +
            (if (target.asKnown().isPresent) 1 else 0) +
            (if (theater.asKnown().isPresent) 1 else 0) +
            (if (typeOfAttack.asKnown().isPresent) 1 else 0)

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

        return other is HistoryListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            reportDate == other.reportDate &&
            source == other.source &&
            id == other.id &&
            accuracy == other.accuracy &&
            actors == other.actors &&
            agjson == other.agjson &&
            andims == other.andims &&
            area == other.area &&
            asrid == other.asrid &&
            atext == other.atext &&
            atype == other.atype &&
            avgTone == other.avgTone &&
            cameoBaseCode == other.cameoBaseCode &&
            cameoCode == other.cameoCode &&
            cameoRootCode == other.cameoRootCode &&
            checksumValue == other.checksumValue &&
            city == other.city &&
            civAbd == other.civAbd &&
            civDet == other.civDet &&
            civKia == other.civKia &&
            civWound == other.civWound &&
            clarity == other.clarity &&
            coalAbd == other.coalAbd &&
            coalDet == other.coalDet &&
            coalKia == other.coalKia &&
            coalWound == other.coalWound &&
            complexAttack == other.complexAttack &&
            confidence == other.confidence &&
            countryCode == other.countryCode &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            district == other.district &&
            documentFilename == other.documentFilename &&
            documentSource == other.documentSource &&
            enemyAbd == other.enemyAbd &&
            enemyDet == other.enemyDet &&
            enemyKia == other.enemyKia &&
            eventDescription == other.eventDescription &&
            eventEnd == other.eventEnd &&
            eventStart == other.eventStart &&
            eventType == other.eventType &&
            filesize == other.filesize &&
            friendlyAbd == other.friendlyAbd &&
            friendlyDet == other.friendlyDet &&
            friendlyKia == other.friendlyKia &&
            friendlyWound == other.friendlyWound &&
            goldstein == other.goldstein &&
            hasAttachment == other.hasAttachment &&
            hostNatAbd == other.hostNatAbd &&
            hostNatDet == other.hostNatDet &&
            hostNatKia == other.hostNatKia &&
            hostNatWound == other.hostNatWound &&
            idNumber == other.idNumber &&
            lat == other.lat &&
            lon == other.lon &&
            milgrid == other.milgrid &&
            notes == other.notes &&
            numArticles == other.numArticles &&
            numMentions == other.numMentions &&
            numSources == other.numSources &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            province == other.province &&
            relatedDocs == other.relatedDocs &&
            repUnit == other.repUnit &&
            repUnitActivity == other.repUnitActivity &&
            repUnitType == other.repUnitType &&
            sideAAbd == other.sideAAbd &&
            sideADet == other.sideADet &&
            sideAkia == other.sideAkia &&
            sideAWound == other.sideAWound &&
            sideBAbd == other.sideBAbd &&
            sideBDet == other.sideBDet &&
            sideBkia == other.sideBkia &&
            sideBWound == other.sideBWound &&
            sourceLanguage == other.sourceLanguage &&
            sourceUrl == other.sourceUrl &&
            summary == other.summary &&
            target == other.target &&
            theater == other.theater &&
            typeOfAttack == other.typeOfAttack &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            reportDate,
            source,
            id,
            accuracy,
            actors,
            agjson,
            andims,
            area,
            asrid,
            atext,
            atype,
            avgTone,
            cameoBaseCode,
            cameoCode,
            cameoRootCode,
            checksumValue,
            city,
            civAbd,
            civDet,
            civKia,
            civWound,
            clarity,
            coalAbd,
            coalDet,
            coalKia,
            coalWound,
            complexAttack,
            confidence,
            countryCode,
            createdAt,
            createdBy,
            district,
            documentFilename,
            documentSource,
            enemyAbd,
            enemyDet,
            enemyKia,
            eventDescription,
            eventEnd,
            eventStart,
            eventType,
            filesize,
            friendlyAbd,
            friendlyDet,
            friendlyKia,
            friendlyWound,
            goldstein,
            hasAttachment,
            hostNatAbd,
            hostNatDet,
            hostNatKia,
            hostNatWound,
            idNumber,
            lat,
            lon,
            milgrid,
            notes,
            numArticles,
            numMentions,
            numSources,
            origin,
            origNetwork,
            province,
            relatedDocs,
            repUnit,
            repUnitActivity,
            repUnitType,
            sideAAbd,
            sideADet,
            sideAkia,
            sideAWound,
            sideBAbd,
            sideBDet,
            sideBkia,
            sideBWound,
            sourceLanguage,
            sourceUrl,
            summary,
            target,
            theater,
            typeOfAttack,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HistoryListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, reportDate=$reportDate, source=$source, id=$id, accuracy=$accuracy, actors=$actors, agjson=$agjson, andims=$andims, area=$area, asrid=$asrid, atext=$atext, atype=$atype, avgTone=$avgTone, cameoBaseCode=$cameoBaseCode, cameoCode=$cameoCode, cameoRootCode=$cameoRootCode, checksumValue=$checksumValue, city=$city, civAbd=$civAbd, civDet=$civDet, civKia=$civKia, civWound=$civWound, clarity=$clarity, coalAbd=$coalAbd, coalDet=$coalDet, coalKia=$coalKia, coalWound=$coalWound, complexAttack=$complexAttack, confidence=$confidence, countryCode=$countryCode, createdAt=$createdAt, createdBy=$createdBy, district=$district, documentFilename=$documentFilename, documentSource=$documentSource, enemyAbd=$enemyAbd, enemyDet=$enemyDet, enemyKia=$enemyKia, eventDescription=$eventDescription, eventEnd=$eventEnd, eventStart=$eventStart, eventType=$eventType, filesize=$filesize, friendlyAbd=$friendlyAbd, friendlyDet=$friendlyDet, friendlyKia=$friendlyKia, friendlyWound=$friendlyWound, goldstein=$goldstein, hasAttachment=$hasAttachment, hostNatAbd=$hostNatAbd, hostNatDet=$hostNatDet, hostNatKia=$hostNatKia, hostNatWound=$hostNatWound, idNumber=$idNumber, lat=$lat, lon=$lon, milgrid=$milgrid, notes=$notes, numArticles=$numArticles, numMentions=$numMentions, numSources=$numSources, origin=$origin, origNetwork=$origNetwork, province=$province, relatedDocs=$relatedDocs, repUnit=$repUnit, repUnitActivity=$repUnitActivity, repUnitType=$repUnitType, sideAAbd=$sideAAbd, sideADet=$sideADet, sideAkia=$sideAkia, sideAWound=$sideAWound, sideBAbd=$sideBAbd, sideBDet=$sideBDet, sideBkia=$sideBkia, sideBWound=$sideBWound, sourceLanguage=$sourceLanguage, sourceUrl=$sourceUrl, summary=$summary, target=$target, theater=$theater, typeOfAttack=$typeOfAttack, additionalProperties=$additionalProperties}"
}

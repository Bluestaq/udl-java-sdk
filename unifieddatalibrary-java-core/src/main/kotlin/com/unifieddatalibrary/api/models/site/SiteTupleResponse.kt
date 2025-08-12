// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.site

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
import com.unifieddatalibrary.api.models.DailyOperationFull
import com.unifieddatalibrary.api.models.EntityFull
import com.unifieddatalibrary.api.models.MaximumOnGroundFull
import com.unifieddatalibrary.api.models.OperationalDeviationFull
import com.unifieddatalibrary.api.models.OperationalPlanningFull
import com.unifieddatalibrary.api.models.PathwayFull
import com.unifieddatalibrary.api.models.WaiverFull
import com.unifieddatalibrary.api.models.site.SiteTupleResponse
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Properties and characteristics of a site entity, such as an airbase, airfield, naval station, etc. */
class SiteTupleResponse private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val name: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val activity: JsonField<String>,
    private val airDefArea: JsonField<String>,
    private val allegiance: JsonField<String>,
    private val altAllegiance: JsonField<String>,
    private val beNumber: JsonField<String>,
    private val catCode: JsonField<String>,
    private val catText: JsonField<String>,
    private val classRating: JsonField<String>,
    private val condition: JsonField<String>,
    private val conditionAvail: JsonField<String>,
    private val coord: JsonField<String>,
    private val coordDatum: JsonField<String>,
    private val coordDerivAcc: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val elevMsl: JsonField<Double>,
    private val elevMslConfLvl: JsonField<Int>,
    private val elevMslDerivAcc: JsonField<Double>,
    private val entity: JsonField<EntityFull>,
    private val eval: JsonField<Int>,
    private val faa: JsonField<String>,
    private val fpa: JsonField<String>,
    private val functPrimary: JsonField<String>,
    private val geoArea: JsonField<String>,
    private val geoidalMslSep: JsonField<Double>,
    private val grade: JsonField<Int>,
    private val iata: JsonField<String>,
    private val icao: JsonField<String>,
    private val ident: JsonField<String>,
    private val idEntity: JsonField<String>,
    private val idParentSite: JsonField<String>,
    private val lzUsage: JsonField<String>,
    private val maxRunwayLength: JsonField<Int>,
    private val milGrid: JsonField<String>,
    private val milGridSys: JsonField<String>,
    private val msnPrimary: JsonField<String>,
    private val msnPrimarySpec: JsonField<String>,
    private val notes: JsonField<String>,
    private val nucCap: JsonField<String>,
    private val operStatus: JsonField<String>,
    private val origin: JsonField<String>,
    private val origLzId: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origSiteId: JsonField<String>,
    private val osuffix: JsonField<String>,
    private val pin: JsonField<String>,
    private val polSubdiv: JsonField<String>,
    private val popArea: JsonField<Boolean>,
    private val popAreaProx: JsonField<Double>,
    private val recStatus: JsonField<String>,
    private val referenceDoc: JsonField<String>,
    private val resProd: JsonField<String>,
    private val reviewDate: JsonField<LocalDate>,
    private val runways: JsonField<Long>,
    private val siteOperations: JsonField<List<SiteOperation>>,
    private val siteRemarks: JsonField<List<SiteRemark>>,
    private val symCode: JsonField<String>,
    private val type: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val usage: JsonField<String>,
    private val utm: JsonField<String>,
    private val vegHt: JsonField<Double>,
    private val vegType: JsonField<String>,
    private val wac: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking") @ExcludeMissing classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("activity") @ExcludeMissing activity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("airDefArea") @ExcludeMissing airDefArea: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allegiance") @ExcludeMissing allegiance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altAllegiance") @ExcludeMissing altAllegiance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beNumber") @ExcludeMissing beNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("catCode") @ExcludeMissing catCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("catText") @ExcludeMissing catText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("classRating") @ExcludeMissing classRating: JsonField<String> = JsonMissing.of(),
        @JsonProperty("condition") @ExcludeMissing condition: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conditionAvail") @ExcludeMissing conditionAvail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("coord") @ExcludeMissing coord: JsonField<String> = JsonMissing.of(),
        @JsonProperty("coordDatum") @ExcludeMissing coordDatum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("coordDerivAcc") @ExcludeMissing coordDerivAcc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("elevMsl") @ExcludeMissing elevMsl: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elevMslConfLvl") @ExcludeMissing elevMslConfLvl: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("elevMslDerivAcc") @ExcludeMissing elevMslDerivAcc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("entity") @ExcludeMissing entity: JsonField<EntityFull> = JsonMissing.of(),
        @JsonProperty("eval") @ExcludeMissing eval: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("faa") @ExcludeMissing faa: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fpa") @ExcludeMissing fpa: JsonField<String> = JsonMissing.of(),
        @JsonProperty("functPrimary") @ExcludeMissing functPrimary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("geoArea") @ExcludeMissing geoArea: JsonField<String> = JsonMissing.of(),
        @JsonProperty("geoidalMslSep") @ExcludeMissing geoidalMslSep: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("grade") @ExcludeMissing grade: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("iata") @ExcludeMissing iata: JsonField<String> = JsonMissing.of(),
        @JsonProperty("icao") @ExcludeMissing icao: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ident") @ExcludeMissing ident: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idEntity") @ExcludeMissing idEntity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idParentSite") @ExcludeMissing idParentSite: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lzUsage") @ExcludeMissing lzUsage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxRunwayLength") @ExcludeMissing maxRunwayLength: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("milGrid") @ExcludeMissing milGrid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("milGridSys") @ExcludeMissing milGridSys: JsonField<String> = JsonMissing.of(),
        @JsonProperty("msnPrimary") @ExcludeMissing msnPrimary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("msnPrimarySpec") @ExcludeMissing msnPrimarySpec: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nucCap") @ExcludeMissing nucCap: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operStatus") @ExcludeMissing operStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origLzId") @ExcludeMissing origLzId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork") @ExcludeMissing origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origSiteID") @ExcludeMissing origSiteId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("osuffix") @ExcludeMissing osuffix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pin") @ExcludeMissing pin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("polSubdiv") @ExcludeMissing polSubdiv: JsonField<String> = JsonMissing.of(),
        @JsonProperty("popArea") @ExcludeMissing popArea: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("popAreaProx") @ExcludeMissing popAreaProx: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("recStatus") @ExcludeMissing recStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referenceDoc") @ExcludeMissing referenceDoc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resProd") @ExcludeMissing resProd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reviewDate") @ExcludeMissing reviewDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("runways") @ExcludeMissing runways: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("siteOperations") @ExcludeMissing siteOperations: JsonField<List<SiteOperation>> = JsonMissing.of(),
        @JsonProperty("siteRemarks") @ExcludeMissing siteRemarks: JsonField<List<SiteRemark>> = JsonMissing.of(),
        @JsonProperty("symCode") @ExcludeMissing symCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("utm") @ExcludeMissing utm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vegHt") @ExcludeMissing vegHt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("vegType") @ExcludeMissing vegType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wac") @ExcludeMissing wac: JsonField<String> = JsonMissing.of()
    ) : this(
      classificationMarking,
      dataMode,
      name,
      source,
      id,
      activity,
      airDefArea,
      allegiance,
      altAllegiance,
      beNumber,
      catCode,
      catText,
      classRating,
      condition,
      conditionAvail,
      coord,
      coordDatum,
      coordDerivAcc,
      createdAt,
      createdBy,
      elevMsl,
      elevMslConfLvl,
      elevMslDerivAcc,
      entity,
      eval,
      faa,
      fpa,
      functPrimary,
      geoArea,
      geoidalMslSep,
      grade,
      iata,
      icao,
      ident,
      idEntity,
      idParentSite,
      lzUsage,
      maxRunwayLength,
      milGrid,
      milGridSys,
      msnPrimary,
      msnPrimarySpec,
      notes,
      nucCap,
      operStatus,
      origin,
      origLzId,
      origNetwork,
      origSiteId,
      osuffix,
      pin,
      polSubdiv,
      popArea,
      popAreaProx,
      recStatus,
      referenceDoc,
      resProd,
      reviewDate,
      runways,
      siteOperations,
      siteRemarks,
      symCode,
      type,
      updatedAt,
      updatedBy,
      usage,
      utm,
      vegHt,
      vegType,
      wac,
      mutableMapOf(),
    )

    /**
     * Classification marking of the data in IC/CAPCO Portion-marked format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

    /**
     * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * The name of this site.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Indicates the function or mission of an entity, which that entity may or may not be engaged in at any particular time. Typically refers to a unit, organization, or installation/site performing a specific function or mission such as a redistribution center or naval shipyard. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun activity(): Optional<String> = activity.getOptional("activity")

    /**
     * Air Defense District (ADD) or Air Defense Area (ADA) in which the geographic coordinates reside.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun airDefArea(): Optional<String> = airDefArea.getOptional("airDefArea")

    /**
     * The DoD Standard Country Code designator for the country or political entity to which the site owes its allegiance. This field will be set to "OTHR" if the source value does not match a UDL Country code value (ISO-3166-ALPHA-2).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun allegiance(): Optional<String> = allegiance.getOptional("allegiance")

    /**
     * Specifies an alternate allegiance code if the data provider code is not part of an official Country Code standard such as ISO-3166 or FIPS. This field will be set to the value provided by the source and should be used for all Queries specifying allegiance.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun altAllegiance(): Optional<String> = altAllegiance.getOptional("altAllegiance")

    /**
     * The Basic Encyclopedia Number associated with the Site. Uniquely identifies the installation of a site. The beNumber is generated based on the value input for the COORD to determine the appropriate World Aeronautical Chart (WAC) location identifier, the system assigned record originator and a one-up-number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun beNumber(): Optional<String> = beNumber.getOptional("beNumber")

    /**
     * The category code that represents the associated site purpose within the target system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun catCode(): Optional<String> = catCode.getOptional("catCode")

    /**
     * Textual Description of Site catCode.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun catText(): Optional<String> = catText.getOptional("catText")

    /**
     * Indicates the importance of the entity to the OES or MIR system. This data element is restricted to update by DIA (DB-4). Valid values are:
     *
     * 0 - Does not meet criteria above
     *
     * 1 - Primary importance to system
     *
     * 2 - Secondary importance to system
     *
     * 3 - Tertiary importance to system
     *
     * O - Other. Explain in Remarks.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun classRating(): Optional<String> = classRating.getOptional("classRating")

    /**
     * The physical manner of being or state of existence of the entity. A physical condition that must be considered in the determining of a course of action. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun condition(): Optional<String> = condition.getOptional("condition")

    /**
     * Availability of the entity relative to its condition. Indicates the reason the entity is not fully operational. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun conditionAvail(): Optional<String> = conditionAvail.getOptional("conditionAvail")

    /**
     * Indicates any of the magnitudes that serve to define the position of a point by reference to a fixed figure, system of lines, etc.
     *
     * Pos. 1-2. Latitude Degrees [00-90]
     *
     * Pos. 3-4. Latitude Minutes [00-59]
     *
     * Pos. 5-6. Latitude Seconds [00-59]
     *
     * Pos. 7-9. Latitude Thousandths Of Seconds [000-999]
     *
     * Pos. 10. Latitude Hemisphere [NS]
     *
     * Pos. 11-13. Longitude Degrees [00-180]
     *
     * Pos. 14-15. Longitude Minutes [00-59]
     *
     * Pos. 16-17. Longitude Seconds [00-59]
     *
     * Pos. 18-20. Longitude Thousandths Of Seconds [000-999]
     *
     * Pos. 21. Longitude Hemisphere [EW]
     *
     * Pos. 1-21. Unknown Latitude and Unknown Longitude [000000000U000000000U].
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun coord(): Optional<String> = coord.getOptional("coord")

    /**
     * A mathematical model of the earth used to calculate coordinates on a map. US Forces use the World Geodetic System 1984 (WGS 84), but also use maps by allied countries with local datums. The datum must be specified to ensure accuracy of coordinates. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun coordDatum(): Optional<String> = coordDatum.getOptional("coordDatum")

    /**
     * Indicates the plus or minus error assessed against the method used to derive the coordinate.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun coordDerivAcc(): Optional<Double> = coordDerivAcc.getOptional("coordDerivAcc")

    /**
     * Time the row was created in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Application user who created the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * Ground elevation of the geographic coordinates referenced to (above or below) Mean Sea Level (MSL) vertical datum, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun elevMsl(): Optional<Double> = elevMsl.getOptional("elevMsl")

    /**
     * Indicates the confidence level expressed as a percent that a specific geometric spatial element, ELEVATION_MSL linear accuracy, has been vertically positioned to within a specified vertical accuracy.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun elevMslConfLvl(): Optional<Int> = elevMslConfLvl.getOptional("elevMslConfLvl")

    /**
     * Indicates the plus or minus error assessed against the method used to derive the elevation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun elevMslDerivAcc(): Optional<Double> = elevMslDerivAcc.getOptional("elevMslDerivAcc")

    /**
     * An entity is a generic representation of any object within a space/SSA system such as sensors, on-orbit objects, RF Emitters, space craft buses, etc. An entity can have an operating unit, a location (if terrestrial), and statuses.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun entity(): Optional<EntityFull> = entity.getOptional("entity")

    /**
     * Eval represents the Intelligence Confidence Level or the Reliability/degree of confidence that the analyst has assigned to the data within this record. The numerical range is from 1 to 9 with 1 representing the highest confidence level.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun eval(): Optional<Int> = eval.getOptional("eval")

    /**
     * The Federal Aviation Administration (FAA) Location ID of this site, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun faa(): Optional<String> = faa.getOptional("faa")

    /**
     * Functional Production Area (FPA) under the Shared Production Program (SPP). Producers are defined per country per FPA. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun fpa(): Optional<String> = fpa.getOptional("fpa")

    /**
     * Principal operational function being performed. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun functPrimary(): Optional<String> = functPrimary.getOptional("functPrimary")

    /**
     * Geographical region code used by the Requirements Management System (RMS) as specified by National Geospatial Agency (NGA) in Flight Information Publications (FIPS) 10-4, Appendix 3 - Country Code and Geographic Region Codes. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun geoArea(): Optional<String> = geoArea.getOptional("geoArea")

    /**
     * The distance between Mean Sea Level and a referenced ellipsoid, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun geoidalMslSep(): Optional<Double> = geoidalMslSep.getOptional("geoidalMslSep")

    /**
     * Indicates the amount or degree of deviation from the horizontal represented as a percent. Grade is determined by the formula: vertical distance (VD) divided by horizontal distance (HD) times 100. VD is the difference between the highest and lowest elevation within the entity. HD is the linear distance between the highest and lowest elevation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun grade(): Optional<Int> = grade.getOptional("grade")

    /**
     * The International Air Transport Association (IATA) code of this site, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun iata(): Optional<String> = iata.getOptional("iata")

    /**
     * The International Civil Aviation Organization (ICAO) code of this site, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun icao(): Optional<String> = icao.getOptional("icao")

    /**
     * Estimated identity of the Site (ASSUMED FRIEND, FRIEND, HOSTILE, FAKER, JOKER, NEUTRAL, PENDING, SUSPECT, UNKNOWN):
     *
     * ASSUMED FRIEND: Track assumed to be a friend due to the object characteristics, behavior, and/or origin.
     *
     * FRIEND: Track object supporting friendly forces and belonging to a declared friendly nation or entity.
     *
     * HOSTILE: Track object belonging to an opposing nation, party, group, or entity deemed to contribute to a threat to friendly forces or their mission due to its behavior, characteristics, nationality, or origin.
     *
     * FAKER: Friendly track, object, or entity acting as an exercise hostile.
     *
     * JOKER: Friendly track, object, or entity acting as an exercise suspect.
     *
     * NEUTRAL: Track object whose characteristics, behavior, nationality, and/or origin indicate that it is neither supporting nor opposing friendly forces or their mission.
     *
     * PENDING: Track object which has not been evaluated.
     *
     * SUSPECT: Track object deemed potentially hostile due to the object characteristics, behavior, nationality, and/or origin.
     *
     * UNKNOWN: Track object which has been evaluated and does not meet criteria for any standard identity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun ident(): Optional<String> = ident.getOptional("ident")

    /**
     * Unique identifier of the parent entity. idEntity is required for Put.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun idEntity(): Optional<String> = idEntity.getOptional("idEntity")

    /**
     * Unique identifier of the Parent Site record associated with this Site record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun idParentSite(): Optional<String> = idParentSite.getOptional("idParentSite")

    /**
     * Indicates the normal usage of the Landing Zone (LZ). Intended as, but not constrained to MIDB Helocopter Landing Area usage value definitions:
     *
     * AF - Airfield
     *
     * FD - Field
     *
     * HC - High Crop. 1 meter and over.
     *
     * HY - Highway
     *
     * LB - Lake Bed
     *
     * LC - Low Crop. 0-1 meters
     *
     * O - Other. Explain In Remarks.
     *
     * PD - Paddy
     *
     * PK - Park
     *
     * PS - Pasture
     *
     * RB - Riverbed
     *
     * SP - Sport Field
     *
     * U - Unknown
     *
     * Z - Inconclusive Analysis.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun lzUsage(): Optional<String> = lzUsage.getOptional("lzUsage")

    /**
     * The length of the longest runway at this site, if applicable, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun maxRunwayLength(): Optional<Int> = maxRunwayLength.getOptional("maxRunwayLength")

    /**
     * The Military Grid Reference System is the geocoordinate standard used by NATO militaries for locating points on Earth. The MGRS is derived from the Universal Transverse Mercator (UTM) grid system and the Universal Polar Stereographic (UPS) grid system, but uses a different labeling convention. The MGRS is used as geocode for the entire Earth. Example of an milgrid coordinate, or grid reference, would be 4QFJ12345678, which consists of three parts:
     *
     * 4Q (grid zone designator, GZD)
     *
     * FJ (the 100,000-meter square identifier)
     *
     * 12345678 (numerical location; easting is 1234 and northing is 5678, in this case specifying a location with 10 m resolution).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun milGrid(): Optional<String> = milGrid.getOptional("milGrid")

    /**
     * Indicates the grid system used in the development of the milGrid coordinates. Values are:
     *
     * UPS - Universal Polar System
     *
     * UTM - Universal Transverse Mercator.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun milGridSys(): Optional<String> = milGridSys.getOptional("milGridSys")

    /**
     * Indicates the principal type of mission that an entity is organized and equipped to perform. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun msnPrimary(): Optional<String> = msnPrimary.getOptional("msnPrimary")

    /**
     * Indicates the principal specialty type of mission that an entity is organized and equipped to perform. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun msnPrimarySpec(): Optional<String> = msnPrimarySpec.getOptional("msnPrimarySpec")

    /**
     * Optional notes/comments for the site.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * A sites ability to conduct nuclear warfare. Valid Values are:
     *
     * A - Nuclear Ammo Or Warheads Available
     *
     * N - No Nuclear Offense
     *
     * O - Other. Explain in Remarks
     *
     * U - Unknown
     *
     * W - Nuclear Weapons Available
     *
     * Y - Nuclear Warfare Offensive Capability
     *
     * Z - Inconclusive Analysis.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun nucCap(): Optional<String> = nucCap.getOptional("nucCap")

    /**
     * The Degree to which an entity is ready to perform the overall operational mission(s) for which it was organized and equipped. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun operStatus(): Optional<String> = operStatus.getOptional("operStatus")

    /**
     * Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun origin(): Optional<String> = origin.getOptional("origin")

    /**
     * Unique identifier of the LZ record from the originating system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun origLzId(): Optional<String> = origLzId.getOptional("origLzId")

    /**
     * The originating source network on which this record was created, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

    /**
     * Unique identifier of the Site record from the originating system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun origSiteId(): Optional<String> = origSiteId.getOptional("origSiteID")

    /**
     * The O-suffix associated with this site. The O-suffix is a five-character alpha/numeric system used to identify a site, or demographic area, within an installation. The Installation Basic Encyclopedia (beNumber), in conjunction with the O-suffix, uniquely identifies the Site. The Installation beNumber and oSuffix are also used in conjunction with the catCode to classify the function or purpose of the facility.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun osuffix(): Optional<String> = osuffix.getOptional("osuffix")

    /**
     * Site number of a specific electronic site or its associated equipment.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun pin(): Optional<String> = pin.getOptional("pin")

    /**
     * Political subdivision in which the geographic coordinates reside. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun polSubdiv(): Optional<String> = polSubdiv.getOptional("polSubdiv")

    /**
     * Indicates whether the facility is in or outside of a populated area. True, the facility is in or within 5 NM of a populated area. False, the facility is outside a populated area.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun popArea(): Optional<Boolean> = popArea.getOptional("popArea")

    /**
     * Indicates the distance to nearest populated area (over 1,000 people) in nautical miles.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun popAreaProx(): Optional<Double> = popAreaProx.getOptional("popAreaProx")

    /**
     * Validity and currency of the data in the record to be used in conjunction with the other elements in the record as defined by SOPs.
     *
     * A - Active
     *
     * I - Inactive
     *
     * K - Acknowledged
     *
     * L - Local
     *
     * Q - A nominated (NOM) or Data Change Request (DCR) record
     *
     * R - Production reduced by CMD decision
     *
     * W - Working Record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun recStatus(): Optional<String> = recStatus.getOptional("recStatus")

    /**
     * The reference documentation that specifies the usage and enumerations contained in this record. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun referenceDoc(): Optional<String> = referenceDoc.getOptional("referenceDoc")

    /**
     * Responsible Producer - Organization that is responsible for the maintenance of the record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun resProd(): Optional<String> = resProd.getOptional("resProd")

    /**
     * Date on which the data in the record was last reviewed by the responsible analyst for accuracy and currency, in ISO8601 UTC format. This date cannot be greater than the current date.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun reviewDate(): Optional<LocalDate> = reviewDate.getOptional("reviewDate")

    /**
     * The number of runways at the site, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun runways(): Optional<Long> = runways.getOptional("runways")

    /** @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
    fun siteOperations(): Optional<List<SiteOperation>> = siteOperations.getOptional("siteOperations")

    /**
     * Remarks contain amplifying information for a specific service. The information may contain context and interpretations for consumer use.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun siteRemarks(): Optional<List<SiteRemark>> = siteRemarks.getOptional("siteRemarks")

    /**
     * A standard scheme for symbol coding enabling the transfer, display and use of symbols and graphics among information systems, as per MIL-STD 2525B, and supported by the element ident.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun symCode(): Optional<String> = symCode.getOptional("symCode")

    /**
     * The type of this site (AIRBASE, AIRFIELD, AIRPORT, NAVAL STATION, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Time the row was updated in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Application user who updated the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

    /**
     * The use authorization type of this site (e.g MILITARY, CIVIL, JOINT-USE, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun usage(): Optional<String> = usage.getOptional("usage")

    /**
     * Universal Transverse Mercator (UTM) grid coordinates.
     *
     * Pos. 1-2, UTM Zone Column [01-60
     *
     * Pos. 3, UTM Zone Row [C-HJ-NP-X]
     *
     * Pos. 4, UTM False Easting [0-9]
     *
     * Pos. 5-9, UTM Meter Easting [0-9][0-9][0-9][0-9][0-9]
     *
     * Pos. 10-11, UTM False Northing [0-9][0-9]
     *
     * Pos. 12-16, UTM Meter Northing [0-9][0-9][0-9][0-9][0-9].
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun utm(): Optional<String> = utm.getOptional("utm")

    /**
     * Maximum expected height of the vegetation in the Landing Zone (LZ), in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun vegHt(): Optional<Double> = vegHt.getOptional("vegHt")

    /**
     * The predominant vegetation found in the Landing Zone (LZ). The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun vegType(): Optional<String> = vegType.getOptional("vegType")

    /**
     * World Aeronautical Chart identifier for the area in which a designated place is located.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun wac(): Optional<String> = wac.getOptional("wac")

    /**
     * Returns the raw JSON value of [classificationMarking].
     *
     * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("classificationMarking")
    @ExcludeMissing
    fun _classificationMarking(): JsonField<String> = classificationMarking

    /**
     * Returns the raw JSON value of [dataMode].
     *
     * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataMode")
    @ExcludeMissing
    fun _dataMode(): JsonField<DataMode> = dataMode

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name")
    @ExcludeMissing
    fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source")
    @ExcludeMissing
    fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [activity].
     *
     * Unlike [activity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activity")
    @ExcludeMissing
    fun _activity(): JsonField<String> = activity

    /**
     * Returns the raw JSON value of [airDefArea].
     *
     * Unlike [airDefArea], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("airDefArea")
    @ExcludeMissing
    fun _airDefArea(): JsonField<String> = airDefArea

    /**
     * Returns the raw JSON value of [allegiance].
     *
     * Unlike [allegiance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allegiance")
    @ExcludeMissing
    fun _allegiance(): JsonField<String> = allegiance

    /**
     * Returns the raw JSON value of [altAllegiance].
     *
     * Unlike [altAllegiance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altAllegiance")
    @ExcludeMissing
    fun _altAllegiance(): JsonField<String> = altAllegiance

    /**
     * Returns the raw JSON value of [beNumber].
     *
     * Unlike [beNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beNumber")
    @ExcludeMissing
    fun _beNumber(): JsonField<String> = beNumber

    /**
     * Returns the raw JSON value of [catCode].
     *
     * Unlike [catCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("catCode")
    @ExcludeMissing
    fun _catCode(): JsonField<String> = catCode

    /**
     * Returns the raw JSON value of [catText].
     *
     * Unlike [catText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("catText")
    @ExcludeMissing
    fun _catText(): JsonField<String> = catText

    /**
     * Returns the raw JSON value of [classRating].
     *
     * Unlike [classRating], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("classRating")
    @ExcludeMissing
    fun _classRating(): JsonField<String> = classRating

    /**
     * Returns the raw JSON value of [condition].
     *
     * Unlike [condition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("condition")
    @ExcludeMissing
    fun _condition(): JsonField<String> = condition

    /**
     * Returns the raw JSON value of [conditionAvail].
     *
     * Unlike [conditionAvail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conditionAvail")
    @ExcludeMissing
    fun _conditionAvail(): JsonField<String> = conditionAvail

    /**
     * Returns the raw JSON value of [coord].
     *
     * Unlike [coord], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coord")
    @ExcludeMissing
    fun _coord(): JsonField<String> = coord

    /**
     * Returns the raw JSON value of [coordDatum].
     *
     * Unlike [coordDatum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coordDatum")
    @ExcludeMissing
    fun _coordDatum(): JsonField<String> = coordDatum

    /**
     * Returns the raw JSON value of [coordDerivAcc].
     *
     * Unlike [coordDerivAcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coordDerivAcc")
    @ExcludeMissing
    fun _coordDerivAcc(): JsonField<Double> = coordDerivAcc

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
    @JsonProperty("createdBy")
    @ExcludeMissing
    fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [elevMsl].
     *
     * Unlike [elevMsl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elevMsl")
    @ExcludeMissing
    fun _elevMsl(): JsonField<Double> = elevMsl

    /**
     * Returns the raw JSON value of [elevMslConfLvl].
     *
     * Unlike [elevMslConfLvl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elevMslConfLvl")
    @ExcludeMissing
    fun _elevMslConfLvl(): JsonField<Int> = elevMslConfLvl

    /**
     * Returns the raw JSON value of [elevMslDerivAcc].
     *
     * Unlike [elevMslDerivAcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elevMslDerivAcc")
    @ExcludeMissing
    fun _elevMslDerivAcc(): JsonField<Double> = elevMslDerivAcc

    /**
     * Returns the raw JSON value of [entity].
     *
     * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity")
    @ExcludeMissing
    fun _entity(): JsonField<EntityFull> = entity

    /**
     * Returns the raw JSON value of [eval].
     *
     * Unlike [eval], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eval")
    @ExcludeMissing
    fun _eval(): JsonField<Int> = eval

    /**
     * Returns the raw JSON value of [faa].
     *
     * Unlike [faa], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("faa")
    @ExcludeMissing
    fun _faa(): JsonField<String> = faa

    /**
     * Returns the raw JSON value of [fpa].
     *
     * Unlike [fpa], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fpa")
    @ExcludeMissing
    fun _fpa(): JsonField<String> = fpa

    /**
     * Returns the raw JSON value of [functPrimary].
     *
     * Unlike [functPrimary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("functPrimary")
    @ExcludeMissing
    fun _functPrimary(): JsonField<String> = functPrimary

    /**
     * Returns the raw JSON value of [geoArea].
     *
     * Unlike [geoArea], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoArea")
    @ExcludeMissing
    fun _geoArea(): JsonField<String> = geoArea

    /**
     * Returns the raw JSON value of [geoidalMslSep].
     *
     * Unlike [geoidalMslSep], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoidalMslSep")
    @ExcludeMissing
    fun _geoidalMslSep(): JsonField<Double> = geoidalMslSep

    /**
     * Returns the raw JSON value of [grade].
     *
     * Unlike [grade], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grade")
    @ExcludeMissing
    fun _grade(): JsonField<Int> = grade

    /**
     * Returns the raw JSON value of [iata].
     *
     * Unlike [iata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iata")
    @ExcludeMissing
    fun _iata(): JsonField<String> = iata

    /**
     * Returns the raw JSON value of [icao].
     *
     * Unlike [icao], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("icao")
    @ExcludeMissing
    fun _icao(): JsonField<String> = icao

    /**
     * Returns the raw JSON value of [ident].
     *
     * Unlike [ident], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ident")
    @ExcludeMissing
    fun _ident(): JsonField<String> = ident

    /**
     * Returns the raw JSON value of [idEntity].
     *
     * Unlike [idEntity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idEntity")
    @ExcludeMissing
    fun _idEntity(): JsonField<String> = idEntity

    /**
     * Returns the raw JSON value of [idParentSite].
     *
     * Unlike [idParentSite], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idParentSite")
    @ExcludeMissing
    fun _idParentSite(): JsonField<String> = idParentSite

    /**
     * Returns the raw JSON value of [lzUsage].
     *
     * Unlike [lzUsage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lzUsage")
    @ExcludeMissing
    fun _lzUsage(): JsonField<String> = lzUsage

    /**
     * Returns the raw JSON value of [maxRunwayLength].
     *
     * Unlike [maxRunwayLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxRunwayLength")
    @ExcludeMissing
    fun _maxRunwayLength(): JsonField<Int> = maxRunwayLength

    /**
     * Returns the raw JSON value of [milGrid].
     *
     * Unlike [milGrid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("milGrid")
    @ExcludeMissing
    fun _milGrid(): JsonField<String> = milGrid

    /**
     * Returns the raw JSON value of [milGridSys].
     *
     * Unlike [milGridSys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("milGridSys")
    @ExcludeMissing
    fun _milGridSys(): JsonField<String> = milGridSys

    /**
     * Returns the raw JSON value of [msnPrimary].
     *
     * Unlike [msnPrimary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msnPrimary")
    @ExcludeMissing
    fun _msnPrimary(): JsonField<String> = msnPrimary

    /**
     * Returns the raw JSON value of [msnPrimarySpec].
     *
     * Unlike [msnPrimarySpec], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msnPrimarySpec")
    @ExcludeMissing
    fun _msnPrimarySpec(): JsonField<String> = msnPrimarySpec

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes")
    @ExcludeMissing
    fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [nucCap].
     *
     * Unlike [nucCap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nucCap")
    @ExcludeMissing
    fun _nucCap(): JsonField<String> = nucCap

    /**
     * Returns the raw JSON value of [operStatus].
     *
     * Unlike [operStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operStatus")
    @ExcludeMissing
    fun _operStatus(): JsonField<String> = operStatus

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin")
    @ExcludeMissing
    fun _origin(): JsonField<String> = origin

    /**
     * Returns the raw JSON value of [origLzId].
     *
     * Unlike [origLzId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origLzId")
    @ExcludeMissing
    fun _origLzId(): JsonField<String> = origLzId

    /**
     * Returns the raw JSON value of [origNetwork].
     *
     * Unlike [origNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origNetwork")
    @ExcludeMissing
    fun _origNetwork(): JsonField<String> = origNetwork

    /**
     * Returns the raw JSON value of [origSiteId].
     *
     * Unlike [origSiteId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origSiteID")
    @ExcludeMissing
    fun _origSiteId(): JsonField<String> = origSiteId

    /**
     * Returns the raw JSON value of [osuffix].
     *
     * Unlike [osuffix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("osuffix")
    @ExcludeMissing
    fun _osuffix(): JsonField<String> = osuffix

    /**
     * Returns the raw JSON value of [pin].
     *
     * Unlike [pin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pin")
    @ExcludeMissing
    fun _pin(): JsonField<String> = pin

    /**
     * Returns the raw JSON value of [polSubdiv].
     *
     * Unlike [polSubdiv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polSubdiv")
    @ExcludeMissing
    fun _polSubdiv(): JsonField<String> = polSubdiv

    /**
     * Returns the raw JSON value of [popArea].
     *
     * Unlike [popArea], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("popArea")
    @ExcludeMissing
    fun _popArea(): JsonField<Boolean> = popArea

    /**
     * Returns the raw JSON value of [popAreaProx].
     *
     * Unlike [popAreaProx], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("popAreaProx")
    @ExcludeMissing
    fun _popAreaProx(): JsonField<Double> = popAreaProx

    /**
     * Returns the raw JSON value of [recStatus].
     *
     * Unlike [recStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recStatus")
    @ExcludeMissing
    fun _recStatus(): JsonField<String> = recStatus

    /**
     * Returns the raw JSON value of [referenceDoc].
     *
     * Unlike [referenceDoc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referenceDoc")
    @ExcludeMissing
    fun _referenceDoc(): JsonField<String> = referenceDoc

    /**
     * Returns the raw JSON value of [resProd].
     *
     * Unlike [resProd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resProd")
    @ExcludeMissing
    fun _resProd(): JsonField<String> = resProd

    /**
     * Returns the raw JSON value of [reviewDate].
     *
     * Unlike [reviewDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reviewDate")
    @ExcludeMissing
    fun _reviewDate(): JsonField<LocalDate> = reviewDate

    /**
     * Returns the raw JSON value of [runways].
     *
     * Unlike [runways], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runways")
    @ExcludeMissing
    fun _runways(): JsonField<Long> = runways

    /**
     * Returns the raw JSON value of [siteOperations].
     *
     * Unlike [siteOperations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("siteOperations")
    @ExcludeMissing
    fun _siteOperations(): JsonField<List<SiteOperation>> = siteOperations

    /**
     * Returns the raw JSON value of [siteRemarks].
     *
     * Unlike [siteRemarks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("siteRemarks")
    @ExcludeMissing
    fun _siteRemarks(): JsonField<List<SiteRemark>> = siteRemarks

    /**
     * Returns the raw JSON value of [symCode].
     *
     * Unlike [symCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symCode")
    @ExcludeMissing
    fun _symCode(): JsonField<String> = symCode

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type(): JsonField<String> = type

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
    @JsonProperty("updatedBy")
    @ExcludeMissing
    fun _updatedBy(): JsonField<String> = updatedBy

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage")
    @ExcludeMissing
    fun _usage(): JsonField<String> = usage

    /**
     * Returns the raw JSON value of [utm].
     *
     * Unlike [utm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("utm")
    @ExcludeMissing
    fun _utm(): JsonField<String> = utm

    /**
     * Returns the raw JSON value of [vegHt].
     *
     * Unlike [vegHt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vegHt")
    @ExcludeMissing
    fun _vegHt(): JsonField<Double> = vegHt

    /**
     * Returns the raw JSON value of [vegType].
     *
     * Unlike [vegType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vegType")
    @ExcludeMissing
    fun _vegType(): JsonField<String> = vegType

    /**
     * Returns the raw JSON value of [wac].
     *
     * Unlike [wac], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wac")
    @ExcludeMissing
    fun _wac(): JsonField<String> = wac

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
      additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SiteTupleResponse].
         *
         * The following fields are required:
         *
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .source()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [SiteTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var name: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var activity: JsonField<String> = JsonMissing.of()
        private var airDefArea: JsonField<String> = JsonMissing.of()
        private var allegiance: JsonField<String> = JsonMissing.of()
        private var altAllegiance: JsonField<String> = JsonMissing.of()
        private var beNumber: JsonField<String> = JsonMissing.of()
        private var catCode: JsonField<String> = JsonMissing.of()
        private var catText: JsonField<String> = JsonMissing.of()
        private var classRating: JsonField<String> = JsonMissing.of()
        private var condition: JsonField<String> = JsonMissing.of()
        private var conditionAvail: JsonField<String> = JsonMissing.of()
        private var coord: JsonField<String> = JsonMissing.of()
        private var coordDatum: JsonField<String> = JsonMissing.of()
        private var coordDerivAcc: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var elevMsl: JsonField<Double> = JsonMissing.of()
        private var elevMslConfLvl: JsonField<Int> = JsonMissing.of()
        private var elevMslDerivAcc: JsonField<Double> = JsonMissing.of()
        private var entity: JsonField<EntityFull> = JsonMissing.of()
        private var eval: JsonField<Int> = JsonMissing.of()
        private var faa: JsonField<String> = JsonMissing.of()
        private var fpa: JsonField<String> = JsonMissing.of()
        private var functPrimary: JsonField<String> = JsonMissing.of()
        private var geoArea: JsonField<String> = JsonMissing.of()
        private var geoidalMslSep: JsonField<Double> = JsonMissing.of()
        private var grade: JsonField<Int> = JsonMissing.of()
        private var iata: JsonField<String> = JsonMissing.of()
        private var icao: JsonField<String> = JsonMissing.of()
        private var ident: JsonField<String> = JsonMissing.of()
        private var idEntity: JsonField<String> = JsonMissing.of()
        private var idParentSite: JsonField<String> = JsonMissing.of()
        private var lzUsage: JsonField<String> = JsonMissing.of()
        private var maxRunwayLength: JsonField<Int> = JsonMissing.of()
        private var milGrid: JsonField<String> = JsonMissing.of()
        private var milGridSys: JsonField<String> = JsonMissing.of()
        private var msnPrimary: JsonField<String> = JsonMissing.of()
        private var msnPrimarySpec: JsonField<String> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var nucCap: JsonField<String> = JsonMissing.of()
        private var operStatus: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origLzId: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origSiteId: JsonField<String> = JsonMissing.of()
        private var osuffix: JsonField<String> = JsonMissing.of()
        private var pin: JsonField<String> = JsonMissing.of()
        private var polSubdiv: JsonField<String> = JsonMissing.of()
        private var popArea: JsonField<Boolean> = JsonMissing.of()
        private var popAreaProx: JsonField<Double> = JsonMissing.of()
        private var recStatus: JsonField<String> = JsonMissing.of()
        private var referenceDoc: JsonField<String> = JsonMissing.of()
        private var resProd: JsonField<String> = JsonMissing.of()
        private var reviewDate: JsonField<LocalDate> = JsonMissing.of()
        private var runways: JsonField<Long> = JsonMissing.of()
        private var siteOperations: JsonField<MutableList<SiteOperation>>? = null
        private var siteRemarks: JsonField<MutableList<SiteRemark>>? = null
        private var symCode: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var usage: JsonField<String> = JsonMissing.of()
        private var utm: JsonField<String> = JsonMissing.of()
        private var vegHt: JsonField<Double> = JsonMissing.of()
        private var vegType: JsonField<String> = JsonMissing.of()
        private var wac: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(siteTupleResponse: SiteTupleResponse) =
            apply {
                classificationMarking = siteTupleResponse.classificationMarking
                dataMode = siteTupleResponse.dataMode
                name = siteTupleResponse.name
                source = siteTupleResponse.source
                id = siteTupleResponse.id
                activity = siteTupleResponse.activity
                airDefArea = siteTupleResponse.airDefArea
                allegiance = siteTupleResponse.allegiance
                altAllegiance = siteTupleResponse.altAllegiance
                beNumber = siteTupleResponse.beNumber
                catCode = siteTupleResponse.catCode
                catText = siteTupleResponse.catText
                classRating = siteTupleResponse.classRating
                condition = siteTupleResponse.condition
                conditionAvail = siteTupleResponse.conditionAvail
                coord = siteTupleResponse.coord
                coordDatum = siteTupleResponse.coordDatum
                coordDerivAcc = siteTupleResponse.coordDerivAcc
                createdAt = siteTupleResponse.createdAt
                createdBy = siteTupleResponse.createdBy
                elevMsl = siteTupleResponse.elevMsl
                elevMslConfLvl = siteTupleResponse.elevMslConfLvl
                elevMslDerivAcc = siteTupleResponse.elevMslDerivAcc
                entity = siteTupleResponse.entity
                eval = siteTupleResponse.eval
                faa = siteTupleResponse.faa
                fpa = siteTupleResponse.fpa
                functPrimary = siteTupleResponse.functPrimary
                geoArea = siteTupleResponse.geoArea
                geoidalMslSep = siteTupleResponse.geoidalMslSep
                grade = siteTupleResponse.grade
                iata = siteTupleResponse.iata
                icao = siteTupleResponse.icao
                ident = siteTupleResponse.ident
                idEntity = siteTupleResponse.idEntity
                idParentSite = siteTupleResponse.idParentSite
                lzUsage = siteTupleResponse.lzUsage
                maxRunwayLength = siteTupleResponse.maxRunwayLength
                milGrid = siteTupleResponse.milGrid
                milGridSys = siteTupleResponse.milGridSys
                msnPrimary = siteTupleResponse.msnPrimary
                msnPrimarySpec = siteTupleResponse.msnPrimarySpec
                notes = siteTupleResponse.notes
                nucCap = siteTupleResponse.nucCap
                operStatus = siteTupleResponse.operStatus
                origin = siteTupleResponse.origin
                origLzId = siteTupleResponse.origLzId
                origNetwork = siteTupleResponse.origNetwork
                origSiteId = siteTupleResponse.origSiteId
                osuffix = siteTupleResponse.osuffix
                pin = siteTupleResponse.pin
                polSubdiv = siteTupleResponse.polSubdiv
                popArea = siteTupleResponse.popArea
                popAreaProx = siteTupleResponse.popAreaProx
                recStatus = siteTupleResponse.recStatus
                referenceDoc = siteTupleResponse.referenceDoc
                resProd = siteTupleResponse.resProd
                reviewDate = siteTupleResponse.reviewDate
                runways = siteTupleResponse.runways
                siteOperations = siteTupleResponse.siteOperations.map { it.toMutableList() }
                siteRemarks = siteTupleResponse.siteRemarks.map { it.toMutableList() }
                symCode = siteTupleResponse.symCode
                type = siteTupleResponse.type
                updatedAt = siteTupleResponse.updatedAt
                updatedBy = siteTupleResponse.updatedBy
                usage = siteTupleResponse.usage
                utm = siteTupleResponse.utm
                vegHt = siteTupleResponse.vegHt
                vegType = siteTupleResponse.vegType
                wac = siteTupleResponse.wac
                additionalProperties = siteTupleResponse.additionalProperties.toMutableMap()
            }

        /** Classification marking of the data in IC/CAPCO Portion-marked format. */
        fun classificationMarking(classificationMarking: String) = classificationMarking(JsonField.of(classificationMarking))

        /**
         * Sets [Builder.classificationMarking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classificationMarking] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun classificationMarking(classificationMarking: JsonField<String>) =
            apply {
                this.classificationMarking = classificationMarking
            }

        /**
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
         */
        fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

        /**
         * Sets [Builder.dataMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataMode] with a well-typed [DataMode] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataMode(dataMode: JsonField<DataMode>) =
            apply {
                this.dataMode = dataMode
            }

        /** The name of this site. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun name(name: JsonField<String>) =
            apply {
                this.name = name
            }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun source(source: JsonField<String>) =
            apply {
                this.source = source
            }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        /** Indicates the function or mission of an entity, which that entity may or may not be engaged in at any particular time. Typically refers to a unit, organization, or installation/site performing a specific function or mission such as a redistribution center or naval shipyard. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider. */
        fun activity(activity: String) = activity(JsonField.of(activity))

        /**
         * Sets [Builder.activity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activity] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activity(activity: JsonField<String>) =
            apply {
                this.activity = activity
            }

        /** Air Defense District (ADD) or Air Defense Area (ADA) in which the geographic coordinates reside. */
        fun airDefArea(airDefArea: String) = airDefArea(JsonField.of(airDefArea))

        /**
         * Sets [Builder.airDefArea] to an arbitrary JSON value.
         *
         * You should usually call [Builder.airDefArea] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun airDefArea(airDefArea: JsonField<String>) =
            apply {
                this.airDefArea = airDefArea
            }

        /** The DoD Standard Country Code designator for the country or political entity to which the site owes its allegiance. This field will be set to "OTHR" if the source value does not match a UDL Country code value (ISO-3166-ALPHA-2). */
        fun allegiance(allegiance: String) = allegiance(JsonField.of(allegiance))

        /**
         * Sets [Builder.allegiance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allegiance] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allegiance(allegiance: JsonField<String>) =
            apply {
                this.allegiance = allegiance
            }

        /** Specifies an alternate allegiance code if the data provider code is not part of an official Country Code standard such as ISO-3166 or FIPS. This field will be set to the value provided by the source and should be used for all Queries specifying allegiance. */
        fun altAllegiance(altAllegiance: String) = altAllegiance(JsonField.of(altAllegiance))

        /**
         * Sets [Builder.altAllegiance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altAllegiance] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun altAllegiance(altAllegiance: JsonField<String>) =
            apply {
                this.altAllegiance = altAllegiance
            }

        /** The Basic Encyclopedia Number associated with the Site. Uniquely identifies the installation of a site. The beNumber is generated based on the value input for the COORD to determine the appropriate World Aeronautical Chart (WAC) location identifier, the system assigned record originator and a one-up-number. */
        fun beNumber(beNumber: String) = beNumber(JsonField.of(beNumber))

        /**
         * Sets [Builder.beNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beNumber] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun beNumber(beNumber: JsonField<String>) =
            apply {
                this.beNumber = beNumber
            }

        /** The category code that represents the associated site purpose within the target system. */
        fun catCode(catCode: String) = catCode(JsonField.of(catCode))

        /**
         * Sets [Builder.catCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.catCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun catCode(catCode: JsonField<String>) =
            apply {
                this.catCode = catCode
            }

        /** Textual Description of Site catCode. */
        fun catText(catText: String) = catText(JsonField.of(catText))

        /**
         * Sets [Builder.catText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.catText] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun catText(catText: JsonField<String>) =
            apply {
                this.catText = catText
            }

        /**
         * Indicates the importance of the entity to the OES or MIR system. This data element is restricted to update by DIA (DB-4). Valid values are:
         *
         * 0 - Does not meet criteria above
         *
         * 1 - Primary importance to system
         *
         * 2 - Secondary importance to system
         *
         * 3 - Tertiary importance to system
         *
         * O - Other. Explain in Remarks.
         */
        fun classRating(classRating: String) = classRating(JsonField.of(classRating))

        /**
         * Sets [Builder.classRating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classRating] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun classRating(classRating: JsonField<String>) =
            apply {
                this.classRating = classRating
            }

        /** The physical manner of being or state of existence of the entity. A physical condition that must be considered in the determining of a course of action. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider. */
        fun condition(condition: String) = condition(JsonField.of(condition))

        /**
         * Sets [Builder.condition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.condition] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun condition(condition: JsonField<String>) =
            apply {
                this.condition = condition
            }

        /** Availability of the entity relative to its condition. Indicates the reason the entity is not fully operational. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider. */
        fun conditionAvail(conditionAvail: String) = conditionAvail(JsonField.of(conditionAvail))

        /**
         * Sets [Builder.conditionAvail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditionAvail] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conditionAvail(conditionAvail: JsonField<String>) =
            apply {
                this.conditionAvail = conditionAvail
            }

        /**
         * Indicates any of the magnitudes that serve to define the position of a point by reference to a fixed figure, system of lines, etc.
         *
         * Pos. 1-2. Latitude Degrees [00-90]
         *
         * Pos. 3-4. Latitude Minutes [00-59]
         *
         * Pos. 5-6. Latitude Seconds [00-59]
         *
         * Pos. 7-9. Latitude Thousandths Of Seconds [000-999]
         *
         * Pos. 10. Latitude Hemisphere [NS]
         *
         * Pos. 11-13. Longitude Degrees [00-180]
         *
         * Pos. 14-15. Longitude Minutes [00-59]
         *
         * Pos. 16-17. Longitude Seconds [00-59]
         *
         * Pos. 18-20. Longitude Thousandths Of Seconds [000-999]
         *
         * Pos. 21. Longitude Hemisphere [EW]
         *
         * Pos. 1-21. Unknown Latitude and Unknown Longitude [000000000U000000000U].
         */
        fun coord(coord: String) = coord(JsonField.of(coord))

        /**
         * Sets [Builder.coord] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coord] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun coord(coord: JsonField<String>) =
            apply {
                this.coord = coord
            }

        /** A mathematical model of the earth used to calculate coordinates on a map. US Forces use the World Geodetic System 1984 (WGS 84), but also use maps by allied countries with local datums. The datum must be specified to ensure accuracy of coordinates. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider. */
        fun coordDatum(coordDatum: String) = coordDatum(JsonField.of(coordDatum))

        /**
         * Sets [Builder.coordDatum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coordDatum] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun coordDatum(coordDatum: JsonField<String>) =
            apply {
                this.coordDatum = coordDatum
            }

        /** Indicates the plus or minus error assessed against the method used to derive the coordinate. */
        fun coordDerivAcc(coordDerivAcc: Double) = coordDerivAcc(JsonField.of(coordDerivAcc))

        /**
         * Sets [Builder.coordDerivAcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coordDerivAcc] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun coordDerivAcc(coordDerivAcc: JsonField<Double>) =
            apply {
                this.coordDerivAcc = coordDerivAcc
            }

        /** Time the row was created in the database, auto-populated by the system. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply {
                this.createdAt = createdAt
            }

        /** Application user who created the row in the database, auto-populated by the system. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdBy(createdBy: JsonField<String>) =
            apply {
                this.createdBy = createdBy
            }

        /** Ground elevation of the geographic coordinates referenced to (above or below) Mean Sea Level (MSL) vertical datum, in meters. */
        fun elevMsl(elevMsl: Double) = elevMsl(JsonField.of(elevMsl))

        /**
         * Sets [Builder.elevMsl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevMsl] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elevMsl(elevMsl: JsonField<Double>) =
            apply {
                this.elevMsl = elevMsl
            }

        /** Indicates the confidence level expressed as a percent that a specific geometric spatial element, ELEVATION_MSL linear accuracy, has been vertically positioned to within a specified vertical accuracy. */
        fun elevMslConfLvl(elevMslConfLvl: Int) = elevMslConfLvl(JsonField.of(elevMslConfLvl))

        /**
         * Sets [Builder.elevMslConfLvl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevMslConfLvl] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elevMslConfLvl(elevMslConfLvl: JsonField<Int>) =
            apply {
                this.elevMslConfLvl = elevMslConfLvl
            }

        /** Indicates the plus or minus error assessed against the method used to derive the elevation. */
        fun elevMslDerivAcc(elevMslDerivAcc: Double) = elevMslDerivAcc(JsonField.of(elevMslDerivAcc))

        /**
         * Sets [Builder.elevMslDerivAcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevMslDerivAcc] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elevMslDerivAcc(elevMslDerivAcc: JsonField<Double>) =
            apply {
                this.elevMslDerivAcc = elevMslDerivAcc
            }

        /** An entity is a generic representation of any object within a space/SSA system such as sensors, on-orbit objects, RF Emitters, space craft buses, etc. An entity can have an operating unit, a location (if terrestrial), and statuses. */
        fun entity(entity: EntityFull) = entity(JsonField.of(entity))

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [EntityFull] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entity(entity: JsonField<EntityFull>) =
            apply {
                this.entity = entity
            }

        /** Eval represents the Intelligence Confidence Level or the Reliability/degree of confidence that the analyst has assigned to the data within this record. The numerical range is from 1 to 9 with 1 representing the highest confidence level. */
        fun eval(eval: Int) = eval(JsonField.of(eval))

        /**
         * Sets [Builder.eval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eval] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eval(eval: JsonField<Int>) =
            apply {
                this.eval = eval
            }

        /** The Federal Aviation Administration (FAA) Location ID of this site, if applicable. */
        fun faa(faa: String) = faa(JsonField.of(faa))

        /**
         * Sets [Builder.faa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.faa] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun faa(faa: JsonField<String>) =
            apply {
                this.faa = faa
            }

        /** Functional Production Area (FPA) under the Shared Production Program (SPP). Producers are defined per country per FPA. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider. */
        fun fpa(fpa: String) = fpa(JsonField.of(fpa))

        /**
         * Sets [Builder.fpa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fpa] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fpa(fpa: JsonField<String>) =
            apply {
                this.fpa = fpa
            }

        /** Principal operational function being performed. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider. */
        fun functPrimary(functPrimary: String) = functPrimary(JsonField.of(functPrimary))

        /**
         * Sets [Builder.functPrimary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.functPrimary] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun functPrimary(functPrimary: JsonField<String>) =
            apply {
                this.functPrimary = functPrimary
            }

        /** Geographical region code used by the Requirements Management System (RMS) as specified by National Geospatial Agency (NGA) in Flight Information Publications (FIPS) 10-4, Appendix 3 - Country Code and Geographic Region Codes. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider. */
        fun geoArea(geoArea: String) = geoArea(JsonField.of(geoArea))

        /**
         * Sets [Builder.geoArea] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoArea] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geoArea(geoArea: JsonField<String>) =
            apply {
                this.geoArea = geoArea
            }

        /** The distance between Mean Sea Level and a referenced ellipsoid, in meters. */
        fun geoidalMslSep(geoidalMslSep: Double) = geoidalMslSep(JsonField.of(geoidalMslSep))

        /**
         * Sets [Builder.geoidalMslSep] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoidalMslSep] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geoidalMslSep(geoidalMslSep: JsonField<Double>) =
            apply {
                this.geoidalMslSep = geoidalMslSep
            }

        /** Indicates the amount or degree of deviation from the horizontal represented as a percent. Grade is determined by the formula: vertical distance (VD) divided by horizontal distance (HD) times 100. VD is the difference between the highest and lowest elevation within the entity. HD is the linear distance between the highest and lowest elevation. */
        fun grade(grade: Int) = grade(JsonField.of(grade))

        /**
         * Sets [Builder.grade] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grade] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun grade(grade: JsonField<Int>) =
            apply {
                this.grade = grade
            }

        /** The International Air Transport Association (IATA) code of this site, if applicable. */
        fun iata(iata: String) = iata(JsonField.of(iata))

        /**
         * Sets [Builder.iata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iata] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun iata(iata: JsonField<String>) =
            apply {
                this.iata = iata
            }

        /** The International Civil Aviation Organization (ICAO) code of this site, if applicable. */
        fun icao(icao: String) = icao(JsonField.of(icao))

        /**
         * Sets [Builder.icao] to an arbitrary JSON value.
         *
         * You should usually call [Builder.icao] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun icao(icao: JsonField<String>) =
            apply {
                this.icao = icao
            }

        /**
         * Estimated identity of the Site (ASSUMED FRIEND, FRIEND, HOSTILE, FAKER, JOKER, NEUTRAL, PENDING, SUSPECT, UNKNOWN):
         *
         * ASSUMED FRIEND: Track assumed to be a friend due to the object characteristics, behavior, and/or origin.
         *
         * FRIEND: Track object supporting friendly forces and belonging to a declared friendly nation or entity.
         *
         * HOSTILE: Track object belonging to an opposing nation, party, group, or entity deemed to contribute to a threat to friendly forces or their mission due to its behavior, characteristics, nationality, or origin.
         *
         * FAKER: Friendly track, object, or entity acting as an exercise hostile.
         *
         * JOKER: Friendly track, object, or entity acting as an exercise suspect.
         *
         * NEUTRAL: Track object whose characteristics, behavior, nationality, and/or origin indicate that it is neither supporting nor opposing friendly forces or their mission.
         *
         * PENDING: Track object which has not been evaluated.
         *
         * SUSPECT: Track object deemed potentially hostile due to the object characteristics, behavior, nationality, and/or origin.
         *
         * UNKNOWN: Track object which has been evaluated and does not meet criteria for any standard identity.
         */
        fun ident(ident: String) = ident(JsonField.of(ident))

        /**
         * Sets [Builder.ident] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ident] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ident(ident: JsonField<String>) =
            apply {
                this.ident = ident
            }

        /** Unique identifier of the parent entity. idEntity is required for Put. */
        fun idEntity(idEntity: String) = idEntity(JsonField.of(idEntity))

        /**
         * Sets [Builder.idEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idEntity] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idEntity(idEntity: JsonField<String>) =
            apply {
                this.idEntity = idEntity
            }

        /** Unique identifier of the Parent Site record associated with this Site record. */
        fun idParentSite(idParentSite: String) = idParentSite(JsonField.of(idParentSite))

        /**
         * Sets [Builder.idParentSite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idParentSite] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idParentSite(idParentSite: JsonField<String>) =
            apply {
                this.idParentSite = idParentSite
            }

        /**
         * Indicates the normal usage of the Landing Zone (LZ). Intended as, but not constrained to MIDB Helocopter Landing Area usage value definitions:
         *
         * AF - Airfield
         *
         * FD - Field
         *
         * HC - High Crop. 1 meter and over.
         *
         * HY - Highway
         *
         * LB - Lake Bed
         *
         * LC - Low Crop. 0-1 meters
         *
         * O - Other. Explain In Remarks.
         *
         * PD - Paddy
         *
         * PK - Park
         *
         * PS - Pasture
         *
         * RB - Riverbed
         *
         * SP - Sport Field
         *
         * U - Unknown
         *
         * Z - Inconclusive Analysis.
         */
        fun lzUsage(lzUsage: String) = lzUsage(JsonField.of(lzUsage))

        /**
         * Sets [Builder.lzUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lzUsage] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lzUsage(lzUsage: JsonField<String>) =
            apply {
                this.lzUsage = lzUsage
            }

        /** The length of the longest runway at this site, if applicable, in meters. */
        fun maxRunwayLength(maxRunwayLength: Int) = maxRunwayLength(JsonField.of(maxRunwayLength))

        /**
         * Sets [Builder.maxRunwayLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRunwayLength] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxRunwayLength(maxRunwayLength: JsonField<Int>) =
            apply {
                this.maxRunwayLength = maxRunwayLength
            }

        /**
         * The Military Grid Reference System is the geocoordinate standard used by NATO militaries for locating points on Earth. The MGRS is derived from the Universal Transverse Mercator (UTM) grid system and the Universal Polar Stereographic (UPS) grid system, but uses a different labeling convention. The MGRS is used as geocode for the entire Earth. Example of an milgrid coordinate, or grid reference, would be 4QFJ12345678, which consists of three parts:
         *
         * 4Q (grid zone designator, GZD)
         *
         * FJ (the 100,000-meter square identifier)
         *
         * 12345678 (numerical location; easting is 1234 and northing is 5678, in this case specifying a location with 10 m resolution).
         */
        fun milGrid(milGrid: String) = milGrid(JsonField.of(milGrid))

        /**
         * Sets [Builder.milGrid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.milGrid] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun milGrid(milGrid: JsonField<String>) =
            apply {
                this.milGrid = milGrid
            }

        /**
         * Indicates the grid system used in the development of the milGrid coordinates. Values are:
         *
         * UPS - Universal Polar System
         *
         * UTM - Universal Transverse Mercator.
         */
        fun milGridSys(milGridSys: String) = milGridSys(JsonField.of(milGridSys))

        /**
         * Sets [Builder.milGridSys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.milGridSys] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun milGridSys(milGridSys: JsonField<String>) =
            apply {
                this.milGridSys = milGridSys
            }

        /** Indicates the principal type of mission that an entity is organized and equipped to perform. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider. */
        fun msnPrimary(msnPrimary: String) = msnPrimary(JsonField.of(msnPrimary))

        /**
         * Sets [Builder.msnPrimary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msnPrimary] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun msnPrimary(msnPrimary: JsonField<String>) =
            apply {
                this.msnPrimary = msnPrimary
            }

        /** Indicates the principal specialty type of mission that an entity is organized and equipped to perform. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider. */
        fun msnPrimarySpec(msnPrimarySpec: String) = msnPrimarySpec(JsonField.of(msnPrimarySpec))

        /**
         * Sets [Builder.msnPrimarySpec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msnPrimarySpec] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun msnPrimarySpec(msnPrimarySpec: JsonField<String>) =
            apply {
                this.msnPrimarySpec = msnPrimarySpec
            }

        /** Optional notes/comments for the site. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notes(notes: JsonField<String>) =
            apply {
                this.notes = notes
            }

        /**
         * A sites ability to conduct nuclear warfare. Valid Values are:
         *
         * A - Nuclear Ammo Or Warheads Available
         *
         * N - No Nuclear Offense
         *
         * O - Other. Explain in Remarks
         *
         * U - Unknown
         *
         * W - Nuclear Weapons Available
         *
         * Y - Nuclear Warfare Offensive Capability
         *
         * Z - Inconclusive Analysis.
         */
        fun nucCap(nucCap: String) = nucCap(JsonField.of(nucCap))

        /**
         * Sets [Builder.nucCap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nucCap] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nucCap(nucCap: JsonField<String>) =
            apply {
                this.nucCap = nucCap
            }

        /** The Degree to which an entity is ready to perform the overall operational mission(s) for which it was organized and equipped. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider. */
        fun operStatus(operStatus: String) = operStatus(JsonField.of(operStatus))

        /**
         * Sets [Builder.operStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operStatus] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operStatus(operStatus: JsonField<String>) =
            apply {
                this.operStatus = operStatus
            }

        /** Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin. */
        fun origin(origin: String) = origin(JsonField.of(origin))

        /**
         * Sets [Builder.origin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origin] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun origin(origin: JsonField<String>) =
            apply {
                this.origin = origin
            }

        /** Unique identifier of the LZ record from the originating system. */
        fun origLzId(origLzId: String) = origLzId(JsonField.of(origLzId))

        /**
         * Sets [Builder.origLzId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origLzId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun origLzId(origLzId: JsonField<String>) =
            apply {
                this.origLzId = origLzId
            }

        /** The originating source network on which this record was created, auto-populated by the system. */
        fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

        /**
         * Sets [Builder.origNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origNetwork] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun origNetwork(origNetwork: JsonField<String>) =
            apply {
                this.origNetwork = origNetwork
            }

        /** Unique identifier of the Site record from the originating system. */
        fun origSiteId(origSiteId: String) = origSiteId(JsonField.of(origSiteId))

        /**
         * Sets [Builder.origSiteId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origSiteId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun origSiteId(origSiteId: JsonField<String>) =
            apply {
                this.origSiteId = origSiteId
            }

        /** The O-suffix associated with this site. The O-suffix is a five-character alpha/numeric system used to identify a site, or demographic area, within an installation. The Installation Basic Encyclopedia (beNumber), in conjunction with the O-suffix, uniquely identifies the Site. The Installation beNumber and oSuffix are also used in conjunction with the catCode to classify the function or purpose of the facility. */
        fun osuffix(osuffix: String) = osuffix(JsonField.of(osuffix))

        /**
         * Sets [Builder.osuffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.osuffix] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun osuffix(osuffix: JsonField<String>) =
            apply {
                this.osuffix = osuffix
            }

        /** Site number of a specific electronic site or its associated equipment. */
        fun pin(pin: String) = pin(JsonField.of(pin))

        /**
         * Sets [Builder.pin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pin] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pin(pin: JsonField<String>) =
            apply {
                this.pin = pin
            }

        /** Political subdivision in which the geographic coordinates reside. The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider. */
        fun polSubdiv(polSubdiv: String) = polSubdiv(JsonField.of(polSubdiv))

        /**
         * Sets [Builder.polSubdiv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polSubdiv] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun polSubdiv(polSubdiv: JsonField<String>) =
            apply {
                this.polSubdiv = polSubdiv
            }

        /** Indicates whether the facility is in or outside of a populated area. True, the facility is in or within 5 NM of a populated area. False, the facility is outside a populated area. */
        fun popArea(popArea: Boolean) = popArea(JsonField.of(popArea))

        /**
         * Sets [Builder.popArea] to an arbitrary JSON value.
         *
         * You should usually call [Builder.popArea] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun popArea(popArea: JsonField<Boolean>) =
            apply {
                this.popArea = popArea
            }

        /** Indicates the distance to nearest populated area (over 1,000 people) in nautical miles. */
        fun popAreaProx(popAreaProx: Double) = popAreaProx(JsonField.of(popAreaProx))

        /**
         * Sets [Builder.popAreaProx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.popAreaProx] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun popAreaProx(popAreaProx: JsonField<Double>) =
            apply {
                this.popAreaProx = popAreaProx
            }

        /**
         * Validity and currency of the data in the record to be used in conjunction with the other elements in the record as defined by SOPs.
         *
         * A - Active
         *
         * I - Inactive
         *
         * K - Acknowledged
         *
         * L - Local
         *
         * Q - A nominated (NOM) or Data Change Request (DCR) record
         *
         * R - Production reduced by CMD decision
         *
         * W - Working Record.
         */
        fun recStatus(recStatus: String) = recStatus(JsonField.of(recStatus))

        /**
         * Sets [Builder.recStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recStatus] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recStatus(recStatus: JsonField<String>) =
            apply {
                this.recStatus = recStatus
            }

        /** The reference documentation that specifies the usage and enumerations contained in this record. If referenceDoc not provided, users may consult the data provider. */
        fun referenceDoc(referenceDoc: String) = referenceDoc(JsonField.of(referenceDoc))

        /**
         * Sets [Builder.referenceDoc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceDoc] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceDoc(referenceDoc: JsonField<String>) =
            apply {
                this.referenceDoc = referenceDoc
            }

        /** Responsible Producer - Organization that is responsible for the maintenance of the record. */
        fun resProd(resProd: String) = resProd(JsonField.of(resProd))

        /**
         * Sets [Builder.resProd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resProd] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resProd(resProd: JsonField<String>) =
            apply {
                this.resProd = resProd
            }

        /** Date on which the data in the record was last reviewed by the responsible analyst for accuracy and currency, in ISO8601 UTC format. This date cannot be greater than the current date. */
        fun reviewDate(reviewDate: LocalDate) = reviewDate(JsonField.of(reviewDate))

        /**
         * Sets [Builder.reviewDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewDate] with a well-typed [LocalDate] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reviewDate(reviewDate: JsonField<LocalDate>) =
            apply {
                this.reviewDate = reviewDate
            }

        /** The number of runways at the site, if applicable. */
        fun runways(runways: Long) = runways(JsonField.of(runways))

        /**
         * Sets [Builder.runways] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runways] with a well-typed [Long] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun runways(runways: JsonField<Long>) =
            apply {
                this.runways = runways
            }

        fun siteOperations(siteOperations: List<SiteOperation>) = siteOperations(JsonField.of(siteOperations))

        /**
         * Sets [Builder.siteOperations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.siteOperations] with a well-typed `List<SiteOperation>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun siteOperations(siteOperations: JsonField<List<SiteOperation>>) =
            apply {
                this.siteOperations = siteOperations.map { it.toMutableList() }
            }

        /**
         * Adds a single [SiteOperation] to [siteOperations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSiteOperation(siteOperation: SiteOperation) =
            apply {
                siteOperations = (siteOperations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("siteOperations", it).add(siteOperation)
                }
            }

        /** Remarks contain amplifying information for a specific service. The information may contain context and interpretations for consumer use. */
        fun siteRemarks(siteRemarks: List<SiteRemark>) = siteRemarks(JsonField.of(siteRemarks))

        /**
         * Sets [Builder.siteRemarks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.siteRemarks] with a well-typed `List<SiteRemark>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun siteRemarks(siteRemarks: JsonField<List<SiteRemark>>) =
            apply {
                this.siteRemarks = siteRemarks.map { it.toMutableList() }
            }

        /**
         * Adds a single [SiteRemark] to [siteRemarks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSiteRemark(siteRemark: SiteRemark) =
            apply {
                siteRemarks = (siteRemarks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("siteRemarks", it).add(siteRemark)
                }
            }

        /** A standard scheme for symbol coding enabling the transfer, display and use of symbols and graphics among information systems, as per MIL-STD 2525B, and supported by the element ident. */
        fun symCode(symCode: String) = symCode(JsonField.of(symCode))

        /**
         * Sets [Builder.symCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun symCode(symCode: JsonField<String>) =
            apply {
                this.symCode = symCode
            }

        /** The type of this site (AIRBASE, AIRFIELD, AIRPORT, NAVAL STATION, etc.). */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<String>) =
            apply {
                this.type = type
            }

        /** Time the row was updated in the database, auto-populated by the system. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) =
            apply {
                this.updatedAt = updatedAt
            }

        /** Application user who updated the row in the database, auto-populated by the system. */
        fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedBy(updatedBy: JsonField<String>) =
            apply {
                this.updatedBy = updatedBy
            }

        /** The use authorization type of this site (e.g MILITARY, CIVIL, JOINT-USE, etc.). */
        fun usage(usage: String) = usage(JsonField.of(usage))

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usage(usage: JsonField<String>) =
            apply {
                this.usage = usage
            }

        /**
         * Universal Transverse Mercator (UTM) grid coordinates.
         *
         * Pos. 1-2, UTM Zone Column [01-60
         *
         * Pos. 3, UTM Zone Row [C-HJ-NP-X]
         *
         * Pos. 4, UTM False Easting [0-9]
         *
         * Pos. 5-9, UTM Meter Easting [0-9][0-9][0-9][0-9][0-9]
         *
         * Pos. 10-11, UTM False Northing [0-9][0-9]
         *
         * Pos. 12-16, UTM Meter Northing [0-9][0-9][0-9][0-9][0-9].
         */
        fun utm(utm: String) = utm(JsonField.of(utm))

        /**
         * Sets [Builder.utm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.utm] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun utm(utm: JsonField<String>) =
            apply {
                this.utm = utm
            }

        /** Maximum expected height of the vegetation in the Landing Zone (LZ), in meters. */
        fun vegHt(vegHt: Double) = vegHt(JsonField.of(vegHt))

        /**
         * Sets [Builder.vegHt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vegHt] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vegHt(vegHt: JsonField<Double>) =
            apply {
                this.vegHt = vegHt
            }

        /** The predominant vegetation found in the Landing Zone (LZ). The specific usage and enumerations contained in this field may be found in the documentation provided in the referenceDoc field. If referenceDoc not provided, users may consult the data provider. */
        fun vegType(vegType: String) = vegType(JsonField.of(vegType))

        /**
         * Sets [Builder.vegType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vegType] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vegType(vegType: JsonField<String>) =
            apply {
                this.vegType = vegType
            }

        /** World Aeronautical Chart identifier for the area in which a designated place is located. */
        fun wac(wac: String) = wac(JsonField.of(wac))

        /**
         * Sets [Builder.wac] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wac] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wac(wac: JsonField<String>) =
            apply {
                this.wac = wac
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        /**
         * Returns an immutable instance of [SiteTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SiteTupleResponse =
            SiteTupleResponse(
              checkRequired(
                "classificationMarking", classificationMarking
              ),
              checkRequired(
                "dataMode", dataMode
              ),
              checkRequired(
                "name", name
              ),
              checkRequired(
                "source", source
              ),
              id,
              activity,
              airDefArea,
              allegiance,
              altAllegiance,
              beNumber,
              catCode,
              catText,
              classRating,
              condition,
              conditionAvail,
              coord,
              coordDatum,
              coordDerivAcc,
              createdAt,
              createdBy,
              elevMsl,
              elevMslConfLvl,
              elevMslDerivAcc,
              entity,
              eval,
              faa,
              fpa,
              functPrimary,
              geoArea,
              geoidalMslSep,
              grade,
              iata,
              icao,
              ident,
              idEntity,
              idParentSite,
              lzUsage,
              maxRunwayLength,
              milGrid,
              milGridSys,
              msnPrimary,
              msnPrimarySpec,
              notes,
              nucCap,
              operStatus,
              origin,
              origLzId,
              origNetwork,
              origSiteId,
              osuffix,
              pin,
              polSubdiv,
              popArea,
              popAreaProx,
              recStatus,
              referenceDoc,
              resProd,
              reviewDate,
              runways,
              (siteOperations ?: JsonMissing.of()).map { it.toImmutable() },
              (siteRemarks ?: JsonMissing.of()).map { it.toImmutable() },
              symCode,
              type,
              updatedAt,
              updatedBy,
              usage,
              utm,
              vegHt,
              vegType,
              wac,
              additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SiteTupleResponse =
        apply {
            if (validated) {
              return@apply
            }

            classificationMarking()
            dataMode().validate()
            name()
            source()
            id()
            activity()
            airDefArea()
            allegiance()
            altAllegiance()
            beNumber()
            catCode()
            catText()
            classRating()
            condition()
            conditionAvail()
            coord()
            coordDatum()
            coordDerivAcc()
            createdAt()
            createdBy()
            elevMsl()
            elevMslConfLvl()
            elevMslDerivAcc()
            entity().ifPresent { it.validate() }
            eval()
            faa()
            fpa()
            functPrimary()
            geoArea()
            geoidalMslSep()
            grade()
            iata()
            icao()
            ident()
            idEntity()
            idParentSite()
            lzUsage()
            maxRunwayLength()
            milGrid()
            milGridSys()
            msnPrimary()
            msnPrimarySpec()
            notes()
            nucCap()
            operStatus()
            origin()
            origLzId()
            origNetwork()
            origSiteId()
            osuffix()
            pin()
            polSubdiv()
            popArea()
            popAreaProx()
            recStatus()
            referenceDoc()
            resProd()
            reviewDate()
            runways()
            siteOperations().ifPresent { it.forEach { it.validate() } }
            siteRemarks().ifPresent { it.forEach { it.validate() } }
            symCode()
            type()
            updatedAt()
            updatedBy()
            usage()
            utm()
            vegHt()
            vegType()
            wac()
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
    internal fun validity(): Int = (if (classificationMarking.asKnown().isPresent) 1 else 0) + (dataMode.asKnown().getOrNull()?.validity() ?: 0) + (if (name.asKnown().isPresent) 1 else 0) + (if (source.asKnown().isPresent) 1 else 0) + (if (id.asKnown().isPresent) 1 else 0) + (if (activity.asKnown().isPresent) 1 else 0) + (if (airDefArea.asKnown().isPresent) 1 else 0) + (if (allegiance.asKnown().isPresent) 1 else 0) + (if (altAllegiance.asKnown().isPresent) 1 else 0) + (if (beNumber.asKnown().isPresent) 1 else 0) + (if (catCode.asKnown().isPresent) 1 else 0) + (if (catText.asKnown().isPresent) 1 else 0) + (if (classRating.asKnown().isPresent) 1 else 0) + (if (condition.asKnown().isPresent) 1 else 0) + (if (conditionAvail.asKnown().isPresent) 1 else 0) + (if (coord.asKnown().isPresent) 1 else 0) + (if (coordDatum.asKnown().isPresent) 1 else 0) + (if (coordDerivAcc.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (createdBy.asKnown().isPresent) 1 else 0) + (if (elevMsl.asKnown().isPresent) 1 else 0) + (if (elevMslConfLvl.asKnown().isPresent) 1 else 0) + (if (elevMslDerivAcc.asKnown().isPresent) 1 else 0) + (entity.asKnown().getOrNull()?.validity() ?: 0) + (if (eval.asKnown().isPresent) 1 else 0) + (if (faa.asKnown().isPresent) 1 else 0) + (if (fpa.asKnown().isPresent) 1 else 0) + (if (functPrimary.asKnown().isPresent) 1 else 0) + (if (geoArea.asKnown().isPresent) 1 else 0) + (if (geoidalMslSep.asKnown().isPresent) 1 else 0) + (if (grade.asKnown().isPresent) 1 else 0) + (if (iata.asKnown().isPresent) 1 else 0) + (if (icao.asKnown().isPresent) 1 else 0) + (if (ident.asKnown().isPresent) 1 else 0) + (if (idEntity.asKnown().isPresent) 1 else 0) + (if (idParentSite.asKnown().isPresent) 1 else 0) + (if (lzUsage.asKnown().isPresent) 1 else 0) + (if (maxRunwayLength.asKnown().isPresent) 1 else 0) + (if (milGrid.asKnown().isPresent) 1 else 0) + (if (milGridSys.asKnown().isPresent) 1 else 0) + (if (msnPrimary.asKnown().isPresent) 1 else 0) + (if (msnPrimarySpec.asKnown().isPresent) 1 else 0) + (if (notes.asKnown().isPresent) 1 else 0) + (if (nucCap.asKnown().isPresent) 1 else 0) + (if (operStatus.asKnown().isPresent) 1 else 0) + (if (origin.asKnown().isPresent) 1 else 0) + (if (origLzId.asKnown().isPresent) 1 else 0) + (if (origNetwork.asKnown().isPresent) 1 else 0) + (if (origSiteId.asKnown().isPresent) 1 else 0) + (if (osuffix.asKnown().isPresent) 1 else 0) + (if (pin.asKnown().isPresent) 1 else 0) + (if (polSubdiv.asKnown().isPresent) 1 else 0) + (if (popArea.asKnown().isPresent) 1 else 0) + (if (popAreaProx.asKnown().isPresent) 1 else 0) + (if (recStatus.asKnown().isPresent) 1 else 0) + (if (referenceDoc.asKnown().isPresent) 1 else 0) + (if (resProd.asKnown().isPresent) 1 else 0) + (if (reviewDate.asKnown().isPresent) 1 else 0) + (if (runways.asKnown().isPresent) 1 else 0) + (siteOperations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (siteRemarks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (symCode.asKnown().isPresent) 1 else 0) + (if (type.asKnown().isPresent) 1 else 0) + (if (updatedAt.asKnown().isPresent) 1 else 0) + (if (updatedBy.asKnown().isPresent) 1 else 0) + (if (usage.asKnown().isPresent) 1 else 0) + (if (utm.asKnown().isPresent) 1 else 0) + (if (vegHt.asKnown().isPresent) 1 else 0) + (if (vegType.asKnown().isPresent) 1 else 0) + (if (wac.asKnown().isPresent) 1 else 0)

    /**
     * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
     */
    class DataMode @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't match any known
         * member, and you want to know that value. For example, if the SDK is on an older version than the
         * API, then the API may respond with new members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

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
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
         *   an older version than the API, then the API may respond with new members that the SDK is unaware
         *   of.
         *
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
         * class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want to throw
         * for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
         * for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging and generally
         * doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not have the expected
         * primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { UnifieddatalibraryInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): DataMode =
            apply {
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
         * Returns a score indicating how many valid values are contained in this object recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is DataMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Site operating details concerning the hours of operation, operational limitations, site navigation, and waivers associated with the Site. */
    class SiteOperation private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val idSite: JsonField<String>,
        private val source: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val dailyOperations: JsonField<List<DailyOperationFull>>,
        private val dopsLastChangedBy: JsonField<String>,
        private val dopsLastChangedDate: JsonField<OffsetDateTime>,
        private val dopsLastChangedReason: JsonField<String>,
        private val idLaunchSite: JsonField<String>,
        private val maximumOnGrounds: JsonField<List<MaximumOnGroundFull>>,
        private val mogsLastChangedBy: JsonField<String>,
        private val mogsLastChangedDate: JsonField<OffsetDateTime>,
        private val mogsLastChangedReason: JsonField<String>,
        private val operationalDeviations: JsonField<List<OperationalDeviationFull>>,
        private val operationalPlannings: JsonField<List<OperationalPlanningFull>>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val pathways: JsonField<List<PathwayFull>>,
        private val sourceDl: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val updatedBy: JsonField<String>,
        private val waivers: JsonField<List<WaiverFull>>,
        private val additionalProperties: MutableMap<String, JsonValue>,

    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking") @ExcludeMissing classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("idSite") @ExcludeMissing idSite: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dailyOperations") @ExcludeMissing dailyOperations: JsonField<List<DailyOperationFull>> = JsonMissing.of(),
            @JsonProperty("dopsLastChangedBy") @ExcludeMissing dopsLastChangedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dopsLastChangedDate") @ExcludeMissing dopsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dopsLastChangedReason") @ExcludeMissing dopsLastChangedReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idLaunchSite") @ExcludeMissing idLaunchSite: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maximumOnGrounds") @ExcludeMissing maximumOnGrounds: JsonField<List<MaximumOnGroundFull>> = JsonMissing.of(),
            @JsonProperty("mogsLastChangedBy") @ExcludeMissing mogsLastChangedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mogsLastChangedDate") @ExcludeMissing mogsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("mogsLastChangedReason") @ExcludeMissing mogsLastChangedReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("operationalDeviations") @ExcludeMissing operationalDeviations: JsonField<List<OperationalDeviationFull>> = JsonMissing.of(),
            @JsonProperty("operationalPlannings") @ExcludeMissing operationalPlannings: JsonField<List<OperationalPlanningFull>> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork") @ExcludeMissing origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pathways") @ExcludeMissing pathways: JsonField<List<PathwayFull>> = JsonMissing.of(),
            @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("waivers") @ExcludeMissing waivers: JsonField<List<WaiverFull>> = JsonMissing.of()
        ) : this(
          classificationMarking,
          dataMode,
          idSite,
          source,
          id,
          createdAt,
          createdBy,
          dailyOperations,
          dopsLastChangedBy,
          dopsLastChangedDate,
          dopsLastChangedReason,
          idLaunchSite,
          maximumOnGrounds,
          mogsLastChangedBy,
          mogsLastChangedDate,
          mogsLastChangedReason,
          operationalDeviations,
          operationalPlannings,
          origin,
          origNetwork,
          pathways,
          sourceDl,
          updatedAt,
          updatedBy,
          waivers,
          mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * The ID of the parent site.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun idSite(): String = idSite.getRequired("idSite")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Collection providing hours of operation and other information specific to a day of the week.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun dailyOperations(): Optional<List<DailyOperationFull>> = dailyOperations.getOptional("dailyOperations")

        /**
         * The name of the person who made the most recent change to data in the DailyOperations collection.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun dopsLastChangedBy(): Optional<String> = dopsLastChangedBy.getOptional("dopsLastChangedBy")

        /**
         * The datetime of the most recent change made to data in the DailyOperations collection, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun dopsLastChangedDate(): Optional<OffsetDateTime> = dopsLastChangedDate.getOptional("dopsLastChangedDate")

        /**
         * The reason for the most recent change to data in the dailyOperations collection.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun dopsLastChangedReason(): Optional<String> = dopsLastChangedReason.getOptional("dopsLastChangedReason")

        /**
         * Id of the associated launchSite entity.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun idLaunchSite(): Optional<String> = idLaunchSite.getOptional("idLaunchSite")

        /**
         * Collection providing maximum on ground (MOG) information for specific aircraft at the site associated with this SiteOperations record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun maximumOnGrounds(): Optional<List<MaximumOnGroundFull>> = maximumOnGrounds.getOptional("maximumOnGrounds")

        /**
         * The name of the person who made the most recent change to data in the MaximumOnGrounds collection.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun mogsLastChangedBy(): Optional<String> = mogsLastChangedBy.getOptional("mogsLastChangedBy")

        /**
         * The datetime of the most recent change made to data in the MaximumOnGrounds collection, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun mogsLastChangedDate(): Optional<OffsetDateTime> = mogsLastChangedDate.getOptional("mogsLastChangedDate")

        /**
         * The reason for the most recent change to data in the MaximumOnGrounds collection.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun mogsLastChangedReason(): Optional<String> = mogsLastChangedReason.getOptional("mogsLastChangedReason")

        /**
         * Collection providing relevant information in the event of deviations/exceptions to normal operations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun operationalDeviations(): Optional<List<OperationalDeviationFull>> = operationalDeviations.getOptional("operationalDeviations")

        /**
         * Collection of planning information associated with this SiteOperations record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun operationalPlannings(): Optional<List<OperationalPlanningFull>> = operationalPlannings.getOptional("operationalPlannings")

        /**
         * Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Collection detailing operational pathways at the Site associated with this SiteOperations record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun pathways(): Optional<List<PathwayFull>> = pathways.getOptional("pathways")

        /**
         * The source data library from which this record was received. This could be a remote or tactical UDL or another data library. If null, the record should be assumed to have originated from the primary Enterprise UDL.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

        /**
         * Time the row was updated in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Collection documenting operational waivers that have been issued for the Site associated with this record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun waivers(): Optional<List<WaiverFull>> = waivers.getOptional("waivers")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        fun _classificationMarking(): JsonField<String> = classificationMarking

        /**
         * Returns the raw JSON value of [dataMode].
         *
         * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataMode")
        @ExcludeMissing
        fun _dataMode(): JsonField<DataMode> = dataMode

        /**
         * Returns the raw JSON value of [idSite].
         *
         * Unlike [idSite], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSite")
        @ExcludeMissing
        fun _idSite(): JsonField<String> = idSite

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source")
        @ExcludeMissing
        fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id")
        @ExcludeMissing
        fun _id(): JsonField<String> = id

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
        @JsonProperty("createdBy")
        @ExcludeMissing
        fun _createdBy(): JsonField<String> = createdBy

        /**
         * Returns the raw JSON value of [dailyOperations].
         *
         * Unlike [dailyOperations], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dailyOperations")
        @ExcludeMissing
        fun _dailyOperations(): JsonField<List<DailyOperationFull>> = dailyOperations

        /**
         * Returns the raw JSON value of [dopsLastChangedBy].
         *
         * Unlike [dopsLastChangedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dopsLastChangedBy")
        @ExcludeMissing
        fun _dopsLastChangedBy(): JsonField<String> = dopsLastChangedBy

        /**
         * Returns the raw JSON value of [dopsLastChangedDate].
         *
         * Unlike [dopsLastChangedDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dopsLastChangedDate")
        @ExcludeMissing
        fun _dopsLastChangedDate(): JsonField<OffsetDateTime> = dopsLastChangedDate

        /**
         * Returns the raw JSON value of [dopsLastChangedReason].
         *
         * Unlike [dopsLastChangedReason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dopsLastChangedReason")
        @ExcludeMissing
        fun _dopsLastChangedReason(): JsonField<String> = dopsLastChangedReason

        /**
         * Returns the raw JSON value of [idLaunchSite].
         *
         * Unlike [idLaunchSite], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idLaunchSite")
        @ExcludeMissing
        fun _idLaunchSite(): JsonField<String> = idLaunchSite

        /**
         * Returns the raw JSON value of [maximumOnGrounds].
         *
         * Unlike [maximumOnGrounds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maximumOnGrounds")
        @ExcludeMissing
        fun _maximumOnGrounds(): JsonField<List<MaximumOnGroundFull>> = maximumOnGrounds

        /**
         * Returns the raw JSON value of [mogsLastChangedBy].
         *
         * Unlike [mogsLastChangedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mogsLastChangedBy")
        @ExcludeMissing
        fun _mogsLastChangedBy(): JsonField<String> = mogsLastChangedBy

        /**
         * Returns the raw JSON value of [mogsLastChangedDate].
         *
         * Unlike [mogsLastChangedDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mogsLastChangedDate")
        @ExcludeMissing
        fun _mogsLastChangedDate(): JsonField<OffsetDateTime> = mogsLastChangedDate

        /**
         * Returns the raw JSON value of [mogsLastChangedReason].
         *
         * Unlike [mogsLastChangedReason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mogsLastChangedReason")
        @ExcludeMissing
        fun _mogsLastChangedReason(): JsonField<String> = mogsLastChangedReason

        /**
         * Returns the raw JSON value of [operationalDeviations].
         *
         * Unlike [operationalDeviations], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operationalDeviations")
        @ExcludeMissing
        fun _operationalDeviations(): JsonField<List<OperationalDeviationFull>> = operationalDeviations

        /**
         * Returns the raw JSON value of [operationalPlannings].
         *
         * Unlike [operationalPlannings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operationalPlannings")
        @ExcludeMissing
        fun _operationalPlannings(): JsonField<List<OperationalPlanningFull>> = operationalPlannings

        /**
         * Returns the raw JSON value of [origin].
         *
         * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origin")
        @ExcludeMissing
        fun _origin(): JsonField<String> = origin

        /**
         * Returns the raw JSON value of [origNetwork].
         *
         * Unlike [origNetwork], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [pathways].
         *
         * Unlike [pathways], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pathways")
        @ExcludeMissing
        fun _pathways(): JsonField<List<PathwayFull>> = pathways

        /**
         * Returns the raw JSON value of [sourceDl].
         *
         * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDL")
        @ExcludeMissing
        fun _sourceDl(): JsonField<String> = sourceDl

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
        @JsonProperty("updatedBy")
        @ExcludeMissing
        fun _updatedBy(): JsonField<String> = updatedBy

        /**
         * Returns the raw JSON value of [waivers].
         *
         * Unlike [waivers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("waivers")
        @ExcludeMissing
        fun _waivers(): JsonField<List<WaiverFull>> = waivers

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
          additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [SiteOperation].
             *
             * The following fields are required:
             *
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .idSite()
             * .source()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [SiteOperation]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var idSite: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var dailyOperations: JsonField<MutableList<DailyOperationFull>>? = null
            private var dopsLastChangedBy: JsonField<String> = JsonMissing.of()
            private var dopsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dopsLastChangedReason: JsonField<String> = JsonMissing.of()
            private var idLaunchSite: JsonField<String> = JsonMissing.of()
            private var maximumOnGrounds: JsonField<MutableList<MaximumOnGroundFull>>? = null
            private var mogsLastChangedBy: JsonField<String> = JsonMissing.of()
            private var mogsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var mogsLastChangedReason: JsonField<String> = JsonMissing.of()
            private var operationalDeviations: JsonField<MutableList<OperationalDeviationFull>>? = null
            private var operationalPlannings: JsonField<MutableList<OperationalPlanningFull>>? = null
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var pathways: JsonField<MutableList<PathwayFull>>? = null
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var waivers: JsonField<MutableList<WaiverFull>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(siteOperation: SiteOperation) =
                apply {
                    classificationMarking = siteOperation.classificationMarking
                    dataMode = siteOperation.dataMode
                    idSite = siteOperation.idSite
                    source = siteOperation.source
                    id = siteOperation.id
                    createdAt = siteOperation.createdAt
                    createdBy = siteOperation.createdBy
                    dailyOperations = siteOperation.dailyOperations.map { it.toMutableList() }
                    dopsLastChangedBy = siteOperation.dopsLastChangedBy
                    dopsLastChangedDate = siteOperation.dopsLastChangedDate
                    dopsLastChangedReason = siteOperation.dopsLastChangedReason
                    idLaunchSite = siteOperation.idLaunchSite
                    maximumOnGrounds = siteOperation.maximumOnGrounds.map { it.toMutableList() }
                    mogsLastChangedBy = siteOperation.mogsLastChangedBy
                    mogsLastChangedDate = siteOperation.mogsLastChangedDate
                    mogsLastChangedReason = siteOperation.mogsLastChangedReason
                    operationalDeviations = siteOperation.operationalDeviations.map { it.toMutableList() }
                    operationalPlannings = siteOperation.operationalPlannings.map { it.toMutableList() }
                    origin = siteOperation.origin
                    origNetwork = siteOperation.origNetwork
                    pathways = siteOperation.pathways.map { it.toMutableList() }
                    sourceDl = siteOperation.sourceDl
                    updatedAt = siteOperation.updatedAt
                    updatedBy = siteOperation.updatedBy
                    waivers = siteOperation.waivers.map { it.toMutableList() }
                    additionalProperties = siteOperation.additionalProperties.toMutableMap()
                }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) = classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) =
                apply {
                    this.classificationMarking = classificationMarking
                }

            /**
             * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) =
                apply {
                    this.dataMode = dataMode
                }

            /** The ID of the parent site. */
            fun idSite(idSite: String) = idSite(JsonField.of(idSite))

            /**
             * Sets [Builder.idSite] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSite] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSite(idSite: JsonField<String>) =
                apply {
                    this.idSite = idSite
                }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) =
                apply {
                    this.source = source
                }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun id(id: JsonField<String>) =
                apply {
                    this.id = id
                }

            /** Time the row was created in the database, auto-populated by the system. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) =
                apply {
                    this.createdAt = createdAt
                }

            /** Application user who created the row in the database, auto-populated by the system. */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) =
                apply {
                    this.createdBy = createdBy
                }

            /** Collection providing hours of operation and other information specific to a day of the week. */
            fun dailyOperations(dailyOperations: List<DailyOperationFull>) = dailyOperations(JsonField.of(dailyOperations))

            /**
             * Sets [Builder.dailyOperations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dailyOperations] with a well-typed `List<DailyOperationFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dailyOperations(dailyOperations: JsonField<List<DailyOperationFull>>) =
                apply {
                    this.dailyOperations = dailyOperations.map { it.toMutableList() }
                }

            /**
             * Adds a single [DailyOperationFull] to [dailyOperations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDailyOperation(dailyOperation: DailyOperationFull) =
                apply {
                    dailyOperations = (dailyOperations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dailyOperations", it).add(dailyOperation)
                    }
                }

            /** The name of the person who made the most recent change to data in the DailyOperations collection. */
            fun dopsLastChangedBy(dopsLastChangedBy: String) = dopsLastChangedBy(JsonField.of(dopsLastChangedBy))

            /**
             * Sets [Builder.dopsLastChangedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dopsLastChangedBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dopsLastChangedBy(dopsLastChangedBy: JsonField<String>) =
                apply {
                    this.dopsLastChangedBy = dopsLastChangedBy
                }

            /** The datetime of the most recent change made to data in the DailyOperations collection, in ISO 8601 UTC format with millisecond precision. */
            fun dopsLastChangedDate(dopsLastChangedDate: OffsetDateTime) = dopsLastChangedDate(JsonField.of(dopsLastChangedDate))

            /**
             * Sets [Builder.dopsLastChangedDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dopsLastChangedDate] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dopsLastChangedDate(dopsLastChangedDate: JsonField<OffsetDateTime>) =
                apply {
                    this.dopsLastChangedDate = dopsLastChangedDate
                }

            /** The reason for the most recent change to data in the dailyOperations collection. */
            fun dopsLastChangedReason(dopsLastChangedReason: String) = dopsLastChangedReason(JsonField.of(dopsLastChangedReason))

            /**
             * Sets [Builder.dopsLastChangedReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dopsLastChangedReason] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dopsLastChangedReason(dopsLastChangedReason: JsonField<String>) =
                apply {
                    this.dopsLastChangedReason = dopsLastChangedReason
                }

            /** Id of the associated launchSite entity. */
            fun idLaunchSite(idLaunchSite: String) = idLaunchSite(JsonField.of(idLaunchSite))

            /**
             * Sets [Builder.idLaunchSite] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idLaunchSite] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idLaunchSite(idLaunchSite: JsonField<String>) =
                apply {
                    this.idLaunchSite = idLaunchSite
                }

            /** Collection providing maximum on ground (MOG) information for specific aircraft at the site associated with this SiteOperations record. */
            fun maximumOnGrounds(maximumOnGrounds: List<MaximumOnGroundFull>) = maximumOnGrounds(JsonField.of(maximumOnGrounds))

            /**
             * Sets [Builder.maximumOnGrounds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumOnGrounds] with a well-typed `List<MaximumOnGroundFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumOnGrounds(maximumOnGrounds: JsonField<List<MaximumOnGroundFull>>) =
                apply {
                    this.maximumOnGrounds = maximumOnGrounds.map { it.toMutableList() }
                }

            /**
             * Adds a single [MaximumOnGroundFull] to [maximumOnGrounds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMaximumOnGround(maximumOnGround: MaximumOnGroundFull) =
                apply {
                    maximumOnGrounds = (maximumOnGrounds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("maximumOnGrounds", it).add(maximumOnGround)
                    }
                }

            /** The name of the person who made the most recent change to data in the MaximumOnGrounds collection. */
            fun mogsLastChangedBy(mogsLastChangedBy: String) = mogsLastChangedBy(JsonField.of(mogsLastChangedBy))

            /**
             * Sets [Builder.mogsLastChangedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mogsLastChangedBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mogsLastChangedBy(mogsLastChangedBy: JsonField<String>) =
                apply {
                    this.mogsLastChangedBy = mogsLastChangedBy
                }

            /** The datetime of the most recent change made to data in the MaximumOnGrounds collection, in ISO 8601 UTC format with millisecond precision. */
            fun mogsLastChangedDate(mogsLastChangedDate: OffsetDateTime) = mogsLastChangedDate(JsonField.of(mogsLastChangedDate))

            /**
             * Sets [Builder.mogsLastChangedDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mogsLastChangedDate] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mogsLastChangedDate(mogsLastChangedDate: JsonField<OffsetDateTime>) =
                apply {
                    this.mogsLastChangedDate = mogsLastChangedDate
                }

            /** The reason for the most recent change to data in the MaximumOnGrounds collection. */
            fun mogsLastChangedReason(mogsLastChangedReason: String) = mogsLastChangedReason(JsonField.of(mogsLastChangedReason))

            /**
             * Sets [Builder.mogsLastChangedReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mogsLastChangedReason] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mogsLastChangedReason(mogsLastChangedReason: JsonField<String>) =
                apply {
                    this.mogsLastChangedReason = mogsLastChangedReason
                }

            /** Collection providing relevant information in the event of deviations/exceptions to normal operations. */
            fun operationalDeviations(operationalDeviations: List<OperationalDeviationFull>) = operationalDeviations(JsonField.of(operationalDeviations))

            /**
             * Sets [Builder.operationalDeviations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operationalDeviations] with a well-typed `List<OperationalDeviationFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operationalDeviations(operationalDeviations: JsonField<List<OperationalDeviationFull>>) =
                apply {
                    this.operationalDeviations = operationalDeviations.map { it.toMutableList() }
                }

            /**
             * Adds a single [OperationalDeviationFull] to [operationalDeviations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOperationalDeviation(operationalDeviation: OperationalDeviationFull) =
                apply {
                    operationalDeviations = (operationalDeviations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("operationalDeviations", it).add(operationalDeviation)
                    }
                }

            /** Collection of planning information associated with this SiteOperations record. */
            fun operationalPlannings(operationalPlannings: List<OperationalPlanningFull>) = operationalPlannings(JsonField.of(operationalPlannings))

            /**
             * Sets [Builder.operationalPlannings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operationalPlannings] with a well-typed `List<OperationalPlanningFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operationalPlannings(operationalPlannings: JsonField<List<OperationalPlanningFull>>) =
                apply {
                    this.operationalPlannings = operationalPlannings.map { it.toMutableList() }
                }

            /**
             * Adds a single [OperationalPlanningFull] to [operationalPlannings].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOperationalPlanning(operationalPlanning: OperationalPlanningFull) =
                apply {
                    operationalPlannings = (operationalPlannings ?: JsonField.of(mutableListOf())).also {
                        checkKnown("operationalPlannings", it).add(operationalPlanning)
                    }
                }

            /** Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin. */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) =
                apply {
                    this.origin = origin
                }

            /** The originating source network on which this record was created, auto-populated by the system. */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) =
                apply {
                    this.origNetwork = origNetwork
                }

            /** Collection detailing operational pathways at the Site associated with this SiteOperations record. */
            fun pathways(pathways: List<PathwayFull>) = pathways(JsonField.of(pathways))

            /**
             * Sets [Builder.pathways] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pathways] with a well-typed `List<PathwayFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pathways(pathways: JsonField<List<PathwayFull>>) =
                apply {
                    this.pathways = pathways.map { it.toMutableList() }
                }

            /**
             * Adds a single [PathwayFull] to [pathways].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPathway(pathway: PathwayFull) =
                apply {
                    pathways = (pathways ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pathways", it).add(pathway)
                    }
                }

            /** The source data library from which this record was received. This could be a remote or tactical UDL or another data library. If null, the record should be assumed to have originated from the primary Enterprise UDL. */
            fun sourceDl(sourceDl: String) = sourceDl(JsonField.of(sourceDl))

            /**
             * Sets [Builder.sourceDl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceDl] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceDl(sourceDl: JsonField<String>) =
                apply {
                    this.sourceDl = sourceDl
                }

            /** Time the row was updated in the database, auto-populated by the system. */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) =
                apply {
                    this.updatedAt = updatedAt
                }

            /** Application user who updated the row in the database, auto-populated by the system. */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedBy(updatedBy: JsonField<String>) =
                apply {
                    this.updatedBy = updatedBy
                }

            /** Collection documenting operational waivers that have been issued for the Site associated with this record. */
            fun waivers(waivers: List<WaiverFull>) = waivers(JsonField.of(waivers))

            /**
             * Sets [Builder.waivers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waivers] with a well-typed `List<WaiverFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waivers(waivers: JsonField<List<WaiverFull>>) =
                apply {
                    this.waivers = waivers.map { it.toMutableList() }
                }

            /**
             * Adds a single [WaiverFull] to [waivers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWaiver(waiver: WaiverFull) =
                apply {
                    waivers = (waivers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("waivers", it).add(waiver)
                    }
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            /**
             * Returns an immutable instance of [SiteOperation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .idSite()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SiteOperation =
                SiteOperation(
                  checkRequired(
                    "classificationMarking", classificationMarking
                  ),
                  checkRequired(
                    "dataMode", dataMode
                  ),
                  checkRequired(
                    "idSite", idSite
                  ),
                  checkRequired(
                    "source", source
                  ),
                  id,
                  createdAt,
                  createdBy,
                  (dailyOperations ?: JsonMissing.of()).map { it.toImmutable() },
                  dopsLastChangedBy,
                  dopsLastChangedDate,
                  dopsLastChangedReason,
                  idLaunchSite,
                  (maximumOnGrounds ?: JsonMissing.of()).map { it.toImmutable() },
                  mogsLastChangedBy,
                  mogsLastChangedDate,
                  mogsLastChangedReason,
                  (operationalDeviations ?: JsonMissing.of()).map { it.toImmutable() },
                  (operationalPlannings ?: JsonMissing.of()).map { it.toImmutable() },
                  origin,
                  origNetwork,
                  (pathways ?: JsonMissing.of()).map { it.toImmutable() },
                  sourceDl,
                  updatedAt,
                  updatedBy,
                  (waivers ?: JsonMissing.of()).map { it.toImmutable() },
                  additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SiteOperation =
            apply {
                if (validated) {
                  return@apply
                }

                classificationMarking()
                dataMode().validate()
                idSite()
                source()
                id()
                createdAt()
                createdBy()
                dailyOperations().ifPresent { it.forEach { it.validate() } }
                dopsLastChangedBy()
                dopsLastChangedDate()
                dopsLastChangedReason()
                idLaunchSite()
                maximumOnGrounds().ifPresent { it.forEach { it.validate() } }
                mogsLastChangedBy()
                mogsLastChangedDate()
                mogsLastChangedReason()
                operationalDeviations().ifPresent { it.forEach { it.validate() } }
                operationalPlannings().ifPresent { it.forEach { it.validate() } }
                origin()
                origNetwork()
                pathways().ifPresent { it.forEach { it.validate() } }
                sourceDl()
                updatedAt()
                updatedBy()
                waivers().ifPresent { it.forEach { it.validate() } }
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
        internal fun validity(): Int = (if (classificationMarking.asKnown().isPresent) 1 else 0) + (dataMode.asKnown().getOrNull()?.validity() ?: 0) + (if (idSite.asKnown().isPresent) 1 else 0) + (if (source.asKnown().isPresent) 1 else 0) + (if (id.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (createdBy.asKnown().isPresent) 1 else 0) + (dailyOperations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (dopsLastChangedBy.asKnown().isPresent) 1 else 0) + (if (dopsLastChangedDate.asKnown().isPresent) 1 else 0) + (if (dopsLastChangedReason.asKnown().isPresent) 1 else 0) + (if (idLaunchSite.asKnown().isPresent) 1 else 0) + (maximumOnGrounds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (mogsLastChangedBy.asKnown().isPresent) 1 else 0) + (if (mogsLastChangedDate.asKnown().isPresent) 1 else 0) + (if (mogsLastChangedReason.asKnown().isPresent) 1 else 0) + (operationalDeviations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (operationalPlannings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (origin.asKnown().isPresent) 1 else 0) + (if (origNetwork.asKnown().isPresent) 1 else 0) + (pathways.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (sourceDl.asKnown().isPresent) 1 else 0) + (if (updatedAt.asKnown().isPresent) 1 else 0) + (if (updatedBy.asKnown().isPresent) 1 else 0) + (waivers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /**
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
         */
        class DataMode @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't match any known
             * member, and you want to know that value. For example, if the SDK is on an older version than the
             * API, then the API may respond with new members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

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
             *
             * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
             *   an older version than the API, then the API may respond with new members that the SDK is unaware
             *   of.
             *
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
             * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
             * class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you want to throw
             * for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
             * for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a known member.
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
             * This differs from the [toString] method because that method is primarily for debugging and generally
             * doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not have the expected
             * primitive type.
             */
            fun asString(): String = _value().asString().orElseThrow { UnifieddatalibraryInvalidDataException("Value is not a String") }

            private var validated: Boolean = false

            fun validate(): DataMode =
                apply {
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
             * Returns a score indicating how many valid values are contained in this object recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

          return /* spotless:off */ other is SiteOperation && classificationMarking == other.classificationMarking && dataMode == other.dataMode && idSite == other.idSite && source == other.source && id == other.id && createdAt == other.createdAt && createdBy == other.createdBy && dailyOperations == other.dailyOperations && dopsLastChangedBy == other.dopsLastChangedBy && dopsLastChangedDate == other.dopsLastChangedDate && dopsLastChangedReason == other.dopsLastChangedReason && idLaunchSite == other.idLaunchSite && maximumOnGrounds == other.maximumOnGrounds && mogsLastChangedBy == other.mogsLastChangedBy && mogsLastChangedDate == other.mogsLastChangedDate && mogsLastChangedReason == other.mogsLastChangedReason && operationalDeviations == other.operationalDeviations && operationalPlannings == other.operationalPlannings && origin == other.origin && origNetwork == other.origNetwork && pathways == other.pathways && sourceDl == other.sourceDl && updatedAt == other.updatedAt && updatedBy == other.updatedBy && waivers == other.waivers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, idSite, source, id, createdAt, createdBy, dailyOperations, dopsLastChangedBy, dopsLastChangedDate, dopsLastChangedReason, idLaunchSite, maximumOnGrounds, mogsLastChangedBy, mogsLastChangedDate, mogsLastChangedReason, operationalDeviations, operationalPlannings, origin, origNetwork, pathways, sourceDl, updatedAt, updatedBy, waivers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "SiteOperation{classificationMarking=$classificationMarking, dataMode=$dataMode, idSite=$idSite, source=$source, id=$id, createdAt=$createdAt, createdBy=$createdBy, dailyOperations=$dailyOperations, dopsLastChangedBy=$dopsLastChangedBy, dopsLastChangedDate=$dopsLastChangedDate, dopsLastChangedReason=$dopsLastChangedReason, idLaunchSite=$idLaunchSite, maximumOnGrounds=$maximumOnGrounds, mogsLastChangedBy=$mogsLastChangedBy, mogsLastChangedDate=$mogsLastChangedDate, mogsLastChangedReason=$mogsLastChangedReason, operationalDeviations=$operationalDeviations, operationalPlannings=$operationalPlannings, origin=$origin, origNetwork=$origNetwork, pathways=$pathways, sourceDl=$sourceDl, updatedAt=$updatedAt, updatedBy=$updatedBy, waivers=$waivers, additionalProperties=$additionalProperties}"
    }

    /** Remarks contain amplifying information for a specific service. The information may contain context and interpretations for consumer use. */
    class SiteRemark private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val idSite: JsonField<String>,
        private val source: JsonField<String>,
        private val text: JsonField<String>,
        private val id: JsonField<String>,
        private val code: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val name: JsonField<String>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val origRmkId: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,

    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking") @ExcludeMissing classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("idSite") @ExcludeMissing idSite: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork") @ExcludeMissing origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origRmkId") @ExcludeMissing origRmkId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of()
        ) : this(
          classificationMarking,
          dataMode,
          idSite,
          source,
          text,
          id,
          code,
          createdAt,
          createdBy,
          name,
          origin,
          origNetwork,
          origRmkId,
          type,
          mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * The ID of the site to which this remark applies.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun idSite(): String = idSite.getRequired("idSite")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * The text of the remark.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The remark type identifier.
         * For example, the Mobility Air Forces (MAF) remark code, defined in the Airfield Suitability and Restriction Report (ASRR).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * The name of the remark.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Unique identifier of the Site Remark record from the originating system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origRmkId(): Optional<String> = origRmkId.getOptional("origRmkId")

        /**
         * The remark type (e.g. Caution, Information, Misc, Restriction, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        fun _classificationMarking(): JsonField<String> = classificationMarking

        /**
         * Returns the raw JSON value of [dataMode].
         *
         * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataMode")
        @ExcludeMissing
        fun _dataMode(): JsonField<DataMode> = dataMode

        /**
         * Returns the raw JSON value of [idSite].
         *
         * Unlike [idSite], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSite")
        @ExcludeMissing
        fun _idSite(): JsonField<String> = idSite

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source")
        @ExcludeMissing
        fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text")
        @ExcludeMissing
        fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id")
        @ExcludeMissing
        fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code")
        @ExcludeMissing
        fun _code(): JsonField<String> = code

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
        @JsonProperty("createdBy")
        @ExcludeMissing
        fun _createdBy(): JsonField<String> = createdBy

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name")
        @ExcludeMissing
        fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [origin].
         *
         * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origin")
        @ExcludeMissing
        fun _origin(): JsonField<String> = origin

        /**
         * Returns the raw JSON value of [origNetwork].
         *
         * Unlike [origNetwork], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [origRmkId].
         *
         * Unlike [origRmkId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origRmkId")
        @ExcludeMissing
        fun _origRmkId(): JsonField<String> = origRmkId

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun _type(): JsonField<String> = type

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
          additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [SiteRemark].
             *
             * The following fields are required:
             *
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .idSite()
             * .source()
             * .text()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [SiteRemark]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var idSite: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var text: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var origRmkId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(siteRemark: SiteRemark) =
                apply {
                    classificationMarking = siteRemark.classificationMarking
                    dataMode = siteRemark.dataMode
                    idSite = siteRemark.idSite
                    source = siteRemark.source
                    text = siteRemark.text
                    id = siteRemark.id
                    code = siteRemark.code
                    createdAt = siteRemark.createdAt
                    createdBy = siteRemark.createdBy
                    name = siteRemark.name
                    origin = siteRemark.origin
                    origNetwork = siteRemark.origNetwork
                    origRmkId = siteRemark.origRmkId
                    type = siteRemark.type
                    additionalProperties = siteRemark.additionalProperties.toMutableMap()
                }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) = classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) =
                apply {
                    this.classificationMarking = classificationMarking
                }

            /**
             * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) =
                apply {
                    this.dataMode = dataMode
                }

            /** The ID of the site to which this remark applies. */
            fun idSite(idSite: String) = idSite(JsonField.of(idSite))

            /**
             * Sets [Builder.idSite] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSite] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSite(idSite: JsonField<String>) =
                apply {
                    this.idSite = idSite
                }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) =
                apply {
                    this.source = source
                }

            /** The text of the remark. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun text(text: JsonField<String>) =
                apply {
                    this.text = text
                }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun id(id: JsonField<String>) =
                apply {
                    this.id = id
                }

            /**
             * The remark type identifier.
             * For example, the Mobility Air Forces (MAF) remark code, defined in the Airfield Suitability and Restriction Report (ASRR).
             */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun code(code: JsonField<String>) =
                apply {
                    this.code = code
                }

            /** Time the row was created in the database, auto-populated by the system. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) =
                apply {
                    this.createdAt = createdAt
                }

            /** Application user who created the row in the database, auto-populated by the system. */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) =
                apply {
                    this.createdBy = createdBy
                }

            /** The name of the remark. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun name(name: JsonField<String>) =
                apply {
                    this.name = name
                }

            /** Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin. */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) =
                apply {
                    this.origin = origin
                }

            /** The originating source network on which this record was created, auto-populated by the system. */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) =
                apply {
                    this.origNetwork = origNetwork
                }

            /** Unique identifier of the Site Remark record from the originating system. */
            fun origRmkId(origRmkId: String) = origRmkId(JsonField.of(origRmkId))

            /**
             * Sets [Builder.origRmkId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origRmkId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origRmkId(origRmkId: JsonField<String>) =
                apply {
                    this.origRmkId = origRmkId
                }

            /** The remark type (e.g. Caution, Information, Misc, Restriction, etc.). */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<String>) =
                apply {
                    this.type = type
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            /**
             * Returns an immutable instance of [SiteRemark].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .idSite()
             * .source()
             * .text()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SiteRemark =
                SiteRemark(
                  checkRequired(
                    "classificationMarking", classificationMarking
                  ),
                  checkRequired(
                    "dataMode", dataMode
                  ),
                  checkRequired(
                    "idSite", idSite
                  ),
                  checkRequired(
                    "source", source
                  ),
                  checkRequired(
                    "text", text
                  ),
                  id,
                  code,
                  createdAt,
                  createdBy,
                  name,
                  origin,
                  origNetwork,
                  origRmkId,
                  type,
                  additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SiteRemark =
            apply {
                if (validated) {
                  return@apply
                }

                classificationMarking()
                dataMode().validate()
                idSite()
                source()
                text()
                id()
                code()
                createdAt()
                createdBy()
                name()
                origin()
                origNetwork()
                origRmkId()
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
         * Returns a score indicating how many valid values are contained in this object recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int = (if (classificationMarking.asKnown().isPresent) 1 else 0) + (dataMode.asKnown().getOrNull()?.validity() ?: 0) + (if (idSite.asKnown().isPresent) 1 else 0) + (if (source.asKnown().isPresent) 1 else 0) + (if (text.asKnown().isPresent) 1 else 0) + (if (id.asKnown().isPresent) 1 else 0) + (if (code.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (createdBy.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0) + (if (origin.asKnown().isPresent) 1 else 0) + (if (origNetwork.asKnown().isPresent) 1 else 0) + (if (origRmkId.asKnown().isPresent) 1 else 0) + (if (type.asKnown().isPresent) 1 else 0)

        /**
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
         */
        class DataMode @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't match any known
             * member, and you want to know that value. For example, if the SDK is on an older version than the
             * API, then the API may respond with new members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

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
             *
             * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
             *   an older version than the API, then the API may respond with new members that the SDK is unaware
             *   of.
             *
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
             * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
             * class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you want to throw
             * for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
             * for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a known member.
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
             * This differs from the [toString] method because that method is primarily for debugging and generally
             * doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not have the expected
             * primitive type.
             */
            fun asString(): String = _value().asString().orElseThrow { UnifieddatalibraryInvalidDataException("Value is not a String") }

            private var validated: Boolean = false

            fun validate(): DataMode =
                apply {
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
             * Returns a score indicating how many valid values are contained in this object recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

          return /* spotless:off */ other is SiteRemark && classificationMarking == other.classificationMarking && dataMode == other.dataMode && idSite == other.idSite && source == other.source && text == other.text && id == other.id && code == other.code && createdAt == other.createdAt && createdBy == other.createdBy && name == other.name && origin == other.origin && origNetwork == other.origNetwork && origRmkId == other.origRmkId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, idSite, source, text, id, code, createdAt, createdBy, name, origin, origNetwork, origRmkId, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "SiteRemark{classificationMarking=$classificationMarking, dataMode=$dataMode, idSite=$idSite, source=$source, text=$text, id=$id, code=$code, createdAt=$createdAt, createdBy=$createdBy, name=$name, origin=$origin, origNetwork=$origNetwork, origRmkId=$origRmkId, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is SiteTupleResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && name == other.name && source == other.source && id == other.id && activity == other.activity && airDefArea == other.airDefArea && allegiance == other.allegiance && altAllegiance == other.altAllegiance && beNumber == other.beNumber && catCode == other.catCode && catText == other.catText && classRating == other.classRating && condition == other.condition && conditionAvail == other.conditionAvail && coord == other.coord && coordDatum == other.coordDatum && coordDerivAcc == other.coordDerivAcc && createdAt == other.createdAt && createdBy == other.createdBy && elevMsl == other.elevMsl && elevMslConfLvl == other.elevMslConfLvl && elevMslDerivAcc == other.elevMslDerivAcc && entity == other.entity && eval == other.eval && faa == other.faa && fpa == other.fpa && functPrimary == other.functPrimary && geoArea == other.geoArea && geoidalMslSep == other.geoidalMslSep && grade == other.grade && iata == other.iata && icao == other.icao && ident == other.ident && idEntity == other.idEntity && idParentSite == other.idParentSite && lzUsage == other.lzUsage && maxRunwayLength == other.maxRunwayLength && milGrid == other.milGrid && milGridSys == other.milGridSys && msnPrimary == other.msnPrimary && msnPrimarySpec == other.msnPrimarySpec && notes == other.notes && nucCap == other.nucCap && operStatus == other.operStatus && origin == other.origin && origLzId == other.origLzId && origNetwork == other.origNetwork && origSiteId == other.origSiteId && osuffix == other.osuffix && pin == other.pin && polSubdiv == other.polSubdiv && popArea == other.popArea && popAreaProx == other.popAreaProx && recStatus == other.recStatus && referenceDoc == other.referenceDoc && resProd == other.resProd && reviewDate == other.reviewDate && runways == other.runways && siteOperations == other.siteOperations && siteRemarks == other.siteRemarks && symCode == other.symCode && type == other.type && updatedAt == other.updatedAt && updatedBy == other.updatedBy && usage == other.usage && utm == other.utm && vegHt == other.vegHt && vegType == other.vegType && wac == other.wac && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, name, source, id, activity, airDefArea, allegiance, altAllegiance, beNumber, catCode, catText, classRating, condition, conditionAvail, coord, coordDatum, coordDerivAcc, createdAt, createdBy, elevMsl, elevMslConfLvl, elevMslDerivAcc, entity, eval, faa, fpa, functPrimary, geoArea, geoidalMslSep, grade, iata, icao, ident, idEntity, idParentSite, lzUsage, maxRunwayLength, milGrid, milGridSys, msnPrimary, msnPrimarySpec, notes, nucCap, operStatus, origin, origLzId, origNetwork, origSiteId, osuffix, pin, polSubdiv, popArea, popAreaProx, recStatus, referenceDoc, resProd, reviewDate, runways, siteOperations, siteRemarks, symCode, type, updatedAt, updatedBy, usage, utm, vegHt, vegType, wac, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "SiteTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, name=$name, source=$source, id=$id, activity=$activity, airDefArea=$airDefArea, allegiance=$allegiance, altAllegiance=$altAllegiance, beNumber=$beNumber, catCode=$catCode, catText=$catText, classRating=$classRating, condition=$condition, conditionAvail=$conditionAvail, coord=$coord, coordDatum=$coordDatum, coordDerivAcc=$coordDerivAcc, createdAt=$createdAt, createdBy=$createdBy, elevMsl=$elevMsl, elevMslConfLvl=$elevMslConfLvl, elevMslDerivAcc=$elevMslDerivAcc, entity=$entity, eval=$eval, faa=$faa, fpa=$fpa, functPrimary=$functPrimary, geoArea=$geoArea, geoidalMslSep=$geoidalMslSep, grade=$grade, iata=$iata, icao=$icao, ident=$ident, idEntity=$idEntity, idParentSite=$idParentSite, lzUsage=$lzUsage, maxRunwayLength=$maxRunwayLength, milGrid=$milGrid, milGridSys=$milGridSys, msnPrimary=$msnPrimary, msnPrimarySpec=$msnPrimarySpec, notes=$notes, nucCap=$nucCap, operStatus=$operStatus, origin=$origin, origLzId=$origLzId, origNetwork=$origNetwork, origSiteId=$origSiteId, osuffix=$osuffix, pin=$pin, polSubdiv=$polSubdiv, popArea=$popArea, popAreaProx=$popAreaProx, recStatus=$recStatus, referenceDoc=$referenceDoc, resProd=$resProd, reviewDate=$reviewDate, runways=$runways, siteOperations=$siteOperations, siteRemarks=$siteRemarks, symCode=$symCode, type=$type, updatedAt=$updatedAt, updatedBy=$updatedBy, usage=$usage, utm=$utm, vegHt=$vegHt, vegType=$vegType, wac=$wac, additionalProperties=$additionalProperties}"
}

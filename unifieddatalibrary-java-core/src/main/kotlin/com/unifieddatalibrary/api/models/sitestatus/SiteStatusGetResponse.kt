// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sitestatus

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

class SiteStatusGetResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idSite: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val cat: JsonField<Cat>,
    private val coldInventory: JsonField<Int>,
    private val commImpairment: JsonField<String>,
    private val cpcon: JsonField<Cpcon>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val eoc: JsonField<Eoc>,
    private val fpcon: JsonField<Fpcon>,
    private val hotInventory: JsonField<Int>,
    private val hpcon: JsonField<Hpcon>,
    private val instStatus: JsonField<InstStatus>,
    private val link: JsonField<List<String>>,
    private val linkStatus: JsonField<List<String>>,
    private val missile: JsonField<List<String>>,
    private val missileInventory: JsonField<List<Int>>,
    private val mobileAltId: JsonField<String>,
    private val opsCapability: JsonField<String>,
    private val opsImpairment: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val pes: JsonField<Boolean>,
    private val poiid: JsonField<String>,
    private val radarStatus: JsonField<List<String>>,
    private val radarSystem: JsonField<List<String>>,
    private val radiateMode: JsonField<String>,
    private val reportTime: JsonField<OffsetDateTime>,
    private val samMode: JsonField<String>,
    private val siteType: JsonField<String>,
    private val timeFunction: JsonField<String>,
    private val trackId: JsonField<String>,
    private val trackRefL16: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val weatherMessage: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idSite") @ExcludeMissing idSite: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cat") @ExcludeMissing cat: JsonField<Cat> = JsonMissing.of(),
        @JsonProperty("coldInventory")
        @ExcludeMissing
        coldInventory: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("commImpairment")
        @ExcludeMissing
        commImpairment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cpcon") @ExcludeMissing cpcon: JsonField<Cpcon> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eoc") @ExcludeMissing eoc: JsonField<Eoc> = JsonMissing.of(),
        @JsonProperty("fpcon") @ExcludeMissing fpcon: JsonField<Fpcon> = JsonMissing.of(),
        @JsonProperty("hotInventory")
        @ExcludeMissing
        hotInventory: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hpcon") @ExcludeMissing hpcon: JsonField<Hpcon> = JsonMissing.of(),
        @JsonProperty("instStatus")
        @ExcludeMissing
        instStatus: JsonField<InstStatus> = JsonMissing.of(),
        @JsonProperty("link") @ExcludeMissing link: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("linkStatus")
        @ExcludeMissing
        linkStatus: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("missile")
        @ExcludeMissing
        missile: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("missileInventory")
        @ExcludeMissing
        missileInventory: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("mobileAltId")
        @ExcludeMissing
        mobileAltId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opsCapability")
        @ExcludeMissing
        opsCapability: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opsImpairment")
        @ExcludeMissing
        opsImpairment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pes") @ExcludeMissing pes: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("poiid") @ExcludeMissing poiid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("radarStatus")
        @ExcludeMissing
        radarStatus: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("radarSystem")
        @ExcludeMissing
        radarSystem: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("radiateMode")
        @ExcludeMissing
        radiateMode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reportTime")
        @ExcludeMissing
        reportTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("samMode") @ExcludeMissing samMode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("siteType") @ExcludeMissing siteType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeFunction")
        @ExcludeMissing
        timeFunction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trackId") @ExcludeMissing trackId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trackRefL16")
        @ExcludeMissing
        trackRefL16: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("weatherMessage")
        @ExcludeMissing
        weatherMessage: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idSite,
        source,
        id,
        cat,
        coldInventory,
        commImpairment,
        cpcon,
        createdAt,
        createdBy,
        eoc,
        fpcon,
        hotInventory,
        hpcon,
        instStatus,
        link,
        linkStatus,
        missile,
        missileInventory,
        mobileAltId,
        opsCapability,
        opsImpairment,
        origin,
        origNetwork,
        pes,
        poiid,
        radarStatus,
        radarSystem,
        radiateMode,
        reportTime,
        samMode,
        siteType,
        timeFunction,
        trackId,
        trackRefL16,
        updatedAt,
        updatedBy,
        weatherMessage,
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
     * The ID of the site, if this status is associated with a fixed site or platform.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idSite(): String = idSite.getRequired("idSite")

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
     * Crisis Action Team (CAT).
     *
     * COLD - Not in use.
     *
     * WARM - Facility prepped/possible skeleton crew.
     *
     * HOT - Fully active.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cat(): Optional<Cat> = cat.getOptional("cat")

    /**
     * Estimated number of cold missiles of all types remaining in weapons system inventory.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coldInventory(): Optional<Int> = coldInventory.getOptional("coldInventory")

    /**
     * The communications component causing the platform or system to be less than fully
     * operational.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun commImpairment(): Optional<String> = commImpairment.getOptional("commImpairment")

    /**
     * Cyberspace Protection Condition (CPCON).
     *
     * 1 - VERY HIGH - Critical functions.
     *
     * 2 - HIGH - Critical and essential functions.
     *
     * 3 - MEDIUM - Critical, essential, and support functions.
     *
     * 4 - LOW - All functions.
     *
     * 5 - VERY LOW - All functions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cpcon(): Optional<Cpcon> = cpcon.getOptional("cpcon")

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
     * Emergency Operations Center (EOC) status.
     *
     * COLD - Not in use.
     *
     * WARM - Facility prepped/possible skeleton crew.
     *
     * HOT - Fully active.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eoc(): Optional<Eoc> = eoc.getOptional("eoc")

    /**
     * Force Protection Condition (FPCON).
     *
     * NORMAL - Applies when a general global threat of possible terrorist activity exists and
     * warrants a routine security posture.
     *
     * ALPHA - Applies when an increased general threat of possible terrorist activity against
     * personnel or facilities. Nature and extent of threat are unpredictable.
     *
     * BRAVO - Applies when an increased or predictable threat of terrorist activity exists.
     *
     * CHARLIE - Applies when an incident occurs or intelligence is received indicating some form of
     * terrorist action against personnel and facilities is imminent.
     *
     * DELTA - Applies in the immediate area where an attack has occurred or when intelligence is
     * received indicating terrorist action against a location is imminent.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fpcon(): Optional<Fpcon> = fpcon.getOptional("fpcon")

    /**
     * Estimated number of hot missiles of all types remaining in weapons system inventory.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hotInventory(): Optional<Int> = hotInventory.getOptional("hotInventory")

    /**
     * Health Protection Condition (HPCON).
     *
     * 0 - Routine, no community transmission.
     *
     * ALPHA - Limited, community transmission beginning.
     *
     * BRAVO - Moderate, increased community transmission.
     *
     * CHARLIE - Substantial, sustained community transmission.
     *
     * DELTA - Severe, widespread community transmission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hpcon(): Optional<Hpcon> = hpcon.getOptional("hpcon")

    /**
     * The status of the installation.
     *
     * FMC - Fully Mission Capable
     *
     * PMC - Partially Mission Capable
     *
     * NMC - Non Mission Capable
     *
     * UNK - Unknown.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun instStatus(): Optional<InstStatus> = instStatus.getOptional("instStatus")

    /**
     * Array of Link item(s) for which status is available and reported (ATDL, IJMS, LINK-1,
     * LINK-11, LINK-11B, LINK-16). This array must be the same length as the linkStatus array.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun link(): Optional<List<String>> = link.getOptional("link")

    /**
     * Array of the status (AVAILABLE, DEGRADED, NOT AVAILABLE, etc.) for each links in the link
     * array. This array must be the same length as the link array, and the status must correspond
     * to the appropriate position index in the link array.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun linkStatus(): Optional<List<String>> = linkStatus.getOptional("linkStatus")

    /**
     * Array of specific missile types for which an estimated inventory count is available (e.g. GMD
     * TYPE A, HARPOON, TOMAHAWK, etc.). This array must be the same length as the missileInventory
     * array.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun missile(): Optional<List<String>> = missile.getOptional("missile")

    /**
     * Array of the quantity of each of the missile items. This array must be the same length as the
     * missile array, and the values must correspond to appropriate position index in the missile
     * array.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun missileInventory(): Optional<List<Int>> = missileInventory.getOptional("missileInventory")

    /**
     * Alternate Identifier for a mobile or transportable platform provided by source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mobileAltId(): Optional<String> = mobileAltId.getOptional("mobileAltId")

    /**
     * The operational status of the platform (e.g. Fully Operational, Partially Operational, Not
     * Operational, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opsCapability(): Optional<String> = opsCapability.getOptional("opsCapability")

    /**
     * The primary component degrading the operational capability of the platform or system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opsImpairment(): Optional<String> = opsImpairment.getOptional("opsImpairment")

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
     * Position Engagement Status flag, Indicating whether this platform is initiating multiple
     * simultaneous engagements. A value of 1/True indicates the platform is initiating multiple
     * simultaneous engagements.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pes(): Optional<Boolean> = pes.getOptional("pes")

    /**
     * The POI (point of interest) ID related to this platform, if available.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun poiid(): Optional<String> = poiid.getOptional("poiid")

    /**
     * Array of the status (NON-OPERATIONAL, OPERATIONAL, OFF) for each radar system in the
     * radarSystem array. This array must be the same length as the radarSystem array, and the
     * status must correspond to the appropriate position index in the radarSystem array.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun radarStatus(): Optional<List<String>> = radarStatus.getOptional("radarStatus")

    /**
     * Array of radar system(s) for which status is available and reported (ACQUISITION, IFFSIF,
     * ILLUMINATING, MODE-4, PRIMARY SURVEILLANCE, SECONDARY SURVEILLANCE, TERTIARY SURVEILLANCE).
     * This array must be the same length as the radarStatus array.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun radarSystem(): Optional<List<String>> = radarSystem.getOptional("radarSystem")

    /**
     * SAM sensor radar surveillance mode (Active, Passive, Off).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun radiateMode(): Optional<String> = radiateMode.getOptional("radiateMode")

    /**
     * Time of report, in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reportTime(): Optional<OffsetDateTime> = reportTime.getOptional("reportTime")

    /**
     * The state of a SAM unit (e.g. Initialization, Standby, Reorientation, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun samMode(): Optional<String> = samMode.getOptional("samMode")

    /**
     * Optional site type or further detail of type. Intended for, but not limited to, Link-16 site
     * type specifications (e.g. ADOC, GACC, SOC, TACC, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun siteType(): Optional<String> = siteType.getOptional("siteType")

    /**
     * Description of the time function associated with the reportTime (e.g. Activation,
     * Deactivation, Arrival, Departure, etc.), if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun timeFunction(): Optional<String> = timeFunction.getOptional("timeFunction")

    /**
     * The track ID related to this platform (if mobile or transportable), if available.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackId(): Optional<String> = trackId.getOptional("trackId")

    /**
     * Link-16 specific reference track number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackRefL16(): Optional<String> = trackRefL16.getOptional("trackRefL16")

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
     * Description of the current weather conditions over a site.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun weatherMessage(): Optional<String> = weatherMessage.getOptional("weatherMessage")

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
     * Returns the raw JSON value of [idSite].
     *
     * Unlike [idSite], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSite") @ExcludeMissing fun _idSite(): JsonField<String> = idSite

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
     * Returns the raw JSON value of [cat].
     *
     * Unlike [cat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cat") @ExcludeMissing fun _cat(): JsonField<Cat> = cat

    /**
     * Returns the raw JSON value of [coldInventory].
     *
     * Unlike [coldInventory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coldInventory")
    @ExcludeMissing
    fun _coldInventory(): JsonField<Int> = coldInventory

    /**
     * Returns the raw JSON value of [commImpairment].
     *
     * Unlike [commImpairment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commImpairment")
    @ExcludeMissing
    fun _commImpairment(): JsonField<String> = commImpairment

    /**
     * Returns the raw JSON value of [cpcon].
     *
     * Unlike [cpcon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cpcon") @ExcludeMissing fun _cpcon(): JsonField<Cpcon> = cpcon

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
     * Returns the raw JSON value of [eoc].
     *
     * Unlike [eoc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eoc") @ExcludeMissing fun _eoc(): JsonField<Eoc> = eoc

    /**
     * Returns the raw JSON value of [fpcon].
     *
     * Unlike [fpcon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fpcon") @ExcludeMissing fun _fpcon(): JsonField<Fpcon> = fpcon

    /**
     * Returns the raw JSON value of [hotInventory].
     *
     * Unlike [hotInventory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hotInventory") @ExcludeMissing fun _hotInventory(): JsonField<Int> = hotInventory

    /**
     * Returns the raw JSON value of [hpcon].
     *
     * Unlike [hpcon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hpcon") @ExcludeMissing fun _hpcon(): JsonField<Hpcon> = hpcon

    /**
     * Returns the raw JSON value of [instStatus].
     *
     * Unlike [instStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instStatus")
    @ExcludeMissing
    fun _instStatus(): JsonField<InstStatus> = instStatus

    /**
     * Returns the raw JSON value of [link].
     *
     * Unlike [link], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("link") @ExcludeMissing fun _link(): JsonField<List<String>> = link

    /**
     * Returns the raw JSON value of [linkStatus].
     *
     * Unlike [linkStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linkStatus")
    @ExcludeMissing
    fun _linkStatus(): JsonField<List<String>> = linkStatus

    /**
     * Returns the raw JSON value of [missile].
     *
     * Unlike [missile], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("missile") @ExcludeMissing fun _missile(): JsonField<List<String>> = missile

    /**
     * Returns the raw JSON value of [missileInventory].
     *
     * Unlike [missileInventory], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("missileInventory")
    @ExcludeMissing
    fun _missileInventory(): JsonField<List<Int>> = missileInventory

    /**
     * Returns the raw JSON value of [mobileAltId].
     *
     * Unlike [mobileAltId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mobileAltId") @ExcludeMissing fun _mobileAltId(): JsonField<String> = mobileAltId

    /**
     * Returns the raw JSON value of [opsCapability].
     *
     * Unlike [opsCapability], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opsCapability")
    @ExcludeMissing
    fun _opsCapability(): JsonField<String> = opsCapability

    /**
     * Returns the raw JSON value of [opsImpairment].
     *
     * Unlike [opsImpairment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opsImpairment")
    @ExcludeMissing
    fun _opsImpairment(): JsonField<String> = opsImpairment

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
     * Returns the raw JSON value of [pes].
     *
     * Unlike [pes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pes") @ExcludeMissing fun _pes(): JsonField<Boolean> = pes

    /**
     * Returns the raw JSON value of [poiid].
     *
     * Unlike [poiid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("poiid") @ExcludeMissing fun _poiid(): JsonField<String> = poiid

    /**
     * Returns the raw JSON value of [radarStatus].
     *
     * Unlike [radarStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("radarStatus")
    @ExcludeMissing
    fun _radarStatus(): JsonField<List<String>> = radarStatus

    /**
     * Returns the raw JSON value of [radarSystem].
     *
     * Unlike [radarSystem], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("radarSystem")
    @ExcludeMissing
    fun _radarSystem(): JsonField<List<String>> = radarSystem

    /**
     * Returns the raw JSON value of [radiateMode].
     *
     * Unlike [radiateMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("radiateMode") @ExcludeMissing fun _radiateMode(): JsonField<String> = radiateMode

    /**
     * Returns the raw JSON value of [reportTime].
     *
     * Unlike [reportTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reportTime")
    @ExcludeMissing
    fun _reportTime(): JsonField<OffsetDateTime> = reportTime

    /**
     * Returns the raw JSON value of [samMode].
     *
     * Unlike [samMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("samMode") @ExcludeMissing fun _samMode(): JsonField<String> = samMode

    /**
     * Returns the raw JSON value of [siteType].
     *
     * Unlike [siteType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("siteType") @ExcludeMissing fun _siteType(): JsonField<String> = siteType

    /**
     * Returns the raw JSON value of [timeFunction].
     *
     * Unlike [timeFunction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeFunction")
    @ExcludeMissing
    fun _timeFunction(): JsonField<String> = timeFunction

    /**
     * Returns the raw JSON value of [trackId].
     *
     * Unlike [trackId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackId") @ExcludeMissing fun _trackId(): JsonField<String> = trackId

    /**
     * Returns the raw JSON value of [trackRefL16].
     *
     * Unlike [trackRefL16], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackRefL16") @ExcludeMissing fun _trackRefL16(): JsonField<String> = trackRefL16

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

    /**
     * Returns the raw JSON value of [weatherMessage].
     *
     * Unlike [weatherMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("weatherMessage")
    @ExcludeMissing
    fun _weatherMessage(): JsonField<String> = weatherMessage

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
         * Returns a mutable builder for constructing an instance of [SiteStatusGetResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idSite()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SiteStatusGetResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idSite: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var cat: JsonField<Cat> = JsonMissing.of()
        private var coldInventory: JsonField<Int> = JsonMissing.of()
        private var commImpairment: JsonField<String> = JsonMissing.of()
        private var cpcon: JsonField<Cpcon> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var eoc: JsonField<Eoc> = JsonMissing.of()
        private var fpcon: JsonField<Fpcon> = JsonMissing.of()
        private var hotInventory: JsonField<Int> = JsonMissing.of()
        private var hpcon: JsonField<Hpcon> = JsonMissing.of()
        private var instStatus: JsonField<InstStatus> = JsonMissing.of()
        private var link: JsonField<MutableList<String>>? = null
        private var linkStatus: JsonField<MutableList<String>>? = null
        private var missile: JsonField<MutableList<String>>? = null
        private var missileInventory: JsonField<MutableList<Int>>? = null
        private var mobileAltId: JsonField<String> = JsonMissing.of()
        private var opsCapability: JsonField<String> = JsonMissing.of()
        private var opsImpairment: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var pes: JsonField<Boolean> = JsonMissing.of()
        private var poiid: JsonField<String> = JsonMissing.of()
        private var radarStatus: JsonField<MutableList<String>>? = null
        private var radarSystem: JsonField<MutableList<String>>? = null
        private var radiateMode: JsonField<String> = JsonMissing.of()
        private var reportTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var samMode: JsonField<String> = JsonMissing.of()
        private var siteType: JsonField<String> = JsonMissing.of()
        private var timeFunction: JsonField<String> = JsonMissing.of()
        private var trackId: JsonField<String> = JsonMissing.of()
        private var trackRefL16: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var weatherMessage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(siteStatusGetResponse: SiteStatusGetResponse) = apply {
            classificationMarking = siteStatusGetResponse.classificationMarking
            dataMode = siteStatusGetResponse.dataMode
            idSite = siteStatusGetResponse.idSite
            source = siteStatusGetResponse.source
            id = siteStatusGetResponse.id
            cat = siteStatusGetResponse.cat
            coldInventory = siteStatusGetResponse.coldInventory
            commImpairment = siteStatusGetResponse.commImpairment
            cpcon = siteStatusGetResponse.cpcon
            createdAt = siteStatusGetResponse.createdAt
            createdBy = siteStatusGetResponse.createdBy
            eoc = siteStatusGetResponse.eoc
            fpcon = siteStatusGetResponse.fpcon
            hotInventory = siteStatusGetResponse.hotInventory
            hpcon = siteStatusGetResponse.hpcon
            instStatus = siteStatusGetResponse.instStatus
            link = siteStatusGetResponse.link.map { it.toMutableList() }
            linkStatus = siteStatusGetResponse.linkStatus.map { it.toMutableList() }
            missile = siteStatusGetResponse.missile.map { it.toMutableList() }
            missileInventory = siteStatusGetResponse.missileInventory.map { it.toMutableList() }
            mobileAltId = siteStatusGetResponse.mobileAltId
            opsCapability = siteStatusGetResponse.opsCapability
            opsImpairment = siteStatusGetResponse.opsImpairment
            origin = siteStatusGetResponse.origin
            origNetwork = siteStatusGetResponse.origNetwork
            pes = siteStatusGetResponse.pes
            poiid = siteStatusGetResponse.poiid
            radarStatus = siteStatusGetResponse.radarStatus.map { it.toMutableList() }
            radarSystem = siteStatusGetResponse.radarSystem.map { it.toMutableList() }
            radiateMode = siteStatusGetResponse.radiateMode
            reportTime = siteStatusGetResponse.reportTime
            samMode = siteStatusGetResponse.samMode
            siteType = siteStatusGetResponse.siteType
            timeFunction = siteStatusGetResponse.timeFunction
            trackId = siteStatusGetResponse.trackId
            trackRefL16 = siteStatusGetResponse.trackRefL16
            updatedAt = siteStatusGetResponse.updatedAt
            updatedBy = siteStatusGetResponse.updatedBy
            weatherMessage = siteStatusGetResponse.weatherMessage
            additionalProperties = siteStatusGetResponse.additionalProperties.toMutableMap()
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

        /** The ID of the site, if this status is associated with a fixed site or platform. */
        fun idSite(idSite: String) = idSite(JsonField.of(idSite))

        /**
         * Sets [Builder.idSite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSite] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSite(idSite: JsonField<String>) = apply { this.idSite = idSite }

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
         * Crisis Action Team (CAT).
         *
         * COLD - Not in use.
         *
         * WARM - Facility prepped/possible skeleton crew.
         *
         * HOT - Fully active.
         */
        fun cat(cat: Cat) = cat(JsonField.of(cat))

        /**
         * Sets [Builder.cat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cat] with a well-typed [Cat] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cat(cat: JsonField<Cat>) = apply { this.cat = cat }

        /** Estimated number of cold missiles of all types remaining in weapons system inventory. */
        fun coldInventory(coldInventory: Int) = coldInventory(JsonField.of(coldInventory))

        /**
         * Sets [Builder.coldInventory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coldInventory] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun coldInventory(coldInventory: JsonField<Int>) = apply {
            this.coldInventory = coldInventory
        }

        /**
         * The communications component causing the platform or system to be less than fully
         * operational.
         */
        fun commImpairment(commImpairment: String) = commImpairment(JsonField.of(commImpairment))

        /**
         * Sets [Builder.commImpairment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commImpairment] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commImpairment(commImpairment: JsonField<String>) = apply {
            this.commImpairment = commImpairment
        }

        /**
         * Cyberspace Protection Condition (CPCON).
         *
         * 1 - VERY HIGH - Critical functions.
         *
         * 2 - HIGH - Critical and essential functions.
         *
         * 3 - MEDIUM - Critical, essential, and support functions.
         *
         * 4 - LOW - All functions.
         *
         * 5 - VERY LOW - All functions.
         */
        fun cpcon(cpcon: Cpcon) = cpcon(JsonField.of(cpcon))

        /**
         * Sets [Builder.cpcon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cpcon] with a well-typed [Cpcon] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cpcon(cpcon: JsonField<Cpcon>) = apply { this.cpcon = cpcon }

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
         * Emergency Operations Center (EOC) status.
         *
         * COLD - Not in use.
         *
         * WARM - Facility prepped/possible skeleton crew.
         *
         * HOT - Fully active.
         */
        fun eoc(eoc: Eoc) = eoc(JsonField.of(eoc))

        /**
         * Sets [Builder.eoc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eoc] with a well-typed [Eoc] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eoc(eoc: JsonField<Eoc>) = apply { this.eoc = eoc }

        /**
         * Force Protection Condition (FPCON).
         *
         * NORMAL - Applies when a general global threat of possible terrorist activity exists and
         * warrants a routine security posture.
         *
         * ALPHA - Applies when an increased general threat of possible terrorist activity against
         * personnel or facilities. Nature and extent of threat are unpredictable.
         *
         * BRAVO - Applies when an increased or predictable threat of terrorist activity exists.
         *
         * CHARLIE - Applies when an incident occurs or intelligence is received indicating some
         * form of terrorist action against personnel and facilities is imminent.
         *
         * DELTA - Applies in the immediate area where an attack has occurred or when intelligence
         * is received indicating terrorist action against a location is imminent.
         */
        fun fpcon(fpcon: Fpcon) = fpcon(JsonField.of(fpcon))

        /**
         * Sets [Builder.fpcon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fpcon] with a well-typed [Fpcon] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fpcon(fpcon: JsonField<Fpcon>) = apply { this.fpcon = fpcon }

        /** Estimated number of hot missiles of all types remaining in weapons system inventory. */
        fun hotInventory(hotInventory: Int) = hotInventory(JsonField.of(hotInventory))

        /**
         * Sets [Builder.hotInventory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hotInventory] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hotInventory(hotInventory: JsonField<Int>) = apply { this.hotInventory = hotInventory }

        /**
         * Health Protection Condition (HPCON).
         *
         * 0 - Routine, no community transmission.
         *
         * ALPHA - Limited, community transmission beginning.
         *
         * BRAVO - Moderate, increased community transmission.
         *
         * CHARLIE - Substantial, sustained community transmission.
         *
         * DELTA - Severe, widespread community transmission.
         */
        fun hpcon(hpcon: Hpcon) = hpcon(JsonField.of(hpcon))

        /**
         * Sets [Builder.hpcon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hpcon] with a well-typed [Hpcon] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hpcon(hpcon: JsonField<Hpcon>) = apply { this.hpcon = hpcon }

        /**
         * The status of the installation.
         *
         * FMC - Fully Mission Capable
         *
         * PMC - Partially Mission Capable
         *
         * NMC - Non Mission Capable
         *
         * UNK - Unknown.
         */
        fun instStatus(instStatus: InstStatus) = instStatus(JsonField.of(instStatus))

        /**
         * Sets [Builder.instStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instStatus] with a well-typed [InstStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instStatus(instStatus: JsonField<InstStatus>) = apply { this.instStatus = instStatus }

        /**
         * Array of Link item(s) for which status is available and reported (ATDL, IJMS, LINK-1,
         * LINK-11, LINK-11B, LINK-16). This array must be the same length as the linkStatus array.
         */
        fun link(link: List<String>) = link(JsonField.of(link))

        /**
         * Sets [Builder.link] to an arbitrary JSON value.
         *
         * You should usually call [Builder.link] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun link(link: JsonField<List<String>>) = apply {
            this.link = link.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.link].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLink(link: String) = apply {
            this.link =
                (this.link ?: JsonField.of(mutableListOf())).also {
                    checkKnown("link", it).add(link)
                }
        }

        /**
         * Array of the status (AVAILABLE, DEGRADED, NOT AVAILABLE, etc.) for each links in the link
         * array. This array must be the same length as the link array, and the status must
         * correspond to the appropriate position index in the link array.
         */
        fun linkStatus(linkStatus: List<String>) = linkStatus(JsonField.of(linkStatus))

        /**
         * Sets [Builder.linkStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkStatus] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun linkStatus(linkStatus: JsonField<List<String>>) = apply {
            this.linkStatus = linkStatus.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.linkStatus].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLinkStatus(linkStatus: String) = apply {
            this.linkStatus =
                (this.linkStatus ?: JsonField.of(mutableListOf())).also {
                    checkKnown("linkStatus", it).add(linkStatus)
                }
        }

        /**
         * Array of specific missile types for which an estimated inventory count is available (e.g.
         * GMD TYPE A, HARPOON, TOMAHAWK, etc.). This array must be the same length as the
         * missileInventory array.
         */
        fun missile(missile: List<String>) = missile(JsonField.of(missile))

        /**
         * Sets [Builder.missile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missile] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun missile(missile: JsonField<List<String>>) = apply {
            this.missile = missile.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.missile].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMissile(missile: String) = apply {
            this.missile =
                (this.missile ?: JsonField.of(mutableListOf())).also {
                    checkKnown("missile", it).add(missile)
                }
        }

        /**
         * Array of the quantity of each of the missile items. This array must be the same length as
         * the missile array, and the values must correspond to appropriate position index in the
         * missile array.
         */
        fun missileInventory(missileInventory: List<Int>) =
            missileInventory(JsonField.of(missileInventory))

        /**
         * Sets [Builder.missileInventory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missileInventory] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun missileInventory(missileInventory: JsonField<List<Int>>) = apply {
            this.missileInventory = missileInventory.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [Builder.missileInventory].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMissileInventory(missileInventory: Int) = apply {
            this.missileInventory =
                (this.missileInventory ?: JsonField.of(mutableListOf())).also {
                    checkKnown("missileInventory", it).add(missileInventory)
                }
        }

        /** Alternate Identifier for a mobile or transportable platform provided by source. */
        fun mobileAltId(mobileAltId: String) = mobileAltId(JsonField.of(mobileAltId))

        /**
         * Sets [Builder.mobileAltId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mobileAltId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mobileAltId(mobileAltId: JsonField<String>) = apply { this.mobileAltId = mobileAltId }

        /**
         * The operational status of the platform (e.g. Fully Operational, Partially Operational,
         * Not Operational, etc.).
         */
        fun opsCapability(opsCapability: String) = opsCapability(JsonField.of(opsCapability))

        /**
         * Sets [Builder.opsCapability] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opsCapability] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun opsCapability(opsCapability: JsonField<String>) = apply {
            this.opsCapability = opsCapability
        }

        /** The primary component degrading the operational capability of the platform or system. */
        fun opsImpairment(opsImpairment: String) = opsImpairment(JsonField.of(opsImpairment))

        /**
         * Sets [Builder.opsImpairment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opsImpairment] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun opsImpairment(opsImpairment: JsonField<String>) = apply {
            this.opsImpairment = opsImpairment
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
         * Position Engagement Status flag, Indicating whether this platform is initiating multiple
         * simultaneous engagements. A value of 1/True indicates the platform is initiating multiple
         * simultaneous engagements.
         */
        fun pes(pes: Boolean) = pes(JsonField.of(pes))

        /**
         * Sets [Builder.pes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pes] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pes(pes: JsonField<Boolean>) = apply { this.pes = pes }

        /** The POI (point of interest) ID related to this platform, if available. */
        fun poiid(poiid: String) = poiid(JsonField.of(poiid))

        /**
         * Sets [Builder.poiid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.poiid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun poiid(poiid: JsonField<String>) = apply { this.poiid = poiid }

        /**
         * Array of the status (NON-OPERATIONAL, OPERATIONAL, OFF) for each radar system in the
         * radarSystem array. This array must be the same length as the radarSystem array, and the
         * status must correspond to the appropriate position index in the radarSystem array.
         */
        fun radarStatus(radarStatus: List<String>) = radarStatus(JsonField.of(radarStatus))

        /**
         * Sets [Builder.radarStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.radarStatus] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun radarStatus(radarStatus: JsonField<List<String>>) = apply {
            this.radarStatus = radarStatus.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.radarStatus].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRadarStatus(radarStatus: String) = apply {
            this.radarStatus =
                (this.radarStatus ?: JsonField.of(mutableListOf())).also {
                    checkKnown("radarStatus", it).add(radarStatus)
                }
        }

        /**
         * Array of radar system(s) for which status is available and reported (ACQUISITION, IFFSIF,
         * ILLUMINATING, MODE-4, PRIMARY SURVEILLANCE, SECONDARY SURVEILLANCE, TERTIARY
         * SURVEILLANCE). This array must be the same length as the radarStatus array.
         */
        fun radarSystem(radarSystem: List<String>) = radarSystem(JsonField.of(radarSystem))

        /**
         * Sets [Builder.radarSystem] to an arbitrary JSON value.
         *
         * You should usually call [Builder.radarSystem] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun radarSystem(radarSystem: JsonField<List<String>>) = apply {
            this.radarSystem = radarSystem.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.radarSystem].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRadarSystem(radarSystem: String) = apply {
            this.radarSystem =
                (this.radarSystem ?: JsonField.of(mutableListOf())).also {
                    checkKnown("radarSystem", it).add(radarSystem)
                }
        }

        /** SAM sensor radar surveillance mode (Active, Passive, Off). */
        fun radiateMode(radiateMode: String) = radiateMode(JsonField.of(radiateMode))

        /**
         * Sets [Builder.radiateMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.radiateMode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun radiateMode(radiateMode: JsonField<String>) = apply { this.radiateMode = radiateMode }

        /** Time of report, in ISO8601 UTC format. */
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

        /** The state of a SAM unit (e.g. Initialization, Standby, Reorientation, etc.). */
        fun samMode(samMode: String) = samMode(JsonField.of(samMode))

        /**
         * Sets [Builder.samMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.samMode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun samMode(samMode: JsonField<String>) = apply { this.samMode = samMode }

        /**
         * Optional site type or further detail of type. Intended for, but not limited to, Link-16
         * site type specifications (e.g. ADOC, GACC, SOC, TACC, etc.).
         */
        fun siteType(siteType: String) = siteType(JsonField.of(siteType))

        /**
         * Sets [Builder.siteType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.siteType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun siteType(siteType: JsonField<String>) = apply { this.siteType = siteType }

        /**
         * Description of the time function associated with the reportTime (e.g. Activation,
         * Deactivation, Arrival, Departure, etc.), if applicable.
         */
        fun timeFunction(timeFunction: String) = timeFunction(JsonField.of(timeFunction))

        /**
         * Sets [Builder.timeFunction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeFunction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeFunction(timeFunction: JsonField<String>) = apply {
            this.timeFunction = timeFunction
        }

        /** The track ID related to this platform (if mobile or transportable), if available. */
        fun trackId(trackId: String) = trackId(JsonField.of(trackId))

        /**
         * Sets [Builder.trackId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trackId(trackId: JsonField<String>) = apply { this.trackId = trackId }

        /** Link-16 specific reference track number. */
        fun trackRefL16(trackRefL16: String) = trackRefL16(JsonField.of(trackRefL16))

        /**
         * Sets [Builder.trackRefL16] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackRefL16] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trackRefL16(trackRefL16: JsonField<String>) = apply { this.trackRefL16 = trackRefL16 }

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

        /** Description of the current weather conditions over a site. */
        fun weatherMessage(weatherMessage: String) = weatherMessage(JsonField.of(weatherMessage))

        /**
         * Sets [Builder.weatherMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weatherMessage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun weatherMessage(weatherMessage: JsonField<String>) = apply {
            this.weatherMessage = weatherMessage
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
         * Returns an immutable instance of [SiteStatusGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idSite()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SiteStatusGetResponse =
            SiteStatusGetResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idSite", idSite),
                checkRequired("source", source),
                id,
                cat,
                coldInventory,
                commImpairment,
                cpcon,
                createdAt,
                createdBy,
                eoc,
                fpcon,
                hotInventory,
                hpcon,
                instStatus,
                (link ?: JsonMissing.of()).map { it.toImmutable() },
                (linkStatus ?: JsonMissing.of()).map { it.toImmutable() },
                (missile ?: JsonMissing.of()).map { it.toImmutable() },
                (missileInventory ?: JsonMissing.of()).map { it.toImmutable() },
                mobileAltId,
                opsCapability,
                opsImpairment,
                origin,
                origNetwork,
                pes,
                poiid,
                (radarStatus ?: JsonMissing.of()).map { it.toImmutable() },
                (radarSystem ?: JsonMissing.of()).map { it.toImmutable() },
                radiateMode,
                reportTime,
                samMode,
                siteType,
                timeFunction,
                trackId,
                trackRefL16,
                updatedAt,
                updatedBy,
                weatherMessage,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SiteStatusGetResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idSite()
        source()
        id()
        cat().ifPresent { it.validate() }
        coldInventory()
        commImpairment()
        cpcon().ifPresent { it.validate() }
        createdAt()
        createdBy()
        eoc().ifPresent { it.validate() }
        fpcon().ifPresent { it.validate() }
        hotInventory()
        hpcon().ifPresent { it.validate() }
        instStatus().ifPresent { it.validate() }
        link()
        linkStatus()
        missile()
        missileInventory()
        mobileAltId()
        opsCapability()
        opsImpairment()
        origin()
        origNetwork()
        pes()
        poiid()
        radarStatus()
        radarSystem()
        radiateMode()
        reportTime()
        samMode()
        siteType()
        timeFunction()
        trackId()
        trackRefL16()
        updatedAt()
        updatedBy()
        weatherMessage()
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
            (if (idSite.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (cat.asKnown().getOrNull()?.validity() ?: 0) +
            (if (coldInventory.asKnown().isPresent) 1 else 0) +
            (if (commImpairment.asKnown().isPresent) 1 else 0) +
            (cpcon.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (eoc.asKnown().getOrNull()?.validity() ?: 0) +
            (fpcon.asKnown().getOrNull()?.validity() ?: 0) +
            (if (hotInventory.asKnown().isPresent) 1 else 0) +
            (hpcon.asKnown().getOrNull()?.validity() ?: 0) +
            (instStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (link.asKnown().getOrNull()?.size ?: 0) +
            (linkStatus.asKnown().getOrNull()?.size ?: 0) +
            (missile.asKnown().getOrNull()?.size ?: 0) +
            (missileInventory.asKnown().getOrNull()?.size ?: 0) +
            (if (mobileAltId.asKnown().isPresent) 1 else 0) +
            (if (opsCapability.asKnown().isPresent) 1 else 0) +
            (if (opsImpairment.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (pes.asKnown().isPresent) 1 else 0) +
            (if (poiid.asKnown().isPresent) 1 else 0) +
            (radarStatus.asKnown().getOrNull()?.size ?: 0) +
            (radarSystem.asKnown().getOrNull()?.size ?: 0) +
            (if (radiateMode.asKnown().isPresent) 1 else 0) +
            (if (reportTime.asKnown().isPresent) 1 else 0) +
            (if (samMode.asKnown().isPresent) 1 else 0) +
            (if (siteType.asKnown().isPresent) 1 else 0) +
            (if (timeFunction.asKnown().isPresent) 1 else 0) +
            (if (trackId.asKnown().isPresent) 1 else 0) +
            (if (trackRefL16.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (weatherMessage.asKnown().isPresent) 1 else 0)

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
     * Crisis Action Team (CAT).
     *
     * COLD - Not in use.
     *
     * WARM - Facility prepped/possible skeleton crew.
     *
     * HOT - Fully active.
     */
    class Cat @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val COLD = of("COLD")

            @JvmField val WARM = of("WARM")

            @JvmField val HOT = of("HOT")

            @JvmStatic fun of(value: String) = Cat(JsonField.of(value))
        }

        /** An enum containing [Cat]'s known values. */
        enum class Known {
            COLD,
            WARM,
            HOT,
        }

        /**
         * An enum containing [Cat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Cat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COLD,
            WARM,
            HOT,
            /** An enum member indicating that [Cat] was instantiated with an unknown value. */
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
                COLD -> Value.COLD
                WARM -> Value.WARM
                HOT -> Value.HOT
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
                COLD -> Known.COLD
                WARM -> Known.WARM
                HOT -> Known.HOT
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Cat: $value")
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

        fun validate(): Cat = apply {
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

            return other is Cat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Cyberspace Protection Condition (CPCON).
     *
     * 1 - VERY HIGH - Critical functions.
     *
     * 2 - HIGH - Critical and essential functions.
     *
     * 3 - MEDIUM - Critical, essential, and support functions.
     *
     * 4 - LOW - All functions.
     *
     * 5 - VERY LOW - All functions.
     */
    class Cpcon @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val _1 = of("1")

            @JvmField val _2 = of("2")

            @JvmField val _3 = of("3")

            @JvmField val _4 = of("4")

            @JvmField val _5 = of("5")

            @JvmStatic fun of(value: String) = Cpcon(JsonField.of(value))
        }

        /** An enum containing [Cpcon]'s known values. */
        enum class Known {
            _1,
            _2,
            _3,
            _4,
            _5,
        }

        /**
         * An enum containing [Cpcon]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Cpcon] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _1,
            _2,
            _3,
            _4,
            _5,
            /** An enum member indicating that [Cpcon] was instantiated with an unknown value. */
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
                _1 -> Value._1
                _2 -> Value._2
                _3 -> Value._3
                _4 -> Value._4
                _5 -> Value._5
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
                _1 -> Known._1
                _2 -> Known._2
                _3 -> Known._3
                _4 -> Known._4
                _5 -> Known._5
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Cpcon: $value")
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

        fun validate(): Cpcon = apply {
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

            return other is Cpcon && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Emergency Operations Center (EOC) status.
     *
     * COLD - Not in use.
     *
     * WARM - Facility prepped/possible skeleton crew.
     *
     * HOT - Fully active.
     */
    class Eoc @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val COLD = of("COLD")

            @JvmField val WARM = of("WARM")

            @JvmField val HOT = of("HOT")

            @JvmStatic fun of(value: String) = Eoc(JsonField.of(value))
        }

        /** An enum containing [Eoc]'s known values. */
        enum class Known {
            COLD,
            WARM,
            HOT,
        }

        /**
         * An enum containing [Eoc]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Eoc] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COLD,
            WARM,
            HOT,
            /** An enum member indicating that [Eoc] was instantiated with an unknown value. */
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
                COLD -> Value.COLD
                WARM -> Value.WARM
                HOT -> Value.HOT
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
                COLD -> Known.COLD
                WARM -> Known.WARM
                HOT -> Known.HOT
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Eoc: $value")
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

        fun validate(): Eoc = apply {
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

            return other is Eoc && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Force Protection Condition (FPCON).
     *
     * NORMAL - Applies when a general global threat of possible terrorist activity exists and
     * warrants a routine security posture.
     *
     * ALPHA - Applies when an increased general threat of possible terrorist activity against
     * personnel or facilities. Nature and extent of threat are unpredictable.
     *
     * BRAVO - Applies when an increased or predictable threat of terrorist activity exists.
     *
     * CHARLIE - Applies when an incident occurs or intelligence is received indicating some form of
     * terrorist action against personnel and facilities is imminent.
     *
     * DELTA - Applies in the immediate area where an attack has occurred or when intelligence is
     * received indicating terrorist action against a location is imminent.
     */
    class Fpcon @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NORMAL = of("NORMAL")

            @JvmField val ALPHA = of("ALPHA")

            @JvmField val BRAVO = of("BRAVO")

            @JvmField val CHARLIE = of("CHARLIE")

            @JvmField val DELTA = of("DELTA")

            @JvmStatic fun of(value: String) = Fpcon(JsonField.of(value))
        }

        /** An enum containing [Fpcon]'s known values. */
        enum class Known {
            NORMAL,
            ALPHA,
            BRAVO,
            CHARLIE,
            DELTA,
        }

        /**
         * An enum containing [Fpcon]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Fpcon] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NORMAL,
            ALPHA,
            BRAVO,
            CHARLIE,
            DELTA,
            /** An enum member indicating that [Fpcon] was instantiated with an unknown value. */
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
                NORMAL -> Value.NORMAL
                ALPHA -> Value.ALPHA
                BRAVO -> Value.BRAVO
                CHARLIE -> Value.CHARLIE
                DELTA -> Value.DELTA
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
                NORMAL -> Known.NORMAL
                ALPHA -> Known.ALPHA
                BRAVO -> Known.BRAVO
                CHARLIE -> Known.CHARLIE
                DELTA -> Known.DELTA
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Fpcon: $value")
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

        fun validate(): Fpcon = apply {
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

            return other is Fpcon && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Health Protection Condition (HPCON).
     *
     * 0 - Routine, no community transmission.
     *
     * ALPHA - Limited, community transmission beginning.
     *
     * BRAVO - Moderate, increased community transmission.
     *
     * CHARLIE - Substantial, sustained community transmission.
     *
     * DELTA - Severe, widespread community transmission.
     */
    class Hpcon @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val _0 = of("0")

            @JvmField val ALPHA = of("ALPHA")

            @JvmField val BRAVO = of("BRAVO")

            @JvmField val CHARLIE = of("CHARLIE")

            @JvmField val DELTA = of("DELTA")

            @JvmStatic fun of(value: String) = Hpcon(JsonField.of(value))
        }

        /** An enum containing [Hpcon]'s known values. */
        enum class Known {
            _0,
            ALPHA,
            BRAVO,
            CHARLIE,
            DELTA,
        }

        /**
         * An enum containing [Hpcon]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Hpcon] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _0,
            ALPHA,
            BRAVO,
            CHARLIE,
            DELTA,
            /** An enum member indicating that [Hpcon] was instantiated with an unknown value. */
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
                _0 -> Value._0
                ALPHA -> Value.ALPHA
                BRAVO -> Value.BRAVO
                CHARLIE -> Value.CHARLIE
                DELTA -> Value.DELTA
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
                _0 -> Known._0
                ALPHA -> Known.ALPHA
                BRAVO -> Known.BRAVO
                CHARLIE -> Known.CHARLIE
                DELTA -> Known.DELTA
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Hpcon: $value")
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

        fun validate(): Hpcon = apply {
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

            return other is Hpcon && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The status of the installation.
     *
     * FMC - Fully Mission Capable
     *
     * PMC - Partially Mission Capable
     *
     * NMC - Non Mission Capable
     *
     * UNK - Unknown.
     */
    class InstStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FMC = of("FMC")

            @JvmField val PMC = of("PMC")

            @JvmField val NMC = of("NMC")

            @JvmField val UNK = of("UNK")

            @JvmStatic fun of(value: String) = InstStatus(JsonField.of(value))
        }

        /** An enum containing [InstStatus]'s known values. */
        enum class Known {
            FMC,
            PMC,
            NMC,
            UNK,
        }

        /**
         * An enum containing [InstStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [InstStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FMC,
            PMC,
            NMC,
            UNK,
            /**
             * An enum member indicating that [InstStatus] was instantiated with an unknown value.
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
                FMC -> Value.FMC
                PMC -> Value.PMC
                NMC -> Value.NMC
                UNK -> Value.UNK
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
                FMC -> Known.FMC
                PMC -> Known.PMC
                NMC -> Known.NMC
                UNK -> Known.UNK
                else -> throw UnifieddatalibraryInvalidDataException("Unknown InstStatus: $value")
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

        fun validate(): InstStatus = apply {
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

            return other is InstStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SiteStatusGetResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            idSite == other.idSite &&
            source == other.source &&
            id == other.id &&
            cat == other.cat &&
            coldInventory == other.coldInventory &&
            commImpairment == other.commImpairment &&
            cpcon == other.cpcon &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            eoc == other.eoc &&
            fpcon == other.fpcon &&
            hotInventory == other.hotInventory &&
            hpcon == other.hpcon &&
            instStatus == other.instStatus &&
            link == other.link &&
            linkStatus == other.linkStatus &&
            missile == other.missile &&
            missileInventory == other.missileInventory &&
            mobileAltId == other.mobileAltId &&
            opsCapability == other.opsCapability &&
            opsImpairment == other.opsImpairment &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            pes == other.pes &&
            poiid == other.poiid &&
            radarStatus == other.radarStatus &&
            radarSystem == other.radarSystem &&
            radiateMode == other.radiateMode &&
            reportTime == other.reportTime &&
            samMode == other.samMode &&
            siteType == other.siteType &&
            timeFunction == other.timeFunction &&
            trackId == other.trackId &&
            trackRefL16 == other.trackRefL16 &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            weatherMessage == other.weatherMessage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            idSite,
            source,
            id,
            cat,
            coldInventory,
            commImpairment,
            cpcon,
            createdAt,
            createdBy,
            eoc,
            fpcon,
            hotInventory,
            hpcon,
            instStatus,
            link,
            linkStatus,
            missile,
            missileInventory,
            mobileAltId,
            opsCapability,
            opsImpairment,
            origin,
            origNetwork,
            pes,
            poiid,
            radarStatus,
            radarSystem,
            radiateMode,
            reportTime,
            samMode,
            siteType,
            timeFunction,
            trackId,
            trackRefL16,
            updatedAt,
            updatedBy,
            weatherMessage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SiteStatusGetResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, idSite=$idSite, source=$source, id=$id, cat=$cat, coldInventory=$coldInventory, commImpairment=$commImpairment, cpcon=$cpcon, createdAt=$createdAt, createdBy=$createdBy, eoc=$eoc, fpcon=$fpcon, hotInventory=$hotInventory, hpcon=$hpcon, instStatus=$instStatus, link=$link, linkStatus=$linkStatus, missile=$missile, missileInventory=$missileInventory, mobileAltId=$mobileAltId, opsCapability=$opsCapability, opsImpairment=$opsImpairment, origin=$origin, origNetwork=$origNetwork, pes=$pes, poiid=$poiid, radarStatus=$radarStatus, radarSystem=$radarSystem, radiateMode=$radiateMode, reportTime=$reportTime, samMode=$samMode, siteType=$siteType, timeFunction=$timeFunction, trackId=$trackId, trackRefL16=$trackRefL16, updatedAt=$updatedAt, updatedBy=$updatedBy, weatherMessage=$weatherMessage, additionalProperties=$additionalProperties}"
}

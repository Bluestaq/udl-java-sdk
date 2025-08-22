// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.surface

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
 * Surface information contains properties related to an airfield's runway, taxiway, and parking.
 * The surface types and characteristics can dictate the airfield's capability of hosting a specific
 * aircraft.
 */
class SurfaceGetResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val name: JsonField<String>,
    private val source: JsonField<String>,
    private val type: JsonField<String>,
    private val id: JsonField<String>,
    private val altSiteId: JsonField<String>,
    private val condition: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val ddtWtKip: JsonField<Double>,
    private val ddtWtKipMod: JsonField<Double>,
    private val ddtWtKipModNote: JsonField<String>,
    private val ddtWtKn: JsonField<Double>,
    private val ddWtKip: JsonField<Double>,
    private val ddWtKipMod: JsonField<Double>,
    private val ddWtKipModNote: JsonField<String>,
    private val ddWtKn: JsonField<Double>,
    private val endLat: JsonField<Double>,
    private val endLon: JsonField<Double>,
    private val idSite: JsonField<String>,
    private val lcn: JsonField<Int>,
    private val ldaFt: JsonField<Double>,
    private val ldaM: JsonField<Double>,
    private val lengthFt: JsonField<Double>,
    private val lengthM: JsonField<Double>,
    private val lighting: JsonField<Boolean>,
    private val lightsAprch: JsonField<Boolean>,
    private val lightsCl: JsonField<Boolean>,
    private val lightsOls: JsonField<Boolean>,
    private val lightsPapi: JsonField<Boolean>,
    private val lightsReil: JsonField<Boolean>,
    private val lightsRwy: JsonField<Boolean>,
    private val lightsSeqfl: JsonField<Boolean>,
    private val lightsTdzl: JsonField<Boolean>,
    private val lightsUnkn: JsonField<Boolean>,
    private val lightsVasi: JsonField<Boolean>,
    private val material: JsonField<String>,
    private val obstacle: JsonField<Boolean>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val pcn: JsonField<String>,
    private val pointReference: JsonField<String>,
    private val primary: JsonField<Boolean>,
    private val rawWbc: JsonField<String>,
    private val sbttWtKip: JsonField<Double>,
    private val sbttWtKipMod: JsonField<Double>,
    private val sbttWtKipModNote: JsonField<String>,
    private val sbttWtKn: JsonField<Double>,
    private val startLat: JsonField<Double>,
    private val startLon: JsonField<Double>,
    private val stWtKip: JsonField<Double>,
    private val stWtKipMod: JsonField<Double>,
    private val stWtKipModNote: JsonField<String>,
    private val stWtKn: JsonField<Double>,
    private val surfaceObstructions: JsonField<List<SurfaceObstruction>>,
    private val sWtKip: JsonField<Double>,
    private val sWtKipMod: JsonField<Double>,
    private val sWtKipModNote: JsonField<String>,
    private val sWtKn: JsonField<Double>,
    private val tdtWtkip: JsonField<Double>,
    private val tdtWtKipMod: JsonField<Double>,
    private val tdtWtKipModNote: JsonField<String>,
    private val tdtWtKn: JsonField<Double>,
    private val trtWtKip: JsonField<Double>,
    private val trtWtKipMod: JsonField<Double>,
    private val trtWtKipModNote: JsonField<String>,
    private val trtWtKn: JsonField<Double>,
    private val ttWtKip: JsonField<Double>,
    private val ttWtKipMod: JsonField<Double>,
    private val ttWtKipModNote: JsonField<String>,
    private val ttWtKn: JsonField<Double>,
    private val tWtKip: JsonField<Double>,
    private val tWtKipMod: JsonField<Double>,
    private val tWtKipModNote: JsonField<String>,
    private val tWtKn: JsonField<Double>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val widthFt: JsonField<Double>,
    private val widthM: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altSiteId") @ExcludeMissing altSiteId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("condition") @ExcludeMissing condition: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ddtWtKip") @ExcludeMissing ddtWtKip: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ddtWtKipMod")
        @ExcludeMissing
        ddtWtKipMod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ddtWtKipModNote")
        @ExcludeMissing
        ddtWtKipModNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ddtWtKN") @ExcludeMissing ddtWtKn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ddWtKip") @ExcludeMissing ddWtKip: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ddWtKipMod")
        @ExcludeMissing
        ddWtKipMod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ddWtKipModNote")
        @ExcludeMissing
        ddWtKipModNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ddWtKN") @ExcludeMissing ddWtKn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("endLat") @ExcludeMissing endLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("endLon") @ExcludeMissing endLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idSite") @ExcludeMissing idSite: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lcn") @ExcludeMissing lcn: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("ldaFt") @ExcludeMissing ldaFt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ldaM") @ExcludeMissing ldaM: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lengthFt") @ExcludeMissing lengthFt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lengthM") @ExcludeMissing lengthM: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lighting") @ExcludeMissing lighting: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lightsAPRCH")
        @ExcludeMissing
        lightsAprch: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lightsCL") @ExcludeMissing lightsCl: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lightsOLS") @ExcludeMissing lightsOls: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lightsPAPI")
        @ExcludeMissing
        lightsPapi: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lightsREIL")
        @ExcludeMissing
        lightsReil: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lightsRWY") @ExcludeMissing lightsRwy: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lightsSEQFL")
        @ExcludeMissing
        lightsSeqfl: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lightsTDZL")
        @ExcludeMissing
        lightsTdzl: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lightsUNKN")
        @ExcludeMissing
        lightsUnkn: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lightsVASI")
        @ExcludeMissing
        lightsVasi: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("material") @ExcludeMissing material: JsonField<String> = JsonMissing.of(),
        @JsonProperty("obstacle") @ExcludeMissing obstacle: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pcn") @ExcludeMissing pcn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pointReference")
        @ExcludeMissing
        pointReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primary") @ExcludeMissing primary: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rawWBC") @ExcludeMissing rawWbc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sbttWtKip") @ExcludeMissing sbttWtKip: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sbttWtKipMod")
        @ExcludeMissing
        sbttWtKipMod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sbttWtKipModNote")
        @ExcludeMissing
        sbttWtKipModNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sbttWtKN") @ExcludeMissing sbttWtKn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("startLat") @ExcludeMissing startLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("startLon") @ExcludeMissing startLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("stWtKip") @ExcludeMissing stWtKip: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("stWtKipMod")
        @ExcludeMissing
        stWtKipMod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("stWtKipModNote")
        @ExcludeMissing
        stWtKipModNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stWtKN") @ExcludeMissing stWtKn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("surfaceObstructions")
        @ExcludeMissing
        surfaceObstructions: JsonField<List<SurfaceObstruction>> = JsonMissing.of(),
        @JsonProperty("sWtKip") @ExcludeMissing sWtKip: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sWtKipMod") @ExcludeMissing sWtKipMod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sWtKipModNote")
        @ExcludeMissing
        sWtKipModNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sWtKN") @ExcludeMissing sWtKn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tdtWtkip") @ExcludeMissing tdtWtkip: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tdtWtKipMod")
        @ExcludeMissing
        tdtWtKipMod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tdtWtKipModNote")
        @ExcludeMissing
        tdtWtKipModNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tdtWtKN") @ExcludeMissing tdtWtKn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trtWtKip") @ExcludeMissing trtWtKip: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trtWtKipMod")
        @ExcludeMissing
        trtWtKipMod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trtWtKipModNote")
        @ExcludeMissing
        trtWtKipModNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trtWtKN") @ExcludeMissing trtWtKn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ttWtKip") @ExcludeMissing ttWtKip: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ttWtKipMod")
        @ExcludeMissing
        ttWtKipMod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ttWtKipModNote")
        @ExcludeMissing
        ttWtKipModNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ttWtKN") @ExcludeMissing ttWtKn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tWtKip") @ExcludeMissing tWtKip: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tWtKipMod") @ExcludeMissing tWtKipMod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tWtKipModNote")
        @ExcludeMissing
        tWtKipModNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tWtKN") @ExcludeMissing tWtKn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("widthFt") @ExcludeMissing widthFt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("widthM") @ExcludeMissing widthM: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        name,
        source,
        type,
        id,
        altSiteId,
        condition,
        createdAt,
        createdBy,
        ddtWtKip,
        ddtWtKipMod,
        ddtWtKipModNote,
        ddtWtKn,
        ddWtKip,
        ddWtKipMod,
        ddWtKipModNote,
        ddWtKn,
        endLat,
        endLon,
        idSite,
        lcn,
        ldaFt,
        ldaM,
        lengthFt,
        lengthM,
        lighting,
        lightsAprch,
        lightsCl,
        lightsOls,
        lightsPapi,
        lightsReil,
        lightsRwy,
        lightsSeqfl,
        lightsTdzl,
        lightsUnkn,
        lightsVasi,
        material,
        obstacle,
        origin,
        origNetwork,
        pcn,
        pointReference,
        primary,
        rawWbc,
        sbttWtKip,
        sbttWtKipMod,
        sbttWtKipModNote,
        sbttWtKn,
        startLat,
        startLon,
        stWtKip,
        stWtKipMod,
        stWtKipModNote,
        stWtKn,
        surfaceObstructions,
        sWtKip,
        sWtKipMod,
        sWtKipModNote,
        sWtKn,
        tdtWtkip,
        tdtWtKipMod,
        tdtWtKipModNote,
        tdtWtKn,
        trtWtKip,
        trtWtKipMod,
        trtWtKipModNote,
        trtWtKn,
        ttWtKip,
        ttWtKipMod,
        ttWtKipModNote,
        ttWtKn,
        tWtKip,
        tWtKipMod,
        tWtKipModNote,
        tWtKn,
        updatedAt,
        updatedBy,
        widthFt,
        widthM,
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
     * Indicator of whether the data is REAL, TEST, SIMULATED, or EXERCISE data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * The surface name or identifier.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The surface type of this record (e.g. RUNWAY, TAXIWAY, PARKING).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Alternate site identifier provided by the source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altSiteId(): Optional<String> = altSiteId.getOptional("altSiteId")

    /**
     * The surface condition (e.g. GOOD, FAIR, POOR, SERIOUS, FAILED, CLOSED, UNKNOWN).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun condition(): Optional<String> = condition.getOptional("condition")

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
     * The max weight allowable on this surface type for a DDT-type (double dual tandem) landing
     * gear configuration, in kilopounds (kip).Note: The corresponding equivalent field is not
     * converted by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ddtWtKip(): Optional<Double> = ddtWtKip.getOptional("ddtWtKip")

    /**
     * The modified max weight allowable on this surface type for a DDT-type (double dual tandem)
     * landing gear configuration, in kilopounds (kip).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ddtWtKipMod(): Optional<Double> = ddtWtKipMod.getOptional("ddtWtKipMod")

    /**
     * User input rationale for the manual modification of the prescribed value indicating the max
     * weight allowable on this surface for a DDT-type (double dual tandem) landing gear
     * configuration. For more information, contact the provider source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ddtWtKipModNote(): Optional<String> = ddtWtKipModNote.getOptional("ddtWtKipModNote")

    /**
     * The max weight allowable on this surface type for a DDT-type (double dual tandem) landing
     * gear configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not
     * converted by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ddtWtKn(): Optional<Double> = ddtWtKn.getOptional("ddtWtKN")

    /**
     * The max weight allowable on this surface type for an FAA 2D-type (twin tandem) landing gear
     * configuration, in kilopounds (kip).Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ddWtKip(): Optional<Double> = ddWtKip.getOptional("ddWtKip")

    /**
     * The modified max weight allowable on this surface type for an FAA 2D-type (twin tandem)
     * landing gear configuration, in kilopounds (kip).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ddWtKipMod(): Optional<Double> = ddWtKipMod.getOptional("ddWtKipMod")

    /**
     * User input rationale for the manual modification of the prescribed value indicating the max
     * weight allowable on this surface for an FAA 2D-type (twin tandem) landing gear configuration.
     * For more information, contact the provider source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ddWtKipModNote(): Optional<String> = ddWtKipModNote.getOptional("ddWtKipModNote")

    /**
     * The max weight allowable on this surface type for an FAA 2D-type (twin tandem) landing gear
     * configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ddWtKn(): Optional<Double> = ddWtKn.getOptional("ddWtKN")

    /**
     * WGS-84 latitude of the coordinate representing the end-point of a surface, in degrees. -90 to
     * 90 degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endLat(): Optional<Double> = endLat.getOptional("endLat")

    /**
     * WGS-84 longitude of the coordinate representing the end-point of a surface, in degrees. -180
     * to 180 degrees (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endLon(): Optional<Double> = endLon.getOptional("endLon")

    /**
     * The unique identifier of the Site record that contains location information about this
     * surface.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSite(): Optional<String> = idSite.getOptional("idSite")

    /**
     * Load classification number or pavement rating which ranks aircraft on a scale of 1 to 120.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lcn(): Optional<Int> = lcn.getOptional("lcn")

    /**
     * The landing distance available for the runway, in feet. Applicable for runway surface types
     * only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ldaFt(): Optional<Double> = ldaFt.getOptional("ldaFt")

    /**
     * The landing distance available for the runway, in meters. Applicable for runway surface types
     * only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ldaM(): Optional<Double> = ldaM.getOptional("ldaM")

    /**
     * The length of the surface type, in feet. Applicable for runway and parking surface types.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lengthFt(): Optional<Double> = lengthFt.getOptional("lengthFt")

    /**
     * The length of the surface type, in meters. Applicable for runway and parking surface types.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lengthM(): Optional<Double> = lengthM.getOptional("lengthM")

    /**
     * Flag indicating the surface has lighting.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lighting(): Optional<Boolean> = lighting.getOptional("lighting")

    /**
     * Flag indicating the runway has approach lights. Applicable for runway surface types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lightsAprch(): Optional<Boolean> = lightsAprch.getOptional("lightsAPRCH")

    /**
     * Flag indicating the runway has centerline lights. Applicable for runway surface types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lightsCl(): Optional<Boolean> = lightsCl.getOptional("lightsCL")

    /**
     * Flag indicating the runway has Optical Landing System (OLS) lights. Applicable for runway
     * surface types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lightsOls(): Optional<Boolean> = lightsOls.getOptional("lightsOLS")

    /**
     * Flag indicating the runway has Precision Approach Path Indicator (PAPI) lights. Applicable
     * for runway surface types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lightsPapi(): Optional<Boolean> = lightsPapi.getOptional("lightsPAPI")

    /**
     * Flag indicating the runway has Runway End Identifier Lights (REIL). Applicable for runway
     * surface types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lightsReil(): Optional<Boolean> = lightsReil.getOptional("lightsREIL")

    /**
     * Flag indicating the runway has edge lighting. Applicable for runway surface types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lightsRwy(): Optional<Boolean> = lightsRwy.getOptional("lightsRWY")

    /**
     * Flag indicating the runway has Sequential Flashing (SEQFL) lights. Applicable for runway
     * surface types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lightsSeqfl(): Optional<Boolean> = lightsSeqfl.getOptional("lightsSEQFL")

    /**
     * Flag indicating the runway has Touchdown Zone lights. Applicable for runway surface types
     * only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lightsTdzl(): Optional<Boolean> = lightsTdzl.getOptional("lightsTDZL")

    /**
     * Flag indicating the runway lighting is unknown. Applicable for runway surface types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lightsUnkn(): Optional<Boolean> = lightsUnkn.getOptional("lightsUNKN")

    /**
     * Flag indicating the runway has Visual Approach Slope Indicator (VASI) lights. Applicable for
     * runway surface types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lightsVasi(): Optional<Boolean> = lightsVasi.getOptional("lightsVASI")

    /**
     * The surface material (e.g. Asphalt, Concrete, Dirt).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun material(): Optional<String> = material.getOptional("material")

    /**
     * Flag indicating that one or more obstacles or obstructions exist in the proximity of this
     * surface.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun obstacle(): Optional<Boolean> = obstacle.getOptional("obstacle")

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
     * Pavement classification number (PCN) and tire pressure code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pcn(): Optional<String> = pcn.getOptional("pcn")

    /**
     * Description of the surface and its dimensions or how it is measured or oriented.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pointReference(): Optional<String> = pointReference.getOptional("pointReference")

    /**
     * Flag indicating this is the primary runway. Applicable for runway surface types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun primary(): Optional<Boolean> = primary.getOptional("primary")

    /**
     * Raw weight bearing capacity value or pavement strength.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rawWbc(): Optional<String> = rawWbc.getOptional("rawWBC")

    /**
     * The max weight allowable on this surface type for an SBTT-type (single belly twin tandem)
     * landing gear configuration, in kilopounds (kip).Note: The corresponding equivalent field is
     * not converted by the UDL and may or may not be supplied by the provider. The
     * provider/consumer is responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sbttWtKip(): Optional<Double> = sbttWtKip.getOptional("sbttWtKip")

    /**
     * The modified max weight allowable on this surface type for an SBTT-type (single belly twin
     * tandem) landing gear configuration, in kilopounds (kip).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sbttWtKipMod(): Optional<Double> = sbttWtKipMod.getOptional("sbttWtKipMod")

    /**
     * User input rationale for the manual modification of the prescribed value indicating the max
     * weight allowable on this surface for an SBTT-type (single belly twin tandem) landing gear
     * configuration. For more information, contact the provider source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sbttWtKipModNote(): Optional<String> = sbttWtKipModNote.getOptional("sbttWtKipModNote")

    /**
     * The max weight allowable on this surface type for an SBTT-type (single belly twin tandem)
     * landing gear configuration, in kilonewtons (kN).Note: The corresponding equivalent field is
     * not converted by the UDL and may or may not be supplied by the provider. The
     * provider/consumer is responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sbttWtKn(): Optional<Double> = sbttWtKn.getOptional("sbttWtKN")

    /**
     * WGS-84 latitude of the coordinate representing the start-point of a surface, in degrees. -90
     * to 90 degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startLat(): Optional<Double> = startLat.getOptional("startLat")

    /**
     * WGS-84 longitude of the coordinate representing the start-point of a surface, in degrees.
     * -180 to 180 degrees (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startLon(): Optional<Double> = startLon.getOptional("startLon")

    /**
     * The max weight allowable on this surface type for an ST-type (single tandem) landing gear
     * configuration, in kilopounds (kip).Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stWtKip(): Optional<Double> = stWtKip.getOptional("stWtKip")

    /**
     * The modified max weight allowable on this surface type for an ST-type (single tandem) landing
     * gear configuration, in kilopounds (kip).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stWtKipMod(): Optional<Double> = stWtKipMod.getOptional("stWtKipMod")

    /**
     * User input rationale for the manual modification of the prescribed value indicating the max
     * weight allowable on this surface for an ST-type (single tandem) landing gear configuration.
     * For more information, contact the provider source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stWtKipModNote(): Optional<String> = stWtKipModNote.getOptional("stWtKipModNote")

    /**
     * The max weight allowable on this surface type for an ST-type (single tandem) landing gear
     * configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stWtKn(): Optional<Double> = stWtKn.getOptional("stWtKN")

    /**
     * An array of SurfaceNavigation objects representing information about obstructions proximal to
     * this surface. This is a read-only field that will be populated with any associated
     * SurfaceObstruction objects for queries that return the full schema.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun surfaceObstructions(): Optional<List<SurfaceObstruction>> =
        surfaceObstructions.getOptional("surfaceObstructions")

    /**
     * The max weight allowable on this surface type for an S-type (single) landing gear
     * configuration, in kilopounds (kip). Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sWtKip(): Optional<Double> = sWtKip.getOptional("sWtKip")

    /**
     * The modified max weight allowable on this surface type for an S-type (single) landing gear
     * configuration, in kilopounds (kip).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sWtKipMod(): Optional<Double> = sWtKipMod.getOptional("sWtKipMod")

    /**
     * User input rationale for the manual modification of the prescribed value indicating the max
     * weight allowable on this surface for an S-type (single) landing gear configuration. For more
     * information, contact the provider source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sWtKipModNote(): Optional<String> = sWtKipModNote.getOptional("sWtKipModNote")

    /**
     * The max weight allowable on this surface type for an S-type (single) landing gear
     * configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sWtKn(): Optional<Double> = sWtKn.getOptional("sWtKN")

    /**
     * The max weight allowable on this surface type for a TDT-type (twin delta tandem) landing gear
     * configuration, in kilopounds (kip).Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tdtWtkip(): Optional<Double> = tdtWtkip.getOptional("tdtWtkip")

    /**
     * The modified max weight allowable on this surface type for a TDT-type (twin delta tandem)
     * landing gear configuration, in kilopounds (kip).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tdtWtKipMod(): Optional<Double> = tdtWtKipMod.getOptional("tdtWtKipMod")

    /**
     * User input rationale for the manual modification of the prescribed value indicating the max
     * weight allowable on this surface for a TDT-type (twin delta tandem) landing gear
     * configuration. For more information, contact the provider source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tdtWtKipModNote(): Optional<String> = tdtWtKipModNote.getOptional("tdtWtKipModNote")

    /**
     * The max weight allowable on this surface type for a TDT-type (twin delta tandem) landing gear
     * configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tdtWtKn(): Optional<Double> = tdtWtKn.getOptional("tdtWtKN")

    /**
     * The max weight allowable on this surface type for a TRT-type (triple tandem) landing gear
     * configuration, in kilopounds (kip).Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trtWtKip(): Optional<Double> = trtWtKip.getOptional("trtWtKip")

    /**
     * The modified max weight allowable on this surface type for a TRT-type (triple tandem) landing
     * gear configuration, in kilopounds (kip).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trtWtKipMod(): Optional<Double> = trtWtKipMod.getOptional("trtWtKipMod")

    /**
     * User input rationale for the manual modification of the prescribed value indicating the max
     * weight allowable on this surface for a TRT-type (triple tandem) landing gear configuration.
     * For more information, contact the provider source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trtWtKipModNote(): Optional<String> = trtWtKipModNote.getOptional("trtWtKipModNote")

    /**
     * The max weight allowable on this surface type for a TRT-type (triple tandem) landing gear
     * configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trtWtKn(): Optional<Double> = trtWtKn.getOptional("trtWtKN")

    /**
     * The max weight allowable on this surface type for a GDSS TT-type (twin tandem) landing gear
     * configuration, in kilopounds (kip).Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ttWtKip(): Optional<Double> = ttWtKip.getOptional("ttWtKip")

    /**
     * The modified max weight allowable on this surface type for a GDSS TT-type (twin tandem)
     * landing gear configuration, in kilopounds (kip).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ttWtKipMod(): Optional<Double> = ttWtKipMod.getOptional("ttWtKipMod")

    /**
     * User input rationale for the manual modification of the prescribed value indicating the max
     * weight allowable on this surface for a GDSS TT-type (twin tandem) landing gear configuration.
     * For more information, contact the provider source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ttWtKipModNote(): Optional<String> = ttWtKipModNote.getOptional("ttWtKipModNote")

    /**
     * The max weight allowable on this surface type for a GDSS TT-type (twin tandem) landing gear
     * configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ttWtKn(): Optional<Double> = ttWtKn.getOptional("ttWtKN")

    /**
     * The max weight allowable on this surface type for a T-type (twin (dual)) landing gear
     * configuration, in kilopounds (kip).Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tWtKip(): Optional<Double> = tWtKip.getOptional("tWtKip")

    /**
     * The modified max weight allowable on this surface type for a T-type (twin (dual)) landing
     * gear configuration, in kilopounds (kip).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tWtKipMod(): Optional<Double> = tWtKipMod.getOptional("tWtKipMod")

    /**
     * User input rationale for the manual modification of the prescribed value indicating the max
     * weight allowable on this surface for a T-type (twin(dual)) landing gear configuration. For
     * more information, contact the provider source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tWtKipModNote(): Optional<String> = tWtKipModNote.getOptional("tWtKipModNote")

    /**
     * The max weight allowable on this surface type for a T-type (twin (dual)) landing gear
     * configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not converted
     * by the UDL and may or may not be supplied by the provider. The provider/consumer is
     * responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tWtKn(): Optional<Double> = tWtKn.getOptional("tWtKN")

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
     * The width of the surface type, in feet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun widthFt(): Optional<Double> = widthFt.getOptional("widthFt")

    /**
     * The width of the surface type, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun widthM(): Optional<Double> = widthM.getOptional("widthM")

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
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [altSiteId].
     *
     * Unlike [altSiteId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altSiteId") @ExcludeMissing fun _altSiteId(): JsonField<String> = altSiteId

    /**
     * Returns the raw JSON value of [condition].
     *
     * Unlike [condition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("condition") @ExcludeMissing fun _condition(): JsonField<String> = condition

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
     * Returns the raw JSON value of [ddtWtKip].
     *
     * Unlike [ddtWtKip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ddtWtKip") @ExcludeMissing fun _ddtWtKip(): JsonField<Double> = ddtWtKip

    /**
     * Returns the raw JSON value of [ddtWtKipMod].
     *
     * Unlike [ddtWtKipMod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ddtWtKipMod") @ExcludeMissing fun _ddtWtKipMod(): JsonField<Double> = ddtWtKipMod

    /**
     * Returns the raw JSON value of [ddtWtKipModNote].
     *
     * Unlike [ddtWtKipModNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ddtWtKipModNote")
    @ExcludeMissing
    fun _ddtWtKipModNote(): JsonField<String> = ddtWtKipModNote

    /**
     * Returns the raw JSON value of [ddtWtKn].
     *
     * Unlike [ddtWtKn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ddtWtKN") @ExcludeMissing fun _ddtWtKn(): JsonField<Double> = ddtWtKn

    /**
     * Returns the raw JSON value of [ddWtKip].
     *
     * Unlike [ddWtKip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ddWtKip") @ExcludeMissing fun _ddWtKip(): JsonField<Double> = ddWtKip

    /**
     * Returns the raw JSON value of [ddWtKipMod].
     *
     * Unlike [ddWtKipMod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ddWtKipMod") @ExcludeMissing fun _ddWtKipMod(): JsonField<Double> = ddWtKipMod

    /**
     * Returns the raw JSON value of [ddWtKipModNote].
     *
     * Unlike [ddWtKipModNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ddWtKipModNote")
    @ExcludeMissing
    fun _ddWtKipModNote(): JsonField<String> = ddWtKipModNote

    /**
     * Returns the raw JSON value of [ddWtKn].
     *
     * Unlike [ddWtKn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ddWtKN") @ExcludeMissing fun _ddWtKn(): JsonField<Double> = ddWtKn

    /**
     * Returns the raw JSON value of [endLat].
     *
     * Unlike [endLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endLat") @ExcludeMissing fun _endLat(): JsonField<Double> = endLat

    /**
     * Returns the raw JSON value of [endLon].
     *
     * Unlike [endLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endLon") @ExcludeMissing fun _endLon(): JsonField<Double> = endLon

    /**
     * Returns the raw JSON value of [idSite].
     *
     * Unlike [idSite], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSite") @ExcludeMissing fun _idSite(): JsonField<String> = idSite

    /**
     * Returns the raw JSON value of [lcn].
     *
     * Unlike [lcn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lcn") @ExcludeMissing fun _lcn(): JsonField<Int> = lcn

    /**
     * Returns the raw JSON value of [ldaFt].
     *
     * Unlike [ldaFt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ldaFt") @ExcludeMissing fun _ldaFt(): JsonField<Double> = ldaFt

    /**
     * Returns the raw JSON value of [ldaM].
     *
     * Unlike [ldaM], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ldaM") @ExcludeMissing fun _ldaM(): JsonField<Double> = ldaM

    /**
     * Returns the raw JSON value of [lengthFt].
     *
     * Unlike [lengthFt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lengthFt") @ExcludeMissing fun _lengthFt(): JsonField<Double> = lengthFt

    /**
     * Returns the raw JSON value of [lengthM].
     *
     * Unlike [lengthM], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lengthM") @ExcludeMissing fun _lengthM(): JsonField<Double> = lengthM

    /**
     * Returns the raw JSON value of [lighting].
     *
     * Unlike [lighting], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lighting") @ExcludeMissing fun _lighting(): JsonField<Boolean> = lighting

    /**
     * Returns the raw JSON value of [lightsAprch].
     *
     * Unlike [lightsAprch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lightsAPRCH")
    @ExcludeMissing
    fun _lightsAprch(): JsonField<Boolean> = lightsAprch

    /**
     * Returns the raw JSON value of [lightsCl].
     *
     * Unlike [lightsCl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lightsCL") @ExcludeMissing fun _lightsCl(): JsonField<Boolean> = lightsCl

    /**
     * Returns the raw JSON value of [lightsOls].
     *
     * Unlike [lightsOls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lightsOLS") @ExcludeMissing fun _lightsOls(): JsonField<Boolean> = lightsOls

    /**
     * Returns the raw JSON value of [lightsPapi].
     *
     * Unlike [lightsPapi], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lightsPAPI") @ExcludeMissing fun _lightsPapi(): JsonField<Boolean> = lightsPapi

    /**
     * Returns the raw JSON value of [lightsReil].
     *
     * Unlike [lightsReil], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lightsREIL") @ExcludeMissing fun _lightsReil(): JsonField<Boolean> = lightsReil

    /**
     * Returns the raw JSON value of [lightsRwy].
     *
     * Unlike [lightsRwy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lightsRWY") @ExcludeMissing fun _lightsRwy(): JsonField<Boolean> = lightsRwy

    /**
     * Returns the raw JSON value of [lightsSeqfl].
     *
     * Unlike [lightsSeqfl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lightsSEQFL")
    @ExcludeMissing
    fun _lightsSeqfl(): JsonField<Boolean> = lightsSeqfl

    /**
     * Returns the raw JSON value of [lightsTdzl].
     *
     * Unlike [lightsTdzl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lightsTDZL") @ExcludeMissing fun _lightsTdzl(): JsonField<Boolean> = lightsTdzl

    /**
     * Returns the raw JSON value of [lightsUnkn].
     *
     * Unlike [lightsUnkn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lightsUNKN") @ExcludeMissing fun _lightsUnkn(): JsonField<Boolean> = lightsUnkn

    /**
     * Returns the raw JSON value of [lightsVasi].
     *
     * Unlike [lightsVasi], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lightsVASI") @ExcludeMissing fun _lightsVasi(): JsonField<Boolean> = lightsVasi

    /**
     * Returns the raw JSON value of [material].
     *
     * Unlike [material], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("material") @ExcludeMissing fun _material(): JsonField<String> = material

    /**
     * Returns the raw JSON value of [obstacle].
     *
     * Unlike [obstacle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obstacle") @ExcludeMissing fun _obstacle(): JsonField<Boolean> = obstacle

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
     * Returns the raw JSON value of [pcn].
     *
     * Unlike [pcn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pcn") @ExcludeMissing fun _pcn(): JsonField<String> = pcn

    /**
     * Returns the raw JSON value of [pointReference].
     *
     * Unlike [pointReference], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pointReference")
    @ExcludeMissing
    fun _pointReference(): JsonField<String> = pointReference

    /**
     * Returns the raw JSON value of [primary].
     *
     * Unlike [primary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary") @ExcludeMissing fun _primary(): JsonField<Boolean> = primary

    /**
     * Returns the raw JSON value of [rawWbc].
     *
     * Unlike [rawWbc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rawWBC") @ExcludeMissing fun _rawWbc(): JsonField<String> = rawWbc

    /**
     * Returns the raw JSON value of [sbttWtKip].
     *
     * Unlike [sbttWtKip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sbttWtKip") @ExcludeMissing fun _sbttWtKip(): JsonField<Double> = sbttWtKip

    /**
     * Returns the raw JSON value of [sbttWtKipMod].
     *
     * Unlike [sbttWtKipMod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sbttWtKipMod")
    @ExcludeMissing
    fun _sbttWtKipMod(): JsonField<Double> = sbttWtKipMod

    /**
     * Returns the raw JSON value of [sbttWtKipModNote].
     *
     * Unlike [sbttWtKipModNote], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sbttWtKipModNote")
    @ExcludeMissing
    fun _sbttWtKipModNote(): JsonField<String> = sbttWtKipModNote

    /**
     * Returns the raw JSON value of [sbttWtKn].
     *
     * Unlike [sbttWtKn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sbttWtKN") @ExcludeMissing fun _sbttWtKn(): JsonField<Double> = sbttWtKn

    /**
     * Returns the raw JSON value of [startLat].
     *
     * Unlike [startLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startLat") @ExcludeMissing fun _startLat(): JsonField<Double> = startLat

    /**
     * Returns the raw JSON value of [startLon].
     *
     * Unlike [startLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startLon") @ExcludeMissing fun _startLon(): JsonField<Double> = startLon

    /**
     * Returns the raw JSON value of [stWtKip].
     *
     * Unlike [stWtKip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stWtKip") @ExcludeMissing fun _stWtKip(): JsonField<Double> = stWtKip

    /**
     * Returns the raw JSON value of [stWtKipMod].
     *
     * Unlike [stWtKipMod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stWtKipMod") @ExcludeMissing fun _stWtKipMod(): JsonField<Double> = stWtKipMod

    /**
     * Returns the raw JSON value of [stWtKipModNote].
     *
     * Unlike [stWtKipModNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stWtKipModNote")
    @ExcludeMissing
    fun _stWtKipModNote(): JsonField<String> = stWtKipModNote

    /**
     * Returns the raw JSON value of [stWtKn].
     *
     * Unlike [stWtKn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stWtKN") @ExcludeMissing fun _stWtKn(): JsonField<Double> = stWtKn

    /**
     * Returns the raw JSON value of [surfaceObstructions].
     *
     * Unlike [surfaceObstructions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("surfaceObstructions")
    @ExcludeMissing
    fun _surfaceObstructions(): JsonField<List<SurfaceObstruction>> = surfaceObstructions

    /**
     * Returns the raw JSON value of [sWtKip].
     *
     * Unlike [sWtKip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sWtKip") @ExcludeMissing fun _sWtKip(): JsonField<Double> = sWtKip

    /**
     * Returns the raw JSON value of [sWtKipMod].
     *
     * Unlike [sWtKipMod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sWtKipMod") @ExcludeMissing fun _sWtKipMod(): JsonField<Double> = sWtKipMod

    /**
     * Returns the raw JSON value of [sWtKipModNote].
     *
     * Unlike [sWtKipModNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sWtKipModNote")
    @ExcludeMissing
    fun _sWtKipModNote(): JsonField<String> = sWtKipModNote

    /**
     * Returns the raw JSON value of [sWtKn].
     *
     * Unlike [sWtKn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sWtKN") @ExcludeMissing fun _sWtKn(): JsonField<Double> = sWtKn

    /**
     * Returns the raw JSON value of [tdtWtkip].
     *
     * Unlike [tdtWtkip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tdtWtkip") @ExcludeMissing fun _tdtWtkip(): JsonField<Double> = tdtWtkip

    /**
     * Returns the raw JSON value of [tdtWtKipMod].
     *
     * Unlike [tdtWtKipMod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tdtWtKipMod") @ExcludeMissing fun _tdtWtKipMod(): JsonField<Double> = tdtWtKipMod

    /**
     * Returns the raw JSON value of [tdtWtKipModNote].
     *
     * Unlike [tdtWtKipModNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tdtWtKipModNote")
    @ExcludeMissing
    fun _tdtWtKipModNote(): JsonField<String> = tdtWtKipModNote

    /**
     * Returns the raw JSON value of [tdtWtKn].
     *
     * Unlike [tdtWtKn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tdtWtKN") @ExcludeMissing fun _tdtWtKn(): JsonField<Double> = tdtWtKn

    /**
     * Returns the raw JSON value of [trtWtKip].
     *
     * Unlike [trtWtKip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trtWtKip") @ExcludeMissing fun _trtWtKip(): JsonField<Double> = trtWtKip

    /**
     * Returns the raw JSON value of [trtWtKipMod].
     *
     * Unlike [trtWtKipMod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trtWtKipMod") @ExcludeMissing fun _trtWtKipMod(): JsonField<Double> = trtWtKipMod

    /**
     * Returns the raw JSON value of [trtWtKipModNote].
     *
     * Unlike [trtWtKipModNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trtWtKipModNote")
    @ExcludeMissing
    fun _trtWtKipModNote(): JsonField<String> = trtWtKipModNote

    /**
     * Returns the raw JSON value of [trtWtKn].
     *
     * Unlike [trtWtKn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trtWtKN") @ExcludeMissing fun _trtWtKn(): JsonField<Double> = trtWtKn

    /**
     * Returns the raw JSON value of [ttWtKip].
     *
     * Unlike [ttWtKip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ttWtKip") @ExcludeMissing fun _ttWtKip(): JsonField<Double> = ttWtKip

    /**
     * Returns the raw JSON value of [ttWtKipMod].
     *
     * Unlike [ttWtKipMod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ttWtKipMod") @ExcludeMissing fun _ttWtKipMod(): JsonField<Double> = ttWtKipMod

    /**
     * Returns the raw JSON value of [ttWtKipModNote].
     *
     * Unlike [ttWtKipModNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ttWtKipModNote")
    @ExcludeMissing
    fun _ttWtKipModNote(): JsonField<String> = ttWtKipModNote

    /**
     * Returns the raw JSON value of [ttWtKn].
     *
     * Unlike [ttWtKn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ttWtKN") @ExcludeMissing fun _ttWtKn(): JsonField<Double> = ttWtKn

    /**
     * Returns the raw JSON value of [tWtKip].
     *
     * Unlike [tWtKip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tWtKip") @ExcludeMissing fun _tWtKip(): JsonField<Double> = tWtKip

    /**
     * Returns the raw JSON value of [tWtKipMod].
     *
     * Unlike [tWtKipMod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tWtKipMod") @ExcludeMissing fun _tWtKipMod(): JsonField<Double> = tWtKipMod

    /**
     * Returns the raw JSON value of [tWtKipModNote].
     *
     * Unlike [tWtKipModNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tWtKipModNote")
    @ExcludeMissing
    fun _tWtKipModNote(): JsonField<String> = tWtKipModNote

    /**
     * Returns the raw JSON value of [tWtKn].
     *
     * Unlike [tWtKn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tWtKN") @ExcludeMissing fun _tWtKn(): JsonField<Double> = tWtKn

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
     * Returns the raw JSON value of [widthFt].
     *
     * Unlike [widthFt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("widthFt") @ExcludeMissing fun _widthFt(): JsonField<Double> = widthFt

    /**
     * Returns the raw JSON value of [widthM].
     *
     * Unlike [widthM], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("widthM") @ExcludeMissing fun _widthM(): JsonField<Double> = widthM

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
         * Returns a mutable builder for constructing an instance of [SurfaceGetResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .source()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SurfaceGetResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var name: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var altSiteId: JsonField<String> = JsonMissing.of()
        private var condition: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var ddtWtKip: JsonField<Double> = JsonMissing.of()
        private var ddtWtKipMod: JsonField<Double> = JsonMissing.of()
        private var ddtWtKipModNote: JsonField<String> = JsonMissing.of()
        private var ddtWtKn: JsonField<Double> = JsonMissing.of()
        private var ddWtKip: JsonField<Double> = JsonMissing.of()
        private var ddWtKipMod: JsonField<Double> = JsonMissing.of()
        private var ddWtKipModNote: JsonField<String> = JsonMissing.of()
        private var ddWtKn: JsonField<Double> = JsonMissing.of()
        private var endLat: JsonField<Double> = JsonMissing.of()
        private var endLon: JsonField<Double> = JsonMissing.of()
        private var idSite: JsonField<String> = JsonMissing.of()
        private var lcn: JsonField<Int> = JsonMissing.of()
        private var ldaFt: JsonField<Double> = JsonMissing.of()
        private var ldaM: JsonField<Double> = JsonMissing.of()
        private var lengthFt: JsonField<Double> = JsonMissing.of()
        private var lengthM: JsonField<Double> = JsonMissing.of()
        private var lighting: JsonField<Boolean> = JsonMissing.of()
        private var lightsAprch: JsonField<Boolean> = JsonMissing.of()
        private var lightsCl: JsonField<Boolean> = JsonMissing.of()
        private var lightsOls: JsonField<Boolean> = JsonMissing.of()
        private var lightsPapi: JsonField<Boolean> = JsonMissing.of()
        private var lightsReil: JsonField<Boolean> = JsonMissing.of()
        private var lightsRwy: JsonField<Boolean> = JsonMissing.of()
        private var lightsSeqfl: JsonField<Boolean> = JsonMissing.of()
        private var lightsTdzl: JsonField<Boolean> = JsonMissing.of()
        private var lightsUnkn: JsonField<Boolean> = JsonMissing.of()
        private var lightsVasi: JsonField<Boolean> = JsonMissing.of()
        private var material: JsonField<String> = JsonMissing.of()
        private var obstacle: JsonField<Boolean> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var pcn: JsonField<String> = JsonMissing.of()
        private var pointReference: JsonField<String> = JsonMissing.of()
        private var primary: JsonField<Boolean> = JsonMissing.of()
        private var rawWbc: JsonField<String> = JsonMissing.of()
        private var sbttWtKip: JsonField<Double> = JsonMissing.of()
        private var sbttWtKipMod: JsonField<Double> = JsonMissing.of()
        private var sbttWtKipModNote: JsonField<String> = JsonMissing.of()
        private var sbttWtKn: JsonField<Double> = JsonMissing.of()
        private var startLat: JsonField<Double> = JsonMissing.of()
        private var startLon: JsonField<Double> = JsonMissing.of()
        private var stWtKip: JsonField<Double> = JsonMissing.of()
        private var stWtKipMod: JsonField<Double> = JsonMissing.of()
        private var stWtKipModNote: JsonField<String> = JsonMissing.of()
        private var stWtKn: JsonField<Double> = JsonMissing.of()
        private var surfaceObstructions: JsonField<MutableList<SurfaceObstruction>>? = null
        private var sWtKip: JsonField<Double> = JsonMissing.of()
        private var sWtKipMod: JsonField<Double> = JsonMissing.of()
        private var sWtKipModNote: JsonField<String> = JsonMissing.of()
        private var sWtKn: JsonField<Double> = JsonMissing.of()
        private var tdtWtkip: JsonField<Double> = JsonMissing.of()
        private var tdtWtKipMod: JsonField<Double> = JsonMissing.of()
        private var tdtWtKipModNote: JsonField<String> = JsonMissing.of()
        private var tdtWtKn: JsonField<Double> = JsonMissing.of()
        private var trtWtKip: JsonField<Double> = JsonMissing.of()
        private var trtWtKipMod: JsonField<Double> = JsonMissing.of()
        private var trtWtKipModNote: JsonField<String> = JsonMissing.of()
        private var trtWtKn: JsonField<Double> = JsonMissing.of()
        private var ttWtKip: JsonField<Double> = JsonMissing.of()
        private var ttWtKipMod: JsonField<Double> = JsonMissing.of()
        private var ttWtKipModNote: JsonField<String> = JsonMissing.of()
        private var ttWtKn: JsonField<Double> = JsonMissing.of()
        private var tWtKip: JsonField<Double> = JsonMissing.of()
        private var tWtKipMod: JsonField<Double> = JsonMissing.of()
        private var tWtKipModNote: JsonField<String> = JsonMissing.of()
        private var tWtKn: JsonField<Double> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var widthFt: JsonField<Double> = JsonMissing.of()
        private var widthM: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(surfaceGetResponse: SurfaceGetResponse) = apply {
            classificationMarking = surfaceGetResponse.classificationMarking
            dataMode = surfaceGetResponse.dataMode
            name = surfaceGetResponse.name
            source = surfaceGetResponse.source
            type = surfaceGetResponse.type
            id = surfaceGetResponse.id
            altSiteId = surfaceGetResponse.altSiteId
            condition = surfaceGetResponse.condition
            createdAt = surfaceGetResponse.createdAt
            createdBy = surfaceGetResponse.createdBy
            ddtWtKip = surfaceGetResponse.ddtWtKip
            ddtWtKipMod = surfaceGetResponse.ddtWtKipMod
            ddtWtKipModNote = surfaceGetResponse.ddtWtKipModNote
            ddtWtKn = surfaceGetResponse.ddtWtKn
            ddWtKip = surfaceGetResponse.ddWtKip
            ddWtKipMod = surfaceGetResponse.ddWtKipMod
            ddWtKipModNote = surfaceGetResponse.ddWtKipModNote
            ddWtKn = surfaceGetResponse.ddWtKn
            endLat = surfaceGetResponse.endLat
            endLon = surfaceGetResponse.endLon
            idSite = surfaceGetResponse.idSite
            lcn = surfaceGetResponse.lcn
            ldaFt = surfaceGetResponse.ldaFt
            ldaM = surfaceGetResponse.ldaM
            lengthFt = surfaceGetResponse.lengthFt
            lengthM = surfaceGetResponse.lengthM
            lighting = surfaceGetResponse.lighting
            lightsAprch = surfaceGetResponse.lightsAprch
            lightsCl = surfaceGetResponse.lightsCl
            lightsOls = surfaceGetResponse.lightsOls
            lightsPapi = surfaceGetResponse.lightsPapi
            lightsReil = surfaceGetResponse.lightsReil
            lightsRwy = surfaceGetResponse.lightsRwy
            lightsSeqfl = surfaceGetResponse.lightsSeqfl
            lightsTdzl = surfaceGetResponse.lightsTdzl
            lightsUnkn = surfaceGetResponse.lightsUnkn
            lightsVasi = surfaceGetResponse.lightsVasi
            material = surfaceGetResponse.material
            obstacle = surfaceGetResponse.obstacle
            origin = surfaceGetResponse.origin
            origNetwork = surfaceGetResponse.origNetwork
            pcn = surfaceGetResponse.pcn
            pointReference = surfaceGetResponse.pointReference
            primary = surfaceGetResponse.primary
            rawWbc = surfaceGetResponse.rawWbc
            sbttWtKip = surfaceGetResponse.sbttWtKip
            sbttWtKipMod = surfaceGetResponse.sbttWtKipMod
            sbttWtKipModNote = surfaceGetResponse.sbttWtKipModNote
            sbttWtKn = surfaceGetResponse.sbttWtKn
            startLat = surfaceGetResponse.startLat
            startLon = surfaceGetResponse.startLon
            stWtKip = surfaceGetResponse.stWtKip
            stWtKipMod = surfaceGetResponse.stWtKipMod
            stWtKipModNote = surfaceGetResponse.stWtKipModNote
            stWtKn = surfaceGetResponse.stWtKn
            surfaceObstructions = surfaceGetResponse.surfaceObstructions.map { it.toMutableList() }
            sWtKip = surfaceGetResponse.sWtKip
            sWtKipMod = surfaceGetResponse.sWtKipMod
            sWtKipModNote = surfaceGetResponse.sWtKipModNote
            sWtKn = surfaceGetResponse.sWtKn
            tdtWtkip = surfaceGetResponse.tdtWtkip
            tdtWtKipMod = surfaceGetResponse.tdtWtKipMod
            tdtWtKipModNote = surfaceGetResponse.tdtWtKipModNote
            tdtWtKn = surfaceGetResponse.tdtWtKn
            trtWtKip = surfaceGetResponse.trtWtKip
            trtWtKipMod = surfaceGetResponse.trtWtKipMod
            trtWtKipModNote = surfaceGetResponse.trtWtKipModNote
            trtWtKn = surfaceGetResponse.trtWtKn
            ttWtKip = surfaceGetResponse.ttWtKip
            ttWtKipMod = surfaceGetResponse.ttWtKipMod
            ttWtKipModNote = surfaceGetResponse.ttWtKipModNote
            ttWtKn = surfaceGetResponse.ttWtKn
            tWtKip = surfaceGetResponse.tWtKip
            tWtKipMod = surfaceGetResponse.tWtKipMod
            tWtKipModNote = surfaceGetResponse.tWtKipModNote
            tWtKn = surfaceGetResponse.tWtKn
            updatedAt = surfaceGetResponse.updatedAt
            updatedBy = surfaceGetResponse.updatedBy
            widthFt = surfaceGetResponse.widthFt
            widthM = surfaceGetResponse.widthM
            additionalProperties = surfaceGetResponse.additionalProperties.toMutableMap()
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

        /** Indicator of whether the data is REAL, TEST, SIMULATED, or EXERCISE data. */
        fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

        /**
         * Sets [Builder.dataMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataMode] with a well-typed [DataMode] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

        /** The surface name or identifier. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** The surface type of this record (e.g. RUNWAY, TAXIWAY, PARKING). */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Alternate site identifier provided by the source. */
        fun altSiteId(altSiteId: String) = altSiteId(JsonField.of(altSiteId))

        /**
         * Sets [Builder.altSiteId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altSiteId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun altSiteId(altSiteId: JsonField<String>) = apply { this.altSiteId = altSiteId }

        /** The surface condition (e.g. GOOD, FAIR, POOR, SERIOUS, FAILED, CLOSED, UNKNOWN). */
        fun condition(condition: String) = condition(JsonField.of(condition))

        /**
         * Sets [Builder.condition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.condition] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun condition(condition: JsonField<String>) = apply { this.condition = condition }

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
         * The max weight allowable on this surface type for a DDT-type (double dual tandem) landing
         * gear configuration, in kilopounds (kip).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun ddtWtKip(ddtWtKip: Double) = ddtWtKip(JsonField.of(ddtWtKip))

        /**
         * Sets [Builder.ddtWtKip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ddtWtKip] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ddtWtKip(ddtWtKip: JsonField<Double>) = apply { this.ddtWtKip = ddtWtKip }

        /**
         * The modified max weight allowable on this surface type for a DDT-type (double dual
         * tandem) landing gear configuration, in kilopounds (kip).
         */
        fun ddtWtKipMod(ddtWtKipMod: Double) = ddtWtKipMod(JsonField.of(ddtWtKipMod))

        /**
         * Sets [Builder.ddtWtKipMod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ddtWtKipMod] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ddtWtKipMod(ddtWtKipMod: JsonField<Double>) = apply { this.ddtWtKipMod = ddtWtKipMod }

        /**
         * User input rationale for the manual modification of the prescribed value indicating the
         * max weight allowable on this surface for a DDT-type (double dual tandem) landing gear
         * configuration. For more information, contact the provider source.
         */
        fun ddtWtKipModNote(ddtWtKipModNote: String) =
            ddtWtKipModNote(JsonField.of(ddtWtKipModNote))

        /**
         * Sets [Builder.ddtWtKipModNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ddtWtKipModNote] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ddtWtKipModNote(ddtWtKipModNote: JsonField<String>) = apply {
            this.ddtWtKipModNote = ddtWtKipModNote
        }

        /**
         * The max weight allowable on this surface type for a DDT-type (double dual tandem) landing
         * gear configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun ddtWtKn(ddtWtKn: Double) = ddtWtKn(JsonField.of(ddtWtKn))

        /**
         * Sets [Builder.ddtWtKn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ddtWtKn] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ddtWtKn(ddtWtKn: JsonField<Double>) = apply { this.ddtWtKn = ddtWtKn }

        /**
         * The max weight allowable on this surface type for an FAA 2D-type (twin tandem) landing
         * gear configuration, in kilopounds (kip).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun ddWtKip(ddWtKip: Double) = ddWtKip(JsonField.of(ddWtKip))

        /**
         * Sets [Builder.ddWtKip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ddWtKip] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ddWtKip(ddWtKip: JsonField<Double>) = apply { this.ddWtKip = ddWtKip }

        /**
         * The modified max weight allowable on this surface type for an FAA 2D-type (twin tandem)
         * landing gear configuration, in kilopounds (kip).
         */
        fun ddWtKipMod(ddWtKipMod: Double) = ddWtKipMod(JsonField.of(ddWtKipMod))

        /**
         * Sets [Builder.ddWtKipMod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ddWtKipMod] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ddWtKipMod(ddWtKipMod: JsonField<Double>) = apply { this.ddWtKipMod = ddWtKipMod }

        /**
         * User input rationale for the manual modification of the prescribed value indicating the
         * max weight allowable on this surface for an FAA 2D-type (twin tandem) landing gear
         * configuration. For more information, contact the provider source.
         */
        fun ddWtKipModNote(ddWtKipModNote: String) = ddWtKipModNote(JsonField.of(ddWtKipModNote))

        /**
         * Sets [Builder.ddWtKipModNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ddWtKipModNote] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ddWtKipModNote(ddWtKipModNote: JsonField<String>) = apply {
            this.ddWtKipModNote = ddWtKipModNote
        }

        /**
         * The max weight allowable on this surface type for an FAA 2D-type (twin tandem) landing
         * gear configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun ddWtKn(ddWtKn: Double) = ddWtKn(JsonField.of(ddWtKn))

        /**
         * Sets [Builder.ddWtKn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ddWtKn] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ddWtKn(ddWtKn: JsonField<Double>) = apply { this.ddWtKn = ddWtKn }

        /**
         * WGS-84 latitude of the coordinate representing the end-point of a surface, in degrees.
         * -90 to 90 degrees (negative values south of equator).
         */
        fun endLat(endLat: Double) = endLat(JsonField.of(endLat))

        /**
         * Sets [Builder.endLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endLat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endLat(endLat: JsonField<Double>) = apply { this.endLat = endLat }

        /**
         * WGS-84 longitude of the coordinate representing the end-point of a surface, in degrees.
         * -180 to 180 degrees (negative values west of Prime Meridian).
         */
        fun endLon(endLon: Double) = endLon(JsonField.of(endLon))

        /**
         * Sets [Builder.endLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endLon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endLon(endLon: JsonField<Double>) = apply { this.endLon = endLon }

        /**
         * The unique identifier of the Site record that contains location information about this
         * surface.
         */
        fun idSite(idSite: String) = idSite(JsonField.of(idSite))

        /**
         * Sets [Builder.idSite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSite] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSite(idSite: JsonField<String>) = apply { this.idSite = idSite }

        /**
         * Load classification number or pavement rating which ranks aircraft on a scale of 1
         * to 120.
         */
        fun lcn(lcn: Int) = lcn(JsonField.of(lcn))

        /**
         * Sets [Builder.lcn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lcn] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lcn(lcn: JsonField<Int>) = apply { this.lcn = lcn }

        /**
         * The landing distance available for the runway, in feet. Applicable for runway surface
         * types only.
         */
        fun ldaFt(ldaFt: Double) = ldaFt(JsonField.of(ldaFt))

        /**
         * Sets [Builder.ldaFt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ldaFt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ldaFt(ldaFt: JsonField<Double>) = apply { this.ldaFt = ldaFt }

        /**
         * The landing distance available for the runway, in meters. Applicable for runway surface
         * types only.
         */
        fun ldaM(ldaM: Double) = ldaM(JsonField.of(ldaM))

        /**
         * Sets [Builder.ldaM] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ldaM] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ldaM(ldaM: JsonField<Double>) = apply { this.ldaM = ldaM }

        /**
         * The length of the surface type, in feet. Applicable for runway and parking surface types.
         */
        fun lengthFt(lengthFt: Double) = lengthFt(JsonField.of(lengthFt))

        /**
         * Sets [Builder.lengthFt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lengthFt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lengthFt(lengthFt: JsonField<Double>) = apply { this.lengthFt = lengthFt }

        /**
         * The length of the surface type, in meters. Applicable for runway and parking surface
         * types.
         */
        fun lengthM(lengthM: Double) = lengthM(JsonField.of(lengthM))

        /**
         * Sets [Builder.lengthM] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lengthM] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lengthM(lengthM: JsonField<Double>) = apply { this.lengthM = lengthM }

        /** Flag indicating the surface has lighting. */
        fun lighting(lighting: Boolean) = lighting(JsonField.of(lighting))

        /**
         * Sets [Builder.lighting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lighting] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lighting(lighting: JsonField<Boolean>) = apply { this.lighting = lighting }

        /**
         * Flag indicating the runway has approach lights. Applicable for runway surface types only.
         */
        fun lightsAprch(lightsAprch: Boolean) = lightsAprch(JsonField.of(lightsAprch))

        /**
         * Sets [Builder.lightsAprch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lightsAprch] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lightsAprch(lightsAprch: JsonField<Boolean>) = apply { this.lightsAprch = lightsAprch }

        /**
         * Flag indicating the runway has centerline lights. Applicable for runway surface types
         * only.
         */
        fun lightsCl(lightsCl: Boolean) = lightsCl(JsonField.of(lightsCl))

        /**
         * Sets [Builder.lightsCl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lightsCl] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lightsCl(lightsCl: JsonField<Boolean>) = apply { this.lightsCl = lightsCl }

        /**
         * Flag indicating the runway has Optical Landing System (OLS) lights. Applicable for runway
         * surface types only.
         */
        fun lightsOls(lightsOls: Boolean) = lightsOls(JsonField.of(lightsOls))

        /**
         * Sets [Builder.lightsOls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lightsOls] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lightsOls(lightsOls: JsonField<Boolean>) = apply { this.lightsOls = lightsOls }

        /**
         * Flag indicating the runway has Precision Approach Path Indicator (PAPI) lights.
         * Applicable for runway surface types only.
         */
        fun lightsPapi(lightsPapi: Boolean) = lightsPapi(JsonField.of(lightsPapi))

        /**
         * Sets [Builder.lightsPapi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lightsPapi] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lightsPapi(lightsPapi: JsonField<Boolean>) = apply { this.lightsPapi = lightsPapi }

        /**
         * Flag indicating the runway has Runway End Identifier Lights (REIL). Applicable for runway
         * surface types only.
         */
        fun lightsReil(lightsReil: Boolean) = lightsReil(JsonField.of(lightsReil))

        /**
         * Sets [Builder.lightsReil] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lightsReil] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lightsReil(lightsReil: JsonField<Boolean>) = apply { this.lightsReil = lightsReil }

        /**
         * Flag indicating the runway has edge lighting. Applicable for runway surface types only.
         */
        fun lightsRwy(lightsRwy: Boolean) = lightsRwy(JsonField.of(lightsRwy))

        /**
         * Sets [Builder.lightsRwy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lightsRwy] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lightsRwy(lightsRwy: JsonField<Boolean>) = apply { this.lightsRwy = lightsRwy }

        /**
         * Flag indicating the runway has Sequential Flashing (SEQFL) lights. Applicable for runway
         * surface types only.
         */
        fun lightsSeqfl(lightsSeqfl: Boolean) = lightsSeqfl(JsonField.of(lightsSeqfl))

        /**
         * Sets [Builder.lightsSeqfl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lightsSeqfl] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lightsSeqfl(lightsSeqfl: JsonField<Boolean>) = apply { this.lightsSeqfl = lightsSeqfl }

        /**
         * Flag indicating the runway has Touchdown Zone lights. Applicable for runway surface types
         * only.
         */
        fun lightsTdzl(lightsTdzl: Boolean) = lightsTdzl(JsonField.of(lightsTdzl))

        /**
         * Sets [Builder.lightsTdzl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lightsTdzl] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lightsTdzl(lightsTdzl: JsonField<Boolean>) = apply { this.lightsTdzl = lightsTdzl }

        /**
         * Flag indicating the runway lighting is unknown. Applicable for runway surface types only.
         */
        fun lightsUnkn(lightsUnkn: Boolean) = lightsUnkn(JsonField.of(lightsUnkn))

        /**
         * Sets [Builder.lightsUnkn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lightsUnkn] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lightsUnkn(lightsUnkn: JsonField<Boolean>) = apply { this.lightsUnkn = lightsUnkn }

        /**
         * Flag indicating the runway has Visual Approach Slope Indicator (VASI) lights. Applicable
         * for runway surface types only.
         */
        fun lightsVasi(lightsVasi: Boolean) = lightsVasi(JsonField.of(lightsVasi))

        /**
         * Sets [Builder.lightsVasi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lightsVasi] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lightsVasi(lightsVasi: JsonField<Boolean>) = apply { this.lightsVasi = lightsVasi }

        /** The surface material (e.g. Asphalt, Concrete, Dirt). */
        fun material(material: String) = material(JsonField.of(material))

        /**
         * Sets [Builder.material] to an arbitrary JSON value.
         *
         * You should usually call [Builder.material] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun material(material: JsonField<String>) = apply { this.material = material }

        /**
         * Flag indicating that one or more obstacles or obstructions exist in the proximity of this
         * surface.
         */
        fun obstacle(obstacle: Boolean) = obstacle(JsonField.of(obstacle))

        /**
         * Sets [Builder.obstacle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obstacle] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun obstacle(obstacle: JsonField<Boolean>) = apply { this.obstacle = obstacle }

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

        /** Pavement classification number (PCN) and tire pressure code. */
        fun pcn(pcn: String) = pcn(JsonField.of(pcn))

        /**
         * Sets [Builder.pcn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pcn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pcn(pcn: JsonField<String>) = apply { this.pcn = pcn }

        /** Description of the surface and its dimensions or how it is measured or oriented. */
        fun pointReference(pointReference: String) = pointReference(JsonField.of(pointReference))

        /**
         * Sets [Builder.pointReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pointReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pointReference(pointReference: JsonField<String>) = apply {
            this.pointReference = pointReference
        }

        /** Flag indicating this is the primary runway. Applicable for runway surface types only. */
        fun primary(primary: Boolean) = primary(JsonField.of(primary))

        /**
         * Sets [Builder.primary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primary] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun primary(primary: JsonField<Boolean>) = apply { this.primary = primary }

        /** Raw weight bearing capacity value or pavement strength. */
        fun rawWbc(rawWbc: String) = rawWbc(JsonField.of(rawWbc))

        /**
         * Sets [Builder.rawWbc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawWbc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rawWbc(rawWbc: JsonField<String>) = apply { this.rawWbc = rawWbc }

        /**
         * The max weight allowable on this surface type for an SBTT-type (single belly twin tandem)
         * landing gear configuration, in kilopounds (kip).Note: The corresponding equivalent field
         * is not converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun sbttWtKip(sbttWtKip: Double) = sbttWtKip(JsonField.of(sbttWtKip))

        /**
         * Sets [Builder.sbttWtKip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sbttWtKip] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sbttWtKip(sbttWtKip: JsonField<Double>) = apply { this.sbttWtKip = sbttWtKip }

        /**
         * The modified max weight allowable on this surface type for an SBTT-type (single belly
         * twin tandem) landing gear configuration, in kilopounds (kip).
         */
        fun sbttWtKipMod(sbttWtKipMod: Double) = sbttWtKipMod(JsonField.of(sbttWtKipMod))

        /**
         * Sets [Builder.sbttWtKipMod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sbttWtKipMod] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sbttWtKipMod(sbttWtKipMod: JsonField<Double>) = apply {
            this.sbttWtKipMod = sbttWtKipMod
        }

        /**
         * User input rationale for the manual modification of the prescribed value indicating the
         * max weight allowable on this surface for an SBTT-type (single belly twin tandem) landing
         * gear configuration. For more information, contact the provider source.
         */
        fun sbttWtKipModNote(sbttWtKipModNote: String) =
            sbttWtKipModNote(JsonField.of(sbttWtKipModNote))

        /**
         * Sets [Builder.sbttWtKipModNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sbttWtKipModNote] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sbttWtKipModNote(sbttWtKipModNote: JsonField<String>) = apply {
            this.sbttWtKipModNote = sbttWtKipModNote
        }

        /**
         * The max weight allowable on this surface type for an SBTT-type (single belly twin tandem)
         * landing gear configuration, in kilonewtons (kN).Note: The corresponding equivalent field
         * is not converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun sbttWtKn(sbttWtKn: Double) = sbttWtKn(JsonField.of(sbttWtKn))

        /**
         * Sets [Builder.sbttWtKn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sbttWtKn] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sbttWtKn(sbttWtKn: JsonField<Double>) = apply { this.sbttWtKn = sbttWtKn }

        /**
         * WGS-84 latitude of the coordinate representing the start-point of a surface, in degrees.
         * -90 to 90 degrees (negative values south of equator).
         */
        fun startLat(startLat: Double) = startLat(JsonField.of(startLat))

        /**
         * Sets [Builder.startLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startLat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startLat(startLat: JsonField<Double>) = apply { this.startLat = startLat }

        /**
         * WGS-84 longitude of the coordinate representing the start-point of a surface, in degrees.
         * -180 to 180 degrees (negative values west of Prime Meridian).
         */
        fun startLon(startLon: Double) = startLon(JsonField.of(startLon))

        /**
         * Sets [Builder.startLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startLon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startLon(startLon: JsonField<Double>) = apply { this.startLon = startLon }

        /**
         * The max weight allowable on this surface type for an ST-type (single tandem) landing gear
         * configuration, in kilopounds (kip).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun stWtKip(stWtKip: Double) = stWtKip(JsonField.of(stWtKip))

        /**
         * Sets [Builder.stWtKip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stWtKip] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stWtKip(stWtKip: JsonField<Double>) = apply { this.stWtKip = stWtKip }

        /**
         * The modified max weight allowable on this surface type for an ST-type (single tandem)
         * landing gear configuration, in kilopounds (kip).
         */
        fun stWtKipMod(stWtKipMod: Double) = stWtKipMod(JsonField.of(stWtKipMod))

        /**
         * Sets [Builder.stWtKipMod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stWtKipMod] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stWtKipMod(stWtKipMod: JsonField<Double>) = apply { this.stWtKipMod = stWtKipMod }

        /**
         * User input rationale for the manual modification of the prescribed value indicating the
         * max weight allowable on this surface for an ST-type (single tandem) landing gear
         * configuration. For more information, contact the provider source.
         */
        fun stWtKipModNote(stWtKipModNote: String) = stWtKipModNote(JsonField.of(stWtKipModNote))

        /**
         * Sets [Builder.stWtKipModNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stWtKipModNote] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stWtKipModNote(stWtKipModNote: JsonField<String>) = apply {
            this.stWtKipModNote = stWtKipModNote
        }

        /**
         * The max weight allowable on this surface type for an ST-type (single tandem) landing gear
         * configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun stWtKn(stWtKn: Double) = stWtKn(JsonField.of(stWtKn))

        /**
         * Sets [Builder.stWtKn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stWtKn] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stWtKn(stWtKn: JsonField<Double>) = apply { this.stWtKn = stWtKn }

        /**
         * An array of SurfaceNavigation objects representing information about obstructions
         * proximal to this surface. This is a read-only field that will be populated with any
         * associated SurfaceObstruction objects for queries that return the full schema.
         */
        fun surfaceObstructions(surfaceObstructions: List<SurfaceObstruction>) =
            surfaceObstructions(JsonField.of(surfaceObstructions))

        /**
         * Sets [Builder.surfaceObstructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.surfaceObstructions] with a well-typed
         * `List<SurfaceObstruction>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun surfaceObstructions(surfaceObstructions: JsonField<List<SurfaceObstruction>>) = apply {
            this.surfaceObstructions = surfaceObstructions.map { it.toMutableList() }
        }

        /**
         * Adds a single [SurfaceObstruction] to [surfaceObstructions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSurfaceObstruction(surfaceObstruction: SurfaceObstruction) = apply {
            surfaceObstructions =
                (surfaceObstructions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("surfaceObstructions", it).add(surfaceObstruction)
                }
        }

        /**
         * The max weight allowable on this surface type for an S-type (single) landing gear
         * configuration, in kilopounds (kip). Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun sWtKip(sWtKip: Double) = sWtKip(JsonField.of(sWtKip))

        /**
         * Sets [Builder.sWtKip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sWtKip] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sWtKip(sWtKip: JsonField<Double>) = apply { this.sWtKip = sWtKip }

        /**
         * The modified max weight allowable on this surface type for an S-type (single) landing
         * gear configuration, in kilopounds (kip).
         */
        fun sWtKipMod(sWtKipMod: Double) = sWtKipMod(JsonField.of(sWtKipMod))

        /**
         * Sets [Builder.sWtKipMod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sWtKipMod] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sWtKipMod(sWtKipMod: JsonField<Double>) = apply { this.sWtKipMod = sWtKipMod }

        /**
         * User input rationale for the manual modification of the prescribed value indicating the
         * max weight allowable on this surface for an S-type (single) landing gear configuration.
         * For more information, contact the provider source.
         */
        fun sWtKipModNote(sWtKipModNote: String) = sWtKipModNote(JsonField.of(sWtKipModNote))

        /**
         * Sets [Builder.sWtKipModNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sWtKipModNote] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sWtKipModNote(sWtKipModNote: JsonField<String>) = apply {
            this.sWtKipModNote = sWtKipModNote
        }

        /**
         * The max weight allowable on this surface type for an S-type (single) landing gear
         * configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun sWtKn(sWtKn: Double) = sWtKn(JsonField.of(sWtKn))

        /**
         * Sets [Builder.sWtKn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sWtKn] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sWtKn(sWtKn: JsonField<Double>) = apply { this.sWtKn = sWtKn }

        /**
         * The max weight allowable on this surface type for a TDT-type (twin delta tandem) landing
         * gear configuration, in kilopounds (kip).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun tdtWtkip(tdtWtkip: Double) = tdtWtkip(JsonField.of(tdtWtkip))

        /**
         * Sets [Builder.tdtWtkip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tdtWtkip] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tdtWtkip(tdtWtkip: JsonField<Double>) = apply { this.tdtWtkip = tdtWtkip }

        /**
         * The modified max weight allowable on this surface type for a TDT-type (twin delta tandem)
         * landing gear configuration, in kilopounds (kip).
         */
        fun tdtWtKipMod(tdtWtKipMod: Double) = tdtWtKipMod(JsonField.of(tdtWtKipMod))

        /**
         * Sets [Builder.tdtWtKipMod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tdtWtKipMod] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tdtWtKipMod(tdtWtKipMod: JsonField<Double>) = apply { this.tdtWtKipMod = tdtWtKipMod }

        /**
         * User input rationale for the manual modification of the prescribed value indicating the
         * max weight allowable on this surface for a TDT-type (twin delta tandem) landing gear
         * configuration. For more information, contact the provider source.
         */
        fun tdtWtKipModNote(tdtWtKipModNote: String) =
            tdtWtKipModNote(JsonField.of(tdtWtKipModNote))

        /**
         * Sets [Builder.tdtWtKipModNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tdtWtKipModNote] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tdtWtKipModNote(tdtWtKipModNote: JsonField<String>) = apply {
            this.tdtWtKipModNote = tdtWtKipModNote
        }

        /**
         * The max weight allowable on this surface type for a TDT-type (twin delta tandem) landing
         * gear configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun tdtWtKn(tdtWtKn: Double) = tdtWtKn(JsonField.of(tdtWtKn))

        /**
         * Sets [Builder.tdtWtKn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tdtWtKn] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tdtWtKn(tdtWtKn: JsonField<Double>) = apply { this.tdtWtKn = tdtWtKn }

        /**
         * The max weight allowable on this surface type for a TRT-type (triple tandem) landing gear
         * configuration, in kilopounds (kip).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun trtWtKip(trtWtKip: Double) = trtWtKip(JsonField.of(trtWtKip))

        /**
         * Sets [Builder.trtWtKip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trtWtKip] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trtWtKip(trtWtKip: JsonField<Double>) = apply { this.trtWtKip = trtWtKip }

        /**
         * The modified max weight allowable on this surface type for a TRT-type (triple tandem)
         * landing gear configuration, in kilopounds (kip).
         */
        fun trtWtKipMod(trtWtKipMod: Double) = trtWtKipMod(JsonField.of(trtWtKipMod))

        /**
         * Sets [Builder.trtWtKipMod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trtWtKipMod] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trtWtKipMod(trtWtKipMod: JsonField<Double>) = apply { this.trtWtKipMod = trtWtKipMod }

        /**
         * User input rationale for the manual modification of the prescribed value indicating the
         * max weight allowable on this surface for a TRT-type (triple tandem) landing gear
         * configuration. For more information, contact the provider source.
         */
        fun trtWtKipModNote(trtWtKipModNote: String) =
            trtWtKipModNote(JsonField.of(trtWtKipModNote))

        /**
         * Sets [Builder.trtWtKipModNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trtWtKipModNote] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trtWtKipModNote(trtWtKipModNote: JsonField<String>) = apply {
            this.trtWtKipModNote = trtWtKipModNote
        }

        /**
         * The max weight allowable on this surface type for a TRT-type (triple tandem) landing gear
         * configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun trtWtKn(trtWtKn: Double) = trtWtKn(JsonField.of(trtWtKn))

        /**
         * Sets [Builder.trtWtKn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trtWtKn] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trtWtKn(trtWtKn: JsonField<Double>) = apply { this.trtWtKn = trtWtKn }

        /**
         * The max weight allowable on this surface type for a GDSS TT-type (twin tandem) landing
         * gear configuration, in kilopounds (kip).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun ttWtKip(ttWtKip: Double) = ttWtKip(JsonField.of(ttWtKip))

        /**
         * Sets [Builder.ttWtKip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ttWtKip] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ttWtKip(ttWtKip: JsonField<Double>) = apply { this.ttWtKip = ttWtKip }

        /**
         * The modified max weight allowable on this surface type for a GDSS TT-type (twin tandem)
         * landing gear configuration, in kilopounds (kip).
         */
        fun ttWtKipMod(ttWtKipMod: Double) = ttWtKipMod(JsonField.of(ttWtKipMod))

        /**
         * Sets [Builder.ttWtKipMod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ttWtKipMod] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ttWtKipMod(ttWtKipMod: JsonField<Double>) = apply { this.ttWtKipMod = ttWtKipMod }

        /**
         * User input rationale for the manual modification of the prescribed value indicating the
         * max weight allowable on this surface for a GDSS TT-type (twin tandem) landing gear
         * configuration. For more information, contact the provider source.
         */
        fun ttWtKipModNote(ttWtKipModNote: String) = ttWtKipModNote(JsonField.of(ttWtKipModNote))

        /**
         * Sets [Builder.ttWtKipModNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ttWtKipModNote] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ttWtKipModNote(ttWtKipModNote: JsonField<String>) = apply {
            this.ttWtKipModNote = ttWtKipModNote
        }

        /**
         * The max weight allowable on this surface type for a GDSS TT-type (twin tandem) landing
         * gear configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun ttWtKn(ttWtKn: Double) = ttWtKn(JsonField.of(ttWtKn))

        /**
         * Sets [Builder.ttWtKn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ttWtKn] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ttWtKn(ttWtKn: JsonField<Double>) = apply { this.ttWtKn = ttWtKn }

        /**
         * The max weight allowable on this surface type for a T-type (twin (dual)) landing gear
         * configuration, in kilopounds (kip).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun tWtKip(tWtKip: Double) = tWtKip(JsonField.of(tWtKip))

        /**
         * Sets [Builder.tWtKip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tWtKip] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tWtKip(tWtKip: JsonField<Double>) = apply { this.tWtKip = tWtKip }

        /**
         * The modified max weight allowable on this surface type for a T-type (twin (dual)) landing
         * gear configuration, in kilopounds (kip).
         */
        fun tWtKipMod(tWtKipMod: Double) = tWtKipMod(JsonField.of(tWtKipMod))

        /**
         * Sets [Builder.tWtKipMod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tWtKipMod] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tWtKipMod(tWtKipMod: JsonField<Double>) = apply { this.tWtKipMod = tWtKipMod }

        /**
         * User input rationale for the manual modification of the prescribed value indicating the
         * max weight allowable on this surface for a T-type (twin(dual)) landing gear
         * configuration. For more information, contact the provider source.
         */
        fun tWtKipModNote(tWtKipModNote: String) = tWtKipModNote(JsonField.of(tWtKipModNote))

        /**
         * Sets [Builder.tWtKipModNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tWtKipModNote] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tWtKipModNote(tWtKipModNote: JsonField<String>) = apply {
            this.tWtKipModNote = tWtKipModNote
        }

        /**
         * The max weight allowable on this surface type for a T-type (twin (dual)) landing gear
         * configuration, in kilonewtons (kN).Note: The corresponding equivalent field is not
         * converted by the UDL and may or may not be supplied by the provider. The
         * provider/consumer is responsible for all unit conversions.
         */
        fun tWtKn(tWtKn: Double) = tWtKn(JsonField.of(tWtKn))

        /**
         * Sets [Builder.tWtKn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tWtKn] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tWtKn(tWtKn: JsonField<Double>) = apply { this.tWtKn = tWtKn }

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

        /** The width of the surface type, in feet. */
        fun widthFt(widthFt: Double) = widthFt(JsonField.of(widthFt))

        /**
         * Sets [Builder.widthFt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.widthFt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun widthFt(widthFt: JsonField<Double>) = apply { this.widthFt = widthFt }

        /** The width of the surface type, in meters. */
        fun widthM(widthM: Double) = widthM(JsonField.of(widthM))

        /**
         * Sets [Builder.widthM] to an arbitrary JSON value.
         *
         * You should usually call [Builder.widthM] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun widthM(widthM: JsonField<Double>) = apply { this.widthM = widthM }

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
         * Returns an immutable instance of [SurfaceGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .source()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SurfaceGetResponse =
            SurfaceGetResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("name", name),
                checkRequired("source", source),
                checkRequired("type", type),
                id,
                altSiteId,
                condition,
                createdAt,
                createdBy,
                ddtWtKip,
                ddtWtKipMod,
                ddtWtKipModNote,
                ddtWtKn,
                ddWtKip,
                ddWtKipMod,
                ddWtKipModNote,
                ddWtKn,
                endLat,
                endLon,
                idSite,
                lcn,
                ldaFt,
                ldaM,
                lengthFt,
                lengthM,
                lighting,
                lightsAprch,
                lightsCl,
                lightsOls,
                lightsPapi,
                lightsReil,
                lightsRwy,
                lightsSeqfl,
                lightsTdzl,
                lightsUnkn,
                lightsVasi,
                material,
                obstacle,
                origin,
                origNetwork,
                pcn,
                pointReference,
                primary,
                rawWbc,
                sbttWtKip,
                sbttWtKipMod,
                sbttWtKipModNote,
                sbttWtKn,
                startLat,
                startLon,
                stWtKip,
                stWtKipMod,
                stWtKipModNote,
                stWtKn,
                (surfaceObstructions ?: JsonMissing.of()).map { it.toImmutable() },
                sWtKip,
                sWtKipMod,
                sWtKipModNote,
                sWtKn,
                tdtWtkip,
                tdtWtKipMod,
                tdtWtKipModNote,
                tdtWtKn,
                trtWtKip,
                trtWtKipMod,
                trtWtKipModNote,
                trtWtKn,
                ttWtKip,
                ttWtKipMod,
                ttWtKipModNote,
                ttWtKn,
                tWtKip,
                tWtKipMod,
                tWtKipModNote,
                tWtKn,
                updatedAt,
                updatedBy,
                widthFt,
                widthM,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SurfaceGetResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        name()
        source()
        type()
        id()
        altSiteId()
        condition()
        createdAt()
        createdBy()
        ddtWtKip()
        ddtWtKipMod()
        ddtWtKipModNote()
        ddtWtKn()
        ddWtKip()
        ddWtKipMod()
        ddWtKipModNote()
        ddWtKn()
        endLat()
        endLon()
        idSite()
        lcn()
        ldaFt()
        ldaM()
        lengthFt()
        lengthM()
        lighting()
        lightsAprch()
        lightsCl()
        lightsOls()
        lightsPapi()
        lightsReil()
        lightsRwy()
        lightsSeqfl()
        lightsTdzl()
        lightsUnkn()
        lightsVasi()
        material()
        obstacle()
        origin()
        origNetwork()
        pcn()
        pointReference()
        primary()
        rawWbc()
        sbttWtKip()
        sbttWtKipMod()
        sbttWtKipModNote()
        sbttWtKn()
        startLat()
        startLon()
        stWtKip()
        stWtKipMod()
        stWtKipModNote()
        stWtKn()
        surfaceObstructions().ifPresent { it.forEach { it.validate() } }
        sWtKip()
        sWtKipMod()
        sWtKipModNote()
        sWtKn()
        tdtWtkip()
        tdtWtKipMod()
        tdtWtKipModNote()
        tdtWtKn()
        trtWtKip()
        trtWtKipMod()
        trtWtKipModNote()
        trtWtKn()
        ttWtKip()
        ttWtKipMod()
        ttWtKipModNote()
        ttWtKn()
        tWtKip()
        tWtKipMod()
        tWtKipModNote()
        tWtKn()
        updatedAt()
        updatedBy()
        widthFt()
        widthM()
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
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (altSiteId.asKnown().isPresent) 1 else 0) +
            (if (condition.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (ddtWtKip.asKnown().isPresent) 1 else 0) +
            (if (ddtWtKipMod.asKnown().isPresent) 1 else 0) +
            (if (ddtWtKipModNote.asKnown().isPresent) 1 else 0) +
            (if (ddtWtKn.asKnown().isPresent) 1 else 0) +
            (if (ddWtKip.asKnown().isPresent) 1 else 0) +
            (if (ddWtKipMod.asKnown().isPresent) 1 else 0) +
            (if (ddWtKipModNote.asKnown().isPresent) 1 else 0) +
            (if (ddWtKn.asKnown().isPresent) 1 else 0) +
            (if (endLat.asKnown().isPresent) 1 else 0) +
            (if (endLon.asKnown().isPresent) 1 else 0) +
            (if (idSite.asKnown().isPresent) 1 else 0) +
            (if (lcn.asKnown().isPresent) 1 else 0) +
            (if (ldaFt.asKnown().isPresent) 1 else 0) +
            (if (ldaM.asKnown().isPresent) 1 else 0) +
            (if (lengthFt.asKnown().isPresent) 1 else 0) +
            (if (lengthM.asKnown().isPresent) 1 else 0) +
            (if (lighting.asKnown().isPresent) 1 else 0) +
            (if (lightsAprch.asKnown().isPresent) 1 else 0) +
            (if (lightsCl.asKnown().isPresent) 1 else 0) +
            (if (lightsOls.asKnown().isPresent) 1 else 0) +
            (if (lightsPapi.asKnown().isPresent) 1 else 0) +
            (if (lightsReil.asKnown().isPresent) 1 else 0) +
            (if (lightsRwy.asKnown().isPresent) 1 else 0) +
            (if (lightsSeqfl.asKnown().isPresent) 1 else 0) +
            (if (lightsTdzl.asKnown().isPresent) 1 else 0) +
            (if (lightsUnkn.asKnown().isPresent) 1 else 0) +
            (if (lightsVasi.asKnown().isPresent) 1 else 0) +
            (if (material.asKnown().isPresent) 1 else 0) +
            (if (obstacle.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (pcn.asKnown().isPresent) 1 else 0) +
            (if (pointReference.asKnown().isPresent) 1 else 0) +
            (if (primary.asKnown().isPresent) 1 else 0) +
            (if (rawWbc.asKnown().isPresent) 1 else 0) +
            (if (sbttWtKip.asKnown().isPresent) 1 else 0) +
            (if (sbttWtKipMod.asKnown().isPresent) 1 else 0) +
            (if (sbttWtKipModNote.asKnown().isPresent) 1 else 0) +
            (if (sbttWtKn.asKnown().isPresent) 1 else 0) +
            (if (startLat.asKnown().isPresent) 1 else 0) +
            (if (startLon.asKnown().isPresent) 1 else 0) +
            (if (stWtKip.asKnown().isPresent) 1 else 0) +
            (if (stWtKipMod.asKnown().isPresent) 1 else 0) +
            (if (stWtKipModNote.asKnown().isPresent) 1 else 0) +
            (if (stWtKn.asKnown().isPresent) 1 else 0) +
            (surfaceObstructions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (sWtKip.asKnown().isPresent) 1 else 0) +
            (if (sWtKipMod.asKnown().isPresent) 1 else 0) +
            (if (sWtKipModNote.asKnown().isPresent) 1 else 0) +
            (if (sWtKn.asKnown().isPresent) 1 else 0) +
            (if (tdtWtkip.asKnown().isPresent) 1 else 0) +
            (if (tdtWtKipMod.asKnown().isPresent) 1 else 0) +
            (if (tdtWtKipModNote.asKnown().isPresent) 1 else 0) +
            (if (tdtWtKn.asKnown().isPresent) 1 else 0) +
            (if (trtWtKip.asKnown().isPresent) 1 else 0) +
            (if (trtWtKipMod.asKnown().isPresent) 1 else 0) +
            (if (trtWtKipModNote.asKnown().isPresent) 1 else 0) +
            (if (trtWtKn.asKnown().isPresent) 1 else 0) +
            (if (ttWtKip.asKnown().isPresent) 1 else 0) +
            (if (ttWtKipMod.asKnown().isPresent) 1 else 0) +
            (if (ttWtKipModNote.asKnown().isPresent) 1 else 0) +
            (if (ttWtKn.asKnown().isPresent) 1 else 0) +
            (if (tWtKip.asKnown().isPresent) 1 else 0) +
            (if (tWtKipMod.asKnown().isPresent) 1 else 0) +
            (if (tWtKipModNote.asKnown().isPresent) 1 else 0) +
            (if (tWtKn.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (widthFt.asKnown().isPresent) 1 else 0) +
            (if (widthM.asKnown().isPresent) 1 else 0)

    /** Indicator of whether the data is REAL, TEST, SIMULATED, or EXERCISE data. */
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

    class SurfaceObstruction
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val idSurface: JsonField<String>,
        private val source: JsonField<String>,
        private val id: JsonField<String>,
        private val advisoryRequired: JsonField<List<String>>,
        private val approvalRequired: JsonField<List<String>>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val distanceFromCenterLine: JsonField<Double>,
        private val distanceFromEdge: JsonField<Double>,
        private val distanceFromThreshold: JsonField<Double>,
        private val idNavigationalObstruction: JsonField<String>,
        private val obstructionDesc: JsonField<String>,
        private val obstructionHeight: JsonField<Double>,
        private val obstructionSideCode: JsonField<String>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val sourceDl: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val updatedBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("idSurface")
            @ExcludeMissing
            idSurface: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("advisoryRequired")
            @ExcludeMissing
            advisoryRequired: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("approvalRequired")
            @ExcludeMissing
            approvalRequired: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("distanceFromCenterLine")
            @ExcludeMissing
            distanceFromCenterLine: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("distanceFromEdge")
            @ExcludeMissing
            distanceFromEdge: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("distanceFromThreshold")
            @ExcludeMissing
            distanceFromThreshold: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("idNavigationalObstruction")
            @ExcludeMissing
            idNavigationalObstruction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("obstructionDesc")
            @ExcludeMissing
            obstructionDesc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("obstructionHeight")
            @ExcludeMissing
            obstructionHeight: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("obstructionSideCode")
            @ExcludeMissing
            obstructionSideCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sourceDL")
            @ExcludeMissing
            sourceDl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedBy")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            idSurface,
            source,
            id,
            advisoryRequired,
            approvalRequired,
            createdAt,
            createdBy,
            distanceFromCenterLine,
            distanceFromEdge,
            distanceFromThreshold,
            idNavigationalObstruction,
            obstructionDesc,
            obstructionHeight,
            obstructionSideCode,
            origin,
            origNetwork,
            sourceDl,
            updatedAt,
            updatedBy,
            mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is REAL, TEST, SIMULATED, or EXERCISE data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * The unique identifier of the associated surface record. This field is required when
         * posting, updating, or deleting a SurfaceObstruction record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun idSurface(): String = idSurface.getRequired("idSurface")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Array of all vehicles that are affected by this obstruction at the surface end-point, and
         * require an advisory for usage.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun advisoryRequired(): Optional<List<String>> =
            advisoryRequired.getOptional("advisoryRequired")

        /**
         * Array of all vehicles that are affected by this obstruction at the surface end-point, and
         * require an approval for usage.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun approvalRequired(): Optional<List<String>> =
            approvalRequired.getOptional("approvalRequired")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * The distance from the surface center line to this obstruction, in feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun distanceFromCenterLine(): Optional<Double> =
            distanceFromCenterLine.getOptional("distanceFromCenterLine")

        /**
         * The distance from the surface edge to this obstruction, in feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun distanceFromEdge(): Optional<Double> = distanceFromEdge.getOptional("distanceFromEdge")

        /**
         * The distance from the surface threshold to this obstruction, in feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun distanceFromThreshold(): Optional<Double> =
            distanceFromThreshold.getOptional("distanceFromThreshold")

        /**
         * The unique identifier of the associated NavigationalObstruction record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idNavigationalObstruction(): Optional<String> =
            idNavigationalObstruction.getOptional("idNavigationalObstruction")

        /**
         * Description of this surface obstruction.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obstructionDesc(): Optional<String> = obstructionDesc.getOptional("obstructionDesc")

        /**
         * The height above ground level of the surface obstruction, in feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obstructionHeight(): Optional<Double> =
            obstructionHeight.getOptional("obstructionHeight")

        /**
         * A code that indicates which side of the surface end is affected by this obstruction.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obstructionSideCode(): Optional<String> =
            obstructionSideCode.getOptional("obstructionSideCode")

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * The source data library from which this record was received. This could be a remote or
         * tactical UDL or another data library. If null, the record should be assumed to have
         * originated from the primary Enterprise UDL.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

        /**
         * Time the row was last updated in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [idSurface].
         *
         * Unlike [idSurface], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSurface") @ExcludeMissing fun _idSurface(): JsonField<String> = idSurface

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
         * Returns the raw JSON value of [advisoryRequired].
         *
         * Unlike [advisoryRequired], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("advisoryRequired")
        @ExcludeMissing
        fun _advisoryRequired(): JsonField<List<String>> = advisoryRequired

        /**
         * Returns the raw JSON value of [approvalRequired].
         *
         * Unlike [approvalRequired], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("approvalRequired")
        @ExcludeMissing
        fun _approvalRequired(): JsonField<List<String>> = approvalRequired

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
         * Returns the raw JSON value of [distanceFromCenterLine].
         *
         * Unlike [distanceFromCenterLine], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("distanceFromCenterLine")
        @ExcludeMissing
        fun _distanceFromCenterLine(): JsonField<Double> = distanceFromCenterLine

        /**
         * Returns the raw JSON value of [distanceFromEdge].
         *
         * Unlike [distanceFromEdge], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("distanceFromEdge")
        @ExcludeMissing
        fun _distanceFromEdge(): JsonField<Double> = distanceFromEdge

        /**
         * Returns the raw JSON value of [distanceFromThreshold].
         *
         * Unlike [distanceFromThreshold], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("distanceFromThreshold")
        @ExcludeMissing
        fun _distanceFromThreshold(): JsonField<Double> = distanceFromThreshold

        /**
         * Returns the raw JSON value of [idNavigationalObstruction].
         *
         * Unlike [idNavigationalObstruction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("idNavigationalObstruction")
        @ExcludeMissing
        fun _idNavigationalObstruction(): JsonField<String> = idNavigationalObstruction

        /**
         * Returns the raw JSON value of [obstructionDesc].
         *
         * Unlike [obstructionDesc], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("obstructionDesc")
        @ExcludeMissing
        fun _obstructionDesc(): JsonField<String> = obstructionDesc

        /**
         * Returns the raw JSON value of [obstructionHeight].
         *
         * Unlike [obstructionHeight], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("obstructionHeight")
        @ExcludeMissing
        fun _obstructionHeight(): JsonField<Double> = obstructionHeight

        /**
         * Returns the raw JSON value of [obstructionSideCode].
         *
         * Unlike [obstructionSideCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("obstructionSideCode")
        @ExcludeMissing
        fun _obstructionSideCode(): JsonField<String> = obstructionSideCode

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
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [sourceDl].
         *
         * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

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
             * Returns a mutable builder for constructing an instance of [SurfaceObstruction].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .idSurface()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SurfaceObstruction]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var idSurface: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var advisoryRequired: JsonField<MutableList<String>>? = null
            private var approvalRequired: JsonField<MutableList<String>>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var distanceFromCenterLine: JsonField<Double> = JsonMissing.of()
            private var distanceFromEdge: JsonField<Double> = JsonMissing.of()
            private var distanceFromThreshold: JsonField<Double> = JsonMissing.of()
            private var idNavigationalObstruction: JsonField<String> = JsonMissing.of()
            private var obstructionDesc: JsonField<String> = JsonMissing.of()
            private var obstructionHeight: JsonField<Double> = JsonMissing.of()
            private var obstructionSideCode: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(surfaceObstruction: SurfaceObstruction) = apply {
                classificationMarking = surfaceObstruction.classificationMarking
                dataMode = surfaceObstruction.dataMode
                idSurface = surfaceObstruction.idSurface
                source = surfaceObstruction.source
                id = surfaceObstruction.id
                advisoryRequired = surfaceObstruction.advisoryRequired.map { it.toMutableList() }
                approvalRequired = surfaceObstruction.approvalRequired.map { it.toMutableList() }
                createdAt = surfaceObstruction.createdAt
                createdBy = surfaceObstruction.createdBy
                distanceFromCenterLine = surfaceObstruction.distanceFromCenterLine
                distanceFromEdge = surfaceObstruction.distanceFromEdge
                distanceFromThreshold = surfaceObstruction.distanceFromThreshold
                idNavigationalObstruction = surfaceObstruction.idNavigationalObstruction
                obstructionDesc = surfaceObstruction.obstructionDesc
                obstructionHeight = surfaceObstruction.obstructionHeight
                obstructionSideCode = surfaceObstruction.obstructionSideCode
                origin = surfaceObstruction.origin
                origNetwork = surfaceObstruction.origNetwork
                sourceDl = surfaceObstruction.sourceDl
                updatedAt = surfaceObstruction.updatedAt
                updatedBy = surfaceObstruction.updatedBy
                additionalProperties = surfaceObstruction.additionalProperties.toMutableMap()
            }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            /** Indicator of whether the data is REAL, TEST, SIMULATED, or EXERCISE data. */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

            /**
             * The unique identifier of the associated surface record. This field is required when
             * posting, updating, or deleting a SurfaceObstruction record.
             */
            fun idSurface(idSurface: String) = idSurface(JsonField.of(idSurface))

            /**
             * Sets [Builder.idSurface] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSurface] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSurface(idSurface: JsonField<String>) = apply { this.idSurface = idSurface }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Array of all vehicles that are affected by this obstruction at the surface end-point,
             * and require an advisory for usage.
             */
            fun advisoryRequired(advisoryRequired: List<String>) =
                advisoryRequired(JsonField.of(advisoryRequired))

            /**
             * Sets [Builder.advisoryRequired] to an arbitrary JSON value.
             *
             * You should usually call [Builder.advisoryRequired] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun advisoryRequired(advisoryRequired: JsonField<List<String>>) = apply {
                this.advisoryRequired = advisoryRequired.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.advisoryRequired].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdvisoryRequired(advisoryRequired: String) = apply {
                this.advisoryRequired =
                    (this.advisoryRequired ?: JsonField.of(mutableListOf())).also {
                        checkKnown("advisoryRequired", it).add(advisoryRequired)
                    }
            }

            /**
             * Array of all vehicles that are affected by this obstruction at the surface end-point,
             * and require an approval for usage.
             */
            fun approvalRequired(approvalRequired: List<String>) =
                approvalRequired(JsonField.of(approvalRequired))

            /**
             * Sets [Builder.approvalRequired] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approvalRequired] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun approvalRequired(approvalRequired: JsonField<List<String>>) = apply {
                this.approvalRequired = approvalRequired.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.approvalRequired].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApprovalRequired(approvalRequired: String) = apply {
                this.approvalRequired =
                    (this.approvalRequired ?: JsonField.of(mutableListOf())).also {
                        checkKnown("approvalRequired", it).add(approvalRequired)
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Application user who created the row in the database, auto-populated by the system.
             */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** The distance from the surface center line to this obstruction, in feet. */
            fun distanceFromCenterLine(distanceFromCenterLine: Double) =
                distanceFromCenterLine(JsonField.of(distanceFromCenterLine))

            /**
             * Sets [Builder.distanceFromCenterLine] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distanceFromCenterLine] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun distanceFromCenterLine(distanceFromCenterLine: JsonField<Double>) = apply {
                this.distanceFromCenterLine = distanceFromCenterLine
            }

            /** The distance from the surface edge to this obstruction, in feet. */
            fun distanceFromEdge(distanceFromEdge: Double) =
                distanceFromEdge(JsonField.of(distanceFromEdge))

            /**
             * Sets [Builder.distanceFromEdge] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distanceFromEdge] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distanceFromEdge(distanceFromEdge: JsonField<Double>) = apply {
                this.distanceFromEdge = distanceFromEdge
            }

            /** The distance from the surface threshold to this obstruction, in feet. */
            fun distanceFromThreshold(distanceFromThreshold: Double) =
                distanceFromThreshold(JsonField.of(distanceFromThreshold))

            /**
             * Sets [Builder.distanceFromThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distanceFromThreshold] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun distanceFromThreshold(distanceFromThreshold: JsonField<Double>) = apply {
                this.distanceFromThreshold = distanceFromThreshold
            }

            /** The unique identifier of the associated NavigationalObstruction record. */
            fun idNavigationalObstruction(idNavigationalObstruction: String) =
                idNavigationalObstruction(JsonField.of(idNavigationalObstruction))

            /**
             * Sets [Builder.idNavigationalObstruction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idNavigationalObstruction] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun idNavigationalObstruction(idNavigationalObstruction: JsonField<String>) = apply {
                this.idNavigationalObstruction = idNavigationalObstruction
            }

            /** Description of this surface obstruction. */
            fun obstructionDesc(obstructionDesc: String) =
                obstructionDesc(JsonField.of(obstructionDesc))

            /**
             * Sets [Builder.obstructionDesc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obstructionDesc] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obstructionDesc(obstructionDesc: JsonField<String>) = apply {
                this.obstructionDesc = obstructionDesc
            }

            /** The height above ground level of the surface obstruction, in feet. */
            fun obstructionHeight(obstructionHeight: Double) =
                obstructionHeight(JsonField.of(obstructionHeight))

            /**
             * Sets [Builder.obstructionHeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obstructionHeight] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obstructionHeight(obstructionHeight: JsonField<Double>) = apply {
                this.obstructionHeight = obstructionHeight
            }

            /**
             * A code that indicates which side of the surface end is affected by this obstruction.
             */
            fun obstructionSideCode(obstructionSideCode: String) =
                obstructionSideCode(JsonField.of(obstructionSideCode))

            /**
             * Sets [Builder.obstructionSideCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obstructionSideCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun obstructionSideCode(obstructionSideCode: JsonField<String>) = apply {
                this.obstructionSideCode = obstructionSideCode
            }

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) = apply {
                this.origNetwork = origNetwork
            }

            /**
             * The source data library from which this record was received. This could be a remote
             * or tactical UDL or another data library. If null, the record should be assumed to
             * have originated from the primary Enterprise UDL.
             */
            fun sourceDl(sourceDl: String) = sourceDl(JsonField.of(sourceDl))

            /**
             * Sets [Builder.sourceDl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceDl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceDl(sourceDl: JsonField<String>) = apply { this.sourceDl = sourceDl }

            /** Time the row was last updated in the database, auto-populated by the system. */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Application user who updated the row in the database, auto-populated by the system.
             */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

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
             * Returns an immutable instance of [SurfaceObstruction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .idSurface()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SurfaceObstruction =
                SurfaceObstruction(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("idSurface", idSurface),
                    checkRequired("source", source),
                    id,
                    (advisoryRequired ?: JsonMissing.of()).map { it.toImmutable() },
                    (approvalRequired ?: JsonMissing.of()).map { it.toImmutable() },
                    createdAt,
                    createdBy,
                    distanceFromCenterLine,
                    distanceFromEdge,
                    distanceFromThreshold,
                    idNavigationalObstruction,
                    obstructionDesc,
                    obstructionHeight,
                    obstructionSideCode,
                    origin,
                    origNetwork,
                    sourceDl,
                    updatedAt,
                    updatedBy,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SurfaceObstruction = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            idSurface()
            source()
            id()
            advisoryRequired()
            approvalRequired()
            createdAt()
            createdBy()
            distanceFromCenterLine()
            distanceFromEdge()
            distanceFromThreshold()
            idNavigationalObstruction()
            obstructionDesc()
            obstructionHeight()
            obstructionSideCode()
            origin()
            origNetwork()
            sourceDl()
            updatedAt()
            updatedBy()
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
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (idSurface.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (advisoryRequired.asKnown().getOrNull()?.size ?: 0) +
                (approvalRequired.asKnown().getOrNull()?.size ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (distanceFromCenterLine.asKnown().isPresent) 1 else 0) +
                (if (distanceFromEdge.asKnown().isPresent) 1 else 0) +
                (if (distanceFromThreshold.asKnown().isPresent) 1 else 0) +
                (if (idNavigationalObstruction.asKnown().isPresent) 1 else 0) +
                (if (obstructionDesc.asKnown().isPresent) 1 else 0) +
                (if (obstructionHeight.asKnown().isPresent) 1 else 0) +
                (if (obstructionSideCode.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (sourceDl.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0)

        /** Indicator of whether the data is REAL, TEST, SIMULATED, or EXERCISE data. */
        class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REAL,
                TEST,
                SIMULATED,
                EXERCISE,
                /**
                 * An enum member indicating that [DataMode] was instantiated with an unknown value.
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
                    REAL -> Value.REAL
                    TEST -> Value.TEST
                    SIMULATED -> Value.SIMULATED
                    EXERCISE -> Value.EXERCISE
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
                    REAL -> Known.REAL
                    TEST -> Known.TEST
                    SIMULATED -> Known.SIMULATED
                    EXERCISE -> Known.EXERCISE
                    else -> throw UnifieddatalibraryInvalidDataException("Unknown DataMode: $value")
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

            return other is SurfaceObstruction &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                idSurface == other.idSurface &&
                source == other.source &&
                id == other.id &&
                advisoryRequired == other.advisoryRequired &&
                approvalRequired == other.approvalRequired &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                distanceFromCenterLine == other.distanceFromCenterLine &&
                distanceFromEdge == other.distanceFromEdge &&
                distanceFromThreshold == other.distanceFromThreshold &&
                idNavigationalObstruction == other.idNavigationalObstruction &&
                obstructionDesc == other.obstructionDesc &&
                obstructionHeight == other.obstructionHeight &&
                obstructionSideCode == other.obstructionSideCode &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                sourceDl == other.sourceDl &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                idSurface,
                source,
                id,
                advisoryRequired,
                approvalRequired,
                createdAt,
                createdBy,
                distanceFromCenterLine,
                distanceFromEdge,
                distanceFromThreshold,
                idNavigationalObstruction,
                obstructionDesc,
                obstructionHeight,
                obstructionSideCode,
                origin,
                origNetwork,
                sourceDl,
                updatedAt,
                updatedBy,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SurfaceObstruction{classificationMarking=$classificationMarking, dataMode=$dataMode, idSurface=$idSurface, source=$source, id=$id, advisoryRequired=$advisoryRequired, approvalRequired=$approvalRequired, createdAt=$createdAt, createdBy=$createdBy, distanceFromCenterLine=$distanceFromCenterLine, distanceFromEdge=$distanceFromEdge, distanceFromThreshold=$distanceFromThreshold, idNavigationalObstruction=$idNavigationalObstruction, obstructionDesc=$obstructionDesc, obstructionHeight=$obstructionHeight, obstructionSideCode=$obstructionSideCode, origin=$origin, origNetwork=$origNetwork, sourceDl=$sourceDl, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SurfaceGetResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            name == other.name &&
            source == other.source &&
            type == other.type &&
            id == other.id &&
            altSiteId == other.altSiteId &&
            condition == other.condition &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            ddtWtKip == other.ddtWtKip &&
            ddtWtKipMod == other.ddtWtKipMod &&
            ddtWtKipModNote == other.ddtWtKipModNote &&
            ddtWtKn == other.ddtWtKn &&
            ddWtKip == other.ddWtKip &&
            ddWtKipMod == other.ddWtKipMod &&
            ddWtKipModNote == other.ddWtKipModNote &&
            ddWtKn == other.ddWtKn &&
            endLat == other.endLat &&
            endLon == other.endLon &&
            idSite == other.idSite &&
            lcn == other.lcn &&
            ldaFt == other.ldaFt &&
            ldaM == other.ldaM &&
            lengthFt == other.lengthFt &&
            lengthM == other.lengthM &&
            lighting == other.lighting &&
            lightsAprch == other.lightsAprch &&
            lightsCl == other.lightsCl &&
            lightsOls == other.lightsOls &&
            lightsPapi == other.lightsPapi &&
            lightsReil == other.lightsReil &&
            lightsRwy == other.lightsRwy &&
            lightsSeqfl == other.lightsSeqfl &&
            lightsTdzl == other.lightsTdzl &&
            lightsUnkn == other.lightsUnkn &&
            lightsVasi == other.lightsVasi &&
            material == other.material &&
            obstacle == other.obstacle &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            pcn == other.pcn &&
            pointReference == other.pointReference &&
            primary == other.primary &&
            rawWbc == other.rawWbc &&
            sbttWtKip == other.sbttWtKip &&
            sbttWtKipMod == other.sbttWtKipMod &&
            sbttWtKipModNote == other.sbttWtKipModNote &&
            sbttWtKn == other.sbttWtKn &&
            startLat == other.startLat &&
            startLon == other.startLon &&
            stWtKip == other.stWtKip &&
            stWtKipMod == other.stWtKipMod &&
            stWtKipModNote == other.stWtKipModNote &&
            stWtKn == other.stWtKn &&
            surfaceObstructions == other.surfaceObstructions &&
            sWtKip == other.sWtKip &&
            sWtKipMod == other.sWtKipMod &&
            sWtKipModNote == other.sWtKipModNote &&
            sWtKn == other.sWtKn &&
            tdtWtkip == other.tdtWtkip &&
            tdtWtKipMod == other.tdtWtKipMod &&
            tdtWtKipModNote == other.tdtWtKipModNote &&
            tdtWtKn == other.tdtWtKn &&
            trtWtKip == other.trtWtKip &&
            trtWtKipMod == other.trtWtKipMod &&
            trtWtKipModNote == other.trtWtKipModNote &&
            trtWtKn == other.trtWtKn &&
            ttWtKip == other.ttWtKip &&
            ttWtKipMod == other.ttWtKipMod &&
            ttWtKipModNote == other.ttWtKipModNote &&
            ttWtKn == other.ttWtKn &&
            tWtKip == other.tWtKip &&
            tWtKipMod == other.tWtKipMod &&
            tWtKipModNote == other.tWtKipModNote &&
            tWtKn == other.tWtKn &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            widthFt == other.widthFt &&
            widthM == other.widthM &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            name,
            source,
            type,
            id,
            altSiteId,
            condition,
            createdAt,
            createdBy,
            ddtWtKip,
            ddtWtKipMod,
            ddtWtKipModNote,
            ddtWtKn,
            ddWtKip,
            ddWtKipMod,
            ddWtKipModNote,
            ddWtKn,
            endLat,
            endLon,
            idSite,
            lcn,
            ldaFt,
            ldaM,
            lengthFt,
            lengthM,
            lighting,
            lightsAprch,
            lightsCl,
            lightsOls,
            lightsPapi,
            lightsReil,
            lightsRwy,
            lightsSeqfl,
            lightsTdzl,
            lightsUnkn,
            lightsVasi,
            material,
            obstacle,
            origin,
            origNetwork,
            pcn,
            pointReference,
            primary,
            rawWbc,
            sbttWtKip,
            sbttWtKipMod,
            sbttWtKipModNote,
            sbttWtKn,
            startLat,
            startLon,
            stWtKip,
            stWtKipMod,
            stWtKipModNote,
            stWtKn,
            surfaceObstructions,
            sWtKip,
            sWtKipMod,
            sWtKipModNote,
            sWtKn,
            tdtWtkip,
            tdtWtKipMod,
            tdtWtKipModNote,
            tdtWtKn,
            trtWtKip,
            trtWtKipMod,
            trtWtKipModNote,
            trtWtKn,
            ttWtKip,
            ttWtKipMod,
            ttWtKipModNote,
            ttWtKn,
            tWtKip,
            tWtKipMod,
            tWtKipModNote,
            tWtKn,
            updatedAt,
            updatedBy,
            widthFt,
            widthM,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SurfaceGetResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, name=$name, source=$source, type=$type, id=$id, altSiteId=$altSiteId, condition=$condition, createdAt=$createdAt, createdBy=$createdBy, ddtWtKip=$ddtWtKip, ddtWtKipMod=$ddtWtKipMod, ddtWtKipModNote=$ddtWtKipModNote, ddtWtKn=$ddtWtKn, ddWtKip=$ddWtKip, ddWtKipMod=$ddWtKipMod, ddWtKipModNote=$ddWtKipModNote, ddWtKn=$ddWtKn, endLat=$endLat, endLon=$endLon, idSite=$idSite, lcn=$lcn, ldaFt=$ldaFt, ldaM=$ldaM, lengthFt=$lengthFt, lengthM=$lengthM, lighting=$lighting, lightsAprch=$lightsAprch, lightsCl=$lightsCl, lightsOls=$lightsOls, lightsPapi=$lightsPapi, lightsReil=$lightsReil, lightsRwy=$lightsRwy, lightsSeqfl=$lightsSeqfl, lightsTdzl=$lightsTdzl, lightsUnkn=$lightsUnkn, lightsVasi=$lightsVasi, material=$material, obstacle=$obstacle, origin=$origin, origNetwork=$origNetwork, pcn=$pcn, pointReference=$pointReference, primary=$primary, rawWbc=$rawWbc, sbttWtKip=$sbttWtKip, sbttWtKipMod=$sbttWtKipMod, sbttWtKipModNote=$sbttWtKipModNote, sbttWtKn=$sbttWtKn, startLat=$startLat, startLon=$startLon, stWtKip=$stWtKip, stWtKipMod=$stWtKipMod, stWtKipModNote=$stWtKipModNote, stWtKn=$stWtKn, surfaceObstructions=$surfaceObstructions, sWtKip=$sWtKip, sWtKipMod=$sWtKipMod, sWtKipModNote=$sWtKipModNote, sWtKn=$sWtKn, tdtWtkip=$tdtWtkip, tdtWtKipMod=$tdtWtKipMod, tdtWtKipModNote=$tdtWtKipModNote, tdtWtKn=$tdtWtKn, trtWtKip=$trtWtKip, trtWtKipMod=$trtWtKipMod, trtWtKipModNote=$trtWtKipModNote, trtWtKn=$trtWtKn, ttWtKip=$ttWtKip, ttWtKipMod=$ttWtKipMod, ttWtKipModNote=$ttWtKipModNote, ttWtKn=$ttWtKn, tWtKip=$tWtKip, tWtKipMod=$tWtKipMod, tWtKipModNote=$tWtKipModNote, tWtKn=$tWtKn, updatedAt=$updatedAt, updatedBy=$updatedBy, widthFt=$widthFt, widthM=$widthM, additionalProperties=$additionalProperties}"
}

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
 * Properties and characteristics of an airfield, which includes location, airfield codes,
 * suitability codes, and remarks.
 */
class AirfieldFull
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val name: JsonField<String>,
    private val source: JsonField<String>,
    private val type: JsonField<String>,
    private val id: JsonField<String>,
    private val altAirfieldId: JsonField<String>,
    private val alternativeNames: JsonField<List<String>>,
    private val city: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val countryName: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val dstInfo: JsonField<String>,
    private val elevFt: JsonField<Double>,
    private val elevM: JsonField<Double>,
    private val faa: JsonField<String>,
    private val geoloc: JsonField<String>,
    private val gmtOffset: JsonField<String>,
    private val hostNatCode: JsonField<String>,
    private val iata: JsonField<String>,
    private val icao: JsonField<String>,
    private val idSite: JsonField<String>,
    private val infoUrl: JsonField<String>,
    private val lat: JsonField<Double>,
    private val lon: JsonField<Double>,
    private val magDec: JsonField<Double>,
    private val maxRunwayLength: JsonField<Int>,
    private val miscCodes: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val regionalAuthority: JsonField<String>,
    private val regionName: JsonField<String>,
    private val runways: JsonField<Int>,
    private val secondaryIcao: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val state: JsonField<String>,
    private val stateProvinceCode: JsonField<String>,
    private val suitabilityCodeDescs: JsonField<List<String>>,
    private val suitabilityCodes: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val wacInnr: JsonField<String>,
    private val zarId: JsonField<String>,
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
        @JsonProperty("altAirfieldId")
        @ExcludeMissing
        altAirfieldId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alternativeNames")
        @ExcludeMissing
        alternativeNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("countryName")
        @ExcludeMissing
        countryName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dstInfo") @ExcludeMissing dstInfo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("elevFt") @ExcludeMissing elevFt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elevM") @ExcludeMissing elevM: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("faa") @ExcludeMissing faa: JsonField<String> = JsonMissing.of(),
        @JsonProperty("geoloc") @ExcludeMissing geoloc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("gmtOffset") @ExcludeMissing gmtOffset: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hostNatCode")
        @ExcludeMissing
        hostNatCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("iata") @ExcludeMissing iata: JsonField<String> = JsonMissing.of(),
        @JsonProperty("icao") @ExcludeMissing icao: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSite") @ExcludeMissing idSite: JsonField<String> = JsonMissing.of(),
        @JsonProperty("infoURL") @ExcludeMissing infoUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("magDec") @ExcludeMissing magDec: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxRunwayLength")
        @ExcludeMissing
        maxRunwayLength: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("miscCodes") @ExcludeMissing miscCodes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("regionalAuthority")
        @ExcludeMissing
        regionalAuthority: JsonField<String> = JsonMissing.of(),
        @JsonProperty("regionName")
        @ExcludeMissing
        regionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("runways") @ExcludeMissing runways: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("secondaryICAO")
        @ExcludeMissing
        secondaryIcao: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stateProvinceCode")
        @ExcludeMissing
        stateProvinceCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("suitabilityCodeDescs")
        @ExcludeMissing
        suitabilityCodeDescs: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("suitabilityCodes")
        @ExcludeMissing
        suitabilityCodes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wacINNR") @ExcludeMissing wacInnr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zarId") @ExcludeMissing zarId: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        name,
        source,
        type,
        id,
        altAirfieldId,
        alternativeNames,
        city,
        countryCode,
        countryName,
        createdAt,
        createdBy,
        dstInfo,
        elevFt,
        elevM,
        faa,
        geoloc,
        gmtOffset,
        hostNatCode,
        iata,
        icao,
        idSite,
        infoUrl,
        lat,
        lon,
        magDec,
        maxRunwayLength,
        miscCodes,
        origin,
        origNetwork,
        regionalAuthority,
        regionName,
        runways,
        secondaryIcao,
        sourceDl,
        state,
        stateProvinceCode,
        suitabilityCodeDescs,
        suitabilityCodes,
        updatedAt,
        updatedBy,
        wacInnr,
        zarId,
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
     * The name of the airfield.
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
     * The airfield activity use type (e.g. Commercial, Airport, Heliport, Gliderport, etc.).
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
     * Alternate Airfield identifier provided by source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altAirfieldId(): Optional<String> = altAirfieldId.getOptional("altAirfieldId")

    /**
     * Alternative names for this airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun alternativeNames(): Optional<List<String>> =
        alternativeNames.getOptional("alternativeNames")

    /**
     * The closest city to the location of this airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun city(): Optional<String> = city.getOptional("city")

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
     * The country name where this airfield is located.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun countryName(): Optional<String> = countryName.getOptional("countryName")

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
     * Information regarding daylight saving time as is relevant to the location and operation of
     * this airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dstInfo(): Optional<String> = dstInfo.getOptional("dstInfo")

    /**
     * Elevation of the airfield above mean sea level, in feet. Note: The corresponding equivalent
     * field is not converted by the UDL and may or may not be supplied by the provider. The
     * provider/consumer is responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevFt(): Optional<Double> = elevFt.getOptional("elevFt")

    /**
     * Elevation of the airfield above mean sea level, in meters. Note: The corresponding equivalent
     * field is not converted by the UDL and may or may not be supplied by the provider. The
     * provider/consumer is responsible for all unit conversions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevM(): Optional<Double> = elevM.getOptional("elevM")

    /**
     * The Federal Aviation Administration (FAA) location identifier of this airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun faa(): Optional<String> = faa.getOptional("faa")

    /**
     * Air Force geographic location code of the airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoloc(): Optional<String> = geoloc.getOptional("geoloc")

    /**
     * Time difference between the location of the airfield and the Greenwich Mean Time (GMT),
     * expressed as +/-HH:MM. Time zones east of Greenwich have positive offsets and time zones west
     * of Greenwich are negative.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gmtOffset(): Optional<String> = gmtOffset.getOptional("gmtOffset")

    /**
     * The host nation code of this airfield, used for non-DoD/FAA locations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hostNatCode(): Optional<String> = hostNatCode.getOptional("hostNatCode")

    /**
     * The International Aviation Transport Association (IATA) code of the airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun iata(): Optional<String> = iata.getOptional("iata")

    /**
     * The International Civil Aviation Organization (ICAO) code of the airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun icao(): Optional<String> = icao.getOptional("icao")

    /**
     * The ID of the parent site.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSite(): Optional<String> = idSite.getOptional("idSite")

    /**
     * The URL link to information about airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun infoUrl(): Optional<String> = infoUrl.getOptional("infoURL")

    /**
     * WGS84 latitude of the location, in degrees. -90 to 90 degrees (negative values south of
     * equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lat(): Optional<Double> = lat.getOptional("lat")

    /**
     * WGS84 longitude of the location, in degrees. -180 to 180 degrees (negative values west of
     * Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lon(): Optional<Double> = lon.getOptional("lon")

    /**
     * The magnetic declination/variation of the airfield's location from true north, in degrees.
     * Positive values east of true north and negative values west of true north.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun magDec(): Optional<Double> = magDec.getOptional("magDec")

    /**
     * The length of the longest runway at this airfield in feet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxRunwayLength(): Optional<Int> = maxRunwayLength.getOptional("maxRunwayLength")

    /**
     * Applicable miscellaneous codes according to the Airfield Suitability and Restrictions Report
     * (ASRR) for this airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun miscCodes(): Optional<String> = miscCodes.getOptional("miscCodes")

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
     * The regional authority of the airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun regionalAuthority(): Optional<String> = regionalAuthority.getOptional("regionalAuthority")

    /**
     * Region where the airfield resides.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun regionName(): Optional<String> = regionName.getOptional("regionName")

    /**
     * The number of runways at the site.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun runways(): Optional<Int> = runways.getOptional("runways")

    /**
     * The secondary ICAO code for this airfield. Some airfields have two associated ICAO codes,
     * this can occur in cases when a single airfield supports both military and civilian
     * operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun secondaryIcao(): Optional<String> = secondaryIcao.getOptional("secondaryICAO")

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
     * State or province of the airfield's location.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * The code for the state or province in which this airfield is located. Intended as, but not
     * constrained to, FIPS 10-4 region code designations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stateProvinceCode(): Optional<String> = stateProvinceCode.getOptional("stateProvinceCode")

    /**
     * Array of descriptions for given suitability codes. The index of the description corresponds
     * to the position of the letter code in the string provided in the suitabilityCodes field.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun suitabilityCodeDescs(): Optional<List<String>> =
        suitabilityCodeDescs.getOptional("suitabilityCodeDescs")

    /**
     * Associated suitability codes according to the Airfield Suitability and Restrictions Report
     * (ASRR) for this airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun suitabilityCodes(): Optional<String> = suitabilityCodes.getOptional("suitabilityCodes")

    /**
     * Time the row was last updated in the database, auto-populated by the system.
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
     * The airfield's World Area Code installation number (WAC-INNR).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun wacInnr(): Optional<String> = wacInnr.getOptional("wacINNR")

    /**
     * Air Mobility Command (AMC) Zone availability Report identifier.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zarId(): Optional<String> = zarId.getOptional("zarId")

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
     * Returns the raw JSON value of [altAirfieldId].
     *
     * Unlike [altAirfieldId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altAirfieldId")
    @ExcludeMissing
    fun _altAirfieldId(): JsonField<String> = altAirfieldId

    /**
     * Returns the raw JSON value of [alternativeNames].
     *
     * Unlike [alternativeNames], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("alternativeNames")
    @ExcludeMissing
    fun _alternativeNames(): JsonField<List<String>> = alternativeNames

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [countryName].
     *
     * Unlike [countryName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryName") @ExcludeMissing fun _countryName(): JsonField<String> = countryName

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
     * Returns the raw JSON value of [dstInfo].
     *
     * Unlike [dstInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dstInfo") @ExcludeMissing fun _dstInfo(): JsonField<String> = dstInfo

    /**
     * Returns the raw JSON value of [elevFt].
     *
     * Unlike [elevFt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elevFt") @ExcludeMissing fun _elevFt(): JsonField<Double> = elevFt

    /**
     * Returns the raw JSON value of [elevM].
     *
     * Unlike [elevM], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elevM") @ExcludeMissing fun _elevM(): JsonField<Double> = elevM

    /**
     * Returns the raw JSON value of [faa].
     *
     * Unlike [faa], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("faa") @ExcludeMissing fun _faa(): JsonField<String> = faa

    /**
     * Returns the raw JSON value of [geoloc].
     *
     * Unlike [geoloc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoloc") @ExcludeMissing fun _geoloc(): JsonField<String> = geoloc

    /**
     * Returns the raw JSON value of [gmtOffset].
     *
     * Unlike [gmtOffset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gmtOffset") @ExcludeMissing fun _gmtOffset(): JsonField<String> = gmtOffset

    /**
     * Returns the raw JSON value of [hostNatCode].
     *
     * Unlike [hostNatCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hostNatCode") @ExcludeMissing fun _hostNatCode(): JsonField<String> = hostNatCode

    /**
     * Returns the raw JSON value of [iata].
     *
     * Unlike [iata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iata") @ExcludeMissing fun _iata(): JsonField<String> = iata

    /**
     * Returns the raw JSON value of [icao].
     *
     * Unlike [icao], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("icao") @ExcludeMissing fun _icao(): JsonField<String> = icao

    /**
     * Returns the raw JSON value of [idSite].
     *
     * Unlike [idSite], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSite") @ExcludeMissing fun _idSite(): JsonField<String> = idSite

    /**
     * Returns the raw JSON value of [infoUrl].
     *
     * Unlike [infoUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("infoURL") @ExcludeMissing fun _infoUrl(): JsonField<String> = infoUrl

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
     * Returns the raw JSON value of [magDec].
     *
     * Unlike [magDec], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("magDec") @ExcludeMissing fun _magDec(): JsonField<Double> = magDec

    /**
     * Returns the raw JSON value of [maxRunwayLength].
     *
     * Unlike [maxRunwayLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxRunwayLength")
    @ExcludeMissing
    fun _maxRunwayLength(): JsonField<Int> = maxRunwayLength

    /**
     * Returns the raw JSON value of [miscCodes].
     *
     * Unlike [miscCodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("miscCodes") @ExcludeMissing fun _miscCodes(): JsonField<String> = miscCodes

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
     * Returns the raw JSON value of [regionalAuthority].
     *
     * Unlike [regionalAuthority], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("regionalAuthority")
    @ExcludeMissing
    fun _regionalAuthority(): JsonField<String> = regionalAuthority

    /**
     * Returns the raw JSON value of [regionName].
     *
     * Unlike [regionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regionName") @ExcludeMissing fun _regionName(): JsonField<String> = regionName

    /**
     * Returns the raw JSON value of [runways].
     *
     * Unlike [runways], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runways") @ExcludeMissing fun _runways(): JsonField<Int> = runways

    /**
     * Returns the raw JSON value of [secondaryIcao].
     *
     * Unlike [secondaryIcao], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secondaryICAO")
    @ExcludeMissing
    fun _secondaryIcao(): JsonField<String> = secondaryIcao

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /**
     * Returns the raw JSON value of [stateProvinceCode].
     *
     * Unlike [stateProvinceCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("stateProvinceCode")
    @ExcludeMissing
    fun _stateProvinceCode(): JsonField<String> = stateProvinceCode

    /**
     * Returns the raw JSON value of [suitabilityCodeDescs].
     *
     * Unlike [suitabilityCodeDescs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("suitabilityCodeDescs")
    @ExcludeMissing
    fun _suitabilityCodeDescs(): JsonField<List<String>> = suitabilityCodeDescs

    /**
     * Returns the raw JSON value of [suitabilityCodes].
     *
     * Unlike [suitabilityCodes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("suitabilityCodes")
    @ExcludeMissing
    fun _suitabilityCodes(): JsonField<String> = suitabilityCodes

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
     * Returns the raw JSON value of [wacInnr].
     *
     * Unlike [wacInnr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wacINNR") @ExcludeMissing fun _wacInnr(): JsonField<String> = wacInnr

    /**
     * Returns the raw JSON value of [zarId].
     *
     * Unlike [zarId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zarId") @ExcludeMissing fun _zarId(): JsonField<String> = zarId

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
         * Returns a mutable builder for constructing an instance of [AirfieldFull].
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

    /** A builder for [AirfieldFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var name: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var altAirfieldId: JsonField<String> = JsonMissing.of()
        private var alternativeNames: JsonField<MutableList<String>>? = null
        private var city: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var countryName: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dstInfo: JsonField<String> = JsonMissing.of()
        private var elevFt: JsonField<Double> = JsonMissing.of()
        private var elevM: JsonField<Double> = JsonMissing.of()
        private var faa: JsonField<String> = JsonMissing.of()
        private var geoloc: JsonField<String> = JsonMissing.of()
        private var gmtOffset: JsonField<String> = JsonMissing.of()
        private var hostNatCode: JsonField<String> = JsonMissing.of()
        private var iata: JsonField<String> = JsonMissing.of()
        private var icao: JsonField<String> = JsonMissing.of()
        private var idSite: JsonField<String> = JsonMissing.of()
        private var infoUrl: JsonField<String> = JsonMissing.of()
        private var lat: JsonField<Double> = JsonMissing.of()
        private var lon: JsonField<Double> = JsonMissing.of()
        private var magDec: JsonField<Double> = JsonMissing.of()
        private var maxRunwayLength: JsonField<Int> = JsonMissing.of()
        private var miscCodes: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var regionalAuthority: JsonField<String> = JsonMissing.of()
        private var regionName: JsonField<String> = JsonMissing.of()
        private var runways: JsonField<Int> = JsonMissing.of()
        private var secondaryIcao: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var stateProvinceCode: JsonField<String> = JsonMissing.of()
        private var suitabilityCodeDescs: JsonField<MutableList<String>>? = null
        private var suitabilityCodes: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var wacInnr: JsonField<String> = JsonMissing.of()
        private var zarId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(airfieldFull: AirfieldFull) = apply {
            classificationMarking = airfieldFull.classificationMarking
            dataMode = airfieldFull.dataMode
            name = airfieldFull.name
            source = airfieldFull.source
            type = airfieldFull.type
            id = airfieldFull.id
            altAirfieldId = airfieldFull.altAirfieldId
            alternativeNames = airfieldFull.alternativeNames.map { it.toMutableList() }
            city = airfieldFull.city
            countryCode = airfieldFull.countryCode
            countryName = airfieldFull.countryName
            createdAt = airfieldFull.createdAt
            createdBy = airfieldFull.createdBy
            dstInfo = airfieldFull.dstInfo
            elevFt = airfieldFull.elevFt
            elevM = airfieldFull.elevM
            faa = airfieldFull.faa
            geoloc = airfieldFull.geoloc
            gmtOffset = airfieldFull.gmtOffset
            hostNatCode = airfieldFull.hostNatCode
            iata = airfieldFull.iata
            icao = airfieldFull.icao
            idSite = airfieldFull.idSite
            infoUrl = airfieldFull.infoUrl
            lat = airfieldFull.lat
            lon = airfieldFull.lon
            magDec = airfieldFull.magDec
            maxRunwayLength = airfieldFull.maxRunwayLength
            miscCodes = airfieldFull.miscCodes
            origin = airfieldFull.origin
            origNetwork = airfieldFull.origNetwork
            regionalAuthority = airfieldFull.regionalAuthority
            regionName = airfieldFull.regionName
            runways = airfieldFull.runways
            secondaryIcao = airfieldFull.secondaryIcao
            sourceDl = airfieldFull.sourceDl
            state = airfieldFull.state
            stateProvinceCode = airfieldFull.stateProvinceCode
            suitabilityCodeDescs = airfieldFull.suitabilityCodeDescs.map { it.toMutableList() }
            suitabilityCodes = airfieldFull.suitabilityCodes
            updatedAt = airfieldFull.updatedAt
            updatedBy = airfieldFull.updatedBy
            wacInnr = airfieldFull.wacInnr
            zarId = airfieldFull.zarId
            additionalProperties = airfieldFull.additionalProperties.toMutableMap()
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

        /** The name of the airfield. */
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

        /**
         * The airfield activity use type (e.g. Commercial, Airport, Heliport, Gliderport, etc.).
         */
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

        /** Alternate Airfield identifier provided by source. */
        fun altAirfieldId(altAirfieldId: String) = altAirfieldId(JsonField.of(altAirfieldId))

        /**
         * Sets [Builder.altAirfieldId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altAirfieldId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun altAirfieldId(altAirfieldId: JsonField<String>) = apply {
            this.altAirfieldId = altAirfieldId
        }

        /** Alternative names for this airfield. */
        fun alternativeNames(alternativeNames: List<String>) =
            alternativeNames(JsonField.of(alternativeNames))

        /**
         * Sets [Builder.alternativeNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alternativeNames] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun alternativeNames(alternativeNames: JsonField<List<String>>) = apply {
            this.alternativeNames = alternativeNames.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [alternativeNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAlternativeName(alternativeName: String) = apply {
            alternativeNames =
                (alternativeNames ?: JsonField.of(mutableListOf())).also {
                    checkKnown("alternativeNames", it).add(alternativeName)
                }
        }

        /** The closest city to the location of this airfield. */
        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

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

        /** The country name where this airfield is located. */
        fun countryName(countryName: String) = countryName(JsonField.of(countryName))

        /**
         * Sets [Builder.countryName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryName(countryName: JsonField<String>) = apply { this.countryName = countryName }

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
         * Information regarding daylight saving time as is relevant to the location and operation
         * of this airfield.
         */
        fun dstInfo(dstInfo: String) = dstInfo(JsonField.of(dstInfo))

        /**
         * Sets [Builder.dstInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dstInfo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dstInfo(dstInfo: JsonField<String>) = apply { this.dstInfo = dstInfo }

        /**
         * Elevation of the airfield above mean sea level, in feet. Note: The corresponding
         * equivalent field is not converted by the UDL and may or may not be supplied by the
         * provider. The provider/consumer is responsible for all unit conversions.
         */
        fun elevFt(elevFt: Double) = elevFt(JsonField.of(elevFt))

        /**
         * Sets [Builder.elevFt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevFt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun elevFt(elevFt: JsonField<Double>) = apply { this.elevFt = elevFt }

        /**
         * Elevation of the airfield above mean sea level, in meters. Note: The corresponding
         * equivalent field is not converted by the UDL and may or may not be supplied by the
         * provider. The provider/consumer is responsible for all unit conversions.
         */
        fun elevM(elevM: Double) = elevM(JsonField.of(elevM))

        /**
         * Sets [Builder.elevM] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevM] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun elevM(elevM: JsonField<Double>) = apply { this.elevM = elevM }

        /** The Federal Aviation Administration (FAA) location identifier of this airfield. */
        fun faa(faa: String) = faa(JsonField.of(faa))

        /**
         * Sets [Builder.faa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.faa] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun faa(faa: JsonField<String>) = apply { this.faa = faa }

        /** Air Force geographic location code of the airfield. */
        fun geoloc(geoloc: String) = geoloc(JsonField.of(geoloc))

        /**
         * Sets [Builder.geoloc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoloc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun geoloc(geoloc: JsonField<String>) = apply { this.geoloc = geoloc }

        /**
         * Time difference between the location of the airfield and the Greenwich Mean Time (GMT),
         * expressed as +/-HH:MM. Time zones east of Greenwich have positive offsets and time zones
         * west of Greenwich are negative.
         */
        fun gmtOffset(gmtOffset: String) = gmtOffset(JsonField.of(gmtOffset))

        /**
         * Sets [Builder.gmtOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gmtOffset] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun gmtOffset(gmtOffset: JsonField<String>) = apply { this.gmtOffset = gmtOffset }

        /** The host nation code of this airfield, used for non-DoD/FAA locations. */
        fun hostNatCode(hostNatCode: String) = hostNatCode(JsonField.of(hostNatCode))

        /**
         * Sets [Builder.hostNatCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostNatCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hostNatCode(hostNatCode: JsonField<String>) = apply { this.hostNatCode = hostNatCode }

        /** The International Aviation Transport Association (IATA) code of the airfield. */
        fun iata(iata: String) = iata(JsonField.of(iata))

        /**
         * Sets [Builder.iata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iata] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iata(iata: JsonField<String>) = apply { this.iata = iata }

        /** The International Civil Aviation Organization (ICAO) code of the airfield. */
        fun icao(icao: String) = icao(JsonField.of(icao))

        /**
         * Sets [Builder.icao] to an arbitrary JSON value.
         *
         * You should usually call [Builder.icao] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun icao(icao: JsonField<String>) = apply { this.icao = icao }

        /** The ID of the parent site. */
        fun idSite(idSite: String) = idSite(JsonField.of(idSite))

        /**
         * Sets [Builder.idSite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSite] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSite(idSite: JsonField<String>) = apply { this.idSite = idSite }

        /** The URL link to information about airfield. */
        fun infoUrl(infoUrl: String) = infoUrl(JsonField.of(infoUrl))

        /**
         * Sets [Builder.infoUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.infoUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun infoUrl(infoUrl: JsonField<String>) = apply { this.infoUrl = infoUrl }

        /**
         * WGS84 latitude of the location, in degrees. -90 to 90 degrees (negative values south of
         * equator).
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
         * WGS84 longitude of the location, in degrees. -180 to 180 degrees (negative values west of
         * Prime Meridian).
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
         * The magnetic declination/variation of the airfield's location from true north, in
         * degrees. Positive values east of true north and negative values west of true north.
         */
        fun magDec(magDec: Double) = magDec(JsonField.of(magDec))

        /**
         * Sets [Builder.magDec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.magDec] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun magDec(magDec: JsonField<Double>) = apply { this.magDec = magDec }

        /** The length of the longest runway at this airfield in feet. */
        fun maxRunwayLength(maxRunwayLength: Int) = maxRunwayLength(JsonField.of(maxRunwayLength))

        /**
         * Sets [Builder.maxRunwayLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRunwayLength] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxRunwayLength(maxRunwayLength: JsonField<Int>) = apply {
            this.maxRunwayLength = maxRunwayLength
        }

        /**
         * Applicable miscellaneous codes according to the Airfield Suitability and Restrictions
         * Report (ASRR) for this airfield.
         */
        fun miscCodes(miscCodes: String) = miscCodes(JsonField.of(miscCodes))

        /**
         * Sets [Builder.miscCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.miscCodes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun miscCodes(miscCodes: JsonField<String>) = apply { this.miscCodes = miscCodes }

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

        /** The regional authority of the airfield. */
        fun regionalAuthority(regionalAuthority: String) =
            regionalAuthority(JsonField.of(regionalAuthority))

        /**
         * Sets [Builder.regionalAuthority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionalAuthority] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun regionalAuthority(regionalAuthority: JsonField<String>) = apply {
            this.regionalAuthority = regionalAuthority
        }

        /** Region where the airfield resides. */
        fun regionName(regionName: String) = regionName(JsonField.of(regionName))

        /**
         * Sets [Builder.regionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regionName(regionName: JsonField<String>) = apply { this.regionName = regionName }

        /** The number of runways at the site. */
        fun runways(runways: Int) = runways(JsonField.of(runways))

        /**
         * Sets [Builder.runways] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runways] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runways(runways: JsonField<Int>) = apply { this.runways = runways }

        /**
         * The secondary ICAO code for this airfield. Some airfields have two associated ICAO codes,
         * this can occur in cases when a single airfield supports both military and civilian
         * operations.
         */
        fun secondaryIcao(secondaryIcao: String) = secondaryIcao(JsonField.of(secondaryIcao))

        /**
         * Sets [Builder.secondaryIcao] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryIcao] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun secondaryIcao(secondaryIcao: JsonField<String>) = apply {
            this.secondaryIcao = secondaryIcao
        }

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

        /** State or province of the airfield's location. */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /**
         * The code for the state or province in which this airfield is located. Intended as, but
         * not constrained to, FIPS 10-4 region code designations.
         */
        fun stateProvinceCode(stateProvinceCode: String) =
            stateProvinceCode(JsonField.of(stateProvinceCode))

        /**
         * Sets [Builder.stateProvinceCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stateProvinceCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stateProvinceCode(stateProvinceCode: JsonField<String>) = apply {
            this.stateProvinceCode = stateProvinceCode
        }

        /**
         * Array of descriptions for given suitability codes. The index of the description
         * corresponds to the position of the letter code in the string provided in the
         * suitabilityCodes field.
         */
        fun suitabilityCodeDescs(suitabilityCodeDescs: List<String>) =
            suitabilityCodeDescs(JsonField.of(suitabilityCodeDescs))

        /**
         * Sets [Builder.suitabilityCodeDescs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suitabilityCodeDescs] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun suitabilityCodeDescs(suitabilityCodeDescs: JsonField<List<String>>) = apply {
            this.suitabilityCodeDescs = suitabilityCodeDescs.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [suitabilityCodeDescs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSuitabilityCodeDesc(suitabilityCodeDesc: String) = apply {
            suitabilityCodeDescs =
                (suitabilityCodeDescs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("suitabilityCodeDescs", it).add(suitabilityCodeDesc)
                }
        }

        /**
         * Associated suitability codes according to the Airfield Suitability and Restrictions
         * Report (ASRR) for this airfield.
         */
        fun suitabilityCodes(suitabilityCodes: String) =
            suitabilityCodes(JsonField.of(suitabilityCodes))

        /**
         * Sets [Builder.suitabilityCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suitabilityCodes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun suitabilityCodes(suitabilityCodes: JsonField<String>) = apply {
            this.suitabilityCodes = suitabilityCodes
        }

        /** Time the row was last updated in the database, auto-populated by the system. */
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

        /** The airfield's World Area Code installation number (WAC-INNR). */
        fun wacInnr(wacInnr: String) = wacInnr(JsonField.of(wacInnr))

        /**
         * Sets [Builder.wacInnr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wacInnr] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun wacInnr(wacInnr: JsonField<String>) = apply { this.wacInnr = wacInnr }

        /** Air Mobility Command (AMC) Zone availability Report identifier. */
        fun zarId(zarId: String) = zarId(JsonField.of(zarId))

        /**
         * Sets [Builder.zarId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zarId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zarId(zarId: JsonField<String>) = apply { this.zarId = zarId }

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
         * Returns an immutable instance of [AirfieldFull].
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
        fun build(): AirfieldFull =
            AirfieldFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("name", name),
                checkRequired("source", source),
                checkRequired("type", type),
                id,
                altAirfieldId,
                (alternativeNames ?: JsonMissing.of()).map { it.toImmutable() },
                city,
                countryCode,
                countryName,
                createdAt,
                createdBy,
                dstInfo,
                elevFt,
                elevM,
                faa,
                geoloc,
                gmtOffset,
                hostNatCode,
                iata,
                icao,
                idSite,
                infoUrl,
                lat,
                lon,
                magDec,
                maxRunwayLength,
                miscCodes,
                origin,
                origNetwork,
                regionalAuthority,
                regionName,
                runways,
                secondaryIcao,
                sourceDl,
                state,
                stateProvinceCode,
                (suitabilityCodeDescs ?: JsonMissing.of()).map { it.toImmutable() },
                suitabilityCodes,
                updatedAt,
                updatedBy,
                wacInnr,
                zarId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AirfieldFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        name()
        source()
        type()
        id()
        altAirfieldId()
        alternativeNames()
        city()
        countryCode()
        countryName()
        createdAt()
        createdBy()
        dstInfo()
        elevFt()
        elevM()
        faa()
        geoloc()
        gmtOffset()
        hostNatCode()
        iata()
        icao()
        idSite()
        infoUrl()
        lat()
        lon()
        magDec()
        maxRunwayLength()
        miscCodes()
        origin()
        origNetwork()
        regionalAuthority()
        regionName()
        runways()
        secondaryIcao()
        sourceDl()
        state()
        stateProvinceCode()
        suitabilityCodeDescs()
        suitabilityCodes()
        updatedAt()
        updatedBy()
        wacInnr()
        zarId()
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
            (if (altAirfieldId.asKnown().isPresent) 1 else 0) +
            (alternativeNames.asKnown().getOrNull()?.size ?: 0) +
            (if (city.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (countryName.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dstInfo.asKnown().isPresent) 1 else 0) +
            (if (elevFt.asKnown().isPresent) 1 else 0) +
            (if (elevM.asKnown().isPresent) 1 else 0) +
            (if (faa.asKnown().isPresent) 1 else 0) +
            (if (geoloc.asKnown().isPresent) 1 else 0) +
            (if (gmtOffset.asKnown().isPresent) 1 else 0) +
            (if (hostNatCode.asKnown().isPresent) 1 else 0) +
            (if (iata.asKnown().isPresent) 1 else 0) +
            (if (icao.asKnown().isPresent) 1 else 0) +
            (if (idSite.asKnown().isPresent) 1 else 0) +
            (if (infoUrl.asKnown().isPresent) 1 else 0) +
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (lon.asKnown().isPresent) 1 else 0) +
            (if (magDec.asKnown().isPresent) 1 else 0) +
            (if (maxRunwayLength.asKnown().isPresent) 1 else 0) +
            (if (miscCodes.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (regionalAuthority.asKnown().isPresent) 1 else 0) +
            (if (regionName.asKnown().isPresent) 1 else 0) +
            (if (runways.asKnown().isPresent) 1 else 0) +
            (if (secondaryIcao.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (if (stateProvinceCode.asKnown().isPresent) 1 else 0) +
            (suitabilityCodeDescs.asKnown().getOrNull()?.size ?: 0) +
            (if (suitabilityCodes.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (wacInnr.asKnown().isPresent) 1 else 0) +
            (if (zarId.asKnown().isPresent) 1 else 0)

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

        return other is AirfieldFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            name == other.name &&
            source == other.source &&
            type == other.type &&
            id == other.id &&
            altAirfieldId == other.altAirfieldId &&
            alternativeNames == other.alternativeNames &&
            city == other.city &&
            countryCode == other.countryCode &&
            countryName == other.countryName &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            dstInfo == other.dstInfo &&
            elevFt == other.elevFt &&
            elevM == other.elevM &&
            faa == other.faa &&
            geoloc == other.geoloc &&
            gmtOffset == other.gmtOffset &&
            hostNatCode == other.hostNatCode &&
            iata == other.iata &&
            icao == other.icao &&
            idSite == other.idSite &&
            infoUrl == other.infoUrl &&
            lat == other.lat &&
            lon == other.lon &&
            magDec == other.magDec &&
            maxRunwayLength == other.maxRunwayLength &&
            miscCodes == other.miscCodes &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            regionalAuthority == other.regionalAuthority &&
            regionName == other.regionName &&
            runways == other.runways &&
            secondaryIcao == other.secondaryIcao &&
            sourceDl == other.sourceDl &&
            state == other.state &&
            stateProvinceCode == other.stateProvinceCode &&
            suitabilityCodeDescs == other.suitabilityCodeDescs &&
            suitabilityCodes == other.suitabilityCodes &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            wacInnr == other.wacInnr &&
            zarId == other.zarId &&
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
            altAirfieldId,
            alternativeNames,
            city,
            countryCode,
            countryName,
            createdAt,
            createdBy,
            dstInfo,
            elevFt,
            elevM,
            faa,
            geoloc,
            gmtOffset,
            hostNatCode,
            iata,
            icao,
            idSite,
            infoUrl,
            lat,
            lon,
            magDec,
            maxRunwayLength,
            miscCodes,
            origin,
            origNetwork,
            regionalAuthority,
            regionName,
            runways,
            secondaryIcao,
            sourceDl,
            state,
            stateProvinceCode,
            suitabilityCodeDescs,
            suitabilityCodes,
            updatedAt,
            updatedBy,
            wacInnr,
            zarId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AirfieldFull{classificationMarking=$classificationMarking, dataMode=$dataMode, name=$name, source=$source, type=$type, id=$id, altAirfieldId=$altAirfieldId, alternativeNames=$alternativeNames, city=$city, countryCode=$countryCode, countryName=$countryName, createdAt=$createdAt, createdBy=$createdBy, dstInfo=$dstInfo, elevFt=$elevFt, elevM=$elevM, faa=$faa, geoloc=$geoloc, gmtOffset=$gmtOffset, hostNatCode=$hostNatCode, iata=$iata, icao=$icao, idSite=$idSite, infoUrl=$infoUrl, lat=$lat, lon=$lon, magDec=$magDec, maxRunwayLength=$maxRunwayLength, miscCodes=$miscCodes, origin=$origin, origNetwork=$origNetwork, regionalAuthority=$regionalAuthority, regionName=$regionName, runways=$runways, secondaryIcao=$secondaryIcao, sourceDl=$sourceDl, state=$state, stateProvinceCode=$stateProvinceCode, suitabilityCodeDescs=$suitabilityCodeDescs, suitabilityCodes=$suitabilityCodes, updatedAt=$updatedAt, updatedBy=$updatedBy, wacInnr=$wacInnr, zarId=$zarId, additionalProperties=$additionalProperties}"
}

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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Model representation of a unit or organization which operates or controls a space-related Entity
 * such as an on-orbit payload, a sensor, etc. A contact may belong to an organization.
 */
class OperatingunitFull
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val name: JsonField<String>,
    private val source: JsonField<String>,
    private val airDefArea: JsonField<String>,
    private val allegiance: JsonField<String>,
    private val altAllegiance: JsonField<String>,
    private val altCountryCode: JsonField<String>,
    private val altOperatingUnitId: JsonField<String>,
    private val classRating: JsonField<String>,
    private val condition: JsonField<String>,
    private val conditionAvail: JsonField<String>,
    private val coord: JsonField<String>,
    private val coordDatum: JsonField<String>,
    private val coordDerivAcc: JsonField<Double>,
    private val countryCode: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val deployStatus: JsonField<String>,
    private val description: JsonField<String>,
    private val divCat: JsonField<String>,
    private val echelon: JsonField<String>,
    private val echelonTier: JsonField<String>,
    private val elevMsl: JsonField<Double>,
    private val elevMslConfLvl: JsonField<Int>,
    private val elevMslDerivAcc: JsonField<Double>,
    private val eval: JsonField<Int>,
    private val flagFlown: JsonField<String>,
    private val fleetId: JsonField<String>,
    private val force: JsonField<String>,
    private val forceName: JsonField<String>,
    private val fpa: JsonField<String>,
    private val functRole: JsonField<String>,
    private val geoidalMslSep: JsonField<Double>,
    private val idContact: JsonField<String>,
    private val ident: JsonField<String>,
    private val idLocation: JsonField<String>,
    private val idOperatingUnit: JsonField<String>,
    private val idOrganization: JsonField<String>,
    private val lat: JsonField<Double>,
    private val location: JsonField<LocationFull>,
    private val locName: JsonField<String>,
    private val locReason: JsonField<String>,
    private val lon: JsonField<Double>,
    private val masterUnit: JsonField<Boolean>,
    private val milGrid: JsonField<String>,
    private val milGridSys: JsonField<String>,
    private val msnPrimary: JsonField<String>,
    private val msnPrimarySpecialty: JsonField<String>,
    private val operatingUnitRemarks: JsonField<List<OperatingUnitRemarkFull>>,
    private val operStatus: JsonField<String>,
    private val organization: JsonField<OrganizationFull>,
    private val origin: JsonField<String>,
    private val polSubdiv: JsonField<String>,
    private val recStatus: JsonField<String>,
    private val referenceDoc: JsonField<String>,
    private val resProd: JsonField<String>,
    private val reviewDate: JsonField<LocalDate>,
    private val stylizedUnit: JsonField<Boolean>,
    private val symCode: JsonField<String>,
    private val unitIdentifier: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val utm: JsonField<String>,
    private val wac: JsonField<String>,
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
        @JsonProperty("airDefArea")
        @ExcludeMissing
        airDefArea: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allegiance")
        @ExcludeMissing
        allegiance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altAllegiance")
        @ExcludeMissing
        altAllegiance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altCountryCode")
        @ExcludeMissing
        altCountryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altOperatingUnitId")
        @ExcludeMissing
        altOperatingUnitId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("classRating")
        @ExcludeMissing
        classRating: JsonField<String> = JsonMissing.of(),
        @JsonProperty("condition") @ExcludeMissing condition: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conditionAvail")
        @ExcludeMissing
        conditionAvail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("coord") @ExcludeMissing coord: JsonField<String> = JsonMissing.of(),
        @JsonProperty("coordDatum")
        @ExcludeMissing
        coordDatum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("coordDerivAcc")
        @ExcludeMissing
        coordDerivAcc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deployStatus")
        @ExcludeMissing
        deployStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("divCat") @ExcludeMissing divCat: JsonField<String> = JsonMissing.of(),
        @JsonProperty("echelon") @ExcludeMissing echelon: JsonField<String> = JsonMissing.of(),
        @JsonProperty("echelonTier")
        @ExcludeMissing
        echelonTier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("elevMsl") @ExcludeMissing elevMsl: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elevMslConfLvl")
        @ExcludeMissing
        elevMslConfLvl: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("elevMslDerivAcc")
        @ExcludeMissing
        elevMslDerivAcc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("eval") @ExcludeMissing eval: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("flagFlown") @ExcludeMissing flagFlown: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fleetId") @ExcludeMissing fleetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("force") @ExcludeMissing force: JsonField<String> = JsonMissing.of(),
        @JsonProperty("forceName") @ExcludeMissing forceName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fpa") @ExcludeMissing fpa: JsonField<String> = JsonMissing.of(),
        @JsonProperty("functRole") @ExcludeMissing functRole: JsonField<String> = JsonMissing.of(),
        @JsonProperty("geoidalMslSep")
        @ExcludeMissing
        geoidalMslSep: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idContact") @ExcludeMissing idContact: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ident") @ExcludeMissing ident: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idLocation")
        @ExcludeMissing
        idLocation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOperatingUnit")
        @ExcludeMissing
        idOperatingUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOrganization")
        @ExcludeMissing
        idOrganization: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("location")
        @ExcludeMissing
        location: JsonField<LocationFull> = JsonMissing.of(),
        @JsonProperty("locName") @ExcludeMissing locName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locReason") @ExcludeMissing locReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("masterUnit")
        @ExcludeMissing
        masterUnit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("milGrid") @ExcludeMissing milGrid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("milGridSys")
        @ExcludeMissing
        milGridSys: JsonField<String> = JsonMissing.of(),
        @JsonProperty("msnPrimary")
        @ExcludeMissing
        msnPrimary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("msnPrimarySpecialty")
        @ExcludeMissing
        msnPrimarySpecialty: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operatingUnitRemarks")
        @ExcludeMissing
        operatingUnitRemarks: JsonField<List<OperatingUnitRemarkFull>> = JsonMissing.of(),
        @JsonProperty("operStatus")
        @ExcludeMissing
        operStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization")
        @ExcludeMissing
        organization: JsonField<OrganizationFull> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("polSubdiv") @ExcludeMissing polSubdiv: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recStatus") @ExcludeMissing recStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referenceDoc")
        @ExcludeMissing
        referenceDoc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resProd") @ExcludeMissing resProd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reviewDate")
        @ExcludeMissing
        reviewDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("stylizedUnit")
        @ExcludeMissing
        stylizedUnit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("symCode") @ExcludeMissing symCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unitIdentifier")
        @ExcludeMissing
        unitIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("utm") @ExcludeMissing utm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wac") @ExcludeMissing wac: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        name,
        source,
        airDefArea,
        allegiance,
        altAllegiance,
        altCountryCode,
        altOperatingUnitId,
        classRating,
        condition,
        conditionAvail,
        coord,
        coordDatum,
        coordDerivAcc,
        countryCode,
        createdAt,
        createdBy,
        deployStatus,
        description,
        divCat,
        echelon,
        echelonTier,
        elevMsl,
        elevMslConfLvl,
        elevMslDerivAcc,
        eval,
        flagFlown,
        fleetId,
        force,
        forceName,
        fpa,
        functRole,
        geoidalMslSep,
        idContact,
        ident,
        idLocation,
        idOperatingUnit,
        idOrganization,
        lat,
        location,
        locName,
        locReason,
        lon,
        masterUnit,
        milGrid,
        milGridSys,
        msnPrimary,
        msnPrimarySpecialty,
        operatingUnitRemarks,
        operStatus,
        organization,
        origin,
        polSubdiv,
        recStatus,
        referenceDoc,
        resProd,
        reviewDate,
        stylizedUnit,
        symCode,
        unitIdentifier,
        updatedAt,
        updatedBy,
        utm,
        wac,
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
     * Name of the operating unit.
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
     * Air Defense District (ADD) or Air Defense Area (ADA) in which the geographic coordinates
     * reside.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun airDefArea(): Optional<String> = airDefArea.getOptional("airDefArea")

    /**
     * The DoD Standard country code designator for the country or political entity to which the
     * operating unit owes its allegiance. This field will be set to "OTHR" if the source value does
     * not match a UDL country code value (ISO-3166-ALPHA-2).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun allegiance(): Optional<String> = allegiance.getOptional("allegiance")

    /**
     * Specifies an alternate allegiance code if the data provider code is not part of an official
     * Country Code standard such as ISO-3166 or FIPS. This field will be set to the value provided
     * by the source and should be used for all Queries specifying allegiance.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altAllegiance(): Optional<String> = altAllegiance.getOptional("altAllegiance")

    /**
     * Specifies an alternate country code if the data provider code is not part of an official
     * Country Code standard such as ISO-3166 or FIPS. This field will be set to the value provided
     * by the source and should be used for all Queries specifying a Country Code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altCountryCode(): Optional<String> = altCountryCode.getOptional("altCountryCode")

    /**
     * Unique identifier of the operating unit record from the originating system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altOperatingUnitId(): Optional<String> =
        altOperatingUnitId.getOptional("altOperatingUnitId")

    /**
     * Indicates the importance of the operating unit to the OES or MIR system. This data element is
     * restricted to update by DIA (DB-4). Valid values are: 0 - Does not meet criteria above 1 -
     * Primary importance to system 2 - Secondary importance to system 3 - Tertiary importance to
     * system O - Other. Explain in Remarks.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun classRating(): Optional<String> = classRating.getOptional("classRating")

    /**
     * The physical manner of being or state of existence of the operating unit. A physical
     * condition that must be considered in the determining of a course of action. The specific
     * usage and enumerations contained in this field may be found in the documentation provided in
     * the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun condition(): Optional<String> = condition.getOptional("condition")

    /**
     * Availability of the operating unit relative to its condition. Indicates the reason the
     * operating unit is not fully operational. The specific usage and enumerations contained in
     * this field may be found in the documentation provided in the referenceDoc field. If
     * referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun conditionAvail(): Optional<String> = conditionAvail.getOptional("conditionAvail")

    /**
     * Indicates any of the magnitudes that serve to define the position of a point by reference to
     * a fixed figure, system of lines, etc.
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
     * Pos. 1-21. Unknown Latitude and Unknown Longitude [000000000U000000000U]
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coord(): Optional<String> = coord.getOptional("coord")

    /**
     * A mathematical model of the earth used to calculate coordinates on a map. US Forces use the
     * World Geodetic System 1984 (WGS 84), but also use maps by allied countries with local datums.
     * The datum must be specified to ensure accuracy of coordinates. The specific usage and
     * enumerations contained in this field may be found in the documentation provided in the
     * referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coordDatum(): Optional<String> = coordDatum.getOptional("coordDatum")

    /**
     * Indicates the plus or minus error assessed against the method used to derive the coordinate.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coordDerivAcc(): Optional<Double> = coordDerivAcc.getOptional("coordDerivAcc")

    /**
     * The DoD Standard country code designator for the country or political entity to which the
     * operating unit geographic coordinates reside . This field will be set to "OTHR" if the source
     * value does not match a UDL country code value (ISO-3166-ALPHA-2).
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
     * A code describing the amount of operating unit participation in a deployment. The specific
     * usage and enumerations contained in this field may be found in the documentation provided in
     * the referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun deployStatus(): Optional<String> = deployStatus.getOptional("deployStatus")

    /**
     * Description of the operating unit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Combat status of a divisional or equivalent operating unit. Currently, this data element
     * applies only to operating units of the Former Soviet Union. The specific usage and
     * enumerations contained in this field may be found in the documentation provided in the
     * referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun divCat(): Optional<String> = divCat.getOptional("divCat")

    /**
     * Organizational level of the operating unit. The specific usage and enumerations contained in
     * this field may be found in the documentation provided in the referenceDoc field. If
     * referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun echelon(): Optional<String> = echelon.getOptional("echelon")

    /**
     * Indicates the major group or level to which an echelon belongs. The specific usage and
     * enumerations contained in this field may be found in the documentation provided in the
     * referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun echelonTier(): Optional<String> = echelonTier.getOptional("echelonTier")

    /**
     * Ground elevation of the geographic coordinates referenced to (above or below) Mean Sea Level
     * (MSL) vertical datum.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevMsl(): Optional<Double> = elevMsl.getOptional("elevMsl")

    /**
     * Indicates the confidence level expressed as a percent that a specific geometric spatial
     * element, ELEVATION_MSL linear accuracy, has been vertically positioned to within a specified
     * vertical accuracy.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevMslConfLvl(): Optional<Int> = elevMslConfLvl.getOptional("elevMslConfLvl")

    /**
     * Indicates the plus or minus error assessed against the method used to derive the elevation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elevMslDerivAcc(): Optional<Double> = elevMslDerivAcc.getOptional("elevMslDerivAcc")

    /**
     * The Intelligence Confidence Level or the Reliability/degree of confidence that the analyst
     * has assigned to the data within this record. The numerical range is from 1 to 9 with 1
     * representing the highest confidence level.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eval(): Optional<Int> = eval.getOptional("eval")

    /**
     * The country code of the observed flag flown.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun flagFlown(): Optional<String> = flagFlown.getOptional("flagFlown")

    /**
     * Naval fleet to which an operating unit is assigned. The specific usage and enumerations
     * contained in this field may be found in the documentation provided in the referenceDoc field.
     * If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fleetId(): Optional<String> = fleetId.getOptional("fleetId")

    /**
     * An aggregation of military units within a single service (i.e., ARMY, AIR FORCE, etc.) which
     * operates under a single authority to accomplish a common mission. The specific usage and
     * enumerations contained in this field may be found in the documentation provided in the
     * referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun force(): Optional<String> = force.getOptional("force")

    /**
     * The specific name for a given force. For example, Force = ADF (Air Defense Force) and Force
     * Name = Army Air Defense Force.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun forceName(): Optional<String> = forceName.getOptional("forceName")

    /**
     * Functional Production Area (FPA) under the Shared Production Program (SPP). Producers are
     * defined per country per FPA. The specific usage and enumerations contained in this field may
     * be found in the documentation provided in the referenceDoc field. If referenceDoc not
     * provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fpa(): Optional<String> = fpa.getOptional("fpa")

    /**
     * Principal combat-related role that an operating unit is organized, structured and equipped to
     * perform. Or, the specialized military or paramilitary branch in which an individual serves,
     * their specialization. The specific usage and enumerations contained in this field may be
     * found in the documentation provided in the referenceDoc field. If referenceDoc not provided,
     * users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun functRole(): Optional<String> = functRole.getOptional("functRole")

    /**
     * The distance between Mean Sea Level and a referenced ellipsoid.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoidalMslSep(): Optional<Double> = geoidalMslSep.getOptional("geoidalMslSep")

    /**
     * Unique identifier of the contact for this operating unit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idContact(): Optional<String> = idContact.getOptional("idContact")

    /**
     * Estimated identity of the Site (ASSUMED FRIEND, FRIEND, HOSTILE, FAKER, JOKER, NEUTRAL,
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
     * FAKER: Friendly track, object, or entity acting as an exercise hostile.
     *
     * JOKER: Friendly track, object, or entity acting as an exercise suspect.
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
    fun ident(): Optional<String> = ident.getOptional("ident")

    /**
     * Unique identifier of the location record for this operating unit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idLocation(): Optional<String> = idLocation.getOptional("idLocation")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOperatingUnit(): Optional<String> = idOperatingUnit.getOptional("idOperatingUnit")

    /**
     * Unique identifier of the organization record for this operating unit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOrganization(): Optional<String> = idOrganization.getOptional("idOrganization")

    /**
     * WGS84 latitude of the location, in degrees. -90 to 90 degrees (negative values south of
     * equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lat(): Optional<Double> = lat.getOptional("lat")

    /**
     * Model representation of a location, which is a specific fixed point on the earth and is used
     * to denote the locations of fixed sensors, operating units, etc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun location(): Optional<LocationFull> = location.getOptional("location")

    /**
     * Location name for the coordinates.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun locName(): Optional<String> = locName.getOptional("locName")

    /**
     * Indicates the reason that the operating unit is at that location. The specific usage and
     * enumerations contained in this field may be found in the documentation provided in the
     * referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun locReason(): Optional<String> = locReason.getOptional("locReason")

    /**
     * WGS84 longitude of the location, in degrees. -180 to 180 degrees (negative values west of
     * Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lon(): Optional<Double> = lon.getOptional("lon")

    /**
     * This field contains a value indicating whether the record is a master unit record (True) or a
     * detail record (False). Master records contain basic information that does not change over
     * time for each unit that has been selected to be projected.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun masterUnit(): Optional<Boolean> = masterUnit.getOptional("masterUnit")

    /**
     * The Military Grid Reference System is the geocoordinate standard used by NATO militaries for
     * locating points on Earth. The MGRS is derived from the Universal Transverse Mercator (UTM)
     * grid system and the Universal Polar Stereographic (UPS) grid system, but uses a different
     * labeling convention. The MGRS is used as geocode for the entire Earth. Example of an milgrid
     * coordinate, or grid reference, would be 4QFJ12345678, which consists of three parts: 4Q (grid
     * zone designator, GZD) FJ (the 100,000-meter square identifier) 12345678 (numerical location;
     * easting is 1234 and northing is 5678, in this case specifying a location with 10 m
     * resolution).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun milGrid(): Optional<String> = milGrid.getOptional("milGrid")

    /**
     * Indicates the grid system used in the development of the milGrid coordinates. Values are:
     *
     * UPS - Universal Polar System
     *
     * UTM - Universal Transverse Mercator
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun milGridSys(): Optional<String> = milGridSys.getOptional("milGridSys")

    /**
     * Indicates the principal type of mission that an operating unit is organized and equipped to
     * perform. The specific usage and enumerations contained in this field may be found in the
     * documentation provided in the referenceDoc field. If referenceDoc not provided, users may
     * consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun msnPrimary(): Optional<String> = msnPrimary.getOptional("msnPrimary")

    /**
     * Indicates the principal specialty type of mission that an operating unit is organized and
     * equipped to perform. The specific usage and enumerations contained in this field may be found
     * in the documentation provided in the referenceDoc field. If referenceDoc not provided, users
     * may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun msnPrimarySpecialty(): Optional<String> =
        msnPrimarySpecialty.getOptional("msnPrimarySpecialty")

    /**
     * Remarks contain amplifying information for a specific service. The information may contain
     * context and interpretations for consumer use.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operatingUnitRemarks(): Optional<List<OperatingUnitRemarkFull>> =
        operatingUnitRemarks.getOptional("operatingUnitRemarks")

    /**
     * The Degree to which an operating unit is ready to perform the overall operational mission(s)
     * for which it was organized and equipped. The specific usage and enumerations contained in
     * this field may be found in the documentation provided in the referenceDoc field. If
     * referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operStatus(): Optional<String> = operStatus.getOptional("operStatus")

    /**
     * An organization such as a corporation, manufacturer, consortium, government, etc. An
     * organization may have parent and child organizations as well as link to a former organization
     * if this org previously existed as another organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun organization(): Optional<OrganizationFull> = organization.getOptional("organization")

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
     * Political subdivision in which the geographic coordinates reside. The specific usage and
     * enumerations contained in this field may be found in the documentation provided in the
     * referenceDoc field. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polSubdiv(): Optional<String> = polSubdiv.getOptional("polSubdiv")

    /**
     * Validity and currency of the data in the record to be used in conjunction with the other
     * elements in the record as defined by SOPs. Values are: A - Active I - Inactive K -
     * Acknowledged L - Local Q - A nominated (NOM) or Data Change Request (DCR) record R -
     * Production reduced by CMD decision W - Working Record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun recStatus(): Optional<String> = recStatus.getOptional("recStatus")

    /**
     * The reference documentiation that specifies the usage and enumerations contained in this
     * record. If referenceDoc not provided, users may consult the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun referenceDoc(): Optional<String> = referenceDoc.getOptional("referenceDoc")

    /**
     * Responsible Producer - Organization that is responsible for the maintenance of the record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun resProd(): Optional<String> = resProd.getOptional("resProd")

    /**
     * Date on which the data in the record was last reviewed by the responsible analyst for
     * accuracy and currency. This date cannot be greater than the current date.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reviewDate(): Optional<LocalDate> = reviewDate.getOptional("reviewDate")

    /**
     * This field contains a value indicating whether the record is a stylized operating unit record
     * (True) or a regular operating unit record (False). A stylized operating unit is a type of
     * operating unit with one set of equipment that can be assigned to one or more superiors. A
     * stylized operating unit is generally useful for lower echelon operating units where the
     * number of operating units and types of equipment are equal for multiple organizations. In
     * lieu of creating unique operating unit records for each operating unit, a template is created
     * for the operating unit and its equipment. This template enables the user to assign the
     * operating unit to multiple organizations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stylizedUnit(): Optional<Boolean> = stylizedUnit.getOptional("stylizedUnit")

    /**
     * A standard scheme for symbol coding enabling the transfer, display and use of symbols and
     * graphics among information systems, as per MIL-STD 2525B, and supported by the element
     * AFFILIATION.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun symCode(): Optional<String> = symCode.getOptional("symCode")

    /**
     * An optional identifier for this operating unit that may be composed from items such as the
     * originating organization, allegiance, one-up number, etc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun unitIdentifier(): Optional<String> = unitIdentifier.getOptional("unitIdentifier")

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
     * Universal Transverse Mercator (UTM) grid coordinates. Pos. 1-2, UTM Zone Column
     * [01-60 Pos. 3, UTM Zone Row [C-HJ-NP-X] Pos. 4, UTM False Easting [0-9] Pos. 5-9, UTM Meter
     * Easting [0-9][0-9][0-9][0-9][0-9] Pos. 10-11, UTM False Northing [0-9][0-9] Pos. 12-16, UTM
     * Meter Northing [0-9][0-9][0-9][0-9][0-9].
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun utm(): Optional<String> = utm.getOptional("utm")

    /**
     * World Aeronautical Chart identifier for the area in which a designated operating unit is
     * located.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun wac(): Optional<String> = wac.getOptional("wac")

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
     * Returns the raw JSON value of [airDefArea].
     *
     * Unlike [airDefArea], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("airDefArea") @ExcludeMissing fun _airDefArea(): JsonField<String> = airDefArea

    /**
     * Returns the raw JSON value of [allegiance].
     *
     * Unlike [allegiance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allegiance") @ExcludeMissing fun _allegiance(): JsonField<String> = allegiance

    /**
     * Returns the raw JSON value of [altAllegiance].
     *
     * Unlike [altAllegiance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altAllegiance")
    @ExcludeMissing
    fun _altAllegiance(): JsonField<String> = altAllegiance

    /**
     * Returns the raw JSON value of [altCountryCode].
     *
     * Unlike [altCountryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altCountryCode")
    @ExcludeMissing
    fun _altCountryCode(): JsonField<String> = altCountryCode

    /**
     * Returns the raw JSON value of [altOperatingUnitId].
     *
     * Unlike [altOperatingUnitId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("altOperatingUnitId")
    @ExcludeMissing
    fun _altOperatingUnitId(): JsonField<String> = altOperatingUnitId

    /**
     * Returns the raw JSON value of [classRating].
     *
     * Unlike [classRating], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("classRating") @ExcludeMissing fun _classRating(): JsonField<String> = classRating

    /**
     * Returns the raw JSON value of [condition].
     *
     * Unlike [condition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("condition") @ExcludeMissing fun _condition(): JsonField<String> = condition

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
    @JsonProperty("coord") @ExcludeMissing fun _coord(): JsonField<String> = coord

    /**
     * Returns the raw JSON value of [coordDatum].
     *
     * Unlike [coordDatum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coordDatum") @ExcludeMissing fun _coordDatum(): JsonField<String> = coordDatum

    /**
     * Returns the raw JSON value of [coordDerivAcc].
     *
     * Unlike [coordDerivAcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coordDerivAcc")
    @ExcludeMissing
    fun _coordDerivAcc(): JsonField<Double> = coordDerivAcc

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
     * Returns the raw JSON value of [deployStatus].
     *
     * Unlike [deployStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deployStatus")
    @ExcludeMissing
    fun _deployStatus(): JsonField<String> = deployStatus

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [divCat].
     *
     * Unlike [divCat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("divCat") @ExcludeMissing fun _divCat(): JsonField<String> = divCat

    /**
     * Returns the raw JSON value of [echelon].
     *
     * Unlike [echelon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("echelon") @ExcludeMissing fun _echelon(): JsonField<String> = echelon

    /**
     * Returns the raw JSON value of [echelonTier].
     *
     * Unlike [echelonTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("echelonTier") @ExcludeMissing fun _echelonTier(): JsonField<String> = echelonTier

    /**
     * Returns the raw JSON value of [elevMsl].
     *
     * Unlike [elevMsl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elevMsl") @ExcludeMissing fun _elevMsl(): JsonField<Double> = elevMsl

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
     * Returns the raw JSON value of [eval].
     *
     * Unlike [eval], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eval") @ExcludeMissing fun _eval(): JsonField<Int> = eval

    /**
     * Returns the raw JSON value of [flagFlown].
     *
     * Unlike [flagFlown], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flagFlown") @ExcludeMissing fun _flagFlown(): JsonField<String> = flagFlown

    /**
     * Returns the raw JSON value of [fleetId].
     *
     * Unlike [fleetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fleetId") @ExcludeMissing fun _fleetId(): JsonField<String> = fleetId

    /**
     * Returns the raw JSON value of [force].
     *
     * Unlike [force], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("force") @ExcludeMissing fun _force(): JsonField<String> = force

    /**
     * Returns the raw JSON value of [forceName].
     *
     * Unlike [forceName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("forceName") @ExcludeMissing fun _forceName(): JsonField<String> = forceName

    /**
     * Returns the raw JSON value of [fpa].
     *
     * Unlike [fpa], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fpa") @ExcludeMissing fun _fpa(): JsonField<String> = fpa

    /**
     * Returns the raw JSON value of [functRole].
     *
     * Unlike [functRole], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("functRole") @ExcludeMissing fun _functRole(): JsonField<String> = functRole

    /**
     * Returns the raw JSON value of [geoidalMslSep].
     *
     * Unlike [geoidalMslSep], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoidalMslSep")
    @ExcludeMissing
    fun _geoidalMslSep(): JsonField<Double> = geoidalMslSep

    /**
     * Returns the raw JSON value of [idContact].
     *
     * Unlike [idContact], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idContact") @ExcludeMissing fun _idContact(): JsonField<String> = idContact

    /**
     * Returns the raw JSON value of [ident].
     *
     * Unlike [ident], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ident") @ExcludeMissing fun _ident(): JsonField<String> = ident

    /**
     * Returns the raw JSON value of [idLocation].
     *
     * Unlike [idLocation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idLocation") @ExcludeMissing fun _idLocation(): JsonField<String> = idLocation

    /**
     * Returns the raw JSON value of [idOperatingUnit].
     *
     * Unlike [idOperatingUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOperatingUnit")
    @ExcludeMissing
    fun _idOperatingUnit(): JsonField<String> = idOperatingUnit

    /**
     * Returns the raw JSON value of [idOrganization].
     *
     * Unlike [idOrganization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOrganization")
    @ExcludeMissing
    fun _idOrganization(): JsonField<String> = idOrganization

    /**
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<LocationFull> = location

    /**
     * Returns the raw JSON value of [locName].
     *
     * Unlike [locName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locName") @ExcludeMissing fun _locName(): JsonField<String> = locName

    /**
     * Returns the raw JSON value of [locReason].
     *
     * Unlike [locReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locReason") @ExcludeMissing fun _locReason(): JsonField<String> = locReason

    /**
     * Returns the raw JSON value of [lon].
     *
     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

    /**
     * Returns the raw JSON value of [masterUnit].
     *
     * Unlike [masterUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("masterUnit") @ExcludeMissing fun _masterUnit(): JsonField<Boolean> = masterUnit

    /**
     * Returns the raw JSON value of [milGrid].
     *
     * Unlike [milGrid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("milGrid") @ExcludeMissing fun _milGrid(): JsonField<String> = milGrid

    /**
     * Returns the raw JSON value of [milGridSys].
     *
     * Unlike [milGridSys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("milGridSys") @ExcludeMissing fun _milGridSys(): JsonField<String> = milGridSys

    /**
     * Returns the raw JSON value of [msnPrimary].
     *
     * Unlike [msnPrimary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msnPrimary") @ExcludeMissing fun _msnPrimary(): JsonField<String> = msnPrimary

    /**
     * Returns the raw JSON value of [msnPrimarySpecialty].
     *
     * Unlike [msnPrimarySpecialty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("msnPrimarySpecialty")
    @ExcludeMissing
    fun _msnPrimarySpecialty(): JsonField<String> = msnPrimarySpecialty

    /**
     * Returns the raw JSON value of [operatingUnitRemarks].
     *
     * Unlike [operatingUnitRemarks], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("operatingUnitRemarks")
    @ExcludeMissing
    fun _operatingUnitRemarks(): JsonField<List<OperatingUnitRemarkFull>> = operatingUnitRemarks

    /**
     * Returns the raw JSON value of [operStatus].
     *
     * Unlike [operStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operStatus") @ExcludeMissing fun _operStatus(): JsonField<String> = operStatus

    /**
     * Returns the raw JSON value of [organization].
     *
     * Unlike [organization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization")
    @ExcludeMissing
    fun _organization(): JsonField<OrganizationFull> = organization

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<String> = origin

    /**
     * Returns the raw JSON value of [polSubdiv].
     *
     * Unlike [polSubdiv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polSubdiv") @ExcludeMissing fun _polSubdiv(): JsonField<String> = polSubdiv

    /**
     * Returns the raw JSON value of [recStatus].
     *
     * Unlike [recStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recStatus") @ExcludeMissing fun _recStatus(): JsonField<String> = recStatus

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
    @JsonProperty("resProd") @ExcludeMissing fun _resProd(): JsonField<String> = resProd

    /**
     * Returns the raw JSON value of [reviewDate].
     *
     * Unlike [reviewDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reviewDate") @ExcludeMissing fun _reviewDate(): JsonField<LocalDate> = reviewDate

    /**
     * Returns the raw JSON value of [stylizedUnit].
     *
     * Unlike [stylizedUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stylizedUnit")
    @ExcludeMissing
    fun _stylizedUnit(): JsonField<Boolean> = stylizedUnit

    /**
     * Returns the raw JSON value of [symCode].
     *
     * Unlike [symCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symCode") @ExcludeMissing fun _symCode(): JsonField<String> = symCode

    /**
     * Returns the raw JSON value of [unitIdentifier].
     *
     * Unlike [unitIdentifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unitIdentifier")
    @ExcludeMissing
    fun _unitIdentifier(): JsonField<String> = unitIdentifier

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
     * Returns the raw JSON value of [utm].
     *
     * Unlike [utm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("utm") @ExcludeMissing fun _utm(): JsonField<String> = utm

    /**
     * Returns the raw JSON value of [wac].
     *
     * Unlike [wac], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wac") @ExcludeMissing fun _wac(): JsonField<String> = wac

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
         * Returns a mutable builder for constructing an instance of [OperatingunitFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OperatingunitFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var name: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var airDefArea: JsonField<String> = JsonMissing.of()
        private var allegiance: JsonField<String> = JsonMissing.of()
        private var altAllegiance: JsonField<String> = JsonMissing.of()
        private var altCountryCode: JsonField<String> = JsonMissing.of()
        private var altOperatingUnitId: JsonField<String> = JsonMissing.of()
        private var classRating: JsonField<String> = JsonMissing.of()
        private var condition: JsonField<String> = JsonMissing.of()
        private var conditionAvail: JsonField<String> = JsonMissing.of()
        private var coord: JsonField<String> = JsonMissing.of()
        private var coordDatum: JsonField<String> = JsonMissing.of()
        private var coordDerivAcc: JsonField<Double> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var deployStatus: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var divCat: JsonField<String> = JsonMissing.of()
        private var echelon: JsonField<String> = JsonMissing.of()
        private var echelonTier: JsonField<String> = JsonMissing.of()
        private var elevMsl: JsonField<Double> = JsonMissing.of()
        private var elevMslConfLvl: JsonField<Int> = JsonMissing.of()
        private var elevMslDerivAcc: JsonField<Double> = JsonMissing.of()
        private var eval: JsonField<Int> = JsonMissing.of()
        private var flagFlown: JsonField<String> = JsonMissing.of()
        private var fleetId: JsonField<String> = JsonMissing.of()
        private var force: JsonField<String> = JsonMissing.of()
        private var forceName: JsonField<String> = JsonMissing.of()
        private var fpa: JsonField<String> = JsonMissing.of()
        private var functRole: JsonField<String> = JsonMissing.of()
        private var geoidalMslSep: JsonField<Double> = JsonMissing.of()
        private var idContact: JsonField<String> = JsonMissing.of()
        private var ident: JsonField<String> = JsonMissing.of()
        private var idLocation: JsonField<String> = JsonMissing.of()
        private var idOperatingUnit: JsonField<String> = JsonMissing.of()
        private var idOrganization: JsonField<String> = JsonMissing.of()
        private var lat: JsonField<Double> = JsonMissing.of()
        private var location: JsonField<LocationFull> = JsonMissing.of()
        private var locName: JsonField<String> = JsonMissing.of()
        private var locReason: JsonField<String> = JsonMissing.of()
        private var lon: JsonField<Double> = JsonMissing.of()
        private var masterUnit: JsonField<Boolean> = JsonMissing.of()
        private var milGrid: JsonField<String> = JsonMissing.of()
        private var milGridSys: JsonField<String> = JsonMissing.of()
        private var msnPrimary: JsonField<String> = JsonMissing.of()
        private var msnPrimarySpecialty: JsonField<String> = JsonMissing.of()
        private var operatingUnitRemarks: JsonField<MutableList<OperatingUnitRemarkFull>>? = null
        private var operStatus: JsonField<String> = JsonMissing.of()
        private var organization: JsonField<OrganizationFull> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var polSubdiv: JsonField<String> = JsonMissing.of()
        private var recStatus: JsonField<String> = JsonMissing.of()
        private var referenceDoc: JsonField<String> = JsonMissing.of()
        private var resProd: JsonField<String> = JsonMissing.of()
        private var reviewDate: JsonField<LocalDate> = JsonMissing.of()
        private var stylizedUnit: JsonField<Boolean> = JsonMissing.of()
        private var symCode: JsonField<String> = JsonMissing.of()
        private var unitIdentifier: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var utm: JsonField<String> = JsonMissing.of()
        private var wac: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(operatingunitFull: OperatingunitFull) = apply {
            classificationMarking = operatingunitFull.classificationMarking
            dataMode = operatingunitFull.dataMode
            name = operatingunitFull.name
            source = operatingunitFull.source
            airDefArea = operatingunitFull.airDefArea
            allegiance = operatingunitFull.allegiance
            altAllegiance = operatingunitFull.altAllegiance
            altCountryCode = operatingunitFull.altCountryCode
            altOperatingUnitId = operatingunitFull.altOperatingUnitId
            classRating = operatingunitFull.classRating
            condition = operatingunitFull.condition
            conditionAvail = operatingunitFull.conditionAvail
            coord = operatingunitFull.coord
            coordDatum = operatingunitFull.coordDatum
            coordDerivAcc = operatingunitFull.coordDerivAcc
            countryCode = operatingunitFull.countryCode
            createdAt = operatingunitFull.createdAt
            createdBy = operatingunitFull.createdBy
            deployStatus = operatingunitFull.deployStatus
            description = operatingunitFull.description
            divCat = operatingunitFull.divCat
            echelon = operatingunitFull.echelon
            echelonTier = operatingunitFull.echelonTier
            elevMsl = operatingunitFull.elevMsl
            elevMslConfLvl = operatingunitFull.elevMslConfLvl
            elevMslDerivAcc = operatingunitFull.elevMslDerivAcc
            eval = operatingunitFull.eval
            flagFlown = operatingunitFull.flagFlown
            fleetId = operatingunitFull.fleetId
            force = operatingunitFull.force
            forceName = operatingunitFull.forceName
            fpa = operatingunitFull.fpa
            functRole = operatingunitFull.functRole
            geoidalMslSep = operatingunitFull.geoidalMslSep
            idContact = operatingunitFull.idContact
            ident = operatingunitFull.ident
            idLocation = operatingunitFull.idLocation
            idOperatingUnit = operatingunitFull.idOperatingUnit
            idOrganization = operatingunitFull.idOrganization
            lat = operatingunitFull.lat
            location = operatingunitFull.location
            locName = operatingunitFull.locName
            locReason = operatingunitFull.locReason
            lon = operatingunitFull.lon
            masterUnit = operatingunitFull.masterUnit
            milGrid = operatingunitFull.milGrid
            milGridSys = operatingunitFull.milGridSys
            msnPrimary = operatingunitFull.msnPrimary
            msnPrimarySpecialty = operatingunitFull.msnPrimarySpecialty
            operatingUnitRemarks = operatingunitFull.operatingUnitRemarks.map { it.toMutableList() }
            operStatus = operatingunitFull.operStatus
            organization = operatingunitFull.organization
            origin = operatingunitFull.origin
            polSubdiv = operatingunitFull.polSubdiv
            recStatus = operatingunitFull.recStatus
            referenceDoc = operatingunitFull.referenceDoc
            resProd = operatingunitFull.resProd
            reviewDate = operatingunitFull.reviewDate
            stylizedUnit = operatingunitFull.stylizedUnit
            symCode = operatingunitFull.symCode
            unitIdentifier = operatingunitFull.unitIdentifier
            updatedAt = operatingunitFull.updatedAt
            updatedBy = operatingunitFull.updatedBy
            utm = operatingunitFull.utm
            wac = operatingunitFull.wac
            additionalProperties = operatingunitFull.additionalProperties.toMutableMap()
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

        /** Name of the operating unit. */
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
         * Air Defense District (ADD) or Air Defense Area (ADA) in which the geographic coordinates
         * reside.
         */
        fun airDefArea(airDefArea: String) = airDefArea(JsonField.of(airDefArea))

        /**
         * Sets [Builder.airDefArea] to an arbitrary JSON value.
         *
         * You should usually call [Builder.airDefArea] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun airDefArea(airDefArea: JsonField<String>) = apply { this.airDefArea = airDefArea }

        /**
         * The DoD Standard country code designator for the country or political entity to which the
         * operating unit owes its allegiance. This field will be set to "OTHR" if the source value
         * does not match a UDL country code value (ISO-3166-ALPHA-2).
         */
        fun allegiance(allegiance: String) = allegiance(JsonField.of(allegiance))

        /**
         * Sets [Builder.allegiance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allegiance] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun allegiance(allegiance: JsonField<String>) = apply { this.allegiance = allegiance }

        /**
         * Specifies an alternate allegiance code if the data provider code is not part of an
         * official Country Code standard such as ISO-3166 or FIPS. This field will be set to the
         * value provided by the source and should be used for all Queries specifying allegiance.
         */
        fun altAllegiance(altAllegiance: String) = altAllegiance(JsonField.of(altAllegiance))

        /**
         * Sets [Builder.altAllegiance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altAllegiance] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun altAllegiance(altAllegiance: JsonField<String>) = apply {
            this.altAllegiance = altAllegiance
        }

        /**
         * Specifies an alternate country code if the data provider code is not part of an official
         * Country Code standard such as ISO-3166 or FIPS. This field will be set to the value
         * provided by the source and should be used for all Queries specifying a Country Code.
         */
        fun altCountryCode(altCountryCode: String) = altCountryCode(JsonField.of(altCountryCode))

        /**
         * Sets [Builder.altCountryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altCountryCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun altCountryCode(altCountryCode: JsonField<String>) = apply {
            this.altCountryCode = altCountryCode
        }

        /** Unique identifier of the operating unit record from the originating system. */
        fun altOperatingUnitId(altOperatingUnitId: String) =
            altOperatingUnitId(JsonField.of(altOperatingUnitId))

        /**
         * Sets [Builder.altOperatingUnitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altOperatingUnitId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun altOperatingUnitId(altOperatingUnitId: JsonField<String>) = apply {
            this.altOperatingUnitId = altOperatingUnitId
        }

        /**
         * Indicates the importance of the operating unit to the OES or MIR system. This data
         * element is restricted to update by DIA (DB-4). Valid values are: 0 - Does not meet
         * criteria above 1 - Primary importance to system 2 - Secondary importance to system 3 -
         * Tertiary importance to system O - Other. Explain in Remarks.
         */
        fun classRating(classRating: String) = classRating(JsonField.of(classRating))

        /**
         * Sets [Builder.classRating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classRating] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun classRating(classRating: JsonField<String>) = apply { this.classRating = classRating }

        /**
         * The physical manner of being or state of existence of the operating unit. A physical
         * condition that must be considered in the determining of a course of action. The specific
         * usage and enumerations contained in this field may be found in the documentation provided
         * in the referenceDoc field. If referenceDoc not provided, users may consult the data
         * provider.
         */
        fun condition(condition: String) = condition(JsonField.of(condition))

        /**
         * Sets [Builder.condition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.condition] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun condition(condition: JsonField<String>) = apply { this.condition = condition }

        /**
         * Availability of the operating unit relative to its condition. Indicates the reason the
         * operating unit is not fully operational. The specific usage and enumerations contained in
         * this field may be found in the documentation provided in the referenceDoc field. If
         * referenceDoc not provided, users may consult the data provider.
         */
        fun conditionAvail(conditionAvail: String) = conditionAvail(JsonField.of(conditionAvail))

        /**
         * Sets [Builder.conditionAvail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditionAvail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conditionAvail(conditionAvail: JsonField<String>) = apply {
            this.conditionAvail = conditionAvail
        }

        /**
         * Indicates any of the magnitudes that serve to define the position of a point by reference
         * to a fixed figure, system of lines, etc.
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
         * Pos. 1-21. Unknown Latitude and Unknown Longitude [000000000U000000000U]
         */
        fun coord(coord: String) = coord(JsonField.of(coord))

        /**
         * Sets [Builder.coord] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coord] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun coord(coord: JsonField<String>) = apply { this.coord = coord }

        /**
         * A mathematical model of the earth used to calculate coordinates on a map. US Forces use
         * the World Geodetic System 1984 (WGS 84), but also use maps by allied countries with local
         * datums. The datum must be specified to ensure accuracy of coordinates. The specific usage
         * and enumerations contained in this field may be found in the documentation provided in
         * the referenceDoc field. If referenceDoc not provided, users may consult the data
         * provider.
         */
        fun coordDatum(coordDatum: String) = coordDatum(JsonField.of(coordDatum))

        /**
         * Sets [Builder.coordDatum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coordDatum] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun coordDatum(coordDatum: JsonField<String>) = apply { this.coordDatum = coordDatum }

        /**
         * Indicates the plus or minus error assessed against the method used to derive the
         * coordinate.
         */
        fun coordDerivAcc(coordDerivAcc: Double) = coordDerivAcc(JsonField.of(coordDerivAcc))

        /**
         * Sets [Builder.coordDerivAcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coordDerivAcc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun coordDerivAcc(coordDerivAcc: JsonField<Double>) = apply {
            this.coordDerivAcc = coordDerivAcc
        }

        /**
         * The DoD Standard country code designator for the country or political entity to which the
         * operating unit geographic coordinates reside . This field will be set to "OTHR" if the
         * source value does not match a UDL country code value (ISO-3166-ALPHA-2).
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
         * A code describing the amount of operating unit participation in a deployment. The
         * specific usage and enumerations contained in this field may be found in the documentation
         * provided in the referenceDoc field. If referenceDoc not provided, users may consult the
         * data provider.
         */
        fun deployStatus(deployStatus: String) = deployStatus(JsonField.of(deployStatus))

        /**
         * Sets [Builder.deployStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deployStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deployStatus(deployStatus: JsonField<String>) = apply {
            this.deployStatus = deployStatus
        }

        /** Description of the operating unit. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Combat status of a divisional or equivalent operating unit. Currently, this data element
         * applies only to operating units of the Former Soviet Union. The specific usage and
         * enumerations contained in this field may be found in the documentation provided in the
         * referenceDoc field. If referenceDoc not provided, users may consult the data provider.
         */
        fun divCat(divCat: String) = divCat(JsonField.of(divCat))

        /**
         * Sets [Builder.divCat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.divCat] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun divCat(divCat: JsonField<String>) = apply { this.divCat = divCat }

        /**
         * Organizational level of the operating unit. The specific usage and enumerations contained
         * in this field may be found in the documentation provided in the referenceDoc field. If
         * referenceDoc not provided, users may consult the data provider.
         */
        fun echelon(echelon: String) = echelon(JsonField.of(echelon))

        /**
         * Sets [Builder.echelon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.echelon] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun echelon(echelon: JsonField<String>) = apply { this.echelon = echelon }

        /**
         * Indicates the major group or level to which an echelon belongs. The specific usage and
         * enumerations contained in this field may be found in the documentation provided in the
         * referenceDoc field. If referenceDoc not provided, users may consult the data provider.
         */
        fun echelonTier(echelonTier: String) = echelonTier(JsonField.of(echelonTier))

        /**
         * Sets [Builder.echelonTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.echelonTier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun echelonTier(echelonTier: JsonField<String>) = apply { this.echelonTier = echelonTier }

        /**
         * Ground elevation of the geographic coordinates referenced to (above or below) Mean Sea
         * Level (MSL) vertical datum.
         */
        fun elevMsl(elevMsl: Double) = elevMsl(JsonField.of(elevMsl))

        /**
         * Sets [Builder.elevMsl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevMsl] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun elevMsl(elevMsl: JsonField<Double>) = apply { this.elevMsl = elevMsl }

        /**
         * Indicates the confidence level expressed as a percent that a specific geometric spatial
         * element, ELEVATION_MSL linear accuracy, has been vertically positioned to within a
         * specified vertical accuracy.
         */
        fun elevMslConfLvl(elevMslConfLvl: Int) = elevMslConfLvl(JsonField.of(elevMslConfLvl))

        /**
         * Sets [Builder.elevMslConfLvl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevMslConfLvl] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun elevMslConfLvl(elevMslConfLvl: JsonField<Int>) = apply {
            this.elevMslConfLvl = elevMslConfLvl
        }

        /**
         * Indicates the plus or minus error assessed against the method used to derive the
         * elevation.
         */
        fun elevMslDerivAcc(elevMslDerivAcc: Double) =
            elevMslDerivAcc(JsonField.of(elevMslDerivAcc))

        /**
         * Sets [Builder.elevMslDerivAcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevMslDerivAcc] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elevMslDerivAcc(elevMslDerivAcc: JsonField<Double>) = apply {
            this.elevMslDerivAcc = elevMslDerivAcc
        }

        /**
         * The Intelligence Confidence Level or the Reliability/degree of confidence that the
         * analyst has assigned to the data within this record. The numerical range is from 1 to 9
         * with 1 representing the highest confidence level.
         */
        fun eval(eval: Int) = eval(JsonField.of(eval))

        /**
         * Sets [Builder.eval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eval] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eval(eval: JsonField<Int>) = apply { this.eval = eval }

        /** The country code of the observed flag flown. */
        fun flagFlown(flagFlown: String) = flagFlown(JsonField.of(flagFlown))

        /**
         * Sets [Builder.flagFlown] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flagFlown] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun flagFlown(flagFlown: JsonField<String>) = apply { this.flagFlown = flagFlown }

        /**
         * Naval fleet to which an operating unit is assigned. The specific usage and enumerations
         * contained in this field may be found in the documentation provided in the referenceDoc
         * field. If referenceDoc not provided, users may consult the data provider.
         */
        fun fleetId(fleetId: String) = fleetId(JsonField.of(fleetId))

        /**
         * Sets [Builder.fleetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fleetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fleetId(fleetId: JsonField<String>) = apply { this.fleetId = fleetId }

        /**
         * An aggregation of military units within a single service (i.e., ARMY, AIR FORCE, etc.)
         * which operates under a single authority to accomplish a common mission. The specific
         * usage and enumerations contained in this field may be found in the documentation provided
         * in the referenceDoc field. If referenceDoc not provided, users may consult the data
         * provider.
         */
        fun force(force: String) = force(JsonField.of(force))

        /**
         * Sets [Builder.force] to an arbitrary JSON value.
         *
         * You should usually call [Builder.force] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun force(force: JsonField<String>) = apply { this.force = force }

        /**
         * The specific name for a given force. For example, Force = ADF (Air Defense Force) and
         * Force Name = Army Air Defense Force.
         */
        fun forceName(forceName: String) = forceName(JsonField.of(forceName))

        /**
         * Sets [Builder.forceName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forceName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun forceName(forceName: JsonField<String>) = apply { this.forceName = forceName }

        /**
         * Functional Production Area (FPA) under the Shared Production Program (SPP). Producers are
         * defined per country per FPA. The specific usage and enumerations contained in this field
         * may be found in the documentation provided in the referenceDoc field. If referenceDoc not
         * provided, users may consult the data provider.
         */
        fun fpa(fpa: String) = fpa(JsonField.of(fpa))

        /**
         * Sets [Builder.fpa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fpa] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fpa(fpa: JsonField<String>) = apply { this.fpa = fpa }

        /**
         * Principal combat-related role that an operating unit is organized, structured and
         * equipped to perform. Or, the specialized military or paramilitary branch in which an
         * individual serves, their specialization. The specific usage and enumerations contained in
         * this field may be found in the documentation provided in the referenceDoc field. If
         * referenceDoc not provided, users may consult the data provider.
         */
        fun functRole(functRole: String) = functRole(JsonField.of(functRole))

        /**
         * Sets [Builder.functRole] to an arbitrary JSON value.
         *
         * You should usually call [Builder.functRole] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun functRole(functRole: JsonField<String>) = apply { this.functRole = functRole }

        /** The distance between Mean Sea Level and a referenced ellipsoid. */
        fun geoidalMslSep(geoidalMslSep: Double) = geoidalMslSep(JsonField.of(geoidalMslSep))

        /**
         * Sets [Builder.geoidalMslSep] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoidalMslSep] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun geoidalMslSep(geoidalMslSep: JsonField<Double>) = apply {
            this.geoidalMslSep = geoidalMslSep
        }

        /** Unique identifier of the contact for this operating unit. */
        fun idContact(idContact: String) = idContact(JsonField.of(idContact))

        /**
         * Sets [Builder.idContact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idContact] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idContact(idContact: JsonField<String>) = apply { this.idContact = idContact }

        /**
         * Estimated identity of the Site (ASSUMED FRIEND, FRIEND, HOSTILE, FAKER, JOKER, NEUTRAL,
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
         * FAKER: Friendly track, object, or entity acting as an exercise hostile.
         *
         * JOKER: Friendly track, object, or entity acting as an exercise suspect.
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
        fun ident(ident: String) = ident(JsonField.of(ident))

        /**
         * Sets [Builder.ident] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ident] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ident(ident: JsonField<String>) = apply { this.ident = ident }

        /** Unique identifier of the location record for this operating unit. */
        fun idLocation(idLocation: String) = idLocation(JsonField.of(idLocation))

        /**
         * Sets [Builder.idLocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idLocation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idLocation(idLocation: JsonField<String>) = apply { this.idLocation = idLocation }

        /** Unique identifier of the record, auto-generated by the system. */
        fun idOperatingUnit(idOperatingUnit: String) =
            idOperatingUnit(JsonField.of(idOperatingUnit))

        /**
         * Sets [Builder.idOperatingUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOperatingUnit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idOperatingUnit(idOperatingUnit: JsonField<String>) = apply {
            this.idOperatingUnit = idOperatingUnit
        }

        /** Unique identifier of the organization record for this operating unit. */
        fun idOrganization(idOrganization: String) = idOrganization(JsonField.of(idOrganization))

        /**
         * Sets [Builder.idOrganization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOrganization] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idOrganization(idOrganization: JsonField<String>) = apply {
            this.idOrganization = idOrganization
        }

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
         * Model representation of a location, which is a specific fixed point on the earth and is
         * used to denote the locations of fixed sensors, operating units, etc.
         */
        fun location(location: LocationFull) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [LocationFull] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun location(location: JsonField<LocationFull>) = apply { this.location = location }

        /** Location name for the coordinates. */
        fun locName(locName: String) = locName(JsonField.of(locName))

        /**
         * Sets [Builder.locName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locName(locName: JsonField<String>) = apply { this.locName = locName }

        /**
         * Indicates the reason that the operating unit is at that location. The specific usage and
         * enumerations contained in this field may be found in the documentation provided in the
         * referenceDoc field. If referenceDoc not provided, users may consult the data provider.
         */
        fun locReason(locReason: String) = locReason(JsonField.of(locReason))

        /**
         * Sets [Builder.locReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun locReason(locReason: JsonField<String>) = apply { this.locReason = locReason }

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
         * This field contains a value indicating whether the record is a master unit record (True)
         * or a detail record (False). Master records contain basic information that does not change
         * over time for each unit that has been selected to be projected.
         */
        fun masterUnit(masterUnit: Boolean) = masterUnit(JsonField.of(masterUnit))

        /**
         * Sets [Builder.masterUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.masterUnit] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun masterUnit(masterUnit: JsonField<Boolean>) = apply { this.masterUnit = masterUnit }

        /**
         * The Military Grid Reference System is the geocoordinate standard used by NATO militaries
         * for locating points on Earth. The MGRS is derived from the Universal Transverse Mercator
         * (UTM) grid system and the Universal Polar Stereographic (UPS) grid system, but uses a
         * different labeling convention. The MGRS is used as geocode for the entire Earth. Example
         * of an milgrid coordinate, or grid reference, would be 4QFJ12345678, which consists of
         * three parts: 4Q (grid zone designator, GZD) FJ (the 100,000-meter square identifier)
         * 12345678 (numerical location; easting is 1234 and northing is 5678, in this case
         * specifying a location with 10 m resolution).
         */
        fun milGrid(milGrid: String) = milGrid(JsonField.of(milGrid))

        /**
         * Sets [Builder.milGrid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.milGrid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun milGrid(milGrid: JsonField<String>) = apply { this.milGrid = milGrid }

        /**
         * Indicates the grid system used in the development of the milGrid coordinates. Values are:
         *
         * UPS - Universal Polar System
         *
         * UTM - Universal Transverse Mercator
         */
        fun milGridSys(milGridSys: String) = milGridSys(JsonField.of(milGridSys))

        /**
         * Sets [Builder.milGridSys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.milGridSys] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun milGridSys(milGridSys: JsonField<String>) = apply { this.milGridSys = milGridSys }

        /**
         * Indicates the principal type of mission that an operating unit is organized and equipped
         * to perform. The specific usage and enumerations contained in this field may be found in
         * the documentation provided in the referenceDoc field. If referenceDoc not provided, users
         * may consult the data provider.
         */
        fun msnPrimary(msnPrimary: String) = msnPrimary(JsonField.of(msnPrimary))

        /**
         * Sets [Builder.msnPrimary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msnPrimary] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun msnPrimary(msnPrimary: JsonField<String>) = apply { this.msnPrimary = msnPrimary }

        /**
         * Indicates the principal specialty type of mission that an operating unit is organized and
         * equipped to perform. The specific usage and enumerations contained in this field may be
         * found in the documentation provided in the referenceDoc field. If referenceDoc not
         * provided, users may consult the data provider.
         */
        fun msnPrimarySpecialty(msnPrimarySpecialty: String) =
            msnPrimarySpecialty(JsonField.of(msnPrimarySpecialty))

        /**
         * Sets [Builder.msnPrimarySpecialty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msnPrimarySpecialty] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun msnPrimarySpecialty(msnPrimarySpecialty: JsonField<String>) = apply {
            this.msnPrimarySpecialty = msnPrimarySpecialty
        }

        /**
         * Remarks contain amplifying information for a specific service. The information may
         * contain context and interpretations for consumer use.
         */
        fun operatingUnitRemarks(operatingUnitRemarks: List<OperatingUnitRemarkFull>) =
            operatingUnitRemarks(JsonField.of(operatingUnitRemarks))

        /**
         * Sets [Builder.operatingUnitRemarks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatingUnitRemarks] with a well-typed
         * `List<OperatingUnitRemarkFull>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun operatingUnitRemarks(operatingUnitRemarks: JsonField<List<OperatingUnitRemarkFull>>) =
            apply {
                this.operatingUnitRemarks = operatingUnitRemarks.map { it.toMutableList() }
            }

        /**
         * Adds a single [OperatingUnitRemarkFull] to [operatingUnitRemarks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOperatingUnitRemark(operatingUnitRemark: OperatingUnitRemarkFull) = apply {
            operatingUnitRemarks =
                (operatingUnitRemarks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("operatingUnitRemarks", it).add(operatingUnitRemark)
                }
        }

        /**
         * The Degree to which an operating unit is ready to perform the overall operational
         * mission(s) for which it was organized and equipped. The specific usage and enumerations
         * contained in this field may be found in the documentation provided in the referenceDoc
         * field. If referenceDoc not provided, users may consult the data provider.
         */
        fun operStatus(operStatus: String) = operStatus(JsonField.of(operStatus))

        /**
         * Sets [Builder.operStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operStatus(operStatus: JsonField<String>) = apply { this.operStatus = operStatus }

        /**
         * An organization such as a corporation, manufacturer, consortium, government, etc. An
         * organization may have parent and child organizations as well as link to a former
         * organization if this org previously existed as another organization.
         */
        fun organization(organization: OrganizationFull) = organization(JsonField.of(organization))

        /**
         * Sets [Builder.organization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organization] with a well-typed [OrganizationFull] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organization(organization: JsonField<OrganizationFull>) = apply {
            this.organization = organization
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
         * Political subdivision in which the geographic coordinates reside. The specific usage and
         * enumerations contained in this field may be found in the documentation provided in the
         * referenceDoc field. If referenceDoc not provided, users may consult the data provider.
         */
        fun polSubdiv(polSubdiv: String) = polSubdiv(JsonField.of(polSubdiv))

        /**
         * Sets [Builder.polSubdiv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polSubdiv] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun polSubdiv(polSubdiv: JsonField<String>) = apply { this.polSubdiv = polSubdiv }

        /**
         * Validity and currency of the data in the record to be used in conjunction with the other
         * elements in the record as defined by SOPs. Values are: A - Active I - Inactive K -
         * Acknowledged L - Local Q - A nominated (NOM) or Data Change Request (DCR) record R -
         * Production reduced by CMD decision W - Working Record.
         */
        fun recStatus(recStatus: String) = recStatus(JsonField.of(recStatus))

        /**
         * Sets [Builder.recStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recStatus(recStatus: JsonField<String>) = apply { this.recStatus = recStatus }

        /**
         * The reference documentiation that specifies the usage and enumerations contained in this
         * record. If referenceDoc not provided, users may consult the data provider.
         */
        fun referenceDoc(referenceDoc: String) = referenceDoc(JsonField.of(referenceDoc))

        /**
         * Sets [Builder.referenceDoc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceDoc] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referenceDoc(referenceDoc: JsonField<String>) = apply {
            this.referenceDoc = referenceDoc
        }

        /**
         * Responsible Producer - Organization that is responsible for the maintenance of the
         * record.
         */
        fun resProd(resProd: String) = resProd(JsonField.of(resProd))

        /**
         * Sets [Builder.resProd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resProd] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun resProd(resProd: JsonField<String>) = apply { this.resProd = resProd }

        /**
         * Date on which the data in the record was last reviewed by the responsible analyst for
         * accuracy and currency. This date cannot be greater than the current date.
         */
        fun reviewDate(reviewDate: LocalDate) = reviewDate(JsonField.of(reviewDate))

        /**
         * Sets [Builder.reviewDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reviewDate(reviewDate: JsonField<LocalDate>) = apply { this.reviewDate = reviewDate }

        /**
         * This field contains a value indicating whether the record is a stylized operating unit
         * record (True) or a regular operating unit record (False). A stylized operating unit is a
         * type of operating unit with one set of equipment that can be assigned to one or more
         * superiors. A stylized operating unit is generally useful for lower echelon operating
         * units where the number of operating units and types of equipment are equal for multiple
         * organizations. In lieu of creating unique operating unit records for each operating unit,
         * a template is created for the operating unit and its equipment. This template enables the
         * user to assign the operating unit to multiple organizations.
         */
        fun stylizedUnit(stylizedUnit: Boolean) = stylizedUnit(JsonField.of(stylizedUnit))

        /**
         * Sets [Builder.stylizedUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stylizedUnit] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stylizedUnit(stylizedUnit: JsonField<Boolean>) = apply {
            this.stylizedUnit = stylizedUnit
        }

        /**
         * A standard scheme for symbol coding enabling the transfer, display and use of symbols and
         * graphics among information systems, as per MIL-STD 2525B, and supported by the element
         * AFFILIATION.
         */
        fun symCode(symCode: String) = symCode(JsonField.of(symCode))

        /**
         * Sets [Builder.symCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symCode(symCode: JsonField<String>) = apply { this.symCode = symCode }

        /**
         * An optional identifier for this operating unit that may be composed from items such as
         * the originating organization, allegiance, one-up number, etc.
         */
        fun unitIdentifier(unitIdentifier: String) = unitIdentifier(JsonField.of(unitIdentifier))

        /**
         * Sets [Builder.unitIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitIdentifier] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unitIdentifier(unitIdentifier: JsonField<String>) = apply {
            this.unitIdentifier = unitIdentifier
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

        /**
         * Universal Transverse Mercator (UTM) grid coordinates. Pos. 1-2, UTM Zone Column
         * [01-60 Pos. 3, UTM Zone Row [C-HJ-NP-X] Pos. 4, UTM False Easting [0-9] Pos. 5-9, UTM
         * Meter Easting [0-9][0-9][0-9][0-9][0-9] Pos. 10-11, UTM False Northing [0-9][0-9] Pos.
         * 12-16, UTM Meter Northing [0-9][0-9][0-9][0-9][0-9].
         */
        fun utm(utm: String) = utm(JsonField.of(utm))

        /**
         * Sets [Builder.utm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.utm] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun utm(utm: JsonField<String>) = apply { this.utm = utm }

        /**
         * World Aeronautical Chart identifier for the area in which a designated operating unit is
         * located.
         */
        fun wac(wac: String) = wac(JsonField.of(wac))

        /**
         * Sets [Builder.wac] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wac] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun wac(wac: JsonField<String>) = apply { this.wac = wac }

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
         * Returns an immutable instance of [OperatingunitFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OperatingunitFull =
            OperatingunitFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("name", name),
                checkRequired("source", source),
                airDefArea,
                allegiance,
                altAllegiance,
                altCountryCode,
                altOperatingUnitId,
                classRating,
                condition,
                conditionAvail,
                coord,
                coordDatum,
                coordDerivAcc,
                countryCode,
                createdAt,
                createdBy,
                deployStatus,
                description,
                divCat,
                echelon,
                echelonTier,
                elevMsl,
                elevMslConfLvl,
                elevMslDerivAcc,
                eval,
                flagFlown,
                fleetId,
                force,
                forceName,
                fpa,
                functRole,
                geoidalMslSep,
                idContact,
                ident,
                idLocation,
                idOperatingUnit,
                idOrganization,
                lat,
                location,
                locName,
                locReason,
                lon,
                masterUnit,
                milGrid,
                milGridSys,
                msnPrimary,
                msnPrimarySpecialty,
                (operatingUnitRemarks ?: JsonMissing.of()).map { it.toImmutable() },
                operStatus,
                organization,
                origin,
                polSubdiv,
                recStatus,
                referenceDoc,
                resProd,
                reviewDate,
                stylizedUnit,
                symCode,
                unitIdentifier,
                updatedAt,
                updatedBy,
                utm,
                wac,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OperatingunitFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        name()
        source()
        airDefArea()
        allegiance()
        altAllegiance()
        altCountryCode()
        altOperatingUnitId()
        classRating()
        condition()
        conditionAvail()
        coord()
        coordDatum()
        coordDerivAcc()
        countryCode()
        createdAt()
        createdBy()
        deployStatus()
        description()
        divCat()
        echelon()
        echelonTier()
        elevMsl()
        elevMslConfLvl()
        elevMslDerivAcc()
        eval()
        flagFlown()
        fleetId()
        force()
        forceName()
        fpa()
        functRole()
        geoidalMslSep()
        idContact()
        ident()
        idLocation()
        idOperatingUnit()
        idOrganization()
        lat()
        location().ifPresent { it.validate() }
        locName()
        locReason()
        lon()
        masterUnit()
        milGrid()
        milGridSys()
        msnPrimary()
        msnPrimarySpecialty()
        operatingUnitRemarks().ifPresent { it.forEach { it.validate() } }
        operStatus()
        organization().ifPresent { it.validate() }
        origin()
        polSubdiv()
        recStatus()
        referenceDoc()
        resProd()
        reviewDate()
        stylizedUnit()
        symCode()
        unitIdentifier()
        updatedAt()
        updatedBy()
        utm()
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
    internal fun validity(): Int =
        (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (airDefArea.asKnown().isPresent) 1 else 0) +
            (if (allegiance.asKnown().isPresent) 1 else 0) +
            (if (altAllegiance.asKnown().isPresent) 1 else 0) +
            (if (altCountryCode.asKnown().isPresent) 1 else 0) +
            (if (altOperatingUnitId.asKnown().isPresent) 1 else 0) +
            (if (classRating.asKnown().isPresent) 1 else 0) +
            (if (condition.asKnown().isPresent) 1 else 0) +
            (if (conditionAvail.asKnown().isPresent) 1 else 0) +
            (if (coord.asKnown().isPresent) 1 else 0) +
            (if (coordDatum.asKnown().isPresent) 1 else 0) +
            (if (coordDerivAcc.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (deployStatus.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (divCat.asKnown().isPresent) 1 else 0) +
            (if (echelon.asKnown().isPresent) 1 else 0) +
            (if (echelonTier.asKnown().isPresent) 1 else 0) +
            (if (elevMsl.asKnown().isPresent) 1 else 0) +
            (if (elevMslConfLvl.asKnown().isPresent) 1 else 0) +
            (if (elevMslDerivAcc.asKnown().isPresent) 1 else 0) +
            (if (eval.asKnown().isPresent) 1 else 0) +
            (if (flagFlown.asKnown().isPresent) 1 else 0) +
            (if (fleetId.asKnown().isPresent) 1 else 0) +
            (if (force.asKnown().isPresent) 1 else 0) +
            (if (forceName.asKnown().isPresent) 1 else 0) +
            (if (fpa.asKnown().isPresent) 1 else 0) +
            (if (functRole.asKnown().isPresent) 1 else 0) +
            (if (geoidalMslSep.asKnown().isPresent) 1 else 0) +
            (if (idContact.asKnown().isPresent) 1 else 0) +
            (if (ident.asKnown().isPresent) 1 else 0) +
            (if (idLocation.asKnown().isPresent) 1 else 0) +
            (if (idOperatingUnit.asKnown().isPresent) 1 else 0) +
            (if (idOrganization.asKnown().isPresent) 1 else 0) +
            (if (lat.asKnown().isPresent) 1 else 0) +
            (location.asKnown().getOrNull()?.validity() ?: 0) +
            (if (locName.asKnown().isPresent) 1 else 0) +
            (if (locReason.asKnown().isPresent) 1 else 0) +
            (if (lon.asKnown().isPresent) 1 else 0) +
            (if (masterUnit.asKnown().isPresent) 1 else 0) +
            (if (milGrid.asKnown().isPresent) 1 else 0) +
            (if (milGridSys.asKnown().isPresent) 1 else 0) +
            (if (msnPrimary.asKnown().isPresent) 1 else 0) +
            (if (msnPrimarySpecialty.asKnown().isPresent) 1 else 0) +
            (operatingUnitRemarks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (operStatus.asKnown().isPresent) 1 else 0) +
            (organization.asKnown().getOrNull()?.validity() ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (polSubdiv.asKnown().isPresent) 1 else 0) +
            (if (recStatus.asKnown().isPresent) 1 else 0) +
            (if (referenceDoc.asKnown().isPresent) 1 else 0) +
            (if (resProd.asKnown().isPresent) 1 else 0) +
            (if (reviewDate.asKnown().isPresent) 1 else 0) +
            (if (stylizedUnit.asKnown().isPresent) 1 else 0) +
            (if (symCode.asKnown().isPresent) 1 else 0) +
            (if (unitIdentifier.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (utm.asKnown().isPresent) 1 else 0) +
            (if (wac.asKnown().isPresent) 1 else 0)

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

        return other is OperatingunitFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            name == other.name &&
            source == other.source &&
            airDefArea == other.airDefArea &&
            allegiance == other.allegiance &&
            altAllegiance == other.altAllegiance &&
            altCountryCode == other.altCountryCode &&
            altOperatingUnitId == other.altOperatingUnitId &&
            classRating == other.classRating &&
            condition == other.condition &&
            conditionAvail == other.conditionAvail &&
            coord == other.coord &&
            coordDatum == other.coordDatum &&
            coordDerivAcc == other.coordDerivAcc &&
            countryCode == other.countryCode &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            deployStatus == other.deployStatus &&
            description == other.description &&
            divCat == other.divCat &&
            echelon == other.echelon &&
            echelonTier == other.echelonTier &&
            elevMsl == other.elevMsl &&
            elevMslConfLvl == other.elevMslConfLvl &&
            elevMslDerivAcc == other.elevMslDerivAcc &&
            eval == other.eval &&
            flagFlown == other.flagFlown &&
            fleetId == other.fleetId &&
            force == other.force &&
            forceName == other.forceName &&
            fpa == other.fpa &&
            functRole == other.functRole &&
            geoidalMslSep == other.geoidalMslSep &&
            idContact == other.idContact &&
            ident == other.ident &&
            idLocation == other.idLocation &&
            idOperatingUnit == other.idOperatingUnit &&
            idOrganization == other.idOrganization &&
            lat == other.lat &&
            location == other.location &&
            locName == other.locName &&
            locReason == other.locReason &&
            lon == other.lon &&
            masterUnit == other.masterUnit &&
            milGrid == other.milGrid &&
            milGridSys == other.milGridSys &&
            msnPrimary == other.msnPrimary &&
            msnPrimarySpecialty == other.msnPrimarySpecialty &&
            operatingUnitRemarks == other.operatingUnitRemarks &&
            operStatus == other.operStatus &&
            organization == other.organization &&
            origin == other.origin &&
            polSubdiv == other.polSubdiv &&
            recStatus == other.recStatus &&
            referenceDoc == other.referenceDoc &&
            resProd == other.resProd &&
            reviewDate == other.reviewDate &&
            stylizedUnit == other.stylizedUnit &&
            symCode == other.symCode &&
            unitIdentifier == other.unitIdentifier &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            utm == other.utm &&
            wac == other.wac &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            name,
            source,
            airDefArea,
            allegiance,
            altAllegiance,
            altCountryCode,
            altOperatingUnitId,
            classRating,
            condition,
            conditionAvail,
            coord,
            coordDatum,
            coordDerivAcc,
            countryCode,
            createdAt,
            createdBy,
            deployStatus,
            description,
            divCat,
            echelon,
            echelonTier,
            elevMsl,
            elevMslConfLvl,
            elevMslDerivAcc,
            eval,
            flagFlown,
            fleetId,
            force,
            forceName,
            fpa,
            functRole,
            geoidalMslSep,
            idContact,
            ident,
            idLocation,
            idOperatingUnit,
            idOrganization,
            lat,
            location,
            locName,
            locReason,
            lon,
            masterUnit,
            milGrid,
            milGridSys,
            msnPrimary,
            msnPrimarySpecialty,
            operatingUnitRemarks,
            operStatus,
            organization,
            origin,
            polSubdiv,
            recStatus,
            referenceDoc,
            resProd,
            reviewDate,
            stylizedUnit,
            symCode,
            unitIdentifier,
            updatedAt,
            updatedBy,
            utm,
            wac,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OperatingunitFull{classificationMarking=$classificationMarking, dataMode=$dataMode, name=$name, source=$source, airDefArea=$airDefArea, allegiance=$allegiance, altAllegiance=$altAllegiance, altCountryCode=$altCountryCode, altOperatingUnitId=$altOperatingUnitId, classRating=$classRating, condition=$condition, conditionAvail=$conditionAvail, coord=$coord, coordDatum=$coordDatum, coordDerivAcc=$coordDerivAcc, countryCode=$countryCode, createdAt=$createdAt, createdBy=$createdBy, deployStatus=$deployStatus, description=$description, divCat=$divCat, echelon=$echelon, echelonTier=$echelonTier, elevMsl=$elevMsl, elevMslConfLvl=$elevMslConfLvl, elevMslDerivAcc=$elevMslDerivAcc, eval=$eval, flagFlown=$flagFlown, fleetId=$fleetId, force=$force, forceName=$forceName, fpa=$fpa, functRole=$functRole, geoidalMslSep=$geoidalMslSep, idContact=$idContact, ident=$ident, idLocation=$idLocation, idOperatingUnit=$idOperatingUnit, idOrganization=$idOrganization, lat=$lat, location=$location, locName=$locName, locReason=$locReason, lon=$lon, masterUnit=$masterUnit, milGrid=$milGrid, milGridSys=$milGridSys, msnPrimary=$msnPrimary, msnPrimarySpecialty=$msnPrimarySpecialty, operatingUnitRemarks=$operatingUnitRemarks, operStatus=$operStatus, organization=$organization, origin=$origin, polSubdiv=$polSubdiv, recStatus=$recStatus, referenceDoc=$referenceDoc, resProd=$resProd, reviewDate=$reviewDate, stylizedUnit=$stylizedUnit, symCode=$symCode, unitIdentifier=$unitIdentifier, updatedAt=$updatedAt, updatedBy=$updatedBy, utm=$utm, wac=$wac, additionalProperties=$additionalProperties}"
}

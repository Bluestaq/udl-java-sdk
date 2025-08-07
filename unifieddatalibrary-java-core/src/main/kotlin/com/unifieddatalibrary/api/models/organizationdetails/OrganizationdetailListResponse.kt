// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.organizationdetails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Model representation of additional detailed organization data as collected by a particular
 * source.
 */
class OrganizationdetailListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idOrganization: JsonField<String>,
    private val name: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val address1: JsonField<String>,
    private val address2: JsonField<String>,
    private val address3: JsonField<String>,
    private val broker: JsonField<String>,
    private val ceo: JsonField<String>,
    private val cfo: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val cto: JsonField<String>,
    private val description: JsonField<String>,
    private val ebitda: JsonField<Double>,
    private val email: JsonField<String>,
    private val financialNotes: JsonField<String>,
    private val financialYearEndDate: JsonField<OffsetDateTime>,
    private val fleetPlanNotes: JsonField<String>,
    private val formerOrgId: JsonField<String>,
    private val ftes: JsonField<Int>,
    private val geoAdminLevel1: JsonField<String>,
    private val geoAdminLevel2: JsonField<String>,
    private val geoAdminLevel3: JsonField<String>,
    private val massRanking: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val parentOrgId: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val profit: JsonField<Double>,
    private val revenue: JsonField<Double>,
    private val revenueRanking: JsonField<Int>,
    private val riskManager: JsonField<String>,
    private val servicesNotes: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idOrganization")
        @ExcludeMissing
        idOrganization: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address1") @ExcludeMissing address1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address2") @ExcludeMissing address2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address3") @ExcludeMissing address3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("broker") @ExcludeMissing broker: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ceo") @ExcludeMissing ceo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cfo") @ExcludeMissing cfo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cto") @ExcludeMissing cto: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ebitda") @ExcludeMissing ebitda: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("financialNotes")
        @ExcludeMissing
        financialNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("financialYearEndDate")
        @ExcludeMissing
        financialYearEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fleetPlanNotes")
        @ExcludeMissing
        fleetPlanNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("formerOrgId")
        @ExcludeMissing
        formerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ftes") @ExcludeMissing ftes: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("geoAdminLevel1")
        @ExcludeMissing
        geoAdminLevel1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("geoAdminLevel2")
        @ExcludeMissing
        geoAdminLevel2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("geoAdminLevel3")
        @ExcludeMissing
        geoAdminLevel3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("massRanking") @ExcludeMissing massRanking: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parentOrgId")
        @ExcludeMissing
        parentOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postalCode")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("profit") @ExcludeMissing profit: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("revenue") @ExcludeMissing revenue: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("revenueRanking")
        @ExcludeMissing
        revenueRanking: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("riskManager")
        @ExcludeMissing
        riskManager: JsonField<String> = JsonMissing.of(),
        @JsonProperty("servicesNotes")
        @ExcludeMissing
        servicesNotes: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idOrganization,
        name,
        source,
        id,
        address1,
        address2,
        address3,
        broker,
        ceo,
        cfo,
        createdAt,
        createdBy,
        cto,
        description,
        ebitda,
        email,
        financialNotes,
        financialYearEndDate,
        fleetPlanNotes,
        formerOrgId,
        ftes,
        geoAdminLevel1,
        geoAdminLevel2,
        geoAdminLevel3,
        massRanking,
        origin,
        origNetwork,
        parentOrgId,
        postalCode,
        profit,
        revenue,
        revenueRanking,
        riskManager,
        servicesNotes,
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
     * Unique identifier of the parent organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idOrganization(): String = idOrganization.getRequired("idOrganization")

    /**
     * Organization details name.
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
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Street number of the organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun address1(): Optional<String> = address1.getOptional("address1")

    /**
     * Field for additional organization address information such as PO Box and unit number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun address2(): Optional<String> = address2.getOptional("address2")

    /**
     * Contains the third line of address information for an organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun address3(): Optional<String> = address3.getOptional("address3")

    /**
     * Designated broker for this organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun broker(): Optional<String> = broker.getOptional("broker")

    /**
     * For organizations of type CORPORATION, the name of the Chief Executive Officer.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ceo(): Optional<String> = ceo.getOptional("ceo")

    /**
     * For organizations of type CORPORATION, the name of the Chief Financial Officer.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cfo(): Optional<String> = cfo.getOptional("cfo")

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
     * For organizations of type CORPORATION, the name of the Chief Technology Officer.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cto(): Optional<String> = cto.getOptional("cto")

    /**
     * Organization description.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * For organizations of type CORPORATION, the company EBITDA value as of financialYearEndDate in
     * US Dollars.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ebitda(): Optional<Double> = ebitda.getOptional("ebitda")

    /**
     * Listed contact email address for the organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * For organizations of type CORPORATION, notes on company financials.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun financialNotes(): Optional<String> = financialNotes.getOptional("financialNotes")

    /**
     * For organizations of type CORPORATION, the effective financial year end date for revenue,
     * EBITDA, and profit values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun financialYearEndDate(): Optional<OffsetDateTime> =
        financialYearEndDate.getOptional("financialYearEndDate")

    /**
     * Satellite fleet planning notes for this organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fleetPlanNotes(): Optional<String> = fleetPlanNotes.getOptional("fleetPlanNotes")

    /**
     * Former organization ID (if this organization previously existed as another organization).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun formerOrgId(): Optional<String> = formerOrgId.getOptional("formerOrgId")

    /**
     * Total number of FTEs in this organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ftes(): Optional<Int> = ftes.getOptional("ftes")

    /**
     * Administrative boundaries of the first sub-national level. Level 1 is simply the largest
     * demarcation under whatever demarcation criteria has been determined by the governing body.
     * For example, this may be a state or province.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoAdminLevel1(): Optional<String> = geoAdminLevel1.getOptional("geoAdminLevel1")

    /**
     * Administrative boundaries of the second sub-national level. Level 2 is simply the second
     * largest demarcation under whatever demarcation criteria has been determined by the governing
     * body. For example, this may be a county or district.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoAdminLevel2(): Optional<String> = geoAdminLevel2.getOptional("geoAdminLevel2")

    /**
     * Administrative boundaries of the third sub-national level. Level 3 is simply the third
     * largest demarcation under whatever demarcation criteria has been determined by the governing
     * body. For example, this may be a city or township.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoAdminLevel3(): Optional<String> = geoAdminLevel3.getOptional("geoAdminLevel3")

    /**
     * Mass ranking for this organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun massRanking(): Optional<Int> = massRanking.getOptional("massRanking")

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
     * Parent organization ID of this organization if it is a child organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun parentOrgId(): Optional<String> = parentOrgId.getOptional("parentOrgId")

    /**
     * A postal code, such as PIN or ZIP Code, is a series of letters or digits or both included in
     * the postal address of the organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun postalCode(): Optional<String> = postalCode.getOptional("postalCode")

    /**
     * For organizations of type CORPORATION, total annual profit as of financialYearEndDate in US
     * Dollars.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun profit(): Optional<Double> = profit.getOptional("profit")

    /**
     * For organizations of type CORPORATION, total annual revenue as of financialYearEndDate in US
     * Dollars.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun revenue(): Optional<Double> = revenue.getOptional("revenue")

    /**
     * Revenue ranking for this organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun revenueRanking(): Optional<Int> = revenueRanking.getOptional("revenueRanking")

    /**
     * The name of the risk manager for the organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun riskManager(): Optional<String> = riskManager.getOptional("riskManager")

    /**
     * Notes on the services provided by the organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun servicesNotes(): Optional<String> = servicesNotes.getOptional("servicesNotes")

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
     * Returns the raw JSON value of [idOrganization].
     *
     * Unlike [idOrganization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOrganization")
    @ExcludeMissing
    fun _idOrganization(): JsonField<String> = idOrganization

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [address1].
     *
     * Unlike [address1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

    /**
     * Returns the raw JSON value of [address2].
     *
     * Unlike [address2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

    /**
     * Returns the raw JSON value of [address3].
     *
     * Unlike [address3], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address3") @ExcludeMissing fun _address3(): JsonField<String> = address3

    /**
     * Returns the raw JSON value of [broker].
     *
     * Unlike [broker], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("broker") @ExcludeMissing fun _broker(): JsonField<String> = broker

    /**
     * Returns the raw JSON value of [ceo].
     *
     * Unlike [ceo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ceo") @ExcludeMissing fun _ceo(): JsonField<String> = ceo

    /**
     * Returns the raw JSON value of [cfo].
     *
     * Unlike [cfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cfo") @ExcludeMissing fun _cfo(): JsonField<String> = cfo

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
     * Returns the raw JSON value of [cto].
     *
     * Unlike [cto], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cto") @ExcludeMissing fun _cto(): JsonField<String> = cto

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [ebitda].
     *
     * Unlike [ebitda], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ebitda") @ExcludeMissing fun _ebitda(): JsonField<Double> = ebitda

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [financialNotes].
     *
     * Unlike [financialNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("financialNotes")
    @ExcludeMissing
    fun _financialNotes(): JsonField<String> = financialNotes

    /**
     * Returns the raw JSON value of [financialYearEndDate].
     *
     * Unlike [financialYearEndDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("financialYearEndDate")
    @ExcludeMissing
    fun _financialYearEndDate(): JsonField<OffsetDateTime> = financialYearEndDate

    /**
     * Returns the raw JSON value of [fleetPlanNotes].
     *
     * Unlike [fleetPlanNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fleetPlanNotes")
    @ExcludeMissing
    fun _fleetPlanNotes(): JsonField<String> = fleetPlanNotes

    /**
     * Returns the raw JSON value of [formerOrgId].
     *
     * Unlike [formerOrgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("formerOrgId") @ExcludeMissing fun _formerOrgId(): JsonField<String> = formerOrgId

    /**
     * Returns the raw JSON value of [ftes].
     *
     * Unlike [ftes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ftes") @ExcludeMissing fun _ftes(): JsonField<Int> = ftes

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
     * Returns the raw JSON value of [massRanking].
     *
     * Unlike [massRanking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("massRanking") @ExcludeMissing fun _massRanking(): JsonField<Int> = massRanking

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
     * Returns the raw JSON value of [parentOrgId].
     *
     * Unlike [parentOrgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parentOrgId") @ExcludeMissing fun _parentOrgId(): JsonField<String> = parentOrgId

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postalCode") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [profit].
     *
     * Unlike [profit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profit") @ExcludeMissing fun _profit(): JsonField<Double> = profit

    /**
     * Returns the raw JSON value of [revenue].
     *
     * Unlike [revenue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revenue") @ExcludeMissing fun _revenue(): JsonField<Double> = revenue

    /**
     * Returns the raw JSON value of [revenueRanking].
     *
     * Unlike [revenueRanking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revenueRanking")
    @ExcludeMissing
    fun _revenueRanking(): JsonField<Int> = revenueRanking

    /**
     * Returns the raw JSON value of [riskManager].
     *
     * Unlike [riskManager], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("riskManager") @ExcludeMissing fun _riskManager(): JsonField<String> = riskManager

    /**
     * Returns the raw JSON value of [servicesNotes].
     *
     * Unlike [servicesNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("servicesNotes")
    @ExcludeMissing
    fun _servicesNotes(): JsonField<String> = servicesNotes

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
         * Returns a mutable builder for constructing an instance of
         * [OrganizationdetailListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idOrganization()
         * .name()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrganizationdetailListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idOrganization: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var address1: JsonField<String> = JsonMissing.of()
        private var address2: JsonField<String> = JsonMissing.of()
        private var address3: JsonField<String> = JsonMissing.of()
        private var broker: JsonField<String> = JsonMissing.of()
        private var ceo: JsonField<String> = JsonMissing.of()
        private var cfo: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var cto: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var ebitda: JsonField<Double> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var financialNotes: JsonField<String> = JsonMissing.of()
        private var financialYearEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var fleetPlanNotes: JsonField<String> = JsonMissing.of()
        private var formerOrgId: JsonField<String> = JsonMissing.of()
        private var ftes: JsonField<Int> = JsonMissing.of()
        private var geoAdminLevel1: JsonField<String> = JsonMissing.of()
        private var geoAdminLevel2: JsonField<String> = JsonMissing.of()
        private var geoAdminLevel3: JsonField<String> = JsonMissing.of()
        private var massRanking: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var parentOrgId: JsonField<String> = JsonMissing.of()
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var profit: JsonField<Double> = JsonMissing.of()
        private var revenue: JsonField<Double> = JsonMissing.of()
        private var revenueRanking: JsonField<Int> = JsonMissing.of()
        private var riskManager: JsonField<String> = JsonMissing.of()
        private var servicesNotes: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organizationdetailListResponse: OrganizationdetailListResponse) = apply {
            classificationMarking = organizationdetailListResponse.classificationMarking
            dataMode = organizationdetailListResponse.dataMode
            idOrganization = organizationdetailListResponse.idOrganization
            name = organizationdetailListResponse.name
            source = organizationdetailListResponse.source
            id = organizationdetailListResponse.id
            address1 = organizationdetailListResponse.address1
            address2 = organizationdetailListResponse.address2
            address3 = organizationdetailListResponse.address3
            broker = organizationdetailListResponse.broker
            ceo = organizationdetailListResponse.ceo
            cfo = organizationdetailListResponse.cfo
            createdAt = organizationdetailListResponse.createdAt
            createdBy = organizationdetailListResponse.createdBy
            cto = organizationdetailListResponse.cto
            description = organizationdetailListResponse.description
            ebitda = organizationdetailListResponse.ebitda
            email = organizationdetailListResponse.email
            financialNotes = organizationdetailListResponse.financialNotes
            financialYearEndDate = organizationdetailListResponse.financialYearEndDate
            fleetPlanNotes = organizationdetailListResponse.fleetPlanNotes
            formerOrgId = organizationdetailListResponse.formerOrgId
            ftes = organizationdetailListResponse.ftes
            geoAdminLevel1 = organizationdetailListResponse.geoAdminLevel1
            geoAdminLevel2 = organizationdetailListResponse.geoAdminLevel2
            geoAdminLevel3 = organizationdetailListResponse.geoAdminLevel3
            massRanking = organizationdetailListResponse.massRanking
            origin = organizationdetailListResponse.origin
            origNetwork = organizationdetailListResponse.origNetwork
            parentOrgId = organizationdetailListResponse.parentOrgId
            postalCode = organizationdetailListResponse.postalCode
            profit = organizationdetailListResponse.profit
            revenue = organizationdetailListResponse.revenue
            revenueRanking = organizationdetailListResponse.revenueRanking
            riskManager = organizationdetailListResponse.riskManager
            servicesNotes = organizationdetailListResponse.servicesNotes
            additionalProperties =
                organizationdetailListResponse.additionalProperties.toMutableMap()
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

        /** Unique identifier of the parent organization. */
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

        /** Organization details name. */
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

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Street number of the organization. */
        fun address1(address1: String) = address1(JsonField.of(address1))

        /**
         * Sets [Builder.address1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

        /** Field for additional organization address information such as PO Box and unit number. */
        fun address2(address2: String) = address2(JsonField.of(address2))

        /**
         * Sets [Builder.address2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

        /** Contains the third line of address information for an organization. */
        fun address3(address3: String) = address3(JsonField.of(address3))

        /**
         * Sets [Builder.address3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address3] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address3(address3: JsonField<String>) = apply { this.address3 = address3 }

        /** Designated broker for this organization. */
        fun broker(broker: String) = broker(JsonField.of(broker))

        /**
         * Sets [Builder.broker] to an arbitrary JSON value.
         *
         * You should usually call [Builder.broker] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun broker(broker: JsonField<String>) = apply { this.broker = broker }

        /** For organizations of type CORPORATION, the name of the Chief Executive Officer. */
        fun ceo(ceo: String) = ceo(JsonField.of(ceo))

        /**
         * Sets [Builder.ceo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ceo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ceo(ceo: JsonField<String>) = apply { this.ceo = ceo }

        /** For organizations of type CORPORATION, the name of the Chief Financial Officer. */
        fun cfo(cfo: String) = cfo(JsonField.of(cfo))

        /**
         * Sets [Builder.cfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cfo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cfo(cfo: JsonField<String>) = apply { this.cfo = cfo }

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

        /** For organizations of type CORPORATION, the name of the Chief Technology Officer. */
        fun cto(cto: String) = cto(JsonField.of(cto))

        /**
         * Sets [Builder.cto] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cto] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cto(cto: JsonField<String>) = apply { this.cto = cto }

        /** Organization description. */
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
         * For organizations of type CORPORATION, the company EBITDA value as of
         * financialYearEndDate in US Dollars.
         */
        fun ebitda(ebitda: Double) = ebitda(JsonField.of(ebitda))

        /**
         * Sets [Builder.ebitda] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ebitda] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ebitda(ebitda: JsonField<Double>) = apply { this.ebitda = ebitda }

        /** Listed contact email address for the organization. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** For organizations of type CORPORATION, notes on company financials. */
        fun financialNotes(financialNotes: String) = financialNotes(JsonField.of(financialNotes))

        /**
         * Sets [Builder.financialNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialNotes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun financialNotes(financialNotes: JsonField<String>) = apply {
            this.financialNotes = financialNotes
        }

        /**
         * For organizations of type CORPORATION, the effective financial year end date for revenue,
         * EBITDA, and profit values.
         */
        fun financialYearEndDate(financialYearEndDate: OffsetDateTime) =
            financialYearEndDate(JsonField.of(financialYearEndDate))

        /**
         * Sets [Builder.financialYearEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialYearEndDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun financialYearEndDate(financialYearEndDate: JsonField<OffsetDateTime>) = apply {
            this.financialYearEndDate = financialYearEndDate
        }

        /** Satellite fleet planning notes for this organization. */
        fun fleetPlanNotes(fleetPlanNotes: String) = fleetPlanNotes(JsonField.of(fleetPlanNotes))

        /**
         * Sets [Builder.fleetPlanNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fleetPlanNotes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fleetPlanNotes(fleetPlanNotes: JsonField<String>) = apply {
            this.fleetPlanNotes = fleetPlanNotes
        }

        /**
         * Former organization ID (if this organization previously existed as another organization).
         */
        fun formerOrgId(formerOrgId: String) = formerOrgId(JsonField.of(formerOrgId))

        /**
         * Sets [Builder.formerOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formerOrgId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun formerOrgId(formerOrgId: JsonField<String>) = apply { this.formerOrgId = formerOrgId }

        /** Total number of FTEs in this organization. */
        fun ftes(ftes: Int) = ftes(JsonField.of(ftes))

        /**
         * Sets [Builder.ftes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ftes] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ftes(ftes: JsonField<Int>) = apply { this.ftes = ftes }

        /**
         * Administrative boundaries of the first sub-national level. Level 1 is simply the largest
         * demarcation under whatever demarcation criteria has been determined by the governing
         * body. For example, this may be a state or province.
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
         * governing body. For example, this may be a county or district.
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
         * governing body. For example, this may be a city or township.
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

        /** Mass ranking for this organization. */
        fun massRanking(massRanking: Int) = massRanking(JsonField.of(massRanking))

        /**
         * Sets [Builder.massRanking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.massRanking] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun massRanking(massRanking: JsonField<Int>) = apply { this.massRanking = massRanking }

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

        /** Parent organization ID of this organization if it is a child organization. */
        fun parentOrgId(parentOrgId: String) = parentOrgId(JsonField.of(parentOrgId))

        /**
         * Sets [Builder.parentOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentOrgId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentOrgId(parentOrgId: JsonField<String>) = apply { this.parentOrgId = parentOrgId }

        /**
         * A postal code, such as PIN or ZIP Code, is a series of letters or digits or both included
         * in the postal address of the organization.
         */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /**
         * For organizations of type CORPORATION, total annual profit as of financialYearEndDate in
         * US Dollars.
         */
        fun profit(profit: Double) = profit(JsonField.of(profit))

        /**
         * Sets [Builder.profit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profit] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun profit(profit: JsonField<Double>) = apply { this.profit = profit }

        /**
         * For organizations of type CORPORATION, total annual revenue as of financialYearEndDate in
         * US Dollars.
         */
        fun revenue(revenue: Double) = revenue(JsonField.of(revenue))

        /**
         * Sets [Builder.revenue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revenue] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun revenue(revenue: JsonField<Double>) = apply { this.revenue = revenue }

        /** Revenue ranking for this organization. */
        fun revenueRanking(revenueRanking: Int) = revenueRanking(JsonField.of(revenueRanking))

        /**
         * Sets [Builder.revenueRanking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revenueRanking] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun revenueRanking(revenueRanking: JsonField<Int>) = apply {
            this.revenueRanking = revenueRanking
        }

        /** The name of the risk manager for the organization. */
        fun riskManager(riskManager: String) = riskManager(JsonField.of(riskManager))

        /**
         * Sets [Builder.riskManager] to an arbitrary JSON value.
         *
         * You should usually call [Builder.riskManager] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun riskManager(riskManager: JsonField<String>) = apply { this.riskManager = riskManager }

        /** Notes on the services provided by the organization. */
        fun servicesNotes(servicesNotes: String) = servicesNotes(JsonField.of(servicesNotes))

        /**
         * Sets [Builder.servicesNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.servicesNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun servicesNotes(servicesNotes: JsonField<String>) = apply {
            this.servicesNotes = servicesNotes
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
         * Returns an immutable instance of [OrganizationdetailListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idOrganization()
         * .name()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrganizationdetailListResponse =
            OrganizationdetailListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idOrganization", idOrganization),
                checkRequired("name", name),
                checkRequired("source", source),
                id,
                address1,
                address2,
                address3,
                broker,
                ceo,
                cfo,
                createdAt,
                createdBy,
                cto,
                description,
                ebitda,
                email,
                financialNotes,
                financialYearEndDate,
                fleetPlanNotes,
                formerOrgId,
                ftes,
                geoAdminLevel1,
                geoAdminLevel2,
                geoAdminLevel3,
                massRanking,
                origin,
                origNetwork,
                parentOrgId,
                postalCode,
                profit,
                revenue,
                revenueRanking,
                riskManager,
                servicesNotes,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OrganizationdetailListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idOrganization()
        name()
        source()
        id()
        address1()
        address2()
        address3()
        broker()
        ceo()
        cfo()
        createdAt()
        createdBy()
        cto()
        description()
        ebitda()
        email()
        financialNotes()
        financialYearEndDate()
        fleetPlanNotes()
        formerOrgId()
        ftes()
        geoAdminLevel1()
        geoAdminLevel2()
        geoAdminLevel3()
        massRanking()
        origin()
        origNetwork()
        parentOrgId()
        postalCode()
        profit()
        revenue()
        revenueRanking()
        riskManager()
        servicesNotes()
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
            (if (idOrganization.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (address1.asKnown().isPresent) 1 else 0) +
            (if (address2.asKnown().isPresent) 1 else 0) +
            (if (address3.asKnown().isPresent) 1 else 0) +
            (if (broker.asKnown().isPresent) 1 else 0) +
            (if (ceo.asKnown().isPresent) 1 else 0) +
            (if (cfo.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (cto.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (ebitda.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (financialNotes.asKnown().isPresent) 1 else 0) +
            (if (financialYearEndDate.asKnown().isPresent) 1 else 0) +
            (if (fleetPlanNotes.asKnown().isPresent) 1 else 0) +
            (if (formerOrgId.asKnown().isPresent) 1 else 0) +
            (if (ftes.asKnown().isPresent) 1 else 0) +
            (if (geoAdminLevel1.asKnown().isPresent) 1 else 0) +
            (if (geoAdminLevel2.asKnown().isPresent) 1 else 0) +
            (if (geoAdminLevel3.asKnown().isPresent) 1 else 0) +
            (if (massRanking.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (parentOrgId.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (profit.asKnown().isPresent) 1 else 0) +
            (if (revenue.asKnown().isPresent) 1 else 0) +
            (if (revenueRanking.asKnown().isPresent) 1 else 0) +
            (if (riskManager.asKnown().isPresent) 1 else 0) +
            (if (servicesNotes.asKnown().isPresent) 1 else 0)

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

        return /* spotless:off */ other is OrganizationdetailListResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && idOrganization == other.idOrganization && name == other.name && source == other.source && id == other.id && address1 == other.address1 && address2 == other.address2 && address3 == other.address3 && broker == other.broker && ceo == other.ceo && cfo == other.cfo && createdAt == other.createdAt && createdBy == other.createdBy && cto == other.cto && description == other.description && ebitda == other.ebitda && email == other.email && financialNotes == other.financialNotes && financialYearEndDate == other.financialYearEndDate && fleetPlanNotes == other.fleetPlanNotes && formerOrgId == other.formerOrgId && ftes == other.ftes && geoAdminLevel1 == other.geoAdminLevel1 && geoAdminLevel2 == other.geoAdminLevel2 && geoAdminLevel3 == other.geoAdminLevel3 && massRanking == other.massRanking && origin == other.origin && origNetwork == other.origNetwork && parentOrgId == other.parentOrgId && postalCode == other.postalCode && profit == other.profit && revenue == other.revenue && revenueRanking == other.revenueRanking && riskManager == other.riskManager && servicesNotes == other.servicesNotes && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, idOrganization, name, source, id, address1, address2, address3, broker, ceo, cfo, createdAt, createdBy, cto, description, ebitda, email, financialNotes, financialYearEndDate, fleetPlanNotes, formerOrgId, ftes, geoAdminLevel1, geoAdminLevel2, geoAdminLevel3, massRanking, origin, origNetwork, parentOrgId, postalCode, profit, revenue, revenueRanking, riskManager, servicesNotes, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrganizationdetailListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, idOrganization=$idOrganization, name=$name, source=$source, id=$id, address1=$address1, address2=$address2, address3=$address3, broker=$broker, ceo=$ceo, cfo=$cfo, createdAt=$createdAt, createdBy=$createdBy, cto=$cto, description=$description, ebitda=$ebitda, email=$email, financialNotes=$financialNotes, financialYearEndDate=$financialYearEndDate, fleetPlanNotes=$fleetPlanNotes, formerOrgId=$formerOrgId, ftes=$ftes, geoAdminLevel1=$geoAdminLevel1, geoAdminLevel2=$geoAdminLevel2, geoAdminLevel3=$geoAdminLevel3, massRanking=$massRanking, origin=$origin, origNetwork=$origNetwork, parentOrgId=$parentOrgId, postalCode=$postalCode, profit=$profit, revenue=$revenue, revenueRanking=$revenueRanking, riskManager=$riskManager, servicesNotes=$servicesNotes, additionalProperties=$additionalProperties}"
}

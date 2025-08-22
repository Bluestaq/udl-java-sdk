// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.diplomaticclearance.country

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation intended for initial integration only, to take a list of
 * diplomaticclearancecountry records as a POST body and ingest into the database. This operation is
 * not intended to be used for automated feeds into UDL. Data providers should contact the UDL team
 * for specific role assignments and for instructions on setting up a permanent feed through an
 * alternate mechanism.
 */
class CountryCreateBulkParams
private constructor(
    private val body: List<Body>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun body(): List<Body> = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CountryCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CountryCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(countryCreateBulkParams: CountryCreateBulkParams) = apply {
            body = countryCreateBulkParams.body.toMutableList()
            additionalHeaders = countryCreateBulkParams.additionalHeaders.toBuilder()
            additionalQueryParams = countryCreateBulkParams.additionalQueryParams.toBuilder()
        }

        fun body(body: List<Body>) = apply { this.body = body.toMutableList() }

        /**
         * Adds a single [Body] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: Body) = apply {
            this.body = (this.body ?: mutableListOf()).apply { add(body) }
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CountryCreateBulkParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CountryCreateBulkParams =
            CountryCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Diplomatic Clearance Country provides information such as entry/exit points, requirements,
     * and points of contact for countries diplomatic clearances are being created for.
     */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("countryCode") @ExcludeMissing private val countryCode: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("lastChangedDate")
        @ExcludeMissing
        private val lastChangedDate: JsonField<OffsetDateTime>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("acceptsDMS") @ExcludeMissing private val acceptsDms: JsonField<Boolean>,
        @JsonProperty("acceptsEmail") @ExcludeMissing private val acceptsEmail: JsonField<Boolean>,
        @JsonProperty("acceptsFax") @ExcludeMissing private val acceptsFax: JsonField<Boolean>,
        @JsonProperty("acceptsSIPRNet")
        @ExcludeMissing
        private val acceptsSiprNet: JsonField<Boolean>,
        @JsonProperty("agency") @ExcludeMissing private val agency: JsonField<String>,
        @JsonProperty("altCountryCode")
        @ExcludeMissing
        private val altCountryCode: JsonField<String>,
        @JsonProperty("closeTime") @ExcludeMissing private val closeTime: JsonField<String>,
        @JsonProperty("countryId") @ExcludeMissing private val countryId: JsonField<String>,
        @JsonProperty("countryName") @ExcludeMissing private val countryName: JsonField<String>,
        @JsonProperty("countryRemark") @ExcludeMissing private val countryRemark: JsonField<String>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("diplomaticClearanceCountryContacts")
        @ExcludeMissing
        private val diplomaticClearanceCountryContacts:
            JsonField<List<DiplomaticClearanceCountryContact>>,
        @JsonProperty("diplomaticClearanceCountryEntryExitPoints")
        @ExcludeMissing
        private val diplomaticClearanceCountryEntryExitPoints:
            JsonField<List<DiplomaticClearanceCountryEntryExitPoint>>,
        @JsonProperty("diplomaticClearanceCountryProfiles")
        @ExcludeMissing
        private val diplomaticClearanceCountryProfiles:
            JsonField<List<DiplomaticClearanceCountryProfile>>,
        @JsonProperty("existingProfile")
        @ExcludeMissing
        private val existingProfile: JsonField<Boolean>,
        @JsonProperty("gmtOffset") @ExcludeMissing private val gmtOffset: JsonField<String>,
        @JsonProperty("officeName") @ExcludeMissing private val officeName: JsonField<String>,
        @JsonProperty("officePOC") @ExcludeMissing private val officePoc: JsonField<String>,
        @JsonProperty("officeRemark") @ExcludeMissing private val officeRemark: JsonField<String>,
        @JsonProperty("openFri") @ExcludeMissing private val openFri: JsonField<Boolean>,
        @JsonProperty("openMon") @ExcludeMissing private val openMon: JsonField<Boolean>,
        @JsonProperty("openSat") @ExcludeMissing private val openSat: JsonField<Boolean>,
        @JsonProperty("openSun") @ExcludeMissing private val openSun: JsonField<Boolean>,
        @JsonProperty("openThu") @ExcludeMissing private val openThu: JsonField<Boolean>,
        @JsonProperty("openTime") @ExcludeMissing private val openTime: JsonField<String>,
        @JsonProperty("openTue") @ExcludeMissing private val openTue: JsonField<Boolean>,
        @JsonProperty("openWed") @ExcludeMissing private val openWed: JsonField<Boolean>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("sourceDL") @ExcludeMissing private val sourceDl: JsonField<String>,
        @JsonProperty("updatedAt") @ExcludeMissing private val updatedAt: JsonField<OffsetDateTime>,
        @JsonProperty("updatedBy") @ExcludeMissing private val updatedBy: JsonField<String>,
    ) {

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
         * The DoD Standard Country Code designator for the country for which the diplomatic
         * clearance will be issued. This field should be set to "OTHR" if the source value does not
         * match a UDL country code value (ISO-3166-ALPHA-2).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun countryCode(): String = countryCode.getRequired("countryCode")

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
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Last time this country's diplomatic clearance profile information was updated, in ISO
         * 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun lastChangedDate(): OffsetDateTime = lastChangedDate.getRequired("lastChangedDate")

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
         * Flag indicating whether this country's diplomatic clearance office can receive messages
         * using the Defense Message System (DMS).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun acceptsDms(): Optional<Boolean> = acceptsDms.getOptional("acceptsDMS")

        /**
         * Flag indicating whether this country's diplomatic clearance office can receive messages
         * via email.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun acceptsEmail(): Optional<Boolean> = acceptsEmail.getOptional("acceptsEmail")

        /**
         * Flag indicating whether this country's diplomatic clearance office can receive messages
         * via fax.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun acceptsFax(): Optional<Boolean> = acceptsFax.getOptional("acceptsFax")

        /**
         * Flag indicating whether this country's diplomatic clearance office can receive messages
         * via SIPRNet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun acceptsSiprNet(): Optional<Boolean> = acceptsSiprNet.getOptional("acceptsSIPRNet")

        /**
         * The source agency of the diplomatic clearance country data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun agency(): Optional<String> = agency.getOptional("agency")

        /**
         * Specifies an alternate country code if the data provider code does not match a UDL
         * Country code value (ISO-3166-ALPHA-2). This field will be set to the value provided by
         * the source and should be used for all Queries specifying a Country Code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun altCountryCode(): Optional<String> = altCountryCode.getOptional("altCountryCode")

        /**
         * Zulu closing time of this country's diplomatic clearance office expressed in HH:MM
         * format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun closeTime(): Optional<String> = closeTime.getOptional("closeTime")

        /**
         * System generated code used to identify a country.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun countryId(): Optional<String> = countryId.getOptional("countryId")

        /**
         * Name of the country for which the diplomatic clearance will be issued.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun countryName(): Optional<String> = countryName.getOptional("countryName")

        /**
         * Remarks concerning the country for which the diplomatic clearance will be issued.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun countryRemark(): Optional<String> = countryRemark.getOptional("countryRemark")

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
         * Collection of diplomatic clearance profile information for this country.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun diplomaticClearanceCountryContacts():
            Optional<List<DiplomaticClearanceCountryContact>> =
            diplomaticClearanceCountryContacts.getOptional("diplomaticClearanceCountryContacts")

        /**
         * Collection of diplomatic clearance profile information for this country.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun diplomaticClearanceCountryEntryExitPoints():
            Optional<List<DiplomaticClearanceCountryEntryExitPoint>> =
            diplomaticClearanceCountryEntryExitPoints.getOptional(
                "diplomaticClearanceCountryEntryExitPoints"
            )

        /**
         * Collection of diplomatic clearance profile information for this country.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun diplomaticClearanceCountryProfiles():
            Optional<List<DiplomaticClearanceCountryProfile>> =
            diplomaticClearanceCountryProfiles.getOptional("diplomaticClearanceCountryProfiles")

        /**
         * Flag indicating whether a diplomatic clearance profile exists for this country.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun existingProfile(): Optional<Boolean> = existingProfile.getOptional("existingProfile")

        /**
         * Time difference between the location of the country for which the diplomatic clearance
         * will be issued and the Greenwich Mean Time (GMT), expressed as +/-HH:MM. Time zones east
         * of Greenwich have positive offsets and time zones west of Greenwich are negative.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun gmtOffset(): Optional<String> = gmtOffset.getOptional("gmtOffset")

        /**
         * Name of this country's diplomatic clearance office.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun officeName(): Optional<String> = officeName.getOptional("officeName")

        /**
         * Name of the point of contact for this country's diplomatic clearance office.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun officePoc(): Optional<String> = officePoc.getOptional("officePOC")

        /**
         * Remarks concerning this country's diplomatic clearance office.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun officeRemark(): Optional<String> = officeRemark.getOptional("officeRemark")

        /**
         * Flag indicating whether this country's diplomatic clearance office is open on Friday.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun openFri(): Optional<Boolean> = openFri.getOptional("openFri")

        /**
         * Flag indicating whether this country's diplomatic clearance office is open on Monday.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun openMon(): Optional<Boolean> = openMon.getOptional("openMon")

        /**
         * Flag indicating whether this country's diplomatic clearance office is open on Saturday.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun openSat(): Optional<Boolean> = openSat.getOptional("openSat")

        /**
         * Flag indicating whether this country's diplomatic clearance office is open on Sunday.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun openSun(): Optional<Boolean> = openSun.getOptional("openSun")

        /**
         * Flag indicating whether this country's diplomatic clearance office is open on Thursday.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun openThu(): Optional<Boolean> = openThu.getOptional("openThu")

        /**
         * Zulu opening time of this country's diplomatic clearance office expressed in HH:MM
         * format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun openTime(): Optional<String> = openTime.getOptional("openTime")

        /**
         * Flag indicating whether this country's diplomatic clearance office is open on Tuesday.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun openTue(): Optional<Boolean> = openTue.getOptional("openTue")

        /**
         * Flag indicating whether this country's diplomatic clearance office is open on Wednesday.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun openWed(): Optional<Boolean> = openWed.getOptional("openWed")

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
         * Time the row was updated in the database, auto-populated by the system.
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
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryCode")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [dataMode].
         *
         * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataMode") @ExcludeMissing fun _dataMode(): JsonField<DataMode> = dataMode

        /**
         * Returns the raw JSON value of [lastChangedDate].
         *
         * Unlike [lastChangedDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lastChangedDate")
        @ExcludeMissing
        fun _lastChangedDate(): JsonField<OffsetDateTime> = lastChangedDate

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
         * Returns the raw JSON value of [acceptsDms].
         *
         * Unlike [acceptsDms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("acceptsDMS")
        @ExcludeMissing
        fun _acceptsDms(): JsonField<Boolean> = acceptsDms

        /**
         * Returns the raw JSON value of [acceptsEmail].
         *
         * Unlike [acceptsEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("acceptsEmail")
        @ExcludeMissing
        fun _acceptsEmail(): JsonField<Boolean> = acceptsEmail

        /**
         * Returns the raw JSON value of [acceptsFax].
         *
         * Unlike [acceptsFax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("acceptsFax")
        @ExcludeMissing
        fun _acceptsFax(): JsonField<Boolean> = acceptsFax

        /**
         * Returns the raw JSON value of [acceptsSiprNet].
         *
         * Unlike [acceptsSiprNet], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("acceptsSIPRNet")
        @ExcludeMissing
        fun _acceptsSiprNet(): JsonField<Boolean> = acceptsSiprNet

        /**
         * Returns the raw JSON value of [agency].
         *
         * Unlike [agency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agency") @ExcludeMissing fun _agency(): JsonField<String> = agency

        /**
         * Returns the raw JSON value of [altCountryCode].
         *
         * Unlike [altCountryCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("altCountryCode")
        @ExcludeMissing
        fun _altCountryCode(): JsonField<String> = altCountryCode

        /**
         * Returns the raw JSON value of [closeTime].
         *
         * Unlike [closeTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("closeTime") @ExcludeMissing fun _closeTime(): JsonField<String> = closeTime

        /**
         * Returns the raw JSON value of [countryId].
         *
         * Unlike [countryId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryId") @ExcludeMissing fun _countryId(): JsonField<String> = countryId

        /**
         * Returns the raw JSON value of [countryName].
         *
         * Unlike [countryName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryName")
        @ExcludeMissing
        fun _countryName(): JsonField<String> = countryName

        /**
         * Returns the raw JSON value of [countryRemark].
         *
         * Unlike [countryRemark], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("countryRemark")
        @ExcludeMissing
        fun _countryRemark(): JsonField<String> = countryRemark

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
         * Returns the raw JSON value of [diplomaticClearanceCountryContacts].
         *
         * Unlike [diplomaticClearanceCountryContacts], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("diplomaticClearanceCountryContacts")
        @ExcludeMissing
        fun _diplomaticClearanceCountryContacts():
            JsonField<List<DiplomaticClearanceCountryContact>> = diplomaticClearanceCountryContacts

        /**
         * Returns the raw JSON value of [diplomaticClearanceCountryEntryExitPoints].
         *
         * Unlike [diplomaticClearanceCountryEntryExitPoints], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("diplomaticClearanceCountryEntryExitPoints")
        @ExcludeMissing
        fun _diplomaticClearanceCountryEntryExitPoints():
            JsonField<List<DiplomaticClearanceCountryEntryExitPoint>> =
            diplomaticClearanceCountryEntryExitPoints

        /**
         * Returns the raw JSON value of [diplomaticClearanceCountryProfiles].
         *
         * Unlike [diplomaticClearanceCountryProfiles], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("diplomaticClearanceCountryProfiles")
        @ExcludeMissing
        fun _diplomaticClearanceCountryProfiles():
            JsonField<List<DiplomaticClearanceCountryProfile>> = diplomaticClearanceCountryProfiles

        /**
         * Returns the raw JSON value of [existingProfile].
         *
         * Unlike [existingProfile], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("existingProfile")
        @ExcludeMissing
        fun _existingProfile(): JsonField<Boolean> = existingProfile

        /**
         * Returns the raw JSON value of [gmtOffset].
         *
         * Unlike [gmtOffset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gmtOffset") @ExcludeMissing fun _gmtOffset(): JsonField<String> = gmtOffset

        /**
         * Returns the raw JSON value of [officeName].
         *
         * Unlike [officeName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("officeName")
        @ExcludeMissing
        fun _officeName(): JsonField<String> = officeName

        /**
         * Returns the raw JSON value of [officePoc].
         *
         * Unlike [officePoc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("officePOC") @ExcludeMissing fun _officePoc(): JsonField<String> = officePoc

        /**
         * Returns the raw JSON value of [officeRemark].
         *
         * Unlike [officeRemark], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("officeRemark")
        @ExcludeMissing
        fun _officeRemark(): JsonField<String> = officeRemark

        /**
         * Returns the raw JSON value of [openFri].
         *
         * Unlike [openFri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("openFri") @ExcludeMissing fun _openFri(): JsonField<Boolean> = openFri

        /**
         * Returns the raw JSON value of [openMon].
         *
         * Unlike [openMon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("openMon") @ExcludeMissing fun _openMon(): JsonField<Boolean> = openMon

        /**
         * Returns the raw JSON value of [openSat].
         *
         * Unlike [openSat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("openSat") @ExcludeMissing fun _openSat(): JsonField<Boolean> = openSat

        /**
         * Returns the raw JSON value of [openSun].
         *
         * Unlike [openSun], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("openSun") @ExcludeMissing fun _openSun(): JsonField<Boolean> = openSun

        /**
         * Returns the raw JSON value of [openThu].
         *
         * Unlike [openThu], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("openThu") @ExcludeMissing fun _openThu(): JsonField<Boolean> = openThu

        /**
         * Returns the raw JSON value of [openTime].
         *
         * Unlike [openTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("openTime") @ExcludeMissing fun _openTime(): JsonField<String> = openTime

        /**
         * Returns the raw JSON value of [openTue].
         *
         * Unlike [openTue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("openTue") @ExcludeMissing fun _openTue(): JsonField<Boolean> = openTue

        /**
         * Returns the raw JSON value of [openWed].
         *
         * Unlike [openWed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("openWed") @ExcludeMissing fun _openWed(): JsonField<Boolean> = openWed

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

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .countryCode()
             * .dataMode()
             * .lastChangedDate()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var countryCode: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var lastChangedDate: JsonField<OffsetDateTime>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var acceptsDms: JsonField<Boolean> = JsonMissing.of()
            private var acceptsEmail: JsonField<Boolean> = JsonMissing.of()
            private var acceptsFax: JsonField<Boolean> = JsonMissing.of()
            private var acceptsSiprNet: JsonField<Boolean> = JsonMissing.of()
            private var agency: JsonField<String> = JsonMissing.of()
            private var altCountryCode: JsonField<String> = JsonMissing.of()
            private var closeTime: JsonField<String> = JsonMissing.of()
            private var countryId: JsonField<String> = JsonMissing.of()
            private var countryName: JsonField<String> = JsonMissing.of()
            private var countryRemark: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var diplomaticClearanceCountryContacts:
                JsonField<MutableList<DiplomaticClearanceCountryContact>>? =
                null
            private var diplomaticClearanceCountryEntryExitPoints:
                JsonField<MutableList<DiplomaticClearanceCountryEntryExitPoint>>? =
                null
            private var diplomaticClearanceCountryProfiles:
                JsonField<MutableList<DiplomaticClearanceCountryProfile>>? =
                null
            private var existingProfile: JsonField<Boolean> = JsonMissing.of()
            private var gmtOffset: JsonField<String> = JsonMissing.of()
            private var officeName: JsonField<String> = JsonMissing.of()
            private var officePoc: JsonField<String> = JsonMissing.of()
            private var officeRemark: JsonField<String> = JsonMissing.of()
            private var openFri: JsonField<Boolean> = JsonMissing.of()
            private var openMon: JsonField<Boolean> = JsonMissing.of()
            private var openSat: JsonField<Boolean> = JsonMissing.of()
            private var openSun: JsonField<Boolean> = JsonMissing.of()
            private var openThu: JsonField<Boolean> = JsonMissing.of()
            private var openTime: JsonField<String> = JsonMissing.of()
            private var openTue: JsonField<Boolean> = JsonMissing.of()
            private var openWed: JsonField<Boolean> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                countryCode = body.countryCode
                dataMode = body.dataMode
                lastChangedDate = body.lastChangedDate
                source = body.source
                id = body.id
                acceptsDms = body.acceptsDms
                acceptsEmail = body.acceptsEmail
                acceptsFax = body.acceptsFax
                acceptsSiprNet = body.acceptsSiprNet
                agency = body.agency
                altCountryCode = body.altCountryCode
                closeTime = body.closeTime
                countryId = body.countryId
                countryName = body.countryName
                countryRemark = body.countryRemark
                createdAt = body.createdAt
                createdBy = body.createdBy
                diplomaticClearanceCountryContacts =
                    body.diplomaticClearanceCountryContacts.map { it.toMutableList() }
                diplomaticClearanceCountryEntryExitPoints =
                    body.diplomaticClearanceCountryEntryExitPoints.map { it.toMutableList() }
                diplomaticClearanceCountryProfiles =
                    body.diplomaticClearanceCountryProfiles.map { it.toMutableList() }
                existingProfile = body.existingProfile
                gmtOffset = body.gmtOffset
                officeName = body.officeName
                officePoc = body.officePoc
                officeRemark = body.officeRemark
                openFri = body.openFri
                openMon = body.openMon
                openSat = body.openSat
                openSun = body.openSun
                openThu = body.openThu
                openTime = body.openTime
                openTue = body.openTue
                openWed = body.openWed
                origin = body.origin
                origNetwork = body.origNetwork
                sourceDl = body.sourceDl
                updatedAt = body.updatedAt
                updatedBy = body.updatedBy
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

            /**
             * The DoD Standard Country Code designator for the country for which the diplomatic
             * clearance will be issued. This field should be set to "OTHR" if the source value does
             * not match a UDL country code value (ISO-3166-ALPHA-2).
             */
            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

            /**
             * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             */
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
             * Last time this country's diplomatic clearance profile information was updated, in ISO
             * 8601 UTC format with millisecond precision.
             */
            fun lastChangedDate(lastChangedDate: OffsetDateTime) =
                lastChangedDate(JsonField.of(lastChangedDate))

            /**
             * Sets [Builder.lastChangedDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastChangedDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lastChangedDate(lastChangedDate: JsonField<OffsetDateTime>) = apply {
                this.lastChangedDate = lastChangedDate
            }

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
             * Flag indicating whether this country's diplomatic clearance office can receive
             * messages using the Defense Message System (DMS).
             */
            fun acceptsDms(acceptsDms: Boolean) = acceptsDms(JsonField.of(acceptsDms))

            /**
             * Sets [Builder.acceptsDms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptsDms] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun acceptsDms(acceptsDms: JsonField<Boolean>) = apply { this.acceptsDms = acceptsDms }

            /**
             * Flag indicating whether this country's diplomatic clearance office can receive
             * messages via email.
             */
            fun acceptsEmail(acceptsEmail: Boolean) = acceptsEmail(JsonField.of(acceptsEmail))

            /**
             * Sets [Builder.acceptsEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptsEmail] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun acceptsEmail(acceptsEmail: JsonField<Boolean>) = apply {
                this.acceptsEmail = acceptsEmail
            }

            /**
             * Flag indicating whether this country's diplomatic clearance office can receive
             * messages via fax.
             */
            fun acceptsFax(acceptsFax: Boolean) = acceptsFax(JsonField.of(acceptsFax))

            /**
             * Sets [Builder.acceptsFax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptsFax] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun acceptsFax(acceptsFax: JsonField<Boolean>) = apply { this.acceptsFax = acceptsFax }

            /**
             * Flag indicating whether this country's diplomatic clearance office can receive
             * messages via SIPRNet.
             */
            fun acceptsSiprNet(acceptsSiprNet: Boolean) =
                acceptsSiprNet(JsonField.of(acceptsSiprNet))

            /**
             * Sets [Builder.acceptsSiprNet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptsSiprNet] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun acceptsSiprNet(acceptsSiprNet: JsonField<Boolean>) = apply {
                this.acceptsSiprNet = acceptsSiprNet
            }

            /** The source agency of the diplomatic clearance country data. */
            fun agency(agency: String) = agency(JsonField.of(agency))

            /**
             * Sets [Builder.agency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agency(agency: JsonField<String>) = apply { this.agency = agency }

            /**
             * Specifies an alternate country code if the data provider code does not match a UDL
             * Country code value (ISO-3166-ALPHA-2). This field will be set to the value provided
             * by the source and should be used for all Queries specifying a Country Code.
             */
            fun altCountryCode(altCountryCode: String) =
                altCountryCode(JsonField.of(altCountryCode))

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

            /**
             * Zulu closing time of this country's diplomatic clearance office expressed in HH:MM
             * format.
             */
            fun closeTime(closeTime: String) = closeTime(JsonField.of(closeTime))

            /**
             * Sets [Builder.closeTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.closeTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun closeTime(closeTime: JsonField<String>) = apply { this.closeTime = closeTime }

            /** System generated code used to identify a country. */
            fun countryId(countryId: String) = countryId(JsonField.of(countryId))

            /**
             * Sets [Builder.countryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryId(countryId: JsonField<String>) = apply { this.countryId = countryId }

            /** Name of the country for which the diplomatic clearance will be issued. */
            fun countryName(countryName: String) = countryName(JsonField.of(countryName))

            /**
             * Sets [Builder.countryName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryName(countryName: JsonField<String>) = apply {
                this.countryName = countryName
            }

            /** Remarks concerning the country for which the diplomatic clearance will be issued. */
            fun countryRemark(countryRemark: String) = countryRemark(JsonField.of(countryRemark))

            /**
             * Sets [Builder.countryRemark] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryRemark] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryRemark(countryRemark: JsonField<String>) = apply {
                this.countryRemark = countryRemark
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

            /** Collection of diplomatic clearance profile information for this country. */
            fun diplomaticClearanceCountryContacts(
                diplomaticClearanceCountryContacts: List<DiplomaticClearanceCountryContact>
            ) = diplomaticClearanceCountryContacts(JsonField.of(diplomaticClearanceCountryContacts))

            /**
             * Sets [Builder.diplomaticClearanceCountryContacts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.diplomaticClearanceCountryContacts] with a
             * well-typed `List<DiplomaticClearanceCountryContact>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun diplomaticClearanceCountryContacts(
                diplomaticClearanceCountryContacts:
                    JsonField<List<DiplomaticClearanceCountryContact>>
            ) = apply {
                this.diplomaticClearanceCountryContacts =
                    diplomaticClearanceCountryContacts.map { it.toMutableList() }
            }

            /**
             * Adds a single [DiplomaticClearanceCountryContact] to
             * [diplomaticClearanceCountryContacts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDiplomaticClearanceCountryContact(
                diplomaticClearanceCountryContact: DiplomaticClearanceCountryContact
            ) = apply {
                diplomaticClearanceCountryContacts =
                    (diplomaticClearanceCountryContacts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("diplomaticClearanceCountryContacts", it)
                            .add(diplomaticClearanceCountryContact)
                    }
            }

            /** Collection of diplomatic clearance profile information for this country. */
            fun diplomaticClearanceCountryEntryExitPoints(
                diplomaticClearanceCountryEntryExitPoints:
                    List<DiplomaticClearanceCountryEntryExitPoint>
            ) =
                diplomaticClearanceCountryEntryExitPoints(
                    JsonField.of(diplomaticClearanceCountryEntryExitPoints)
                )

            /**
             * Sets [Builder.diplomaticClearanceCountryEntryExitPoints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.diplomaticClearanceCountryEntryExitPoints] with a
             * well-typed `List<DiplomaticClearanceCountryEntryExitPoint>` value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun diplomaticClearanceCountryEntryExitPoints(
                diplomaticClearanceCountryEntryExitPoints:
                    JsonField<List<DiplomaticClearanceCountryEntryExitPoint>>
            ) = apply {
                this.diplomaticClearanceCountryEntryExitPoints =
                    diplomaticClearanceCountryEntryExitPoints.map { it.toMutableList() }
            }

            /**
             * Adds a single [DiplomaticClearanceCountryEntryExitPoint] to
             * [diplomaticClearanceCountryEntryExitPoints].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDiplomaticClearanceCountryEntryExitPoint(
                diplomaticClearanceCountryEntryExitPoint: DiplomaticClearanceCountryEntryExitPoint
            ) = apply {
                diplomaticClearanceCountryEntryExitPoints =
                    (diplomaticClearanceCountryEntryExitPoints ?: JsonField.of(mutableListOf()))
                        .also {
                            checkKnown("diplomaticClearanceCountryEntryExitPoints", it)
                                .add(diplomaticClearanceCountryEntryExitPoint)
                        }
            }

            /** Collection of diplomatic clearance profile information for this country. */
            fun diplomaticClearanceCountryProfiles(
                diplomaticClearanceCountryProfiles: List<DiplomaticClearanceCountryProfile>
            ) = diplomaticClearanceCountryProfiles(JsonField.of(diplomaticClearanceCountryProfiles))

            /**
             * Sets [Builder.diplomaticClearanceCountryProfiles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.diplomaticClearanceCountryProfiles] with a
             * well-typed `List<DiplomaticClearanceCountryProfile>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun diplomaticClearanceCountryProfiles(
                diplomaticClearanceCountryProfiles:
                    JsonField<List<DiplomaticClearanceCountryProfile>>
            ) = apply {
                this.diplomaticClearanceCountryProfiles =
                    diplomaticClearanceCountryProfiles.map { it.toMutableList() }
            }

            /**
             * Adds a single [DiplomaticClearanceCountryProfile] to
             * [diplomaticClearanceCountryProfiles].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDiplomaticClearanceCountryProfile(
                diplomaticClearanceCountryProfile: DiplomaticClearanceCountryProfile
            ) = apply {
                diplomaticClearanceCountryProfiles =
                    (diplomaticClearanceCountryProfiles ?: JsonField.of(mutableListOf())).also {
                        checkKnown("diplomaticClearanceCountryProfiles", it)
                            .add(diplomaticClearanceCountryProfile)
                    }
            }

            /** Flag indicating whether a diplomatic clearance profile exists for this country. */
            fun existingProfile(existingProfile: Boolean) =
                existingProfile(JsonField.of(existingProfile))

            /**
             * Sets [Builder.existingProfile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.existingProfile] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun existingProfile(existingProfile: JsonField<Boolean>) = apply {
                this.existingProfile = existingProfile
            }

            /**
             * Time difference between the location of the country for which the diplomatic
             * clearance will be issued and the Greenwich Mean Time (GMT), expressed as +/-HH:MM.
             * Time zones east of Greenwich have positive offsets and time zones west of Greenwich
             * are negative.
             */
            fun gmtOffset(gmtOffset: String) = gmtOffset(JsonField.of(gmtOffset))

            /**
             * Sets [Builder.gmtOffset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gmtOffset] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gmtOffset(gmtOffset: JsonField<String>) = apply { this.gmtOffset = gmtOffset }

            /** Name of this country's diplomatic clearance office. */
            fun officeName(officeName: String) = officeName(JsonField.of(officeName))

            /**
             * Sets [Builder.officeName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.officeName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun officeName(officeName: JsonField<String>) = apply { this.officeName = officeName }

            /** Name of the point of contact for this country's diplomatic clearance office. */
            fun officePoc(officePoc: String) = officePoc(JsonField.of(officePoc))

            /**
             * Sets [Builder.officePoc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.officePoc] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun officePoc(officePoc: JsonField<String>) = apply { this.officePoc = officePoc }

            /** Remarks concerning this country's diplomatic clearance office. */
            fun officeRemark(officeRemark: String) = officeRemark(JsonField.of(officeRemark))

            /**
             * Sets [Builder.officeRemark] to an arbitrary JSON value.
             *
             * You should usually call [Builder.officeRemark] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun officeRemark(officeRemark: JsonField<String>) = apply {
                this.officeRemark = officeRemark
            }

            /**
             * Flag indicating whether this country's diplomatic clearance office is open on Friday.
             */
            fun openFri(openFri: Boolean) = openFri(JsonField.of(openFri))

            /**
             * Sets [Builder.openFri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openFri] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun openFri(openFri: JsonField<Boolean>) = apply { this.openFri = openFri }

            /**
             * Flag indicating whether this country's diplomatic clearance office is open on Monday.
             */
            fun openMon(openMon: Boolean) = openMon(JsonField.of(openMon))

            /**
             * Sets [Builder.openMon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openMon] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun openMon(openMon: JsonField<Boolean>) = apply { this.openMon = openMon }

            /**
             * Flag indicating whether this country's diplomatic clearance office is open on
             * Saturday.
             */
            fun openSat(openSat: Boolean) = openSat(JsonField.of(openSat))

            /**
             * Sets [Builder.openSat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openSat] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun openSat(openSat: JsonField<Boolean>) = apply { this.openSat = openSat }

            /**
             * Flag indicating whether this country's diplomatic clearance office is open on Sunday.
             */
            fun openSun(openSun: Boolean) = openSun(JsonField.of(openSun))

            /**
             * Sets [Builder.openSun] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openSun] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun openSun(openSun: JsonField<Boolean>) = apply { this.openSun = openSun }

            /**
             * Flag indicating whether this country's diplomatic clearance office is open on
             * Thursday.
             */
            fun openThu(openThu: Boolean) = openThu(JsonField.of(openThu))

            /**
             * Sets [Builder.openThu] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openThu] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun openThu(openThu: JsonField<Boolean>) = apply { this.openThu = openThu }

            /**
             * Zulu opening time of this country's diplomatic clearance office expressed in HH:MM
             * format.
             */
            fun openTime(openTime: String) = openTime(JsonField.of(openTime))

            /**
             * Sets [Builder.openTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun openTime(openTime: JsonField<String>) = apply { this.openTime = openTime }

            /**
             * Flag indicating whether this country's diplomatic clearance office is open on
             * Tuesday.
             */
            fun openTue(openTue: Boolean) = openTue(JsonField.of(openTue))

            /**
             * Sets [Builder.openTue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openTue] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun openTue(openTue: JsonField<Boolean>) = apply { this.openTue = openTue }

            /**
             * Flag indicating whether this country's diplomatic clearance office is open on
             * Wednesday.
             */
            fun openWed(openWed: Boolean) = openWed(JsonField.of(openWed))

            /**
             * Sets [Builder.openWed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openWed] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun openWed(openWed: JsonField<Boolean>) = apply { this.openWed = openWed }

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

            /** Time the row was updated in the database, auto-populated by the system. */
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .countryCode()
             * .dataMode()
             * .lastChangedDate()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("countryCode", countryCode),
                    checkRequired("dataMode", dataMode),
                    checkRequired("lastChangedDate", lastChangedDate),
                    checkRequired("source", source),
                    id,
                    acceptsDms,
                    acceptsEmail,
                    acceptsFax,
                    acceptsSiprNet,
                    agency,
                    altCountryCode,
                    closeTime,
                    countryId,
                    countryName,
                    countryRemark,
                    createdAt,
                    createdBy,
                    (diplomaticClearanceCountryContacts ?: JsonMissing.of()).map {
                        it.toImmutable()
                    },
                    (diplomaticClearanceCountryEntryExitPoints ?: JsonMissing.of()).map {
                        it.toImmutable()
                    },
                    (diplomaticClearanceCountryProfiles ?: JsonMissing.of()).map {
                        it.toImmutable()
                    },
                    existingProfile,
                    gmtOffset,
                    officeName,
                    officePoc,
                    officeRemark,
                    openFri,
                    openMon,
                    openSat,
                    openSun,
                    openThu,
                    openTime,
                    openTue,
                    openWed,
                    origin,
                    origNetwork,
                    sourceDl,
                    updatedAt,
                    updatedBy,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            countryCode()
            dataMode().validate()
            lastChangedDate()
            source()
            id()
            acceptsDms()
            acceptsEmail()
            acceptsFax()
            acceptsSiprNet()
            agency()
            altCountryCode()
            closeTime()
            countryId()
            countryName()
            countryRemark()
            createdAt()
            createdBy()
            diplomaticClearanceCountryContacts().ifPresent { it.forEach { it.validate() } }
            diplomaticClearanceCountryEntryExitPoints().ifPresent { it.forEach { it.validate() } }
            diplomaticClearanceCountryProfiles().ifPresent { it.forEach { it.validate() } }
            existingProfile()
            gmtOffset()
            officeName()
            officePoc()
            officeRemark()
            openFri()
            openMon()
            openSat()
            openSun()
            openThu()
            openTime()
            openTue()
            openWed()
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
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (lastChangedDate.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (acceptsDms.asKnown().isPresent) 1 else 0) +
                (if (acceptsEmail.asKnown().isPresent) 1 else 0) +
                (if (acceptsFax.asKnown().isPresent) 1 else 0) +
                (if (acceptsSiprNet.asKnown().isPresent) 1 else 0) +
                (if (agency.asKnown().isPresent) 1 else 0) +
                (if (altCountryCode.asKnown().isPresent) 1 else 0) +
                (if (closeTime.asKnown().isPresent) 1 else 0) +
                (if (countryId.asKnown().isPresent) 1 else 0) +
                (if (countryName.asKnown().isPresent) 1 else 0) +
                (if (countryRemark.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (diplomaticClearanceCountryContacts.asKnown().getOrNull()?.sumOf {
                    it.validity().toInt()
                } ?: 0) +
                (diplomaticClearanceCountryEntryExitPoints.asKnown().getOrNull()?.sumOf {
                    it.validity().toInt()
                } ?: 0) +
                (diplomaticClearanceCountryProfiles.asKnown().getOrNull()?.sumOf {
                    it.validity().toInt()
                } ?: 0) +
                (if (existingProfile.asKnown().isPresent) 1 else 0) +
                (if (gmtOffset.asKnown().isPresent) 1 else 0) +
                (if (officeName.asKnown().isPresent) 1 else 0) +
                (if (officePoc.asKnown().isPresent) 1 else 0) +
                (if (officeRemark.asKnown().isPresent) 1 else 0) +
                (if (openFri.asKnown().isPresent) 1 else 0) +
                (if (openMon.asKnown().isPresent) 1 else 0) +
                (if (openSat.asKnown().isPresent) 1 else 0) +
                (if (openSun.asKnown().isPresent) 1 else 0) +
                (if (openThu.asKnown().isPresent) 1 else 0) +
                (if (openTime.asKnown().isPresent) 1 else 0) +
                (if (openTue.asKnown().isPresent) 1 else 0) +
                (if (openWed.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (sourceDl.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0)

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

        /** Collection of contact information for this country. */
        class DiplomaticClearanceCountryContact
        private constructor(
            private val ahNum: JsonField<String>,
            private val ahSpdDialCode: JsonField<String>,
            private val commNum: JsonField<String>,
            private val commSpdDialCode: JsonField<String>,
            private val contactId: JsonField<String>,
            private val contactName: JsonField<String>,
            private val contactRemark: JsonField<String>,
            private val dsnNum: JsonField<String>,
            private val dsnSpdDialCode: JsonField<String>,
            private val faxNum: JsonField<String>,
            private val niprNum: JsonField<String>,
            private val siprNum: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ahNum") @ExcludeMissing ahNum: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ahSpdDialCode")
                @ExcludeMissing
                ahSpdDialCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("commNum")
                @ExcludeMissing
                commNum: JsonField<String> = JsonMissing.of(),
                @JsonProperty("commSpdDialCode")
                @ExcludeMissing
                commSpdDialCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("contactId")
                @ExcludeMissing
                contactId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("contactName")
                @ExcludeMissing
                contactName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("contactRemark")
                @ExcludeMissing
                contactRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dsnNum")
                @ExcludeMissing
                dsnNum: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dsnSpdDialCode")
                @ExcludeMissing
                dsnSpdDialCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("faxNum")
                @ExcludeMissing
                faxNum: JsonField<String> = JsonMissing.of(),
                @JsonProperty("niprNum")
                @ExcludeMissing
                niprNum: JsonField<String> = JsonMissing.of(),
                @JsonProperty("siprNum")
                @ExcludeMissing
                siprNum: JsonField<String> = JsonMissing.of(),
            ) : this(
                ahNum,
                ahSpdDialCode,
                commNum,
                commSpdDialCode,
                contactId,
                contactName,
                contactRemark,
                dsnNum,
                dsnSpdDialCode,
                faxNum,
                niprNum,
                siprNum,
                mutableMapOf(),
            )

            /**
             * Phone number for this contact after regular business hours.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ahNum(): Optional<String> = ahNum.getOptional("ahNum")

            /**
             * Speed dial code for this contact after regular business hours.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ahSpdDialCode(): Optional<String> = ahSpdDialCode.getOptional("ahSpdDialCode")

            /**
             * Commercial phone number for this contact.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun commNum(): Optional<String> = commNum.getOptional("commNum")

            /**
             * Commercial speed dial code for this contact.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun commSpdDialCode(): Optional<String> = commSpdDialCode.getOptional("commSpdDialCode")

            /**
             * Identifier of the contact for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun contactId(): Optional<String> = contactId.getOptional("contactId")

            /**
             * Name of the contact for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun contactName(): Optional<String> = contactName.getOptional("contactName")

            /**
             * Remarks about this contact.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun contactRemark(): Optional<String> = contactRemark.getOptional("contactRemark")

            /**
             * Defense Switched Network (DSN) phone number for this contact.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun dsnNum(): Optional<String> = dsnNum.getOptional("dsnNum")

            /**
             * Defense Switched Network (DSN) speed dial code for this contact.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun dsnSpdDialCode(): Optional<String> = dsnSpdDialCode.getOptional("dsnSpdDialCode")

            /**
             * Fax number for this contact.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun faxNum(): Optional<String> = faxNum.getOptional("faxNum")

            /**
             * Phone number to contact the Diplomatic Attache Office (DAO) for this country over a
             * secure NIPR line.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun niprNum(): Optional<String> = niprNum.getOptional("niprNum")

            /**
             * Phone number to contact the Diplomatic Attache Office (DAO) for this country over a
             * secure SIPR line.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun siprNum(): Optional<String> = siprNum.getOptional("siprNum")

            /**
             * Returns the raw JSON value of [ahNum].
             *
             * Unlike [ahNum], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ahNum") @ExcludeMissing fun _ahNum(): JsonField<String> = ahNum

            /**
             * Returns the raw JSON value of [ahSpdDialCode].
             *
             * Unlike [ahSpdDialCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ahSpdDialCode")
            @ExcludeMissing
            fun _ahSpdDialCode(): JsonField<String> = ahSpdDialCode

            /**
             * Returns the raw JSON value of [commNum].
             *
             * Unlike [commNum], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("commNum") @ExcludeMissing fun _commNum(): JsonField<String> = commNum

            /**
             * Returns the raw JSON value of [commSpdDialCode].
             *
             * Unlike [commSpdDialCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("commSpdDialCode")
            @ExcludeMissing
            fun _commSpdDialCode(): JsonField<String> = commSpdDialCode

            /**
             * Returns the raw JSON value of [contactId].
             *
             * Unlike [contactId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contactId")
            @ExcludeMissing
            fun _contactId(): JsonField<String> = contactId

            /**
             * Returns the raw JSON value of [contactName].
             *
             * Unlike [contactName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contactName")
            @ExcludeMissing
            fun _contactName(): JsonField<String> = contactName

            /**
             * Returns the raw JSON value of [contactRemark].
             *
             * Unlike [contactRemark], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contactRemark")
            @ExcludeMissing
            fun _contactRemark(): JsonField<String> = contactRemark

            /**
             * Returns the raw JSON value of [dsnNum].
             *
             * Unlike [dsnNum], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("dsnNum") @ExcludeMissing fun _dsnNum(): JsonField<String> = dsnNum

            /**
             * Returns the raw JSON value of [dsnSpdDialCode].
             *
             * Unlike [dsnSpdDialCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("dsnSpdDialCode")
            @ExcludeMissing
            fun _dsnSpdDialCode(): JsonField<String> = dsnSpdDialCode

            /**
             * Returns the raw JSON value of [faxNum].
             *
             * Unlike [faxNum], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("faxNum") @ExcludeMissing fun _faxNum(): JsonField<String> = faxNum

            /**
             * Returns the raw JSON value of [niprNum].
             *
             * Unlike [niprNum], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("niprNum") @ExcludeMissing fun _niprNum(): JsonField<String> = niprNum

            /**
             * Returns the raw JSON value of [siprNum].
             *
             * Unlike [siprNum], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("siprNum") @ExcludeMissing fun _siprNum(): JsonField<String> = siprNum

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
                 * [DiplomaticClearanceCountryContact].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DiplomaticClearanceCountryContact]. */
            class Builder internal constructor() {

                private var ahNum: JsonField<String> = JsonMissing.of()
                private var ahSpdDialCode: JsonField<String> = JsonMissing.of()
                private var commNum: JsonField<String> = JsonMissing.of()
                private var commSpdDialCode: JsonField<String> = JsonMissing.of()
                private var contactId: JsonField<String> = JsonMissing.of()
                private var contactName: JsonField<String> = JsonMissing.of()
                private var contactRemark: JsonField<String> = JsonMissing.of()
                private var dsnNum: JsonField<String> = JsonMissing.of()
                private var dsnSpdDialCode: JsonField<String> = JsonMissing.of()
                private var faxNum: JsonField<String> = JsonMissing.of()
                private var niprNum: JsonField<String> = JsonMissing.of()
                private var siprNum: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    diplomaticClearanceCountryContact: DiplomaticClearanceCountryContact
                ) = apply {
                    ahNum = diplomaticClearanceCountryContact.ahNum
                    ahSpdDialCode = diplomaticClearanceCountryContact.ahSpdDialCode
                    commNum = diplomaticClearanceCountryContact.commNum
                    commSpdDialCode = diplomaticClearanceCountryContact.commSpdDialCode
                    contactId = diplomaticClearanceCountryContact.contactId
                    contactName = diplomaticClearanceCountryContact.contactName
                    contactRemark = diplomaticClearanceCountryContact.contactRemark
                    dsnNum = diplomaticClearanceCountryContact.dsnNum
                    dsnSpdDialCode = diplomaticClearanceCountryContact.dsnSpdDialCode
                    faxNum = diplomaticClearanceCountryContact.faxNum
                    niprNum = diplomaticClearanceCountryContact.niprNum
                    siprNum = diplomaticClearanceCountryContact.siprNum
                    additionalProperties =
                        diplomaticClearanceCountryContact.additionalProperties.toMutableMap()
                }

                /** Phone number for this contact after regular business hours. */
                fun ahNum(ahNum: String) = ahNum(JsonField.of(ahNum))

                /**
                 * Sets [Builder.ahNum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ahNum] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun ahNum(ahNum: JsonField<String>) = apply { this.ahNum = ahNum }

                /** Speed dial code for this contact after regular business hours. */
                fun ahSpdDialCode(ahSpdDialCode: String) =
                    ahSpdDialCode(JsonField.of(ahSpdDialCode))

                /**
                 * Sets [Builder.ahSpdDialCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ahSpdDialCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ahSpdDialCode(ahSpdDialCode: JsonField<String>) = apply {
                    this.ahSpdDialCode = ahSpdDialCode
                }

                /** Commercial phone number for this contact. */
                fun commNum(commNum: String) = commNum(JsonField.of(commNum))

                /**
                 * Sets [Builder.commNum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.commNum] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun commNum(commNum: JsonField<String>) = apply { this.commNum = commNum }

                /** Commercial speed dial code for this contact. */
                fun commSpdDialCode(commSpdDialCode: String) =
                    commSpdDialCode(JsonField.of(commSpdDialCode))

                /**
                 * Sets [Builder.commSpdDialCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.commSpdDialCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun commSpdDialCode(commSpdDialCode: JsonField<String>) = apply {
                    this.commSpdDialCode = commSpdDialCode
                }

                /** Identifier of the contact for this country. */
                fun contactId(contactId: String) = contactId(JsonField.of(contactId))

                /**
                 * Sets [Builder.contactId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contactId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contactId(contactId: JsonField<String>) = apply { this.contactId = contactId }

                /** Name of the contact for this country. */
                fun contactName(contactName: String) = contactName(JsonField.of(contactName))

                /**
                 * Sets [Builder.contactName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contactName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contactName(contactName: JsonField<String>) = apply {
                    this.contactName = contactName
                }

                /** Remarks about this contact. */
                fun contactRemark(contactRemark: String) =
                    contactRemark(JsonField.of(contactRemark))

                /**
                 * Sets [Builder.contactRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contactRemark] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contactRemark(contactRemark: JsonField<String>) = apply {
                    this.contactRemark = contactRemark
                }

                /** Defense Switched Network (DSN) phone number for this contact. */
                fun dsnNum(dsnNum: String) = dsnNum(JsonField.of(dsnNum))

                /**
                 * Sets [Builder.dsnNum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dsnNum] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dsnNum(dsnNum: JsonField<String>) = apply { this.dsnNum = dsnNum }

                /** Defense Switched Network (DSN) speed dial code for this contact. */
                fun dsnSpdDialCode(dsnSpdDialCode: String) =
                    dsnSpdDialCode(JsonField.of(dsnSpdDialCode))

                /**
                 * Sets [Builder.dsnSpdDialCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dsnSpdDialCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dsnSpdDialCode(dsnSpdDialCode: JsonField<String>) = apply {
                    this.dsnSpdDialCode = dsnSpdDialCode
                }

                /** Fax number for this contact. */
                fun faxNum(faxNum: String) = faxNum(JsonField.of(faxNum))

                /**
                 * Sets [Builder.faxNum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.faxNum] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun faxNum(faxNum: JsonField<String>) = apply { this.faxNum = faxNum }

                /**
                 * Phone number to contact the Diplomatic Attache Office (DAO) for this country over
                 * a secure NIPR line.
                 */
                fun niprNum(niprNum: String) = niprNum(JsonField.of(niprNum))

                /**
                 * Sets [Builder.niprNum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.niprNum] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun niprNum(niprNum: JsonField<String>) = apply { this.niprNum = niprNum }

                /**
                 * Phone number to contact the Diplomatic Attache Office (DAO) for this country over
                 * a secure SIPR line.
                 */
                fun siprNum(siprNum: String) = siprNum(JsonField.of(siprNum))

                /**
                 * Sets [Builder.siprNum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.siprNum] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun siprNum(siprNum: JsonField<String>) = apply { this.siprNum = siprNum }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAlladditional_properties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAlladditional_properties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DiplomaticClearanceCountryContact].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DiplomaticClearanceCountryContact =
                    DiplomaticClearanceCountryContact(
                        ahNum,
                        ahSpdDialCode,
                        commNum,
                        commSpdDialCode,
                        contactId,
                        contactName,
                        contactRemark,
                        dsnNum,
                        dsnSpdDialCode,
                        faxNum,
                        niprNum,
                        siprNum,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DiplomaticClearanceCountryContact = apply {
                if (validated) {
                    return@apply
                }

                ahNum()
                ahSpdDialCode()
                commNum()
                commSpdDialCode()
                contactId()
                contactName()
                contactRemark()
                dsnNum()
                dsnSpdDialCode()
                faxNum()
                niprNum()
                siprNum()
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
                (if (ahNum.asKnown().isPresent) 1 else 0) +
                    (if (ahSpdDialCode.asKnown().isPresent) 1 else 0) +
                    (if (commNum.asKnown().isPresent) 1 else 0) +
                    (if (commSpdDialCode.asKnown().isPresent) 1 else 0) +
                    (if (contactId.asKnown().isPresent) 1 else 0) +
                    (if (contactName.asKnown().isPresent) 1 else 0) +
                    (if (contactRemark.asKnown().isPresent) 1 else 0) +
                    (if (dsnNum.asKnown().isPresent) 1 else 0) +
                    (if (dsnSpdDialCode.asKnown().isPresent) 1 else 0) +
                    (if (faxNum.asKnown().isPresent) 1 else 0) +
                    (if (niprNum.asKnown().isPresent) 1 else 0) +
                    (if (siprNum.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DiplomaticClearanceCountryContact &&
                    ahNum == other.ahNum &&
                    ahSpdDialCode == other.ahSpdDialCode &&
                    commNum == other.commNum &&
                    commSpdDialCode == other.commSpdDialCode &&
                    contactId == other.contactId &&
                    contactName == other.contactName &&
                    contactRemark == other.contactRemark &&
                    dsnNum == other.dsnNum &&
                    dsnSpdDialCode == other.dsnSpdDialCode &&
                    faxNum == other.faxNum &&
                    niprNum == other.niprNum &&
                    siprNum == other.siprNum &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    ahNum,
                    ahSpdDialCode,
                    commNum,
                    commSpdDialCode,
                    contactId,
                    contactName,
                    contactRemark,
                    dsnNum,
                    dsnSpdDialCode,
                    faxNum,
                    niprNum,
                    siprNum,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DiplomaticClearanceCountryContact{ahNum=$ahNum, ahSpdDialCode=$ahSpdDialCode, commNum=$commNum, commSpdDialCode=$commSpdDialCode, contactId=$contactId, contactName=$contactName, contactRemark=$contactRemark, dsnNum=$dsnNum, dsnSpdDialCode=$dsnSpdDialCode, faxNum=$faxNum, niprNum=$niprNum, siprNum=$siprNum, additionalProperties=$additionalProperties}"
        }

        /** Collection of entry and exit points for this country. */
        class DiplomaticClearanceCountryEntryExitPoint
        private constructor(
            private val isEntry: JsonField<Boolean>,
            private val isExit: JsonField<Boolean>,
            private val pointName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("isEntry")
                @ExcludeMissing
                isEntry: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("isExit")
                @ExcludeMissing
                isExit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("pointName")
                @ExcludeMissing
                pointName: JsonField<String> = JsonMissing.of(),
            ) : this(isEntry, isExit, pointName, mutableMapOf())

            /**
             * Flag indicating whether this is a point of entry for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun isEntry(): Optional<Boolean> = isEntry.getOptional("isEntry")

            /**
             * Flag indicating whether this is a point of exit for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun isExit(): Optional<Boolean> = isExit.getOptional("isExit")

            /**
             * Name of this entry/exit point.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pointName(): Optional<String> = pointName.getOptional("pointName")

            /**
             * Returns the raw JSON value of [isEntry].
             *
             * Unlike [isEntry], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("isEntry") @ExcludeMissing fun _isEntry(): JsonField<Boolean> = isEntry

            /**
             * Returns the raw JSON value of [isExit].
             *
             * Unlike [isExit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("isExit") @ExcludeMissing fun _isExit(): JsonField<Boolean> = isExit

            /**
             * Returns the raw JSON value of [pointName].
             *
             * Unlike [pointName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pointName")
            @ExcludeMissing
            fun _pointName(): JsonField<String> = pointName

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
                 * [DiplomaticClearanceCountryEntryExitPoint].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DiplomaticClearanceCountryEntryExitPoint]. */
            class Builder internal constructor() {

                private var isEntry: JsonField<Boolean> = JsonMissing.of()
                private var isExit: JsonField<Boolean> = JsonMissing.of()
                private var pointName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    diplomaticClearanceCountryEntryExitPoint:
                        DiplomaticClearanceCountryEntryExitPoint
                ) = apply {
                    isEntry = diplomaticClearanceCountryEntryExitPoint.isEntry
                    isExit = diplomaticClearanceCountryEntryExitPoint.isExit
                    pointName = diplomaticClearanceCountryEntryExitPoint.pointName
                    additionalProperties =
                        diplomaticClearanceCountryEntryExitPoint.additionalProperties.toMutableMap()
                }

                /** Flag indicating whether this is a point of entry for this country. */
                fun isEntry(isEntry: Boolean) = isEntry(JsonField.of(isEntry))

                /**
                 * Sets [Builder.isEntry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isEntry] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isEntry(isEntry: JsonField<Boolean>) = apply { this.isEntry = isEntry }

                /** Flag indicating whether this is a point of exit for this country. */
                fun isExit(isExit: Boolean) = isExit(JsonField.of(isExit))

                /**
                 * Sets [Builder.isExit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isExit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isExit(isExit: JsonField<Boolean>) = apply { this.isExit = isExit }

                /** Name of this entry/exit point. */
                fun pointName(pointName: String) = pointName(JsonField.of(pointName))

                /**
                 * Sets [Builder.pointName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pointName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pointName(pointName: JsonField<String>) = apply { this.pointName = pointName }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAlladditional_properties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAlladditional_properties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DiplomaticClearanceCountryEntryExitPoint].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DiplomaticClearanceCountryEntryExitPoint =
                    DiplomaticClearanceCountryEntryExitPoint(
                        isEntry,
                        isExit,
                        pointName,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DiplomaticClearanceCountryEntryExitPoint = apply {
                if (validated) {
                    return@apply
                }

                isEntry()
                isExit()
                pointName()
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
                (if (isEntry.asKnown().isPresent) 1 else 0) +
                    (if (isExit.asKnown().isPresent) 1 else 0) +
                    (if (pointName.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DiplomaticClearanceCountryEntryExitPoint &&
                    isEntry == other.isEntry &&
                    isExit == other.isExit &&
                    pointName == other.pointName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(isEntry, isExit, pointName, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DiplomaticClearanceCountryEntryExitPoint{isEntry=$isEntry, isExit=$isExit, pointName=$pointName, additionalProperties=$additionalProperties}"
        }

        /** Collection of diplomatic clearance profile information for this country. */
        class DiplomaticClearanceCountryProfile
        private constructor(
            private val cargoPaxRemark: JsonField<String>,
            private val clearanceId: JsonField<String>,
            private val crewInfoRemark: JsonField<String>,
            private val defClearanceStatus: JsonField<String>,
            private val defEntryRemark: JsonField<String>,
            private val defEntryTime: JsonField<String>,
            private val defExitRemark: JsonField<String>,
            private val defExitTime: JsonField<String>,
            private val fltInfoRemark: JsonField<String>,
            private val hazInfoRemark: JsonField<String>,
            private val landDefProf: JsonField<Boolean>,
            private val landLeadTime: JsonField<Int>,
            private val landLeadTimeRemark: JsonField<String>,
            private val landLeadTimeUnit: JsonField<String>,
            private val landValidPeriodMinus: JsonField<Int>,
            private val landValidPeriodPlus: JsonField<Int>,
            private val landValidPeriodRemark: JsonField<String>,
            private val landValidPeriodUnit: JsonField<String>,
            private val overflyDefProf: JsonField<Boolean>,
            private val overflyLeadTime: JsonField<Int>,
            private val overflyLeadTimeRemark: JsonField<String>,
            private val overflyLeadTimeUnit: JsonField<String>,
            private val overflyValidPeriodMinus: JsonField<Int>,
            private val overflyValidPeriodPlus: JsonField<Int>,
            private val overflyValidPeriodRemark: JsonField<String>,
            private val overflyValidPeriodUnit: JsonField<String>,
            private val profile: JsonField<String>,
            private val profileAgency: JsonField<String>,
            private val profileId: JsonField<String>,
            private val profileRemark: JsonField<String>,
            private val reqAcAltName: JsonField<Boolean>,
            private val reqAllHazInfo: JsonField<Boolean>,
            private val reqAmcStdInfo: JsonField<Boolean>,
            private val reqCargoList: JsonField<Boolean>,
            private val reqCargoPax: JsonField<Boolean>,
            private val reqClass1Info: JsonField<Boolean>,
            private val reqClass9Info: JsonField<Boolean>,
            private val reqCrewComp: JsonField<Boolean>,
            private val reqCrewDetail: JsonField<Boolean>,
            private val reqCrewInfo: JsonField<Boolean>,
            private val reqDiv1Info: JsonField<Boolean>,
            private val reqDv: JsonField<Boolean>,
            private val reqEntryExitCoord: JsonField<Boolean>,
            private val reqFltInfo: JsonField<Boolean>,
            private val reqFltPlanRoute: JsonField<Boolean>,
            private val reqFundSource: JsonField<Boolean>,
            private val reqHazInfo: JsonField<Boolean>,
            private val reqIcao: JsonField<Boolean>,
            private val reqPassportInfo: JsonField<Boolean>,
            private val reqRaven: JsonField<Boolean>,
            private val reqRepChange: JsonField<Boolean>,
            private val reqTailNum: JsonField<Boolean>,
            private val reqWeaponsInfo: JsonField<Boolean>,
            private val undefinedCrewReporting: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cargoPaxRemark")
                @ExcludeMissing
                cargoPaxRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("clearanceId")
                @ExcludeMissing
                clearanceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("crewInfoRemark")
                @ExcludeMissing
                crewInfoRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("defClearanceStatus")
                @ExcludeMissing
                defClearanceStatus: JsonField<String> = JsonMissing.of(),
                @JsonProperty("defEntryRemark")
                @ExcludeMissing
                defEntryRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("defEntryTime")
                @ExcludeMissing
                defEntryTime: JsonField<String> = JsonMissing.of(),
                @JsonProperty("defExitRemark")
                @ExcludeMissing
                defExitRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("defExitTime")
                @ExcludeMissing
                defExitTime: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fltInfoRemark")
                @ExcludeMissing
                fltInfoRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("hazInfoRemark")
                @ExcludeMissing
                hazInfoRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("landDefProf")
                @ExcludeMissing
                landDefProf: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("landLeadTime")
                @ExcludeMissing
                landLeadTime: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("landLeadTimeRemark")
                @ExcludeMissing
                landLeadTimeRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("landLeadTimeUnit")
                @ExcludeMissing
                landLeadTimeUnit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("landValidPeriodMinus")
                @ExcludeMissing
                landValidPeriodMinus: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("landValidPeriodPlus")
                @ExcludeMissing
                landValidPeriodPlus: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("landValidPeriodRemark")
                @ExcludeMissing
                landValidPeriodRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("landValidPeriodUnit")
                @ExcludeMissing
                landValidPeriodUnit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("overflyDefProf")
                @ExcludeMissing
                overflyDefProf: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("overflyLeadTime")
                @ExcludeMissing
                overflyLeadTime: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("overflyLeadTimeRemark")
                @ExcludeMissing
                overflyLeadTimeRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("overflyLeadTimeUnit")
                @ExcludeMissing
                overflyLeadTimeUnit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("overflyValidPeriodMinus")
                @ExcludeMissing
                overflyValidPeriodMinus: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("overflyValidPeriodPlus")
                @ExcludeMissing
                overflyValidPeriodPlus: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("overflyValidPeriodRemark")
                @ExcludeMissing
                overflyValidPeriodRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("overflyValidPeriodUnit")
                @ExcludeMissing
                overflyValidPeriodUnit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("profile")
                @ExcludeMissing
                profile: JsonField<String> = JsonMissing.of(),
                @JsonProperty("profileAgency")
                @ExcludeMissing
                profileAgency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("profileId")
                @ExcludeMissing
                profileId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("profileRemark")
                @ExcludeMissing
                profileRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reqACAltName")
                @ExcludeMissing
                reqAcAltName: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqAllHazInfo")
                @ExcludeMissing
                reqAllHazInfo: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqAMCStdInfo")
                @ExcludeMissing
                reqAmcStdInfo: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqCargoList")
                @ExcludeMissing
                reqCargoList: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqCargoPax")
                @ExcludeMissing
                reqCargoPax: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqClass1Info")
                @ExcludeMissing
                reqClass1Info: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqClass9Info")
                @ExcludeMissing
                reqClass9Info: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqCrewComp")
                @ExcludeMissing
                reqCrewComp: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqCrewDetail")
                @ExcludeMissing
                reqCrewDetail: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqCrewInfo")
                @ExcludeMissing
                reqCrewInfo: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqDiv1Info")
                @ExcludeMissing
                reqDiv1Info: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqDV") @ExcludeMissing reqDv: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqEntryExitCoord")
                @ExcludeMissing
                reqEntryExitCoord: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqFltInfo")
                @ExcludeMissing
                reqFltInfo: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqFltPlanRoute")
                @ExcludeMissing
                reqFltPlanRoute: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqFundSource")
                @ExcludeMissing
                reqFundSource: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqHazInfo")
                @ExcludeMissing
                reqHazInfo: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqICAO")
                @ExcludeMissing
                reqIcao: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqPassportInfo")
                @ExcludeMissing
                reqPassportInfo: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqRaven")
                @ExcludeMissing
                reqRaven: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqRepChange")
                @ExcludeMissing
                reqRepChange: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqTailNum")
                @ExcludeMissing
                reqTailNum: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqWeaponsInfo")
                @ExcludeMissing
                reqWeaponsInfo: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("undefinedCrewReporting")
                @ExcludeMissing
                undefinedCrewReporting: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                cargoPaxRemark,
                clearanceId,
                crewInfoRemark,
                defClearanceStatus,
                defEntryRemark,
                defEntryTime,
                defExitRemark,
                defExitTime,
                fltInfoRemark,
                hazInfoRemark,
                landDefProf,
                landLeadTime,
                landLeadTimeRemark,
                landLeadTimeUnit,
                landValidPeriodMinus,
                landValidPeriodPlus,
                landValidPeriodRemark,
                landValidPeriodUnit,
                overflyDefProf,
                overflyLeadTime,
                overflyLeadTimeRemark,
                overflyLeadTimeUnit,
                overflyValidPeriodMinus,
                overflyValidPeriodPlus,
                overflyValidPeriodRemark,
                overflyValidPeriodUnit,
                profile,
                profileAgency,
                profileId,
                profileRemark,
                reqAcAltName,
                reqAllHazInfo,
                reqAmcStdInfo,
                reqCargoList,
                reqCargoPax,
                reqClass1Info,
                reqClass9Info,
                reqCrewComp,
                reqCrewDetail,
                reqCrewInfo,
                reqDiv1Info,
                reqDv,
                reqEntryExitCoord,
                reqFltInfo,
                reqFltPlanRoute,
                reqFundSource,
                reqHazInfo,
                reqIcao,
                reqPassportInfo,
                reqRaven,
                reqRepChange,
                reqTailNum,
                reqWeaponsInfo,
                undefinedCrewReporting,
                mutableMapOf(),
            )

            /**
             * Remarks concerning aircraft cargo and passenger information for this country profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun cargoPaxRemark(): Optional<String> = cargoPaxRemark.getOptional("cargoPaxRemark")

            /**
             * Identifier of the associated diplomatic clearance issued by the host country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun clearanceId(): Optional<String> = clearanceId.getOptional("clearanceId")

            /**
             * Remarks concerning crew information for this country profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun crewInfoRemark(): Optional<String> = crewInfoRemark.getOptional("crewInfoRemark")

            /**
             * Code denoting the status of the default diplomatic clearance (e.g., A for Approved
             * via APACS, E for Requested via email, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun defClearanceStatus(): Optional<String> =
                defClearanceStatus.getOptional("defClearanceStatus")

            /**
             * Remarks concerning the default entry point for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun defEntryRemark(): Optional<String> = defEntryRemark.getOptional("defEntryRemark")

            /**
             * Zulu default entry time for this country expressed in HH:MM format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun defEntryTime(): Optional<String> = defEntryTime.getOptional("defEntryTime")

            /**
             * Remarks concerning the default exit point for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun defExitRemark(): Optional<String> = defExitRemark.getOptional("defExitRemark")

            /**
             * Zulu default exit time for this country expressed in HH:MM format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun defExitTime(): Optional<String> = defExitTime.getOptional("defExitTime")

            /**
             * Remarks concerning flight information for this country profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fltInfoRemark(): Optional<String> = fltInfoRemark.getOptional("fltInfoRemark")

            /**
             * Remarks concerning hazardous material information for this country profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun hazInfoRemark(): Optional<String> = hazInfoRemark.getOptional("hazInfoRemark")

            /**
             * Flag indicating whether this is the default landing profile for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun landDefProf(): Optional<Boolean> = landDefProf.getOptional("landDefProf")

            /**
             * Amount of lead time required for an aircraft to land in this country. Units need to
             * be specified in the landLeadTimeUnit field.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun landLeadTime(): Optional<Int> = landLeadTime.getOptional("landLeadTime")

            /**
             * Remarks concerning the landing lead time required for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun landLeadTimeRemark(): Optional<String> =
                landLeadTimeRemark.getOptional("landLeadTimeRemark")

            /**
             * Unit of time specified for the landLeadTime field to indicate the landing lead time
             * required for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun landLeadTimeUnit(): Optional<String> =
                landLeadTimeUnit.getOptional("landLeadTimeUnit")

            /**
             * Amount of time before the landing valid period that an aircraft is allowed to land in
             * this country for this profile. The unit of time should be specified in the
             * landValidPeriodUnit field.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun landValidPeriodMinus(): Optional<Int> =
                landValidPeriodMinus.getOptional("landValidPeriodMinus")

            /**
             * Amount of time after the landing valid period that an aircraft is allowed to land in
             * this country for this profile. The unit of time should be specified in the
             * landValidPeriodUnit field.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun landValidPeriodPlus(): Optional<Int> =
                landValidPeriodPlus.getOptional("landValidPeriodPlus")

            /**
             * Remarks concerning the valid landing time period for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun landValidPeriodRemark(): Optional<String> =
                landValidPeriodRemark.getOptional("landValidPeriodRemark")

            /**
             * Unit of time specified for the landValidPeriodPlus and landValidPeriodMinus fields to
             * indicate the valid landing period for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun landValidPeriodUnit(): Optional<String> =
                landValidPeriodUnit.getOptional("landValidPeriodUnit")

            /**
             * Flag indicating whether this is the default overfly profile for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun overflyDefProf(): Optional<Boolean> = overflyDefProf.getOptional("overflyDefProf")

            /**
             * Amount of lead time required for an aircraft to enter and fly over the airspace of
             * this country. Units need to be specified in the overflyLeadTimeUnit field.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun overflyLeadTime(): Optional<Int> = overflyLeadTime.getOptional("overflyLeadTime")

            /**
             * Remarks concerning the overfly lead time required for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun overflyLeadTimeRemark(): Optional<String> =
                overflyLeadTimeRemark.getOptional("overflyLeadTimeRemark")

            /**
             * Unit of time specified for the overflyLeadTime field to indicate the overfly lead
             * time required for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun overflyLeadTimeUnit(): Optional<String> =
                overflyLeadTimeUnit.getOptional("overflyLeadTimeUnit")

            /**
             * Amount of time before the overfly valid period that an aircraft is allowed to fly
             * over this country for this profile. The unit of time should be specified in the
             * overflyValidPeriodUnit field.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun overflyValidPeriodMinus(): Optional<Int> =
                overflyValidPeriodMinus.getOptional("overflyValidPeriodMinus")

            /**
             * Amount of time after the overfly valid period that an aircraft is allowed to fly over
             * this country for this profile. The unit of time should be specified in the
             * overflyValidPeriodUnit field.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun overflyValidPeriodPlus(): Optional<Int> =
                overflyValidPeriodPlus.getOptional("overflyValidPeriodPlus")

            /**
             * Remarks concerning the valid overfly time period for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun overflyValidPeriodRemark(): Optional<String> =
                overflyValidPeriodRemark.getOptional("overflyValidPeriodRemark")

            /**
             * Unit of time specified for the overflyValidPeriodPlus and overflyValidPeriodMinus
             * fields to indicate the valid overfly period for this country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun overflyValidPeriodUnit(): Optional<String> =
                overflyValidPeriodUnit.getOptional("overflyValidPeriodUnit")

            /**
             * The diplomatic clearance profile name used within clearance management systems.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun profile(): Optional<String> = profile.getOptional("profile")

            /**
             * The agency to which this profile applies.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun profileAgency(): Optional<String> = profileAgency.getOptional("profileAgency")

            /**
             * Identifier of the diplomatic clearance country profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun profileId(): Optional<String> = profileId.getOptional("profileId")

            /**
             * Remarks concerning this country profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun profileRemark(): Optional<String> = profileRemark.getOptional("profileRemark")

            /**
             * Flag indicating whether alternate aircraft names are required to be reported to the
             * country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqAcAltName(): Optional<Boolean> = reqAcAltName.getOptional("reqACAltName")

            /**
             * Flag indicating whether all hazardous material information is required to be reported
             * to the country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqAllHazInfo(): Optional<Boolean> = reqAllHazInfo.getOptional("reqAllHazInfo")

            /**
             * Flag indicating whether standard AMC information is required to be reported to the
             * country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqAmcStdInfo(): Optional<Boolean> = reqAmcStdInfo.getOptional("reqAMCStdInfo")

            /**
             * Flag indicating whether a cargo list is required to be reported to the country using
             * this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqCargoList(): Optional<Boolean> = reqCargoList.getOptional("reqCargoList")

            /**
             * Flag indicating whether aircraft cargo and passenger information is required to be
             * reported to the country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqCargoPax(): Optional<Boolean> = reqCargoPax.getOptional("reqCargoPax")

            /**
             * Flag indicating whether Class 1 hazardous material information is required to be
             * reported to the country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqClass1Info(): Optional<Boolean> = reqClass1Info.getOptional("reqClass1Info")

            /**
             * Flag indicating whether Class 9 hazardous material information is required to be
             * reported to the country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqClass9Info(): Optional<Boolean> = reqClass9Info.getOptional("reqClass9Info")

            /**
             * Flag indicating whether the number of crew members on a flight is required to be
             * reported to the country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqCrewComp(): Optional<Boolean> = reqCrewComp.getOptional("reqCrewComp")

            /**
             * Flag indicating whether the names, ranks, and positions of crew members are required
             * to be reported to the country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqCrewDetail(): Optional<Boolean> = reqCrewDetail.getOptional("reqCrewDetail")

            /**
             * Flag indicating whether crew information is required to be reported to the country
             * using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqCrewInfo(): Optional<Boolean> = reqCrewInfo.getOptional("reqCrewInfo")

            /**
             * Flag indicating whether Division 1.1 hazardous material information is required to be
             * reported to the country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqDiv1Info(): Optional<Boolean> = reqDiv1Info.getOptional("reqDiv1Info")

            /**
             * Flag indicating whether distinguished visitors are required to be reported to the
             * country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqDv(): Optional<Boolean> = reqDv.getOptional("reqDV")

            /**
             * Flag indicating whether entry/exit coordinates need to be specified for this
             * diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqEntryExitCoord(): Optional<Boolean> =
                reqEntryExitCoord.getOptional("reqEntryExitCoord")

            /**
             * Flag indicating whether flight information is required to be reported to the country
             * using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqFltInfo(): Optional<Boolean> = reqFltInfo.getOptional("reqFltInfo")

            /**
             * Flag indicating whether a flight plan route is required to be reported to the country
             * using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqFltPlanRoute(): Optional<Boolean> =
                reqFltPlanRoute.getOptional("reqFltPlanRoute")

            /**
             * Flag indicating whether aviation funding sources are required to be reported to the
             * country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqFundSource(): Optional<Boolean> = reqFundSource.getOptional("reqFundSource")

            /**
             * Flag indicating whether hazardous material information is required to be reported to
             * the country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqHazInfo(): Optional<Boolean> = reqHazInfo.getOptional("reqHazInfo")

            /**
             * Flag indicating whether this diplomatic clearance profile applies to specific
             * ICAO(s). These specific ICAO(s) should be clarified in the fltInfoRemark field.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqIcao(): Optional<Boolean> = reqIcao.getOptional("reqICAO")

            /**
             * Flag indicating whether passport information is required to be reported to the
             * country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqPassportInfo(): Optional<Boolean> =
                reqPassportInfo.getOptional("reqPassportInfo")

            /**
             * Flag indicating whether ravens are required to be reported to the country using this
             * diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqRaven(): Optional<Boolean> = reqRaven.getOptional("reqRaven")

            /**
             * Flag indicating whether changes are required to be reported to the country using this
             * diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqRepChange(): Optional<Boolean> = reqRepChange.getOptional("reqRepChange")

            /**
             * Flag indicating whether an aircraft tail number is required to be reported to the
             * country using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqTailNum(): Optional<Boolean> = reqTailNum.getOptional("reqTailNum")

            /**
             * Flag indicating whether weapons information is required to be reported to the country
             * using this diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqWeaponsInfo(): Optional<Boolean> = reqWeaponsInfo.getOptional("reqWeaponsInfo")

            /**
             * Flag indicating whether crew reporting is undefined for the country using this
             * diplomatic clearance profile.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun undefinedCrewReporting(): Optional<Boolean> =
                undefinedCrewReporting.getOptional("undefinedCrewReporting")

            /**
             * Returns the raw JSON value of [cargoPaxRemark].
             *
             * Unlike [cargoPaxRemark], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cargoPaxRemark")
            @ExcludeMissing
            fun _cargoPaxRemark(): JsonField<String> = cargoPaxRemark

            /**
             * Returns the raw JSON value of [clearanceId].
             *
             * Unlike [clearanceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("clearanceId")
            @ExcludeMissing
            fun _clearanceId(): JsonField<String> = clearanceId

            /**
             * Returns the raw JSON value of [crewInfoRemark].
             *
             * Unlike [crewInfoRemark], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("crewInfoRemark")
            @ExcludeMissing
            fun _crewInfoRemark(): JsonField<String> = crewInfoRemark

            /**
             * Returns the raw JSON value of [defClearanceStatus].
             *
             * Unlike [defClearanceStatus], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("defClearanceStatus")
            @ExcludeMissing
            fun _defClearanceStatus(): JsonField<String> = defClearanceStatus

            /**
             * Returns the raw JSON value of [defEntryRemark].
             *
             * Unlike [defEntryRemark], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("defEntryRemark")
            @ExcludeMissing
            fun _defEntryRemark(): JsonField<String> = defEntryRemark

            /**
             * Returns the raw JSON value of [defEntryTime].
             *
             * Unlike [defEntryTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("defEntryTime")
            @ExcludeMissing
            fun _defEntryTime(): JsonField<String> = defEntryTime

            /**
             * Returns the raw JSON value of [defExitRemark].
             *
             * Unlike [defExitRemark], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("defExitRemark")
            @ExcludeMissing
            fun _defExitRemark(): JsonField<String> = defExitRemark

            /**
             * Returns the raw JSON value of [defExitTime].
             *
             * Unlike [defExitTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("defExitTime")
            @ExcludeMissing
            fun _defExitTime(): JsonField<String> = defExitTime

            /**
             * Returns the raw JSON value of [fltInfoRemark].
             *
             * Unlike [fltInfoRemark], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fltInfoRemark")
            @ExcludeMissing
            fun _fltInfoRemark(): JsonField<String> = fltInfoRemark

            /**
             * Returns the raw JSON value of [hazInfoRemark].
             *
             * Unlike [hazInfoRemark], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("hazInfoRemark")
            @ExcludeMissing
            fun _hazInfoRemark(): JsonField<String> = hazInfoRemark

            /**
             * Returns the raw JSON value of [landDefProf].
             *
             * Unlike [landDefProf], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("landDefProf")
            @ExcludeMissing
            fun _landDefProf(): JsonField<Boolean> = landDefProf

            /**
             * Returns the raw JSON value of [landLeadTime].
             *
             * Unlike [landLeadTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("landLeadTime")
            @ExcludeMissing
            fun _landLeadTime(): JsonField<Int> = landLeadTime

            /**
             * Returns the raw JSON value of [landLeadTimeRemark].
             *
             * Unlike [landLeadTimeRemark], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("landLeadTimeRemark")
            @ExcludeMissing
            fun _landLeadTimeRemark(): JsonField<String> = landLeadTimeRemark

            /**
             * Returns the raw JSON value of [landLeadTimeUnit].
             *
             * Unlike [landLeadTimeUnit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("landLeadTimeUnit")
            @ExcludeMissing
            fun _landLeadTimeUnit(): JsonField<String> = landLeadTimeUnit

            /**
             * Returns the raw JSON value of [landValidPeriodMinus].
             *
             * Unlike [landValidPeriodMinus], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("landValidPeriodMinus")
            @ExcludeMissing
            fun _landValidPeriodMinus(): JsonField<Int> = landValidPeriodMinus

            /**
             * Returns the raw JSON value of [landValidPeriodPlus].
             *
             * Unlike [landValidPeriodPlus], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("landValidPeriodPlus")
            @ExcludeMissing
            fun _landValidPeriodPlus(): JsonField<Int> = landValidPeriodPlus

            /**
             * Returns the raw JSON value of [landValidPeriodRemark].
             *
             * Unlike [landValidPeriodRemark], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("landValidPeriodRemark")
            @ExcludeMissing
            fun _landValidPeriodRemark(): JsonField<String> = landValidPeriodRemark

            /**
             * Returns the raw JSON value of [landValidPeriodUnit].
             *
             * Unlike [landValidPeriodUnit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("landValidPeriodUnit")
            @ExcludeMissing
            fun _landValidPeriodUnit(): JsonField<String> = landValidPeriodUnit

            /**
             * Returns the raw JSON value of [overflyDefProf].
             *
             * Unlike [overflyDefProf], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("overflyDefProf")
            @ExcludeMissing
            fun _overflyDefProf(): JsonField<Boolean> = overflyDefProf

            /**
             * Returns the raw JSON value of [overflyLeadTime].
             *
             * Unlike [overflyLeadTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("overflyLeadTime")
            @ExcludeMissing
            fun _overflyLeadTime(): JsonField<Int> = overflyLeadTime

            /**
             * Returns the raw JSON value of [overflyLeadTimeRemark].
             *
             * Unlike [overflyLeadTimeRemark], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("overflyLeadTimeRemark")
            @ExcludeMissing
            fun _overflyLeadTimeRemark(): JsonField<String> = overflyLeadTimeRemark

            /**
             * Returns the raw JSON value of [overflyLeadTimeUnit].
             *
             * Unlike [overflyLeadTimeUnit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("overflyLeadTimeUnit")
            @ExcludeMissing
            fun _overflyLeadTimeUnit(): JsonField<String> = overflyLeadTimeUnit

            /**
             * Returns the raw JSON value of [overflyValidPeriodMinus].
             *
             * Unlike [overflyValidPeriodMinus], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("overflyValidPeriodMinus")
            @ExcludeMissing
            fun _overflyValidPeriodMinus(): JsonField<Int> = overflyValidPeriodMinus

            /**
             * Returns the raw JSON value of [overflyValidPeriodPlus].
             *
             * Unlike [overflyValidPeriodPlus], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("overflyValidPeriodPlus")
            @ExcludeMissing
            fun _overflyValidPeriodPlus(): JsonField<Int> = overflyValidPeriodPlus

            /**
             * Returns the raw JSON value of [overflyValidPeriodRemark].
             *
             * Unlike [overflyValidPeriodRemark], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("overflyValidPeriodRemark")
            @ExcludeMissing
            fun _overflyValidPeriodRemark(): JsonField<String> = overflyValidPeriodRemark

            /**
             * Returns the raw JSON value of [overflyValidPeriodUnit].
             *
             * Unlike [overflyValidPeriodUnit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("overflyValidPeriodUnit")
            @ExcludeMissing
            fun _overflyValidPeriodUnit(): JsonField<String> = overflyValidPeriodUnit

            /**
             * Returns the raw JSON value of [profile].
             *
             * Unlike [profile], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonField<String> = profile

            /**
             * Returns the raw JSON value of [profileAgency].
             *
             * Unlike [profileAgency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("profileAgency")
            @ExcludeMissing
            fun _profileAgency(): JsonField<String> = profileAgency

            /**
             * Returns the raw JSON value of [profileId].
             *
             * Unlike [profileId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("profileId")
            @ExcludeMissing
            fun _profileId(): JsonField<String> = profileId

            /**
             * Returns the raw JSON value of [profileRemark].
             *
             * Unlike [profileRemark], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("profileRemark")
            @ExcludeMissing
            fun _profileRemark(): JsonField<String> = profileRemark

            /**
             * Returns the raw JSON value of [reqAcAltName].
             *
             * Unlike [reqAcAltName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqACAltName")
            @ExcludeMissing
            fun _reqAcAltName(): JsonField<Boolean> = reqAcAltName

            /**
             * Returns the raw JSON value of [reqAllHazInfo].
             *
             * Unlike [reqAllHazInfo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqAllHazInfo")
            @ExcludeMissing
            fun _reqAllHazInfo(): JsonField<Boolean> = reqAllHazInfo

            /**
             * Returns the raw JSON value of [reqAmcStdInfo].
             *
             * Unlike [reqAmcStdInfo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqAMCStdInfo")
            @ExcludeMissing
            fun _reqAmcStdInfo(): JsonField<Boolean> = reqAmcStdInfo

            /**
             * Returns the raw JSON value of [reqCargoList].
             *
             * Unlike [reqCargoList], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqCargoList")
            @ExcludeMissing
            fun _reqCargoList(): JsonField<Boolean> = reqCargoList

            /**
             * Returns the raw JSON value of [reqCargoPax].
             *
             * Unlike [reqCargoPax], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqCargoPax")
            @ExcludeMissing
            fun _reqCargoPax(): JsonField<Boolean> = reqCargoPax

            /**
             * Returns the raw JSON value of [reqClass1Info].
             *
             * Unlike [reqClass1Info], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqClass1Info")
            @ExcludeMissing
            fun _reqClass1Info(): JsonField<Boolean> = reqClass1Info

            /**
             * Returns the raw JSON value of [reqClass9Info].
             *
             * Unlike [reqClass9Info], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqClass9Info")
            @ExcludeMissing
            fun _reqClass9Info(): JsonField<Boolean> = reqClass9Info

            /**
             * Returns the raw JSON value of [reqCrewComp].
             *
             * Unlike [reqCrewComp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqCrewComp")
            @ExcludeMissing
            fun _reqCrewComp(): JsonField<Boolean> = reqCrewComp

            /**
             * Returns the raw JSON value of [reqCrewDetail].
             *
             * Unlike [reqCrewDetail], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqCrewDetail")
            @ExcludeMissing
            fun _reqCrewDetail(): JsonField<Boolean> = reqCrewDetail

            /**
             * Returns the raw JSON value of [reqCrewInfo].
             *
             * Unlike [reqCrewInfo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqCrewInfo")
            @ExcludeMissing
            fun _reqCrewInfo(): JsonField<Boolean> = reqCrewInfo

            /**
             * Returns the raw JSON value of [reqDiv1Info].
             *
             * Unlike [reqDiv1Info], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqDiv1Info")
            @ExcludeMissing
            fun _reqDiv1Info(): JsonField<Boolean> = reqDiv1Info

            /**
             * Returns the raw JSON value of [reqDv].
             *
             * Unlike [reqDv], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reqDV") @ExcludeMissing fun _reqDv(): JsonField<Boolean> = reqDv

            /**
             * Returns the raw JSON value of [reqEntryExitCoord].
             *
             * Unlike [reqEntryExitCoord], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reqEntryExitCoord")
            @ExcludeMissing
            fun _reqEntryExitCoord(): JsonField<Boolean> = reqEntryExitCoord

            /**
             * Returns the raw JSON value of [reqFltInfo].
             *
             * Unlike [reqFltInfo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqFltInfo")
            @ExcludeMissing
            fun _reqFltInfo(): JsonField<Boolean> = reqFltInfo

            /**
             * Returns the raw JSON value of [reqFltPlanRoute].
             *
             * Unlike [reqFltPlanRoute], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reqFltPlanRoute")
            @ExcludeMissing
            fun _reqFltPlanRoute(): JsonField<Boolean> = reqFltPlanRoute

            /**
             * Returns the raw JSON value of [reqFundSource].
             *
             * Unlike [reqFundSource], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqFundSource")
            @ExcludeMissing
            fun _reqFundSource(): JsonField<Boolean> = reqFundSource

            /**
             * Returns the raw JSON value of [reqHazInfo].
             *
             * Unlike [reqHazInfo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqHazInfo")
            @ExcludeMissing
            fun _reqHazInfo(): JsonField<Boolean> = reqHazInfo

            /**
             * Returns the raw JSON value of [reqIcao].
             *
             * Unlike [reqIcao], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reqICAO") @ExcludeMissing fun _reqIcao(): JsonField<Boolean> = reqIcao

            /**
             * Returns the raw JSON value of [reqPassportInfo].
             *
             * Unlike [reqPassportInfo], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reqPassportInfo")
            @ExcludeMissing
            fun _reqPassportInfo(): JsonField<Boolean> = reqPassportInfo

            /**
             * Returns the raw JSON value of [reqRaven].
             *
             * Unlike [reqRaven], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqRaven") @ExcludeMissing fun _reqRaven(): JsonField<Boolean> = reqRaven

            /**
             * Returns the raw JSON value of [reqRepChange].
             *
             * Unlike [reqRepChange], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqRepChange")
            @ExcludeMissing
            fun _reqRepChange(): JsonField<Boolean> = reqRepChange

            /**
             * Returns the raw JSON value of [reqTailNum].
             *
             * Unlike [reqTailNum], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqTailNum")
            @ExcludeMissing
            fun _reqTailNum(): JsonField<Boolean> = reqTailNum

            /**
             * Returns the raw JSON value of [reqWeaponsInfo].
             *
             * Unlike [reqWeaponsInfo], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reqWeaponsInfo")
            @ExcludeMissing
            fun _reqWeaponsInfo(): JsonField<Boolean> = reqWeaponsInfo

            /**
             * Returns the raw JSON value of [undefinedCrewReporting].
             *
             * Unlike [undefinedCrewReporting], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("undefinedCrewReporting")
            @ExcludeMissing
            fun _undefinedCrewReporting(): JsonField<Boolean> = undefinedCrewReporting

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
                 * [DiplomaticClearanceCountryProfile].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DiplomaticClearanceCountryProfile]. */
            class Builder internal constructor() {

                private var cargoPaxRemark: JsonField<String> = JsonMissing.of()
                private var clearanceId: JsonField<String> = JsonMissing.of()
                private var crewInfoRemark: JsonField<String> = JsonMissing.of()
                private var defClearanceStatus: JsonField<String> = JsonMissing.of()
                private var defEntryRemark: JsonField<String> = JsonMissing.of()
                private var defEntryTime: JsonField<String> = JsonMissing.of()
                private var defExitRemark: JsonField<String> = JsonMissing.of()
                private var defExitTime: JsonField<String> = JsonMissing.of()
                private var fltInfoRemark: JsonField<String> = JsonMissing.of()
                private var hazInfoRemark: JsonField<String> = JsonMissing.of()
                private var landDefProf: JsonField<Boolean> = JsonMissing.of()
                private var landLeadTime: JsonField<Int> = JsonMissing.of()
                private var landLeadTimeRemark: JsonField<String> = JsonMissing.of()
                private var landLeadTimeUnit: JsonField<String> = JsonMissing.of()
                private var landValidPeriodMinus: JsonField<Int> = JsonMissing.of()
                private var landValidPeriodPlus: JsonField<Int> = JsonMissing.of()
                private var landValidPeriodRemark: JsonField<String> = JsonMissing.of()
                private var landValidPeriodUnit: JsonField<String> = JsonMissing.of()
                private var overflyDefProf: JsonField<Boolean> = JsonMissing.of()
                private var overflyLeadTime: JsonField<Int> = JsonMissing.of()
                private var overflyLeadTimeRemark: JsonField<String> = JsonMissing.of()
                private var overflyLeadTimeUnit: JsonField<String> = JsonMissing.of()
                private var overflyValidPeriodMinus: JsonField<Int> = JsonMissing.of()
                private var overflyValidPeriodPlus: JsonField<Int> = JsonMissing.of()
                private var overflyValidPeriodRemark: JsonField<String> = JsonMissing.of()
                private var overflyValidPeriodUnit: JsonField<String> = JsonMissing.of()
                private var profile: JsonField<String> = JsonMissing.of()
                private var profileAgency: JsonField<String> = JsonMissing.of()
                private var profileId: JsonField<String> = JsonMissing.of()
                private var profileRemark: JsonField<String> = JsonMissing.of()
                private var reqAcAltName: JsonField<Boolean> = JsonMissing.of()
                private var reqAllHazInfo: JsonField<Boolean> = JsonMissing.of()
                private var reqAmcStdInfo: JsonField<Boolean> = JsonMissing.of()
                private var reqCargoList: JsonField<Boolean> = JsonMissing.of()
                private var reqCargoPax: JsonField<Boolean> = JsonMissing.of()
                private var reqClass1Info: JsonField<Boolean> = JsonMissing.of()
                private var reqClass9Info: JsonField<Boolean> = JsonMissing.of()
                private var reqCrewComp: JsonField<Boolean> = JsonMissing.of()
                private var reqCrewDetail: JsonField<Boolean> = JsonMissing.of()
                private var reqCrewInfo: JsonField<Boolean> = JsonMissing.of()
                private var reqDiv1Info: JsonField<Boolean> = JsonMissing.of()
                private var reqDv: JsonField<Boolean> = JsonMissing.of()
                private var reqEntryExitCoord: JsonField<Boolean> = JsonMissing.of()
                private var reqFltInfo: JsonField<Boolean> = JsonMissing.of()
                private var reqFltPlanRoute: JsonField<Boolean> = JsonMissing.of()
                private var reqFundSource: JsonField<Boolean> = JsonMissing.of()
                private var reqHazInfo: JsonField<Boolean> = JsonMissing.of()
                private var reqIcao: JsonField<Boolean> = JsonMissing.of()
                private var reqPassportInfo: JsonField<Boolean> = JsonMissing.of()
                private var reqRaven: JsonField<Boolean> = JsonMissing.of()
                private var reqRepChange: JsonField<Boolean> = JsonMissing.of()
                private var reqTailNum: JsonField<Boolean> = JsonMissing.of()
                private var reqWeaponsInfo: JsonField<Boolean> = JsonMissing.of()
                private var undefinedCrewReporting: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    diplomaticClearanceCountryProfile: DiplomaticClearanceCountryProfile
                ) = apply {
                    cargoPaxRemark = diplomaticClearanceCountryProfile.cargoPaxRemark
                    clearanceId = diplomaticClearanceCountryProfile.clearanceId
                    crewInfoRemark = diplomaticClearanceCountryProfile.crewInfoRemark
                    defClearanceStatus = diplomaticClearanceCountryProfile.defClearanceStatus
                    defEntryRemark = diplomaticClearanceCountryProfile.defEntryRemark
                    defEntryTime = diplomaticClearanceCountryProfile.defEntryTime
                    defExitRemark = diplomaticClearanceCountryProfile.defExitRemark
                    defExitTime = diplomaticClearanceCountryProfile.defExitTime
                    fltInfoRemark = diplomaticClearanceCountryProfile.fltInfoRemark
                    hazInfoRemark = diplomaticClearanceCountryProfile.hazInfoRemark
                    landDefProf = diplomaticClearanceCountryProfile.landDefProf
                    landLeadTime = diplomaticClearanceCountryProfile.landLeadTime
                    landLeadTimeRemark = diplomaticClearanceCountryProfile.landLeadTimeRemark
                    landLeadTimeUnit = diplomaticClearanceCountryProfile.landLeadTimeUnit
                    landValidPeriodMinus = diplomaticClearanceCountryProfile.landValidPeriodMinus
                    landValidPeriodPlus = diplomaticClearanceCountryProfile.landValidPeriodPlus
                    landValidPeriodRemark = diplomaticClearanceCountryProfile.landValidPeriodRemark
                    landValidPeriodUnit = diplomaticClearanceCountryProfile.landValidPeriodUnit
                    overflyDefProf = diplomaticClearanceCountryProfile.overflyDefProf
                    overflyLeadTime = diplomaticClearanceCountryProfile.overflyLeadTime
                    overflyLeadTimeRemark = diplomaticClearanceCountryProfile.overflyLeadTimeRemark
                    overflyLeadTimeUnit = diplomaticClearanceCountryProfile.overflyLeadTimeUnit
                    overflyValidPeriodMinus =
                        diplomaticClearanceCountryProfile.overflyValidPeriodMinus
                    overflyValidPeriodPlus =
                        diplomaticClearanceCountryProfile.overflyValidPeriodPlus
                    overflyValidPeriodRemark =
                        diplomaticClearanceCountryProfile.overflyValidPeriodRemark
                    overflyValidPeriodUnit =
                        diplomaticClearanceCountryProfile.overflyValidPeriodUnit
                    profile = diplomaticClearanceCountryProfile.profile
                    profileAgency = diplomaticClearanceCountryProfile.profileAgency
                    profileId = diplomaticClearanceCountryProfile.profileId
                    profileRemark = diplomaticClearanceCountryProfile.profileRemark
                    reqAcAltName = diplomaticClearanceCountryProfile.reqAcAltName
                    reqAllHazInfo = diplomaticClearanceCountryProfile.reqAllHazInfo
                    reqAmcStdInfo = diplomaticClearanceCountryProfile.reqAmcStdInfo
                    reqCargoList = diplomaticClearanceCountryProfile.reqCargoList
                    reqCargoPax = diplomaticClearanceCountryProfile.reqCargoPax
                    reqClass1Info = diplomaticClearanceCountryProfile.reqClass1Info
                    reqClass9Info = diplomaticClearanceCountryProfile.reqClass9Info
                    reqCrewComp = diplomaticClearanceCountryProfile.reqCrewComp
                    reqCrewDetail = diplomaticClearanceCountryProfile.reqCrewDetail
                    reqCrewInfo = diplomaticClearanceCountryProfile.reqCrewInfo
                    reqDiv1Info = diplomaticClearanceCountryProfile.reqDiv1Info
                    reqDv = diplomaticClearanceCountryProfile.reqDv
                    reqEntryExitCoord = diplomaticClearanceCountryProfile.reqEntryExitCoord
                    reqFltInfo = diplomaticClearanceCountryProfile.reqFltInfo
                    reqFltPlanRoute = diplomaticClearanceCountryProfile.reqFltPlanRoute
                    reqFundSource = diplomaticClearanceCountryProfile.reqFundSource
                    reqHazInfo = diplomaticClearanceCountryProfile.reqHazInfo
                    reqIcao = diplomaticClearanceCountryProfile.reqIcao
                    reqPassportInfo = diplomaticClearanceCountryProfile.reqPassportInfo
                    reqRaven = diplomaticClearanceCountryProfile.reqRaven
                    reqRepChange = diplomaticClearanceCountryProfile.reqRepChange
                    reqTailNum = diplomaticClearanceCountryProfile.reqTailNum
                    reqWeaponsInfo = diplomaticClearanceCountryProfile.reqWeaponsInfo
                    undefinedCrewReporting =
                        diplomaticClearanceCountryProfile.undefinedCrewReporting
                    additionalProperties =
                        diplomaticClearanceCountryProfile.additionalProperties.toMutableMap()
                }

                /**
                 * Remarks concerning aircraft cargo and passenger information for this country
                 * profile.
                 */
                fun cargoPaxRemark(cargoPaxRemark: String) =
                    cargoPaxRemark(JsonField.of(cargoPaxRemark))

                /**
                 * Sets [Builder.cargoPaxRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cargoPaxRemark] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cargoPaxRemark(cargoPaxRemark: JsonField<String>) = apply {
                    this.cargoPaxRemark = cargoPaxRemark
                }

                /** Identifier of the associated diplomatic clearance issued by the host country. */
                fun clearanceId(clearanceId: String) = clearanceId(JsonField.of(clearanceId))

                /**
                 * Sets [Builder.clearanceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clearanceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clearanceId(clearanceId: JsonField<String>) = apply {
                    this.clearanceId = clearanceId
                }

                /** Remarks concerning crew information for this country profile. */
                fun crewInfoRemark(crewInfoRemark: String) =
                    crewInfoRemark(JsonField.of(crewInfoRemark))

                /**
                 * Sets [Builder.crewInfoRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.crewInfoRemark] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun crewInfoRemark(crewInfoRemark: JsonField<String>) = apply {
                    this.crewInfoRemark = crewInfoRemark
                }

                /**
                 * Code denoting the status of the default diplomatic clearance (e.g., A for
                 * Approved via APACS, E for Requested via email, etc.).
                 */
                fun defClearanceStatus(defClearanceStatus: String) =
                    defClearanceStatus(JsonField.of(defClearanceStatus))

                /**
                 * Sets [Builder.defClearanceStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.defClearanceStatus] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun defClearanceStatus(defClearanceStatus: JsonField<String>) = apply {
                    this.defClearanceStatus = defClearanceStatus
                }

                /** Remarks concerning the default entry point for this country. */
                fun defEntryRemark(defEntryRemark: String) =
                    defEntryRemark(JsonField.of(defEntryRemark))

                /**
                 * Sets [Builder.defEntryRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.defEntryRemark] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun defEntryRemark(defEntryRemark: JsonField<String>) = apply {
                    this.defEntryRemark = defEntryRemark
                }

                /** Zulu default entry time for this country expressed in HH:MM format. */
                fun defEntryTime(defEntryTime: String) = defEntryTime(JsonField.of(defEntryTime))

                /**
                 * Sets [Builder.defEntryTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.defEntryTime] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun defEntryTime(defEntryTime: JsonField<String>) = apply {
                    this.defEntryTime = defEntryTime
                }

                /** Remarks concerning the default exit point for this country. */
                fun defExitRemark(defExitRemark: String) =
                    defExitRemark(JsonField.of(defExitRemark))

                /**
                 * Sets [Builder.defExitRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.defExitRemark] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun defExitRemark(defExitRemark: JsonField<String>) = apply {
                    this.defExitRemark = defExitRemark
                }

                /** Zulu default exit time for this country expressed in HH:MM format. */
                fun defExitTime(defExitTime: String) = defExitTime(JsonField.of(defExitTime))

                /**
                 * Sets [Builder.defExitTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.defExitTime] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun defExitTime(defExitTime: JsonField<String>) = apply {
                    this.defExitTime = defExitTime
                }

                /** Remarks concerning flight information for this country profile. */
                fun fltInfoRemark(fltInfoRemark: String) =
                    fltInfoRemark(JsonField.of(fltInfoRemark))

                /**
                 * Sets [Builder.fltInfoRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fltInfoRemark] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fltInfoRemark(fltInfoRemark: JsonField<String>) = apply {
                    this.fltInfoRemark = fltInfoRemark
                }

                /** Remarks concerning hazardous material information for this country profile. */
                fun hazInfoRemark(hazInfoRemark: String) =
                    hazInfoRemark(JsonField.of(hazInfoRemark))

                /**
                 * Sets [Builder.hazInfoRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hazInfoRemark] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hazInfoRemark(hazInfoRemark: JsonField<String>) = apply {
                    this.hazInfoRemark = hazInfoRemark
                }

                /** Flag indicating whether this is the default landing profile for this country. */
                fun landDefProf(landDefProf: Boolean) = landDefProf(JsonField.of(landDefProf))

                /**
                 * Sets [Builder.landDefProf] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.landDefProf] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun landDefProf(landDefProf: JsonField<Boolean>) = apply {
                    this.landDefProf = landDefProf
                }

                /**
                 * Amount of lead time required for an aircraft to land in this country. Units need
                 * to be specified in the landLeadTimeUnit field.
                 */
                fun landLeadTime(landLeadTime: Int) = landLeadTime(JsonField.of(landLeadTime))

                /**
                 * Sets [Builder.landLeadTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.landLeadTime] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun landLeadTime(landLeadTime: JsonField<Int>) = apply {
                    this.landLeadTime = landLeadTime
                }

                /** Remarks concerning the landing lead time required for this country. */
                fun landLeadTimeRemark(landLeadTimeRemark: String) =
                    landLeadTimeRemark(JsonField.of(landLeadTimeRemark))

                /**
                 * Sets [Builder.landLeadTimeRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.landLeadTimeRemark] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun landLeadTimeRemark(landLeadTimeRemark: JsonField<String>) = apply {
                    this.landLeadTimeRemark = landLeadTimeRemark
                }

                /**
                 * Unit of time specified for the landLeadTime field to indicate the landing lead
                 * time required for this country.
                 */
                fun landLeadTimeUnit(landLeadTimeUnit: String) =
                    landLeadTimeUnit(JsonField.of(landLeadTimeUnit))

                /**
                 * Sets [Builder.landLeadTimeUnit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.landLeadTimeUnit] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun landLeadTimeUnit(landLeadTimeUnit: JsonField<String>) = apply {
                    this.landLeadTimeUnit = landLeadTimeUnit
                }

                /**
                 * Amount of time before the landing valid period that an aircraft is allowed to
                 * land in this country for this profile. The unit of time should be specified in
                 * the landValidPeriodUnit field.
                 */
                fun landValidPeriodMinus(landValidPeriodMinus: Int) =
                    landValidPeriodMinus(JsonField.of(landValidPeriodMinus))

                /**
                 * Sets [Builder.landValidPeriodMinus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.landValidPeriodMinus] with a well-typed [Int]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun landValidPeriodMinus(landValidPeriodMinus: JsonField<Int>) = apply {
                    this.landValidPeriodMinus = landValidPeriodMinus
                }

                /**
                 * Amount of time after the landing valid period that an aircraft is allowed to land
                 * in this country for this profile. The unit of time should be specified in the
                 * landValidPeriodUnit field.
                 */
                fun landValidPeriodPlus(landValidPeriodPlus: Int) =
                    landValidPeriodPlus(JsonField.of(landValidPeriodPlus))

                /**
                 * Sets [Builder.landValidPeriodPlus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.landValidPeriodPlus] with a well-typed [Int]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun landValidPeriodPlus(landValidPeriodPlus: JsonField<Int>) = apply {
                    this.landValidPeriodPlus = landValidPeriodPlus
                }

                /** Remarks concerning the valid landing time period for this country. */
                fun landValidPeriodRemark(landValidPeriodRemark: String) =
                    landValidPeriodRemark(JsonField.of(landValidPeriodRemark))

                /**
                 * Sets [Builder.landValidPeriodRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.landValidPeriodRemark] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun landValidPeriodRemark(landValidPeriodRemark: JsonField<String>) = apply {
                    this.landValidPeriodRemark = landValidPeriodRemark
                }

                /**
                 * Unit of time specified for the landValidPeriodPlus and landValidPeriodMinus
                 * fields to indicate the valid landing period for this country.
                 */
                fun landValidPeriodUnit(landValidPeriodUnit: String) =
                    landValidPeriodUnit(JsonField.of(landValidPeriodUnit))

                /**
                 * Sets [Builder.landValidPeriodUnit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.landValidPeriodUnit] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun landValidPeriodUnit(landValidPeriodUnit: JsonField<String>) = apply {
                    this.landValidPeriodUnit = landValidPeriodUnit
                }

                /** Flag indicating whether this is the default overfly profile for this country. */
                fun overflyDefProf(overflyDefProf: Boolean) =
                    overflyDefProf(JsonField.of(overflyDefProf))

                /**
                 * Sets [Builder.overflyDefProf] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.overflyDefProf] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun overflyDefProf(overflyDefProf: JsonField<Boolean>) = apply {
                    this.overflyDefProf = overflyDefProf
                }

                /**
                 * Amount of lead time required for an aircraft to enter and fly over the airspace
                 * of this country. Units need to be specified in the overflyLeadTimeUnit field.
                 */
                fun overflyLeadTime(overflyLeadTime: Int) =
                    overflyLeadTime(JsonField.of(overflyLeadTime))

                /**
                 * Sets [Builder.overflyLeadTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.overflyLeadTime] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun overflyLeadTime(overflyLeadTime: JsonField<Int>) = apply {
                    this.overflyLeadTime = overflyLeadTime
                }

                /** Remarks concerning the overfly lead time required for this country. */
                fun overflyLeadTimeRemark(overflyLeadTimeRemark: String) =
                    overflyLeadTimeRemark(JsonField.of(overflyLeadTimeRemark))

                /**
                 * Sets [Builder.overflyLeadTimeRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.overflyLeadTimeRemark] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun overflyLeadTimeRemark(overflyLeadTimeRemark: JsonField<String>) = apply {
                    this.overflyLeadTimeRemark = overflyLeadTimeRemark
                }

                /**
                 * Unit of time specified for the overflyLeadTime field to indicate the overfly lead
                 * time required for this country.
                 */
                fun overflyLeadTimeUnit(overflyLeadTimeUnit: String) =
                    overflyLeadTimeUnit(JsonField.of(overflyLeadTimeUnit))

                /**
                 * Sets [Builder.overflyLeadTimeUnit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.overflyLeadTimeUnit] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun overflyLeadTimeUnit(overflyLeadTimeUnit: JsonField<String>) = apply {
                    this.overflyLeadTimeUnit = overflyLeadTimeUnit
                }

                /**
                 * Amount of time before the overfly valid period that an aircraft is allowed to fly
                 * over this country for this profile. The unit of time should be specified in the
                 * overflyValidPeriodUnit field.
                 */
                fun overflyValidPeriodMinus(overflyValidPeriodMinus: Int) =
                    overflyValidPeriodMinus(JsonField.of(overflyValidPeriodMinus))

                /**
                 * Sets [Builder.overflyValidPeriodMinus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.overflyValidPeriodMinus] with a well-typed [Int]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun overflyValidPeriodMinus(overflyValidPeriodMinus: JsonField<Int>) = apply {
                    this.overflyValidPeriodMinus = overflyValidPeriodMinus
                }

                /**
                 * Amount of time after the overfly valid period that an aircraft is allowed to fly
                 * over this country for this profile. The unit of time should be specified in the
                 * overflyValidPeriodUnit field.
                 */
                fun overflyValidPeriodPlus(overflyValidPeriodPlus: Int) =
                    overflyValidPeriodPlus(JsonField.of(overflyValidPeriodPlus))

                /**
                 * Sets [Builder.overflyValidPeriodPlus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.overflyValidPeriodPlus] with a well-typed [Int]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun overflyValidPeriodPlus(overflyValidPeriodPlus: JsonField<Int>) = apply {
                    this.overflyValidPeriodPlus = overflyValidPeriodPlus
                }

                /** Remarks concerning the valid overfly time period for this country. */
                fun overflyValidPeriodRemark(overflyValidPeriodRemark: String) =
                    overflyValidPeriodRemark(JsonField.of(overflyValidPeriodRemark))

                /**
                 * Sets [Builder.overflyValidPeriodRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.overflyValidPeriodRemark] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun overflyValidPeriodRemark(overflyValidPeriodRemark: JsonField<String>) = apply {
                    this.overflyValidPeriodRemark = overflyValidPeriodRemark
                }

                /**
                 * Unit of time specified for the overflyValidPeriodPlus and overflyValidPeriodMinus
                 * fields to indicate the valid overfly period for this country.
                 */
                fun overflyValidPeriodUnit(overflyValidPeriodUnit: String) =
                    overflyValidPeriodUnit(JsonField.of(overflyValidPeriodUnit))

                /**
                 * Sets [Builder.overflyValidPeriodUnit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.overflyValidPeriodUnit] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun overflyValidPeriodUnit(overflyValidPeriodUnit: JsonField<String>) = apply {
                    this.overflyValidPeriodUnit = overflyValidPeriodUnit
                }

                /**
                 * The diplomatic clearance profile name used within clearance management systems.
                 */
                fun profile(profile: String) = profile(JsonField.of(profile))

                /**
                 * Sets [Builder.profile] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.profile] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun profile(profile: JsonField<String>) = apply { this.profile = profile }

                /** The agency to which this profile applies. */
                fun profileAgency(profileAgency: String) =
                    profileAgency(JsonField.of(profileAgency))

                /**
                 * Sets [Builder.profileAgency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.profileAgency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun profileAgency(profileAgency: JsonField<String>) = apply {
                    this.profileAgency = profileAgency
                }

                /** Identifier of the diplomatic clearance country profile. */
                fun profileId(profileId: String) = profileId(JsonField.of(profileId))

                /**
                 * Sets [Builder.profileId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.profileId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun profileId(profileId: JsonField<String>) = apply { this.profileId = profileId }

                /** Remarks concerning this country profile. */
                fun profileRemark(profileRemark: String) =
                    profileRemark(JsonField.of(profileRemark))

                /**
                 * Sets [Builder.profileRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.profileRemark] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun profileRemark(profileRemark: JsonField<String>) = apply {
                    this.profileRemark = profileRemark
                }

                /**
                 * Flag indicating whether alternate aircraft names are required to be reported to
                 * the country using this diplomatic clearance profile.
                 */
                fun reqAcAltName(reqAcAltName: Boolean) = reqAcAltName(JsonField.of(reqAcAltName))

                /**
                 * Sets [Builder.reqAcAltName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqAcAltName] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqAcAltName(reqAcAltName: JsonField<Boolean>) = apply {
                    this.reqAcAltName = reqAcAltName
                }

                /**
                 * Flag indicating whether all hazardous material information is required to be
                 * reported to the country using this diplomatic clearance profile.
                 */
                fun reqAllHazInfo(reqAllHazInfo: Boolean) =
                    reqAllHazInfo(JsonField.of(reqAllHazInfo))

                /**
                 * Sets [Builder.reqAllHazInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqAllHazInfo] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqAllHazInfo(reqAllHazInfo: JsonField<Boolean>) = apply {
                    this.reqAllHazInfo = reqAllHazInfo
                }

                /**
                 * Flag indicating whether standard AMC information is required to be reported to
                 * the country using this diplomatic clearance profile.
                 */
                fun reqAmcStdInfo(reqAmcStdInfo: Boolean) =
                    reqAmcStdInfo(JsonField.of(reqAmcStdInfo))

                /**
                 * Sets [Builder.reqAmcStdInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqAmcStdInfo] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqAmcStdInfo(reqAmcStdInfo: JsonField<Boolean>) = apply {
                    this.reqAmcStdInfo = reqAmcStdInfo
                }

                /**
                 * Flag indicating whether a cargo list is required to be reported to the country
                 * using this diplomatic clearance profile.
                 */
                fun reqCargoList(reqCargoList: Boolean) = reqCargoList(JsonField.of(reqCargoList))

                /**
                 * Sets [Builder.reqCargoList] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqCargoList] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqCargoList(reqCargoList: JsonField<Boolean>) = apply {
                    this.reqCargoList = reqCargoList
                }

                /**
                 * Flag indicating whether aircraft cargo and passenger information is required to
                 * be reported to the country using this diplomatic clearance profile.
                 */
                fun reqCargoPax(reqCargoPax: Boolean) = reqCargoPax(JsonField.of(reqCargoPax))

                /**
                 * Sets [Builder.reqCargoPax] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqCargoPax] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqCargoPax(reqCargoPax: JsonField<Boolean>) = apply {
                    this.reqCargoPax = reqCargoPax
                }

                /**
                 * Flag indicating whether Class 1 hazardous material information is required to be
                 * reported to the country using this diplomatic clearance profile.
                 */
                fun reqClass1Info(reqClass1Info: Boolean) =
                    reqClass1Info(JsonField.of(reqClass1Info))

                /**
                 * Sets [Builder.reqClass1Info] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqClass1Info] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqClass1Info(reqClass1Info: JsonField<Boolean>) = apply {
                    this.reqClass1Info = reqClass1Info
                }

                /**
                 * Flag indicating whether Class 9 hazardous material information is required to be
                 * reported to the country using this diplomatic clearance profile.
                 */
                fun reqClass9Info(reqClass9Info: Boolean) =
                    reqClass9Info(JsonField.of(reqClass9Info))

                /**
                 * Sets [Builder.reqClass9Info] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqClass9Info] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqClass9Info(reqClass9Info: JsonField<Boolean>) = apply {
                    this.reqClass9Info = reqClass9Info
                }

                /**
                 * Flag indicating whether the number of crew members on a flight is required to be
                 * reported to the country using this diplomatic clearance profile.
                 */
                fun reqCrewComp(reqCrewComp: Boolean) = reqCrewComp(JsonField.of(reqCrewComp))

                /**
                 * Sets [Builder.reqCrewComp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqCrewComp] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqCrewComp(reqCrewComp: JsonField<Boolean>) = apply {
                    this.reqCrewComp = reqCrewComp
                }

                /**
                 * Flag indicating whether the names, ranks, and positions of crew members are
                 * required to be reported to the country using this diplomatic clearance profile.
                 */
                fun reqCrewDetail(reqCrewDetail: Boolean) =
                    reqCrewDetail(JsonField.of(reqCrewDetail))

                /**
                 * Sets [Builder.reqCrewDetail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqCrewDetail] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqCrewDetail(reqCrewDetail: JsonField<Boolean>) = apply {
                    this.reqCrewDetail = reqCrewDetail
                }

                /**
                 * Flag indicating whether crew information is required to be reported to the
                 * country using this diplomatic clearance profile.
                 */
                fun reqCrewInfo(reqCrewInfo: Boolean) = reqCrewInfo(JsonField.of(reqCrewInfo))

                /**
                 * Sets [Builder.reqCrewInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqCrewInfo] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqCrewInfo(reqCrewInfo: JsonField<Boolean>) = apply {
                    this.reqCrewInfo = reqCrewInfo
                }

                /**
                 * Flag indicating whether Division 1.1 hazardous material information is required
                 * to be reported to the country using this diplomatic clearance profile.
                 */
                fun reqDiv1Info(reqDiv1Info: Boolean) = reqDiv1Info(JsonField.of(reqDiv1Info))

                /**
                 * Sets [Builder.reqDiv1Info] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqDiv1Info] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqDiv1Info(reqDiv1Info: JsonField<Boolean>) = apply {
                    this.reqDiv1Info = reqDiv1Info
                }

                /**
                 * Flag indicating whether distinguished visitors are required to be reported to the
                 * country using this diplomatic clearance profile.
                 */
                fun reqDv(reqDv: Boolean) = reqDv(JsonField.of(reqDv))

                /**
                 * Sets [Builder.reqDv] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqDv] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqDv(reqDv: JsonField<Boolean>) = apply { this.reqDv = reqDv }

                /**
                 * Flag indicating whether entry/exit coordinates need to be specified for this
                 * diplomatic clearance profile.
                 */
                fun reqEntryExitCoord(reqEntryExitCoord: Boolean) =
                    reqEntryExitCoord(JsonField.of(reqEntryExitCoord))

                /**
                 * Sets [Builder.reqEntryExitCoord] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqEntryExitCoord] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun reqEntryExitCoord(reqEntryExitCoord: JsonField<Boolean>) = apply {
                    this.reqEntryExitCoord = reqEntryExitCoord
                }

                /**
                 * Flag indicating whether flight information is required to be reported to the
                 * country using this diplomatic clearance profile.
                 */
                fun reqFltInfo(reqFltInfo: Boolean) = reqFltInfo(JsonField.of(reqFltInfo))

                /**
                 * Sets [Builder.reqFltInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqFltInfo] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqFltInfo(reqFltInfo: JsonField<Boolean>) = apply {
                    this.reqFltInfo = reqFltInfo
                }

                /**
                 * Flag indicating whether a flight plan route is required to be reported to the
                 * country using this diplomatic clearance profile.
                 */
                fun reqFltPlanRoute(reqFltPlanRoute: Boolean) =
                    reqFltPlanRoute(JsonField.of(reqFltPlanRoute))

                /**
                 * Sets [Builder.reqFltPlanRoute] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqFltPlanRoute] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun reqFltPlanRoute(reqFltPlanRoute: JsonField<Boolean>) = apply {
                    this.reqFltPlanRoute = reqFltPlanRoute
                }

                /**
                 * Flag indicating whether aviation funding sources are required to be reported to
                 * the country using this diplomatic clearance profile.
                 */
                fun reqFundSource(reqFundSource: Boolean) =
                    reqFundSource(JsonField.of(reqFundSource))

                /**
                 * Sets [Builder.reqFundSource] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqFundSource] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqFundSource(reqFundSource: JsonField<Boolean>) = apply {
                    this.reqFundSource = reqFundSource
                }

                /**
                 * Flag indicating whether hazardous material information is required to be reported
                 * to the country using this diplomatic clearance profile.
                 */
                fun reqHazInfo(reqHazInfo: Boolean) = reqHazInfo(JsonField.of(reqHazInfo))

                /**
                 * Sets [Builder.reqHazInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqHazInfo] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqHazInfo(reqHazInfo: JsonField<Boolean>) = apply {
                    this.reqHazInfo = reqHazInfo
                }

                /**
                 * Flag indicating whether this diplomatic clearance profile applies to specific
                 * ICAO(s). These specific ICAO(s) should be clarified in the fltInfoRemark field.
                 */
                fun reqIcao(reqIcao: Boolean) = reqIcao(JsonField.of(reqIcao))

                /**
                 * Sets [Builder.reqIcao] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqIcao] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqIcao(reqIcao: JsonField<Boolean>) = apply { this.reqIcao = reqIcao }

                /**
                 * Flag indicating whether passport information is required to be reported to the
                 * country using this diplomatic clearance profile.
                 */
                fun reqPassportInfo(reqPassportInfo: Boolean) =
                    reqPassportInfo(JsonField.of(reqPassportInfo))

                /**
                 * Sets [Builder.reqPassportInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqPassportInfo] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun reqPassportInfo(reqPassportInfo: JsonField<Boolean>) = apply {
                    this.reqPassportInfo = reqPassportInfo
                }

                /**
                 * Flag indicating whether ravens are required to be reported to the country using
                 * this diplomatic clearance profile.
                 */
                fun reqRaven(reqRaven: Boolean) = reqRaven(JsonField.of(reqRaven))

                /**
                 * Sets [Builder.reqRaven] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqRaven] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqRaven(reqRaven: JsonField<Boolean>) = apply { this.reqRaven = reqRaven }

                /**
                 * Flag indicating whether changes are required to be reported to the country using
                 * this diplomatic clearance profile.
                 */
                fun reqRepChange(reqRepChange: Boolean) = reqRepChange(JsonField.of(reqRepChange))

                /**
                 * Sets [Builder.reqRepChange] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqRepChange] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqRepChange(reqRepChange: JsonField<Boolean>) = apply {
                    this.reqRepChange = reqRepChange
                }

                /**
                 * Flag indicating whether an aircraft tail number is required to be reported to the
                 * country using this diplomatic clearance profile.
                 */
                fun reqTailNum(reqTailNum: Boolean) = reqTailNum(JsonField.of(reqTailNum))

                /**
                 * Sets [Builder.reqTailNum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqTailNum] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqTailNum(reqTailNum: JsonField<Boolean>) = apply {
                    this.reqTailNum = reqTailNum
                }

                /**
                 * Flag indicating whether weapons information is required to be reported to the
                 * country using this diplomatic clearance profile.
                 */
                fun reqWeaponsInfo(reqWeaponsInfo: Boolean) =
                    reqWeaponsInfo(JsonField.of(reqWeaponsInfo))

                /**
                 * Sets [Builder.reqWeaponsInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqWeaponsInfo] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun reqWeaponsInfo(reqWeaponsInfo: JsonField<Boolean>) = apply {
                    this.reqWeaponsInfo = reqWeaponsInfo
                }

                /**
                 * Flag indicating whether crew reporting is undefined for the country using this
                 * diplomatic clearance profile.
                 */
                fun undefinedCrewReporting(undefinedCrewReporting: Boolean) =
                    undefinedCrewReporting(JsonField.of(undefinedCrewReporting))

                /**
                 * Sets [Builder.undefinedCrewReporting] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.undefinedCrewReporting] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun undefinedCrewReporting(undefinedCrewReporting: JsonField<Boolean>) = apply {
                    this.undefinedCrewReporting = undefinedCrewReporting
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAlladditional_properties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAlladditional_properties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DiplomaticClearanceCountryProfile].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DiplomaticClearanceCountryProfile =
                    DiplomaticClearanceCountryProfile(
                        cargoPaxRemark,
                        clearanceId,
                        crewInfoRemark,
                        defClearanceStatus,
                        defEntryRemark,
                        defEntryTime,
                        defExitRemark,
                        defExitTime,
                        fltInfoRemark,
                        hazInfoRemark,
                        landDefProf,
                        landLeadTime,
                        landLeadTimeRemark,
                        landLeadTimeUnit,
                        landValidPeriodMinus,
                        landValidPeriodPlus,
                        landValidPeriodRemark,
                        landValidPeriodUnit,
                        overflyDefProf,
                        overflyLeadTime,
                        overflyLeadTimeRemark,
                        overflyLeadTimeUnit,
                        overflyValidPeriodMinus,
                        overflyValidPeriodPlus,
                        overflyValidPeriodRemark,
                        overflyValidPeriodUnit,
                        profile,
                        profileAgency,
                        profileId,
                        profileRemark,
                        reqAcAltName,
                        reqAllHazInfo,
                        reqAmcStdInfo,
                        reqCargoList,
                        reqCargoPax,
                        reqClass1Info,
                        reqClass9Info,
                        reqCrewComp,
                        reqCrewDetail,
                        reqCrewInfo,
                        reqDiv1Info,
                        reqDv,
                        reqEntryExitCoord,
                        reqFltInfo,
                        reqFltPlanRoute,
                        reqFundSource,
                        reqHazInfo,
                        reqIcao,
                        reqPassportInfo,
                        reqRaven,
                        reqRepChange,
                        reqTailNum,
                        reqWeaponsInfo,
                        undefinedCrewReporting,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DiplomaticClearanceCountryProfile = apply {
                if (validated) {
                    return@apply
                }

                cargoPaxRemark()
                clearanceId()
                crewInfoRemark()
                defClearanceStatus()
                defEntryRemark()
                defEntryTime()
                defExitRemark()
                defExitTime()
                fltInfoRemark()
                hazInfoRemark()
                landDefProf()
                landLeadTime()
                landLeadTimeRemark()
                landLeadTimeUnit()
                landValidPeriodMinus()
                landValidPeriodPlus()
                landValidPeriodRemark()
                landValidPeriodUnit()
                overflyDefProf()
                overflyLeadTime()
                overflyLeadTimeRemark()
                overflyLeadTimeUnit()
                overflyValidPeriodMinus()
                overflyValidPeriodPlus()
                overflyValidPeriodRemark()
                overflyValidPeriodUnit()
                profile()
                profileAgency()
                profileId()
                profileRemark()
                reqAcAltName()
                reqAllHazInfo()
                reqAmcStdInfo()
                reqCargoList()
                reqCargoPax()
                reqClass1Info()
                reqClass9Info()
                reqCrewComp()
                reqCrewDetail()
                reqCrewInfo()
                reqDiv1Info()
                reqDv()
                reqEntryExitCoord()
                reqFltInfo()
                reqFltPlanRoute()
                reqFundSource()
                reqHazInfo()
                reqIcao()
                reqPassportInfo()
                reqRaven()
                reqRepChange()
                reqTailNum()
                reqWeaponsInfo()
                undefinedCrewReporting()
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
                (if (cargoPaxRemark.asKnown().isPresent) 1 else 0) +
                    (if (clearanceId.asKnown().isPresent) 1 else 0) +
                    (if (crewInfoRemark.asKnown().isPresent) 1 else 0) +
                    (if (defClearanceStatus.asKnown().isPresent) 1 else 0) +
                    (if (defEntryRemark.asKnown().isPresent) 1 else 0) +
                    (if (defEntryTime.asKnown().isPresent) 1 else 0) +
                    (if (defExitRemark.asKnown().isPresent) 1 else 0) +
                    (if (defExitTime.asKnown().isPresent) 1 else 0) +
                    (if (fltInfoRemark.asKnown().isPresent) 1 else 0) +
                    (if (hazInfoRemark.asKnown().isPresent) 1 else 0) +
                    (if (landDefProf.asKnown().isPresent) 1 else 0) +
                    (if (landLeadTime.asKnown().isPresent) 1 else 0) +
                    (if (landLeadTimeRemark.asKnown().isPresent) 1 else 0) +
                    (if (landLeadTimeUnit.asKnown().isPresent) 1 else 0) +
                    (if (landValidPeriodMinus.asKnown().isPresent) 1 else 0) +
                    (if (landValidPeriodPlus.asKnown().isPresent) 1 else 0) +
                    (if (landValidPeriodRemark.asKnown().isPresent) 1 else 0) +
                    (if (landValidPeriodUnit.asKnown().isPresent) 1 else 0) +
                    (if (overflyDefProf.asKnown().isPresent) 1 else 0) +
                    (if (overflyLeadTime.asKnown().isPresent) 1 else 0) +
                    (if (overflyLeadTimeRemark.asKnown().isPresent) 1 else 0) +
                    (if (overflyLeadTimeUnit.asKnown().isPresent) 1 else 0) +
                    (if (overflyValidPeriodMinus.asKnown().isPresent) 1 else 0) +
                    (if (overflyValidPeriodPlus.asKnown().isPresent) 1 else 0) +
                    (if (overflyValidPeriodRemark.asKnown().isPresent) 1 else 0) +
                    (if (overflyValidPeriodUnit.asKnown().isPresent) 1 else 0) +
                    (if (profile.asKnown().isPresent) 1 else 0) +
                    (if (profileAgency.asKnown().isPresent) 1 else 0) +
                    (if (profileId.asKnown().isPresent) 1 else 0) +
                    (if (profileRemark.asKnown().isPresent) 1 else 0) +
                    (if (reqAcAltName.asKnown().isPresent) 1 else 0) +
                    (if (reqAllHazInfo.asKnown().isPresent) 1 else 0) +
                    (if (reqAmcStdInfo.asKnown().isPresent) 1 else 0) +
                    (if (reqCargoList.asKnown().isPresent) 1 else 0) +
                    (if (reqCargoPax.asKnown().isPresent) 1 else 0) +
                    (if (reqClass1Info.asKnown().isPresent) 1 else 0) +
                    (if (reqClass9Info.asKnown().isPresent) 1 else 0) +
                    (if (reqCrewComp.asKnown().isPresent) 1 else 0) +
                    (if (reqCrewDetail.asKnown().isPresent) 1 else 0) +
                    (if (reqCrewInfo.asKnown().isPresent) 1 else 0) +
                    (if (reqDiv1Info.asKnown().isPresent) 1 else 0) +
                    (if (reqDv.asKnown().isPresent) 1 else 0) +
                    (if (reqEntryExitCoord.asKnown().isPresent) 1 else 0) +
                    (if (reqFltInfo.asKnown().isPresent) 1 else 0) +
                    (if (reqFltPlanRoute.asKnown().isPresent) 1 else 0) +
                    (if (reqFundSource.asKnown().isPresent) 1 else 0) +
                    (if (reqHazInfo.asKnown().isPresent) 1 else 0) +
                    (if (reqIcao.asKnown().isPresent) 1 else 0) +
                    (if (reqPassportInfo.asKnown().isPresent) 1 else 0) +
                    (if (reqRaven.asKnown().isPresent) 1 else 0) +
                    (if (reqRepChange.asKnown().isPresent) 1 else 0) +
                    (if (reqTailNum.asKnown().isPresent) 1 else 0) +
                    (if (reqWeaponsInfo.asKnown().isPresent) 1 else 0) +
                    (if (undefinedCrewReporting.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DiplomaticClearanceCountryProfile &&
                    cargoPaxRemark == other.cargoPaxRemark &&
                    clearanceId == other.clearanceId &&
                    crewInfoRemark == other.crewInfoRemark &&
                    defClearanceStatus == other.defClearanceStatus &&
                    defEntryRemark == other.defEntryRemark &&
                    defEntryTime == other.defEntryTime &&
                    defExitRemark == other.defExitRemark &&
                    defExitTime == other.defExitTime &&
                    fltInfoRemark == other.fltInfoRemark &&
                    hazInfoRemark == other.hazInfoRemark &&
                    landDefProf == other.landDefProf &&
                    landLeadTime == other.landLeadTime &&
                    landLeadTimeRemark == other.landLeadTimeRemark &&
                    landLeadTimeUnit == other.landLeadTimeUnit &&
                    landValidPeriodMinus == other.landValidPeriodMinus &&
                    landValidPeriodPlus == other.landValidPeriodPlus &&
                    landValidPeriodRemark == other.landValidPeriodRemark &&
                    landValidPeriodUnit == other.landValidPeriodUnit &&
                    overflyDefProf == other.overflyDefProf &&
                    overflyLeadTime == other.overflyLeadTime &&
                    overflyLeadTimeRemark == other.overflyLeadTimeRemark &&
                    overflyLeadTimeUnit == other.overflyLeadTimeUnit &&
                    overflyValidPeriodMinus == other.overflyValidPeriodMinus &&
                    overflyValidPeriodPlus == other.overflyValidPeriodPlus &&
                    overflyValidPeriodRemark == other.overflyValidPeriodRemark &&
                    overflyValidPeriodUnit == other.overflyValidPeriodUnit &&
                    profile == other.profile &&
                    profileAgency == other.profileAgency &&
                    profileId == other.profileId &&
                    profileRemark == other.profileRemark &&
                    reqAcAltName == other.reqAcAltName &&
                    reqAllHazInfo == other.reqAllHazInfo &&
                    reqAmcStdInfo == other.reqAmcStdInfo &&
                    reqCargoList == other.reqCargoList &&
                    reqCargoPax == other.reqCargoPax &&
                    reqClass1Info == other.reqClass1Info &&
                    reqClass9Info == other.reqClass9Info &&
                    reqCrewComp == other.reqCrewComp &&
                    reqCrewDetail == other.reqCrewDetail &&
                    reqCrewInfo == other.reqCrewInfo &&
                    reqDiv1Info == other.reqDiv1Info &&
                    reqDv == other.reqDv &&
                    reqEntryExitCoord == other.reqEntryExitCoord &&
                    reqFltInfo == other.reqFltInfo &&
                    reqFltPlanRoute == other.reqFltPlanRoute &&
                    reqFundSource == other.reqFundSource &&
                    reqHazInfo == other.reqHazInfo &&
                    reqIcao == other.reqIcao &&
                    reqPassportInfo == other.reqPassportInfo &&
                    reqRaven == other.reqRaven &&
                    reqRepChange == other.reqRepChange &&
                    reqTailNum == other.reqTailNum &&
                    reqWeaponsInfo == other.reqWeaponsInfo &&
                    undefinedCrewReporting == other.undefinedCrewReporting &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cargoPaxRemark,
                    clearanceId,
                    crewInfoRemark,
                    defClearanceStatus,
                    defEntryRemark,
                    defEntryTime,
                    defExitRemark,
                    defExitTime,
                    fltInfoRemark,
                    hazInfoRemark,
                    landDefProf,
                    landLeadTime,
                    landLeadTimeRemark,
                    landLeadTimeUnit,
                    landValidPeriodMinus,
                    landValidPeriodPlus,
                    landValidPeriodRemark,
                    landValidPeriodUnit,
                    overflyDefProf,
                    overflyLeadTime,
                    overflyLeadTimeRemark,
                    overflyLeadTimeUnit,
                    overflyValidPeriodMinus,
                    overflyValidPeriodPlus,
                    overflyValidPeriodRemark,
                    overflyValidPeriodUnit,
                    profile,
                    profileAgency,
                    profileId,
                    profileRemark,
                    reqAcAltName,
                    reqAllHazInfo,
                    reqAmcStdInfo,
                    reqCargoList,
                    reqCargoPax,
                    reqClass1Info,
                    reqClass9Info,
                    reqCrewComp,
                    reqCrewDetail,
                    reqCrewInfo,
                    reqDiv1Info,
                    reqDv,
                    reqEntryExitCoord,
                    reqFltInfo,
                    reqFltPlanRoute,
                    reqFundSource,
                    reqHazInfo,
                    reqIcao,
                    reqPassportInfo,
                    reqRaven,
                    reqRepChange,
                    reqTailNum,
                    reqWeaponsInfo,
                    undefinedCrewReporting,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DiplomaticClearanceCountryProfile{cargoPaxRemark=$cargoPaxRemark, clearanceId=$clearanceId, crewInfoRemark=$crewInfoRemark, defClearanceStatus=$defClearanceStatus, defEntryRemark=$defEntryRemark, defEntryTime=$defEntryTime, defExitRemark=$defExitRemark, defExitTime=$defExitTime, fltInfoRemark=$fltInfoRemark, hazInfoRemark=$hazInfoRemark, landDefProf=$landDefProf, landLeadTime=$landLeadTime, landLeadTimeRemark=$landLeadTimeRemark, landLeadTimeUnit=$landLeadTimeUnit, landValidPeriodMinus=$landValidPeriodMinus, landValidPeriodPlus=$landValidPeriodPlus, landValidPeriodRemark=$landValidPeriodRemark, landValidPeriodUnit=$landValidPeriodUnit, overflyDefProf=$overflyDefProf, overflyLeadTime=$overflyLeadTime, overflyLeadTimeRemark=$overflyLeadTimeRemark, overflyLeadTimeUnit=$overflyLeadTimeUnit, overflyValidPeriodMinus=$overflyValidPeriodMinus, overflyValidPeriodPlus=$overflyValidPeriodPlus, overflyValidPeriodRemark=$overflyValidPeriodRemark, overflyValidPeriodUnit=$overflyValidPeriodUnit, profile=$profile, profileAgency=$profileAgency, profileId=$profileId, profileRemark=$profileRemark, reqAcAltName=$reqAcAltName, reqAllHazInfo=$reqAllHazInfo, reqAmcStdInfo=$reqAmcStdInfo, reqCargoList=$reqCargoList, reqCargoPax=$reqCargoPax, reqClass1Info=$reqClass1Info, reqClass9Info=$reqClass9Info, reqCrewComp=$reqCrewComp, reqCrewDetail=$reqCrewDetail, reqCrewInfo=$reqCrewInfo, reqDiv1Info=$reqDiv1Info, reqDv=$reqDv, reqEntryExitCoord=$reqEntryExitCoord, reqFltInfo=$reqFltInfo, reqFltPlanRoute=$reqFltPlanRoute, reqFundSource=$reqFundSource, reqHazInfo=$reqHazInfo, reqIcao=$reqIcao, reqPassportInfo=$reqPassportInfo, reqRaven=$reqRaven, reqRepChange=$reqRepChange, reqTailNum=$reqTailNum, reqWeaponsInfo=$reqWeaponsInfo, undefinedCrewReporting=$undefinedCrewReporting, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                countryCode == other.countryCode &&
                dataMode == other.dataMode &&
                lastChangedDate == other.lastChangedDate &&
                source == other.source &&
                id == other.id &&
                acceptsDms == other.acceptsDms &&
                acceptsEmail == other.acceptsEmail &&
                acceptsFax == other.acceptsFax &&
                acceptsSiprNet == other.acceptsSiprNet &&
                agency == other.agency &&
                altCountryCode == other.altCountryCode &&
                closeTime == other.closeTime &&
                countryId == other.countryId &&
                countryName == other.countryName &&
                countryRemark == other.countryRemark &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                diplomaticClearanceCountryContacts == other.diplomaticClearanceCountryContacts &&
                diplomaticClearanceCountryEntryExitPoints ==
                    other.diplomaticClearanceCountryEntryExitPoints &&
                diplomaticClearanceCountryProfiles == other.diplomaticClearanceCountryProfiles &&
                existingProfile == other.existingProfile &&
                gmtOffset == other.gmtOffset &&
                officeName == other.officeName &&
                officePoc == other.officePoc &&
                officeRemark == other.officeRemark &&
                openFri == other.openFri &&
                openMon == other.openMon &&
                openSat == other.openSat &&
                openSun == other.openSun &&
                openThu == other.openThu &&
                openTime == other.openTime &&
                openTue == other.openTue &&
                openWed == other.openWed &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                sourceDl == other.sourceDl &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                countryCode,
                dataMode,
                lastChangedDate,
                source,
                id,
                acceptsDms,
                acceptsEmail,
                acceptsFax,
                acceptsSiprNet,
                agency,
                altCountryCode,
                closeTime,
                countryId,
                countryName,
                countryRemark,
                createdAt,
                createdBy,
                diplomaticClearanceCountryContacts,
                diplomaticClearanceCountryEntryExitPoints,
                diplomaticClearanceCountryProfiles,
                existingProfile,
                gmtOffset,
                officeName,
                officePoc,
                officeRemark,
                openFri,
                openMon,
                openSat,
                openSun,
                openThu,
                openTime,
                openTue,
                openWed,
                origin,
                origNetwork,
                sourceDl,
                updatedAt,
                updatedBy,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, countryCode=$countryCode, dataMode=$dataMode, lastChangedDate=$lastChangedDate, source=$source, id=$id, acceptsDms=$acceptsDms, acceptsEmail=$acceptsEmail, acceptsFax=$acceptsFax, acceptsSiprNet=$acceptsSiprNet, agency=$agency, altCountryCode=$altCountryCode, closeTime=$closeTime, countryId=$countryId, countryName=$countryName, countryRemark=$countryRemark, createdAt=$createdAt, createdBy=$createdBy, diplomaticClearanceCountryContacts=$diplomaticClearanceCountryContacts, diplomaticClearanceCountryEntryExitPoints=$diplomaticClearanceCountryEntryExitPoints, diplomaticClearanceCountryProfiles=$diplomaticClearanceCountryProfiles, existingProfile=$existingProfile, gmtOffset=$gmtOffset, officeName=$officeName, officePoc=$officePoc, officeRemark=$officeRemark, openFri=$openFri, openMon=$openMon, openSat=$openSat, openSun=$openSun, openThu=$openThu, openTime=$openTime, openTue=$openTue, openWed=$openWed, origin=$origin, origNetwork=$origNetwork, sourceDl=$sourceDl, updatedAt=$updatedAt, updatedBy=$updatedBy}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CountryCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CountryCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

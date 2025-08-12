// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.dropzone

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import com.unifieddatalibrary.api.models.dropzone.DropzoneUnvalidatedPublishParams
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Service operation to take multiple dropzone records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
class DropzoneUnvalidatedPublishParams private constructor(
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
         * Returns a mutable builder for constructing an instance of [DropzoneUnvalidatedPublishParams].
         *
         * The following fields are required:
         *
         * ```java
         * .body()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [DropzoneUnvalidatedPublishParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dropzoneUnvalidatedPublishParams: DropzoneUnvalidatedPublishParams) =
            apply {
                body = dropzoneUnvalidatedPublishParams.body.toMutableList()
                additionalHeaders = dropzoneUnvalidatedPublishParams.additionalHeaders.toBuilder()
                additionalQueryParams = dropzoneUnvalidatedPublishParams.additionalQueryParams.toBuilder()
            }

        fun body(body: List<Body>) =
            apply {
                this.body = body.toMutableList()
            }

        /**
         * Adds a single [Body] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: Body) =
            apply {
                this.body = (this.body ?: mutableListOf()).apply { add(body) }
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        /**
         * Returns an immutable instance of [DropzoneUnvalidatedPublishParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DropzoneUnvalidatedPublishParams =
            DropzoneUnvalidatedPublishParams(
              checkRequired(
                "body", body
              ).toImmutable(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Properties and characteristics of a Drop Zone, including name, location, shape, type code, survey date, and remarks. */
    class Body @JsonCreator private constructor(
        @JsonProperty("classificationMarking") @ExcludeMissing private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("lat") @ExcludeMissing private val lat: JsonField<Double>,
        @JsonProperty("lon") @ExcludeMissing private val lon: JsonField<Double>,
        @JsonProperty("name") @ExcludeMissing private val name: JsonField<String>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("altCountryCode") @ExcludeMissing private val altCountryCode: JsonField<String>,
        @JsonProperty("altCountryName") @ExcludeMissing private val altCountryName: JsonField<String>,
        @JsonProperty("approvalDate") @ExcludeMissing private val approvalDate: JsonField<OffsetDateTime>,
        @JsonProperty("code") @ExcludeMissing private val code: JsonField<String>,
        @JsonProperty("countryCode") @ExcludeMissing private val countryCode: JsonField<String>,
        @JsonProperty("countryName") @ExcludeMissing private val countryName: JsonField<String>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("expirationDate") @ExcludeMissing private val expirationDate: JsonField<OffsetDateTime>,
        @JsonProperty("extIdentifier") @ExcludeMissing private val extIdentifier: JsonField<String>,
        @JsonProperty("idSite") @ExcludeMissing private val idSite: JsonField<String>,
        @JsonProperty("lastUpdate") @ExcludeMissing private val lastUpdate: JsonField<OffsetDateTime>,
        @JsonProperty("length") @ExcludeMissing private val length: JsonField<Double>,
        @JsonProperty("majcom") @ExcludeMissing private val majcom: JsonField<String>,
        @JsonProperty("nearestLoc") @ExcludeMissing private val nearestLoc: JsonField<String>,
        @JsonProperty("operationalApprovalDate") @ExcludeMissing private val operationalApprovalDate: JsonField<OffsetDateTime>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("pointName") @ExcludeMissing private val pointName: JsonField<String>,
        @JsonProperty("radius") @ExcludeMissing private val radius: JsonField<Double>,
        @JsonProperty("recertDate") @ExcludeMissing private val recertDate: JsonField<OffsetDateTime>,
        @JsonProperty("remark") @ExcludeMissing private val remark: JsonField<String>,
        @JsonProperty("sourceDL") @ExcludeMissing private val sourceDl: JsonField<String>,
        @JsonProperty("stateAbbr") @ExcludeMissing private val stateAbbr: JsonField<String>,
        @JsonProperty("stateName") @ExcludeMissing private val stateName: JsonField<String>,
        @JsonProperty("surveyDate") @ExcludeMissing private val surveyDate: JsonField<OffsetDateTime>,
        @JsonProperty("width") @ExcludeMissing private val width: JsonField<Double>,
        @JsonProperty("zarId") @ExcludeMissing private val zarId: JsonField<String>,

    ) {

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
         * WGS84 latitude of the drop zone, in degrees. -90 to 90 degrees (negative values south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lat(): Double = lat.getRequired("lat")

        /**
         * WGS84 longitude of the drop zone, in degrees. -180 to 180 degrees (negative values west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lon(): Double = lon.getRequired("lon")

        /**
         * The name of the drop zone.
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
         * Specifies an alternate country code for the drop zone if the data provider code is not part of an official Country Code standard such as ISO-3166 or FIPS. This field will be set to the value provided by the source and should be used for all Queries specifying a Country Code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun altCountryCode(): Optional<String> = altCountryCode.getOptional("altCountryCode")

        /**
         * Specifies the country name associated with the source provided alternate country code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun altCountryName(): Optional<String> = altCountryName.getOptional("altCountryName")

        /**
         * The date the drop zone survey was approved, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun approvalDate(): Optional<OffsetDateTime> = approvalDate.getOptional("approvalDate")

        /**
         * The type code for the drop zone.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

        /**
         * The Country Code where the drop zone is located. This value is typically the ISO 3166 Alpha-2 two-character country code, however it can also represent various consortiums that do not appear in the ISO document. The code must correspond to an existing country in the UDL’s country API. Call udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or alternate code values that exist for the specified country code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

        /**
         * The country name of the location for the drop zone.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun countryName(): Optional<String> = countryName.getOptional("countryName")

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
         * The survey expiration date of the drop zone, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun expirationDate(): Optional<OffsetDateTime> = expirationDate.getOptional("expirationDate")

        /**
         * The external identifier assigned to the drop zone.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun extIdentifier(): Optional<String> = extIdentifier.getOptional("extIdentifier")

        /**
         * The ID of the site associated with the drop zone.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun idSite(): Optional<String> = idSite.getOptional("idSite")

        /**
         * Last time the drop zone information was updated, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun lastUpdate(): Optional<OffsetDateTime> = lastUpdate.getOptional("lastUpdate")

        /**
         * The length dimension of the drop zone in meters for non-circular drop zones.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun length(): Optional<Double> = length.getOptional("length")

        /**
         * The Major Command (MAJCOM) responsible for management of the drop zone.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun majcom(): Optional<String> = majcom.getOptional("majcom")

        /**
         * The nearest reference location to the drop zone.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun nearestLoc(): Optional<String> = nearestLoc.getOptional("nearestLoc")

        /**
         * The approval date for the drop zone by an air drop authority certifying operational usage, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun operationalApprovalDate(): Optional<OffsetDateTime> = operationalApprovalDate.getOptional("operationalApprovalDate")

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
         * The name assigned to the drop zone point.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun pointName(): Optional<String> = pointName.getOptional("pointName")

        /**
         * The radius dimension of the drop zone in meters for circular drop zones.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun radius(): Optional<Double> = radius.getOptional("radius")

        /**
         * The date the drop zone was recertified, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun recertDate(): Optional<OffsetDateTime> = recertDate.getOptional("recertDate")

        /**
         * Remarks concerning the drop zone.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun remark(): Optional<String> = remark.getOptional("remark")

        /**
         * The source data library from which this record was received. This could be a remote or tactical UDL or another data library. If null, the record should be assumed to have originated from the primary Enterprise UDL.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

        /**
         * The US alphabetical code for the state where the drop zone is located.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun stateAbbr(): Optional<String> = stateAbbr.getOptional("stateAbbr")

        /**
         * The name of the state where the drop zone is located.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun stateName(): Optional<String> = stateName.getOptional("stateName")

        /**
         * The date the drop zone survey was performed, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun surveyDate(): Optional<OffsetDateTime> = surveyDate.getOptional("surveyDate")

        /**
         * The width dimension of the drop zone in meters for non-circular drop zones.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun width(): Optional<Double> = width.getOptional("width")

        /**
         * The identifier of the Zone Availability Report (ZAR) for the drop zone.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun zarId(): Optional<String> = zarId.getOptional("zarId")

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
         * Returns the raw JSON value of [lat].
         *
         * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lat")
        @ExcludeMissing
        fun _lat(): JsonField<Double> = lat

        /**
         * Returns the raw JSON value of [lon].
         *
         * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lon")
        @ExcludeMissing
        fun _lon(): JsonField<Double> = lon

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
         * Returns the raw JSON value of [altCountryCode].
         *
         * Unlike [altCountryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("altCountryCode")
        @ExcludeMissing
        fun _altCountryCode(): JsonField<String> = altCountryCode

        /**
         * Returns the raw JSON value of [altCountryName].
         *
         * Unlike [altCountryName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("altCountryName")
        @ExcludeMissing
        fun _altCountryName(): JsonField<String> = altCountryName

        /**
         * Returns the raw JSON value of [approvalDate].
         *
         * Unlike [approvalDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approvalDate")
        @ExcludeMissing
        fun _approvalDate(): JsonField<OffsetDateTime> = approvalDate

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code")
        @ExcludeMissing
        fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryCode")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [countryName].
         *
         * Unlike [countryName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryName")
        @ExcludeMissing
        fun _countryName(): JsonField<String> = countryName

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
         * Returns the raw JSON value of [expirationDate].
         *
         * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expirationDate")
        @ExcludeMissing
        fun _expirationDate(): JsonField<OffsetDateTime> = expirationDate

        /**
         * Returns the raw JSON value of [extIdentifier].
         *
         * Unlike [extIdentifier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("extIdentifier")
        @ExcludeMissing
        fun _extIdentifier(): JsonField<String> = extIdentifier

        /**
         * Returns the raw JSON value of [idSite].
         *
         * Unlike [idSite], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSite")
        @ExcludeMissing
        fun _idSite(): JsonField<String> = idSite

        /**
         * Returns the raw JSON value of [lastUpdate].
         *
         * Unlike [lastUpdate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastUpdate")
        @ExcludeMissing
        fun _lastUpdate(): JsonField<OffsetDateTime> = lastUpdate

        /**
         * Returns the raw JSON value of [length].
         *
         * Unlike [length], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("length")
        @ExcludeMissing
        fun _length(): JsonField<Double> = length

        /**
         * Returns the raw JSON value of [majcom].
         *
         * Unlike [majcom], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("majcom")
        @ExcludeMissing
        fun _majcom(): JsonField<String> = majcom

        /**
         * Returns the raw JSON value of [nearestLoc].
         *
         * Unlike [nearestLoc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nearestLoc")
        @ExcludeMissing
        fun _nearestLoc(): JsonField<String> = nearestLoc

        /**
         * Returns the raw JSON value of [operationalApprovalDate].
         *
         * Unlike [operationalApprovalDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operationalApprovalDate")
        @ExcludeMissing
        fun _operationalApprovalDate(): JsonField<OffsetDateTime> = operationalApprovalDate

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
         * Returns the raw JSON value of [pointName].
         *
         * Unlike [pointName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pointName")
        @ExcludeMissing
        fun _pointName(): JsonField<String> = pointName

        /**
         * Returns the raw JSON value of [radius].
         *
         * Unlike [radius], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("radius")
        @ExcludeMissing
        fun _radius(): JsonField<Double> = radius

        /**
         * Returns the raw JSON value of [recertDate].
         *
         * Unlike [recertDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recertDate")
        @ExcludeMissing
        fun _recertDate(): JsonField<OffsetDateTime> = recertDate

        /**
         * Returns the raw JSON value of [remark].
         *
         * Unlike [remark], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("remark")
        @ExcludeMissing
        fun _remark(): JsonField<String> = remark

        /**
         * Returns the raw JSON value of [sourceDl].
         *
         * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDL")
        @ExcludeMissing
        fun _sourceDl(): JsonField<String> = sourceDl

        /**
         * Returns the raw JSON value of [stateAbbr].
         *
         * Unlike [stateAbbr], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stateAbbr")
        @ExcludeMissing
        fun _stateAbbr(): JsonField<String> = stateAbbr

        /**
         * Returns the raw JSON value of [stateName].
         *
         * Unlike [stateName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stateName")
        @ExcludeMissing
        fun _stateName(): JsonField<String> = stateName

        /**
         * Returns the raw JSON value of [surveyDate].
         *
         * Unlike [surveyDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("surveyDate")
        @ExcludeMissing
        fun _surveyDate(): JsonField<OffsetDateTime> = surveyDate

        /**
         * Returns the raw JSON value of [width].
         *
         * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("width")
        @ExcludeMissing
        fun _width(): JsonField<Double> = width

        /**
         * Returns the raw JSON value of [zarId].
         *
         * Unlike [zarId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zarId")
        @ExcludeMissing
        fun _zarId(): JsonField<String> = zarId

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .lat()
             * .lon()
             * .name()
             * .source()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var lat: JsonField<Double>? = null
            private var lon: JsonField<Double>? = null
            private var name: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var altCountryCode: JsonField<String> = JsonMissing.of()
            private var altCountryName: JsonField<String> = JsonMissing.of()
            private var approvalDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var countryName: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var expirationDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var extIdentifier: JsonField<String> = JsonMissing.of()
            private var idSite: JsonField<String> = JsonMissing.of()
            private var lastUpdate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var length: JsonField<Double> = JsonMissing.of()
            private var majcom: JsonField<String> = JsonMissing.of()
            private var nearestLoc: JsonField<String> = JsonMissing.of()
            private var operationalApprovalDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var pointName: JsonField<String> = JsonMissing.of()
            private var radius: JsonField<Double> = JsonMissing.of()
            private var recertDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var remark: JsonField<String> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var stateAbbr: JsonField<String> = JsonMissing.of()
            private var stateName: JsonField<String> = JsonMissing.of()
            private var surveyDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var width: JsonField<Double> = JsonMissing.of()
            private var zarId: JsonField<String> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) =
                apply {
                    classificationMarking = body.classificationMarking
                    dataMode = body.dataMode
                    lat = body.lat
                    lon = body.lon
                    name = body.name
                    source = body.source
                    id = body.id
                    altCountryCode = body.altCountryCode
                    altCountryName = body.altCountryName
                    approvalDate = body.approvalDate
                    code = body.code
                    countryCode = body.countryCode
                    countryName = body.countryName
                    createdAt = body.createdAt
                    createdBy = body.createdBy
                    expirationDate = body.expirationDate
                    extIdentifier = body.extIdentifier
                    idSite = body.idSite
                    lastUpdate = body.lastUpdate
                    length = body.length
                    majcom = body.majcom
                    nearestLoc = body.nearestLoc
                    operationalApprovalDate = body.operationalApprovalDate
                    origin = body.origin
                    origNetwork = body.origNetwork
                    pointName = body.pointName
                    radius = body.radius
                    recertDate = body.recertDate
                    remark = body.remark
                    sourceDl = body.sourceDl
                    stateAbbr = body.stateAbbr
                    stateName = body.stateName
                    surveyDate = body.surveyDate
                    width = body.width
                    zarId = body.zarId
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

            /** WGS84 latitude of the drop zone, in degrees. -90 to 90 degrees (negative values south of equator). */
            fun lat(lat: Double) = lat(JsonField.of(lat))

            /**
             * Sets [Builder.lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lat] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lat(lat: JsonField<Double>) =
                apply {
                    this.lat = lat
                }

            /** WGS84 longitude of the drop zone, in degrees. -180 to 180 degrees (negative values west of Prime Meridian). */
            fun lon(lon: Double) = lon(JsonField.of(lon))

            /**
             * Sets [Builder.lon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lon] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lon(lon: JsonField<Double>) =
                apply {
                    this.lon = lon
                }

            /** The name of the drop zone. */
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

            /** Specifies an alternate country code for the drop zone if the data provider code is not part of an official Country Code standard such as ISO-3166 or FIPS. This field will be set to the value provided by the source and should be used for all Queries specifying a Country Code. */
            fun altCountryCode(altCountryCode: String) = altCountryCode(JsonField.of(altCountryCode))

            /**
             * Sets [Builder.altCountryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altCountryCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altCountryCode(altCountryCode: JsonField<String>) =
                apply {
                    this.altCountryCode = altCountryCode
                }

            /** Specifies the country name associated with the source provided alternate country code. */
            fun altCountryName(altCountryName: String) = altCountryName(JsonField.of(altCountryName))

            /**
             * Sets [Builder.altCountryName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altCountryName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altCountryName(altCountryName: JsonField<String>) =
                apply {
                    this.altCountryName = altCountryName
                }

            /** The date the drop zone survey was approved, in ISO 8601 UTC format with millisecond precision. */
            fun approvalDate(approvalDate: OffsetDateTime) = approvalDate(JsonField.of(approvalDate))

            /**
             * Sets [Builder.approvalDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approvalDate] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approvalDate(approvalDate: JsonField<OffsetDateTime>) =
                apply {
                    this.approvalDate = approvalDate
                }

            /** The type code for the drop zone. */
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

            /** The Country Code where the drop zone is located. This value is typically the ISO 3166 Alpha-2 two-character country code, however it can also represent various consortiums that do not appear in the ISO document. The code must correspond to an existing country in the UDL’s country API. Call udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or alternate code values that exist for the specified country code. */
            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) =
                apply {
                    this.countryCode = countryCode
                }

            /** The country name of the location for the drop zone. */
            fun countryName(countryName: String) = countryName(JsonField.of(countryName))

            /**
             * Sets [Builder.countryName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryName(countryName: JsonField<String>) =
                apply {
                    this.countryName = countryName
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

            /** The survey expiration date of the drop zone, in ISO 8601 UTC format with millisecond precision. */
            fun expirationDate(expirationDate: OffsetDateTime) = expirationDate(JsonField.of(expirationDate))

            /**
             * Sets [Builder.expirationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationDate] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expirationDate(expirationDate: JsonField<OffsetDateTime>) =
                apply {
                    this.expirationDate = expirationDate
                }

            /** The external identifier assigned to the drop zone. */
            fun extIdentifier(extIdentifier: String) = extIdentifier(JsonField.of(extIdentifier))

            /**
             * Sets [Builder.extIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extIdentifier] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extIdentifier(extIdentifier: JsonField<String>) =
                apply {
                    this.extIdentifier = extIdentifier
                }

            /** The ID of the site associated with the drop zone. */
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

            /** Last time the drop zone information was updated, in ISO 8601 UTC format with millisecond precision. */
            fun lastUpdate(lastUpdate: OffsetDateTime) = lastUpdate(JsonField.of(lastUpdate))

            /**
             * Sets [Builder.lastUpdate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastUpdate] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastUpdate(lastUpdate: JsonField<OffsetDateTime>) =
                apply {
                    this.lastUpdate = lastUpdate
                }

            /** The length dimension of the drop zone in meters for non-circular drop zones. */
            fun length(length: Double) = length(JsonField.of(length))

            /**
             * Sets [Builder.length] to an arbitrary JSON value.
             *
             * You should usually call [Builder.length] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun length(length: JsonField<Double>) =
                apply {
                    this.length = length
                }

            /** The Major Command (MAJCOM) responsible for management of the drop zone. */
            fun majcom(majcom: String) = majcom(JsonField.of(majcom))

            /**
             * Sets [Builder.majcom] to an arbitrary JSON value.
             *
             * You should usually call [Builder.majcom] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun majcom(majcom: JsonField<String>) =
                apply {
                    this.majcom = majcom
                }

            /** The nearest reference location to the drop zone. */
            fun nearestLoc(nearestLoc: String) = nearestLoc(JsonField.of(nearestLoc))

            /**
             * Sets [Builder.nearestLoc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nearestLoc] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nearestLoc(nearestLoc: JsonField<String>) =
                apply {
                    this.nearestLoc = nearestLoc
                }

            /** The approval date for the drop zone by an air drop authority certifying operational usage, in ISO 8601 UTC format with millisecond precision. */
            fun operationalApprovalDate(operationalApprovalDate: OffsetDateTime) = operationalApprovalDate(JsonField.of(operationalApprovalDate))

            /**
             * Sets [Builder.operationalApprovalDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operationalApprovalDate] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operationalApprovalDate(operationalApprovalDate: JsonField<OffsetDateTime>) =
                apply {
                    this.operationalApprovalDate = operationalApprovalDate
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

            /** The name assigned to the drop zone point. */
            fun pointName(pointName: String) = pointName(JsonField.of(pointName))

            /**
             * Sets [Builder.pointName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pointName(pointName: JsonField<String>) =
                apply {
                    this.pointName = pointName
                }

            /** The radius dimension of the drop zone in meters for circular drop zones. */
            fun radius(radius: Double) = radius(JsonField.of(radius))

            /**
             * Sets [Builder.radius] to an arbitrary JSON value.
             *
             * You should usually call [Builder.radius] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun radius(radius: JsonField<Double>) =
                apply {
                    this.radius = radius
                }

            /** The date the drop zone was recertified, in ISO 8601 UTC format with millisecond precision. */
            fun recertDate(recertDate: OffsetDateTime) = recertDate(JsonField.of(recertDate))

            /**
             * Sets [Builder.recertDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recertDate] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recertDate(recertDate: JsonField<OffsetDateTime>) =
                apply {
                    this.recertDate = recertDate
                }

            /** Remarks concerning the drop zone. */
            fun remark(remark: String) = remark(JsonField.of(remark))

            /**
             * Sets [Builder.remark] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remark] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remark(remark: JsonField<String>) =
                apply {
                    this.remark = remark
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

            /** The US alphabetical code for the state where the drop zone is located. */
            fun stateAbbr(stateAbbr: String) = stateAbbr(JsonField.of(stateAbbr))

            /**
             * Sets [Builder.stateAbbr] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stateAbbr] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stateAbbr(stateAbbr: JsonField<String>) =
                apply {
                    this.stateAbbr = stateAbbr
                }

            /** The name of the state where the drop zone is located. */
            fun stateName(stateName: String) = stateName(JsonField.of(stateName))

            /**
             * Sets [Builder.stateName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stateName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stateName(stateName: JsonField<String>) =
                apply {
                    this.stateName = stateName
                }

            /** The date the drop zone survey was performed, in ISO 8601 UTC format with millisecond precision. */
            fun surveyDate(surveyDate: OffsetDateTime) = surveyDate(JsonField.of(surveyDate))

            /**
             * Sets [Builder.surveyDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.surveyDate] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun surveyDate(surveyDate: JsonField<OffsetDateTime>) =
                apply {
                    this.surveyDate = surveyDate
                }

            /** The width dimension of the drop zone in meters for non-circular drop zones. */
            fun width(width: Double) = width(JsonField.of(width))

            /**
             * Sets [Builder.width] to an arbitrary JSON value.
             *
             * You should usually call [Builder.width] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun width(width: JsonField<Double>) =
                apply {
                    this.width = width
                }

            /** The identifier of the Zone Availability Report (ZAR) for the drop zone. */
            fun zarId(zarId: String) = zarId(JsonField.of(zarId))

            /**
             * Sets [Builder.zarId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zarId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zarId(zarId: JsonField<String>) =
                apply {
                    this.zarId = zarId
                }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .lat()
             * .lon()
             * .name()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                  checkRequired(
                    "classificationMarking", classificationMarking
                  ),
                  checkRequired(
                    "dataMode", dataMode
                  ),
                  checkRequired(
                    "lat", lat
                  ),
                  checkRequired(
                    "lon", lon
                  ),
                  checkRequired(
                    "name", name
                  ),
                  checkRequired(
                    "source", source
                  ),
                  id,
                  altCountryCode,
                  altCountryName,
                  approvalDate,
                  code,
                  countryCode,
                  countryName,
                  createdAt,
                  createdBy,
                  expirationDate,
                  extIdentifier,
                  idSite,
                  lastUpdate,
                  length,
                  majcom,
                  nearestLoc,
                  operationalApprovalDate,
                  origin,
                  origNetwork,
                  pointName,
                  radius,
                  recertDate,
                  remark,
                  sourceDl,
                  stateAbbr,
                  stateName,
                  surveyDate,
                  width,
                  zarId,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                classificationMarking()
                dataMode().validate()
                lat()
                lon()
                name()
                source()
                id()
                altCountryCode()
                altCountryName()
                approvalDate()
                code()
                countryCode()
                countryName()
                createdAt()
                createdBy()
                expirationDate()
                extIdentifier()
                idSite()
                lastUpdate()
                length()
                majcom()
                nearestLoc()
                operationalApprovalDate()
                origin()
                origNetwork()
                pointName()
                radius()
                recertDate()
                remark()
                sourceDl()
                stateAbbr()
                stateName()
                surveyDate()
                width()
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
        internal fun validity(): Int = (if (classificationMarking.asKnown().isPresent) 1 else 0) + (dataMode.asKnown().getOrNull()?.validity() ?: 0) + (if (lat.asKnown().isPresent) 1 else 0) + (if (lon.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0) + (if (source.asKnown().isPresent) 1 else 0) + (if (id.asKnown().isPresent) 1 else 0) + (if (altCountryCode.asKnown().isPresent) 1 else 0) + (if (altCountryName.asKnown().isPresent) 1 else 0) + (if (approvalDate.asKnown().isPresent) 1 else 0) + (if (code.asKnown().isPresent) 1 else 0) + (if (countryCode.asKnown().isPresent) 1 else 0) + (if (countryName.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (createdBy.asKnown().isPresent) 1 else 0) + (if (expirationDate.asKnown().isPresent) 1 else 0) + (if (extIdentifier.asKnown().isPresent) 1 else 0) + (if (idSite.asKnown().isPresent) 1 else 0) + (if (lastUpdate.asKnown().isPresent) 1 else 0) + (if (length.asKnown().isPresent) 1 else 0) + (if (majcom.asKnown().isPresent) 1 else 0) + (if (nearestLoc.asKnown().isPresent) 1 else 0) + (if (operationalApprovalDate.asKnown().isPresent) 1 else 0) + (if (origin.asKnown().isPresent) 1 else 0) + (if (origNetwork.asKnown().isPresent) 1 else 0) + (if (pointName.asKnown().isPresent) 1 else 0) + (if (radius.asKnown().isPresent) 1 else 0) + (if (recertDate.asKnown().isPresent) 1 else 0) + (if (remark.asKnown().isPresent) 1 else 0) + (if (sourceDl.asKnown().isPresent) 1 else 0) + (if (stateAbbr.asKnown().isPresent) 1 else 0) + (if (stateName.asKnown().isPresent) 1 else 0) + (if (surveyDate.asKnown().isPresent) 1 else 0) + (if (width.asKnown().isPresent) 1 else 0) + (if (zarId.asKnown().isPresent) 1 else 0)

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

          return /* spotless:off */ other is Body && classificationMarking == other.classificationMarking && dataMode == other.dataMode && lat == other.lat && lon == other.lon && name == other.name && source == other.source && id == other.id && altCountryCode == other.altCountryCode && altCountryName == other.altCountryName && approvalDate == other.approvalDate && code == other.code && countryCode == other.countryCode && countryName == other.countryName && createdAt == other.createdAt && createdBy == other.createdBy && expirationDate == other.expirationDate && extIdentifier == other.extIdentifier && idSite == other.idSite && lastUpdate == other.lastUpdate && length == other.length && majcom == other.majcom && nearestLoc == other.nearestLoc && operationalApprovalDate == other.operationalApprovalDate && origin == other.origin && origNetwork == other.origNetwork && pointName == other.pointName && radius == other.radius && recertDate == other.recertDate && remark == other.remark && sourceDl == other.sourceDl && stateAbbr == other.stateAbbr && stateName == other.stateName && surveyDate == other.surveyDate && width == other.width && zarId == other.zarId /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, lat, lon, name, source, id, altCountryCode, altCountryName, approvalDate, code, countryCode, countryName, createdAt, createdBy, expirationDate, extIdentifier, idSite, lastUpdate, length, majcom, nearestLoc, operationalApprovalDate, origin, origNetwork, pointName, radius, recertDate, remark, sourceDl, stateAbbr, stateName, surveyDate, width, zarId) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, lat=$lat, lon=$lon, name=$name, source=$source, id=$id, altCountryCode=$altCountryCode, altCountryName=$altCountryName, approvalDate=$approvalDate, code=$code, countryCode=$countryCode, countryName=$countryName, createdAt=$createdAt, createdBy=$createdBy, expirationDate=$expirationDate, extIdentifier=$extIdentifier, idSite=$idSite, lastUpdate=$lastUpdate, length=$length, majcom=$majcom, nearestLoc=$nearestLoc, operationalApprovalDate=$operationalApprovalDate, origin=$origin, origNetwork=$origNetwork, pointName=$pointName, radius=$radius, recertDate=$recertDate, remark=$remark, sourceDl=$sourceDl, stateAbbr=$stateAbbr, stateName=$stateName, surveyDate=$surveyDate, width=$width, zarId=$zarId}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is DropzoneUnvalidatedPublishParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "DropzoneUnvalidatedPublishParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

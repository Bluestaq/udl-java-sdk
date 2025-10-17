// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.diplomaticclearance

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
 * Service operation to take multiple Diplomatic Clearance records as a POST body and ingest into
 * the database. This operation is intended to be used for automated feeds into UDL. A specific role
 * is required to perform this service operation. Please contact the UDL team for assistance.
 */
class DiplomaticClearanceUnvalidatedPublishParams
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
         * Returns a mutable builder for constructing an instance of
         * [DiplomaticClearanceUnvalidatedPublishParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DiplomaticClearanceUnvalidatedPublishParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            diplomaticClearanceUnvalidatedPublishParams: DiplomaticClearanceUnvalidatedPublishParams
        ) = apply {
            body = diplomaticClearanceUnvalidatedPublishParams.body.toMutableList()
            additionalHeaders =
                diplomaticClearanceUnvalidatedPublishParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                diplomaticClearanceUnvalidatedPublishParams.additionalQueryParams.toBuilder()
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
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [DiplomaticClearanceUnvalidatedPublishParams].
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
        fun build(): DiplomaticClearanceUnvalidatedPublishParams =
            DiplomaticClearanceUnvalidatedPublishParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * A diplomatic clearance is an authorization for an aircraft to traverse or land within a
     * specified country.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val firstDepDate: JsonField<OffsetDateTime>,
        private val idMission: JsonField<String>,
        private val source: JsonField<String>,
        private val id: JsonField<String>,
        private val apacsId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val diplomaticClearanceDetails: JsonField<List<DiplomaticClearanceDetail>>,
        private val diplomaticClearanceRemarks: JsonField<List<DiplomaticClearanceRemark>>,
        private val dipWorksheetName: JsonField<String>,
        private val docDeadline: JsonField<OffsetDateTime>,
        private val externalWorksheetId: JsonField<String>,
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
            @JsonProperty("firstDepDate")
            @ExcludeMissing
            firstDepDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("idMission")
            @ExcludeMissing
            idMission: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("apacsId") @ExcludeMissing apacsId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("diplomaticClearanceDetails")
            @ExcludeMissing
            diplomaticClearanceDetails: JsonField<List<DiplomaticClearanceDetail>> =
                JsonMissing.of(),
            @JsonProperty("diplomaticClearanceRemarks")
            @ExcludeMissing
            diplomaticClearanceRemarks: JsonField<List<DiplomaticClearanceRemark>> =
                JsonMissing.of(),
            @JsonProperty("dipWorksheetName")
            @ExcludeMissing
            dipWorksheetName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("docDeadline")
            @ExcludeMissing
            docDeadline: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("externalWorksheetId")
            @ExcludeMissing
            externalWorksheetId: JsonField<String> = JsonMissing.of(),
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
            firstDepDate,
            idMission,
            source,
            id,
            apacsId,
            createdAt,
            createdBy,
            diplomaticClearanceDetails,
            diplomaticClearanceRemarks,
            dipWorksheetName,
            docDeadline,
            externalWorksheetId,
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
         * The First Departure Date (FDD) the mission is scheduled for departure, in ISO 8601 UTC
         * format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun firstDepDate(): OffsetDateTime = firstDepDate.getRequired("firstDepDate")

        /**
         * Unique identifier of the Mission associated with this diplomatic clearance record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun idMission(): String = idMission.getRequired("idMission")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Unique identifier of the record, auto-generated by the system if not provided on create
         * operations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The Aircraft and Personnel Automated Clearance System (APACS) system identifier used to
         * process and approve this clearance request.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun apacsId(): Optional<String> = apacsId.getOptional("apacsId")

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
         * Collection of diplomatic clearance details.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun diplomaticClearanceDetails(): Optional<List<DiplomaticClearanceDetail>> =
            diplomaticClearanceDetails.getOptional("diplomaticClearanceDetails")

        /**
         * Collection of diplomatic clearance remarks.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun diplomaticClearanceRemarks(): Optional<List<DiplomaticClearanceRemark>> =
            diplomaticClearanceRemarks.getOptional("diplomaticClearanceRemarks")

        /**
         * Identifier of the Diplomatic Clearance Worksheet used to coordinate aircraft clearance
         * requests.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dipWorksheetName(): Optional<String> = dipWorksheetName.getOptional("dipWorksheetName")

        /**
         * Suspense date for the diplomatic clearance worksheet to be worked, in ISO 8601 UTC format
         * with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun docDeadline(): Optional<OffsetDateTime> = docDeadline.getOptional("docDeadline")

        /**
         * Optional diplomatic clearance worksheet ID from external systems. This field has no
         * meaning within UDL and is provided as a convenience for systems that require tracking of
         * an internal system generated ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun externalWorksheetId(): Optional<String> =
            externalWorksheetId.getOptional("externalWorksheetId")

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
         * Returns the raw JSON value of [dataMode].
         *
         * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataMode") @ExcludeMissing fun _dataMode(): JsonField<DataMode> = dataMode

        /**
         * Returns the raw JSON value of [firstDepDate].
         *
         * Unlike [firstDepDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("firstDepDate")
        @ExcludeMissing
        fun _firstDepDate(): JsonField<OffsetDateTime> = firstDepDate

        /**
         * Returns the raw JSON value of [idMission].
         *
         * Unlike [idMission], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idMission") @ExcludeMissing fun _idMission(): JsonField<String> = idMission

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
         * Returns the raw JSON value of [apacsId].
         *
         * Unlike [apacsId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("apacsId") @ExcludeMissing fun _apacsId(): JsonField<String> = apacsId

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
         * Returns the raw JSON value of [diplomaticClearanceDetails].
         *
         * Unlike [diplomaticClearanceDetails], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("diplomaticClearanceDetails")
        @ExcludeMissing
        fun _diplomaticClearanceDetails(): JsonField<List<DiplomaticClearanceDetail>> =
            diplomaticClearanceDetails

        /**
         * Returns the raw JSON value of [diplomaticClearanceRemarks].
         *
         * Unlike [diplomaticClearanceRemarks], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("diplomaticClearanceRemarks")
        @ExcludeMissing
        fun _diplomaticClearanceRemarks(): JsonField<List<DiplomaticClearanceRemark>> =
            diplomaticClearanceRemarks

        /**
         * Returns the raw JSON value of [dipWorksheetName].
         *
         * Unlike [dipWorksheetName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dipWorksheetName")
        @ExcludeMissing
        fun _dipWorksheetName(): JsonField<String> = dipWorksheetName

        /**
         * Returns the raw JSON value of [docDeadline].
         *
         * Unlike [docDeadline], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("docDeadline")
        @ExcludeMissing
        fun _docDeadline(): JsonField<OffsetDateTime> = docDeadline

        /**
         * Returns the raw JSON value of [externalWorksheetId].
         *
         * Unlike [externalWorksheetId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("externalWorksheetId")
        @ExcludeMissing
        fun _externalWorksheetId(): JsonField<String> = externalWorksheetId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .firstDepDate()
             * .idMission()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var firstDepDate: JsonField<OffsetDateTime>? = null
            private var idMission: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var apacsId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var diplomaticClearanceDetails:
                JsonField<MutableList<DiplomaticClearanceDetail>>? =
                null
            private var diplomaticClearanceRemarks:
                JsonField<MutableList<DiplomaticClearanceRemark>>? =
                null
            private var dipWorksheetName: JsonField<String> = JsonMissing.of()
            private var docDeadline: JsonField<OffsetDateTime> = JsonMissing.of()
            private var externalWorksheetId: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                firstDepDate = body.firstDepDate
                idMission = body.idMission
                source = body.source
                id = body.id
                apacsId = body.apacsId
                createdAt = body.createdAt
                createdBy = body.createdBy
                diplomaticClearanceDetails =
                    body.diplomaticClearanceDetails.map { it.toMutableList() }
                diplomaticClearanceRemarks =
                    body.diplomaticClearanceRemarks.map { it.toMutableList() }
                dipWorksheetName = body.dipWorksheetName
                docDeadline = body.docDeadline
                externalWorksheetId = body.externalWorksheetId
                origin = body.origin
                origNetwork = body.origNetwork
                sourceDl = body.sourceDl
                updatedAt = body.updatedAt
                updatedBy = body.updatedBy
                additionalProperties = body.additionalProperties.toMutableMap()
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
             * The First Departure Date (FDD) the mission is scheduled for departure, in ISO 8601
             * UTC format with millisecond precision.
             */
            fun firstDepDate(firstDepDate: OffsetDateTime) =
                firstDepDate(JsonField.of(firstDepDate))

            /**
             * Sets [Builder.firstDepDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstDepDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun firstDepDate(firstDepDate: JsonField<OffsetDateTime>) = apply {
                this.firstDepDate = firstDepDate
            }

            /**
             * Unique identifier of the Mission associated with this diplomatic clearance record.
             */
            fun idMission(idMission: String) = idMission(JsonField.of(idMission))

            /**
             * Sets [Builder.idMission] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idMission] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idMission(idMission: JsonField<String>) = apply { this.idMission = idMission }

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

            /**
             * Unique identifier of the record, auto-generated by the system if not provided on
             * create operations.
             */
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
             * The Aircraft and Personnel Automated Clearance System (APACS) system identifier used
             * to process and approve this clearance request.
             */
            fun apacsId(apacsId: String) = apacsId(JsonField.of(apacsId))

            /**
             * Sets [Builder.apacsId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apacsId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apacsId(apacsId: JsonField<String>) = apply { this.apacsId = apacsId }

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

            /** Collection of diplomatic clearance details. */
            fun diplomaticClearanceDetails(
                diplomaticClearanceDetails: List<DiplomaticClearanceDetail>
            ) = diplomaticClearanceDetails(JsonField.of(diplomaticClearanceDetails))

            /**
             * Sets [Builder.diplomaticClearanceDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.diplomaticClearanceDetails] with a well-typed
             * `List<DiplomaticClearanceDetail>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun diplomaticClearanceDetails(
                diplomaticClearanceDetails: JsonField<List<DiplomaticClearanceDetail>>
            ) = apply {
                this.diplomaticClearanceDetails =
                    diplomaticClearanceDetails.map { it.toMutableList() }
            }

            /**
             * Adds a single [DiplomaticClearanceDetail] to [diplomaticClearanceDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDiplomaticClearanceDetail(diplomaticClearanceDetail: DiplomaticClearanceDetail) =
                apply {
                    diplomaticClearanceDetails =
                        (diplomaticClearanceDetails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("diplomaticClearanceDetails", it)
                                .add(diplomaticClearanceDetail)
                        }
                }

            /** Collection of diplomatic clearance remarks. */
            fun diplomaticClearanceRemarks(
                diplomaticClearanceRemarks: List<DiplomaticClearanceRemark>
            ) = diplomaticClearanceRemarks(JsonField.of(diplomaticClearanceRemarks))

            /**
             * Sets [Builder.diplomaticClearanceRemarks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.diplomaticClearanceRemarks] with a well-typed
             * `List<DiplomaticClearanceRemark>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun diplomaticClearanceRemarks(
                diplomaticClearanceRemarks: JsonField<List<DiplomaticClearanceRemark>>
            ) = apply {
                this.diplomaticClearanceRemarks =
                    diplomaticClearanceRemarks.map { it.toMutableList() }
            }

            /**
             * Adds a single [DiplomaticClearanceRemark] to [diplomaticClearanceRemarks].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDiplomaticClearanceRemark(diplomaticClearanceRemark: DiplomaticClearanceRemark) =
                apply {
                    diplomaticClearanceRemarks =
                        (diplomaticClearanceRemarks ?: JsonField.of(mutableListOf())).also {
                            checkKnown("diplomaticClearanceRemarks", it)
                                .add(diplomaticClearanceRemark)
                        }
                }

            /**
             * Identifier of the Diplomatic Clearance Worksheet used to coordinate aircraft
             * clearance requests.
             */
            fun dipWorksheetName(dipWorksheetName: String) =
                dipWorksheetName(JsonField.of(dipWorksheetName))

            /**
             * Sets [Builder.dipWorksheetName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dipWorksheetName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dipWorksheetName(dipWorksheetName: JsonField<String>) = apply {
                this.dipWorksheetName = dipWorksheetName
            }

            /**
             * Suspense date for the diplomatic clearance worksheet to be worked, in ISO 8601 UTC
             * format with millisecond precision.
             */
            fun docDeadline(docDeadline: OffsetDateTime) = docDeadline(JsonField.of(docDeadline))

            /**
             * Sets [Builder.docDeadline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.docDeadline] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun docDeadline(docDeadline: JsonField<OffsetDateTime>) = apply {
                this.docDeadline = docDeadline
            }

            /**
             * Optional diplomatic clearance worksheet ID from external systems. This field has no
             * meaning within UDL and is provided as a convenience for systems that require tracking
             * of an internal system generated ID.
             */
            fun externalWorksheetId(externalWorksheetId: String) =
                externalWorksheetId(JsonField.of(externalWorksheetId))

            /**
             * Sets [Builder.externalWorksheetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalWorksheetId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun externalWorksheetId(externalWorksheetId: JsonField<String>) = apply {
                this.externalWorksheetId = externalWorksheetId
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .firstDepDate()
             * .idMission()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("firstDepDate", firstDepDate),
                    checkRequired("idMission", idMission),
                    checkRequired("source", source),
                    id,
                    apacsId,
                    createdAt,
                    createdBy,
                    (diplomaticClearanceDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    (diplomaticClearanceRemarks ?: JsonMissing.of()).map { it.toImmutable() },
                    dipWorksheetName,
                    docDeadline,
                    externalWorksheetId,
                    origin,
                    origNetwork,
                    sourceDl,
                    updatedAt,
                    updatedBy,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            firstDepDate()
            idMission()
            source()
            id()
            apacsId()
            createdAt()
            createdBy()
            diplomaticClearanceDetails().ifPresent { it.forEach { it.validate() } }
            diplomaticClearanceRemarks().ifPresent { it.forEach { it.validate() } }
            dipWorksheetName()
            docDeadline()
            externalWorksheetId()
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
                (if (firstDepDate.asKnown().isPresent) 1 else 0) +
                (if (idMission.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (apacsId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (diplomaticClearanceDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (diplomaticClearanceRemarks.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (dipWorksheetName.asKnown().isPresent) 1 else 0) +
                (if (docDeadline.asKnown().isPresent) 1 else 0) +
                (if (externalWorksheetId.asKnown().isPresent) 1 else 0) +
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

        /** Collection of diplomatic clearance details. */
        class DiplomaticClearanceDetail
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val action: JsonField<String>,
            private val altCountryCode: JsonField<String>,
            private val clearanceId: JsonField<String>,
            private val clearanceRemark: JsonField<String>,
            private val clearedCallSign: JsonField<String>,
            private val countryCode: JsonField<String>,
            private val countryName: JsonField<String>,
            private val entryNet: JsonField<OffsetDateTime>,
            private val entryPoint: JsonField<String>,
            private val exitNlt: JsonField<OffsetDateTime>,
            private val exitPoint: JsonField<String>,
            private val externalClearanceId: JsonField<String>,
            private val idSortie: JsonField<String>,
            private val legNum: JsonField<Int>,
            private val profile: JsonField<String>,
            private val reqIcao: JsonField<Boolean>,
            private val reqPoint: JsonField<Boolean>,
            private val routeString: JsonField<String>,
            private val sequenceNum: JsonField<Int>,
            private val status: JsonField<String>,
            private val validDesc: JsonField<String>,
            private val validEndTime: JsonField<OffsetDateTime>,
            private val validStartTime: JsonField<OffsetDateTime>,
            private val windowRemark: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("action")
                @ExcludeMissing
                action: JsonField<String> = JsonMissing.of(),
                @JsonProperty("altCountryCode")
                @ExcludeMissing
                altCountryCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("clearanceId")
                @ExcludeMissing
                clearanceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("clearanceRemark")
                @ExcludeMissing
                clearanceRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("clearedCallSign")
                @ExcludeMissing
                clearedCallSign: JsonField<String> = JsonMissing.of(),
                @JsonProperty("countryCode")
                @ExcludeMissing
                countryCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("countryName")
                @ExcludeMissing
                countryName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("entryNET")
                @ExcludeMissing
                entryNet: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("entryPoint")
                @ExcludeMissing
                entryPoint: JsonField<String> = JsonMissing.of(),
                @JsonProperty("exitNLT")
                @ExcludeMissing
                exitNlt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("exitPoint")
                @ExcludeMissing
                exitPoint: JsonField<String> = JsonMissing.of(),
                @JsonProperty("externalClearanceId")
                @ExcludeMissing
                externalClearanceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("idSortie")
                @ExcludeMissing
                idSortie: JsonField<String> = JsonMissing.of(),
                @JsonProperty("legNum") @ExcludeMissing legNum: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("profile")
                @ExcludeMissing
                profile: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reqICAO")
                @ExcludeMissing
                reqIcao: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reqPoint")
                @ExcludeMissing
                reqPoint: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("routeString")
                @ExcludeMissing
                routeString: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sequenceNum")
                @ExcludeMissing
                sequenceNum: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<String> = JsonMissing.of(),
                @JsonProperty("validDesc")
                @ExcludeMissing
                validDesc: JsonField<String> = JsonMissing.of(),
                @JsonProperty("validEndTime")
                @ExcludeMissing
                validEndTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("validStartTime")
                @ExcludeMissing
                validStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("windowRemark")
                @ExcludeMissing
                windowRemark: JsonField<String> = JsonMissing.of(),
            ) : this(
                action,
                altCountryCode,
                clearanceId,
                clearanceRemark,
                clearedCallSign,
                countryCode,
                countryName,
                entryNet,
                entryPoint,
                exitNlt,
                exitPoint,
                externalClearanceId,
                idSortie,
                legNum,
                profile,
                reqIcao,
                reqPoint,
                routeString,
                sequenceNum,
                status,
                validDesc,
                validEndTime,
                validStartTime,
                windowRemark,
                mutableMapOf(),
            )

            /**
             * The type of action the aircraft can take with this diplomatic clearance (e.g. O for
             * Overfly, L for Land, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun action(): Optional<String> = action.getOptional("action")

            /**
             * Specifies an alternate country code if the data provider code does not match a UDL
             * Country code value (ISO-3166-ALPHA-2). This field will be set to the value provided
             * by the source and should be used for all Queries specifying a Country Code.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun altCountryCode(): Optional<String> = altCountryCode.getOptional("altCountryCode")

            /**
             * Identifier of this diplomatic clearance issued by the host country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun clearanceId(): Optional<String> = clearanceId.getOptional("clearanceId")

            /**
             * Remarks concerning this diplomatic clearance.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun clearanceRemark(): Optional<String> = clearanceRemark.getOptional("clearanceRemark")

            /**
             * The call sign of the sortie cleared with this diplomatic clearance.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun clearedCallSign(): Optional<String> = clearedCallSign.getOptional("clearedCallSign")

            /**
             * The DoD Standard Country Code designator for the country issuing the diplomatic
             * clearance. This field will be set to "OTHR" if the source value does not match a UDL
             * Country code value (ISO-3166-ALPHA-2).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

            /**
             * Name of the country issuing this diplomatic clearance.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun countryName(): Optional<String> = countryName.getOptional("countryName")

            /**
             * Earliest time the aircraft may enter the country, in ISO 8601 UTC format with
             * millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun entryNet(): Optional<OffsetDateTime> = entryNet.getOptional("entryNET")

            /**
             * The navigation point name where the aircraft must enter the country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun entryPoint(): Optional<String> = entryPoint.getOptional("entryPoint")

            /**
             * Latest time the aircraft may exit the country, in ISO 8601 UTC format with
             * millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun exitNlt(): Optional<OffsetDateTime> = exitNlt.getOptional("exitNLT")

            /**
             * The navigation point name where the aircraft must exit the country.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun exitPoint(): Optional<String> = exitPoint.getOptional("exitPoint")

            /**
             * Optional clearance ID from external systems. This field has no meaning within UDL and
             * is provided as a convenience for systems that require tracking of an internal system
             * generated ID.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun externalClearanceId(): Optional<String> =
                externalClearanceId.getOptional("externalClearanceId")

            /**
             * Unique identifier of the Aircraft Sortie associated with this diplomatic clearance
             * record.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun idSortie(): Optional<String> = idSortie.getOptional("idSortie")

            /**
             * Identifies the Itinerary point of a sortie where an air event occurs.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun legNum(): Optional<Int> = legNum.getOptional("legNum")

            /**
             * The diplomatic clearance profile name used within clearance management systems.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun profile(): Optional<String> = profile.getOptional("profile")

            /**
             * Flag indicating whether the clearance request requires ICAO specific information.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqIcao(): Optional<Boolean> = reqIcao.getOptional("reqICAO")

            /**
             * Flag indicating whether entry/exit points are required for clearances.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reqPoint(): Optional<Boolean> = reqPoint.getOptional("reqPoint")

            /**
             * The 1801 fileable route of flight string associated with this diplomatic clearance.
             * The route of flight string contains route designators, significant points, change of
             * speed/altitude, change of flight rules, and cruise climbs.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun routeString(): Optional<String> = routeString.getOptional("routeString")

            /**
             * The placement of this diplomatic clearance within a sequence of clearances used on a
             * sortie. For example, a sequence value of 3 means that it is the third diplomatic
             * clearance the aircraft will use.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sequenceNum(): Optional<Int> = sequenceNum.getOptional("sequenceNum")

            /**
             * Indicates the current status of the diplomatic clearance request.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun status(): Optional<String> = status.getOptional("status")

            /**
             * Description of when this diplomatic clearance is valid.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun validDesc(): Optional<String> = validDesc.getOptional("validDesc")

            /**
             * The end time of the validity of this diplomatic clearance, in ISO 8601 UTC format
             * with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun validEndTime(): Optional<OffsetDateTime> = validEndTime.getOptional("validEndTime")

            /**
             * The start time of the validity of this diplomatic clearance, in ISO 8601 UTC format
             * with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun validStartTime(): Optional<OffsetDateTime> =
                validStartTime.getOptional("validStartTime")

            /**
             * Remarks concerning the valid diplomatic clearance window.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun windowRemark(): Optional<String> = windowRemark.getOptional("windowRemark")

            /**
             * Returns the raw JSON value of [action].
             *
             * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<String> = action

            /**
             * Returns the raw JSON value of [altCountryCode].
             *
             * Unlike [altCountryCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("altCountryCode")
            @ExcludeMissing
            fun _altCountryCode(): JsonField<String> = altCountryCode

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
             * Returns the raw JSON value of [clearanceRemark].
             *
             * Unlike [clearanceRemark], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("clearanceRemark")
            @ExcludeMissing
            fun _clearanceRemark(): JsonField<String> = clearanceRemark

            /**
             * Returns the raw JSON value of [clearedCallSign].
             *
             * Unlike [clearedCallSign], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("clearedCallSign")
            @ExcludeMissing
            fun _clearedCallSign(): JsonField<String> = clearedCallSign

            /**
             * Returns the raw JSON value of [countryCode].
             *
             * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("countryCode")
            @ExcludeMissing
            fun _countryCode(): JsonField<String> = countryCode

            /**
             * Returns the raw JSON value of [countryName].
             *
             * Unlike [countryName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("countryName")
            @ExcludeMissing
            fun _countryName(): JsonField<String> = countryName

            /**
             * Returns the raw JSON value of [entryNet].
             *
             * Unlike [entryNet], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("entryNET")
            @ExcludeMissing
            fun _entryNet(): JsonField<OffsetDateTime> = entryNet

            /**
             * Returns the raw JSON value of [entryPoint].
             *
             * Unlike [entryPoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("entryPoint")
            @ExcludeMissing
            fun _entryPoint(): JsonField<String> = entryPoint

            /**
             * Returns the raw JSON value of [exitNlt].
             *
             * Unlike [exitNlt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("exitNLT")
            @ExcludeMissing
            fun _exitNlt(): JsonField<OffsetDateTime> = exitNlt

            /**
             * Returns the raw JSON value of [exitPoint].
             *
             * Unlike [exitPoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("exitPoint")
            @ExcludeMissing
            fun _exitPoint(): JsonField<String> = exitPoint

            /**
             * Returns the raw JSON value of [externalClearanceId].
             *
             * Unlike [externalClearanceId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("externalClearanceId")
            @ExcludeMissing
            fun _externalClearanceId(): JsonField<String> = externalClearanceId

            /**
             * Returns the raw JSON value of [idSortie].
             *
             * Unlike [idSortie], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("idSortie") @ExcludeMissing fun _idSortie(): JsonField<String> = idSortie

            /**
             * Returns the raw JSON value of [legNum].
             *
             * Unlike [legNum], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("legNum") @ExcludeMissing fun _legNum(): JsonField<Int> = legNum

            /**
             * Returns the raw JSON value of [profile].
             *
             * Unlike [profile], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonField<String> = profile

            /**
             * Returns the raw JSON value of [reqIcao].
             *
             * Unlike [reqIcao], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reqICAO") @ExcludeMissing fun _reqIcao(): JsonField<Boolean> = reqIcao

            /**
             * Returns the raw JSON value of [reqPoint].
             *
             * Unlike [reqPoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reqPoint") @ExcludeMissing fun _reqPoint(): JsonField<Boolean> = reqPoint

            /**
             * Returns the raw JSON value of [routeString].
             *
             * Unlike [routeString], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("routeString")
            @ExcludeMissing
            fun _routeString(): JsonField<String> = routeString

            /**
             * Returns the raw JSON value of [sequenceNum].
             *
             * Unlike [sequenceNum], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sequenceNum")
            @ExcludeMissing
            fun _sequenceNum(): JsonField<Int> = sequenceNum

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

            /**
             * Returns the raw JSON value of [validDesc].
             *
             * Unlike [validDesc], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("validDesc")
            @ExcludeMissing
            fun _validDesc(): JsonField<String> = validDesc

            /**
             * Returns the raw JSON value of [validEndTime].
             *
             * Unlike [validEndTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("validEndTime")
            @ExcludeMissing
            fun _validEndTime(): JsonField<OffsetDateTime> = validEndTime

            /**
             * Returns the raw JSON value of [validStartTime].
             *
             * Unlike [validStartTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("validStartTime")
            @ExcludeMissing
            fun _validStartTime(): JsonField<OffsetDateTime> = validStartTime

            /**
             * Returns the raw JSON value of [windowRemark].
             *
             * Unlike [windowRemark], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("windowRemark")
            @ExcludeMissing
            fun _windowRemark(): JsonField<String> = windowRemark

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
                 * [DiplomaticClearanceDetail].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DiplomaticClearanceDetail]. */
            class Builder internal constructor() {

                private var action: JsonField<String> = JsonMissing.of()
                private var altCountryCode: JsonField<String> = JsonMissing.of()
                private var clearanceId: JsonField<String> = JsonMissing.of()
                private var clearanceRemark: JsonField<String> = JsonMissing.of()
                private var clearedCallSign: JsonField<String> = JsonMissing.of()
                private var countryCode: JsonField<String> = JsonMissing.of()
                private var countryName: JsonField<String> = JsonMissing.of()
                private var entryNet: JsonField<OffsetDateTime> = JsonMissing.of()
                private var entryPoint: JsonField<String> = JsonMissing.of()
                private var exitNlt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var exitPoint: JsonField<String> = JsonMissing.of()
                private var externalClearanceId: JsonField<String> = JsonMissing.of()
                private var idSortie: JsonField<String> = JsonMissing.of()
                private var legNum: JsonField<Int> = JsonMissing.of()
                private var profile: JsonField<String> = JsonMissing.of()
                private var reqIcao: JsonField<Boolean> = JsonMissing.of()
                private var reqPoint: JsonField<Boolean> = JsonMissing.of()
                private var routeString: JsonField<String> = JsonMissing.of()
                private var sequenceNum: JsonField<Int> = JsonMissing.of()
                private var status: JsonField<String> = JsonMissing.of()
                private var validDesc: JsonField<String> = JsonMissing.of()
                private var validEndTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var validStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var windowRemark: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(diplomaticClearanceDetail: DiplomaticClearanceDetail) = apply {
                    action = diplomaticClearanceDetail.action
                    altCountryCode = diplomaticClearanceDetail.altCountryCode
                    clearanceId = diplomaticClearanceDetail.clearanceId
                    clearanceRemark = diplomaticClearanceDetail.clearanceRemark
                    clearedCallSign = diplomaticClearanceDetail.clearedCallSign
                    countryCode = diplomaticClearanceDetail.countryCode
                    countryName = diplomaticClearanceDetail.countryName
                    entryNet = diplomaticClearanceDetail.entryNet
                    entryPoint = diplomaticClearanceDetail.entryPoint
                    exitNlt = diplomaticClearanceDetail.exitNlt
                    exitPoint = diplomaticClearanceDetail.exitPoint
                    externalClearanceId = diplomaticClearanceDetail.externalClearanceId
                    idSortie = diplomaticClearanceDetail.idSortie
                    legNum = diplomaticClearanceDetail.legNum
                    profile = diplomaticClearanceDetail.profile
                    reqIcao = diplomaticClearanceDetail.reqIcao
                    reqPoint = diplomaticClearanceDetail.reqPoint
                    routeString = diplomaticClearanceDetail.routeString
                    sequenceNum = diplomaticClearanceDetail.sequenceNum
                    status = diplomaticClearanceDetail.status
                    validDesc = diplomaticClearanceDetail.validDesc
                    validEndTime = diplomaticClearanceDetail.validEndTime
                    validStartTime = diplomaticClearanceDetail.validStartTime
                    windowRemark = diplomaticClearanceDetail.windowRemark
                    additionalProperties =
                        diplomaticClearanceDetail.additionalProperties.toMutableMap()
                }

                /**
                 * The type of action the aircraft can take with this diplomatic clearance (e.g. O
                 * for Overfly, L for Land, etc.).
                 */
                fun action(action: String) = action(JsonField.of(action))

                /**
                 * Sets [Builder.action] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.action] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun action(action: JsonField<String>) = apply { this.action = action }

                /**
                 * Specifies an alternate country code if the data provider code does not match a
                 * UDL Country code value (ISO-3166-ALPHA-2). This field will be set to the value
                 * provided by the source and should be used for all Queries specifying a Country
                 * Code.
                 */
                fun altCountryCode(altCountryCode: String) =
                    altCountryCode(JsonField.of(altCountryCode))

                /**
                 * Sets [Builder.altCountryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.altCountryCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun altCountryCode(altCountryCode: JsonField<String>) = apply {
                    this.altCountryCode = altCountryCode
                }

                /** Identifier of this diplomatic clearance issued by the host country. */
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

                /** Remarks concerning this diplomatic clearance. */
                fun clearanceRemark(clearanceRemark: String) =
                    clearanceRemark(JsonField.of(clearanceRemark))

                /**
                 * Sets [Builder.clearanceRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clearanceRemark] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun clearanceRemark(clearanceRemark: JsonField<String>) = apply {
                    this.clearanceRemark = clearanceRemark
                }

                /** The call sign of the sortie cleared with this diplomatic clearance. */
                fun clearedCallSign(clearedCallSign: String) =
                    clearedCallSign(JsonField.of(clearedCallSign))

                /**
                 * Sets [Builder.clearedCallSign] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clearedCallSign] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun clearedCallSign(clearedCallSign: JsonField<String>) = apply {
                    this.clearedCallSign = clearedCallSign
                }

                /**
                 * The DoD Standard Country Code designator for the country issuing the diplomatic
                 * clearance. This field will be set to "OTHR" if the source value does not match a
                 * UDL Country code value (ISO-3166-ALPHA-2).
                 */
                fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

                /**
                 * Sets [Builder.countryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countryCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun countryCode(countryCode: JsonField<String>) = apply {
                    this.countryCode = countryCode
                }

                /** Name of the country issuing this diplomatic clearance. */
                fun countryName(countryName: String) = countryName(JsonField.of(countryName))

                /**
                 * Sets [Builder.countryName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countryName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun countryName(countryName: JsonField<String>) = apply {
                    this.countryName = countryName
                }

                /**
                 * Earliest time the aircraft may enter the country, in ISO 8601 UTC format with
                 * millisecond precision.
                 */
                fun entryNet(entryNet: OffsetDateTime) = entryNet(JsonField.of(entryNet))

                /**
                 * Sets [Builder.entryNet] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entryNet] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun entryNet(entryNet: JsonField<OffsetDateTime>) = apply {
                    this.entryNet = entryNet
                }

                /** The navigation point name where the aircraft must enter the country. */
                fun entryPoint(entryPoint: String) = entryPoint(JsonField.of(entryPoint))

                /**
                 * Sets [Builder.entryPoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entryPoint] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun entryPoint(entryPoint: JsonField<String>) = apply {
                    this.entryPoint = entryPoint
                }

                /**
                 * Latest time the aircraft may exit the country, in ISO 8601 UTC format with
                 * millisecond precision.
                 */
                fun exitNlt(exitNlt: OffsetDateTime) = exitNlt(JsonField.of(exitNlt))

                /**
                 * Sets [Builder.exitNlt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.exitNlt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun exitNlt(exitNlt: JsonField<OffsetDateTime>) = apply { this.exitNlt = exitNlt }

                /** The navigation point name where the aircraft must exit the country. */
                fun exitPoint(exitPoint: String) = exitPoint(JsonField.of(exitPoint))

                /**
                 * Sets [Builder.exitPoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.exitPoint] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun exitPoint(exitPoint: JsonField<String>) = apply { this.exitPoint = exitPoint }

                /**
                 * Optional clearance ID from external systems. This field has no meaning within UDL
                 * and is provided as a convenience for systems that require tracking of an internal
                 * system generated ID.
                 */
                fun externalClearanceId(externalClearanceId: String) =
                    externalClearanceId(JsonField.of(externalClearanceId))

                /**
                 * Sets [Builder.externalClearanceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalClearanceId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalClearanceId(externalClearanceId: JsonField<String>) = apply {
                    this.externalClearanceId = externalClearanceId
                }

                /**
                 * Unique identifier of the Aircraft Sortie associated with this diplomatic
                 * clearance record.
                 */
                fun idSortie(idSortie: String) = idSortie(JsonField.of(idSortie))

                /**
                 * Sets [Builder.idSortie] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.idSortie] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun idSortie(idSortie: JsonField<String>) = apply { this.idSortie = idSortie }

                /** Identifies the Itinerary point of a sortie where an air event occurs. */
                fun legNum(legNum: Int) = legNum(JsonField.of(legNum))

                /**
                 * Sets [Builder.legNum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.legNum] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun legNum(legNum: JsonField<Int>) = apply { this.legNum = legNum }

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

                /**
                 * Flag indicating whether the clearance request requires ICAO specific information.
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

                /** Flag indicating whether entry/exit points are required for clearances. */
                fun reqPoint(reqPoint: Boolean) = reqPoint(JsonField.of(reqPoint))

                /**
                 * Sets [Builder.reqPoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reqPoint] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reqPoint(reqPoint: JsonField<Boolean>) = apply { this.reqPoint = reqPoint }

                /**
                 * The 1801 fileable route of flight string associated with this diplomatic
                 * clearance. The route of flight string contains route designators, significant
                 * points, change of speed/altitude, change of flight rules, and cruise climbs.
                 */
                fun routeString(routeString: String) = routeString(JsonField.of(routeString))

                /**
                 * Sets [Builder.routeString] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routeString] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routeString(routeString: JsonField<String>) = apply {
                    this.routeString = routeString
                }

                /**
                 * The placement of this diplomatic clearance within a sequence of clearances used
                 * on a sortie. For example, a sequence value of 3 means that it is the third
                 * diplomatic clearance the aircraft will use.
                 */
                fun sequenceNum(sequenceNum: Int) = sequenceNum(JsonField.of(sequenceNum))

                /**
                 * Sets [Builder.sequenceNum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sequenceNum] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sequenceNum(sequenceNum: JsonField<Int>) = apply {
                    this.sequenceNum = sequenceNum
                }

                /** Indicates the current status of the diplomatic clearance request. */
                fun status(status: String) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<String>) = apply { this.status = status }

                /** Description of when this diplomatic clearance is valid. */
                fun validDesc(validDesc: String) = validDesc(JsonField.of(validDesc))

                /**
                 * Sets [Builder.validDesc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.validDesc] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun validDesc(validDesc: JsonField<String>) = apply { this.validDesc = validDesc }

                /**
                 * The end time of the validity of this diplomatic clearance, in ISO 8601 UTC format
                 * with millisecond precision.
                 */
                fun validEndTime(validEndTime: OffsetDateTime) =
                    validEndTime(JsonField.of(validEndTime))

                /**
                 * Sets [Builder.validEndTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.validEndTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun validEndTime(validEndTime: JsonField<OffsetDateTime>) = apply {
                    this.validEndTime = validEndTime
                }

                /**
                 * The start time of the validity of this diplomatic clearance, in ISO 8601 UTC
                 * format with millisecond precision.
                 */
                fun validStartTime(validStartTime: OffsetDateTime) =
                    validStartTime(JsonField.of(validStartTime))

                /**
                 * Sets [Builder.validStartTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.validStartTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun validStartTime(validStartTime: JsonField<OffsetDateTime>) = apply {
                    this.validStartTime = validStartTime
                }

                /** Remarks concerning the valid diplomatic clearance window. */
                fun windowRemark(windowRemark: String) = windowRemark(JsonField.of(windowRemark))

                /**
                 * Sets [Builder.windowRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.windowRemark] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun windowRemark(windowRemark: JsonField<String>) = apply {
                    this.windowRemark = windowRemark
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DiplomaticClearanceDetail].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DiplomaticClearanceDetail =
                    DiplomaticClearanceDetail(
                        action,
                        altCountryCode,
                        clearanceId,
                        clearanceRemark,
                        clearedCallSign,
                        countryCode,
                        countryName,
                        entryNet,
                        entryPoint,
                        exitNlt,
                        exitPoint,
                        externalClearanceId,
                        idSortie,
                        legNum,
                        profile,
                        reqIcao,
                        reqPoint,
                        routeString,
                        sequenceNum,
                        status,
                        validDesc,
                        validEndTime,
                        validStartTime,
                        windowRemark,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DiplomaticClearanceDetail = apply {
                if (validated) {
                    return@apply
                }

                action()
                altCountryCode()
                clearanceId()
                clearanceRemark()
                clearedCallSign()
                countryCode()
                countryName()
                entryNet()
                entryPoint()
                exitNlt()
                exitPoint()
                externalClearanceId()
                idSortie()
                legNum()
                profile()
                reqIcao()
                reqPoint()
                routeString()
                sequenceNum()
                status()
                validDesc()
                validEndTime()
                validStartTime()
                windowRemark()
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
                (if (action.asKnown().isPresent) 1 else 0) +
                    (if (altCountryCode.asKnown().isPresent) 1 else 0) +
                    (if (clearanceId.asKnown().isPresent) 1 else 0) +
                    (if (clearanceRemark.asKnown().isPresent) 1 else 0) +
                    (if (clearedCallSign.asKnown().isPresent) 1 else 0) +
                    (if (countryCode.asKnown().isPresent) 1 else 0) +
                    (if (countryName.asKnown().isPresent) 1 else 0) +
                    (if (entryNet.asKnown().isPresent) 1 else 0) +
                    (if (entryPoint.asKnown().isPresent) 1 else 0) +
                    (if (exitNlt.asKnown().isPresent) 1 else 0) +
                    (if (exitPoint.asKnown().isPresent) 1 else 0) +
                    (if (externalClearanceId.asKnown().isPresent) 1 else 0) +
                    (if (idSortie.asKnown().isPresent) 1 else 0) +
                    (if (legNum.asKnown().isPresent) 1 else 0) +
                    (if (profile.asKnown().isPresent) 1 else 0) +
                    (if (reqIcao.asKnown().isPresent) 1 else 0) +
                    (if (reqPoint.asKnown().isPresent) 1 else 0) +
                    (if (routeString.asKnown().isPresent) 1 else 0) +
                    (if (sequenceNum.asKnown().isPresent) 1 else 0) +
                    (if (status.asKnown().isPresent) 1 else 0) +
                    (if (validDesc.asKnown().isPresent) 1 else 0) +
                    (if (validEndTime.asKnown().isPresent) 1 else 0) +
                    (if (validStartTime.asKnown().isPresent) 1 else 0) +
                    (if (windowRemark.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DiplomaticClearanceDetail &&
                    action == other.action &&
                    altCountryCode == other.altCountryCode &&
                    clearanceId == other.clearanceId &&
                    clearanceRemark == other.clearanceRemark &&
                    clearedCallSign == other.clearedCallSign &&
                    countryCode == other.countryCode &&
                    countryName == other.countryName &&
                    entryNet == other.entryNet &&
                    entryPoint == other.entryPoint &&
                    exitNlt == other.exitNlt &&
                    exitPoint == other.exitPoint &&
                    externalClearanceId == other.externalClearanceId &&
                    idSortie == other.idSortie &&
                    legNum == other.legNum &&
                    profile == other.profile &&
                    reqIcao == other.reqIcao &&
                    reqPoint == other.reqPoint &&
                    routeString == other.routeString &&
                    sequenceNum == other.sequenceNum &&
                    status == other.status &&
                    validDesc == other.validDesc &&
                    validEndTime == other.validEndTime &&
                    validStartTime == other.validStartTime &&
                    windowRemark == other.windowRemark &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    action,
                    altCountryCode,
                    clearanceId,
                    clearanceRemark,
                    clearedCallSign,
                    countryCode,
                    countryName,
                    entryNet,
                    entryPoint,
                    exitNlt,
                    exitPoint,
                    externalClearanceId,
                    idSortie,
                    legNum,
                    profile,
                    reqIcao,
                    reqPoint,
                    routeString,
                    sequenceNum,
                    status,
                    validDesc,
                    validEndTime,
                    validStartTime,
                    windowRemark,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DiplomaticClearanceDetail{action=$action, altCountryCode=$altCountryCode, clearanceId=$clearanceId, clearanceRemark=$clearanceRemark, clearedCallSign=$clearedCallSign, countryCode=$countryCode, countryName=$countryName, entryNet=$entryNet, entryPoint=$entryPoint, exitNlt=$exitNlt, exitPoint=$exitPoint, externalClearanceId=$externalClearanceId, idSortie=$idSortie, legNum=$legNum, profile=$profile, reqIcao=$reqIcao, reqPoint=$reqPoint, routeString=$routeString, sequenceNum=$sequenceNum, status=$status, validDesc=$validDesc, validEndTime=$validEndTime, validStartTime=$validStartTime, windowRemark=$windowRemark, additionalProperties=$additionalProperties}"
        }

        /** Collection of diplomatic clearance remarks. */
        class DiplomaticClearanceRemark
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val date: JsonField<OffsetDateTime>,
            private val gdssRemarkId: JsonField<String>,
            private val text: JsonField<String>,
            private val user: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("date")
                @ExcludeMissing
                date: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("gdssRemarkId")
                @ExcludeMissing
                gdssRemarkId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
            ) : this(date, gdssRemarkId, text, user, mutableMapOf())

            /**
             * Date the remark was published, in ISO 8601 UTC format, with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun date(): Optional<OffsetDateTime> = date.getOptional("date")

            /**
             * Global Decision Support System (GDSS) remark identifier.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun gdssRemarkId(): Optional<String> = gdssRemarkId.getOptional("gdssRemarkId")

            /**
             * Text of the remark.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun text(): Optional<String> = text.getOptional("text")

            /**
             * User who published the remark.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun user(): Optional<String> = user.getOptional("user")

            /**
             * Returns the raw JSON value of [date].
             *
             * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

            /**
             * Returns the raw JSON value of [gdssRemarkId].
             *
             * Unlike [gdssRemarkId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("gdssRemarkId")
            @ExcludeMissing
            fun _gdssRemarkId(): JsonField<String> = gdssRemarkId

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

            /**
             * Returns the raw JSON value of [user].
             *
             * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

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
                 * [DiplomaticClearanceRemark].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DiplomaticClearanceRemark]. */
            class Builder internal constructor() {

                private var date: JsonField<OffsetDateTime> = JsonMissing.of()
                private var gdssRemarkId: JsonField<String> = JsonMissing.of()
                private var text: JsonField<String> = JsonMissing.of()
                private var user: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(diplomaticClearanceRemark: DiplomaticClearanceRemark) = apply {
                    date = diplomaticClearanceRemark.date
                    gdssRemarkId = diplomaticClearanceRemark.gdssRemarkId
                    text = diplomaticClearanceRemark.text
                    user = diplomaticClearanceRemark.user
                    additionalProperties =
                        diplomaticClearanceRemark.additionalProperties.toMutableMap()
                }

                /**
                 * Date the remark was published, in ISO 8601 UTC format, with millisecond
                 * precision.
                 */
                fun date(date: OffsetDateTime) = date(JsonField.of(date))

                /**
                 * Sets [Builder.date] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.date] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

                /** Global Decision Support System (GDSS) remark identifier. */
                fun gdssRemarkId(gdssRemarkId: String) = gdssRemarkId(JsonField.of(gdssRemarkId))

                /**
                 * Sets [Builder.gdssRemarkId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gdssRemarkId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gdssRemarkId(gdssRemarkId: JsonField<String>) = apply {
                    this.gdssRemarkId = gdssRemarkId
                }

                /** Text of the remark. */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

                /** User who published the remark. */
                fun user(user: String) = user(JsonField.of(user))

                /**
                 * Sets [Builder.user] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.user] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun user(user: JsonField<String>) = apply { this.user = user }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DiplomaticClearanceRemark].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DiplomaticClearanceRemark =
                    DiplomaticClearanceRemark(
                        date,
                        gdssRemarkId,
                        text,
                        user,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DiplomaticClearanceRemark = apply {
                if (validated) {
                    return@apply
                }

                date()
                gdssRemarkId()
                text()
                user()
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
                (if (date.asKnown().isPresent) 1 else 0) +
                    (if (gdssRemarkId.asKnown().isPresent) 1 else 0) +
                    (if (text.asKnown().isPresent) 1 else 0) +
                    (if (user.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DiplomaticClearanceRemark &&
                    date == other.date &&
                    gdssRemarkId == other.gdssRemarkId &&
                    text == other.text &&
                    user == other.user &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(date, gdssRemarkId, text, user, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DiplomaticClearanceRemark{date=$date, gdssRemarkId=$gdssRemarkId, text=$text, user=$user, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                firstDepDate == other.firstDepDate &&
                idMission == other.idMission &&
                source == other.source &&
                id == other.id &&
                apacsId == other.apacsId &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                diplomaticClearanceDetails == other.diplomaticClearanceDetails &&
                diplomaticClearanceRemarks == other.diplomaticClearanceRemarks &&
                dipWorksheetName == other.dipWorksheetName &&
                docDeadline == other.docDeadline &&
                externalWorksheetId == other.externalWorksheetId &&
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
                firstDepDate,
                idMission,
                source,
                id,
                apacsId,
                createdAt,
                createdBy,
                diplomaticClearanceDetails,
                diplomaticClearanceRemarks,
                dipWorksheetName,
                docDeadline,
                externalWorksheetId,
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
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, firstDepDate=$firstDepDate, idMission=$idMission, source=$source, id=$id, apacsId=$apacsId, createdAt=$createdAt, createdBy=$createdBy, diplomaticClearanceDetails=$diplomaticClearanceDetails, diplomaticClearanceRemarks=$diplomaticClearanceRemarks, dipWorksheetName=$dipWorksheetName, docDeadline=$docDeadline, externalWorksheetId=$externalWorksheetId, origin=$origin, origNetwork=$origNetwork, sourceDl=$sourceDl, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DiplomaticClearanceUnvalidatedPublishParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DiplomaticClearanceUnvalidatedPublishParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

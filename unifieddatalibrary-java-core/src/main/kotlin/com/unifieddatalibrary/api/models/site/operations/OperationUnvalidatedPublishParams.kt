// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.site.operations

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
 * Service operation to take multiple siteoperations records as a POST body and ingest into the
 * database. This operation is intended to be used for automated feeds into UDL. A specific role is
 * required to perform this service operation. Please contact the UDL team for assistance.
 */
class OperationUnvalidatedPublishParams
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
         * [OperationUnvalidatedPublishParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OperationUnvalidatedPublishParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(operationUnvalidatedPublishParams: OperationUnvalidatedPublishParams) =
            apply {
                body = operationUnvalidatedPublishParams.body.toMutableList()
                additionalHeaders = operationUnvalidatedPublishParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    operationUnvalidatedPublishParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [OperationUnvalidatedPublishParams].
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
        fun build(): OperationUnvalidatedPublishParams =
            OperationUnvalidatedPublishParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Site operating details concerning the hours of operation, operational limitations, site
     * navigation, and waivers associated with the Site.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val idSite: JsonField<String>,
        private val source: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val dailyOperations: JsonField<List<DailyOperation>>,
        private val dopsLastChangedBy: JsonField<String>,
        private val dopsLastChangedDate: JsonField<OffsetDateTime>,
        private val dopsLastChangedReason: JsonField<String>,
        private val idLaunchSite: JsonField<String>,
        private val maximumOnGrounds: JsonField<List<MaximumOnGround>>,
        private val mogsLastChangedBy: JsonField<String>,
        private val mogsLastChangedDate: JsonField<OffsetDateTime>,
        private val mogsLastChangedReason: JsonField<String>,
        private val operationalDeviations: JsonField<List<OperationalDeviation>>,
        private val operationalPlannings: JsonField<List<OperationalPlanning>>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val pathways: JsonField<List<Pathway>>,
        private val sourceDl: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val updatedBy: JsonField<String>,
        private val waivers: JsonField<List<Waiver>>,
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
            @JsonProperty("idSite") @ExcludeMissing idSite: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dailyOperations")
            @ExcludeMissing
            dailyOperations: JsonField<List<DailyOperation>> = JsonMissing.of(),
            @JsonProperty("dopsLastChangedBy")
            @ExcludeMissing
            dopsLastChangedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dopsLastChangedDate")
            @ExcludeMissing
            dopsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dopsLastChangedReason")
            @ExcludeMissing
            dopsLastChangedReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idLaunchSite")
            @ExcludeMissing
            idLaunchSite: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maximumOnGrounds")
            @ExcludeMissing
            maximumOnGrounds: JsonField<List<MaximumOnGround>> = JsonMissing.of(),
            @JsonProperty("mogsLastChangedBy")
            @ExcludeMissing
            mogsLastChangedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mogsLastChangedDate")
            @ExcludeMissing
            mogsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("mogsLastChangedReason")
            @ExcludeMissing
            mogsLastChangedReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("operationalDeviations")
            @ExcludeMissing
            operationalDeviations: JsonField<List<OperationalDeviation>> = JsonMissing.of(),
            @JsonProperty("operationalPlannings")
            @ExcludeMissing
            operationalPlannings: JsonField<List<OperationalPlanning>> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pathways")
            @ExcludeMissing
            pathways: JsonField<List<Pathway>> = JsonMissing.of(),
            @JsonProperty("sourceDL")
            @ExcludeMissing
            sourceDl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedBy")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("waivers")
            @ExcludeMissing
            waivers: JsonField<List<Waiver>> = JsonMissing.of(),
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
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * The ID of the parent site.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun idSite(): String = idSite.getRequired("idSite")

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
         * Collection providing hours of operation and other information specific to a day of the
         * week.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dailyOperations(): Optional<List<DailyOperation>> =
            dailyOperations.getOptional("dailyOperations")

        /**
         * The name of the person who made the most recent change to data in the DailyOperations
         * collection.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dopsLastChangedBy(): Optional<String> =
            dopsLastChangedBy.getOptional("dopsLastChangedBy")

        /**
         * The datetime of the most recent change made to data in the DailyOperations collection, in
         * ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dopsLastChangedDate(): Optional<OffsetDateTime> =
            dopsLastChangedDate.getOptional("dopsLastChangedDate")

        /**
         * The reason for the most recent change to data in the dailyOperations collection.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dopsLastChangedReason(): Optional<String> =
            dopsLastChangedReason.getOptional("dopsLastChangedReason")

        /**
         * Id of the associated launchSite entity.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idLaunchSite(): Optional<String> = idLaunchSite.getOptional("idLaunchSite")

        /**
         * Collection providing maximum on ground (MOG) information for specific aircraft at the
         * site associated with this SiteOperations record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maximumOnGrounds(): Optional<List<MaximumOnGround>> =
            maximumOnGrounds.getOptional("maximumOnGrounds")

        /**
         * The name of the person who made the most recent change to data in the MaximumOnGrounds
         * collection.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun mogsLastChangedBy(): Optional<String> =
            mogsLastChangedBy.getOptional("mogsLastChangedBy")

        /**
         * The datetime of the most recent change made to data in the MaximumOnGrounds collection,
         * in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun mogsLastChangedDate(): Optional<OffsetDateTime> =
            mogsLastChangedDate.getOptional("mogsLastChangedDate")

        /**
         * The reason for the most recent change to data in the MaximumOnGrounds collection.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun mogsLastChangedReason(): Optional<String> =
            mogsLastChangedReason.getOptional("mogsLastChangedReason")

        /**
         * Collection providing relevant information in the event of deviations/exceptions to normal
         * operations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun operationalDeviations(): Optional<List<OperationalDeviation>> =
            operationalDeviations.getOptional("operationalDeviations")

        /**
         * Collection of planning information associated with this SiteOperations record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun operationalPlannings(): Optional<List<OperationalPlanning>> =
            operationalPlannings.getOptional("operationalPlannings")

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
         * Collection detailing operational pathways at the Site associated with this SiteOperations
         * record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pathways(): Optional<List<Pathway>> = pathways.getOptional("pathways")

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
         * Collection documenting operational waivers that have been issued for the Site associated
         * with this record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun waivers(): Optional<List<Waiver>> = waivers.getOptional("waivers")

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
         * Returns the raw JSON value of [dailyOperations].
         *
         * Unlike [dailyOperations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dailyOperations")
        @ExcludeMissing
        fun _dailyOperations(): JsonField<List<DailyOperation>> = dailyOperations

        /**
         * Returns the raw JSON value of [dopsLastChangedBy].
         *
         * Unlike [dopsLastChangedBy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dopsLastChangedBy")
        @ExcludeMissing
        fun _dopsLastChangedBy(): JsonField<String> = dopsLastChangedBy

        /**
         * Returns the raw JSON value of [dopsLastChangedDate].
         *
         * Unlike [dopsLastChangedDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("dopsLastChangedDate")
        @ExcludeMissing
        fun _dopsLastChangedDate(): JsonField<OffsetDateTime> = dopsLastChangedDate

        /**
         * Returns the raw JSON value of [dopsLastChangedReason].
         *
         * Unlike [dopsLastChangedReason], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("dopsLastChangedReason")
        @ExcludeMissing
        fun _dopsLastChangedReason(): JsonField<String> = dopsLastChangedReason

        /**
         * Returns the raw JSON value of [idLaunchSite].
         *
         * Unlike [idLaunchSite], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idLaunchSite")
        @ExcludeMissing
        fun _idLaunchSite(): JsonField<String> = idLaunchSite

        /**
         * Returns the raw JSON value of [maximumOnGrounds].
         *
         * Unlike [maximumOnGrounds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximumOnGrounds")
        @ExcludeMissing
        fun _maximumOnGrounds(): JsonField<List<MaximumOnGround>> = maximumOnGrounds

        /**
         * Returns the raw JSON value of [mogsLastChangedBy].
         *
         * Unlike [mogsLastChangedBy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("mogsLastChangedBy")
        @ExcludeMissing
        fun _mogsLastChangedBy(): JsonField<String> = mogsLastChangedBy

        /**
         * Returns the raw JSON value of [mogsLastChangedDate].
         *
         * Unlike [mogsLastChangedDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("mogsLastChangedDate")
        @ExcludeMissing
        fun _mogsLastChangedDate(): JsonField<OffsetDateTime> = mogsLastChangedDate

        /**
         * Returns the raw JSON value of [mogsLastChangedReason].
         *
         * Unlike [mogsLastChangedReason], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("mogsLastChangedReason")
        @ExcludeMissing
        fun _mogsLastChangedReason(): JsonField<String> = mogsLastChangedReason

        /**
         * Returns the raw JSON value of [operationalDeviations].
         *
         * Unlike [operationalDeviations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("operationalDeviations")
        @ExcludeMissing
        fun _operationalDeviations(): JsonField<List<OperationalDeviation>> = operationalDeviations

        /**
         * Returns the raw JSON value of [operationalPlannings].
         *
         * Unlike [operationalPlannings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("operationalPlannings")
        @ExcludeMissing
        fun _operationalPlannings(): JsonField<List<OperationalPlanning>> = operationalPlannings

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
         * Returns the raw JSON value of [pathways].
         *
         * Unlike [pathways], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pathways")
        @ExcludeMissing
        fun _pathways(): JsonField<List<Pathway>> = pathways

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

        /**
         * Returns the raw JSON value of [waivers].
         *
         * Unlike [waivers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("waivers") @ExcludeMissing fun _waivers(): JsonField<List<Waiver>> = waivers

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
             * .idSite()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var idSite: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var dailyOperations: JsonField<MutableList<DailyOperation>>? = null
            private var dopsLastChangedBy: JsonField<String> = JsonMissing.of()
            private var dopsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dopsLastChangedReason: JsonField<String> = JsonMissing.of()
            private var idLaunchSite: JsonField<String> = JsonMissing.of()
            private var maximumOnGrounds: JsonField<MutableList<MaximumOnGround>>? = null
            private var mogsLastChangedBy: JsonField<String> = JsonMissing.of()
            private var mogsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var mogsLastChangedReason: JsonField<String> = JsonMissing.of()
            private var operationalDeviations: JsonField<MutableList<OperationalDeviation>>? = null
            private var operationalPlannings: JsonField<MutableList<OperationalPlanning>>? = null
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var pathways: JsonField<MutableList<Pathway>>? = null
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var waivers: JsonField<MutableList<Waiver>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                idSite = body.idSite
                source = body.source
                id = body.id
                createdAt = body.createdAt
                createdBy = body.createdBy
                dailyOperations = body.dailyOperations.map { it.toMutableList() }
                dopsLastChangedBy = body.dopsLastChangedBy
                dopsLastChangedDate = body.dopsLastChangedDate
                dopsLastChangedReason = body.dopsLastChangedReason
                idLaunchSite = body.idLaunchSite
                maximumOnGrounds = body.maximumOnGrounds.map { it.toMutableList() }
                mogsLastChangedBy = body.mogsLastChangedBy
                mogsLastChangedDate = body.mogsLastChangedDate
                mogsLastChangedReason = body.mogsLastChangedReason
                operationalDeviations = body.operationalDeviations.map { it.toMutableList() }
                operationalPlannings = body.operationalPlannings.map { it.toMutableList() }
                origin = body.origin
                origNetwork = body.origNetwork
                pathways = body.pathways.map { it.toMutableList() }
                sourceDl = body.sourceDl
                updatedAt = body.updatedAt
                updatedBy = body.updatedBy
                waivers = body.waivers.map { it.toMutableList() }
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
             * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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

            /** The ID of the parent site. */
            fun idSite(idSite: String) = idSite(JsonField.of(idSite))

            /**
             * Sets [Builder.idSite] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSite] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSite(idSite: JsonField<String>) = apply { this.idSite = idSite }

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

            /**
             * Collection providing hours of operation and other information specific to a day of
             * the week.
             */
            fun dailyOperations(dailyOperations: List<DailyOperation>) =
                dailyOperations(JsonField.of(dailyOperations))

            /**
             * Sets [Builder.dailyOperations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dailyOperations] with a well-typed
             * `List<DailyOperation>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun dailyOperations(dailyOperations: JsonField<List<DailyOperation>>) = apply {
                this.dailyOperations = dailyOperations.map { it.toMutableList() }
            }

            /**
             * Adds a single [DailyOperation] to [dailyOperations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDailyOperation(dailyOperation: DailyOperation) = apply {
                dailyOperations =
                    (dailyOperations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dailyOperations", it).add(dailyOperation)
                    }
            }

            /**
             * The name of the person who made the most recent change to data in the DailyOperations
             * collection.
             */
            fun dopsLastChangedBy(dopsLastChangedBy: String) =
                dopsLastChangedBy(JsonField.of(dopsLastChangedBy))

            /**
             * Sets [Builder.dopsLastChangedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dopsLastChangedBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dopsLastChangedBy(dopsLastChangedBy: JsonField<String>) = apply {
                this.dopsLastChangedBy = dopsLastChangedBy
            }

            /**
             * The datetime of the most recent change made to data in the DailyOperations
             * collection, in ISO 8601 UTC format with millisecond precision.
             */
            fun dopsLastChangedDate(dopsLastChangedDate: OffsetDateTime) =
                dopsLastChangedDate(JsonField.of(dopsLastChangedDate))

            /**
             * Sets [Builder.dopsLastChangedDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dopsLastChangedDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun dopsLastChangedDate(dopsLastChangedDate: JsonField<OffsetDateTime>) = apply {
                this.dopsLastChangedDate = dopsLastChangedDate
            }

            /** The reason for the most recent change to data in the dailyOperations collection. */
            fun dopsLastChangedReason(dopsLastChangedReason: String) =
                dopsLastChangedReason(JsonField.of(dopsLastChangedReason))

            /**
             * Sets [Builder.dopsLastChangedReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dopsLastChangedReason] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dopsLastChangedReason(dopsLastChangedReason: JsonField<String>) = apply {
                this.dopsLastChangedReason = dopsLastChangedReason
            }

            /** Id of the associated launchSite entity. */
            fun idLaunchSite(idLaunchSite: String) = idLaunchSite(JsonField.of(idLaunchSite))

            /**
             * Sets [Builder.idLaunchSite] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idLaunchSite] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idLaunchSite(idLaunchSite: JsonField<String>) = apply {
                this.idLaunchSite = idLaunchSite
            }

            /**
             * Collection providing maximum on ground (MOG) information for specific aircraft at the
             * site associated with this SiteOperations record.
             */
            fun maximumOnGrounds(maximumOnGrounds: List<MaximumOnGround>) =
                maximumOnGrounds(JsonField.of(maximumOnGrounds))

            /**
             * Sets [Builder.maximumOnGrounds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumOnGrounds] with a well-typed
             * `List<MaximumOnGround>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun maximumOnGrounds(maximumOnGrounds: JsonField<List<MaximumOnGround>>) = apply {
                this.maximumOnGrounds = maximumOnGrounds.map { it.toMutableList() }
            }

            /**
             * Adds a single [MaximumOnGround] to [maximumOnGrounds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMaximumOnGround(maximumOnGround: MaximumOnGround) = apply {
                maximumOnGrounds =
                    (maximumOnGrounds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("maximumOnGrounds", it).add(maximumOnGround)
                    }
            }

            /**
             * The name of the person who made the most recent change to data in the
             * MaximumOnGrounds collection.
             */
            fun mogsLastChangedBy(mogsLastChangedBy: String) =
                mogsLastChangedBy(JsonField.of(mogsLastChangedBy))

            /**
             * Sets [Builder.mogsLastChangedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mogsLastChangedBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mogsLastChangedBy(mogsLastChangedBy: JsonField<String>) = apply {
                this.mogsLastChangedBy = mogsLastChangedBy
            }

            /**
             * The datetime of the most recent change made to data in the MaximumOnGrounds
             * collection, in ISO 8601 UTC format with millisecond precision.
             */
            fun mogsLastChangedDate(mogsLastChangedDate: OffsetDateTime) =
                mogsLastChangedDate(JsonField.of(mogsLastChangedDate))

            /**
             * Sets [Builder.mogsLastChangedDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mogsLastChangedDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun mogsLastChangedDate(mogsLastChangedDate: JsonField<OffsetDateTime>) = apply {
                this.mogsLastChangedDate = mogsLastChangedDate
            }

            /** The reason for the most recent change to data in the MaximumOnGrounds collection. */
            fun mogsLastChangedReason(mogsLastChangedReason: String) =
                mogsLastChangedReason(JsonField.of(mogsLastChangedReason))

            /**
             * Sets [Builder.mogsLastChangedReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mogsLastChangedReason] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mogsLastChangedReason(mogsLastChangedReason: JsonField<String>) = apply {
                this.mogsLastChangedReason = mogsLastChangedReason
            }

            /**
             * Collection providing relevant information in the event of deviations/exceptions to
             * normal operations.
             */
            fun operationalDeviations(operationalDeviations: List<OperationalDeviation>) =
                operationalDeviations(JsonField.of(operationalDeviations))

            /**
             * Sets [Builder.operationalDeviations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operationalDeviations] with a well-typed
             * `List<OperationalDeviation>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun operationalDeviations(
                operationalDeviations: JsonField<List<OperationalDeviation>>
            ) = apply {
                this.operationalDeviations = operationalDeviations.map { it.toMutableList() }
            }

            /**
             * Adds a single [OperationalDeviation] to [operationalDeviations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOperationalDeviation(operationalDeviation: OperationalDeviation) = apply {
                operationalDeviations =
                    (operationalDeviations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("operationalDeviations", it).add(operationalDeviation)
                    }
            }

            /** Collection of planning information associated with this SiteOperations record. */
            fun operationalPlannings(operationalPlannings: List<OperationalPlanning>) =
                operationalPlannings(JsonField.of(operationalPlannings))

            /**
             * Sets [Builder.operationalPlannings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operationalPlannings] with a well-typed
             * `List<OperationalPlanning>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun operationalPlannings(operationalPlannings: JsonField<List<OperationalPlanning>>) =
                apply {
                    this.operationalPlannings = operationalPlannings.map { it.toMutableList() }
                }

            /**
             * Adds a single [OperationalPlanning] to [operationalPlannings].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOperationalPlanning(operationalPlanning: OperationalPlanning) = apply {
                operationalPlannings =
                    (operationalPlannings ?: JsonField.of(mutableListOf())).also {
                        checkKnown("operationalPlannings", it).add(operationalPlanning)
                    }
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
             * Collection detailing operational pathways at the Site associated with this
             * SiteOperations record.
             */
            fun pathways(pathways: List<Pathway>) = pathways(JsonField.of(pathways))

            /**
             * Sets [Builder.pathways] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pathways] with a well-typed `List<Pathway>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pathways(pathways: JsonField<List<Pathway>>) = apply {
                this.pathways = pathways.map { it.toMutableList() }
            }

            /**
             * Adds a single [Pathway] to [pathways].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPathway(pathway: Pathway) = apply {
                pathways =
                    (pathways ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pathways", it).add(pathway)
                    }
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
             * Collection documenting operational waivers that have been issued for the Site
             * associated with this record.
             */
            fun waivers(waivers: List<Waiver>) = waivers(JsonField.of(waivers))

            /**
             * Sets [Builder.waivers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waivers] with a well-typed `List<Waiver>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waivers(waivers: JsonField<List<Waiver>>) = apply {
                this.waivers = waivers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Waiver] to [waivers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWaiver(waiver: Waiver) = apply {
                waivers =
                    (waivers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("waivers", it).add(waiver)
                    }
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
             * Returns an immutable instance of [Body].
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
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("idSite", idSite),
                    checkRequired("source", source),
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

        fun validate(): Body = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (dailyOperations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (dopsLastChangedBy.asKnown().isPresent) 1 else 0) +
                (if (dopsLastChangedDate.asKnown().isPresent) 1 else 0) +
                (if (dopsLastChangedReason.asKnown().isPresent) 1 else 0) +
                (if (idLaunchSite.asKnown().isPresent) 1 else 0) +
                (maximumOnGrounds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (mogsLastChangedBy.asKnown().isPresent) 1 else 0) +
                (if (mogsLastChangedDate.asKnown().isPresent) 1 else 0) +
                (if (mogsLastChangedReason.asKnown().isPresent) 1 else 0) +
                (operationalDeviations.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (operationalPlannings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (pathways.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (sourceDl.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0) +
                (waivers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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

        /**
         * Collection providing hours of operation and other information specific to a day of the
         * week.
         */
        class DailyOperation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val dayOfWeek: JsonField<DayOfWeek>,
            private val operatingHours: JsonField<List<OperatingHour>>,
            private val operationName: JsonField<String>,
            private val ophrsLastChangedBy: JsonField<String>,
            private val ophrsLastChangedDate: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("dayOfWeek")
                @ExcludeMissing
                dayOfWeek: JsonField<DayOfWeek> = JsonMissing.of(),
                @JsonProperty("operatingHours")
                @ExcludeMissing
                operatingHours: JsonField<List<OperatingHour>> = JsonMissing.of(),
                @JsonProperty("operationName")
                @ExcludeMissing
                operationName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ophrsLastChangedBy")
                @ExcludeMissing
                ophrsLastChangedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ophrsLastChangedDate")
                @ExcludeMissing
                ophrsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                dayOfWeek,
                operatingHours,
                operationName,
                ophrsLastChangedBy,
                ophrsLastChangedDate,
                mutableMapOf(),
            )

            /**
             * The day of the week to which this operational information pertains.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun dayOfWeek(): Optional<DayOfWeek> = dayOfWeek.getOptional("dayOfWeek")

            /**
             * A collection containing the operational start and stop times scheduled for the day of
             * the week specified.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun operatingHours(): Optional<List<OperatingHour>> =
                operatingHours.getOptional("operatingHours")

            /**
             * The name or type of operation to which this information pertains.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun operationName(): Optional<String> = operationName.getOptional("operationName")

            /**
             * The name of the person who made the most recent change to this DailyOperation data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ophrsLastChangedBy(): Optional<String> =
                ophrsLastChangedBy.getOptional("ophrsLastChangedBy")

            /**
             * The datetime of the most recent change made to this DailyOperation data, in ISO 8601
             * UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ophrsLastChangedDate(): Optional<OffsetDateTime> =
                ophrsLastChangedDate.getOptional("ophrsLastChangedDate")

            /**
             * Returns the raw JSON value of [dayOfWeek].
             *
             * Unlike [dayOfWeek], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dayOfWeek")
            @ExcludeMissing
            fun _dayOfWeek(): JsonField<DayOfWeek> = dayOfWeek

            /**
             * Returns the raw JSON value of [operatingHours].
             *
             * Unlike [operatingHours], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("operatingHours")
            @ExcludeMissing
            fun _operatingHours(): JsonField<List<OperatingHour>> = operatingHours

            /**
             * Returns the raw JSON value of [operationName].
             *
             * Unlike [operationName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operationName")
            @ExcludeMissing
            fun _operationName(): JsonField<String> = operationName

            /**
             * Returns the raw JSON value of [ophrsLastChangedBy].
             *
             * Unlike [ophrsLastChangedBy], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ophrsLastChangedBy")
            @ExcludeMissing
            fun _ophrsLastChangedBy(): JsonField<String> = ophrsLastChangedBy

            /**
             * Returns the raw JSON value of [ophrsLastChangedDate].
             *
             * Unlike [ophrsLastChangedDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ophrsLastChangedDate")
            @ExcludeMissing
            fun _ophrsLastChangedDate(): JsonField<OffsetDateTime> = ophrsLastChangedDate

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

                /** Returns a mutable builder for constructing an instance of [DailyOperation]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DailyOperation]. */
            class Builder internal constructor() {

                private var dayOfWeek: JsonField<DayOfWeek> = JsonMissing.of()
                private var operatingHours: JsonField<MutableList<OperatingHour>>? = null
                private var operationName: JsonField<String> = JsonMissing.of()
                private var ophrsLastChangedBy: JsonField<String> = JsonMissing.of()
                private var ophrsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dailyOperation: DailyOperation) = apply {
                    dayOfWeek = dailyOperation.dayOfWeek
                    operatingHours = dailyOperation.operatingHours.map { it.toMutableList() }
                    operationName = dailyOperation.operationName
                    ophrsLastChangedBy = dailyOperation.ophrsLastChangedBy
                    ophrsLastChangedDate = dailyOperation.ophrsLastChangedDate
                    additionalProperties = dailyOperation.additionalProperties.toMutableMap()
                }

                /** The day of the week to which this operational information pertains. */
                fun dayOfWeek(dayOfWeek: DayOfWeek) = dayOfWeek(JsonField.of(dayOfWeek))

                /**
                 * Sets [Builder.dayOfWeek] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dayOfWeek] with a well-typed [DayOfWeek] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dayOfWeek(dayOfWeek: JsonField<DayOfWeek>) = apply {
                    this.dayOfWeek = dayOfWeek
                }

                /**
                 * A collection containing the operational start and stop times scheduled for the
                 * day of the week specified.
                 */
                fun operatingHours(operatingHours: List<OperatingHour>) =
                    operatingHours(JsonField.of(operatingHours))

                /**
                 * Sets [Builder.operatingHours] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operatingHours] with a well-typed
                 * `List<OperatingHour>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun operatingHours(operatingHours: JsonField<List<OperatingHour>>) = apply {
                    this.operatingHours = operatingHours.map { it.toMutableList() }
                }

                /**
                 * Adds a single [OperatingHour] to [operatingHours].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addOperatingHour(operatingHour: OperatingHour) = apply {
                    operatingHours =
                        (operatingHours ?: JsonField.of(mutableListOf())).also {
                            checkKnown("operatingHours", it).add(operatingHour)
                        }
                }

                /** The name or type of operation to which this information pertains. */
                fun operationName(operationName: String) =
                    operationName(JsonField.of(operationName))

                /**
                 * Sets [Builder.operationName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operationName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operationName(operationName: JsonField<String>) = apply {
                    this.operationName = operationName
                }

                /**
                 * The name of the person who made the most recent change to this DailyOperation
                 * data.
                 */
                fun ophrsLastChangedBy(ophrsLastChangedBy: String) =
                    ophrsLastChangedBy(JsonField.of(ophrsLastChangedBy))

                /**
                 * Sets [Builder.ophrsLastChangedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ophrsLastChangedBy] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ophrsLastChangedBy(ophrsLastChangedBy: JsonField<String>) = apply {
                    this.ophrsLastChangedBy = ophrsLastChangedBy
                }

                /**
                 * The datetime of the most recent change made to this DailyOperation data, in ISO
                 * 8601 UTC format with millisecond precision.
                 */
                fun ophrsLastChangedDate(ophrsLastChangedDate: OffsetDateTime) =
                    ophrsLastChangedDate(JsonField.of(ophrsLastChangedDate))

                /**
                 * Sets [Builder.ophrsLastChangedDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ophrsLastChangedDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun ophrsLastChangedDate(ophrsLastChangedDate: JsonField<OffsetDateTime>) = apply {
                    this.ophrsLastChangedDate = ophrsLastChangedDate
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
                 * Returns an immutable instance of [DailyOperation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DailyOperation =
                    DailyOperation(
                        dayOfWeek,
                        (operatingHours ?: JsonMissing.of()).map { it.toImmutable() },
                        operationName,
                        ophrsLastChangedBy,
                        ophrsLastChangedDate,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DailyOperation = apply {
                if (validated) {
                    return@apply
                }

                dayOfWeek().ifPresent { it.validate() }
                operatingHours().ifPresent { it.forEach { it.validate() } }
                operationName()
                ophrsLastChangedBy()
                ophrsLastChangedDate()
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
                (dayOfWeek.asKnown().getOrNull()?.validity() ?: 0) +
                    (operatingHours.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (operationName.asKnown().isPresent) 1 else 0) +
                    (if (ophrsLastChangedBy.asKnown().isPresent) 1 else 0) +
                    (if (ophrsLastChangedDate.asKnown().isPresent) 1 else 0)

            /** The day of the week to which this operational information pertains. */
            class DayOfWeek @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MONDAY = of("MONDAY")

                    @JvmField val TUESDAY = of("TUESDAY")

                    @JvmField val WEDNESDAY = of("WEDNESDAY")

                    @JvmField val THURSDAY = of("THURSDAY")

                    @JvmField val FRIDAY = of("FRIDAY")

                    @JvmField val SATURDAY = of("SATURDAY")

                    @JvmField val SUNDAY = of("SUNDAY")

                    @JvmStatic fun of(value: String) = DayOfWeek(JsonField.of(value))
                }

                /** An enum containing [DayOfWeek]'s known values. */
                enum class Known {
                    MONDAY,
                    TUESDAY,
                    WEDNESDAY,
                    THURSDAY,
                    FRIDAY,
                    SATURDAY,
                    SUNDAY,
                }

                /**
                 * An enum containing [DayOfWeek]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [DayOfWeek] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MONDAY,
                    TUESDAY,
                    WEDNESDAY,
                    THURSDAY,
                    FRIDAY,
                    SATURDAY,
                    SUNDAY,
                    /**
                     * An enum member indicating that [DayOfWeek] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MONDAY -> Value.MONDAY
                        TUESDAY -> Value.TUESDAY
                        WEDNESDAY -> Value.WEDNESDAY
                        THURSDAY -> Value.THURSDAY
                        FRIDAY -> Value.FRIDAY
                        SATURDAY -> Value.SATURDAY
                        SUNDAY -> Value.SUNDAY
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value is
                 *   a not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        MONDAY -> Known.MONDAY
                        TUESDAY -> Known.TUESDAY
                        WEDNESDAY -> Known.WEDNESDAY
                        THURSDAY -> Known.THURSDAY
                        FRIDAY -> Known.FRIDAY
                        SATURDAY -> Known.SATURDAY
                        SUNDAY -> Known.SUNDAY
                        else ->
                            throw UnifieddatalibraryInvalidDataException(
                                "Unknown DayOfWeek: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value
                 *   does not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        UnifieddatalibraryInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): DayOfWeek = apply {
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

                    return other is DayOfWeek && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * A collection containing the operational start and stop times scheduled for the day of
             * the week specified.
             */
            class OperatingHour
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val opStartTime: JsonField<String>,
                private val opStopTime: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("opStartTime")
                    @ExcludeMissing
                    opStartTime: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("opStopTime")
                    @ExcludeMissing
                    opStopTime: JsonField<String> = JsonMissing.of(),
                ) : this(opStartTime, opStopTime, mutableMapOf())

                /**
                 * The Zulu (UTC) operational start time, expressed in ISO 8601 format as HH:MM.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun opStartTime(): Optional<String> = opStartTime.getOptional("opStartTime")

                /**
                 * The Zulu (UTC) operational stop time, expressed in ISO 8601 format as HH:MM.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun opStopTime(): Optional<String> = opStopTime.getOptional("opStopTime")

                /**
                 * Returns the raw JSON value of [opStartTime].
                 *
                 * Unlike [opStartTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("opStartTime")
                @ExcludeMissing
                fun _opStartTime(): JsonField<String> = opStartTime

                /**
                 * Returns the raw JSON value of [opStopTime].
                 *
                 * Unlike [opStopTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("opStopTime")
                @ExcludeMissing
                fun _opStopTime(): JsonField<String> = opStopTime

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
                     * Returns a mutable builder for constructing an instance of [OperatingHour].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [OperatingHour]. */
                class Builder internal constructor() {

                    private var opStartTime: JsonField<String> = JsonMissing.of()
                    private var opStopTime: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(operatingHour: OperatingHour) = apply {
                        opStartTime = operatingHour.opStartTime
                        opStopTime = operatingHour.opStopTime
                        additionalProperties = operatingHour.additionalProperties.toMutableMap()
                    }

                    /**
                     * The Zulu (UTC) operational start time, expressed in ISO 8601 format as HH:MM.
                     */
                    fun opStartTime(opStartTime: String) = opStartTime(JsonField.of(opStartTime))

                    /**
                     * Sets [Builder.opStartTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.opStartTime] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun opStartTime(opStartTime: JsonField<String>) = apply {
                        this.opStartTime = opStartTime
                    }

                    /**
                     * The Zulu (UTC) operational stop time, expressed in ISO 8601 format as HH:MM.
                     */
                    fun opStopTime(opStopTime: String) = opStopTime(JsonField.of(opStopTime))

                    /**
                     * Sets [Builder.opStopTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.opStopTime] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun opStopTime(opStopTime: JsonField<String>) = apply {
                        this.opStopTime = opStopTime
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
                     * Returns an immutable instance of [OperatingHour].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): OperatingHour =
                        OperatingHour(opStartTime, opStopTime, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): OperatingHour = apply {
                    if (validated) {
                        return@apply
                    }

                    opStartTime()
                    opStopTime()
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
                    (if (opStartTime.asKnown().isPresent) 1 else 0) +
                        (if (opStopTime.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is OperatingHour &&
                        opStartTime == other.opStartTime &&
                        opStopTime == other.opStopTime &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(opStartTime, opStopTime, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OperatingHour{opStartTime=$opStartTime, opStopTime=$opStopTime, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DailyOperation &&
                    dayOfWeek == other.dayOfWeek &&
                    operatingHours == other.operatingHours &&
                    operationName == other.operationName &&
                    ophrsLastChangedBy == other.ophrsLastChangedBy &&
                    ophrsLastChangedDate == other.ophrsLastChangedDate &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    dayOfWeek,
                    operatingHours,
                    operationName,
                    ophrsLastChangedBy,
                    ophrsLastChangedDate,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DailyOperation{dayOfWeek=$dayOfWeek, operatingHours=$operatingHours, operationName=$operationName, ophrsLastChangedBy=$ophrsLastChangedBy, ophrsLastChangedDate=$ophrsLastChangedDate, additionalProperties=$additionalProperties}"
        }

        /**
         * Collection providing maximum on ground (MOG) information for specific aircraft at the
         * site associated with this SiteOperations record.
         */
        class MaximumOnGround
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val aircraftMds: JsonField<String>,
            private val contingencyMog: JsonField<Int>,
            private val mogLastChangedBy: JsonField<String>,
            private val mogLastChangedDate: JsonField<OffsetDateTime>,
            private val wideParkingMog: JsonField<Int>,
            private val wideWorkingMog: JsonField<Int>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("aircraftMDS")
                @ExcludeMissing
                aircraftMds: JsonField<String> = JsonMissing.of(),
                @JsonProperty("contingencyMOG")
                @ExcludeMissing
                contingencyMog: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("mogLastChangedBy")
                @ExcludeMissing
                mogLastChangedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("mogLastChangedDate")
                @ExcludeMissing
                mogLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("wideParkingMOG")
                @ExcludeMissing
                wideParkingMog: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("wideWorkingMOG")
                @ExcludeMissing
                wideWorkingMog: JsonField<Int> = JsonMissing.of(),
            ) : this(
                aircraftMds,
                contingencyMog,
                mogLastChangedBy,
                mogLastChangedDate,
                wideParkingMog,
                wideWorkingMog,
                mutableMapOf(),
            )

            /**
             * The Model Design Series (MDS) designation of the aircraft to which this maximum on
             * ground (MOG) data pertains.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun aircraftMds(): Optional<String> = aircraftMds.getOptional("aircraftMDS")

            /**
             * Maximum on ground (MOG) number of contingent aircraft based on spacing and manpower,
             * for the aircraft type specified.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun contingencyMog(): Optional<Int> = contingencyMog.getOptional("contingencyMOG")

            /**
             * The name of the person who made the most recent change to this maximum on ground
             * data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun mogLastChangedBy(): Optional<String> =
                mogLastChangedBy.getOptional("mogLastChangedBy")

            /**
             * The datetime of the most recent change made to this maximum on ground data, in ISO
             * 8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun mogLastChangedDate(): Optional<OffsetDateTime> =
                mogLastChangedDate.getOptional("mogLastChangedDate")

            /**
             * Maximum on ground (MOG) number of parking wide-body aircraft based on spacing and
             * manpower, for the aircraft type specified.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun wideParkingMog(): Optional<Int> = wideParkingMog.getOptional("wideParkingMOG")

            /**
             * Maximum on ground (MOG) number of working wide-body aircraft based on spacing and
             * manpower, for the aircraft type specified.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun wideWorkingMog(): Optional<Int> = wideWorkingMog.getOptional("wideWorkingMOG")

            /**
             * Returns the raw JSON value of [aircraftMds].
             *
             * Unlike [aircraftMds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("aircraftMDS")
            @ExcludeMissing
            fun _aircraftMds(): JsonField<String> = aircraftMds

            /**
             * Returns the raw JSON value of [contingencyMog].
             *
             * Unlike [contingencyMog], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("contingencyMOG")
            @ExcludeMissing
            fun _contingencyMog(): JsonField<Int> = contingencyMog

            /**
             * Returns the raw JSON value of [mogLastChangedBy].
             *
             * Unlike [mogLastChangedBy], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mogLastChangedBy")
            @ExcludeMissing
            fun _mogLastChangedBy(): JsonField<String> = mogLastChangedBy

            /**
             * Returns the raw JSON value of [mogLastChangedDate].
             *
             * Unlike [mogLastChangedDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mogLastChangedDate")
            @ExcludeMissing
            fun _mogLastChangedDate(): JsonField<OffsetDateTime> = mogLastChangedDate

            /**
             * Returns the raw JSON value of [wideParkingMog].
             *
             * Unlike [wideParkingMog], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("wideParkingMOG")
            @ExcludeMissing
            fun _wideParkingMog(): JsonField<Int> = wideParkingMog

            /**
             * Returns the raw JSON value of [wideWorkingMog].
             *
             * Unlike [wideWorkingMog], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("wideWorkingMOG")
            @ExcludeMissing
            fun _wideWorkingMog(): JsonField<Int> = wideWorkingMog

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

                /** Returns a mutable builder for constructing an instance of [MaximumOnGround]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MaximumOnGround]. */
            class Builder internal constructor() {

                private var aircraftMds: JsonField<String> = JsonMissing.of()
                private var contingencyMog: JsonField<Int> = JsonMissing.of()
                private var mogLastChangedBy: JsonField<String> = JsonMissing.of()
                private var mogLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var wideParkingMog: JsonField<Int> = JsonMissing.of()
                private var wideWorkingMog: JsonField<Int> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(maximumOnGround: MaximumOnGround) = apply {
                    aircraftMds = maximumOnGround.aircraftMds
                    contingencyMog = maximumOnGround.contingencyMog
                    mogLastChangedBy = maximumOnGround.mogLastChangedBy
                    mogLastChangedDate = maximumOnGround.mogLastChangedDate
                    wideParkingMog = maximumOnGround.wideParkingMog
                    wideWorkingMog = maximumOnGround.wideWorkingMog
                    additionalProperties = maximumOnGround.additionalProperties.toMutableMap()
                }

                /**
                 * The Model Design Series (MDS) designation of the aircraft to which this maximum
                 * on ground (MOG) data pertains.
                 */
                fun aircraftMds(aircraftMds: String) = aircraftMds(JsonField.of(aircraftMds))

                /**
                 * Sets [Builder.aircraftMds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aircraftMds] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun aircraftMds(aircraftMds: JsonField<String>) = apply {
                    this.aircraftMds = aircraftMds
                }

                /**
                 * Maximum on ground (MOG) number of contingent aircraft based on spacing and
                 * manpower, for the aircraft type specified.
                 */
                fun contingencyMog(contingencyMog: Int) =
                    contingencyMog(JsonField.of(contingencyMog))

                /**
                 * Sets [Builder.contingencyMog] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contingencyMog] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contingencyMog(contingencyMog: JsonField<Int>) = apply {
                    this.contingencyMog = contingencyMog
                }

                /**
                 * The name of the person who made the most recent change to this maximum on ground
                 * data.
                 */
                fun mogLastChangedBy(mogLastChangedBy: String) =
                    mogLastChangedBy(JsonField.of(mogLastChangedBy))

                /**
                 * Sets [Builder.mogLastChangedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mogLastChangedBy] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mogLastChangedBy(mogLastChangedBy: JsonField<String>) = apply {
                    this.mogLastChangedBy = mogLastChangedBy
                }

                /**
                 * The datetime of the most recent change made to this maximum on ground data, in
                 * ISO 8601 UTC format with millisecond precision.
                 */
                fun mogLastChangedDate(mogLastChangedDate: OffsetDateTime) =
                    mogLastChangedDate(JsonField.of(mogLastChangedDate))

                /**
                 * Sets [Builder.mogLastChangedDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mogLastChangedDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun mogLastChangedDate(mogLastChangedDate: JsonField<OffsetDateTime>) = apply {
                    this.mogLastChangedDate = mogLastChangedDate
                }

                /**
                 * Maximum on ground (MOG) number of parking wide-body aircraft based on spacing and
                 * manpower, for the aircraft type specified.
                 */
                fun wideParkingMog(wideParkingMog: Int) =
                    wideParkingMog(JsonField.of(wideParkingMog))

                /**
                 * Sets [Builder.wideParkingMog] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.wideParkingMog] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun wideParkingMog(wideParkingMog: JsonField<Int>) = apply {
                    this.wideParkingMog = wideParkingMog
                }

                /**
                 * Maximum on ground (MOG) number of working wide-body aircraft based on spacing and
                 * manpower, for the aircraft type specified.
                 */
                fun wideWorkingMog(wideWorkingMog: Int) =
                    wideWorkingMog(JsonField.of(wideWorkingMog))

                /**
                 * Sets [Builder.wideWorkingMog] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.wideWorkingMog] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun wideWorkingMog(wideWorkingMog: JsonField<Int>) = apply {
                    this.wideWorkingMog = wideWorkingMog
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
                 * Returns an immutable instance of [MaximumOnGround].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): MaximumOnGround =
                    MaximumOnGround(
                        aircraftMds,
                        contingencyMog,
                        mogLastChangedBy,
                        mogLastChangedDate,
                        wideParkingMog,
                        wideWorkingMog,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MaximumOnGround = apply {
                if (validated) {
                    return@apply
                }

                aircraftMds()
                contingencyMog()
                mogLastChangedBy()
                mogLastChangedDate()
                wideParkingMog()
                wideWorkingMog()
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
                (if (aircraftMds.asKnown().isPresent) 1 else 0) +
                    (if (contingencyMog.asKnown().isPresent) 1 else 0) +
                    (if (mogLastChangedBy.asKnown().isPresent) 1 else 0) +
                    (if (mogLastChangedDate.asKnown().isPresent) 1 else 0) +
                    (if (wideParkingMog.asKnown().isPresent) 1 else 0) +
                    (if (wideWorkingMog.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MaximumOnGround &&
                    aircraftMds == other.aircraftMds &&
                    contingencyMog == other.contingencyMog &&
                    mogLastChangedBy == other.mogLastChangedBy &&
                    mogLastChangedDate == other.mogLastChangedDate &&
                    wideParkingMog == other.wideParkingMog &&
                    wideWorkingMog == other.wideWorkingMog &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    aircraftMds,
                    contingencyMog,
                    mogLastChangedBy,
                    mogLastChangedDate,
                    wideParkingMog,
                    wideWorkingMog,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MaximumOnGround{aircraftMds=$aircraftMds, contingencyMog=$contingencyMog, mogLastChangedBy=$mogLastChangedBy, mogLastChangedDate=$mogLastChangedDate, wideParkingMog=$wideParkingMog, wideWorkingMog=$wideWorkingMog, additionalProperties=$additionalProperties}"
        }

        /**
         * Collection providing relevant information in the event of deviations/exceptions to normal
         * operations.
         */
        class OperationalDeviation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val affectedAircraftMds: JsonField<String>,
            private val affectedMog: JsonField<Int>,
            private val aircraftOnGroundTime: JsonField<String>,
            private val crewRestTime: JsonField<String>,
            private val odLastChangedBy: JsonField<String>,
            private val odLastChangedDate: JsonField<OffsetDateTime>,
            private val odRemark: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("affectedAircraftMDS")
                @ExcludeMissing
                affectedAircraftMds: JsonField<String> = JsonMissing.of(),
                @JsonProperty("affectedMOG")
                @ExcludeMissing
                affectedMog: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("aircraftOnGroundTime")
                @ExcludeMissing
                aircraftOnGroundTime: JsonField<String> = JsonMissing.of(),
                @JsonProperty("crewRestTime")
                @ExcludeMissing
                crewRestTime: JsonField<String> = JsonMissing.of(),
                @JsonProperty("odLastChangedBy")
                @ExcludeMissing
                odLastChangedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("odLastChangedDate")
                @ExcludeMissing
                odLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("odRemark")
                @ExcludeMissing
                odRemark: JsonField<String> = JsonMissing.of(),
            ) : this(
                affectedAircraftMds,
                affectedMog,
                aircraftOnGroundTime,
                crewRestTime,
                odLastChangedBy,
                odLastChangedDate,
                odRemark,
                mutableMapOf(),
            )

            /**
             * The Model Design Series (MDS) designation of the aircraft affected by this
             * operational deviation.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun affectedAircraftMds(): Optional<String> =
                affectedAircraftMds.getOptional("affectedAircraftMDS")

            /**
             * The maximum on ground (MOG) number for aircraft affected by this operational
             * deviation.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun affectedMog(): Optional<Int> = affectedMog.getOptional("affectedMOG")

            /**
             * On ground time for aircraft affected by this operational deviation.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun aircraftOnGroundTime(): Optional<String> =
                aircraftOnGroundTime.getOptional("aircraftOnGroundTime")

            /**
             * Rest time for crew affected by this operational deviation.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun crewRestTime(): Optional<String> = crewRestTime.getOptional("crewRestTime")

            /**
             * The name of the person who made the most recent change to this OperationalDeviation
             * data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun odLastChangedBy(): Optional<String> = odLastChangedBy.getOptional("odLastChangedBy")

            /**
             * The datetime of the most recent change made to this OperationalDeviation data, in ISO
             * 8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun odLastChangedDate(): Optional<OffsetDateTime> =
                odLastChangedDate.getOptional("odLastChangedDate")

            /**
             * Text remark regarding this operational deviation.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun odRemark(): Optional<String> = odRemark.getOptional("odRemark")

            /**
             * Returns the raw JSON value of [affectedAircraftMds].
             *
             * Unlike [affectedAircraftMds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("affectedAircraftMDS")
            @ExcludeMissing
            fun _affectedAircraftMds(): JsonField<String> = affectedAircraftMds

            /**
             * Returns the raw JSON value of [affectedMog].
             *
             * Unlike [affectedMog], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("affectedMOG")
            @ExcludeMissing
            fun _affectedMog(): JsonField<Int> = affectedMog

            /**
             * Returns the raw JSON value of [aircraftOnGroundTime].
             *
             * Unlike [aircraftOnGroundTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("aircraftOnGroundTime")
            @ExcludeMissing
            fun _aircraftOnGroundTime(): JsonField<String> = aircraftOnGroundTime

            /**
             * Returns the raw JSON value of [crewRestTime].
             *
             * Unlike [crewRestTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("crewRestTime")
            @ExcludeMissing
            fun _crewRestTime(): JsonField<String> = crewRestTime

            /**
             * Returns the raw JSON value of [odLastChangedBy].
             *
             * Unlike [odLastChangedBy], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("odLastChangedBy")
            @ExcludeMissing
            fun _odLastChangedBy(): JsonField<String> = odLastChangedBy

            /**
             * Returns the raw JSON value of [odLastChangedDate].
             *
             * Unlike [odLastChangedDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("odLastChangedDate")
            @ExcludeMissing
            fun _odLastChangedDate(): JsonField<OffsetDateTime> = odLastChangedDate

            /**
             * Returns the raw JSON value of [odRemark].
             *
             * Unlike [odRemark], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("odRemark") @ExcludeMissing fun _odRemark(): JsonField<String> = odRemark

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
                 * Returns a mutable builder for constructing an instance of [OperationalDeviation].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OperationalDeviation]. */
            class Builder internal constructor() {

                private var affectedAircraftMds: JsonField<String> = JsonMissing.of()
                private var affectedMog: JsonField<Int> = JsonMissing.of()
                private var aircraftOnGroundTime: JsonField<String> = JsonMissing.of()
                private var crewRestTime: JsonField<String> = JsonMissing.of()
                private var odLastChangedBy: JsonField<String> = JsonMissing.of()
                private var odLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var odRemark: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(operationalDeviation: OperationalDeviation) = apply {
                    affectedAircraftMds = operationalDeviation.affectedAircraftMds
                    affectedMog = operationalDeviation.affectedMog
                    aircraftOnGroundTime = operationalDeviation.aircraftOnGroundTime
                    crewRestTime = operationalDeviation.crewRestTime
                    odLastChangedBy = operationalDeviation.odLastChangedBy
                    odLastChangedDate = operationalDeviation.odLastChangedDate
                    odRemark = operationalDeviation.odRemark
                    additionalProperties = operationalDeviation.additionalProperties.toMutableMap()
                }

                /**
                 * The Model Design Series (MDS) designation of the aircraft affected by this
                 * operational deviation.
                 */
                fun affectedAircraftMds(affectedAircraftMds: String) =
                    affectedAircraftMds(JsonField.of(affectedAircraftMds))

                /**
                 * Sets [Builder.affectedAircraftMds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.affectedAircraftMds] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun affectedAircraftMds(affectedAircraftMds: JsonField<String>) = apply {
                    this.affectedAircraftMds = affectedAircraftMds
                }

                /**
                 * The maximum on ground (MOG) number for aircraft affected by this operational
                 * deviation.
                 */
                fun affectedMog(affectedMog: Int) = affectedMog(JsonField.of(affectedMog))

                /**
                 * Sets [Builder.affectedMog] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.affectedMog] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun affectedMog(affectedMog: JsonField<Int>) = apply {
                    this.affectedMog = affectedMog
                }

                /** On ground time for aircraft affected by this operational deviation. */
                fun aircraftOnGroundTime(aircraftOnGroundTime: String) =
                    aircraftOnGroundTime(JsonField.of(aircraftOnGroundTime))

                /**
                 * Sets [Builder.aircraftOnGroundTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aircraftOnGroundTime] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun aircraftOnGroundTime(aircraftOnGroundTime: JsonField<String>) = apply {
                    this.aircraftOnGroundTime = aircraftOnGroundTime
                }

                /** Rest time for crew affected by this operational deviation. */
                fun crewRestTime(crewRestTime: String) = crewRestTime(JsonField.of(crewRestTime))

                /**
                 * Sets [Builder.crewRestTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.crewRestTime] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun crewRestTime(crewRestTime: JsonField<String>) = apply {
                    this.crewRestTime = crewRestTime
                }

                /**
                 * The name of the person who made the most recent change to this
                 * OperationalDeviation data.
                 */
                fun odLastChangedBy(odLastChangedBy: String) =
                    odLastChangedBy(JsonField.of(odLastChangedBy))

                /**
                 * Sets [Builder.odLastChangedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.odLastChangedBy] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun odLastChangedBy(odLastChangedBy: JsonField<String>) = apply {
                    this.odLastChangedBy = odLastChangedBy
                }

                /**
                 * The datetime of the most recent change made to this OperationalDeviation data, in
                 * ISO 8601 UTC format with millisecond precision.
                 */
                fun odLastChangedDate(odLastChangedDate: OffsetDateTime) =
                    odLastChangedDate(JsonField.of(odLastChangedDate))

                /**
                 * Sets [Builder.odLastChangedDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.odLastChangedDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun odLastChangedDate(odLastChangedDate: JsonField<OffsetDateTime>) = apply {
                    this.odLastChangedDate = odLastChangedDate
                }

                /** Text remark regarding this operational deviation. */
                fun odRemark(odRemark: String) = odRemark(JsonField.of(odRemark))

                /**
                 * Sets [Builder.odRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.odRemark] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun odRemark(odRemark: JsonField<String>) = apply { this.odRemark = odRemark }

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
                 * Returns an immutable instance of [OperationalDeviation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OperationalDeviation =
                    OperationalDeviation(
                        affectedAircraftMds,
                        affectedMog,
                        aircraftOnGroundTime,
                        crewRestTime,
                        odLastChangedBy,
                        odLastChangedDate,
                        odRemark,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OperationalDeviation = apply {
                if (validated) {
                    return@apply
                }

                affectedAircraftMds()
                affectedMog()
                aircraftOnGroundTime()
                crewRestTime()
                odLastChangedBy()
                odLastChangedDate()
                odRemark()
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
                (if (affectedAircraftMds.asKnown().isPresent) 1 else 0) +
                    (if (affectedMog.asKnown().isPresent) 1 else 0) +
                    (if (aircraftOnGroundTime.asKnown().isPresent) 1 else 0) +
                    (if (crewRestTime.asKnown().isPresent) 1 else 0) +
                    (if (odLastChangedBy.asKnown().isPresent) 1 else 0) +
                    (if (odLastChangedDate.asKnown().isPresent) 1 else 0) +
                    (if (odRemark.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OperationalDeviation &&
                    affectedAircraftMds == other.affectedAircraftMds &&
                    affectedMog == other.affectedMog &&
                    aircraftOnGroundTime == other.aircraftOnGroundTime &&
                    crewRestTime == other.crewRestTime &&
                    odLastChangedBy == other.odLastChangedBy &&
                    odLastChangedDate == other.odLastChangedDate &&
                    odRemark == other.odRemark &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    affectedAircraftMds,
                    affectedMog,
                    aircraftOnGroundTime,
                    crewRestTime,
                    odLastChangedBy,
                    odLastChangedDate,
                    odRemark,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OperationalDeviation{affectedAircraftMds=$affectedAircraftMds, affectedMog=$affectedMog, aircraftOnGroundTime=$aircraftOnGroundTime, crewRestTime=$crewRestTime, odLastChangedBy=$odLastChangedBy, odLastChangedDate=$odLastChangedDate, odRemark=$odRemark, additionalProperties=$additionalProperties}"
        }

        /** Collection of planning information associated with this SiteOperations record. */
        class OperationalPlanning
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val opEndDate: JsonField<OffsetDateTime>,
            private val opLastChangedBy: JsonField<String>,
            private val opLastChangedDate: JsonField<OffsetDateTime>,
            private val opRemark: JsonField<String>,
            private val opSource: JsonField<String>,
            private val opStartDate: JsonField<OffsetDateTime>,
            private val opStatus: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("opEndDate")
                @ExcludeMissing
                opEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("opLastChangedBy")
                @ExcludeMissing
                opLastChangedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("opLastChangedDate")
                @ExcludeMissing
                opLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("opRemark")
                @ExcludeMissing
                opRemark: JsonField<String> = JsonMissing.of(),
                @JsonProperty("opSource")
                @ExcludeMissing
                opSource: JsonField<String> = JsonMissing.of(),
                @JsonProperty("opStartDate")
                @ExcludeMissing
                opStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("opStatus")
                @ExcludeMissing
                opStatus: JsonField<String> = JsonMissing.of(),
            ) : this(
                opEndDate,
                opLastChangedBy,
                opLastChangedDate,
                opRemark,
                opSource,
                opStartDate,
                opStatus,
                mutableMapOf(),
            )

            /**
             * The end date of this operational planning, in ISO8601 UTC format with millisecond
             * precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun opEndDate(): Optional<OffsetDateTime> = opEndDate.getOptional("opEndDate")

            /**
             * The name of the person who made the most recent change made to this
             * OperationalPlanning data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun opLastChangedBy(): Optional<String> = opLastChangedBy.getOptional("opLastChangedBy")

            /**
             * The datetime of the most recent change made to this OperationalPlanning data, in
             * ISO8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun opLastChangedDate(): Optional<OffsetDateTime> =
                opLastChangedDate.getOptional("opLastChangedDate")

            /**
             * Remark text regarding this operation planning.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun opRemark(): Optional<String> = opRemark.getOptional("opRemark")

            /**
             * The person, unit, organization, etc. responsible for this operation planning.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun opSource(): Optional<String> = opSource.getOptional("opSource")

            /**
             * The start date of this operational planning, in ISO8601 UTC format with millisecond
             * precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun opStartDate(): Optional<OffsetDateTime> = opStartDate.getOptional("opStartDate")

            /**
             * The status of this operational planning.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun opStatus(): Optional<String> = opStatus.getOptional("opStatus")

            /**
             * Returns the raw JSON value of [opEndDate].
             *
             * Unlike [opEndDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("opEndDate")
            @ExcludeMissing
            fun _opEndDate(): JsonField<OffsetDateTime> = opEndDate

            /**
             * Returns the raw JSON value of [opLastChangedBy].
             *
             * Unlike [opLastChangedBy], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("opLastChangedBy")
            @ExcludeMissing
            fun _opLastChangedBy(): JsonField<String> = opLastChangedBy

            /**
             * Returns the raw JSON value of [opLastChangedDate].
             *
             * Unlike [opLastChangedDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("opLastChangedDate")
            @ExcludeMissing
            fun _opLastChangedDate(): JsonField<OffsetDateTime> = opLastChangedDate

            /**
             * Returns the raw JSON value of [opRemark].
             *
             * Unlike [opRemark], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("opRemark") @ExcludeMissing fun _opRemark(): JsonField<String> = opRemark

            /**
             * Returns the raw JSON value of [opSource].
             *
             * Unlike [opSource], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("opSource") @ExcludeMissing fun _opSource(): JsonField<String> = opSource

            /**
             * Returns the raw JSON value of [opStartDate].
             *
             * Unlike [opStartDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("opStartDate")
            @ExcludeMissing
            fun _opStartDate(): JsonField<OffsetDateTime> = opStartDate

            /**
             * Returns the raw JSON value of [opStatus].
             *
             * Unlike [opStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("opStatus") @ExcludeMissing fun _opStatus(): JsonField<String> = opStatus

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
                 * Returns a mutable builder for constructing an instance of [OperationalPlanning].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OperationalPlanning]. */
            class Builder internal constructor() {

                private var opEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var opLastChangedBy: JsonField<String> = JsonMissing.of()
                private var opLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var opRemark: JsonField<String> = JsonMissing.of()
                private var opSource: JsonField<String> = JsonMissing.of()
                private var opStartDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var opStatus: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(operationalPlanning: OperationalPlanning) = apply {
                    opEndDate = operationalPlanning.opEndDate
                    opLastChangedBy = operationalPlanning.opLastChangedBy
                    opLastChangedDate = operationalPlanning.opLastChangedDate
                    opRemark = operationalPlanning.opRemark
                    opSource = operationalPlanning.opSource
                    opStartDate = operationalPlanning.opStartDate
                    opStatus = operationalPlanning.opStatus
                    additionalProperties = operationalPlanning.additionalProperties.toMutableMap()
                }

                /**
                 * The end date of this operational planning, in ISO8601 UTC format with millisecond
                 * precision.
                 */
                fun opEndDate(opEndDate: OffsetDateTime) = opEndDate(JsonField.of(opEndDate))

                /**
                 * Sets [Builder.opEndDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.opEndDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun opEndDate(opEndDate: JsonField<OffsetDateTime>) = apply {
                    this.opEndDate = opEndDate
                }

                /**
                 * The name of the person who made the most recent change made to this
                 * OperationalPlanning data.
                 */
                fun opLastChangedBy(opLastChangedBy: String) =
                    opLastChangedBy(JsonField.of(opLastChangedBy))

                /**
                 * Sets [Builder.opLastChangedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.opLastChangedBy] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun opLastChangedBy(opLastChangedBy: JsonField<String>) = apply {
                    this.opLastChangedBy = opLastChangedBy
                }

                /**
                 * The datetime of the most recent change made to this OperationalPlanning data, in
                 * ISO8601 UTC format with millisecond precision.
                 */
                fun opLastChangedDate(opLastChangedDate: OffsetDateTime) =
                    opLastChangedDate(JsonField.of(opLastChangedDate))

                /**
                 * Sets [Builder.opLastChangedDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.opLastChangedDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun opLastChangedDate(opLastChangedDate: JsonField<OffsetDateTime>) = apply {
                    this.opLastChangedDate = opLastChangedDate
                }

                /** Remark text regarding this operation planning. */
                fun opRemark(opRemark: String) = opRemark(JsonField.of(opRemark))

                /**
                 * Sets [Builder.opRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.opRemark] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun opRemark(opRemark: JsonField<String>) = apply { this.opRemark = opRemark }

                /** The person, unit, organization, etc. responsible for this operation planning. */
                fun opSource(opSource: String) = opSource(JsonField.of(opSource))

                /**
                 * Sets [Builder.opSource] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.opSource] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun opSource(opSource: JsonField<String>) = apply { this.opSource = opSource }

                /**
                 * The start date of this operational planning, in ISO8601 UTC format with
                 * millisecond precision.
                 */
                fun opStartDate(opStartDate: OffsetDateTime) =
                    opStartDate(JsonField.of(opStartDate))

                /**
                 * Sets [Builder.opStartDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.opStartDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun opStartDate(opStartDate: JsonField<OffsetDateTime>) = apply {
                    this.opStartDate = opStartDate
                }

                /** The status of this operational planning. */
                fun opStatus(opStatus: String) = opStatus(JsonField.of(opStatus))

                /**
                 * Sets [Builder.opStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.opStatus] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun opStatus(opStatus: JsonField<String>) = apply { this.opStatus = opStatus }

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
                 * Returns an immutable instance of [OperationalPlanning].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OperationalPlanning =
                    OperationalPlanning(
                        opEndDate,
                        opLastChangedBy,
                        opLastChangedDate,
                        opRemark,
                        opSource,
                        opStartDate,
                        opStatus,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OperationalPlanning = apply {
                if (validated) {
                    return@apply
                }

                opEndDate()
                opLastChangedBy()
                opLastChangedDate()
                opRemark()
                opSource()
                opStartDate()
                opStatus()
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
                (if (opEndDate.asKnown().isPresent) 1 else 0) +
                    (if (opLastChangedBy.asKnown().isPresent) 1 else 0) +
                    (if (opLastChangedDate.asKnown().isPresent) 1 else 0) +
                    (if (opRemark.asKnown().isPresent) 1 else 0) +
                    (if (opSource.asKnown().isPresent) 1 else 0) +
                    (if (opStartDate.asKnown().isPresent) 1 else 0) +
                    (if (opStatus.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OperationalPlanning &&
                    opEndDate == other.opEndDate &&
                    opLastChangedBy == other.opLastChangedBy &&
                    opLastChangedDate == other.opLastChangedDate &&
                    opRemark == other.opRemark &&
                    opSource == other.opSource &&
                    opStartDate == other.opStartDate &&
                    opStatus == other.opStatus &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    opEndDate,
                    opLastChangedBy,
                    opLastChangedDate,
                    opRemark,
                    opSource,
                    opStartDate,
                    opStatus,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OperationalPlanning{opEndDate=$opEndDate, opLastChangedBy=$opLastChangedBy, opLastChangedDate=$opLastChangedDate, opRemark=$opRemark, opSource=$opSource, opStartDate=$opStartDate, opStatus=$opStatus, additionalProperties=$additionalProperties}"
        }

        /**
         * Collection detailing operational pathways at the Site associated with this SiteOperations
         * record.
         */
        class Pathway
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val pwDefinition: JsonField<String>,
            private val pwLastChangedBy: JsonField<String>,
            private val pwLastChangedDate: JsonField<OffsetDateTime>,
            private val pwType: JsonField<String>,
            private val pwUsage: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("pwDefinition")
                @ExcludeMissing
                pwDefinition: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pwLastChangedBy")
                @ExcludeMissing
                pwLastChangedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pwLastChangedDate")
                @ExcludeMissing
                pwLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("pwType")
                @ExcludeMissing
                pwType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pwUsage")
                @ExcludeMissing
                pwUsage: JsonField<String> = JsonMissing.of(),
            ) : this(
                pwDefinition,
                pwLastChangedBy,
                pwLastChangedDate,
                pwType,
                pwUsage,
                mutableMapOf(),
            )

            /**
             * Text defining this pathway from its constituent parts.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pwDefinition(): Optional<String> = pwDefinition.getOptional("pwDefinition")

            /**
             * The name of the person who made the most recent change to this Pathway data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pwLastChangedBy(): Optional<String> = pwLastChangedBy.getOptional("pwLastChangedBy")

            /**
             * The datetime of the most recent change made to this Pathway data, in ISO 8601 UTC
             * format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pwLastChangedDate(): Optional<OffsetDateTime> =
                pwLastChangedDate.getOptional("pwLastChangedDate")

            /**
             * The type of paths that constitute this pathway.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pwType(): Optional<String> = pwType.getOptional("pwType")

            /**
             * The intended use of this pathway.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pwUsage(): Optional<String> = pwUsage.getOptional("pwUsage")

            /**
             * Returns the raw JSON value of [pwDefinition].
             *
             * Unlike [pwDefinition], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pwDefinition")
            @ExcludeMissing
            fun _pwDefinition(): JsonField<String> = pwDefinition

            /**
             * Returns the raw JSON value of [pwLastChangedBy].
             *
             * Unlike [pwLastChangedBy], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pwLastChangedBy")
            @ExcludeMissing
            fun _pwLastChangedBy(): JsonField<String> = pwLastChangedBy

            /**
             * Returns the raw JSON value of [pwLastChangedDate].
             *
             * Unlike [pwLastChangedDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pwLastChangedDate")
            @ExcludeMissing
            fun _pwLastChangedDate(): JsonField<OffsetDateTime> = pwLastChangedDate

            /**
             * Returns the raw JSON value of [pwType].
             *
             * Unlike [pwType], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pwType") @ExcludeMissing fun _pwType(): JsonField<String> = pwType

            /**
             * Returns the raw JSON value of [pwUsage].
             *
             * Unlike [pwUsage], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pwUsage") @ExcludeMissing fun _pwUsage(): JsonField<String> = pwUsage

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

                /** Returns a mutable builder for constructing an instance of [Pathway]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Pathway]. */
            class Builder internal constructor() {

                private var pwDefinition: JsonField<String> = JsonMissing.of()
                private var pwLastChangedBy: JsonField<String> = JsonMissing.of()
                private var pwLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var pwType: JsonField<String> = JsonMissing.of()
                private var pwUsage: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pathway: Pathway) = apply {
                    pwDefinition = pathway.pwDefinition
                    pwLastChangedBy = pathway.pwLastChangedBy
                    pwLastChangedDate = pathway.pwLastChangedDate
                    pwType = pathway.pwType
                    pwUsage = pathway.pwUsage
                    additionalProperties = pathway.additionalProperties.toMutableMap()
                }

                /** Text defining this pathway from its constituent parts. */
                fun pwDefinition(pwDefinition: String) = pwDefinition(JsonField.of(pwDefinition))

                /**
                 * Sets [Builder.pwDefinition] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pwDefinition] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pwDefinition(pwDefinition: JsonField<String>) = apply {
                    this.pwDefinition = pwDefinition
                }

                /** The name of the person who made the most recent change to this Pathway data. */
                fun pwLastChangedBy(pwLastChangedBy: String) =
                    pwLastChangedBy(JsonField.of(pwLastChangedBy))

                /**
                 * Sets [Builder.pwLastChangedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pwLastChangedBy] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun pwLastChangedBy(pwLastChangedBy: JsonField<String>) = apply {
                    this.pwLastChangedBy = pwLastChangedBy
                }

                /**
                 * The datetime of the most recent change made to this Pathway data, in ISO 8601 UTC
                 * format with millisecond precision.
                 */
                fun pwLastChangedDate(pwLastChangedDate: OffsetDateTime) =
                    pwLastChangedDate(JsonField.of(pwLastChangedDate))

                /**
                 * Sets [Builder.pwLastChangedDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pwLastChangedDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun pwLastChangedDate(pwLastChangedDate: JsonField<OffsetDateTime>) = apply {
                    this.pwLastChangedDate = pwLastChangedDate
                }

                /** The type of paths that constitute this pathway. */
                fun pwType(pwType: String) = pwType(JsonField.of(pwType))

                /**
                 * Sets [Builder.pwType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pwType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pwType(pwType: JsonField<String>) = apply { this.pwType = pwType }

                /** The intended use of this pathway. */
                fun pwUsage(pwUsage: String) = pwUsage(JsonField.of(pwUsage))

                /**
                 * Sets [Builder.pwUsage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pwUsage] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pwUsage(pwUsage: JsonField<String>) = apply { this.pwUsage = pwUsage }

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
                 * Returns an immutable instance of [Pathway].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Pathway =
                    Pathway(
                        pwDefinition,
                        pwLastChangedBy,
                        pwLastChangedDate,
                        pwType,
                        pwUsage,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Pathway = apply {
                if (validated) {
                    return@apply
                }

                pwDefinition()
                pwLastChangedBy()
                pwLastChangedDate()
                pwType()
                pwUsage()
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
                (if (pwDefinition.asKnown().isPresent) 1 else 0) +
                    (if (pwLastChangedBy.asKnown().isPresent) 1 else 0) +
                    (if (pwLastChangedDate.asKnown().isPresent) 1 else 0) +
                    (if (pwType.asKnown().isPresent) 1 else 0) +
                    (if (pwUsage.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Pathway &&
                    pwDefinition == other.pwDefinition &&
                    pwLastChangedBy == other.pwLastChangedBy &&
                    pwLastChangedDate == other.pwLastChangedDate &&
                    pwType == other.pwType &&
                    pwUsage == other.pwUsage &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    pwDefinition,
                    pwLastChangedBy,
                    pwLastChangedDate,
                    pwType,
                    pwUsage,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Pathway{pwDefinition=$pwDefinition, pwLastChangedBy=$pwLastChangedBy, pwLastChangedDate=$pwLastChangedDate, pwType=$pwType, pwUsage=$pwUsage, additionalProperties=$additionalProperties}"
        }

        /**
         * Collection documenting operational waivers that have been issued for the Site associated
         * with this record.
         */
        class Waiver
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val expirationDate: JsonField<OffsetDateTime>,
            private val hasExpired: JsonField<Boolean>,
            private val issueDate: JsonField<OffsetDateTime>,
            private val issuerName: JsonField<String>,
            private val requesterName: JsonField<String>,
            private val requesterPhoneNumber: JsonField<String>,
            private val requestingUnit: JsonField<String>,
            private val waiverAppliesTo: JsonField<String>,
            private val waiverDescription: JsonField<String>,
            private val waiverLastChangedBy: JsonField<String>,
            private val waiverLastChangedDate: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("expirationDate")
                @ExcludeMissing
                expirationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("hasExpired")
                @ExcludeMissing
                hasExpired: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("issueDate")
                @ExcludeMissing
                issueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("issuerName")
                @ExcludeMissing
                issuerName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("requesterName")
                @ExcludeMissing
                requesterName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("requesterPhoneNumber")
                @ExcludeMissing
                requesterPhoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("requestingUnit")
                @ExcludeMissing
                requestingUnit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("waiverAppliesTo")
                @ExcludeMissing
                waiverAppliesTo: JsonField<String> = JsonMissing.of(),
                @JsonProperty("waiverDescription")
                @ExcludeMissing
                waiverDescription: JsonField<String> = JsonMissing.of(),
                @JsonProperty("waiverLastChangedBy")
                @ExcludeMissing
                waiverLastChangedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("waiverLastChangedDate")
                @ExcludeMissing
                waiverLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                expirationDate,
                hasExpired,
                issueDate,
                issuerName,
                requesterName,
                requesterPhoneNumber,
                requestingUnit,
                waiverAppliesTo,
                waiverDescription,
                waiverLastChangedBy,
                waiverLastChangedDate,
                mutableMapOf(),
            )

            /**
             * The expiration date of this waiver, in ISO8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun expirationDate(): Optional<OffsetDateTime> =
                expirationDate.getOptional("expirationDate")

            /**
             * Boolean indicating whether or not this waiver has expired.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun hasExpired(): Optional<Boolean> = hasExpired.getOptional("hasExpired")

            /**
             * The issue date of this waiver, in ISO8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun issueDate(): Optional<OffsetDateTime> = issueDate.getOptional("issueDate")

            /**
             * The name of the person who issued this waiver.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun issuerName(): Optional<String> = issuerName.getOptional("issuerName")

            /**
             * The name of the person requesting this waiver.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun requesterName(): Optional<String> = requesterName.getOptional("requesterName")

            /**
             * The phone number of the person requesting this waiver.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun requesterPhoneNumber(): Optional<String> =
                requesterPhoneNumber.getOptional("requesterPhoneNumber")

            /**
             * The unit requesting this waiver.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun requestingUnit(): Optional<String> = requestingUnit.getOptional("requestingUnit")

            /**
             * Description of the entities to which this waiver applies.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun waiverAppliesTo(): Optional<String> = waiverAppliesTo.getOptional("waiverAppliesTo")

            /**
             * The description of this waiver.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun waiverDescription(): Optional<String> =
                waiverDescription.getOptional("waiverDescription")

            /**
             * The name of the person who made the most recent change to this Waiver data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun waiverLastChangedBy(): Optional<String> =
                waiverLastChangedBy.getOptional("waiverLastChangedBy")

            /**
             * The datetime of the most recent change made to this waiver data, in ISO8601 UTC
             * format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun waiverLastChangedDate(): Optional<OffsetDateTime> =
                waiverLastChangedDate.getOptional("waiverLastChangedDate")

            /**
             * Returns the raw JSON value of [expirationDate].
             *
             * Unlike [expirationDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("expirationDate")
            @ExcludeMissing
            fun _expirationDate(): JsonField<OffsetDateTime> = expirationDate

            /**
             * Returns the raw JSON value of [hasExpired].
             *
             * Unlike [hasExpired], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("hasExpired")
            @ExcludeMissing
            fun _hasExpired(): JsonField<Boolean> = hasExpired

            /**
             * Returns the raw JSON value of [issueDate].
             *
             * Unlike [issueDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("issueDate")
            @ExcludeMissing
            fun _issueDate(): JsonField<OffsetDateTime> = issueDate

            /**
             * Returns the raw JSON value of [issuerName].
             *
             * Unlike [issuerName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("issuerName")
            @ExcludeMissing
            fun _issuerName(): JsonField<String> = issuerName

            /**
             * Returns the raw JSON value of [requesterName].
             *
             * Unlike [requesterName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("requesterName")
            @ExcludeMissing
            fun _requesterName(): JsonField<String> = requesterName

            /**
             * Returns the raw JSON value of [requesterPhoneNumber].
             *
             * Unlike [requesterPhoneNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("requesterPhoneNumber")
            @ExcludeMissing
            fun _requesterPhoneNumber(): JsonField<String> = requesterPhoneNumber

            /**
             * Returns the raw JSON value of [requestingUnit].
             *
             * Unlike [requestingUnit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("requestingUnit")
            @ExcludeMissing
            fun _requestingUnit(): JsonField<String> = requestingUnit

            /**
             * Returns the raw JSON value of [waiverAppliesTo].
             *
             * Unlike [waiverAppliesTo], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("waiverAppliesTo")
            @ExcludeMissing
            fun _waiverAppliesTo(): JsonField<String> = waiverAppliesTo

            /**
             * Returns the raw JSON value of [waiverDescription].
             *
             * Unlike [waiverDescription], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("waiverDescription")
            @ExcludeMissing
            fun _waiverDescription(): JsonField<String> = waiverDescription

            /**
             * Returns the raw JSON value of [waiverLastChangedBy].
             *
             * Unlike [waiverLastChangedBy], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("waiverLastChangedBy")
            @ExcludeMissing
            fun _waiverLastChangedBy(): JsonField<String> = waiverLastChangedBy

            /**
             * Returns the raw JSON value of [waiverLastChangedDate].
             *
             * Unlike [waiverLastChangedDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("waiverLastChangedDate")
            @ExcludeMissing
            fun _waiverLastChangedDate(): JsonField<OffsetDateTime> = waiverLastChangedDate

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

                /** Returns a mutable builder for constructing an instance of [Waiver]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Waiver]. */
            class Builder internal constructor() {

                private var expirationDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var hasExpired: JsonField<Boolean> = JsonMissing.of()
                private var issueDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var issuerName: JsonField<String> = JsonMissing.of()
                private var requesterName: JsonField<String> = JsonMissing.of()
                private var requesterPhoneNumber: JsonField<String> = JsonMissing.of()
                private var requestingUnit: JsonField<String> = JsonMissing.of()
                private var waiverAppliesTo: JsonField<String> = JsonMissing.of()
                private var waiverDescription: JsonField<String> = JsonMissing.of()
                private var waiverLastChangedBy: JsonField<String> = JsonMissing.of()
                private var waiverLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(waiver: Waiver) = apply {
                    expirationDate = waiver.expirationDate
                    hasExpired = waiver.hasExpired
                    issueDate = waiver.issueDate
                    issuerName = waiver.issuerName
                    requesterName = waiver.requesterName
                    requesterPhoneNumber = waiver.requesterPhoneNumber
                    requestingUnit = waiver.requestingUnit
                    waiverAppliesTo = waiver.waiverAppliesTo
                    waiverDescription = waiver.waiverDescription
                    waiverLastChangedBy = waiver.waiverLastChangedBy
                    waiverLastChangedDate = waiver.waiverLastChangedDate
                    additionalProperties = waiver.additionalProperties.toMutableMap()
                }

                /**
                 * The expiration date of this waiver, in ISO8601 UTC format with millisecond
                 * precision.
                 */
                fun expirationDate(expirationDate: OffsetDateTime) =
                    expirationDate(JsonField.of(expirationDate))

                /**
                 * Sets [Builder.expirationDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expirationDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun expirationDate(expirationDate: JsonField<OffsetDateTime>) = apply {
                    this.expirationDate = expirationDate
                }

                /** Boolean indicating whether or not this waiver has expired. */
                fun hasExpired(hasExpired: Boolean) = hasExpired(JsonField.of(hasExpired))

                /**
                 * Sets [Builder.hasExpired] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasExpired] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hasExpired(hasExpired: JsonField<Boolean>) = apply {
                    this.hasExpired = hasExpired
                }

                /**
                 * The issue date of this waiver, in ISO8601 UTC format with millisecond precision.
                 */
                fun issueDate(issueDate: OffsetDateTime) = issueDate(JsonField.of(issueDate))

                /**
                 * Sets [Builder.issueDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.issueDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun issueDate(issueDate: JsonField<OffsetDateTime>) = apply {
                    this.issueDate = issueDate
                }

                /** The name of the person who issued this waiver. */
                fun issuerName(issuerName: String) = issuerName(JsonField.of(issuerName))

                /**
                 * Sets [Builder.issuerName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.issuerName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun issuerName(issuerName: JsonField<String>) = apply {
                    this.issuerName = issuerName
                }

                /** The name of the person requesting this waiver. */
                fun requesterName(requesterName: String) =
                    requesterName(JsonField.of(requesterName))

                /**
                 * Sets [Builder.requesterName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requesterName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requesterName(requesterName: JsonField<String>) = apply {
                    this.requesterName = requesterName
                }

                /** The phone number of the person requesting this waiver. */
                fun requesterPhoneNumber(requesterPhoneNumber: String) =
                    requesterPhoneNumber(JsonField.of(requesterPhoneNumber))

                /**
                 * Sets [Builder.requesterPhoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requesterPhoneNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun requesterPhoneNumber(requesterPhoneNumber: JsonField<String>) = apply {
                    this.requesterPhoneNumber = requesterPhoneNumber
                }

                /** The unit requesting this waiver. */
                fun requestingUnit(requestingUnit: String) =
                    requestingUnit(JsonField.of(requestingUnit))

                /**
                 * Sets [Builder.requestingUnit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestingUnit] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requestingUnit(requestingUnit: JsonField<String>) = apply {
                    this.requestingUnit = requestingUnit
                }

                /** Description of the entities to which this waiver applies. */
                fun waiverAppliesTo(waiverAppliesTo: String) =
                    waiverAppliesTo(JsonField.of(waiverAppliesTo))

                /**
                 * Sets [Builder.waiverAppliesTo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.waiverAppliesTo] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun waiverAppliesTo(waiverAppliesTo: JsonField<String>) = apply {
                    this.waiverAppliesTo = waiverAppliesTo
                }

                /** The description of this waiver. */
                fun waiverDescription(waiverDescription: String) =
                    waiverDescription(JsonField.of(waiverDescription))

                /**
                 * Sets [Builder.waiverDescription] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.waiverDescription] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun waiverDescription(waiverDescription: JsonField<String>) = apply {
                    this.waiverDescription = waiverDescription
                }

                /** The name of the person who made the most recent change to this Waiver data. */
                fun waiverLastChangedBy(waiverLastChangedBy: String) =
                    waiverLastChangedBy(JsonField.of(waiverLastChangedBy))

                /**
                 * Sets [Builder.waiverLastChangedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.waiverLastChangedBy] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun waiverLastChangedBy(waiverLastChangedBy: JsonField<String>) = apply {
                    this.waiverLastChangedBy = waiverLastChangedBy
                }

                /**
                 * The datetime of the most recent change made to this waiver data, in ISO8601 UTC
                 * format with millisecond precision.
                 */
                fun waiverLastChangedDate(waiverLastChangedDate: OffsetDateTime) =
                    waiverLastChangedDate(JsonField.of(waiverLastChangedDate))

                /**
                 * Sets [Builder.waiverLastChangedDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.waiverLastChangedDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun waiverLastChangedDate(waiverLastChangedDate: JsonField<OffsetDateTime>) =
                    apply {
                        this.waiverLastChangedDate = waiverLastChangedDate
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
                 * Returns an immutable instance of [Waiver].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Waiver =
                    Waiver(
                        expirationDate,
                        hasExpired,
                        issueDate,
                        issuerName,
                        requesterName,
                        requesterPhoneNumber,
                        requestingUnit,
                        waiverAppliesTo,
                        waiverDescription,
                        waiverLastChangedBy,
                        waiverLastChangedDate,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Waiver = apply {
                if (validated) {
                    return@apply
                }

                expirationDate()
                hasExpired()
                issueDate()
                issuerName()
                requesterName()
                requesterPhoneNumber()
                requestingUnit()
                waiverAppliesTo()
                waiverDescription()
                waiverLastChangedBy()
                waiverLastChangedDate()
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
                (if (expirationDate.asKnown().isPresent) 1 else 0) +
                    (if (hasExpired.asKnown().isPresent) 1 else 0) +
                    (if (issueDate.asKnown().isPresent) 1 else 0) +
                    (if (issuerName.asKnown().isPresent) 1 else 0) +
                    (if (requesterName.asKnown().isPresent) 1 else 0) +
                    (if (requesterPhoneNumber.asKnown().isPresent) 1 else 0) +
                    (if (requestingUnit.asKnown().isPresent) 1 else 0) +
                    (if (waiverAppliesTo.asKnown().isPresent) 1 else 0) +
                    (if (waiverDescription.asKnown().isPresent) 1 else 0) +
                    (if (waiverLastChangedBy.asKnown().isPresent) 1 else 0) +
                    (if (waiverLastChangedDate.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Waiver &&
                    expirationDate == other.expirationDate &&
                    hasExpired == other.hasExpired &&
                    issueDate == other.issueDate &&
                    issuerName == other.issuerName &&
                    requesterName == other.requesterName &&
                    requesterPhoneNumber == other.requesterPhoneNumber &&
                    requestingUnit == other.requestingUnit &&
                    waiverAppliesTo == other.waiverAppliesTo &&
                    waiverDescription == other.waiverDescription &&
                    waiverLastChangedBy == other.waiverLastChangedBy &&
                    waiverLastChangedDate == other.waiverLastChangedDate &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    expirationDate,
                    hasExpired,
                    issueDate,
                    issuerName,
                    requesterName,
                    requesterPhoneNumber,
                    requestingUnit,
                    waiverAppliesTo,
                    waiverDescription,
                    waiverLastChangedBy,
                    waiverLastChangedDate,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Waiver{expirationDate=$expirationDate, hasExpired=$hasExpired, issueDate=$issueDate, issuerName=$issuerName, requesterName=$requesterName, requesterPhoneNumber=$requesterPhoneNumber, requestingUnit=$requestingUnit, waiverAppliesTo=$waiverAppliesTo, waiverDescription=$waiverDescription, waiverLastChangedBy=$waiverLastChangedBy, waiverLastChangedDate=$waiverLastChangedDate, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                idSite == other.idSite &&
                source == other.source &&
                id == other.id &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                dailyOperations == other.dailyOperations &&
                dopsLastChangedBy == other.dopsLastChangedBy &&
                dopsLastChangedDate == other.dopsLastChangedDate &&
                dopsLastChangedReason == other.dopsLastChangedReason &&
                idLaunchSite == other.idLaunchSite &&
                maximumOnGrounds == other.maximumOnGrounds &&
                mogsLastChangedBy == other.mogsLastChangedBy &&
                mogsLastChangedDate == other.mogsLastChangedDate &&
                mogsLastChangedReason == other.mogsLastChangedReason &&
                operationalDeviations == other.operationalDeviations &&
                operationalPlannings == other.operationalPlannings &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                pathways == other.pathways &&
                sourceDl == other.sourceDl &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy &&
                waivers == other.waivers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
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
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, idSite=$idSite, source=$source, id=$id, createdAt=$createdAt, createdBy=$createdBy, dailyOperations=$dailyOperations, dopsLastChangedBy=$dopsLastChangedBy, dopsLastChangedDate=$dopsLastChangedDate, dopsLastChangedReason=$dopsLastChangedReason, idLaunchSite=$idLaunchSite, maximumOnGrounds=$maximumOnGrounds, mogsLastChangedBy=$mogsLastChangedBy, mogsLastChangedDate=$mogsLastChangedDate, mogsLastChangedReason=$mogsLastChangedReason, operationalDeviations=$operationalDeviations, operationalPlannings=$operationalPlannings, origin=$origin, origNetwork=$origNetwork, pathways=$pathways, sourceDl=$sourceDl, updatedAt=$updatedAt, updatedBy=$updatedBy, waivers=$waivers, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OperationUnvalidatedPublishParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OperationUnvalidatedPublishParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

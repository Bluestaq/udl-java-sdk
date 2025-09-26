// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

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
 * Service operation intended for initial integration only, to take a list of LogisticsSupport
 * records as a POST body and ingest into the database. This operation is not intended to be used
 * for automated feeds into UDL. Data providers should contact the UDL team for specific role
 * assignments and for instructions on setting up a permanent feed through an alternate mechanism.
 */
class LogisticsSupportCreateBulkParams
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
         * [LogisticsSupportCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogisticsSupportCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(logisticsSupportCreateBulkParams: LogisticsSupportCreateBulkParams) =
            apply {
                body = logisticsSupportCreateBulkParams.body.toMutableList()
                additionalHeaders = logisticsSupportCreateBulkParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    logisticsSupportCreateBulkParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [LogisticsSupportCreateBulkParams].
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
        fun build(): LogisticsSupportCreateBulkParams =
            LogisticsSupportCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Comprehensive logistical details concerning the planned support of maintenance operations
     * required by an aircraft, including transportation information, supplies coordination, and
     * service personnel.
     */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("rptCreatedTime")
        @ExcludeMissing
        private val rptCreatedTime: JsonField<OffsetDateTime>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("aircraftMDS") @ExcludeMissing private val aircraftMds: JsonField<String>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("currICAO") @ExcludeMissing private val currIcao: JsonField<String>,
        @JsonProperty("etic") @ExcludeMissing private val etic: JsonField<OffsetDateTime>,
        @JsonProperty("etmc") @ExcludeMissing private val etmc: JsonField<OffsetDateTime>,
        @JsonProperty("extSystemId") @ExcludeMissing private val extSystemId: JsonField<String>,
        @JsonProperty("logisticAction")
        @ExcludeMissing
        private val logisticAction: JsonField<String>,
        @JsonProperty("logisticsDiscrepancyInfos")
        @ExcludeMissing
        private val logisticsDiscrepancyInfos: JsonField<List<LogisticsDiscrepancyInfo>>,
        @JsonProperty("logisticsRecordId")
        @ExcludeMissing
        private val logisticsRecordId: JsonField<String>,
        @JsonProperty("logisticsRemarks")
        @ExcludeMissing
        private val logisticsRemarks: JsonField<List<LogisticsRemarksIngest>>,
        @JsonProperty("logisticsSupportItems")
        @ExcludeMissing
        private val logisticsSupportItems: JsonField<List<LogisticsSupportItem>>,
        @JsonProperty("logisticsTransportationPlans")
        @ExcludeMissing
        private val logisticsTransportationPlans: JsonField<List<LogisticsTransportationPlan>>,
        @JsonProperty("maintStatusCode")
        @ExcludeMissing
        private val maintStatusCode: JsonField<String>,
        @JsonProperty("mcTime") @ExcludeMissing private val mcTime: JsonField<OffsetDateTime>,
        @JsonProperty("meTime") @ExcludeMissing private val meTime: JsonField<OffsetDateTime>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("owner") @ExcludeMissing private val owner: JsonField<String>,
        @JsonProperty("reopenFlag") @ExcludeMissing private val reopenFlag: JsonField<Boolean>,
        @JsonProperty("rptClosedTime")
        @ExcludeMissing
        private val rptClosedTime: JsonField<OffsetDateTime>,
        @JsonProperty("suppICAO") @ExcludeMissing private val suppIcao: JsonField<String>,
        @JsonProperty("tailNumber") @ExcludeMissing private val tailNumber: JsonField<String>,
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
         * The time this report was created, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun rptCreatedTime(): OffsetDateTime = rptCreatedTime.getRequired("rptCreatedTime")

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
         * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE, KC-130
         * HERCULES, etc.) of this aircraft. Intended as, but not constrained to, MIL-STD-6016
         * environment dependent specific type designations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun aircraftMds(): Optional<String> = aircraftMds.getOptional("aircraftMDS")

        /**
         * Time the row was created in the database.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * The current ICAO of the aircraft that is the subject of this LogisticsSupportDetails
         * record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currIcao(): Optional<String> = currIcao.getOptional("currICAO")

        /**
         * The estimated time mission capable for the aircraft, in ISO 8601 UCT format with
         * millisecond precision. This is the estimated time when the aircraft is mission ready.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun etic(): Optional<OffsetDateTime> = etic.getOptional("etic")

        /**
         * Logistics estimated time mission capable.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun etmc(): Optional<OffsetDateTime> = etmc.getOptional("etmc")

        /**
         * Optional system identifier from external systs. This field has no meaning within UDL and
         * is provided as a convenience for systems that require tracking of an internal system
         * generated ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun extSystemId(): Optional<String> = extSystemId.getOptional("extSystemId")

        /**
         * This field identifies the pacing event for bringing the aircraft to Mission Capable
         * status. It is used in calculating the Estimated Time Mission Capable (ETMC) value.
         * Acceptable values are WA (Will Advise), INW (In Work), P+hhh.h (where P=parts and hhh.h
         * is the number of hours up to 999 plus tenths of hours), EQ+hhh.h (EQ=equipment),
         * MRT+hhh.h (MRT=maintenance recovery team).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun logisticAction(): Optional<String> = logisticAction.getOptional("logisticAction")

        /**
         * Discrepancy information associated with this LogisticsSupport record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun logisticsDiscrepancyInfos(): Optional<List<LogisticsDiscrepancyInfo>> =
            logisticsDiscrepancyInfos.getOptional("logisticsDiscrepancyInfos")

        /**
         * The identifier that represents a Logistics Master Record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun logisticsRecordId(): Optional<String> =
            logisticsRecordId.getOptional("logisticsRecordId")

        /**
         * Remarks associated with this LogisticsSupport record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun logisticsRemarks(): Optional<List<LogisticsRemarksIngest>> =
            logisticsRemarks.getOptional("logisticsRemarks")

        /**
         * Support items associated with this LogisticsSupport record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun logisticsSupportItems(): Optional<List<LogisticsSupportItem>> =
            logisticsSupportItems.getOptional("logisticsSupportItems")

        /**
         * Transportation plans associated with this LogisticsSupport record, used to coordinate
         * maintenance efforts.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun logisticsTransportationPlans(): Optional<List<LogisticsTransportationPlan>> =
            logisticsTransportationPlans.getOptional("logisticsTransportationPlans")

        /**
         * The maintenance status code of the aircraft which may be based on pilot descriptions or
         * evaluation codes. Contact the source provider for details.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maintStatusCode(): Optional<String> = maintStatusCode.getOptional("maintStatusCode")

        /**
         * The time indicating when all mission essential problems with a given aircraft have been
         * fixed and is mission capable. This datetime should be in ISO 8601 UTC format with
         * millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun mcTime(): Optional<OffsetDateTime> = mcTime.getOptional("mcTime")

        /**
         * The time indicating when a given aircraft breaks for a mission essential reason. This
         * datetime should be in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun meTime(): Optional<OffsetDateTime> = meTime.getOptional("meTime")

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
         * The organization that owns this logistics record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun owner(): Optional<String> = owner.getOptional("owner")

        /**
         * This is used to indicate whether a closed master record has been reopened.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun reopenFlag(): Optional<Boolean> = reopenFlag.getOptional("reopenFlag")

        /**
         * The time this report was closed, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rptClosedTime(): Optional<OffsetDateTime> = rptClosedTime.getOptional("rptClosedTime")

        /**
         * The supplying ICAO of the aircraft that is the subject of this LogisticsSupportDetails
         * record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun suppIcao(): Optional<String> = suppIcao.getOptional("suppICAO")

        /**
         * The tail number of the aircraft that is the subject of this LogisticsSupportDetails
         * record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tailNumber(): Optional<String> = tailNumber.getOptional("tailNumber")

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
         * Returns the raw JSON value of [rptCreatedTime].
         *
         * Unlike [rptCreatedTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rptCreatedTime")
        @ExcludeMissing
        fun _rptCreatedTime(): JsonField<OffsetDateTime> = rptCreatedTime

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
         * Returns the raw JSON value of [aircraftMds].
         *
         * Unlike [aircraftMds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aircraftMDS")
        @ExcludeMissing
        fun _aircraftMds(): JsonField<String> = aircraftMds

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
         * Returns the raw JSON value of [currIcao].
         *
         * Unlike [currIcao], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currICAO") @ExcludeMissing fun _currIcao(): JsonField<String> = currIcao

        /**
         * Returns the raw JSON value of [etic].
         *
         * Unlike [etic], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("etic") @ExcludeMissing fun _etic(): JsonField<OffsetDateTime> = etic

        /**
         * Returns the raw JSON value of [etmc].
         *
         * Unlike [etmc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("etmc") @ExcludeMissing fun _etmc(): JsonField<OffsetDateTime> = etmc

        /**
         * Returns the raw JSON value of [extSystemId].
         *
         * Unlike [extSystemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("extSystemId")
        @ExcludeMissing
        fun _extSystemId(): JsonField<String> = extSystemId

        /**
         * Returns the raw JSON value of [logisticAction].
         *
         * Unlike [logisticAction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("logisticAction")
        @ExcludeMissing
        fun _logisticAction(): JsonField<String> = logisticAction

        /**
         * Returns the raw JSON value of [logisticsDiscrepancyInfos].
         *
         * Unlike [logisticsDiscrepancyInfos], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("logisticsDiscrepancyInfos")
        @ExcludeMissing
        fun _logisticsDiscrepancyInfos(): JsonField<List<LogisticsDiscrepancyInfo>> =
            logisticsDiscrepancyInfos

        /**
         * Returns the raw JSON value of [logisticsRecordId].
         *
         * Unlike [logisticsRecordId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("logisticsRecordId")
        @ExcludeMissing
        fun _logisticsRecordId(): JsonField<String> = logisticsRecordId

        /**
         * Returns the raw JSON value of [logisticsRemarks].
         *
         * Unlike [logisticsRemarks], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("logisticsRemarks")
        @ExcludeMissing
        fun _logisticsRemarks(): JsonField<List<LogisticsRemarksIngest>> = logisticsRemarks

        /**
         * Returns the raw JSON value of [logisticsSupportItems].
         *
         * Unlike [logisticsSupportItems], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("logisticsSupportItems")
        @ExcludeMissing
        fun _logisticsSupportItems(): JsonField<List<LogisticsSupportItem>> = logisticsSupportItems

        /**
         * Returns the raw JSON value of [logisticsTransportationPlans].
         *
         * Unlike [logisticsTransportationPlans], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("logisticsTransportationPlans")
        @ExcludeMissing
        fun _logisticsTransportationPlans(): JsonField<List<LogisticsTransportationPlan>> =
            logisticsTransportationPlans

        /**
         * Returns the raw JSON value of [maintStatusCode].
         *
         * Unlike [maintStatusCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maintStatusCode")
        @ExcludeMissing
        fun _maintStatusCode(): JsonField<String> = maintStatusCode

        /**
         * Returns the raw JSON value of [mcTime].
         *
         * Unlike [mcTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mcTime") @ExcludeMissing fun _mcTime(): JsonField<OffsetDateTime> = mcTime

        /**
         * Returns the raw JSON value of [meTime].
         *
         * Unlike [meTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meTime") @ExcludeMissing fun _meTime(): JsonField<OffsetDateTime> = meTime

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
         * Returns the raw JSON value of [owner].
         *
         * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

        /**
         * Returns the raw JSON value of [reopenFlag].
         *
         * Unlike [reopenFlag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reopenFlag")
        @ExcludeMissing
        fun _reopenFlag(): JsonField<Boolean> = reopenFlag

        /**
         * Returns the raw JSON value of [rptClosedTime].
         *
         * Unlike [rptClosedTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rptClosedTime")
        @ExcludeMissing
        fun _rptClosedTime(): JsonField<OffsetDateTime> = rptClosedTime

        /**
         * Returns the raw JSON value of [suppIcao].
         *
         * Unlike [suppIcao], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("suppICAO") @ExcludeMissing fun _suppIcao(): JsonField<String> = suppIcao

        /**
         * Returns the raw JSON value of [tailNumber].
         *
         * Unlike [tailNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tailNumber")
        @ExcludeMissing
        fun _tailNumber(): JsonField<String> = tailNumber

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
             * .dataMode()
             * .rptCreatedTime()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var rptCreatedTime: JsonField<OffsetDateTime>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var aircraftMds: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var currIcao: JsonField<String> = JsonMissing.of()
            private var etic: JsonField<OffsetDateTime> = JsonMissing.of()
            private var etmc: JsonField<OffsetDateTime> = JsonMissing.of()
            private var extSystemId: JsonField<String> = JsonMissing.of()
            private var logisticAction: JsonField<String> = JsonMissing.of()
            private var logisticsDiscrepancyInfos:
                JsonField<MutableList<LogisticsDiscrepancyInfo>>? =
                null
            private var logisticsRecordId: JsonField<String> = JsonMissing.of()
            private var logisticsRemarks: JsonField<MutableList<LogisticsRemarksIngest>>? = null
            private var logisticsSupportItems: JsonField<MutableList<LogisticsSupportItem>>? = null
            private var logisticsTransportationPlans:
                JsonField<MutableList<LogisticsTransportationPlan>>? =
                null
            private var maintStatusCode: JsonField<String> = JsonMissing.of()
            private var mcTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var meTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var owner: JsonField<String> = JsonMissing.of()
            private var reopenFlag: JsonField<Boolean> = JsonMissing.of()
            private var rptClosedTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var suppIcao: JsonField<String> = JsonMissing.of()
            private var tailNumber: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                rptCreatedTime = body.rptCreatedTime
                source = body.source
                id = body.id
                aircraftMds = body.aircraftMds
                createdAt = body.createdAt
                createdBy = body.createdBy
                currIcao = body.currIcao
                etic = body.etic
                etmc = body.etmc
                extSystemId = body.extSystemId
                logisticAction = body.logisticAction
                logisticsDiscrepancyInfos =
                    body.logisticsDiscrepancyInfos.map { it.toMutableList() }
                logisticsRecordId = body.logisticsRecordId
                logisticsRemarks = body.logisticsRemarks.map { it.toMutableList() }
                logisticsSupportItems = body.logisticsSupportItems.map { it.toMutableList() }
                logisticsTransportationPlans =
                    body.logisticsTransportationPlans.map { it.toMutableList() }
                maintStatusCode = body.maintStatusCode
                mcTime = body.mcTime
                meTime = body.meTime
                origin = body.origin
                origNetwork = body.origNetwork
                owner = body.owner
                reopenFlag = body.reopenFlag
                rptClosedTime = body.rptClosedTime
                suppIcao = body.suppIcao
                tailNumber = body.tailNumber
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
             * The time this report was created, in ISO 8601 UTC format with millisecond precision.
             */
            fun rptCreatedTime(rptCreatedTime: OffsetDateTime) =
                rptCreatedTime(JsonField.of(rptCreatedTime))

            /**
             * Sets [Builder.rptCreatedTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rptCreatedTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun rptCreatedTime(rptCreatedTime: JsonField<OffsetDateTime>) = apply {
                this.rptCreatedTime = rptCreatedTime
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
             * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE,
             * KC-130 HERCULES, etc.) of this aircraft. Intended as, but not constrained to,
             * MIL-STD-6016 environment dependent specific type designations.
             */
            fun aircraftMds(aircraftMds: String) = aircraftMds(JsonField.of(aircraftMds))

            /**
             * Sets [Builder.aircraftMds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aircraftMds] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aircraftMds(aircraftMds: JsonField<String>) = apply {
                this.aircraftMds = aircraftMds
            }

            /** Time the row was created in the database. */
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

            /** Application user who created the row in the database. */
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
             * The current ICAO of the aircraft that is the subject of this LogisticsSupportDetails
             * record.
             */
            fun currIcao(currIcao: String) = currIcao(JsonField.of(currIcao))

            /**
             * Sets [Builder.currIcao] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currIcao] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currIcao(currIcao: JsonField<String>) = apply { this.currIcao = currIcao }

            /**
             * The estimated time mission capable for the aircraft, in ISO 8601 UCT format with
             * millisecond precision. This is the estimated time when the aircraft is mission ready.
             */
            fun etic(etic: OffsetDateTime) = etic(JsonField.of(etic))

            /**
             * Sets [Builder.etic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.etic] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun etic(etic: JsonField<OffsetDateTime>) = apply { this.etic = etic }

            /** Logistics estimated time mission capable. */
            fun etmc(etmc: OffsetDateTime) = etmc(JsonField.of(etmc))

            /**
             * Sets [Builder.etmc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.etmc] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun etmc(etmc: JsonField<OffsetDateTime>) = apply { this.etmc = etmc }

            /**
             * Optional system identifier from external systs. This field has no meaning within UDL
             * and is provided as a convenience for systems that require tracking of an internal
             * system generated ID.
             */
            fun extSystemId(extSystemId: String) = extSystemId(JsonField.of(extSystemId))

            /**
             * Sets [Builder.extSystemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extSystemId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extSystemId(extSystemId: JsonField<String>) = apply {
                this.extSystemId = extSystemId
            }

            /**
             * This field identifies the pacing event for bringing the aircraft to Mission Capable
             * status. It is used in calculating the Estimated Time Mission Capable (ETMC) value.
             * Acceptable values are WA (Will Advise), INW (In Work), P+hhh.h (where P=parts and
             * hhh.h is the number of hours up to 999 plus tenths of hours), EQ+hhh.h
             * (EQ=equipment), MRT+hhh.h (MRT=maintenance recovery team).
             */
            fun logisticAction(logisticAction: String) =
                logisticAction(JsonField.of(logisticAction))

            /**
             * Sets [Builder.logisticAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logisticAction] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logisticAction(logisticAction: JsonField<String>) = apply {
                this.logisticAction = logisticAction
            }

            /** Discrepancy information associated with this LogisticsSupport record. */
            fun logisticsDiscrepancyInfos(
                logisticsDiscrepancyInfos: List<LogisticsDiscrepancyInfo>
            ) = logisticsDiscrepancyInfos(JsonField.of(logisticsDiscrepancyInfos))

            /**
             * Sets [Builder.logisticsDiscrepancyInfos] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logisticsDiscrepancyInfos] with a well-typed
             * `List<LogisticsDiscrepancyInfo>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun logisticsDiscrepancyInfos(
                logisticsDiscrepancyInfos: JsonField<List<LogisticsDiscrepancyInfo>>
            ) = apply {
                this.logisticsDiscrepancyInfos =
                    logisticsDiscrepancyInfos.map { it.toMutableList() }
            }

            /**
             * Adds a single [LogisticsDiscrepancyInfo] to [logisticsDiscrepancyInfos].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLogisticsDiscrepancyInfo(logisticsDiscrepancyInfo: LogisticsDiscrepancyInfo) =
                apply {
                    logisticsDiscrepancyInfos =
                        (logisticsDiscrepancyInfos ?: JsonField.of(mutableListOf())).also {
                            checkKnown("logisticsDiscrepancyInfos", it)
                                .add(logisticsDiscrepancyInfo)
                        }
                }

            /** The identifier that represents a Logistics Master Record. */
            fun logisticsRecordId(logisticsRecordId: String) =
                logisticsRecordId(JsonField.of(logisticsRecordId))

            /**
             * Sets [Builder.logisticsRecordId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logisticsRecordId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logisticsRecordId(logisticsRecordId: JsonField<String>) = apply {
                this.logisticsRecordId = logisticsRecordId
            }

            /** Remarks associated with this LogisticsSupport record. */
            fun logisticsRemarks(logisticsRemarks: List<LogisticsRemarksIngest>) =
                logisticsRemarks(JsonField.of(logisticsRemarks))

            /**
             * Sets [Builder.logisticsRemarks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logisticsRemarks] with a well-typed
             * `List<LogisticsRemarksIngest>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun logisticsRemarks(logisticsRemarks: JsonField<List<LogisticsRemarksIngest>>) =
                apply {
                    this.logisticsRemarks = logisticsRemarks.map { it.toMutableList() }
                }

            /**
             * Adds a single [LogisticsRemarksIngest] to [logisticsRemarks].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLogisticsRemark(logisticsRemark: LogisticsRemarksIngest) = apply {
                logisticsRemarks =
                    (logisticsRemarks ?: JsonField.of(mutableListOf())).also {
                        checkKnown("logisticsRemarks", it).add(logisticsRemark)
                    }
            }

            /** Support items associated with this LogisticsSupport record. */
            fun logisticsSupportItems(logisticsSupportItems: List<LogisticsSupportItem>) =
                logisticsSupportItems(JsonField.of(logisticsSupportItems))

            /**
             * Sets [Builder.logisticsSupportItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logisticsSupportItems] with a well-typed
             * `List<LogisticsSupportItem>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun logisticsSupportItems(
                logisticsSupportItems: JsonField<List<LogisticsSupportItem>>
            ) = apply {
                this.logisticsSupportItems = logisticsSupportItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [LogisticsSupportItem] to [logisticsSupportItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLogisticsSupportItem(logisticsSupportItem: LogisticsSupportItem) = apply {
                logisticsSupportItems =
                    (logisticsSupportItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("logisticsSupportItems", it).add(logisticsSupportItem)
                    }
            }

            /**
             * Transportation plans associated with this LogisticsSupport record, used to coordinate
             * maintenance efforts.
             */
            fun logisticsTransportationPlans(
                logisticsTransportationPlans: List<LogisticsTransportationPlan>
            ) = logisticsTransportationPlans(JsonField.of(logisticsTransportationPlans))

            /**
             * Sets [Builder.logisticsTransportationPlans] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logisticsTransportationPlans] with a well-typed
             * `List<LogisticsTransportationPlan>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun logisticsTransportationPlans(
                logisticsTransportationPlans: JsonField<List<LogisticsTransportationPlan>>
            ) = apply {
                this.logisticsTransportationPlans =
                    logisticsTransportationPlans.map { it.toMutableList() }
            }

            /**
             * Adds a single [LogisticsTransportationPlan] to [logisticsTransportationPlans].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLogisticsTransportationPlan(
                logisticsTransportationPlan: LogisticsTransportationPlan
            ) = apply {
                logisticsTransportationPlans =
                    (logisticsTransportationPlans ?: JsonField.of(mutableListOf())).also {
                        checkKnown("logisticsTransportationPlans", it)
                            .add(logisticsTransportationPlan)
                    }
            }

            /**
             * The maintenance status code of the aircraft which may be based on pilot descriptions
             * or evaluation codes. Contact the source provider for details.
             */
            fun maintStatusCode(maintStatusCode: String) =
                maintStatusCode(JsonField.of(maintStatusCode))

            /**
             * Sets [Builder.maintStatusCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maintStatusCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maintStatusCode(maintStatusCode: JsonField<String>) = apply {
                this.maintStatusCode = maintStatusCode
            }

            /**
             * The time indicating when all mission essential problems with a given aircraft have
             * been fixed and is mission capable. This datetime should be in ISO 8601 UTC format
             * with millisecond precision.
             */
            fun mcTime(mcTime: OffsetDateTime) = mcTime(JsonField.of(mcTime))

            /**
             * Sets [Builder.mcTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mcTime(mcTime: JsonField<OffsetDateTime>) = apply { this.mcTime = mcTime }

            /**
             * The time indicating when a given aircraft breaks for a mission essential reason. This
             * datetime should be in ISO 8601 UTC format with millisecond precision.
             */
            fun meTime(meTime: OffsetDateTime) = meTime(JsonField.of(meTime))

            /**
             * Sets [Builder.meTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meTime(meTime: JsonField<OffsetDateTime>) = apply { this.meTime = meTime }

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

            /** The organization that owns this logistics record. */
            fun owner(owner: String) = owner(JsonField.of(owner))

            /**
             * Sets [Builder.owner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.owner] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun owner(owner: JsonField<String>) = apply { this.owner = owner }

            /** This is used to indicate whether a closed master record has been reopened. */
            fun reopenFlag(reopenFlag: Boolean) = reopenFlag(JsonField.of(reopenFlag))

            /**
             * Sets [Builder.reopenFlag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reopenFlag] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reopenFlag(reopenFlag: JsonField<Boolean>) = apply { this.reopenFlag = reopenFlag }

            /**
             * The time this report was closed, in ISO 8601 UTC format with millisecond precision.
             */
            fun rptClosedTime(rptClosedTime: OffsetDateTime) =
                rptClosedTime(JsonField.of(rptClosedTime))

            /**
             * Sets [Builder.rptClosedTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rptClosedTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun rptClosedTime(rptClosedTime: JsonField<OffsetDateTime>) = apply {
                this.rptClosedTime = rptClosedTime
            }

            /**
             * The supplying ICAO of the aircraft that is the subject of this
             * LogisticsSupportDetails record.
             */
            fun suppIcao(suppIcao: String) = suppIcao(JsonField.of(suppIcao))

            /**
             * Sets [Builder.suppIcao] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suppIcao] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suppIcao(suppIcao: JsonField<String>) = apply { this.suppIcao = suppIcao }

            /**
             * The tail number of the aircraft that is the subject of this LogisticsSupportDetails
             * record.
             */
            fun tailNumber(tailNumber: String) = tailNumber(JsonField.of(tailNumber))

            /**
             * Sets [Builder.tailNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tailNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tailNumber(tailNumber: JsonField<String>) = apply { this.tailNumber = tailNumber }

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
             * .dataMode()
             * .rptCreatedTime()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("rptCreatedTime", rptCreatedTime),
                    checkRequired("source", source),
                    id,
                    aircraftMds,
                    createdAt,
                    createdBy,
                    currIcao,
                    etic,
                    etmc,
                    extSystemId,
                    logisticAction,
                    (logisticsDiscrepancyInfos ?: JsonMissing.of()).map { it.toImmutable() },
                    logisticsRecordId,
                    (logisticsRemarks ?: JsonMissing.of()).map { it.toImmutable() },
                    (logisticsSupportItems ?: JsonMissing.of()).map { it.toImmutable() },
                    (logisticsTransportationPlans ?: JsonMissing.of()).map { it.toImmutable() },
                    maintStatusCode,
                    mcTime,
                    meTime,
                    origin,
                    origNetwork,
                    owner,
                    reopenFlag,
                    rptClosedTime,
                    suppIcao,
                    tailNumber,
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
            dataMode().validate()
            rptCreatedTime()
            source()
            id()
            aircraftMds()
            createdAt()
            createdBy()
            currIcao()
            etic()
            etmc()
            extSystemId()
            logisticAction()
            logisticsDiscrepancyInfos().ifPresent { it.forEach { it.validate() } }
            logisticsRecordId()
            logisticsRemarks().ifPresent { it.forEach { it.validate() } }
            logisticsSupportItems().ifPresent { it.forEach { it.validate() } }
            logisticsTransportationPlans().ifPresent { it.forEach { it.validate() } }
            maintStatusCode()
            mcTime()
            meTime()
            origin()
            origNetwork()
            owner()
            reopenFlag()
            rptClosedTime()
            suppIcao()
            tailNumber()
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
                (if (rptCreatedTime.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (aircraftMds.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (currIcao.asKnown().isPresent) 1 else 0) +
                (if (etic.asKnown().isPresent) 1 else 0) +
                (if (etmc.asKnown().isPresent) 1 else 0) +
                (if (extSystemId.asKnown().isPresent) 1 else 0) +
                (if (logisticAction.asKnown().isPresent) 1 else 0) +
                (logisticsDiscrepancyInfos.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (logisticsRecordId.asKnown().isPresent) 1 else 0) +
                (logisticsRemarks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (logisticsSupportItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (logisticsTransportationPlans.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (maintStatusCode.asKnown().isPresent) 1 else 0) +
                (if (mcTime.asKnown().isPresent) 1 else 0) +
                (if (meTime.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (owner.asKnown().isPresent) 1 else 0) +
                (if (reopenFlag.asKnown().isPresent) 1 else 0) +
                (if (rptClosedTime.asKnown().isPresent) 1 else 0) +
                (if (suppIcao.asKnown().isPresent) 1 else 0) +
                (if (tailNumber.asKnown().isPresent) 1 else 0) +
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

        /** Discrepancy information associated with this LogisticsSupport record. */
        class LogisticsDiscrepancyInfo
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val closureTime: JsonField<OffsetDateTime>,
            private val discrepancyInfo: JsonField<String>,
            private val jcn: JsonField<String>,
            private val jobStTime: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("closureTime")
                @ExcludeMissing
                closureTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("discrepancyInfo")
                @ExcludeMissing
                discrepancyInfo: JsonField<String> = JsonMissing.of(),
                @JsonProperty("jcn") @ExcludeMissing jcn: JsonField<String> = JsonMissing.of(),
                @JsonProperty("jobStTime")
                @ExcludeMissing
                jobStTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(closureTime, discrepancyInfo, jcn, jobStTime, mutableMapOf())

            /**
             * The discrepancy closure time, in ISO 8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun closureTime(): Optional<OffsetDateTime> = closureTime.getOptional("closureTime")

            /**
             * The aircraft discrepancy description.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun discrepancyInfo(): Optional<String> = discrepancyInfo.getOptional("discrepancyInfo")

            /**
             * Job Control Number of the discrepancy.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun jcn(): Optional<String> = jcn.getOptional("jcn")

            /**
             * The job start time, in ISO 8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun jobStTime(): Optional<OffsetDateTime> = jobStTime.getOptional("jobStTime")

            /**
             * Returns the raw JSON value of [closureTime].
             *
             * Unlike [closureTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("closureTime")
            @ExcludeMissing
            fun _closureTime(): JsonField<OffsetDateTime> = closureTime

            /**
             * Returns the raw JSON value of [discrepancyInfo].
             *
             * Unlike [discrepancyInfo], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("discrepancyInfo")
            @ExcludeMissing
            fun _discrepancyInfo(): JsonField<String> = discrepancyInfo

            /**
             * Returns the raw JSON value of [jcn].
             *
             * Unlike [jcn], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("jcn") @ExcludeMissing fun _jcn(): JsonField<String> = jcn

            /**
             * Returns the raw JSON value of [jobStTime].
             *
             * Unlike [jobStTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("jobStTime")
            @ExcludeMissing
            fun _jobStTime(): JsonField<OffsetDateTime> = jobStTime

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
                 * [LogisticsDiscrepancyInfo].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LogisticsDiscrepancyInfo]. */
            class Builder internal constructor() {

                private var closureTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var discrepancyInfo: JsonField<String> = JsonMissing.of()
                private var jcn: JsonField<String> = JsonMissing.of()
                private var jobStTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(logisticsDiscrepancyInfo: LogisticsDiscrepancyInfo) = apply {
                    closureTime = logisticsDiscrepancyInfo.closureTime
                    discrepancyInfo = logisticsDiscrepancyInfo.discrepancyInfo
                    jcn = logisticsDiscrepancyInfo.jcn
                    jobStTime = logisticsDiscrepancyInfo.jobStTime
                    additionalProperties =
                        logisticsDiscrepancyInfo.additionalProperties.toMutableMap()
                }

                /**
                 * The discrepancy closure time, in ISO 8601 UTC format with millisecond precision.
                 */
                fun closureTime(closureTime: OffsetDateTime) =
                    closureTime(JsonField.of(closureTime))

                /**
                 * Sets [Builder.closureTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.closureTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun closureTime(closureTime: JsonField<OffsetDateTime>) = apply {
                    this.closureTime = closureTime
                }

                /** The aircraft discrepancy description. */
                fun discrepancyInfo(discrepancyInfo: String) =
                    discrepancyInfo(JsonField.of(discrepancyInfo))

                /**
                 * Sets [Builder.discrepancyInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discrepancyInfo] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun discrepancyInfo(discrepancyInfo: JsonField<String>) = apply {
                    this.discrepancyInfo = discrepancyInfo
                }

                /** Job Control Number of the discrepancy. */
                fun jcn(jcn: String) = jcn(JsonField.of(jcn))

                /**
                 * Sets [Builder.jcn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.jcn] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun jcn(jcn: JsonField<String>) = apply { this.jcn = jcn }

                /** The job start time, in ISO 8601 UTC format with millisecond precision. */
                fun jobStTime(jobStTime: OffsetDateTime) = jobStTime(JsonField.of(jobStTime))

                /**
                 * Sets [Builder.jobStTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.jobStTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun jobStTime(jobStTime: JsonField<OffsetDateTime>) = apply {
                    this.jobStTime = jobStTime
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
                 * Returns an immutable instance of [LogisticsDiscrepancyInfo].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LogisticsDiscrepancyInfo =
                    LogisticsDiscrepancyInfo(
                        closureTime,
                        discrepancyInfo,
                        jcn,
                        jobStTime,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LogisticsDiscrepancyInfo = apply {
                if (validated) {
                    return@apply
                }

                closureTime()
                discrepancyInfo()
                jcn()
                jobStTime()
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
                (if (closureTime.asKnown().isPresent) 1 else 0) +
                    (if (discrepancyInfo.asKnown().isPresent) 1 else 0) +
                    (if (jcn.asKnown().isPresent) 1 else 0) +
                    (if (jobStTime.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LogisticsDiscrepancyInfo &&
                    closureTime == other.closureTime &&
                    discrepancyInfo == other.discrepancyInfo &&
                    jcn == other.jcn &&
                    jobStTime == other.jobStTime &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(closureTime, discrepancyInfo, jcn, jobStTime, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LogisticsDiscrepancyInfo{closureTime=$closureTime, discrepancyInfo=$discrepancyInfo, jcn=$jcn, jobStTime=$jobStTime, additionalProperties=$additionalProperties}"
        }

        /** Support items associated with this LogisticsSupport record. */
        class LogisticsSupportItem
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cannibalized: JsonField<Boolean>,
            private val deployPlanNumber: JsonField<String>,
            private val description: JsonField<String>,
            private val itemLastChangedDate: JsonField<OffsetDateTime>,
            private val jobControlNumber: JsonField<String>,
            private val logisticsParts: JsonField<List<LogisticsPart>>,
            private val logisticsRemarks: JsonField<List<LogisticsRemarksIngest>>,
            private val logisticsSpecialties: JsonField<List<LogisticsSpecialty>>,
            private val quantity: JsonField<Int>,
            private val readyTime: JsonField<OffsetDateTime>,
            private val receivedTime: JsonField<OffsetDateTime>,
            private val recoveryRequestTypeCode: JsonField<String>,
            private val redeployPlanNumber: JsonField<String>,
            private val redeployShipmentUnitId: JsonField<String>,
            private val requestNumber: JsonField<String>,
            private val resupportFlag: JsonField<Boolean>,
            private val shipmentUnitId: JsonField<String>,
            private val siPoc: JsonField<String>,
            private val sourceIcao: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cannibalized")
                @ExcludeMissing
                cannibalized: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("deployPlanNumber")
                @ExcludeMissing
                deployPlanNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("itemLastChangedDate")
                @ExcludeMissing
                itemLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("jobControlNumber")
                @ExcludeMissing
                jobControlNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("logisticsParts")
                @ExcludeMissing
                logisticsParts: JsonField<List<LogisticsPart>> = JsonMissing.of(),
                @JsonProperty("logisticsRemarks")
                @ExcludeMissing
                logisticsRemarks: JsonField<List<LogisticsRemarksIngest>> = JsonMissing.of(),
                @JsonProperty("logisticsSpecialties")
                @ExcludeMissing
                logisticsSpecialties: JsonField<List<LogisticsSpecialty>> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("readyTime")
                @ExcludeMissing
                readyTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("receivedTime")
                @ExcludeMissing
                receivedTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("recoveryRequestTypeCode")
                @ExcludeMissing
                recoveryRequestTypeCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("redeployPlanNumber")
                @ExcludeMissing
                redeployPlanNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("redeployShipmentUnitId")
                @ExcludeMissing
                redeployShipmentUnitId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("requestNumber")
                @ExcludeMissing
                requestNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("resupportFlag")
                @ExcludeMissing
                resupportFlag: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("shipmentUnitId")
                @ExcludeMissing
                shipmentUnitId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("siPOC") @ExcludeMissing siPoc: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sourceICAO")
                @ExcludeMissing
                sourceIcao: JsonField<String> = JsonMissing.of(),
            ) : this(
                cannibalized,
                deployPlanNumber,
                description,
                itemLastChangedDate,
                jobControlNumber,
                logisticsParts,
                logisticsRemarks,
                logisticsSpecialties,
                quantity,
                readyTime,
                receivedTime,
                recoveryRequestTypeCode,
                redeployPlanNumber,
                redeployShipmentUnitId,
                requestNumber,
                resupportFlag,
                shipmentUnitId,
                siPoc,
                sourceIcao,
                mutableMapOf(),
            )

            /**
             * This element indicates whether or not the supplied item is contained within another
             * item.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun cannibalized(): Optional<Boolean> = cannibalized.getOptional("cannibalized")

            /**
             * System generated reference id for the transportation plan. Format: TXXXXXNNNN T -
             * Transportation, Sequence Number, Node Id.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun deployPlanNumber(): Optional<String> =
                deployPlanNumber.getOptional("deployPlanNumber")

            /**
             * The technical order name of the part ordered.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * The last time this supported item was updated, in ISO 8601 UTC format with
             * millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun itemLastChangedDate(): Optional<OffsetDateTime> =
                itemLastChangedDate.getOptional("itemLastChangedDate")

            /**
             * A number assigned by Job Control to monitor and record maintenance actions required
             * to correct the associated aircraft maintenance discrepancy. It is seven, nine or
             * twelve characters, depending on the base-specific numbering scheme. If seven
             * characters: characters 1-3 are Julian date, 4-7 are sequence numbers. If nine
             * characters: characters 1-2 are last two digits of the year, characters 3-5 are Julian
             * date, 6-9 are sequence numbers. If twelve characters: characters 1-2 are last two
             * digits of the year, 3-5 are Julian date, 6-9 are sequence numbers, and 10-12 are a
             * three-digit supplemental number.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun jobControlNumber(): Optional<String> =
                jobControlNumber.getOptional("jobControlNumber")

            /**
             * The parts associated with this support item.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun logisticsParts(): Optional<List<LogisticsPart>> =
                logisticsParts.getOptional("logisticsParts")

            /**
             * Remarks associated with this support item.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun logisticsRemarks(): Optional<List<LogisticsRemarksIngest>> =
                logisticsRemarks.getOptional("logisticsRemarks")

            /**
             * The specialties required to implement this support item.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun logisticsSpecialties(): Optional<List<LogisticsSpecialty>> =
                logisticsSpecialties.getOptional("logisticsSpecialties")

            /**
             * Military aircraft discrepancy logistics requisition ordered quantity. The quantity of
             * equipment ordered that is required to fix the aircraft.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun quantity(): Optional<Int> = quantity.getOptional("quantity")

            /**
             * The time the item is ready, in ISO 8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun readyTime(): Optional<OffsetDateTime> = readyTime.getOptional("readyTime")

            /**
             * The time the item is received, in ISO 8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun receivedTime(): Optional<OffsetDateTime> = receivedTime.getOptional("receivedTime")

            /**
             * The type of recovery request needed. Contact the source provider for details.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun recoveryRequestTypeCode(): Optional<String> =
                recoveryRequestTypeCode.getOptional("recoveryRequestTypeCode")

            /**
             * System generated reference id for the transportation plan. Format: TXXXXXNNNN T -
             * Transportation, Sequence Number, Node Id.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun redeployPlanNumber(): Optional<String> =
                redeployPlanNumber.getOptional("redeployPlanNumber")

            /**
             * This is the Redeploy (return) Transportation Control Number/Tracking Reference Number
             * for the selected item.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun redeployShipmentUnitId(): Optional<String> =
                redeployShipmentUnitId.getOptional("redeployShipmentUnitId")

            /**
             * The request or record number for this item type (Equipent, Part, or MRT).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun requestNumber(): Optional<String> = requestNumber.getOptional("requestNumber")

            /**
             * This element indicates if the supplied item is characterized as additional support.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun resupportFlag(): Optional<Boolean> = resupportFlag.getOptional("resupportFlag")

            /**
             * Shipment Unit Identifier is the Transportation Control Number (TCN) for shipping that
             * piece of equipment being requested.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun shipmentUnitId(): Optional<String> = shipmentUnitId.getOptional("shipmentUnitId")

            /**
             * The point of contact is a free text field to add information about the individual(s)
             * with knowledge of the referenced requested or supplied item(s). The default value for
             * this field is the last name, first name, and middle initial of the operator who
             * created the records and/or generated the transaction.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun siPoc(): Optional<String> = siPoc.getOptional("siPOC")

            /**
             * The code that represents the International Civil Aviation Organization (ICAO)
             * designations of an airport.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sourceIcao(): Optional<String> = sourceIcao.getOptional("sourceICAO")

            /**
             * Returns the raw JSON value of [cannibalized].
             *
             * Unlike [cannibalized], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cannibalized")
            @ExcludeMissing
            fun _cannibalized(): JsonField<Boolean> = cannibalized

            /**
             * Returns the raw JSON value of [deployPlanNumber].
             *
             * Unlike [deployPlanNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("deployPlanNumber")
            @ExcludeMissing
            fun _deployPlanNumber(): JsonField<String> = deployPlanNumber

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [itemLastChangedDate].
             *
             * Unlike [itemLastChangedDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("itemLastChangedDate")
            @ExcludeMissing
            fun _itemLastChangedDate(): JsonField<OffsetDateTime> = itemLastChangedDate

            /**
             * Returns the raw JSON value of [jobControlNumber].
             *
             * Unlike [jobControlNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("jobControlNumber")
            @ExcludeMissing
            fun _jobControlNumber(): JsonField<String> = jobControlNumber

            /**
             * Returns the raw JSON value of [logisticsParts].
             *
             * Unlike [logisticsParts], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("logisticsParts")
            @ExcludeMissing
            fun _logisticsParts(): JsonField<List<LogisticsPart>> = logisticsParts

            /**
             * Returns the raw JSON value of [logisticsRemarks].
             *
             * Unlike [logisticsRemarks], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("logisticsRemarks")
            @ExcludeMissing
            fun _logisticsRemarks(): JsonField<List<LogisticsRemarksIngest>> = logisticsRemarks

            /**
             * Returns the raw JSON value of [logisticsSpecialties].
             *
             * Unlike [logisticsSpecialties], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("logisticsSpecialties")
            @ExcludeMissing
            fun _logisticsSpecialties(): JsonField<List<LogisticsSpecialty>> = logisticsSpecialties

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

            /**
             * Returns the raw JSON value of [readyTime].
             *
             * Unlike [readyTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("readyTime")
            @ExcludeMissing
            fun _readyTime(): JsonField<OffsetDateTime> = readyTime

            /**
             * Returns the raw JSON value of [receivedTime].
             *
             * Unlike [receivedTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("receivedTime")
            @ExcludeMissing
            fun _receivedTime(): JsonField<OffsetDateTime> = receivedTime

            /**
             * Returns the raw JSON value of [recoveryRequestTypeCode].
             *
             * Unlike [recoveryRequestTypeCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recoveryRequestTypeCode")
            @ExcludeMissing
            fun _recoveryRequestTypeCode(): JsonField<String> = recoveryRequestTypeCode

            /**
             * Returns the raw JSON value of [redeployPlanNumber].
             *
             * Unlike [redeployPlanNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("redeployPlanNumber")
            @ExcludeMissing
            fun _redeployPlanNumber(): JsonField<String> = redeployPlanNumber

            /**
             * Returns the raw JSON value of [redeployShipmentUnitId].
             *
             * Unlike [redeployShipmentUnitId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("redeployShipmentUnitId")
            @ExcludeMissing
            fun _redeployShipmentUnitId(): JsonField<String> = redeployShipmentUnitId

            /**
             * Returns the raw JSON value of [requestNumber].
             *
             * Unlike [requestNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("requestNumber")
            @ExcludeMissing
            fun _requestNumber(): JsonField<String> = requestNumber

            /**
             * Returns the raw JSON value of [resupportFlag].
             *
             * Unlike [resupportFlag], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("resupportFlag")
            @ExcludeMissing
            fun _resupportFlag(): JsonField<Boolean> = resupportFlag

            /**
             * Returns the raw JSON value of [shipmentUnitId].
             *
             * Unlike [shipmentUnitId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("shipmentUnitId")
            @ExcludeMissing
            fun _shipmentUnitId(): JsonField<String> = shipmentUnitId

            /**
             * Returns the raw JSON value of [siPoc].
             *
             * Unlike [siPoc], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("siPOC") @ExcludeMissing fun _siPoc(): JsonField<String> = siPoc

            /**
             * Returns the raw JSON value of [sourceIcao].
             *
             * Unlike [sourceIcao], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sourceICAO")
            @ExcludeMissing
            fun _sourceIcao(): JsonField<String> = sourceIcao

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
                 * Returns a mutable builder for constructing an instance of [LogisticsSupportItem].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LogisticsSupportItem]. */
            class Builder internal constructor() {

                private var cannibalized: JsonField<Boolean> = JsonMissing.of()
                private var deployPlanNumber: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var itemLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var jobControlNumber: JsonField<String> = JsonMissing.of()
                private var logisticsParts: JsonField<MutableList<LogisticsPart>>? = null
                private var logisticsRemarks: JsonField<MutableList<LogisticsRemarksIngest>>? = null
                private var logisticsSpecialties: JsonField<MutableList<LogisticsSpecialty>>? = null
                private var quantity: JsonField<Int> = JsonMissing.of()
                private var readyTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var receivedTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var recoveryRequestTypeCode: JsonField<String> = JsonMissing.of()
                private var redeployPlanNumber: JsonField<String> = JsonMissing.of()
                private var redeployShipmentUnitId: JsonField<String> = JsonMissing.of()
                private var requestNumber: JsonField<String> = JsonMissing.of()
                private var resupportFlag: JsonField<Boolean> = JsonMissing.of()
                private var shipmentUnitId: JsonField<String> = JsonMissing.of()
                private var siPoc: JsonField<String> = JsonMissing.of()
                private var sourceIcao: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(logisticsSupportItem: LogisticsSupportItem) = apply {
                    cannibalized = logisticsSupportItem.cannibalized
                    deployPlanNumber = logisticsSupportItem.deployPlanNumber
                    description = logisticsSupportItem.description
                    itemLastChangedDate = logisticsSupportItem.itemLastChangedDate
                    jobControlNumber = logisticsSupportItem.jobControlNumber
                    logisticsParts = logisticsSupportItem.logisticsParts.map { it.toMutableList() }
                    logisticsRemarks =
                        logisticsSupportItem.logisticsRemarks.map { it.toMutableList() }
                    logisticsSpecialties =
                        logisticsSupportItem.logisticsSpecialties.map { it.toMutableList() }
                    quantity = logisticsSupportItem.quantity
                    readyTime = logisticsSupportItem.readyTime
                    receivedTime = logisticsSupportItem.receivedTime
                    recoveryRequestTypeCode = logisticsSupportItem.recoveryRequestTypeCode
                    redeployPlanNumber = logisticsSupportItem.redeployPlanNumber
                    redeployShipmentUnitId = logisticsSupportItem.redeployShipmentUnitId
                    requestNumber = logisticsSupportItem.requestNumber
                    resupportFlag = logisticsSupportItem.resupportFlag
                    shipmentUnitId = logisticsSupportItem.shipmentUnitId
                    siPoc = logisticsSupportItem.siPoc
                    sourceIcao = logisticsSupportItem.sourceIcao
                    additionalProperties = logisticsSupportItem.additionalProperties.toMutableMap()
                }

                /**
                 * This element indicates whether or not the supplied item is contained within
                 * another item.
                 */
                fun cannibalized(cannibalized: Boolean) = cannibalized(JsonField.of(cannibalized))

                /**
                 * Sets [Builder.cannibalized] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cannibalized] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cannibalized(cannibalized: JsonField<Boolean>) = apply {
                    this.cannibalized = cannibalized
                }

                /**
                 * System generated reference id for the transportation plan. Format: TXXXXXNNNN T -
                 * Transportation, Sequence Number, Node Id.
                 */
                fun deployPlanNumber(deployPlanNumber: String) =
                    deployPlanNumber(JsonField.of(deployPlanNumber))

                /**
                 * Sets [Builder.deployPlanNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deployPlanNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun deployPlanNumber(deployPlanNumber: JsonField<String>) = apply {
                    this.deployPlanNumber = deployPlanNumber
                }

                /** The technical order name of the part ordered. */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * The last time this supported item was updated, in ISO 8601 UTC format with
                 * millisecond precision.
                 */
                fun itemLastChangedDate(itemLastChangedDate: OffsetDateTime) =
                    itemLastChangedDate(JsonField.of(itemLastChangedDate))

                /**
                 * Sets [Builder.itemLastChangedDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.itemLastChangedDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun itemLastChangedDate(itemLastChangedDate: JsonField<OffsetDateTime>) = apply {
                    this.itemLastChangedDate = itemLastChangedDate
                }

                /**
                 * A number assigned by Job Control to monitor and record maintenance actions
                 * required to correct the associated aircraft maintenance discrepancy. It is seven,
                 * nine or twelve characters, depending on the base-specific numbering scheme. If
                 * seven characters: characters 1-3 are Julian date, 4-7 are sequence numbers. If
                 * nine characters: characters 1-2 are last two digits of the year, characters 3-5
                 * are Julian date, 6-9 are sequence numbers. If twelve characters: characters 1-2
                 * are last two digits of the year, 3-5 are Julian date, 6-9 are sequence numbers,
                 * and 10-12 are a three-digit supplemental number.
                 */
                fun jobControlNumber(jobControlNumber: String) =
                    jobControlNumber(JsonField.of(jobControlNumber))

                /**
                 * Sets [Builder.jobControlNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.jobControlNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun jobControlNumber(jobControlNumber: JsonField<String>) = apply {
                    this.jobControlNumber = jobControlNumber
                }

                /** The parts associated with this support item. */
                fun logisticsParts(logisticsParts: List<LogisticsPart>) =
                    logisticsParts(JsonField.of(logisticsParts))

                /**
                 * Sets [Builder.logisticsParts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logisticsParts] with a well-typed
                 * `List<LogisticsPart>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun logisticsParts(logisticsParts: JsonField<List<LogisticsPart>>) = apply {
                    this.logisticsParts = logisticsParts.map { it.toMutableList() }
                }

                /**
                 * Adds a single [LogisticsPart] to [logisticsParts].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLogisticsPart(logisticsPart: LogisticsPart) = apply {
                    logisticsParts =
                        (logisticsParts ?: JsonField.of(mutableListOf())).also {
                            checkKnown("logisticsParts", it).add(logisticsPart)
                        }
                }

                /** Remarks associated with this support item. */
                fun logisticsRemarks(logisticsRemarks: List<LogisticsRemarksIngest>) =
                    logisticsRemarks(JsonField.of(logisticsRemarks))

                /**
                 * Sets [Builder.logisticsRemarks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logisticsRemarks] with a well-typed
                 * `List<LogisticsRemarksIngest>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun logisticsRemarks(logisticsRemarks: JsonField<List<LogisticsRemarksIngest>>) =
                    apply {
                        this.logisticsRemarks = logisticsRemarks.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [LogisticsRemarksIngest] to [logisticsRemarks].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLogisticsRemark(logisticsRemark: LogisticsRemarksIngest) = apply {
                    logisticsRemarks =
                        (logisticsRemarks ?: JsonField.of(mutableListOf())).also {
                            checkKnown("logisticsRemarks", it).add(logisticsRemark)
                        }
                }

                /** The specialties required to implement this support item. */
                fun logisticsSpecialties(logisticsSpecialties: List<LogisticsSpecialty>) =
                    logisticsSpecialties(JsonField.of(logisticsSpecialties))

                /**
                 * Sets [Builder.logisticsSpecialties] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logisticsSpecialties] with a well-typed
                 * `List<LogisticsSpecialty>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun logisticsSpecialties(
                    logisticsSpecialties: JsonField<List<LogisticsSpecialty>>
                ) = apply {
                    this.logisticsSpecialties = logisticsSpecialties.map { it.toMutableList() }
                }

                /**
                 * Adds a single [LogisticsSpecialty] to [logisticsSpecialties].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLogisticsSpecialty(logisticsSpecialty: LogisticsSpecialty) = apply {
                    logisticsSpecialties =
                        (logisticsSpecialties ?: JsonField.of(mutableListOf())).also {
                            checkKnown("logisticsSpecialties", it).add(logisticsSpecialty)
                        }
                }

                /**
                 * Military aircraft discrepancy logistics requisition ordered quantity. The
                 * quantity of equipment ordered that is required to fix the aircraft.
                 */
                fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

                /**
                 * The time the item is ready, in ISO 8601 UTC format with millisecond precision.
                 */
                fun readyTime(readyTime: OffsetDateTime) = readyTime(JsonField.of(readyTime))

                /**
                 * Sets [Builder.readyTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.readyTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun readyTime(readyTime: JsonField<OffsetDateTime>) = apply {
                    this.readyTime = readyTime
                }

                /**
                 * The time the item is received, in ISO 8601 UTC format with millisecond precision.
                 */
                fun receivedTime(receivedTime: OffsetDateTime) =
                    receivedTime(JsonField.of(receivedTime))

                /**
                 * Sets [Builder.receivedTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.receivedTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun receivedTime(receivedTime: JsonField<OffsetDateTime>) = apply {
                    this.receivedTime = receivedTime
                }

                /** The type of recovery request needed. Contact the source provider for details. */
                fun recoveryRequestTypeCode(recoveryRequestTypeCode: String) =
                    recoveryRequestTypeCode(JsonField.of(recoveryRequestTypeCode))

                /**
                 * Sets [Builder.recoveryRequestTypeCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recoveryRequestTypeCode] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun recoveryRequestTypeCode(recoveryRequestTypeCode: JsonField<String>) = apply {
                    this.recoveryRequestTypeCode = recoveryRequestTypeCode
                }

                /**
                 * System generated reference id for the transportation plan. Format: TXXXXXNNNN T -
                 * Transportation, Sequence Number, Node Id.
                 */
                fun redeployPlanNumber(redeployPlanNumber: String) =
                    redeployPlanNumber(JsonField.of(redeployPlanNumber))

                /**
                 * Sets [Builder.redeployPlanNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.redeployPlanNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun redeployPlanNumber(redeployPlanNumber: JsonField<String>) = apply {
                    this.redeployPlanNumber = redeployPlanNumber
                }

                /**
                 * This is the Redeploy (return) Transportation Control Number/Tracking Reference
                 * Number for the selected item.
                 */
                fun redeployShipmentUnitId(redeployShipmentUnitId: String) =
                    redeployShipmentUnitId(JsonField.of(redeployShipmentUnitId))

                /**
                 * Sets [Builder.redeployShipmentUnitId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.redeployShipmentUnitId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun redeployShipmentUnitId(redeployShipmentUnitId: JsonField<String>) = apply {
                    this.redeployShipmentUnitId = redeployShipmentUnitId
                }

                /** The request or record number for this item type (Equipent, Part, or MRT). */
                fun requestNumber(requestNumber: String) =
                    requestNumber(JsonField.of(requestNumber))

                /**
                 * Sets [Builder.requestNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requestNumber(requestNumber: JsonField<String>) = apply {
                    this.requestNumber = requestNumber
                }

                /**
                 * This element indicates if the supplied item is characterized as additional
                 * support.
                 */
                fun resupportFlag(resupportFlag: Boolean) =
                    resupportFlag(JsonField.of(resupportFlag))

                /**
                 * Sets [Builder.resupportFlag] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resupportFlag] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun resupportFlag(resupportFlag: JsonField<Boolean>) = apply {
                    this.resupportFlag = resupportFlag
                }

                /**
                 * Shipment Unit Identifier is the Transportation Control Number (TCN) for shipping
                 * that piece of equipment being requested.
                 */
                fun shipmentUnitId(shipmentUnitId: String) =
                    shipmentUnitId(JsonField.of(shipmentUnitId))

                /**
                 * Sets [Builder.shipmentUnitId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shipmentUnitId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shipmentUnitId(shipmentUnitId: JsonField<String>) = apply {
                    this.shipmentUnitId = shipmentUnitId
                }

                /**
                 * The point of contact is a free text field to add information about the
                 * individual(s) with knowledge of the referenced requested or supplied item(s). The
                 * default value for this field is the last name, first name, and middle initial of
                 * the operator who created the records and/or generated the transaction.
                 */
                fun siPoc(siPoc: String) = siPoc(JsonField.of(siPoc))

                /**
                 * Sets [Builder.siPoc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.siPoc] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun siPoc(siPoc: JsonField<String>) = apply { this.siPoc = siPoc }

                /**
                 * The code that represents the International Civil Aviation Organization (ICAO)
                 * designations of an airport.
                 */
                fun sourceIcao(sourceIcao: String) = sourceIcao(JsonField.of(sourceIcao))

                /**
                 * Sets [Builder.sourceIcao] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceIcao] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceIcao(sourceIcao: JsonField<String>) = apply {
                    this.sourceIcao = sourceIcao
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
                 * Returns an immutable instance of [LogisticsSupportItem].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LogisticsSupportItem =
                    LogisticsSupportItem(
                        cannibalized,
                        deployPlanNumber,
                        description,
                        itemLastChangedDate,
                        jobControlNumber,
                        (logisticsParts ?: JsonMissing.of()).map { it.toImmutable() },
                        (logisticsRemarks ?: JsonMissing.of()).map { it.toImmutable() },
                        (logisticsSpecialties ?: JsonMissing.of()).map { it.toImmutable() },
                        quantity,
                        readyTime,
                        receivedTime,
                        recoveryRequestTypeCode,
                        redeployPlanNumber,
                        redeployShipmentUnitId,
                        requestNumber,
                        resupportFlag,
                        shipmentUnitId,
                        siPoc,
                        sourceIcao,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LogisticsSupportItem = apply {
                if (validated) {
                    return@apply
                }

                cannibalized()
                deployPlanNumber()
                description()
                itemLastChangedDate()
                jobControlNumber()
                logisticsParts().ifPresent { it.forEach { it.validate() } }
                logisticsRemarks().ifPresent { it.forEach { it.validate() } }
                logisticsSpecialties().ifPresent { it.forEach { it.validate() } }
                quantity()
                readyTime()
                receivedTime()
                recoveryRequestTypeCode()
                redeployPlanNumber()
                redeployShipmentUnitId()
                requestNumber()
                resupportFlag()
                shipmentUnitId()
                siPoc()
                sourceIcao()
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
                (if (cannibalized.asKnown().isPresent) 1 else 0) +
                    (if (deployPlanNumber.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (itemLastChangedDate.asKnown().isPresent) 1 else 0) +
                    (if (jobControlNumber.asKnown().isPresent) 1 else 0) +
                    (logisticsParts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (logisticsRemarks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (logisticsSpecialties.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0) +
                    (if (readyTime.asKnown().isPresent) 1 else 0) +
                    (if (receivedTime.asKnown().isPresent) 1 else 0) +
                    (if (recoveryRequestTypeCode.asKnown().isPresent) 1 else 0) +
                    (if (redeployPlanNumber.asKnown().isPresent) 1 else 0) +
                    (if (redeployShipmentUnitId.asKnown().isPresent) 1 else 0) +
                    (if (requestNumber.asKnown().isPresent) 1 else 0) +
                    (if (resupportFlag.asKnown().isPresent) 1 else 0) +
                    (if (shipmentUnitId.asKnown().isPresent) 1 else 0) +
                    (if (siPoc.asKnown().isPresent) 1 else 0) +
                    (if (sourceIcao.asKnown().isPresent) 1 else 0)

            /** The parts associated with this support item. */
            class LogisticsPart
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val figureNumber: JsonField<String>,
                private val indexNumber: JsonField<String>,
                private val locationVerifier: JsonField<String>,
                private val logisticsStocks: JsonField<List<LogisticsStock>>,
                private val measurementUnitCode: JsonField<String>,
                private val nationalStockNumber: JsonField<String>,
                private val partNumber: JsonField<String>,
                private val requestVerifier: JsonField<String>,
                private val supplyDocumentNumber: JsonField<String>,
                private val technicalOrderText: JsonField<String>,
                private val workUnitCode: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("figureNumber")
                    @ExcludeMissing
                    figureNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("indexNumber")
                    @ExcludeMissing
                    indexNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("locationVerifier")
                    @ExcludeMissing
                    locationVerifier: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("logisticsStocks")
                    @ExcludeMissing
                    logisticsStocks: JsonField<List<LogisticsStock>> = JsonMissing.of(),
                    @JsonProperty("measurementUnitCode")
                    @ExcludeMissing
                    measurementUnitCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationalStockNumber")
                    @ExcludeMissing
                    nationalStockNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("partNumber")
                    @ExcludeMissing
                    partNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("requestVerifier")
                    @ExcludeMissing
                    requestVerifier: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("supplyDocumentNumber")
                    @ExcludeMissing
                    supplyDocumentNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("technicalOrderText")
                    @ExcludeMissing
                    technicalOrderText: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("workUnitCode")
                    @ExcludeMissing
                    workUnitCode: JsonField<String> = JsonMissing.of(),
                ) : this(
                    figureNumber,
                    indexNumber,
                    locationVerifier,
                    logisticsStocks,
                    measurementUnitCode,
                    nationalStockNumber,
                    partNumber,
                    requestVerifier,
                    supplyDocumentNumber,
                    technicalOrderText,
                    workUnitCode,
                    mutableMapOf(),
                )

                /**
                 * Technical order manual figure number for the requested / supplied part.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun figureNumber(): Optional<String> = figureNumber.getOptional("figureNumber")

                /**
                 * Technical order manual index number for the requested part.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun indexNumber(): Optional<String> = indexNumber.getOptional("indexNumber")

                /**
                 * The person who validated that the sourced location has, and can supply, the
                 * requested parts.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun locationVerifier(): Optional<String> =
                    locationVerifier.getOptional("locationVerifier")

                /**
                 * The supply stocks for this support item.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun logisticsStocks(): Optional<List<LogisticsStock>> =
                    logisticsStocks.getOptional("logisticsStocks")

                /**
                 * Code for a unit of measurement.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun measurementUnitCode(): Optional<String> =
                    measurementUnitCode.getOptional("measurementUnitCode")

                /**
                 * The National Stock Number of the part being requested or supplied.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun nationalStockNumber(): Optional<String> =
                    nationalStockNumber.getOptional("nationalStockNumber")

                /**
                 * Requested or supplied part number.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun partNumber(): Optional<String> = partNumber.getOptional("partNumber")

                /**
                 * The person who validated the request for parts.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun requestVerifier(): Optional<String> =
                    requestVerifier.getOptional("requestVerifier")

                /**
                 * The supply document number.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun supplyDocumentNumber(): Optional<String> =
                    supplyDocumentNumber.getOptional("supplyDocumentNumber")

                /**
                 * Indicates the specified Technical Order manual holding the aircraft information
                 * for use in diagnosing a problem or condition.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun technicalOrderText(): Optional<String> =
                    technicalOrderText.getOptional("technicalOrderText")

                /**
                 * Work Unit Code (WUC), or for some aircraft types, the Reference Designator.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun workUnitCode(): Optional<String> = workUnitCode.getOptional("workUnitCode")

                /**
                 * Returns the raw JSON value of [figureNumber].
                 *
                 * Unlike [figureNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("figureNumber")
                @ExcludeMissing
                fun _figureNumber(): JsonField<String> = figureNumber

                /**
                 * Returns the raw JSON value of [indexNumber].
                 *
                 * Unlike [indexNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("indexNumber")
                @ExcludeMissing
                fun _indexNumber(): JsonField<String> = indexNumber

                /**
                 * Returns the raw JSON value of [locationVerifier].
                 *
                 * Unlike [locationVerifier], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("locationVerifier")
                @ExcludeMissing
                fun _locationVerifier(): JsonField<String> = locationVerifier

                /**
                 * Returns the raw JSON value of [logisticsStocks].
                 *
                 * Unlike [logisticsStocks], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("logisticsStocks")
                @ExcludeMissing
                fun _logisticsStocks(): JsonField<List<LogisticsStock>> = logisticsStocks

                /**
                 * Returns the raw JSON value of [measurementUnitCode].
                 *
                 * Unlike [measurementUnitCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("measurementUnitCode")
                @ExcludeMissing
                fun _measurementUnitCode(): JsonField<String> = measurementUnitCode

                /**
                 * Returns the raw JSON value of [nationalStockNumber].
                 *
                 * Unlike [nationalStockNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nationalStockNumber")
                @ExcludeMissing
                fun _nationalStockNumber(): JsonField<String> = nationalStockNumber

                /**
                 * Returns the raw JSON value of [partNumber].
                 *
                 * Unlike [partNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("partNumber")
                @ExcludeMissing
                fun _partNumber(): JsonField<String> = partNumber

                /**
                 * Returns the raw JSON value of [requestVerifier].
                 *
                 * Unlike [requestVerifier], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("requestVerifier")
                @ExcludeMissing
                fun _requestVerifier(): JsonField<String> = requestVerifier

                /**
                 * Returns the raw JSON value of [supplyDocumentNumber].
                 *
                 * Unlike [supplyDocumentNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("supplyDocumentNumber")
                @ExcludeMissing
                fun _supplyDocumentNumber(): JsonField<String> = supplyDocumentNumber

                /**
                 * Returns the raw JSON value of [technicalOrderText].
                 *
                 * Unlike [technicalOrderText], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("technicalOrderText")
                @ExcludeMissing
                fun _technicalOrderText(): JsonField<String> = technicalOrderText

                /**
                 * Returns the raw JSON value of [workUnitCode].
                 *
                 * Unlike [workUnitCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("workUnitCode")
                @ExcludeMissing
                fun _workUnitCode(): JsonField<String> = workUnitCode

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
                     * Returns a mutable builder for constructing an instance of [LogisticsPart].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [LogisticsPart]. */
                class Builder internal constructor() {

                    private var figureNumber: JsonField<String> = JsonMissing.of()
                    private var indexNumber: JsonField<String> = JsonMissing.of()
                    private var locationVerifier: JsonField<String> = JsonMissing.of()
                    private var logisticsStocks: JsonField<MutableList<LogisticsStock>>? = null
                    private var measurementUnitCode: JsonField<String> = JsonMissing.of()
                    private var nationalStockNumber: JsonField<String> = JsonMissing.of()
                    private var partNumber: JsonField<String> = JsonMissing.of()
                    private var requestVerifier: JsonField<String> = JsonMissing.of()
                    private var supplyDocumentNumber: JsonField<String> = JsonMissing.of()
                    private var technicalOrderText: JsonField<String> = JsonMissing.of()
                    private var workUnitCode: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(logisticsPart: LogisticsPart) = apply {
                        figureNumber = logisticsPart.figureNumber
                        indexNumber = logisticsPart.indexNumber
                        locationVerifier = logisticsPart.locationVerifier
                        logisticsStocks = logisticsPart.logisticsStocks.map { it.toMutableList() }
                        measurementUnitCode = logisticsPart.measurementUnitCode
                        nationalStockNumber = logisticsPart.nationalStockNumber
                        partNumber = logisticsPart.partNumber
                        requestVerifier = logisticsPart.requestVerifier
                        supplyDocumentNumber = logisticsPart.supplyDocumentNumber
                        technicalOrderText = logisticsPart.technicalOrderText
                        workUnitCode = logisticsPart.workUnitCode
                        additionalProperties = logisticsPart.additionalProperties.toMutableMap()
                    }

                    /** Technical order manual figure number for the requested / supplied part. */
                    fun figureNumber(figureNumber: String) =
                        figureNumber(JsonField.of(figureNumber))

                    /**
                     * Sets [Builder.figureNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.figureNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun figureNumber(figureNumber: JsonField<String>) = apply {
                        this.figureNumber = figureNumber
                    }

                    /** Technical order manual index number for the requested part. */
                    fun indexNumber(indexNumber: String) = indexNumber(JsonField.of(indexNumber))

                    /**
                     * Sets [Builder.indexNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.indexNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun indexNumber(indexNumber: JsonField<String>) = apply {
                        this.indexNumber = indexNumber
                    }

                    /**
                     * The person who validated that the sourced location has, and can supply, the
                     * requested parts.
                     */
                    fun locationVerifier(locationVerifier: String) =
                        locationVerifier(JsonField.of(locationVerifier))

                    /**
                     * Sets [Builder.locationVerifier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.locationVerifier] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun locationVerifier(locationVerifier: JsonField<String>) = apply {
                        this.locationVerifier = locationVerifier
                    }

                    /** The supply stocks for this support item. */
                    fun logisticsStocks(logisticsStocks: List<LogisticsStock>) =
                        logisticsStocks(JsonField.of(logisticsStocks))

                    /**
                     * Sets [Builder.logisticsStocks] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.logisticsStocks] with a well-typed
                     * `List<LogisticsStock>` value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun logisticsStocks(logisticsStocks: JsonField<List<LogisticsStock>>) = apply {
                        this.logisticsStocks = logisticsStocks.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [LogisticsStock] to [logisticsStocks].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addLogisticsStock(logisticsStock: LogisticsStock) = apply {
                        logisticsStocks =
                            (logisticsStocks ?: JsonField.of(mutableListOf())).also {
                                checkKnown("logisticsStocks", it).add(logisticsStock)
                            }
                    }

                    /** Code for a unit of measurement. */
                    fun measurementUnitCode(measurementUnitCode: String) =
                        measurementUnitCode(JsonField.of(measurementUnitCode))

                    /**
                     * Sets [Builder.measurementUnitCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.measurementUnitCode] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun measurementUnitCode(measurementUnitCode: JsonField<String>) = apply {
                        this.measurementUnitCode = measurementUnitCode
                    }

                    /** The National Stock Number of the part being requested or supplied. */
                    fun nationalStockNumber(nationalStockNumber: String) =
                        nationalStockNumber(JsonField.of(nationalStockNumber))

                    /**
                     * Sets [Builder.nationalStockNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nationalStockNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun nationalStockNumber(nationalStockNumber: JsonField<String>) = apply {
                        this.nationalStockNumber = nationalStockNumber
                    }

                    /** Requested or supplied part number. */
                    fun partNumber(partNumber: String) = partNumber(JsonField.of(partNumber))

                    /**
                     * Sets [Builder.partNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.partNumber] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun partNumber(partNumber: JsonField<String>) = apply {
                        this.partNumber = partNumber
                    }

                    /** The person who validated the request for parts. */
                    fun requestVerifier(requestVerifier: String) =
                        requestVerifier(JsonField.of(requestVerifier))

                    /**
                     * Sets [Builder.requestVerifier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.requestVerifier] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun requestVerifier(requestVerifier: JsonField<String>) = apply {
                        this.requestVerifier = requestVerifier
                    }

                    /** The supply document number. */
                    fun supplyDocumentNumber(supplyDocumentNumber: String) =
                        supplyDocumentNumber(JsonField.of(supplyDocumentNumber))

                    /**
                     * Sets [Builder.supplyDocumentNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.supplyDocumentNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun supplyDocumentNumber(supplyDocumentNumber: JsonField<String>) = apply {
                        this.supplyDocumentNumber = supplyDocumentNumber
                    }

                    /**
                     * Indicates the specified Technical Order manual holding the aircraft
                     * information for use in diagnosing a problem or condition.
                     */
                    fun technicalOrderText(technicalOrderText: String) =
                        technicalOrderText(JsonField.of(technicalOrderText))

                    /**
                     * Sets [Builder.technicalOrderText] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.technicalOrderText] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun technicalOrderText(technicalOrderText: JsonField<String>) = apply {
                        this.technicalOrderText = technicalOrderText
                    }

                    /**
                     * Work Unit Code (WUC), or for some aircraft types, the Reference Designator.
                     */
                    fun workUnitCode(workUnitCode: String) =
                        workUnitCode(JsonField.of(workUnitCode))

                    /**
                     * Sets [Builder.workUnitCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.workUnitCode] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun workUnitCode(workUnitCode: JsonField<String>) = apply {
                        this.workUnitCode = workUnitCode
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
                     * Returns an immutable instance of [LogisticsPart].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): LogisticsPart =
                        LogisticsPart(
                            figureNumber,
                            indexNumber,
                            locationVerifier,
                            (logisticsStocks ?: JsonMissing.of()).map { it.toImmutable() },
                            measurementUnitCode,
                            nationalStockNumber,
                            partNumber,
                            requestVerifier,
                            supplyDocumentNumber,
                            technicalOrderText,
                            workUnitCode,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): LogisticsPart = apply {
                    if (validated) {
                        return@apply
                    }

                    figureNumber()
                    indexNumber()
                    locationVerifier()
                    logisticsStocks().ifPresent { it.forEach { it.validate() } }
                    measurementUnitCode()
                    nationalStockNumber()
                    partNumber()
                    requestVerifier()
                    supplyDocumentNumber()
                    technicalOrderText()
                    workUnitCode()
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
                    (if (figureNumber.asKnown().isPresent) 1 else 0) +
                        (if (indexNumber.asKnown().isPresent) 1 else 0) +
                        (if (locationVerifier.asKnown().isPresent) 1 else 0) +
                        (logisticsStocks.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                            ?: 0) +
                        (if (measurementUnitCode.asKnown().isPresent) 1 else 0) +
                        (if (nationalStockNumber.asKnown().isPresent) 1 else 0) +
                        (if (partNumber.asKnown().isPresent) 1 else 0) +
                        (if (requestVerifier.asKnown().isPresent) 1 else 0) +
                        (if (supplyDocumentNumber.asKnown().isPresent) 1 else 0) +
                        (if (technicalOrderText.asKnown().isPresent) 1 else 0) +
                        (if (workUnitCode.asKnown().isPresent) 1 else 0)

                /** The supply stocks for this support item. */
                class LogisticsStock
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val quantity: JsonField<Int>,
                    private val sourceIcao: JsonField<String>,
                    private val stockCheckTime: JsonField<OffsetDateTime>,
                    private val stockPoc: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("quantity")
                        @ExcludeMissing
                        quantity: JsonField<Int> = JsonMissing.of(),
                        @JsonProperty("sourceICAO")
                        @ExcludeMissing
                        sourceIcao: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("stockCheckTime")
                        @ExcludeMissing
                        stockCheckTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                        @JsonProperty("stockPOC")
                        @ExcludeMissing
                        stockPoc: JsonField<String> = JsonMissing.of(),
                    ) : this(quantity, sourceIcao, stockCheckTime, stockPoc, mutableMapOf())

                    /**
                     * The quantity of available parts needed from sourceICAO.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun quantity(): Optional<Int> = quantity.getOptional("quantity")

                    /**
                     * The ICAO code for the primary location with available parts.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun sourceIcao(): Optional<String> = sourceIcao.getOptional("sourceICAO")

                    /**
                     * The datetime when the parts were sourced, in ISO 8601 UTC format with
                     * millisecond precision.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun stockCheckTime(): Optional<OffsetDateTime> =
                        stockCheckTime.getOptional("stockCheckTime")

                    /**
                     * The point of contact at the sourced location.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun stockPoc(): Optional<String> = stockPoc.getOptional("stockPOC")

                    /**
                     * Returns the raw JSON value of [quantity].
                     *
                     * Unlike [quantity], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Int> = quantity

                    /**
                     * Returns the raw JSON value of [sourceIcao].
                     *
                     * Unlike [sourceIcao], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("sourceICAO")
                    @ExcludeMissing
                    fun _sourceIcao(): JsonField<String> = sourceIcao

                    /**
                     * Returns the raw JSON value of [stockCheckTime].
                     *
                     * Unlike [stockCheckTime], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("stockCheckTime")
                    @ExcludeMissing
                    fun _stockCheckTime(): JsonField<OffsetDateTime> = stockCheckTime

                    /**
                     * Returns the raw JSON value of [stockPoc].
                     *
                     * Unlike [stockPoc], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("stockPOC")
                    @ExcludeMissing
                    fun _stockPoc(): JsonField<String> = stockPoc

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
                         * [LogisticsStock].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [LogisticsStock]. */
                    class Builder internal constructor() {

                        private var quantity: JsonField<Int> = JsonMissing.of()
                        private var sourceIcao: JsonField<String> = JsonMissing.of()
                        private var stockCheckTime: JsonField<OffsetDateTime> = JsonMissing.of()
                        private var stockPoc: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(logisticsStock: LogisticsStock) = apply {
                            quantity = logisticsStock.quantity
                            sourceIcao = logisticsStock.sourceIcao
                            stockCheckTime = logisticsStock.stockCheckTime
                            stockPoc = logisticsStock.stockPoc
                            additionalProperties =
                                logisticsStock.additionalProperties.toMutableMap()
                        }

                        /** The quantity of available parts needed from sourceICAO. */
                        fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

                        /**
                         * Sets [Builder.quantity] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.quantity] with a well-typed [Int] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

                        /** The ICAO code for the primary location with available parts. */
                        fun sourceIcao(sourceIcao: String) = sourceIcao(JsonField.of(sourceIcao))

                        /**
                         * Sets [Builder.sourceIcao] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.sourceIcao] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun sourceIcao(sourceIcao: JsonField<String>) = apply {
                            this.sourceIcao = sourceIcao
                        }

                        /**
                         * The datetime when the parts were sourced, in ISO 8601 UTC format with
                         * millisecond precision.
                         */
                        fun stockCheckTime(stockCheckTime: OffsetDateTime) =
                            stockCheckTime(JsonField.of(stockCheckTime))

                        /**
                         * Sets [Builder.stockCheckTime] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.stockCheckTime] with a well-typed
                         * [OffsetDateTime] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun stockCheckTime(stockCheckTime: JsonField<OffsetDateTime>) = apply {
                            this.stockCheckTime = stockCheckTime
                        }

                        /** The point of contact at the sourced location. */
                        fun stockPoc(stockPoc: String) = stockPoc(JsonField.of(stockPoc))

                        /**
                         * Sets [Builder.stockPoc] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.stockPoc] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun stockPoc(stockPoc: JsonField<String>) = apply {
                            this.stockPoc = stockPoc
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [LogisticsStock].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): LogisticsStock =
                            LogisticsStock(
                                quantity,
                                sourceIcao,
                                stockCheckTime,
                                stockPoc,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): LogisticsStock = apply {
                        if (validated) {
                            return@apply
                        }

                        quantity()
                        sourceIcao()
                        stockCheckTime()
                        stockPoc()
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
                        (if (quantity.asKnown().isPresent) 1 else 0) +
                            (if (sourceIcao.asKnown().isPresent) 1 else 0) +
                            (if (stockCheckTime.asKnown().isPresent) 1 else 0) +
                            (if (stockPoc.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is LogisticsStock &&
                            quantity == other.quantity &&
                            sourceIcao == other.sourceIcao &&
                            stockCheckTime == other.stockCheckTime &&
                            stockPoc == other.stockPoc &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            quantity,
                            sourceIcao,
                            stockCheckTime,
                            stockPoc,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LogisticsStock{quantity=$quantity, sourceIcao=$sourceIcao, stockCheckTime=$stockCheckTime, stockPoc=$stockPoc, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LogisticsPart &&
                        figureNumber == other.figureNumber &&
                        indexNumber == other.indexNumber &&
                        locationVerifier == other.locationVerifier &&
                        logisticsStocks == other.logisticsStocks &&
                        measurementUnitCode == other.measurementUnitCode &&
                        nationalStockNumber == other.nationalStockNumber &&
                        partNumber == other.partNumber &&
                        requestVerifier == other.requestVerifier &&
                        supplyDocumentNumber == other.supplyDocumentNumber &&
                        technicalOrderText == other.technicalOrderText &&
                        workUnitCode == other.workUnitCode &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        figureNumber,
                        indexNumber,
                        locationVerifier,
                        logisticsStocks,
                        measurementUnitCode,
                        nationalStockNumber,
                        partNumber,
                        requestVerifier,
                        supplyDocumentNumber,
                        technicalOrderText,
                        workUnitCode,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LogisticsPart{figureNumber=$figureNumber, indexNumber=$indexNumber, locationVerifier=$locationVerifier, logisticsStocks=$logisticsStocks, measurementUnitCode=$measurementUnitCode, nationalStockNumber=$nationalStockNumber, partNumber=$partNumber, requestVerifier=$requestVerifier, supplyDocumentNumber=$supplyDocumentNumber, technicalOrderText=$technicalOrderText, workUnitCode=$workUnitCode, additionalProperties=$additionalProperties}"
            }

            /** The specialties required to implement this support item. */
            class LogisticsSpecialty
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val firstName: JsonField<String>,
                private val last4Ssn: JsonField<String>,
                private val lastName: JsonField<String>,
                private val rankCode: JsonField<String>,
                private val roleTypeCode: JsonField<String>,
                private val skillLevel: JsonField<Int>,
                private val specialty: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("firstName")
                    @ExcludeMissing
                    firstName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("last4Ssn")
                    @ExcludeMissing
                    last4Ssn: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("lastName")
                    @ExcludeMissing
                    lastName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("rankCode")
                    @ExcludeMissing
                    rankCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("roleTypeCode")
                    @ExcludeMissing
                    roleTypeCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("skillLevel")
                    @ExcludeMissing
                    skillLevel: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("specialty")
                    @ExcludeMissing
                    specialty: JsonField<String> = JsonMissing.of(),
                ) : this(
                    firstName,
                    last4Ssn,
                    lastName,
                    rankCode,
                    roleTypeCode,
                    skillLevel,
                    specialty,
                    mutableMapOf(),
                )

                /**
                 * The first name of the specialist.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun firstName(): Optional<String> = firstName.getOptional("firstName")

                /**
                 * The last four digits of the specialist's social security number.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun last4Ssn(): Optional<String> = last4Ssn.getOptional("last4Ssn")

                /**
                 * The last name of the specialist.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun lastName(): Optional<String> = lastName.getOptional("lastName")

                /**
                 * Military service rank designation.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun rankCode(): Optional<String> = rankCode.getOptional("rankCode")

                /**
                 * Type code that determines role of the mission response team member. TC - Team
                 * Chief, TM - Team Member.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun roleTypeCode(): Optional<String> = roleTypeCode.getOptional("roleTypeCode")

                /**
                 * Skill level of the mission response team member.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun skillLevel(): Optional<Int> = skillLevel.getOptional("skillLevel")

                /**
                 * Indicates where the repairs will be performed, or which shop specialty has been
                 * assigned responsibility for correcting the discrepancy. Shop specialties are
                 * normally listed in abbreviated format.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun specialty(): Optional<String> = specialty.getOptional("specialty")

                /**
                 * Returns the raw JSON value of [firstName].
                 *
                 * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("firstName")
                @ExcludeMissing
                fun _firstName(): JsonField<String> = firstName

                /**
                 * Returns the raw JSON value of [last4Ssn].
                 *
                 * Unlike [last4Ssn], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("last4Ssn")
                @ExcludeMissing
                fun _last4Ssn(): JsonField<String> = last4Ssn

                /**
                 * Returns the raw JSON value of [lastName].
                 *
                 * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("lastName")
                @ExcludeMissing
                fun _lastName(): JsonField<String> = lastName

                /**
                 * Returns the raw JSON value of [rankCode].
                 *
                 * Unlike [rankCode], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("rankCode")
                @ExcludeMissing
                fun _rankCode(): JsonField<String> = rankCode

                /**
                 * Returns the raw JSON value of [roleTypeCode].
                 *
                 * Unlike [roleTypeCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("roleTypeCode")
                @ExcludeMissing
                fun _roleTypeCode(): JsonField<String> = roleTypeCode

                /**
                 * Returns the raw JSON value of [skillLevel].
                 *
                 * Unlike [skillLevel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("skillLevel")
                @ExcludeMissing
                fun _skillLevel(): JsonField<Int> = skillLevel

                /**
                 * Returns the raw JSON value of [specialty].
                 *
                 * Unlike [specialty], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("specialty")
                @ExcludeMissing
                fun _specialty(): JsonField<String> = specialty

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
                     * [LogisticsSpecialty].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [LogisticsSpecialty]. */
                class Builder internal constructor() {

                    private var firstName: JsonField<String> = JsonMissing.of()
                    private var last4Ssn: JsonField<String> = JsonMissing.of()
                    private var lastName: JsonField<String> = JsonMissing.of()
                    private var rankCode: JsonField<String> = JsonMissing.of()
                    private var roleTypeCode: JsonField<String> = JsonMissing.of()
                    private var skillLevel: JsonField<Int> = JsonMissing.of()
                    private var specialty: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(logisticsSpecialty: LogisticsSpecialty) = apply {
                        firstName = logisticsSpecialty.firstName
                        last4Ssn = logisticsSpecialty.last4Ssn
                        lastName = logisticsSpecialty.lastName
                        rankCode = logisticsSpecialty.rankCode
                        roleTypeCode = logisticsSpecialty.roleTypeCode
                        skillLevel = logisticsSpecialty.skillLevel
                        specialty = logisticsSpecialty.specialty
                        additionalProperties =
                            logisticsSpecialty.additionalProperties.toMutableMap()
                    }

                    /** The first name of the specialist. */
                    fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                    /**
                     * Sets [Builder.firstName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.firstName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun firstName(firstName: JsonField<String>) = apply {
                        this.firstName = firstName
                    }

                    /** The last four digits of the specialist's social security number. */
                    fun last4Ssn(last4Ssn: String) = last4Ssn(JsonField.of(last4Ssn))

                    /**
                     * Sets [Builder.last4Ssn] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.last4Ssn] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun last4Ssn(last4Ssn: JsonField<String>) = apply { this.last4Ssn = last4Ssn }

                    /** The last name of the specialist. */
                    fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                    /**
                     * Sets [Builder.lastName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                    /** Military service rank designation. */
                    fun rankCode(rankCode: String) = rankCode(JsonField.of(rankCode))

                    /**
                     * Sets [Builder.rankCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rankCode] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun rankCode(rankCode: JsonField<String>) = apply { this.rankCode = rankCode }

                    /**
                     * Type code that determines role of the mission response team member. TC - Team
                     * Chief, TM - Team Member.
                     */
                    fun roleTypeCode(roleTypeCode: String) =
                        roleTypeCode(JsonField.of(roleTypeCode))

                    /**
                     * Sets [Builder.roleTypeCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.roleTypeCode] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun roleTypeCode(roleTypeCode: JsonField<String>) = apply {
                        this.roleTypeCode = roleTypeCode
                    }

                    /** Skill level of the mission response team member. */
                    fun skillLevel(skillLevel: Int) = skillLevel(JsonField.of(skillLevel))

                    /**
                     * Sets [Builder.skillLevel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.skillLevel] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun skillLevel(skillLevel: JsonField<Int>) = apply {
                        this.skillLevel = skillLevel
                    }

                    /**
                     * Indicates where the repairs will be performed, or which shop specialty has
                     * been assigned responsibility for correcting the discrepancy. Shop specialties
                     * are normally listed in abbreviated format.
                     */
                    fun specialty(specialty: String) = specialty(JsonField.of(specialty))

                    /**
                     * Sets [Builder.specialty] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.specialty] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun specialty(specialty: JsonField<String>) = apply {
                        this.specialty = specialty
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
                     * Returns an immutable instance of [LogisticsSpecialty].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): LogisticsSpecialty =
                        LogisticsSpecialty(
                            firstName,
                            last4Ssn,
                            lastName,
                            rankCode,
                            roleTypeCode,
                            skillLevel,
                            specialty,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): LogisticsSpecialty = apply {
                    if (validated) {
                        return@apply
                    }

                    firstName()
                    last4Ssn()
                    lastName()
                    rankCode()
                    roleTypeCode()
                    skillLevel()
                    specialty()
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
                    (if (firstName.asKnown().isPresent) 1 else 0) +
                        (if (last4Ssn.asKnown().isPresent) 1 else 0) +
                        (if (lastName.asKnown().isPresent) 1 else 0) +
                        (if (rankCode.asKnown().isPresent) 1 else 0) +
                        (if (roleTypeCode.asKnown().isPresent) 1 else 0) +
                        (if (skillLevel.asKnown().isPresent) 1 else 0) +
                        (if (specialty.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LogisticsSpecialty &&
                        firstName == other.firstName &&
                        last4Ssn == other.last4Ssn &&
                        lastName == other.lastName &&
                        rankCode == other.rankCode &&
                        roleTypeCode == other.roleTypeCode &&
                        skillLevel == other.skillLevel &&
                        specialty == other.specialty &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        firstName,
                        last4Ssn,
                        lastName,
                        rankCode,
                        roleTypeCode,
                        skillLevel,
                        specialty,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LogisticsSpecialty{firstName=$firstName, last4Ssn=$last4Ssn, lastName=$lastName, rankCode=$rankCode, roleTypeCode=$roleTypeCode, skillLevel=$skillLevel, specialty=$specialty, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LogisticsSupportItem &&
                    cannibalized == other.cannibalized &&
                    deployPlanNumber == other.deployPlanNumber &&
                    description == other.description &&
                    itemLastChangedDate == other.itemLastChangedDate &&
                    jobControlNumber == other.jobControlNumber &&
                    logisticsParts == other.logisticsParts &&
                    logisticsRemarks == other.logisticsRemarks &&
                    logisticsSpecialties == other.logisticsSpecialties &&
                    quantity == other.quantity &&
                    readyTime == other.readyTime &&
                    receivedTime == other.receivedTime &&
                    recoveryRequestTypeCode == other.recoveryRequestTypeCode &&
                    redeployPlanNumber == other.redeployPlanNumber &&
                    redeployShipmentUnitId == other.redeployShipmentUnitId &&
                    requestNumber == other.requestNumber &&
                    resupportFlag == other.resupportFlag &&
                    shipmentUnitId == other.shipmentUnitId &&
                    siPoc == other.siPoc &&
                    sourceIcao == other.sourceIcao &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cannibalized,
                    deployPlanNumber,
                    description,
                    itemLastChangedDate,
                    jobControlNumber,
                    logisticsParts,
                    logisticsRemarks,
                    logisticsSpecialties,
                    quantity,
                    readyTime,
                    receivedTime,
                    recoveryRequestTypeCode,
                    redeployPlanNumber,
                    redeployShipmentUnitId,
                    requestNumber,
                    resupportFlag,
                    shipmentUnitId,
                    siPoc,
                    sourceIcao,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LogisticsSupportItem{cannibalized=$cannibalized, deployPlanNumber=$deployPlanNumber, description=$description, itemLastChangedDate=$itemLastChangedDate, jobControlNumber=$jobControlNumber, logisticsParts=$logisticsParts, logisticsRemarks=$logisticsRemarks, logisticsSpecialties=$logisticsSpecialties, quantity=$quantity, readyTime=$readyTime, receivedTime=$receivedTime, recoveryRequestTypeCode=$recoveryRequestTypeCode, redeployPlanNumber=$redeployPlanNumber, redeployShipmentUnitId=$redeployShipmentUnitId, requestNumber=$requestNumber, resupportFlag=$resupportFlag, shipmentUnitId=$shipmentUnitId, siPoc=$siPoc, sourceIcao=$sourceIcao, additionalProperties=$additionalProperties}"
        }

        /**
         * Transportation plans associated with this LogisticsSupport record, used to coordinate
         * maintenance efforts.
         */
        class LogisticsTransportationPlan
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val actDepTime: JsonField<OffsetDateTime>,
            private val aircraftStatus: JsonField<String>,
            private val approxArrTime: JsonField<OffsetDateTime>,
            private val cancelledDate: JsonField<OffsetDateTime>,
            private val closedDate: JsonField<OffsetDateTime>,
            private val coordinator: JsonField<String>,
            private val coordinatorUnit: JsonField<String>,
            private val destinationIcao: JsonField<String>,
            private val duration: JsonField<String>,
            private val estArrTime: JsonField<OffsetDateTime>,
            private val estDepTime: JsonField<OffsetDateTime>,
            private val lastChangedDate: JsonField<OffsetDateTime>,
            private val logisticMasterRecordId: JsonField<String>,
            private val logisticsSegments: JsonField<List<LogisticsSegment>>,
            private val logisticsTransportationPlansRemarks:
                JsonField<List<LogisticsRemarksIngest>>,
            private val majcom: JsonField<String>,
            private val missionChange: JsonField<Boolean>,
            private val numEnrouteStops: JsonField<Int>,
            private val numTransLoads: JsonField<Int>,
            private val originIcao: JsonField<String>,
            private val planDefinition: JsonField<String>,
            private val plansNumber: JsonField<String>,
            private val serialNumber: JsonField<String>,
            private val statusCode: JsonField<String>,
            private val tpAircraftMds: JsonField<String>,
            private val tpTailNumber: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("actDepTime")
                @ExcludeMissing
                actDepTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("aircraftStatus")
                @ExcludeMissing
                aircraftStatus: JsonField<String> = JsonMissing.of(),
                @JsonProperty("approxArrTime")
                @ExcludeMissing
                approxArrTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("cancelledDate")
                @ExcludeMissing
                cancelledDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("closedDate")
                @ExcludeMissing
                closedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("coordinator")
                @ExcludeMissing
                coordinator: JsonField<String> = JsonMissing.of(),
                @JsonProperty("coordinatorUnit")
                @ExcludeMissing
                coordinatorUnit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("destinationICAO")
                @ExcludeMissing
                destinationIcao: JsonField<String> = JsonMissing.of(),
                @JsonProperty("duration")
                @ExcludeMissing
                duration: JsonField<String> = JsonMissing.of(),
                @JsonProperty("estArrTime")
                @ExcludeMissing
                estArrTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("estDepTime")
                @ExcludeMissing
                estDepTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("lastChangedDate")
                @ExcludeMissing
                lastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("logisticMasterRecordId")
                @ExcludeMissing
                logisticMasterRecordId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("logisticsSegments")
                @ExcludeMissing
                logisticsSegments: JsonField<List<LogisticsSegment>> = JsonMissing.of(),
                @JsonProperty("logisticsTransportationPlansRemarks")
                @ExcludeMissing
                logisticsTransportationPlansRemarks: JsonField<List<LogisticsRemarksIngest>> =
                    JsonMissing.of(),
                @JsonProperty("majcom")
                @ExcludeMissing
                majcom: JsonField<String> = JsonMissing.of(),
                @JsonProperty("missionChange")
                @ExcludeMissing
                missionChange: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("numEnrouteStops")
                @ExcludeMissing
                numEnrouteStops: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("numTransLoads")
                @ExcludeMissing
                numTransLoads: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("originICAO")
                @ExcludeMissing
                originIcao: JsonField<String> = JsonMissing.of(),
                @JsonProperty("planDefinition")
                @ExcludeMissing
                planDefinition: JsonField<String> = JsonMissing.of(),
                @JsonProperty("plansNumber")
                @ExcludeMissing
                plansNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("serialNumber")
                @ExcludeMissing
                serialNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("statusCode")
                @ExcludeMissing
                statusCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tpAircraftMDS")
                @ExcludeMissing
                tpAircraftMds: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tpTailNumber")
                @ExcludeMissing
                tpTailNumber: JsonField<String> = JsonMissing.of(),
            ) : this(
                actDepTime,
                aircraftStatus,
                approxArrTime,
                cancelledDate,
                closedDate,
                coordinator,
                coordinatorUnit,
                destinationIcao,
                duration,
                estArrTime,
                estDepTime,
                lastChangedDate,
                logisticMasterRecordId,
                logisticsSegments,
                logisticsTransportationPlansRemarks,
                majcom,
                missionChange,
                numEnrouteStops,
                numTransLoads,
                originIcao,
                planDefinition,
                plansNumber,
                serialNumber,
                statusCode,
                tpAircraftMds,
                tpTailNumber,
                mutableMapOf(),
            )

            /**
             * Actual time of departure of first segment, in ISO 8601 UTC format with millisecond
             * precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun actDepTime(): Optional<OffsetDateTime> = actDepTime.getOptional("actDepTime")

            /**
             * These are the initial maintenance values entered based on the pilot descriptions or
             * the official maintenance evaluation code.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun aircraftStatus(): Optional<String> = aircraftStatus.getOptional("aircraftStatus")

            /**
             * Approximate time of arrival of final segement, in ISO 8601 UTC format with
             * millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun approxArrTime(): Optional<OffsetDateTime> =
                approxArrTime.getOptional("approxArrTime")

            /**
             * GC. LGTP_CANX_DT. GD2: Date when the transportation plan was cancelled, in ISO 8601
             * UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun cancelledDate(): Optional<OffsetDateTime> =
                cancelledDate.getOptional("cancelledDate")

            /**
             * GC. LGTP_CLSD_DT. GD2: Date when the transportation plan was closed, in ISO 8601 UTC
             * format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun closedDate(): Optional<OffsetDateTime> = closedDate.getOptional("closedDate")

            /**
             * The AMS username of the operator who alters the coordination status. Automatically
             * captured by the system.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun coordinator(): Optional<String> = coordinator.getOptional("coordinator")

            /**
             * The AMS user unit_id of the operator who alters the coordination status.
             * Automatically captured by the system from table AMS_USER.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun coordinatorUnit(): Optional<String> = coordinatorUnit.getOptional("coordinatorUnit")

            /**
             * Destination location ICAO.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun destinationIcao(): Optional<String> = destinationIcao.getOptional("destinationICAO")

            /**
             * Transportation plan duration, expressed in the format MMM:SS.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun duration(): Optional<String> = duration.getOptional("duration")

            /**
             * ETA of the final segment, in ISO 8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun estArrTime(): Optional<OffsetDateTime> = estArrTime.getOptional("estArrTime")

            /**
             * ETD of the first segment, in ISO 8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun estDepTime(): Optional<OffsetDateTime> = estDepTime.getOptional("estDepTime")

            /**
             * Last time transportation plan was updated, in ISO 8601 UTC format with millisecond
             * precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun lastChangedDate(): Optional<OffsetDateTime> =
                lastChangedDate.getOptional("lastChangedDate")

            /**
             * The identifier that represents a Logistics Master Record.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun logisticMasterRecordId(): Optional<String> =
                logisticMasterRecordId.getOptional("logisticMasterRecordId")

            /**
             * The transportation segments associated with this transportation plan.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun logisticsSegments(): Optional<List<LogisticsSegment>> =
                logisticsSegments.getOptional("logisticsSegments")

            /**
             * Remarks associated with this transportation plan.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun logisticsTransportationPlansRemarks(): Optional<List<LogisticsRemarksIngest>> =
                logisticsTransportationPlansRemarks.getOptional(
                    "logisticsTransportationPlansRemarks"
                )

            /**
             * The major command for the current unit.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun majcom(): Optional<String> = majcom.getOptional("majcom")

            /**
             * Indicates whether there have been changes to changes to ICAOs, estArrTime, or
             * estDepTime since this Transportation Plan was last edited.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun missionChange(): Optional<Boolean> = missionChange.getOptional("missionChange")

            /**
             * Transportation plan enroute stops.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun numEnrouteStops(): Optional<Int> = numEnrouteStops.getOptional("numEnrouteStops")

            /**
             * The number of transloads for this Transportation Plan.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun numTransLoads(): Optional<Int> = numTransLoads.getOptional("numTransLoads")

            /**
             * The origin location.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun originIcao(): Optional<String> = originIcao.getOptional("originICAO")

            /**
             * Defines the transporation plan as either a deployment or redeployment.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun planDefinition(): Optional<String> = planDefinition.getOptional("planDefinition")

            /**
             * System generated reference id for the transportation plan. Format: TXXXXXNNNN T -
             * Transportation, Sequence Number, Node Id.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun plansNumber(): Optional<String> = plansNumber.getOptional("plansNumber")

            /**
             * GDSS2 uses an 8 character serial number to uniquely identify the aircraft and MDS
             * combination. This is a portion of the full manufacturer serial number.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun serialNumber(): Optional<String> = serialNumber.getOptional("serialNumber")

            /**
             * Transporation Coordination status code. Cancel, Send to APCC, working, agree,
             * disapprove or blank.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun statusCode(): Optional<String> = statusCode.getOptional("statusCode")

            /**
             * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE,
             * KC-130 HERCULES, etc.) of this aircraft. Intended as, but not constrained to,
             * MIL-STD-6016 environment dependent specific type designations.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun tpAircraftMds(): Optional<String> = tpAircraftMds.getOptional("tpAircraftMDS")

            /**
             * Contains the tail number displayed by GDSS2.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun tpTailNumber(): Optional<String> = tpTailNumber.getOptional("tpTailNumber")

            /**
             * Returns the raw JSON value of [actDepTime].
             *
             * Unlike [actDepTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("actDepTime")
            @ExcludeMissing
            fun _actDepTime(): JsonField<OffsetDateTime> = actDepTime

            /**
             * Returns the raw JSON value of [aircraftStatus].
             *
             * Unlike [aircraftStatus], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("aircraftStatus")
            @ExcludeMissing
            fun _aircraftStatus(): JsonField<String> = aircraftStatus

            /**
             * Returns the raw JSON value of [approxArrTime].
             *
             * Unlike [approxArrTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("approxArrTime")
            @ExcludeMissing
            fun _approxArrTime(): JsonField<OffsetDateTime> = approxArrTime

            /**
             * Returns the raw JSON value of [cancelledDate].
             *
             * Unlike [cancelledDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cancelledDate")
            @ExcludeMissing
            fun _cancelledDate(): JsonField<OffsetDateTime> = cancelledDate

            /**
             * Returns the raw JSON value of [closedDate].
             *
             * Unlike [closedDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("closedDate")
            @ExcludeMissing
            fun _closedDate(): JsonField<OffsetDateTime> = closedDate

            /**
             * Returns the raw JSON value of [coordinator].
             *
             * Unlike [coordinator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("coordinator")
            @ExcludeMissing
            fun _coordinator(): JsonField<String> = coordinator

            /**
             * Returns the raw JSON value of [coordinatorUnit].
             *
             * Unlike [coordinatorUnit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("coordinatorUnit")
            @ExcludeMissing
            fun _coordinatorUnit(): JsonField<String> = coordinatorUnit

            /**
             * Returns the raw JSON value of [destinationIcao].
             *
             * Unlike [destinationIcao], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("destinationICAO")
            @ExcludeMissing
            fun _destinationIcao(): JsonField<String> = destinationIcao

            /**
             * Returns the raw JSON value of [duration].
             *
             * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<String> = duration

            /**
             * Returns the raw JSON value of [estArrTime].
             *
             * Unlike [estArrTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("estArrTime")
            @ExcludeMissing
            fun _estArrTime(): JsonField<OffsetDateTime> = estArrTime

            /**
             * Returns the raw JSON value of [estDepTime].
             *
             * Unlike [estDepTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("estDepTime")
            @ExcludeMissing
            fun _estDepTime(): JsonField<OffsetDateTime> = estDepTime

            /**
             * Returns the raw JSON value of [lastChangedDate].
             *
             * Unlike [lastChangedDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("lastChangedDate")
            @ExcludeMissing
            fun _lastChangedDate(): JsonField<OffsetDateTime> = lastChangedDate

            /**
             * Returns the raw JSON value of [logisticMasterRecordId].
             *
             * Unlike [logisticMasterRecordId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("logisticMasterRecordId")
            @ExcludeMissing
            fun _logisticMasterRecordId(): JsonField<String> = logisticMasterRecordId

            /**
             * Returns the raw JSON value of [logisticsSegments].
             *
             * Unlike [logisticsSegments], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("logisticsSegments")
            @ExcludeMissing
            fun _logisticsSegments(): JsonField<List<LogisticsSegment>> = logisticsSegments

            /**
             * Returns the raw JSON value of [logisticsTransportationPlansRemarks].
             *
             * Unlike [logisticsTransportationPlansRemarks], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("logisticsTransportationPlansRemarks")
            @ExcludeMissing
            fun _logisticsTransportationPlansRemarks(): JsonField<List<LogisticsRemarksIngest>> =
                logisticsTransportationPlansRemarks

            /**
             * Returns the raw JSON value of [majcom].
             *
             * Unlike [majcom], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("majcom") @ExcludeMissing fun _majcom(): JsonField<String> = majcom

            /**
             * Returns the raw JSON value of [missionChange].
             *
             * Unlike [missionChange], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("missionChange")
            @ExcludeMissing
            fun _missionChange(): JsonField<Boolean> = missionChange

            /**
             * Returns the raw JSON value of [numEnrouteStops].
             *
             * Unlike [numEnrouteStops], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("numEnrouteStops")
            @ExcludeMissing
            fun _numEnrouteStops(): JsonField<Int> = numEnrouteStops

            /**
             * Returns the raw JSON value of [numTransLoads].
             *
             * Unlike [numTransLoads], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("numTransLoads")
            @ExcludeMissing
            fun _numTransLoads(): JsonField<Int> = numTransLoads

            /**
             * Returns the raw JSON value of [originIcao].
             *
             * Unlike [originIcao], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("originICAO")
            @ExcludeMissing
            fun _originIcao(): JsonField<String> = originIcao

            /**
             * Returns the raw JSON value of [planDefinition].
             *
             * Unlike [planDefinition], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("planDefinition")
            @ExcludeMissing
            fun _planDefinition(): JsonField<String> = planDefinition

            /**
             * Returns the raw JSON value of [plansNumber].
             *
             * Unlike [plansNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("plansNumber")
            @ExcludeMissing
            fun _plansNumber(): JsonField<String> = plansNumber

            /**
             * Returns the raw JSON value of [serialNumber].
             *
             * Unlike [serialNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("serialNumber")
            @ExcludeMissing
            fun _serialNumber(): JsonField<String> = serialNumber

            /**
             * Returns the raw JSON value of [statusCode].
             *
             * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("statusCode")
            @ExcludeMissing
            fun _statusCode(): JsonField<String> = statusCode

            /**
             * Returns the raw JSON value of [tpAircraftMds].
             *
             * Unlike [tpAircraftMds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tpAircraftMDS")
            @ExcludeMissing
            fun _tpAircraftMds(): JsonField<String> = tpAircraftMds

            /**
             * Returns the raw JSON value of [tpTailNumber].
             *
             * Unlike [tpTailNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tpTailNumber")
            @ExcludeMissing
            fun _tpTailNumber(): JsonField<String> = tpTailNumber

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
                 * [LogisticsTransportationPlan].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LogisticsTransportationPlan]. */
            class Builder internal constructor() {

                private var actDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var aircraftStatus: JsonField<String> = JsonMissing.of()
                private var approxArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var cancelledDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var closedDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var coordinator: JsonField<String> = JsonMissing.of()
                private var coordinatorUnit: JsonField<String> = JsonMissing.of()
                private var destinationIcao: JsonField<String> = JsonMissing.of()
                private var duration: JsonField<String> = JsonMissing.of()
                private var estArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var estDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var lastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var logisticMasterRecordId: JsonField<String> = JsonMissing.of()
                private var logisticsSegments: JsonField<MutableList<LogisticsSegment>>? = null
                private var logisticsTransportationPlansRemarks:
                    JsonField<MutableList<LogisticsRemarksIngest>>? =
                    null
                private var majcom: JsonField<String> = JsonMissing.of()
                private var missionChange: JsonField<Boolean> = JsonMissing.of()
                private var numEnrouteStops: JsonField<Int> = JsonMissing.of()
                private var numTransLoads: JsonField<Int> = JsonMissing.of()
                private var originIcao: JsonField<String> = JsonMissing.of()
                private var planDefinition: JsonField<String> = JsonMissing.of()
                private var plansNumber: JsonField<String> = JsonMissing.of()
                private var serialNumber: JsonField<String> = JsonMissing.of()
                private var statusCode: JsonField<String> = JsonMissing.of()
                private var tpAircraftMds: JsonField<String> = JsonMissing.of()
                private var tpTailNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(logisticsTransportationPlan: LogisticsTransportationPlan) =
                    apply {
                        actDepTime = logisticsTransportationPlan.actDepTime
                        aircraftStatus = logisticsTransportationPlan.aircraftStatus
                        approxArrTime = logisticsTransportationPlan.approxArrTime
                        cancelledDate = logisticsTransportationPlan.cancelledDate
                        closedDate = logisticsTransportationPlan.closedDate
                        coordinator = logisticsTransportationPlan.coordinator
                        coordinatorUnit = logisticsTransportationPlan.coordinatorUnit
                        destinationIcao = logisticsTransportationPlan.destinationIcao
                        duration = logisticsTransportationPlan.duration
                        estArrTime = logisticsTransportationPlan.estArrTime
                        estDepTime = logisticsTransportationPlan.estDepTime
                        lastChangedDate = logisticsTransportationPlan.lastChangedDate
                        logisticMasterRecordId = logisticsTransportationPlan.logisticMasterRecordId
                        logisticsSegments =
                            logisticsTransportationPlan.logisticsSegments.map { it.toMutableList() }
                        logisticsTransportationPlansRemarks =
                            logisticsTransportationPlan.logisticsTransportationPlansRemarks.map {
                                it.toMutableList()
                            }
                        majcom = logisticsTransportationPlan.majcom
                        missionChange = logisticsTransportationPlan.missionChange
                        numEnrouteStops = logisticsTransportationPlan.numEnrouteStops
                        numTransLoads = logisticsTransportationPlan.numTransLoads
                        originIcao = logisticsTransportationPlan.originIcao
                        planDefinition = logisticsTransportationPlan.planDefinition
                        plansNumber = logisticsTransportationPlan.plansNumber
                        serialNumber = logisticsTransportationPlan.serialNumber
                        statusCode = logisticsTransportationPlan.statusCode
                        tpAircraftMds = logisticsTransportationPlan.tpAircraftMds
                        tpTailNumber = logisticsTransportationPlan.tpTailNumber
                        additionalProperties =
                            logisticsTransportationPlan.additionalProperties.toMutableMap()
                    }

                /**
                 * Actual time of departure of first segment, in ISO 8601 UTC format with
                 * millisecond precision.
                 */
                fun actDepTime(actDepTime: OffsetDateTime) = actDepTime(JsonField.of(actDepTime))

                /**
                 * Sets [Builder.actDepTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.actDepTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun actDepTime(actDepTime: JsonField<OffsetDateTime>) = apply {
                    this.actDepTime = actDepTime
                }

                /**
                 * These are the initial maintenance values entered based on the pilot descriptions
                 * or the official maintenance evaluation code.
                 */
                fun aircraftStatus(aircraftStatus: String) =
                    aircraftStatus(JsonField.of(aircraftStatus))

                /**
                 * Sets [Builder.aircraftStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aircraftStatus] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun aircraftStatus(aircraftStatus: JsonField<String>) = apply {
                    this.aircraftStatus = aircraftStatus
                }

                /**
                 * Approximate time of arrival of final segement, in ISO 8601 UTC format with
                 * millisecond precision.
                 */
                fun approxArrTime(approxArrTime: OffsetDateTime) =
                    approxArrTime(JsonField.of(approxArrTime))

                /**
                 * Sets [Builder.approxArrTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.approxArrTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun approxArrTime(approxArrTime: JsonField<OffsetDateTime>) = apply {
                    this.approxArrTime = approxArrTime
                }

                /**
                 * GC. LGTP_CANX_DT. GD2: Date when the transportation plan was cancelled, in ISO
                 * 8601 UTC format with millisecond precision.
                 */
                fun cancelledDate(cancelledDate: OffsetDateTime) =
                    cancelledDate(JsonField.of(cancelledDate))

                /**
                 * Sets [Builder.cancelledDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cancelledDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun cancelledDate(cancelledDate: JsonField<OffsetDateTime>) = apply {
                    this.cancelledDate = cancelledDate
                }

                /**
                 * GC. LGTP_CLSD_DT. GD2: Date when the transportation plan was closed, in ISO 8601
                 * UTC format with millisecond precision.
                 */
                fun closedDate(closedDate: OffsetDateTime) = closedDate(JsonField.of(closedDate))

                /**
                 * Sets [Builder.closedDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.closedDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun closedDate(closedDate: JsonField<OffsetDateTime>) = apply {
                    this.closedDate = closedDate
                }

                /**
                 * The AMS username of the operator who alters the coordination status.
                 * Automatically captured by the system.
                 */
                fun coordinator(coordinator: String) = coordinator(JsonField.of(coordinator))

                /**
                 * Sets [Builder.coordinator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.coordinator] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun coordinator(coordinator: JsonField<String>) = apply {
                    this.coordinator = coordinator
                }

                /**
                 * The AMS user unit_id of the operator who alters the coordination status.
                 * Automatically captured by the system from table AMS_USER.
                 */
                fun coordinatorUnit(coordinatorUnit: String) =
                    coordinatorUnit(JsonField.of(coordinatorUnit))

                /**
                 * Sets [Builder.coordinatorUnit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.coordinatorUnit] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun coordinatorUnit(coordinatorUnit: JsonField<String>) = apply {
                    this.coordinatorUnit = coordinatorUnit
                }

                /** Destination location ICAO. */
                fun destinationIcao(destinationIcao: String) =
                    destinationIcao(JsonField.of(destinationIcao))

                /**
                 * Sets [Builder.destinationIcao] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.destinationIcao] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun destinationIcao(destinationIcao: JsonField<String>) = apply {
                    this.destinationIcao = destinationIcao
                }

                /** Transportation plan duration, expressed in the format MMM:SS. */
                fun duration(duration: String) = duration(JsonField.of(duration))

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<String>) = apply { this.duration = duration }

                /** ETA of the final segment, in ISO 8601 UTC format with millisecond precision. */
                fun estArrTime(estArrTime: OffsetDateTime) = estArrTime(JsonField.of(estArrTime))

                /**
                 * Sets [Builder.estArrTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.estArrTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun estArrTime(estArrTime: JsonField<OffsetDateTime>) = apply {
                    this.estArrTime = estArrTime
                }

                /** ETD of the first segment, in ISO 8601 UTC format with millisecond precision. */
                fun estDepTime(estDepTime: OffsetDateTime) = estDepTime(JsonField.of(estDepTime))

                /**
                 * Sets [Builder.estDepTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.estDepTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun estDepTime(estDepTime: JsonField<OffsetDateTime>) = apply {
                    this.estDepTime = estDepTime
                }

                /**
                 * Last time transportation plan was updated, in ISO 8601 UTC format with
                 * millisecond precision.
                 */
                fun lastChangedDate(lastChangedDate: OffsetDateTime) =
                    lastChangedDate(JsonField.of(lastChangedDate))

                /**
                 * Sets [Builder.lastChangedDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastChangedDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun lastChangedDate(lastChangedDate: JsonField<OffsetDateTime>) = apply {
                    this.lastChangedDate = lastChangedDate
                }

                /** The identifier that represents a Logistics Master Record. */
                fun logisticMasterRecordId(logisticMasterRecordId: String) =
                    logisticMasterRecordId(JsonField.of(logisticMasterRecordId))

                /**
                 * Sets [Builder.logisticMasterRecordId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logisticMasterRecordId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun logisticMasterRecordId(logisticMasterRecordId: JsonField<String>) = apply {
                    this.logisticMasterRecordId = logisticMasterRecordId
                }

                /** The transportation segments associated with this transportation plan. */
                fun logisticsSegments(logisticsSegments: List<LogisticsSegment>) =
                    logisticsSegments(JsonField.of(logisticsSegments))

                /**
                 * Sets [Builder.logisticsSegments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logisticsSegments] with a well-typed
                 * `List<LogisticsSegment>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun logisticsSegments(logisticsSegments: JsonField<List<LogisticsSegment>>) =
                    apply {
                        this.logisticsSegments = logisticsSegments.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [LogisticsSegment] to [logisticsSegments].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLogisticsSegment(logisticsSegment: LogisticsSegment) = apply {
                    logisticsSegments =
                        (logisticsSegments ?: JsonField.of(mutableListOf())).also {
                            checkKnown("logisticsSegments", it).add(logisticsSegment)
                        }
                }

                /** Remarks associated with this transportation plan. */
                fun logisticsTransportationPlansRemarks(
                    logisticsTransportationPlansRemarks: List<LogisticsRemarksIngest>
                ) =
                    logisticsTransportationPlansRemarks(
                        JsonField.of(logisticsTransportationPlansRemarks)
                    )

                /**
                 * Sets [Builder.logisticsTransportationPlansRemarks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logisticsTransportationPlansRemarks] with a
                 * well-typed `List<LogisticsRemarksIngest>` value instead. This method is primarily
                 * for setting the field to an undocumented or not yet supported value.
                 */
                fun logisticsTransportationPlansRemarks(
                    logisticsTransportationPlansRemarks: JsonField<List<LogisticsRemarksIngest>>
                ) = apply {
                    this.logisticsTransportationPlansRemarks =
                        logisticsTransportationPlansRemarks.map { it.toMutableList() }
                }

                /**
                 * Adds a single [LogisticsRemarksIngest] to [logisticsTransportationPlansRemarks].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLogisticsTransportationPlansRemark(
                    logisticsTransportationPlansRemark: LogisticsRemarksIngest
                ) = apply {
                    logisticsTransportationPlansRemarks =
                        (logisticsTransportationPlansRemarks ?: JsonField.of(mutableListOf()))
                            .also {
                                checkKnown("logisticsTransportationPlansRemarks", it)
                                    .add(logisticsTransportationPlansRemark)
                            }
                }

                /** The major command for the current unit. */
                fun majcom(majcom: String) = majcom(JsonField.of(majcom))

                /**
                 * Sets [Builder.majcom] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.majcom] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun majcom(majcom: JsonField<String>) = apply { this.majcom = majcom }

                /**
                 * Indicates whether there have been changes to changes to ICAOs, estArrTime, or
                 * estDepTime since this Transportation Plan was last edited.
                 */
                fun missionChange(missionChange: Boolean) =
                    missionChange(JsonField.of(missionChange))

                /**
                 * Sets [Builder.missionChange] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.missionChange] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun missionChange(missionChange: JsonField<Boolean>) = apply {
                    this.missionChange = missionChange
                }

                /** Transportation plan enroute stops. */
                fun numEnrouteStops(numEnrouteStops: Int) =
                    numEnrouteStops(JsonField.of(numEnrouteStops))

                /**
                 * Sets [Builder.numEnrouteStops] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.numEnrouteStops] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun numEnrouteStops(numEnrouteStops: JsonField<Int>) = apply {
                    this.numEnrouteStops = numEnrouteStops
                }

                /** The number of transloads for this Transportation Plan. */
                fun numTransLoads(numTransLoads: Int) = numTransLoads(JsonField.of(numTransLoads))

                /**
                 * Sets [Builder.numTransLoads] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.numTransLoads] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun numTransLoads(numTransLoads: JsonField<Int>) = apply {
                    this.numTransLoads = numTransLoads
                }

                /** The origin location. */
                fun originIcao(originIcao: String) = originIcao(JsonField.of(originIcao))

                /**
                 * Sets [Builder.originIcao] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originIcao] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun originIcao(originIcao: JsonField<String>) = apply {
                    this.originIcao = originIcao
                }

                /** Defines the transporation plan as either a deployment or redeployment. */
                fun planDefinition(planDefinition: String) =
                    planDefinition(JsonField.of(planDefinition))

                /**
                 * Sets [Builder.planDefinition] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planDefinition] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun planDefinition(planDefinition: JsonField<String>) = apply {
                    this.planDefinition = planDefinition
                }

                /**
                 * System generated reference id for the transportation plan. Format: TXXXXXNNNN T -
                 * Transportation, Sequence Number, Node Id.
                 */
                fun plansNumber(plansNumber: String) = plansNumber(JsonField.of(plansNumber))

                /**
                 * Sets [Builder.plansNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.plansNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun plansNumber(plansNumber: JsonField<String>) = apply {
                    this.plansNumber = plansNumber
                }

                /**
                 * GDSS2 uses an 8 character serial number to uniquely identify the aircraft and MDS
                 * combination. This is a portion of the full manufacturer serial number.
                 */
                fun serialNumber(serialNumber: String) = serialNumber(JsonField.of(serialNumber))

                /**
                 * Sets [Builder.serialNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.serialNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun serialNumber(serialNumber: JsonField<String>) = apply {
                    this.serialNumber = serialNumber
                }

                /**
                 * Transporation Coordination status code. Cancel, Send to APCC, working, agree,
                 * disapprove or blank.
                 */
                fun statusCode(statusCode: String) = statusCode(JsonField.of(statusCode))

                /**
                 * Sets [Builder.statusCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun statusCode(statusCode: JsonField<String>) = apply {
                    this.statusCode = statusCode
                }

                /**
                 * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15
                 * EAGLE, KC-130 HERCULES, etc.) of this aircraft. Intended as, but not constrained
                 * to, MIL-STD-6016 environment dependent specific type designations.
                 */
                fun tpAircraftMds(tpAircraftMds: String) =
                    tpAircraftMds(JsonField.of(tpAircraftMds))

                /**
                 * Sets [Builder.tpAircraftMds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tpAircraftMds] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tpAircraftMds(tpAircraftMds: JsonField<String>) = apply {
                    this.tpAircraftMds = tpAircraftMds
                }

                /** Contains the tail number displayed by GDSS2. */
                fun tpTailNumber(tpTailNumber: String) = tpTailNumber(JsonField.of(tpTailNumber))

                /**
                 * Sets [Builder.tpTailNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tpTailNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tpTailNumber(tpTailNumber: JsonField<String>) = apply {
                    this.tpTailNumber = tpTailNumber
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
                 * Returns an immutable instance of [LogisticsTransportationPlan].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LogisticsTransportationPlan =
                    LogisticsTransportationPlan(
                        actDepTime,
                        aircraftStatus,
                        approxArrTime,
                        cancelledDate,
                        closedDate,
                        coordinator,
                        coordinatorUnit,
                        destinationIcao,
                        duration,
                        estArrTime,
                        estDepTime,
                        lastChangedDate,
                        logisticMasterRecordId,
                        (logisticsSegments ?: JsonMissing.of()).map { it.toImmutable() },
                        (logisticsTransportationPlansRemarks ?: JsonMissing.of()).map {
                            it.toImmutable()
                        },
                        majcom,
                        missionChange,
                        numEnrouteStops,
                        numTransLoads,
                        originIcao,
                        planDefinition,
                        plansNumber,
                        serialNumber,
                        statusCode,
                        tpAircraftMds,
                        tpTailNumber,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LogisticsTransportationPlan = apply {
                if (validated) {
                    return@apply
                }

                actDepTime()
                aircraftStatus()
                approxArrTime()
                cancelledDate()
                closedDate()
                coordinator()
                coordinatorUnit()
                destinationIcao()
                duration()
                estArrTime()
                estDepTime()
                lastChangedDate()
                logisticMasterRecordId()
                logisticsSegments().ifPresent { it.forEach { it.validate() } }
                logisticsTransportationPlansRemarks().ifPresent { it.forEach { it.validate() } }
                majcom()
                missionChange()
                numEnrouteStops()
                numTransLoads()
                originIcao()
                planDefinition()
                plansNumber()
                serialNumber()
                statusCode()
                tpAircraftMds()
                tpTailNumber()
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
                (if (actDepTime.asKnown().isPresent) 1 else 0) +
                    (if (aircraftStatus.asKnown().isPresent) 1 else 0) +
                    (if (approxArrTime.asKnown().isPresent) 1 else 0) +
                    (if (cancelledDate.asKnown().isPresent) 1 else 0) +
                    (if (closedDate.asKnown().isPresent) 1 else 0) +
                    (if (coordinator.asKnown().isPresent) 1 else 0) +
                    (if (coordinatorUnit.asKnown().isPresent) 1 else 0) +
                    (if (destinationIcao.asKnown().isPresent) 1 else 0) +
                    (if (duration.asKnown().isPresent) 1 else 0) +
                    (if (estArrTime.asKnown().isPresent) 1 else 0) +
                    (if (estDepTime.asKnown().isPresent) 1 else 0) +
                    (if (lastChangedDate.asKnown().isPresent) 1 else 0) +
                    (if (logisticMasterRecordId.asKnown().isPresent) 1 else 0) +
                    (logisticsSegments.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (logisticsTransportationPlansRemarks.asKnown().getOrNull()?.sumOf {
                        it.validity().toInt()
                    } ?: 0) +
                    (if (majcom.asKnown().isPresent) 1 else 0) +
                    (if (missionChange.asKnown().isPresent) 1 else 0) +
                    (if (numEnrouteStops.asKnown().isPresent) 1 else 0) +
                    (if (numTransLoads.asKnown().isPresent) 1 else 0) +
                    (if (originIcao.asKnown().isPresent) 1 else 0) +
                    (if (planDefinition.asKnown().isPresent) 1 else 0) +
                    (if (plansNumber.asKnown().isPresent) 1 else 0) +
                    (if (serialNumber.asKnown().isPresent) 1 else 0) +
                    (if (statusCode.asKnown().isPresent) 1 else 0) +
                    (if (tpAircraftMds.asKnown().isPresent) 1 else 0) +
                    (if (tpTailNumber.asKnown().isPresent) 1 else 0)

            /** Remarks associated with this LogisticsSupport record. */
            class LogisticsSegment
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val arrivalIcao: JsonField<String>,
                private val departureIcao: JsonField<String>,
                private val extMissionId: JsonField<String>,
                private val idMission: JsonField<String>,
                private val itin: JsonField<Int>,
                private val missionNumber: JsonField<String>,
                private val missionType: JsonField<String>,
                private val modeCode: JsonField<String>,
                private val segActArrTime: JsonField<OffsetDateTime>,
                private val segActDepTime: JsonField<OffsetDateTime>,
                private val segAircraftMds: JsonField<String>,
                private val segEstArrTime: JsonField<OffsetDateTime>,
                private val segEstDepTime: JsonField<OffsetDateTime>,
                private val segmentNumber: JsonField<Int>,
                private val segTailNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("arrivalICAO")
                    @ExcludeMissing
                    arrivalIcao: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("departureICAO")
                    @ExcludeMissing
                    departureIcao: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("extMissionId")
                    @ExcludeMissing
                    extMissionId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("idMission")
                    @ExcludeMissing
                    idMission: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("itin") @ExcludeMissing itin: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("missionNumber")
                    @ExcludeMissing
                    missionNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("missionType")
                    @ExcludeMissing
                    missionType: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("modeCode")
                    @ExcludeMissing
                    modeCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("segActArrTime")
                    @ExcludeMissing
                    segActArrTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("segActDepTime")
                    @ExcludeMissing
                    segActDepTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("segAircraftMDS")
                    @ExcludeMissing
                    segAircraftMds: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("segEstArrTime")
                    @ExcludeMissing
                    segEstArrTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("segEstDepTime")
                    @ExcludeMissing
                    segEstDepTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("segmentNumber")
                    @ExcludeMissing
                    segmentNumber: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("segTailNumber")
                    @ExcludeMissing
                    segTailNumber: JsonField<String> = JsonMissing.of(),
                ) : this(
                    arrivalIcao,
                    departureIcao,
                    extMissionId,
                    idMission,
                    itin,
                    missionNumber,
                    missionType,
                    modeCode,
                    segActArrTime,
                    segActDepTime,
                    segAircraftMds,
                    segEstArrTime,
                    segEstDepTime,
                    segmentNumber,
                    segTailNumber,
                    mutableMapOf(),
                )

                /**
                 * Airport ICAO arrival code.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun arrivalIcao(): Optional<String> = arrivalIcao.getOptional("arrivalICAO")

                /**
                 * Airport ICAO departure code.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun departureIcao(): Optional<String> = departureIcao.getOptional("departureICAO")

                /**
                 * The GDSS mission ID for this segment.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun extMissionId(): Optional<String> = extMissionId.getOptional("extMissionId")

                /**
                 * The unique identifier of the mission to which this logistics record is assigned.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun idMission(): Optional<String> = idMission.getOptional("idMission")

                /**
                 * Start air mission itinerary point identifier.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun itin(): Optional<Int> = itin.getOptional("itin")

                /**
                 * The user generated identifier for an air mission subgroup.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun missionNumber(): Optional<String> = missionNumber.getOptional("missionNumber")

                /**
                 * The type of mission (e.g. SAAM, CHNL, etc.).
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun missionType(): Optional<String> = missionType.getOptional("missionType")

                /**
                 * Transportation mode. AMC airlift, Commercial airlift, Other, or surface
                 * transportation.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun modeCode(): Optional<String> = modeCode.getOptional("modeCode")

                /**
                 * Actual arrival time to segment destination, in ISO 8601 UTC format with
                 * millisecond precision.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun segActArrTime(): Optional<OffsetDateTime> =
                    segActArrTime.getOptional("segActArrTime")

                /**
                 * Actual departure time to the segment destination, in ISO 8601 UTC format with
                 * millisecond precision.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun segActDepTime(): Optional<OffsetDateTime> =
                    segActDepTime.getOptional("segActDepTime")

                /**
                 * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15
                 * EAGLE, KC-130 HERCULES, etc.) of this aircraft. Intended as, but not constrained
                 * to, MIL-STD-6016 environment dependent specific type designations.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun segAircraftMds(): Optional<String> =
                    segAircraftMds.getOptional("segAircraftMDS")

                /**
                 * GC. LGTPS_C_DT_EST_ARR. GD2: Estimated arrival time to the segment destination.
                 * Only supplied when the segment is not attached to a Mission, otherwise the ETA is
                 * derived from the Mission segment destination point. This datetime should be in
                 * ISO 8601 UTC format with millisecond precision.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun segEstArrTime(): Optional<OffsetDateTime> =
                    segEstArrTime.getOptional("segEstArrTime")

                /**
                 * GC. LGTPS_C_DT_EST_DEP. GD2: Estimated departure time from the segment origin.
                 * Only supplied when the segment is not attached to a Mission, otherwise the ETD is
                 * derived from the Mission segment origin point. This datetime should be in ISO
                 * 8601 UTC format with millisecond precision.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun segEstDepTime(): Optional<OffsetDateTime> =
                    segEstDepTime.getOptional("segEstDepTime")

                /**
                 * Used to sequence the segments in the transportation plan.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun segmentNumber(): Optional<Int> = segmentNumber.getOptional("segmentNumber")

                /**
                 * The identifier that represents a specific aircraft within an aircraft type.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun segTailNumber(): Optional<String> = segTailNumber.getOptional("segTailNumber")

                /**
                 * Returns the raw JSON value of [arrivalIcao].
                 *
                 * Unlike [arrivalIcao], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("arrivalICAO")
                @ExcludeMissing
                fun _arrivalIcao(): JsonField<String> = arrivalIcao

                /**
                 * Returns the raw JSON value of [departureIcao].
                 *
                 * Unlike [departureIcao], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("departureICAO")
                @ExcludeMissing
                fun _departureIcao(): JsonField<String> = departureIcao

                /**
                 * Returns the raw JSON value of [extMissionId].
                 *
                 * Unlike [extMissionId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("extMissionId")
                @ExcludeMissing
                fun _extMissionId(): JsonField<String> = extMissionId

                /**
                 * Returns the raw JSON value of [idMission].
                 *
                 * Unlike [idMission], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("idMission")
                @ExcludeMissing
                fun _idMission(): JsonField<String> = idMission

                /**
                 * Returns the raw JSON value of [itin].
                 *
                 * Unlike [itin], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("itin") @ExcludeMissing fun _itin(): JsonField<Int> = itin

                /**
                 * Returns the raw JSON value of [missionNumber].
                 *
                 * Unlike [missionNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("missionNumber")
                @ExcludeMissing
                fun _missionNumber(): JsonField<String> = missionNumber

                /**
                 * Returns the raw JSON value of [missionType].
                 *
                 * Unlike [missionType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("missionType")
                @ExcludeMissing
                fun _missionType(): JsonField<String> = missionType

                /**
                 * Returns the raw JSON value of [modeCode].
                 *
                 * Unlike [modeCode], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("modeCode")
                @ExcludeMissing
                fun _modeCode(): JsonField<String> = modeCode

                /**
                 * Returns the raw JSON value of [segActArrTime].
                 *
                 * Unlike [segActArrTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("segActArrTime")
                @ExcludeMissing
                fun _segActArrTime(): JsonField<OffsetDateTime> = segActArrTime

                /**
                 * Returns the raw JSON value of [segActDepTime].
                 *
                 * Unlike [segActDepTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("segActDepTime")
                @ExcludeMissing
                fun _segActDepTime(): JsonField<OffsetDateTime> = segActDepTime

                /**
                 * Returns the raw JSON value of [segAircraftMds].
                 *
                 * Unlike [segAircraftMds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("segAircraftMDS")
                @ExcludeMissing
                fun _segAircraftMds(): JsonField<String> = segAircraftMds

                /**
                 * Returns the raw JSON value of [segEstArrTime].
                 *
                 * Unlike [segEstArrTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("segEstArrTime")
                @ExcludeMissing
                fun _segEstArrTime(): JsonField<OffsetDateTime> = segEstArrTime

                /**
                 * Returns the raw JSON value of [segEstDepTime].
                 *
                 * Unlike [segEstDepTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("segEstDepTime")
                @ExcludeMissing
                fun _segEstDepTime(): JsonField<OffsetDateTime> = segEstDepTime

                /**
                 * Returns the raw JSON value of [segmentNumber].
                 *
                 * Unlike [segmentNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("segmentNumber")
                @ExcludeMissing
                fun _segmentNumber(): JsonField<Int> = segmentNumber

                /**
                 * Returns the raw JSON value of [segTailNumber].
                 *
                 * Unlike [segTailNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("segTailNumber")
                @ExcludeMissing
                fun _segTailNumber(): JsonField<String> = segTailNumber

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
                     * Returns a mutable builder for constructing an instance of [LogisticsSegment].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [LogisticsSegment]. */
                class Builder internal constructor() {

                    private var arrivalIcao: JsonField<String> = JsonMissing.of()
                    private var departureIcao: JsonField<String> = JsonMissing.of()
                    private var extMissionId: JsonField<String> = JsonMissing.of()
                    private var idMission: JsonField<String> = JsonMissing.of()
                    private var itin: JsonField<Int> = JsonMissing.of()
                    private var missionNumber: JsonField<String> = JsonMissing.of()
                    private var missionType: JsonField<String> = JsonMissing.of()
                    private var modeCode: JsonField<String> = JsonMissing.of()
                    private var segActArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var segActDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var segAircraftMds: JsonField<String> = JsonMissing.of()
                    private var segEstArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var segEstDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var segmentNumber: JsonField<Int> = JsonMissing.of()
                    private var segTailNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(logisticsSegment: LogisticsSegment) = apply {
                        arrivalIcao = logisticsSegment.arrivalIcao
                        departureIcao = logisticsSegment.departureIcao
                        extMissionId = logisticsSegment.extMissionId
                        idMission = logisticsSegment.idMission
                        itin = logisticsSegment.itin
                        missionNumber = logisticsSegment.missionNumber
                        missionType = logisticsSegment.missionType
                        modeCode = logisticsSegment.modeCode
                        segActArrTime = logisticsSegment.segActArrTime
                        segActDepTime = logisticsSegment.segActDepTime
                        segAircraftMds = logisticsSegment.segAircraftMds
                        segEstArrTime = logisticsSegment.segEstArrTime
                        segEstDepTime = logisticsSegment.segEstDepTime
                        segmentNumber = logisticsSegment.segmentNumber
                        segTailNumber = logisticsSegment.segTailNumber
                        additionalProperties = logisticsSegment.additionalProperties.toMutableMap()
                    }

                    /** Airport ICAO arrival code. */
                    fun arrivalIcao(arrivalIcao: String) = arrivalIcao(JsonField.of(arrivalIcao))

                    /**
                     * Sets [Builder.arrivalIcao] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.arrivalIcao] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun arrivalIcao(arrivalIcao: JsonField<String>) = apply {
                        this.arrivalIcao = arrivalIcao
                    }

                    /** Airport ICAO departure code. */
                    fun departureIcao(departureIcao: String) =
                        departureIcao(JsonField.of(departureIcao))

                    /**
                     * Sets [Builder.departureIcao] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.departureIcao] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun departureIcao(departureIcao: JsonField<String>) = apply {
                        this.departureIcao = departureIcao
                    }

                    /** The GDSS mission ID for this segment. */
                    fun extMissionId(extMissionId: String) =
                        extMissionId(JsonField.of(extMissionId))

                    /**
                     * Sets [Builder.extMissionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.extMissionId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun extMissionId(extMissionId: JsonField<String>) = apply {
                        this.extMissionId = extMissionId
                    }

                    /**
                     * The unique identifier of the mission to which this logistics record is
                     * assigned.
                     */
                    fun idMission(idMission: String) = idMission(JsonField.of(idMission))

                    /**
                     * Sets [Builder.idMission] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.idMission] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun idMission(idMission: JsonField<String>) = apply {
                        this.idMission = idMission
                    }

                    /** Start air mission itinerary point identifier. */
                    fun itin(itin: Int) = itin(JsonField.of(itin))

                    /**
                     * Sets [Builder.itin] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.itin] with a well-typed [Int] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun itin(itin: JsonField<Int>) = apply { this.itin = itin }

                    /** The user generated identifier for an air mission subgroup. */
                    fun missionNumber(missionNumber: String) =
                        missionNumber(JsonField.of(missionNumber))

                    /**
                     * Sets [Builder.missionNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.missionNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun missionNumber(missionNumber: JsonField<String>) = apply {
                        this.missionNumber = missionNumber
                    }

                    /** The type of mission (e.g. SAAM, CHNL, etc.). */
                    fun missionType(missionType: String) = missionType(JsonField.of(missionType))

                    /**
                     * Sets [Builder.missionType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.missionType] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun missionType(missionType: JsonField<String>) = apply {
                        this.missionType = missionType
                    }

                    /**
                     * Transportation mode. AMC airlift, Commercial airlift, Other, or surface
                     * transportation.
                     */
                    fun modeCode(modeCode: String) = modeCode(JsonField.of(modeCode))

                    /**
                     * Sets [Builder.modeCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.modeCode] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun modeCode(modeCode: JsonField<String>) = apply { this.modeCode = modeCode }

                    /**
                     * Actual arrival time to segment destination, in ISO 8601 UTC format with
                     * millisecond precision.
                     */
                    fun segActArrTime(segActArrTime: OffsetDateTime) =
                        segActArrTime(JsonField.of(segActArrTime))

                    /**
                     * Sets [Builder.segActArrTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.segActArrTime] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun segActArrTime(segActArrTime: JsonField<OffsetDateTime>) = apply {
                        this.segActArrTime = segActArrTime
                    }

                    /**
                     * Actual departure time to the segment destination, in ISO 8601 UTC format with
                     * millisecond precision.
                     */
                    fun segActDepTime(segActDepTime: OffsetDateTime) =
                        segActDepTime(JsonField.of(segActDepTime))

                    /**
                     * Sets [Builder.segActDepTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.segActDepTime] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun segActDepTime(segActDepTime: JsonField<OffsetDateTime>) = apply {
                        this.segActDepTime = segActDepTime
                    }

                    /**
                     * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15
                     * EAGLE, KC-130 HERCULES, etc.) of this aircraft. Intended as, but not
                     * constrained to, MIL-STD-6016 environment dependent specific type
                     * designations.
                     */
                    fun segAircraftMds(segAircraftMds: String) =
                        segAircraftMds(JsonField.of(segAircraftMds))

                    /**
                     * Sets [Builder.segAircraftMds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.segAircraftMds] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun segAircraftMds(segAircraftMds: JsonField<String>) = apply {
                        this.segAircraftMds = segAircraftMds
                    }

                    /**
                     * GC. LGTPS_C_DT_EST_ARR. GD2: Estimated arrival time to the segment
                     * destination. Only supplied when the segment is not attached to a Mission,
                     * otherwise the ETA is derived from the Mission segment destination point. This
                     * datetime should be in ISO 8601 UTC format with millisecond precision.
                     */
                    fun segEstArrTime(segEstArrTime: OffsetDateTime) =
                        segEstArrTime(JsonField.of(segEstArrTime))

                    /**
                     * Sets [Builder.segEstArrTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.segEstArrTime] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun segEstArrTime(segEstArrTime: JsonField<OffsetDateTime>) = apply {
                        this.segEstArrTime = segEstArrTime
                    }

                    /**
                     * GC. LGTPS_C_DT_EST_DEP. GD2: Estimated departure time from the segment
                     * origin. Only supplied when the segment is not attached to a Mission,
                     * otherwise the ETD is derived from the Mission segment origin point. This
                     * datetime should be in ISO 8601 UTC format with millisecond precision.
                     */
                    fun segEstDepTime(segEstDepTime: OffsetDateTime) =
                        segEstDepTime(JsonField.of(segEstDepTime))

                    /**
                     * Sets [Builder.segEstDepTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.segEstDepTime] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun segEstDepTime(segEstDepTime: JsonField<OffsetDateTime>) = apply {
                        this.segEstDepTime = segEstDepTime
                    }

                    /** Used to sequence the segments in the transportation plan. */
                    fun segmentNumber(segmentNumber: Int) =
                        segmentNumber(JsonField.of(segmentNumber))

                    /**
                     * Sets [Builder.segmentNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.segmentNumber] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun segmentNumber(segmentNumber: JsonField<Int>) = apply {
                        this.segmentNumber = segmentNumber
                    }

                    /**
                     * The identifier that represents a specific aircraft within an aircraft type.
                     */
                    fun segTailNumber(segTailNumber: String) =
                        segTailNumber(JsonField.of(segTailNumber))

                    /**
                     * Sets [Builder.segTailNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.segTailNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun segTailNumber(segTailNumber: JsonField<String>) = apply {
                        this.segTailNumber = segTailNumber
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
                     * Returns an immutable instance of [LogisticsSegment].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): LogisticsSegment =
                        LogisticsSegment(
                            arrivalIcao,
                            departureIcao,
                            extMissionId,
                            idMission,
                            itin,
                            missionNumber,
                            missionType,
                            modeCode,
                            segActArrTime,
                            segActDepTime,
                            segAircraftMds,
                            segEstArrTime,
                            segEstDepTime,
                            segmentNumber,
                            segTailNumber,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): LogisticsSegment = apply {
                    if (validated) {
                        return@apply
                    }

                    arrivalIcao()
                    departureIcao()
                    extMissionId()
                    idMission()
                    itin()
                    missionNumber()
                    missionType()
                    modeCode()
                    segActArrTime()
                    segActDepTime()
                    segAircraftMds()
                    segEstArrTime()
                    segEstDepTime()
                    segmentNumber()
                    segTailNumber()
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
                    (if (arrivalIcao.asKnown().isPresent) 1 else 0) +
                        (if (departureIcao.asKnown().isPresent) 1 else 0) +
                        (if (extMissionId.asKnown().isPresent) 1 else 0) +
                        (if (idMission.asKnown().isPresent) 1 else 0) +
                        (if (itin.asKnown().isPresent) 1 else 0) +
                        (if (missionNumber.asKnown().isPresent) 1 else 0) +
                        (if (missionType.asKnown().isPresent) 1 else 0) +
                        (if (modeCode.asKnown().isPresent) 1 else 0) +
                        (if (segActArrTime.asKnown().isPresent) 1 else 0) +
                        (if (segActDepTime.asKnown().isPresent) 1 else 0) +
                        (if (segAircraftMds.asKnown().isPresent) 1 else 0) +
                        (if (segEstArrTime.asKnown().isPresent) 1 else 0) +
                        (if (segEstDepTime.asKnown().isPresent) 1 else 0) +
                        (if (segmentNumber.asKnown().isPresent) 1 else 0) +
                        (if (segTailNumber.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LogisticsSegment &&
                        arrivalIcao == other.arrivalIcao &&
                        departureIcao == other.departureIcao &&
                        extMissionId == other.extMissionId &&
                        idMission == other.idMission &&
                        itin == other.itin &&
                        missionNumber == other.missionNumber &&
                        missionType == other.missionType &&
                        modeCode == other.modeCode &&
                        segActArrTime == other.segActArrTime &&
                        segActDepTime == other.segActDepTime &&
                        segAircraftMds == other.segAircraftMds &&
                        segEstArrTime == other.segEstArrTime &&
                        segEstDepTime == other.segEstDepTime &&
                        segmentNumber == other.segmentNumber &&
                        segTailNumber == other.segTailNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        arrivalIcao,
                        departureIcao,
                        extMissionId,
                        idMission,
                        itin,
                        missionNumber,
                        missionType,
                        modeCode,
                        segActArrTime,
                        segActDepTime,
                        segAircraftMds,
                        segEstArrTime,
                        segEstDepTime,
                        segmentNumber,
                        segTailNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LogisticsSegment{arrivalIcao=$arrivalIcao, departureIcao=$departureIcao, extMissionId=$extMissionId, idMission=$idMission, itin=$itin, missionNumber=$missionNumber, missionType=$missionType, modeCode=$modeCode, segActArrTime=$segActArrTime, segActDepTime=$segActDepTime, segAircraftMds=$segAircraftMds, segEstArrTime=$segEstArrTime, segEstDepTime=$segEstDepTime, segmentNumber=$segmentNumber, segTailNumber=$segTailNumber, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LogisticsTransportationPlan &&
                    actDepTime == other.actDepTime &&
                    aircraftStatus == other.aircraftStatus &&
                    approxArrTime == other.approxArrTime &&
                    cancelledDate == other.cancelledDate &&
                    closedDate == other.closedDate &&
                    coordinator == other.coordinator &&
                    coordinatorUnit == other.coordinatorUnit &&
                    destinationIcao == other.destinationIcao &&
                    duration == other.duration &&
                    estArrTime == other.estArrTime &&
                    estDepTime == other.estDepTime &&
                    lastChangedDate == other.lastChangedDate &&
                    logisticMasterRecordId == other.logisticMasterRecordId &&
                    logisticsSegments == other.logisticsSegments &&
                    logisticsTransportationPlansRemarks ==
                        other.logisticsTransportationPlansRemarks &&
                    majcom == other.majcom &&
                    missionChange == other.missionChange &&
                    numEnrouteStops == other.numEnrouteStops &&
                    numTransLoads == other.numTransLoads &&
                    originIcao == other.originIcao &&
                    planDefinition == other.planDefinition &&
                    plansNumber == other.plansNumber &&
                    serialNumber == other.serialNumber &&
                    statusCode == other.statusCode &&
                    tpAircraftMds == other.tpAircraftMds &&
                    tpTailNumber == other.tpTailNumber &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    actDepTime,
                    aircraftStatus,
                    approxArrTime,
                    cancelledDate,
                    closedDate,
                    coordinator,
                    coordinatorUnit,
                    destinationIcao,
                    duration,
                    estArrTime,
                    estDepTime,
                    lastChangedDate,
                    logisticMasterRecordId,
                    logisticsSegments,
                    logisticsTransportationPlansRemarks,
                    majcom,
                    missionChange,
                    numEnrouteStops,
                    numTransLoads,
                    originIcao,
                    planDefinition,
                    plansNumber,
                    serialNumber,
                    statusCode,
                    tpAircraftMds,
                    tpTailNumber,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LogisticsTransportationPlan{actDepTime=$actDepTime, aircraftStatus=$aircraftStatus, approxArrTime=$approxArrTime, cancelledDate=$cancelledDate, closedDate=$closedDate, coordinator=$coordinator, coordinatorUnit=$coordinatorUnit, destinationIcao=$destinationIcao, duration=$duration, estArrTime=$estArrTime, estDepTime=$estDepTime, lastChangedDate=$lastChangedDate, logisticMasterRecordId=$logisticMasterRecordId, logisticsSegments=$logisticsSegments, logisticsTransportationPlansRemarks=$logisticsTransportationPlansRemarks, majcom=$majcom, missionChange=$missionChange, numEnrouteStops=$numEnrouteStops, numTransLoads=$numTransLoads, originIcao=$originIcao, planDefinition=$planDefinition, plansNumber=$plansNumber, serialNumber=$serialNumber, statusCode=$statusCode, tpAircraftMds=$tpAircraftMds, tpTailNumber=$tpTailNumber, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                rptCreatedTime == other.rptCreatedTime &&
                source == other.source &&
                id == other.id &&
                aircraftMds == other.aircraftMds &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                currIcao == other.currIcao &&
                etic == other.etic &&
                etmc == other.etmc &&
                extSystemId == other.extSystemId &&
                logisticAction == other.logisticAction &&
                logisticsDiscrepancyInfos == other.logisticsDiscrepancyInfos &&
                logisticsRecordId == other.logisticsRecordId &&
                logisticsRemarks == other.logisticsRemarks &&
                logisticsSupportItems == other.logisticsSupportItems &&
                logisticsTransportationPlans == other.logisticsTransportationPlans &&
                maintStatusCode == other.maintStatusCode &&
                mcTime == other.mcTime &&
                meTime == other.meTime &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                owner == other.owner &&
                reopenFlag == other.reopenFlag &&
                rptClosedTime == other.rptClosedTime &&
                suppIcao == other.suppIcao &&
                tailNumber == other.tailNumber &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                rptCreatedTime,
                source,
                id,
                aircraftMds,
                createdAt,
                createdBy,
                currIcao,
                etic,
                etmc,
                extSystemId,
                logisticAction,
                logisticsDiscrepancyInfos,
                logisticsRecordId,
                logisticsRemarks,
                logisticsSupportItems,
                logisticsTransportationPlans,
                maintStatusCode,
                mcTime,
                meTime,
                origin,
                origNetwork,
                owner,
                reopenFlag,
                rptClosedTime,
                suppIcao,
                tailNumber,
                updatedAt,
                updatedBy,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, rptCreatedTime=$rptCreatedTime, source=$source, id=$id, aircraftMds=$aircraftMds, createdAt=$createdAt, createdBy=$createdBy, currIcao=$currIcao, etic=$etic, etmc=$etmc, extSystemId=$extSystemId, logisticAction=$logisticAction, logisticsDiscrepancyInfos=$logisticsDiscrepancyInfos, logisticsRecordId=$logisticsRecordId, logisticsRemarks=$logisticsRemarks, logisticsSupportItems=$logisticsSupportItems, logisticsTransportationPlans=$logisticsTransportationPlans, maintStatusCode=$maintStatusCode, mcTime=$mcTime, meTime=$meTime, origin=$origin, origNetwork=$origNetwork, owner=$owner, reopenFlag=$reopenFlag, rptClosedTime=$rptClosedTime, suppIcao=$suppIcao, tailNumber=$tailNumber, updatedAt=$updatedAt, updatedBy=$updatedBy}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogisticsSupportCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "LogisticsSupportCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

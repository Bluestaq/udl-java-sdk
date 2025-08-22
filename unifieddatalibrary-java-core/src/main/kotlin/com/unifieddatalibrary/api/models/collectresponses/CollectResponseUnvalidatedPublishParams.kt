// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.collectresponses

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation to take a list of CollectResponse as a POST body and ingest into the database.
 * This operation is intended to be used for automated feeds into UDL. A specific role is required
 * to perform this service operation. Please contact the UDL team for assistance.
 */
class CollectResponseUnvalidatedPublishParams
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
         * [CollectResponseUnvalidatedPublishParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CollectResponseUnvalidatedPublishParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            collectResponseUnvalidatedPublishParams: CollectResponseUnvalidatedPublishParams
        ) = apply {
            body = collectResponseUnvalidatedPublishParams.body.toMutableList()
            additionalHeaders =
                collectResponseUnvalidatedPublishParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                collectResponseUnvalidatedPublishParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [CollectResponseUnvalidatedPublishParams].
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
        fun build(): CollectResponseUnvalidatedPublishParams =
            CollectResponseUnvalidatedPublishParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Collect response supports the response and status of individual collect requests. Each
     * response is referenced by the UUID of the request, and contains information including the
     * status of the request, collection times and types, and reference(s) to the observations
     * collected. There may be multiple responses associated with a request, either from multiple
     * collectors or to relay status changes prior to completion and delivery.
     */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("idRequest") @ExcludeMissing private val idRequest: JsonField<String>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("actualEndTime")
        @ExcludeMissing
        private val actualEndTime: JsonField<OffsetDateTime>,
        @JsonProperty("actualStartTime")
        @ExcludeMissing
        private val actualStartTime: JsonField<OffsetDateTime>,
        @JsonProperty("altEndTime")
        @ExcludeMissing
        private val altEndTime: JsonField<OffsetDateTime>,
        @JsonProperty("altStartTime")
        @ExcludeMissing
        private val altStartTime: JsonField<OffsetDateTime>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("errCode") @ExcludeMissing private val errCode: JsonField<String>,
        @JsonProperty("externalId") @ExcludeMissing private val externalId: JsonField<String>,
        @JsonProperty("idOnOrbit") @ExcludeMissing private val idOnOrbit: JsonField<String>,
        @JsonProperty("idPlan") @ExcludeMissing private val idPlan: JsonField<String>,
        @JsonProperty("idSensor") @ExcludeMissing private val idSensor: JsonField<String>,
        @JsonProperty("notes") @ExcludeMissing private val notes: JsonField<String>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("origObjectId") @ExcludeMissing private val origObjectId: JsonField<String>,
        @JsonProperty("origSensorId") @ExcludeMissing private val origSensorId: JsonField<String>,
        @JsonProperty("satNo") @ExcludeMissing private val satNo: JsonField<Int>,
        @JsonProperty("srcIds") @ExcludeMissing private val srcIds: JsonField<List<String>>,
        @JsonProperty("srcTyps") @ExcludeMissing private val srcTyps: JsonField<List<String>>,
        @JsonProperty("status") @ExcludeMissing private val status: JsonField<String>,
        @JsonProperty("tags") @ExcludeMissing private val tags: JsonField<List<String>>,
        @JsonProperty("taskId") @ExcludeMissing private val taskId: JsonField<String>,
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
         * Unique identifier of the request associated with this response.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun idRequest(): String = idRequest.getRequired("idRequest")

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
         * The actual end time of the collect or contact, in ISO 8601 UTC format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun actualEndTime(): Optional<OffsetDateTime> = actualEndTime.getOptional("actualEndTime")

        /**
         * The actual start time of the collect or contact, in ISO 8601 UTC format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun actualStartTime(): Optional<OffsetDateTime> =
            actualStartTime.getOptional("actualStartTime")

        /**
         * Proposed alternative end time, in ISO 8601 UTC format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun altEndTime(): Optional<OffsetDateTime> = altEndTime.getOptional("altEndTime")

        /**
         * Proposed alternative start time, in ISO 8601 UTC format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun altStartTime(): Optional<OffsetDateTime> = altStartTime.getOptional("altStartTime")

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
         * Error code associated with this request/response.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun errCode(): Optional<String> = errCode.getOptional("errCode")

        /**
         * UUID from external systems. This field has no meaning within UDL and is provided as a
         * convenience for systems that require tracking of internal system generated ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun externalId(): Optional<String> = externalId.getOptional("externalId")

        /**
         * Unique identifier of the target on-orbit object associated with this response.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

        /**
         * Unique identifier of the parent plan or schedule associated with the request/response.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idPlan(): Optional<String> = idPlan.getOptional("idPlan")

        /**
         * Unique identifier of the reporting sensor.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

        /**
         * Notes or comments associated with this response.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

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
         * Optional identifier provided by data source to indicate the target object of this
         * response. This may be an internal identifier and not necessarily a valid satellite
         * number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

        /**
         * Optional identifier provided by the collection source to indicate the sensor identifier
         * responding to this collect or contact. This may be an internal identifier and not
         * necessarily a valid sensor ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

        /**
         * Satellite/catalog number of the target on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun satNo(): Optional<Int> = satNo.getOptional("satNo")

        /**
         * Array of UUIDs of the UDL data record(s) collected in response to the associated request.
         * See the associated 'srcTyps' array for the specific types of data, positionally
         * corresponding to the UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in
         * size. The appropriate API operation can be used to retrieve the specified object(s) (e.g.
         * /udl/rfobservation/{uuid}).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun srcIds(): Optional<List<String>> = srcIds.getOptional("srcIds")

        /**
         * Array of UDL record type(s) (DOA, ELSET, EO, RADAR, RF, SV) collected or produced in
         * response to the associated request. See the associated 'srcIds' array for the record
         * UUIDs, positionally corresponding to the record types in this array. The 'srcTyps' and
         * 'srcIds' arrays must match in size. The appropriate API operation can be used to retrieve
         * the specified object(s) (e.g. /udl/rfobservation/{uuid}).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun srcTyps(): Optional<List<String>> = srcTyps.getOptional("srcTyps")

        /**
         * The status of the request (ACCEPTED, CANCELLED, COLLECTED, COMPLETED, DELIVERED, FAILED,
         * PARTIAL, PROPOSED, REJECTED, SCHEDULED):
         *
         * ACCEPTED: The collect or contact request has been received and accepted.
         *
         * CANCELLED: A previously scheduled collect or contact whose execution was cancelled.
         *
         * COLLECTED: The collect has been accomplished. A collected state implies that additional
         * activity is required for delivery/completion.
         *
         * COMPLETED: The collect or contact has been completed. For many systems completed and
         * delivered constitute an equivalent successful end state.
         *
         * DELIVERED: The collected observation(s) have been delivered to the requestor. For many
         * systems completed and delivered constitute an equivalent successful end state. A
         * DELIVERED state is typically used for systems that exhibit a delay between collect and
         * delivery, such as with space-based systems which require ground contact to deliver
         * observations.
         *
         * FAILED: The collect or contact was attempted and failed, or the delivery of the collected
         * observation(s) failed. A FAILED status may be accompanied by an error code (errCode), if
         * available.
         *
         * PARTIAL: A PARTIAL state indicates that a part of a multi-track request has been
         * accomplished, but the full request is incomplete. A PARTIAL status should ultimately be
         * resolved to an end state.
         *
         * PROPOSED: Indicates that the request was received and alternate collect or contact
         * time(s) (altStartTime, altEndTime) have been proposed. If an alternate is accepted by the
         * requestor the current request should be cancelled and a new request created.
         *
         * REJECTED: The request has been received and rejected by the provider. A REJECTED status
         * may be accompanied by an explanation (notes) of the reason that the request was rejected.
         *
         * SCHEDULED: The request was received and has been scheduled for execution.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * Optional array of provider/source specific tags for this data, where each element is no
         * longer than 32 characters, used for implementing data owner conditional access controls
         * to restrict access to the data. Should be left null by data providers unless conditional
         * access controls are coordinated with the UDL team.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Optional task ID associated with the request/response.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun taskId(): Optional<String> = taskId.getOptional("taskId")

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
         * Returns the raw JSON value of [idRequest].
         *
         * Unlike [idRequest], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idRequest") @ExcludeMissing fun _idRequest(): JsonField<String> = idRequest

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
         * Returns the raw JSON value of [actualEndTime].
         *
         * Unlike [actualEndTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("actualEndTime")
        @ExcludeMissing
        fun _actualEndTime(): JsonField<OffsetDateTime> = actualEndTime

        /**
         * Returns the raw JSON value of [actualStartTime].
         *
         * Unlike [actualStartTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("actualStartTime")
        @ExcludeMissing
        fun _actualStartTime(): JsonField<OffsetDateTime> = actualStartTime

        /**
         * Returns the raw JSON value of [altEndTime].
         *
         * Unlike [altEndTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("altEndTime")
        @ExcludeMissing
        fun _altEndTime(): JsonField<OffsetDateTime> = altEndTime

        /**
         * Returns the raw JSON value of [altStartTime].
         *
         * Unlike [altStartTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("altStartTime")
        @ExcludeMissing
        fun _altStartTime(): JsonField<OffsetDateTime> = altStartTime

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
         * Returns the raw JSON value of [errCode].
         *
         * Unlike [errCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("errCode") @ExcludeMissing fun _errCode(): JsonField<String> = errCode

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("externalId")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [idOnOrbit].
         *
         * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

        /**
         * Returns the raw JSON value of [idPlan].
         *
         * Unlike [idPlan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idPlan") @ExcludeMissing fun _idPlan(): JsonField<String> = idPlan

        /**
         * Returns the raw JSON value of [idSensor].
         *
         * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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
         * Returns the raw JSON value of [origObjectId].
         *
         * Unlike [origObjectId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("origObjectId")
        @ExcludeMissing
        fun _origObjectId(): JsonField<String> = origObjectId

        /**
         * Returns the raw JSON value of [origSensorId].
         *
         * Unlike [origSensorId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("origSensorId")
        @ExcludeMissing
        fun _origSensorId(): JsonField<String> = origSensorId

        /**
         * Returns the raw JSON value of [satNo].
         *
         * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

        /**
         * Returns the raw JSON value of [srcIds].
         *
         * Unlike [srcIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("srcIds") @ExcludeMissing fun _srcIds(): JsonField<List<String>> = srcIds

        /**
         * Returns the raw JSON value of [srcTyps].
         *
         * Unlike [srcTyps], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("srcTyps") @ExcludeMissing fun _srcTyps(): JsonField<List<String>> = srcTyps

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [taskId].
         *
         * Unlike [taskId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taskId") @ExcludeMissing fun _taskId(): JsonField<String> = taskId

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .idRequest()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var idRequest: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var actualEndTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var actualStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var altEndTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var altStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var errCode: JsonField<String> = JsonMissing.of()
            private var externalId: JsonField<String> = JsonMissing.of()
            private var idOnOrbit: JsonField<String> = JsonMissing.of()
            private var idPlan: JsonField<String> = JsonMissing.of()
            private var idSensor: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var origObjectId: JsonField<String> = JsonMissing.of()
            private var origSensorId: JsonField<String> = JsonMissing.of()
            private var satNo: JsonField<Int> = JsonMissing.of()
            private var srcIds: JsonField<MutableList<String>>? = null
            private var srcTyps: JsonField<MutableList<String>>? = null
            private var status: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var taskId: JsonField<String> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                idRequest = body.idRequest
                source = body.source
                id = body.id
                actualEndTime = body.actualEndTime
                actualStartTime = body.actualStartTime
                altEndTime = body.altEndTime
                altStartTime = body.altStartTime
                createdAt = body.createdAt
                createdBy = body.createdBy
                errCode = body.errCode
                externalId = body.externalId
                idOnOrbit = body.idOnOrbit
                idPlan = body.idPlan
                idSensor = body.idSensor
                notes = body.notes
                origin = body.origin
                origNetwork = body.origNetwork
                origObjectId = body.origObjectId
                origSensorId = body.origSensorId
                satNo = body.satNo
                srcIds = body.srcIds.map { it.toMutableList() }
                srcTyps = body.srcTyps.map { it.toMutableList() }
                status = body.status
                tags = body.tags.map { it.toMutableList() }
                taskId = body.taskId
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

            /** Unique identifier of the request associated with this response. */
            fun idRequest(idRequest: String) = idRequest(JsonField.of(idRequest))

            /**
             * Sets [Builder.idRequest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idRequest] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idRequest(idRequest: JsonField<String>) = apply { this.idRequest = idRequest }

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

            /** The actual end time of the collect or contact, in ISO 8601 UTC format. */
            fun actualEndTime(actualEndTime: OffsetDateTime) =
                actualEndTime(JsonField.of(actualEndTime))

            /**
             * Sets [Builder.actualEndTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actualEndTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun actualEndTime(actualEndTime: JsonField<OffsetDateTime>) = apply {
                this.actualEndTime = actualEndTime
            }

            /** The actual start time of the collect or contact, in ISO 8601 UTC format. */
            fun actualStartTime(actualStartTime: OffsetDateTime) =
                actualStartTime(JsonField.of(actualStartTime))

            /**
             * Sets [Builder.actualStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actualStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun actualStartTime(actualStartTime: JsonField<OffsetDateTime>) = apply {
                this.actualStartTime = actualStartTime
            }

            /** Proposed alternative end time, in ISO 8601 UTC format. */
            fun altEndTime(altEndTime: OffsetDateTime) = altEndTime(JsonField.of(altEndTime))

            /**
             * Sets [Builder.altEndTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altEndTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altEndTime(altEndTime: JsonField<OffsetDateTime>) = apply {
                this.altEndTime = altEndTime
            }

            /** Proposed alternative start time, in ISO 8601 UTC format. */
            fun altStartTime(altStartTime: OffsetDateTime) =
                altStartTime(JsonField.of(altStartTime))

            /**
             * Sets [Builder.altStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun altStartTime(altStartTime: JsonField<OffsetDateTime>) = apply {
                this.altStartTime = altStartTime
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

            /** Error code associated with this request/response. */
            fun errCode(errCode: String) = errCode(JsonField.of(errCode))

            /**
             * Sets [Builder.errCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errCode(errCode: JsonField<String>) = apply { this.errCode = errCode }

            /**
             * UUID from external systems. This field has no meaning within UDL and is provided as a
             * convenience for systems that require tracking of internal system generated ID.
             */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /** Unique identifier of the target on-orbit object associated with this response. */
            fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

            /**
             * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

            /**
             * Unique identifier of the parent plan or schedule associated with the
             * request/response.
             */
            fun idPlan(idPlan: String) = idPlan(JsonField.of(idPlan))

            /**
             * Sets [Builder.idPlan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idPlan] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idPlan(idPlan: JsonField<String>) = apply { this.idPlan = idPlan }

            /** Unique identifier of the reporting sensor. */
            fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

            /**
             * Sets [Builder.idSensor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSensor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

            /** Notes or comments associated with this response. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * Optional identifier provided by data source to indicate the target object of this
             * response. This may be an internal identifier and not necessarily a valid satellite
             * number.
             */
            fun origObjectId(origObjectId: String) = origObjectId(JsonField.of(origObjectId))

            /**
             * Sets [Builder.origObjectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origObjectId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origObjectId(origObjectId: JsonField<String>) = apply {
                this.origObjectId = origObjectId
            }

            /**
             * Optional identifier provided by the collection source to indicate the sensor
             * identifier responding to this collect or contact. This may be an internal identifier
             * and not necessarily a valid sensor ID.
             */
            fun origSensorId(origSensorId: String) = origSensorId(JsonField.of(origSensorId))

            /**
             * Sets [Builder.origSensorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origSensorId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origSensorId(origSensorId: JsonField<String>) = apply {
                this.origSensorId = origSensorId
            }

            /** Satellite/catalog number of the target on-orbit object. */
            fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

            /**
             * Sets [Builder.satNo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

            /**
             * Array of UUIDs of the UDL data record(s) collected in response to the associated
             * request. See the associated 'srcTyps' array for the specific types of data,
             * positionally corresponding to the UUIDs in this array. The 'srcTyps' and 'srcIds'
             * arrays must match in size. The appropriate API operation can be used to retrieve the
             * specified object(s) (e.g. /udl/rfobservation/{uuid}).
             */
            fun srcIds(srcIds: List<String>) = srcIds(JsonField.of(srcIds))

            /**
             * Sets [Builder.srcIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.srcIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun srcIds(srcIds: JsonField<List<String>>) = apply {
                this.srcIds = srcIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [srcIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSrcId(srcId: String) = apply {
                srcIds =
                    (srcIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("srcIds", it).add(srcId)
                    }
            }

            /**
             * Array of UDL record type(s) (DOA, ELSET, EO, RADAR, RF, SV) collected or produced in
             * response to the associated request. See the associated 'srcIds' array for the record
             * UUIDs, positionally corresponding to the record types in this array. The 'srcTyps'
             * and 'srcIds' arrays must match in size. The appropriate API operation can be used to
             * retrieve the specified object(s) (e.g. /udl/rfobservation/{uuid}).
             */
            fun srcTyps(srcTyps: List<String>) = srcTyps(JsonField.of(srcTyps))

            /**
             * Sets [Builder.srcTyps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.srcTyps] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun srcTyps(srcTyps: JsonField<List<String>>) = apply {
                this.srcTyps = srcTyps.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [srcTyps].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSrcTyp(srcTyp: String) = apply {
                srcTyps =
                    (srcTyps ?: JsonField.of(mutableListOf())).also {
                        checkKnown("srcTyps", it).add(srcTyp)
                    }
            }

            /**
             * The status of the request (ACCEPTED, CANCELLED, COLLECTED, COMPLETED, DELIVERED,
             * FAILED, PARTIAL, PROPOSED, REJECTED, SCHEDULED):
             *
             * ACCEPTED: The collect or contact request has been received and accepted.
             *
             * CANCELLED: A previously scheduled collect or contact whose execution was cancelled.
             *
             * COLLECTED: The collect has been accomplished. A collected state implies that
             * additional activity is required for delivery/completion.
             *
             * COMPLETED: The collect or contact has been completed. For many systems completed and
             * delivered constitute an equivalent successful end state.
             *
             * DELIVERED: The collected observation(s) have been delivered to the requestor. For
             * many systems completed and delivered constitute an equivalent successful end state. A
             * DELIVERED state is typically used for systems that exhibit a delay between collect
             * and delivery, such as with space-based systems which require ground contact to
             * deliver observations.
             *
             * FAILED: The collect or contact was attempted and failed, or the delivery of the
             * collected observation(s) failed. A FAILED status may be accompanied by an error code
             * (errCode), if available.
             *
             * PARTIAL: A PARTIAL state indicates that a part of a multi-track request has been
             * accomplished, but the full request is incomplete. A PARTIAL status should ultimately
             * be resolved to an end state.
             *
             * PROPOSED: Indicates that the request was received and alternate collect or contact
             * time(s) (altStartTime, altEndTime) have been proposed. If an alternate is accepted by
             * the requestor the current request should be cancelled and a new request created.
             *
             * REJECTED: The request has been received and rejected by the provider. A REJECTED
             * status may be accompanied by an explanation (notes) of the reason that the request
             * was rejected.
             *
             * SCHEDULED: The request was received and has been scheduled for execution.
             */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /**
             * Optional array of provider/source specific tags for this data, where each element is
             * no longer than 32 characters, used for implementing data owner conditional access
             * controls to restrict access to the data. Should be left null by data providers unless
             * conditional access controls are coordinated with the UDL team.
             */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /** Optional task ID associated with the request/response. */
            fun taskId(taskId: String) = taskId(JsonField.of(taskId))

            /**
             * Sets [Builder.taskId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taskId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taskId(taskId: JsonField<String>) = apply { this.taskId = taskId }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .idRequest()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("idRequest", idRequest),
                    checkRequired("source", source),
                    id,
                    actualEndTime,
                    actualStartTime,
                    altEndTime,
                    altStartTime,
                    createdAt,
                    createdBy,
                    errCode,
                    externalId,
                    idOnOrbit,
                    idPlan,
                    idSensor,
                    notes,
                    origin,
                    origNetwork,
                    origObjectId,
                    origSensorId,
                    satNo,
                    (srcIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (srcTyps ?: JsonMissing.of()).map { it.toImmutable() },
                    status,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    taskId,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            idRequest()
            source()
            id()
            actualEndTime()
            actualStartTime()
            altEndTime()
            altStartTime()
            createdAt()
            createdBy()
            errCode()
            externalId()
            idOnOrbit()
            idPlan()
            idSensor()
            notes()
            origin()
            origNetwork()
            origObjectId()
            origSensorId()
            satNo()
            srcIds()
            srcTyps()
            status()
            tags()
            taskId()
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
                (if (idRequest.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (actualEndTime.asKnown().isPresent) 1 else 0) +
                (if (actualStartTime.asKnown().isPresent) 1 else 0) +
                (if (altEndTime.asKnown().isPresent) 1 else 0) +
                (if (altStartTime.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (errCode.asKnown().isPresent) 1 else 0) +
                (if (externalId.asKnown().isPresent) 1 else 0) +
                (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
                (if (idPlan.asKnown().isPresent) 1 else 0) +
                (if (idSensor.asKnown().isPresent) 1 else 0) +
                (if (notes.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (origObjectId.asKnown().isPresent) 1 else 0) +
                (if (origSensorId.asKnown().isPresent) 1 else 0) +
                (if (satNo.asKnown().isPresent) 1 else 0) +
                (srcIds.asKnown().getOrNull()?.size ?: 0) +
                (srcTyps.asKnown().getOrNull()?.size ?: 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (taskId.asKnown().isPresent) 1 else 0)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                idRequest == other.idRequest &&
                source == other.source &&
                id == other.id &&
                actualEndTime == other.actualEndTime &&
                actualStartTime == other.actualStartTime &&
                altEndTime == other.altEndTime &&
                altStartTime == other.altStartTime &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                errCode == other.errCode &&
                externalId == other.externalId &&
                idOnOrbit == other.idOnOrbit &&
                idPlan == other.idPlan &&
                idSensor == other.idSensor &&
                notes == other.notes &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                origObjectId == other.origObjectId &&
                origSensorId == other.origSensorId &&
                satNo == other.satNo &&
                srcIds == other.srcIds &&
                srcTyps == other.srcTyps &&
                status == other.status &&
                tags == other.tags &&
                taskId == other.taskId
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                idRequest,
                source,
                id,
                actualEndTime,
                actualStartTime,
                altEndTime,
                altStartTime,
                createdAt,
                createdBy,
                errCode,
                externalId,
                idOnOrbit,
                idPlan,
                idSensor,
                notes,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                satNo,
                srcIds,
                srcTyps,
                status,
                tags,
                taskId,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, idRequest=$idRequest, source=$source, id=$id, actualEndTime=$actualEndTime, actualStartTime=$actualStartTime, altEndTime=$altEndTime, altStartTime=$altStartTime, createdAt=$createdAt, createdBy=$createdBy, errCode=$errCode, externalId=$externalId, idOnOrbit=$idOnOrbit, idPlan=$idPlan, idSensor=$idSensor, notes=$notes, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, satNo=$satNo, srcIds=$srcIds, srcTyps=$srcTyps, status=$status, tags=$tags, taskId=$taskId}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CollectResponseUnvalidatedPublishParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CollectResponseUnvalidatedPublishParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

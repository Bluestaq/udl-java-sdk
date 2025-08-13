// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorplan

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
 * A Plan is used to aggregate two or more of the same type of record to a parent entity, with the
 * planId (UUID) being included in all of the subordinate records, enabling resolution back to the
 * parent.
 */
class SensorPlanListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val recType: JsonField<String>,
    private val source: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val type: JsonField<String>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val customer: JsonField<String>,
    private val endTime: JsonField<OffsetDateTime>,
    private val idSensor: JsonField<String>,
    private val name: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val purpose: JsonField<String>,
    private val reqTotal: JsonField<Int>,
    private val senNetwork: JsonField<String>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("recType") @ExcludeMissing recType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer") @ExcludeMissing customer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endTime")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origSensorId")
        @ExcludeMissing
        origSensorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("purpose") @ExcludeMissing purpose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reqTotal") @ExcludeMissing reqTotal: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("senNetwork")
        @ExcludeMissing
        senNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        recType,
        source,
        startTime,
        type,
        id,
        createdAt,
        createdBy,
        customer,
        endTime,
        idSensor,
        name,
        origin,
        origNetwork,
        origSensorId,
        purpose,
        reqTotal,
        senNetwork,
        status,
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
     * The type of records that comprise this parent set (COLLECT, CONTACT).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recType(): String = recType.getRequired("recType")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The start time of the plan or schedule, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

    /**
     * The type of this sensor plan/schedule (PLAN, REQUEST, SCHEDULE).
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
     * The customer for this plan or schedule.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun customer(): Optional<String> = customer.getOptional("customer")

    /**
     * The end time of the plan or schedule, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("endTime")

    /**
     * Unique identifier of the requested/schedule/planned sensor associated with this request.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

    /**
     * Name associated with this plan or schedule.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

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
     * Optional identifier provided by the source to indicate the sensor identifier
     * requested/scheduled/planned for this request. This may be an internal identifier and not
     * necessarily a valid sensor ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

    /**
     * The purpose/description of this plan or schedule.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun purpose(): Optional<String> = purpose.getOptional("purpose")

    /**
     * The total number of requests contained in this plan or schedule. Value of this field must
     * match the size of collectRequest list if the list is provided and can be null or any value
     * otherwise.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reqTotal(): Optional<Int> = reqTotal.getOptional("reqTotal")

    /**
     * The sensor or ground network associated with this plan or schedule.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senNetwork(): Optional<String> = senNetwork.getOptional("senNetwork")

    /**
     * The status of this plan or schedule (ACCEPTED, APPROVED, COMPLETED, PROPOSED, REJECTED,
     * REQUESTED, SCHEDULED).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

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
     * Returns the raw JSON value of [recType].
     *
     * Unlike [recType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recType") @ExcludeMissing fun _recType(): JsonField<String> = recType

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startTime")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

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
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<String> = customer

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [idSensor].
     *
     * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [origSensorId].
     *
     * Unlike [origSensorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origSensorId")
    @ExcludeMissing
    fun _origSensorId(): JsonField<String> = origSensorId

    /**
     * Returns the raw JSON value of [purpose].
     *
     * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<String> = purpose

    /**
     * Returns the raw JSON value of [reqTotal].
     *
     * Unlike [reqTotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reqTotal") @ExcludeMissing fun _reqTotal(): JsonField<Int> = reqTotal

    /**
     * Returns the raw JSON value of [senNetwork].
     *
     * Unlike [senNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senNetwork") @ExcludeMissing fun _senNetwork(): JsonField<String> = senNetwork

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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
         * Returns a mutable builder for constructing an instance of [SensorPlanListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .recType()
         * .source()
         * .startTime()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SensorPlanListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var recType: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var type: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var customer: JsonField<String> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var purpose: JsonField<String> = JsonMissing.of()
        private var reqTotal: JsonField<Int> = JsonMissing.of()
        private var senNetwork: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sensorPlanListResponse: SensorPlanListResponse) = apply {
            classificationMarking = sensorPlanListResponse.classificationMarking
            dataMode = sensorPlanListResponse.dataMode
            recType = sensorPlanListResponse.recType
            source = sensorPlanListResponse.source
            startTime = sensorPlanListResponse.startTime
            type = sensorPlanListResponse.type
            id = sensorPlanListResponse.id
            createdAt = sensorPlanListResponse.createdAt
            createdBy = sensorPlanListResponse.createdBy
            customer = sensorPlanListResponse.customer
            endTime = sensorPlanListResponse.endTime
            idSensor = sensorPlanListResponse.idSensor
            name = sensorPlanListResponse.name
            origin = sensorPlanListResponse.origin
            origNetwork = sensorPlanListResponse.origNetwork
            origSensorId = sensorPlanListResponse.origSensorId
            purpose = sensorPlanListResponse.purpose
            reqTotal = sensorPlanListResponse.reqTotal
            senNetwork = sensorPlanListResponse.senNetwork
            status = sensorPlanListResponse.status
            additionalProperties = sensorPlanListResponse.additionalProperties.toMutableMap()
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

        /** The type of records that comprise this parent set (COLLECT, CONTACT). */
        fun recType(recType: String) = recType(JsonField.of(recType))

        /**
         * Sets [Builder.recType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun recType(recType: JsonField<String>) = apply { this.recType = recType }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** The start time of the plan or schedule, in ISO 8601 UTC format. */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        /** The type of this sensor plan/schedule (PLAN, REQUEST, SCHEDULE). */
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

        /** The customer for this plan or schedule. */
        fun customer(customer: String) = customer(JsonField.of(customer))

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun customer(customer: JsonField<String>) = apply { this.customer = customer }

        /** The end time of the plan or schedule, in ISO 8601 UTC format. */
        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        /**
         * Unique identifier of the requested/schedule/planned sensor associated with this request.
         */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

        /** Name associated with this plan or schedule. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        /**
         * Optional identifier provided by the source to indicate the sensor identifier
         * requested/scheduled/planned for this request. This may be an internal identifier and not
         * necessarily a valid sensor ID.
         */
        fun origSensorId(origSensorId: String) = origSensorId(JsonField.of(origSensorId))

        /**
         * Sets [Builder.origSensorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origSensorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origSensorId(origSensorId: JsonField<String>) = apply {
            this.origSensorId = origSensorId
        }

        /** The purpose/description of this plan or schedule. */
        fun purpose(purpose: String) = purpose(JsonField.of(purpose))

        /**
         * Sets [Builder.purpose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purpose] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun purpose(purpose: JsonField<String>) = apply { this.purpose = purpose }

        /**
         * The total number of requests contained in this plan or schedule. Value of this field must
         * match the size of collectRequest list if the list is provided and can be null or any
         * value otherwise.
         */
        fun reqTotal(reqTotal: Int) = reqTotal(JsonField.of(reqTotal))

        /**
         * Sets [Builder.reqTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reqTotal] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reqTotal(reqTotal: JsonField<Int>) = apply { this.reqTotal = reqTotal }

        /** The sensor or ground network associated with this plan or schedule. */
        fun senNetwork(senNetwork: String) = senNetwork(JsonField.of(senNetwork))

        /**
         * Sets [Builder.senNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senNetwork] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senNetwork(senNetwork: JsonField<String>) = apply { this.senNetwork = senNetwork }

        /**
         * The status of this plan or schedule (ACCEPTED, APPROVED, COMPLETED, PROPOSED, REJECTED,
         * REQUESTED, SCHEDULED).
         */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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
         * Returns an immutable instance of [SensorPlanListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .recType()
         * .source()
         * .startTime()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SensorPlanListResponse =
            SensorPlanListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("recType", recType),
                checkRequired("source", source),
                checkRequired("startTime", startTime),
                checkRequired("type", type),
                id,
                createdAt,
                createdBy,
                customer,
                endTime,
                idSensor,
                name,
                origin,
                origNetwork,
                origSensorId,
                purpose,
                reqTotal,
                senNetwork,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SensorPlanListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        recType()
        source()
        startTime()
        type()
        id()
        createdAt()
        createdBy()
        customer()
        endTime()
        idSensor()
        name()
        origin()
        origNetwork()
        origSensorId()
        purpose()
        reqTotal()
        senNetwork()
        status()
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
            (if (recType.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (customer.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (if (purpose.asKnown().isPresent) 1 else 0) +
            (if (reqTotal.asKnown().isPresent) 1 else 0) +
            (if (senNetwork.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0)

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

        return other is SensorPlanListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            recType == other.recType &&
            source == other.source &&
            startTime == other.startTime &&
            type == other.type &&
            id == other.id &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            customer == other.customer &&
            endTime == other.endTime &&
            idSensor == other.idSensor &&
            name == other.name &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origSensorId == other.origSensorId &&
            purpose == other.purpose &&
            reqTotal == other.reqTotal &&
            senNetwork == other.senNetwork &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            recType,
            source,
            startTime,
            type,
            id,
            createdAt,
            createdBy,
            customer,
            endTime,
            idSensor,
            name,
            origin,
            origNetwork,
            origSensorId,
            purpose,
            reqTotal,
            senNetwork,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SensorPlanListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, recType=$recType, source=$source, startTime=$startTime, type=$type, id=$id, createdAt=$createdAt, createdBy=$createdBy, customer=$customer, endTime=$endTime, idSensor=$idSensor, name=$name, origin=$origin, origNetwork=$origNetwork, origSensorId=$origSensorId, purpose=$purpose, reqTotal=$reqTotal, senNetwork=$senNetwork, status=$status, additionalProperties=$additionalProperties}"
}

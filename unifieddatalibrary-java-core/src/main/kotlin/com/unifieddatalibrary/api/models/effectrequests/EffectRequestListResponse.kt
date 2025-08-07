// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectrequests

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

/** A request for various effects on a target. */
class EffectRequestListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val effectList: JsonField<List<String>>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val context: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val deadlineType: JsonField<String>,
    private val endTime: JsonField<OffsetDateTime>,
    private val externalRequestId: JsonField<String>,
    private val metricTypes: JsonField<List<String>>,
    private val metricWeights: JsonField<List<Double>>,
    private val modelClass: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val priority: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val state: JsonField<String>,
    private val targetSrcId: JsonField<String>,
    private val targetSrcType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("effectList")
        @ExcludeMissing
        effectList: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("context") @ExcludeMissing context: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deadlineType")
        @ExcludeMissing
        deadlineType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endTime")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("externalRequestId")
        @ExcludeMissing
        externalRequestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metricTypes")
        @ExcludeMissing
        metricTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("metricWeights")
        @ExcludeMissing
        metricWeights: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("modelClass")
        @ExcludeMissing
        modelClass: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("targetSrcId")
        @ExcludeMissing
        targetSrcId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("targetSrcType")
        @ExcludeMissing
        targetSrcType: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        effectList,
        source,
        id,
        context,
        createdAt,
        createdBy,
        deadlineType,
        endTime,
        externalRequestId,
        metricTypes,
        metricWeights,
        modelClass,
        origin,
        origNetwork,
        priority,
        startTime,
        state,
        targetSrcId,
        targetSrcType,
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
     * List of effects to be achieved on the target (e.g. COVER, DECEIVE, DEGRADE, DENY, DESTROY,
     * DISRUPT, DIVERSION, DIVERT, FIX, INSPECT, INTERCEPT, ISOLATE, MANIPULATE, NEUTRALIZE, SHADOW,
     * SUPPRESS, etc.). The effects included in this list are connected by implied AND.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectList(): List<String> = effectList.getRequired("effectList")

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
     * Specific descriptive instantiation of the effect, e.g., playbook to be used.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun context(): Optional<String> = context.getOptional("context")

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
     * The indicator of deadline of the bid request (e.g. BETWEEN, IMMEDIATE, NOEARLIERTHAN,
     * NOLATERTHAN, etc.): BETWEEN:&nbsp;Produce effect any time between the given start and end
     * times, equal penalty for being early or late IMMEDIATE:&nbsp;Start as soon as possible,
     * earlier is always better NOEARLIERTHAN:&nbsp;Produce effect at this time or later. Large
     * penalty for being earlier, no reward for being later NOLATERTHAN:&nbsp;Produce effect no
     * later than the given startTime. Large penalty for being later, no reward for being even
     * earlier as long as the effect starts by the given time.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun deadlineType(): Optional<String> = deadlineType.getOptional("deadlineType")

    /**
     * The time the effect should end, in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("endTime")

    /**
     * The extenal system identifier of this request. A human readable unique id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun externalRequestId(): Optional<String> = externalRequestId.getOptional("externalRequestId")

    /**
     * Array of the the metric classes to be evaluated (e.g. Cost, GoalAchievement, OpportunityCost,
     * Risk, Timeliness, Unavailable, etc.). See the associated 'metricWeights' array for the
     * weighting values, positionally corresponding to these types. The 'metricTypes' and
     * 'metricWeights' arrays must match in size.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun metricTypes(): Optional<List<String>> = metricTypes.getOptional("metricTypes")

    /**
     * Array of the weights for the metric in the final evaluation score. Normalized (0 to 1). See
     * the associated 'metricTypes' array for the metric classes, positionally corresponding to
     * these values. The 'metricTypes' and 'metricWeights' arrays must match in size.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun metricWeights(): Optional<List<Double>> = metricWeights.getOptional("metricWeights")

    /**
     * The type or class of the preference model used to evaluate this offer.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun modelClass(): Optional<String> = modelClass.getOptional("modelClass")

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
     * The priority (LOW, MEDIUM, HIGH) of this request.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun priority(): Optional<String> = priority.getOptional("priority")

    /**
     * The time the effect should start, in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("startTime")

    /**
     * State of this effect request (e.g. CREATED, UPDATED, DELETED, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * The record ID, depending on the type identified in targetSrcType, of the requested target.
     * This identifier corresponds to either poi.poiid or track.trkId from their respective schemas.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun targetSrcId(): Optional<String> = targetSrcId.getOptional("targetSrcId")

    /**
     * The source type of the targetId identifier (POI, TRACK).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun targetSrcType(): Optional<String> = targetSrcType.getOptional("targetSrcType")

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
     * Returns the raw JSON value of [effectList].
     *
     * Unlike [effectList], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effectList")
    @ExcludeMissing
    fun _effectList(): JsonField<List<String>> = effectList

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
     * Returns the raw JSON value of [context].
     *
     * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<String> = context

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
     * Returns the raw JSON value of [deadlineType].
     *
     * Unlike [deadlineType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deadlineType")
    @ExcludeMissing
    fun _deadlineType(): JsonField<String> = deadlineType

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [externalRequestId].
     *
     * Unlike [externalRequestId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externalRequestId")
    @ExcludeMissing
    fun _externalRequestId(): JsonField<String> = externalRequestId

    /**
     * Returns the raw JSON value of [metricTypes].
     *
     * Unlike [metricTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metricTypes")
    @ExcludeMissing
    fun _metricTypes(): JsonField<List<String>> = metricTypes

    /**
     * Returns the raw JSON value of [metricWeights].
     *
     * Unlike [metricWeights], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metricWeights")
    @ExcludeMissing
    fun _metricWeights(): JsonField<List<Double>> = metricWeights

    /**
     * Returns the raw JSON value of [modelClass].
     *
     * Unlike [modelClass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modelClass") @ExcludeMissing fun _modelClass(): JsonField<String> = modelClass

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
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<String> = priority

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startTime")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /**
     * Returns the raw JSON value of [targetSrcId].
     *
     * Unlike [targetSrcId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetSrcId") @ExcludeMissing fun _targetSrcId(): JsonField<String> = targetSrcId

    /**
     * Returns the raw JSON value of [targetSrcType].
     *
     * Unlike [targetSrcType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetSrcType")
    @ExcludeMissing
    fun _targetSrcType(): JsonField<String> = targetSrcType

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
         * Returns a mutable builder for constructing an instance of [EffectRequestListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .effectList()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EffectRequestListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var effectList: JsonField<MutableList<String>>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var context: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var deadlineType: JsonField<String> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalRequestId: JsonField<String> = JsonMissing.of()
        private var metricTypes: JsonField<MutableList<String>>? = null
        private var metricWeights: JsonField<MutableList<Double>>? = null
        private var modelClass: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var priority: JsonField<String> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var targetSrcId: JsonField<String> = JsonMissing.of()
        private var targetSrcType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(effectRequestListResponse: EffectRequestListResponse) = apply {
            classificationMarking = effectRequestListResponse.classificationMarking
            dataMode = effectRequestListResponse.dataMode
            effectList = effectRequestListResponse.effectList.map { it.toMutableList() }
            source = effectRequestListResponse.source
            id = effectRequestListResponse.id
            context = effectRequestListResponse.context
            createdAt = effectRequestListResponse.createdAt
            createdBy = effectRequestListResponse.createdBy
            deadlineType = effectRequestListResponse.deadlineType
            endTime = effectRequestListResponse.endTime
            externalRequestId = effectRequestListResponse.externalRequestId
            metricTypes = effectRequestListResponse.metricTypes.map { it.toMutableList() }
            metricWeights = effectRequestListResponse.metricWeights.map { it.toMutableList() }
            modelClass = effectRequestListResponse.modelClass
            origin = effectRequestListResponse.origin
            origNetwork = effectRequestListResponse.origNetwork
            priority = effectRequestListResponse.priority
            startTime = effectRequestListResponse.startTime
            state = effectRequestListResponse.state
            targetSrcId = effectRequestListResponse.targetSrcId
            targetSrcType = effectRequestListResponse.targetSrcType
            additionalProperties = effectRequestListResponse.additionalProperties.toMutableMap()
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

        /**
         * List of effects to be achieved on the target (e.g. COVER, DECEIVE, DEGRADE, DENY,
         * DESTROY, DISRUPT, DIVERSION, DIVERT, FIX, INSPECT, INTERCEPT, ISOLATE, MANIPULATE,
         * NEUTRALIZE, SHADOW, SUPPRESS, etc.). The effects included in this list are connected by
         * implied AND.
         */
        fun effectList(effectList: List<String>) = effectList(JsonField.of(effectList))

        /**
         * Sets [Builder.effectList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectList] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectList(effectList: JsonField<List<String>>) = apply {
            this.effectList = effectList.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.effectList].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEffectList(effectList: String) = apply {
            this.effectList =
                (this.effectList ?: JsonField.of(mutableListOf())).also {
                    checkKnown("effectList", it).add(effectList)
                }
        }

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

        /** Specific descriptive instantiation of the effect, e.g., playbook to be used. */
        fun context(context: String) = context(JsonField.of(context))

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun context(context: JsonField<String>) = apply { this.context = context }

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
         * The indicator of deadline of the bid request (e.g. BETWEEN, IMMEDIATE, NOEARLIERTHAN,
         * NOLATERTHAN, etc.): BETWEEN:&nbsp;Produce effect any time between the given start and end
         * times, equal penalty for being early or late IMMEDIATE:&nbsp;Start as soon as possible,
         * earlier is always better NOEARLIERTHAN:&nbsp;Produce effect at this time or later. Large
         * penalty for being earlier, no reward for being later NOLATERTHAN:&nbsp;Produce effect no
         * later than the given startTime. Large penalty for being later, no reward for being even
         * earlier as long as the effect starts by the given time.
         */
        fun deadlineType(deadlineType: String) = deadlineType(JsonField.of(deadlineType))

        /**
         * Sets [Builder.deadlineType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deadlineType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deadlineType(deadlineType: JsonField<String>) = apply {
            this.deadlineType = deadlineType
        }

        /** The time the effect should end, in ISO8601 UTC format. */
        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        /** The extenal system identifier of this request. A human readable unique id. */
        fun externalRequestId(externalRequestId: String) =
            externalRequestId(JsonField.of(externalRequestId))

        /**
         * Sets [Builder.externalRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalRequestId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalRequestId(externalRequestId: JsonField<String>) = apply {
            this.externalRequestId = externalRequestId
        }

        /**
         * Array of the the metric classes to be evaluated (e.g. Cost, GoalAchievement,
         * OpportunityCost, Risk, Timeliness, Unavailable, etc.). See the associated 'metricWeights'
         * array for the weighting values, positionally corresponding to these types. The
         * 'metricTypes' and 'metricWeights' arrays must match in size.
         */
        fun metricTypes(metricTypes: List<String>) = metricTypes(JsonField.of(metricTypes))

        /**
         * Sets [Builder.metricTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metricTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metricTypes(metricTypes: JsonField<List<String>>) = apply {
            this.metricTypes = metricTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [metricTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMetricType(metricType: String) = apply {
            metricTypes =
                (metricTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("metricTypes", it).add(metricType)
                }
        }

        /**
         * Array of the weights for the metric in the final evaluation score. Normalized (0 to 1).
         * See the associated 'metricTypes' array for the metric classes, positionally corresponding
         * to these values. The 'metricTypes' and 'metricWeights' arrays must match in size.
         */
        fun metricWeights(metricWeights: List<Double>) = metricWeights(JsonField.of(metricWeights))

        /**
         * Sets [Builder.metricWeights] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metricWeights] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metricWeights(metricWeights: JsonField<List<Double>>) = apply {
            this.metricWeights = metricWeights.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [metricWeights].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMetricWeight(metricWeight: Double) = apply {
            metricWeights =
                (metricWeights ?: JsonField.of(mutableListOf())).also {
                    checkKnown("metricWeights", it).add(metricWeight)
                }
        }

        /** The type or class of the preference model used to evaluate this offer. */
        fun modelClass(modelClass: String) = modelClass(JsonField.of(modelClass))

        /**
         * Sets [Builder.modelClass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelClass] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelClass(modelClass: JsonField<String>) = apply { this.modelClass = modelClass }

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

        /** The priority (LOW, MEDIUM, HIGH) of this request. */
        fun priority(priority: String) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<String>) = apply { this.priority = priority }

        /** The time the effect should start, in ISO8601 UTC format. */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        /** State of this effect request (e.g. CREATED, UPDATED, DELETED, etc.). */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /**
         * The record ID, depending on the type identified in targetSrcType, of the requested
         * target. This identifier corresponds to either poi.poiid or track.trkId from their
         * respective schemas.
         */
        fun targetSrcId(targetSrcId: String) = targetSrcId(JsonField.of(targetSrcId))

        /**
         * Sets [Builder.targetSrcId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetSrcId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetSrcId(targetSrcId: JsonField<String>) = apply { this.targetSrcId = targetSrcId }

        /** The source type of the targetId identifier (POI, TRACK). */
        fun targetSrcType(targetSrcType: String) = targetSrcType(JsonField.of(targetSrcType))

        /**
         * Sets [Builder.targetSrcType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetSrcType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetSrcType(targetSrcType: JsonField<String>) = apply {
            this.targetSrcType = targetSrcType
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
         * Returns an immutable instance of [EffectRequestListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .effectList()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EffectRequestListResponse =
            EffectRequestListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("effectList", effectList).map { it.toImmutable() },
                checkRequired("source", source),
                id,
                context,
                createdAt,
                createdBy,
                deadlineType,
                endTime,
                externalRequestId,
                (metricTypes ?: JsonMissing.of()).map { it.toImmutable() },
                (metricWeights ?: JsonMissing.of()).map { it.toImmutable() },
                modelClass,
                origin,
                origNetwork,
                priority,
                startTime,
                state,
                targetSrcId,
                targetSrcType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EffectRequestListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        effectList()
        source()
        id()
        context()
        createdAt()
        createdBy()
        deadlineType()
        endTime()
        externalRequestId()
        metricTypes()
        metricWeights()
        modelClass()
        origin()
        origNetwork()
        priority()
        startTime()
        state()
        targetSrcId()
        targetSrcType()
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
            (effectList.asKnown().getOrNull()?.size ?: 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (context.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (deadlineType.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (externalRequestId.asKnown().isPresent) 1 else 0) +
            (metricTypes.asKnown().getOrNull()?.size ?: 0) +
            (metricWeights.asKnown().getOrNull()?.size ?: 0) +
            (if (modelClass.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (if (targetSrcId.asKnown().isPresent) 1 else 0) +
            (if (targetSrcType.asKnown().isPresent) 1 else 0)

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

        return /* spotless:off */ other is EffectRequestListResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && effectList == other.effectList && source == other.source && id == other.id && context == other.context && createdAt == other.createdAt && createdBy == other.createdBy && deadlineType == other.deadlineType && endTime == other.endTime && externalRequestId == other.externalRequestId && metricTypes == other.metricTypes && metricWeights == other.metricWeights && modelClass == other.modelClass && origin == other.origin && origNetwork == other.origNetwork && priority == other.priority && startTime == other.startTime && state == other.state && targetSrcId == other.targetSrcId && targetSrcType == other.targetSrcType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, effectList, source, id, context, createdAt, createdBy, deadlineType, endTime, externalRequestId, metricTypes, metricWeights, modelClass, origin, origNetwork, priority, startTime, state, targetSrcId, targetSrcType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EffectRequestListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, effectList=$effectList, source=$source, id=$id, context=$context, createdAt=$createdAt, createdBy=$createdBy, deadlineType=$deadlineType, endTime=$endTime, externalRequestId=$externalRequestId, metricTypes=$metricTypes, metricWeights=$metricWeights, modelClass=$modelClass, origin=$origin, origNetwork=$origNetwork, priority=$priority, startTime=$startTime, state=$state, targetSrcId=$targetSrcId, targetSrcType=$targetSrcType, additionalProperties=$additionalProperties}"
}

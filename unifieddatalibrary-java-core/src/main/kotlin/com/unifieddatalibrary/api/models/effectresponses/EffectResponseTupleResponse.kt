// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectresponses

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

/** A response for various effects on a target. */
class EffectResponseTupleResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val type: JsonField<String>,
    private val id: JsonField<String>,
    private val actionsList: JsonField<List<EffectResponseActionsListFull>>,
    private val actorSrcId: JsonField<String>,
    private val actorSrcType: JsonField<String>,
    private val coaMetrics: JsonField<List<EffectResponseMetricsFull>>,
    private val collateralDamageEst: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val decisionDeadline: JsonField<OffsetDateTime>,
    private val externalActions: JsonField<List<String>>,
    private val externalRequestId: JsonField<String>,
    private val idEffectRequest: JsonField<String>,
    private val munitionId: JsonField<String>,
    private val munitionType: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val probabilityOfKill: JsonField<Double>,
    private val redTargetSrcId: JsonField<String>,
    private val redTargetSrcType: JsonField<String>,
    private val redTimeToOverhead: JsonField<OffsetDateTime>,
    private val shotsRequired: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actionsList")
        @ExcludeMissing
        actionsList: JsonField<List<EffectResponseActionsListFull>> = JsonMissing.of(),
        @JsonProperty("actorSrcId")
        @ExcludeMissing
        actorSrcId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actorSrcType")
        @ExcludeMissing
        actorSrcType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("coaMetrics")
        @ExcludeMissing
        coaMetrics: JsonField<List<EffectResponseMetricsFull>> = JsonMissing.of(),
        @JsonProperty("collateralDamageEst")
        @ExcludeMissing
        collateralDamageEst: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("decisionDeadline")
        @ExcludeMissing
        decisionDeadline: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("externalActions")
        @ExcludeMissing
        externalActions: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("externalRequestId")
        @ExcludeMissing
        externalRequestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idEffectRequest")
        @ExcludeMissing
        idEffectRequest: JsonField<String> = JsonMissing.of(),
        @JsonProperty("munitionId")
        @ExcludeMissing
        munitionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("munitionType")
        @ExcludeMissing
        munitionType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("probabilityOfKill")
        @ExcludeMissing
        probabilityOfKill: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("redTargetSrcId")
        @ExcludeMissing
        redTargetSrcId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("redTargetSrcType")
        @ExcludeMissing
        redTargetSrcType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("redTimeToOverhead")
        @ExcludeMissing
        redTimeToOverhead: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("shotsRequired")
        @ExcludeMissing
        shotsRequired: JsonField<Int> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        type,
        id,
        actionsList,
        actorSrcId,
        actorSrcType,
        coaMetrics,
        collateralDamageEst,
        createdAt,
        createdBy,
        decisionDeadline,
        externalActions,
        externalRequestId,
        idEffectRequest,
        munitionId,
        munitionType,
        origin,
        origNetwork,
        probabilityOfKill,
        redTargetSrcId,
        redTargetSrcType,
        redTimeToOverhead,
        shotsRequired,
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
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The type of response in this record (e.g. COA, SCORECARD, etc.).
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
     * List of actions associated with this effect response.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actionsList(): Optional<List<EffectResponseActionsListFull>> =
        actionsList.getOptional("actionsList")

    /**
     * The record ID, depending on the type identified in actorSrcType, of the requested asset.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actorSrcId(): Optional<String> = actorSrcId.getOptional("actorSrcId")

    /**
     * The source type of the asset/actor identifier (AIRCRAFT, LANDCRAFT, SEACRAFT, TRACK).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actorSrcType(): Optional<String> = actorSrcType.getOptional("actorSrcType")

    /**
     * List of COA metrics associated with this effect response.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coaMetrics(): Optional<List<EffectResponseMetricsFull>> =
        coaMetrics.getOptional("coaMetrics")

    /**
     * The collateral damage estimate (CDE) of the munition being fired.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun collateralDamageEst(): Optional<Double> =
        collateralDamageEst.getOptional("collateralDamageEst")

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
     * The deadline time to accept this COA before it's no longer valid, in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun decisionDeadline(): Optional<OffsetDateTime> =
        decisionDeadline.getOptional("decisionDeadline")

    /**
     * List of external actions to be executed as part of this task.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun externalActions(): Optional<List<String>> = externalActions.getOptional("externalActions")

    /**
     * The external system identifier of the associated effect request. A human readable unique id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun externalRequestId(): Optional<String> = externalRequestId.getOptional("externalRequestId")

    /**
     * Unique identifier of the EffectRequest associated with this response.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idEffectRequest(): Optional<String> = idEffectRequest.getOptional("idEffectRequest")

    /**
     * Unique identifier of the munition.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun munitionId(): Optional<String> = munitionId.getOptional("munitionId")

    /**
     * The type of munition being fired.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun munitionType(): Optional<String> = munitionType.getOptional("munitionType")

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
     * The probability of kill (0-1) of the target being destroyed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun probabilityOfKill(): Optional<Double> = probabilityOfKill.getOptional("probabilityOfKill")

    /**
     * The record ID, depending on the type identified in redTargetSrcType, of the red force target.
     * If the redTargetSrcType is POI or TRACK, then this identifier corresponds to either poi.poiid
     * or track.trkId from their respective schemas.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun redTargetSrcId(): Optional<String> = redTargetSrcId.getOptional("redTargetSrcId")

    /**
     * The source type of the targetId identifier (POI, SITE, TRACK).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun redTargetSrcType(): Optional<String> = redTargetSrcType.getOptional("redTargetSrcType")

    /**
     * The time to overhead for the red force to be over their target, in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun redTimeToOverhead(): Optional<OffsetDateTime> =
        redTimeToOverhead.getOptional("redTimeToOverhead")

    /**
     * The number of shots required to destroy target.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shotsRequired(): Optional<Int> = shotsRequired.getOptional("shotsRequired")

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
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

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
     * Returns the raw JSON value of [actionsList].
     *
     * Unlike [actionsList], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionsList")
    @ExcludeMissing
    fun _actionsList(): JsonField<List<EffectResponseActionsListFull>> = actionsList

    /**
     * Returns the raw JSON value of [actorSrcId].
     *
     * Unlike [actorSrcId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actorSrcId") @ExcludeMissing fun _actorSrcId(): JsonField<String> = actorSrcId

    /**
     * Returns the raw JSON value of [actorSrcType].
     *
     * Unlike [actorSrcType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actorSrcType")
    @ExcludeMissing
    fun _actorSrcType(): JsonField<String> = actorSrcType

    /**
     * Returns the raw JSON value of [coaMetrics].
     *
     * Unlike [coaMetrics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coaMetrics")
    @ExcludeMissing
    fun _coaMetrics(): JsonField<List<EffectResponseMetricsFull>> = coaMetrics

    /**
     * Returns the raw JSON value of [collateralDamageEst].
     *
     * Unlike [collateralDamageEst], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("collateralDamageEst")
    @ExcludeMissing
    fun _collateralDamageEst(): JsonField<Double> = collateralDamageEst

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
     * Returns the raw JSON value of [decisionDeadline].
     *
     * Unlike [decisionDeadline], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("decisionDeadline")
    @ExcludeMissing
    fun _decisionDeadline(): JsonField<OffsetDateTime> = decisionDeadline

    /**
     * Returns the raw JSON value of [externalActions].
     *
     * Unlike [externalActions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalActions")
    @ExcludeMissing
    fun _externalActions(): JsonField<List<String>> = externalActions

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
     * Returns the raw JSON value of [idEffectRequest].
     *
     * Unlike [idEffectRequest], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idEffectRequest")
    @ExcludeMissing
    fun _idEffectRequest(): JsonField<String> = idEffectRequest

    /**
     * Returns the raw JSON value of [munitionId].
     *
     * Unlike [munitionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("munitionId") @ExcludeMissing fun _munitionId(): JsonField<String> = munitionId

    /**
     * Returns the raw JSON value of [munitionType].
     *
     * Unlike [munitionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("munitionType")
    @ExcludeMissing
    fun _munitionType(): JsonField<String> = munitionType

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
     * Returns the raw JSON value of [probabilityOfKill].
     *
     * Unlike [probabilityOfKill], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("probabilityOfKill")
    @ExcludeMissing
    fun _probabilityOfKill(): JsonField<Double> = probabilityOfKill

    /**
     * Returns the raw JSON value of [redTargetSrcId].
     *
     * Unlike [redTargetSrcId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redTargetSrcId")
    @ExcludeMissing
    fun _redTargetSrcId(): JsonField<String> = redTargetSrcId

    /**
     * Returns the raw JSON value of [redTargetSrcType].
     *
     * Unlike [redTargetSrcType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("redTargetSrcType")
    @ExcludeMissing
    fun _redTargetSrcType(): JsonField<String> = redTargetSrcType

    /**
     * Returns the raw JSON value of [redTimeToOverhead].
     *
     * Unlike [redTimeToOverhead], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("redTimeToOverhead")
    @ExcludeMissing
    fun _redTimeToOverhead(): JsonField<OffsetDateTime> = redTimeToOverhead

    /**
     * Returns the raw JSON value of [shotsRequired].
     *
     * Unlike [shotsRequired], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shotsRequired")
    @ExcludeMissing
    fun _shotsRequired(): JsonField<Int> = shotsRequired

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
         * Returns a mutable builder for constructing an instance of [EffectResponseTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EffectResponseTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var actionsList: JsonField<MutableList<EffectResponseActionsListFull>>? = null
        private var actorSrcId: JsonField<String> = JsonMissing.of()
        private var actorSrcType: JsonField<String> = JsonMissing.of()
        private var coaMetrics: JsonField<MutableList<EffectResponseMetricsFull>>? = null
        private var collateralDamageEst: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var decisionDeadline: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalActions: JsonField<MutableList<String>>? = null
        private var externalRequestId: JsonField<String> = JsonMissing.of()
        private var idEffectRequest: JsonField<String> = JsonMissing.of()
        private var munitionId: JsonField<String> = JsonMissing.of()
        private var munitionType: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var probabilityOfKill: JsonField<Double> = JsonMissing.of()
        private var redTargetSrcId: JsonField<String> = JsonMissing.of()
        private var redTargetSrcType: JsonField<String> = JsonMissing.of()
        private var redTimeToOverhead: JsonField<OffsetDateTime> = JsonMissing.of()
        private var shotsRequired: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(effectResponseTupleResponse: EffectResponseTupleResponse) = apply {
            classificationMarking = effectResponseTupleResponse.classificationMarking
            dataMode = effectResponseTupleResponse.dataMode
            source = effectResponseTupleResponse.source
            type = effectResponseTupleResponse.type
            id = effectResponseTupleResponse.id
            actionsList = effectResponseTupleResponse.actionsList.map { it.toMutableList() }
            actorSrcId = effectResponseTupleResponse.actorSrcId
            actorSrcType = effectResponseTupleResponse.actorSrcType
            coaMetrics = effectResponseTupleResponse.coaMetrics.map { it.toMutableList() }
            collateralDamageEst = effectResponseTupleResponse.collateralDamageEst
            createdAt = effectResponseTupleResponse.createdAt
            createdBy = effectResponseTupleResponse.createdBy
            decisionDeadline = effectResponseTupleResponse.decisionDeadline
            externalActions = effectResponseTupleResponse.externalActions.map { it.toMutableList() }
            externalRequestId = effectResponseTupleResponse.externalRequestId
            idEffectRequest = effectResponseTupleResponse.idEffectRequest
            munitionId = effectResponseTupleResponse.munitionId
            munitionType = effectResponseTupleResponse.munitionType
            origin = effectResponseTupleResponse.origin
            origNetwork = effectResponseTupleResponse.origNetwork
            probabilityOfKill = effectResponseTupleResponse.probabilityOfKill
            redTargetSrcId = effectResponseTupleResponse.redTargetSrcId
            redTargetSrcType = effectResponseTupleResponse.redTargetSrcType
            redTimeToOverhead = effectResponseTupleResponse.redTimeToOverhead
            shotsRequired = effectResponseTupleResponse.shotsRequired
            additionalProperties = effectResponseTupleResponse.additionalProperties.toMutableMap()
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

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** The type of response in this record (e.g. COA, SCORECARD, etc.). */
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

        /** List of actions associated with this effect response. */
        fun actionsList(actionsList: List<EffectResponseActionsListFull>) =
            actionsList(JsonField.of(actionsList))

        /**
         * Sets [Builder.actionsList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionsList] with a well-typed
         * `List<EffectResponseActionsListFull>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun actionsList(actionsList: JsonField<List<EffectResponseActionsListFull>>) = apply {
            this.actionsList = actionsList.map { it.toMutableList() }
        }

        /**
         * Adds a single [EffectResponseActionsListFull] to [Builder.actionsList].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addActionsList(actionsList: EffectResponseActionsListFull) = apply {
            this.actionsList =
                (this.actionsList ?: JsonField.of(mutableListOf())).also {
                    checkKnown("actionsList", it).add(actionsList)
                }
        }

        /**
         * The record ID, depending on the type identified in actorSrcType, of the requested asset.
         */
        fun actorSrcId(actorSrcId: String) = actorSrcId(JsonField.of(actorSrcId))

        /**
         * Sets [Builder.actorSrcId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorSrcId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actorSrcId(actorSrcId: JsonField<String>) = apply { this.actorSrcId = actorSrcId }

        /** The source type of the asset/actor identifier (AIRCRAFT, LANDCRAFT, SEACRAFT, TRACK). */
        fun actorSrcType(actorSrcType: String) = actorSrcType(JsonField.of(actorSrcType))

        /**
         * Sets [Builder.actorSrcType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorSrcType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actorSrcType(actorSrcType: JsonField<String>) = apply {
            this.actorSrcType = actorSrcType
        }

        /** List of COA metrics associated with this effect response. */
        fun coaMetrics(coaMetrics: List<EffectResponseMetricsFull>) =
            coaMetrics(JsonField.of(coaMetrics))

        /**
         * Sets [Builder.coaMetrics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coaMetrics] with a well-typed
         * `List<EffectResponseMetricsFull>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun coaMetrics(coaMetrics: JsonField<List<EffectResponseMetricsFull>>) = apply {
            this.coaMetrics = coaMetrics.map { it.toMutableList() }
        }

        /**
         * Adds a single [EffectResponseMetricsFull] to [coaMetrics].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCoaMetric(coaMetric: EffectResponseMetricsFull) = apply {
            coaMetrics =
                (coaMetrics ?: JsonField.of(mutableListOf())).also {
                    checkKnown("coaMetrics", it).add(coaMetric)
                }
        }

        /** The collateral damage estimate (CDE) of the munition being fired. */
        fun collateralDamageEst(collateralDamageEst: Double) =
            collateralDamageEst(JsonField.of(collateralDamageEst))

        /**
         * Sets [Builder.collateralDamageEst] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collateralDamageEst] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collateralDamageEst(collateralDamageEst: JsonField<Double>) = apply {
            this.collateralDamageEst = collateralDamageEst
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
         * The deadline time to accept this COA before it's no longer valid, in ISO8601 UTC format.
         */
        fun decisionDeadline(decisionDeadline: OffsetDateTime) =
            decisionDeadline(JsonField.of(decisionDeadline))

        /**
         * Sets [Builder.decisionDeadline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decisionDeadline] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun decisionDeadline(decisionDeadline: JsonField<OffsetDateTime>) = apply {
            this.decisionDeadline = decisionDeadline
        }

        /** List of external actions to be executed as part of this task. */
        fun externalActions(externalActions: List<String>) =
            externalActions(JsonField.of(externalActions))

        /**
         * Sets [Builder.externalActions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalActions] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalActions(externalActions: JsonField<List<String>>) = apply {
            this.externalActions = externalActions.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [externalActions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExternalAction(externalAction: String) = apply {
            externalActions =
                (externalActions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("externalActions", it).add(externalAction)
                }
        }

        /**
         * The external system identifier of the associated effect request. A human readable unique
         * id.
         */
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

        /** Unique identifier of the EffectRequest associated with this response. */
        fun idEffectRequest(idEffectRequest: String) =
            idEffectRequest(JsonField.of(idEffectRequest))

        /**
         * Sets [Builder.idEffectRequest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idEffectRequest] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idEffectRequest(idEffectRequest: JsonField<String>) = apply {
            this.idEffectRequest = idEffectRequest
        }

        /** Unique identifier of the munition. */
        fun munitionId(munitionId: String) = munitionId(JsonField.of(munitionId))

        /**
         * Sets [Builder.munitionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.munitionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun munitionId(munitionId: JsonField<String>) = apply { this.munitionId = munitionId }

        /** The type of munition being fired. */
        fun munitionType(munitionType: String) = munitionType(JsonField.of(munitionType))

        /**
         * Sets [Builder.munitionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.munitionType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun munitionType(munitionType: JsonField<String>) = apply {
            this.munitionType = munitionType
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

        /** The probability of kill (0-1) of the target being destroyed. */
        fun probabilityOfKill(probabilityOfKill: Double) =
            probabilityOfKill(JsonField.of(probabilityOfKill))

        /**
         * Sets [Builder.probabilityOfKill] to an arbitrary JSON value.
         *
         * You should usually call [Builder.probabilityOfKill] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun probabilityOfKill(probabilityOfKill: JsonField<Double>) = apply {
            this.probabilityOfKill = probabilityOfKill
        }

        /**
         * The record ID, depending on the type identified in redTargetSrcType, of the red force
         * target. If the redTargetSrcType is POI or TRACK, then this identifier corresponds to
         * either poi.poiid or track.trkId from their respective schemas.
         */
        fun redTargetSrcId(redTargetSrcId: String) = redTargetSrcId(JsonField.of(redTargetSrcId))

        /**
         * Sets [Builder.redTargetSrcId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redTargetSrcId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun redTargetSrcId(redTargetSrcId: JsonField<String>) = apply {
            this.redTargetSrcId = redTargetSrcId
        }

        /** The source type of the targetId identifier (POI, SITE, TRACK). */
        fun redTargetSrcType(redTargetSrcType: String) =
            redTargetSrcType(JsonField.of(redTargetSrcType))

        /**
         * Sets [Builder.redTargetSrcType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redTargetSrcType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun redTargetSrcType(redTargetSrcType: JsonField<String>) = apply {
            this.redTargetSrcType = redTargetSrcType
        }

        /**
         * The time to overhead for the red force to be over their target, in ISO8601 UTC format.
         */
        fun redTimeToOverhead(redTimeToOverhead: OffsetDateTime) =
            redTimeToOverhead(JsonField.of(redTimeToOverhead))

        /**
         * Sets [Builder.redTimeToOverhead] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redTimeToOverhead] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun redTimeToOverhead(redTimeToOverhead: JsonField<OffsetDateTime>) = apply {
            this.redTimeToOverhead = redTimeToOverhead
        }

        /** The number of shots required to destroy target. */
        fun shotsRequired(shotsRequired: Int) = shotsRequired(JsonField.of(shotsRequired))

        /**
         * Sets [Builder.shotsRequired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shotsRequired] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shotsRequired(shotsRequired: JsonField<Int>) = apply {
            this.shotsRequired = shotsRequired
        }

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
         * Returns an immutable instance of [EffectResponseTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EffectResponseTupleResponse =
            EffectResponseTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                checkRequired("type", type),
                id,
                (actionsList ?: JsonMissing.of()).map { it.toImmutable() },
                actorSrcId,
                actorSrcType,
                (coaMetrics ?: JsonMissing.of()).map { it.toImmutable() },
                collateralDamageEst,
                createdAt,
                createdBy,
                decisionDeadline,
                (externalActions ?: JsonMissing.of()).map { it.toImmutable() },
                externalRequestId,
                idEffectRequest,
                munitionId,
                munitionType,
                origin,
                origNetwork,
                probabilityOfKill,
                redTargetSrcId,
                redTargetSrcType,
                redTimeToOverhead,
                shotsRequired,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EffectResponseTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        type()
        id()
        actionsList().ifPresent { it.forEach { it.validate() } }
        actorSrcId()
        actorSrcType()
        coaMetrics().ifPresent { it.forEach { it.validate() } }
        collateralDamageEst()
        createdAt()
        createdBy()
        decisionDeadline()
        externalActions()
        externalRequestId()
        idEffectRequest()
        munitionId()
        munitionType()
        origin()
        origNetwork()
        probabilityOfKill()
        redTargetSrcId()
        redTargetSrcType()
        redTimeToOverhead()
        shotsRequired()
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
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (actionsList.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (actorSrcId.asKnown().isPresent) 1 else 0) +
            (if (actorSrcType.asKnown().isPresent) 1 else 0) +
            (coaMetrics.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (collateralDamageEst.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (decisionDeadline.asKnown().isPresent) 1 else 0) +
            (externalActions.asKnown().getOrNull()?.size ?: 0) +
            (if (externalRequestId.asKnown().isPresent) 1 else 0) +
            (if (idEffectRequest.asKnown().isPresent) 1 else 0) +
            (if (munitionId.asKnown().isPresent) 1 else 0) +
            (if (munitionType.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (probabilityOfKill.asKnown().isPresent) 1 else 0) +
            (if (redTargetSrcId.asKnown().isPresent) 1 else 0) +
            (if (redTargetSrcType.asKnown().isPresent) 1 else 0) +
            (if (redTimeToOverhead.asKnown().isPresent) 1 else 0) +
            (if (shotsRequired.asKnown().isPresent) 1 else 0)

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

        return other is EffectResponseTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            type == other.type &&
            id == other.id &&
            actionsList == other.actionsList &&
            actorSrcId == other.actorSrcId &&
            actorSrcType == other.actorSrcType &&
            coaMetrics == other.coaMetrics &&
            collateralDamageEst == other.collateralDamageEst &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            decisionDeadline == other.decisionDeadline &&
            externalActions == other.externalActions &&
            externalRequestId == other.externalRequestId &&
            idEffectRequest == other.idEffectRequest &&
            munitionId == other.munitionId &&
            munitionType == other.munitionType &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            probabilityOfKill == other.probabilityOfKill &&
            redTargetSrcId == other.redTargetSrcId &&
            redTargetSrcType == other.redTargetSrcType &&
            redTimeToOverhead == other.redTimeToOverhead &&
            shotsRequired == other.shotsRequired &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            source,
            type,
            id,
            actionsList,
            actorSrcId,
            actorSrcType,
            coaMetrics,
            collateralDamageEst,
            createdAt,
            createdBy,
            decisionDeadline,
            externalActions,
            externalRequestId,
            idEffectRequest,
            munitionId,
            munitionType,
            origin,
            origNetwork,
            probabilityOfKill,
            redTargetSrcId,
            redTargetSrcType,
            redTimeToOverhead,
            shotsRequired,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EffectResponseTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, type=$type, id=$id, actionsList=$actionsList, actorSrcId=$actorSrcId, actorSrcType=$actorSrcType, coaMetrics=$coaMetrics, collateralDamageEst=$collateralDamageEst, createdAt=$createdAt, createdBy=$createdBy, decisionDeadline=$decisionDeadline, externalActions=$externalActions, externalRequestId=$externalRequestId, idEffectRequest=$idEffectRequest, munitionId=$munitionId, munitionType=$munitionType, origin=$origin, origNetwork=$origNetwork, probabilityOfKill=$probabilityOfKill, redTargetSrcId=$redTargetSrcId, redTargetSrcType=$redTargetSrcType, redTimeToOverhead=$redTimeToOverhead, shotsRequired=$shotsRequired, additionalProperties=$additionalProperties}"
}

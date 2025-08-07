// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectresponses

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EffectResponseActionsListFull
private constructor(
    private val actionActorSrcId: JsonField<String>,
    private val actionActorSrcType: JsonField<String>,
    private val actionEndTime: JsonField<OffsetDateTime>,
    private val actionId: JsonField<String>,
    private val actionMetrics: JsonField<List<EffectResponseMetricsFull>>,
    private val actionStartTime: JsonField<OffsetDateTime>,
    private val actorInterceptAlt: JsonField<Double>,
    private val actorInterceptLat: JsonField<Double>,
    private val actorInterceptLon: JsonField<Double>,
    private val effector: JsonField<String>,
    private val summary: JsonField<String>,
    private val targetSrcId: JsonField<String>,
    private val targetSrcType: JsonField<String>,
    private val totEndTime: JsonField<OffsetDateTime>,
    private val totStartTime: JsonField<OffsetDateTime>,
    private val weaponInterceptAlt: JsonField<Double>,
    private val weaponInterceptLat: JsonField<Double>,
    private val weaponInterceptLon: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actionActorSrcId")
        @ExcludeMissing
        actionActorSrcId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actionActorSrcType")
        @ExcludeMissing
        actionActorSrcType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actionEndTime")
        @ExcludeMissing
        actionEndTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("actionId") @ExcludeMissing actionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actionMetrics")
        @ExcludeMissing
        actionMetrics: JsonField<List<EffectResponseMetricsFull>> = JsonMissing.of(),
        @JsonProperty("actionStartTime")
        @ExcludeMissing
        actionStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("actorInterceptAlt")
        @ExcludeMissing
        actorInterceptAlt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("actorInterceptLat")
        @ExcludeMissing
        actorInterceptLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("actorInterceptLon")
        @ExcludeMissing
        actorInterceptLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("effector") @ExcludeMissing effector: JsonField<String> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("targetSrcId")
        @ExcludeMissing
        targetSrcId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("targetSrcType")
        @ExcludeMissing
        targetSrcType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("totEndTime")
        @ExcludeMissing
        totEndTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("totStartTime")
        @ExcludeMissing
        totStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("weaponInterceptAlt")
        @ExcludeMissing
        weaponInterceptAlt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("weaponInterceptLat")
        @ExcludeMissing
        weaponInterceptLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("weaponInterceptLon")
        @ExcludeMissing
        weaponInterceptLon: JsonField<Double> = JsonMissing.of(),
    ) : this(
        actionActorSrcId,
        actionActorSrcType,
        actionEndTime,
        actionId,
        actionMetrics,
        actionStartTime,
        actorInterceptAlt,
        actorInterceptLat,
        actorInterceptLon,
        effector,
        summary,
        targetSrcId,
        targetSrcType,
        totEndTime,
        totStartTime,
        weaponInterceptAlt,
        weaponInterceptLat,
        weaponInterceptLon,
        mutableMapOf(),
    )

    /**
     * The record ID, depending on the type identified in actorSrcType, of the requested
     * asset/actor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actionActorSrcId(): Optional<String> = actionActorSrcId.getOptional("actionActorSrcId")

    /**
     * The source type of the asset/actor identifier (AIRCRAFT, LANDCRAFT, SEACRAFT, TRACK).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actionActorSrcType(): Optional<String> =
        actionActorSrcType.getOptional("actionActorSrcType")

    /**
     * The desired end time of this task, in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actionEndTime(): Optional<OffsetDateTime> = actionEndTime.getOptional("actionEndTime")

    /**
     * Identifier of this action.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actionId(): Optional<String> = actionId.getOptional("actionId")

    /**
     * List of metrics associated with this action.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actionMetrics(): Optional<List<EffectResponseMetricsFull>> =
        actionMetrics.getOptional("actionMetrics")

    /**
     * The desired start time of this task, in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actionStartTime(): Optional<OffsetDateTime> = actionStartTime.getOptional("actionStartTime")

    /**
     * The WGS-84 altitude of the asset/actor location at weapon launch, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actorInterceptAlt(): Optional<Double> = actorInterceptAlt.getOptional("actorInterceptAlt")

    /**
     * The WGS-84 latitude of the asset/actor location at weapon launch, in degrees. -90 to 90
     * degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actorInterceptLat(): Optional<Double> = actorInterceptLat.getOptional("actorInterceptLat")

    /**
     * The WGS-84 longitude of the asset/actor location at weapon launch, in degrees. -180 to 180
     * degrees (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actorInterceptLon(): Optional<Double> = actorInterceptLon.getOptional("actorInterceptLon")

    /**
     * The type of munition or sensor used by this asset/actor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun effector(): Optional<String> = effector.getOptional("effector")

    /**
     * A summary string describing different aspects of the action.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun summary(): Optional<String> = summary.getOptional("summary")

    /**
     * The POI or TRACK ID, depending on the type identified in targetSrcType, of the requested
     * target. This identifier corresponds to either poi.poiid or track.trkId from their respective
     * schemas.
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
     * The end time of the asset TOT (time over target), in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun totEndTime(): Optional<OffsetDateTime> = totEndTime.getOptional("totEndTime")

    /**
     * The start time of the asset TOT (time over target), in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun totStartTime(): Optional<OffsetDateTime> = totStartTime.getOptional("totStartTime")

    /**
     * The WGS-84 altitude of the weapon destination location, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun weaponInterceptAlt(): Optional<Double> =
        weaponInterceptAlt.getOptional("weaponInterceptAlt")

    /**
     * The WGS-84 latitude of the weapon destination location, in degrees. -90 to 90 degrees
     * (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun weaponInterceptLat(): Optional<Double> =
        weaponInterceptLat.getOptional("weaponInterceptLat")

    /**
     * The WGS-84 longitude of the weapon destination location, in degrees. -180 to 180 degrees
     * (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun weaponInterceptLon(): Optional<Double> =
        weaponInterceptLon.getOptional("weaponInterceptLon")

    /**
     * Returns the raw JSON value of [actionActorSrcId].
     *
     * Unlike [actionActorSrcId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("actionActorSrcId")
    @ExcludeMissing
    fun _actionActorSrcId(): JsonField<String> = actionActorSrcId

    /**
     * Returns the raw JSON value of [actionActorSrcType].
     *
     * Unlike [actionActorSrcType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("actionActorSrcType")
    @ExcludeMissing
    fun _actionActorSrcType(): JsonField<String> = actionActorSrcType

    /**
     * Returns the raw JSON value of [actionEndTime].
     *
     * Unlike [actionEndTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionEndTime")
    @ExcludeMissing
    fun _actionEndTime(): JsonField<OffsetDateTime> = actionEndTime

    /**
     * Returns the raw JSON value of [actionId].
     *
     * Unlike [actionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionId") @ExcludeMissing fun _actionId(): JsonField<String> = actionId

    /**
     * Returns the raw JSON value of [actionMetrics].
     *
     * Unlike [actionMetrics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionMetrics")
    @ExcludeMissing
    fun _actionMetrics(): JsonField<List<EffectResponseMetricsFull>> = actionMetrics

    /**
     * Returns the raw JSON value of [actionStartTime].
     *
     * Unlike [actionStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionStartTime")
    @ExcludeMissing
    fun _actionStartTime(): JsonField<OffsetDateTime> = actionStartTime

    /**
     * Returns the raw JSON value of [actorInterceptAlt].
     *
     * Unlike [actorInterceptAlt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("actorInterceptAlt")
    @ExcludeMissing
    fun _actorInterceptAlt(): JsonField<Double> = actorInterceptAlt

    /**
     * Returns the raw JSON value of [actorInterceptLat].
     *
     * Unlike [actorInterceptLat], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("actorInterceptLat")
    @ExcludeMissing
    fun _actorInterceptLat(): JsonField<Double> = actorInterceptLat

    /**
     * Returns the raw JSON value of [actorInterceptLon].
     *
     * Unlike [actorInterceptLon], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("actorInterceptLon")
    @ExcludeMissing
    fun _actorInterceptLon(): JsonField<Double> = actorInterceptLon

    /**
     * Returns the raw JSON value of [effector].
     *
     * Unlike [effector], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effector") @ExcludeMissing fun _effector(): JsonField<String> = effector

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

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

    /**
     * Returns the raw JSON value of [totEndTime].
     *
     * Unlike [totEndTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totEndTime")
    @ExcludeMissing
    fun _totEndTime(): JsonField<OffsetDateTime> = totEndTime

    /**
     * Returns the raw JSON value of [totStartTime].
     *
     * Unlike [totStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totStartTime")
    @ExcludeMissing
    fun _totStartTime(): JsonField<OffsetDateTime> = totStartTime

    /**
     * Returns the raw JSON value of [weaponInterceptAlt].
     *
     * Unlike [weaponInterceptAlt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("weaponInterceptAlt")
    @ExcludeMissing
    fun _weaponInterceptAlt(): JsonField<Double> = weaponInterceptAlt

    /**
     * Returns the raw JSON value of [weaponInterceptLat].
     *
     * Unlike [weaponInterceptLat], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("weaponInterceptLat")
    @ExcludeMissing
    fun _weaponInterceptLat(): JsonField<Double> = weaponInterceptLat

    /**
     * Returns the raw JSON value of [weaponInterceptLon].
     *
     * Unlike [weaponInterceptLon], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("weaponInterceptLon")
    @ExcludeMissing
    fun _weaponInterceptLon(): JsonField<Double> = weaponInterceptLon

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
         * [EffectResponseActionsListFull].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EffectResponseActionsListFull]. */
    class Builder internal constructor() {

        private var actionActorSrcId: JsonField<String> = JsonMissing.of()
        private var actionActorSrcType: JsonField<String> = JsonMissing.of()
        private var actionEndTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var actionId: JsonField<String> = JsonMissing.of()
        private var actionMetrics: JsonField<MutableList<EffectResponseMetricsFull>>? = null
        private var actionStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var actorInterceptAlt: JsonField<Double> = JsonMissing.of()
        private var actorInterceptLat: JsonField<Double> = JsonMissing.of()
        private var actorInterceptLon: JsonField<Double> = JsonMissing.of()
        private var effector: JsonField<String> = JsonMissing.of()
        private var summary: JsonField<String> = JsonMissing.of()
        private var targetSrcId: JsonField<String> = JsonMissing.of()
        private var targetSrcType: JsonField<String> = JsonMissing.of()
        private var totEndTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var totStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var weaponInterceptAlt: JsonField<Double> = JsonMissing.of()
        private var weaponInterceptLat: JsonField<Double> = JsonMissing.of()
        private var weaponInterceptLon: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(effectResponseActionsListFull: EffectResponseActionsListFull) = apply {
            actionActorSrcId = effectResponseActionsListFull.actionActorSrcId
            actionActorSrcType = effectResponseActionsListFull.actionActorSrcType
            actionEndTime = effectResponseActionsListFull.actionEndTime
            actionId = effectResponseActionsListFull.actionId
            actionMetrics = effectResponseActionsListFull.actionMetrics.map { it.toMutableList() }
            actionStartTime = effectResponseActionsListFull.actionStartTime
            actorInterceptAlt = effectResponseActionsListFull.actorInterceptAlt
            actorInterceptLat = effectResponseActionsListFull.actorInterceptLat
            actorInterceptLon = effectResponseActionsListFull.actorInterceptLon
            effector = effectResponseActionsListFull.effector
            summary = effectResponseActionsListFull.summary
            targetSrcId = effectResponseActionsListFull.targetSrcId
            targetSrcType = effectResponseActionsListFull.targetSrcType
            totEndTime = effectResponseActionsListFull.totEndTime
            totStartTime = effectResponseActionsListFull.totStartTime
            weaponInterceptAlt = effectResponseActionsListFull.weaponInterceptAlt
            weaponInterceptLat = effectResponseActionsListFull.weaponInterceptLat
            weaponInterceptLon = effectResponseActionsListFull.weaponInterceptLon
            additionalProperties = effectResponseActionsListFull.additionalProperties.toMutableMap()
        }

        /**
         * The record ID, depending on the type identified in actorSrcType, of the requested
         * asset/actor.
         */
        fun actionActorSrcId(actionActorSrcId: String) =
            actionActorSrcId(JsonField.of(actionActorSrcId))

        /**
         * Sets [Builder.actionActorSrcId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionActorSrcId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actionActorSrcId(actionActorSrcId: JsonField<String>) = apply {
            this.actionActorSrcId = actionActorSrcId
        }

        /** The source type of the asset/actor identifier (AIRCRAFT, LANDCRAFT, SEACRAFT, TRACK). */
        fun actionActorSrcType(actionActorSrcType: String) =
            actionActorSrcType(JsonField.of(actionActorSrcType))

        /**
         * Sets [Builder.actionActorSrcType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionActorSrcType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actionActorSrcType(actionActorSrcType: JsonField<String>) = apply {
            this.actionActorSrcType = actionActorSrcType
        }

        /** The desired end time of this task, in ISO8601 UTC format. */
        fun actionEndTime(actionEndTime: OffsetDateTime) =
            actionEndTime(JsonField.of(actionEndTime))

        /**
         * Sets [Builder.actionEndTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionEndTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actionEndTime(actionEndTime: JsonField<OffsetDateTime>) = apply {
            this.actionEndTime = actionEndTime
        }

        /** Identifier of this action. */
        fun actionId(actionId: String) = actionId(JsonField.of(actionId))

        /**
         * Sets [Builder.actionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actionId(actionId: JsonField<String>) = apply { this.actionId = actionId }

        /** List of metrics associated with this action. */
        fun actionMetrics(actionMetrics: List<EffectResponseMetricsFull>) =
            actionMetrics(JsonField.of(actionMetrics))

        /**
         * Sets [Builder.actionMetrics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionMetrics] with a well-typed
         * `List<EffectResponseMetricsFull>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun actionMetrics(actionMetrics: JsonField<List<EffectResponseMetricsFull>>) = apply {
            this.actionMetrics = actionMetrics.map { it.toMutableList() }
        }

        /**
         * Adds a single [EffectResponseMetricsFull] to [actionMetrics].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addActionMetric(actionMetric: EffectResponseMetricsFull) = apply {
            actionMetrics =
                (actionMetrics ?: JsonField.of(mutableListOf())).also {
                    checkKnown("actionMetrics", it).add(actionMetric)
                }
        }

        /** The desired start time of this task, in ISO8601 UTC format. */
        fun actionStartTime(actionStartTime: OffsetDateTime) =
            actionStartTime(JsonField.of(actionStartTime))

        /**
         * Sets [Builder.actionStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionStartTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun actionStartTime(actionStartTime: JsonField<OffsetDateTime>) = apply {
            this.actionStartTime = actionStartTime
        }

        /** The WGS-84 altitude of the asset/actor location at weapon launch, in meters. */
        fun actorInterceptAlt(actorInterceptAlt: Double) =
            actorInterceptAlt(JsonField.of(actorInterceptAlt))

        /**
         * Sets [Builder.actorInterceptAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorInterceptAlt] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actorInterceptAlt(actorInterceptAlt: JsonField<Double>) = apply {
            this.actorInterceptAlt = actorInterceptAlt
        }

        /**
         * The WGS-84 latitude of the asset/actor location at weapon launch, in degrees. -90 to 90
         * degrees (negative values south of equator).
         */
        fun actorInterceptLat(actorInterceptLat: Double) =
            actorInterceptLat(JsonField.of(actorInterceptLat))

        /**
         * Sets [Builder.actorInterceptLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorInterceptLat] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actorInterceptLat(actorInterceptLat: JsonField<Double>) = apply {
            this.actorInterceptLat = actorInterceptLat
        }

        /**
         * The WGS-84 longitude of the asset/actor location at weapon launch, in degrees. -180 to
         * 180 degrees (negative values west of Prime Meridian).
         */
        fun actorInterceptLon(actorInterceptLon: Double) =
            actorInterceptLon(JsonField.of(actorInterceptLon))

        /**
         * Sets [Builder.actorInterceptLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorInterceptLon] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actorInterceptLon(actorInterceptLon: JsonField<Double>) = apply {
            this.actorInterceptLon = actorInterceptLon
        }

        /** The type of munition or sensor used by this asset/actor. */
        fun effector(effector: String) = effector(JsonField.of(effector))

        /**
         * Sets [Builder.effector] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effector] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun effector(effector: JsonField<String>) = apply { this.effector = effector }

        /** A summary string describing different aspects of the action. */
        fun summary(summary: String) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<String>) = apply { this.summary = summary }

        /**
         * The POI or TRACK ID, depending on the type identified in targetSrcType, of the requested
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

        /** The end time of the asset TOT (time over target), in ISO8601 UTC format. */
        fun totEndTime(totEndTime: OffsetDateTime) = totEndTime(JsonField.of(totEndTime))

        /**
         * Sets [Builder.totEndTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totEndTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totEndTime(totEndTime: JsonField<OffsetDateTime>) = apply {
            this.totEndTime = totEndTime
        }

        /** The start time of the asset TOT (time over target), in ISO8601 UTC format. */
        fun totStartTime(totStartTime: OffsetDateTime) = totStartTime(JsonField.of(totStartTime))

        /**
         * Sets [Builder.totStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totStartTime(totStartTime: JsonField<OffsetDateTime>) = apply {
            this.totStartTime = totStartTime
        }

        /** The WGS-84 altitude of the weapon destination location, in meters. */
        fun weaponInterceptAlt(weaponInterceptAlt: Double) =
            weaponInterceptAlt(JsonField.of(weaponInterceptAlt))

        /**
         * Sets [Builder.weaponInterceptAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weaponInterceptAlt] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun weaponInterceptAlt(weaponInterceptAlt: JsonField<Double>) = apply {
            this.weaponInterceptAlt = weaponInterceptAlt
        }

        /**
         * The WGS-84 latitude of the weapon destination location, in degrees. -90 to 90 degrees
         * (negative values south of equator).
         */
        fun weaponInterceptLat(weaponInterceptLat: Double) =
            weaponInterceptLat(JsonField.of(weaponInterceptLat))

        /**
         * Sets [Builder.weaponInterceptLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weaponInterceptLat] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun weaponInterceptLat(weaponInterceptLat: JsonField<Double>) = apply {
            this.weaponInterceptLat = weaponInterceptLat
        }

        /**
         * The WGS-84 longitude of the weapon destination location, in degrees. -180 to 180 degrees
         * (negative values west of Prime Meridian).
         */
        fun weaponInterceptLon(weaponInterceptLon: Double) =
            weaponInterceptLon(JsonField.of(weaponInterceptLon))

        /**
         * Sets [Builder.weaponInterceptLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weaponInterceptLon] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun weaponInterceptLon(weaponInterceptLon: JsonField<Double>) = apply {
            this.weaponInterceptLon = weaponInterceptLon
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
         * Returns an immutable instance of [EffectResponseActionsListFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EffectResponseActionsListFull =
            EffectResponseActionsListFull(
                actionActorSrcId,
                actionActorSrcType,
                actionEndTime,
                actionId,
                (actionMetrics ?: JsonMissing.of()).map { it.toImmutable() },
                actionStartTime,
                actorInterceptAlt,
                actorInterceptLat,
                actorInterceptLon,
                effector,
                summary,
                targetSrcId,
                targetSrcType,
                totEndTime,
                totStartTime,
                weaponInterceptAlt,
                weaponInterceptLat,
                weaponInterceptLon,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EffectResponseActionsListFull = apply {
        if (validated) {
            return@apply
        }

        actionActorSrcId()
        actionActorSrcType()
        actionEndTime()
        actionId()
        actionMetrics().ifPresent { it.forEach { it.validate() } }
        actionStartTime()
        actorInterceptAlt()
        actorInterceptLat()
        actorInterceptLon()
        effector()
        summary()
        targetSrcId()
        targetSrcType()
        totEndTime()
        totStartTime()
        weaponInterceptAlt()
        weaponInterceptLat()
        weaponInterceptLon()
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
        (if (actionActorSrcId.asKnown().isPresent) 1 else 0) +
            (if (actionActorSrcType.asKnown().isPresent) 1 else 0) +
            (if (actionEndTime.asKnown().isPresent) 1 else 0) +
            (if (actionId.asKnown().isPresent) 1 else 0) +
            (actionMetrics.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (actionStartTime.asKnown().isPresent) 1 else 0) +
            (if (actorInterceptAlt.asKnown().isPresent) 1 else 0) +
            (if (actorInterceptLat.asKnown().isPresent) 1 else 0) +
            (if (actorInterceptLon.asKnown().isPresent) 1 else 0) +
            (if (effector.asKnown().isPresent) 1 else 0) +
            (if (summary.asKnown().isPresent) 1 else 0) +
            (if (targetSrcId.asKnown().isPresent) 1 else 0) +
            (if (targetSrcType.asKnown().isPresent) 1 else 0) +
            (if (totEndTime.asKnown().isPresent) 1 else 0) +
            (if (totStartTime.asKnown().isPresent) 1 else 0) +
            (if (weaponInterceptAlt.asKnown().isPresent) 1 else 0) +
            (if (weaponInterceptLat.asKnown().isPresent) 1 else 0) +
            (if (weaponInterceptLon.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EffectResponseActionsListFull && actionActorSrcId == other.actionActorSrcId && actionActorSrcType == other.actionActorSrcType && actionEndTime == other.actionEndTime && actionId == other.actionId && actionMetrics == other.actionMetrics && actionStartTime == other.actionStartTime && actorInterceptAlt == other.actorInterceptAlt && actorInterceptLat == other.actorInterceptLat && actorInterceptLon == other.actorInterceptLon && effector == other.effector && summary == other.summary && targetSrcId == other.targetSrcId && targetSrcType == other.targetSrcType && totEndTime == other.totEndTime && totStartTime == other.totStartTime && weaponInterceptAlt == other.weaponInterceptAlt && weaponInterceptLat == other.weaponInterceptLat && weaponInterceptLon == other.weaponInterceptLon && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(actionActorSrcId, actionActorSrcType, actionEndTime, actionId, actionMetrics, actionStartTime, actorInterceptAlt, actorInterceptLat, actorInterceptLon, effector, summary, targetSrcId, targetSrcType, totEndTime, totStartTime, weaponInterceptAlt, weaponInterceptLat, weaponInterceptLon, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EffectResponseActionsListFull{actionActorSrcId=$actionActorSrcId, actionActorSrcType=$actionActorSrcType, actionEndTime=$actionEndTime, actionId=$actionId, actionMetrics=$actionMetrics, actionStartTime=$actionStartTime, actorInterceptAlt=$actorInterceptAlt, actorInterceptLat=$actorInterceptLat, actorInterceptLon=$actorInterceptLon, effector=$effector, summary=$summary, targetSrcId=$targetSrcId, targetSrcType=$targetSrcType, totEndTime=$totEndTime, totStartTime=$totStartTime, weaponInterceptAlt=$weaponInterceptAlt, weaponInterceptLat=$weaponInterceptLat, weaponInterceptLon=$weaponInterceptLon, additionalProperties=$additionalProperties}"
}

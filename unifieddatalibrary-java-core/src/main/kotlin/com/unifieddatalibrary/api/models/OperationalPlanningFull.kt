// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Collection of planning information associated with this SiteOperations record. */
class OperationalPlanningFull
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
        @JsonProperty("opRemark") @ExcludeMissing opRemark: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opSource") @ExcludeMissing opSource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opStartDate")
        @ExcludeMissing
        opStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("opStatus") @ExcludeMissing opStatus: JsonField<String> = JsonMissing.of(),
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
     * The end date of this operational planning, in ISO8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opEndDate(): Optional<OffsetDateTime> = opEndDate.getOptional("opEndDate")

    /**
     * The name of the person who made the most recent change made to this OperationalPlanning data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opLastChangedBy(): Optional<String> = opLastChangedBy.getOptional("opLastChangedBy")

    /**
     * The datetime of the most recent change made to this OperationalPlanning data, in ISO8601 UTC
     * format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opLastChangedDate(): Optional<OffsetDateTime> =
        opLastChangedDate.getOptional("opLastChangedDate")

    /**
     * Remark text regarding this operation planning.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opRemark(): Optional<String> = opRemark.getOptional("opRemark")

    /**
     * The person, unit, organization, etc. responsible for this operation planning.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opSource(): Optional<String> = opSource.getOptional("opSource")

    /**
     * The start date of this operational planning, in ISO8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opStartDate(): Optional<OffsetDateTime> = opStartDate.getOptional("opStartDate")

    /**
     * The status of this operational planning.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opStatus(): Optional<String> = opStatus.getOptional("opStatus")

    /**
     * Returns the raw JSON value of [opEndDate].
     *
     * Unlike [opEndDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opEndDate")
    @ExcludeMissing
    fun _opEndDate(): JsonField<OffsetDateTime> = opEndDate

    /**
     * Returns the raw JSON value of [opLastChangedBy].
     *
     * Unlike [opLastChangedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opLastChangedBy")
    @ExcludeMissing
    fun _opLastChangedBy(): JsonField<String> = opLastChangedBy

    /**
     * Returns the raw JSON value of [opLastChangedDate].
     *
     * Unlike [opLastChangedDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("opLastChangedDate")
    @ExcludeMissing
    fun _opLastChangedDate(): JsonField<OffsetDateTime> = opLastChangedDate

    /**
     * Returns the raw JSON value of [opRemark].
     *
     * Unlike [opRemark], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opRemark") @ExcludeMissing fun _opRemark(): JsonField<String> = opRemark

    /**
     * Returns the raw JSON value of [opSource].
     *
     * Unlike [opSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opSource") @ExcludeMissing fun _opSource(): JsonField<String> = opSource

    /**
     * Returns the raw JSON value of [opStartDate].
     *
     * Unlike [opStartDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opStartDate")
    @ExcludeMissing
    fun _opStartDate(): JsonField<OffsetDateTime> = opStartDate

    /**
     * Returns the raw JSON value of [opStatus].
     *
     * Unlike [opStatus], this method doesn't throw if the JSON field has an unexpected type.
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

        /** Returns a mutable builder for constructing an instance of [OperationalPlanningFull]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OperationalPlanningFull]. */
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
        internal fun from(operationalPlanningFull: OperationalPlanningFull) = apply {
            opEndDate = operationalPlanningFull.opEndDate
            opLastChangedBy = operationalPlanningFull.opLastChangedBy
            opLastChangedDate = operationalPlanningFull.opLastChangedDate
            opRemark = operationalPlanningFull.opRemark
            opSource = operationalPlanningFull.opSource
            opStartDate = operationalPlanningFull.opStartDate
            opStatus = operationalPlanningFull.opStatus
            additionalProperties = operationalPlanningFull.additionalProperties.toMutableMap()
        }

        /**
         * The end date of this operational planning, in ISO8601 UTC format with millisecond
         * precision.
         */
        fun opEndDate(opEndDate: OffsetDateTime) = opEndDate(JsonField.of(opEndDate))

        /**
         * Sets [Builder.opEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opEndDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun opEndDate(opEndDate: JsonField<OffsetDateTime>) = apply { this.opEndDate = opEndDate }

        /**
         * The name of the person who made the most recent change made to this OperationalPlanning
         * data.
         */
        fun opLastChangedBy(opLastChangedBy: String) =
            opLastChangedBy(JsonField.of(opLastChangedBy))

        /**
         * Sets [Builder.opLastChangedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opLastChangedBy] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun opLastChangedBy(opLastChangedBy: JsonField<String>) = apply {
            this.opLastChangedBy = opLastChangedBy
        }

        /**
         * The datetime of the most recent change made to this OperationalPlanning data, in ISO8601
         * UTC format with millisecond precision.
         */
        fun opLastChangedDate(opLastChangedDate: OffsetDateTime) =
            opLastChangedDate(JsonField.of(opLastChangedDate))

        /**
         * Sets [Builder.opLastChangedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opLastChangedDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun opLastChangedDate(opLastChangedDate: JsonField<OffsetDateTime>) = apply {
            this.opLastChangedDate = opLastChangedDate
        }

        /** Remark text regarding this operation planning. */
        fun opRemark(opRemark: String) = opRemark(JsonField.of(opRemark))

        /**
         * Sets [Builder.opRemark] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opRemark] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun opRemark(opRemark: JsonField<String>) = apply { this.opRemark = opRemark }

        /** The person, unit, organization, etc. responsible for this operation planning. */
        fun opSource(opSource: String) = opSource(JsonField.of(opSource))

        /**
         * Sets [Builder.opSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opSource] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun opSource(opSource: JsonField<String>) = apply { this.opSource = opSource }

        /**
         * The start date of this operational planning, in ISO8601 UTC format with millisecond
         * precision.
         */
        fun opStartDate(opStartDate: OffsetDateTime) = opStartDate(JsonField.of(opStartDate))

        /**
         * Sets [Builder.opStartDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opStartDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun opStartDate(opStartDate: JsonField<OffsetDateTime>) = apply {
            this.opStartDate = opStartDate
        }

        /** The status of this operational planning. */
        fun opStatus(opStatus: String) = opStatus(JsonField.of(opStatus))

        /**
         * Sets [Builder.opStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opStatus] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun opStatus(opStatus: JsonField<String>) = apply { this.opStatus = opStatus }

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
         * Returns an immutable instance of [OperationalPlanningFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OperationalPlanningFull =
            OperationalPlanningFull(
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

    fun validate(): OperationalPlanningFull = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

        return other is OperationalPlanningFull &&
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
        "OperationalPlanningFull{opEndDate=$opEndDate, opLastChangedBy=$opLastChangedBy, opLastChangedDate=$opLastChangedDate, opRemark=$opRemark, opSource=$opSource, opStartDate=$opStartDate, opStatus=$opStatus, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

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

/** Discrepancy information associated with this LogisticsSupport record. */
class LogisticsDiscrepancyInfosFull
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
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun closureTime(): Optional<OffsetDateTime> = closureTime.getOptional("closureTime")

    /**
     * The aircraft discrepancy description.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun discrepancyInfo(): Optional<String> = discrepancyInfo.getOptional("discrepancyInfo")

    /**
     * Job Control Number of the discrepancy.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun jcn(): Optional<String> = jcn.getOptional("jcn")

    /**
     * The job start time, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun jobStTime(): Optional<OffsetDateTime> = jobStTime.getOptional("jobStTime")

    /**
     * Returns the raw JSON value of [closureTime].
     *
     * Unlike [closureTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("closureTime")
    @ExcludeMissing
    fun _closureTime(): JsonField<OffsetDateTime> = closureTime

    /**
     * Returns the raw JSON value of [discrepancyInfo].
     *
     * Unlike [discrepancyInfo], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [jobStTime], this method doesn't throw if the JSON field has an unexpected type.
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
         * [LogisticsDiscrepancyInfosFull].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogisticsDiscrepancyInfosFull]. */
    class Builder internal constructor() {

        private var closureTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discrepancyInfo: JsonField<String> = JsonMissing.of()
        private var jcn: JsonField<String> = JsonMissing.of()
        private var jobStTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logisticsDiscrepancyInfosFull: LogisticsDiscrepancyInfosFull) = apply {
            closureTime = logisticsDiscrepancyInfosFull.closureTime
            discrepancyInfo = logisticsDiscrepancyInfosFull.discrepancyInfo
            jcn = logisticsDiscrepancyInfosFull.jcn
            jobStTime = logisticsDiscrepancyInfosFull.jobStTime
            additionalProperties = logisticsDiscrepancyInfosFull.additionalProperties.toMutableMap()
        }

        /** The discrepancy closure time, in ISO 8601 UTC format with millisecond precision. */
        fun closureTime(closureTime: OffsetDateTime) = closureTime(JsonField.of(closureTime))

        /**
         * Sets [Builder.closureTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closureTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * You should usually call [Builder.discrepancyInfo] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discrepancyInfo(discrepancyInfo: JsonField<String>) = apply {
            this.discrepancyInfo = discrepancyInfo
        }

        /** Job Control Number of the discrepancy. */
        fun jcn(jcn: String) = jcn(JsonField.of(jcn))

        /**
         * Sets [Builder.jcn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jcn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jcn(jcn: JsonField<String>) = apply { this.jcn = jcn }

        /** The job start time, in ISO 8601 UTC format with millisecond precision. */
        fun jobStTime(jobStTime: OffsetDateTime) = jobStTime(JsonField.of(jobStTime))

        /**
         * Sets [Builder.jobStTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobStTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jobStTime(jobStTime: JsonField<OffsetDateTime>) = apply { this.jobStTime = jobStTime }

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
         * Returns an immutable instance of [LogisticsDiscrepancyInfosFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogisticsDiscrepancyInfosFull =
            LogisticsDiscrepancyInfosFull(
                closureTime,
                discrepancyInfo,
                jcn,
                jobStTime,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogisticsDiscrepancyInfosFull = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

        return other is LogisticsDiscrepancyInfosFull &&
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
        "LogisticsDiscrepancyInfosFull{closureTime=$closureTime, discrepancyInfo=$discrepancyInfo, jcn=$jcn, jobStTime=$jobStTime, additionalProperties=$additionalProperties}"
}

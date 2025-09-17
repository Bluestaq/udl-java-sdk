// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.notifications.offset

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class OffsetGetResponse
private constructor(
    private val maxOffset: JsonField<Long>,
    private val minOffset: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("maxOffset") @ExcludeMissing maxOffset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("minOffset") @ExcludeMissing minOffset: JsonField<Long> = JsonMissing.of(),
    ) : this(maxOffset, minOffset, mutableMapOf())

    /**
     * The maximum (latest) Kafka offset for this topic.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxOffset(): Optional<Long> = maxOffset.getOptional("maxOffset")

    /**
     * The minimum (oldest) Kafka offset for this topic.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minOffset(): Optional<Long> = minOffset.getOptional("minOffset")

    /**
     * Returns the raw JSON value of [maxOffset].
     *
     * Unlike [maxOffset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxOffset") @ExcludeMissing fun _maxOffset(): JsonField<Long> = maxOffset

    /**
     * Returns the raw JSON value of [minOffset].
     *
     * Unlike [minOffset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minOffset") @ExcludeMissing fun _minOffset(): JsonField<Long> = minOffset

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

        /** Returns a mutable builder for constructing an instance of [OffsetGetResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OffsetGetResponse]. */
    class Builder internal constructor() {

        private var maxOffset: JsonField<Long> = JsonMissing.of()
        private var minOffset: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(offsetGetResponse: OffsetGetResponse) = apply {
            maxOffset = offsetGetResponse.maxOffset
            minOffset = offsetGetResponse.minOffset
            additionalProperties = offsetGetResponse.additionalProperties.toMutableMap()
        }

        /** The maximum (latest) Kafka offset for this topic. */
        fun maxOffset(maxOffset: Long) = maxOffset(JsonField.of(maxOffset))

        /**
         * Sets [Builder.maxOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxOffset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxOffset(maxOffset: JsonField<Long>) = apply { this.maxOffset = maxOffset }

        /** The minimum (oldest) Kafka offset for this topic. */
        fun minOffset(minOffset: Long) = minOffset(JsonField.of(minOffset))

        /**
         * Sets [Builder.minOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minOffset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minOffset(minOffset: JsonField<Long>) = apply { this.minOffset = minOffset }

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
         * Returns an immutable instance of [OffsetGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OffsetGetResponse =
            OffsetGetResponse(maxOffset, minOffset, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): OffsetGetResponse = apply {
        if (validated) {
            return@apply
        }

        maxOffset()
        minOffset()
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
        (if (maxOffset.asKnown().isPresent) 1 else 0) +
            (if (minOffset.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OffsetGetResponse &&
            maxOffset == other.maxOffset &&
            minOffset == other.minOffset &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(maxOffset, minOffset, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OffsetGetResponse{maxOffset=$maxOffset, minOffset=$minOffset, additionalProperties=$additionalProperties}"
}

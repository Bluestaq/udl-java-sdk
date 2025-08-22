// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.securemessaging

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

class TopicDetails
private constructor(
    private val description: JsonField<String>,
    private val maxPos: JsonField<Long>,
    private val minPos: JsonField<Long>,
    private val topic: JsonField<String>,
    private val udlOpenAPISchema: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxPos") @ExcludeMissing maxPos: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("minPos") @ExcludeMissing minPos: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("topic") @ExcludeMissing topic: JsonField<String> = JsonMissing.of(),
        @JsonProperty("udlOpenAPISchema")
        @ExcludeMissing
        udlOpenAPISchema: JsonField<String> = JsonMissing.of(),
    ) : this(description, maxPos, minPos, topic, udlOpenAPISchema, mutableMapOf())

    /**
     * A description of the data content of this topic.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The maximum (latest) kafka offset for this topic.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxPos(): Optional<Long> = maxPos.getOptional("maxPos")

    /**
     * The minimum (oldest) kafka offset for this topic.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minPos(): Optional<Long> = minPos.getOptional("minPos")

    /**
     * The name of the topic in kafka.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun topic(): Optional<String> = topic.getOptional("topic")

    /**
     * The UDL schema that the objects in this topic apply to.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun udlOpenAPISchema(): Optional<String> = udlOpenAPISchema.getOptional("udlOpenAPISchema")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [maxPos].
     *
     * Unlike [maxPos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxPos") @ExcludeMissing fun _maxPos(): JsonField<Long> = maxPos

    /**
     * Returns the raw JSON value of [minPos].
     *
     * Unlike [minPos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minPos") @ExcludeMissing fun _minPos(): JsonField<Long> = minPos

    /**
     * Returns the raw JSON value of [topic].
     *
     * Unlike [topic], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("topic") @ExcludeMissing fun _topic(): JsonField<String> = topic

    /**
     * Returns the raw JSON value of [udlOpenAPISchema].
     *
     * Unlike [udlOpenAPISchema], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("udlOpenAPISchema")
    @ExcludeMissing
    fun _udlOpenAPISchema(): JsonField<String> = udlOpenAPISchema

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

        /** Returns a mutable builder for constructing an instance of [TopicDetails]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TopicDetails]. */
    class Builder internal constructor() {

        private var description: JsonField<String> = JsonMissing.of()
        private var maxPos: JsonField<Long> = JsonMissing.of()
        private var minPos: JsonField<Long> = JsonMissing.of()
        private var topic: JsonField<String> = JsonMissing.of()
        private var udlOpenAPISchema: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(topicDetails: TopicDetails) = apply {
            description = topicDetails.description
            maxPos = topicDetails.maxPos
            minPos = topicDetails.minPos
            topic = topicDetails.topic
            udlOpenAPISchema = topicDetails.udlOpenAPISchema
            additionalProperties = topicDetails.additionalProperties.toMutableMap()
        }

        /** A description of the data content of this topic. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The maximum (latest) kafka offset for this topic. */
        fun maxPos(maxPos: Long) = maxPos(JsonField.of(maxPos))

        /**
         * Sets [Builder.maxPos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxPos] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxPos(maxPos: JsonField<Long>) = apply { this.maxPos = maxPos }

        /** The minimum (oldest) kafka offset for this topic. */
        fun minPos(minPos: Long) = minPos(JsonField.of(minPos))

        /**
         * Sets [Builder.minPos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minPos] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minPos(minPos: JsonField<Long>) = apply { this.minPos = minPos }

        /** The name of the topic in kafka. */
        fun topic(topic: String) = topic(JsonField.of(topic))

        /**
         * Sets [Builder.topic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topic] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topic(topic: JsonField<String>) = apply { this.topic = topic }

        /** The UDL schema that the objects in this topic apply to. */
        fun udlOpenAPISchema(udlOpenAPISchema: String) =
            udlOpenAPISchema(JsonField.of(udlOpenAPISchema))

        /**
         * Sets [Builder.udlOpenAPISchema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.udlOpenAPISchema] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun udlOpenAPISchema(udlOpenAPISchema: JsonField<String>) = apply {
            this.udlOpenAPISchema = udlOpenAPISchema
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
         * Returns an immutable instance of [TopicDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TopicDetails =
            TopicDetails(
                description,
                maxPos,
                minPos,
                topic,
                udlOpenAPISchema,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TopicDetails = apply {
        if (validated) {
            return@apply
        }

        description()
        maxPos()
        minPos()
        topic()
        udlOpenAPISchema()
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
        (if (description.asKnown().isPresent) 1 else 0) +
            (if (maxPos.asKnown().isPresent) 1 else 0) +
            (if (minPos.asKnown().isPresent) 1 else 0) +
            (if (topic.asKnown().isPresent) 1 else 0) +
            (if (udlOpenAPISchema.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopicDetails &&
            description == other.description &&
            maxPos == other.maxPos &&
            minPos == other.minPos &&
            topic == other.topic &&
            udlOpenAPISchema == other.udlOpenAPISchema &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(description, maxPos, minPos, topic, udlOpenAPISchema, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TopicDetails{description=$description, maxPos=$maxPos, minPos=$minPos, topic=$topic, udlOpenAPISchema=$udlOpenAPISchema, additionalProperties=$additionalProperties}"
}

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
import java.util.Collections
import java.util.Objects
import java.util.Optional

class SofDataSourceRefFull
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dataSourceId: JsonField<String>,
    private val endPosition: JsonField<String>,
    private val paragraphNumber: JsonField<String>,
    private val sentenceNumber: JsonField<String>,
    private val startPosition: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dataSourceId")
        @ExcludeMissing
        dataSourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endPosition")
        @ExcludeMissing
        endPosition: JsonField<String> = JsonMissing.of(),
        @JsonProperty("paragraphNumber")
        @ExcludeMissing
        paragraphNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sentenceNumber")
        @ExcludeMissing
        sentenceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startPosition")
        @ExcludeMissing
        startPosition: JsonField<String> = JsonMissing.of(),
    ) : this(
        dataSourceId,
        endPosition,
        paragraphNumber,
        sentenceNumber,
        startPosition,
        mutableMapOf(),
    )

    /**
     * Data source id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dataSourceId(): Optional<String> = dataSourceId.getOptional("dataSourceId")

    /**
     * end position.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endPosition(): Optional<String> = endPosition.getOptional("endPosition")

    /**
     * paragraph number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun paragraphNumber(): Optional<String> = paragraphNumber.getOptional("paragraphNumber")

    /**
     * sentence number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sentenceNumber(): Optional<String> = sentenceNumber.getOptional("sentenceNumber")

    /**
     * start position.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startPosition(): Optional<String> = startPosition.getOptional("startPosition")

    /**
     * Returns the raw JSON value of [dataSourceId].
     *
     * Unlike [dataSourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataSourceId")
    @ExcludeMissing
    fun _dataSourceId(): JsonField<String> = dataSourceId

    /**
     * Returns the raw JSON value of [endPosition].
     *
     * Unlike [endPosition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endPosition") @ExcludeMissing fun _endPosition(): JsonField<String> = endPosition

    /**
     * Returns the raw JSON value of [paragraphNumber].
     *
     * Unlike [paragraphNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paragraphNumber")
    @ExcludeMissing
    fun _paragraphNumber(): JsonField<String> = paragraphNumber

    /**
     * Returns the raw JSON value of [sentenceNumber].
     *
     * Unlike [sentenceNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sentenceNumber")
    @ExcludeMissing
    fun _sentenceNumber(): JsonField<String> = sentenceNumber

    /**
     * Returns the raw JSON value of [startPosition].
     *
     * Unlike [startPosition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startPosition")
    @ExcludeMissing
    fun _startPosition(): JsonField<String> = startPosition

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

        /** Returns a mutable builder for constructing an instance of [SofDataSourceRefFull]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SofDataSourceRefFull]. */
    class Builder internal constructor() {

        private var dataSourceId: JsonField<String> = JsonMissing.of()
        private var endPosition: JsonField<String> = JsonMissing.of()
        private var paragraphNumber: JsonField<String> = JsonMissing.of()
        private var sentenceNumber: JsonField<String> = JsonMissing.of()
        private var startPosition: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sofDataSourceRefFull: SofDataSourceRefFull) = apply {
            dataSourceId = sofDataSourceRefFull.dataSourceId
            endPosition = sofDataSourceRefFull.endPosition
            paragraphNumber = sofDataSourceRefFull.paragraphNumber
            sentenceNumber = sofDataSourceRefFull.sentenceNumber
            startPosition = sofDataSourceRefFull.startPosition
            additionalProperties = sofDataSourceRefFull.additionalProperties.toMutableMap()
        }

        /** Data source id. */
        fun dataSourceId(dataSourceId: String) = dataSourceId(JsonField.of(dataSourceId))

        /**
         * Sets [Builder.dataSourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSourceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataSourceId(dataSourceId: JsonField<String>) = apply {
            this.dataSourceId = dataSourceId
        }

        /** end position. */
        fun endPosition(endPosition: String) = endPosition(JsonField.of(endPosition))

        /**
         * Sets [Builder.endPosition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endPosition] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endPosition(endPosition: JsonField<String>) = apply { this.endPosition = endPosition }

        /** paragraph number. */
        fun paragraphNumber(paragraphNumber: String) =
            paragraphNumber(JsonField.of(paragraphNumber))

        /**
         * Sets [Builder.paragraphNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paragraphNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paragraphNumber(paragraphNumber: JsonField<String>) = apply {
            this.paragraphNumber = paragraphNumber
        }

        /** sentence number. */
        fun sentenceNumber(sentenceNumber: String) = sentenceNumber(JsonField.of(sentenceNumber))

        /**
         * Sets [Builder.sentenceNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sentenceNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sentenceNumber(sentenceNumber: JsonField<String>) = apply {
            this.sentenceNumber = sentenceNumber
        }

        /** start position. */
        fun startPosition(startPosition: String) = startPosition(JsonField.of(startPosition))

        /**
         * Sets [Builder.startPosition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startPosition] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startPosition(startPosition: JsonField<String>) = apply {
            this.startPosition = startPosition
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
         * Returns an immutable instance of [SofDataSourceRefFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SofDataSourceRefFull =
            SofDataSourceRefFull(
                dataSourceId,
                endPosition,
                paragraphNumber,
                sentenceNumber,
                startPosition,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SofDataSourceRefFull = apply {
        if (validated) {
            return@apply
        }

        dataSourceId()
        endPosition()
        paragraphNumber()
        sentenceNumber()
        startPosition()
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
        (if (dataSourceId.asKnown().isPresent) 1 else 0) +
            (if (endPosition.asKnown().isPresent) 1 else 0) +
            (if (paragraphNumber.asKnown().isPresent) 1 else 0) +
            (if (sentenceNumber.asKnown().isPresent) 1 else 0) +
            (if (startPosition.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SofDataSourceRefFull &&
            dataSourceId == other.dataSourceId &&
            endPosition == other.endPosition &&
            paragraphNumber == other.paragraphNumber &&
            sentenceNumber == other.sentenceNumber &&
            startPosition == other.startPosition &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            dataSourceId,
            endPosition,
            paragraphNumber,
            sentenceNumber,
            startPosition,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SofDataSourceRefFull{dataSourceId=$dataSourceId, endPosition=$endPosition, paragraphNumber=$paragraphNumber, sentenceNumber=$sentenceNumber, startPosition=$startPosition, additionalProperties=$additionalProperties}"
}

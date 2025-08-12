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

/** The supply stocks for this support item. */
class LogisticsStocksFull private constructor(
    private val quantity: JsonField<Int>,
    private val sourceIcao: JsonField<String>,
    private val stockCheckTime: JsonField<OffsetDateTime>,
    private val stockPoc: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sourceICAO") @ExcludeMissing sourceIcao: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stockCheckTime") @ExcludeMissing stockCheckTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("stockPOC") @ExcludeMissing stockPoc: JsonField<String> = JsonMissing.of()
    ) : this(
      quantity,
      sourceIcao,
      stockCheckTime,
      stockPoc,
      mutableMapOf(),
    )

    /**
     * The quantity of available parts needed from sourceICAO.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Optional<Int> = quantity.getOptional("quantity")

    /**
     * The ICAO code for the primary location with available parts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun sourceIcao(): Optional<String> = sourceIcao.getOptional("sourceICAO")

    /**
     * The datetime when the parts were sourced, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun stockCheckTime(): Optional<OffsetDateTime> = stockCheckTime.getOptional("stockCheckTime")

    /**
     * The point of contact at the sourced location.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun stockPoc(): Optional<String> = stockPoc.getOptional("stockPOC")

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity")
    @ExcludeMissing
    fun _quantity(): JsonField<Int> = quantity

    /**
     * Returns the raw JSON value of [sourceIcao].
     *
     * Unlike [sourceIcao], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceICAO")
    @ExcludeMissing
    fun _sourceIcao(): JsonField<String> = sourceIcao

    /**
     * Returns the raw JSON value of [stockCheckTime].
     *
     * Unlike [stockCheckTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stockCheckTime")
    @ExcludeMissing
    fun _stockCheckTime(): JsonField<OffsetDateTime> = stockCheckTime

    /**
     * Returns the raw JSON value of [stockPoc].
     *
     * Unlike [stockPoc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stockPOC")
    @ExcludeMissing
    fun _stockPoc(): JsonField<String> = stockPoc

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
      additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [LogisticsStocksFull]. */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [LogisticsStocksFull]. */
    class Builder internal constructor() {

        private var quantity: JsonField<Int> = JsonMissing.of()
        private var sourceIcao: JsonField<String> = JsonMissing.of()
        private var stockCheckTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var stockPoc: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logisticsStocksFull: LogisticsStocksFull) =
            apply {
                quantity = logisticsStocksFull.quantity
                sourceIcao = logisticsStocksFull.sourceIcao
                stockCheckTime = logisticsStocksFull.stockCheckTime
                stockPoc = logisticsStocksFull.stockPoc
                additionalProperties = logisticsStocksFull.additionalProperties.toMutableMap()
            }

        /** The quantity of available parts needed from sourceICAO. */
        fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun quantity(quantity: JsonField<Int>) =
            apply {
                this.quantity = quantity
            }

        /** The ICAO code for the primary location with available parts. */
        fun sourceIcao(sourceIcao: String) = sourceIcao(JsonField.of(sourceIcao))

        /**
         * Sets [Builder.sourceIcao] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceIcao] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceIcao(sourceIcao: JsonField<String>) =
            apply {
                this.sourceIcao = sourceIcao
            }

        /** The datetime when the parts were sourced, in ISO 8601 UTC format with millisecond precision. */
        fun stockCheckTime(stockCheckTime: OffsetDateTime) = stockCheckTime(JsonField.of(stockCheckTime))

        /**
         * Sets [Builder.stockCheckTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stockCheckTime] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stockCheckTime(stockCheckTime: JsonField<OffsetDateTime>) =
            apply {
                this.stockCheckTime = stockCheckTime
            }

        /** The point of contact at the sourced location. */
        fun stockPoc(stockPoc: String) = stockPoc(JsonField.of(stockPoc))

        /**
         * Sets [Builder.stockPoc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stockPoc] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stockPoc(stockPoc: JsonField<String>) =
            apply {
                this.stockPoc = stockPoc
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        /**
         * Returns an immutable instance of [LogisticsStocksFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogisticsStocksFull =
            LogisticsStocksFull(
              quantity,
              sourceIcao,
              stockCheckTime,
              stockPoc,
              additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogisticsStocksFull =
        apply {
            if (validated) {
              return@apply
            }

            quantity()
            sourceIcao()
            stockCheckTime()
            stockPoc()
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
    internal fun validity(): Int = (if (quantity.asKnown().isPresent) 1 else 0) + (if (sourceIcao.asKnown().isPresent) 1 else 0) + (if (stockCheckTime.asKnown().isPresent) 1 else 0) + (if (stockPoc.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is LogisticsStocksFull && quantity == other.quantity && sourceIcao == other.sourceIcao && stockCheckTime == other.stockCheckTime && stockPoc == other.stockPoc && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(quantity, sourceIcao, stockCheckTime, stockPoc, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "LogisticsStocksFull{quantity=$quantity, sourceIcao=$sourceIcao, stockCheckTime=$stockCheckTime, stockPoc=$stockPoc, additionalProperties=$additionalProperties}"
}

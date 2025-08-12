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
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsStocksFull
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The parts associated with this support item. */
class LogisticsPartsFull private constructor(
    private val figureNumber: JsonField<String>,
    private val indexNumber: JsonField<String>,
    private val locationVerifier: JsonField<String>,
    private val logisticsStocks: JsonField<List<LogisticsStocksFull>>,
    private val measurementUnitCode: JsonField<String>,
    private val nationalStockNumber: JsonField<String>,
    private val partNumber: JsonField<String>,
    private val requestVerifier: JsonField<String>,
    private val supplyDocumentNumber: JsonField<String>,
    private val technicalOrderText: JsonField<String>,
    private val workUnitCode: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("figureNumber") @ExcludeMissing figureNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("indexNumber") @ExcludeMissing indexNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locationVerifier") @ExcludeMissing locationVerifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logisticsStocks") @ExcludeMissing logisticsStocks: JsonField<List<LogisticsStocksFull>> = JsonMissing.of(),
        @JsonProperty("measurementUnitCode") @ExcludeMissing measurementUnitCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nationalStockNumber") @ExcludeMissing nationalStockNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("partNumber") @ExcludeMissing partNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requestVerifier") @ExcludeMissing requestVerifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supplyDocumentNumber") @ExcludeMissing supplyDocumentNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("technicalOrderText") @ExcludeMissing technicalOrderText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workUnitCode") @ExcludeMissing workUnitCode: JsonField<String> = JsonMissing.of()
    ) : this(
      figureNumber,
      indexNumber,
      locationVerifier,
      logisticsStocks,
      measurementUnitCode,
      nationalStockNumber,
      partNumber,
      requestVerifier,
      supplyDocumentNumber,
      technicalOrderText,
      workUnitCode,
      mutableMapOf(),
    )

    /**
     * Technical order manual figure number for the requested / supplied part.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun figureNumber(): Optional<String> = figureNumber.getOptional("figureNumber")

    /**
     * Technical order manual index number for the requested part.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun indexNumber(): Optional<String> = indexNumber.getOptional("indexNumber")

    /**
     * The person who validated that the sourced location has, and can supply, the requested parts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun locationVerifier(): Optional<String> = locationVerifier.getOptional("locationVerifier")

    /**
     * The supply stocks for this support item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun logisticsStocks(): Optional<List<LogisticsStocksFull>> = logisticsStocks.getOptional("logisticsStocks")

    /**
     * Code for a unit of measurement.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun measurementUnitCode(): Optional<String> = measurementUnitCode.getOptional("measurementUnitCode")

    /**
     * The National Stock Number of the part being requested or supplied.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun nationalStockNumber(): Optional<String> = nationalStockNumber.getOptional("nationalStockNumber")

    /**
     * Requested or supplied part number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun partNumber(): Optional<String> = partNumber.getOptional("partNumber")

    /**
     * The person who validated the request for parts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun requestVerifier(): Optional<String> = requestVerifier.getOptional("requestVerifier")

    /**
     * The supply document number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun supplyDocumentNumber(): Optional<String> = supplyDocumentNumber.getOptional("supplyDocumentNumber")

    /**
     * Indicates the specified Technical Order manual holding the aircraft information for use in diagnosing a problem or condition.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun technicalOrderText(): Optional<String> = technicalOrderText.getOptional("technicalOrderText")

    /**
     * Work Unit Code (WUC), or for some aircraft types, the Reference Designator.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun workUnitCode(): Optional<String> = workUnitCode.getOptional("workUnitCode")

    /**
     * Returns the raw JSON value of [figureNumber].
     *
     * Unlike [figureNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("figureNumber")
    @ExcludeMissing
    fun _figureNumber(): JsonField<String> = figureNumber

    /**
     * Returns the raw JSON value of [indexNumber].
     *
     * Unlike [indexNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("indexNumber")
    @ExcludeMissing
    fun _indexNumber(): JsonField<String> = indexNumber

    /**
     * Returns the raw JSON value of [locationVerifier].
     *
     * Unlike [locationVerifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locationVerifier")
    @ExcludeMissing
    fun _locationVerifier(): JsonField<String> = locationVerifier

    /**
     * Returns the raw JSON value of [logisticsStocks].
     *
     * Unlike [logisticsStocks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logisticsStocks")
    @ExcludeMissing
    fun _logisticsStocks(): JsonField<List<LogisticsStocksFull>> = logisticsStocks

    /**
     * Returns the raw JSON value of [measurementUnitCode].
     *
     * Unlike [measurementUnitCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("measurementUnitCode")
    @ExcludeMissing
    fun _measurementUnitCode(): JsonField<String> = measurementUnitCode

    /**
     * Returns the raw JSON value of [nationalStockNumber].
     *
     * Unlike [nationalStockNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nationalStockNumber")
    @ExcludeMissing
    fun _nationalStockNumber(): JsonField<String> = nationalStockNumber

    /**
     * Returns the raw JSON value of [partNumber].
     *
     * Unlike [partNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("partNumber")
    @ExcludeMissing
    fun _partNumber(): JsonField<String> = partNumber

    /**
     * Returns the raw JSON value of [requestVerifier].
     *
     * Unlike [requestVerifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestVerifier")
    @ExcludeMissing
    fun _requestVerifier(): JsonField<String> = requestVerifier

    /**
     * Returns the raw JSON value of [supplyDocumentNumber].
     *
     * Unlike [supplyDocumentNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("supplyDocumentNumber")
    @ExcludeMissing
    fun _supplyDocumentNumber(): JsonField<String> = supplyDocumentNumber

    /**
     * Returns the raw JSON value of [technicalOrderText].
     *
     * Unlike [technicalOrderText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("technicalOrderText")
    @ExcludeMissing
    fun _technicalOrderText(): JsonField<String> = technicalOrderText

    /**
     * Returns the raw JSON value of [workUnitCode].
     *
     * Unlike [workUnitCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workUnitCode")
    @ExcludeMissing
    fun _workUnitCode(): JsonField<String> = workUnitCode

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
      additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [LogisticsPartsFull]. */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [LogisticsPartsFull]. */
    class Builder internal constructor() {

        private var figureNumber: JsonField<String> = JsonMissing.of()
        private var indexNumber: JsonField<String> = JsonMissing.of()
        private var locationVerifier: JsonField<String> = JsonMissing.of()
        private var logisticsStocks: JsonField<MutableList<LogisticsStocksFull>>? = null
        private var measurementUnitCode: JsonField<String> = JsonMissing.of()
        private var nationalStockNumber: JsonField<String> = JsonMissing.of()
        private var partNumber: JsonField<String> = JsonMissing.of()
        private var requestVerifier: JsonField<String> = JsonMissing.of()
        private var supplyDocumentNumber: JsonField<String> = JsonMissing.of()
        private var technicalOrderText: JsonField<String> = JsonMissing.of()
        private var workUnitCode: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logisticsPartsFull: LogisticsPartsFull) =
            apply {
                figureNumber = logisticsPartsFull.figureNumber
                indexNumber = logisticsPartsFull.indexNumber
                locationVerifier = logisticsPartsFull.locationVerifier
                logisticsStocks = logisticsPartsFull.logisticsStocks.map { it.toMutableList() }
                measurementUnitCode = logisticsPartsFull.measurementUnitCode
                nationalStockNumber = logisticsPartsFull.nationalStockNumber
                partNumber = logisticsPartsFull.partNumber
                requestVerifier = logisticsPartsFull.requestVerifier
                supplyDocumentNumber = logisticsPartsFull.supplyDocumentNumber
                technicalOrderText = logisticsPartsFull.technicalOrderText
                workUnitCode = logisticsPartsFull.workUnitCode
                additionalProperties = logisticsPartsFull.additionalProperties.toMutableMap()
            }

        /** Technical order manual figure number for the requested / supplied part. */
        fun figureNumber(figureNumber: String) = figureNumber(JsonField.of(figureNumber))

        /**
         * Sets [Builder.figureNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.figureNumber] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun figureNumber(figureNumber: JsonField<String>) =
            apply {
                this.figureNumber = figureNumber
            }

        /** Technical order manual index number for the requested part. */
        fun indexNumber(indexNumber: String) = indexNumber(JsonField.of(indexNumber))

        /**
         * Sets [Builder.indexNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexNumber] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun indexNumber(indexNumber: JsonField<String>) =
            apply {
                this.indexNumber = indexNumber
            }

        /** The person who validated that the sourced location has, and can supply, the requested parts. */
        fun locationVerifier(locationVerifier: String) = locationVerifier(JsonField.of(locationVerifier))

        /**
         * Sets [Builder.locationVerifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locationVerifier] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun locationVerifier(locationVerifier: JsonField<String>) =
            apply {
                this.locationVerifier = locationVerifier
            }

        /** The supply stocks for this support item. */
        fun logisticsStocks(logisticsStocks: List<LogisticsStocksFull>) = logisticsStocks(JsonField.of(logisticsStocks))

        /**
         * Sets [Builder.logisticsStocks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logisticsStocks] with a well-typed `List<LogisticsStocksFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun logisticsStocks(logisticsStocks: JsonField<List<LogisticsStocksFull>>) =
            apply {
                this.logisticsStocks = logisticsStocks.map { it.toMutableList() }
            }

        /**
         * Adds a single [LogisticsStocksFull] to [logisticsStocks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLogisticsStock(logisticsStock: LogisticsStocksFull) =
            apply {
                logisticsStocks = (logisticsStocks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("logisticsStocks", it).add(logisticsStock)
                }
            }

        /** Code for a unit of measurement. */
        fun measurementUnitCode(measurementUnitCode: String) = measurementUnitCode(JsonField.of(measurementUnitCode))

        /**
         * Sets [Builder.measurementUnitCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.measurementUnitCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun measurementUnitCode(measurementUnitCode: JsonField<String>) =
            apply {
                this.measurementUnitCode = measurementUnitCode
            }

        /** The National Stock Number of the part being requested or supplied. */
        fun nationalStockNumber(nationalStockNumber: String) = nationalStockNumber(JsonField.of(nationalStockNumber))

        /**
         * Sets [Builder.nationalStockNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nationalStockNumber] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nationalStockNumber(nationalStockNumber: JsonField<String>) =
            apply {
                this.nationalStockNumber = nationalStockNumber
            }

        /** Requested or supplied part number. */
        fun partNumber(partNumber: String) = partNumber(JsonField.of(partNumber))

        /**
         * Sets [Builder.partNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partNumber] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun partNumber(partNumber: JsonField<String>) =
            apply {
                this.partNumber = partNumber
            }

        /** The person who validated the request for parts. */
        fun requestVerifier(requestVerifier: String) = requestVerifier(JsonField.of(requestVerifier))

        /**
         * Sets [Builder.requestVerifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestVerifier] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestVerifier(requestVerifier: JsonField<String>) =
            apply {
                this.requestVerifier = requestVerifier
            }

        /** The supply document number. */
        fun supplyDocumentNumber(supplyDocumentNumber: String) = supplyDocumentNumber(JsonField.of(supplyDocumentNumber))

        /**
         * Sets [Builder.supplyDocumentNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supplyDocumentNumber] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun supplyDocumentNumber(supplyDocumentNumber: JsonField<String>) =
            apply {
                this.supplyDocumentNumber = supplyDocumentNumber
            }

        /** Indicates the specified Technical Order manual holding the aircraft information for use in diagnosing a problem or condition. */
        fun technicalOrderText(technicalOrderText: String) = technicalOrderText(JsonField.of(technicalOrderText))

        /**
         * Sets [Builder.technicalOrderText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.technicalOrderText] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun technicalOrderText(technicalOrderText: JsonField<String>) =
            apply {
                this.technicalOrderText = technicalOrderText
            }

        /** Work Unit Code (WUC), or for some aircraft types, the Reference Designator. */
        fun workUnitCode(workUnitCode: String) = workUnitCode(JsonField.of(workUnitCode))

        /**
         * Sets [Builder.workUnitCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workUnitCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun workUnitCode(workUnitCode: JsonField<String>) =
            apply {
                this.workUnitCode = workUnitCode
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
         * Returns an immutable instance of [LogisticsPartsFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogisticsPartsFull =
            LogisticsPartsFull(
              figureNumber,
              indexNumber,
              locationVerifier,
              (logisticsStocks ?: JsonMissing.of()).map { it.toImmutable() },
              measurementUnitCode,
              nationalStockNumber,
              partNumber,
              requestVerifier,
              supplyDocumentNumber,
              technicalOrderText,
              workUnitCode,
              additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogisticsPartsFull =
        apply {
            if (validated) {
              return@apply
            }

            figureNumber()
            indexNumber()
            locationVerifier()
            logisticsStocks().ifPresent { it.forEach { it.validate() } }
            measurementUnitCode()
            nationalStockNumber()
            partNumber()
            requestVerifier()
            supplyDocumentNumber()
            technicalOrderText()
            workUnitCode()
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
    internal fun validity(): Int = (if (figureNumber.asKnown().isPresent) 1 else 0) + (if (indexNumber.asKnown().isPresent) 1 else 0) + (if (locationVerifier.asKnown().isPresent) 1 else 0) + (logisticsStocks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (measurementUnitCode.asKnown().isPresent) 1 else 0) + (if (nationalStockNumber.asKnown().isPresent) 1 else 0) + (if (partNumber.asKnown().isPresent) 1 else 0) + (if (requestVerifier.asKnown().isPresent) 1 else 0) + (if (supplyDocumentNumber.asKnown().isPresent) 1 else 0) + (if (technicalOrderText.asKnown().isPresent) 1 else 0) + (if (workUnitCode.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is LogisticsPartsFull && figureNumber == other.figureNumber && indexNumber == other.indexNumber && locationVerifier == other.locationVerifier && logisticsStocks == other.logisticsStocks && measurementUnitCode == other.measurementUnitCode && nationalStockNumber == other.nationalStockNumber && partNumber == other.partNumber && requestVerifier == other.requestVerifier && supplyDocumentNumber == other.supplyDocumentNumber && technicalOrderText == other.technicalOrderText && workUnitCode == other.workUnitCode && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(figureNumber, indexNumber, locationVerifier, logisticsStocks, measurementUnitCode, nationalStockNumber, partNumber, requestVerifier, supplyDocumentNumber, technicalOrderText, workUnitCode, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "LogisticsPartsFull{figureNumber=$figureNumber, indexNumber=$indexNumber, locationVerifier=$locationVerifier, logisticsStocks=$logisticsStocks, measurementUnitCode=$measurementUnitCode, nationalStockNumber=$nationalStockNumber, partNumber=$partNumber, requestVerifier=$requestVerifier, supplyDocumentNumber=$supplyDocumentNumber, technicalOrderText=$technicalOrderText, workUnitCode=$workUnitCode, additionalProperties=$additionalProperties}"
}

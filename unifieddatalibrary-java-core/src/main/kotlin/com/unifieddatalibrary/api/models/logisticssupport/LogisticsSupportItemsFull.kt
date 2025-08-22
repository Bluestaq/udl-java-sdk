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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Support items associated with this LogisticsSupport record. */
class LogisticsSupportItemsFull
private constructor(
    private val cannibalized: JsonField<Boolean>,
    private val deployPlanNumber: JsonField<String>,
    private val description: JsonField<String>,
    private val itemLastChangedDate: JsonField<OffsetDateTime>,
    private val jobControlNumber: JsonField<String>,
    private val logisticsParts: JsonField<List<LogisticsPartsFull>>,
    private val logisticsRemarks: JsonField<List<LogisticsRemarksFull>>,
    private val logisticsSpecialties: JsonField<List<LogisticsSpecialtiesFull>>,
    private val quantity: JsonField<Int>,
    private val readyTime: JsonField<OffsetDateTime>,
    private val receivedTime: JsonField<OffsetDateTime>,
    private val recoveryRequestTypeCode: JsonField<String>,
    private val redeployPlanNumber: JsonField<String>,
    private val redeployShipmentUnitId: JsonField<String>,
    private val requestNumber: JsonField<String>,
    private val resupportFlag: JsonField<Boolean>,
    private val shipmentUnitId: JsonField<String>,
    private val siPoc: JsonField<String>,
    private val sourceIcao: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cannibalized")
        @ExcludeMissing
        cannibalized: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("deployPlanNumber")
        @ExcludeMissing
        deployPlanNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("itemLastChangedDate")
        @ExcludeMissing
        itemLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("jobControlNumber")
        @ExcludeMissing
        jobControlNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logisticsParts")
        @ExcludeMissing
        logisticsParts: JsonField<List<LogisticsPartsFull>> = JsonMissing.of(),
        @JsonProperty("logisticsRemarks")
        @ExcludeMissing
        logisticsRemarks: JsonField<List<LogisticsRemarksFull>> = JsonMissing.of(),
        @JsonProperty("logisticsSpecialties")
        @ExcludeMissing
        logisticsSpecialties: JsonField<List<LogisticsSpecialtiesFull>> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("readyTime")
        @ExcludeMissing
        readyTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("receivedTime")
        @ExcludeMissing
        receivedTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("recoveryRequestTypeCode")
        @ExcludeMissing
        recoveryRequestTypeCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("redeployPlanNumber")
        @ExcludeMissing
        redeployPlanNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("redeployShipmentUnitId")
        @ExcludeMissing
        redeployShipmentUnitId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requestNumber")
        @ExcludeMissing
        requestNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resupportFlag")
        @ExcludeMissing
        resupportFlag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("shipmentUnitId")
        @ExcludeMissing
        shipmentUnitId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("siPOC") @ExcludeMissing siPoc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceICAO") @ExcludeMissing sourceIcao: JsonField<String> = JsonMissing.of(),
    ) : this(
        cannibalized,
        deployPlanNumber,
        description,
        itemLastChangedDate,
        jobControlNumber,
        logisticsParts,
        logisticsRemarks,
        logisticsSpecialties,
        quantity,
        readyTime,
        receivedTime,
        recoveryRequestTypeCode,
        redeployPlanNumber,
        redeployShipmentUnitId,
        requestNumber,
        resupportFlag,
        shipmentUnitId,
        siPoc,
        sourceIcao,
        mutableMapOf(),
    )

    /**
     * This element indicates whether or not the supplied item is contained within another item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cannibalized(): Optional<Boolean> = cannibalized.getOptional("cannibalized")

    /**
     * System generated reference id for the transportation plan. Format: TXXXXXNNNN T -
     * Transportation, Sequence Number, Node Id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun deployPlanNumber(): Optional<String> = deployPlanNumber.getOptional("deployPlanNumber")

    /**
     * The technical order name of the part ordered.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The last time this supported item was updated, in ISO 8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun itemLastChangedDate(): Optional<OffsetDateTime> =
        itemLastChangedDate.getOptional("itemLastChangedDate")

    /**
     * A number assigned by Job Control to monitor and record maintenance actions required to
     * correct the associated aircraft maintenance discrepancy. It is seven, nine or twelve
     * characters, depending on the base-specific numbering scheme. If seven characters: characters
     * 1-3 are Julian date, 4-7 are sequence numbers. If nine characters: characters 1-2 are last
     * two digits of the year, characters 3-5 are Julian date, 6-9 are sequence numbers. If twelve
     * characters: characters 1-2 are last two digits of the year, 3-5 are Julian date, 6-9 are
     * sequence numbers, and 10-12 are a three-digit supplemental number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun jobControlNumber(): Optional<String> = jobControlNumber.getOptional("jobControlNumber")

    /**
     * The parts associated with this support item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun logisticsParts(): Optional<List<LogisticsPartsFull>> =
        logisticsParts.getOptional("logisticsParts")

    /**
     * Remarks associated with this support item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun logisticsRemarks(): Optional<List<LogisticsRemarksFull>> =
        logisticsRemarks.getOptional("logisticsRemarks")

    /**
     * The specialties required to implement this support item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun logisticsSpecialties(): Optional<List<LogisticsSpecialtiesFull>> =
        logisticsSpecialties.getOptional("logisticsSpecialties")

    /**
     * Military aircraft discrepancy logistics requisition ordered quantity. The quantity of
     * equipment ordered that is required to fix the aircraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun quantity(): Optional<Int> = quantity.getOptional("quantity")

    /**
     * The time the item is ready, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun readyTime(): Optional<OffsetDateTime> = readyTime.getOptional("readyTime")

    /**
     * The time the item is received, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun receivedTime(): Optional<OffsetDateTime> = receivedTime.getOptional("receivedTime")

    /**
     * The type of recovery request needed. Contact the source provider for details.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun recoveryRequestTypeCode(): Optional<String> =
        recoveryRequestTypeCode.getOptional("recoveryRequestTypeCode")

    /**
     * System generated reference id for the transportation plan. Format: TXXXXXNNNN T -
     * Transportation, Sequence Number, Node Id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun redeployPlanNumber(): Optional<String> =
        redeployPlanNumber.getOptional("redeployPlanNumber")

    /**
     * This is the Redeploy (return) Transportation Control Number/Tracking Reference Number for the
     * selected item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun redeployShipmentUnitId(): Optional<String> =
        redeployShipmentUnitId.getOptional("redeployShipmentUnitId")

    /**
     * The request or record number for this item type (Equipent, Part, or MRT).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun requestNumber(): Optional<String> = requestNumber.getOptional("requestNumber")

    /**
     * This element indicates if the supplied item is characterized as additional support.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun resupportFlag(): Optional<Boolean> = resupportFlag.getOptional("resupportFlag")

    /**
     * Shipment Unit Identifier is the Transportation Control Number (TCN) for shipping that piece
     * of equipment being requested.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shipmentUnitId(): Optional<String> = shipmentUnitId.getOptional("shipmentUnitId")

    /**
     * The point of contact is a free text field to add information about the individual(s) with
     * knowledge of the referenced requested or supplied item(s). The default value for this field
     * is the last name, first name, and middle initial of the operator who created the records
     * and/or generated the transaction.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun siPoc(): Optional<String> = siPoc.getOptional("siPOC")

    /**
     * The code that represents the International Civil Aviation Organization (ICAO) designations of
     * an airport.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceIcao(): Optional<String> = sourceIcao.getOptional("sourceICAO")

    /**
     * Returns the raw JSON value of [cannibalized].
     *
     * Unlike [cannibalized], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cannibalized")
    @ExcludeMissing
    fun _cannibalized(): JsonField<Boolean> = cannibalized

    /**
     * Returns the raw JSON value of [deployPlanNumber].
     *
     * Unlike [deployPlanNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deployPlanNumber")
    @ExcludeMissing
    fun _deployPlanNumber(): JsonField<String> = deployPlanNumber

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [itemLastChangedDate].
     *
     * Unlike [itemLastChangedDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("itemLastChangedDate")
    @ExcludeMissing
    fun _itemLastChangedDate(): JsonField<OffsetDateTime> = itemLastChangedDate

    /**
     * Returns the raw JSON value of [jobControlNumber].
     *
     * Unlike [jobControlNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("jobControlNumber")
    @ExcludeMissing
    fun _jobControlNumber(): JsonField<String> = jobControlNumber

    /**
     * Returns the raw JSON value of [logisticsParts].
     *
     * Unlike [logisticsParts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logisticsParts")
    @ExcludeMissing
    fun _logisticsParts(): JsonField<List<LogisticsPartsFull>> = logisticsParts

    /**
     * Returns the raw JSON value of [logisticsRemarks].
     *
     * Unlike [logisticsRemarks], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("logisticsRemarks")
    @ExcludeMissing
    fun _logisticsRemarks(): JsonField<List<LogisticsRemarksFull>> = logisticsRemarks

    /**
     * Returns the raw JSON value of [logisticsSpecialties].
     *
     * Unlike [logisticsSpecialties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("logisticsSpecialties")
    @ExcludeMissing
    fun _logisticsSpecialties(): JsonField<List<LogisticsSpecialtiesFull>> = logisticsSpecialties

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

    /**
     * Returns the raw JSON value of [readyTime].
     *
     * Unlike [readyTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readyTime")
    @ExcludeMissing
    fun _readyTime(): JsonField<OffsetDateTime> = readyTime

    /**
     * Returns the raw JSON value of [receivedTime].
     *
     * Unlike [receivedTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receivedTime")
    @ExcludeMissing
    fun _receivedTime(): JsonField<OffsetDateTime> = receivedTime

    /**
     * Returns the raw JSON value of [recoveryRequestTypeCode].
     *
     * Unlike [recoveryRequestTypeCode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("recoveryRequestTypeCode")
    @ExcludeMissing
    fun _recoveryRequestTypeCode(): JsonField<String> = recoveryRequestTypeCode

    /**
     * Returns the raw JSON value of [redeployPlanNumber].
     *
     * Unlike [redeployPlanNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("redeployPlanNumber")
    @ExcludeMissing
    fun _redeployPlanNumber(): JsonField<String> = redeployPlanNumber

    /**
     * Returns the raw JSON value of [redeployShipmentUnitId].
     *
     * Unlike [redeployShipmentUnitId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("redeployShipmentUnitId")
    @ExcludeMissing
    fun _redeployShipmentUnitId(): JsonField<String> = redeployShipmentUnitId

    /**
     * Returns the raw JSON value of [requestNumber].
     *
     * Unlike [requestNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestNumber")
    @ExcludeMissing
    fun _requestNumber(): JsonField<String> = requestNumber

    /**
     * Returns the raw JSON value of [resupportFlag].
     *
     * Unlike [resupportFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resupportFlag")
    @ExcludeMissing
    fun _resupportFlag(): JsonField<Boolean> = resupportFlag

    /**
     * Returns the raw JSON value of [shipmentUnitId].
     *
     * Unlike [shipmentUnitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipmentUnitId")
    @ExcludeMissing
    fun _shipmentUnitId(): JsonField<String> = shipmentUnitId

    /**
     * Returns the raw JSON value of [siPoc].
     *
     * Unlike [siPoc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("siPOC") @ExcludeMissing fun _siPoc(): JsonField<String> = siPoc

    /**
     * Returns the raw JSON value of [sourceIcao].
     *
     * Unlike [sourceIcao], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceICAO") @ExcludeMissing fun _sourceIcao(): JsonField<String> = sourceIcao

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
         * Returns a mutable builder for constructing an instance of [LogisticsSupportItemsFull].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogisticsSupportItemsFull]. */
    class Builder internal constructor() {

        private var cannibalized: JsonField<Boolean> = JsonMissing.of()
        private var deployPlanNumber: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var itemLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var jobControlNumber: JsonField<String> = JsonMissing.of()
        private var logisticsParts: JsonField<MutableList<LogisticsPartsFull>>? = null
        private var logisticsRemarks: JsonField<MutableList<LogisticsRemarksFull>>? = null
        private var logisticsSpecialties: JsonField<MutableList<LogisticsSpecialtiesFull>>? = null
        private var quantity: JsonField<Int> = JsonMissing.of()
        private var readyTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var receivedTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var recoveryRequestTypeCode: JsonField<String> = JsonMissing.of()
        private var redeployPlanNumber: JsonField<String> = JsonMissing.of()
        private var redeployShipmentUnitId: JsonField<String> = JsonMissing.of()
        private var requestNumber: JsonField<String> = JsonMissing.of()
        private var resupportFlag: JsonField<Boolean> = JsonMissing.of()
        private var shipmentUnitId: JsonField<String> = JsonMissing.of()
        private var siPoc: JsonField<String> = JsonMissing.of()
        private var sourceIcao: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logisticsSupportItemsFull: LogisticsSupportItemsFull) = apply {
            cannibalized = logisticsSupportItemsFull.cannibalized
            deployPlanNumber = logisticsSupportItemsFull.deployPlanNumber
            description = logisticsSupportItemsFull.description
            itemLastChangedDate = logisticsSupportItemsFull.itemLastChangedDate
            jobControlNumber = logisticsSupportItemsFull.jobControlNumber
            logisticsParts = logisticsSupportItemsFull.logisticsParts.map { it.toMutableList() }
            logisticsRemarks = logisticsSupportItemsFull.logisticsRemarks.map { it.toMutableList() }
            logisticsSpecialties =
                logisticsSupportItemsFull.logisticsSpecialties.map { it.toMutableList() }
            quantity = logisticsSupportItemsFull.quantity
            readyTime = logisticsSupportItemsFull.readyTime
            receivedTime = logisticsSupportItemsFull.receivedTime
            recoveryRequestTypeCode = logisticsSupportItemsFull.recoveryRequestTypeCode
            redeployPlanNumber = logisticsSupportItemsFull.redeployPlanNumber
            redeployShipmentUnitId = logisticsSupportItemsFull.redeployShipmentUnitId
            requestNumber = logisticsSupportItemsFull.requestNumber
            resupportFlag = logisticsSupportItemsFull.resupportFlag
            shipmentUnitId = logisticsSupportItemsFull.shipmentUnitId
            siPoc = logisticsSupportItemsFull.siPoc
            sourceIcao = logisticsSupportItemsFull.sourceIcao
            additionalProperties = logisticsSupportItemsFull.additionalProperties.toMutableMap()
        }

        /**
         * This element indicates whether or not the supplied item is contained within another item.
         */
        fun cannibalized(cannibalized: Boolean) = cannibalized(JsonField.of(cannibalized))

        /**
         * Sets [Builder.cannibalized] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cannibalized] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cannibalized(cannibalized: JsonField<Boolean>) = apply {
            this.cannibalized = cannibalized
        }

        /**
         * System generated reference id for the transportation plan. Format: TXXXXXNNNN T -
         * Transportation, Sequence Number, Node Id.
         */
        fun deployPlanNumber(deployPlanNumber: String) =
            deployPlanNumber(JsonField.of(deployPlanNumber))

        /**
         * Sets [Builder.deployPlanNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deployPlanNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deployPlanNumber(deployPlanNumber: JsonField<String>) = apply {
            this.deployPlanNumber = deployPlanNumber
        }

        /** The technical order name of the part ordered. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The last time this supported item was updated, in ISO 8601 UTC format with millisecond
         * precision.
         */
        fun itemLastChangedDate(itemLastChangedDate: OffsetDateTime) =
            itemLastChangedDate(JsonField.of(itemLastChangedDate))

        /**
         * Sets [Builder.itemLastChangedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.itemLastChangedDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun itemLastChangedDate(itemLastChangedDate: JsonField<OffsetDateTime>) = apply {
            this.itemLastChangedDate = itemLastChangedDate
        }

        /**
         * A number assigned by Job Control to monitor and record maintenance actions required to
         * correct the associated aircraft maintenance discrepancy. It is seven, nine or twelve
         * characters, depending on the base-specific numbering scheme. If seven characters:
         * characters 1-3 are Julian date, 4-7 are sequence numbers. If nine characters: characters
         * 1-2 are last two digits of the year, characters 3-5 are Julian date, 6-9 are sequence
         * numbers. If twelve characters: characters 1-2 are last two digits of the year, 3-5 are
         * Julian date, 6-9 are sequence numbers, and 10-12 are a three-digit supplemental number.
         */
        fun jobControlNumber(jobControlNumber: String) =
            jobControlNumber(JsonField.of(jobControlNumber))

        /**
         * Sets [Builder.jobControlNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobControlNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jobControlNumber(jobControlNumber: JsonField<String>) = apply {
            this.jobControlNumber = jobControlNumber
        }

        /** The parts associated with this support item. */
        fun logisticsParts(logisticsParts: List<LogisticsPartsFull>) =
            logisticsParts(JsonField.of(logisticsParts))

        /**
         * Sets [Builder.logisticsParts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logisticsParts] with a well-typed
         * `List<LogisticsPartsFull>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun logisticsParts(logisticsParts: JsonField<List<LogisticsPartsFull>>) = apply {
            this.logisticsParts = logisticsParts.map { it.toMutableList() }
        }

        /**
         * Adds a single [LogisticsPartsFull] to [logisticsParts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLogisticsPart(logisticsPart: LogisticsPartsFull) = apply {
            logisticsParts =
                (logisticsParts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("logisticsParts", it).add(logisticsPart)
                }
        }

        /** Remarks associated with this support item. */
        fun logisticsRemarks(logisticsRemarks: List<LogisticsRemarksFull>) =
            logisticsRemarks(JsonField.of(logisticsRemarks))

        /**
         * Sets [Builder.logisticsRemarks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logisticsRemarks] with a well-typed
         * `List<LogisticsRemarksFull>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun logisticsRemarks(logisticsRemarks: JsonField<List<LogisticsRemarksFull>>) = apply {
            this.logisticsRemarks = logisticsRemarks.map { it.toMutableList() }
        }

        /**
         * Adds a single [LogisticsRemarksFull] to [logisticsRemarks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLogisticsRemark(logisticsRemark: LogisticsRemarksFull) = apply {
            logisticsRemarks =
                (logisticsRemarks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("logisticsRemarks", it).add(logisticsRemark)
                }
        }

        /** The specialties required to implement this support item. */
        fun logisticsSpecialties(logisticsSpecialties: List<LogisticsSpecialtiesFull>) =
            logisticsSpecialties(JsonField.of(logisticsSpecialties))

        /**
         * Sets [Builder.logisticsSpecialties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logisticsSpecialties] with a well-typed
         * `List<LogisticsSpecialtiesFull>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun logisticsSpecialties(logisticsSpecialties: JsonField<List<LogisticsSpecialtiesFull>>) =
            apply {
                this.logisticsSpecialties = logisticsSpecialties.map { it.toMutableList() }
            }

        /**
         * Adds a single [LogisticsSpecialtiesFull] to [logisticsSpecialties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLogisticsSpecialty(logisticsSpecialty: LogisticsSpecialtiesFull) = apply {
            logisticsSpecialties =
                (logisticsSpecialties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("logisticsSpecialties", it).add(logisticsSpecialty)
                }
        }

        /**
         * Military aircraft discrepancy logistics requisition ordered quantity. The quantity of
         * equipment ordered that is required to fix the aircraft.
         */
        fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

        /** The time the item is ready, in ISO 8601 UTC format with millisecond precision. */
        fun readyTime(readyTime: OffsetDateTime) = readyTime(JsonField.of(readyTime))

        /**
         * Sets [Builder.readyTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readyTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readyTime(readyTime: JsonField<OffsetDateTime>) = apply { this.readyTime = readyTime }

        /** The time the item is received, in ISO 8601 UTC format with millisecond precision. */
        fun receivedTime(receivedTime: OffsetDateTime) = receivedTime(JsonField.of(receivedTime))

        /**
         * Sets [Builder.receivedTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivedTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receivedTime(receivedTime: JsonField<OffsetDateTime>) = apply {
            this.receivedTime = receivedTime
        }

        /** The type of recovery request needed. Contact the source provider for details. */
        fun recoveryRequestTypeCode(recoveryRequestTypeCode: String) =
            recoveryRequestTypeCode(JsonField.of(recoveryRequestTypeCode))

        /**
         * Sets [Builder.recoveryRequestTypeCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recoveryRequestTypeCode] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recoveryRequestTypeCode(recoveryRequestTypeCode: JsonField<String>) = apply {
            this.recoveryRequestTypeCode = recoveryRequestTypeCode
        }

        /**
         * System generated reference id for the transportation plan. Format: TXXXXXNNNN T -
         * Transportation, Sequence Number, Node Id.
         */
        fun redeployPlanNumber(redeployPlanNumber: String) =
            redeployPlanNumber(JsonField.of(redeployPlanNumber))

        /**
         * Sets [Builder.redeployPlanNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redeployPlanNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun redeployPlanNumber(redeployPlanNumber: JsonField<String>) = apply {
            this.redeployPlanNumber = redeployPlanNumber
        }

        /**
         * This is the Redeploy (return) Transportation Control Number/Tracking Reference Number for
         * the selected item.
         */
        fun redeployShipmentUnitId(redeployShipmentUnitId: String) =
            redeployShipmentUnitId(JsonField.of(redeployShipmentUnitId))

        /**
         * Sets [Builder.redeployShipmentUnitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redeployShipmentUnitId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun redeployShipmentUnitId(redeployShipmentUnitId: JsonField<String>) = apply {
            this.redeployShipmentUnitId = redeployShipmentUnitId
        }

        /** The request or record number for this item type (Equipent, Part, or MRT). */
        fun requestNumber(requestNumber: String) = requestNumber(JsonField.of(requestNumber))

        /**
         * Sets [Builder.requestNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestNumber(requestNumber: JsonField<String>) = apply {
            this.requestNumber = requestNumber
        }

        /** This element indicates if the supplied item is characterized as additional support. */
        fun resupportFlag(resupportFlag: Boolean) = resupportFlag(JsonField.of(resupportFlag))

        /**
         * Sets [Builder.resupportFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resupportFlag] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resupportFlag(resupportFlag: JsonField<Boolean>) = apply {
            this.resupportFlag = resupportFlag
        }

        /**
         * Shipment Unit Identifier is the Transportation Control Number (TCN) for shipping that
         * piece of equipment being requested.
         */
        fun shipmentUnitId(shipmentUnitId: String) = shipmentUnitId(JsonField.of(shipmentUnitId))

        /**
         * Sets [Builder.shipmentUnitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipmentUnitId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shipmentUnitId(shipmentUnitId: JsonField<String>) = apply {
            this.shipmentUnitId = shipmentUnitId
        }

        /**
         * The point of contact is a free text field to add information about the individual(s) with
         * knowledge of the referenced requested or supplied item(s). The default value for this
         * field is the last name, first name, and middle initial of the operator who created the
         * records and/or generated the transaction.
         */
        fun siPoc(siPoc: String) = siPoc(JsonField.of(siPoc))

        /**
         * Sets [Builder.siPoc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.siPoc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun siPoc(siPoc: JsonField<String>) = apply { this.siPoc = siPoc }

        /**
         * The code that represents the International Civil Aviation Organization (ICAO)
         * designations of an airport.
         */
        fun sourceIcao(sourceIcao: String) = sourceIcao(JsonField.of(sourceIcao))

        /**
         * Sets [Builder.sourceIcao] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceIcao] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceIcao(sourceIcao: JsonField<String>) = apply { this.sourceIcao = sourceIcao }

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
         * Returns an immutable instance of [LogisticsSupportItemsFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogisticsSupportItemsFull =
            LogisticsSupportItemsFull(
                cannibalized,
                deployPlanNumber,
                description,
                itemLastChangedDate,
                jobControlNumber,
                (logisticsParts ?: JsonMissing.of()).map { it.toImmutable() },
                (logisticsRemarks ?: JsonMissing.of()).map { it.toImmutable() },
                (logisticsSpecialties ?: JsonMissing.of()).map { it.toImmutable() },
                quantity,
                readyTime,
                receivedTime,
                recoveryRequestTypeCode,
                redeployPlanNumber,
                redeployShipmentUnitId,
                requestNumber,
                resupportFlag,
                shipmentUnitId,
                siPoc,
                sourceIcao,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogisticsSupportItemsFull = apply {
        if (validated) {
            return@apply
        }

        cannibalized()
        deployPlanNumber()
        description()
        itemLastChangedDate()
        jobControlNumber()
        logisticsParts().ifPresent { it.forEach { it.validate() } }
        logisticsRemarks().ifPresent { it.forEach { it.validate() } }
        logisticsSpecialties().ifPresent { it.forEach { it.validate() } }
        quantity()
        readyTime()
        receivedTime()
        recoveryRequestTypeCode()
        redeployPlanNumber()
        redeployShipmentUnitId()
        requestNumber()
        resupportFlag()
        shipmentUnitId()
        siPoc()
        sourceIcao()
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
        (if (cannibalized.asKnown().isPresent) 1 else 0) +
            (if (deployPlanNumber.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (itemLastChangedDate.asKnown().isPresent) 1 else 0) +
            (if (jobControlNumber.asKnown().isPresent) 1 else 0) +
            (logisticsParts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (logisticsRemarks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (logisticsSpecialties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (if (readyTime.asKnown().isPresent) 1 else 0) +
            (if (receivedTime.asKnown().isPresent) 1 else 0) +
            (if (recoveryRequestTypeCode.asKnown().isPresent) 1 else 0) +
            (if (redeployPlanNumber.asKnown().isPresent) 1 else 0) +
            (if (redeployShipmentUnitId.asKnown().isPresent) 1 else 0) +
            (if (requestNumber.asKnown().isPresent) 1 else 0) +
            (if (resupportFlag.asKnown().isPresent) 1 else 0) +
            (if (shipmentUnitId.asKnown().isPresent) 1 else 0) +
            (if (siPoc.asKnown().isPresent) 1 else 0) +
            (if (sourceIcao.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogisticsSupportItemsFull &&
            cannibalized == other.cannibalized &&
            deployPlanNumber == other.deployPlanNumber &&
            description == other.description &&
            itemLastChangedDate == other.itemLastChangedDate &&
            jobControlNumber == other.jobControlNumber &&
            logisticsParts == other.logisticsParts &&
            logisticsRemarks == other.logisticsRemarks &&
            logisticsSpecialties == other.logisticsSpecialties &&
            quantity == other.quantity &&
            readyTime == other.readyTime &&
            receivedTime == other.receivedTime &&
            recoveryRequestTypeCode == other.recoveryRequestTypeCode &&
            redeployPlanNumber == other.redeployPlanNumber &&
            redeployShipmentUnitId == other.redeployShipmentUnitId &&
            requestNumber == other.requestNumber &&
            resupportFlag == other.resupportFlag &&
            shipmentUnitId == other.shipmentUnitId &&
            siPoc == other.siPoc &&
            sourceIcao == other.sourceIcao &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cannibalized,
            deployPlanNumber,
            description,
            itemLastChangedDate,
            jobControlNumber,
            logisticsParts,
            logisticsRemarks,
            logisticsSpecialties,
            quantity,
            readyTime,
            receivedTime,
            recoveryRequestTypeCode,
            redeployPlanNumber,
            redeployShipmentUnitId,
            requestNumber,
            resupportFlag,
            shipmentUnitId,
            siPoc,
            sourceIcao,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LogisticsSupportItemsFull{cannibalized=$cannibalized, deployPlanNumber=$deployPlanNumber, description=$description, itemLastChangedDate=$itemLastChangedDate, jobControlNumber=$jobControlNumber, logisticsParts=$logisticsParts, logisticsRemarks=$logisticsRemarks, logisticsSpecialties=$logisticsSpecialties, quantity=$quantity, readyTime=$readyTime, receivedTime=$receivedTime, recoveryRequestTypeCode=$recoveryRequestTypeCode, redeployPlanNumber=$redeployPlanNumber, redeployShipmentUnitId=$redeployShipmentUnitId, requestNumber=$requestNumber, resupportFlag=$resupportFlag, shipmentUnitId=$shipmentUnitId, siPoc=$siPoc, sourceIcao=$sourceIcao, additionalProperties=$additionalProperties}"
}

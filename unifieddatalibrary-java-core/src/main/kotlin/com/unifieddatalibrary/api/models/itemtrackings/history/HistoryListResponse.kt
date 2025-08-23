// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.itemtrackings.history

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

class HistoryListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val scanCode: JsonField<String>,
    private val scannerId: JsonField<String>,
    private val source: JsonField<String>,
    private val ts: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val dvCode: JsonField<String>,
    private val idItem: JsonField<String>,
    private val keys: JsonField<List<String>>,
    private val lat: JsonField<Double>,
    private val lon: JsonField<Double>,
    private val notes: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val scanType: JsonField<String>,
    private val scGenTool: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val type: JsonField<String>,
    private val values: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("scanCode") @ExcludeMissing scanCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scannerId") @ExcludeMissing scannerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ts") @ExcludeMissing ts: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dvCode") @ExcludeMissing dvCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idItem") @ExcludeMissing idItem: JsonField<String> = JsonMissing.of(),
        @JsonProperty("keys") @ExcludeMissing keys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scanType") @ExcludeMissing scanType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scGenTool") @ExcludeMissing scGenTool: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("values") @ExcludeMissing values: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        scanCode,
        scannerId,
        source,
        ts,
        id,
        createdAt,
        createdBy,
        dvCode,
        idItem,
        keys,
        lat,
        lon,
        notes,
        origin,
        origNetwork,
        scanType,
        scGenTool,
        sourceDl,
        type,
        values,
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
     * The tracking identifier of an item or person. May be similar in representation of a barcode
     * or UPC.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scanCode(): String = scanCode.getRequired("scanCode")

    /**
     * The ID of the scanner or input device.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scannerId(): String = scannerId.getRequired("scannerId")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The timestamp of the scan, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ts(): OffsetDateTime = ts.getRequired("ts")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

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
     * The United States distinguished visitor code of the person scanned, only applicable to
     * people.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dvCode(): Optional<String> = dvCode.getOptional("dvCode")

    /**
     * The UDL ID of the item this record is associated with.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idItem(): Optional<String> = idItem.getOptional("idItem")

    /**
     * Array of keys that may be associated with this tracked item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun keys(): Optional<List<String>> = keys.getOptional("keys")

    /**
     * WGS84 latitude where the item was scanned, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lat(): Optional<Double> = lat.getOptional("lat")

    /**
     * WGS84 longitude where the item was scanned, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lon(): Optional<Double> = lon.getOptional("lon")

    /**
     * Optional notes or comments about the tracking data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

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
     * The type of scan for tracking the item within it's journey (e.g. IN, OUT, RECEIVED,
     * DELIVERED, TRANSIT, ABANDONDED, REFUSED, UNABLE, RETURNED, HELD, OTHER). For example,
     * received and delivered are for when an item is received from or delivered to the end
     * customer. In and out are for stops in between such as being loaded on an airplane or received
     * at a warehouse.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun scanType(): Optional<String> = scanType.getOptional("scanType")

    /**
     * The algorithm name or standard that generated the scanCode (e.g. UPC-A, EAN-13, GTIN, SSCC,
     * bID, JAN, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun scGenTool(): Optional<String> = scGenTool.getOptional("scGenTool")

    /**
     * The source data library from which this record was received. This could be a remote or
     * tactical UDL or another data library. If null, the record should be assumed to have
     * originated from the primary Enterprise UDL.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

    /**
     * The type of item that is being scanned (e.g. CARGO, PERSON, MAIL, MICAP, OTHER).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Array of values for the keys that may be associated to this tracked item. The entries in this
     * array must correspond to the position index in the keys array. This array must be the same
     * length as keys.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun values(): Optional<List<String>> = values.getOptional("values")

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
     * Returns the raw JSON value of [scanCode].
     *
     * Unlike [scanCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scanCode") @ExcludeMissing fun _scanCode(): JsonField<String> = scanCode

    /**
     * Returns the raw JSON value of [scannerId].
     *
     * Unlike [scannerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scannerId") @ExcludeMissing fun _scannerId(): JsonField<String> = scannerId

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [ts].
     *
     * Unlike [ts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ts") @ExcludeMissing fun _ts(): JsonField<OffsetDateTime> = ts

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [dvCode].
     *
     * Unlike [dvCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dvCode") @ExcludeMissing fun _dvCode(): JsonField<String> = dvCode

    /**
     * Returns the raw JSON value of [idItem].
     *
     * Unlike [idItem], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idItem") @ExcludeMissing fun _idItem(): JsonField<String> = idItem

    /**
     * Returns the raw JSON value of [keys].
     *
     * Unlike [keys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("keys") @ExcludeMissing fun _keys(): JsonField<List<String>> = keys

    /**
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

    /**
     * Returns the raw JSON value of [lon].
     *
     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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
     * Returns the raw JSON value of [scanType].
     *
     * Unlike [scanType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scanType") @ExcludeMissing fun _scanType(): JsonField<String> = scanType

    /**
     * Returns the raw JSON value of [scGenTool].
     *
     * Unlike [scGenTool], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scGenTool") @ExcludeMissing fun _scGenTool(): JsonField<String> = scGenTool

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [values].
     *
     * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

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
         * Returns a mutable builder for constructing an instance of [HistoryListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .scanCode()
         * .scannerId()
         * .source()
         * .ts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HistoryListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var scanCode: JsonField<String>? = null
        private var scannerId: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var ts: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dvCode: JsonField<String> = JsonMissing.of()
        private var idItem: JsonField<String> = JsonMissing.of()
        private var keys: JsonField<MutableList<String>>? = null
        private var lat: JsonField<Double> = JsonMissing.of()
        private var lon: JsonField<Double> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var scanType: JsonField<String> = JsonMissing.of()
        private var scGenTool: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var values: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(historyListResponse: HistoryListResponse) = apply {
            classificationMarking = historyListResponse.classificationMarking
            dataMode = historyListResponse.dataMode
            scanCode = historyListResponse.scanCode
            scannerId = historyListResponse.scannerId
            source = historyListResponse.source
            ts = historyListResponse.ts
            id = historyListResponse.id
            createdAt = historyListResponse.createdAt
            createdBy = historyListResponse.createdBy
            dvCode = historyListResponse.dvCode
            idItem = historyListResponse.idItem
            keys = historyListResponse.keys.map { it.toMutableList() }
            lat = historyListResponse.lat
            lon = historyListResponse.lon
            notes = historyListResponse.notes
            origin = historyListResponse.origin
            origNetwork = historyListResponse.origNetwork
            scanType = historyListResponse.scanType
            scGenTool = historyListResponse.scGenTool
            sourceDl = historyListResponse.sourceDl
            type = historyListResponse.type
            values = historyListResponse.values.map { it.toMutableList() }
            additionalProperties = historyListResponse.additionalProperties.toMutableMap()
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

        /**
         * The tracking identifier of an item or person. May be similar in representation of a
         * barcode or UPC.
         */
        fun scanCode(scanCode: String) = scanCode(JsonField.of(scanCode))

        /**
         * Sets [Builder.scanCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scanCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scanCode(scanCode: JsonField<String>) = apply { this.scanCode = scanCode }

        /** The ID of the scanner or input device. */
        fun scannerId(scannerId: String) = scannerId(JsonField.of(scannerId))

        /**
         * Sets [Builder.scannerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scannerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scannerId(scannerId: JsonField<String>) = apply { this.scannerId = scannerId }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** The timestamp of the scan, in ISO 8601 UTC format with millisecond precision. */
        fun ts(ts: OffsetDateTime) = ts(JsonField.of(ts))

        /**
         * Sets [Builder.ts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ts] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ts(ts: JsonField<OffsetDateTime>) = apply { this.ts = ts }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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
         * The United States distinguished visitor code of the person scanned, only applicable to
         * people.
         */
        fun dvCode(dvCode: String) = dvCode(JsonField.of(dvCode))

        /**
         * Sets [Builder.dvCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dvCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dvCode(dvCode: JsonField<String>) = apply { this.dvCode = dvCode }

        /** The UDL ID of the item this record is associated with. */
        fun idItem(idItem: String) = idItem(JsonField.of(idItem))

        /**
         * Sets [Builder.idItem] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idItem] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idItem(idItem: JsonField<String>) = apply { this.idItem = idItem }

        /** Array of keys that may be associated with this tracked item. */
        fun keys(keys: List<String>) = keys(JsonField.of(keys))

        /**
         * Sets [Builder.keys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keys] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun keys(keys: JsonField<List<String>>) = apply {
            this.keys = keys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [keys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKey(key: String) = apply {
            keys = (keys ?: JsonField.of(mutableListOf())).also { checkKnown("keys", it).add(key) }
        }

        /** WGS84 latitude where the item was scanned, in degrees. */
        fun lat(lat: Double) = lat(JsonField.of(lat))

        /**
         * Sets [Builder.lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

        /** WGS84 longitude where the item was scanned, in degrees. */
        fun lon(lon: Double) = lon(JsonField.of(lon))

        /**
         * Sets [Builder.lon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

        /** Optional notes or comments about the tracking data. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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

        /**
         * The type of scan for tracking the item within it's journey (e.g. IN, OUT, RECEIVED,
         * DELIVERED, TRANSIT, ABANDONDED, REFUSED, UNABLE, RETURNED, HELD, OTHER). For example,
         * received and delivered are for when an item is received from or delivered to the end
         * customer. In and out are for stops in between such as being loaded on an airplane or
         * received at a warehouse.
         */
        fun scanType(scanType: String) = scanType(JsonField.of(scanType))

        /**
         * Sets [Builder.scanType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scanType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scanType(scanType: JsonField<String>) = apply { this.scanType = scanType }

        /**
         * The algorithm name or standard that generated the scanCode (e.g. UPC-A, EAN-13, GTIN,
         * SSCC, bID, JAN, etc.).
         */
        fun scGenTool(scGenTool: String) = scGenTool(JsonField.of(scGenTool))

        /**
         * Sets [Builder.scGenTool] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scGenTool] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scGenTool(scGenTool: JsonField<String>) = apply { this.scGenTool = scGenTool }

        /**
         * The source data library from which this record was received. This could be a remote or
         * tactical UDL or another data library. If null, the record should be assumed to have
         * originated from the primary Enterprise UDL.
         */
        fun sourceDl(sourceDl: String) = sourceDl(JsonField.of(sourceDl))

        /**
         * Sets [Builder.sourceDl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceDl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceDl(sourceDl: JsonField<String>) = apply { this.sourceDl = sourceDl }

        /** The type of item that is being scanned (e.g. CARGO, PERSON, MAIL, MICAP, OTHER). */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /**
         * Array of values for the keys that may be associated to this tracked item. The entries in
         * this array must correspond to the position index in the keys array. This array must be
         * the same length as keys.
         */
        fun values(values: List<String>) = values(JsonField.of(values))

        /**
         * Sets [Builder.values] to an arbitrary JSON value.
         *
         * You should usually call [Builder.values] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun values(values: JsonField<List<String>>) = apply {
            this.values = values.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [values].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValue(value: String) = apply {
            values =
                (values ?: JsonField.of(mutableListOf())).also {
                    checkKnown("values", it).add(value)
                }
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
         * Returns an immutable instance of [HistoryListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .scanCode()
         * .scannerId()
         * .source()
         * .ts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HistoryListResponse =
            HistoryListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("scanCode", scanCode),
                checkRequired("scannerId", scannerId),
                checkRequired("source", source),
                checkRequired("ts", ts),
                id,
                createdAt,
                createdBy,
                dvCode,
                idItem,
                (keys ?: JsonMissing.of()).map { it.toImmutable() },
                lat,
                lon,
                notes,
                origin,
                origNetwork,
                scanType,
                scGenTool,
                sourceDl,
                type,
                (values ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HistoryListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        scanCode()
        scannerId()
        source()
        ts()
        id()
        createdAt()
        createdBy()
        dvCode()
        idItem()
        keys()
        lat()
        lon()
        notes()
        origin()
        origNetwork()
        scanType()
        scGenTool()
        sourceDl()
        type()
        values()
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
            (if (scanCode.asKnown().isPresent) 1 else 0) +
            (if (scannerId.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (ts.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dvCode.asKnown().isPresent) 1 else 0) +
            (if (idItem.asKnown().isPresent) 1 else 0) +
            (keys.asKnown().getOrNull()?.size ?: 0) +
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (lon.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (scanType.asKnown().isPresent) 1 else 0) +
            (if (scGenTool.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (values.asKnown().getOrNull()?.size ?: 0)

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

        return other is HistoryListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            scanCode == other.scanCode &&
            scannerId == other.scannerId &&
            source == other.source &&
            ts == other.ts &&
            id == other.id &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            dvCode == other.dvCode &&
            idItem == other.idItem &&
            keys == other.keys &&
            lat == other.lat &&
            lon == other.lon &&
            notes == other.notes &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            scanType == other.scanType &&
            scGenTool == other.scGenTool &&
            sourceDl == other.sourceDl &&
            type == other.type &&
            values == other.values &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            scanCode,
            scannerId,
            source,
            ts,
            id,
            createdAt,
            createdBy,
            dvCode,
            idItem,
            keys,
            lat,
            lon,
            notes,
            origin,
            origNetwork,
            scanType,
            scGenTool,
            sourceDl,
            type,
            values,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HistoryListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, scanCode=$scanCode, scannerId=$scannerId, source=$source, ts=$ts, id=$id, createdAt=$createdAt, createdBy=$createdBy, dvCode=$dvCode, idItem=$idItem, keys=$keys, lat=$lat, lon=$lon, notes=$notes, origin=$origin, origNetwork=$origNetwork, scanType=$scanType, scGenTool=$scGenTool, sourceDl=$sourceDl, type=$type, values=$values, additionalProperties=$additionalProperties}"
}

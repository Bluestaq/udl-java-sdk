// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.globalatmosphericmodel

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The GlobalAtmosphericModel service provides atmospheric model output data for use in space
 * situational awareness such as the Global Total Electron Content (2D) data, Global Total Electron
 * Density (3D) data, etc.
 */
class GlobalAtmosphericModelQueryResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val ts: JsonField<OffsetDateTime>,
    private val type: JsonField<String>,
    private val id: JsonField<String>,
    private val cadence: JsonField<Int>,
    private val checksumValue: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val endAlt: JsonField<Double>,
    private val endLat: JsonField<Double>,
    private val endLon: JsonField<Double>,
    private val filename: JsonField<String>,
    private val filesize: JsonField<Long>,
    private val numAlt: JsonField<Int>,
    private val numLat: JsonField<Int>,
    private val numLon: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val reportTime: JsonField<OffsetDateTime>,
    private val sourceDl: JsonField<String>,
    private val startAlt: JsonField<Double>,
    private val startLat: JsonField<Double>,
    private val startLon: JsonField<Double>,
    private val state: JsonField<String>,
    private val stepLat: JsonField<Double>,
    private val stepLon: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ts") @ExcludeMissing ts: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cadence") @ExcludeMissing cadence: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("checksumValue")
        @ExcludeMissing
        checksumValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endAlt") @ExcludeMissing endAlt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("endLat") @ExcludeMissing endLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("endLon") @ExcludeMissing endLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filesize") @ExcludeMissing filesize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("numAlt") @ExcludeMissing numAlt: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numLat") @ExcludeMissing numLat: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numLon") @ExcludeMissing numLon: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reportTime")
        @ExcludeMissing
        reportTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startAlt") @ExcludeMissing startAlt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("startLat") @ExcludeMissing startLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("startLon") @ExcludeMissing startLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stepLat") @ExcludeMissing stepLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("stepLon") @ExcludeMissing stepLon: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        ts,
        type,
        id,
        cadence,
        checksumValue,
        createdAt,
        createdBy,
        endAlt,
        endLat,
        endLon,
        filename,
        filesize,
        numAlt,
        numLat,
        numLon,
        origin,
        origNetwork,
        reportTime,
        sourceDl,
        startAlt,
        startLat,
        startLon,
        state,
        stepLat,
        stepLon,
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
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Target time of the model in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ts(): OffsetDateTime = ts.getRequired("ts")

    /**
     * Type of data associated with this record (e.g. Global Total Electron Density, Global Total
     * Electron Content).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Model execution cadence, in minutes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cadence(): Optional<Int> = cadence.getOptional("cadence")

    /**
     * MD5 value of the data file. If not provided, the ingest/create operation will automatically
     * generate the value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun checksumValue(): Optional<String> = checksumValue.getOptional("checksumValue")

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
     * Ending altitude of model outputs, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endAlt(): Optional<Double> = endAlt.getOptional("endAlt")

    /**
     * WGS-84 ending latitude of model output, in degrees. -90 to 90 degrees (negative values south
     * of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endLat(): Optional<Double> = endLat.getOptional("endLat")

    /**
     * WGS-84 ending longitude of model output, in degrees. -180 to 180 degrees (negative values
     * west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endLon(): Optional<Double> = endLon.getOptional("endLon")

    /**
     * The file name of the uploaded file.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun filename(): Optional<String> = filename.getOptional("filename")

    /**
     * The uploaded file size, in bytes. The maximum file size for this service is 104857600 bytes
     * (100MB). Files exceeding the maximum size will be rejected.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun filesize(): Optional<Long> = filesize.getOptional("filesize")

    /**
     * Number of altitude points.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numAlt(): Optional<Int> = numAlt.getOptional("numAlt")

    /**
     * Number of latitude points.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numLat(): Optional<Int> = numLat.getOptional("numLat")

    /**
     * Number of longitude points.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numLon(): Optional<Int> = numLon.getOptional("numLon")

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
     * The time that this record was created, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reportTime(): Optional<OffsetDateTime> = reportTime.getOptional("reportTime")

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
     * Starting altitude of model outputs, in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startAlt(): Optional<Double> = startAlt.getOptional("startAlt")

    /**
     * WGS-84 starting latitude of model output, in degrees. -90 to 90 degrees (negative values
     * south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startLat(): Optional<Double> = startLat.getOptional("startLat")

    /**
     * WGS-84 starting longitude of model output, in degrees. -180 to 180 degrees (negative values
     * west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startLon(): Optional<Double> = startLon.getOptional("startLon")

    /**
     * State value indicating whether the values in this record are PREDICTED or OBSERVED.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * Separation in latitude between subsequent model outputs, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stepLat(): Optional<Double> = stepLat.getOptional("stepLat")

    /**
     * Separation in longitude between subsequent model outputs, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stepLon(): Optional<Double> = stepLon.getOptional("stepLon")

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
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [cadence].
     *
     * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Int> = cadence

    /**
     * Returns the raw JSON value of [checksumValue].
     *
     * Unlike [checksumValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checksumValue")
    @ExcludeMissing
    fun _checksumValue(): JsonField<String> = checksumValue

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
     * Returns the raw JSON value of [endAlt].
     *
     * Unlike [endAlt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endAlt") @ExcludeMissing fun _endAlt(): JsonField<Double> = endAlt

    /**
     * Returns the raw JSON value of [endLat].
     *
     * Unlike [endLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endLat") @ExcludeMissing fun _endLat(): JsonField<Double> = endLat

    /**
     * Returns the raw JSON value of [endLon].
     *
     * Unlike [endLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endLon") @ExcludeMissing fun _endLon(): JsonField<Double> = endLon

    /**
     * Returns the raw JSON value of [filename].
     *
     * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

    /**
     * Returns the raw JSON value of [filesize].
     *
     * Unlike [filesize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filesize") @ExcludeMissing fun _filesize(): JsonField<Long> = filesize

    /**
     * Returns the raw JSON value of [numAlt].
     *
     * Unlike [numAlt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numAlt") @ExcludeMissing fun _numAlt(): JsonField<Int> = numAlt

    /**
     * Returns the raw JSON value of [numLat].
     *
     * Unlike [numLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numLat") @ExcludeMissing fun _numLat(): JsonField<Int> = numLat

    /**
     * Returns the raw JSON value of [numLon].
     *
     * Unlike [numLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numLon") @ExcludeMissing fun _numLon(): JsonField<Int> = numLon

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
     * Returns the raw JSON value of [reportTime].
     *
     * Unlike [reportTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reportTime")
    @ExcludeMissing
    fun _reportTime(): JsonField<OffsetDateTime> = reportTime

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [startAlt].
     *
     * Unlike [startAlt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startAlt") @ExcludeMissing fun _startAlt(): JsonField<Double> = startAlt

    /**
     * Returns the raw JSON value of [startLat].
     *
     * Unlike [startLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startLat") @ExcludeMissing fun _startLat(): JsonField<Double> = startLat

    /**
     * Returns the raw JSON value of [startLon].
     *
     * Unlike [startLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startLon") @ExcludeMissing fun _startLon(): JsonField<Double> = startLon

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /**
     * Returns the raw JSON value of [stepLat].
     *
     * Unlike [stepLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stepLat") @ExcludeMissing fun _stepLat(): JsonField<Double> = stepLat

    /**
     * Returns the raw JSON value of [stepLon].
     *
     * Unlike [stepLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stepLon") @ExcludeMissing fun _stepLon(): JsonField<Double> = stepLon

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
         * [GlobalAtmosphericModelQueryResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .ts()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GlobalAtmosphericModelQueryResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var ts: JsonField<OffsetDateTime>? = null
        private var type: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var cadence: JsonField<Int> = JsonMissing.of()
        private var checksumValue: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var endAlt: JsonField<Double> = JsonMissing.of()
        private var endLat: JsonField<Double> = JsonMissing.of()
        private var endLon: JsonField<Double> = JsonMissing.of()
        private var filename: JsonField<String> = JsonMissing.of()
        private var filesize: JsonField<Long> = JsonMissing.of()
        private var numAlt: JsonField<Int> = JsonMissing.of()
        private var numLat: JsonField<Int> = JsonMissing.of()
        private var numLon: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var reportTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var startAlt: JsonField<Double> = JsonMissing.of()
        private var startLat: JsonField<Double> = JsonMissing.of()
        private var startLon: JsonField<Double> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var stepLat: JsonField<Double> = JsonMissing.of()
        private var stepLon: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            globalAtmosphericModelQueryResponse: GlobalAtmosphericModelQueryResponse
        ) = apply {
            classificationMarking = globalAtmosphericModelQueryResponse.classificationMarking
            dataMode = globalAtmosphericModelQueryResponse.dataMode
            source = globalAtmosphericModelQueryResponse.source
            ts = globalAtmosphericModelQueryResponse.ts
            type = globalAtmosphericModelQueryResponse.type
            id = globalAtmosphericModelQueryResponse.id
            cadence = globalAtmosphericModelQueryResponse.cadence
            checksumValue = globalAtmosphericModelQueryResponse.checksumValue
            createdAt = globalAtmosphericModelQueryResponse.createdAt
            createdBy = globalAtmosphericModelQueryResponse.createdBy
            endAlt = globalAtmosphericModelQueryResponse.endAlt
            endLat = globalAtmosphericModelQueryResponse.endLat
            endLon = globalAtmosphericModelQueryResponse.endLon
            filename = globalAtmosphericModelQueryResponse.filename
            filesize = globalAtmosphericModelQueryResponse.filesize
            numAlt = globalAtmosphericModelQueryResponse.numAlt
            numLat = globalAtmosphericModelQueryResponse.numLat
            numLon = globalAtmosphericModelQueryResponse.numLon
            origin = globalAtmosphericModelQueryResponse.origin
            origNetwork = globalAtmosphericModelQueryResponse.origNetwork
            reportTime = globalAtmosphericModelQueryResponse.reportTime
            sourceDl = globalAtmosphericModelQueryResponse.sourceDl
            startAlt = globalAtmosphericModelQueryResponse.startAlt
            startLat = globalAtmosphericModelQueryResponse.startLat
            startLon = globalAtmosphericModelQueryResponse.startLon
            state = globalAtmosphericModelQueryResponse.state
            stepLat = globalAtmosphericModelQueryResponse.stepLat
            stepLon = globalAtmosphericModelQueryResponse.stepLon
            additionalProperties =
                globalAtmosphericModelQueryResponse.additionalProperties.toMutableMap()
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

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Target time of the model in ISO 8601 UTC format with millisecond precision. */
        fun ts(ts: OffsetDateTime) = ts(JsonField.of(ts))

        /**
         * Sets [Builder.ts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ts] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ts(ts: JsonField<OffsetDateTime>) = apply { this.ts = ts }

        /**
         * Type of data associated with this record (e.g. Global Total Electron Density, Global
         * Total Electron Content).
         */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Model execution cadence, in minutes. */
        fun cadence(cadence: Int) = cadence(JsonField.of(cadence))

        /**
         * Sets [Builder.cadence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cadence] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cadence(cadence: JsonField<Int>) = apply { this.cadence = cadence }

        /**
         * MD5 value of the data file. If not provided, the ingest/create operation will
         * automatically generate the value.
         */
        fun checksumValue(checksumValue: String) = checksumValue(JsonField.of(checksumValue))

        /**
         * Sets [Builder.checksumValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checksumValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checksumValue(checksumValue: JsonField<String>) = apply {
            this.checksumValue = checksumValue
        }

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

        /** Ending altitude of model outputs, in kilometers. */
        fun endAlt(endAlt: Double) = endAlt(JsonField.of(endAlt))

        /**
         * Sets [Builder.endAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endAlt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endAlt(endAlt: JsonField<Double>) = apply { this.endAlt = endAlt }

        /**
         * WGS-84 ending latitude of model output, in degrees. -90 to 90 degrees (negative values
         * south of equator).
         */
        fun endLat(endLat: Double) = endLat(JsonField.of(endLat))

        /**
         * Sets [Builder.endLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endLat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endLat(endLat: JsonField<Double>) = apply { this.endLat = endLat }

        /**
         * WGS-84 ending longitude of model output, in degrees. -180 to 180 degrees (negative values
         * west of Prime Meridian).
         */
        fun endLon(endLon: Double) = endLon(JsonField.of(endLon))

        /**
         * Sets [Builder.endLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endLon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endLon(endLon: JsonField<Double>) = apply { this.endLon = endLon }

        /** The file name of the uploaded file. */
        fun filename(filename: String) = filename(JsonField.of(filename))

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /**
         * The uploaded file size, in bytes. The maximum file size for this service is 104857600
         * bytes (100MB). Files exceeding the maximum size will be rejected.
         */
        fun filesize(filesize: Long) = filesize(JsonField.of(filesize))

        /**
         * Sets [Builder.filesize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filesize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filesize(filesize: JsonField<Long>) = apply { this.filesize = filesize }

        /** Number of altitude points. */
        fun numAlt(numAlt: Int) = numAlt(JsonField.of(numAlt))

        /**
         * Sets [Builder.numAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numAlt] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numAlt(numAlt: JsonField<Int>) = apply { this.numAlt = numAlt }

        /** Number of latitude points. */
        fun numLat(numLat: Int) = numLat(JsonField.of(numLat))

        /**
         * Sets [Builder.numLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numLat] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numLat(numLat: JsonField<Int>) = apply { this.numLat = numLat }

        /** Number of longitude points. */
        fun numLon(numLon: Int) = numLon(JsonField.of(numLon))

        /**
         * Sets [Builder.numLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numLon] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numLon(numLon: JsonField<Int>) = apply { this.numLon = numLon }

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
         * The time that this record was created, in ISO 8601 UTC format with millisecond precision.
         */
        fun reportTime(reportTime: OffsetDateTime) = reportTime(JsonField.of(reportTime))

        /**
         * Sets [Builder.reportTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reportTime(reportTime: JsonField<OffsetDateTime>) = apply {
            this.reportTime = reportTime
        }

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

        /** Starting altitude of model outputs, in kilometers. */
        fun startAlt(startAlt: Double) = startAlt(JsonField.of(startAlt))

        /**
         * Sets [Builder.startAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startAlt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startAlt(startAlt: JsonField<Double>) = apply { this.startAlt = startAlt }

        /**
         * WGS-84 starting latitude of model output, in degrees. -90 to 90 degrees (negative values
         * south of equator).
         */
        fun startLat(startLat: Double) = startLat(JsonField.of(startLat))

        /**
         * Sets [Builder.startLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startLat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startLat(startLat: JsonField<Double>) = apply { this.startLat = startLat }

        /**
         * WGS-84 starting longitude of model output, in degrees. -180 to 180 degrees (negative
         * values west of Prime Meridian).
         */
        fun startLon(startLon: Double) = startLon(JsonField.of(startLon))

        /**
         * Sets [Builder.startLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startLon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startLon(startLon: JsonField<Double>) = apply { this.startLon = startLon }

        /** State value indicating whether the values in this record are PREDICTED or OBSERVED. */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** Separation in latitude between subsequent model outputs, in degrees. */
        fun stepLat(stepLat: Double) = stepLat(JsonField.of(stepLat))

        /**
         * Sets [Builder.stepLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stepLat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stepLat(stepLat: JsonField<Double>) = apply { this.stepLat = stepLat }

        /** Separation in longitude between subsequent model outputs, in degrees. */
        fun stepLon(stepLon: Double) = stepLon(JsonField.of(stepLon))

        /**
         * Sets [Builder.stepLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stepLon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stepLon(stepLon: JsonField<Double>) = apply { this.stepLon = stepLon }

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
         * Returns an immutable instance of [GlobalAtmosphericModelQueryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .ts()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GlobalAtmosphericModelQueryResponse =
            GlobalAtmosphericModelQueryResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                checkRequired("ts", ts),
                checkRequired("type", type),
                id,
                cadence,
                checksumValue,
                createdAt,
                createdBy,
                endAlt,
                endLat,
                endLon,
                filename,
                filesize,
                numAlt,
                numLat,
                numLon,
                origin,
                origNetwork,
                reportTime,
                sourceDl,
                startAlt,
                startLat,
                startLon,
                state,
                stepLat,
                stepLon,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GlobalAtmosphericModelQueryResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        ts()
        type()
        id()
        cadence()
        checksumValue()
        createdAt()
        createdBy()
        endAlt()
        endLat()
        endLon()
        filename()
        filesize()
        numAlt()
        numLat()
        numLon()
        origin()
        origNetwork()
        reportTime()
        sourceDl()
        startAlt()
        startLat()
        startLon()
        state()
        stepLat()
        stepLon()
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
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (ts.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (cadence.asKnown().isPresent) 1 else 0) +
            (if (checksumValue.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (endAlt.asKnown().isPresent) 1 else 0) +
            (if (endLat.asKnown().isPresent) 1 else 0) +
            (if (endLon.asKnown().isPresent) 1 else 0) +
            (if (filename.asKnown().isPresent) 1 else 0) +
            (if (filesize.asKnown().isPresent) 1 else 0) +
            (if (numAlt.asKnown().isPresent) 1 else 0) +
            (if (numLat.asKnown().isPresent) 1 else 0) +
            (if (numLon.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (reportTime.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (startAlt.asKnown().isPresent) 1 else 0) +
            (if (startLat.asKnown().isPresent) 1 else 0) +
            (if (startLon.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (if (stepLat.asKnown().isPresent) 1 else 0) +
            (if (stepLon.asKnown().isPresent) 1 else 0)

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

        return other is GlobalAtmosphericModelQueryResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            ts == other.ts &&
            type == other.type &&
            id == other.id &&
            cadence == other.cadence &&
            checksumValue == other.checksumValue &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            endAlt == other.endAlt &&
            endLat == other.endLat &&
            endLon == other.endLon &&
            filename == other.filename &&
            filesize == other.filesize &&
            numAlt == other.numAlt &&
            numLat == other.numLat &&
            numLon == other.numLon &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            reportTime == other.reportTime &&
            sourceDl == other.sourceDl &&
            startAlt == other.startAlt &&
            startLat == other.startLat &&
            startLon == other.startLon &&
            state == other.state &&
            stepLat == other.stepLat &&
            stepLon == other.stepLon &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            source,
            ts,
            type,
            id,
            cadence,
            checksumValue,
            createdAt,
            createdBy,
            endAlt,
            endLat,
            endLon,
            filename,
            filesize,
            numAlt,
            numLat,
            numLon,
            origin,
            origNetwork,
            reportTime,
            sourceDl,
            startAlt,
            startLat,
            startLon,
            state,
            stepLat,
            stepLon,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GlobalAtmosphericModelQueryResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, ts=$ts, type=$type, id=$id, cadence=$cadence, checksumValue=$checksumValue, createdAt=$createdAt, createdBy=$createdBy, endAlt=$endAlt, endLat=$endLat, endLon=$endLon, filename=$filename, filesize=$filesize, numAlt=$numAlt, numLat=$numLat, numLon=$numLon, origin=$origin, origNetwork=$origNetwork, reportTime=$reportTime, sourceDl=$sourceDl, startAlt=$startAlt, startLat=$startLat, startLon=$startLon, state=$state, stepLat=$stepLat, stepLon=$stepLon, additionalProperties=$additionalProperties}"
}

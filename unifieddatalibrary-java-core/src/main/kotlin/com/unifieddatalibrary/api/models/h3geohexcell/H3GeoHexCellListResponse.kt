// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.h3geohexcell

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

/** Model representation of a hex cell array containing data for a set of observations. */
class H3GeoHexCellListResponse
private constructor(
    private val cellId: JsonField<String>,
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val altMean: JsonField<Double>,
    private val altSigma: JsonField<Double>,
    private val anomScoreInterference: JsonField<Double>,
    private val anomScoreSpoofing: JsonField<Double>,
    private val changeScore: JsonField<Double>,
    private val coverage: JsonField<Int>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val idH3Geo: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val rpmMax: JsonField<Double>,
    private val rpmMean: JsonField<Double>,
    private val rpmMedian: JsonField<Double>,
    private val rpmMin: JsonField<Double>,
    private val rpmSigma: JsonField<Double>,
    private val sourceDl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cellId") @ExcludeMissing cellId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altMean") @ExcludeMissing altMean: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("altSigma") @ExcludeMissing altSigma: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("anomScoreInterference")
        @ExcludeMissing
        anomScoreInterference: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("anomScoreSpoofing")
        @ExcludeMissing
        anomScoreSpoofing: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("changeScore")
        @ExcludeMissing
        changeScore: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("coverage") @ExcludeMissing coverage: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idH3Geo") @ExcludeMissing idH3Geo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rpmMax") @ExcludeMissing rpmMax: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rpmMean") @ExcludeMissing rpmMean: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rpmMedian") @ExcludeMissing rpmMedian: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rpmMin") @ExcludeMissing rpmMin: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rpmSigma") @ExcludeMissing rpmSigma: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
    ) : this(
        cellId,
        classificationMarking,
        dataMode,
        source,
        id,
        altMean,
        altSigma,
        anomScoreInterference,
        anomScoreSpoofing,
        changeScore,
        coverage,
        createdAt,
        createdBy,
        idH3Geo,
        origin,
        origNetwork,
        rpmMax,
        rpmMean,
        rpmMedian,
        rpmMin,
        rpmSigma,
        sourceDl,
        mutableMapOf(),
    )

    /**
     * The H3 index represented as a 16 character hexadecimal string.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cellId(): String = cellId.getRequired("cellId")

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
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The mean altitude of the set of observations within this cell, measured in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altMean(): Optional<Double> = altMean.getOptional("altMean")

    /**
     * The standard deviation of alttitude in the set of observations within this cell, measured in
     * kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altSigma(): Optional<Double> = altSigma.getOptional("altSigma")

    /**
     * The anomaly score for probable manufactured interference or RF interference; calculated as a
     * ratio of #anomalous obs / #total obs or coverage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun anomScoreInterference(): Optional<Double> =
        anomScoreInterference.getOptional("anomScoreInterference")

    /**
     * The anomaly score for probable spoofing; calculated as a ratio of #anomalous obs / #total obs
     * or coverage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun anomScoreSpoofing(): Optional<Double> = anomScoreSpoofing.getOptional("anomScoreSpoofing")

    /**
     * The percentage degree of change in the aggregated observables for a particular H3 bin.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun changeScore(): Optional<Double> = changeScore.getOptional("changeScore")

    /**
     * The total number of available observations in the H3 cell during the start/end times.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coverage(): Optional<Int> = coverage.getOptional("coverage")

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
     * Unique identifier of the parent H3 Geo record containing this hex cell.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idH3Geo(): Optional<String> = idH3Geo.getOptional("idH3Geo")

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
     * The max received power monitor (RPM) output value for the set of data contained within this
     * cell.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rpmMax(): Optional<Double> = rpmMax.getOptional("rpmMax")

    /**
     * The mean received power monitor (RPM) output value for the set of data contained within this
     * cell.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rpmMean(): Optional<Double> = rpmMean.getOptional("rpmMean")

    /**
     * The median received power monitor (RPM) output value for the set of data contained within
     * this cell.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rpmMedian(): Optional<Double> = rpmMedian.getOptional("rpmMedian")

    /**
     * The min received power monitor (RPM) output value for the set of data contained within this
     * cell.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rpmMin(): Optional<Double> = rpmMin.getOptional("rpmMin")

    /**
     * The standard deviation of the received power monitor (RPM) output value for the set of data
     * contained within this cell.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rpmSigma(): Optional<Double> = rpmSigma.getOptional("rpmSigma")

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
     * Returns the raw JSON value of [cellId].
     *
     * Unlike [cellId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cellId") @ExcludeMissing fun _cellId(): JsonField<String> = cellId

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [altMean].
     *
     * Unlike [altMean], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altMean") @ExcludeMissing fun _altMean(): JsonField<Double> = altMean

    /**
     * Returns the raw JSON value of [altSigma].
     *
     * Unlike [altSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altSigma") @ExcludeMissing fun _altSigma(): JsonField<Double> = altSigma

    /**
     * Returns the raw JSON value of [anomScoreInterference].
     *
     * Unlike [anomScoreInterference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("anomScoreInterference")
    @ExcludeMissing
    fun _anomScoreInterference(): JsonField<Double> = anomScoreInterference

    /**
     * Returns the raw JSON value of [anomScoreSpoofing].
     *
     * Unlike [anomScoreSpoofing], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("anomScoreSpoofing")
    @ExcludeMissing
    fun _anomScoreSpoofing(): JsonField<Double> = anomScoreSpoofing

    /**
     * Returns the raw JSON value of [changeScore].
     *
     * Unlike [changeScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("changeScore") @ExcludeMissing fun _changeScore(): JsonField<Double> = changeScore

    /**
     * Returns the raw JSON value of [coverage].
     *
     * Unlike [coverage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coverage") @ExcludeMissing fun _coverage(): JsonField<Int> = coverage

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
     * Returns the raw JSON value of [idH3Geo].
     *
     * Unlike [idH3Geo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idH3Geo") @ExcludeMissing fun _idH3Geo(): JsonField<String> = idH3Geo

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
     * Returns the raw JSON value of [rpmMax].
     *
     * Unlike [rpmMax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rpmMax") @ExcludeMissing fun _rpmMax(): JsonField<Double> = rpmMax

    /**
     * Returns the raw JSON value of [rpmMean].
     *
     * Unlike [rpmMean], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rpmMean") @ExcludeMissing fun _rpmMean(): JsonField<Double> = rpmMean

    /**
     * Returns the raw JSON value of [rpmMedian].
     *
     * Unlike [rpmMedian], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rpmMedian") @ExcludeMissing fun _rpmMedian(): JsonField<Double> = rpmMedian

    /**
     * Returns the raw JSON value of [rpmMin].
     *
     * Unlike [rpmMin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rpmMin") @ExcludeMissing fun _rpmMin(): JsonField<Double> = rpmMin

    /**
     * Returns the raw JSON value of [rpmSigma].
     *
     * Unlike [rpmSigma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rpmSigma") @ExcludeMissing fun _rpmSigma(): JsonField<Double> = rpmSigma

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

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
         * Returns a mutable builder for constructing an instance of [H3GeoHexCellListResponse].
         *
         * The following fields are required:
         * ```java
         * .cellId()
         * .classificationMarking()
         * .dataMode()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [H3GeoHexCellListResponse]. */
    class Builder internal constructor() {

        private var cellId: JsonField<String>? = null
        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var altMean: JsonField<Double> = JsonMissing.of()
        private var altSigma: JsonField<Double> = JsonMissing.of()
        private var anomScoreInterference: JsonField<Double> = JsonMissing.of()
        private var anomScoreSpoofing: JsonField<Double> = JsonMissing.of()
        private var changeScore: JsonField<Double> = JsonMissing.of()
        private var coverage: JsonField<Int> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var idH3Geo: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var rpmMax: JsonField<Double> = JsonMissing.of()
        private var rpmMean: JsonField<Double> = JsonMissing.of()
        private var rpmMedian: JsonField<Double> = JsonMissing.of()
        private var rpmMin: JsonField<Double> = JsonMissing.of()
        private var rpmSigma: JsonField<Double> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(h3GeoHexCellListResponse: H3GeoHexCellListResponse) = apply {
            cellId = h3GeoHexCellListResponse.cellId
            classificationMarking = h3GeoHexCellListResponse.classificationMarking
            dataMode = h3GeoHexCellListResponse.dataMode
            source = h3GeoHexCellListResponse.source
            id = h3GeoHexCellListResponse.id
            altMean = h3GeoHexCellListResponse.altMean
            altSigma = h3GeoHexCellListResponse.altSigma
            anomScoreInterference = h3GeoHexCellListResponse.anomScoreInterference
            anomScoreSpoofing = h3GeoHexCellListResponse.anomScoreSpoofing
            changeScore = h3GeoHexCellListResponse.changeScore
            coverage = h3GeoHexCellListResponse.coverage
            createdAt = h3GeoHexCellListResponse.createdAt
            createdBy = h3GeoHexCellListResponse.createdBy
            idH3Geo = h3GeoHexCellListResponse.idH3Geo
            origin = h3GeoHexCellListResponse.origin
            origNetwork = h3GeoHexCellListResponse.origNetwork
            rpmMax = h3GeoHexCellListResponse.rpmMax
            rpmMean = h3GeoHexCellListResponse.rpmMean
            rpmMedian = h3GeoHexCellListResponse.rpmMedian
            rpmMin = h3GeoHexCellListResponse.rpmMin
            rpmSigma = h3GeoHexCellListResponse.rpmSigma
            sourceDl = h3GeoHexCellListResponse.sourceDl
            additionalProperties = h3GeoHexCellListResponse.additionalProperties.toMutableMap()
        }

        /** The H3 index represented as a 16 character hexadecimal string. */
        fun cellId(cellId: String) = cellId(JsonField.of(cellId))

        /**
         * Sets [Builder.cellId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cellId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cellId(cellId: JsonField<String>) = apply { this.cellId = cellId }

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

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The mean altitude of the set of observations within this cell, measured in kilometers.
         */
        fun altMean(altMean: Double) = altMean(JsonField.of(altMean))

        /**
         * Sets [Builder.altMean] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altMean] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun altMean(altMean: JsonField<Double>) = apply { this.altMean = altMean }

        /**
         * The standard deviation of alttitude in the set of observations within this cell, measured
         * in kilometers.
         */
        fun altSigma(altSigma: Double) = altSigma(JsonField.of(altSigma))

        /**
         * Sets [Builder.altSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altSigma] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun altSigma(altSigma: JsonField<Double>) = apply { this.altSigma = altSigma }

        /**
         * The anomaly score for probable manufactured interference or RF interference; calculated
         * as a ratio of #anomalous obs / #total obs or coverage.
         */
        fun anomScoreInterference(anomScoreInterference: Double) =
            anomScoreInterference(JsonField.of(anomScoreInterference))

        /**
         * Sets [Builder.anomScoreInterference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.anomScoreInterference] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun anomScoreInterference(anomScoreInterference: JsonField<Double>) = apply {
            this.anomScoreInterference = anomScoreInterference
        }

        /**
         * The anomaly score for probable spoofing; calculated as a ratio of #anomalous obs / #total
         * obs or coverage.
         */
        fun anomScoreSpoofing(anomScoreSpoofing: Double) =
            anomScoreSpoofing(JsonField.of(anomScoreSpoofing))

        /**
         * Sets [Builder.anomScoreSpoofing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.anomScoreSpoofing] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun anomScoreSpoofing(anomScoreSpoofing: JsonField<Double>) = apply {
            this.anomScoreSpoofing = anomScoreSpoofing
        }

        /**
         * The percentage degree of change in the aggregated observables for a particular H3 bin.
         */
        fun changeScore(changeScore: Double) = changeScore(JsonField.of(changeScore))

        /**
         * Sets [Builder.changeScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changeScore] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun changeScore(changeScore: JsonField<Double>) = apply { this.changeScore = changeScore }

        /** The total number of available observations in the H3 cell during the start/end times. */
        fun coverage(coverage: Int) = coverage(JsonField.of(coverage))

        /**
         * Sets [Builder.coverage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coverage] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun coverage(coverage: JsonField<Int>) = apply { this.coverage = coverage }

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

        /** Unique identifier of the parent H3 Geo record containing this hex cell. */
        fun idH3Geo(idH3Geo: String) = idH3Geo(JsonField.of(idH3Geo))

        /**
         * Sets [Builder.idH3Geo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idH3Geo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idH3Geo(idH3Geo: JsonField<String>) = apply { this.idH3Geo = idH3Geo }

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
         * The max received power monitor (RPM) output value for the set of data contained within
         * this cell.
         */
        fun rpmMax(rpmMax: Double) = rpmMax(JsonField.of(rpmMax))

        /**
         * Sets [Builder.rpmMax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmMax] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rpmMax(rpmMax: JsonField<Double>) = apply { this.rpmMax = rpmMax }

        /**
         * The mean received power monitor (RPM) output value for the set of data contained within
         * this cell.
         */
        fun rpmMean(rpmMean: Double) = rpmMean(JsonField.of(rpmMean))

        /**
         * Sets [Builder.rpmMean] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmMean] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rpmMean(rpmMean: JsonField<Double>) = apply { this.rpmMean = rpmMean }

        /**
         * The median received power monitor (RPM) output value for the set of data contained within
         * this cell.
         */
        fun rpmMedian(rpmMedian: Double) = rpmMedian(JsonField.of(rpmMedian))

        /**
         * Sets [Builder.rpmMedian] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmMedian] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rpmMedian(rpmMedian: JsonField<Double>) = apply { this.rpmMedian = rpmMedian }

        /**
         * The min received power monitor (RPM) output value for the set of data contained within
         * this cell.
         */
        fun rpmMin(rpmMin: Double) = rpmMin(JsonField.of(rpmMin))

        /**
         * Sets [Builder.rpmMin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmMin] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rpmMin(rpmMin: JsonField<Double>) = apply { this.rpmMin = rpmMin }

        /**
         * The standard deviation of the received power monitor (RPM) output value for the set of
         * data contained within this cell.
         */
        fun rpmSigma(rpmSigma: Double) = rpmSigma(JsonField.of(rpmSigma))

        /**
         * Sets [Builder.rpmSigma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmSigma] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rpmSigma(rpmSigma: JsonField<Double>) = apply { this.rpmSigma = rpmSigma }

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
         * Returns an immutable instance of [H3GeoHexCellListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cellId()
         * .classificationMarking()
         * .dataMode()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): H3GeoHexCellListResponse =
            H3GeoHexCellListResponse(
                checkRequired("cellId", cellId),
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                id,
                altMean,
                altSigma,
                anomScoreInterference,
                anomScoreSpoofing,
                changeScore,
                coverage,
                createdAt,
                createdBy,
                idH3Geo,
                origin,
                origNetwork,
                rpmMax,
                rpmMean,
                rpmMedian,
                rpmMin,
                rpmSigma,
                sourceDl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): H3GeoHexCellListResponse = apply {
        if (validated) {
            return@apply
        }

        cellId()
        classificationMarking()
        dataMode().validate()
        source()
        id()
        altMean()
        altSigma()
        anomScoreInterference()
        anomScoreSpoofing()
        changeScore()
        coverage()
        createdAt()
        createdBy()
        idH3Geo()
        origin()
        origNetwork()
        rpmMax()
        rpmMean()
        rpmMedian()
        rpmMin()
        rpmSigma()
        sourceDl()
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
        (if (cellId.asKnown().isPresent) 1 else 0) +
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (altMean.asKnown().isPresent) 1 else 0) +
            (if (altSigma.asKnown().isPresent) 1 else 0) +
            (if (anomScoreInterference.asKnown().isPresent) 1 else 0) +
            (if (anomScoreSpoofing.asKnown().isPresent) 1 else 0) +
            (if (changeScore.asKnown().isPresent) 1 else 0) +
            (if (coverage.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (idH3Geo.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (rpmMax.asKnown().isPresent) 1 else 0) +
            (if (rpmMean.asKnown().isPresent) 1 else 0) +
            (if (rpmMedian.asKnown().isPresent) 1 else 0) +
            (if (rpmMin.asKnown().isPresent) 1 else 0) +
            (if (rpmSigma.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0)

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

        return other is H3GeoHexCellListResponse &&
            cellId == other.cellId &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            id == other.id &&
            altMean == other.altMean &&
            altSigma == other.altSigma &&
            anomScoreInterference == other.anomScoreInterference &&
            anomScoreSpoofing == other.anomScoreSpoofing &&
            changeScore == other.changeScore &&
            coverage == other.coverage &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            idH3Geo == other.idH3Geo &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            rpmMax == other.rpmMax &&
            rpmMean == other.rpmMean &&
            rpmMedian == other.rpmMedian &&
            rpmMin == other.rpmMin &&
            rpmSigma == other.rpmSigma &&
            sourceDl == other.sourceDl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cellId,
            classificationMarking,
            dataMode,
            source,
            id,
            altMean,
            altSigma,
            anomScoreInterference,
            anomScoreSpoofing,
            changeScore,
            coverage,
            createdAt,
            createdBy,
            idH3Geo,
            origin,
            origNetwork,
            rpmMax,
            rpmMean,
            rpmMedian,
            rpmMin,
            rpmSigma,
            sourceDl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "H3GeoHexCellListResponse{cellId=$cellId, classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, id=$id, altMean=$altMean, altSigma=$altSigma, anomScoreInterference=$anomScoreInterference, anomScoreSpoofing=$anomScoreSpoofing, changeScore=$changeScore, coverage=$coverage, createdAt=$createdAt, createdBy=$createdBy, idH3Geo=$idH3Geo, origin=$origin, origNetwork=$origNetwork, rpmMax=$rpmMax, rpmMean=$rpmMean, rpmMedian=$rpmMedian, rpmMin=$rpmMin, rpmSigma=$rpmSigma, sourceDl=$sourceDl, additionalProperties=$additionalProperties}"
}

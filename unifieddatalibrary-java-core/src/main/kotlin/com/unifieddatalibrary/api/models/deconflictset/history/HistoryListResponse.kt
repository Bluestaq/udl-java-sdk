// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.deconflictset.history

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

/**
 * The DeconflictSet service provides access to a set of DeconflictWindows and metadata about those
 * data. A DeconflictWindow describes a time window during which an action, such as target
 * engagement, may either occur or is prohibited from occurring. The DeconflictWindow model includes
 * information about the spatial details for specific target types. A flag is provided to specify
 * whether the window should be associated with taking action (OPEN), or if no action should occur
 * (CLOSED).
 */
class HistoryListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val eventStartTime: JsonField<OffsetDateTime>,
    private val numWindows: JsonField<Int>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val calculationEndTime: JsonField<OffsetDateTime>,
    private val calculationId: JsonField<String>,
    private val calculationStartTime: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val deconflictWindows: JsonField<List<DeconflictWindow>>,
    private val errors: JsonField<List<String>>,
    private val eventEndTime: JsonField<OffsetDateTime>,
    private val eventType: JsonField<String>,
    private val idLaserDeconflictRequest: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val referenceFrame: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val transactionId: JsonField<String>,
    private val warnings: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("eventStartTime")
        @ExcludeMissing
        eventStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("numWindows") @ExcludeMissing numWindows: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("calculationEndTime")
        @ExcludeMissing
        calculationEndTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("calculationId")
        @ExcludeMissing
        calculationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("calculationStartTime")
        @ExcludeMissing
        calculationStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deconflictWindows")
        @ExcludeMissing
        deconflictWindows: JsonField<List<DeconflictWindow>> = JsonMissing.of(),
        @JsonProperty("errors") @ExcludeMissing errors: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("eventEndTime")
        @ExcludeMissing
        eventEndTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("eventType") @ExcludeMissing eventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idLaserDeconflictRequest")
        @ExcludeMissing
        idLaserDeconflictRequest: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referenceFrame")
        @ExcludeMissing
        referenceFrame: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("warnings")
        @ExcludeMissing
        warnings: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        eventStartTime,
        numWindows,
        source,
        id,
        calculationEndTime,
        calculationId,
        calculationStartTime,
        createdAt,
        createdBy,
        deconflictWindows,
        errors,
        eventEndTime,
        eventType,
        idLaserDeconflictRequest,
        origin,
        origNetwork,
        referenceFrame,
        sourceDl,
        tags,
        transactionId,
        warnings,
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
     * The start time of the event associated with the set of DeconflictWindow records, in ISO 8601
     * UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventStartTime(): OffsetDateTime = eventStartTime.getRequired("eventStartTime")

    /**
     * The number of windows provided by this DeconflictSet record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numWindows(): Int = numWindows.getRequired("numWindows")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Unique identifier of the record, auto-generated by the system if not provided on create
     * operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The time at which the window calculations completed, in ISO 8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun calculationEndTime(): Optional<OffsetDateTime> =
        calculationEndTime.getOptional("calculationEndTime")

    /**
     * The algorithm execution id associated with the generation of this DeconflictSet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun calculationId(): Optional<String> = calculationId.getOptional("calculationId")

    /**
     * The time at which the window calculations started, in ISO 8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun calculationStartTime(): Optional<OffsetDateTime> =
        calculationStartTime.getOptional("calculationStartTime")

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
     * Array of DeconflictWindow records associated with this DeconflictSet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun deconflictWindows(): Optional<List<DeconflictWindow>> =
        deconflictWindows.getOptional("deconflictWindows")

    /**
     * Array of error messages that potentially contain information about the reasons this
     * deconflict response calculation may be inaccurate, or why it failed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun errors(): Optional<List<String>> = errors.getOptional("errors")

    /**
     * The end time of the event associated with the set of DeconflictWindow records, in ISO 8601
     * UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eventEndTime(): Optional<OffsetDateTime> = eventEndTime.getOptional("eventEndTime")

    /**
     * The type of event associated with this DeconflictSet record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eventType(): Optional<String> = eventType.getOptional("eventType")

    /**
     * The id of the LaserDeconflictRequest record used as input in the generation of this
     * DeconflictSet, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idLaserDeconflictRequest(): Optional<String> =
        idLaserDeconflictRequest.getOptional("idLaserDeconflictRequest")

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
     * The reference frame of the cartesian orbital states. If the referenceFrame is null it is
     * assumed to be J2000.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun referenceFrame(): Optional<String> = referenceFrame.getOptional("referenceFrame")

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
     * Optional array of provider/source specific tags for this data, where each element is no
     * longer than 32 characters, used for implementing data owner conditional access controls to
     * restrict access to the data. Should be left null by data providers unless conditional access
     * controls are coordinated with the UDL team.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

    /**
     * Array of warning messages that potentially contain information about the reasons this
     * deconflict response calculation may be inaccurate, or why it failed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun warnings(): Optional<List<String>> = warnings.getOptional("warnings")

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
     * Returns the raw JSON value of [eventStartTime].
     *
     * Unlike [eventStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventStartTime")
    @ExcludeMissing
    fun _eventStartTime(): JsonField<OffsetDateTime> = eventStartTime

    /**
     * Returns the raw JSON value of [numWindows].
     *
     * Unlike [numWindows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numWindows") @ExcludeMissing fun _numWindows(): JsonField<Int> = numWindows

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
     * Returns the raw JSON value of [calculationEndTime].
     *
     * Unlike [calculationEndTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("calculationEndTime")
    @ExcludeMissing
    fun _calculationEndTime(): JsonField<OffsetDateTime> = calculationEndTime

    /**
     * Returns the raw JSON value of [calculationId].
     *
     * Unlike [calculationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("calculationId")
    @ExcludeMissing
    fun _calculationId(): JsonField<String> = calculationId

    /**
     * Returns the raw JSON value of [calculationStartTime].
     *
     * Unlike [calculationStartTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("calculationStartTime")
    @ExcludeMissing
    fun _calculationStartTime(): JsonField<OffsetDateTime> = calculationStartTime

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
     * Returns the raw JSON value of [deconflictWindows].
     *
     * Unlike [deconflictWindows], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deconflictWindows")
    @ExcludeMissing
    fun _deconflictWindows(): JsonField<List<DeconflictWindow>> = deconflictWindows

    /**
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<String>> = errors

    /**
     * Returns the raw JSON value of [eventEndTime].
     *
     * Unlike [eventEndTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventEndTime")
    @ExcludeMissing
    fun _eventEndTime(): JsonField<OffsetDateTime> = eventEndTime

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventType") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

    /**
     * Returns the raw JSON value of [idLaserDeconflictRequest].
     *
     * Unlike [idLaserDeconflictRequest], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("idLaserDeconflictRequest")
    @ExcludeMissing
    fun _idLaserDeconflictRequest(): JsonField<String> = idLaserDeconflictRequest

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
     * Returns the raw JSON value of [referenceFrame].
     *
     * Unlike [referenceFrame], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referenceFrame")
    @ExcludeMissing
    fun _referenceFrame(): JsonField<String> = referenceFrame

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [warnings].
     *
     * Unlike [warnings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("warnings") @ExcludeMissing fun _warnings(): JsonField<List<String>> = warnings

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
         * .eventStartTime()
         * .numWindows()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HistoryListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var eventStartTime: JsonField<OffsetDateTime>? = null
        private var numWindows: JsonField<Int>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var calculationEndTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var calculationId: JsonField<String> = JsonMissing.of()
        private var calculationStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var deconflictWindows: JsonField<MutableList<DeconflictWindow>>? = null
        private var errors: JsonField<MutableList<String>>? = null
        private var eventEndTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventType: JsonField<String> = JsonMissing.of()
        private var idLaserDeconflictRequest: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var referenceFrame: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var warnings: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(historyListResponse: HistoryListResponse) = apply {
            classificationMarking = historyListResponse.classificationMarking
            dataMode = historyListResponse.dataMode
            eventStartTime = historyListResponse.eventStartTime
            numWindows = historyListResponse.numWindows
            source = historyListResponse.source
            id = historyListResponse.id
            calculationEndTime = historyListResponse.calculationEndTime
            calculationId = historyListResponse.calculationId
            calculationStartTime = historyListResponse.calculationStartTime
            createdAt = historyListResponse.createdAt
            createdBy = historyListResponse.createdBy
            deconflictWindows = historyListResponse.deconflictWindows.map { it.toMutableList() }
            errors = historyListResponse.errors.map { it.toMutableList() }
            eventEndTime = historyListResponse.eventEndTime
            eventType = historyListResponse.eventType
            idLaserDeconflictRequest = historyListResponse.idLaserDeconflictRequest
            origin = historyListResponse.origin
            origNetwork = historyListResponse.origNetwork
            referenceFrame = historyListResponse.referenceFrame
            sourceDl = historyListResponse.sourceDl
            tags = historyListResponse.tags.map { it.toMutableList() }
            transactionId = historyListResponse.transactionId
            warnings = historyListResponse.warnings.map { it.toMutableList() }
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
         * The start time of the event associated with the set of DeconflictWindow records, in ISO
         * 8601 UTC format with millisecond precision.
         */
        fun eventStartTime(eventStartTime: OffsetDateTime) =
            eventStartTime(JsonField.of(eventStartTime))

        /**
         * Sets [Builder.eventStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventStartTime(eventStartTime: JsonField<OffsetDateTime>) = apply {
            this.eventStartTime = eventStartTime
        }

        /** The number of windows provided by this DeconflictSet record. */
        fun numWindows(numWindows: Int) = numWindows(JsonField.of(numWindows))

        /**
         * Sets [Builder.numWindows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numWindows] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numWindows(numWindows: JsonField<Int>) = apply { this.numWindows = numWindows }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /**
         * Unique identifier of the record, auto-generated by the system if not provided on create
         * operations.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The time at which the window calculations completed, in ISO 8601 UTC format with
         * millisecond precision.
         */
        fun calculationEndTime(calculationEndTime: OffsetDateTime) =
            calculationEndTime(JsonField.of(calculationEndTime))

        /**
         * Sets [Builder.calculationEndTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calculationEndTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun calculationEndTime(calculationEndTime: JsonField<OffsetDateTime>) = apply {
            this.calculationEndTime = calculationEndTime
        }

        /** The algorithm execution id associated with the generation of this DeconflictSet. */
        fun calculationId(calculationId: String) = calculationId(JsonField.of(calculationId))

        /**
         * Sets [Builder.calculationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calculationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun calculationId(calculationId: JsonField<String>) = apply {
            this.calculationId = calculationId
        }

        /**
         * The time at which the window calculations started, in ISO 8601 UTC format with
         * millisecond precision.
         */
        fun calculationStartTime(calculationStartTime: OffsetDateTime) =
            calculationStartTime(JsonField.of(calculationStartTime))

        /**
         * Sets [Builder.calculationStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calculationStartTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun calculationStartTime(calculationStartTime: JsonField<OffsetDateTime>) = apply {
            this.calculationStartTime = calculationStartTime
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

        /** Array of DeconflictWindow records associated with this DeconflictSet. */
        fun deconflictWindows(deconflictWindows: List<DeconflictWindow>) =
            deconflictWindows(JsonField.of(deconflictWindows))

        /**
         * Sets [Builder.deconflictWindows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deconflictWindows] with a well-typed
         * `List<DeconflictWindow>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun deconflictWindows(deconflictWindows: JsonField<List<DeconflictWindow>>) = apply {
            this.deconflictWindows = deconflictWindows.map { it.toMutableList() }
        }

        /**
         * Adds a single [DeconflictWindow] to [deconflictWindows].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeconflictWindow(deconflictWindow: DeconflictWindow) = apply {
            deconflictWindows =
                (deconflictWindows ?: JsonField.of(mutableListOf())).also {
                    checkKnown("deconflictWindows", it).add(deconflictWindow)
                }
        }

        /**
         * Array of error messages that potentially contain information about the reasons this
         * deconflict response calculation may be inaccurate, or why it failed.
         */
        fun errors(errors: List<String>) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errors(errors: JsonField<List<String>>) = apply {
            this.errors = errors.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [errors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: String) = apply {
            errors =
                (errors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("errors", it).add(error)
                }
        }

        /**
         * The end time of the event associated with the set of DeconflictWindow records, in ISO
         * 8601 UTC format with millisecond precision.
         */
        fun eventEndTime(eventEndTime: OffsetDateTime) = eventEndTime(JsonField.of(eventEndTime))

        /**
         * Sets [Builder.eventEndTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventEndTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventEndTime(eventEndTime: JsonField<OffsetDateTime>) = apply {
            this.eventEndTime = eventEndTime
        }

        /** The type of event associated with this DeconflictSet record. */
        fun eventType(eventType: String) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

        /**
         * The id of the LaserDeconflictRequest record used as input in the generation of this
         * DeconflictSet, if applicable.
         */
        fun idLaserDeconflictRequest(idLaserDeconflictRequest: String) =
            idLaserDeconflictRequest(JsonField.of(idLaserDeconflictRequest))

        /**
         * Sets [Builder.idLaserDeconflictRequest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idLaserDeconflictRequest] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun idLaserDeconflictRequest(idLaserDeconflictRequest: JsonField<String>) = apply {
            this.idLaserDeconflictRequest = idLaserDeconflictRequest
        }

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
         * The reference frame of the cartesian orbital states. If the referenceFrame is null it is
         * assumed to be J2000.
         */
        fun referenceFrame(referenceFrame: String) = referenceFrame(JsonField.of(referenceFrame))

        /**
         * Sets [Builder.referenceFrame] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceFrame] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceFrame(referenceFrame: JsonField<String>) = apply {
            this.referenceFrame = referenceFrame
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

        /**
         * Optional array of provider/source specific tags for this data, where each element is no
         * longer than 32 characters, used for implementing data owner conditional access controls
         * to restrict access to the data. Should be left null by data providers unless conditional
         * access controls are coordinated with the UDL team.
         */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /**
         * Optional identifier to track a commercial or marketplace transaction executed to produce
         * this data.
         */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * Array of warning messages that potentially contain information about the reasons this
         * deconflict response calculation may be inaccurate, or why it failed.
         */
        fun warnings(warnings: List<String>) = warnings(JsonField.of(warnings))

        /**
         * Sets [Builder.warnings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.warnings] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun warnings(warnings: JsonField<List<String>>) = apply {
            this.warnings = warnings.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [warnings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWarning(warning: String) = apply {
            warnings =
                (warnings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("warnings", it).add(warning)
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
         * .eventStartTime()
         * .numWindows()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HistoryListResponse =
            HistoryListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("eventStartTime", eventStartTime),
                checkRequired("numWindows", numWindows),
                checkRequired("source", source),
                id,
                calculationEndTime,
                calculationId,
                calculationStartTime,
                createdAt,
                createdBy,
                (deconflictWindows ?: JsonMissing.of()).map { it.toImmutable() },
                (errors ?: JsonMissing.of()).map { it.toImmutable() },
                eventEndTime,
                eventType,
                idLaserDeconflictRequest,
                origin,
                origNetwork,
                referenceFrame,
                sourceDl,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                transactionId,
                (warnings ?: JsonMissing.of()).map { it.toImmutable() },
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
        eventStartTime()
        numWindows()
        source()
        id()
        calculationEndTime()
        calculationId()
        calculationStartTime()
        createdAt()
        createdBy()
        deconflictWindows().ifPresent { it.forEach { it.validate() } }
        errors()
        eventEndTime()
        eventType()
        idLaserDeconflictRequest()
        origin()
        origNetwork()
        referenceFrame()
        sourceDl()
        tags()
        transactionId()
        warnings()
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
            (if (eventStartTime.asKnown().isPresent) 1 else 0) +
            (if (numWindows.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (calculationEndTime.asKnown().isPresent) 1 else 0) +
            (if (calculationId.asKnown().isPresent) 1 else 0) +
            (if (calculationStartTime.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (deconflictWindows.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (errors.asKnown().getOrNull()?.size ?: 0) +
            (if (eventEndTime.asKnown().isPresent) 1 else 0) +
            (if (eventType.asKnown().isPresent) 1 else 0) +
            (if (idLaserDeconflictRequest.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (referenceFrame.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (warnings.asKnown().getOrNull()?.size ?: 0)

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

    /**
     * A DeconflictWindow describes a time window during which an action, such as target engagement,
     * may either occur or is prohibited from occurring. The DeconflictWindow model includes
     * information about the spatial details for specific target types. A flag is provided to
     * specify whether the window should be associated with taking action (OPEN), or if no action
     * should occur (CLOSED).
     */
    class DeconflictWindow
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val eventStartTime: JsonField<OffsetDateTime>,
        private val source: JsonField<String>,
        private val startTime: JsonField<OffsetDateTime>,
        private val stopTime: JsonField<OffsetDateTime>,
        private val id: JsonField<String>,
        private val angleOfEntry: JsonField<Double>,
        private val angleOfExit: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val entryCoords: JsonField<List<Double>>,
        private val eventType: JsonField<String>,
        private val exitCoords: JsonField<List<Double>>,
        private val idDeconflictSet: JsonField<String>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val sourceDl: JsonField<String>,
        private val target: JsonField<String>,
        private val targetType: JsonField<String>,
        private val victim: JsonField<String>,
        private val windowType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("eventStartTime")
            @ExcludeMissing
            eventStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("startTime")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("stopTime")
            @ExcludeMissing
            stopTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("angleOfEntry")
            @ExcludeMissing
            angleOfEntry: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("angleOfExit")
            @ExcludeMissing
            angleOfExit: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entryCoords")
            @ExcludeMissing
            entryCoords: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("eventType")
            @ExcludeMissing
            eventType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("exitCoords")
            @ExcludeMissing
            exitCoords: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("idDeconflictSet")
            @ExcludeMissing
            idDeconflictSet: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sourceDL")
            @ExcludeMissing
            sourceDl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("target") @ExcludeMissing target: JsonField<String> = JsonMissing.of(),
            @JsonProperty("targetType")
            @ExcludeMissing
            targetType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("victim") @ExcludeMissing victim: JsonField<String> = JsonMissing.of(),
            @JsonProperty("windowType")
            @ExcludeMissing
            windowType: JsonField<String> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            eventStartTime,
            source,
            startTime,
            stopTime,
            id,
            angleOfEntry,
            angleOfExit,
            createdAt,
            createdBy,
            entryCoords,
            eventType,
            exitCoords,
            idDeconflictSet,
            origin,
            origNetwork,
            sourceDl,
            target,
            targetType,
            victim,
            windowType,
            mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

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
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * The start time of the event associated with the set of DeconflictWindow records, in ISO
         * 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun eventStartTime(): OffsetDateTime = eventStartTime.getRequired("eventStartTime")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * The window start time, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

        /**
         * The window stop time, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun stopTime(): OffsetDateTime = stopTime.getRequired("stopTime")

        /**
         * Unique identifier of the record, auto-generated by the system if not provided on create
         * operations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The angle at which the victim enters the target zone in reference to the emitter source
         * location, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun angleOfEntry(): Optional<Double> = angleOfEntry.getOptional("angleOfEntry")

        /**
         * The angle at which the victim exits the target zone in reference to the emitter source
         * location, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun angleOfExit(): Optional<Double> = angleOfExit.getOptional("angleOfExit")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * The X, Y, Z coordinates of entry, in the reference frame specified by the parent
         * DeconflictSet record, in meters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun entryCoords(): Optional<List<Double>> = entryCoords.getOptional("entryCoords")

        /**
         * The type of event associated with the window status.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun eventType(): Optional<String> = eventType.getOptional("eventType")

        /**
         * The X, Y, Z coordinates of exit, in the reference frame specified by the parent
         * DeconflictSet record, in meters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun exitCoords(): Optional<List<Double>> = exitCoords.getOptional("exitCoords")

        /**
         * Unique identifier of the parent DeconflictSet, auto-generated by the system. The
         * idDeconflictSet is used to identify all individual windows associated with a parent
         * DeconflictSet record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idDeconflictSet(): Optional<String> = idDeconflictSet.getOptional("idDeconflictSet")

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * The source data library from which this record was received. This could be a remote or
         * tactical UDL or another data library. If null, the record should be assumed to have
         * originated from the primary Enterprise UDL.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

        /**
         * The target identifier. If the target is a satellite, the target is the satellite/catalog
         * number of the target on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun target(): Optional<String> = target.getOptional("target")

        /**
         * The target type associated with this window (e.g. VICTIM, EARTH, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun targetType(): Optional<String> = targetType.getOptional("targetType")

        /**
         * The victim identifier associated with this window. If the victim is a satellite, the
         * victim is the satellite/catalog number of the target on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun victim(): Optional<String> = victim.getOptional("victim")

        /**
         * The window status indicating whether possibility of action may occur. In other words,
         * OPEN is akin to a "green light," during which taking action is warranted or authorized
         * (though not necessarily required) over this timeframe, while CLOSED represents a "red
         * light," meaning that absolutely no action is warranted or authorized to take place during
         * this timeframe.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun windowType(): Optional<String> = windowType.getOptional("windowType")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [eventStartTime].
         *
         * Unlike [eventStartTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("eventStartTime")
        @ExcludeMissing
        fun _eventStartTime(): JsonField<OffsetDateTime> = eventStartTime

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startTime")
        @ExcludeMissing
        fun _startTime(): JsonField<OffsetDateTime> = startTime

        /**
         * Returns the raw JSON value of [stopTime].
         *
         * Unlike [stopTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stopTime")
        @ExcludeMissing
        fun _stopTime(): JsonField<OffsetDateTime> = stopTime

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [angleOfEntry].
         *
         * Unlike [angleOfEntry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("angleOfEntry")
        @ExcludeMissing
        fun _angleOfEntry(): JsonField<Double> = angleOfEntry

        /**
         * Returns the raw JSON value of [angleOfExit].
         *
         * Unlike [angleOfExit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("angleOfExit")
        @ExcludeMissing
        fun _angleOfExit(): JsonField<Double> = angleOfExit

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
         * Returns the raw JSON value of [entryCoords].
         *
         * Unlike [entryCoords], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entryCoords")
        @ExcludeMissing
        fun _entryCoords(): JsonField<List<Double>> = entryCoords

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eventType") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

        /**
         * Returns the raw JSON value of [exitCoords].
         *
         * Unlike [exitCoords], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("exitCoords")
        @ExcludeMissing
        fun _exitCoords(): JsonField<List<Double>> = exitCoords

        /**
         * Returns the raw JSON value of [idDeconflictSet].
         *
         * Unlike [idDeconflictSet], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idDeconflictSet")
        @ExcludeMissing
        fun _idDeconflictSet(): JsonField<String> = idDeconflictSet

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
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [sourceDl].
         *
         * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

        /**
         * Returns the raw JSON value of [target].
         *
         * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<String> = target

        /**
         * Returns the raw JSON value of [targetType].
         *
         * Unlike [targetType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("targetType")
        @ExcludeMissing
        fun _targetType(): JsonField<String> = targetType

        /**
         * Returns the raw JSON value of [victim].
         *
         * Unlike [victim], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("victim") @ExcludeMissing fun _victim(): JsonField<String> = victim

        /**
         * Returns the raw JSON value of [windowType].
         *
         * Unlike [windowType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("windowType")
        @ExcludeMissing
        fun _windowType(): JsonField<String> = windowType

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
             * Returns a mutable builder for constructing an instance of [DeconflictWindow].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .eventStartTime()
             * .source()
             * .startTime()
             * .stopTime()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DeconflictWindow]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var eventStartTime: JsonField<OffsetDateTime>? = null
            private var source: JsonField<String>? = null
            private var startTime: JsonField<OffsetDateTime>? = null
            private var stopTime: JsonField<OffsetDateTime>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var angleOfEntry: JsonField<Double> = JsonMissing.of()
            private var angleOfExit: JsonField<Double> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var entryCoords: JsonField<MutableList<Double>>? = null
            private var eventType: JsonField<String> = JsonMissing.of()
            private var exitCoords: JsonField<MutableList<Double>>? = null
            private var idDeconflictSet: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var target: JsonField<String> = JsonMissing.of()
            private var targetType: JsonField<String> = JsonMissing.of()
            private var victim: JsonField<String> = JsonMissing.of()
            private var windowType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deconflictWindow: DeconflictWindow) = apply {
                classificationMarking = deconflictWindow.classificationMarking
                dataMode = deconflictWindow.dataMode
                eventStartTime = deconflictWindow.eventStartTime
                source = deconflictWindow.source
                startTime = deconflictWindow.startTime
                stopTime = deconflictWindow.stopTime
                id = deconflictWindow.id
                angleOfEntry = deconflictWindow.angleOfEntry
                angleOfExit = deconflictWindow.angleOfExit
                createdAt = deconflictWindow.createdAt
                createdBy = deconflictWindow.createdBy
                entryCoords = deconflictWindow.entryCoords.map { it.toMutableList() }
                eventType = deconflictWindow.eventType
                exitCoords = deconflictWindow.exitCoords.map { it.toMutableList() }
                idDeconflictSet = deconflictWindow.idDeconflictSet
                origin = deconflictWindow.origin
                origNetwork = deconflictWindow.origNetwork
                sourceDl = deconflictWindow.sourceDl
                target = deconflictWindow.target
                targetType = deconflictWindow.targetType
                victim = deconflictWindow.victim
                windowType = deconflictWindow.windowType
                additionalProperties = deconflictWindow.additionalProperties.toMutableMap()
            }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            /**
             * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

            /**
             * The start time of the event associated with the set of DeconflictWindow records, in
             * ISO 8601 UTC format with millisecond precision.
             */
            fun eventStartTime(eventStartTime: OffsetDateTime) =
                eventStartTime(JsonField.of(eventStartTime))

            /**
             * Sets [Builder.eventStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun eventStartTime(eventStartTime: JsonField<OffsetDateTime>) = apply {
                this.eventStartTime = eventStartTime
            }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** The window start time, in ISO 8601 UTC format with millisecond precision. */
            fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                this.startTime = startTime
            }

            /** The window stop time, in ISO 8601 UTC format with millisecond precision. */
            fun stopTime(stopTime: OffsetDateTime) = stopTime(JsonField.of(stopTime))

            /**
             * Sets [Builder.stopTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stopTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stopTime(stopTime: JsonField<OffsetDateTime>) = apply { this.stopTime = stopTime }

            /**
             * Unique identifier of the record, auto-generated by the system if not provided on
             * create operations.
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The angle at which the victim enters the target zone in reference to the emitter
             * source location, in degrees.
             */
            fun angleOfEntry(angleOfEntry: Double) = angleOfEntry(JsonField.of(angleOfEntry))

            /**
             * Sets [Builder.angleOfEntry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.angleOfEntry] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun angleOfEntry(angleOfEntry: JsonField<Double>) = apply {
                this.angleOfEntry = angleOfEntry
            }

            /**
             * The angle at which the victim exits the target zone in reference to the emitter
             * source location, in degrees.
             */
            fun angleOfExit(angleOfExit: Double) = angleOfExit(JsonField.of(angleOfExit))

            /**
             * Sets [Builder.angleOfExit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.angleOfExit] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun angleOfExit(angleOfExit: JsonField<Double>) = apply {
                this.angleOfExit = angleOfExit
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Application user who created the row in the database, auto-populated by the system.
             */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /**
             * The X, Y, Z coordinates of entry, in the reference frame specified by the parent
             * DeconflictSet record, in meters.
             */
            fun entryCoords(entryCoords: List<Double>) = entryCoords(JsonField.of(entryCoords))

            /**
             * Sets [Builder.entryCoords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entryCoords] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryCoords(entryCoords: JsonField<List<Double>>) = apply {
                this.entryCoords = entryCoords.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [entryCoords].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEntryCoord(entryCoord: Double) = apply {
                entryCoords =
                    (entryCoords ?: JsonField.of(mutableListOf())).also {
                        checkKnown("entryCoords", it).add(entryCoord)
                    }
            }

            /** The type of event associated with the window status. */
            fun eventType(eventType: String) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

            /**
             * The X, Y, Z coordinates of exit, in the reference frame specified by the parent
             * DeconflictSet record, in meters.
             */
            fun exitCoords(exitCoords: List<Double>) = exitCoords(JsonField.of(exitCoords))

            /**
             * Sets [Builder.exitCoords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exitCoords] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exitCoords(exitCoords: JsonField<List<Double>>) = apply {
                this.exitCoords = exitCoords.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [exitCoords].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExitCoord(exitCoord: Double) = apply {
                exitCoords =
                    (exitCoords ?: JsonField.of(mutableListOf())).also {
                        checkKnown("exitCoords", it).add(exitCoord)
                    }
            }

            /**
             * Unique identifier of the parent DeconflictSet, auto-generated by the system. The
             * idDeconflictSet is used to identify all individual windows associated with a parent
             * DeconflictSet record.
             */
            fun idDeconflictSet(idDeconflictSet: String) =
                idDeconflictSet(JsonField.of(idDeconflictSet))

            /**
             * Sets [Builder.idDeconflictSet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idDeconflictSet] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idDeconflictSet(idDeconflictSet: JsonField<String>) = apply {
                this.idDeconflictSet = idDeconflictSet
            }

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) = apply {
                this.origNetwork = origNetwork
            }

            /**
             * The source data library from which this record was received. This could be a remote
             * or tactical UDL or another data library. If null, the record should be assumed to
             * have originated from the primary Enterprise UDL.
             */
            fun sourceDl(sourceDl: String) = sourceDl(JsonField.of(sourceDl))

            /**
             * Sets [Builder.sourceDl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceDl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceDl(sourceDl: JsonField<String>) = apply { this.sourceDl = sourceDl }

            /**
             * The target identifier. If the target is a satellite, the target is the
             * satellite/catalog number of the target on-orbit object.
             */
            fun target(target: String) = target(JsonField.of(target))

            /**
             * Sets [Builder.target] to an arbitrary JSON value.
             *
             * You should usually call [Builder.target] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun target(target: JsonField<String>) = apply { this.target = target }

            /** The target type associated with this window (e.g. VICTIM, EARTH, etc.). */
            fun targetType(targetType: String) = targetType(JsonField.of(targetType))

            /**
             * Sets [Builder.targetType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetType(targetType: JsonField<String>) = apply { this.targetType = targetType }

            /**
             * The victim identifier associated with this window. If the victim is a satellite, the
             * victim is the satellite/catalog number of the target on-orbit object.
             */
            fun victim(victim: String) = victim(JsonField.of(victim))

            /**
             * Sets [Builder.victim] to an arbitrary JSON value.
             *
             * You should usually call [Builder.victim] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun victim(victim: JsonField<String>) = apply { this.victim = victim }

            /**
             * The window status indicating whether possibility of action may occur. In other words,
             * OPEN is akin to a "green light," during which taking action is warranted or
             * authorized (though not necessarily required) over this timeframe, while CLOSED
             * represents a "red light," meaning that absolutely no action is warranted or
             * authorized to take place during this timeframe.
             */
            fun windowType(windowType: String) = windowType(JsonField.of(windowType))

            /**
             * Sets [Builder.windowType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.windowType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun windowType(windowType: JsonField<String>) = apply { this.windowType = windowType }

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
             * Returns an immutable instance of [DeconflictWindow].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .eventStartTime()
             * .source()
             * .startTime()
             * .stopTime()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DeconflictWindow =
                DeconflictWindow(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("eventStartTime", eventStartTime),
                    checkRequired("source", source),
                    checkRequired("startTime", startTime),
                    checkRequired("stopTime", stopTime),
                    id,
                    angleOfEntry,
                    angleOfExit,
                    createdAt,
                    createdBy,
                    (entryCoords ?: JsonMissing.of()).map { it.toImmutable() },
                    eventType,
                    (exitCoords ?: JsonMissing.of()).map { it.toImmutable() },
                    idDeconflictSet,
                    origin,
                    origNetwork,
                    sourceDl,
                    target,
                    targetType,
                    victim,
                    windowType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DeconflictWindow = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            eventStartTime()
            source()
            startTime()
            stopTime()
            id()
            angleOfEntry()
            angleOfExit()
            createdAt()
            createdBy()
            entryCoords()
            eventType()
            exitCoords()
            idDeconflictSet()
            origin()
            origNetwork()
            sourceDl()
            target()
            targetType()
            victim()
            windowType()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (eventStartTime.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (if (stopTime.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (angleOfEntry.asKnown().isPresent) 1 else 0) +
                (if (angleOfExit.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (entryCoords.asKnown().getOrNull()?.size ?: 0) +
                (if (eventType.asKnown().isPresent) 1 else 0) +
                (exitCoords.asKnown().getOrNull()?.size ?: 0) +
                (if (idDeconflictSet.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (sourceDl.asKnown().isPresent) 1 else 0) +
                (if (target.asKnown().isPresent) 1 else 0) +
                (if (targetType.asKnown().isPresent) 1 else 0) +
                (if (victim.asKnown().isPresent) 1 else 0) +
                (if (windowType.asKnown().isPresent) 1 else 0)

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
        class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REAL,
                TEST,
                SIMULATED,
                EXERCISE,
                /**
                 * An enum member indicating that [DataMode] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

            return other is DeconflictWindow &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                eventStartTime == other.eventStartTime &&
                source == other.source &&
                startTime == other.startTime &&
                stopTime == other.stopTime &&
                id == other.id &&
                angleOfEntry == other.angleOfEntry &&
                angleOfExit == other.angleOfExit &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                entryCoords == other.entryCoords &&
                eventType == other.eventType &&
                exitCoords == other.exitCoords &&
                idDeconflictSet == other.idDeconflictSet &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                sourceDl == other.sourceDl &&
                target == other.target &&
                targetType == other.targetType &&
                victim == other.victim &&
                windowType == other.windowType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                eventStartTime,
                source,
                startTime,
                stopTime,
                id,
                angleOfEntry,
                angleOfExit,
                createdAt,
                createdBy,
                entryCoords,
                eventType,
                exitCoords,
                idDeconflictSet,
                origin,
                origNetwork,
                sourceDl,
                target,
                targetType,
                victim,
                windowType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DeconflictWindow{classificationMarking=$classificationMarking, dataMode=$dataMode, eventStartTime=$eventStartTime, source=$source, startTime=$startTime, stopTime=$stopTime, id=$id, angleOfEntry=$angleOfEntry, angleOfExit=$angleOfExit, createdAt=$createdAt, createdBy=$createdBy, entryCoords=$entryCoords, eventType=$eventType, exitCoords=$exitCoords, idDeconflictSet=$idDeconflictSet, origin=$origin, origNetwork=$origNetwork, sourceDl=$sourceDl, target=$target, targetType=$targetType, victim=$victim, windowType=$windowType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HistoryListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            eventStartTime == other.eventStartTime &&
            numWindows == other.numWindows &&
            source == other.source &&
            id == other.id &&
            calculationEndTime == other.calculationEndTime &&
            calculationId == other.calculationId &&
            calculationStartTime == other.calculationStartTime &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            deconflictWindows == other.deconflictWindows &&
            errors == other.errors &&
            eventEndTime == other.eventEndTime &&
            eventType == other.eventType &&
            idLaserDeconflictRequest == other.idLaserDeconflictRequest &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            referenceFrame == other.referenceFrame &&
            sourceDl == other.sourceDl &&
            tags == other.tags &&
            transactionId == other.transactionId &&
            warnings == other.warnings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            eventStartTime,
            numWindows,
            source,
            id,
            calculationEndTime,
            calculationId,
            calculationStartTime,
            createdAt,
            createdBy,
            deconflictWindows,
            errors,
            eventEndTime,
            eventType,
            idLaserDeconflictRequest,
            origin,
            origNetwork,
            referenceFrame,
            sourceDl,
            tags,
            transactionId,
            warnings,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HistoryListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, eventStartTime=$eventStartTime, numWindows=$numWindows, source=$source, id=$id, calculationEndTime=$calculationEndTime, calculationId=$calculationId, calculationStartTime=$calculationStartTime, createdAt=$createdAt, createdBy=$createdBy, deconflictWindows=$deconflictWindows, errors=$errors, eventEndTime=$eventEndTime, eventType=$eventType, idLaserDeconflictRequest=$idLaserDeconflictRequest, origin=$origin, origNetwork=$origNetwork, referenceFrame=$referenceFrame, sourceDl=$sourceDl, tags=$tags, transactionId=$transactionId, warnings=$warnings, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.deconflictset

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
class DeconflictsetListResponse
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
         * Returns a mutable builder for constructing an instance of [DeconflictsetListResponse].
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

    /** A builder for [DeconflictsetListResponse]. */
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
        internal fun from(deconflictsetListResponse: DeconflictsetListResponse) = apply {
            classificationMarking = deconflictsetListResponse.classificationMarking
            dataMode = deconflictsetListResponse.dataMode
            eventStartTime = deconflictsetListResponse.eventStartTime
            numWindows = deconflictsetListResponse.numWindows
            source = deconflictsetListResponse.source
            id = deconflictsetListResponse.id
            calculationEndTime = deconflictsetListResponse.calculationEndTime
            calculationId = deconflictsetListResponse.calculationId
            calculationStartTime = deconflictsetListResponse.calculationStartTime
            createdAt = deconflictsetListResponse.createdAt
            createdBy = deconflictsetListResponse.createdBy
            errors = deconflictsetListResponse.errors.map { it.toMutableList() }
            eventEndTime = deconflictsetListResponse.eventEndTime
            eventType = deconflictsetListResponse.eventType
            idLaserDeconflictRequest = deconflictsetListResponse.idLaserDeconflictRequest
            origin = deconflictsetListResponse.origin
            origNetwork = deconflictsetListResponse.origNetwork
            referenceFrame = deconflictsetListResponse.referenceFrame
            sourceDl = deconflictsetListResponse.sourceDl
            tags = deconflictsetListResponse.tags.map { it.toMutableList() }
            transactionId = deconflictsetListResponse.transactionId
            warnings = deconflictsetListResponse.warnings.map { it.toMutableList() }
            additionalProperties = deconflictsetListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [DeconflictsetListResponse].
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
        fun build(): DeconflictsetListResponse =
            DeconflictsetListResponse(
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

    fun validate(): DeconflictsetListResponse = apply {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DeconflictsetListResponse &&
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
        "DeconflictsetListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, eventStartTime=$eventStartTime, numWindows=$numWindows, source=$source, id=$id, calculationEndTime=$calculationEndTime, calculationId=$calculationId, calculationStartTime=$calculationStartTime, createdAt=$createdAt, createdBy=$createdBy, errors=$errors, eventEndTime=$eventEndTime, eventType=$eventType, idLaserDeconflictRequest=$idLaserDeconflictRequest, origin=$origin, origNetwork=$origNetwork, referenceFrame=$referenceFrame, sourceDl=$sourceDl, tags=$tags, transactionId=$transactionId, warnings=$warnings, additionalProperties=$additionalProperties}"
}

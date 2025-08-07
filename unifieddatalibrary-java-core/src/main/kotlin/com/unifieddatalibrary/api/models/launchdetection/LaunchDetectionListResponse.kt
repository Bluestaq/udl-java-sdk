// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchdetection

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

/** Data to analyze launch detections. */
class LaunchDetectionListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val messageType: JsonField<String>,
    private val observationLatitude: JsonField<Double>,
    private val observationLongitude: JsonField<Double>,
    private val observationTime: JsonField<OffsetDateTime>,
    private val sequenceNumber: JsonField<Int>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val eventId: JsonField<String>,
    private val highZenithAzimuth: JsonField<Boolean>,
    private val inclination: JsonField<Double>,
    private val launchAzimuth: JsonField<Double>,
    private val launchLatitude: JsonField<Double>,
    private val launchLongitude: JsonField<Double>,
    private val launchTime: JsonField<OffsetDateTime>,
    private val observationAltitude: JsonField<Double>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val raan: JsonField<Double>,
    private val stereoFlag: JsonField<Boolean>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("messageType")
        @ExcludeMissing
        messageType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("observationLatitude")
        @ExcludeMissing
        observationLatitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("observationLongitude")
        @ExcludeMissing
        observationLongitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("observationTime")
        @ExcludeMissing
        observationTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sequenceNumber")
        @ExcludeMissing
        sequenceNumber: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventId") @ExcludeMissing eventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("highZenithAzimuth")
        @ExcludeMissing
        highZenithAzimuth: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("inclination")
        @ExcludeMissing
        inclination: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchAzimuth")
        @ExcludeMissing
        launchAzimuth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchLatitude")
        @ExcludeMissing
        launchLatitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchLongitude")
        @ExcludeMissing
        launchLongitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchTime")
        @ExcludeMissing
        launchTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("observationAltitude")
        @ExcludeMissing
        observationAltitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("raan") @ExcludeMissing raan: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("stereoFlag")
        @ExcludeMissing
        stereoFlag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        messageType,
        observationLatitude,
        observationLongitude,
        observationTime,
        sequenceNumber,
        source,
        id,
        createdAt,
        createdBy,
        descriptor,
        eventId,
        highZenithAzimuth,
        inclination,
        launchAzimuth,
        launchLatitude,
        launchLongitude,
        launchTime,
        observationAltitude,
        origin,
        origNetwork,
        raan,
        stereoFlag,
        updatedAt,
        updatedBy,
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
     * Type of message for the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageType(): String = messageType.getRequired("messageType")

    /**
     * Latitude of launch vehicle at observation time (in Degrees). -90 to 90 degrees (negative
     * values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun observationLatitude(): Double = observationLatitude.getRequired("observationLatitude")

    /**
     * Longitude of launch vehicle at observation time (in Degrees).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun observationLongitude(): Double = observationLongitude.getRequired("observationLongitude")

    /**
     * Time of observation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun observationTime(): OffsetDateTime = observationTime.getRequired("observationTime")

    /**
     * Integer indicating how messages should be sequenced for a specific event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sequenceNumber(): Int = sequenceNumber.getRequired("sequenceNumber")

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
     * Time the row was created in the database.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Application user who created the row in the database.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * Optional source-provided and searchable metadata or descriptor of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun descriptor(): Optional<String> = descriptor.getOptional("descriptor")

    /**
     * Id to be able to correlate different messages to a specific event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eventId(): Optional<String> = eventId.getOptional("eventId")

    /**
     * Flag indicating that the Launch azimuth is uncertain due to near vertical flight path.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun highZenithAzimuth(): Optional<Boolean> = highZenithAzimuth.getOptional("highZenithAzimuth")

    /**
     * Orbit Inclination (in Degrees).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun inclination(): Optional<Double> = inclination.getOptional("inclination")

    /**
     * Angle measured clockwise from North for the launch heading (in Degrees).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchAzimuth(): Optional<Double> = launchAzimuth.getOptional("launchAzimuth")

    /**
     * Geodetic Latitude of launch origin (in Degrees). -90 to 90 degrees (negative values south of
     * equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchLatitude(): Optional<Double> = launchLatitude.getOptional("launchLatitude")

    /**
     * Geodetic Longitude of launch origin (in Degrees). -180 to 180 degrees (negative values west
     * of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchLongitude(): Optional<Double> = launchLongitude.getOptional("launchLongitude")

    /**
     * Time of Launch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchTime(): Optional<OffsetDateTime> = launchTime.getOptional("launchTime")

    /**
     * Altitude of launch vehicle at observation time (in KM).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun observationAltitude(): Optional<Double> =
        observationAltitude.getOptional("observationAltitude")

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
     * Orbit Right Ascension of Ascending Node (in Degrees).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun raan(): Optional<Double> = raan.getOptional("raan")

    /**
     * Flag indicating multiple observers were used.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stereoFlag(): Optional<Boolean> = stereoFlag.getOptional("stereoFlag")

    /**
     * Read-only time the row was updated in the database, set automatically by the system on
     * update.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Application user who last updated the row in the database, set by the system automatically
     * and ignored on create/edit operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

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
     * Returns the raw JSON value of [messageType].
     *
     * Unlike [messageType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messageType") @ExcludeMissing fun _messageType(): JsonField<String> = messageType

    /**
     * Returns the raw JSON value of [observationLatitude].
     *
     * Unlike [observationLatitude], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("observationLatitude")
    @ExcludeMissing
    fun _observationLatitude(): JsonField<Double> = observationLatitude

    /**
     * Returns the raw JSON value of [observationLongitude].
     *
     * Unlike [observationLongitude], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("observationLongitude")
    @ExcludeMissing
    fun _observationLongitude(): JsonField<Double> = observationLongitude

    /**
     * Returns the raw JSON value of [observationTime].
     *
     * Unlike [observationTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("observationTime")
    @ExcludeMissing
    fun _observationTime(): JsonField<OffsetDateTime> = observationTime

    /**
     * Returns the raw JSON value of [sequenceNumber].
     *
     * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sequenceNumber")
    @ExcludeMissing
    fun _sequenceNumber(): JsonField<Int> = sequenceNumber

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
     * Returns the raw JSON value of [descriptor].
     *
     * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor(): JsonField<String> = descriptor

    /**
     * Returns the raw JSON value of [eventId].
     *
     * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventId") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

    /**
     * Returns the raw JSON value of [highZenithAzimuth].
     *
     * Unlike [highZenithAzimuth], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("highZenithAzimuth")
    @ExcludeMissing
    fun _highZenithAzimuth(): JsonField<Boolean> = highZenithAzimuth

    /**
     * Returns the raw JSON value of [inclination].
     *
     * Unlike [inclination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inclination") @ExcludeMissing fun _inclination(): JsonField<Double> = inclination

    /**
     * Returns the raw JSON value of [launchAzimuth].
     *
     * Unlike [launchAzimuth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchAzimuth")
    @ExcludeMissing
    fun _launchAzimuth(): JsonField<Double> = launchAzimuth

    /**
     * Returns the raw JSON value of [launchLatitude].
     *
     * Unlike [launchLatitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchLatitude")
    @ExcludeMissing
    fun _launchLatitude(): JsonField<Double> = launchLatitude

    /**
     * Returns the raw JSON value of [launchLongitude].
     *
     * Unlike [launchLongitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchLongitude")
    @ExcludeMissing
    fun _launchLongitude(): JsonField<Double> = launchLongitude

    /**
     * Returns the raw JSON value of [launchTime].
     *
     * Unlike [launchTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchTime")
    @ExcludeMissing
    fun _launchTime(): JsonField<OffsetDateTime> = launchTime

    /**
     * Returns the raw JSON value of [observationAltitude].
     *
     * Unlike [observationAltitude], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("observationAltitude")
    @ExcludeMissing
    fun _observationAltitude(): JsonField<Double> = observationAltitude

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
     * Returns the raw JSON value of [raan].
     *
     * Unlike [raan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("raan") @ExcludeMissing fun _raan(): JsonField<Double> = raan

    /**
     * Returns the raw JSON value of [stereoFlag].
     *
     * Unlike [stereoFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stereoFlag") @ExcludeMissing fun _stereoFlag(): JsonField<Boolean> = stereoFlag

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [updatedBy].
     *
     * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedBy") @ExcludeMissing fun _updatedBy(): JsonField<String> = updatedBy

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
         * Returns a mutable builder for constructing an instance of [LaunchDetectionListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .messageType()
         * .observationLatitude()
         * .observationLongitude()
         * .observationTime()
         * .sequenceNumber()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LaunchDetectionListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var messageType: JsonField<String>? = null
        private var observationLatitude: JsonField<Double>? = null
        private var observationLongitude: JsonField<Double>? = null
        private var observationTime: JsonField<OffsetDateTime>? = null
        private var sequenceNumber: JsonField<Int>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var eventId: JsonField<String> = JsonMissing.of()
        private var highZenithAzimuth: JsonField<Boolean> = JsonMissing.of()
        private var inclination: JsonField<Double> = JsonMissing.of()
        private var launchAzimuth: JsonField<Double> = JsonMissing.of()
        private var launchLatitude: JsonField<Double> = JsonMissing.of()
        private var launchLongitude: JsonField<Double> = JsonMissing.of()
        private var launchTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var observationAltitude: JsonField<Double> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var raan: JsonField<Double> = JsonMissing.of()
        private var stereoFlag: JsonField<Boolean> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(launchDetectionListResponse: LaunchDetectionListResponse) = apply {
            classificationMarking = launchDetectionListResponse.classificationMarking
            dataMode = launchDetectionListResponse.dataMode
            messageType = launchDetectionListResponse.messageType
            observationLatitude = launchDetectionListResponse.observationLatitude
            observationLongitude = launchDetectionListResponse.observationLongitude
            observationTime = launchDetectionListResponse.observationTime
            sequenceNumber = launchDetectionListResponse.sequenceNumber
            source = launchDetectionListResponse.source
            id = launchDetectionListResponse.id
            createdAt = launchDetectionListResponse.createdAt
            createdBy = launchDetectionListResponse.createdBy
            descriptor = launchDetectionListResponse.descriptor
            eventId = launchDetectionListResponse.eventId
            highZenithAzimuth = launchDetectionListResponse.highZenithAzimuth
            inclination = launchDetectionListResponse.inclination
            launchAzimuth = launchDetectionListResponse.launchAzimuth
            launchLatitude = launchDetectionListResponse.launchLatitude
            launchLongitude = launchDetectionListResponse.launchLongitude
            launchTime = launchDetectionListResponse.launchTime
            observationAltitude = launchDetectionListResponse.observationAltitude
            origin = launchDetectionListResponse.origin
            origNetwork = launchDetectionListResponse.origNetwork
            raan = launchDetectionListResponse.raan
            stereoFlag = launchDetectionListResponse.stereoFlag
            updatedAt = launchDetectionListResponse.updatedAt
            updatedBy = launchDetectionListResponse.updatedBy
            additionalProperties = launchDetectionListResponse.additionalProperties.toMutableMap()
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

        /** Type of message for the data. */
        fun messageType(messageType: String) = messageType(JsonField.of(messageType))

        /**
         * Sets [Builder.messageType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageType(messageType: JsonField<String>) = apply { this.messageType = messageType }

        /**
         * Latitude of launch vehicle at observation time (in Degrees). -90 to 90 degrees (negative
         * values south of equator).
         */
        fun observationLatitude(observationLatitude: Double) =
            observationLatitude(JsonField.of(observationLatitude))

        /**
         * Sets [Builder.observationLatitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observationLatitude] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun observationLatitude(observationLatitude: JsonField<Double>) = apply {
            this.observationLatitude = observationLatitude
        }

        /** Longitude of launch vehicle at observation time (in Degrees). */
        fun observationLongitude(observationLongitude: Double) =
            observationLongitude(JsonField.of(observationLongitude))

        /**
         * Sets [Builder.observationLongitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observationLongitude] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun observationLongitude(observationLongitude: JsonField<Double>) = apply {
            this.observationLongitude = observationLongitude
        }

        /** Time of observation. */
        fun observationTime(observationTime: OffsetDateTime) =
            observationTime(JsonField.of(observationTime))

        /**
         * Sets [Builder.observationTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observationTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun observationTime(observationTime: JsonField<OffsetDateTime>) = apply {
            this.observationTime = observationTime
        }

        /** Integer indicating how messages should be sequenced for a specific event. */
        fun sequenceNumber(sequenceNumber: Int) = sequenceNumber(JsonField.of(sequenceNumber))

        /**
         * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sequenceNumber] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sequenceNumber(sequenceNumber: JsonField<Int>) = apply {
            this.sequenceNumber = sequenceNumber
        }

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

        /** Time the row was created in the database. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Application user who created the row in the database. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** Optional source-provided and searchable metadata or descriptor of the data. */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * Sets [Builder.descriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.descriptor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /** Id to be able to correlate different messages to a specific event. */
        fun eventId(eventId: String) = eventId(JsonField.of(eventId))

        /**
         * Sets [Builder.eventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

        /**
         * Flag indicating that the Launch azimuth is uncertain due to near vertical flight path.
         */
        fun highZenithAzimuth(highZenithAzimuth: Boolean) =
            highZenithAzimuth(JsonField.of(highZenithAzimuth))

        /**
         * Sets [Builder.highZenithAzimuth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highZenithAzimuth] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun highZenithAzimuth(highZenithAzimuth: JsonField<Boolean>) = apply {
            this.highZenithAzimuth = highZenithAzimuth
        }

        /** Orbit Inclination (in Degrees). */
        fun inclination(inclination: Double) = inclination(JsonField.of(inclination))

        /**
         * Sets [Builder.inclination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inclination] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inclination(inclination: JsonField<Double>) = apply { this.inclination = inclination }

        /** Angle measured clockwise from North for the launch heading (in Degrees). */
        fun launchAzimuth(launchAzimuth: Double) = launchAzimuth(JsonField.of(launchAzimuth))

        /**
         * Sets [Builder.launchAzimuth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchAzimuth] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchAzimuth(launchAzimuth: JsonField<Double>) = apply {
            this.launchAzimuth = launchAzimuth
        }

        /**
         * Geodetic Latitude of launch origin (in Degrees). -90 to 90 degrees (negative values south
         * of equator).
         */
        fun launchLatitude(launchLatitude: Double) = launchLatitude(JsonField.of(launchLatitude))

        /**
         * Sets [Builder.launchLatitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchLatitude] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchLatitude(launchLatitude: JsonField<Double>) = apply {
            this.launchLatitude = launchLatitude
        }

        /**
         * Geodetic Longitude of launch origin (in Degrees). -180 to 180 degrees (negative values
         * west of Prime Meridian).
         */
        fun launchLongitude(launchLongitude: Double) =
            launchLongitude(JsonField.of(launchLongitude))

        /**
         * Sets [Builder.launchLongitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchLongitude] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchLongitude(launchLongitude: JsonField<Double>) = apply {
            this.launchLongitude = launchLongitude
        }

        /** Time of Launch. */
        fun launchTime(launchTime: OffsetDateTime) = launchTime(JsonField.of(launchTime))

        /**
         * Sets [Builder.launchTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchTime(launchTime: JsonField<OffsetDateTime>) = apply {
            this.launchTime = launchTime
        }

        /** Altitude of launch vehicle at observation time (in KM). */
        fun observationAltitude(observationAltitude: Double) =
            observationAltitude(JsonField.of(observationAltitude))

        /**
         * Sets [Builder.observationAltitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observationAltitude] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun observationAltitude(observationAltitude: JsonField<Double>) = apply {
            this.observationAltitude = observationAltitude
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

        /** Orbit Right Ascension of Ascending Node (in Degrees). */
        fun raan(raan: Double) = raan(JsonField.of(raan))

        /**
         * Sets [Builder.raan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.raan] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun raan(raan: JsonField<Double>) = apply { this.raan = raan }

        /** Flag indicating multiple observers were used. */
        fun stereoFlag(stereoFlag: Boolean) = stereoFlag(JsonField.of(stereoFlag))

        /**
         * Sets [Builder.stereoFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stereoFlag] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stereoFlag(stereoFlag: JsonField<Boolean>) = apply { this.stereoFlag = stereoFlag }

        /**
         * Read-only time the row was updated in the database, set automatically by the system on
         * update.
         */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * Application user who last updated the row in the database, set by the system
         * automatically and ignored on create/edit operations.
         */
        fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

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
         * Returns an immutable instance of [LaunchDetectionListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .messageType()
         * .observationLatitude()
         * .observationLongitude()
         * .observationTime()
         * .sequenceNumber()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LaunchDetectionListResponse =
            LaunchDetectionListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("messageType", messageType),
                checkRequired("observationLatitude", observationLatitude),
                checkRequired("observationLongitude", observationLongitude),
                checkRequired("observationTime", observationTime),
                checkRequired("sequenceNumber", sequenceNumber),
                checkRequired("source", source),
                id,
                createdAt,
                createdBy,
                descriptor,
                eventId,
                highZenithAzimuth,
                inclination,
                launchAzimuth,
                launchLatitude,
                launchLongitude,
                launchTime,
                observationAltitude,
                origin,
                origNetwork,
                raan,
                stereoFlag,
                updatedAt,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LaunchDetectionListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        messageType()
        observationLatitude()
        observationLongitude()
        observationTime()
        sequenceNumber()
        source()
        id()
        createdAt()
        createdBy()
        descriptor()
        eventId()
        highZenithAzimuth()
        inclination()
        launchAzimuth()
        launchLatitude()
        launchLongitude()
        launchTime()
        observationAltitude()
        origin()
        origNetwork()
        raan()
        stereoFlag()
        updatedAt()
        updatedBy()
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
            (if (messageType.asKnown().isPresent) 1 else 0) +
            (if (observationLatitude.asKnown().isPresent) 1 else 0) +
            (if (observationLongitude.asKnown().isPresent) 1 else 0) +
            (if (observationTime.asKnown().isPresent) 1 else 0) +
            (if (sequenceNumber.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (descriptor.asKnown().isPresent) 1 else 0) +
            (if (eventId.asKnown().isPresent) 1 else 0) +
            (if (highZenithAzimuth.asKnown().isPresent) 1 else 0) +
            (if (inclination.asKnown().isPresent) 1 else 0) +
            (if (launchAzimuth.asKnown().isPresent) 1 else 0) +
            (if (launchLatitude.asKnown().isPresent) 1 else 0) +
            (if (launchLongitude.asKnown().isPresent) 1 else 0) +
            (if (launchTime.asKnown().isPresent) 1 else 0) +
            (if (observationAltitude.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (raan.asKnown().isPresent) 1 else 0) +
            (if (stereoFlag.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0)

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

            return /* spotless:off */ other is DataMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LaunchDetectionListResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && messageType == other.messageType && observationLatitude == other.observationLatitude && observationLongitude == other.observationLongitude && observationTime == other.observationTime && sequenceNumber == other.sequenceNumber && source == other.source && id == other.id && createdAt == other.createdAt && createdBy == other.createdBy && descriptor == other.descriptor && eventId == other.eventId && highZenithAzimuth == other.highZenithAzimuth && inclination == other.inclination && launchAzimuth == other.launchAzimuth && launchLatitude == other.launchLatitude && launchLongitude == other.launchLongitude && launchTime == other.launchTime && observationAltitude == other.observationAltitude && origin == other.origin && origNetwork == other.origNetwork && raan == other.raan && stereoFlag == other.stereoFlag && updatedAt == other.updatedAt && updatedBy == other.updatedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, messageType, observationLatitude, observationLongitude, observationTime, sequenceNumber, source, id, createdAt, createdBy, descriptor, eventId, highZenithAzimuth, inclination, launchAzimuth, launchLatitude, launchLongitude, launchTime, observationAltitude, origin, origNetwork, raan, stereoFlag, updatedAt, updatedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LaunchDetectionListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, messageType=$messageType, observationLatitude=$observationLatitude, observationLongitude=$observationLongitude, observationTime=$observationTime, sequenceNumber=$sequenceNumber, source=$source, id=$id, createdAt=$createdAt, createdBy=$createdBy, descriptor=$descriptor, eventId=$eventId, highZenithAzimuth=$highZenithAzimuth, inclination=$inclination, launchAzimuth=$launchAzimuth, launchLatitude=$launchLatitude, launchLongitude=$launchLongitude, launchTime=$launchTime, observationAltitude=$observationAltitude, origin=$origin, origNetwork=$origNetwork, raan=$raan, stereoFlag=$stereoFlag, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ecpedr

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

/** Energetic Charged Particles (ECP) Environmental Data Records (EDRs). */
class EcpedrTupleResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val ecpedrMeasurements: JsonField<List<EcpedrMeasurement>>,
    private val obTime: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val genSystem: JsonField<String>,
    private val genTime: JsonField<OffsetDateTime>,
    private val idOnOrbit: JsonField<String>,
    private val idSensor: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val satNo: JsonField<Int>,
    private val senPos: JsonField<List<Double>>,
    private val senReferenceFrame: JsonField<SenReferenceFrame>,
    private val sourceDl: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val transactionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("ecpedrMeasurements")
        @ExcludeMissing
        ecpedrMeasurements: JsonField<List<EcpedrMeasurement>> = JsonMissing.of(),
        @JsonProperty("obTime")
        @ExcludeMissing
        obTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("genSystem") @ExcludeMissing genSystem: JsonField<String> = JsonMissing.of(),
        @JsonProperty("genTime")
        @ExcludeMissing
        genTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origSensorId")
        @ExcludeMissing
        origSensorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("senPos") @ExcludeMissing senPos: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("senReferenceFrame")
        @ExcludeMissing
        senReferenceFrame: JsonField<SenReferenceFrame> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        ecpedrMeasurements,
        obTime,
        source,
        id,
        createdAt,
        createdBy,
        genSystem,
        genTime,
        idOnOrbit,
        idSensor,
        origin,
        origNetwork,
        origObjectId,
        origSensorId,
        satNo,
        senPos,
        senReferenceFrame,
        sourceDl,
        tags,
        transactionId,
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
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * Collection of measurements associated with this ECP EDR record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ecpedrMeasurements(): List<EcpedrMeasurement> =
        ecpedrMeasurements.getRequired("ecpedrMeasurements")

    /**
     * Time of the observation, in ISO 8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun obTime(): OffsetDateTime = obTime.getRequired("obTime")

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
     * System which generated the message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun genSystem(): Optional<String> = genSystem.getOptional("genSystem")

    /**
     * Time when message was generated in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun genTime(): Optional<OffsetDateTime> = genTime.getOptional("genTime")

    /**
     * Unique identifier of the on-orbit satellite hosting the sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Unique identifier of the reporting sensor. This ID can be used to obtain additional
     * information on a sensor using the 'get by ID' operation (e.g. /udl/sensor/{id}). For example,
     * the sensor with idSensor = abc would be queried as /udl/sensor/abc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

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
     * Optional identifier provided by the record source to indicate the satellite hosting the
     * sensor. This may be an internal identifier and not necessarily map to a valid satellite
     * number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Optional identifier provided by the observation source to indicate the sensor which produced
     * this observation. This may be an internal identifier and not necessarily a valid sensor ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

    /**
     * Satellite/catalog number of the on-orbit satellite hosting the sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Three element array, expressing the observing spacecraft/sensor position vector components at
     * observation time, in kilometers, in the specified senReferenceFrame. If senReferenceFrame is
     * null then J2000 should be assumed. The array element order is [xpos, ypos, zpos].
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senPos(): Optional<List<Double>> = senPos.getOptional("senPos")

    /**
     * The reference frame of the observing sensor state. If the senReferenceFrame is null it is
     * assumed to be J2000.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senReferenceFrame(): Optional<SenReferenceFrame> =
        senReferenceFrame.getOptional("senReferenceFrame")

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
     * Returns the raw JSON value of [ecpedrMeasurements].
     *
     * Unlike [ecpedrMeasurements], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ecpedrMeasurements")
    @ExcludeMissing
    fun _ecpedrMeasurements(): JsonField<List<EcpedrMeasurement>> = ecpedrMeasurements

    /**
     * Returns the raw JSON value of [obTime].
     *
     * Unlike [obTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obTime") @ExcludeMissing fun _obTime(): JsonField<OffsetDateTime> = obTime

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
     * Returns the raw JSON value of [genSystem].
     *
     * Unlike [genSystem], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("genSystem") @ExcludeMissing fun _genSystem(): JsonField<String> = genSystem

    /**
     * Returns the raw JSON value of [genTime].
     *
     * Unlike [genTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("genTime") @ExcludeMissing fun _genTime(): JsonField<OffsetDateTime> = genTime

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [idSensor].
     *
     * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

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
     * Returns the raw JSON value of [origObjectId].
     *
     * Unlike [origObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origObjectId")
    @ExcludeMissing
    fun _origObjectId(): JsonField<String> = origObjectId

    /**
     * Returns the raw JSON value of [origSensorId].
     *
     * Unlike [origSensorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origSensorId")
    @ExcludeMissing
    fun _origSensorId(): JsonField<String> = origSensorId

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [senPos].
     *
     * Unlike [senPos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senPos") @ExcludeMissing fun _senPos(): JsonField<List<Double>> = senPos

    /**
     * Returns the raw JSON value of [senReferenceFrame].
     *
     * Unlike [senReferenceFrame], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("senReferenceFrame")
    @ExcludeMissing
    fun _senReferenceFrame(): JsonField<SenReferenceFrame> = senReferenceFrame

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
         * Returns a mutable builder for constructing an instance of [EcpedrTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .ecpedrMeasurements()
         * .obTime()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EcpedrTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var ecpedrMeasurements: JsonField<MutableList<EcpedrMeasurement>>? = null
        private var obTime: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var genSystem: JsonField<String> = JsonMissing.of()
        private var genTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var senPos: JsonField<MutableList<Double>>? = null
        private var senReferenceFrame: JsonField<SenReferenceFrame> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ecpedrTupleResponse: EcpedrTupleResponse) = apply {
            classificationMarking = ecpedrTupleResponse.classificationMarking
            dataMode = ecpedrTupleResponse.dataMode
            ecpedrMeasurements = ecpedrTupleResponse.ecpedrMeasurements.map { it.toMutableList() }
            obTime = ecpedrTupleResponse.obTime
            source = ecpedrTupleResponse.source
            id = ecpedrTupleResponse.id
            createdAt = ecpedrTupleResponse.createdAt
            createdBy = ecpedrTupleResponse.createdBy
            genSystem = ecpedrTupleResponse.genSystem
            genTime = ecpedrTupleResponse.genTime
            idOnOrbit = ecpedrTupleResponse.idOnOrbit
            idSensor = ecpedrTupleResponse.idSensor
            origin = ecpedrTupleResponse.origin
            origNetwork = ecpedrTupleResponse.origNetwork
            origObjectId = ecpedrTupleResponse.origObjectId
            origSensorId = ecpedrTupleResponse.origSensorId
            satNo = ecpedrTupleResponse.satNo
            senPos = ecpedrTupleResponse.senPos.map { it.toMutableList() }
            senReferenceFrame = ecpedrTupleResponse.senReferenceFrame
            sourceDl = ecpedrTupleResponse.sourceDl
            tags = ecpedrTupleResponse.tags.map { it.toMutableList() }
            transactionId = ecpedrTupleResponse.transactionId
            additionalProperties = ecpedrTupleResponse.additionalProperties.toMutableMap()
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
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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

        /** Collection of measurements associated with this ECP EDR record. */
        fun ecpedrMeasurements(ecpedrMeasurements: List<EcpedrMeasurement>) =
            ecpedrMeasurements(JsonField.of(ecpedrMeasurements))

        /**
         * Sets [Builder.ecpedrMeasurements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ecpedrMeasurements] with a well-typed
         * `List<EcpedrMeasurement>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun ecpedrMeasurements(ecpedrMeasurements: JsonField<List<EcpedrMeasurement>>) = apply {
            this.ecpedrMeasurements = ecpedrMeasurements.map { it.toMutableList() }
        }

        /**
         * Adds a single [EcpedrMeasurement] to [ecpedrMeasurements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEcpedrMeasurement(ecpedrMeasurement: EcpedrMeasurement) = apply {
            ecpedrMeasurements =
                (ecpedrMeasurements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ecpedrMeasurements", it).add(ecpedrMeasurement)
                }
        }

        /** Time of the observation, in ISO 8601 UTC format with microsecond precision. */
        fun obTime(obTime: OffsetDateTime) = obTime(JsonField.of(obTime))

        /**
         * Sets [Builder.obTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun obTime(obTime: JsonField<OffsetDateTime>) = apply { this.obTime = obTime }

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

        /** System which generated the message. */
        fun genSystem(genSystem: String) = genSystem(JsonField.of(genSystem))

        /**
         * Sets [Builder.genSystem] to an arbitrary JSON value.
         *
         * You should usually call [Builder.genSystem] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun genSystem(genSystem: JsonField<String>) = apply { this.genSystem = genSystem }

        /** Time when message was generated in ISO 8601 UTC format with millisecond precision. */
        fun genTime(genTime: OffsetDateTime) = genTime(JsonField.of(genTime))

        /**
         * Sets [Builder.genTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.genTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun genTime(genTime: JsonField<OffsetDateTime>) = apply { this.genTime = genTime }

        /** Unique identifier of the on-orbit satellite hosting the sensor. */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /**
         * Unique identifier of the reporting sensor. This ID can be used to obtain additional
         * information on a sensor using the 'get by ID' operation (e.g. /udl/sensor/{id}). For
         * example, the sensor with idSensor = abc would be queried as /udl/sensor/abc.
         */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

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
         * Optional identifier provided by the record source to indicate the satellite hosting the
         * sensor. This may be an internal identifier and not necessarily map to a valid satellite
         * number.
         */
        fun origObjectId(origObjectId: String) = origObjectId(JsonField.of(origObjectId))

        /**
         * Sets [Builder.origObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origObjectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origObjectId(origObjectId: JsonField<String>) = apply {
            this.origObjectId = origObjectId
        }

        /**
         * Optional identifier provided by the observation source to indicate the sensor which
         * produced this observation. This may be an internal identifier and not necessarily a valid
         * sensor ID.
         */
        fun origSensorId(origSensorId: String) = origSensorId(JsonField.of(origSensorId))

        /**
         * Sets [Builder.origSensorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origSensorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origSensorId(origSensorId: JsonField<String>) = apply {
            this.origSensorId = origSensorId
        }

        /** Satellite/catalog number of the on-orbit satellite hosting the sensor. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /**
         * Three element array, expressing the observing spacecraft/sensor position vector
         * components at observation time, in kilometers, in the specified senReferenceFrame. If
         * senReferenceFrame is null then J2000 should be assumed. The array element order is
         * [xpos, ypos, zpos].
         */
        fun senPos(senPos: List<Double>) = senPos(JsonField.of(senPos))

        /**
         * Sets [Builder.senPos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senPos] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senPos(senPos: JsonField<List<Double>>) = apply {
            this.senPos = senPos.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [senPos].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSenPo(senPo: Double) = apply {
            senPos =
                (senPos ?: JsonField.of(mutableListOf())).also {
                    checkKnown("senPos", it).add(senPo)
                }
        }

        /**
         * The reference frame of the observing sensor state. If the senReferenceFrame is null it is
         * assumed to be J2000.
         */
        fun senReferenceFrame(senReferenceFrame: SenReferenceFrame) =
            senReferenceFrame(JsonField.of(senReferenceFrame))

        /**
         * Sets [Builder.senReferenceFrame] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senReferenceFrame] with a well-typed [SenReferenceFrame]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun senReferenceFrame(senReferenceFrame: JsonField<SenReferenceFrame>) = apply {
            this.senReferenceFrame = senReferenceFrame
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
         * Returns an immutable instance of [EcpedrTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .ecpedrMeasurements()
         * .obTime()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EcpedrTupleResponse =
            EcpedrTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("ecpedrMeasurements", ecpedrMeasurements).map { it.toImmutable() },
                checkRequired("obTime", obTime),
                checkRequired("source", source),
                id,
                createdAt,
                createdBy,
                genSystem,
                genTime,
                idOnOrbit,
                idSensor,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                satNo,
                (senPos ?: JsonMissing.of()).map { it.toImmutable() },
                senReferenceFrame,
                sourceDl,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                transactionId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EcpedrTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        ecpedrMeasurements().forEach { it.validate() }
        obTime()
        source()
        id()
        createdAt()
        createdBy()
        genSystem()
        genTime()
        idOnOrbit()
        idSensor()
        origin()
        origNetwork()
        origObjectId()
        origSensorId()
        satNo()
        senPos()
        senReferenceFrame().ifPresent { it.validate() }
        sourceDl()
        tags()
        transactionId()
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
            (ecpedrMeasurements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (obTime.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (genSystem.asKnown().isPresent) 1 else 0) +
            (if (genTime.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (senPos.asKnown().getOrNull()?.size ?: 0) +
            (senReferenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0)

    /**
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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

    /** Collection of measurements associated with this ECP EDR record. */
    class EcpedrMeasurement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val obType: JsonField<String>,
        private val obUoM: JsonField<String>,
        private val chanEnergyHigh: JsonField<Double>,
        private val chanEnergyLow: JsonField<Double>,
        private val chanId: JsonField<String>,
        private val chanType: JsonField<String>,
        private val chanUnit: JsonField<String>,
        private val msgNumber: JsonField<Int>,
        private val obValue: JsonField<Double>,
        private val species: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("obType") @ExcludeMissing obType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("obUoM") @ExcludeMissing obUoM: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chanEnergyHigh")
            @ExcludeMissing
            chanEnergyHigh: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("chanEnergyLow")
            @ExcludeMissing
            chanEnergyLow: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("chanId") @ExcludeMissing chanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chanType")
            @ExcludeMissing
            chanType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chanUnit")
            @ExcludeMissing
            chanUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("msgNumber") @ExcludeMissing msgNumber: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("obValue") @ExcludeMissing obValue: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("species") @ExcludeMissing species: JsonField<String> = JsonMissing.of(),
        ) : this(
            obType,
            obUoM,
            chanEnergyHigh,
            chanEnergyLow,
            chanId,
            chanType,
            chanUnit,
            msgNumber,
            obValue,
            species,
            mutableMapOf(),
        )

        /**
         * The type of observation associated with this record. (e.g., FLUX, CHARGE, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun obType(): String = obType.getRequired("obType")

        /**
         * The Unit of Measure associated with this observation. If there are no physical units
         * associated with the measurement, a value of NONE should be specified.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun obUoM(): String = obUoM.getRequired("obUoM")

        /**
         * Higher energy threshold of the channel for event detection and data collection.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun chanEnergyHigh(): Optional<Double> = chanEnergyHigh.getOptional("chanEnergyHigh")

        /**
         * Lower energy threshold of the channel for event detection and data collection.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun chanEnergyLow(): Optional<Double> = chanEnergyLow.getOptional("chanEnergyLow")

        /**
         * Identifier of the channel based on energy levels and particle species.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun chanId(): Optional<String> = chanId.getOptional("chanId")

        /**
         * Type of channel based on the measurement method (e.g., INTEGRAL, DIFFERENTIAL, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun chanType(): Optional<String> = chanType.getOptional("chanType")

        /**
         * Units used for defining channel energy boundaries (e.g., eV, keV, MeV, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun chanUnit(): Optional<String> = chanUnit.getOptional("chanUnit")

        /**
         * Designates a specific group of measurements made.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun msgNumber(): Optional<Int> = msgNumber.getOptional("msgNumber")

        /**
         * A single observation value expressed in the specified unit of measure (obUoM).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obValue(): Optional<Double> = obValue.getOptional("obValue")

        /**
         * Type of particle species being measured by a channel (e.g., ELECTRON, PROTON, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun species(): Optional<String> = species.getOptional("species")

        /**
         * Returns the raw JSON value of [obType].
         *
         * Unlike [obType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obType") @ExcludeMissing fun _obType(): JsonField<String> = obType

        /**
         * Returns the raw JSON value of [obUoM].
         *
         * Unlike [obUoM], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obUoM") @ExcludeMissing fun _obUoM(): JsonField<String> = obUoM

        /**
         * Returns the raw JSON value of [chanEnergyHigh].
         *
         * Unlike [chanEnergyHigh], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("chanEnergyHigh")
        @ExcludeMissing
        fun _chanEnergyHigh(): JsonField<Double> = chanEnergyHigh

        /**
         * Returns the raw JSON value of [chanEnergyLow].
         *
         * Unlike [chanEnergyLow], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("chanEnergyLow")
        @ExcludeMissing
        fun _chanEnergyLow(): JsonField<Double> = chanEnergyLow

        /**
         * Returns the raw JSON value of [chanId].
         *
         * Unlike [chanId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chanId") @ExcludeMissing fun _chanId(): JsonField<String> = chanId

        /**
         * Returns the raw JSON value of [chanType].
         *
         * Unlike [chanType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chanType") @ExcludeMissing fun _chanType(): JsonField<String> = chanType

        /**
         * Returns the raw JSON value of [chanUnit].
         *
         * Unlike [chanUnit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chanUnit") @ExcludeMissing fun _chanUnit(): JsonField<String> = chanUnit

        /**
         * Returns the raw JSON value of [msgNumber].
         *
         * Unlike [msgNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("msgNumber") @ExcludeMissing fun _msgNumber(): JsonField<Int> = msgNumber

        /**
         * Returns the raw JSON value of [obValue].
         *
         * Unlike [obValue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obValue") @ExcludeMissing fun _obValue(): JsonField<Double> = obValue

        /**
         * Returns the raw JSON value of [species].
         *
         * Unlike [species], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("species") @ExcludeMissing fun _species(): JsonField<String> = species

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
             * Returns a mutable builder for constructing an instance of [EcpedrMeasurement].
             *
             * The following fields are required:
             * ```java
             * .obType()
             * .obUoM()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EcpedrMeasurement]. */
        class Builder internal constructor() {

            private var obType: JsonField<String>? = null
            private var obUoM: JsonField<String>? = null
            private var chanEnergyHigh: JsonField<Double> = JsonMissing.of()
            private var chanEnergyLow: JsonField<Double> = JsonMissing.of()
            private var chanId: JsonField<String> = JsonMissing.of()
            private var chanType: JsonField<String> = JsonMissing.of()
            private var chanUnit: JsonField<String> = JsonMissing.of()
            private var msgNumber: JsonField<Int> = JsonMissing.of()
            private var obValue: JsonField<Double> = JsonMissing.of()
            private var species: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ecpedrMeasurement: EcpedrMeasurement) = apply {
                obType = ecpedrMeasurement.obType
                obUoM = ecpedrMeasurement.obUoM
                chanEnergyHigh = ecpedrMeasurement.chanEnergyHigh
                chanEnergyLow = ecpedrMeasurement.chanEnergyLow
                chanId = ecpedrMeasurement.chanId
                chanType = ecpedrMeasurement.chanType
                chanUnit = ecpedrMeasurement.chanUnit
                msgNumber = ecpedrMeasurement.msgNumber
                obValue = ecpedrMeasurement.obValue
                species = ecpedrMeasurement.species
                additionalProperties = ecpedrMeasurement.additionalProperties.toMutableMap()
            }

            /** The type of observation associated with this record. (e.g., FLUX, CHARGE, etc.). */
            fun obType(obType: String) = obType(JsonField.of(obType))

            /**
             * Sets [Builder.obType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obType(obType: JsonField<String>) = apply { this.obType = obType }

            /**
             * The Unit of Measure associated with this observation. If there are no physical units
             * associated with the measurement, a value of NONE should be specified.
             */
            fun obUoM(obUoM: String) = obUoM(JsonField.of(obUoM))

            /**
             * Sets [Builder.obUoM] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obUoM] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obUoM(obUoM: JsonField<String>) = apply { this.obUoM = obUoM }

            /** Higher energy threshold of the channel for event detection and data collection. */
            fun chanEnergyHigh(chanEnergyHigh: Double) =
                chanEnergyHigh(JsonField.of(chanEnergyHigh))

            /**
             * Sets [Builder.chanEnergyHigh] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chanEnergyHigh] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chanEnergyHigh(chanEnergyHigh: JsonField<Double>) = apply {
                this.chanEnergyHigh = chanEnergyHigh
            }

            /** Lower energy threshold of the channel for event detection and data collection. */
            fun chanEnergyLow(chanEnergyLow: Double) = chanEnergyLow(JsonField.of(chanEnergyLow))

            /**
             * Sets [Builder.chanEnergyLow] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chanEnergyLow] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chanEnergyLow(chanEnergyLow: JsonField<Double>) = apply {
                this.chanEnergyLow = chanEnergyLow
            }

            /** Identifier of the channel based on energy levels and particle species. */
            fun chanId(chanId: String) = chanId(JsonField.of(chanId))

            /**
             * Sets [Builder.chanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chanId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chanId(chanId: JsonField<String>) = apply { this.chanId = chanId }

            /**
             * Type of channel based on the measurement method (e.g., INTEGRAL, DIFFERENTIAL, etc.).
             */
            fun chanType(chanType: String) = chanType(JsonField.of(chanType))

            /**
             * Sets [Builder.chanType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chanType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chanType(chanType: JsonField<String>) = apply { this.chanType = chanType }

            /** Units used for defining channel energy boundaries (e.g., eV, keV, MeV, etc.). */
            fun chanUnit(chanUnit: String) = chanUnit(JsonField.of(chanUnit))

            /**
             * Sets [Builder.chanUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chanUnit] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chanUnit(chanUnit: JsonField<String>) = apply { this.chanUnit = chanUnit }

            /** Designates a specific group of measurements made. */
            fun msgNumber(msgNumber: Int) = msgNumber(JsonField.of(msgNumber))

            /**
             * Sets [Builder.msgNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.msgNumber] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun msgNumber(msgNumber: JsonField<Int>) = apply { this.msgNumber = msgNumber }

            /** A single observation value expressed in the specified unit of measure (obUoM). */
            fun obValue(obValue: Double) = obValue(JsonField.of(obValue))

            /**
             * Sets [Builder.obValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obValue] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obValue(obValue: JsonField<Double>) = apply { this.obValue = obValue }

            /**
             * Type of particle species being measured by a channel (e.g., ELECTRON, PROTON, etc.).
             */
            fun species(species: String) = species(JsonField.of(species))

            /**
             * Sets [Builder.species] to an arbitrary JSON value.
             *
             * You should usually call [Builder.species] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun species(species: JsonField<String>) = apply { this.species = species }

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
             * Returns an immutable instance of [EcpedrMeasurement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .obType()
             * .obUoM()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EcpedrMeasurement =
                EcpedrMeasurement(
                    checkRequired("obType", obType),
                    checkRequired("obUoM", obUoM),
                    chanEnergyHigh,
                    chanEnergyLow,
                    chanId,
                    chanType,
                    chanUnit,
                    msgNumber,
                    obValue,
                    species,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): EcpedrMeasurement = apply {
            if (validated) {
                return@apply
            }

            obType()
            obUoM()
            chanEnergyHigh()
            chanEnergyLow()
            chanId()
            chanType()
            chanUnit()
            msgNumber()
            obValue()
            species()
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
            (if (obType.asKnown().isPresent) 1 else 0) +
                (if (obUoM.asKnown().isPresent) 1 else 0) +
                (if (chanEnergyHigh.asKnown().isPresent) 1 else 0) +
                (if (chanEnergyLow.asKnown().isPresent) 1 else 0) +
                (if (chanId.asKnown().isPresent) 1 else 0) +
                (if (chanType.asKnown().isPresent) 1 else 0) +
                (if (chanUnit.asKnown().isPresent) 1 else 0) +
                (if (msgNumber.asKnown().isPresent) 1 else 0) +
                (if (obValue.asKnown().isPresent) 1 else 0) +
                (if (species.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EcpedrMeasurement &&
                obType == other.obType &&
                obUoM == other.obUoM &&
                chanEnergyHigh == other.chanEnergyHigh &&
                chanEnergyLow == other.chanEnergyLow &&
                chanId == other.chanId &&
                chanType == other.chanType &&
                chanUnit == other.chanUnit &&
                msgNumber == other.msgNumber &&
                obValue == other.obValue &&
                species == other.species &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                obType,
                obUoM,
                chanEnergyHigh,
                chanEnergyLow,
                chanId,
                chanType,
                chanUnit,
                msgNumber,
                obValue,
                species,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EcpedrMeasurement{obType=$obType, obUoM=$obUoM, chanEnergyHigh=$chanEnergyHigh, chanEnergyLow=$chanEnergyLow, chanId=$chanId, chanType=$chanType, chanUnit=$chanUnit, msgNumber=$msgNumber, obValue=$obValue, species=$species, additionalProperties=$additionalProperties}"
    }

    /**
     * The reference frame of the observing sensor state. If the senReferenceFrame is null it is
     * assumed to be J2000.
     */
    class SenReferenceFrame @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val J2000 = of("J2000")

            @JvmField val EFG_TDR = of("EFG/TDR")

            @JvmField val ECR_ECEF = of("ECR/ECEF")

            @JvmField val TEME = of("TEME")

            @JvmField val ITRF = of("ITRF")

            @JvmField val GCRF = of("GCRF")

            @JvmStatic fun of(value: String) = SenReferenceFrame(JsonField.of(value))
        }

        /** An enum containing [SenReferenceFrame]'s known values. */
        enum class Known {
            J2000,
            EFG_TDR,
            ECR_ECEF,
            TEME,
            ITRF,
            GCRF,
        }

        /**
         * An enum containing [SenReferenceFrame]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SenReferenceFrame] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            J2000,
            EFG_TDR,
            ECR_ECEF,
            TEME,
            ITRF,
            GCRF,
            /**
             * An enum member indicating that [SenReferenceFrame] was instantiated with an unknown
             * value.
             */
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
                J2000 -> Value.J2000
                EFG_TDR -> Value.EFG_TDR
                ECR_ECEF -> Value.ECR_ECEF
                TEME -> Value.TEME
                ITRF -> Value.ITRF
                GCRF -> Value.GCRF
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
                J2000 -> Known.J2000
                EFG_TDR -> Known.EFG_TDR
                ECR_ECEF -> Known.ECR_ECEF
                TEME -> Known.TEME
                ITRF -> Known.ITRF
                GCRF -> Known.GCRF
                else ->
                    throw UnifieddatalibraryInvalidDataException(
                        "Unknown SenReferenceFrame: $value"
                    )
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

        fun validate(): SenReferenceFrame = apply {
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

            return other is SenReferenceFrame && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EcpedrTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            ecpedrMeasurements == other.ecpedrMeasurements &&
            obTime == other.obTime &&
            source == other.source &&
            id == other.id &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            genSystem == other.genSystem &&
            genTime == other.genTime &&
            idOnOrbit == other.idOnOrbit &&
            idSensor == other.idSensor &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            origSensorId == other.origSensorId &&
            satNo == other.satNo &&
            senPos == other.senPos &&
            senReferenceFrame == other.senReferenceFrame &&
            sourceDl == other.sourceDl &&
            tags == other.tags &&
            transactionId == other.transactionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            ecpedrMeasurements,
            obTime,
            source,
            id,
            createdAt,
            createdBy,
            genSystem,
            genTime,
            idOnOrbit,
            idSensor,
            origin,
            origNetwork,
            origObjectId,
            origSensorId,
            satNo,
            senPos,
            senReferenceFrame,
            sourceDl,
            tags,
            transactionId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EcpedrTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, ecpedrMeasurements=$ecpedrMeasurements, obTime=$obTime, source=$source, id=$id, createdAt=$createdAt, createdBy=$createdBy, genSystem=$genSystem, genTime=$genTime, idOnOrbit=$idOnOrbit, idSensor=$idSensor, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, satNo=$satNo, senPos=$senPos, senReferenceFrame=$senReferenceFrame, sourceDl=$sourceDl, tags=$tags, transactionId=$transactionId, additionalProperties=$additionalProperties}"
}

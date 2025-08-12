// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatasigintpayload

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
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadGetResponse
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Details for an sigint payload from Seradata. */
class SeradataSigintPayloadGetResponse private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val spacecraftId: JsonField<String>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val frequencyCoverage: JsonField<String>,
    private val groundStationLocations: JsonField<String>,
    private val groundStations: JsonField<String>,
    private val hostedForCompanyOrgId: JsonField<String>,
    private val idSensor: JsonField<String>,
    private val interceptParameters: JsonField<String>,
    private val manufacturerOrgId: JsonField<String>,
    private val name: JsonField<String>,
    private val notes: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val positionalAccuracy: JsonField<String>,
    private val swathWidth: JsonField<Double>,
    private val type: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking") @ExcludeMissing classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spacecraftId") @ExcludeMissing spacecraftId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("frequencyCoverage") @ExcludeMissing frequencyCoverage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("groundStationLocations") @ExcludeMissing groundStationLocations: JsonField<String> = JsonMissing.of(),
        @JsonProperty("groundStations") @ExcludeMissing groundStations: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hostedForCompanyOrgId") @ExcludeMissing hostedForCompanyOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interceptParameters") @ExcludeMissing interceptParameters: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manufacturerOrgId") @ExcludeMissing manufacturerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork") @ExcludeMissing origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("positionalAccuracy") @ExcludeMissing positionalAccuracy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("swathWidth") @ExcludeMissing swathWidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of()
    ) : this(
      classificationMarking,
      dataMode,
      source,
      spacecraftId,
      id,
      createdAt,
      createdBy,
      frequencyCoverage,
      groundStationLocations,
      groundStations,
      hostedForCompanyOrgId,
      idSensor,
      interceptParameters,
      manufacturerOrgId,
      name,
      notes,
      origin,
      origNetwork,
      positionalAccuracy,
      swathWidth,
      type,
      updatedAt,
      updatedBy,
      mutableMapOf(),
    )

    /**
     * Classification marking of the data in IC/CAPCO Portion-marked format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

    /**
     * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Seradata ID of the spacecraft (SeradataSpacecraftDetails ID).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spacecraftId(): String = spacecraftId.getRequired("spacecraftId")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Time the row was created in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Application user who created the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * Frequency coverage for this payload.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun frequencyCoverage(): Optional<String> = frequencyCoverage.getOptional("frequencyCoverage")

    /**
     * Ground Station Locations for this payload.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun groundStationLocations(): Optional<String> = groundStationLocations.getOptional("groundStationLocations")

    /**
     * Ground Station info for this payload.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun groundStations(): Optional<String> = groundStations.getOptional("groundStations")

    /**
     * Hosted for company/Organization Id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun hostedForCompanyOrgId(): Optional<String> = hostedForCompanyOrgId.getOptional("hostedForCompanyOrgId")

    /**
     * UUID of the Sensor record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

    /**
     * Intercept parameters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun interceptParameters(): Optional<String> = interceptParameters.getOptional("interceptParameters")

    /**
     * Manufacturer Organization Id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun manufacturerOrgId(): Optional<String> = manufacturerOrgId.getOptional("manufacturerOrgId")

    /**
     * Sensor name from Seradata.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Payload notes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun origin(): Optional<String> = origin.getOptional("origin")

    /**
     * The originating source network on which this record was created, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

    /**
     * Positional Accuracy for this payload.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun positionalAccuracy(): Optional<String> = positionalAccuracy.getOptional("positionalAccuracy")

    /**
     * Swath Width in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun swathWidth(): Optional<Double> = swathWidth.getOptional("swathWidth")

    /**
     * SIGINT Payload type, e.g. Comint, Elint, etc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Time the row was last updated in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Application user who updated the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

    /**
     * Returns the raw JSON value of [classificationMarking].
     *
     * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("classificationMarking")
    @ExcludeMissing
    fun _classificationMarking(): JsonField<String> = classificationMarking

    /**
     * Returns the raw JSON value of [dataMode].
     *
     * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataMode")
    @ExcludeMissing
    fun _dataMode(): JsonField<DataMode> = dataMode

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source")
    @ExcludeMissing
    fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [spacecraftId].
     *
     * Unlike [spacecraftId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spacecraftId")
    @ExcludeMissing
    fun _spacecraftId(): JsonField<String> = spacecraftId

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

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
    @JsonProperty("createdBy")
    @ExcludeMissing
    fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [frequencyCoverage].
     *
     * Unlike [frequencyCoverage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequencyCoverage")
    @ExcludeMissing
    fun _frequencyCoverage(): JsonField<String> = frequencyCoverage

    /**
     * Returns the raw JSON value of [groundStationLocations].
     *
     * Unlike [groundStationLocations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groundStationLocations")
    @ExcludeMissing
    fun _groundStationLocations(): JsonField<String> = groundStationLocations

    /**
     * Returns the raw JSON value of [groundStations].
     *
     * Unlike [groundStations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groundStations")
    @ExcludeMissing
    fun _groundStations(): JsonField<String> = groundStations

    /**
     * Returns the raw JSON value of [hostedForCompanyOrgId].
     *
     * Unlike [hostedForCompanyOrgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hostedForCompanyOrgId")
    @ExcludeMissing
    fun _hostedForCompanyOrgId(): JsonField<String> = hostedForCompanyOrgId

    /**
     * Returns the raw JSON value of [idSensor].
     *
     * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSensor")
    @ExcludeMissing
    fun _idSensor(): JsonField<String> = idSensor

    /**
     * Returns the raw JSON value of [interceptParameters].
     *
     * Unlike [interceptParameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interceptParameters")
    @ExcludeMissing
    fun _interceptParameters(): JsonField<String> = interceptParameters

    /**
     * Returns the raw JSON value of [manufacturerOrgId].
     *
     * Unlike [manufacturerOrgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manufacturerOrgId")
    @ExcludeMissing
    fun _manufacturerOrgId(): JsonField<String> = manufacturerOrgId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name")
    @ExcludeMissing
    fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes")
    @ExcludeMissing
    fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin")
    @ExcludeMissing
    fun _origin(): JsonField<String> = origin

    /**
     * Returns the raw JSON value of [origNetwork].
     *
     * Unlike [origNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origNetwork")
    @ExcludeMissing
    fun _origNetwork(): JsonField<String> = origNetwork

    /**
     * Returns the raw JSON value of [positionalAccuracy].
     *
     * Unlike [positionalAccuracy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("positionalAccuracy")
    @ExcludeMissing
    fun _positionalAccuracy(): JsonField<String> = positionalAccuracy

    /**
     * Returns the raw JSON value of [swathWidth].
     *
     * Unlike [swathWidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("swathWidth")
    @ExcludeMissing
    fun _swathWidth(): JsonField<Double> = swathWidth

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type(): JsonField<String> = type

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
    @JsonProperty("updatedBy")
    @ExcludeMissing
    fun _updatedBy(): JsonField<String> = updatedBy

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
      additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SeradataSigintPayloadGetResponse].
         *
         * The following fields are required:
         *
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .spacecraftId()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [SeradataSigintPayloadGetResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var spacecraftId: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var frequencyCoverage: JsonField<String> = JsonMissing.of()
        private var groundStationLocations: JsonField<String> = JsonMissing.of()
        private var groundStations: JsonField<String> = JsonMissing.of()
        private var hostedForCompanyOrgId: JsonField<String> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var interceptParameters: JsonField<String> = JsonMissing.of()
        private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var positionalAccuracy: JsonField<String> = JsonMissing.of()
        private var swathWidth: JsonField<Double> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(seradataSigintPayloadGetResponse: SeradataSigintPayloadGetResponse) =
            apply {
                classificationMarking = seradataSigintPayloadGetResponse.classificationMarking
                dataMode = seradataSigintPayloadGetResponse.dataMode
                source = seradataSigintPayloadGetResponse.source
                spacecraftId = seradataSigintPayloadGetResponse.spacecraftId
                id = seradataSigintPayloadGetResponse.id
                createdAt = seradataSigintPayloadGetResponse.createdAt
                createdBy = seradataSigintPayloadGetResponse.createdBy
                frequencyCoverage = seradataSigintPayloadGetResponse.frequencyCoverage
                groundStationLocations = seradataSigintPayloadGetResponse.groundStationLocations
                groundStations = seradataSigintPayloadGetResponse.groundStations
                hostedForCompanyOrgId = seradataSigintPayloadGetResponse.hostedForCompanyOrgId
                idSensor = seradataSigintPayloadGetResponse.idSensor
                interceptParameters = seradataSigintPayloadGetResponse.interceptParameters
                manufacturerOrgId = seradataSigintPayloadGetResponse.manufacturerOrgId
                name = seradataSigintPayloadGetResponse.name
                notes = seradataSigintPayloadGetResponse.notes
                origin = seradataSigintPayloadGetResponse.origin
                origNetwork = seradataSigintPayloadGetResponse.origNetwork
                positionalAccuracy = seradataSigintPayloadGetResponse.positionalAccuracy
                swathWidth = seradataSigintPayloadGetResponse.swathWidth
                type = seradataSigintPayloadGetResponse.type
                updatedAt = seradataSigintPayloadGetResponse.updatedAt
                updatedBy = seradataSigintPayloadGetResponse.updatedBy
                additionalProperties = seradataSigintPayloadGetResponse.additionalProperties.toMutableMap()
            }

        /** Classification marking of the data in IC/CAPCO Portion-marked format. */
        fun classificationMarking(classificationMarking: String) = classificationMarking(JsonField.of(classificationMarking))

        /**
         * Sets [Builder.classificationMarking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classificationMarking] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun classificationMarking(classificationMarking: JsonField<String>) =
            apply {
                this.classificationMarking = classificationMarking
            }

        /**
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
         */
        fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

        /**
         * Sets [Builder.dataMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataMode] with a well-typed [DataMode] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataMode(dataMode: JsonField<DataMode>) =
            apply {
                this.dataMode = dataMode
            }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun source(source: JsonField<String>) =
            apply {
                this.source = source
            }

        /** Seradata ID of the spacecraft (SeradataSpacecraftDetails ID). */
        fun spacecraftId(spacecraftId: String) = spacecraftId(JsonField.of(spacecraftId))

        /**
         * Sets [Builder.spacecraftId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spacecraftId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun spacecraftId(spacecraftId: JsonField<String>) =
            apply {
                this.spacecraftId = spacecraftId
            }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        /** Time the row was created in the database, auto-populated by the system. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply {
                this.createdAt = createdAt
            }

        /** Application user who created the row in the database, auto-populated by the system. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdBy(createdBy: JsonField<String>) =
            apply {
                this.createdBy = createdBy
            }

        /** Frequency coverage for this payload. */
        fun frequencyCoverage(frequencyCoverage: String) = frequencyCoverage(JsonField.of(frequencyCoverage))

        /**
         * Sets [Builder.frequencyCoverage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencyCoverage] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequencyCoverage(frequencyCoverage: JsonField<String>) =
            apply {
                this.frequencyCoverage = frequencyCoverage
            }

        /** Ground Station Locations for this payload. */
        fun groundStationLocations(groundStationLocations: String) = groundStationLocations(JsonField.of(groundStationLocations))

        /**
         * Sets [Builder.groundStationLocations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groundStationLocations] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groundStationLocations(groundStationLocations: JsonField<String>) =
            apply {
                this.groundStationLocations = groundStationLocations
            }

        /** Ground Station info for this payload. */
        fun groundStations(groundStations: String) = groundStations(JsonField.of(groundStations))

        /**
         * Sets [Builder.groundStations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groundStations] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groundStations(groundStations: JsonField<String>) =
            apply {
                this.groundStations = groundStations
            }

        /** Hosted for company/Organization Id. */
        fun hostedForCompanyOrgId(hostedForCompanyOrgId: String) = hostedForCompanyOrgId(JsonField.of(hostedForCompanyOrgId))

        /**
         * Sets [Builder.hostedForCompanyOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostedForCompanyOrgId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hostedForCompanyOrgId(hostedForCompanyOrgId: JsonField<String>) =
            apply {
                this.hostedForCompanyOrgId = hostedForCompanyOrgId
            }

        /** UUID of the Sensor record. */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idSensor(idSensor: JsonField<String>) =
            apply {
                this.idSensor = idSensor
            }

        /** Intercept parameters. */
        fun interceptParameters(interceptParameters: String) = interceptParameters(JsonField.of(interceptParameters))

        /**
         * Sets [Builder.interceptParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interceptParameters] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interceptParameters(interceptParameters: JsonField<String>) =
            apply {
                this.interceptParameters = interceptParameters
            }

        /** Manufacturer Organization Id. */
        fun manufacturerOrgId(manufacturerOrgId: String) = manufacturerOrgId(JsonField.of(manufacturerOrgId))

        /**
         * Sets [Builder.manufacturerOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manufacturerOrgId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun manufacturerOrgId(manufacturerOrgId: JsonField<String>) =
            apply {
                this.manufacturerOrgId = manufacturerOrgId
            }

        /** Sensor name from Seradata. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun name(name: JsonField<String>) =
            apply {
                this.name = name
            }

        /** Payload notes. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notes(notes: JsonField<String>) =
            apply {
                this.notes = notes
            }

        /** Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin. */
        fun origin(origin: String) = origin(JsonField.of(origin))

        /**
         * Sets [Builder.origin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origin] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun origin(origin: JsonField<String>) =
            apply {
                this.origin = origin
            }

        /** The originating source network on which this record was created, auto-populated by the system. */
        fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

        /**
         * Sets [Builder.origNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origNetwork] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun origNetwork(origNetwork: JsonField<String>) =
            apply {
                this.origNetwork = origNetwork
            }

        /** Positional Accuracy for this payload. */
        fun positionalAccuracy(positionalAccuracy: String) = positionalAccuracy(JsonField.of(positionalAccuracy))

        /**
         * Sets [Builder.positionalAccuracy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.positionalAccuracy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun positionalAccuracy(positionalAccuracy: JsonField<String>) =
            apply {
                this.positionalAccuracy = positionalAccuracy
            }

        /** Swath Width in kilometers. */
        fun swathWidth(swathWidth: Double) = swathWidth(JsonField.of(swathWidth))

        /**
         * Sets [Builder.swathWidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.swathWidth] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun swathWidth(swathWidth: JsonField<Double>) =
            apply {
                this.swathWidth = swathWidth
            }

        /** SIGINT Payload type, e.g. Comint, Elint, etc. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<String>) =
            apply {
                this.type = type
            }

        /** Time the row was last updated in the database, auto-populated by the system. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) =
            apply {
                this.updatedAt = updatedAt
            }

        /** Application user who updated the row in the database, auto-populated by the system. */
        fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedBy(updatedBy: JsonField<String>) =
            apply {
                this.updatedBy = updatedBy
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
         * Returns an immutable instance of [SeradataSigintPayloadGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .spacecraftId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SeradataSigintPayloadGetResponse =
            SeradataSigintPayloadGetResponse(
              checkRequired(
                "classificationMarking", classificationMarking
              ),
              checkRequired(
                "dataMode", dataMode
              ),
              checkRequired(
                "source", source
              ),
              checkRequired(
                "spacecraftId", spacecraftId
              ),
              id,
              createdAt,
              createdBy,
              frequencyCoverage,
              groundStationLocations,
              groundStations,
              hostedForCompanyOrgId,
              idSensor,
              interceptParameters,
              manufacturerOrgId,
              name,
              notes,
              origin,
              origNetwork,
              positionalAccuracy,
              swathWidth,
              type,
              updatedAt,
              updatedBy,
              additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SeradataSigintPayloadGetResponse =
        apply {
            if (validated) {
              return@apply
            }

            classificationMarking()
            dataMode().validate()
            source()
            spacecraftId()
            id()
            createdAt()
            createdBy()
            frequencyCoverage()
            groundStationLocations()
            groundStations()
            hostedForCompanyOrgId()
            idSensor()
            interceptParameters()
            manufacturerOrgId()
            name()
            notes()
            origin()
            origNetwork()
            positionalAccuracy()
            swathWidth()
            type()
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
    internal fun validity(): Int = (if (classificationMarking.asKnown().isPresent) 1 else 0) + (dataMode.asKnown().getOrNull()?.validity() ?: 0) + (if (source.asKnown().isPresent) 1 else 0) + (if (spacecraftId.asKnown().isPresent) 1 else 0) + (if (id.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (createdBy.asKnown().isPresent) 1 else 0) + (if (frequencyCoverage.asKnown().isPresent) 1 else 0) + (if (groundStationLocations.asKnown().isPresent) 1 else 0) + (if (groundStations.asKnown().isPresent) 1 else 0) + (if (hostedForCompanyOrgId.asKnown().isPresent) 1 else 0) + (if (idSensor.asKnown().isPresent) 1 else 0) + (if (interceptParameters.asKnown().isPresent) 1 else 0) + (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0) + (if (notes.asKnown().isPresent) 1 else 0) + (if (origin.asKnown().isPresent) 1 else 0) + (if (origNetwork.asKnown().isPresent) 1 else 0) + (if (positionalAccuracy.asKnown().isPresent) 1 else 0) + (if (swathWidth.asKnown().isPresent) 1 else 0) + (if (type.asKnown().isPresent) 1 else 0) + (if (updatedAt.asKnown().isPresent) 1 else 0) + (if (updatedBy.asKnown().isPresent) 1 else 0)

    /**
     * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
     */
    class DataMode @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't match any known
         * member, and you want to know that value. For example, if the SDK is on an older version than the
         * API, then the API may respond with new members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

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
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
         *   an older version than the API, then the API may respond with new members that the SDK is unaware
         *   of.
         *
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
         * class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want to throw
         * for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
         * for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging and generally
         * doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not have the expected
         * primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { UnifieddatalibraryInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): DataMode =
            apply {
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
         * Returns a score indicating how many valid values are contained in this object recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

      return /* spotless:off */ other is SeradataSigintPayloadGetResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && source == other.source && spacecraftId == other.spacecraftId && id == other.id && createdAt == other.createdAt && createdBy == other.createdBy && frequencyCoverage == other.frequencyCoverage && groundStationLocations == other.groundStationLocations && groundStations == other.groundStations && hostedForCompanyOrgId == other.hostedForCompanyOrgId && idSensor == other.idSensor && interceptParameters == other.interceptParameters && manufacturerOrgId == other.manufacturerOrgId && name == other.name && notes == other.notes && origin == other.origin && origNetwork == other.origNetwork && positionalAccuracy == other.positionalAccuracy && swathWidth == other.swathWidth && type == other.type && updatedAt == other.updatedAt && updatedBy == other.updatedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, source, spacecraftId, id, createdAt, createdBy, frequencyCoverage, groundStationLocations, groundStations, hostedForCompanyOrgId, idSensor, interceptParameters, manufacturerOrgId, name, notes, origin, origNetwork, positionalAccuracy, swathWidth, type, updatedAt, updatedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "SeradataSigintPayloadGetResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, spacecraftId=$spacecraftId, id=$id, createdAt=$createdAt, createdBy=$createdBy, frequencyCoverage=$frequencyCoverage, groundStationLocations=$groundStationLocations, groundStations=$groundStations, hostedForCompanyOrgId=$hostedForCompanyOrgId, idSensor=$idSensor, interceptParameters=$interceptParameters, manufacturerOrgId=$manufacturerOrgId, name=$name, notes=$notes, origin=$origin, origNetwork=$origNetwork, positionalAccuracy=$positionalAccuracy, swathWidth=$swathWidth, type=$type, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

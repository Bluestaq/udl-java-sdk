// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatanavigation

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

/** Details for a navigation payload from Seradata. */
class SeraDataNavigationTupleResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val spacecraftId: JsonField<String>,
    private val id: JsonField<String>,
    private val areaCoverage: JsonField<String>,
    private val clockType: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val hostedForCompanyOrgId: JsonField<String>,
    private val idNavigation: JsonField<String>,
    private val locationAccuracy: JsonField<Double>,
    private val manufacturerOrgId: JsonField<String>,
    private val modeFrequency: JsonField<String>,
    private val modes: JsonField<String>,
    private val name: JsonField<String>,
    private val notes: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val partnerSpacecraftId: JsonField<String>,
    private val payloadType: JsonField<String>,
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
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spacecraftId")
        @ExcludeMissing
        spacecraftId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("areaCoverage")
        @ExcludeMissing
        areaCoverage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("clockType") @ExcludeMissing clockType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hostedForCompanyOrgId")
        @ExcludeMissing
        hostedForCompanyOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idNavigation")
        @ExcludeMissing
        idNavigation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locationAccuracy")
        @ExcludeMissing
        locationAccuracy: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("manufacturerOrgId")
        @ExcludeMissing
        manufacturerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modeFrequency")
        @ExcludeMissing
        modeFrequency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modes") @ExcludeMissing modes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("partnerSpacecraftId")
        @ExcludeMissing
        partnerSpacecraftId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payloadType")
        @ExcludeMissing
        payloadType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        spacecraftId,
        id,
        areaCoverage,
        clockType,
        createdAt,
        createdBy,
        hostedForCompanyOrgId,
        idNavigation,
        locationAccuracy,
        manufacturerOrgId,
        modeFrequency,
        modes,
        name,
        notes,
        origin,
        origNetwork,
        partnerSpacecraftId,
        payloadType,
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
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Seradata ID of the spacecraft (SeradataSpacecraftDetails ID).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spacecraftId(): String = spacecraftId.getRequired("spacecraftId")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Area of coverage, e.g. Worldwide, India, etc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun areaCoverage(): Optional<String> = areaCoverage.getOptional("areaCoverage")

    /**
     * Type of clock, e.g. Rubidium, Hydrogen Maser, etc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun clockType(): Optional<String> = clockType.getOptional("clockType")

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
     * Hosted for company/Organization Id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hostedForCompanyOrgId(): Optional<String> =
        hostedForCompanyOrgId.getOptional("hostedForCompanyOrgId")

    /**
     * UUID of the parent Navigation record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idNavigation(): Optional<String> = idNavigation.getOptional("idNavigation")

    /**
     * Location accuracy in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun locationAccuracy(): Optional<Double> = locationAccuracy.getOptional("locationAccuracy")

    /**
     * Manufacturer Organization Id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun manufacturerOrgId(): Optional<String> = manufacturerOrgId.getOptional("manufacturerOrgId")

    /**
     * Frequency for this payload.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun modeFrequency(): Optional<String> = modeFrequency.getOptional("modeFrequency")

    /**
     * Modes of operation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun modes(): Optional<String> = modes.getOptional("modes")

    /**
     * Sensor name from Seradata, e.g. WAAS GEO-5, etc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Payload notes.
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
     * Seradata ID of the spacecraft (SeradataSpacecraftDetails ID).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun partnerSpacecraftId(): Optional<String> =
        partnerSpacecraftId.getOptional("partnerSpacecraftId")

    /**
     * Navigation payload type, e.g. WAAS, GAGAN, etc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun payloadType(): Optional<String> = payloadType.getOptional("payloadType")

    /**
     * Time the row was last updated in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Application user who updated the row in the database, auto-populated by the system.
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
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

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
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [areaCoverage].
     *
     * Unlike [areaCoverage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("areaCoverage")
    @ExcludeMissing
    fun _areaCoverage(): JsonField<String> = areaCoverage

    /**
     * Returns the raw JSON value of [clockType].
     *
     * Unlike [clockType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clockType") @ExcludeMissing fun _clockType(): JsonField<String> = clockType

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
     * Returns the raw JSON value of [hostedForCompanyOrgId].
     *
     * Unlike [hostedForCompanyOrgId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hostedForCompanyOrgId")
    @ExcludeMissing
    fun _hostedForCompanyOrgId(): JsonField<String> = hostedForCompanyOrgId

    /**
     * Returns the raw JSON value of [idNavigation].
     *
     * Unlike [idNavigation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idNavigation")
    @ExcludeMissing
    fun _idNavigation(): JsonField<String> = idNavigation

    /**
     * Returns the raw JSON value of [locationAccuracy].
     *
     * Unlike [locationAccuracy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("locationAccuracy")
    @ExcludeMissing
    fun _locationAccuracy(): JsonField<Double> = locationAccuracy

    /**
     * Returns the raw JSON value of [manufacturerOrgId].
     *
     * Unlike [manufacturerOrgId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("manufacturerOrgId")
    @ExcludeMissing
    fun _manufacturerOrgId(): JsonField<String> = manufacturerOrgId

    /**
     * Returns the raw JSON value of [modeFrequency].
     *
     * Unlike [modeFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modeFrequency")
    @ExcludeMissing
    fun _modeFrequency(): JsonField<String> = modeFrequency

    /**
     * Returns the raw JSON value of [modes].
     *
     * Unlike [modes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modes") @ExcludeMissing fun _modes(): JsonField<String> = modes

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [partnerSpacecraftId].
     *
     * Unlike [partnerSpacecraftId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("partnerSpacecraftId")
    @ExcludeMissing
    fun _partnerSpacecraftId(): JsonField<String> = partnerSpacecraftId

    /**
     * Returns the raw JSON value of [payloadType].
     *
     * Unlike [payloadType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payloadType") @ExcludeMissing fun _payloadType(): JsonField<String> = payloadType

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
         * Returns a mutable builder for constructing an instance of
         * [SeraDataNavigationTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .spacecraftId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SeraDataNavigationTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var spacecraftId: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var areaCoverage: JsonField<String> = JsonMissing.of()
        private var clockType: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var hostedForCompanyOrgId: JsonField<String> = JsonMissing.of()
        private var idNavigation: JsonField<String> = JsonMissing.of()
        private var locationAccuracy: JsonField<Double> = JsonMissing.of()
        private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
        private var modeFrequency: JsonField<String> = JsonMissing.of()
        private var modes: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var partnerSpacecraftId: JsonField<String> = JsonMissing.of()
        private var payloadType: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(seraDataNavigationTupleResponse: SeraDataNavigationTupleResponse) =
            apply {
                classificationMarking = seraDataNavigationTupleResponse.classificationMarking
                dataMode = seraDataNavigationTupleResponse.dataMode
                source = seraDataNavigationTupleResponse.source
                spacecraftId = seraDataNavigationTupleResponse.spacecraftId
                id = seraDataNavigationTupleResponse.id
                areaCoverage = seraDataNavigationTupleResponse.areaCoverage
                clockType = seraDataNavigationTupleResponse.clockType
                createdAt = seraDataNavigationTupleResponse.createdAt
                createdBy = seraDataNavigationTupleResponse.createdBy
                hostedForCompanyOrgId = seraDataNavigationTupleResponse.hostedForCompanyOrgId
                idNavigation = seraDataNavigationTupleResponse.idNavigation
                locationAccuracy = seraDataNavigationTupleResponse.locationAccuracy
                manufacturerOrgId = seraDataNavigationTupleResponse.manufacturerOrgId
                modeFrequency = seraDataNavigationTupleResponse.modeFrequency
                modes = seraDataNavigationTupleResponse.modes
                name = seraDataNavigationTupleResponse.name
                notes = seraDataNavigationTupleResponse.notes
                origin = seraDataNavigationTupleResponse.origin
                origNetwork = seraDataNavigationTupleResponse.origNetwork
                partnerSpacecraftId = seraDataNavigationTupleResponse.partnerSpacecraftId
                payloadType = seraDataNavigationTupleResponse.payloadType
                updatedAt = seraDataNavigationTupleResponse.updatedAt
                updatedBy = seraDataNavigationTupleResponse.updatedBy
                additionalProperties =
                    seraDataNavigationTupleResponse.additionalProperties.toMutableMap()
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

        /** Seradata ID of the spacecraft (SeradataSpacecraftDetails ID). */
        fun spacecraftId(spacecraftId: String) = spacecraftId(JsonField.of(spacecraftId))

        /**
         * Sets [Builder.spacecraftId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spacecraftId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spacecraftId(spacecraftId: JsonField<String>) = apply {
            this.spacecraftId = spacecraftId
        }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Area of coverage, e.g. Worldwide, India, etc. */
        fun areaCoverage(areaCoverage: String) = areaCoverage(JsonField.of(areaCoverage))

        /**
         * Sets [Builder.areaCoverage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.areaCoverage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun areaCoverage(areaCoverage: JsonField<String>) = apply {
            this.areaCoverage = areaCoverage
        }

        /** Type of clock, e.g. Rubidium, Hydrogen Maser, etc. */
        fun clockType(clockType: String) = clockType(JsonField.of(clockType))

        /**
         * Sets [Builder.clockType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clockType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clockType(clockType: JsonField<String>) = apply { this.clockType = clockType }

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

        /** Hosted for company/Organization Id. */
        fun hostedForCompanyOrgId(hostedForCompanyOrgId: String) =
            hostedForCompanyOrgId(JsonField.of(hostedForCompanyOrgId))

        /**
         * Sets [Builder.hostedForCompanyOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostedForCompanyOrgId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hostedForCompanyOrgId(hostedForCompanyOrgId: JsonField<String>) = apply {
            this.hostedForCompanyOrgId = hostedForCompanyOrgId
        }

        /** UUID of the parent Navigation record. */
        fun idNavigation(idNavigation: String) = idNavigation(JsonField.of(idNavigation))

        /**
         * Sets [Builder.idNavigation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idNavigation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idNavigation(idNavigation: JsonField<String>) = apply {
            this.idNavigation = idNavigation
        }

        /** Location accuracy in meters. */
        fun locationAccuracy(locationAccuracy: Double) =
            locationAccuracy(JsonField.of(locationAccuracy))

        /**
         * Sets [Builder.locationAccuracy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locationAccuracy] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun locationAccuracy(locationAccuracy: JsonField<Double>) = apply {
            this.locationAccuracy = locationAccuracy
        }

        /** Manufacturer Organization Id. */
        fun manufacturerOrgId(manufacturerOrgId: String) =
            manufacturerOrgId(JsonField.of(manufacturerOrgId))

        /**
         * Sets [Builder.manufacturerOrgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manufacturerOrgId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun manufacturerOrgId(manufacturerOrgId: JsonField<String>) = apply {
            this.manufacturerOrgId = manufacturerOrgId
        }

        /** Frequency for this payload. */
        fun modeFrequency(modeFrequency: String) = modeFrequency(JsonField.of(modeFrequency))

        /**
         * Sets [Builder.modeFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modeFrequency] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modeFrequency(modeFrequency: JsonField<String>) = apply {
            this.modeFrequency = modeFrequency
        }

        /** Modes of operation. */
        fun modes(modes: String) = modes(JsonField.of(modes))

        /**
         * Sets [Builder.modes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modes(modes: JsonField<String>) = apply { this.modes = modes }

        /** Sensor name from Seradata, e.g. WAAS GEO-5, etc. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Payload notes. */
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

        /** Seradata ID of the spacecraft (SeradataSpacecraftDetails ID). */
        fun partnerSpacecraftId(partnerSpacecraftId: String) =
            partnerSpacecraftId(JsonField.of(partnerSpacecraftId))

        /**
         * Sets [Builder.partnerSpacecraftId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partnerSpacecraftId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun partnerSpacecraftId(partnerSpacecraftId: JsonField<String>) = apply {
            this.partnerSpacecraftId = partnerSpacecraftId
        }

        /** Navigation payload type, e.g. WAAS, GAGAN, etc. */
        fun payloadType(payloadType: String) = payloadType(JsonField.of(payloadType))

        /**
         * Sets [Builder.payloadType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payloadType(payloadType: JsonField<String>) = apply { this.payloadType = payloadType }

        /** Time the row was last updated in the database, auto-populated by the system. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Application user who updated the row in the database, auto-populated by the system. */
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
         * Returns an immutable instance of [SeraDataNavigationTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .spacecraftId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SeraDataNavigationTupleResponse =
            SeraDataNavigationTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                checkRequired("spacecraftId", spacecraftId),
                id,
                areaCoverage,
                clockType,
                createdAt,
                createdBy,
                hostedForCompanyOrgId,
                idNavigation,
                locationAccuracy,
                manufacturerOrgId,
                modeFrequency,
                modes,
                name,
                notes,
                origin,
                origNetwork,
                partnerSpacecraftId,
                payloadType,
                updatedAt,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SeraDataNavigationTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        spacecraftId()
        id()
        areaCoverage()
        clockType()
        createdAt()
        createdBy()
        hostedForCompanyOrgId()
        idNavigation()
        locationAccuracy()
        manufacturerOrgId()
        modeFrequency()
        modes()
        name()
        notes()
        origin()
        origNetwork()
        partnerSpacecraftId()
        payloadType()
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
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (spacecraftId.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (areaCoverage.asKnown().isPresent) 1 else 0) +
            (if (clockType.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (hostedForCompanyOrgId.asKnown().isPresent) 1 else 0) +
            (if (idNavigation.asKnown().isPresent) 1 else 0) +
            (if (locationAccuracy.asKnown().isPresent) 1 else 0) +
            (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) +
            (if (modeFrequency.asKnown().isPresent) 1 else 0) +
            (if (modes.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (partnerSpacecraftId.asKnown().isPresent) 1 else 0) +
            (if (payloadType.asKnown().isPresent) 1 else 0) +
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

        return /* spotless:off */ other is SeraDataNavigationTupleResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && source == other.source && spacecraftId == other.spacecraftId && id == other.id && areaCoverage == other.areaCoverage && clockType == other.clockType && createdAt == other.createdAt && createdBy == other.createdBy && hostedForCompanyOrgId == other.hostedForCompanyOrgId && idNavigation == other.idNavigation && locationAccuracy == other.locationAccuracy && manufacturerOrgId == other.manufacturerOrgId && modeFrequency == other.modeFrequency && modes == other.modes && name == other.name && notes == other.notes && origin == other.origin && origNetwork == other.origNetwork && partnerSpacecraftId == other.partnerSpacecraftId && payloadType == other.payloadType && updatedAt == other.updatedAt && updatedBy == other.updatedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, source, spacecraftId, id, areaCoverage, clockType, createdAt, createdBy, hostedForCompanyOrgId, idNavigation, locationAccuracy, manufacturerOrgId, modeFrequency, modes, name, notes, origin, origNetwork, partnerSpacecraftId, payloadType, updatedAt, updatedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SeraDataNavigationTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, spacecraftId=$spacecraftId, id=$id, areaCoverage=$areaCoverage, clockType=$clockType, createdAt=$createdAt, createdBy=$createdBy, hostedForCompanyOrgId=$hostedForCompanyOrgId, idNavigation=$idNavigation, locationAccuracy=$locationAccuracy, manufacturerOrgId=$manufacturerOrgId, modeFrequency=$modeFrequency, modes=$modes, name=$name, notes=$notes, origin=$origin, origNetwork=$origNetwork, partnerSpacecraftId=$partnerSpacecraftId, payloadType=$payloadType, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

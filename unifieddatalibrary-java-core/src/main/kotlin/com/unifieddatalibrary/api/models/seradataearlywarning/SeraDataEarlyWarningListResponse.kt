// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataearlywarning

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

/** Details for an early warning payload from Seradata. */
class SeraDataEarlyWarningListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val spacecraftId: JsonField<String>,
    private val id: JsonField<String>,
    private val bestResolution: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val earthPointing: JsonField<Boolean>,
    private val frequencyLimits: JsonField<String>,
    private val groundStationLocations: JsonField<String>,
    private val groundStations: JsonField<String>,
    private val hostedForCompanyOrgId: JsonField<String>,
    private val idIr: JsonField<String>,
    private val manufacturerOrgId: JsonField<String>,
    private val missileLaunchPhaseDetectionAbility: JsonField<String>,
    private val name: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val partnerSpacecraftId: JsonField<String>,
    private val payloadNotes: JsonField<String>,
    private val spectralBands: JsonField<String>,
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
        @JsonProperty("bestResolution")
        @ExcludeMissing
        bestResolution: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("earthPointing")
        @ExcludeMissing
        earthPointing: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("frequencyLimits")
        @ExcludeMissing
        frequencyLimits: JsonField<String> = JsonMissing.of(),
        @JsonProperty("groundStationLocations")
        @ExcludeMissing
        groundStationLocations: JsonField<String> = JsonMissing.of(),
        @JsonProperty("groundStations")
        @ExcludeMissing
        groundStations: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hostedForCompanyOrgId")
        @ExcludeMissing
        hostedForCompanyOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idIR") @ExcludeMissing idIr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manufacturerOrgId")
        @ExcludeMissing
        manufacturerOrgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("missileLaunchPhaseDetectionAbility")
        @ExcludeMissing
        missileLaunchPhaseDetectionAbility: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("partnerSpacecraftId")
        @ExcludeMissing
        partnerSpacecraftId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payloadNotes")
        @ExcludeMissing
        payloadNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spectralBands")
        @ExcludeMissing
        spectralBands: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        spacecraftId,
        id,
        bestResolution,
        createdAt,
        createdBy,
        earthPointing,
        frequencyLimits,
        groundStationLocations,
        groundStations,
        hostedForCompanyOrgId,
        idIr,
        manufacturerOrgId,
        missileLaunchPhaseDetectionAbility,
        name,
        origin,
        origNetwork,
        partnerSpacecraftId,
        payloadNotes,
        spectralBands,
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
     * Best resolution for this IR in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bestResolution(): Optional<Double> = bestResolution.getOptional("bestResolution")

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
     * Is the sensor Earth Pointing.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun earthPointing(): Optional<Boolean> = earthPointing.getOptional("earthPointing")

    /**
     * Frequency Limits for this IR.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun frequencyLimits(): Optional<String> = frequencyLimits.getOptional("frequencyLimits")

    /**
     * Ground Station Locations for this IR.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun groundStationLocations(): Optional<String> =
        groundStationLocations.getOptional("groundStationLocations")

    /**
     * Ground Station info for this IR.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun groundStations(): Optional<String> = groundStations.getOptional("groundStations")

    /**
     * Hosted for company/Organization Id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hostedForCompanyOrgId(): Optional<String> =
        hostedForCompanyOrgId.getOptional("hostedForCompanyOrgId")

    /**
     * UUID of the parent IR record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idIr(): Optional<String> = idIr.getOptional("idIR")

    /**
     * Manufacturer Organization Id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun manufacturerOrgId(): Optional<String> = manufacturerOrgId.getOptional("manufacturerOrgId")

    /**
     * Missile Launch Phase Detection Ability.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun missileLaunchPhaseDetectionAbility(): Optional<String> =
        missileLaunchPhaseDetectionAbility.getOptional("missileLaunchPhaseDetectionAbility")

    /**
     * Sensor name from Seradata, e.g. Infra red telescope, Schmidt Telescope, etc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

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
     * Payload notes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun payloadNotes(): Optional<String> = payloadNotes.getOptional("payloadNotes")

    /**
     * Spectral Bands, e.g. Infra-Red.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spectralBands(): Optional<String> = spectralBands.getOptional("spectralBands")

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
     * Returns the raw JSON value of [bestResolution].
     *
     * Unlike [bestResolution], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bestResolution")
    @ExcludeMissing
    fun _bestResolution(): JsonField<Double> = bestResolution

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
     * Returns the raw JSON value of [earthPointing].
     *
     * Unlike [earthPointing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("earthPointing")
    @ExcludeMissing
    fun _earthPointing(): JsonField<Boolean> = earthPointing

    /**
     * Returns the raw JSON value of [frequencyLimits].
     *
     * Unlike [frequencyLimits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequencyLimits")
    @ExcludeMissing
    fun _frequencyLimits(): JsonField<String> = frequencyLimits

    /**
     * Returns the raw JSON value of [groundStationLocations].
     *
     * Unlike [groundStationLocations], this method doesn't throw if the JSON field has an
     * unexpected type.
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
     * Unlike [hostedForCompanyOrgId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hostedForCompanyOrgId")
    @ExcludeMissing
    fun _hostedForCompanyOrgId(): JsonField<String> = hostedForCompanyOrgId

    /**
     * Returns the raw JSON value of [idIr].
     *
     * Unlike [idIr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idIR") @ExcludeMissing fun _idIr(): JsonField<String> = idIr

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
     * Returns the raw JSON value of [missileLaunchPhaseDetectionAbility].
     *
     * Unlike [missileLaunchPhaseDetectionAbility], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("missileLaunchPhaseDetectionAbility")
    @ExcludeMissing
    fun _missileLaunchPhaseDetectionAbility(): JsonField<String> =
        missileLaunchPhaseDetectionAbility

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [payloadNotes].
     *
     * Unlike [payloadNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payloadNotes")
    @ExcludeMissing
    fun _payloadNotes(): JsonField<String> = payloadNotes

    /**
     * Returns the raw JSON value of [spectralBands].
     *
     * Unlike [spectralBands], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spectralBands")
    @ExcludeMissing
    fun _spectralBands(): JsonField<String> = spectralBands

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
         * [SeraDataEarlyWarningListResponse].
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

    /** A builder for [SeraDataEarlyWarningListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var spacecraftId: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var bestResolution: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var earthPointing: JsonField<Boolean> = JsonMissing.of()
        private var frequencyLimits: JsonField<String> = JsonMissing.of()
        private var groundStationLocations: JsonField<String> = JsonMissing.of()
        private var groundStations: JsonField<String> = JsonMissing.of()
        private var hostedForCompanyOrgId: JsonField<String> = JsonMissing.of()
        private var idIr: JsonField<String> = JsonMissing.of()
        private var manufacturerOrgId: JsonField<String> = JsonMissing.of()
        private var missileLaunchPhaseDetectionAbility: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var partnerSpacecraftId: JsonField<String> = JsonMissing.of()
        private var payloadNotes: JsonField<String> = JsonMissing.of()
        private var spectralBands: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(seraDataEarlyWarningListResponse: SeraDataEarlyWarningListResponse) =
            apply {
                classificationMarking = seraDataEarlyWarningListResponse.classificationMarking
                dataMode = seraDataEarlyWarningListResponse.dataMode
                source = seraDataEarlyWarningListResponse.source
                spacecraftId = seraDataEarlyWarningListResponse.spacecraftId
                id = seraDataEarlyWarningListResponse.id
                bestResolution = seraDataEarlyWarningListResponse.bestResolution
                createdAt = seraDataEarlyWarningListResponse.createdAt
                createdBy = seraDataEarlyWarningListResponse.createdBy
                earthPointing = seraDataEarlyWarningListResponse.earthPointing
                frequencyLimits = seraDataEarlyWarningListResponse.frequencyLimits
                groundStationLocations = seraDataEarlyWarningListResponse.groundStationLocations
                groundStations = seraDataEarlyWarningListResponse.groundStations
                hostedForCompanyOrgId = seraDataEarlyWarningListResponse.hostedForCompanyOrgId
                idIr = seraDataEarlyWarningListResponse.idIr
                manufacturerOrgId = seraDataEarlyWarningListResponse.manufacturerOrgId
                missileLaunchPhaseDetectionAbility =
                    seraDataEarlyWarningListResponse.missileLaunchPhaseDetectionAbility
                name = seraDataEarlyWarningListResponse.name
                origin = seraDataEarlyWarningListResponse.origin
                origNetwork = seraDataEarlyWarningListResponse.origNetwork
                partnerSpacecraftId = seraDataEarlyWarningListResponse.partnerSpacecraftId
                payloadNotes = seraDataEarlyWarningListResponse.payloadNotes
                spectralBands = seraDataEarlyWarningListResponse.spectralBands
                additionalProperties =
                    seraDataEarlyWarningListResponse.additionalProperties.toMutableMap()
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

        /** Best resolution for this IR in meters. */
        fun bestResolution(bestResolution: Double) = bestResolution(JsonField.of(bestResolution))

        /**
         * Sets [Builder.bestResolution] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bestResolution] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bestResolution(bestResolution: JsonField<Double>) = apply {
            this.bestResolution = bestResolution
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

        /** Is the sensor Earth Pointing. */
        fun earthPointing(earthPointing: Boolean) = earthPointing(JsonField.of(earthPointing))

        /**
         * Sets [Builder.earthPointing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earthPointing] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun earthPointing(earthPointing: JsonField<Boolean>) = apply {
            this.earthPointing = earthPointing
        }

        /** Frequency Limits for this IR. */
        fun frequencyLimits(frequencyLimits: String) =
            frequencyLimits(JsonField.of(frequencyLimits))

        /**
         * Sets [Builder.frequencyLimits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencyLimits] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequencyLimits(frequencyLimits: JsonField<String>) = apply {
            this.frequencyLimits = frequencyLimits
        }

        /** Ground Station Locations for this IR. */
        fun groundStationLocations(groundStationLocations: String) =
            groundStationLocations(JsonField.of(groundStationLocations))

        /**
         * Sets [Builder.groundStationLocations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groundStationLocations] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groundStationLocations(groundStationLocations: JsonField<String>) = apply {
            this.groundStationLocations = groundStationLocations
        }

        /** Ground Station info for this IR. */
        fun groundStations(groundStations: String) = groundStations(JsonField.of(groundStations))

        /**
         * Sets [Builder.groundStations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groundStations] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groundStations(groundStations: JsonField<String>) = apply {
            this.groundStations = groundStations
        }

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

        /** UUID of the parent IR record. */
        fun idIr(idIr: String) = idIr(JsonField.of(idIr))

        /**
         * Sets [Builder.idIr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idIr] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idIr(idIr: JsonField<String>) = apply { this.idIr = idIr }

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

        /** Missile Launch Phase Detection Ability. */
        fun missileLaunchPhaseDetectionAbility(missileLaunchPhaseDetectionAbility: String) =
            missileLaunchPhaseDetectionAbility(JsonField.of(missileLaunchPhaseDetectionAbility))

        /**
         * Sets [Builder.missileLaunchPhaseDetectionAbility] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missileLaunchPhaseDetectionAbility] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun missileLaunchPhaseDetectionAbility(
            missileLaunchPhaseDetectionAbility: JsonField<String>
        ) = apply { this.missileLaunchPhaseDetectionAbility = missileLaunchPhaseDetectionAbility }

        /** Sensor name from Seradata, e.g. Infra red telescope, Schmidt Telescope, etc. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        /** Payload notes. */
        fun payloadNotes(payloadNotes: String) = payloadNotes(JsonField.of(payloadNotes))

        /**
         * Sets [Builder.payloadNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payloadNotes(payloadNotes: JsonField<String>) = apply {
            this.payloadNotes = payloadNotes
        }

        /** Spectral Bands, e.g. Infra-Red. */
        fun spectralBands(spectralBands: String) = spectralBands(JsonField.of(spectralBands))

        /**
         * Sets [Builder.spectralBands] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spectralBands] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spectralBands(spectralBands: JsonField<String>) = apply {
            this.spectralBands = spectralBands
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
         * Returns an immutable instance of [SeraDataEarlyWarningListResponse].
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
        fun build(): SeraDataEarlyWarningListResponse =
            SeraDataEarlyWarningListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                checkRequired("spacecraftId", spacecraftId),
                id,
                bestResolution,
                createdAt,
                createdBy,
                earthPointing,
                frequencyLimits,
                groundStationLocations,
                groundStations,
                hostedForCompanyOrgId,
                idIr,
                manufacturerOrgId,
                missileLaunchPhaseDetectionAbility,
                name,
                origin,
                origNetwork,
                partnerSpacecraftId,
                payloadNotes,
                spectralBands,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SeraDataEarlyWarningListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        spacecraftId()
        id()
        bestResolution()
        createdAt()
        createdBy()
        earthPointing()
        frequencyLimits()
        groundStationLocations()
        groundStations()
        hostedForCompanyOrgId()
        idIr()
        manufacturerOrgId()
        missileLaunchPhaseDetectionAbility()
        name()
        origin()
        origNetwork()
        partnerSpacecraftId()
        payloadNotes()
        spectralBands()
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
            (if (bestResolution.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (earthPointing.asKnown().isPresent) 1 else 0) +
            (if (frequencyLimits.asKnown().isPresent) 1 else 0) +
            (if (groundStationLocations.asKnown().isPresent) 1 else 0) +
            (if (groundStations.asKnown().isPresent) 1 else 0) +
            (if (hostedForCompanyOrgId.asKnown().isPresent) 1 else 0) +
            (if (idIr.asKnown().isPresent) 1 else 0) +
            (if (manufacturerOrgId.asKnown().isPresent) 1 else 0) +
            (if (missileLaunchPhaseDetectionAbility.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (partnerSpacecraftId.asKnown().isPresent) 1 else 0) +
            (if (payloadNotes.asKnown().isPresent) 1 else 0) +
            (if (spectralBands.asKnown().isPresent) 1 else 0)

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

        return other is SeraDataEarlyWarningListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            spacecraftId == other.spacecraftId &&
            id == other.id &&
            bestResolution == other.bestResolution &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            earthPointing == other.earthPointing &&
            frequencyLimits == other.frequencyLimits &&
            groundStationLocations == other.groundStationLocations &&
            groundStations == other.groundStations &&
            hostedForCompanyOrgId == other.hostedForCompanyOrgId &&
            idIr == other.idIr &&
            manufacturerOrgId == other.manufacturerOrgId &&
            missileLaunchPhaseDetectionAbility == other.missileLaunchPhaseDetectionAbility &&
            name == other.name &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            partnerSpacecraftId == other.partnerSpacecraftId &&
            payloadNotes == other.payloadNotes &&
            spectralBands == other.spectralBands &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            source,
            spacecraftId,
            id,
            bestResolution,
            createdAt,
            createdBy,
            earthPointing,
            frequencyLimits,
            groundStationLocations,
            groundStations,
            hostedForCompanyOrgId,
            idIr,
            manufacturerOrgId,
            missileLaunchPhaseDetectionAbility,
            name,
            origin,
            origNetwork,
            partnerSpacecraftId,
            payloadNotes,
            spectralBands,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SeraDataEarlyWarningListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, spacecraftId=$spacecraftId, id=$id, bestResolution=$bestResolution, createdAt=$createdAt, createdBy=$createdBy, earthPointing=$earthPointing, frequencyLimits=$frequencyLimits, groundStationLocations=$groundStationLocations, groundStations=$groundStations, hostedForCompanyOrgId=$hostedForCompanyOrgId, idIr=$idIr, manufacturerOrgId=$manufacturerOrgId, missileLaunchPhaseDetectionAbility=$missileLaunchPhaseDetectionAbility, name=$name, origin=$origin, origNetwork=$origNetwork, partnerSpacecraftId=$partnerSpacecraftId, payloadNotes=$payloadNotes, spectralBands=$spectralBands, additionalProperties=$additionalProperties}"
}

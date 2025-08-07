// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aviationriskmanagement

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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Aviation Risk Management is used to identify, evaluate, and track risks when mission planning by
 * accounting for factors such as crew fatigue and mission complexity.
 */
class AviationRiskManagementRetrieveResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idMission: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val aviationRiskManagementWorksheetRecord:
        JsonField<List<AviationRiskManagementWorksheetRecord>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val extMissionId: JsonField<String>,
    private val missionNumber: JsonField<String>,
    private val orgId: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val unitId: JsonField<String>,
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
        @JsonProperty("idMission") @ExcludeMissing idMission: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aviationRiskManagementWorksheetRecord")
        @ExcludeMissing
        aviationRiskManagementWorksheetRecord:
            JsonField<List<AviationRiskManagementWorksheetRecord>> =
            JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extMissionId")
        @ExcludeMissing
        extMissionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("missionNumber")
        @ExcludeMissing
        missionNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("orgId") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unitId") @ExcludeMissing unitId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idMission,
        source,
        id,
        aviationRiskManagementWorksheetRecord,
        createdAt,
        createdBy,
        extMissionId,
        missionNumber,
        orgId,
        origin,
        origNetwork,
        sourceDl,
        unitId,
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
     * The unique identifier of the mission to which this risk management record is assigned.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idMission(): String = idMission.getRequired("idMission")

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
     * Collection of Aviation Risk Management Worksheet Records.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aviationRiskManagementWorksheetRecord():
        Optional<List<AviationRiskManagementWorksheetRecord>> =
        aviationRiskManagementWorksheetRecord.getOptional("aviationRiskManagementWorksheetRecord")

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
     * Optional mission ID from external systems. This field has no meaning within UDL and is
     * provided as a convenience for systems that require tracking of an internal system generated
     * ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun extMissionId(): Optional<String> = extMissionId.getOptional("extMissionId")

    /**
     * The mission number of the mission associated with this record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun missionNumber(): Optional<String> = missionNumber.getOptional("missionNumber")

    /**
     * Identifier for the organization which this risk management record is evaluated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun orgId(): Optional<String> = orgId.getOptional("orgId")

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
     * The source data library from which this record was received. This could be a remote or
     * tactical UDL or another data library. If null, the record should be assumed to have
     * originated from the primary Enterprise UDL.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

    /**
     * Identifier for the unit which this risk management record is evaluated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun unitId(): Optional<String> = unitId.getOptional("unitId")

    /**
     * Time the row was updated in the database, auto-populated by the system.
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
     * Returns the raw JSON value of [idMission].
     *
     * Unlike [idMission], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idMission") @ExcludeMissing fun _idMission(): JsonField<String> = idMission

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
     * Returns the raw JSON value of [aviationRiskManagementWorksheetRecord].
     *
     * Unlike [aviationRiskManagementWorksheetRecord], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("aviationRiskManagementWorksheetRecord")
    @ExcludeMissing
    fun _aviationRiskManagementWorksheetRecord():
        JsonField<List<AviationRiskManagementWorksheetRecord>> =
        aviationRiskManagementWorksheetRecord

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
     * Returns the raw JSON value of [extMissionId].
     *
     * Unlike [extMissionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extMissionId")
    @ExcludeMissing
    fun _extMissionId(): JsonField<String> = extMissionId

    /**
     * Returns the raw JSON value of [missionNumber].
     *
     * Unlike [missionNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("missionNumber")
    @ExcludeMissing
    fun _missionNumber(): JsonField<String> = missionNumber

    /**
     * Returns the raw JSON value of [orgId].
     *
     * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("orgId") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

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
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [unitId].
     *
     * Unlike [unitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unitId") @ExcludeMissing fun _unitId(): JsonField<String> = unitId

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
         * [AviationRiskManagementRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idMission()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AviationRiskManagementRetrieveResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idMission: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var aviationRiskManagementWorksheetRecord:
            JsonField<MutableList<AviationRiskManagementWorksheetRecord>>? =
            null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var extMissionId: JsonField<String> = JsonMissing.of()
        private var missionNumber: JsonField<String> = JsonMissing.of()
        private var orgId: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var unitId: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            aviationRiskManagementRetrieveResponse: AviationRiskManagementRetrieveResponse
        ) = apply {
            classificationMarking = aviationRiskManagementRetrieveResponse.classificationMarking
            dataMode = aviationRiskManagementRetrieveResponse.dataMode
            idMission = aviationRiskManagementRetrieveResponse.idMission
            source = aviationRiskManagementRetrieveResponse.source
            id = aviationRiskManagementRetrieveResponse.id
            aviationRiskManagementWorksheetRecord =
                aviationRiskManagementRetrieveResponse.aviationRiskManagementWorksheetRecord.map {
                    it.toMutableList()
                }
            createdAt = aviationRiskManagementRetrieveResponse.createdAt
            createdBy = aviationRiskManagementRetrieveResponse.createdBy
            extMissionId = aviationRiskManagementRetrieveResponse.extMissionId
            missionNumber = aviationRiskManagementRetrieveResponse.missionNumber
            orgId = aviationRiskManagementRetrieveResponse.orgId
            origin = aviationRiskManagementRetrieveResponse.origin
            origNetwork = aviationRiskManagementRetrieveResponse.origNetwork
            sourceDl = aviationRiskManagementRetrieveResponse.sourceDl
            unitId = aviationRiskManagementRetrieveResponse.unitId
            updatedAt = aviationRiskManagementRetrieveResponse.updatedAt
            updatedBy = aviationRiskManagementRetrieveResponse.updatedBy
            additionalProperties =
                aviationRiskManagementRetrieveResponse.additionalProperties.toMutableMap()
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
         * The unique identifier of the mission to which this risk management record is assigned.
         */
        fun idMission(idMission: String) = idMission(JsonField.of(idMission))

        /**
         * Sets [Builder.idMission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idMission] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idMission(idMission: JsonField<String>) = apply { this.idMission = idMission }

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

        /** Collection of Aviation Risk Management Worksheet Records. */
        fun aviationRiskManagementWorksheetRecord(
            aviationRiskManagementWorksheetRecord: List<AviationRiskManagementWorksheetRecord>
        ) =
            aviationRiskManagementWorksheetRecord(
                JsonField.of(aviationRiskManagementWorksheetRecord)
            )

        /**
         * Sets [Builder.aviationRiskManagementWorksheetRecord] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aviationRiskManagementWorksheetRecord] with a well-typed
         * `List<AviationRiskManagementWorksheetRecord>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun aviationRiskManagementWorksheetRecord(
            aviationRiskManagementWorksheetRecord:
                JsonField<List<AviationRiskManagementWorksheetRecord>>
        ) = apply {
            this.aviationRiskManagementWorksheetRecord =
                aviationRiskManagementWorksheetRecord.map { it.toMutableList() }
        }

        /**
         * Adds a single [AviationRiskManagementWorksheetRecord] to
         * [Builder.aviationRiskManagementWorksheetRecord].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAviationRiskManagementWorksheetRecord(
            aviationRiskManagementWorksheetRecord: AviationRiskManagementWorksheetRecord
        ) = apply {
            this.aviationRiskManagementWorksheetRecord =
                (this.aviationRiskManagementWorksheetRecord ?: JsonField.of(mutableListOf())).also {
                    checkKnown("aviationRiskManagementWorksheetRecord", it)
                        .add(aviationRiskManagementWorksheetRecord)
                }
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
         * Optional mission ID from external systems. This field has no meaning within UDL and is
         * provided as a convenience for systems that require tracking of an internal system
         * generated ID.
         */
        fun extMissionId(extMissionId: String) = extMissionId(JsonField.of(extMissionId))

        /**
         * Sets [Builder.extMissionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extMissionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extMissionId(extMissionId: JsonField<String>) = apply {
            this.extMissionId = extMissionId
        }

        /** The mission number of the mission associated with this record. */
        fun missionNumber(missionNumber: String) = missionNumber(JsonField.of(missionNumber))

        /**
         * Sets [Builder.missionNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missionNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun missionNumber(missionNumber: JsonField<String>) = apply {
            this.missionNumber = missionNumber
        }

        /** Identifier for the organization which this risk management record is evaluated. */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /**
         * Sets [Builder.orgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

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

        /** Identifier for the unit which this risk management record is evaluated. */
        fun unitId(unitId: String) = unitId(JsonField.of(unitId))

        /**
         * Sets [Builder.unitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unitId(unitId: JsonField<String>) = apply { this.unitId = unitId }

        /** Time the row was updated in the database, auto-populated by the system. */
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
         * Returns an immutable instance of [AviationRiskManagementRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idMission()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AviationRiskManagementRetrieveResponse =
            AviationRiskManagementRetrieveResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idMission", idMission),
                checkRequired("source", source),
                id,
                (aviationRiskManagementWorksheetRecord ?: JsonMissing.of()).map {
                    it.toImmutable()
                },
                createdAt,
                createdBy,
                extMissionId,
                missionNumber,
                orgId,
                origin,
                origNetwork,
                sourceDl,
                unitId,
                updatedAt,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AviationRiskManagementRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idMission()
        source()
        id()
        aviationRiskManagementWorksheetRecord().ifPresent { it.forEach { it.validate() } }
        createdAt()
        createdBy()
        extMissionId()
        missionNumber()
        orgId()
        origin()
        origNetwork()
        sourceDl()
        unitId()
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
            (if (idMission.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (aviationRiskManagementWorksheetRecord.asKnown().getOrNull()?.sumOf {
                it.validity().toInt()
            } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (extMissionId.asKnown().isPresent) 1 else 0) +
            (if (missionNumber.asKnown().isPresent) 1 else 0) +
            (if (orgId.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (unitId.asKnown().isPresent) 1 else 0) +
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

    /** Collection of Aviation Risk Management Worksheet Records. */
    class AviationRiskManagementWorksheetRecord
    private constructor(
        private val missionDate: JsonField<LocalDate>,
        private val aircraftMds: JsonField<String>,
        private val approvalPending: JsonField<Boolean>,
        private val approved: JsonField<Boolean>,
        private val aviationRiskManagementWorksheetScore:
            JsonField<List<AviationRiskManagementWorksheetScore>>,
        private val dispositionComments: JsonField<String>,
        private val extRecordId: JsonField<String>,
        private val itinerary: JsonField<String>,
        private val lastUpdatedAt: JsonField<OffsetDateTime>,
        private val remarks: JsonField<String>,
        private val severityLevel: JsonField<Int>,
        private val submissionDate: JsonField<OffsetDateTime>,
        private val tierNumber: JsonField<Int>,
        private val totalScore: JsonField<Int>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("missionDate")
            @ExcludeMissing
            missionDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("aircraftMDS")
            @ExcludeMissing
            aircraftMds: JsonField<String> = JsonMissing.of(),
            @JsonProperty("approvalPending")
            @ExcludeMissing
            approvalPending: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("approved")
            @ExcludeMissing
            approved: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("aviationRiskManagementWorksheetScore")
            @ExcludeMissing
            aviationRiskManagementWorksheetScore:
                JsonField<List<AviationRiskManagementWorksheetScore>> =
                JsonMissing.of(),
            @JsonProperty("dispositionComments")
            @ExcludeMissing
            dispositionComments: JsonField<String> = JsonMissing.of(),
            @JsonProperty("extRecordId")
            @ExcludeMissing
            extRecordId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("itinerary")
            @ExcludeMissing
            itinerary: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastUpdatedAt")
            @ExcludeMissing
            lastUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("remarks") @ExcludeMissing remarks: JsonField<String> = JsonMissing.of(),
            @JsonProperty("severityLevel")
            @ExcludeMissing
            severityLevel: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("submissionDate")
            @ExcludeMissing
            submissionDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("tierNumber")
            @ExcludeMissing
            tierNumber: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("totalScore")
            @ExcludeMissing
            totalScore: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        ) : this(
            missionDate,
            aircraftMds,
            approvalPending,
            approved,
            aviationRiskManagementWorksheetScore,
            dispositionComments,
            extRecordId,
            itinerary,
            lastUpdatedAt,
            remarks,
            severityLevel,
            submissionDate,
            tierNumber,
            totalScore,
            userId,
            mutableMapOf(),
        )

        /**
         * Date of the mission in ISO 8601 date-only format (YYYY-MM-DD).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun missionDate(): LocalDate = missionDate.getRequired("missionDate")

        /**
         * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE, KC-130
         * HERCULES, etc.) of the aircraft associated with this risk management worksheet record.
         * Intended as, but not constrained to, MIL-STD-6016 environment dependent specific type
         * designations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun aircraftMds(): Optional<String> = aircraftMds.getOptional("aircraftMDS")

        /**
         * Flag indicating the worksheet record is pending approval.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun approvalPending(): Optional<Boolean> = approvalPending.getOptional("approvalPending")

        /**
         * Flag indicating the worksheet record is approved.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun approved(): Optional<Boolean> = approved.getOptional("approved")

        /**
         * Collection of Aviation Risk Management worksheet record scores.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun aviationRiskManagementWorksheetScore():
            Optional<List<AviationRiskManagementWorksheetScore>> =
            aviationRiskManagementWorksheetScore.getOptional("aviationRiskManagementWorksheetScore")

        /**
         * Comment(s) explaining why the worksheet record has been approved or disapproved.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dispositionComments(): Optional<String> =
            dispositionComments.getOptional("dispositionComments")

        /**
         * Optional identifier of the worksheet record provided by the data source. This field has
         * no meaning within UDL and is provided as a convenience for systems that require tracking
         * of an internal system generated ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun extRecordId(): Optional<String> = extRecordId.getOptional("extRecordId")

        /**
         * Sequential order of itinerary locations associated for the mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun itinerary(): Optional<String> = itinerary.getOptional("itinerary")

        /**
         * Timestamp the worksheet record was updated, in ISO 8601 UTC format with millisecond
         * precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lastUpdatedAt(): Optional<OffsetDateTime> = lastUpdatedAt.getOptional("lastUpdatedAt")

        /**
         * Remarks and/or comments regarding the worksheet record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun remarks(): Optional<String> = remarks.getOptional("remarks")

        /**
         * Numeric assignment for the worksheet record severity. 0 - LOW; 1 - MODERATE; 2 - HIGH;
         * 3 - SEVERE.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun severityLevel(): Optional<Int> = severityLevel.getOptional("severityLevel")

        /**
         * Timestamp the worksheet record was submitted, in ISO 8601 UTC format with millisecond
         * precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun submissionDate(): Optional<OffsetDateTime> =
            submissionDate.getOptional("submissionDate")

        /**
         * Tier number which the mission is being scored as determined by the data source. For
         * example, Tier 1 may indicate mission planners, Tier 2 may indicate operations personnel,
         * Tier 3 may indicate squadron leadership, and Tier 4 may indicate the aircrew.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tierNumber(): Optional<Int> = tierNumber.getOptional("tierNumber")

        /**
         * Total score for the worksheet record as defined by the data source. Larger values
         * indicate a higher risk level. For example, values between 0-10 may indicate a low risk
         * level, where values greater then 40 indicate a severe risk level.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalScore(): Optional<Int> = totalScore.getOptional("totalScore")

        /**
         * User identifier associated to the worksheet record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun userId(): Optional<String> = userId.getOptional("userId")

        /**
         * Returns the raw JSON value of [missionDate].
         *
         * Unlike [missionDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("missionDate")
        @ExcludeMissing
        fun _missionDate(): JsonField<LocalDate> = missionDate

        /**
         * Returns the raw JSON value of [aircraftMds].
         *
         * Unlike [aircraftMds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aircraftMDS")
        @ExcludeMissing
        fun _aircraftMds(): JsonField<String> = aircraftMds

        /**
         * Returns the raw JSON value of [approvalPending].
         *
         * Unlike [approvalPending], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("approvalPending")
        @ExcludeMissing
        fun _approvalPending(): JsonField<Boolean> = approvalPending

        /**
         * Returns the raw JSON value of [approved].
         *
         * Unlike [approved], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approved") @ExcludeMissing fun _approved(): JsonField<Boolean> = approved

        /**
         * Returns the raw JSON value of [aviationRiskManagementWorksheetScore].
         *
         * Unlike [aviationRiskManagementWorksheetScore], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("aviationRiskManagementWorksheetScore")
        @ExcludeMissing
        fun _aviationRiskManagementWorksheetScore():
            JsonField<List<AviationRiskManagementWorksheetScore>> =
            aviationRiskManagementWorksheetScore

        /**
         * Returns the raw JSON value of [dispositionComments].
         *
         * Unlike [dispositionComments], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("dispositionComments")
        @ExcludeMissing
        fun _dispositionComments(): JsonField<String> = dispositionComments

        /**
         * Returns the raw JSON value of [extRecordId].
         *
         * Unlike [extRecordId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("extRecordId")
        @ExcludeMissing
        fun _extRecordId(): JsonField<String> = extRecordId

        /**
         * Returns the raw JSON value of [itinerary].
         *
         * Unlike [itinerary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("itinerary") @ExcludeMissing fun _itinerary(): JsonField<String> = itinerary

        /**
         * Returns the raw JSON value of [lastUpdatedAt].
         *
         * Unlike [lastUpdatedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lastUpdatedAt")
        @ExcludeMissing
        fun _lastUpdatedAt(): JsonField<OffsetDateTime> = lastUpdatedAt

        /**
         * Returns the raw JSON value of [remarks].
         *
         * Unlike [remarks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("remarks") @ExcludeMissing fun _remarks(): JsonField<String> = remarks

        /**
         * Returns the raw JSON value of [severityLevel].
         *
         * Unlike [severityLevel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("severityLevel")
        @ExcludeMissing
        fun _severityLevel(): JsonField<Int> = severityLevel

        /**
         * Returns the raw JSON value of [submissionDate].
         *
         * Unlike [submissionDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("submissionDate")
        @ExcludeMissing
        fun _submissionDate(): JsonField<OffsetDateTime> = submissionDate

        /**
         * Returns the raw JSON value of [tierNumber].
         *
         * Unlike [tierNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tierNumber") @ExcludeMissing fun _tierNumber(): JsonField<Int> = tierNumber

        /**
         * Returns the raw JSON value of [totalScore].
         *
         * Unlike [totalScore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totalScore") @ExcludeMissing fun _totalScore(): JsonField<Int> = totalScore

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
             * [AviationRiskManagementWorksheetRecord].
             *
             * The following fields are required:
             * ```java
             * .missionDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AviationRiskManagementWorksheetRecord]. */
        class Builder internal constructor() {

            private var missionDate: JsonField<LocalDate>? = null
            private var aircraftMds: JsonField<String> = JsonMissing.of()
            private var approvalPending: JsonField<Boolean> = JsonMissing.of()
            private var approved: JsonField<Boolean> = JsonMissing.of()
            private var aviationRiskManagementWorksheetScore:
                JsonField<MutableList<AviationRiskManagementWorksheetScore>>? =
                null
            private var dispositionComments: JsonField<String> = JsonMissing.of()
            private var extRecordId: JsonField<String> = JsonMissing.of()
            private var itinerary: JsonField<String> = JsonMissing.of()
            private var lastUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var remarks: JsonField<String> = JsonMissing.of()
            private var severityLevel: JsonField<Int> = JsonMissing.of()
            private var submissionDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var tierNumber: JsonField<Int> = JsonMissing.of()
            private var totalScore: JsonField<Int> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                aviationRiskManagementWorksheetRecord: AviationRiskManagementWorksheetRecord
            ) = apply {
                missionDate = aviationRiskManagementWorksheetRecord.missionDate
                aircraftMds = aviationRiskManagementWorksheetRecord.aircraftMds
                approvalPending = aviationRiskManagementWorksheetRecord.approvalPending
                approved = aviationRiskManagementWorksheetRecord.approved
                aviationRiskManagementWorksheetScore =
                    aviationRiskManagementWorksheetRecord.aviationRiskManagementWorksheetScore.map {
                        it.toMutableList()
                    }
                dispositionComments = aviationRiskManagementWorksheetRecord.dispositionComments
                extRecordId = aviationRiskManagementWorksheetRecord.extRecordId
                itinerary = aviationRiskManagementWorksheetRecord.itinerary
                lastUpdatedAt = aviationRiskManagementWorksheetRecord.lastUpdatedAt
                remarks = aviationRiskManagementWorksheetRecord.remarks
                severityLevel = aviationRiskManagementWorksheetRecord.severityLevel
                submissionDate = aviationRiskManagementWorksheetRecord.submissionDate
                tierNumber = aviationRiskManagementWorksheetRecord.tierNumber
                totalScore = aviationRiskManagementWorksheetRecord.totalScore
                userId = aviationRiskManagementWorksheetRecord.userId
                additionalProperties =
                    aviationRiskManagementWorksheetRecord.additionalProperties.toMutableMap()
            }

            /** Date of the mission in ISO 8601 date-only format (YYYY-MM-DD). */
            fun missionDate(missionDate: LocalDate) = missionDate(JsonField.of(missionDate))

            /**
             * Sets [Builder.missionDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionDate(missionDate: JsonField<LocalDate>) = apply {
                this.missionDate = missionDate
            }

            /**
             * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE,
             * KC-130 HERCULES, etc.) of the aircraft associated with this risk management worksheet
             * record. Intended as, but not constrained to, MIL-STD-6016 environment dependent
             * specific type designations.
             */
            fun aircraftMds(aircraftMds: String) = aircraftMds(JsonField.of(aircraftMds))

            /**
             * Sets [Builder.aircraftMds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aircraftMds] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aircraftMds(aircraftMds: JsonField<String>) = apply {
                this.aircraftMds = aircraftMds
            }

            /** Flag indicating the worksheet record is pending approval. */
            fun approvalPending(approvalPending: Boolean) =
                approvalPending(JsonField.of(approvalPending))

            /**
             * Sets [Builder.approvalPending] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approvalPending] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approvalPending(approvalPending: JsonField<Boolean>) = apply {
                this.approvalPending = approvalPending
            }

            /** Flag indicating the worksheet record is approved. */
            fun approved(approved: Boolean) = approved(JsonField.of(approved))

            /**
             * Sets [Builder.approved] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approved] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approved(approved: JsonField<Boolean>) = apply { this.approved = approved }

            /** Collection of Aviation Risk Management worksheet record scores. */
            fun aviationRiskManagementWorksheetScore(
                aviationRiskManagementWorksheetScore: List<AviationRiskManagementWorksheetScore>
            ) =
                aviationRiskManagementWorksheetScore(
                    JsonField.of(aviationRiskManagementWorksheetScore)
                )

            /**
             * Sets [Builder.aviationRiskManagementWorksheetScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aviationRiskManagementWorksheetScore] with a
             * well-typed `List<AviationRiskManagementWorksheetScore>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun aviationRiskManagementWorksheetScore(
                aviationRiskManagementWorksheetScore:
                    JsonField<List<AviationRiskManagementWorksheetScore>>
            ) = apply {
                this.aviationRiskManagementWorksheetScore =
                    aviationRiskManagementWorksheetScore.map { it.toMutableList() }
            }

            /**
             * Adds a single [AviationRiskManagementWorksheetScore] to
             * [Builder.aviationRiskManagementWorksheetScore].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAviationRiskManagementWorksheetScore(
                aviationRiskManagementWorksheetScore: AviationRiskManagementWorksheetScore
            ) = apply {
                this.aviationRiskManagementWorksheetScore =
                    (this.aviationRiskManagementWorksheetScore ?: JsonField.of(mutableListOf()))
                        .also {
                            checkKnown("aviationRiskManagementWorksheetScore", it)
                                .add(aviationRiskManagementWorksheetScore)
                        }
            }

            /** Comment(s) explaining why the worksheet record has been approved or disapproved. */
            fun dispositionComments(dispositionComments: String) =
                dispositionComments(JsonField.of(dispositionComments))

            /**
             * Sets [Builder.dispositionComments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dispositionComments] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dispositionComments(dispositionComments: JsonField<String>) = apply {
                this.dispositionComments = dispositionComments
            }

            /**
             * Optional identifier of the worksheet record provided by the data source. This field
             * has no meaning within UDL and is provided as a convenience for systems that require
             * tracking of an internal system generated ID.
             */
            fun extRecordId(extRecordId: String) = extRecordId(JsonField.of(extRecordId))

            /**
             * Sets [Builder.extRecordId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extRecordId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extRecordId(extRecordId: JsonField<String>) = apply {
                this.extRecordId = extRecordId
            }

            /** Sequential order of itinerary locations associated for the mission. */
            fun itinerary(itinerary: String) = itinerary(JsonField.of(itinerary))

            /**
             * Sets [Builder.itinerary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itinerary] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itinerary(itinerary: JsonField<String>) = apply { this.itinerary = itinerary }

            /**
             * Timestamp the worksheet record was updated, in ISO 8601 UTC format with millisecond
             * precision.
             */
            fun lastUpdatedAt(lastUpdatedAt: OffsetDateTime) =
                lastUpdatedAt(JsonField.of(lastUpdatedAt))

            /**
             * Sets [Builder.lastUpdatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastUpdatedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lastUpdatedAt(lastUpdatedAt: JsonField<OffsetDateTime>) = apply {
                this.lastUpdatedAt = lastUpdatedAt
            }

            /** Remarks and/or comments regarding the worksheet record. */
            fun remarks(remarks: String) = remarks(JsonField.of(remarks))

            /**
             * Sets [Builder.remarks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remarks] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remarks(remarks: JsonField<String>) = apply { this.remarks = remarks }

            /**
             * Numeric assignment for the worksheet record severity. 0 - LOW; 1 - MODERATE; 2 -
             * HIGH; 3 - SEVERE.
             */
            fun severityLevel(severityLevel: Int) = severityLevel(JsonField.of(severityLevel))

            /**
             * Sets [Builder.severityLevel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.severityLevel] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun severityLevel(severityLevel: JsonField<Int>) = apply {
                this.severityLevel = severityLevel
            }

            /**
             * Timestamp the worksheet record was submitted, in ISO 8601 UTC format with millisecond
             * precision.
             */
            fun submissionDate(submissionDate: OffsetDateTime) =
                submissionDate(JsonField.of(submissionDate))

            /**
             * Sets [Builder.submissionDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.submissionDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun submissionDate(submissionDate: JsonField<OffsetDateTime>) = apply {
                this.submissionDate = submissionDate
            }

            /**
             * Tier number which the mission is being scored as determined by the data source. For
             * example, Tier 1 may indicate mission planners, Tier 2 may indicate operations
             * personnel, Tier 3 may indicate squadron leadership, and Tier 4 may indicate the
             * aircrew.
             */
            fun tierNumber(tierNumber: Int) = tierNumber(JsonField.of(tierNumber))

            /**
             * Sets [Builder.tierNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tierNumber] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tierNumber(tierNumber: JsonField<Int>) = apply { this.tierNumber = tierNumber }

            /**
             * Total score for the worksheet record as defined by the data source. Larger values
             * indicate a higher risk level. For example, values between 0-10 may indicate a low
             * risk level, where values greater then 40 indicate a severe risk level.
             */
            fun totalScore(totalScore: Int) = totalScore(JsonField.of(totalScore))

            /**
             * Sets [Builder.totalScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalScore] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalScore(totalScore: JsonField<Int>) = apply { this.totalScore = totalScore }

            /** User identifier associated to the worksheet record. */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
             * Returns an immutable instance of [AviationRiskManagementWorksheetRecord].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .missionDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AviationRiskManagementWorksheetRecord =
                AviationRiskManagementWorksheetRecord(
                    checkRequired("missionDate", missionDate),
                    aircraftMds,
                    approvalPending,
                    approved,
                    (aviationRiskManagementWorksheetScore ?: JsonMissing.of()).map {
                        it.toImmutable()
                    },
                    dispositionComments,
                    extRecordId,
                    itinerary,
                    lastUpdatedAt,
                    remarks,
                    severityLevel,
                    submissionDate,
                    tierNumber,
                    totalScore,
                    userId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AviationRiskManagementWorksheetRecord = apply {
            if (validated) {
                return@apply
            }

            missionDate()
            aircraftMds()
            approvalPending()
            approved()
            aviationRiskManagementWorksheetScore().ifPresent { it.forEach { it.validate() } }
            dispositionComments()
            extRecordId()
            itinerary()
            lastUpdatedAt()
            remarks()
            severityLevel()
            submissionDate()
            tierNumber()
            totalScore()
            userId()
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
            (if (missionDate.asKnown().isPresent) 1 else 0) +
                (if (aircraftMds.asKnown().isPresent) 1 else 0) +
                (if (approvalPending.asKnown().isPresent) 1 else 0) +
                (if (approved.asKnown().isPresent) 1 else 0) +
                (aviationRiskManagementWorksheetScore.asKnown().getOrNull()?.sumOf {
                    it.validity().toInt()
                } ?: 0) +
                (if (dispositionComments.asKnown().isPresent) 1 else 0) +
                (if (extRecordId.asKnown().isPresent) 1 else 0) +
                (if (itinerary.asKnown().isPresent) 1 else 0) +
                (if (lastUpdatedAt.asKnown().isPresent) 1 else 0) +
                (if (remarks.asKnown().isPresent) 1 else 0) +
                (if (severityLevel.asKnown().isPresent) 1 else 0) +
                (if (submissionDate.asKnown().isPresent) 1 else 0) +
                (if (tierNumber.asKnown().isPresent) 1 else 0) +
                (if (totalScore.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0)

        /** Collection of Aviation Risk Management worksheet record scores. */
        class AviationRiskManagementWorksheetScore
        private constructor(
            private val approvalDate: JsonField<OffsetDateTime>,
            private val approvedBy: JsonField<String>,
            private val approvedCode: JsonField<Int>,
            private val aviationRiskManagementSortie: JsonField<List<AviationRiskManagementSortie>>,
            private val extScoreId: JsonField<String>,
            private val riskCategory: JsonField<String>,
            private val riskDescription: JsonField<String>,
            private val riskKey: JsonField<String>,
            private val riskName: JsonField<String>,
            private val score: JsonField<Int>,
            private val scoreRemark: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("approvalDate")
                @ExcludeMissing
                approvalDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("approvedBy")
                @ExcludeMissing
                approvedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("approvedCode")
                @ExcludeMissing
                approvedCode: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("aviationRiskManagementSortie")
                @ExcludeMissing
                aviationRiskManagementSortie: JsonField<List<AviationRiskManagementSortie>> =
                    JsonMissing.of(),
                @JsonProperty("extScoreId")
                @ExcludeMissing
                extScoreId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("riskCategory")
                @ExcludeMissing
                riskCategory: JsonField<String> = JsonMissing.of(),
                @JsonProperty("riskDescription")
                @ExcludeMissing
                riskDescription: JsonField<String> = JsonMissing.of(),
                @JsonProperty("riskKey")
                @ExcludeMissing
                riskKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("riskName")
                @ExcludeMissing
                riskName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("score") @ExcludeMissing score: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("scoreRemark")
                @ExcludeMissing
                scoreRemark: JsonField<String> = JsonMissing.of(),
            ) : this(
                approvalDate,
                approvedBy,
                approvedCode,
                aviationRiskManagementSortie,
                extScoreId,
                riskCategory,
                riskDescription,
                riskKey,
                riskName,
                score,
                scoreRemark,
                mutableMapOf(),
            )

            /**
             * Timestamp the worksheet record score was approval or disapproval, in ISO 8601 UTC
             * format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun approvalDate(): Optional<OffsetDateTime> = approvalDate.getOptional("approvalDate")

            /**
             * Name of the individual who approved or disapproved of the score.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun approvedBy(): Optional<String> = approvedBy.getOptional("approvedBy")

            /**
             * Numeric assignment used to determine score approval. 0 - APPROVAL PENDING (used when
             * score value is 2 or 3); 1 - APPROVED (used when score value is 2 or 3); 2 -
             * DISAPPROVED.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun approvedCode(): Optional<Int> = approvedCode.getOptional("approvedCode")

            /**
             * Collection of aviation risk management worksheet record score aircraft sorties.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun aviationRiskManagementSortie(): Optional<List<AviationRiskManagementSortie>> =
                aviationRiskManagementSortie.getOptional("aviationRiskManagementSortie")

            /**
             * Optional identifier of the worksheet record score provided by the data source. This
             * field has no meaning within UDL and is provided as a convenience for systems that
             * require tracking of an internal system generated ID.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun extScoreId(): Optional<String> = extScoreId.getOptional("extScoreId")

            /**
             * The category of the risk factor.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun riskCategory(): Optional<String> = riskCategory.getOptional("riskCategory")

            /**
             * Description of the risk factor.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun riskDescription(): Optional<String> = riskDescription.getOptional("riskDescription")

            /**
             * Code or identifier of the risk factor category as defined by the data source.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun riskKey(): Optional<String> = riskKey.getOptional("riskKey")

            /**
             * Name of the risk factor.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun riskName(): Optional<String> = riskName.getOptional("riskName")

            /**
             * Score of the worksheet record risk factor. Value ranges from 0 to 3, where a value of
             * 0 indicates a low and a value of 3 indicates severe. A value of -1 indicates no
             * score.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun score(): Optional<Int> = score.getOptional("score")

            /**
             * Remarks and/or comments regarding the worksheet score.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun scoreRemark(): Optional<String> = scoreRemark.getOptional("scoreRemark")

            /**
             * Returns the raw JSON value of [approvalDate].
             *
             * Unlike [approvalDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("approvalDate")
            @ExcludeMissing
            fun _approvalDate(): JsonField<OffsetDateTime> = approvalDate

            /**
             * Returns the raw JSON value of [approvedBy].
             *
             * Unlike [approvedBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("approvedBy")
            @ExcludeMissing
            fun _approvedBy(): JsonField<String> = approvedBy

            /**
             * Returns the raw JSON value of [approvedCode].
             *
             * Unlike [approvedCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("approvedCode")
            @ExcludeMissing
            fun _approvedCode(): JsonField<Int> = approvedCode

            /**
             * Returns the raw JSON value of [aviationRiskManagementSortie].
             *
             * Unlike [aviationRiskManagementSortie], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("aviationRiskManagementSortie")
            @ExcludeMissing
            fun _aviationRiskManagementSortie(): JsonField<List<AviationRiskManagementSortie>> =
                aviationRiskManagementSortie

            /**
             * Returns the raw JSON value of [extScoreId].
             *
             * Unlike [extScoreId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("extScoreId")
            @ExcludeMissing
            fun _extScoreId(): JsonField<String> = extScoreId

            /**
             * Returns the raw JSON value of [riskCategory].
             *
             * Unlike [riskCategory], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("riskCategory")
            @ExcludeMissing
            fun _riskCategory(): JsonField<String> = riskCategory

            /**
             * Returns the raw JSON value of [riskDescription].
             *
             * Unlike [riskDescription], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("riskDescription")
            @ExcludeMissing
            fun _riskDescription(): JsonField<String> = riskDescription

            /**
             * Returns the raw JSON value of [riskKey].
             *
             * Unlike [riskKey], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("riskKey") @ExcludeMissing fun _riskKey(): JsonField<String> = riskKey

            /**
             * Returns the raw JSON value of [riskName].
             *
             * Unlike [riskName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("riskName") @ExcludeMissing fun _riskName(): JsonField<String> = riskName

            /**
             * Returns the raw JSON value of [score].
             *
             * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Int> = score

            /**
             * Returns the raw JSON value of [scoreRemark].
             *
             * Unlike [scoreRemark], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("scoreRemark")
            @ExcludeMissing
            fun _scoreRemark(): JsonField<String> = scoreRemark

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
                 * [AviationRiskManagementWorksheetScore].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AviationRiskManagementWorksheetScore]. */
            class Builder internal constructor() {

                private var approvalDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var approvedBy: JsonField<String> = JsonMissing.of()
                private var approvedCode: JsonField<Int> = JsonMissing.of()
                private var aviationRiskManagementSortie:
                    JsonField<MutableList<AviationRiskManagementSortie>>? =
                    null
                private var extScoreId: JsonField<String> = JsonMissing.of()
                private var riskCategory: JsonField<String> = JsonMissing.of()
                private var riskDescription: JsonField<String> = JsonMissing.of()
                private var riskKey: JsonField<String> = JsonMissing.of()
                private var riskName: JsonField<String> = JsonMissing.of()
                private var score: JsonField<Int> = JsonMissing.of()
                private var scoreRemark: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    aviationRiskManagementWorksheetScore: AviationRiskManagementWorksheetScore
                ) = apply {
                    approvalDate = aviationRiskManagementWorksheetScore.approvalDate
                    approvedBy = aviationRiskManagementWorksheetScore.approvedBy
                    approvedCode = aviationRiskManagementWorksheetScore.approvedCode
                    aviationRiskManagementSortie =
                        aviationRiskManagementWorksheetScore.aviationRiskManagementSortie.map {
                            it.toMutableList()
                        }
                    extScoreId = aviationRiskManagementWorksheetScore.extScoreId
                    riskCategory = aviationRiskManagementWorksheetScore.riskCategory
                    riskDescription = aviationRiskManagementWorksheetScore.riskDescription
                    riskKey = aviationRiskManagementWorksheetScore.riskKey
                    riskName = aviationRiskManagementWorksheetScore.riskName
                    score = aviationRiskManagementWorksheetScore.score
                    scoreRemark = aviationRiskManagementWorksheetScore.scoreRemark
                    additionalProperties =
                        aviationRiskManagementWorksheetScore.additionalProperties.toMutableMap()
                }

                /**
                 * Timestamp the worksheet record score was approval or disapproval, in ISO 8601 UTC
                 * format with millisecond precision.
                 */
                fun approvalDate(approvalDate: OffsetDateTime) =
                    approvalDate(JsonField.of(approvalDate))

                /**
                 * Sets [Builder.approvalDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.approvalDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun approvalDate(approvalDate: JsonField<OffsetDateTime>) = apply {
                    this.approvalDate = approvalDate
                }

                /** Name of the individual who approved or disapproved of the score. */
                fun approvedBy(approvedBy: String) = approvedBy(JsonField.of(approvedBy))

                /**
                 * Sets [Builder.approvedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.approvedBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun approvedBy(approvedBy: JsonField<String>) = apply {
                    this.approvedBy = approvedBy
                }

                /**
                 * Numeric assignment used to determine score approval. 0 - APPROVAL PENDING (used
                 * when score value is 2 or 3); 1 - APPROVED (used when score value is 2 or 3); 2 -
                 * DISAPPROVED.
                 */
                fun approvedCode(approvedCode: Int) = approvedCode(JsonField.of(approvedCode))

                /**
                 * Sets [Builder.approvedCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.approvedCode] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun approvedCode(approvedCode: JsonField<Int>) = apply {
                    this.approvedCode = approvedCode
                }

                /**
                 * Collection of aviation risk management worksheet record score aircraft sorties.
                 */
                fun aviationRiskManagementSortie(
                    aviationRiskManagementSortie: List<AviationRiskManagementSortie>
                ) = aviationRiskManagementSortie(JsonField.of(aviationRiskManagementSortie))

                /**
                 * Sets [Builder.aviationRiskManagementSortie] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aviationRiskManagementSortie] with a well-typed
                 * `List<AviationRiskManagementSortie>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun aviationRiskManagementSortie(
                    aviationRiskManagementSortie: JsonField<List<AviationRiskManagementSortie>>
                ) = apply {
                    this.aviationRiskManagementSortie =
                        aviationRiskManagementSortie.map { it.toMutableList() }
                }

                /**
                 * Adds a single [AviationRiskManagementSortie] to
                 * [Builder.aviationRiskManagementSortie].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAviationRiskManagementSortie(
                    aviationRiskManagementSortie: AviationRiskManagementSortie
                ) = apply {
                    this.aviationRiskManagementSortie =
                        (this.aviationRiskManagementSortie ?: JsonField.of(mutableListOf())).also {
                            checkKnown("aviationRiskManagementSortie", it)
                                .add(aviationRiskManagementSortie)
                        }
                }

                /**
                 * Optional identifier of the worksheet record score provided by the data source.
                 * This field has no meaning within UDL and is provided as a convenience for systems
                 * that require tracking of an internal system generated ID.
                 */
                fun extScoreId(extScoreId: String) = extScoreId(JsonField.of(extScoreId))

                /**
                 * Sets [Builder.extScoreId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.extScoreId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun extScoreId(extScoreId: JsonField<String>) = apply {
                    this.extScoreId = extScoreId
                }

                /** The category of the risk factor. */
                fun riskCategory(riskCategory: String) = riskCategory(JsonField.of(riskCategory))

                /**
                 * Sets [Builder.riskCategory] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.riskCategory] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun riskCategory(riskCategory: JsonField<String>) = apply {
                    this.riskCategory = riskCategory
                }

                /** Description of the risk factor. */
                fun riskDescription(riskDescription: String) =
                    riskDescription(JsonField.of(riskDescription))

                /**
                 * Sets [Builder.riskDescription] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.riskDescription] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun riskDescription(riskDescription: JsonField<String>) = apply {
                    this.riskDescription = riskDescription
                }

                /** Code or identifier of the risk factor category as defined by the data source. */
                fun riskKey(riskKey: String) = riskKey(JsonField.of(riskKey))

                /**
                 * Sets [Builder.riskKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.riskKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun riskKey(riskKey: JsonField<String>) = apply { this.riskKey = riskKey }

                /** Name of the risk factor. */
                fun riskName(riskName: String) = riskName(JsonField.of(riskName))

                /**
                 * Sets [Builder.riskName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.riskName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun riskName(riskName: JsonField<String>) = apply { this.riskName = riskName }

                /**
                 * Score of the worksheet record risk factor. Value ranges from 0 to 3, where a
                 * value of 0 indicates a low and a value of 3 indicates severe. A value of -1
                 * indicates no score.
                 */
                fun score(score: Int) = score(JsonField.of(score))

                /**
                 * Sets [Builder.score] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.score] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun score(score: JsonField<Int>) = apply { this.score = score }

                /** Remarks and/or comments regarding the worksheet score. */
                fun scoreRemark(scoreRemark: String) = scoreRemark(JsonField.of(scoreRemark))

                /**
                 * Sets [Builder.scoreRemark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scoreRemark] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun scoreRemark(scoreRemark: JsonField<String>) = apply {
                    this.scoreRemark = scoreRemark
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AviationRiskManagementWorksheetScore].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AviationRiskManagementWorksheetScore =
                    AviationRiskManagementWorksheetScore(
                        approvalDate,
                        approvedBy,
                        approvedCode,
                        (aviationRiskManagementSortie ?: JsonMissing.of()).map { it.toImmutable() },
                        extScoreId,
                        riskCategory,
                        riskDescription,
                        riskKey,
                        riskName,
                        score,
                        scoreRemark,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AviationRiskManagementWorksheetScore = apply {
                if (validated) {
                    return@apply
                }

                approvalDate()
                approvedBy()
                approvedCode()
                aviationRiskManagementSortie().ifPresent { it.forEach { it.validate() } }
                extScoreId()
                riskCategory()
                riskDescription()
                riskKey()
                riskName()
                score()
                scoreRemark()
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
                (if (approvalDate.asKnown().isPresent) 1 else 0) +
                    (if (approvedBy.asKnown().isPresent) 1 else 0) +
                    (if (approvedCode.asKnown().isPresent) 1 else 0) +
                    (aviationRiskManagementSortie.asKnown().getOrNull()?.sumOf {
                        it.validity().toInt()
                    } ?: 0) +
                    (if (extScoreId.asKnown().isPresent) 1 else 0) +
                    (if (riskCategory.asKnown().isPresent) 1 else 0) +
                    (if (riskDescription.asKnown().isPresent) 1 else 0) +
                    (if (riskKey.asKnown().isPresent) 1 else 0) +
                    (if (riskName.asKnown().isPresent) 1 else 0) +
                    (if (score.asKnown().isPresent) 1 else 0) +
                    (if (scoreRemark.asKnown().isPresent) 1 else 0)

            /** Collection of aviation risk management worksheet record score aircraft sorties. */
            class AviationRiskManagementSortie
            private constructor(
                private val extSortieId: JsonField<String>,
                private val idSortie: JsonField<String>,
                private val legNum: JsonField<Int>,
                private val sortieScore: JsonField<Int>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("extSortieId")
                    @ExcludeMissing
                    extSortieId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("idSortie")
                    @ExcludeMissing
                    idSortie: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("legNum")
                    @ExcludeMissing
                    legNum: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("sortieScore")
                    @ExcludeMissing
                    sortieScore: JsonField<Int> = JsonMissing.of(),
                ) : this(extSortieId, idSortie, legNum, sortieScore, mutableMapOf())

                /**
                 * Optional aircraft sortie ID from external systems. This field has no meaning
                 * within UDL and is provided as a convenience for systems that require tracking of
                 * an internal system generated ID.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun extSortieId(): Optional<String> = extSortieId.getOptional("extSortieId")

                /**
                 * Unique identifier of an associated Aircraft Sortie that is assigned to this risk
                 * management record.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun idSortie(): Optional<String> = idSortie.getOptional("idSortie")

                /**
                 * The leg number of the sortie.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun legNum(): Optional<Int> = legNum.getOptional("legNum")

                /**
                 * The score of the associated aircraft sortie as defined by the data source. Value
                 * ranges from 0 to 3, where a value of 0 indicates a low and a value of 3 indicates
                 * severe. A value of -1 indicates no score.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun sortieScore(): Optional<Int> = sortieScore.getOptional("sortieScore")

                /**
                 * Returns the raw JSON value of [extSortieId].
                 *
                 * Unlike [extSortieId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("extSortieId")
                @ExcludeMissing
                fun _extSortieId(): JsonField<String> = extSortieId

                /**
                 * Returns the raw JSON value of [idSortie].
                 *
                 * Unlike [idSortie], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("idSortie")
                @ExcludeMissing
                fun _idSortie(): JsonField<String> = idSortie

                /**
                 * Returns the raw JSON value of [legNum].
                 *
                 * Unlike [legNum], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("legNum") @ExcludeMissing fun _legNum(): JsonField<Int> = legNum

                /**
                 * Returns the raw JSON value of [sortieScore].
                 *
                 * Unlike [sortieScore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("sortieScore")
                @ExcludeMissing
                fun _sortieScore(): JsonField<Int> = sortieScore

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
                     * [AviationRiskManagementSortie].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AviationRiskManagementSortie]. */
                class Builder internal constructor() {

                    private var extSortieId: JsonField<String> = JsonMissing.of()
                    private var idSortie: JsonField<String> = JsonMissing.of()
                    private var legNum: JsonField<Int> = JsonMissing.of()
                    private var sortieScore: JsonField<Int> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(aviationRiskManagementSortie: AviationRiskManagementSortie) =
                        apply {
                            extSortieId = aviationRiskManagementSortie.extSortieId
                            idSortie = aviationRiskManagementSortie.idSortie
                            legNum = aviationRiskManagementSortie.legNum
                            sortieScore = aviationRiskManagementSortie.sortieScore
                            additionalProperties =
                                aviationRiskManagementSortie.additionalProperties.toMutableMap()
                        }

                    /**
                     * Optional aircraft sortie ID from external systems. This field has no meaning
                     * within UDL and is provided as a convenience for systems that require tracking
                     * of an internal system generated ID.
                     */
                    fun extSortieId(extSortieId: String) = extSortieId(JsonField.of(extSortieId))

                    /**
                     * Sets [Builder.extSortieId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.extSortieId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun extSortieId(extSortieId: JsonField<String>) = apply {
                        this.extSortieId = extSortieId
                    }

                    /**
                     * Unique identifier of an associated Aircraft Sortie that is assigned to this
                     * risk management record.
                     */
                    fun idSortie(idSortie: String) = idSortie(JsonField.of(idSortie))

                    /**
                     * Sets [Builder.idSortie] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.idSortie] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun idSortie(idSortie: JsonField<String>) = apply { this.idSortie = idSortie }

                    /** The leg number of the sortie. */
                    fun legNum(legNum: Int) = legNum(JsonField.of(legNum))

                    /**
                     * Sets [Builder.legNum] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.legNum] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun legNum(legNum: JsonField<Int>) = apply { this.legNum = legNum }

                    /**
                     * The score of the associated aircraft sortie as defined by the data source.
                     * Value ranges from 0 to 3, where a value of 0 indicates a low and a value of 3
                     * indicates severe. A value of -1 indicates no score.
                     */
                    fun sortieScore(sortieScore: Int) = sortieScore(JsonField.of(sortieScore))

                    /**
                     * Sets [Builder.sortieScore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sortieScore] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun sortieScore(sortieScore: JsonField<Int>) = apply {
                        this.sortieScore = sortieScore
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AviationRiskManagementSortie].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): AviationRiskManagementSortie =
                        AviationRiskManagementSortie(
                            extSortieId,
                            idSortie,
                            legNum,
                            sortieScore,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AviationRiskManagementSortie = apply {
                    if (validated) {
                        return@apply
                    }

                    extSortieId()
                    idSortie()
                    legNum()
                    sortieScore()
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
                    (if (extSortieId.asKnown().isPresent) 1 else 0) +
                        (if (idSortie.asKnown().isPresent) 1 else 0) +
                        (if (legNum.asKnown().isPresent) 1 else 0) +
                        (if (sortieScore.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AviationRiskManagementSortie && extSortieId == other.extSortieId && idSortie == other.idSortie && legNum == other.legNum && sortieScore == other.sortieScore && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(extSortieId, idSortie, legNum, sortieScore, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AviationRiskManagementSortie{extSortieId=$extSortieId, idSortie=$idSortie, legNum=$legNum, sortieScore=$sortieScore, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AviationRiskManagementWorksheetScore && approvalDate == other.approvalDate && approvedBy == other.approvedBy && approvedCode == other.approvedCode && aviationRiskManagementSortie == other.aviationRiskManagementSortie && extScoreId == other.extScoreId && riskCategory == other.riskCategory && riskDescription == other.riskDescription && riskKey == other.riskKey && riskName == other.riskName && score == other.score && scoreRemark == other.scoreRemark && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(approvalDate, approvedBy, approvedCode, aviationRiskManagementSortie, extScoreId, riskCategory, riskDescription, riskKey, riskName, score, scoreRemark, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AviationRiskManagementWorksheetScore{approvalDate=$approvalDate, approvedBy=$approvedBy, approvedCode=$approvedCode, aviationRiskManagementSortie=$aviationRiskManagementSortie, extScoreId=$extScoreId, riskCategory=$riskCategory, riskDescription=$riskDescription, riskKey=$riskKey, riskName=$riskName, score=$score, scoreRemark=$scoreRemark, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AviationRiskManagementWorksheetRecord && missionDate == other.missionDate && aircraftMds == other.aircraftMds && approvalPending == other.approvalPending && approved == other.approved && aviationRiskManagementWorksheetScore == other.aviationRiskManagementWorksheetScore && dispositionComments == other.dispositionComments && extRecordId == other.extRecordId && itinerary == other.itinerary && lastUpdatedAt == other.lastUpdatedAt && remarks == other.remarks && severityLevel == other.severityLevel && submissionDate == other.submissionDate && tierNumber == other.tierNumber && totalScore == other.totalScore && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(missionDate, aircraftMds, approvalPending, approved, aviationRiskManagementWorksheetScore, dispositionComments, extRecordId, itinerary, lastUpdatedAt, remarks, severityLevel, submissionDate, tierNumber, totalScore, userId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AviationRiskManagementWorksheetRecord{missionDate=$missionDate, aircraftMds=$aircraftMds, approvalPending=$approvalPending, approved=$approved, aviationRiskManagementWorksheetScore=$aviationRiskManagementWorksheetScore, dispositionComments=$dispositionComments, extRecordId=$extRecordId, itinerary=$itinerary, lastUpdatedAt=$lastUpdatedAt, remarks=$remarks, severityLevel=$severityLevel, submissionDate=$submissionDate, tierNumber=$tierNumber, totalScore=$totalScore, userId=$userId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AviationRiskManagementRetrieveResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && idMission == other.idMission && source == other.source && id == other.id && aviationRiskManagementWorksheetRecord == other.aviationRiskManagementWorksheetRecord && createdAt == other.createdAt && createdBy == other.createdBy && extMissionId == other.extMissionId && missionNumber == other.missionNumber && orgId == other.orgId && origin == other.origin && origNetwork == other.origNetwork && sourceDl == other.sourceDl && unitId == other.unitId && updatedAt == other.updatedAt && updatedBy == other.updatedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, idMission, source, id, aviationRiskManagementWorksheetRecord, createdAt, createdBy, extMissionId, missionNumber, orgId, origin, origNetwork, sourceDl, unitId, updatedAt, updatedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AviationRiskManagementRetrieveResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, idMission=$idMission, source=$source, id=$id, aviationRiskManagementWorksheetRecord=$aviationRiskManagementWorksheetRecord, createdAt=$createdAt, createdBy=$createdBy, extMissionId=$extMissionId, missionNumber=$missionNumber, orgId=$orgId, origin=$origin, origNetwork=$origNetwork, sourceDl=$sourceDl, unitId=$unitId, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

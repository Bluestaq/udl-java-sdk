// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter

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
import com.unifieddatalibrary.api.models.EntityFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * An RF Emitter is a source of active Radio Frequency (RF) signals which could potentially
 * interfere with other RF receivers.
 */
class RfEmitterGetResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val name: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val entity: JsonField<EntityFull>,
    private val extSysId: JsonField<String>,
    private val idEntity: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val rfEmitterDetails: JsonField<List<RfEmitterDetail>>,
    private val subtype: JsonField<String>,
    private val type: JsonField<String>,
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
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entity") @ExcludeMissing entity: JsonField<EntityFull> = JsonMissing.of(),
        @JsonProperty("extSysId") @ExcludeMissing extSysId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idEntity") @ExcludeMissing idEntity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rfEmitterDetails")
        @ExcludeMissing
        rfEmitterDetails: JsonField<List<RfEmitterDetail>> = JsonMissing.of(),
        @JsonProperty("subtype") @ExcludeMissing subtype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        name,
        source,
        id,
        createdAt,
        createdBy,
        entity,
        extSysId,
        idEntity,
        origin,
        origNetwork,
        rfEmitterDetails,
        subtype,
        type,
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
     * Unique name of this RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

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
     * An entity is a generic representation of any object within a space/SSA system such as
     * sensors, on-orbit objects, RF Emitters, space craft buses, etc. An entity can have an
     * operating unit, a location (if terrestrial), and statuses.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun entity(): Optional<EntityFull> = entity.getOptional("entity")

    /**
     * The originating system ID for the RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun extSysId(): Optional<String> = extSysId.getOptional("extSysId")

    /**
     * ID by reference of the parent entity for this RFEmitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idEntity(): Optional<String> = idEntity.getOptional("idEntity")

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
     * Details about this RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rfEmitterDetails(): Optional<List<RfEmitterDetail>> =
        rfEmitterDetails.getOptional("rfEmitterDetails")

    /**
     * The RF Emitter subtype, which can distinguish specialized deployments (e.g. BLOCK_0_AVL,
     * BLOCK_0_DS1, BLOCK_0_TEST, BLOCK_1, BLOCK_1_TEST, NONE).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun subtype(): Optional<String> = subtype.getOptional("subtype")

    /**
     * Type of this RF Emitter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [entity].
     *
     * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<EntityFull> = entity

    /**
     * Returns the raw JSON value of [extSysId].
     *
     * Unlike [extSysId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extSysId") @ExcludeMissing fun _extSysId(): JsonField<String> = extSysId

    /**
     * Returns the raw JSON value of [idEntity].
     *
     * Unlike [idEntity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idEntity") @ExcludeMissing fun _idEntity(): JsonField<String> = idEntity

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
     * Returns the raw JSON value of [rfEmitterDetails].
     *
     * Unlike [rfEmitterDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rfEmitterDetails")
    @ExcludeMissing
    fun _rfEmitterDetails(): JsonField<List<RfEmitterDetail>> = rfEmitterDetails

    /**
     * Returns the raw JSON value of [subtype].
     *
     * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<String> = subtype

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
         * Returns a mutable builder for constructing an instance of [RfEmitterGetResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RfEmitterGetResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var name: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var entity: JsonField<EntityFull> = JsonMissing.of()
        private var extSysId: JsonField<String> = JsonMissing.of()
        private var idEntity: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var rfEmitterDetails: JsonField<MutableList<RfEmitterDetail>>? = null
        private var subtype: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rfEmitterGetResponse: RfEmitterGetResponse) = apply {
            classificationMarking = rfEmitterGetResponse.classificationMarking
            dataMode = rfEmitterGetResponse.dataMode
            name = rfEmitterGetResponse.name
            source = rfEmitterGetResponse.source
            id = rfEmitterGetResponse.id
            createdAt = rfEmitterGetResponse.createdAt
            createdBy = rfEmitterGetResponse.createdBy
            entity = rfEmitterGetResponse.entity
            extSysId = rfEmitterGetResponse.extSysId
            idEntity = rfEmitterGetResponse.idEntity
            origin = rfEmitterGetResponse.origin
            origNetwork = rfEmitterGetResponse.origNetwork
            rfEmitterDetails = rfEmitterGetResponse.rfEmitterDetails.map { it.toMutableList() }
            subtype = rfEmitterGetResponse.subtype
            type = rfEmitterGetResponse.type
            updatedAt = rfEmitterGetResponse.updatedAt
            updatedBy = rfEmitterGetResponse.updatedBy
            additionalProperties = rfEmitterGetResponse.additionalProperties.toMutableMap()
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

        /** Unique name of this RF Emitter. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * An entity is a generic representation of any object within a space/SSA system such as
         * sensors, on-orbit objects, RF Emitters, space craft buses, etc. An entity can have an
         * operating unit, a location (if terrestrial), and statuses.
         */
        fun entity(entity: EntityFull) = entity(JsonField.of(entity))

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [EntityFull] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entity(entity: JsonField<EntityFull>) = apply { this.entity = entity }

        /** The originating system ID for the RF Emitter. */
        fun extSysId(extSysId: String) = extSysId(JsonField.of(extSysId))

        /**
         * Sets [Builder.extSysId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extSysId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun extSysId(extSysId: JsonField<String>) = apply { this.extSysId = extSysId }

        /** ID by reference of the parent entity for this RFEmitter. */
        fun idEntity(idEntity: String) = idEntity(JsonField.of(idEntity))

        /**
         * Sets [Builder.idEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idEntity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idEntity(idEntity: JsonField<String>) = apply { this.idEntity = idEntity }

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

        /** Details about this RF Emitter. */
        fun rfEmitterDetails(rfEmitterDetails: List<RfEmitterDetail>) =
            rfEmitterDetails(JsonField.of(rfEmitterDetails))

        /**
         * Sets [Builder.rfEmitterDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rfEmitterDetails] with a well-typed
         * `List<RfEmitterDetail>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun rfEmitterDetails(rfEmitterDetails: JsonField<List<RfEmitterDetail>>) = apply {
            this.rfEmitterDetails = rfEmitterDetails.map { it.toMutableList() }
        }

        /**
         * Adds a single [RfEmitterDetail] to [rfEmitterDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRfEmitterDetail(rfEmitterDetail: RfEmitterDetail) = apply {
            rfEmitterDetails =
                (rfEmitterDetails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rfEmitterDetails", it).add(rfEmitterDetail)
                }
        }

        /**
         * The RF Emitter subtype, which can distinguish specialized deployments (e.g. BLOCK_0_AVL,
         * BLOCK_0_DS1, BLOCK_0_TEST, BLOCK_1, BLOCK_1_TEST, NONE).
         */
        fun subtype(subtype: String) = subtype(JsonField.of(subtype))

        /**
         * Sets [Builder.subtype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtype] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtype(subtype: JsonField<String>) = apply { this.subtype = subtype }

        /** Type of this RF Emitter. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Returns an immutable instance of [RfEmitterGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RfEmitterGetResponse =
            RfEmitterGetResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("name", name),
                checkRequired("source", source),
                id,
                createdAt,
                createdBy,
                entity,
                extSysId,
                idEntity,
                origin,
                origNetwork,
                (rfEmitterDetails ?: JsonMissing.of()).map { it.toImmutable() },
                subtype,
                type,
                updatedAt,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RfEmitterGetResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        name()
        source()
        id()
        createdAt()
        createdBy()
        entity().ifPresent { it.validate() }
        extSysId()
        idEntity()
        origin()
        origNetwork()
        rfEmitterDetails().ifPresent { it.forEach { it.validate() } }
        subtype()
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
    internal fun validity(): Int =
        (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (entity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (extSysId.asKnown().isPresent) 1 else 0) +
            (if (idEntity.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (rfEmitterDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (subtype.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
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

            return other is DataMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Details for a particular RF Emitter, collected by a particular source. An RF Emitter may have
     * multiple details records from various sources.
     */
    class RfEmitterDetail
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val idRfEmitter: JsonField<String>,
        private val source: JsonField<String>,
        private val id: JsonField<String>,
        private val alternateFacilityName: JsonField<String>,
        private val altName: JsonField<String>,
        private val amplifier: JsonField<Amplifier>,
        private val antennas: JsonField<List<Antenna>>,
        private val barrageNoiseBandwidth: JsonField<Double>,
        private val bitRunTime: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val description: JsonField<String>,
        private val designator: JsonField<String>,
        private val dopplerNoise: JsonField<Double>,
        private val drfmInstantaneousBandwidth: JsonField<Double>,
        private val family: JsonField<String>,
        private val fixedAttenuation: JsonField<Double>,
        private val idManufacturerOrg: JsonField<String>,
        private val idProductionFacilityLocation: JsonField<String>,
        private val loanedToCocom: JsonField<String>,
        private val notes: JsonField<String>,
        private val numBits: JsonField<Int>,
        private val numChannels: JsonField<Int>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val powerOffsets: JsonField<List<PowerOffset>>,
        private val prepTime: JsonField<Double>,
        private val primaryCocom: JsonField<String>,
        private val productionFacilityName: JsonField<String>,
        private val receiverType: JsonField<String>,
        private val secondaryNotes: JsonField<String>,
        private val services: JsonField<List<Service>>,
        private val systemSensitivityEnd: JsonField<Double>,
        private val systemSensitivityStart: JsonField<Double>,
        private val ttps: JsonField<List<Ttp>>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val updatedBy: JsonField<String>,
        private val urls: JsonField<List<String>>,
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
            @JsonProperty("idRFEmitter")
            @ExcludeMissing
            idRfEmitter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("alternateFacilityName")
            @ExcludeMissing
            alternateFacilityName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("altName") @ExcludeMissing altName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amplifier")
            @ExcludeMissing
            amplifier: JsonField<Amplifier> = JsonMissing.of(),
            @JsonProperty("antennas")
            @ExcludeMissing
            antennas: JsonField<List<Antenna>> = JsonMissing.of(),
            @JsonProperty("barrageNoiseBandwidth")
            @ExcludeMissing
            barrageNoiseBandwidth: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("bitRunTime")
            @ExcludeMissing
            bitRunTime: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("designator")
            @ExcludeMissing
            designator: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dopplerNoise")
            @ExcludeMissing
            dopplerNoise: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("drfmInstantaneousBandwidth")
            @ExcludeMissing
            drfmInstantaneousBandwidth: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("family") @ExcludeMissing family: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fixedAttenuation")
            @ExcludeMissing
            fixedAttenuation: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("idManufacturerOrg")
            @ExcludeMissing
            idManufacturerOrg: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idProductionFacilityLocation")
            @ExcludeMissing
            idProductionFacilityLocation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("loanedToCocom")
            @ExcludeMissing
            loanedToCocom: JsonField<String> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("numBits") @ExcludeMissing numBits: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("numChannels")
            @ExcludeMissing
            numChannels: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("powerOffsets")
            @ExcludeMissing
            powerOffsets: JsonField<List<PowerOffset>> = JsonMissing.of(),
            @JsonProperty("prepTime")
            @ExcludeMissing
            prepTime: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("primaryCocom")
            @ExcludeMissing
            primaryCocom: JsonField<String> = JsonMissing.of(),
            @JsonProperty("productionFacilityName")
            @ExcludeMissing
            productionFacilityName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiverType")
            @ExcludeMissing
            receiverType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("secondaryNotes")
            @ExcludeMissing
            secondaryNotes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("services")
            @ExcludeMissing
            services: JsonField<List<Service>> = JsonMissing.of(),
            @JsonProperty("systemSensitivityEnd")
            @ExcludeMissing
            systemSensitivityEnd: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("systemSensitivityStart")
            @ExcludeMissing
            systemSensitivityStart: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("ttps") @ExcludeMissing ttps: JsonField<List<Ttp>> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedBy")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("urls") @ExcludeMissing urls: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            idRfEmitter,
            source,
            id,
            alternateFacilityName,
            altName,
            amplifier,
            antennas,
            barrageNoiseBandwidth,
            bitRunTime,
            createdAt,
            createdBy,
            description,
            designator,
            dopplerNoise,
            drfmInstantaneousBandwidth,
            family,
            fixedAttenuation,
            idManufacturerOrg,
            idProductionFacilityLocation,
            loanedToCocom,
            notes,
            numBits,
            numChannels,
            origin,
            origNetwork,
            powerOffsets,
            prepTime,
            primaryCocom,
            productionFacilityName,
            receiverType,
            secondaryNotes,
            services,
            systemSensitivityEnd,
            systemSensitivityStart,
            ttps,
            updatedAt,
            updatedBy,
            urls,
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
         * Unique identifier of the parent RF Emitter.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun idRfEmitter(): String = idRfEmitter.getRequired("idRFEmitter")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Alternate facility name for this RF Emitter.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun alternateFacilityName(): Optional<String> =
            alternateFacilityName.getOptional("alternateFacilityName")

        /**
         * Optional alternate name or alias for this RF Emitter.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun altName(): Optional<String> = altName.getOptional("altName")

        /**
         * An RF Amplifier associated with an RF Emitter Details.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun amplifier(): Optional<Amplifier> = amplifier.getOptional("amplifier")

        /**
         * The set of antennas hosted on this EW Emitter system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun antennas(): Optional<List<Antenna>> = antennas.getOptional("antennas")

        /**
         * Barrage noise bandwidth, in megahertz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun barrageNoiseBandwidth(): Optional<Double> =
            barrageNoiseBandwidth.getOptional("barrageNoiseBandwidth")

        /**
         * The length of time, in seconds, for the RF Emitter built-in test to run to completion.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bitRunTime(): Optional<Double> = bitRunTime.getOptional("bitRunTime")

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
         * Detailed description of the RF Emitter.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Designator of this RF Emitter.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun designator(): Optional<String> = designator.getOptional("designator")

        /**
         * Doppler noise value, in megahertz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dopplerNoise(): Optional<Double> = dopplerNoise.getOptional("dopplerNoise")

        /**
         * Digital Form Radio Memory instantaneous bandwidth in megahertz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun drfmInstantaneousBandwidth(): Optional<Double> =
            drfmInstantaneousBandwidth.getOptional("drfmInstantaneousBandwidth")

        /**
         * Family of this RF Emitter type.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun family(): Optional<String> = family.getOptional("family")

        /**
         * A fixed attenuation value to be set on the SRF Emitter HPA when commanding an Electronic
         * Attack/Techniques Tactics and Procedures task, in decibels.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fixedAttenuation(): Optional<Double> = fixedAttenuation.getOptional("fixedAttenuation")

        /**
         * Unique identifier of the organization which manufactured this RF Emitter.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idManufacturerOrg(): Optional<String> =
            idManufacturerOrg.getOptional("idManufacturerOrg")

        /**
         * Unique identifier of the location of the production facility for this RF Emitter.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idProductionFacilityLocation(): Optional<String> =
            idProductionFacilityLocation.getOptional("idProductionFacilityLocation")

        /**
         * COCOM that has temporary responsibility for scheduling and management of the RF Emitter
         * (e.g. SPACEFOR-CENT, SPACEFOR-EURAF, SPACEFOR-INDOPAC, SPACEFOR-KOR, SPACEFOR-STRATNORTH,
         * SPACESOC, NONE).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun loanedToCocom(): Optional<String> = loanedToCocom.getOptional("loanedToCocom")

        /**
         * Notes on the RF Emitter.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Number of bits.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numBits(): Optional<Int> = numBits.getOptional("numBits")

        /**
         * Number of channels.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numChannels(): Optional<Int> = numChannels.getOptional("numChannels")

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
         * A set of system/frequency band adjustments to the power offset commanded in an EA/TTP
         * task.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun powerOffsets(): Optional<List<PowerOffset>> = powerOffsets.getOptional("powerOffsets")

        /**
         * The length of time, in seconds, for the RF Emitter to prepare for a task, including
         * sufficient time to slew the antenna and configure the equipment.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun prepTime(): Optional<Double> = prepTime.getOptional("prepTime")

        /**
         * Primary COCOM that is responsible for scheduling and management of the RF Emitter (e.g.
         * SPACEFOR-CENT, SPACEFOR-EURAF, SPACEFOR-INDOPAC, SPACEFOR-KOR, SPACEFOR-STRATNORTH,
         * SPACESOC, NONE).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun primaryCocom(): Optional<String> = primaryCocom.getOptional("primaryCocom")

        /**
         * Name of the production facility for this RF Emitter.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun productionFacilityName(): Optional<String> =
            productionFacilityName.getOptional("productionFacilityName")

        /**
         * Type or name of receiver.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun receiverType(): Optional<String> = receiverType.getOptional("receiverType")

        /**
         * Secondary notes on the RF Emitter.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun secondaryNotes(): Optional<String> = secondaryNotes.getOptional("secondaryNotes")

        /**
         * The set of software services running on this EW Emitter system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun services(): Optional<List<Service>> = services.getOptional("services")

        /**
         * Receiver sensitivity is the lowest power level at which the receiver can detect an RF
         * signal and demodulate data. Sensitivity is purely a receiver specification and is
         * independent of the transmitter. End sensitivity range, in decibel-milliwatts.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun systemSensitivityEnd(): Optional<Double> =
            systemSensitivityEnd.getOptional("systemSensitivityEnd")

        /**
         * Receiver sensitivity is the lowest power level at which the receiver can detect an RF
         * signal and demodulate data. Sensitivity is purely a receiver specification and is
         * independent of the transmitter. Start sensitivity range, in decibel-milliwatts.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun systemSensitivityStart(): Optional<Double> =
            systemSensitivityStart.getOptional("systemSensitivityStart")

        /**
         * The set of EA/TTP techniques that are supported by this EW Emitter system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ttps(): Optional<List<Ttp>> = ttps.getOptional("ttps")

        /**
         * Time the row was last updated in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Array of URLs containing additional information on this RF Emitter.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun urls(): Optional<List<String>> = urls.getOptional("urls")

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
         * Returns the raw JSON value of [idRfEmitter].
         *
         * Unlike [idRfEmitter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idRFEmitter")
        @ExcludeMissing
        fun _idRfEmitter(): JsonField<String> = idRfEmitter

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
         * Returns the raw JSON value of [alternateFacilityName].
         *
         * Unlike [alternateFacilityName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("alternateFacilityName")
        @ExcludeMissing
        fun _alternateFacilityName(): JsonField<String> = alternateFacilityName

        /**
         * Returns the raw JSON value of [altName].
         *
         * Unlike [altName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("altName") @ExcludeMissing fun _altName(): JsonField<String> = altName

        /**
         * Returns the raw JSON value of [amplifier].
         *
         * Unlike [amplifier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amplifier")
        @ExcludeMissing
        fun _amplifier(): JsonField<Amplifier> = amplifier

        /**
         * Returns the raw JSON value of [antennas].
         *
         * Unlike [antennas], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("antennas")
        @ExcludeMissing
        fun _antennas(): JsonField<List<Antenna>> = antennas

        /**
         * Returns the raw JSON value of [barrageNoiseBandwidth].
         *
         * Unlike [barrageNoiseBandwidth], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("barrageNoiseBandwidth")
        @ExcludeMissing
        fun _barrageNoiseBandwidth(): JsonField<Double> = barrageNoiseBandwidth

        /**
         * Returns the raw JSON value of [bitRunTime].
         *
         * Unlike [bitRunTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bitRunTime")
        @ExcludeMissing
        fun _bitRunTime(): JsonField<Double> = bitRunTime

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
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [designator].
         *
         * Unlike [designator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("designator")
        @ExcludeMissing
        fun _designator(): JsonField<String> = designator

        /**
         * Returns the raw JSON value of [dopplerNoise].
         *
         * Unlike [dopplerNoise], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dopplerNoise")
        @ExcludeMissing
        fun _dopplerNoise(): JsonField<Double> = dopplerNoise

        /**
         * Returns the raw JSON value of [drfmInstantaneousBandwidth].
         *
         * Unlike [drfmInstantaneousBandwidth], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("drfmInstantaneousBandwidth")
        @ExcludeMissing
        fun _drfmInstantaneousBandwidth(): JsonField<Double> = drfmInstantaneousBandwidth

        /**
         * Returns the raw JSON value of [family].
         *
         * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("family") @ExcludeMissing fun _family(): JsonField<String> = family

        /**
         * Returns the raw JSON value of [fixedAttenuation].
         *
         * Unlike [fixedAttenuation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fixedAttenuation")
        @ExcludeMissing
        fun _fixedAttenuation(): JsonField<Double> = fixedAttenuation

        /**
         * Returns the raw JSON value of [idManufacturerOrg].
         *
         * Unlike [idManufacturerOrg], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idManufacturerOrg")
        @ExcludeMissing
        fun _idManufacturerOrg(): JsonField<String> = idManufacturerOrg

        /**
         * Returns the raw JSON value of [idProductionFacilityLocation].
         *
         * Unlike [idProductionFacilityLocation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("idProductionFacilityLocation")
        @ExcludeMissing
        fun _idProductionFacilityLocation(): JsonField<String> = idProductionFacilityLocation

        /**
         * Returns the raw JSON value of [loanedToCocom].
         *
         * Unlike [loanedToCocom], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("loanedToCocom")
        @ExcludeMissing
        fun _loanedToCocom(): JsonField<String> = loanedToCocom

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

        /**
         * Returns the raw JSON value of [numBits].
         *
         * Unlike [numBits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numBits") @ExcludeMissing fun _numBits(): JsonField<Int> = numBits

        /**
         * Returns the raw JSON value of [numChannels].
         *
         * Unlike [numChannels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numChannels")
        @ExcludeMissing
        fun _numChannels(): JsonField<Int> = numChannels

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
         * Returns the raw JSON value of [powerOffsets].
         *
         * Unlike [powerOffsets], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("powerOffsets")
        @ExcludeMissing
        fun _powerOffsets(): JsonField<List<PowerOffset>> = powerOffsets

        /**
         * Returns the raw JSON value of [prepTime].
         *
         * Unlike [prepTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prepTime") @ExcludeMissing fun _prepTime(): JsonField<Double> = prepTime

        /**
         * Returns the raw JSON value of [primaryCocom].
         *
         * Unlike [primaryCocom], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("primaryCocom")
        @ExcludeMissing
        fun _primaryCocom(): JsonField<String> = primaryCocom

        /**
         * Returns the raw JSON value of [productionFacilityName].
         *
         * Unlike [productionFacilityName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("productionFacilityName")
        @ExcludeMissing
        fun _productionFacilityName(): JsonField<String> = productionFacilityName

        /**
         * Returns the raw JSON value of [receiverType].
         *
         * Unlike [receiverType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiverType")
        @ExcludeMissing
        fun _receiverType(): JsonField<String> = receiverType

        /**
         * Returns the raw JSON value of [secondaryNotes].
         *
         * Unlike [secondaryNotes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("secondaryNotes")
        @ExcludeMissing
        fun _secondaryNotes(): JsonField<String> = secondaryNotes

        /**
         * Returns the raw JSON value of [services].
         *
         * Unlike [services], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("services")
        @ExcludeMissing
        fun _services(): JsonField<List<Service>> = services

        /**
         * Returns the raw JSON value of [systemSensitivityEnd].
         *
         * Unlike [systemSensitivityEnd], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("systemSensitivityEnd")
        @ExcludeMissing
        fun _systemSensitivityEnd(): JsonField<Double> = systemSensitivityEnd

        /**
         * Returns the raw JSON value of [systemSensitivityStart].
         *
         * Unlike [systemSensitivityStart], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("systemSensitivityStart")
        @ExcludeMissing
        fun _systemSensitivityStart(): JsonField<Double> = systemSensitivityStart

        /**
         * Returns the raw JSON value of [ttps].
         *
         * Unlike [ttps], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ttps") @ExcludeMissing fun _ttps(): JsonField<List<Ttp>> = ttps

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

        /**
         * Returns the raw JSON value of [urls].
         *
         * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("urls") @ExcludeMissing fun _urls(): JsonField<List<String>> = urls

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
             * Returns a mutable builder for constructing an instance of [RfEmitterDetail].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .idRfEmitter()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RfEmitterDetail]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var idRfEmitter: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var alternateFacilityName: JsonField<String> = JsonMissing.of()
            private var altName: JsonField<String> = JsonMissing.of()
            private var amplifier: JsonField<Amplifier> = JsonMissing.of()
            private var antennas: JsonField<MutableList<Antenna>>? = null
            private var barrageNoiseBandwidth: JsonField<Double> = JsonMissing.of()
            private var bitRunTime: JsonField<Double> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var designator: JsonField<String> = JsonMissing.of()
            private var dopplerNoise: JsonField<Double> = JsonMissing.of()
            private var drfmInstantaneousBandwidth: JsonField<Double> = JsonMissing.of()
            private var family: JsonField<String> = JsonMissing.of()
            private var fixedAttenuation: JsonField<Double> = JsonMissing.of()
            private var idManufacturerOrg: JsonField<String> = JsonMissing.of()
            private var idProductionFacilityLocation: JsonField<String> = JsonMissing.of()
            private var loanedToCocom: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var numBits: JsonField<Int> = JsonMissing.of()
            private var numChannels: JsonField<Int> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var powerOffsets: JsonField<MutableList<PowerOffset>>? = null
            private var prepTime: JsonField<Double> = JsonMissing.of()
            private var primaryCocom: JsonField<String> = JsonMissing.of()
            private var productionFacilityName: JsonField<String> = JsonMissing.of()
            private var receiverType: JsonField<String> = JsonMissing.of()
            private var secondaryNotes: JsonField<String> = JsonMissing.of()
            private var services: JsonField<MutableList<Service>>? = null
            private var systemSensitivityEnd: JsonField<Double> = JsonMissing.of()
            private var systemSensitivityStart: JsonField<Double> = JsonMissing.of()
            private var ttps: JsonField<MutableList<Ttp>>? = null
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var urls: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rfEmitterDetail: RfEmitterDetail) = apply {
                classificationMarking = rfEmitterDetail.classificationMarking
                dataMode = rfEmitterDetail.dataMode
                idRfEmitter = rfEmitterDetail.idRfEmitter
                source = rfEmitterDetail.source
                id = rfEmitterDetail.id
                alternateFacilityName = rfEmitterDetail.alternateFacilityName
                altName = rfEmitterDetail.altName
                amplifier = rfEmitterDetail.amplifier
                antennas = rfEmitterDetail.antennas.map { it.toMutableList() }
                barrageNoiseBandwidth = rfEmitterDetail.barrageNoiseBandwidth
                bitRunTime = rfEmitterDetail.bitRunTime
                createdAt = rfEmitterDetail.createdAt
                createdBy = rfEmitterDetail.createdBy
                description = rfEmitterDetail.description
                designator = rfEmitterDetail.designator
                dopplerNoise = rfEmitterDetail.dopplerNoise
                drfmInstantaneousBandwidth = rfEmitterDetail.drfmInstantaneousBandwidth
                family = rfEmitterDetail.family
                fixedAttenuation = rfEmitterDetail.fixedAttenuation
                idManufacturerOrg = rfEmitterDetail.idManufacturerOrg
                idProductionFacilityLocation = rfEmitterDetail.idProductionFacilityLocation
                loanedToCocom = rfEmitterDetail.loanedToCocom
                notes = rfEmitterDetail.notes
                numBits = rfEmitterDetail.numBits
                numChannels = rfEmitterDetail.numChannels
                origin = rfEmitterDetail.origin
                origNetwork = rfEmitterDetail.origNetwork
                powerOffsets = rfEmitterDetail.powerOffsets.map { it.toMutableList() }
                prepTime = rfEmitterDetail.prepTime
                primaryCocom = rfEmitterDetail.primaryCocom
                productionFacilityName = rfEmitterDetail.productionFacilityName
                receiverType = rfEmitterDetail.receiverType
                secondaryNotes = rfEmitterDetail.secondaryNotes
                services = rfEmitterDetail.services.map { it.toMutableList() }
                systemSensitivityEnd = rfEmitterDetail.systemSensitivityEnd
                systemSensitivityStart = rfEmitterDetail.systemSensitivityStart
                ttps = rfEmitterDetail.ttps.map { it.toMutableList() }
                updatedAt = rfEmitterDetail.updatedAt
                updatedBy = rfEmitterDetail.updatedBy
                urls = rfEmitterDetail.urls.map { it.toMutableList() }
                additionalProperties = rfEmitterDetail.additionalProperties.toMutableMap()
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

            /** Unique identifier of the parent RF Emitter. */
            fun idRfEmitter(idRfEmitter: String) = idRfEmitter(JsonField.of(idRfEmitter))

            /**
             * Sets [Builder.idRfEmitter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idRfEmitter] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idRfEmitter(idRfEmitter: JsonField<String>) = apply {
                this.idRfEmitter = idRfEmitter
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

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Alternate facility name for this RF Emitter. */
            fun alternateFacilityName(alternateFacilityName: String) =
                alternateFacilityName(JsonField.of(alternateFacilityName))

            /**
             * Sets [Builder.alternateFacilityName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alternateFacilityName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun alternateFacilityName(alternateFacilityName: JsonField<String>) = apply {
                this.alternateFacilityName = alternateFacilityName
            }

            /** Optional alternate name or alias for this RF Emitter. */
            fun altName(altName: String) = altName(JsonField.of(altName))

            /**
             * Sets [Builder.altName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altName(altName: JsonField<String>) = apply { this.altName = altName }

            /** An RF Amplifier associated with an RF Emitter Details. */
            fun amplifier(amplifier: Amplifier) = amplifier(JsonField.of(amplifier))

            /**
             * Sets [Builder.amplifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amplifier] with a well-typed [Amplifier] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amplifier(amplifier: JsonField<Amplifier>) = apply { this.amplifier = amplifier }

            /** The set of antennas hosted on this EW Emitter system. */
            fun antennas(antennas: List<Antenna>) = antennas(JsonField.of(antennas))

            /**
             * Sets [Builder.antennas] to an arbitrary JSON value.
             *
             * You should usually call [Builder.antennas] with a well-typed `List<Antenna>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun antennas(antennas: JsonField<List<Antenna>>) = apply {
                this.antennas = antennas.map { it.toMutableList() }
            }

            /**
             * Adds a single [Antenna] to [antennas].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAntenna(antenna: Antenna) = apply {
                antennas =
                    (antennas ?: JsonField.of(mutableListOf())).also {
                        checkKnown("antennas", it).add(antenna)
                    }
            }

            /** Barrage noise bandwidth, in megahertz. */
            fun barrageNoiseBandwidth(barrageNoiseBandwidth: Double) =
                barrageNoiseBandwidth(JsonField.of(barrageNoiseBandwidth))

            /**
             * Sets [Builder.barrageNoiseBandwidth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.barrageNoiseBandwidth] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun barrageNoiseBandwidth(barrageNoiseBandwidth: JsonField<Double>) = apply {
                this.barrageNoiseBandwidth = barrageNoiseBandwidth
            }

            /**
             * The length of time, in seconds, for the RF Emitter built-in test to run to
             * completion.
             */
            fun bitRunTime(bitRunTime: Double) = bitRunTime(JsonField.of(bitRunTime))

            /**
             * Sets [Builder.bitRunTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bitRunTime] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bitRunTime(bitRunTime: JsonField<Double>) = apply { this.bitRunTime = bitRunTime }

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

            /** Detailed description of the RF Emitter. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Designator of this RF Emitter. */
            fun designator(designator: String) = designator(JsonField.of(designator))

            /**
             * Sets [Builder.designator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.designator] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun designator(designator: JsonField<String>) = apply { this.designator = designator }

            /** Doppler noise value, in megahertz. */
            fun dopplerNoise(dopplerNoise: Double) = dopplerNoise(JsonField.of(dopplerNoise))

            /**
             * Sets [Builder.dopplerNoise] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dopplerNoise] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dopplerNoise(dopplerNoise: JsonField<Double>) = apply {
                this.dopplerNoise = dopplerNoise
            }

            /** Digital Form Radio Memory instantaneous bandwidth in megahertz. */
            fun drfmInstantaneousBandwidth(drfmInstantaneousBandwidth: Double) =
                drfmInstantaneousBandwidth(JsonField.of(drfmInstantaneousBandwidth))

            /**
             * Sets [Builder.drfmInstantaneousBandwidth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.drfmInstantaneousBandwidth] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun drfmInstantaneousBandwidth(drfmInstantaneousBandwidth: JsonField<Double>) = apply {
                this.drfmInstantaneousBandwidth = drfmInstantaneousBandwidth
            }

            /** Family of this RF Emitter type. */
            fun family(family: String) = family(JsonField.of(family))

            /**
             * Sets [Builder.family] to an arbitrary JSON value.
             *
             * You should usually call [Builder.family] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun family(family: JsonField<String>) = apply { this.family = family }

            /**
             * A fixed attenuation value to be set on the SRF Emitter HPA when commanding an
             * Electronic Attack/Techniques Tactics and Procedures task, in decibels.
             */
            fun fixedAttenuation(fixedAttenuation: Double) =
                fixedAttenuation(JsonField.of(fixedAttenuation))

            /**
             * Sets [Builder.fixedAttenuation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fixedAttenuation] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fixedAttenuation(fixedAttenuation: JsonField<Double>) = apply {
                this.fixedAttenuation = fixedAttenuation
            }

            /** Unique identifier of the organization which manufactured this RF Emitter. */
            fun idManufacturerOrg(idManufacturerOrg: String) =
                idManufacturerOrg(JsonField.of(idManufacturerOrg))

            /**
             * Sets [Builder.idManufacturerOrg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idManufacturerOrg] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idManufacturerOrg(idManufacturerOrg: JsonField<String>) = apply {
                this.idManufacturerOrg = idManufacturerOrg
            }

            /** Unique identifier of the location of the production facility for this RF Emitter. */
            fun idProductionFacilityLocation(idProductionFacilityLocation: String) =
                idProductionFacilityLocation(JsonField.of(idProductionFacilityLocation))

            /**
             * Sets [Builder.idProductionFacilityLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idProductionFacilityLocation] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun idProductionFacilityLocation(idProductionFacilityLocation: JsonField<String>) =
                apply {
                    this.idProductionFacilityLocation = idProductionFacilityLocation
                }

            /**
             * COCOM that has temporary responsibility for scheduling and management of the RF
             * Emitter (e.g. SPACEFOR-CENT, SPACEFOR-EURAF, SPACEFOR-INDOPAC, SPACEFOR-KOR,
             * SPACEFOR-STRATNORTH, SPACESOC, NONE).
             */
            fun loanedToCocom(loanedToCocom: String) = loanedToCocom(JsonField.of(loanedToCocom))

            /**
             * Sets [Builder.loanedToCocom] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loanedToCocom] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loanedToCocom(loanedToCocom: JsonField<String>) = apply {
                this.loanedToCocom = loanedToCocom
            }

            /** Notes on the RF Emitter. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            /** Number of bits. */
            fun numBits(numBits: Int) = numBits(JsonField.of(numBits))

            /**
             * Sets [Builder.numBits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numBits] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun numBits(numBits: JsonField<Int>) = apply { this.numBits = numBits }

            /** Number of channels. */
            fun numChannels(numChannels: Int) = numChannels(JsonField.of(numChannels))

            /**
             * Sets [Builder.numChannels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numChannels] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numChannels(numChannels: JsonField<Int>) = apply { this.numChannels = numChannels }

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
             * A set of system/frequency band adjustments to the power offset commanded in an EA/TTP
             * task.
             */
            fun powerOffsets(powerOffsets: List<PowerOffset>) =
                powerOffsets(JsonField.of(powerOffsets))

            /**
             * Sets [Builder.powerOffsets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.powerOffsets] with a well-typed `List<PowerOffset>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun powerOffsets(powerOffsets: JsonField<List<PowerOffset>>) = apply {
                this.powerOffsets = powerOffsets.map { it.toMutableList() }
            }

            /**
             * Adds a single [PowerOffset] to [powerOffsets].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPowerOffset(powerOffset: PowerOffset) = apply {
                powerOffsets =
                    (powerOffsets ?: JsonField.of(mutableListOf())).also {
                        checkKnown("powerOffsets", it).add(powerOffset)
                    }
            }

            /**
             * The length of time, in seconds, for the RF Emitter to prepare for a task, including
             * sufficient time to slew the antenna and configure the equipment.
             */
            fun prepTime(prepTime: Double) = prepTime(JsonField.of(prepTime))

            /**
             * Sets [Builder.prepTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prepTime] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prepTime(prepTime: JsonField<Double>) = apply { this.prepTime = prepTime }

            /**
             * Primary COCOM that is responsible for scheduling and management of the RF Emitter
             * (e.g. SPACEFOR-CENT, SPACEFOR-EURAF, SPACEFOR-INDOPAC, SPACEFOR-KOR,
             * SPACEFOR-STRATNORTH, SPACESOC, NONE).
             */
            fun primaryCocom(primaryCocom: String) = primaryCocom(JsonField.of(primaryCocom))

            /**
             * Sets [Builder.primaryCocom] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryCocom] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primaryCocom(primaryCocom: JsonField<String>) = apply {
                this.primaryCocom = primaryCocom
            }

            /** Name of the production facility for this RF Emitter. */
            fun productionFacilityName(productionFacilityName: String) =
                productionFacilityName(JsonField.of(productionFacilityName))

            /**
             * Sets [Builder.productionFacilityName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productionFacilityName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun productionFacilityName(productionFacilityName: JsonField<String>) = apply {
                this.productionFacilityName = productionFacilityName
            }

            /** Type or name of receiver. */
            fun receiverType(receiverType: String) = receiverType(JsonField.of(receiverType))

            /**
             * Sets [Builder.receiverType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverType(receiverType: JsonField<String>) = apply {
                this.receiverType = receiverType
            }

            /** Secondary notes on the RF Emitter. */
            fun secondaryNotes(secondaryNotes: String) =
                secondaryNotes(JsonField.of(secondaryNotes))

            /**
             * Sets [Builder.secondaryNotes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondaryNotes] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secondaryNotes(secondaryNotes: JsonField<String>) = apply {
                this.secondaryNotes = secondaryNotes
            }

            /** The set of software services running on this EW Emitter system. */
            fun services(services: List<Service>) = services(JsonField.of(services))

            /**
             * Sets [Builder.services] to an arbitrary JSON value.
             *
             * You should usually call [Builder.services] with a well-typed `List<Service>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun services(services: JsonField<List<Service>>) = apply {
                this.services = services.map { it.toMutableList() }
            }

            /**
             * Adds a single [Service] to [services].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addService(service: Service) = apply {
                services =
                    (services ?: JsonField.of(mutableListOf())).also {
                        checkKnown("services", it).add(service)
                    }
            }

            /**
             * Receiver sensitivity is the lowest power level at which the receiver can detect an RF
             * signal and demodulate data. Sensitivity is purely a receiver specification and is
             * independent of the transmitter. End sensitivity range, in decibel-milliwatts.
             */
            fun systemSensitivityEnd(systemSensitivityEnd: Double) =
                systemSensitivityEnd(JsonField.of(systemSensitivityEnd))

            /**
             * Sets [Builder.systemSensitivityEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.systemSensitivityEnd] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun systemSensitivityEnd(systemSensitivityEnd: JsonField<Double>) = apply {
                this.systemSensitivityEnd = systemSensitivityEnd
            }

            /**
             * Receiver sensitivity is the lowest power level at which the receiver can detect an RF
             * signal and demodulate data. Sensitivity is purely a receiver specification and is
             * independent of the transmitter. Start sensitivity range, in decibel-milliwatts.
             */
            fun systemSensitivityStart(systemSensitivityStart: Double) =
                systemSensitivityStart(JsonField.of(systemSensitivityStart))

            /**
             * Sets [Builder.systemSensitivityStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.systemSensitivityStart] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun systemSensitivityStart(systemSensitivityStart: JsonField<Double>) = apply {
                this.systemSensitivityStart = systemSensitivityStart
            }

            /** The set of EA/TTP techniques that are supported by this EW Emitter system. */
            fun ttps(ttps: List<Ttp>) = ttps(JsonField.of(ttps))

            /**
             * Sets [Builder.ttps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ttps] with a well-typed `List<Ttp>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ttps(ttps: JsonField<List<Ttp>>) = apply {
                this.ttps = ttps.map { it.toMutableList() }
            }

            /**
             * Adds a single [Ttp] to [ttps].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTtp(ttp: Ttp) = apply {
                ttps =
                    (ttps ?: JsonField.of(mutableListOf())).also { checkKnown("ttps", it).add(ttp) }
            }

            /** Time the row was last updated in the database, auto-populated by the system. */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Application user who updated the row in the database, auto-populated by the system.
             */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

            /** Array of URLs containing additional information on this RF Emitter. */
            fun urls(urls: List<String>) = urls(JsonField.of(urls))

            /**
             * Sets [Builder.urls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urls] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun urls(urls: JsonField<List<String>>) = apply {
                this.urls = urls.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [urls].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUrl(url: String) = apply {
                urls =
                    (urls ?: JsonField.of(mutableListOf())).also { checkKnown("urls", it).add(url) }
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
             * Returns an immutable instance of [RfEmitterDetail].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .idRfEmitter()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RfEmitterDetail =
                RfEmitterDetail(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("idRfEmitter", idRfEmitter),
                    checkRequired("source", source),
                    id,
                    alternateFacilityName,
                    altName,
                    amplifier,
                    (antennas ?: JsonMissing.of()).map { it.toImmutable() },
                    barrageNoiseBandwidth,
                    bitRunTime,
                    createdAt,
                    createdBy,
                    description,
                    designator,
                    dopplerNoise,
                    drfmInstantaneousBandwidth,
                    family,
                    fixedAttenuation,
                    idManufacturerOrg,
                    idProductionFacilityLocation,
                    loanedToCocom,
                    notes,
                    numBits,
                    numChannels,
                    origin,
                    origNetwork,
                    (powerOffsets ?: JsonMissing.of()).map { it.toImmutable() },
                    prepTime,
                    primaryCocom,
                    productionFacilityName,
                    receiverType,
                    secondaryNotes,
                    (services ?: JsonMissing.of()).map { it.toImmutable() },
                    systemSensitivityEnd,
                    systemSensitivityStart,
                    (ttps ?: JsonMissing.of()).map { it.toImmutable() },
                    updatedAt,
                    updatedBy,
                    (urls ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RfEmitterDetail = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            idRfEmitter()
            source()
            id()
            alternateFacilityName()
            altName()
            amplifier().ifPresent { it.validate() }
            antennas().ifPresent { it.forEach { it.validate() } }
            barrageNoiseBandwidth()
            bitRunTime()
            createdAt()
            createdBy()
            description()
            designator()
            dopplerNoise()
            drfmInstantaneousBandwidth()
            family()
            fixedAttenuation()
            idManufacturerOrg()
            idProductionFacilityLocation()
            loanedToCocom()
            notes()
            numBits()
            numChannels()
            origin()
            origNetwork()
            powerOffsets().ifPresent { it.forEach { it.validate() } }
            prepTime()
            primaryCocom()
            productionFacilityName()
            receiverType()
            secondaryNotes()
            services().ifPresent { it.forEach { it.validate() } }
            systemSensitivityEnd()
            systemSensitivityStart()
            ttps().ifPresent { it.forEach { it.validate() } }
            updatedAt()
            updatedBy()
            urls()
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
                (if (idRfEmitter.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (alternateFacilityName.asKnown().isPresent) 1 else 0) +
                (if (altName.asKnown().isPresent) 1 else 0) +
                (amplifier.asKnown().getOrNull()?.validity() ?: 0) +
                (antennas.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (barrageNoiseBandwidth.asKnown().isPresent) 1 else 0) +
                (if (bitRunTime.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (designator.asKnown().isPresent) 1 else 0) +
                (if (dopplerNoise.asKnown().isPresent) 1 else 0) +
                (if (drfmInstantaneousBandwidth.asKnown().isPresent) 1 else 0) +
                (if (family.asKnown().isPresent) 1 else 0) +
                (if (fixedAttenuation.asKnown().isPresent) 1 else 0) +
                (if (idManufacturerOrg.asKnown().isPresent) 1 else 0) +
                (if (idProductionFacilityLocation.asKnown().isPresent) 1 else 0) +
                (if (loanedToCocom.asKnown().isPresent) 1 else 0) +
                (if (notes.asKnown().isPresent) 1 else 0) +
                (if (numBits.asKnown().isPresent) 1 else 0) +
                (if (numChannels.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (powerOffsets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (prepTime.asKnown().isPresent) 1 else 0) +
                (if (primaryCocom.asKnown().isPresent) 1 else 0) +
                (if (productionFacilityName.asKnown().isPresent) 1 else 0) +
                (if (receiverType.asKnown().isPresent) 1 else 0) +
                (if (secondaryNotes.asKnown().isPresent) 1 else 0) +
                (services.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (systemSensitivityEnd.asKnown().isPresent) 1 else 0) +
                (if (systemSensitivityStart.asKnown().isPresent) 1 else 0) +
                (ttps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0) +
                (urls.asKnown().getOrNull()?.size ?: 0)

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

        /** An RF Amplifier associated with an RF Emitter Details. */
        class Amplifier
        private constructor(
            private val deviceIdentifier: JsonField<String>,
            private val manufacturer: JsonField<String>,
            private val modelName: JsonField<String>,
            private val power: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("deviceIdentifier")
                @ExcludeMissing
                deviceIdentifier: JsonField<String> = JsonMissing.of(),
                @JsonProperty("manufacturer")
                @ExcludeMissing
                manufacturer: JsonField<String> = JsonMissing.of(),
                @JsonProperty("modelName")
                @ExcludeMissing
                modelName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("power") @ExcludeMissing power: JsonField<Double> = JsonMissing.of(),
            ) : this(deviceIdentifier, manufacturer, modelName, power, mutableMapOf())

            /**
             * The device identifier of the amplifier.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun deviceIdentifier(): Optional<String> =
                deviceIdentifier.getOptional("deviceIdentifier")

            /**
             * The manufacturer of the amplifier.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun manufacturer(): Optional<String> = manufacturer.getOptional("manufacturer")

            /**
             * The model name of the amplifier.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun modelName(): Optional<String> = modelName.getOptional("modelName")

            /**
             * The amplifier power level, in watts.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun power(): Optional<Double> = power.getOptional("power")

            /**
             * Returns the raw JSON value of [deviceIdentifier].
             *
             * Unlike [deviceIdentifier], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("deviceIdentifier")
            @ExcludeMissing
            fun _deviceIdentifier(): JsonField<String> = deviceIdentifier

            /**
             * Returns the raw JSON value of [manufacturer].
             *
             * Unlike [manufacturer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("manufacturer")
            @ExcludeMissing
            fun _manufacturer(): JsonField<String> = manufacturer

            /**
             * Returns the raw JSON value of [modelName].
             *
             * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("modelName")
            @ExcludeMissing
            fun _modelName(): JsonField<String> = modelName

            /**
             * Returns the raw JSON value of [power].
             *
             * Unlike [power], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("power") @ExcludeMissing fun _power(): JsonField<Double> = power

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

                /** Returns a mutable builder for constructing an instance of [Amplifier]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Amplifier]. */
            class Builder internal constructor() {

                private var deviceIdentifier: JsonField<String> = JsonMissing.of()
                private var manufacturer: JsonField<String> = JsonMissing.of()
                private var modelName: JsonField<String> = JsonMissing.of()
                private var power: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(amplifier: Amplifier) = apply {
                    deviceIdentifier = amplifier.deviceIdentifier
                    manufacturer = amplifier.manufacturer
                    modelName = amplifier.modelName
                    power = amplifier.power
                    additionalProperties = amplifier.additionalProperties.toMutableMap()
                }

                /** The device identifier of the amplifier. */
                fun deviceIdentifier(deviceIdentifier: String) =
                    deviceIdentifier(JsonField.of(deviceIdentifier))

                /**
                 * Sets [Builder.deviceIdentifier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deviceIdentifier] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun deviceIdentifier(deviceIdentifier: JsonField<String>) = apply {
                    this.deviceIdentifier = deviceIdentifier
                }

                /** The manufacturer of the amplifier. */
                fun manufacturer(manufacturer: String) = manufacturer(JsonField.of(manufacturer))

                /**
                 * Sets [Builder.manufacturer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.manufacturer] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun manufacturer(manufacturer: JsonField<String>) = apply {
                    this.manufacturer = manufacturer
                }

                /** The model name of the amplifier. */
                fun modelName(modelName: String) = modelName(JsonField.of(modelName))

                /**
                 * Sets [Builder.modelName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

                /** The amplifier power level, in watts. */
                fun power(power: Double) = power(JsonField.of(power))

                /**
                 * Sets [Builder.power] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.power] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun power(power: JsonField<Double>) = apply { this.power = power }

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
                 * Returns an immutable instance of [Amplifier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Amplifier =
                    Amplifier(
                        deviceIdentifier,
                        manufacturer,
                        modelName,
                        power,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Amplifier = apply {
                if (validated) {
                    return@apply
                }

                deviceIdentifier()
                manufacturer()
                modelName()
                power()
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
                (if (deviceIdentifier.asKnown().isPresent) 1 else 0) +
                    (if (manufacturer.asKnown().isPresent) 1 else 0) +
                    (if (modelName.asKnown().isPresent) 1 else 0) +
                    (if (power.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Amplifier &&
                    deviceIdentifier == other.deviceIdentifier &&
                    manufacturer == other.manufacturer &&
                    modelName == other.modelName &&
                    power == other.power &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(deviceIdentifier, manufacturer, modelName, power, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Amplifier{deviceIdentifier=$deviceIdentifier, manufacturer=$manufacturer, modelName=$modelName, power=$power, additionalProperties=$additionalProperties}"
        }

        /** An RF Antenna associated with an RF Emitter Details. */
        class Antenna
        private constructor(
            private val antennaDiameter: JsonField<Double>,
            private val antennaSize: JsonField<List<Double>>,
            private val azElFixed: JsonField<Boolean>,
            private val feeds: JsonField<List<Feed>>,
            private val fixedAzimuth: JsonField<Double>,
            private val fixedElevation: JsonField<Double>,
            private val maxAzimuths: JsonField<List<Double>>,
            private val maxElevation: JsonField<Double>,
            private val minAzimuths: JsonField<List<Double>>,
            private val minElevation: JsonField<Double>,
            private val name: JsonField<String>,
            private val receiverChannels: JsonField<List<ReceiverChannel>>,
            private val transmitChannels: JsonField<List<TransmitChannel>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("antennaDiameter")
                @ExcludeMissing
                antennaDiameter: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("antennaSize")
                @ExcludeMissing
                antennaSize: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("azElFixed")
                @ExcludeMissing
                azElFixed: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("feeds")
                @ExcludeMissing
                feeds: JsonField<List<Feed>> = JsonMissing.of(),
                @JsonProperty("fixedAzimuth")
                @ExcludeMissing
                fixedAzimuth: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("fixedElevation")
                @ExcludeMissing
                fixedElevation: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("maxAzimuths")
                @ExcludeMissing
                maxAzimuths: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("maxElevation")
                @ExcludeMissing
                maxElevation: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("minAzimuths")
                @ExcludeMissing
                minAzimuths: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("minElevation")
                @ExcludeMissing
                minElevation: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("receiverChannels")
                @ExcludeMissing
                receiverChannels: JsonField<List<ReceiverChannel>> = JsonMissing.of(),
                @JsonProperty("transmitChannels")
                @ExcludeMissing
                transmitChannels: JsonField<List<TransmitChannel>> = JsonMissing.of(),
            ) : this(
                antennaDiameter,
                antennaSize,
                azElFixed,
                feeds,
                fixedAzimuth,
                fixedElevation,
                maxAzimuths,
                maxElevation,
                minAzimuths,
                minElevation,
                name,
                receiverChannels,
                transmitChannels,
                mutableMapOf(),
            )

            /**
             * For parabolic/dish antennas, the diameter of the antenna in meters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun antennaDiameter(): Optional<Double> = antennaDiameter.getOptional("antennaDiameter")

            /**
             * Array with 1-2 values specifying the length and width (for rectangular) and just
             * length for dipole antennas in meters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun antennaSize(): Optional<List<Double>> = antennaSize.getOptional("antennaSize")

            /**
             * A flag to indicate whether the antenna points at a fixed azimuth/elevation.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun azElFixed(): Optional<Boolean> = azElFixed.getOptional("azElFixed")

            /**
             * The set of antenna feeds for this antenna.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun feeds(): Optional<List<Feed>> = feeds.getOptional("feeds")

            /**
             * Antenna azimuth, in degrees clockwise from true North, for a fixed antenna.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fixedAzimuth(): Optional<Double> = fixedAzimuth.getOptional("fixedAzimuth")

            /**
             * Antenna elevation, in degrees, for a fixed antenna.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fixedElevation(): Optional<Double> = fixedElevation.getOptional("fixedElevation")

            /**
             * Array of maximum azimuths, in degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun maxAzimuths(): Optional<List<Double>> = maxAzimuths.getOptional("maxAzimuths")

            /**
             * Maximum elevation, in degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun maxElevation(): Optional<Double> = maxElevation.getOptional("maxElevation")

            /**
             * Array of minimum azimuths, in degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun minAzimuths(): Optional<List<Double>> = minAzimuths.getOptional("minAzimuths")

            /**
             * Minimum elevation, in degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun minElevation(): Optional<Double> = minElevation.getOptional("minElevation")

            /**
             * The name of the antenna.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * The set of receiver channels for this antenna.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun receiverChannels(): Optional<List<ReceiverChannel>> =
                receiverChannels.getOptional("receiverChannels")

            /**
             * The set of transmit channels for this antenna.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun transmitChannels(): Optional<List<TransmitChannel>> =
                transmitChannels.getOptional("transmitChannels")

            /**
             * Returns the raw JSON value of [antennaDiameter].
             *
             * Unlike [antennaDiameter], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("antennaDiameter")
            @ExcludeMissing
            fun _antennaDiameter(): JsonField<Double> = antennaDiameter

            /**
             * Returns the raw JSON value of [antennaSize].
             *
             * Unlike [antennaSize], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("antennaSize")
            @ExcludeMissing
            fun _antennaSize(): JsonField<List<Double>> = antennaSize

            /**
             * Returns the raw JSON value of [azElFixed].
             *
             * Unlike [azElFixed], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("azElFixed")
            @ExcludeMissing
            fun _azElFixed(): JsonField<Boolean> = azElFixed

            /**
             * Returns the raw JSON value of [feeds].
             *
             * Unlike [feeds], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("feeds") @ExcludeMissing fun _feeds(): JsonField<List<Feed>> = feeds

            /**
             * Returns the raw JSON value of [fixedAzimuth].
             *
             * Unlike [fixedAzimuth], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fixedAzimuth")
            @ExcludeMissing
            fun _fixedAzimuth(): JsonField<Double> = fixedAzimuth

            /**
             * Returns the raw JSON value of [fixedElevation].
             *
             * Unlike [fixedElevation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fixedElevation")
            @ExcludeMissing
            fun _fixedElevation(): JsonField<Double> = fixedElevation

            /**
             * Returns the raw JSON value of [maxAzimuths].
             *
             * Unlike [maxAzimuths], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("maxAzimuths")
            @ExcludeMissing
            fun _maxAzimuths(): JsonField<List<Double>> = maxAzimuths

            /**
             * Returns the raw JSON value of [maxElevation].
             *
             * Unlike [maxElevation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("maxElevation")
            @ExcludeMissing
            fun _maxElevation(): JsonField<Double> = maxElevation

            /**
             * Returns the raw JSON value of [minAzimuths].
             *
             * Unlike [minAzimuths], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("minAzimuths")
            @ExcludeMissing
            fun _minAzimuths(): JsonField<List<Double>> = minAzimuths

            /**
             * Returns the raw JSON value of [minElevation].
             *
             * Unlike [minElevation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("minElevation")
            @ExcludeMissing
            fun _minElevation(): JsonField<Double> = minElevation

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [receiverChannels].
             *
             * Unlike [receiverChannels], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("receiverChannels")
            @ExcludeMissing
            fun _receiverChannels(): JsonField<List<ReceiverChannel>> = receiverChannels

            /**
             * Returns the raw JSON value of [transmitChannels].
             *
             * Unlike [transmitChannels], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transmitChannels")
            @ExcludeMissing
            fun _transmitChannels(): JsonField<List<TransmitChannel>> = transmitChannels

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

                /** Returns a mutable builder for constructing an instance of [Antenna]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Antenna]. */
            class Builder internal constructor() {

                private var antennaDiameter: JsonField<Double> = JsonMissing.of()
                private var antennaSize: JsonField<MutableList<Double>>? = null
                private var azElFixed: JsonField<Boolean> = JsonMissing.of()
                private var feeds: JsonField<MutableList<Feed>>? = null
                private var fixedAzimuth: JsonField<Double> = JsonMissing.of()
                private var fixedElevation: JsonField<Double> = JsonMissing.of()
                private var maxAzimuths: JsonField<MutableList<Double>>? = null
                private var maxElevation: JsonField<Double> = JsonMissing.of()
                private var minAzimuths: JsonField<MutableList<Double>>? = null
                private var minElevation: JsonField<Double> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var receiverChannels: JsonField<MutableList<ReceiverChannel>>? = null
                private var transmitChannels: JsonField<MutableList<TransmitChannel>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(antenna: Antenna) = apply {
                    antennaDiameter = antenna.antennaDiameter
                    antennaSize = antenna.antennaSize.map { it.toMutableList() }
                    azElFixed = antenna.azElFixed
                    feeds = antenna.feeds.map { it.toMutableList() }
                    fixedAzimuth = antenna.fixedAzimuth
                    fixedElevation = antenna.fixedElevation
                    maxAzimuths = antenna.maxAzimuths.map { it.toMutableList() }
                    maxElevation = antenna.maxElevation
                    minAzimuths = antenna.minAzimuths.map { it.toMutableList() }
                    minElevation = antenna.minElevation
                    name = antenna.name
                    receiverChannels = antenna.receiverChannels.map { it.toMutableList() }
                    transmitChannels = antenna.transmitChannels.map { it.toMutableList() }
                    additionalProperties = antenna.additionalProperties.toMutableMap()
                }

                /** For parabolic/dish antennas, the diameter of the antenna in meters. */
                fun antennaDiameter(antennaDiameter: Double) =
                    antennaDiameter(JsonField.of(antennaDiameter))

                /**
                 * Sets [Builder.antennaDiameter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.antennaDiameter] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun antennaDiameter(antennaDiameter: JsonField<Double>) = apply {
                    this.antennaDiameter = antennaDiameter
                }

                /**
                 * Array with 1-2 values specifying the length and width (for rectangular) and just
                 * length for dipole antennas in meters.
                 */
                fun antennaSize(antennaSize: List<Double>) = antennaSize(JsonField.of(antennaSize))

                /**
                 * Sets [Builder.antennaSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.antennaSize] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun antennaSize(antennaSize: JsonField<List<Double>>) = apply {
                    this.antennaSize = antennaSize.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.antennaSize].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAntennaSize(antennaSize: Double) = apply {
                    this.antennaSize =
                        (this.antennaSize ?: JsonField.of(mutableListOf())).also {
                            checkKnown("antennaSize", it).add(antennaSize)
                        }
                }

                /** A flag to indicate whether the antenna points at a fixed azimuth/elevation. */
                fun azElFixed(azElFixed: Boolean) = azElFixed(JsonField.of(azElFixed))

                /**
                 * Sets [Builder.azElFixed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.azElFixed] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun azElFixed(azElFixed: JsonField<Boolean>) = apply { this.azElFixed = azElFixed }

                /** The set of antenna feeds for this antenna. */
                fun feeds(feeds: List<Feed>) = feeds(JsonField.of(feeds))

                /**
                 * Sets [Builder.feeds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.feeds] with a well-typed `List<Feed>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun feeds(feeds: JsonField<List<Feed>>) = apply {
                    this.feeds = feeds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Feed] to [feeds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFeed(feed: Feed) = apply {
                    feeds =
                        (feeds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("feeds", it).add(feed)
                        }
                }

                /** Antenna azimuth, in degrees clockwise from true North, for a fixed antenna. */
                fun fixedAzimuth(fixedAzimuth: Double) = fixedAzimuth(JsonField.of(fixedAzimuth))

                /**
                 * Sets [Builder.fixedAzimuth] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedAzimuth] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fixedAzimuth(fixedAzimuth: JsonField<Double>) = apply {
                    this.fixedAzimuth = fixedAzimuth
                }

                /** Antenna elevation, in degrees, for a fixed antenna. */
                fun fixedElevation(fixedElevation: Double) =
                    fixedElevation(JsonField.of(fixedElevation))

                /**
                 * Sets [Builder.fixedElevation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedElevation] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fixedElevation(fixedElevation: JsonField<Double>) = apply {
                    this.fixedElevation = fixedElevation
                }

                /** Array of maximum azimuths, in degrees. */
                fun maxAzimuths(maxAzimuths: List<Double>) = maxAzimuths(JsonField.of(maxAzimuths))

                /**
                 * Sets [Builder.maxAzimuths] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxAzimuths] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxAzimuths(maxAzimuths: JsonField<List<Double>>) = apply {
                    this.maxAzimuths = maxAzimuths.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [maxAzimuths].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMaxAzimuth(maxAzimuth: Double) = apply {
                    maxAzimuths =
                        (maxAzimuths ?: JsonField.of(mutableListOf())).also {
                            checkKnown("maxAzimuths", it).add(maxAzimuth)
                        }
                }

                /** Maximum elevation, in degrees. */
                fun maxElevation(maxElevation: Double) = maxElevation(JsonField.of(maxElevation))

                /**
                 * Sets [Builder.maxElevation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxElevation] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxElevation(maxElevation: JsonField<Double>) = apply {
                    this.maxElevation = maxElevation
                }

                /** Array of minimum azimuths, in degrees. */
                fun minAzimuths(minAzimuths: List<Double>) = minAzimuths(JsonField.of(minAzimuths))

                /**
                 * Sets [Builder.minAzimuths] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.minAzimuths] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun minAzimuths(minAzimuths: JsonField<List<Double>>) = apply {
                    this.minAzimuths = minAzimuths.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [minAzimuths].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMinAzimuth(minAzimuth: Double) = apply {
                    minAzimuths =
                        (minAzimuths ?: JsonField.of(mutableListOf())).also {
                            checkKnown("minAzimuths", it).add(minAzimuth)
                        }
                }

                /** Minimum elevation, in degrees. */
                fun minElevation(minElevation: Double) = minElevation(JsonField.of(minElevation))

                /**
                 * Sets [Builder.minElevation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.minElevation] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun minElevation(minElevation: JsonField<Double>) = apply {
                    this.minElevation = minElevation
                }

                /** The name of the antenna. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The set of receiver channels for this antenna. */
                fun receiverChannels(receiverChannels: List<ReceiverChannel>) =
                    receiverChannels(JsonField.of(receiverChannels))

                /**
                 * Sets [Builder.receiverChannels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.receiverChannels] with a well-typed
                 * `List<ReceiverChannel>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun receiverChannels(receiverChannels: JsonField<List<ReceiverChannel>>) = apply {
                    this.receiverChannels = receiverChannels.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ReceiverChannel] to [receiverChannels].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addReceiverChannel(receiverChannel: ReceiverChannel) = apply {
                    receiverChannels =
                        (receiverChannels ?: JsonField.of(mutableListOf())).also {
                            checkKnown("receiverChannels", it).add(receiverChannel)
                        }
                }

                /** The set of transmit channels for this antenna. */
                fun transmitChannels(transmitChannels: List<TransmitChannel>) =
                    transmitChannels(JsonField.of(transmitChannels))

                /**
                 * Sets [Builder.transmitChannels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transmitChannels] with a well-typed
                 * `List<TransmitChannel>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun transmitChannels(transmitChannels: JsonField<List<TransmitChannel>>) = apply {
                    this.transmitChannels = transmitChannels.map { it.toMutableList() }
                }

                /**
                 * Adds a single [TransmitChannel] to [transmitChannels].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTransmitChannel(transmitChannel: TransmitChannel) = apply {
                    transmitChannels =
                        (transmitChannels ?: JsonField.of(mutableListOf())).also {
                            checkKnown("transmitChannels", it).add(transmitChannel)
                        }
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
                 * Returns an immutable instance of [Antenna].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Antenna =
                    Antenna(
                        antennaDiameter,
                        (antennaSize ?: JsonMissing.of()).map { it.toImmutable() },
                        azElFixed,
                        (feeds ?: JsonMissing.of()).map { it.toImmutable() },
                        fixedAzimuth,
                        fixedElevation,
                        (maxAzimuths ?: JsonMissing.of()).map { it.toImmutable() },
                        maxElevation,
                        (minAzimuths ?: JsonMissing.of()).map { it.toImmutable() },
                        minElevation,
                        name,
                        (receiverChannels ?: JsonMissing.of()).map { it.toImmutable() },
                        (transmitChannels ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Antenna = apply {
                if (validated) {
                    return@apply
                }

                antennaDiameter()
                antennaSize()
                azElFixed()
                feeds().ifPresent { it.forEach { it.validate() } }
                fixedAzimuth()
                fixedElevation()
                maxAzimuths()
                maxElevation()
                minAzimuths()
                minElevation()
                name()
                receiverChannels().ifPresent { it.forEach { it.validate() } }
                transmitChannels().ifPresent { it.forEach { it.validate() } }
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
                (if (antennaDiameter.asKnown().isPresent) 1 else 0) +
                    (antennaSize.asKnown().getOrNull()?.size ?: 0) +
                    (if (azElFixed.asKnown().isPresent) 1 else 0) +
                    (feeds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (fixedAzimuth.asKnown().isPresent) 1 else 0) +
                    (if (fixedElevation.asKnown().isPresent) 1 else 0) +
                    (maxAzimuths.asKnown().getOrNull()?.size ?: 0) +
                    (if (maxElevation.asKnown().isPresent) 1 else 0) +
                    (minAzimuths.asKnown().getOrNull()?.size ?: 0) +
                    (if (minElevation.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (receiverChannels.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (transmitChannels.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** An RF Antenna Feed associated with an RF Antenna. */
            class Feed
            private constructor(
                private val freqMax: JsonField<Double>,
                private val freqMin: JsonField<Double>,
                private val name: JsonField<String>,
                private val polarization: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("freqMax")
                    @ExcludeMissing
                    freqMax: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("freqMin")
                    @ExcludeMissing
                    freqMin: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("polarization")
                    @ExcludeMissing
                    polarization: JsonField<String> = JsonMissing.of(),
                ) : this(freqMax, freqMin, name, polarization, mutableMapOf())

                /**
                 * Maximum frequency, in megahertz.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun freqMax(): Optional<Double> = freqMax.getOptional("freqMax")

                /**
                 * Minimum frequency, in megahertz.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun freqMin(): Optional<Double> = freqMin.getOptional("freqMin")

                /**
                 * The feed name.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * The antenna feed linear/circular polarization (e.g. HORIZONTAL, VERTICAL,
                 * LEFT_HAND_CIRCULAR, RIGHT_HAND_CIRCULAR).
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun polarization(): Optional<String> = polarization.getOptional("polarization")

                /**
                 * Returns the raw JSON value of [freqMax].
                 *
                 * Unlike [freqMax], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("freqMax") @ExcludeMissing fun _freqMax(): JsonField<Double> = freqMax

                /**
                 * Returns the raw JSON value of [freqMin].
                 *
                 * Unlike [freqMin], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("freqMin") @ExcludeMissing fun _freqMin(): JsonField<Double> = freqMin

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [polarization].
                 *
                 * Unlike [polarization], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("polarization")
                @ExcludeMissing
                fun _polarization(): JsonField<String> = polarization

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

                    /** Returns a mutable builder for constructing an instance of [Feed]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Feed]. */
                class Builder internal constructor() {

                    private var freqMax: JsonField<Double> = JsonMissing.of()
                    private var freqMin: JsonField<Double> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var polarization: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(feed: Feed) = apply {
                        freqMax = feed.freqMax
                        freqMin = feed.freqMin
                        name = feed.name
                        polarization = feed.polarization
                        additionalProperties = feed.additionalProperties.toMutableMap()
                    }

                    /** Maximum frequency, in megahertz. */
                    fun freqMax(freqMax: Double) = freqMax(JsonField.of(freqMax))

                    /**
                     * Sets [Builder.freqMax] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.freqMax] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun freqMax(freqMax: JsonField<Double>) = apply { this.freqMax = freqMax }

                    /** Minimum frequency, in megahertz. */
                    fun freqMin(freqMin: Double) = freqMin(JsonField.of(freqMin))

                    /**
                     * Sets [Builder.freqMin] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.freqMin] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun freqMin(freqMin: JsonField<Double>) = apply { this.freqMin = freqMin }

                    /** The feed name. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The antenna feed linear/circular polarization (e.g. HORIZONTAL, VERTICAL,
                     * LEFT_HAND_CIRCULAR, RIGHT_HAND_CIRCULAR).
                     */
                    fun polarization(polarization: String) =
                        polarization(JsonField.of(polarization))

                    /**
                     * Sets [Builder.polarization] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.polarization] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun polarization(polarization: JsonField<String>) = apply {
                        this.polarization = polarization
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
                     * Returns an immutable instance of [Feed].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Feed =
                        Feed(
                            freqMax,
                            freqMin,
                            name,
                            polarization,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Feed = apply {
                    if (validated) {
                        return@apply
                    }

                    freqMax()
                    freqMin()
                    name()
                    polarization()
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
                    (if (freqMax.asKnown().isPresent) 1 else 0) +
                        (if (freqMin.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (if (polarization.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Feed &&
                        freqMax == other.freqMax &&
                        freqMin == other.freqMin &&
                        name == other.name &&
                        polarization == other.polarization &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(freqMax, freqMin, name, polarization, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Feed{freqMax=$freqMax, freqMin=$freqMin, name=$name, polarization=$polarization, additionalProperties=$additionalProperties}"
            }

            /** An RF Antenna Receiver Channel associated with an RF Antenna. */
            class ReceiverChannel
            private constructor(
                private val bandwidth: JsonField<Double>,
                private val channelNum: JsonField<String>,
                private val deviceIdentifier: JsonField<String>,
                private val freqMax: JsonField<Double>,
                private val freqMin: JsonField<Double>,
                private val maxBandwidth: JsonField<Double>,
                private val minBandwidth: JsonField<Double>,
                private val sensitivity: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bandwidth")
                    @ExcludeMissing
                    bandwidth: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("channelNum")
                    @ExcludeMissing
                    channelNum: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("deviceIdentifier")
                    @ExcludeMissing
                    deviceIdentifier: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("freqMax")
                    @ExcludeMissing
                    freqMax: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("freqMin")
                    @ExcludeMissing
                    freqMin: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("maxBandwidth")
                    @ExcludeMissing
                    maxBandwidth: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("minBandwidth")
                    @ExcludeMissing
                    minBandwidth: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("sensitivity")
                    @ExcludeMissing
                    sensitivity: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    bandwidth,
                    channelNum,
                    deviceIdentifier,
                    freqMax,
                    freqMin,
                    maxBandwidth,
                    minBandwidth,
                    sensitivity,
                    mutableMapOf(),
                )

                /**
                 * The receiver bandwidth, in megahertz, must satisfy the constraint: minBandwidth ≤
                 * bandwidth ≤ maxBandwidth.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun bandwidth(): Optional<Double> = bandwidth.getOptional("bandwidth")

                /**
                 * The receive channel number.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun channelNum(): Optional<String> = channelNum.getOptional("channelNum")

                /**
                 * The receive channel device identifier.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun deviceIdentifier(): Optional<String> =
                    deviceIdentifier.getOptional("deviceIdentifier")

                /**
                 * Maximum frequency, in megahertz.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun freqMax(): Optional<Double> = freqMax.getOptional("freqMax")

                /**
                 * Minimum frequency, in megahertz.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun freqMin(): Optional<Double> = freqMin.getOptional("freqMin")

                /**
                 * The maximum receiver bandwidth, in megahertz, must satisfy the constraint:
                 * minBandwidth ≤ bandwidth ≤ maxBandwidth.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun maxBandwidth(): Optional<Double> = maxBandwidth.getOptional("maxBandwidth")

                /**
                 * The receiver bandwidth, in megahertz, must satisfy the constraint: minBandwidth ≤
                 * bandwidth ≤ maxBandwidth.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun minBandwidth(): Optional<Double> = minBandwidth.getOptional("minBandwidth")

                /**
                 * Receiver sensitivity, in decibel-milliwatts.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun sensitivity(): Optional<Double> = sensitivity.getOptional("sensitivity")

                /**
                 * Returns the raw JSON value of [bandwidth].
                 *
                 * Unlike [bandwidth], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bandwidth")
                @ExcludeMissing
                fun _bandwidth(): JsonField<Double> = bandwidth

                /**
                 * Returns the raw JSON value of [channelNum].
                 *
                 * Unlike [channelNum], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("channelNum")
                @ExcludeMissing
                fun _channelNum(): JsonField<String> = channelNum

                /**
                 * Returns the raw JSON value of [deviceIdentifier].
                 *
                 * Unlike [deviceIdentifier], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("deviceIdentifier")
                @ExcludeMissing
                fun _deviceIdentifier(): JsonField<String> = deviceIdentifier

                /**
                 * Returns the raw JSON value of [freqMax].
                 *
                 * Unlike [freqMax], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("freqMax") @ExcludeMissing fun _freqMax(): JsonField<Double> = freqMax

                /**
                 * Returns the raw JSON value of [freqMin].
                 *
                 * Unlike [freqMin], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("freqMin") @ExcludeMissing fun _freqMin(): JsonField<Double> = freqMin

                /**
                 * Returns the raw JSON value of [maxBandwidth].
                 *
                 * Unlike [maxBandwidth], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("maxBandwidth")
                @ExcludeMissing
                fun _maxBandwidth(): JsonField<Double> = maxBandwidth

                /**
                 * Returns the raw JSON value of [minBandwidth].
                 *
                 * Unlike [minBandwidth], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("minBandwidth")
                @ExcludeMissing
                fun _minBandwidth(): JsonField<Double> = minBandwidth

                /**
                 * Returns the raw JSON value of [sensitivity].
                 *
                 * Unlike [sensitivity], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("sensitivity")
                @ExcludeMissing
                fun _sensitivity(): JsonField<Double> = sensitivity

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
                     * Returns a mutable builder for constructing an instance of [ReceiverChannel].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ReceiverChannel]. */
                class Builder internal constructor() {

                    private var bandwidth: JsonField<Double> = JsonMissing.of()
                    private var channelNum: JsonField<String> = JsonMissing.of()
                    private var deviceIdentifier: JsonField<String> = JsonMissing.of()
                    private var freqMax: JsonField<Double> = JsonMissing.of()
                    private var freqMin: JsonField<Double> = JsonMissing.of()
                    private var maxBandwidth: JsonField<Double> = JsonMissing.of()
                    private var minBandwidth: JsonField<Double> = JsonMissing.of()
                    private var sensitivity: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(receiverChannel: ReceiverChannel) = apply {
                        bandwidth = receiverChannel.bandwidth
                        channelNum = receiverChannel.channelNum
                        deviceIdentifier = receiverChannel.deviceIdentifier
                        freqMax = receiverChannel.freqMax
                        freqMin = receiverChannel.freqMin
                        maxBandwidth = receiverChannel.maxBandwidth
                        minBandwidth = receiverChannel.minBandwidth
                        sensitivity = receiverChannel.sensitivity
                        additionalProperties = receiverChannel.additionalProperties.toMutableMap()
                    }

                    /**
                     * The receiver bandwidth, in megahertz, must satisfy the constraint:
                     * minBandwidth ≤ bandwidth ≤ maxBandwidth.
                     */
                    fun bandwidth(bandwidth: Double) = bandwidth(JsonField.of(bandwidth))

                    /**
                     * Sets [Builder.bandwidth] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bandwidth] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bandwidth(bandwidth: JsonField<Double>) = apply {
                        this.bandwidth = bandwidth
                    }

                    /** The receive channel number. */
                    fun channelNum(channelNum: String) = channelNum(JsonField.of(channelNum))

                    /**
                     * Sets [Builder.channelNum] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.channelNum] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun channelNum(channelNum: JsonField<String>) = apply {
                        this.channelNum = channelNum
                    }

                    /** The receive channel device identifier. */
                    fun deviceIdentifier(deviceIdentifier: String) =
                        deviceIdentifier(JsonField.of(deviceIdentifier))

                    /**
                     * Sets [Builder.deviceIdentifier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.deviceIdentifier] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun deviceIdentifier(deviceIdentifier: JsonField<String>) = apply {
                        this.deviceIdentifier = deviceIdentifier
                    }

                    /** Maximum frequency, in megahertz. */
                    fun freqMax(freqMax: Double) = freqMax(JsonField.of(freqMax))

                    /**
                     * Sets [Builder.freqMax] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.freqMax] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun freqMax(freqMax: JsonField<Double>) = apply { this.freqMax = freqMax }

                    /** Minimum frequency, in megahertz. */
                    fun freqMin(freqMin: Double) = freqMin(JsonField.of(freqMin))

                    /**
                     * Sets [Builder.freqMin] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.freqMin] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun freqMin(freqMin: JsonField<Double>) = apply { this.freqMin = freqMin }

                    /**
                     * The maximum receiver bandwidth, in megahertz, must satisfy the constraint:
                     * minBandwidth ≤ bandwidth ≤ maxBandwidth.
                     */
                    fun maxBandwidth(maxBandwidth: Double) =
                        maxBandwidth(JsonField.of(maxBandwidth))

                    /**
                     * Sets [Builder.maxBandwidth] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxBandwidth] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun maxBandwidth(maxBandwidth: JsonField<Double>) = apply {
                        this.maxBandwidth = maxBandwidth
                    }

                    /**
                     * The receiver bandwidth, in megahertz, must satisfy the constraint:
                     * minBandwidth ≤ bandwidth ≤ maxBandwidth.
                     */
                    fun minBandwidth(minBandwidth: Double) =
                        minBandwidth(JsonField.of(minBandwidth))

                    /**
                     * Sets [Builder.minBandwidth] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.minBandwidth] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun minBandwidth(minBandwidth: JsonField<Double>) = apply {
                        this.minBandwidth = minBandwidth
                    }

                    /** Receiver sensitivity, in decibel-milliwatts. */
                    fun sensitivity(sensitivity: Double) = sensitivity(JsonField.of(sensitivity))

                    /**
                     * Sets [Builder.sensitivity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sensitivity] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun sensitivity(sensitivity: JsonField<Double>) = apply {
                        this.sensitivity = sensitivity
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
                     * Returns an immutable instance of [ReceiverChannel].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ReceiverChannel =
                        ReceiverChannel(
                            bandwidth,
                            channelNum,
                            deviceIdentifier,
                            freqMax,
                            freqMin,
                            maxBandwidth,
                            minBandwidth,
                            sensitivity,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ReceiverChannel = apply {
                    if (validated) {
                        return@apply
                    }

                    bandwidth()
                    channelNum()
                    deviceIdentifier()
                    freqMax()
                    freqMin()
                    maxBandwidth()
                    minBandwidth()
                    sensitivity()
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
                    (if (bandwidth.asKnown().isPresent) 1 else 0) +
                        (if (channelNum.asKnown().isPresent) 1 else 0) +
                        (if (deviceIdentifier.asKnown().isPresent) 1 else 0) +
                        (if (freqMax.asKnown().isPresent) 1 else 0) +
                        (if (freqMin.asKnown().isPresent) 1 else 0) +
                        (if (maxBandwidth.asKnown().isPresent) 1 else 0) +
                        (if (minBandwidth.asKnown().isPresent) 1 else 0) +
                        (if (sensitivity.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ReceiverChannel &&
                        bandwidth == other.bandwidth &&
                        channelNum == other.channelNum &&
                        deviceIdentifier == other.deviceIdentifier &&
                        freqMax == other.freqMax &&
                        freqMin == other.freqMin &&
                        maxBandwidth == other.maxBandwidth &&
                        minBandwidth == other.minBandwidth &&
                        sensitivity == other.sensitivity &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        bandwidth,
                        channelNum,
                        deviceIdentifier,
                        freqMax,
                        freqMin,
                        maxBandwidth,
                        minBandwidth,
                        sensitivity,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ReceiverChannel{bandwidth=$bandwidth, channelNum=$channelNum, deviceIdentifier=$deviceIdentifier, freqMax=$freqMax, freqMin=$freqMin, maxBandwidth=$maxBandwidth, minBandwidth=$minBandwidth, sensitivity=$sensitivity, additionalProperties=$additionalProperties}"
            }

            /** An RF Antenna Transmit Channel associated with an RF Antenna. */
            class TransmitChannel
            private constructor(
                private val power: JsonField<Double>,
                private val bandwidth: JsonField<Double>,
                private val channelNum: JsonField<String>,
                private val deviceIdentifier: JsonField<String>,
                private val freq: JsonField<Double>,
                private val freqMax: JsonField<Double>,
                private val freqMin: JsonField<Double>,
                private val hardwareSampleRate: JsonField<Int>,
                private val maxBandwidth: JsonField<Double>,
                private val maxGain: JsonField<Double>,
                private val minBandwidth: JsonField<Double>,
                private val minGain: JsonField<Double>,
                private val sampleRates: JsonField<List<Double>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("power")
                    @ExcludeMissing
                    power: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("bandwidth")
                    @ExcludeMissing
                    bandwidth: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("channelNum")
                    @ExcludeMissing
                    channelNum: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("deviceIdentifier")
                    @ExcludeMissing
                    deviceIdentifier: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("freq")
                    @ExcludeMissing
                    freq: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("freqMax")
                    @ExcludeMissing
                    freqMax: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("freqMin")
                    @ExcludeMissing
                    freqMin: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("hardwareSampleRate")
                    @ExcludeMissing
                    hardwareSampleRate: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("maxBandwidth")
                    @ExcludeMissing
                    maxBandwidth: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("maxGain")
                    @ExcludeMissing
                    maxGain: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("minBandwidth")
                    @ExcludeMissing
                    minBandwidth: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("minGain")
                    @ExcludeMissing
                    minGain: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("sampleRates")
                    @ExcludeMissing
                    sampleRates: JsonField<List<Double>> = JsonMissing.of(),
                ) : this(
                    power,
                    bandwidth,
                    channelNum,
                    deviceIdentifier,
                    freq,
                    freqMax,
                    freqMin,
                    hardwareSampleRate,
                    maxBandwidth,
                    maxGain,
                    minBandwidth,
                    minGain,
                    sampleRates,
                    mutableMapOf(),
                )

                /**
                 * Transmit power, in watts.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type or is unexpectedly missing or null (e.g. if the server
                 *   responded with an unexpected value).
                 */
                fun power(): Double = power.getRequired("power")

                /**
                 * The transmitter bandwidth, in megahertz, must satisfy the constraint:
                 * minBandwidth ≤ bandwidth ≤ maxBandwidth.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun bandwidth(): Optional<Double> = bandwidth.getOptional("bandwidth")

                /**
                 * The transmit channel number.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun channelNum(): Optional<String> = channelNum.getOptional("channelNum")

                /**
                 * The transmit channel device identifier.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun deviceIdentifier(): Optional<String> =
                    deviceIdentifier.getOptional("deviceIdentifier")

                /**
                 * The transmitter frequency, in megahertz, must satisfy the constraint: freqMin <=
                 * freq <= freqMax.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun freq(): Optional<Double> = freq.getOptional("freq")

                /**
                 * The maximum transmitter frequency, in megahertz, must satisfy the constraint:
                 * freqMin ≤ freq ≤ freqMax.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun freqMax(): Optional<Double> = freqMax.getOptional("freqMax")

                /**
                 * The minimum transmitter frequency, in megahertz, must satisfy the constraint:
                 * freqMin ≤ freq ≤ freqMax.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun freqMin(): Optional<Double> = freqMin.getOptional("freqMin")

                /**
                 * The hardware sample rate, in bits per second for this transmit channel.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun hardwareSampleRate(): Optional<Int> =
                    hardwareSampleRate.getOptional("hardwareSampleRate")

                /**
                 * The maximum transmitter bandwidth, in megahertz, must satisfy the constraint:
                 * minBandwidth ≤ bandwidth ≤ maxBandwidth.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun maxBandwidth(): Optional<Double> = maxBandwidth.getOptional("maxBandwidth")

                /**
                 * Maximum gain, in decibels.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun maxGain(): Optional<Double> = maxGain.getOptional("maxGain")

                /**
                 * The minimum transmitter bandwidth, in megahertz, must satisfy the constraint:
                 * minBandwidth ≤ bandwidth ≤ maxBandwidth.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun minBandwidth(): Optional<Double> = minBandwidth.getOptional("minBandwidth")

                /**
                 * Minimum gain, in decibels.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun minGain(): Optional<Double> = minGain.getOptional("minGain")

                /**
                 * The set of sample rates supported by this transmit channel, in bits per second.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun sampleRates(): Optional<List<Double>> = sampleRates.getOptional("sampleRates")

                /**
                 * Returns the raw JSON value of [power].
                 *
                 * Unlike [power], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("power") @ExcludeMissing fun _power(): JsonField<Double> = power

                /**
                 * Returns the raw JSON value of [bandwidth].
                 *
                 * Unlike [bandwidth], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bandwidth")
                @ExcludeMissing
                fun _bandwidth(): JsonField<Double> = bandwidth

                /**
                 * Returns the raw JSON value of [channelNum].
                 *
                 * Unlike [channelNum], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("channelNum")
                @ExcludeMissing
                fun _channelNum(): JsonField<String> = channelNum

                /**
                 * Returns the raw JSON value of [deviceIdentifier].
                 *
                 * Unlike [deviceIdentifier], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("deviceIdentifier")
                @ExcludeMissing
                fun _deviceIdentifier(): JsonField<String> = deviceIdentifier

                /**
                 * Returns the raw JSON value of [freq].
                 *
                 * Unlike [freq], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("freq") @ExcludeMissing fun _freq(): JsonField<Double> = freq

                /**
                 * Returns the raw JSON value of [freqMax].
                 *
                 * Unlike [freqMax], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("freqMax") @ExcludeMissing fun _freqMax(): JsonField<Double> = freqMax

                /**
                 * Returns the raw JSON value of [freqMin].
                 *
                 * Unlike [freqMin], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("freqMin") @ExcludeMissing fun _freqMin(): JsonField<Double> = freqMin

                /**
                 * Returns the raw JSON value of [hardwareSampleRate].
                 *
                 * Unlike [hardwareSampleRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("hardwareSampleRate")
                @ExcludeMissing
                fun _hardwareSampleRate(): JsonField<Int> = hardwareSampleRate

                /**
                 * Returns the raw JSON value of [maxBandwidth].
                 *
                 * Unlike [maxBandwidth], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("maxBandwidth")
                @ExcludeMissing
                fun _maxBandwidth(): JsonField<Double> = maxBandwidth

                /**
                 * Returns the raw JSON value of [maxGain].
                 *
                 * Unlike [maxGain], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("maxGain") @ExcludeMissing fun _maxGain(): JsonField<Double> = maxGain

                /**
                 * Returns the raw JSON value of [minBandwidth].
                 *
                 * Unlike [minBandwidth], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("minBandwidth")
                @ExcludeMissing
                fun _minBandwidth(): JsonField<Double> = minBandwidth

                /**
                 * Returns the raw JSON value of [minGain].
                 *
                 * Unlike [minGain], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("minGain") @ExcludeMissing fun _minGain(): JsonField<Double> = minGain

                /**
                 * Returns the raw JSON value of [sampleRates].
                 *
                 * Unlike [sampleRates], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("sampleRates")
                @ExcludeMissing
                fun _sampleRates(): JsonField<List<Double>> = sampleRates

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
                     * Returns a mutable builder for constructing an instance of [TransmitChannel].
                     *
                     * The following fields are required:
                     * ```java
                     * .power()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TransmitChannel]. */
                class Builder internal constructor() {

                    private var power: JsonField<Double>? = null
                    private var bandwidth: JsonField<Double> = JsonMissing.of()
                    private var channelNum: JsonField<String> = JsonMissing.of()
                    private var deviceIdentifier: JsonField<String> = JsonMissing.of()
                    private var freq: JsonField<Double> = JsonMissing.of()
                    private var freqMax: JsonField<Double> = JsonMissing.of()
                    private var freqMin: JsonField<Double> = JsonMissing.of()
                    private var hardwareSampleRate: JsonField<Int> = JsonMissing.of()
                    private var maxBandwidth: JsonField<Double> = JsonMissing.of()
                    private var maxGain: JsonField<Double> = JsonMissing.of()
                    private var minBandwidth: JsonField<Double> = JsonMissing.of()
                    private var minGain: JsonField<Double> = JsonMissing.of()
                    private var sampleRates: JsonField<MutableList<Double>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(transmitChannel: TransmitChannel) = apply {
                        power = transmitChannel.power
                        bandwidth = transmitChannel.bandwidth
                        channelNum = transmitChannel.channelNum
                        deviceIdentifier = transmitChannel.deviceIdentifier
                        freq = transmitChannel.freq
                        freqMax = transmitChannel.freqMax
                        freqMin = transmitChannel.freqMin
                        hardwareSampleRate = transmitChannel.hardwareSampleRate
                        maxBandwidth = transmitChannel.maxBandwidth
                        maxGain = transmitChannel.maxGain
                        minBandwidth = transmitChannel.minBandwidth
                        minGain = transmitChannel.minGain
                        sampleRates = transmitChannel.sampleRates.map { it.toMutableList() }
                        additionalProperties = transmitChannel.additionalProperties.toMutableMap()
                    }

                    /** Transmit power, in watts. */
                    fun power(power: Double) = power(JsonField.of(power))

                    /**
                     * Sets [Builder.power] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.power] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun power(power: JsonField<Double>) = apply { this.power = power }

                    /**
                     * The transmitter bandwidth, in megahertz, must satisfy the constraint:
                     * minBandwidth ≤ bandwidth ≤ maxBandwidth.
                     */
                    fun bandwidth(bandwidth: Double) = bandwidth(JsonField.of(bandwidth))

                    /**
                     * Sets [Builder.bandwidth] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bandwidth] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bandwidth(bandwidth: JsonField<Double>) = apply {
                        this.bandwidth = bandwidth
                    }

                    /** The transmit channel number. */
                    fun channelNum(channelNum: String) = channelNum(JsonField.of(channelNum))

                    /**
                     * Sets [Builder.channelNum] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.channelNum] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun channelNum(channelNum: JsonField<String>) = apply {
                        this.channelNum = channelNum
                    }

                    /** The transmit channel device identifier. */
                    fun deviceIdentifier(deviceIdentifier: String) =
                        deviceIdentifier(JsonField.of(deviceIdentifier))

                    /**
                     * Sets [Builder.deviceIdentifier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.deviceIdentifier] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun deviceIdentifier(deviceIdentifier: JsonField<String>) = apply {
                        this.deviceIdentifier = deviceIdentifier
                    }

                    /**
                     * The transmitter frequency, in megahertz, must satisfy the constraint: freqMin
                     * <= freq <= freqMax.
                     */
                    fun freq(freq: Double) = freq(JsonField.of(freq))

                    /**
                     * Sets [Builder.freq] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.freq] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun freq(freq: JsonField<Double>) = apply { this.freq = freq }

                    /**
                     * The maximum transmitter frequency, in megahertz, must satisfy the constraint:
                     * freqMin ≤ freq ≤ freqMax.
                     */
                    fun freqMax(freqMax: Double) = freqMax(JsonField.of(freqMax))

                    /**
                     * Sets [Builder.freqMax] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.freqMax] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun freqMax(freqMax: JsonField<Double>) = apply { this.freqMax = freqMax }

                    /**
                     * The minimum transmitter frequency, in megahertz, must satisfy the constraint:
                     * freqMin ≤ freq ≤ freqMax.
                     */
                    fun freqMin(freqMin: Double) = freqMin(JsonField.of(freqMin))

                    /**
                     * Sets [Builder.freqMin] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.freqMin] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun freqMin(freqMin: JsonField<Double>) = apply { this.freqMin = freqMin }

                    /** The hardware sample rate, in bits per second for this transmit channel. */
                    fun hardwareSampleRate(hardwareSampleRate: Int) =
                        hardwareSampleRate(JsonField.of(hardwareSampleRate))

                    /**
                     * Sets [Builder.hardwareSampleRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.hardwareSampleRate] with a well-typed [Int]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun hardwareSampleRate(hardwareSampleRate: JsonField<Int>) = apply {
                        this.hardwareSampleRate = hardwareSampleRate
                    }

                    /**
                     * The maximum transmitter bandwidth, in megahertz, must satisfy the constraint:
                     * minBandwidth ≤ bandwidth ≤ maxBandwidth.
                     */
                    fun maxBandwidth(maxBandwidth: Double) =
                        maxBandwidth(JsonField.of(maxBandwidth))

                    /**
                     * Sets [Builder.maxBandwidth] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxBandwidth] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun maxBandwidth(maxBandwidth: JsonField<Double>) = apply {
                        this.maxBandwidth = maxBandwidth
                    }

                    /** Maximum gain, in decibels. */
                    fun maxGain(maxGain: Double) = maxGain(JsonField.of(maxGain))

                    /**
                     * Sets [Builder.maxGain] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxGain] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maxGain(maxGain: JsonField<Double>) = apply { this.maxGain = maxGain }

                    /**
                     * The minimum transmitter bandwidth, in megahertz, must satisfy the constraint:
                     * minBandwidth ≤ bandwidth ≤ maxBandwidth.
                     */
                    fun minBandwidth(minBandwidth: Double) =
                        minBandwidth(JsonField.of(minBandwidth))

                    /**
                     * Sets [Builder.minBandwidth] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.minBandwidth] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun minBandwidth(minBandwidth: JsonField<Double>) = apply {
                        this.minBandwidth = minBandwidth
                    }

                    /** Minimum gain, in decibels. */
                    fun minGain(minGain: Double) = minGain(JsonField.of(minGain))

                    /**
                     * Sets [Builder.minGain] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.minGain] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun minGain(minGain: JsonField<Double>) = apply { this.minGain = minGain }

                    /**
                     * The set of sample rates supported by this transmit channel, in bits per
                     * second.
                     */
                    fun sampleRates(sampleRates: List<Double>) =
                        sampleRates(JsonField.of(sampleRates))

                    /**
                     * Sets [Builder.sampleRates] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sampleRates] with a well-typed
                     * `List<Double>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun sampleRates(sampleRates: JsonField<List<Double>>) = apply {
                        this.sampleRates = sampleRates.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Double] to [sampleRates].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSampleRate(sampleRate: Double) = apply {
                        sampleRates =
                            (sampleRates ?: JsonField.of(mutableListOf())).also {
                                checkKnown("sampleRates", it).add(sampleRate)
                            }
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
                     * Returns an immutable instance of [TransmitChannel].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .power()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): TransmitChannel =
                        TransmitChannel(
                            checkRequired("power", power),
                            bandwidth,
                            channelNum,
                            deviceIdentifier,
                            freq,
                            freqMax,
                            freqMin,
                            hardwareSampleRate,
                            maxBandwidth,
                            maxGain,
                            minBandwidth,
                            minGain,
                            (sampleRates ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): TransmitChannel = apply {
                    if (validated) {
                        return@apply
                    }

                    power()
                    bandwidth()
                    channelNum()
                    deviceIdentifier()
                    freq()
                    freqMax()
                    freqMin()
                    hardwareSampleRate()
                    maxBandwidth()
                    maxGain()
                    minBandwidth()
                    minGain()
                    sampleRates()
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
                    (if (power.asKnown().isPresent) 1 else 0) +
                        (if (bandwidth.asKnown().isPresent) 1 else 0) +
                        (if (channelNum.asKnown().isPresent) 1 else 0) +
                        (if (deviceIdentifier.asKnown().isPresent) 1 else 0) +
                        (if (freq.asKnown().isPresent) 1 else 0) +
                        (if (freqMax.asKnown().isPresent) 1 else 0) +
                        (if (freqMin.asKnown().isPresent) 1 else 0) +
                        (if (hardwareSampleRate.asKnown().isPresent) 1 else 0) +
                        (if (maxBandwidth.asKnown().isPresent) 1 else 0) +
                        (if (maxGain.asKnown().isPresent) 1 else 0) +
                        (if (minBandwidth.asKnown().isPresent) 1 else 0) +
                        (if (minGain.asKnown().isPresent) 1 else 0) +
                        (sampleRates.asKnown().getOrNull()?.size ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TransmitChannel &&
                        power == other.power &&
                        bandwidth == other.bandwidth &&
                        channelNum == other.channelNum &&
                        deviceIdentifier == other.deviceIdentifier &&
                        freq == other.freq &&
                        freqMax == other.freqMax &&
                        freqMin == other.freqMin &&
                        hardwareSampleRate == other.hardwareSampleRate &&
                        maxBandwidth == other.maxBandwidth &&
                        maxGain == other.maxGain &&
                        minBandwidth == other.minBandwidth &&
                        minGain == other.minGain &&
                        sampleRates == other.sampleRates &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        power,
                        bandwidth,
                        channelNum,
                        deviceIdentifier,
                        freq,
                        freqMax,
                        freqMin,
                        hardwareSampleRate,
                        maxBandwidth,
                        maxGain,
                        minBandwidth,
                        minGain,
                        sampleRates,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TransmitChannel{power=$power, bandwidth=$bandwidth, channelNum=$channelNum, deviceIdentifier=$deviceIdentifier, freq=$freq, freqMax=$freqMax, freqMin=$freqMin, hardwareSampleRate=$hardwareSampleRate, maxBandwidth=$maxBandwidth, maxGain=$maxGain, minBandwidth=$minBandwidth, minGain=$minGain, sampleRates=$sampleRates, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Antenna &&
                    antennaDiameter == other.antennaDiameter &&
                    antennaSize == other.antennaSize &&
                    azElFixed == other.azElFixed &&
                    feeds == other.feeds &&
                    fixedAzimuth == other.fixedAzimuth &&
                    fixedElevation == other.fixedElevation &&
                    maxAzimuths == other.maxAzimuths &&
                    maxElevation == other.maxElevation &&
                    minAzimuths == other.minAzimuths &&
                    minElevation == other.minElevation &&
                    name == other.name &&
                    receiverChannels == other.receiverChannels &&
                    transmitChannels == other.transmitChannels &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    antennaDiameter,
                    antennaSize,
                    azElFixed,
                    feeds,
                    fixedAzimuth,
                    fixedElevation,
                    maxAzimuths,
                    maxElevation,
                    minAzimuths,
                    minElevation,
                    name,
                    receiverChannels,
                    transmitChannels,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Antenna{antennaDiameter=$antennaDiameter, antennaSize=$antennaSize, azElFixed=$azElFixed, feeds=$feeds, fixedAzimuth=$fixedAzimuth, fixedElevation=$fixedElevation, maxAzimuths=$maxAzimuths, maxElevation=$maxElevation, minAzimuths=$minAzimuths, minElevation=$minElevation, name=$name, receiverChannels=$receiverChannels, transmitChannels=$transmitChannels, additionalProperties=$additionalProperties}"
        }

        /** An RF Emitter Power Offset associated with an RF Emitter Details. */
        class PowerOffset
        private constructor(
            private val frequencyBand: JsonField<String>,
            private val powerOffset: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("frequencyBand")
                @ExcludeMissing
                frequencyBand: JsonField<String> = JsonMissing.of(),
                @JsonProperty("powerOffset")
                @ExcludeMissing
                powerOffset: JsonField<Double> = JsonMissing.of(),
            ) : this(frequencyBand, powerOffset, mutableMapOf())

            /**
             * The RF frequency band (e.g. HF, VHF, P, UHF, L, S, C, X, KU, K, KA, V, W, MM).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun frequencyBand(): Optional<String> = frequencyBand.getOptional("frequencyBand")

            /**
             * Power offset, in decibels.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun powerOffset(): Optional<Double> = powerOffset.getOptional("powerOffset")

            /**
             * Returns the raw JSON value of [frequencyBand].
             *
             * Unlike [frequencyBand], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("frequencyBand")
            @ExcludeMissing
            fun _frequencyBand(): JsonField<String> = frequencyBand

            /**
             * Returns the raw JSON value of [powerOffset].
             *
             * Unlike [powerOffset], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("powerOffset")
            @ExcludeMissing
            fun _powerOffset(): JsonField<Double> = powerOffset

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

                /** Returns a mutable builder for constructing an instance of [PowerOffset]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PowerOffset]. */
            class Builder internal constructor() {

                private var frequencyBand: JsonField<String> = JsonMissing.of()
                private var powerOffset: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(powerOffset: PowerOffset) = apply {
                    frequencyBand = powerOffset.frequencyBand
                    this.powerOffset = powerOffset.powerOffset
                    additionalProperties = powerOffset.additionalProperties.toMutableMap()
                }

                /**
                 * The RF frequency band (e.g. HF, VHF, P, UHF, L, S, C, X, KU, K, KA, V, W, MM).
                 */
                fun frequencyBand(frequencyBand: String) =
                    frequencyBand(JsonField.of(frequencyBand))

                /**
                 * Sets [Builder.frequencyBand] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.frequencyBand] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun frequencyBand(frequencyBand: JsonField<String>) = apply {
                    this.frequencyBand = frequencyBand
                }

                /** Power offset, in decibels. */
                fun powerOffset(powerOffset: Double) = powerOffset(JsonField.of(powerOffset))

                /**
                 * Sets [Builder.powerOffset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.powerOffset] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun powerOffset(powerOffset: JsonField<Double>) = apply {
                    this.powerOffset = powerOffset
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
                 * Returns an immutable instance of [PowerOffset].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PowerOffset =
                    PowerOffset(frequencyBand, powerOffset, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): PowerOffset = apply {
                if (validated) {
                    return@apply
                }

                frequencyBand()
                powerOffset()
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
                (if (frequencyBand.asKnown().isPresent) 1 else 0) +
                    (if (powerOffset.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PowerOffset &&
                    frequencyBand == other.frequencyBand &&
                    powerOffset == other.powerOffset &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(frequencyBand, powerOffset, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PowerOffset{frequencyBand=$frequencyBand, powerOffset=$powerOffset, additionalProperties=$additionalProperties}"
        }

        /** An RF Emitter SW Service associated with an RF Emitter Details. */
        class Service
        private constructor(
            private val name: JsonField<String>,
            private val version: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("version")
                @ExcludeMissing
                version: JsonField<String> = JsonMissing.of(),
            ) : this(name, version, mutableMapOf())

            /**
             * The name for this software service.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * The version for this software service.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun version(): Optional<String> = version.getOptional("version")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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

                /** Returns a mutable builder for constructing an instance of [Service]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Service]. */
            class Builder internal constructor() {

                private var name: JsonField<String> = JsonMissing.of()
                private var version: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(service: Service) = apply {
                    name = service.name
                    version = service.version
                    additionalProperties = service.additionalProperties.toMutableMap()
                }

                /** The name for this software service. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The version for this software service. */
                fun version(version: String) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun version(version: JsonField<String>) = apply { this.version = version }

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
                 * Returns an immutable instance of [Service].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Service = Service(name, version, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Service = apply {
                if (validated) {
                    return@apply
                }

                name()
                version()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                    (if (version.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Service &&
                    name == other.name &&
                    version == other.version &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(name, version, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Service{name=$name, version=$version, additionalProperties=$additionalProperties}"
        }

        /** An RF Emitter TTP associated with an RF Emitter Details. */
        class Ttp
        private constructor(
            private val outputSignalName: JsonField<String>,
            private val techniqueDefinitions: JsonField<List<TechniqueDefinition>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("outputSignalName")
                @ExcludeMissing
                outputSignalName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("techniqueDefinitions")
                @ExcludeMissing
                techniqueDefinitions: JsonField<List<TechniqueDefinition>> = JsonMissing.of(),
            ) : this(outputSignalName, techniqueDefinitions, mutableMapOf())

            /**
             * The name of the output signal.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun outputSignalName(): Optional<String> =
                outputSignalName.getOptional("outputSignalName")

            /**
             * The set of TTPs affected by this signal.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun techniqueDefinitions(): Optional<List<TechniqueDefinition>> =
                techniqueDefinitions.getOptional("techniqueDefinitions")

            /**
             * Returns the raw JSON value of [outputSignalName].
             *
             * Unlike [outputSignalName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("outputSignalName")
            @ExcludeMissing
            fun _outputSignalName(): JsonField<String> = outputSignalName

            /**
             * Returns the raw JSON value of [techniqueDefinitions].
             *
             * Unlike [techniqueDefinitions], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("techniqueDefinitions")
            @ExcludeMissing
            fun _techniqueDefinitions(): JsonField<List<TechniqueDefinition>> = techniqueDefinitions

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

                /** Returns a mutable builder for constructing an instance of [Ttp]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Ttp]. */
            class Builder internal constructor() {

                private var outputSignalName: JsonField<String> = JsonMissing.of()
                private var techniqueDefinitions: JsonField<MutableList<TechniqueDefinition>>? =
                    null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ttp: Ttp) = apply {
                    outputSignalName = ttp.outputSignalName
                    techniqueDefinitions = ttp.techniqueDefinitions.map { it.toMutableList() }
                    additionalProperties = ttp.additionalProperties.toMutableMap()
                }

                /** The name of the output signal. */
                fun outputSignalName(outputSignalName: String) =
                    outputSignalName(JsonField.of(outputSignalName))

                /**
                 * Sets [Builder.outputSignalName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outputSignalName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun outputSignalName(outputSignalName: JsonField<String>) = apply {
                    this.outputSignalName = outputSignalName
                }

                /** The set of TTPs affected by this signal. */
                fun techniqueDefinitions(techniqueDefinitions: List<TechniqueDefinition>) =
                    techniqueDefinitions(JsonField.of(techniqueDefinitions))

                /**
                 * Sets [Builder.techniqueDefinitions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.techniqueDefinitions] with a well-typed
                 * `List<TechniqueDefinition>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun techniqueDefinitions(
                    techniqueDefinitions: JsonField<List<TechniqueDefinition>>
                ) = apply {
                    this.techniqueDefinitions = techniqueDefinitions.map { it.toMutableList() }
                }

                /**
                 * Adds a single [TechniqueDefinition] to [techniqueDefinitions].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTechniqueDefinition(techniqueDefinition: TechniqueDefinition) = apply {
                    techniqueDefinitions =
                        (techniqueDefinitions ?: JsonField.of(mutableListOf())).also {
                            checkKnown("techniqueDefinitions", it).add(techniqueDefinition)
                        }
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
                 * Returns an immutable instance of [Ttp].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Ttp =
                    Ttp(
                        outputSignalName,
                        (techniqueDefinitions ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Ttp = apply {
                if (validated) {
                    return@apply
                }

                outputSignalName()
                techniqueDefinitions().ifPresent { it.forEach { it.validate() } }
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
                (if (outputSignalName.asKnown().isPresent) 1 else 0) +
                    (techniqueDefinitions.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0)

            /** An RF Emitter Technique Definition associated with an RF Emitter TTP. */
            class TechniqueDefinition
            private constructor(
                private val name: JsonField<String>,
                private val paramDefinitions: JsonField<List<ParamDefinition>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("paramDefinitions")
                    @ExcludeMissing
                    paramDefinitions: JsonField<List<ParamDefinition>> = JsonMissing.of(),
                ) : this(name, paramDefinitions, mutableMapOf())

                /**
                 * The EW Emitter system technique name.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * The set of required/optional parameters for this technique.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun paramDefinitions(): Optional<List<ParamDefinition>> =
                    paramDefinitions.getOptional("paramDefinitions")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [paramDefinitions].
                 *
                 * Unlike [paramDefinitions], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("paramDefinitions")
                @ExcludeMissing
                fun _paramDefinitions(): JsonField<List<ParamDefinition>> = paramDefinitions

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
                     * [TechniqueDefinition].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TechniqueDefinition]. */
                class Builder internal constructor() {

                    private var name: JsonField<String> = JsonMissing.of()
                    private var paramDefinitions: JsonField<MutableList<ParamDefinition>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(techniqueDefinition: TechniqueDefinition) = apply {
                        name = techniqueDefinition.name
                        paramDefinitions =
                            techniqueDefinition.paramDefinitions.map { it.toMutableList() }
                        additionalProperties =
                            techniqueDefinition.additionalProperties.toMutableMap()
                    }

                    /** The EW Emitter system technique name. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** The set of required/optional parameters for this technique. */
                    fun paramDefinitions(paramDefinitions: List<ParamDefinition>) =
                        paramDefinitions(JsonField.of(paramDefinitions))

                    /**
                     * Sets [Builder.paramDefinitions] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.paramDefinitions] with a well-typed
                     * `List<ParamDefinition>` value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun paramDefinitions(paramDefinitions: JsonField<List<ParamDefinition>>) =
                        apply {
                            this.paramDefinitions = paramDefinitions.map { it.toMutableList() }
                        }

                    /**
                     * Adds a single [ParamDefinition] to [paramDefinitions].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addParamDefinition(paramDefinition: ParamDefinition) = apply {
                        paramDefinitions =
                            (paramDefinitions ?: JsonField.of(mutableListOf())).also {
                                checkKnown("paramDefinitions", it).add(paramDefinition)
                            }
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
                     * Returns an immutable instance of [TechniqueDefinition].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): TechniqueDefinition =
                        TechniqueDefinition(
                            name,
                            (paramDefinitions ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): TechniqueDefinition = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    paramDefinitions().ifPresent { it.forEach { it.validate() } }
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                        (paramDefinitions.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                            ?: 0)

                /**
                 * An RF Emitter Technique Parameter Definition associated with an RF Emitter
                 * Technique Definition.
                 */
                class ParamDefinition
                private constructor(
                    private val defaultValue: JsonField<String>,
                    private val max: JsonField<Double>,
                    private val min: JsonField<Double>,
                    private val name: JsonField<String>,
                    private val optional: JsonField<Boolean>,
                    private val type: JsonField<String>,
                    private val units: JsonField<String>,
                    private val validValues: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("defaultValue")
                        @ExcludeMissing
                        defaultValue: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("max")
                        @ExcludeMissing
                        max: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("min")
                        @ExcludeMissing
                        min: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("optional")
                        @ExcludeMissing
                        optional: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("units")
                        @ExcludeMissing
                        units: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("validValues")
                        @ExcludeMissing
                        validValues: JsonField<List<String>> = JsonMissing.of(),
                    ) : this(
                        defaultValue,
                        max,
                        min,
                        name,
                        optional,
                        type,
                        units,
                        validValues,
                        mutableMapOf(),
                    )

                    /**
                     * Default parameter value used if not overridden in a SEW task definition.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun defaultValue(): Optional<String> = defaultValue.getOptional("defaultValue")

                    /**
                     * Maximum allowable value for a numeric parameter.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun max(): Optional<Double> = max.getOptional("max")

                    /**
                     * Minimum allowable value for a numeric parameter.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun min(): Optional<Double> = min.getOptional("min")

                    /**
                     * The name of the parameter.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun name(): Optional<String> = name.getOptional("name")

                    /**
                     * A flag to specify that a parameter is optional.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun optional(): Optional<Boolean> = optional.getOptional("optional")

                    /**
                     * The type of parameter (e.g. STRING, DOUBLE, INT, LIST).
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun type(): Optional<String> = type.getOptional("type")

                    /**
                     * Units (degrees, seconds, decibels, etc.) for a numeric parameter.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun units(): Optional<String> = units.getOptional("units")

                    /**
                     * Valid values for strictly defined parameters.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun validValues(): Optional<List<String>> =
                        validValues.getOptional("validValues")

                    /**
                     * Returns the raw JSON value of [defaultValue].
                     *
                     * Unlike [defaultValue], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("defaultValue")
                    @ExcludeMissing
                    fun _defaultValue(): JsonField<String> = defaultValue

                    /**
                     * Returns the raw JSON value of [max].
                     *
                     * Unlike [max], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("max") @ExcludeMissing fun _max(): JsonField<Double> = max

                    /**
                     * Returns the raw JSON value of [min].
                     *
                     * Unlike [min], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("min") @ExcludeMissing fun _min(): JsonField<Double> = min

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [optional].
                     *
                     * Unlike [optional], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("optional")
                    @ExcludeMissing
                    fun _optional(): JsonField<Boolean> = optional

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

                    /**
                     * Returns the raw JSON value of [units].
                     *
                     * Unlike [units], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("units") @ExcludeMissing fun _units(): JsonField<String> = units

                    /**
                     * Returns the raw JSON value of [validValues].
                     *
                     * Unlike [validValues], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("validValues")
                    @ExcludeMissing
                    fun _validValues(): JsonField<List<String>> = validValues

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
                         * [ParamDefinition].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ParamDefinition]. */
                    class Builder internal constructor() {

                        private var defaultValue: JsonField<String> = JsonMissing.of()
                        private var max: JsonField<Double> = JsonMissing.of()
                        private var min: JsonField<Double> = JsonMissing.of()
                        private var name: JsonField<String> = JsonMissing.of()
                        private var optional: JsonField<Boolean> = JsonMissing.of()
                        private var type: JsonField<String> = JsonMissing.of()
                        private var units: JsonField<String> = JsonMissing.of()
                        private var validValues: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(paramDefinition: ParamDefinition) = apply {
                            defaultValue = paramDefinition.defaultValue
                            max = paramDefinition.max
                            min = paramDefinition.min
                            name = paramDefinition.name
                            optional = paramDefinition.optional
                            type = paramDefinition.type
                            units = paramDefinition.units
                            validValues = paramDefinition.validValues.map { it.toMutableList() }
                            additionalProperties =
                                paramDefinition.additionalProperties.toMutableMap()
                        }

                        /**
                         * Default parameter value used if not overridden in a SEW task definition.
                         */
                        fun defaultValue(defaultValue: String) =
                            defaultValue(JsonField.of(defaultValue))

                        /**
                         * Sets [Builder.defaultValue] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.defaultValue] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun defaultValue(defaultValue: JsonField<String>) = apply {
                            this.defaultValue = defaultValue
                        }

                        /** Maximum allowable value for a numeric parameter. */
                        fun max(max: Double) = max(JsonField.of(max))

                        /**
                         * Sets [Builder.max] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.max] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun max(max: JsonField<Double>) = apply { this.max = max }

                        /** Minimum allowable value for a numeric parameter. */
                        fun min(min: Double) = min(JsonField.of(min))

                        /**
                         * Sets [Builder.min] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.min] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun min(min: JsonField<Double>) = apply { this.min = min }

                        /** The name of the parameter. */
                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        /** A flag to specify that a parameter is optional. */
                        fun optional(optional: Boolean) = optional(JsonField.of(optional))

                        /**
                         * Sets [Builder.optional] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.optional] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun optional(optional: JsonField<Boolean>) = apply {
                            this.optional = optional
                        }

                        /** The type of parameter (e.g. STRING, DOUBLE, INT, LIST). */
                        fun type(type: String) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<String>) = apply { this.type = type }

                        /** Units (degrees, seconds, decibels, etc.) for a numeric parameter. */
                        fun units(units: String) = units(JsonField.of(units))

                        /**
                         * Sets [Builder.units] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.units] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun units(units: JsonField<String>) = apply { this.units = units }

                        /** Valid values for strictly defined parameters. */
                        fun validValues(validValues: List<String>) =
                            validValues(JsonField.of(validValues))

                        /**
                         * Sets [Builder.validValues] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.validValues] with a well-typed
                         * `List<String>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun validValues(validValues: JsonField<List<String>>) = apply {
                            this.validValues = validValues.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [validValues].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addValidValue(validValue: String) = apply {
                            validValues =
                                (validValues ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("validValues", it).add(validValue)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ParamDefinition].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): ParamDefinition =
                            ParamDefinition(
                                defaultValue,
                                max,
                                min,
                                name,
                                optional,
                                type,
                                units,
                                (validValues ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): ParamDefinition = apply {
                        if (validated) {
                            return@apply
                        }

                        defaultValue()
                        max()
                        min()
                        name()
                        optional()
                        type()
                        units()
                        validValues()
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
                        (if (defaultValue.asKnown().isPresent) 1 else 0) +
                            (if (max.asKnown().isPresent) 1 else 0) +
                            (if (min.asKnown().isPresent) 1 else 0) +
                            (if (name.asKnown().isPresent) 1 else 0) +
                            (if (optional.asKnown().isPresent) 1 else 0) +
                            (if (type.asKnown().isPresent) 1 else 0) +
                            (if (units.asKnown().isPresent) 1 else 0) +
                            (validValues.asKnown().getOrNull()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ParamDefinition &&
                            defaultValue == other.defaultValue &&
                            max == other.max &&
                            min == other.min &&
                            name == other.name &&
                            optional == other.optional &&
                            type == other.type &&
                            units == other.units &&
                            validValues == other.validValues &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            defaultValue,
                            max,
                            min,
                            name,
                            optional,
                            type,
                            units,
                            validValues,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ParamDefinition{defaultValue=$defaultValue, max=$max, min=$min, name=$name, optional=$optional, type=$type, units=$units, validValues=$validValues, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TechniqueDefinition &&
                        name == other.name &&
                        paramDefinitions == other.paramDefinitions &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, paramDefinitions, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TechniqueDefinition{name=$name, paramDefinitions=$paramDefinitions, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Ttp &&
                    outputSignalName == other.outputSignalName &&
                    techniqueDefinitions == other.techniqueDefinitions &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(outputSignalName, techniqueDefinitions, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Ttp{outputSignalName=$outputSignalName, techniqueDefinitions=$techniqueDefinitions, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RfEmitterDetail &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                idRfEmitter == other.idRfEmitter &&
                source == other.source &&
                id == other.id &&
                alternateFacilityName == other.alternateFacilityName &&
                altName == other.altName &&
                amplifier == other.amplifier &&
                antennas == other.antennas &&
                barrageNoiseBandwidth == other.barrageNoiseBandwidth &&
                bitRunTime == other.bitRunTime &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                description == other.description &&
                designator == other.designator &&
                dopplerNoise == other.dopplerNoise &&
                drfmInstantaneousBandwidth == other.drfmInstantaneousBandwidth &&
                family == other.family &&
                fixedAttenuation == other.fixedAttenuation &&
                idManufacturerOrg == other.idManufacturerOrg &&
                idProductionFacilityLocation == other.idProductionFacilityLocation &&
                loanedToCocom == other.loanedToCocom &&
                notes == other.notes &&
                numBits == other.numBits &&
                numChannels == other.numChannels &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                powerOffsets == other.powerOffsets &&
                prepTime == other.prepTime &&
                primaryCocom == other.primaryCocom &&
                productionFacilityName == other.productionFacilityName &&
                receiverType == other.receiverType &&
                secondaryNotes == other.secondaryNotes &&
                services == other.services &&
                systemSensitivityEnd == other.systemSensitivityEnd &&
                systemSensitivityStart == other.systemSensitivityStart &&
                ttps == other.ttps &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy &&
                urls == other.urls &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                idRfEmitter,
                source,
                id,
                alternateFacilityName,
                altName,
                amplifier,
                antennas,
                barrageNoiseBandwidth,
                bitRunTime,
                createdAt,
                createdBy,
                description,
                designator,
                dopplerNoise,
                drfmInstantaneousBandwidth,
                family,
                fixedAttenuation,
                idManufacturerOrg,
                idProductionFacilityLocation,
                loanedToCocom,
                notes,
                numBits,
                numChannels,
                origin,
                origNetwork,
                powerOffsets,
                prepTime,
                primaryCocom,
                productionFacilityName,
                receiverType,
                secondaryNotes,
                services,
                systemSensitivityEnd,
                systemSensitivityStart,
                ttps,
                updatedAt,
                updatedBy,
                urls,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RfEmitterDetail{classificationMarking=$classificationMarking, dataMode=$dataMode, idRfEmitter=$idRfEmitter, source=$source, id=$id, alternateFacilityName=$alternateFacilityName, altName=$altName, amplifier=$amplifier, antennas=$antennas, barrageNoiseBandwidth=$barrageNoiseBandwidth, bitRunTime=$bitRunTime, createdAt=$createdAt, createdBy=$createdBy, description=$description, designator=$designator, dopplerNoise=$dopplerNoise, drfmInstantaneousBandwidth=$drfmInstantaneousBandwidth, family=$family, fixedAttenuation=$fixedAttenuation, idManufacturerOrg=$idManufacturerOrg, idProductionFacilityLocation=$idProductionFacilityLocation, loanedToCocom=$loanedToCocom, notes=$notes, numBits=$numBits, numChannels=$numChannels, origin=$origin, origNetwork=$origNetwork, powerOffsets=$powerOffsets, prepTime=$prepTime, primaryCocom=$primaryCocom, productionFacilityName=$productionFacilityName, receiverType=$receiverType, secondaryNotes=$secondaryNotes, services=$services, systemSensitivityEnd=$systemSensitivityEnd, systemSensitivityStart=$systemSensitivityStart, ttps=$ttps, updatedAt=$updatedAt, updatedBy=$updatedBy, urls=$urls, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RfEmitterGetResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            name == other.name &&
            source == other.source &&
            id == other.id &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            entity == other.entity &&
            extSysId == other.extSysId &&
            idEntity == other.idEntity &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            rfEmitterDetails == other.rfEmitterDetails &&
            subtype == other.subtype &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            name,
            source,
            id,
            createdAt,
            createdBy,
            entity,
            extSysId,
            idEntity,
            origin,
            origNetwork,
            rfEmitterDetails,
            subtype,
            type,
            updatedAt,
            updatedBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RfEmitterGetResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, name=$name, source=$source, id=$id, createdAt=$createdAt, createdBy=$createdBy, entity=$entity, extSysId=$extSysId, idEntity=$idEntity, origin=$origin, origNetwork=$origNetwork, rfEmitterDetails=$rfEmitterDetails, subtype=$subtype, type=$type, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

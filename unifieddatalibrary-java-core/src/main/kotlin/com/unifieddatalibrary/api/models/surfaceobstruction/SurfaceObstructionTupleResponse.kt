// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.surfaceobstruction

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

class SurfaceObstructionTupleResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idSurface: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val advisoryRequired: JsonField<List<String>>,
    private val approvalRequired: JsonField<List<String>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val distanceFromCenterLine: JsonField<Double>,
    private val distanceFromEdge: JsonField<Double>,
    private val distanceFromThreshold: JsonField<Double>,
    private val idNavigationalObstruction: JsonField<String>,
    private val obstructionDesc: JsonField<String>,
    private val obstructionHeight: JsonField<Double>,
    private val obstructionSideCode: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val sourceDl: JsonField<String>,
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
        @JsonProperty("idSurface") @ExcludeMissing idSurface: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("advisoryRequired")
        @ExcludeMissing
        advisoryRequired: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("approvalRequired")
        @ExcludeMissing
        approvalRequired: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("distanceFromCenterLine")
        @ExcludeMissing
        distanceFromCenterLine: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("distanceFromEdge")
        @ExcludeMissing
        distanceFromEdge: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("distanceFromThreshold")
        @ExcludeMissing
        distanceFromThreshold: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idNavigationalObstruction")
        @ExcludeMissing
        idNavigationalObstruction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("obstructionDesc")
        @ExcludeMissing
        obstructionDesc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("obstructionHeight")
        @ExcludeMissing
        obstructionHeight: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("obstructionSideCode")
        @ExcludeMissing
        obstructionSideCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idSurface,
        source,
        id,
        advisoryRequired,
        approvalRequired,
        createdAt,
        createdBy,
        distanceFromCenterLine,
        distanceFromEdge,
        distanceFromThreshold,
        idNavigationalObstruction,
        obstructionDesc,
        obstructionHeight,
        obstructionSideCode,
        origin,
        origNetwork,
        sourceDl,
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
     * Indicator of whether the data is REAL, TEST, SIMULATED, or EXERCISE data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * The unique identifier of the associated surface record. This field is required when posting,
     * updating, or deleting a SurfaceObstruction record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idSurface(): String = idSurface.getRequired("idSurface")

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
     * Array of all vehicles that are affected by this obstruction at the surface end-point, and
     * require an advisory for usage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun advisoryRequired(): Optional<List<String>> =
        advisoryRequired.getOptional("advisoryRequired")

    /**
     * Array of all vehicles that are affected by this obstruction at the surface end-point, and
     * require an approval for usage.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun approvalRequired(): Optional<List<String>> =
        approvalRequired.getOptional("approvalRequired")

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
     * The distance from the surface center line to this obstruction, in feet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun distanceFromCenterLine(): Optional<Double> =
        distanceFromCenterLine.getOptional("distanceFromCenterLine")

    /**
     * The distance from the surface edge to this obstruction, in feet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun distanceFromEdge(): Optional<Double> = distanceFromEdge.getOptional("distanceFromEdge")

    /**
     * The distance from the surface threshold to this obstruction, in feet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun distanceFromThreshold(): Optional<Double> =
        distanceFromThreshold.getOptional("distanceFromThreshold")

    /**
     * The unique identifier of the associated NavigationalObstruction record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idNavigationalObstruction(): Optional<String> =
        idNavigationalObstruction.getOptional("idNavigationalObstruction")

    /**
     * Description of this surface obstruction.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun obstructionDesc(): Optional<String> = obstructionDesc.getOptional("obstructionDesc")

    /**
     * The height above ground level of the surface obstruction, in feet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun obstructionHeight(): Optional<Double> = obstructionHeight.getOptional("obstructionHeight")

    /**
     * A code that indicates which side of the surface end is affected by this obstruction.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun obstructionSideCode(): Optional<String> =
        obstructionSideCode.getOptional("obstructionSideCode")

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
     * Returns the raw JSON value of [idSurface].
     *
     * Unlike [idSurface], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSurface") @ExcludeMissing fun _idSurface(): JsonField<String> = idSurface

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
     * Returns the raw JSON value of [advisoryRequired].
     *
     * Unlike [advisoryRequired], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("advisoryRequired")
    @ExcludeMissing
    fun _advisoryRequired(): JsonField<List<String>> = advisoryRequired

    /**
     * Returns the raw JSON value of [approvalRequired].
     *
     * Unlike [approvalRequired], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("approvalRequired")
    @ExcludeMissing
    fun _approvalRequired(): JsonField<List<String>> = approvalRequired

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
     * Returns the raw JSON value of [distanceFromCenterLine].
     *
     * Unlike [distanceFromCenterLine], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("distanceFromCenterLine")
    @ExcludeMissing
    fun _distanceFromCenterLine(): JsonField<Double> = distanceFromCenterLine

    /**
     * Returns the raw JSON value of [distanceFromEdge].
     *
     * Unlike [distanceFromEdge], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("distanceFromEdge")
    @ExcludeMissing
    fun _distanceFromEdge(): JsonField<Double> = distanceFromEdge

    /**
     * Returns the raw JSON value of [distanceFromThreshold].
     *
     * Unlike [distanceFromThreshold], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("distanceFromThreshold")
    @ExcludeMissing
    fun _distanceFromThreshold(): JsonField<Double> = distanceFromThreshold

    /**
     * Returns the raw JSON value of [idNavigationalObstruction].
     *
     * Unlike [idNavigationalObstruction], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("idNavigationalObstruction")
    @ExcludeMissing
    fun _idNavigationalObstruction(): JsonField<String> = idNavigationalObstruction

    /**
     * Returns the raw JSON value of [obstructionDesc].
     *
     * Unlike [obstructionDesc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obstructionDesc")
    @ExcludeMissing
    fun _obstructionDesc(): JsonField<String> = obstructionDesc

    /**
     * Returns the raw JSON value of [obstructionHeight].
     *
     * Unlike [obstructionHeight], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("obstructionHeight")
    @ExcludeMissing
    fun _obstructionHeight(): JsonField<Double> = obstructionHeight

    /**
     * Returns the raw JSON value of [obstructionSideCode].
     *
     * Unlike [obstructionSideCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("obstructionSideCode")
    @ExcludeMissing
    fun _obstructionSideCode(): JsonField<String> = obstructionSideCode

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
         * [SurfaceObstructionTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idSurface()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SurfaceObstructionTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idSurface: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var advisoryRequired: JsonField<MutableList<String>>? = null
        private var approvalRequired: JsonField<MutableList<String>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var distanceFromCenterLine: JsonField<Double> = JsonMissing.of()
        private var distanceFromEdge: JsonField<Double> = JsonMissing.of()
        private var distanceFromThreshold: JsonField<Double> = JsonMissing.of()
        private var idNavigationalObstruction: JsonField<String> = JsonMissing.of()
        private var obstructionDesc: JsonField<String> = JsonMissing.of()
        private var obstructionHeight: JsonField<Double> = JsonMissing.of()
        private var obstructionSideCode: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(surfaceObstructionTupleResponse: SurfaceObstructionTupleResponse) =
            apply {
                classificationMarking = surfaceObstructionTupleResponse.classificationMarking
                dataMode = surfaceObstructionTupleResponse.dataMode
                idSurface = surfaceObstructionTupleResponse.idSurface
                source = surfaceObstructionTupleResponse.source
                id = surfaceObstructionTupleResponse.id
                advisoryRequired =
                    surfaceObstructionTupleResponse.advisoryRequired.map { it.toMutableList() }
                approvalRequired =
                    surfaceObstructionTupleResponse.approvalRequired.map { it.toMutableList() }
                createdAt = surfaceObstructionTupleResponse.createdAt
                createdBy = surfaceObstructionTupleResponse.createdBy
                distanceFromCenterLine = surfaceObstructionTupleResponse.distanceFromCenterLine
                distanceFromEdge = surfaceObstructionTupleResponse.distanceFromEdge
                distanceFromThreshold = surfaceObstructionTupleResponse.distanceFromThreshold
                idNavigationalObstruction =
                    surfaceObstructionTupleResponse.idNavigationalObstruction
                obstructionDesc = surfaceObstructionTupleResponse.obstructionDesc
                obstructionHeight = surfaceObstructionTupleResponse.obstructionHeight
                obstructionSideCode = surfaceObstructionTupleResponse.obstructionSideCode
                origin = surfaceObstructionTupleResponse.origin
                origNetwork = surfaceObstructionTupleResponse.origNetwork
                sourceDl = surfaceObstructionTupleResponse.sourceDl
                updatedAt = surfaceObstructionTupleResponse.updatedAt
                updatedBy = surfaceObstructionTupleResponse.updatedBy
                additionalProperties =
                    surfaceObstructionTupleResponse.additionalProperties.toMutableMap()
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

        /** Indicator of whether the data is REAL, TEST, SIMULATED, or EXERCISE data. */
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
         * The unique identifier of the associated surface record. This field is required when
         * posting, updating, or deleting a SurfaceObstruction record.
         */
        fun idSurface(idSurface: String) = idSurface(JsonField.of(idSurface))

        /**
         * Sets [Builder.idSurface] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSurface] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idSurface(idSurface: JsonField<String>) = apply { this.idSurface = idSurface }

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
         * Array of all vehicles that are affected by this obstruction at the surface end-point, and
         * require an advisory for usage.
         */
        fun advisoryRequired(advisoryRequired: List<String>) =
            advisoryRequired(JsonField.of(advisoryRequired))

        /**
         * Sets [Builder.advisoryRequired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.advisoryRequired] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun advisoryRequired(advisoryRequired: JsonField<List<String>>) = apply {
            this.advisoryRequired = advisoryRequired.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.advisoryRequired].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdvisoryRequired(advisoryRequired: String) = apply {
            this.advisoryRequired =
                (this.advisoryRequired ?: JsonField.of(mutableListOf())).also {
                    checkKnown("advisoryRequired", it).add(advisoryRequired)
                }
        }

        /**
         * Array of all vehicles that are affected by this obstruction at the surface end-point, and
         * require an approval for usage.
         */
        fun approvalRequired(approvalRequired: List<String>) =
            approvalRequired(JsonField.of(approvalRequired))

        /**
         * Sets [Builder.approvalRequired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvalRequired] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approvalRequired(approvalRequired: JsonField<List<String>>) = apply {
            this.approvalRequired = approvalRequired.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.approvalRequired].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addApprovalRequired(approvalRequired: String) = apply {
            this.approvalRequired =
                (this.approvalRequired ?: JsonField.of(mutableListOf())).also {
                    checkKnown("approvalRequired", it).add(approvalRequired)
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

        /** The distance from the surface center line to this obstruction, in feet. */
        fun distanceFromCenterLine(distanceFromCenterLine: Double) =
            distanceFromCenterLine(JsonField.of(distanceFromCenterLine))

        /**
         * Sets [Builder.distanceFromCenterLine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distanceFromCenterLine] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun distanceFromCenterLine(distanceFromCenterLine: JsonField<Double>) = apply {
            this.distanceFromCenterLine = distanceFromCenterLine
        }

        /** The distance from the surface edge to this obstruction, in feet. */
        fun distanceFromEdge(distanceFromEdge: Double) =
            distanceFromEdge(JsonField.of(distanceFromEdge))

        /**
         * Sets [Builder.distanceFromEdge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distanceFromEdge] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun distanceFromEdge(distanceFromEdge: JsonField<Double>) = apply {
            this.distanceFromEdge = distanceFromEdge
        }

        /** The distance from the surface threshold to this obstruction, in feet. */
        fun distanceFromThreshold(distanceFromThreshold: Double) =
            distanceFromThreshold(JsonField.of(distanceFromThreshold))

        /**
         * Sets [Builder.distanceFromThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distanceFromThreshold] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun distanceFromThreshold(distanceFromThreshold: JsonField<Double>) = apply {
            this.distanceFromThreshold = distanceFromThreshold
        }

        /** The unique identifier of the associated NavigationalObstruction record. */
        fun idNavigationalObstruction(idNavigationalObstruction: String) =
            idNavigationalObstruction(JsonField.of(idNavigationalObstruction))

        /**
         * Sets [Builder.idNavigationalObstruction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idNavigationalObstruction] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun idNavigationalObstruction(idNavigationalObstruction: JsonField<String>) = apply {
            this.idNavigationalObstruction = idNavigationalObstruction
        }

        /** Description of this surface obstruction. */
        fun obstructionDesc(obstructionDesc: String) =
            obstructionDesc(JsonField.of(obstructionDesc))

        /**
         * Sets [Builder.obstructionDesc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obstructionDesc] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun obstructionDesc(obstructionDesc: JsonField<String>) = apply {
            this.obstructionDesc = obstructionDesc
        }

        /** The height above ground level of the surface obstruction, in feet. */
        fun obstructionHeight(obstructionHeight: Double) =
            obstructionHeight(JsonField.of(obstructionHeight))

        /**
         * Sets [Builder.obstructionHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obstructionHeight] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun obstructionHeight(obstructionHeight: JsonField<Double>) = apply {
            this.obstructionHeight = obstructionHeight
        }

        /** A code that indicates which side of the surface end is affected by this obstruction. */
        fun obstructionSideCode(obstructionSideCode: String) =
            obstructionSideCode(JsonField.of(obstructionSideCode))

        /**
         * Sets [Builder.obstructionSideCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obstructionSideCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun obstructionSideCode(obstructionSideCode: JsonField<String>) = apply {
            this.obstructionSideCode = obstructionSideCode
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
         * Returns an immutable instance of [SurfaceObstructionTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idSurface()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SurfaceObstructionTupleResponse =
            SurfaceObstructionTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idSurface", idSurface),
                checkRequired("source", source),
                id,
                (advisoryRequired ?: JsonMissing.of()).map { it.toImmutable() },
                (approvalRequired ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                createdBy,
                distanceFromCenterLine,
                distanceFromEdge,
                distanceFromThreshold,
                idNavigationalObstruction,
                obstructionDesc,
                obstructionHeight,
                obstructionSideCode,
                origin,
                origNetwork,
                sourceDl,
                updatedAt,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SurfaceObstructionTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idSurface()
        source()
        id()
        advisoryRequired()
        approvalRequired()
        createdAt()
        createdBy()
        distanceFromCenterLine()
        distanceFromEdge()
        distanceFromThreshold()
        idNavigationalObstruction()
        obstructionDesc()
        obstructionHeight()
        obstructionSideCode()
        origin()
        origNetwork()
        sourceDl()
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
            (if (idSurface.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (advisoryRequired.asKnown().getOrNull()?.size ?: 0) +
            (approvalRequired.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (distanceFromCenterLine.asKnown().isPresent) 1 else 0) +
            (if (distanceFromEdge.asKnown().isPresent) 1 else 0) +
            (if (distanceFromThreshold.asKnown().isPresent) 1 else 0) +
            (if (idNavigationalObstruction.asKnown().isPresent) 1 else 0) +
            (if (obstructionDesc.asKnown().isPresent) 1 else 0) +
            (if (obstructionHeight.asKnown().isPresent) 1 else 0) +
            (if (obstructionSideCode.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0)

    /** Indicator of whether the data is REAL, TEST, SIMULATED, or EXERCISE data. */
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

        return other is SurfaceObstructionTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            idSurface == other.idSurface &&
            source == other.source &&
            id == other.id &&
            advisoryRequired == other.advisoryRequired &&
            approvalRequired == other.approvalRequired &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            distanceFromCenterLine == other.distanceFromCenterLine &&
            distanceFromEdge == other.distanceFromEdge &&
            distanceFromThreshold == other.distanceFromThreshold &&
            idNavigationalObstruction == other.idNavigationalObstruction &&
            obstructionDesc == other.obstructionDesc &&
            obstructionHeight == other.obstructionHeight &&
            obstructionSideCode == other.obstructionSideCode &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            sourceDl == other.sourceDl &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            idSurface,
            source,
            id,
            advisoryRequired,
            approvalRequired,
            createdAt,
            createdBy,
            distanceFromCenterLine,
            distanceFromEdge,
            distanceFromThreshold,
            idNavigationalObstruction,
            obstructionDesc,
            obstructionHeight,
            obstructionSideCode,
            origin,
            origNetwork,
            sourceDl,
            updatedAt,
            updatedBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SurfaceObstructionTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, idSurface=$idSurface, source=$source, id=$id, advisoryRequired=$advisoryRequired, approvalRequired=$approvalRequired, createdAt=$createdAt, createdBy=$createdBy, distanceFromCenterLine=$distanceFromCenterLine, distanceFromEdge=$distanceFromEdge, distanceFromThreshold=$distanceFromThreshold, idNavigationalObstruction=$idNavigationalObstruction, obstructionDesc=$obstructionDesc, obstructionHeight=$obstructionHeight, obstructionSideCode=$obstructionSideCode, origin=$origin, origNetwork=$origNetwork, sourceDl=$sourceDl, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.geostatus

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

/**
 * Information for the specified on-orbit GEO spacecraft, including status, expected longitude
 * limits, and drift rates.
 */
class GeoStatusListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val confidenceLevel: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val idOnOrbit: JsonField<String>,
    private val longitudeMax: JsonField<Double>,
    private val longitudeMin: JsonField<Double>,
    private val longitudeRate: JsonField<Double>,
    private val lostFlag: JsonField<Boolean>,
    private val objectStatus: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val planeChangeStatus: JsonField<String>,
    private val rawFileUri: JsonField<String>,
    private val relativeEnergy: JsonField<Double>,
    private val satNo: JsonField<Int>,
    private val sc: JsonField<Double>,
    private val semiAnnualCorrFlag: JsonField<Boolean>,
    private val ss: JsonField<Double>,
    private val troughType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("confidenceLevel")
        @ExcludeMissing
        confidenceLevel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("longitudeMax")
        @ExcludeMissing
        longitudeMax: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("longitudeMin")
        @ExcludeMissing
        longitudeMin: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("longitudeRate")
        @ExcludeMissing
        longitudeRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lostFlag") @ExcludeMissing lostFlag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("objectStatus")
        @ExcludeMissing
        objectStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planeChangeStatus")
        @ExcludeMissing
        planeChangeStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rawFileURI")
        @ExcludeMissing
        rawFileUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("relativeEnergy")
        @ExcludeMissing
        relativeEnergy: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sc") @ExcludeMissing sc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("semiAnnualCorrFlag")
        @ExcludeMissing
        semiAnnualCorrFlag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ss") @ExcludeMissing ss: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("troughType") @ExcludeMissing troughType: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        id,
        confidenceLevel,
        createdAt,
        createdBy,
        idOnOrbit,
        longitudeMax,
        longitudeMin,
        longitudeRate,
        lostFlag,
        objectStatus,
        origin,
        origNetwork,
        origObjectId,
        planeChangeStatus,
        rawFileUri,
        relativeEnergy,
        satNo,
        sc,
        semiAnnualCorrFlag,
        ss,
        troughType,
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
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Indicates the confidence level in the entry. (Low, Medium, High).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun confidenceLevel(): Optional<String> = confidenceLevel.getOptional("confidenceLevel")

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
     * Unique identifier of the object on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Maximum longitude for this object. WGS-84 longitude of the spacecraft position, in degrees. 0
     * to 360 degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun longitudeMax(): Optional<Double> = longitudeMax.getOptional("longitudeMax")

    /**
     * Minimum longitude for this object. WGS-84 longitude of the spacecraft position, in degrees. 0
     * to 360 degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun longitudeMin(): Optional<Double> = longitudeMin.getOptional("longitudeMin")

    /**
     * Corrective or overriding long term trend for longitudinal change in degrees/day.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun longitudeRate(): Optional<Double> = longitudeRate.getOptional("longitudeRate")

    /**
     * Lost space object indicator. (True or False).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lostFlag(): Optional<Boolean> = lostFlag.getOptional("lostFlag")

    /**
     * Space object status. (Active, Dead, Unknown).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objectStatus(): Optional<String> = objectStatus.getOptional("objectStatus")

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
     * Optional identifier provided to indicate the target onorbit. This may be an internal
     * identifier and not necessarily map to a valid satellite number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Geosynchronous plane changing status. (Current, Never, Former, Future).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun planeChangeStatus(): Optional<String> = planeChangeStatus.getOptional("planeChangeStatus")

    /**
     * Optional URI location in the document repository of the raw file parsed by the system to
     * produce this record. To download the raw file, prepend https://udl-hostname/scs/download?id=
     * to this value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rawFileUri(): Optional<String> = rawFileUri.getOptional("rawFileURI")

    /**
     * Objects displacement from geostationary orbit in deg^2/day^2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun relativeEnergy(): Optional<Double> = relativeEnergy.getOptional("relativeEnergy")

    /**
     * Satellite/catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Sine of inclination times the cosine of right ascension.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sc(): Optional<Double> = sc.getOptional("sc")

    /**
     * Semi-annual correction. (True or False).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun semiAnnualCorrFlag(): Optional<Boolean> =
        semiAnnualCorrFlag.getOptional("semiAnnualCorrFlag")

    /**
     * Sine of inclination times the sine of right ascension.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ss(): Optional<Double> = ss.getOptional("ss")

    /**
     * Indicates the trough (gravity well) or drift direction of a space object:
     *
     * 255 - Influenced by 255° longitude trough.
     *
     * 75 - Influenced by 75° longitude trough.
     *
     * Both - Oscillating between both 255 and 75 troughs.
     *
     * East - Drifting eastward; large relative energy and a period less than 1436.1 minutes.
     *
     * West - Drifting westward; large relative energy and a period greater than 1436.2 minutes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun troughType(): Optional<String> = troughType.getOptional("troughType")

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [confidenceLevel].
     *
     * Unlike [confidenceLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confidenceLevel")
    @ExcludeMissing
    fun _confidenceLevel(): JsonField<String> = confidenceLevel

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
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [longitudeMax].
     *
     * Unlike [longitudeMax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("longitudeMax")
    @ExcludeMissing
    fun _longitudeMax(): JsonField<Double> = longitudeMax

    /**
     * Returns the raw JSON value of [longitudeMin].
     *
     * Unlike [longitudeMin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("longitudeMin")
    @ExcludeMissing
    fun _longitudeMin(): JsonField<Double> = longitudeMin

    /**
     * Returns the raw JSON value of [longitudeRate].
     *
     * Unlike [longitudeRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("longitudeRate")
    @ExcludeMissing
    fun _longitudeRate(): JsonField<Double> = longitudeRate

    /**
     * Returns the raw JSON value of [lostFlag].
     *
     * Unlike [lostFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lostFlag") @ExcludeMissing fun _lostFlag(): JsonField<Boolean> = lostFlag

    /**
     * Returns the raw JSON value of [objectStatus].
     *
     * Unlike [objectStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectStatus")
    @ExcludeMissing
    fun _objectStatus(): JsonField<String> = objectStatus

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
     * Returns the raw JSON value of [planeChangeStatus].
     *
     * Unlike [planeChangeStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("planeChangeStatus")
    @ExcludeMissing
    fun _planeChangeStatus(): JsonField<String> = planeChangeStatus

    /**
     * Returns the raw JSON value of [rawFileUri].
     *
     * Unlike [rawFileUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rawFileURI") @ExcludeMissing fun _rawFileUri(): JsonField<String> = rawFileUri

    /**
     * Returns the raw JSON value of [relativeEnergy].
     *
     * Unlike [relativeEnergy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("relativeEnergy")
    @ExcludeMissing
    fun _relativeEnergy(): JsonField<Double> = relativeEnergy

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [sc].
     *
     * Unlike [sc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sc") @ExcludeMissing fun _sc(): JsonField<Double> = sc

    /**
     * Returns the raw JSON value of [semiAnnualCorrFlag].
     *
     * Unlike [semiAnnualCorrFlag], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("semiAnnualCorrFlag")
    @ExcludeMissing
    fun _semiAnnualCorrFlag(): JsonField<Boolean> = semiAnnualCorrFlag

    /**
     * Returns the raw JSON value of [ss].
     *
     * Unlike [ss], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ss") @ExcludeMissing fun _ss(): JsonField<Double> = ss

    /**
     * Returns the raw JSON value of [troughType].
     *
     * Unlike [troughType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("troughType") @ExcludeMissing fun _troughType(): JsonField<String> = troughType

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
         * Returns a mutable builder for constructing an instance of [GeoStatusListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GeoStatusListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var confidenceLevel: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var longitudeMax: JsonField<Double> = JsonMissing.of()
        private var longitudeMin: JsonField<Double> = JsonMissing.of()
        private var longitudeRate: JsonField<Double> = JsonMissing.of()
        private var lostFlag: JsonField<Boolean> = JsonMissing.of()
        private var objectStatus: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var planeChangeStatus: JsonField<String> = JsonMissing.of()
        private var rawFileUri: JsonField<String> = JsonMissing.of()
        private var relativeEnergy: JsonField<Double> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var sc: JsonField<Double> = JsonMissing.of()
        private var semiAnnualCorrFlag: JsonField<Boolean> = JsonMissing.of()
        private var ss: JsonField<Double> = JsonMissing.of()
        private var troughType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(geoStatusListResponse: GeoStatusListResponse) = apply {
            classificationMarking = geoStatusListResponse.classificationMarking
            dataMode = geoStatusListResponse.dataMode
            source = geoStatusListResponse.source
            id = geoStatusListResponse.id
            confidenceLevel = geoStatusListResponse.confidenceLevel
            createdAt = geoStatusListResponse.createdAt
            createdBy = geoStatusListResponse.createdBy
            idOnOrbit = geoStatusListResponse.idOnOrbit
            longitudeMax = geoStatusListResponse.longitudeMax
            longitudeMin = geoStatusListResponse.longitudeMin
            longitudeRate = geoStatusListResponse.longitudeRate
            lostFlag = geoStatusListResponse.lostFlag
            objectStatus = geoStatusListResponse.objectStatus
            origin = geoStatusListResponse.origin
            origNetwork = geoStatusListResponse.origNetwork
            origObjectId = geoStatusListResponse.origObjectId
            planeChangeStatus = geoStatusListResponse.planeChangeStatus
            rawFileUri = geoStatusListResponse.rawFileUri
            relativeEnergy = geoStatusListResponse.relativeEnergy
            satNo = geoStatusListResponse.satNo
            sc = geoStatusListResponse.sc
            semiAnnualCorrFlag = geoStatusListResponse.semiAnnualCorrFlag
            ss = geoStatusListResponse.ss
            troughType = geoStatusListResponse.troughType
            additionalProperties = geoStatusListResponse.additionalProperties.toMutableMap()
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

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Indicates the confidence level in the entry. (Low, Medium, High). */
        fun confidenceLevel(confidenceLevel: String) =
            confidenceLevel(JsonField.of(confidenceLevel))

        /**
         * Sets [Builder.confidenceLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidenceLevel] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun confidenceLevel(confidenceLevel: JsonField<String>) = apply {
            this.confidenceLevel = confidenceLevel
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

        /** Unique identifier of the object on-orbit object. */
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
         * Maximum longitude for this object. WGS-84 longitude of the spacecraft position, in
         * degrees. 0 to 360 degrees.
         */
        fun longitudeMax(longitudeMax: Double) = longitudeMax(JsonField.of(longitudeMax))

        /**
         * Sets [Builder.longitudeMax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longitudeMax] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun longitudeMax(longitudeMax: JsonField<Double>) = apply {
            this.longitudeMax = longitudeMax
        }

        /**
         * Minimum longitude for this object. WGS-84 longitude of the spacecraft position, in
         * degrees. 0 to 360 degrees.
         */
        fun longitudeMin(longitudeMin: Double) = longitudeMin(JsonField.of(longitudeMin))

        /**
         * Sets [Builder.longitudeMin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longitudeMin] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun longitudeMin(longitudeMin: JsonField<Double>) = apply {
            this.longitudeMin = longitudeMin
        }

        /** Corrective or overriding long term trend for longitudinal change in degrees/day. */
        fun longitudeRate(longitudeRate: Double) = longitudeRate(JsonField.of(longitudeRate))

        /**
         * Sets [Builder.longitudeRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longitudeRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun longitudeRate(longitudeRate: JsonField<Double>) = apply {
            this.longitudeRate = longitudeRate
        }

        /** Lost space object indicator. (True or False). */
        fun lostFlag(lostFlag: Boolean) = lostFlag(JsonField.of(lostFlag))

        /**
         * Sets [Builder.lostFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lostFlag] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lostFlag(lostFlag: JsonField<Boolean>) = apply { this.lostFlag = lostFlag }

        /** Space object status. (Active, Dead, Unknown). */
        fun objectStatus(objectStatus: String) = objectStatus(JsonField.of(objectStatus))

        /**
         * Sets [Builder.objectStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectStatus(objectStatus: JsonField<String>) = apply {
            this.objectStatus = objectStatus
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
         * Optional identifier provided to indicate the target onorbit. This may be an internal
         * identifier and not necessarily map to a valid satellite number.
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

        /** Geosynchronous plane changing status. (Current, Never, Former, Future). */
        fun planeChangeStatus(planeChangeStatus: String) =
            planeChangeStatus(JsonField.of(planeChangeStatus))

        /**
         * Sets [Builder.planeChangeStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planeChangeStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun planeChangeStatus(planeChangeStatus: JsonField<String>) = apply {
            this.planeChangeStatus = planeChangeStatus
        }

        /**
         * Optional URI location in the document repository of the raw file parsed by the system to
         * produce this record. To download the raw file, prepend
         * https://udl-hostname/scs/download?id= to this value.
         */
        fun rawFileUri(rawFileUri: String) = rawFileUri(JsonField.of(rawFileUri))

        /**
         * Sets [Builder.rawFileUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawFileUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rawFileUri(rawFileUri: JsonField<String>) = apply { this.rawFileUri = rawFileUri }

        /** Objects displacement from geostationary orbit in deg^2/day^2. */
        fun relativeEnergy(relativeEnergy: Double) = relativeEnergy(JsonField.of(relativeEnergy))

        /**
         * Sets [Builder.relativeEnergy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relativeEnergy] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun relativeEnergy(relativeEnergy: JsonField<Double>) = apply {
            this.relativeEnergy = relativeEnergy
        }

        /** Satellite/catalog number of the target on-orbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /** Sine of inclination times the cosine of right ascension. */
        fun sc(sc: Double) = sc(JsonField.of(sc))

        /**
         * Sets [Builder.sc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sc(sc: JsonField<Double>) = apply { this.sc = sc }

        /** Semi-annual correction. (True or False). */
        fun semiAnnualCorrFlag(semiAnnualCorrFlag: Boolean) =
            semiAnnualCorrFlag(JsonField.of(semiAnnualCorrFlag))

        /**
         * Sets [Builder.semiAnnualCorrFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.semiAnnualCorrFlag] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun semiAnnualCorrFlag(semiAnnualCorrFlag: JsonField<Boolean>) = apply {
            this.semiAnnualCorrFlag = semiAnnualCorrFlag
        }

        /** Sine of inclination times the sine of right ascension. */
        fun ss(ss: Double) = ss(JsonField.of(ss))

        /**
         * Sets [Builder.ss] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ss] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ss(ss: JsonField<Double>) = apply { this.ss = ss }

        /**
         * Indicates the trough (gravity well) or drift direction of a space object:
         *
         * 255 - Influenced by 255° longitude trough.
         *
         * 75 - Influenced by 75° longitude trough.
         *
         * Both - Oscillating between both 255 and 75 troughs.
         *
         * East - Drifting eastward; large relative energy and a period less than 1436.1 minutes.
         *
         * West - Drifting westward; large relative energy and a period greater than 1436.2 minutes.
         */
        fun troughType(troughType: String) = troughType(JsonField.of(troughType))

        /**
         * Sets [Builder.troughType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.troughType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun troughType(troughType: JsonField<String>) = apply { this.troughType = troughType }

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
         * Returns an immutable instance of [GeoStatusListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GeoStatusListResponse =
            GeoStatusListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                id,
                confidenceLevel,
                createdAt,
                createdBy,
                idOnOrbit,
                longitudeMax,
                longitudeMin,
                longitudeRate,
                lostFlag,
                objectStatus,
                origin,
                origNetwork,
                origObjectId,
                planeChangeStatus,
                rawFileUri,
                relativeEnergy,
                satNo,
                sc,
                semiAnnualCorrFlag,
                ss,
                troughType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GeoStatusListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        id()
        confidenceLevel()
        createdAt()
        createdBy()
        idOnOrbit()
        longitudeMax()
        longitudeMin()
        longitudeRate()
        lostFlag()
        objectStatus()
        origin()
        origNetwork()
        origObjectId()
        planeChangeStatus()
        rawFileUri()
        relativeEnergy()
        satNo()
        sc()
        semiAnnualCorrFlag()
        ss()
        troughType()
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
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (confidenceLevel.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (longitudeMax.asKnown().isPresent) 1 else 0) +
            (if (longitudeMin.asKnown().isPresent) 1 else 0) +
            (if (longitudeRate.asKnown().isPresent) 1 else 0) +
            (if (lostFlag.asKnown().isPresent) 1 else 0) +
            (if (objectStatus.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (planeChangeStatus.asKnown().isPresent) 1 else 0) +
            (if (rawFileUri.asKnown().isPresent) 1 else 0) +
            (if (relativeEnergy.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (sc.asKnown().isPresent) 1 else 0) +
            (if (semiAnnualCorrFlag.asKnown().isPresent) 1 else 0) +
            (if (ss.asKnown().isPresent) 1 else 0) +
            (if (troughType.asKnown().isPresent) 1 else 0)

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

        return other is GeoStatusListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            id == other.id &&
            confidenceLevel == other.confidenceLevel &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            idOnOrbit == other.idOnOrbit &&
            longitudeMax == other.longitudeMax &&
            longitudeMin == other.longitudeMin &&
            longitudeRate == other.longitudeRate &&
            lostFlag == other.lostFlag &&
            objectStatus == other.objectStatus &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            planeChangeStatus == other.planeChangeStatus &&
            rawFileUri == other.rawFileUri &&
            relativeEnergy == other.relativeEnergy &&
            satNo == other.satNo &&
            sc == other.sc &&
            semiAnnualCorrFlag == other.semiAnnualCorrFlag &&
            ss == other.ss &&
            troughType == other.troughType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            source,
            id,
            confidenceLevel,
            createdAt,
            createdBy,
            idOnOrbit,
            longitudeMax,
            longitudeMin,
            longitudeRate,
            lostFlag,
            objectStatus,
            origin,
            origNetwork,
            origObjectId,
            planeChangeStatus,
            rawFileUri,
            relativeEnergy,
            satNo,
            sc,
            semiAnnualCorrFlag,
            ss,
            troughType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GeoStatusListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, id=$id, confidenceLevel=$confidenceLevel, createdAt=$createdAt, createdBy=$createdBy, idOnOrbit=$idOnOrbit, longitudeMax=$longitudeMax, longitudeMin=$longitudeMin, longitudeRate=$longitudeRate, lostFlag=$lostFlag, objectStatus=$objectStatus, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, planeChangeStatus=$planeChangeStatus, rawFileUri=$rawFileUri, relativeEnergy=$relativeEnergy, satNo=$satNo, sc=$sc, semiAnnualCorrFlag=$semiAnnualCorrFlag, ss=$ss, troughType=$troughType, additionalProperties=$additionalProperties}"
}

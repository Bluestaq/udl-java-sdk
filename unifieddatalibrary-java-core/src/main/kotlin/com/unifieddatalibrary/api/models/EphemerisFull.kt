// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

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
 * An ephemeris record is a position and velocity vector identifying the location and trajectory of
 * an on-orbit object at a specified time. Ephemeris points, including covariance, are in kilometer
 * and second based units in a user specified reference frame, with ECI J2K being preferred. The
 * EphemerisSet ID (esId) links all points associated with an ephemeris set. The 'EphemerisSet'
 * record contains details of the underlying data and propagation models used in the generation of
 * the ephemeris. Ephemeris points must be retrieved by specifying the parent EphemerisSet ID
 * (esId).
 */
class EphemerisFull
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val ts: JsonField<OffsetDateTime>,
    private val xpos: JsonField<Double>,
    private val xvel: JsonField<Double>,
    private val ypos: JsonField<Double>,
    private val yvel: JsonField<Double>,
    private val zpos: JsonField<Double>,
    private val zvel: JsonField<Double>,
    private val id: JsonField<String>,
    private val cov: JsonField<List<Double>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val esId: JsonField<String>,
    private val idOnOrbit: JsonField<String>,
    private val origin: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val xaccel: JsonField<Double>,
    private val yaccel: JsonField<Double>,
    private val zaccel: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ts") @ExcludeMissing ts: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("xpos") @ExcludeMissing xpos: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("xvel") @ExcludeMissing xvel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ypos") @ExcludeMissing ypos: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("yvel") @ExcludeMissing yvel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("zpos") @ExcludeMissing zpos: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("zvel") @ExcludeMissing zvel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cov") @ExcludeMissing cov: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("esId") @ExcludeMissing esId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("xaccel") @ExcludeMissing xaccel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("yaccel") @ExcludeMissing yaccel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("zaccel") @ExcludeMissing zaccel: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        ts,
        xpos,
        xvel,
        ypos,
        yvel,
        zpos,
        zvel,
        id,
        cov,
        createdAt,
        createdBy,
        esId,
        idOnOrbit,
        origin,
        origObjectId,
        xaccel,
        yaccel,
        zaccel,
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
     * Time associated with the Ephemeris Point, in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ts(): OffsetDateTime = ts.getRequired("ts")

    /**
     * Cartesian X position of target, in km, in the specified EphemerisSet referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun xpos(): Double = xpos.getRequired("xpos")

    /**
     * Cartesian X velocity of target, in km/sec, in the specified EphemerisSet referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun xvel(): Double = xvel.getRequired("xvel")

    /**
     * Cartesian Y position of target, in km, in the specified EphemerisSet referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ypos(): Double = ypos.getRequired("ypos")

    /**
     * Cartesian Y velocity of target, in km/sec, in the specified EphemerisSet referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun yvel(): Double = yvel.getRequired("yvel")

    /**
     * Cartesian Z position of target, in km, in the specified EphemerisSet referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun zpos(): Double = zpos.getRequired("zpos")

    /**
     * Cartesian Z velocity of target, in km/sec, in the specified EphemerisSet referenceFrame. If
     * referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun zvel(): Double = zvel.getRequired("zvel")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Covariance matrix, in kilometer and second based units, in the specified Ephemeris Set
     * covReferenceFrame. If the covReferenceFrame from the EphemerisSet table is null it is assumed
     * to be J2000. The array values represent the lower triangular half of the position-velocity
     * covariance matrix. The size of the covariance matrix is dynamic, depending on whether the
     * covariance for position only or position & velocity. The covariance elements are position
     * dependent within the array with values ordered as follows:
     *
     * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;y&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;y'&nbsp;z'&nbsp;&nbsp;
     *
     * x&nbsp;&nbsp;&nbsp;&nbsp;1
     *
     * y&nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;3
     *
     * z&nbsp;&nbsp;&nbsp;&nbsp;4&nbsp;&nbsp;&nbsp;5&nbsp;&nbsp;&nbsp;6
     *
     * x'&nbsp;&nbsp;&nbsp;7&nbsp;&nbsp;&nbsp;8&nbsp;&nbsp;&nbsp;9&nbsp;&nbsp;10
     *
     * y'&nbsp;&nbsp;11&nbsp;&nbsp;12&nbsp;&nbsp;13&nbsp;&nbsp;14&nbsp;&nbsp;15
     *
     * z'&nbsp;&nbsp;16&nbsp;&nbsp;17&nbsp;&nbsp;18&nbsp;&nbsp;19&nbsp;&nbsp;20&nbsp;&nbsp; 21
     *
     * The array containing the covariance matrix elements will be of length 6 for position only
     * covariance, or length 21 for position-velocity covariance. The cov array should contain only
     * the lower left triangle values from top left down to bottom right, in order.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cov(): Optional<List<Double>> = cov.getOptional("cov")

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
     * Unique identifier of the parent EphemerisSet, auto-generated by the system. The esId
     * (ephemerisSet id) is used to identify all individual ephemeris states associated with a
     * parent ephemerisSet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun esId(): Optional<String> = esId.getOptional("esId")

    /**
     * Unique identifier of the on-orbit satellite object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

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
     * Optional identifier provided by ephemeris source to indicate the target object of this
     * ephemeris. This may be an internal identifier and not necessarily map to a valid satellite
     * number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Cartesian X acceleration of target, in km/sec^2, in the specified EphemerisSet
     * referenceFrame. If referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun xaccel(): Optional<Double> = xaccel.getOptional("xaccel")

    /**
     * Cartesian Y acceleration of target, in km/sec^2, in the specified EphemerisSet
     * referenceFrame. If referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yaccel(): Optional<Double> = yaccel.getOptional("yaccel")

    /**
     * Cartesian Z acceleration of target, in km/sec^2, in the specified EphemerisSet
     * referenceFrame. If referenceFrame is null then J2K should be assumed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zaccel(): Optional<Double> = zaccel.getOptional("zaccel")

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
     * Returns the raw JSON value of [ts].
     *
     * Unlike [ts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ts") @ExcludeMissing fun _ts(): JsonField<OffsetDateTime> = ts

    /**
     * Returns the raw JSON value of [xpos].
     *
     * Unlike [xpos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xpos") @ExcludeMissing fun _xpos(): JsonField<Double> = xpos

    /**
     * Returns the raw JSON value of [xvel].
     *
     * Unlike [xvel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xvel") @ExcludeMissing fun _xvel(): JsonField<Double> = xvel

    /**
     * Returns the raw JSON value of [ypos].
     *
     * Unlike [ypos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ypos") @ExcludeMissing fun _ypos(): JsonField<Double> = ypos

    /**
     * Returns the raw JSON value of [yvel].
     *
     * Unlike [yvel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yvel") @ExcludeMissing fun _yvel(): JsonField<Double> = yvel

    /**
     * Returns the raw JSON value of [zpos].
     *
     * Unlike [zpos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zpos") @ExcludeMissing fun _zpos(): JsonField<Double> = zpos

    /**
     * Returns the raw JSON value of [zvel].
     *
     * Unlike [zvel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zvel") @ExcludeMissing fun _zvel(): JsonField<Double> = zvel

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [cov].
     *
     * Unlike [cov], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cov") @ExcludeMissing fun _cov(): JsonField<List<Double>> = cov

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
     * Returns the raw JSON value of [esId].
     *
     * Unlike [esId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("esId") @ExcludeMissing fun _esId(): JsonField<String> = esId

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<String> = origin

    /**
     * Returns the raw JSON value of [origObjectId].
     *
     * Unlike [origObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origObjectId")
    @ExcludeMissing
    fun _origObjectId(): JsonField<String> = origObjectId

    /**
     * Returns the raw JSON value of [xaccel].
     *
     * Unlike [xaccel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xaccel") @ExcludeMissing fun _xaccel(): JsonField<Double> = xaccel

    /**
     * Returns the raw JSON value of [yaccel].
     *
     * Unlike [yaccel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yaccel") @ExcludeMissing fun _yaccel(): JsonField<Double> = yaccel

    /**
     * Returns the raw JSON value of [zaccel].
     *
     * Unlike [zaccel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zaccel") @ExcludeMissing fun _zaccel(): JsonField<Double> = zaccel

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
         * Returns a mutable builder for constructing an instance of [EphemerisFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .ts()
         * .xpos()
         * .xvel()
         * .ypos()
         * .yvel()
         * .zpos()
         * .zvel()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EphemerisFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var ts: JsonField<OffsetDateTime>? = null
        private var xpos: JsonField<Double>? = null
        private var xvel: JsonField<Double>? = null
        private var ypos: JsonField<Double>? = null
        private var yvel: JsonField<Double>? = null
        private var zpos: JsonField<Double>? = null
        private var zvel: JsonField<Double>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var cov: JsonField<MutableList<Double>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var esId: JsonField<String> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var xaccel: JsonField<Double> = JsonMissing.of()
        private var yaccel: JsonField<Double> = JsonMissing.of()
        private var zaccel: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ephemerisFull: EphemerisFull) = apply {
            classificationMarking = ephemerisFull.classificationMarking
            dataMode = ephemerisFull.dataMode
            source = ephemerisFull.source
            ts = ephemerisFull.ts
            xpos = ephemerisFull.xpos
            xvel = ephemerisFull.xvel
            ypos = ephemerisFull.ypos
            yvel = ephemerisFull.yvel
            zpos = ephemerisFull.zpos
            zvel = ephemerisFull.zvel
            id = ephemerisFull.id
            cov = ephemerisFull.cov.map { it.toMutableList() }
            createdAt = ephemerisFull.createdAt
            createdBy = ephemerisFull.createdBy
            esId = ephemerisFull.esId
            idOnOrbit = ephemerisFull.idOnOrbit
            origin = ephemerisFull.origin
            origObjectId = ephemerisFull.origObjectId
            xaccel = ephemerisFull.xaccel
            yaccel = ephemerisFull.yaccel
            zaccel = ephemerisFull.zaccel
            additionalProperties = ephemerisFull.additionalProperties.toMutableMap()
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

        /** Time associated with the Ephemeris Point, in ISO8601 UTC format. */
        fun ts(ts: OffsetDateTime) = ts(JsonField.of(ts))

        /**
         * Sets [Builder.ts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ts] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ts(ts: JsonField<OffsetDateTime>) = apply { this.ts = ts }

        /**
         * Cartesian X position of target, in km, in the specified EphemerisSet referenceFrame. If
         * referenceFrame is null then J2K should be assumed.
         */
        fun xpos(xpos: Double) = xpos(JsonField.of(xpos))

        /**
         * Sets [Builder.xpos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xpos] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun xpos(xpos: JsonField<Double>) = apply { this.xpos = xpos }

        /**
         * Cartesian X velocity of target, in km/sec, in the specified EphemerisSet referenceFrame.
         * If referenceFrame is null then J2K should be assumed.
         */
        fun xvel(xvel: Double) = xvel(JsonField.of(xvel))

        /**
         * Sets [Builder.xvel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xvel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun xvel(xvel: JsonField<Double>) = apply { this.xvel = xvel }

        /**
         * Cartesian Y position of target, in km, in the specified EphemerisSet referenceFrame. If
         * referenceFrame is null then J2K should be assumed.
         */
        fun ypos(ypos: Double) = ypos(JsonField.of(ypos))

        /**
         * Sets [Builder.ypos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ypos] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ypos(ypos: JsonField<Double>) = apply { this.ypos = ypos }

        /**
         * Cartesian Y velocity of target, in km/sec, in the specified EphemerisSet referenceFrame.
         * If referenceFrame is null then J2K should be assumed.
         */
        fun yvel(yvel: Double) = yvel(JsonField.of(yvel))

        /**
         * Sets [Builder.yvel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yvel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yvel(yvel: JsonField<Double>) = apply { this.yvel = yvel }

        /**
         * Cartesian Z position of target, in km, in the specified EphemerisSet referenceFrame. If
         * referenceFrame is null then J2K should be assumed.
         */
        fun zpos(zpos: Double) = zpos(JsonField.of(zpos))

        /**
         * Sets [Builder.zpos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zpos] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zpos(zpos: JsonField<Double>) = apply { this.zpos = zpos }

        /**
         * Cartesian Z velocity of target, in km/sec, in the specified EphemerisSet referenceFrame.
         * If referenceFrame is null then J2K should be assumed.
         */
        fun zvel(zvel: Double) = zvel(JsonField.of(zvel))

        /**
         * Sets [Builder.zvel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zvel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zvel(zvel: JsonField<Double>) = apply { this.zvel = zvel }

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
         * Covariance matrix, in kilometer and second based units, in the specified Ephemeris Set
         * covReferenceFrame. If the covReferenceFrame from the EphemerisSet table is null it is
         * assumed to be J2000. The array values represent the lower triangular half of the
         * position-velocity covariance matrix. The size of the covariance matrix is dynamic,
         * depending on whether the covariance for position only or position & velocity. The
         * covariance elements are position dependent within the array with values ordered as
         * follows:
         *
         * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;y&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;y'&nbsp;z'&nbsp;&nbsp;
         *
         * x&nbsp;&nbsp;&nbsp;&nbsp;1
         *
         * y&nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;3
         *
         * z&nbsp;&nbsp;&nbsp;&nbsp;4&nbsp;&nbsp;&nbsp;5&nbsp;&nbsp;&nbsp;6
         *
         * x'&nbsp;&nbsp;&nbsp;7&nbsp;&nbsp;&nbsp;8&nbsp;&nbsp;&nbsp;9&nbsp;&nbsp;10
         *
         * y'&nbsp;&nbsp;11&nbsp;&nbsp;12&nbsp;&nbsp;13&nbsp;&nbsp;14&nbsp;&nbsp;15
         *
         * z'&nbsp;&nbsp;16&nbsp;&nbsp;17&nbsp;&nbsp;18&nbsp;&nbsp;19&nbsp;&nbsp;20&nbsp;&nbsp; 21
         *
         * The array containing the covariance matrix elements will be of length 6 for position only
         * covariance, or length 21 for position-velocity covariance. The cov array should contain
         * only the lower left triangle values from top left down to bottom right, in order.
         */
        fun cov(cov: List<Double>) = cov(JsonField.of(cov))

        /**
         * Sets [Builder.cov] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cov] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cov(cov: JsonField<List<Double>>) = apply { this.cov = cov.map { it.toMutableList() } }

        /**
         * Adds a single [Double] to [Builder.cov].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCov(cov: Double) = apply {
            this.cov =
                (this.cov ?: JsonField.of(mutableListOf())).also { checkKnown("cov", it).add(cov) }
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
         * Unique identifier of the parent EphemerisSet, auto-generated by the system. The esId
         * (ephemerisSet id) is used to identify all individual ephemeris states associated with a
         * parent ephemerisSet.
         */
        fun esId(esId: String) = esId(JsonField.of(esId))

        /**
         * Sets [Builder.esId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.esId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun esId(esId: JsonField<String>) = apply { this.esId = esId }

        /** Unique identifier of the on-orbit satellite object. */
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
         * Optional identifier provided by ephemeris source to indicate the target object of this
         * ephemeris. This may be an internal identifier and not necessarily map to a valid
         * satellite number.
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
         * Cartesian X acceleration of target, in km/sec^2, in the specified EphemerisSet
         * referenceFrame. If referenceFrame is null then J2K should be assumed.
         */
        fun xaccel(xaccel: Double) = xaccel(JsonField.of(xaccel))

        /**
         * Sets [Builder.xaccel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xaccel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun xaccel(xaccel: JsonField<Double>) = apply { this.xaccel = xaccel }

        /**
         * Cartesian Y acceleration of target, in km/sec^2, in the specified EphemerisSet
         * referenceFrame. If referenceFrame is null then J2K should be assumed.
         */
        fun yaccel(yaccel: Double) = yaccel(JsonField.of(yaccel))

        /**
         * Sets [Builder.yaccel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yaccel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yaccel(yaccel: JsonField<Double>) = apply { this.yaccel = yaccel }

        /**
         * Cartesian Z acceleration of target, in km/sec^2, in the specified EphemerisSet
         * referenceFrame. If referenceFrame is null then J2K should be assumed.
         */
        fun zaccel(zaccel: Double) = zaccel(JsonField.of(zaccel))

        /**
         * Sets [Builder.zaccel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zaccel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zaccel(zaccel: JsonField<Double>) = apply { this.zaccel = zaccel }

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
         * Returns an immutable instance of [EphemerisFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .ts()
         * .xpos()
         * .xvel()
         * .ypos()
         * .yvel()
         * .zpos()
         * .zvel()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EphemerisFull =
            EphemerisFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                checkRequired("ts", ts),
                checkRequired("xpos", xpos),
                checkRequired("xvel", xvel),
                checkRequired("ypos", ypos),
                checkRequired("yvel", yvel),
                checkRequired("zpos", zpos),
                checkRequired("zvel", zvel),
                id,
                (cov ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                createdBy,
                esId,
                idOnOrbit,
                origin,
                origObjectId,
                xaccel,
                yaccel,
                zaccel,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EphemerisFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        ts()
        xpos()
        xvel()
        ypos()
        yvel()
        zpos()
        zvel()
        id()
        cov()
        createdAt()
        createdBy()
        esId()
        idOnOrbit()
        origin()
        origObjectId()
        xaccel()
        yaccel()
        zaccel()
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
            (if (ts.asKnown().isPresent) 1 else 0) +
            (if (xpos.asKnown().isPresent) 1 else 0) +
            (if (xvel.asKnown().isPresent) 1 else 0) +
            (if (ypos.asKnown().isPresent) 1 else 0) +
            (if (yvel.asKnown().isPresent) 1 else 0) +
            (if (zpos.asKnown().isPresent) 1 else 0) +
            (if (zvel.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (cov.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (esId.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (xaccel.asKnown().isPresent) 1 else 0) +
            (if (yaccel.asKnown().isPresent) 1 else 0) +
            (if (zaccel.asKnown().isPresent) 1 else 0)

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

        return other is EphemerisFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            ts == other.ts &&
            xpos == other.xpos &&
            xvel == other.xvel &&
            ypos == other.ypos &&
            yvel == other.yvel &&
            zpos == other.zpos &&
            zvel == other.zvel &&
            id == other.id &&
            cov == other.cov &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            esId == other.esId &&
            idOnOrbit == other.idOnOrbit &&
            origin == other.origin &&
            origObjectId == other.origObjectId &&
            xaccel == other.xaccel &&
            yaccel == other.yaccel &&
            zaccel == other.zaccel &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            source,
            ts,
            xpos,
            xvel,
            ypos,
            yvel,
            zpos,
            zvel,
            id,
            cov,
            createdAt,
            createdBy,
            esId,
            idOnOrbit,
            origin,
            origObjectId,
            xaccel,
            yaccel,
            zaccel,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EphemerisFull{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, ts=$ts, xpos=$xpos, xvel=$xvel, ypos=$ypos, yvel=$yvel, zpos=$zpos, zvel=$zvel, id=$id, cov=$cov, createdAt=$createdAt, createdBy=$createdBy, esId=$esId, idOnOrbit=$idOnOrbit, origin=$origin, origObjectId=$origObjectId, xaccel=$xaccel, yaccel=$yaccel, zaccel=$zaccel, additionalProperties=$additionalProperties}"
}

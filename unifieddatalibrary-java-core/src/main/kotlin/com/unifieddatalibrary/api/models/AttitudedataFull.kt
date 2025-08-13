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
 * These services provide operations for posting and querying attitude of on-orbit objects. Attitude
 * describes the orientation of an object, which can be represented by quaternions or euler angles.
 * The AttitudeSet ID (asId) identifies the 'AttitudeSet' record which contains details of the
 * underlying data as well as a collection of attitude points. Points must be retrieved by first
 * identifying a desired AttitudeSet and pulling its points by that AttitudeSet ID 'asId'.
 */
class AttitudedataFull
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val ts: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val asId: JsonField<String>,
    private val coningAngle: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val declination: JsonField<Double>,
    private val idOnOrbit: JsonField<String>,
    private val motionType: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val precPeriod: JsonField<Double>,
    private val q1: JsonField<Double>,
    private val q1Dot: JsonField<Double>,
    private val q2: JsonField<Double>,
    private val q2Dot: JsonField<Double>,
    private val q3: JsonField<Double>,
    private val q3Dot: JsonField<Double>,
    private val qc: JsonField<Double>,
    private val qcDot: JsonField<Double>,
    private val ra: JsonField<Double>,
    private val satNo: JsonField<Int>,
    private val spinPeriod: JsonField<Double>,
    private val xAngle: JsonField<List<Double>>,
    private val xRate: JsonField<List<Double>>,
    private val yAngle: JsonField<List<Double>>,
    private val yRate: JsonField<List<Double>>,
    private val zAngle: JsonField<List<Double>>,
    private val zRate: JsonField<List<Double>>,
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
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("asId") @ExcludeMissing asId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("coningAngle")
        @ExcludeMissing
        coningAngle: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("declination")
        @ExcludeMissing
        declination: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("motionType")
        @ExcludeMissing
        motionType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("precPeriod")
        @ExcludeMissing
        precPeriod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("q1") @ExcludeMissing q1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("q1Dot") @ExcludeMissing q1Dot: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("q2") @ExcludeMissing q2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("q2Dot") @ExcludeMissing q2Dot: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("q3") @ExcludeMissing q3: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("q3Dot") @ExcludeMissing q3Dot: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("qc") @ExcludeMissing qc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("qcDot") @ExcludeMissing qcDot: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ra") @ExcludeMissing ra: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("spinPeriod")
        @ExcludeMissing
        spinPeriod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("xAngle") @ExcludeMissing xAngle: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("xRate") @ExcludeMissing xRate: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("yAngle") @ExcludeMissing yAngle: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("yRate") @ExcludeMissing yRate: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("zAngle") @ExcludeMissing zAngle: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("zRate") @ExcludeMissing zRate: JsonField<List<Double>> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        ts,
        id,
        asId,
        coningAngle,
        createdAt,
        createdBy,
        declination,
        idOnOrbit,
        motionType,
        origin,
        origNetwork,
        origObjectId,
        precPeriod,
        q1,
        q1Dot,
        q2,
        q2Dot,
        q3,
        q3Dot,
        qc,
        qcDot,
        ra,
        satNo,
        spinPeriod,
        xAngle,
        xRate,
        yAngle,
        yRate,
        zAngle,
        zRate,
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
     * Time associated with this attitude record, in ISO 8601 UTC format, with microsecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ts(): OffsetDateTime = ts.getRequired("ts")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Unique identifier of the parent AttitudeSet associated with this record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun asId(): Optional<String> = asId.getOptional("asId")

    /**
     * Coning angle in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coningAngle(): Optional<Double> = coningAngle.getOptional("coningAngle")

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
     * Precession axis declination (ECI J2000 frame) in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun declination(): Optional<Double> = declination.getOptional("declination")

    /**
     * Unique identifier of the on-orbit satellite to which this attitude record applies.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Label specifying type of rotational motion of target.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun motionType(): Optional<String> = motionType.getOptional("motionType")

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
     * Optional identifier provided by the record source to indicate the target object of this
     * attitude record. This may be an internal identifier and not necessarily map to a valid
     * satellite number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Precession period in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun precPeriod(): Optional<Double> = precPeriod.getOptional("precPeriod")

    /**
     * Quaternion vector component 1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun q1(): Optional<Double> = q1.getOptional("q1")

    /**
     * Derivative of quaternion vector component 1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun q1Dot(): Optional<Double> = q1Dot.getOptional("q1Dot")

    /**
     * Quaternion vector component 2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun q2(): Optional<Double> = q2.getOptional("q2")

    /**
     * Derivative of quaternion vector component 2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun q2Dot(): Optional<Double> = q2Dot.getOptional("q2Dot")

    /**
     * Quaternion vector component 3.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun q3(): Optional<Double> = q3.getOptional("q3")

    /**
     * Derivative of quaternion vector component 3.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun q3Dot(): Optional<Double> = q3Dot.getOptional("q3Dot")

    /**
     * Quaternion scalar component.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun qc(): Optional<Double> = qc.getOptional("qc")

    /**
     * Derivative of quaternion scalar component.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun qcDot(): Optional<Double> = qcDot.getOptional("qcDot")

    /**
     * Precession axis right ascension (ECI J2000 frame) in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ra(): Optional<Double> = ra.getOptional("ra")

    /**
     * Satellite/catalog number of the on-orbit object to which this attitude record applies.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Spin period in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spinPeriod(): Optional<Double> = spinPeriod.getOptional("spinPeriod")

    /**
     * Array of X body rotation Euler angle(s), in degrees (-180 to 180). For repeated axis
     * rotations, the array elements should be placed in the order that the angles apply in the
     * sequence.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun xAngle(): Optional<List<Double>> = xAngle.getOptional("xAngle")

    /**
     * Array of X body rotation rate(s), in degrees per second. For repeated axis rotations, the
     * array elements should be placed in the order that the rates apply in the sequence. Attitude
     * rates are expressed in frame1 with respect to frame2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun xRate(): Optional<List<Double>> = xRate.getOptional("xRate")

    /**
     * Array of Y body rotation Euler angle(s), in degrees (-180 to 180). For repeated axis
     * rotations, the array elements should be placed in the order that the angles apply in the
     * sequence.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yAngle(): Optional<List<Double>> = yAngle.getOptional("yAngle")

    /**
     * Array of Y body rotation rate(s), in degrees per second. For repeated axis rotations, the
     * array elements should be placed in the order that the rates apply in the sequence. Attitude
     * rates are expressed in frame1 with respect to frame2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yRate(): Optional<List<Double>> = yRate.getOptional("yRate")

    /**
     * Array of Z body rotation Euler angle(s), in degrees (-180 to 180). For repeated axis
     * rotations, the array elements should be placed in the order that the angles apply in the
     * sequence.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zAngle(): Optional<List<Double>> = zAngle.getOptional("zAngle")

    /**
     * Array of Z body rotation rate(s), in degrees per second. For repeated axis rotations, the
     * array elements should be placed in the order that the rates apply in the sequence Attitude
     * rates are expressed in frame1 with respect to frame2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zRate(): Optional<List<Double>> = zRate.getOptional("zRate")

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [asId].
     *
     * Unlike [asId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("asId") @ExcludeMissing fun _asId(): JsonField<String> = asId

    /**
     * Returns the raw JSON value of [coningAngle].
     *
     * Unlike [coningAngle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coningAngle") @ExcludeMissing fun _coningAngle(): JsonField<Double> = coningAngle

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
     * Returns the raw JSON value of [declination].
     *
     * Unlike [declination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("declination") @ExcludeMissing fun _declination(): JsonField<Double> = declination

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [motionType].
     *
     * Unlike [motionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("motionType") @ExcludeMissing fun _motionType(): JsonField<String> = motionType

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
     * Returns the raw JSON value of [precPeriod].
     *
     * Unlike [precPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("precPeriod") @ExcludeMissing fun _precPeriod(): JsonField<Double> = precPeriod

    /**
     * Returns the raw JSON value of [q1].
     *
     * Unlike [q1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("q1") @ExcludeMissing fun _q1(): JsonField<Double> = q1

    /**
     * Returns the raw JSON value of [q1Dot].
     *
     * Unlike [q1Dot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("q1Dot") @ExcludeMissing fun _q1Dot(): JsonField<Double> = q1Dot

    /**
     * Returns the raw JSON value of [q2].
     *
     * Unlike [q2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("q2") @ExcludeMissing fun _q2(): JsonField<Double> = q2

    /**
     * Returns the raw JSON value of [q2Dot].
     *
     * Unlike [q2Dot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("q2Dot") @ExcludeMissing fun _q2Dot(): JsonField<Double> = q2Dot

    /**
     * Returns the raw JSON value of [q3].
     *
     * Unlike [q3], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("q3") @ExcludeMissing fun _q3(): JsonField<Double> = q3

    /**
     * Returns the raw JSON value of [q3Dot].
     *
     * Unlike [q3Dot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("q3Dot") @ExcludeMissing fun _q3Dot(): JsonField<Double> = q3Dot

    /**
     * Returns the raw JSON value of [qc].
     *
     * Unlike [qc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("qc") @ExcludeMissing fun _qc(): JsonField<Double> = qc

    /**
     * Returns the raw JSON value of [qcDot].
     *
     * Unlike [qcDot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("qcDot") @ExcludeMissing fun _qcDot(): JsonField<Double> = qcDot

    /**
     * Returns the raw JSON value of [ra].
     *
     * Unlike [ra], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ra") @ExcludeMissing fun _ra(): JsonField<Double> = ra

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [spinPeriod].
     *
     * Unlike [spinPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spinPeriod") @ExcludeMissing fun _spinPeriod(): JsonField<Double> = spinPeriod

    /**
     * Returns the raw JSON value of [xAngle].
     *
     * Unlike [xAngle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xAngle") @ExcludeMissing fun _xAngle(): JsonField<List<Double>> = xAngle

    /**
     * Returns the raw JSON value of [xRate].
     *
     * Unlike [xRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xRate") @ExcludeMissing fun _xRate(): JsonField<List<Double>> = xRate

    /**
     * Returns the raw JSON value of [yAngle].
     *
     * Unlike [yAngle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yAngle") @ExcludeMissing fun _yAngle(): JsonField<List<Double>> = yAngle

    /**
     * Returns the raw JSON value of [yRate].
     *
     * Unlike [yRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yRate") @ExcludeMissing fun _yRate(): JsonField<List<Double>> = yRate

    /**
     * Returns the raw JSON value of [zAngle].
     *
     * Unlike [zAngle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zAngle") @ExcludeMissing fun _zAngle(): JsonField<List<Double>> = zAngle

    /**
     * Returns the raw JSON value of [zRate].
     *
     * Unlike [zRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zRate") @ExcludeMissing fun _zRate(): JsonField<List<Double>> = zRate

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
         * Returns a mutable builder for constructing an instance of [AttitudedataFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .ts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AttitudedataFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var ts: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var asId: JsonField<String> = JsonMissing.of()
        private var coningAngle: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var declination: JsonField<Double> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var motionType: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var precPeriod: JsonField<Double> = JsonMissing.of()
        private var q1: JsonField<Double> = JsonMissing.of()
        private var q1Dot: JsonField<Double> = JsonMissing.of()
        private var q2: JsonField<Double> = JsonMissing.of()
        private var q2Dot: JsonField<Double> = JsonMissing.of()
        private var q3: JsonField<Double> = JsonMissing.of()
        private var q3Dot: JsonField<Double> = JsonMissing.of()
        private var qc: JsonField<Double> = JsonMissing.of()
        private var qcDot: JsonField<Double> = JsonMissing.of()
        private var ra: JsonField<Double> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var spinPeriod: JsonField<Double> = JsonMissing.of()
        private var xAngle: JsonField<MutableList<Double>>? = null
        private var xRate: JsonField<MutableList<Double>>? = null
        private var yAngle: JsonField<MutableList<Double>>? = null
        private var yRate: JsonField<MutableList<Double>>? = null
        private var zAngle: JsonField<MutableList<Double>>? = null
        private var zRate: JsonField<MutableList<Double>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(attitudedataFull: AttitudedataFull) = apply {
            classificationMarking = attitudedataFull.classificationMarking
            dataMode = attitudedataFull.dataMode
            source = attitudedataFull.source
            ts = attitudedataFull.ts
            id = attitudedataFull.id
            asId = attitudedataFull.asId
            coningAngle = attitudedataFull.coningAngle
            createdAt = attitudedataFull.createdAt
            createdBy = attitudedataFull.createdBy
            declination = attitudedataFull.declination
            idOnOrbit = attitudedataFull.idOnOrbit
            motionType = attitudedataFull.motionType
            origin = attitudedataFull.origin
            origNetwork = attitudedataFull.origNetwork
            origObjectId = attitudedataFull.origObjectId
            precPeriod = attitudedataFull.precPeriod
            q1 = attitudedataFull.q1
            q1Dot = attitudedataFull.q1Dot
            q2 = attitudedataFull.q2
            q2Dot = attitudedataFull.q2Dot
            q3 = attitudedataFull.q3
            q3Dot = attitudedataFull.q3Dot
            qc = attitudedataFull.qc
            qcDot = attitudedataFull.qcDot
            ra = attitudedataFull.ra
            satNo = attitudedataFull.satNo
            spinPeriod = attitudedataFull.spinPeriod
            xAngle = attitudedataFull.xAngle.map { it.toMutableList() }
            xRate = attitudedataFull.xRate.map { it.toMutableList() }
            yAngle = attitudedataFull.yAngle.map { it.toMutableList() }
            yRate = attitudedataFull.yRate.map { it.toMutableList() }
            zAngle = attitudedataFull.zAngle.map { it.toMutableList() }
            zRate = attitudedataFull.zRate.map { it.toMutableList() }
            additionalProperties = attitudedataFull.additionalProperties.toMutableMap()
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

        /**
         * Time associated with this attitude record, in ISO 8601 UTC format, with microsecond
         * precision.
         */
        fun ts(ts: OffsetDateTime) = ts(JsonField.of(ts))

        /**
         * Sets [Builder.ts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ts] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ts(ts: JsonField<OffsetDateTime>) = apply { this.ts = ts }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Unique identifier of the parent AttitudeSet associated with this record. */
        fun asId(asId: String) = asId(JsonField.of(asId))

        /**
         * Sets [Builder.asId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun asId(asId: JsonField<String>) = apply { this.asId = asId }

        /** Coning angle in degrees. */
        fun coningAngle(coningAngle: Double) = coningAngle(JsonField.of(coningAngle))

        /**
         * Sets [Builder.coningAngle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coningAngle] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun coningAngle(coningAngle: JsonField<Double>) = apply { this.coningAngle = coningAngle }

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

        /** Precession axis declination (ECI J2000 frame) in degrees. */
        fun declination(declination: Double) = declination(JsonField.of(declination))

        /**
         * Sets [Builder.declination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declination] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun declination(declination: JsonField<Double>) = apply { this.declination = declination }

        /** Unique identifier of the on-orbit satellite to which this attitude record applies. */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /** Label specifying type of rotational motion of target. */
        fun motionType(motionType: String) = motionType(JsonField.of(motionType))

        /**
         * Sets [Builder.motionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.motionType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun motionType(motionType: JsonField<String>) = apply { this.motionType = motionType }

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
         * Optional identifier provided by the record source to indicate the target object of this
         * attitude record. This may be an internal identifier and not necessarily map to a valid
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

        /** Precession period in seconds. */
        fun precPeriod(precPeriod: Double) = precPeriod(JsonField.of(precPeriod))

        /**
         * Sets [Builder.precPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.precPeriod] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun precPeriod(precPeriod: JsonField<Double>) = apply { this.precPeriod = precPeriod }

        /** Quaternion vector component 1. */
        fun q1(q1: Double) = q1(JsonField.of(q1))

        /**
         * Sets [Builder.q1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.q1] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun q1(q1: JsonField<Double>) = apply { this.q1 = q1 }

        /** Derivative of quaternion vector component 1. */
        fun q1Dot(q1Dot: Double) = q1Dot(JsonField.of(q1Dot))

        /**
         * Sets [Builder.q1Dot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.q1Dot] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun q1Dot(q1Dot: JsonField<Double>) = apply { this.q1Dot = q1Dot }

        /** Quaternion vector component 2. */
        fun q2(q2: Double) = q2(JsonField.of(q2))

        /**
         * Sets [Builder.q2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.q2] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun q2(q2: JsonField<Double>) = apply { this.q2 = q2 }

        /** Derivative of quaternion vector component 2. */
        fun q2Dot(q2Dot: Double) = q2Dot(JsonField.of(q2Dot))

        /**
         * Sets [Builder.q2Dot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.q2Dot] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun q2Dot(q2Dot: JsonField<Double>) = apply { this.q2Dot = q2Dot }

        /** Quaternion vector component 3. */
        fun q3(q3: Double) = q3(JsonField.of(q3))

        /**
         * Sets [Builder.q3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.q3] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun q3(q3: JsonField<Double>) = apply { this.q3 = q3 }

        /** Derivative of quaternion vector component 3. */
        fun q3Dot(q3Dot: Double) = q3Dot(JsonField.of(q3Dot))

        /**
         * Sets [Builder.q3Dot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.q3Dot] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun q3Dot(q3Dot: JsonField<Double>) = apply { this.q3Dot = q3Dot }

        /** Quaternion scalar component. */
        fun qc(qc: Double) = qc(JsonField.of(qc))

        /**
         * Sets [Builder.qc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.qc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun qc(qc: JsonField<Double>) = apply { this.qc = qc }

        /** Derivative of quaternion scalar component. */
        fun qcDot(qcDot: Double) = qcDot(JsonField.of(qcDot))

        /**
         * Sets [Builder.qcDot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.qcDot] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun qcDot(qcDot: JsonField<Double>) = apply { this.qcDot = qcDot }

        /** Precession axis right ascension (ECI J2000 frame) in degrees. */
        fun ra(ra: Double) = ra(JsonField.of(ra))

        /**
         * Sets [Builder.ra] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ra] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ra(ra: JsonField<Double>) = apply { this.ra = ra }

        /**
         * Satellite/catalog number of the on-orbit object to which this attitude record applies.
         */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /** Spin period in seconds. */
        fun spinPeriod(spinPeriod: Double) = spinPeriod(JsonField.of(spinPeriod))

        /**
         * Sets [Builder.spinPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spinPeriod] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spinPeriod(spinPeriod: JsonField<Double>) = apply { this.spinPeriod = spinPeriod }

        /**
         * Array of X body rotation Euler angle(s), in degrees (-180 to 180). For repeated axis
         * rotations, the array elements should be placed in the order that the angles apply in the
         * sequence.
         */
        fun xAngle(xAngle: List<Double>) = xAngle(JsonField.of(xAngle))

        /**
         * Sets [Builder.xAngle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xAngle] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun xAngle(xAngle: JsonField<List<Double>>) = apply {
            this.xAngle = xAngle.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.xAngle].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addXAngle(xAngle: Double) = apply {
            this.xAngle =
                (this.xAngle ?: JsonField.of(mutableListOf())).also {
                    checkKnown("xAngle", it).add(xAngle)
                }
        }

        /**
         * Array of X body rotation rate(s), in degrees per second. For repeated axis rotations, the
         * array elements should be placed in the order that the rates apply in the sequence.
         * Attitude rates are expressed in frame1 with respect to frame2.
         */
        fun xRate(xRate: List<Double>) = xRate(JsonField.of(xRate))

        /**
         * Sets [Builder.xRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xRate] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun xRate(xRate: JsonField<List<Double>>) = apply {
            this.xRate = xRate.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.xRate].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addXRate(xRate: Double) = apply {
            this.xRate =
                (this.xRate ?: JsonField.of(mutableListOf())).also {
                    checkKnown("xRate", it).add(xRate)
                }
        }

        /**
         * Array of Y body rotation Euler angle(s), in degrees (-180 to 180). For repeated axis
         * rotations, the array elements should be placed in the order that the angles apply in the
         * sequence.
         */
        fun yAngle(yAngle: List<Double>) = yAngle(JsonField.of(yAngle))

        /**
         * Sets [Builder.yAngle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yAngle] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun yAngle(yAngle: JsonField<List<Double>>) = apply {
            this.yAngle = yAngle.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.yAngle].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addYAngle(yAngle: Double) = apply {
            this.yAngle =
                (this.yAngle ?: JsonField.of(mutableListOf())).also {
                    checkKnown("yAngle", it).add(yAngle)
                }
        }

        /**
         * Array of Y body rotation rate(s), in degrees per second. For repeated axis rotations, the
         * array elements should be placed in the order that the rates apply in the sequence.
         * Attitude rates are expressed in frame1 with respect to frame2.
         */
        fun yRate(yRate: List<Double>) = yRate(JsonField.of(yRate))

        /**
         * Sets [Builder.yRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yRate] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun yRate(yRate: JsonField<List<Double>>) = apply {
            this.yRate = yRate.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.yRate].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addYRate(yRate: Double) = apply {
            this.yRate =
                (this.yRate ?: JsonField.of(mutableListOf())).also {
                    checkKnown("yRate", it).add(yRate)
                }
        }

        /**
         * Array of Z body rotation Euler angle(s), in degrees (-180 to 180). For repeated axis
         * rotations, the array elements should be placed in the order that the angles apply in the
         * sequence.
         */
        fun zAngle(zAngle: List<Double>) = zAngle(JsonField.of(zAngle))

        /**
         * Sets [Builder.zAngle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zAngle] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun zAngle(zAngle: JsonField<List<Double>>) = apply {
            this.zAngle = zAngle.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.zAngle].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addZAngle(zAngle: Double) = apply {
            this.zAngle =
                (this.zAngle ?: JsonField.of(mutableListOf())).also {
                    checkKnown("zAngle", it).add(zAngle)
                }
        }

        /**
         * Array of Z body rotation rate(s), in degrees per second. For repeated axis rotations, the
         * array elements should be placed in the order that the rates apply in the sequence
         * Attitude rates are expressed in frame1 with respect to frame2.
         */
        fun zRate(zRate: List<Double>) = zRate(JsonField.of(zRate))

        /**
         * Sets [Builder.zRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zRate] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun zRate(zRate: JsonField<List<Double>>) = apply {
            this.zRate = zRate.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.zRate].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addZRate(zRate: Double) = apply {
            this.zRate =
                (this.zRate ?: JsonField.of(mutableListOf())).also {
                    checkKnown("zRate", it).add(zRate)
                }
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
         * Returns an immutable instance of [AttitudedataFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * .ts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AttitudedataFull =
            AttitudedataFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                checkRequired("ts", ts),
                id,
                asId,
                coningAngle,
                createdAt,
                createdBy,
                declination,
                idOnOrbit,
                motionType,
                origin,
                origNetwork,
                origObjectId,
                precPeriod,
                q1,
                q1Dot,
                q2,
                q2Dot,
                q3,
                q3Dot,
                qc,
                qcDot,
                ra,
                satNo,
                spinPeriod,
                (xAngle ?: JsonMissing.of()).map { it.toImmutable() },
                (xRate ?: JsonMissing.of()).map { it.toImmutable() },
                (yAngle ?: JsonMissing.of()).map { it.toImmutable() },
                (yRate ?: JsonMissing.of()).map { it.toImmutable() },
                (zAngle ?: JsonMissing.of()).map { it.toImmutable() },
                (zRate ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AttitudedataFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        ts()
        id()
        asId()
        coningAngle()
        createdAt()
        createdBy()
        declination()
        idOnOrbit()
        motionType()
        origin()
        origNetwork()
        origObjectId()
        precPeriod()
        q1()
        q1Dot()
        q2()
        q2Dot()
        q3()
        q3Dot()
        qc()
        qcDot()
        ra()
        satNo()
        spinPeriod()
        xAngle()
        xRate()
        yAngle()
        yRate()
        zAngle()
        zRate()
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
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (asId.asKnown().isPresent) 1 else 0) +
            (if (coningAngle.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (declination.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (motionType.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (precPeriod.asKnown().isPresent) 1 else 0) +
            (if (q1.asKnown().isPresent) 1 else 0) +
            (if (q1Dot.asKnown().isPresent) 1 else 0) +
            (if (q2.asKnown().isPresent) 1 else 0) +
            (if (q2Dot.asKnown().isPresent) 1 else 0) +
            (if (q3.asKnown().isPresent) 1 else 0) +
            (if (q3Dot.asKnown().isPresent) 1 else 0) +
            (if (qc.asKnown().isPresent) 1 else 0) +
            (if (qcDot.asKnown().isPresent) 1 else 0) +
            (if (ra.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (spinPeriod.asKnown().isPresent) 1 else 0) +
            (xAngle.asKnown().getOrNull()?.size ?: 0) +
            (xRate.asKnown().getOrNull()?.size ?: 0) +
            (yAngle.asKnown().getOrNull()?.size ?: 0) +
            (yRate.asKnown().getOrNull()?.size ?: 0) +
            (zAngle.asKnown().getOrNull()?.size ?: 0) +
            (zRate.asKnown().getOrNull()?.size ?: 0)

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

        return other is AttitudedataFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            source == other.source &&
            ts == other.ts &&
            id == other.id &&
            asId == other.asId &&
            coningAngle == other.coningAngle &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            declination == other.declination &&
            idOnOrbit == other.idOnOrbit &&
            motionType == other.motionType &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            precPeriod == other.precPeriod &&
            q1 == other.q1 &&
            q1Dot == other.q1Dot &&
            q2 == other.q2 &&
            q2Dot == other.q2Dot &&
            q3 == other.q3 &&
            q3Dot == other.q3Dot &&
            qc == other.qc &&
            qcDot == other.qcDot &&
            ra == other.ra &&
            satNo == other.satNo &&
            spinPeriod == other.spinPeriod &&
            xAngle == other.xAngle &&
            xRate == other.xRate &&
            yAngle == other.yAngle &&
            yRate == other.yRate &&
            zAngle == other.zAngle &&
            zRate == other.zRate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            source,
            ts,
            id,
            asId,
            coningAngle,
            createdAt,
            createdBy,
            declination,
            idOnOrbit,
            motionType,
            origin,
            origNetwork,
            origObjectId,
            precPeriod,
            q1,
            q1Dot,
            q2,
            q2Dot,
            q3,
            q3Dot,
            qc,
            qcDot,
            ra,
            satNo,
            spinPeriod,
            xAngle,
            xRate,
            yAngle,
            yRate,
            zAngle,
            zRate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AttitudedataFull{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, ts=$ts, id=$id, asId=$asId, coningAngle=$coningAngle, createdAt=$createdAt, createdBy=$createdBy, declination=$declination, idOnOrbit=$idOnOrbit, motionType=$motionType, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, precPeriod=$precPeriod, q1=$q1, q1Dot=$q1Dot, q2=$q2, q2Dot=$q2Dot, q3=$q3, q3Dot=$q3Dot, qc=$qc, qcDot=$qcDot, ra=$ra, satNo=$satNo, spinPeriod=$spinPeriod, xAngle=$xAngle, xRate=$xRate, yAngle=$yAngle, yRate=$yRate, zAngle=$zAngle, zRate=$zRate, additionalProperties=$additionalProperties}"
}
